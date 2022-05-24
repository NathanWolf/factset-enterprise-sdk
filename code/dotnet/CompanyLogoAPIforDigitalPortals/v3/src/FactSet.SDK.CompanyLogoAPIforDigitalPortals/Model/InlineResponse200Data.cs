/*
 * Company Logo API For Digital Portals
 *
 * Consume FactSet-collected company logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Functional APIs.
 *
 * The version of the OpenAPI document: 2
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
using OpenAPIDateConverter = FactSet.SDK.CompanyLogoAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.CompanyLogoAPIforDigitalPortals.Model
{
    /// <summary>
    /// URLs of company logos. All URLs are publicly available via HTTPS and hosted by FactSet with a top-level domain &#x60;mdgms.com&#x60;. For possible values of the attribute &#x60;mimeType&#x60;, see endpoint &#x60;/basic/media/type/list&#x60; with parameter &#x60;filter.ids&#x3D;1 (image)&#x60;.
    /// </summary>
    [DataContract(Name = "inline_response_200_data")]
    public partial class InlineResponse200Data : IEquatable<InlineResponse200Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200Data" /> class.
        /// </summary>
        /// <param name="small">small.</param>
        /// <param name="medium">medium.</param>
        /// <param name="large">large.</param>
        /// <param name="vector">vector.</param>
        public InlineResponse200Data(InlineResponse200DataSmall small = default(InlineResponse200DataSmall), InlineResponse200DataMedium medium = default(InlineResponse200DataMedium), InlineResponse200DataLarge large = default(InlineResponse200DataLarge), InlineResponse200DataVector vector = default(InlineResponse200DataVector))
        {
            this.Small = small;
            this.Medium = medium;
            this.Large = large;
            this.Vector = vector;
        }

        /// <summary>
        /// Gets or Sets Small
        /// </summary>
        [DataMember(Name = "small", EmitDefaultValue = false)]
        public InlineResponse200DataSmall Small { get; set; }

        /// <summary>
        /// Gets or Sets Medium
        /// </summary>
        [DataMember(Name = "medium", EmitDefaultValue = false)]
        public InlineResponse200DataMedium Medium { get; set; }

        /// <summary>
        /// Gets or Sets Large
        /// </summary>
        [DataMember(Name = "large", EmitDefaultValue = false)]
        public InlineResponse200DataLarge Large { get; set; }

        /// <summary>
        /// Gets or Sets Vector
        /// </summary>
        [DataMember(Name = "vector", EmitDefaultValue = false)]
        public InlineResponse200DataVector Vector { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse200Data {\n");
            sb.Append("  Small: ").Append(Small).Append("\n");
            sb.Append("  Medium: ").Append(Medium).Append("\n");
            sb.Append("  Large: ").Append(Large).Append("\n");
            sb.Append("  Vector: ").Append(Vector).Append("\n");
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
            return this.Equals(input as InlineResponse200Data);
        }

        /// <summary>
        /// Returns true if InlineResponse200Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Small == input.Small ||
                    (this.Small != null &&
                    this.Small.Equals(input.Small))
                ) && 
                (
                    this.Medium == input.Medium ||
                    (this.Medium != null &&
                    this.Medium.Equals(input.Medium))
                ) && 
                (
                    this.Large == input.Large ||
                    (this.Large != null &&
                    this.Large.Equals(input.Large))
                ) && 
                (
                    this.Vector == input.Vector ||
                    (this.Vector != null &&
                    this.Vector.Equals(input.Vector))
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
                if (this.Small != null)
                {
                    hashCode = (hashCode * 59) + this.Small.GetHashCode();
                }
                if (this.Medium != null)
                {
                    hashCode = (hashCode * 59) + this.Medium.GetHashCode();
                }
                if (this.Large != null)
                {
                    hashCode = (hashCode * 59) + this.Large.GetHashCode();
                }
                if (this.Vector != null)
                {
                    hashCode = (hashCode * 59) + this.Vector.GetHashCode();
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
