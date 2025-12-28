package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Gilbert
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class GilbertResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public GilbertResponseProjection() {
    }

    public GilbertResponseProjection(GilbertResponseProjection projection) {
        super(projection);
    }

    public GilbertResponseProjection(List<GilbertResponseProjection> projections) {
        super(projections);
    }

    public GilbertResponseProjection all$() {
        return all$(3);
    }

    public GilbertResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.risultato();
        this.typename();
        return this;
    }

    public GilbertResponseProjection _clientId() {
        return _clientId(null);
    }

    public GilbertResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public GilbertResponseProjection _id() {
        return _id(null);
    }

    public GilbertResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public GilbertResponseProjection risultato() {
        return risultato(null);
    }

    public GilbertResponseProjection risultato(String alias) {
        add$(new GraphQLResponseField("risultato").alias(alias));
        return this;
    }

    public GilbertResponseProjection typename() {
        return typename(null);
    }

    public GilbertResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public GilbertResponseProjection deepCopy$() {
        return new GilbertResponseProjection(this);
    }


}
