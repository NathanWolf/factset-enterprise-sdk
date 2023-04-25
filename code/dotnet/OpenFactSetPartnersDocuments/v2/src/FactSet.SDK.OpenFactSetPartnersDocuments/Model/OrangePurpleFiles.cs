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
    /// Returns OrangePurple Response
    /// </summary>
    [DataContract(Name = "OrangePurpleFiles")]
    public partial class OrangePurpleFiles : IEquatable<OrangePurpleFiles>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrangePurpleFiles" /> class.
        /// </summary>
        /// <param name="fileName">The filename of the trial data.</param>
        /// <param name="clinicalTrialId">Specifies Ozmosi unique ID for each historical version of a trial.</param>
        /// <param name="beamOpNovelDrug">Identifies if the trial includes a drug that is not approved by the FDA.</param>
        /// <param name="beamOpNovelTarget">It lists the unapproved drug.</param>
        /// <param name="beamOpNovelDrugList">Identifies if there is an MOA or target that has not yet been approved by the FDA.</param>
        /// <param name="beamOpNovelTargetList">Lists the unapproved targets.</param>
        /// <param name="url">Download link for the clinical trials provided by the Ozmosi feed.</param>
        public OrangePurpleFiles(string fileName = default(string), string clinicalTrialId = default(string), string beamOpNovelDrug = default(string), string beamOpNovelTarget = default(string), string beamOpNovelDrugList = default(string), string beamOpNovelTargetList = default(string), string url = default(string))
        {
            this.FileName = fileName;
            this.ClinicalTrialId = clinicalTrialId;
            this.BeamOpNovelDrug = beamOpNovelDrug;
            this.BeamOpNovelTarget = beamOpNovelTarget;
            this.BeamOpNovelDrugList = beamOpNovelDrugList;
            this.BeamOpNovelTargetList = beamOpNovelTargetList;
            this.Url = url;
        }

        /// <summary>
        /// The filename of the trial data
        /// </summary>
        /// <value>The filename of the trial data</value>
        [DataMember(Name = "fileName", EmitDefaultValue = false)]
        public string FileName { get; set; }

        /// <summary>
        /// Specifies Ozmosi unique ID for each historical version of a trial
        /// </summary>
        /// <value>Specifies Ozmosi unique ID for each historical version of a trial</value>
        [DataMember(Name = "clinicalTrialId", EmitDefaultValue = false)]
        public string ClinicalTrialId { get; set; }

        /// <summary>
        /// Identifies if the trial includes a drug that is not approved by the FDA
        /// </summary>
        /// <value>Identifies if the trial includes a drug that is not approved by the FDA</value>
        [DataMember(Name = "beamOpNovelDrug", EmitDefaultValue = false)]
        public string BeamOpNovelDrug { get; set; }

        /// <summary>
        /// It lists the unapproved drug
        /// </summary>
        /// <value>It lists the unapproved drug</value>
        [DataMember(Name = "beamOpNovelTarget", EmitDefaultValue = false)]
        public string BeamOpNovelTarget { get; set; }

        /// <summary>
        /// Identifies if there is an MOA or target that has not yet been approved by the FDA
        /// </summary>
        /// <value>Identifies if there is an MOA or target that has not yet been approved by the FDA</value>
        [DataMember(Name = "beamOpNovelDrugList", EmitDefaultValue = false)]
        public string BeamOpNovelDrugList { get; set; }

        /// <summary>
        /// Lists the unapproved targets
        /// </summary>
        /// <value>Lists the unapproved targets</value>
        [DataMember(Name = "beamOpNovelTargetList", EmitDefaultValue = false)]
        public string BeamOpNovelTargetList { get; set; }

        /// <summary>
        /// Download link for the clinical trials provided by the Ozmosi feed
        /// </summary>
        /// <value>Download link for the clinical trials provided by the Ozmosi feed</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OrangePurpleFiles {\n");
            sb.Append("  FileName: ").Append(FileName).Append("\n");
            sb.Append("  ClinicalTrialId: ").Append(ClinicalTrialId).Append("\n");
            sb.Append("  BeamOpNovelDrug: ").Append(BeamOpNovelDrug).Append("\n");
            sb.Append("  BeamOpNovelTarget: ").Append(BeamOpNovelTarget).Append("\n");
            sb.Append("  BeamOpNovelDrugList: ").Append(BeamOpNovelDrugList).Append("\n");
            sb.Append("  BeamOpNovelTargetList: ").Append(BeamOpNovelTargetList).Append("\n");
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
            return this.Equals(input as OrangePurpleFiles);
        }

        /// <summary>
        /// Returns true if OrangePurpleFiles instances are equal
        /// </summary>
        /// <param name="input">Instance of OrangePurpleFiles to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrangePurpleFiles input)
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
                    this.BeamOpNovelDrug == input.BeamOpNovelDrug ||
                    (this.BeamOpNovelDrug != null &&
                    this.BeamOpNovelDrug.Equals(input.BeamOpNovelDrug))
                ) && 
                (
                    this.BeamOpNovelTarget == input.BeamOpNovelTarget ||
                    (this.BeamOpNovelTarget != null &&
                    this.BeamOpNovelTarget.Equals(input.BeamOpNovelTarget))
                ) && 
                (
                    this.BeamOpNovelDrugList == input.BeamOpNovelDrugList ||
                    (this.BeamOpNovelDrugList != null &&
                    this.BeamOpNovelDrugList.Equals(input.BeamOpNovelDrugList))
                ) && 
                (
                    this.BeamOpNovelTargetList == input.BeamOpNovelTargetList ||
                    (this.BeamOpNovelTargetList != null &&
                    this.BeamOpNovelTargetList.Equals(input.BeamOpNovelTargetList))
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
                if (this.BeamOpNovelDrug != null)
                {
                    hashCode = (hashCode * 59) + this.BeamOpNovelDrug.GetHashCode();
                }
                if (this.BeamOpNovelTarget != null)
                {
                    hashCode = (hashCode * 59) + this.BeamOpNovelTarget.GetHashCode();
                }
                if (this.BeamOpNovelDrugList != null)
                {
                    hashCode = (hashCode * 59) + this.BeamOpNovelDrugList.GetHashCode();
                }
                if (this.BeamOpNovelTargetList != null)
                {
                    hashCode = (hashCode * 59) + this.BeamOpNovelTargetList.GetHashCode();
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
