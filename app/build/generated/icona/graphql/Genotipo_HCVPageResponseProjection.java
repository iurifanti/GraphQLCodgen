package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Genotipo_HCVPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Genotipo_HCVPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Genotipo_HCVPageResponseProjection() {
    }

    public Genotipo_HCVPageResponseProjection(Genotipo_HCVPageResponseProjection projection) {
        super(projection);
    }

    public Genotipo_HCVPageResponseProjection(List<Genotipo_HCVPageResponseProjection> projections) {
        super(projections);
    }

    public Genotipo_HCVPageResponseProjection all$() {
        return all$(3);
    }

    public Genotipo_HCVPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Genotipo_HCVPageResponseProjection.Genotipo_HCVResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Genotipo_HCVPageResponseProjection.Genotipo_HCVResponseProjection.items", projectionDepthOnFields.getOrDefault("Genotipo_HCVPageResponseProjection.Genotipo_HCVResponseProjection.items", 0) + 1);
            this.items(new Genotipo_HCVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Genotipo_HCVPageResponseProjection.Genotipo_HCVResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Genotipo_HCVPageResponseProjection items(Genotipo_HCVResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Genotipo_HCVPageResponseProjection items(String alias, Genotipo_HCVResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Genotipo_HCVPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Genotipo_HCVPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Genotipo_HCVPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Genotipo_HCVPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Genotipo_HCVPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Genotipo_HCVPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Genotipo_HCVPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Genotipo_HCVPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Genotipo_HCVPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Genotipo_HCVPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Genotipo_HCVPageResponseProjection typename() {
        return typename(null);
    }

    public Genotipo_HCVPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Genotipo_HCVPageResponseProjection deepCopy$() {
        return new Genotipo_HCVPageResponseProjection(this);
    }


}
