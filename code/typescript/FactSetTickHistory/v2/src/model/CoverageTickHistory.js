/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CoverageTickHistory model module.
 * @module model/CoverageTickHistory
 */
class CoverageTickHistory {
    /**
     * Constructs a new <code>CoverageTickHistory</code>.
     * Returns Coverage Response of the requested ticker with unique isocode within a date range
     * @alias module:model/CoverageTickHistory
     */
    constructor() { 
        
        CoverageTickHistory.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CoverageTickHistory</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CoverageTickHistory} obj Optional instance to populate.
     * @return {module:model/CoverageTickHistory} The populated <code>CoverageTickHistory</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CoverageTickHistory();

            if (data.hasOwnProperty('ticker')) {
                obj['ticker'] = ApiClient.convertToType(data['ticker'], 'String');
            }
            if (data.hasOwnProperty('factsetExchangeCode')) {
                obj['factsetExchangeCode'] = ApiClient.convertToType(data['factsetExchangeCode'], 'String');
            }
            if (data.hasOwnProperty('startDate')) {
                obj['startDate'] = ApiClient.convertToType(data['startDate'], 'Date');
            }
            if (data.hasOwnProperty('latestTradeDate')) {
                obj['latestTradeDate'] = ApiClient.convertToType(data['latestTradeDate'], 'Date');
            }
            if (data.hasOwnProperty('companyName')) {
                obj['companyName'] = ApiClient.convertToType(data['companyName'], 'String');
            }
            if (data.hasOwnProperty('isin')) {
                obj['isin'] = ApiClient.convertToType(data['isin'], 'String');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('lastExchangeCode')) {
                obj['lastExchangeCode'] = ApiClient.convertToType(data['lastExchangeCode'], 'String');
            }
            if (data.hasOwnProperty('lastExchangeName')) {
                obj['lastExchangeName'] = ApiClient.convertToType(data['lastExchangeName'], 'String');
            }
            if (data.hasOwnProperty('primaryTickerExchange')) {
                obj['primaryTickerExchange'] = ApiClient.convertToType(data['primaryTickerExchange'], 'String');
            }
        }
        return obj;
    }


}

/**
 * a unique ticker given to a company
 * @member {String} ticker
 */
CoverageTickHistory.prototype['ticker'] = undefined;

/**
 * FactSet specific exchange code.
 * @member {String} factsetExchangeCode
 */
CoverageTickHistory.prototype['factsetExchangeCode'] = undefined;

/**
 * The date for (or from which) the coverage is required. 
 * @member {Date} startDate
 */
CoverageTickHistory.prototype['startDate'] = undefined;

/**
 * This specifies the latest traded date from tick history.
 * @member {Date} latestTradeDate
 */
CoverageTickHistory.prototype['latestTradeDate'] = undefined;

/**
 * Name of the firm
 * @member {String} companyName
 */
CoverageTickHistory.prototype['companyName'] = undefined;

/**
 * returns the ISIN of the requested company 
 * @member {String} isin
 */
CoverageTickHistory.prototype['isin'] = undefined;

/**
 * Represents 3 digit ISO code for the currency
 * @member {String} currency
 */
CoverageTickHistory.prototype['currency'] = undefined;

/**
 * the last traded exhange code from tick history
 * @member {String} lastExchangeCode
 */
CoverageTickHistory.prototype['lastExchangeCode'] = undefined;

/**
 * the last traded exchange name from tick history
 * @member {String} lastExchangeName
 */
CoverageTickHistory.prototype['lastExchangeName'] = undefined;

/**
 * the primary ticker iso
 * @member {String} primaryTickerExchange
 */
CoverageTickHistory.prototype['primaryTickerExchange'] = undefined;






export default CoverageTickHistory;

