package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Motivazione_fine_ARVPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Motivazione_fine_ARVPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Motivazione_fine_ARVPageResponseProjection() {
    }

    public Motivazione_fine_ARVPageResponseProjection(Motivazione_fine_ARVPageResponseProjection projection) {
        super(projection);
    }

    public Motivazione_fine_ARVPageResponseProjection(List<Motivazione_fine_ARVPageResponseProjection> projections) {
        super(projections);
    }

    public Motivazione_fine_ARVPageResponseProjection all$() {
        return all$(3);
    }

    public Motivazione_fine_ARVPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Motivazione_fine_ARVPageResponseProjection.Motivazione_fine_ARVResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Motivazione_fine_ARVPageResponseProjection.Motivazione_fine_ARVResponseProjection.items", projectionDepthOnFields.getOrDefault("Motivazione_fine_ARVPageResponseProjection.Motivazione_fine_ARVResponseProjection.items", 0) + 1);
            this.items(new Motivazione_fine_ARVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Motivazione_fine_ARVPageResponseProjection.Motivazione_fine_ARVResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Motivazione_fine_ARVPageResponseProjection items(Motivazione_fine_ARVResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Motivazione_fine_ARVPageResponseProjection items(String alias, Motivazione_fine_ARVResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Motivazione_fine_ARVPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Motivazione_fine_ARVPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Motivazione_fine_ARVPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Motivazione_fine_ARVPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Motivazione_fine_ARVPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Motivazione_fine_ARVPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Motivazione_fine_ARVPageResponseProjection typename() {
        return typename(null);
    }

    public Motivazione_fine_ARVPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Motivazione_fine_ARVPageResponseProjection deepCopy$() {
        return new Motivazione_fine_ARVPageResponseProjection(this);
    }


}
