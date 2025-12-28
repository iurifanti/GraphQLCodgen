package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for C_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class C_dettaglioResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public C_dettaglioResponseProjection() {
    }

    public C_dettaglioResponseProjection(C_dettaglioResponseProjection projection) {
        super(projection);
    }

    public C_dettaglioResponseProjection(List<C_dettaglioResponseProjection> projections) {
        super(projections);
    }

    public C_dettaglioResponseProjection all$() {
        return all$(3);
    }

    public C_dettaglioResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.anosmia_disgeusia();
        this.bmi();
        this.cd4_diagnosi_covid();
        this.cdc();
        this.d_dimero();
        this.data_cd4_diagnosi_covid();
        this.data_esami_ingresso();
        this.data_hivrna_diagnosi_covid();
        this.data_max_ventilazione();
        this.data_ospedalizzazione();
        this.data_rianimazione();
        this.data_tampone();
        this.data_ultimo_contatto();
        this.ferritina();
        this.frequenza_resp();
        this.fumatore();
        this.hivrna_diagnosi_covid();
        this.ldh();
        this.leucociti();
        this.linfociti();
        this.obeso();
        this.ospedalizzazione();
        this.outcome_altro();
        this.pcr();
        this.po2_fio2_ingresso();
        this.rianimazione();
        this.sintomi_altro();
        this.spo2_ingresso();
        if (projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.EventoPageResponseProjection.evento_covid", 0) <= maxDepth) {
            projectionDepthOnFields.put("C_dettaglioResponseProjection.EventoPageResponseProjection.evento_covid", projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.EventoPageResponseProjection.evento_covid", 0) + 1);
            this.evento_covid(new EventoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.EventoPageResponseProjection.evento_covid", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Livello_ventilazione_covidPageResponseProjection.livello_ventilazione_covid____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("C_dettaglioResponseProjection.Livello_ventilazione_covidPageResponseProjection.livello_ventilazione_covid____associables", projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Livello_ventilazione_covidPageResponseProjection.livello_ventilazione_covid____associables", 0) + 1);
            this.livello_ventilazione_covid____associables(new Livello_ventilazione_covidPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Livello_ventilazione_covidPageResponseProjection.livello_ventilazione_covid____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Livello_ventilazione_covidResponseProjection.livello_ventilazione_covid_", 0) <= maxDepth) {
            projectionDepthOnFields.put("C_dettaglioResponseProjection.Livello_ventilazione_covidResponseProjection.livello_ventilazione_covid_", projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Livello_ventilazione_covidResponseProjection.livello_ventilazione_covid_", 0) + 1);
            this.livello_ventilazione_covid_(new Livello_ventilazione_covidResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Livello_ventilazione_covidResponseProjection.livello_ventilazione_covid_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Outcome_covidPageResponseProjection.outcome_covid____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("C_dettaglioResponseProjection.Outcome_covidPageResponseProjection.outcome_covid____associables", projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Outcome_covidPageResponseProjection.outcome_covid____associables", 0) + 1);
            this.outcome_covid____associables(new Outcome_covidPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Outcome_covidPageResponseProjection.outcome_covid____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Outcome_covidResponseProjection.outcome_covid_", 0) <= maxDepth) {
            projectionDepthOnFields.put("C_dettaglioResponseProjection.Outcome_covidResponseProjection.outcome_covid_", projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Outcome_covidResponseProjection.outcome_covid_", 0) + 1);
            this.outcome_covid_(new Outcome_covidResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Outcome_covidResponseProjection.outcome_covid_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Terapia_covidPageResponseProjection.terapia_covid_", 0) <= maxDepth) {
            projectionDepthOnFields.put("C_dettaglioResponseProjection.Terapia_covidPageResponseProjection.terapia_covid_", projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Terapia_covidPageResponseProjection.terapia_covid_", 0) + 1);
            this.terapia_covid_(new Terapia_covidPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.Terapia_covidPageResponseProjection.terapia_covid_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("C_dettaglioResponseProjection.H_PazienteResponseProjection.h_Paziente_", projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0) + 1);
            this.h_Paziente_(new H_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("C_dettaglioResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("C_dettaglioResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public C_dettaglioResponseProjection _clientId() {
        return _clientId(null);
    }

    public C_dettaglioResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection _id() {
        return _id(null);
    }

    public C_dettaglioResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection anosmia_disgeusia() {
        return anosmia_disgeusia(null);
    }

    public C_dettaglioResponseProjection anosmia_disgeusia(String alias) {
        add$(new GraphQLResponseField("anosmia_disgeusia").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection bmi() {
        return bmi(null);
    }

    public C_dettaglioResponseProjection bmi(String alias) {
        add$(new GraphQLResponseField("bmi").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection cd4_diagnosi_covid() {
        return cd4_diagnosi_covid(null);
    }

    public C_dettaglioResponseProjection cd4_diagnosi_covid(String alias) {
        add$(new GraphQLResponseField("cd4_diagnosi_covid").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection cdc() {
        return cdc(null);
    }

    public C_dettaglioResponseProjection cdc(String alias) {
        add$(new GraphQLResponseField("cdc").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection d_dimero() {
        return d_dimero(null);
    }

    public C_dettaglioResponseProjection d_dimero(String alias) {
        add$(new GraphQLResponseField("d_dimero").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection data_cd4_diagnosi_covid() {
        return data_cd4_diagnosi_covid(null);
    }

    public C_dettaglioResponseProjection data_cd4_diagnosi_covid(String alias) {
        add$(new GraphQLResponseField("data_cd4_diagnosi_covid").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection data_esami_ingresso() {
        return data_esami_ingresso(null);
    }

    public C_dettaglioResponseProjection data_esami_ingresso(String alias) {
        add$(new GraphQLResponseField("data_esami_ingresso").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection data_hivrna_diagnosi_covid() {
        return data_hivrna_diagnosi_covid(null);
    }

    public C_dettaglioResponseProjection data_hivrna_diagnosi_covid(String alias) {
        add$(new GraphQLResponseField("data_hivrna_diagnosi_covid").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection data_max_ventilazione() {
        return data_max_ventilazione(null);
    }

    public C_dettaglioResponseProjection data_max_ventilazione(String alias) {
        add$(new GraphQLResponseField("data_max_ventilazione").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection data_ospedalizzazione() {
        return data_ospedalizzazione(null);
    }

    public C_dettaglioResponseProjection data_ospedalizzazione(String alias) {
        add$(new GraphQLResponseField("data_ospedalizzazione").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection data_rianimazione() {
        return data_rianimazione(null);
    }

    public C_dettaglioResponseProjection data_rianimazione(String alias) {
        add$(new GraphQLResponseField("data_rianimazione").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection data_tampone() {
        return data_tampone(null);
    }

    public C_dettaglioResponseProjection data_tampone(String alias) {
        add$(new GraphQLResponseField("data_tampone").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection data_ultimo_contatto() {
        return data_ultimo_contatto(null);
    }

    public C_dettaglioResponseProjection data_ultimo_contatto(String alias) {
        add$(new GraphQLResponseField("data_ultimo_contatto").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection ferritina() {
        return ferritina(null);
    }

    public C_dettaglioResponseProjection ferritina(String alias) {
        add$(new GraphQLResponseField("ferritina").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection frequenza_resp() {
        return frequenza_resp(null);
    }

    public C_dettaglioResponseProjection frequenza_resp(String alias) {
        add$(new GraphQLResponseField("frequenza_resp").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection fumatore() {
        return fumatore(null);
    }

    public C_dettaglioResponseProjection fumatore(String alias) {
        add$(new GraphQLResponseField("fumatore").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection hivrna_diagnosi_covid() {
        return hivrna_diagnosi_covid(null);
    }

    public C_dettaglioResponseProjection hivrna_diagnosi_covid(String alias) {
        add$(new GraphQLResponseField("hivrna_diagnosi_covid").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection ldh() {
        return ldh(null);
    }

    public C_dettaglioResponseProjection ldh(String alias) {
        add$(new GraphQLResponseField("ldh").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection leucociti() {
        return leucociti(null);
    }

    public C_dettaglioResponseProjection leucociti(String alias) {
        add$(new GraphQLResponseField("leucociti").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection linfociti() {
        return linfociti(null);
    }

    public C_dettaglioResponseProjection linfociti(String alias) {
        add$(new GraphQLResponseField("linfociti").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection obeso() {
        return obeso(null);
    }

    public C_dettaglioResponseProjection obeso(String alias) {
        add$(new GraphQLResponseField("obeso").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection ospedalizzazione() {
        return ospedalizzazione(null);
    }

    public C_dettaglioResponseProjection ospedalizzazione(String alias) {
        add$(new GraphQLResponseField("ospedalizzazione").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection outcome_altro() {
        return outcome_altro(null);
    }

    public C_dettaglioResponseProjection outcome_altro(String alias) {
        add$(new GraphQLResponseField("outcome_altro").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection pcr() {
        return pcr(null);
    }

    public C_dettaglioResponseProjection pcr(String alias) {
        add$(new GraphQLResponseField("pcr").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection po2_fio2_ingresso() {
        return po2_fio2_ingresso(null);
    }

    public C_dettaglioResponseProjection po2_fio2_ingresso(String alias) {
        add$(new GraphQLResponseField("po2_fio2_ingresso").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection rianimazione() {
        return rianimazione(null);
    }

    public C_dettaglioResponseProjection rianimazione(String alias) {
        add$(new GraphQLResponseField("rianimazione").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection sintomi_altro() {
        return sintomi_altro(null);
    }

    public C_dettaglioResponseProjection sintomi_altro(String alias) {
        add$(new GraphQLResponseField("sintomi_altro").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection spo2_ingresso() {
        return spo2_ingresso(null);
    }

    public C_dettaglioResponseProjection spo2_ingresso(String alias) {
        add$(new GraphQLResponseField("spo2_ingresso").alias(alias));
        return this;
    }

    public C_dettaglioResponseProjection evento_covid(EventoPageResponseProjection subProjection) {
        return evento_covid((String)null, subProjection);
    }

    public C_dettaglioResponseProjection evento_covid(String alias, EventoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("evento_covid").alias(alias).projection(subProjection));
        return this;
    }

    public C_dettaglioResponseProjection evento_covid(C_dettaglioEvento_covidParametrizedInput input, EventoPageResponseProjection subProjection) {
        return evento_covid(null, input, subProjection);
    }

    public C_dettaglioResponseProjection evento_covid(String alias, C_dettaglioEvento_covidParametrizedInput input, EventoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("evento_covid").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public C_dettaglioResponseProjection livello_ventilazione_covid____associables(Livello_ventilazione_covidPageResponseProjection subProjection) {
        return livello_ventilazione_covid____associables((String)null, subProjection);
    }

    public C_dettaglioResponseProjection livello_ventilazione_covid____associables(String alias, Livello_ventilazione_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("livello_ventilazione_covid____associables").alias(alias).projection(subProjection));
        return this;
    }

    public C_dettaglioResponseProjection livello_ventilazione_covid____associables(C_dettaglioLivello_ventilazione_covid____associablesParametrizedInput input, Livello_ventilazione_covidPageResponseProjection subProjection) {
        return livello_ventilazione_covid____associables(null, input, subProjection);
    }

    public C_dettaglioResponseProjection livello_ventilazione_covid____associables(String alias, C_dettaglioLivello_ventilazione_covid____associablesParametrizedInput input, Livello_ventilazione_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("livello_ventilazione_covid____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public C_dettaglioResponseProjection livello_ventilazione_covid_(Livello_ventilazione_covidResponseProjection subProjection) {
        return livello_ventilazione_covid_(null, subProjection);
    }

    public C_dettaglioResponseProjection livello_ventilazione_covid_(String alias, Livello_ventilazione_covidResponseProjection subProjection) {
        add$(new GraphQLResponseField("livello_ventilazione_covid_").alias(alias).projection(subProjection));
        return this;
    }

    public C_dettaglioResponseProjection outcome_covid____associables(Outcome_covidPageResponseProjection subProjection) {
        return outcome_covid____associables((String)null, subProjection);
    }

    public C_dettaglioResponseProjection outcome_covid____associables(String alias, Outcome_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("outcome_covid____associables").alias(alias).projection(subProjection));
        return this;
    }

    public C_dettaglioResponseProjection outcome_covid____associables(C_dettaglioOutcome_covid____associablesParametrizedInput input, Outcome_covidPageResponseProjection subProjection) {
        return outcome_covid____associables(null, input, subProjection);
    }

    public C_dettaglioResponseProjection outcome_covid____associables(String alias, C_dettaglioOutcome_covid____associablesParametrizedInput input, Outcome_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("outcome_covid____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public C_dettaglioResponseProjection outcome_covid_(Outcome_covidResponseProjection subProjection) {
        return outcome_covid_(null, subProjection);
    }

    public C_dettaglioResponseProjection outcome_covid_(String alias, Outcome_covidResponseProjection subProjection) {
        add$(new GraphQLResponseField("outcome_covid_").alias(alias).projection(subProjection));
        return this;
    }

    public C_dettaglioResponseProjection terapia_covid_(Terapia_covidPageResponseProjection subProjection) {
        return terapia_covid_((String)null, subProjection);
    }

    public C_dettaglioResponseProjection terapia_covid_(String alias, Terapia_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("terapia_covid_").alias(alias).projection(subProjection));
        return this;
    }

    public C_dettaglioResponseProjection terapia_covid_(C_dettaglioTerapia_covid_ParametrizedInput input, Terapia_covidPageResponseProjection subProjection) {
        return terapia_covid_(null, input, subProjection);
    }

    public C_dettaglioResponseProjection terapia_covid_(String alias, C_dettaglioTerapia_covid_ParametrizedInput input, Terapia_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("terapia_covid_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public C_dettaglioResponseProjection h_Paziente_(H_PazienteResponseProjection subProjection) {
        return h_Paziente_(null, subProjection);
    }

    public C_dettaglioResponseProjection h_Paziente_(String alias, H_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("h_Paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public C_dettaglioResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public C_dettaglioResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public C_dettaglioResponseProjection typename() {
        return typename(null);
    }

    public C_dettaglioResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public C_dettaglioResponseProjection deepCopy$() {
        return new C_dettaglioResponseProjection(this);
    }


}
