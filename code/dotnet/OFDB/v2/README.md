[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# OFDB client library for .NET

[![Nuget](https://img.shields.io/nuget/v/FactSet.SDK.OFDB)](https://www.nuget.org/packages/FactSet.SDK.OFDB)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

OFDB API

This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.1.0
- Package version: 0.31.0
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.OFDB -v 0.31.0
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.OFDB -Version 0.31.0
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup [.NET Standard 2.0](https://docs.microsoft.com/en-us/dotnet/standard/net-standard?tabs=net-standard-2-0) compatible environment.
3. [Install dependencies](#installation).
4. Run the following:

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OFDB.Api;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;

namespace Example
{
    public static class AddDatesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OFDB.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new AddApi(config);
            var path = "path_example";  // string | Encode database path
            var addDates = new AddDates(); // AddDates | Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.

            try
            {
                InlineResponse202 result = apiInstance.AddDates(path, addDates);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling AddApi.AddDates: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Using a Proxy

To use the API client with a HTTP proxy, setup a `System.Net.WebProxy`

```csharp
Configuration c = new Configuration();
System.Net.WebProxy webProxy = new System.Net.WebProxy("http://myProxyUrl:80/");
webProxy.Credentials = System.Net.CredentialCache.DefaultCredentials;
c.Proxy = webProxy;
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/analytics/ofdb/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddApi* | [**AddDates**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/AddApi.md#adddates) | **POST** /database/{path}/dates | 
*AddApi* | [**AddFields**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/AddApi.md#addfields) | **POST** /database/{path}/fields | 
*AddApi* | [**AddSymbols**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/AddApi.md#addsymbols) | **POST** /database/{path}/symbols | 
*CreateApi* | [**CreateDatabase**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/CreateApi.md#createdatabase) | **POST** /database | 
*DeleteApi* | [**DeleteBulkItems**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/DeleteApi.md#deletebulkitems) | **POST** /database/{path}/delete | 
*DeleteApi* | [**DeleteDate**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/DeleteApi.md#deletedate) | **DELETE** /database/{path}/dates/{date} | 
*DeleteApi* | [**DeleteDateFromSymbol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/DeleteApi.md#deletedatefromsymbol) | **DELETE** /database/{path}/dates/{date}/symbols/{symbol} | 
*DeleteApi* | [**DeleteSymbol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/DeleteApi.md#deletesymbol) | **DELETE** /database/{path}/symbols/{symbol} | 
*GetApi* | [**GetAudit**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/GetApi.md#getaudit) | **GET** /database/{path}/audit | 
*GetApi* | [**GetData**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/GetApi.md#getdata) | **GET** /database/{path} | 
*GetApi* | [**GetDates**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/GetApi.md#getdates) | **GET** /database/{path}/dates | 
*GetApi* | [**GetFields**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/GetApi.md#getfields) | **GET** /database/{path}/fields | 
*GetApi* | [**GetStats**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/GetApi.md#getstats) | **GET** /database/{path}/stats | 
*GetApi* | [**GetSymbols**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/GetApi.md#getsymbols) | **GET** /database/{path}/symbols | 
*LongRunningApi* | [**GetResourceDeleteBulkItems**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcedeletebulkitems) | **GET** /database/{path}/delete/jobs/post/{id} | 
*LongRunningApi* | [**GetResourceDeleteDate**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcedeletedate) | **GET** /database/{path}/dates/{date}/jobs/delete/{id} | 
*LongRunningApi* | [**GetResourceDeleteDateFromSymbol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcedeletedatefromsymbol) | **GET** /database/{path}/dates/{date}/symbols/{symbol}/jobs/delete/{id} | 
*LongRunningApi* | [**GetResourceDeleteSymbol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcedeletesymbol) | **GET** /database/{path}/symbols/{symbol}/jobs/delete/{id} | 
*LongRunningApi* | [**GetResourceGetAudit**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcegetaudit) | **GET** /database/{path}/audit/jobs/get/{id} | 
*LongRunningApi* | [**GetResourceGetData**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcegetdata) | **GET** /database/{path}/jobs/get/{id} | 
*LongRunningApi* | [**GetResourceGetDates**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcegetdates) | **GET** /database/{path}/dates/jobs/get/{id} | 
*LongRunningApi* | [**GetResourceGetFields**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcegetfields) | **GET** /database/{path}/fields/jobs/get/{id} | 
*LongRunningApi* | [**GetResourceGetStats**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcegetstats) | **GET** /database/{path}/stats/jobs/get/{id} | 
*LongRunningApi* | [**GetResourceGetSymbols**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcegetsymbols) | **GET** /database/{path}/symbols/jobs/get/{id} | 
*LongRunningApi* | [**GetResourcePostDatabase**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcepostdatabase) | **GET** /database/jobs/post/{id} | 
*LongRunningApi* | [**GetResourcePostDates**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcepostdates) | **GET** /database/{path}/dates/jobs/post/{id} | 
*LongRunningApi* | [**GetResourcePostFields**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcepostfields) | **GET** /database/{path}/fields/jobs/post/{id} | 
*LongRunningApi* | [**GetResourcePostSymbols**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourcepostsymbols) | **GET** /database/{path}/symbols/jobs/post/{id} | 
*LongRunningApi* | [**GetResourcePutDate**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourceputdate) | **GET** /database/{path}/dates/{date}/jobs/put/{id} | 
*LongRunningApi* | [**GetResourcePutDates**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourceputdates) | **GET** /database/{path}/dates/jobs/put/{id} | 
*LongRunningApi* | [**GetResourcePutSymbol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourceputsymbol) | **GET** /database/{path}/symbols/{symbol}/jobs/put/{id} | 
*LongRunningApi* | [**GetResourcePutSymbols**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getresourceputsymbols) | **GET** /database/{path}/symbols/jobs/put/{id} | 
*LongRunningApi* | [**GetStatus**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/LongRunningApi.md#getstatus) | **GET** /database/jobs/{id}/status | 
*UpdateApi* | [**UpdateDate**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/UpdateApi.md#updatedate) | **PUT** /database/{path}/dates/{date} | 
*UpdateApi* | [**UpdateDates**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/UpdateApi.md#updatedates) | **PUT** /database/{path}/dates | 
*UpdateApi* | [**UpdateSymbol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/UpdateApi.md#updatesymbol) | **PUT** /database/{path}/symbols/{symbol} | 
*UpdateApi* | [**UpdateSymbols**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/UpdateApi.md#updatesymbols) | **PUT** /database/{path}/symbols | 


## Documentation for Models

 - [Model.AddDates](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/AddDates.md)
 - [Model.AddFields](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/AddFields.md)
 - [Model.AddSymbols](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/AddSymbols.md)
 - [Model.BulkDelete](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/BulkDelete.md)
 - [Model.BulkDeleteArrayItem](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/BulkDeleteArrayItem.md)
 - [Model.BulkDeleteArrayItemNested](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/BulkDeleteArrayItemNested.md)
 - [Model.BulkDeleteItem](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/BulkDeleteItem.md)
 - [Model.ContentWithDate](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/ContentWithDate.md)
 - [Model.ContentWithSymbol](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/ContentWithSymbol.md)
 - [Model.CreateDatabase](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/CreateDatabase.md)
 - [Model.CreateDatabaseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/CreateDatabaseData.md)
 - [Model.DataValue](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/DataValue.md)
 - [Model.DatabaseSchema](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/DatabaseSchema.md)
 - [Model.DatabaseSchemaData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/DatabaseSchemaData.md)
 - [Model.DateAndContent](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/DateAndContent.md)
 - [Model.DateAndFields](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/DateAndFields.md)
 - [Model.DatesWithId](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/DatesWithId.md)
 - [Model.ErrorObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/ErrorObject.md)
 - [Model.ErrorObjectWithSource](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/ErrorObjectWithSource.md)
 - [Model.ErrorObjectWithSourceSource](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/ErrorObjectWithSourceSource.md)
 - [Model.FieldProperties](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/FieldProperties.md)
 - [Model.InlineResponse200](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse200.md)
 - [Model.InlineResponse2001](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse2001.md)
 - [Model.InlineResponse2001Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse2001Data.md)
 - [Model.InlineResponse2002](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse2002.md)
 - [Model.InlineResponse2003](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse2003.md)
 - [Model.InlineResponse2004](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse2004.md)
 - [Model.InlineResponse2005](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse2005.md)
 - [Model.InlineResponse2006](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse2006.md)
 - [Model.InlineResponse2007](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse2007.md)
 - [Model.InlineResponse2008](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse2008.md)
 - [Model.InlineResponse200Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse200Data.md)
 - [Model.InlineResponse201](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse201.md)
 - [Model.InlineResponse201Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse201Data.md)
 - [Model.InlineResponse202](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse202.md)
 - [Model.InlineResponse202Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse202Data.md)
 - [Model.InlineResponse400](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse400.md)
 - [Model.InlineResponse403](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/InlineResponse403.md)
 - [Model.SuccessPostResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/SuccessPostResponse.md)
 - [Model.SuccessPostResponseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/SuccessPostResponseData.md)
 - [Model.SymbolAndContent](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/SymbolAndContent.md)
 - [Model.SymbolAndFields](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/SymbolAndFields.md)
 - [Model.SymbolsWithId](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/SymbolsWithId.md)
 - [Model.UpdateDate](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/UpdateDate.md)
 - [Model.UpdateDates](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/UpdateDates.md)
 - [Model.UpdateSymbol](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/UpdateSymbol.md)
 - [Model.UpdateSymbols](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/OFDB/v2/docs/UpdateSymbols.md)


## Documentation for Authorization


### FactSetApiKey

- **Type**: HTTP basic authentication


### FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Contributing

Please refer to the [contributing guide](../../../../CONTRIBUTING.md).

## Copyright

Copyright 2022 FactSet Research Systems Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
