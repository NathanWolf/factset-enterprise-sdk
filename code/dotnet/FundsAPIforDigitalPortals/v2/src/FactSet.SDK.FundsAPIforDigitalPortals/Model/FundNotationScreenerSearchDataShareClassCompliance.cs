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
    /// Compliance properties related to share classes. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for the full list of compliance properties associated with instruments (across all asset classes).
    /// </summary>
    [DataContract(Name = "_fund_notation_screener_search_data_shareClass_compliance")]
    public partial class FundNotationScreenerSearchDataShareClassCompliance : IEquatable<FundNotationScreenerSearchDataShareClassCompliance>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FundNotationScreenerSearchDataShareClassCompliance" /> class.
        /// </summary>
        /// <param name="or">List of conditions representing a combination of compliance properties joined by a logical OR operator..</param>
        public FundNotationScreenerSearchDataShareClassCompliance(List<FundNotationScreenerSearchDataFundComplianceOr> or = default(List<FundNotationScreenerSearchDataFundComplianceOr>))
        {
            this.Or = or;
        }

        /// <summary>
        /// List of conditions representing a combination of compliance properties joined by a logical OR operator.
        /// </summary>
        /// <value>List of conditions representing a combination of compliance properties joined by a logical OR operator.</value>
        [DataMember(Name = "or", EmitDefaultValue = false)]
        public List<FundNotationScreenerSearchDataFundComplianceOr> Or { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FundNotationScreenerSearchDataShareClassCompliance {\n");
            sb.Append("  Or: ").Append(Or).Append("\n");
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
            return this.Equals(input as FundNotationScreenerSearchDataShareClassCompliance);
        }

        /// <summary>
        /// Returns true if FundNotationScreenerSearchDataShareClassCompliance instances are equal
        /// </summary>
        /// <param name="input">Instance of FundNotationScreenerSearchDataShareClassCompliance to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FundNotationScreenerSearchDataShareClassCompliance input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Or == input.Or ||
                    this.Or != null &&
                    input.Or != null &&
                    this.Or.SequenceEqual(input.Or)
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
                if (this.Or != null)
                {
                    hashCode = (hashCode * 59) + this.Or.GetHashCode();
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
