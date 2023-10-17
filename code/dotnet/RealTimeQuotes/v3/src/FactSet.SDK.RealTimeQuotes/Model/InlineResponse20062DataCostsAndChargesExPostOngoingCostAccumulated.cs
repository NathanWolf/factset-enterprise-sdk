/*
 * Quotes API For Digital Portals
 *
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
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
using OpenAPIDateConverter = FactSet.SDK.RealTimeQuotes.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RealTimeQuotes.Model
{
    /// <summary>
    /// Ongoing ex post accumulated cost of the investment product. This cost represents the sum of all daily recurring product costs.
    /// </summary>
    [DataContract(Name = "inline_response_200_62_data_costsAndCharges_exPost_ongoingCostAccumulated")]
    public partial class InlineResponse20062DataCostsAndChargesExPostOngoingCostAccumulated : IEquatable<InlineResponse20062DataCostsAndChargesExPostOngoingCostAccumulated>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20062DataCostsAndChargesExPostOngoingCostAccumulated" /> class.
        /// </summary>
        /// <param name="value">Value of the attribute..</param>
        /// <param name="valueUnit">valueUnit.</param>
        public InlineResponse20062DataCostsAndChargesExPostOngoingCostAccumulated(decimal? value = default(decimal?), InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit valueUnit = default(InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit))
        {
            this.Value = value;
            this.ValueUnit = valueUnit;
        }

        /// <summary>
        /// Value of the attribute.
        /// </summary>
        /// <value>Value of the attribute.</value>
        [DataMember(Name = "value", EmitDefaultValue = true)]
        public decimal? Value { get; set; }

        /// <summary>
        /// Gets or Sets ValueUnit
        /// </summary>
        [DataMember(Name = "valueUnit", EmitDefaultValue = false)]
        public InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit ValueUnit { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20062DataCostsAndChargesExPostOngoingCostAccumulated {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  ValueUnit: ").Append(ValueUnit).Append("\n");
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
            return this.Equals(input as InlineResponse20062DataCostsAndChargesExPostOngoingCostAccumulated);
        }

        /// <summary>
        /// Returns true if InlineResponse20062DataCostsAndChargesExPostOngoingCostAccumulated instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20062DataCostsAndChargesExPostOngoingCostAccumulated to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20062DataCostsAndChargesExPostOngoingCostAccumulated input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.ValueUnit == input.ValueUnit ||
                    (this.ValueUnit != null &&
                    this.ValueUnit.Equals(input.ValueUnit))
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
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                if (this.ValueUnit != null)
                {
                    hashCode = (hashCode * 59) + this.ValueUnit.GetHashCode();
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
