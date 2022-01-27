/*
 * IRN API v1
 *
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.IRNMeetings.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNMeetings.Model
{
    /// <summary>
    /// MeetingEventDto
    /// </summary>
    [DataContract(Name = "MeetingEventDto")]
    public partial class MeetingEventDto : IEquatable<MeetingEventDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MeetingEventDto" /> class.
        /// </summary>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="type">type.</param>
        /// <param name="user">user.</param>
        /// <param name="changeList">changeList.</param>
        public MeetingEventDto(string createdAt = default(string), string type = default(string), string user = default(string), List<RecordChangeDto> changeList = default(List<RecordChangeDto>))
        {
            this.CreatedAt = createdAt;
            this.Type = type;
            this.User = user;
            this.ChangeList = changeList;
        }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        [DataMember(Name = "createdAt", EmitDefaultValue = true)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = true)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name = "user", EmitDefaultValue = true)]
        public string User { get; set; }

        /// <summary>
        /// Gets or Sets ChangeList
        /// </summary>
        [DataMember(Name = "changeList", EmitDefaultValue = true)]
        public List<RecordChangeDto> ChangeList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MeetingEventDto {\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("  ChangeList: ").Append(ChangeList).Append("\n");
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
            return this.Equals(input as MeetingEventDto);
        }

        /// <summary>
        /// Returns true if MeetingEventDto instances are equal
        /// </summary>
        /// <param name="input">Instance of MeetingEventDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MeetingEventDto input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.User == input.User ||
                    (this.User != null &&
                    this.User.Equals(input.User))
                ) && 
                (
                    this.ChangeList == input.ChangeList ||
                    this.ChangeList != null &&
                    input.ChangeList != null &&
                    this.ChangeList.SequenceEqual(input.ChangeList)
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
                if (this.CreatedAt != null)
                    hashCode = hashCode * 59 + this.CreatedAt.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.User != null)
                    hashCode = hashCode * 59 + this.User.GetHashCode();
                if (this.ChangeList != null)
                    hashCode = hashCode * 59 + this.ChangeList.GetHashCode();
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
