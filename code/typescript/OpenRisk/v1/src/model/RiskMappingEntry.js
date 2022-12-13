/**
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.22.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import MappedSecurityInfo from './MappedSecurityInfo';
import RiskExclusionInfo from './RiskExclusionInfo';
import RiskExclusionInfoExclusionInfo from './RiskExclusionInfoExclusionInfo';

/**
 * The RiskMappingEntry model module.
 * @module model/RiskMappingEntry
 */
class RiskMappingEntry {
    /**
     * Constructs a new <code>RiskMappingEntry</code>.
     * Either risk model covered security resolution or uncovered security reason
     * @alias module:model/RiskMappingEntry
     * @implements module:model/MappedSecurityInfo
     * @implements module:model/RiskExclusionInfo
     * @param covered {Boolean} Coverage flag. The value will be false to indicate the security is excluded.
     * @param id {String} Risk model canonical security identifier alias if directly covered in the model
     * @param modelClass {module:model/RiskMappingEntry.ModelClassEnum} **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable
     * @param exclusionInfo {module:model/RiskExclusionInfoExclusionInfo} 
     */
    constructor(covered, id, modelClass, exclusionInfo) { 
        MappedSecurityInfo.initialize(this, covered, id, modelClass);RiskExclusionInfo.initialize(this, covered, exclusionInfo, modelClass);
        RiskMappingEntry.initialize(this, covered, id, modelClass, exclusionInfo);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, covered, id, modelClass, exclusionInfo) { 
        obj['covered'] = covered || false;
        obj['id'] = id;
        obj['modelClass'] = modelClass;
        obj['exclusionInfo'] = exclusionInfo;
    }

    /**
     * Constructs a <code>RiskMappingEntry</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RiskMappingEntry} obj Optional instance to populate.
     * @return {module:model/RiskMappingEntry} The populated <code>RiskMappingEntry</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RiskMappingEntry();
            MappedSecurityInfo.constructFromObject(data, obj);
            RiskExclusionInfo.constructFromObject(data, obj);

            if (data.hasOwnProperty('covered')) {
                obj['covered'] = ApiClient.convertToType(data['covered'], 'Boolean');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('modelClass')) {
                obj['modelClass'] = ApiClient.convertToType(data['modelClass'], 'String');
            }
            if (data.hasOwnProperty('exclusionInfo')) {
                obj['exclusionInfo'] = RiskExclusionInfoExclusionInfo.constructFromObject(data['exclusionInfo']);
            }
        }
        return obj;
    }


}

/**
 * Coverage flag. The value will be false to indicate the security is excluded.
 * @member {Boolean} covered
 * @default false
 */
RiskMappingEntry.prototype['covered'] = false;

/**
 * Risk model canonical security identifier alias if directly covered in the model
 * @member {String} id
 */
RiskMappingEntry.prototype['id'] = undefined;

/**
 * **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable
 * @member {module:model/RiskMappingEntry.ModelClassEnum} modelClass
 */
RiskMappingEntry.prototype['modelClass'] = undefined;

/**
 * @member {module:model/RiskExclusionInfoExclusionInfo} exclusionInfo
 */
RiskMappingEntry.prototype['exclusionInfo'] = undefined;


// Implement MappedSecurityInfo interface:
/**
 * Coverage flag. The value will be true to indicate the security is covered.
 * @member {Boolean} covered
 * @default true
 */
MappedSecurityInfo.prototype['covered'] = true;
/**
 * Risk model canonical security identifier alias if directly covered in the model
 * @member {String} id
 */
MappedSecurityInfo.prototype['id'] = undefined;
/**
 * **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable
 * @member {module:model/MappedSecurityInfo.ModelClassEnum} modelClass
 */
MappedSecurityInfo.prototype['modelClass'] = undefined;
// Implement RiskExclusionInfo interface:
/**
 * Coverage flag. The value will be false to indicate the security is excluded.
 * @member {Boolean} covered
 * @default false
 */
RiskExclusionInfo.prototype['covered'] = false;
/**
 * @member {module:model/RiskExclusionInfoExclusionInfo} exclusionInfo
 */
RiskExclusionInfo.prototype['exclusionInfo'] = undefined;
/**
 * **(since 1.19.0)** Security asset classification according to the risk model, if available and determinable
 * @member {module:model/RiskExclusionInfo.ModelClassEnum} modelClass
 */
RiskExclusionInfo.prototype['modelClass'] = undefined;



/**
 * Allowed values for the <code>modelClass</code> property.
 * @enum {String}
 * @readonly
 */
RiskMappingEntry['ModelClassEnum'] = {

    /**
     * value: "Unknown"
     * @const
     */
    "Unknown": "Unknown",

    /**
     * value: "CompositeAsset"
     * @const
     */
    "CompositeAsset": "CompositeAsset"
};



export default RiskMappingEntry;

