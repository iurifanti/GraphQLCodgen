package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Nazione
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class NazioneResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public NazioneResponseProjection() {
    }

    public NazioneResponseProjection(NazioneResponseProjection projection) {
        super(projection);
    }

    public NazioneResponseProjection(List<NazioneResponseProjection> projections) {
        super(projections);
    }

    public NazioneResponseProjection all$() {
        return all$(3);
    }

    public NazioneResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.codice();
        this.codice_hicdep();
        this.nome();
        this.typename();
        return this;
    }

    public NazioneResponseProjection _clientId() {
        return _clientId(null);
    }

    public NazioneResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public NazioneResponseProjection _id() {
        return _id(null);
    }

    public NazioneResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public NazioneResponseProjection codice() {
        return codice(null);
    }

    public NazioneResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public NazioneResponseProjection codice_hicdep() {
        return codice_hicdep(null);
    }

    public NazioneResponseProjection codice_hicdep(String alias) {
        add$(new GraphQLResponseField("codice_hicdep").alias(alias));
        return this;
    }

    public NazioneResponseProjection nome() {
        return nome(null);
    }

    public NazioneResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public NazioneResponseProjection typename() {
        return typename(null);
    }

    public NazioneResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public NazioneResponseProjection deepCopy$() {
        return new NazioneResponseProjection(this);
    }


}
