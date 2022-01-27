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
import SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument from './SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument';
import SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation from './SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation';

/**
 * The SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying model module.
 * @module model/SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying
 * @version 0.9.0
 */
class SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying {
    /**
     * Constructs a new <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying</code>.
     * Underlying selection. A list of underlyings can be selected by either using their instrument identifiers, see parameter &#x60;underlying.instrument.ids&#x60; or by using their notation identifiers, see parameter &#x60;underlying.notation.ids&#x60; but not both at the same time. Only one of the provided identifiers needs to be matched in order for a securitized derivative to be returned in the result.   The list of underlyings is particularly useful to search for securitized derivatives that have very similar but not exactly the same underlyings such as futures with different maturities on a given commodity, e.g. brent crude oil. For such a list of underlyings, a barrier restriction in absolute terms, see for example parameter &#x60;singleBarriers.level.absolute&#x60; or &#x60;rangeBarriers.upper.level.absolute&#x60;, will provide a meaningful result, whereas for a list of non-similar underlyings, such as different stocks, a barrier restriction in absolute terms will not provide a meaningful result. This is due to the fact that futures on the same commodity are comparable in regards to their prices while two different stocks are not comparable.   Parameters in relative terms, see for example parameter &#x60;singleBarriers.distance.relative&#x60;, are generally comparable and will provide meaningful result for a list of similar as well as for a list of non-similar underlyings.   For the selection of the effective underling of factor certificates, use &#x60;factorCertificates.effectiveUnderlying.instrument.ids&#x60;.
     * @alias module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying
     */
    constructor() { 
        
        SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying} obj Optional instance to populate.
     * @return {module:model/SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying} The populated <code>SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying();

            if (data.hasOwnProperty('instrument')) {
                obj['instrument'] = SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument.constructFromObject(data['instrument']);
            }
            if (data.hasOwnProperty('notation')) {
                obj['notation'] = SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation.constructFromObject(data['notation']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument} instrument
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying.prototype['instrument'] = undefined;

/**
 * @member {module:model/SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation} notation
 */
SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying.prototype['notation'] = undefined;






export default SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying;

