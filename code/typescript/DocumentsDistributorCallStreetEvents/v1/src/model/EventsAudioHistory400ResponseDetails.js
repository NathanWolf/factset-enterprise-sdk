/**
 * Documents Distributor - CallStreet Events
 * CallStreet Events contains all the Documents Distributor APIs that offer events data such as Events Audio and Near Real-Time Transcripts.  The  Events Audio API provides access to historical as well as latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days.   This API also provides relevant metadata such as timestamps and identifiers around each audio file.  The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.  Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service. 
 *
 * The version of the OpenAPI document: 1.8.1
 * Contact: teamustang@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import EventsAudioHistory400ResponseDetailsValidParameters from './EventsAudioHistory400ResponseDetailsValidParameters';

/**
 * The EventsAudioHistory400ResponseDetails model module.
 * @module model/EventsAudioHistory400ResponseDetails
 */
class EventsAudioHistory400ResponseDetails {
    /**
     * Constructs a new <code>EventsAudioHistory400ResponseDetails</code>.
     * @alias module:model/EventsAudioHistory400ResponseDetails
     */
    constructor() { 
        
        EventsAudioHistory400ResponseDetails.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EventsAudioHistory400ResponseDetails</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EventsAudioHistory400ResponseDetails} obj Optional instance to populate.
     * @return {module:model/EventsAudioHistory400ResponseDetails} The populated <code>EventsAudioHistory400ResponseDetails</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EventsAudioHistory400ResponseDetails();

            if (data.hasOwnProperty('validParameters')) {
                obj['validParameters'] = EventsAudioHistory400ResponseDetailsValidParameters.constructFromObject(data['validParameters']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/EventsAudioHistory400ResponseDetailsValidParameters} validParameters
 */
EventsAudioHistory400ResponseDetails.prototype['validParameters'] = undefined;






export default EventsAudioHistory400ResponseDetails;

