package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Condizione_lavorativa
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Condizione_lavorativaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Condizione_lavorativaResponseProjection() {
    }

    public Condizione_lavorativaResponseProjection(Condizione_lavorativaResponseProjection projection) {
        super(projection);
    }

    public Condizione_lavorativaResponseProjection(List<Condizione_lavorativaResponseProjection> projections) {
        super(projections);
    }

    public Condizione_lavorativaResponseProjection all$() {
        return all$(3);
    }

    public Condizione_lavorativaResponseProjection all$(int maxDepth) {
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
        this.ordine();
        this.pride();
        this.probul();
        this.typename();
        return this;
    }

    public Condizione_lavorativaResponseProjection _clientId() {
        return _clientId(null);
    }

    public Condizione_lavorativaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection _createdby() {
        return _createdby(null);
    }

    public Condizione_lavorativaResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection _createdon() {
        return _createdon(null);
    }

    public Condizione_lavorativaResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection _id() {
        return _id(null);
    }

    public Condizione_lavorativaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Condizione_lavorativaResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Condizione_lavorativaResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Condizione_lavorativaResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Condizione_lavorativaResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection codice() {
        return codice(null);
    }

    public Condizione_lavorativaResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection ico() {
        return ico(null);
    }

    public Condizione_lavorativaResponseProjection ico(String alias) {
        add$(new GraphQLResponseField("ico").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection nome() {
        return nome(null);
    }

    public Condizione_lavorativaResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection ordine() {
        return ordine(null);
    }

    public Condizione_lavorativaResponseProjection ordine(String alias) {
        add$(new GraphQLResponseField("ordine").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection pride() {
        return pride(null);
    }

    public Condizione_lavorativaResponseProjection pride(String alias) {
        add$(new GraphQLResponseField("pride").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection probul() {
        return probul(null);
    }

    public Condizione_lavorativaResponseProjection probul(String alias) {
        add$(new GraphQLResponseField("probul").alias(alias));
        return this;
    }

    public Condizione_lavorativaResponseProjection typename() {
        return typename(null);
    }

    public Condizione_lavorativaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Condizione_lavorativaResponseProjection deepCopy$() {
        return new Condizione_lavorativaResponseProjection(this);
    }


}
