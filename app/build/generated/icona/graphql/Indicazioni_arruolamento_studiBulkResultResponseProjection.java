package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Indicazioni_arruolamento_studiBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Indicazioni_arruolamento_studiBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Indicazioni_arruolamento_studiBulkResultResponseProjection() {
    }

    public Indicazioni_arruolamento_studiBulkResultResponseProjection(Indicazioni_arruolamento_studiBulkResultResponseProjection projection) {
        super(projection);
    }

    public Indicazioni_arruolamento_studiBulkResultResponseProjection(List<Indicazioni_arruolamento_studiBulkResultResponseProjection> projections) {
        super(projections);
    }

    public Indicazioni_arruolamento_studiBulkResultResponseProjection all$() {
        return all$(3);
    }

    public Indicazioni_arruolamento_studiBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Indicazioni_arruolamento_studiBulkResultResponseProjection.Indicazioni_arruolamento_studiResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Indicazioni_arruolamento_studiBulkResultResponseProjection.Indicazioni_arruolamento_studiResponseProjection.items", projectionDepthOnFields.getOrDefault("Indicazioni_arruolamento_studiBulkResultResponseProjection.Indicazioni_arruolamento_studiResponseProjection.items", 0) + 1);
            this.items(new Indicazioni_arruolamento_studiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Indicazioni_arruolamento_studiBulkResultResponseProjection.Indicazioni_arruolamento_studiResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public Indicazioni_arruolamento_studiBulkResultResponseProjection items(Indicazioni_arruolamento_studiResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Indicazioni_arruolamento_studiBulkResultResponseProjection items(String alias, Indicazioni_arruolamento_studiResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Indicazioni_arruolamento_studiBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public Indicazioni_arruolamento_studiBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Indicazioni_arruolamento_studiBulkResultResponseProjection typename() {
        return typename(null);
    }

    public Indicazioni_arruolamento_studiBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Indicazioni_arruolamento_studiBulkResultResponseProjection deepCopy$() {
        return new Indicazioni_arruolamento_studiBulkResultResponseProjection(this);
    }


}
