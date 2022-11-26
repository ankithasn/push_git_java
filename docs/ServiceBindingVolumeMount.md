# ServiceBindingVolumeMount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driver** | **String** |  | 
**containerDir** | **String** |  | 
**mode** | [**ModeEnum**](#ModeEnum) |  | 
**deviceType** | [**DeviceTypeEnum**](#DeviceTypeEnum) |  | 
**device** | [**ServiceBindingVolumeMountDevice**](ServiceBindingVolumeMountDevice.md) |  | 

<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
R | &quot;r&quot;
RW | &quot;rw&quot;

<a name="DeviceTypeEnum"></a>
## Enum: DeviceTypeEnum
Name | Value
---- | -----
SHARED | &quot;shared&quot;
