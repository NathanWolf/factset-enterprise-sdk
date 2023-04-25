/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.9.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FIBalloonExtension from './FIBalloonExtension';
import FICashflows from './FICashflows';
import FIPrepayLockout from './FIPrepayLockout';
import FIServicerAdvancesForSecurities from './FIServicerAdvancesForSecurities';

/**
 * The FIStructuredProductsForSecurities model module.
 * @module model/FIStructuredProductsForSecurities
 */
class FIStructuredProductsForSecurities {
    /**
     * Constructs a new <code>FIStructuredProductsForSecurities</code>.
     * @alias module:model/FIStructuredProductsForSecurities
     */
    constructor() { 
        
        FIStructuredProductsForSecurities.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FIStructuredProductsForSecurities</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FIStructuredProductsForSecurities} obj Optional instance to populate.
     * @return {module:model/FIStructuredProductsForSecurities} The populated <code>FIStructuredProductsForSecurities</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FIStructuredProductsForSecurities();

            if (data.hasOwnProperty('servicerAdvances')) {
                obj['servicerAdvances'] = FIServicerAdvancesForSecurities.constructFromObject(data['servicerAdvances']);
            }
            if (data.hasOwnProperty('ignoreFinancialGuarantee')) {
                obj['ignoreFinancialGuarantee'] = ApiClient.convertToType(data['ignoreFinancialGuarantee'], 'String');
            }
            if (data.hasOwnProperty('cleanUpCallMethod')) {
                obj['cleanUpCallMethod'] = ApiClient.convertToType(data['cleanUpCallMethod'], 'Boolean');
            }
            if (data.hasOwnProperty('doOPTRedeem')) {
                obj['doOPTRedeem'] = ApiClient.convertToType(data['doOPTRedeem'], 'String');
            }
            if (data.hasOwnProperty('prepayLockout')) {
                obj['prepayLockout'] = FIPrepayLockout.constructFromObject(data['prepayLockout']);
            }
            if (data.hasOwnProperty('cashflows')) {
                obj['cashflows'] = FICashflows.constructFromObject(data['cashflows']);
            }
            if (data.hasOwnProperty('balloonExtension')) {
                obj['balloonExtension'] = FIBalloonExtension.constructFromObject(data['balloonExtension']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/FIServicerAdvancesForSecurities} servicerAdvances
 */
FIStructuredProductsForSecurities.prototype['servicerAdvances'] = undefined;

/**
 * Ignore Financial Guarantee
 * @member {String} ignoreFinancialGuarantee
 */
FIStructuredProductsForSecurities.prototype['ignoreFinancialGuarantee'] = undefined;

/**
 * Cleanup Call Method
 * @member {Boolean} cleanUpCallMethod
 */
FIStructuredProductsForSecurities.prototype['cleanUpCallMethod'] = undefined;

/**
 * Do OPT Redeem
 * @member {String} doOPTRedeem
 */
FIStructuredProductsForSecurities.prototype['doOPTRedeem'] = undefined;

/**
 * @member {module:model/FIPrepayLockout} prepayLockout
 */
FIStructuredProductsForSecurities.prototype['prepayLockout'] = undefined;

/**
 * @member {module:model/FICashflows} cashflows
 */
FIStructuredProductsForSecurities.prototype['cashflows'] = undefined;

/**
 * @member {module:model/FIBalloonExtension} balloonExtension
 */
FIStructuredProductsForSecurities.prototype['balloonExtension'] = undefined;






export default FIStructuredProductsForSecurities;

