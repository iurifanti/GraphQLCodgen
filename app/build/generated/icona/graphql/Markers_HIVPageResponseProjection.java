package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Markers_HIVPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_HIVPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Markers_HIVPageResponseProjection() {
    }

    public Markers_HIVPageResponseProjection(Markers_HIVPageResponseProjection projection) {
        super(projection);
    }

    public Markers_HIVPageResponseProjection(List<Markers_HIVPageResponseProjection> projections) {
        super(projections);
    }

    public Markers_HIVPageResponseProjection all$() {
        return all$(3);
    }

    public Markers_HIVPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Markers_HIVPageResponseProjection.Markers_HIVResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HIVPageResponseProjection.Markers_HIVResponseProjection.items", projectionDepthOnFields.getOrDefault("Markers_HIVPageResponseProjection.Markers_HIVResponseProjection.items", 0) + 1);
            this.items(new Markers_HIVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HIVPageResponseProjection.Markers_HIVResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Markers_HIVPageResponseProjection items(Markers_HIVResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Markers_HIVPageResponseProjection items(String alias, Markers_HIVResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HIVPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Markers_HIVPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Markers_HIVPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Markers_HIVPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Markers_HIVPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Markers_HIVPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Markers_HIVPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Markers_HIVPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Markers_HIVPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Markers_HIVPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Markers_HIVPageResponseProjection typename() {
        return typename(null);
    }

    public Markers_HIVPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Markers_HIVPageResponseProjection deepCopy$() {
        return new Markers_HIVPageResponseProjection(this);
    }


}
