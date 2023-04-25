/*
 * Open:FactSet - Partners
 *
 * This service provides the capability to search and download unstructured content provided by <a href=\"https://open.factset.com/catalog/en-us\">Open:FactSet Partners</a>.
 *
 * The version of the OpenAPI document: 2.0.0
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
using OpenAPIDateConverter = FactSet.SDK.OpenFactSetPartnersDocuments.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OpenFactSetPartnersDocuments.Model
{
    /// <summary>
    /// Returns Diseases Response
    /// </summary>
    [DataContract(Name = "DiseasesFiles")]
    public partial class DiseasesFiles : IEquatable<DiseasesFiles>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DiseasesFiles" /> class.
        /// </summary>
        /// <param name="fileName">The filename of the trial data..</param>
        /// <param name="clinicalTrialId">Specifies Ozmosi unique ID for each historical version of a trial..</param>
        /// <param name="diseaseArea">Defines the cleaned disease name..</param>
        /// <param name="subTherapyArea">The parent Sub Therapy Area of the diseases..</param>
        /// <param name="therapyArea">The parent Therapy Area of the diseases..</param>
        /// <param name="url">Download link for the clinical trials provided by the Ozmosi feed..</param>
        public DiseasesFiles(string fileName = default(string), string clinicalTrialId = default(string), string diseaseArea = default(string), string subTherapyArea = default(string), string therapyArea = default(string), string url = default(string))
        {
            this.FileName = fileName;
            this.ClinicalTrialId = clinicalTrialId;
            this.DiseaseArea = diseaseArea;
            this.SubTherapyArea = subTherapyArea;
            this.TherapyArea = therapyArea;
            this.Url = url;
        }

        /// <summary>
        /// The filename of the trial data.
        /// </summary>
        /// <value>The filename of the trial data.</value>
        [DataMember(Name = "fileName", EmitDefaultValue = false)]
        public string FileName { get; set; }

        /// <summary>
        /// Specifies Ozmosi unique ID for each historical version of a trial.
        /// </summary>
        /// <value>Specifies Ozmosi unique ID for each historical version of a trial.</value>
        [DataMember(Name = "clinicalTrialId", EmitDefaultValue = false)]
        public string ClinicalTrialId { get; set; }

        /// <summary>
        /// Defines the cleaned disease name.
        /// </summary>
        /// <value>Defines the cleaned disease name.</value>
        [DataMember(Name = "diseaseArea", EmitDefaultValue = false)]
        public string DiseaseArea { get; set; }

        /// <summary>
        /// The parent Sub Therapy Area of the diseases.
        /// </summary>
        /// <value>The parent Sub Therapy Area of the diseases.</value>
        [DataMember(Name = "subTherapyArea", EmitDefaultValue = false)]
        public string SubTherapyArea { get; set; }

        /// <summary>
        /// The parent Therapy Area of the diseases.
        /// </summary>
        /// <value>The parent Therapy Area of the diseases.</value>
        [DataMember(Name = "therapyArea", EmitDefaultValue = false)]
        public string TherapyArea { get; set; }

        /// <summary>
        /// Download link for the clinical trials provided by the Ozmosi feed.
        /// </summary>
        /// <value>Download link for the clinical trials provided by the Ozmosi feed.</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DiseasesFiles {\n");
            sb.Append("  FileName: ").Append(FileName).Append("\n");
            sb.Append("  ClinicalTrialId: ").Append(ClinicalTrialId).Append("\n");
            sb.Append("  DiseaseArea: ").Append(DiseaseArea).Append("\n");
            sb.Append("  SubTherapyArea: ").Append(SubTherapyArea).Append("\n");
            sb.Append("  TherapyArea: ").Append(TherapyArea).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
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
            return this.Equals(input as DiseasesFiles);
        }

        /// <summary>
        /// Returns true if DiseasesFiles instances are equal
        /// </summary>
        /// <param name="input">Instance of DiseasesFiles to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DiseasesFiles input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FileName == input.FileName ||
                    (this.FileName != null &&
                    this.FileName.Equals(input.FileName))
                ) && 
                (
                    this.ClinicalTrialId == input.ClinicalTrialId ||
                    (this.ClinicalTrialId != null &&
                    this.ClinicalTrialId.Equals(input.ClinicalTrialId))
                ) && 
                (
                    this.DiseaseArea == input.DiseaseArea ||
                    (this.DiseaseArea != null &&
                    this.DiseaseArea.Equals(input.DiseaseArea))
                ) && 
                (
                    this.SubTherapyArea == input.SubTherapyArea ||
                    (this.SubTherapyArea != null &&
                    this.SubTherapyArea.Equals(input.SubTherapyArea))
                ) && 
                (
                    this.TherapyArea == input.TherapyArea ||
                    (this.TherapyArea != null &&
                    this.TherapyArea.Equals(input.TherapyArea))
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
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
                if (this.FileName != null)
                {
                    hashCode = (hashCode * 59) + this.FileName.GetHashCode();
                }
                if (this.ClinicalTrialId != null)
                {
                    hashCode = (hashCode * 59) + this.ClinicalTrialId.GetHashCode();
                }
                if (this.DiseaseArea != null)
                {
                    hashCode = (hashCode * 59) + this.DiseaseArea.GetHashCode();
                }
                if (this.SubTherapyArea != null)
                {
                    hashCode = (hashCode * 59) + this.SubTherapyArea.GetHashCode();
                }
                if (this.TherapyArea != null)
                {
                    hashCode = (hashCode * 59) + this.TherapyArea.GetHashCode();
                }
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
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
