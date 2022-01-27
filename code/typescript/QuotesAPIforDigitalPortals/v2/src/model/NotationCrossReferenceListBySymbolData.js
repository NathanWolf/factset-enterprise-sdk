/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import NotationCrossReferenceListByInstrumentDataFilter from './NotationCrossReferenceListByInstrumentDataFilter';

/**
 * The NotationCrossReferenceListBySymbolData model module.
 * @module model/NotationCrossReferenceListBySymbolData
 * @version 0.9.0
 */
class NotationCrossReferenceListBySymbolData {
    /**
     * Constructs a new <code>NotationCrossReferenceListBySymbolData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/NotationCrossReferenceListBySymbolData
     * @param symbol {String} Market-specific code to identify a notation.
     */
    constructor(symbol) { 
        
        NotationCrossReferenceListBySymbolData.initialize(this, symbol);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, symbol) { 
        obj['symbol'] = symbol;
    }

    /**
     * Constructs a <code>NotationCrossReferenceListBySymbolData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NotationCrossReferenceListBySymbolData} obj Optional instance to populate.
     * @return {module:model/NotationCrossReferenceListBySymbolData} The populated <code>NotationCrossReferenceListBySymbolData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NotationCrossReferenceListBySymbolData();

            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('filter')) {
                obj['filter'] = NotationCrossReferenceListByInstrumentDataFilter.constructFromObject(data['filter']);
            }
        }
        return obj;
    }


}

/**
 * Market-specific code to identify a notation.
 * @member {String} symbol
 */
NotationCrossReferenceListBySymbolData.prototype['symbol'] = undefined;

/**
 * @member {module:model/NotationCrossReferenceListByInstrumentDataFilter} filter
 */
NotationCrossReferenceListBySymbolData.prototype['filter'] = undefined;






export default NotationCrossReferenceListBySymbolData;

