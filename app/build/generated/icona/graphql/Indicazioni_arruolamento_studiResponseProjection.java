package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Indicazioni_arruolamento_studi
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Indicazioni_arruolamento_studiResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Indicazioni_arruolamento_studiResponseProjection() {
    }

    public Indicazioni_arruolamento_studiResponseProjection(Indicazioni_arruolamento_studiResponseProjection projection) {
        super(projection);
    }

    public Indicazioni_arruolamento_studiResponseProjection(List<Indicazioni_arruolamento_studiResponseProjection> projections) {
        super(projections);
    }

    public Indicazioni_arruolamento_studiResponseProjection all$() {
        return all$(3);
    }

    public Indicazioni_arruolamento_studiResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        if (projectionDepthOnFields.getOrDefault("Indicazioni_arruolamento_studiResponseProjection.FileInfoResponseProjection.documento", 0) <= maxDepth) {
            projectionDepthOnFields.put("Indicazioni_arruolamento_studiResponseProjection.FileInfoResponseProjection.documento", projectionDepthOnFields.getOrDefault("Indicazioni_arruolamento_studiResponseProjection.FileInfoResponseProjection.documento", 0) + 1);
            this.documento(new FileInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Indicazioni_arruolamento_studiResponseProjection.FileInfoResponseProjection.documento", 0)));
        }
        this.studio();
        this.typename();
        return this;
    }

    public Indicazioni_arruolamento_studiResponseProjection _clientId() {
        return _clientId(null);
    }

    public Indicazioni_arruolamento_studiResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Indicazioni_arruolamento_studiResponseProjection _id() {
        return _id(null);
    }

    public Indicazioni_arruolamento_studiResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Indicazioni_arruolamento_studiResponseProjection documento(FileInfoResponseProjection subProjection) {
        return documento(null, subProjection);
    }

    public Indicazioni_arruolamento_studiResponseProjection documento(String alias, FileInfoResponseProjection subProjection) {
        add$(new GraphQLResponseField("documento").alias(alias).projection(subProjection));
        return this;
    }

    public Indicazioni_arruolamento_studiResponseProjection studio() {
        return studio(null);
    }

    public Indicazioni_arruolamento_studiResponseProjection studio(String alias) {
        add$(new GraphQLResponseField("studio").alias(alias));
        return this;
    }

    public Indicazioni_arruolamento_studiResponseProjection typename() {
        return typename(null);
    }

    public Indicazioni_arruolamento_studiResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Indicazioni_arruolamento_studiResponseProjection deepCopy$() {
        return new Indicazioni_arruolamento_studiResponseProjection(this);
    }


}
