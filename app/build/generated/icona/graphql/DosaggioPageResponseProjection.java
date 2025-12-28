package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for dosaggioPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DosaggioPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DosaggioPageResponseProjection() {
    }

    public DosaggioPageResponseProjection(DosaggioPageResponseProjection projection) {
        super(projection);
    }

    public DosaggioPageResponseProjection(List<DosaggioPageResponseProjection> projections) {
        super(projections);
    }

    public DosaggioPageResponseProjection all$() {
        return all$(3);
    }

    public DosaggioPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DosaggioPageResponseProjection.DosaggioResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("DosaggioPageResponseProjection.DosaggioResponseProjection.items", projectionDepthOnFields.getOrDefault("DosaggioPageResponseProjection.DosaggioResponseProjection.items", 0) + 1);
            this.items(new DosaggioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DosaggioPageResponseProjection.DosaggioResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public DosaggioPageResponseProjection items(DosaggioResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public DosaggioPageResponseProjection items(String alias, DosaggioResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public DosaggioPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public DosaggioPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public DosaggioPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public DosaggioPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public DosaggioPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public DosaggioPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public DosaggioPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public DosaggioPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public DosaggioPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public DosaggioPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public DosaggioPageResponseProjection typename() {
        return typename(null);
    }

    public DosaggioPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public DosaggioPageResponseProjection deepCopy$() {
        return new DosaggioPageResponseProjection(this);
    }


}
