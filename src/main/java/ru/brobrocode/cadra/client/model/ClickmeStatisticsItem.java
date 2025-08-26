package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * ClickmeStatisticsItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ClickmeStatisticsItem {

  private BigDecimal amount;

  private String campaignId;

  private String campaignTitle;

  /**
   * Тип рекламной кампании Clickme
   */
  public enum CampaignTypeEnum {
    MULTI_PLACEMENT("MULTI_PLACEMENT"),
    
    TOP_SEARCH("TOP_SEARCH");

    private String value;

    CampaignTypeEnum(String value) {
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
    public static CampaignTypeEnum fromValue(String value) {
      for (CampaignTypeEnum b : CampaignTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CampaignTypeEnum campaignType;

  private String clickmeAccountId;

  private String clickmeAccountTitle;

  private Integer clicks;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateEnd;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateStart;

  private Integer impressions;

  private Integer responses;

  private String url;

  private String vacancyId;

  private String vacancyTitle;

  public ClickmeStatisticsItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ClickmeStatisticsItem(BigDecimal amount, String campaignId, String campaignTitle, CampaignTypeEnum campaignType, String clickmeAccountId, Integer clicks, LocalDate dateEnd, LocalDate dateStart, Integer impressions, Integer responses, String url, String vacancyId, String vacancyTitle) {
    this.amount = amount;
    this.campaignId = campaignId;
    this.campaignTitle = campaignTitle;
    this.campaignType = campaignType;
    this.clickmeAccountId = clickmeAccountId;
    this.clicks = clicks;
    this.dateEnd = dateEnd;
    this.dateStart = dateStart;
    this.impressions = impressions;
    this.responses = responses;
    this.url = url;
    this.vacancyId = vacancyId;
    this.vacancyTitle = vacancyTitle;
  }

  public ClickmeStatisticsItem amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Траты на рекламную кампанию
   * @return amount
  */
  @NotNull @Valid 
  @Schema(name = "amount", description = "Траты на рекламную кампанию", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public ClickmeStatisticsItem campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * ID рекламной кампании Clickme
   * @return campaignId
  */
  @NotNull 
  @Schema(name = "campaign_id", description = "ID рекламной кампании Clickme", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public ClickmeStatisticsItem campaignTitle(String campaignTitle) {
    this.campaignTitle = campaignTitle;
    return this;
  }

  /**
   * Название рекламной кампании Clickme
   * @return campaignTitle
  */
  @NotNull 
  @Schema(name = "campaign_title", description = "Название рекламной кампании Clickme", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaign_title")
  public String getCampaignTitle() {
    return campaignTitle;
  }

  public void setCampaignTitle(String campaignTitle) {
    this.campaignTitle = campaignTitle;
  }

  public ClickmeStatisticsItem campaignType(CampaignTypeEnum campaignType) {
    this.campaignType = campaignType;
    return this;
  }

  /**
   * Тип рекламной кампании Clickme
   * @return campaignType
  */
  @NotNull 
  @Schema(name = "campaign_type", description = "Тип рекламной кампании Clickme", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaign_type")
  public CampaignTypeEnum getCampaignType() {
    return campaignType;
  }

  public void setCampaignType(CampaignTypeEnum campaignType) {
    this.campaignType = campaignType;
  }

  public ClickmeStatisticsItem clickmeAccountId(String clickmeAccountId) {
    this.clickmeAccountId = clickmeAccountId;
    return this;
  }

  /**
   * ID аккаунта Clickme
   * @return clickmeAccountId
  */
  @NotNull 
  @Schema(name = "clickme_account_id", description = "ID аккаунта Clickme", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clickme_account_id")
  public String getClickmeAccountId() {
    return clickmeAccountId;
  }

  public void setClickmeAccountId(String clickmeAccountId) {
    this.clickmeAccountId = clickmeAccountId;
  }

  public ClickmeStatisticsItem clickmeAccountTitle(String clickmeAccountTitle) {
    this.clickmeAccountTitle = clickmeAccountTitle;
    return this;
  }

  /**
   * Название аккаунта Clickme
   * @return clickmeAccountTitle
  */
  
  @Schema(name = "clickme_account_title", description = "Название аккаунта Clickme", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clickme_account_title")
  public String getClickmeAccountTitle() {
    return clickmeAccountTitle;
  }

  public void setClickmeAccountTitle(String clickmeAccountTitle) {
    this.clickmeAccountTitle = clickmeAccountTitle;
  }

  public ClickmeStatisticsItem clicks(Integer clicks) {
    this.clicks = clicks;
    return this;
  }

  /**
   * Количество кликов
   * @return clicks
  */
  @NotNull 
  @Schema(name = "clicks", description = "Количество кликов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clicks")
  public Integer getClicks() {
    return clicks;
  }

  public void setClicks(Integer clicks) {
    this.clicks = clicks;
  }

  public ClickmeStatisticsItem dateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }

  /**
   * Дата последнего показа рекламной кампании
   * @return dateEnd
  */
  @NotNull @Valid 
  @Schema(name = "date_end", description = "Дата последнего показа рекламной кампании", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date_end")
  public LocalDate getDateEnd() {
    return dateEnd;
  }

  public void setDateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
  }

  public ClickmeStatisticsItem dateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
    return this;
  }

  /**
   * Дата старта рекламной кампании
   * @return dateStart
  */
  @NotNull @Valid 
  @Schema(name = "date_start", description = "Дата старта рекламной кампании", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date_start")
  public LocalDate getDateStart() {
    return dateStart;
  }

  public void setDateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
  }

  public ClickmeStatisticsItem impressions(Integer impressions) {
    this.impressions = impressions;
    return this;
  }

  /**
   * Количество показов
   * @return impressions
  */
  @NotNull 
  @Schema(name = "impressions", description = "Количество показов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("impressions")
  public Integer getImpressions() {
    return impressions;
  }

  public void setImpressions(Integer impressions) {
    this.impressions = impressions;
  }

  public ClickmeStatisticsItem responses(Integer responses) {
    this.responses = responses;
    return this;
  }

  /**
   * Количество откликов на вакансию во время подключения Clickme
   * @return responses
  */
  @NotNull 
  @Schema(name = "responses", description = "Количество откликов на вакансию во время подключения Clickme", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("responses")
  public Integer getResponses() {
    return responses;
  }

  public void setResponses(Integer responses) {
    this.responses = responses;
  }

  public ClickmeStatisticsItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Продвигаемая ссылка
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "Продвигаемая ссылка", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ClickmeStatisticsItem vacancyId(String vacancyId) {
    this.vacancyId = vacancyId;
    return this;
  }

  /**
   * ID вакансии
   * @return vacancyId
  */
  @NotNull 
  @Schema(name = "vacancy_id", description = "ID вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_id")
  public String getVacancyId() {
    return vacancyId;
  }

  public void setVacancyId(String vacancyId) {
    this.vacancyId = vacancyId;
  }

  public ClickmeStatisticsItem vacancyTitle(String vacancyTitle) {
    this.vacancyTitle = vacancyTitle;
    return this;
  }

  /**
   * Название вакансии
   * @return vacancyTitle
  */
  @NotNull 
  @Schema(name = "vacancy_title", description = "Название вакансии", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vacancy_title")
  public String getVacancyTitle() {
    return vacancyTitle;
  }

  public void setVacancyTitle(String vacancyTitle) {
    this.vacancyTitle = vacancyTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickmeStatisticsItem clickmeStatisticsItem = (ClickmeStatisticsItem) o;
    return Objects.equals(this.amount, clickmeStatisticsItem.amount) &&
        Objects.equals(this.campaignId, clickmeStatisticsItem.campaignId) &&
        Objects.equals(this.campaignTitle, clickmeStatisticsItem.campaignTitle) &&
        Objects.equals(this.campaignType, clickmeStatisticsItem.campaignType) &&
        Objects.equals(this.clickmeAccountId, clickmeStatisticsItem.clickmeAccountId) &&
        Objects.equals(this.clickmeAccountTitle, clickmeStatisticsItem.clickmeAccountTitle) &&
        Objects.equals(this.clicks, clickmeStatisticsItem.clicks) &&
        Objects.equals(this.dateEnd, clickmeStatisticsItem.dateEnd) &&
        Objects.equals(this.dateStart, clickmeStatisticsItem.dateStart) &&
        Objects.equals(this.impressions, clickmeStatisticsItem.impressions) &&
        Objects.equals(this.responses, clickmeStatisticsItem.responses) &&
        Objects.equals(this.url, clickmeStatisticsItem.url) &&
        Objects.equals(this.vacancyId, clickmeStatisticsItem.vacancyId) &&
        Objects.equals(this.vacancyTitle, clickmeStatisticsItem.vacancyTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, campaignId, campaignTitle, campaignType, clickmeAccountId, clickmeAccountTitle, clicks, dateEnd, dateStart, impressions, responses, url, vacancyId, vacancyTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickmeStatisticsItem {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignTitle: ").append(toIndentedString(campaignTitle)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    clickmeAccountId: ").append(toIndentedString(clickmeAccountId)).append("\n");
    sb.append("    clickmeAccountTitle: ").append(toIndentedString(clickmeAccountTitle)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    vacancyId: ").append(toIndentedString(vacancyId)).append("\n");
    sb.append("    vacancyTitle: ").append(toIndentedString(vacancyTitle)).append("\n");
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

