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
using OpenAPIDateConverter = FactSet.SDK.BondsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BondsAPIforDigitalPortals.Model
{
    /// <summary>
    /// Debt instrument categorization. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;18&#x60; for valid values.
    /// </summary>
    [DataContract(Name = "inline_response_200_3_instrument_categorization")]
    public partial class InlineResponse2003InstrumentCategorization : IEquatable<InlineResponse2003InstrumentCategorization>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003InstrumentCategorization" /> class.
        /// </summary>
        /// <param name="level1">level1.</param>
        /// <param name="level2">level2.</param>
        /// <param name="level3">level3.</param>
        public InlineResponse2003InstrumentCategorization(InlineResponse2003InstrumentCategorizationLevel1 level1 = default(InlineResponse2003InstrumentCategorizationLevel1), InlineResponse2003InstrumentCategorizationLevel2 level2 = default(InlineResponse2003InstrumentCategorizationLevel2), InlineResponse2003InstrumentCategorizationLevel3 level3 = default(InlineResponse2003InstrumentCategorizationLevel3))
        {
            this.Level1 = level1;
            this.Level2 = level2;
            this.Level3 = level3;
        }

        /// <summary>
        /// Gets or Sets Level1
        /// </summary>
        [DataMember(Name = "level1", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentCategorizationLevel1 Level1 { get; set; }

        /// <summary>
        /// Gets or Sets Level2
        /// </summary>
        [DataMember(Name = "level2", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentCategorizationLevel2 Level2 { get; set; }

        /// <summary>
        /// Gets or Sets Level3
        /// </summary>
        [DataMember(Name = "level3", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentCategorizationLevel3 Level3 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2003InstrumentCategorization {\n");
            sb.Append("  Level1: ").Append(Level1).Append("\n");
            sb.Append("  Level2: ").Append(Level2).Append("\n");
            sb.Append("  Level3: ").Append(Level3).Append("\n");
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
            return this.Equals(input as InlineResponse2003InstrumentCategorization);
        }

        /// <summary>
        /// Returns true if InlineResponse2003InstrumentCategorization instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003InstrumentCategorization to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003InstrumentCategorization input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Level1 == input.Level1 ||
                    (this.Level1 != null &&
                    this.Level1.Equals(input.Level1))
                ) && 
                (
                    this.Level2 == input.Level2 ||
                    (this.Level2 != null &&
                    this.Level2.Equals(input.Level2))
                ) && 
                (
                    this.Level3 == input.Level3 ||
                    (this.Level3 != null &&
                    this.Level3.Equals(input.Level3))
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
                if (this.Level1 != null)
                    hashCode = hashCode * 59 + this.Level1.GetHashCode();
                if (this.Level2 != null)
                    hashCode = hashCode * 59 + this.Level2.GetHashCode();
                if (this.Level3 != null)
                    hashCode = hashCode * 59 + this.Level3.GetHashCode();
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
