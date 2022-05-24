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
import InlineResponse2006Ownership from './InlineResponse2006Ownership';
import InlineResponse2006Type from './InlineResponse2006Type';

/**
 * The InlineResponse2006Data model module.
 * @module model/InlineResponse2006Data
 * @version 0.10.0
 */
class InlineResponse2006Data {
    /**
     * Constructs a new <code>InlineResponse2006Data</code>.
     * @alias module:model/InlineResponse2006Data
     */
    constructor() { 
        
        InlineResponse2006Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006Data} The populated <code>InlineResponse2006Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = InlineResponse2006Type.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('ownership')) {
                obj['ownership'] = InlineResponse2006Ownership.constructFromObject(data['ownership']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the owner. See endpoint `/legalEntity/list` for possible values.
 * @member {String} id
 */
InlineResponse2006Data.prototype['id'] = undefined;

/**
 * Name of the owner.
 * @member {String} name
 */
InlineResponse2006Data.prototype['name'] = undefined;

/**
 * @member {module:model/InlineResponse2006Type} type
 */
InlineResponse2006Data.prototype['type'] = undefined;

/**
 * @member {module:model/InlineResponse2006Ownership} ownership
 */
InlineResponse2006Data.prototype['ownership'] = undefined;






export default InlineResponse2006Data;

