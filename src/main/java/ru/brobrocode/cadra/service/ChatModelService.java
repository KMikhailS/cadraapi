package ru.brobrocode.cadra.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import ru.brobrocode.cadra.dto.ResumeProfileDTO;
import ru.brobrocode.cadra.dto.VacancyItemDTO;

import java.util.regex.Pattern;

@Slf4j
@RequiredArgsConstructor
@Service
public class ChatModelService {

	private final ChatClient chatClient;

	public static final String COVER_LETTER_PROMPT = """
			# Роль
			Я хочу найти работу, в должности %s
			У меня есть такой опыт работы %s
			У меня есть такие навыки %s
			# Задача
			1 Необходимо проанализировать вакансию
			Название вакансии: %s
			Описание вакансии: %s
			2 Необходимо подготовить сопроводительное письмо на вакансию, которое с высокой долей вероятности могло бы заинтересовать работодателя.
			3 Подготовку письма необходимо вести с учетом ниже перечисленных правил ответа.
			# Правила ответа
			- Письмо должно начинаться с фразы Здравствуйте" и далее основной текст письма
			- В письме не нужно использовать символы стандарта markdown и символы "*"
			- В письме должны содержаться конкретные предложения удовлетворяющие запросу вакансии с указанием релевантного опыта
			- Письмо не должно быть длинной более 5000 символов
			- Используй деловой стиль переписки
			- Письмо должно быть лаконично и понятно структурировано
			- Отформатируй красиво текст письма
			- Письмо должно быть в законченном виде
			- Не придумывай никаких данных, используй только данные из резюме и вакансии
			- Подставь в конце письма мои данные: %s %s %s
			""";

	public String getCoverLetter(ResumeProfileDTO resumeProfile, VacancyItemDTO vacancyItem) {
		String prompt = generatePrompt(resumeProfile, vacancyItem);
		Pattern pattern = Pattern.compile("<[^>]*>");
		prompt = pattern.matcher(prompt).replaceAll("");

		String content = chatClient.prompt()
				.user(prompt)
				.call()
				.content();

		if (content != null) {
			return content.replace("*", "");
		}
		return null;
	}

	private String generatePrompt(ResumeProfileDTO resumeProfile, VacancyItemDTO vacancyItem) {
		return String.format(COVER_LETTER_PROMPT,
				resumeProfile.getTitle(),
				resumeProfile.getWorkExperience(),
				resumeProfile.getSkills(),
				vacancyItem.getName(),
				vacancyItem.getDescription(),
				resumeProfile.getName(),
				resumeProfile.getPhone(),
				resumeProfile.getEmail());
	}
}
