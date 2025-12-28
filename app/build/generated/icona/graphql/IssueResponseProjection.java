package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Issue
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class IssueResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public IssueResponseProjection() {
    }

    public IssueResponseProjection(IssueResponseProjection projection) {
        super(projection);
    }

    public IssueResponseProjection(List<IssueResponseProjection> projections) {
        super(projections);
    }

    public IssueResponseProjection all$() {
        return all$(3);
    }

    public IssueResponseProjection all$(int maxDepth) {
        this.sourceRequestReference();
        this.userMessage();
        this.issueLevel();
        this.issueReferenceType();
        this.issueType();
        this.entityID();
        this._clientId();
        this.entityName();
        this.attributeNames();
        this.roleNames();
        this.applicationName();
        this.profileName();
        this.traceId();
        this.typename();
        return this;
    }

    public IssueResponseProjection sourceRequestReference() {
        return sourceRequestReference(null);
    }

    public IssueResponseProjection sourceRequestReference(String alias) {
        add$(new GraphQLResponseField("sourceRequestReference").alias(alias));
        return this;
    }

    public IssueResponseProjection userMessage() {
        return userMessage(null);
    }

    public IssueResponseProjection userMessage(String alias) {
        add$(new GraphQLResponseField("userMessage").alias(alias));
        return this;
    }

    public IssueResponseProjection issueLevel() {
        return issueLevel(null);
    }

    public IssueResponseProjection issueLevel(String alias) {
        add$(new GraphQLResponseField("issueLevel").alias(alias));
        return this;
    }

    public IssueResponseProjection issueReferenceType() {
        return issueReferenceType(null);
    }

    public IssueResponseProjection issueReferenceType(String alias) {
        add$(new GraphQLResponseField("issueReferenceType").alias(alias));
        return this;
    }

    public IssueResponseProjection issueType() {
        return issueType(null);
    }

    public IssueResponseProjection issueType(String alias) {
        add$(new GraphQLResponseField("issueType").alias(alias));
        return this;
    }

    public IssueResponseProjection entityID() {
        return entityID(null);
    }

    public IssueResponseProjection entityID(String alias) {
        add$(new GraphQLResponseField("entityID").alias(alias));
        return this;
    }

    public IssueResponseProjection _clientId() {
        return _clientId(null);
    }

    public IssueResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public IssueResponseProjection entityName() {
        return entityName(null);
    }

    public IssueResponseProjection entityName(String alias) {
        add$(new GraphQLResponseField("entityName").alias(alias));
        return this;
    }

    public IssueResponseProjection attributeNames() {
        return attributeNames(null);
    }

    public IssueResponseProjection attributeNames(String alias) {
        add$(new GraphQLResponseField("attributeNames").alias(alias));
        return this;
    }

    public IssueResponseProjection roleNames() {
        return roleNames(null);
    }

    public IssueResponseProjection roleNames(String alias) {
        add$(new GraphQLResponseField("roleNames").alias(alias));
        return this;
    }

    public IssueResponseProjection applicationName() {
        return applicationName(null);
    }

    public IssueResponseProjection applicationName(String alias) {
        add$(new GraphQLResponseField("applicationName").alias(alias));
        return this;
    }

    public IssueResponseProjection profileName() {
        return profileName(null);
    }

    public IssueResponseProjection profileName(String alias) {
        add$(new GraphQLResponseField("profileName").alias(alias));
        return this;
    }

    public IssueResponseProjection traceId() {
        return traceId(null);
    }

    public IssueResponseProjection traceId(String alias) {
        add$(new GraphQLResponseField("traceId").alias(alias));
        return this;
    }

    public IssueResponseProjection typename() {
        return typename(null);
    }

    public IssueResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public IssueResponseProjection deepCopy$() {
        return new IssueResponseProjection(this);
    }


}
