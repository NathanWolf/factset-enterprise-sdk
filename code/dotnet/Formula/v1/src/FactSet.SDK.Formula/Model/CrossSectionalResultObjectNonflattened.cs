/*
 * FactSet Formula API
 *
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs. 
 *
 * The version of the OpenAPI document: 1.7.1
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
using OpenAPIDateConverter = FactSet.SDK.Formula.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Formula.Model
{
    /// <summary>
    /// An object returning the results for a single formula.
    /// </summary>
    [DataContract(Name = "cross_sectional_result_object_nonflattened")]
    public partial class CrossSectionalResultObjectNonflattened : IEquatable<CrossSectionalResultObjectNonflattened>, IValidatableObject
    {
        /// <summary>
        /// Data type of the data item
        /// </summary>
        /// <value>Data type of the data item</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DataTypeEnum
        {
            /// <summary>
            /// Enum STRING for value: STRING
            /// </summary>
            [EnumMember(Value = "STRING")]
            STRING = 1,

            /// <summary>
            /// Enum INTEGER for value: INTEGER
            /// </summary>
            [EnumMember(Value = "INTEGER")]
            INTEGER = 2,

            /// <summary>
            /// Enum DOUBLE for value: DOUBLE
            /// </summary>
            [EnumMember(Value = "DOUBLE")]
            DOUBLE = 3

        }


        /// <summary>
        /// Data type of the data item
        /// </summary>
        /// <value>Data type of the data item</value>
        [DataMember(Name = "dataType", IsRequired = true, EmitDefaultValue = false)]
        public DataTypeEnum DataType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CrossSectionalResultObjectNonflattened" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CrossSectionalResultObjectNonflattened() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CrossSectionalResultObjectNonflattened" /> class.
        /// </summary>
        /// <param name="universe">If &#x60;universe&#x60; is submitted instead of &#x60;ids&#x60;, then the universe attribute will display the universe expression requested..</param>
        /// <param name="dataItemName">Name of data item (requestId, requested Screening formula, or fsymId) (required).</param>
        /// <param name="displayName">Display Name..</param>
        /// <param name="result">result (required).</param>
        /// <param name="dataType">Data type of the data item (required).</param>
        /// <param name="error">Data item error indicator.  * Zero – success  * Non-zero – failure  (required).</param>
        /// <param name="errorMessage">If error is non-zero, errorMessage will display the Screening formula error..</param>
        /// <param name="warnings">Screening formula warnings. This attribute is only displayed if warnings are generated in the execution of the Screening formula..</param>
        public CrossSectionalResultObjectNonflattened(string dataItemName, List<CrossSectionalResultObjectNonflattenedResultAttribute> result, DataTypeEnum dataType, int error,string universe = default(string), string displayName = default(string), string errorMessage = default(string), List<CrossSectionalResultObjectNonflattenedWarnings> warnings = default(List<CrossSectionalResultObjectNonflattenedWarnings>))
        {
            // to ensure "dataItemName" is required (not null)
            if (dataItemName == null) {
                throw new ArgumentNullException("dataItemName is a required property for CrossSectionalResultObjectNonflattened and cannot be null");
            }
            this.DataItemName = dataItemName;
            // to ensure "result" is required (not null)
            if (result == null) {
                throw new ArgumentNullException("result is a required property for CrossSectionalResultObjectNonflattened and cannot be null");
            }
            this.Result = result;
            this.DataType = dataType;
            this.Error = error;
            this.Universe = universe;
            this.DisplayName = displayName;
            this.ErrorMessage = errorMessage;
            this.Warnings = warnings;
        }

        /// <summary>
        /// If &#x60;universe&#x60; is submitted instead of &#x60;ids&#x60;, then the universe attribute will display the universe expression requested.
        /// </summary>
        /// <value>If &#x60;universe&#x60; is submitted instead of &#x60;ids&#x60;, then the universe attribute will display the universe expression requested.</value>
        [DataMember(Name = "universe", EmitDefaultValue = false)]
        public string Universe { get; set; }

        /// <summary>
        /// Name of data item (requestId, requested Screening formula, or fsymId)
        /// </summary>
        /// <value>Name of data item (requestId, requested Screening formula, or fsymId)</value>
        [DataMember(Name = "dataItemName", IsRequired = true, EmitDefaultValue = false)]
        public string DataItemName { get; set; }

        /// <summary>
        /// Display Name.
        /// </summary>
        /// <value>Display Name.</value>
        [DataMember(Name = "displayName", EmitDefaultValue = true)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or Sets Result
        /// </summary>
        [DataMember(Name = "result", IsRequired = true, EmitDefaultValue = false)]
        public List<CrossSectionalResultObjectNonflattenedResultAttribute> Result { get; set; }

        /// <summary>
        /// Data item error indicator.  * Zero – success  * Non-zero – failure 
        /// </summary>
        /// <value>Data item error indicator.  * Zero – success  * Non-zero – failure </value>
        [DataMember(Name = "error", IsRequired = true, EmitDefaultValue = false)]
        public int Error { get; set; }

        /// <summary>
        /// If error is non-zero, errorMessage will display the Screening formula error.
        /// </summary>
        /// <value>If error is non-zero, errorMessage will display the Screening formula error.</value>
        [DataMember(Name = "errorMessage", EmitDefaultValue = true)]
        public string ErrorMessage { get; set; }

        /// <summary>
        /// Screening formula warnings. This attribute is only displayed if warnings are generated in the execution of the Screening formula.
        /// </summary>
        /// <value>Screening formula warnings. This attribute is only displayed if warnings are generated in the execution of the Screening formula.</value>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<CrossSectionalResultObjectNonflattenedWarnings> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CrossSectionalResultObjectNonflattened {\n");
            sb.Append("  Universe: ").Append(Universe).Append("\n");
            sb.Append("  DataItemName: ").Append(DataItemName).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
            sb.Append("  DataType: ").Append(DataType).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  ErrorMessage: ").Append(ErrorMessage).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
            return this.Equals(input as CrossSectionalResultObjectNonflattened);
        }

        /// <summary>
        /// Returns true if CrossSectionalResultObjectNonflattened instances are equal
        /// </summary>
        /// <param name="input">Instance of CrossSectionalResultObjectNonflattened to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CrossSectionalResultObjectNonflattened input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Universe == input.Universe ||
                    (this.Universe != null &&
                    this.Universe.Equals(input.Universe))
                ) && 
                (
                    this.DataItemName == input.DataItemName ||
                    (this.DataItemName != null &&
                    this.DataItemName.Equals(input.DataItemName))
                ) && 
                (
                    this.DisplayName == input.DisplayName ||
                    (this.DisplayName != null &&
                    this.DisplayName.Equals(input.DisplayName))
                ) && 
                (
                    this.Result == input.Result ||
                    this.Result != null &&
                    input.Result != null &&
                    this.Result.SequenceEqual(input.Result)
                ) && 
                (
                    this.DataType == input.DataType ||
                    this.DataType.Equals(input.DataType)
                ) && 
                (
                    this.Error == input.Error ||
                    this.Error.Equals(input.Error)
                ) && 
                (
                    this.ErrorMessage == input.ErrorMessage ||
                    (this.ErrorMessage != null &&
                    this.ErrorMessage.Equals(input.ErrorMessage))
                ) && 
                (
                    this.Warnings == input.Warnings ||
                    this.Warnings != null &&
                    input.Warnings != null &&
                    this.Warnings.SequenceEqual(input.Warnings)
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
                if (this.Universe != null)
                {
                    hashCode = (hashCode * 59) + this.Universe.GetHashCode();
                }
                if (this.DataItemName != null)
                {
                    hashCode = (hashCode * 59) + this.DataItemName.GetHashCode();
                }
                if (this.DisplayName != null)
                {
                    hashCode = (hashCode * 59) + this.DisplayName.GetHashCode();
                }
                if (this.Result != null)
                {
                    hashCode = (hashCode * 59) + this.Result.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.DataType.GetHashCode();
                hashCode = (hashCode * 59) + this.Error.GetHashCode();
                if (this.ErrorMessage != null)
                {
                    hashCode = (hashCode * 59) + this.ErrorMessage.GetHashCode();
                }
                if (this.Warnings != null)
                {
                    hashCode = (hashCode * 59) + this.Warnings.GetHashCode();
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
