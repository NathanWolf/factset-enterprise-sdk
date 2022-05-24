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
 * The InlineResponse20010FsymRegional model module.
 * @module model/InlineResponse20010FsymRegional
 * @version 0.10.0
 */
class InlineResponse20010FsymRegional {
    /**
     * Constructs a new <code>InlineResponse20010FsymRegional</code>.
     * Regional-level identifiers.
     * @alias module:model/InlineResponse20010FsymRegional
     */
    constructor() { 
        
        InlineResponse20010FsymRegional.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20010FsymRegional</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20010FsymRegional} obj Optional instance to populate.
     * @return {module:model/InlineResponse20010FsymRegional} The populated <code>InlineResponse20010FsymRegional</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20010FsymRegional();

            if (data.hasOwnProperty('permanentIdentifier')) {
                obj['permanentIdentifier'] = ApiClient.convertToType(data['permanentIdentifier'], 'String');
            }
            if (data.hasOwnProperty('tickerRegion')) {
                obj['tickerRegion'] = ApiClient.convertToType(data['tickerRegion'], 'String');
            }
            if (data.hasOwnProperty('isPrimary')) {
                obj['isPrimary'] = ApiClient.convertToType(data['isPrimary'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * FactSet Permanent Identifier for a set of one or more notations of the same region with the same value unit. The format is six alpha numeric characters, excluding vowels, with an R suffix (XXXXXX-R).
 * @member {String} permanentIdentifier
 */
InlineResponse20010FsymRegional.prototype['permanentIdentifier'] = undefined;

/**
 * FactSet regional symbol of the notation, consisting of the ticker and the two-character code of the country or region where the listing is traded (example: DAI-DE).
 * @member {String} tickerRegion
 */
InlineResponse20010FsymRegional.prototype['tickerRegion'] = undefined;

/**
 * Indicates whether the notation is in the primary region of the security (`true`) or not (`false`).
 * @member {Boolean} isPrimary
 */
InlineResponse20010FsymRegional.prototype['isPrimary'] = undefined;






export default InlineResponse20010FsymRegional;

