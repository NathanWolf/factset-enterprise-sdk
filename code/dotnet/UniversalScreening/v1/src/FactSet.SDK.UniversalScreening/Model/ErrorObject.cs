/*
 * Universal Screening API
 *
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 0.0.1
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
using OpenAPIDateConverter = FactSet.SDK.UniversalScreening.Client.OpenAPIDateConverter;

namespace FactSet.SDK.UniversalScreening.Model
{
    /// <summary>
    /// ErrorObject
    /// </summary>
    [DataContract(Name = "ErrorObject")]
    public partial class ErrorObject : IEquatable<ErrorObject>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public ErrorCode? Code { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ErrorObject" /> class.
        /// </summary>
        /// <param name="code">code.</param>
        /// <param name="id">id.</param>
        /// <param name="source">source.</param>
        /// <param name="title">title.</param>
        public ErrorObject(ErrorCode? code = default(ErrorCode?), string id = default(string), ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo source = default(ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo), string title = default(string))
        {
            this.Code = code;
            this.Id = id;
            this.Source = source;
            this.Title = title;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Source
        /// </summary>
        [DataMember(Name = "source", EmitDefaultValue = false)]
        public ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo Source { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name = "title", EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ErrorObject {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
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
            return this.Equals(input as ErrorObject);
        }

        /// <summary>
        /// Returns true if ErrorObject instances are equal
        /// </summary>
        /// <param name="input">Instance of ErrorObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ErrorObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Code == input.Code ||
                    this.Code.Equals(input.Code)
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Source == input.Source ||
                    (this.Source != null &&
                    this.Source.Equals(input.Source))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
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
                hashCode = (hashCode * 59) + this.Code.GetHashCode();
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Source != null)
                {
                    hashCode = (hashCode * 59) + this.Source.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
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
