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
    /// Selection of the effective underlying using instrument identifiers.
    /// </summary>
    [DataContract(Name = "_securitizedDerivative_issuer_search_data_factorCertificates_effectiveUnderlying_instrument")]
    public partial class SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument : IEquatable<SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument" /> class.
        /// </summary>
        /// <param name="ids">List of instrument identifiers..</param>
        public SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument(List<string> ids = default(List<string>))
        {
            this.Ids = ids;
        }

        /// <summary>
        /// List of instrument identifiers.
        /// </summary>
        /// <value>List of instrument identifiers.</value>
        [DataMember(Name = "ids", EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
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
            return this.Equals(input as SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument);
        }

        /// <summary>
        /// Returns true if SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument instances are equal
        /// </summary>
        /// <param name="input">Instance of SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
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
                    hashCode = hashCode * 59 + this.Ids.GetHashCode();
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
