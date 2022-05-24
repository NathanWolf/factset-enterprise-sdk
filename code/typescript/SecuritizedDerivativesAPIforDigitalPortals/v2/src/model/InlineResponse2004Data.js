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
import InlineResponse2004Accumulated from './InlineResponse2004Accumulated';
import InlineResponse2004Categorization from './InlineResponse2004Categorization';
import InlineResponse2004Exercise from './InlineResponse2004Exercise';
import InlineResponse2004Fsym from './InlineResponse2004Fsym';
import InlineResponse2004Instrument from './InlineResponse2004Instrument';
import InlineResponse2004Issuer from './InlineResponse2004Issuer';
import InlineResponse2004LifeCycle from './InlineResponse2004LifeCycle';
import InlineResponse2004Market from './InlineResponse2004Market';
import InlineResponse2004Trade from './InlineResponse2004Trade';
import InlineResponse2004Underlying from './InlineResponse2004Underlying';
import InlineResponse2004ValueUnit from './InlineResponse2004ValueUnit';

/**
 * The InlineResponse2004Data model module.
 * @module model/InlineResponse2004Data
 * @version 0.10.0
 */
class InlineResponse2004Data {
    /**
     * Constructs a new <code>InlineResponse2004Data</code>.
     * @alias module:model/InlineResponse2004Data
     */
    constructor() { 
        
        InlineResponse2004Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2004Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2004Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse2004Data} The populated <code>InlineResponse2004Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2004Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = InlineResponse2004Fsym.constructFromObject(data['fsym']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = InlineResponse2004Market.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = InlineResponse2004ValueUnit.constructFromObject(data['valueUnit']);
            }
            if (data.hasOwnProperty('trade')) {
                obj['trade'] = InlineResponse2004Trade.constructFromObject(data['trade']);
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('accumulated')) {
                obj['accumulated'] = InlineResponse2004Accumulated.constructFromObject(data['accumulated']);
            }
            if (data.hasOwnProperty('instrument')) {
                obj['instrument'] = InlineResponse2004Instrument.constructFromObject(data['instrument']);
            }
            if (data.hasOwnProperty('categorization')) {
                obj['categorization'] = InlineResponse2004Categorization.constructFromObject(data['categorization']);
            }
            if (data.hasOwnProperty('lifeCycle')) {
                obj['lifeCycle'] = InlineResponse2004LifeCycle.constructFromObject(data['lifeCycle']);
            }
            if (data.hasOwnProperty('issuer')) {
                obj['issuer'] = InlineResponse2004Issuer.constructFromObject(data['issuer']);
            }
            if (data.hasOwnProperty('exercise')) {
                obj['exercise'] = InlineResponse2004Exercise.constructFromObject(data['exercise']);
            }
            if (data.hasOwnProperty('participation')) {
                obj['participation'] = ApiClient.convertToType(data['participation'], 'String');
            }
            if (data.hasOwnProperty('underlying')) {
                obj['underlying'] = InlineResponse2004Underlying.constructFromObject(data['underlying']);
            }
            if (data.hasOwnProperty('knockedOut')) {
                obj['knockedOut'] = ApiClient.convertToType(data['knockedOut'], 'Boolean');
            }
            if (data.hasOwnProperty('knockedIn')) {
                obj['knockedIn'] = ApiClient.convertToType(data['knockedIn'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * Identifier of a notation.
 * @member {String} id
 */
InlineResponse2004Data.prototype['id'] = undefined;

/**
 * The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.
 * @member {String} symbol
 */
InlineResponse2004Data.prototype['symbol'] = undefined;

/**
 * @member {module:model/InlineResponse2004Fsym} fsym
 */
InlineResponse2004Data.prototype['fsym'] = undefined;

/**
 * @member {module:model/InlineResponse2004Market} market
 */
InlineResponse2004Data.prototype['market'] = undefined;

/**
 * @member {module:model/InlineResponse2004ValueUnit} valueUnit
 */
InlineResponse2004Data.prototype['valueUnit'] = undefined;

/**
 * @member {module:model/InlineResponse2004Trade} trade
 */
InlineResponse2004Data.prototype['trade'] = undefined;

/**
 * Quality of the trade-related attributes, see attributes `trade` and `accumulated`.
 * @member {module:model/InlineResponse2004Data.QualityEnum} quality
 */
InlineResponse2004Data.prototype['quality'] = undefined;

/**
 * @member {module:model/InlineResponse2004Accumulated} accumulated
 */
InlineResponse2004Data.prototype['accumulated'] = undefined;

/**
 * @member {module:model/InlineResponse2004Instrument} instrument
 */
InlineResponse2004Data.prototype['instrument'] = undefined;

/**
 * @member {module:model/InlineResponse2004Categorization} categorization
 */
InlineResponse2004Data.prototype['categorization'] = undefined;

/**
 * @member {module:model/InlineResponse2004LifeCycle} lifeCycle
 */
InlineResponse2004Data.prototype['lifeCycle'] = undefined;

/**
 * @member {module:model/InlineResponse2004Issuer} issuer
 */
InlineResponse2004Data.prototype['issuer'] = undefined;

/**
 * @member {module:model/InlineResponse2004Exercise} exercise
 */
InlineResponse2004Data.prototype['exercise'] = undefined;

/**
 * Participation direction of a factor certificate at the level movement of its effective underlying.
 * @member {module:model/InlineResponse2004Data.ParticipationEnum} participation
 */
InlineResponse2004Data.prototype['participation'] = undefined;

/**
 * @member {module:model/InlineResponse2004Underlying} underlying
 */
InlineResponse2004Data.prototype['underlying'] = undefined;

/**
 * Indicates whether the securitized derivative is knocked-out (`true`) or not (`false`). Particularly relevant for knock-out certificates.
 * @member {Boolean} knockedOut
 */
InlineResponse2004Data.prototype['knockedOut'] = undefined;

/**
 * Indicates whether the securitized derivative is knocked-in (`true`) or not (`false`). Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates.
 * @member {Boolean} knockedIn
 */
InlineResponse2004Data.prototype['knockedIn'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2004Data['QualityEnum'] = {

    /**
     * value: "RLT"
     * @const
     */
    "RLT": "RLT",

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY"
};


/**
 * Allowed values for the <code>participation</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse2004Data['ParticipationEnum'] = {

    /**
     * value: "long"
     * @const
     */
    "long": "long",

    /**
     * value: "short"
     * @const
     */
    "short": "short"
};



export default InlineResponse2004Data;

