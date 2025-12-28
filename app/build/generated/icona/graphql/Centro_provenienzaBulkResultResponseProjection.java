package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Centro_provenienzaBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Centro_provenienzaBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Centro_provenienzaBulkResultResponseProjection() {
    }

    public Centro_provenienzaBulkResultResponseProjection(Centro_provenienzaBulkResultResponseProjection projection) {
        super(projection);
    }

    public Centro_provenienzaBulkResultResponseProjection(List<Centro_provenienzaBulkResultResponseProjection> projections) {
        super(projections);
    }

    public Centro_provenienzaBulkResultResponseProjection all$() {
        return all$(3);
    }

    public Centro_provenienzaBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Centro_provenienzaBulkResultResponseProjection.Centro_provenienzaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Centro_provenienzaBulkResultResponseProjection.Centro_provenienzaResponseProjection.items", projectionDepthOnFields.getOrDefault("Centro_provenienzaBulkResultResponseProjection.Centro_provenienzaResponseProjection.items", 0) + 1);
            this.items(new Centro_provenienzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Centro_provenienzaBulkResultResponseProjection.Centro_provenienzaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public Centro_provenienzaBulkResultResponseProjection items(Centro_provenienzaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Centro_provenienzaBulkResultResponseProjection items(String alias, Centro_provenienzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Centro_provenienzaBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public Centro_provenienzaBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Centro_provenienzaBulkResultResponseProjection typename() {
        return typename(null);
    }

    public Centro_provenienzaBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Centro_provenienzaBulkResultResponseProjection deepCopy$() {
        return new Centro_provenienzaBulkResultResponseProjection(this);
    }


}
