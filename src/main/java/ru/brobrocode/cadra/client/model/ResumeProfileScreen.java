package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.*;

/**
 * Информация о профиле для соискателя
 */

@Schema(name = "ResumeProfileScreen", description = "Информация о профиле для соискателя")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeProfileScreen {

  @Valid
  private Map<String, ResumeProfileScreenFieldsOptionsValue> fieldsOptions = new HashMap<>();

  @Valid
  private Map<String, List<@Valid ResumeProfileScreenMessagesValueInner>> messages = new HashMap<>();

  @Valid
  private List<@Valid ResumeProfileScreenScreenContentInner> screenContent = new ArrayList<>();

  private String screenId;

  /**
   * Ссылка на профиль или идентификатор
   */
  public enum ScreenTypeEnum {
    STATIC("static"),
    
    DYNAMIC("dynamic");

    private String value;

    ScreenTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScreenTypeEnum fromValue(String value) {
      for (ScreenTypeEnum b : ScreenTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ScreenTypeEnum screenType;

  private String title;

  public ResumeProfileScreen() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeProfileScreen(String screenId, ScreenTypeEnum screenType) {
    this.screenId = screenId;
    this.screenType = screenType;
  }

  public ResumeProfileScreen fieldsOptions(Map<String, ResumeProfileScreenFieldsOptionsValue> fieldsOptions) {
    this.fieldsOptions = fieldsOptions;
    return this;
  }

  public ResumeProfileScreen putFieldsOptionsItem(String key, ResumeProfileScreenFieldsOptionsValue fieldsOptionsItem) {
    if (this.fieldsOptions == null) {
      this.fieldsOptions = new HashMap<>();
    }
    this.fieldsOptions.put(key, fieldsOptionsItem);
    return this;
  }

  /**
   * Параметры полей привязанных к этому экрану
   * @return fieldsOptions
  */
  @Valid 
  @Schema(name = "fields_options", description = "Параметры полей привязанных к этому экрану", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields_options")
  public Map<String, ResumeProfileScreenFieldsOptionsValue> getFieldsOptions() {
    return fieldsOptions;
  }

  public void setFieldsOptions(Map<String, ResumeProfileScreenFieldsOptionsValue> fieldsOptions) {
    this.fieldsOptions = fieldsOptions;
  }

  public ResumeProfileScreen messages(Map<String, List<@Valid ResumeProfileScreenMessagesValueInner>> messages) {
    this.messages = messages;
    return this;
  }

  public ResumeProfileScreen putMessagesItem(String key, List<@Valid ResumeProfileScreenMessagesValueInner> messagesItem) {
    if (this.messages == null) {
      this.messages = new HashMap<>();
    }
    this.messages.put(key, messagesItem);
    return this;
  }

  /**
   * Сообщения, которые показываются на этом экране
   * @return messages
  */
  @Valid 
  @Schema(name = "messages", description = "Сообщения, которые показываются на этом экране", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messages")
  public Map<String, List<@Valid ResumeProfileScreenMessagesValueInner>> getMessages() {
    return messages;
  }

  public void setMessages(Map<String, List<@Valid ResumeProfileScreenMessagesValueInner>> messages) {
    this.messages = messages;
  }

  public ResumeProfileScreen screenContent(List<@Valid ResumeProfileScreenScreenContentInner> screenContent) {
    this.screenContent = screenContent;
    return this;
  }

  public ResumeProfileScreen addScreenContentItem(ResumeProfileScreenScreenContentInner screenContentItem) {
    if (this.screenContent == null) {
      this.screenContent = new ArrayList<>();
    }
    this.screenContent.add(screenContentItem);
    return this;
  }

  /**
   * Информация о том что нужно отобразить на данном экране (Актуально только для динамического экрана)
   * @return screenContent
  */
  @Valid 
  @Schema(name = "screen_content", description = "Информация о том что нужно отобразить на данном экране (Актуально только для динамического экрана)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("screen_content")
  public List<@Valid ResumeProfileScreenScreenContentInner> getScreenContent() {
    return screenContent;
  }

  public void setScreenContent(List<@Valid ResumeProfileScreenScreenContentInner> screenContent) {
    this.screenContent = screenContent;
  }

  public ResumeProfileScreen screenId(String screenId) {
    this.screenId = screenId;
    return this;
  }

  /**
   * Уникальный идентификатор для экрана. Для статических он предзадан у клиентов, для динамических генерируется  на сервере
   * @return screenId
  */
  @NotNull 
  @Schema(name = "screen_id", description = "Уникальный идентификатор для экрана. Для статических он предзадан у клиентов, для динамических генерируется  на сервере", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("screen_id")
  public String getScreenId() {
    return screenId;
  }

  public void setScreenId(String screenId) {
    this.screenId = screenId;
  }

  public ResumeProfileScreen screenType(ScreenTypeEnum screenType) {
    this.screenType = screenType;
    return this;
  }

  /**
   * Ссылка на профиль или идентификатор
   * @return screenType
  */
  @NotNull 
  @Schema(name = "screen_type", description = "Ссылка на профиль или идентификатор", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("screen_type")
  public ScreenTypeEnum getScreenType() {
    return screenType;
  }

  public void setScreenType(ScreenTypeEnum screenType) {
    this.screenType = screenType;
  }

  public ResumeProfileScreen title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Заголовок экрана
   * @return title
  */
  
  @Schema(name = "title", description = "Заголовок экрана", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeProfileScreen resumeProfileScreen = (ResumeProfileScreen) o;
    return Objects.equals(this.fieldsOptions, resumeProfileScreen.fieldsOptions) &&
        Objects.equals(this.messages, resumeProfileScreen.messages) &&
        Objects.equals(this.screenContent, resumeProfileScreen.screenContent) &&
        Objects.equals(this.screenId, resumeProfileScreen.screenId) &&
        Objects.equals(this.screenType, resumeProfileScreen.screenType) &&
        Objects.equals(this.title, resumeProfileScreen.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldsOptions, messages, screenContent, screenId, screenType, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeProfileScreen {\n");
    sb.append("    fieldsOptions: ").append(toIndentedString(fieldsOptions)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    screenContent: ").append(toIndentedString(screenContent)).append("\n");
    sb.append("    screenId: ").append(toIndentedString(screenId)).append("\n");
    sb.append("    screenType: ").append(toIndentedString(screenType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

