package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Outcome_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Outcome_covidResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Outcome_covidResponseProjection() {
    }

    public Outcome_covidResponseProjection(Outcome_covidResponseProjection projection) {
        super(projection);
    }

    public Outcome_covidResponseProjection(List<Outcome_covidResponseProjection> projections) {
        super(projections);
    }

    public Outcome_covidResponseProjection all$() {
        return all$(3);
    }

    public Outcome_covidResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.typename();
        return this;
    }

    public Outcome_covidResponseProjection _clientId() {
        return _clientId(null);
    }

    public Outcome_covidResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Outcome_covidResponseProjection _id() {
        return _id(null);
    }

    public Outcome_covidResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Outcome_covidResponseProjection nome() {
        return nome(null);
    }

    public Outcome_covidResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Outcome_covidResponseProjection typename() {
        return typename(null);
    }

    public Outcome_covidResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Outcome_covidResponseProjection deepCopy$() {
        return new Outcome_covidResponseProjection(this);
    }


}
