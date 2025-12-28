package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Risposta
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class RispostaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RispostaResponseProjection() {
    }

    public RispostaResponseProjection(RispostaResponseProjection projection) {
        super(projection);
    }

    public RispostaResponseProjection(List<RispostaResponseProjection> projections) {
        super(projections);
    }

    public RispostaResponseProjection all$() {
        return all$(3);
    }

    public RispostaResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.alert_obbligatoria();
        this.codice_interno_i();
        this.decimale();
        this.domanda();
        this.domanda_id();
        this.domande_questionario_ids();
        this.id_risposta_peso();
        this.intero();
        this.obbligatoria();
        this.opzioni_multipla();
        this.opzioni_singola();
        this.ordine();
        this.ordine_risposta();
        this.peso_punteggio();
        this.punteggio_risposta();
        this.punteggio_totale();
        this.questionario_id();
        this.questionario_pro_app_id();
        this.risposta();
        this.risposta_dec();
        this.risposta_int();
        this.risposta_multipla();
        this.risposta_str();
        this.scala_intera();
        this.solo_intro();
        this.stringa();
        this.studio_questionario_id();
        if (projectionDepthOnFields.getOrDefault("RispostaResponseProjection.DomandaPageResponseProjection.domanda____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("RispostaResponseProjection.DomandaPageResponseProjection.domanda____associables", projectionDepthOnFields.getOrDefault("RispostaResponseProjection.DomandaPageResponseProjection.domanda____associables", 0) + 1);
            this.domanda____associables(new DomandaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RispostaResponseProjection.DomandaPageResponseProjection.domanda____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RispostaResponseProjection.DomandaResponseProjection.domanda_", 0) <= maxDepth) {
            projectionDepthOnFields.put("RispostaResponseProjection.DomandaResponseProjection.domanda_", projectionDepthOnFields.getOrDefault("RispostaResponseProjection.DomandaResponseProjection.domanda_", 0) + 1);
            this.domanda_(new DomandaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RispostaResponseProjection.DomandaResponseProjection.domanda_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RispostaResponseProjection.Risposta_possibilePageResponseProjection.risposta_possibile_multipla___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("RispostaResponseProjection.Risposta_possibilePageResponseProjection.risposta_possibile_multipla___associables", projectionDepthOnFields.getOrDefault("RispostaResponseProjection.Risposta_possibilePageResponseProjection.risposta_possibile_multipla___associables", 0) + 1);
            this.risposta_possibile_multipla___associables(new Risposta_possibilePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RispostaResponseProjection.Risposta_possibilePageResponseProjection.risposta_possibile_multipla___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RispostaResponseProjection.Risposta_possibilePageResponseProjection.risposta_possibile_multipla", 0) <= maxDepth) {
            projectionDepthOnFields.put("RispostaResponseProjection.Risposta_possibilePageResponseProjection.risposta_possibile_multipla", projectionDepthOnFields.getOrDefault("RispostaResponseProjection.Risposta_possibilePageResponseProjection.risposta_possibile_multipla", 0) + 1);
            this.risposta_possibile_multipla(new Risposta_possibilePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RispostaResponseProjection.Risposta_possibilePageResponseProjection.risposta_possibile_multipla", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RispostaResponseProjection.Questionario_PRO_appResponseProjection.questionario_PRO_app_", 0) <= maxDepth) {
            projectionDepthOnFields.put("RispostaResponseProjection.Questionario_PRO_appResponseProjection.questionario_PRO_app_", projectionDepthOnFields.getOrDefault("RispostaResponseProjection.Questionario_PRO_appResponseProjection.questionario_PRO_app_", 0) + 1);
            this.questionario_PRO_app_(new Questionario_PRO_appResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RispostaResponseProjection.Questionario_PRO_appResponseProjection.questionario_PRO_app_", 0)));
        }
        this.typename();
        return this;
    }

    public RispostaResponseProjection _clientId() {
        return _clientId(null);
    }

    public RispostaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public RispostaResponseProjection _id() {
        return _id(null);
    }

    public RispostaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public RispostaResponseProjection alert_obbligatoria() {
        return alert_obbligatoria(null);
    }

    public RispostaResponseProjection alert_obbligatoria(String alias) {
        add$(new GraphQLResponseField("alert_obbligatoria").alias(alias));
        return this;
    }

    public RispostaResponseProjection codice_interno_i() {
        return codice_interno_i(null);
    }

    public RispostaResponseProjection codice_interno_i(String alias) {
        add$(new GraphQLResponseField("codice_interno_i").alias(alias));
        return this;
    }

    public RispostaResponseProjection decimale() {
        return decimale(null);
    }

    public RispostaResponseProjection decimale(String alias) {
        add$(new GraphQLResponseField("decimale").alias(alias));
        return this;
    }

    public RispostaResponseProjection domanda() {
        return domanda(null);
    }

    public RispostaResponseProjection domanda(String alias) {
        add$(new GraphQLResponseField("domanda").alias(alias));
        return this;
    }

    public RispostaResponseProjection domanda_id() {
        return domanda_id(null);
    }

    public RispostaResponseProjection domanda_id(String alias) {
        add$(new GraphQLResponseField("domanda_id").alias(alias));
        return this;
    }

    public RispostaResponseProjection domande_questionario_ids() {
        return domande_questionario_ids(null);
    }

    public RispostaResponseProjection domande_questionario_ids(String alias) {
        add$(new GraphQLResponseField("domande_questionario_ids").alias(alias));
        return this;
    }

    public RispostaResponseProjection id_risposta_peso() {
        return id_risposta_peso(null);
    }

    public RispostaResponseProjection id_risposta_peso(String alias) {
        add$(new GraphQLResponseField("id_risposta_peso").alias(alias));
        return this;
    }

    public RispostaResponseProjection intero() {
        return intero(null);
    }

    public RispostaResponseProjection intero(String alias) {
        add$(new GraphQLResponseField("intero").alias(alias));
        return this;
    }

    public RispostaResponseProjection obbligatoria() {
        return obbligatoria(null);
    }

    public RispostaResponseProjection obbligatoria(String alias) {
        add$(new GraphQLResponseField("obbligatoria").alias(alias));
        return this;
    }

    public RispostaResponseProjection opzioni_multipla() {
        return opzioni_multipla(null);
    }

    public RispostaResponseProjection opzioni_multipla(String alias) {
        add$(new GraphQLResponseField("opzioni_multipla").alias(alias));
        return this;
    }

    public RispostaResponseProjection opzioni_singola() {
        return opzioni_singola(null);
    }

    public RispostaResponseProjection opzioni_singola(String alias) {
        add$(new GraphQLResponseField("opzioni_singola").alias(alias));
        return this;
    }

    public RispostaResponseProjection ordine() {
        return ordine(null);
    }

    public RispostaResponseProjection ordine(String alias) {
        add$(new GraphQLResponseField("ordine").alias(alias));
        return this;
    }

    public RispostaResponseProjection ordine_risposta() {
        return ordine_risposta(null);
    }

    public RispostaResponseProjection ordine_risposta(String alias) {
        add$(new GraphQLResponseField("ordine_risposta").alias(alias));
        return this;
    }

    public RispostaResponseProjection peso_punteggio() {
        return peso_punteggio(null);
    }

    public RispostaResponseProjection peso_punteggio(String alias) {
        add$(new GraphQLResponseField("peso_punteggio").alias(alias));
        return this;
    }

    public RispostaResponseProjection punteggio_risposta() {
        return punteggio_risposta(null);
    }

    public RispostaResponseProjection punteggio_risposta(String alias) {
        add$(new GraphQLResponseField("punteggio_risposta").alias(alias));
        return this;
    }

    public RispostaResponseProjection punteggio_totale() {
        return punteggio_totale(null);
    }

    public RispostaResponseProjection punteggio_totale(String alias) {
        add$(new GraphQLResponseField("punteggio_totale").alias(alias));
        return this;
    }

    public RispostaResponseProjection questionario_id() {
        return questionario_id(null);
    }

    public RispostaResponseProjection questionario_id(String alias) {
        add$(new GraphQLResponseField("questionario_id").alias(alias));
        return this;
    }

    public RispostaResponseProjection questionario_pro_app_id() {
        return questionario_pro_app_id(null);
    }

    public RispostaResponseProjection questionario_pro_app_id(String alias) {
        add$(new GraphQLResponseField("questionario_pro_app_id").alias(alias));
        return this;
    }

    public RispostaResponseProjection risposta() {
        return risposta(null);
    }

    public RispostaResponseProjection risposta(String alias) {
        add$(new GraphQLResponseField("risposta").alias(alias));
        return this;
    }

    public RispostaResponseProjection risposta_dec() {
        return risposta_dec(null);
    }

    public RispostaResponseProjection risposta_dec(String alias) {
        add$(new GraphQLResponseField("risposta_dec").alias(alias));
        return this;
    }

    public RispostaResponseProjection risposta_int() {
        return risposta_int(null);
    }

    public RispostaResponseProjection risposta_int(String alias) {
        add$(new GraphQLResponseField("risposta_int").alias(alias));
        return this;
    }

    public RispostaResponseProjection risposta_multipla() {
        return risposta_multipla(null);
    }

    public RispostaResponseProjection risposta_multipla(String alias) {
        add$(new GraphQLResponseField("risposta_multipla").alias(alias));
        return this;
    }

    public RispostaResponseProjection risposta_str() {
        return risposta_str(null);
    }

    public RispostaResponseProjection risposta_str(String alias) {
        add$(new GraphQLResponseField("risposta_str").alias(alias));
        return this;
    }

    public RispostaResponseProjection scala_intera() {
        return scala_intera(null);
    }

    public RispostaResponseProjection scala_intera(String alias) {
        add$(new GraphQLResponseField("scala_intera").alias(alias));
        return this;
    }

    public RispostaResponseProjection solo_intro() {
        return solo_intro(null);
    }

    public RispostaResponseProjection solo_intro(String alias) {
        add$(new GraphQLResponseField("solo_intro").alias(alias));
        return this;
    }

    public RispostaResponseProjection stringa() {
        return stringa(null);
    }

    public RispostaResponseProjection stringa(String alias) {
        add$(new GraphQLResponseField("stringa").alias(alias));
        return this;
    }

    public RispostaResponseProjection studio_questionario_id() {
        return studio_questionario_id(null);
    }

    public RispostaResponseProjection studio_questionario_id(String alias) {
        add$(new GraphQLResponseField("studio_questionario_id").alias(alias));
        return this;
    }

    public RispostaResponseProjection domanda____associables(DomandaPageResponseProjection subProjection) {
        return domanda____associables((String)null, subProjection);
    }

    public RispostaResponseProjection domanda____associables(String alias, DomandaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("domanda____associables").alias(alias).projection(subProjection));
        return this;
    }

    public RispostaResponseProjection domanda____associables(RispostaDomanda____associablesParametrizedInput input, DomandaPageResponseProjection subProjection) {
        return domanda____associables(null, input, subProjection);
    }

    public RispostaResponseProjection domanda____associables(String alias, RispostaDomanda____associablesParametrizedInput input, DomandaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("domanda____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RispostaResponseProjection domanda_(DomandaResponseProjection subProjection) {
        return domanda_(null, subProjection);
    }

    public RispostaResponseProjection domanda_(String alias, DomandaResponseProjection subProjection) {
        add$(new GraphQLResponseField("domanda_").alias(alias).projection(subProjection));
        return this;
    }

    public RispostaResponseProjection risposta_possibile_multipla___associables(Risposta_possibilePageResponseProjection subProjection) {
        return risposta_possibile_multipla___associables((String)null, subProjection);
    }

    public RispostaResponseProjection risposta_possibile_multipla___associables(String alias, Risposta_possibilePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("risposta_possibile_multipla___associables").alias(alias).projection(subProjection));
        return this;
    }

    public RispostaResponseProjection risposta_possibile_multipla___associables(RispostaRisposta_possibile_multipla___associablesParametrizedInput input, Risposta_possibilePageResponseProjection subProjection) {
        return risposta_possibile_multipla___associables(null, input, subProjection);
    }

    public RispostaResponseProjection risposta_possibile_multipla___associables(String alias, RispostaRisposta_possibile_multipla___associablesParametrizedInput input, Risposta_possibilePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("risposta_possibile_multipla___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RispostaResponseProjection risposta_possibile_multipla(Risposta_possibilePageResponseProjection subProjection) {
        return risposta_possibile_multipla((String)null, subProjection);
    }

    public RispostaResponseProjection risposta_possibile_multipla(String alias, Risposta_possibilePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("risposta_possibile_multipla").alias(alias).projection(subProjection));
        return this;
    }

    public RispostaResponseProjection risposta_possibile_multipla(RispostaRisposta_possibile_multiplaParametrizedInput input, Risposta_possibilePageResponseProjection subProjection) {
        return risposta_possibile_multipla(null, input, subProjection);
    }

    public RispostaResponseProjection risposta_possibile_multipla(String alias, RispostaRisposta_possibile_multiplaParametrizedInput input, Risposta_possibilePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("risposta_possibile_multipla").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RispostaResponseProjection questionario_PRO_app_(Questionario_PRO_appResponseProjection subProjection) {
        return questionario_PRO_app_(null, subProjection);
    }

    public RispostaResponseProjection questionario_PRO_app_(String alias, Questionario_PRO_appResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario_PRO_app_").alias(alias).projection(subProjection));
        return this;
    }

    public RispostaResponseProjection typename() {
        return typename(null);
    }

    public RispostaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public RispostaResponseProjection deepCopy$() {
        return new RispostaResponseProjection(this);
    }


}
