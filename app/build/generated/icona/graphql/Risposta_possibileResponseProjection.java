package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Risposta_possibile
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Risposta_possibileResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Risposta_possibileResponseProjection() {
    }

    public Risposta_possibileResponseProjection(Risposta_possibileResponseProjection projection) {
        super(projection);
    }

    public Risposta_possibileResponseProjection(List<Risposta_possibileResponseProjection> projections) {
        super(projections);
    }

    public Risposta_possibileResponseProjection all$() {
        return all$(3);
    }

    public Risposta_possibileResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.conc();
        this.domande_associate();
        this.domande_associate_ids();
        this.ordine();
        this.punteggio();
        this.risposte_associate();
        this.risposte_associate_ids();
        this.testo();
        if (projectionDepthOnFields.getOrDefault("Risposta_possibileResponseProjection.DomandaPageResponseProjection.domanda____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Risposta_possibileResponseProjection.DomandaPageResponseProjection.domanda____associables", projectionDepthOnFields.getOrDefault("Risposta_possibileResponseProjection.DomandaPageResponseProjection.domanda____associables", 0) + 1);
            this.domanda____associables(new DomandaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Risposta_possibileResponseProjection.DomandaPageResponseProjection.domanda____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Risposta_possibileResponseProjection.DomandaPageResponseProjection.domanda_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Risposta_possibileResponseProjection.DomandaPageResponseProjection.domanda_", projectionDepthOnFields.getOrDefault("Risposta_possibileResponseProjection.DomandaPageResponseProjection.domanda_", 0) + 1);
            this.domanda_(new DomandaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Risposta_possibileResponseProjection.DomandaPageResponseProjection.domanda_", 0)));
        }
        this.typename();
        return this;
    }

    public Risposta_possibileResponseProjection _clientId() {
        return _clientId(null);
    }

    public Risposta_possibileResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Risposta_possibileResponseProjection _id() {
        return _id(null);
    }

    public Risposta_possibileResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Risposta_possibileResponseProjection conc() {
        return conc(null);
    }

    public Risposta_possibileResponseProjection conc(String alias) {
        add$(new GraphQLResponseField("conc").alias(alias));
        return this;
    }

    public Risposta_possibileResponseProjection domande_associate() {
        return domande_associate(null);
    }

    public Risposta_possibileResponseProjection domande_associate(String alias) {
        add$(new GraphQLResponseField("domande_associate").alias(alias));
        return this;
    }

    public Risposta_possibileResponseProjection domande_associate_ids() {
        return domande_associate_ids(null);
    }

    public Risposta_possibileResponseProjection domande_associate_ids(String alias) {
        add$(new GraphQLResponseField("domande_associate_ids").alias(alias));
        return this;
    }

    public Risposta_possibileResponseProjection ordine() {
        return ordine(null);
    }

    public Risposta_possibileResponseProjection ordine(String alias) {
        add$(new GraphQLResponseField("ordine").alias(alias));
        return this;
    }

    public Risposta_possibileResponseProjection punteggio() {
        return punteggio(null);
    }

    public Risposta_possibileResponseProjection punteggio(String alias) {
        add$(new GraphQLResponseField("punteggio").alias(alias));
        return this;
    }

    public Risposta_possibileResponseProjection risposte_associate() {
        return risposte_associate(null);
    }

    public Risposta_possibileResponseProjection risposte_associate(String alias) {
        add$(new GraphQLResponseField("risposte_associate").alias(alias));
        return this;
    }

    public Risposta_possibileResponseProjection risposte_associate_ids() {
        return risposte_associate_ids(null);
    }

    public Risposta_possibileResponseProjection risposte_associate_ids(String alias) {
        add$(new GraphQLResponseField("risposte_associate_ids").alias(alias));
        return this;
    }

    public Risposta_possibileResponseProjection testo() {
        return testo(null);
    }

    public Risposta_possibileResponseProjection testo(String alias) {
        add$(new GraphQLResponseField("testo").alias(alias));
        return this;
    }

    public Risposta_possibileResponseProjection domanda____associables(DomandaPageResponseProjection subProjection) {
        return domanda____associables((String)null, subProjection);
    }

    public Risposta_possibileResponseProjection domanda____associables(String alias, DomandaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("domanda____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Risposta_possibileResponseProjection domanda____associables(Risposta_possibileDomanda____associablesParametrizedInput input, DomandaPageResponseProjection subProjection) {
        return domanda____associables(null, input, subProjection);
    }

    public Risposta_possibileResponseProjection domanda____associables(String alias, Risposta_possibileDomanda____associablesParametrizedInput input, DomandaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("domanda____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Risposta_possibileResponseProjection domanda_(DomandaPageResponseProjection subProjection) {
        return domanda_((String)null, subProjection);
    }

    public Risposta_possibileResponseProjection domanda_(String alias, DomandaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("domanda_").alias(alias).projection(subProjection));
        return this;
    }

    public Risposta_possibileResponseProjection domanda_(Risposta_possibileDomanda_ParametrizedInput input, DomandaPageResponseProjection subProjection) {
        return domanda_(null, input, subProjection);
    }

    public Risposta_possibileResponseProjection domanda_(String alias, Risposta_possibileDomanda_ParametrizedInput input, DomandaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("domanda_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Risposta_possibileResponseProjection typename() {
        return typename(null);
    }

    public Risposta_possibileResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Risposta_possibileResponseProjection deepCopy$() {
        return new Risposta_possibileResponseProjection(this);
    }


}
