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
    /// Identifier Resolution data object.
    /// </summary>
    [DataContract(Name = "identifierResolution")]
    public partial class IdentifierResolution : IEquatable<IdentifierResolution>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IdentifierResolution" /> class.
        /// </summary>
        /// <param name="requestId">Identifier inputted in the request..</param>
        /// <param name="inputSymbolType">The type of identifier inputted in the request.</param>
        /// <param name="name">Name of the requested identifier.</param>
        /// <param name="frefListingExchange">The 3 digit fref exchange code for the primary exchange of the security.</param>
        /// <param name="currency">The 3 digit ISO code for the currency.</param>
        public IdentifierResolution(string requestId = default(string), string inputSymbolType = default(string), string name = default(string), string frefListingExchange = default(string), string currency = default(string))
        {
            this.RequestId = requestId;
            this.InputSymbolType = inputSymbolType;
            this.Name = name;
            this.FrefListingExchange = frefListingExchange;
            this.Currency = currency;
            this.AdditionalProperties = new Dictionary<string, string>();
        }

        /// <summary>
        /// Identifier inputted in the request.
        /// </summary>
        /// <value>Identifier inputted in the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// The type of identifier inputted in the request
        /// </summary>
        /// <value>The type of identifier inputted in the request</value>
        [DataMember(Name = "inputSymbolType", EmitDefaultValue = false)]
        public string InputSymbolType { get; set; }

        /// <summary>
        /// Name of the requested identifier
        /// </summary>
        /// <value>Name of the requested identifier</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// The 3 digit fref exchange code for the primary exchange of the security
        /// </summary>
        /// <value>The 3 digit fref exchange code for the primary exchange of the security</value>
        [DataMember(Name = "frefListingExchange", EmitDefaultValue = true)]
        public string FrefListingExchange { get; set; }

        /// <summary>
        /// The 3 digit ISO code for the currency
        /// </summary>
        /// <value>The 3 digit ISO code for the currency</value>
        [DataMember(Name = "currency", EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        public IDictionary<string, string> AdditionalProperties { get; set; }

        [JsonExtensionData]
        private JObject _rawAdditionalData;

        [OnSerializing]
        private void OnSerializing(StreamingContext context)
        {
            _rawAdditionalData = JObject.FromObject(AdditionalProperties);
        }

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
            sb.Append("class IdentifierResolution {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  InputSymbolType: ").Append(InputSymbolType).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  FrefListingExchange: ").Append(FrefListingExchange).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
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
            return this.Equals(input as IdentifierResolution);
        }

        /// <summary>
        /// Returns true if IdentifierResolution instances are equal
        /// </summary>
        /// <param name="input">Instance of IdentifierResolution to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IdentifierResolution input)
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
                    this.InputSymbolType == input.InputSymbolType ||
                    (this.InputSymbolType != null &&
                    this.InputSymbolType.Equals(input.InputSymbolType))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.FrefListingExchange == input.FrefListingExchange ||
                    (this.FrefListingExchange != null &&
                    this.FrefListingExchange.Equals(input.FrefListingExchange))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
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
                if (this.InputSymbolType != null)
                {
                    hashCode = (hashCode * 59) + this.InputSymbolType.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.FrefListingExchange != null)
                {
                    hashCode = (hashCode * 59) + this.FrefListingExchange.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
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
