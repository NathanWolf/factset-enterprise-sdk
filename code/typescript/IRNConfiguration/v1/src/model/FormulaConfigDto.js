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

/**
 * The FormulaConfigDto model module.
 * @module model/FormulaConfigDto
 * @version 0.20.0
 */
class FormulaConfigDto {
    /**
     * Constructs a new <code>FormulaConfigDto</code>.
     * @alias module:model/FormulaConfigDto
     */
    constructor() { 
        
        FormulaConfigDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FormulaConfigDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FormulaConfigDto} obj Optional instance to populate.
     * @return {module:model/FormulaConfigDto} The populated <code>FormulaConfigDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FormulaConfigDto();

            if (data.hasOwnProperty('Formula')) {
                obj['Formula'] = ApiClient.convertToType(data['Formula'], 'String');
            }
            if (data.hasOwnProperty('FormulaType')) {
                obj['FormulaType'] = ApiClient.convertToType(data['FormulaType'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} Formula
 */
FormulaConfigDto.prototype['Formula'] = undefined;

/**
 * @member {String} FormulaType
 */
FormulaConfigDto.prototype['FormulaType'] = undefined;






export default FormulaConfigDto;

