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
    /// Price.
    /// </summary>
    [DataContract(Name = "inline_response_200_16_data")]
    public partial class InlineResponse20016Data : IEquatable<InlineResponse20016Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20016Data" /> class.
        /// </summary>
        /// <param name="nav">nav.</param>
        /// <param name="sharesOutstanding">sharesOutstanding.</param>
        public InlineResponse20016Data(InlineResponse20016DataNav nav = default(InlineResponse20016DataNav), InlineResponse20016DataSharesOutstanding sharesOutstanding = default(InlineResponse20016DataSharesOutstanding))
        {
            this.Nav = nav;
            this.SharesOutstanding = sharesOutstanding;
        }

        /// <summary>
        /// Gets or Sets Nav
        /// </summary>
        [DataMember(Name = "nav", EmitDefaultValue = false)]
        public InlineResponse20016DataNav Nav { get; set; }

        /// <summary>
        /// Gets or Sets SharesOutstanding
        /// </summary>
        [DataMember(Name = "sharesOutstanding", EmitDefaultValue = false)]
        public InlineResponse20016DataSharesOutstanding SharesOutstanding { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse20016Data {\n");
            sb.Append("  Nav: ").Append(Nav).Append("\n");
            sb.Append("  SharesOutstanding: ").Append(SharesOutstanding).Append("\n");
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
            return this.Equals(input as InlineResponse20016Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20016Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20016Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20016Data input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Nav == input.Nav ||
                    (this.Nav != null &&
                    this.Nav.Equals(input.Nav))
                ) && 
                (
                    this.SharesOutstanding == input.SharesOutstanding ||
                    (this.SharesOutstanding != null &&
                    this.SharesOutstanding.Equals(input.SharesOutstanding))
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
                if (this.Nav != null)
                    hashCode = hashCode * 59 + this.Nav.GetHashCode();
                if (this.SharesOutstanding != null)
                    hashCode = hashCode * 59 + this.SharesOutstanding.GetHashCode();
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
