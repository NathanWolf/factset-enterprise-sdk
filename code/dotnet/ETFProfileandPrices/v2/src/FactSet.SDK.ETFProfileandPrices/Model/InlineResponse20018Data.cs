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
using OpenAPIDateConverter = FactSet.SDK.ETFProfileandPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ETFProfileandPrices.Model
{
    /// <summary>
    /// Strategy.
    /// </summary>
    [DataContract(Name = "inline_response_200_18_data")]
    public partial class InlineResponse20018Data : IEquatable<InlineResponse20018Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20018Data" /> class.
        /// </summary>
        /// <param name="description">Descriptive Summary of the methods used by a ETP or its index in selection and weighting of its holdings, text and standardized value available.  This data is available for the US and Canada regions..</param>
        /// <param name="group">Factset&#39;s Universal Screening tool code allows screening the greatest number of ETP&#39;s to surface based on a similar ETP strategy. This data is available for the US and Canada regions..</param>
        /// <param name="cluster">Factset&#39;s Universal Screening tool code allows us to screen a greater number of ETP&#39;s to surface; all must have similar ETP strategy characteristics. This data item is more granular and narrow than the strategy group. This data is available for the US and Canada regions..</param>
        /// <param name="selectCriteria">Description of the security selection criteria used by the ETP or its index (e.g., Market Cap, Earnings, Dividends), text and standardized value available. This data is available for all the regions..</param>
        /// <param name="weighting">Text that specifies the weighting selection criteria used by the ETP or its index (e.g., Market Cap, Equal, Momentum, Fundamental) , text and standardized value available. This data is available for all the regions..</param>
        /// <param name="segment">Determines the unique segment the ETP falls into, based on FactSet ETP Analytics rules-based classification system determined by geography, category, focus, and niche. Text and standardized value available for this data item. This data is available for the US regions. See endpoint /factset/etf/strategy/segment/list for possible values..</param>
        /// <param name="isTransparent">Description that States whether or not the methodology behind the underlying index can be clearly understood from offering documents. This data is available for the US and Canada regions..</param>
        /// <param name="fundOfFunds">Description of the ETP that holds a portfolio of other ETPs. This data is available for the Canada regions..</param>
        public InlineResponse20018Data(string description = default(string), string group = default(string), string cluster = default(string), string selectCriteria = default(string), string weighting = default(string), string segment = default(string), bool isTransparent = default(bool), string fundOfFunds = default(string))
        {
            this.Description = description;
            this.Group = group;
            this.Cluster = cluster;
            this.SelectCriteria = selectCriteria;
            this.Weighting = weighting;
            this.Segment = segment;
            this.IsTransparent = isTransparent;
            this.FundOfFunds = fundOfFunds;
        }

        /// <summary>
        /// Descriptive Summary of the methods used by a ETP or its index in selection and weighting of its holdings, text and standardized value available.  This data is available for the US and Canada regions.
        /// </summary>
        /// <value>Descriptive Summary of the methods used by a ETP or its index in selection and weighting of its holdings, text and standardized value available.  This data is available for the US and Canada regions.</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Factset&#39;s Universal Screening tool code allows screening the greatest number of ETP&#39;s to surface based on a similar ETP strategy. This data is available for the US and Canada regions.
        /// </summary>
        /// <value>Factset&#39;s Universal Screening tool code allows screening the greatest number of ETP&#39;s to surface based on a similar ETP strategy. This data is available for the US and Canada regions.</value>
        [DataMember(Name = "group", EmitDefaultValue = false)]
        public string Group { get; set; }

        /// <summary>
        /// Factset&#39;s Universal Screening tool code allows us to screen a greater number of ETP&#39;s to surface; all must have similar ETP strategy characteristics. This data item is more granular and narrow than the strategy group. This data is available for the US and Canada regions.
        /// </summary>
        /// <value>Factset&#39;s Universal Screening tool code allows us to screen a greater number of ETP&#39;s to surface; all must have similar ETP strategy characteristics. This data item is more granular and narrow than the strategy group. This data is available for the US and Canada regions.</value>
        [DataMember(Name = "cluster", EmitDefaultValue = false)]
        public string Cluster { get; set; }

        /// <summary>
        /// Description of the security selection criteria used by the ETP or its index (e.g., Market Cap, Earnings, Dividends), text and standardized value available. This data is available for all the regions.
        /// </summary>
        /// <value>Description of the security selection criteria used by the ETP or its index (e.g., Market Cap, Earnings, Dividends), text and standardized value available. This data is available for all the regions.</value>
        [DataMember(Name = "selectCriteria", EmitDefaultValue = false)]
        public string SelectCriteria { get; set; }

        /// <summary>
        /// Text that specifies the weighting selection criteria used by the ETP or its index (e.g., Market Cap, Equal, Momentum, Fundamental) , text and standardized value available. This data is available for all the regions.
        /// </summary>
        /// <value>Text that specifies the weighting selection criteria used by the ETP or its index (e.g., Market Cap, Equal, Momentum, Fundamental) , text and standardized value available. This data is available for all the regions.</value>
        [DataMember(Name = "weighting", EmitDefaultValue = false)]
        public string Weighting { get; set; }

        /// <summary>
        /// Determines the unique segment the ETP falls into, based on FactSet ETP Analytics rules-based classification system determined by geography, category, focus, and niche. Text and standardized value available for this data item. This data is available for the US regions. See endpoint /factset/etf/strategy/segment/list for possible values.
        /// </summary>
        /// <value>Determines the unique segment the ETP falls into, based on FactSet ETP Analytics rules-based classification system determined by geography, category, focus, and niche. Text and standardized value available for this data item. This data is available for the US regions. See endpoint /factset/etf/strategy/segment/list for possible values.</value>
        [DataMember(Name = "segment", EmitDefaultValue = false)]
        public string Segment { get; set; }

        /// <summary>
        /// Description that States whether or not the methodology behind the underlying index can be clearly understood from offering documents. This data is available for the US and Canada regions.
        /// </summary>
        /// <value>Description that States whether or not the methodology behind the underlying index can be clearly understood from offering documents. This data is available for the US and Canada regions.</value>
        [DataMember(Name = "isTransparent", EmitDefaultValue = true)]
        public bool IsTransparent { get; set; }

        /// <summary>
        /// Description of the ETP that holds a portfolio of other ETPs. This data is available for the Canada regions.
        /// </summary>
        /// <value>Description of the ETP that holds a portfolio of other ETPs. This data is available for the Canada regions.</value>
        [DataMember(Name = "fundOfFunds", EmitDefaultValue = false)]
        public string FundOfFunds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse20018Data {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Group: ").Append(Group).Append("\n");
            sb.Append("  Cluster: ").Append(Cluster).Append("\n");
            sb.Append("  SelectCriteria: ").Append(SelectCriteria).Append("\n");
            sb.Append("  Weighting: ").Append(Weighting).Append("\n");
            sb.Append("  Segment: ").Append(Segment).Append("\n");
            sb.Append("  IsTransparent: ").Append(IsTransparent).Append("\n");
            sb.Append("  FundOfFunds: ").Append(FundOfFunds).Append("\n");
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
            return this.Equals(input as InlineResponse20018Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20018Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20018Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20018Data input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Group == input.Group ||
                    (this.Group != null &&
                    this.Group.Equals(input.Group))
                ) && 
                (
                    this.Cluster == input.Cluster ||
                    (this.Cluster != null &&
                    this.Cluster.Equals(input.Cluster))
                ) && 
                (
                    this.SelectCriteria == input.SelectCriteria ||
                    (this.SelectCriteria != null &&
                    this.SelectCriteria.Equals(input.SelectCriteria))
                ) && 
                (
                    this.Weighting == input.Weighting ||
                    (this.Weighting != null &&
                    this.Weighting.Equals(input.Weighting))
                ) && 
                (
                    this.Segment == input.Segment ||
                    (this.Segment != null &&
                    this.Segment.Equals(input.Segment))
                ) && 
                (
                    this.IsTransparent == input.IsTransparent ||
                    this.IsTransparent.Equals(input.IsTransparent)
                ) && 
                (
                    this.FundOfFunds == input.FundOfFunds ||
                    (this.FundOfFunds != null &&
                    this.FundOfFunds.Equals(input.FundOfFunds))
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
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Group != null)
                    hashCode = hashCode * 59 + this.Group.GetHashCode();
                if (this.Cluster != null)
                    hashCode = hashCode * 59 + this.Cluster.GetHashCode();
                if (this.SelectCriteria != null)
                    hashCode = hashCode * 59 + this.SelectCriteria.GetHashCode();
                if (this.Weighting != null)
                    hashCode = hashCode * 59 + this.Weighting.GetHashCode();
                if (this.Segment != null)
                    hashCode = hashCode * 59 + this.Segment.GetHashCode();
                hashCode = hashCode * 59 + this.IsTransparent.GetHashCode();
                if (this.FundOfFunds != null)
                    hashCode = hashCode * 59 + this.FundOfFunds.GetHashCode();
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
