package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ErrorsSavedSearchForbiddenError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ErrorsSavedSearchForbiddenError {

  @Valid
  private List<@Valid ManagerAccount> allowedAccounts = new ArrayList<>();

  /**
   * Текстовый идентификатор типа ошибки
   */
  public enum TypeEnum {
    SAVED_SEARCHES("saved_searches"),
    
    FORBIDDEN("forbidden"),
    
    OAUTH("oauth");

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
   * Возможные ошибки: * `cant_send_to_yourself` — Нельзя передать сохраненный поиск самому себе * `user_auth_expected` — Передана авторизация приложения, метод требует [авторизации пользователя](#section/Avtorizaciya/Avtorizaciya-polzovatelya) 
   */
  public enum ValueEnum {
    CANT_SEND_TO_YOURSELF("cant_send_to_yourself"),
    
    USER_AUTH_EXPECTED("user_auth_expected");

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

  public ErrorsSavedSearchForbiddenError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ErrorsSavedSearchForbiddenError(TypeEnum type) {
    this.type = type;
  }

  public ErrorsSavedSearchForbiddenError allowedAccounts(List<@Valid ManagerAccount> allowedAccounts) {
    this.allowedAccounts = allowedAccounts;
    return this;
  }

  public ErrorsSavedSearchForbiddenError addAllowedAccountsItem(ManagerAccount allowedAccountsItem) {
    if (this.allowedAccounts == null) {
      this.allowedAccounts = new ArrayList<>();
    }
    this.allowedAccounts.add(allowedAccountsItem);
    return this;
  }

  /**
   * Список доступных для токена аккаунтов менеджера в случае, если используемый рабочий аккаунт заблокирован. Актуально только в случае авторизации работодателя 
   * @return allowedAccounts
  */
  @Valid @Size(min = 1) 
  @Schema(name = "allowed_accounts", description = "Список доступных для токена аккаунтов менеджера в случае, если используемый рабочий аккаунт заблокирован. Актуально только в случае авторизации работодателя ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowed_accounts")
  public List<@Valid ManagerAccount> getAllowedAccounts() {
    return allowedAccounts;
  }

  public void setAllowedAccounts(List<@Valid ManagerAccount> allowedAccounts) {
    this.allowedAccounts = allowedAccounts;
  }

  public ErrorsSavedSearchForbiddenError type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Текстовый идентификатор типа ошибки
   * @return type
  */
  @NotNull 
  @Schema(name = "type", example = "oauth", description = "Текстовый идентификатор типа ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorsSavedSearchForbiddenError value(ValueEnum value) {
    this.value = value;
    return this;
  }

  /**
   * Возможные ошибки: * `cant_send_to_yourself` — Нельзя передать сохраненный поиск самому себе * `user_auth_expected` — Передана авторизация приложения, метод требует [авторизации пользователя](#section/Avtorizaciya/Avtorizaciya-polzovatelya) 
   * @return value
  */
  
  @Schema(name = "value", example = "user_auth_expected", description = "Возможные ошибки: * `cant_send_to_yourself` — Нельзя передать сохраненный поиск самому себе * `user_auth_expected` — Передана авторизация приложения, метод требует [авторизации пользователя](#section/Avtorizaciya/Avtorizaciya-polzovatelya) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ErrorsSavedSearchForbiddenError errorsSavedSearchForbiddenError = (ErrorsSavedSearchForbiddenError) o;
    return Objects.equals(this.allowedAccounts, errorsSavedSearchForbiddenError.allowedAccounts) &&
        Objects.equals(this.type, errorsSavedSearchForbiddenError.type) &&
        Objects.equals(this.value, errorsSavedSearchForbiddenError.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedAccounts, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorsSavedSearchForbiddenError {\n");
    sb.append("    allowedAccounts: ").append(toIndentedString(allowedAccounts)).append("\n");
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

