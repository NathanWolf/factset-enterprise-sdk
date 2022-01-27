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
import StockNotationScreenerSearchDataRatios1DividendYield from './StockNotationScreenerSearchDataRatios1DividendYield';
import StockNotationScreenerSearchDataRatios1EnterpriseValueEbit from './StockNotationScreenerSearchDataRatios1EnterpriseValueEbit';
import StockNotationScreenerSearchDataRatios1EnterpriseValueEbitda from './StockNotationScreenerSearchDataRatios1EnterpriseValueEbitda';
import StockNotationScreenerSearchDataRatios1EnterpriseValueSales from './StockNotationScreenerSearchDataRatios1EnterpriseValueSales';
import StockNotationScreenerSearchDataRatios1PriceBookValue from './StockNotationScreenerSearchDataRatios1PriceBookValue';
import StockNotationScreenerSearchDataRatios1PriceCashFlow from './StockNotationScreenerSearchDataRatios1PriceCashFlow';
import StockNotationScreenerSearchDataRatios1PriceEarnings from './StockNotationScreenerSearchDataRatios1PriceEarnings';
import StockNotationScreenerSearchDataRatios1PriceEarningsGrowth from './StockNotationScreenerSearchDataRatios1PriceEarningsGrowth';
import StockNotationScreenerSearchDataRatios1PriceFreeCashFlow from './StockNotationScreenerSearchDataRatios1PriceFreeCashFlow';
import StockNotationScreenerSearchDataRatios1PriceSales from './StockNotationScreenerSearchDataRatios1PriceSales';

/**
 * The StockNotationScreenerSearchDataRatios1 model module.
 * @module model/StockNotationScreenerSearchDataRatios1
 * @version 0.9.0
 */
class StockNotationScreenerSearchDataRatios1 {
    /**
     * Constructs a new <code>StockNotationScreenerSearchDataRatios1</code>.
     * Ratio parameters.
     * @alias module:model/StockNotationScreenerSearchDataRatios1
     */
    constructor() { 
        
        StockNotationScreenerSearchDataRatios1.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StockNotationScreenerSearchDataRatios1</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StockNotationScreenerSearchDataRatios1} obj Optional instance to populate.
     * @return {module:model/StockNotationScreenerSearchDataRatios1} The populated <code>StockNotationScreenerSearchDataRatios1</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StockNotationScreenerSearchDataRatios1();

            if (data.hasOwnProperty('priceSales')) {
                obj['priceSales'] = StockNotationScreenerSearchDataRatios1PriceSales.constructFromObject(data['priceSales']);
            }
            if (data.hasOwnProperty('priceEarnings')) {
                obj['priceEarnings'] = StockNotationScreenerSearchDataRatios1PriceEarnings.constructFromObject(data['priceEarnings']);
            }
            if (data.hasOwnProperty('priceEarningsGrowth')) {
                obj['priceEarningsGrowth'] = StockNotationScreenerSearchDataRatios1PriceEarningsGrowth.constructFromObject(data['priceEarningsGrowth']);
            }
            if (data.hasOwnProperty('priceBookValue')) {
                obj['priceBookValue'] = StockNotationScreenerSearchDataRatios1PriceBookValue.constructFromObject(data['priceBookValue']);
            }
            if (data.hasOwnProperty('priceCashFlow')) {
                obj['priceCashFlow'] = StockNotationScreenerSearchDataRatios1PriceCashFlow.constructFromObject(data['priceCashFlow']);
            }
            if (data.hasOwnProperty('priceFreeCashFlow')) {
                obj['priceFreeCashFlow'] = StockNotationScreenerSearchDataRatios1PriceFreeCashFlow.constructFromObject(data['priceFreeCashFlow']);
            }
            if (data.hasOwnProperty('dividendYield')) {
                obj['dividendYield'] = StockNotationScreenerSearchDataRatios1DividendYield.constructFromObject(data['dividendYield']);
            }
            if (data.hasOwnProperty('enterpriseValueEbit')) {
                obj['enterpriseValueEbit'] = StockNotationScreenerSearchDataRatios1EnterpriseValueEbit.constructFromObject(data['enterpriseValueEbit']);
            }
            if (data.hasOwnProperty('enterpriseValueEbitda')) {
                obj['enterpriseValueEbitda'] = StockNotationScreenerSearchDataRatios1EnterpriseValueEbitda.constructFromObject(data['enterpriseValueEbitda']);
            }
            if (data.hasOwnProperty('enterpriseValueSales')) {
                obj['enterpriseValueSales'] = StockNotationScreenerSearchDataRatios1EnterpriseValueSales.constructFromObject(data['enterpriseValueSales']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StockNotationScreenerSearchDataRatios1PriceSales} priceSales
 */
StockNotationScreenerSearchDataRatios1.prototype['priceSales'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataRatios1PriceEarnings} priceEarnings
 */
StockNotationScreenerSearchDataRatios1.prototype['priceEarnings'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataRatios1PriceEarningsGrowth} priceEarningsGrowth
 */
StockNotationScreenerSearchDataRatios1.prototype['priceEarningsGrowth'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataRatios1PriceBookValue} priceBookValue
 */
StockNotationScreenerSearchDataRatios1.prototype['priceBookValue'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataRatios1PriceCashFlow} priceCashFlow
 */
StockNotationScreenerSearchDataRatios1.prototype['priceCashFlow'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataRatios1PriceFreeCashFlow} priceFreeCashFlow
 */
StockNotationScreenerSearchDataRatios1.prototype['priceFreeCashFlow'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataRatios1DividendYield} dividendYield
 */
StockNotationScreenerSearchDataRatios1.prototype['dividendYield'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataRatios1EnterpriseValueEbit} enterpriseValueEbit
 */
StockNotationScreenerSearchDataRatios1.prototype['enterpriseValueEbit'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataRatios1EnterpriseValueEbitda} enterpriseValueEbitda
 */
StockNotationScreenerSearchDataRatios1.prototype['enterpriseValueEbitda'] = undefined;

/**
 * @member {module:model/StockNotationScreenerSearchDataRatios1EnterpriseValueSales} enterpriseValueSales
 */
StockNotationScreenerSearchDataRatios1.prototype['enterpriseValueSales'] = undefined;






export default StockNotationScreenerSearchDataRatios1;

