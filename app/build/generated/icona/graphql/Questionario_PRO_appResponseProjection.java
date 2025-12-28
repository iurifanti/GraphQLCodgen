package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Questionario_PRO_app
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Questionario_PRO_appResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Questionario_PRO_appResponseProjection() {
    }

    public Questionario_PRO_appResponseProjection(Questionario_PRO_appResponseProjection projection) {
        super(projection);
    }

    public Questionario_PRO_appResponseProjection(List<Questionario_PRO_appResponseProjection> projections) {
        super(projections);
    }

    public Questionario_PRO_appResponseProjection all$() {
        return all$(3);
    }

    public Questionario_PRO_appResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.alert_obbligatoria1();
        this.alert_obbligatoria2();
        this.codice_interno_i();
        this.codice_interno_p();
        this.confermato();
        this.data_compilazione();
        this.domanda_obblig_ids();
        this.domanda_risp_ids();
        this.domande_totali();
        this.filtro_classe();
        this.i_filtro_classe();
        this.intervallo_compil_mesi();
        this.mesi_trascorsi();
        this.p_filtro_classe();
        this.parametri_personali();
        this.questionario();
        this.risposte_date();
        this.risposte_mancanti();
        this.studi_ids();
        this.studi_ids_b();
        this.studi_ids_i();
        this.studi_ids_p();
        this.studi_ids_r();
        this.studio_questionario();
        if (projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.QuestionarioPageResponseProjection.questionario____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Questionario_PRO_appResponseProjection.QuestionarioPageResponseProjection.questionario____associables", projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.QuestionarioPageResponseProjection.questionario____associables", 0) + 1);
            this.questionario____associables(new QuestionarioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.QuestionarioPageResponseProjection.questionario____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.QuestionarioResponseProjection.questionario_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Questionario_PRO_appResponseProjection.QuestionarioResponseProjection.questionario_", projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.QuestionarioResponseProjection.questionario_", 0) + 1);
            this.questionario_(new QuestionarioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.QuestionarioResponseProjection.questionario_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.RispostaPageResponseProjection.risposta_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Questionario_PRO_appResponseProjection.RispostaPageResponseProjection.risposta_", projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.RispostaPageResponseProjection.risposta_", 0) + 1);
            this.risposta_(new RispostaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.RispostaPageResponseProjection.risposta_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Questionario_PRO_appResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario____associables", projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario____associables", 0) + 1);
            this.studio_questionario____associables(new Studio_questionarioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.Studio_questionarioResponseProjection.studio_questionario_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Questionario_PRO_appResponseProjection.Studio_questionarioResponseProjection.studio_questionario_", projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.Studio_questionarioResponseProjection.studio_questionario_", 0) + 1);
            this.studio_questionario_(new Studio_questionarioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.Studio_questionarioResponseProjection.studio_questionario_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.P_PazienteResponseProjection.p_Paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Questionario_PRO_appResponseProjection.P_PazienteResponseProjection.p_Paziente_", projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.P_PazienteResponseProjection.p_Paziente_", 0) + 1);
            this.p_Paziente_(new P_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.P_PazienteResponseProjection.p_Paziente_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Questionario_PRO_appResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Questionario_PRO_appResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public Questionario_PRO_appResponseProjection _clientId() {
        return _clientId(null);
    }

    public Questionario_PRO_appResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection _id() {
        return _id(null);
    }

    public Questionario_PRO_appResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection alert_obbligatoria1() {
        return alert_obbligatoria1(null);
    }

    public Questionario_PRO_appResponseProjection alert_obbligatoria1(String alias) {
        add$(new GraphQLResponseField("alert_obbligatoria1").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection alert_obbligatoria2() {
        return alert_obbligatoria2(null);
    }

    public Questionario_PRO_appResponseProjection alert_obbligatoria2(String alias) {
        add$(new GraphQLResponseField("alert_obbligatoria2").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection codice_interno_i() {
        return codice_interno_i(null);
    }

    public Questionario_PRO_appResponseProjection codice_interno_i(String alias) {
        add$(new GraphQLResponseField("codice_interno_i").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection codice_interno_p() {
        return codice_interno_p(null);
    }

    public Questionario_PRO_appResponseProjection codice_interno_p(String alias) {
        add$(new GraphQLResponseField("codice_interno_p").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection confermato() {
        return confermato(null);
    }

    public Questionario_PRO_appResponseProjection confermato(String alias) {
        add$(new GraphQLResponseField("confermato").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection data_compilazione() {
        return data_compilazione(null);
    }

    public Questionario_PRO_appResponseProjection data_compilazione(String alias) {
        add$(new GraphQLResponseField("data_compilazione").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection domanda_obblig_ids() {
        return domanda_obblig_ids(null);
    }

    public Questionario_PRO_appResponseProjection domanda_obblig_ids(String alias) {
        add$(new GraphQLResponseField("domanda_obblig_ids").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection domanda_risp_ids() {
        return domanda_risp_ids(null);
    }

    public Questionario_PRO_appResponseProjection domanda_risp_ids(String alias) {
        add$(new GraphQLResponseField("domanda_risp_ids").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection domande_totali() {
        return domande_totali(null);
    }

    public Questionario_PRO_appResponseProjection domande_totali(String alias) {
        add$(new GraphQLResponseField("domande_totali").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection filtro_classe() {
        return filtro_classe(null);
    }

    public Questionario_PRO_appResponseProjection filtro_classe(String alias) {
        add$(new GraphQLResponseField("filtro_classe").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection i_filtro_classe() {
        return i_filtro_classe(null);
    }

    public Questionario_PRO_appResponseProjection i_filtro_classe(String alias) {
        add$(new GraphQLResponseField("i_filtro_classe").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection intervallo_compil_mesi() {
        return intervallo_compil_mesi(null);
    }

    public Questionario_PRO_appResponseProjection intervallo_compil_mesi(String alias) {
        add$(new GraphQLResponseField("intervallo_compil_mesi").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection mesi_trascorsi() {
        return mesi_trascorsi(null);
    }

    public Questionario_PRO_appResponseProjection mesi_trascorsi(String alias) {
        add$(new GraphQLResponseField("mesi_trascorsi").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection p_filtro_classe() {
        return p_filtro_classe(null);
    }

    public Questionario_PRO_appResponseProjection p_filtro_classe(String alias) {
        add$(new GraphQLResponseField("p_filtro_classe").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection parametri_personali() {
        return parametri_personali(null);
    }

    public Questionario_PRO_appResponseProjection parametri_personali(String alias) {
        add$(new GraphQLResponseField("parametri_personali").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection questionario() {
        return questionario(null);
    }

    public Questionario_PRO_appResponseProjection questionario(String alias) {
        add$(new GraphQLResponseField("questionario").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection risposte_date() {
        return risposte_date(null);
    }

    public Questionario_PRO_appResponseProjection risposte_date(String alias) {
        add$(new GraphQLResponseField("risposte_date").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection risposte_mancanti() {
        return risposte_mancanti(null);
    }

    public Questionario_PRO_appResponseProjection risposte_mancanti(String alias) {
        add$(new GraphQLResponseField("risposte_mancanti").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection studi_ids() {
        return studi_ids(null);
    }

    public Questionario_PRO_appResponseProjection studi_ids(String alias) {
        add$(new GraphQLResponseField("studi_ids").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection studi_ids_b() {
        return studi_ids_b(null);
    }

    public Questionario_PRO_appResponseProjection studi_ids_b(String alias) {
        add$(new GraphQLResponseField("studi_ids_b").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection studi_ids_i() {
        return studi_ids_i(null);
    }

    public Questionario_PRO_appResponseProjection studi_ids_i(String alias) {
        add$(new GraphQLResponseField("studi_ids_i").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection studi_ids_p() {
        return studi_ids_p(null);
    }

    public Questionario_PRO_appResponseProjection studi_ids_p(String alias) {
        add$(new GraphQLResponseField("studi_ids_p").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection studi_ids_r() {
        return studi_ids_r(null);
    }

    public Questionario_PRO_appResponseProjection studi_ids_r(String alias) {
        add$(new GraphQLResponseField("studi_ids_r").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection studio_questionario() {
        return studio_questionario(null);
    }

    public Questionario_PRO_appResponseProjection studio_questionario(String alias) {
        add$(new GraphQLResponseField("studio_questionario").alias(alias));
        return this;
    }

    public Questionario_PRO_appResponseProjection questionario____associables(QuestionarioPageResponseProjection subProjection) {
        return questionario____associables((String)null, subProjection);
    }

    public Questionario_PRO_appResponseProjection questionario____associables(String alias, QuestionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Questionario_PRO_appResponseProjection questionario____associables(Questionario_PRO_appQuestionario____associablesParametrizedInput input, QuestionarioPageResponseProjection subProjection) {
        return questionario____associables(null, input, subProjection);
    }

    public Questionario_PRO_appResponseProjection questionario____associables(String alias, Questionario_PRO_appQuestionario____associablesParametrizedInput input, QuestionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Questionario_PRO_appResponseProjection questionario_(QuestionarioResponseProjection subProjection) {
        return questionario_(null, subProjection);
    }

    public Questionario_PRO_appResponseProjection questionario_(String alias, QuestionarioResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario_").alias(alias).projection(subProjection));
        return this;
    }

    public Questionario_PRO_appResponseProjection risposta_(RispostaPageResponseProjection subProjection) {
        return risposta_((String)null, subProjection);
    }

    public Questionario_PRO_appResponseProjection risposta_(String alias, RispostaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("risposta_").alias(alias).projection(subProjection));
        return this;
    }

    public Questionario_PRO_appResponseProjection risposta_(Questionario_PRO_appRisposta_ParametrizedInput input, RispostaPageResponseProjection subProjection) {
        return risposta_(null, input, subProjection);
    }

    public Questionario_PRO_appResponseProjection risposta_(String alias, Questionario_PRO_appRisposta_ParametrizedInput input, RispostaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("risposta_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Questionario_PRO_appResponseProjection studio_questionario____associables(Studio_questionarioPageResponseProjection subProjection) {
        return studio_questionario____associables((String)null, subProjection);
    }

    public Questionario_PRO_appResponseProjection studio_questionario____associables(String alias, Studio_questionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_questionario____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Questionario_PRO_appResponseProjection studio_questionario____associables(Questionario_PRO_appStudio_questionario____associablesParametrizedInput input, Studio_questionarioPageResponseProjection subProjection) {
        return studio_questionario____associables(null, input, subProjection);
    }

    public Questionario_PRO_appResponseProjection studio_questionario____associables(String alias, Questionario_PRO_appStudio_questionario____associablesParametrizedInput input, Studio_questionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_questionario____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Questionario_PRO_appResponseProjection studio_questionario_(Studio_questionarioResponseProjection subProjection) {
        return studio_questionario_(null, subProjection);
    }

    public Questionario_PRO_appResponseProjection studio_questionario_(String alias, Studio_questionarioResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_questionario_").alias(alias).projection(subProjection));
        return this;
    }

    public Questionario_PRO_appResponseProjection p_Paziente_(P_PazienteResponseProjection subProjection) {
        return p_Paziente_(null, subProjection);
    }

    public Questionario_PRO_appResponseProjection p_Paziente_(String alias, P_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("p_Paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Questionario_PRO_appResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public Questionario_PRO_appResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Questionario_PRO_appResponseProjection typename() {
        return typename(null);
    }

    public Questionario_PRO_appResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Questionario_PRO_appResponseProjection deepCopy$() {
        return new Questionario_PRO_appResponseProjection(this);
    }


}
