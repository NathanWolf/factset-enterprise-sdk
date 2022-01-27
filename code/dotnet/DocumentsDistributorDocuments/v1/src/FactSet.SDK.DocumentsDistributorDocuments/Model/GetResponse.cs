/*
 * Documents Distributor - Documents API
 *
 * Documents APIs that provide filings such as Global Filings and XML files such as StreetAccount    Global Filings API provides the capability to search and download filings documents from various exchanges around the world. The API also provides relevant metadata such as document source, company identifiers and form type around each filings document. Filings providers currently include EDGAR and SYMEX WebDisclosure.      StreetAccount XML API provides access to historical StreetAccount (SA) news. SA provides a summary for various corporate and market news written by journalist with background in financial markets.    The API delivers SA stories in XML format based on user-specified date input parameters. When the API request is completed, output files will be made available back to the users through a secure URL. This API has three endpoints (1) Request Files (2) Check Status (3) Get Files.   Files delivered contain both metadata and content body in each file. This eliminates the need to make multiple requests through multiple services to get all the information.  
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.DocumentsDistributorDocuments.Client.OpenAPIDateConverter;

namespace FactSet.SDK.DocumentsDistributorDocuments.Model
{
    /// <summary>
    /// GetResponse
    /// </summary>
    [DataContract(Name = "getResponse")]
    public partial class GetResponse : IEquatable<GetResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetResponse" /> class.
        /// </summary>
        /// <param name="product">Defines the name of the product.</param>
        /// <param name="startDate">The startDate from which the data is required in YYYY-MM-DDTHH:MM:SSZ format.</param>
        /// <param name="endDate">The endDate until which the data is fetched in YYYY-MM-DDTHH:MM:SSZ format.</param>
        /// <param name="jobID">Unique id to get the xml files for the requested date.</param>
        /// <param name="status">Defines the status of the request.</param>
        /// <param name="url">Link to download the zip file which contains xml files.</param>
        public GetResponse(string product = default(string), DateTime startDate = default(DateTime), DateTime endDate = default(DateTime), string jobID = default(string), string status = default(string), string url = default(string))
        {
            this.Product = product;
            this.StartDate = startDate;
            this.EndDate = endDate;
            this.JobID = jobID;
            this.Status = status;
            this.Url = url;
        }

        /// <summary>
        /// Defines the name of the product
        /// </summary>
        /// <value>Defines the name of the product</value>
        [DataMember(Name = "product", EmitDefaultValue = false)]
        public string Product { get; set; }

        /// <summary>
        /// The startDate from which the data is required in YYYY-MM-DDTHH:MM:SSZ format
        /// </summary>
        /// <value>The startDate from which the data is required in YYYY-MM-DDTHH:MM:SSZ format</value>
        [DataMember(Name = "startDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime StartDate { get; set; }

        /// <summary>
        /// The endDate until which the data is fetched in YYYY-MM-DDTHH:MM:SSZ format
        /// </summary>
        /// <value>The endDate until which the data is fetched in YYYY-MM-DDTHH:MM:SSZ format</value>
        [DataMember(Name = "endDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime EndDate { get; set; }

        /// <summary>
        /// Unique id to get the xml files for the requested date
        /// </summary>
        /// <value>Unique id to get the xml files for the requested date</value>
        [DataMember(Name = "jobID", EmitDefaultValue = false)]
        public string JobID { get; set; }

        /// <summary>
        /// Defines the status of the request
        /// </summary>
        /// <value>Defines the status of the request</value>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public string Status { get; set; }

        /// <summary>
        /// Link to download the zip file which contains xml files
        /// </summary>
        /// <value>Link to download the zip file which contains xml files</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetResponse {\n");
            sb.Append("  Product: ").Append(Product).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  JobID: ").Append(JobID).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
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
            return this.Equals(input as GetResponse);
        }

        /// <summary>
        /// Returns true if GetResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of GetResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Product == input.Product ||
                    (this.Product != null &&
                    this.Product.Equals(input.Product))
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.JobID == input.JobID ||
                    (this.JobID != null &&
                    this.JobID.Equals(input.JobID))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
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
                if (this.Product != null)
                    hashCode = hashCode * 59 + this.Product.GetHashCode();
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.JobID != null)
                    hashCode = hashCode * 59 + this.JobID.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.Url != null)
                    hashCode = hashCode * 59 + this.Url.GetHashCode();
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
