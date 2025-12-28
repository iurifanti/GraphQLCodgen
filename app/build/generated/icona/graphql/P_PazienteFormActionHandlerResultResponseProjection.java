package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for P_PazienteFormActionHandlerResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class P_PazienteFormActionHandlerResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public P_PazienteFormActionHandlerResultResponseProjection() {
    }

    public P_PazienteFormActionHandlerResultResponseProjection(P_PazienteFormActionHandlerResultResponseProjection projection) {
        super(projection);
    }

    public P_PazienteFormActionHandlerResultResponseProjection(List<P_PazienteFormActionHandlerResultResponseProjection> projections) {
        super(projections);
    }

    public P_PazienteFormActionHandlerResultResponseProjection all$() {
        return all$(3);
    }

    public P_PazienteFormActionHandlerResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("P_PazienteFormActionHandlerResultResponseProjection.P_PazienteResponseProjection.data", 0) <= maxDepth) {
            projectionDepthOnFields.put("P_PazienteFormActionHandlerResultResponseProjection.P_PazienteResponseProjection.data", projectionDepthOnFields.getOrDefault("P_PazienteFormActionHandlerResultResponseProjection.P_PazienteResponseProjection.data", 0) + 1);
            this.data(new P_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("P_PazienteFormActionHandlerResultResponseProjection.P_PazienteResponseProjection.data", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("P_PazienteFormActionHandlerResultResponseProjection.FormActionHandlerResultResponseProjection.result", 0) <= maxDepth) {
            projectionDepthOnFields.put("P_PazienteFormActionHandlerResultResponseProjection.FormActionHandlerResultResponseProjection.result", projectionDepthOnFields.getOrDefault("P_PazienteFormActionHandlerResultResponseProjection.FormActionHandlerResultResponseProjection.result", 0) + 1);
            this.result(new FormActionHandlerResultResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("P_PazienteFormActionHandlerResultResponseProjection.FormActionHandlerResultResponseProjection.result", 0)));
        }
        this.typename();
        return this;
    }

    public P_PazienteFormActionHandlerResultResponseProjection data(P_PazienteResponseProjection subProjection) {
        return data(null, subProjection);
    }

    public P_PazienteFormActionHandlerResultResponseProjection data(String alias, P_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("data").alias(alias).projection(subProjection));
        return this;
    }

    public P_PazienteFormActionHandlerResultResponseProjection result(FormActionHandlerResultResponseProjection subProjection) {
        return result(null, subProjection);
    }

    public P_PazienteFormActionHandlerResultResponseProjection result(String alias, FormActionHandlerResultResponseProjection subProjection) {
        add$(new GraphQLResponseField("result").alias(alias).projection(subProjection));
        return this;
    }

    public P_PazienteFormActionHandlerResultResponseProjection typename() {
        return typename(null);
    }

    public P_PazienteFormActionHandlerResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public P_PazienteFormActionHandlerResultResponseProjection deepCopy$() {
        return new P_PazienteFormActionHandlerResultResponseProjection(this);
    }


}
