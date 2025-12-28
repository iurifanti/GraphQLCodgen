package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Esame_strumentale
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Esame_strumentaleResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Esame_strumentaleResponseProjection() {
    }

    public Esame_strumentaleResponseProjection(Esame_strumentaleResponseProjection projection) {
        super(projection);
    }

    public Esame_strumentaleResponseProjection(List<Esame_strumentaleResponseProjection> projections) {
        super(projections);
    }

    public Esame_strumentaleResponseProjection all$() {
        return all$(3);
    }

    public Esame_strumentaleResponseProjection all$(int maxDepth) {
        this._clientId();
        this.IQR();
        this._id();
        this.altro_esame();
        this.bmd_colonna();
        this.bmd_femore();
        this.cap_iqr();
        this.cap_mediano();
        this.classe_rischio_hpv();
        this.codice_centro();
        this.data();
        this.esame();
        this.esito();
        this.genotipi_hpv();
        this.i_paziente();
        this.metavir();
        this.patologico();
        this.paziente_ok();
        this.stifness();
        this.success_rate();
        this.t_score_colonna();
        this.t_score_femore();
        this.z_score_colonna();
        this.z_score_femore();
        if (projectionDepthOnFields.getOrDefault("Esame_strumentaleResponseProjection.PatologiaPageResponseProjection.esito_biopsia___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Esame_strumentaleResponseProjection.PatologiaPageResponseProjection.esito_biopsia___associables", projectionDepthOnFields.getOrDefault("Esame_strumentaleResponseProjection.PatologiaPageResponseProjection.esito_biopsia___associables", 0) + 1);
            this.esito_biopsia___associables(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Esame_strumentaleResponseProjection.PatologiaPageResponseProjection.esito_biopsia___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Esame_strumentaleResponseProjection.PatologiaPageResponseProjection.esito_biopsia", 0) <= maxDepth) {
            projectionDepthOnFields.put("Esame_strumentaleResponseProjection.PatologiaPageResponseProjection.esito_biopsia", projectionDepthOnFields.getOrDefault("Esame_strumentaleResponseProjection.PatologiaPageResponseProjection.esito_biopsia", 0) + 1);
            this.esito_biopsia(new PatologiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Esame_strumentaleResponseProjection.PatologiaPageResponseProjection.esito_biopsia", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Esame_strumentaleResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Esame_strumentaleResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("Esame_strumentaleResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Esame_strumentaleResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public Esame_strumentaleResponseProjection _clientId() {
        return _clientId(null);
    }

    public Esame_strumentaleResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection IQR() {
        return IQR(null);
    }

    public Esame_strumentaleResponseProjection IQR(String alias) {
        add$(new GraphQLResponseField("IQR").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection _id() {
        return _id(null);
    }

    public Esame_strumentaleResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection altro_esame() {
        return altro_esame(null);
    }

    public Esame_strumentaleResponseProjection altro_esame(String alias) {
        add$(new GraphQLResponseField("altro_esame").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection bmd_colonna() {
        return bmd_colonna(null);
    }

    public Esame_strumentaleResponseProjection bmd_colonna(String alias) {
        add$(new GraphQLResponseField("bmd_colonna").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection bmd_femore() {
        return bmd_femore(null);
    }

    public Esame_strumentaleResponseProjection bmd_femore(String alias) {
        add$(new GraphQLResponseField("bmd_femore").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection cap_iqr() {
        return cap_iqr(null);
    }

    public Esame_strumentaleResponseProjection cap_iqr(String alias) {
        add$(new GraphQLResponseField("cap_iqr").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection cap_mediano() {
        return cap_mediano(null);
    }

    public Esame_strumentaleResponseProjection cap_mediano(String alias) {
        add$(new GraphQLResponseField("cap_mediano").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection classe_rischio_hpv() {
        return classe_rischio_hpv(null);
    }

    public Esame_strumentaleResponseProjection classe_rischio_hpv(String alias) {
        add$(new GraphQLResponseField("classe_rischio_hpv").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public Esame_strumentaleResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection data() {
        return data(null);
    }

    public Esame_strumentaleResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection esame() {
        return esame(null);
    }

    public Esame_strumentaleResponseProjection esame(String alias) {
        add$(new GraphQLResponseField("esame").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection esito() {
        return esito(null);
    }

    public Esame_strumentaleResponseProjection esito(String alias) {
        add$(new GraphQLResponseField("esito").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection genotipi_hpv() {
        return genotipi_hpv(null);
    }

    public Esame_strumentaleResponseProjection genotipi_hpv(String alias) {
        add$(new GraphQLResponseField("genotipi_hpv").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection i_paziente() {
        return i_paziente(null);
    }

    public Esame_strumentaleResponseProjection i_paziente(String alias) {
        add$(new GraphQLResponseField("i_paziente").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection metavir() {
        return metavir(null);
    }

    public Esame_strumentaleResponseProjection metavir(String alias) {
        add$(new GraphQLResponseField("metavir").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection patologico() {
        return patologico(null);
    }

    public Esame_strumentaleResponseProjection patologico(String alias) {
        add$(new GraphQLResponseField("patologico").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection paziente_ok() {
        return paziente_ok(null);
    }

    public Esame_strumentaleResponseProjection paziente_ok(String alias) {
        add$(new GraphQLResponseField("paziente_ok").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection stifness() {
        return stifness(null);
    }

    public Esame_strumentaleResponseProjection stifness(String alias) {
        add$(new GraphQLResponseField("stifness").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection success_rate() {
        return success_rate(null);
    }

    public Esame_strumentaleResponseProjection success_rate(String alias) {
        add$(new GraphQLResponseField("success_rate").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection t_score_colonna() {
        return t_score_colonna(null);
    }

    public Esame_strumentaleResponseProjection t_score_colonna(String alias) {
        add$(new GraphQLResponseField("t_score_colonna").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection t_score_femore() {
        return t_score_femore(null);
    }

    public Esame_strumentaleResponseProjection t_score_femore(String alias) {
        add$(new GraphQLResponseField("t_score_femore").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection z_score_colonna() {
        return z_score_colonna(null);
    }

    public Esame_strumentaleResponseProjection z_score_colonna(String alias) {
        add$(new GraphQLResponseField("z_score_colonna").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection z_score_femore() {
        return z_score_femore(null);
    }

    public Esame_strumentaleResponseProjection z_score_femore(String alias) {
        add$(new GraphQLResponseField("z_score_femore").alias(alias));
        return this;
    }

    public Esame_strumentaleResponseProjection esito_biopsia___associables(PatologiaPageResponseProjection subProjection) {
        return esito_biopsia___associables((String)null, subProjection);
    }

    public Esame_strumentaleResponseProjection esito_biopsia___associables(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("esito_biopsia___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Esame_strumentaleResponseProjection esito_biopsia___associables(Esame_strumentaleEsito_biopsia___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return esito_biopsia___associables(null, input, subProjection);
    }

    public Esame_strumentaleResponseProjection esito_biopsia___associables(String alias, Esame_strumentaleEsito_biopsia___associablesParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("esito_biopsia___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Esame_strumentaleResponseProjection esito_biopsia(PatologiaPageResponseProjection subProjection) {
        return esito_biopsia((String)null, subProjection);
    }

    public Esame_strumentaleResponseProjection esito_biopsia(String alias, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("esito_biopsia").alias(alias).projection(subProjection));
        return this;
    }

    public Esame_strumentaleResponseProjection esito_biopsia(Esame_strumentaleEsito_biopsiaParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        return esito_biopsia(null, input, subProjection);
    }

    public Esame_strumentaleResponseProjection esito_biopsia(String alias, Esame_strumentaleEsito_biopsiaParametrizedInput input, PatologiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("esito_biopsia").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Esame_strumentaleResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public Esame_strumentaleResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Esame_strumentaleResponseProjection typename() {
        return typename(null);
    }

    public Esame_strumentaleResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Esame_strumentaleResponseProjection deepCopy$() {
        return new Esame_strumentaleResponseProjection(this);
    }


}
