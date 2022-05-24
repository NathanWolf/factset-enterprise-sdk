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
import InlineResponse20011EstimatesFirstFiscalYearRatiosDividendYield from './InlineResponse20011EstimatesFirstFiscalYearRatiosDividendYield';
import InlineResponse20011EstimatesFirstFiscalYearRatiosEnterpriseValueEbit from './InlineResponse20011EstimatesFirstFiscalYearRatiosEnterpriseValueEbit';
import InlineResponse20011EstimatesFirstFiscalYearRatiosEnterpriseValueEbitda from './InlineResponse20011EstimatesFirstFiscalYearRatiosEnterpriseValueEbitda';
import InlineResponse20011EstimatesFirstFiscalYearRatiosEnterpriseValueSales from './InlineResponse20011EstimatesFirstFiscalYearRatiosEnterpriseValueSales';
import InlineResponse20011EstimatesFirstFiscalYearRatiosPriceBookValue from './InlineResponse20011EstimatesFirstFiscalYearRatiosPriceBookValue';
import InlineResponse20011EstimatesFirstFiscalYearRatiosPriceCashFlow from './InlineResponse20011EstimatesFirstFiscalYearRatiosPriceCashFlow';
import InlineResponse20011EstimatesFirstFiscalYearRatiosPriceEarnings from './InlineResponse20011EstimatesFirstFiscalYearRatiosPriceEarnings';
import InlineResponse20011EstimatesFirstFiscalYearRatiosPriceEarningsGrowth from './InlineResponse20011EstimatesFirstFiscalYearRatiosPriceEarningsGrowth';
import InlineResponse20011EstimatesFirstFiscalYearRatiosPriceFreeCashFlow from './InlineResponse20011EstimatesFirstFiscalYearRatiosPriceFreeCashFlow';
import InlineResponse20011EstimatesFirstFiscalYearRatiosPriceSales from './InlineResponse20011EstimatesFirstFiscalYearRatiosPriceSales';

/**
 * The InlineResponse20011EstimatesFirstFiscalYearRatios model module.
 * @module model/InlineResponse20011EstimatesFirstFiscalYearRatios
 * @version 0.10.0
 */
class InlineResponse20011EstimatesFirstFiscalYearRatios {
    /**
     * Constructs a new <code>InlineResponse20011EstimatesFirstFiscalYearRatios</code>.
     * Ratios.
     * @alias module:model/InlineResponse20011EstimatesFirstFiscalYearRatios
     */
    constructor() { 
        
        InlineResponse20011EstimatesFirstFiscalYearRatios.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20011EstimatesFirstFiscalYearRatios</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20011EstimatesFirstFiscalYearRatios} obj Optional instance to populate.
     * @return {module:model/InlineResponse20011EstimatesFirstFiscalYearRatios} The populated <code>InlineResponse20011EstimatesFirstFiscalYearRatios</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20011EstimatesFirstFiscalYearRatios();

            if (data.hasOwnProperty('priceSales')) {
                obj['priceSales'] = InlineResponse20011EstimatesFirstFiscalYearRatiosPriceSales.constructFromObject(data['priceSales']);
            }
            if (data.hasOwnProperty('priceEarnings')) {
                obj['priceEarnings'] = InlineResponse20011EstimatesFirstFiscalYearRatiosPriceEarnings.constructFromObject(data['priceEarnings']);
            }
            if (data.hasOwnProperty('priceEarningsGrowth')) {
                obj['priceEarningsGrowth'] = InlineResponse20011EstimatesFirstFiscalYearRatiosPriceEarningsGrowth.constructFromObject(data['priceEarningsGrowth']);
            }
            if (data.hasOwnProperty('priceBookValue')) {
                obj['priceBookValue'] = InlineResponse20011EstimatesFirstFiscalYearRatiosPriceBookValue.constructFromObject(data['priceBookValue']);
            }
            if (data.hasOwnProperty('priceCashFlow')) {
                obj['priceCashFlow'] = InlineResponse20011EstimatesFirstFiscalYearRatiosPriceCashFlow.constructFromObject(data['priceCashFlow']);
            }
            if (data.hasOwnProperty('priceFreeCashFlow')) {
                obj['priceFreeCashFlow'] = InlineResponse20011EstimatesFirstFiscalYearRatiosPriceFreeCashFlow.constructFromObject(data['priceFreeCashFlow']);
            }
            if (data.hasOwnProperty('dividendYield')) {
                obj['dividendYield'] = InlineResponse20011EstimatesFirstFiscalYearRatiosDividendYield.constructFromObject(data['dividendYield']);
            }
            if (data.hasOwnProperty('enterpriseValueEbit')) {
                obj['enterpriseValueEbit'] = InlineResponse20011EstimatesFirstFiscalYearRatiosEnterpriseValueEbit.constructFromObject(data['enterpriseValueEbit']);
            }
            if (data.hasOwnProperty('enterpriseValueEbitda')) {
                obj['enterpriseValueEbitda'] = InlineResponse20011EstimatesFirstFiscalYearRatiosEnterpriseValueEbitda.constructFromObject(data['enterpriseValueEbitda']);
            }
            if (data.hasOwnProperty('enterpriseValueSales')) {
                obj['enterpriseValueSales'] = InlineResponse20011EstimatesFirstFiscalYearRatiosEnterpriseValueSales.constructFromObject(data['enterpriseValueSales']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20011EstimatesFirstFiscalYearRatiosPriceSales} priceSales
 */
InlineResponse20011EstimatesFirstFiscalYearRatios.prototype['priceSales'] = undefined;

/**
 * @member {module:model/InlineResponse20011EstimatesFirstFiscalYearRatiosPriceEarnings} priceEarnings
 */
InlineResponse20011EstimatesFirstFiscalYearRatios.prototype['priceEarnings'] = undefined;

/**
 * @member {module:model/InlineResponse20011EstimatesFirstFiscalYearRatiosPriceEarningsGrowth} priceEarningsGrowth
 */
InlineResponse20011EstimatesFirstFiscalYearRatios.prototype['priceEarningsGrowth'] = undefined;

/**
 * @member {module:model/InlineResponse20011EstimatesFirstFiscalYearRatiosPriceBookValue} priceBookValue
 */
InlineResponse20011EstimatesFirstFiscalYearRatios.prototype['priceBookValue'] = undefined;

/**
 * @member {module:model/InlineResponse20011EstimatesFirstFiscalYearRatiosPriceCashFlow} priceCashFlow
 */
InlineResponse20011EstimatesFirstFiscalYearRatios.prototype['priceCashFlow'] = undefined;

/**
 * @member {module:model/InlineResponse20011EstimatesFirstFiscalYearRatiosPriceFreeCashFlow} priceFreeCashFlow
 */
InlineResponse20011EstimatesFirstFiscalYearRatios.prototype['priceFreeCashFlow'] = undefined;

/**
 * @member {module:model/InlineResponse20011EstimatesFirstFiscalYearRatiosDividendYield} dividendYield
 */
InlineResponse20011EstimatesFirstFiscalYearRatios.prototype['dividendYield'] = undefined;

/**
 * @member {module:model/InlineResponse20011EstimatesFirstFiscalYearRatiosEnterpriseValueEbit} enterpriseValueEbit
 */
InlineResponse20011EstimatesFirstFiscalYearRatios.prototype['enterpriseValueEbit'] = undefined;

/**
 * @member {module:model/InlineResponse20011EstimatesFirstFiscalYearRatiosEnterpriseValueEbitda} enterpriseValueEbitda
 */
InlineResponse20011EstimatesFirstFiscalYearRatios.prototype['enterpriseValueEbitda'] = undefined;

/**
 * @member {module:model/InlineResponse20011EstimatesFirstFiscalYearRatiosEnterpriseValueSales} enterpriseValueSales
 */
InlineResponse20011EstimatesFirstFiscalYearRatios.prototype['enterpriseValueSales'] = undefined;






export default InlineResponse20011EstimatesFirstFiscalYearRatios;

