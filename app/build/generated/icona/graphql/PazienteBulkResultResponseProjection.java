package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for PazienteBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PazienteBulkResultResponseProjection() {
    }

    public PazienteBulkResultResponseProjection(PazienteBulkResultResponseProjection projection) {
        super(projection);
    }

    public PazienteBulkResultResponseProjection(List<PazienteBulkResultResponseProjection> projections) {
        super(projections);
    }

    public PazienteBulkResultResponseProjection all$() {
        return all$(3);
    }

    public PazienteBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PazienteBulkResultResponseProjection.PazienteResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteBulkResultResponseProjection.PazienteResponseProjection.items", projectionDepthOnFields.getOrDefault("PazienteBulkResultResponseProjection.PazienteResponseProjection.items", 0) + 1);
            this.items(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteBulkResultResponseProjection.PazienteResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public PazienteBulkResultResponseProjection items(PazienteResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public PazienteBulkResultResponseProjection items(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public PazienteBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PazienteBulkResultResponseProjection typename() {
        return typename(null);
    }

    public PazienteBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PazienteBulkResultResponseProjection deepCopy$() {
        return new PazienteBulkResultResponseProjection(this);
    }


}
