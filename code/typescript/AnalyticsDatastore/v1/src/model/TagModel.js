/**
 * Analytics Datastore  API
 * Allow clients to fetch precalculated Analytics through predeterministic URLs.
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
 * The TagModel model module.
 * @module model/TagModel
 */
class TagModel {
    /**
     * Constructs a new <code>TagModel</code>.
     * Tags model
     * @alias module:model/TagModel
     */
    constructor() { 
        
        TagModel.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TagModel</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TagModel} obj Optional instance to populate.
     * @return {module:model/TagModel} The populated <code>TagModel</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TagModel();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The name of the tag
 * @member {String} name
 */
TagModel.prototype['name'] = undefined;

/**
 * The type of the tag
 * @member {module:model/TagModel.TypeEnum} type
 */
TagModel.prototype['type'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
TagModel['TypeEnum'] = {

    /**
     * value: "string"
     * @const
     */
    "string": "string",

    /**
     * value: "date"
     * @const
     */
    "date": "date",

    /**
     * value: "datetime"
     * @const
     */
    "datetime": "datetime"
};



export default TagModel;

