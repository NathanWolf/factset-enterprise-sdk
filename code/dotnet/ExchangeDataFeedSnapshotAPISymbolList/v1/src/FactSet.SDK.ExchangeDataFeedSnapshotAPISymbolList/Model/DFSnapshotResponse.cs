/*
 * Exchange DataFeed Snapshot
 *
 * FactSet’s Exchange DataFeed Snapshot API provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 200 global exchanges and 150+ data fields. Asset types integrated include equities, futures, options, warrants, fixed income, mutual funds, ETFs, indices, commodities, and FX rates. <p>Cutting-edge technology ensures reliability and provides scalability that allow applications to request multiple items at a time. To simplify client-side development an entire response can be placed in a matrix or table for effortless integration into internal and external applications. Using specified output formats (CSV, XML, JSON) receive all standard fields by default or customize the list based on specific needs.</p></p>Below are the current hosts:</p><p>Production: api.factset.com<p>Sandbox: api-sandbox.factset.com</p>
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
using OpenAPIDateConverter = FactSet.SDK.ExchangeDataFeedSnapshotAPISymbolList.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ExchangeDataFeedSnapshotAPISymbolList.Model
{
    /// <summary>
    /// sample response
    /// </summary>
    [DataContract(Name = "DFSnapshot_Response")]
    public partial class DFSnapshotResponse : IEquatable<DFSnapshotResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DFSnapshotResponse" /> class.
        /// </summary>
        /// <param name="error">error value.</param>
        /// <param name="symbol1">first symbol from &#x60;ids&#x60; or &#x60;chain&#x60;.</param>
        /// <param name="host">host name.</param>
        /// <param name="symbol2">second symbol from &#x60;ids&#x60; or &#x60;chain&#x60; list.</param>
        public DFSnapshotResponse(int error = default(int), List<Fields> symbol1 = default(List<Fields>), string host = default(string), string symbol2 = default(string))
        {
            this.Error = error;
            this.Symbol1 = symbol1;
            this.Host = host;
            this.Symbol2 = symbol2;
        }

        /// <summary>
        /// error value
        /// </summary>
        /// <value>error value</value>
        [DataMember(Name = "Error", EmitDefaultValue = false)]
        public int Error { get; set; }

        /// <summary>
        /// first symbol from &#x60;ids&#x60; or &#x60;chain&#x60;
        /// </summary>
        /// <value>first symbol from &#x60;ids&#x60; or &#x60;chain&#x60;</value>
        [DataMember(Name = "symbol1", EmitDefaultValue = false)]
        public List<Fields> Symbol1 { get; set; }

        /// <summary>
        /// host name
        /// </summary>
        /// <value>host name</value>
        [DataMember(Name = "Host", EmitDefaultValue = false)]
        public string Host { get; set; }

        /// <summary>
        /// second symbol from &#x60;ids&#x60; or &#x60;chain&#x60; list
        /// </summary>
        /// <value>second symbol from &#x60;ids&#x60; or &#x60;chain&#x60; list</value>
        [DataMember(Name = "symbol2", EmitDefaultValue = false)]
        public string Symbol2 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DFSnapshotResponse {\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  Symbol1: ").Append(Symbol1).Append("\n");
            sb.Append("  Host: ").Append(Host).Append("\n");
            sb.Append("  Symbol2: ").Append(Symbol2).Append("\n");
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
            return this.Equals(input as DFSnapshotResponse);
        }

        /// <summary>
        /// Returns true if DFSnapshotResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of DFSnapshotResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DFSnapshotResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Error == input.Error ||
                    this.Error.Equals(input.Error)
                ) && 
                (
                    this.Symbol1 == input.Symbol1 ||
                    this.Symbol1 != null &&
                    input.Symbol1 != null &&
                    this.Symbol1.SequenceEqual(input.Symbol1)
                ) && 
                (
                    this.Host == input.Host ||
                    (this.Host != null &&
                    this.Host.Equals(input.Host))
                ) && 
                (
                    this.Symbol2 == input.Symbol2 ||
                    (this.Symbol2 != null &&
                    this.Symbol2.Equals(input.Symbol2))
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
                hashCode = (hashCode * 59) + this.Error.GetHashCode();
                if (this.Symbol1 != null)
                {
                    hashCode = (hashCode * 59) + this.Symbol1.GetHashCode();
                }
                if (this.Host != null)
                {
                    hashCode = (hashCode * 59) + this.Host.GetHashCode();
                }
                if (this.Symbol2 != null)
                {
                    hashCode = (hashCode * 59) + this.Symbol2.GetHashCode();
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
