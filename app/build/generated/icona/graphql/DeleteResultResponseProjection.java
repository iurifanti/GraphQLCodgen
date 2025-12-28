package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for DeleteResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DeleteResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DeleteResultResponseProjection() {
    }

    public DeleteResultResponseProjection(DeleteResultResponseProjection projection) {
        super(projection);
    }

    public DeleteResultResponseProjection(List<DeleteResultResponseProjection> projections) {
        super(projections);
    }

    public DeleteResultResponseProjection all$() {
        return all$(3);
    }

    public DeleteResultResponseProjection all$(int maxDepth) {
        this.deleted();
        this.typename();
        return this;
    }

    public DeleteResultResponseProjection deleted() {
        return deleted(null);
    }

    public DeleteResultResponseProjection deleted(String alias) {
        add$(new GraphQLResponseField("deleted").alias(alias));
        return this;
    }

    public DeleteResultResponseProjection typename() {
        return typename(null);
    }

    public DeleteResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public DeleteResultResponseProjection deepCopy$() {
        return new DeleteResultResponseProjection(this);
    }


}
