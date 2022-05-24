/*
 * Funds API For Digital Portals
 *
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
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
using OpenAPIDateConverter = FactSet.SDK.FundsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FundsAPIforDigitalPortals.Model
{
    /// <summary>
    /// Value range for the maximum redemption fee.
    /// </summary>
    [DataContract(Name = "_fund_notation_screener_search_data_shareClass_fee_redemption_maximum")]
    public partial class FundNotationScreenerSearchDataShareClassFeeRedemptionMaximum : IEquatable<FundNotationScreenerSearchDataShareClassFeeRedemptionMaximum>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FundNotationScreenerSearchDataShareClassFeeRedemptionMaximum" /> class.
        /// </summary>
        /// <param name="minimum">minimum.</param>
        /// <param name="maximum">maximum.</param>
        public FundNotationScreenerSearchDataShareClassFeeRedemptionMaximum(FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum minimum = default(FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum), FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum maximum = default(FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum))
        {
            this.Minimum = minimum;
            this.Maximum = maximum;
        }

        /// <summary>
        /// Gets or Sets Minimum
        /// </summary>
        [DataMember(Name = "minimum", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum Minimum { get; set; }

        /// <summary>
        /// Gets or Sets Maximum
        /// </summary>
        [DataMember(Name = "maximum", EmitDefaultValue = false)]
        public FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum Maximum { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FundNotationScreenerSearchDataShareClassFeeRedemptionMaximum {\n");
            sb.Append("  Minimum: ").Append(Minimum).Append("\n");
            sb.Append("  Maximum: ").Append(Maximum).Append("\n");
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
            return this.Equals(input as FundNotationScreenerSearchDataShareClassFeeRedemptionMaximum);
        }

        /// <summary>
        /// Returns true if FundNotationScreenerSearchDataShareClassFeeRedemptionMaximum instances are equal
        /// </summary>
        /// <param name="input">Instance of FundNotationScreenerSearchDataShareClassFeeRedemptionMaximum to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FundNotationScreenerSearchDataShareClassFeeRedemptionMaximum input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Minimum == input.Minimum ||
                    (this.Minimum != null &&
                    this.Minimum.Equals(input.Minimum))
                ) && 
                (
                    this.Maximum == input.Maximum ||
                    (this.Maximum != null &&
                    this.Maximum.Equals(input.Maximum))
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
                if (this.Minimum != null)
                {
                    hashCode = (hashCode * 59) + this.Minimum.GetHashCode();
                }
                if (this.Maximum != null)
                {
                    hashCode = (hashCode * 59) + this.Maximum.GetHashCode();
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
