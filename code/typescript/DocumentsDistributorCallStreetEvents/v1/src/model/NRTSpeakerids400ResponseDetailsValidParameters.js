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

/**
 * The NRTSpeakerids400ResponseDetailsValidParameters model module.
 * @module model/NRTSpeakerids400ResponseDetailsValidParameters
 * @version 0.20.0
 */
class NRTSpeakerids400ResponseDetailsValidParameters {
    /**
     * Constructs a new <code>NRTSpeakerids400ResponseDetailsValidParameters</code>.
     * @alias module:model/NRTSpeakerids400ResponseDetailsValidParameters
     */
    constructor() { 
        
        NRTSpeakerids400ResponseDetailsValidParameters.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NRTSpeakerids400ResponseDetailsValidParameters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NRTSpeakerids400ResponseDetailsValidParameters} obj Optional instance to populate.
     * @return {module:model/NRTSpeakerids400ResponseDetailsValidParameters} The populated <code>NRTSpeakerids400ResponseDetailsValidParameters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NRTSpeakerids400ResponseDetailsValidParameters();

            if (data.hasOwnProperty('_sort')) {
                obj['_sort'] = ApiClient.convertToType(data['_sort'], ['String']);
            }
            if (data.hasOwnProperty('_paginationLimit')) {
                obj['_paginationLimit'] = ApiClient.convertToType(data['_paginationLimit'], ['String']);
            }
            if (data.hasOwnProperty('_paginationOffset')) {
                obj['_paginationOffset'] = ApiClient.convertToType(data['_paginationOffset'], ['String']);
            }
            if (data.hasOwnProperty('audioSourceId')) {
                obj['audioSourceId'] = ApiClient.convertToType(data['audioSourceId'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} _sort
 */
NRTSpeakerids400ResponseDetailsValidParameters.prototype['_sort'] = undefined;

/**
 * @member {Array.<String>} _paginationLimit
 */
NRTSpeakerids400ResponseDetailsValidParameters.prototype['_paginationLimit'] = undefined;

/**
 * @member {Array.<String>} _paginationOffset
 */
NRTSpeakerids400ResponseDetailsValidParameters.prototype['_paginationOffset'] = undefined;

/**
 * @member {Array.<String>} audioSourceId
 */
NRTSpeakerids400ResponseDetailsValidParameters.prototype['audioSourceId'] = undefined;






export default NRTSpeakerids400ResponseDetailsValidParameters;

