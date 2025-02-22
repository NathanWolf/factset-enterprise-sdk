[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Universal Screening client library for Java

[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/universalscreening)](https://search.maven.org/artifact/com.factset.sdk/universalscreening)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application.
Calculate and return the results of your saved Universal Screens.

This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.0.2
- Package version: 2.0.0
- Build package: org.openapitools.codegen.languages.JavaClientCodegen

## Requirements

* Java JDK >= 1.8

## Installation

### Maven

Add these dependencies to your project's POM:

```xml
<dependency>
  <groupId>com.factset.sdk</groupId>
  <artifactId>utils</artifactId>
  <version>1.1.0</version>
</dependency>
<dependency>
  <groupId>com.factset.sdk</groupId>
  <artifactId>universalscreening</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle

Add these dependencies to your project's build file:

```groovy
  repositories {
    mavenCentral()
  }

  dependencies {
    implementation "com.factset.sdk:utils:1.1.0"
    implementation "com.factset.sdk:universalscreening:2.0.0"
  }
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Java environment.
   1. Install and activate Java 1.8+
   2. Install [maven](https://maven.apache.org/install.html) or [gradle](https://gradle.org/install/)
3. [Install dependencies](#installation).
4. Run the following:

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

### Example Code

```java
import com.factset.sdk.UniversalScreening.*;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.JobManagementApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class JobManagementApiExample {

    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        JobManagementApi apiInstance = new JobManagementApi(defaultClient);
        String id = "id_example"; // String | Unique identifier for a screen calculation job
        try {
            apiInstance.deleteActiveJob(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobManagementApi#deleteActiveJob");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

### Using a Proxy

To add a HTTP proxy for the API client, use `ClientConfig`:
```java

import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import com.factset.sdk.UniversalScreening.*;
import com.factset.sdk.UniversalScreening.api.JobManagementApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

JobManagementApi apiInstance = new JobManagementApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.UniversalScreening.ApiClient;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setDebugging(true);

        // Setup authentication and make request with apiInstance...
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/universal-screening*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*JobManagementApi* | [**deleteActiveJob**](docs/JobManagementApi.md#deleteActiveJob) | **DELETE** /v2/job/{id} | 
*JobManagementApi* | [**deleteAllActiveJobs**](docs/JobManagementApi.md#deleteAllActiveJobs) | **DELETE** /v2/jobs | 
*JobManagementApi* | [**getAllActiveJobs**](docs/JobManagementApi.md#getAllActiveJobs) | **GET** /v2/jobs | 
*ScreeningOperationsApi* | [**getCalculateResults**](docs/ScreeningOperationsApi.md#getCalculateResults) | **GET** /v2/job/{id} | 
*ScreeningOperationsApi* | [**pollCalculate**](docs/ScreeningOperationsApi.md#pollCalculate) | **GET** /v2/job/{id}/status | 
*ScreeningOperationsApi* | [**submitArchiveOFDB**](docs/ScreeningOperationsApi.md#submitArchiveOFDB) | **POST** /v2/job/archive | 
*ScreeningOperationsApi* | [**submitCalculate**](docs/ScreeningOperationsApi.md#submitCalculate) | **POST** /v2/job/calculate | 


## Documentation for Models

 - [ActiveJobIDs](docs/ActiveJobIDs.md)
 - [ActiveJobsData](docs/ActiveJobsData.md)
 - [ErrorArray](docs/ErrorArray.md)
 - [ErrorCode](docs/ErrorCode.md)
 - [ErrorObject](docs/ErrorObject.md)
 - [ErrorObjectSource](docs/ErrorObjectSource.md)
 - [PaginatedCalculationResponse](docs/PaginatedCalculationResponse.md)
 - [PaginationResponse](docs/PaginationResponse.md)
 - [ResourceStatusResponse](docs/ResourceStatusResponse.md)
 - [ResourceStatusResponseData](docs/ResourceStatusResponseData.md)
 - [ResultsMetadata](docs/ResultsMetadata.md)
 - [ScreenArchiveOFDBParameters](docs/ScreenArchiveOFDBParameters.md)
 - [ScreenArchiveOFDBParametersData](docs/ScreenArchiveOFDBParametersData.md)
 - [ScreenArchiveOFDBParametersDataArchiveOptions](docs/ScreenArchiveOFDBParametersDataArchiveOptions.md)
 - [ScreenCalcParameters](docs/ScreenCalcParameters.md)
 - [ScreenCalcParametersData](docs/ScreenCalcParametersData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### FactSetApiKey


- **Type**: HTTP basic authentication

### FactSetOAuth2


- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multi-threaded environment to avoid any potential issues.

# Contributing

Please refer to the [contributing guide](../../../../CONTRIBUTING.md).

# Copyright

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
