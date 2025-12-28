package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Markers_HDVPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_HDVPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Markers_HDVPageResponseProjection() {
    }

    public Markers_HDVPageResponseProjection(Markers_HDVPageResponseProjection projection) {
        super(projection);
    }

    public Markers_HDVPageResponseProjection(List<Markers_HDVPageResponseProjection> projections) {
        super(projections);
    }

    public Markers_HDVPageResponseProjection all$() {
        return all$(3);
    }

    public Markers_HDVPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Markers_HDVPageResponseProjection.Markers_HDVResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HDVPageResponseProjection.Markers_HDVResponseProjection.items", projectionDepthOnFields.getOrDefault("Markers_HDVPageResponseProjection.Markers_HDVResponseProjection.items", 0) + 1);
            this.items(new Markers_HDVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HDVPageResponseProjection.Markers_HDVResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Markers_HDVPageResponseProjection items(Markers_HDVResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Markers_HDVPageResponseProjection items(String alias, Markers_HDVResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HDVPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Markers_HDVPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Markers_HDVPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Markers_HDVPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Markers_HDVPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Markers_HDVPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Markers_HDVPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Markers_HDVPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Markers_HDVPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Markers_HDVPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Markers_HDVPageResponseProjection typename() {
        return typename(null);
    }

    public Markers_HDVPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Markers_HDVPageResponseProjection deepCopy$() {
        return new Markers_HDVPageResponseProjection(this);
    }


}
