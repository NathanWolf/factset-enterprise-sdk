/**
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
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
import StockNotationScreenerSearchDataValidationInstrumentSelectionList from './StockNotationScreenerSearchDataValidationInstrumentSelectionList';
import StockNotationScreenerSearchDataValidationMarket from './StockNotationScreenerSearchDataValidationMarket';
import StockNotationScreenerSearchDataValidationNotationSelectionList from './StockNotationScreenerSearchDataValidationNotationSelectionList';
import StockNotationScreenerSearchDataValidationPrices from './StockNotationScreenerSearchDataValidationPrices';
import StockNotationScreenerSearchDataValidationValueUnit from './StockNotationScreenerSearchDataValidationValueUnit';

/**
 * The StockNotationScreenerSearchDataValidation model module.
 * @module model/StockNotationScreenerSearchDataValidation
 * @version 0.10.0
 */
class StockNotationScreenerSearchDataValidation {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataValidation</code>.
     * Validation parameters.
     * @alias module:model/StockNotationScreenerSearchDataValidation
     */
    constructor() { 
        
        StockNotationScreenerSearchDataValidation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataValidation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataValidation} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataValidation} The populated <code>StockNotationScreenerSearchDataValidation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataValidation();

            if (data.hasOwnProperty('onlyActive')) {
                obj['onlyActive'] = ApiClient.convertToType(data['onlyActive'], 'Boolean');
            }
            if (data.hasOwnProperty('onlyNotSuspended')) {
                obj['onlyNotSuspended'] = ApiClient.convertToType(data['onlyNotSuspended'], 'Boolean');
            }
            if (data.hasOwnProperty('prices')) {
                obj['prices'] = StockNotationScreenerSearchDataValidationPrices.constructFromObject(data['prices']);
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = StockNotationScreenerSearchDataValidationValueUnit.constructFromObject(data['valueUnit']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = StockNotationScreenerSearchDataValidationMarket.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('instrumentSelectionList')) {
                obj['instrumentSelectionList'] = StockNotationScreenerSearchDataValidationInstrumentSelectionList.constructFromObject(data['instrumentSelectionList']);
            }
            if (data.hasOwnProperty('notationSelectionList')) {
                obj['notationSelectionList'] = StockNotationScreenerSearchDataValidationNotationSelectionList.constructFromObject(data['notationSelectionList']);
            }
        }
        return obj;
    }


}

/**
 * If `true`, only active notations will be returned. The term \"active\" reflects the fact that notations and related data are not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months.
 * @member {Boolean} onlyActive
 * @default true
 */
StockNotationScreenerSearchDataValidation.prototype['onlyActive'] = true;

/**
 * If `true`, only notations not suspended from trading will be returned.
 * @member {Boolean} onlyNotSuspended
 * @default false
 */
StockNotationScreenerSearchDataValidation.prototype['onlyNotSuspended'] = false;

/**
 * @member {module:model/StockNotationScreenerSearchDataValidationPrices} prices
 */
StockNotationScreenerSearchDataValidation.prototype['prices'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataValidationValueUnit} valueUnit
 */
StockNotationScreenerSearchDataValidation.prototype['valueUnit'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataValidationMarket} market
 */
StockNotationScreenerSearchDataValidation.prototype['market'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataValidationInstrumentSelectionList} instrumentSelectionList
 */
StockNotationScreenerSearchDataValidation.prototype['instrumentSelectionList'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataValidationNotationSelectionList} notationSelectionList
 */
StockNotationScreenerSearchDataValidation.prototype['notationSelectionList'] = undefined;






export default StockNotationScreenerSearchDataValidation;

