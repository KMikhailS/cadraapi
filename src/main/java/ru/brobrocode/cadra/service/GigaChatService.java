package ru.brobrocode.cadra.service;

import chat.giga.client.GigaChatClient;
import chat.giga.client.auth.AuthClient;
import chat.giga.client.auth.AuthClientBuilder;
import chat.giga.model.ModelName;
import chat.giga.model.Scope;
import chat.giga.model.completion.ChatMessage;
import chat.giga.model.completion.ChatMessageRole;
import chat.giga.model.completion.CompletionRequest;
import chat.giga.model.completion.CompletionResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class GigaChatService {

	public static void main(String[] args) {
		GigaChatClient client = GigaChatClient.builder()
				.verifySslCerts(false)
				.authClient(AuthClient.builder()
						.withOAuth(AuthClientBuilder.OAuthBuilder.builder()
								.scope(Scope.GIGACHAT_API_PERS)
								.authKey("MTNiYjk1MzctNzA4YS00N2QzLTk4NmUtNzNiMDc1MTZmZDkyOjUyMTIyYTMzLWRhODQtNGYzZC1hOWQyLWI1ZTgzOGY3MjFlZA==")
								.build())
						.build())
				.build();

//		String prompt = generateCoverLetterPrompt();
		String prompt = "prompt";
		Pattern pattern = Pattern.compile("<[^>]*>");
		prompt = pattern.matcher(prompt).replaceAll("");

		CompletionResponse completions = client.completions(CompletionRequest.builder()
				.model(ModelName.GIGA_CHAT_2)
				.message(ChatMessage.builder()
						.content(prompt)
						.role(ChatMessageRole.USER)
						.build())
				.build());
		if (completions.choices() != null && !completions.choices().isEmpty()) {
			String content = completions.choices().getFirst().message().content();
			System.out.println(content);
		}
	}

//	private static String generateCoverLetterPrompt() {
//		ResumeProfileDTO profile = new ResumeProfileDTO();
//		profile.setTitle("Программист Java");
//		profile.setArea("Челябинск");
//		profile.setEmploymentForm("Постоянная работа");
//		profile.setWorkFormat("На месте работодателя;Удаленно");
//
//		List<WorkExperience> experienceList = new ArrayList<>();
//		WorkExperience workExperience = new WorkExperience();
//		workExperience.setCompany("Совкомбанк Технологии");
//		workExperience.setStart("2023-12-01");
//		workExperience.setEnd(null);
//		workExperience.setDescription("Разработка серверной бизнес логики.\nРазработка публичного API.\nРефакторинг существующего и ревью нового кода.\nМиграция легаси кода на \"микросервисы\".");
//		workExperience.setPosition("Java-разработчик");
//		WorkExperience workExperience2 = new WorkExperience();
//		workExperience2.setCompany("ООО Облачные решения");
//		workExperience2.setStart("2020-09-01");
//		workExperience2.setEnd("2023-12-01");
//		workExperience2.setDescription("Микросервисная архитектура.\nspring boot, hebirnate, gradle, spock, groovy");
//		workExperience2.setPosition("Java-разработчик");
//		experienceList.add(workExperience);
//		experienceList.add(workExperience2);
//		profile.setExperienceList(experienceList);
//
//		List<LanguageDTO> languageList = new ArrayList<>();
//		LanguageDTO language1 = new LanguageDTO();
//		language1.setName("Русский");
//		language1.setLevel("Родной");
//		LanguageDTO language2 = new LanguageDTO();
//		language2.setName("Английский");
//		language2.setLevel("B2 — Средне-продвинутый");
//		languageList.add(language1);
//		languageList.add(language2);
//		profile.setLanguageList(languageList);
//
//		List<String> skills = new ArrayList<>();
//		skills.add("Исполнительность");
//		skills.add("Java");
//		skills.add("SQL");
//		skills.add("Spring Framework");
//		skills.add("Git");
//		skills.add("Hibernate ORM");
//		skills.add("Linux");
//		skills.add("Обучение персонала");
//		skills.add("Kafka");
//		skills.add("Docker");
//		skills.add("Intellij IDEA");
//		skills.add("Jenkins");
//		skills.add("Kubernetes");
//		profile.setSkills(skills);
//
//		VacancyDTO vacancy = new VacancyDTO();
//		vacancy.setName("Java-разработчик");
//		vacancy.setArea("Москва");
//		vacancy.setExperience("Более 6 лет");
//		vacancy.setSchedule("Удаленная работа");
//		vacancy.setEmployment("Полная занятость");
//		vacancy.setDescription("<p><strong>Обязанности:</strong></p> <ul> <li> <p>Участвовать в проектировании и разработке производительных решений;</p> </li> <li> <p>Работать с базами данных и встраивать внешние сервисы в архитектуру;</p> </li> <li> <p>Оптимизировать код, улучшать модули и обсуждать решения на код-ревью;</p> </li> <li> <p>Взаимодействовать с командами смежных направлений.</p> </li> </ul> <p><strong>Требования:</strong></p> <ul> <li>Коммерческий опыт работы Java-разработчиком от 6-ти лет;</li> <li>Умение писать эффективные и оптимизированные алгоритмы;</li> <li>Опыт интеграции с системами и работы с базами данных;</li> <li>Навыки коммуникации и работы в команде.</li> </ul> <p><strong>Условия и преимущества:</strong></p> <ul> <li>Работа в дружной команде профессионалов.</li> <li>Официальное оформление в аккредитованной IT компании.</li> <li>Различные скидки от партнеров и ДМС.</li> <li>Возможность изучения английского языка.</li> <li>Гибкий график работы: удаленно или в гибридном формате.</li> </ul>");
//		vacancy.setPosition("Программист, разработчик");
//		vacancy.setWorkFormat("Удалённо;Гибрид");
//
//		StringBuilder experienceBuilder = new StringBuilder();
//		for (WorkExperience experience : experienceList) {
//			experienceBuilder.append("Компания ").append(experience.getCompany());
//			experienceBuilder.append("\n");
//			experienceBuilder.append("Период работы с ").append(experience.getStart()).append(" по ").append(experience.getEnd() == null ? "настоящее время" : experience.getEnd());
//			experienceBuilder.append("\n");
//			experienceBuilder.append("Должность ").append(experience.getPosition());
//			experienceBuilder.append("\n");
//			experienceBuilder.append("Обязанности ").append(experience.getDescription());
//			experienceBuilder.append("\n");
//		}
//		StringBuilder languageBuilder = new StringBuilder();
//		for (LanguageDTO language : languageList) {
//			languageBuilder.append(language.getName()).append(" - ").append(language.getLevel()).append("\n");
//		}
//		StringBuilder skillBuilder = new StringBuilder();
//		for (String skill : skills) {
//			skillBuilder.append(skill).append(";");
//		}
//
//		public static final String COVER_LETTER_PROMPT = """
//			# Роль
//			Я хочу найти работу, в должности %s
//			# Задача
//			1 Необходимо проанализировать вакансию
//			Название вакансии: %s
//			Описание вакансии: %s
//			Зону ответственности специалиста: %s
//			2 Необходимо подготовить сопроводительное письмо на вакансию, которое с высокой долей вероятности могло бы заинтересовать работодателя.
//			3 Подготовку письма необхождимо вести с учетом ниже перечисленных правил ответа.
//			# Правила ответа
//			- Письмо должно начинаться с фразы Здравствуйте" и далее основной текст письма
//			- В письме не нужно использовать символы стандарта markdown и символы "*"
//			- В письме должны содержаться конкретные предложения удовлетворяющие запросу вакансии с указанием релевантного опыта
//			- Письмо не должно быть длинной более 5000 символов
//			- Используй деловой стиль переписки
//			- Письмо должно быть лаконично и понятно структурировано
//			- Отформатируй красиво текст письма
//			- Письмо должно быть в законченном виде
//			- Не придумывай никаких данных, используй только данные из резюме и вакансии
//			- Подставь в конце письма мои данные: %s %s
//			""";
//
//		return String.format(COVER_LETTER_PROMPT,
//				profile.getTitle(),
//				vacancy.getName(),
//				vacancy.getDescription(),
//				vacancy.getPosition(),
//				"Кривощапов Михаил",
//				"kmikhails@yandex.ru");
//	}
}
