/**
 * FactSet Concordance API
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are two types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import EntityMatchRequestInput from './EntityMatchRequestInput';

/**
 * The EntityMatchRequest model module.
 * @module model/EntityMatchRequest
 */
class EntityMatchRequest {
    /**
     * Constructs a new <code>EntityMatchRequest</code>.
     * Request object for a requesting multiple Entity Matches.
     * @alias module:model/EntityMatchRequest
     * @param input {Array.<module:model/EntityMatchRequestInput>} 
     */
    constructor(input) { 
        
        EntityMatchRequest.initialize(this, input);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, input) { 
        obj['input'] = input;
    }

    /**
     * Constructs a <code>EntityMatchRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EntityMatchRequest} obj Optional instance to populate.
     * @return {module:model/EntityMatchRequest} The populated <code>EntityMatchRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntityMatchRequest();

            if (data.hasOwnProperty('input')) {
                obj['input'] = ApiClient.convertToType(data['input'], [EntityMatchRequestInput]);
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
            if (data.hasOwnProperty('includeParent')) {
                obj['includeParent'] = ApiClient.convertToType(data['includeParent'], 'Boolean');
            }
            if (data.hasOwnProperty('universeId')) {
                obj['universeId'] = ApiClient.convertToType(data['universeId'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/EntityMatchRequestInput>} input
 */
EntityMatchRequest.prototype['input'] = undefined;

/**
 * Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |ABS|Asset-Backed||MED|Broadcast Call Sign|   |BAS|Business Association (JP)||MUC|Mutual Fd-Closed End|   |CAC|Consolidated Accounting||MUE|Mutual Fd-ETF|   |CMD|Commodity||MUT|Mutual Fd-Open End|   |COL|College/University||NPO|Non-Profit Organization|   |CUR|Currency||OPD|Operating Division|   |ESP|Emp Stk Ownership Plan||OTH|Other|   |EXT|Extinct||PEF|Pension Fund|   |FAF|Family of Fds (VC/Pvt EQ)||PRO|Real Property|   |FND|Foundation/Endowment||PUB|Public Company|   |FNS|Financing Subsidiary/SPE||PVF|Private Eq Fd/Alt Invt|   |FRX|ForEx||PVT|Private Company|   |GOV|Government||SOV|Sovereign Wealth Fund|   |HED|Hedge Fund||SUB|Subsidiary|   |HOL|Holding Company||TRU|Trust/Trustee|   |IDX|Index||UMB|Umbrella Fund|   |VEN|Venture Capital Fund||JVT|Joint Venture| 
 * @member {Array.<String>} includeEntityType
 */
EntityMatchRequest.prototype['includeEntityType'] = undefined;

/**
 * Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Candidates with an entity type specified will not be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |ABS|Asset-Backed||MED|Broadcast Call Sign|   |BAS|Business Association (JP)||MUC|Mutual Fd-Closed End|   |CAC|Consolidated Accounting||MUE|Mutual Fd-ETF|   |CMD|Commodity||MUT|Mutual Fd-Open End|   |COL|College/University||NPO|Non-Profit Organization|   |CUR|Currency||OPD|Operating Division|   |ESP|Emp Stk Ownership Plan||OTH|Other|   |EXT|Extinct||PEF|Pension Fund|   |FAF|Family of Fds (VC/Pvt EQ)||PRO|Real Property|   |FND|Foundation/Endowment||PUB|Public Company|   |FNS|Financing Subsidiary/SPE||PVF|Private Eq Fd/Alt Invt|   |FRX|ForEx||PVT|Private Company|   |GOV|Government||SOV|Sovereign Wealth Fund|   |HED|Hedge Fund||SUB|Subsidiary|   |HOL|Holding Company||TRU|Trust/Trustee|   |IDX|Index||UMB|Umbrella Fund|   |VEN|Venture Capital Fund||JVT|Joint Venture| 
 * @member {Array.<String>} excludeEntityType
 */
EntityMatchRequest.prototype['excludeEntityType'] = undefined;

/**
 * Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description|   |---|---|---|---|   |AR|Arbitrage|IC|Investment Company|   |BM|Bank Investment Division|IN|Insurance Company|   |BR|Broker|MF|Mutual Fund Manager|   |CP|Corporate|ML|Master Ltd Part|   |CU|Custodial|MM|Market Maker|   |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt|   |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager|   |FO|Foundation/Endowment Manager|PP|Real Estate Manager|   |FS|Fund Distributor|RE|Research Firm|   |FU|Fund|SB|Subsidiary Branch|   |FY|Family Office|ST|Stock Borrowing/Lending|   |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager|   |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity|   |IA|Investment Adviser|   |IB|Investment Banking| 
 * @member {Array.<String>} includeEntitySubType
 */
EntityMatchRequest.prototype['includeEntitySubType'] = undefined;

/**
 * Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will not be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description|   |---|---|---|---|   |AR|Arbitrage|IC|Investment Company|   |BM|Bank Investment Division|IN|Insurance Company|   |BR|Broker|MF|Mutual Fund Manager|   |CP|Corporate|ML|Master Ltd Part|   |CU|Custodial|MM|Market Maker|   |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt|   |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager|   |FO|Foundation/Endowment Manager|PP|Real Estate Manager|   |FS|Fund Distributor|RE|Research Firm|   |FU|Fund|SB|Subsidiary Branch|   |FY|Family Office|ST|Stock Borrowing/Lending|   |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager|   |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity|   |IA|Investment Adviser|   |IB|Investment Banking| 
 * @member {Array.<String>} excludeEntitySubType
 */
EntityMatchRequest.prototype['excludeEntitySubType'] = undefined;

/**
 * Flag to include parent entities in the list of candidates. This parameter does not influence the match result. 
 * @member {Boolean} includeParent
 * @default false
 */
EntityMatchRequest.prototype['includeParent'] = false;

/**
 * The universeId to save this set of inputs to 
 * @member {Number} universeId
 */
EntityMatchRequest.prototype['universeId'] = undefined;






export default EntityMatchRequest;

