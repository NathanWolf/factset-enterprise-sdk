/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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

/**
 * The StockDividendListMeta model module.
 * @module model/StockDividendListMeta
 * @version 0.9.2
 */
class StockDividendListMeta {
    /**
     * Constructs a new <code>StockDividendListMeta</code>.
     * The meta member contains the meta information of the request.
     * @alias module:model/StockDividendListMeta
     */
    constructor() { 
        
        StockDividendListMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockDividendListMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockDividendListMeta} obj Optional instance to populate.
     * @return {module:model/StockDividendListMeta} The populated <code>StockDividendListMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockDividendListMeta();

            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ApiClient.convertToType(data['attributes'], ['String']);
            }
            if (data.hasOwnProperty('language')) {
                obj['language'] = ApiClient.convertToType(data['language'], 'String');
            }
            if (data.hasOwnProperty('sort')) {
                obj['sort'] = ApiClient.convertToType(data['sort'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * Limit the attributes returned in the response to the specified set.
 * @member {Array.<String>} attributes
 */
StockDividendListMeta.prototype['attributes'] = undefined;

/**
 * ISO 639-1 code of the language.
 * @member {String} language
 */
StockDividendListMeta.prototype['language'] = undefined;

/**
 * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed.
 * @member {Array.<module:model/StockDividendListMeta.SortEnum>} sort
 */
StockDividendListMeta.prototype['sort'] = undefined;





/**
 * Allowed values for the <code>sort</code> property.
 * @enum {String}
 * @readonly
 */
StockDividendListMeta['SortEnum'] = {

    /**
     * value: "dates.announcement"
     * @const
     */
    "dates.announcement": "dates.announcement",

    /**
     * value: "-dates.announcement"
     * @const
     */
    "-dates.announcement": "-dates.announcement",

    /**
     * value: "dates.record"
     * @const
     */
    "dates.record": "dates.record",

    /**
     * value: "-dates.record"
     * @const
     */
    "-dates.record": "-dates.record",

    /**
     * value: "dates.effective"
     * @const
     */
    "dates.effective": "dates.effective",

    /**
     * value: "-dates.effective"
     * @const
     */
    "-dates.effective": "-dates.effective",

    /**
     * value: "dates.payment"
     * @const
     */
    "dates.payment": "dates.payment",

    /**
     * value: "-dates.payment"
     * @const
     */
    "-dates.payment": "-dates.payment"
};



export default StockDividendListMeta;

