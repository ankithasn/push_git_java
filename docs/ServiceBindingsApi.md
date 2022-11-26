# ServiceBindingsApi

All URIs are relative to *http://example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceBindingBinding**](ServiceBindingsApi.md#serviceBindingBinding) | **PUT** /v2/service_instances/{instance_id}/service_bindings/{binding_id} | generate a service binding
[**serviceBindingGet**](ServiceBindingsApi.md#serviceBindingGet) | **GET** /v2/service_instances/{instance_id}/service_bindings/{binding_id} | get a service binding
[**serviceBindingLastOperationGet**](ServiceBindingsApi.md#serviceBindingLastOperationGet) | **GET** /v2/service_instances/{instance_id}/service_bindings/{binding_id}/last_operation | get the last requested operation state for service binding
[**serviceBindingUnbinding**](ServiceBindingsApi.md#serviceBindingUnbinding) | **DELETE** /v2/service_instances/{instance_id}/service_bindings/{binding_id} | deprovision a service binding

<a name="serviceBindingBinding"></a>
# **serviceBindingBinding**
> ServiceBindingResponse serviceBindingBinding(body, xBrokerAPIVersion, instanceId, bindingId, xBrokerAPIOriginatingIdentity, acceptsIncomplete)

generate a service binding

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceBindingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceBindingsApi apiInstance = new ServiceBindingsApi();
ServiceBindingRequest body = new ServiceBindingRequest(); // ServiceBindingRequest | parameters for the requested service binding
String xBrokerAPIVersion = "2.13"; // String | version number of the Service Broker API that the Platform will use
String instanceId = "instanceId_example"; // String | instance id of instance to create a binding on
String bindingId = "bindingId_example"; // String | binding id of binding to create
String xBrokerAPIOriginatingIdentity = "xBrokerAPIOriginatingIdentity_example"; // String | identity of the user that initiated the request from the Platform
Boolean acceptsIncomplete = true; // Boolean | asynchronous operations supported
try {
    ServiceBindingResponse result = apiInstance.serviceBindingBinding(body, xBrokerAPIVersion, instanceId, bindingId, xBrokerAPIOriginatingIdentity, acceptsIncomplete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceBindingsApi#serviceBindingBinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceBindingRequest**](ServiceBindingRequest.md)| parameters for the requested service binding |
 **xBrokerAPIVersion** | **String**| version number of the Service Broker API that the Platform will use | [default to 2.13]
 **instanceId** | **String**| instance id of instance to create a binding on |
 **bindingId** | **String**| binding id of binding to create |
 **xBrokerAPIOriginatingIdentity** | **String**| identity of the user that initiated the request from the Platform | [optional]
 **acceptsIncomplete** | **Boolean**| asynchronous operations supported | [optional]

### Return type

[**ServiceBindingResponse**](ServiceBindingResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="serviceBindingGet"></a>
# **serviceBindingGet**
> ServiceBindingResource serviceBindingGet(xBrokerAPIVersion, instanceId, bindingId, xBrokerAPIOriginatingIdentity, serviceId, planId)

get a service binding

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceBindingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceBindingsApi apiInstance = new ServiceBindingsApi();
String xBrokerAPIVersion = "2.13"; // String | version number of the Service Broker API that the Platform will use
String instanceId = "instanceId_example"; // String | instance id of instance associated with the binding
String bindingId = "bindingId_example"; // String | binding id of binding to fetch
String xBrokerAPIOriginatingIdentity = "xBrokerAPIOriginatingIdentity_example"; // String | identity of the user that initiated the request from the Platform
String serviceId = "serviceId_example"; // String | id of the service associated with the instance
String planId = "planId_example"; // String | id of the plan associated with the instance
try {
    ServiceBindingResource result = apiInstance.serviceBindingGet(xBrokerAPIVersion, instanceId, bindingId, xBrokerAPIOriginatingIdentity, serviceId, planId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceBindingsApi#serviceBindingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xBrokerAPIVersion** | **String**| version number of the Service Broker API that the Platform will use | [default to 2.13]
 **instanceId** | **String**| instance id of instance associated with the binding |
 **bindingId** | **String**| binding id of binding to fetch |
 **xBrokerAPIOriginatingIdentity** | **String**| identity of the user that initiated the request from the Platform | [optional]
 **serviceId** | **String**| id of the service associated with the instance | [optional]
 **planId** | **String**| id of the plan associated with the instance | [optional]

### Return type

[**ServiceBindingResource**](ServiceBindingResource.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="serviceBindingLastOperationGet"></a>
# **serviceBindingLastOperationGet**
> LastOperationResource serviceBindingLastOperationGet(xBrokerAPIVersion, instanceId, bindingId, serviceId, planId, operation)

get the last requested operation state for service binding

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceBindingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceBindingsApi apiInstance = new ServiceBindingsApi();
String xBrokerAPIVersion = "2.13"; // String | version number of the Service Broker API that the Platform will use
String instanceId = "instanceId_example"; // String | instance id of instance to find last operation applied to it
String bindingId = "bindingId_example"; // String | binding id of service binding to find last operation applied to it
String serviceId = "serviceId_example"; // String | id of the service associated with the instance
String planId = "planId_example"; // String | id of the plan associated with the instance
String operation = "operation_example"; // String | a provided identifier for the operation
try {
    LastOperationResource result = apiInstance.serviceBindingLastOperationGet(xBrokerAPIVersion, instanceId, bindingId, serviceId, planId, operation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceBindingsApi#serviceBindingLastOperationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xBrokerAPIVersion** | **String**| version number of the Service Broker API that the Platform will use | [default to 2.13]
 **instanceId** | **String**| instance id of instance to find last operation applied to it |
 **bindingId** | **String**| binding id of service binding to find last operation applied to it |
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

<a name="serviceBindingUnbinding"></a>
# **serviceBindingUnbinding**
> Object serviceBindingUnbinding(xBrokerAPIVersion, instanceId, bindingId, serviceId, planId, xBrokerAPIOriginatingIdentity, acceptsIncomplete)

deprovision a service binding

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ServiceBindingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceBindingsApi apiInstance = new ServiceBindingsApi();
String xBrokerAPIVersion = "2.13"; // String | version number of the Service Broker API that the Platform will use
String instanceId = "instanceId_example"; // String | id of the instance associated with the binding being deleted
String bindingId = "bindingId_example"; // String | id of the binding being deleted
String serviceId = "serviceId_example"; // String | id of the service associated with the instance for which a binding is being deleted
String planId = "planId_example"; // String | id of the plan associated with the instance for which a binding is being deleted
String xBrokerAPIOriginatingIdentity = "xBrokerAPIOriginatingIdentity_example"; // String | identity of the user that initiated the request from the Platform
Boolean acceptsIncomplete = true; // Boolean | asynchronous operations supported
try {
    Object result = apiInstance.serviceBindingUnbinding(xBrokerAPIVersion, instanceId, bindingId, serviceId, planId, xBrokerAPIOriginatingIdentity, acceptsIncomplete);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceBindingsApi#serviceBindingUnbinding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xBrokerAPIVersion** | **String**| version number of the Service Broker API that the Platform will use | [default to 2.13]
 **instanceId** | **String**| id of the instance associated with the binding being deleted |
 **bindingId** | **String**| id of the binding being deleted |
 **serviceId** | **String**| id of the service associated with the instance for which a binding is being deleted |
 **planId** | **String**| id of the plan associated with the instance for which a binding is being deleted |
 **xBrokerAPIOriginatingIdentity** | **String**| identity of the user that initiated the request from the Platform | [optional]
 **acceptsIncomplete** | **Boolean**| asynchronous operations supported | [optional]

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

