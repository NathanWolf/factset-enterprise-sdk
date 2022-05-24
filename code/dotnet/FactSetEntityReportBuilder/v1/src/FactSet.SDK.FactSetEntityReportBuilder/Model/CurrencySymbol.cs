/*
 * FactSet Entity Report Builder
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
using OpenAPIDateConverter = FactSet.SDK.FactSetEntityReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetEntityReportBuilder.Model
{
    /// <summary>
    /// CurrencySymbol
    /// </summary>
    [DataContract(Name = "currencySymbol")]
    public partial class CurrencySymbol : IEquatable<CurrencySymbol>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CurrencySymbol" /> class.
        /// </summary>
        /// <param name="currencySymbol">currencySymbol.</param>
        public CurrencySymbol(CurrencySymbolCurrencySymbol currencySymbol = default(CurrencySymbolCurrencySymbol))
        {
            this._CurrencySymbol = currencySymbol;
        }

        /// <summary>
        /// Gets or Sets _CurrencySymbol
        /// </summary>
        [DataMember(Name = "currencySymbol", EmitDefaultValue = false)]
        public CurrencySymbolCurrencySymbol _CurrencySymbol { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CurrencySymbol {\n");
            sb.Append("  _CurrencySymbol: ").Append(_CurrencySymbol).Append("\n");
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
            return this.Equals(input as CurrencySymbol);
        }

        /// <summary>
        /// Returns true if CurrencySymbol instances are equal
        /// </summary>
        /// <param name="input">Instance of CurrencySymbol to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CurrencySymbol input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._CurrencySymbol == input._CurrencySymbol ||
                    (this._CurrencySymbol != null &&
                    this._CurrencySymbol.Equals(input._CurrencySymbol))
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
                if (this._CurrencySymbol != null)
                {
                    hashCode = (hashCode * 59) + this._CurrencySymbol.GetHashCode();
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
