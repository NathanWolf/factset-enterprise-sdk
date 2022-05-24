/**
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: FactSearch.Team@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import DataAnswer from './DataAnswer';
import NoAnswersFoundAllOf from './NoAnswersFoundAllOf';

/**
 * The NoAnswersFound model module.
 * @module model/NoAnswersFound
 * @version 0.20.0
 */
class NoAnswersFound {
    /**
     * Constructs a new <code>NoAnswersFound</code>.
     * @alias module:model/NoAnswersFound
     * @implements module:model/DataAnswer
     * @implements module:model/NoAnswersFoundAllOf
     * @param template {String} 
     * @param message {String} 
     * @param querySuggestions {Array.<String>} 
     */
    constructor(template, message, querySuggestions) { 
        DataAnswer.initialize(this, template);NoAnswersFoundAllOf.initialize(this, message, querySuggestions);
        NoAnswersFound.initialize(this, template, message, querySuggestions);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, template, message, querySuggestions) { 
        obj['template'] = template;
        obj['message'] = message;
        obj['querySuggestions'] = querySuggestions;
    }

    /**
     * Constructs a <code>NoAnswersFound</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NoAnswersFound} obj Optional instance to populate.
     * @return {module:model/NoAnswersFound} The populated <code>NoAnswersFound</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NoAnswersFound();
            DataAnswer.constructFromObject(data, obj);
            NoAnswersFoundAllOf.constructFromObject(data, obj);

            if (data.hasOwnProperty('template')) {
                obj['template'] = ApiClient.convertToType(data['template'], 'String');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
            if (data.hasOwnProperty('querySuggestions')) {
                obj['querySuggestions'] = ApiClient.convertToType(data['querySuggestions'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} template
 */
NoAnswersFound.prototype['template'] = undefined;

/**
 * @member {String} message
 */
NoAnswersFound.prototype['message'] = undefined;

/**
 * @member {Array.<String>} querySuggestions
 */
NoAnswersFound.prototype['querySuggestions'] = undefined;


// Implement DataAnswer interface:
/**
 * @member {String} template
 */
DataAnswer.prototype['template'] = undefined;
// Implement NoAnswersFoundAllOf interface:
/**
 * @member {String} message
 */
NoAnswersFoundAllOf.prototype['message'] = undefined;
/**
 * @member {Array.<String>} querySuggestions
 */
NoAnswersFoundAllOf.prototype['querySuggestions'] = undefined;




export default NoAnswersFound;

