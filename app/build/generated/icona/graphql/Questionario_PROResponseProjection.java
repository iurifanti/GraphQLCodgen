package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Questionario_PRO
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Questionario_PROResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Questionario_PROResponseProjection() {
    }

    public Questionario_PROResponseProjection(Questionario_PROResponseProjection projection) {
        super(projection);
    }

    public Questionario_PROResponseProjection(List<Questionario_PROResponseProjection> projections) {
        super(projections);
    }

    public Questionario_PROResponseProjection all$() {
        return all$(3);
    }

    public Questionario_PROResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.data_compilazione();
        this.mese();
        if (projectionDepthOnFields.getOrDefault("Questionario_PROResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Questionario_PROResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("Questionario_PROResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Questionario_PROResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public Questionario_PROResponseProjection _clientId() {
        return _clientId(null);
    }

    public Questionario_PROResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Questionario_PROResponseProjection _id() {
        return _id(null);
    }

    public Questionario_PROResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Questionario_PROResponseProjection data_compilazione() {
        return data_compilazione(null);
    }

    public Questionario_PROResponseProjection data_compilazione(String alias) {
        add$(new GraphQLResponseField("data_compilazione").alias(alias));
        return this;
    }

    public Questionario_PROResponseProjection mese() {
        return mese(null);
    }

    public Questionario_PROResponseProjection mese(String alias) {
        add$(new GraphQLResponseField("mese").alias(alias));
        return this;
    }

    public Questionario_PROResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public Questionario_PROResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Questionario_PROResponseProjection typename() {
        return typename(null);
    }

    public Questionario_PROResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Questionario_PROResponseProjection deepCopy$() {
        return new Questionario_PROResponseProjection(this);
    }


}
