package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ComponentePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ComponentePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ComponentePageResponseProjection() {
    }

    public ComponentePageResponseProjection(ComponentePageResponseProjection projection) {
        super(projection);
    }

    public ComponentePageResponseProjection(List<ComponentePageResponseProjection> projections) {
        super(projections);
    }

    public ComponentePageResponseProjection all$() {
        return all$(3);
    }

    public ComponentePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ComponentePageResponseProjection.ComponenteResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("ComponentePageResponseProjection.ComponenteResponseProjection.items", projectionDepthOnFields.getOrDefault("ComponentePageResponseProjection.ComponenteResponseProjection.items", 0) + 1);
            this.items(new ComponenteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ComponentePageResponseProjection.ComponenteResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public ComponentePageResponseProjection items(ComponenteResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public ComponentePageResponseProjection items(String alias, ComponenteResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public ComponentePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public ComponentePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ComponentePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public ComponentePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public ComponentePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public ComponentePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public ComponentePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public ComponentePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public ComponentePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public ComponentePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public ComponentePageResponseProjection typename() {
        return typename(null);
    }

    public ComponentePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ComponentePageResponseProjection deepCopy$() {
        return new ComponentePageResponseProjection(this);
    }


}
