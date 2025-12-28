package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for DeleteBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DeleteBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DeleteBulkResultResponseProjection() {
    }

    public DeleteBulkResultResponseProjection(DeleteBulkResultResponseProjection projection) {
        super(projection);
    }

    public DeleteBulkResultResponseProjection(List<DeleteBulkResultResponseProjection> projections) {
        super(projections);
    }

    public DeleteBulkResultResponseProjection all$() {
        return all$(3);
    }

    public DeleteBulkResultResponseProjection all$(int maxDepth) {
        this.deleted();
        this.typename();
        return this;
    }

    public DeleteBulkResultResponseProjection deleted() {
        return deleted(null);
    }

    public DeleteBulkResultResponseProjection deleted(String alias) {
        add$(new GraphQLResponseField("deleted").alias(alias));
        return this;
    }

    public DeleteBulkResultResponseProjection typename() {
        return typename(null);
    }

    public DeleteBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public DeleteBulkResultResponseProjection deepCopy$() {
        return new DeleteBulkResultResponseProjection(this);
    }


}
