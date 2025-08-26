package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Тип видимости резюме
 */

@Schema(name = "ResumeObjectsAccess", description = "Тип видимости резюме")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ResumeObjectsAccess {

  private IncludesIdName type;

  public ResumeObjectsAccess() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResumeObjectsAccess(IncludesIdName type) {
    this.type = type;
  }

  public ResumeObjectsAccess type(IncludesIdName type) {
    this.type = type;
    return this;
  }

  /**
   * Определяет, кому будет доступно резюме в поиске и по прямой ссылке.  Установить значение параметра можно при [создании](#tag/Rezyume.-Sozdanie-i-obnovlenie/operation/create-resume) или [редактировании](#tag/Rezyume.-Sozdanie-i-obnovlenie/operation/edit-resume) резюме. Возможные значения приведены в поле `resume_access_type` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries).  С 1 сентября 2021 года тип видимости `everyone` стал недоступен для сохранения из-за законодательных ограничений.  Чтобы управлять списком работодателей, которые могут просматривать резюме, воспользуйтесь группой методов [Резюме. Списки видимости](#tag/Rezyume.-Spiski-vidimosti) 
   * @return type
  */
  @NotNull @Valid 
  @Schema(name = "type", description = "Определяет, кому будет доступно резюме в поиске и по прямой ссылке.  Установить значение параметра можно при [создании](#tag/Rezyume.-Sozdanie-i-obnovlenie/operation/create-resume) или [редактировании](#tag/Rezyume.-Sozdanie-i-obnovlenie/operation/edit-resume) резюме. Возможные значения приведены в поле `resume_access_type` [справочника полей](#tag/Obshie-spravochniki/operation/get-dictionaries).  С 1 сентября 2021 года тип видимости `everyone` стал недоступен для сохранения из-за законодательных ограничений.  Чтобы управлять списком работодателей, которые могут просматривать резюме, воспользуйтесь группой методов [Резюме. Списки видимости](#tag/Rezyume.-Spiski-vidimosti) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public IncludesIdName getType() {
    return type;
  }

  public void setType(IncludesIdName type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeObjectsAccess resumeObjectsAccess = (ResumeObjectsAccess) o;
    return Objects.equals(this.type, resumeObjectsAccess.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeObjectsAccess {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

