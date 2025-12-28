package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tipo_visita_mpvBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tipo_visita_mpvBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tipo_visita_mpvBulkResultResponseProjection() {
    }

    public Tipo_visita_mpvBulkResultResponseProjection(Tipo_visita_mpvBulkResultResponseProjection projection) {
        super(projection);
    }

    public Tipo_visita_mpvBulkResultResponseProjection(List<Tipo_visita_mpvBulkResultResponseProjection> projections) {
        super(projections);
    }

    public Tipo_visita_mpvBulkResultResponseProjection all$() {
        return all$(3);
    }

    public Tipo_visita_mpvBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Tipo_visita_mpvBulkResultResponseProjection.Tipo_visita_mpvResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Tipo_visita_mpvBulkResultResponseProjection.Tipo_visita_mpvResponseProjection.items", projectionDepthOnFields.getOrDefault("Tipo_visita_mpvBulkResultResponseProjection.Tipo_visita_mpvResponseProjection.items", 0) + 1);
            this.items(new Tipo_visita_mpvResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Tipo_visita_mpvBulkResultResponseProjection.Tipo_visita_mpvResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public Tipo_visita_mpvBulkResultResponseProjection items(Tipo_visita_mpvResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Tipo_visita_mpvBulkResultResponseProjection items(String alias, Tipo_visita_mpvResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Tipo_visita_mpvBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public Tipo_visita_mpvBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Tipo_visita_mpvBulkResultResponseProjection typename() {
        return typename(null);
    }

    public Tipo_visita_mpvBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tipo_visita_mpvBulkResultResponseProjection deepCopy$() {
        return new Tipo_visita_mpvBulkResultResponseProjection(this);
    }


}
