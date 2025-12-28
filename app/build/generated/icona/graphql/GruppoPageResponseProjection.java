package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for GruppoPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class GruppoPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public GruppoPageResponseProjection() {
    }

    public GruppoPageResponseProjection(GruppoPageResponseProjection projection) {
        super(projection);
    }

    public GruppoPageResponseProjection(List<GruppoPageResponseProjection> projections) {
        super(projections);
    }

    public GruppoPageResponseProjection all$() {
        return all$(3);
    }

    public GruppoPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("GruppoPageResponseProjection.GruppoResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("GruppoPageResponseProjection.GruppoResponseProjection.items", projectionDepthOnFields.getOrDefault("GruppoPageResponseProjection.GruppoResponseProjection.items", 0) + 1);
            this.items(new GruppoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GruppoPageResponseProjection.GruppoResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public GruppoPageResponseProjection items(GruppoResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public GruppoPageResponseProjection items(String alias, GruppoResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public GruppoPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public GruppoPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public GruppoPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public GruppoPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public GruppoPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public GruppoPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public GruppoPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public GruppoPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public GruppoPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public GruppoPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public GruppoPageResponseProjection typename() {
        return typename(null);
    }

    public GruppoPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public GruppoPageResponseProjection deepCopy$() {
        return new GruppoPageResponseProjection(this);
    }


}
