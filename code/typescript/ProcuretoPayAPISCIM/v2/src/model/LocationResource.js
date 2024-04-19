/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FirmDescriptionResourceReference from './FirmDescriptionResourceReference';
import LocationResourceCompanyAgreementUrls from './LocationResourceCompanyAgreementUrls';
import LocationResourceMeta from './LocationResourceMeta';
import LocationResourceReference from './LocationResourceReference';

/**
 * The LocationResource model module.
 * @module model/LocationResource
 */
class LocationResource {
    /**
     * Constructs a new <code>LocationResource</code>.
     * @alias module:model/LocationResource
     * @param name {String} Name of the location.
     */
    constructor(name) { 
        
        LocationResource.initialize(this, name);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name) { 
        obj['name'] = name;
    }

    /**
     * Constructs a <code>LocationResource</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LocationResource} obj Optional instance to populate.
     * @return {module:model/LocationResource} The populated <code>LocationResource</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LocationResource();

            if (data.hasOwnProperty('schemas')) {
                obj['schemas'] = ApiClient.convertToType(data['schemas'], ['String']);
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('externalId')) {
                obj['externalId'] = ApiClient.convertToType(data['externalId'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('address1')) {
                obj['address1'] = ApiClient.convertToType(data['address1'], 'String');
            }
            if (data.hasOwnProperty('address2')) {
                obj['address2'] = ApiClient.convertToType(data['address2'], 'String');
            }
            if (data.hasOwnProperty('address3')) {
                obj['address3'] = ApiClient.convertToType(data['address3'], 'String');
            }
            if (data.hasOwnProperty('locality')) {
                obj['locality'] = ApiClient.convertToType(data['locality'], 'String');
            }
            if (data.hasOwnProperty('region')) {
                obj['region'] = ApiClient.convertToType(data['region'], 'String');
            }
            if (data.hasOwnProperty('postalCode')) {
                obj['postalCode'] = ApiClient.convertToType(data['postalCode'], 'String');
            }
            if (data.hasOwnProperty('country')) {
                obj['country'] = ApiClient.convertToType(data['country'], 'String');
            }
            if (data.hasOwnProperty('phoneNumber')) {
                obj['phoneNumber'] = ApiClient.convertToType(data['phoneNumber'], 'String');
            }
            if (data.hasOwnProperty('firmDescription')) {
                obj['firmDescription'] = ApiClient.convertToType(data['firmDescription'], FirmDescriptionResourceReference);
            }
            if (data.hasOwnProperty('emailDomains')) {
                obj['emailDomains'] = ApiClient.convertToType(data['emailDomains'], ['String']);
            }
            if (data.hasOwnProperty('partnerAssertedEntityId')) {
                obj['partnerAssertedEntityId'] = ApiClient.convertToType(data['partnerAssertedEntityId'], 'String');
            }
            if (data.hasOwnProperty('companyAgreementUrls')) {
                obj['companyAgreementUrls'] = ApiClient.convertToType(data['companyAgreementUrls'], [LocationResourceCompanyAgreementUrls]);
            }
            if (data.hasOwnProperty('managedLocations')) {
                obj['managedLocations'] = ApiClient.convertToType(data['managedLocations'], [LocationResourceReference]);
            }
            if (data.hasOwnProperty('managingLocation')) {
                obj['managingLocation'] = ApiClient.convertToType(data['managingLocation'], LocationResourceReference);
            }
            if (data.hasOwnProperty('mainLocation')) {
                obj['mainLocation'] = ApiClient.convertToType(data['mainLocation'], LocationResourceReference);
            }
            if (data.hasOwnProperty('usernames')) {
                obj['usernames'] = ApiClient.convertToType(data['usernames'], ['String']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = LocationResourceMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} schemas
 */
LocationResource.prototype['schemas'] = undefined;

/**
 * @member {String} id
 */
LocationResource.prototype['id'] = undefined;

/**
 * An identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. Note: for clients that are not FactSet partners, this identifier must be unique within the main location associated with the client's FactSet username.
 * @member {String} externalId
 */
LocationResource.prototype['externalId'] = undefined;

/**
 * Name of the location.
 * @member {String} name
 */
LocationResource.prototype['name'] = undefined;

/**
 * Description of the location.
 * @member {String} description
 */
LocationResource.prototype['description'] = undefined;

/**
 * First line of location's address.
 * @member {String} address1
 */
LocationResource.prototype['address1'] = undefined;

/**
 * Second line of location's address.
 * @member {String} address2
 */
LocationResource.prototype['address2'] = undefined;

/**
 * Third line of location's address.
 * @member {String} address3
 */
LocationResource.prototype['address3'] = undefined;

/**
 * City of location.
 * @member {String} locality
 */
LocationResource.prototype['locality'] = undefined;

/**
 * State or province of location.
 * @member {String} region
 */
LocationResource.prototype['region'] = undefined;

/**
 * Postal code of location.
 * @member {String} postalCode
 */
LocationResource.prototype['postalCode'] = undefined;

/**
 * Country of location.
 * @member {String} country
 */
LocationResource.prototype['country'] = undefined;

/**
 * Phone number of location.
 * @member {String} phoneNumber
 */
LocationResource.prototype['phoneNumber'] = undefined;

/**
 * @member {module:model/FirmDescriptionResourceReference} firmDescription
 */
LocationResource.prototype['firmDescription'] = undefined;

/**
 * The domain names that are valid for use with email addresses associated with users in this location.
 * @member {Array.<String>} emailDomains
 */
LocationResource.prototype['emailDomains'] = undefined;

/**
 * Identifier assigned to the Corporate Entity. Value is provided as \"fsymEntityId\" from FactSet's Symbology API.
 * @member {String} partnerAssertedEntityId
 */
LocationResource.prototype['partnerAssertedEntityId'] = undefined;

/**
 * Provides FactSet with signed documents allowing entitlement to pre-established exchanges for individuals associated with the location. Document URL provided must be available over the public internet.
 * @member {Array.<module:model/LocationResourceCompanyAgreementUrls>} companyAgreementUrls
 */
LocationResource.prototype['companyAgreementUrls'] = undefined;

/**
 * Lists FactSet locations managed by Research Entitlements Administrators at this location for requesting location-based research entitlements.
 * @member {Array.<module:model/LocationResourceReference>} managedLocations
 */
LocationResource.prototype['managedLocations'] = undefined;

/**
 * FactSet location ID managing this location for a Research Entitlements Administrator and requesting location-based entitlements for all managed locations associated.
 * @member {module:model/LocationResourceReference} managingLocation
 */
LocationResource.prototype['managingLocation'] = undefined;

/**
 * The managing or otherwise parent location associated with this location. All locations associated with the mainLocation are viewed as related and within the same business unit in FactSet's CRM systems.
 * @member {module:model/LocationResourceReference} mainLocation
 */
LocationResource.prototype['mainLocation'] = undefined;

/**
 * The FactSet usernames that are valid for users in this location.
 * @member {Array.<String>} usernames
 */
LocationResource.prototype['usernames'] = undefined;

/**
 * @member {module:model/LocationResourceMeta} meta
 */
LocationResource.prototype['meta'] = undefined;






export default LocationResource;

