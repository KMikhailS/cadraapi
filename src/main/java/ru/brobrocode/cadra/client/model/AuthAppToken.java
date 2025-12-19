package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * AuthAppToken
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class AuthAppToken implements AuthUserTokenAndAppToken {

  private String accessToken;

  /**
   * Тип выданного токена. Всегда принимает значение `bearer`
   */
  public enum TokenTypeEnum {
    BEARER("bearer");

    private String value;

    TokenTypeEnum(String value) {
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
    public static TokenTypeEnum fromValue(String value) {
      for (TokenTypeEnum b : TokenTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TokenTypeEnum tokenType;

  public AuthAppToken() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuthAppToken(String accessToken, TokenTypeEnum tokenType) {
    this.accessToken = accessToken;
    this.tokenType = tokenType;
  }

  public AuthAppToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
  */
  @NotNull 
  @Schema(name = "access_token", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AuthAppToken tokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Тип выданного токена. Всегда принимает значение `bearer`
   * @return tokenType
  */
  @NotNull 
  @Schema(name = "token_type", description = "Тип выданного токена. Всегда принимает значение `bearer`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("token_type")
  public TokenTypeEnum getTokenType() {
    return tokenType;
  }

  public void setTokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthAppToken authAppToken = (AuthAppToken) o;
    return Objects.equals(this.accessToken, authAppToken.accessToken) &&
        Objects.equals(this.tokenType, authAppToken.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthAppToken {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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

