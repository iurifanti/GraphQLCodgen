package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ExcelImporterBulkResult
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ExcelImporterBulkResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ExcelImporterBulkResultResponseProjection() {
    }

    public ExcelImporterBulkResultResponseProjection(ExcelImporterBulkResultResponseProjection projection) {
        super(projection);
    }

    public ExcelImporterBulkResultResponseProjection(List<ExcelImporterBulkResultResponseProjection> projections) {
        super(projections);
    }

    public ExcelImporterBulkResultResponseProjection all$() {
        return all$(3);
    }

    public ExcelImporterBulkResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ExcelImporterBulkResultResponseProjection.ExcelImporterResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExcelImporterBulkResultResponseProjection.ExcelImporterResponseProjection.items", projectionDepthOnFields.getOrDefault("ExcelImporterBulkResultResponseProjection.ExcelImporterResponseProjection.items", 0) + 1);
            this.items(new ExcelImporterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExcelImporterBulkResultResponseProjection.ExcelImporterResponseProjection.items", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public ExcelImporterBulkResultResponseProjection items(ExcelImporterResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public ExcelImporterBulkResultResponseProjection items(String alias, ExcelImporterResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public ExcelImporterBulkResultResponseProjection totalCount() {
        return totalCount(null);
    }

    public ExcelImporterBulkResultResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ExcelImporterBulkResultResponseProjection typename() {
        return typename(null);
    }

    public ExcelImporterBulkResultResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ExcelImporterBulkResultResponseProjection deepCopy$() {
        return new ExcelImporterBulkResultResponseProjection(this);
    }


}
