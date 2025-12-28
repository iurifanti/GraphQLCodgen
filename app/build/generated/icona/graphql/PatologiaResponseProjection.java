package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Patologia
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PatologiaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PatologiaResponseProjection() {
    }

    public PatologiaResponseProjection(PatologiaResponseProjection projection) {
        super(projection);
    }

    public PatologiaResponseProjection(List<PatologiaResponseProjection> projections) {
        super(projections);
    }

    public PatologiaResponseProjection all$() {
        return all$(3);
    }

    public PatologiaResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.cdc();
        this.codice_dad();
        this.codice_hicdep();
        this.comorbidita_covid();
        this.comorbidita_vax();
        this.descrizione();
        this.documentazione();
        this.evento_covid();
        this.evento_vaccino_covid();
        this.gruppo();
        this.label_epatiche();
        this.mostra_specifica_tumori();
        this.nome();
        this.nome_gruppo();
        this.nome_tipo();
        this.pride();
        this.ricovero();
        this.solo_F();
        this.solo_M();
        this.sottogruppo();
        this.tipo();
        this.visibile();
        this.warning_respond();
        this.typename();
        return this;
    }

    public PatologiaResponseProjection _clientId() {
        return _clientId(null);
    }

    public PatologiaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public PatologiaResponseProjection _createdby() {
        return _createdby(null);
    }

    public PatologiaResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public PatologiaResponseProjection _createdon() {
        return _createdon(null);
    }

    public PatologiaResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public PatologiaResponseProjection _id() {
        return _id(null);
    }

    public PatologiaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public PatologiaResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public PatologiaResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public PatologiaResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public PatologiaResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public PatologiaResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public PatologiaResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public PatologiaResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public PatologiaResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public PatologiaResponseProjection cdc() {
        return cdc(null);
    }

    public PatologiaResponseProjection cdc(String alias) {
        add$(new GraphQLResponseField("cdc").alias(alias));
        return this;
    }

    public PatologiaResponseProjection codice_dad() {
        return codice_dad(null);
    }

    public PatologiaResponseProjection codice_dad(String alias) {
        add$(new GraphQLResponseField("codice_dad").alias(alias));
        return this;
    }

    public PatologiaResponseProjection codice_hicdep() {
        return codice_hicdep(null);
    }

    public PatologiaResponseProjection codice_hicdep(String alias) {
        add$(new GraphQLResponseField("codice_hicdep").alias(alias));
        return this;
    }

    public PatologiaResponseProjection comorbidita_covid() {
        return comorbidita_covid(null);
    }

    public PatologiaResponseProjection comorbidita_covid(String alias) {
        add$(new GraphQLResponseField("comorbidita_covid").alias(alias));
        return this;
    }

    public PatologiaResponseProjection comorbidita_vax() {
        return comorbidita_vax(null);
    }

    public PatologiaResponseProjection comorbidita_vax(String alias) {
        add$(new GraphQLResponseField("comorbidita_vax").alias(alias));
        return this;
    }

    public PatologiaResponseProjection descrizione() {
        return descrizione(null);
    }

    public PatologiaResponseProjection descrizione(String alias) {
        add$(new GraphQLResponseField("descrizione").alias(alias));
        return this;
    }

    public PatologiaResponseProjection documentazione() {
        return documentazione(null);
    }

    public PatologiaResponseProjection documentazione(String alias) {
        add$(new GraphQLResponseField("documentazione").alias(alias));
        return this;
    }

    public PatologiaResponseProjection evento_covid() {
        return evento_covid(null);
    }

    public PatologiaResponseProjection evento_covid(String alias) {
        add$(new GraphQLResponseField("evento_covid").alias(alias));
        return this;
    }

    public PatologiaResponseProjection evento_vaccino_covid() {
        return evento_vaccino_covid(null);
    }

    public PatologiaResponseProjection evento_vaccino_covid(String alias) {
        add$(new GraphQLResponseField("evento_vaccino_covid").alias(alias));
        return this;
    }

    public PatologiaResponseProjection gruppo() {
        return gruppo(null);
    }

    public PatologiaResponseProjection gruppo(String alias) {
        add$(new GraphQLResponseField("gruppo").alias(alias));
        return this;
    }

    public PatologiaResponseProjection label_epatiche() {
        return label_epatiche(null);
    }

    public PatologiaResponseProjection label_epatiche(String alias) {
        add$(new GraphQLResponseField("label_epatiche").alias(alias));
        return this;
    }

    public PatologiaResponseProjection mostra_specifica_tumori() {
        return mostra_specifica_tumori(null);
    }

    public PatologiaResponseProjection mostra_specifica_tumori(String alias) {
        add$(new GraphQLResponseField("mostra_specifica_tumori").alias(alias));
        return this;
    }

    public PatologiaResponseProjection nome() {
        return nome(null);
    }

    public PatologiaResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public PatologiaResponseProjection nome_gruppo() {
        return nome_gruppo(null);
    }

    public PatologiaResponseProjection nome_gruppo(String alias) {
        add$(new GraphQLResponseField("nome_gruppo").alias(alias));
        return this;
    }

    public PatologiaResponseProjection nome_tipo() {
        return nome_tipo(null);
    }

    public PatologiaResponseProjection nome_tipo(String alias) {
        add$(new GraphQLResponseField("nome_tipo").alias(alias));
        return this;
    }

    public PatologiaResponseProjection pride() {
        return pride(null);
    }

    public PatologiaResponseProjection pride(String alias) {
        add$(new GraphQLResponseField("pride").alias(alias));
        return this;
    }

    public PatologiaResponseProjection ricovero() {
        return ricovero(null);
    }

    public PatologiaResponseProjection ricovero(String alias) {
        add$(new GraphQLResponseField("ricovero").alias(alias));
        return this;
    }

    public PatologiaResponseProjection solo_F() {
        return solo_F(null);
    }

    public PatologiaResponseProjection solo_F(String alias) {
        add$(new GraphQLResponseField("solo_F").alias(alias));
        return this;
    }

    public PatologiaResponseProjection solo_M() {
        return solo_M(null);
    }

    public PatologiaResponseProjection solo_M(String alias) {
        add$(new GraphQLResponseField("solo_M").alias(alias));
        return this;
    }

    public PatologiaResponseProjection sottogruppo() {
        return sottogruppo(null);
    }

    public PatologiaResponseProjection sottogruppo(String alias) {
        add$(new GraphQLResponseField("sottogruppo").alias(alias));
        return this;
    }

    public PatologiaResponseProjection tipo() {
        return tipo(null);
    }

    public PatologiaResponseProjection tipo(String alias) {
        add$(new GraphQLResponseField("tipo").alias(alias));
        return this;
    }

    public PatologiaResponseProjection visibile() {
        return visibile(null);
    }

    public PatologiaResponseProjection visibile(String alias) {
        add$(new GraphQLResponseField("visibile").alias(alias));
        return this;
    }

    public PatologiaResponseProjection warning_respond() {
        return warning_respond(null);
    }

    public PatologiaResponseProjection warning_respond(String alias) {
        add$(new GraphQLResponseField("warning_respond").alias(alias));
        return this;
    }

    public PatologiaResponseProjection typename() {
        return typename(null);
    }

    public PatologiaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PatologiaResponseProjection deepCopy$() {
        return new PatologiaResponseProjection(this);
    }


}
