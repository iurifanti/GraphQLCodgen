package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tipo_trattamento_antitumorale
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tipo_trattamento_antitumoraleResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tipo_trattamento_antitumoraleResponseProjection() {
    }

    public Tipo_trattamento_antitumoraleResponseProjection(Tipo_trattamento_antitumoraleResponseProjection projection) {
        super(projection);
    }

    public Tipo_trattamento_antitumoraleResponseProjection(List<Tipo_trattamento_antitumoraleResponseProjection> projections) {
        super(projections);
    }

    public Tipo_trattamento_antitumoraleResponseProjection all$() {
        return all$(3);
    }

    public Tipo_trattamento_antitumoraleResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.cellulare();
        this.chemioterapia();
        this.chirurgico();
        this.farmaco_antitumorali_associati();
        this.immunoterapia();
        this.n_farmaci_antitumorali_associati();
        this.nome();
        this.ormonale();
        this.radioterapia();
        this.staminali();
        if (projectionDepthOnFields.getOrDefault("Tipo_trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Tipo_trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale____associables", projectionDepthOnFields.getOrDefault("Tipo_trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale____associables", 0) + 1);
            this.farmaco_antitumorale____associables(new Farmaco_antitumoralePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Tipo_trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Tipo_trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Tipo_trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale_", projectionDepthOnFields.getOrDefault("Tipo_trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale_", 0) + 1);
            this.farmaco_antitumorale_(new Farmaco_antitumoralePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Tipo_trattamento_antitumoraleResponseProjection.Farmaco_antitumoralePageResponseProjection.farmaco_antitumorale_", 0)));
        }
        this.typename();
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection _clientId() {
        return _clientId(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection _id() {
        return _id(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection cellulare() {
        return cellulare(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection cellulare(String alias) {
        add$(new GraphQLResponseField("cellulare").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection chemioterapia() {
        return chemioterapia(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection chemioterapia(String alias) {
        add$(new GraphQLResponseField("chemioterapia").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection chirurgico() {
        return chirurgico(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection chirurgico(String alias) {
        add$(new GraphQLResponseField("chirurgico").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection farmaco_antitumorali_associati() {
        return farmaco_antitumorali_associati(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection farmaco_antitumorali_associati(String alias) {
        add$(new GraphQLResponseField("farmaco_antitumorali_associati").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection immunoterapia() {
        return immunoterapia(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection immunoterapia(String alias) {
        add$(new GraphQLResponseField("immunoterapia").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection n_farmaci_antitumorali_associati() {
        return n_farmaci_antitumorali_associati(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection n_farmaci_antitumorali_associati(String alias) {
        add$(new GraphQLResponseField("n_farmaci_antitumorali_associati").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection nome() {
        return nome(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection ormonale() {
        return ormonale(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection ormonale(String alias) {
        add$(new GraphQLResponseField("ormonale").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection radioterapia() {
        return radioterapia(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection radioterapia(String alias) {
        add$(new GraphQLResponseField("radioterapia").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection staminali() {
        return staminali(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection staminali(String alias) {
        add$(new GraphQLResponseField("staminali").alias(alias));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection farmaco_antitumorale____associables(Farmaco_antitumoralePageResponseProjection subProjection) {
        return farmaco_antitumorale____associables((String)null, subProjection);
    }

    public Tipo_trattamento_antitumoraleResponseProjection farmaco_antitumorale____associables(String alias, Farmaco_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_antitumorale____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection farmaco_antitumorale____associables(Tipo_trattamento_antitumoraleFarmaco_antitumorale____associablesParametrizedInput input, Farmaco_antitumoralePageResponseProjection subProjection) {
        return farmaco_antitumorale____associables(null, input, subProjection);
    }

    public Tipo_trattamento_antitumoraleResponseProjection farmaco_antitumorale____associables(String alias, Tipo_trattamento_antitumoraleFarmaco_antitumorale____associablesParametrizedInput input, Farmaco_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_antitumorale____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection farmaco_antitumorale_(Farmaco_antitumoralePageResponseProjection subProjection) {
        return farmaco_antitumorale_((String)null, subProjection);
    }

    public Tipo_trattamento_antitumoraleResponseProjection farmaco_antitumorale_(String alias, Farmaco_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_antitumorale_").alias(alias).projection(subProjection));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection farmaco_antitumorale_(Tipo_trattamento_antitumoraleFarmaco_antitumorale_ParametrizedInput input, Farmaco_antitumoralePageResponseProjection subProjection) {
        return farmaco_antitumorale_(null, input, subProjection);
    }

    public Tipo_trattamento_antitumoraleResponseProjection farmaco_antitumorale_(String alias, Tipo_trattamento_antitumoraleFarmaco_antitumorale_ParametrizedInput input, Farmaco_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_antitumorale_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Tipo_trattamento_antitumoraleResponseProjection typename() {
        return typename(null);
    }

    public Tipo_trattamento_antitumoraleResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tipo_trattamento_antitumoraleResponseProjection deepCopy$() {
        return new Tipo_trattamento_antitumoraleResponseProjection(this);
    }


}
