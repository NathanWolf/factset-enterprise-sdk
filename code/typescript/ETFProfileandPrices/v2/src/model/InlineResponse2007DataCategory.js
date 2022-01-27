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
 * The InlineResponse2007DataCategory model module.
 * @module model/InlineResponse2007DataCategory
 * @version 0.9.0
 */
class InlineResponse2007DataCategory {
    /**
     * Constructs a new <code>InlineResponse2007DataCategory</code>.
     * category.
     * @alias module:model/InlineResponse2007DataCategory
     */
    constructor() { 
        
        InlineResponse2007DataCategory.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2007DataCategory</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2007DataCategory} obj Optional instance to populate.
     * @return {module:model/InlineResponse2007DataCategory} The populated <code>InlineResponse2007DataCategory</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2007DataCategory();

            if (data.hasOwnProperty('broad')) {
                obj['broad'] = ApiClient.convertToType(data['broad'], 'String');
            }
            if (data.hasOwnProperty('focus')) {
                obj['focus'] = ApiClient.convertToType(data['focus'], 'String');
            }
            if (data.hasOwnProperty('niche')) {
                obj['niche'] = ApiClient.convertToType(data['niche'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The 1st of 3 asset-class-specific, hierarchical exposure tiers; the broadest category the ETP falls under within its asset class (e.g., Size & Style, Sector, Precious Metals, Absolute Returns), text and standardized value available. This data is available for all the regions. Please refer /factset/etf/class/category/broad/list for possible values.
 * @member {String} broad
 */
InlineResponse2007DataCategory.prototype['broad'] = undefined;

/**
 * The 2nd of 3 asset-class-specific, hierarchical exposure tiers; the ETP's classification within its category (e.g., Small Cap, Energy, Palladium, Long/Short), text and standardized value available. This data is available for all the regions. Please refer /factset/etf/class/category/focus/list for possible values.
 * @member {String} focus
 */
InlineResponse2007DataCategory.prototype['focus'] = undefined;

/**
 * The 3rd of 3 asset-class-specific, hierarchical exposure tiers; The ETP's classification within its Focus. Most granular tier of exposure sort (e.g., Growth, Coal, Physically held, Merger Arbitrage), text and standardized value available. This data is available for all the regions. Please refer /factset/etf/class/category/niche/list for possible values.
 * @member {String} niche
 */
InlineResponse2007DataCategory.prototype['niche'] = undefined;






export default InlineResponse2007DataCategory;

