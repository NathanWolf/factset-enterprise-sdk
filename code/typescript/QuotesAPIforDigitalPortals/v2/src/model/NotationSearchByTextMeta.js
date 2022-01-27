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
import BasicMarketListMetaPagination from './BasicMarketListMetaPagination';

/**
 * The NotationSearchByTextMeta model module.
 * @module model/NotationSearchByTextMeta
 * @version 0.9.0
 */
class NotationSearchByTextMeta {
    /**
     * Constructs a new <code>NotationSearchByTextMeta</code>.
     * The meta member contains the meta information of the request.
     * @alias module:model/NotationSearchByTextMeta
     */
    constructor() { 
        
        NotationSearchByTextMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NotationSearchByTextMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NotationSearchByTextMeta} obj Optional instance to populate.
     * @return {module:model/NotationSearchByTextMeta} The populated <code>NotationSearchByTextMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NotationSearchByTextMeta();

            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ApiClient.convertToType(data['attributes'], ['String']);
            }
            if (data.hasOwnProperty('language')) {
                obj['language'] = ApiClient.convertToType(data['language'], 'String');
            }
            if (data.hasOwnProperty('sort')) {
                obj['sort'] = ApiClient.convertToType(data['sort'], ['String']);
            }
            if (data.hasOwnProperty('pagination')) {
                obj['pagination'] = BasicMarketListMetaPagination.constructFromObject(data['pagination']);
            }
        }
        return obj;
    }


}

/**
 * Limit the attributes returned in the response to the specified set.
 * @member {Array.<String>} attributes
 */
NotationSearchByTextMeta.prototype['attributes'] = undefined;

/**
 * ISO 639-1 code of the language.
 * @member {String} language
 */
NotationSearchByTextMeta.prototype['language'] = undefined;

/**
 * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 3 (possibly prefixed) attribute name(s) is allowed.
 * @member {Array.<module:model/NotationSearchByTextMeta.SortEnum>} sort
 */
NotationSearchByTextMeta.prototype['sort'] = undefined;

/**
 * @member {module:model/BasicMarketListMetaPagination} pagination
 */
NotationSearchByTextMeta.prototype['pagination'] = undefined;





/**
 * Allowed values for the <code>sort</code> property.
 * @enum {String}
 * @readonly
 */
NotationSearchByTextMeta['SortEnum'] = {

    /**
     * value: "instrument.name.default.long"
     * @const
     */
    "instrument.name.default.long": "instrument.name.default.long",

    /**
     * value: "-instrument.name.default.long"
     * @const
     */
    "-instrument.name.default.long": "-instrument.name.default.long",

    /**
     * value: "instrument.name.default.short"
     * @const
     */
    "instrument.name.default.short": "instrument.name.default.short",

    /**
     * value: "-instrument.name.default.short"
     * @const
     */
    "-instrument.name.default.short": "-instrument.name.default.short",

    /**
     * value: "tradingValue.average.days30"
     * @const
     */
    "tradingValue.average.days30": "tradingValue.average.days30",

    /**
     * value: "-tradingValue.average.days30"
     * @const
     */
    "-tradingValue.average.days30": "-tradingValue.average.days30"
};



export default NotationSearchByTextMeta;

