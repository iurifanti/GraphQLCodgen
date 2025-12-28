package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Tipo_visita_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tipo_visita_mpvResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Tipo_visita_mpvResponseProjection() {
    }

    public Tipo_visita_mpvResponseProjection(Tipo_visita_mpvResponseProjection projection) {
        super(projection);
    }

    public Tipo_visita_mpvResponseProjection(List<Tipo_visita_mpvResponseProjection> projections) {
        super(projections);
    }

    public Tipo_visita_mpvResponseProjection all$() {
        return all$(3);
    }

    public Tipo_visita_mpvResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.booster();
        this.cod();
        this.nome();
        this.typename();
        return this;
    }

    public Tipo_visita_mpvResponseProjection _clientId() {
        return _clientId(null);
    }

    public Tipo_visita_mpvResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Tipo_visita_mpvResponseProjection _id() {
        return _id(null);
    }

    public Tipo_visita_mpvResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Tipo_visita_mpvResponseProjection booster() {
        return booster(null);
    }

    public Tipo_visita_mpvResponseProjection booster(String alias) {
        add$(new GraphQLResponseField("booster").alias(alias));
        return this;
    }

    public Tipo_visita_mpvResponseProjection cod() {
        return cod(null);
    }

    public Tipo_visita_mpvResponseProjection cod(String alias) {
        add$(new GraphQLResponseField("cod").alias(alias));
        return this;
    }

    public Tipo_visita_mpvResponseProjection nome() {
        return nome(null);
    }

    public Tipo_visita_mpvResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Tipo_visita_mpvResponseProjection typename() {
        return typename(null);
    }

    public Tipo_visita_mpvResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Tipo_visita_mpvResponseProjection deepCopy$() {
        return new Tipo_visita_mpvResponseProjection(this);
    }


}
