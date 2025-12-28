package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for C_dettaglioPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class C_dettaglioPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public C_dettaglioPageResponseProjection() {
    }

    public C_dettaglioPageResponseProjection(C_dettaglioPageResponseProjection projection) {
        super(projection);
    }

    public C_dettaglioPageResponseProjection(List<C_dettaglioPageResponseProjection> projections) {
        super(projections);
    }

    public C_dettaglioPageResponseProjection all$() {
        return all$(3);
    }

    public C_dettaglioPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("C_dettaglioPageResponseProjection.C_dettaglioResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("C_dettaglioPageResponseProjection.C_dettaglioResponseProjection.items", projectionDepthOnFields.getOrDefault("C_dettaglioPageResponseProjection.C_dettaglioResponseProjection.items", 0) + 1);
            this.items(new C_dettaglioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("C_dettaglioPageResponseProjection.C_dettaglioResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public C_dettaglioPageResponseProjection items(C_dettaglioResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public C_dettaglioPageResponseProjection items(String alias, C_dettaglioResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public C_dettaglioPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public C_dettaglioPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public C_dettaglioPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public C_dettaglioPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public C_dettaglioPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public C_dettaglioPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public C_dettaglioPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public C_dettaglioPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public C_dettaglioPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public C_dettaglioPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public C_dettaglioPageResponseProjection typename() {
        return typename(null);
    }

    public C_dettaglioPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public C_dettaglioPageResponseProjection deepCopy$() {
        return new C_dettaglioPageResponseProjection(this);
    }


}
