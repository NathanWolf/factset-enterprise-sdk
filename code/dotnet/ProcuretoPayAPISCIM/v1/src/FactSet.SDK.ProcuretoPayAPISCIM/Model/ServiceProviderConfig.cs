/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.ProcuretoPayAPISCIM.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ProcuretoPayAPISCIM.Model
{
    /// <summary>
    /// ServiceProviderConfig
    /// </summary>
    [DataContract(Name = "ServiceProviderConfig")]
    public partial class ServiceProviderConfig : IEquatable<ServiceProviderConfig>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ServiceProviderConfig" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ServiceProviderConfig() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ServiceProviderConfig" /> class.
        /// </summary>
        /// <param name="schemas">schemas.</param>
        /// <param name="patch">patch (required).</param>
        /// <param name="bulk">bulk (required).</param>
        /// <param name="filter">filter (required).</param>
        /// <param name="changePassword">changePassword (required).</param>
        /// <param name="sort">sort (required).</param>
        /// <param name="etag">etag (required).</param>
        /// <param name="authenticationSchemes">authenticationSchemes (required).</param>
        public ServiceProviderConfig(List<string> schemas = default(List<string>), ServiceProviderConfigPatch patch = default(ServiceProviderConfigPatch), ServiceProviderConfigBulk bulk = default(ServiceProviderConfigBulk), ServiceProviderConfigFilter filter = default(ServiceProviderConfigFilter), ServiceProviderConfigChangePassword changePassword = default(ServiceProviderConfigChangePassword), ServiceProviderConfigSort sort = default(ServiceProviderConfigSort), ServiceProviderConfigEtag etag = default(ServiceProviderConfigEtag), ServiceProviderConfigAuthenticationSchemes authenticationSchemes = default(ServiceProviderConfigAuthenticationSchemes))
        {
            // to ensure "patch" is required (not null)
            if (patch == null) {
                throw new ArgumentNullException("patch is a required property for ServiceProviderConfig and cannot be null");
            }
            this.Patch = patch;
            // to ensure "bulk" is required (not null)
            if (bulk == null) {
                throw new ArgumentNullException("bulk is a required property for ServiceProviderConfig and cannot be null");
            }
            this.Bulk = bulk;
            // to ensure "filter" is required (not null)
            if (filter == null) {
                throw new ArgumentNullException("filter is a required property for ServiceProviderConfig and cannot be null");
            }
            this.Filter = filter;
            // to ensure "changePassword" is required (not null)
            if (changePassword == null) {
                throw new ArgumentNullException("changePassword is a required property for ServiceProviderConfig and cannot be null");
            }
            this.ChangePassword = changePassword;
            // to ensure "sort" is required (not null)
            if (sort == null) {
                throw new ArgumentNullException("sort is a required property for ServiceProviderConfig and cannot be null");
            }
            this.Sort = sort;
            // to ensure "etag" is required (not null)
            if (etag == null) {
                throw new ArgumentNullException("etag is a required property for ServiceProviderConfig and cannot be null");
            }
            this.Etag = etag;
            // to ensure "authenticationSchemes" is required (not null)
            if (authenticationSchemes == null) {
                throw new ArgumentNullException("authenticationSchemes is a required property for ServiceProviderConfig and cannot be null");
            }
            this.AuthenticationSchemes = authenticationSchemes;
            this.Schemas = schemas;
        }

        /// <summary>
        /// Gets or Sets Schemas
        /// </summary>
        [DataMember(Name = "schemas", EmitDefaultValue = false)]
        public List<string> Schemas { get; set; }

        /// <summary>
        /// An HTTP-addressable URL pointing to the service provider&#39;s human-consumable help documentation.
        /// </summary>
        /// <value>An HTTP-addressable URL pointing to the service provider&#39;s human-consumable help documentation.</value>
        [DataMember(Name = "documentationUri", EmitDefaultValue = false)]
        public string DocumentationUri { get; private set; }

        /// <summary>
        /// Returns false as DocumentationUri should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeDocumentationUri()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets Patch
        /// </summary>
        [DataMember(Name = "patch", IsRequired = true, EmitDefaultValue = false)]
        public ServiceProviderConfigPatch Patch { get; set; }

        /// <summary>
        /// Gets or Sets Bulk
        /// </summary>
        [DataMember(Name = "bulk", IsRequired = true, EmitDefaultValue = false)]
        public ServiceProviderConfigBulk Bulk { get; set; }

        /// <summary>
        /// Gets or Sets Filter
        /// </summary>
        [DataMember(Name = "filter", IsRequired = true, EmitDefaultValue = false)]
        public ServiceProviderConfigFilter Filter { get; set; }

        /// <summary>
        /// Gets or Sets ChangePassword
        /// </summary>
        [DataMember(Name = "changePassword", IsRequired = true, EmitDefaultValue = false)]
        public ServiceProviderConfigChangePassword ChangePassword { get; set; }

        /// <summary>
        /// Gets or Sets Sort
        /// </summary>
        [DataMember(Name = "sort", IsRequired = true, EmitDefaultValue = false)]
        public ServiceProviderConfigSort Sort { get; set; }

        /// <summary>
        /// Gets or Sets Etag
        /// </summary>
        [DataMember(Name = "etag", IsRequired = true, EmitDefaultValue = false)]
        public ServiceProviderConfigEtag Etag { get; set; }

        /// <summary>
        /// Gets or Sets AuthenticationSchemes
        /// </summary>
        [DataMember(Name = "authenticationSchemes", IsRequired = true, EmitDefaultValue = false)]
        public ServiceProviderConfigAuthenticationSchemes AuthenticationSchemes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ServiceProviderConfig {\n");
            sb.Append("  Schemas: ").Append(Schemas).Append("\n");
            sb.Append("  DocumentationUri: ").Append(DocumentationUri).Append("\n");
            sb.Append("  Patch: ").Append(Patch).Append("\n");
            sb.Append("  Bulk: ").Append(Bulk).Append("\n");
            sb.Append("  Filter: ").Append(Filter).Append("\n");
            sb.Append("  ChangePassword: ").Append(ChangePassword).Append("\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
            sb.Append("  Etag: ").Append(Etag).Append("\n");
            sb.Append("  AuthenticationSchemes: ").Append(AuthenticationSchemes).Append("\n");
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
            return this.Equals(input as ServiceProviderConfig);
        }

        /// <summary>
        /// Returns true if ServiceProviderConfig instances are equal
        /// </summary>
        /// <param name="input">Instance of ServiceProviderConfig to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ServiceProviderConfig input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Schemas == input.Schemas ||
                    this.Schemas != null &&
                    input.Schemas != null &&
                    this.Schemas.SequenceEqual(input.Schemas)
                ) && 
                (
                    this.DocumentationUri == input.DocumentationUri ||
                    (this.DocumentationUri != null &&
                    this.DocumentationUri.Equals(input.DocumentationUri))
                ) && 
                (
                    this.Patch == input.Patch ||
                    (this.Patch != null &&
                    this.Patch.Equals(input.Patch))
                ) && 
                (
                    this.Bulk == input.Bulk ||
                    (this.Bulk != null &&
                    this.Bulk.Equals(input.Bulk))
                ) && 
                (
                    this.Filter == input.Filter ||
                    (this.Filter != null &&
                    this.Filter.Equals(input.Filter))
                ) && 
                (
                    this.ChangePassword == input.ChangePassword ||
                    (this.ChangePassword != null &&
                    this.ChangePassword.Equals(input.ChangePassword))
                ) && 
                (
                    this.Sort == input.Sort ||
                    (this.Sort != null &&
                    this.Sort.Equals(input.Sort))
                ) && 
                (
                    this.Etag == input.Etag ||
                    (this.Etag != null &&
                    this.Etag.Equals(input.Etag))
                ) && 
                (
                    this.AuthenticationSchemes == input.AuthenticationSchemes ||
                    (this.AuthenticationSchemes != null &&
                    this.AuthenticationSchemes.Equals(input.AuthenticationSchemes))
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
                if (this.Schemas != null)
                {
                    hashCode = (hashCode * 59) + this.Schemas.GetHashCode();
                }
                if (this.DocumentationUri != null)
                {
                    hashCode = (hashCode * 59) + this.DocumentationUri.GetHashCode();
                }
                if (this.Patch != null)
                {
                    hashCode = (hashCode * 59) + this.Patch.GetHashCode();
                }
                if (this.Bulk != null)
                {
                    hashCode = (hashCode * 59) + this.Bulk.GetHashCode();
                }
                if (this.Filter != null)
                {
                    hashCode = (hashCode * 59) + this.Filter.GetHashCode();
                }
                if (this.ChangePassword != null)
                {
                    hashCode = (hashCode * 59) + this.ChangePassword.GetHashCode();
                }
                if (this.Sort != null)
                {
                    hashCode = (hashCode * 59) + this.Sort.GetHashCode();
                }
                if (this.Etag != null)
                {
                    hashCode = (hashCode * 59) + this.Etag.GetHashCode();
                }
                if (this.AuthenticationSchemes != null)
                {
                    hashCode = (hashCode * 59) + this.AuthenticationSchemes.GetHashCode();
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
