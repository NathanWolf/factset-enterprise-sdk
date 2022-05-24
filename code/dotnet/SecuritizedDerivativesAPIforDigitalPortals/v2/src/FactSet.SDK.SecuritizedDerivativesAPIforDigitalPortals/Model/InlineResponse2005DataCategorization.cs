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
    /// Lists of categories of the securitized derivatives. Starting with the most coarse level (one), for each level of the category system, the list of categories of the securitized derivatives, matching the parameters, is returned. See endpoint &#x60;/category/listBySystem&#x60; for possible values.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_categorization")]
    public partial class InlineResponse2005DataCategorization : IEquatable<InlineResponse2005DataCategorization>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataCategorization" /> class.
        /// </summary>
        /// <param name="ddv">Categorization based on the DDV (Deutscher Derivate Verband, German for German Derivatives Association) product classification. This category system (&#x60;id&#x3D;23&#x60;) covers securitized derivatives traded in Germany except exchange trade commodities (ETC) and exchange traded notes (ETN)..</param>
        /// <param name="eusipa">Categorization based on the EUSIPA (European Structured Investment Products Association) product classification. This category system (&#x60;id&#x3D;18&#x60;) covers all securitized derivatives..</param>
        public InlineResponse2005DataCategorization(List<InlineResponse2005DataCategorizationDdv> ddv = default(List<InlineResponse2005DataCategorizationDdv>), List<InlineResponse2005DataCategorizationDdv> eusipa = default(List<InlineResponse2005DataCategorizationDdv>))
        {
            this.Ddv = ddv;
            this.Eusipa = eusipa;
        }

        /// <summary>
        /// Categorization based on the DDV (Deutscher Derivate Verband, German for German Derivatives Association) product classification. This category system (&#x60;id&#x3D;23&#x60;) covers securitized derivatives traded in Germany except exchange trade commodities (ETC) and exchange traded notes (ETN).
        /// </summary>
        /// <value>Categorization based on the DDV (Deutscher Derivate Verband, German for German Derivatives Association) product classification. This category system (&#x60;id&#x3D;23&#x60;) covers securitized derivatives traded in Germany except exchange trade commodities (ETC) and exchange traded notes (ETN).</value>
        [DataMember(Name = "ddv", EmitDefaultValue = false)]
        public List<InlineResponse2005DataCategorizationDdv> Ddv { get; set; }

        /// <summary>
        /// Categorization based on the EUSIPA (European Structured Investment Products Association) product classification. This category system (&#x60;id&#x3D;18&#x60;) covers all securitized derivatives.
        /// </summary>
        /// <value>Categorization based on the EUSIPA (European Structured Investment Products Association) product classification. This category system (&#x60;id&#x3D;18&#x60;) covers all securitized derivatives.</value>
        [DataMember(Name = "eusipa", EmitDefaultValue = false)]
        public List<InlineResponse2005DataCategorizationDdv> Eusipa { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataCategorization {\n");
            sb.Append("  Ddv: ").Append(Ddv).Append("\n");
            sb.Append("  Eusipa: ").Append(Eusipa).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataCategorization);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataCategorization instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataCategorization to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataCategorization input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ddv == input.Ddv ||
                    this.Ddv != null &&
                    input.Ddv != null &&
                    this.Ddv.SequenceEqual(input.Ddv)
                ) && 
                (
                    this.Eusipa == input.Eusipa ||
                    this.Eusipa != null &&
                    input.Eusipa != null &&
                    this.Eusipa.SequenceEqual(input.Eusipa)
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
                if (this.Ddv != null)
                {
                    hashCode = (hashCode * 59) + this.Ddv.GetHashCode();
                }
                if (this.Eusipa != null)
                {
                    hashCode = (hashCode * 59) + this.Eusipa.GetHashCode();
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
