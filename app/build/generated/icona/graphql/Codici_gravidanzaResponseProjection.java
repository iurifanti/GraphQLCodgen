package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Codici_gravidanza
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Codici_gravidanzaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Codici_gravidanzaResponseProjection() {
    }

    public Codici_gravidanzaResponseProjection(Codici_gravidanzaResponseProjection projection) {
        super(projection);
    }

    public Codici_gravidanzaResponseProjection(List<Codici_gravidanzaResponseProjection> projections) {
        super(projections);
    }

    public Codici_gravidanzaResponseProjection all$() {
        return all$(3);
    }

    public Codici_gravidanzaResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.campo();
        this.codice_hicdep();
        this.nome();
        this.typename();
        return this;
    }

    public Codici_gravidanzaResponseProjection _clientId() {
        return _clientId(null);
    }

    public Codici_gravidanzaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Codici_gravidanzaResponseProjection _id() {
        return _id(null);
    }

    public Codici_gravidanzaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Codici_gravidanzaResponseProjection campo() {
        return campo(null);
    }

    public Codici_gravidanzaResponseProjection campo(String alias) {
        add$(new GraphQLResponseField("campo").alias(alias));
        return this;
    }

    public Codici_gravidanzaResponseProjection codice_hicdep() {
        return codice_hicdep(null);
    }

    public Codici_gravidanzaResponseProjection codice_hicdep(String alias) {
        add$(new GraphQLResponseField("codice_hicdep").alias(alias));
        return this;
    }

    public Codici_gravidanzaResponseProjection nome() {
        return nome(null);
    }

    public Codici_gravidanzaResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Codici_gravidanzaResponseProjection typename() {
        return typename(null);
    }

    public Codici_gravidanzaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Codici_gravidanzaResponseProjection deepCopy$() {
        return new Codici_gravidanzaResponseProjection(this);
    }


}
