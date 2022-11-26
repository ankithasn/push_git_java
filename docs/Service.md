# Service

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**id** | **String** |  | 
**description** | **String** |  | 
**tags** | **List&lt;String&gt;** |  |  [optional]
**requires** | [**List&lt;RequiresEnum&gt;**](#List&lt;RequiresEnum&gt;) |  |  [optional]
**bindable** | **Boolean** |  | 
**metadata** | [**Metadata**](Metadata.md) |  |  [optional]
**dashboardClient** | [**DashboardClient**](DashboardClient.md) |  |  [optional]
**bindingRotatable** | **Boolean** |  |  [optional]
**planUpdateable** | **Boolean** |  |  [optional]
**plans** | [**List&lt;Plan&gt;**](Plan.md) |  | 

<a name="List<RequiresEnum>"></a>
## Enum: List&lt;RequiresEnum&gt;
Name | Value
---- | -----
SYSLOG_DRAIN | &quot;syslog_drain&quot;
ROUTE_FORWARDING | &quot;route_forwarding&quot;
VOLUME_MOUNT | &quot;volume_mount&quot;
