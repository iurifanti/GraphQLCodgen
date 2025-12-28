package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for L_dettaglioPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class L_dettaglioPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public L_dettaglioPageResponseProjection() {
    }

    public L_dettaglioPageResponseProjection(L_dettaglioPageResponseProjection projection) {
        super(projection);
    }

    public L_dettaglioPageResponseProjection(List<L_dettaglioPageResponseProjection> projections) {
        super(projections);
    }

    public L_dettaglioPageResponseProjection all$() {
        return all$(3);
    }

    public L_dettaglioPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("L_dettaglioPageResponseProjection.L_dettaglioResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("L_dettaglioPageResponseProjection.L_dettaglioResponseProjection.items", projectionDepthOnFields.getOrDefault("L_dettaglioPageResponseProjection.L_dettaglioResponseProjection.items", 0) + 1);
            this.items(new L_dettaglioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("L_dettaglioPageResponseProjection.L_dettaglioResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public L_dettaglioPageResponseProjection items(L_dettaglioResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public L_dettaglioPageResponseProjection items(String alias, L_dettaglioResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public L_dettaglioPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public L_dettaglioPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public L_dettaglioPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public L_dettaglioPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public L_dettaglioPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public L_dettaglioPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public L_dettaglioPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public L_dettaglioPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public L_dettaglioPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public L_dettaglioPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public L_dettaglioPageResponseProjection typename() {
        return typename(null);
    }

    public L_dettaglioPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public L_dettaglioPageResponseProjection deepCopy$() {
        return new L_dettaglioPageResponseProjection(this);
    }


}
