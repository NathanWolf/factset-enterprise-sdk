/**
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse20012DataValueUnit model module.
 * @module model/InlineResponse20012DataValueUnit
 * @version 0.10.0
 */
class InlineResponse20012DataValueUnit {
    /**
     * Constructs a new <code>InlineResponse20012DataValueUnit</code>.
     * @alias module:model/InlineResponse20012DataValueUnit
     */
    constructor() { 
        
        InlineResponse20012DataValueUnit.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20012DataValueUnit</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20012DataValueUnit} obj Optional instance to populate.
     * @return {module:model/InlineResponse20012DataValueUnit} The populated <code>InlineResponse20012DataValueUnit</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20012DataValueUnit();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('count')) {
                obj['count'] = ApiClient.convertToType(data['count'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifer of a value unit.
 * @member {Number} id
 */
InlineResponse20012DataValueUnit.prototype['id'] = undefined;

/**
 * Code of the value unit: If assigned, a code according to ISO 4217, otherwise a local code, for a main currency; a code such as GBp (for British pence) for a fractional currency; or a code such as PT (points) for non-currency value units.
 * @member {String} code
 */
InlineResponse20012DataValueUnit.prototype['code'] = undefined;

/**
 * Number of notations.
 * @member {Number} count
 */
InlineResponse20012DataValueUnit.prototype['count'] = undefined;






export default InlineResponse20012DataValueUnit;

