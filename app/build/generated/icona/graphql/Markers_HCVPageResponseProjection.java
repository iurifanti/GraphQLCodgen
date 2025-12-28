package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Markers_HCVPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_HCVPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Markers_HCVPageResponseProjection() {
    }

    public Markers_HCVPageResponseProjection(Markers_HCVPageResponseProjection projection) {
        super(projection);
    }

    public Markers_HCVPageResponseProjection(List<Markers_HCVPageResponseProjection> projections) {
        super(projections);
    }

    public Markers_HCVPageResponseProjection all$() {
        return all$(3);
    }

    public Markers_HCVPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Markers_HCVPageResponseProjection.Markers_HCVResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HCVPageResponseProjection.Markers_HCVResponseProjection.items", projectionDepthOnFields.getOrDefault("Markers_HCVPageResponseProjection.Markers_HCVResponseProjection.items", 0) + 1);
            this.items(new Markers_HCVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HCVPageResponseProjection.Markers_HCVResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Markers_HCVPageResponseProjection items(Markers_HCVResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Markers_HCVPageResponseProjection items(String alias, Markers_HCVResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HCVPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Markers_HCVPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Markers_HCVPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Markers_HCVPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Markers_HCVPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Markers_HCVPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Markers_HCVPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Markers_HCVPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Markers_HCVPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Markers_HCVPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Markers_HCVPageResponseProjection typename() {
        return typename(null);
    }

    public Markers_HCVPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Markers_HCVPageResponseProjection deepCopy$() {
        return new Markers_HCVPageResponseProjection(this);
    }


}
