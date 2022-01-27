/*
 * FactSet Entity API
 *
 * Using an entity centric data model, FactSet's Entity API provides access to FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the necessary relationships and connections to create a foundation that tightly correlates disparate sources of information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.FactSetEntity.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetEntity.Model
{
    /// <summary>
    /// Entity Reference Request Body
    /// </summary>
    [DataContract(Name = "entityReferenceRequest")]
    public partial class EntityReferenceRequest : IEquatable<EntityReferenceRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityReferenceRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EntityReferenceRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityReferenceRequest" /> class.
        /// </summary>
        /// <param name="ids">Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input.  (required).</param>
        public EntityReferenceRequest(List<string> ids = default(List<string>))
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for EntityReferenceRequest and cannot be null");
            }
            this.Ids = ids;
        }

        /// <summary>
        /// Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. 
        /// </summary>
        /// <value>Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. </value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EntityReferenceRequest {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
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
            return this.Equals(input as EntityReferenceRequest);
        }

        /// <summary>
        /// Returns true if EntityReferenceRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of EntityReferenceRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityReferenceRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
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
                if (this.Ids != null)
                    hashCode = hashCode * 59 + this.Ids.GetHashCode();
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
