/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PACalculationColumn from './PACalculationColumn';
import PACalculationDataSources from './PACalculationDataSources';
import PACalculationGroup from './PACalculationGroup';
import PADateParameters from './PADateParameters';
import PAIdentifier from './PAIdentifier';

/**
 * The PAComponentData model module.
 * @module model/PAComponentData
 * @version 0.20.0
 */
class PAComponentData {
    /**
     * Constructs a new <code>PAComponentData</code>.
     * @alias module:model/PAComponentData
     */
    constructor() { 
        
        PAComponentData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PAComponentData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PAComponentData} obj Optional instance to populate.
     * @return {module:model/PAComponentData} The populated <code>PAComponentData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PAComponentData();

            if (data.hasOwnProperty('accounts')) {
                obj['accounts'] = ApiClient.convertToType(data['accounts'], [PAIdentifier]);
            }
            if (data.hasOwnProperty('benchmarks')) {
                obj['benchmarks'] = ApiClient.convertToType(data['benchmarks'], [PAIdentifier]);
            }
            if (data.hasOwnProperty('groups')) {
                obj['groups'] = ApiClient.convertToType(data['groups'], [PACalculationGroup]);
            }
            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], [PACalculationColumn]);
            }
            if (data.hasOwnProperty('dates')) {
                obj['dates'] = PADateParameters.constructFromObject(data['dates']);
            }
            if (data.hasOwnProperty('datasources')) {
                obj['datasources'] = PACalculationDataSources.constructFromObject(data['datasources']);
            }
            if (data.hasOwnProperty('currencyisocode')) {
                obj['currencyisocode'] = ApiClient.convertToType(data['currencyisocode'], 'String');
            }
            if (data.hasOwnProperty('componentdetail')) {
                obj['componentdetail'] = ApiClient.convertToType(data['componentdetail'], 'String');
            }
        }
        return obj;
    }


}

/**
 * List of accounts.
 * @member {Array.<module:model/PAIdentifier>} accounts
 */
PAComponentData.prototype['accounts'] = undefined;

/**
 * List of benchmarks.
 * @member {Array.<module:model/PAIdentifier>} benchmarks
 */
PAComponentData.prototype['benchmarks'] = undefined;

/**
 * List of groupings for the PA calculation. This will take precedence over the groupings saved in the PA document.
 * @member {Array.<module:model/PACalculationGroup>} groups
 */
PAComponentData.prototype['groups'] = undefined;

/**
 * List of columns for the PA calculation. This will take precedence over the columns saved in the PA document.
 * @member {Array.<module:model/PACalculationColumn>} columns
 */
PAComponentData.prototype['columns'] = undefined;

/**
 * @member {module:model/PADateParameters} dates
 */
PAComponentData.prototype['dates'] = undefined;

/**
 * @member {module:model/PACalculationDataSources} datasources
 */
PAComponentData.prototype['datasources'] = undefined;

/**
 * Currency ISO code for calculation.
 * @member {String} currencyisocode
 */
PAComponentData.prototype['currencyisocode'] = undefined;

/**
 * PA Storage type. It can be GROUPS or TOTALS or SECURITIES.
 * @member {String} componentdetail
 */
PAComponentData.prototype['componentdetail'] = undefined;






export default PAComponentData;

