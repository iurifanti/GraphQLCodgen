package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Sede_decesso
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sede_decessoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Sede_decessoResponseProjection() {
    }

    public Sede_decessoResponseProjection(Sede_decessoResponseProjection projection) {
        super(projection);
    }

    public Sede_decessoResponseProjection(List<Sede_decessoResponseProjection> projections) {
        super(projections);
    }

    public Sede_decessoResponseProjection all$() {
        return all$(3);
    }

    public Sede_decessoResponseProjection all$(int maxDepth) {
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

    public Sede_decessoResponseProjection _clientId() {
        return _clientId(null);
    }

    public Sede_decessoResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Sede_decessoResponseProjection _createdby() {
        return _createdby(null);
    }

    public Sede_decessoResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Sede_decessoResponseProjection _createdon() {
        return _createdon(null);
    }

    public Sede_decessoResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Sede_decessoResponseProjection _id() {
        return _id(null);
    }

    public Sede_decessoResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Sede_decessoResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Sede_decessoResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Sede_decessoResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Sede_decessoResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Sede_decessoResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Sede_decessoResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Sede_decessoResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Sede_decessoResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Sede_decessoResponseProjection codice() {
        return codice(null);
    }

    public Sede_decessoResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Sede_decessoResponseProjection nome() {
        return nome(null);
    }

    public Sede_decessoResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Sede_decessoResponseProjection typename() {
        return typename(null);
    }

    public Sede_decessoResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Sede_decessoResponseProjection deepCopy$() {
        return new Sede_decessoResponseProjection(this);
    }


}
