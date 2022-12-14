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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ServiceBindingEndpoint
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-26T09:12:52.714168+05:30[Asia/Kolkata]")
public class ServiceBindingEndpoint {
  @SerializedName("host")
  private String host = null;

  @SerializedName("ports")
  private List<String> ports = new ArrayList<String>();

  /**
   * Gets or Sets protocol
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    TCP("tcp"),
    UDP("udp"),
    ALL("all");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProtocolEnum fromValue(String input) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProtocolEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("protocol")
  private ProtocolEnum protocol = ProtocolEnum.TCP;

  public ServiceBindingEndpoint host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(required = true, description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public ServiceBindingEndpoint ports(List<String> ports) {
    this.ports = ports;
    return this;
  }

  public ServiceBindingEndpoint addPortsItem(String portsItem) {
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Get ports
   * @return ports
  **/
  @Schema(required = true, description = "")
  public List<String> getPorts() {
    return ports;
  }

  public void setPorts(List<String> ports) {
    this.ports = ports;
  }

  public ServiceBindingEndpoint protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBindingEndpoint serviceBindingEndpoint = (ServiceBindingEndpoint) o;
    return Objects.equals(this.host, serviceBindingEndpoint.host) &&
        Objects.equals(this.ports, serviceBindingEndpoint.ports) &&
        Objects.equals(this.protocol, serviceBindingEndpoint.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, ports, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBindingEndpoint {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
