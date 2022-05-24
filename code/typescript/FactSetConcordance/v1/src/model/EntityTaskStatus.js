/**
 * FactSet Concordance API
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
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
 * @version 0.8.2
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

