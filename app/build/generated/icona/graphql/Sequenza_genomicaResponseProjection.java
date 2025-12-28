package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Sequenza_genomica
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sequenza_genomicaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Sequenza_genomicaResponseProjection() {
    }

    public Sequenza_genomicaResponseProjection(Sequenza_genomicaResponseProjection projection) {
        super(projection);
    }

    public Sequenza_genomicaResponseProjection(List<Sequenza_genomicaResponseProjection> projections) {
        super(projections);
    }

    public Sequenza_genomicaResponseProjection all$() {
        return all$(3);
    }

    public Sequenza_genomicaResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.altra_metodica();
        this.altro_centro();
        this.codice_centro();
        this.codice_paziente();
        this.data_analisi();
        this.data_prelievo();
        this.effettuato_su();
        this.elenco_mutazioni_ENV();
        this.elenco_mutazioni_INT();
        this.elenco_mutazioni_PR();
        this.elenco_mutazioni_RT();
        this.elenco_mutazioni_V3();
        this.etichetta();
        this.filtro_codice_paziente();
        this.mutazioni();
        this.mutazioni_no_farmaco();
        this.nessuna_mutazione_ENV();
        this.nessuna_mutazione_INT();
        this.nessuna_mutazione_PR();
        this.nessuna_mutazione_RT();
        this.nessuna_mutazione_V3();
        this.nucleotidi();
        this.regione();
        this.sottotipo();
        this.tipo_sequenza();
        if (projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.Centro_sequenziatorePageResponseProjection.centro_sequenziatore___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sequenza_genomicaResponseProjection.Centro_sequenziatorePageResponseProjection.centro_sequenziatore___associables", projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.Centro_sequenziatorePageResponseProjection.centro_sequenziatore___associables", 0) + 1);
            this.centro_sequenziatore___associables(new Centro_sequenziatorePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.Centro_sequenziatorePageResponseProjection.centro_sequenziatore___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.Centro_sequenziatoreResponseProjection.centro_sequenziatore", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sequenza_genomicaResponseProjection.Centro_sequenziatoreResponseProjection.centro_sequenziatore", projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.Centro_sequenziatoreResponseProjection.centro_sequenziatore", 0) + 1);
            this.centro_sequenziatore(new Centro_sequenziatoreResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.Centro_sequenziatoreResponseProjection.centro_sequenziatore", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.Metodica_genotipoPageResponseProjection.metodica_genotipo___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sequenza_genomicaResponseProjection.Metodica_genotipoPageResponseProjection.metodica_genotipo___associables", projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.Metodica_genotipoPageResponseProjection.metodica_genotipo___associables", 0) + 1);
            this.metodica_genotipo___associables(new Metodica_genotipoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.Metodica_genotipoPageResponseProjection.metodica_genotipo___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.Metodica_genotipoResponseProjection.metodica_genotipo", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sequenza_genomicaResponseProjection.Metodica_genotipoResponseProjection.metodica_genotipo", projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.Metodica_genotipoResponseProjection.metodica_genotipo", 0) + 1);
            this.metodica_genotipo(new Metodica_genotipoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.Metodica_genotipoResponseProjection.metodica_genotipo", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.MutazionePageResponseProjection.mutazione", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sequenza_genomicaResponseProjection.MutazionePageResponseProjection.mutazione", projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.MutazionePageResponseProjection.mutazione", 0) + 1);
            this.mutazione(new MutazionePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.MutazionePageResponseProjection.mutazione", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.PazientePageResponseProjection.paziente___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sequenza_genomicaResponseProjection.PazientePageResponseProjection.paziente___associables", projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.PazientePageResponseProjection.paziente___associables", 0) + 1);
            this.paziente___associables(new PazientePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.PazientePageResponseProjection.paziente___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.PazienteResponseProjection.paziente", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sequenza_genomicaResponseProjection.PazienteResponseProjection.paziente", projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.PazienteResponseProjection.paziente", 0) + 1);
            this.paziente(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sequenza_genomicaResponseProjection.PazienteResponseProjection.paziente", 0)));
        }
        this.typename();
        return this;
    }

    public Sequenza_genomicaResponseProjection _clientId() {
        return _clientId(null);
    }

    public Sequenza_genomicaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection _createdby() {
        return _createdby(null);
    }

    public Sequenza_genomicaResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection _createdon() {
        return _createdon(null);
    }

    public Sequenza_genomicaResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection _id() {
        return _id(null);
    }

    public Sequenza_genomicaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Sequenza_genomicaResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Sequenza_genomicaResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Sequenza_genomicaResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Sequenza_genomicaResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection altra_metodica() {
        return altra_metodica(null);
    }

    public Sequenza_genomicaResponseProjection altra_metodica(String alias) {
        add$(new GraphQLResponseField("altra_metodica").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection altro_centro() {
        return altro_centro(null);
    }

    public Sequenza_genomicaResponseProjection altro_centro(String alias) {
        add$(new GraphQLResponseField("altro_centro").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public Sequenza_genomicaResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection codice_paziente() {
        return codice_paziente(null);
    }

    public Sequenza_genomicaResponseProjection codice_paziente(String alias) {
        add$(new GraphQLResponseField("codice_paziente").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection data_analisi() {
        return data_analisi(null);
    }

    public Sequenza_genomicaResponseProjection data_analisi(String alias) {
        add$(new GraphQLResponseField("data_analisi").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection data_prelievo() {
        return data_prelievo(null);
    }

    public Sequenza_genomicaResponseProjection data_prelievo(String alias) {
        add$(new GraphQLResponseField("data_prelievo").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection effettuato_su() {
        return effettuato_su(null);
    }

    public Sequenza_genomicaResponseProjection effettuato_su(String alias) {
        add$(new GraphQLResponseField("effettuato_su").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection elenco_mutazioni_ENV() {
        return elenco_mutazioni_ENV(null);
    }

    public Sequenza_genomicaResponseProjection elenco_mutazioni_ENV(String alias) {
        add$(new GraphQLResponseField("elenco_mutazioni_ENV").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection elenco_mutazioni_INT() {
        return elenco_mutazioni_INT(null);
    }

    public Sequenza_genomicaResponseProjection elenco_mutazioni_INT(String alias) {
        add$(new GraphQLResponseField("elenco_mutazioni_INT").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection elenco_mutazioni_PR() {
        return elenco_mutazioni_PR(null);
    }

    public Sequenza_genomicaResponseProjection elenco_mutazioni_PR(String alias) {
        add$(new GraphQLResponseField("elenco_mutazioni_PR").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection elenco_mutazioni_RT() {
        return elenco_mutazioni_RT(null);
    }

    public Sequenza_genomicaResponseProjection elenco_mutazioni_RT(String alias) {
        add$(new GraphQLResponseField("elenco_mutazioni_RT").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection elenco_mutazioni_V3() {
        return elenco_mutazioni_V3(null);
    }

    public Sequenza_genomicaResponseProjection elenco_mutazioni_V3(String alias) {
        add$(new GraphQLResponseField("elenco_mutazioni_V3").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection etichetta() {
        return etichetta(null);
    }

    public Sequenza_genomicaResponseProjection etichetta(String alias) {
        add$(new GraphQLResponseField("etichetta").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection filtro_codice_paziente() {
        return filtro_codice_paziente(null);
    }

    public Sequenza_genomicaResponseProjection filtro_codice_paziente(String alias) {
        add$(new GraphQLResponseField("filtro_codice_paziente").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection mutazioni() {
        return mutazioni(null);
    }

    public Sequenza_genomicaResponseProjection mutazioni(String alias) {
        add$(new GraphQLResponseField("mutazioni").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection mutazioni_no_farmaco() {
        return mutazioni_no_farmaco(null);
    }

    public Sequenza_genomicaResponseProjection mutazioni_no_farmaco(String alias) {
        add$(new GraphQLResponseField("mutazioni_no_farmaco").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection nessuna_mutazione_ENV() {
        return nessuna_mutazione_ENV(null);
    }

    public Sequenza_genomicaResponseProjection nessuna_mutazione_ENV(String alias) {
        add$(new GraphQLResponseField("nessuna_mutazione_ENV").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection nessuna_mutazione_INT() {
        return nessuna_mutazione_INT(null);
    }

    public Sequenza_genomicaResponseProjection nessuna_mutazione_INT(String alias) {
        add$(new GraphQLResponseField("nessuna_mutazione_INT").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection nessuna_mutazione_PR() {
        return nessuna_mutazione_PR(null);
    }

    public Sequenza_genomicaResponseProjection nessuna_mutazione_PR(String alias) {
        add$(new GraphQLResponseField("nessuna_mutazione_PR").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection nessuna_mutazione_RT() {
        return nessuna_mutazione_RT(null);
    }

    public Sequenza_genomicaResponseProjection nessuna_mutazione_RT(String alias) {
        add$(new GraphQLResponseField("nessuna_mutazione_RT").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection nessuna_mutazione_V3() {
        return nessuna_mutazione_V3(null);
    }

    public Sequenza_genomicaResponseProjection nessuna_mutazione_V3(String alias) {
        add$(new GraphQLResponseField("nessuna_mutazione_V3").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection nucleotidi() {
        return nucleotidi(null);
    }

    public Sequenza_genomicaResponseProjection nucleotidi(String alias) {
        add$(new GraphQLResponseField("nucleotidi").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection regione() {
        return regione(null);
    }

    public Sequenza_genomicaResponseProjection regione(String alias) {
        add$(new GraphQLResponseField("regione").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection sottotipo() {
        return sottotipo(null);
    }

    public Sequenza_genomicaResponseProjection sottotipo(String alias) {
        add$(new GraphQLResponseField("sottotipo").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection tipo_sequenza() {
        return tipo_sequenza(null);
    }

    public Sequenza_genomicaResponseProjection tipo_sequenza(String alias) {
        add$(new GraphQLResponseField("tipo_sequenza").alias(alias));
        return this;
    }

    public Sequenza_genomicaResponseProjection centro_sequenziatore___associables(Centro_sequenziatorePageResponseProjection subProjection) {
        return centro_sequenziatore___associables((String)null, subProjection);
    }

    public Sequenza_genomicaResponseProjection centro_sequenziatore___associables(String alias, Centro_sequenziatorePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("centro_sequenziatore___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaResponseProjection centro_sequenziatore___associables(Sequenza_genomicaCentro_sequenziatore___associablesParametrizedInput input, Centro_sequenziatorePageResponseProjection subProjection) {
        return centro_sequenziatore___associables(null, input, subProjection);
    }

    public Sequenza_genomicaResponseProjection centro_sequenziatore___associables(String alias, Sequenza_genomicaCentro_sequenziatore___associablesParametrizedInput input, Centro_sequenziatorePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("centro_sequenziatore___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaResponseProjection centro_sequenziatore(Centro_sequenziatoreResponseProjection subProjection) {
        return centro_sequenziatore(null, subProjection);
    }

    public Sequenza_genomicaResponseProjection centro_sequenziatore(String alias, Centro_sequenziatoreResponseProjection subProjection) {
        add$(new GraphQLResponseField("centro_sequenziatore").alias(alias).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaResponseProjection metodica_genotipo___associables(Metodica_genotipoPageResponseProjection subProjection) {
        return metodica_genotipo___associables((String)null, subProjection);
    }

    public Sequenza_genomicaResponseProjection metodica_genotipo___associables(String alias, Metodica_genotipoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_genotipo___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaResponseProjection metodica_genotipo___associables(Sequenza_genomicaMetodica_genotipo___associablesParametrizedInput input, Metodica_genotipoPageResponseProjection subProjection) {
        return metodica_genotipo___associables(null, input, subProjection);
    }

    public Sequenza_genomicaResponseProjection metodica_genotipo___associables(String alias, Sequenza_genomicaMetodica_genotipo___associablesParametrizedInput input, Metodica_genotipoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_genotipo___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaResponseProjection metodica_genotipo(Metodica_genotipoResponseProjection subProjection) {
        return metodica_genotipo(null, subProjection);
    }

    public Sequenza_genomicaResponseProjection metodica_genotipo(String alias, Metodica_genotipoResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_genotipo").alias(alias).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaResponseProjection mutazione(MutazionePageResponseProjection subProjection) {
        return mutazione((String)null, subProjection);
    }

    public Sequenza_genomicaResponseProjection mutazione(String alias, MutazionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("mutazione").alias(alias).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaResponseProjection mutazione(Sequenza_genomicaMutazioneParametrizedInput input, MutazionePageResponseProjection subProjection) {
        return mutazione(null, input, subProjection);
    }

    public Sequenza_genomicaResponseProjection mutazione(String alias, Sequenza_genomicaMutazioneParametrizedInput input, MutazionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("mutazione").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaResponseProjection paziente___associables(PazientePageResponseProjection subProjection) {
        return paziente___associables((String)null, subProjection);
    }

    public Sequenza_genomicaResponseProjection paziente___associables(String alias, PazientePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaResponseProjection paziente___associables(Sequenza_genomicaPaziente___associablesParametrizedInput input, PazientePageResponseProjection subProjection) {
        return paziente___associables(null, input, subProjection);
    }

    public Sequenza_genomicaResponseProjection paziente___associables(String alias, Sequenza_genomicaPaziente___associablesParametrizedInput input, PazientePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaResponseProjection paziente(PazienteResponseProjection subProjection) {
        return paziente(null, subProjection);
    }

    public Sequenza_genomicaResponseProjection paziente(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente").alias(alias).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaResponseProjection typename() {
        return typename(null);
    }

    public Sequenza_genomicaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Sequenza_genomicaResponseProjection deepCopy$() {
        return new Sequenza_genomicaResponseProjection(this);
    }


}
