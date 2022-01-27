/**
 * PA Engine API
 * Allow clients to fetch PA Engine Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PADateParameters from './PADateParameters';
import PAIdentifier from './PAIdentifier';

/**
 * The PAComponent model module.
 * @module model/PAComponent
 * @version 0.8.0
 */
class PAComponent {
    /**
     * Constructs a new <code>PAComponent</code>.
     * @alias module:model/PAComponent
     */
    constructor() { 
        
        PAComponent.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PAComponent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PAComponent} obj Optional instance to populate.
     * @return {module:model/PAComponent} The populated <code>PAComponent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PAComponent();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('accounts')) {
                obj['accounts'] = ApiClient.convertToType(data['accounts'], [PAIdentifier]);
            }
            if (data.hasOwnProperty('benchmarks')) {
                obj['benchmarks'] = ApiClient.convertToType(data['benchmarks'], [PAIdentifier]);
            }
            if (data.hasOwnProperty('currencyisocode')) {
                obj['currencyisocode'] = ApiClient.convertToType(data['currencyisocode'], 'String');
            }
            if (data.hasOwnProperty('dates')) {
                obj['dates'] = PADateParameters.constructFromObject(data['dates']);
            }
            if (data.hasOwnProperty('snapshot')) {
                obj['snapshot'] = ApiClient.convertToType(data['snapshot'], 'Boolean');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Component identifier.
 * @member {String} id
 */
PAComponent.prototype['id'] = undefined;

/**
 * List of accounts saved in the PA document.
 * @member {Array.<module:model/PAIdentifier>} accounts
 */
PAComponent.prototype['accounts'] = undefined;

/**
 * List of benchmarks saved in the PA document.
 * @member {Array.<module:model/PAIdentifier>} benchmarks
 */
PAComponent.prototype['benchmarks'] = undefined;

/**
 * @member {String} currencyisocode
 */
PAComponent.prototype['currencyisocode'] = undefined;

/**
 * @member {module:model/PADateParameters} dates
 */
PAComponent.prototype['dates'] = undefined;

/**
 * Is the component type snapshot or subperiod.
 * @member {Boolean} snapshot
 */
PAComponent.prototype['snapshot'] = undefined;

/**
 * Component name.
 * @member {String} name
 */
PAComponent.prototype['name'] = undefined;

/**
 * Component category.
 * @member {String} category
 */
PAComponent.prototype['category'] = undefined;






export default PAComponent;

