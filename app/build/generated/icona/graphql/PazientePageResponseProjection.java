package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for PazientePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazientePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PazientePageResponseProjection() {
    }

    public PazientePageResponseProjection(PazientePageResponseProjection projection) {
        super(projection);
    }

    public PazientePageResponseProjection(List<PazientePageResponseProjection> projections) {
        super(projections);
    }

    public PazientePageResponseProjection all$() {
        return all$(3);
    }

    public PazientePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PazientePageResponseProjection.PazienteResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazientePageResponseProjection.PazienteResponseProjection.items", projectionDepthOnFields.getOrDefault("PazientePageResponseProjection.PazienteResponseProjection.items", 0) + 1);
            this.items(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazientePageResponseProjection.PazienteResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public PazientePageResponseProjection items(PazienteResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public PazientePageResponseProjection items(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public PazientePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public PazientePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PazientePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public PazientePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public PazientePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public PazientePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public PazientePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public PazientePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public PazientePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public PazientePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public PazientePageResponseProjection typename() {
        return typename(null);
    }

    public PazientePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PazientePageResponseProjection deepCopy$() {
        return new PazientePageResponseProjection(this);
    }


}
