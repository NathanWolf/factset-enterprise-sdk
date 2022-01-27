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
import InlineResponse2004DataCategorization from './InlineResponse2004DataCategorization';
import InlineResponse2004DataCompliance from './InlineResponse2004DataCompliance';
import InlineResponse2004DataCoupon from './InlineResponse2004DataCoupon';
import InlineResponse2004DataIssue from './InlineResponse2004DataIssue';
import InlineResponse2004DataIssuer from './InlineResponse2004DataIssuer';
import InlineResponse2004DataLifeCycle from './InlineResponse2004DataLifeCycle';
import InlineResponse2004DataLifeCycleMaturityPerpetual from './InlineResponse2004DataLifeCycleMaturityPerpetual';
import InlineResponse2004DataMacaulayDuration from './InlineResponse2004DataMacaulayDuration';
import InlineResponse2004DataMarket from './InlineResponse2004DataMarket';
import InlineResponse2004DataRatingSystem1 from './InlineResponse2004DataRatingSystem1';
import InlineResponse2004DataRatingSystem2 from './InlineResponse2004DataRatingSystem2';
import InlineResponse2004DataSensitivities from './InlineResponse2004DataSensitivities';
import InlineResponse2004DataTradedValue from './InlineResponse2004DataTradedValue';
import InlineResponse2004DataTradingVolume from './InlineResponse2004DataTradingVolume';
import InlineResponse2004DataValueUnit from './InlineResponse2004DataValueUnit';
import InlineResponse2004DataYield from './InlineResponse2004DataYield';

/**
 * The InlineResponse2004Data model module.
 * @module model/InlineResponse2004Data
 * @version 0.9.0
 */
class InlineResponse2004Data {
    /**
     * Constructs a new <code>InlineResponse2004Data</code>.
     * Possible values and value ranges of the parameters.
     * @alias module:model/InlineResponse2004Data
     */
    constructor() { 
        
        InlineResponse2004Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004Data} The populated <code>InlineResponse2004Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004Data();

            if (data.hasOwnProperty('totalCount')) {
                obj['totalCount'] = ApiClient.convertToType(data['totalCount'], 'Number');
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = ApiClient.convertToType(data['valueUnit'], [InlineResponse2004DataValueUnit]);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = ApiClient.convertToType(data['market'], [InlineResponse2004DataMarket]);
            }
            if (data.hasOwnProperty('categorization')) {
                obj['categorization'] = ApiClient.convertToType(data['categorization'], [InlineResponse2004DataCategorization]);
            }
            if (data.hasOwnProperty('lifeCycle')) {
                obj['lifeCycle'] = InlineResponse2004DataLifeCycle.constructFromObject(data['lifeCycle']);
            }
            if (data.hasOwnProperty('subordinated')) {
                obj['subordinated'] = ApiClient.convertToType(data['subordinated'], [InlineResponse2004DataLifeCycleMaturityPerpetual]);
            }
            if (data.hasOwnProperty('ratingSystem1')) {
                obj['ratingSystem1'] = InlineResponse2004DataRatingSystem1.constructFromObject(data['ratingSystem1']);
            }
            if (data.hasOwnProperty('ratingSystem2')) {
                obj['ratingSystem2'] = InlineResponse2004DataRatingSystem2.constructFromObject(data['ratingSystem2']);
            }
            if (data.hasOwnProperty('issuer')) {
                obj['issuer'] = InlineResponse2004DataIssuer.constructFromObject(data['issuer']);
            }
            if (data.hasOwnProperty('issue')) {
                obj['issue'] = InlineResponse2004DataIssue.constructFromObject(data['issue']);
            }
            if (data.hasOwnProperty('tradingVolume')) {
                obj['tradingVolume'] = InlineResponse2004DataTradingVolume.constructFromObject(data['tradingVolume']);
            }
            if (data.hasOwnProperty('compliance')) {
                obj['compliance'] = InlineResponse2004DataCompliance.constructFromObject(data['compliance']);
            }
            if (data.hasOwnProperty('coupon')) {
                obj['coupon'] = InlineResponse2004DataCoupon.constructFromObject(data['coupon']);
            }
            if (data.hasOwnProperty('yield')) {
                obj['yield'] = InlineResponse2004DataYield.constructFromObject(data['yield']);
            }
            if (data.hasOwnProperty('macaulayDuration')) {
                obj['macaulayDuration'] = InlineResponse2004DataMacaulayDuration.constructFromObject(data['macaulayDuration']);
            }
            if (data.hasOwnProperty('sensitivities')) {
                obj['sensitivities'] = InlineResponse2004DataSensitivities.constructFromObject(data['sensitivities']);
            }
            if (data.hasOwnProperty('tradedValue')) {
                obj['tradedValue'] = InlineResponse2004DataTradedValue.constructFromObject(data['tradedValue']);
            }
        }
        return obj;
    }


}

/**
 * Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges.
 * @member {Number} totalCount
 */
InlineResponse2004Data.prototype['totalCount'] = undefined;

/**
 * List of value unit identifiers. See endpoint `/basic/valueUnit/list` for possible values.
 * @member {Array.<module:model/InlineResponse2004DataValueUnit>} valueUnit
 */
InlineResponse2004Data.prototype['valueUnit'] = undefined;

/**
 * List of market identifiers. See endpoint `/basic/market/list` for possible values.
 * @member {Array.<module:model/InlineResponse2004DataMarket>} market
 */
InlineResponse2004Data.prototype['market'] = undefined;

/**
 * Lists of categories of the debt instruments' categorization. Starting with the most coarse level (one), for each level of the category system, the list of categories of the debt instruments, matching the parameters, is returned. See endpoint `/category/listBySystem` with `id=18` for possible values.
 * @member {Array.<module:model/InlineResponse2004DataCategorization>} categorization
 */
InlineResponse2004Data.prototype['categorization'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataLifeCycle} lifeCycle
 */
InlineResponse2004Data.prototype['lifeCycle'] = undefined;

/**
 * Indicates whether subordinated and non-subordinated are among the results. In case of default, subordinated debt instruments are redeemed with a lower priority than non-subordinated.
 * @member {Array.<module:model/InlineResponse2004DataLifeCycleMaturityPerpetual>} subordinated
 */
InlineResponse2004Data.prototype['subordinated'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataRatingSystem1} ratingSystem1
 */
InlineResponse2004Data.prototype['ratingSystem1'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataRatingSystem2} ratingSystem2
 */
InlineResponse2004Data.prototype['ratingSystem2'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataIssuer} issuer
 */
InlineResponse2004Data.prototype['issuer'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataIssue} issue
 */
InlineResponse2004Data.prototype['issue'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataTradingVolume} tradingVolume
 */
InlineResponse2004Data.prototype['tradingVolume'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataCompliance} compliance
 */
InlineResponse2004Data.prototype['compliance'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataCoupon} coupon
 */
InlineResponse2004Data.prototype['coupon'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataYield} yield
 */
InlineResponse2004Data.prototype['yield'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataMacaulayDuration} macaulayDuration
 */
InlineResponse2004Data.prototype['macaulayDuration'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataSensitivities} sensitivities
 */
InlineResponse2004Data.prototype['sensitivities'] = undefined;

/**
 * @member {module:model/InlineResponse2004DataTradedValue} tradedValue
 */
InlineResponse2004Data.prototype['tradedValue'] = undefined;






export default InlineResponse2004Data;

