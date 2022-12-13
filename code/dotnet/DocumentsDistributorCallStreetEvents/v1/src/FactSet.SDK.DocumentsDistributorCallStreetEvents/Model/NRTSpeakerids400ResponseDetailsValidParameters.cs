/*
 * Documents Distributor - CallStreet Events
 *
 * CallStreet Events contains all the Documents Distributor APIs that offer events data such as Events Audio and Near Real-Time Transcripts.  The  Events Audio API provides access to historical as well as latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service. 
 *
 * The version of the OpenAPI document: 1.8.1
 * Contact: teamustang@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.DocumentsDistributorCallStreetEvents.Client.OpenAPIDateConverter;

namespace FactSet.SDK.DocumentsDistributorCallStreetEvents.Model
{
    /// <summary>
    /// NRTSpeakerids400ResponseDetailsValidParameters
    /// </summary>
    [DataContract(Name = "NRT_Speakerids_400_Response_details_validParameters")]
    public partial class NRTSpeakerids400ResponseDetailsValidParameters : IEquatable<NRTSpeakerids400ResponseDetailsValidParameters>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NRTSpeakerids400ResponseDetailsValidParameters" /> class.
        /// </summary>
        /// <param name="sort">sort.</param>
        /// <param name="paginationLimit">paginationLimit.</param>
        /// <param name="paginationOffset">paginationOffset.</param>
        /// <param name="audioSourceId">audioSourceId.</param>
        public NRTSpeakerids400ResponseDetailsValidParameters(List<string> sort = default(List<string>), List<string> paginationLimit = default(List<string>), List<string> paginationOffset = default(List<string>), List<string> audioSourceId = default(List<string>))
        {
            this.Sort = sort;
            this.PaginationLimit = paginationLimit;
            this.PaginationOffset = paginationOffset;
            this.AudioSourceId = audioSourceId;
        }

        /// <summary>
        /// Gets or Sets Sort
        /// </summary>
        [DataMember(Name = "_sort", EmitDefaultValue = false)]
        public List<string> Sort { get; set; }

        /// <summary>
        /// Gets or Sets PaginationLimit
        /// </summary>
        [DataMember(Name = "_paginationLimit", EmitDefaultValue = false)]
        public List<string> PaginationLimit { get; set; }

        /// <summary>
        /// Gets or Sets PaginationOffset
        /// </summary>
        [DataMember(Name = "_paginationOffset", EmitDefaultValue = false)]
        public List<string> PaginationOffset { get; set; }

        /// <summary>
        /// Gets or Sets AudioSourceId
        /// </summary>
        [DataMember(Name = "audioSourceId", EmitDefaultValue = false)]
        public List<string> AudioSourceId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NRTSpeakerids400ResponseDetailsValidParameters {\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
            sb.Append("  PaginationLimit: ").Append(PaginationLimit).Append("\n");
            sb.Append("  PaginationOffset: ").Append(PaginationOffset).Append("\n");
            sb.Append("  AudioSourceId: ").Append(AudioSourceId).Append("\n");
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
            return this.Equals(input as NRTSpeakerids400ResponseDetailsValidParameters);
        }

        /// <summary>
        /// Returns true if NRTSpeakerids400ResponseDetailsValidParameters instances are equal
        /// </summary>
        /// <param name="input">Instance of NRTSpeakerids400ResponseDetailsValidParameters to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NRTSpeakerids400ResponseDetailsValidParameters input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Sort == input.Sort ||
                    this.Sort != null &&
                    input.Sort != null &&
                    this.Sort.SequenceEqual(input.Sort)
                ) && 
                (
                    this.PaginationLimit == input.PaginationLimit ||
                    this.PaginationLimit != null &&
                    input.PaginationLimit != null &&
                    this.PaginationLimit.SequenceEqual(input.PaginationLimit)
                ) && 
                (
                    this.PaginationOffset == input.PaginationOffset ||
                    this.PaginationOffset != null &&
                    input.PaginationOffset != null &&
                    this.PaginationOffset.SequenceEqual(input.PaginationOffset)
                ) && 
                (
                    this.AudioSourceId == input.AudioSourceId ||
                    this.AudioSourceId != null &&
                    input.AudioSourceId != null &&
                    this.AudioSourceId.SequenceEqual(input.AudioSourceId)
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
                if (this.Sort != null)
                {
                    hashCode = (hashCode * 59) + this.Sort.GetHashCode();
                }
                if (this.PaginationLimit != null)
                {
                    hashCode = (hashCode * 59) + this.PaginationLimit.GetHashCode();
                }
                if (this.PaginationOffset != null)
                {
                    hashCode = (hashCode * 59) + this.PaginationOffset.GetHashCode();
                }
                if (this.AudioSourceId != null)
                {
                    hashCode = (hashCode * 59) + this.AudioSourceId.GetHashCode();
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
