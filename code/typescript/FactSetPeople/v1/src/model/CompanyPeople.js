/**
 * FactSet People API
 * The FactSet People API exposes FactSet data for individuals and their jobs. 
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

/**
 * The CompanyPeople model module.
 * @module model/CompanyPeople
 * @version 0.9.0
 */
class CompanyPeople {
    /**
     * Constructs a new <code>CompanyPeople</code>.
     * List of executives for the specified company identifier.
     * @alias module:model/CompanyPeople
     */
    constructor() { 
        
        CompanyPeople.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CompanyPeople</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CompanyPeople} obj Optional instance to populate.
     * @return {module:model/CompanyPeople} The populated <code>CompanyPeople</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CompanyPeople();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('email')) {
                obj['email'] = ApiClient.convertToType(data['email'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('jobFunction1')) {
                obj['jobFunction1'] = ApiClient.convertToType(data['jobFunction1'], 'String');
            }
            if (data.hasOwnProperty('jobFunction2')) {
                obj['jobFunction2'] = ApiClient.convertToType(data['jobFunction2'], 'String');
            }
            if (data.hasOwnProperty('jobFunction3')) {
                obj['jobFunction3'] = ApiClient.convertToType(data['jobFunction3'], 'String');
            }
            if (data.hasOwnProperty('jobFunction4')) {
                obj['jobFunction4'] = ApiClient.convertToType(data['jobFunction4'], 'String');
            }
            if (data.hasOwnProperty('mainPhone')) {
                obj['mainPhone'] = ApiClient.convertToType(data['mainPhone'], 'String');
            }
            if (data.hasOwnProperty('personId')) {
                obj['personId'] = ApiClient.convertToType(data['personId'], 'String');
            }
            if (data.hasOwnProperty('phone')) {
                obj['phone'] = ApiClient.convertToType(data['phone'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Identifier for the company requested.
 * @member {String} fsymId
 */
CompanyPeople.prototype['fsymId'] = undefined;

/**
 * Email of the person
 * @member {String} email
 */
CompanyPeople.prototype['email'] = undefined;

/**
 * FactSet Name of the person
 * @member {String} name
 */
CompanyPeople.prototype['name'] = undefined;

/**
 * Job Function1
 * @member {String} jobFunction1
 */
CompanyPeople.prototype['jobFunction1'] = undefined;

/**
 * Job Function2
 * @member {String} jobFunction2
 */
CompanyPeople.prototype['jobFunction2'] = undefined;

/**
 * Job Function3
 * @member {String} jobFunction3
 */
CompanyPeople.prototype['jobFunction3'] = undefined;

/**
 * Job Function4
 * @member {String} jobFunction4
 */
CompanyPeople.prototype['jobFunction4'] = undefined;

/**
 * Main Phone Numbers of the executives.
 * @member {String} mainPhone
 */
CompanyPeople.prototype['mainPhone'] = undefined;

/**
 * FactSet Entity Identifier for the Person.
 * @member {String} personId
 */
CompanyPeople.prototype['personId'] = undefined;

/**
 * Phone number of the executives.
 * @member {String} phone
 */
CompanyPeople.prototype['phone'] = undefined;

/**
 * Original identifier used for the request.
 * @member {String} requestId
 */
CompanyPeople.prototype['requestId'] = undefined;

/**
 * Executive titles for a specified company.
 * @member {String} title
 */
CompanyPeople.prototype['title'] = undefined;






export default CompanyPeople;

