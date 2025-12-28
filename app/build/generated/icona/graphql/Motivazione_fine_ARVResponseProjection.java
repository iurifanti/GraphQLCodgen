package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Motivazione_fine_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Motivazione_fine_ARVResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Motivazione_fine_ARVResponseProjection() {
    }

    public Motivazione_fine_ARVResponseProjection(Motivazione_fine_ARVResponseProjection projection) {
        super(projection);
    }

    public Motivazione_fine_ARVResponseProjection(List<Motivazione_fine_ARVResponseProjection> projections) {
        super(projections);
    }

    public Motivazione_fine_ARVResponseProjection all$() {
        return all$(3);
    }

    public Motivazione_fine_ARVResponseProjection all$(int maxDepth) {
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
        this.gruppo();
        this.ico();
        this.nome();
        this.nome_completo();
        this.nome_gruppo();
        this.pride();
        this.sottogruppo();
        this.visualizzato();
        this.typename();
        return this;
    }

    public Motivazione_fine_ARVResponseProjection _clientId() {
        return _clientId(null);
    }

    public Motivazione_fine_ARVResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection _createdby() {
        return _createdby(null);
    }

    public Motivazione_fine_ARVResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection _createdon() {
        return _createdon(null);
    }

    public Motivazione_fine_ARVResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection _id() {
        return _id(null);
    }

    public Motivazione_fine_ARVResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Motivazione_fine_ARVResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Motivazione_fine_ARVResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Motivazione_fine_ARVResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Motivazione_fine_ARVResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection codice() {
        return codice(null);
    }

    public Motivazione_fine_ARVResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection codice_DAD() {
        return codice_DAD(null);
    }

    public Motivazione_fine_ARVResponseProjection codice_DAD(String alias) {
        add$(new GraphQLResponseField("codice_DAD").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection gruppo() {
        return gruppo(null);
    }

    public Motivazione_fine_ARVResponseProjection gruppo(String alias) {
        add$(new GraphQLResponseField("gruppo").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection ico() {
        return ico(null);
    }

    public Motivazione_fine_ARVResponseProjection ico(String alias) {
        add$(new GraphQLResponseField("ico").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection nome() {
        return nome(null);
    }

    public Motivazione_fine_ARVResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection nome_completo() {
        return nome_completo(null);
    }

    public Motivazione_fine_ARVResponseProjection nome_completo(String alias) {
        add$(new GraphQLResponseField("nome_completo").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection nome_gruppo() {
        return nome_gruppo(null);
    }

    public Motivazione_fine_ARVResponseProjection nome_gruppo(String alias) {
        add$(new GraphQLResponseField("nome_gruppo").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection pride() {
        return pride(null);
    }

    public Motivazione_fine_ARVResponseProjection pride(String alias) {
        add$(new GraphQLResponseField("pride").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection sottogruppo() {
        return sottogruppo(null);
    }

    public Motivazione_fine_ARVResponseProjection sottogruppo(String alias) {
        add$(new GraphQLResponseField("sottogruppo").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection visualizzato() {
        return visualizzato(null);
    }

    public Motivazione_fine_ARVResponseProjection visualizzato(String alias) {
        add$(new GraphQLResponseField("visualizzato").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVResponseProjection typename() {
        return typename(null);
    }

    public Motivazione_fine_ARVResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Motivazione_fine_ARVResponseProjection deepCopy$() {
        return new Motivazione_fine_ARVResponseProjection(this);
    }


}
