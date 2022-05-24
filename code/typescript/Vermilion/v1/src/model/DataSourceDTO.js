/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import EntityDTO from './EntityDTO';

/**
 * The DataSourceDTO model module.
 * @module model/DataSourceDTO
 * @version 0.9.0
 */
class DataSourceDTO {
    /**
     * Constructs a new <code>DataSourceDTO</code>.
     * @alias module:model/DataSourceDTO
     */
    constructor() { 
        
        DataSourceDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DataSourceDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DataSourceDTO} obj Optional instance to populate.
     * @return {module:model/DataSourceDTO} The populated <code>DataSourceDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DataSourceDTO();

            if (data.hasOwnProperty('dataSourceId')) {
                obj['dataSourceId'] = ApiClient.convertToType(data['dataSourceId'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('dsType')) {
                obj['dsType'] = ApiClient.convertToType(data['dsType'], 'String');
            }
            if (data.hasOwnProperty('entities')) {
                obj['entities'] = ApiClient.convertToType(data['entities'], [EntityDTO]);
            }
            if (data.hasOwnProperty('outputRecordSet')) {
                obj['outputRecordSet'] = ApiClient.convertToType(data['outputRecordSet'], 'String');
            }
            if (data.hasOwnProperty('releaseTag')) {
                obj['releaseTag'] = ApiClient.convertToType(data['releaseTag'], 'String');
            }
            if (data.hasOwnProperty('lastUpdatedBy')) {
                obj['lastUpdatedBy'] = ApiClient.convertToType(data['lastUpdatedBy'], 'String');
            }
            if (data.hasOwnProperty('lastUpdated')) {
                obj['lastUpdated'] = ApiClient.convertToType(data['lastUpdated'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} dataSourceId
 */
DataSourceDTO.prototype['dataSourceId'] = undefined;

/**
 * @member {String} name
 */
DataSourceDTO.prototype['name'] = undefined;

/**
 * @member {String} code
 */
DataSourceDTO.prototype['code'] = undefined;

/**
 * @member {module:model/DataSourceDTO.DsTypeEnum} dsType
 */
DataSourceDTO.prototype['dsType'] = undefined;

/**
 * @member {Array.<module:model/EntityDTO>} entities
 */
DataSourceDTO.prototype['entities'] = undefined;

/**
 * @member {String} outputRecordSet
 */
DataSourceDTO.prototype['outputRecordSet'] = undefined;

/**
 * @member {String} releaseTag
 */
DataSourceDTO.prototype['releaseTag'] = undefined;

/**
 * @member {String} lastUpdatedBy
 */
DataSourceDTO.prototype['lastUpdatedBy'] = undefined;

/**
 * @member {Number} lastUpdated
 */
DataSourceDTO.prototype['lastUpdated'] = undefined;





/**
 * Allowed values for the <code>dsType</code> property.
 * @enum {String}
 * @readonly
 */
DataSourceDTO['DsTypeEnum'] = {

    /**
     * value: "AUTOMATIC"
     * @const
     */
    "AUTOMATIC": "AUTOMATIC",

    /**
     * value: "MANUAL"
     * @const
     */
    "MANUAL": "MANUAL",

    /**
     * value: "FILTER"
     * @const
     */
    "FILTER": "FILTER"
};



export default DataSourceDTO;

