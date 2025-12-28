package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Questionario
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class QuestionarioResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public QuestionarioResponseProjection() {
    }

    public QuestionarioResponseProjection(QuestionarioResponseProjection projection) {
        super(projection);
    }

    public QuestionarioResponseProjection(List<QuestionarioResponseProjection> projections) {
        super(projections);
    }

    public QuestionarioResponseProjection all$() {
        return all$(3);
    }

    public QuestionarioResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.descrizione();
        this.domande();
        this.intervallo_compil_mesi();
        this.nome();
        this.parametri_personali();
        this.studi_appartenenza();
        this.titolo();
        this.typename();
        return this;
    }

    public QuestionarioResponseProjection _clientId() {
        return _clientId(null);
    }

    public QuestionarioResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public QuestionarioResponseProjection _id() {
        return _id(null);
    }

    public QuestionarioResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public QuestionarioResponseProjection descrizione() {
        return descrizione(null);
    }

    public QuestionarioResponseProjection descrizione(String alias) {
        add$(new GraphQLResponseField("descrizione").alias(alias));
        return this;
    }

    public QuestionarioResponseProjection domande() {
        return domande(null);
    }

    public QuestionarioResponseProjection domande(String alias) {
        add$(new GraphQLResponseField("domande").alias(alias));
        return this;
    }

    public QuestionarioResponseProjection intervallo_compil_mesi() {
        return intervallo_compil_mesi(null);
    }

    public QuestionarioResponseProjection intervallo_compil_mesi(String alias) {
        add$(new GraphQLResponseField("intervallo_compil_mesi").alias(alias));
        return this;
    }

    public QuestionarioResponseProjection nome() {
        return nome(null);
    }

    public QuestionarioResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public QuestionarioResponseProjection parametri_personali() {
        return parametri_personali(null);
    }

    public QuestionarioResponseProjection parametri_personali(String alias) {
        add$(new GraphQLResponseField("parametri_personali").alias(alias));
        return this;
    }

    public QuestionarioResponseProjection studi_appartenenza() {
        return studi_appartenenza(null);
    }

    public QuestionarioResponseProjection studi_appartenenza(String alias) {
        add$(new GraphQLResponseField("studi_appartenenza").alias(alias));
        return this;
    }

    public QuestionarioResponseProjection titolo() {
        return titolo(null);
    }

    public QuestionarioResponseProjection titolo(String alias) {
        add$(new GraphQLResponseField("titolo").alias(alias));
        return this;
    }

    public QuestionarioResponseProjection typename() {
        return typename(null);
    }

    public QuestionarioResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public QuestionarioResponseProjection deepCopy$() {
        return new QuestionarioResponseProjection(this);
    }


}
