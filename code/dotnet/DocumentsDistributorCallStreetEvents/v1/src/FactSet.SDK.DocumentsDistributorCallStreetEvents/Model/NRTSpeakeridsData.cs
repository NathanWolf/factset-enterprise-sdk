/*
 * Documents Distributor - CallStreet Events
 *
 * CallStreet Events contains all the Documents Distributor APIs that provide events data such as Events Audio and Near Real-Time Transcripts  The  Events Audio API provides access to all audio recordings to various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.
 *
 * The version of the OpenAPI document: 3.0.0
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
    /// NRTSpeakeridsData
    /// </summary>
    [DataContract(Name = "NRT_Speakerids_data")]
    public partial class NRTSpeakeridsData : IEquatable<NRTSpeakeridsData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NRTSpeakeridsData" /> class.
        /// </summary>
        /// <param name="audioSourceId">The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids..</param>
        /// <param name="speakerStartOffset">The number of seconds into the call when a speaker starts / is speaking.</param>
        /// <param name="speakerId">A unique identifier for a speaker.</param>
        /// <param name="cosineScore">The cosine similarity score (Confidence score)  for a particular speaker.  A score &gt; 0.5 while a key-speaker is speaking can be considered as a high confidence in the predicted speaker  Negative and null cosine scores are eliminated from the speakerid result set as they are the predictions due to either music or silence in the call  Only the Speakerids with the highest cosineScore are rendered in the result set.</param>
        public NRTSpeakeridsData(int audioSourceId = default(int), decimal speakerStartOffset = default(decimal), string speakerId = default(string), decimal cosineScore = default(decimal))
        {
            this.AudioSourceId = audioSourceId;
            this.SpeakerStartOffset = speakerStartOffset;
            this.SpeakerId = speakerId;
            this.CosineScore = cosineScore;
        }

        /// <summary>
        /// The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids.
        /// </summary>
        /// <value>The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids.</value>
        [DataMember(Name = "audioSourceId", EmitDefaultValue = false)]
        public int AudioSourceId { get; set; }

        /// <summary>
        /// The number of seconds into the call when a speaker starts / is speaking
        /// </summary>
        /// <value>The number of seconds into the call when a speaker starts / is speaking</value>
        [DataMember(Name = "speakerStartOffset", EmitDefaultValue = false)]
        public decimal SpeakerStartOffset { get; set; }

        /// <summary>
        /// A unique identifier for a speaker
        /// </summary>
        /// <value>A unique identifier for a speaker</value>
        [DataMember(Name = "speakerId", EmitDefaultValue = false)]
        public string SpeakerId { get; set; }

        /// <summary>
        /// The cosine similarity score (Confidence score)  for a particular speaker.  A score &gt; 0.5 while a key-speaker is speaking can be considered as a high confidence in the predicted speaker  Negative and null cosine scores are eliminated from the speakerid result set as they are the predictions due to either music or silence in the call  Only the Speakerids with the highest cosineScore are rendered in the result set
        /// </summary>
        /// <value>The cosine similarity score (Confidence score)  for a particular speaker.  A score &gt; 0.5 while a key-speaker is speaking can be considered as a high confidence in the predicted speaker  Negative and null cosine scores are eliminated from the speakerid result set as they are the predictions due to either music or silence in the call  Only the Speakerids with the highest cosineScore are rendered in the result set</value>
        [DataMember(Name = "cosineScore", EmitDefaultValue = false)]
        public decimal CosineScore { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NRTSpeakeridsData {\n");
            sb.Append("  AudioSourceId: ").Append(AudioSourceId).Append("\n");
            sb.Append("  SpeakerStartOffset: ").Append(SpeakerStartOffset).Append("\n");
            sb.Append("  SpeakerId: ").Append(SpeakerId).Append("\n");
            sb.Append("  CosineScore: ").Append(CosineScore).Append("\n");
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
            return this.Equals(input as NRTSpeakeridsData);
        }

        /// <summary>
        /// Returns true if NRTSpeakeridsData instances are equal
        /// </summary>
        /// <param name="input">Instance of NRTSpeakeridsData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NRTSpeakeridsData input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AudioSourceId == input.AudioSourceId ||
                    this.AudioSourceId.Equals(input.AudioSourceId)
                ) && 
                (
                    this.SpeakerStartOffset == input.SpeakerStartOffset ||
                    this.SpeakerStartOffset.Equals(input.SpeakerStartOffset)
                ) && 
                (
                    this.SpeakerId == input.SpeakerId ||
                    (this.SpeakerId != null &&
                    this.SpeakerId.Equals(input.SpeakerId))
                ) && 
                (
                    this.CosineScore == input.CosineScore ||
                    this.CosineScore.Equals(input.CosineScore)
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
                hashCode = hashCode * 59 + this.AudioSourceId.GetHashCode();
                hashCode = hashCode * 59 + this.SpeakerStartOffset.GetHashCode();
                if (this.SpeakerId != null)
                    hashCode = hashCode * 59 + this.SpeakerId.GetHashCode();
                hashCode = hashCode * 59 + this.CosineScore.GetHashCode();
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
