/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Price model module.
 * @module model/Price
 */
class Price {
    /**
     * Constructs a new <code>Price</code>.
     * @alias module:model/Price
     * @extends Object
     */
    constructor() { 
        
        Price.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Price</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Price} obj Optional instance to populate.
     * @return {module:model/Price} The populated <code>Price</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Price();

            ApiClient.constructFromObject(data, obj, 'Object');
            

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Permanent Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R) or a -L Suffix (XXXXXX-L).
 * @member {String} fsymId
 */
Price.prototype['fsymId'] = undefined;

/**
 * Ending date for the period expressed in YYYY-MM-DD format.
 * @member {Date} date
 */
Price.prototype['date'] = undefined;

/**
 * Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
Price.prototype['currency'] = undefined;

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
Price.prototype['requestId'] = undefined;






export default Price;

