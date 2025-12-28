package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Terapia_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Terapia_covidResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Terapia_covidResponseProjection() {
    }

    public Terapia_covidResponseProjection(Terapia_covidResponseProjection projection) {
        super(projection);
    }

    public Terapia_covidResponseProjection(List<Terapia_covidResponseProjection> projections) {
        super(projections);
    }

    public Terapia_covidResponseProjection all$() {
        return all$(3);
    }

    public Terapia_covidResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.altro_farmaco();
        this.data_fine();
        this.data_inizio();
        this.farmaco_covid();
        if (projectionDepthOnFields.getOrDefault("Terapia_covidResponseProjection.Farmaco_covidPageResponseProjection.farmaco_covid____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_covidResponseProjection.Farmaco_covidPageResponseProjection.farmaco_covid____associables", projectionDepthOnFields.getOrDefault("Terapia_covidResponseProjection.Farmaco_covidPageResponseProjection.farmaco_covid____associables", 0) + 1);
            this.farmaco_covid____associables(new Farmaco_covidPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_covidResponseProjection.Farmaco_covidPageResponseProjection.farmaco_covid____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_covidResponseProjection.Farmaco_covidResponseProjection.farmaco_covid_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_covidResponseProjection.Farmaco_covidResponseProjection.farmaco_covid_", projectionDepthOnFields.getOrDefault("Terapia_covidResponseProjection.Farmaco_covidResponseProjection.farmaco_covid_", 0) + 1);
            this.farmaco_covid_(new Farmaco_covidResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_covidResponseProjection.Farmaco_covidResponseProjection.farmaco_covid_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_covidResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_covidResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", projectionDepthOnFields.getOrDefault("Terapia_covidResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", 0) + 1);
            this.c_dettaglio_(new C_dettaglioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_covidResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", 0)));
        }
        this.typename();
        return this;
    }

    public Terapia_covidResponseProjection _clientId() {
        return _clientId(null);
    }

    public Terapia_covidResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Terapia_covidResponseProjection _id() {
        return _id(null);
    }

    public Terapia_covidResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Terapia_covidResponseProjection altro_farmaco() {
        return altro_farmaco(null);
    }

    public Terapia_covidResponseProjection altro_farmaco(String alias) {
        add$(new GraphQLResponseField("altro_farmaco").alias(alias));
        return this;
    }

    public Terapia_covidResponseProjection data_fine() {
        return data_fine(null);
    }

    public Terapia_covidResponseProjection data_fine(String alias) {
        add$(new GraphQLResponseField("data_fine").alias(alias));
        return this;
    }

    public Terapia_covidResponseProjection data_inizio() {
        return data_inizio(null);
    }

    public Terapia_covidResponseProjection data_inizio(String alias) {
        add$(new GraphQLResponseField("data_inizio").alias(alias));
        return this;
    }

    public Terapia_covidResponseProjection farmaco_covid() {
        return farmaco_covid(null);
    }

    public Terapia_covidResponseProjection farmaco_covid(String alias) {
        add$(new GraphQLResponseField("farmaco_covid").alias(alias));
        return this;
    }

    public Terapia_covidResponseProjection farmaco_covid____associables(Farmaco_covidPageResponseProjection subProjection) {
        return farmaco_covid____associables((String)null, subProjection);
    }

    public Terapia_covidResponseProjection farmaco_covid____associables(String alias, Farmaco_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_covid____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_covidResponseProjection farmaco_covid____associables(Terapia_covidFarmaco_covid____associablesParametrizedInput input, Farmaco_covidPageResponseProjection subProjection) {
        return farmaco_covid____associables(null, input, subProjection);
    }

    public Terapia_covidResponseProjection farmaco_covid____associables(String alias, Terapia_covidFarmaco_covid____associablesParametrizedInput input, Farmaco_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_covid____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Terapia_covidResponseProjection farmaco_covid_(Farmaco_covidResponseProjection subProjection) {
        return farmaco_covid_(null, subProjection);
    }

    public Terapia_covidResponseProjection farmaco_covid_(String alias, Farmaco_covidResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_covid_").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_covidResponseProjection c_dettaglio_(C_dettaglioResponseProjection subProjection) {
        return c_dettaglio_(null, subProjection);
    }

    public Terapia_covidResponseProjection c_dettaglio_(String alias, C_dettaglioResponseProjection subProjection) {
        add$(new GraphQLResponseField("c_dettaglio_").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_covidResponseProjection typename() {
        return typename(null);
    }

    public Terapia_covidResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Terapia_covidResponseProjection deepCopy$() {
        return new Terapia_covidResponseProjection(this);
    }


}
