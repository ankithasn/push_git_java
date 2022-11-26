# CatalogApi

All URIs are relative to *http://example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogGet**](CatalogApi.md#catalogGet) | **GET** /v2/catalog | get the catalog of services that the service broker offers

<a name="catalogGet"></a>
# **catalogGet**
> Catalog catalogGet(xBrokerAPIVersion)

get the catalog of services that the service broker offers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CatalogApi apiInstance = new CatalogApi();
String xBrokerAPIVersion = "2.13"; // String | version number of the Service Broker API that the Platform will use
try {
    Catalog result = apiInstance.catalogGet(xBrokerAPIVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#catalogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xBrokerAPIVersion** | **String**| version number of the Service Broker API that the Platform will use | [default to 2.13]

### Return type

[**Catalog**](Catalog.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

