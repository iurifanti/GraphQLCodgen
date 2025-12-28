package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Genotipo_HCV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Genotipo_HCVResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Genotipo_HCVResponseProjection() {
    }

    public Genotipo_HCVResponseProjection(Genotipo_HCVResponseProjection projection) {
        super(projection);
    }

    public Genotipo_HCVResponseProjection(List<Genotipo_HCVResponseProjection> projections) {
        super(projections);
    }

    public Genotipo_HCVResponseProjection all$() {
        return all$(3);
    }

    public Genotipo_HCVResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.codice();
        this.ico();
        this.nome();
        this.pride();
        this.typename();
        return this;
    }

    public Genotipo_HCVResponseProjection _clientId() {
        return _clientId(null);
    }

    public Genotipo_HCVResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Genotipo_HCVResponseProjection _createdby() {
        return _createdby(null);
    }

    public Genotipo_HCVResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Genotipo_HCVResponseProjection _createdon() {
        return _createdon(null);
    }

    public Genotipo_HCVResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Genotipo_HCVResponseProjection _id() {
        return _id(null);
    }

    public Genotipo_HCVResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Genotipo_HCVResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Genotipo_HCVResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Genotipo_HCVResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Genotipo_HCVResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Genotipo_HCVResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Genotipo_HCVResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Genotipo_HCVResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Genotipo_HCVResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Genotipo_HCVResponseProjection codice() {
        return codice(null);
    }

    public Genotipo_HCVResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Genotipo_HCVResponseProjection ico() {
        return ico(null);
    }

    public Genotipo_HCVResponseProjection ico(String alias) {
        add$(new GraphQLResponseField("ico").alias(alias));
        return this;
    }

    public Genotipo_HCVResponseProjection nome() {
        return nome(null);
    }

    public Genotipo_HCVResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Genotipo_HCVResponseProjection pride() {
        return pride(null);
    }

    public Genotipo_HCVResponseProjection pride(String alias) {
        add$(new GraphQLResponseField("pride").alias(alias));
        return this;
    }

    public Genotipo_HCVResponseProjection typename() {
        return typename(null);
    }

    public Genotipo_HCVResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Genotipo_HCVResponseProjection deepCopy$() {
        return new Genotipo_HCVResponseProjection(this);
    }


}
