/**
 * FactSet Ownership API
 * FactSet’s Fund Ownership API gives access to both **Holdings** and **Holders** data.<p> Factset's Holdings endpoints gives access to all the underlying securities and their position detils held within a given fund. Fund Types supported include Open-End Mutual Funds, Closed-end Mutual Funds, and Exchange Traded Funds. Security Holders information retrieves all \"holder types\" and their positions across institutions, funds, insiders, and stakeholders.</p><p>The FactSet Ownership and Mutual Funds database collects global equity ownership data for approximately 50,000 institutions, 60,000 unique Mutual Fund portfolios, and 400,000 Insider/Stake holders from around 110 countries.  For more details review our [Data Collection](https://my.apps.factset.com/oa/cms/oaAttachment/87e162be-f2d1-4f40-a85b-bfb1b020d270/20079) methodology. </p> 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SecurityHolders model module.
 * @module model/SecurityHolders
 * @version 0.20.0
 */
class SecurityHolders {
    /**
     * Constructs a new <code>SecurityHolders</code>.
     * Security Holders response object
     * @alias module:model/SecurityHolders
     */
    constructor() { 
        
        SecurityHolders.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecurityHolders</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecurityHolders} obj Optional instance to populate.
     * @return {module:model/SecurityHolders} The populated <code>SecurityHolders</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecurityHolders();

            if (data.hasOwnProperty('holderId')) {
                obj['holderId'] = ApiClient.convertToType(data['holderId'], 'String');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('holderEntityId')) {
                obj['holderEntityId'] = ApiClient.convertToType(data['holderEntityId'], 'String');
            }
            if (data.hasOwnProperty('holderName')) {
                obj['holderName'] = ApiClient.convertToType(data['holderName'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('investorType')) {
                obj['investorType'] = ApiClient.convertToType(data['investorType'], 'String');
            }
            if (data.hasOwnProperty('holderType')) {
                obj['holderType'] = ApiClient.convertToType(data['holderType'], 'String');
            }
            if (data.hasOwnProperty('adjHolding')) {
                obj['adjHolding'] = ApiClient.convertToType(data['adjHolding'], 'Number');
            }
            if (data.hasOwnProperty('adjMarketValue')) {
                obj['adjMarketValue'] = ApiClient.convertToType(data['adjMarketValue'], 'Number');
            }
            if (data.hasOwnProperty('weightClose')) {
                obj['weightClose'] = ApiClient.convertToType(data['weightClose'], 'Number');
            }
            if (data.hasOwnProperty('percentOutstanding')) {
                obj['percentOutstanding'] = ApiClient.convertToType(data['percentOutstanding'], 'Number');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Ownership Holders ID that corresponds to the requested security holder.
 * @member {String} holderId
 */
SecurityHolders.prototype['holderId'] = undefined;

/**
 * FactSet Security Identifier of security requested. This does not represent the FactSet permanent identifier for the holder, but rather the requested id. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier.
 * @member {String} fsymId
 */
SecurityHolders.prototype['fsymId'] = undefined;

/**
 * FactSet Entity ID that corresponds to the specified holder ID.
 * @member {String} holderEntityId
 */
SecurityHolders.prototype['holderEntityId'] = undefined;

/**
 * Name of the holder for the requested security identifier.
 * @member {String} holderName
 */
SecurityHolders.prototype['holderName'] = undefined;

/**
 * Date of the reported holding in YYYY-MM-DD format. For more details regarding date resolution, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).
 * @member {Date} date
 */
SecurityHolders.prototype['date'] = undefined;

/**
 * Currency code. The service will default to the local currency if the currency is not requested. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
SecurityHolders.prototype['currency'] = undefined;

/**
 * FactSet Ownership Institution, Mutual Fund, and Insider/Stakeholder investor types. To learn more about the different investor types, visit [Online Assistant Page #11656](https://my.apps.factset.com/oa/pages/11656).
 * @member {String} investorType
 */
SecurityHolders.prototype['investorType'] = undefined;

/**
 * Holder Type name of the respective holder object. The name will align to the holderType requested. 
 * @member {String} holderType
 */
SecurityHolders.prototype['holderType'] = undefined;

/**
 * Adjusted number of shares held. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet's Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).
 * @member {Number} adjHolding
 */
SecurityHolders.prototype['adjHolding'] = undefined;

/**
 * Adjusted market values of shares held. Market Value. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet's Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).
 * @member {Number} adjMarketValue
 */
SecurityHolders.prototype['adjMarketValue'] = undefined;

/**
 * \"Closing weight of the security for the holders of the requested security (percent). To learn more about how ownership weight is calculated please visit [Online Assistant Page #11247](https://my.apps.factset.com/oa/pages/11247).\" 
 * @member {Number} weightClose
 */
SecurityHolders.prototype['weightClose'] = undefined;

/**
 * The percent of the outstanding common shares held by a particular filing institution. To learn more, visit [Online Assistant Page #11041](https://my.apps.factset.com/oa/pages/11041).
 * @member {Number} percentOutstanding
 */
SecurityHolders.prototype['percentOutstanding'] = undefined;

/**
 * Either the 13F Form or ND-30D report filed where the security holdings data was sourced from. To learn more about source, please visit https://my.apps.factset.com/oa/pages/11260
 * @member {String} source
 */
SecurityHolders.prototype['source'] = undefined;

/**
 * Security Identifier that was used in the request. 
 * @member {String} requestId
 */
SecurityHolders.prototype['requestId'] = undefined;






export default SecurityHolders;

