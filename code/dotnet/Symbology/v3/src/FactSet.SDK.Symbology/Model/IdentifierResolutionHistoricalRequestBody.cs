/*
 * FactSet Symbology API
 *
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and LEIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs.</p> 
 *
 * The version of the OpenAPI document: 3.3.0
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
using OpenAPIDateConverter = FactSet.SDK.Symbology.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Symbology.Model
{
    /// <summary>
    /// Request object for Historical Identifier Resolution endpoint.
    /// </summary>
    [DataContract(Name = "identifierResolutionHistoricalRequestBody")]
    public partial class IdentifierResolutionHistoricalRequestBody : IEquatable<IdentifierResolutionHistoricalRequestBody>, IValidatableObject
    {
        /// <summary>
        /// Defines OutputSymbolTypes
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum OutputSymbolTypesEnum
        {
            /// <summary>
            /// Enum SEDOL for value: SEDOL
            /// </summary>
            [EnumMember(Value = "SEDOL")]
            SEDOL = 1,

            /// <summary>
            /// Enum CUSIP for value: CUSIP
            /// </summary>
            [EnumMember(Value = "CUSIP")]
            CUSIP = 2,

            /// <summary>
            /// Enum ISIN for value: ISIN
            /// </summary>
            [EnumMember(Value = "ISIN")]
            ISIN = 3,

            /// <summary>
            /// Enum TickerRegion for value: tickerRegion
            /// </summary>
            [EnumMember(Value = "tickerRegion")]
            TickerRegion = 4

        }



        /// <summary>
        /// Requested identifiers to be returned. Multiple identifier types can be requested with each request.
        /// </summary>
        /// <value>Requested identifiers to be returned. Multiple identifier types can be requested with each request.</value>
        [DataMember(Name = "outputSymbolTypes", IsRequired = true, EmitDefaultValue = false)]
        public List<OutputSymbolTypesEnum> OutputSymbolTypes { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="IdentifierResolutionHistoricalRequestBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected IdentifierResolutionHistoricalRequestBody() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="IdentifierResolutionHistoricalRequestBody" /> class.
        /// </summary>
        /// <param name="ids">Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. (required).</param>
        /// <param name="inputSymbolType">inputSymbolType (required).</param>
        /// <param name="outputSymbolTypes">Requested identifiers to be returned. Multiple identifier types can be requested with each request. (required).</param>
        /// <param name="asOfDate">As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier. .</param>
        public IdentifierResolutionHistoricalRequestBody(List<string> ids, GetHistoricalInputSymbolType inputSymbolType, List<OutputSymbolTypesEnum> outputSymbolTypes,DateTime asOfDate = default(DateTime))
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for IdentifierResolutionHistoricalRequestBody and cannot be null");
            }
            this.Ids = ids;
            // to ensure "inputSymbolType" is required (not null)
            if (inputSymbolType == null) {
                throw new ArgumentNullException("inputSymbolType is a required property for IdentifierResolutionHistoricalRequestBody and cannot be null");
            }
            this.InputSymbolType = inputSymbolType;
            // to ensure "outputSymbolTypes" is required (not null)
            if (outputSymbolTypes == null) {
                throw new ArgumentNullException("outputSymbolTypes is a required property for IdentifierResolutionHistoricalRequestBody and cannot be null");
            }
            this.OutputSymbolTypes = outputSymbolTypes;
            this.AsOfDate = asOfDate;
        }

        /// <summary>
        /// Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;.
        /// </summary>
        /// <value>Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;.</value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Gets or Sets InputSymbolType
        /// </summary>
        [DataMember(Name = "inputSymbolType", IsRequired = true, EmitDefaultValue = false)]
        public GetHistoricalInputSymbolType InputSymbolType { get; set; }

        /// <summary>
        /// As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier. 
        /// </summary>
        /// <value>As of date for historical symbol request in YYYY-MM-DD format. If no &#x60;asOfDate&#x60; is requested, the response will include the full history of the identifier. </value>
        [DataMember(Name = "asOfDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime AsOfDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IdentifierResolutionHistoricalRequestBody {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  InputSymbolType: ").Append(InputSymbolType).Append("\n");
            sb.Append("  OutputSymbolTypes: ").Append(OutputSymbolTypes).Append("\n");
            sb.Append("  AsOfDate: ").Append(AsOfDate).Append("\n");
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
            return this.Equals(input as IdentifierResolutionHistoricalRequestBody);
        }

        /// <summary>
        /// Returns true if IdentifierResolutionHistoricalRequestBody instances are equal
        /// </summary>
        /// <param name="input">Instance of IdentifierResolutionHistoricalRequestBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IdentifierResolutionHistoricalRequestBody input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
                ) && 
                (
                    this.InputSymbolType == input.InputSymbolType ||
                    (this.InputSymbolType != null &&
                    this.InputSymbolType.Equals(input.InputSymbolType))
                ) && 
                (
                    this.OutputSymbolTypes == input.OutputSymbolTypes ||
                    this.OutputSymbolTypes.SequenceEqual(input.OutputSymbolTypes)
                ) && 
                (
                    this.AsOfDate == input.AsOfDate ||
                    (this.AsOfDate != null &&
                    this.AsOfDate.Equals(input.AsOfDate))
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
                if (this.Ids != null)
                {
                    hashCode = (hashCode * 59) + this.Ids.GetHashCode();
                }
                if (this.InputSymbolType != null)
                {
                    hashCode = (hashCode * 59) + this.InputSymbolType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.OutputSymbolTypes.GetHashCode();
                if (this.AsOfDate != null)
                {
                    hashCode = (hashCode * 59) + this.AsOfDate.GetHashCode();
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
