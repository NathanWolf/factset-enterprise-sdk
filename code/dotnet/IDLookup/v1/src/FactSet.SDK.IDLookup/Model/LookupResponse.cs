/*
 * ID Lookup API
 *
 * The Factset Identifier Lookup API provides the ability to search for various identifier types based on keyword. The API returns tickers, entity names and other identifiers that Factset supports. In addition, the API offers filters that allows users to refine the results. 
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
using OpenAPIDateConverter = FactSet.SDK.IDLookup.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IDLookup.Model
{
    /// <summary>
    /// Response object for a lookup request
    /// </summary>
    [DataContract(Name = "lookup_response")]
    public partial class LookupResponse : IEquatable<LookupResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LookupResponse" /> class.
        /// </summary>
        /// <param name="typehead">typehead.</param>
        /// <param name="error">error.</param>
        /// <param name="isSuccess">isSuccess.</param>
        /// <param name="results">Array of Lookup details for the query.</param>
        public LookupResponse(LookupCount typehead = default(LookupCount), string error = default(string), int isSuccess = default(int), List<ResponseDetails> results = default(List<ResponseDetails>))
        {
            this.Typehead = typehead;
            this.Error = error;
            this.IsSuccess = isSuccess;
            this.Results = results;
        }

        /// <summary>
        /// Gets or Sets Typehead
        /// </summary>
        [DataMember(Name = "typehead", EmitDefaultValue = false)]
        public LookupCount Typehead { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name = "error", EmitDefaultValue = false)]
        public string Error { get; set; }

        /// <summary>
        /// Gets or Sets IsSuccess
        /// </summary>
        [DataMember(Name = "is_success", EmitDefaultValue = false)]
        public int IsSuccess { get; set; }

        /// <summary>
        /// Array of Lookup details for the query
        /// </summary>
        /// <value>Array of Lookup details for the query</value>
        [DataMember(Name = "results", EmitDefaultValue = false)]
        public List<ResponseDetails> Results { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LookupResponse {\n");
            sb.Append("  Typehead: ").Append(Typehead).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  IsSuccess: ").Append(IsSuccess).Append("\n");
            sb.Append("  Results: ").Append(Results).Append("\n");
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
            return this.Equals(input as LookupResponse);
        }

        /// <summary>
        /// Returns true if LookupResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of LookupResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LookupResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Typehead == input.Typehead ||
                    (this.Typehead != null &&
                    this.Typehead.Equals(input.Typehead))
                ) && 
                (
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
                ) && 
                (
                    this.IsSuccess == input.IsSuccess ||
                    this.IsSuccess.Equals(input.IsSuccess)
                ) && 
                (
                    this.Results == input.Results ||
                    this.Results != null &&
                    input.Results != null &&
                    this.Results.SequenceEqual(input.Results)
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
                if (this.Typehead != null)
                    hashCode = hashCode * 59 + this.Typehead.GetHashCode();
                if (this.Error != null)
                    hashCode = hashCode * 59 + this.Error.GetHashCode();
                hashCode = hashCode * 59 + this.IsSuccess.GetHashCode();
                if (this.Results != null)
                    hashCode = hashCode * 59 + this.Results.GetHashCode();
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
