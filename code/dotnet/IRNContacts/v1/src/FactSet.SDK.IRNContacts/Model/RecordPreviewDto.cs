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
using OpenAPIDateConverter = FactSet.SDK.IRNContacts.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNContacts.Model
{
    /// <summary>
    /// RecordPreviewDto
    /// </summary>
    [DataContract(Name = "RecordPreviewDto")]
    public partial class RecordPreviewDto : IEquatable<RecordPreviewDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RecordPreviewDto" /> class.
        /// </summary>
        /// <param name="noteGuid">noteGuid.</param>
        /// <param name="meetingGuid">meetingGuid.</param>
        /// <param name="title">title.</param>
        /// <param name="date">date.</param>
        public RecordPreviewDto(Guid? noteGuid = default(Guid?), Guid? meetingGuid = default(Guid?), string title = default(string), DateTime date = default(DateTime))
        {
            this.NoteGuid = noteGuid;
            this.MeetingGuid = meetingGuid;
            this.Title = title;
            this.Date = date;
        }

        /// <summary>
        /// Gets or Sets NoteGuid
        /// </summary>
        [DataMember(Name = "noteGuid", EmitDefaultValue = true)]
        public Guid? NoteGuid { get; set; }

        /// <summary>
        /// Gets or Sets MeetingGuid
        /// </summary>
        [DataMember(Name = "meetingGuid", EmitDefaultValue = true)]
        public Guid? MeetingGuid { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name = "title", EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        public DateTime Date { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RecordPreviewDto {\n");
            sb.Append("  NoteGuid: ").Append(NoteGuid).Append("\n");
            sb.Append("  MeetingGuid: ").Append(MeetingGuid).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
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
            return this.Equals(input as RecordPreviewDto);
        }

        /// <summary>
        /// Returns true if RecordPreviewDto instances are equal
        /// </summary>
        /// <param name="input">Instance of RecordPreviewDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RecordPreviewDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.NoteGuid == input.NoteGuid ||
                    (this.NoteGuid != null &&
                    this.NoteGuid.Equals(input.NoteGuid))
                ) && 
                (
                    this.MeetingGuid == input.MeetingGuid ||
                    (this.MeetingGuid != null &&
                    this.MeetingGuid.Equals(input.MeetingGuid))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
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
                if (this.NoteGuid != null)
                {
                    hashCode = (hashCode * 59) + this.NoteGuid.GetHashCode();
                }
                if (this.MeetingGuid != null)
                {
                    hashCode = (hashCode * 59) + this.MeetingGuid.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
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
