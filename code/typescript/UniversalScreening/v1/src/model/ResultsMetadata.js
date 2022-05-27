/**
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PaginationResponse from './PaginationResponse';

/**
 * The ResultsMetadata model module.
 * @module model/ResultsMetadata
 * @version 0.20.0
 */
class ResultsMetadata {
    /**
     * Constructs a new <code>ResultsMetadata</code>.
     * Metadata for results
     * @alias module:model/ResultsMetadata
     */
    constructor() { 
        
        ResultsMetadata.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ResultsMetadata</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ResultsMetadata} obj Optional instance to populate.
     * @return {module:model/ResultsMetadata} The populated <code>ResultsMetadata</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ResultsMetadata();

            if (data.hasOwnProperty('pagination')) {
                obj['pagination'] = PaginationResponse.constructFromObject(data['pagination']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/PaginationResponse} pagination
 */
ResultsMetadata.prototype['pagination'] = undefined;






export default ResultsMetadata;

