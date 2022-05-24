/**
 * Quotes API For Digital Portals
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile from './InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile';

/**
 * The InlineResponse20062DataTargetMarketClientObjectivesAndNeeds model module.
 * @module model/InlineResponse20062DataTargetMarketClientObjectivesAndNeeds
 * @version 0.10.0
 */
class InlineResponse20062DataTargetMarketClientObjectivesAndNeeds {
    /**
     * Constructs a new <code>InlineResponse20062DataTargetMarketClientObjectivesAndNeeds</code>.
     * Characterizes the investment product regarding its ability to serve specific investment objectives.
     * @alias module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeeds
     */
    constructor() { 
        
        InlineResponse20062DataTargetMarketClientObjectivesAndNeeds.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20062DataTargetMarketClientObjectivesAndNeeds</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeeds} obj Optional instance to populate.
     * @return {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeeds} The populated <code>InlineResponse20062DataTargetMarketClientObjectivesAndNeeds</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20062DataTargetMarketClientObjectivesAndNeeds();

            if (data.hasOwnProperty('returnProfile')) {
                obj['returnProfile'] = InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile.constructFromObject(data['returnProfile']);
            }
            if (data.hasOwnProperty('maturityDate')) {
                obj['maturityDate'] = ApiClient.convertToType(data['maturityDate'], 'Date');
            }
            if (data.hasOwnProperty('mayBeTerminatedEarly')) {
                obj['mayBeTerminatedEarly'] = ApiClient.convertToType(data['mayBeTerminatedEarly'], 'String');
            }
            if (data.hasOwnProperty('specificInvestmentNeed')) {
                obj['specificInvestmentNeed'] = ApiClient.convertToType(data['specificInvestmentNeed'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile} returnProfile
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeeds.prototype['returnProfile'] = undefined;

/**
 * Maturity date of the investment product.
 * @member {Date} maturityDate
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeeds.prototype['maturityDate'] = undefined;

/**
 * Indicates whether the investment product is unsuitable for investors not accepting financial products with potential termination prior to maturity. (That means, a \"yes\" value indicates that the product may not last until maturity and thus conflicts with an investor profile rejecting premature redemption.) The termination could be initiated by the issuer (callable), by the investor (puttable) or automatically due to an event, e.g. barrier breach (auto-callable).
 * @member {module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeeds.MayBeTerminatedEarlyEnum} mayBeTerminatedEarly
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeeds.prototype['mayBeTerminatedEarly'] = undefined;

/**
 * Indicates whether the investment product is suitable for investors with a specific investment need. This attribute provides either a general statement (yes or no) or a set of needs (green investment, ethical investment, islamic banking, Environmental, social and governance (ESG), other) covered by the product.
 * @member {Array.<module:model/InlineResponse20062DataTargetMarketClientObjectivesAndNeeds.SpecificInvestmentNeedEnum>} specificInvestmentNeed
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeeds.prototype['specificInvestmentNeed'] = undefined;





/**
 * Allowed values for the <code>mayBeTerminatedEarly</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeeds['MayBeTerminatedEarlyEnum'] = {

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
 * Allowed values for the <code>specificInvestmentNeed</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20062DataTargetMarketClientObjectivesAndNeeds['SpecificInvestmentNeedEnum'] = {

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
     * value: "green"
     * @const
     */
    "green": "green",

    /**
     * value: "ethical"
     * @const
     */
    "ethical": "ethical",

    /**
     * value: "islamic"
     * @const
     */
    "islamic": "islamic",

    /**
     * value: "esg"
     * @const
     */
    "esg": "esg",

    /**
     * value: "other"
     * @const
     */
    "other": "other"
};



export default InlineResponse20062DataTargetMarketClientObjectivesAndNeeds;

