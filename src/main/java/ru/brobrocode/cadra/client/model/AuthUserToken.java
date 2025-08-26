package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * AuthUserToken
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class AuthUserToken implements AuthUserTokenAndAppToken {

  private String accessToken;

  private Long expiresIn;

  private String refreshToken;

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

  public AuthUserToken() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuthUserToken(String accessToken, Long expiresIn, String refreshToken, TokenTypeEnum tokenType) {
    this.accessToken = accessToken;
    this.expiresIn = expiresIn;
    this.refreshToken = refreshToken;
    this.tokenType = tokenType;
  }

  public AuthUserToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Токен, который возвращается при условии, если у приложения есть права на создание долгоживущих или короткоживущих токенов 
   * @return accessToken
  */
  @NotNull 
  @Schema(name = "access_token", description = "Токен, который возвращается при условии, если у приложения есть права на создание долгоживущих или короткоживущих токенов ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AuthUserToken expiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Время жизни токена в секундах
   * minimum: 0
   * @return expiresIn
  */
  @NotNull @Min(0L) 
  @Schema(name = "expires_in", description = "Время жизни токена в секундах", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_in")
  public Long getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
  }

  public AuthUserToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Токен, который можно использовать для продления срока жизни соответствующего access токена
   * @return refreshToken
  */
  @NotNull 
  @Schema(name = "refresh_token", description = "Токен, который можно использовать для продления срока жизни соответствующего access токена", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public AuthUserToken tokenType(TokenTypeEnum tokenType) {
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
    AuthUserToken authUserToken = (AuthUserToken) o;
    return Objects.equals(this.accessToken, authUserToken.accessToken) &&
        Objects.equals(this.expiresIn, authUserToken.expiresIn) &&
        Objects.equals(this.refreshToken, authUserToken.refreshToken) &&
        Objects.equals(this.tokenType, authUserToken.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, refreshToken, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthUserToken {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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

