package ru.brobrocode.cadra.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Информация о персональном менеджере для работодателя
 */

@Schema(name = "MeEmployerProfilePersonalManager", description = "Информация о персональном менеджере для работодателя")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-17T15:41:09.394389505+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.6.0")
public class MeEmployerProfilePersonalManager {

  private String email;

  private String firstName;

  private String id;

  private Boolean isAvailable;

  private String lastName;

  private MeEmployerProfilePersonalManagerPhotoUrls photoUrls = null;

  private MeEmployerProfilePersonalManagerUnavailable unavailable = null;

  public MeEmployerProfilePersonalManager() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MeEmployerProfilePersonalManager(String email, String firstName, String id, Boolean isAvailable, String lastName) {
    this.email = email;
    this.firstName = firstName;
    this.id = id;
    this.isAvailable = isAvailable;
    this.lastName = lastName;
  }

  public MeEmployerProfilePersonalManager email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email персонального менеджера
   * @return email
  */
  @NotNull @Email
  @Schema(name = "email", example = "smirnov@example.com", description = "Email персонального менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MeEmployerProfilePersonalManager firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Имя персонального менеджера
   * @return firstName
  */
  @NotNull 
  @Schema(name = "first_name", example = "Николай", description = "Имя персонального менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public MeEmployerProfilePersonalManager id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор персонального менеджера
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "1234567", description = "Идентификатор персонального менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MeEmployerProfilePersonalManager isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

  /**
   * Доступен ли менеджер в данный момент
   * @return isAvailable
  */
  @NotNull 
  @Schema(name = "is_available", example = "false", description = "Доступен ли менеджер в данный момент", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_available")
  public Boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public MeEmployerProfilePersonalManager lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Фамилия персонального менеджера
   * @return lastName
  */
  @NotNull 
  @Schema(name = "last_name", example = "Смирнов", description = "Фамилия персонального менеджера", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public MeEmployerProfilePersonalManager photoUrls(MeEmployerProfilePersonalManagerPhotoUrls photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  /**
   * Get photoUrls
   * @return photoUrls
  */
  @Valid 
  @Schema(name = "photo_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photo_urls")
  public MeEmployerProfilePersonalManagerPhotoUrls getPhotoUrls() {
    return photoUrls;
  }

  public void setPhotoUrls(MeEmployerProfilePersonalManagerPhotoUrls photoUrls) {
    this.photoUrls = photoUrls;
  }

  public MeEmployerProfilePersonalManager unavailable(MeEmployerProfilePersonalManagerUnavailable unavailable) {
    this.unavailable = unavailable;
    return this;
  }

  /**
   * Get unavailable
   * @return unavailable
  */
  @Valid 
  @Schema(name = "unavailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unavailable")
  public MeEmployerProfilePersonalManagerUnavailable getUnavailable() {
    return unavailable;
  }

  public void setUnavailable(MeEmployerProfilePersonalManagerUnavailable unavailable) {
    this.unavailable = unavailable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeEmployerProfilePersonalManager meEmployerProfilePersonalManager = (MeEmployerProfilePersonalManager) o;
    return Objects.equals(this.email, meEmployerProfilePersonalManager.email) &&
        Objects.equals(this.firstName, meEmployerProfilePersonalManager.firstName) &&
        Objects.equals(this.id, meEmployerProfilePersonalManager.id) &&
        Objects.equals(this.isAvailable, meEmployerProfilePersonalManager.isAvailable) &&
        Objects.equals(this.lastName, meEmployerProfilePersonalManager.lastName) &&
        Objects.equals(this.photoUrls, meEmployerProfilePersonalManager.photoUrls) &&
        Objects.equals(this.unavailable, meEmployerProfilePersonalManager.unavailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, id, isAvailable, lastName, photoUrls, unavailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeEmployerProfilePersonalManager {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    unavailable: ").append(toIndentedString(unavailable)).append("\n");
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

