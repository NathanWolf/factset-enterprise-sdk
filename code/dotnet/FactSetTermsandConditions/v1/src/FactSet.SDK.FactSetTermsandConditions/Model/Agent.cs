/*
 * FactSet Terms & Conditions API
 *
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTermsandConditions.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTermsandConditions.Model
{
    /// <summary>
    /// Agent Data Items for a Fixed Income security.
    /// </summary>
    [DataContract(Name = "agent")]
    public partial class Agent : IEquatable<Agent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Agent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Agent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Agent" /> class.
        /// </summary>
        /// <param name="requestId">Security identifier used in the request. (required).</param>
        /// <param name="fsymId">FactSet Permanent Security Identifier. (required).</param>
        /// <param name="agentEntityId">FactSet Entity Identifier for the Agent. (required).</param>
        /// <param name="agentCommAmt">Agent Commitment Amount.</param>
        /// <param name="agentName">Agent Name.</param>
        /// <param name="agentType">Role of the agent.</param>
        public Agent(string requestId = default(string), string fsymId = default(string), string agentEntityId = default(string), double agentCommAmt = default(double), string agentName = default(string), string agentType = default(string))
        {
            // to ensure "requestId" is required (not null)
            if (requestId == null) {
                throw new ArgumentNullException("requestId is a required property for Agent and cannot be null");
            }
            this.RequestId = requestId;
            // to ensure "fsymId" is required (not null)
            if (fsymId == null) {
                throw new ArgumentNullException("fsymId is a required property for Agent and cannot be null");
            }
            this.FsymId = fsymId;
            // to ensure "agentEntityId" is required (not null)
            if (agentEntityId == null) {
                throw new ArgumentNullException("agentEntityId is a required property for Agent and cannot be null");
            }
            this.AgentEntityId = agentEntityId;
            this.AgentCommAmt = agentCommAmt;
            this.AgentName = agentName;
            this.AgentType = agentType;
        }

        /// <summary>
        /// Security identifier used in the request.
        /// </summary>
        /// <value>Security identifier used in the request.</value>
        [DataMember(Name = "requestId", IsRequired = true, EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// FactSet Permanent Security Identifier.
        /// </summary>
        /// <value>FactSet Permanent Security Identifier.</value>
        [DataMember(Name = "fsymId", IsRequired = true, EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// FactSet Entity Identifier for the Agent.
        /// </summary>
        /// <value>FactSet Entity Identifier for the Agent.</value>
        [DataMember(Name = "agentEntityId", IsRequired = true, EmitDefaultValue = false)]
        public string AgentEntityId { get; set; }

        /// <summary>
        /// Agent Commitment Amount
        /// </summary>
        /// <value>Agent Commitment Amount</value>
        [DataMember(Name = "agentCommAmt", EmitDefaultValue = false)]
        public double AgentCommAmt { get; set; }

        /// <summary>
        /// Agent Name
        /// </summary>
        /// <value>Agent Name</value>
        [DataMember(Name = "agentName", EmitDefaultValue = false)]
        public string AgentName { get; set; }

        /// <summary>
        /// Role of the agent
        /// </summary>
        /// <value>Role of the agent</value>
        [DataMember(Name = "agentType", EmitDefaultValue = false)]
        public string AgentType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Agent {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  AgentEntityId: ").Append(AgentEntityId).Append("\n");
            sb.Append("  AgentCommAmt: ").Append(AgentCommAmt).Append("\n");
            sb.Append("  AgentName: ").Append(AgentName).Append("\n");
            sb.Append("  AgentType: ").Append(AgentType).Append("\n");
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
            return this.Equals(input as Agent);
        }

        /// <summary>
        /// Returns true if Agent instances are equal
        /// </summary>
        /// <param name="input">Instance of Agent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Agent input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.AgentEntityId == input.AgentEntityId ||
                    (this.AgentEntityId != null &&
                    this.AgentEntityId.Equals(input.AgentEntityId))
                ) && 
                (
                    this.AgentCommAmt == input.AgentCommAmt ||
                    this.AgentCommAmt.Equals(input.AgentCommAmt)
                ) && 
                (
                    this.AgentName == input.AgentName ||
                    (this.AgentName != null &&
                    this.AgentName.Equals(input.AgentName))
                ) && 
                (
                    this.AgentType == input.AgentType ||
                    (this.AgentType != null &&
                    this.AgentType.Equals(input.AgentType))
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
                if (this.RequestId != null)
                    hashCode = hashCode * 59 + this.RequestId.GetHashCode();
                if (this.FsymId != null)
                    hashCode = hashCode * 59 + this.FsymId.GetHashCode();
                if (this.AgentEntityId != null)
                    hashCode = hashCode * 59 + this.AgentEntityId.GetHashCode();
                hashCode = hashCode * 59 + this.AgentCommAmt.GetHashCode();
                if (this.AgentName != null)
                    hashCode = hashCode * 59 + this.AgentName.GetHashCode();
                if (this.AgentType != null)
                    hashCode = hashCode * 59 + this.AgentType.GetHashCode();
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
