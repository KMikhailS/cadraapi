package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Справочники полей и сущностей, используемых в API
 */

@Schema(name = "DictionariesDictResponse", description = "Справочники полей и сущностей, используемых в API")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class DictionariesDictResponse {

  @Valid
  private List<@Valid IncludesIdName> ageRestriction = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> applicantCommentAccessType = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> applicantCommentsOrder = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> applicantNegotiationStatus = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> businessTripReadiness = new ArrayList<>();

  @Valid
  private List<@Valid DictionariesCurrencyItem> currency = new ArrayList<>();

  @Valid
  private List<@Valid IncludesId> driverLicenseTypes = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> educationLevel = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> employerActiveVacanciesOrder = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> employerArchivedVacanciesOrder = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> employerHiddenVacanciesOrder = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> employerRelation = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> employerType = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> employment = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> employmentForm = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> experience = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> flyInFlyOutDuration = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> gender = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> jobSearchStatusesApplicant = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> jobSearchStatusesEmployer = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> languageLevel = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> messagingStatus = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> negotiationsOrder = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> negotiationsParticipantType = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> negotiationsState = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> phoneCallStatus = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> preferredContactType = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> relocationType = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeAccessType = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeContactsSiteType = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeEmploymentForm = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeHiddenFields = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeModerationNote = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeSearchExperiencePeriod = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeSearchFields = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeSearchLabel = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeSearchLogic = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeSearchOrder = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeSearchRelocation = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeStatus = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> resumeWorkFormat = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdNameUid> schedule = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> travelTime = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> vacancyBillingType = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> vacancyCluster = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> vacancyLabel = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> vacancyNotProlongedReason = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> vacancyRelation = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> vacancySearchFields = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> vacancySearchOrder = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> vacancyType = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> workFormat = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> workScheduleByDays = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> workingDays = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> workingHours = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> workingTimeIntervals = new ArrayList<>();

  @Valid
  private List<@Valid IncludesIdName> workingTimeModes = new ArrayList<>();

  public DictionariesDictResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DictionariesDictResponse(List<@Valid IncludesIdName> applicantCommentAccessType, List<@Valid IncludesIdName> applicantCommentsOrder, List<@Valid IncludesIdName> applicantNegotiationStatus, List<@Valid IncludesIdName> businessTripReadiness, List<@Valid DictionariesCurrencyItem> currency, List<@Valid IncludesId> driverLicenseTypes, List<@Valid IncludesIdName> educationLevel, List<@Valid IncludesIdName> employerActiveVacanciesOrder, List<@Valid IncludesIdName> employerArchivedVacanciesOrder, List<@Valid IncludesIdName> employerRelation, List<@Valid IncludesIdName> employerType, List<@Valid IncludesIdName> employment, List<@Valid IncludesIdName> experience, List<@Valid IncludesIdName> gender, List<@Valid IncludesIdName> jobSearchStatusesApplicant, List<@Valid IncludesIdName> jobSearchStatusesEmployer, List<@Valid IncludesIdName> languageLevel, List<@Valid IncludesIdName> messagingStatus, List<@Valid IncludesIdName> negotiationsOrder, List<@Valid IncludesIdName> negotiationsParticipantType, List<@Valid IncludesIdName> negotiationsState, List<@Valid IncludesIdName> phoneCallStatus, List<@Valid IncludesIdName> preferredContactType, List<@Valid IncludesIdName> relocationType, List<@Valid IncludesIdName> resumeAccessType, List<@Valid IncludesIdName> resumeContactsSiteType, List<@Valid IncludesIdName> resumeEmploymentForm, List<@Valid IncludesIdName> resumeHiddenFields, List<@Valid IncludesIdName> resumeModerationNote, List<@Valid IncludesIdName> resumeStatus, List<@Valid IncludesIdName> resumeWorkFormat, List<@Valid IncludesIdNameUid> schedule, List<@Valid IncludesIdName> travelTime, List<@Valid IncludesIdName> vacancyBillingType, List<@Valid IncludesIdName> vacancyCluster, List<@Valid IncludesIdName> vacancyLabel, List<@Valid IncludesIdName> vacancyNotProlongedReason, List<@Valid IncludesIdName> vacancyRelation, List<@Valid IncludesIdName> vacancySearchFields, List<@Valid IncludesIdName> vacancySearchOrder, List<@Valid IncludesIdName> vacancyType, List<@Valid IncludesIdName> workingDays, List<@Valid IncludesIdName> workingTimeIntervals, List<@Valid IncludesIdName> workingTimeModes) {
    this.applicantCommentAccessType = applicantCommentAccessType;
    this.applicantCommentsOrder = applicantCommentsOrder;
    this.applicantNegotiationStatus = applicantNegotiationStatus;
    this.businessTripReadiness = businessTripReadiness;
    this.currency = currency;
    this.driverLicenseTypes = driverLicenseTypes;
    this.educationLevel = educationLevel;
    this.employerActiveVacanciesOrder = employerActiveVacanciesOrder;
    this.employerArchivedVacanciesOrder = employerArchivedVacanciesOrder;
    this.employerRelation = employerRelation;
    this.employerType = employerType;
    this.employment = employment;
    this.experience = experience;
    this.gender = gender;
    this.jobSearchStatusesApplicant = jobSearchStatusesApplicant;
    this.jobSearchStatusesEmployer = jobSearchStatusesEmployer;
    this.languageLevel = languageLevel;
    this.messagingStatus = messagingStatus;
    this.negotiationsOrder = negotiationsOrder;
    this.negotiationsParticipantType = negotiationsParticipantType;
    this.negotiationsState = negotiationsState;
    this.phoneCallStatus = phoneCallStatus;
    this.preferredContactType = preferredContactType;
    this.relocationType = relocationType;
    this.resumeAccessType = resumeAccessType;
    this.resumeContactsSiteType = resumeContactsSiteType;
    this.resumeEmploymentForm = resumeEmploymentForm;
    this.resumeHiddenFields = resumeHiddenFields;
    this.resumeModerationNote = resumeModerationNote;
    this.resumeStatus = resumeStatus;
    this.resumeWorkFormat = resumeWorkFormat;
    this.schedule = schedule;
    this.travelTime = travelTime;
    this.vacancyBillingType = vacancyBillingType;
    this.vacancyCluster = vacancyCluster;
    this.vacancyLabel = vacancyLabel;
    this.vacancyNotProlongedReason = vacancyNotProlongedReason;
    this.vacancyRelation = vacancyRelation;
    this.vacancySearchFields = vacancySearchFields;
    this.vacancySearchOrder = vacancySearchOrder;
    this.vacancyType = vacancyType;
    this.workingDays = workingDays;
    this.workingTimeIntervals = workingTimeIntervals;
    this.workingTimeModes = workingTimeModes;
  }

  public DictionariesDictResponse ageRestriction(List<@Valid IncludesIdName> ageRestriction) {
    this.ageRestriction = ageRestriction;
    return this;
  }

  public DictionariesDictResponse addAgeRestrictionItem(IncludesIdName ageRestrictionItem) {
    if (this.ageRestriction == null) {
      this.ageRestriction = new ArrayList<>();
    }
    this.ageRestriction.add(ageRestrictionItem);
    return this;
  }

  /**
   * Доступ к вакансии от 14 или 16 лет. Используется для поля age_restriction в вакансиях и черновиках
   * @return ageRestriction
  */
  @Valid 
  @Schema(name = "age_restriction", description = "Доступ к вакансии от 14 или 16 лет. Используется для поля age_restriction в вакансиях и черновиках", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age_restriction")
  public List<@Valid IncludesIdName> getAgeRestriction() {
    return ageRestriction;
  }

  public void setAgeRestriction(List<@Valid IncludesIdName> ageRestriction) {
    this.ageRestriction = ageRestriction;
  }

  public DictionariesDictResponse applicantCommentAccessType(List<@Valid IncludesIdName> applicantCommentAccessType) {
    this.applicantCommentAccessType = applicantCommentAccessType;
    return this;
  }

  public DictionariesDictResponse addApplicantCommentAccessTypeItem(IncludesIdName applicantCommentAccessTypeItem) {
    if (this.applicantCommentAccessType == null) {
      this.applicantCommentAccessType = new ArrayList<>();
    }
    this.applicantCommentAccessType.add(applicantCommentAccessTypeItem);
    return this;
  }

  /**
   * Тип доступа для комментария к соискателю
   * @return applicantCommentAccessType
  */
  @NotNull @Valid 
  @Schema(name = "applicant_comment_access_type", description = "Тип доступа для комментария к соискателю", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("applicant_comment_access_type")
  public List<@Valid IncludesIdName> getApplicantCommentAccessType() {
    return applicantCommentAccessType;
  }

  public void setApplicantCommentAccessType(List<@Valid IncludesIdName> applicantCommentAccessType) {
    this.applicantCommentAccessType = applicantCommentAccessType;
  }

  public DictionariesDictResponse applicantCommentsOrder(List<@Valid IncludesIdName> applicantCommentsOrder) {
    this.applicantCommentsOrder = applicantCommentsOrder;
    return this;
  }

  public DictionariesDictResponse addApplicantCommentsOrderItem(IncludesIdName applicantCommentsOrderItem) {
    if (this.applicantCommentsOrder == null) {
      this.applicantCommentsOrder = new ArrayList<>();
    }
    this.applicantCommentsOrder.add(applicantCommentsOrderItem);
    return this;
  }

  /**
   * Типы сортировки [списка комментариев к соискателю](#tag/Kommentarii-k-soiskatelyu/operation/get-applicant-comments-list)
   * @return applicantCommentsOrder
  */
  @NotNull @Valid 
  @Schema(name = "applicant_comments_order", description = "Типы сортировки [списка комментариев к соискателю](#tag/Kommentarii-k-soiskatelyu/operation/get-applicant-comments-list)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("applicant_comments_order")
  public List<@Valid IncludesIdName> getApplicantCommentsOrder() {
    return applicantCommentsOrder;
  }

  public void setApplicantCommentsOrder(List<@Valid IncludesIdName> applicantCommentsOrder) {
    this.applicantCommentsOrder = applicantCommentsOrder;
  }

  public DictionariesDictResponse applicantNegotiationStatus(List<@Valid IncludesIdName> applicantNegotiationStatus) {
    this.applicantNegotiationStatus = applicantNegotiationStatus;
    return this;
  }

  public DictionariesDictResponse addApplicantNegotiationStatusItem(IncludesIdName applicantNegotiationStatusItem) {
    if (this.applicantNegotiationStatus == null) {
      this.applicantNegotiationStatus = new ArrayList<>();
    }
    this.applicantNegotiationStatus.add(applicantNegotiationStatusItem);
    return this;
  }

  /**
   * Статусы откликов/приглашений
   * @return applicantNegotiationStatus
  */
  @NotNull @Valid 
  @Schema(name = "applicant_negotiation_status", description = "Статусы откликов/приглашений", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("applicant_negotiation_status")
  public List<@Valid IncludesIdName> getApplicantNegotiationStatus() {
    return applicantNegotiationStatus;
  }

  public void setApplicantNegotiationStatus(List<@Valid IncludesIdName> applicantNegotiationStatus) {
    this.applicantNegotiationStatus = applicantNegotiationStatus;
  }

  public DictionariesDictResponse businessTripReadiness(List<@Valid IncludesIdName> businessTripReadiness) {
    this.businessTripReadiness = businessTripReadiness;
    return this;
  }

  public DictionariesDictResponse addBusinessTripReadinessItem(IncludesIdName businessTripReadinessItem) {
    if (this.businessTripReadiness == null) {
      this.businessTripReadiness = new ArrayList<>();
    }
    this.businessTripReadiness.add(businessTripReadinessItem);
    return this;
  }

  /**
   * Готовность к командировкам
   * @return businessTripReadiness
  */
  @NotNull @Valid 
  @Schema(name = "business_trip_readiness", description = "Готовность к командировкам", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("business_trip_readiness")
  public List<@Valid IncludesIdName> getBusinessTripReadiness() {
    return businessTripReadiness;
  }

  public void setBusinessTripReadiness(List<@Valid IncludesIdName> businessTripReadiness) {
    this.businessTripReadiness = businessTripReadiness;
  }

  public DictionariesDictResponse currency(List<@Valid DictionariesCurrencyItem> currency) {
    this.currency = currency;
    return this;
  }

  public DictionariesDictResponse addCurrencyItem(DictionariesCurrencyItem currencyItem) {
    if (this.currency == null) {
      this.currency = new ArrayList<>();
    }
    this.currency.add(currencyItem);
    return this;
  }

  /**
   * Справочник валют
   * @return currency
  */
  @NotNull @Valid 
  @Schema(name = "currency", description = "Справочник валют", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public List<@Valid DictionariesCurrencyItem> getCurrency() {
    return currency;
  }

  public void setCurrency(List<@Valid DictionariesCurrencyItem> currency) {
    this.currency = currency;
  }

  public DictionariesDictResponse driverLicenseTypes(List<@Valid IncludesId> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
    return this;
  }

  public DictionariesDictResponse addDriverLicenseTypesItem(IncludesId driverLicenseTypesItem) {
    if (this.driverLicenseTypes == null) {
      this.driverLicenseTypes = new ArrayList<>();
    }
    this.driverLicenseTypes.add(driverLicenseTypesItem);
    return this;
  }

  /**
   * Категории водительских прав
   * @return driverLicenseTypes
  */
  @NotNull @Valid 
  @Schema(name = "driver_license_types", description = "Категории водительских прав", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("driver_license_types")
  public List<@Valid IncludesId> getDriverLicenseTypes() {
    return driverLicenseTypes;
  }

  public void setDriverLicenseTypes(List<@Valid IncludesId> driverLicenseTypes) {
    this.driverLicenseTypes = driverLicenseTypes;
  }

  public DictionariesDictResponse educationLevel(List<@Valid IncludesIdName> educationLevel) {
    this.educationLevel = educationLevel;
    return this;
  }

  public DictionariesDictResponse addEducationLevelItem(IncludesIdName educationLevelItem) {
    if (this.educationLevel == null) {
      this.educationLevel = new ArrayList<>();
    }
    this.educationLevel.add(educationLevelItem);
    return this;
  }

  /**
   * Образование в резюме
   * @return educationLevel
  */
  @NotNull @Valid 
  @Schema(name = "education_level", description = "Образование в резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("education_level")
  public List<@Valid IncludesIdName> getEducationLevel() {
    return educationLevel;
  }

  public void setEducationLevel(List<@Valid IncludesIdName> educationLevel) {
    this.educationLevel = educationLevel;
  }

  public DictionariesDictResponse employerActiveVacanciesOrder(List<@Valid IncludesIdName> employerActiveVacanciesOrder) {
    this.employerActiveVacanciesOrder = employerActiveVacanciesOrder;
    return this;
  }

  public DictionariesDictResponse addEmployerActiveVacanciesOrderItem(IncludesIdName employerActiveVacanciesOrderItem) {
    if (this.employerActiveVacanciesOrder == null) {
      this.employerActiveVacanciesOrder = new ArrayList<>();
    }
    this.employerActiveVacanciesOrder.add(employerActiveVacanciesOrderItem);
    return this;
  }

  /**
   * Тип сортировки списка опубликованных вакансий
   * @return employerActiveVacanciesOrder
  */
  @NotNull @Valid 
  @Schema(name = "employer_active_vacancies_order", description = "Тип сортировки списка опубликованных вакансий", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_active_vacancies_order")
  public List<@Valid IncludesIdName> getEmployerActiveVacanciesOrder() {
    return employerActiveVacanciesOrder;
  }

  public void setEmployerActiveVacanciesOrder(List<@Valid IncludesIdName> employerActiveVacanciesOrder) {
    this.employerActiveVacanciesOrder = employerActiveVacanciesOrder;
  }

  public DictionariesDictResponse employerArchivedVacanciesOrder(List<@Valid IncludesIdName> employerArchivedVacanciesOrder) {
    this.employerArchivedVacanciesOrder = employerArchivedVacanciesOrder;
    return this;
  }

  public DictionariesDictResponse addEmployerArchivedVacanciesOrderItem(IncludesIdName employerArchivedVacanciesOrderItem) {
    if (this.employerArchivedVacanciesOrder == null) {
      this.employerArchivedVacanciesOrder = new ArrayList<>();
    }
    this.employerArchivedVacanciesOrder.add(employerArchivedVacanciesOrderItem);
    return this;
  }

  /**
   * Тип сортировки списка архивных вакансий
   * @return employerArchivedVacanciesOrder
  */
  @NotNull @Valid 
  @Schema(name = "employer_archived_vacancies_order", description = "Тип сортировки списка архивных вакансий", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_archived_vacancies_order")
  public List<@Valid IncludesIdName> getEmployerArchivedVacanciesOrder() {
    return employerArchivedVacanciesOrder;
  }

  public void setEmployerArchivedVacanciesOrder(List<@Valid IncludesIdName> employerArchivedVacanciesOrder) {
    this.employerArchivedVacanciesOrder = employerArchivedVacanciesOrder;
  }

  public DictionariesDictResponse employerHiddenVacanciesOrder(List<@Valid IncludesIdName> employerHiddenVacanciesOrder) {
    this.employerHiddenVacanciesOrder = employerHiddenVacanciesOrder;
    return this;
  }

  public DictionariesDictResponse addEmployerHiddenVacanciesOrderItem(IncludesIdName employerHiddenVacanciesOrderItem) {
    if (this.employerHiddenVacanciesOrder == null) {
      this.employerHiddenVacanciesOrder = new ArrayList<>();
    }
    this.employerHiddenVacanciesOrder.add(employerHiddenVacanciesOrderItem);
    return this;
  }

  /**
   * Тип сортировки скрытых вакансий
   * @return employerHiddenVacanciesOrder
  */
  @Valid 
  @Schema(name = "employer_hidden_vacancies_order", description = "Тип сортировки скрытых вакансий", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employer_hidden_vacancies_order")
  public List<@Valid IncludesIdName> getEmployerHiddenVacanciesOrder() {
    return employerHiddenVacanciesOrder;
  }

  public void setEmployerHiddenVacanciesOrder(List<@Valid IncludesIdName> employerHiddenVacanciesOrder) {
    this.employerHiddenVacanciesOrder = employerHiddenVacanciesOrder;
  }

  public DictionariesDictResponse employerRelation(List<@Valid IncludesIdName> employerRelation) {
    this.employerRelation = employerRelation;
    return this;
  }

  public DictionariesDictResponse addEmployerRelationItem(IncludesIdName employerRelationItem) {
    if (this.employerRelation == null) {
      this.employerRelation = new ArrayList<>();
    }
    this.employerRelation.add(employerRelationItem);
    return this;
  }

  /**
   * Типы связи компании с пользователем
   * @return employerRelation
  */
  @NotNull @Valid 
  @Schema(name = "employer_relation", description = "Типы связи компании с пользователем", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_relation")
  public List<@Valid IncludesIdName> getEmployerRelation() {
    return employerRelation;
  }

  public void setEmployerRelation(List<@Valid IncludesIdName> employerRelation) {
    this.employerRelation = employerRelation;
  }

  public DictionariesDictResponse employerType(List<@Valid IncludesIdName> employerType) {
    this.employerType = employerType;
    return this;
  }

  public DictionariesDictResponse addEmployerTypeItem(IncludesIdName employerTypeItem) {
    if (this.employerType == null) {
      this.employerType = new ArrayList<>();
    }
    this.employerType.add(employerTypeItem);
    return this;
  }

  /**
   * Тип работодателя
   * @return employerType
  */
  @NotNull @Valid 
  @Schema(name = "employer_type", description = "Тип работодателя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employer_type")
  public List<@Valid IncludesIdName> getEmployerType() {
    return employerType;
  }

  public void setEmployerType(List<@Valid IncludesIdName> employerType) {
    this.employerType = employerType;
  }

  public DictionariesDictResponse employment(List<@Valid IncludesIdName> employment) {
    this.employment = employment;
    return this;
  }

  public DictionariesDictResponse addEmploymentItem(IncludesIdName employmentItem) {
    if (this.employment == null) {
      this.employment = new ArrayList<>();
    }
    this.employment.add(employmentItem);
    return this;
  }

  /**
   * Тип занятости
   * @return employment
  */
  @NotNull @Valid 
  @Schema(name = "employment", description = "Тип занятости", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("employment")
  public List<@Valid IncludesIdName> getEmployment() {
    return employment;
  }

  public void setEmployment(List<@Valid IncludesIdName> employment) {
    this.employment = employment;
  }

  public DictionariesDictResponse employmentForm(List<@Valid IncludesIdName> employmentForm) {
    this.employmentForm = employmentForm;
    return this;
  }

  public DictionariesDictResponse addEmploymentFormItem(IncludesIdName employmentFormItem) {
    if (this.employmentForm == null) {
      this.employmentForm = new ArrayList<>();
    }
    this.employmentForm.add(employmentFormItem);
    return this;
  }

  /**
   * Тип занятости. Используется для поля employment_form в вакансиях и черновиках
   * @return employmentForm
  */
  @Valid 
  @Schema(name = "employment_form", description = "Тип занятости. Используется для поля employment_form в вакансиях и черновиках", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("employment_form")
  public List<@Valid IncludesIdName> getEmploymentForm() {
    return employmentForm;
  }

  public void setEmploymentForm(List<@Valid IncludesIdName> employmentForm) {
    this.employmentForm = employmentForm;
  }

  public DictionariesDictResponse experience(List<@Valid IncludesIdName> experience) {
    this.experience = experience;
    return this;
  }

  public DictionariesDictResponse addExperienceItem(IncludesIdName experienceItem) {
    if (this.experience == null) {
      this.experience = new ArrayList<>();
    }
    this.experience.add(experienceItem);
    return this;
  }

  /**
   * Опыт работы
   * @return experience
  */
  @NotNull @Valid 
  @Schema(name = "experience", description = "Опыт работы", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("experience")
  public List<@Valid IncludesIdName> getExperience() {
    return experience;
  }

  public void setExperience(List<@Valid IncludesIdName> experience) {
    this.experience = experience;
  }

  public DictionariesDictResponse flyInFlyOutDuration(List<@Valid IncludesIdName> flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
    return this;
  }

  public DictionariesDictResponse addFlyInFlyOutDurationItem(IncludesIdName flyInFlyOutDurationItem) {
    if (this.flyInFlyOutDuration == null) {
      this.flyInFlyOutDuration = new ArrayList<>();
    }
    this.flyInFlyOutDuration.add(flyInFlyOutDurationItem);
    return this;
  }

  /**
   * Длительность вахты. Используется для поля fly_in_fly_out_duration в вакансиях и черновиках
   * @return flyInFlyOutDuration
  */
  @Valid 
  @Schema(name = "fly_in_fly_out_duration", description = "Длительность вахты. Используется для поля fly_in_fly_out_duration в вакансиях и черновиках", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fly_in_fly_out_duration")
  public List<@Valid IncludesIdName> getFlyInFlyOutDuration() {
    return flyInFlyOutDuration;
  }

  public void setFlyInFlyOutDuration(List<@Valid IncludesIdName> flyInFlyOutDuration) {
    this.flyInFlyOutDuration = flyInFlyOutDuration;
  }

  public DictionariesDictResponse gender(List<@Valid IncludesIdName> gender) {
    this.gender = gender;
    return this;
  }

  public DictionariesDictResponse addGenderItem(IncludesIdName genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<>();
    }
    this.gender.add(genderItem);
    return this;
  }

  /**
   * Пол
   * @return gender
  */
  @NotNull @Valid 
  @Schema(name = "gender", description = "Пол", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gender")
  public List<@Valid IncludesIdName> getGender() {
    return gender;
  }

  public void setGender(List<@Valid IncludesIdName> gender) {
    this.gender = gender;
  }

  public DictionariesDictResponse jobSearchStatusesApplicant(List<@Valid IncludesIdName> jobSearchStatusesApplicant) {
    this.jobSearchStatusesApplicant = jobSearchStatusesApplicant;
    return this;
  }

  public DictionariesDictResponse addJobSearchStatusesApplicantItem(IncludesIdName jobSearchStatusesApplicantItem) {
    if (this.jobSearchStatusesApplicant == null) {
      this.jobSearchStatusesApplicant = new ArrayList<>();
    }
    this.jobSearchStatusesApplicant.add(jobSearchStatusesApplicantItem);
    return this;
  }

  /**
   * Статусы поиска соискателей для установки и отображения самому соискателю
   * @return jobSearchStatusesApplicant
  */
  @NotNull @Valid 
  @Schema(name = "job_search_statuses_applicant", description = "Статусы поиска соискателей для установки и отображения самому соискателю", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("job_search_statuses_applicant")
  public List<@Valid IncludesIdName> getJobSearchStatusesApplicant() {
    return jobSearchStatusesApplicant;
  }

  public void setJobSearchStatusesApplicant(List<@Valid IncludesIdName> jobSearchStatusesApplicant) {
    this.jobSearchStatusesApplicant = jobSearchStatusesApplicant;
  }

  public DictionariesDictResponse jobSearchStatusesEmployer(List<@Valid IncludesIdName> jobSearchStatusesEmployer) {
    this.jobSearchStatusesEmployer = jobSearchStatusesEmployer;
    return this;
  }

  public DictionariesDictResponse addJobSearchStatusesEmployerItem(IncludesIdName jobSearchStatusesEmployerItem) {
    if (this.jobSearchStatusesEmployer == null) {
      this.jobSearchStatusesEmployer = new ArrayList<>();
    }
    this.jobSearchStatusesEmployer.add(jobSearchStatusesEmployerItem);
    return this;
  }

  /**
   * Статусы поиска соискателей для отображения работодателям
   * @return jobSearchStatusesEmployer
  */
  @NotNull @Valid 
  @Schema(name = "job_search_statuses_employer", description = "Статусы поиска соискателей для отображения работодателям", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("job_search_statuses_employer")
  public List<@Valid IncludesIdName> getJobSearchStatusesEmployer() {
    return jobSearchStatusesEmployer;
  }

  public void setJobSearchStatusesEmployer(List<@Valid IncludesIdName> jobSearchStatusesEmployer) {
    this.jobSearchStatusesEmployer = jobSearchStatusesEmployer;
  }

  public DictionariesDictResponse languageLevel(List<@Valid IncludesIdName> languageLevel) {
    this.languageLevel = languageLevel;
    return this;
  }

  public DictionariesDictResponse addLanguageLevelItem(IncludesIdName languageLevelItem) {
    if (this.languageLevel == null) {
      this.languageLevel = new ArrayList<>();
    }
    this.languageLevel.add(languageLevelItem);
    return this;
  }

  /**
   * Уровень владения языком
   * @return languageLevel
  */
  @NotNull @Valid 
  @Schema(name = "language_level", description = "Уровень владения языком", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language_level")
  public List<@Valid IncludesIdName> getLanguageLevel() {
    return languageLevel;
  }

  public void setLanguageLevel(List<@Valid IncludesIdName> languageLevel) {
    this.languageLevel = languageLevel;
  }

  public DictionariesDictResponse messagingStatus(List<@Valid IncludesIdName> messagingStatus) {
    this.messagingStatus = messagingStatus;
    return this;
  }

  public DictionariesDictResponse addMessagingStatusItem(IncludesIdName messagingStatusItem) {
    if (this.messagingStatus == null) {
      this.messagingStatus = new ArrayList<>();
    }
    this.messagingStatus.add(messagingStatusItem);
    return this;
  }

  /**
   * Статус возможности отправки сообщения в переписке
   * @return messagingStatus
  */
  @NotNull @Valid 
  @Schema(name = "messaging_status", description = "Статус возможности отправки сообщения в переписке", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messaging_status")
  public List<@Valid IncludesIdName> getMessagingStatus() {
    return messagingStatus;
  }

  public void setMessagingStatus(List<@Valid IncludesIdName> messagingStatus) {
    this.messagingStatus = messagingStatus;
  }

  public DictionariesDictResponse negotiationsOrder(List<@Valid IncludesIdName> negotiationsOrder) {
    this.negotiationsOrder = negotiationsOrder;
    return this;
  }

  public DictionariesDictResponse addNegotiationsOrderItem(IncludesIdName negotiationsOrderItem) {
    if (this.negotiationsOrder == null) {
      this.negotiationsOrder = new ArrayList<>();
    }
    this.negotiationsOrder.add(negotiationsOrderItem);
    return this;
  }

  /**
   * Типы порядка отображения откликов
   * @return negotiationsOrder
  */
  @NotNull @Valid 
  @Schema(name = "negotiations_order", description = "Типы порядка отображения откликов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("negotiations_order")
  public List<@Valid IncludesIdName> getNegotiationsOrder() {
    return negotiationsOrder;
  }

  public void setNegotiationsOrder(List<@Valid IncludesIdName> negotiationsOrder) {
    this.negotiationsOrder = negotiationsOrder;
  }

  public DictionariesDictResponse negotiationsParticipantType(List<@Valid IncludesIdName> negotiationsParticipantType) {
    this.negotiationsParticipantType = negotiationsParticipantType;
    return this;
  }

  public DictionariesDictResponse addNegotiationsParticipantTypeItem(IncludesIdName negotiationsParticipantTypeItem) {
    if (this.negotiationsParticipantType == null) {
      this.negotiationsParticipantType = new ArrayList<>();
    }
    this.negotiationsParticipantType.add(negotiationsParticipantTypeItem);
    return this;
  }

  /**
   * Типы участников переписки
   * @return negotiationsParticipantType
  */
  @NotNull @Valid 
  @Schema(name = "negotiations_participant_type", description = "Типы участников переписки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("negotiations_participant_type")
  public List<@Valid IncludesIdName> getNegotiationsParticipantType() {
    return negotiationsParticipantType;
  }

  public void setNegotiationsParticipantType(List<@Valid IncludesIdName> negotiationsParticipantType) {
    this.negotiationsParticipantType = negotiationsParticipantType;
  }

  public DictionariesDictResponse negotiationsState(List<@Valid IncludesIdName> negotiationsState) {
    this.negotiationsState = negotiationsState;
    return this;
  }

  public DictionariesDictResponse addNegotiationsStateItem(IncludesIdName negotiationsStateItem) {
    if (this.negotiationsState == null) {
      this.negotiationsState = new ArrayList<>();
    }
    this.negotiationsState.add(negotiationsStateItem);
    return this;
  }

  /**
   * Типы состояний откликов
   * @return negotiationsState
  */
  @NotNull @Valid 
  @Schema(name = "negotiations_state", description = "Типы состояний откликов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("negotiations_state")
  public List<@Valid IncludesIdName> getNegotiationsState() {
    return negotiationsState;
  }

  public void setNegotiationsState(List<@Valid IncludesIdName> negotiationsState) {
    this.negotiationsState = negotiationsState;
  }

  public DictionariesDictResponse phoneCallStatus(List<@Valid IncludesIdName> phoneCallStatus) {
    this.phoneCallStatus = phoneCallStatus;
    return this;
  }

  public DictionariesDictResponse addPhoneCallStatusItem(IncludesIdName phoneCallStatusItem) {
    if (this.phoneCallStatus == null) {
      this.phoneCallStatus = new ArrayList<>();
    }
    this.phoneCallStatus.add(phoneCallStatusItem);
    return this;
  }

  /**
   * Статус звонка, зафиксированного в системе кол-трекинг
   * @return phoneCallStatus
  */
  @NotNull @Valid 
  @Schema(name = "phone_call_status", description = "Статус звонка, зафиксированного в системе кол-трекинг", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phone_call_status")
  public List<@Valid IncludesIdName> getPhoneCallStatus() {
    return phoneCallStatus;
  }

  public void setPhoneCallStatus(List<@Valid IncludesIdName> phoneCallStatus) {
    this.phoneCallStatus = phoneCallStatus;
  }

  public DictionariesDictResponse preferredContactType(List<@Valid IncludesIdName> preferredContactType) {
    this.preferredContactType = preferredContactType;
    return this;
  }

  public DictionariesDictResponse addPreferredContactTypeItem(IncludesIdName preferredContactTypeItem) {
    if (this.preferredContactType == null) {
      this.preferredContactType = new ArrayList<>();
    }
    this.preferredContactType.add(preferredContactTypeItem);
    return this;
  }

  /**
   * Предпочитаемый способ связи
   * @return preferredContactType
  */
  @NotNull @Valid 
  @Schema(name = "preferred_contact_type", description = "Предпочитаемый способ связи", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("preferred_contact_type")
  public List<@Valid IncludesIdName> getPreferredContactType() {
    return preferredContactType;
  }

  public void setPreferredContactType(List<@Valid IncludesIdName> preferredContactType) {
    this.preferredContactType = preferredContactType;
  }

  public DictionariesDictResponse relocationType(List<@Valid IncludesIdName> relocationType) {
    this.relocationType = relocationType;
    return this;
  }

  public DictionariesDictResponse addRelocationTypeItem(IncludesIdName relocationTypeItem) {
    if (this.relocationType == null) {
      this.relocationType = new ArrayList<>();
    }
    this.relocationType.add(relocationTypeItem);
    return this;
  }

  /**
   * Готовность к переезду
   * @return relocationType
  */
  @NotNull @Valid 
  @Schema(name = "relocation_type", description = "Готовность к переезду", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("relocation_type")
  public List<@Valid IncludesIdName> getRelocationType() {
    return relocationType;
  }

  public void setRelocationType(List<@Valid IncludesIdName> relocationType) {
    this.relocationType = relocationType;
  }

  public DictionariesDictResponse resumeAccessType(List<@Valid IncludesIdName> resumeAccessType) {
    this.resumeAccessType = resumeAccessType;
    return this;
  }

  public DictionariesDictResponse addResumeAccessTypeItem(IncludesIdName resumeAccessTypeItem) {
    if (this.resumeAccessType == null) {
      this.resumeAccessType = new ArrayList<>();
    }
    this.resumeAccessType.add(resumeAccessTypeItem);
    return this;
  }

  /**
   * Уровень доступа к резюме
   * @return resumeAccessType
  */
  @NotNull @Valid 
  @Schema(name = "resume_access_type", description = "Уровень доступа к резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_access_type")
  public List<@Valid IncludesIdName> getResumeAccessType() {
    return resumeAccessType;
  }

  public void setResumeAccessType(List<@Valid IncludesIdName> resumeAccessType) {
    this.resumeAccessType = resumeAccessType;
  }

  public DictionariesDictResponse resumeContactsSiteType(List<@Valid IncludesIdName> resumeContactsSiteType) {
    this.resumeContactsSiteType = resumeContactsSiteType;
    return this;
  }

  public DictionariesDictResponse addResumeContactsSiteTypeItem(IncludesIdName resumeContactsSiteTypeItem) {
    if (this.resumeContactsSiteType == null) {
      this.resumeContactsSiteType = new ArrayList<>();
    }
    this.resumeContactsSiteType.add(resumeContactsSiteTypeItem);
    return this;
  }

  /**
   * Тип сайта в поле «контакты»
   * @return resumeContactsSiteType
  */
  @NotNull @Valid 
  @Schema(name = "resume_contacts_site_type", description = "Тип сайта в поле «контакты»", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_contacts_site_type")
  public List<@Valid IncludesIdName> getResumeContactsSiteType() {
    return resumeContactsSiteType;
  }

  public void setResumeContactsSiteType(List<@Valid IncludesIdName> resumeContactsSiteType) {
    this.resumeContactsSiteType = resumeContactsSiteType;
  }

  public DictionariesDictResponse resumeEmploymentForm(List<@Valid IncludesIdName> resumeEmploymentForm) {
    this.resumeEmploymentForm = resumeEmploymentForm;
    return this;
  }

  public DictionariesDictResponse addResumeEmploymentFormItem(IncludesIdName resumeEmploymentFormItem) {
    if (this.resumeEmploymentForm == null) {
      this.resumeEmploymentForm = new ArrayList<>();
    }
    this.resumeEmploymentForm.add(resumeEmploymentFormItem);
    return this;
  }

  /**
   * Тип занятости. Используется для поля employment_form в резюме
   * @return resumeEmploymentForm
  */
  @NotNull @Valid 
  @Schema(name = "resume_employment_form", description = "Тип занятости. Используется для поля employment_form в резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_employment_form")
  public List<@Valid IncludesIdName> getResumeEmploymentForm() {
    return resumeEmploymentForm;
  }

  public void setResumeEmploymentForm(List<@Valid IncludesIdName> resumeEmploymentForm) {
    this.resumeEmploymentForm = resumeEmploymentForm;
  }

  public DictionariesDictResponse resumeHiddenFields(List<@Valid IncludesIdName> resumeHiddenFields) {
    this.resumeHiddenFields = resumeHiddenFields;
    return this;
  }

  public DictionariesDictResponse addResumeHiddenFieldsItem(IncludesIdName resumeHiddenFieldsItem) {
    if (this.resumeHiddenFields == null) {
      this.resumeHiddenFields = new ArrayList<>();
    }
    this.resumeHiddenFields.add(resumeHiddenFieldsItem);
    return this;
  }

  /**
   * Поля резюме, которые могут быть [скрыты](https://github.com/hhru/api/blob/master/docs/employer_resumes.md#hidden-fields)
   * @return resumeHiddenFields
  */
  @NotNull @Valid 
  @Schema(name = "resume_hidden_fields", description = "Поля резюме, которые могут быть [скрыты](https://github.com/hhru/api/blob/master/docs/employer_resumes.md#hidden-fields)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_hidden_fields")
  public List<@Valid IncludesIdName> getResumeHiddenFields() {
    return resumeHiddenFields;
  }

  public void setResumeHiddenFields(List<@Valid IncludesIdName> resumeHiddenFields) {
    this.resumeHiddenFields = resumeHiddenFields;
  }

  public DictionariesDictResponse resumeModerationNote(List<@Valid IncludesIdName> resumeModerationNote) {
    this.resumeModerationNote = resumeModerationNote;
    return this;
  }

  public DictionariesDictResponse addResumeModerationNoteItem(IncludesIdName resumeModerationNoteItem) {
    if (this.resumeModerationNote == null) {
      this.resumeModerationNote = new ArrayList<>();
    }
    this.resumeModerationNote.add(resumeModerationNoteItem);
    return this;
  }

  /**
   * Комментарий модератора
   * @return resumeModerationNote
  */
  @NotNull @Valid 
  @Schema(name = "resume_moderation_note", description = "Комментарий модератора", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_moderation_note")
  public List<@Valid IncludesIdName> getResumeModerationNote() {
    return resumeModerationNote;
  }

  public void setResumeModerationNote(List<@Valid IncludesIdName> resumeModerationNote) {
    this.resumeModerationNote = resumeModerationNote;
  }

  public DictionariesDictResponse resumeSearchExperiencePeriod(List<@Valid IncludesIdName> resumeSearchExperiencePeriod) {
    this.resumeSearchExperiencePeriod = resumeSearchExperiencePeriod;
    return this;
  }

  public DictionariesDictResponse addResumeSearchExperiencePeriodItem(IncludesIdName resumeSearchExperiencePeriodItem) {
    if (this.resumeSearchExperiencePeriod == null) {
      this.resumeSearchExperiencePeriod = new ArrayList<>();
    }
    this.resumeSearchExperiencePeriod.add(resumeSearchExperiencePeriodItem);
    return this;
  }

  /**
   * Условие поиска по опыту работы
   * @return resumeSearchExperiencePeriod
  */
  @Valid 
  @Schema(name = "resume_search_experience_period", description = "Условие поиска по опыту работы", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resume_search_experience_period")
  public List<@Valid IncludesIdName> getResumeSearchExperiencePeriod() {
    return resumeSearchExperiencePeriod;
  }

  public void setResumeSearchExperiencePeriod(List<@Valid IncludesIdName> resumeSearchExperiencePeriod) {
    this.resumeSearchExperiencePeriod = resumeSearchExperiencePeriod;
  }

  public DictionariesDictResponse resumeSearchFields(List<@Valid IncludesIdName> resumeSearchFields) {
    this.resumeSearchFields = resumeSearchFields;
    return this;
  }

  public DictionariesDictResponse addResumeSearchFieldsItem(IncludesIdName resumeSearchFieldsItem) {
    if (this.resumeSearchFields == null) {
      this.resumeSearchFields = new ArrayList<>();
    }
    this.resumeSearchFields.add(resumeSearchFieldsItem);
    return this;
  }

  /**
   * Область поиска в резюме
   * @return resumeSearchFields
  */
  @Valid 
  @Schema(name = "resume_search_fields", description = "Область поиска в резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resume_search_fields")
  public List<@Valid IncludesIdName> getResumeSearchFields() {
    return resumeSearchFields;
  }

  public void setResumeSearchFields(List<@Valid IncludesIdName> resumeSearchFields) {
    this.resumeSearchFields = resumeSearchFields;
  }

  public DictionariesDictResponse resumeSearchLabel(List<@Valid IncludesIdName> resumeSearchLabel) {
    this.resumeSearchLabel = resumeSearchLabel;
    return this;
  }

  public DictionariesDictResponse addResumeSearchLabelItem(IncludesIdName resumeSearchLabelItem) {
    if (this.resumeSearchLabel == null) {
      this.resumeSearchLabel = new ArrayList<>();
    }
    this.resumeSearchLabel.add(resumeSearchLabelItem);
    return this;
  }

  /**
   * Метки поиска резюме
   * @return resumeSearchLabel
  */
  @Valid 
  @Schema(name = "resume_search_label", description = "Метки поиска резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resume_search_label")
  public List<@Valid IncludesIdName> getResumeSearchLabel() {
    return resumeSearchLabel;
  }

  public void setResumeSearchLabel(List<@Valid IncludesIdName> resumeSearchLabel) {
    this.resumeSearchLabel = resumeSearchLabel;
  }

  public DictionariesDictResponse resumeSearchLogic(List<@Valid IncludesIdName> resumeSearchLogic) {
    this.resumeSearchLogic = resumeSearchLogic;
    return this;
  }

  public DictionariesDictResponse addResumeSearchLogicItem(IncludesIdName resumeSearchLogicItem) {
    if (this.resumeSearchLogic == null) {
      this.resumeSearchLogic = new ArrayList<>();
    }
    this.resumeSearchLogic.add(resumeSearchLogicItem);
    return this;
  }

  /**
   * Условие поиска резюме
   * @return resumeSearchLogic
  */
  @Valid 
  @Schema(name = "resume_search_logic", description = "Условие поиска резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resume_search_logic")
  public List<@Valid IncludesIdName> getResumeSearchLogic() {
    return resumeSearchLogic;
  }

  public void setResumeSearchLogic(List<@Valid IncludesIdName> resumeSearchLogic) {
    this.resumeSearchLogic = resumeSearchLogic;
  }

  public DictionariesDictResponse resumeSearchOrder(List<@Valid IncludesIdName> resumeSearchOrder) {
    this.resumeSearchOrder = resumeSearchOrder;
    return this;
  }

  public DictionariesDictResponse addResumeSearchOrderItem(IncludesIdName resumeSearchOrderItem) {
    if (this.resumeSearchOrder == null) {
      this.resumeSearchOrder = new ArrayList<>();
    }
    this.resumeSearchOrder.add(resumeSearchOrderItem);
    return this;
  }

  /**
   * Тип сортировки резюме
   * @return resumeSearchOrder
  */
  @Valid 
  @Schema(name = "resume_search_order", description = "Тип сортировки резюме", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resume_search_order")
  public List<@Valid IncludesIdName> getResumeSearchOrder() {
    return resumeSearchOrder;
  }

  public void setResumeSearchOrder(List<@Valid IncludesIdName> resumeSearchOrder) {
    this.resumeSearchOrder = resumeSearchOrder;
  }

  public DictionariesDictResponse resumeSearchRelocation(List<@Valid IncludesIdName> resumeSearchRelocation) {
    this.resumeSearchRelocation = resumeSearchRelocation;
    return this;
  }

  public DictionariesDictResponse addResumeSearchRelocationItem(IncludesIdName resumeSearchRelocationItem) {
    if (this.resumeSearchRelocation == null) {
      this.resumeSearchRelocation = new ArrayList<>();
    }
    this.resumeSearchRelocation.add(resumeSearchRelocationItem);
    return this;
  }

  /**
   * Условие поиска по проживанию в регионе и готовности к переезду
   * @return resumeSearchRelocation
  */
  @Valid 
  @Schema(name = "resume_search_relocation", description = "Условие поиска по проживанию в регионе и готовности к переезду", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resume_search_relocation")
  public List<@Valid IncludesIdName> getResumeSearchRelocation() {
    return resumeSearchRelocation;
  }

  public void setResumeSearchRelocation(List<@Valid IncludesIdName> resumeSearchRelocation) {
    this.resumeSearchRelocation = resumeSearchRelocation;
  }

  public DictionariesDictResponse resumeStatus(List<@Valid IncludesIdName> resumeStatus) {
    this.resumeStatus = resumeStatus;
    return this;
  }

  public DictionariesDictResponse addResumeStatusItem(IncludesIdName resumeStatusItem) {
    if (this.resumeStatus == null) {
      this.resumeStatus = new ArrayList<>();
    }
    this.resumeStatus.add(resumeStatusItem);
    return this;
  }

  /**
   * Статус резюме
   * @return resumeStatus
  */
  @NotNull @Valid 
  @Schema(name = "resume_status", description = "Статус резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_status")
  public List<@Valid IncludesIdName> getResumeStatus() {
    return resumeStatus;
  }

  public void setResumeStatus(List<@Valid IncludesIdName> resumeStatus) {
    this.resumeStatus = resumeStatus;
  }

  public DictionariesDictResponse resumeWorkFormat(List<@Valid IncludesIdName> resumeWorkFormat) {
    this.resumeWorkFormat = resumeWorkFormat;
    return this;
  }

  public DictionariesDictResponse addResumeWorkFormatItem(IncludesIdName resumeWorkFormatItem) {
    if (this.resumeWorkFormat == null) {
      this.resumeWorkFormat = new ArrayList<>();
    }
    this.resumeWorkFormat.add(resumeWorkFormatItem);
    return this;
  }

  /**
   * Формат работы. Используется для поля work_format в резюме
   * @return resumeWorkFormat
  */
  @NotNull @Valid 
  @Schema(name = "resume_work_format", description = "Формат работы. Используется для поля work_format в резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resume_work_format")
  public List<@Valid IncludesIdName> getResumeWorkFormat() {
    return resumeWorkFormat;
  }

  public void setResumeWorkFormat(List<@Valid IncludesIdName> resumeWorkFormat) {
    this.resumeWorkFormat = resumeWorkFormat;
  }

  public DictionariesDictResponse schedule(List<@Valid IncludesIdNameUid> schedule) {
    this.schedule = schedule;
    return this;
  }

  public DictionariesDictResponse addScheduleItem(IncludesIdNameUid scheduleItem) {
    if (this.schedule == null) {
      this.schedule = new ArrayList<>();
    }
    this.schedule.add(scheduleItem);
    return this;
  }

  /**
   * График работы
   * @return schedule
  */
  @NotNull @Valid 
  @Schema(name = "schedule", description = "График работы", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schedule")
  public List<@Valid IncludesIdNameUid> getSchedule() {
    return schedule;
  }

  public void setSchedule(List<@Valid IncludesIdNameUid> schedule) {
    this.schedule = schedule;
  }

  public DictionariesDictResponse travelTime(List<@Valid IncludesIdName> travelTime) {
    this.travelTime = travelTime;
    return this;
  }

  public DictionariesDictResponse addTravelTimeItem(IncludesIdName travelTimeItem) {
    if (this.travelTime == null) {
      this.travelTime = new ArrayList<>();
    }
    this.travelTime.add(travelTimeItem);
    return this;
  }

  /**
   * Время в пути
   * @return travelTime
  */
  @NotNull @Valid 
  @Schema(name = "travel_time", description = "Время в пути", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("travel_time")
  public List<@Valid IncludesIdName> getTravelTime() {
    return travelTime;
  }

  public void setTravelTime(List<@Valid IncludesIdName> travelTime) {
    this.travelTime = travelTime;
  }

  public DictionariesDictResponse vacancyBillingType(List<@Valid IncludesIdName> vacancyBillingType) {
    this.vacancyBillingType = vacancyBillingType;
    return this;
  }

  public DictionariesDictResponse addVacancyBillingTypeItem(IncludesIdName vacancyBillingTypeItem) {
    if (this.vacancyBillingType == null) {
      this.vacancyBillingType = new ArrayList<>();
    }
    this.vacancyBillingType.add(vacancyBillingTypeItem);
    return this;
  }

  /**
   * Варианты размещения вакансии с точки зрения биллинга
   * @return vacancyBillingType
  */
  @NotNull @Valid 
  @Schema(name = "vacancy_billing_type", description = "Варианты размещения вакансии с точки зрения биллинга", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_billing_type")
  public List<@Valid IncludesIdName> getVacancyBillingType() {
    return vacancyBillingType;
  }

  public void setVacancyBillingType(List<@Valid IncludesIdName> vacancyBillingType) {
    this.vacancyBillingType = vacancyBillingType;
  }

  public DictionariesDictResponse vacancyCluster(List<@Valid IncludesIdName> vacancyCluster) {
    this.vacancyCluster = vacancyCluster;
    return this;
  }

  public DictionariesDictResponse addVacancyClusterItem(IncludesIdName vacancyClusterItem) {
    if (this.vacancyCluster == null) {
      this.vacancyCluster = new ArrayList<>();
    }
    this.vacancyCluster.add(vacancyClusterItem);
    return this;
  }

  /**
   * Тип кластеров
   * @return vacancyCluster
  */
  @NotNull @Valid 
  @Schema(name = "vacancy_cluster", description = "Тип кластеров", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_cluster")
  public List<@Valid IncludesIdName> getVacancyCluster() {
    return vacancyCluster;
  }

  public void setVacancyCluster(List<@Valid IncludesIdName> vacancyCluster) {
    this.vacancyCluster = vacancyCluster;
  }

  public DictionariesDictResponse vacancyLabel(List<@Valid IncludesIdName> vacancyLabel) {
    this.vacancyLabel = vacancyLabel;
    return this;
  }

  public DictionariesDictResponse addVacancyLabelItem(IncludesIdName vacancyLabelItem) {
    if (this.vacancyLabel == null) {
      this.vacancyLabel = new ArrayList<>();
    }
    this.vacancyLabel.add(vacancyLabelItem);
    return this;
  }

  /**
   * Метки вакансии
   * @return vacancyLabel
  */
  @NotNull @Valid 
  @Schema(name = "vacancy_label", description = "Метки вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_label")
  public List<@Valid IncludesIdName> getVacancyLabel() {
    return vacancyLabel;
  }

  public void setVacancyLabel(List<@Valid IncludesIdName> vacancyLabel) {
    this.vacancyLabel = vacancyLabel;
  }

  public DictionariesDictResponse vacancyNotProlongedReason(List<@Valid IncludesIdName> vacancyNotProlongedReason) {
    this.vacancyNotProlongedReason = vacancyNotProlongedReason;
    return this;
  }

  public DictionariesDictResponse addVacancyNotProlongedReasonItem(IncludesIdName vacancyNotProlongedReasonItem) {
    if (this.vacancyNotProlongedReason == null) {
      this.vacancyNotProlongedReason = new ArrayList<>();
    }
    this.vacancyNotProlongedReason.add(vacancyNotProlongedReasonItem);
    return this;
  }

  /**
   * Причины, из-за которых невозможно [продлить вакансию](#tag/Upravlenie-vakansiyami/operation/get-prolongation-vacancy-info)
   * @return vacancyNotProlongedReason
  */
  @NotNull @Valid 
  @Schema(name = "vacancy_not_prolonged_reason", description = "Причины, из-за которых невозможно [продлить вакансию](#tag/Upravlenie-vakansiyami/operation/get-prolongation-vacancy-info)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_not_prolonged_reason")
  public List<@Valid IncludesIdName> getVacancyNotProlongedReason() {
    return vacancyNotProlongedReason;
  }

  public void setVacancyNotProlongedReason(List<@Valid IncludesIdName> vacancyNotProlongedReason) {
    this.vacancyNotProlongedReason = vacancyNotProlongedReason;
  }

  public DictionariesDictResponse vacancyRelation(List<@Valid IncludesIdName> vacancyRelation) {
    this.vacancyRelation = vacancyRelation;
    return this;
  }

  public DictionariesDictResponse addVacancyRelationItem(IncludesIdName vacancyRelationItem) {
    if (this.vacancyRelation == null) {
      this.vacancyRelation = new ArrayList<>();
    }
    this.vacancyRelation.add(vacancyRelationItem);
    return this;
  }

  /**
   * Типы связи вакансии с пользователем
   * @return vacancyRelation
  */
  @NotNull @Valid 
  @Schema(name = "vacancy_relation", description = "Типы связи вакансии с пользователем", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_relation")
  public List<@Valid IncludesIdName> getVacancyRelation() {
    return vacancyRelation;
  }

  public void setVacancyRelation(List<@Valid IncludesIdName> vacancyRelation) {
    this.vacancyRelation = vacancyRelation;
  }

  public DictionariesDictResponse vacancySearchFields(List<@Valid IncludesIdName> vacancySearchFields) {
    this.vacancySearchFields = vacancySearchFields;
    return this;
  }

  public DictionariesDictResponse addVacancySearchFieldsItem(IncludesIdName vacancySearchFieldsItem) {
    if (this.vacancySearchFields == null) {
      this.vacancySearchFields = new ArrayList<>();
    }
    this.vacancySearchFields.add(vacancySearchFieldsItem);
    return this;
  }

  /**
   * Область поиска в вакансии
   * @return vacancySearchFields
  */
  @NotNull @Valid 
  @Schema(name = "vacancy_search_fields", description = "Область поиска в вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_search_fields")
  public List<@Valid IncludesIdName> getVacancySearchFields() {
    return vacancySearchFields;
  }

  public void setVacancySearchFields(List<@Valid IncludesIdName> vacancySearchFields) {
    this.vacancySearchFields = vacancySearchFields;
  }

  public DictionariesDictResponse vacancySearchOrder(List<@Valid IncludesIdName> vacancySearchOrder) {
    this.vacancySearchOrder = vacancySearchOrder;
    return this;
  }

  public DictionariesDictResponse addVacancySearchOrderItem(IncludesIdName vacancySearchOrderItem) {
    if (this.vacancySearchOrder == null) {
      this.vacancySearchOrder = new ArrayList<>();
    }
    this.vacancySearchOrder.add(vacancySearchOrderItem);
    return this;
  }

  /**
   * Тип сортировки вакансии
   * @return vacancySearchOrder
  */
  @NotNull @Valid 
  @Schema(name = "vacancy_search_order", description = "Тип сортировки вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_search_order")
  public List<@Valid IncludesIdName> getVacancySearchOrder() {
    return vacancySearchOrder;
  }

  public void setVacancySearchOrder(List<@Valid IncludesIdName> vacancySearchOrder) {
    this.vacancySearchOrder = vacancySearchOrder;
  }

  public DictionariesDictResponse vacancyType(List<@Valid IncludesIdName> vacancyType) {
    this.vacancyType = vacancyType;
    return this;
  }

  public DictionariesDictResponse addVacancyTypeItem(IncludesIdName vacancyTypeItem) {
    if (this.vacancyType == null) {
      this.vacancyType = new ArrayList<>();
    }
    this.vacancyType.add(vacancyTypeItem);
    return this;
  }

  /**
   * Тип вакансии
   * @return vacancyType
  */
  @NotNull @Valid 
  @Schema(name = "vacancy_type", description = "Тип вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_type")
  public List<@Valid IncludesIdName> getVacancyType() {
    return vacancyType;
  }

  public void setVacancyType(List<@Valid IncludesIdName> vacancyType) {
    this.vacancyType = vacancyType;
  }

  public DictionariesDictResponse workFormat(List<@Valid IncludesIdName> workFormat) {
    this.workFormat = workFormat;
    return this;
  }

  public DictionariesDictResponse addWorkFormatItem(IncludesIdName workFormatItem) {
    if (this.workFormat == null) {
      this.workFormat = new ArrayList<>();
    }
    this.workFormat.add(workFormatItem);
    return this;
  }

  /**
   * Формат работы. Используется для поля work_format в вакансиях и черновиках
   * @return workFormat
  */
  @Valid 
  @Schema(name = "work_format", description = "Формат работы. Используется для поля work_format в вакансиях и черновиках", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("work_format")
  public List<@Valid IncludesIdName> getWorkFormat() {
    return workFormat;
  }

  public void setWorkFormat(List<@Valid IncludesIdName> workFormat) {
    this.workFormat = workFormat;
  }

  public DictionariesDictResponse workScheduleByDays(List<@Valid IncludesIdName> workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
    return this;
  }

  public DictionariesDictResponse addWorkScheduleByDaysItem(IncludesIdName workScheduleByDaysItem) {
    if (this.workScheduleByDays == null) {
      this.workScheduleByDays = new ArrayList<>();
    }
    this.workScheduleByDays.add(workScheduleByDaysItem);
    return this;
  }

  /**
   * Расписание на неделю. Используется для поля work_schedule_by_days в вакансиях и черновиках
   * @return workScheduleByDays
  */
  @Valid 
  @Schema(name = "work_schedule_by_days", description = "Расписание на неделю. Используется для поля work_schedule_by_days в вакансиях и черновиках", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("work_schedule_by_days")
  public List<@Valid IncludesIdName> getWorkScheduleByDays() {
    return workScheduleByDays;
  }

  public void setWorkScheduleByDays(List<@Valid IncludesIdName> workScheduleByDays) {
    this.workScheduleByDays = workScheduleByDays;
  }

  public DictionariesDictResponse workingDays(List<@Valid IncludesIdName> workingDays) {
    this.workingDays = workingDays;
    return this;
  }

  public DictionariesDictResponse addWorkingDaysItem(IncludesIdName workingDaysItem) {
    if (this.workingDays == null) {
      this.workingDays = new ArrayList<>();
    }
    this.workingDays.add(workingDaysItem);
    return this;
  }

  /**
   * Рабочие дни
   * @return workingDays
  */
  @NotNull @Valid 
  @Schema(name = "working_days", description = "Рабочие дни", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("working_days")
  public List<@Valid IncludesIdName> getWorkingDays() {
    return workingDays;
  }

  public void setWorkingDays(List<@Valid IncludesIdName> workingDays) {
    this.workingDays = workingDays;
  }

  public DictionariesDictResponse workingHours(List<@Valid IncludesIdName> workingHours) {
    this.workingHours = workingHours;
    return this;
  }

  public DictionariesDictResponse addWorkingHoursItem(IncludesIdName workingHoursItem) {
    if (this.workingHours == null) {
      this.workingHours = new ArrayList<>();
    }
    this.workingHours.add(workingHoursItem);
    return this;
  }

  /**
   * Рабочие часы в сутки. Используется для поля working_hours в вакансиях и черновиках
   * @return workingHours
  */
  @Valid 
  @Schema(name = "working_hours", description = "Рабочие часы в сутки. Используется для поля working_hours в вакансиях и черновиках", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("working_hours")
  public List<@Valid IncludesIdName> getWorkingHours() {
    return workingHours;
  }

  public void setWorkingHours(List<@Valid IncludesIdName> workingHours) {
    this.workingHours = workingHours;
  }

  public DictionariesDictResponse workingTimeIntervals(List<@Valid IncludesIdName> workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
    return this;
  }

  public DictionariesDictResponse addWorkingTimeIntervalsItem(IncludesIdName workingTimeIntervalsItem) {
    if (this.workingTimeIntervals == null) {
      this.workingTimeIntervals = new ArrayList<>();
    }
    this.workingTimeIntervals.add(workingTimeIntervalsItem);
    return this;
  }

  /**
   * Временные интервалы работы
   * @return workingTimeIntervals
  */
  @NotNull @Valid 
  @Schema(name = "working_time_intervals", description = "Временные интервалы работы", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("working_time_intervals")
  public List<@Valid IncludesIdName> getWorkingTimeIntervals() {
    return workingTimeIntervals;
  }

  public void setWorkingTimeIntervals(List<@Valid IncludesIdName> workingTimeIntervals) {
    this.workingTimeIntervals = workingTimeIntervals;
  }

  public DictionariesDictResponse workingTimeModes(List<@Valid IncludesIdName> workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
    return this;
  }

  public DictionariesDictResponse addWorkingTimeModesItem(IncludesIdName workingTimeModesItem) {
    if (this.workingTimeModes == null) {
      this.workingTimeModes = new ArrayList<>();
    }
    this.workingTimeModes.add(workingTimeModesItem);
    return this;
  }

  /**
   * Режимы времени работы
   * @return workingTimeModes
  */
  @NotNull @Valid 
  @Schema(name = "working_time_modes", description = "Режимы времени работы", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("working_time_modes")
  public List<@Valid IncludesIdName> getWorkingTimeModes() {
    return workingTimeModes;
  }

  public void setWorkingTimeModes(List<@Valid IncludesIdName> workingTimeModes) {
    this.workingTimeModes = workingTimeModes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionariesDictResponse dictionariesDictResponse = (DictionariesDictResponse) o;
    return Objects.equals(this.ageRestriction, dictionariesDictResponse.ageRestriction) &&
        Objects.equals(this.applicantCommentAccessType, dictionariesDictResponse.applicantCommentAccessType) &&
        Objects.equals(this.applicantCommentsOrder, dictionariesDictResponse.applicantCommentsOrder) &&
        Objects.equals(this.applicantNegotiationStatus, dictionariesDictResponse.applicantNegotiationStatus) &&
        Objects.equals(this.businessTripReadiness, dictionariesDictResponse.businessTripReadiness) &&
        Objects.equals(this.currency, dictionariesDictResponse.currency) &&
        Objects.equals(this.driverLicenseTypes, dictionariesDictResponse.driverLicenseTypes) &&
        Objects.equals(this.educationLevel, dictionariesDictResponse.educationLevel) &&
        Objects.equals(this.employerActiveVacanciesOrder, dictionariesDictResponse.employerActiveVacanciesOrder) &&
        Objects.equals(this.employerArchivedVacanciesOrder, dictionariesDictResponse.employerArchivedVacanciesOrder) &&
        Objects.equals(this.employerHiddenVacanciesOrder, dictionariesDictResponse.employerHiddenVacanciesOrder) &&
        Objects.equals(this.employerRelation, dictionariesDictResponse.employerRelation) &&
        Objects.equals(this.employerType, dictionariesDictResponse.employerType) &&
        Objects.equals(this.employment, dictionariesDictResponse.employment) &&
        Objects.equals(this.employmentForm, dictionariesDictResponse.employmentForm) &&
        Objects.equals(this.experience, dictionariesDictResponse.experience) &&
        Objects.equals(this.flyInFlyOutDuration, dictionariesDictResponse.flyInFlyOutDuration) &&
        Objects.equals(this.gender, dictionariesDictResponse.gender) &&
        Objects.equals(this.jobSearchStatusesApplicant, dictionariesDictResponse.jobSearchStatusesApplicant) &&
        Objects.equals(this.jobSearchStatusesEmployer, dictionariesDictResponse.jobSearchStatusesEmployer) &&
        Objects.equals(this.languageLevel, dictionariesDictResponse.languageLevel) &&
        Objects.equals(this.messagingStatus, dictionariesDictResponse.messagingStatus) &&
        Objects.equals(this.negotiationsOrder, dictionariesDictResponse.negotiationsOrder) &&
        Objects.equals(this.negotiationsParticipantType, dictionariesDictResponse.negotiationsParticipantType) &&
        Objects.equals(this.negotiationsState, dictionariesDictResponse.negotiationsState) &&
        Objects.equals(this.phoneCallStatus, dictionariesDictResponse.phoneCallStatus) &&
        Objects.equals(this.preferredContactType, dictionariesDictResponse.preferredContactType) &&
        Objects.equals(this.relocationType, dictionariesDictResponse.relocationType) &&
        Objects.equals(this.resumeAccessType, dictionariesDictResponse.resumeAccessType) &&
        Objects.equals(this.resumeContactsSiteType, dictionariesDictResponse.resumeContactsSiteType) &&
        Objects.equals(this.resumeEmploymentForm, dictionariesDictResponse.resumeEmploymentForm) &&
        Objects.equals(this.resumeHiddenFields, dictionariesDictResponse.resumeHiddenFields) &&
        Objects.equals(this.resumeModerationNote, dictionariesDictResponse.resumeModerationNote) &&
        Objects.equals(this.resumeSearchExperiencePeriod, dictionariesDictResponse.resumeSearchExperiencePeriod) &&
        Objects.equals(this.resumeSearchFields, dictionariesDictResponse.resumeSearchFields) &&
        Objects.equals(this.resumeSearchLabel, dictionariesDictResponse.resumeSearchLabel) &&
        Objects.equals(this.resumeSearchLogic, dictionariesDictResponse.resumeSearchLogic) &&
        Objects.equals(this.resumeSearchOrder, dictionariesDictResponse.resumeSearchOrder) &&
        Objects.equals(this.resumeSearchRelocation, dictionariesDictResponse.resumeSearchRelocation) &&
        Objects.equals(this.resumeStatus, dictionariesDictResponse.resumeStatus) &&
        Objects.equals(this.resumeWorkFormat, dictionariesDictResponse.resumeWorkFormat) &&
        Objects.equals(this.schedule, dictionariesDictResponse.schedule) &&
        Objects.equals(this.travelTime, dictionariesDictResponse.travelTime) &&
        Objects.equals(this.vacancyBillingType, dictionariesDictResponse.vacancyBillingType) &&
        Objects.equals(this.vacancyCluster, dictionariesDictResponse.vacancyCluster) &&
        Objects.equals(this.vacancyLabel, dictionariesDictResponse.vacancyLabel) &&
        Objects.equals(this.vacancyNotProlongedReason, dictionariesDictResponse.vacancyNotProlongedReason) &&
        Objects.equals(this.vacancyRelation, dictionariesDictResponse.vacancyRelation) &&
        Objects.equals(this.vacancySearchFields, dictionariesDictResponse.vacancySearchFields) &&
        Objects.equals(this.vacancySearchOrder, dictionariesDictResponse.vacancySearchOrder) &&
        Objects.equals(this.vacancyType, dictionariesDictResponse.vacancyType) &&
        Objects.equals(this.workFormat, dictionariesDictResponse.workFormat) &&
        Objects.equals(this.workScheduleByDays, dictionariesDictResponse.workScheduleByDays) &&
        Objects.equals(this.workingDays, dictionariesDictResponse.workingDays) &&
        Objects.equals(this.workingHours, dictionariesDictResponse.workingHours) &&
        Objects.equals(this.workingTimeIntervals, dictionariesDictResponse.workingTimeIntervals) &&
        Objects.equals(this.workingTimeModes, dictionariesDictResponse.workingTimeModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageRestriction, applicantCommentAccessType, applicantCommentsOrder, applicantNegotiationStatus, businessTripReadiness, currency, driverLicenseTypes, educationLevel, employerActiveVacanciesOrder, employerArchivedVacanciesOrder, employerHiddenVacanciesOrder, employerRelation, employerType, employment, employmentForm, experience, flyInFlyOutDuration, gender, jobSearchStatusesApplicant, jobSearchStatusesEmployer, languageLevel, messagingStatus, negotiationsOrder, negotiationsParticipantType, negotiationsState, phoneCallStatus, preferredContactType, relocationType, resumeAccessType, resumeContactsSiteType, resumeEmploymentForm, resumeHiddenFields, resumeModerationNote, resumeSearchExperiencePeriod, resumeSearchFields, resumeSearchLabel, resumeSearchLogic, resumeSearchOrder, resumeSearchRelocation, resumeStatus, resumeWorkFormat, schedule, travelTime, vacancyBillingType, vacancyCluster, vacancyLabel, vacancyNotProlongedReason, vacancyRelation, vacancySearchFields, vacancySearchOrder, vacancyType, workFormat, workScheduleByDays, workingDays, workingHours, workingTimeIntervals, workingTimeModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesDictResponse {\n");
    sb.append("    ageRestriction: ").append(toIndentedString(ageRestriction)).append("\n");
    sb.append("    applicantCommentAccessType: ").append(toIndentedString(applicantCommentAccessType)).append("\n");
    sb.append("    applicantCommentsOrder: ").append(toIndentedString(applicantCommentsOrder)).append("\n");
    sb.append("    applicantNegotiationStatus: ").append(toIndentedString(applicantNegotiationStatus)).append("\n");
    sb.append("    businessTripReadiness: ").append(toIndentedString(businessTripReadiness)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    driverLicenseTypes: ").append(toIndentedString(driverLicenseTypes)).append("\n");
    sb.append("    educationLevel: ").append(toIndentedString(educationLevel)).append("\n");
    sb.append("    employerActiveVacanciesOrder: ").append(toIndentedString(employerActiveVacanciesOrder)).append("\n");
    sb.append("    employerArchivedVacanciesOrder: ").append(toIndentedString(employerArchivedVacanciesOrder)).append("\n");
    sb.append("    employerHiddenVacanciesOrder: ").append(toIndentedString(employerHiddenVacanciesOrder)).append("\n");
    sb.append("    employerRelation: ").append(toIndentedString(employerRelation)).append("\n");
    sb.append("    employerType: ").append(toIndentedString(employerType)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    employmentForm: ").append(toIndentedString(employmentForm)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    flyInFlyOutDuration: ").append(toIndentedString(flyInFlyOutDuration)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    jobSearchStatusesApplicant: ").append(toIndentedString(jobSearchStatusesApplicant)).append("\n");
    sb.append("    jobSearchStatusesEmployer: ").append(toIndentedString(jobSearchStatusesEmployer)).append("\n");
    sb.append("    languageLevel: ").append(toIndentedString(languageLevel)).append("\n");
    sb.append("    messagingStatus: ").append(toIndentedString(messagingStatus)).append("\n");
    sb.append("    negotiationsOrder: ").append(toIndentedString(negotiationsOrder)).append("\n");
    sb.append("    negotiationsParticipantType: ").append(toIndentedString(negotiationsParticipantType)).append("\n");
    sb.append("    negotiationsState: ").append(toIndentedString(negotiationsState)).append("\n");
    sb.append("    phoneCallStatus: ").append(toIndentedString(phoneCallStatus)).append("\n");
    sb.append("    preferredContactType: ").append(toIndentedString(preferredContactType)).append("\n");
    sb.append("    relocationType: ").append(toIndentedString(relocationType)).append("\n");
    sb.append("    resumeAccessType: ").append(toIndentedString(resumeAccessType)).append("\n");
    sb.append("    resumeContactsSiteType: ").append(toIndentedString(resumeContactsSiteType)).append("\n");
    sb.append("    resumeEmploymentForm: ").append(toIndentedString(resumeEmploymentForm)).append("\n");
    sb.append("    resumeHiddenFields: ").append(toIndentedString(resumeHiddenFields)).append("\n");
    sb.append("    resumeModerationNote: ").append(toIndentedString(resumeModerationNote)).append("\n");
    sb.append("    resumeSearchExperiencePeriod: ").append(toIndentedString(resumeSearchExperiencePeriod)).append("\n");
    sb.append("    resumeSearchFields: ").append(toIndentedString(resumeSearchFields)).append("\n");
    sb.append("    resumeSearchLabel: ").append(toIndentedString(resumeSearchLabel)).append("\n");
    sb.append("    resumeSearchLogic: ").append(toIndentedString(resumeSearchLogic)).append("\n");
    sb.append("    resumeSearchOrder: ").append(toIndentedString(resumeSearchOrder)).append("\n");
    sb.append("    resumeSearchRelocation: ").append(toIndentedString(resumeSearchRelocation)).append("\n");
    sb.append("    resumeStatus: ").append(toIndentedString(resumeStatus)).append("\n");
    sb.append("    resumeWorkFormat: ").append(toIndentedString(resumeWorkFormat)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    vacancyBillingType: ").append(toIndentedString(vacancyBillingType)).append("\n");
    sb.append("    vacancyCluster: ").append(toIndentedString(vacancyCluster)).append("\n");
    sb.append("    vacancyLabel: ").append(toIndentedString(vacancyLabel)).append("\n");
    sb.append("    vacancyNotProlongedReason: ").append(toIndentedString(vacancyNotProlongedReason)).append("\n");
    sb.append("    vacancyRelation: ").append(toIndentedString(vacancyRelation)).append("\n");
    sb.append("    vacancySearchFields: ").append(toIndentedString(vacancySearchFields)).append("\n");
    sb.append("    vacancySearchOrder: ").append(toIndentedString(vacancySearchOrder)).append("\n");
    sb.append("    vacancyType: ").append(toIndentedString(vacancyType)).append("\n");
    sb.append("    workFormat: ").append(toIndentedString(workFormat)).append("\n");
    sb.append("    workScheduleByDays: ").append(toIndentedString(workScheduleByDays)).append("\n");
    sb.append("    workingDays: ").append(toIndentedString(workingDays)).append("\n");
    sb.append("    workingHours: ").append(toIndentedString(workingHours)).append("\n");
    sb.append("    workingTimeIntervals: ").append(toIndentedString(workingTimeIntervals)).append("\n");
    sb.append("    workingTimeModes: ").append(toIndentedString(workingTimeModes)).append("\n");
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

