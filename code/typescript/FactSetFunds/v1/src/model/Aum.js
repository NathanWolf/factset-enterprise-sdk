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
 * The Aum model module.
 * @module model/Aum
 * @version 0.9.0
 */
class Aum {
    /**
     * Constructs a new <code>Aum</code>.
     * @alias module:model/Aum
     */
    constructor() { 
        
        Aum.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Aum</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Aum} obj Optional instance to populate.
     * @return {module:model/Aum} The populated <code>Aum</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Aum();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('fundLevelAUM')) {
                obj['fundLevelAUM'] = ApiClient.convertToType(data['fundLevelAUM'], 'Number');
            }
            if (data.hasOwnProperty('shrClassAUMRpt')) {
                obj['shrClassAUMRpt'] = ApiClient.convertToType(data['shrClassAUMRpt'], 'Number');
            }
            if (data.hasOwnProperty('shrClassAUMAct')) {
                obj['shrClassAUMAct'] = ApiClient.convertToType(data['shrClassAUMAct'], 'Number');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
 * @member {String} fsymId
 */
Aum.prototype['fsymId'] = undefined;

/**
 * Returns fund-level Assets Under Management (AUM) data. Fund-level AUM is the sum of the market values of the positions in the fund's portfolio. This represents all share classes.
 * @member {Number} fundLevelAUM
 */
Aum.prototype['fundLevelAUM'] = undefined;

/**
 * As-Reported AUM. Calculated by using shares outstanding at previous close multiplied by NAV at previous close. This is typically the value seen on fund websites. As Reported AUM = (Shares Outstanding t0 * NAV t0).
 * @member {Number} shrClassAUMRpt
 */
Aum.prototype['shrClassAUMRpt'] = undefined;

/**
 * Actual AUM. Calculated by using shares outstanding at previous close multiplied by NAV of one day prior to close. This is the value used in calculating fund flows. Actual AUM = (Shares Outstanding t0 * NAV t-1)
 * @member {Number} shrClassAUMAct
 */
Aum.prototype['shrClassAUMAct'] = undefined;

/**
 * The Currency of the AUM values. By default it will be in the FUnds Currency, unless otherwise requested via the currency parameter.
 * @member {String} currency
 */
Aum.prototype['currency'] = undefined;

/**
 * The date of the AUM in YYYY-MM-DD format.
 * @member {String} date
 */
Aum.prototype['date'] = undefined;

/**
 * The requested Id sent as input.
 * @member {String} requestId
 */
Aum.prototype['requestId'] = undefined;






export default Aum;

