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
using OpenAPIDateConverter = FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Value ranges related to the relative performance since issue.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_performance_sinceIssue")]
    public partial class InlineResponse2005DataPerformanceSinceIssue : IEquatable<InlineResponse2005DataPerformanceSinceIssue>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataPerformanceSinceIssue" /> class.
        /// </summary>
        /// <param name="ask">ask.</param>
        /// <param name="bid">bid.</param>
        public InlineResponse2005DataPerformanceSinceIssue(InlineResponse2005DataPerformanceSinceIssueAsk ask = default(InlineResponse2005DataPerformanceSinceIssueAsk), InlineResponse2005DataPerformanceSinceIssueBid bid = default(InlineResponse2005DataPerformanceSinceIssueBid))
        {
            this.Ask = ask;
            this.Bid = bid;
        }

        /// <summary>
        /// Gets or Sets Ask
        /// </summary>
        [DataMember(Name = "ask", EmitDefaultValue = false)]
        public InlineResponse2005DataPerformanceSinceIssueAsk Ask { get; set; }

        /// <summary>
        /// Gets or Sets Bid
        /// </summary>
        [DataMember(Name = "bid", EmitDefaultValue = false)]
        public InlineResponse2005DataPerformanceSinceIssueBid Bid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataPerformanceSinceIssue {\n");
            sb.Append("  Ask: ").Append(Ask).Append("\n");
            sb.Append("  Bid: ").Append(Bid).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataPerformanceSinceIssue);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataPerformanceSinceIssue instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataPerformanceSinceIssue to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataPerformanceSinceIssue input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ask == input.Ask ||
                    (this.Ask != null &&
                    this.Ask.Equals(input.Ask))
                ) && 
                (
                    this.Bid == input.Bid ||
                    (this.Bid != null &&
                    this.Bid.Equals(input.Bid))
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
                if (this.Ask != null)
                {
                    hashCode = (hashCode * 59) + this.Ask.GetHashCode();
                }
                if (this.Bid != null)
                {
                    hashCode = (hashCode * 59) + this.Bid.GetHashCode();
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
