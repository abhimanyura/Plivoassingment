package channelspojo;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"ok",
"channels",
"response_metadata"
})
public class ChannelListResponse {

@JsonProperty("ok")
private Boolean ok;
@JsonProperty("channels")
private List<Channel> channels = null;
@JsonProperty("response_metadata")
private ResponseMetadata responseMetadata;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("ok")
public Boolean getOk() {
return ok;
}

@JsonProperty("ok")
public void setOk(Boolean ok) {
this.ok = ok;
}

@JsonProperty("channels")
public List<Channel> getChannels() {
return channels;
}

@JsonProperty("channels")
public void setChannels(List<Channel> channels) {
this.channels = channels;
}

@JsonProperty("response_metadata")
public ResponseMetadata getResponseMetadata() {
return responseMetadata;
}

@JsonProperty("response_metadata")
public void setResponseMetadata(ResponseMetadata responseMetadata) {
this.responseMetadata = responseMetadata;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"name",
"is_channel",
"is_group",
"is_im",
"created",
"creator",
"is_archived",
"is_general",
"unlinked",
"name_normalized",
"is_shared",
"is_ext_shared",
"is_org_shared",
"pending_shared",
"is_pending_ext_shared",
"is_member",
"is_private",
"is_mpim",
"topic",
"purpose",
"previous_names",
"num_members"
})
public class Channel {

@JsonProperty("id")
private String id;
@JsonProperty("name")
private String name;
@JsonProperty("is_channel")
private Boolean isChannel;
@JsonProperty("is_group")
private Boolean isGroup;
@JsonProperty("is_im")
private Boolean isIm;
@JsonProperty("created")
private Integer created;
@JsonProperty("creator")
private String creator;
@JsonProperty("is_archived")
private Boolean isArchived;
@JsonProperty("is_general")
private Boolean isGeneral;
@JsonProperty("unlinked")
private Integer unlinked;
@JsonProperty("name_normalized")
private String nameNormalized;
@JsonProperty("is_shared")
private Boolean isShared;
@JsonProperty("is_ext_shared")
private Boolean isExtShared;
@JsonProperty("is_org_shared")
private Boolean isOrgShared;
@JsonProperty("pending_shared")
private List<Object> pendingShared = null;
@JsonProperty("is_pending_ext_shared")
private Boolean isPendingExtShared;
@JsonProperty("is_member")
private Boolean isMember;
@JsonProperty("is_private")
private Boolean isPrivate;
@JsonProperty("is_mpim")
private Boolean isMpim;
@JsonProperty("topic")
private Topic topic;
@JsonProperty("purpose")
private Purpose purpose;
@JsonProperty("previous_names")
private List<Object> previousNames = null;
@JsonProperty("num_members")
private Integer numMembers;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("is_channel")
public Boolean getIsChannel() {
return isChannel;
}

@JsonProperty("is_channel")
public void setIsChannel(Boolean isChannel) {
this.isChannel = isChannel;
}

@JsonProperty("is_group")
public Boolean getIsGroup() {
return isGroup;
}

@JsonProperty("is_group")
public void setIsGroup(Boolean isGroup) {
this.isGroup = isGroup;
}

@JsonProperty("is_im")
public Boolean getIsIm() {
return isIm;
}

@JsonProperty("is_im")
public void setIsIm(Boolean isIm) {
this.isIm = isIm;
}

@JsonProperty("created")
public Integer getCreated() {
return created;
}

@JsonProperty("created")
public void setCreated(Integer created) {
this.created = created;
}

@JsonProperty("creator")
public String getCreator() {
return creator;
}

@JsonProperty("creator")
public void setCreator(String creator) {
this.creator = creator;
}

@JsonProperty("is_archived")
public Boolean getIsArchived() {
return isArchived;
}

@JsonProperty("is_archived")
public void setIsArchived(Boolean isArchived) {
this.isArchived = isArchived;
}

@JsonProperty("is_general")
public Boolean getIsGeneral() {
return isGeneral;
}

@JsonProperty("is_general")
public void setIsGeneral(Boolean isGeneral) {
this.isGeneral = isGeneral;
}

@JsonProperty("unlinked")
public Integer getUnlinked() {
return unlinked;
}

@JsonProperty("unlinked")
public void setUnlinked(Integer unlinked) {
this.unlinked = unlinked;
}

@JsonProperty("name_normalized")
public String getNameNormalized() {
return nameNormalized;
}

@JsonProperty("name_normalized")
public void setNameNormalized(String nameNormalized) {
this.nameNormalized = nameNormalized;
}

@JsonProperty("is_shared")
public Boolean getIsShared() {
return isShared;
}

@JsonProperty("is_shared")
public void setIsShared(Boolean isShared) {
this.isShared = isShared;
}

@JsonProperty("is_ext_shared")
public Boolean getIsExtShared() {
return isExtShared;
}

@JsonProperty("is_ext_shared")
public void setIsExtShared(Boolean isExtShared) {
this.isExtShared = isExtShared;
}

@JsonProperty("is_org_shared")
public Boolean getIsOrgShared() {
return isOrgShared;
}

@JsonProperty("is_org_shared")
public void setIsOrgShared(Boolean isOrgShared) {
this.isOrgShared = isOrgShared;
}

@JsonProperty("pending_shared")
public List<Object> getPendingShared() {
return pendingShared;
}

@JsonProperty("pending_shared")
public void setPendingShared(List<Object> pendingShared) {
this.pendingShared = pendingShared;
}

@JsonProperty("is_pending_ext_shared")
public Boolean getIsPendingExtShared() {
return isPendingExtShared;
}

@JsonProperty("is_pending_ext_shared")
public void setIsPendingExtShared(Boolean isPendingExtShared) {
this.isPendingExtShared = isPendingExtShared;
}

@JsonProperty("is_member")
public Boolean getIsMember() {
return isMember;
}

@JsonProperty("is_member")
public void setIsMember(Boolean isMember) {
this.isMember = isMember;
}

@JsonProperty("is_private")
public Boolean getIsPrivate() {
return isPrivate;
}

@JsonProperty("is_private")
public void setIsPrivate(Boolean isPrivate) {
this.isPrivate = isPrivate;
}

@JsonProperty("is_mpim")
public Boolean getIsMpim() {
return isMpim;
}

@JsonProperty("is_mpim")
public void setIsMpim(Boolean isMpim) {
this.isMpim = isMpim;
}

@JsonProperty("topic")
public Topic getTopic() {
return topic;
}

@JsonProperty("topic")
public void setTopic(Topic topic) {
this.topic = topic;
}

@JsonProperty("purpose")
public Purpose getPurpose() {
return purpose;
}

@JsonProperty("purpose")
public void setPurpose(Purpose purpose) {
this.purpose = purpose;
}

@JsonProperty("previous_names")
public List<Object> getPreviousNames() {
return previousNames;
}

@JsonProperty("previous_names")
public void setPreviousNames(List<Object> previousNames) {
this.previousNames = previousNames;
}

@JsonProperty("num_members")
public Integer getNumMembers() {
return numMembers;
}

@JsonProperty("num_members")
public void setNumMembers(Integer numMembers) {
this.numMembers = numMembers;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"value",
"creator",
"last_set"
})
public class Purpose {

@JsonProperty("value")
private String value;
@JsonProperty("creator")
private String creator;
@JsonProperty("last_set")
private Integer lastSet;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("value")
public String getValue() {
return value;
}

@JsonProperty("value")
public void setValue(String value) {
this.value = value;
}

@JsonProperty("creator")
public String getCreator() {
return creator;
}

@JsonProperty("creator")
public void setCreator(String creator) {
this.creator = creator;
}

@JsonProperty("last_set")
public Integer getLastSet() {
return lastSet;
}

@JsonProperty("last_set")
public void setLastSet(Integer lastSet) {
this.lastSet = lastSet;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"next_cursor"
})
public class ResponseMetadata {

@JsonProperty("next_cursor")
private String nextCursor;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("next_cursor")
public String getNextCursor() {
return nextCursor;
}

@JsonProperty("next_cursor")
public void setNextCursor(String nextCursor) {
this.nextCursor = nextCursor;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"value",
"creator",
"last_set"
})
public class Topic {

@JsonProperty("value")
private String value;
@JsonProperty("creator")
private String creator;
@JsonProperty("last_set")
private Integer lastSet;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("value")
public String getValue() {
return value;
}

@JsonProperty("value")
public void setValue(String value) {
this.value = value;
}

@JsonProperty("creator")
public String getCreator() {
return creator;
}

@JsonProperty("creator")
public void setCreator(String creator) {
this.creator = creator;
}

@JsonProperty("last_set")
public Integer getLastSet() {
return lastSet;
}

@JsonProperty("last_set")
public void setLastSet(Integer lastSet) {
this.lastSet = lastSet;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
}