package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for H_PazientePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class H_PazientePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public H_PazientePageResponseProjection() {
    }

    public H_PazientePageResponseProjection(H_PazientePageResponseProjection projection) {
        super(projection);
    }

    public H_PazientePageResponseProjection(List<H_PazientePageResponseProjection> projections) {
        super(projections);
    }

    public H_PazientePageResponseProjection all$() {
        return all$(3);
    }

    public H_PazientePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("H_PazientePageResponseProjection.H_PazienteResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("H_PazientePageResponseProjection.H_PazienteResponseProjection.items", projectionDepthOnFields.getOrDefault("H_PazientePageResponseProjection.H_PazienteResponseProjection.items", 0) + 1);
            this.items(new H_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("H_PazientePageResponseProjection.H_PazienteResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public H_PazientePageResponseProjection items(H_PazienteResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public H_PazientePageResponseProjection items(String alias, H_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public H_PazientePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public H_PazientePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public H_PazientePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public H_PazientePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public H_PazientePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public H_PazientePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public H_PazientePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public H_PazientePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public H_PazientePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public H_PazientePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public H_PazientePageResponseProjection typename() {
        return typename(null);
    }

    public H_PazientePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public H_PazientePageResponseProjection deepCopy$() {
        return new H_PazientePageResponseProjection(this);
    }


}
