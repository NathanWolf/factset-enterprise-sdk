/*
 * VRS API documentation
 *
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.Vermilion.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Vermilion.Model
{
    /// <summary>
    /// ScimGroupListResponse
    /// </summary>
    [DataContract(Name = "ScimGroupListResponse")]
    public partial class ScimGroupListResponse : IEquatable<ScimGroupListResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ScimGroupListResponse" /> class.
        /// </summary>
        /// <param name="totalResults">totalResults.</param>
        /// <param name="itemsPerPage">itemsPerPage.</param>
        /// <param name="startIndex">startIndex.</param>
        /// <param name="resources">resources.</param>
        public ScimGroupListResponse(int totalResults = default(int), int itemsPerPage = default(int), int startIndex = default(int), List<ScimGroup> resources = default(List<ScimGroup>))
        {
            this.TotalResults = totalResults;
            this.ItemsPerPage = itemsPerPage;
            this.StartIndex = startIndex;
            this.Resources = resources;
        }

        /// <summary>
        /// Gets or Sets TotalResults
        /// </summary>
        [DataMember(Name = "totalResults", EmitDefaultValue = false)]
        public int TotalResults { get; set; }

        /// <summary>
        /// Gets or Sets ItemsPerPage
        /// </summary>
        [DataMember(Name = "itemsPerPage", EmitDefaultValue = false)]
        public int ItemsPerPage { get; set; }

        /// <summary>
        /// Gets or Sets StartIndex
        /// </summary>
        [DataMember(Name = "startIndex", EmitDefaultValue = false)]
        public int StartIndex { get; set; }

        /// <summary>
        /// Gets or Sets Resources
        /// </summary>
        [DataMember(Name = "Resources", EmitDefaultValue = false)]
        public List<ScimGroup> Resources { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ScimGroupListResponse {\n");
            sb.Append("  TotalResults: ").Append(TotalResults).Append("\n");
            sb.Append("  ItemsPerPage: ").Append(ItemsPerPage).Append("\n");
            sb.Append("  StartIndex: ").Append(StartIndex).Append("\n");
            sb.Append("  Resources: ").Append(Resources).Append("\n");
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
            return this.Equals(input as ScimGroupListResponse);
        }

        /// <summary>
        /// Returns true if ScimGroupListResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of ScimGroupListResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ScimGroupListResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TotalResults == input.TotalResults ||
                    this.TotalResults.Equals(input.TotalResults)
                ) && 
                (
                    this.ItemsPerPage == input.ItemsPerPage ||
                    this.ItemsPerPage.Equals(input.ItemsPerPage)
                ) && 
                (
                    this.StartIndex == input.StartIndex ||
                    this.StartIndex.Equals(input.StartIndex)
                ) && 
                (
                    this.Resources == input.Resources ||
                    this.Resources != null &&
                    input.Resources != null &&
                    this.Resources.SequenceEqual(input.Resources)
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
                hashCode = (hashCode * 59) + this.TotalResults.GetHashCode();
                hashCode = (hashCode * 59) + this.ItemsPerPage.GetHashCode();
                hashCode = (hashCode * 59) + this.StartIndex.GetHashCode();
                if (this.Resources != null)
                {
                    hashCode = (hashCode * 59) + this.Resources.GetHashCode();
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
