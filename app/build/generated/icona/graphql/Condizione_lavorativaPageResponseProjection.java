package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Condizione_lavorativaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Condizione_lavorativaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Condizione_lavorativaPageResponseProjection() {
    }

    public Condizione_lavorativaPageResponseProjection(Condizione_lavorativaPageResponseProjection projection) {
        super(projection);
    }

    public Condizione_lavorativaPageResponseProjection(List<Condizione_lavorativaPageResponseProjection> projections) {
        super(projections);
    }

    public Condizione_lavorativaPageResponseProjection all$() {
        return all$(3);
    }

    public Condizione_lavorativaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Condizione_lavorativaPageResponseProjection.Condizione_lavorativaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Condizione_lavorativaPageResponseProjection.Condizione_lavorativaResponseProjection.items", projectionDepthOnFields.getOrDefault("Condizione_lavorativaPageResponseProjection.Condizione_lavorativaResponseProjection.items", 0) + 1);
            this.items(new Condizione_lavorativaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Condizione_lavorativaPageResponseProjection.Condizione_lavorativaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Condizione_lavorativaPageResponseProjection items(Condizione_lavorativaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Condizione_lavorativaPageResponseProjection items(String alias, Condizione_lavorativaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Condizione_lavorativaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Condizione_lavorativaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Condizione_lavorativaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Condizione_lavorativaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Condizione_lavorativaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Condizione_lavorativaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Condizione_lavorativaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Condizione_lavorativaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Condizione_lavorativaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Condizione_lavorativaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Condizione_lavorativaPageResponseProjection typename() {
        return typename(null);
    }

    public Condizione_lavorativaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Condizione_lavorativaPageResponseProjection deepCopy$() {
        return new Condizione_lavorativaPageResponseProjection(this);
    }


}
