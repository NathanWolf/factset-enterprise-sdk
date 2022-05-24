/*
 * FI API
 *
 * Allow clients to fetch Analytics through APIs.
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
using OpenAPIDateConverter = FactSet.SDK.FixedIncomeCalculation.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FixedIncomeCalculation.Model
{
    /// <summary>
    /// FIReferenceSecurity
    /// </summary>
    [DataContract(Name = "FIReferenceSecurity")]
    public partial class FIReferenceSecurity : IEquatable<FIReferenceSecurity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FIReferenceSecurity" /> class.
        /// </summary>
        /// <param name="securityType">Reference Security Type.</param>
        /// <param name="securityName">Reference Security Name.</param>
        /// <param name="calcFromMethod">Reference Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix.</param>
        /// <param name="calcFromValue">Reference CalcFromValue.</param>
        /// <param name="prepay">prepay.</param>
        /// <param name="settlement">Reference Settlement Date.</param>
        public FIReferenceSecurity(string securityType = default(string), string securityName = default(string), string calcFromMethod = default(string), double calcFromValue = default(double), FIReferencePrepay prepay = default(FIReferencePrepay), string settlement = default(string))
        {
            this.SecurityType = securityType;
            this.SecurityName = securityName;
            this.CalcFromMethod = calcFromMethod;
            this.CalcFromValue = calcFromValue;
            this.Prepay = prepay;
            this.Settlement = settlement;
        }

        /// <summary>
        /// Reference Security Type
        /// </summary>
        /// <value>Reference Security Type</value>
        [DataMember(Name = "securityType", EmitDefaultValue = false)]
        public string SecurityType { get; set; }

        /// <summary>
        /// Reference Security Name
        /// </summary>
        /// <value>Reference Security Name</value>
        [DataMember(Name = "securityName", EmitDefaultValue = false)]
        public string SecurityName { get; set; }

        /// <summary>
        /// Reference Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix
        /// </summary>
        /// <value>Reference Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix</value>
        [DataMember(Name = "calcFromMethod", EmitDefaultValue = false)]
        public string CalcFromMethod { get; set; }

        /// <summary>
        /// Reference CalcFromValue
        /// </summary>
        /// <value>Reference CalcFromValue</value>
        [DataMember(Name = "calcFromValue", EmitDefaultValue = false)]
        public double CalcFromValue { get; set; }

        /// <summary>
        /// Gets or Sets Prepay
        /// </summary>
        [DataMember(Name = "prepay", EmitDefaultValue = false)]
        public FIReferencePrepay Prepay { get; set; }

        /// <summary>
        /// Reference Settlement Date
        /// </summary>
        /// <value>Reference Settlement Date</value>
        [DataMember(Name = "settlement", EmitDefaultValue = false)]
        public string Settlement { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FIReferenceSecurity {\n");
            sb.Append("  SecurityType: ").Append(SecurityType).Append("\n");
            sb.Append("  SecurityName: ").Append(SecurityName).Append("\n");
            sb.Append("  CalcFromMethod: ").Append(CalcFromMethod).Append("\n");
            sb.Append("  CalcFromValue: ").Append(CalcFromValue).Append("\n");
            sb.Append("  Prepay: ").Append(Prepay).Append("\n");
            sb.Append("  Settlement: ").Append(Settlement).Append("\n");
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
            return this.Equals(input as FIReferenceSecurity);
        }

        /// <summary>
        /// Returns true if FIReferenceSecurity instances are equal
        /// </summary>
        /// <param name="input">Instance of FIReferenceSecurity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FIReferenceSecurity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.SecurityType == input.SecurityType ||
                    (this.SecurityType != null &&
                    this.SecurityType.Equals(input.SecurityType))
                ) && 
                (
                    this.SecurityName == input.SecurityName ||
                    (this.SecurityName != null &&
                    this.SecurityName.Equals(input.SecurityName))
                ) && 
                (
                    this.CalcFromMethod == input.CalcFromMethod ||
                    (this.CalcFromMethod != null &&
                    this.CalcFromMethod.Equals(input.CalcFromMethod))
                ) && 
                (
                    this.CalcFromValue == input.CalcFromValue ||
                    this.CalcFromValue.Equals(input.CalcFromValue)
                ) && 
                (
                    this.Prepay == input.Prepay ||
                    (this.Prepay != null &&
                    this.Prepay.Equals(input.Prepay))
                ) && 
                (
                    this.Settlement == input.Settlement ||
                    (this.Settlement != null &&
                    this.Settlement.Equals(input.Settlement))
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
                if (this.SecurityType != null)
                {
                    hashCode = (hashCode * 59) + this.SecurityType.GetHashCode();
                }
                if (this.SecurityName != null)
                {
                    hashCode = (hashCode * 59) + this.SecurityName.GetHashCode();
                }
                if (this.CalcFromMethod != null)
                {
                    hashCode = (hashCode * 59) + this.CalcFromMethod.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.CalcFromValue.GetHashCode();
                if (this.Prepay != null)
                {
                    hashCode = (hashCode * 59) + this.Prepay.GetHashCode();
                }
                if (this.Settlement != null)
                {
                    hashCode = (hashCode * 59) + this.Settlement.GetHashCode();
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
