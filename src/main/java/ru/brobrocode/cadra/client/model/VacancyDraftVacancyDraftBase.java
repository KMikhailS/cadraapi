package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VacancyDraftVacancyDraftBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftVacancyDraftBase {

  private VacancyDraftAutoPublicationState autoPublication = null;

  private BigDecimal completedFieldsPercentage;

  private String draftId;

  @Valid
  private List<@Valid VacancyDraftPublications> insufficientPublications;

  @Valid
  private List<@Valid VacancyDraftPublications> insufficientQuotas;

  private String lastChangeTime = null;

  private Boolean publicationReady;

  @Valid
  private List<@Valid VacancyDraftPublications> requiredPublications;

  private String scheduledAt;

  public VacancyDraftVacancyDraftBase() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftVacancyDraftBase(BigDecimal completedFieldsPercentage, String draftId, Boolean publicationReady, String scheduledAt) {
    this.completedFieldsPercentage = completedFieldsPercentage;
    this.draftId = draftId;
    this.publicationReady = publicationReady;
    this.scheduledAt = scheduledAt;
  }

  public VacancyDraftVacancyDraftBase autoPublication(VacancyDraftAutoPublicationState autoPublication) {
    this.autoPublication = autoPublication;
    return this;
  }

  /**
   * Get autoPublication
   * @return autoPublication
  */
  @Valid 
  @Schema(name = "auto_publication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_publication")
  public VacancyDraftAutoPublicationState getAutoPublication() {
    return autoPublication;
  }

  public void setAutoPublication(VacancyDraftAutoPublicationState autoPublication) {
    this.autoPublication = autoPublication;
  }

  public VacancyDraftVacancyDraftBase completedFieldsPercentage(BigDecimal completedFieldsPercentage) {
    this.completedFieldsPercentage = completedFieldsPercentage;
    return this;
  }

  /**
   * Процент заполнения черновика
   * @return completedFieldsPercentage
  */
  @NotNull @Valid 
  @Schema(name = "completed_fields_percentage", description = "Процент заполнения черновика", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("completed_fields_percentage")
  public BigDecimal getCompletedFieldsPercentage() {
    return completedFieldsPercentage;
  }

  public void setCompletedFieldsPercentage(BigDecimal completedFieldsPercentage) {
    this.completedFieldsPercentage = completedFieldsPercentage;
  }

  public VacancyDraftVacancyDraftBase draftId(String draftId) {
    this.draftId = draftId;
    return this;
  }

  /**
   * Идентификатор черновика
   * @return draftId
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "draft_id", description = "Идентификатор черновика", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("draft_id")
  public String getDraftId() {
    return draftId;
  }

  public void setDraftId(String draftId) {
    this.draftId = draftId;
  }

  public VacancyDraftVacancyDraftBase insufficientPublications(List<@Valid VacancyDraftPublications> insufficientPublications) {
    this.insufficientPublications = insufficientPublications;
    return this;
  }

  public VacancyDraftVacancyDraftBase addInsufficientPublicationsItem(VacancyDraftPublications insufficientPublicationsItem) {
    if (this.insufficientPublications == null) {
      this.insufficientPublications = new ArrayList<>();
    }
    this.insufficientPublications.add(insufficientPublicationsItem);
    return this;
  }

  /**
   * Массив объектов с информацией о том, каких публикаций не хватает на счету для публикации вакансии из данного черновика
   * @return insufficientPublications
  */
  @Valid 
  @Schema(name = "insufficient_publications", description = "Массив объектов с информацией о том, каких публикаций не хватает на счету для публикации вакансии из данного черновика", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insufficient_publications")
  public List<@Valid VacancyDraftPublications> getInsufficientPublications() {
    return insufficientPublications;
  }

  public void setInsufficientPublications(List<@Valid VacancyDraftPublications> insufficientPublications) {
    this.insufficientPublications = insufficientPublications;
  }

  public VacancyDraftVacancyDraftBase insufficientQuotas(List<@Valid VacancyDraftPublications> insufficientQuotas) {
    this.insufficientQuotas = insufficientQuotas;
    return this;
  }

  public VacancyDraftVacancyDraftBase addInsufficientQuotasItem(VacancyDraftPublications insufficientQuotasItem) {
    if (this.insufficientQuotas == null) {
      this.insufficientQuotas = new ArrayList<>();
    }
    this.insufficientQuotas.add(insufficientQuotasItem);
    return this;
  }

  /**
   * Массив объектов с информацией о том, какие квоты превышены
   * @return insufficientQuotas
  */
  @Valid 
  @Schema(name = "insufficient_quotas", description = "Массив объектов с информацией о том, какие квоты превышены", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insufficient_quotas")
  public List<@Valid VacancyDraftPublications> getInsufficientQuotas() {
    return insufficientQuotas;
  }

  public void setInsufficientQuotas(List<@Valid VacancyDraftPublications> insufficientQuotas) {
    this.insufficientQuotas = insufficientQuotas;
  }

  public VacancyDraftVacancyDraftBase lastChangeTime(String lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
    return this;
  }

  /**
   * Время изменения черновика (в формате [ISO 8601](https://ru.wikipedia.org/wiki/ISO_8601) с точностью до секунды `YYYY-MM-DDThh:mm:ss±hhmm`)
   * @return lastChangeTime
  */
  
  @Schema(name = "last_change_time", description = "Время изменения черновика (в формате [ISO 8601](https://ru.wikipedia.org/wiki/ISO_8601) с точностью до секунды `YYYY-MM-DDThh:mm:ss±hhmm`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_change_time")
  public String getLastChangeTime() {
    return lastChangeTime;
  }

  public void setLastChangeTime(String lastChangeTime) {
    this.lastChangeTime = lastChangeTime;
  }

  public VacancyDraftVacancyDraftBase publicationReady(Boolean publicationReady) {
    this.publicationReady = publicationReady;
    return this;
  }

  /**
   * Готовность черновика к публикации
   * @return publicationReady
  */
  @NotNull 
  @Schema(name = "publication_ready", description = "Готовность черновика к публикации", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("publication_ready")
  public Boolean getPublicationReady() {
    return publicationReady;
  }

  public void setPublicationReady(Boolean publicationReady) {
    this.publicationReady = publicationReady;
  }

  public VacancyDraftVacancyDraftBase requiredPublications(List<@Valid VacancyDraftPublications> requiredPublications) {
    this.requiredPublications = requiredPublications;
    return this;
  }

  public VacancyDraftVacancyDraftBase addRequiredPublicationsItem(VacancyDraftPublications requiredPublicationsItem) {
    if (this.requiredPublications == null) {
      this.requiredPublications = new ArrayList<>();
    }
    this.requiredPublications.add(requiredPublicationsItem);
    return this;
  }

  /**
   * Массив объектов с информацией о необходимых публикациях на счету
   * @return requiredPublications
  */
  @Valid 
  @Schema(name = "required_publications", description = "Массив объектов с информацией о необходимых публикациях на счету", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("required_publications")
  public List<@Valid VacancyDraftPublications> getRequiredPublications() {
    return requiredPublications;
  }

  public void setRequiredPublications(List<@Valid VacancyDraftPublications> requiredPublications) {
    this.requiredPublications = requiredPublications;
  }

  public VacancyDraftVacancyDraftBase scheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * Время запланированной публикации вакансии (в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`
   * @return scheduledAt
  */
  @NotNull @Pattern(regexp = "^\\d{4}-[01]\\d-[0-3]\\dT[0-2]\\d:[0-5]\\d:[0-5]\\d(?:\\.\\d+)?((\\+|-)[0-1][0-9]{3})?$") 
  @Schema(name = "scheduled_at", description = "Время запланированной публикации вакансии (в формате [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) с точностью до секунды: `YYYY-MM-DDThh:mm:ss±hhmm`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scheduled_at")
  public String getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftVacancyDraftBase vacancyDraftVacancyDraftBase = (VacancyDraftVacancyDraftBase) o;
    return Objects.equals(this.autoPublication, vacancyDraftVacancyDraftBase.autoPublication) &&
        Objects.equals(this.completedFieldsPercentage, vacancyDraftVacancyDraftBase.completedFieldsPercentage) &&
        Objects.equals(this.draftId, vacancyDraftVacancyDraftBase.draftId) &&
        Objects.equals(this.insufficientPublications, vacancyDraftVacancyDraftBase.insufficientPublications) &&
        Objects.equals(this.insufficientQuotas, vacancyDraftVacancyDraftBase.insufficientQuotas) &&
        Objects.equals(this.lastChangeTime, vacancyDraftVacancyDraftBase.lastChangeTime) &&
        Objects.equals(this.publicationReady, vacancyDraftVacancyDraftBase.publicationReady) &&
        Objects.equals(this.requiredPublications, vacancyDraftVacancyDraftBase.requiredPublications) &&
        Objects.equals(this.scheduledAt, vacancyDraftVacancyDraftBase.scheduledAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoPublication, completedFieldsPercentage, draftId, insufficientPublications, insufficientQuotas, lastChangeTime, publicationReady, requiredPublications, scheduledAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftVacancyDraftBase {\n");
    sb.append("    autoPublication: ").append(toIndentedString(autoPublication)).append("\n");
    sb.append("    completedFieldsPercentage: ").append(toIndentedString(completedFieldsPercentage)).append("\n");
    sb.append("    draftId: ").append(toIndentedString(draftId)).append("\n");
    sb.append("    insufficientPublications: ").append(toIndentedString(insufficientPublications)).append("\n");
    sb.append("    insufficientQuotas: ").append(toIndentedString(insufficientQuotas)).append("\n");
    sb.append("    lastChangeTime: ").append(toIndentedString(lastChangeTime)).append("\n");
    sb.append("    publicationReady: ").append(toIndentedString(publicationReady)).append("\n");
    sb.append("    requiredPublications: ").append(toIndentedString(requiredPublications)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
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

