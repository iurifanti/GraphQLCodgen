package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Centro_sequenziatore
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Centro_sequenziatoreResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Centro_sequenziatoreResponseProjection() {
    }

    public Centro_sequenziatoreResponseProjection(Centro_sequenziatoreResponseProjection projection) {
        super(projection);
    }

    public Centro_sequenziatoreResponseProjection(List<Centro_sequenziatoreResponseProjection> projections) {
        super(projections);
    }

    public Centro_sequenziatoreResponseProjection all$() {
        return all$(3);
    }

    public Centro_sequenziatoreResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.codice();
        this.nome();
        this.typename();
        return this;
    }

    public Centro_sequenziatoreResponseProjection _clientId() {
        return _clientId(null);
    }

    public Centro_sequenziatoreResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Centro_sequenziatoreResponseProjection _createdby() {
        return _createdby(null);
    }

    public Centro_sequenziatoreResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Centro_sequenziatoreResponseProjection _createdon() {
        return _createdon(null);
    }

    public Centro_sequenziatoreResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Centro_sequenziatoreResponseProjection _id() {
        return _id(null);
    }

    public Centro_sequenziatoreResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Centro_sequenziatoreResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Centro_sequenziatoreResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Centro_sequenziatoreResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Centro_sequenziatoreResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Centro_sequenziatoreResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Centro_sequenziatoreResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Centro_sequenziatoreResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Centro_sequenziatoreResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Centro_sequenziatoreResponseProjection codice() {
        return codice(null);
    }

    public Centro_sequenziatoreResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Centro_sequenziatoreResponseProjection nome() {
        return nome(null);
    }

    public Centro_sequenziatoreResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Centro_sequenziatoreResponseProjection typename() {
        return typename(null);
    }

    public Centro_sequenziatoreResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Centro_sequenziatoreResponseProjection deepCopy$() {
        return new Centro_sequenziatoreResponseProjection(this);
    }


}
