/**
 * Documents Distributor - Documents API
 * Documents APIs that provide filings such as Global Filings and XML files such as StreetAccount    Global Filings API provides the capability to search and download filings documents from various exchanges around the world. The API also provides relevant metadata such as document source, company identifiers and form type around each filings document. Filings providers currently include EDGAR and SYMEX WebDisclosure.      StreetAccount XML API provides access to historical StreetAccount (SA) news. SA provides a summary for various corporate and market news written by journalist with background in financial markets.    The API delivers SA stories in XML format based on user-specified date input parameters. When the API request is completed, output files will be made available back to the users through a secure URL. This API has three endpoints (1) Request Files (2) Check Status (3) Get Files.   Files delivered contain both metadata and content body in each file. This eliminates the need to make multiple requests through multiple services to get all the information.  
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
 * The Filings model module.
 * @module model/Filings
 * @version 0.9.0
 */
class Filings {
    /**
     * Constructs a new <code>Filings</code>.
     * @alias module:model/Filings
     */
    constructor() { 
        
        Filings.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Filings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Filings} obj Optional instance to populate.
     * @return {module:model/Filings} The populated <code>Filings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Filings();

            if (data.hasOwnProperty('file_name')) {
                obj['file_name'] = ApiClient.convertToType(data['file_name'], 'String');
            }
            if (data.hasOwnProperty('headline')) {
                obj['headline'] = ApiClient.convertToType(data['headline'], 'String');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], 'String');
            }
            if (data.hasOwnProperty('publishDate')) {
                obj['publishDate'] = ApiClient.convertToType(data['publishDate'], 'String');
            }
            if (data.hasOwnProperty('companyName')) {
                obj['companyName'] = ApiClient.convertToType(data['companyName'], 'String');
            }
            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = ApiClient.convertToType(data['identifier'], 'String');
            }
            if (data.hasOwnProperty('fileSize')) {
                obj['fileSize'] = ApiClient.convertToType(data['fileSize'], 'String');
            }
            if (data.hasOwnProperty('fileFormat')) {
                obj['fileFormat'] = ApiClient.convertToType(data['fileFormat'], 'String');
            }
            if (data.hasOwnProperty('formType')) {
                obj['formType'] = ApiClient.convertToType(data['formType'], 'String');
            }
            if (data.hasOwnProperty('period')) {
                obj['period'] = ApiClient.convertToType(data['period'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Unique ID of the filings document.
 * @member {String} file_name
 */
Filings.prototype['file_name'] = undefined;

/**
 * Headline of the filings document.
 * @member {String} headline
 */
Filings.prototype['headline'] = undefined;

/**
 * Source of the filings document.
 * @member {String} source
 */
Filings.prototype['source'] = undefined;

/**
 * Date the filings document was made published.
 * @member {String} publishDate
 */
Filings.prototype['publishDate'] = undefined;

/**
 * Company name.
 * @member {String} companyName
 */
Filings.prototype['companyName'] = undefined;

/**
 * Company ticker.
 * @member {String} identifier
 */
Filings.prototype['identifier'] = undefined;

/**
 * File size in KB.
 * @member {String} fileSize
 */
Filings.prototype['fileSize'] = undefined;

/**
 * File format of the filings document.
 * @member {String} fileFormat
 */
Filings.prototype['fileFormat'] = undefined;

/**
 * Form type of the filings document, specific to the document source.
 * @member {String} formType
 */
Filings.prototype['formType'] = undefined;

/**
 * End date of the company's filing period.
 * @member {String} period
 */
Filings.prototype['period'] = undefined;

/**
 * Download link for the filings document.
 * @member {String} url
 */
Filings.prototype['url'] = undefined;






export default Filings;

