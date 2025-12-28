package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Studio_paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Studio_pazienteResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Studio_pazienteResponseProjection() {
    }

    public Studio_pazienteResponseProjection(Studio_pazienteResponseProjection projection) {
        super(projection);
    }

    public Studio_pazienteResponseProjection(List<Studio_pazienteResponseProjection> projections) {
        super(projections);
    }

    public Studio_pazienteResponseProjection all$() {
        return all$(3);
    }

    public Studio_pazienteResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.note();
        this.typename();
        return this;
    }

    public Studio_pazienteResponseProjection _clientId() {
        return _clientId(null);
    }

    public Studio_pazienteResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Studio_pazienteResponseProjection _id() {
        return _id(null);
    }

    public Studio_pazienteResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Studio_pazienteResponseProjection nome() {
        return nome(null);
    }

    public Studio_pazienteResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Studio_pazienteResponseProjection note() {
        return note(null);
    }

    public Studio_pazienteResponseProjection note(String alias) {
        add$(new GraphQLResponseField("note").alias(alias));
        return this;
    }

    public Studio_pazienteResponseProjection typename() {
        return typename(null);
    }

    public Studio_pazienteResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Studio_pazienteResponseProjection deepCopy$() {
        return new Studio_pazienteResponseProjection(this);
    }


}
