package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Автор сообщения
 */

@Schema(name = "NegotiationsAuthor", description = "Автор сообщения")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class NegotiationsAuthor {

  private String participantType;

  public NegotiationsAuthor() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NegotiationsAuthor(String participantType) {
    this.participantType = participantType;
  }

  public NegotiationsAuthor participantType(String participantType) {
    this.participantType = participantType;
    return this;
  }

  /**
   * Тип собеседника: `applicant` или `employer`
   * @return participantType
  */
  @NotNull 
  @Schema(name = "participant_type", description = "Тип собеседника: `applicant` или `employer`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("participant_type")
  public String getParticipantType() {
    return participantType;
  }

  public void setParticipantType(String participantType) {
    this.participantType = participantType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiationsAuthor negotiationsAuthor = (NegotiationsAuthor) o;
    return Objects.equals(this.participantType, negotiationsAuthor.participantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participantType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiationsAuthor {\n");
    sb.append("    participantType: ").append(toIndentedString(participantType)).append("\n");
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

