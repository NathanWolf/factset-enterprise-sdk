/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FIDiscountCurveInfo model module.
 * @module model/FIDiscountCurveInfo
 * @version 0.20.0
 */
class FIDiscountCurveInfo {
    /**
     * Constructs a new <code>FIDiscountCurveInfo</code>.
     * @alias module:model/FIDiscountCurveInfo
     */
    constructor() { 
        
        FIDiscountCurveInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FIDiscountCurveInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FIDiscountCurveInfo} obj Optional instance to populate.
     * @return {module:model/FIDiscountCurveInfo} The populated <code>FIDiscountCurveInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FIDiscountCurveInfo();

            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} category
 */
FIDiscountCurveInfo.prototype['category'] = undefined;

/**
 * @member {String} name
 */
FIDiscountCurveInfo.prototype['name'] = undefined;

/**
 * @member {String} currency
 */
FIDiscountCurveInfo.prototype['currency'] = undefined;






export default FIDiscountCurveInfo;

