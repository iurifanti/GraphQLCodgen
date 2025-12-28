package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Motivazione_naive
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Motivazione_naiveResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Motivazione_naiveResponseProjection() {
    }

    public Motivazione_naiveResponseProjection(Motivazione_naiveResponseProjection projection) {
        super(projection);
    }

    public Motivazione_naiveResponseProjection(List<Motivazione_naiveResponseProjection> projections) {
        super(projections);
    }

    public Motivazione_naiveResponseProjection all$() {
        return all$(3);
    }

    public Motivazione_naiveResponseProjection all$(int maxDepth) {
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
        this.visualizzato();
        this.typename();
        return this;
    }

    public Motivazione_naiveResponseProjection _clientId() {
        return _clientId(null);
    }

    public Motivazione_naiveResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Motivazione_naiveResponseProjection _createdby() {
        return _createdby(null);
    }

    public Motivazione_naiveResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Motivazione_naiveResponseProjection _createdon() {
        return _createdon(null);
    }

    public Motivazione_naiveResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Motivazione_naiveResponseProjection _id() {
        return _id(null);
    }

    public Motivazione_naiveResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Motivazione_naiveResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Motivazione_naiveResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Motivazione_naiveResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Motivazione_naiveResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Motivazione_naiveResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Motivazione_naiveResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Motivazione_naiveResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Motivazione_naiveResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Motivazione_naiveResponseProjection codice() {
        return codice(null);
    }

    public Motivazione_naiveResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Motivazione_naiveResponseProjection codice_DAD() {
        return codice_DAD(null);
    }

    public Motivazione_naiveResponseProjection codice_DAD(String alias) {
        add$(new GraphQLResponseField("codice_DAD").alias(alias));
        return this;
    }

    public Motivazione_naiveResponseProjection nome() {
        return nome(null);
    }

    public Motivazione_naiveResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Motivazione_naiveResponseProjection visualizzato() {
        return visualizzato(null);
    }

    public Motivazione_naiveResponseProjection visualizzato(String alias) {
        add$(new GraphQLResponseField("visualizzato").alias(alias));
        return this;
    }

    public Motivazione_naiveResponseProjection typename() {
        return typename(null);
    }

    public Motivazione_naiveResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Motivazione_naiveResponseProjection deepCopy$() {
        return new Motivazione_naiveResponseProjection(this);
    }


}
