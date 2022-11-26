/*
 * Open Service Broker API
 * The Open Service Broker API defines an HTTP(S) interface between Platforms and Service Brokers.
 *
 * OpenAPI spec version: master - might contain changes that are not yet released
 * Contact: open-service-broker-api@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ServiceBindingSchema;
import io.swagger.client.model.ServiceInstanceSchema;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Schemas
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-26T09:12:52.714168+05:30[Asia/Kolkata]")
public class Schemas {
  @SerializedName("service_instance")
  private ServiceInstanceSchema serviceInstance = null;

  @SerializedName("service_binding")
  private ServiceBindingSchema serviceBinding = null;

  public Schemas serviceInstance(ServiceInstanceSchema serviceInstance) {
    this.serviceInstance = serviceInstance;
    return this;
  }

   /**
   * Get serviceInstance
   * @return serviceInstance
  **/
  @Schema(description = "")
  public ServiceInstanceSchema getServiceInstance() {
    return serviceInstance;
  }

  public void setServiceInstance(ServiceInstanceSchema serviceInstance) {
    this.serviceInstance = serviceInstance;
  }

  public Schemas serviceBinding(ServiceBindingSchema serviceBinding) {
    this.serviceBinding = serviceBinding;
    return this;
  }

   /**
   * Get serviceBinding
   * @return serviceBinding
  **/
  @Schema(description = "")
  public ServiceBindingSchema getServiceBinding() {
    return serviceBinding;
  }

  public void setServiceBinding(ServiceBindingSchema serviceBinding) {
    this.serviceBinding = serviceBinding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schemas schemas = (Schemas) o;
    return Objects.equals(this.serviceInstance, schemas.serviceInstance) &&
        Objects.equals(this.serviceBinding, schemas.serviceBinding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceInstance, serviceBinding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schemas {\n");
    
    sb.append("    serviceInstance: ").append(toIndentedString(serviceInstance)).append("\n");
    sb.append("    serviceBinding: ").append(toIndentedString(serviceBinding)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
