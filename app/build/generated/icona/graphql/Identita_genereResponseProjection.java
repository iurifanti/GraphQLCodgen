package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Identita_genere
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Identita_genereResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Identita_genereResponseProjection() {
    }

    public Identita_genereResponseProjection(Identita_genereResponseProjection projection) {
        super(projection);
    }

    public Identita_genereResponseProjection(List<Identita_genereResponseProjection> projections) {
        super(projections);
    }

    public Identita_genereResponseProjection all$() {
        return all$(3);
    }

    public Identita_genereResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.typename();
        return this;
    }

    public Identita_genereResponseProjection _clientId() {
        return _clientId(null);
    }

    public Identita_genereResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Identita_genereResponseProjection _id() {
        return _id(null);
    }

    public Identita_genereResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Identita_genereResponseProjection nome() {
        return nome(null);
    }

    public Identita_genereResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Identita_genereResponseProjection typename() {
        return typename(null);
    }

    public Identita_genereResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Identita_genereResponseProjection deepCopy$() {
        return new Identita_genereResponseProjection(this);
    }


}
