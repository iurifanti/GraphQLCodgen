package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Gruppo
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class GruppoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public GruppoResponseProjection() {
    }

    public GruppoResponseProjection(GruppoResponseProjection projection) {
        super(projection);
    }

    public GruppoResponseProjection(List<GruppoResponseProjection> projections) {
        super(projections);
    }

    public GruppoResponseProjection all$() {
        return all$(3);
    }

    public GruppoResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.cod();
        this.nome();
        this.typename();
        return this;
    }

    public GruppoResponseProjection _clientId() {
        return _clientId(null);
    }

    public GruppoResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public GruppoResponseProjection _id() {
        return _id(null);
    }

    public GruppoResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public GruppoResponseProjection cod() {
        return cod(null);
    }

    public GruppoResponseProjection cod(String alias) {
        add$(new GraphQLResponseField("cod").alias(alias));
        return this;
    }

    public GruppoResponseProjection nome() {
        return nome(null);
    }

    public GruppoResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public GruppoResponseProjection typename() {
        return typename(null);
    }

    public GruppoResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public GruppoResponseProjection deepCopy$() {
        return new GruppoResponseProjection(this);
    }


}
