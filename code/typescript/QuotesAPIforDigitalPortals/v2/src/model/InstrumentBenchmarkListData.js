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
import InstrumentBenchmarkListDataFilter from './InstrumentBenchmarkListDataFilter';

/**
 * The InstrumentBenchmarkListData model module.
 * @module model/InstrumentBenchmarkListData
 * @version 0.9.2
 */
class InstrumentBenchmarkListData {
    /**
     * Constructs a new <code>InstrumentBenchmarkListData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/InstrumentBenchmarkListData
     * @param id {String} Identifier of an instrument.
     */
    constructor(id) { 
        
        InstrumentBenchmarkListData.initialize(this, id);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id) { 
        obj['id'] = id;
    }

    /**
     * Constructs a <code>InstrumentBenchmarkListData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InstrumentBenchmarkListData} obj Optional instance to populate.
     * @return {module:model/InstrumentBenchmarkListData} The populated <code>InstrumentBenchmarkListData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InstrumentBenchmarkListData();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('filter')) {
                obj['filter'] = InstrumentBenchmarkListDataFilter.constructFromObject(data['filter']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of an instrument.
 * @member {String} id
 */
InstrumentBenchmarkListData.prototype['id'] = undefined;

/**
 * @member {module:model/InstrumentBenchmarkListDataFilter} filter
 */
InstrumentBenchmarkListData.prototype['filter'] = undefined;






export default InstrumentBenchmarkListData;

