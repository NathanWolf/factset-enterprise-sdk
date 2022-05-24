/*
 * fpo_mp_input
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.OptimizationEngineAPIMultiperiod.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OptimizationEngineAPIMultiperiod.Model
{
    /// <summary>
    /// 17
    /// </summary>
    [DataContract(Name = "optimizer.inputs.RiskContributionConstraint")]
    public partial class OptimizerInputsRiskContributionConstraint : IEquatable<OptimizerInputsRiskContributionConstraint>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerInputsRiskContributionConstraint" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="maxPercent">maxPercent.</param>
        /// <param name="customAsset">customAsset.</param>
        /// <param name="groups">groups.</param>
        /// <param name="level">level.</param>
        /// <param name="assetType">assetType.</param>
        /// <param name="riskType">riskType.</param>
        /// <param name="hierarchy">hierarchy.</param>
        public OptimizerInputsRiskContributionConstraint(string name = default(string), OptimizerInputsValue maxPercent = default(OptimizerInputsValue), OptimizerInputsValue customAsset = default(OptimizerInputsValue), List<OptimizerInputsConstraintGroup> groups = default(List<OptimizerInputsConstraintGroup>), OptimizerInputsEConstraintLevelEnum level = default(OptimizerInputsEConstraintLevelEnum), OptimizerInputsEFPOConstraintAssetTypeEnum assetType = default(OptimizerInputsEFPOConstraintAssetTypeEnum), OptimizerInputsEConstraintRiskTypeEnum riskType = default(OptimizerInputsEConstraintRiskTypeEnum), int hierarchy = default(int))
        {
            this.Name = name;
            this.MaxPercent = maxPercent;
            this.CustomAsset = customAsset;
            this.Groups = groups;
            this.Level = level;
            this.AssetType = assetType;
            this.RiskType = riskType;
            this.Hierarchy = hierarchy;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets MaxPercent
        /// </summary>
        [DataMember(Name = "max_percent", EmitDefaultValue = false)]
        public OptimizerInputsValue MaxPercent { get; set; }

        /// <summary>
        /// Gets or Sets CustomAsset
        /// </summary>
        [DataMember(Name = "custom_asset", EmitDefaultValue = false)]
        public OptimizerInputsValue CustomAsset { get; set; }

        /// <summary>
        /// Gets or Sets Groups
        /// </summary>
        [DataMember(Name = "groups", EmitDefaultValue = false)]
        public List<OptimizerInputsConstraintGroup> Groups { get; set; }

        /// <summary>
        /// Gets or Sets Level
        /// </summary>
        [DataMember(Name = "level", EmitDefaultValue = false)]
        public OptimizerInputsEConstraintLevelEnum Level { get; set; }

        /// <summary>
        /// Gets or Sets AssetType
        /// </summary>
        [DataMember(Name = "asset_type", EmitDefaultValue = false)]
        public OptimizerInputsEFPOConstraintAssetTypeEnum AssetType { get; set; }

        /// <summary>
        /// Gets or Sets RiskType
        /// </summary>
        [DataMember(Name = "risk_type", EmitDefaultValue = false)]
        public OptimizerInputsEConstraintRiskTypeEnum RiskType { get; set; }

        /// <summary>
        /// Gets or Sets Hierarchy
        /// </summary>
        [DataMember(Name = "hierarchy", EmitDefaultValue = false)]
        public int Hierarchy { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerInputsRiskContributionConstraint {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  MaxPercent: ").Append(MaxPercent).Append("\n");
            sb.Append("  CustomAsset: ").Append(CustomAsset).Append("\n");
            sb.Append("  Groups: ").Append(Groups).Append("\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
            sb.Append("  AssetType: ").Append(AssetType).Append("\n");
            sb.Append("  RiskType: ").Append(RiskType).Append("\n");
            sb.Append("  Hierarchy: ").Append(Hierarchy).Append("\n");
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
            return this.Equals(input as OptimizerInputsRiskContributionConstraint);
        }

        /// <summary>
        /// Returns true if OptimizerInputsRiskContributionConstraint instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerInputsRiskContributionConstraint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerInputsRiskContributionConstraint input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.MaxPercent == input.MaxPercent ||
                    (this.MaxPercent != null &&
                    this.MaxPercent.Equals(input.MaxPercent))
                ) && 
                (
                    this.CustomAsset == input.CustomAsset ||
                    (this.CustomAsset != null &&
                    this.CustomAsset.Equals(input.CustomAsset))
                ) && 
                (
                    this.Groups == input.Groups ||
                    this.Groups != null &&
                    input.Groups != null &&
                    this.Groups.SequenceEqual(input.Groups)
                ) && 
                (
                    this.Level == input.Level ||
                    (this.Level != null &&
                    this.Level.Equals(input.Level))
                ) && 
                (
                    this.AssetType == input.AssetType ||
                    (this.AssetType != null &&
                    this.AssetType.Equals(input.AssetType))
                ) && 
                (
                    this.RiskType == input.RiskType ||
                    (this.RiskType != null &&
                    this.RiskType.Equals(input.RiskType))
                ) && 
                (
                    this.Hierarchy == input.Hierarchy ||
                    this.Hierarchy.Equals(input.Hierarchy)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.MaxPercent != null)
                {
                    hashCode = (hashCode * 59) + this.MaxPercent.GetHashCode();
                }
                if (this.CustomAsset != null)
                {
                    hashCode = (hashCode * 59) + this.CustomAsset.GetHashCode();
                }
                if (this.Groups != null)
                {
                    hashCode = (hashCode * 59) + this.Groups.GetHashCode();
                }
                if (this.Level != null)
                {
                    hashCode = (hashCode * 59) + this.Level.GetHashCode();
                }
                if (this.AssetType != null)
                {
                    hashCode = (hashCode * 59) + this.AssetType.GetHashCode();
                }
                if (this.RiskType != null)
                {
                    hashCode = (hashCode * 59) + this.RiskType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Hierarchy.GetHashCode();
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
