package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Causa_decesso
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Causa_decessoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Causa_decessoResponseProjection() {
    }

    public Causa_decessoResponseProjection(Causa_decessoResponseProjection projection) {
        super(projection);
    }

    public Causa_decessoResponseProjection(List<Causa_decessoResponseProjection> projections) {
        super(projections);
    }

    public Causa_decessoResponseProjection all$() {
        return all$(3);
    }

    public Causa_decessoResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.codice();
        this.codice_DAD();
        this.nome();
        this.patologie_check();
        this.typename();
        return this;
    }

    public Causa_decessoResponseProjection _clientId() {
        return _clientId(null);
    }

    public Causa_decessoResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Causa_decessoResponseProjection _createdby() {
        return _createdby(null);
    }

    public Causa_decessoResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Causa_decessoResponseProjection _createdon() {
        return _createdon(null);
    }

    public Causa_decessoResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Causa_decessoResponseProjection _id() {
        return _id(null);
    }

    public Causa_decessoResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Causa_decessoResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Causa_decessoResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Causa_decessoResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Causa_decessoResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Causa_decessoResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Causa_decessoResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Causa_decessoResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Causa_decessoResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Causa_decessoResponseProjection codice() {
        return codice(null);
    }

    public Causa_decessoResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Causa_decessoResponseProjection codice_DAD() {
        return codice_DAD(null);
    }

    public Causa_decessoResponseProjection codice_DAD(String alias) {
        add$(new GraphQLResponseField("codice_DAD").alias(alias));
        return this;
    }

    public Causa_decessoResponseProjection nome() {
        return nome(null);
    }

    public Causa_decessoResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Causa_decessoResponseProjection patologie_check() {
        return patologie_check(null);
    }

    public Causa_decessoResponseProjection patologie_check(String alias) {
        add$(new GraphQLResponseField("patologie_check").alias(alias));
        return this;
    }

    public Causa_decessoResponseProjection typename() {
        return typename(null);
    }

    public Causa_decessoResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Causa_decessoResponseProjection deepCopy$() {
        return new Causa_decessoResponseProjection(this);
    }


}
