package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Sede_biobanca
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sede_biobancaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Sede_biobancaResponseProjection() {
    }

    public Sede_biobancaResponseProjection(Sede_biobancaResponseProjection projection) {
        super(projection);
    }

    public Sede_biobancaResponseProjection(List<Sede_biobancaResponseProjection> projections) {
        super(projections);
    }

    public Sede_biobancaResponseProjection all$() {
        return all$(3);
    }

    public Sede_biobancaResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.name();
        this.typename();
        return this;
    }

    public Sede_biobancaResponseProjection _clientId() {
        return _clientId(null);
    }

    public Sede_biobancaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Sede_biobancaResponseProjection _id() {
        return _id(null);
    }

    public Sede_biobancaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Sede_biobancaResponseProjection name() {
        return name(null);
    }

    public Sede_biobancaResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public Sede_biobancaResponseProjection typename() {
        return typename(null);
    }

    public Sede_biobancaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Sede_biobancaResponseProjection deepCopy$() {
        return new Sede_biobancaResponseProjection(this);
    }


}
