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
    /// Main currency of the coupon payments. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values. 
    /// </summary>
    [DataContract(Name = "inline_response_200_51_data_currency")]
    public partial class InlineResponse20051DataCurrency : IEquatable<InlineResponse20051DataCurrency>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20051DataCurrency" /> class.
        /// </summary>
        /// <param name="id">Identifier of the main currency..</param>
        /// <param name="code">Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code..</param>
        /// <param name="isoCode">ISO 4217 code of the value unit. Empty if the ISO 4217 standard does not define a code for the currency..</param>
        public InlineResponse20051DataCurrency(decimal id = default(decimal), string code = default(string), string isoCode = default(string))
        {
            this.Id = id;
            this.Code = code;
            this.IsoCode = isoCode;
        }

        /// <summary>
        /// Identifier of the main currency.
        /// </summary>
        /// <value>Identifier of the main currency.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code.
        /// </summary>
        /// <value>Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code.</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// ISO 4217 code of the value unit. Empty if the ISO 4217 standard does not define a code for the currency.
        /// </summary>
        /// <value>ISO 4217 code of the value unit. Empty if the ISO 4217 standard does not define a code for the currency.</value>
        [DataMember(Name = "isoCode", EmitDefaultValue = false)]
        public string IsoCode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse20051DataCurrency {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
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
            return this.Equals(input as InlineResponse20051DataCurrency);
        }

        /// <summary>
        /// Returns true if InlineResponse20051DataCurrency instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20051DataCurrency to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20051DataCurrency input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    this.Id.Equals(input.Id)
                ) && 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
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
                hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Code != null)
                    hashCode = hashCode * 59 + this.Code.GetHashCode();
                if (this.IsoCode != null)
                    hashCode = hashCode * 59 + this.IsoCode.GetHashCode();
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
