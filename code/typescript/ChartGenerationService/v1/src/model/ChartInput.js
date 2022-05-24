/**
 * Chart Generation Service
 * This is a service for generating charts in a node environment that were created using web charting and get back images in form of `PNGs` and `JPEGs` as response.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ChartInput model module.
 * @module model/ChartInput
 * @version 0.20.0
 */
class ChartInput {
    /**
     * Constructs a new <code>ChartInput</code>.
     * @alias module:model/ChartInput
     */
    constructor() { 
        
        ChartInput.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ChartInput</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChartInput} obj Optional instance to populate.
     * @return {module:model/ChartInput} The populated <code>ChartInput</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChartInput();

            if (data.hasOwnProperty('in')) {
                obj['in'] = ApiClient.convertToType(data['in'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('required')) {
                obj['required'] = ApiClient.convertToType(data['required'], 'Boolean');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('example')) {
                obj['example'] = ApiClient.convertToType(data['example'], 'String');
            }
        }
        return obj;
    }


}

/**
 * How to apply the additional input. Would be often via query parameter which can be appended to the request with &
 * @member {module:model/ChartInput.InEnum} in
 */
ChartInput.prototype['in'] = undefined;

/**
 * The name of the parameter
 * @member {String} name
 */
ChartInput.prototype['name'] = undefined;

/**
 * Whether or not the parameter is required to be specified to get the chart image.
 * @member {Boolean} required
 */
ChartInput.prototype['required'] = undefined;

/**
 * A short description of the input and its use
 * @member {String} description
 */
ChartInput.prototype['description'] = undefined;

/**
 * The type of value expected for the input
 * @member {String} type
 */
ChartInput.prototype['type'] = undefined;

/**
 * An example value for the input
 * @member {String} example
 */
ChartInput.prototype['example'] = undefined;





/**
 * Allowed values for the <code>in</code> property.
 * @enum {String}
 * @readonly
 */
ChartInput['InEnum'] = {

    /**
     * value: "query"
     * @const
     */
    "query": "query",

    /**
     * value: "param"
     * @const
     */
    "param": "param"
};



export default ChartInput;

