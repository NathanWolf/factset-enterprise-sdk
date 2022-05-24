/*
 * FactSet Ownership API
 *
 * FactSet’s Fund Ownership API gives access to both **Holdings** and **Holders** data.<p> Factset's Holdings endpoints gives access to all the underlying securities and their position detils held within a given fund. Fund Types supported include Open-End Mutual Funds, Closed-end Mutual Funds, and Exchange Traded Funds. Security Holders information retrieves all \"holder types\" and their positions across institutions, funds, insiders, and stakeholders.</p><p>The FactSet Ownership and Mutual Funds database collects global equity ownership data for approximately 50,000 institutions, 60,000 unique Mutual Fund portfolios, and 400,000 Insider/Stake holders from around 110 countries.  For more details review our [Data Collection](https://my.apps.factset.com/oa/cms/oaAttachment/87e162be-f2d1-4f40-a85b-bfb1b020d270/20079) methodology. </p> 
 *
 * The version of the OpenAPI document: 1.1.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetOwnership.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetOwnership.Model
{
    /// <summary>
    /// Security Holders response object
    /// </summary>
    [DataContract(Name = "securityHolders")]
    public partial class SecurityHolders : IEquatable<SecurityHolders>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityHolders" /> class.
        /// </summary>
        /// <param name="holderId">FactSet Ownership Holders ID that corresponds to the requested security holder..</param>
        /// <param name="fsymId">FactSet Security Identifier of security requested. This does not represent the FactSet permanent identifier for the holder, but rather the requested id. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier..</param>
        /// <param name="holderEntityId">FactSet Entity ID that corresponds to the specified holder ID..</param>
        /// <param name="holderName">Name of the holder for the requested security identifier..</param>
        /// <param name="date">Date of the reported holding in YYYY-MM-DD format. For more details regarding date resolution, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262)..</param>
        /// <param name="currency">Currency code. The service will default to the local currency if the currency is not requested. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        /// <param name="investorType">FactSet Ownership Institution, Mutual Fund, and Insider/Stakeholder investor types. To learn more about the different investor types, visit [Online Assistant Page #11656](https://my.apps.factset.com/oa/pages/11656)..</param>
        /// <param name="holderType">Holder Type name of the respective holder object. The name will align to the holderType requested. .</param>
        /// <param name="adjHolding">Adjusted number of shares held. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262)..</param>
        /// <param name="adjMarketValue">Adjusted market values of shares held. Market Value. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262)..</param>
        /// <param name="weightClose">\&quot;Closing weight of the security for the holders of the requested security (percent). To learn more about how ownership weight is calculated please visit [Online Assistant Page #11247](https://my.apps.factset.com/oa/pages/11247).\&quot; .</param>
        /// <param name="percentOutstanding">The percent of the outstanding common shares held by a particular filing institution. To learn more, visit [Online Assistant Page #11041](https://my.apps.factset.com/oa/pages/11041)..</param>
        /// <param name="source">Either the 13F Form or ND-30D report filed where the security holdings data was sourced from. To learn more about source, please visit https://my.apps.factset.com/oa/pages/11260.</param>
        /// <param name="requestId">Security Identifier that was used in the request. .</param>
        public SecurityHolders(string holderId = default(string), string fsymId = default(string), string holderEntityId = default(string), string holderName = default(string), DateTime date = default(DateTime), string currency = default(string), string investorType = default(string), string holderType = default(string), double adjHolding = default(double), double adjMarketValue = default(double), double weightClose = default(double), double percentOutstanding = default(double), string source = default(string), string requestId = default(string))
        {
            this.HolderId = holderId;
            this.FsymId = fsymId;
            this.HolderEntityId = holderEntityId;
            this.HolderName = holderName;
            this.Date = date;
            this.Currency = currency;
            this.InvestorType = investorType;
            this.HolderType = holderType;
            this.AdjHolding = adjHolding;
            this.AdjMarketValue = adjMarketValue;
            this.WeightClose = weightClose;
            this.PercentOutstanding = percentOutstanding;
            this.Source = source;
            this.RequestId = requestId;
        }

        /// <summary>
        /// FactSet Ownership Holders ID that corresponds to the requested security holder.
        /// </summary>
        /// <value>FactSet Ownership Holders ID that corresponds to the requested security holder.</value>
        [DataMember(Name = "holderId", EmitDefaultValue = false)]
        public string HolderId { get; set; }

        /// <summary>
        /// FactSet Security Identifier of security requested. This does not represent the FactSet permanent identifier for the holder, but rather the requested id. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier.
        /// </summary>
        /// <value>FactSet Security Identifier of security requested. This does not represent the FactSet permanent identifier for the holder, but rather the requested id. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// FactSet Entity ID that corresponds to the specified holder ID.
        /// </summary>
        /// <value>FactSet Entity ID that corresponds to the specified holder ID.</value>
        [DataMember(Name = "holderEntityId", EmitDefaultValue = false)]
        public string HolderEntityId { get; set; }

        /// <summary>
        /// Name of the holder for the requested security identifier.
        /// </summary>
        /// <value>Name of the holder for the requested security identifier.</value>
        [DataMember(Name = "holderName", EmitDefaultValue = false)]
        public string HolderName { get; set; }

        /// <summary>
        /// Date of the reported holding in YYYY-MM-DD format. For more details regarding date resolution, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).
        /// </summary>
        /// <value>Date of the reported holding in YYYY-MM-DD format. For more details regarding date resolution, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// Currency code. The service will default to the local currency if the currency is not requested. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency code. The service will default to the local currency if the currency is not requested. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// FactSet Ownership Institution, Mutual Fund, and Insider/Stakeholder investor types. To learn more about the different investor types, visit [Online Assistant Page #11656](https://my.apps.factset.com/oa/pages/11656).
        /// </summary>
        /// <value>FactSet Ownership Institution, Mutual Fund, and Insider/Stakeholder investor types. To learn more about the different investor types, visit [Online Assistant Page #11656](https://my.apps.factset.com/oa/pages/11656).</value>
        [DataMember(Name = "investorType", EmitDefaultValue = false)]
        public string InvestorType { get; set; }

        /// <summary>
        /// Holder Type name of the respective holder object. The name will align to the holderType requested. 
        /// </summary>
        /// <value>Holder Type name of the respective holder object. The name will align to the holderType requested. </value>
        [DataMember(Name = "holderType", EmitDefaultValue = false)]
        public string HolderType { get; set; }

        /// <summary>
        /// Adjusted number of shares held. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).
        /// </summary>
        /// <value>Adjusted number of shares held. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).</value>
        [DataMember(Name = "adjHolding", EmitDefaultValue = false)]
        public double AdjHolding { get; set; }

        /// <summary>
        /// Adjusted market values of shares held. Market Value. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).
        /// </summary>
        /// <value>Adjusted market values of shares held. Market Value. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).</value>
        [DataMember(Name = "adjMarketValue", EmitDefaultValue = false)]
        public double AdjMarketValue { get; set; }

        /// <summary>
        /// \&quot;Closing weight of the security for the holders of the requested security (percent). To learn more about how ownership weight is calculated please visit [Online Assistant Page #11247](https://my.apps.factset.com/oa/pages/11247).\&quot; 
        /// </summary>
        /// <value>\&quot;Closing weight of the security for the holders of the requested security (percent). To learn more about how ownership weight is calculated please visit [Online Assistant Page #11247](https://my.apps.factset.com/oa/pages/11247).\&quot; </value>
        [DataMember(Name = "weightClose", EmitDefaultValue = false)]
        public double WeightClose { get; set; }

        /// <summary>
        /// The percent of the outstanding common shares held by a particular filing institution. To learn more, visit [Online Assistant Page #11041](https://my.apps.factset.com/oa/pages/11041).
        /// </summary>
        /// <value>The percent of the outstanding common shares held by a particular filing institution. To learn more, visit [Online Assistant Page #11041](https://my.apps.factset.com/oa/pages/11041).</value>
        [DataMember(Name = "percentOutstanding", EmitDefaultValue = false)]
        public double PercentOutstanding { get; set; }

        /// <summary>
        /// Either the 13F Form or ND-30D report filed where the security holdings data was sourced from. To learn more about source, please visit https://my.apps.factset.com/oa/pages/11260
        /// </summary>
        /// <value>Either the 13F Form or ND-30D report filed where the security holdings data was sourced from. To learn more about source, please visit https://my.apps.factset.com/oa/pages/11260</value>
        [DataMember(Name = "source", EmitDefaultValue = false)]
        public string Source { get; set; }

        /// <summary>
        /// Security Identifier that was used in the request. 
        /// </summary>
        /// <value>Security Identifier that was used in the request. </value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SecurityHolders {\n");
            sb.Append("  HolderId: ").Append(HolderId).Append("\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  HolderEntityId: ").Append(HolderEntityId).Append("\n");
            sb.Append("  HolderName: ").Append(HolderName).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  InvestorType: ").Append(InvestorType).Append("\n");
            sb.Append("  HolderType: ").Append(HolderType).Append("\n");
            sb.Append("  AdjHolding: ").Append(AdjHolding).Append("\n");
            sb.Append("  AdjMarketValue: ").Append(AdjMarketValue).Append("\n");
            sb.Append("  WeightClose: ").Append(WeightClose).Append("\n");
            sb.Append("  PercentOutstanding: ").Append(PercentOutstanding).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
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
            return this.Equals(input as SecurityHolders);
        }

        /// <summary>
        /// Returns true if SecurityHolders instances are equal
        /// </summary>
        /// <param name="input">Instance of SecurityHolders to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecurityHolders input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.HolderId == input.HolderId ||
                    (this.HolderId != null &&
                    this.HolderId.Equals(input.HolderId))
                ) && 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.HolderEntityId == input.HolderEntityId ||
                    (this.HolderEntityId != null &&
                    this.HolderEntityId.Equals(input.HolderEntityId))
                ) && 
                (
                    this.HolderName == input.HolderName ||
                    (this.HolderName != null &&
                    this.HolderName.Equals(input.HolderName))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.InvestorType == input.InvestorType ||
                    (this.InvestorType != null &&
                    this.InvestorType.Equals(input.InvestorType))
                ) && 
                (
                    this.HolderType == input.HolderType ||
                    (this.HolderType != null &&
                    this.HolderType.Equals(input.HolderType))
                ) && 
                (
                    this.AdjHolding == input.AdjHolding ||
                    this.AdjHolding.Equals(input.AdjHolding)
                ) && 
                (
                    this.AdjMarketValue == input.AdjMarketValue ||
                    this.AdjMarketValue.Equals(input.AdjMarketValue)
                ) && 
                (
                    this.WeightClose == input.WeightClose ||
                    this.WeightClose.Equals(input.WeightClose)
                ) && 
                (
                    this.PercentOutstanding == input.PercentOutstanding ||
                    this.PercentOutstanding.Equals(input.PercentOutstanding)
                ) && 
                (
                    this.Source == input.Source ||
                    (this.Source != null &&
                    this.Source.Equals(input.Source))
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
                if (this.HolderId != null)
                {
                    hashCode = (hashCode * 59) + this.HolderId.GetHashCode();
                }
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.HolderEntityId != null)
                {
                    hashCode = (hashCode * 59) + this.HolderEntityId.GetHashCode();
                }
                if (this.HolderName != null)
                {
                    hashCode = (hashCode * 59) + this.HolderName.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.InvestorType != null)
                {
                    hashCode = (hashCode * 59) + this.InvestorType.GetHashCode();
                }
                if (this.HolderType != null)
                {
                    hashCode = (hashCode * 59) + this.HolderType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.AdjHolding.GetHashCode();
                hashCode = (hashCode * 59) + this.AdjMarketValue.GetHashCode();
                hashCode = (hashCode * 59) + this.WeightClose.GetHashCode();
                hashCode = (hashCode * 59) + this.PercentOutstanding.GetHashCode();
                if (this.Source != null)
                {
                    hashCode = (hashCode * 59) + this.Source.GetHashCode();
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
