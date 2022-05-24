/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ProductResourceMeta from './ProductResourceMeta';

/**
 * The ProductResource model module.
 * @module model/ProductResource
 * @version 0.20.0
 */
class ProductResource {
    /**
     * Constructs a new <code>ProductResource</code>.
     * @alias module:model/ProductResource
     */
    constructor() { 
        
        ProductResource.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ProductResource</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProductResource} obj Optional instance to populate.
     * @return {module:model/ProductResource} The populated <code>ProductResource</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProductResource();

            if (data.hasOwnProperty('schemas')) {
                obj['schemas'] = ApiClient.convertToType(data['schemas'], ['String']);
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('groupDescription')) {
                obj['groupDescription'] = ApiClient.convertToType(data['groupDescription'], 'String');
            }
            if (data.hasOwnProperty('workstation')) {
                obj['workstation'] = ApiClient.convertToType(data['workstation'], 'Boolean');
            }
            if (data.hasOwnProperty('requiresApproval')) {
                obj['requiresApproval'] = ApiClient.convertToType(data['requiresApproval'], 'String');
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ProductResourceMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} schemas
 */
ProductResource.prototype['schemas'] = undefined;

/**
 * @member {String} id
 */
ProductResource.prototype['id'] = undefined;

/**
 * Name of product.
 * @member {String} name
 */
ProductResource.prototype['name'] = undefined;

/**
 * Details of product.
 * @member {String} description
 */
ProductResource.prototype['description'] = undefined;

/**
 * Description of the group the product belongs in, e.g. Exchange, Product, Database, Workstation, etc.
 * @member {String} groupDescription
 */
ProductResource.prototype['groupDescription'] = undefined;

/**
 * A boolean representing whether the product is base-level access to FactSet, issuing the individual's serial number. Only one Product \"id\" per individual will have this value set to true.
 * @member {Boolean} workstation
 */
ProductResource.prototype['workstation'] = undefined;

/**
 * A description of the type of approval required before an order for this product can be fulfilled. This value is null for those products that do not require any approval.
 * @member {String} requiresApproval
 */
ProductResource.prototype['requiresApproval'] = undefined;

/**
 * @member {module:model/ProductResourceMeta} meta
 */
ProductResource.prototype['meta'] = undefined;






export default ProductResource;

