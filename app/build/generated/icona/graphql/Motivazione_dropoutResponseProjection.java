package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Motivazione_dropout
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Motivazione_dropoutResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Motivazione_dropoutResponseProjection() {
    }

    public Motivazione_dropoutResponseProjection(Motivazione_dropoutResponseProjection projection) {
        super(projection);
    }

    public Motivazione_dropoutResponseProjection(List<Motivazione_dropoutResponseProjection> projections) {
        super(projections);
    }

    public Motivazione_dropoutResponseProjection all$() {
        return all$(3);
    }

    public Motivazione_dropoutResponseProjection all$(int maxDepth) {
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
        this.ico();
        this.nome();
        this.pride();
        this.typename();
        return this;
    }

    public Motivazione_dropoutResponseProjection _clientId() {
        return _clientId(null);
    }

    public Motivazione_dropoutResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection _createdby() {
        return _createdby(null);
    }

    public Motivazione_dropoutResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection _createdon() {
        return _createdon(null);
    }

    public Motivazione_dropoutResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection _id() {
        return _id(null);
    }

    public Motivazione_dropoutResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Motivazione_dropoutResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Motivazione_dropoutResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Motivazione_dropoutResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Motivazione_dropoutResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection codice() {
        return codice(null);
    }

    public Motivazione_dropoutResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection codice_DAD() {
        return codice_DAD(null);
    }

    public Motivazione_dropoutResponseProjection codice_DAD(String alias) {
        add$(new GraphQLResponseField("codice_DAD").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection ico() {
        return ico(null);
    }

    public Motivazione_dropoutResponseProjection ico(String alias) {
        add$(new GraphQLResponseField("ico").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection nome() {
        return nome(null);
    }

    public Motivazione_dropoutResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection pride() {
        return pride(null);
    }

    public Motivazione_dropoutResponseProjection pride(String alias) {
        add$(new GraphQLResponseField("pride").alias(alias));
        return this;
    }

    public Motivazione_dropoutResponseProjection typename() {
        return typename(null);
    }

    public Motivazione_dropoutResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Motivazione_dropoutResponseProjection deepCopy$() {
        return new Motivazione_dropoutResponseProjection(this);
    }


}
