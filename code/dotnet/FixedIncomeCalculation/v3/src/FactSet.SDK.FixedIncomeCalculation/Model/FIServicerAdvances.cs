/*
 * FI API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.9.0
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
using OpenAPIDateConverter = FactSet.SDK.FixedIncomeCalculation.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FixedIncomeCalculation.Model
{
    /// <summary>
    /// FIServicerAdvances
    /// </summary>
    [DataContract(Name = "FIServicerAdvances")]
    public partial class FIServicerAdvances : IEquatable<FIServicerAdvances>, IValidatableObject
    {
        /// <summary>
        /// Advance Type
        /// </summary>
        /// <value>Advance Type</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum AdvanceTypeEnum
        {
            /// <summary>
            /// Enum AdvancesAll for value: Advances All
            /// </summary>
            [EnumMember(Value = "Advances All")]
            AdvancesAll = 1,

            /// <summary>
            /// Enum AdvancesAllButNewlyLiqdtd for value: Advances All But Newly Liqdtd
            /// </summary>
            [EnumMember(Value = "Advances All But Newly Liqdtd")]
            AdvancesAllButNewlyLiqdtd = 2,

            /// <summary>
            /// Enum DoesNotAdvance for value: Does Not Advance
            /// </summary>
            [EnumMember(Value = "Does Not Advance")]
            DoesNotAdvance = 3,

            /// <summary>
            /// Enum PrincipalOnly for value: Principal Only
            /// </summary>
            [EnumMember(Value = "Principal Only")]
            PrincipalOnly = 4,

            /// <summary>
            /// Enum InterestOnly for value: Interest Only
            /// </summary>
            [EnumMember(Value = "Interest Only")]
            InterestOnly = 5

        }


        /// <summary>
        /// Advance Type
        /// </summary>
        /// <value>Advance Type</value>
        [DataMember(Name = "advanceType", EmitDefaultValue = false)]
        public AdvanceTypeEnum? AdvanceType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FIServicerAdvances" /> class.
        /// </summary>
        /// <param name="advanceType">Advance Type.</param>
        public FIServicerAdvances(AdvanceTypeEnum? advanceType = default(AdvanceTypeEnum?))
        {
            this.AdvanceType = advanceType;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FIServicerAdvances {\n");
            sb.Append("  AdvanceType: ").Append(AdvanceType).Append("\n");
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
            return this.Equals(input as FIServicerAdvances);
        }

        /// <summary>
        /// Returns true if FIServicerAdvances instances are equal
        /// </summary>
        /// <param name="input">Instance of FIServicerAdvances to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FIServicerAdvances input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AdvanceType == input.AdvanceType ||
                    this.AdvanceType.Equals(input.AdvanceType)
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
                hashCode = (hashCode * 59) + this.AdvanceType.GetHashCode();
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
