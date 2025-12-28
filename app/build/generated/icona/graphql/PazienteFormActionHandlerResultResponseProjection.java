package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for PazienteFormActionHandlerResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteFormActionHandlerResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PazienteFormActionHandlerResultResponseProjection() {
    }

    public PazienteFormActionHandlerResultResponseProjection(PazienteFormActionHandlerResultResponseProjection projection) {
        super(projection);
    }

    public PazienteFormActionHandlerResultResponseProjection(List<PazienteFormActionHandlerResultResponseProjection> projections) {
        super(projections);
    }

    public PazienteFormActionHandlerResultResponseProjection all$() {
        return all$(3);
    }

    public PazienteFormActionHandlerResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PazienteFormActionHandlerResultResponseProjection.PazienteResponseProjection.data", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteFormActionHandlerResultResponseProjection.PazienteResponseProjection.data", projectionDepthOnFields.getOrDefault("PazienteFormActionHandlerResultResponseProjection.PazienteResponseProjection.data", 0) + 1);
            this.data(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteFormActionHandlerResultResponseProjection.PazienteResponseProjection.data", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteFormActionHandlerResultResponseProjection.FormActionHandlerResultResponseProjection.result", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteFormActionHandlerResultResponseProjection.FormActionHandlerResultResponseProjection.result", projectionDepthOnFields.getOrDefault("PazienteFormActionHandlerResultResponseProjection.FormActionHandlerResultResponseProjection.result", 0) + 1);
            this.result(new FormActionHandlerResultResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteFormActionHandlerResultResponseProjection.FormActionHandlerResultResponseProjection.result", 0)));
        }
        this.typename();
        return this;
    }

    public PazienteFormActionHandlerResultResponseProjection data(PazienteResponseProjection subProjection) {
        return data(null, subProjection);
    }

    public PazienteFormActionHandlerResultResponseProjection data(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("data").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteFormActionHandlerResultResponseProjection result(FormActionHandlerResultResponseProjection subProjection) {
        return result(null, subProjection);
    }

    public PazienteFormActionHandlerResultResponseProjection result(String alias, FormActionHandlerResultResponseProjection subProjection) {
        add$(new GraphQLResponseField("result").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteFormActionHandlerResultResponseProjection typename() {
        return typename(null);
    }

    public PazienteFormActionHandlerResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PazienteFormActionHandlerResultResponseProjection deepCopy$() {
        return new PazienteFormActionHandlerResultResponseProjection(this);
    }


}
