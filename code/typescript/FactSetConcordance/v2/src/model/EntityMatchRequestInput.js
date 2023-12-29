/**
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p>   
 *
 * The version of the OpenAPI document: 2.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The EntityMatchRequestInput model module.
 * @module model/EntityMatchRequestInput
 */
class EntityMatchRequestInput {
    /**
     * Constructs a new <code>EntityMatchRequestInput</code>.
     * @alias module:model/EntityMatchRequestInput
     * @param name {String} The Name of the entity to match.
     */
    constructor(name) { 
        
        EntityMatchRequestInput.initialize(this, name);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name) { 
        obj['name'] = name;
    }

    /**
     * Constructs a <code>EntityMatchRequestInput</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EntityMatchRequestInput} obj Optional instance to populate.
     * @return {module:model/EntityMatchRequestInput} The populated <code>EntityMatchRequestInput</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntityMatchRequestInput();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('clientId')) {
                obj['clientId'] = ApiClient.convertToType(data['clientId'], 'String');
            }
            if (data.hasOwnProperty('country')) {
                obj['country'] = ApiClient.convertToType(data['country'], 'String');
            }
            if (data.hasOwnProperty('state')) {
                obj['state'] = ApiClient.convertToType(data['state'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('priority')) {
                obj['priority'] = ApiClient.convertToType(data['priority'], 'String');
            }
            if (data.hasOwnProperty('bbgFigi')) {
                obj['bbgFigi'] = ApiClient.convertToType(data['bbgFigi'], 'String');
            }
            if (data.hasOwnProperty('bbgTicker')) {
                obj['bbgTicker'] = ApiClient.convertToType(data['bbgTicker'], 'String');
            }
            if (data.hasOwnProperty('bic')) {
                obj['bic'] = ApiClient.convertToType(data['bic'], 'String');
            }
            if (data.hasOwnProperty('cik')) {
                obj['cik'] = ApiClient.convertToType(data['cik'], 'String');
            }
            if (data.hasOwnProperty('crd')) {
                obj['crd'] = ApiClient.convertToType(data['crd'], 'String');
            }
            if (data.hasOwnProperty('cusip')) {
                obj['cusip'] = ApiClient.convertToType(data['cusip'], 'String');
            }
            if (data.hasOwnProperty('duns')) {
                obj['duns'] = ApiClient.convertToType(data['duns'], 'String');
            }
            if (data.hasOwnProperty('ein')) {
                obj['ein'] = ApiClient.convertToType(data['ein'], 'String');
            }
            if (data.hasOwnProperty('factsetId')) {
                obj['factsetId'] = ApiClient.convertToType(data['factsetId'], 'String');
            }
            if (data.hasOwnProperty('fitch')) {
                obj['fitch'] = ApiClient.convertToType(data['fitch'], 'String');
            }
            if (data.hasOwnProperty('gvkey')) {
                obj['gvkey'] = ApiClient.convertToType(data['gvkey'], 'String');
            }
            if (data.hasOwnProperty('gvkeyIid')) {
                obj['gvkeyIid'] = ApiClient.convertToType(data['gvkeyIid'], 'String');
            }
            if (data.hasOwnProperty('isin')) {
                obj['isin'] = ApiClient.convertToType(data['isin'], 'String');
            }
            if (data.hasOwnProperty('jcn')) {
                obj['jcn'] = ApiClient.convertToType(data['jcn'], 'String');
            }
            if (data.hasOwnProperty('lei')) {
                obj['lei'] = ApiClient.convertToType(data['lei'], 'String');
            }
            if (data.hasOwnProperty('lxid')) {
                obj['lxid'] = ApiClient.convertToType(data['lxid'], 'String');
            }
            if (data.hasOwnProperty('md')) {
                obj['md'] = ApiClient.convertToType(data['md'], 'String');
            }
            if (data.hasOwnProperty('redCode')) {
                obj['redCode'] = ApiClient.convertToType(data['redCode'], 'String');
            }
            if (data.hasOwnProperty('rssd')) {
                obj['rssd'] = ApiClient.convertToType(data['rssd'], 'String');
            }
            if (data.hasOwnProperty('sedol')) {
                obj['sedol'] = ApiClient.convertToType(data['sedol'], 'String');
            }
            if (data.hasOwnProperty('spr')) {
                obj['spr'] = ApiClient.convertToType(data['spr'], 'String');
            }
            if (data.hasOwnProperty('ticker')) {
                obj['ticker'] = ApiClient.convertToType(data['ticker'], 'String');
            }
            if (data.hasOwnProperty('tickerExchange')) {
                obj['tickerExchange'] = ApiClient.convertToType(data['tickerExchange'], 'String');
            }
            if (data.hasOwnProperty('tickerRegion')) {
                obj['tickerRegion'] = ApiClient.convertToType(data['tickerRegion'], 'String');
            }
            if (data.hasOwnProperty('ukch')) {
                obj['ukch'] = ApiClient.convertToType(data['ukch'], 'String');
            }
            if (data.hasOwnProperty('valoren')) {
                obj['valoren'] = ApiClient.convertToType(data['valoren'], 'String');
            }
            if (data.hasOwnProperty('wkn')) {
                obj['wkn'] = ApiClient.convertToType(data['wkn'], 'String');
            }
            if (data.hasOwnProperty('additionalContext')) {
                obj['additionalContext'] = ApiClient.convertToType(data['additionalContext'], {'String': 'String'});
            }
        }
        return obj;
    }


}

/**
 * The Name of the entity to match.
 * @member {String} name
 */
EntityMatchRequestInput.prototype['name'] = undefined;

/**
 * A unique identifier supplied by the user. ClientId is saved to the user's Concordance universe and will be used as the identifier for that entity within the universe. 
 * @member {String} clientId
 */
EntityMatchRequestInput.prototype['clientId'] = undefined;

/**
 * ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). 
 * @member {String} country
 */
EntityMatchRequestInput.prototype['country'] = undefined;

/**
 * Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.Two character state or province code to filter on. 
 * @member {String} state
 */
EntityMatchRequestInput.prototype['state'] = undefined;

/**
 * URL corresponding to the entity name that is used when evaluating candidates for a match. 
 * @member {String} url
 */
EntityMatchRequestInput.prototype['url'] = undefined;

/**
 * Priority associated to the id.
 * @member {module:model/EntityMatchRequestInput.PriorityEnum} priority
 */
EntityMatchRequestInput.prototype['priority'] = undefined;

/**
 * Name for the type Bloomberg Listing/Regional/Security ID.
 * @member {String} bbgFigi
 */
EntityMatchRequestInput.prototype['bbgFigi'] = undefined;

/**
 * Name for the type Bloomberg Listing and Regional Ticker.
 * @member {String} bbgTicker
 */
EntityMatchRequestInput.prototype['bbgTicker'] = undefined;

/**
 * Name for type BICCode, bank indentification code
 * @member {String} bic
 */
EntityMatchRequestInput.prototype['bic'] = undefined;

/**
 * Name for the type CIK, Edgar Central Index Keys
 * @member {String} cik
 */
EntityMatchRequestInput.prototype['cik'] = undefined;

/**
 * Name for the type CRD, Central Registration Depository
 * @member {String} crd
 */
EntityMatchRequestInput.prototype['crd'] = undefined;

/**
 * Name for the type CUSIP.
 * @member {String} cusip
 */
EntityMatchRequestInput.prototype['cusip'] = undefined;

/**
 * Name for the type DUNS, Dun&Bradstreet.
 * @member {String} duns
 */
EntityMatchRequestInput.prototype['duns'] = undefined;

/**
 * Name for the type EmployerIdentificationNumber, EIN.
 * @member {String} ein
 */
EntityMatchRequestInput.prototype['ein'] = undefined;

/**
 * Name for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier.
 * @member {String} factsetId
 */
EntityMatchRequestInput.prototype['factsetId'] = undefined;

/**
 * Name for the type FitchCreditRating, Fitch Ratings Identifier.
 * @member {String} fitch
 */
EntityMatchRequestInput.prototype['fitch'] = undefined;

/**
 * Name for the type GVKEY, Compustat Global Company Key.
 * @member {String} gvkey
 */
EntityMatchRequestInput.prototype['gvkey'] = undefined;

/**
 * Name for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier.
 * @member {String} gvkeyIid
 */
EntityMatchRequestInput.prototype['gvkeyIid'] = undefined;

/**
 * Name for the type ISIN.
 * @member {String} isin
 */
EntityMatchRequestInput.prototype['isin'] = undefined;

/**
 * Name for the type JCN , Japanese Corporate Number.
 * @member {String} jcn
 */
EntityMatchRequestInput.prototype['jcn'] = undefined;

/**
 * Name for the type LegalEntityIdentifier, LEI.
 * @member {String} lei
 */
EntityMatchRequestInput.prototype['lei'] = undefined;

/**
 * Name for the type LXID, Markit Syndicated Loan Identifier.
 * @member {String} lxid
 */
EntityMatchRequestInput.prototype['lxid'] = undefined;

/**
 * Name for the type MoodysIssuer, Moody's Ratings Identifier.
 * @member {String} md
 */
EntityMatchRequestInput.prototype['md'] = undefined;

/**
 * Name for the type RedCode, Markit Reference Entity Identifier.
 * @member {String} redCode
 */
EntityMatchRequestInput.prototype['redCode'] = undefined;

/**
 * Name for the type FederalReserveRSSDIdentifier, RSSD.
 * @member {String} rssd
 */
EntityMatchRequestInput.prototype['rssd'] = undefined;

/**
 * Name for the type SEDOL.
 * @member {String} sedol
 */
EntityMatchRequestInput.prototype['sedol'] = undefined;

/**
 * Name for the type S&PRating, S&P Ratings Identifier.
 * @member {String} spr
 */
EntityMatchRequestInput.prototype['spr'] = undefined;

/**
 * Name for the type PriceTicker.
 * @member {String} ticker
 */
EntityMatchRequestInput.prototype['ticker'] = undefined;

/**
 * Name for the type TickerExch.
 * @member {String} tickerExchange
 */
EntityMatchRequestInput.prototype['tickerExchange'] = undefined;

/**
 * Name for the type TickerRegion
 * @member {String} tickerRegion
 */
EntityMatchRequestInput.prototype['tickerRegion'] = undefined;

/**
 * Name for the type UKCompanyHouse
 * @member {String} ukch
 */
EntityMatchRequestInput.prototype['ukch'] = undefined;

/**
 * Name for the type VALOR, Valoren (\"Valor\") Identification.
 * @member {String} valoren
 */
EntityMatchRequestInput.prototype['valoren'] = undefined;

/**
 * Name for the type WKN, German Securities Identification.
 * @member {String} wkn
 */
EntityMatchRequestInput.prototype['wkn'] = undefined;

/**
 * Any additional context information along with other input values that need to be saved for an entity during search.  To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified. 
 * @member {Object.<String, String>} additionalContext
 */
EntityMatchRequestInput.prototype['additionalContext'] = undefined;





/**
 * Allowed values for the <code>priority</code> property.
 * @enum {String}
 * @readonly
 */
EntityMatchRequestInput['PriorityEnum'] = {

    /**
     * value: "CRITICAL"
     * @const
     */
    "CRITICAL": "CRITICAL",

    /**
     * value: "HIGH"
     * @const
     */
    "HIGH": "HIGH",

    /**
     * value: "MEDIUM"
     * @const
     */
    "MEDIUM": "MEDIUM",

    /**
     * value: "LOW"
     * @const
     */
    "LOW": "LOW"
};



export default EntityMatchRequestInput;

