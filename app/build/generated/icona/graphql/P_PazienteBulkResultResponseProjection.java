package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for P_PazienteBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class P_PazienteBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public P_PazienteBulkResultResponseProjection() {
    }

    public P_PazienteBulkResultResponseProjection(P_PazienteBulkResultResponseProjection projection) {
        super(projection);
    }

    public P_PazienteBulkResultResponseProjection(List<P_PazienteBulkResultResponseProjection> projections) {
        super(projections);
    }

    public P_PazienteBulkResultResponseProjection all$() {
        return all$(3);
    }

    public P_PazienteBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("P_PazienteBulkResultResponseProjection.P_PazienteResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("P_PazienteBulkResultResponseProjection.P_PazienteResponseProjection.items", projectionDepthOnFields.getOrDefault("P_PazienteBulkResultResponseProjection.P_PazienteResponseProjection.items", 0) + 1);
            this.items(new P_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("P_PazienteBulkResultResponseProjection.P_PazienteResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public P_PazienteBulkResultResponseProjection items(P_PazienteResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public P_PazienteBulkResultResponseProjection items(String alias, P_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public P_PazienteBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public P_PazienteBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public P_PazienteBulkResultResponseProjection typename() {
        return typename(null);
    }

    public P_PazienteBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public P_PazienteBulkResultResponseProjection deepCopy$() {
        return new P_PazienteBulkResultResponseProjection(this);
    }


}
