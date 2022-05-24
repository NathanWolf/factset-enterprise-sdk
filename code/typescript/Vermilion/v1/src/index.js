/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import CreateScimUserJSONRequest from './model/CreateScimUserJSONRequest';
import CreatedScimUserJSONResponse from './model/CreatedScimUserJSONResponse';
import CreatedScimUserJSONResponseMeta from './model/CreatedScimUserJSONResponseMeta';
import DataSourceAllData from './model/DataSourceAllData';
import DataSourceDTO from './model/DataSourceDTO';
import DataSourceData from './model/DataSourceData';
import DataSourceDataInstance from './model/DataSourceDataInstance';
import DataSourceInstance from './model/DataSourceInstance';
import DataSourceInstanceRows from './model/DataSourceInstanceRows';
import DataSourceList from './model/DataSourceList';
import DataSourceListMeta from './model/DataSourceListMeta';
import DataSourceListMetaPagination from './model/DataSourceListMetaPagination';
import EntityDTO from './model/EntityDTO';
import EntityFieldValueDTO from './model/EntityFieldValueDTO';
import InlineObject from './model/InlineObject';
import InlineObject1 from './model/InlineObject1';
import InlineObject2 from './model/InlineObject2';
import InlineResponse400 from './model/InlineResponse400';
import InlineResponse4001 from './model/InlineResponse4001';
import InlineResponse4002 from './model/InlineResponse4002';
import InlineResponse4003 from './model/InlineResponse4003';
import InlineResponse4004 from './model/InlineResponse4004';
import InlineResponse401 from './model/InlineResponse401';
import InlineResponse4011 from './model/InlineResponse4011';
import InlineResponse403 from './model/InlineResponse403';
import InlineResponse4031 from './model/InlineResponse4031';
import InlineResponse4032 from './model/InlineResponse4032';
import InlineResponse4033 from './model/InlineResponse4033';
import InlineResponse4034 from './model/InlineResponse4034';
import InlineResponse4035 from './model/InlineResponse4035';
import InlineResponse4036 from './model/InlineResponse4036';
import InlineResponse4037 from './model/InlineResponse4037';
import InlineResponse4038 from './model/InlineResponse4038';
import InlineResponse404 from './model/InlineResponse404';
import InlineResponse4041 from './model/InlineResponse4041';
import InlineResponse4042 from './model/InlineResponse4042';
import InlineResponse4043 from './model/InlineResponse4043';
import InlineResponse4044 from './model/InlineResponse4044';
import InlineResponse406 from './model/InlineResponse406';
import InlineResponse409 from './model/InlineResponse409';
import InlineResponse4091 from './model/InlineResponse4091';
import RecordSetFieldValues from './model/RecordSetFieldValues';
import RecordSetFields from './model/RecordSetFields';
import ReportDefinitionDTO from './model/ReportDefinitionDTO';
import ReportDefinitionData from './model/ReportDefinitionData';
import ReportDefinitionList from './model/ReportDefinitionList';
import ReportInstanceDTO from './model/ReportInstanceDTO';
import ReportInstanceData from './model/ReportInstanceData';
import ReportInstanceDataResponse from './model/ReportInstanceDataResponse';
import ReportInstanceId from './model/ReportInstanceId';
import ReportInstanceList from './model/ReportInstanceList';
import ReportInstanceListMeta from './model/ReportInstanceListMeta';
import ReportInstanceLogDTO from './model/ReportInstanceLogDTO';
import ReportInstanceLogList from './model/ReportInstanceLogList';
import ReportRevisionDTO from './model/ReportRevisionDTO';
import ScimEmail from './model/ScimEmail';
import ScimGroup from './model/ScimGroup';
import ScimGroupListResponse from './model/ScimGroupListResponse';
import ScimGroupMember from './model/ScimGroupMember';
import ScimPhone from './model/ScimPhone';
import ScimPhoto from './model/ScimPhoto';
import ScimUser from './model/ScimUser';
import ScimUserListResponse from './model/ScimUserListResponse';
import ScimUserName from './model/ScimUserName';
import V1ReportInstancesGenerateVrs from './model/V1ReportInstancesGenerateVrs';
import V1ReportInstancesGenerateVrsInstanceId from './model/V1ReportInstancesGenerateVrsInstanceId';
import V1ReportInstancesGenerateVrsInstanceIdEntity from './model/V1ReportInstancesGenerateVrsInstanceIdEntity';
import DatasourceApi from './api/DatasourceApi';
import EntityApi from './api/EntityApi';
import ReportApi from './api/ReportApi';
import ReportInstanceApi from './api/ReportInstanceApi';
import SCIMApi from './api/SCIMApi';


/**
* Vermilion client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var vermilion = require('index'); // See note below*.
* var xxxSvc = new vermilion.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new vermilion.Yyy(); // Construct a model instance.
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
* var xxxSvc = new vermilion.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new vermilion.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 0.9.0
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The CreateScimUserJSONRequest model constructor.
     * @property {module:model/CreateScimUserJSONRequest}
     */
    CreateScimUserJSONRequest,

    /**
     * The CreatedScimUserJSONResponse model constructor.
     * @property {module:model/CreatedScimUserJSONResponse}
     */
    CreatedScimUserJSONResponse,

    /**
     * The CreatedScimUserJSONResponseMeta model constructor.
     * @property {module:model/CreatedScimUserJSONResponseMeta}
     */
    CreatedScimUserJSONResponseMeta,

    /**
     * The DataSourceAllData model constructor.
     * @property {module:model/DataSourceAllData}
     */
    DataSourceAllData,

    /**
     * The DataSourceDTO model constructor.
     * @property {module:model/DataSourceDTO}
     */
    DataSourceDTO,

    /**
     * The DataSourceData model constructor.
     * @property {module:model/DataSourceData}
     */
    DataSourceData,

    /**
     * The DataSourceDataInstance model constructor.
     * @property {module:model/DataSourceDataInstance}
     */
    DataSourceDataInstance,

    /**
     * The DataSourceInstance model constructor.
     * @property {module:model/DataSourceInstance}
     */
    DataSourceInstance,

    /**
     * The DataSourceInstanceRows model constructor.
     * @property {module:model/DataSourceInstanceRows}
     */
    DataSourceInstanceRows,

    /**
     * The DataSourceList model constructor.
     * @property {module:model/DataSourceList}
     */
    DataSourceList,

    /**
     * The DataSourceListMeta model constructor.
     * @property {module:model/DataSourceListMeta}
     */
    DataSourceListMeta,

    /**
     * The DataSourceListMetaPagination model constructor.
     * @property {module:model/DataSourceListMetaPagination}
     */
    DataSourceListMetaPagination,

    /**
     * The EntityDTO model constructor.
     * @property {module:model/EntityDTO}
     */
    EntityDTO,

    /**
     * The EntityFieldValueDTO model constructor.
     * @property {module:model/EntityFieldValueDTO}
     */
    EntityFieldValueDTO,

    /**
     * The InlineObject model constructor.
     * @property {module:model/InlineObject}
     */
    InlineObject,

    /**
     * The InlineObject1 model constructor.
     * @property {module:model/InlineObject1}
     */
    InlineObject1,

    /**
     * The InlineObject2 model constructor.
     * @property {module:model/InlineObject2}
     */
    InlineObject2,

    /**
     * The InlineResponse400 model constructor.
     * @property {module:model/InlineResponse400}
     */
    InlineResponse400,

    /**
     * The InlineResponse4001 model constructor.
     * @property {module:model/InlineResponse4001}
     */
    InlineResponse4001,

    /**
     * The InlineResponse4002 model constructor.
     * @property {module:model/InlineResponse4002}
     */
    InlineResponse4002,

    /**
     * The InlineResponse4003 model constructor.
     * @property {module:model/InlineResponse4003}
     */
    InlineResponse4003,

    /**
     * The InlineResponse4004 model constructor.
     * @property {module:model/InlineResponse4004}
     */
    InlineResponse4004,

    /**
     * The InlineResponse401 model constructor.
     * @property {module:model/InlineResponse401}
     */
    InlineResponse401,

    /**
     * The InlineResponse4011 model constructor.
     * @property {module:model/InlineResponse4011}
     */
    InlineResponse4011,

    /**
     * The InlineResponse403 model constructor.
     * @property {module:model/InlineResponse403}
     */
    InlineResponse403,

    /**
     * The InlineResponse4031 model constructor.
     * @property {module:model/InlineResponse4031}
     */
    InlineResponse4031,

    /**
     * The InlineResponse4032 model constructor.
     * @property {module:model/InlineResponse4032}
     */
    InlineResponse4032,

    /**
     * The InlineResponse4033 model constructor.
     * @property {module:model/InlineResponse4033}
     */
    InlineResponse4033,

    /**
     * The InlineResponse4034 model constructor.
     * @property {module:model/InlineResponse4034}
     */
    InlineResponse4034,

    /**
     * The InlineResponse4035 model constructor.
     * @property {module:model/InlineResponse4035}
     */
    InlineResponse4035,

    /**
     * The InlineResponse4036 model constructor.
     * @property {module:model/InlineResponse4036}
     */
    InlineResponse4036,

    /**
     * The InlineResponse4037 model constructor.
     * @property {module:model/InlineResponse4037}
     */
    InlineResponse4037,

    /**
     * The InlineResponse4038 model constructor.
     * @property {module:model/InlineResponse4038}
     */
    InlineResponse4038,

    /**
     * The InlineResponse404 model constructor.
     * @property {module:model/InlineResponse404}
     */
    InlineResponse404,

    /**
     * The InlineResponse4041 model constructor.
     * @property {module:model/InlineResponse4041}
     */
    InlineResponse4041,

    /**
     * The InlineResponse4042 model constructor.
     * @property {module:model/InlineResponse4042}
     */
    InlineResponse4042,

    /**
     * The InlineResponse4043 model constructor.
     * @property {module:model/InlineResponse4043}
     */
    InlineResponse4043,

    /**
     * The InlineResponse4044 model constructor.
     * @property {module:model/InlineResponse4044}
     */
    InlineResponse4044,

    /**
     * The InlineResponse406 model constructor.
     * @property {module:model/InlineResponse406}
     */
    InlineResponse406,

    /**
     * The InlineResponse409 model constructor.
     * @property {module:model/InlineResponse409}
     */
    InlineResponse409,

    /**
     * The InlineResponse4091 model constructor.
     * @property {module:model/InlineResponse4091}
     */
    InlineResponse4091,

    /**
     * The RecordSetFieldValues model constructor.
     * @property {module:model/RecordSetFieldValues}
     */
    RecordSetFieldValues,

    /**
     * The RecordSetFields model constructor.
     * @property {module:model/RecordSetFields}
     */
    RecordSetFields,

    /**
     * The ReportDefinitionDTO model constructor.
     * @property {module:model/ReportDefinitionDTO}
     */
    ReportDefinitionDTO,

    /**
     * The ReportDefinitionData model constructor.
     * @property {module:model/ReportDefinitionData}
     */
    ReportDefinitionData,

    /**
     * The ReportDefinitionList model constructor.
     * @property {module:model/ReportDefinitionList}
     */
    ReportDefinitionList,

    /**
     * The ReportInstanceDTO model constructor.
     * @property {module:model/ReportInstanceDTO}
     */
    ReportInstanceDTO,

    /**
     * The ReportInstanceData model constructor.
     * @property {module:model/ReportInstanceData}
     */
    ReportInstanceData,

    /**
     * The ReportInstanceDataResponse model constructor.
     * @property {module:model/ReportInstanceDataResponse}
     */
    ReportInstanceDataResponse,

    /**
     * The ReportInstanceId model constructor.
     * @property {module:model/ReportInstanceId}
     */
    ReportInstanceId,

    /**
     * The ReportInstanceList model constructor.
     * @property {module:model/ReportInstanceList}
     */
    ReportInstanceList,

    /**
     * The ReportInstanceListMeta model constructor.
     * @property {module:model/ReportInstanceListMeta}
     */
    ReportInstanceListMeta,

    /**
     * The ReportInstanceLogDTO model constructor.
     * @property {module:model/ReportInstanceLogDTO}
     */
    ReportInstanceLogDTO,

    /**
     * The ReportInstanceLogList model constructor.
     * @property {module:model/ReportInstanceLogList}
     */
    ReportInstanceLogList,

    /**
     * The ReportRevisionDTO model constructor.
     * @property {module:model/ReportRevisionDTO}
     */
    ReportRevisionDTO,

    /**
     * The ScimEmail model constructor.
     * @property {module:model/ScimEmail}
     */
    ScimEmail,

    /**
     * The ScimGroup model constructor.
     * @property {module:model/ScimGroup}
     */
    ScimGroup,

    /**
     * The ScimGroupListResponse model constructor.
     * @property {module:model/ScimGroupListResponse}
     */
    ScimGroupListResponse,

    /**
     * The ScimGroupMember model constructor.
     * @property {module:model/ScimGroupMember}
     */
    ScimGroupMember,

    /**
     * The ScimPhone model constructor.
     * @property {module:model/ScimPhone}
     */
    ScimPhone,

    /**
     * The ScimPhoto model constructor.
     * @property {module:model/ScimPhoto}
     */
    ScimPhoto,

    /**
     * The ScimUser model constructor.
     * @property {module:model/ScimUser}
     */
    ScimUser,

    /**
     * The ScimUserListResponse model constructor.
     * @property {module:model/ScimUserListResponse}
     */
    ScimUserListResponse,

    /**
     * The ScimUserName model constructor.
     * @property {module:model/ScimUserName}
     */
    ScimUserName,

    /**
     * The V1ReportInstancesGenerateVrs model constructor.
     * @property {module:model/V1ReportInstancesGenerateVrs}
     */
    V1ReportInstancesGenerateVrs,

    /**
     * The V1ReportInstancesGenerateVrsInstanceId model constructor.
     * @property {module:model/V1ReportInstancesGenerateVrsInstanceId}
     */
    V1ReportInstancesGenerateVrsInstanceId,

    /**
     * The V1ReportInstancesGenerateVrsInstanceIdEntity model constructor.
     * @property {module:model/V1ReportInstancesGenerateVrsInstanceIdEntity}
     */
    V1ReportInstancesGenerateVrsInstanceIdEntity,

    /**
    * The DatasourceApi service constructor.
    * @property {module:api/DatasourceApi}
    */
    DatasourceApi,

    /**
    * The EntityApi service constructor.
    * @property {module:api/EntityApi}
    */
    EntityApi,

    /**
    * The ReportApi service constructor.
    * @property {module:api/ReportApi}
    */
    ReportApi,

    /**
    * The ReportInstanceApi service constructor.
    * @property {module:api/ReportInstanceApi}
    */
    ReportInstanceApi,

    /**
    * The SCIMApi service constructor.
    * @property {module:api/SCIMApi}
    */
    SCIMApi
};
