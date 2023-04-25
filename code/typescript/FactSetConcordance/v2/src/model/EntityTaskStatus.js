/**
 * FactSet Concordance API
 *    The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p> 
 *
 * The version of the OpenAPI document: 2.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The EntityTaskStatus model module.
 * @module model/EntityTaskStatus
 */
class EntityTaskStatus {
    /**
     * Constructs a new <code>EntityTaskStatus</code>.
     * Concordance Entity Task Status object. Shows the settings and status of a taskId and some statistics on the matches. 
     * @alias module:model/EntityTaskStatus
     */
    constructor() { 
        
        EntityTaskStatus.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EntityTaskStatus</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EntityTaskStatus} obj Optional instance to populate.
     * @return {module:model/EntityTaskStatus} The populated <code>EntityTaskStatus</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntityTaskStatus();

            if (data.hasOwnProperty('taskId')) {
                obj['taskId'] = ApiClient.convertToType(data['taskId'], 'Number');
            }
            if (data.hasOwnProperty('taskName')) {
                obj['taskName'] = ApiClient.convertToType(data['taskName'], 'String');
            }
            if (data.hasOwnProperty('taskAction')) {
                obj['taskAction'] = ApiClient.convertToType(data['taskAction'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('inputFile')) {
                obj['inputFile'] = ApiClient.convertToType(data['inputFile'], 'String');
            }
            if (data.hasOwnProperty('clientIdColumn')) {
                obj['clientIdColumn'] = ApiClient.convertToType(data['clientIdColumn'], 'String');
            }
            if (data.hasOwnProperty('priorityColumn')) {
                obj['priorityColumn'] = ApiClient.convertToType(data['priorityColumn'], 'String');
            }
            if (data.hasOwnProperty('bicColumn')) {
                obj['bicColumn'] = ApiClient.convertToType(data['bicColumn'], 'String');
            }
            if (data.hasOwnProperty('bbgTickerColumn')) {
                obj['bbgTickerColumn'] = ApiClient.convertToType(data['bbgTickerColumn'], 'String');
            }
            if (data.hasOwnProperty('cikColumn')) {
                obj['cikColumn'] = ApiClient.convertToType(data['cikColumn'], 'String');
            }
            if (data.hasOwnProperty('crdColumn')) {
                obj['crdColumn'] = ApiClient.convertToType(data['crdColumn'], 'String');
            }
            if (data.hasOwnProperty('cusipColumn')) {
                obj['cusipColumn'] = ApiClient.convertToType(data['cusipColumn'], 'String');
            }
            if (data.hasOwnProperty('dunsColumn')) {
                obj['dunsColumn'] = ApiClient.convertToType(data['dunsColumn'], 'String');
            }
            if (data.hasOwnProperty('einColumn')) {
                obj['einColumn'] = ApiClient.convertToType(data['einColumn'], 'String');
            }
            if (data.hasOwnProperty('rssdColumn')) {
                obj['rssdColumn'] = ApiClient.convertToType(data['rssdColumn'], 'String');
            }
            if (data.hasOwnProperty('fitchColumn')) {
                obj['fitchColumn'] = ApiClient.convertToType(data['fitchColumn'], 'String');
            }
            if (data.hasOwnProperty('isinColumn')) {
                obj['isinColumn'] = ApiClient.convertToType(data['isinColumn'], 'String');
            }
            if (data.hasOwnProperty('leiColumn')) {
                obj['leiColumn'] = ApiClient.convertToType(data['leiColumn'], 'String');
            }
            if (data.hasOwnProperty('bbgFigiColumn')) {
                obj['bbgFigiColumn'] = ApiClient.convertToType(data['bbgFigiColumn'], 'String');
            }
            if (data.hasOwnProperty('mdColumn')) {
                obj['mdColumn'] = ApiClient.convertToType(data['mdColumn'], 'String');
            }
            if (data.hasOwnProperty('tickerColumn')) {
                obj['tickerColumn'] = ApiClient.convertToType(data['tickerColumn'], 'String');
            }
            if (data.hasOwnProperty('sprColumn')) {
                obj['sprColumn'] = ApiClient.convertToType(data['sprColumn'], 'String');
            }
            if (data.hasOwnProperty('sedolColumn')) {
                obj['sedolColumn'] = ApiClient.convertToType(data['sedolColumn'], 'String');
            }
            if (data.hasOwnProperty('tickerExchangeColumn')) {
                obj['tickerExchangeColumn'] = ApiClient.convertToType(data['tickerExchangeColumn'], 'String');
            }
            if (data.hasOwnProperty('tickerRegionColumn')) {
                obj['tickerRegionColumn'] = ApiClient.convertToType(data['tickerRegionColumn'], 'String');
            }
            if (data.hasOwnProperty('ukchColumn')) {
                obj['ukchColumn'] = ApiClient.convertToType(data['ukchColumn'], 'String');
            }
            if (data.hasOwnProperty('valorenColumn')) {
                obj['valorenColumn'] = ApiClient.convertToType(data['valorenColumn'], 'String');
            }
            if (data.hasOwnProperty('wknColumn')) {
                obj['wknColumn'] = ApiClient.convertToType(data['wknColumn'], 'String');
            }
            if (data.hasOwnProperty('nameColumn')) {
                obj['nameColumn'] = ApiClient.convertToType(data['nameColumn'], 'String');
            }
            if (data.hasOwnProperty('countryColumn')) {
                obj['countryColumn'] = ApiClient.convertToType(data['countryColumn'], 'String');
            }
            if (data.hasOwnProperty('stateColumn')) {
                obj['stateColumn'] = ApiClient.convertToType(data['stateColumn'], 'String');
            }
            if (data.hasOwnProperty('urlColumn')) {
                obj['urlColumn'] = ApiClient.convertToType(data['urlColumn'], 'String');
            }
            if (data.hasOwnProperty('hasResult')) {
                obj['hasResult'] = ApiClient.convertToType(data['hasResult'], 'Boolean');
            }
            if (data.hasOwnProperty('taskSubmitTime')) {
                obj['taskSubmitTime'] = ApiClient.convertToType(data['taskSubmitTime'], 'Date');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
            if (data.hasOwnProperty('inputCount')) {
                obj['inputCount'] = ApiClient.convertToType(data['inputCount'], 'Number');
            }
            if (data.hasOwnProperty('mappedCount')) {
                obj['mappedCount'] = ApiClient.convertToType(data['mappedCount'], 'Number');
            }
            if (data.hasOwnProperty('unmappedCount')) {
                obj['unmappedCount'] = ApiClient.convertToType(data['unmappedCount'], 'Number');
            }
            if (data.hasOwnProperty('indeterminateCount')) {
                obj['indeterminateCount'] = ApiClient.convertToType(data['indeterminateCount'], 'Number');
            }
            if (data.hasOwnProperty('processStartTime')) {
                obj['processStartTime'] = ApiClient.convertToType(data['processStartTime'], 'Date');
            }
            if (data.hasOwnProperty('processDuration')) {
                obj['processDuration'] = ApiClient.convertToType(data['processDuration'], 'Number');
            }
            if (data.hasOwnProperty('tryCount')) {
                obj['tryCount'] = ApiClient.convertToType(data['tryCount'], 'Number');
            }
            if (data.hasOwnProperty('decisionRate')) {
                obj['decisionRate'] = ApiClient.convertToType(data['decisionRate'], 'Number');
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = ApiClient.convertToType(data['error'], 'String');
            }
            if (data.hasOwnProperty('errorTitle')) {
                obj['errorTitle'] = ApiClient.convertToType(data['errorTitle'], 'String');
            }
            if (data.hasOwnProperty('includeEntityType')) {
                obj['includeEntityType'] = ApiClient.convertToType(data['includeEntityType'], ['String']);
            }
            if (data.hasOwnProperty('excludeEntityType')) {
                obj['excludeEntityType'] = ApiClient.convertToType(data['excludeEntityType'], ['String']);
            }
            if (data.hasOwnProperty('includeEntitySubType')) {
                obj['includeEntitySubType'] = ApiClient.convertToType(data['includeEntitySubType'], ['String']);
            }
            if (data.hasOwnProperty('excludeEntitySubType')) {
                obj['excludeEntitySubType'] = ApiClient.convertToType(data['excludeEntitySubType'], ['String']);
            }
            if (data.hasOwnProperty('userSerial')) {
                obj['userSerial'] = ApiClient.convertToType(data['userSerial'], 'String');
            }
            if (data.hasOwnProperty('userFullName')) {
                obj['userFullName'] = ApiClient.convertToType(data['userFullName'], 'String');
            }
            if (data.hasOwnProperty('universeId')) {
                obj['universeId'] = ApiClient.convertToType(data['universeId'], 'Number');
            }
            if (data.hasOwnProperty('universeName')) {
                obj['universeName'] = ApiClient.convertToType(data['universeName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier denoting a specific Concordance task submitted by the user.
 * @member {Number} taskId
 */
EntityTaskStatus.prototype['taskId'] = undefined;

/**
 * User-defined name for the task used to name the output file.
 * @member {String} taskName
 */
EntityTaskStatus.prototype['taskName'] = undefined;

/**
 * Action status for the Concordance Task process.
 * @member {String} taskAction
 */
EntityTaskStatus.prototype['taskAction'] = undefined;

/**
 * Status of the Concordance Task. If the value is \"SUCCESS\", you can move to the subsequent /entity-decisions endpoint to retrieve the results.
 * @member {module:model/EntityTaskStatus.StatusEnum} status
 */
EntityTaskStatus.prototype['status'] = undefined;

/**
 * The input file is posted as a file object in the form. 
 * @member {String} inputFile
 */
EntityTaskStatus.prototype['inputFile'] = undefined;

/**
 * Name of the column in the input file that contains a unique identifier supplied by the user.
 * @member {String} clientIdColumn
 */
EntityTaskStatus.prototype['clientIdColumn'] = undefined;

/**
 * Header Name of the column in the inputfile that contains the priority for the client id 
 * @member {String} priorityColumn
 */
EntityTaskStatus.prototype['priorityColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type BICCode, bank indentification code.
 * @member {String} bicColumn
 */
EntityTaskStatus.prototype['bicColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type Bloomberg Listing and Regional Ticker.
 * @member {String} bbgTickerColumn
 */
EntityTaskStatus.prototype['bbgTickerColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type CIK, Edgar Central Index Keys.
 * @member {String} cikColumn
 */
EntityTaskStatus.prototype['cikColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type CRD, Central Registration Depository.
 * @member {String} crdColumn
 */
EntityTaskStatus.prototype['crdColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type CUSIP.
 * @member {String} cusipColumn
 */
EntityTaskStatus.prototype['cusipColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type DUNS, Dun&Bradstreet.
 * @member {String} dunsColumn
 */
EntityTaskStatus.prototype['dunsColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type EmployerIdentificationNumber, EIN.
 * @member {String} einColumn
 */
EntityTaskStatus.prototype['einColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type FederalReserveRSSDIdentifier, RSSD.
 * @member {String} rssdColumn
 */
EntityTaskStatus.prototype['rssdColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type FitchCreditRating, Fitch Ratings Identifier.
 * @member {String} fitchColumn
 */
EntityTaskStatus.prototype['fitchColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type ISIN.
 * @member {String} isinColumn
 */
EntityTaskStatus.prototype['isinColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type LegalEntityIdentifier, LEI.
 * @member {String} leiColumn
 */
EntityTaskStatus.prototype['leiColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type Bloomberg Listing/Regional/Security ID.
 * @member {String} bbgFigiColumn
 */
EntityTaskStatus.prototype['bbgFigiColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type MoodysIssuer, Moody's Ratings Identifier.
 * @member {String} mdColumn
 */
EntityTaskStatus.prototype['mdColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type PriceTicker.
 * @member {String} tickerColumn
 */
EntityTaskStatus.prototype['tickerColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type S&PRating, S&P Ratings Identifier
 * @member {String} sprColumn
 */
EntityTaskStatus.prototype['sprColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type SEDOL.
 * @member {String} sedolColumn
 */
EntityTaskStatus.prototype['sedolColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type TickerExch.
 * @member {String} tickerExchangeColumn
 */
EntityTaskStatus.prototype['tickerExchangeColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type TickerRegion.
 * @member {String} tickerRegionColumn
 */
EntityTaskStatus.prototype['tickerRegionColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type UKCompanyHouse.
 * @member {String} ukchColumn
 */
EntityTaskStatus.prototype['ukchColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type VALOR, Valoren (\"Valor\") Identification.
 * @member {String} valorenColumn
 */
EntityTaskStatus.prototype['valorenColumn'] = undefined;

/**
 * Header Name of the column in the input file for the type WKN, German Securities Identification.
 * @member {String} wknColumn
 */
EntityTaskStatus.prototype['wknColumn'] = undefined;

/**
 * Name of the column in the input file that contains the entity name to be matched.
 * @member {String} nameColumn
 */
EntityTaskStatus.prototype['nameColumn'] = undefined;

/**
 * Name of the column in the input file that contains the ISO2 country code corresponding to the entity name.  The country code is used when evaluating candidates for a match. 
 * @member {String} countryColumn
 */
EntityTaskStatus.prototype['countryColumn'] = undefined;

/**
 * Name of the column in the input file that contains the Two-character state code corresponding to the entity name. The state code is used when evaluating candidates for a match. 
 * @member {String} stateColumn
 */
EntityTaskStatus.prototype['stateColumn'] = undefined;

/**
 * Name of the column in the input file that contains the URL corresponding to the entity name. The URL is used when evaluating candidates for a match. 
 * @member {String} urlColumn
 */
EntityTaskStatus.prototype['urlColumn'] = undefined;

/**
 * Flag denoting the taskId has a result.
 * @member {Boolean} hasResult
 */
EntityTaskStatus.prototype['hasResult'] = undefined;

/**
 * Time the Task was submitted in UTC.
 * @member {Date} taskSubmitTime
 */
EntityTaskStatus.prototype['taskSubmitTime'] = undefined;

/**
 * Textual message for the status.
 * @member {String} message
 */
EntityTaskStatus.prototype['message'] = undefined;

/**
 * Number of records in the Input File.
 * @member {Number} inputCount
 */
EntityTaskStatus.prototype['inputCount'] = undefined;

/**
 * Number of records with status of MAPPED the Input File.
 * @member {Number} mappedCount
 */
EntityTaskStatus.prototype['mappedCount'] = undefined;

/**
 * Number of records with status of UNMAPPED the Input File.
 * @member {Number} unmappedCount
 */
EntityTaskStatus.prototype['unmappedCount'] = undefined;

/**
 * Number of records with status of INDETERMINATE the Input File.
 * @member {Number} indeterminateCount
 */
EntityTaskStatus.prototype['indeterminateCount'] = undefined;

/**
 * Process start time in UTC.
 * @member {Date} processStartTime
 */
EntityTaskStatus.prototype['processStartTime'] = undefined;

/**
 * Process duration in seconds.
 * @member {Number} processDuration
 */
EntityTaskStatus.prototype['processDuration'] = undefined;

/**
 * Number of tries made so far for the request.
 * @member {Number} tryCount
 */
EntityTaskStatus.prototype['tryCount'] = undefined;

/**
 * Percentage of mapped entities in the Input File.
 * @member {Number} decisionRate
 */
EntityTaskStatus.prototype['decisionRate'] = undefined;

/**
 * @member {String} error
 */
EntityTaskStatus.prototype['error'] = undefined;

/**
 * @member {String} errorTitle
 */
EntityTaskStatus.prototype['errorTitle'] = undefined;

/**
 * Requested Entity types to include. 
 * @member {Array.<String>} includeEntityType
 */
EntityTaskStatus.prototype['includeEntityType'] = undefined;

/**
 * Requested Entity types to exclude. 
 * @member {Array.<String>} excludeEntityType
 */
EntityTaskStatus.prototype['excludeEntityType'] = undefined;

/**
 * Requested Entity subtypes to include. 
 * @member {Array.<String>} includeEntitySubType
 */
EntityTaskStatus.prototype['includeEntitySubType'] = undefined;

/**
 * Requested Entity subtypes to exclude. 
 * @member {Array.<String>} excludeEntitySubType
 */
EntityTaskStatus.prototype['excludeEntitySubType'] = undefined;

/**
 * user-serial of the person who initiated the entity task.
 * @member {String} userSerial
 */
EntityTaskStatus.prototype['userSerial'] = undefined;

/**
 * Full name of the person associated with the `userSerial`. 
 * @member {String} userFullName
 */
EntityTaskStatus.prototype['userFullName'] = undefined;

/**
 * The universe id this task was submitted to. 
 * @member {Number} universeId
 */
EntityTaskStatus.prototype['universeId'] = undefined;

/**
 * The name of the universe this task was submitted to. 
 * @member {String} universeName
 */
EntityTaskStatus.prototype['universeName'] = undefined;





/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
EntityTaskStatus['StatusEnum'] = {

    /**
     * value: "PENDING"
     * @const
     */
    "PENDING": "PENDING",

    /**
     * value: "IN_PROGRESS"
     * @const
     */
    "IN_PROGRESS": "IN_PROGRESS",

    /**
     * value: "SUCCESS"
     * @const
     */
    "SUCCESS": "SUCCESS",

    /**
     * value: "FAILURE"
     * @const
     */
    "FAILURE": "FAILURE",

    /**
     * value: "BAD_REQUEST"
     * @const
     */
    "BAD_REQUEST": "BAD_REQUEST",

    /**
     * value: "ABORTED"
     * @const
     */
    "ABORTED": "ABORTED"
};



export default EntityTaskStatus;

