package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Centro_provenienzaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Centro_provenienzaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Centro_provenienzaPageResponseProjection() {
    }

    public Centro_provenienzaPageResponseProjection(Centro_provenienzaPageResponseProjection projection) {
        super(projection);
    }

    public Centro_provenienzaPageResponseProjection(List<Centro_provenienzaPageResponseProjection> projections) {
        super(projections);
    }

    public Centro_provenienzaPageResponseProjection all$() {
        return all$(3);
    }

    public Centro_provenienzaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Centro_provenienzaPageResponseProjection.Centro_provenienzaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Centro_provenienzaPageResponseProjection.Centro_provenienzaResponseProjection.items", projectionDepthOnFields.getOrDefault("Centro_provenienzaPageResponseProjection.Centro_provenienzaResponseProjection.items", 0) + 1);
            this.items(new Centro_provenienzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Centro_provenienzaPageResponseProjection.Centro_provenienzaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Centro_provenienzaPageResponseProjection items(Centro_provenienzaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Centro_provenienzaPageResponseProjection items(String alias, Centro_provenienzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Centro_provenienzaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Centro_provenienzaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Centro_provenienzaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Centro_provenienzaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Centro_provenienzaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Centro_provenienzaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Centro_provenienzaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Centro_provenienzaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Centro_provenienzaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Centro_provenienzaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Centro_provenienzaPageResponseProjection typename() {
        return typename(null);
    }

    public Centro_provenienzaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Centro_provenienzaPageResponseProjection deepCopy$() {
        return new Centro_provenienzaPageResponseProjection(this);
    }


}
