package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for PatologiaPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PatologiaPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PatologiaPageResponseProjection() {
    }

    public PatologiaPageResponseProjection(PatologiaPageResponseProjection projection) {
        super(projection);
    }

    public PatologiaPageResponseProjection(List<PatologiaPageResponseProjection> projections) {
        super(projections);
    }

    public PatologiaPageResponseProjection all$() {
        return all$(3);
    }

    public PatologiaPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PatologiaPageResponseProjection.PatologiaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("PatologiaPageResponseProjection.PatologiaResponseProjection.items", projectionDepthOnFields.getOrDefault("PatologiaPageResponseProjection.PatologiaResponseProjection.items", 0) + 1);
            this.items(new PatologiaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PatologiaPageResponseProjection.PatologiaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public PatologiaPageResponseProjection items(PatologiaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public PatologiaPageResponseProjection items(String alias, PatologiaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public PatologiaPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public PatologiaPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public PatologiaPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public PatologiaPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public PatologiaPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public PatologiaPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public PatologiaPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public PatologiaPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public PatologiaPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public PatologiaPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public PatologiaPageResponseProjection typename() {
        return typename(null);
    }

    public PatologiaPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PatologiaPageResponseProjection deepCopy$() {
        return new PatologiaPageResponseProjection(this);
    }


}
