/**
 * FactSet People API
 * The FactSet People API exposes FactSet data for individuals and their jobs. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Position from './Position';

/**
 * The CompanyPositionsRequest model module.
 * @module model/CompanyPositionsRequest
 */
class CompanyPositionsRequest {
    /**
     * Constructs a new <code>CompanyPositionsRequest</code>.
     * @alias module:model/CompanyPositionsRequest
     * @param ids {Array.<String>} The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
     */
    constructor(ids) { 
        
        CompanyPositionsRequest.initialize(this, ids);
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
     * Constructs a <code>CompanyPositionsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CompanyPositionsRequest} obj Optional instance to populate.
     * @return {module:model/CompanyPositionsRequest} The populated <code>CompanyPositionsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CompanyPositionsRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('position')) {
                obj['position'] = Position.constructFromObject(data['position']);
            }
        }
        return obj;
    }


}

/**
 * The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
 * @member {Array.<String>} ids
 */
CompanyPositionsRequest.prototype['ids'] = undefined;

/**
 * @member {module:model/Position} position
 */
CompanyPositionsRequest.prototype['position'] = undefined;






export default CompanyPositionsRequest;

