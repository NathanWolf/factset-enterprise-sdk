/**
 * FactSet Estimates
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ConsensusEstimate model module.
 * @module model/ConsensusEstimate
 * @version 0.9.0
 */
class ConsensusEstimate {
    /**
     * Constructs a new <code>ConsensusEstimate</code>.
     * @alias module:model/ConsensusEstimate
     */
    constructor() { 
        
        ConsensusEstimate.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ConsensusEstimate</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConsensusEstimate} obj Optional instance to populate.
     * @return {module:model/ConsensusEstimate} The populated <code>ConsensusEstimate</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConsensusEstimate();

            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('metric')) {
                obj['metric'] = ApiClient.convertToType(data['metric'], 'String');
            }
            if (data.hasOwnProperty('periodicity')) {
                obj['periodicity'] = ApiClient.convertToType(data['periodicity'], 'String');
            }
            if (data.hasOwnProperty('fiscalPeriod')) {
                obj['fiscalPeriod'] = ApiClient.convertToType(data['fiscalPeriod'], 'Number');
            }
            if (data.hasOwnProperty('fiscalYear')) {
                obj['fiscalYear'] = ApiClient.convertToType(data['fiscalYear'], 'Number');
            }
            if (data.hasOwnProperty('fiscalEndDate')) {
                obj['fiscalEndDate'] = ApiClient.convertToType(data['fiscalEndDate'], 'Date');
            }
            if (data.hasOwnProperty('relativePeriod')) {
                obj['relativePeriod'] = ApiClient.convertToType(data['relativePeriod'], 'Number');
            }
            if (data.hasOwnProperty('estimateDate')) {
                obj['estimateDate'] = ApiClient.convertToType(data['estimateDate'], 'Date');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('mean')) {
                obj['mean'] = ApiClient.convertToType(data['mean'], 'Number');
            }
            if (data.hasOwnProperty('median')) {
                obj['median'] = ApiClient.convertToType(data['median'], 'Number');
            }
            if (data.hasOwnProperty('standardDeviation')) {
                obj['standardDeviation'] = ApiClient.convertToType(data['standardDeviation'], 'Number');
            }
            if (data.hasOwnProperty('high')) {
                obj['high'] = ApiClient.convertToType(data['high'], 'Number');
            }
            if (data.hasOwnProperty('low')) {
                obj['low'] = ApiClient.convertToType(data['low'], 'Number');
            }
            if (data.hasOwnProperty('estimateCount')) {
                obj['estimateCount'] = ApiClient.convertToType(data['estimateCount'], 'Number');
            }
            if (data.hasOwnProperty('up')) {
                obj['up'] = ApiClient.convertToType(data['up'], 'Number');
            }
            if (data.hasOwnProperty('down')) {
                obj['down'] = ApiClient.convertToType(data['down'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
ConsensusEstimate.prototype['requestId'] = undefined;

/**
 * Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
 * @member {String} fsymId
 */
ConsensusEstimate.prototype['fsymId'] = undefined;

/**
 * Company's Financial statement 'metric' that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034)
 * @member {String} metric
 */
ConsensusEstimate.prototype['metric'] = undefined;

/**
 * The reporting interval for the estimate. This is derived from Estimate Date and is translated to the Period List = ANN, QTR, SEMI, LTMA, or NMTA.
 * @member {String} periodicity
 */
ConsensusEstimate.prototype['periodicity'] = undefined;

/**
 * Company's 'fiscal period' for the estimate record. Periods for periodicity of ANN = 1, and SEMI = 2. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598).
 * @member {Number} fiscalPeriod
 */
ConsensusEstimate.prototype['fiscalPeriod'] = undefined;

/**
 * Company's 'fiscal year' for the estimate record. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
 * @member {Number} fiscalYear
 */
ConsensusEstimate.prototype['fiscalYear'] = undefined;

/**
 * Company's 'fiscal end date' for the estimate record expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
 * @member {Date} fiscalEndDate
 */
ConsensusEstimate.prototype['fiscalEndDate'] = undefined;

/**
 * 'Fiscal period' based on relationship to 'estimate date'. This is not applicable for fixed-consensus endpoint. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
 * @member {Number} relativePeriod
 */
ConsensusEstimate.prototype['relativePeriod'] = undefined;

/**
 * Date of estimate expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16598)
 * @member {Date} estimateDate
 */
ConsensusEstimate.prototype['estimateDate'] = undefined;

/**
 * Currency used estimates in consensus calculations. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
ConsensusEstimate.prototype['currency'] = undefined;

/**
 * Mean of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)
 * @member {Number} mean
 */
ConsensusEstimate.prototype['mean'] = undefined;

/**
 * Median of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)
 * @member {Number} median
 */
ConsensusEstimate.prototype['median'] = undefined;

/**
 * Standard deviation of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)
 * @member {Number} standardDeviation
 */
ConsensusEstimate.prototype['standardDeviation'] = undefined;

/**
 * Highest estimate in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).
 * @member {Number} high
 */
ConsensusEstimate.prototype['high'] = undefined;

/**
 * Lowest estimate in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)
 * @member {Number} low
 */
ConsensusEstimate.prototype['low'] = undefined;

/**
 * Count or NEST of estimates in consensus calculation. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)
 * @member {Number} estimateCount
 */
ConsensusEstimate.prototype['estimateCount'] = undefined;

/**
 * Number of Up Revisions within the consensus for the metric and period. The default window size is 100 days For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).
 * @member {Number} up
 */
ConsensusEstimate.prototype['up'] = undefined;

/**
 * Number of Up Revisions within the consensus for the metric and period. The default window size is 100 days. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).
 * @member {Number} down
 */
ConsensusEstimate.prototype['down'] = undefined;






export default ConsensusEstimate;

