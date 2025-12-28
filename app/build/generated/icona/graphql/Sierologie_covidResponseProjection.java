package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Sierologie_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sierologie_covidResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Sierologie_covidResponseProjection() {
    }

    public Sierologie_covidResponseProjection(Sierologie_covidResponseProjection projection) {
        super(projection);
    }

    public Sierologie_covidResponseProjection(List<Sierologie_covidResponseProjection> projections) {
        super(projections);
    }

    public Sierologie_covidResponseProjection all$() {
        return all$(3);
    }

    public Sierologie_covidResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.cc_id();
        this.data_cc();
        this.data_prelievo();
        this.esito();
        this.metodica();
        this.solo_esito();
        this.tempo();
        this.tipo_sierologia();
        this.valore();
        this.vax_ico();
        if (projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Metodica_sierologia_covidPageResponseProjection.metodica_sierologia_covid_n___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sierologie_covidResponseProjection.Metodica_sierologia_covidPageResponseProjection.metodica_sierologia_covid_n___associables", projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Metodica_sierologia_covidPageResponseProjection.metodica_sierologia_covid_n___associables", 0) + 1);
            this.metodica_sierologia_covid_n___associables(new Metodica_sierologia_covidPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Metodica_sierologia_covidPageResponseProjection.metodica_sierologia_covid_n___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Metodica_sierologia_covidResponseProjection.metodica_sierologia_covid_n", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sierologie_covidResponseProjection.Metodica_sierologia_covidResponseProjection.metodica_sierologia_covid_n", projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Metodica_sierologia_covidResponseProjection.metodica_sierologia_covid_n", 0) + 1);
            this.metodica_sierologia_covid_n(new Metodica_sierologia_covidResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Metodica_sierologia_covidResponseProjection.metodica_sierologia_covid_n", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Tempo_sierologia_covidPageResponseProjection.tempo_sierologia_covid____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sierologie_covidResponseProjection.Tempo_sierologia_covidPageResponseProjection.tempo_sierologia_covid____associables", projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Tempo_sierologia_covidPageResponseProjection.tempo_sierologia_covid____associables", 0) + 1);
            this.tempo_sierologia_covid____associables(new Tempo_sierologia_covidPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Tempo_sierologia_covidPageResponseProjection.tempo_sierologia_covid____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Tempo_sierologia_covidResponseProjection.tempo_sierologia_covid_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sierologie_covidResponseProjection.Tempo_sierologia_covidResponseProjection.tempo_sierologia_covid_", projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Tempo_sierologia_covidResponseProjection.tempo_sierologia_covid_", 0) + 1);
            this.tempo_sierologia_covid_(new Tempo_sierologia_covidResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Tempo_sierologia_covidResponseProjection.tempo_sierologia_covid_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Tipo_sierologia_covidPageResponseProjection.tipo_sierologia_covid____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sierologie_covidResponseProjection.Tipo_sierologia_covidPageResponseProjection.tipo_sierologia_covid____associables", projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Tipo_sierologia_covidPageResponseProjection.tipo_sierologia_covid____associables", 0) + 1);
            this.tipo_sierologia_covid____associables(new Tipo_sierologia_covidPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Tipo_sierologia_covidPageResponseProjection.tipo_sierologia_covid____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Tipo_sierologia_covidResponseProjection.tipo_sierologia_covid_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sierologie_covidResponseProjection.Tipo_sierologia_covidResponseProjection.tipo_sierologia_covid_", projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Tipo_sierologia_covidResponseProjection.tipo_sierologia_covid_", 0) + 1);
            this.tipo_sierologia_covid_(new Tipo_sierologia_covidResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Tipo_sierologia_covidResponseProjection.tipo_sierologia_covid_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Controllo_clinicoResponseProjection.controllo_clinico_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sierologie_covidResponseProjection.Controllo_clinicoResponseProjection.controllo_clinico_", projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Controllo_clinicoResponseProjection.controllo_clinico_", 0) + 1);
            this.controllo_clinico_(new Controllo_clinicoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.Controllo_clinicoResponseProjection.controllo_clinico_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.V_dettaglioResponseProjection.v_dettaglio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sierologie_covidResponseProjection.V_dettaglioResponseProjection.v_dettaglio_", projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.V_dettaglioResponseProjection.v_dettaglio_", 0) + 1);
            this.v_dettaglio_(new V_dettaglioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sierologie_covidResponseProjection.V_dettaglioResponseProjection.v_dettaglio_", 0)));
        }
        this.typename();
        return this;
    }

    public Sierologie_covidResponseProjection _clientId() {
        return _clientId(null);
    }

    public Sierologie_covidResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Sierologie_covidResponseProjection _id() {
        return _id(null);
    }

    public Sierologie_covidResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Sierologie_covidResponseProjection cc_id() {
        return cc_id(null);
    }

    public Sierologie_covidResponseProjection cc_id(String alias) {
        add$(new GraphQLResponseField("cc_id").alias(alias));
        return this;
    }

    public Sierologie_covidResponseProjection data_cc() {
        return data_cc(null);
    }

    public Sierologie_covidResponseProjection data_cc(String alias) {
        add$(new GraphQLResponseField("data_cc").alias(alias));
        return this;
    }

    public Sierologie_covidResponseProjection data_prelievo() {
        return data_prelievo(null);
    }

    public Sierologie_covidResponseProjection data_prelievo(String alias) {
        add$(new GraphQLResponseField("data_prelievo").alias(alias));
        return this;
    }

    public Sierologie_covidResponseProjection esito() {
        return esito(null);
    }

    public Sierologie_covidResponseProjection esito(String alias) {
        add$(new GraphQLResponseField("esito").alias(alias));
        return this;
    }

    public Sierologie_covidResponseProjection metodica() {
        return metodica(null);
    }

    public Sierologie_covidResponseProjection metodica(String alias) {
        add$(new GraphQLResponseField("metodica").alias(alias));
        return this;
    }

    public Sierologie_covidResponseProjection solo_esito() {
        return solo_esito(null);
    }

    public Sierologie_covidResponseProjection solo_esito(String alias) {
        add$(new GraphQLResponseField("solo_esito").alias(alias));
        return this;
    }

    public Sierologie_covidResponseProjection tempo() {
        return tempo(null);
    }

    public Sierologie_covidResponseProjection tempo(String alias) {
        add$(new GraphQLResponseField("tempo").alias(alias));
        return this;
    }

    public Sierologie_covidResponseProjection tipo_sierologia() {
        return tipo_sierologia(null);
    }

    public Sierologie_covidResponseProjection tipo_sierologia(String alias) {
        add$(new GraphQLResponseField("tipo_sierologia").alias(alias));
        return this;
    }

    public Sierologie_covidResponseProjection valore() {
        return valore(null);
    }

    public Sierologie_covidResponseProjection valore(String alias) {
        add$(new GraphQLResponseField("valore").alias(alias));
        return this;
    }

    public Sierologie_covidResponseProjection vax_ico() {
        return vax_ico(null);
    }

    public Sierologie_covidResponseProjection vax_ico(String alias) {
        add$(new GraphQLResponseField("vax_ico").alias(alias));
        return this;
    }

    public Sierologie_covidResponseProjection metodica_sierologia_covid_n___associables(Metodica_sierologia_covidPageResponseProjection subProjection) {
        return metodica_sierologia_covid_n___associables((String)null, subProjection);
    }

    public Sierologie_covidResponseProjection metodica_sierologia_covid_n___associables(String alias, Metodica_sierologia_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_sierologia_covid_n___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Sierologie_covidResponseProjection metodica_sierologia_covid_n___associables(Sierologie_covidMetodica_sierologia_covid_n___associablesParametrizedInput input, Metodica_sierologia_covidPageResponseProjection subProjection) {
        return metodica_sierologia_covid_n___associables(null, input, subProjection);
    }

    public Sierologie_covidResponseProjection metodica_sierologia_covid_n___associables(String alias, Sierologie_covidMetodica_sierologia_covid_n___associablesParametrizedInput input, Metodica_sierologia_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_sierologia_covid_n___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Sierologie_covidResponseProjection metodica_sierologia_covid_n(Metodica_sierologia_covidResponseProjection subProjection) {
        return metodica_sierologia_covid_n(null, subProjection);
    }

    public Sierologie_covidResponseProjection metodica_sierologia_covid_n(String alias, Metodica_sierologia_covidResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_sierologia_covid_n").alias(alias).projection(subProjection));
        return this;
    }

    public Sierologie_covidResponseProjection tempo_sierologia_covid____associables(Tempo_sierologia_covidPageResponseProjection subProjection) {
        return tempo_sierologia_covid____associables((String)null, subProjection);
    }

    public Sierologie_covidResponseProjection tempo_sierologia_covid____associables(String alias, Tempo_sierologia_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tempo_sierologia_covid____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Sierologie_covidResponseProjection tempo_sierologia_covid____associables(Sierologie_covidTempo_sierologia_covid____associablesParametrizedInput input, Tempo_sierologia_covidPageResponseProjection subProjection) {
        return tempo_sierologia_covid____associables(null, input, subProjection);
    }

    public Sierologie_covidResponseProjection tempo_sierologia_covid____associables(String alias, Sierologie_covidTempo_sierologia_covid____associablesParametrizedInput input, Tempo_sierologia_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tempo_sierologia_covid____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Sierologie_covidResponseProjection tempo_sierologia_covid_(Tempo_sierologia_covidResponseProjection subProjection) {
        return tempo_sierologia_covid_(null, subProjection);
    }

    public Sierologie_covidResponseProjection tempo_sierologia_covid_(String alias, Tempo_sierologia_covidResponseProjection subProjection) {
        add$(new GraphQLResponseField("tempo_sierologia_covid_").alias(alias).projection(subProjection));
        return this;
    }

    public Sierologie_covidResponseProjection tipo_sierologia_covid____associables(Tipo_sierologia_covidPageResponseProjection subProjection) {
        return tipo_sierologia_covid____associables((String)null, subProjection);
    }

    public Sierologie_covidResponseProjection tipo_sierologia_covid____associables(String alias, Tipo_sierologia_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_sierologia_covid____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Sierologie_covidResponseProjection tipo_sierologia_covid____associables(Sierologie_covidTipo_sierologia_covid____associablesParametrizedInput input, Tipo_sierologia_covidPageResponseProjection subProjection) {
        return tipo_sierologia_covid____associables(null, input, subProjection);
    }

    public Sierologie_covidResponseProjection tipo_sierologia_covid____associables(String alias, Sierologie_covidTipo_sierologia_covid____associablesParametrizedInput input, Tipo_sierologia_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_sierologia_covid____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Sierologie_covidResponseProjection tipo_sierologia_covid_(Tipo_sierologia_covidResponseProjection subProjection) {
        return tipo_sierologia_covid_(null, subProjection);
    }

    public Sierologie_covidResponseProjection tipo_sierologia_covid_(String alias, Tipo_sierologia_covidResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_sierologia_covid_").alias(alias).projection(subProjection));
        return this;
    }

    public Sierologie_covidResponseProjection controllo_clinico_(Controllo_clinicoResponseProjection subProjection) {
        return controllo_clinico_(null, subProjection);
    }

    public Sierologie_covidResponseProjection controllo_clinico_(String alias, Controllo_clinicoResponseProjection subProjection) {
        add$(new GraphQLResponseField("controllo_clinico_").alias(alias).projection(subProjection));
        return this;
    }

    public Sierologie_covidResponseProjection v_dettaglio_(V_dettaglioResponseProjection subProjection) {
        return v_dettaglio_(null, subProjection);
    }

    public Sierologie_covidResponseProjection v_dettaglio_(String alias, V_dettaglioResponseProjection subProjection) {
        add$(new GraphQLResponseField("v_dettaglio_").alias(alias).projection(subProjection));
        return this;
    }

    public Sierologie_covidResponseProjection typename() {
        return typename(null);
    }

    public Sierologie_covidResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Sierologie_covidResponseProjection deepCopy$() {
        return new Sierologie_covidResponseProjection(this);
    }


}
