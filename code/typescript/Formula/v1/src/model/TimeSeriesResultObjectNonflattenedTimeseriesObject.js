/**
 * FactSet Formula API
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs. 
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import TimeSeriesResultObjectNonflattenedBase from './TimeSeriesResultObjectNonflattenedBase';
import TimeSeriesTimeseriesObject from './TimeSeriesTimeseriesObject';

/**
 * The TimeSeriesResultObjectNonflattenedTimeseriesObject model module.
 * @module model/TimeSeriesResultObjectNonflattenedTimeseriesObject
 */
class TimeSeriesResultObjectNonflattenedTimeseriesObject {
    /**
     * Constructs a new <code>TimeSeriesResultObjectNonflattenedTimeseriesObject</code>.
     * @alias module:model/TimeSeriesResultObjectNonflattenedTimeseriesObject
     * @implements module:model/TimeSeriesResultObjectNonflattenedBase
     * @param error {Number} Indicates that there was an error in the execution of the FQL Formula. * Zero – success * Non-zero – failure 
     * @param formula {String} FQL formula requested.
     * @param requestId {String} Identifier requested.
     * @param dataType {module:model/TimeSeriesResultObjectNonflattenedTimeseriesObject.DataTypeEnum} Type of data returned in `result`
     * @param objectType {module:model/TimeSeriesResultObjectNonflattenedTimeseriesObject.ObjectTypeEnum} Type of object returned in `result`
     */
    constructor(error, formula, requestId, dataType, objectType) { 
        TimeSeriesResultObjectNonflattenedBase.initialize(this, error, formula, requestId, dataType, objectType);
        TimeSeriesResultObjectNonflattenedTimeseriesObject.initialize(this, error, formula, requestId, dataType, objectType);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, error, formula, requestId, dataType, objectType) { 
        obj['error'] = error;
        obj['formula'] = formula;
        obj['requestId'] = requestId;
        obj['dataType'] = dataType;
        obj['objectType'] = objectType;
    }

    /**
     * Constructs a <code>TimeSeriesResultObjectNonflattenedTimeseriesObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TimeSeriesResultObjectNonflattenedTimeseriesObject} obj Optional instance to populate.
     * @return {module:model/TimeSeriesResultObjectNonflattenedTimeseriesObject} The populated <code>TimeSeriesResultObjectNonflattenedTimeseriesObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TimeSeriesResultObjectNonflattenedTimeseriesObject();
            TimeSeriesResultObjectNonflattenedBase.constructFromObject(data, obj);

            if (data.hasOwnProperty('result')) {
                obj['result'] = TimeSeriesTimeseriesObject.constructFromObject(data['result']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = ApiClient.convertToType(data['error'], 'Number');
            }
            if (data.hasOwnProperty('errorMessage')) {
                obj['errorMessage'] = ApiClient.convertToType(data['errorMessage'], 'String');
            }
            if (data.hasOwnProperty('formula')) {
                obj['formula'] = ApiClient.convertToType(data['formula'], 'String');
            }
            if (data.hasOwnProperty('displayName')) {
                obj['displayName'] = ApiClient.convertToType(data['displayName'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('dataType')) {
                obj['dataType'] = ApiClient.convertToType(data['dataType'], 'String');
            }
            if (data.hasOwnProperty('objectType')) {
                obj['objectType'] = ApiClient.convertToType(data['objectType'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TimeSeriesTimeseriesObject} result
 */
TimeSeriesResultObjectNonflattenedTimeseriesObject.prototype['result'] = undefined;

/**
 * Indicates that there was an error in the execution of the FQL Formula. * Zero – success * Non-zero – failure 
 * @member {Number} error
 */
TimeSeriesResultObjectNonflattenedTimeseriesObject.prototype['error'] = undefined;

/**
 * If error is non-zero, errorMessage will display the FQL formula error.
 * @member {String} errorMessage
 */
TimeSeriesResultObjectNonflattenedTimeseriesObject.prototype['errorMessage'] = undefined;

/**
 * FQL formula requested.
 * @member {String} formula
 */
TimeSeriesResultObjectNonflattenedTimeseriesObject.prototype['formula'] = undefined;

/**
 * Display Name.
 * @member {String} displayName
 */
TimeSeriesResultObjectNonflattenedTimeseriesObject.prototype['displayName'] = undefined;

/**
 * Identifier requested.
 * @member {String} requestId
 */
TimeSeriesResultObjectNonflattenedTimeseriesObject.prototype['requestId'] = undefined;

/**
 * The **fsymId** field returned is the FactSet Default Permanent Identifier for the `requestId`. For all supported `requestId` symbol types, the `fsymId` parameter will return the Regional Level PermId '-R' which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted `requestId` symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Included only if the `fsymId` parameter is set to Y. 
 * @member {String} fsymId
 */
TimeSeriesResultObjectNonflattenedTimeseriesObject.prototype['fsymId'] = undefined;

/**
 * Type of data returned in `result`
 * @member {module:model/TimeSeriesResultObjectNonflattenedTimeseriesObject.DataTypeEnum} dataType
 */
TimeSeriesResultObjectNonflattenedTimeseriesObject.prototype['dataType'] = undefined;

/**
 * Type of object returned in `result`
 * @member {module:model/TimeSeriesResultObjectNonflattenedTimeseriesObject.ObjectTypeEnum} objectType
 */
TimeSeriesResultObjectNonflattenedTimeseriesObject.prototype['objectType'] = undefined;


// Implement TimeSeriesResultObjectNonflattenedBase interface:
/**
 * Indicates that there was an error in the execution of the FQL Formula. * Zero – success * Non-zero – failure 
 * @member {Number} error
 */
TimeSeriesResultObjectNonflattenedBase.prototype['error'] = undefined;
/**
 * If error is non-zero, errorMessage will display the FQL formula error.
 * @member {String} errorMessage
 */
TimeSeriesResultObjectNonflattenedBase.prototype['errorMessage'] = undefined;
/**
 * FQL formula requested.
 * @member {String} formula
 */
TimeSeriesResultObjectNonflattenedBase.prototype['formula'] = undefined;
/**
 * Display Name.
 * @member {String} displayName
 */
TimeSeriesResultObjectNonflattenedBase.prototype['displayName'] = undefined;
/**
 * Identifier requested.
 * @member {String} requestId
 */
TimeSeriesResultObjectNonflattenedBase.prototype['requestId'] = undefined;
/**
 * The **fsymId** field returned is the FactSet Default Permanent Identifier for the `requestId`. For all supported `requestId` symbol types, the `fsymId` parameter will return the Regional Level PermId '-R' which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted `requestId` symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Included only if the `fsymId` parameter is set to Y. 
 * @member {String} fsymId
 */
TimeSeriesResultObjectNonflattenedBase.prototype['fsymId'] = undefined;
/**
 * Type of data returned in `result`
 * @member {module:model/TimeSeriesResultObjectNonflattenedBase.DataTypeEnum} dataType
 */
TimeSeriesResultObjectNonflattenedBase.prototype['dataType'] = undefined;
/**
 * Type of object returned in `result`
 * @member {module:model/TimeSeriesResultObjectNonflattenedBase.ObjectTypeEnum} objectType
 */
TimeSeriesResultObjectNonflattenedBase.prototype['objectType'] = undefined;



/**
 * Allowed values for the <code>dataType</code> property.
 * @enum {String}
 * @readonly
 */
TimeSeriesResultObjectNonflattenedTimeseriesObject['DataTypeEnum'] = {

    /**
     * value: "STRING"
     * @const
     */
    "STRING": "STRING",

    /**
     * value: "INTEGER"
     * @const
     */
    "INTEGER": "INTEGER",

    /**
     * value: "DOUBLE"
     * @const
     */
    "DOUBLE": "DOUBLE"
};


/**
 * Allowed values for the <code>objectType</code> property.
 * @enum {String}
 * @readonly
 */
TimeSeriesResultObjectNonflattenedTimeseriesObject['ObjectTypeEnum'] = {

    /**
     * value: "SCALAR"
     * @const
     */
    "SCALAR": "SCALAR",

    /**
     * value: "ARRAY"
     * @const
     */
    "ARRAY": "ARRAY",

    /**
     * value: "MATRIX"
     * @const
     */
    "MATRIX": "MATRIX",

    /**
     * value: "TIMESERIES"
     * @const
     */
    "TIMESERIES": "TIMESERIES"
};



export default TimeSeriesResultObjectNonflattenedTimeseriesObject;

