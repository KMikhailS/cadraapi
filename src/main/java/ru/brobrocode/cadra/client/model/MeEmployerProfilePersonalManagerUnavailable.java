package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.util.Objects;

/**
 * Информация об отсутствии менеджера, либо &#x60;null&#x60;, если менеджер доступен
 */

@Schema(name = "MeEmployerProfilePersonalManager_unavailable", description = "Информация об отсутствии менеджера, либо `null`, если менеджер доступен")
@JsonTypeName("MeEmployerProfilePersonalManager_unavailable")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MeEmployerProfilePersonalManagerUnavailable {

  private String until;

  public MeEmployerProfilePersonalManagerUnavailable until(String until) {
    this.until = until;
    return this;
  }

  /**
   * Время, до которого менеджер недоступен для контакта
   * @return until
  */
  
  @Schema(name = "until", example = "2016-07-01T08:00:00+0400", description = "Время, до которого менеджер недоступен для контакта", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("until")
  public String getUntil() {
    return until;
  }

  public void setUntil(String until) {
    this.until = until;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeEmployerProfilePersonalManagerUnavailable meEmployerProfilePersonalManagerUnavailable = (MeEmployerProfilePersonalManagerUnavailable) o;
    return Objects.equals(this.until, meEmployerProfilePersonalManagerUnavailable.until);
  }

  @Override
  public int hashCode() {
    return Objects.hash(until);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeEmployerProfilePersonalManagerUnavailable {\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
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

