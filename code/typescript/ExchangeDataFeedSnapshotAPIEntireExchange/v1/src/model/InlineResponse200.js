/**
 * Exchange Snapshot API
 * A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange. Clients that need access to the DFSnapshot product for a custom watchlist snapped at a client specified interval should use this API
 *
 * The version of the OpenAPI document: 1.0
 * Contact: teammustang@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse200 model module.
 * @module model/InlineResponse200
 * @version 0.20.0
 */
class InlineResponse200 {
    /**
     * Constructs a new <code>InlineResponse200</code>.
     * @alias module:model/InlineResponse200
     */
    constructor() { 
        
        InlineResponse200.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse200</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200} obj Optional instance to populate.
     * @return {module:model/InlineResponse200} The populated <code>InlineResponse200</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200();

            if (data.hasOwnProperty('product')) {
                obj['product'] = ApiClient.convertToType(data['product'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'String');
            }
            if (data.hasOwnProperty('responseType')) {
                obj['responseType'] = ApiClient.convertToType(data['responseType'], 'String');
            }
            if (data.hasOwnProperty('fileName')) {
                obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Product (Exchange) Code for which the data is requested
 * @member {String} product
 */
InlineResponse200.prototype['product'] = undefined;

/**
 * Date for which the snapshot is generated
 * @member {String} date
 */
InlineResponse200.prototype['date'] = undefined;

/**
 * Time for which the snapshot is generated
 * @member {String} time
 */
InlineResponse200.prototype['time'] = undefined;

/**
 * Type of data \"RT\" or \"DL\"
 * @member {String} responseType
 */
InlineResponse200.prototype['responseType'] = undefined;

/**
 * fileName a combination of product code, date of snapshot & time of snapshot
 * @member {String} fileName
 */
InlineResponse200.prototype['fileName'] = undefined;

/**
 * download link of snapshot file
 * @member {String} url
 */
InlineResponse200.prototype['url'] = undefined;






export default InlineResponse200;

