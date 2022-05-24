/**
 * FactSet ESG API
 * FactSet ESG (powered by FactSet Truvalue Labs) applies machine learning to uncover risks and opportunities from companies' Environmental, Social and Governance (ESG) behavior, which are aggregated and categorized into continuously updated, material ESG scores. The service focuses on company ESG behavior from external sources and includes both positive and negative events that go beyond traditional sources of ESG risk data.<p> FactSet ESG extracts, analyzes, and generates scores from millions of documents each month collected from more than 100,000 data sources in over 13 languages. Sources include news, trade journals, NGOs, watchdog groups, trade blogs, industry reports and social media. Products deliver investable insights by revealing value and risk factors from unstructured data at the speed of current events.</p> 
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SasbScoresAll model module.
 * @module model/SasbScoresAll
 * @version 0.20.0
 */
class SasbScoresAll {
    /**
     * Constructs a new <code>SasbScoresAll</code>.
     * @alias module:model/SasbScoresAll
     */
    constructor() { 
        
        SasbScoresAll.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SasbScoresAll</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SasbScoresAll} obj Optional instance to populate.
     * @return {module:model/SasbScoresAll} The populated <code>SasbScoresAll</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SasbScoresAll();

            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('scoreType')) {
                obj['scoreType'] = ApiClient.convertToType(data['scoreType'], 'String');
            }
            if (data.hasOwnProperty('accessAndAffordability')) {
                obj['accessAndAffordability'] = ApiClient.convertToType(data['accessAndAffordability'], 'Number');
            }
            if (data.hasOwnProperty('airQuality')) {
                obj['airQuality'] = ApiClient.convertToType(data['airQuality'], 'Number');
            }
            if (data.hasOwnProperty('allCategories')) {
                obj['allCategories'] = ApiClient.convertToType(data['allCategories'], Object);
            }
            if (data.hasOwnProperty('businessEthics')) {
                obj['businessEthics'] = ApiClient.convertToType(data['businessEthics'], 'Number');
            }
            if (data.hasOwnProperty('businessModelResilience')) {
                obj['businessModelResilience'] = ApiClient.convertToType(data['businessModelResilience'], 'Number');
            }
            if (data.hasOwnProperty('competitiveBehavior')) {
                obj['competitiveBehavior'] = ApiClient.convertToType(data['competitiveBehavior'], 'Number');
            }
            if (data.hasOwnProperty('criticalIncidentRiskManagement')) {
                obj['criticalIncidentRiskManagement'] = ApiClient.convertToType(data['criticalIncidentRiskManagement'], 'Number');
            }
            if (data.hasOwnProperty('customerPrivacy')) {
                obj['customerPrivacy'] = ApiClient.convertToType(data['customerPrivacy'], 'Number');
            }
            if (data.hasOwnProperty('customerWelfare')) {
                obj['customerWelfare'] = ApiClient.convertToType(data['customerWelfare'], 'Number');
            }
            if (data.hasOwnProperty('dataSecurity')) {
                obj['dataSecurity'] = ApiClient.convertToType(data['dataSecurity'], 'Number');
            }
            if (data.hasOwnProperty('ecologicalImpacts')) {
                obj['ecologicalImpacts'] = ApiClient.convertToType(data['ecologicalImpacts'], 'Number');
            }
            if (data.hasOwnProperty('employeeEngagementDiversityandInclusion')) {
                obj['employeeEngagementDiversityandInclusion'] = ApiClient.convertToType(data['employeeEngagementDiversityandInclusion'], 'Number');
            }
            if (data.hasOwnProperty('employeeHealthAndSafety')) {
                obj['employeeHealthAndSafety'] = ApiClient.convertToType(data['employeeHealthAndSafety'], 'Number');
            }
            if (data.hasOwnProperty('energyManagement')) {
                obj['energyManagement'] = ApiClient.convertToType(data['energyManagement'], 'Number');
            }
            if (data.hasOwnProperty('gHGEmissions')) {
                obj['gHGEmissions'] = ApiClient.convertToType(data['gHGEmissions'], 'Number');
            }
            if (data.hasOwnProperty('humanRightsandCommunityRelations')) {
                obj['humanRightsandCommunityRelations'] = ApiClient.convertToType(data['humanRightsandCommunityRelations'], 'Number');
            }
            if (data.hasOwnProperty('laborPractices')) {
                obj['laborPractices'] = ApiClient.convertToType(data['laborPractices'], 'Number');
            }
            if (data.hasOwnProperty('managementOfTheLegalAndRegulatoryEnvironment')) {
                obj['managementOfTheLegalAndRegulatoryEnvironment'] = ApiClient.convertToType(data['managementOfTheLegalAndRegulatoryEnvironment'], 'Number');
            }
            if (data.hasOwnProperty('materialsSourcingAndEfficiency')) {
                obj['materialsSourcingAndEfficiency'] = ApiClient.convertToType(data['materialsSourcingAndEfficiency'], 'Number');
            }
            if (data.hasOwnProperty('materiality')) {
                obj['materiality'] = ApiClient.convertToType(data['materiality'], Object);
            }
            if (data.hasOwnProperty('physicalImpactsOfClimateChange')) {
                obj['physicalImpactsOfClimateChange'] = ApiClient.convertToType(data['physicalImpactsOfClimateChange'], 'Number');
            }
            if (data.hasOwnProperty('productQualityAndSafety')) {
                obj['productQualityAndSafety'] = ApiClient.convertToType(data['productQualityAndSafety'], 'Number');
            }
            if (data.hasOwnProperty('productDesignAndLifecycleManagement')) {
                obj['productDesignAndLifecycleManagement'] = ApiClient.convertToType(data['productDesignAndLifecycleManagement'], 'Number');
            }
            if (data.hasOwnProperty('sellingPracticesAndProductLabeling')) {
                obj['sellingPracticesAndProductLabeling'] = ApiClient.convertToType(data['sellingPracticesAndProductLabeling'], 'Number');
            }
            if (data.hasOwnProperty('supplyChainManagement')) {
                obj['supplyChainManagement'] = ApiClient.convertToType(data['supplyChainManagement'], 'Number');
            }
            if (data.hasOwnProperty('systemicRiskManagement')) {
                obj['systemicRiskManagement'] = ApiClient.convertToType(data['systemicRiskManagement'], 'Number');
            }
            if (data.hasOwnProperty('wasteAndHazardousMaterialsManagement')) {
                obj['wasteAndHazardousMaterialsManagement'] = ApiClient.convertToType(data['wasteAndHazardousMaterialsManagement'], 'Number');
            }
            if (data.hasOwnProperty('waterAndWastewaterManagement')) {
                obj['waterAndWastewaterManagement'] = ApiClient.convertToType(data['waterAndWastewaterManagement'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Date for the period requested expressed in YYYY-MM-DD format.
 * @member {Date} date
 */
SasbScoresAll.prototype['date'] = undefined;

/**
 * FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E).
 * @member {String} fsymId
 */
SasbScoresAll.prototype['fsymId'] = undefined;

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
SasbScoresAll.prototype['requestId'] = undefined;

/**
 * The name of the specific SASB Score type being shown in the response. This will be represented by the scoreTypes input: PULSE, INSIGHT, MOMENTUM, ART_VOL_TTM, CAT_VOL_TTM, or DYNAMIC_MAT.
 * @member {String} scoreType
 */
SasbScoresAll.prototype['scoreType'] = undefined;

/**
 * The Access and Affordability SASB Category.
 * @member {Number} accessAndAffordability
 */
SasbScoresAll.prototype['accessAndAffordability'] = undefined;

/**
 * The Air Quality SASB Category.
 * @member {Number} airQuality
 */
SasbScoresAll.prototype['airQuality'] = undefined;

/**
 * The All Categories Category. This represents the overall SASB Score for the given 'scoreType'. When scoreType = ESG_RANK, the data type will be string, otherwise data type will be a number with double format.
 * @member {Object} allCategories
 */
SasbScoresAll.prototype['allCategories'] = undefined;

/**
 * The Business Ethics Category.
 * @member {Number} businessEthics
 */
SasbScoresAll.prototype['businessEthics'] = undefined;

/**
 * The Business Model Resilience Category.
 * @member {Number} businessModelResilience
 */
SasbScoresAll.prototype['businessModelResilience'] = undefined;

/**
 * The Competitive Behavior Category.
 * @member {Number} competitiveBehavior
 */
SasbScoresAll.prototype['competitiveBehavior'] = undefined;

/**
 * The Critical Incident Risk Management Category.
 * @member {Number} criticalIncidentRiskManagement
 */
SasbScoresAll.prototype['criticalIncidentRiskManagement'] = undefined;

/**
 * The Customer Privacy Category.
 * @member {Number} customerPrivacy
 */
SasbScoresAll.prototype['customerPrivacy'] = undefined;

/**
 * The Customer Welfare Category.
 * @member {Number} customerWelfare
 */
SasbScoresAll.prototype['customerWelfare'] = undefined;

/**
 * The Data Security Category.
 * @member {Number} dataSecurity
 */
SasbScoresAll.prototype['dataSecurity'] = undefined;

/**
 * The Ecological Impacts Category.
 * @member {Number} ecologicalImpacts
 */
SasbScoresAll.prototype['ecologicalImpacts'] = undefined;

/**
 * The Employee Engagement Diversity and Inclusion Category.
 * @member {Number} employeeEngagementDiversityandInclusion
 */
SasbScoresAll.prototype['employeeEngagementDiversityandInclusion'] = undefined;

/**
 * The Employee Health And Safety Category.
 * @member {Number} employeeHealthAndSafety
 */
SasbScoresAll.prototype['employeeHealthAndSafety'] = undefined;

/**
 * The Energy Management Category.
 * @member {Number} energyManagement
 */
SasbScoresAll.prototype['energyManagement'] = undefined;

/**
 * The Greenhouse Gases Emissions Category.
 * @member {Number} gHGEmissions
 */
SasbScoresAll.prototype['gHGEmissions'] = undefined;

/**
 * The Human Rights and Community Relations Category.
 * @member {Number} humanRightsandCommunityRelations
 */
SasbScoresAll.prototype['humanRightsandCommunityRelations'] = undefined;

/**
 * The Labor Practices Category.
 * @member {Number} laborPractices
 */
SasbScoresAll.prototype['laborPractices'] = undefined;

/**
 * The Management of the Legal and Regulatory Environment Category.
 * @member {Number} managementOfTheLegalAndRegulatoryEnvironment
 */
SasbScoresAll.prototype['managementOfTheLegalAndRegulatoryEnvironment'] = undefined;

/**
 * The Materials Sourcing and Efficiency Category.
 * @member {Number} materialsSourcingAndEfficiency
 */
SasbScoresAll.prototype['materialsSourcingAndEfficiency'] = undefined;

/**
 * The Materiality Category. When scoreType = ESG_RANK, the data type will be string, otherwise data type will be a number with double format.
 * @member {Object} materiality
 */
SasbScoresAll.prototype['materiality'] = undefined;

/**
 * The Physical Impacts of Climate Change Category.
 * @member {Number} physicalImpactsOfClimateChange
 */
SasbScoresAll.prototype['physicalImpactsOfClimateChange'] = undefined;

/**
 * The Product Quality and Safety Category.
 * @member {Number} productQualityAndSafety
 */
SasbScoresAll.prototype['productQualityAndSafety'] = undefined;

/**
 * The Product Design And Lifecycle Management Category.
 * @member {Number} productDesignAndLifecycleManagement
 */
SasbScoresAll.prototype['productDesignAndLifecycleManagement'] = undefined;

/**
 * The Selling Practices And Product Labeling Category.
 * @member {Number} sellingPracticesAndProductLabeling
 */
SasbScoresAll.prototype['sellingPracticesAndProductLabeling'] = undefined;

/**
 * The Supply Chain Management Category.
 * @member {Number} supplyChainManagement
 */
SasbScoresAll.prototype['supplyChainManagement'] = undefined;

/**
 * The Systemic Risk Management Category.
 * @member {Number} systemicRiskManagement
 */
SasbScoresAll.prototype['systemicRiskManagement'] = undefined;

/**
 * The Waste and Hazardous Materials Management Category.
 * @member {Number} wasteAndHazardousMaterialsManagement
 */
SasbScoresAll.prototype['wasteAndHazardousMaterialsManagement'] = undefined;

/**
 * The Water and Wastewater Management Category.
 * @member {Number} waterAndWastewaterManagement
 */
SasbScoresAll.prototype['waterAndWastewaterManagement'] = undefined;






export default SasbScoresAll;

