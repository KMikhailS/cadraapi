package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Сокращенное представление резюме
 */

@Schema(name = "ProfileProfileResumesListItemView", description = "Сокращенное представление резюме")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class ProfileProfileResumesListItemView {

  private String id;

  private ProfilePhoto photo = null;

  private IncludesIdName status;

  private String title = null;

  public ProfileProfileResumesListItemView() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProfileProfileResumesListItemView(String id, ProfilePhoto photo, String title) {
    this.id = id;
    this.photo = photo;
    this.title = title;
  }

  public ProfileProfileResumesListItemView id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор резюме
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Идентификатор резюме", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProfileProfileResumesListItemView photo(ProfilePhoto photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
  */
  @NotNull @Valid 
  @Schema(name = "photo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("photo")
  public ProfilePhoto getPhoto() {
    return photo;
  }

  public void setPhoto(ProfilePhoto photo) {
    this.photo = photo;
  }

  public ProfileProfileResumesListItemView status(IncludesIdName status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public IncludesIdName getStatus() {
    return status;
  }

  public void setStatus(IncludesIdName status) {
    this.status = status;
  }

  public ProfileProfileResumesListItemView title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Желаемая должность
   * @return title
  */
  @NotNull 
  @Schema(name = "title", description = "Желаемая должность", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileProfileResumesListItemView profileProfileResumesListItemView = (ProfileProfileResumesListItemView) o;
    return Objects.equals(this.id, profileProfileResumesListItemView.id) &&
        Objects.equals(this.photo, profileProfileResumesListItemView.photo) &&
        Objects.equals(this.status, profileProfileResumesListItemView.status) &&
        Objects.equals(this.title, profileProfileResumesListItemView.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, photo, status, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileProfileResumesListItemView {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

