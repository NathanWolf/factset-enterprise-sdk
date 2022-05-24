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

/**
 * The InlineResponse2006KeyFiguresBonusYield model module.
 * @module model/InlineResponse2006KeyFiguresBonusYield
 * @version 0.10.0
 */
class InlineResponse2006KeyFiguresBonusYield {
    /**
     * Constructs a new <code>InlineResponse2006KeyFiguresBonusYield</code>.
     * Bonus yield. It represents the bonus level adjusted for the cover ratio and currency cross rate minus the ask price of the securitized derivative. The value can become negative (e.g. for uncapped products), which does not mean that the investor will necessarily suffer a loss buying it. This key figure is calculated for bonus certificates with an intact knock-in barrier only, i.e. the attribute &#x60;knockIn.breach.breached&#x60; is false.
     * @alias module:model/InlineResponse2006KeyFiguresBonusYield
     */
    constructor() { 
        
        InlineResponse2006KeyFiguresBonusYield.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006KeyFiguresBonusYield</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006KeyFiguresBonusYield} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006KeyFiguresBonusYield} The populated <code>InlineResponse2006KeyFiguresBonusYield</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006KeyFiguresBonusYield();

            if (data.hasOwnProperty('absolute')) {
                obj['absolute'] = ApiClient.convertToType(data['absolute'], 'Number');
            }
            if (data.hasOwnProperty('relative')) {
                obj['relative'] = ApiClient.convertToType(data['relative'], 'Number');
            }
            if (data.hasOwnProperty('annualized')) {
                obj['annualized'] = ApiClient.convertToType(data['annualized'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Bonus yield in absolute terms.
 * @member {Number} absolute
 */
InlineResponse2006KeyFiguresBonusYield.prototype['absolute'] = undefined;

/**
 * Bonus yield relative to the ask price.
 * @member {Number} relative
 */
InlineResponse2006KeyFiguresBonusYield.prototype['relative'] = undefined;

/**
 * Annualized bonus yield relative to the ask price.
 * @member {Number} annualized
 */
InlineResponse2006KeyFiguresBonusYield.prototype['annualized'] = undefined;






export default InlineResponse2006KeyFiguresBonusYield;

