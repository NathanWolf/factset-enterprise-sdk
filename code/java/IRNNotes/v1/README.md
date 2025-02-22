[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# IRN Notes client library for Java

[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/irnnotes)](https://search.maven.org/artifact/com.factset.sdk/irnnotes)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Allows users to extract, create, update and configure IRN data.

This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1
- Package version: 3.0.0
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
  <artifactId>irnnotes</artifactId>
  <version>3.0.0</version>
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
    implementation "com.factset.sdk:irnnotes:3.0.0"
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
import com.factset.sdk.IRNNotes.*;
import com.factset.sdk.IRNNotes.auth.*;
import com.factset.sdk.IRNNotes.models.*;
import com.factset.sdk.IRNNotes.api.AttachmentsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class AttachmentsApiExample {

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

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        java.util.UUID noteId = new java.util.UUID(); // java.util.UUID | 
        File _file = new File("/path/to/file"); // File | 
        try {
            NewItemDto result = apiInstance.createAttachment(noteId, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#createAttachment");
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
import com.factset.sdk.IRNNotes.*;
import com.factset.sdk.IRNNotes.api.AttachmentsApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.IRNNotes.ApiClient;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setDebugging(true);

        // Setup authentication and make request with apiInstance...
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/research/irn*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AttachmentsApi* | [**createAttachment**](docs/AttachmentsApi.md#createAttachment) | **POST** /v1/notes/{noteId}/attachments | Create an attachment for an existing note
*AttachmentsApi* | [**downloadAttachment**](docs/AttachmentsApi.md#downloadAttachment) | **GET** /v1/notes/{noteId}/attachments/{attachmentId}/download | Download an attachment from a Note
*AttachmentsApi* | [**getAttachments**](docs/AttachmentsApi.md#getAttachments) | **GET** /v1/notes/{noteId}/attachments | Get all the attachments belonging to a note
*AttachmentsApi* | [**softDeleteNoteAttachment**](docs/AttachmentsApi.md#softDeleteNoteAttachment) | **DELETE** /v1/notes/{noteId}/attachments/{attachmentId} | Delete attachment from note
*CommentsApi* | [**createComment**](docs/CommentsApi.md#createComment) | **POST** /v1/notes/{noteId}/comments | Create a comment to a Note
*CommentsApi* | [**createCommentAttachment**](docs/CommentsApi.md#createCommentAttachment) | **POST** /v1/notes/{noteId}/comments/{commentId}/attachments | Create a comment attachment to a Note
*CommentsApi* | [**deleteComment**](docs/CommentsApi.md#deleteComment) | **DELETE** /v1/notes/{noteId}/comments/{commentId} | Delete a Comment from a Note
*CommentsApi* | [**downloadCommentAttachmentForComment**](docs/CommentsApi.md#downloadCommentAttachmentForComment) | **GET** /v1/notes/{noteId}/comments/{commentId}/attachments/{attachmentId}/download | Download single attachment detail of a comment belonging to a note
*CommentsApi* | [**getComment**](docs/CommentsApi.md#getComment) | **GET** /v1/notes/{noteId}/comments/{commentId} | Get details of a comment belonging to a note
*CommentsApi* | [**getCommentAttachments**](docs/CommentsApi.md#getCommentAttachments) | **GET** /v1/notes/{noteId}/comments/{commentId}/attachments | Get attachments summary of a comment belonging to a note
*CommentsApi* | [**getComments**](docs/CommentsApi.md#getComments) | **GET** /v1/notes/{noteId}/comments | Get all comments for a note
*CommentsApi* | [**patchComment**](docs/CommentsApi.md#patchComment) | **PATCH** /v1/notes/{noteId}/comments/{commentId} | Edit a comment for a note
*EventsApi* | [**getAllEvents**](docs/EventsApi.md#getAllEvents) | **GET** /v1/events | Get all the record events in the specified date range filtered on the given types
*EventsApi* | [**getEvents**](docs/EventsApi.md#getEvents) | **GET** /v1/notes/{noteId}/events | Get all the record events that belong to a note
*EventsApi* | [**getRecordEvent**](docs/EventsApi.md#getRecordEvent) | **GET** /v1/notes/{noteId}/events/{recordEventId} | Get details of a record event of a note
*IdentifiersApi* | [**getIdentifiers**](docs/IdentifiersApi.md#getIdentifiers) | **GET** /v1/identifiers | Get all the identifier details for given identifiers
*NotesApi* | [**createNote**](docs/NotesApi.md#createNote) | **POST** /v1/notes | Create a note
*NotesApi* | [**deleteNote**](docs/NotesApi.md#deleteNote) | **DELETE** /v1/notes/{noteId} | Delete a Note
*NotesApi* | [**getNote**](docs/NotesApi.md#getNote) | **GET** /v1/notes/{noteId} | Get details of a note
*NotesApi* | [**getNotes**](docs/NotesApi.md#getNotes) | **GET** /v1/notes | Get all the notes in the specified date range filtered on the given identifiers
*NotesApi* | [**updateNote**](docs/NotesApi.md#updateNote) | **PUT** /v1/notes/{noteId} | Update a note


## Documentation for Models

 - [AttachmentSummaryDto](docs/AttachmentSummaryDto.md)
 - [CommentDto](docs/CommentDto.md)
 - [CommentSummaryDto](docs/CommentSummaryDto.md)
 - [CreateBodyDto](docs/CreateBodyDto.md)
 - [CreateCommentDto](docs/CreateCommentDto.md)
 - [CreateCustomFieldValueDto](docs/CreateCustomFieldValueDto.md)
 - [CreateNoteDto](docs/CreateNoteDto.md)
 - [CustomFieldValueDto](docs/CustomFieldValueDto.md)
 - [EventSnippetDto](docs/EventSnippetDto.md)
 - [NewItemDto](docs/NewItemDto.md)
 - [NoteDto](docs/NoteDto.md)
 - [NoteEventDto](docs/NoteEventDto.md)
 - [NoteSummaryDto](docs/NoteSummaryDto.md)
 - [Operation](docs/Operation.md)
 - [OperationType](docs/OperationType.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [RecordChangeDto](docs/RecordChangeDto.md)
 - [RecordEventSummaryDto](docs/RecordEventSummaryDto.md)
 - [RelatedRecordsDto](docs/RelatedRecordsDto.md)
 - [SubcommentSummaryDto](docs/SubcommentSummaryDto.md)
 - [UpdateNoteDto](docs/UpdateNoteDto.md)
 - [UserSerialDto](docs/UserSerialDto.md)


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
