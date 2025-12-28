package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for FeedbackPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class FeedbackPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FeedbackPageResponseProjection() {
    }

    public FeedbackPageResponseProjection(FeedbackPageResponseProjection projection) {
        super(projection);
    }

    public FeedbackPageResponseProjection(List<FeedbackPageResponseProjection> projections) {
        super(projections);
    }

    public FeedbackPageResponseProjection all$() {
        return all$(3);
    }

    public FeedbackPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("FeedbackPageResponseProjection.FeedbackResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("FeedbackPageResponseProjection.FeedbackResponseProjection.items", projectionDepthOnFields.getOrDefault("FeedbackPageResponseProjection.FeedbackResponseProjection.items", 0) + 1);
            this.items(new FeedbackResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FeedbackPageResponseProjection.FeedbackResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public FeedbackPageResponseProjection items(FeedbackResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public FeedbackPageResponseProjection items(String alias, FeedbackResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public FeedbackPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public FeedbackPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public FeedbackPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public FeedbackPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public FeedbackPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public FeedbackPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public FeedbackPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public FeedbackPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public FeedbackPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public FeedbackPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public FeedbackPageResponseProjection typename() {
        return typename(null);
    }

    public FeedbackPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public FeedbackPageResponseProjection deepCopy$() {
        return new FeedbackPageResponseProjection(this);
    }


}
