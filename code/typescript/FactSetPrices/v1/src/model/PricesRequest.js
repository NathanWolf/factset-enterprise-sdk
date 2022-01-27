/**
 * FactSet Prices API
 * Gain access to comprehensive global coverage for Equities & Fixed Income. Perform quick analytics by controlling the date ranges, currencies, and rolling periods, or simply request Open, High, Low, and Close prices. Easily connect pricing data with other core company data or alternative content sets using FactSet's hub and spoke symbology. <p>Equity and Fund Security types include Common Stock, ADR, GDR, Preferred, Closed-ended Fund, Exchange Traded Fund, Unit, Open-ended Fund, Exchange Traded Fund UVI, Exchange Traded Fund NAV, Preferred Equity, Non-Voting Depositary Receipt/Certificate, Alien/Foreign, Structured Product, and Temporary Instruments. Reference over 180,000+ active and inactive securities.</p><p>Fixed Income Security Types include Corporate Bonds, Treasury and Agency bonds, Government Bonds, and Municipals.</p> 
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Adjust from './Adjust';
import Batch from './Batch';
import Calendar from './Calendar';
import Frequency from './Frequency';

/**
 * The PricesRequest model module.
 * @module model/PricesRequest
 * @version 0.9.0
 */
class PricesRequest {
    /**
     * Constructs a new <code>PricesRequest</code>.
     * Prices Request Body
     * @alias module:model/PricesRequest
     * @param ids {Array.<String>} The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  <p>ids limit =  2000 per non-batch request / 5000 per batch request</p> 
     */
    constructor(ids) { 
        
        PricesRequest.initialize(this, ids);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids) { 
        obj['ids'] = ids;
    }

    /**
     * Constructs a <code>PricesRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PricesRequest} obj Optional instance to populate.
     * @return {module:model/PricesRequest} The populated <code>PricesRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PricesRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('startDate')) {
                obj['startDate'] = ApiClient.convertToType(data['startDate'], 'String');
            }
            if (data.hasOwnProperty('endDate')) {
                obj['endDate'] = ApiClient.convertToType(data['endDate'], 'String');
            }
            if (data.hasOwnProperty('frequency')) {
                obj['frequency'] = Frequency.constructFromObject(data['frequency']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('calendar')) {
                obj['calendar'] = Calendar.constructFromObject(data['calendar']);
            }
            if (data.hasOwnProperty('adjust')) {
                obj['adjust'] = Adjust.constructFromObject(data['adjust']);
            }
            if (data.hasOwnProperty('batch')) {
                obj['batch'] = Batch.constructFromObject(data['batch']);
            }
        }
        return obj;
    }


}

/**
 * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  <p>ids limit =  2000 per non-batch request / 5000 per batch request</p> 
 * @member {Array.<String>} ids
 */
PricesRequest.prototype['ids'] = undefined;

/**
 * The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} startDate
 */
PricesRequest.prototype['startDate'] = undefined;

/**
 * The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} endDate
 */
PricesRequest.prototype['endDate'] = undefined;

/**
 * @member {module:model/Frequency} frequency
 */
PricesRequest.prototype['frequency'] = undefined;

/**
 * Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
PricesRequest.prototype['currency'] = undefined;

/**
 * @member {module:model/Calendar} calendar
 */
PricesRequest.prototype['calendar'] = undefined;

/**
 * @member {module:model/Adjust} adjust
 */
PricesRequest.prototype['adjust'] = undefined;

/**
 * @member {module:model/Batch} batch
 */
PricesRequest.prototype['batch'] = undefined;






export default PricesRequest;

