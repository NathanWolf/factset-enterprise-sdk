/*
 * FI API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.9.0
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
using OpenAPIDateConverter = FactSet.SDK.FixedIncomeCalculation.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FixedIncomeCalculation.Model
{
    /// <summary>
    /// FIJobSettings
    /// </summary>
    [DataContract(Name = "FIJobSettings")]
    public partial class FIJobSettings : IEquatable<FIJobSettings>, IValidatableObject
    {
        /// <summary>
        /// Call Method
        /// </summary>
        /// <value>Call Method</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CallMethodEnum
        {
            /// <summary>
            /// Enum NoCall for value: No Call
            /// </summary>
            [EnumMember(Value = "No Call")]
            NoCall = 1,

            /// <summary>
            /// Enum IntrinsicValue for value: Intrinsic Value
            /// </summary>
            [EnumMember(Value = "Intrinsic Value")]
            IntrinsicValue = 2,

            /// <summary>
            /// Enum FirstCall for value: First Call
            /// </summary>
            [EnumMember(Value = "First Call")]
            FirstCall = 3,

            /// <summary>
            /// Enum FirstPar for value: First Par
            /// </summary>
            [EnumMember(Value = "First Par")]
            FirstPar = 4

        }


        /// <summary>
        /// Call Method
        /// </summary>
        /// <value>Call Method</value>
        [DataMember(Name = "callMethod", EmitDefaultValue = true)]
        public CallMethodEnum? CallMethod { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FIJobSettings" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FIJobSettings() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FIJobSettings" /> class.
        /// </summary>
        /// <param name="asOfDate">As of date (required).</param>
        /// <param name="partialDurationMonths">Partial duration months.</param>
        /// <param name="callMethod">Call Method.</param>
        /// <param name="settlement">Settlement Date.</param>
        /// <param name="calcFromMethod">Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix.</param>
        /// <param name="bankLoans">bankLoans.</param>
        /// <param name="municipalBonds">municipalBonds.</param>
        /// <param name="marketEnvironment">marketEnvironment.</param>
        /// <param name="structuredProducts">structuredProducts.</param>
        public FIJobSettings(string asOfDate,List<int> partialDurationMonths = default(List<int>), CallMethodEnum? callMethod = default(CallMethodEnum?), string settlement = default(string), string calcFromMethod = default(string), FIBankLoans bankLoans = default(FIBankLoans), FIMunicipalBondsForJobSettings municipalBonds = default(FIMunicipalBondsForJobSettings), FIMarketEnvironment marketEnvironment = default(FIMarketEnvironment), FIStructuredProductsForJobSettings structuredProducts = default(FIStructuredProductsForJobSettings))
        {
            // to ensure "asOfDate" is required (not null)
            if (asOfDate == null) {
                throw new ArgumentNullException("asOfDate is a required property for FIJobSettings and cannot be null");
            }
            this.AsOfDate = asOfDate;
            this.PartialDurationMonths = partialDurationMonths;
            this.CallMethod = callMethod;
            this.Settlement = settlement;
            this.CalcFromMethod = calcFromMethod;
            this.BankLoans = bankLoans;
            this.MunicipalBonds = municipalBonds;
            this.MarketEnvironment = marketEnvironment;
            this.StructuredProducts = structuredProducts;
        }

        /// <summary>
        /// As of date
        /// </summary>
        /// <value>As of date</value>
        [DataMember(Name = "asOfDate", IsRequired = true, EmitDefaultValue = false)]
        public string AsOfDate { get; set; }

        /// <summary>
        /// Partial duration months
        /// </summary>
        /// <value>Partial duration months</value>
        [DataMember(Name = "partialDurationMonths", EmitDefaultValue = true)]
        public List<int> PartialDurationMonths { get; set; }

        /// <summary>
        /// Settlement Date
        /// </summary>
        /// <value>Settlement Date</value>
        [DataMember(Name = "settlement", EmitDefaultValue = true)]
        public string Settlement { get; set; }

        /// <summary>
        /// Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix
        /// </summary>
        /// <value>Calculation Method.  Methods : Active Spread, Actual Spread, Actual Spread To Worst Call, OAS, Price, Yield, Yield To No Call, Act/Act Yield To No Call, Bond Equivalent Yield,  Yield To Worst Call, Discount Yield, Discount Margin, Implied Volatility, Bullet Spread, Bullet Spread To Worst Call, Pricing Matrix</value>
        [DataMember(Name = "calcFromMethod", EmitDefaultValue = true)]
        public string CalcFromMethod { get; set; }

        /// <summary>
        /// Gets or Sets BankLoans
        /// </summary>
        [DataMember(Name = "bankLoans", EmitDefaultValue = false)]
        public FIBankLoans BankLoans { get; set; }

        /// <summary>
        /// Gets or Sets MunicipalBonds
        /// </summary>
        [DataMember(Name = "municipalBonds", EmitDefaultValue = false)]
        public FIMunicipalBondsForJobSettings MunicipalBonds { get; set; }

        /// <summary>
        /// Gets or Sets MarketEnvironment
        /// </summary>
        [DataMember(Name = "marketEnvironment", EmitDefaultValue = false)]
        public FIMarketEnvironment MarketEnvironment { get; set; }

        /// <summary>
        /// Gets or Sets StructuredProducts
        /// </summary>
        [DataMember(Name = "structuredProducts", EmitDefaultValue = false)]
        public FIStructuredProductsForJobSettings StructuredProducts { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FIJobSettings {\n");
            sb.Append("  AsOfDate: ").Append(AsOfDate).Append("\n");
            sb.Append("  PartialDurationMonths: ").Append(PartialDurationMonths).Append("\n");
            sb.Append("  CallMethod: ").Append(CallMethod).Append("\n");
            sb.Append("  Settlement: ").Append(Settlement).Append("\n");
            sb.Append("  CalcFromMethod: ").Append(CalcFromMethod).Append("\n");
            sb.Append("  BankLoans: ").Append(BankLoans).Append("\n");
            sb.Append("  MunicipalBonds: ").Append(MunicipalBonds).Append("\n");
            sb.Append("  MarketEnvironment: ").Append(MarketEnvironment).Append("\n");
            sb.Append("  StructuredProducts: ").Append(StructuredProducts).Append("\n");
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
            return this.Equals(input as FIJobSettings);
        }

        /// <summary>
        /// Returns true if FIJobSettings instances are equal
        /// </summary>
        /// <param name="input">Instance of FIJobSettings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FIJobSettings input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AsOfDate == input.AsOfDate ||
                    (this.AsOfDate != null &&
                    this.AsOfDate.Equals(input.AsOfDate))
                ) && 
                (
                    this.PartialDurationMonths == input.PartialDurationMonths ||
                    this.PartialDurationMonths != null &&
                    input.PartialDurationMonths != null &&
                    this.PartialDurationMonths.SequenceEqual(input.PartialDurationMonths)
                ) && 
                (
                    this.CallMethod == input.CallMethod ||
                    this.CallMethod.Equals(input.CallMethod)
                ) && 
                (
                    this.Settlement == input.Settlement ||
                    (this.Settlement != null &&
                    this.Settlement.Equals(input.Settlement))
                ) && 
                (
                    this.CalcFromMethod == input.CalcFromMethod ||
                    (this.CalcFromMethod != null &&
                    this.CalcFromMethod.Equals(input.CalcFromMethod))
                ) && 
                (
                    this.BankLoans == input.BankLoans ||
                    (this.BankLoans != null &&
                    this.BankLoans.Equals(input.BankLoans))
                ) && 
                (
                    this.MunicipalBonds == input.MunicipalBonds ||
                    (this.MunicipalBonds != null &&
                    this.MunicipalBonds.Equals(input.MunicipalBonds))
                ) && 
                (
                    this.MarketEnvironment == input.MarketEnvironment ||
                    (this.MarketEnvironment != null &&
                    this.MarketEnvironment.Equals(input.MarketEnvironment))
                ) && 
                (
                    this.StructuredProducts == input.StructuredProducts ||
                    (this.StructuredProducts != null &&
                    this.StructuredProducts.Equals(input.StructuredProducts))
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
                if (this.AsOfDate != null)
                {
                    hashCode = (hashCode * 59) + this.AsOfDate.GetHashCode();
                }
                if (this.PartialDurationMonths != null)
                {
                    hashCode = (hashCode * 59) + this.PartialDurationMonths.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.CallMethod.GetHashCode();
                if (this.Settlement != null)
                {
                    hashCode = (hashCode * 59) + this.Settlement.GetHashCode();
                }
                if (this.CalcFromMethod != null)
                {
                    hashCode = (hashCode * 59) + this.CalcFromMethod.GetHashCode();
                }
                if (this.BankLoans != null)
                {
                    hashCode = (hashCode * 59) + this.BankLoans.GetHashCode();
                }
                if (this.MunicipalBonds != null)
                {
                    hashCode = (hashCode * 59) + this.MunicipalBonds.GetHashCode();
                }
                if (this.MarketEnvironment != null)
                {
                    hashCode = (hashCode * 59) + this.MarketEnvironment.GetHashCode();
                }
                if (this.StructuredProducts != null)
                {
                    hashCode = (hashCode * 59) + this.StructuredProducts.GetHashCode();
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
