/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import DataSourceAllData from './DataSourceAllData';

/**
 * The DataSourceDataInstance model module.
 * @module model/DataSourceDataInstance
 */
class DataSourceDataInstance {
    /**
     * Constructs a new <code>DataSourceDataInstance</code>.
     * @alias module:model/DataSourceDataInstance
     */
    constructor() { 
        
        DataSourceDataInstance.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DataSourceDataInstance</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DataSourceDataInstance} obj Optional instance to populate.
     * @return {module:model/DataSourceDataInstance} The populated <code>DataSourceDataInstance</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DataSourceDataInstance();

            if (data.hasOwnProperty('data')) {
                obj['data'] = DataSourceAllData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/DataSourceAllData} data
 */
DataSourceDataInstance.prototype['data'] = undefined;






export default DataSourceDataInstance;

