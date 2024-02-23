/*
 * FactSet Funds API
 *
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  
 *
 * The version of the OpenAPI document: 1.0.1
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFunds.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFunds.Model
{
    /// <summary>
    /// BenchmarkDetails
    /// </summary>
    [DataContract(Name = "benchmarkDetails")]
    public partial class BenchmarkDetails : IEquatable<BenchmarkDetails>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BenchmarkDetails" /> class.
        /// </summary>
        /// <param name="fsymId">FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested..</param>
        /// <param name="benchmarkId">The Fund&#39;s primary Benchmark Identifier..</param>
        /// <param name="benchmarkName">The proper name of the Benchmark Id..</param>
        /// <param name="multipleBenchmarkFlag">Indicates if the Fund has a composite benchmark..</param>
        /// <param name="benchmarkChangeDate">The date in which the benchmark changed for the requested fund in YYYY-MM-DD. If no benchmark changes occurred, the response value will be null..</param>
        /// <param name="segment">The segment of the respective segment benchmark id..</param>
        /// <param name="segmentBenchmarkId">Segment Benchmark Identifier. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system..</param>
        /// <param name="segmentBenchmarkName">The segment benchmark&#39;s name in proper format. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system..</param>
        /// <param name="segmentBenchmarkCurrency">The Segment Benchmark&#39;s currency in ISO3. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system..</param>
        /// <param name="segmentBenchmarkReturnType">The Segment benchmarks return type. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system..</param>
        /// <param name="requestId">The requested Id sent as input..</param>
        public BenchmarkDetails(string fsymId = default(string), string benchmarkId = default(string), string benchmarkName = default(string), string multipleBenchmarkFlag = default(string), DateTime? benchmarkChangeDate = default(DateTime?), string segment = default(string), string segmentBenchmarkId = default(string), string segmentBenchmarkName = default(string), string segmentBenchmarkCurrency = default(string), string segmentBenchmarkReturnType = default(string), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.BenchmarkId = benchmarkId;
            this.BenchmarkName = benchmarkName;
            this.MultipleBenchmarkFlag = multipleBenchmarkFlag;
            this.BenchmarkChangeDate = benchmarkChangeDate;
            this.Segment = segment;
            this.SegmentBenchmarkId = segmentBenchmarkId;
            this.SegmentBenchmarkName = segmentBenchmarkName;
            this.SegmentBenchmarkCurrency = segmentBenchmarkCurrency;
            this.SegmentBenchmarkReturnType = segmentBenchmarkReturnType;
            this.RequestId = requestId;
        }

        /// <summary>
        /// FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
        /// </summary>
        /// <value>FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// The Fund&#39;s primary Benchmark Identifier.
        /// </summary>
        /// <value>The Fund&#39;s primary Benchmark Identifier.</value>
        [DataMember(Name = "benchmarkId", EmitDefaultValue = true)]
        public string BenchmarkId { get; set; }

        /// <summary>
        /// The proper name of the Benchmark Id.
        /// </summary>
        /// <value>The proper name of the Benchmark Id.</value>
        [DataMember(Name = "benchmarkName", EmitDefaultValue = true)]
        public string BenchmarkName { get; set; }

        /// <summary>
        /// Indicates if the Fund has a composite benchmark.
        /// </summary>
        /// <value>Indicates if the Fund has a composite benchmark.</value>
        [DataMember(Name = "multipleBenchmarkFlag", EmitDefaultValue = true)]
        public string MultipleBenchmarkFlag { get; set; }

        /// <summary>
        /// The date in which the benchmark changed for the requested fund in YYYY-MM-DD. If no benchmark changes occurred, the response value will be null.
        /// </summary>
        /// <value>The date in which the benchmark changed for the requested fund in YYYY-MM-DD. If no benchmark changes occurred, the response value will be null.</value>
        [DataMember(Name = "benchmarkChangeDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? BenchmarkChangeDate { get; set; }

        /// <summary>
        /// The segment of the respective segment benchmark id.
        /// </summary>
        /// <value>The segment of the respective segment benchmark id.</value>
        [DataMember(Name = "segment", EmitDefaultValue = true)]
        public string Segment { get; set; }

        /// <summary>
        /// Segment Benchmark Identifier. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.
        /// </summary>
        /// <value>Segment Benchmark Identifier. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.</value>
        [DataMember(Name = "segmentBenchmarkId", EmitDefaultValue = true)]
        public string SegmentBenchmarkId { get; set; }

        /// <summary>
        /// The segment benchmark&#39;s name in proper format. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.
        /// </summary>
        /// <value>The segment benchmark&#39;s name in proper format. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.</value>
        [DataMember(Name = "segmentBenchmarkName", EmitDefaultValue = true)]
        public string SegmentBenchmarkName { get; set; }

        /// <summary>
        /// The Segment Benchmark&#39;s currency in ISO3. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.
        /// </summary>
        /// <value>The Segment Benchmark&#39;s currency in ISO3. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.</value>
        [DataMember(Name = "segmentBenchmarkCurrency", EmitDefaultValue = true)]
        public string SegmentBenchmarkCurrency { get; set; }

        /// <summary>
        /// The Segment benchmarks return type. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.
        /// </summary>
        /// <value>The Segment benchmarks return type. Funds in the same segment match on all seven levels of FactSet&#39;s fund classification system.</value>
        [DataMember(Name = "segmentBenchmarkReturnType", EmitDefaultValue = true)]
        public string SegmentBenchmarkReturnType { get; set; }

        /// <summary>
        /// The requested Id sent as input.
        /// </summary>
        /// <value>The requested Id sent as input.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BenchmarkDetails {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  BenchmarkId: ").Append(BenchmarkId).Append("\n");
            sb.Append("  BenchmarkName: ").Append(BenchmarkName).Append("\n");
            sb.Append("  MultipleBenchmarkFlag: ").Append(MultipleBenchmarkFlag).Append("\n");
            sb.Append("  BenchmarkChangeDate: ").Append(BenchmarkChangeDate).Append("\n");
            sb.Append("  Segment: ").Append(Segment).Append("\n");
            sb.Append("  SegmentBenchmarkId: ").Append(SegmentBenchmarkId).Append("\n");
            sb.Append("  SegmentBenchmarkName: ").Append(SegmentBenchmarkName).Append("\n");
            sb.Append("  SegmentBenchmarkCurrency: ").Append(SegmentBenchmarkCurrency).Append("\n");
            sb.Append("  SegmentBenchmarkReturnType: ").Append(SegmentBenchmarkReturnType).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
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
            return this.Equals(input as BenchmarkDetails);
        }

        /// <summary>
        /// Returns true if BenchmarkDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of BenchmarkDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BenchmarkDetails input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.BenchmarkId == input.BenchmarkId ||
                    (this.BenchmarkId != null &&
                    this.BenchmarkId.Equals(input.BenchmarkId))
                ) && 
                (
                    this.BenchmarkName == input.BenchmarkName ||
                    (this.BenchmarkName != null &&
                    this.BenchmarkName.Equals(input.BenchmarkName))
                ) && 
                (
                    this.MultipleBenchmarkFlag == input.MultipleBenchmarkFlag ||
                    (this.MultipleBenchmarkFlag != null &&
                    this.MultipleBenchmarkFlag.Equals(input.MultipleBenchmarkFlag))
                ) && 
                (
                    this.BenchmarkChangeDate == input.BenchmarkChangeDate ||
                    (this.BenchmarkChangeDate != null &&
                    this.BenchmarkChangeDate.Equals(input.BenchmarkChangeDate))
                ) && 
                (
                    this.Segment == input.Segment ||
                    (this.Segment != null &&
                    this.Segment.Equals(input.Segment))
                ) && 
                (
                    this.SegmentBenchmarkId == input.SegmentBenchmarkId ||
                    (this.SegmentBenchmarkId != null &&
                    this.SegmentBenchmarkId.Equals(input.SegmentBenchmarkId))
                ) && 
                (
                    this.SegmentBenchmarkName == input.SegmentBenchmarkName ||
                    (this.SegmentBenchmarkName != null &&
                    this.SegmentBenchmarkName.Equals(input.SegmentBenchmarkName))
                ) && 
                (
                    this.SegmentBenchmarkCurrency == input.SegmentBenchmarkCurrency ||
                    (this.SegmentBenchmarkCurrency != null &&
                    this.SegmentBenchmarkCurrency.Equals(input.SegmentBenchmarkCurrency))
                ) && 
                (
                    this.SegmentBenchmarkReturnType == input.SegmentBenchmarkReturnType ||
                    (this.SegmentBenchmarkReturnType != null &&
                    this.SegmentBenchmarkReturnType.Equals(input.SegmentBenchmarkReturnType))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
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
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.BenchmarkId != null)
                {
                    hashCode = (hashCode * 59) + this.BenchmarkId.GetHashCode();
                }
                if (this.BenchmarkName != null)
                {
                    hashCode = (hashCode * 59) + this.BenchmarkName.GetHashCode();
                }
                if (this.MultipleBenchmarkFlag != null)
                {
                    hashCode = (hashCode * 59) + this.MultipleBenchmarkFlag.GetHashCode();
                }
                if (this.BenchmarkChangeDate != null)
                {
                    hashCode = (hashCode * 59) + this.BenchmarkChangeDate.GetHashCode();
                }
                if (this.Segment != null)
                {
                    hashCode = (hashCode * 59) + this.Segment.GetHashCode();
                }
                if (this.SegmentBenchmarkId != null)
                {
                    hashCode = (hashCode * 59) + this.SegmentBenchmarkId.GetHashCode();
                }
                if (this.SegmentBenchmarkName != null)
                {
                    hashCode = (hashCode * 59) + this.SegmentBenchmarkName.GetHashCode();
                }
                if (this.SegmentBenchmarkCurrency != null)
                {
                    hashCode = (hashCode * 59) + this.SegmentBenchmarkCurrency.GetHashCode();
                }
                if (this.SegmentBenchmarkReturnType != null)
                {
                    hashCode = (hashCode * 59) + this.SegmentBenchmarkReturnType.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
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
