package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tipo_marker
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tipo_markerResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tipo_markerResponseProjection() {
    }

    public Tipo_markerResponseProjection(Tipo_markerResponseProjection projection) {
        super(projection);
    }

    public Tipo_markerResponseProjection(List<Tipo_markerResponseProjection> projections) {
        super(projections);
    }

    public Tipo_markerResponseProjection all$() {
        return all$(3);
    }

    public Tipo_markerResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.typename();
        return this;
    }

    public Tipo_markerResponseProjection _clientId() {
        return _clientId(null);
    }

    public Tipo_markerResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Tipo_markerResponseProjection _id() {
        return _id(null);
    }

    public Tipo_markerResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Tipo_markerResponseProjection nome() {
        return nome(null);
    }

    public Tipo_markerResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Tipo_markerResponseProjection typename() {
        return typename(null);
    }

    public Tipo_markerResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tipo_markerResponseProjection deepCopy$() {
        return new Tipo_markerResponseProjection(this);
    }


}
