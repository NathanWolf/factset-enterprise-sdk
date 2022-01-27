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
import InlineResponse20036Fsym from './InlineResponse20036Fsym';
import InlineResponse20038DataCategories from './InlineResponse20038DataCategories';
import InlineResponse20088InstrumentNsin from './InlineResponse20088InstrumentNsin';
import InlineResponse20089InstrumentAssetClass from './InlineResponse20089InstrumentAssetClass';
import InlineResponse20089InstrumentName from './InlineResponse20089InstrumentName';

/**
 * The InlineResponse20089Instrument model module.
 * @module model/InlineResponse20089Instrument
 * @version 0.9.0
 */
class InlineResponse20089Instrument {
    /**
     * Constructs a new <code>InlineResponse20089Instrument</code>.
     * Instrument data of the notation.
     * @alias module:model/InlineResponse20089Instrument
     */
    constructor() { 
        
        InlineResponse20089Instrument.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20089Instrument</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20089Instrument} obj Optional instance to populate.
     * @return {module:model/InlineResponse20089Instrument} The populated <code>InlineResponse20089Instrument</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20089Instrument();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = InlineResponse20089InstrumentName.constructFromObject(data['name']);
            }
            if (data.hasOwnProperty('isin')) {
                obj['isin'] = ApiClient.convertToType(data['isin'], 'String');
            }
            if (data.hasOwnProperty('nsin')) {
                obj['nsin'] = InlineResponse20088InstrumentNsin.constructFromObject(data['nsin']);
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = InlineResponse20036Fsym.constructFromObject(data['fsym']);
            }
            if (data.hasOwnProperty('assetClass')) {
                obj['assetClass'] = InlineResponse20089InstrumentAssetClass.constructFromObject(data['assetClass']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], [InlineResponse20038DataCategories]);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the instrument.
 * @member {String} id
 */
InlineResponse20089Instrument.prototype['id'] = undefined;

/**
 * @member {module:model/InlineResponse20089InstrumentName} name
 */
InlineResponse20089Instrument.prototype['name'] = undefined;

/**
 * International Securities Identification Number of the instrument.
 * @member {String} isin
 */
InlineResponse20089Instrument.prototype['isin'] = undefined;

/**
 * @member {module:model/InlineResponse20088InstrumentNsin} nsin
 */
InlineResponse20089Instrument.prototype['nsin'] = undefined;

/**
 * @member {module:model/InlineResponse20036Fsym} fsym
 */
InlineResponse20089Instrument.prototype['fsym'] = undefined;

/**
 * @member {module:model/InlineResponse20089InstrumentAssetClass} assetClass
 */
InlineResponse20089Instrument.prototype['assetClass'] = undefined;

/**
 * Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity. See endpoint `/category/listBySystem` for category systems 18 for possible values.
 * @member {Array.<module:model/InlineResponse20038DataCategories>} type
 */
InlineResponse20089Instrument.prototype['type'] = undefined;






export default InlineResponse20089Instrument;

