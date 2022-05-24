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
import InlineResponse2007Currency from './InlineResponse2007Currency';
import InlineResponse2007Dates from './InlineResponse2007Dates';
import InlineResponse2007Gross from './InlineResponse2007Gross';
import InlineResponse2007Occurrence from './InlineResponse2007Occurrence';
import InlineResponse2007Type from './InlineResponse2007Type';

/**
 * The InlineResponse2007Data model module.
 * @module model/InlineResponse2007Data
 * @version 0.10.0
 */
class InlineResponse2007Data {
    /**
     * Constructs a new <code>InlineResponse2007Data</code>.
     * @alias module:model/InlineResponse2007Data
     */
    constructor() { 
        
        InlineResponse2007Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2007Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2007Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2007Data} The populated <code>InlineResponse2007Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2007Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = InlineResponse2007Type.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('occurrence')) {
                obj['occurrence'] = InlineResponse2007Occurrence.constructFromObject(data['occurrence']);
            }
            if (data.hasOwnProperty('dates')) {
                obj['dates'] = InlineResponse2007Dates.constructFromObject(data['dates']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = InlineResponse2007Currency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('gross')) {
                obj['gross'] = InlineResponse2007Gross.constructFromObject(data['gross']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of a dividend.
 * @member {String} id
 */
InlineResponse2007Data.prototype['id'] = undefined;

/**
 * @member {module:model/InlineResponse2007Type} type
 */
InlineResponse2007Data.prototype['type'] = undefined;

/**
 * @member {module:model/InlineResponse2007Occurrence} occurrence
 */
InlineResponse2007Data.prototype['occurrence'] = undefined;

/**
 * @member {module:model/InlineResponse2007Dates} dates
 */
InlineResponse2007Data.prototype['dates'] = undefined;

/**
 * @member {module:model/InlineResponse2007Currency} currency
 */
InlineResponse2007Data.prototype['currency'] = undefined;

/**
 * @member {module:model/InlineResponse2007Gross} gross
 */
InlineResponse2007Data.prototype['gross'] = undefined;






export default InlineResponse2007Data;

