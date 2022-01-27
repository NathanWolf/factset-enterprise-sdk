/**
 * Documents Distributor - CallStreet Events
 * CallStreet Events contains all the Documents Distributor APIs that provide events data such as Events Audio and Near Real-Time Transcripts  The  Events Audio API provides access to all audio recordings to various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import NRTCalls400ResponseDetailsValidParameters from './NRTCalls400ResponseDetailsValidParameters';

/**
 * The NRTCalls400ResponseDetails model module.
 * @module model/NRTCalls400ResponseDetails
 * @version 0.9.0
 */
class NRTCalls400ResponseDetails {
    /**
     * Constructs a new <code>NRTCalls400ResponseDetails</code>.
     * @alias module:model/NRTCalls400ResponseDetails
     */
    constructor() { 
        
        NRTCalls400ResponseDetails.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NRTCalls400ResponseDetails</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NRTCalls400ResponseDetails} obj Optional instance to populate.
     * @return {module:model/NRTCalls400ResponseDetails} The populated <code>NRTCalls400ResponseDetails</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NRTCalls400ResponseDetails();

            if (data.hasOwnProperty('validParameters')) {
                obj['validParameters'] = NRTCalls400ResponseDetailsValidParameters.constructFromObject(data['validParameters']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/NRTCalls400ResponseDetailsValidParameters} validParameters
 */
NRTCalls400ResponseDetails.prototype['validParameters'] = undefined;






export default NRTCalls400ResponseDetails;

