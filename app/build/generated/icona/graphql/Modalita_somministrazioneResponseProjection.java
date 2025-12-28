package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Modalita_somministrazione
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Modalita_somministrazioneResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Modalita_somministrazioneResponseProjection() {
    }

    public Modalita_somministrazioneResponseProjection(Modalita_somministrazioneResponseProjection projection) {
        super(projection);
    }

    public Modalita_somministrazioneResponseProjection(List<Modalita_somministrazioneResponseProjection> projections) {
        super(projections);
    }

    public Modalita_somministrazioneResponseProjection all$() {
        return all$(3);
    }

    public Modalita_somministrazioneResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.cod();
        this.nome();
        this.typename();
        return this;
    }

    public Modalita_somministrazioneResponseProjection _clientId() {
        return _clientId(null);
    }

    public Modalita_somministrazioneResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Modalita_somministrazioneResponseProjection _id() {
        return _id(null);
    }

    public Modalita_somministrazioneResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Modalita_somministrazioneResponseProjection cod() {
        return cod(null);
    }

    public Modalita_somministrazioneResponseProjection cod(String alias) {
        add$(new GraphQLResponseField("cod").alias(alias));
        return this;
    }

    public Modalita_somministrazioneResponseProjection nome() {
        return nome(null);
    }

    public Modalita_somministrazioneResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Modalita_somministrazioneResponseProjection typename() {
        return typename(null);
    }

    public Modalita_somministrazioneResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Modalita_somministrazioneResponseProjection deepCopy$() {
        return new Modalita_somministrazioneResponseProjection(this);
    }


}
