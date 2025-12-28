package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ValidationResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ValidationResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ValidationResultResponseProjection() {
    }

    public ValidationResultResponseProjection(ValidationResultResponseProjection projection) {
        super(projection);
    }

    public ValidationResultResponseProjection(List<ValidationResultResponseProjection> projections) {
        super(projections);
    }

    public ValidationResultResponseProjection all$() {
        return all$(3);
    }

    public ValidationResultResponseProjection all$(int maxDepth) {
        this.isValid();
        if (projectionDepthOnFields.getOrDefault("ValidationResultResponseProjection.IssueResponseProjection.issues", 0) <= maxDepth) {
            projectionDepthOnFields.put("ValidationResultResponseProjection.IssueResponseProjection.issues", projectionDepthOnFields.getOrDefault("ValidationResultResponseProjection.IssueResponseProjection.issues", 0) + 1);
            this.issues(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ValidationResultResponseProjection.IssueResponseProjection.issues", 0)));
        }
        this.typename();
        return this;
    }

    public ValidationResultResponseProjection isValid() {
        return isValid(null);
    }

    public ValidationResultResponseProjection isValid(String alias) {
        add$(new GraphQLResponseField("isValid").alias(alias));
        return this;
    }

    public ValidationResultResponseProjection issues(IssueResponseProjection subProjection) {
        return issues(null, subProjection);
    }

    public ValidationResultResponseProjection issues(String alias, IssueResponseProjection subProjection) {
        add$(new GraphQLResponseField("issues").alias(alias).projection(subProjection));
        return this;
    }

    public ValidationResultResponseProjection typename() {
        return typename(null);
    }

    public ValidationResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ValidationResultResponseProjection deepCopy$() {
        return new ValidationResultResponseProjection(this);
    }


}
