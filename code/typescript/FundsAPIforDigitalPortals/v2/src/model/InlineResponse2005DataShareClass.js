/**
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
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
import InlineResponse2005DataFundCompliance from './InlineResponse2005DataFundCompliance';
import InlineResponse2005DataFundCurrency from './InlineResponse2005DataFundCurrency';
import InlineResponse2005DataFundDomicile from './InlineResponse2005DataFundDomicile';
import InlineResponse2005DataShareClassAssetsUnderManagement from './InlineResponse2005DataShareClassAssetsUnderManagement';
import InlineResponse2005DataShareClassDistributing from './InlineResponse2005DataShareClassDistributing';
import InlineResponse2005DataShareClassFee from './InlineResponse2005DataShareClassFee';
import InlineResponse2005DataShareClassLifeCycle from './InlineResponse2005DataShareClassLifeCycle';
import InlineResponse2005DataShareClassMinimumInvestment from './InlineResponse2005DataShareClassMinimumInvestment';

/**
 * The InlineResponse2005DataShareClass model module.
 * @module model/InlineResponse2005DataShareClass
 * @version 0.10.0
 */
class InlineResponse2005DataShareClass {
    /**
     * Constructs a new <code>InlineResponse2005DataShareClass</code>.
     * Values and value ranges of the parameters related to share classes.
     * @alias module:model/InlineResponse2005DataShareClass
     */
    constructor() { 
        
        InlineResponse2005DataShareClass.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataShareClass</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataShareClass} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataShareClass} The populated <code>InlineResponse2005DataShareClass</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataShareClass();

            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], [InlineResponse2005DataFundCurrency]);
            }
            if (data.hasOwnProperty('distributing')) {
                obj['distributing'] = ApiClient.convertToType(data['distributing'], [InlineResponse2005DataShareClassDistributing]);
            }
            if (data.hasOwnProperty('registrationCountry')) {
                obj['registrationCountry'] = ApiClient.convertToType(data['registrationCountry'], [InlineResponse2005DataFundDomicile]);
            }
            if (data.hasOwnProperty('lifeCycle')) {
                obj['lifeCycle'] = InlineResponse2005DataShareClassLifeCycle.constructFromObject(data['lifeCycle']);
            }
            if (data.hasOwnProperty('minimumInvestment')) {
                obj['minimumInvestment'] = InlineResponse2005DataShareClassMinimumInvestment.constructFromObject(data['minimumInvestment']);
            }
            if (data.hasOwnProperty('assetsUnderManagement')) {
                obj['assetsUnderManagement'] = InlineResponse2005DataShareClassAssetsUnderManagement.constructFromObject(data['assetsUnderManagement']);
            }
            if (data.hasOwnProperty('compliance')) {
                obj['compliance'] = ApiClient.convertToType(data['compliance'], [InlineResponse2005DataFundCompliance]);
            }
            if (data.hasOwnProperty('fee')) {
                obj['fee'] = InlineResponse2005DataShareClassFee.constructFromObject(data['fee']);
            }
        }
        return obj;
    }


}

/**
 * List of main currency identifiers. See endpoint `/basic/valueUnit/currency/main/list` for possible values.
 * @member {Array.<module:model/InlineResponse2005DataFundCurrency>} currency
 */
InlineResponse2005DataShareClass.prototype['currency'] = undefined;

/**
 * Indicates whether distributing (`true`) and non-distributing share classes (`false`) are among the results.
 * @member {Array.<module:model/InlineResponse2005DataShareClassDistributing>} distributing
 */
InlineResponse2005DataShareClass.prototype['distributing'] = undefined;

/**
 * List of countries where the share classes have a trading registration. See endpoint `/basic/region/country/list` for possible values.
 * @member {Array.<module:model/InlineResponse2005DataFundDomicile>} registrationCountry
 */
InlineResponse2005DataShareClass.prototype['registrationCountry'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataShareClassLifeCycle} lifeCycle
 */
InlineResponse2005DataShareClass.prototype['lifeCycle'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataShareClassMinimumInvestment} minimumInvestment
 */
InlineResponse2005DataShareClass.prototype['minimumInvestment'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataShareClassAssetsUnderManagement} assetsUnderManagement
 */
InlineResponse2005DataShareClass.prototype['assetsUnderManagement'] = undefined;

/**
 * List of compliance properties for share classes. A given compliance property may appear in combination with other compliance properties. The attribute count represents the number of all occurences of a compliance property, that is in all existing combinations, whereby the latter are not listed separately. See endpoint `/instrument/complianceProperty/list` for the full list of compliance properties associated with instruments (across all asset classes).
 * @member {Array.<module:model/InlineResponse2005DataFundCompliance>} compliance
 */
InlineResponse2005DataShareClass.prototype['compliance'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataShareClassFee} fee
 */
InlineResponse2005DataShareClass.prototype['fee'] = undefined;






export default InlineResponse2005DataShareClass;

