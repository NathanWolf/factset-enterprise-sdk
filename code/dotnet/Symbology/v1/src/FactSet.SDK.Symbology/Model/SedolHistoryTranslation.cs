/*
 * FactSet Symbology API
 *
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types. various market symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN,  SEDOL, Tickers, and Bloomberg FIGIs.   Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly  harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time. Additionally, the Symbology API provides  translation of market ids into Bloomberg FIGI. 
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
using OpenAPIDateConverter = FactSet.SDK.Symbology.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Symbology.Model
{
    /// <summary>
    /// SEDOL History Translation data object.
    /// </summary>
    [DataContract(Name = "sedolHistoryTranslation")]
    public partial class SedolHistoryTranslation : IEquatable<SedolHistoryTranslation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SedolHistoryTranslation" /> class.
        /// </summary>
        /// <param name="fsymId">FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).</param>
        /// <param name="name">Proper Name of company or issuer..</param>
        /// <param name="sedol">SEDOL.</param>
        /// <param name="sedolEffectiveStartDate">SEDOL effective start date in YYYY-MM-DD format..</param>
        /// <param name="sedolEffectiveEndDate">SEDOL effective end date in YYYY-MM-DD format. Null if still active..</param>
        /// <param name="requestId">Identifier specified in the request.</param>
        public SedolHistoryTranslation(string fsymId = default(string), string name = default(string), string sedol = default(string), DateTime sedolEffectiveStartDate = default(DateTime), DateTime sedolEffectiveEndDate = default(DateTime), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.Name = name;
            this.Sedol = sedol;
            this.SedolEffectiveStartDate = sedolEffectiveStartDate;
            this.SedolEffectiveEndDate = sedolEffectiveEndDate;
            this.RequestId = requestId;
        }

        /// <summary>
        /// FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
        /// </summary>
        /// <value>FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// Proper Name of company or issuer.
        /// </summary>
        /// <value>Proper Name of company or issuer.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// SEDOL
        /// </summary>
        /// <value>SEDOL</value>
        [DataMember(Name = "sedol", EmitDefaultValue = false)]
        public string Sedol { get; set; }

        /// <summary>
        /// SEDOL effective start date in YYYY-MM-DD format.
        /// </summary>
        /// <value>SEDOL effective start date in YYYY-MM-DD format.</value>
        [DataMember(Name = "sedolEffectiveStartDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime SedolEffectiveStartDate { get; set; }

        /// <summary>
        /// SEDOL effective end date in YYYY-MM-DD format. Null if still active.
        /// </summary>
        /// <value>SEDOL effective end date in YYYY-MM-DD format. Null if still active.</value>
        [DataMember(Name = "sedolEffectiveEndDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime SedolEffectiveEndDate { get; set; }

        /// <summary>
        /// Identifier specified in the request
        /// </summary>
        /// <value>Identifier specified in the request</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SedolHistoryTranslation {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Sedol: ").Append(Sedol).Append("\n");
            sb.Append("  SedolEffectiveStartDate: ").Append(SedolEffectiveStartDate).Append("\n");
            sb.Append("  SedolEffectiveEndDate: ").Append(SedolEffectiveEndDate).Append("\n");
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
            return this.Equals(input as SedolHistoryTranslation);
        }

        /// <summary>
        /// Returns true if SedolHistoryTranslation instances are equal
        /// </summary>
        /// <param name="input">Instance of SedolHistoryTranslation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SedolHistoryTranslation input)
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Sedol == input.Sedol ||
                    (this.Sedol != null &&
                    this.Sedol.Equals(input.Sedol))
                ) && 
                (
                    this.SedolEffectiveStartDate == input.SedolEffectiveStartDate ||
                    (this.SedolEffectiveStartDate != null &&
                    this.SedolEffectiveStartDate.Equals(input.SedolEffectiveStartDate))
                ) && 
                (
                    this.SedolEffectiveEndDate == input.SedolEffectiveEndDate ||
                    (this.SedolEffectiveEndDate != null &&
                    this.SedolEffectiveEndDate.Equals(input.SedolEffectiveEndDate))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Sedol != null)
                {
                    hashCode = (hashCode * 59) + this.Sedol.GetHashCode();
                }
                if (this.SedolEffectiveStartDate != null)
                {
                    hashCode = (hashCode * 59) + this.SedolEffectiveStartDate.GetHashCode();
                }
                if (this.SedolEffectiveEndDate != null)
                {
                    hashCode = (hashCode * 59) + this.SedolEffectiveEndDate.GetHashCode();
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
