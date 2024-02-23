/*
 * FactSet Formula API
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs. 
 *
 * The version of the OpenAPI document: 1.7.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Formula.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Formula.models.CrossSectionalResultObjectNonflattenedResultAttribute;
import com.factset.sdk.Formula.models.CrossSectionalResultObjectNonflattenedWarnings;
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
import com.factset.sdk.Formula.JSON;


/**
 * An object returning the results for a single formula.
 */
@ApiModel(description = "An object returning the results for a single formula.")
@JsonPropertyOrder({
  CrossSectionalResultObjectNonflattened.JSON_PROPERTY_UNIVERSE,
  CrossSectionalResultObjectNonflattened.JSON_PROPERTY_DATA_ITEM_NAME,
  CrossSectionalResultObjectNonflattened.JSON_PROPERTY_DISPLAY_NAME,
  CrossSectionalResultObjectNonflattened.JSON_PROPERTY_RESULT,
  CrossSectionalResultObjectNonflattened.JSON_PROPERTY_DATA_TYPE,
  CrossSectionalResultObjectNonflattened.JSON_PROPERTY_ERROR,
  CrossSectionalResultObjectNonflattened.JSON_PROPERTY_ERROR_MESSAGE,
  CrossSectionalResultObjectNonflattened.JSON_PROPERTY_WARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CrossSectionalResultObjectNonflattened implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_UNIVERSE = "universe";
  private String universe;

  public static final String JSON_PROPERTY_DATA_ITEM_NAME = "dataItemName";
  private String dataItemName;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private JsonNullable<String> displayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RESULT = "result";
  private java.util.List<CrossSectionalResultObjectNonflattenedResultAttribute> result = new java.util.ArrayList<>();

  /**
   * Data type of the data item
   */
  public enum DataTypeEnum {
    STRING("STRING"),
    
    INTEGER("INTEGER"),
    
    DOUBLE("DOUBLE");

    private String value;

    DataTypeEnum(String value) {
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
    public static DataTypeEnum fromValue(String value) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DATA_TYPE = "dataType";
  private DataTypeEnum dataType;

  public static final String JSON_PROPERTY_ERROR = "error";
  private Integer error;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private java.util.List<CrossSectionalResultObjectNonflattenedWarnings> warnings = null;

  public CrossSectionalResultObjectNonflattened() { 
  }

  @JsonCreator
  public CrossSectionalResultObjectNonflattened(
    @JsonProperty(value=JSON_PROPERTY_DATA_ITEM_NAME, required=true) String dataItemName, 
    @JsonProperty(value=JSON_PROPERTY_RESULT, required=true) java.util.List<CrossSectionalResultObjectNonflattenedResultAttribute> result, 
    @JsonProperty(value=JSON_PROPERTY_DATA_TYPE, required=true) DataTypeEnum dataType, 
    @JsonProperty(value=JSON_PROPERTY_ERROR, required=true) Integer error
  ) {
    this();
    this.dataItemName = dataItemName;
    this.result = result;
    this.dataType = dataType;
    this.error = error;
  }

  public CrossSectionalResultObjectNonflattened universe(String universe) {
    this.universe = universe;
    return this;
  }

   /**
   * If &#x60;universe&#x60; is submitted instead of &#x60;ids&#x60;, then the universe attribute will display the universe expression requested.
   * @return universe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "(FG_CONSTITUENTS(SP50,0,CLOSE) AND P_PRICE(0,USD)<10)=1", value = "If `universe` is submitted instead of `ids`, then the universe attribute will display the universe expression requested.")
  @JsonProperty(JSON_PROPERTY_UNIVERSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniverse() {
    return universe;
  }


  @JsonProperty(JSON_PROPERTY_UNIVERSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniverse(String universe) {
    this.universe = universe;
  }


  public CrossSectionalResultObjectNonflattened dataItemName(String dataItemName) {
    this.dataItemName = dataItemName;
    return this;
  }

   /**
   * Name of data item (requestId, requested Screening formula, or fsymId)
   * @return dataItemName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "P_PRICE(0)", required = true, value = "Name of data item (requestId, requested Screening formula, or fsymId)")
  @JsonProperty(JSON_PROPERTY_DATA_ITEM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDataItemName() {
    return dataItemName;
  }


  @JsonProperty(JSON_PROPERTY_DATA_ITEM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataItemName(String dataItemName) {
    this.dataItemName = dataItemName;
  }


  public CrossSectionalResultObjectNonflattened displayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
    return this;
  }

   /**
   * Display Name.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PRICE", value = "Display Name.")
  @JsonIgnore

  public String getDisplayName() {
        return displayName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDisplayName_JsonNullable() {
    return displayName;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  public void setDisplayName_JsonNullable(JsonNullable<String> displayName) {
    this.displayName = displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = JsonNullable.<String>of(displayName);
  }


  public CrossSectionalResultObjectNonflattened result(java.util.List<CrossSectionalResultObjectNonflattenedResultAttribute> result) {
    this.result = result;
    return this;
  }

  public CrossSectionalResultObjectNonflattened addResultItem(CrossSectionalResultObjectNonflattenedResultAttribute resultItem) {
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<CrossSectionalResultObjectNonflattenedResultAttribute> getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResult(java.util.List<CrossSectionalResultObjectNonflattenedResultAttribute> result) {
    this.result = result;
  }


  public CrossSectionalResultObjectNonflattened dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Data type of the data item
   * @return dataType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "STRING", required = true, value = "Data type of the data item")
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DataTypeEnum getDataType() {
    return dataType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }


  public CrossSectionalResultObjectNonflattened error(Integer error) {
    this.error = error;
    return this;
  }

   /**
   * Data item error indicator.  * Zero – success  * Non-zero – failure 
   * @return error
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Data item error indicator.  * Zero – success  * Non-zero – failure ")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setError(Integer error) {
    this.error = error;
  }


  public CrossSectionalResultObjectNonflattened errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    return this;
  }

   /**
   * If error is non-zero, errorMessage will display the Screening formula error.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Error parsing formula arguments ", value = "If error is non-zero, errorMessage will display the Screening formula error.")
  @JsonIgnore

  public String getErrorMessage() {
        return errorMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorMessage_JsonNullable() {
    return errorMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  public void setErrorMessage_JsonNullable(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
  }


  public CrossSectionalResultObjectNonflattened warnings(java.util.List<CrossSectionalResultObjectNonflattenedWarnings> warnings) {
    this.warnings = warnings;
    return this;
  }

  public CrossSectionalResultObjectNonflattened addWarningsItem(CrossSectionalResultObjectNonflattenedWarnings warningsItem) {
    if (this.warnings == null) {
      this.warnings = new java.util.ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Screening formula warnings. This attribute is only displayed if warnings are generated in the execution of the Screening formula.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Screening formula warnings. This attribute is only displayed if warnings are generated in the execution of the Screening formula.")
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<CrossSectionalResultObjectNonflattenedWarnings> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(java.util.List<CrossSectionalResultObjectNonflattenedWarnings> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this cross_sectional_result_object_nonflattened object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossSectionalResultObjectNonflattened crossSectionalResultObjectNonflattened = (CrossSectionalResultObjectNonflattened) o;
    return Objects.equals(this.universe, crossSectionalResultObjectNonflattened.universe) &&
        Objects.equals(this.dataItemName, crossSectionalResultObjectNonflattened.dataItemName) &&
        equalsNullable(this.displayName, crossSectionalResultObjectNonflattened.displayName) &&
        Objects.equals(this.result, crossSectionalResultObjectNonflattened.result) &&
        Objects.equals(this.dataType, crossSectionalResultObjectNonflattened.dataType) &&
        Objects.equals(this.error, crossSectionalResultObjectNonflattened.error) &&
        equalsNullable(this.errorMessage, crossSectionalResultObjectNonflattened.errorMessage) &&
        Objects.equals(this.warnings, crossSectionalResultObjectNonflattened.warnings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(universe, dataItemName, hashCodeNullable(displayName), result, dataType, error, hashCodeNullable(errorMessage), warnings);
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
    sb.append("class CrossSectionalResultObjectNonflattened {\n");
    sb.append("    universe: ").append(toIndentedString(universe)).append("\n");
    sb.append("    dataItemName: ").append(toIndentedString(dataItemName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

