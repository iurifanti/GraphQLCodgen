package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tempo_sierologia_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tempo_sierologia_covidResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tempo_sierologia_covidResponseProjection() {
    }

    public Tempo_sierologia_covidResponseProjection(Tempo_sierologia_covidResponseProjection projection) {
        super(projection);
    }

    public Tempo_sierologia_covidResponseProjection(List<Tempo_sierologia_covidResponseProjection> projections) {
        super(projections);
    }

    public Tempo_sierologia_covidResponseProjection all$() {
        return all$(3);
    }

    public Tempo_sierologia_covidResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.ordine();
        this.typename();
        return this;
    }

    public Tempo_sierologia_covidResponseProjection _clientId() {
        return _clientId(null);
    }

    public Tempo_sierologia_covidResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Tempo_sierologia_covidResponseProjection _id() {
        return _id(null);
    }

    public Tempo_sierologia_covidResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Tempo_sierologia_covidResponseProjection nome() {
        return nome(null);
    }

    public Tempo_sierologia_covidResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Tempo_sierologia_covidResponseProjection ordine() {
        return ordine(null);
    }

    public Tempo_sierologia_covidResponseProjection ordine(String alias) {
        add$(new GraphQLResponseField("ordine").alias(alias));
        return this;
    }

    public Tempo_sierologia_covidResponseProjection typename() {
        return typename(null);
    }

    public Tempo_sierologia_covidResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tempo_sierologia_covidResponseProjection deepCopy$() {
        return new Tempo_sierologia_covidResponseProjection(this);
    }


}
