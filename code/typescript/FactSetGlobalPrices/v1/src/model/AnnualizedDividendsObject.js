/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
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

/**
 * The AnnualizedDividendsObject model module.
 * @module model/AnnualizedDividendsObject
 */
class AnnualizedDividendsObject {
    /**
     * Constructs a new <code>AnnualizedDividendsObject</code>.
     * @alias module:model/AnnualizedDividendsObject
     */
    constructor() { 
        
        AnnualizedDividendsObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AnnualizedDividendsObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AnnualizedDividendsObject} obj Optional instance to populate.
     * @return {module:model/AnnualizedDividendsObject} The populated <code>AnnualizedDividendsObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AnnualizedDividendsObject();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('eventId')) {
                obj['eventId'] = ApiClient.convertToType(data['eventId'], 'String');
            }
            if (data.hasOwnProperty('effectiveDate')) {
                obj['effectiveDate'] = ApiClient.convertToType(data['effectiveDate'], 'String');
            }
            if (data.hasOwnProperty('iadDefTradingAdj')) {
                obj['iadDefTradingAdj'] = ApiClient.convertToType(data['iadDefTradingAdj'], 'Number');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
 * @member {String} fsymId
 */
AnnualizedDividendsObject.prototype['fsymId'] = undefined;

/**
 * FactSet identifier that uniquely identifies the Event.
 * @member {String} eventId
 */
AnnualizedDividendsObject.prototype['eventId'] = undefined;

/**
 * Effective Date or Ex-Date of Annualized Dividend in YYYY-MM-DD format.
 * @member {String} effectiveDate
 */
AnnualizedDividendsObject.prototype['effectiveDate'] = undefined;

/**
 * Annualized Dividend value in the trading currency. The value is adjusted for splits
 * @member {Number} iadDefTradingAdj
 */
AnnualizedDividendsObject.prototype['iadDefTradingAdj'] = undefined;

/**
 * Currency ISO code associated with the annualized dividends.For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
AnnualizedDividendsObject.prototype['currency'] = undefined;

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
AnnualizedDividendsObject.prototype['requestId'] = undefined;






export default AnnualizedDividendsObject;

