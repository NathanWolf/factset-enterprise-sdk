/**
 * Signals API
 * Collection of endpoints for providing Signal Events, Definitions and Metadata
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: signals.api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import IdResolutionsMeta from './IdResolutionsMeta';

/**
 * The EventMeta model module.
 * @module model/EventMeta
 * @version 0.20.0
 */
class EventMeta {
    /**
     * Constructs a new <code>EventMeta</code>.
     * @alias module:model/EventMeta
     * @param signalRequestId {String} 
     * @param idResolutions {module:model/IdResolutionsMeta} 
     */
    constructor(signalRequestId, idResolutions) { 
        
        EventMeta.initialize(this, signalRequestId, idResolutions);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, signalRequestId, idResolutions) { 
        obj['signalRequestId'] = signalRequestId;
        obj['idResolutions'] = idResolutions;
    }

    /**
     * Constructs a <code>EventMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EventMeta} obj Optional instance to populate.
     * @return {module:model/EventMeta} The populated <code>EventMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EventMeta();

            if (data.hasOwnProperty('signalRequestId')) {
                obj['signalRequestId'] = ApiClient.convertToType(data['signalRequestId'], 'String');
            }
            if (data.hasOwnProperty('idResolutions')) {
                obj['idResolutions'] = IdResolutionsMeta.constructFromObject(data['idResolutions']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} signalRequestId
 */
EventMeta.prototype['signalRequestId'] = undefined;

/**
 * @member {module:model/IdResolutionsMeta} idResolutions
 */
EventMeta.prototype['idResolutions'] = undefined;






export default EventMeta;

