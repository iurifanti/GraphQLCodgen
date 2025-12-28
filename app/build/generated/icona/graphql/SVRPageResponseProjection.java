package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for SVRPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class SVRPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SVRPageResponseProjection() {
    }

    public SVRPageResponseProjection(SVRPageResponseProjection projection) {
        super(projection);
    }

    public SVRPageResponseProjection(List<SVRPageResponseProjection> projections) {
        super(projections);
    }

    public SVRPageResponseProjection all$() {
        return all$(3);
    }

    public SVRPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("SVRPageResponseProjection.SVRResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("SVRPageResponseProjection.SVRResponseProjection.items", projectionDepthOnFields.getOrDefault("SVRPageResponseProjection.SVRResponseProjection.items", 0) + 1);
            this.items(new SVRResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SVRPageResponseProjection.SVRResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public SVRPageResponseProjection items(SVRResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public SVRPageResponseProjection items(String alias, SVRResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public SVRPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public SVRPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public SVRPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public SVRPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public SVRPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public SVRPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public SVRPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public SVRPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public SVRPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public SVRPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public SVRPageResponseProjection typename() {
        return typename(null);
    }

    public SVRPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public SVRPageResponseProjection deepCopy$() {
        return new SVRPageResponseProjection(this);
    }


}
