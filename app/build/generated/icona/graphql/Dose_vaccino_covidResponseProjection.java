package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Dose_vaccino_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Dose_vaccino_covidResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Dose_vaccino_covidResponseProjection() {
    }

    public Dose_vaccino_covidResponseProjection(Dose_vaccino_covidResponseProjection projection) {
        super(projection);
    }

    public Dose_vaccino_covidResponseProjection(List<Dose_vaccino_covidResponseProjection> projections) {
        super(projections);
    }

    public Dose_vaccino_covidResponseProjection all$() {
        return all$(3);
    }

    public Dose_vaccino_covidResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.altro_evento();
        this.altro_motivazione_seconda_dose();
        this.assenza_lavoro_prima_dose();
        this.count_eventi();
        this.data();
        this.dose_successiva();
        this.eventi_avversi();
        this.farmaci_prima_dose_bool();
        this.farmaci_prima_dose_text();
        this.imped_attivita_prima_dose();
        this.motivazioni_dose_successiva();
        this.ore_durata_sintomi_prima_dose();
        this.ore_durata_sintomi_prima_dose_1();
        this.ore_primo_sintomo_prima_dose();
        this.ore_primo_sintomo_prima_dose_1();
        this.ospedale_prima_dose();
        this.vaccino();
        if (projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.PatologiaPageResponseProjection.eventi_vaccino_covid___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_vaccino_covidResponseProjection.PatologiaPageResponseProjection.eventi_vaccino_covid___associables", projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.PatologiaPageResponseProjection.eventi_vaccino_covid___associables", 0) + 1);
            this.eventi_vaccino_covid___associables(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.PatologiaPageResponseProjection.eventi_vaccino_covid___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.PatologiaPageResponseProjection.eventi_vaccino_covid", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_vaccino_covidResponseProjection.PatologiaPageResponseProjection.eventi_vaccino_covid", projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.PatologiaPageResponseProjection.eventi_vaccino_covid", 0) + 1);
            this.eventi_vaccino_covid(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.PatologiaPageResponseProjection.eventi_vaccino_covid", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Motivazioni_seconda_dosePageResponseProjection.motivazioni_seconda_dose____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_vaccino_covidResponseProjection.Motivazioni_seconda_dosePageResponseProjection.motivazioni_seconda_dose____associables", projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Motivazioni_seconda_dosePageResponseProjection.motivazioni_seconda_dose____associables", 0) + 1);
            this.motivazioni_seconda_dose____associables(new Motivazioni_seconda_dosePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Motivazioni_seconda_dosePageResponseProjection.motivazioni_seconda_dose____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Motivazioni_seconda_doseResponseProjection.motivazioni_seconda_dose_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_vaccino_covidResponseProjection.Motivazioni_seconda_doseResponseProjection.motivazioni_seconda_dose_", projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Motivazioni_seconda_doseResponseProjection.motivazioni_seconda_dose_", 0) + 1);
            this.motivazioni_seconda_dose_(new Motivazioni_seconda_doseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Motivazioni_seconda_doseResponseProjection.motivazioni_seconda_dose_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Tempo_dose_vaccinoPageResponseProjection.tempo_dose_vaccino____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_vaccino_covidResponseProjection.Tempo_dose_vaccinoPageResponseProjection.tempo_dose_vaccino____associables", projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Tempo_dose_vaccinoPageResponseProjection.tempo_dose_vaccino____associables", 0) + 1);
            this.tempo_dose_vaccino____associables(new Tempo_dose_vaccinoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Tempo_dose_vaccinoPageResponseProjection.tempo_dose_vaccino____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Tempo_dose_vaccinoResponseProjection.tempo_dose_vaccino_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_vaccino_covidResponseProjection.Tempo_dose_vaccinoResponseProjection.tempo_dose_vaccino_", projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Tempo_dose_vaccinoResponseProjection.tempo_dose_vaccino_", 0) + 1);
            this.tempo_dose_vaccino_(new Tempo_dose_vaccinoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Tempo_dose_vaccinoResponseProjection.tempo_dose_vaccino_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Farmaco_altroPageResponseProjection.vaccino_covid___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_vaccino_covidResponseProjection.Farmaco_altroPageResponseProjection.vaccino_covid___associables", projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Farmaco_altroPageResponseProjection.vaccino_covid___associables", 0) + 1);
            this.vaccino_covid___associables(new Farmaco_altroPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Farmaco_altroPageResponseProjection.vaccino_covid___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Farmaco_altroResponseProjection.vaccino_covid", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_vaccino_covidResponseProjection.Farmaco_altroResponseProjection.vaccino_covid", projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Farmaco_altroResponseProjection.vaccino_covid", 0) + 1);
            this.vaccino_covid(new Farmaco_altroResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.Farmaco_altroResponseProjection.vaccino_covid", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.V_dettaglioResponseProjection.v_dettaglio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_vaccino_covidResponseProjection.V_dettaglioResponseProjection.v_dettaglio_", projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.V_dettaglioResponseProjection.v_dettaglio_", 0) + 1);
            this.v_dettaglio_(new V_dettaglioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_vaccino_covidResponseProjection.V_dettaglioResponseProjection.v_dettaglio_", 0)));
        }
        this.typename();
        return this;
    }

    public Dose_vaccino_covidResponseProjection _clientId() {
        return _clientId(null);
    }

    public Dose_vaccino_covidResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection _id() {
        return _id(null);
    }

    public Dose_vaccino_covidResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection altro_evento() {
        return altro_evento(null);
    }

    public Dose_vaccino_covidResponseProjection altro_evento(String alias) {
        add$(new GraphQLResponseField("altro_evento").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection altro_motivazione_seconda_dose() {
        return altro_motivazione_seconda_dose(null);
    }

    public Dose_vaccino_covidResponseProjection altro_motivazione_seconda_dose(String alias) {
        add$(new GraphQLResponseField("altro_motivazione_seconda_dose").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection assenza_lavoro_prima_dose() {
        return assenza_lavoro_prima_dose(null);
    }

    public Dose_vaccino_covidResponseProjection assenza_lavoro_prima_dose(String alias) {
        add$(new GraphQLResponseField("assenza_lavoro_prima_dose").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection count_eventi() {
        return count_eventi(null);
    }

    public Dose_vaccino_covidResponseProjection count_eventi(String alias) {
        add$(new GraphQLResponseField("count_eventi").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection data() {
        return data(null);
    }

    public Dose_vaccino_covidResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection dose_successiva() {
        return dose_successiva(null);
    }

    public Dose_vaccino_covidResponseProjection dose_successiva(String alias) {
        add$(new GraphQLResponseField("dose_successiva").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection eventi_avversi() {
        return eventi_avversi(null);
    }

    public Dose_vaccino_covidResponseProjection eventi_avversi(String alias) {
        add$(new GraphQLResponseField("eventi_avversi").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection farmaci_prima_dose_bool() {
        return farmaci_prima_dose_bool(null);
    }

    public Dose_vaccino_covidResponseProjection farmaci_prima_dose_bool(String alias) {
        add$(new GraphQLResponseField("farmaci_prima_dose_bool").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection farmaci_prima_dose_text() {
        return farmaci_prima_dose_text(null);
    }

    public Dose_vaccino_covidResponseProjection farmaci_prima_dose_text(String alias) {
        add$(new GraphQLResponseField("farmaci_prima_dose_text").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection imped_attivita_prima_dose() {
        return imped_attivita_prima_dose(null);
    }

    public Dose_vaccino_covidResponseProjection imped_attivita_prima_dose(String alias) {
        add$(new GraphQLResponseField("imped_attivita_prima_dose").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection motivazioni_dose_successiva() {
        return motivazioni_dose_successiva(null);
    }

    public Dose_vaccino_covidResponseProjection motivazioni_dose_successiva(String alias) {
        add$(new GraphQLResponseField("motivazioni_dose_successiva").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection ore_durata_sintomi_prima_dose() {
        return ore_durata_sintomi_prima_dose(null);
    }

    public Dose_vaccino_covidResponseProjection ore_durata_sintomi_prima_dose(String alias) {
        add$(new GraphQLResponseField("ore_durata_sintomi_prima_dose").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection ore_durata_sintomi_prima_dose_1() {
        return ore_durata_sintomi_prima_dose_1(null);
    }

    public Dose_vaccino_covidResponseProjection ore_durata_sintomi_prima_dose_1(String alias) {
        add$(new GraphQLResponseField("ore_durata_sintomi_prima_dose_1").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection ore_primo_sintomo_prima_dose() {
        return ore_primo_sintomo_prima_dose(null);
    }

    public Dose_vaccino_covidResponseProjection ore_primo_sintomo_prima_dose(String alias) {
        add$(new GraphQLResponseField("ore_primo_sintomo_prima_dose").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection ore_primo_sintomo_prima_dose_1() {
        return ore_primo_sintomo_prima_dose_1(null);
    }

    public Dose_vaccino_covidResponseProjection ore_primo_sintomo_prima_dose_1(String alias) {
        add$(new GraphQLResponseField("ore_primo_sintomo_prima_dose_1").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection ospedale_prima_dose() {
        return ospedale_prima_dose(null);
    }

    public Dose_vaccino_covidResponseProjection ospedale_prima_dose(String alias) {
        add$(new GraphQLResponseField("ospedale_prima_dose").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection vaccino() {
        return vaccino(null);
    }

    public Dose_vaccino_covidResponseProjection vaccino(String alias) {
        add$(new GraphQLResponseField("vaccino").alias(alias));
        return this;
    }

    public Dose_vaccino_covidResponseProjection eventi_vaccino_covid___associables(PatologiaPageResponseProjection subProjection) {
        return eventi_vaccino_covid___associables((String)null, subProjection);
    }

    public Dose_vaccino_covidResponseProjection eventi_vaccino_covid___associables(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("eventi_vaccino_covid___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection eventi_vaccino_covid___associables(Dose_vaccino_covidEventi_vaccino_covid___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return eventi_vaccino_covid___associables(null, input, subProjection);
    }

    public Dose_vaccino_covidResponseProjection eventi_vaccino_covid___associables(String alias, Dose_vaccino_covidEventi_vaccino_covid___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("eventi_vaccino_covid___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection eventi_vaccino_covid(PatologiaPageResponseProjection subProjection) {
        return eventi_vaccino_covid((String)null, subProjection);
    }

    public Dose_vaccino_covidResponseProjection eventi_vaccino_covid(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("eventi_vaccino_covid").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection eventi_vaccino_covid(Dose_vaccino_covidEventi_vaccino_covidParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return eventi_vaccino_covid(null, input, subProjection);
    }

    public Dose_vaccino_covidResponseProjection eventi_vaccino_covid(String alias, Dose_vaccino_covidEventi_vaccino_covidParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("eventi_vaccino_covid").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection motivazioni_seconda_dose____associables(Motivazioni_seconda_dosePageResponseProjection subProjection) {
        return motivazioni_seconda_dose____associables((String)null, subProjection);
    }

    public Dose_vaccino_covidResponseProjection motivazioni_seconda_dose____associables(String alias, Motivazioni_seconda_dosePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazioni_seconda_dose____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection motivazioni_seconda_dose____associables(Dose_vaccino_covidMotivazioni_seconda_dose____associablesParametrizedInput input, Motivazioni_seconda_dosePageResponseProjection subProjection) {
        return motivazioni_seconda_dose____associables(null, input, subProjection);
    }

    public Dose_vaccino_covidResponseProjection motivazioni_seconda_dose____associables(String alias, Dose_vaccino_covidMotivazioni_seconda_dose____associablesParametrizedInput input, Motivazioni_seconda_dosePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazioni_seconda_dose____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection motivazioni_seconda_dose_(Motivazioni_seconda_doseResponseProjection subProjection) {
        return motivazioni_seconda_dose_(null, subProjection);
    }

    public Dose_vaccino_covidResponseProjection motivazioni_seconda_dose_(String alias, Motivazioni_seconda_doseResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazioni_seconda_dose_").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection tempo_dose_vaccino____associables(Tempo_dose_vaccinoPageResponseProjection subProjection) {
        return tempo_dose_vaccino____associables((String)null, subProjection);
    }

    public Dose_vaccino_covidResponseProjection tempo_dose_vaccino____associables(String alias, Tempo_dose_vaccinoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tempo_dose_vaccino____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection tempo_dose_vaccino____associables(Dose_vaccino_covidTempo_dose_vaccino____associablesParametrizedInput input, Tempo_dose_vaccinoPageResponseProjection subProjection) {
        return tempo_dose_vaccino____associables(null, input, subProjection);
    }

    public Dose_vaccino_covidResponseProjection tempo_dose_vaccino____associables(String alias, Dose_vaccino_covidTempo_dose_vaccino____associablesParametrizedInput input, Tempo_dose_vaccinoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tempo_dose_vaccino____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection tempo_dose_vaccino_(Tempo_dose_vaccinoResponseProjection subProjection) {
        return tempo_dose_vaccino_(null, subProjection);
    }

    public Dose_vaccino_covidResponseProjection tempo_dose_vaccino_(String alias, Tempo_dose_vaccinoResponseProjection subProjection) {
        add$(new GraphQLResponseField("tempo_dose_vaccino_").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection vaccino_covid___associables(Farmaco_altroPageResponseProjection subProjection) {
        return vaccino_covid___associables((String)null, subProjection);
    }

    public Dose_vaccino_covidResponseProjection vaccino_covid___associables(String alias, Farmaco_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("vaccino_covid___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection vaccino_covid___associables(Dose_vaccino_covidVaccino_covid___associablesParametrizedInput input, Farmaco_altroPageResponseProjection subProjection) {
        return vaccino_covid___associables(null, input, subProjection);
    }

    public Dose_vaccino_covidResponseProjection vaccino_covid___associables(String alias, Dose_vaccino_covidVaccino_covid___associablesParametrizedInput input, Farmaco_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("vaccino_covid___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection vaccino_covid(Farmaco_altroResponseProjection subProjection) {
        return vaccino_covid(null, subProjection);
    }

    public Dose_vaccino_covidResponseProjection vaccino_covid(String alias, Farmaco_altroResponseProjection subProjection) {
        add$(new GraphQLResponseField("vaccino_covid").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection v_dettaglio_(V_dettaglioResponseProjection subProjection) {
        return v_dettaglio_(null, subProjection);
    }

    public Dose_vaccino_covidResponseProjection v_dettaglio_(String alias, V_dettaglioResponseProjection subProjection) {
        add$(new GraphQLResponseField("v_dettaglio_").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_vaccino_covidResponseProjection typename() {
        return typename(null);
    }

    public Dose_vaccino_covidResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Dose_vaccino_covidResponseProjection deepCopy$() {
        return new Dose_vaccino_covidResponseProjection(this);
    }


}
