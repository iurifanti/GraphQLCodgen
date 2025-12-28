package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Luogo_test_HIVPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Luogo_test_HIVPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Luogo_test_HIVPageResponseProjection() {
    }

    public Luogo_test_HIVPageResponseProjection(Luogo_test_HIVPageResponseProjection projection) {
        super(projection);
    }

    public Luogo_test_HIVPageResponseProjection(List<Luogo_test_HIVPageResponseProjection> projections) {
        super(projections);
    }

    public Luogo_test_HIVPageResponseProjection all$() {
        return all$(3);
    }

    public Luogo_test_HIVPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Luogo_test_HIVPageResponseProjection.Luogo_test_HIVResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Luogo_test_HIVPageResponseProjection.Luogo_test_HIVResponseProjection.items", projectionDepthOnFields.getOrDefault("Luogo_test_HIVPageResponseProjection.Luogo_test_HIVResponseProjection.items", 0) + 1);
            this.items(new Luogo_test_HIVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Luogo_test_HIVPageResponseProjection.Luogo_test_HIVResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Luogo_test_HIVPageResponseProjection items(Luogo_test_HIVResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Luogo_test_HIVPageResponseProjection items(String alias, Luogo_test_HIVResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Luogo_test_HIVPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Luogo_test_HIVPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Luogo_test_HIVPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Luogo_test_HIVPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Luogo_test_HIVPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Luogo_test_HIVPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Luogo_test_HIVPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Luogo_test_HIVPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Luogo_test_HIVPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Luogo_test_HIVPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Luogo_test_HIVPageResponseProjection typename() {
        return typename(null);
    }

    public Luogo_test_HIVPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Luogo_test_HIVPageResponseProjection deepCopy$() {
        return new Luogo_test_HIVPageResponseProjection(this);
    }


}
