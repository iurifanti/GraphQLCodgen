package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Markers_altriPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_altriPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Markers_altriPageResponseProjection() {
    }

    public Markers_altriPageResponseProjection(Markers_altriPageResponseProjection projection) {
        super(projection);
    }

    public Markers_altriPageResponseProjection(List<Markers_altriPageResponseProjection> projections) {
        super(projections);
    }

    public Markers_altriPageResponseProjection all$() {
        return all$(3);
    }

    public Markers_altriPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Markers_altriPageResponseProjection.Markers_altriResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_altriPageResponseProjection.Markers_altriResponseProjection.items", projectionDepthOnFields.getOrDefault("Markers_altriPageResponseProjection.Markers_altriResponseProjection.items", 0) + 1);
            this.items(new Markers_altriResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_altriPageResponseProjection.Markers_altriResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Markers_altriPageResponseProjection items(Markers_altriResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Markers_altriPageResponseProjection items(String alias, Markers_altriResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_altriPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Markers_altriPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Markers_altriPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Markers_altriPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Markers_altriPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Markers_altriPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Markers_altriPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Markers_altriPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Markers_altriPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Markers_altriPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Markers_altriPageResponseProjection typename() {
        return typename(null);
    }

    public Markers_altriPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Markers_altriPageResponseProjection deepCopy$() {
        return new Markers_altriPageResponseProjection(this);
    }


}
