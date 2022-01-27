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
    /// Criteria that filter the items in the response list; only items that match all of the criteria are returned.
    /// </summary>
    [DataContract(Name = "_news_publisher_searchByName_data_filter")]
    public partial class NewsPublisherSearchByNameDataFilter : IEquatable<NewsPublisherSearchByNameDataFilter>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NewsPublisherSearchByNameDataFilter" /> class.
        /// </summary>
        /// <param name="distributor">distributor.</param>
        /// <param name="delivery">delivery.</param>
        public NewsPublisherSearchByNameDataFilter(NewsPublisherSearchByNameDataFilterDistributor distributor = default(NewsPublisherSearchByNameDataFilterDistributor), NewsPublisherSearchByNameDataFilterDelivery delivery = default(NewsPublisherSearchByNameDataFilterDelivery))
        {
            this.Distributor = distributor;
            this.Delivery = delivery;
        }

        /// <summary>
        /// Gets or Sets Distributor
        /// </summary>
        [DataMember(Name = "distributor", EmitDefaultValue = false)]
        public NewsPublisherSearchByNameDataFilterDistributor Distributor { get; set; }

        /// <summary>
        /// Gets or Sets Delivery
        /// </summary>
        [DataMember(Name = "delivery", EmitDefaultValue = false)]
        public NewsPublisherSearchByNameDataFilterDelivery Delivery { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NewsPublisherSearchByNameDataFilter {\n");
            sb.Append("  Distributor: ").Append(Distributor).Append("\n");
            sb.Append("  Delivery: ").Append(Delivery).Append("\n");
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
            return this.Equals(input as NewsPublisherSearchByNameDataFilter);
        }

        /// <summary>
        /// Returns true if NewsPublisherSearchByNameDataFilter instances are equal
        /// </summary>
        /// <param name="input">Instance of NewsPublisherSearchByNameDataFilter to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NewsPublisherSearchByNameDataFilter input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Distributor == input.Distributor ||
                    (this.Distributor != null &&
                    this.Distributor.Equals(input.Distributor))
                ) && 
                (
                    this.Delivery == input.Delivery ||
                    (this.Delivery != null &&
                    this.Delivery.Equals(input.Delivery))
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
                if (this.Distributor != null)
                    hashCode = hashCode * 59 + this.Distributor.GetHashCode();
                if (this.Delivery != null)
                    hashCode = hashCode * 59 + this.Delivery.GetHashCode();
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
