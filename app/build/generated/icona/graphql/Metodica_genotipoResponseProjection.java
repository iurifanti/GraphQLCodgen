package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Metodica_genotipo
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Metodica_genotipoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Metodica_genotipoResponseProjection() {
    }

    public Metodica_genotipoResponseProjection(Metodica_genotipoResponseProjection projection) {
        super(projection);
    }

    public Metodica_genotipoResponseProjection(List<Metodica_genotipoResponseProjection> projections) {
        super(projections);
    }

    public Metodica_genotipoResponseProjection all$() {
        return all$(3);
    }

    public Metodica_genotipoResponseProjection all$(int maxDepth) {
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

    public Metodica_genotipoResponseProjection _clientId() {
        return _clientId(null);
    }

    public Metodica_genotipoResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Metodica_genotipoResponseProjection _createdby() {
        return _createdby(null);
    }

    public Metodica_genotipoResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Metodica_genotipoResponseProjection _createdon() {
        return _createdon(null);
    }

    public Metodica_genotipoResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Metodica_genotipoResponseProjection _id() {
        return _id(null);
    }

    public Metodica_genotipoResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Metodica_genotipoResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Metodica_genotipoResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Metodica_genotipoResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Metodica_genotipoResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Metodica_genotipoResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Metodica_genotipoResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Metodica_genotipoResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Metodica_genotipoResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Metodica_genotipoResponseProjection codice() {
        return codice(null);
    }

    public Metodica_genotipoResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Metodica_genotipoResponseProjection nome() {
        return nome(null);
    }

    public Metodica_genotipoResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Metodica_genotipoResponseProjection typename() {
        return typename(null);
    }

    public Metodica_genotipoResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Metodica_genotipoResponseProjection deepCopy$() {
        return new Metodica_genotipoResponseProjection(this);
    }


}
