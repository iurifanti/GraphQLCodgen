package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for P_PazientePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class P_PazientePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public P_PazientePageResponseProjection() {
    }

    public P_PazientePageResponseProjection(P_PazientePageResponseProjection projection) {
        super(projection);
    }

    public P_PazientePageResponseProjection(List<P_PazientePageResponseProjection> projections) {
        super(projections);
    }

    public P_PazientePageResponseProjection all$() {
        return all$(3);
    }

    public P_PazientePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("P_PazientePageResponseProjection.P_PazienteResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("P_PazientePageResponseProjection.P_PazienteResponseProjection.items", projectionDepthOnFields.getOrDefault("P_PazientePageResponseProjection.P_PazienteResponseProjection.items", 0) + 1);
            this.items(new P_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("P_PazientePageResponseProjection.P_PazienteResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public P_PazientePageResponseProjection items(P_PazienteResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public P_PazientePageResponseProjection items(String alias, P_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public P_PazientePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public P_PazientePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public P_PazientePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public P_PazientePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public P_PazientePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public P_PazientePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public P_PazientePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public P_PazientePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public P_PazientePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public P_PazientePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public P_PazientePageResponseProjection typename() {
        return typename(null);
    }

    public P_PazientePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public P_PazientePageResponseProjection deepCopy$() {
        return new P_PazientePageResponseProjection(this);
    }


}
