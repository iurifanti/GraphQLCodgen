package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for _UserPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class _UserPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public _UserPageResponseProjection() {
    }

    public _UserPageResponseProjection(_UserPageResponseProjection projection) {
        super(projection);
    }

    public _UserPageResponseProjection(List<_UserPageResponseProjection> projections) {
        super(projections);
    }

    public _UserPageResponseProjection all$() {
        return all$(3);
    }

    public _UserPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("_UserPageResponseProjection._UserResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("_UserPageResponseProjection._UserResponseProjection.items", projectionDepthOnFields.getOrDefault("_UserPageResponseProjection._UserResponseProjection.items", 0) + 1);
            this.items(new _UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("_UserPageResponseProjection._UserResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public _UserPageResponseProjection items(_UserResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public _UserPageResponseProjection items(String alias, _UserResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public _UserPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public _UserPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public _UserPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public _UserPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public _UserPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public _UserPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public _UserPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public _UserPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public _UserPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public _UserPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public _UserPageResponseProjection typename() {
        return typename(null);
    }

    public _UserPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public _UserPageResponseProjection deepCopy$() {
        return new _UserPageResponseProjection(this);
    }


}
