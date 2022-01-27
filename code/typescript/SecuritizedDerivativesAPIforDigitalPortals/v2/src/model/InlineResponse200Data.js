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
import InlineResponse200DataCountrySecurityRegistration from './InlineResponse200DataCountrySecurityRegistration';
import InlineResponse200DataExercise from './InlineResponse200DataExercise';
import InlineResponse200DataIssue from './InlineResponse200DataIssue';
import InlineResponse200DataIssuer from './InlineResponse200DataIssuer';
import InlineResponse200DataLifeCycle from './InlineResponse200DataLifeCycle';
import InlineResponse200DataNominal from './InlineResponse200DataNominal';
import InlineResponse200DataNsin from './InlineResponse200DataNsin';
import InlineResponse200DataOrderVolume from './InlineResponse200DataOrderVolume';
import InlineResponse200DataReferenceDebtor from './InlineResponse200DataReferenceDebtor';
import InlineResponse200DataType from './InlineResponse200DataType';

/**
 * The InlineResponse200Data model module.
 * @module model/InlineResponse200Data
 * @version 0.9.0
 */
class InlineResponse200Data {
    /**
     * Constructs a new <code>InlineResponse200Data</code>.
     * Instrument data of the securitized derivative.
     * @alias module:model/InlineResponse200Data
     */
    constructor() { 
        
        InlineResponse200Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse200Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse200Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse200Data} The populated <code>InlineResponse200Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse200Data();

            if (data.hasOwnProperty('isin')) {
                obj['isin'] = ApiClient.convertToType(data['isin'], 'String');
            }
            if (data.hasOwnProperty('nsin')) {
                obj['nsin'] = InlineResponse200DataNsin.constructFromObject(data['nsin']);
            }
            if (data.hasOwnProperty('isPrivatePlacement')) {
                obj['isPrivatePlacement'] = ApiClient.convertToType(data['isPrivatePlacement'], 'Boolean');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('shortName')) {
                obj['shortName'] = ApiClient.convertToType(data['shortName'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], [InlineResponse200DataType]);
            }
            if (data.hasOwnProperty('isIncomplete')) {
                obj['isIncomplete'] = ApiClient.convertToType(data['isIncomplete'], 'Boolean');
            }
            if (data.hasOwnProperty('lifeCycle')) {
                obj['lifeCycle'] = InlineResponse200DataLifeCycle.constructFromObject(data['lifeCycle']);
            }
            if (data.hasOwnProperty('countrySecurityRegistration')) {
                obj['countrySecurityRegistration'] = ApiClient.convertToType(data['countrySecurityRegistration'], [InlineResponse200DataCountrySecurityRegistration]);
            }
            if (data.hasOwnProperty('referenceDebtor')) {
                obj['referenceDebtor'] = InlineResponse200DataReferenceDebtor.constructFromObject(data['referenceDebtor']);
            }
            if (data.hasOwnProperty('isCollateralized')) {
                obj['isCollateralized'] = ApiClient.convertToType(data['isCollateralized'], 'Boolean');
            }
            if (data.hasOwnProperty('isQuanto')) {
                obj['isQuanto'] = ApiClient.convertToType(data['isQuanto'], 'Boolean');
            }
            if (data.hasOwnProperty('capitalProtection')) {
                obj['capitalProtection'] = ApiClient.convertToType(data['capitalProtection'], 'Number');
            }
            if (data.hasOwnProperty('hasCatchUp')) {
                obj['hasCatchUp'] = ApiClient.convertToType(data['hasCatchUp'], 'Boolean');
            }
            if (data.hasOwnProperty('hasAutomaticExercise')) {
                obj['hasAutomaticExercise'] = ApiClient.convertToType(data['hasAutomaticExercise'], 'Boolean');
            }
            if (data.hasOwnProperty('orderVolume')) {
                obj['orderVolume'] = InlineResponse200DataOrderVolume.constructFromObject(data['orderVolume']);
            }
            if (data.hasOwnProperty('redemptionAmount')) {
                obj['redemptionAmount'] = ApiClient.convertToType(data['redemptionAmount'], 'Number');
            }
            if (data.hasOwnProperty('nominal')) {
                obj['nominal'] = InlineResponse200DataNominal.constructFromObject(data['nominal']);
            }
            if (data.hasOwnProperty('issuer')) {
                obj['issuer'] = InlineResponse200DataIssuer.constructFromObject(data['issuer']);
            }
            if (data.hasOwnProperty('issue')) {
                obj['issue'] = InlineResponse200DataIssue.constructFromObject(data['issue']);
            }
            if (data.hasOwnProperty('exercise')) {
                obj['exercise'] = InlineResponse200DataExercise.constructFromObject(data['exercise']);
            }
            if (data.hasOwnProperty('settlement')) {
                obj['settlement'] = ApiClient.convertToType(data['settlement'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument.
 * @member {String} isin
 */
InlineResponse200Data.prototype['isin'] = undefined;

/**
 * @member {module:model/InlineResponse200DataNsin} nsin
 */
InlineResponse200Data.prototype['nsin'] = undefined;

/**
 * If true, the instrument is part of a private placement and therefore not publicly traded.
 * @member {Boolean} isPrivatePlacement
 */
InlineResponse200Data.prototype['isPrivatePlacement'] = undefined;

/**
 * Name of the instrument.
 * @member {String} name
 */
InlineResponse200Data.prototype['name'] = undefined;

/**
 * Short name of the instrument.
 * @member {String} shortName
 */
InlineResponse200Data.prototype['shortName'] = undefined;

/**
 * Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). Please refer to endpoint `/category/get` for possible values.
 * @member {Array.<module:model/InlineResponse200DataType>} type
 */
InlineResponse200Data.prototype['type'] = undefined;

/**
 * If true, the data supplier has marked the data for this instrument as incomplete.
 * @member {Boolean} isIncomplete
 */
InlineResponse200Data.prototype['isIncomplete'] = undefined;

/**
 * @member {module:model/InlineResponse200DataLifeCycle} lifeCycle
 */
InlineResponse200Data.prototype['lifeCycle'] = undefined;

/**
 * List of countries where the instrument is registered. See endpoint `/basic/region/country/list` for possible values.
 * @member {Array.<module:model/InlineResponse200DataCountrySecurityRegistration>} countrySecurityRegistration
 */
InlineResponse200Data.prototype['countrySecurityRegistration'] = undefined;

/**
 * @member {module:model/InlineResponse200DataReferenceDebtor} referenceDebtor
 */
InlineResponse200Data.prototype['referenceDebtor'] = undefined;

/**
 * If true, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange).
 * @member {Boolean} isCollateralized
 */
InlineResponse200Data.prototype['isCollateralized'] = undefined;

/**
 * If true, the risk of exchange rate fluctuations between the value unit of the underlying (all of them, in case of multiple underlyings) and the value unit of the redemption is hedged.
 * @member {Boolean} isQuanto
 */
InlineResponse200Data.prototype['isQuanto'] = undefined;

/**
 * Proportion of the nominal amount protected against loss, usually 100%.
 * @member {Number} capitalProtection
 */
InlineResponse200Data.prototype['capitalProtection'] = undefined;

/**
 * If true, the instrument has a so-called \"memory feature\" (also called \"catch up\"). This means that a conditional payment that has not been paid out could be paid on a subsequent payment date if the condition is then satisfied.
 * @member {Boolean} hasCatchUp
 */
InlineResponse200Data.prototype['hasCatchUp'] = undefined;

/**
 * If true, the instrument will be automatically exercised at termination (such as maturity, premature call, or premature payout). It prevents such products from becoming worthless, meaning the investor does not have to undertake any steps in order to receive the payable amount.
 * @member {Boolean} hasAutomaticExercise
 */
InlineResponse200Data.prototype['hasAutomaticExercise'] = undefined;

/**
 * @member {module:model/InlineResponse200DataOrderVolume} orderVolume
 */
InlineResponse200Data.prototype['orderVolume'] = undefined;

/**
 * Actual redemption amount after expiry (e.g. knock out, maturity etc) for securitized derivatives with a so-called knock-out feature. The currency of the redemption amount is given by `issue.valueUnit` and is always a main currency for securitized derivatives with that feature. 
 * @member {Number} redemptionAmount
 */
InlineResponse200Data.prototype['redemptionAmount'] = undefined;

/**
 * @member {module:model/InlineResponse200DataNominal} nominal
 */
InlineResponse200Data.prototype['nominal'] = undefined;

/**
 * @member {module:model/InlineResponse200DataIssuer} issuer
 */
InlineResponse200Data.prototype['issuer'] = undefined;

/**
 * @member {module:model/InlineResponse200DataIssue} issue
 */
InlineResponse200Data.prototype['issue'] = undefined;

/**
 * @member {module:model/InlineResponse200DataExercise} exercise
 */
InlineResponse200Data.prototype['exercise'] = undefined;

/**
 * Settlement is the fulfillment of the issuer's contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out.
 * @member {module:model/InlineResponse200Data.SettlementEnum} settlement
 */
InlineResponse200Data.prototype['settlement'] = undefined;





/**
 * Allowed values for the <code>settlement</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse200Data['SettlementEnum'] = {

    /**
     * value: "cash"
     * @const
     */
    "cash": "cash",

    /**
     * value: "physical"
     * @const
     */
    "physical": "physical",

    /**
     * value: "either"
     * @const
     */
    "either": "either"
};



export default InlineResponse200Data;

