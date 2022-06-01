/**
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ResultsMetadata from './ResultsMetadata';

/**
 * The PaginatedCalculationResponse model module.
 * @module model/PaginatedCalculationResponse
 * @version 0.20.1
 */
class PaginatedCalculationResponse {
    /**
     * Constructs a new <code>PaginatedCalculationResponse</code>.
     * Paged results from screen calculation
     * @alias module:model/PaginatedCalculationResponse
     */
    constructor() { 
        
        PaginatedCalculationResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PaginatedCalculationResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PaginatedCalculationResponse} obj Optional instance to populate.
     * @return {module:model/PaginatedCalculationResponse} The populated <code>PaginatedCalculationResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PaginatedCalculationResponse();

            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ResultsMetadata.constructFromObject(data['meta']);
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ResultsMetadata} meta
 */
PaginatedCalculationResponse.prototype['meta'] = undefined;

/**
 * Stach v2 column oriented paginated screen results
 * @member {Object} data
 */
PaginatedCalculationResponse.prototype['data'] = undefined;






export default PaginatedCalculationResponse;

