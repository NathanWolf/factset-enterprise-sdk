/*
 * FactSet Estimates
 *
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.3.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetEstimates.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetEstimates.Model
{
    /// <summary>
    /// ConsensusRatings
    /// </summary>
    [DataContract(Name = "consensusRatings")]
    public partial class ConsensusRatings : IEquatable<ConsensusRatings>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConsensusRatings" /> class.
        /// </summary>
        /// <param name="fsymId">fsymId.</param>
        /// <param name="estimateDate">Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598).</param>
        /// <param name="buyCount">The number of Buy ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus..</param>
        /// <param name="overweightCount">The number of Overweight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus..</param>
        /// <param name="holdCount">The number of Hold ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus..</param>
        /// <param name="underweightCount">The number of Underweight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus..</param>
        /// <param name="sellCount">The number of Sell ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus..</param>
        /// <param name="ratingsNestTotal">The total number of ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus..</param>
        /// <param name="ratingsNote">The mean average of ratings for the fiscal dates indicated, where each underlying rating is given a numerical score and then aggregated to a mean consensus - __*Individual Ratings Scores*__ |Value|Rating Description| |- --|- --| |1|Buy| |1.5|Overweight| |2|Hold| |2.5|Underweight| |3|Sell| .</param>
        /// <param name="ratingsNoteText">The mean textual rating for the fiscal dates indicated. The text rating is assigned by falling within the below defined ranges -  __*Textual Ranges for Average*__ |Value|Rating Description| |- --|- --| |&lt; 1.25|Buy| |&lt; 1.75|Overweight| |&lt; 2.25|Hold| |&lt; 2.75|Underweight| |&lt;&#x3D; 3|Sell| .</param>
        /// <param name="requestId">Identifier that was used for the request..</param>
        public ConsensusRatings(string fsymId = default(string), DateTime estimateDate = default(DateTime), int buyCount = default(int), int overweightCount = default(int), int holdCount = default(int), int underweightCount = default(int), int sellCount = default(int), int ratingsNestTotal = default(int), double ratingsNote = default(double), string ratingsNoteText = default(string), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.EstimateDate = estimateDate;
            this.BuyCount = buyCount;
            this.OverweightCount = overweightCount;
            this.HoldCount = holdCount;
            this.UnderweightCount = underweightCount;
            this.SellCount = sellCount;
            this.RatingsNestTotal = ratingsNestTotal;
            this.RatingsNote = ratingsNote;
            this.RatingsNoteText = ratingsNoteText;
            this.RequestId = requestId;
        }

        /// <summary>
        /// Gets or Sets FsymId
        /// </summary>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
        /// </summary>
        /// <value>Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)</value>
        [DataMember(Name = "estimateDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime EstimateDate { get; set; }

        /// <summary>
        /// The number of Buy ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.
        /// </summary>
        /// <value>The number of Buy ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.</value>
        [DataMember(Name = "buyCount", EmitDefaultValue = false)]
        public int BuyCount { get; set; }

        /// <summary>
        /// The number of Overweight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.
        /// </summary>
        /// <value>The number of Overweight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.</value>
        [DataMember(Name = "overweightCount", EmitDefaultValue = false)]
        public int OverweightCount { get; set; }

        /// <summary>
        /// The number of Hold ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.
        /// </summary>
        /// <value>The number of Hold ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.</value>
        [DataMember(Name = "holdCount", EmitDefaultValue = false)]
        public int HoldCount { get; set; }

        /// <summary>
        /// The number of Underweight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.
        /// </summary>
        /// <value>The number of Underweight ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.</value>
        [DataMember(Name = "underweightCount", EmitDefaultValue = false)]
        public int UnderweightCount { get; set; }

        /// <summary>
        /// The number of Sell ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.
        /// </summary>
        /// <value>The number of Sell ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.</value>
        [DataMember(Name = "sellCount", EmitDefaultValue = false)]
        public int SellCount { get; set; }

        /// <summary>
        /// The total number of ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.
        /// </summary>
        /// <value>The total number of ratings taken into account in the calculation of a consensus. This information is shown only for a 100-day consensus.</value>
        [DataMember(Name = "ratingsNestTotal", EmitDefaultValue = false)]
        public int RatingsNestTotal { get; set; }

        /// <summary>
        /// The mean average of ratings for the fiscal dates indicated, where each underlying rating is given a numerical score and then aggregated to a mean consensus - __*Individual Ratings Scores*__ |Value|Rating Description| |- --|- --| |1|Buy| |1.5|Overweight| |2|Hold| |2.5|Underweight| |3|Sell| 
        /// </summary>
        /// <value>The mean average of ratings for the fiscal dates indicated, where each underlying rating is given a numerical score and then aggregated to a mean consensus - __*Individual Ratings Scores*__ |Value|Rating Description| |- --|- --| |1|Buy| |1.5|Overweight| |2|Hold| |2.5|Underweight| |3|Sell| </value>
        [DataMember(Name = "ratingsNote", EmitDefaultValue = false)]
        public double RatingsNote { get; set; }

        /// <summary>
        /// The mean textual rating for the fiscal dates indicated. The text rating is assigned by falling within the below defined ranges -  __*Textual Ranges for Average*__ |Value|Rating Description| |- --|- --| |&lt; 1.25|Buy| |&lt; 1.75|Overweight| |&lt; 2.25|Hold| |&lt; 2.75|Underweight| |&lt;&#x3D; 3|Sell| 
        /// </summary>
        /// <value>The mean textual rating for the fiscal dates indicated. The text rating is assigned by falling within the below defined ranges -  __*Textual Ranges for Average*__ |Value|Rating Description| |- --|- --| |&lt; 1.25|Buy| |&lt; 1.75|Overweight| |&lt; 2.25|Hold| |&lt; 2.75|Underweight| |&lt;&#x3D; 3|Sell| </value>
        [DataMember(Name = "ratingsNoteText", EmitDefaultValue = false)]
        public string RatingsNoteText { get; set; }

        /// <summary>
        /// Identifier that was used for the request.
        /// </summary>
        /// <value>Identifier that was used for the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConsensusRatings {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  EstimateDate: ").Append(EstimateDate).Append("\n");
            sb.Append("  BuyCount: ").Append(BuyCount).Append("\n");
            sb.Append("  OverweightCount: ").Append(OverweightCount).Append("\n");
            sb.Append("  HoldCount: ").Append(HoldCount).Append("\n");
            sb.Append("  UnderweightCount: ").Append(UnderweightCount).Append("\n");
            sb.Append("  SellCount: ").Append(SellCount).Append("\n");
            sb.Append("  RatingsNestTotal: ").Append(RatingsNestTotal).Append("\n");
            sb.Append("  RatingsNote: ").Append(RatingsNote).Append("\n");
            sb.Append("  RatingsNoteText: ").Append(RatingsNoteText).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
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
            return this.Equals(input as ConsensusRatings);
        }

        /// <summary>
        /// Returns true if ConsensusRatings instances are equal
        /// </summary>
        /// <param name="input">Instance of ConsensusRatings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConsensusRatings input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.EstimateDate == input.EstimateDate ||
                    (this.EstimateDate != null &&
                    this.EstimateDate.Equals(input.EstimateDate))
                ) && 
                (
                    this.BuyCount == input.BuyCount ||
                    this.BuyCount.Equals(input.BuyCount)
                ) && 
                (
                    this.OverweightCount == input.OverweightCount ||
                    this.OverweightCount.Equals(input.OverweightCount)
                ) && 
                (
                    this.HoldCount == input.HoldCount ||
                    this.HoldCount.Equals(input.HoldCount)
                ) && 
                (
                    this.UnderweightCount == input.UnderweightCount ||
                    this.UnderweightCount.Equals(input.UnderweightCount)
                ) && 
                (
                    this.SellCount == input.SellCount ||
                    this.SellCount.Equals(input.SellCount)
                ) && 
                (
                    this.RatingsNestTotal == input.RatingsNestTotal ||
                    this.RatingsNestTotal.Equals(input.RatingsNestTotal)
                ) && 
                (
                    this.RatingsNote == input.RatingsNote ||
                    this.RatingsNote.Equals(input.RatingsNote)
                ) && 
                (
                    this.RatingsNoteText == input.RatingsNoteText ||
                    (this.RatingsNoteText != null &&
                    this.RatingsNoteText.Equals(input.RatingsNoteText))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
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
                if (this.FsymId != null)
                    hashCode = hashCode * 59 + this.FsymId.GetHashCode();
                if (this.EstimateDate != null)
                    hashCode = hashCode * 59 + this.EstimateDate.GetHashCode();
                hashCode = hashCode * 59 + this.BuyCount.GetHashCode();
                hashCode = hashCode * 59 + this.OverweightCount.GetHashCode();
                hashCode = hashCode * 59 + this.HoldCount.GetHashCode();
                hashCode = hashCode * 59 + this.UnderweightCount.GetHashCode();
                hashCode = hashCode * 59 + this.SellCount.GetHashCode();
                hashCode = hashCode * 59 + this.RatingsNestTotal.GetHashCode();
                hashCode = hashCode * 59 + this.RatingsNote.GetHashCode();
                if (this.RatingsNoteText != null)
                    hashCode = hashCode * 59 + this.RatingsNoteText.GetHashCode();
                if (this.RequestId != null)
                    hashCode = hashCode * 59 + this.RequestId.GetHashCode();
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
