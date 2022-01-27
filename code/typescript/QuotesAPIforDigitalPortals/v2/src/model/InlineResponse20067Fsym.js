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
import InlineResponse20067FsymListing from './InlineResponse20067FsymListing';
import InlineResponse20067FsymRegional from './InlineResponse20067FsymRegional';

/**
 * The InlineResponse20067Fsym model module.
 * @module model/InlineResponse20067Fsym
 * @version 0.9.0
 */
class InlineResponse20067Fsym {
    /**
     * Constructs a new <code>InlineResponse20067Fsym</code>.
     * Notation-level FactSet identifiers of the financial instrument used primarily in FactSet products other than the MDG.
     * @alias module:model/InlineResponse20067Fsym
     */
    constructor() { 
        
        InlineResponse20067Fsym.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20067Fsym</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20067Fsym} obj Optional instance to populate.
     * @return {module:model/InlineResponse20067Fsym} The populated <code>InlineResponse20067Fsym</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20067Fsym();

            if (data.hasOwnProperty('listing')) {
                obj['listing'] = InlineResponse20067FsymListing.constructFromObject(data['listing']);
            }
            if (data.hasOwnProperty('regional')) {
                obj['regional'] = InlineResponse20067FsymRegional.constructFromObject(data['regional']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20067FsymListing} listing
 */
InlineResponse20067Fsym.prototype['listing'] = undefined;

/**
 * @member {module:model/InlineResponse20067FsymRegional} regional
 */
InlineResponse20067Fsym.prototype['regional'] = undefined;






export default InlineResponse20067Fsym;

