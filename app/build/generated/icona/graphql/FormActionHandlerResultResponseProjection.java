package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for FormActionHandlerResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class FormActionHandlerResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FormActionHandlerResultResponseProjection() {
    }

    public FormActionHandlerResultResponseProjection(FormActionHandlerResultResponseProjection projection) {
        super(projection);
    }

    public FormActionHandlerResultResponseProjection(List<FormActionHandlerResultResponseProjection> projections) {
        super(projections);
    }

    public FormActionHandlerResultResponseProjection all$() {
        return all$(3);
    }

    public FormActionHandlerResultResponseProjection all$(int maxDepth) {
        this.type();
        if (projectionDepthOnFields.getOrDefault("FormActionHandlerResultResponseProjection.FormActionHandlerMessageResultResponseProjection.message", 0) <= maxDepth) {
            projectionDepthOnFields.put("FormActionHandlerResultResponseProjection.FormActionHandlerMessageResultResponseProjection.message", projectionDepthOnFields.getOrDefault("FormActionHandlerResultResponseProjection.FormActionHandlerMessageResultResponseProjection.message", 0) + 1);
            this.message(new FormActionHandlerMessageResultResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FormActionHandlerResultResponseProjection.FormActionHandlerMessageResultResponseProjection.message", 0)));
        }
        this.typename();
        return this;
    }

    public FormActionHandlerResultResponseProjection type() {
        return type(null);
    }

    public FormActionHandlerResultResponseProjection type(String alias) {
        add$(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public FormActionHandlerResultResponseProjection message(FormActionHandlerMessageResultResponseProjection subProjection) {
        return message(null, subProjection);
    }

    public FormActionHandlerResultResponseProjection message(String alias, FormActionHandlerMessageResultResponseProjection subProjection) {
        add$(new GraphQLResponseField("message").alias(alias).projection(subProjection));
        return this;
    }

    public FormActionHandlerResultResponseProjection typename() {
        return typename(null);
    }

    public FormActionHandlerResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public FormActionHandlerResultResponseProjection deepCopy$() {
        return new FormActionHandlerResultResponseProjection(this);
    }


}
