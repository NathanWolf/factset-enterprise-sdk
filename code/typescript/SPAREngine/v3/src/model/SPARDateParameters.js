/**
 * SPAR Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SPARDateParameters model module.
 * @module model/SPARDateParameters
 * @version 0.9.0
 */
class SPARDateParameters {
    /**
     * Constructs a new <code>SPARDateParameters</code>.
     * The date parameters for SPAR calculation.
     * @alias module:model/SPARDateParameters
     * @param startdate {String} Calculation's start date.
     * @param enddate {String} Calculation's end date.
     * @param frequency {String} Calculation's frequency.
     */
    constructor(startdate, enddate, frequency) { 
        
        SPARDateParameters.initialize(this, startdate, enddate, frequency);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, startdate, enddate, frequency) { 
        obj['startdate'] = startdate;
        obj['enddate'] = enddate;
        obj['frequency'] = frequency;
    }

    /**
     * Constructs a <code>SPARDateParameters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SPARDateParameters} obj Optional instance to populate.
     * @return {module:model/SPARDateParameters} The populated <code>SPARDateParameters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SPARDateParameters();

            if (data.hasOwnProperty('startdate')) {
                obj['startdate'] = ApiClient.convertToType(data['startdate'], 'String');
            }
            if (data.hasOwnProperty('enddate')) {
                obj['enddate'] = ApiClient.convertToType(data['enddate'], 'String');
            }
            if (data.hasOwnProperty('frequency')) {
                obj['frequency'] = ApiClient.convertToType(data['frequency'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Calculation's start date.
 * @member {String} startdate
 */
SPARDateParameters.prototype['startdate'] = undefined;

/**
 * Calculation's end date.
 * @member {String} enddate
 */
SPARDateParameters.prototype['enddate'] = undefined;

/**
 * Calculation's frequency.
 * @member {String} frequency
 */
SPARDateParameters.prototype['frequency'] = undefined;






export default SPARDateParameters;

