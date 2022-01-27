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
using OpenAPIDateConverter = FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model
{
    /// <summary>
    /// The data member contains the request&#39;s primary data.
    /// </summary>
    [DataContract(Name = "_securitizedDerivative_issuer_search_data")]
    public partial class SecuritizedDerivativeIssuerSearchData : IEquatable<SecuritizedDerivativeIssuerSearchData>, IValidatableObject
    {
        /// <summary>
        /// Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned.
        /// </summary>
        /// <value>Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RoleEnum
        {
            /// <summary>
            /// Enum IssuerGroup for value: issuerGroup
            /// </summary>
            [EnumMember(Value = "issuerGroup")]
            IssuerGroup = 1,

            /// <summary>
            /// Enum Issuer for value: issuer
            /// </summary>
            [EnumMember(Value = "issuer")]
            Issuer = 2

        }


        /// <summary>
        /// Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned.
        /// </summary>
        /// <value>Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned.</value>
        [DataMember(Name = "role", EmitDefaultValue = false)]
        public RoleEnum? Role { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeIssuerSearchData" /> class.
        /// </summary>
        /// <param name="role">Specify whether legal entities in the role of an issuer or in the role of an issuer group are returned. (default to RoleEnum.IssuerGroup).</param>
        /// <param name="name">name.</param>
        /// <param name="category">category.</param>
        /// <param name="underlying">underlying.</param>
        /// <param name="factorCertificates">factorCertificates.</param>
        /// <param name="registrationCountry">registrationCountry.</param>
        /// <param name="market">market.</param>
        public SecuritizedDerivativeIssuerSearchData(RoleEnum? role = RoleEnum.IssuerGroup, SecuritizedDerivativeIssuerSearchDataName name = default(SecuritizedDerivativeIssuerSearchDataName), SecuritizedDerivativeIssuerSearchDataCategory category = default(SecuritizedDerivativeIssuerSearchDataCategory), SecuritizedDerivativeIssuerSearchDataUnderlying underlying = default(SecuritizedDerivativeIssuerSearchDataUnderlying), SecuritizedDerivativeIssuerSearchDataFactorCertificates factorCertificates = default(SecuritizedDerivativeIssuerSearchDataFactorCertificates), SecuritizedDerivativeIssuerSearchDataRegistrationCountry registrationCountry = default(SecuritizedDerivativeIssuerSearchDataRegistrationCountry), SecuritizedDerivativeIssuerSearchDataMarket market = default(SecuritizedDerivativeIssuerSearchDataMarket))
        {
            this.Role = role;
            this.Name = name;
            this.Category = category;
            this.Underlying = underlying;
            this.FactorCertificates = factorCertificates;
            this.RegistrationCountry = registrationCountry;
            this.Market = market;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public SecuritizedDerivativeIssuerSearchDataName Name { get; set; }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [DataMember(Name = "category", EmitDefaultValue = false)]
        public SecuritizedDerivativeIssuerSearchDataCategory Category { get; set; }

        /// <summary>
        /// Gets or Sets Underlying
        /// </summary>
        [DataMember(Name = "underlying", EmitDefaultValue = false)]
        public SecuritizedDerivativeIssuerSearchDataUnderlying Underlying { get; set; }

        /// <summary>
        /// Gets or Sets FactorCertificates
        /// </summary>
        [DataMember(Name = "factorCertificates", EmitDefaultValue = false)]
        public SecuritizedDerivativeIssuerSearchDataFactorCertificates FactorCertificates { get; set; }

        /// <summary>
        /// Gets or Sets RegistrationCountry
        /// </summary>
        [DataMember(Name = "registrationCountry", EmitDefaultValue = false)]
        public SecuritizedDerivativeIssuerSearchDataRegistrationCountry RegistrationCountry { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public SecuritizedDerivativeIssuerSearchDataMarket Market { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SecuritizedDerivativeIssuerSearchData {\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  Underlying: ").Append(Underlying).Append("\n");
            sb.Append("  FactorCertificates: ").Append(FactorCertificates).Append("\n");
            sb.Append("  RegistrationCountry: ").Append(RegistrationCountry).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
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
            return this.Equals(input as SecuritizedDerivativeIssuerSearchData);
        }

        /// <summary>
        /// Returns true if SecuritizedDerivativeIssuerSearchData instances are equal
        /// </summary>
        /// <param name="input">Instance of SecuritizedDerivativeIssuerSearchData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecuritizedDerivativeIssuerSearchData input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Role == input.Role ||
                    this.Role.Equals(input.Role)
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.Underlying == input.Underlying ||
                    (this.Underlying != null &&
                    this.Underlying.Equals(input.Underlying))
                ) && 
                (
                    this.FactorCertificates == input.FactorCertificates ||
                    (this.FactorCertificates != null &&
                    this.FactorCertificates.Equals(input.FactorCertificates))
                ) && 
                (
                    this.RegistrationCountry == input.RegistrationCountry ||
                    (this.RegistrationCountry != null &&
                    this.RegistrationCountry.Equals(input.RegistrationCountry))
                ) && 
                (
                    this.Market == input.Market ||
                    (this.Market != null &&
                    this.Market.Equals(input.Market))
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
                hashCode = hashCode * 59 + this.Role.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Category != null)
                    hashCode = hashCode * 59 + this.Category.GetHashCode();
                if (this.Underlying != null)
                    hashCode = hashCode * 59 + this.Underlying.GetHashCode();
                if (this.FactorCertificates != null)
                    hashCode = hashCode * 59 + this.FactorCertificates.GetHashCode();
                if (this.RegistrationCountry != null)
                    hashCode = hashCode * 59 + this.RegistrationCountry.GetHashCode();
                if (this.Market != null)
                    hashCode = hashCode * 59 + this.Market.GetHashCode();
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
