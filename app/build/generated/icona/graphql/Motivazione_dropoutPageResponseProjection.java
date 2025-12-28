package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Motivazione_dropoutPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Motivazione_dropoutPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Motivazione_dropoutPageResponseProjection() {
    }

    public Motivazione_dropoutPageResponseProjection(Motivazione_dropoutPageResponseProjection projection) {
        super(projection);
    }

    public Motivazione_dropoutPageResponseProjection(List<Motivazione_dropoutPageResponseProjection> projections) {
        super(projections);
    }

    public Motivazione_dropoutPageResponseProjection all$() {
        return all$(3);
    }

    public Motivazione_dropoutPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Motivazione_dropoutPageResponseProjection.Motivazione_dropoutResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Motivazione_dropoutPageResponseProjection.Motivazione_dropoutResponseProjection.items", projectionDepthOnFields.getOrDefault("Motivazione_dropoutPageResponseProjection.Motivazione_dropoutResponseProjection.items", 0) + 1);
            this.items(new Motivazione_dropoutResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Motivazione_dropoutPageResponseProjection.Motivazione_dropoutResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Motivazione_dropoutPageResponseProjection items(Motivazione_dropoutResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Motivazione_dropoutPageResponseProjection items(String alias, Motivazione_dropoutResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Motivazione_dropoutPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Motivazione_dropoutPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Motivazione_dropoutPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Motivazione_dropoutPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Motivazione_dropoutPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Motivazione_dropoutPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Motivazione_dropoutPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Motivazione_dropoutPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Motivazione_dropoutPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Motivazione_dropoutPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Motivazione_dropoutPageResponseProjection typename() {
        return typename(null);
    }

    public Motivazione_dropoutPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Motivazione_dropoutPageResponseProjection deepCopy$() {
        return new Motivazione_dropoutPageResponseProjection(this);
    }


}
