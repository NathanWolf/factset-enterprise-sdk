[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Issue Tracker client library for .NET

[![Nuget](https://img.shields.io/nuget/v/FactSet.SDK.IssueTracker)](https://www.nuget.org/packages/FactSet.SDK.IssueTracker)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

This API is used to file issues

This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 0.2.1
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.IssueTracker -v 0.2.1
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.IssueTracker -Version 0.2.1
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
using FactSet.SDK.IssueTracker.Api;
using FactSet.SDK.IssueTracker.Client;
using FactSet.SDK.IssueTracker.Model;

namespace Example
{
    public static class GetIssueExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IssueTracker.Client.Configuration();

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

            var apiInstance = new IssueApi(config);
            var id = "id_example";  // string |   ID of Issue Tracker issue

            try
            {
                // Get the matched issue details
                Issue result = apiInstance.GetIssue(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling IssueApi.GetIssue: " + e.Message );
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

All URIs are relative to *https://api.factset.com/issue-tracker/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*IssueApi* | [**GetIssue**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/IssueApi.md#getissue) | **GET** /issues/{id} | Get the matched issue details
*IssueApi* | [**PostIssue**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/IssueApi.md#postissue) | **POST** /issues | Creates a Issue Tracker issue
*IssueApi* | [**PostReply**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/IssueApi.md#postreply) | **POST** /issues/{id}/comments | post comment to Issue Tracker issue


## Documentation for Models

 - [Model.Comment](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/Comment.md)
 - [Model.CommentRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/CommentRequest.md)
 - [Model.CommentRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/CommentRequestData.md)
 - [Model.Error](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/Error.md)
 - [Model.ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/ErrorResponse.md)
 - [Model.IdResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/IdResponse.md)
 - [Model.IdResponseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/IdResponseData.md)
 - [Model.Issue](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/Issue.md)
 - [Model.IssueData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/IssueData.md)
 - [Model.IssueRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/IssueRequest.md)
 - [Model.IssueRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IssueTracker/v1/docs/IssueRequestData.md)


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
