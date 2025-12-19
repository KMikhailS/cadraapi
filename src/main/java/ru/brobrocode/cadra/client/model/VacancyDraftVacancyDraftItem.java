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
 * VacancyDraftVacancyDraftItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class VacancyDraftVacancyDraftItem {

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

  @Valid
  private List<@Valid VacancyAreaOutput> areas = new ArrayList<>();

  private VacancyDraftAssignedManager assignedManager = null;

  private VacancyBillingTypeOutput billingType = null;

  private String name;

  @Deprecated
  private String publicationType;

  private String url;

  private VacancyDraftVacancyProperties vacancyProperties = null;

  private String vacancyType = null;

  public VacancyDraftVacancyDraftItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VacancyDraftVacancyDraftItem(BigDecimal completedFieldsPercentage, String draftId, Boolean publicationReady, String scheduledAt, List<@Valid VacancyAreaOutput> areas, VacancyBillingTypeOutput billingType, String publicationType, String url, String vacancyType) {
    this.completedFieldsPercentage = completedFieldsPercentage;
    this.draftId = draftId;
    this.publicationReady = publicationReady;
    this.scheduledAt = scheduledAt;
    this.areas = areas;
    this.billingType = billingType;
    this.publicationType = publicationType;
    this.url = url;
    this.vacancyType = vacancyType;
  }

  public VacancyDraftVacancyDraftItem autoPublication(VacancyDraftAutoPublicationState autoPublication) {
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

  public VacancyDraftVacancyDraftItem completedFieldsPercentage(BigDecimal completedFieldsPercentage) {
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

  public VacancyDraftVacancyDraftItem draftId(String draftId) {
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

  public VacancyDraftVacancyDraftItem insufficientPublications(List<@Valid VacancyDraftPublications> insufficientPublications) {
    this.insufficientPublications = insufficientPublications;
    return this;
  }

  public VacancyDraftVacancyDraftItem addInsufficientPublicationsItem(VacancyDraftPublications insufficientPublicationsItem) {
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

  public VacancyDraftVacancyDraftItem insufficientQuotas(List<@Valid VacancyDraftPublications> insufficientQuotas) {
    this.insufficientQuotas = insufficientQuotas;
    return this;
  }

  public VacancyDraftVacancyDraftItem addInsufficientQuotasItem(VacancyDraftPublications insufficientQuotasItem) {
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

  public VacancyDraftVacancyDraftItem lastChangeTime(String lastChangeTime) {
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

  public VacancyDraftVacancyDraftItem publicationReady(Boolean publicationReady) {
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

  public VacancyDraftVacancyDraftItem requiredPublications(List<@Valid VacancyDraftPublications> requiredPublications) {
    this.requiredPublications = requiredPublications;
    return this;
  }

  public VacancyDraftVacancyDraftItem addRequiredPublicationsItem(VacancyDraftPublications requiredPublicationsItem) {
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

  public VacancyDraftVacancyDraftItem scheduledAt(String scheduledAt) {
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

  public VacancyDraftVacancyDraftItem areas(List<@Valid VacancyAreaOutput> areas) {
    this.areas = areas;
    return this;
  }

  public VacancyDraftVacancyDraftItem addAreasItem(VacancyAreaOutput areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<>();
    }
    this.areas.add(areasItem);
    return this;
  }

  /**
   * Коды и названия регионов (фед. округа, субъекты федерации, города)
   * @return areas
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "areas", description = "Коды и названия регионов (фед. округа, субъекты федерации, города)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("areas")
  public List<@Valid VacancyAreaOutput> getAreas() {
    return areas;
  }

  public void setAreas(List<@Valid VacancyAreaOutput> areas) {
    this.areas = areas;
  }

  public VacancyDraftVacancyDraftItem assignedManager(VacancyDraftAssignedManager assignedManager) {
    this.assignedManager = assignedManager;
    return this;
  }

  /**
   * Get assignedManager
   * @return assignedManager
  */
  @Valid 
  @Schema(name = "assigned_manager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigned_manager")
  public VacancyDraftAssignedManager getAssignedManager() {
    return assignedManager;
  }

  public void setAssignedManager(VacancyDraftAssignedManager assignedManager) {
    this.assignedManager = assignedManager;
  }

  public VacancyDraftVacancyDraftItem billingType(VacancyBillingTypeOutput billingType) {
    this.billingType = billingType;
    return this;
  }

  /**
   * Get billingType
   * @return billingType
  */
  @NotNull @Valid 
  @Schema(name = "billing_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("billing_type")
  public VacancyBillingTypeOutput getBillingType() {
    return billingType;
  }

  public void setBillingType(VacancyBillingTypeOutput billingType) {
    this.billingType = billingType;
  }

  public VacancyDraftVacancyDraftItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название вакансии
   * @return name
  */
  
  @Schema(name = "name", description = "Название вакансии", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacancyDraftVacancyDraftItem publicationType(String publicationType) {
    this.publicationType = publicationType;
    return this;
  }

  /**
   * Тип публикации (справочник [vacancy_billing_type](#tag/Obshie-spravochniki/operation/get-dictionaries))
   * @return publicationType
   * @deprecated
  */
  @NotNull 
  @Schema(name = "publication_type", description = "Тип публикации (справочник [vacancy_billing_type](#tag/Obshie-spravochniki/operation/get-dictionaries))", deprecated = true, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("publication_type")
  @Deprecated
  public String getPublicationType() {
    return publicationType;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setPublicationType(String publicationType) {
    this.publicationType = publicationType;
  }

  public VacancyDraftVacancyDraftItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Url для запроса полной информации черновика
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Url для запроса полной информации черновика", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public VacancyDraftVacancyDraftItem vacancyProperties(VacancyDraftVacancyProperties vacancyProperties) {
    this.vacancyProperties = vacancyProperties;
    return this;
  }

  /**
   * Get vacancyProperties
   * @return vacancyProperties
  */
  @Valid 
  @Schema(name = "vacancy_properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vacancy_properties")
  public VacancyDraftVacancyProperties getVacancyProperties() {
    return vacancyProperties;
  }

  public void setVacancyProperties(VacancyDraftVacancyProperties vacancyProperties) {
    this.vacancyProperties = vacancyProperties;
  }

  public VacancyDraftVacancyDraftItem vacancyType(String vacancyType) {
    this.vacancyType = vacancyType;
    return this;
  }

  /**
   * Тип вакансии (справочник [vacancy_type](#tag/Obshie-spravochniki/operation/get-dictionaries))
   * @return vacancyType
  */
  @NotNull 
  @Schema(name = "vacancy_type", description = "Тип вакансии (справочник [vacancy_type](#tag/Obshie-spravochniki/operation/get-dictionaries))", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_type")
  public String getVacancyType() {
    return vacancyType;
  }

  public void setVacancyType(String vacancyType) {
    this.vacancyType = vacancyType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyDraftVacancyDraftItem vacancyDraftVacancyDraftItem = (VacancyDraftVacancyDraftItem) o;
    return Objects.equals(this.autoPublication, vacancyDraftVacancyDraftItem.autoPublication) &&
        Objects.equals(this.completedFieldsPercentage, vacancyDraftVacancyDraftItem.completedFieldsPercentage) &&
        Objects.equals(this.draftId, vacancyDraftVacancyDraftItem.draftId) &&
        Objects.equals(this.insufficientPublications, vacancyDraftVacancyDraftItem.insufficientPublications) &&
        Objects.equals(this.insufficientQuotas, vacancyDraftVacancyDraftItem.insufficientQuotas) &&
        Objects.equals(this.lastChangeTime, vacancyDraftVacancyDraftItem.lastChangeTime) &&
        Objects.equals(this.publicationReady, vacancyDraftVacancyDraftItem.publicationReady) &&
        Objects.equals(this.requiredPublications, vacancyDraftVacancyDraftItem.requiredPublications) &&
        Objects.equals(this.scheduledAt, vacancyDraftVacancyDraftItem.scheduledAt) &&
        Objects.equals(this.areas, vacancyDraftVacancyDraftItem.areas) &&
        Objects.equals(this.assignedManager, vacancyDraftVacancyDraftItem.assignedManager) &&
        Objects.equals(this.billingType, vacancyDraftVacancyDraftItem.billingType) &&
        Objects.equals(this.name, vacancyDraftVacancyDraftItem.name) &&
        Objects.equals(this.publicationType, vacancyDraftVacancyDraftItem.publicationType) &&
        Objects.equals(this.url, vacancyDraftVacancyDraftItem.url) &&
        Objects.equals(this.vacancyProperties, vacancyDraftVacancyDraftItem.vacancyProperties) &&
        Objects.equals(this.vacancyType, vacancyDraftVacancyDraftItem.vacancyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoPublication, completedFieldsPercentage, draftId, insufficientPublications, insufficientQuotas, lastChangeTime, publicationReady, requiredPublications, scheduledAt, areas, assignedManager, billingType, name, publicationType, url, vacancyProperties, vacancyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyDraftVacancyDraftItem {\n");
    sb.append("    autoPublication: ").append(toIndentedString(autoPublication)).append("\n");
    sb.append("    completedFieldsPercentage: ").append(toIndentedString(completedFieldsPercentage)).append("\n");
    sb.append("    draftId: ").append(toIndentedString(draftId)).append("\n");
    sb.append("    insufficientPublications: ").append(toIndentedString(insufficientPublications)).append("\n");
    sb.append("    insufficientQuotas: ").append(toIndentedString(insufficientQuotas)).append("\n");
    sb.append("    lastChangeTime: ").append(toIndentedString(lastChangeTime)).append("\n");
    sb.append("    publicationReady: ").append(toIndentedString(publicationReady)).append("\n");
    sb.append("    requiredPublications: ").append(toIndentedString(requiredPublications)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    assignedManager: ").append(toIndentedString(assignedManager)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicationType: ").append(toIndentedString(publicationType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    vacancyProperties: ").append(toIndentedString(vacancyProperties)).append("\n");
    sb.append("    vacancyType: ").append(toIndentedString(vacancyType)).append("\n");
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

