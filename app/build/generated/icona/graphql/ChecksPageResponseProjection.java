package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ChecksPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ChecksPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ChecksPageResponseProjection() {
    }

    public ChecksPageResponseProjection(ChecksPageResponseProjection projection) {
        super(projection);
    }

    public ChecksPageResponseProjection(List<ChecksPageResponseProjection> projections) {
        super(projections);
    }

    public ChecksPageResponseProjection all$() {
        return all$(3);
    }

    public ChecksPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ChecksPageResponseProjection.ChecksResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("ChecksPageResponseProjection.ChecksResponseProjection.items", projectionDepthOnFields.getOrDefault("ChecksPageResponseProjection.ChecksResponseProjection.items", 0) + 1);
            this.items(new ChecksResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ChecksPageResponseProjection.ChecksResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public ChecksPageResponseProjection items(ChecksResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public ChecksPageResponseProjection items(String alias, ChecksResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public ChecksPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public ChecksPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ChecksPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public ChecksPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public ChecksPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public ChecksPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public ChecksPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public ChecksPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public ChecksPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public ChecksPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public ChecksPageResponseProjection typename() {
        return typename(null);
    }

    public ChecksPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ChecksPageResponseProjection deepCopy$() {
        return new ChecksPageResponseProjection(this);
    }


}
