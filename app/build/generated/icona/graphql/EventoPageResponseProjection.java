package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for EventoPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class EventoPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EventoPageResponseProjection() {
    }

    public EventoPageResponseProjection(EventoPageResponseProjection projection) {
        super(projection);
    }

    public EventoPageResponseProjection(List<EventoPageResponseProjection> projections) {
        super(projections);
    }

    public EventoPageResponseProjection all$() {
        return all$(3);
    }

    public EventoPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EventoPageResponseProjection.EventoResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("EventoPageResponseProjection.EventoResponseProjection.items", projectionDepthOnFields.getOrDefault("EventoPageResponseProjection.EventoResponseProjection.items", 0) + 1);
            this.items(new EventoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EventoPageResponseProjection.EventoResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public EventoPageResponseProjection items(EventoResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public EventoPageResponseProjection items(String alias, EventoResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public EventoPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public EventoPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public EventoPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public EventoPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public EventoPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public EventoPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public EventoPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public EventoPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public EventoPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public EventoPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public EventoPageResponseProjection typename() {
        return typename(null);
    }

    public EventoPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public EventoPageResponseProjection deepCopy$() {
        return new EventoPageResponseProjection(this);
    }


}
