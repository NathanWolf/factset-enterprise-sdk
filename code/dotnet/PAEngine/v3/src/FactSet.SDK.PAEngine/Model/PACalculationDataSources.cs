/*
 * PA Engine API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
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
using OpenAPIDateConverter = FactSet.SDK.PAEngine.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PAEngine.Model
{
    /// <summary>
    /// PACalculationDataSources
    /// </summary>
    [DataContract(Name = "PACalculationDataSources")]
    public partial class PACalculationDataSources : IEquatable<PACalculationDataSources>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PACalculationDataSources" /> class.
        /// </summary>
        /// <param name="portfoliopricingsources">List of portfilio pricing source for the PA calculation.</param>
        /// <param name="benchmarkpricingsources">List of benchmark pricing source for the PA calculation.</param>
        /// <param name="useportfoliopricingsourcesforbenchmark">Use portfolio pricing sources for benchmark.</param>
        public PACalculationDataSources(List<PACalculationPricingSource> portfoliopricingsources = default(List<PACalculationPricingSource>), List<PACalculationPricingSource> benchmarkpricingsources = default(List<PACalculationPricingSource>), bool useportfoliopricingsourcesforbenchmark = default(bool))
        {
            this.Portfoliopricingsources = portfoliopricingsources;
            this.Benchmarkpricingsources = benchmarkpricingsources;
            this.Useportfoliopricingsourcesforbenchmark = useportfoliopricingsourcesforbenchmark;
        }

        /// <summary>
        /// List of portfilio pricing source for the PA calculation
        /// </summary>
        /// <value>List of portfilio pricing source for the PA calculation</value>
        [DataMember(Name = "portfoliopricingsources", EmitDefaultValue = false)]
        public List<PACalculationPricingSource> Portfoliopricingsources { get; set; }

        /// <summary>
        /// List of benchmark pricing source for the PA calculation
        /// </summary>
        /// <value>List of benchmark pricing source for the PA calculation</value>
        [DataMember(Name = "benchmarkpricingsources", EmitDefaultValue = false)]
        public List<PACalculationPricingSource> Benchmarkpricingsources { get; set; }

        /// <summary>
        /// Use portfolio pricing sources for benchmark
        /// </summary>
        /// <value>Use portfolio pricing sources for benchmark</value>
        [DataMember(Name = "useportfoliopricingsourcesforbenchmark", EmitDefaultValue = true)]
        public bool Useportfoliopricingsourcesforbenchmark { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PACalculationDataSources {\n");
            sb.Append("  Portfoliopricingsources: ").Append(Portfoliopricingsources).Append("\n");
            sb.Append("  Benchmarkpricingsources: ").Append(Benchmarkpricingsources).Append("\n");
            sb.Append("  Useportfoliopricingsourcesforbenchmark: ").Append(Useportfoliopricingsourcesforbenchmark).Append("\n");
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
            return this.Equals(input as PACalculationDataSources);
        }

        /// <summary>
        /// Returns true if PACalculationDataSources instances are equal
        /// </summary>
        /// <param name="input">Instance of PACalculationDataSources to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PACalculationDataSources input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Portfoliopricingsources == input.Portfoliopricingsources ||
                    this.Portfoliopricingsources != null &&
                    input.Portfoliopricingsources != null &&
                    this.Portfoliopricingsources.SequenceEqual(input.Portfoliopricingsources)
                ) && 
                (
                    this.Benchmarkpricingsources == input.Benchmarkpricingsources ||
                    this.Benchmarkpricingsources != null &&
                    input.Benchmarkpricingsources != null &&
                    this.Benchmarkpricingsources.SequenceEqual(input.Benchmarkpricingsources)
                ) && 
                (
                    this.Useportfoliopricingsourcesforbenchmark == input.Useportfoliopricingsourcesforbenchmark ||
                    this.Useportfoliopricingsourcesforbenchmark.Equals(input.Useportfoliopricingsourcesforbenchmark)
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
                if (this.Portfoliopricingsources != null)
                {
                    hashCode = (hashCode * 59) + this.Portfoliopricingsources.GetHashCode();
                }
                if (this.Benchmarkpricingsources != null)
                {
                    hashCode = (hashCode * 59) + this.Benchmarkpricingsources.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Useportfoliopricingsourcesforbenchmark.GetHashCode();
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
