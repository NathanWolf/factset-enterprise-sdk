[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Open:Risk client library for Python

[![PyPi](https://img.shields.io/pypi/v/fds.sdk.OpenRisk)](https://pypi.org/project/fds.sdk.OpenRisk/)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.24.0
- Package version: 1.3.1
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.OpenRisk==1.3.1
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.OpenRisk==1.3.1
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Python environment.
   1. Install and activate python 3.7+. If you're using [pyenv](https://github.com/pyenv/pyenv):

      ```sh
      pyenv install 3.9.7
      pyenv shell 3.9.7
      ```

   2. (optional) [Install poetry](https://python-poetry.org/docs/#installation).
3. [Install dependencies](#installation).
4. Run the following:

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient

import fds.sdk.OpenRisk
from fds.sdk.OpenRisk.api import about_api
from fds.sdk.OpenRisk.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.OpenRisk.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenRisk.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenRisk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = about_api.AboutApi(api_client)
    version = "v1" # str | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.

    try:
        # Get health of service
        # example passing only required values which don't have defaults set
        api_response = api_instance.health_status(version)

        pprint(api_response)
    except fds.sdk.OpenRisk.ApiException as e:
        print("Exception when calling AboutApi->health_status: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Get health of service
    #     api_response, http_status_code, response_headers = api_instance.health_status_with_http_info(version)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.OpenRisk.ApiException as e:
    #     print("Exception when calling AboutApi->health_status: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Get health of service
    #     async_result = api_instance.health_status_async(version)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.OpenRisk.ApiException as e:
    #     print("Exception when calling AboutApi->health_status: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Get health of service
    #     async_result = api_instance.health_status_with_http_info_async(version)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.OpenRisk.ApiException as e:
    #     print("Exception when calling AboutApi->health_status: %s\n" % e)

```

### Using Pandas

To convert an API response to a Pandas DataFrame, it is necessary to transform it first to a dictionary.
```python
import pandas as pd

response_dict = api_response.to_dict()['data']

simple_json_response = pd.DataFrame(response_dict)
nested_json_response = pd.json_normalize(response_dict)
```

### Debugging

The SDK uses the standard library [`logging`](https://docs.python.org/3/library/logging.html#module-logging) module.

Setting `debug` to `True` on an instance of the `Configuration` class sets the log-level of related packages to `DEBUG`
and enables additional logging in Pythons [HTTP Client](https://docs.python.org/3/library/http.client.html).

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```python
import logging
import fds.sdk.OpenRisk

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.OpenRisk.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.OpenRisk

configuration = fds.sdk.OpenRisk.Configuration(
    # ...
    proxy="http://secret:password@localhost:5050",
    proxy_headers={
        "Custom-Proxy-Header": "Custom-Proxy-Header-Value"
    }
)
```

### Custom SSL Certificate

TLS/SSL certificate verification can be configured with the following Configuration parameters:

* `ssl_ca_cert`: a path to the certificate to use for verification in `PEM` format.
* `verify_ssl`: setting this to `False` disables the verification of certificates.
  Disabling the verification is not recommended, but it might be useful during
  local development or testing.

```python
import fds.sdk.OpenRisk

configuration = fds.sdk.OpenRisk.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/analytics/openrisk*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AboutApi* | [**health_status**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/AboutApi.md#health_status) | **GET** /linear/{version}/health | Get health of service
*AboutApi* | [**list_risk_models**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/AboutApi.md#list_risk_models) | **GET** /linear/{version}/riskmodels | Get available risk models
*AboutApi* | [**risk_model_metadata**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/AboutApi.md#risk_model_metadata) | **GET** /linear/{version}/riskmodels/{modelCode} | Get risk model details
*AboutApi* | [**stats**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/AboutApi.md#stats) | **GET** /linear/{version}/stats | Get available risk statistics details
*AboutApi* | [**stats_names_only**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/AboutApi.md#stats_names_only) | **GET** /linear/{version}/stats-names-only | Get available risk statistics names
*OperationsApi* | [**calculate_from_holdings**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/OperationsApi.md#calculate_from_holdings) | **POST** /linear/{version}/calculate/from-holdings | Calculate risk statistics
*OperationsApi* | [**generate_id_mapping**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/OperationsApi.md#generate_id_mapping) | **POST** /linear/{version}/generate/id-mapping | Generate risk model ID mapping


## Documentation For Models

 - [AdditionalCalculationInputs](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/AdditionalCalculationInputs.md)
 - [AdditionalCalculationInputsMarketExcess](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/AdditionalCalculationInputsMarketExcess.md)
 - [AssetTypes](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/AssetTypes.md)
 - [CalculateFromHoldingsRequestBody](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/CalculateFromHoldingsRequestBody.md)
 - [CalculateFromHoldingsRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/CalculateFromHoldingsRequestData.md)
 - [CalendarCode](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/CalendarCode.md)
 - [CompositeAssetDefinitions](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/CompositeAssetDefinitions.md)
 - [CovarianceDateFormatConvention](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/CovarianceDateFormatConvention.md)
 - [CurrencyISOCode](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/CurrencyISOCode.md)
 - [Date](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/Date.md)
 - [ErrorItem](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/ErrorItem.md)
 - [ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/ErrorResponse.md)
 - [ExposureDateFormatConvention](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/ExposureDateFormatConvention.md)
 - [FactorGroup](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/FactorGroup.md)
 - [FactorGroupNodes](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/FactorGroupNodes.md)
 - [FactorsVisible](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/FactorsVisible.md)
 - [GenerateIDMappingRequestBody](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/GenerateIDMappingRequestBody.md)
 - [GenerateIDMappingRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/GenerateIDMappingRequestData.md)
 - [GroupsLabels](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/GroupsLabels.md)
 - [Holding](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/Holding.md)
 - [HoldingAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/HoldingAllOf.md)
 - [Holdings](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/Holdings.md)
 - [IDsAndMarketValues](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/IDsAndMarketValues.md)
 - [InlineResponse200](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/InlineResponse200.md)
 - [InlineResponse2001](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/InlineResponse2001.md)
 - [InlineResponse2001Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/InlineResponse2001Data.md)
 - [InlineResponse2001DataFactors](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/InlineResponse2001DataFactors.md)
 - [InlineResponse2001DataRiskModelAppendFormat](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/InlineResponse2001DataRiskModelAppendFormat.md)
 - [InlineResponse2002](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/InlineResponse2002.md)
 - [InlineResponse2003](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/InlineResponse2003.md)
 - [InlineResponse2004](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/InlineResponse2004.md)
 - [InlineResponse200Data](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/InlineResponse200Data.md)
 - [InlineResponse403](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/InlineResponse403.md)
 - [InlineResponse404](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/InlineResponse404.md)
 - [InputToResultSecurityIndexMapping](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/InputToResultSecurityIndexMapping.md)
 - [Labels](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/Labels.md)
 - [LabelsFactor](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/LabelsFactor.md)
 - [LabelsSecurity](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/LabelsSecurity.md)
 - [LaggingDates](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/LaggingDates.md)
 - [MappedSecurityInfo](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/MappedSecurityInfo.md)
 - [RemoveCurrencyRisk](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/RemoveCurrencyRisk.md)
 - [RemoveCurrencyRiskIDs](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/RemoveCurrencyRiskIDs.md)
 - [RequiresFactorReturns](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/RequiresFactorReturns.md)
 - [ResolvedDates](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/ResolvedDates.md)
 - [ResultToInputSecurityIndexMapping](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/ResultToInputSecurityIndexMapping.md)
 - [RiskExclusionInfo](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/RiskExclusionInfo.md)
 - [RiskExclusionInfoExclusionInfo](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/RiskExclusionInfoExclusionInfo.md)
 - [RiskMappingEntry](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/RiskMappingEntry.md)
 - [RiskModelAppendData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/RiskModelAppendData.md)
 - [RiskModelAppendDataValue](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/RiskModelAppendDataValue.md)
 - [RiskModelCode](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/RiskModelCode.md)
 - [RiskModelFactor](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/RiskModelFactor.md)
 - [SecurityGroup](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/SecurityGroup.md)
 - [SecurityIndexMapping](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/SecurityIndexMapping.md)
 - [SecurityOnlyLabels](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/SecurityOnlyLabels.md)
 - [SecurityOnlyLabelsSecurity](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/SecurityOnlyLabelsSecurity.md)
 - [SecurityOnlySuccessResponseMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/SecurityOnlySuccessResponseMeta.md)
 - [Stat](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/Stat.md)
 - [StatCalculationLevel](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/StatCalculationLevel.md)
 - [StatCalculationSettings](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/StatCalculationSettings.md)
 - [StatResultValue](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/StatResultValue.md)
 - [StatResultValueDenseMatrix](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/StatResultValueDenseMatrix.md)
 - [StatResultValueSparseMatrix](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/StatResultValueSparseMatrix.md)
 - [StatResultValueVector](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/StatResultValueVector.md)
 - [Stats](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/Stats.md)
 - [StatsResults](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/StatsResults.md)
 - [StringDate](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/StringDate.md)
 - [SuccessResponseMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/SuccessResponseMeta.md)
 - [SupportedStats](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/SupportedStats.md)
 - [SupportedStatsData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/SupportedStatsData.md)
 - [SupportedStatsLevels](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/SupportedStatsLevels.md)
 - [SupportedStatsNamesOnly](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/SupportedStatsNamesOnly.md)
 - [SupportedStatsSecurityGroupMethod](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/SupportedStatsSecurityGroupMethod.md)
 - [UnderlyingIDs](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/UnderlyingIDs.md)
 - [WarningItem](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/WarningItem.md)
 - [Warnings](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/OpenRisk/v1/docs/Warnings.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.OpenRisk.apis and fds.sdk.OpenRisk.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.OpenRisk.api.default_api import DefaultApi`
- `from fds.sdk.OpenRisk.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.OpenRisk
from fds.sdk.OpenRisk.apis import *
from fds.sdk.OpenRisk.models import *
```

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

