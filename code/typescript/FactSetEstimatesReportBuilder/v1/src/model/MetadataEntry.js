/**
 * FactSet Estimates Report Builder
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import Category from './Category';
import CategoryCategory from './CategoryCategory';
import CurrencyCode from './CurrencyCode';
import CurrencyCodeCurrencyCode from './CurrencyCodeCurrencyCode';
import CurrencySymbol from './CurrencySymbol';
import CurrencySymbolCurrencySymbol from './CurrencySymbolCurrencySymbol';
import Description from './Description';
import DescriptionDescription from './DescriptionDescription';
import Frequency from './Frequency';
import FrequencyFrequency from './FrequencyFrequency';
import MetricEstimates from './MetricEstimates';
import MetricEstimatesMetricEstimates from './MetricEstimatesMetricEstimates';
import Scale from './Scale';
import ScaleScale from './ScaleScale';
import ValueType from './ValueType';
import ValueTypeValueType from './ValueTypeValueType';

/**
 * The MetadataEntry model module.
 * @module model/MetadataEntry
 * @version 0.9.0
 */
class MetadataEntry {
    /**
     * Constructs a new <code>MetadataEntry</code>.
     * Restricted metadata entries. Restricts the possible key in the following STACH schema: - RowOrganizedPackage.CellDetail.CellMetadataEntry - RowOrganizedPackage.HeaderCellDetail.CellMetadataEntry - RowOrganizedPackage.MapOfMetadata.ItemsEntry - RowOrganizedPackage.Row.RowMetadataEntry - RowOrganizedPackage.TableData.TableMetadataEntry  And sets restrictions on the possible values for a MetadataItem. 
     * @alias module:model/MetadataEntry
     * @implements module:model/CurrencyCode
     * @implements module:model/CurrencySymbol
     * @implements module:model/Category
     * @implements module:model/MetricEstimates
     * @implements module:model/ValueType
     * @implements module:model/Scale
     * @implements module:model/Description
     * @implements module:model/Frequency
     */
    constructor() { 
        CurrencyCode.initialize(this);CurrencySymbol.initialize(this);Category.initialize(this);MetricEstimates.initialize(this);ValueType.initialize(this);Scale.initialize(this);Description.initialize(this);Frequency.initialize(this);
        MetadataEntry.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MetadataEntry</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MetadataEntry} obj Optional instance to populate.
     * @return {module:model/MetadataEntry} The populated <code>MetadataEntry</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MetadataEntry();
            CurrencyCode.constructFromObject(data, obj);
            CurrencySymbol.constructFromObject(data, obj);
            Category.constructFromObject(data, obj);
            MetricEstimates.constructFromObject(data, obj);
            ValueType.constructFromObject(data, obj);
            Scale.constructFromObject(data, obj);
            Description.constructFromObject(data, obj);
            Frequency.constructFromObject(data, obj);

            if (data.hasOwnProperty('currencyCode')) {
                obj['currencyCode'] = CurrencyCodeCurrencyCode.constructFromObject(data['currencyCode']);
            }
            if (data.hasOwnProperty('currencySymbol')) {
                obj['currencySymbol'] = CurrencySymbolCurrencySymbol.constructFromObject(data['currencySymbol']);
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = CategoryCategory.constructFromObject(data['category']);
            }
            if (data.hasOwnProperty('metricEstimates')) {
                obj['metricEstimates'] = MetricEstimatesMetricEstimates.constructFromObject(data['metricEstimates']);
            }
            if (data.hasOwnProperty('valueType')) {
                obj['valueType'] = ValueTypeValueType.constructFromObject(data['valueType']);
            }
            if (data.hasOwnProperty('scale')) {
                obj['scale'] = ScaleScale.constructFromObject(data['scale']);
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = DescriptionDescription.constructFromObject(data['description']);
            }
            if (data.hasOwnProperty('frequency')) {
                obj['frequency'] = FrequencyFrequency.constructFromObject(data['frequency']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/CurrencyCodeCurrencyCode} currencyCode
 */
MetadataEntry.prototype['currencyCode'] = undefined;

/**
 * @member {module:model/CurrencySymbolCurrencySymbol} currencySymbol
 */
MetadataEntry.prototype['currencySymbol'] = undefined;

/**
 * @member {module:model/CategoryCategory} category
 */
MetadataEntry.prototype['category'] = undefined;

/**
 * @member {module:model/MetricEstimatesMetricEstimates} metricEstimates
 */
MetadataEntry.prototype['metricEstimates'] = undefined;

/**
 * @member {module:model/ValueTypeValueType} valueType
 */
MetadataEntry.prototype['valueType'] = undefined;

/**
 * @member {module:model/ScaleScale} scale
 */
MetadataEntry.prototype['scale'] = undefined;

/**
 * @member {module:model/DescriptionDescription} description
 */
MetadataEntry.prototype['description'] = undefined;

/**
 * @member {module:model/FrequencyFrequency} frequency
 */
MetadataEntry.prototype['frequency'] = undefined;


// Implement CurrencyCode interface:
/**
 * @member {module:model/CurrencyCodeCurrencyCode} currencyCode
 */
CurrencyCode.prototype['currencyCode'] = undefined;
// Implement CurrencySymbol interface:
/**
 * @member {module:model/CurrencySymbolCurrencySymbol} currencySymbol
 */
CurrencySymbol.prototype['currencySymbol'] = undefined;
// Implement Category interface:
/**
 * @member {module:model/CategoryCategory} category
 */
Category.prototype['category'] = undefined;
// Implement MetricEstimates interface:
/**
 * @member {module:model/MetricEstimatesMetricEstimates} metricEstimates
 */
MetricEstimates.prototype['metricEstimates'] = undefined;
// Implement ValueType interface:
/**
 * @member {module:model/ValueTypeValueType} valueType
 */
ValueType.prototype['valueType'] = undefined;
// Implement Scale interface:
/**
 * @member {module:model/ScaleScale} scale
 */
Scale.prototype['scale'] = undefined;
// Implement Description interface:
/**
 * @member {module:model/DescriptionDescription} description
 */
Description.prototype['description'] = undefined;
// Implement Frequency interface:
/**
 * @member {module:model/FrequencyFrequency} frequency
 */
Frequency.prototype['frequency'] = undefined;




export default MetadataEntry;

