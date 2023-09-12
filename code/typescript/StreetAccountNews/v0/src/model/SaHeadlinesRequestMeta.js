/**
 * StreetAccount API
 * Collection of endpoints for retrieving StreetAccount headlines and filters
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SaHeadlinesRequestMetaPagination from './SaHeadlinesRequestMetaPagination';

/**
 * The SaHeadlinesRequestMeta model module.
 * @module model/SaHeadlinesRequestMeta
 */
class SaHeadlinesRequestMeta {
    /**
     * Constructs a new <code>SaHeadlinesRequestMeta</code>.
     * @alias module:model/SaHeadlinesRequestMeta
     */
    constructor() { 
        
        SaHeadlinesRequestMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SaHeadlinesRequestMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SaHeadlinesRequestMeta} obj Optional instance to populate.
     * @return {module:model/SaHeadlinesRequestMeta} The populated <code>SaHeadlinesRequestMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SaHeadlinesRequestMeta();

            if (data.hasOwnProperty('pagination')) {
                obj['pagination'] = SaHeadlinesRequestMetaPagination.constructFromObject(data['pagination']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SaHeadlinesRequestMetaPagination} pagination
 */
SaHeadlinesRequestMeta.prototype['pagination'] = undefined;






export default SaHeadlinesRequestMeta;

