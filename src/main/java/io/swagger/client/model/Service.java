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
import io.swagger.client.model.DashboardClient;
import io.swagger.client.model.Metadata;
import io.swagger.client.model.Plan;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Service
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-26T09:12:52.714168+05:30[Asia/Kolkata]")
public class Service {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("tags")
  private List<String> tags = null;

  /**
   * Gets or Sets requires
   */
  @JsonAdapter(RequiresEnum.Adapter.class)
  public enum RequiresEnum {
    SYSLOG_DRAIN("syslog_drain"),
    ROUTE_FORWARDING("route_forwarding"),
    VOLUME_MOUNT("volume_mount");

    private String value;

    RequiresEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RequiresEnum fromValue(String input) {
      for (RequiresEnum b : RequiresEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RequiresEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequiresEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RequiresEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RequiresEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("requires")
  private List<RequiresEnum> requires = null;

  @SerializedName("bindable")
  private Boolean bindable = null;

  @SerializedName("metadata")
  private Metadata metadata = null;

  @SerializedName("dashboard_client")
  private DashboardClient dashboardClient = null;

  @SerializedName("binding_rotatable")
  private Boolean bindingRotatable = null;

  @SerializedName("plan_updateable")
  private Boolean planUpdateable = null;

  @SerializedName("plans")
  private List<Plan> plans = new ArrayList<Plan>();

  public Service name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Service id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Service description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Service tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Service addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Service requires(List<RequiresEnum> requires) {
    this.requires = requires;
    return this;
  }

  public Service addRequiresItem(RequiresEnum requiresItem) {
    if (this.requires == null) {
      this.requires = new ArrayList<RequiresEnum>();
    }
    this.requires.add(requiresItem);
    return this;
  }

   /**
   * Get requires
   * @return requires
  **/
  @Schema(description = "")
  public List<RequiresEnum> getRequires() {
    return requires;
  }

  public void setRequires(List<RequiresEnum> requires) {
    this.requires = requires;
  }

  public Service bindable(Boolean bindable) {
    this.bindable = bindable;
    return this;
  }

   /**
   * Get bindable
   * @return bindable
  **/
  @Schema(required = true, description = "")
  public Boolean isBindable() {
    return bindable;
  }

  public void setBindable(Boolean bindable) {
    this.bindable = bindable;
  }

  public Service metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public Service dashboardClient(DashboardClient dashboardClient) {
    this.dashboardClient = dashboardClient;
    return this;
  }

   /**
   * Get dashboardClient
   * @return dashboardClient
  **/
  @Schema(description = "")
  public DashboardClient getDashboardClient() {
    return dashboardClient;
  }

  public void setDashboardClient(DashboardClient dashboardClient) {
    this.dashboardClient = dashboardClient;
  }

  public Service bindingRotatable(Boolean bindingRotatable) {
    this.bindingRotatable = bindingRotatable;
    return this;
  }

   /**
   * Get bindingRotatable
   * @return bindingRotatable
  **/
  @Schema(description = "")
  public Boolean isBindingRotatable() {
    return bindingRotatable;
  }

  public void setBindingRotatable(Boolean bindingRotatable) {
    this.bindingRotatable = bindingRotatable;
  }

  public Service planUpdateable(Boolean planUpdateable) {
    this.planUpdateable = planUpdateable;
    return this;
  }

   /**
   * Get planUpdateable
   * @return planUpdateable
  **/
  @Schema(description = "")
  public Boolean isPlanUpdateable() {
    return planUpdateable;
  }

  public void setPlanUpdateable(Boolean planUpdateable) {
    this.planUpdateable = planUpdateable;
  }

  public Service plans(List<Plan> plans) {
    this.plans = plans;
    return this;
  }

  public Service addPlansItem(Plan plansItem) {
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Get plans
   * @return plans
  **/
  @Schema(required = true, description = "")
  public List<Plan> getPlans() {
    return plans;
  }

  public void setPlans(List<Plan> plans) {
    this.plans = plans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.name, service.name) &&
        Objects.equals(this.id, service.id) &&
        Objects.equals(this.description, service.description) &&
        Objects.equals(this.tags, service.tags) &&
        Objects.equals(this.requires, service.requires) &&
        Objects.equals(this.bindable, service.bindable) &&
        Objects.equals(this.metadata, service.metadata) &&
        Objects.equals(this.dashboardClient, service.dashboardClient) &&
        Objects.equals(this.bindingRotatable, service.bindingRotatable) &&
        Objects.equals(this.planUpdateable, service.planUpdateable) &&
        Objects.equals(this.plans, service.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, description, tags, requires, bindable, metadata, dashboardClient, bindingRotatable, planUpdateable, plans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    requires: ").append(toIndentedString(requires)).append("\n");
    sb.append("    bindable: ").append(toIndentedString(bindable)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dashboardClient: ").append(toIndentedString(dashboardClient)).append("\n");
    sb.append("    bindingRotatable: ").append(toIndentedString(bindingRotatable)).append("\n");
    sb.append("    planUpdateable: ").append(toIndentedString(planUpdateable)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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
