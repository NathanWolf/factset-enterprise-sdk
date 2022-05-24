/**
 * FactSet Concordance API
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
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

/**
 * The EntityMappingRequest model module.
 * @module model/EntityMappingRequest
 * @version 0.8.2
 */
class EntityMappingRequest {
    /**
     * Constructs a new <code>EntityMappingRequest</code>.
     * @alias module:model/EntityMappingRequest
     * @param clientId {String} A unique identifier supplied by the user. ClientId is saved to the user's Concordance universe and will be used as the identifier for that entity within the universe.
     * @param clientName {String} Name of entity to match.
     */
    constructor(clientId, clientName) { 
        
        EntityMappingRequest.initialize(this, clientId, clientName);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, clientId, clientName) { 
        obj['clientId'] = clientId;
        obj['clientName'] = clientName;
    }

    /**
     * Constructs a <code>EntityMappingRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EntityMappingRequest} obj Optional instance to populate.
     * @return {module:model/EntityMappingRequest} The populated <code>EntityMappingRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntityMappingRequest();

            if (data.hasOwnProperty('clientId')) {
                obj['clientId'] = ApiClient.convertToType(data['clientId'], 'String');
            }
            if (data.hasOwnProperty('entityId')) {
                obj['entityId'] = ApiClient.convertToType(data['entityId'], 'String');
            }
            if (data.hasOwnProperty('clientName')) {
                obj['clientName'] = ApiClient.convertToType(data['clientName'], 'String');
            }
            if (data.hasOwnProperty('clientCountry')) {
                obj['clientCountry'] = ApiClient.convertToType(data['clientCountry'], 'String');
            }
            if (data.hasOwnProperty('clientState')) {
                obj['clientState'] = ApiClient.convertToType(data['clientState'], 'String');
            }
            if (data.hasOwnProperty('clientUrl')) {
                obj['clientUrl'] = ApiClient.convertToType(data['clientUrl'], 'String');
            }
        }
        return obj;
    }


}

/**
 * A unique identifier supplied by the user. ClientId is saved to the user's Concordance universe and will be used as the identifier for that entity within the universe.
 * @member {String} clientId
 */
EntityMappingRequest.prototype['clientId'] = undefined;

/**
 * FactSet Entity Identifier mapped to the submitted entity.
 * @member {String} entityId
 */
EntityMappingRequest.prototype['entityId'] = undefined;

/**
 * Name of entity to match.
 * @member {String} clientName
 */
EntityMappingRequest.prototype['clientName'] = undefined;

/**
 * ISO2 country code corresponding to the Entity name.
 * @member {String} clientCountry
 */
EntityMappingRequest.prototype['clientCountry'] = undefined;

/**
 * ISO Code of State or Province location to map Entity.
 * @member {String} clientState
 */
EntityMappingRequest.prototype['clientState'] = undefined;

/**
 * URL corresponding to the entity name.
 * @member {String} clientUrl
 */
EntityMappingRequest.prototype['clientUrl'] = undefined;






export default EntityMappingRequest;

