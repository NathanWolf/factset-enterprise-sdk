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
 * The Profile model module.
 * @module model/Profile
 * @version 0.20.0
 */
class Profile {
    /**
     * Constructs a new <code>Profile</code>.
     * Basic information about a person entity.
     * @alias module:model/Profile
     */
    constructor() { 
        
        Profile.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Profile</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Profile} obj Optional instance to populate.
     * @return {module:model/Profile} The populated <code>Profile</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Profile();

            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('personId')) {
                obj['personId'] = ApiClient.convertToType(data['personId'], 'String');
            }
            if (data.hasOwnProperty('lastName')) {
                obj['lastName'] = ApiClient.convertToType(data['lastName'], 'String');
            }
            if (data.hasOwnProperty('factsetName')) {
                obj['factsetName'] = ApiClient.convertToType(data['factsetName'], 'String');
            }
            if (data.hasOwnProperty('firstName')) {
                obj['firstName'] = ApiClient.convertToType(data['firstName'], 'String');
            }
            if (data.hasOwnProperty('middleName')) {
                obj['middleName'] = ApiClient.convertToType(data['middleName'], 'String');
            }
            if (data.hasOwnProperty('formalName')) {
                obj['formalName'] = ApiClient.convertToType(data['formalName'], 'String');
            }
            if (data.hasOwnProperty('properName')) {
                obj['properName'] = ApiClient.convertToType(data['properName'], 'String');
            }
            if (data.hasOwnProperty('salutation')) {
                obj['salutation'] = ApiClient.convertToType(data['salutation'], 'String');
            }
            if (data.hasOwnProperty('highestDegree')) {
                obj['highestDegree'] = ApiClient.convertToType(data['highestDegree'], 'String');
            }
            if (data.hasOwnProperty('highestDegreeInst')) {
                obj['highestDegreeInst'] = ApiClient.convertToType(data['highestDegreeInst'], 'String');
            }
            if (data.hasOwnProperty('suffix')) {
                obj['suffix'] = ApiClient.convertToType(data['suffix'], 'String');
            }
            if (data.hasOwnProperty('age')) {
                obj['age'] = ApiClient.convertToType(data['age'], 'Number');
            }
            if (data.hasOwnProperty('gender')) {
                obj['gender'] = ApiClient.convertToType(data['gender'], 'String');
            }
            if (data.hasOwnProperty('salary')) {
                obj['salary'] = ApiClient.convertToType(data['salary'], 'Number');
            }
            if (data.hasOwnProperty('totalCompensation')) {
                obj['totalCompensation'] = ApiClient.convertToType(data['totalCompensation'], 'Number');
            }
            if (data.hasOwnProperty('primaryCompanyId')) {
                obj['primaryCompanyId'] = ApiClient.convertToType(data['primaryCompanyId'], 'String');
            }
            if (data.hasOwnProperty('primaryCompanyName')) {
                obj['primaryCompanyName'] = ApiClient.convertToType(data['primaryCompanyName'], 'String');
            }
            if (data.hasOwnProperty('primaryTitle')) {
                obj['primaryTitle'] = ApiClient.convertToType(data['primaryTitle'], 'String');
            }
            if (data.hasOwnProperty('biography')) {
                obj['biography'] = ApiClient.convertToType(data['biography'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Person identifier used in the request.
 * @member {String} requestId
 */
Profile.prototype['requestId'] = undefined;

/**
 * FactSet Entity Identifier for the Person
 * @member {String} personId
 */
Profile.prototype['personId'] = undefined;

/**
 * Last Name
 * @member {String} lastName
 */
Profile.prototype['lastName'] = undefined;

/**
 * Name
 * @member {String} factsetName
 */
Profile.prototype['factsetName'] = undefined;

/**
 * First Name
 * @member {String} firstName
 */
Profile.prototype['firstName'] = undefined;

/**
 * Middle Name
 * @member {String} middleName
 */
Profile.prototype['middleName'] = undefined;

/**
 * Formal Name
 * @member {String} formalName
 */
Profile.prototype['formalName'] = undefined;

/**
 * Proper Name
 * @member {String} properName
 */
Profile.prototype['properName'] = undefined;

/**
 * Primary Salutation of Name
 * @member {String} salutation
 */
Profile.prototype['salutation'] = undefined;

/**
 * The Highest Held Degree Code.
 * @member {String} highestDegree
 */
Profile.prototype['highestDegree'] = undefined;

/**
 * The Highest Degree Institution Name.
 * @member {String} highestDegreeInst
 */
Profile.prototype['highestDegreeInst'] = undefined;

/**
 * Suffix of Name
 * @member {String} suffix
 */
Profile.prototype['suffix'] = undefined;

/**
 * Person's age in years.
 * @member {Number} age
 */
Profile.prototype['age'] = undefined;

/**
 * Person's Gender.
 * @member {String} gender
 */
Profile.prototype['gender'] = undefined;

/**
 * Most Recent Salary
 * @member {Number} salary
 */
Profile.prototype['salary'] = undefined;

/**
 * Most Recent Total Compensation
 * @member {Number} totalCompensation
 */
Profile.prototype['totalCompensation'] = undefined;

/**
 * Entity identifier of primary `Company` of employment.
 * @member {String} primaryCompanyId
 */
Profile.prototype['primaryCompanyId'] = undefined;

/**
 * Name of primary company of employment
 * @member {String} primaryCompanyName
 */
Profile.prototype['primaryCompanyName'] = undefined;

/**
 * Title at primary `Company` of employment
 * @member {String} primaryTitle
 */
Profile.prototype['primaryTitle'] = undefined;

/**
 * Brief biography of the person requested.
 * @member {String} biography
 */
Profile.prototype['biography'] = undefined;






export default Profile;

