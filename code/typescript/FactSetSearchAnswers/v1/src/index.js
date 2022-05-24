/**
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: FactSearch.Team@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import AdaptiveCardAnswerSuccessResponse from './model/AdaptiveCardAnswerSuccessResponse';
import AdaptiveCardDataItem from './model/AdaptiveCardDataItem';
import AdaptiveCardWithThumbnail from './model/AdaptiveCardWithThumbnail';
import Answer from './model/Answer';
import AnswerAllOf from './model/AnswerAllOf';
import AnswerFailureResponse from './model/AnswerFailureResponse';
import AnswerWithoutData from './model/AnswerWithoutData';
import AnswerWithoutDataAllOf from './model/AnswerWithoutDataAllOf';
import AnswerWithoutDataAllOfTemplateData from './model/AnswerWithoutDataAllOfTemplateData';
import ApplicationLink from './model/ApplicationLink';
import ChangeColor from './model/ChangeColor';
import ColoredValue from './model/ColoredValue';
import ColoredValueLabelDateTemplate from './model/ColoredValueLabelDateTemplate';
import ColoredValueLabelDateTemplateAllOf from './model/ColoredValueLabelDateTemplateAllOf';
import CountryID from './model/CountryID';
import DataAnswer from './model/DataAnswer';
import DataAnswerData from './model/DataAnswerData';
import DataAnswerSuccessResponse from './model/DataAnswerSuccessResponse';
import DataPair from './model/DataPair';
import Error from './model/Error';
import ErrorLink from './model/ErrorLink';
import ErrorSource from './model/ErrorSource';
import Fdc3Context from './model/Fdc3Context';
import Fdc3Country from './model/Fdc3Country';
import Fdc3Instrument from './model/Fdc3Instrument';
import InstrumentID from './model/InstrumentID';
import LabelValueChangeLabelValueChangeTemplate from './model/LabelValueChangeLabelValueChangeTemplate';
import LabelValueChangeLabelValueChangeTemplateAllOf from './model/LabelValueChangeLabelValueChangeTemplateAllOf';
import LinkTextBlockTemplate from './model/LinkTextBlockTemplate';
import LinkTextBlockTemplateAllOf from './model/LinkTextBlockTemplateAllOf';
import NoAnswersFound from './model/NoAnswersFound';
import NoAnswersFoundAllOf from './model/NoAnswersFoundAllOf';
import PercentChange from './model/PercentChange';
import PercentChangeLabelTemplate from './model/PercentChangeLabelTemplate';
import PercentChangeLabelTemplateAllOf from './model/PercentChangeLabelTemplateAllOf';
import RankedTable from './model/RankedTable';
import RankedTableEntity from './model/RankedTableEntity';
import RankedTableRow from './model/RankedTableRow';
import RankedTableTemplate from './model/RankedTableTemplate';
import RankedTableTemplateAllOf from './model/RankedTableTemplateAllOf';
import Table from './model/Table';
import TableTableTemplate from './model/TableTableTemplate';
import TableTableTemplateAllOf from './model/TableTableTemplateAllOf';
import TableTemplate from './model/TableTemplate';
import TableTemplateAllOf from './model/TableTemplateAllOf';
import Template from './model/Template';
import TemplateData from './model/TemplateData';
import TemplateWithLinks from './model/TemplateWithLinks';
import TemplateWithLinksAllOf from './model/TemplateWithLinksAllOf';
import TextBlockFootingTemplate from './model/TextBlockFootingTemplate';
import TextBlockFootingTemplateAllOf from './model/TextBlockFootingTemplateAllOf';
import TitledTextBlock from './model/TitledTextBlock';
import ValueChange from './model/ValueChange';
import ValueChangeDateLabelTemplate from './model/ValueChangeDateLabelTemplate';
import ValueChangeDateLabelTemplateAllOf from './model/ValueChangeDateLabelTemplateAllOf';
import ValueColor from './model/ValueColor';
import ValueLabelDateDataPairListTemplate from './model/ValueLabelDateDataPairListTemplate';
import ValueLabelDateDataPairListTemplateAllOf from './model/ValueLabelDateDataPairListTemplateAllOf';
import ValueLabelDateTemplate from './model/ValueLabelDateTemplate';
import ValueLabelDateTemplateAllOf from './model/ValueLabelDateTemplateAllOf';
import ValueLabelDateTextBlockTemplate from './model/ValueLabelDateTextBlockTemplate';
import ValueLabelDateTextBlockTemplateAllOf from './model/ValueLabelDateTextBlockTemplateAllOf';
import ValueLabelTemplate from './model/ValueLabelTemplate';
import ValueLabelTemplateAllOf from './model/ValueLabelTemplateAllOf';

import AnswersApi from './api/AnswersApi';


/**
* FactSet Search Answers client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var factsetsearchanswers = require('index'); // See note below*.
* var xxxSvc = new factsetsearchanswers.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new factsetsearchanswers.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new factsetsearchanswers.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new factsetsearchanswers.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 0.20.0
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The AdaptiveCardAnswerSuccessResponse model constructor.
     * @property {module:model/AdaptiveCardAnswerSuccessResponse}
     */
    AdaptiveCardAnswerSuccessResponse,

    /**
     * The AdaptiveCardDataItem model constructor.
     * @property {module:model/AdaptiveCardDataItem}
     */
    AdaptiveCardDataItem,

    /**
     * The AdaptiveCardWithThumbnail model constructor.
     * @property {module:model/AdaptiveCardWithThumbnail}
     */
    AdaptiveCardWithThumbnail,

    /**
     * The Answer model constructor.
     * @property {module:model/Answer}
     */
    Answer,

    /**
     * The AnswerAllOf model constructor.
     * @property {module:model/AnswerAllOf}
     */
    AnswerAllOf,

    /**
     * The AnswerFailureResponse model constructor.
     * @property {module:model/AnswerFailureResponse}
     */
    AnswerFailureResponse,

    /**
     * The AnswerWithoutData model constructor.
     * @property {module:model/AnswerWithoutData}
     */
    AnswerWithoutData,

    /**
     * The AnswerWithoutDataAllOf model constructor.
     * @property {module:model/AnswerWithoutDataAllOf}
     */
    AnswerWithoutDataAllOf,

    /**
     * The AnswerWithoutDataAllOfTemplateData model constructor.
     * @property {module:model/AnswerWithoutDataAllOfTemplateData}
     */
    AnswerWithoutDataAllOfTemplateData,

    /**
     * The ApplicationLink model constructor.
     * @property {module:model/ApplicationLink}
     */
    ApplicationLink,

    /**
     * The ChangeColor model constructor.
     * @property {module:model/ChangeColor}
     */
    ChangeColor,

    /**
     * The ColoredValue model constructor.
     * @property {module:model/ColoredValue}
     */
    ColoredValue,

    /**
     * The ColoredValueLabelDateTemplate model constructor.
     * @property {module:model/ColoredValueLabelDateTemplate}
     */
    ColoredValueLabelDateTemplate,

    /**
     * The ColoredValueLabelDateTemplateAllOf model constructor.
     * @property {module:model/ColoredValueLabelDateTemplateAllOf}
     */
    ColoredValueLabelDateTemplateAllOf,

    /**
     * The CountryID model constructor.
     * @property {module:model/CountryID}
     */
    CountryID,

    /**
     * The DataAnswer model constructor.
     * @property {module:model/DataAnswer}
     */
    DataAnswer,

    /**
     * The DataAnswerData model constructor.
     * @property {module:model/DataAnswerData}
     */
    DataAnswerData,

    /**
     * The DataAnswerSuccessResponse model constructor.
     * @property {module:model/DataAnswerSuccessResponse}
     */
    DataAnswerSuccessResponse,

    /**
     * The DataPair model constructor.
     * @property {module:model/DataPair}
     */
    DataPair,

    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error,

    /**
     * The ErrorLink model constructor.
     * @property {module:model/ErrorLink}
     */
    ErrorLink,

    /**
     * The ErrorSource model constructor.
     * @property {module:model/ErrorSource}
     */
    ErrorSource,

    /**
     * The Fdc3Context model constructor.
     * @property {module:model/Fdc3Context}
     */
    Fdc3Context,

    /**
     * The Fdc3Country model constructor.
     * @property {module:model/Fdc3Country}
     */
    Fdc3Country,

    /**
     * The Fdc3Instrument model constructor.
     * @property {module:model/Fdc3Instrument}
     */
    Fdc3Instrument,

    /**
     * The InstrumentID model constructor.
     * @property {module:model/InstrumentID}
     */
    InstrumentID,

    /**
     * The LabelValueChangeLabelValueChangeTemplate model constructor.
     * @property {module:model/LabelValueChangeLabelValueChangeTemplate}
     */
    LabelValueChangeLabelValueChangeTemplate,

    /**
     * The LabelValueChangeLabelValueChangeTemplateAllOf model constructor.
     * @property {module:model/LabelValueChangeLabelValueChangeTemplateAllOf}
     */
    LabelValueChangeLabelValueChangeTemplateAllOf,

    /**
     * The LinkTextBlockTemplate model constructor.
     * @property {module:model/LinkTextBlockTemplate}
     */
    LinkTextBlockTemplate,

    /**
     * The LinkTextBlockTemplateAllOf model constructor.
     * @property {module:model/LinkTextBlockTemplateAllOf}
     */
    LinkTextBlockTemplateAllOf,

    /**
     * The NoAnswersFound model constructor.
     * @property {module:model/NoAnswersFound}
     */
    NoAnswersFound,

    /**
     * The NoAnswersFoundAllOf model constructor.
     * @property {module:model/NoAnswersFoundAllOf}
     */
    NoAnswersFoundAllOf,

    /**
     * The PercentChange model constructor.
     * @property {module:model/PercentChange}
     */
    PercentChange,

    /**
     * The PercentChangeLabelTemplate model constructor.
     * @property {module:model/PercentChangeLabelTemplate}
     */
    PercentChangeLabelTemplate,

    /**
     * The PercentChangeLabelTemplateAllOf model constructor.
     * @property {module:model/PercentChangeLabelTemplateAllOf}
     */
    PercentChangeLabelTemplateAllOf,

    /**
     * The RankedTable model constructor.
     * @property {module:model/RankedTable}
     */
    RankedTable,

    /**
     * The RankedTableEntity model constructor.
     * @property {module:model/RankedTableEntity}
     */
    RankedTableEntity,

    /**
     * The RankedTableRow model constructor.
     * @property {module:model/RankedTableRow}
     */
    RankedTableRow,

    /**
     * The RankedTableTemplate model constructor.
     * @property {module:model/RankedTableTemplate}
     */
    RankedTableTemplate,

    /**
     * The RankedTableTemplateAllOf model constructor.
     * @property {module:model/RankedTableTemplateAllOf}
     */
    RankedTableTemplateAllOf,

    /**
     * The Table model constructor.
     * @property {module:model/Table}
     */
    Table,

    /**
     * The TableTableTemplate model constructor.
     * @property {module:model/TableTableTemplate}
     */
    TableTableTemplate,

    /**
     * The TableTableTemplateAllOf model constructor.
     * @property {module:model/TableTableTemplateAllOf}
     */
    TableTableTemplateAllOf,

    /**
     * The TableTemplate model constructor.
     * @property {module:model/TableTemplate}
     */
    TableTemplate,

    /**
     * The TableTemplateAllOf model constructor.
     * @property {module:model/TableTemplateAllOf}
     */
    TableTemplateAllOf,

    /**
     * The Template model constructor.
     * @property {module:model/Template}
     */
    Template,

    /**
     * The TemplateData model constructor.
     * @property {module:model/TemplateData}
     */
    TemplateData,

    /**
     * The TemplateWithLinks model constructor.
     * @property {module:model/TemplateWithLinks}
     */
    TemplateWithLinks,

    /**
     * The TemplateWithLinksAllOf model constructor.
     * @property {module:model/TemplateWithLinksAllOf}
     */
    TemplateWithLinksAllOf,

    /**
     * The TextBlockFootingTemplate model constructor.
     * @property {module:model/TextBlockFootingTemplate}
     */
    TextBlockFootingTemplate,

    /**
     * The TextBlockFootingTemplateAllOf model constructor.
     * @property {module:model/TextBlockFootingTemplateAllOf}
     */
    TextBlockFootingTemplateAllOf,

    /**
     * The TitledTextBlock model constructor.
     * @property {module:model/TitledTextBlock}
     */
    TitledTextBlock,

    /**
     * The ValueChange model constructor.
     * @property {module:model/ValueChange}
     */
    ValueChange,

    /**
     * The ValueChangeDateLabelTemplate model constructor.
     * @property {module:model/ValueChangeDateLabelTemplate}
     */
    ValueChangeDateLabelTemplate,

    /**
     * The ValueChangeDateLabelTemplateAllOf model constructor.
     * @property {module:model/ValueChangeDateLabelTemplateAllOf}
     */
    ValueChangeDateLabelTemplateAllOf,

    /**
     * The ValueColor model constructor.
     * @property {module:model/ValueColor}
     */
    ValueColor,

    /**
     * The ValueLabelDateDataPairListTemplate model constructor.
     * @property {module:model/ValueLabelDateDataPairListTemplate}
     */
    ValueLabelDateDataPairListTemplate,

    /**
     * The ValueLabelDateDataPairListTemplateAllOf model constructor.
     * @property {module:model/ValueLabelDateDataPairListTemplateAllOf}
     */
    ValueLabelDateDataPairListTemplateAllOf,

    /**
     * The ValueLabelDateTemplate model constructor.
     * @property {module:model/ValueLabelDateTemplate}
     */
    ValueLabelDateTemplate,

    /**
     * The ValueLabelDateTemplateAllOf model constructor.
     * @property {module:model/ValueLabelDateTemplateAllOf}
     */
    ValueLabelDateTemplateAllOf,

    /**
     * The ValueLabelDateTextBlockTemplate model constructor.
     * @property {module:model/ValueLabelDateTextBlockTemplate}
     */
    ValueLabelDateTextBlockTemplate,

    /**
     * The ValueLabelDateTextBlockTemplateAllOf model constructor.
     * @property {module:model/ValueLabelDateTextBlockTemplateAllOf}
     */
    ValueLabelDateTextBlockTemplateAllOf,

    /**
     * The ValueLabelTemplate model constructor.
     * @property {module:model/ValueLabelTemplate}
     */
    ValueLabelTemplate,

    /**
     * The ValueLabelTemplateAllOf model constructor.
     * @property {module:model/ValueLabelTemplateAllOf}
     */
    ValueLabelTemplateAllOf,

    /**
    * The AnswersApi service constructor.
    * @property {module:api/AnswersApi}
    */
    AnswersApi,

};
