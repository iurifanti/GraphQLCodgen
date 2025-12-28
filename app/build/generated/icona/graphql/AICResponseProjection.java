package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for AIC
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class AICResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AICResponseProjection() {
    }

    public AICResponseProjection(AICResponseProjection projection) {
        super(projection);
    }

    public AICResponseProjection(List<AICResponseProjection> projections) {
        super(projections);
    }

    public AICResponseProjection all$() {
        return all$(3);
    }

    public AICResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.azienda();
        this.codice();
        this.confezione();
        this.data_fine_commercio();
        this.data_fine_validita_aic();
        this.data_inizio_commercio();
        this.data_inizio_validita_aic();
        this.marchio();
        this.principio_attivo();
        this.qta_principio_attivo();
        this.typename();
        return this;
    }

    public AICResponseProjection _clientId() {
        return _clientId(null);
    }

    public AICResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public AICResponseProjection _id() {
        return _id(null);
    }

    public AICResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public AICResponseProjection azienda() {
        return azienda(null);
    }

    public AICResponseProjection azienda(String alias) {
        add$(new GraphQLResponseField("azienda").alias(alias));
        return this;
    }

    public AICResponseProjection codice() {
        return codice(null);
    }

    public AICResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public AICResponseProjection confezione() {
        return confezione(null);
    }

    public AICResponseProjection confezione(String alias) {
        add$(new GraphQLResponseField("confezione").alias(alias));
        return this;
    }

    public AICResponseProjection data_fine_commercio() {
        return data_fine_commercio(null);
    }

    public AICResponseProjection data_fine_commercio(String alias) {
        add$(new GraphQLResponseField("data_fine_commercio").alias(alias));
        return this;
    }

    public AICResponseProjection data_fine_validita_aic() {
        return data_fine_validita_aic(null);
    }

    public AICResponseProjection data_fine_validita_aic(String alias) {
        add$(new GraphQLResponseField("data_fine_validita_aic").alias(alias));
        return this;
    }

    public AICResponseProjection data_inizio_commercio() {
        return data_inizio_commercio(null);
    }

    public AICResponseProjection data_inizio_commercio(String alias) {
        add$(new GraphQLResponseField("data_inizio_commercio").alias(alias));
        return this;
    }

    public AICResponseProjection data_inizio_validita_aic() {
        return data_inizio_validita_aic(null);
    }

    public AICResponseProjection data_inizio_validita_aic(String alias) {
        add$(new GraphQLResponseField("data_inizio_validita_aic").alias(alias));
        return this;
    }

    public AICResponseProjection marchio() {
        return marchio(null);
    }

    public AICResponseProjection marchio(String alias) {
        add$(new GraphQLResponseField("marchio").alias(alias));
        return this;
    }

    public AICResponseProjection principio_attivo() {
        return principio_attivo(null);
    }

    public AICResponseProjection principio_attivo(String alias) {
        add$(new GraphQLResponseField("principio_attivo").alias(alias));
        return this;
    }

    public AICResponseProjection qta_principio_attivo() {
        return qta_principio_attivo(null);
    }

    public AICResponseProjection qta_principio_attivo(String alias) {
        add$(new GraphQLResponseField("qta_principio_attivo").alias(alias));
        return this;
    }

    public AICResponseProjection typename() {
        return typename(null);
    }

    public AICResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public AICResponseProjection deepCopy$() {
        return new AICResponseProjection(this);
    }


}
