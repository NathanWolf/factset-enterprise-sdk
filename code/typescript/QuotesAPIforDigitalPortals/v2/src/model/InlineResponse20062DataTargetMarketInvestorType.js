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
 * The InlineResponse20062DataTargetMarketInvestorType model module.
 * @module model/InlineResponse20062DataTargetMarketInvestorType
 * @version 0.9.2
 */
class InlineResponse20062DataTargetMarketInvestorType {
    /**
     * Constructs a new <code>InlineResponse20062DataTargetMarketInvestorType</code>.
     * Describes the intended type of investors for an investment product.
     * @alias module:model/InlineResponse20062DataTargetMarketInvestorType
     */
    constructor() { 
        
        InlineResponse20062DataTargetMarketInvestorType.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20062DataTargetMarketInvestorType</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20062DataTargetMarketInvestorType} obj Optional instance to populate.
     * @return {module:model/InlineResponse20062DataTargetMarketInvestorType} The populated <code>InlineResponse20062DataTargetMarketInvestorType</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20062DataTargetMarketInvestorType();

            if (data.hasOwnProperty('retail')) {
                obj['retail'] = ApiClient.convertToType(data['retail'], 'String');
            }
            if (data.hasOwnProperty('professional')) {
                obj['professional'] = ApiClient.convertToType(data['professional'], 'String');
            }
            if (data.hasOwnProperty('eligibleCounterParty')) {
                obj['eligibleCounterParty'] = ApiClient.convertToType(data['eligibleCounterParty'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Indicates whether the investment product is suitable for retail clients.
 * @member {module:model/InlineResponse20062DataTargetMarketInvestorType.RetailEnum} retail
 */
InlineResponse20062DataTargetMarketInvestorType.prototype['retail'] = undefined;

/**
 * Indicates whether the investment product is suitable for professional clients.
 * @member {module:model/InlineResponse20062DataTargetMarketInvestorType.ProfessionalEnum} professional
 */
InlineResponse20062DataTargetMarketInvestorType.prototype['professional'] = undefined;

/**
 * Indicates whether the investment product is suitable for clients of type eligible counterparty.
 * @member {module:model/InlineResponse20062DataTargetMarketInvestorType.EligibleCounterPartyEnum} eligibleCounterParty
 */
InlineResponse20062DataTargetMarketInvestorType.prototype['eligibleCounterParty'] = undefined;





/**
 * Allowed values for the <code>retail</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketInvestorType['RetailEnum'] = {

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
    "neutral": "neutral"
};


/**
 * Allowed values for the <code>professional</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketInvestorType['ProfessionalEnum'] = {

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
     * value: "perSe"
     * @const
     */
    "perSe": "perSe",

    /**
     * value: "elective"
     * @const
     */
    "elective": "elective",

    /**
     * value: "both"
     * @const
     */
    "both": "both"
};


/**
 * Allowed values for the <code>eligibleCounterParty</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketInvestorType['EligibleCounterPartyEnum'] = {

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
    "neutral": "neutral"
};



export default InlineResponse20062DataTargetMarketInvestorType;

