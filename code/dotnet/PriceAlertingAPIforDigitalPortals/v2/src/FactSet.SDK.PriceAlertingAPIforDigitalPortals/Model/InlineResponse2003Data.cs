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
using OpenAPIDateConverter = FactSet.SDK.PriceAlertingAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PriceAlertingAPIforDigitalPortals.Model
{
    /// <summary>
    /// InlineResponse2003Data
    /// </summary>
    [DataContract(Name = "inline_response_200_3_data")]
    public partial class InlineResponse2003Data : IEquatable<InlineResponse2003Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of the trigger..</param>
        /// <param name="creation">Date and time when the trigger was created..</param>
        /// <param name="notation">notation.</param>
        /// <param name="price">price.</param>
        /// <param name="range">range.</param>
        /// <param name="comment">Comment of the trigger..</param>
        /// <param name="status">status.</param>
        public InlineResponse2003Data(string id = default(string), string creation = default(string), InlineResponse200DataTriggerNotation notation = default(InlineResponse200DataTriggerNotation), InlineResponse2001TriggerPrice price = default(InlineResponse2001TriggerPrice), InlineResponse2003Range range = default(InlineResponse2003Range), string comment = default(string), InlineResponse2001TriggerStatus status = default(InlineResponse2001TriggerStatus))
        {
            this.Id = id;
            this.Creation = creation;
            this.Notation = notation;
            this.Price = price;
            this.Range = range;
            this.Comment = comment;
            this.Status = status;
        }

        /// <summary>
        /// Identifier of the trigger.
        /// </summary>
        /// <value>Identifier of the trigger.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Date and time when the trigger was created.
        /// </summary>
        /// <value>Date and time when the trigger was created.</value>
        [DataMember(Name = "creation", EmitDefaultValue = false)]
        public string Creation { get; set; }

        /// <summary>
        /// Gets or Sets Notation
        /// </summary>
        [DataMember(Name = "notation", EmitDefaultValue = false)]
        public InlineResponse200DataTriggerNotation Notation { get; set; }

        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public InlineResponse2001TriggerPrice Price { get; set; }

        /// <summary>
        /// Gets or Sets Range
        /// </summary>
        [DataMember(Name = "range", EmitDefaultValue = false)]
        public InlineResponse2003Range Range { get; set; }

        /// <summary>
        /// Comment of the trigger.
        /// </summary>
        /// <value>Comment of the trigger.</value>
        [DataMember(Name = "comment", EmitDefaultValue = false)]
        public string Comment { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public InlineResponse2001TriggerStatus Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2003Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Creation: ").Append(Creation).Append("\n");
            sb.Append("  Notation: ").Append(Notation).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Range: ").Append(Range).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
            return this.Equals(input as InlineResponse2003Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2003Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003Data input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Creation == input.Creation ||
                    (this.Creation != null &&
                    this.Creation.Equals(input.Creation))
                ) && 
                (
                    this.Notation == input.Notation ||
                    (this.Notation != null &&
                    this.Notation.Equals(input.Notation))
                ) && 
                (
                    this.Price == input.Price ||
                    (this.Price != null &&
                    this.Price.Equals(input.Price))
                ) && 
                (
                    this.Range == input.Range ||
                    (this.Range != null &&
                    this.Range.Equals(input.Range))
                ) && 
                (
                    this.Comment == input.Comment ||
                    (this.Comment != null &&
                    this.Comment.Equals(input.Comment))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
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
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Creation != null)
                    hashCode = hashCode * 59 + this.Creation.GetHashCode();
                if (this.Notation != null)
                    hashCode = hashCode * 59 + this.Notation.GetHashCode();
                if (this.Price != null)
                    hashCode = hashCode * 59 + this.Price.GetHashCode();
                if (this.Range != null)
                    hashCode = hashCode * 59 + this.Range.GetHashCode();
                if (this.Comment != null)
                    hashCode = hashCode * 59 + this.Comment.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
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
