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

/**
 * The PaginationResponse model module.
 * @module model/PaginationResponse
 * @version 0.20.1
 */
class PaginationResponse {
    /**
     * Constructs a new <code>PaginationResponse</code>.
     * @alias module:model/PaginationResponse
     */
    constructor() { 
        
        PaginationResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PaginationResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PaginationResponse} obj Optional instance to populate.
     * @return {module:model/PaginationResponse} The populated <code>PaginationResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PaginationResponse();

            if (data.hasOwnProperty('isEstimatedTotal')) {
                obj['isEstimatedTotal'] = ApiClient.convertToType(data['isEstimatedTotal'], 'Boolean');
            }
            if (data.hasOwnProperty('next')) {
                obj['next'] = ApiClient.convertToType(data['next'], 'String');
            }
            if (data.hasOwnProperty('prev')) {
                obj['prev'] = ApiClient.convertToType(data['prev'], 'Number');
            }
            if (data.hasOwnProperty('total')) {
                obj['total'] = ApiClient.convertToType(data['total'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Denotes if the 'total' property is an estimation
 * @member {Boolean} isEstimatedTotal
 */
PaginationResponse.prototype['isEstimatedTotal'] = undefined;

/**
 * Next cursor to be sent, will be null when there are no more results
 * @member {String} next
 */
PaginationResponse.prototype['next'] = undefined;

/**
 * Previous cursor, currently not supported
 * @member {Number} prev
 */
PaginationResponse.prototype['prev'] = undefined;

/**
 * Total number of rows in the screen
 * @member {Number} total
 */
PaginationResponse.prototype['total'] = undefined;






export default PaginationResponse;

