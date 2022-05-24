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
import InlineResponse2001DataProfitLossPotential from './InlineResponse2001DataProfitLossPotential';
import InlineResponse2001DataProfitLossRealized from './InlineResponse2001DataProfitLossRealized';
import InlineResponse2001DataProfitLossToday from './InlineResponse2001DataProfitLossToday';
import InlineResponse2001DataProfitLossTotal from './InlineResponse2001DataProfitLossTotal';

/**
 * The InlineResponse2001DataProfitLoss model module.
 * @module model/InlineResponse2001DataProfitLoss
 * @version 0.9.2
 */
class InlineResponse2001DataProfitLoss {
    /**
     * Constructs a new <code>InlineResponse2001DataProfitLoss</code>.
     * Profit and loss analysis. Positive values indicate profit; negative values indicate loss. All calculations are performed in the currency of the portfolio.
     * @alias module:model/InlineResponse2001DataProfitLoss
     */
    constructor() { 
        
        InlineResponse2001DataProfitLoss.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2001DataProfitLoss</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2001DataProfitLoss} obj Optional instance to populate.
     * @return {module:model/InlineResponse2001DataProfitLoss} The populated <code>InlineResponse2001DataProfitLoss</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2001DataProfitLoss();

            if (data.hasOwnProperty('realized')) {
                obj['realized'] = InlineResponse2001DataProfitLossRealized.constructFromObject(data['realized']);
            }
            if (data.hasOwnProperty('potential')) {
                obj['potential'] = InlineResponse2001DataProfitLossPotential.constructFromObject(data['potential']);
            }
            if (data.hasOwnProperty('total')) {
                obj['total'] = InlineResponse2001DataProfitLossTotal.constructFromObject(data['total']);
            }
            if (data.hasOwnProperty('today')) {
                obj['today'] = InlineResponse2001DataProfitLossToday.constructFromObject(data['today']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2001DataProfitLossRealized} realized
 */
InlineResponse2001DataProfitLoss.prototype['realized'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataProfitLossPotential} potential
 */
InlineResponse2001DataProfitLoss.prototype['potential'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataProfitLossTotal} total
 */
InlineResponse2001DataProfitLoss.prototype['total'] = undefined;

/**
 * @member {module:model/InlineResponse2001DataProfitLossToday} today
 */
InlineResponse2001DataProfitLoss.prototype['today'] = undefined;






export default InlineResponse2001DataProfitLoss;

