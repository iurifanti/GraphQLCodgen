package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Dose_mpvPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Dose_mpvPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Dose_mpvPageResponseProjection() {
    }

    public Dose_mpvPageResponseProjection(Dose_mpvPageResponseProjection projection) {
        super(projection);
    }

    public Dose_mpvPageResponseProjection(List<Dose_mpvPageResponseProjection> projections) {
        super(projections);
    }

    public Dose_mpvPageResponseProjection all$() {
        return all$(3);
    }

    public Dose_mpvPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Dose_mpvPageResponseProjection.Dose_mpvResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_mpvPageResponseProjection.Dose_mpvResponseProjection.items", projectionDepthOnFields.getOrDefault("Dose_mpvPageResponseProjection.Dose_mpvResponseProjection.items", 0) + 1);
            this.items(new Dose_mpvResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_mpvPageResponseProjection.Dose_mpvResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Dose_mpvPageResponseProjection items(Dose_mpvResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Dose_mpvPageResponseProjection items(String alias, Dose_mpvResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_mpvPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Dose_mpvPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Dose_mpvPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Dose_mpvPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Dose_mpvPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Dose_mpvPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Dose_mpvPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Dose_mpvPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Dose_mpvPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Dose_mpvPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Dose_mpvPageResponseProjection typename() {
        return typename(null);
    }

    public Dose_mpvPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Dose_mpvPageResponseProjection deepCopy$() {
        return new Dose_mpvPageResponseProjection(this);
    }


}
