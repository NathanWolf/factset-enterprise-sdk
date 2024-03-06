/**
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Calendar from './Calendar';
import Frequency from './Frequency';
import JobOverridesCombinationsRoot from './JobOverridesCombinationsRoot';
import JobOverridesDates from './JobOverridesDates';

/**
 * The JobOverrides model module.
 * @module model/JobOverrides
 */
class JobOverrides {
    /**
     * Constructs a new <code>JobOverrides</code>.
     * If this object is provided, the settings given here will override the default settings of the job for the job run (settings will only be used temporarily and no changes will be made to the default PRB job). Only certain objects can be used for certain job types.
     * @alias module:model/JobOverrides
     */
    constructor() { 
        
        JobOverrides.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>JobOverrides</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/JobOverrides} obj Optional instance to populate.
     * @return {module:model/JobOverrides} The populated <code>JobOverrides</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new JobOverrides();

            if (data.hasOwnProperty('calendar')) {
                obj['calendar'] = Calendar.constructFromObject(data['calendar']);
            }
            if (data.hasOwnProperty('combinations')) {
                obj['combinations'] = ApiClient.convertToType(data['combinations'], [JobOverridesCombinationsRoot]);
            }
            if (data.hasOwnProperty('dates')) {
                obj['dates'] = JobOverridesDates.constructFromObject(data['dates']);
            }
            if (data.hasOwnProperty('frequency')) {
                obj['frequency'] = Frequency.constructFromObject(data['frequency']);
            }
            if (data.hasOwnProperty('runAsOfDate')) {
                obj['runAsOfDate'] = ApiClient.convertToType(data['runAsOfDate'], 'Date');
            }
            if (data.hasOwnProperty('runAsSerialNumber')) {
                obj['runAsSerialNumber'] = ApiClient.convertToType(data['runAsSerialNumber'], 'String');
            }
            if (data.hasOwnProperty('tasks')) {
                obj['tasks'] = ApiClient.convertToType(data['tasks'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Calendar} calendar
 */
JobOverrides.prototype['calendar'] = undefined;

/**
 * An array of date account combinations
 * @member {Array.<module:model/JobOverridesCombinationsRoot>} combinations
 */
JobOverrides.prototype['combinations'] = undefined;

/**
 * @member {module:model/JobOverridesDates} dates
 */
JobOverrides.prototype['dates'] = undefined;

/**
 * @member {module:model/Frequency} frequency
 */
JobOverrides.prototype['frequency'] = undefined;

/**
 * PUB
 * @member {Date} runAsOfDate
 */
JobOverrides.prototype['runAsOfDate'] = undefined;

/**
 * The FactSet serial number which has the credentials wanted to run the job
 * @member {String} runAsSerialNumber
 */
JobOverrides.prototype['runAsSerialNumber'] = undefined;

/**
 * Used only for jobs where type is PA
 * @member {Array.<String>} tasks
 */
JobOverrides.prototype['tasks'] = undefined;






export default JobOverrides;

