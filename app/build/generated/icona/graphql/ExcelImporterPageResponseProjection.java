package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ExcelImporterPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ExcelImporterPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ExcelImporterPageResponseProjection() {
    }

    public ExcelImporterPageResponseProjection(ExcelImporterPageResponseProjection projection) {
        super(projection);
    }

    public ExcelImporterPageResponseProjection(List<ExcelImporterPageResponseProjection> projections) {
        super(projections);
    }

    public ExcelImporterPageResponseProjection all$() {
        return all$(3);
    }

    public ExcelImporterPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ExcelImporterPageResponseProjection.ExcelImporterResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExcelImporterPageResponseProjection.ExcelImporterResponseProjection.items", projectionDepthOnFields.getOrDefault("ExcelImporterPageResponseProjection.ExcelImporterResponseProjection.items", 0) + 1);
            this.items(new ExcelImporterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExcelImporterPageResponseProjection.ExcelImporterResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public ExcelImporterPageResponseProjection items(ExcelImporterResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public ExcelImporterPageResponseProjection items(String alias, ExcelImporterResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public ExcelImporterPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public ExcelImporterPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ExcelImporterPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public ExcelImporterPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public ExcelImporterPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public ExcelImporterPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public ExcelImporterPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public ExcelImporterPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public ExcelImporterPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public ExcelImporterPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public ExcelImporterPageResponseProjection typename() {
        return typename(null);
    }

    public ExcelImporterPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ExcelImporterPageResponseProjection deepCopy$() {
        return new ExcelImporterPageResponseProjection(this);
    }


}
