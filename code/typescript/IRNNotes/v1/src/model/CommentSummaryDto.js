/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SubcommentSummaryDto from './SubcommentSummaryDto';

/**
 * The CommentSummaryDto model module.
 * @module model/CommentSummaryDto
 * @version 0.20.0
 */
class CommentSummaryDto {
    /**
     * Constructs a new <code>CommentSummaryDto</code>.
     * @alias module:model/CommentSummaryDto
     */
    constructor() { 
        
        CommentSummaryDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CommentSummaryDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CommentSummaryDto} obj Optional instance to populate.
     * @return {module:model/CommentSummaryDto} The populated <code>CommentSummaryDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CommentSummaryDto();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('UserId')) {
                obj['UserId'] = ApiClient.convertToType(data['UserId'], 'String');
            }
            if (data.hasOwnProperty('CreatedAt')) {
                obj['CreatedAt'] = ApiClient.convertToType(data['CreatedAt'], 'String');
            }
            if (data.hasOwnProperty('Subcomments')) {
                obj['Subcomments'] = ApiClient.convertToType(data['Subcomments'], [SubcommentSummaryDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} Id
 */
CommentSummaryDto.prototype['Id'] = undefined;

/**
 * @member {String} UserId
 */
CommentSummaryDto.prototype['UserId'] = undefined;

/**
 * @member {String} CreatedAt
 */
CommentSummaryDto.prototype['CreatedAt'] = undefined;

/**
 * @member {Array.<module:model/SubcommentSummaryDto>} Subcomments
 */
CommentSummaryDto.prototype['Subcomments'] = undefined;






export default CommentSummaryDto;

