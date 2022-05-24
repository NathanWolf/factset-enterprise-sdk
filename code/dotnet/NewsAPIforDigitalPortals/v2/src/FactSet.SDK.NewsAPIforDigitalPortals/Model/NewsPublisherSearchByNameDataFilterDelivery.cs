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
using OpenAPIDateConverter = FactSet.SDK.NewsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.NewsAPIforDigitalPortals.Model
{
    /// <summary>
    /// Filter for deliveries. See endpoint &#x60;/basic/delivery/list&#x60; for valid values.
    /// </summary>
    [DataContract(Name = "_news_publisher_searchByName_data_filter_delivery")]
    public partial class NewsPublisherSearchByNameDataFilterDelivery : IEquatable<NewsPublisherSearchByNameDataFilterDelivery>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NewsPublisherSearchByNameDataFilterDelivery" /> class.
        /// </summary>
        /// <param name="id">Identifier of delivery..</param>
        public NewsPublisherSearchByNameDataFilterDelivery(decimal id = default(decimal))
        {
            this.Id = id;
        }

        /// <summary>
        /// Identifier of delivery.
        /// </summary>
        /// <value>Identifier of delivery.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NewsPublisherSearchByNameDataFilterDelivery {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
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
            return this.Equals(input as NewsPublisherSearchByNameDataFilterDelivery);
        }

        /// <summary>
        /// Returns true if NewsPublisherSearchByNameDataFilterDelivery instances are equal
        /// </summary>
        /// <param name="input">Instance of NewsPublisherSearchByNameDataFilterDelivery to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NewsPublisherSearchByNameDataFilterDelivery input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    this.Id.Equals(input.Id)
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
                hashCode = (hashCode * 59) + this.Id.GetHashCode();
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
