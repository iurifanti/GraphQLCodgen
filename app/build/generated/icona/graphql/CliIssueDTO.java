package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliIssueDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String sourceRequestReference;
    @javax.validation.constraints.NotNull
    private String userMessage;
    @javax.validation.constraints.NotNull
    private CliIssueLevelDTO issueLevel;
    private CliIssueReferenceTypeDTO issueReferenceType;
    @javax.validation.constraints.NotNull
    private CliIssueTypeDTO issueType;
    private String entityID;
    private String _clientId;
    private String entityName;
    private java.util.List<String> attributeNames;
    private java.util.List<String> roleNames;
    @javax.validation.constraints.NotNull
    private String applicationName;
    @javax.validation.constraints.NotNull
    private String profileName;
    @javax.validation.constraints.NotNull
    private String traceId;

    public CliIssueDTO() {
    }


    public String getSourceRequestReference() {
        return sourceRequestReference;
    }
    public void setSourceRequestReference(String sourceRequestReference) {
        this.sourceRequestReference = sourceRequestReference;
    }

    public String getUserMessage() {
        return userMessage;
    }
    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public CliIssueLevelDTO getIssueLevel() {
        return issueLevel;
    }
    public void setIssueLevel(CliIssueLevelDTO issueLevel) {
        this.issueLevel = issueLevel;
    }

    public CliIssueReferenceTypeDTO getIssueReferenceType() {
        return issueReferenceType;
    }
    public void setIssueReferenceType(CliIssueReferenceTypeDTO issueReferenceType) {
        this.issueReferenceType = issueReferenceType;
    }

    public CliIssueTypeDTO getIssueType() {
        return issueType;
    }
    public void setIssueType(CliIssueTypeDTO issueType) {
        this.issueType = issueType;
    }

    public String getEntityID() {
        return entityID;
    }
    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public String getEntityName() {
        return entityName;
    }
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public java.util.List<String> getAttributeNames() {
        return attributeNames;
    }
    public void setAttributeNames(java.util.List<String> attributeNames) {
        this.attributeNames = attributeNames;
    }

    public java.util.List<String> getRoleNames() {
        return roleNames;
    }
    public void setRoleNames(java.util.List<String> roleNames) {
        this.roleNames = roleNames;
    }

    public String getApplicationName() {
        return applicationName;
    }
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getProfileName() {
        return profileName;
    }
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getTraceId() {
        return traceId;
    }
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (sourceRequestReference != null) {
            joiner.add("sourceRequestReference: " + GraphQLRequestSerializer.getEntry(sourceRequestReference));
        }
        if (userMessage != null) {
            joiner.add("userMessage: " + GraphQLRequestSerializer.getEntry(userMessage));
        }
        if (issueLevel != null) {
            joiner.add("issueLevel: " + GraphQLRequestSerializer.getEntry(issueLevel));
        }
        if (issueReferenceType != null) {
            joiner.add("issueReferenceType: " + GraphQLRequestSerializer.getEntry(issueReferenceType));
        }
        if (issueType != null) {
            joiner.add("issueType: " + GraphQLRequestSerializer.getEntry(issueType));
        }
        if (entityID != null) {
            joiner.add("entityID: " + GraphQLRequestSerializer.getEntry(entityID));
        }
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (entityName != null) {
            joiner.add("entityName: " + GraphQLRequestSerializer.getEntry(entityName));
        }
        if (attributeNames != null) {
            joiner.add("attributeNames: " + GraphQLRequestSerializer.getEntry(attributeNames));
        }
        if (roleNames != null) {
            joiner.add("roleNames: " + GraphQLRequestSerializer.getEntry(roleNames));
        }
        if (applicationName != null) {
            joiner.add("applicationName: " + GraphQLRequestSerializer.getEntry(applicationName));
        }
        if (profileName != null) {
            joiner.add("profileName: " + GraphQLRequestSerializer.getEntry(profileName));
        }
        if (traceId != null) {
            joiner.add("traceId: " + GraphQLRequestSerializer.getEntry(traceId));
        }
        return joiner.toString();
    }

    public static CliIssueDTO.Builder builder() {
        return new CliIssueDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String sourceRequestReference;
        private String userMessage;
        private CliIssueLevelDTO issueLevel;
        private CliIssueReferenceTypeDTO issueReferenceType;
        private CliIssueTypeDTO issueType;
        private String entityID;
        private String _clientId;
        private String entityName;
        private java.util.List<String> attributeNames;
        private java.util.List<String> roleNames;
        private String applicationName;
        private String profileName;
        private String traceId;

        public Builder() {
        }

        public Builder setSourceRequestReference(String sourceRequestReference) {
            this.sourceRequestReference = sourceRequestReference;
            return this;
        }

        public Builder setUserMessage(String userMessage) {
            this.userMessage = userMessage;
            return this;
        }

        public Builder setIssueLevel(CliIssueLevelDTO issueLevel) {
            this.issueLevel = issueLevel;
            return this;
        }

        public Builder setIssueReferenceType(CliIssueReferenceTypeDTO issueReferenceType) {
            this.issueReferenceType = issueReferenceType;
            return this;
        }

        public Builder setIssueType(CliIssueTypeDTO issueType) {
            this.issueType = issueType;
            return this;
        }

        public Builder setEntityID(String entityID) {
            this.entityID = entityID;
            return this;
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }

        public Builder setAttributeNames(java.util.List<String> attributeNames) {
            this.attributeNames = attributeNames;
            return this;
        }

        public Builder setRoleNames(java.util.List<String> roleNames) {
            this.roleNames = roleNames;
            return this;
        }

        public Builder setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = profileName;
            return this;
        }

        public Builder setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }


        public CliIssueDTO build() {
            CliIssueDTO result = new CliIssueDTO();
            result.setSourceRequestReference(this.sourceRequestReference);
            result.setUserMessage(this.userMessage);
            result.setIssueLevel(this.issueLevel);
            result.setIssueReferenceType(this.issueReferenceType);
            result.setIssueType(this.issueType);
            result.setEntityID(this.entityID);
            result.set_clientId(this._clientId);
            result.setEntityName(this.entityName);
            result.setAttributeNames(this.attributeNames);
            result.setRoleNames(this.roleNames);
            result.setApplicationName(this.applicationName);
            result.setProfileName(this.profileName);
            result.setTraceId(this.traceId);
            return result;
        }

    }
}
