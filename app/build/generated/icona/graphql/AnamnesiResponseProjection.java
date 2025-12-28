package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Anamnesi
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class AnamnesiResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AnamnesiResponseProjection() {
    }

    public AnamnesiResponseProjection(AnamnesiResponseProjection projection) {
        super(projection);
    }

    public AnamnesiResponseProjection(List<AnamnesiResponseProjection> projections) {
        super(projections);
    }

    public AnamnesiResponseProjection all$() {
        return all$(3);
    }

    public AnamnesiResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.altro_luogo();
        this.altro_luogo_test_HIV();
        this.anni_fumo_pregresso();
        this.codice_centro();
        this.data_enrol();
        this.data_prima_prep();
        this.data_primo_riscontro_HIV();
        this.data_sieroconversione();
        this.data_ultima_prep();
        this.data_ultimo_test_negativo();
        this.familiarita_cardiovascolare();
        this.fumatore();
        this.infezione_acuta();
        this.paziente();
        this.prep();
        this.prep_quotidiana();
        this.scolarita();
        this.team();
        if (projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.Luogo_test_HIVPageResponseProjection.luogo_test_HIV____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("AnamnesiResponseProjection.Luogo_test_HIVPageResponseProjection.luogo_test_HIV____associables", projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.Luogo_test_HIVPageResponseProjection.luogo_test_HIV____associables", 0) + 1);
            this.luogo_test_HIV____associables(new Luogo_test_HIVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.Luogo_test_HIVPageResponseProjection.luogo_test_HIV____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.Luogo_test_HIVResponseProjection.luogo_test_HIV_", 0) <= maxDepth) {
            projectionDepthOnFields.put("AnamnesiResponseProjection.Luogo_test_HIVResponseProjection.luogo_test_HIV_", projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.Luogo_test_HIVResponseProjection.luogo_test_HIV_", 0) + 1);
            this.luogo_test_HIV_(new Luogo_test_HIVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.Luogo_test_HIVResponseProjection.luogo_test_HIV_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.Motivazione_naivePageResponseProjection.motivazione_naive___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("AnamnesiResponseProjection.Motivazione_naivePageResponseProjection.motivazione_naive___associables", projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.Motivazione_naivePageResponseProjection.motivazione_naive___associables", 0) + 1);
            this.motivazione_naive___associables(new Motivazione_naivePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.Motivazione_naivePageResponseProjection.motivazione_naive___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.Motivazione_naiveResponseProjection.motivazione_naive", 0) <= maxDepth) {
            projectionDepthOnFields.put("AnamnesiResponseProjection.Motivazione_naiveResponseProjection.motivazione_naive", projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.Motivazione_naiveResponseProjection.motivazione_naive", 0) + 1);
            this.motivazione_naive(new Motivazione_naiveResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.Motivazione_naiveResponseProjection.motivazione_naive", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.PazienteResponseProjection.Paziente_anamnesi", 0) <= maxDepth) {
            projectionDepthOnFields.put("AnamnesiResponseProjection.PazienteResponseProjection.Paziente_anamnesi", projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.PazienteResponseProjection.Paziente_anamnesi", 0) + 1);
            this.Paziente_anamnesi(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AnamnesiResponseProjection.PazienteResponseProjection.Paziente_anamnesi", 0)));
        }
        this.typename();
        return this;
    }

    public AnamnesiResponseProjection _clientId() {
        return _clientId(null);
    }

    public AnamnesiResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection _createdby() {
        return _createdby(null);
    }

    public AnamnesiResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection _createdon() {
        return _createdon(null);
    }

    public AnamnesiResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection _id() {
        return _id(null);
    }

    public AnamnesiResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public AnamnesiResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public AnamnesiResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public AnamnesiResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public AnamnesiResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection altro_luogo() {
        return altro_luogo(null);
    }

    public AnamnesiResponseProjection altro_luogo(String alias) {
        add$(new GraphQLResponseField("altro_luogo").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection altro_luogo_test_HIV() {
        return altro_luogo_test_HIV(null);
    }

    public AnamnesiResponseProjection altro_luogo_test_HIV(String alias) {
        add$(new GraphQLResponseField("altro_luogo_test_HIV").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection anni_fumo_pregresso() {
        return anni_fumo_pregresso(null);
    }

    public AnamnesiResponseProjection anni_fumo_pregresso(String alias) {
        add$(new GraphQLResponseField("anni_fumo_pregresso").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public AnamnesiResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection data_enrol() {
        return data_enrol(null);
    }

    public AnamnesiResponseProjection data_enrol(String alias) {
        add$(new GraphQLResponseField("data_enrol").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection data_prima_prep() {
        return data_prima_prep(null);
    }

    public AnamnesiResponseProjection data_prima_prep(String alias) {
        add$(new GraphQLResponseField("data_prima_prep").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection data_primo_riscontro_HIV() {
        return data_primo_riscontro_HIV(null);
    }

    public AnamnesiResponseProjection data_primo_riscontro_HIV(String alias) {
        add$(new GraphQLResponseField("data_primo_riscontro_HIV").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection data_sieroconversione() {
        return data_sieroconversione(null);
    }

    public AnamnesiResponseProjection data_sieroconversione(String alias) {
        add$(new GraphQLResponseField("data_sieroconversione").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection data_ultima_prep() {
        return data_ultima_prep(null);
    }

    public AnamnesiResponseProjection data_ultima_prep(String alias) {
        add$(new GraphQLResponseField("data_ultima_prep").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection data_ultimo_test_negativo() {
        return data_ultimo_test_negativo(null);
    }

    public AnamnesiResponseProjection data_ultimo_test_negativo(String alias) {
        add$(new GraphQLResponseField("data_ultimo_test_negativo").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection familiarita_cardiovascolare() {
        return familiarita_cardiovascolare(null);
    }

    public AnamnesiResponseProjection familiarita_cardiovascolare(String alias) {
        add$(new GraphQLResponseField("familiarita_cardiovascolare").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection fumatore() {
        return fumatore(null);
    }

    public AnamnesiResponseProjection fumatore(String alias) {
        add$(new GraphQLResponseField("fumatore").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection infezione_acuta() {
        return infezione_acuta(null);
    }

    public AnamnesiResponseProjection infezione_acuta(String alias) {
        add$(new GraphQLResponseField("infezione_acuta").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection paziente() {
        return paziente(null);
    }

    public AnamnesiResponseProjection paziente(String alias) {
        add$(new GraphQLResponseField("paziente").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection prep() {
        return prep(null);
    }

    public AnamnesiResponseProjection prep(String alias) {
        add$(new GraphQLResponseField("prep").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection prep_quotidiana() {
        return prep_quotidiana(null);
    }

    public AnamnesiResponseProjection prep_quotidiana(String alias) {
        add$(new GraphQLResponseField("prep_quotidiana").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection scolarita() {
        return scolarita(null);
    }

    public AnamnesiResponseProjection scolarita(String alias) {
        add$(new GraphQLResponseField("scolarita").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection team() {
        return team(null);
    }

    public AnamnesiResponseProjection team(String alias) {
        add$(new GraphQLResponseField("team").alias(alias));
        return this;
    }

    public AnamnesiResponseProjection luogo_test_HIV____associables(Luogo_test_HIVPageResponseProjection subProjection) {
        return luogo_test_HIV____associables((String)null, subProjection);
    }

    public AnamnesiResponseProjection luogo_test_HIV____associables(String alias, Luogo_test_HIVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("luogo_test_HIV____associables").alias(alias).projection(subProjection));
        return this;
    }

    public AnamnesiResponseProjection luogo_test_HIV____associables(AnamnesiLuogo_test_HIV____associablesParametrizedInput input, Luogo_test_HIVPageResponseProjection subProjection) {
        return luogo_test_HIV____associables(null, input, subProjection);
    }

    public AnamnesiResponseProjection luogo_test_HIV____associables(String alias, AnamnesiLuogo_test_HIV____associablesParametrizedInput input, Luogo_test_HIVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("luogo_test_HIV____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public AnamnesiResponseProjection luogo_test_HIV_(Luogo_test_HIVResponseProjection subProjection) {
        return luogo_test_HIV_(null, subProjection);
    }

    public AnamnesiResponseProjection luogo_test_HIV_(String alias, Luogo_test_HIVResponseProjection subProjection) {
        add$(new GraphQLResponseField("luogo_test_HIV_").alias(alias).projection(subProjection));
        return this;
    }

    public AnamnesiResponseProjection motivazione_naive___associables(Motivazione_naivePageResponseProjection subProjection) {
        return motivazione_naive___associables((String)null, subProjection);
    }

    public AnamnesiResponseProjection motivazione_naive___associables(String alias, Motivazione_naivePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_naive___associables").alias(alias).projection(subProjection));
        return this;
    }

    public AnamnesiResponseProjection motivazione_naive___associables(AnamnesiMotivazione_naive___associablesParametrizedInput input, Motivazione_naivePageResponseProjection subProjection) {
        return motivazione_naive___associables(null, input, subProjection);
    }

    public AnamnesiResponseProjection motivazione_naive___associables(String alias, AnamnesiMotivazione_naive___associablesParametrizedInput input, Motivazione_naivePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_naive___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public AnamnesiResponseProjection motivazione_naive(Motivazione_naiveResponseProjection subProjection) {
        return motivazione_naive(null, subProjection);
    }

    public AnamnesiResponseProjection motivazione_naive(String alias, Motivazione_naiveResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_naive").alias(alias).projection(subProjection));
        return this;
    }

    public AnamnesiResponseProjection Paziente_anamnesi(PazienteResponseProjection subProjection) {
        return Paziente_anamnesi(null, subProjection);
    }

    public AnamnesiResponseProjection Paziente_anamnesi(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("Paziente_anamnesi").alias(alias).projection(subProjection));
        return this;
    }

    public AnamnesiResponseProjection typename() {
        return typename(null);
    }

    public AnamnesiResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public AnamnesiResponseProjection deepCopy$() {
        return new AnamnesiResponseProjection(this);
    }


}
