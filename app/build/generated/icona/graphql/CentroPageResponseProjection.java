package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for CentroPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CentroPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CentroPageResponseProjection() {
    }

    public CentroPageResponseProjection(CentroPageResponseProjection projection) {
        super(projection);
    }

    public CentroPageResponseProjection(List<CentroPageResponseProjection> projections) {
        super(projections);
    }

    public CentroPageResponseProjection all$() {
        return all$(3);
    }

    public CentroPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CentroPageResponseProjection.CentroResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("CentroPageResponseProjection.CentroResponseProjection.items", projectionDepthOnFields.getOrDefault("CentroPageResponseProjection.CentroResponseProjection.items", 0) + 1);
            this.items(new CentroResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CentroPageResponseProjection.CentroResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public CentroPageResponseProjection items(CentroResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public CentroPageResponseProjection items(String alias, CentroResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public CentroPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public CentroPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public CentroPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public CentroPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public CentroPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public CentroPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public CentroPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public CentroPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public CentroPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public CentroPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public CentroPageResponseProjection typename() {
        return typename(null);
    }

    public CentroPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public CentroPageResponseProjection deepCopy$() {
        return new CentroPageResponseProjection(this);
    }


}
