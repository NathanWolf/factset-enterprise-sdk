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
    /// Ratio of the price, divided by the total sales revenue per share.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_estimates_firstFiscalYear_ratios_priceSales")]
    public partial class InlineResponse2004EstimatesFirstFiscalYearRatiosPriceSales : IEquatable<InlineResponse2004EstimatesFirstFiscalYearRatiosPriceSales>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004EstimatesFirstFiscalYearRatiosPriceSales" /> class.
        /// </summary>
        /// <param name="mean">Mean value..</param>
        public InlineResponse2004EstimatesFirstFiscalYearRatiosPriceSales(decimal mean = default(decimal))
        {
            this.Mean = mean;
        }

        /// <summary>
        /// Mean value.
        /// </summary>
        /// <value>Mean value.</value>
        [DataMember(Name = "mean", EmitDefaultValue = false)]
        public decimal Mean { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004EstimatesFirstFiscalYearRatiosPriceSales {\n");
            sb.Append("  Mean: ").Append(Mean).Append("\n");
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
            return this.Equals(input as InlineResponse2004EstimatesFirstFiscalYearRatiosPriceSales);
        }

        /// <summary>
        /// Returns true if InlineResponse2004EstimatesFirstFiscalYearRatiosPriceSales instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004EstimatesFirstFiscalYearRatiosPriceSales to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004EstimatesFirstFiscalYearRatiosPriceSales input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Mean == input.Mean ||
                    this.Mean.Equals(input.Mean)
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
                hashCode = (hashCode * 59) + this.Mean.GetHashCode();
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
