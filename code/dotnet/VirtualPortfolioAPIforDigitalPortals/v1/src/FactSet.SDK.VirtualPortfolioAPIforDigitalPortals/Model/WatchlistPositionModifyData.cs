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
using OpenAPIDateConverter = FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model
{
    /// <summary>
    /// The data member contains the request&#39;s primary data.
    /// </summary>
    [DataContract(Name = "_watchlist_position_modify_data")]
    public partial class WatchlistPositionModifyData : IEquatable<WatchlistPositionModifyData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WatchlistPositionModifyData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected WatchlistPositionModifyData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="WatchlistPositionModifyData" /> class.
        /// </summary>
        /// <param name="id">Identifier of the watchlist. (required).</param>
        /// <param name="position">position (required).</param>
        /// <param name="notation">notation.</param>
        /// <param name="comment">Personal note for the watchlist position..</param>
        public WatchlistPositionModifyData(string id = default(string), WatchlistPositionModifyDataPosition position = default(WatchlistPositionModifyDataPosition), PortfolioTransactionCreateDataNotation notation = default(PortfolioTransactionCreateDataNotation), string comment = default(string))
        {
            // to ensure "id" is required (not null)
            if (id == null) {
                throw new ArgumentNullException("id is a required property for WatchlistPositionModifyData and cannot be null");
            }
            this.Id = id;
            // to ensure "position" is required (not null)
            if (position == null) {
                throw new ArgumentNullException("position is a required property for WatchlistPositionModifyData and cannot be null");
            }
            this.Position = position;
            this.Notation = notation;
            this.Comment = comment;
        }

        /// <summary>
        /// Identifier of the watchlist.
        /// </summary>
        /// <value>Identifier of the watchlist.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Position
        /// </summary>
        [DataMember(Name = "position", IsRequired = true, EmitDefaultValue = false)]
        public WatchlistPositionModifyDataPosition Position { get; set; }

        /// <summary>
        /// Gets or Sets Notation
        /// </summary>
        [DataMember(Name = "notation", EmitDefaultValue = false)]
        public PortfolioTransactionCreateDataNotation Notation { get; set; }

        /// <summary>
        /// Personal note for the watchlist position.
        /// </summary>
        /// <value>Personal note for the watchlist position.</value>
        [DataMember(Name = "comment", EmitDefaultValue = false)]
        public string Comment { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WatchlistPositionModifyData {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
            sb.Append("  Notation: ").Append(Notation).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
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
            return this.Equals(input as WatchlistPositionModifyData);
        }

        /// <summary>
        /// Returns true if WatchlistPositionModifyData instances are equal
        /// </summary>
        /// <param name="input">Instance of WatchlistPositionModifyData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WatchlistPositionModifyData input)
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
                    this.Position == input.Position ||
                    (this.Position != null &&
                    this.Position.Equals(input.Position))
                ) && 
                (
                    this.Notation == input.Notation ||
                    (this.Notation != null &&
                    this.Notation.Equals(input.Notation))
                ) && 
                (
                    this.Comment == input.Comment ||
                    (this.Comment != null &&
                    this.Comment.Equals(input.Comment))
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
                if (this.Position != null)
                    hashCode = hashCode * 59 + this.Position.GetHashCode();
                if (this.Notation != null)
                    hashCode = hashCode * 59 + this.Notation.GetHashCode();
                if (this.Comment != null)
                    hashCode = hashCode * 59 + this.Comment.GetHashCode();
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
            // Comment (string) maxLength
            if(this.Comment != null && this.Comment.Length > 200)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Comment, length must be less than 200.", new [] { "Comment" });
            }

            // Comment (string) pattern
            Regex regexComment = new Regex(@"^[\\u0020-\\u005d\\u005f\\u0061-\\u007e\\u00c0-\\u00ff\\u20ac]*$", RegexOptions.CultureInvariant);
            if (false == regexComment.Match(this.Comment).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Comment, must match a pattern of " + regexComment, new [] { "Comment" });
            }

            yield break;
        }
    }

}
