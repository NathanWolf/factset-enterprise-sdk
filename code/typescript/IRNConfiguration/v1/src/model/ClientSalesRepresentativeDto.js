/**
 * IRN API v1
 * Allows users to create, update and configure IRN data.
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
 * The ClientSalesRepresentativeDto model module.
 * @module model/ClientSalesRepresentativeDto
 * @version 0.9.0
 */
class ClientSalesRepresentativeDto {
    /**
     * Constructs a new <code>ClientSalesRepresentativeDto</code>.
     * @alias module:model/ClientSalesRepresentativeDto
     */
    constructor() { 
        
        ClientSalesRepresentativeDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ClientSalesRepresentativeDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ClientSalesRepresentativeDto} obj Optional instance to populate.
     * @return {module:model/ClientSalesRepresentativeDto} The populated <code>ClientSalesRepresentativeDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ClientSalesRepresentativeDto();

            if (data.hasOwnProperty('fullname')) {
                obj['fullname'] = ApiClient.convertToType(data['fullname'], 'String');
            }
            if (data.hasOwnProperty('emailAddress')) {
                obj['emailAddress'] = ApiClient.convertToType(data['emailAddress'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} fullname
 */
ClientSalesRepresentativeDto.prototype['fullname'] = undefined;

/**
 * @member {String} emailAddress
 */
ClientSalesRepresentativeDto.prototype['emailAddress'] = undefined;






export default ClientSalesRepresentativeDto;

