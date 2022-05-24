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
import InlineResponse2003InstrumentLifeCycleMaturity from './InlineResponse2003InstrumentLifeCycleMaturity';

/**
 * The InlineResponse2003InstrumentLifeCycle model module.
 * @module model/InlineResponse2003InstrumentLifeCycle
 * @version 0.10.0
 */
class InlineResponse2003InstrumentLifeCycle {
    /**
     * Constructs a new <code>InlineResponse2003InstrumentLifeCycle</code>.
     * Important dates of the debt instrument.
     * @alias module:model/InlineResponse2003InstrumentLifeCycle
     */
    constructor() { 
        
        InlineResponse2003InstrumentLifeCycle.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003InstrumentLifeCycle</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003InstrumentLifeCycle} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003InstrumentLifeCycle} The populated <code>InlineResponse2003InstrumentLifeCycle</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003InstrumentLifeCycle();

            if (data.hasOwnProperty('issue')) {
                obj['issue'] = ApiClient.convertToType(data['issue'], 'Date');
            }
            if (data.hasOwnProperty('maturity')) {
                obj['maturity'] = InlineResponse2003InstrumentLifeCycleMaturity.constructFromObject(data['maturity']);
            }
            if (data.hasOwnProperty('callable')) {
                obj['callable'] = ApiClient.convertToType(data['callable'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Date of the issue.
 * @member {Date} issue
 */
InlineResponse2003InstrumentLifeCycle.prototype['issue'] = undefined;

/**
 * @member {module:model/InlineResponse2003InstrumentLifeCycleMaturity} maturity
 */
InlineResponse2003InstrumentLifeCycle.prototype['maturity'] = undefined;

/**
 * If `true`, the issuer may redeem the instrument prior to maturity.
 * @member {Boolean} callable
 */
InlineResponse2003InstrumentLifeCycle.prototype['callable'] = undefined;






export default InlineResponse2003InstrumentLifeCycle;

