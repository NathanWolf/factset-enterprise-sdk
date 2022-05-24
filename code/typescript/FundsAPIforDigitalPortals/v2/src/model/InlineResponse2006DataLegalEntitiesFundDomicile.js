/**
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
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
 * The InlineResponse2006DataLegalEntitiesFundDomicile model module.
 * @module model/InlineResponse2006DataLegalEntitiesFundDomicile
 * @version 0.10.0
 */
class InlineResponse2006DataLegalEntitiesFundDomicile {
    /**
     * Constructs a new <code>InlineResponse2006DataLegalEntitiesFundDomicile</code>.
     * Country of domicile of the fund.
     * @alias module:model/InlineResponse2006DataLegalEntitiesFundDomicile
     */
    constructor() { 
        
        InlineResponse2006DataLegalEntitiesFundDomicile.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006DataLegalEntitiesFundDomicile</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006DataLegalEntitiesFundDomicile} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006DataLegalEntitiesFundDomicile} The populated <code>InlineResponse2006DataLegalEntitiesFundDomicile</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006DataLegalEntitiesFundDomicile();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the country.
 * @member {Number} id
 */
InlineResponse2006DataLegalEntitiesFundDomicile.prototype['id'] = undefined;

/**
 * Name of the country.
 * @member {String} name
 */
InlineResponse2006DataLegalEntitiesFundDomicile.prototype['name'] = undefined;






export default InlineResponse2006DataLegalEntitiesFundDomicile;

