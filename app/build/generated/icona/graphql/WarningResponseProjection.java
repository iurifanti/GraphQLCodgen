package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Warning
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class WarningResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WarningResponseProjection() {
    }

    public WarningResponseProjection(WarningResponseProjection projection) {
        super(projection);
    }

    public WarningResponseProjection(List<WarningResponseProjection> projections) {
        super(projections);
    }

    public WarningResponseProjection all$() {
        return all$(3);
    }

    public WarningResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.typename();
        return this;
    }

    public WarningResponseProjection _clientId() {
        return _clientId(null);
    }

    public WarningResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public WarningResponseProjection _id() {
        return _id(null);
    }

    public WarningResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public WarningResponseProjection nome() {
        return nome(null);
    }

    public WarningResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public WarningResponseProjection typename() {
        return typename(null);
    }

    public WarningResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public WarningResponseProjection deepCopy$() {
        return new WarningResponseProjection(this);
    }


}
