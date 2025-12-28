package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for FileInfo
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class FileInfoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FileInfoResponseProjection() {
    }

    public FileInfoResponseProjection(FileInfoResponseProjection projection) {
        super(projection);
    }

    public FileInfoResponseProjection(List<FileInfoResponseProjection> projections) {
        super(projections);
    }

    public FileInfoResponseProjection all$() {
        return all$(3);
    }

    public FileInfoResponseProjection all$(int maxDepth) {
        this.fileId();
        this.mimeType();
        this.name();
        this.size();
        this.uploadedOn();
        this.link();
        this.typename();
        return this;
    }

    public FileInfoResponseProjection fileId() {
        return fileId(null);
    }

    public FileInfoResponseProjection fileId(String alias) {
        add$(new GraphQLResponseField("fileId").alias(alias));
        return this;
    }

    public FileInfoResponseProjection mimeType() {
        return mimeType(null);
    }

    public FileInfoResponseProjection mimeType(String alias) {
        add$(new GraphQLResponseField("mimeType").alias(alias));
        return this;
    }

    public FileInfoResponseProjection name() {
        return name(null);
    }

    public FileInfoResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FileInfoResponseProjection size() {
        return size(null);
    }

    public FileInfoResponseProjection size(String alias) {
        add$(new GraphQLResponseField("size").alias(alias));
        return this;
    }

    public FileInfoResponseProjection uploadedOn() {
        return uploadedOn(null);
    }

    public FileInfoResponseProjection uploadedOn(String alias) {
        add$(new GraphQLResponseField("uploadedOn").alias(alias));
        return this;
    }

    public FileInfoResponseProjection link() {
        return link(null);
    }

    public FileInfoResponseProjection link(String alias) {
        add$(new GraphQLResponseField("link").alias(alias));
        return this;
    }

    public FileInfoResponseProjection typename() {
        return typename(null);
    }

    public FileInfoResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public FileInfoResponseProjection deepCopy$() {
        return new FileInfoResponseProjection(this);
    }


}
