package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Comorbidita_mpvBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Comorbidita_mpvBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Comorbidita_mpvBulkResultResponseProjection() {
    }

    public Comorbidita_mpvBulkResultResponseProjection(Comorbidita_mpvBulkResultResponseProjection projection) {
        super(projection);
    }

    public Comorbidita_mpvBulkResultResponseProjection(List<Comorbidita_mpvBulkResultResponseProjection> projections) {
        super(projections);
    }

    public Comorbidita_mpvBulkResultResponseProjection all$() {
        return all$(3);
    }

    public Comorbidita_mpvBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Comorbidita_mpvBulkResultResponseProjection.Comorbidita_mpvResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Comorbidita_mpvBulkResultResponseProjection.Comorbidita_mpvResponseProjection.items", projectionDepthOnFields.getOrDefault("Comorbidita_mpvBulkResultResponseProjection.Comorbidita_mpvResponseProjection.items", 0) + 1);
            this.items(new Comorbidita_mpvResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Comorbidita_mpvBulkResultResponseProjection.Comorbidita_mpvResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public Comorbidita_mpvBulkResultResponseProjection items(Comorbidita_mpvResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Comorbidita_mpvBulkResultResponseProjection items(String alias, Comorbidita_mpvResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Comorbidita_mpvBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public Comorbidita_mpvBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Comorbidita_mpvBulkResultResponseProjection typename() {
        return typename(null);
    }

    public Comorbidita_mpvBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Comorbidita_mpvBulkResultResponseProjection deepCopy$() {
        return new Comorbidita_mpvBulkResultResponseProjection(this);
    }


}
