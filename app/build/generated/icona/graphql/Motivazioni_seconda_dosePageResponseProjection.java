package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Motivazioni_seconda_dosePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Motivazioni_seconda_dosePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Motivazioni_seconda_dosePageResponseProjection() {
    }

    public Motivazioni_seconda_dosePageResponseProjection(Motivazioni_seconda_dosePageResponseProjection projection) {
        super(projection);
    }

    public Motivazioni_seconda_dosePageResponseProjection(List<Motivazioni_seconda_dosePageResponseProjection> projections) {
        super(projections);
    }

    public Motivazioni_seconda_dosePageResponseProjection all$() {
        return all$(3);
    }

    public Motivazioni_seconda_dosePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Motivazioni_seconda_dosePageResponseProjection.Motivazioni_seconda_doseResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Motivazioni_seconda_dosePageResponseProjection.Motivazioni_seconda_doseResponseProjection.items", projectionDepthOnFields.getOrDefault("Motivazioni_seconda_dosePageResponseProjection.Motivazioni_seconda_doseResponseProjection.items", 0) + 1);
            this.items(new Motivazioni_seconda_doseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Motivazioni_seconda_dosePageResponseProjection.Motivazioni_seconda_doseResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Motivazioni_seconda_dosePageResponseProjection items(Motivazioni_seconda_doseResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Motivazioni_seconda_dosePageResponseProjection items(String alias, Motivazioni_seconda_doseResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Motivazioni_seconda_dosePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Motivazioni_seconda_dosePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Motivazioni_seconda_dosePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Motivazioni_seconda_dosePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Motivazioni_seconda_dosePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Motivazioni_seconda_dosePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Motivazioni_seconda_dosePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Motivazioni_seconda_dosePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Motivazioni_seconda_dosePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Motivazioni_seconda_dosePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Motivazioni_seconda_dosePageResponseProjection typename() {
        return typename(null);
    }

    public Motivazioni_seconda_dosePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Motivazioni_seconda_dosePageResponseProjection deepCopy$() {
        return new Motivazioni_seconda_dosePageResponseProjection(this);
    }


}
