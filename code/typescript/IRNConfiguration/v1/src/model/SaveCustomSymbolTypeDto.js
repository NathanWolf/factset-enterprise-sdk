/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import EntityType from './EntityType';

/**
 * The SaveCustomSymbolTypeDto model module.
 * @module model/SaveCustomSymbolTypeDto
 */
class SaveCustomSymbolTypeDto {
    /**
     * Constructs a new <code>SaveCustomSymbolTypeDto</code>.
     * @alias module:model/SaveCustomSymbolTypeDto
     * @param name {String} 
     */
    constructor(name) { 
        
        SaveCustomSymbolTypeDto.initialize(this, name);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name) { 
        obj['name'] = name;
    }

    /**
     * Constructs a <code>SaveCustomSymbolTypeDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SaveCustomSymbolTypeDto} obj Optional instance to populate.
     * @return {module:model/SaveCustomSymbolTypeDto} The populated <code>SaveCustomSymbolTypeDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SaveCustomSymbolTypeDto();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('hideAddressField')) {
                obj['hideAddressField'] = ApiClient.convertToType(data['hideAddressField'], 'Boolean');
            }
            if (data.hasOwnProperty('hideSymbolSubtype')) {
                obj['hideSymbolSubtype'] = ApiClient.convertToType(data['hideSymbolSubtype'], 'Boolean');
            }
            if (data.hasOwnProperty('isDefault')) {
                obj['isDefault'] = ApiClient.convertToType(data['isDefault'], 'Boolean');
            }
            if (data.hasOwnProperty('dueDiligenceSymbolEntityType')) {
                obj['dueDiligenceSymbolEntityType'] = EntityType.constructFromObject(data['dueDiligenceSymbolEntityType']);
            }
            if (data.hasOwnProperty('subTypes')) {
                obj['subTypes'] = ApiClient.convertToType(data['subTypes'], ['String']);
            }
            if (data.hasOwnProperty('customFieldIds')) {
                obj['customFieldIds'] = ApiClient.convertToType(data['customFieldIds'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
SaveCustomSymbolTypeDto.prototype['name'] = undefined;

/**
 * @member {Boolean} hideAddressField
 */
SaveCustomSymbolTypeDto.prototype['hideAddressField'] = undefined;

/**
 * @member {Boolean} hideSymbolSubtype
 */
SaveCustomSymbolTypeDto.prototype['hideSymbolSubtype'] = undefined;

/**
 * @member {Boolean} isDefault
 * @default false
 */
SaveCustomSymbolTypeDto.prototype['isDefault'] = false;

/**
 * @member {module:model/EntityType} dueDiligenceSymbolEntityType
 */
SaveCustomSymbolTypeDto.prototype['dueDiligenceSymbolEntityType'] = undefined;

/**
 * @member {Array.<String>} subTypes
 */
SaveCustomSymbolTypeDto.prototype['subTypes'] = undefined;

/**
 * @member {Array.<String>} customFieldIds
 */
SaveCustomSymbolTypeDto.prototype['customFieldIds'] = undefined;






export default SaveCustomSymbolTypeDto;

