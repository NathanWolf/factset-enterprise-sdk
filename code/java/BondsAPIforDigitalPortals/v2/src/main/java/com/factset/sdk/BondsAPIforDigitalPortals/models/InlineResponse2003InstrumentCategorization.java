/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BondsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003InstrumentCategorizationLevel1;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003InstrumentCategorizationLevel2;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003InstrumentCategorizationLevel3;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BondsAPIforDigitalPortals.JSON;


/**
 * Debt instrument categorization. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;18&#x60; for valid values.
 */
@ApiModel(description = "Debt instrument categorization. See endpoint `/category/listBySystem` with `id=18` for valid values.")
@JsonPropertyOrder({
  InlineResponse2003InstrumentCategorization.JSON_PROPERTY_LEVEL1,
  InlineResponse2003InstrumentCategorization.JSON_PROPERTY_LEVEL2,
  InlineResponse2003InstrumentCategorization.JSON_PROPERTY_LEVEL3
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003InstrumentCategorization implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LEVEL1 = "level1";
  private InlineResponse2003InstrumentCategorizationLevel1 level1;

  public static final String JSON_PROPERTY_LEVEL2 = "level2";
  private InlineResponse2003InstrumentCategorizationLevel2 level2;

  public static final String JSON_PROPERTY_LEVEL3 = "level3";
  private InlineResponse2003InstrumentCategorizationLevel3 level3;

  public InlineResponse2003InstrumentCategorization() { 
  }

  public InlineResponse2003InstrumentCategorization level1(InlineResponse2003InstrumentCategorizationLevel1 level1) {
    this.level1 = level1;
    return this;
  }

   /**
   * Get level1
   * @return level1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003InstrumentCategorizationLevel1 getLevel1() {
    return level1;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel1(InlineResponse2003InstrumentCategorizationLevel1 level1) {
    this.level1 = level1;
  }


  public InlineResponse2003InstrumentCategorization level2(InlineResponse2003InstrumentCategorizationLevel2 level2) {
    this.level2 = level2;
    return this;
  }

   /**
   * Get level2
   * @return level2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003InstrumentCategorizationLevel2 getLevel2() {
    return level2;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel2(InlineResponse2003InstrumentCategorizationLevel2 level2) {
    this.level2 = level2;
  }


  public InlineResponse2003InstrumentCategorization level3(InlineResponse2003InstrumentCategorizationLevel3 level3) {
    this.level3 = level3;
    return this;
  }

   /**
   * Get level3
   * @return level3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003InstrumentCategorizationLevel3 getLevel3() {
    return level3;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel3(InlineResponse2003InstrumentCategorizationLevel3 level3) {
    this.level3 = level3;
  }


  /**
   * Return true if this inline_response_200_3_instrument_categorization object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003InstrumentCategorization inlineResponse2003InstrumentCategorization = (InlineResponse2003InstrumentCategorization) o;
    return Objects.equals(this.level1, inlineResponse2003InstrumentCategorization.level1) &&
        Objects.equals(this.level2, inlineResponse2003InstrumentCategorization.level2) &&
        Objects.equals(this.level3, inlineResponse2003InstrumentCategorization.level3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level1, level2, level3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003InstrumentCategorization {\n");
    sb.append("    level1: ").append(toIndentedString(level1)).append("\n");
    sb.append("    level2: ").append(toIndentedString(level2)).append("\n");
    sb.append("    level3: ").append(toIndentedString(level3)).append("\n");
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

