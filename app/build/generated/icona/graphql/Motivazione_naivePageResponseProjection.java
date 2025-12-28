package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Motivazione_naivePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Motivazione_naivePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Motivazione_naivePageResponseProjection() {
    }

    public Motivazione_naivePageResponseProjection(Motivazione_naivePageResponseProjection projection) {
        super(projection);
    }

    public Motivazione_naivePageResponseProjection(List<Motivazione_naivePageResponseProjection> projections) {
        super(projections);
    }

    public Motivazione_naivePageResponseProjection all$() {
        return all$(3);
    }

    public Motivazione_naivePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Motivazione_naivePageResponseProjection.Motivazione_naiveResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Motivazione_naivePageResponseProjection.Motivazione_naiveResponseProjection.items", projectionDepthOnFields.getOrDefault("Motivazione_naivePageResponseProjection.Motivazione_naiveResponseProjection.items", 0) + 1);
            this.items(new Motivazione_naiveResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Motivazione_naivePageResponseProjection.Motivazione_naiveResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Motivazione_naivePageResponseProjection items(Motivazione_naiveResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Motivazione_naivePageResponseProjection items(String alias, Motivazione_naiveResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Motivazione_naivePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Motivazione_naivePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Motivazione_naivePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Motivazione_naivePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Motivazione_naivePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Motivazione_naivePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Motivazione_naivePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Motivazione_naivePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Motivazione_naivePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Motivazione_naivePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Motivazione_naivePageResponseProjection typename() {
        return typename(null);
    }

    public Motivazione_naivePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Motivazione_naivePageResponseProjection deepCopy$() {
        return new Motivazione_naivePageResponseProjection(this);
    }


}
