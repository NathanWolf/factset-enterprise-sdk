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
    /// ListSchemaObject
    /// </summary>
    [DataContract(Name = "ListSchemaObject")]
    public partial class ListSchemaObject : IEquatable<ListSchemaObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ListSchemaObject" /> class.
        /// </summary>
        /// <param name="schemaName">The name of the schema..</param>
        /// <param name="schemaVersion">The version of the schema..</param>
        public ListSchemaObject(string schemaName = default(string), string schemaVersion = default(string))
        {
            this.SchemaName = schemaName;
            this.SchemaVersion = schemaVersion;
        }

        /// <summary>
        /// The name of the schema.
        /// </summary>
        /// <value>The name of the schema.</value>
        [DataMember(Name = "schemaName", EmitDefaultValue = false)]
        public string SchemaName { get; set; }

        /// <summary>
        /// The version of the schema.
        /// </summary>
        /// <value>The version of the schema.</value>
        [DataMember(Name = "schemaVersion", EmitDefaultValue = false)]
        public string SchemaVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ListSchemaObject {\n");
            sb.Append("  SchemaName: ").Append(SchemaName).Append("\n");
            sb.Append("  SchemaVersion: ").Append(SchemaVersion).Append("\n");
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
            return this.Equals(input as ListSchemaObject);
        }

        /// <summary>
        /// Returns true if ListSchemaObject instances are equal
        /// </summary>
        /// <param name="input">Instance of ListSchemaObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ListSchemaObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.SchemaName == input.SchemaName ||
                    (this.SchemaName != null &&
                    this.SchemaName.Equals(input.SchemaName))
                ) && 
                (
                    this.SchemaVersion == input.SchemaVersion ||
                    (this.SchemaVersion != null &&
                    this.SchemaVersion.Equals(input.SchemaVersion))
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
                if (this.SchemaName != null)
                {
                    hashCode = (hashCode * 59) + this.SchemaName.GetHashCode();
                }
                if (this.SchemaVersion != null)
                {
                    hashCode = (hashCode * 59) + this.SchemaVersion.GetHashCode();
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
