/*
 * FactSet Fundamentals API
 *
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.FactSetFundamentals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFundamentals.Model
{
    /// <summary>
    /// Metric
    /// </summary>
    [DataContract(Name = "metric")]
    public partial class Metric : IEquatable<Metric>, IValidatableObject
    {
        /// <summary>
        /// An indicator for which Standard Data Feed (SDF) package the item is available in - BASIC or ADVANCED. A null value represents items available only in API.
        /// </summary>
        /// <value>An indicator for which Standard Data Feed (SDF) package the item is available in - BASIC or ADVANCED. A null value represents items available only in API.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SdfPackageEnum
        {
            /// <summary>
            /// Enum BASIC for value: BASIC
            /// </summary>
            [EnumMember(Value = "BASIC")]
            BASIC = 1,

            /// <summary>
            /// Enum ADVANCED for value: ADVANCED
            /// </summary>
            [EnumMember(Value = "ADVANCED")]
            ADVANCED = 2

        }


        /// <summary>
        /// An indicator for which Standard Data Feed (SDF) package the item is available in - BASIC or ADVANCED. A null value represents items available only in API.
        /// </summary>
        /// <value>An indicator for which Standard Data Feed (SDF) package the item is available in - BASIC or ADVANCED. A null value represents items available only in API.</value>
        [DataMember(Name = "sdfPackage", EmitDefaultValue = false)]
        public SdfPackageEnum? SdfPackage { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Metric" /> class.
        /// </summary>
        /// <param name="metric">Metric identifier to be used as &#x60;metrics&#x60; input in &#x60;/fundamentals/v#/fundamentals&#x60; endpoint..</param>
        /// <param name="name">Plain text name of the metric..</param>
        /// <param name="category">Primary Category of metric item, such as, INCOME_STATEMENT, BALANCE_SHEET, CASH_FLOW, or RATIOS..</param>
        /// <param name="subcategory">Sub-category of metric item, such as ASSETS, SUPPLEMENTAL, SHAREHOLDERS_EQUITY, VALUATION, PROFITABILITY, etc..</param>
        /// <param name="oAPageId">The Online Assistant Page ID in D***** format, used to lookup the definition and methodology of the requested item. Visit my.apps.factset.com/oa/pages/[D*****] for details. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES..</param>
        /// <param name="oAurl">The Online Assistant Page URL, used to lookup the definition and methodology of the requested item. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES..</param>
        /// <param name="factor">The factor for the metric (e.g. 1000 &#x3D; thousands)..</param>
        /// <param name="sdfPackage">An indicator for which Standard Data Feed (SDF) package the item is available in - BASIC or ADVANCED. A null value represents items available only in API..</param>
        /// <param name="dataType">The data type for the metric. Make note, mixing data types within a single /fundamentals API is not supported. Each dataType is defined below -   * **date** - date format expressed in YYYY-MM-DD.   * **doubleArray** - A double is a FactSet data type, similar to a float or an integer. A double represents numeric data but provides for a greater amount of decimal precision than the float data type. Double values have up to 15 digits of precision, while float values have up to 7 digits (integers have up to 10 digits).   * **float** - A float value is a real number (i.e., a number that can contain a fractional part/decimals). A float value has a precision up to seven digits and accurately represents numbers whose absolute value is less than 16,277,216 (224). An example metric includes   * **floatArray** - unction will hold data for multiple time-periods, as well as for many companies (i.e., two-dimensional value). The FLOATARRAY function returns data using a vertical orientation (e.g., down a column). The difference between FLOAT and FLOATARRAY is that FLOAT can only go across a row (one-dimension; horizontal orientation; vertical length&#x3D;1) whereas FLOATARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With FLOATARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time-series.   * **intArray** - An integer is a whole number or zero (i.e., integers do not include decimals). Integers can be positive or negative.   * **string** - A string value is an ASCII character. A string is a sequence of ASCII characters. String value and text value are synonymous. Function will hold data for multiple time-periods, as well as for many companies (i.e., two-dimensional value). The STRING_ARRAY function returns data using a vertical orientation (e.g., down a column)   * **stringArray** - The difference between STRING and STRINGARRAY is that STRING can only go across a row (one-dimension; horizontal orientation; vertical length&#x3D;1) whereas STRINGARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With STRINGARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time-series. .</param>
        public Metric(string metric = default(string), string name = default(string), string category = default(string), string subcategory = default(string), string oAPageId = default(string), string oAurl = default(string), int factor = default(int), SdfPackageEnum? sdfPackage = default(SdfPackageEnum?), string dataType = default(string))
        {
            this._Metric = metric;
            this.Name = name;
            this.Category = category;
            this.Subcategory = subcategory;
            this.OAPageId = oAPageId;
            this.OAurl = oAurl;
            this.Factor = factor;
            this.SdfPackage = sdfPackage;
            this.DataType = dataType;
        }

        /// <summary>
        /// Metric identifier to be used as &#x60;metrics&#x60; input in &#x60;/fundamentals/v#/fundamentals&#x60; endpoint.
        /// </summary>
        /// <value>Metric identifier to be used as &#x60;metrics&#x60; input in &#x60;/fundamentals/v#/fundamentals&#x60; endpoint.</value>
        [DataMember(Name = "metric", EmitDefaultValue = false)]
        public string _Metric { get; set; }

        /// <summary>
        /// Plain text name of the metric.
        /// </summary>
        /// <value>Plain text name of the metric.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Primary Category of metric item, such as, INCOME_STATEMENT, BALANCE_SHEET, CASH_FLOW, or RATIOS.
        /// </summary>
        /// <value>Primary Category of metric item, such as, INCOME_STATEMENT, BALANCE_SHEET, CASH_FLOW, or RATIOS.</value>
        [DataMember(Name = "category", EmitDefaultValue = false)]
        public string Category { get; set; }

        /// <summary>
        /// Sub-category of metric item, such as ASSETS, SUPPLEMENTAL, SHAREHOLDERS_EQUITY, VALUATION, PROFITABILITY, etc.
        /// </summary>
        /// <value>Sub-category of metric item, such as ASSETS, SUPPLEMENTAL, SHAREHOLDERS_EQUITY, VALUATION, PROFITABILITY, etc.</value>
        [DataMember(Name = "subcategory", EmitDefaultValue = false)]
        public string Subcategory { get; set; }

        /// <summary>
        /// The Online Assistant Page ID in D***** format, used to lookup the definition and methodology of the requested item. Visit my.apps.factset.com/oa/pages/[D*****] for details. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES.
        /// </summary>
        /// <value>The Online Assistant Page ID in D***** format, used to lookup the definition and methodology of the requested item. Visit my.apps.factset.com/oa/pages/[D*****] for details. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES.</value>
        [DataMember(Name = "OAPageId", EmitDefaultValue = false)]
        public string OAPageId { get; set; }

        /// <summary>
        /// The Online Assistant Page URL, used to lookup the definition and methodology of the requested item. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES.
        /// </summary>
        /// <value>The Online Assistant Page URL, used to lookup the definition and methodology of the requested item. For example, https://my.apps.factset.com/oa/pages/D10585 will give you the definition for FF_SALES.</value>
        [DataMember(Name = "OAurl", EmitDefaultValue = false)]
        public string OAurl { get; set; }

        /// <summary>
        /// The factor for the metric (e.g. 1000 &#x3D; thousands).
        /// </summary>
        /// <value>The factor for the metric (e.g. 1000 &#x3D; thousands).</value>
        [DataMember(Name = "factor", EmitDefaultValue = false)]
        public int Factor { get; set; }

        /// <summary>
        /// The data type for the metric. Make note, mixing data types within a single /fundamentals API is not supported. Each dataType is defined below -   * **date** - date format expressed in YYYY-MM-DD.   * **doubleArray** - A double is a FactSet data type, similar to a float or an integer. A double represents numeric data but provides for a greater amount of decimal precision than the float data type. Double values have up to 15 digits of precision, while float values have up to 7 digits (integers have up to 10 digits).   * **float** - A float value is a real number (i.e., a number that can contain a fractional part/decimals). A float value has a precision up to seven digits and accurately represents numbers whose absolute value is less than 16,277,216 (224). An example metric includes   * **floatArray** - unction will hold data for multiple time-periods, as well as for many companies (i.e., two-dimensional value). The FLOATARRAY function returns data using a vertical orientation (e.g., down a column). The difference between FLOAT and FLOATARRAY is that FLOAT can only go across a row (one-dimension; horizontal orientation; vertical length&#x3D;1) whereas FLOATARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With FLOATARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time-series.   * **intArray** - An integer is a whole number or zero (i.e., integers do not include decimals). Integers can be positive or negative.   * **string** - A string value is an ASCII character. A string is a sequence of ASCII characters. String value and text value are synonymous. Function will hold data for multiple time-periods, as well as for many companies (i.e., two-dimensional value). The STRING_ARRAY function returns data using a vertical orientation (e.g., down a column)   * **stringArray** - The difference between STRING and STRINGARRAY is that STRING can only go across a row (one-dimension; horizontal orientation; vertical length&#x3D;1) whereas STRINGARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With STRINGARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time-series. 
        /// </summary>
        /// <value>The data type for the metric. Make note, mixing data types within a single /fundamentals API is not supported. Each dataType is defined below -   * **date** - date format expressed in YYYY-MM-DD.   * **doubleArray** - A double is a FactSet data type, similar to a float or an integer. A double represents numeric data but provides for a greater amount of decimal precision than the float data type. Double values have up to 15 digits of precision, while float values have up to 7 digits (integers have up to 10 digits).   * **float** - A float value is a real number (i.e., a number that can contain a fractional part/decimals). A float value has a precision up to seven digits and accurately represents numbers whose absolute value is less than 16,277,216 (224). An example metric includes   * **floatArray** - unction will hold data for multiple time-periods, as well as for many companies (i.e., two-dimensional value). The FLOATARRAY function returns data using a vertical orientation (e.g., down a column). The difference between FLOAT and FLOATARRAY is that FLOAT can only go across a row (one-dimension; horizontal orientation; vertical length&#x3D;1) whereas FLOATARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With FLOATARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time-series.   * **intArray** - An integer is a whole number or zero (i.e., integers do not include decimals). Integers can be positive or negative.   * **string** - A string value is an ASCII character. A string is a sequence of ASCII characters. String value and text value are synonymous. Function will hold data for multiple time-periods, as well as for many companies (i.e., two-dimensional value). The STRING_ARRAY function returns data using a vertical orientation (e.g., down a column)   * **stringArray** - The difference between STRING and STRINGARRAY is that STRING can only go across a row (one-dimension; horizontal orientation; vertical length&#x3D;1) whereas STRINGARRAY will return data both across a row and down a column (two-dimensions; vertical orientation). With STRINGARRAY, the number of data points across a row will correspond to the number of companies queried; the number of data points down a column will correspond to the length of the time-series. </value>
        [DataMember(Name = "dataType", EmitDefaultValue = false)]
        public string DataType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Metric {\n");
            sb.Append("  _Metric: ").Append(_Metric).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  Subcategory: ").Append(Subcategory).Append("\n");
            sb.Append("  OAPageId: ").Append(OAPageId).Append("\n");
            sb.Append("  OAurl: ").Append(OAurl).Append("\n");
            sb.Append("  Factor: ").Append(Factor).Append("\n");
            sb.Append("  SdfPackage: ").Append(SdfPackage).Append("\n");
            sb.Append("  DataType: ").Append(DataType).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Metric);
        }

        /// <summary>
        /// Returns true if Metric instances are equal
        /// </summary>
        /// <param name="input">Instance of Metric to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Metric input)
        {
            if (input == null)
                return false;

            return 
                (
                    this._Metric == input._Metric ||
                    (this._Metric != null &&
                    this._Metric.Equals(input._Metric))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.Subcategory == input.Subcategory ||
                    (this.Subcategory != null &&
                    this.Subcategory.Equals(input.Subcategory))
                ) && 
                (
                    this.OAPageId == input.OAPageId ||
                    (this.OAPageId != null &&
                    this.OAPageId.Equals(input.OAPageId))
                ) && 
                (
                    this.OAurl == input.OAurl ||
                    (this.OAurl != null &&
                    this.OAurl.Equals(input.OAurl))
                ) && 
                (
                    this.Factor == input.Factor ||
                    this.Factor.Equals(input.Factor)
                ) && 
                (
                    this.SdfPackage == input.SdfPackage ||
                    this.SdfPackage.Equals(input.SdfPackage)
                ) && 
                (
                    this.DataType == input.DataType ||
                    (this.DataType != null &&
                    this.DataType.Equals(input.DataType))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this._Metric != null)
                    hashCode = hashCode * 59 + this._Metric.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Category != null)
                    hashCode = hashCode * 59 + this.Category.GetHashCode();
                if (this.Subcategory != null)
                    hashCode = hashCode * 59 + this.Subcategory.GetHashCode();
                if (this.OAPageId != null)
                    hashCode = hashCode * 59 + this.OAPageId.GetHashCode();
                if (this.OAurl != null)
                    hashCode = hashCode * 59 + this.OAurl.GetHashCode();
                hashCode = hashCode * 59 + this.Factor.GetHashCode();
                hashCode = hashCode * 59 + this.SdfPackage.GetHashCode();
                if (this.DataType != null)
                    hashCode = hashCode * 59 + this.DataType.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
