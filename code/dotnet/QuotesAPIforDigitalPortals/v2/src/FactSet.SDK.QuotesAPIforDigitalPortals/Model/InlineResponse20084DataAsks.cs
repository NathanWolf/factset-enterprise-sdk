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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// InlineResponse20084DataAsks
    /// </summary>
    [DataContract(Name = "inline_response_200_84_data_asks")]
    public partial class InlineResponse20084DataAsks : IEquatable<InlineResponse20084DataAsks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20084DataAsks" /> class.
        /// </summary>
        /// <param name="id">Unique identifier of the order. Possible values depend on the values delivered by the supplier of the price information..</param>
        /// <param name="time">Date and time of the latest change..</param>
        /// <param name="type">Order type..</param>
        /// <param name="price">Price value. The value is 0 if the attribute &#x60;type&#x60; is 1 (market order). See attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for the unit of the price value\&quot;..</param>
        /// <param name="quoteCondition">Quote condition. Possible values depend on the values delivered by the supplier of the price information..</param>
        /// <param name="volume">Volume of the order..</param>
        /// <param name="marketMaker">Code of the market maker..</param>
        public InlineResponse20084DataAsks(string id = default(string), string time = default(string), decimal type = default(decimal), decimal price = default(decimal), string quoteCondition = default(string), decimal volume = default(decimal), string marketMaker = default(string))
        {
            this.Id = id;
            this.Time = time;
            this.Type = type;
            this.Price = price;
            this.QuoteCondition = quoteCondition;
            this.Volume = volume;
            this.MarketMaker = marketMaker;
        }

        /// <summary>
        /// Unique identifier of the order. Possible values depend on the values delivered by the supplier of the price information.
        /// </summary>
        /// <value>Unique identifier of the order. Possible values depend on the values delivered by the supplier of the price information.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Date and time of the latest change.
        /// </summary>
        /// <value>Date and time of the latest change.</value>
        [DataMember(Name = "time", EmitDefaultValue = false)]
        public string Time { get; set; }

        /// <summary>
        /// Order type.
        /// </summary>
        /// <value>Order type.</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public decimal Type { get; set; }

        /// <summary>
        /// Price value. The value is 0 if the attribute &#x60;type&#x60; is 1 (market order). See attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for the unit of the price value\&quot;.
        /// </summary>
        /// <value>Price value. The value is 0 if the attribute &#x60;type&#x60; is 1 (market order). See attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for the unit of the price value\&quot;.</value>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public decimal Price { get; set; }

        /// <summary>
        /// Quote condition. Possible values depend on the values delivered by the supplier of the price information.
        /// </summary>
        /// <value>Quote condition. Possible values depend on the values delivered by the supplier of the price information.</value>
        [DataMember(Name = "quoteCondition", EmitDefaultValue = false)]
        public string QuoteCondition { get; set; }

        /// <summary>
        /// Volume of the order.
        /// </summary>
        /// <value>Volume of the order.</value>
        [DataMember(Name = "volume", EmitDefaultValue = false)]
        public decimal Volume { get; set; }

        /// <summary>
        /// Code of the market maker.
        /// </summary>
        /// <value>Code of the market maker.</value>
        [DataMember(Name = "marketMaker", EmitDefaultValue = false)]
        public string MarketMaker { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse20084DataAsks {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  QuoteCondition: ").Append(QuoteCondition).Append("\n");
            sb.Append("  Volume: ").Append(Volume).Append("\n");
            sb.Append("  MarketMaker: ").Append(MarketMaker).Append("\n");
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
            return this.Equals(input as InlineResponse20084DataAsks);
        }

        /// <summary>
        /// Returns true if InlineResponse20084DataAsks instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20084DataAsks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20084DataAsks input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Time == input.Time ||
                    (this.Time != null &&
                    this.Time.Equals(input.Time))
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.Price == input.Price ||
                    this.Price.Equals(input.Price)
                ) && 
                (
                    this.QuoteCondition == input.QuoteCondition ||
                    (this.QuoteCondition != null &&
                    this.QuoteCondition.Equals(input.QuoteCondition))
                ) && 
                (
                    this.Volume == input.Volume ||
                    this.Volume.Equals(input.Volume)
                ) && 
                (
                    this.MarketMaker == input.MarketMaker ||
                    (this.MarketMaker != null &&
                    this.MarketMaker.Equals(input.MarketMaker))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Time != null)
                    hashCode = hashCode * 59 + this.Time.GetHashCode();
                hashCode = hashCode * 59 + this.Type.GetHashCode();
                hashCode = hashCode * 59 + this.Price.GetHashCode();
                if (this.QuoteCondition != null)
                    hashCode = hashCode * 59 + this.QuoteCondition.GetHashCode();
                hashCode = hashCode * 59 + this.Volume.GetHashCode();
                if (this.MarketMaker != null)
                    hashCode = hashCode * 59 + this.MarketMaker.GetHashCode();
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
