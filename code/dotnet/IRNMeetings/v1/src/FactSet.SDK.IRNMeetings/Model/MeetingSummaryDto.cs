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
    /// MeetingSummaryDto
    /// </summary>
    [DataContract(Name = "MeetingSummaryDto")]
    public partial class MeetingSummaryDto : IEquatable<MeetingSummaryDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MeetingSummaryDto" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="start">start.</param>
        /// <param name="end">end.</param>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="authorId">authorId.</param>
        /// <param name="title">title.</param>
        /// <param name="identifier">identifier.</param>
        /// <param name="organizer">organizer.</param>
        /// <param name="organizerId">organizerId.</param>
        /// <param name="attachmentIds">attachmentIds.</param>
        /// <param name="relatedSymbols">relatedSymbols.</param>
        /// <param name="locations">locations.</param>
        /// <param name="attendees">attendees.</param>
        /// <param name="customFieldValues">customFieldValues.</param>
        public MeetingSummaryDto(Guid id = default(Guid), string start = default(string), string end = default(string), string createdAt = default(string), Guid authorId = default(Guid), string title = default(string), string identifier = default(string), string organizer = default(string), Guid organizerId = default(Guid), List<Guid> attachmentIds = default(List<Guid>), List<string> relatedSymbols = default(List<string>), List<LocationDto> locations = default(List<LocationDto>), List<AttendeeDto> attendees = default(List<AttendeeDto>), List<CustomFieldValueDto> customFieldValues = default(List<CustomFieldValueDto>))
        {
            this.Id = id;
            this.Start = start;
            this.End = end;
            this.CreatedAt = createdAt;
            this.AuthorId = authorId;
            this.Title = title;
            this.Identifier = identifier;
            this.Organizer = organizer;
            this.OrganizerId = organizerId;
            this.AttachmentIds = attachmentIds;
            this.RelatedSymbols = relatedSymbols;
            this.Locations = locations;
            this.Attendees = attendees;
            this.CustomFieldValues = customFieldValues;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [DataMember(Name = "start", EmitDefaultValue = true)]
        public string Start { get; set; }

        /// <summary>
        /// Gets or Sets End
        /// </summary>
        [DataMember(Name = "end", EmitDefaultValue = true)]
        public string End { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        [DataMember(Name = "createdAt", EmitDefaultValue = true)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets AuthorId
        /// </summary>
        [DataMember(Name = "authorId", EmitDefaultValue = false)]
        public Guid AuthorId { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name = "title", EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Identifier
        /// </summary>
        [DataMember(Name = "identifier", EmitDefaultValue = true)]
        public string Identifier { get; set; }

        /// <summary>
        /// Gets or Sets Organizer
        /// </summary>
        [DataMember(Name = "organizer", EmitDefaultValue = true)]
        [Obsolete]
        public string Organizer { get; set; }

        /// <summary>
        /// Gets or Sets OrganizerId
        /// </summary>
        [DataMember(Name = "organizerId", EmitDefaultValue = false)]
        public Guid OrganizerId { get; set; }

        /// <summary>
        /// Gets or Sets AttachmentIds
        /// </summary>
        [DataMember(Name = "attachmentIds", EmitDefaultValue = true)]
        public List<Guid> AttachmentIds { get; set; }

        /// <summary>
        /// Gets or Sets RelatedSymbols
        /// </summary>
        [DataMember(Name = "relatedSymbols", EmitDefaultValue = true)]
        public List<string> RelatedSymbols { get; set; }

        /// <summary>
        /// Gets or Sets Locations
        /// </summary>
        [DataMember(Name = "locations", EmitDefaultValue = true)]
        public List<LocationDto> Locations { get; set; }

        /// <summary>
        /// Gets or Sets Attendees
        /// </summary>
        [DataMember(Name = "attendees", EmitDefaultValue = true)]
        public List<AttendeeDto> Attendees { get; set; }

        /// <summary>
        /// Gets or Sets CustomFieldValues
        /// </summary>
        [DataMember(Name = "customFieldValues", EmitDefaultValue = true)]
        public List<CustomFieldValueDto> CustomFieldValues { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MeetingSummaryDto {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  AuthorId: ").Append(AuthorId).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
            sb.Append("  Organizer: ").Append(Organizer).Append("\n");
            sb.Append("  OrganizerId: ").Append(OrganizerId).Append("\n");
            sb.Append("  AttachmentIds: ").Append(AttachmentIds).Append("\n");
            sb.Append("  RelatedSymbols: ").Append(RelatedSymbols).Append("\n");
            sb.Append("  Locations: ").Append(Locations).Append("\n");
            sb.Append("  Attendees: ").Append(Attendees).Append("\n");
            sb.Append("  CustomFieldValues: ").Append(CustomFieldValues).Append("\n");
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
            return this.Equals(input as MeetingSummaryDto);
        }

        /// <summary>
        /// Returns true if MeetingSummaryDto instances are equal
        /// </summary>
        /// <param name="input">Instance of MeetingSummaryDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MeetingSummaryDto input)
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
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.End == input.End ||
                    (this.End != null &&
                    this.End.Equals(input.End))
                ) && 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.AuthorId == input.AuthorId ||
                    (this.AuthorId != null &&
                    this.AuthorId.Equals(input.AuthorId))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Identifier == input.Identifier ||
                    (this.Identifier != null &&
                    this.Identifier.Equals(input.Identifier))
                ) && 
                (
                    this.Organizer == input.Organizer ||
                    (this.Organizer != null &&
                    this.Organizer.Equals(input.Organizer))
                ) && 
                (
                    this.OrganizerId == input.OrganizerId ||
                    (this.OrganizerId != null &&
                    this.OrganizerId.Equals(input.OrganizerId))
                ) && 
                (
                    this.AttachmentIds == input.AttachmentIds ||
                    this.AttachmentIds != null &&
                    input.AttachmentIds != null &&
                    this.AttachmentIds.SequenceEqual(input.AttachmentIds)
                ) && 
                (
                    this.RelatedSymbols == input.RelatedSymbols ||
                    this.RelatedSymbols != null &&
                    input.RelatedSymbols != null &&
                    this.RelatedSymbols.SequenceEqual(input.RelatedSymbols)
                ) && 
                (
                    this.Locations == input.Locations ||
                    this.Locations != null &&
                    input.Locations != null &&
                    this.Locations.SequenceEqual(input.Locations)
                ) && 
                (
                    this.Attendees == input.Attendees ||
                    this.Attendees != null &&
                    input.Attendees != null &&
                    this.Attendees.SequenceEqual(input.Attendees)
                ) && 
                (
                    this.CustomFieldValues == input.CustomFieldValues ||
                    this.CustomFieldValues != null &&
                    input.CustomFieldValues != null &&
                    this.CustomFieldValues.SequenceEqual(input.CustomFieldValues)
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
                if (this.Start != null)
                {
                    hashCode = (hashCode * 59) + this.Start.GetHashCode();
                }
                if (this.End != null)
                {
                    hashCode = (hashCode * 59) + this.End.GetHashCode();
                }
                if (this.CreatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
                }
                if (this.AuthorId != null)
                {
                    hashCode = (hashCode * 59) + this.AuthorId.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.Identifier != null)
                {
                    hashCode = (hashCode * 59) + this.Identifier.GetHashCode();
                }
                if (this.Organizer != null)
                {
                    hashCode = (hashCode * 59) + this.Organizer.GetHashCode();
                }
                if (this.OrganizerId != null)
                {
                    hashCode = (hashCode * 59) + this.OrganizerId.GetHashCode();
                }
                if (this.AttachmentIds != null)
                {
                    hashCode = (hashCode * 59) + this.AttachmentIds.GetHashCode();
                }
                if (this.RelatedSymbols != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedSymbols.GetHashCode();
                }
                if (this.Locations != null)
                {
                    hashCode = (hashCode * 59) + this.Locations.GetHashCode();
                }
                if (this.Attendees != null)
                {
                    hashCode = (hashCode * 59) + this.Attendees.GetHashCode();
                }
                if (this.CustomFieldValues != null)
                {
                    hashCode = (hashCode * 59) + this.CustomFieldValues.GetHashCode();
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
