package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Relazione_decesso
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Relazione_decessoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Relazione_decessoResponseProjection() {
    }

    public Relazione_decessoResponseProjection(Relazione_decessoResponseProjection projection) {
        super(projection);
    }

    public Relazione_decessoResponseProjection(List<Relazione_decessoResponseProjection> projections) {
        super(projections);
    }

    public Relazione_decessoResponseProjection all$() {
        return all$(3);
    }

    public Relazione_decessoResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.codice_dad();
        this.nome();
        this.typename();
        return this;
    }

    public Relazione_decessoResponseProjection _clientId() {
        return _clientId(null);
    }

    public Relazione_decessoResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Relazione_decessoResponseProjection _id() {
        return _id(null);
    }

    public Relazione_decessoResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Relazione_decessoResponseProjection codice_dad() {
        return codice_dad(null);
    }

    public Relazione_decessoResponseProjection codice_dad(String alias) {
        add$(new GraphQLResponseField("codice_dad").alias(alias));
        return this;
    }

    public Relazione_decessoResponseProjection nome() {
        return nome(null);
    }

    public Relazione_decessoResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Relazione_decessoResponseProjection typename() {
        return typename(null);
    }

    public Relazione_decessoResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Relazione_decessoResponseProjection deepCopy$() {
        return new Relazione_decessoResponseProjection(this);
    }


}
