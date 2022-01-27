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
    /// The data member contains the request&#39;s primary data.
    /// </summary>
    [DataContract(Name = "_notation_crossReference_listByISIN_data")]
    public partial class NotationCrossReferenceListByISINData : IEquatable<NotationCrossReferenceListByISINData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NotationCrossReferenceListByISINData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected NotationCrossReferenceListByISINData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="NotationCrossReferenceListByISINData" /> class.
        /// </summary>
        /// <param name="isin">International Securities Identification Number. (required).</param>
        /// <param name="filter">filter.</param>
        public NotationCrossReferenceListByISINData(string isin = default(string), NotationCrossReferenceListByInstrumentDataFilter filter = default(NotationCrossReferenceListByInstrumentDataFilter))
        {
            // to ensure "isin" is required (not null)
            if (isin == null) {
                throw new ArgumentNullException("isin is a required property for NotationCrossReferenceListByISINData and cannot be null");
            }
            this.Isin = isin;
            this.Filter = filter;
        }

        /// <summary>
        /// International Securities Identification Number.
        /// </summary>
        /// <value>International Securities Identification Number.</value>
        [DataMember(Name = "isin", IsRequired = true, EmitDefaultValue = false)]
        public string Isin { get; set; }

        /// <summary>
        /// Gets or Sets Filter
        /// </summary>
        [DataMember(Name = "filter", EmitDefaultValue = false)]
        public NotationCrossReferenceListByInstrumentDataFilter Filter { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NotationCrossReferenceListByISINData {\n");
            sb.Append("  Isin: ").Append(Isin).Append("\n");
            sb.Append("  Filter: ").Append(Filter).Append("\n");
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
            return this.Equals(input as NotationCrossReferenceListByISINData);
        }

        /// <summary>
        /// Returns true if NotationCrossReferenceListByISINData instances are equal
        /// </summary>
        /// <param name="input">Instance of NotationCrossReferenceListByISINData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NotationCrossReferenceListByISINData input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Isin == input.Isin ||
                    (this.Isin != null &&
                    this.Isin.Equals(input.Isin))
                ) && 
                (
                    this.Filter == input.Filter ||
                    (this.Filter != null &&
                    this.Filter.Equals(input.Filter))
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
                if (this.Isin != null)
                    hashCode = hashCode * 59 + this.Isin.GetHashCode();
                if (this.Filter != null)
                    hashCode = hashCode * 59 + this.Filter.GetHashCode();
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
