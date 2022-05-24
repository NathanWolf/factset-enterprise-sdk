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
    /// PACalculationColumn
    /// </summary>
    [DataContract(Name = "PACalculationColumn")]
    public partial class PACalculationColumn : IEquatable<PACalculationColumn>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PACalculationColumn" /> class.
        /// </summary>
        /// <param name="id">FactSet-defined or User-defined Column identifier..</param>
        /// <param name="statistics">Column Statistic identifier.</param>
        public PACalculationColumn(string id = default(string), List<string> statistics = default(List<string>))
        {
            this.Id = id;
            this.Statistics = statistics;
        }

        /// <summary>
        /// FactSet-defined or User-defined Column identifier.
        /// </summary>
        /// <value>FactSet-defined or User-defined Column identifier.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Column Statistic identifier
        /// </summary>
        /// <value>Column Statistic identifier</value>
        [DataMember(Name = "statistics", EmitDefaultValue = false)]
        public List<string> Statistics { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PACalculationColumn {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Statistics: ").Append(Statistics).Append("\n");
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
            return this.Equals(input as PACalculationColumn);
        }

        /// <summary>
        /// Returns true if PACalculationColumn instances are equal
        /// </summary>
        /// <param name="input">Instance of PACalculationColumn to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PACalculationColumn input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Statistics == input.Statistics ||
                    this.Statistics != null &&
                    input.Statistics != null &&
                    this.Statistics.SequenceEqual(input.Statistics)
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Statistics != null)
                {
                    hashCode = (hashCode * 59) + this.Statistics.GetHashCode();
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
