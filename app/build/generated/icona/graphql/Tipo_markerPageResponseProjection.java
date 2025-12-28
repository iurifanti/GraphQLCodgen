package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tipo_markerPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tipo_markerPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tipo_markerPageResponseProjection() {
    }

    public Tipo_markerPageResponseProjection(Tipo_markerPageResponseProjection projection) {
        super(projection);
    }

    public Tipo_markerPageResponseProjection(List<Tipo_markerPageResponseProjection> projections) {
        super(projections);
    }

    public Tipo_markerPageResponseProjection all$() {
        return all$(3);
    }

    public Tipo_markerPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Tipo_markerPageResponseProjection.Tipo_markerResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Tipo_markerPageResponseProjection.Tipo_markerResponseProjection.items", projectionDepthOnFields.getOrDefault("Tipo_markerPageResponseProjection.Tipo_markerResponseProjection.items", 0) + 1);
            this.items(new Tipo_markerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Tipo_markerPageResponseProjection.Tipo_markerResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Tipo_markerPageResponseProjection items(Tipo_markerResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Tipo_markerPageResponseProjection items(String alias, Tipo_markerResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Tipo_markerPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Tipo_markerPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Tipo_markerPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Tipo_markerPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Tipo_markerPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Tipo_markerPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Tipo_markerPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Tipo_markerPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Tipo_markerPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Tipo_markerPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Tipo_markerPageResponseProjection typename() {
        return typename(null);
    }

    public Tipo_markerPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tipo_markerPageResponseProjection deepCopy$() {
        return new Tipo_markerPageResponseProjection(this);
    }


}
