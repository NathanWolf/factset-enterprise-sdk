/*
 * Chart Generation Service
 *
 * This is a service for generating charts in a node environment that were created using web charting and get back images in form of `PNGs` and `JPEGs` as response.
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
using OpenAPIDateConverter = FactSet.SDK.ChartGenerationService.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ChartGenerationService.Model
{
    /// <summary>
    /// ChartList
    /// </summary>
    [DataContract(Name = "ChartList")]
    public partial class ChartList : IEquatable<ChartList>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ChartList" /> class.
        /// </summary>
        /// <param name="name">Name of the chart.</param>
        /// <param name="description">A short description about the chart and its contents.</param>
        /// <param name="tags">A list of tags to classify the chart. This is being done so that users can easily group them if required..</param>
        /// <param name="inputs">List of additional inputs for the chart.</param>
        public ChartList(string name = default(string), string description = default(string), List<string> tags = default(List<string>), List<ChartInput> inputs = default(List<ChartInput>))
        {
            this.Name = name;
            this.Description = description;
            this.Tags = tags;
            this.Inputs = inputs;
        }

        /// <summary>
        /// Name of the chart
        /// </summary>
        /// <value>Name of the chart</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// A short description about the chart and its contents
        /// </summary>
        /// <value>A short description about the chart and its contents</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// A list of tags to classify the chart. This is being done so that users can easily group them if required.
        /// </summary>
        /// <value>A list of tags to classify the chart. This is being done so that users can easily group them if required.</value>
        [DataMember(Name = "tags", EmitDefaultValue = false)]
        public List<string> Tags { get; set; }

        /// <summary>
        /// List of additional inputs for the chart
        /// </summary>
        /// <value>List of additional inputs for the chart</value>
        [DataMember(Name = "inputs", EmitDefaultValue = false)]
        public List<ChartInput> Inputs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ChartList {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
            sb.Append("  Inputs: ").Append(Inputs).Append("\n");
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
            return this.Equals(input as ChartList);
        }

        /// <summary>
        /// Returns true if ChartList instances are equal
        /// </summary>
        /// <param name="input">Instance of ChartList to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ChartList input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Tags == input.Tags ||
                    this.Tags != null &&
                    input.Tags != null &&
                    this.Tags.SequenceEqual(input.Tags)
                ) && 
                (
                    this.Inputs == input.Inputs ||
                    this.Inputs != null &&
                    input.Inputs != null &&
                    this.Inputs.SequenceEqual(input.Inputs)
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Tags != null)
                    hashCode = hashCode * 59 + this.Tags.GetHashCode();
                if (this.Inputs != null)
                    hashCode = hashCode * 59 + this.Inputs.GetHashCode();
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
