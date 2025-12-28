package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for P_Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class P_PazienteResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public P_PazienteResponseProjection() {
    }

    public P_PazienteResponseProjection(P_PazienteResponseProjection projection) {
        super(projection);
    }

    public P_PazienteResponseProjection(List<P_PazienteResponseProjection> projections) {
        super(projections);
    }

    public P_PazienteResponseProjection all$() {
        return all$(3);
    }

    public P_PazienteResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.altezza();
        this.codice_centro();
        this.codice_interno();
        this.importato();
        this.password_pro();
        this.sessione_pro();
        this.studi_pro_abilitati();
        this.token_notifiche_pro();
        this.username_pro();
        if (projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.CentroPageResponseProjection.centro____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("P_PazienteResponseProjection.CentroPageResponseProjection.centro____associables", projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.CentroPageResponseProjection.centro____associables", 0) + 1);
            this.centro____associables(new CentroPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.CentroPageResponseProjection.centro____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.CentroResponseProjection.centro_", 0) <= maxDepth) {
            projectionDepthOnFields.put("P_PazienteResponseProjection.CentroResponseProjection.centro_", projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.CentroResponseProjection.centro_", 0) + 1);
            this.centro_(new CentroResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.CentroResponseProjection.centro_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.Questionario_PRO_appPageResponseProjection.questionario_PRO_app_", 0) <= maxDepth) {
            projectionDepthOnFields.put("P_PazienteResponseProjection.Questionario_PRO_appPageResponseProjection.questionario_PRO_app_", projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.Questionario_PRO_appPageResponseProjection.questionario_PRO_app_", 0) + 1);
            this.questionario_PRO_app_(new Questionario_PRO_appPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.Questionario_PRO_appPageResponseProjection.questionario_PRO_app_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("P_PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario____associables", projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario____associables", 0) + 1);
            this.studio_questionario____associables(new Studio_questionarioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario_", 0) <= maxDepth) {
            projectionDepthOnFields.put("P_PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario_", projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario_", 0) + 1);
            this.studio_questionario_(new Studio_questionarioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("P_PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario_", 0)));
        }
        this.typename();
        return this;
    }

    public P_PazienteResponseProjection _clientId() {
        return _clientId(null);
    }

    public P_PazienteResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public P_PazienteResponseProjection _id() {
        return _id(null);
    }

    public P_PazienteResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public P_PazienteResponseProjection altezza() {
        return altezza(null);
    }

    public P_PazienteResponseProjection altezza(String alias) {
        add$(new GraphQLResponseField("altezza").alias(alias));
        return this;
    }

    public P_PazienteResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public P_PazienteResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public P_PazienteResponseProjection codice_interno() {
        return codice_interno(null);
    }

    public P_PazienteResponseProjection codice_interno(String alias) {
        add$(new GraphQLResponseField("codice_interno").alias(alias));
        return this;
    }

    public P_PazienteResponseProjection importato() {
        return importato(null);
    }

    public P_PazienteResponseProjection importato(String alias) {
        add$(new GraphQLResponseField("importato").alias(alias));
        return this;
    }

    public P_PazienteResponseProjection password_pro() {
        return password_pro(null);
    }

    public P_PazienteResponseProjection password_pro(String alias) {
        add$(new GraphQLResponseField("password_pro").alias(alias));
        return this;
    }

    public P_PazienteResponseProjection sessione_pro() {
        return sessione_pro(null);
    }

    public P_PazienteResponseProjection sessione_pro(String alias) {
        add$(new GraphQLResponseField("sessione_pro").alias(alias));
        return this;
    }

    public P_PazienteResponseProjection studi_pro_abilitati() {
        return studi_pro_abilitati(null);
    }

    public P_PazienteResponseProjection studi_pro_abilitati(String alias) {
        add$(new GraphQLResponseField("studi_pro_abilitati").alias(alias));
        return this;
    }

    public P_PazienteResponseProjection token_notifiche_pro() {
        return token_notifiche_pro(null);
    }

    public P_PazienteResponseProjection token_notifiche_pro(String alias) {
        add$(new GraphQLResponseField("token_notifiche_pro").alias(alias));
        return this;
    }

    public P_PazienteResponseProjection username_pro() {
        return username_pro(null);
    }

    public P_PazienteResponseProjection username_pro(String alias) {
        add$(new GraphQLResponseField("username_pro").alias(alias));
        return this;
    }

    public P_PazienteResponseProjection centro____associables(CentroPageResponseProjection subProjection) {
        return centro____associables((String)null, subProjection);
    }

    public P_PazienteResponseProjection centro____associables(String alias, CentroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("centro____associables").alias(alias).projection(subProjection));
        return this;
    }

    public P_PazienteResponseProjection centro____associables(P_PazienteCentro____associablesParametrizedInput input, CentroPageResponseProjection subProjection) {
        return centro____associables(null, input, subProjection);
    }

    public P_PazienteResponseProjection centro____associables(String alias, P_PazienteCentro____associablesParametrizedInput input, CentroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("centro____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public P_PazienteResponseProjection centro_(CentroResponseProjection subProjection) {
        return centro_(null, subProjection);
    }

    public P_PazienteResponseProjection centro_(String alias, CentroResponseProjection subProjection) {
        add$(new GraphQLResponseField("centro_").alias(alias).projection(subProjection));
        return this;
    }

    public P_PazienteResponseProjection questionario_PRO_app_(Questionario_PRO_appPageResponseProjection subProjection) {
        return questionario_PRO_app_((String)null, subProjection);
    }

    public P_PazienteResponseProjection questionario_PRO_app_(String alias, Questionario_PRO_appPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario_PRO_app_").alias(alias).projection(subProjection));
        return this;
    }

    public P_PazienteResponseProjection questionario_PRO_app_(P_PazienteQuestionario_PRO_app_ParametrizedInput input, Questionario_PRO_appPageResponseProjection subProjection) {
        return questionario_PRO_app_(null, input, subProjection);
    }

    public P_PazienteResponseProjection questionario_PRO_app_(String alias, P_PazienteQuestionario_PRO_app_ParametrizedInput input, Questionario_PRO_appPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario_PRO_app_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public P_PazienteResponseProjection studio_questionario____associables(Studio_questionarioPageResponseProjection subProjection) {
        return studio_questionario____associables((String)null, subProjection);
    }

    public P_PazienteResponseProjection studio_questionario____associables(String alias, Studio_questionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_questionario____associables").alias(alias).projection(subProjection));
        return this;
    }

    public P_PazienteResponseProjection studio_questionario____associables(P_PazienteStudio_questionario____associablesParametrizedInput input, Studio_questionarioPageResponseProjection subProjection) {
        return studio_questionario____associables(null, input, subProjection);
    }

    public P_PazienteResponseProjection studio_questionario____associables(String alias, P_PazienteStudio_questionario____associablesParametrizedInput input, Studio_questionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_questionario____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public P_PazienteResponseProjection studio_questionario_(Studio_questionarioPageResponseProjection subProjection) {
        return studio_questionario_((String)null, subProjection);
    }

    public P_PazienteResponseProjection studio_questionario_(String alias, Studio_questionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_questionario_").alias(alias).projection(subProjection));
        return this;
    }

    public P_PazienteResponseProjection studio_questionario_(P_PazienteStudio_questionario_ParametrizedInput input, Studio_questionarioPageResponseProjection subProjection) {
        return studio_questionario_(null, input, subProjection);
    }

    public P_PazienteResponseProjection studio_questionario_(String alias, P_PazienteStudio_questionario_ParametrizedInput input, Studio_questionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_questionario_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public P_PazienteResponseProjection typename() {
        return typename(null);
    }

    public P_PazienteResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public P_PazienteResponseProjection deepCopy$() {
        return new P_PazienteResponseProjection(this);
    }


}
