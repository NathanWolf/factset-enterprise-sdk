/**
 * FactSet Terms & Conditions API
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
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
import UseOfProceeds from './UseOfProceeds';

/**
 * The UseOfProceedsResponse model module.
 * @module model/UseOfProceedsResponse
 * @version 0.9.0
 */
class UseOfProceedsResponse {
    /**
     * Constructs a new <code>UseOfProceedsResponse</code>.
     * @alias module:model/UseOfProceedsResponse
     */
    constructor() { 
        
        UseOfProceedsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UseOfProceedsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UseOfProceedsResponse} obj Optional instance to populate.
     * @return {module:model/UseOfProceedsResponse} The populated <code>UseOfProceedsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UseOfProceedsResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [UseOfProceeds]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/UseOfProceeds>} data
 */
UseOfProceedsResponse.prototype['data'] = undefined;






export default UseOfProceedsResponse;

