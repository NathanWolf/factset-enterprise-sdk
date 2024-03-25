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
import ResponseFormtypeObject from './ResponseFormtypeObject';

/**
 * The ResponseFormtype model module.
 * @module model/ResponseFormtype
 */
class ResponseFormtype {
    /**
     * Constructs a new <code>ResponseFormtype</code>.
     * Filings Response Object
     * @alias module:model/ResponseFormtype
     */
    constructor() { 
        
        ResponseFormtype.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ResponseFormtype</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ResponseFormtype} obj Optional instance to populate.
     * @return {module:model/ResponseFormtype} The populated <code>ResponseFormtype</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ResponseFormtype();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [ResponseFormtypeObject]);
            }
        }
        return obj;
    }


}

/**
 * Data Array Object
 * @member {Array.<module:model/ResponseFormtypeObject>} data
 */
ResponseFormtype.prototype['data'] = undefined;






export default ResponseFormtype;

