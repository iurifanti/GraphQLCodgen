package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Evento_epaticoPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Evento_epaticoPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Evento_epaticoPageResponseProjection() {
    }

    public Evento_epaticoPageResponseProjection(Evento_epaticoPageResponseProjection projection) {
        super(projection);
    }

    public Evento_epaticoPageResponseProjection(List<Evento_epaticoPageResponseProjection> projections) {
        super(projections);
    }

    public Evento_epaticoPageResponseProjection all$() {
        return all$(3);
    }

    public Evento_epaticoPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Evento_epaticoPageResponseProjection.Evento_epaticoResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Evento_epaticoPageResponseProjection.Evento_epaticoResponseProjection.items", projectionDepthOnFields.getOrDefault("Evento_epaticoPageResponseProjection.Evento_epaticoResponseProjection.items", 0) + 1);
            this.items(new Evento_epaticoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Evento_epaticoPageResponseProjection.Evento_epaticoResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Evento_epaticoPageResponseProjection items(Evento_epaticoResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Evento_epaticoPageResponseProjection items(String alias, Evento_epaticoResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Evento_epaticoPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Evento_epaticoPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Evento_epaticoPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Evento_epaticoPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Evento_epaticoPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Evento_epaticoPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Evento_epaticoPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Evento_epaticoPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Evento_epaticoPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Evento_epaticoPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Evento_epaticoPageResponseProjection typename() {
        return typename(null);
    }

    public Evento_epaticoPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Evento_epaticoPageResponseProjection deepCopy$() {
        return new Evento_epaticoPageResponseProjection(this);
    }


}
