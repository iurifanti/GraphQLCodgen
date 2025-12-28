package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Causa_decessoPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Causa_decessoPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Causa_decessoPageResponseProjection() {
    }

    public Causa_decessoPageResponseProjection(Causa_decessoPageResponseProjection projection) {
        super(projection);
    }

    public Causa_decessoPageResponseProjection(List<Causa_decessoPageResponseProjection> projections) {
        super(projections);
    }

    public Causa_decessoPageResponseProjection all$() {
        return all$(3);
    }

    public Causa_decessoPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Causa_decessoPageResponseProjection.Causa_decessoResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Causa_decessoPageResponseProjection.Causa_decessoResponseProjection.items", projectionDepthOnFields.getOrDefault("Causa_decessoPageResponseProjection.Causa_decessoResponseProjection.items", 0) + 1);
            this.items(new Causa_decessoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Causa_decessoPageResponseProjection.Causa_decessoResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Causa_decessoPageResponseProjection items(Causa_decessoResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Causa_decessoPageResponseProjection items(String alias, Causa_decessoResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Causa_decessoPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Causa_decessoPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Causa_decessoPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Causa_decessoPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Causa_decessoPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Causa_decessoPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Causa_decessoPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Causa_decessoPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Causa_decessoPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Causa_decessoPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Causa_decessoPageResponseProjection typename() {
        return typename(null);
    }

    public Causa_decessoPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Causa_decessoPageResponseProjection deepCopy$() {
        return new Causa_decessoPageResponseProjection(this);
    }


}
