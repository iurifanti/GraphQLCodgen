package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for V_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class V_dettaglioResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public V_dettaglioResponseProjection() {
    }

    public V_dettaglioResponseProjection(V_dettaglioResponseProjection projection) {
        super(projection);
    }

    public V_dettaglioResponseProjection(List<V_dettaglioResponseProjection> projections) {
        super(projections);
    }

    public V_dettaglioResponseProjection all$() {
        return all$(3);
    }

    public V_dettaglioResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdon();
        this._id();
        this.altro_evento_prima_dose();
        this.altro_evento_seconda_dose();
        this.altro_motivazione_seconda_dose();
        this.assenza_lavoro_prima_dose();
        this.assenza_lavoro_seconda_dose();
        this.count_eventi_prima_dose();
        this.count_eventi_seconda_dose();
        this.data_prima_dose();
        this.data_primo_tampone();
        this.data_primo_tampone_post();
        this.data_seconda_dose();
        this.decorso_infezione_covid();
        this.decorso_infezione_covid_post();
        this.dosi_vaccino_covid();
        this.farmaci_prima_dose_bool();
        this.farmaci_prima_dose_text();
        this.farmaci_seconda_dose_bool();
        this.farmaci_seconda_dose_text();
        this.imped_attivita_prima_dose();
        this.imped_attivita_seconda_dose();
        this.infezione_covid();
        this.infezione_covid_post();
        this.intubazione();
        this.ore_durata_sintomi_prima_dose();
        this.ore_durata_sintomi_seconda_dose();
        this.ore_primo_sintomo_prima_dose();
        this.ore_primo_sintomo_seconda_dose();
        this.ospedale_prima_dose();
        this.ospedale_seconda_dose();
        this.ospedalizzazione();
        this.seconda_dose();
        this.terapia_corticoster();
        this.terapia_immunosopp();
        this.terapia_immunosopp_desc();
        this.vax_ico();
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Dose_vaccino_covidPageResponseProjection.dose_vaccino_covid_", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.Dose_vaccino_covidPageResponseProjection.dose_vaccino_covid_", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Dose_vaccino_covidPageResponseProjection.dose_vaccino_covid_", 0) + 1);
            this.dose_vaccino_covid_(new Dose_vaccino_covidPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Dose_vaccino_covidPageResponseProjection.dose_vaccino_covid_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_prima_dose___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_prima_dose___associables", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_prima_dose___associables", 0) + 1);
            this.eventi_prima_dose___associables(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_prima_dose___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_prima_dose", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_prima_dose", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_prima_dose", 0) + 1);
            this.eventi_prima_dose(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_prima_dose", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_seconda_dose___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_seconda_dose___associables", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_seconda_dose___associables", 0) + 1);
            this.eventi_seconda_dose___associables(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_seconda_dose___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_seconda_dose", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_seconda_dose", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_seconda_dose", 0) + 1);
            this.eventi_seconda_dose(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.eventi_seconda_dose", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Motivazioni_seconda_dosePageResponseProjection.motivazioni_seconda_dose_1___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.Motivazioni_seconda_dosePageResponseProjection.motivazioni_seconda_dose_1___associables", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Motivazioni_seconda_dosePageResponseProjection.motivazioni_seconda_dose_1___associables", 0) + 1);
            this.motivazioni_seconda_dose_1___associables(new Motivazioni_seconda_dosePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Motivazioni_seconda_dosePageResponseProjection.motivazioni_seconda_dose_1___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Motivazioni_seconda_doseResponseProjection.motivazioni_seconda_dose_1", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.Motivazioni_seconda_doseResponseProjection.motivazioni_seconda_dose_1", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Motivazioni_seconda_doseResponseProjection.motivazioni_seconda_dose_1", 0) + 1);
            this.motivazioni_seconda_dose_1(new Motivazioni_seconda_doseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Motivazioni_seconda_doseResponseProjection.motivazioni_seconda_dose_1", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Sierologie_covidPageResponseProjection.sierologie_covid_", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.Sierologie_covidPageResponseProjection.sierologie_covid_", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Sierologie_covidPageResponseProjection.sierologie_covid_", 0) + 1);
            this.sierologie_covid_(new Sierologie_covidPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Sierologie_covidPageResponseProjection.sierologie_covid_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_post___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_post___associables", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_post___associables", 0) + 1);
            this.sintomo_covid_post___associables(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_post___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_post", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_post", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_post", 0) + 1);
            this.sintomo_covid_post(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_post", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_pre___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_pre___associables", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_pre___associables", 0) + 1);
            this.sintomo_covid_pre___associables(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_pre___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_pre", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_pre", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_pre", 0) + 1);
            this.sintomo_covid_pre(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PatologiaPageResponseProjection.sintomo_covid_pre", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Farmaco_altroPageResponseProjection.vaccino_covid_prima___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.Farmaco_altroPageResponseProjection.vaccino_covid_prima___associables", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Farmaco_altroPageResponseProjection.vaccino_covid_prima___associables", 0) + 1);
            this.vaccino_covid_prima___associables(new Farmaco_altroPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Farmaco_altroPageResponseProjection.vaccino_covid_prima___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Farmaco_altroResponseProjection.vaccino_covid_prima", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.Farmaco_altroResponseProjection.vaccino_covid_prima", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Farmaco_altroResponseProjection.vaccino_covid_prima", 0) + 1);
            this.vaccino_covid_prima(new Farmaco_altroResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Farmaco_altroResponseProjection.vaccino_covid_prima", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Farmaco_altroPageResponseProjection.vaccino_covid_seconda___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.Farmaco_altroPageResponseProjection.vaccino_covid_seconda___associables", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Farmaco_altroPageResponseProjection.vaccino_covid_seconda___associables", 0) + 1);
            this.vaccino_covid_seconda___associables(new Farmaco_altroPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Farmaco_altroPageResponseProjection.vaccino_covid_seconda___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Farmaco_altroResponseProjection.vaccino_covid_seconda", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.Farmaco_altroResponseProjection.vaccino_covid_seconda", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Farmaco_altroResponseProjection.vaccino_covid_seconda", 0) + 1);
            this.vaccino_covid_seconda(new Farmaco_altroResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.Farmaco_altroResponseProjection.vaccino_covid_seconda", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public V_dettaglioResponseProjection _clientId() {
        return _clientId(null);
    }

    public V_dettaglioResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection _createdon() {
        return _createdon(null);
    }

    public V_dettaglioResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection _id() {
        return _id(null);
    }

    public V_dettaglioResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection altro_evento_prima_dose() {
        return altro_evento_prima_dose(null);
    }

    public V_dettaglioResponseProjection altro_evento_prima_dose(String alias) {
        add$(new GraphQLResponseField("altro_evento_prima_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection altro_evento_seconda_dose() {
        return altro_evento_seconda_dose(null);
    }

    public V_dettaglioResponseProjection altro_evento_seconda_dose(String alias) {
        add$(new GraphQLResponseField("altro_evento_seconda_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection altro_motivazione_seconda_dose() {
        return altro_motivazione_seconda_dose(null);
    }

    public V_dettaglioResponseProjection altro_motivazione_seconda_dose(String alias) {
        add$(new GraphQLResponseField("altro_motivazione_seconda_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection assenza_lavoro_prima_dose() {
        return assenza_lavoro_prima_dose(null);
    }

    public V_dettaglioResponseProjection assenza_lavoro_prima_dose(String alias) {
        add$(new GraphQLResponseField("assenza_lavoro_prima_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection assenza_lavoro_seconda_dose() {
        return assenza_lavoro_seconda_dose(null);
    }

    public V_dettaglioResponseProjection assenza_lavoro_seconda_dose(String alias) {
        add$(new GraphQLResponseField("assenza_lavoro_seconda_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection count_eventi_prima_dose() {
        return count_eventi_prima_dose(null);
    }

    public V_dettaglioResponseProjection count_eventi_prima_dose(String alias) {
        add$(new GraphQLResponseField("count_eventi_prima_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection count_eventi_seconda_dose() {
        return count_eventi_seconda_dose(null);
    }

    public V_dettaglioResponseProjection count_eventi_seconda_dose(String alias) {
        add$(new GraphQLResponseField("count_eventi_seconda_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection data_prima_dose() {
        return data_prima_dose(null);
    }

    public V_dettaglioResponseProjection data_prima_dose(String alias) {
        add$(new GraphQLResponseField("data_prima_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection data_primo_tampone() {
        return data_primo_tampone(null);
    }

    public V_dettaglioResponseProjection data_primo_tampone(String alias) {
        add$(new GraphQLResponseField("data_primo_tampone").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection data_primo_tampone_post() {
        return data_primo_tampone_post(null);
    }

    public V_dettaglioResponseProjection data_primo_tampone_post(String alias) {
        add$(new GraphQLResponseField("data_primo_tampone_post").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection data_seconda_dose() {
        return data_seconda_dose(null);
    }

    public V_dettaglioResponseProjection data_seconda_dose(String alias) {
        add$(new GraphQLResponseField("data_seconda_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection decorso_infezione_covid() {
        return decorso_infezione_covid(null);
    }

    public V_dettaglioResponseProjection decorso_infezione_covid(String alias) {
        add$(new GraphQLResponseField("decorso_infezione_covid").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection decorso_infezione_covid_post() {
        return decorso_infezione_covid_post(null);
    }

    public V_dettaglioResponseProjection decorso_infezione_covid_post(String alias) {
        add$(new GraphQLResponseField("decorso_infezione_covid_post").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection dosi_vaccino_covid() {
        return dosi_vaccino_covid(null);
    }

    public V_dettaglioResponseProjection dosi_vaccino_covid(String alias) {
        add$(new GraphQLResponseField("dosi_vaccino_covid").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection farmaci_prima_dose_bool() {
        return farmaci_prima_dose_bool(null);
    }

    public V_dettaglioResponseProjection farmaci_prima_dose_bool(String alias) {
        add$(new GraphQLResponseField("farmaci_prima_dose_bool").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection farmaci_prima_dose_text() {
        return farmaci_prima_dose_text(null);
    }

    public V_dettaglioResponseProjection farmaci_prima_dose_text(String alias) {
        add$(new GraphQLResponseField("farmaci_prima_dose_text").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection farmaci_seconda_dose_bool() {
        return farmaci_seconda_dose_bool(null);
    }

    public V_dettaglioResponseProjection farmaci_seconda_dose_bool(String alias) {
        add$(new GraphQLResponseField("farmaci_seconda_dose_bool").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection farmaci_seconda_dose_text() {
        return farmaci_seconda_dose_text(null);
    }

    public V_dettaglioResponseProjection farmaci_seconda_dose_text(String alias) {
        add$(new GraphQLResponseField("farmaci_seconda_dose_text").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection imped_attivita_prima_dose() {
        return imped_attivita_prima_dose(null);
    }

    public V_dettaglioResponseProjection imped_attivita_prima_dose(String alias) {
        add$(new GraphQLResponseField("imped_attivita_prima_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection imped_attivita_seconda_dose() {
        return imped_attivita_seconda_dose(null);
    }

    public V_dettaglioResponseProjection imped_attivita_seconda_dose(String alias) {
        add$(new GraphQLResponseField("imped_attivita_seconda_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection infezione_covid() {
        return infezione_covid(null);
    }

    public V_dettaglioResponseProjection infezione_covid(String alias) {
        add$(new GraphQLResponseField("infezione_covid").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection infezione_covid_post() {
        return infezione_covid_post(null);
    }

    public V_dettaglioResponseProjection infezione_covid_post(String alias) {
        add$(new GraphQLResponseField("infezione_covid_post").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection intubazione() {
        return intubazione(null);
    }

    public V_dettaglioResponseProjection intubazione(String alias) {
        add$(new GraphQLResponseField("intubazione").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection ore_durata_sintomi_prima_dose() {
        return ore_durata_sintomi_prima_dose(null);
    }

    public V_dettaglioResponseProjection ore_durata_sintomi_prima_dose(String alias) {
        add$(new GraphQLResponseField("ore_durata_sintomi_prima_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection ore_durata_sintomi_seconda_dose() {
        return ore_durata_sintomi_seconda_dose(null);
    }

    public V_dettaglioResponseProjection ore_durata_sintomi_seconda_dose(String alias) {
        add$(new GraphQLResponseField("ore_durata_sintomi_seconda_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection ore_primo_sintomo_prima_dose() {
        return ore_primo_sintomo_prima_dose(null);
    }

    public V_dettaglioResponseProjection ore_primo_sintomo_prima_dose(String alias) {
        add$(new GraphQLResponseField("ore_primo_sintomo_prima_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection ore_primo_sintomo_seconda_dose() {
        return ore_primo_sintomo_seconda_dose(null);
    }

    public V_dettaglioResponseProjection ore_primo_sintomo_seconda_dose(String alias) {
        add$(new GraphQLResponseField("ore_primo_sintomo_seconda_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection ospedale_prima_dose() {
        return ospedale_prima_dose(null);
    }

    public V_dettaglioResponseProjection ospedale_prima_dose(String alias) {
        add$(new GraphQLResponseField("ospedale_prima_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection ospedale_seconda_dose() {
        return ospedale_seconda_dose(null);
    }

    public V_dettaglioResponseProjection ospedale_seconda_dose(String alias) {
        add$(new GraphQLResponseField("ospedale_seconda_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection ospedalizzazione() {
        return ospedalizzazione(null);
    }

    public V_dettaglioResponseProjection ospedalizzazione(String alias) {
        add$(new GraphQLResponseField("ospedalizzazione").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection seconda_dose() {
        return seconda_dose(null);
    }

    public V_dettaglioResponseProjection seconda_dose(String alias) {
        add$(new GraphQLResponseField("seconda_dose").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection terapia_corticoster() {
        return terapia_corticoster(null);
    }

    public V_dettaglioResponseProjection terapia_corticoster(String alias) {
        add$(new GraphQLResponseField("terapia_corticoster").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection terapia_immunosopp() {
        return terapia_immunosopp(null);
    }

    public V_dettaglioResponseProjection terapia_immunosopp(String alias) {
        add$(new GraphQLResponseField("terapia_immunosopp").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection terapia_immunosopp_desc() {
        return terapia_immunosopp_desc(null);
    }

    public V_dettaglioResponseProjection terapia_immunosopp_desc(String alias) {
        add$(new GraphQLResponseField("terapia_immunosopp_desc").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection vax_ico() {
        return vax_ico(null);
    }

    public V_dettaglioResponseProjection vax_ico(String alias) {
        add$(new GraphQLResponseField("vax_ico").alias(alias));
        return this;
    }

    public V_dettaglioResponseProjection dose_vaccino_covid_(Dose_vaccino_covidPageResponseProjection subProjection) {
        return dose_vaccino_covid_((String)null, subProjection);
    }

    public V_dettaglioResponseProjection dose_vaccino_covid_(String alias, Dose_vaccino_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("dose_vaccino_covid_").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection dose_vaccino_covid_(V_dettaglioDose_vaccino_covid_ParametrizedInput input, Dose_vaccino_covidPageResponseProjection subProjection) {
        return dose_vaccino_covid_(null, input, subProjection);
    }

    public V_dettaglioResponseProjection dose_vaccino_covid_(String alias, V_dettaglioDose_vaccino_covid_ParametrizedInput input, Dose_vaccino_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("dose_vaccino_covid_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection eventi_prima_dose___associables(PatologiaPageResponseProjection subProjection) {
        return eventi_prima_dose___associables((String)null, subProjection);
    }

    public V_dettaglioResponseProjection eventi_prima_dose___associables(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("eventi_prima_dose___associables").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection eventi_prima_dose___associables(V_dettaglioEventi_prima_dose___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return eventi_prima_dose___associables(null, input, subProjection);
    }

    public V_dettaglioResponseProjection eventi_prima_dose___associables(String alias, V_dettaglioEventi_prima_dose___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("eventi_prima_dose___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection eventi_prima_dose(PatologiaPageResponseProjection subProjection) {
        return eventi_prima_dose((String)null, subProjection);
    }

    public V_dettaglioResponseProjection eventi_prima_dose(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("eventi_prima_dose").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection eventi_prima_dose(V_dettaglioEventi_prima_doseParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return eventi_prima_dose(null, input, subProjection);
    }

    public V_dettaglioResponseProjection eventi_prima_dose(String alias, V_dettaglioEventi_prima_doseParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("eventi_prima_dose").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection eventi_seconda_dose___associables(PatologiaPageResponseProjection subProjection) {
        return eventi_seconda_dose___associables((String)null, subProjection);
    }

    public V_dettaglioResponseProjection eventi_seconda_dose___associables(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("eventi_seconda_dose___associables").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection eventi_seconda_dose___associables(V_dettaglioEventi_seconda_dose___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return eventi_seconda_dose___associables(null, input, subProjection);
    }

    public V_dettaglioResponseProjection eventi_seconda_dose___associables(String alias, V_dettaglioEventi_seconda_dose___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("eventi_seconda_dose___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection eventi_seconda_dose(PatologiaPageResponseProjection subProjection) {
        return eventi_seconda_dose((String)null, subProjection);
    }

    public V_dettaglioResponseProjection eventi_seconda_dose(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("eventi_seconda_dose").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection eventi_seconda_dose(V_dettaglioEventi_seconda_doseParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return eventi_seconda_dose(null, input, subProjection);
    }

    public V_dettaglioResponseProjection eventi_seconda_dose(String alias, V_dettaglioEventi_seconda_doseParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("eventi_seconda_dose").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection motivazioni_seconda_dose_1___associables(Motivazioni_seconda_dosePageResponseProjection subProjection) {
        return motivazioni_seconda_dose_1___associables((String)null, subProjection);
    }

    public V_dettaglioResponseProjection motivazioni_seconda_dose_1___associables(String alias, Motivazioni_seconda_dosePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazioni_seconda_dose_1___associables").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection motivazioni_seconda_dose_1___associables(V_dettaglioMotivazioni_seconda_dose_1___associablesParametrizedInput input, Motivazioni_seconda_dosePageResponseProjection subProjection) {
        return motivazioni_seconda_dose_1___associables(null, input, subProjection);
    }

    public V_dettaglioResponseProjection motivazioni_seconda_dose_1___associables(String alias, V_dettaglioMotivazioni_seconda_dose_1___associablesParametrizedInput input, Motivazioni_seconda_dosePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazioni_seconda_dose_1___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection motivazioni_seconda_dose_1(Motivazioni_seconda_doseResponseProjection subProjection) {
        return motivazioni_seconda_dose_1(null, subProjection);
    }

    public V_dettaglioResponseProjection motivazioni_seconda_dose_1(String alias, Motivazioni_seconda_doseResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazioni_seconda_dose_1").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection sierologie_covid_(Sierologie_covidPageResponseProjection subProjection) {
        return sierologie_covid_((String)null, subProjection);
    }

    public V_dettaglioResponseProjection sierologie_covid_(String alias, Sierologie_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sierologie_covid_").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection sierologie_covid_(V_dettaglioSierologie_covid_ParametrizedInput input, Sierologie_covidPageResponseProjection subProjection) {
        return sierologie_covid_(null, input, subProjection);
    }

    public V_dettaglioResponseProjection sierologie_covid_(String alias, V_dettaglioSierologie_covid_ParametrizedInput input, Sierologie_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sierologie_covid_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection sintomo_covid_post___associables(PatologiaPageResponseProjection subProjection) {
        return sintomo_covid_post___associables((String)null, subProjection);
    }

    public V_dettaglioResponseProjection sintomo_covid_post___associables(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sintomo_covid_post___associables").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection sintomo_covid_post___associables(V_dettaglioSintomo_covid_post___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return sintomo_covid_post___associables(null, input, subProjection);
    }

    public V_dettaglioResponseProjection sintomo_covid_post___associables(String alias, V_dettaglioSintomo_covid_post___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sintomo_covid_post___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection sintomo_covid_post(PatologiaPageResponseProjection subProjection) {
        return sintomo_covid_post((String)null, subProjection);
    }

    public V_dettaglioResponseProjection sintomo_covid_post(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sintomo_covid_post").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection sintomo_covid_post(V_dettaglioSintomo_covid_postParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return sintomo_covid_post(null, input, subProjection);
    }

    public V_dettaglioResponseProjection sintomo_covid_post(String alias, V_dettaglioSintomo_covid_postParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sintomo_covid_post").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection sintomo_covid_pre___associables(PatologiaPageResponseProjection subProjection) {
        return sintomo_covid_pre___associables((String)null, subProjection);
    }

    public V_dettaglioResponseProjection sintomo_covid_pre___associables(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sintomo_covid_pre___associables").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection sintomo_covid_pre___associables(V_dettaglioSintomo_covid_pre___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return sintomo_covid_pre___associables(null, input, subProjection);
    }

    public V_dettaglioResponseProjection sintomo_covid_pre___associables(String alias, V_dettaglioSintomo_covid_pre___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sintomo_covid_pre___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection sintomo_covid_pre(PatologiaPageResponseProjection subProjection) {
        return sintomo_covid_pre((String)null, subProjection);
    }

    public V_dettaglioResponseProjection sintomo_covid_pre(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sintomo_covid_pre").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection sintomo_covid_pre(V_dettaglioSintomo_covid_preParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return sintomo_covid_pre(null, input, subProjection);
    }

    public V_dettaglioResponseProjection sintomo_covid_pre(String alias, V_dettaglioSintomo_covid_preParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sintomo_covid_pre").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection vaccino_covid_prima___associables(Farmaco_altroPageResponseProjection subProjection) {
        return vaccino_covid_prima___associables((String)null, subProjection);
    }

    public V_dettaglioResponseProjection vaccino_covid_prima___associables(String alias, Farmaco_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("vaccino_covid_prima___associables").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection vaccino_covid_prima___associables(V_dettaglioVaccino_covid_prima___associablesParametrizedInput input, Farmaco_altroPageResponseProjection subProjection) {
        return vaccino_covid_prima___associables(null, input, subProjection);
    }

    public V_dettaglioResponseProjection vaccino_covid_prima___associables(String alias, V_dettaglioVaccino_covid_prima___associablesParametrizedInput input, Farmaco_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("vaccino_covid_prima___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection vaccino_covid_prima(Farmaco_altroResponseProjection subProjection) {
        return vaccino_covid_prima(null, subProjection);
    }

    public V_dettaglioResponseProjection vaccino_covid_prima(String alias, Farmaco_altroResponseProjection subProjection) {
        add$(new GraphQLResponseField("vaccino_covid_prima").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection vaccino_covid_seconda___associables(Farmaco_altroPageResponseProjection subProjection) {
        return vaccino_covid_seconda___associables((String)null, subProjection);
    }

    public V_dettaglioResponseProjection vaccino_covid_seconda___associables(String alias, Farmaco_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("vaccino_covid_seconda___associables").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection vaccino_covid_seconda___associables(V_dettaglioVaccino_covid_seconda___associablesParametrizedInput input, Farmaco_altroPageResponseProjection subProjection) {
        return vaccino_covid_seconda___associables(null, input, subProjection);
    }

    public V_dettaglioResponseProjection vaccino_covid_seconda___associables(String alias, V_dettaglioVaccino_covid_seconda___associablesParametrizedInput input, Farmaco_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("vaccino_covid_seconda___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection vaccino_covid_seconda(Farmaco_altroResponseProjection subProjection) {
        return vaccino_covid_seconda(null, subProjection);
    }

    public V_dettaglioResponseProjection vaccino_covid_seconda(String alias, Farmaco_altroResponseProjection subProjection) {
        add$(new GraphQLResponseField("vaccino_covid_seconda").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public V_dettaglioResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioResponseProjection typename() {
        return typename(null);
    }

    public V_dettaglioResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public V_dettaglioResponseProjection deepCopy$() {
        return new V_dettaglioResponseProjection(this);
    }


}
