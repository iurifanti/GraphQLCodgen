package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for campione_oldPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Campione_oldPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Campione_oldPageResponseProjection() {
    }

    public Campione_oldPageResponseProjection(Campione_oldPageResponseProjection projection) {
        super(projection);
    }

    public Campione_oldPageResponseProjection(List<Campione_oldPageResponseProjection> projections) {
        super(projections);
    }

    public Campione_oldPageResponseProjection all$() {
        return all$(3);
    }

    public Campione_oldPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Campione_oldPageResponseProjection.Campione_oldResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Campione_oldPageResponseProjection.Campione_oldResponseProjection.items", projectionDepthOnFields.getOrDefault("Campione_oldPageResponseProjection.Campione_oldResponseProjection.items", 0) + 1);
            this.items(new Campione_oldResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Campione_oldPageResponseProjection.Campione_oldResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Campione_oldPageResponseProjection items(Campione_oldResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Campione_oldPageResponseProjection items(String alias, Campione_oldResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Campione_oldPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Campione_oldPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Campione_oldPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Campione_oldPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Campione_oldPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Campione_oldPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Campione_oldPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Campione_oldPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Campione_oldPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Campione_oldPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Campione_oldPageResponseProjection typename() {
        return typename(null);
    }

    public Campione_oldPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Campione_oldPageResponseProjection deepCopy$() {
        return new Campione_oldPageResponseProjection(this);
    }


}
