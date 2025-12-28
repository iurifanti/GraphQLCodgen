package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ProvinciaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ProvinciaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ProvinciaPageResponseProjection() {
    }

    public ProvinciaPageResponseProjection(ProvinciaPageResponseProjection projection) {
        super(projection);
    }

    public ProvinciaPageResponseProjection(List<ProvinciaPageResponseProjection> projections) {
        super(projections);
    }

    public ProvinciaPageResponseProjection all$() {
        return all$(3);
    }

    public ProvinciaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProvinciaPageResponseProjection.ProvinciaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProvinciaPageResponseProjection.ProvinciaResponseProjection.items", projectionDepthOnFields.getOrDefault("ProvinciaPageResponseProjection.ProvinciaResponseProjection.items", 0) + 1);
            this.items(new ProvinciaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProvinciaPageResponseProjection.ProvinciaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public ProvinciaPageResponseProjection items(ProvinciaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public ProvinciaPageResponseProjection items(String alias, ProvinciaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public ProvinciaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public ProvinciaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ProvinciaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public ProvinciaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public ProvinciaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public ProvinciaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public ProvinciaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public ProvinciaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public ProvinciaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public ProvinciaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public ProvinciaPageResponseProjection typename() {
        return typename(null);
    }

    public ProvinciaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ProvinciaPageResponseProjection deepCopy$() {
        return new ProvinciaPageResponseProjection(this);
    }


}
