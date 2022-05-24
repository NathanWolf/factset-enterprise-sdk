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
 * The PACalculationParameters model module.
 * @module model/PACalculationParameters
 * @version 0.20.0
 */
class PACalculationParameters {
    /**
     * Constructs a new <code>PACalculationParameters</code>.
     * @alias module:model/PACalculationParameters
     * @param componentid {String} The PA Engine component identifier to analyze.
     */
    constructor(componentid) { 
        
        PACalculationParameters.initialize(this, componentid);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, componentid) { 
        obj['componentid'] = componentid;
    }

    /**
     * Constructs a <code>PACalculationParameters</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PACalculationParameters} obj Optional instance to populate.
     * @return {module:model/PACalculationParameters} The populated <code>PACalculationParameters</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PACalculationParameters();

            if (data.hasOwnProperty('componentid')) {
                obj['componentid'] = ApiClient.convertToType(data['componentid'], 'String');
            }
            if (data.hasOwnProperty('accounts')) {
                obj['accounts'] = ApiClient.convertToType(data['accounts'], [PAIdentifier]);
            }
            if (data.hasOwnProperty('benchmarks')) {
                obj['benchmarks'] = ApiClient.convertToType(data['benchmarks'], [PAIdentifier]);
            }
            if (data.hasOwnProperty('dates')) {
                obj['dates'] = PADateParameters.constructFromObject(data['dates']);
            }
            if (data.hasOwnProperty('groups')) {
                obj['groups'] = ApiClient.convertToType(data['groups'], [PACalculationGroup]);
            }
            if (data.hasOwnProperty('currencyisocode')) {
                obj['currencyisocode'] = ApiClient.convertToType(data['currencyisocode'], 'String');
            }
            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], [PACalculationColumn]);
            }
            if (data.hasOwnProperty('datasources')) {
                obj['datasources'] = PACalculationDataSources.constructFromObject(data['datasources']);
            }
            if (data.hasOwnProperty('componentdetail')) {
                obj['componentdetail'] = ApiClient.convertToType(data['componentdetail'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The PA Engine component identifier to analyze.
 * @member {String} componentid
 */
PACalculationParameters.prototype['componentid'] = undefined;

/**
 * List of accounts.
 * @member {Array.<module:model/PAIdentifier>} accounts
 */
PACalculationParameters.prototype['accounts'] = undefined;

/**
 * List of benchmarks.
 * @member {Array.<module:model/PAIdentifier>} benchmarks
 */
PACalculationParameters.prototype['benchmarks'] = undefined;

/**
 * @member {module:model/PADateParameters} dates
 */
PACalculationParameters.prototype['dates'] = undefined;

/**
 * List of groupings for the PA calculation. This will take precedence over the groupings saved in the PA document.
 * @member {Array.<module:model/PACalculationGroup>} groups
 */
PACalculationParameters.prototype['groups'] = undefined;

/**
 * Currency ISO code for calculation.
 * @member {String} currencyisocode
 */
PACalculationParameters.prototype['currencyisocode'] = undefined;

/**
 * List of columns for the PA calculation. This will take precedence over the columns saved in the PA document.
 * @member {Array.<module:model/PACalculationColumn>} columns
 */
PACalculationParameters.prototype['columns'] = undefined;

/**
 * @member {module:model/PACalculationDataSources} datasources
 */
PACalculationParameters.prototype['datasources'] = undefined;

/**
 * Component detail type for the PA component. It can be GROUPS or TOTALS or SECURITIES.
 * @member {String} componentdetail
 */
PACalculationParameters.prototype['componentdetail'] = undefined;






export default PACalculationParameters;

