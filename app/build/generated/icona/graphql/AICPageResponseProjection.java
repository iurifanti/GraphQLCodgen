package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for AICPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class AICPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AICPageResponseProjection() {
    }

    public AICPageResponseProjection(AICPageResponseProjection projection) {
        super(projection);
    }

    public AICPageResponseProjection(List<AICPageResponseProjection> projections) {
        super(projections);
    }

    public AICPageResponseProjection all$() {
        return all$(3);
    }

    public AICPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AICPageResponseProjection.AICResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("AICPageResponseProjection.AICResponseProjection.items", projectionDepthOnFields.getOrDefault("AICPageResponseProjection.AICResponseProjection.items", 0) + 1);
            this.items(new AICResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AICPageResponseProjection.AICResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public AICPageResponseProjection items(AICResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public AICPageResponseProjection items(String alias, AICResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public AICPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public AICPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public AICPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public AICPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public AICPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public AICPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public AICPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public AICPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public AICPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public AICPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public AICPageResponseProjection typename() {
        return typename(null);
    }

    public AICPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public AICPageResponseProjection deepCopy$() {
        return new AICPageResponseProjection(this);
    }


}
