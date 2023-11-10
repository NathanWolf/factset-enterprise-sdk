/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Dividend model module.
 * @module model/Dividend
 */
class Dividend {
    /**
     * Constructs a new <code>Dividend</code>.
     * @alias module:model/Dividend
     */
    constructor() { 
        
        Dividend.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Dividend</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Dividend} obj Optional instance to populate.
     * @return {module:model/Dividend} The populated <code>Dividend</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Dividend();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('eventId')) {
                obj['eventId'] = ApiClient.convertToType(data['eventId'], 'String');
            }
            if (data.hasOwnProperty('eventTypeCode')) {
                obj['eventTypeCode'] = ApiClient.convertToType(data['eventTypeCode'], 'String');
            }
            if (data.hasOwnProperty('eventTypeDesc')) {
                obj['eventTypeDesc'] = ApiClient.convertToType(data['eventTypeDesc'], 'String');
            }
            if (data.hasOwnProperty('divTypeCode')) {
                obj['divTypeCode'] = ApiClient.convertToType(data['divTypeCode'], 'String');
            }
            if (data.hasOwnProperty('announcementDate')) {
                obj['announcementDate'] = ApiClient.convertToType(data['announcementDate'], 'String');
            }
            if (data.hasOwnProperty('recordDate')) {
                obj['recordDate'] = ApiClient.convertToType(data['recordDate'], 'String');
            }
            if (data.hasOwnProperty('payDate')) {
                obj['payDate'] = ApiClient.convertToType(data['payDate'], 'String');
            }
            if (data.hasOwnProperty('effectiveDate')) {
                obj['effectiveDate'] = ApiClient.convertToType(data['effectiveDate'], 'String');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('amtDefNetGrossIndicator')) {
                obj['amtDefNetGrossIndicator'] = ApiClient.convertToType(data['amtDefNetGrossIndicator'], 'String');
            }
            if (data.hasOwnProperty('amtDefTradingAdj')) {
                obj['amtDefTradingAdj'] = ApiClient.convertToType(data['amtDefTradingAdj'], 'Number');
            }
            if (data.hasOwnProperty('amtDefTradingUnadj')) {
                obj['amtDefTradingUnadj'] = ApiClient.convertToType(data['amtDefTradingUnadj'], 'Number');
            }
            if (data.hasOwnProperty('amtGrossTradingAdj')) {
                obj['amtGrossTradingAdj'] = ApiClient.convertToType(data['amtGrossTradingAdj'], 'Number');
            }
            if (data.hasOwnProperty('amtGrossTradingUnadj')) {
                obj['amtGrossTradingUnadj'] = ApiClient.convertToType(data['amtGrossTradingUnadj'], 'Number');
            }
            if (data.hasOwnProperty('amtNetTradingAdj')) {
                obj['amtNetTradingAdj'] = ApiClient.convertToType(data['amtNetTradingAdj'], 'Number');
            }
            if (data.hasOwnProperty('amtNetTradingUnadj')) {
                obj['amtNetTradingUnadj'] = ApiClient.convertToType(data['amtNetTradingUnadj'], 'Number');
            }
            if (data.hasOwnProperty('declaredCurrency')) {
                obj['declaredCurrency'] = ApiClient.convertToType(data['declaredCurrency'], 'String');
            }
            if (data.hasOwnProperty('amtDefDecAdj')) {
                obj['amtDefDecAdj'] = ApiClient.convertToType(data['amtDefDecAdj'], 'Number');
            }
            if (data.hasOwnProperty('amtDefDecUnadj')) {
                obj['amtDefDecUnadj'] = ApiClient.convertToType(data['amtDefDecUnadj'], 'Number');
            }
            if (data.hasOwnProperty('amtGrossDecAdj')) {
                obj['amtGrossDecAdj'] = ApiClient.convertToType(data['amtGrossDecAdj'], 'Number');
            }
            if (data.hasOwnProperty('amtGrossDecUnadj')) {
                obj['amtGrossDecUnadj'] = ApiClient.convertToType(data['amtGrossDecUnadj'], 'Number');
            }
            if (data.hasOwnProperty('amtNetDecAdj')) {
                obj['amtNetDecAdj'] = ApiClient.convertToType(data['amtNetDecAdj'], 'Number');
            }
            if (data.hasOwnProperty('amtNetDecUnadj')) {
                obj['amtNetDecUnadj'] = ApiClient.convertToType(data['amtNetDecUnadj'], 'Number');
            }
            if (data.hasOwnProperty('dividendStatus')) {
                obj['dividendStatus'] = ApiClient.convertToType(data['dividendStatus'], 'Number');
            }
            if (data.hasOwnProperty('dividendActiveFlag')) {
                obj['dividendActiveFlag'] = ApiClient.convertToType(data['dividendActiveFlag'], 'Number');
            }
            if (data.hasOwnProperty('dividendsSpecFlag')) {
                obj['dividendsSpecFlag'] = ApiClient.convertToType(data['dividendsSpecFlag'], 'Number');
            }
            if (data.hasOwnProperty('frankDefTradingAdj')) {
                obj['frankDefTradingAdj'] = ApiClient.convertToType(data['frankDefTradingAdj'], 'Number');
            }
            if (data.hasOwnProperty('frankDefTradingUnadj')) {
                obj['frankDefTradingUnadj'] = ApiClient.convertToType(data['frankDefTradingUnadj'], 'Number');
            }
            if (data.hasOwnProperty('frankDefDecAdj')) {
                obj['frankDefDecAdj'] = ApiClient.convertToType(data['frankDefDecAdj'], 'Number');
            }
            if (data.hasOwnProperty('frankDefDecUnadj')) {
                obj['frankDefDecUnadj'] = ApiClient.convertToType(data['frankDefDecUnadj'], 'Number');
            }
            if (data.hasOwnProperty('frankPct')) {
                obj['frankPct'] = ApiClient.convertToType(data['frankPct'], 'Number');
            }
            if (data.hasOwnProperty('taxRate')) {
                obj['taxRate'] = ApiClient.convertToType(data['taxRate'], 'Number');
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
Dividend.prototype['fsymId'] = undefined;

/**
 * FactSet identifier that uniquely identifies the Event.
 * @member {String} eventId
 */
Dividend.prototype['eventId'] = undefined;

/**
 * Corporate Actions Event type code.
 * @member {module:model/Dividend.EventTypeCodeEnum} eventTypeCode
 */
Dividend.prototype['eventTypeCode'] = undefined;

/**
 * Corporate Actions Event type description.
 * @member {String} eventTypeDesc
 */
Dividend.prototype['eventTypeDesc'] = undefined;

/**
 * Dividend Type Code. For code descriptions, visit [Online Assistant Page #8764] (https://oa.apps.factset.com/pages/8764). 
 * @member {String} divTypeCode
 */
Dividend.prototype['divTypeCode'] = undefined;

/**
 * Date Event was announced in YYYY-MM-DD format.
 * @member {String} announcementDate
 */
Dividend.prototype['announcementDate'] = undefined;

/**
 * Date of Record for distribution in YYYY-MM-DD format.
 * @member {String} recordDate
 */
Dividend.prototype['recordDate'] = undefined;

/**
 * Date of Payment for distribution in YYYY-MM-DD format.
 * @member {String} payDate
 */
Dividend.prototype['payDate'] = undefined;

/**
 * Effective Date or Ex-Date of distribution in YYYY-MM-DD format.
 * @member {String} effectiveDate
 */
Dividend.prototype['effectiveDate'] = undefined;

/**
 * Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
Dividend.prototype['currency'] = undefined;

/**
 * Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512).
 * @member {module:model/Dividend.AmtDefNetGrossIndicatorEnum} amtDefNetGrossIndicator
 */
Dividend.prototype['amtDefNetGrossIndicator'] = undefined;

/**
 * Default Amount - Trading Currency, Split Adjusted
 * @member {Number} amtDefTradingAdj
 */
Dividend.prototype['amtDefTradingAdj'] = undefined;

/**
 * Default Amount - Trading Currency, Unadjusted
 * @member {Number} amtDefTradingUnadj
 */
Dividend.prototype['amtDefTradingUnadj'] = undefined;

/**
 * Gross Amount - Trading Currency, Split Adjusted 
 * @member {Number} amtGrossTradingAdj
 */
Dividend.prototype['amtGrossTradingAdj'] = undefined;

/**
 * Gross Amount - Trading Currency, Unadjusted 
 * @member {Number} amtGrossTradingUnadj
 */
Dividend.prototype['amtGrossTradingUnadj'] = undefined;

/**
 * Net Amount - Trading Currency, Split Adjusted
 * @member {Number} amtNetTradingAdj
 */
Dividend.prototype['amtNetTradingAdj'] = undefined;

/**
 * Net Amount - Trading Currency, Unadjusted
 * @member {Number} amtNetTradingUnadj
 */
Dividend.prototype['amtNetTradingUnadj'] = undefined;

/**
 * Currency code for declared dividend.
 * @member {String} declaredCurrency
 */
Dividend.prototype['declaredCurrency'] = undefined;

/**
 * Default Amount - Declared Currency, Split Adjusted
 * @member {Number} amtDefDecAdj
 */
Dividend.prototype['amtDefDecAdj'] = undefined;

/**
 * Default Amount - Declared Currency, Unadjusted
 * @member {Number} amtDefDecUnadj
 */
Dividend.prototype['amtDefDecUnadj'] = undefined;

/**
 * Gross Amount - Declared Currency, Split Adjusted 
 * @member {Number} amtGrossDecAdj
 */
Dividend.prototype['amtGrossDecAdj'] = undefined;

/**
 * Gross Amount - Declared Currency, Unadjusted 
 * @member {Number} amtGrossDecUnadj
 */
Dividend.prototype['amtGrossDecUnadj'] = undefined;

/**
 * Net Amount - Declared Currency, Split Adjusted 
 * @member {Number} amtNetDecAdj
 */
Dividend.prototype['amtNetDecAdj'] = undefined;

/**
 * Net Amount - Declared Currency, Unadjusted 
 * @member {Number} amtNetDecUnadj
 */
Dividend.prototype['amtNetDecUnadj'] = undefined;

/**
 * Dividend Status Flag - 1=Yes, 0=No
 * @member {Number} dividendStatus
 */
Dividend.prototype['dividendStatus'] = undefined;

/**
 * Dividend active Flag - 1=Yes, 0=No
 * @member {Number} dividendActiveFlag
 */
Dividend.prototype['dividendActiveFlag'] = undefined;

/**
 * Special Dividend Flag - 1=Yes, 0=No
 * @member {Number} dividendsSpecFlag
 */
Dividend.prototype['dividendsSpecFlag'] = undefined;

/**
 * Default Frank - Trading Currency, Split Adjusted
 * @member {Number} frankDefTradingAdj
 */
Dividend.prototype['frankDefTradingAdj'] = undefined;

/**
 * Default Frank - Trading Currency, Unadjusted
 * @member {Number} frankDefTradingUnadj
 */
Dividend.prototype['frankDefTradingUnadj'] = undefined;

/**
 * Default Frank - Declared Currency, Split Adjusted
 * @member {Number} frankDefDecAdj
 */
Dividend.prototype['frankDefDecAdj'] = undefined;

/**
 * Default Frank - Declared Currency, Unadjusted
 * @member {Number} frankDefDecUnadj
 */
Dividend.prototype['frankDefDecUnadj'] = undefined;

/**
 * Default Amount - Declared Currency, Unadjusted
 * @member {Number} frankPct
 */
Dividend.prototype['frankPct'] = undefined;

/**
 * Tax Rate for on gross dividend for net dividend.
 * @member {Number} taxRate
 */
Dividend.prototype['taxRate'] = undefined;

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
Dividend.prototype['requestId'] = undefined;





/**
 * Allowed values for the <code>eventTypeCode</code> property.
 * @enum {String}
 * @readonly
 */
Dividend['EventTypeCodeEnum'] = {

    /**
     * value: "DVC"
     * @const
     */
    "DVC": "DVC",

    /**
     * value: "DVCD"
     * @const
     */
    "DVCD": "DVCD",

    /**
     * value: "DRP"
     * @const
     */
    "DRP": "DRP"
};


/**
 * Allowed values for the <code>amtDefNetGrossIndicator</code> property.
 * @enum {String}
 * @readonly
 */
Dividend['AmtDefNetGrossIndicatorEnum'] = {

    /**
     * value: "N"
     * @const
     */
    "N": "N",

    /**
     * value: "G"
     * @const
     */
    "G": "G"
};



export default Dividend;

