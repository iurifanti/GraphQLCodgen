package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Sequenza_genomicaBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sequenza_genomicaBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Sequenza_genomicaBulkResultResponseProjection() {
    }

    public Sequenza_genomicaBulkResultResponseProjection(Sequenza_genomicaBulkResultResponseProjection projection) {
        super(projection);
    }

    public Sequenza_genomicaBulkResultResponseProjection(List<Sequenza_genomicaBulkResultResponseProjection> projections) {
        super(projections);
    }

    public Sequenza_genomicaBulkResultResponseProjection all$() {
        return all$(3);
    }

    public Sequenza_genomicaBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Sequenza_genomicaBulkResultResponseProjection.Sequenza_genomicaResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Sequenza_genomicaBulkResultResponseProjection.Sequenza_genomicaResponseProjection.items", projectionDepthOnFields.getOrDefault("Sequenza_genomicaBulkResultResponseProjection.Sequenza_genomicaResponseProjection.items", 0) + 1);
            this.items(new Sequenza_genomicaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Sequenza_genomicaBulkResultResponseProjection.Sequenza_genomicaResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public Sequenza_genomicaBulkResultResponseProjection items(Sequenza_genomicaResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Sequenza_genomicaBulkResultResponseProjection items(String alias, Sequenza_genomicaResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Sequenza_genomicaBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public Sequenza_genomicaBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Sequenza_genomicaBulkResultResponseProjection typename() {
        return typename(null);
    }

    public Sequenza_genomicaBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Sequenza_genomicaBulkResultResponseProjection deepCopy$() {
        return new Sequenza_genomicaBulkResultResponseProjection(this);
    }


}
