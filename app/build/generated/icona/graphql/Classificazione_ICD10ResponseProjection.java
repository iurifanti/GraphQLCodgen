package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Classificazione_ICD10
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Classificazione_ICD10ResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Classificazione_ICD10ResponseProjection() {
    }

    public Classificazione_ICD10ResponseProjection(Classificazione_ICD10ResponseProjection projection) {
        super(projection);
    }

    public Classificazione_ICD10ResponseProjection(List<Classificazione_ICD10ResponseProjection> projections) {
        super(projections);
    }

    public Classificazione_ICD10ResponseProjection all$() {
        return all$(3);
    }

    public Classificazione_ICD10ResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.codice();
        this.descrizione();
        this.typename();
        return this;
    }

    public Classificazione_ICD10ResponseProjection _clientId() {
        return _clientId(null);
    }

    public Classificazione_ICD10ResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Classificazione_ICD10ResponseProjection _id() {
        return _id(null);
    }

    public Classificazione_ICD10ResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Classificazione_ICD10ResponseProjection codice() {
        return codice(null);
    }

    public Classificazione_ICD10ResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Classificazione_ICD10ResponseProjection descrizione() {
        return descrizione(null);
    }

    public Classificazione_ICD10ResponseProjection descrizione(String alias) {
        add$(new GraphQLResponseField("descrizione").alias(alias));
        return this;
    }

    public Classificazione_ICD10ResponseProjection typename() {
        return typename(null);
    }

    public Classificazione_ICD10ResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Classificazione_ICD10ResponseProjection deepCopy$() {
        return new Classificazione_ICD10ResponseProjection(this);
    }


}
