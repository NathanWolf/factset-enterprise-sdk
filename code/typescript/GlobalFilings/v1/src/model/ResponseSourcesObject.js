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
import ResponseSourcesObjectSourcesObject from './ResponseSourcesObjectSourcesObject';

/**
 * The ResponseSourcesObject model module.
 * @module model/ResponseSourcesObject
 */
class ResponseSourcesObject {
    /**
     * Constructs a new <code>ResponseSourcesObject</code>.
     * @alias module:model/ResponseSourcesObject
     */
    constructor() { 
        
        ResponseSourcesObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ResponseSourcesObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ResponseSourcesObject} obj Optional instance to populate.
     * @return {module:model/ResponseSourcesObject} The populated <code>ResponseSourcesObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ResponseSourcesObject();

            if (data.hasOwnProperty('sourcesObject')) {
                obj['sourcesObject'] = ResponseSourcesObjectSourcesObject.constructFromObject(data['sourcesObject']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ResponseSourcesObjectSourcesObject} sourcesObject
 */
ResponseSourcesObject.prototype['sourcesObject'] = undefined;






export default ResponseSourcesObject;

