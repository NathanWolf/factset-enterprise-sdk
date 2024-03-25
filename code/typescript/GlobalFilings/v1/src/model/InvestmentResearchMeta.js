/**
 * Global Filings API
 *  The Filings API provides a comprehensive set of functionalities for searching and retrieving filing documents from various sources.  This API is designed to expose document search and document retrieval functionality. A document search will allow a request to query FactSet document databases based on certain search criteria specified in the request.  In addition, a document count request will provide information on the number of stories available for a particular security.  The reference endpoints, such as sources, formTypes, timeZones, and categories, provide comprehensive lists of available sources, form types, time zones, and categories, respectively.
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
import InvestmentResearchMetaPagination from './InvestmentResearchMetaPagination';

/**
 * The InvestmentResearchMeta model module.
 * @module model/InvestmentResearchMeta
 */
class InvestmentResearchMeta {
    /**
     * Constructs a new <code>InvestmentResearchMeta</code>.
     * Meta Object
     * @alias module:model/InvestmentResearchMeta
     */
    constructor() { 
        
        InvestmentResearchMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InvestmentResearchMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InvestmentResearchMeta} obj Optional instance to populate.
     * @return {module:model/InvestmentResearchMeta} The populated <code>InvestmentResearchMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InvestmentResearchMeta();

            if (data.hasOwnProperty('pagination')) {
                obj['pagination'] = InvestmentResearchMetaPagination.constructFromObject(data['pagination']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InvestmentResearchMetaPagination} pagination
 */
InvestmentResearchMeta.prototype['pagination'] = undefined;






export default InvestmentResearchMeta;

