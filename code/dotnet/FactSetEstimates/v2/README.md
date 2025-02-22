[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Estimates client library for .NET

[![Nuget](https://img.shields.io/nuget/v/FactSet.SDK.FactSetEstimates)](https://www.nuget.org/packages/FactSet.SDK.FactSetEstimates)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market.


This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.5.0
- Package version: 1.1.4
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.FactSetEstimates -v 1.1.4
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.FactSetEstimates -Version 1.1.4
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
using FactSet.SDK.FactSetEstimates.Api;
using FactSet.SDK.FactSetEstimates.Client;
using FactSet.SDK.FactSetEstimates.Model;

namespace Example
{
    public static class GetFixedDetailExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEstimates.Client.Configuration();

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

            var apiInstance = new BrokerDetailApi(config);
            var ids = new List<string>(); // List<string> | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
            var metrics = new List<string>(); // List<string> | Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). 
            var startDate = "2019-07-30";  // string | Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional) 
            var endDate = "2020-07-30";  // string | End date for point in time of estimates expressed in YYYY-MM-DD format. (optional) 
            var frequency = "D";  // string | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.   (optional)  (default to D)
            var periodicity = "ANN";  // string | The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual   (optional)  (default to ANN)
            var includeAll = false;  // bool? | Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** = Returns all the brokers included and excluded in the consensus   * **FALSE** = Returns only the broker details included in the consensus     (optional)  (default to false)
            var fiscalPeriodStart = "2019";  // string | Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019)  (optional) 
            var fiscalPeriodEnd = "2020";  // string | Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019)  (optional) 
            var currency = "USD";  // string | Currency code for adjusting the data. Use 'ESTIMATE' as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). (optional) 

            try
            {
                // Estimates detail data for fixed fiscal periods
                DetailResponse result = apiInstance.GetFixedDetail(ids, metrics, startDate, endDate, frequency, periodicity, includeAll, fiscalPeriodStart, fiscalPeriodEnd, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling BrokerDetailApi.GetFixedDetail: " + e.Message );
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

All URIs are relative to *https://api.factset.com/content*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BrokerDetailApi* | [**GetFixedDetail**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/BrokerDetailApi.md#getfixeddetail) | **GET** /factset-estimates/v2/fixed-detail | Estimates detail data for fixed fiscal periods
*BrokerDetailApi* | [**GetFixedDetailForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/BrokerDetailApi.md#getfixeddetailforlist) | **POST** /factset-estimates/v2/fixed-detail | Estimates detail data for fixed fiscal periods
*BrokerDetailApi* | [**GetRollingDetail**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/BrokerDetailApi.md#getrollingdetail) | **GET** /factset-estimates/v2/rolling-detail | FactSet estimates detail data for rolling fiscal periods
*BrokerDetailApi* | [**GetRollingDetailForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/BrokerDetailApi.md#getrollingdetailforlist) | **POST** /factset-estimates/v2/rolling-detail | FactSet estimates detail data for rolling fiscal periods
*ConsensusApi* | [**GetFixedConsensus**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/ConsensusApi.md#getfixedconsensus) | **GET** /factset-estimates/v2/fixed-consensus | Retrieves consensus estimates for a requested list of ids and fixed fiscal periods
*ConsensusApi* | [**GetFixedConsensusForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/ConsensusApi.md#getfixedconsensusforlist) | **POST** /factset-estimates/v2/fixed-consensus | FactSet consensus estimates for fixed fiscal periods
*ConsensusApi* | [**GetRollingConsensus**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/ConsensusApi.md#getrollingconsensus) | **GET** /factset-estimates/v2/rolling-consensus | Retrieves consensus estimates for a requested list of ids and rolling fiscal periods.
*ConsensusApi* | [**GetRollingConsensusForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/ConsensusApi.md#getrollingconsensusforlist) | **POST** /factset-estimates/v2/rolling-consensus | Retrieves consensus estimates for a requested list of ids and rolling fiscal periods
*DataItemsApi* | [**GetEstimateMetrics**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/DataItemsApi.md#getestimatemetrics) | **GET** /factset-estimates/v2/metrics | Available Estimate metrics
*DataItemsApi* | [**GetEstimateMetricsForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/DataItemsApi.md#getestimatemetricsforlist) | **POST** /factset-estimates/v2/metrics | Available Estimate metrics or ratios.
*RatingsApi* | [**GetConsensusRatings**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/RatingsApi.md#getconsensusratings) | **GET** /factset-estimates/v2/consensus-ratings | Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
*RatingsApi* | [**GetConsensusRatingsForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/RatingsApi.md#getconsensusratingsforlist) | **POST** /factset-estimates/v2/consensus-ratings | Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
*RatingsApi* | [**GetDetailRatings**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/RatingsApi.md#getdetailratings) | **GET** /factset-estimates/v2/detail-ratings | Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
*RatingsApi* | [**GetDetailRatingsForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/RatingsApi.md#getdetailratingsforlist) | **POST** /factset-estimates/v2/detail-ratings | Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
*SegmentsApi* | [**GetSegments**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/SegmentsApi.md#getsegments) | **GET** /factset-estimates/v2/segments | Retrieves product & geographic segment estimates for a requested list of ids and fiscal periods
*SegmentsApi* | [**GetSegmentsForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/SegmentsApi.md#getsegmentsforlist) | **POST** /factset-estimates/v2/segments | Retrieves product segment estimates for a requested list of ids and fiscal periods
*SurpriseApi* | [**GetSurprise**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/SurpriseApi.md#getsurprise) | **GET** /factset-estimates/v2/surprise | Surprise estimates for rolling fiscal periods
*SurpriseApi* | [**GetSurpriseForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/SurpriseApi.md#getsurpriseforlist) | **POST** /factset-estimates/v2/surprise | Surprise estimates for rolling fiscal periods


## Documentation for Models

 - [Model.Category](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/Category.md)
 - [Model.ConsensusEstimate](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/ConsensusEstimate.md)
 - [Model.ConsensusRatings](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/ConsensusRatings.md)
 - [Model.ConsensusRatingsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/ConsensusRatingsRequest.md)
 - [Model.ConsensusRatingsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/ConsensusRatingsResponse.md)
 - [Model.ConsensusResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/ConsensusResponse.md)
 - [Model.DetailEstimate](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/DetailEstimate.md)
 - [Model.DetailRatings](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/DetailRatings.md)
 - [Model.DetailRatingsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/DetailRatingsRequest.md)
 - [Model.DetailRatingsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/DetailRatingsResponse.md)
 - [Model.DetailResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/DetailResponse.md)
 - [Model.ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/ErrorResponse.md)
 - [Model.ErrorResponseSubErrors](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/ErrorResponseSubErrors.md)
 - [Model.FixedConsensusRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/FixedConsensusRequest.md)
 - [Model.FixedDetailRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/FixedDetailRequest.md)
 - [Model.Frequency](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/Frequency.md)
 - [Model.Metric](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/Metric.md)
 - [Model.MetricsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/MetricsRequest.md)
 - [Model.MetricsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/MetricsResponse.md)
 - [Model.Periodicity](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/Periodicity.md)
 - [Model.PeriodicityDetail](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/PeriodicityDetail.md)
 - [Model.PeriodicitySurprise](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/PeriodicitySurprise.md)
 - [Model.RollingConsensusRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/RollingConsensusRequest.md)
 - [Model.RollingDetailRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/RollingDetailRequest.md)
 - [Model.SegmentType](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/SegmentType.md)
 - [Model.SegmentsEstimate](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/SegmentsEstimate.md)
 - [Model.SegmentsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/SegmentsRequest.md)
 - [Model.SegmentsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/SegmentsResponse.md)
 - [Model.Statistic](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/Statistic.md)
 - [Model.Subcategory](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/Subcategory.md)
 - [Model.Surprise](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/Surprise.md)
 - [Model.SurpriseRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/SurpriseRequest.md)
 - [Model.SurpriseResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetEstimates/v2/docs/SurpriseResponse.md)


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
