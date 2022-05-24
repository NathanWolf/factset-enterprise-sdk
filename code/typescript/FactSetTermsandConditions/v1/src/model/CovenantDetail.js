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

/**
 * The CovenantDetail model module.
 * @module model/CovenantDetail
 * @version 0.20.0
 */
class CovenantDetail {
    /**
     * Constructs a new <code>CovenantDetail</code>.
     * Covenant Detail for a Fixed Income security.
     * @alias module:model/CovenantDetail
     */
    constructor() { 
        
        CovenantDetail.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CovenantDetail</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CovenantDetail} obj Optional instance to populate.
     * @return {module:model/CovenantDetail} The populated <code>CovenantDetail</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CovenantDetail();

            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('finCovType')) {
                obj['finCovType'] = ApiClient.convertToType(data['finCovType'], 'String');
            }
            if (data.hasOwnProperty('finCovDesc')) {
                obj['finCovDesc'] = ApiClient.convertToType(data['finCovDesc'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Security identifier used in the request.
 * @member {String} requestId
 */
CovenantDetail.prototype['requestId'] = undefined;

/**
 * FactSet Permanent Security Identifier.
 * @member {String} fsymId
 */
CovenantDetail.prototype['fsymId'] = undefined;

/**
 * Covenant Type
 * @member {String} finCovType
 */
CovenantDetail.prototype['finCovType'] = undefined;

/**
 * Description
 * @member {String} finCovDesc
 */
CovenantDetail.prototype['finCovDesc'] = undefined;






export default CovenantDetail;

