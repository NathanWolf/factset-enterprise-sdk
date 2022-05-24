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
import RecommendationListRevisionListDataActiveRange from './RecommendationListRevisionListDataActiveRange';

/**
 * The RecommendationListRevisionListData model module.
 * @module model/RecommendationListRevisionListData
 * @version 0.10.0
 */
class RecommendationListRevisionListData {
    /**
     * Constructs a new <code>RecommendationListRevisionListData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/RecommendationListRevisionListData
     * @param idList {Number} Identifier of the recommendation list.
     */
    constructor(idList) { 
        
        RecommendationListRevisionListData.initialize(this, idList);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, idList) { 
        obj['idList'] = idList;
    }

    /**
     * Constructs a <code>RecommendationListRevisionListData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RecommendationListRevisionListData} obj Optional instance to populate.
     * @return {module:model/RecommendationListRevisionListData} The populated <code>RecommendationListRevisionListData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecommendationListRevisionListData();

            if (data.hasOwnProperty('idList')) {
                obj['idList'] = ApiClient.convertToType(data['idList'], 'Number');
            }
            if (data.hasOwnProperty('idRevision')) {
                obj['idRevision'] = ApiClient.convertToType(data['idRevision'], ['Number']);
            }
            if (data.hasOwnProperty('activeRange')) {
                obj['activeRange'] = RecommendationListRevisionListDataActiveRange.constructFromObject(data['activeRange']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the recommendation list.
 * @member {Number} idList
 */
RecommendationListRevisionListData.prototype['idList'] = undefined;

/**
 * @member {Array.<Number>} idRevision
 */
RecommendationListRevisionListData.prototype['idRevision'] = undefined;

/**
 * @member {module:model/RecommendationListRevisionListDataActiveRange} activeRange
 */
RecommendationListRevisionListData.prototype['activeRange'] = undefined;






export default RecommendationListRevisionListData;

