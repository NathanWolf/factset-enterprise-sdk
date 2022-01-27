/**
 * FactSet Concordance API
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are two types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
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

/**
 * The UniverseStatistics model module.
 * @module model/UniverseStatistics
 * @version 0.9.0
 */
class UniverseStatistics {
    /**
     * Constructs a new <code>UniverseStatistics</code>.
     * Mapping statistics for a given universe
     * @alias module:model/UniverseStatistics
     */
    constructor() { 
        
        UniverseStatistics.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UniverseStatistics</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UniverseStatistics} obj Optional instance to populate.
     * @return {module:model/UniverseStatistics} The populated <code>UniverseStatistics</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UniverseStatistics();

            if (data.hasOwnProperty('totalCount')) {
                obj['totalCount'] = ApiClient.convertToType(data['totalCount'], 'Number');
            }
            if (data.hasOwnProperty('mappedCount')) {
                obj['mappedCount'] = ApiClient.convertToType(data['mappedCount'], 'Number');
            }
            if (data.hasOwnProperty('unmappedCount')) {
                obj['unmappedCount'] = ApiClient.convertToType(data['unmappedCount'], 'Number');
            }
            if (data.hasOwnProperty('indeterminateCount')) {
                obj['indeterminateCount'] = ApiClient.convertToType(data['indeterminateCount'], 'Number');
            }
            if (data.hasOwnProperty('universeId')) {
                obj['universeId'] = ApiClient.convertToType(data['universeId'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} totalCount
 */
UniverseStatistics.prototype['totalCount'] = undefined;

/**
 * @member {Number} mappedCount
 */
UniverseStatistics.prototype['mappedCount'] = undefined;

/**
 * @member {Number} unmappedCount
 */
UniverseStatistics.prototype['unmappedCount'] = undefined;

/**
 * @member {Number} indeterminateCount
 */
UniverseStatistics.prototype['indeterminateCount'] = undefined;

/**
 * @member {Number} universeId
 */
UniverseStatistics.prototype['universeId'] = undefined;






export default UniverseStatistics;

