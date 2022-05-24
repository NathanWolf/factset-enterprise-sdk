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
using OpenAPIDateConverter = FactSet.SDK.StocksAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StocksAPIforDigitalPortals.Model
{
    /// <summary>
    /// Currency of the attributes representing a monetary value. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_reportedKeyFigures_firstFiscalYear_currencyDependentKeyFigures_currency")]
    public partial class InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency : IEquatable<InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency" /> class.
        /// </summary>
        /// <param name="id">Identifier of the currency..</param>
        /// <param name="isoCode">ISO 4217 code of the currency..</param>
        public InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency(decimal id = default(decimal), string isoCode = default(string))
        {
            this.Id = id;
            this.IsoCode = isoCode;
        }

        /// <summary>
        /// Identifier of the currency.
        /// </summary>
        /// <value>Identifier of the currency.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// ISO 4217 code of the currency.
        /// </summary>
        /// <value>ISO 4217 code of the currency.</value>
        [DataMember(Name = "isoCode", EmitDefaultValue = false)]
        public string IsoCode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsoCode: ").Append(IsoCode).Append("\n");
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
            return this.Equals(input as InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency);
        }

        /// <summary>
        /// Returns true if InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency input)
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
                    this.IsoCode == input.IsoCode ||
                    (this.IsoCode != null &&
                    this.IsoCode.Equals(input.IsoCode))
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
                if (this.IsoCode != null)
                {
                    hashCode = (hashCode * 59) + this.IsoCode.GetHashCode();
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
