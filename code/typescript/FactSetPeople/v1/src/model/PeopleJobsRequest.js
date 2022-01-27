/**
 * FactSet People API
 * The FactSet People API exposes FactSet data for individuals and their jobs. 
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
import Level from './Level';
import Status from './Status';
import Type from './Type';

/**
 * The PeopleJobsRequest model module.
 * @module model/PeopleJobsRequest
 * @version 0.9.0
 */
class PeopleJobsRequest {
    /**
     * Constructs a new <code>PeopleJobsRequest</code>.
     * @alias module:model/PeopleJobsRequest
     * @param ids {Array.<String>} FactSet People Entity Ids. 
     */
    constructor(ids) { 
        
        PeopleJobsRequest.initialize(this, ids);
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
     * Constructs a <code>PeopleJobsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PeopleJobsRequest} obj Optional instance to populate.
     * @return {module:model/PeopleJobsRequest} The populated <code>PeopleJobsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PeopleJobsRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = Status.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('level')) {
                obj['level'] = Level.constructFromObject(data['level']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = Type.constructFromObject(data['type']);
            }
        }
        return obj;
    }


}

/**
 * FactSet People Entity Ids. 
 * @member {Array.<String>} ids
 */
PeopleJobsRequest.prototype['ids'] = undefined;

/**
 * @member {module:model/Status} status
 */
PeopleJobsRequest.prototype['status'] = undefined;

/**
 * @member {module:model/Level} level
 */
PeopleJobsRequest.prototype['level'] = undefined;

/**
 * @member {module:model/Type} type
 */
PeopleJobsRequest.prototype['type'] = undefined;






export default PeopleJobsRequest;

