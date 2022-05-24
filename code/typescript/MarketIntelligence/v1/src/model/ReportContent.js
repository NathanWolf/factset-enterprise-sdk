/**
 * Market Intelligence
 * Through the Market Intelligence API, stay up to date on the companies and sectors you care most about with ease. Request the templates you have made in Market Intelligence to receive news and data on your portfolio.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ReportContent model module.
 * @module model/ReportContent
 * @version 0.20.0
 */
class ReportContent {
    /**
     * Constructs a new <code>ReportContent</code>.
     * lowest level of data for table return
     * @alias module:model/ReportContent
     */
    constructor() { 
        
        ReportContent.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ReportContent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ReportContent} obj Optional instance to populate.
     * @return {module:model/ReportContent} The populated <code>ReportContent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReportContent();

            if (data.hasOwnProperty('subject_matched_order')) {
                obj['subject_matched_order'] = ApiClient.convertToType(data['subject_matched_order'], 'String');
            }
            if (data.hasOwnProperty('headline')) {
                obj['headline'] = ApiClient.convertToType(data['headline'], 'String');
            }
            if (data.hasOwnProperty('story_dt')) {
                obj['story_dt'] = ApiClient.convertToType(data['story_dt'], 'String');
            }
            if (data.hasOwnProperty('doc_disp_content')) {
                obj['doc_disp_content'] = ApiClient.convertToType(data['doc_disp_content'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} subject_matched_order
 */
ReportContent.prototype['subject_matched_order'] = undefined;

/**
 * @member {String} headline
 */
ReportContent.prototype['headline'] = undefined;

/**
 * Content publishing date
 * @member {String} story_dt
 */
ReportContent.prototype['story_dt'] = undefined;

/**
 * MI Content
 * @member {String} doc_disp_content
 */
ReportContent.prototype['doc_disp_content'] = undefined;






export default ReportContent;

