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
    /// NSIN data of the instrument.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_instrument_nsin")]
    public partial class InlineResponse2004InstrumentNsin : IEquatable<InlineResponse2004InstrumentNsin>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004InstrumentNsin" /> class.
        /// </summary>
        /// <param name="wkn">The WKN (Wertpapierkennnummer, German for Securities Identification Number) of the instrument. The WKN is a 6-character code of digits and upper-case letters that uniquely identifies an instrument..</param>
        /// <param name="valor">The Valor number (German: Valorennummer) of the instrument. The Valor number is an integer number that uniquely identifies an instrument..</param>
        /// <param name="cusip">The CUSIP (Committee on Uniform Security Identification Procedures) or CINS (CUSIP International Numbering System) identifier of the instrument. These numbers are 9-character codes of digits and upper-case letters that uniquely identify an instrument..</param>
        public InlineResponse2004InstrumentNsin(string wkn = default(string), string valor = default(string), string cusip = default(string))
        {
            this.Wkn = wkn;
            this.Valor = valor;
            this.Cusip = cusip;
        }

        /// <summary>
        /// The WKN (Wertpapierkennnummer, German for Securities Identification Number) of the instrument. The WKN is a 6-character code of digits and upper-case letters that uniquely identifies an instrument.
        /// </summary>
        /// <value>The WKN (Wertpapierkennnummer, German for Securities Identification Number) of the instrument. The WKN is a 6-character code of digits and upper-case letters that uniquely identifies an instrument.</value>
        [DataMember(Name = "wkn", EmitDefaultValue = false)]
        public string Wkn { get; set; }

        /// <summary>
        /// The Valor number (German: Valorennummer) of the instrument. The Valor number is an integer number that uniquely identifies an instrument.
        /// </summary>
        /// <value>The Valor number (German: Valorennummer) of the instrument. The Valor number is an integer number that uniquely identifies an instrument.</value>
        [DataMember(Name = "valor", EmitDefaultValue = false)]
        public string Valor { get; set; }

        /// <summary>
        /// The CUSIP (Committee on Uniform Security Identification Procedures) or CINS (CUSIP International Numbering System) identifier of the instrument. These numbers are 9-character codes of digits and upper-case letters that uniquely identify an instrument.
        /// </summary>
        /// <value>The CUSIP (Committee on Uniform Security Identification Procedures) or CINS (CUSIP International Numbering System) identifier of the instrument. These numbers are 9-character codes of digits and upper-case letters that uniquely identify an instrument.</value>
        [DataMember(Name = "cusip", EmitDefaultValue = false)]
        public string Cusip { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004InstrumentNsin {\n");
            sb.Append("  Wkn: ").Append(Wkn).Append("\n");
            sb.Append("  Valor: ").Append(Valor).Append("\n");
            sb.Append("  Cusip: ").Append(Cusip).Append("\n");
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
            return this.Equals(input as InlineResponse2004InstrumentNsin);
        }

        /// <summary>
        /// Returns true if InlineResponse2004InstrumentNsin instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004InstrumentNsin to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004InstrumentNsin input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Wkn == input.Wkn ||
                    (this.Wkn != null &&
                    this.Wkn.Equals(input.Wkn))
                ) && 
                (
                    this.Valor == input.Valor ||
                    (this.Valor != null &&
                    this.Valor.Equals(input.Valor))
                ) && 
                (
                    this.Cusip == input.Cusip ||
                    (this.Cusip != null &&
                    this.Cusip.Equals(input.Cusip))
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
                if (this.Wkn != null)
                {
                    hashCode = (hashCode * 59) + this.Wkn.GetHashCode();
                }
                if (this.Valor != null)
                {
                    hashCode = (hashCode * 59) + this.Valor.GetHashCode();
                }
                if (this.Cusip != null)
                {
                    hashCode = (hashCode * 59) + this.Cusip.GetHashCode();
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
