/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The RecordSetFields model module.
 * @module model/RecordSetFields
 */
class RecordSetFields {
    /**
     * Constructs a new <code>RecordSetFields</code>.
     * @alias module:model/RecordSetFields
     */
    constructor() { 
        
        RecordSetFields.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RecordSetFields</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RecordSetFields} obj Optional instance to populate.
     * @return {module:model/RecordSetFields} The populated <code>RecordSetFields</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecordSetFields();

            if (data.hasOwnProperty('fieldType')) {
                obj['fieldType'] = ApiClient.convertToType(data['fieldType'], 'String');
            }
            if (data.hasOwnProperty('format')) {
                obj['format'] = ApiClient.convertToType(data['format'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('hide')) {
                obj['hide'] = ApiClient.convertToType(data['hide'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/RecordSetFields.FieldTypeEnum} fieldType
 */
RecordSetFields.prototype['fieldType'] = undefined;

/**
 * @member {String} format
 */
RecordSetFields.prototype['format'] = undefined;

/**
 * @member {Number} id
 */
RecordSetFields.prototype['id'] = undefined;

/**
 * @member {String} hide
 */
RecordSetFields.prototype['hide'] = undefined;

/**
 * @member {String} name
 */
RecordSetFields.prototype['name'] = undefined;





/**
 * Allowed values for the <code>fieldType</code> property.
 * @enum {String}
 * @readonly
 */
RecordSetFields['FieldTypeEnum'] = {

    /**
     * value: "BOOLEAN"
     * @const
     */
    "BOOLEAN": "BOOLEAN",

    /**
     * value: "COLOUR"
     * @const
     */
    "COLOUR": "COLOUR",

    /**
     * value: "DATETIME"
     * @const
     */
    "DATETIME": "DATETIME",

    /**
     * value: "DECIMAL"
     * @const
     */
    "DECIMAL": "DECIMAL",

    /**
     * value: "FONT"
     * @const
     */
    "FONT": "FONT",

    /**
     * value: "FONTSIZE"
     * @const
     */
    "FONTSIZE": "FONTSIZE",

    /**
     * value: "HTML"
     * @const
     */
    "HTML": "HTML",

    /**
     * value: "INTEGER"
     * @const
     */
    "INTEGER": "INTEGER",

    /**
     * value: "TEXT"
     * @const
     */
    "TEXT": "TEXT"
};



export default RecordSetFields;

