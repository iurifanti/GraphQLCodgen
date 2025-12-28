package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Risposta_possibilePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Risposta_possibilePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Risposta_possibilePageResponseProjection() {
    }

    public Risposta_possibilePageResponseProjection(Risposta_possibilePageResponseProjection projection) {
        super(projection);
    }

    public Risposta_possibilePageResponseProjection(List<Risposta_possibilePageResponseProjection> projections) {
        super(projections);
    }

    public Risposta_possibilePageResponseProjection all$() {
        return all$(3);
    }

    public Risposta_possibilePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Risposta_possibilePageResponseProjection.Risposta_possibileResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Risposta_possibilePageResponseProjection.Risposta_possibileResponseProjection.items", projectionDepthOnFields.getOrDefault("Risposta_possibilePageResponseProjection.Risposta_possibileResponseProjection.items", 0) + 1);
            this.items(new Risposta_possibileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Risposta_possibilePageResponseProjection.Risposta_possibileResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Risposta_possibilePageResponseProjection items(Risposta_possibileResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Risposta_possibilePageResponseProjection items(String alias, Risposta_possibileResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Risposta_possibilePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Risposta_possibilePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Risposta_possibilePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Risposta_possibilePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Risposta_possibilePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Risposta_possibilePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Risposta_possibilePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Risposta_possibilePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Risposta_possibilePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Risposta_possibilePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Risposta_possibilePageResponseProjection typename() {
        return typename(null);
    }

    public Risposta_possibilePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Risposta_possibilePageResponseProjection deepCopy$() {
        return new Risposta_possibilePageResponseProjection(this);
    }


}
