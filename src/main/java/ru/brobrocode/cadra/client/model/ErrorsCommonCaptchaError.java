package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * ErrorsCommonCaptchaError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsCommonCaptchaError {

  private String captchaUrl;

  private String fallbackUrl;

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    CAPTCHA_REQUIRED("captcha_required"),
    
    EMPLOYER_REGISTRATION_CHANGE_EMAIL("employer_registration_change_email"),
    
    EMPLOYER_RESUME_VIEW("employer_resume_view");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  /**
   * Необходимо пройти капчу - `captcha_required` 
   */
  public enum ValueEnum {
    CAPTCHA_REQUIRED("captcha_required");

    private String value;

    ValueEnum(String value) {
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
    public static ValueEnum fromValue(String value) {
      for (ValueEnum b : ValueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ValueEnum value;

  public ErrorsCommonCaptchaError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsCommonCaptchaError(TypeEnum type, ValueEnum value) {
    this.type = type;
    this.value = value;
  }

  public ErrorsCommonCaptchaError captchaUrl(String captchaUrl) {
    this.captchaUrl = captchaUrl;
    return this;
  }

  /**
   * Адрес веб-страницы, на которой можно пройти капчу.  После прохождения капчи аналогичный запрос в API должен выполниться успешно.  Приложение должно добавить в captcha_url обязательный параметр backurl,на который произойдет редирект   после прохождения капчи.  Backurl должен обязательно содержать схему, например, https:// или схему приложения 
   * @return captchaUrl
  */
  
  @Schema(name = "captcha_url", example = "https://hh.ru/account/captcha?state=...", description = "Адрес веб-страницы, на которой можно пройти капчу.  После прохождения капчи аналогичный запрос в API должен выполниться успешно.  Приложение должно добавить в captcha_url обязательный параметр backurl,на который произойдет редирект   после прохождения капчи.  Backurl должен обязательно содержать схему, например, https:// или схему приложения ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("captcha_url")
  public String getCaptchaUrl() {
    return captchaUrl;
  }

  public void setCaptchaUrl(String captchaUrl) {
    this.captchaUrl = captchaUrl;
  }

  public ErrorsCommonCaptchaError fallbackUrl(String fallbackUrl) {
    this.fallbackUrl = fallbackUrl;
    return this;
  }

  /**
   * Адрес веб-страницы, на котором можно капчу. Аналогично параметру captcha_url
   * @return fallbackUrl
  */
  
  @Schema(name = "fallback_url", example = "https://hh.ru/auth/employer?captcha=true&backurl=...", description = "Адрес веб-страницы, на котором можно капчу. Аналогично параметру captcha_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fallback_url")
  public String getFallbackUrl() {
    return fallbackUrl;
  }

  public void setFallbackUrl(String fallbackUrl) {
    this.fallbackUrl = fallbackUrl;
  }

  public ErrorsCommonCaptchaError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "captcha_required", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsCommonCaptchaError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Необходимо пройти капчу - `captcha_required` 
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "captcha_required", description = "Необходимо пройти капчу - `captcha_required` ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public ValueEnum getValue() {
    return value;
  }

  public void setValue(ValueEnum value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorsCommonCaptchaError errorsCommonCaptchaError = (ErrorsCommonCaptchaError) o;
    return Objects.equals(this.captchaUrl, errorsCommonCaptchaError.captchaUrl) &&
        Objects.equals(this.fallbackUrl, errorsCommonCaptchaError.fallbackUrl) &&
        Objects.equals(this.type, errorsCommonCaptchaError.type) &&
        Objects.equals(this.value, errorsCommonCaptchaError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captchaUrl, fallbackUrl, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsCommonCaptchaError {\n");
    sb.append("    captchaUrl: ").append(toIndentedString(captchaUrl)).append("\n");
    sb.append("    fallbackUrl: ").append(toIndentedString(fallbackUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

