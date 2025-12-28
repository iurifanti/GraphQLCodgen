package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for EtniaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class EtniaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EtniaPageResponseProjection() {
    }

    public EtniaPageResponseProjection(EtniaPageResponseProjection projection) {
        super(projection);
    }

    public EtniaPageResponseProjection(List<EtniaPageResponseProjection> projections) {
        super(projections);
    }

    public EtniaPageResponseProjection all$() {
        return all$(3);
    }

    public EtniaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EtniaPageResponseProjection.EtniaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("EtniaPageResponseProjection.EtniaResponseProjection.items", projectionDepthOnFields.getOrDefault("EtniaPageResponseProjection.EtniaResponseProjection.items", 0) + 1);
            this.items(new EtniaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EtniaPageResponseProjection.EtniaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public EtniaPageResponseProjection items(EtniaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public EtniaPageResponseProjection items(String alias, EtniaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public EtniaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public EtniaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public EtniaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public EtniaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public EtniaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public EtniaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public EtniaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public EtniaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public EtniaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public EtniaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public EtniaPageResponseProjection typename() {
        return typename(null);
    }

    public EtniaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public EtniaPageResponseProjection deepCopy$() {
        return new EtniaPageResponseProjection(this);
    }


}
