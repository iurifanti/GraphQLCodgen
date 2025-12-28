package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tempo_visita
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tempo_visitaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tempo_visitaResponseProjection() {
    }

    public Tempo_visitaResponseProjection(Tempo_visitaResponseProjection projection) {
        super(projection);
    }

    public Tempo_visitaResponseProjection(List<Tempo_visitaResponseProjection> projections) {
        super(projections);
    }

    public Tempo_visitaResponseProjection all$() {
        return all$(3);
    }

    public Tempo_visitaResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.altezza();
        this.chimica();
        this.eventi_clinici();
        this.mese();
        this.name();
        this.peso();
        this.plasma_raccolto();
        this.presentato();
        this.questionari();
        this.sangue_intero_raccolto();
        this.viro_immun();
        this.typename();
        return this;
    }

    public Tempo_visitaResponseProjection _clientId() {
        return _clientId(null);
    }

    public Tempo_visitaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection _id() {
        return _id(null);
    }

    public Tempo_visitaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection altezza() {
        return altezza(null);
    }

    public Tempo_visitaResponseProjection altezza(String alias) {
        add$(new GraphQLResponseField("altezza").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection chimica() {
        return chimica(null);
    }

    public Tempo_visitaResponseProjection chimica(String alias) {
        add$(new GraphQLResponseField("chimica").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection eventi_clinici() {
        return eventi_clinici(null);
    }

    public Tempo_visitaResponseProjection eventi_clinici(String alias) {
        add$(new GraphQLResponseField("eventi_clinici").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection mese() {
        return mese(null);
    }

    public Tempo_visitaResponseProjection mese(String alias) {
        add$(new GraphQLResponseField("mese").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection name() {
        return name(null);
    }

    public Tempo_visitaResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection peso() {
        return peso(null);
    }

    public Tempo_visitaResponseProjection peso(String alias) {
        add$(new GraphQLResponseField("peso").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection plasma_raccolto() {
        return plasma_raccolto(null);
    }

    public Tempo_visitaResponseProjection plasma_raccolto(String alias) {
        add$(new GraphQLResponseField("plasma_raccolto").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection presentato() {
        return presentato(null);
    }

    public Tempo_visitaResponseProjection presentato(String alias) {
        add$(new GraphQLResponseField("presentato").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection questionari() {
        return questionari(null);
    }

    public Tempo_visitaResponseProjection questionari(String alias) {
        add$(new GraphQLResponseField("questionari").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection sangue_intero_raccolto() {
        return sangue_intero_raccolto(null);
    }

    public Tempo_visitaResponseProjection sangue_intero_raccolto(String alias) {
        add$(new GraphQLResponseField("sangue_intero_raccolto").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection viro_immun() {
        return viro_immun(null);
    }

    public Tempo_visitaResponseProjection viro_immun(String alias) {
        add$(new GraphQLResponseField("viro_immun").alias(alias));
        return this;
    }

    public Tempo_visitaResponseProjection typename() {
        return typename(null);
    }

    public Tempo_visitaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tempo_visitaResponseProjection deepCopy$() {
        return new Tempo_visitaResponseProjection(this);
    }


}
