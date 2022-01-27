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
import InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany from './InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany';

/**
 * The InlineResponse20062DataTargetMarketKnowledgeAndExperience model module.
 * @module model/InlineResponse20062DataTargetMarketKnowledgeAndExperience
 * @version 0.9.0
 */
class InlineResponse20062DataTargetMarketKnowledgeAndExperience {
    /**
     * Constructs a new <code>InlineResponse20062DataTargetMarketKnowledgeAndExperience</code>.
     * Describes the level of knowledge and experience an investor should have in order to acquire the investment product.
     * @alias module:model/InlineResponse20062DataTargetMarketKnowledgeAndExperience
     */
    constructor() { 
        
        InlineResponse20062DataTargetMarketKnowledgeAndExperience.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20062DataTargetMarketKnowledgeAndExperience</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20062DataTargetMarketKnowledgeAndExperience} obj Optional instance to populate.
     * @return {module:model/InlineResponse20062DataTargetMarketKnowledgeAndExperience} The populated <code>InlineResponse20062DataTargetMarketKnowledgeAndExperience</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20062DataTargetMarketKnowledgeAndExperience();

            if (data.hasOwnProperty('basicInvestor')) {
                obj['basicInvestor'] = ApiClient.convertToType(data['basicInvestor'], 'String');
            }
            if (data.hasOwnProperty('informedInvestor')) {
                obj['informedInvestor'] = ApiClient.convertToType(data['informedInvestor'], 'String');
            }
            if (data.hasOwnProperty('advancedInvestor')) {
                obj['advancedInvestor'] = ApiClient.convertToType(data['advancedInvestor'], 'String');
            }
            if (data.hasOwnProperty('germany')) {
                obj['germany'] = InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany.constructFromObject(data['germany']);
            }
        }
        return obj;
    }


}

/**
 * Indicates whether the investment product is suitable for investors having basic knowledge and experience. Basic knowledge and experience means that the investor can make an informed investment decision based on the regulated and authorized offering documentation or with the help of basic information provided by the point of sale or the investor has no financial industry experience, i.e. the investment product is suitable for a first-time investor
 * @member {module:model/InlineResponse20062DataTargetMarketKnowledgeAndExperience.BasicInvestorEnum} basicInvestor
 */
InlineResponse20062DataTargetMarketKnowledgeAndExperience.prototype['basicInvestor'] = undefined;

/**
 * Indicates whether the investment product is suitable for investors with an informed level of knowledge and experience. Informed investors have the ability to understand the particular financial instrument. Additionally, the investor must have a number of investment holdings in relevant financial instruments or must be involved in frequent trading activity in those.
 * @member {module:model/InlineResponse20062DataTargetMarketKnowledgeAndExperience.InformedInvestorEnum} informedInvestor
 */
InlineResponse20062DataTargetMarketKnowledgeAndExperience.prototype['informedInvestor'] = undefined;

/**
 * Indicates whether the investment product is suitable for investors with an advanced level of knowledge and experience. An advanced investor has comprehensive understanding of relevant financial instruments. Additionally, the investor must have a large number of diverse investment holdings in relevant financial instruments; must be involved in frequent trading activity in those, must have had previous exposure to high-risk or complex investments or must have relevant financial industry experience.
 * @member {module:model/InlineResponse20062DataTargetMarketKnowledgeAndExperience.AdvancedInvestorEnum} advancedInvestor
 */
InlineResponse20062DataTargetMarketKnowledgeAndExperience.prototype['advancedInvestor'] = undefined;

/**
 * @member {module:model/InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany} germany
 */
InlineResponse20062DataTargetMarketKnowledgeAndExperience.prototype['germany'] = undefined;





/**
 * Allowed values for the <code>basicInvestor</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketKnowledgeAndExperience['BasicInvestorEnum'] = {

    /**
     * value: "yes"
     * @const
     */
    "yes": "yes",

    /**
     * value: "no"
     * @const
     */
    "no": "no",

    /**
     * value: "neutral"
     * @const
     */
    "neutral": "neutral",

    /**
     * value: "feedback"
     * @const
     */
    "feedback": "feedback"
};


/**
 * Allowed values for the <code>informedInvestor</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketKnowledgeAndExperience['InformedInvestorEnum'] = {

    /**
     * value: "yes"
     * @const
     */
    "yes": "yes",

    /**
     * value: "no"
     * @const
     */
    "no": "no",

    /**
     * value: "neutral"
     * @const
     */
    "neutral": "neutral",

    /**
     * value: "feedback"
     * @const
     */
    "feedback": "feedback"
};


/**
 * Allowed values for the <code>advancedInvestor</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketKnowledgeAndExperience['AdvancedInvestorEnum'] = {

    /**
     * value: "yes"
     * @const
     */
    "yes": "yes",

    /**
     * value: "no"
     * @const
     */
    "no": "no",

    /**
     * value: "neutral"
     * @const
     */
    "neutral": "neutral",

    /**
     * value: "feedback"
     * @const
     */
    "feedback": "feedback"
};



export default InlineResponse20062DataTargetMarketKnowledgeAndExperience;

