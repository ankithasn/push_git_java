# ServiceInstancesApi

All URIs are relative to *http://example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceInstanceDeprovision**](ServiceInstancesApi.md#serviceInstanceDeprovision) | **DELETE** /v2/service_instances/{instance_id} | deprovision a service instance
[**serviceInstanceGet**](ServiceInstancesApi.md#serviceInstanceGet) | **GET** /v2/service_instances/{instance_id} | get a service instance
[**serviceInstanceLastOperationGet**](ServiceInstancesApi.md#serviceInstanceLastOperationGet) | **GET** /v2/service_instances/{instance_id}/last_operation | get the last requested operation state for service instance
[**serviceInstanceProvision**](ServiceInstancesApi.md#serviceInstanceProvision) | **PUT** /v2/service_instances/{instance_id} | provision a service instance
[**serviceInstanceUpdate**](ServiceInstancesApi.md#serviceInstanceUpdate) | **PATCH** /v2/service_instances/{instance_id} | update a service instance

<a name="serviceInstanceDeprovision"></a>
# **serviceInstanceDeprovision**
> Object serviceInstanceDeprovision(xBrokerAPIVersion, instanceId, serviceId, planId, xBrokerAPIOriginatingIdentity, acceptsIncomplete)

deprovision a service instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceInstancesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceInstancesApi apiInstance = new ServiceInstancesApi();
String xBrokerAPIVersion = "2.13"; // String | version number of the Service Broker API that the Platform will use
String instanceId = "instanceId_example"; // String | id of instance being deleted
String serviceId = "serviceId_example"; // String | id of the service associated with the instance being deleted
String planId = "planId_example"; // String | id of the plan associated with the instance being deleted
String xBrokerAPIOriginatingIdentity = "xBrokerAPIOriginatingIdentity_example"; // String | identity of the user that initiated the request from the Platform
Boolean acceptsIncomplete = true; // Boolean | asynchronous deprovision supported
try {
    Object result = apiInstance.serviceInstanceDeprovision(xBrokerAPIVersion, instanceId, serviceId, planId, xBrokerAPIOriginatingIdentity, acceptsIncomplete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceInstancesApi#serviceInstanceDeprovision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xBrokerAPIVersion** | **String**| version number of the Service Broker API that the Platform will use | [default to 2.13]
 **instanceId** | **String**| id of instance being deleted |
 **serviceId** | **String**| id of the service associated with the instance being deleted |
 **planId** | **String**| id of the plan associated with the instance being deleted |
 **xBrokerAPIOriginatingIdentity** | **String**| identity of the user that initiated the request from the Platform | [optional]
 **acceptsIncomplete** | **Boolean**| asynchronous deprovision supported | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="serviceInstanceGet"></a>
# **serviceInstanceGet**
> ServiceInstanceResource serviceInstanceGet(xBrokerAPIVersion, instanceId, xBrokerAPIOriginatingIdentity, serviceId, planId)

get a service instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceInstancesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceInstancesApi apiInstance = new ServiceInstancesApi();
String xBrokerAPIVersion = "2.13"; // String | version number of the Service Broker API that the Platform will use
String instanceId = "instanceId_example"; // String | instance id of instance to fetch
String xBrokerAPIOriginatingIdentity = "xBrokerAPIOriginatingIdentity_example"; // String | identity of the user that initiated the request from the Platform
String serviceId = "serviceId_example"; // String | id of the service associated with the instance
String planId = "planId_example"; // String | id of the plan associated with the instance
try {
    ServiceInstanceResource result = apiInstance.serviceInstanceGet(xBrokerAPIVersion, instanceId, xBrokerAPIOriginatingIdentity, serviceId, planId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceInstancesApi#serviceInstanceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xBrokerAPIVersion** | **String**| version number of the Service Broker API that the Platform will use | [default to 2.13]
 **instanceId** | **String**| instance id of instance to fetch |
 **xBrokerAPIOriginatingIdentity** | **String**| identity of the user that initiated the request from the Platform | [optional]
 **serviceId** | **String**| id of the service associated with the instance | [optional]
 **planId** | **String**| id of the plan associated with the instance | [optional]

### Return type

[**ServiceInstanceResource**](ServiceInstanceResource.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="serviceInstanceLastOperationGet"></a>
# **serviceInstanceLastOperationGet**
> LastOperationResource serviceInstanceLastOperationGet(xBrokerAPIVersion, instanceId, serviceId, planId, operation)

get the last requested operation state for service instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceInstancesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceInstancesApi apiInstance = new ServiceInstancesApi();
String xBrokerAPIVersion = "2.13"; // String | version number of the Service Broker API that the Platform will use
String instanceId = "instanceId_example"; // String | instance id of instance to find last operation applied to it
String serviceId = "serviceId_example"; // String | id of the service associated with the instance
String planId = "planId_example"; // String | id of the plan associated with the instance
String operation = "operation_example"; // String | a provided identifier for the operation
try {
    LastOperationResource result = apiInstance.serviceInstanceLastOperationGet(xBrokerAPIVersion, instanceId, serviceId, planId, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceInstancesApi#serviceInstanceLastOperationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xBrokerAPIVersion** | **String**| version number of the Service Broker API that the Platform will use | [default to 2.13]
 **instanceId** | **String**| instance id of instance to find last operation applied to it |
 **serviceId** | **String**| id of the service associated with the instance | [optional]
 **planId** | **String**| id of the plan associated with the instance | [optional]
 **operation** | **String**| a provided identifier for the operation | [optional]

### Return type

[**LastOperationResource**](LastOperationResource.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="serviceInstanceProvision"></a>
# **serviceInstanceProvision**
> ServiceInstanceProvisionResponse serviceInstanceProvision(body, xBrokerAPIVersion, instanceId, xBrokerAPIOriginatingIdentity, acceptsIncomplete)

provision a service instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceInstancesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceInstancesApi apiInstance = new ServiceInstancesApi();
ServiceInstanceProvisionRequestBody body = new ServiceInstanceProvisionRequestBody(); // ServiceInstanceProvisionRequestBody | parameters for the requested service instance provision
String xBrokerAPIVersion = "2.13"; // String | version number of the Service Broker API that the Platform will use
String instanceId = "instanceId_example"; // String | instance id of instance to provision
String xBrokerAPIOriginatingIdentity = "xBrokerAPIOriginatingIdentity_example"; // String | identity of the user that initiated the request from the Platform
Boolean acceptsIncomplete = true; // Boolean | asynchronous operations supported
try {
    ServiceInstanceProvisionResponse result = apiInstance.serviceInstanceProvision(body, xBrokerAPIVersion, instanceId, xBrokerAPIOriginatingIdentity, acceptsIncomplete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceInstancesApi#serviceInstanceProvision");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInstanceProvisionRequestBody**](ServiceInstanceProvisionRequestBody.md)| parameters for the requested service instance provision |
 **xBrokerAPIVersion** | **String**| version number of the Service Broker API that the Platform will use | [default to 2.13]
 **instanceId** | **String**| instance id of instance to provision |
 **xBrokerAPIOriginatingIdentity** | **String**| identity of the user that initiated the request from the Platform | [optional]
 **acceptsIncomplete** | **Boolean**| asynchronous operations supported | [optional]

### Return type

[**ServiceInstanceProvisionResponse**](ServiceInstanceProvisionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="serviceInstanceUpdate"></a>
# **serviceInstanceUpdate**
> Object serviceInstanceUpdate(body, xBrokerAPIVersion, instanceId, xBrokerAPIOriginatingIdentity, acceptsIncomplete)

update a service instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceInstancesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceInstancesApi apiInstance = new ServiceInstancesApi();
ServiceInstanceUpdateRequestBody body = new ServiceInstanceUpdateRequestBody(); // ServiceInstanceUpdateRequestBody | parameters for the requested service instance update
String xBrokerAPIVersion = "2.13"; // String | version number of the Service Broker API that the Platform will use
String instanceId = "instanceId_example"; // String | instance id of instance to update
String xBrokerAPIOriginatingIdentity = "xBrokerAPIOriginatingIdentity_example"; // String | identity of the user that initiated the request from the Platform
Boolean acceptsIncomplete = true; // Boolean | asynchronous operations supported
try {
    Object result = apiInstance.serviceInstanceUpdate(body, xBrokerAPIVersion, instanceId, xBrokerAPIOriginatingIdentity, acceptsIncomplete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceInstancesApi#serviceInstanceUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceInstanceUpdateRequestBody**](ServiceInstanceUpdateRequestBody.md)| parameters for the requested service instance update |
 **xBrokerAPIVersion** | **String**| version number of the Service Broker API that the Platform will use | [default to 2.13]
 **instanceId** | **String**| instance id of instance to update |
 **xBrokerAPIOriginatingIdentity** | **String**| identity of the user that initiated the request from the Platform | [optional]
 **acceptsIncomplete** | **Boolean**| asynchronous operations supported | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

