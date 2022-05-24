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
 * The InlineResponse20029Data model module.
 * @module model/InlineResponse20029Data
 * @version 0.10.0
 */
class InlineResponse20029Data {
    /**
     * Constructs a new <code>InlineResponse20029Data</code>.
     * Strategy.
     * @alias module:model/InlineResponse20029Data
     */
    constructor() { 
        
        InlineResponse20029Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20029Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20029Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20029Data} The populated <code>InlineResponse20029Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20029Data();

            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('group')) {
                obj['group'] = ApiClient.convertToType(data['group'], 'String');
            }
            if (data.hasOwnProperty('cluster')) {
                obj['cluster'] = ApiClient.convertToType(data['cluster'], 'String');
            }
            if (data.hasOwnProperty('selectCriteria')) {
                obj['selectCriteria'] = ApiClient.convertToType(data['selectCriteria'], 'String');
            }
            if (data.hasOwnProperty('weighting')) {
                obj['weighting'] = ApiClient.convertToType(data['weighting'], 'String');
            }
            if (data.hasOwnProperty('segment')) {
                obj['segment'] = ApiClient.convertToType(data['segment'], 'String');
            }
            if (data.hasOwnProperty('isTransparent')) {
                obj['isTransparent'] = ApiClient.convertToType(data['isTransparent'], 'Boolean');
            }
            if (data.hasOwnProperty('fundOfFunds')) {
                obj['fundOfFunds'] = ApiClient.convertToType(data['fundOfFunds'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Descriptive Summary of the methods used by a ETP or its index in selection and weighting of its holdings, text and standardized value available. This data is available for the US and Canada regions.
 * @member {String} description
 */
InlineResponse20029Data.prototype['description'] = undefined;

/**
 * Factset's strategy group is the broadest way sort ETPs with a similar investment strategy. This data is available for the US and Canada regions.
 * @member {String} group
 */
InlineResponse20029Data.prototype['group'] = undefined;

/**
 * Factset's strategy cluster is a collection of ETPs with a similar investment strategy, yet smaller than strategy group. This data item is more granular and narrow than the strategy group yet bigger than strategy group. This data is available for the US and Canada regions.
 * @member {String} cluster
 */
InlineResponse20029Data.prototype['cluster'] = undefined;

/**
 * Description of the security selection criteria used by the ETP or its index (e.g., Market Cap, Earnings, Dividends), text and standardized value available. This data is available for all the regions.
 * @member {String} selectCriteria
 */
InlineResponse20029Data.prototype['selectCriteria'] = undefined;

/**
 * Text that specifies the weighting selection criteria used by the ETP or its index (e.g., Market Cap, Equal, Momentum, Fundamental) , text and standardized value available. This data is available for all the regions.
 * @member {String} weighting
 */
InlineResponse20029Data.prototype['weighting'] = undefined;

/**
 * Determines the unique segment the ETP falls into, based on FactSet ETP Analytics rules-based classification system determined by geography, category, focus, and niche. Text and standardized value available for this data item. This data is available for the US regions. See endpoint /factset/etf/strategy/segment/list for possible values.
 * @member {String} segment
 */
InlineResponse20029Data.prototype['segment'] = undefined;

/**
 * Description that States whether or not the methodology behind the underlying index can be clearly understood from offering documents. This data is available for the US and Canada regions.
 * @member {Boolean} isTransparent
 */
InlineResponse20029Data.prototype['isTransparent'] = undefined;

/**
 * Description of the ETP that holds a portfolio of other ETPs. This data is available for the Canada regions.
 * @member {String} fundOfFunds
 */
InlineResponse20029Data.prototype['fundOfFunds'] = undefined;






export default InlineResponse20029Data;

