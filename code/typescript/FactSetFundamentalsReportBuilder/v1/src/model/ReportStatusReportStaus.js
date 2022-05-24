/**
 * FactSet Fundamentals Report Builder
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ReportStatusReportStaus model module.
 * @module model/ReportStatusReportStaus
 * @version 0.20.0
 */
class ReportStatusReportStaus {
    /**
     * Constructs a new <code>ReportStatusReportStaus</code>.
     * Return historical periods as originally reported or retroactively restated (for M&amp;A, accounting changes, and other events).
     * @alias module:model/ReportStatusReportStaus
     */
    constructor() { 
        
        ReportStatusReportStaus.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ReportStatusReportStaus</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ReportStatusReportStaus} obj Optional instance to populate.
     * @return {module:model/ReportStatusReportStaus} The populated <code>ReportStatusReportStaus</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReportStatusReportStaus();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ReportStatusReportStaus.ValueEnum} value
 */
ReportStatusReportStaus.prototype['value'] = undefined;





/**
 * Allowed values for the <code>value</code> property.
 * @enum {String}
 * @readonly
 */
ReportStatusReportStaus['ValueEnum'] = {

    /**
     * value: "RESTATED"
     * @const
     */
    "RESTATED": "RESTATED",

    /**
     * value: "NON-RESTATED"
     * @const
     */
    "NON-RESTATED": "NON-RESTATED"
};



export default ReportStatusReportStaus;

