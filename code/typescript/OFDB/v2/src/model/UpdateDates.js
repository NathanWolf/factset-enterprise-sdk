/**
 * OFDB API
 * OFDB API
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UpdateDatesData from './UpdateDatesData';

/**
 * The UpdateDates model module.
 * @module model/UpdateDates
 */
class UpdateDates {
    /**
     * Constructs a new <code>UpdateDates</code>.
     * Set of fields along with symbol is mandatory to update the date.
     * @alias module:model/UpdateDates
     */
    constructor() { 
        
        UpdateDates.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdateDates</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateDates} obj Optional instance to populate.
     * @return {module:model/UpdateDates} The populated <code>UpdateDates</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateDates();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [UpdateDatesData]);
            }
        }
        return obj;
    }


}

/**
 * date has to be provide in case 3d OFDB with date and atleast one iterative field
 * @member {Array.<module:model/UpdateDatesData>} data
 */
UpdateDates.prototype['data'] = undefined;






export default UpdateDates;

