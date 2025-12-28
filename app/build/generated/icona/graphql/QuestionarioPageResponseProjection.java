package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for QuestionarioPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class QuestionarioPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public QuestionarioPageResponseProjection() {
    }

    public QuestionarioPageResponseProjection(QuestionarioPageResponseProjection projection) {
        super(projection);
    }

    public QuestionarioPageResponseProjection(List<QuestionarioPageResponseProjection> projections) {
        super(projections);
    }

    public QuestionarioPageResponseProjection all$() {
        return all$(3);
    }

    public QuestionarioPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("QuestionarioPageResponseProjection.QuestionarioResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("QuestionarioPageResponseProjection.QuestionarioResponseProjection.items", projectionDepthOnFields.getOrDefault("QuestionarioPageResponseProjection.QuestionarioResponseProjection.items", 0) + 1);
            this.items(new QuestionarioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QuestionarioPageResponseProjection.QuestionarioResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public QuestionarioPageResponseProjection items(QuestionarioResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public QuestionarioPageResponseProjection items(String alias, QuestionarioResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public QuestionarioPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public QuestionarioPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public QuestionarioPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public QuestionarioPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public QuestionarioPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public QuestionarioPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public QuestionarioPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public QuestionarioPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public QuestionarioPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public QuestionarioPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public QuestionarioPageResponseProjection typename() {
        return typename(null);
    }

    public QuestionarioPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public QuestionarioPageResponseProjection deepCopy$() {
        return new QuestionarioPageResponseProjection(this);
    }


}
