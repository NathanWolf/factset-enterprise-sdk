/*
 * FactSet People API
 *
 * The FactSet People API exposes FactSet data for individuals and their jobs. 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetPeople.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetPeople.Model
{
    /// <summary>
    /// List of executives and their compensation details for the specified company identifier.
    /// </summary>
    [DataContract(Name = "companyCompensation")]
    public partial class CompanyCompensation : IEquatable<CompanyCompensation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyCompensation" /> class.
        /// </summary>
        /// <param name="name">FactSet Name of the person.</param>
        /// <param name="personId">Factset Entity Identifier for the Person.</param>
        /// <param name="title">The requested Position Title.</param>
        /// <param name="salary">Salary of the person. Expressed in USD and raw units..</param>
        /// <param name="bonus">Bonus of the executive during the fiscal year. Expressed in USD and raw units..</param>
        /// <param name="stockAwards">Stock awards for the person. Expressed in USD and raw units..</param>
        /// <param name="optionsAwards">Option Awards for the person. Expressed in USD and raw units..</param>
        /// <param name="otherCompensation">All the other compensations which are not explicitly defined as salary, bonus, stock awards, or options awards. Expressed in USD and raw units..</param>
        /// <param name="totalCompensation">The sum of all compensation for the requested person as reported by the company. Expressed in USD and raw units..</param>
        /// <param name="nonEquityIncentivePlanComp">All the earnings pursuant to awards under non-equity incentive plans. Expressed in USD and raw units..</param>
        /// <param name="nonQualifiedCompEarnings">All the other nonqualified defined contribution which are not tax qualified and other contributions. Expressed in USD and raw units..</param>
        /// <param name="compensationYear">The most recent year of compensation is expressed as &#39;YYYY&#39; as opposed to &#39;YYYY-MM-DD&#39; format..</param>
        /// <param name="requestId">Original identifier used for the request..</param>
        public CompanyCompensation(string name = default(string), string personId = default(string), string title = default(string), decimal salary = default(decimal), decimal bonus = default(decimal), decimal stockAwards = default(decimal), decimal optionsAwards = default(decimal), decimal otherCompensation = default(decimal), decimal totalCompensation = default(decimal), decimal nonEquityIncentivePlanComp = default(decimal), decimal nonQualifiedCompEarnings = default(decimal), string compensationYear = default(string), string requestId = default(string))
        {
            this.Name = name;
            this.PersonId = personId;
            this.Title = title;
            this.Salary = salary;
            this.Bonus = bonus;
            this.StockAwards = stockAwards;
            this.OptionsAwards = optionsAwards;
            this.OtherCompensation = otherCompensation;
            this.TotalCompensation = totalCompensation;
            this.NonEquityIncentivePlanComp = nonEquityIncentivePlanComp;
            this.NonQualifiedCompEarnings = nonQualifiedCompEarnings;
            this.CompensationYear = compensationYear;
            this.RequestId = requestId;
        }

        /// <summary>
        /// FactSet Name of the person
        /// </summary>
        /// <value>FactSet Name of the person</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Factset Entity Identifier for the Person
        /// </summary>
        /// <value>Factset Entity Identifier for the Person</value>
        [DataMember(Name = "personId", EmitDefaultValue = false)]
        public string PersonId { get; set; }

        /// <summary>
        /// The requested Position Title
        /// </summary>
        /// <value>The requested Position Title</value>
        [DataMember(Name = "title", EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// Salary of the person. Expressed in USD and raw units.
        /// </summary>
        /// <value>Salary of the person. Expressed in USD and raw units.</value>
        [DataMember(Name = "salary", EmitDefaultValue = false)]
        public decimal Salary { get; set; }

        /// <summary>
        /// Bonus of the executive during the fiscal year. Expressed in USD and raw units.
        /// </summary>
        /// <value>Bonus of the executive during the fiscal year. Expressed in USD and raw units.</value>
        [DataMember(Name = "bonus", EmitDefaultValue = false)]
        public decimal Bonus { get; set; }

        /// <summary>
        /// Stock awards for the person. Expressed in USD and raw units.
        /// </summary>
        /// <value>Stock awards for the person. Expressed in USD and raw units.</value>
        [DataMember(Name = "stockAwards", EmitDefaultValue = false)]
        public decimal StockAwards { get; set; }

        /// <summary>
        /// Option Awards for the person. Expressed in USD and raw units.
        /// </summary>
        /// <value>Option Awards for the person. Expressed in USD and raw units.</value>
        [DataMember(Name = "optionsAwards", EmitDefaultValue = false)]
        public decimal OptionsAwards { get; set; }

        /// <summary>
        /// All the other compensations which are not explicitly defined as salary, bonus, stock awards, or options awards. Expressed in USD and raw units.
        /// </summary>
        /// <value>All the other compensations which are not explicitly defined as salary, bonus, stock awards, or options awards. Expressed in USD and raw units.</value>
        [DataMember(Name = "otherCompensation", EmitDefaultValue = false)]
        public decimal OtherCompensation { get; set; }

        /// <summary>
        /// The sum of all compensation for the requested person as reported by the company. Expressed in USD and raw units.
        /// </summary>
        /// <value>The sum of all compensation for the requested person as reported by the company. Expressed in USD and raw units.</value>
        [DataMember(Name = "totalCompensation", EmitDefaultValue = false)]
        public decimal TotalCompensation { get; set; }

        /// <summary>
        /// All the earnings pursuant to awards under non-equity incentive plans. Expressed in USD and raw units.
        /// </summary>
        /// <value>All the earnings pursuant to awards under non-equity incentive plans. Expressed in USD and raw units.</value>
        [DataMember(Name = "nonEquityIncentivePlanComp", EmitDefaultValue = false)]
        public decimal NonEquityIncentivePlanComp { get; set; }

        /// <summary>
        /// All the other nonqualified defined contribution which are not tax qualified and other contributions. Expressed in USD and raw units.
        /// </summary>
        /// <value>All the other nonqualified defined contribution which are not tax qualified and other contributions. Expressed in USD and raw units.</value>
        [DataMember(Name = "nonQualifiedCompEarnings", EmitDefaultValue = false)]
        public decimal NonQualifiedCompEarnings { get; set; }

        /// <summary>
        /// The most recent year of compensation is expressed as &#39;YYYY&#39; as opposed to &#39;YYYY-MM-DD&#39; format.
        /// </summary>
        /// <value>The most recent year of compensation is expressed as &#39;YYYY&#39; as opposed to &#39;YYYY-MM-DD&#39; format.</value>
        [DataMember(Name = "compensationYear", EmitDefaultValue = false)]
        public string CompensationYear { get; set; }

        /// <summary>
        /// Original identifier used for the request.
        /// </summary>
        /// <value>Original identifier used for the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CompanyCompensation {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  PersonId: ").Append(PersonId).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Salary: ").Append(Salary).Append("\n");
            sb.Append("  Bonus: ").Append(Bonus).Append("\n");
            sb.Append("  StockAwards: ").Append(StockAwards).Append("\n");
            sb.Append("  OptionsAwards: ").Append(OptionsAwards).Append("\n");
            sb.Append("  OtherCompensation: ").Append(OtherCompensation).Append("\n");
            sb.Append("  TotalCompensation: ").Append(TotalCompensation).Append("\n");
            sb.Append("  NonEquityIncentivePlanComp: ").Append(NonEquityIncentivePlanComp).Append("\n");
            sb.Append("  NonQualifiedCompEarnings: ").Append(NonQualifiedCompEarnings).Append("\n");
            sb.Append("  CompensationYear: ").Append(CompensationYear).Append("\n");
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
            return this.Equals(input as CompanyCompensation);
        }

        /// <summary>
        /// Returns true if CompanyCompensation instances are equal
        /// </summary>
        /// <param name="input">Instance of CompanyCompensation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CompanyCompensation input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.PersonId == input.PersonId ||
                    (this.PersonId != null &&
                    this.PersonId.Equals(input.PersonId))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Salary == input.Salary ||
                    this.Salary.Equals(input.Salary)
                ) && 
                (
                    this.Bonus == input.Bonus ||
                    this.Bonus.Equals(input.Bonus)
                ) && 
                (
                    this.StockAwards == input.StockAwards ||
                    this.StockAwards.Equals(input.StockAwards)
                ) && 
                (
                    this.OptionsAwards == input.OptionsAwards ||
                    this.OptionsAwards.Equals(input.OptionsAwards)
                ) && 
                (
                    this.OtherCompensation == input.OtherCompensation ||
                    this.OtherCompensation.Equals(input.OtherCompensation)
                ) && 
                (
                    this.TotalCompensation == input.TotalCompensation ||
                    this.TotalCompensation.Equals(input.TotalCompensation)
                ) && 
                (
                    this.NonEquityIncentivePlanComp == input.NonEquityIncentivePlanComp ||
                    this.NonEquityIncentivePlanComp.Equals(input.NonEquityIncentivePlanComp)
                ) && 
                (
                    this.NonQualifiedCompEarnings == input.NonQualifiedCompEarnings ||
                    this.NonQualifiedCompEarnings.Equals(input.NonQualifiedCompEarnings)
                ) && 
                (
                    this.CompensationYear == input.CompensationYear ||
                    (this.CompensationYear != null &&
                    this.CompensationYear.Equals(input.CompensationYear))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.PersonId != null)
                {
                    hashCode = (hashCode * 59) + this.PersonId.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Salary.GetHashCode();
                hashCode = (hashCode * 59) + this.Bonus.GetHashCode();
                hashCode = (hashCode * 59) + this.StockAwards.GetHashCode();
                hashCode = (hashCode * 59) + this.OptionsAwards.GetHashCode();
                hashCode = (hashCode * 59) + this.OtherCompensation.GetHashCode();
                hashCode = (hashCode * 59) + this.TotalCompensation.GetHashCode();
                hashCode = (hashCode * 59) + this.NonEquityIncentivePlanComp.GetHashCode();
                hashCode = (hashCode * 59) + this.NonQualifiedCompEarnings.GetHashCode();
                if (this.CompensationYear != null)
                {
                    hashCode = (hashCode * 59) + this.CompensationYear.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
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
