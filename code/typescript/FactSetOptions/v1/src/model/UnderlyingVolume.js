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

/**
 * The UnderlyingVolume model module.
 * @module model/UnderlyingVolume
 * @version 0.20.0
 */
class UnderlyingVolume {
    /**
     * Constructs a new <code>UnderlyingVolume</code>.
     * Underlying Volume response fields
     * @alias module:model/UnderlyingVolume
     */
    constructor() { 
        
        UnderlyingVolume.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UnderlyingVolume</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UnderlyingVolume} obj Optional instance to populate.
     * @return {module:model/UnderlyingVolume} The populated <code>UnderlyingVolume</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UnderlyingVolume();

            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('exchange')) {
                obj['exchange'] = ApiClient.convertToType(data['exchange'], 'String');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('putCallRatio')) {
                obj['putCallRatio'] = ApiClient.convertToType(data['putCallRatio'], 'Number');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('totalCallOpenInterest')) {
                obj['totalCallOpenInterest'] = ApiClient.convertToType(data['totalCallOpenInterest'], 'Number');
            }
            if (data.hasOwnProperty('totalCallVolume')) {
                obj['totalCallVolume'] = ApiClient.convertToType(data['totalCallVolume'], 'Number');
            }
            if (data.hasOwnProperty('totalPutCallOpenInterest')) {
                obj['totalPutCallOpenInterest'] = ApiClient.convertToType(data['totalPutCallOpenInterest'], 'Number');
            }
            if (data.hasOwnProperty('totalPutCallVolume')) {
                obj['totalPutCallVolume'] = ApiClient.convertToType(data['totalPutCallVolume'], 'Number');
            }
            if (data.hasOwnProperty('totalPutOpenInterest')) {
                obj['totalPutOpenInterest'] = ApiClient.convertToType(data['totalPutOpenInterest'], 'Number');
            }
            if (data.hasOwnProperty('totalPutVolume')) {
                obj['totalPutVolume'] = ApiClient.convertToType(data['totalPutVolume'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * The date of data as of the YYYY-MM-DD format.
 * @member {Date} date
 */
UnderlyingVolume.prototype['date'] = undefined;

/**
 * Option Exchange ISO. Visit [OA 14925](https://my.apps.factset.com/oa/pages/14925) for a list of Exchange ISOs.
 * @member {String} exchange
 */
UnderlyingVolume.prototype['exchange'] = undefined;

/**
 * FactSet's Security Permanent Identifier for input security in XXXXXX-S format.
 * @member {String} fsymId
 */
UnderlyingVolume.prototype['fsymId'] = undefined;

/**
 * Put/Call Ratio (Open Interest)
 * @member {Number} putCallRatio
 */
UnderlyingVolume.prototype['putCallRatio'] = undefined;

/**
 * The requested identifier submitted in the query.
 * @member {String} requestId
 */
UnderlyingVolume.prototype['requestId'] = undefined;

/**
 * Total Call Open Interest
 * @member {Number} totalCallOpenInterest
 */
UnderlyingVolume.prototype['totalCallOpenInterest'] = undefined;

/**
 * Total Call Volume
 * @member {Number} totalCallVolume
 */
UnderlyingVolume.prototype['totalCallVolume'] = undefined;

/**
 * Total Call/Put Open Interest
 * @member {Number} totalPutCallOpenInterest
 */
UnderlyingVolume.prototype['totalPutCallOpenInterest'] = undefined;

/**
 * Total Call/Put Volume
 * @member {Number} totalPutCallVolume
 */
UnderlyingVolume.prototype['totalPutCallVolume'] = undefined;

/**
 * Total Put Open Interest
 * @member {Number} totalPutOpenInterest
 */
UnderlyingVolume.prototype['totalPutOpenInterest'] = undefined;

/**
 * Total Put Volume
 * @member {Number} totalPutVolume
 */
UnderlyingVolume.prototype['totalPutVolume'] = undefined;






export default UnderlyingVolume;

