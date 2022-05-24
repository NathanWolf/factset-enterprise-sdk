/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FISecurity model module.
 * @module model/FISecurity
 * @version 0.8.2
 */
class FISecurity {
    /**
     * Constructs a new <code>FISecurity</code>.
     * @alias module:model/FISecurity
     * @param settlementDate {String} 
     * @param calcFromMethod {String} Calculation from method
     * @param calcFromValue {Number} Calculation from value
     * @param symbol {String} Symbol
     */
    constructor(settlementDate, calcFromMethod, calcFromValue, symbol) { 
        
        FISecurity.initialize(this, settlementDate, calcFromMethod, calcFromValue, symbol);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, settlementDate, calcFromMethod, calcFromValue, symbol) { 
        obj['settlementDate'] = settlementDate;
        obj['calcFromMethod'] = calcFromMethod;
        obj['calcFromValue'] = calcFromValue;
        obj['symbol'] = symbol;
    }

    /**
     * Constructs a <code>FISecurity</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FISecurity} obj Optional instance to populate.
     * @return {module:model/FISecurity} The populated <code>FISecurity</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FISecurity();

            if (data.hasOwnProperty('settlementDate')) {
                obj['settlementDate'] = ApiClient.convertToType(data['settlementDate'], 'String');
            }
            if (data.hasOwnProperty('calcFromMethod')) {
                obj['calcFromMethod'] = ApiClient.convertToType(data['calcFromMethod'], 'String');
            }
            if (data.hasOwnProperty('calcFromValue')) {
                obj['calcFromValue'] = ApiClient.convertToType(data['calcFromValue'], 'Number');
            }
            if (data.hasOwnProperty('face')) {
                obj['face'] = ApiClient.convertToType(data['face'], 'Number');
            }
            if (data.hasOwnProperty('faceType')) {
                obj['faceType'] = ApiClient.convertToType(data['faceType'], 'String');
            }
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('discountCurve')) {
                obj['discountCurve'] = ApiClient.convertToType(data['discountCurve'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} settlementDate
 */
FISecurity.prototype['settlementDate'] = undefined;

/**
 * Calculation from method
 * @member {String} calcFromMethod
 */
FISecurity.prototype['calcFromMethod'] = undefined;

/**
 * Calculation from value
 * @member {Number} calcFromValue
 */
FISecurity.prototype['calcFromValue'] = undefined;

/**
 * Face
 * @member {Number} face
 * @default 1
 */
FISecurity.prototype['face'] = 1;

/**
 * Face type
 * @member {module:model/FISecurity.FaceTypeEnum} faceType
 * @default 'Current'
 */
FISecurity.prototype['faceType'] = 'Current';

/**
 * Symbol
 * @member {String} symbol
 */
FISecurity.prototype['symbol'] = undefined;

/**
 * Discount curve
 * @member {String} discountCurve
 */
FISecurity.prototype['discountCurve'] = undefined;





/**
 * Allowed values for the <code>faceType</code> property.
 * @enum {String}
 * @readonly
 */
FISecurity['FaceTypeEnum'] = {

    /**
     * value: "Current"
     * @const
     */
    "Current": "Current",

    /**
     * value: "Original"
     * @const
     */
    "Original": "Original"
};



export default FISecurity;

