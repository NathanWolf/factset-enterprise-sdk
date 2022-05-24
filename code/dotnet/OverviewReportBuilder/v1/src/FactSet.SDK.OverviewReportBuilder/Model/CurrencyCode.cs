/*
 * FactSet Overview Report Builder API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.OverviewReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OverviewReportBuilder.Model
{
    /// <summary>
    /// CurrencyCode
    /// </summary>
    [DataContract(Name = "currencyCode")]
    public partial class CurrencyCode : IEquatable<CurrencyCode>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CurrencyCode" /> class.
        /// </summary>
        /// <param name="currencyCode">currencyCode.</param>
        public CurrencyCode(CurrencyCodeCurrencyCode currencyCode = default(CurrencyCodeCurrencyCode))
        {
            this._CurrencyCode = currencyCode;
        }

        /// <summary>
        /// Gets or Sets _CurrencyCode
        /// </summary>
        [DataMember(Name = "currencyCode", EmitDefaultValue = false)]
        public CurrencyCodeCurrencyCode _CurrencyCode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CurrencyCode {\n");
            sb.Append("  _CurrencyCode: ").Append(_CurrencyCode).Append("\n");
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
            return this.Equals(input as CurrencyCode);
        }

        /// <summary>
        /// Returns true if CurrencyCode instances are equal
        /// </summary>
        /// <param name="input">Instance of CurrencyCode to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CurrencyCode input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._CurrencyCode == input._CurrencyCode ||
                    (this._CurrencyCode != null &&
                    this._CurrencyCode.Equals(input._CurrencyCode))
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
                if (this._CurrencyCode != null)
                {
                    hashCode = (hashCode * 59) + this._CurrencyCode.GetHashCode();
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
