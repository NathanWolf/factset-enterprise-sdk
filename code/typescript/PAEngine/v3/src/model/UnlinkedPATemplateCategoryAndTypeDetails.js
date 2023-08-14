/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UnlinkedPATemplateColumnDetails from './UnlinkedPATemplateColumnDetails';
import UnlinkedPATemplateGroupDetails from './UnlinkedPATemplateGroupDetails';

/**
 * The UnlinkedPATemplateCategoryAndTypeDetails model module.
 * @module model/UnlinkedPATemplateCategoryAndTypeDetails
 */
class UnlinkedPATemplateCategoryAndTypeDetails {
    /**
     * Constructs a new <code>UnlinkedPATemplateCategoryAndTypeDetails</code>.
     * @alias module:model/UnlinkedPATemplateCategoryAndTypeDetails
     */
    constructor() { 
        
        UnlinkedPATemplateCategoryAndTypeDetails.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UnlinkedPATemplateCategoryAndTypeDetails</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UnlinkedPATemplateCategoryAndTypeDetails} obj Optional instance to populate.
     * @return {module:model/UnlinkedPATemplateCategoryAndTypeDetails} The populated <code>UnlinkedPATemplateCategoryAndTypeDetails</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UnlinkedPATemplateCategoryAndTypeDetails();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], [UnlinkedPATemplateColumnDetails]);
            }
            if (data.hasOwnProperty('groups')) {
                obj['groups'] = ApiClient.convertToType(data['groups'], [UnlinkedPATemplateGroupDetails]);
            }
            if (data.hasOwnProperty('snapshot')) {
                obj['snapshot'] = ApiClient.convertToType(data['snapshot'], 'Boolean');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Type Id
 * @member {String} id
 */
UnlinkedPATemplateCategoryAndTypeDetails.prototype['id'] = undefined;

/**
 * List of default columns
 * @member {Array.<module:model/UnlinkedPATemplateColumnDetails>} columns
 */
UnlinkedPATemplateCategoryAndTypeDetails.prototype['columns'] = undefined;

/**
 * List of default groupings
 * @member {Array.<module:model/UnlinkedPATemplateGroupDetails>} groups
 */
UnlinkedPATemplateCategoryAndTypeDetails.prototype['groups'] = undefined;

/**
 * Snapshot
 * @member {Boolean} snapshot
 */
UnlinkedPATemplateCategoryAndTypeDetails.prototype['snapshot'] = undefined;

/**
 * Unlinked template category
 * @member {String} category
 */
UnlinkedPATemplateCategoryAndTypeDetails.prototype['category'] = undefined;

/**
 * Unlinked template type
 * @member {String} name
 */
UnlinkedPATemplateCategoryAndTypeDetails.prototype['name'] = undefined;






export default UnlinkedPATemplateCategoryAndTypeDetails;

