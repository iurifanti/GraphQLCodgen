package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for FormActionHandlerMessageResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class FormActionHandlerMessageResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FormActionHandlerMessageResultResponseProjection() {
    }

    public FormActionHandlerMessageResultResponseProjection(FormActionHandlerMessageResultResponseProjection projection) {
        super(projection);
    }

    public FormActionHandlerMessageResultResponseProjection(List<FormActionHandlerMessageResultResponseProjection> projections) {
        super(projections);
    }

    public FormActionHandlerMessageResultResponseProjection all$() {
        return all$(3);
    }

    public FormActionHandlerMessageResultResponseProjection all$(int maxDepth) {
        this.type();
        this.title();
        this.message();
        this.typename();
        return this;
    }

    public FormActionHandlerMessageResultResponseProjection type() {
        return type(null);
    }

    public FormActionHandlerMessageResultResponseProjection type(String alias) {
        add$(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public FormActionHandlerMessageResultResponseProjection title() {
        return title(null);
    }

    public FormActionHandlerMessageResultResponseProjection title(String alias) {
        add$(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public FormActionHandlerMessageResultResponseProjection message() {
        return message(null);
    }

    public FormActionHandlerMessageResultResponseProjection message(String alias) {
        add$(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public FormActionHandlerMessageResultResponseProjection typename() {
        return typename(null);
    }

    public FormActionHandlerMessageResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public FormActionHandlerMessageResultResponseProjection deepCopy$() {
        return new FormActionHandlerMessageResultResponseProjection(this);
    }


}
