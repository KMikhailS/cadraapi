package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Замечания модератора.  В некоторых случаях замечания могут сопровождаться [блокировкой резюме](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume).  Полный список возможных замечаний доступен в поле &#x60;resume_moderation_note&#x60; [в справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries) 
 */

@Schema(name = "ResumeObjectsModerationNote", description = "Замечания модератора.  В некоторых случаях замечания могут сопровождаться [блокировкой резюме](#tag/Rezyume.-Prosmotr-informacii/Status-rezyume).  Полный список возможных замечаний доступен в поле `resume_moderation_note` [в справочнике полей](#tag/Obshie-spravochniki/operation/get-dictionaries) ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsModerationNote {

  private String field;

  private String id;

  private String name;

  private String pointer;

  public ResumeObjectsModerationNote() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsModerationNote(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public ResumeObjectsModerationNote field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Поле резюме с которым связано замечание
   * @return field
  */
  
  @Schema(name = "field", description = "Поле резюме с которым связано замечание", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ResumeObjectsModerationNote id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор замечания
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор замечания", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumeObjectsModerationNote name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Описание замечания
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Описание замечания", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumeObjectsModerationNote pointer(String pointer) {
    this.pointer = pointer;
    return this;
  }

  /**
   * Путь до параметра, с которым связано замечание
   * @return pointer
  */
  
  @Schema(name = "pointer", description = "Путь до параметра, с которым связано замечание", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointer")
  public String getPointer() {
    return pointer;
  }

  public void setPointer(String pointer) {
    this.pointer = pointer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsModerationNote resumeObjectsModerationNote = (ResumeObjectsModerationNote) o;
    return Objects.equals(this.field, resumeObjectsModerationNote.field) &&
        Objects.equals(this.id, resumeObjectsModerationNote.id) &&
        Objects.equals(this.name, resumeObjectsModerationNote.name) &&
        Objects.equals(this.pointer, resumeObjectsModerationNote.pointer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, id, name, pointer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsModerationNote {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
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

