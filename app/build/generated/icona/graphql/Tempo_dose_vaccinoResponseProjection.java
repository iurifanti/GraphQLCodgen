package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tempo_dose_vaccino
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tempo_dose_vaccinoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tempo_dose_vaccinoResponseProjection() {
    }

    public Tempo_dose_vaccinoResponseProjection(Tempo_dose_vaccinoResponseProjection projection) {
        super(projection);
    }

    public Tempo_dose_vaccinoResponseProjection(List<Tempo_dose_vaccinoResponseProjection> projections) {
        super(projections);
    }

    public Tempo_dose_vaccinoResponseProjection all$() {
        return all$(3);
    }

    public Tempo_dose_vaccinoResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.ordine();
        this.typename();
        return this;
    }

    public Tempo_dose_vaccinoResponseProjection _clientId() {
        return _clientId(null);
    }

    public Tempo_dose_vaccinoResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Tempo_dose_vaccinoResponseProjection _id() {
        return _id(null);
    }

    public Tempo_dose_vaccinoResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Tempo_dose_vaccinoResponseProjection nome() {
        return nome(null);
    }

    public Tempo_dose_vaccinoResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Tempo_dose_vaccinoResponseProjection ordine() {
        return ordine(null);
    }

    public Tempo_dose_vaccinoResponseProjection ordine(String alias) {
        add$(new GraphQLResponseField("ordine").alias(alias));
        return this;
    }

    public Tempo_dose_vaccinoResponseProjection typename() {
        return typename(null);
    }

    public Tempo_dose_vaccinoResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tempo_dose_vaccinoResponseProjection deepCopy$() {
        return new Tempo_dose_vaccinoResponseProjection(this);
    }


}
