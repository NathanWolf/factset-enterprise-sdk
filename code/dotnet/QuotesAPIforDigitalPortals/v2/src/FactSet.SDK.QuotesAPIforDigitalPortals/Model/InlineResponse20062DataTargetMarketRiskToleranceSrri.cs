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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Synthetic risk and reward indicator (SRRI).
    /// </summary>
    [DataContract(Name = "inline_response_200_62_data_targetMarket_riskTolerance_srri")]
    public partial class InlineResponse20062DataTargetMarketRiskToleranceSrri : IEquatable<InlineResponse20062DataTargetMarketRiskToleranceSrri>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20062DataTargetMarketRiskToleranceSrri" /> class.
        /// </summary>
        /// <param name="id">Identifier of rating grade..</param>
        /// <param name="rank">Rating grade..</param>
        /// <param name="description">Description of the rating grade..</param>
        public InlineResponse20062DataTargetMarketRiskToleranceSrri(decimal id = default(decimal), string rank = default(string), string description = default(string))
        {
            this.Id = id;
            this.Rank = rank;
            this.Description = description;
        }

        /// <summary>
        /// Identifier of rating grade.
        /// </summary>
        /// <value>Identifier of rating grade.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// Rating grade.
        /// </summary>
        /// <value>Rating grade.</value>
        [DataMember(Name = "rank", EmitDefaultValue = false)]
        public string Rank { get; set; }

        /// <summary>
        /// Description of the rating grade.
        /// </summary>
        /// <value>Description of the rating grade.</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20062DataTargetMarketRiskToleranceSrri {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Rank: ").Append(Rank).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
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
            return this.Equals(input as InlineResponse20062DataTargetMarketRiskToleranceSrri);
        }

        /// <summary>
        /// Returns true if InlineResponse20062DataTargetMarketRiskToleranceSrri instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20062DataTargetMarketRiskToleranceSrri to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20062DataTargetMarketRiskToleranceSrri input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    this.Id.Equals(input.Id)
                ) && 
                (
                    this.Rank == input.Rank ||
                    (this.Rank != null &&
                    this.Rank.Equals(input.Rank))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
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
                hashCode = (hashCode * 59) + this.Id.GetHashCode();
                if (this.Rank != null)
                {
                    hashCode = (hashCode * 59) + this.Rank.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
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
