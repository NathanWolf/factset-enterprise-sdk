/*
 * FactSet Terms & Conditions API
 *
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTermsandConditions.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTermsandConditions.Model
{
    /// <summary>
    /// Convertible Details for a Fixed Income security.
    /// </summary>
    [DataContract(Name = "convertibleDetails")]
    public partial class ConvertibleDetails : IEquatable<ConvertibleDetails>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ConvertibleDetails" /> class.
        /// </summary>
        /// <param name="requestId">Security identifier used in the request..</param>
        /// <param name="fsymId">FactSet Permanent Security Identifier..</param>
        /// <param name="convCurr">Convertible Currency.</param>
        /// <param name="convEffDate">Convertible Effective Date.</param>
        /// <param name="convEndDate">Convertible End Date.</param>
        /// <param name="convFrequency">Convertible Frequency.</param>
        /// <param name="convId">Convertible Type Id.</param>
        /// <param name="convIdentification">Convertible Identification.</param>
        /// <param name="convNoticeDaysMax">Convertible Notice Max.</param>
        /// <param name="convNoticeDaysMin">Convertible Notice Min.</param>
        /// <param name="convPayForm">Convertible Payment Form.</param>
        /// <param name="convPayFormDet">Convertible Payment Form Detail.</param>
        /// <param name="convPayFormElect">Convertible Payment Form Election.</param>
        /// <param name="convPremChgControl">Convertible Premium Change Control.</param>
        /// <param name="convPriceMethod">Convertible Price Method.</param>
        /// <param name="convRatio">Convertibles Ratio.</param>
        /// <param name="convRatioDesc">Convertible Ratio Form Description.</param>
        /// <param name="convType">Convertible Type.</param>
        public ConvertibleDetails(string requestId = default(string), string fsymId = default(string), string convCurr = default(string), DateTime convEffDate = default(DateTime), DateTime convEndDate = default(DateTime), string convFrequency = default(string), int convId = default(int), string convIdentification = default(string), int convNoticeDaysMax = default(int), int convNoticeDaysMin = default(int), string convPayForm = default(string), string convPayFormDet = default(string), string convPayFormElect = default(string), double convPremChgControl = default(double), string convPriceMethod = default(string), double convRatio = default(double), string convRatioDesc = default(string), string convType = default(string))
        {
            this.RequestId = requestId;
            this.FsymId = fsymId;
            this.ConvCurr = convCurr;
            this.ConvEffDate = convEffDate;
            this.ConvEndDate = convEndDate;
            this.ConvFrequency = convFrequency;
            this.ConvId = convId;
            this.ConvIdentification = convIdentification;
            this.ConvNoticeDaysMax = convNoticeDaysMax;
            this.ConvNoticeDaysMin = convNoticeDaysMin;
            this.ConvPayForm = convPayForm;
            this.ConvPayFormDet = convPayFormDet;
            this.ConvPayFormElect = convPayFormElect;
            this.ConvPremChgControl = convPremChgControl;
            this.ConvPriceMethod = convPriceMethod;
            this.ConvRatio = convRatio;
            this.ConvRatioDesc = convRatioDesc;
            this.ConvType = convType;
        }

        /// <summary>
        /// Security identifier used in the request.
        /// </summary>
        /// <value>Security identifier used in the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// FactSet Permanent Security Identifier.
        /// </summary>
        /// <value>FactSet Permanent Security Identifier.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// Convertible Currency
        /// </summary>
        /// <value>Convertible Currency</value>
        [DataMember(Name = "convCurr", EmitDefaultValue = false)]
        public string ConvCurr { get; set; }

        /// <summary>
        /// Convertible Effective Date
        /// </summary>
        /// <value>Convertible Effective Date</value>
        [DataMember(Name = "convEffDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime ConvEffDate { get; set; }

        /// <summary>
        /// Convertible End Date
        /// </summary>
        /// <value>Convertible End Date</value>
        [DataMember(Name = "convEndDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime ConvEndDate { get; set; }

        /// <summary>
        /// Convertible Frequency
        /// </summary>
        /// <value>Convertible Frequency</value>
        [DataMember(Name = "convFrequency", EmitDefaultValue = false)]
        public string ConvFrequency { get; set; }

        /// <summary>
        /// Convertible Type Id
        /// </summary>
        /// <value>Convertible Type Id</value>
        [DataMember(Name = "convId", EmitDefaultValue = false)]
        public int ConvId { get; set; }

        /// <summary>
        /// Convertible Identification
        /// </summary>
        /// <value>Convertible Identification</value>
        [DataMember(Name = "convIdentification", EmitDefaultValue = false)]
        public string ConvIdentification { get; set; }

        /// <summary>
        /// Convertible Notice Max
        /// </summary>
        /// <value>Convertible Notice Max</value>
        [DataMember(Name = "convNoticeDaysMax", EmitDefaultValue = false)]
        public int ConvNoticeDaysMax { get; set; }

        /// <summary>
        /// Convertible Notice Min
        /// </summary>
        /// <value>Convertible Notice Min</value>
        [DataMember(Name = "convNoticeDaysMin", EmitDefaultValue = false)]
        public int ConvNoticeDaysMin { get; set; }

        /// <summary>
        /// Convertible Payment Form
        /// </summary>
        /// <value>Convertible Payment Form</value>
        [DataMember(Name = "convPayForm", EmitDefaultValue = false)]
        public string ConvPayForm { get; set; }

        /// <summary>
        /// Convertible Payment Form Detail
        /// </summary>
        /// <value>Convertible Payment Form Detail</value>
        [DataMember(Name = "convPayFormDet", EmitDefaultValue = false)]
        public string ConvPayFormDet { get; set; }

        /// <summary>
        /// Convertible Payment Form Election
        /// </summary>
        /// <value>Convertible Payment Form Election</value>
        [DataMember(Name = "convPayFormElect", EmitDefaultValue = false)]
        public string ConvPayFormElect { get; set; }

        /// <summary>
        /// Convertible Premium Change Control
        /// </summary>
        /// <value>Convertible Premium Change Control</value>
        [DataMember(Name = "convPremChgControl", EmitDefaultValue = false)]
        public double ConvPremChgControl { get; set; }

        /// <summary>
        /// Convertible Price Method
        /// </summary>
        /// <value>Convertible Price Method</value>
        [DataMember(Name = "convPriceMethod", EmitDefaultValue = false)]
        public string ConvPriceMethod { get; set; }

        /// <summary>
        /// Convertibles Ratio
        /// </summary>
        /// <value>Convertibles Ratio</value>
        [DataMember(Name = "convRatio", EmitDefaultValue = false)]
        public double ConvRatio { get; set; }

        /// <summary>
        /// Convertible Ratio Form Description
        /// </summary>
        /// <value>Convertible Ratio Form Description</value>
        [DataMember(Name = "convRatioDesc", EmitDefaultValue = false)]
        public string ConvRatioDesc { get; set; }

        /// <summary>
        /// Convertible Type
        /// </summary>
        /// <value>Convertible Type</value>
        [DataMember(Name = "convType", EmitDefaultValue = false)]
        public string ConvType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ConvertibleDetails {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  ConvCurr: ").Append(ConvCurr).Append("\n");
            sb.Append("  ConvEffDate: ").Append(ConvEffDate).Append("\n");
            sb.Append("  ConvEndDate: ").Append(ConvEndDate).Append("\n");
            sb.Append("  ConvFrequency: ").Append(ConvFrequency).Append("\n");
            sb.Append("  ConvId: ").Append(ConvId).Append("\n");
            sb.Append("  ConvIdentification: ").Append(ConvIdentification).Append("\n");
            sb.Append("  ConvNoticeDaysMax: ").Append(ConvNoticeDaysMax).Append("\n");
            sb.Append("  ConvNoticeDaysMin: ").Append(ConvNoticeDaysMin).Append("\n");
            sb.Append("  ConvPayForm: ").Append(ConvPayForm).Append("\n");
            sb.Append("  ConvPayFormDet: ").Append(ConvPayFormDet).Append("\n");
            sb.Append("  ConvPayFormElect: ").Append(ConvPayFormElect).Append("\n");
            sb.Append("  ConvPremChgControl: ").Append(ConvPremChgControl).Append("\n");
            sb.Append("  ConvPriceMethod: ").Append(ConvPriceMethod).Append("\n");
            sb.Append("  ConvRatio: ").Append(ConvRatio).Append("\n");
            sb.Append("  ConvRatioDesc: ").Append(ConvRatioDesc).Append("\n");
            sb.Append("  ConvType: ").Append(ConvType).Append("\n");
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
            return this.Equals(input as ConvertibleDetails);
        }

        /// <summary>
        /// Returns true if ConvertibleDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of ConvertibleDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ConvertibleDetails input)
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
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.ConvCurr == input.ConvCurr ||
                    (this.ConvCurr != null &&
                    this.ConvCurr.Equals(input.ConvCurr))
                ) && 
                (
                    this.ConvEffDate == input.ConvEffDate ||
                    (this.ConvEffDate != null &&
                    this.ConvEffDate.Equals(input.ConvEffDate))
                ) && 
                (
                    this.ConvEndDate == input.ConvEndDate ||
                    (this.ConvEndDate != null &&
                    this.ConvEndDate.Equals(input.ConvEndDate))
                ) && 
                (
                    this.ConvFrequency == input.ConvFrequency ||
                    (this.ConvFrequency != null &&
                    this.ConvFrequency.Equals(input.ConvFrequency))
                ) && 
                (
                    this.ConvId == input.ConvId ||
                    this.ConvId.Equals(input.ConvId)
                ) && 
                (
                    this.ConvIdentification == input.ConvIdentification ||
                    (this.ConvIdentification != null &&
                    this.ConvIdentification.Equals(input.ConvIdentification))
                ) && 
                (
                    this.ConvNoticeDaysMax == input.ConvNoticeDaysMax ||
                    this.ConvNoticeDaysMax.Equals(input.ConvNoticeDaysMax)
                ) && 
                (
                    this.ConvNoticeDaysMin == input.ConvNoticeDaysMin ||
                    this.ConvNoticeDaysMin.Equals(input.ConvNoticeDaysMin)
                ) && 
                (
                    this.ConvPayForm == input.ConvPayForm ||
                    (this.ConvPayForm != null &&
                    this.ConvPayForm.Equals(input.ConvPayForm))
                ) && 
                (
                    this.ConvPayFormDet == input.ConvPayFormDet ||
                    (this.ConvPayFormDet != null &&
                    this.ConvPayFormDet.Equals(input.ConvPayFormDet))
                ) && 
                (
                    this.ConvPayFormElect == input.ConvPayFormElect ||
                    (this.ConvPayFormElect != null &&
                    this.ConvPayFormElect.Equals(input.ConvPayFormElect))
                ) && 
                (
                    this.ConvPremChgControl == input.ConvPremChgControl ||
                    this.ConvPremChgControl.Equals(input.ConvPremChgControl)
                ) && 
                (
                    this.ConvPriceMethod == input.ConvPriceMethod ||
                    (this.ConvPriceMethod != null &&
                    this.ConvPriceMethod.Equals(input.ConvPriceMethod))
                ) && 
                (
                    this.ConvRatio == input.ConvRatio ||
                    this.ConvRatio.Equals(input.ConvRatio)
                ) && 
                (
                    this.ConvRatioDesc == input.ConvRatioDesc ||
                    (this.ConvRatioDesc != null &&
                    this.ConvRatioDesc.Equals(input.ConvRatioDesc))
                ) && 
                (
                    this.ConvType == input.ConvType ||
                    (this.ConvType != null &&
                    this.ConvType.Equals(input.ConvType))
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
                if (this.FsymId != null)
                    hashCode = hashCode * 59 + this.FsymId.GetHashCode();
                if (this.ConvCurr != null)
                    hashCode = hashCode * 59 + this.ConvCurr.GetHashCode();
                if (this.ConvEffDate != null)
                    hashCode = hashCode * 59 + this.ConvEffDate.GetHashCode();
                if (this.ConvEndDate != null)
                    hashCode = hashCode * 59 + this.ConvEndDate.GetHashCode();
                if (this.ConvFrequency != null)
                    hashCode = hashCode * 59 + this.ConvFrequency.GetHashCode();
                hashCode = hashCode * 59 + this.ConvId.GetHashCode();
                if (this.ConvIdentification != null)
                    hashCode = hashCode * 59 + this.ConvIdentification.GetHashCode();
                hashCode = hashCode * 59 + this.ConvNoticeDaysMax.GetHashCode();
                hashCode = hashCode * 59 + this.ConvNoticeDaysMin.GetHashCode();
                if (this.ConvPayForm != null)
                    hashCode = hashCode * 59 + this.ConvPayForm.GetHashCode();
                if (this.ConvPayFormDet != null)
                    hashCode = hashCode * 59 + this.ConvPayFormDet.GetHashCode();
                if (this.ConvPayFormElect != null)
                    hashCode = hashCode * 59 + this.ConvPayFormElect.GetHashCode();
                hashCode = hashCode * 59 + this.ConvPremChgControl.GetHashCode();
                if (this.ConvPriceMethod != null)
                    hashCode = hashCode * 59 + this.ConvPriceMethod.GetHashCode();
                hashCode = hashCode * 59 + this.ConvRatio.GetHashCode();
                if (this.ConvRatioDesc != null)
                    hashCode = hashCode * 59 + this.ConvRatioDesc.GetHashCode();
                if (this.ConvType != null)
                    hashCode = hashCode * 59 + this.ConvType.GetHashCode();
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
