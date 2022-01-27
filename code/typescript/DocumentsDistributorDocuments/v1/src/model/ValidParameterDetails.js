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
 * The ValidParameterDetails model module.
 * @module model/ValidParameterDetails
 * @version 0.9.0
 */
class ValidParameterDetails {
    /**
     * Constructs a new <code>ValidParameterDetails</code>.
     * @alias module:model/ValidParameterDetails
     */
    constructor() { 
        
        ValidParameterDetails.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ValidParameterDetails</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ValidParameterDetails} obj Optional instance to populate.
     * @return {module:model/ValidParameterDetails} The populated <code>ValidParameterDetails</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ValidParameterDetails();

            if (data.hasOwnProperty('_sort')) {
                obj['_sort'] = ApiClient.convertToType(data['_sort'], Object);
            }
            if (data.hasOwnProperty('_paginationLimit')) {
                obj['_paginationLimit'] = ApiClient.convertToType(data['_paginationLimit'], Object);
            }
            if (data.hasOwnProperty('_paginationOffset')) {
                obj['_paginationOffset'] = ApiClient.convertToType(data['_paginationOffset'], Object);
            }
            if (data.hasOwnProperty('startDate')) {
                obj['startDate'] = ApiClient.convertToType(data['startDate'], Object);
            }
            if (data.hasOwnProperty('endDate')) {
                obj['endDate'] = ApiClient.convertToType(data['endDate'], Object);
            }
            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], Object);
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object} _sort
 */
ValidParameterDetails.prototype['_sort'] = undefined;

/**
 * @member {Object} _paginationLimit
 */
ValidParameterDetails.prototype['_paginationLimit'] = undefined;

/**
 * @member {Object} _paginationOffset
 */
ValidParameterDetails.prototype['_paginationOffset'] = undefined;

/**
 * @member {Object} startDate
 */
ValidParameterDetails.prototype['startDate'] = undefined;

/**
 * @member {Object} endDate
 */
ValidParameterDetails.prototype['endDate'] = undefined;

/**
 * @member {Object} ids
 */
ValidParameterDetails.prototype['ids'] = undefined;

/**
 * @member {Object} source
 */
ValidParameterDetails.prototype['source'] = undefined;






export default ValidParameterDetails;

