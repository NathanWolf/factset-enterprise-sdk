/**
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p> 
 *
 * The version of the OpenAPI document: 2.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The EntityMapping model module.
 * @module model/EntityMapping
 */
class EntityMapping {
    /**
     * Constructs a new <code>EntityMapping</code>.
     * Concordance Company Entity Mapping object. Shows the mapping detail related to user&#39;s universe. 
     * @alias module:model/EntityMapping
     */
    constructor() { 
        
        EntityMapping.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EntityMapping</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EntityMapping} obj Optional instance to populate.
     * @return {module:model/EntityMapping} The populated <code>EntityMapping</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntityMapping();

            if (data.hasOwnProperty('entityId')) {
                obj['entityId'] = ApiClient.convertToType(data['entityId'], 'String');
            }
            if (data.hasOwnProperty('entityName')) {
                obj['entityName'] = ApiClient.convertToType(data['entityName'], 'String');
            }
            if (data.hasOwnProperty('clientId')) {
                obj['clientId'] = ApiClient.convertToType(data['clientId'], 'String');
            }
            if (data.hasOwnProperty('clientName')) {
                obj['clientName'] = ApiClient.convertToType(data['clientName'], 'String');
            }
            if (data.hasOwnProperty('clientCountry')) {
                obj['clientCountry'] = ApiClient.convertToType(data['clientCountry'], 'String');
            }
            if (data.hasOwnProperty('clientState')) {
                obj['clientState'] = ApiClient.convertToType(data['clientState'], 'String');
            }
            if (data.hasOwnProperty('clientPriority')) {
                obj['clientPriority'] = ApiClient.convertToType(data['clientPriority'], 'String');
            }
            if (data.hasOwnProperty('clientBbgFigi')) {
                obj['clientBbgFigi'] = ApiClient.convertToType(data['clientBbgFigi'], 'String');
            }
            if (data.hasOwnProperty('clientBbgTicker')) {
                obj['clientBbgTicker'] = ApiClient.convertToType(data['clientBbgTicker'], 'String');
            }
            if (data.hasOwnProperty('clientBic')) {
                obj['clientBic'] = ApiClient.convertToType(data['clientBic'], 'String');
            }
            if (data.hasOwnProperty('clientCik')) {
                obj['clientCik'] = ApiClient.convertToType(data['clientCik'], 'String');
            }
            if (data.hasOwnProperty('clientCrd')) {
                obj['clientCrd'] = ApiClient.convertToType(data['clientCrd'], 'String');
            }
            if (data.hasOwnProperty('clientCusip')) {
                obj['clientCusip'] = ApiClient.convertToType(data['clientCusip'], 'String');
            }
            if (data.hasOwnProperty('clientDuns')) {
                obj['clientDuns'] = ApiClient.convertToType(data['clientDuns'], 'String');
            }
            if (data.hasOwnProperty('clientEin')) {
                obj['clientEin'] = ApiClient.convertToType(data['clientEin'], 'String');
            }
            if (data.hasOwnProperty('clientFactsetId')) {
                obj['clientFactsetId'] = ApiClient.convertToType(data['clientFactsetId'], 'String');
            }
            if (data.hasOwnProperty('clientFitch')) {
                obj['clientFitch'] = ApiClient.convertToType(data['clientFitch'], 'String');
            }
            if (data.hasOwnProperty('clientGvkey')) {
                obj['clientGvkey'] = ApiClient.convertToType(data['clientGvkey'], 'String');
            }
            if (data.hasOwnProperty('clientGvkeyIid')) {
                obj['clientGvkeyIid'] = ApiClient.convertToType(data['clientGvkeyIid'], 'String');
            }
            if (data.hasOwnProperty('clientIsin')) {
                obj['clientIsin'] = ApiClient.convertToType(data['clientIsin'], 'String');
            }
            if (data.hasOwnProperty('clientJcn')) {
                obj['clientJcn'] = ApiClient.convertToType(data['clientJcn'], 'String');
            }
            if (data.hasOwnProperty('clientLei')) {
                obj['clientLei'] = ApiClient.convertToType(data['clientLei'], 'String');
            }
            if (data.hasOwnProperty('clientLxid')) {
                obj['clientLxid'] = ApiClient.convertToType(data['clientLxid'], 'String');
            }
            if (data.hasOwnProperty('clientMd')) {
                obj['clientMd'] = ApiClient.convertToType(data['clientMd'], 'String');
            }
            if (data.hasOwnProperty('clientRedCode')) {
                obj['clientRedCode'] = ApiClient.convertToType(data['clientRedCode'], 'String');
            }
            if (data.hasOwnProperty('clientRssd')) {
                obj['clientRssd'] = ApiClient.convertToType(data['clientRssd'], 'String');
            }
            if (data.hasOwnProperty('clientSedol')) {
                obj['clientSedol'] = ApiClient.convertToType(data['clientSedol'], 'String');
            }
            if (data.hasOwnProperty('clientSpr')) {
                obj['clientSpr'] = ApiClient.convertToType(data['clientSpr'], 'String');
            }
            if (data.hasOwnProperty('clientTicker')) {
                obj['clientTicker'] = ApiClient.convertToType(data['clientTicker'], 'String');
            }
            if (data.hasOwnProperty('clientTickerExchange')) {
                obj['clientTickerExchange'] = ApiClient.convertToType(data['clientTickerExchange'], 'String');
            }
            if (data.hasOwnProperty('clientTickerRegion')) {
                obj['clientTickerRegion'] = ApiClient.convertToType(data['clientTickerRegion'], 'String');
            }
            if (data.hasOwnProperty('clientUkch')) {
                obj['clientUkch'] = ApiClient.convertToType(data['clientUkch'], 'String');
            }
            if (data.hasOwnProperty('clientValoren')) {
                obj['clientValoren'] = ApiClient.convertToType(data['clientValoren'], 'String');
            }
            if (data.hasOwnProperty('clientWkn')) {
                obj['clientWkn'] = ApiClient.convertToType(data['clientWkn'], 'String');
            }
            if (data.hasOwnProperty('clientUrl')) {
                obj['clientUrl'] = ApiClient.convertToType(data['clientUrl'], 'String');
            }
            if (data.hasOwnProperty('createdTime')) {
                obj['createdTime'] = ApiClient.convertToType(data['createdTime'], 'Date');
            }
            if (data.hasOwnProperty('updatedTime')) {
                obj['updatedTime'] = ApiClient.convertToType(data['updatedTime'], 'Date');
            }
            if (data.hasOwnProperty('mapStatus')) {
                obj['mapStatus'] = ApiClient.convertToType(data['mapStatus'], 'String');
            }
            if (data.hasOwnProperty('universeId')) {
                obj['universeId'] = ApiClient.convertToType(data['universeId'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * FactSet Entity Identifier of the entity matched to the submitted entity
 * @member {String} entityId
 */
EntityMapping.prototype['entityId'] = undefined;

/**
 * Full name corresponding to the matched entity.
 * @member {String} entityName
 */
EntityMapping.prototype['entityName'] = undefined;

/**
 * User-defined unique identifier provided by the user in the request
 * @member {String} clientId
 */
EntityMapping.prototype['clientId'] = undefined;

/**
 * Name of the entity to match as specified in the request.
 * @member {String} clientName
 */
EntityMapping.prototype['clientName'] = undefined;

/**
 * ISO2 country code specified in the request
 * @member {String} clientCountry
 */
EntityMapping.prototype['clientCountry'] = undefined;

/**
 * State code specified in the request
 * @member {String} clientState
 */
EntityMapping.prototype['clientState'] = undefined;

/**
 * Priority associated to the id.
 * @member {String} clientPriority
 */
EntityMapping.prototype['clientPriority'] = undefined;

/**
 * Name as provided by the user for the type Bloomberg listing/regional/security id.
 * @member {String} clientBbgFigi
 */
EntityMapping.prototype['clientBbgFigi'] = undefined;

/**
 * Name as provided by the user for the type Bloomberg listing and regional ticker.
 * @member {String} clientBbgTicker
 */
EntityMapping.prototype['clientBbgTicker'] = undefined;

/**
 * Name as provided by the user for the type BIC - Bank Indentification Code.
 * @member {String} clientBic
 */
EntityMapping.prototype['clientBic'] = undefined;

/**
 * Name as provided by the user for the type CIK - Edgar Central Index Keys.
 * @member {String} clientCik
 */
EntityMapping.prototype['clientCik'] = undefined;

/**
 * Name as provided by the user for the type CRD - Central Registration Depository.
 * @member {String} clientCrd
 */
EntityMapping.prototype['clientCrd'] = undefined;

/**
 * Name as provided by the user for the type CUSIP.
 * @member {String} clientCusip
 */
EntityMapping.prototype['clientCusip'] = undefined;

/**
 * Name as provided by the user for the type DUNS - Dun & Bradstreet Data Universal Numbering System.
 * @member {String} clientDuns
 */
EntityMapping.prototype['clientDuns'] = undefined;

/**
 * Name as provided by the user for the type EIN - Employer Identification Number.
 * @member {String} clientEin
 */
EntityMapping.prototype['clientEin'] = undefined;

/**
 * Name as provided by the user for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier.
 * @member {String} clientFactsetId
 */
EntityMapping.prototype['clientFactsetId'] = undefined;

/**
 * Name as provided by the user for the type Fitch - Fitch Ratings Identifier.
 * @member {String} clientFitch
 */
EntityMapping.prototype['clientFitch'] = undefined;

/**
 * Name as provided by the user for the type GVKEY, Compustat Global Company Key.
 * @member {String} clientGvkey
 */
EntityMapping.prototype['clientGvkey'] = undefined;

/**
 * Name as provided by the user for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier.
 * @member {String} clientGvkeyIid
 */
EntityMapping.prototype['clientGvkeyIid'] = undefined;

/**
 * Name as provided by the user for the type ISIN - International Securities Identification Number.
 * @member {String} clientIsin
 */
EntityMapping.prototype['clientIsin'] = undefined;

/**
 * Name as provided by the user for the type JCN , Japanese Corporate Number.
 * @member {String} clientJcn
 */
EntityMapping.prototype['clientJcn'] = undefined;

/**
 * Name as provided by the user for the type LEI - Legal Entity Identifier.
 * @member {String} clientLei
 */
EntityMapping.prototype['clientLei'] = undefined;

/**
 * Name as provided by the user for the type LXID, Markit Syndicated Loan Identifier.
 * @member {String} clientLxid
 */
EntityMapping.prototype['clientLxid'] = undefined;

/**
 * Name as provided by the user for the type Moody's ratings identifier.
 * @member {String} clientMd
 */
EntityMapping.prototype['clientMd'] = undefined;

/**
 * Name as provided by the user for the type RedCode, Markit Reference Entity Identifier.
 * @member {String} clientRedCode
 */
EntityMapping.prototype['clientRedCode'] = undefined;

/**
 * Name as provided by the user for the type RSSD - Federal Reserve RSSD Identifier.
 * @member {String} clientRssd
 */
EntityMapping.prototype['clientRssd'] = undefined;

/**
 * Name as provided by the user for the type SEDOL.
 * @member {String} clientSedol
 */
EntityMapping.prototype['clientSedol'] = undefined;

/**
 * Name as provided by the user for the type S&P ratings identifier.
 * @member {String} clientSpr
 */
EntityMapping.prototype['clientSpr'] = undefined;

/**
 * Name as provided by the user for the type price ticker.
 * @member {String} clientTicker
 */
EntityMapping.prototype['clientTicker'] = undefined;

/**
 * Name as provided by the user for the type ticker exchange.
 * @member {String} clientTickerExchange
 */
EntityMapping.prototype['clientTickerExchange'] = undefined;

/**
 * Name as provided by the user for the type ticker region.
 * @member {String} clientTickerRegion
 */
EntityMapping.prototype['clientTickerRegion'] = undefined;

/**
 * Name as provided by the user for the type UK company house identifier.
 * @member {String} clientUkch
 */
EntityMapping.prototype['clientUkch'] = undefined;

/**
 * Name as provided by the user for the type Valoren - Valor Identification.
 * @member {String} clientValoren
 */
EntityMapping.prototype['clientValoren'] = undefined;

/**
 * Name as provided by the user for the type WKN - German Securities Identification.
 * @member {String} clientWkn
 */
EntityMapping.prototype['clientWkn'] = undefined;

/**
 * URL specified in the request
 * @member {String} clientUrl
 */
EntityMapping.prototype['clientUrl'] = undefined;

/**
 * Time when entity was created in UTC.
 * @member {Date} createdTime
 */
EntityMapping.prototype['createdTime'] = undefined;

/**
 * Time when the submitted entity was last updated in UTC.
 * @member {Date} updatedTime
 */
EntityMapping.prototype['updatedTime'] = undefined;

/**
 * Current status of the entity mapping.
 * @member {module:model/EntityMapping.MapStatusEnum} mapStatus
 */
EntityMapping.prototype['mapStatus'] = undefined;

/**
 * The universe this mapping belongs to. Only set in v2 endpoints 
 * @member {Number} universeId
 */
EntityMapping.prototype['universeId'] = undefined;





/**
 * Allowed values for the <code>mapStatus</code> property.
 * @enum {String}
 * @readonly
 */
EntityMapping['MapStatusEnum'] = {

    /**
     * value: "MAPPED"
     * @const
     */
    "MAPPED": "MAPPED",

    /**
     * value: "UNMAPPED"
     * @const
     */
    "UNMAPPED": "UNMAPPED",

    /**
     * value: "INDETERMINATE"
     * @const
     */
    "INDETERMINATE": "INDETERMINATE"
};



export default EntityMapping;

