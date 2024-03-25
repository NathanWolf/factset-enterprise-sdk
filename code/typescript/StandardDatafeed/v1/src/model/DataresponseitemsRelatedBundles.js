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

/**
 * The DataresponseitemsRelatedBundles model module.
 * @module model/DataresponseitemsRelatedBundles
 */
class DataresponseitemsRelatedBundles {
    /**
     * Constructs a new <code>DataresponseitemsRelatedBundles</code>.
     * @alias module:model/DataresponseitemsRelatedBundles
     */
    constructor() { 
        
        DataresponseitemsRelatedBundles.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DataresponseitemsRelatedBundles</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DataresponseitemsRelatedBundles} obj Optional instance to populate.
     * @return {module:model/DataresponseitemsRelatedBundles} The populated <code>DataresponseitemsRelatedBundles</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DataresponseitemsRelatedBundles();

            if (data.hasOwnProperty('bundle')) {
                obj['bundle'] = ApiClient.convertToType(data['bundle'], 'String');
            }
            if (data.hasOwnProperty('sequence')) {
                obj['sequence'] = ApiClient.convertToType(data['sequence'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} bundle
 */
DataresponseitemsRelatedBundles.prototype['bundle'] = undefined;

/**
 * @member {String} sequence
 */
DataresponseitemsRelatedBundles.prototype['sequence'] = undefined;






export default DataresponseitemsRelatedBundles;

