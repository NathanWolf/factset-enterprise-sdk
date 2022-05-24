/*
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ProcuretoPayAPISCIM.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ProcuretoPayAPISCIM.JSON;


/**
 * VermilionGroupResourceMembers
 */
@JsonPropertyOrder({
  VermilionGroupResourceMembers.JSON_PROPERTY_VALUE,
  VermilionGroupResourceMembers.JSON_PROPERTY_$_REF,
  VermilionGroupResourceMembers.JSON_PROPERTY_DISPLAY,
  VermilionGroupResourceMembers.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VermilionGroupResourceMembers implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_$_REF = "$ref";
  private String $ref;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public VermilionGroupResourceMembers() { 
  }

  @JsonCreator
  public VermilionGroupResourceMembers(
    @JsonProperty(value=JSON_PROPERTY_VALUE, required=true) String value
  ) {
    this();
    this.value = value;
  }

  public VermilionGroupResourceMembers value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Identifier of the member of this Group.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "vrsqa-jrs-01:21", required = true, value = "Identifier of the member of this Group.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  public VermilionGroupResourceMembers $ref(String $ref) {
    this.$ref = $ref;
    return this;
  }

   /**
   * The uri corresponding to a SCIM resource that is a member of this Group.
   * @return $ref
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.factset.com/scim/v2/VermilionUsers/vrsqa-jrs-01:21", value = "The uri corresponding to a SCIM resource that is a member of this Group.")
  @JsonProperty(JSON_PROPERTY_$_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String get$Ref() {
    return $ref;
  }


  @JsonProperty(JSON_PROPERTY_$_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set$Ref(String $ref) {
    this.$ref = $ref;
  }


  public VermilionGroupResourceMembers display(String display) {
    this.display = display;
    return this;
  }

   /**
   * A human-readable name for the Member
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "A human-readable name for the Member")
  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplay() {
    return display;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplay(String display) {
    this.display = display;
  }


  public VermilionGroupResourceMembers type(String type) {
    this.type = type;
    return this;
  }

   /**
   * A label indicating the type of resource, e.g. &#39;User&#39; or &#39;Group&#39;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VermilionUser", value = "A label indicating the type of resource, e.g. 'User' or 'Group'")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this VermilionGroupResource_members object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VermilionGroupResourceMembers vermilionGroupResourceMembers = (VermilionGroupResourceMembers) o;
    return Objects.equals(this.value, vermilionGroupResourceMembers.value) &&
        Objects.equals(this.$ref, vermilionGroupResourceMembers.$ref) &&
        Objects.equals(this.display, vermilionGroupResourceMembers.display) &&
        Objects.equals(this.type, vermilionGroupResourceMembers.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, $ref, display, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VermilionGroupResourceMembers {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    $ref: ").append(toIndentedString($ref)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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

