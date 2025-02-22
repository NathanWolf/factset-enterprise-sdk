[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Programmatic Environment client library for .NET

[![Nuget](https://img.shields.io/nuget/v/FactSet.SDK.FactSetProgrammaticEnvironment)](https://www.nuget.org/packages/FactSet.SDK.FactSetProgrammaticEnvironment)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

FactSet Programmatic Environment (FPE) API is an API for users to interact with FPE programmatically, streamlining path from research to production.

This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 0.21.9
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.FactSetProgrammaticEnvironment -v 0.21.9
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.FactSetProgrammaticEnvironment -Version 0.21.9
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
using FactSet.SDK.FactSetProgrammaticEnvironment.Api;
using FactSet.SDK.FactSetProgrammaticEnvironment.Client;
using FactSet.SDK.FactSetProgrammaticEnvironment.Model;

namespace Example
{
    public static class AnalyticsQuantFpeV1CalculationsIdGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetProgrammaticEnvironment.Client.Configuration();

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

            var apiInstance = new CalculationsApi(config);
            var id = "id_example";  // string | From url, provided by location header or response body in the calculation start endpoint

            try
            {
                // Get calculation status by id
                CalculationStatus result = apiInstance.AnalyticsQuantFpeV1CalculationsIdGet(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.AnalyticsQuantFpeV1CalculationsIdGet: " + e.Message );
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

All URIs are relative to *https://api.factset.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CalculationsApi* | [**AnalyticsQuantFpeV1CalculationsIdGet**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetProgrammaticEnvironment/v1/docs/CalculationsApi.md#analyticsquantfpev1calculationsidget) | **GET** /analytics/quant/fpe/v1/calculations/{id} | Get calculation status by id
*CalculationsApi* | [**AnalyticsQuantFpeV1CalculationsIdLogGet**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetProgrammaticEnvironment/v1/docs/CalculationsApi.md#analyticsquantfpev1calculationsidlogget) | **GET** /analytics/quant/fpe/v1/calculations/{id}/log | Get calculation log for a specific calculation
*CalculationsApi* | [**AnalyticsQuantFpeV1CalculationsIdOutputGet**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetProgrammaticEnvironment/v1/docs/CalculationsApi.md#analyticsquantfpev1calculationsidoutputget) | **GET** /analytics/quant/fpe/v1/calculations/{id}/output | Get calculation output for a specific calculation
*CalculationsApi* | [**AnalyticsQuantFpeV1CalculationsPost**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetProgrammaticEnvironment/v1/docs/CalculationsApi.md#analyticsquantfpev1calculationspost) | **POST** /analytics/quant/fpe/v1/calculations | Starts a new script calculation
*FilesApi* | [**AnalyticsQuantFpeV1FilesServerFilePost**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetProgrammaticEnvironment/v1/docs/FilesApi.md#analyticsquantfpev1filesserverfilepost) | **POST** /analytics/quant/fpe/v1/files/{server}/{file} | Starts a file upload
*FilesApi* | [**AnalyticsQuantFpeV1FilesUploadsIdGet**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetProgrammaticEnvironment/v1/docs/FilesApi.md#analyticsquantfpev1filesuploadsidget) | **GET** /analytics/quant/fpe/v1/files/uploads/{id} | Get upload status by id


## Documentation for Models

 - [Model.Calculation](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetProgrammaticEnvironment/v1/docs/Calculation.md)
 - [Model.CalculationStatus](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetProgrammaticEnvironment/v1/docs/CalculationStatus.md)
 - [Model.FileUploadStatus](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetProgrammaticEnvironment/v1/docs/FileUploadStatus.md)


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
