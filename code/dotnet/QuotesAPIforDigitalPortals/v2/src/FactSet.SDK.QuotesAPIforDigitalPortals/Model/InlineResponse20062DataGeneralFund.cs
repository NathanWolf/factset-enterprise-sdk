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
    /// For an instrument that represents a share class of an investment fund, the juristic person in the role of a fund. For more information see endpoint &#x60;/legalEntity/list&#x60;.
    /// </summary>
    [DataContract(Name = "inline_response_200_62_data_general_fund")]
    public partial class InlineResponse20062DataGeneralFund : IEquatable<InlineResponse20062DataGeneralFund>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20062DataGeneralFund" /> class.
        /// </summary>
        /// <param name="id">Identifier of the juristic person in the role of a fund..</param>
        /// <param name="name">Name of the juristic person in the role of a fund..</param>
        /// <param name="domicile">domicile.</param>
        public InlineResponse20062DataGeneralFund(decimal id = default(decimal), string name = default(string), InlineResponse20062DataGeneralFundDomicile domicile = default(InlineResponse20062DataGeneralFundDomicile))
        {
            this.Id = id;
            this.Name = name;
            this.Domicile = domicile;
        }

        /// <summary>
        /// Identifier of the juristic person in the role of a fund.
        /// </summary>
        /// <value>Identifier of the juristic person in the role of a fund.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// Name of the juristic person in the role of a fund.
        /// </summary>
        /// <value>Name of the juristic person in the role of a fund.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Domicile
        /// </summary>
        [DataMember(Name = "domicile", EmitDefaultValue = false)]
        public InlineResponse20062DataGeneralFundDomicile Domicile { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20062DataGeneralFund {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Domicile: ").Append(Domicile).Append("\n");
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
            return this.Equals(input as InlineResponse20062DataGeneralFund);
        }

        /// <summary>
        /// Returns true if InlineResponse20062DataGeneralFund instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20062DataGeneralFund to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20062DataGeneralFund input)
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Domicile == input.Domicile ||
                    (this.Domicile != null &&
                    this.Domicile.Equals(input.Domicile))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Domicile != null)
                {
                    hashCode = (hashCode * 59) + this.Domicile.GetHashCode();
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
