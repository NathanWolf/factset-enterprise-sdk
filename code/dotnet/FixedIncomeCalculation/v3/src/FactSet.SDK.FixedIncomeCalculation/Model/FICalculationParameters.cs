/*
 * FI API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3
 * Contact: analytics.api.support@factset.com
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
    /// FICalculationParameters
    /// </summary>
    [DataContract(Name = "FICalculationParameters")]
    public partial class FICalculationParameters : IEquatable<FICalculationParameters>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FICalculationParameters" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FICalculationParameters() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FICalculationParameters" /> class.
        /// </summary>
        /// <param name="securities">List of securities (required).</param>
        /// <param name="calculations">List of calculations (required).</param>
        /// <param name="jobSettings">jobSettings (required).</param>
        public FICalculationParameters(List<FISecurity> securities = default(List<FISecurity>), List<string> calculations = default(List<string>), FIJobSettings jobSettings = default(FIJobSettings))
        {
            // to ensure "securities" is required (not null)
            if (securities == null) {
                throw new ArgumentNullException("securities is a required property for FICalculationParameters and cannot be null");
            }
            this.Securities = securities;
            // to ensure "calculations" is required (not null)
            if (calculations == null) {
                throw new ArgumentNullException("calculations is a required property for FICalculationParameters and cannot be null");
            }
            this.Calculations = calculations;
            // to ensure "jobSettings" is required (not null)
            if (jobSettings == null) {
                throw new ArgumentNullException("jobSettings is a required property for FICalculationParameters and cannot be null");
            }
            this.JobSettings = jobSettings;
        }

        /// <summary>
        /// List of securities
        /// </summary>
        /// <value>List of securities</value>
        [DataMember(Name = "securities", IsRequired = true, EmitDefaultValue = false)]
        public List<FISecurity> Securities { get; set; }

        /// <summary>
        /// List of calculations
        /// </summary>
        /// <value>List of calculations</value>
        [DataMember(Name = "calculations", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Calculations { get; set; }

        /// <summary>
        /// Gets or Sets JobSettings
        /// </summary>
        [DataMember(Name = "jobSettings", IsRequired = true, EmitDefaultValue = false)]
        public FIJobSettings JobSettings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FICalculationParameters {\n");
            sb.Append("  Securities: ").Append(Securities).Append("\n");
            sb.Append("  Calculations: ").Append(Calculations).Append("\n");
            sb.Append("  JobSettings: ").Append(JobSettings).Append("\n");
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
            return this.Equals(input as FICalculationParameters);
        }

        /// <summary>
        /// Returns true if FICalculationParameters instances are equal
        /// </summary>
        /// <param name="input">Instance of FICalculationParameters to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FICalculationParameters input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Securities == input.Securities ||
                    this.Securities != null &&
                    input.Securities != null &&
                    this.Securities.SequenceEqual(input.Securities)
                ) && 
                (
                    this.Calculations == input.Calculations ||
                    this.Calculations != null &&
                    input.Calculations != null &&
                    this.Calculations.SequenceEqual(input.Calculations)
                ) && 
                (
                    this.JobSettings == input.JobSettings ||
                    (this.JobSettings != null &&
                    this.JobSettings.Equals(input.JobSettings))
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
                if (this.Securities != null)
                    hashCode = hashCode * 59 + this.Securities.GetHashCode();
                if (this.Calculations != null)
                    hashCode = hashCode * 59 + this.Calculations.GetHashCode();
                if (this.JobSettings != null)
                    hashCode = hashCode * 59 + this.JobSettings.GetHashCode();
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
