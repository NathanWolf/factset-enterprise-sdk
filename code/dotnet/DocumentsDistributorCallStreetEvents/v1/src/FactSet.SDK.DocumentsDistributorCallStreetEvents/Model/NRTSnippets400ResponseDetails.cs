/*
 * Documents Distributor - CallStreet Events
 *
 * CallStreet Events contains all the Documents Distributor APIs that offer events data such as Events Audio and Near Real-Time Transcripts.  The  Events Audio API provides access to historical as well as latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service. 
 *
 * The version of the OpenAPI document: 1.8.1
 * Contact: teamustang@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.DocumentsDistributorCallStreetEvents.Client.OpenAPIDateConverter;

namespace FactSet.SDK.DocumentsDistributorCallStreetEvents.Model
{
    /// <summary>
    /// NRTSnippets400ResponseDetails
    /// </summary>
    [DataContract(Name = "NRT_Snippets_400_Response_details")]
    public partial class NRTSnippets400ResponseDetails : IEquatable<NRTSnippets400ResponseDetails>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NRTSnippets400ResponseDetails" /> class.
        /// </summary>
        /// <param name="validParameters">validParameters.</param>
        public NRTSnippets400ResponseDetails(NRTSnippets400ResponseDetailsValidParameters validParameters = default(NRTSnippets400ResponseDetailsValidParameters))
        {
            this.ValidParameters = validParameters;
        }

        /// <summary>
        /// Gets or Sets ValidParameters
        /// </summary>
        [DataMember(Name = "validParameters", EmitDefaultValue = false)]
        public NRTSnippets400ResponseDetailsValidParameters ValidParameters { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NRTSnippets400ResponseDetails {\n");
            sb.Append("  ValidParameters: ").Append(ValidParameters).Append("\n");
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
            return this.Equals(input as NRTSnippets400ResponseDetails);
        }

        /// <summary>
        /// Returns true if NRTSnippets400ResponseDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of NRTSnippets400ResponseDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NRTSnippets400ResponseDetails input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ValidParameters == input.ValidParameters ||
                    (this.ValidParameters != null &&
                    this.ValidParameters.Equals(input.ValidParameters))
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
                if (this.ValidParameters != null)
                {
                    hashCode = (hashCode * 59) + this.ValidParameters.GetHashCode();
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
