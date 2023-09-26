/*
 * FactSet Formula API
 *
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs. 
 *
 * The version of the OpenAPI document: 1.7.0
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
using OpenAPIDateConverter = FactSet.SDK.Formula.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Formula.Model
{
    /// <summary>
    ///  Data model returned when the parameter **flatten&#x3D;Y** is used in the request. This flattened, simplified JSON output returned from **flatten&#x3D;Y** can be conceptualized as a table (rows and columns) where each data object in the result is a row in the table and each field names is a column name. The response will contain at least one data object for each requestId containing the requestId, fsymId (if requested), date (if applicable) and Key-Value pairs for each data item (formula). The number of data objects (rows) per requestId is dependent the the objectTypes of the formulas requested.  - -- Formulas that have associated dates (TIMESERIES objectType in the standard **flatten&#x3D;N** response model) will result in a data object for each date for each requestId.  **flatten&#x3D;N TIMESERIES Representation** &#x60;&#x60;&#x60;json [   {     \&quot;requestId\&quot;: \&quot;id\&quot;,     \&quot;formula\&quot;: \&quot;formulaName1\&quot;,     \&quot;result\&quot;: {         \&quot;values\&quot;: [a,b],         \&quot;dates\&quot;: [DATE1,DATE2]       },     \&quot;objectType\&quot;: \&quot;TIMESERIES\&quot;,     \&quot;dataType\&quot;: \&quot;DOUBLE\&quot;   },   {     \&quot;requestId\&quot;: \&quot;id\&quot;,     \&quot;formula\&quot;: \&quot;formulaName2\&quot;,     \&quot;result\&quot;: {         \&quot;values\&quot;: [c,d],         \&quot;dates\&quot;: [DATE2,DATE3]       },     \&quot;objectType\&quot;: \&quot;TIMESERIES\&quot;,     \&quot;dataType\&quot;: \&quot;DOUBLE\&quot;   } ] &#x60;&#x60;&#x60;  **flatten&#x3D;Y TIMESERIES Representation** &#x60;&#x60;&#x60;json [   {     \&quot;requestId\&quot;: \&quot;id\&quot;,     \&quot;formulaName1\&quot;: a,     \&quot;formulaName2\&quot;: null,     \&quot;date\&quot;: DATE1   },   {     \&quot;requestId\&quot;: \&quot;id\&quot;,     \&quot;formulaName1\&quot;: b,     \&quot;formulaName2\&quot;: c,     \&quot;date\&quot;: DATE2   },   {     \&quot;requestId\&quot;: \&quot;id\&quot;,     \&quot;formulaName1\&quot;: null,     \&quot;formulaName2\&quot;: d,     \&quot;date\&quot;: DATE3   } ] &#x60;&#x60;&#x60; - --  Formulas that result in an array (no associated dates, ARRAY objectType in the standard **flatten&#x3D;N** response model) can be thought of as a column in a table. Each element in the array will be in a separate data object. The first element of the array starts in the first data object for that requestId and then then the second element of the array in the second data object for that requestId and so on (regardless of dates from other formulas).  **flatten&#x3D;N ARRAY Representation** &#x60;&#x60;&#x60;json [   {     \&quot;requestId\&quot;: \&quot;id\&quot;,     \&quot;formula\&quot;: \&quot;formulaName\&quot;,     \&quot;result\&quot;: [a,b,c],     \&quot;objectType\&quot;: \&quot;ARRAY\&quot;,     \&quot;dataType\&quot;: \&quot;DOUBLE\&quot;   } ] &#x60;&#x60;&#x60;  **flatten&#x3D;Y ARRAY Representation** &#x60;&#x60;&#x60;json [   {     \&quot;requestId\&quot;: \&quot;id\&quot;,     \&quot;formulaName\&quot;: a,   },   {     \&quot;requestId\&quot;: \&quot;id\&quot;,     \&quot;formulaName\&quot;: b,   },   {     \&quot;requestId\&quot;: \&quot;id\&quot;,     \&quot;formulaName\&quot;: c,   } ] &#x60;&#x60;&#x60; - -- Scalar data items (SCALAR objectType in the standard **flatten&#x3D;N** response model) will be repeated in each data object for the requestId.  **flatten&#x3D;N SCALAR Representation** &#x60;&#x60;&#x60;json [   {     \&quot;requestId\&quot;: \&quot;id\&quot;,     \&quot;formula\&quot;: \&quot;formulaName\&quot;,     \&quot;result\&quot;: a,     \&quot;objectType\&quot;: \&quot;ARRAY\&quot;,     \&quot;dataType\&quot;: \&quot;DOUBLE\&quot;   } ] &#x60;&#x60;&#x60;  **flatten&#x3D;Y SCALAR Representation** &#x60;&#x60;&#x60;json [   {     \&quot;requestId\&quot;: \&quot;id\&quot;,     \&quot;formulaName\&quot;: a,   } ] &#x60;&#x60;&#x60; - -- Formulas that result in a matrix (2 dimensional array, MATRIX objectType in the standard **flatten&#x3D;N** response model) can be thought of as returning a table where each array in the array of arrays is a row in the table. This can be extended to the flattened result structure where each data object is a row in a table.  The formula will have as many attributes (appended by [n]) as number of columns in the matrix result.  **flatten&#x3D;N MATRIX Representation** &#x60;&#x60;&#x60;json [   {     \&quot;requestId\&quot;: \&quot;id\&quot;     \&quot;formula\&quot;: \&quot;formulaName\&quot;,     \&quot;result\&quot;: [         [a,b,c],         [d,e,f]       ],     \&quot;objectType\&quot;: \&quot;MATRIX\&quot;,     \&quot;dataType\&quot;: \&quot;DOUBLE\&quot;   } ] &#x60;&#x60;&#x60;  **flatten&#x3D;Y MATRIX Representation** &#x60;&#x60;&#x60;json [   {     \&quot;requestId\&quot;: \&quot;id\&quot;     \&quot;formulaName[0]\&quot;: a,     \&quot;formulaName[1]\&quot;: b,     \&quot;formulaName[2]\&quot;: c   },   {     \&quot;requestId\&quot;: \&quot;id\&quot;     \&quot;formulaName[0]\&quot;: d,     \&quot;formulaName[1]\&quot;: e,     \&quot;formulaName[2]\&quot;: f   } ] &#x60;&#x60;&#x60; - -- 
    /// </summary>
    [DataContract(Name = "time_series_result_object_flattened")]
    public partial class TimeSeriesResultObjectFlattened : IEquatable<TimeSeriesResultObjectFlattened>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TimeSeriesResultObjectFlattened" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TimeSeriesResultObjectFlattened() {
            this.AdditionalProperties = new Dictionary<string, TimeSeriesResultObjectFlattenedAddl>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="TimeSeriesResultObjectFlattened" /> class.
        /// </summary>
        /// <param name="requestId">Identifier requested. (required).</param>
        /// <param name="fsymId">The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Included only if the &#x60;fsymId&#x60; parameter is set to Y. .</param>
        /// <param name="date">Date associated with FQL formula..</param>
        public TimeSeriesResultObjectFlattened(string requestId,string fsymId = default(string), DateTime? date = default(DateTime?))
        {
            // to ensure "requestId" is required (not null)
            if (requestId == null) {
                throw new ArgumentNullException("requestId is a required property for TimeSeriesResultObjectFlattened and cannot be null");
            }
            this.RequestId = requestId;
            this.FsymId = fsymId;
            this.Date = date;
            this.AdditionalProperties = new Dictionary<string, TimeSeriesResultObjectFlattenedAddl>();
        }

        /// <summary>
        /// Identifier requested.
        /// </summary>
        /// <value>Identifier requested.</value>
        [DataMember(Name = "requestId", IsRequired = true, EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Included only if the &#x60;fsymId&#x60; parameter is set to Y. 
        /// </summary>
        /// <value>The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Included only if the &#x60;fsymId&#x60; parameter is set to Y. </value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Date associated with FQL formula.
        /// </summary>
        /// <value>Date associated with FQL formula.</value>
        [DataMember(Name = "date", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        public IDictionary<string, TimeSeriesResultObjectFlattenedAddl> AdditionalProperties { get; set; }

        [JsonExtensionData]
        private JObject _rawAdditionalData;

        [OnDeserialized]
        private void OnDeserialized(StreamingContext context)
        {
            if (_rawAdditionalData != null) {
                new JsonSerializer().Populate(_rawAdditionalData.CreateReader(), AdditionalProperties);
            }
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TimeSeriesResultObjectFlattened {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
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
            return this.Equals(input as TimeSeriesResultObjectFlattened);
        }

        /// <summary>
        /// Returns true if TimeSeriesResultObjectFlattened instances are equal
        /// </summary>
        /// <param name="input">Instance of TimeSeriesResultObjectFlattened to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TimeSeriesResultObjectFlattened input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
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
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
                }
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
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
