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

/**
 * The EventHeadlineDataItem model module.
 * @module model/EventHeadlineDataItem
 * @version 0.20.0
 */
class EventHeadlineDataItem {
    /**
     * Constructs a new <code>EventHeadlineDataItem</code>.
     * @alias module:model/EventHeadlineDataItem
     * @param requestId {String} The id that was requested. This can be a ticker, cusip or factset entity id.
     * @param signalId {String} Signal Id for this event. e.g. dilutionTrigger
     * @param signalName {String} Signal Name for this event. e.g. dilutionTrigger
     * @param theme {String} Theme name of the signal for this event. e.g. Debt Capital Structure
     * @param source {String} Primary data provider for the signal this event belongs to. e.g. FactSet, Bitvore
     * @param eventId {String} A unique id for this event.
     * @param eventDate {Date} The UTC date/time of the event in ISO 8601 format.
     * @param summary {String} One sentence summary of the event.
     * @param userRelevanceScore {Number} Relevancy score of this event for the requesting user on a scale of 0 to 1. Higher value indicates more relevancy.
     */
    constructor(requestId, signalId, signalName, theme, source, eventId, eventDate, summary, userRelevanceScore) { 
        
        EventHeadlineDataItem.initialize(this, requestId, signalId, signalName, theme, source, eventId, eventDate, summary, userRelevanceScore);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, requestId, signalId, signalName, theme, source, eventId, eventDate, summary, userRelevanceScore) { 
        obj['requestId'] = requestId;
        obj['signalId'] = signalId;
        obj['signalName'] = signalName;
        obj['theme'] = theme;
        obj['source'] = source;
        obj['eventId'] = eventId;
        obj['eventDate'] = eventDate;
        obj['summary'] = summary;
        obj['userRelevanceScore'] = userRelevanceScore;
    }

    /**
     * Constructs a <code>EventHeadlineDataItem</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EventHeadlineDataItem} obj Optional instance to populate.
     * @return {module:model/EventHeadlineDataItem} The populated <code>EventHeadlineDataItem</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EventHeadlineDataItem();

            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('signalId')) {
                obj['signalId'] = ApiClient.convertToType(data['signalId'], 'String');
            }
            if (data.hasOwnProperty('signalName')) {
                obj['signalName'] = ApiClient.convertToType(data['signalName'], 'String');
            }
            if (data.hasOwnProperty('theme')) {
                obj['theme'] = ApiClient.convertToType(data['theme'], 'String');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], 'String');
            }
            if (data.hasOwnProperty('eventId')) {
                obj['eventId'] = ApiClient.convertToType(data['eventId'], 'String');
            }
            if (data.hasOwnProperty('eventDate')) {
                obj['eventDate'] = ApiClient.convertToType(data['eventDate'], 'Date');
            }
            if (data.hasOwnProperty('summary')) {
                obj['summary'] = ApiClient.convertToType(data['summary'], 'String');
            }
            if (data.hasOwnProperty('userRelevanceScore')) {
                obj['userRelevanceScore'] = ApiClient.convertToType(data['userRelevanceScore'], 'Number');
            }
            if (data.hasOwnProperty('created')) {
                obj['created'] = ApiClient.convertToType(data['created'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * The id that was requested. This can be a ticker, cusip or factset entity id.
 * @member {String} requestId
 */
EventHeadlineDataItem.prototype['requestId'] = undefined;

/**
 * Signal Id for this event. e.g. dilutionTrigger
 * @member {String} signalId
 */
EventHeadlineDataItem.prototype['signalId'] = undefined;

/**
 * Signal Name for this event. e.g. dilutionTrigger
 * @member {String} signalName
 */
EventHeadlineDataItem.prototype['signalName'] = undefined;

/**
 * Theme name of the signal for this event. e.g. Debt Capital Structure
 * @member {String} theme
 */
EventHeadlineDataItem.prototype['theme'] = undefined;

/**
 * Primary data provider for the signal this event belongs to. e.g. FactSet, Bitvore
 * @member {String} source
 */
EventHeadlineDataItem.prototype['source'] = undefined;

/**
 * A unique id for this event.
 * @member {String} eventId
 */
EventHeadlineDataItem.prototype['eventId'] = undefined;

/**
 * The UTC date/time of the event in ISO 8601 format.
 * @member {Date} eventDate
 */
EventHeadlineDataItem.prototype['eventDate'] = undefined;

/**
 * One sentence summary of the event.
 * @member {String} summary
 */
EventHeadlineDataItem.prototype['summary'] = undefined;

/**
 * Relevancy score of this event for the requesting user on a scale of 0 to 1. Higher value indicates more relevancy.
 * @member {Number} userRelevanceScore
 */
EventHeadlineDataItem.prototype['userRelevanceScore'] = undefined;

/**
 * Date/Time in UTC the event was first recorded in our data store.
 * @member {Date} created
 */
EventHeadlineDataItem.prototype['created'] = undefined;






export default EventHeadlineDataItem;

