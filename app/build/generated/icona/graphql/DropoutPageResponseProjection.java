package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for DropoutPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DropoutPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DropoutPageResponseProjection() {
    }

    public DropoutPageResponseProjection(DropoutPageResponseProjection projection) {
        super(projection);
    }

    public DropoutPageResponseProjection(List<DropoutPageResponseProjection> projections) {
        super(projections);
    }

    public DropoutPageResponseProjection all$() {
        return all$(3);
    }

    public DropoutPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DropoutPageResponseProjection.DropoutResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutPageResponseProjection.DropoutResponseProjection.items", projectionDepthOnFields.getOrDefault("DropoutPageResponseProjection.DropoutResponseProjection.items", 0) + 1);
            this.items(new DropoutResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutPageResponseProjection.DropoutResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public DropoutPageResponseProjection items(DropoutResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public DropoutPageResponseProjection items(String alias, DropoutResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public DropoutPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public DropoutPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public DropoutPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public DropoutPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public DropoutPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public DropoutPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public DropoutPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public DropoutPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public DropoutPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public DropoutPageResponseProjection typename() {
        return typename(null);
    }

    public DropoutPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public DropoutPageResponseProjection deepCopy$() {
        return new DropoutPageResponseProjection(this);
    }


}
