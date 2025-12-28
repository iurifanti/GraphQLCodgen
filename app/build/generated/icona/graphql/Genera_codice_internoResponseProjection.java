package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Genera_codice_interno
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Genera_codice_internoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Genera_codice_internoResponseProjection() {
    }

    public Genera_codice_internoResponseProjection(Genera_codice_internoResponseProjection projection) {
        super(projection);
    }

    public Genera_codice_internoResponseProjection(List<Genera_codice_internoResponseProjection> projections) {
        super(projections);
    }

    public Genera_codice_internoResponseProjection all$() {
        return all$(3);
    }

    public Genera_codice_internoResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.cognome();
        this.data_nascita();
        this.nome();
        this.typename();
        return this;
    }

    public Genera_codice_internoResponseProjection _clientId() {
        return _clientId(null);
    }

    public Genera_codice_internoResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Genera_codice_internoResponseProjection _id() {
        return _id(null);
    }

    public Genera_codice_internoResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Genera_codice_internoResponseProjection cognome() {
        return cognome(null);
    }

    public Genera_codice_internoResponseProjection cognome(String alias) {
        add$(new GraphQLResponseField("cognome").alias(alias));
        return this;
    }

    public Genera_codice_internoResponseProjection data_nascita() {
        return data_nascita(null);
    }

    public Genera_codice_internoResponseProjection data_nascita(String alias) {
        add$(new GraphQLResponseField("data_nascita").alias(alias));
        return this;
    }

    public Genera_codice_internoResponseProjection nome() {
        return nome(null);
    }

    public Genera_codice_internoResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Genera_codice_internoResponseProjection typename() {
        return typename(null);
    }

    public Genera_codice_internoResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Genera_codice_internoResponseProjection deepCopy$() {
        return new Genera_codice_internoResponseProjection(this);
    }


}
