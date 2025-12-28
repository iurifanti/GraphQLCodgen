package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Domanda
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DomandaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DomandaResponseProjection() {
    }

    public DomandaResponseProjection(DomandaResponseProjection projection) {
        super(projection);
    }

    public DomandaResponseProjection(List<DomandaResponseProjection> projections) {
        super(projections);
    }

    public DomandaResponseProjection all$() {
        return all$(3);
    }

    public DomandaResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.condizioni_abilitazione_associate();
        this.ordine();
        this.parametri_personali();
        this.peso();
        this.testo();
        if (projectionDepthOnFields.getOrDefault("DomandaResponseProjection.DomandaPageResponseProjection.peso_domanda___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("DomandaResponseProjection.DomandaPageResponseProjection.peso_domanda___associables", projectionDepthOnFields.getOrDefault("DomandaResponseProjection.DomandaPageResponseProjection.peso_domanda___associables", 0) + 1);
            this.peso_domanda___associables(new DomandaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DomandaResponseProjection.DomandaPageResponseProjection.peso_domanda___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DomandaResponseProjection.DomandaResponseProjection.peso_domanda", 0) <= maxDepth) {
            projectionDepthOnFields.put("DomandaResponseProjection.DomandaResponseProjection.peso_domanda", projectionDepthOnFields.getOrDefault("DomandaResponseProjection.DomandaResponseProjection.peso_domanda", 0) + 1);
            this.peso_domanda(new DomandaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DomandaResponseProjection.DomandaResponseProjection.peso_domanda", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DomandaResponseProjection.QuestionarioPageResponseProjection.questionario____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("DomandaResponseProjection.QuestionarioPageResponseProjection.questionario____associables", projectionDepthOnFields.getOrDefault("DomandaResponseProjection.QuestionarioPageResponseProjection.questionario____associables", 0) + 1);
            this.questionario____associables(new QuestionarioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DomandaResponseProjection.QuestionarioPageResponseProjection.questionario____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DomandaResponseProjection.QuestionarioResponseProjection.questionario_", 0) <= maxDepth) {
            projectionDepthOnFields.put("DomandaResponseProjection.QuestionarioResponseProjection.questionario_", projectionDepthOnFields.getOrDefault("DomandaResponseProjection.QuestionarioResponseProjection.questionario_", 0) + 1);
            this.questionario_(new QuestionarioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DomandaResponseProjection.QuestionarioResponseProjection.questionario_", 0)));
        }
        this.typename();
        return this;
    }

    public DomandaResponseProjection _clientId() {
        return _clientId(null);
    }

    public DomandaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public DomandaResponseProjection _id() {
        return _id(null);
    }

    public DomandaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public DomandaResponseProjection condizioni_abilitazione_associate() {
        return condizioni_abilitazione_associate(null);
    }

    public DomandaResponseProjection condizioni_abilitazione_associate(String alias) {
        add$(new GraphQLResponseField("condizioni_abilitazione_associate").alias(alias));
        return this;
    }

    public DomandaResponseProjection ordine() {
        return ordine(null);
    }

    public DomandaResponseProjection ordine(String alias) {
        add$(new GraphQLResponseField("ordine").alias(alias));
        return this;
    }

    public DomandaResponseProjection parametri_personali() {
        return parametri_personali(null);
    }

    public DomandaResponseProjection parametri_personali(String alias) {
        add$(new GraphQLResponseField("parametri_personali").alias(alias));
        return this;
    }

    public DomandaResponseProjection peso() {
        return peso(null);
    }

    public DomandaResponseProjection peso(String alias) {
        add$(new GraphQLResponseField("peso").alias(alias));
        return this;
    }

    public DomandaResponseProjection testo() {
        return testo(null);
    }

    public DomandaResponseProjection testo(String alias) {
        add$(new GraphQLResponseField("testo").alias(alias));
        return this;
    }

    public DomandaResponseProjection peso_domanda___associables(DomandaPageResponseProjection subProjection) {
        return peso_domanda___associables((String)null, subProjection);
    }

    public DomandaResponseProjection peso_domanda___associables(String alias, DomandaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("peso_domanda___associables").alias(alias).projection(subProjection));
        return this;
    }

    public DomandaResponseProjection peso_domanda___associables(DomandaPeso_domanda___associablesParametrizedInput input, DomandaPageResponseProjection subProjection) {
        return peso_domanda___associables(null, input, subProjection);
    }

    public DomandaResponseProjection peso_domanda___associables(String alias, DomandaPeso_domanda___associablesParametrizedInput input, DomandaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("peso_domanda___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public DomandaResponseProjection peso_domanda(DomandaResponseProjection subProjection) {
        return peso_domanda(null, subProjection);
    }

    public DomandaResponseProjection peso_domanda(String alias, DomandaResponseProjection subProjection) {
        add$(new GraphQLResponseField("peso_domanda").alias(alias).projection(subProjection));
        return this;
    }

    public DomandaResponseProjection questionario____associables(QuestionarioPageResponseProjection subProjection) {
        return questionario____associables((String)null, subProjection);
    }

    public DomandaResponseProjection questionario____associables(String alias, QuestionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario____associables").alias(alias).projection(subProjection));
        return this;
    }

    public DomandaResponseProjection questionario____associables(DomandaQuestionario____associablesParametrizedInput input, QuestionarioPageResponseProjection subProjection) {
        return questionario____associables(null, input, subProjection);
    }

    public DomandaResponseProjection questionario____associables(String alias, DomandaQuestionario____associablesParametrizedInput input, QuestionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public DomandaResponseProjection questionario_(QuestionarioResponseProjection subProjection) {
        return questionario_(null, subProjection);
    }

    public DomandaResponseProjection questionario_(String alias, QuestionarioResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario_").alias(alias).projection(subProjection));
        return this;
    }

    public DomandaResponseProjection typename() {
        return typename(null);
    }

    public DomandaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public DomandaResponseProjection deepCopy$() {
        return new DomandaResponseProjection(this);
    }


}
