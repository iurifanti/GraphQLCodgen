package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Farmaco_antitumorale
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_antitumoraleResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Farmaco_antitumoraleResponseProjection() {
    }

    public Farmaco_antitumoraleResponseProjection(Farmaco_antitumoraleResponseProjection projection) {
        super(projection);
    }

    public Farmaco_antitumoraleResponseProjection(List<Farmaco_antitumoraleResponseProjection> projections) {
        super(projections);
    }

    public Farmaco_antitumoraleResponseProjection all$() {
        return all$(3);
    }

    public Farmaco_antitumoraleResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.combinazioni();
        this.farmaco_ATC();
        this.n_tipi_trattamento_associati();
        this.nome();
        this.tipi_trattamento_associati();
        if (projectionDepthOnFields.getOrDefault("Farmaco_antitumoraleResponseProjection.Tipo_trattamento_antitumoralePageResponseProjection.tipo_trattamento_antitumorale____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_antitumoraleResponseProjection.Tipo_trattamento_antitumoralePageResponseProjection.tipo_trattamento_antitumorale____associables", projectionDepthOnFields.getOrDefault("Farmaco_antitumoraleResponseProjection.Tipo_trattamento_antitumoralePageResponseProjection.tipo_trattamento_antitumorale____associables", 0) + 1);
            this.tipo_trattamento_antitumorale____associables(new Tipo_trattamento_antitumoralePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_antitumoraleResponseProjection.Tipo_trattamento_antitumoralePageResponseProjection.tipo_trattamento_antitumorale____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Farmaco_antitumoraleResponseProjection.Tipo_trattamento_antitumoralePageResponseProjection.tipo_trattamento_antitumorale_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_antitumoraleResponseProjection.Tipo_trattamento_antitumoralePageResponseProjection.tipo_trattamento_antitumorale_", projectionDepthOnFields.getOrDefault("Farmaco_antitumoraleResponseProjection.Tipo_trattamento_antitumoralePageResponseProjection.tipo_trattamento_antitumorale_", 0) + 1);
            this.tipo_trattamento_antitumorale_(new Tipo_trattamento_antitumoralePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_antitumoraleResponseProjection.Tipo_trattamento_antitumoralePageResponseProjection.tipo_trattamento_antitumorale_", 0)));
        }
        this.typename();
        return this;
    }

    public Farmaco_antitumoraleResponseProjection _clientId() {
        return _clientId(null);
    }

    public Farmaco_antitumoraleResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Farmaco_antitumoraleResponseProjection _id() {
        return _id(null);
    }

    public Farmaco_antitumoraleResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Farmaco_antitumoraleResponseProjection combinazioni() {
        return combinazioni(null);
    }

    public Farmaco_antitumoraleResponseProjection combinazioni(String alias) {
        add$(new GraphQLResponseField("combinazioni").alias(alias));
        return this;
    }

    public Farmaco_antitumoraleResponseProjection farmaco_ATC() {
        return farmaco_ATC(null);
    }

    public Farmaco_antitumoraleResponseProjection farmaco_ATC(String alias) {
        add$(new GraphQLResponseField("farmaco_ATC").alias(alias));
        return this;
    }

    public Farmaco_antitumoraleResponseProjection n_tipi_trattamento_associati() {
        return n_tipi_trattamento_associati(null);
    }

    public Farmaco_antitumoraleResponseProjection n_tipi_trattamento_associati(String alias) {
        add$(new GraphQLResponseField("n_tipi_trattamento_associati").alias(alias));
        return this;
    }

    public Farmaco_antitumoraleResponseProjection nome() {
        return nome(null);
    }

    public Farmaco_antitumoraleResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Farmaco_antitumoraleResponseProjection tipi_trattamento_associati() {
        return tipi_trattamento_associati(null);
    }

    public Farmaco_antitumoraleResponseProjection tipi_trattamento_associati(String alias) {
        add$(new GraphQLResponseField("tipi_trattamento_associati").alias(alias));
        return this;
    }

    public Farmaco_antitumoraleResponseProjection tipo_trattamento_antitumorale____associables(Tipo_trattamento_antitumoralePageResponseProjection subProjection) {
        return tipo_trattamento_antitumorale____associables((String)null, subProjection);
    }

    public Farmaco_antitumoraleResponseProjection tipo_trattamento_antitumorale____associables(String alias, Tipo_trattamento_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_trattamento_antitumorale____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_antitumoraleResponseProjection tipo_trattamento_antitumorale____associables(Farmaco_antitumoraleTipo_trattamento_antitumorale____associablesParametrizedInput input, Tipo_trattamento_antitumoralePageResponseProjection subProjection) {
        return tipo_trattamento_antitumorale____associables(null, input, subProjection);
    }

    public Farmaco_antitumoraleResponseProjection tipo_trattamento_antitumorale____associables(String alias, Farmaco_antitumoraleTipo_trattamento_antitumorale____associablesParametrizedInput input, Tipo_trattamento_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_trattamento_antitumorale____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Farmaco_antitumoraleResponseProjection tipo_trattamento_antitumorale_(Tipo_trattamento_antitumoralePageResponseProjection subProjection) {
        return tipo_trattamento_antitumorale_((String)null, subProjection);
    }

    public Farmaco_antitumoraleResponseProjection tipo_trattamento_antitumorale_(String alias, Tipo_trattamento_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_trattamento_antitumorale_").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_antitumoraleResponseProjection tipo_trattamento_antitumorale_(Farmaco_antitumoraleTipo_trattamento_antitumorale_ParametrizedInput input, Tipo_trattamento_antitumoralePageResponseProjection subProjection) {
        return tipo_trattamento_antitumorale_(null, input, subProjection);
    }

    public Farmaco_antitumoraleResponseProjection tipo_trattamento_antitumorale_(String alias, Farmaco_antitumoraleTipo_trattamento_antitumorale_ParametrizedInput input, Tipo_trattamento_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_trattamento_antitumorale_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Farmaco_antitumoraleResponseProjection typename() {
        return typename(null);
    }

    public Farmaco_antitumoraleResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Farmaco_antitumoraleResponseProjection deepCopy$() {
        return new Farmaco_antitumoraleResponseProjection(this);
    }


}
