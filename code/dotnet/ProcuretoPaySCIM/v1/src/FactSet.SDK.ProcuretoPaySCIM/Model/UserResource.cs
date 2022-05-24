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
using OpenAPIDateConverter = FactSet.SDK.ProcuretoPaySCIM.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ProcuretoPaySCIM.Model
{
    /// <summary>
    /// UserResource
    /// </summary>
    [DataContract(Name = "UserResource")]
    public partial class UserResource : IEquatable<UserResource>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserResource" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected UserResource() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="UserResource" /> class.
        /// </summary>
        /// <param name="schemas">schemas.</param>
        /// <param name="externalId">externalId.</param>
        /// <param name="name">name (required).</param>
        /// <param name="email">Email addresses for the user.  The value SHOULD be canonicalized by the service provider, e.g., &#39;bjensen@example.com&#39; instead of &#39;bjensen@EXAMPLE.COM&#39;. (required).</param>
        /// <param name="urnscimschemasextensionCoreFactset10">urnscimschemasextensionCoreFactset10.</param>
        /// <param name="meta">meta.</param>
        public UserResource(List<string> schemas = default(List<string>), string externalId = default(string), UserResourceName name = default(UserResourceName), string email = default(string), UserResourceUrnScimSchemasExtensionCoreFactset10 urnscimschemasextensionCoreFactset10 = default(UserResourceUrnScimSchemasExtensionCoreFactset10), UserResourceMeta meta = default(UserResourceMeta))
        {
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for UserResource and cannot be null");
            }
            this.Name = name;
            // to ensure "email" is required (not null)
            if (email == null) {
                throw new ArgumentNullException("email is a required property for UserResource and cannot be null");
            }
            this.Email = email;
            this.Schemas = schemas;
            this.ExternalId = externalId;
            this.UrnscimschemasextensionCoreFactset10 = urnscimschemasextensionCoreFactset10;
            this.Meta = meta;
        }

        /// <summary>
        /// Gets or Sets Schemas
        /// </summary>
        [DataMember(Name = "schemas", EmitDefaultValue = false)]
        public List<string> Schemas { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; private set; }

        /// <summary>
        /// Returns false as Id should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeId()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets ExternalId
        /// </summary>
        [DataMember(Name = "externalId", EmitDefaultValue = false)]
        public string ExternalId { get; set; }

        /// <summary>
        /// Unique identifier for the User, typically used by the user to directly authenticate to the service provider. Each User MUST include a non-empty userName value.  This identifier MUST be unique across the service provider&#39;s entire set of Users.
        /// </summary>
        /// <value>Unique identifier for the User, typically used by the user to directly authenticate to the service provider. Each User MUST include a non-empty userName value.  This identifier MUST be unique across the service provider&#39;s entire set of Users.</value>
        [DataMember(Name = "userName", IsRequired = true, EmitDefaultValue = false)]
        public string UserName { get; private set; }

        /// <summary>
        /// Returns false as UserName should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeUserName()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public UserResourceName Name { get; set; }

        /// <summary>
        /// Email addresses for the user.  The value SHOULD be canonicalized by the service provider, e.g., &#39;bjensen@example.com&#39; instead of &#39;bjensen@EXAMPLE.COM&#39;.
        /// </summary>
        /// <value>Email addresses for the user.  The value SHOULD be canonicalized by the service provider, e.g., &#39;bjensen@example.com&#39; instead of &#39;bjensen@EXAMPLE.COM&#39;.</value>
        [DataMember(Name = "email", IsRequired = true, EmitDefaultValue = false)]
        public string Email { get; set; }

        /// <summary>
        /// Phone numbers for the User.  The value SHOULD be canonicalized by the service provider according to the format specified in RFC 3966, e.g., &#39;tel:+1-201-555-0123&#39;. Canonical type values of &#39;main&#39;, &#39;work&#39;, &#39;mobile&#39;, and &#39;home&#39;.
        /// </summary>
        /// <value>Phone numbers for the User.  The value SHOULD be canonicalized by the service provider according to the format specified in RFC 3966, e.g., &#39;tel:+1-201-555-0123&#39;. Canonical type values of &#39;main&#39;, &#39;work&#39;, &#39;mobile&#39;, and &#39;home&#39;.</value>
        [DataMember(Name = "phoneNumbers", EmitDefaultValue = false)]
        public List<UserResourcePhoneNumbers> PhoneNumbers { get; private set; }

        /// <summary>
        /// Returns false as PhoneNumbers should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializePhoneNumbers()
        {
            return false;
        }
        /// <summary>
        /// A list of groups to which the user belongs, either through direct membership, through nested groups, or dynamically calculated.
        /// </summary>
        /// <value>A list of groups to which the user belongs, either through direct membership, through nested groups, or dynamically calculated.</value>
        [DataMember(Name = "groups", EmitDefaultValue = false)]
        public List<UserResourceGroups> Groups { get; private set; }

        /// <summary>
        /// Returns false as Groups should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeGroups()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets UrnscimschemasextensionCoreFactset10
        /// </summary>
        [DataMember(Name = "urn:scim:schemas:extension:CoreFactset:1.0", EmitDefaultValue = false)]
        public UserResourceUrnScimSchemasExtensionCoreFactset10 UrnscimschemasextensionCoreFactset10 { get; set; }

        /// <summary>
        /// Gets or Sets Meta
        /// </summary>
        [DataMember(Name = "meta", EmitDefaultValue = false)]
        public UserResourceMeta Meta { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UserResource {\n");
            sb.Append("  Schemas: ").Append(Schemas).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ExternalId: ").Append(ExternalId).Append("\n");
            sb.Append("  UserName: ").Append(UserName).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  PhoneNumbers: ").Append(PhoneNumbers).Append("\n");
            sb.Append("  Groups: ").Append(Groups).Append("\n");
            sb.Append("  UrnscimschemasextensionCoreFactset10: ").Append(UrnscimschemasextensionCoreFactset10).Append("\n");
            sb.Append("  Meta: ").Append(Meta).Append("\n");
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
            return this.Equals(input as UserResource);
        }

        /// <summary>
        /// Returns true if UserResource instances are equal
        /// </summary>
        /// <param name="input">Instance of UserResource to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserResource input)
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
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ExternalId == input.ExternalId ||
                    (this.ExternalId != null &&
                    this.ExternalId.Equals(input.ExternalId))
                ) && 
                (
                    this.UserName == input.UserName ||
                    (this.UserName != null &&
                    this.UserName.Equals(input.UserName))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.PhoneNumbers == input.PhoneNumbers ||
                    this.PhoneNumbers != null &&
                    input.PhoneNumbers != null &&
                    this.PhoneNumbers.SequenceEqual(input.PhoneNumbers)
                ) && 
                (
                    this.Groups == input.Groups ||
                    this.Groups != null &&
                    input.Groups != null &&
                    this.Groups.SequenceEqual(input.Groups)
                ) && 
                (
                    this.UrnscimschemasextensionCoreFactset10 == input.UrnscimschemasextensionCoreFactset10 ||
                    (this.UrnscimschemasextensionCoreFactset10 != null &&
                    this.UrnscimschemasextensionCoreFactset10.Equals(input.UrnscimschemasextensionCoreFactset10))
                ) && 
                (
                    this.Meta == input.Meta ||
                    (this.Meta != null &&
                    this.Meta.Equals(input.Meta))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.ExternalId != null)
                {
                    hashCode = (hashCode * 59) + this.ExternalId.GetHashCode();
                }
                if (this.UserName != null)
                {
                    hashCode = (hashCode * 59) + this.UserName.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Email != null)
                {
                    hashCode = (hashCode * 59) + this.Email.GetHashCode();
                }
                if (this.PhoneNumbers != null)
                {
                    hashCode = (hashCode * 59) + this.PhoneNumbers.GetHashCode();
                }
                if (this.Groups != null)
                {
                    hashCode = (hashCode * 59) + this.Groups.GetHashCode();
                }
                if (this.UrnscimschemasextensionCoreFactset10 != null)
                {
                    hashCode = (hashCode * 59) + this.UrnscimschemasextensionCoreFactset10.GetHashCode();
                }
                if (this.Meta != null)
                {
                    hashCode = (hashCode * 59) + this.Meta.GetHashCode();
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
