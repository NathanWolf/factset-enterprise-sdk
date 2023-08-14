/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PAEngine.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.PAEngine.models.PAComponentData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.PAEngine.JSON;


/**
 * TemplatedPAComponentParameters
 */
@JsonPropertyOrder({
  TemplatedPAComponentParameters.JSON_PROPERTY_DIRECTORY,
  TemplatedPAComponentParameters.JSON_PROPERTY_PARENT_TEMPLATE_ID,
  TemplatedPAComponentParameters.JSON_PROPERTY_DESCRIPTION,
  TemplatedPAComponentParameters.JSON_PROPERTY_COMPONENT_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplatedPAComponentParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DIRECTORY = "directory";
  private String directory;

  public static final String JSON_PROPERTY_PARENT_TEMPLATE_ID = "parentTemplateId";
  private String parentTemplateId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMPONENT_DATA = "componentData";
  private PAComponentData componentData;

  public TemplatedPAComponentParameters() { 
  }

  @JsonCreator
  public TemplatedPAComponentParameters(
    @JsonProperty(value=JSON_PROPERTY_DIRECTORY, required=true) String directory, 
    @JsonProperty(value=JSON_PROPERTY_PARENT_TEMPLATE_ID, required=true) String parentTemplateId
  ) {
    this();
    this.directory = directory;
    this.parentTemplateId = parentTemplateId;
  }

  public TemplatedPAComponentParameters directory(String directory) {
    this.directory = directory;
    return this;
  }

   /**
   * Directory to create templated components
   * @return directory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Directory to create templated components")
  @JsonProperty(JSON_PROPERTY_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDirectory() {
    return directory;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDirectory(String directory) {
    this.directory = directory;
  }


  public TemplatedPAComponentParameters parentTemplateId(String parentTemplateId) {
    this.parentTemplateId = parentTemplateId;
    return this;
  }

   /**
   * Parent template id
   * @return parentTemplateId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Parent template id")
  @JsonProperty(JSON_PROPERTY_PARENT_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getParentTemplateId() {
    return parentTemplateId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParentTemplateId(String parentTemplateId) {
    this.parentTemplateId = parentTemplateId;
  }


  public TemplatedPAComponentParameters description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Component description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Component description.")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public TemplatedPAComponentParameters componentData(PAComponentData componentData) {
    this.componentData = componentData;
    return this;
  }

   /**
   * Get componentData
   * @return componentData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPONENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PAComponentData getComponentData() {
    return componentData;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponentData(PAComponentData componentData) {
    this.componentData = componentData;
  }


  /**
   * Return true if this TemplatedPAComponentParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplatedPAComponentParameters templatedPAComponentParameters = (TemplatedPAComponentParameters) o;
    return Objects.equals(this.directory, templatedPAComponentParameters.directory) &&
        Objects.equals(this.parentTemplateId, templatedPAComponentParameters.parentTemplateId) &&
        equalsNullable(this.description, templatedPAComponentParameters.description) &&
        Objects.equals(this.componentData, templatedPAComponentParameters.componentData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, parentTemplateId, hashCodeNullable(description), componentData);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplatedPAComponentParameters {\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    parentTemplateId: ").append(toIndentedString(parentTemplateId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    componentData: ").append(toIndentedString(componentData)).append("\n");
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

