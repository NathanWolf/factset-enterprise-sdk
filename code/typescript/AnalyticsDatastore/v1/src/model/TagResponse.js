/**
 * Analytics Datastore  API
 * Allow clients to fetch precalculated Analytics through predeterministic URLs.
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
import TagModel from './TagModel';

/**
 * The TagResponse model module.
 * @module model/TagResponse
 */
class TagResponse {
    /**
     * Constructs a new <code>TagResponse</code>.
     * Response object for a single tag
     * @alias module:model/TagResponse
     */
    constructor() { 
        
        TagResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TagResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TagResponse} obj Optional instance to populate.
     * @return {module:model/TagResponse} The populated <code>TagResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TagResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TagModel.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TagModel} data
 */
TagResponse.prototype['data'] = undefined;






export default TagResponse;

