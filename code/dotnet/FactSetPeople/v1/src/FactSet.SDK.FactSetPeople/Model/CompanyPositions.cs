/*
 * FactSet People API
 *
 * The FactSet People API exposes FactSet data for individuals and their jobs. 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetPeople.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetPeople.Model
{
    /// <summary>
    /// List of executives for the specified company identifier.
    /// </summary>
    [DataContract(Name = "companyPositions")]
    public partial class CompanyPositions : IEquatable<CompanyPositions>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyPositions" /> class.
        /// </summary>
        /// <param name="fsymId">FactSet Identifier for the company..</param>
        /// <param name="personId">Factset Entity Identifier for the Person.</param>
        /// <param name="name">FactSet Name of the person.</param>
        /// <param name="title">The requested Position Title.</param>
        /// <param name="yearsAtFirm">The number of years individual is at firm. For founders, this is since inception..</param>
        /// <param name="age">The age of the person requested..</param>
        /// <param name="gender">The Gender of the person requested..</param>
        /// <param name="requestPosition">The requested position code..</param>
        /// <param name="requestId">Original identifier used for the request..</param>
        public CompanyPositions(string fsymId = default(string), string personId = default(string), string name = default(string), string title = default(string), double? yearsAtFirm = default(double?), decimal? age = default(decimal?), string gender = default(string), string requestPosition = default(string), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.PersonId = personId;
            this.Name = name;
            this.Title = title;
            this.YearsAtFirm = yearsAtFirm;
            this.Age = age;
            this.Gender = gender;
            this.RequestPosition = requestPosition;
            this.RequestId = requestId;
        }

        /// <summary>
        /// FactSet Identifier for the company.
        /// </summary>
        /// <value>FactSet Identifier for the company.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Factset Entity Identifier for the Person
        /// </summary>
        /// <value>Factset Entity Identifier for the Person</value>
        [DataMember(Name = "personId", EmitDefaultValue = true)]
        public string PersonId { get; set; }

        /// <summary>
        /// FactSet Name of the person
        /// </summary>
        /// <value>FactSet Name of the person</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// The requested Position Title
        /// </summary>
        /// <value>The requested Position Title</value>
        [DataMember(Name = "title", EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// The number of years individual is at firm. For founders, this is since inception.
        /// </summary>
        /// <value>The number of years individual is at firm. For founders, this is since inception.</value>
        [DataMember(Name = "yearsAtFirm", EmitDefaultValue = true)]
        public double? YearsAtFirm { get; set; }

        /// <summary>
        /// The age of the person requested.
        /// </summary>
        /// <value>The age of the person requested.</value>
        [DataMember(Name = "age", EmitDefaultValue = true)]
        public decimal? Age { get; set; }

        /// <summary>
        /// The Gender of the person requested.
        /// </summary>
        /// <value>The Gender of the person requested.</value>
        [DataMember(Name = "gender", EmitDefaultValue = true)]
        public string Gender { get; set; }

        /// <summary>
        /// The requested position code.
        /// </summary>
        /// <value>The requested position code.</value>
        [DataMember(Name = "requestPosition", EmitDefaultValue = true)]
        public string RequestPosition { get; set; }

        /// <summary>
        /// Original identifier used for the request.
        /// </summary>
        /// <value>Original identifier used for the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CompanyPositions {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  PersonId: ").Append(PersonId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  YearsAtFirm: ").Append(YearsAtFirm).Append("\n");
            sb.Append("  Age: ").Append(Age).Append("\n");
            sb.Append("  Gender: ").Append(Gender).Append("\n");
            sb.Append("  RequestPosition: ").Append(RequestPosition).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
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
            return this.Equals(input as CompanyPositions);
        }

        /// <summary>
        /// Returns true if CompanyPositions instances are equal
        /// </summary>
        /// <param name="input">Instance of CompanyPositions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CompanyPositions input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.PersonId == input.PersonId ||
                    (this.PersonId != null &&
                    this.PersonId.Equals(input.PersonId))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.YearsAtFirm == input.YearsAtFirm ||
                    (this.YearsAtFirm != null &&
                    this.YearsAtFirm.Equals(input.YearsAtFirm))
                ) && 
                (
                    this.Age == input.Age ||
                    (this.Age != null &&
                    this.Age.Equals(input.Age))
                ) && 
                (
                    this.Gender == input.Gender ||
                    (this.Gender != null &&
                    this.Gender.Equals(input.Gender))
                ) && 
                (
                    this.RequestPosition == input.RequestPosition ||
                    (this.RequestPosition != null &&
                    this.RequestPosition.Equals(input.RequestPosition))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
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
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.PersonId != null)
                {
                    hashCode = (hashCode * 59) + this.PersonId.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.YearsAtFirm != null)
                {
                    hashCode = (hashCode * 59) + this.YearsAtFirm.GetHashCode();
                }
                if (this.Age != null)
                {
                    hashCode = (hashCode * 59) + this.Age.GetHashCode();
                }
                if (this.Gender != null)
                {
                    hashCode = (hashCode * 59) + this.Gender.GetHashCode();
                }
                if (this.RequestPosition != null)
                {
                    hashCode = (hashCode * 59) + this.RequestPosition.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
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
