package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for DomandaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DomandaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DomandaPageResponseProjection() {
    }

    public DomandaPageResponseProjection(DomandaPageResponseProjection projection) {
        super(projection);
    }

    public DomandaPageResponseProjection(List<DomandaPageResponseProjection> projections) {
        super(projections);
    }

    public DomandaPageResponseProjection all$() {
        return all$(3);
    }

    public DomandaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("DomandaPageResponseProjection.DomandaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("DomandaPageResponseProjection.DomandaResponseProjection.items", projectionDepthOnFields.getOrDefault("DomandaPageResponseProjection.DomandaResponseProjection.items", 0) + 1);
            this.items(new DomandaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DomandaPageResponseProjection.DomandaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public DomandaPageResponseProjection items(DomandaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public DomandaPageResponseProjection items(String alias, DomandaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public DomandaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public DomandaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public DomandaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public DomandaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public DomandaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public DomandaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public DomandaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public DomandaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public DomandaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public DomandaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public DomandaPageResponseProjection typename() {
        return typename(null);
    }

    public DomandaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public DomandaPageResponseProjection deepCopy$() {
        return new DomandaPageResponseProjection(this);
    }


}
