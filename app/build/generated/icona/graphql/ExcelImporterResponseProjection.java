package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ExcelImporter
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ExcelImporterResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ExcelImporterResponseProjection() {
    }

    public ExcelImporterResponseProjection(ExcelImporterResponseProjection projection) {
        super(projection);
    }

    public ExcelImporterResponseProjection(List<ExcelImporterResponseProjection> projections) {
        super(projections);
    }

    public ExcelImporterResponseProjection all$() {
        return all$(3);
    }

    public ExcelImporterResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        if (projectionDepthOnFields.getOrDefault("ExcelImporterResponseProjection.FileInfoResponseProjection.file", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExcelImporterResponseProjection.FileInfoResponseProjection.file", projectionDepthOnFields.getOrDefault("ExcelImporterResponseProjection.FileInfoResponseProjection.file", 0) + 1);
            this.file(new FileInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExcelImporterResponseProjection.FileInfoResponseProjection.file", 0)));
        }
        this.log();
        this.typename();
        return this;
    }

    public ExcelImporterResponseProjection _clientId() {
        return _clientId(null);
    }

    public ExcelImporterResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public ExcelImporterResponseProjection _id() {
        return _id(null);
    }

    public ExcelImporterResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public ExcelImporterResponseProjection file(FileInfoResponseProjection subProjection) {
        return file(null, subProjection);
    }

    public ExcelImporterResponseProjection file(String alias, FileInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("file").alias(alias).projection(subProjection));
        return this;
    }

    public ExcelImporterResponseProjection log() {
        return log(null);
    }

    public ExcelImporterResponseProjection log(String alias) {
        add$(new GraphQLResponseField("log").alias(alias));
        return this;
    }

    public ExcelImporterResponseProjection typename() {
        return typename(null);
    }

    public ExcelImporterResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ExcelImporterResponseProjection deepCopy$() {
        return new ExcelImporterResponseProjection(this);
    }


}
