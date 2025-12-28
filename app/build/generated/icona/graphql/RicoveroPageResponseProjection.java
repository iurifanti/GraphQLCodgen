package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for RicoveroPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class RicoveroPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RicoveroPageResponseProjection() {
    }

    public RicoveroPageResponseProjection(RicoveroPageResponseProjection projection) {
        super(projection);
    }

    public RicoveroPageResponseProjection(List<RicoveroPageResponseProjection> projections) {
        super(projections);
    }

    public RicoveroPageResponseProjection all$() {
        return all$(3);
    }

    public RicoveroPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RicoveroPageResponseProjection.RicoveroResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("RicoveroPageResponseProjection.RicoveroResponseProjection.items", projectionDepthOnFields.getOrDefault("RicoveroPageResponseProjection.RicoveroResponseProjection.items", 0) + 1);
            this.items(new RicoveroResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RicoveroPageResponseProjection.RicoveroResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public RicoveroPageResponseProjection items(RicoveroResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public RicoveroPageResponseProjection items(String alias, RicoveroResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public RicoveroPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public RicoveroPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public RicoveroPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public RicoveroPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public RicoveroPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public RicoveroPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public RicoveroPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public RicoveroPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public RicoveroPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public RicoveroPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public RicoveroPageResponseProjection typename() {
        return typename(null);
    }

    public RicoveroPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public RicoveroPageResponseProjection deepCopy$() {
        return new RicoveroPageResponseProjection(this);
    }


}
