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
import InlineResponse2005DataCategories from './InlineResponse2005DataCategories';
import InlineResponse2005DataLevel from './InlineResponse2005DataLevel';

/**
 * The InlineResponse2005DataIndustryClassification model module.
 * @module model/InlineResponse2005DataIndustryClassification
 * @version 0.9.2
 */
class InlineResponse2005DataIndustryClassification {
    /**
     * Constructs a new <code>InlineResponse2005DataIndustryClassification</code>.
     * @alias module:model/InlineResponse2005DataIndustryClassification
     */
    constructor() { 
        
        InlineResponse2005DataIndustryClassification.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataIndustryClassification</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataIndustryClassification} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataIndustryClassification} The populated <code>InlineResponse2005DataIndustryClassification</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataIndustryClassification();

            if (data.hasOwnProperty('level')) {
                obj['level'] = InlineResponse2005DataLevel.constructFromObject(data['level']);
            }
            if (data.hasOwnProperty('categories')) {
                obj['categories'] = ApiClient.convertToType(data['categories'], [InlineResponse2005DataCategories]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2005DataLevel} level
 */
InlineResponse2005DataIndustryClassification.prototype['level'] = undefined;

/**
 * List of categories for the given level of the industry classification.
 * @member {Array.<module:model/InlineResponse2005DataCategories>} categories
 */
InlineResponse2005DataIndustryClassification.prototype['categories'] = undefined;






export default InlineResponse2005DataIndustryClassification;

