/*
 * FactSet People API
 *
 * The FactSet People API exposes FactSet data for individuals and their jobs. 
 *
 * The version of the OpenAPI document: 1.0.0
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
    /// Basic information about a person entity.
    /// </summary>
    [DataContract(Name = "profile")]
    public partial class Profile : IEquatable<Profile>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Profile" /> class.
        /// </summary>
        /// <param name="requestId">Person identifier used in the request..</param>
        /// <param name="personId">FactSet Entity Identifier for the Person.</param>
        /// <param name="lastName">Last Name.</param>
        /// <param name="factsetName">Name.</param>
        /// <param name="firstName">First Name.</param>
        /// <param name="middleName">Middle Name.</param>
        /// <param name="formalName">Formal Name.</param>
        /// <param name="properName">Proper Name.</param>
        /// <param name="salutation">Primary Salutation of Name.</param>
        /// <param name="highestDegree">The Highest Held Degree Code..</param>
        /// <param name="highestDegreeInst">The Highest Degree Institution Name..</param>
        /// <param name="suffix">Suffix of Name.</param>
        /// <param name="age">Person&#39;s age in years..</param>
        /// <param name="gender">Person&#39;s Gender..</param>
        /// <param name="salary">Most Recent Salary.</param>
        /// <param name="totalCompensation">Most Recent Total Compensation.</param>
        /// <param name="primaryCompanyId">Entity identifier of primary &#x60;Company&#x60; of employment..</param>
        /// <param name="primaryCompanyName">Name of primary company of employment.</param>
        /// <param name="primaryTitle">Title at primary &#x60;Company&#x60; of employment.</param>
        /// <param name="biography">Brief biography of the person requested..</param>
        public Profile(string requestId = default(string), string personId = default(string), string lastName = default(string), string factsetName = default(string), string firstName = default(string), string middleName = default(string), string formalName = default(string), string properName = default(string), string salutation = default(string), string highestDegree = default(string), string highestDegreeInst = default(string), string suffix = default(string), decimal age = default(decimal), string gender = default(string), decimal salary = default(decimal), decimal totalCompensation = default(decimal), string primaryCompanyId = default(string), string primaryCompanyName = default(string), string primaryTitle = default(string), string biography = default(string))
        {
            this.RequestId = requestId;
            this.PersonId = personId;
            this.LastName = lastName;
            this.FactsetName = factsetName;
            this.FirstName = firstName;
            this.MiddleName = middleName;
            this.FormalName = formalName;
            this.ProperName = properName;
            this.Salutation = salutation;
            this.HighestDegree = highestDegree;
            this.HighestDegreeInst = highestDegreeInst;
            this.Suffix = suffix;
            this.Age = age;
            this.Gender = gender;
            this.Salary = salary;
            this.TotalCompensation = totalCompensation;
            this.PrimaryCompanyId = primaryCompanyId;
            this.PrimaryCompanyName = primaryCompanyName;
            this.PrimaryTitle = primaryTitle;
            this.Biography = biography;
        }

        /// <summary>
        /// Person identifier used in the request.
        /// </summary>
        /// <value>Person identifier used in the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// FactSet Entity Identifier for the Person
        /// </summary>
        /// <value>FactSet Entity Identifier for the Person</value>
        [DataMember(Name = "personId", EmitDefaultValue = false)]
        public string PersonId { get; set; }

        /// <summary>
        /// Last Name
        /// </summary>
        /// <value>Last Name</value>
        [DataMember(Name = "lastName", EmitDefaultValue = false)]
        public string LastName { get; set; }

        /// <summary>
        /// Name
        /// </summary>
        /// <value>Name</value>
        [DataMember(Name = "factsetName", EmitDefaultValue = false)]
        public string FactsetName { get; set; }

        /// <summary>
        /// First Name
        /// </summary>
        /// <value>First Name</value>
        [DataMember(Name = "firstName", EmitDefaultValue = false)]
        public string FirstName { get; set; }

        /// <summary>
        /// Middle Name
        /// </summary>
        /// <value>Middle Name</value>
        [DataMember(Name = "middleName", EmitDefaultValue = false)]
        public string MiddleName { get; set; }

        /// <summary>
        /// Formal Name
        /// </summary>
        /// <value>Formal Name</value>
        [DataMember(Name = "formalName", EmitDefaultValue = false)]
        public string FormalName { get; set; }

        /// <summary>
        /// Proper Name
        /// </summary>
        /// <value>Proper Name</value>
        [DataMember(Name = "properName", EmitDefaultValue = false)]
        public string ProperName { get; set; }

        /// <summary>
        /// Primary Salutation of Name
        /// </summary>
        /// <value>Primary Salutation of Name</value>
        [DataMember(Name = "salutation", EmitDefaultValue = false)]
        public string Salutation { get; set; }

        /// <summary>
        /// The Highest Held Degree Code.
        /// </summary>
        /// <value>The Highest Held Degree Code.</value>
        [DataMember(Name = "highestDegree", EmitDefaultValue = false)]
        public string HighestDegree { get; set; }

        /// <summary>
        /// The Highest Degree Institution Name.
        /// </summary>
        /// <value>The Highest Degree Institution Name.</value>
        [DataMember(Name = "highestDegreeInst", EmitDefaultValue = false)]
        public string HighestDegreeInst { get; set; }

        /// <summary>
        /// Suffix of Name
        /// </summary>
        /// <value>Suffix of Name</value>
        [DataMember(Name = "suffix", EmitDefaultValue = false)]
        public string Suffix { get; set; }

        /// <summary>
        /// Person&#39;s age in years.
        /// </summary>
        /// <value>Person&#39;s age in years.</value>
        [DataMember(Name = "age", EmitDefaultValue = false)]
        public decimal Age { get; set; }

        /// <summary>
        /// Person&#39;s Gender.
        /// </summary>
        /// <value>Person&#39;s Gender.</value>
        [DataMember(Name = "gender", EmitDefaultValue = false)]
        public string Gender { get; set; }

        /// <summary>
        /// Most Recent Salary
        /// </summary>
        /// <value>Most Recent Salary</value>
        [DataMember(Name = "salary", EmitDefaultValue = false)]
        public decimal Salary { get; set; }

        /// <summary>
        /// Most Recent Total Compensation
        /// </summary>
        /// <value>Most Recent Total Compensation</value>
        [DataMember(Name = "totalCompensation", EmitDefaultValue = false)]
        public decimal TotalCompensation { get; set; }

        /// <summary>
        /// Entity identifier of primary &#x60;Company&#x60; of employment.
        /// </summary>
        /// <value>Entity identifier of primary &#x60;Company&#x60; of employment.</value>
        [DataMember(Name = "primaryCompanyId", EmitDefaultValue = false)]
        public string PrimaryCompanyId { get; set; }

        /// <summary>
        /// Name of primary company of employment
        /// </summary>
        /// <value>Name of primary company of employment</value>
        [DataMember(Name = "primaryCompanyName", EmitDefaultValue = false)]
        public string PrimaryCompanyName { get; set; }

        /// <summary>
        /// Title at primary &#x60;Company&#x60; of employment
        /// </summary>
        /// <value>Title at primary &#x60;Company&#x60; of employment</value>
        [DataMember(Name = "primaryTitle", EmitDefaultValue = false)]
        public string PrimaryTitle { get; set; }

        /// <summary>
        /// Brief biography of the person requested.
        /// </summary>
        /// <value>Brief biography of the person requested.</value>
        [DataMember(Name = "biography", EmitDefaultValue = false)]
        public string Biography { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Profile {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  PersonId: ").Append(PersonId).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  FactsetName: ").Append(FactsetName).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  MiddleName: ").Append(MiddleName).Append("\n");
            sb.Append("  FormalName: ").Append(FormalName).Append("\n");
            sb.Append("  ProperName: ").Append(ProperName).Append("\n");
            sb.Append("  Salutation: ").Append(Salutation).Append("\n");
            sb.Append("  HighestDegree: ").Append(HighestDegree).Append("\n");
            sb.Append("  HighestDegreeInst: ").Append(HighestDegreeInst).Append("\n");
            sb.Append("  Suffix: ").Append(Suffix).Append("\n");
            sb.Append("  Age: ").Append(Age).Append("\n");
            sb.Append("  Gender: ").Append(Gender).Append("\n");
            sb.Append("  Salary: ").Append(Salary).Append("\n");
            sb.Append("  TotalCompensation: ").Append(TotalCompensation).Append("\n");
            sb.Append("  PrimaryCompanyId: ").Append(PrimaryCompanyId).Append("\n");
            sb.Append("  PrimaryCompanyName: ").Append(PrimaryCompanyName).Append("\n");
            sb.Append("  PrimaryTitle: ").Append(PrimaryTitle).Append("\n");
            sb.Append("  Biography: ").Append(Biography).Append("\n");
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
            return this.Equals(input as Profile);
        }

        /// <summary>
        /// Returns true if Profile instances are equal
        /// </summary>
        /// <param name="input">Instance of Profile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Profile input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.PersonId == input.PersonId ||
                    (this.PersonId != null &&
                    this.PersonId.Equals(input.PersonId))
                ) && 
                (
                    this.LastName == input.LastName ||
                    (this.LastName != null &&
                    this.LastName.Equals(input.LastName))
                ) && 
                (
                    this.FactsetName == input.FactsetName ||
                    (this.FactsetName != null &&
                    this.FactsetName.Equals(input.FactsetName))
                ) && 
                (
                    this.FirstName == input.FirstName ||
                    (this.FirstName != null &&
                    this.FirstName.Equals(input.FirstName))
                ) && 
                (
                    this.MiddleName == input.MiddleName ||
                    (this.MiddleName != null &&
                    this.MiddleName.Equals(input.MiddleName))
                ) && 
                (
                    this.FormalName == input.FormalName ||
                    (this.FormalName != null &&
                    this.FormalName.Equals(input.FormalName))
                ) && 
                (
                    this.ProperName == input.ProperName ||
                    (this.ProperName != null &&
                    this.ProperName.Equals(input.ProperName))
                ) && 
                (
                    this.Salutation == input.Salutation ||
                    (this.Salutation != null &&
                    this.Salutation.Equals(input.Salutation))
                ) && 
                (
                    this.HighestDegree == input.HighestDegree ||
                    (this.HighestDegree != null &&
                    this.HighestDegree.Equals(input.HighestDegree))
                ) && 
                (
                    this.HighestDegreeInst == input.HighestDegreeInst ||
                    (this.HighestDegreeInst != null &&
                    this.HighestDegreeInst.Equals(input.HighestDegreeInst))
                ) && 
                (
                    this.Suffix == input.Suffix ||
                    (this.Suffix != null &&
                    this.Suffix.Equals(input.Suffix))
                ) && 
                (
                    this.Age == input.Age ||
                    this.Age.Equals(input.Age)
                ) && 
                (
                    this.Gender == input.Gender ||
                    (this.Gender != null &&
                    this.Gender.Equals(input.Gender))
                ) && 
                (
                    this.Salary == input.Salary ||
                    this.Salary.Equals(input.Salary)
                ) && 
                (
                    this.TotalCompensation == input.TotalCompensation ||
                    this.TotalCompensation.Equals(input.TotalCompensation)
                ) && 
                (
                    this.PrimaryCompanyId == input.PrimaryCompanyId ||
                    (this.PrimaryCompanyId != null &&
                    this.PrimaryCompanyId.Equals(input.PrimaryCompanyId))
                ) && 
                (
                    this.PrimaryCompanyName == input.PrimaryCompanyName ||
                    (this.PrimaryCompanyName != null &&
                    this.PrimaryCompanyName.Equals(input.PrimaryCompanyName))
                ) && 
                (
                    this.PrimaryTitle == input.PrimaryTitle ||
                    (this.PrimaryTitle != null &&
                    this.PrimaryTitle.Equals(input.PrimaryTitle))
                ) && 
                (
                    this.Biography == input.Biography ||
                    (this.Biography != null &&
                    this.Biography.Equals(input.Biography))
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
                if (this.RequestId != null)
                    hashCode = hashCode * 59 + this.RequestId.GetHashCode();
                if (this.PersonId != null)
                    hashCode = hashCode * 59 + this.PersonId.GetHashCode();
                if (this.LastName != null)
                    hashCode = hashCode * 59 + this.LastName.GetHashCode();
                if (this.FactsetName != null)
                    hashCode = hashCode * 59 + this.FactsetName.GetHashCode();
                if (this.FirstName != null)
                    hashCode = hashCode * 59 + this.FirstName.GetHashCode();
                if (this.MiddleName != null)
                    hashCode = hashCode * 59 + this.MiddleName.GetHashCode();
                if (this.FormalName != null)
                    hashCode = hashCode * 59 + this.FormalName.GetHashCode();
                if (this.ProperName != null)
                    hashCode = hashCode * 59 + this.ProperName.GetHashCode();
                if (this.Salutation != null)
                    hashCode = hashCode * 59 + this.Salutation.GetHashCode();
                if (this.HighestDegree != null)
                    hashCode = hashCode * 59 + this.HighestDegree.GetHashCode();
                if (this.HighestDegreeInst != null)
                    hashCode = hashCode * 59 + this.HighestDegreeInst.GetHashCode();
                if (this.Suffix != null)
                    hashCode = hashCode * 59 + this.Suffix.GetHashCode();
                hashCode = hashCode * 59 + this.Age.GetHashCode();
                if (this.Gender != null)
                    hashCode = hashCode * 59 + this.Gender.GetHashCode();
                hashCode = hashCode * 59 + this.Salary.GetHashCode();
                hashCode = hashCode * 59 + this.TotalCompensation.GetHashCode();
                if (this.PrimaryCompanyId != null)
                    hashCode = hashCode * 59 + this.PrimaryCompanyId.GetHashCode();
                if (this.PrimaryCompanyName != null)
                    hashCode = hashCode * 59 + this.PrimaryCompanyName.GetHashCode();
                if (this.PrimaryTitle != null)
                    hashCode = hashCode * 59 + this.PrimaryTitle.GetHashCode();
                if (this.Biography != null)
                    hashCode = hashCode * 59 + this.Biography.GetHashCode();
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
