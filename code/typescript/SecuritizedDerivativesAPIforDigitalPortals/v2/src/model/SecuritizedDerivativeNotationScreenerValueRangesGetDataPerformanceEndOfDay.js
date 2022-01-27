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
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayDay1 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayDay1';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3';
import SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5 from './SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay
 * @version 0.9.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay</code>.
     * End-of-day (EOD) relative performance for different time ranges. The relative performance is the difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date, relative to the EOD closing price on the reference date.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay();

            if (data.hasOwnProperty('day1')) {
                obj['day1'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayDay1.constructFromObject(data['day1']);
            }
            if (data.hasOwnProperty('week1')) {
                obj['week1'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1.constructFromObject(data['week1']);
            }
            if (data.hasOwnProperty('month1')) {
                obj['month1'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1.constructFromObject(data['month1']);
            }
            if (data.hasOwnProperty('months3')) {
                obj['months3'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3.constructFromObject(data['months3']);
            }
            if (data.hasOwnProperty('months6')) {
                obj['months6'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6.constructFromObject(data['months6']);
            }
            if (data.hasOwnProperty('year1')) {
                obj['year1'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1.constructFromObject(data['year1']);
            }
            if (data.hasOwnProperty('years3')) {
                obj['years3'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3.constructFromObject(data['years3']);
            }
            if (data.hasOwnProperty('years5')) {
                obj['years5'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5.constructFromObject(data['years5']);
            }
            if (data.hasOwnProperty('yearToDate')) {
                obj['yearToDate'] = SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate.constructFromObject(data['yearToDate']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayDay1} day1
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['day1'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1} week1
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['week1'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1} month1
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['month1'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3} months3
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['months3'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6} months6
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['months6'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1} year1
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['year1'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3} years3
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['years3'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5} years5
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['years5'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate} yearToDate
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay.prototype['yearToDate'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDay;

