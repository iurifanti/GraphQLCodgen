package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for GilbertPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class GilbertPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public GilbertPageResponseProjection() {
    }

    public GilbertPageResponseProjection(GilbertPageResponseProjection projection) {
        super(projection);
    }

    public GilbertPageResponseProjection(List<GilbertPageResponseProjection> projections) {
        super(projections);
    }

    public GilbertPageResponseProjection all$() {
        return all$(3);
    }

    public GilbertPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("GilbertPageResponseProjection.GilbertResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("GilbertPageResponseProjection.GilbertResponseProjection.items", projectionDepthOnFields.getOrDefault("GilbertPageResponseProjection.GilbertResponseProjection.items", 0) + 1);
            this.items(new GilbertResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GilbertPageResponseProjection.GilbertResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public GilbertPageResponseProjection items(GilbertResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public GilbertPageResponseProjection items(String alias, GilbertResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public GilbertPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public GilbertPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public GilbertPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public GilbertPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public GilbertPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public GilbertPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public GilbertPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public GilbertPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public GilbertPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public GilbertPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public GilbertPageResponseProjection typename() {
        return typename(null);
    }

    public GilbertPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public GilbertPageResponseProjection deepCopy$() {
        return new GilbertPageResponseProjection(this);
    }


}
