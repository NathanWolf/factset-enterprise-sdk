/**
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  
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
 * The CostsFeesRequest model module.
 * @module model/CostsFeesRequest
 * @version 0.9.0
 */
class CostsFeesRequest {
    /**
     * Constructs a new <code>CostsFeesRequest</code>.
     * Cost and Fees Request Body
     * @alias module:model/CostsFeesRequest
     * @param ids {Array.<String>} The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
     */
    constructor(ids) { 
        
        CostsFeesRequest.initialize(this, ids);
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
     * Constructs a <code>CostsFeesRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CostsFeesRequest} obj Optional instance to populate.
     * @return {module:model/CostsFeesRequest} The populated <code>CostsFeesRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CostsFeesRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
 * @member {Array.<String>} ids
 */
CostsFeesRequest.prototype['ids'] = undefined;

/**
 * The date requested in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} date
 */
CostsFeesRequest.prototype['date'] = undefined;

/**
 * The ISO3 currency control for the requested fund.
 * @member {String} currency
 * @default 'LOCAL'
 */
CostsFeesRequest.prototype['currency'] = 'LOCAL';






export default CostsFeesRequest;

