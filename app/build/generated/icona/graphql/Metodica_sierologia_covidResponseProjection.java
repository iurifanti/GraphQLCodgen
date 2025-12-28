package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Metodica_sierologia_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Metodica_sierologia_covidResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Metodica_sierologia_covidResponseProjection() {
    }

    public Metodica_sierologia_covidResponseProjection(Metodica_sierologia_covidResponseProjection projection) {
        super(projection);
    }

    public Metodica_sierologia_covidResponseProjection(List<Metodica_sierologia_covidResponseProjection> projections) {
        super(projections);
    }

    public Metodica_sierologia_covidResponseProjection all$() {
        return all$(3);
    }

    public Metodica_sierologia_covidResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.typename();
        return this;
    }

    public Metodica_sierologia_covidResponseProjection _clientId() {
        return _clientId(null);
    }

    public Metodica_sierologia_covidResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Metodica_sierologia_covidResponseProjection _id() {
        return _id(null);
    }

    public Metodica_sierologia_covidResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Metodica_sierologia_covidResponseProjection nome() {
        return nome(null);
    }

    public Metodica_sierologia_covidResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Metodica_sierologia_covidResponseProjection typename() {
        return typename(null);
    }

    public Metodica_sierologia_covidResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Metodica_sierologia_covidResponseProjection deepCopy$() {
        return new Metodica_sierologia_covidResponseProjection(this);
    }


}
