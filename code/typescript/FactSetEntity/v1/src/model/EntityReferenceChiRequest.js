/**
 * FactSet Entity API
 * Using an entity centric data model, FactSet's Entity API provides access to FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the necessary relationships and connections to create a foundation that tightly correlates disparate sources of information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities. 
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The EntityReferenceChiRequest model module.
 * @module model/EntityReferenceChiRequest
 */
class EntityReferenceChiRequest {
    /**
     * Constructs a new <code>EntityReferenceChiRequest</code>.
     * Entity Reference Request Body
     * @alias module:model/EntityReferenceChiRequest
     * @param ids {Array.<String>} Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, BBG and SEDOL are accepted input. 
     */
    constructor(ids) { 
        
        EntityReferenceChiRequest.initialize(this, ids);
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
     * Constructs a <code>EntityReferenceChiRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EntityReferenceChiRequest} obj Optional instance to populate.
     * @return {module:model/EntityReferenceChiRequest} The populated <code>EntityReferenceChiRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntityReferenceChiRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, BBG and SEDOL are accepted input. 
 * @member {Array.<String>} ids
 */
EntityReferenceChiRequest.prototype['ids'] = undefined;






export default EntityReferenceChiRequest;

