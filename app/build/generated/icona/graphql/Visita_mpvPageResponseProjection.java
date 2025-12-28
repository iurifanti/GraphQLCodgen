package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Visita_mpvPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Visita_mpvPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Visita_mpvPageResponseProjection() {
    }

    public Visita_mpvPageResponseProjection(Visita_mpvPageResponseProjection projection) {
        super(projection);
    }

    public Visita_mpvPageResponseProjection(List<Visita_mpvPageResponseProjection> projections) {
        super(projections);
    }

    public Visita_mpvPageResponseProjection all$() {
        return all$(3);
    }

    public Visita_mpvPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Visita_mpvPageResponseProjection.Visita_mpvResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvPageResponseProjection.Visita_mpvResponseProjection.items", projectionDepthOnFields.getOrDefault("Visita_mpvPageResponseProjection.Visita_mpvResponseProjection.items", 0) + 1);
            this.items(new Visita_mpvResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvPageResponseProjection.Visita_mpvResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Visita_mpvPageResponseProjection items(Visita_mpvResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Visita_mpvPageResponseProjection items(String alias, Visita_mpvResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Visita_mpvPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Visita_mpvPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Visita_mpvPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Visita_mpvPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Visita_mpvPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Visita_mpvPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Visita_mpvPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Visita_mpvPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Visita_mpvPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Visita_mpvPageResponseProjection typename() {
        return typename(null);
    }

    public Visita_mpvPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Visita_mpvPageResponseProjection deepCopy$() {
        return new Visita_mpvPageResponseProjection(this);
    }


}
