/**
 * FactSet NER
 * Extract named entities and their FactSet entity IDs from given document text.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Input model module.
 * @module model/Input
 * @version 0.9.0
 */
class Input {
    /**
     * Constructs a new <code>Input</code>.
     * @alias module:model/Input
     * @param text {String} English plain text to extract named entities from.  Maxiumum of 10,000 characters.
     */
    constructor(text) { 
        
        Input.initialize(this, text);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, text) { 
        obj['text'] = text;
    }

    /**
     * Constructs a <code>Input</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Input} obj Optional instance to populate.
     * @return {module:model/Input} The populated <code>Input</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Input();

            if (data.hasOwnProperty('text')) {
                obj['text'] = ApiClient.convertToType(data['text'], 'String');
            }
            if (data.hasOwnProperty('filterEntities')) {
                obj['filterEntities'] = ApiClient.convertToType(data['filterEntities'], 'Boolean');
            }
            if (data.hasOwnProperty('enableIdLookup')) {
                obj['enableIdLookup'] = ApiClient.convertToType(data['enableIdLookup'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * English plain text to extract named entities from.  Maxiumum of 10,000 characters.
 * @member {String} text
 */
Input.prototype['text'] = undefined;

/**
 * Drop lower probability entities using machine learning filtering rules
 * @member {Boolean} filterEntities
 * @default true
 */
Input.prototype['filterEntities'] = true;

/**
 * Retrieve FactSet IDs for entities
 * @member {Boolean} enableIdLookup
 * @default true
 */
Input.prototype['enableIdLookup'] = true;






export default Input;

