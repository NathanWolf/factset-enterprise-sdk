/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The AnnualizedDividendsRequest model module.
 * @module model/AnnualizedDividendsRequest
 */
class AnnualizedDividendsRequest {
    /**
     * Constructs a new <code>AnnualizedDividendsRequest</code>.
     * Annualized Dividends Request Body
     * @alias module:model/AnnualizedDividendsRequest
     * @param ids {Array.<String>} The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. 
     */
    constructor(ids) { 
        
        AnnualizedDividendsRequest.initialize(this, ids);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids) { 
        obj['ids'] = ids;
    }

    /**
     * Constructs a <code>AnnualizedDividendsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AnnualizedDividendsRequest} obj Optional instance to populate.
     * @return {module:model/AnnualizedDividendsRequest} The populated <code>AnnualizedDividendsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AnnualizedDividendsRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. 
 * @member {Array.<String>} ids
 */
AnnualizedDividendsRequest.prototype['ids'] = undefined;

/**
 * Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
AnnualizedDividendsRequest.prototype['currency'] = undefined;






export default AnnualizedDividendsRequest;

