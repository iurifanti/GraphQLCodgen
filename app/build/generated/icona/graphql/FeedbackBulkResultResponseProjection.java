package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for FeedbackBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class FeedbackBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FeedbackBulkResultResponseProjection() {
    }

    public FeedbackBulkResultResponseProjection(FeedbackBulkResultResponseProjection projection) {
        super(projection);
    }

    public FeedbackBulkResultResponseProjection(List<FeedbackBulkResultResponseProjection> projections) {
        super(projections);
    }

    public FeedbackBulkResultResponseProjection all$() {
        return all$(3);
    }

    public FeedbackBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("FeedbackBulkResultResponseProjection.FeedbackResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("FeedbackBulkResultResponseProjection.FeedbackResponseProjection.items", projectionDepthOnFields.getOrDefault("FeedbackBulkResultResponseProjection.FeedbackResponseProjection.items", 0) + 1);
            this.items(new FeedbackResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FeedbackBulkResultResponseProjection.FeedbackResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public FeedbackBulkResultResponseProjection items(FeedbackResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public FeedbackBulkResultResponseProjection items(String alias, FeedbackResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public FeedbackBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public FeedbackBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public FeedbackBulkResultResponseProjection typename() {
        return typename(null);
    }

    public FeedbackBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public FeedbackBulkResultResponseProjection deepCopy$() {
        return new FeedbackBulkResultResponseProjection(this);
    }


}
