package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for GravidanzaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class GravidanzaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public GravidanzaPageResponseProjection() {
    }

    public GravidanzaPageResponseProjection(GravidanzaPageResponseProjection projection) {
        super(projection);
    }

    public GravidanzaPageResponseProjection(List<GravidanzaPageResponseProjection> projections) {
        super(projections);
    }

    public GravidanzaPageResponseProjection all$() {
        return all$(3);
    }

    public GravidanzaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("GravidanzaPageResponseProjection.GravidanzaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaPageResponseProjection.GravidanzaResponseProjection.items", projectionDepthOnFields.getOrDefault("GravidanzaPageResponseProjection.GravidanzaResponseProjection.items", 0) + 1);
            this.items(new GravidanzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaPageResponseProjection.GravidanzaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public GravidanzaPageResponseProjection items(GravidanzaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public GravidanzaPageResponseProjection items(String alias, GravidanzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public GravidanzaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public GravidanzaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public GravidanzaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public GravidanzaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public GravidanzaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public GravidanzaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public GravidanzaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public GravidanzaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public GravidanzaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public GravidanzaPageResponseProjection typename() {
        return typename(null);
    }

    public GravidanzaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public GravidanzaPageResponseProjection deepCopy$() {
        return new GravidanzaPageResponseProjection(this);
    }


}
