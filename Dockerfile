# Dockerfile
FROM gradle:8.5-jdk21-alpine AS build

WORKDIR /app

# Копируем файлы сборки
COPY build.gradle gradle.properties settings.gradle ./
COPY gradle ./gradle

# Копируем исходный код
COPY src ./src

# Собираем приложение
RUN gradle clean build --no-daemon --no-watch-fs

# Финальный образ
FROM openjdk:21-jdk-slim

WORKDIR /app

# Создаем пользователя для безопасности
RUN groupadd -r cadra && useradd -r -g cadra cadra

# Копируем собранный jar из стадии сборки
COPY --from=build /app/build/libs/*.jar app.jar

# Создаем директорию для логов
RUN mkdir -p /app/logs && chown -R cadra:cadra /app

# Переключаемся на non-root пользователя
USER cadra

# Открываем порт
EXPOSE 8080

# Настройки JVM для контейнера
ENV JAVA_OPTS="-Xmx512m -Xms256m -XX:+UseG1GC -XX:+UseContainerSupport"

# Healthcheck
HEALTHCHECK --interval=30s --timeout=10s --start-period=60s --retries=3 \
  CMD curl -f http://localhost:8080/actuator/health || exit 1

# Запуск приложения
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]