package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for V_dettaglioPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class V_dettaglioPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public V_dettaglioPageResponseProjection() {
    }

    public V_dettaglioPageResponseProjection(V_dettaglioPageResponseProjection projection) {
        super(projection);
    }

    public V_dettaglioPageResponseProjection(List<V_dettaglioPageResponseProjection> projections) {
        super(projections);
    }

    public V_dettaglioPageResponseProjection all$() {
        return all$(3);
    }

    public V_dettaglioPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("V_dettaglioPageResponseProjection.V_dettaglioResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("V_dettaglioPageResponseProjection.V_dettaglioResponseProjection.items", projectionDepthOnFields.getOrDefault("V_dettaglioPageResponseProjection.V_dettaglioResponseProjection.items", 0) + 1);
            this.items(new V_dettaglioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("V_dettaglioPageResponseProjection.V_dettaglioResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public V_dettaglioPageResponseProjection items(V_dettaglioResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public V_dettaglioPageResponseProjection items(String alias, V_dettaglioResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public V_dettaglioPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public V_dettaglioPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public V_dettaglioPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public V_dettaglioPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public V_dettaglioPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public V_dettaglioPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public V_dettaglioPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public V_dettaglioPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public V_dettaglioPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public V_dettaglioPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public V_dettaglioPageResponseProjection typename() {
        return typename(null);
    }

    public V_dettaglioPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public V_dettaglioPageResponseProjection deepCopy$() {
        return new V_dettaglioPageResponseProjection(this);
    }


}
