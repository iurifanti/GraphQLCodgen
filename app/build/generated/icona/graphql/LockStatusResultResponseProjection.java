package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for LockStatusResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class LockStatusResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LockStatusResultResponseProjection() {
    }

    public LockStatusResultResponseProjection(LockStatusResultResponseProjection projection) {
        super(projection);
    }

    public LockStatusResultResponseProjection(List<LockStatusResultResponseProjection> projections) {
        super(projections);
    }

    public LockStatusResultResponseProjection all$() {
        return all$(3);
    }

    public LockStatusResultResponseProjection all$(int maxDepth) {
        this.locked();
        this.minutes();
        this.typename();
        return this;
    }

    public LockStatusResultResponseProjection locked() {
        return locked(null);
    }

    public LockStatusResultResponseProjection locked(String alias) {
        add$(new GraphQLResponseField("locked").alias(alias));
        return this;
    }

    public LockStatusResultResponseProjection minutes() {
        return minutes(null);
    }

    public LockStatusResultResponseProjection minutes(String alias) {
        add$(new GraphQLResponseField("minutes").alias(alias));
        return this;
    }

    public LockStatusResultResponseProjection typename() {
        return typename(null);
    }

    public LockStatusResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public LockStatusResultResponseProjection deepCopy$() {
        return new LockStatusResultResponseProjection(this);
    }


}
