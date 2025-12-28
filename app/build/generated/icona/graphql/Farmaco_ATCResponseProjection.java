package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Farmaco_ATC
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_ATCResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Farmaco_ATCResponseProjection() {
    }

    public Farmaco_ATCResponseProjection(Farmaco_ATCResponseProjection projection) {
        super(projection);
    }

    public Farmaco_ATCResponseProjection(List<Farmaco_ATCResponseProjection> projections) {
        super(projections);
    }

    public Farmaco_ATCResponseProjection all$() {
        return all$(3);
    }

    public Farmaco_ATCResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.antitumorale();
        this.codice();
        this.ddd();
        this.ddd_kind();
        this.ddd_note();
        this.ddd_um();
        this.epatico();
        this.hiv();
        this.livello();
        this.long_acting();
        this.nome();
        this.non_arv();
        this.prep();
        this.titolo();
        if (projectionDepthOnFields.getOrDefault("Farmaco_ATCResponseProjection.AICPageResponseProjection.AIC____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_ATCResponseProjection.AICPageResponseProjection.AIC____associables", projectionDepthOnFields.getOrDefault("Farmaco_ATCResponseProjection.AICPageResponseProjection.AIC____associables", 0) + 1);
            this.AIC____associables(new AICPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_ATCResponseProjection.AICPageResponseProjection.AIC____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Farmaco_ATCResponseProjection.AICPageResponseProjection.AIC_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_ATCResponseProjection.AICPageResponseProjection.AIC_", projectionDepthOnFields.getOrDefault("Farmaco_ATCResponseProjection.AICPageResponseProjection.AIC_", 0) + 1);
            this.AIC_(new AICPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_ATCResponseProjection.AICPageResponseProjection.AIC_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Farmaco_ATCResponseProjection.Classificazione_farmaco_ATCPageResponseProjection.classificazione_farmaco_ATC____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_ATCResponseProjection.Classificazione_farmaco_ATCPageResponseProjection.classificazione_farmaco_ATC____associables", projectionDepthOnFields.getOrDefault("Farmaco_ATCResponseProjection.Classificazione_farmaco_ATCPageResponseProjection.classificazione_farmaco_ATC____associables", 0) + 1);
            this.classificazione_farmaco_ATC____associables(new Classificazione_farmaco_ATCPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_ATCResponseProjection.Classificazione_farmaco_ATCPageResponseProjection.classificazione_farmaco_ATC____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Farmaco_ATCResponseProjection.Classificazione_farmaco_ATCResponseProjection.classificazione_farmaco_ATC_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_ATCResponseProjection.Classificazione_farmaco_ATCResponseProjection.classificazione_farmaco_ATC_", projectionDepthOnFields.getOrDefault("Farmaco_ATCResponseProjection.Classificazione_farmaco_ATCResponseProjection.classificazione_farmaco_ATC_", 0) + 1);
            this.classificazione_farmaco_ATC_(new Classificazione_farmaco_ATCResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_ATCResponseProjection.Classificazione_farmaco_ATCResponseProjection.classificazione_farmaco_ATC_", 0)));
        }
        this.typename();
        return this;
    }

    public Farmaco_ATCResponseProjection _clientId() {
        return _clientId(null);
    }

    public Farmaco_ATCResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection _id() {
        return _id(null);
    }

    public Farmaco_ATCResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection antitumorale() {
        return antitumorale(null);
    }

    public Farmaco_ATCResponseProjection antitumorale(String alias) {
        add$(new GraphQLResponseField("antitumorale").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection codice() {
        return codice(null);
    }

    public Farmaco_ATCResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection ddd() {
        return ddd(null);
    }

    public Farmaco_ATCResponseProjection ddd(String alias) {
        add$(new GraphQLResponseField("ddd").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection ddd_kind() {
        return ddd_kind(null);
    }

    public Farmaco_ATCResponseProjection ddd_kind(String alias) {
        add$(new GraphQLResponseField("ddd_kind").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection ddd_note() {
        return ddd_note(null);
    }

    public Farmaco_ATCResponseProjection ddd_note(String alias) {
        add$(new GraphQLResponseField("ddd_note").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection ddd_um() {
        return ddd_um(null);
    }

    public Farmaco_ATCResponseProjection ddd_um(String alias) {
        add$(new GraphQLResponseField("ddd_um").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection epatico() {
        return epatico(null);
    }

    public Farmaco_ATCResponseProjection epatico(String alias) {
        add$(new GraphQLResponseField("epatico").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection hiv() {
        return hiv(null);
    }

    public Farmaco_ATCResponseProjection hiv(String alias) {
        add$(new GraphQLResponseField("hiv").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection livello() {
        return livello(null);
    }

    public Farmaco_ATCResponseProjection livello(String alias) {
        add$(new GraphQLResponseField("livello").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection long_acting() {
        return long_acting(null);
    }

    public Farmaco_ATCResponseProjection long_acting(String alias) {
        add$(new GraphQLResponseField("long_acting").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection nome() {
        return nome(null);
    }

    public Farmaco_ATCResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection non_arv() {
        return non_arv(null);
    }

    public Farmaco_ATCResponseProjection non_arv(String alias) {
        add$(new GraphQLResponseField("non_arv").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection prep() {
        return prep(null);
    }

    public Farmaco_ATCResponseProjection prep(String alias) {
        add$(new GraphQLResponseField("prep").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection titolo() {
        return titolo(null);
    }

    public Farmaco_ATCResponseProjection titolo(String alias) {
        add$(new GraphQLResponseField("titolo").alias(alias));
        return this;
    }

    public Farmaco_ATCResponseProjection AIC____associables(AICPageResponseProjection subProjection) {
        return AIC____associables((String)null, subProjection);
    }

    public Farmaco_ATCResponseProjection AIC____associables(String alias, AICPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("AIC____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_ATCResponseProjection AIC____associables(Farmaco_ATCAIC____associablesParametrizedInput input, AICPageResponseProjection subProjection) {
        return AIC____associables(null, input, subProjection);
    }

    public Farmaco_ATCResponseProjection AIC____associables(String alias, Farmaco_ATCAIC____associablesParametrizedInput input, AICPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("AIC____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Farmaco_ATCResponseProjection AIC_(AICPageResponseProjection subProjection) {
        return AIC_((String)null, subProjection);
    }

    public Farmaco_ATCResponseProjection AIC_(String alias, AICPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("AIC_").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_ATCResponseProjection AIC_(Farmaco_ATCAIC_ParametrizedInput input, AICPageResponseProjection subProjection) {
        return AIC_(null, input, subProjection);
    }

    public Farmaco_ATCResponseProjection AIC_(String alias, Farmaco_ATCAIC_ParametrizedInput input, AICPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("AIC_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Farmaco_ATCResponseProjection classificazione_farmaco_ATC____associables(Classificazione_farmaco_ATCPageResponseProjection subProjection) {
        return classificazione_farmaco_ATC____associables((String)null, subProjection);
    }

    public Farmaco_ATCResponseProjection classificazione_farmaco_ATC____associables(String alias, Classificazione_farmaco_ATCPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("classificazione_farmaco_ATC____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_ATCResponseProjection classificazione_farmaco_ATC____associables(Farmaco_ATCClassificazione_farmaco_ATC____associablesParametrizedInput input, Classificazione_farmaco_ATCPageResponseProjection subProjection) {
        return classificazione_farmaco_ATC____associables(null, input, subProjection);
    }

    public Farmaco_ATCResponseProjection classificazione_farmaco_ATC____associables(String alias, Farmaco_ATCClassificazione_farmaco_ATC____associablesParametrizedInput input, Classificazione_farmaco_ATCPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("classificazione_farmaco_ATC____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Farmaco_ATCResponseProjection classificazione_farmaco_ATC_(Classificazione_farmaco_ATCResponseProjection subProjection) {
        return classificazione_farmaco_ATC_(null, subProjection);
    }

    public Farmaco_ATCResponseProjection classificazione_farmaco_ATC_(String alias, Classificazione_farmaco_ATCResponseProjection subProjection) {
        add$(new GraphQLResponseField("classificazione_farmaco_ATC_").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_ATCResponseProjection typename() {
        return typename(null);
    }

    public Farmaco_ATCResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Farmaco_ATCResponseProjection deepCopy$() {
        return new Farmaco_ATCResponseProjection(this);
    }


}
