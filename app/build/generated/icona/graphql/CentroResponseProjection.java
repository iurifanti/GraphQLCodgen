package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Centro
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CentroResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CentroResponseProjection() {
    }

    public CentroResponseProjection(CentroResponseProjection projection) {
        super(projection);
    }

    public CentroResponseProjection(List<CentroResponseProjection> projections) {
        super(projections);
    }

    public CentroResponseProjection all$() {
        return all$(3);
    }

    public CentroResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.addetto();
        this.codice();
        this.codice_centro();
        this.email_pro();
        this.gestione_scelta();
        this.in_elenco();
        this.indirizzo();
        this.nome();
        this.primario();
        this.telefono();
        this.trasferimento_a_centro();
        this.trasferimento_da_centro();
        this.vax();
        this.typename();
        return this;
    }

    public CentroResponseProjection _clientId() {
        return _clientId(null);
    }

    public CentroResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public CentroResponseProjection _createdby() {
        return _createdby(null);
    }

    public CentroResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public CentroResponseProjection _createdon() {
        return _createdon(null);
    }

    public CentroResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public CentroResponseProjection _id() {
        return _id(null);
    }

    public CentroResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public CentroResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public CentroResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public CentroResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public CentroResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public CentroResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public CentroResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public CentroResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public CentroResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public CentroResponseProjection addetto() {
        return addetto(null);
    }

    public CentroResponseProjection addetto(String alias) {
        add$(new GraphQLResponseField("addetto").alias(alias));
        return this;
    }

    public CentroResponseProjection codice() {
        return codice(null);
    }

    public CentroResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public CentroResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public CentroResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public CentroResponseProjection email_pro() {
        return email_pro(null);
    }

    public CentroResponseProjection email_pro(String alias) {
        add$(new GraphQLResponseField("email_pro").alias(alias));
        return this;
    }

    public CentroResponseProjection gestione_scelta() {
        return gestione_scelta(null);
    }

    public CentroResponseProjection gestione_scelta(String alias) {
        add$(new GraphQLResponseField("gestione_scelta").alias(alias));
        return this;
    }

    public CentroResponseProjection in_elenco() {
        return in_elenco(null);
    }

    public CentroResponseProjection in_elenco(String alias) {
        add$(new GraphQLResponseField("in_elenco").alias(alias));
        return this;
    }

    public CentroResponseProjection indirizzo() {
        return indirizzo(null);
    }

    public CentroResponseProjection indirizzo(String alias) {
        add$(new GraphQLResponseField("indirizzo").alias(alias));
        return this;
    }

    public CentroResponseProjection nome() {
        return nome(null);
    }

    public CentroResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public CentroResponseProjection primario() {
        return primario(null);
    }

    public CentroResponseProjection primario(String alias) {
        add$(new GraphQLResponseField("primario").alias(alias));
        return this;
    }

    public CentroResponseProjection telefono() {
        return telefono(null);
    }

    public CentroResponseProjection telefono(String alias) {
        add$(new GraphQLResponseField("telefono").alias(alias));
        return this;
    }

    public CentroResponseProjection trasferimento_a_centro() {
        return trasferimento_a_centro(null);
    }

    public CentroResponseProjection trasferimento_a_centro(String alias) {
        add$(new GraphQLResponseField("trasferimento_a_centro").alias(alias));
        return this;
    }

    public CentroResponseProjection trasferimento_da_centro() {
        return trasferimento_da_centro(null);
    }

    public CentroResponseProjection trasferimento_da_centro(String alias) {
        add$(new GraphQLResponseField("trasferimento_da_centro").alias(alias));
        return this;
    }

    public CentroResponseProjection vax() {
        return vax(null);
    }

    public CentroResponseProjection vax(String alias) {
        add$(new GraphQLResponseField("vax").alias(alias));
        return this;
    }

    public CentroResponseProjection typename() {
        return typename(null);
    }

    public CentroResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public CentroResponseProjection deepCopy$() {
        return new CentroResponseProjection(this);
    }


}
