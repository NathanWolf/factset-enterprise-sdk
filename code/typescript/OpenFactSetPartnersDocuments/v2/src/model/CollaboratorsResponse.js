/**
 * Open:FactSet - Partners
 * This service provides the capability to search and download unstructured content provided by <a href=\"https://open.factset.com/catalog/en-us\">Open:FactSet Partners</a>.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CollaboratorsFiles from './CollaboratorsFiles';
import Meta from './Meta';

/**
 * The CollaboratorsResponse model module.
 * @module model/CollaboratorsResponse
 */
class CollaboratorsResponse {
    /**
     * Constructs a new <code>CollaboratorsResponse</code>.
     * Returns Collaborators Response
     * @alias module:model/CollaboratorsResponse
     */
    constructor() { 
        
        CollaboratorsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CollaboratorsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CollaboratorsResponse} obj Optional instance to populate.
     * @return {module:model/CollaboratorsResponse} The populated <code>CollaboratorsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CollaboratorsResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [CollaboratorsFiles]);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * Returns Collaborators Response
 * @member {Array.<module:model/CollaboratorsFiles>} data
 */
CollaboratorsResponse.prototype['data'] = undefined;

/**
 * @member {module:model/Meta} meta
 */
CollaboratorsResponse.prototype['meta'] = undefined;






export default CollaboratorsResponse;

