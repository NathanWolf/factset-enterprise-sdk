/**
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CreateOrEditViewTickers model module.
 * @module model/CreateOrEditViewTickers
 */
class CreateOrEditViewTickers {
    /**
     * Constructs a new <code>CreateOrEditViewTickers</code>.
     * @alias module:model/CreateOrEditViewTickers
     */
    constructor() { 
        
        CreateOrEditViewTickers.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreateOrEditViewTickers</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateOrEditViewTickers} obj Optional instance to populate.
     * @return {module:model/CreateOrEditViewTickers} The populated <code>CreateOrEditViewTickers</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateOrEditViewTickers();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
CreateOrEditViewTickers.prototype['name'] = undefined;

/**
 * @member {String} value
 */
CreateOrEditViewTickers.prototype['value'] = undefined;

/**
 * @member {module:model/CreateOrEditViewTickers.TypeEnum} type
 */
CreateOrEditViewTickers.prototype['type'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
CreateOrEditViewTickers['TypeEnum'] = {

    /**
     * value: "Index"
     * @const
     */
    "Index": "Index",

    /**
     * value: "ETF"
     * @const
     */
    "ETF": "ETF",

    /**
     * value: "Holder"
     * @const
     */
    "Holder": "Holder",

    /**
     * value: "Mutual_Fund"
     * @const
     */
    "Mutual_Fund": "Mutual_Fund",

    /**
     * value: "Portfolios"
     * @const
     */
    "Portfolios": "Portfolios"
};



export default CreateOrEditViewTickers;

