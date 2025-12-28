package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for _UserBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class _UserBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public _UserBulkResultResponseProjection() {
    }

    public _UserBulkResultResponseProjection(_UserBulkResultResponseProjection projection) {
        super(projection);
    }

    public _UserBulkResultResponseProjection(List<_UserBulkResultResponseProjection> projections) {
        super(projections);
    }

    public _UserBulkResultResponseProjection all$() {
        return all$(3);
    }

    public _UserBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("_UserBulkResultResponseProjection._UserResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("_UserBulkResultResponseProjection._UserResponseProjection.items", projectionDepthOnFields.getOrDefault("_UserBulkResultResponseProjection._UserResponseProjection.items", 0) + 1);
            this.items(new _UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("_UserBulkResultResponseProjection._UserResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public _UserBulkResultResponseProjection items(_UserResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public _UserBulkResultResponseProjection items(String alias, _UserResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public _UserBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public _UserBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public _UserBulkResultResponseProjection typename() {
        return typename(null);
    }

    public _UserBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public _UserBulkResultResponseProjection deepCopy$() {
        return new _UserBulkResultResponseProjection(this);
    }


}
