package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Farmaco_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_covidResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Farmaco_covidResponseProjection() {
    }

    public Farmaco_covidResponseProjection(Farmaco_covidResponseProjection projection) {
        super(projection);
    }

    public Farmaco_covidResponseProjection(List<Farmaco_covidResponseProjection> projections) {
        super(projections);
    }

    public Farmaco_covidResponseProjection all$() {
        return all$(3);
    }

    public Farmaco_covidResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.typename();
        return this;
    }

    public Farmaco_covidResponseProjection _clientId() {
        return _clientId(null);
    }

    public Farmaco_covidResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Farmaco_covidResponseProjection _id() {
        return _id(null);
    }

    public Farmaco_covidResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Farmaco_covidResponseProjection nome() {
        return nome(null);
    }

    public Farmaco_covidResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Farmaco_covidResponseProjection typename() {
        return typename(null);
    }

    public Farmaco_covidResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Farmaco_covidResponseProjection deepCopy$() {
        return new Farmaco_covidResponseProjection(this);
    }


}
