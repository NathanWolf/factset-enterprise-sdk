/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
using OpenAPIDateConverter = FactSet.SDK.ETFProfileandPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ETFProfileandPrices.Model
{
    /// <summary>
    /// InlineResponse2005DataExchanges
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_exchanges")]
    public partial class InlineResponse2005DataExchanges : IEquatable<InlineResponse2005DataExchanges>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataExchanges" /> class.
        /// </summary>
        /// <param name="exchange">Name of the exchange..</param>
        /// <param name="weight">Consolidate weight of the position within the ETP by exchange(s)..</param>
        public InlineResponse2005DataExchanges(string exchange = default(string), decimal weight = default(decimal))
        {
            this.Exchange = exchange;
            this.Weight = weight;
        }

        /// <summary>
        /// Name of the exchange.
        /// </summary>
        /// <value>Name of the exchange.</value>
        [DataMember(Name = "exchange", EmitDefaultValue = false)]
        public string Exchange { get; set; }

        /// <summary>
        /// Consolidate weight of the position within the ETP by exchange(s).
        /// </summary>
        /// <value>Consolidate weight of the position within the ETP by exchange(s).</value>
        [DataMember(Name = "weight", EmitDefaultValue = false)]
        public decimal Weight { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataExchanges {\n");
            sb.Append("  Exchange: ").Append(Exchange).Append("\n");
            sb.Append("  Weight: ").Append(Weight).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataExchanges);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataExchanges instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataExchanges to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataExchanges input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Exchange == input.Exchange ||
                    (this.Exchange != null &&
                    this.Exchange.Equals(input.Exchange))
                ) && 
                (
                    this.Weight == input.Weight ||
                    this.Weight.Equals(input.Weight)
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
                if (this.Exchange != null)
                {
                    hashCode = (hashCode * 59) + this.Exchange.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Weight.GetHashCode();
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
