/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse2004RecommendationCounts model module.
 * @module model/InlineResponse2004RecommendationCounts
 * @version 0.9.2
 */
class InlineResponse2004RecommendationCounts {
    /**
     * Constructs a new <code>InlineResponse2004RecommendationCounts</code>.
     * Number of recommendations.
     * @alias module:model/InlineResponse2004RecommendationCounts
     */
    constructor() { 
        
        InlineResponse2004RecommendationCounts.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004RecommendationCounts</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004RecommendationCounts} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004RecommendationCounts} The populated <code>InlineResponse2004RecommendationCounts</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004RecommendationCounts();

            if (data.hasOwnProperty('total')) {
                obj['total'] = ApiClient.convertToType(data['total'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Total number of recommendations included in the current recommendation consensus (see attribute `recommendation.consensus`).
 * @member {Number} total
 */
InlineResponse2004RecommendationCounts.prototype['total'] = undefined;






export default InlineResponse2004RecommendationCounts;

