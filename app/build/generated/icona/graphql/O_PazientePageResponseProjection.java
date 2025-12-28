package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for O_PazientePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class O_PazientePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public O_PazientePageResponseProjection() {
    }

    public O_PazientePageResponseProjection(O_PazientePageResponseProjection projection) {
        super(projection);
    }

    public O_PazientePageResponseProjection(List<O_PazientePageResponseProjection> projections) {
        super(projections);
    }

    public O_PazientePageResponseProjection all$() {
        return all$(3);
    }

    public O_PazientePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("O_PazientePageResponseProjection.O_PazienteResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("O_PazientePageResponseProjection.O_PazienteResponseProjection.items", projectionDepthOnFields.getOrDefault("O_PazientePageResponseProjection.O_PazienteResponseProjection.items", 0) + 1);
            this.items(new O_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("O_PazientePageResponseProjection.O_PazienteResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public O_PazientePageResponseProjection items(O_PazienteResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public O_PazientePageResponseProjection items(String alias, O_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public O_PazientePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public O_PazientePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public O_PazientePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public O_PazientePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public O_PazientePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public O_PazientePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public O_PazientePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public O_PazientePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public O_PazientePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public O_PazientePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public O_PazientePageResponseProjection typename() {
        return typename(null);
    }

    public O_PazientePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public O_PazientePageResponseProjection deepCopy$() {
        return new O_PazientePageResponseProjection(this);
    }


}
