/*
 * FactSet RIBCS
 *
 * FactSet Revere Business Industry Classification System (RBICS) is a comprehensive structured taxonomy to classify companies by what they primarily do. It delivers a granular view for investors by classifying companies using a bottom-up approach according to the products and services they provide. By combining this approach with a top-level grouping based on companies' behavior similarities and stock co-movement, FactSet RBICS delivers unprecedented precision for 1,400+ sector groups.  RBICS Focus is a six level classification which highlights the companys main business. It is based on the company business line/s that stand for majority of a the revenue that the company generates. Updated monthly. For more details, visit [Online Assitant Page #20710](https://oa.apps.factset.com/pages/20710). 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetRBICS.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetRBICS.Model
{
    /// <summary>
    /// Entity Focus Request Body
    /// </summary>
    [DataContract(Name = "entityFocusRequest")]
    public partial class EntityFocusRequest : IEquatable<EntityFocusRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityFocusRequest" /> class.
        /// </summary>
        /// <param name="ids">Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. Max Ids of 2500. .</param>
        /// <param name="date">Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. .</param>
        /// <param name="levels">List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.** .</param>
        /// <param name="includeNames">Option to include or exclude industry Names and the L6 Description. True &#x3D; Include Names; False &#x3D; Exclude Names.  (default to true).</param>
        public EntityFocusRequest(List<string> ids = default(List<string>), string date = default(string), List<int> levels = default(List<int>), bool includeNames = true)
        {
            this.Ids = ids;
            this.Date = date;
            this.Levels = levels;
            this.IncludeNames = includeNames;
        }

        /// <summary>
        /// Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. Max Ids of 2500. 
        /// </summary>
        /// <value>Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. Max Ids of 2500. </value>
        [DataMember(Name = "ids", EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. 
        /// </summary>
        /// <value>Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. </value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        public string Date { get; set; }

        /// <summary>
        /// List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.** 
        /// </summary>
        /// <value>List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.** </value>
        [DataMember(Name = "levels", EmitDefaultValue = false)]
        public List<int> Levels { get; set; }

        /// <summary>
        /// Option to include or exclude industry Names and the L6 Description. True &#x3D; Include Names; False &#x3D; Exclude Names. 
        /// </summary>
        /// <value>Option to include or exclude industry Names and the L6 Description. True &#x3D; Include Names; False &#x3D; Exclude Names. </value>
        [DataMember(Name = "includeNames", EmitDefaultValue = true)]
        public bool IncludeNames { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EntityFocusRequest {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Levels: ").Append(Levels).Append("\n");
            sb.Append("  IncludeNames: ").Append(IncludeNames).Append("\n");
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
            return this.Equals(input as EntityFocusRequest);
        }

        /// <summary>
        /// Returns true if EntityFocusRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of EntityFocusRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityFocusRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.Levels == input.Levels ||
                    this.Levels != null &&
                    input.Levels != null &&
                    this.Levels.SequenceEqual(input.Levels)
                ) && 
                (
                    this.IncludeNames == input.IncludeNames ||
                    this.IncludeNames.Equals(input.IncludeNames)
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
                if (this.Ids != null)
                    hashCode = hashCode * 59 + this.Ids.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.Levels != null)
                    hashCode = hashCode * 59 + this.Levels.GetHashCode();
                hashCode = hashCode * 59 + this.IncludeNames.GetHashCode();
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
