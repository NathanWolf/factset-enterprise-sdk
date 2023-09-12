/**
 * Quant API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.11.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The QuantUniversalScreenUniverseObsolete model module.
 * @module model/QuantUniversalScreenUniverseObsolete
 */
class QuantUniversalScreenUniverseObsolete {
    /**
     * Constructs a new <code>QuantUniversalScreenUniverseObsolete</code>.
     * @alias module:model/QuantUniversalScreenUniverseObsolete
     * @param screen {String} 
     */
    constructor(screen) { 
        
        QuantUniversalScreenUniverseObsolete.initialize(this, screen);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, screen) { 
        obj['screen'] = screen;
    }

    /**
     * Constructs a <code>QuantUniversalScreenUniverseObsolete</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/QuantUniversalScreenUniverseObsolete} obj Optional instance to populate.
     * @return {module:model/QuantUniversalScreenUniverseObsolete} The populated <code>QuantUniversalScreenUniverseObsolete</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QuantUniversalScreenUniverseObsolete();

            if (data.hasOwnProperty('screen')) {
                obj['screen'] = ApiClient.convertToType(data['screen'], 'String');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} screen
 */
QuantUniversalScreenUniverseObsolete.prototype['screen'] = undefined;

/**
 * @member {module:model/QuantUniversalScreenUniverseObsolete.SourceEnum} source
 */
QuantUniversalScreenUniverseObsolete.prototype['source'] = undefined;





/**
 * Allowed values for the <code>source</code> property.
 * @enum {String}
 * @readonly
 */
QuantUniversalScreenUniverseObsolete['SourceEnum'] = {

    /**
     * value: "ScreeningExpressionUniverse"
     * @const
     */
    "ScreeningExpressionUniverse": "ScreeningExpressionUniverse",

    /**
     * value: "UniversalScreenUniverse"
     * @const
     */
    "UniversalScreenUniverse": "UniversalScreenUniverse",

    /**
     * value: "IdentifierUniverse"
     * @const
     */
    "IdentifierUniverse": "IdentifierUniverse"
};



export default QuantUniversalScreenUniverseObsolete;

