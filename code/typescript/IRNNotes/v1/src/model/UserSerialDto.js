/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The UserSerialDto model module.
 * @module model/UserSerialDto
 * @version 0.20.0
 */
class UserSerialDto {
    /**
     * Constructs a new <code>UserSerialDto</code>.
     * @alias module:model/UserSerialDto
     * @param username {String} 
     * @param serialNumber {String} 
     */
    constructor(username, serialNumber) { 
        
        UserSerialDto.initialize(this, username, serialNumber);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, username, serialNumber) { 
        obj['Username'] = username;
        obj['SerialNumber'] = serialNumber;
    }

    /**
     * Constructs a <code>UserSerialDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UserSerialDto} obj Optional instance to populate.
     * @return {module:model/UserSerialDto} The populated <code>UserSerialDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserSerialDto();

            if (data.hasOwnProperty('Username')) {
                obj['Username'] = ApiClient.convertToType(data['Username'], 'String');
            }
            if (data.hasOwnProperty('SerialNumber')) {
                obj['SerialNumber'] = ApiClient.convertToType(data['SerialNumber'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} Username
 */
UserSerialDto.prototype['Username'] = undefined;

/**
 * @member {String} SerialNumber
 */
UserSerialDto.prototype['SerialNumber'] = undefined;






export default UserSerialDto;

