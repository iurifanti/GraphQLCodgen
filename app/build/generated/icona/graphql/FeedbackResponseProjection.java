package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Feedback
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class FeedbackResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FeedbackResponseProjection() {
    }

    public FeedbackResponseProjection(FeedbackResponseProjection projection) {
        super(projection);
    }

    public FeedbackResponseProjection(List<FeedbackResponseProjection> projections) {
        super(projections);
    }

    public FeedbackResponseProjection all$() {
        return all$(3);
    }

    public FeedbackResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.feedback();
        this.sezione();
        this.stato();
        this.typename();
        return this;
    }

    public FeedbackResponseProjection _clientId() {
        return _clientId(null);
    }

    public FeedbackResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public FeedbackResponseProjection _createdby() {
        return _createdby(null);
    }

    public FeedbackResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public FeedbackResponseProjection _createdon() {
        return _createdon(null);
    }

    public FeedbackResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public FeedbackResponseProjection _id() {
        return _id(null);
    }

    public FeedbackResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public FeedbackResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public FeedbackResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public FeedbackResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public FeedbackResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public FeedbackResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public FeedbackResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public FeedbackResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public FeedbackResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public FeedbackResponseProjection feedback() {
        return feedback(null);
    }

    public FeedbackResponseProjection feedback(String alias) {
        add$(new GraphQLResponseField("feedback").alias(alias));
        return this;
    }

    public FeedbackResponseProjection sezione() {
        return sezione(null);
    }

    public FeedbackResponseProjection sezione(String alias) {
        add$(new GraphQLResponseField("sezione").alias(alias));
        return this;
    }

    public FeedbackResponseProjection stato() {
        return stato(null);
    }

    public FeedbackResponseProjection stato(String alias) {
        add$(new GraphQLResponseField("stato").alias(alias));
        return this;
    }

    public FeedbackResponseProjection typename() {
        return typename(null);
    }

    public FeedbackResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public FeedbackResponseProjection deepCopy$() {
        return new FeedbackResponseProjection(this);
    }


}
