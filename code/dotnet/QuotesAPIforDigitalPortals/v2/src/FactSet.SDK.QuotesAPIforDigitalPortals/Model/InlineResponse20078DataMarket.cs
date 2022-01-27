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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Market of the notation.
    /// </summary>
    [DataContract(Name = "inline_response_200_78_data_market")]
    public partial class InlineResponse20078DataMarket : IEquatable<InlineResponse20078DataMarket>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20078DataMarket" /> class.
        /// </summary>
        /// <param name="id">Identifier of the market. See endpoint &#x60;/basic/market/list&#x60; for possible values. .</param>
        /// <param name="isOpen">Indicates whether the market of the notation is currently open, that is, the current time is between the open and adjusted close of the notation&#39;s market, see endpoint &#x60;/prices/tradingSchedule/event/list&#x60; for the trading schedule of the notation&#39;s market. The adjusted close is later than the official closing time specified by the market and includes the time after closing when trades might still be reported. Breaks such as a lunch break are not considered..</param>
        /// <param name="phase">Market-specific code of the current market phase..</param>
        public InlineResponse20078DataMarket(decimal id = default(decimal), bool isOpen = default(bool), string phase = default(string))
        {
            this.Id = id;
            this.IsOpen = isOpen;
            this.Phase = phase;
        }

        /// <summary>
        /// Identifier of the market. See endpoint &#x60;/basic/market/list&#x60; for possible values. 
        /// </summary>
        /// <value>Identifier of the market. See endpoint &#x60;/basic/market/list&#x60; for possible values. </value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// Indicates whether the market of the notation is currently open, that is, the current time is between the open and adjusted close of the notation&#39;s market, see endpoint &#x60;/prices/tradingSchedule/event/list&#x60; for the trading schedule of the notation&#39;s market. The adjusted close is later than the official closing time specified by the market and includes the time after closing when trades might still be reported. Breaks such as a lunch break are not considered.
        /// </summary>
        /// <value>Indicates whether the market of the notation is currently open, that is, the current time is between the open and adjusted close of the notation&#39;s market, see endpoint &#x60;/prices/tradingSchedule/event/list&#x60; for the trading schedule of the notation&#39;s market. The adjusted close is later than the official closing time specified by the market and includes the time after closing when trades might still be reported. Breaks such as a lunch break are not considered.</value>
        [DataMember(Name = "isOpen", EmitDefaultValue = true)]
        public bool IsOpen { get; set; }

        /// <summary>
        /// Market-specific code of the current market phase.
        /// </summary>
        /// <value>Market-specific code of the current market phase.</value>
        [DataMember(Name = "phase", EmitDefaultValue = false)]
        public string Phase { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse20078DataMarket {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsOpen: ").Append(IsOpen).Append("\n");
            sb.Append("  Phase: ").Append(Phase).Append("\n");
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
            return this.Equals(input as InlineResponse20078DataMarket);
        }

        /// <summary>
        /// Returns true if InlineResponse20078DataMarket instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20078DataMarket to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20078DataMarket input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    this.Id.Equals(input.Id)
                ) && 
                (
                    this.IsOpen == input.IsOpen ||
                    this.IsOpen.Equals(input.IsOpen)
                ) && 
                (
                    this.Phase == input.Phase ||
                    (this.Phase != null &&
                    this.Phase.Equals(input.Phase))
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
                hashCode = hashCode * 59 + this.Id.GetHashCode();
                hashCode = hashCode * 59 + this.IsOpen.GetHashCode();
                if (this.Phase != null)
                    hashCode = hashCode * 59 + this.Phase.GetHashCode();
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
