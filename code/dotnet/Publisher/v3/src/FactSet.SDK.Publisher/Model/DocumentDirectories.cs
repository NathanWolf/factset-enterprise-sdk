/*
 * Publisher API
 *
 * Allow clients to fetch Publisher Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.Publisher.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Publisher.Model
{
    /// <summary>
    /// DocumentDirectories
    /// </summary>
    [DataContract(Name = "DocumentDirectories")]
    public partial class DocumentDirectories : IEquatable<DocumentDirectories>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DocumentDirectories" /> class.
        /// </summary>
        /// <param name="documents">documents.</param>
        /// <param name="directories">List of directories..</param>
        public DocumentDirectories(List<string> documents = default(List<string>), List<string> directories = default(List<string>))
        {
            this.Documents = documents;
            this.Directories = directories;
        }

        /// <summary>
        /// Gets or Sets Documents
        /// </summary>
        [DataMember(Name = "documents", EmitDefaultValue = false)]
        public List<string> Documents { get; set; }

        /// <summary>
        /// List of directories.
        /// </summary>
        /// <value>List of directories.</value>
        [DataMember(Name = "directories", EmitDefaultValue = false)]
        public List<string> Directories { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DocumentDirectories {\n");
            sb.Append("  Documents: ").Append(Documents).Append("\n");
            sb.Append("  Directories: ").Append(Directories).Append("\n");
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
            return this.Equals(input as DocumentDirectories);
        }

        /// <summary>
        /// Returns true if DocumentDirectories instances are equal
        /// </summary>
        /// <param name="input">Instance of DocumentDirectories to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DocumentDirectories input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Documents == input.Documents ||
                    this.Documents != null &&
                    input.Documents != null &&
                    this.Documents.SequenceEqual(input.Documents)
                ) && 
                (
                    this.Directories == input.Directories ||
                    this.Directories != null &&
                    input.Directories != null &&
                    this.Directories.SequenceEqual(input.Directories)
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
                if (this.Documents != null)
                    hashCode = hashCode * 59 + this.Documents.GetHashCode();
                if (this.Directories != null)
                    hashCode = hashCode * 59 + this.Directories.GetHashCode();
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
