/*
 * Standard DataFeed (SDF) Download API
 *
 * [The Standard DataFeed (SDF) Download API](https://www.factset.com/marketplace/catalog/product/factset-standard-datafeed-download-api)  provides an alternative method for users to request and retrieve SDF packages (schemas & bundles).  This service is not a direct replacement and does not have 100% feature parity with the Loader Application.  This API provides an alternative for users who are unable to utilize the Loader application due to the following reasons:  * Inability to install 3rd party executables due to Corporate Security policies.  * Inability to utilize the Loader application due to limitations or restrictions with the environment used to consume Standard Datafeed.  * Clients who are utilizing existing delivery methods like FTP, who may want to use a more secure & modern solution.  This API allows users to retrieve  * Both SDF and the QFL (Quant Factor Library (Factor Family & Factor Groups)) packages they have subscriptions for, with data available since January 1, 1995.  Additional parameters are available to filter requests to get the exact files users are looking for.  QFL data is delivered through Content API & Bulk Data API (SDF API).  * Content API: Provides direct access to FactSet-hosted QFL data. Suitable for interactive, ad hoc QFL requests. Constraints on large extracts. Costs are based on consumption, i.e. more calls can result in more costs.  * Bulk Data API: Provides access to download locations of zip files for client download. Suitable for production processes within a client environment. Cost is based on the use case and fixed unless scope changes (same as other SDFs).  Please find all the content-related comprehensive documentation [here](https://my.apps.factset.com/oa/pages/15222). 
 *
 * The version of the OpenAPI document: 2.0.0
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
using OpenAPIDateConverter = FactSet.SDK.StandardDatafeed.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StandardDatafeed.Model
{
    /// <summary>
    /// SchemaDetailObject
    /// </summary>
    [DataContract(Name = "SchemaDetailObject")]
    public partial class SchemaDetailObject : IEquatable<SchemaDetailObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SchemaDetailObject" /> class.
        /// </summary>
        /// <param name="schema">Name of the schema..</param>
        /// <param name="version">Version number of the schema..</param>
        /// <param name="url">Pre-signed URL pointing to the location from where the schema details can be downloaded..</param>
        /// <param name="timestamp">Timestamp of when the schema version was last updated..</param>
        public SchemaDetailObject(string schema = default(string), int version = default(int), string url = default(string), DateTime timestamp = default(DateTime))
        {
            this.Schema = schema;
            this._Version = version;
            this.Url = url;
            this.Timestamp = timestamp;
        }

        /// <summary>
        /// Name of the schema.
        /// </summary>
        /// <value>Name of the schema.</value>
        [DataMember(Name = "schema", EmitDefaultValue = false)]
        public string Schema { get; set; }

        /// <summary>
        /// Version number of the schema.
        /// </summary>
        /// <value>Version number of the schema.</value>
        [DataMember(Name = "version", EmitDefaultValue = false)]
        public int _Version { get; set; }

        /// <summary>
        /// Pre-signed URL pointing to the location from where the schema details can be downloaded.
        /// </summary>
        /// <value>Pre-signed URL pointing to the location from where the schema details can be downloaded.</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Timestamp of when the schema version was last updated.
        /// </summary>
        /// <value>Timestamp of when the schema version was last updated.</value>
        [DataMember(Name = "timestamp", EmitDefaultValue = false)]
        public DateTime Timestamp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SchemaDetailObject {\n");
            sb.Append("  Schema: ").Append(Schema).Append("\n");
            sb.Append("  _Version: ").Append(_Version).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
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
            return this.Equals(input as SchemaDetailObject);
        }

        /// <summary>
        /// Returns true if SchemaDetailObject instances are equal
        /// </summary>
        /// <param name="input">Instance of SchemaDetailObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SchemaDetailObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Schema == input.Schema ||
                    (this.Schema != null &&
                    this.Schema.Equals(input.Schema))
                ) && 
                (
                    this._Version == input._Version ||
                    this._Version.Equals(input._Version)
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.Timestamp == input.Timestamp ||
                    (this.Timestamp != null &&
                    this.Timestamp.Equals(input.Timestamp))
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
                if (this.Schema != null)
                {
                    hashCode = (hashCode * 59) + this.Schema.GetHashCode();
                }
                hashCode = (hashCode * 59) + this._Version.GetHashCode();
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                if (this.Timestamp != null)
                {
                    hashCode = (hashCode * 59) + this.Timestamp.GetHashCode();
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
