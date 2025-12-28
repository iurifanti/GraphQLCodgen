package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Combinazioni_accettate_non_ARVPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Combinazioni_accettate_non_ARVPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Combinazioni_accettate_non_ARVPageResponseProjection() {
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection(Combinazioni_accettate_non_ARVPageResponseProjection projection) {
        super(projection);
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection(List<Combinazioni_accettate_non_ARVPageResponseProjection> projections) {
        super(projections);
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection all$() {
        return all$(3);
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Combinazioni_accettate_non_ARVPageResponseProjection.Combinazioni_accettate_non_ARVResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Combinazioni_accettate_non_ARVPageResponseProjection.Combinazioni_accettate_non_ARVResponseProjection.items", projectionDepthOnFields.getOrDefault("Combinazioni_accettate_non_ARVPageResponseProjection.Combinazioni_accettate_non_ARVResponseProjection.items", 0) + 1);
            this.items(new Combinazioni_accettate_non_ARVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Combinazioni_accettate_non_ARVPageResponseProjection.Combinazioni_accettate_non_ARVResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection items(Combinazioni_accettate_non_ARVResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection items(String alias, Combinazioni_accettate_non_ARVResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection typename() {
        return typename(null);
    }

    public Combinazioni_accettate_non_ARVPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Combinazioni_accettate_non_ARVPageResponseProjection deepCopy$() {
        return new Combinazioni_accettate_non_ARVPageResponseProjection(this);
    }


}
