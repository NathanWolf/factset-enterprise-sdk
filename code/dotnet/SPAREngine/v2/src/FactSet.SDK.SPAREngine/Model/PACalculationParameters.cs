/*
 * SPAR Engine API
 *
 * Allow clients to fetch SPAR Engine Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.SPAREngine.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SPAREngine.Model
{
    /// <summary>
    /// PACalculationParameters
    /// </summary>
    [DataContract(Name = "PACalculationParameters")]
    public partial class PACalculationParameters : IEquatable<PACalculationParameters>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PACalculationParameters" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PACalculationParameters() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PACalculationParameters" /> class.
        /// </summary>
        /// <param name="componentid">The PA Engine component identifier to analyze. (required).</param>
        /// <param name="accounts">List of accounts..</param>
        /// <param name="benchmarks">List of benchmarks..</param>
        /// <param name="dates">dates.</param>
        /// <param name="groups">List of groupings for the PA calculation. This will take precedence over the groupings saved in the PA document..</param>
        /// <param name="currencyisocode">Currency ISO code for calculation..</param>
        /// <param name="columns">List of columns for the PA calculation. This will take precedence over the columns saved in the PA document..</param>
        /// <param name="componentdetail">Component detail type for the PA component. It can be GROUPS or TOTALS..</param>
        public PACalculationParameters(string componentid = default(string), List<PAIdentifier> accounts = default(List<PAIdentifier>), List<PAIdentifier> benchmarks = default(List<PAIdentifier>), PADateParameters dates = default(PADateParameters), List<PACalculationGroup> groups = default(List<PACalculationGroup>), string currencyisocode = default(string), List<PACalculationColumn> columns = default(List<PACalculationColumn>), string componentdetail = default(string))
        {
            // to ensure "componentid" is required (not null)
            if (componentid == null) {
                throw new ArgumentNullException("componentid is a required property for PACalculationParameters and cannot be null");
            }
            this.Componentid = componentid;
            this.Accounts = accounts;
            this.Benchmarks = benchmarks;
            this.Dates = dates;
            this.Groups = groups;
            this.Currencyisocode = currencyisocode;
            this.Columns = columns;
            this.Componentdetail = componentdetail;
        }

        /// <summary>
        /// The PA Engine component identifier to analyze.
        /// </summary>
        /// <value>The PA Engine component identifier to analyze.</value>
        [DataMember(Name = "componentid", IsRequired = true, EmitDefaultValue = false)]
        public string Componentid { get; set; }

        /// <summary>
        /// List of accounts.
        /// </summary>
        /// <value>List of accounts.</value>
        [DataMember(Name = "accounts", EmitDefaultValue = false)]
        public List<PAIdentifier> Accounts { get; set; }

        /// <summary>
        /// List of benchmarks.
        /// </summary>
        /// <value>List of benchmarks.</value>
        [DataMember(Name = "benchmarks", EmitDefaultValue = false)]
        public List<PAIdentifier> Benchmarks { get; set; }

        /// <summary>
        /// Gets or Sets Dates
        /// </summary>
        [DataMember(Name = "dates", EmitDefaultValue = false)]
        public PADateParameters Dates { get; set; }

        /// <summary>
        /// List of groupings for the PA calculation. This will take precedence over the groupings saved in the PA document.
        /// </summary>
        /// <value>List of groupings for the PA calculation. This will take precedence over the groupings saved in the PA document.</value>
        [DataMember(Name = "groups", EmitDefaultValue = false)]
        public List<PACalculationGroup> Groups { get; set; }

        /// <summary>
        /// Currency ISO code for calculation.
        /// </summary>
        /// <value>Currency ISO code for calculation.</value>
        [DataMember(Name = "currencyisocode", EmitDefaultValue = false)]
        public string Currencyisocode { get; set; }

        /// <summary>
        /// List of columns for the PA calculation. This will take precedence over the columns saved in the PA document.
        /// </summary>
        /// <value>List of columns for the PA calculation. This will take precedence over the columns saved in the PA document.</value>
        [DataMember(Name = "columns", EmitDefaultValue = false)]
        public List<PACalculationColumn> Columns { get; set; }

        /// <summary>
        /// Component detail type for the PA component. It can be GROUPS or TOTALS.
        /// </summary>
        /// <value>Component detail type for the PA component. It can be GROUPS or TOTALS.</value>
        [DataMember(Name = "componentdetail", EmitDefaultValue = false)]
        public string Componentdetail { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PACalculationParameters {\n");
            sb.Append("  Componentid: ").Append(Componentid).Append("\n");
            sb.Append("  Accounts: ").Append(Accounts).Append("\n");
            sb.Append("  Benchmarks: ").Append(Benchmarks).Append("\n");
            sb.Append("  Dates: ").Append(Dates).Append("\n");
            sb.Append("  Groups: ").Append(Groups).Append("\n");
            sb.Append("  Currencyisocode: ").Append(Currencyisocode).Append("\n");
            sb.Append("  Columns: ").Append(Columns).Append("\n");
            sb.Append("  Componentdetail: ").Append(Componentdetail).Append("\n");
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
            return this.Equals(input as PACalculationParameters);
        }

        /// <summary>
        /// Returns true if PACalculationParameters instances are equal
        /// </summary>
        /// <param name="input">Instance of PACalculationParameters to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PACalculationParameters input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Componentid == input.Componentid ||
                    (this.Componentid != null &&
                    this.Componentid.Equals(input.Componentid))
                ) && 
                (
                    this.Accounts == input.Accounts ||
                    this.Accounts != null &&
                    input.Accounts != null &&
                    this.Accounts.SequenceEqual(input.Accounts)
                ) && 
                (
                    this.Benchmarks == input.Benchmarks ||
                    this.Benchmarks != null &&
                    input.Benchmarks != null &&
                    this.Benchmarks.SequenceEqual(input.Benchmarks)
                ) && 
                (
                    this.Dates == input.Dates ||
                    (this.Dates != null &&
                    this.Dates.Equals(input.Dates))
                ) && 
                (
                    this.Groups == input.Groups ||
                    this.Groups != null &&
                    input.Groups != null &&
                    this.Groups.SequenceEqual(input.Groups)
                ) && 
                (
                    this.Currencyisocode == input.Currencyisocode ||
                    (this.Currencyisocode != null &&
                    this.Currencyisocode.Equals(input.Currencyisocode))
                ) && 
                (
                    this.Columns == input.Columns ||
                    this.Columns != null &&
                    input.Columns != null &&
                    this.Columns.SequenceEqual(input.Columns)
                ) && 
                (
                    this.Componentdetail == input.Componentdetail ||
                    (this.Componentdetail != null &&
                    this.Componentdetail.Equals(input.Componentdetail))
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
                if (this.Componentid != null)
                    hashCode = hashCode * 59 + this.Componentid.GetHashCode();
                if (this.Accounts != null)
                    hashCode = hashCode * 59 + this.Accounts.GetHashCode();
                if (this.Benchmarks != null)
                    hashCode = hashCode * 59 + this.Benchmarks.GetHashCode();
                if (this.Dates != null)
                    hashCode = hashCode * 59 + this.Dates.GetHashCode();
                if (this.Groups != null)
                    hashCode = hashCode * 59 + this.Groups.GetHashCode();
                if (this.Currencyisocode != null)
                    hashCode = hashCode * 59 + this.Currencyisocode.GetHashCode();
                if (this.Columns != null)
                    hashCode = hashCode * 59 + this.Columns.GetHashCode();
                if (this.Componentdetail != null)
                    hashCode = hashCode * 59 + this.Componentdetail.GetHashCode();
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
