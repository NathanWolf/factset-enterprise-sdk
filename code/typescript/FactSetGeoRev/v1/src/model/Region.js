/**
 * FactSet GeoRev API
 * FactSet Revere Geographic Revenue (\"GeoRev\") Exposure data provides a highly structured and normalized display of companies’ revenues by geography. Using a four level taxonomy structure, understand the companies' Super-Region-->Region-->Area-->Country revenue breakdowns. Quickly understand a company’s revenue exposure in countries impacted by geopolitical, macroeconomic, and market risk. Understand the geographic footprint of a company based on sources of revenue versus country of domicile, and analyze global revenue exposures at the company, index, or portfolio level.<p> Geographic revenue has historically been difficult to analyze due to companies’ non-standard and incomplete reporting. Investors relying solely on this as-reported data are limited in their ability to compare, aggregate or screen exposures across a universe or portfolio of companies. To achieve normalization, FactSet GeoRev captures data through a proprietary four-level geographic classification structure. An estimation algorithm based on GDP weighting and accounting logic is then applied to solve for any non-explicit disclosures. The result is a consistent, accurate, and flexible dataset that can take a company’s revenues and break them down into any geographic country or region categories.</p><p>As markets become more integrated and companies expand operations beyond their domestic markets, GeoRev provides a new and valuable country factor to help investors discover alpha, model risk exposure, optimize portfolio weighting, and improve fund administration and reporting.</p><p>Data Frequency -  Annual; Update Frequency - Daily. 49,000+ Publically Listed Companies. All Russell 3000 and MSCI ACWI Index Consituents. U.S. Data is available from 2003, with Non-US data from 2007. For more details, visit [OA 17555](https://my.apps.factset.com/oa/pages/17555)</p> 
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Region model module.
 * @module model/Region
 * @version 0.20.0
 */
class Region {
    /**
     * Constructs a new <code>Region</code>.
     * @alias module:model/Region
     */
    constructor() { 
        
        Region.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Region</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Region} obj Optional instance to populate.
     * @return {module:model/Region} The populated <code>Region</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Region();

            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('regionId')) {
                obj['regionId'] = ApiClient.convertToType(data['regionId'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('regionCertaintyClass')) {
                obj['regionCertaintyClass'] = ApiClient.convertToType(data['regionCertaintyClass'], 'String');
            }
            if (data.hasOwnProperty('regionCertaintyRank')) {
                obj['regionCertaintyRank'] = ApiClient.convertToType(data['regionCertaintyRank'], 'Number');
            }
            if (data.hasOwnProperty('regionConfidence')) {
                obj['regionConfidence'] = ApiClient.convertToType(data['regionConfidence'], 'Number');
            }
            if (data.hasOwnProperty('regionName')) {
                obj['regionName'] = ApiClient.convertToType(data['regionName'], 'String');
            }
            if (data.hasOwnProperty('regionPercent')) {
                obj['regionPercent'] = ApiClient.convertToType(data['regionPercent'], 'Number');
            }
            if (data.hasOwnProperty('regionRevenue')) {
                obj['regionRevenue'] = ApiClient.convertToType(data['regionRevenue'], 'Number');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('fiscalEndDate')) {
                obj['fiscalEndDate'] = ApiClient.convertToType(data['fiscalEndDate'], 'Date');
            }
            if (data.hasOwnProperty('reportDate')) {
                obj['reportDate'] = ApiClient.convertToType(data['reportDate'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * Ending date for the period requested expressed in YYYY-MM-DD format.
 * @member {Date} date
 */
Region.prototype['date'] = undefined;

/**
 * FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E).
 * @member {String} fsymId
 */
Region.prototype['fsymId'] = undefined;

/**
 * Identifier representing the geographic Region.
 * @member {String} regionId
 */
Region.prototype['regionId'] = undefined;

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
Region.prototype['requestId'] = undefined;

/**
 * Designated classes from A (highest) to E (lowest) based on `regionCertaintyRank`, where -->  |Class|Minimum Certainty Rank|Maximum Certainty Rank| |---|---|---| |A|71|80| |B|57|70| |C|42|56| |D|24|41| |E|1|23| 
 * @member {String} regionCertaintyClass
 */
Region.prototype['regionCertaintyClass'] = undefined;

/**
 * Indicates the relative reliability of estimates. Ranks are based on multiple factors related to the reported information and the algorithmic estimation. Ranks range from 1 to 80, with 1 indicating the lowest certainty in the estimate, and 80 indicating a reported exposure. Certainty Rank factors include -  * Reporting standards of the country where the source annual report/filing was filed * A company’s previous years’ country-level reporting * Reliability of country GDP data * Proportion of total report value that must be estimated 
 * @member {Number} regionCertaintyRank
 */
Region.prototype['regionCertaintyRank'] = undefined;

/**
 * Returns the confidence score for the company percentage revenue for the selected geographic area. Confidence score is a measure of how confident we are that our algorithm has done a good job in estimating geographic revenue given the estimation parameters ( GDP, accounting standards, details of data that a company has disclosed,...). Confidence Factors are calculated for all estimated country values, then weighted and aggregated up the geographic tree for areas, regions, and super regions. The confidence factor should not be interpreted as the equivalent of a confidence interval from a statistical sense. The confidence factor is ordinal by nature, and its current range of 0.5000 to 1.0000. A confidence factor of 1.000 indicates that the revenue is an actual, reported, or declared value. **Please see OA page 17555 for more details **. 
 * @member {Number} regionConfidence
 */
Region.prototype['regionConfidence'] = undefined;

/**
 * The Region Name in proper format, describing the regionId.
 * @member {String} regionName
 */
Region.prototype['regionName'] = undefined;

/**
 * Returns the company percentage revenue for the selected geographic region. Conventional geographic revenue data are difficult to interpret and compare between companies because they are not normalized. Furthermore, these non-normalized geographic revenue data do not provide any exposure estimates on countries and regions that are not explicitly disclosed by the companies. GeoRev answers these two challenges by first mapping companies’ revenues to a normalized geographic taxonomy, and then applying a proprietary algorithm to estimate % revenue exposure to countries and regions that are not explicitly disclosed. Estimates are accompanied by a Confidence Factor, which offers an easy way to distinguish them from actual disclosed values. Please see OA page 17555 for more details. 
 * @member {Number} regionPercent
 */
Region.prototype['regionPercent'] = undefined;

/**
 * Returns the company revenue for the selected geographic region in Millions for the requested currency. Conventional geographic revenue data are difficult to interpret and compare between companies because they are not normalized. Furthermore, these non-normalized geographic revenue data do not provide any exposure estimates on countries and regions that are not explicitly disclosed by the companies. GeoRev answers these two challenges by first mapping companies’ revenues to a normalized geographic taxonomy, and then applying a proprietary algorithm to estimate % revenue exposure to countries and regions that are not explicitly disclosed. Estimates are accompanied by a Confidence Factor, which offers an easy way to distinguish them from actual disclosed values. Please see OA page 17555 for more details.  
 * @member {Number} regionRevenue
 */
Region.prototype['regionRevenue'] = undefined;

/**
 * The Currency Code representing the Revenue values in the response.
 * @member {String} currency
 */
Region.prototype['currency'] = undefined;

/**
 * The latest fully reported fiscal annual period date in YYYY-MM-DD format as of the dates requested.
 * @member {Date} fiscalEndDate
 */
Region.prototype['fiscalEndDate'] = undefined;

/**
 * The Report Date for the latest fully reported fiscal year in YYYY-MM-DD format.
 * @member {Date} reportDate
 */
Region.prototype['reportDate'] = undefined;






export default Region;

