package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tipo_esameBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tipo_esameBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tipo_esameBulkResultResponseProjection() {
    }

    public Tipo_esameBulkResultResponseProjection(Tipo_esameBulkResultResponseProjection projection) {
        super(projection);
    }

    public Tipo_esameBulkResultResponseProjection(List<Tipo_esameBulkResultResponseProjection> projections) {
        super(projections);
    }

    public Tipo_esameBulkResultResponseProjection all$() {
        return all$(3);
    }

    public Tipo_esameBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Tipo_esameBulkResultResponseProjection.Tipo_esameResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Tipo_esameBulkResultResponseProjection.Tipo_esameResponseProjection.items", projectionDepthOnFields.getOrDefault("Tipo_esameBulkResultResponseProjection.Tipo_esameResponseProjection.items", 0) + 1);
            this.items(new Tipo_esameResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Tipo_esameBulkResultResponseProjection.Tipo_esameResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public Tipo_esameBulkResultResponseProjection items(Tipo_esameResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Tipo_esameBulkResultResponseProjection items(String alias, Tipo_esameResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Tipo_esameBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public Tipo_esameBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Tipo_esameBulkResultResponseProjection typename() {
        return typename(null);
    }

    public Tipo_esameBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tipo_esameBulkResultResponseProjection deepCopy$() {
        return new Tipo_esameBulkResultResponseProjection(this);
    }


}
