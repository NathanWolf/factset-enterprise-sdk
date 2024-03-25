/**
 * SDF Download API
 * The Standard DataFeed (SDF) Download API provides an alternative method for users to request and retrieve SDF packages (schemas & bundles). This service is not a direct replacement and does not have 100% feature parity with the Loader Application. This API provides an alternative for users who are unable to utilize the Loader application due to following reasons:   - Inability to install 3rd party executables due to Corporate Security policies     - Inability to utilize the Loader application due to limitations or restrictions with the environment used to consume Standard Datafeed   - Clients who are utilizing existing delivery method like FTP, who may want to use a more secured & modern solution     This API allows users to retrieve maximum of latest 30 days of data     Additional parameters are available to filter requests to get the exact files users are looking for.    QFL data is delivered through Content API & Bulk Data API (SDF API)  - Content API : Provides direct access to FactSet-hosted QFL data.  Suitable for interactive, ad hoc QFL requests.  Constraints on large extracts.  Costs are based on consumption, i.e. more calls can result in more costs.  - Bulk Data API : Provides access to download locations of zip files for client download. Suitable for production processes within a client environment. Cost is based on the use case and fixed unless scope changes (same as other SDFs).
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: teammustang@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SchemaDetails from './SchemaDetails';

/**
 * The ListSchemas model module.
 * @module model/ListSchemas
 */
class ListSchemas {
    /**
     * Constructs a new <code>ListSchemas</code>.
     * List Of Schemas
     * @alias module:model/ListSchemas
     * @implements module:model/SchemaDetails
     */
    constructor() { 
        SchemaDetails.initialize(this);
        ListSchemas.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ListSchemas</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ListSchemas} obj Optional instance to populate.
     * @return {module:model/ListSchemas} The populated <code>ListSchemas</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ListSchemas();
            SchemaDetails.constructFromObject(data, obj);

            if (data.hasOwnProperty('schema')) {
                obj['schema'] = ApiClient.convertToType(data['schema'], 'String');
            }
            if (data.hasOwnProperty('sequence')) {
                obj['sequence'] = ApiClient.convertToType(data['sequence'], 'Number');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'String');
            }
        }
        return obj;
    }


}

/**
 * schema name
 * @member {String} schema
 */
ListSchemas.prototype['schema'] = undefined;

/**
 * version number of the schema
 * @member {Number} sequence
 */
ListSchemas.prototype['sequence'] = undefined;

/**
 * pre-signed downloadable url containing the information of the schema
 * @member {String} url
 */
ListSchemas.prototype['url'] = undefined;

/**
 * time stamp of when the schema sequence was last updated
 * @member {String} timestamp
 */
ListSchemas.prototype['timestamp'] = undefined;


// Implement SchemaDetails interface:
/**
 * schema name
 * @member {String} schema
 */
SchemaDetails.prototype['schema'] = undefined;
/**
 * version number of the schema
 * @member {Number} sequence
 */
SchemaDetails.prototype['sequence'] = undefined;
/**
 * pre-signed downloadable url containing the information of the schema
 * @member {String} url
 */
SchemaDetails.prototype['url'] = undefined;
/**
 * time stamp of when the schema sequence was last updated
 * @member {String} timestamp
 */
SchemaDetails.prototype['timestamp'] = undefined;




export default ListSchemas;

