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
using OpenAPIDateConverter = FactSet.SDK.RecommendationListAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RecommendationListAPIforDigitalPortals.Model
{
    /// <summary>
    /// Revision
    /// </summary>
    [DataContract(Name = "inline_response_200_3_data")]
    public partial class InlineResponse2003Data : IEquatable<InlineResponse2003Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of the revision..</param>
        /// <param name="types">Set of types assigned to the recommendation list as of the given revision. The customer maintains a list of valid types for all of its recommendation lists..</param>
        /// <param name="title">Title assigned to the recommendation list as of the given revision..</param>
        /// <param name="description">Description assigned to the recommendation list as of the given revision..</param>
        /// <param name="activeRange">activeRange.</param>
        /// <param name="instrument">instrument.</param>
        public InlineResponse2003Data(decimal id = default(decimal), List<InlineResponse2002DataTypes> types = default(List<InlineResponse2002DataTypes>), string title = default(string), string description = default(string), InlineResponse200DataActiveRevisionActiveRange activeRange = default(InlineResponse200DataActiveRevisionActiveRange), InlineResponse2002DataInstrument instrument = default(InlineResponse2002DataInstrument))
        {
            this.Id = id;
            this.Types = types;
            this.Title = title;
            this.Description = description;
            this.ActiveRange = activeRange;
            this.Instrument = instrument;
        }

        /// <summary>
        /// Identifier of the revision.
        /// </summary>
        /// <value>Identifier of the revision.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// Set of types assigned to the recommendation list as of the given revision. The customer maintains a list of valid types for all of its recommendation lists.
        /// </summary>
        /// <value>Set of types assigned to the recommendation list as of the given revision. The customer maintains a list of valid types for all of its recommendation lists.</value>
        [DataMember(Name = "types", EmitDefaultValue = false)]
        public List<InlineResponse2002DataTypes> Types { get; set; }

        /// <summary>
        /// Title assigned to the recommendation list as of the given revision.
        /// </summary>
        /// <value>Title assigned to the recommendation list as of the given revision.</value>
        [DataMember(Name = "title", EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// Description assigned to the recommendation list as of the given revision.
        /// </summary>
        /// <value>Description assigned to the recommendation list as of the given revision.</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets ActiveRange
        /// </summary>
        [DataMember(Name = "activeRange", EmitDefaultValue = false)]
        public InlineResponse200DataActiveRevisionActiveRange ActiveRange { get; set; }

        /// <summary>
        /// Gets or Sets Instrument
        /// </summary>
        [DataMember(Name = "instrument", EmitDefaultValue = false)]
        public InlineResponse2002DataInstrument Instrument { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2003Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Types: ").Append(Types).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  ActiveRange: ").Append(ActiveRange).Append("\n");
            sb.Append("  Instrument: ").Append(Instrument).Append("\n");
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
                    this.Id.Equals(input.Id)
                ) && 
                (
                    this.Types == input.Types ||
                    this.Types != null &&
                    input.Types != null &&
                    this.Types.SequenceEqual(input.Types)
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.ActiveRange == input.ActiveRange ||
                    (this.ActiveRange != null &&
                    this.ActiveRange.Equals(input.ActiveRange))
                ) && 
                (
                    this.Instrument == input.Instrument ||
                    (this.Instrument != null &&
                    this.Instrument.Equals(input.Instrument))
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
                hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Types != null)
                    hashCode = hashCode * 59 + this.Types.GetHashCode();
                if (this.Title != null)
                    hashCode = hashCode * 59 + this.Title.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.ActiveRange != null)
                    hashCode = hashCode * 59 + this.ActiveRange.GetHashCode();
                if (this.Instrument != null)
                    hashCode = hashCode * 59 + this.Instrument.GetHashCode();
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
