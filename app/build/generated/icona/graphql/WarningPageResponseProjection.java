package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for WarningPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class WarningPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WarningPageResponseProjection() {
    }

    public WarningPageResponseProjection(WarningPageResponseProjection projection) {
        super(projection);
    }

    public WarningPageResponseProjection(List<WarningPageResponseProjection> projections) {
        super(projections);
    }

    public WarningPageResponseProjection all$() {
        return all$(3);
    }

    public WarningPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("WarningPageResponseProjection.WarningResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("WarningPageResponseProjection.WarningResponseProjection.items", projectionDepthOnFields.getOrDefault("WarningPageResponseProjection.WarningResponseProjection.items", 0) + 1);
            this.items(new WarningResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WarningPageResponseProjection.WarningResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public WarningPageResponseProjection items(WarningResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public WarningPageResponseProjection items(String alias, WarningResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public WarningPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public WarningPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public WarningPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public WarningPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public WarningPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public WarningPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public WarningPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public WarningPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public WarningPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public WarningPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public WarningPageResponseProjection typename() {
        return typename(null);
    }

    public WarningPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public WarningPageResponseProjection deepCopy$() {
        return new WarningPageResponseProjection(this);
    }


}
