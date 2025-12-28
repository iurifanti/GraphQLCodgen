package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Markers_HBVPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_HBVPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Markers_HBVPageResponseProjection() {
    }

    public Markers_HBVPageResponseProjection(Markers_HBVPageResponseProjection projection) {
        super(projection);
    }

    public Markers_HBVPageResponseProjection(List<Markers_HBVPageResponseProjection> projections) {
        super(projections);
    }

    public Markers_HBVPageResponseProjection all$() {
        return all$(3);
    }

    public Markers_HBVPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Markers_HBVPageResponseProjection.Markers_HBVResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HBVPageResponseProjection.Markers_HBVResponseProjection.items", projectionDepthOnFields.getOrDefault("Markers_HBVPageResponseProjection.Markers_HBVResponseProjection.items", 0) + 1);
            this.items(new Markers_HBVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HBVPageResponseProjection.Markers_HBVResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Markers_HBVPageResponseProjection items(Markers_HBVResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Markers_HBVPageResponseProjection items(String alias, Markers_HBVResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HBVPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Markers_HBVPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Markers_HBVPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Markers_HBVPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Markers_HBVPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Markers_HBVPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Markers_HBVPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Markers_HBVPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Markers_HBVPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Markers_HBVPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Markers_HBVPageResponseProjection typename() {
        return typename(null);
    }

    public Markers_HBVPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Markers_HBVPageResponseProjection deepCopy$() {
        return new Markers_HBVPageResponseProjection(this);
    }


}
