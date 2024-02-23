/**
 * FactSet Formula API
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs. 
 *
 * The version of the OpenAPI document: 1.7.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CrossSectionalResultObjectNonflattenedWarnings model module.
 * @module model/CrossSectionalResultObjectNonflattenedWarnings
 */
class CrossSectionalResultObjectNonflattenedWarnings {
    /**
     * Constructs a new <code>CrossSectionalResultObjectNonflattenedWarnings</code>.
     * @alias module:model/CrossSectionalResultObjectNonflattenedWarnings
     */
    constructor() { 
        
        CrossSectionalResultObjectNonflattenedWarnings.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CrossSectionalResultObjectNonflattenedWarnings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CrossSectionalResultObjectNonflattenedWarnings} obj Optional instance to populate.
     * @return {module:model/CrossSectionalResultObjectNonflattenedWarnings} The populated <code>CrossSectionalResultObjectNonflattenedWarnings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CrossSectionalResultObjectNonflattenedWarnings();

            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('effect')) {
                obj['effect'] = ApiClient.convertToType(data['effect'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Human readable message explaining the warning
 * @member {String} description
 */
CrossSectionalResultObjectNonflattenedWarnings.prototype['description'] = undefined;

/**
 * Human readable message explaining the effect on the `result`
 * @member {String} effect
 */
CrossSectionalResultObjectNonflattenedWarnings.prototype['effect'] = undefined;






export default CrossSectionalResultObjectNonflattenedWarnings;

