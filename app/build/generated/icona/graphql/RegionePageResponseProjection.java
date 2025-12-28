package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for RegionePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class RegionePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RegionePageResponseProjection() {
    }

    public RegionePageResponseProjection(RegionePageResponseProjection projection) {
        super(projection);
    }

    public RegionePageResponseProjection(List<RegionePageResponseProjection> projections) {
        super(projections);
    }

    public RegionePageResponseProjection all$() {
        return all$(3);
    }

    public RegionePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RegionePageResponseProjection.RegioneResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegionePageResponseProjection.RegioneResponseProjection.items", projectionDepthOnFields.getOrDefault("RegionePageResponseProjection.RegioneResponseProjection.items", 0) + 1);
            this.items(new RegioneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegionePageResponseProjection.RegioneResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public RegionePageResponseProjection items(RegioneResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public RegionePageResponseProjection items(String alias, RegioneResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public RegionePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public RegionePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RegionePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public RegionePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public RegionePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public RegionePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public RegionePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public RegionePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public RegionePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public RegionePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public RegionePageResponseProjection typename() {
        return typename(null);
    }

    public RegionePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public RegionePageResponseProjection deepCopy$() {
        return new RegionePageResponseProjection(this);
    }


}
