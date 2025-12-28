package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Etnia
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class EtniaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EtniaResponseProjection() {
    }

    public EtniaResponseProjection(EtniaResponseProjection projection) {
        super(projection);
    }

    public EtniaResponseProjection(List<EtniaResponseProjection> projections) {
        super(projections);
    }

    public EtniaResponseProjection all$() {
        return all$(3);
    }

    public EtniaResponseProjection all$(int maxDepth) {
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
        this.covicona();
        this.nome();
        this.visibile();
        this.typename();
        return this;
    }

    public EtniaResponseProjection _clientId() {
        return _clientId(null);
    }

    public EtniaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public EtniaResponseProjection _createdby() {
        return _createdby(null);
    }

    public EtniaResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public EtniaResponseProjection _createdon() {
        return _createdon(null);
    }

    public EtniaResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public EtniaResponseProjection _id() {
        return _id(null);
    }

    public EtniaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public EtniaResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public EtniaResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public EtniaResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public EtniaResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public EtniaResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public EtniaResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public EtniaResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public EtniaResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public EtniaResponseProjection codice() {
        return codice(null);
    }

    public EtniaResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public EtniaResponseProjection codice_DAD() {
        return codice_DAD(null);
    }

    public EtniaResponseProjection codice_DAD(String alias) {
        add$(new GraphQLResponseField("codice_DAD").alias(alias));
        return this;
    }

    public EtniaResponseProjection covicona() {
        return covicona(null);
    }

    public EtniaResponseProjection covicona(String alias) {
        add$(new GraphQLResponseField("covicona").alias(alias));
        return this;
    }

    public EtniaResponseProjection nome() {
        return nome(null);
    }

    public EtniaResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public EtniaResponseProjection visibile() {
        return visibile(null);
    }

    public EtniaResponseProjection visibile(String alias) {
        add$(new GraphQLResponseField("visibile").alias(alias));
        return this;
    }

    public EtniaResponseProjection typename() {
        return typename(null);
    }

    public EtniaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public EtniaResponseProjection deepCopy$() {
        return new EtniaResponseProjection(this);
    }


}
