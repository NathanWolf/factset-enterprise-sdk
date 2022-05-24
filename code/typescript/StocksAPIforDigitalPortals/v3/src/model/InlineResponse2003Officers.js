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
import InlineResponse2003Function from './InlineResponse2003Function';

/**
 * The InlineResponse2003Officers model module.
 * @module model/InlineResponse2003Officers
 * @version 0.10.0
 */
class InlineResponse2003Officers {
    /**
     * Constructs a new <code>InlineResponse2003Officers</code>.
     * @alias module:model/InlineResponse2003Officers
     */
    constructor() { 
        
        InlineResponse2003Officers.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003Officers</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003Officers} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003Officers} The populated <code>InlineResponse2003Officers</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003Officers();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('presentationName')) {
                obj['presentationName'] = ApiClient.convertToType(data['presentationName'], 'String');
            }
            if (data.hasOwnProperty('titleOfficer')) {
                obj['titleOfficer'] = ApiClient.convertToType(data['titleOfficer'], 'String');
            }
            if (data.hasOwnProperty('function')) {
                obj['function'] = InlineResponse2003Function.constructFromObject(data['function']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of an officer.  See endpoint `/legalEntity/list` for possible values.
 * @member {Number} id
 */
InlineResponse2003Officers.prototype['id'] = undefined;

/**
 * Full name of the officer.
 * @member {String} name
 */
InlineResponse2003Officers.prototype['name'] = undefined;

/**
 * Presentation name of the officer, potentially shortened and/or containing name supplementssuch as a title.
 * @member {String} presentationName
 */
InlineResponse2003Officers.prototype['presentationName'] = undefined;

/**
 * Job title of the officer.
 * @member {String} titleOfficer
 */
InlineResponse2003Officers.prototype['titleOfficer'] = undefined;

/**
 * @member {module:model/InlineResponse2003Function} function
 */
InlineResponse2003Officers.prototype['function'] = undefined;






export default InlineResponse2003Officers;

