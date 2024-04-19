/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Meta from './Meta';
import TickData from './TickData';

/**
 * The GetFilesResponse model module.
 * @module model/GetFilesResponse
 */
class GetFilesResponse {
    /**
     * Constructs a new <code>GetFilesResponse</code>.
     * Returns Tick History Files
     * @alias module:model/GetFilesResponse
     */
    constructor() { 
        
        GetFilesResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetFilesResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetFilesResponse} obj Optional instance to populate.
     * @return {module:model/GetFilesResponse} The populated <code>GetFilesResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetFilesResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TickData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TickData} data
 */
GetFilesResponse.prototype['data'] = undefined;

/**
 * @member {module:model/Meta} meta
 */
GetFilesResponse.prototype['meta'] = undefined;






export default GetFilesResponse;

