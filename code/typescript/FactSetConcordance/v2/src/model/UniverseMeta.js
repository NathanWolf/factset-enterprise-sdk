/**
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p>   
 *
 * The version of the OpenAPI document: 2.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The UniverseMeta model module.
 * @module model/UniverseMeta
 */
class UniverseMeta {
    /**
     * Constructs a new <code>UniverseMeta</code>.
     * Metadata about a single universe
     * @alias module:model/UniverseMeta
     */
    constructor() { 
        
        UniverseMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UniverseMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UniverseMeta} obj Optional instance to populate.
     * @return {module:model/UniverseMeta} The populated <code>UniverseMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UniverseMeta();

            if (data.hasOwnProperty('universeId')) {
                obj['universeId'] = ApiClient.convertToType(data['universeId'], 'Number');
            }
            if (data.hasOwnProperty('universeName')) {
                obj['universeName'] = ApiClient.convertToType(data['universeName'], 'String');
            }
            if (data.hasOwnProperty('universeDescription')) {
                obj['universeDescription'] = ApiClient.convertToType(data['universeDescription'], 'String');
            }
            if (data.hasOwnProperty('universeType')) {
                obj['universeType'] = ApiClient.convertToType(data['universeType'], 'String');
            }
            if (data.hasOwnProperty('selfManaged')) {
                obj['selfManaged'] = ApiClient.convertToType(data['selfManaged'], 'Boolean');
            }
            if (data.hasOwnProperty('createdBy')) {
                obj['createdBy'] = ApiClient.convertToType(data['createdBy'], 'String');
            }
            if (data.hasOwnProperty('createdOn')) {
                obj['createdOn'] = ApiClient.convertToType(data['createdOn'], 'Date');
            }
            if (data.hasOwnProperty('updatedBy')) {
                obj['updatedBy'] = ApiClient.convertToType(data['updatedBy'], 'String');
            }
            if (data.hasOwnProperty('updatedOn')) {
                obj['updatedOn'] = ApiClient.convertToType(data['updatedOn'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * The universe identifier
 * @member {Number} universeId
 */
UniverseMeta.prototype['universeId'] = undefined;

/**
 * The user specified universe name
 * @member {String} universeName
 */
UniverseMeta.prototype['universeName'] = undefined;

/**
 * The user specified universe description
 * @member {String} universeDescription
 */
UniverseMeta.prototype['universeDescription'] = undefined;

/**
 * The user specified universe type.
 * @member {String} universeType
 */
UniverseMeta.prototype['universeType'] = undefined;

/**
 * False if the universe is managed by FactSet Managed Service, True otherwise
 * @member {Boolean} selfManaged
 */
UniverseMeta.prototype['selfManaged'] = undefined;

/**
 * The user who created the universe
 * @member {String} createdBy
 */
UniverseMeta.prototype['createdBy'] = undefined;

/**
 * When the universe was created
 * @member {Date} createdOn
 */
UniverseMeta.prototype['createdOn'] = undefined;

/**
 * The user who most recently updated the universe metadata
 * @member {String} updatedBy
 */
UniverseMeta.prototype['updatedBy'] = undefined;

/**
 * When the universe metadata was most recently updated
 * @member {Date} updatedOn
 */
UniverseMeta.prototype['updatedOn'] = undefined;






export default UniverseMeta;

