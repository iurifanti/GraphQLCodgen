package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ChecksBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ChecksBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ChecksBulkResultResponseProjection() {
    }

    public ChecksBulkResultResponseProjection(ChecksBulkResultResponseProjection projection) {
        super(projection);
    }

    public ChecksBulkResultResponseProjection(List<ChecksBulkResultResponseProjection> projections) {
        super(projections);
    }

    public ChecksBulkResultResponseProjection all$() {
        return all$(3);
    }

    public ChecksBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ChecksBulkResultResponseProjection.ChecksResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChecksBulkResultResponseProjection.ChecksResponseProjection.items", projectionDepthOnFields.getOrDefault("ChecksBulkResultResponseProjection.ChecksResponseProjection.items", 0) + 1);
            this.items(new ChecksResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChecksBulkResultResponseProjection.ChecksResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public ChecksBulkResultResponseProjection items(ChecksResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public ChecksBulkResultResponseProjection items(String alias, ChecksResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public ChecksBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public ChecksBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ChecksBulkResultResponseProjection typename() {
        return typename(null);
    }

    public ChecksBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ChecksBulkResultResponseProjection deepCopy$() {
        return new ChecksBulkResultResponseProjection(this);
    }


}
