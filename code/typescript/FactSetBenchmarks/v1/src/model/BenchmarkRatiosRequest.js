/**
 * FactSet Benchmarks API
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Frequency from './Frequency';
import Periodicity from './Periodicity';

/**
 * The BenchmarkRatiosRequest model module.
 * @module model/BenchmarkRatiosRequest
 */
class BenchmarkRatiosRequest {
    /**
     * Constructs a new <code>BenchmarkRatiosRequest</code>.
     * @alias module:model/BenchmarkRatiosRequest
     * @param ids {Array.<String>} Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers.
     * @param metrics {Array.<String>} Requested List of FactSet Market Aggregates (FMA) or ratios. provided the below complete metrics list. |metric item|Description|category|periodicity |:---|:---|:---|:---| |GROSS_MARGIN|Gross Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |OPER_INC_SALES|Operating Margin|Profitability (%)|LTM, QTR |NET_MGN|Net Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBIT_MARGIN|EBIT Margin|Profitability (%)| NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBITDA_MARGIN|EBITDA Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |ROA|Return on Assets|Profitability (%)|LTM |ROE|Return on Equity|Profitability (%)|NTMA, LTMA, LTM, 0, 1, 2 |ROIC|Return on Invested Capital|Profitability (%)| LTM |FCF_MGN|Free Cash Flow Margin|Profitability (%)|LTM, QTR |PE|Price/Earnings|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PEX|Price/Earnings (excl negatives)|Valuation|LTM |PSALES|Price/Sales|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PBK|Price/Book Value|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCF|Price/Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCFX|Price/Cash Flow (excl negatives)|Valuation|LTM |PFCF|Price/Free Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBIT|Enterprise Value/EBIT|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBITDA|Enterprise Value/EBITDA|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_SALES|Enterprise Value/Sales|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA|Net Debt/EBITDA|Coverage|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA_MIN_CAPEX|Net Debt/(EBITDA-Capex)|Coverage|LTM |DEBT_EBITDA|Total Debt/EBITDA|Coverage|LTM |DEBT_EBIT|Total Debt/EBIT|Coverage|LTM |EBIT_INT_EXP|EBIT/Interest Expense (Int. Coverage)|Coverage|LTM |EBITDA_INT_EXP|EBITDA/Interest Expense|Coverage|LTM |OPER_CF_INT_EXP|CFO/Interest Expense|Coverage|LTM |LTD_EBITDA|LT Debt/EBITDA|Coverage|LTM |NDEBT_FFO|Net Debt/FFO|Coverage|LTM |LTD_FFO|LT Debt/FFO|Coverage|LTM |FCF_DEBT|FCF/Total Debt|Coverage|LTM |OPER_CF_DEBT|CFO/Total Debt|Coverage|LTM |LTD_EQ|LT Debt/Total Equity|Leverage(%)|LTM |LTD_TCAP|LT Debt/Total Capital|Leverage(%)|LTM |LTD_ASSETS|LT Debt/Total Assets|Leverage(%)|LTM |DEBT_ASSETS|Total Debt/Total Assets|Leverage(%)|LTM |DEBT_EQ|Total Debt/Total Equity|Leverage(%)|LTM |NDEBT_TCAP|Net Debt/Total Capital|Leverage(%)|LTM |DEBT_TCAP|Total Debt/Total Capital|Leverage(%)|LTM 
     */
    constructor(ids, metrics) { 
        
        BenchmarkRatiosRequest.initialize(this, ids, metrics);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids, metrics) { 
        obj['ids'] = ids;
        obj['metrics'] = metrics;
    }

    /**
     * Constructs a <code>BenchmarkRatiosRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BenchmarkRatiosRequest} obj Optional instance to populate.
     * @return {module:model/BenchmarkRatiosRequest} The populated <code>BenchmarkRatiosRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BenchmarkRatiosRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('startDate')) {
                obj['startDate'] = ApiClient.convertToType(data['startDate'], 'String');
            }
            if (data.hasOwnProperty('endDate')) {
                obj['endDate'] = ApiClient.convertToType(data['endDate'], 'String');
            }
            if (data.hasOwnProperty('periodicity')) {
                obj['periodicity'] = Periodicity.constructFromObject(data['periodicity']);
            }
            if (data.hasOwnProperty('metrics')) {
                obj['metrics'] = ApiClient.convertToType(data['metrics'], ['String']);
            }
            if (data.hasOwnProperty('frequency')) {
                obj['frequency'] = Frequency.constructFromObject(data['frequency']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers.
 * @member {Array.<String>} ids
 */
BenchmarkRatiosRequest.prototype['ids'] = undefined;

/**
 * Requested start date expressed in YYYY-MM-DD format.
 * @member {String} startDate
 */
BenchmarkRatiosRequest.prototype['startDate'] = undefined;

/**
 * Requested end date for Range expressed in YYYY-MM-DD format.
 * @member {String} endDate
 */
BenchmarkRatiosRequest.prototype['endDate'] = undefined;

/**
 * @member {module:model/Periodicity} periodicity
 */
BenchmarkRatiosRequest.prototype['periodicity'] = undefined;

/**
 * Requested List of FactSet Market Aggregates (FMA) or ratios. provided the below complete metrics list. |metric item|Description|category|periodicity |:---|:---|:---|:---| |GROSS_MARGIN|Gross Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |OPER_INC_SALES|Operating Margin|Profitability (%)|LTM, QTR |NET_MGN|Net Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBIT_MARGIN|EBIT Margin|Profitability (%)| NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBITDA_MARGIN|EBITDA Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |ROA|Return on Assets|Profitability (%)|LTM |ROE|Return on Equity|Profitability (%)|NTMA, LTMA, LTM, 0, 1, 2 |ROIC|Return on Invested Capital|Profitability (%)| LTM |FCF_MGN|Free Cash Flow Margin|Profitability (%)|LTM, QTR |PE|Price/Earnings|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PEX|Price/Earnings (excl negatives)|Valuation|LTM |PSALES|Price/Sales|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PBK|Price/Book Value|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCF|Price/Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCFX|Price/Cash Flow (excl negatives)|Valuation|LTM |PFCF|Price/Free Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBIT|Enterprise Value/EBIT|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBITDA|Enterprise Value/EBITDA|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_SALES|Enterprise Value/Sales|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA|Net Debt/EBITDA|Coverage|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA_MIN_CAPEX|Net Debt/(EBITDA-Capex)|Coverage|LTM |DEBT_EBITDA|Total Debt/EBITDA|Coverage|LTM |DEBT_EBIT|Total Debt/EBIT|Coverage|LTM |EBIT_INT_EXP|EBIT/Interest Expense (Int. Coverage)|Coverage|LTM |EBITDA_INT_EXP|EBITDA/Interest Expense|Coverage|LTM |OPER_CF_INT_EXP|CFO/Interest Expense|Coverage|LTM |LTD_EBITDA|LT Debt/EBITDA|Coverage|LTM |NDEBT_FFO|Net Debt/FFO|Coverage|LTM |LTD_FFO|LT Debt/FFO|Coverage|LTM |FCF_DEBT|FCF/Total Debt|Coverage|LTM |OPER_CF_DEBT|CFO/Total Debt|Coverage|LTM |LTD_EQ|LT Debt/Total Equity|Leverage(%)|LTM |LTD_TCAP|LT Debt/Total Capital|Leverage(%)|LTM |LTD_ASSETS|LT Debt/Total Assets|Leverage(%)|LTM |DEBT_ASSETS|Total Debt/Total Assets|Leverage(%)|LTM |DEBT_EQ|Total Debt/Total Equity|Leverage(%)|LTM |NDEBT_TCAP|Net Debt/Total Capital|Leverage(%)|LTM |DEBT_TCAP|Total Debt/Total Capital|Leverage(%)|LTM 
 * @member {Array.<String>} metrics
 */
BenchmarkRatiosRequest.prototype['metrics'] = undefined;

/**
 * @member {module:model/Frequency} frequency
 */
BenchmarkRatiosRequest.prototype['frequency'] = undefined;

/**
 * Currency for response.
 * @member {String} currency
 */
BenchmarkRatiosRequest.prototype['currency'] = undefined;






export default BenchmarkRatiosRequest;

