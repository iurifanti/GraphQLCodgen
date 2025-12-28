package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tipo_esame
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tipo_esameResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tipo_esameResponseProjection() {
    }

    public Tipo_esameResponseProjection(Tipo_esameResponseProjection projection) {
        super(projection);
    }

    public Tipo_esameResponseProjection(List<Tipo_esameResponseProjection> projections) {
        super(projections);
    }

    public Tipo_esameResponseProjection all$() {
        return all$(3);
    }

    public Tipo_esameResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.typename();
        return this;
    }

    public Tipo_esameResponseProjection _clientId() {
        return _clientId(null);
    }

    public Tipo_esameResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Tipo_esameResponseProjection _id() {
        return _id(null);
    }

    public Tipo_esameResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Tipo_esameResponseProjection nome() {
        return nome(null);
    }

    public Tipo_esameResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Tipo_esameResponseProjection typename() {
        return typename(null);
    }

    public Tipo_esameResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tipo_esameResponseProjection deepCopy$() {
        return new Tipo_esameResponseProjection(this);
    }


}
