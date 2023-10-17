/*
 * Portfolio Reporting Batcher
 *
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.3.0
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
using OpenAPIDateConverter = FactSet.SDK.PortfolioReportingBatcher.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PortfolioReportingBatcher.Model
{
    /// <summary>
    /// The details of the account under the task in the object key
    /// </summary>
    [DataContract(Name = "accountsForJobAddProp")]
    public partial class AccountsForJobAddProp : IEquatable<AccountsForJobAddProp>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountsForJobAddProp" /> class.
        /// </summary>
        /// <param name="includeParent">Indicates whether or not the parent portfolio is included as a separate portfolio when isSplit is true.</param>
        /// <param name="isSplit">Indicates whether the portfolio&#39;s components if any would be treated as individual portfolios when the job is run.</param>
        /// <param name="latestComponentsOnly">When selected, the ACTM/CSTM will be split and will only return components that are still held in the ACTM. I.e., when the end date is \&quot;Latest,\&quot; it will not return components where the end date occurs before Latest..</param>
        /// <param name="level">The number of levels when isSplit is true that the job will expand down to for a composite portfolio (CSTM or ACTM). \&quot;1\&quot; means only the first level will be expanded. \&quot;all\&quot; will be the value if all levels are expanded down..</param>
        /// <param name="portfolioId">The full file path including portfolio name and type.</param>
        public AccountsForJobAddProp(bool? includeParent = default(bool?), bool? isSplit = default(bool?), bool? latestComponentsOnly = default(bool?), string level = default(string), string portfolioId = default(string))
        {
            this.IncludeParent = includeParent;
            this.IsSplit = isSplit;
            this.LatestComponentsOnly = latestComponentsOnly;
            this.Level = level;
            this.PortfolioId = portfolioId;
        }

        /// <summary>
        /// Indicates whether or not the parent portfolio is included as a separate portfolio when isSplit is true
        /// </summary>
        /// <value>Indicates whether or not the parent portfolio is included as a separate portfolio when isSplit is true</value>
        [DataMember(Name = "includeParent", EmitDefaultValue = true)]
        public bool? IncludeParent { get; set; }

        /// <summary>
        /// Indicates whether the portfolio&#39;s components if any would be treated as individual portfolios when the job is run
        /// </summary>
        /// <value>Indicates whether the portfolio&#39;s components if any would be treated as individual portfolios when the job is run</value>
        [DataMember(Name = "isSplit", EmitDefaultValue = true)]
        public bool? IsSplit { get; set; }

        /// <summary>
        /// When selected, the ACTM/CSTM will be split and will only return components that are still held in the ACTM. I.e., when the end date is \&quot;Latest,\&quot; it will not return components where the end date occurs before Latest.
        /// </summary>
        /// <value>When selected, the ACTM/CSTM will be split and will only return components that are still held in the ACTM. I.e., when the end date is \&quot;Latest,\&quot; it will not return components where the end date occurs before Latest.</value>
        [DataMember(Name = "latestComponentsOnly", EmitDefaultValue = true)]
        public bool? LatestComponentsOnly { get; set; }

        /// <summary>
        /// The number of levels when isSplit is true that the job will expand down to for a composite portfolio (CSTM or ACTM). \&quot;1\&quot; means only the first level will be expanded. \&quot;all\&quot; will be the value if all levels are expanded down.
        /// </summary>
        /// <value>The number of levels when isSplit is true that the job will expand down to for a composite portfolio (CSTM or ACTM). \&quot;1\&quot; means only the first level will be expanded. \&quot;all\&quot; will be the value if all levels are expanded down.</value>
        [DataMember(Name = "level", EmitDefaultValue = true)]
        public string Level { get; set; }

        /// <summary>
        /// The full file path including portfolio name and type
        /// </summary>
        /// <value>The full file path including portfolio name and type</value>
        [DataMember(Name = "portfolioId", EmitDefaultValue = false)]
        public string PortfolioId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AccountsForJobAddProp {\n");
            sb.Append("  IncludeParent: ").Append(IncludeParent).Append("\n");
            sb.Append("  IsSplit: ").Append(IsSplit).Append("\n");
            sb.Append("  LatestComponentsOnly: ").Append(LatestComponentsOnly).Append("\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
            sb.Append("  PortfolioId: ").Append(PortfolioId).Append("\n");
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
            return this.Equals(input as AccountsForJobAddProp);
        }

        /// <summary>
        /// Returns true if AccountsForJobAddProp instances are equal
        /// </summary>
        /// <param name="input">Instance of AccountsForJobAddProp to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AccountsForJobAddProp input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IncludeParent == input.IncludeParent ||
                    (this.IncludeParent != null &&
                    this.IncludeParent.Equals(input.IncludeParent))
                ) && 
                (
                    this.IsSplit == input.IsSplit ||
                    (this.IsSplit != null &&
                    this.IsSplit.Equals(input.IsSplit))
                ) && 
                (
                    this.LatestComponentsOnly == input.LatestComponentsOnly ||
                    (this.LatestComponentsOnly != null &&
                    this.LatestComponentsOnly.Equals(input.LatestComponentsOnly))
                ) && 
                (
                    this.Level == input.Level ||
                    (this.Level != null &&
                    this.Level.Equals(input.Level))
                ) && 
                (
                    this.PortfolioId == input.PortfolioId ||
                    (this.PortfolioId != null &&
                    this.PortfolioId.Equals(input.PortfolioId))
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
                if (this.IncludeParent != null)
                {
                    hashCode = (hashCode * 59) + this.IncludeParent.GetHashCode();
                }
                if (this.IsSplit != null)
                {
                    hashCode = (hashCode * 59) + this.IsSplit.GetHashCode();
                }
                if (this.LatestComponentsOnly != null)
                {
                    hashCode = (hashCode * 59) + this.LatestComponentsOnly.GetHashCode();
                }
                if (this.Level != null)
                {
                    hashCode = (hashCode * 59) + this.Level.GetHashCode();
                }
                if (this.PortfolioId != null)
                {
                    hashCode = (hashCode * 59) + this.PortfolioId.GetHashCode();
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
