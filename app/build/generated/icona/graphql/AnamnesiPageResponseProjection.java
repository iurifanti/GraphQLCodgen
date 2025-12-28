package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for AnamnesiPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class AnamnesiPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AnamnesiPageResponseProjection() {
    }

    public AnamnesiPageResponseProjection(AnamnesiPageResponseProjection projection) {
        super(projection);
    }

    public AnamnesiPageResponseProjection(List<AnamnesiPageResponseProjection> projections) {
        super(projections);
    }

    public AnamnesiPageResponseProjection all$() {
        return all$(3);
    }

    public AnamnesiPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AnamnesiPageResponseProjection.AnamnesiResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("AnamnesiPageResponseProjection.AnamnesiResponseProjection.items", projectionDepthOnFields.getOrDefault("AnamnesiPageResponseProjection.AnamnesiResponseProjection.items", 0) + 1);
            this.items(new AnamnesiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AnamnesiPageResponseProjection.AnamnesiResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public AnamnesiPageResponseProjection items(AnamnesiResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public AnamnesiPageResponseProjection items(String alias, AnamnesiResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public AnamnesiPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public AnamnesiPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public AnamnesiPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public AnamnesiPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public AnamnesiPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public AnamnesiPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public AnamnesiPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public AnamnesiPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public AnamnesiPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public AnamnesiPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public AnamnesiPageResponseProjection typename() {
        return typename(null);
    }

    public AnamnesiPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public AnamnesiPageResponseProjection deepCopy$() {
        return new AnamnesiPageResponseProjection(this);
    }


}
