/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
using OpenAPIDateConverter = FactSet.SDK.ETFProfileandPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ETFProfileandPrices.Model
{
    /// <summary>
    /// geography.
    /// </summary>
    [DataContract(Name = "inline_response_200_15_data_geography")]
    public partial class InlineResponse20015DataGeography : IEquatable<InlineResponse20015DataGeography>, IValidatableObject
    {
        /// <summary>
        /// The broad regional exposure of the ETP&#39;s holdings (e.g., Latin America, Asia-Pacific, Global), text and standardized value available. This data is available for all the regions.
        /// </summary>
        /// <value>The broad regional exposure of the ETP&#39;s holdings (e.g., Latin America, Asia-Pacific, Global), text and standardized value available. This data is available for all the regions.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RegionEnum
        {
            /// <summary>
            /// Enum Europe for value: Europe
            /// </summary>
            [EnumMember(Value = "Europe")]
            Europe = 1,

            /// <summary>
            /// Enum NorthAmerica for value: North America
            /// </summary>
            [EnumMember(Value = "North America")]
            NorthAmerica = 2,

            /// <summary>
            /// Enum Global for value: Global
            /// </summary>
            [EnumMember(Value = "Global")]
            Global = 3,

            /// <summary>
            /// Enum DevelopedMarkets for value: Developed Markets
            /// </summary>
            [EnumMember(Value = "Developed Markets")]
            DevelopedMarkets = 4,

            /// <summary>
            /// Enum AsiaPacific for value: Asia-Pacific
            /// </summary>
            [EnumMember(Value = "Asia-Pacific")]
            AsiaPacific = 5,

            /// <summary>
            /// Enum GlobalExUS for value: Global Ex-U.S.
            /// </summary>
            [EnumMember(Value = "Global Ex-U.S.")]
            GlobalExUS = 6,

            /// <summary>
            /// Enum EmergingMarkets for value: Emerging Markets
            /// </summary>
            [EnumMember(Value = "Emerging Markets")]
            EmergingMarkets = 7,

            /// <summary>
            /// Enum LatinAmerica for value: Latin America
            /// </summary>
            [EnumMember(Value = "Latin America")]
            LatinAmerica = 8,

            /// <summary>
            /// Enum MiddleEastAfrica for value: Middle East &amp; Africa
            /// </summary>
            [EnumMember(Value = "Middle East & Africa")]
            MiddleEastAfrica = 9,

            /// <summary>
            /// Enum FrontierMarkets for value: Frontier Markets
            /// </summary>
            [EnumMember(Value = "Frontier Markets")]
            FrontierMarkets = 10

        }


        /// <summary>
        /// The broad regional exposure of the ETP&#39;s holdings (e.g., Latin America, Asia-Pacific, Global), text and standardized value available. This data is available for all the regions.
        /// </summary>
        /// <value>The broad regional exposure of the ETP&#39;s holdings (e.g., Latin America, Asia-Pacific, Global), text and standardized value available. This data is available for all the regions.</value>
        [DataMember(Name = "region", EmitDefaultValue = false)]
        public RegionEnum? Region { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20015DataGeography" /> class.
        /// </summary>
        /// <param name="region">The broad regional exposure of the ETP&#39;s holdings (e.g., Latin America, Asia-Pacific, Global), text and standardized value available. This data is available for all the regions..</param>
        /// <param name="specific">The specific geographic exposure of the ETP&#39;s holdings (e.g., BRICs, Chile, Asia-Pacific Ex-Japan), text and standardized value available. This data is available for all the regions. See endpoint /factset/etf/class/geography/list for possible values.</param>
        public InlineResponse20015DataGeography(RegionEnum? region = default(RegionEnum?), string specific = default(string))
        {
            this.Region = region;
            this.Specific = specific;
        }

        /// <summary>
        /// The specific geographic exposure of the ETP&#39;s holdings (e.g., BRICs, Chile, Asia-Pacific Ex-Japan), text and standardized value available. This data is available for all the regions. See endpoint /factset/etf/class/geography/list for possible values
        /// </summary>
        /// <value>The specific geographic exposure of the ETP&#39;s holdings (e.g., BRICs, Chile, Asia-Pacific Ex-Japan), text and standardized value available. This data is available for all the regions. See endpoint /factset/etf/class/geography/list for possible values</value>
        [DataMember(Name = "specific", EmitDefaultValue = false)]
        public string Specific { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20015DataGeography {\n");
            sb.Append("  Region: ").Append(Region).Append("\n");
            sb.Append("  Specific: ").Append(Specific).Append("\n");
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
            return this.Equals(input as InlineResponse20015DataGeography);
        }

        /// <summary>
        /// Returns true if InlineResponse20015DataGeography instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20015DataGeography to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20015DataGeography input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Region == input.Region ||
                    this.Region.Equals(input.Region)
                ) && 
                (
                    this.Specific == input.Specific ||
                    (this.Specific != null &&
                    this.Specific.Equals(input.Specific))
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
                hashCode = (hashCode * 59) + this.Region.GetHashCode();
                if (this.Specific != null)
                {
                    hashCode = (hashCode * 59) + this.Specific.GetHashCode();
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
