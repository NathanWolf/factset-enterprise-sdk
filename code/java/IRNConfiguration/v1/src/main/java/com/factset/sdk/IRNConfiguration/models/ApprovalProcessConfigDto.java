/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNConfiguration.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IRNConfiguration.models.ApprovalLevelConfigDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.IRNConfiguration.JSON;


/**
 * ApprovalProcessConfigDto
 */
@JsonPropertyOrder({
  ApprovalProcessConfigDto.JSON_PROPERTY_APPROVAL_LEVELS,
  ApprovalProcessConfigDto.JSON_PROPERTY_VIEWER_IDS,
  ApprovalProcessConfigDto.JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_WHEN_SUBMITTED_FOR_APPROVAL,
  ApprovalProcessConfigDto.JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_WHEN_APPROVED,
  ApprovalProcessConfigDto.JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_WHEN_DENIED,
  ApprovalProcessConfigDto.JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_AUTHOR,
  ApprovalProcessConfigDto.JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_APPROVERS,
  ApprovalProcessConfigDto.JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_VIEWERS,
  ApprovalProcessConfigDto.JSON_PROPERTY_CAN_AUTHOR_SELF_APPROVE,
  ApprovalProcessConfigDto.JSON_PROPERTY_CAN_AUTHOR_EDIT_PENDING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApprovalProcessConfigDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_APPROVAL_LEVELS = "approvalLevels";
  private JsonNullable<java.util.List<ApprovalLevelConfigDto>> approvalLevels = JsonNullable.<java.util.List<ApprovalLevelConfigDto>>undefined();

  public static final String JSON_PROPERTY_VIEWER_IDS = "viewerIds";
  private JsonNullable<java.util.List<java.util.UUID>> viewerIds = JsonNullable.<java.util.List<java.util.UUID>>undefined();

  public static final String JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_WHEN_SUBMITTED_FOR_APPROVAL = "shouldSendEmailAlertsWhenSubmittedForApproval";
  private Boolean shouldSendEmailAlertsWhenSubmittedForApproval;

  public static final String JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_WHEN_APPROVED = "shouldSendEmailAlertsWhenApproved";
  private Boolean shouldSendEmailAlertsWhenApproved;

  public static final String JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_WHEN_DENIED = "shouldSendEmailAlertsWhenDenied";
  private Boolean shouldSendEmailAlertsWhenDenied;

  public static final String JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_AUTHOR = "shouldSendEmailAlertsToAuthor";
  private Boolean shouldSendEmailAlertsToAuthor;

  public static final String JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_APPROVERS = "shouldSendEmailAlertsToApprovers";
  private Boolean shouldSendEmailAlertsToApprovers;

  public static final String JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_VIEWERS = "shouldSendEmailAlertsToViewers";
  private Boolean shouldSendEmailAlertsToViewers;

  public static final String JSON_PROPERTY_CAN_AUTHOR_SELF_APPROVE = "canAuthorSelfApprove";
  private Boolean canAuthorSelfApprove;

  public static final String JSON_PROPERTY_CAN_AUTHOR_EDIT_PENDING = "canAuthorEditPending";
  private Boolean canAuthorEditPending;

  public ApprovalProcessConfigDto() { 
  }

  public ApprovalProcessConfigDto approvalLevels(java.util.List<ApprovalLevelConfigDto> approvalLevels) {
    this.approvalLevels = JsonNullable.<java.util.List<ApprovalLevelConfigDto>>of(approvalLevels);
    return this;
  }

  public ApprovalProcessConfigDto addApprovalLevelsItem(ApprovalLevelConfigDto approvalLevelsItem) {
    if (this.approvalLevels == null || !this.approvalLevels.isPresent()) {
      this.approvalLevels = JsonNullable.<java.util.List<ApprovalLevelConfigDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.approvalLevels.get().add(approvalLevelsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get approvalLevels
   * @return approvalLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<ApprovalLevelConfigDto> getApprovalLevels() {
        return approvalLevels.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPROVAL_LEVELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<ApprovalLevelConfigDto>> getApprovalLevels_JsonNullable() {
    return approvalLevels;
  }
  
  @JsonProperty(JSON_PROPERTY_APPROVAL_LEVELS)
  public void setApprovalLevels_JsonNullable(JsonNullable<java.util.List<ApprovalLevelConfigDto>> approvalLevels) {
    this.approvalLevels = approvalLevels;
  }

  public void setApprovalLevels(java.util.List<ApprovalLevelConfigDto> approvalLevels) {
    this.approvalLevels = JsonNullable.<java.util.List<ApprovalLevelConfigDto>>of(approvalLevels);
  }


  public ApprovalProcessConfigDto viewerIds(java.util.List<java.util.UUID> viewerIds) {
    this.viewerIds = JsonNullable.<java.util.List<java.util.UUID>>of(viewerIds);
    return this;
  }

  public ApprovalProcessConfigDto addViewerIdsItem(java.util.UUID viewerIdsItem) {
    if (this.viewerIds == null || !this.viewerIds.isPresent()) {
      this.viewerIds = JsonNullable.<java.util.List<java.util.UUID>>of(new java.util.ArrayList<>());
    }
    try {
      this.viewerIds.get().add(viewerIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get viewerIds
   * @return viewerIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<java.util.UUID> getViewerIds() {
        return viewerIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VIEWER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<java.util.UUID>> getViewerIds_JsonNullable() {
    return viewerIds;
  }
  
  @JsonProperty(JSON_PROPERTY_VIEWER_IDS)
  public void setViewerIds_JsonNullable(JsonNullable<java.util.List<java.util.UUID>> viewerIds) {
    this.viewerIds = viewerIds;
  }

  public void setViewerIds(java.util.List<java.util.UUID> viewerIds) {
    this.viewerIds = JsonNullable.<java.util.List<java.util.UUID>>of(viewerIds);
  }


  public ApprovalProcessConfigDto shouldSendEmailAlertsWhenSubmittedForApproval(Boolean shouldSendEmailAlertsWhenSubmittedForApproval) {
    this.shouldSendEmailAlertsWhenSubmittedForApproval = shouldSendEmailAlertsWhenSubmittedForApproval;
    return this;
  }

   /**
   * Get shouldSendEmailAlertsWhenSubmittedForApproval
   * @return shouldSendEmailAlertsWhenSubmittedForApproval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_WHEN_SUBMITTED_FOR_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldSendEmailAlertsWhenSubmittedForApproval() {
    return shouldSendEmailAlertsWhenSubmittedForApproval;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_WHEN_SUBMITTED_FOR_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldSendEmailAlertsWhenSubmittedForApproval(Boolean shouldSendEmailAlertsWhenSubmittedForApproval) {
    this.shouldSendEmailAlertsWhenSubmittedForApproval = shouldSendEmailAlertsWhenSubmittedForApproval;
  }


  public ApprovalProcessConfigDto shouldSendEmailAlertsWhenApproved(Boolean shouldSendEmailAlertsWhenApproved) {
    this.shouldSendEmailAlertsWhenApproved = shouldSendEmailAlertsWhenApproved;
    return this;
  }

   /**
   * Get shouldSendEmailAlertsWhenApproved
   * @return shouldSendEmailAlertsWhenApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_WHEN_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldSendEmailAlertsWhenApproved() {
    return shouldSendEmailAlertsWhenApproved;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_WHEN_APPROVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldSendEmailAlertsWhenApproved(Boolean shouldSendEmailAlertsWhenApproved) {
    this.shouldSendEmailAlertsWhenApproved = shouldSendEmailAlertsWhenApproved;
  }


  public ApprovalProcessConfigDto shouldSendEmailAlertsWhenDenied(Boolean shouldSendEmailAlertsWhenDenied) {
    this.shouldSendEmailAlertsWhenDenied = shouldSendEmailAlertsWhenDenied;
    return this;
  }

   /**
   * Get shouldSendEmailAlertsWhenDenied
   * @return shouldSendEmailAlertsWhenDenied
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_WHEN_DENIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldSendEmailAlertsWhenDenied() {
    return shouldSendEmailAlertsWhenDenied;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_WHEN_DENIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldSendEmailAlertsWhenDenied(Boolean shouldSendEmailAlertsWhenDenied) {
    this.shouldSendEmailAlertsWhenDenied = shouldSendEmailAlertsWhenDenied;
  }


  public ApprovalProcessConfigDto shouldSendEmailAlertsToAuthor(Boolean shouldSendEmailAlertsToAuthor) {
    this.shouldSendEmailAlertsToAuthor = shouldSendEmailAlertsToAuthor;
    return this;
  }

   /**
   * Get shouldSendEmailAlertsToAuthor
   * @return shouldSendEmailAlertsToAuthor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldSendEmailAlertsToAuthor() {
    return shouldSendEmailAlertsToAuthor;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldSendEmailAlertsToAuthor(Boolean shouldSendEmailAlertsToAuthor) {
    this.shouldSendEmailAlertsToAuthor = shouldSendEmailAlertsToAuthor;
  }


  public ApprovalProcessConfigDto shouldSendEmailAlertsToApprovers(Boolean shouldSendEmailAlertsToApprovers) {
    this.shouldSendEmailAlertsToApprovers = shouldSendEmailAlertsToApprovers;
    return this;
  }

   /**
   * Get shouldSendEmailAlertsToApprovers
   * @return shouldSendEmailAlertsToApprovers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_APPROVERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldSendEmailAlertsToApprovers() {
    return shouldSendEmailAlertsToApprovers;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_APPROVERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldSendEmailAlertsToApprovers(Boolean shouldSendEmailAlertsToApprovers) {
    this.shouldSendEmailAlertsToApprovers = shouldSendEmailAlertsToApprovers;
  }


  public ApprovalProcessConfigDto shouldSendEmailAlertsToViewers(Boolean shouldSendEmailAlertsToViewers) {
    this.shouldSendEmailAlertsToViewers = shouldSendEmailAlertsToViewers;
    return this;
  }

   /**
   * Get shouldSendEmailAlertsToViewers
   * @return shouldSendEmailAlertsToViewers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_VIEWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldSendEmailAlertsToViewers() {
    return shouldSendEmailAlertsToViewers;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_VIEWERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldSendEmailAlertsToViewers(Boolean shouldSendEmailAlertsToViewers) {
    this.shouldSendEmailAlertsToViewers = shouldSendEmailAlertsToViewers;
  }


  public ApprovalProcessConfigDto canAuthorSelfApprove(Boolean canAuthorSelfApprove) {
    this.canAuthorSelfApprove = canAuthorSelfApprove;
    return this;
  }

   /**
   * Get canAuthorSelfApprove
   * @return canAuthorSelfApprove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAN_AUTHOR_SELF_APPROVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanAuthorSelfApprove() {
    return canAuthorSelfApprove;
  }


  @JsonProperty(JSON_PROPERTY_CAN_AUTHOR_SELF_APPROVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanAuthorSelfApprove(Boolean canAuthorSelfApprove) {
    this.canAuthorSelfApprove = canAuthorSelfApprove;
  }


  public ApprovalProcessConfigDto canAuthorEditPending(Boolean canAuthorEditPending) {
    this.canAuthorEditPending = canAuthorEditPending;
    return this;
  }

   /**
   * Get canAuthorEditPending
   * @return canAuthorEditPending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAN_AUTHOR_EDIT_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanAuthorEditPending() {
    return canAuthorEditPending;
  }


  @JsonProperty(JSON_PROPERTY_CAN_AUTHOR_EDIT_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanAuthorEditPending(Boolean canAuthorEditPending) {
    this.canAuthorEditPending = canAuthorEditPending;
  }


  /**
   * Return true if this ApprovalProcessConfigDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalProcessConfigDto approvalProcessConfigDto = (ApprovalProcessConfigDto) o;
    return equalsNullable(this.approvalLevels, approvalProcessConfigDto.approvalLevels) &&
        equalsNullable(this.viewerIds, approvalProcessConfigDto.viewerIds) &&
        Objects.equals(this.shouldSendEmailAlertsWhenSubmittedForApproval, approvalProcessConfigDto.shouldSendEmailAlertsWhenSubmittedForApproval) &&
        Objects.equals(this.shouldSendEmailAlertsWhenApproved, approvalProcessConfigDto.shouldSendEmailAlertsWhenApproved) &&
        Objects.equals(this.shouldSendEmailAlertsWhenDenied, approvalProcessConfigDto.shouldSendEmailAlertsWhenDenied) &&
        Objects.equals(this.shouldSendEmailAlertsToAuthor, approvalProcessConfigDto.shouldSendEmailAlertsToAuthor) &&
        Objects.equals(this.shouldSendEmailAlertsToApprovers, approvalProcessConfigDto.shouldSendEmailAlertsToApprovers) &&
        Objects.equals(this.shouldSendEmailAlertsToViewers, approvalProcessConfigDto.shouldSendEmailAlertsToViewers) &&
        Objects.equals(this.canAuthorSelfApprove, approvalProcessConfigDto.canAuthorSelfApprove) &&
        Objects.equals(this.canAuthorEditPending, approvalProcessConfigDto.canAuthorEditPending);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(approvalLevels), hashCodeNullable(viewerIds), shouldSendEmailAlertsWhenSubmittedForApproval, shouldSendEmailAlertsWhenApproved, shouldSendEmailAlertsWhenDenied, shouldSendEmailAlertsToAuthor, shouldSendEmailAlertsToApprovers, shouldSendEmailAlertsToViewers, canAuthorSelfApprove, canAuthorEditPending);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalProcessConfigDto {\n");
    sb.append("    approvalLevels: ").append(toIndentedString(approvalLevels)).append("\n");
    sb.append("    viewerIds: ").append(toIndentedString(viewerIds)).append("\n");
    sb.append("    shouldSendEmailAlertsWhenSubmittedForApproval: ").append(toIndentedString(shouldSendEmailAlertsWhenSubmittedForApproval)).append("\n");
    sb.append("    shouldSendEmailAlertsWhenApproved: ").append(toIndentedString(shouldSendEmailAlertsWhenApproved)).append("\n");
    sb.append("    shouldSendEmailAlertsWhenDenied: ").append(toIndentedString(shouldSendEmailAlertsWhenDenied)).append("\n");
    sb.append("    shouldSendEmailAlertsToAuthor: ").append(toIndentedString(shouldSendEmailAlertsToAuthor)).append("\n");
    sb.append("    shouldSendEmailAlertsToApprovers: ").append(toIndentedString(shouldSendEmailAlertsToApprovers)).append("\n");
    sb.append("    shouldSendEmailAlertsToViewers: ").append(toIndentedString(shouldSendEmailAlertsToViewers)).append("\n");
    sb.append("    canAuthorSelfApprove: ").append(toIndentedString(canAuthorSelfApprove)).append("\n");
    sb.append("    canAuthorEditPending: ").append(toIndentedString(canAuthorEditPending)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

