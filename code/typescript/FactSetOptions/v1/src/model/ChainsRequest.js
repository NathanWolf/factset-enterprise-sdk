/**
 * FactSet Options API
 * The Option Prices database provides pricing data such as mid bid-ask price, reference data (e.g., strike price), and risk measures (e.g., Greeks and implied volatility). Visit [Options Overview OA Page # 14925](https://my.apps.factset.com/oa/pages/14925) for details on database coverage. U.S. exchange-traded option bid and ask quotes are continuously updated throughout the day even when no trades have occurred on the option (zero volume). The end-of-day closing bid and ask quotes are always in line with the underlying closing price.  **Note** * Currently in Beta only **OPRA** exchanges are supported. 
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
import Exchange from './Exchange';
import IdType from './IdType';

/**
 * The ChainsRequest model module.
 * @module model/ChainsRequest
 * @version 0.20.0
 */
class ChainsRequest {
    /**
     * Constructs a new <code>ChainsRequest</code>.
     * @alias module:model/ChainsRequest
     * @param ids {Array.<String>} Underlying Security Identifier of which can be used to return respective options chain. Only **one** security id is permitted per request.  
     */
    constructor(ids) { 
        
        ChainsRequest.initialize(this, ids);
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
     * Constructs a <code>ChainsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChainsRequest} obj Optional instance to populate.
     * @return {module:model/ChainsRequest} The populated <code>ChainsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChainsRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('idType')) {
                obj['idType'] = IdType.constructFromObject(data['idType']);
            }
            if (data.hasOwnProperty('exchange')) {
                obj['exchange'] = Exchange.constructFromObject(data['exchange']);
            }
        }
        return obj;
    }


}

/**
 * Underlying Security Identifier of which can be used to return respective options chain. Only **one** security id is permitted per request.  
 * @member {Array.<String>} ids
 */
ChainsRequest.prototype['ids'] = undefined;

/**
 * The as of date for the option chain in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.
 * @member {String} date
 */
ChainsRequest.prototype['date'] = undefined;

/**
 * @member {module:model/IdType} idType
 */
ChainsRequest.prototype['idType'] = undefined;

/**
 * @member {module:model/Exchange} exchange
 */
ChainsRequest.prototype['exchange'] = undefined;






export default ChainsRequest;

