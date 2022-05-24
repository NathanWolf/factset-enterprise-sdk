/**
 * FactSet RIBCS
 * FactSet Revere Business Industry Classification System (RBICS) is a comprehensive structured taxonomy to classify companies by what they primarily do. It delivers a granular view for investors by classifying companies using a bottom-up approach according to the products and services they provide. By combining this approach with a top-level grouping based on companies' behavior similarities and stock co-movement, FactSet RBICS delivers unprecedented precision for 1,400+ sector groups.  RBICS Focus is a six level classification which highlights the companys main business. It is based on the company business line/s that stand for majority of a the revenue that the company generates. Updated monthly. For more details, visit [Online Assitant Page #20710](https://oa.apps.factset.com/pages/20710). 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import EntityFocus from './EntityFocus';

/**
 * The EntityFocusResponse model module.
 * @module model/EntityFocusResponse
 * @version 0.20.0
 */
class EntityFocusResponse {
    /**
     * Constructs a new <code>EntityFocusResponse</code>.
     * Entity Focus Response
     * @alias module:model/EntityFocusResponse
     */
    constructor() { 
        
        EntityFocusResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EntityFocusResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EntityFocusResponse} obj Optional instance to populate.
     * @return {module:model/EntityFocusResponse} The populated <code>EntityFocusResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntityFocusResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [EntityFocus]);
            }
        }
        return obj;
    }


}

/**
 * Array of Entity Focus Objects
 * @member {Array.<module:model/EntityFocus>} data
 */
EntityFocusResponse.prototype['data'] = undefined;






export default EntityFocusResponse;

