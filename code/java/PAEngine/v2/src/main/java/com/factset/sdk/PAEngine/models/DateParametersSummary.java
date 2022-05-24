/*
 * PA Engine API
 * Allow clients to fetch PA Engine Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.PAEngine.JSON;


/**
 * DateParametersSummary
 */
@JsonPropertyOrder({
  DateParametersSummary.JSON_PROPERTY_STARTDATE,
  DateParametersSummary.JSON_PROPERTY_ENDDATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DateParametersSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STARTDATE = "startdate";
  private String startdate;

  public static final String JSON_PROPERTY_ENDDATE = "enddate";
  private String enddate;

  public DateParametersSummary() { 
  }

  public DateParametersSummary startdate(String startdate) {
    this.startdate = startdate;
    return this;
  }

   /**
   * Start date in YYYYMMDD format.
   * @return startdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start date in YYYYMMDD format.")
  @JsonProperty(JSON_PROPERTY_STARTDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartdate() {
    return startdate;
  }


  @JsonProperty(JSON_PROPERTY_STARTDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartdate(String startdate) {
    this.startdate = startdate;
  }


  public DateParametersSummary enddate(String enddate) {
    this.enddate = enddate;
    return this;
  }

   /**
   * End date in YYYYMMDD format.
   * @return enddate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End date in YYYYMMDD format.")
  @JsonProperty(JSON_PROPERTY_ENDDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnddate() {
    return enddate;
  }


  @JsonProperty(JSON_PROPERTY_ENDDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnddate(String enddate) {
    this.enddate = enddate;
  }


  /**
   * Return true if this DateParametersSummary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateParametersSummary dateParametersSummary = (DateParametersSummary) o;
    return Objects.equals(this.startdate, dateParametersSummary.startdate) &&
        Objects.equals(this.enddate, dateParametersSummary.enddate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startdate, enddate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateParametersSummary {\n");
    sb.append("    startdate: ").append(toIndentedString(startdate)).append("\n");
    sb.append("    enddate: ").append(toIndentedString(enddate)).append("\n");
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

