/**
 * FactSet Exchange Traded Funds API
 * FactSet ETF data feeds provide complete and accurate security, fund and reference data across the universe of exchange-traded products. Data is sourced from ETF providers across the globe and includes more than 100 unique data points, resulting in comprehensive coverage to help you evaluate and construct ETFs, analyze potential trades, and perform fund research.<p> FactSet Reference and Analytics data uses FactSet's FCS, which categorizes exchange-traded products using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund's prospectus and marketing materials. ETF exposure details are presented on successively granular levels-  category, then focus, and then niche.</p> <p>Moreover, FactSet ETF Reference data captures over 100 unique data points and provides market-specific data if you wish to solely focus on U.S., Canadian, Australian, New Zealand, Singapore, Hong Kong or European exchanges. All data points are grouped in one of two levels, either as a Fund or as a Listing. However, FactSet ETF Analytics data is primarily available for U.S.-domiciled ETFs. A subset of reference data items are provided for European-domiciled funds. For a full breakout of regional availability and history, see Formula Definitions and Calculations.</p> 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Category from './Category';

/**
 * The Metric model module.
 * @module model/Metric
 * @version 0.20.0
 */
class Metric {
    /**
     * Constructs a new <code>Metric</code>.
     * @alias module:model/Metric
     * @param metric {String} Metric identifier to be used as `metrics` input in _ETF_ endpoints. 
     */
    constructor(metric) { 
        
        Metric.initialize(this, metric);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, metric) { 
        obj['metric'] = metric;
    }

    /**
     * Constructs a <code>Metric</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Metric} obj Optional instance to populate.
     * @return {module:model/Metric} The populated <code>Metric</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Metric();

            if (data.hasOwnProperty('metric')) {
                obj['metric'] = ApiClient.convertToType(data['metric'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = Category.constructFromObject(data['category']);
            }
            if (data.hasOwnProperty('dataType')) {
                obj['dataType'] = ApiClient.convertToType(data['dataType'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Metric identifier to be used as `metrics` input in _ETF_ endpoints. 
 * @member {String} metric
 */
Metric.prototype['metric'] = undefined;

/**
 * Plain text name of the metric.
 * @member {String} name
 */
Metric.prototype['name'] = undefined;

/**
 * @member {module:model/Category} category
 */
Metric.prototype['category'] = undefined;

/**
 * The data type for the metric. Each dataType is defined below -   * **DATE** - date format expressed in YYYY-MM-DD.   * **DOUBLE** - A double is a FactSet data type, similar to a float or an integer. A double represents numeric data but provides for a greater amount of decimal precision than the float data type. Double values have up to 15 digits of precision, while float values have up to 7 digits (integers have up to 10 digits).   * **INTEGER** - An integer is a whole number or zero (i.e., integers do not include decimals). Integers can be positive or negative.   * **STRING** - A string value is an ASCII character. A string is a sequence of ASCII characters. String value and text value are synonymous. Function will hold data for multiple time-periods, as well as for many companies (i.e., two-dimensional value). The STRING_ARRAY function returns data using a vertical orientation (e.g., down a column) 
 * @member {module:model/Metric.DataTypeEnum} dataType
 */
Metric.prototype['dataType'] = undefined;





/**
 * Allowed values for the <code>dataType</code> property.
 * @enum {String}
 * @readonly
 */
Metric['DataTypeEnum'] = {

    /**
     * value: "DATE"
     * @const
     */
    "DATE": "DATE",

    /**
     * value: "DOUBLE"
     * @const
     */
    "DOUBLE": "DOUBLE",

    /**
     * value: "INTEGER"
     * @const
     */
    "INTEGER": "INTEGER",

    /**
     * value: "STRING"
     * @const
     */
    "STRING": "STRING"
};



export default Metric;

