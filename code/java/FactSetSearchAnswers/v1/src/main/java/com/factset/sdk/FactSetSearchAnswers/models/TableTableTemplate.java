/*
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: FactSearch.Team@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetSearchAnswers.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetSearchAnswers.models.ApplicationLink;
import com.factset.sdk.FactSetSearchAnswers.models.Fdc3Context;
import com.factset.sdk.FactSetSearchAnswers.models.Table;
import com.factset.sdk.FactSetSearchAnswers.models.TableTableTemplateAllOf;
import com.factset.sdk.FactSetSearchAnswers.models.TemplateWithLinks;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetSearchAnswers.JSON;


/**
 * TableTableTemplate
 */
@JsonPropertyOrder({
  TableTableTemplate.JSON_PROPERTY_HEADLINE,
  TableTableTemplate.JSON_PROPERTY_FOOTER,
  TableTableTemplate.JSON_PROPERTY_FDC3_CONTEXT,
  TableTableTemplate.JSON_PROPERTY_APPLICATION_LINKS,
  TableTableTemplate.JSON_PROPERTY_TABLE1,
  TableTableTemplate.JSON_PROPERTY_TABLE2
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TableTableTemplate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_FOOTER = "footer";
  private String footer;

  public static final String JSON_PROPERTY_FDC3_CONTEXT = "fdc3Context";
  private Fdc3Context fdc3Context;

  public static final String JSON_PROPERTY_APPLICATION_LINKS = "applicationLinks";
  private java.util.List<ApplicationLink> applicationLinks = null;

  public static final String JSON_PROPERTY_TABLE1 = "table1";
  private Table table1;

  public static final String JSON_PROPERTY_TABLE2 = "table2";
  private Table table2;

  public TableTableTemplate() { 
  }

  @JsonCreator
  public TableTableTemplate(
    @JsonProperty(value=JSON_PROPERTY_HEADLINE, required=true) String headline
  ) {
    this();
    this.headline = headline;
  }

  public TableTableTemplate headline(String headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Get headline
   * @return headline
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHeadline() {
    return headline;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeadline(String headline) {
    this.headline = headline;
  }


  public TableTableTemplate footer(String footer) {
    this.footer = footer;
    return this;
  }

   /**
   * Get footer
   * @return footer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FOOTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFooter() {
    return footer;
  }


  @JsonProperty(JSON_PROPERTY_FOOTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFooter(String footer) {
    this.footer = footer;
  }


  public TableTableTemplate fdc3Context(Fdc3Context fdc3Context) {
    this.fdc3Context = fdc3Context;
    return this;
  }

   /**
   * Get fdc3Context
   * @return fdc3Context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FDC3_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Fdc3Context getFdc3Context() {
    return fdc3Context;
  }


  @JsonProperty(JSON_PROPERTY_FDC3_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFdc3Context(Fdc3Context fdc3Context) {
    this.fdc3Context = fdc3Context;
  }


  public TableTableTemplate applicationLinks(java.util.List<ApplicationLink> applicationLinks) {
    this.applicationLinks = applicationLinks;
    return this;
  }

  public TableTableTemplate addApplicationLinksItem(ApplicationLink applicationLinksItem) {
    if (this.applicationLinks == null) {
      this.applicationLinks = new java.util.ArrayList<>();
    }
    this.applicationLinks.add(applicationLinksItem);
    return this;
  }

   /**
   * Get applicationLinks
   * @return applicationLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLICATION_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<ApplicationLink> getApplicationLinks() {
    return applicationLinks;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationLinks(java.util.List<ApplicationLink> applicationLinks) {
    this.applicationLinks = applicationLinks;
  }


  public TableTableTemplate table1(Table table1) {
    this.table1 = table1;
    return this;
  }

   /**
   * Get table1
   * @return table1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TABLE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Table getTable1() {
    return table1;
  }


  @JsonProperty(JSON_PROPERTY_TABLE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTable1(Table table1) {
    this.table1 = table1;
  }


  public TableTableTemplate table2(Table table2) {
    this.table2 = table2;
    return this;
  }

   /**
   * Get table2
   * @return table2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TABLE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Table getTable2() {
    return table2;
  }


  @JsonProperty(JSON_PROPERTY_TABLE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTable2(Table table2) {
    this.table2 = table2;
  }


  /**
   * Return true if this TableTableTemplate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableTableTemplate tableTableTemplate = (TableTableTemplate) o;
    return Objects.equals(this.headline, tableTableTemplate.headline) &&
        Objects.equals(this.footer, tableTableTemplate.footer) &&
        Objects.equals(this.fdc3Context, tableTableTemplate.fdc3Context) &&
        Objects.equals(this.applicationLinks, tableTableTemplate.applicationLinks) &&
        Objects.equals(this.table1, tableTableTemplate.table1) &&
        Objects.equals(this.table2, tableTableTemplate.table2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, footer, fdc3Context, applicationLinks, table1, table2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableTableTemplate {\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    fdc3Context: ").append(toIndentedString(fdc3Context)).append("\n");
    sb.append("    applicationLinks: ").append(toIndentedString(applicationLinks)).append("\n");
    sb.append("    table1: ").append(toIndentedString(table1)).append("\n");
    sb.append("    table2: ").append(toIndentedString(table2)).append("\n");
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

