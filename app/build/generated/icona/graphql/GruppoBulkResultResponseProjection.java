package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for GruppoBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class GruppoBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public GruppoBulkResultResponseProjection() {
    }

    public GruppoBulkResultResponseProjection(GruppoBulkResultResponseProjection projection) {
        super(projection);
    }

    public GruppoBulkResultResponseProjection(List<GruppoBulkResultResponseProjection> projections) {
        super(projections);
    }

    public GruppoBulkResultResponseProjection all$() {
        return all$(3);
    }

    public GruppoBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("GruppoBulkResultResponseProjection.GruppoResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("GruppoBulkResultResponseProjection.GruppoResponseProjection.items", projectionDepthOnFields.getOrDefault("GruppoBulkResultResponseProjection.GruppoResponseProjection.items", 0) + 1);
            this.items(new GruppoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GruppoBulkResultResponseProjection.GruppoResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public GruppoBulkResultResponseProjection items(GruppoResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public GruppoBulkResultResponseProjection items(String alias, GruppoResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public GruppoBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public GruppoBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public GruppoBulkResultResponseProjection typename() {
        return typename(null);
    }

    public GruppoBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public GruppoBulkResultResponseProjection deepCopy$() {
        return new GruppoBulkResultResponseProjection(this);
    }


}
