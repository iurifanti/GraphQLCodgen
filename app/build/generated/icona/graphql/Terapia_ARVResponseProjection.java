package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Terapia_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Terapia_ARVResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Terapia_ARVResponseProjection() {
    }

    public Terapia_ARVResponseProjection(Terapia_ARVResponseProjection projection) {
        super(projection);
    }

    public Terapia_ARVResponseProjection(List<Terapia_ARVResponseProjection> projections) {
        super(projections);
    }

    public Terapia_ARVResponseProjection all$() {
        return all$(3);
    }

    public Terapia_ARVResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.altro_farmaco();
        this.altro_inizio_terapia();
        this.altro_variazione_terapia();
        this.anno_generico();
        this.booster();
        this.codice_centro();
        this.data_fine();
        this.data_inizio();
        this.disponibile_generico();
        this.doppio_cieco();
        this.dosaggi_count();
        this.farmaco_ATC();
        this.filtro_farmaco();
        this.generico();
        this.genotipo_guidata();
        this.long_acting();
        this.motivazione_fine_ARV_princ_();
        this.motivazione_fine_ARV_sec_();
        this.motivazione_inizio_ARV_();
        this.nome_farmaco();
        this.nome_gruppo();
        this.nome_trial();
        this.object_title();
        this.once();
        this.user_team();
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.DosaggioPageResponseProjection.dosaggio____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.DosaggioPageResponseProjection.dosaggio____associables", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.DosaggioPageResponseProjection.dosaggio____associables", 0) + 1);
            this.dosaggio____associables(new DosaggioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.DosaggioPageResponseProjection.dosaggio____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.DosaggioResponseProjection.dosaggio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.DosaggioResponseProjection.dosaggio_", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.DosaggioResponseProjection.dosaggio_", 0) + 1);
            this.dosaggio_(new DosaggioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.DosaggioResponseProjection.dosaggio_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Farmaco_ARVPageResponseProjection.farmaco_ARV___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.Farmaco_ARVPageResponseProjection.farmaco_ARV___associables", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Farmaco_ARVPageResponseProjection.farmaco_ARV___associables", 0) + 1);
            this.farmaco_ARV___associables(new Farmaco_ARVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Farmaco_ARVPageResponseProjection.farmaco_ARV___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Farmaco_ARVResponseProjection.farmaco_ARV", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.Farmaco_ARVResponseProjection.farmaco_ARV", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Farmaco_ARVResponseProjection.farmaco_ARV", 0) + 1);
            this.farmaco_ARV(new Farmaco_ARVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Farmaco_ARVResponseProjection.farmaco_ARV", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_fine_ARVPageResponseProjection.motivazione_fine_ARV_princ___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.Motivazione_fine_ARVPageResponseProjection.motivazione_fine_ARV_princ___associables", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_fine_ARVPageResponseProjection.motivazione_fine_ARV_princ___associables", 0) + 1);
            this.motivazione_fine_ARV_princ___associables(new Motivazione_fine_ARVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_fine_ARVPageResponseProjection.motivazione_fine_ARV_princ___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_fine_ARVResponseProjection.motivazione_fine_ARV_princ", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.Motivazione_fine_ARVResponseProjection.motivazione_fine_ARV_princ", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_fine_ARVResponseProjection.motivazione_fine_ARV_princ", 0) + 1);
            this.motivazione_fine_ARV_princ(new Motivazione_fine_ARVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_fine_ARVResponseProjection.motivazione_fine_ARV_princ", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_fine_ARVPageResponseProjection.motivazione_fine_ARV_sec___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.Motivazione_fine_ARVPageResponseProjection.motivazione_fine_ARV_sec___associables", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_fine_ARVPageResponseProjection.motivazione_fine_ARV_sec___associables", 0) + 1);
            this.motivazione_fine_ARV_sec___associables(new Motivazione_fine_ARVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_fine_ARVPageResponseProjection.motivazione_fine_ARV_sec___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_fine_ARVResponseProjection.motivazione_fine_ARV_sec", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.Motivazione_fine_ARVResponseProjection.motivazione_fine_ARV_sec", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_fine_ARVResponseProjection.motivazione_fine_ARV_sec", 0) + 1);
            this.motivazione_fine_ARV_sec(new Motivazione_fine_ARVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_fine_ARVResponseProjection.motivazione_fine_ARV_sec", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_inizio_ARVPageResponseProjection.motivazione_inizio_ARV___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.Motivazione_inizio_ARVPageResponseProjection.motivazione_inizio_ARV___associables", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_inizio_ARVPageResponseProjection.motivazione_inizio_ARV___associables", 0) + 1);
            this.motivazione_inizio_ARV___associables(new Motivazione_inizio_ARVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_inizio_ARVPageResponseProjection.motivazione_inizio_ARV___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_inizio_ARVResponseProjection.motivazione_inizio_ARV", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.Motivazione_inizio_ARVResponseProjection.motivazione_inizio_ARV", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_inizio_ARVResponseProjection.motivazione_inizio_ARV", 0) + 1);
            this.motivazione_inizio_ARV(new Motivazione_inizio_ARVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.Motivazione_inizio_ARVResponseProjection.motivazione_inizio_ARV", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.WarningPageResponseProjection.warning____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.WarningPageResponseProjection.warning____associables", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.WarningPageResponseProjection.warning____associables", 0) + 1);
            this.warning____associables(new WarningPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.WarningPageResponseProjection.warning____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.WarningPageResponseProjection.warning_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.WarningPageResponseProjection.warning_", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.WarningPageResponseProjection.warning_", 0) + 1);
            this.warning_(new WarningPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.WarningPageResponseProjection.warning_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.PazienteResponseProjection.Paziente_terapia_ARV", 0) <= maxDepth) {
            projectionDepthOnFields.put("Terapia_ARVResponseProjection.PazienteResponseProjection.Paziente_terapia_ARV", projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.PazienteResponseProjection.Paziente_terapia_ARV", 0) + 1);
            this.Paziente_terapia_ARV(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Terapia_ARVResponseProjection.PazienteResponseProjection.Paziente_terapia_ARV", 0)));
        }
        this.typename();
        return this;
    }

    public Terapia_ARVResponseProjection _clientId() {
        return _clientId(null);
    }

    public Terapia_ARVResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection _createdby() {
        return _createdby(null);
    }

    public Terapia_ARVResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection _createdon() {
        return _createdon(null);
    }

    public Terapia_ARVResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection _id() {
        return _id(null);
    }

    public Terapia_ARVResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Terapia_ARVResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Terapia_ARVResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Terapia_ARVResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Terapia_ARVResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection altro_farmaco() {
        return altro_farmaco(null);
    }

    public Terapia_ARVResponseProjection altro_farmaco(String alias) {
        add$(new GraphQLResponseField("altro_farmaco").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection altro_inizio_terapia() {
        return altro_inizio_terapia(null);
    }

    public Terapia_ARVResponseProjection altro_inizio_terapia(String alias) {
        add$(new GraphQLResponseField("altro_inizio_terapia").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection altro_variazione_terapia() {
        return altro_variazione_terapia(null);
    }

    public Terapia_ARVResponseProjection altro_variazione_terapia(String alias) {
        add$(new GraphQLResponseField("altro_variazione_terapia").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection anno_generico() {
        return anno_generico(null);
    }

    public Terapia_ARVResponseProjection anno_generico(String alias) {
        add$(new GraphQLResponseField("anno_generico").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection booster() {
        return booster(null);
    }

    public Terapia_ARVResponseProjection booster(String alias) {
        add$(new GraphQLResponseField("booster").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public Terapia_ARVResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection data_fine() {
        return data_fine(null);
    }

    public Terapia_ARVResponseProjection data_fine(String alias) {
        add$(new GraphQLResponseField("data_fine").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection data_inizio() {
        return data_inizio(null);
    }

    public Terapia_ARVResponseProjection data_inizio(String alias) {
        add$(new GraphQLResponseField("data_inizio").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection disponibile_generico() {
        return disponibile_generico(null);
    }

    public Terapia_ARVResponseProjection disponibile_generico(String alias) {
        add$(new GraphQLResponseField("disponibile_generico").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection doppio_cieco() {
        return doppio_cieco(null);
    }

    public Terapia_ARVResponseProjection doppio_cieco(String alias) {
        add$(new GraphQLResponseField("doppio_cieco").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection dosaggi_count() {
        return dosaggi_count(null);
    }

    public Terapia_ARVResponseProjection dosaggi_count(String alias) {
        add$(new GraphQLResponseField("dosaggi_count").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection farmaco_ATC() {
        return farmaco_ATC(null);
    }

    public Terapia_ARVResponseProjection farmaco_ATC(String alias) {
        add$(new GraphQLResponseField("farmaco_ATC").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection filtro_farmaco() {
        return filtro_farmaco(null);
    }

    public Terapia_ARVResponseProjection filtro_farmaco(String alias) {
        add$(new GraphQLResponseField("filtro_farmaco").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection generico() {
        return generico(null);
    }

    public Terapia_ARVResponseProjection generico(String alias) {
        add$(new GraphQLResponseField("generico").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection genotipo_guidata() {
        return genotipo_guidata(null);
    }

    public Terapia_ARVResponseProjection genotipo_guidata(String alias) {
        add$(new GraphQLResponseField("genotipo_guidata").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection long_acting() {
        return long_acting(null);
    }

    public Terapia_ARVResponseProjection long_acting(String alias) {
        add$(new GraphQLResponseField("long_acting").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_princ_() {
        return motivazione_fine_ARV_princ_(null);
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_princ_(String alias) {
        add$(new GraphQLResponseField("motivazione_fine_ARV_princ_").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_sec_() {
        return motivazione_fine_ARV_sec_(null);
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_sec_(String alias) {
        add$(new GraphQLResponseField("motivazione_fine_ARV_sec_").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection motivazione_inizio_ARV_() {
        return motivazione_inizio_ARV_(null);
    }

    public Terapia_ARVResponseProjection motivazione_inizio_ARV_(String alias) {
        add$(new GraphQLResponseField("motivazione_inizio_ARV_").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection nome_farmaco() {
        return nome_farmaco(null);
    }

    public Terapia_ARVResponseProjection nome_farmaco(String alias) {
        add$(new GraphQLResponseField("nome_farmaco").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection nome_gruppo() {
        return nome_gruppo(null);
    }

    public Terapia_ARVResponseProjection nome_gruppo(String alias) {
        add$(new GraphQLResponseField("nome_gruppo").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection nome_trial() {
        return nome_trial(null);
    }

    public Terapia_ARVResponseProjection nome_trial(String alias) {
        add$(new GraphQLResponseField("nome_trial").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection object_title() {
        return object_title(null);
    }

    public Terapia_ARVResponseProjection object_title(String alias) {
        add$(new GraphQLResponseField("object_title").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection once() {
        return once(null);
    }

    public Terapia_ARVResponseProjection once(String alias) {
        add$(new GraphQLResponseField("once").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection user_team() {
        return user_team(null);
    }

    public Terapia_ARVResponseProjection user_team(String alias) {
        add$(new GraphQLResponseField("user_team").alias(alias));
        return this;
    }

    public Terapia_ARVResponseProjection dosaggio____associables(DosaggioPageResponseProjection subProjection) {
        return dosaggio____associables((String)null, subProjection);
    }

    public Terapia_ARVResponseProjection dosaggio____associables(String alias, DosaggioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("dosaggio____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection dosaggio____associables(Terapia_ARVDosaggio____associablesParametrizedInput input, DosaggioPageResponseProjection subProjection) {
        return dosaggio____associables(null, input, subProjection);
    }

    public Terapia_ARVResponseProjection dosaggio____associables(String alias, Terapia_ARVDosaggio____associablesParametrizedInput input, DosaggioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("dosaggio____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection dosaggio_(DosaggioResponseProjection subProjection) {
        return dosaggio_(null, subProjection);
    }

    public Terapia_ARVResponseProjection dosaggio_(String alias, DosaggioResponseProjection subProjection) {
        add$(new GraphQLResponseField("dosaggio_").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection farmaco_ARV___associables(Farmaco_ARVPageResponseProjection subProjection) {
        return farmaco_ARV___associables((String)null, subProjection);
    }

    public Terapia_ARVResponseProjection farmaco_ARV___associables(String alias, Farmaco_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_ARV___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection farmaco_ARV___associables(Terapia_ARVFarmaco_ARV___associablesParametrizedInput input, Farmaco_ARVPageResponseProjection subProjection) {
        return farmaco_ARV___associables(null, input, subProjection);
    }

    public Terapia_ARVResponseProjection farmaco_ARV___associables(String alias, Terapia_ARVFarmaco_ARV___associablesParametrizedInput input, Farmaco_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_ARV___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection farmaco_ARV(Farmaco_ARVResponseProjection subProjection) {
        return farmaco_ARV(null, subProjection);
    }

    public Terapia_ARVResponseProjection farmaco_ARV(String alias, Farmaco_ARVResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_ARV").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_princ___associables(Motivazione_fine_ARVPageResponseProjection subProjection) {
        return motivazione_fine_ARV_princ___associables((String)null, subProjection);
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_princ___associables(String alias, Motivazione_fine_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_fine_ARV_princ___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_princ___associables(Terapia_ARVMotivazione_fine_ARV_princ___associablesParametrizedInput input, Motivazione_fine_ARVPageResponseProjection subProjection) {
        return motivazione_fine_ARV_princ___associables(null, input, subProjection);
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_princ___associables(String alias, Terapia_ARVMotivazione_fine_ARV_princ___associablesParametrizedInput input, Motivazione_fine_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_fine_ARV_princ___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_princ(Motivazione_fine_ARVResponseProjection subProjection) {
        return motivazione_fine_ARV_princ(null, subProjection);
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_princ(String alias, Motivazione_fine_ARVResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_fine_ARV_princ").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_sec___associables(Motivazione_fine_ARVPageResponseProjection subProjection) {
        return motivazione_fine_ARV_sec___associables((String)null, subProjection);
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_sec___associables(String alias, Motivazione_fine_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_fine_ARV_sec___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_sec___associables(Terapia_ARVMotivazione_fine_ARV_sec___associablesParametrizedInput input, Motivazione_fine_ARVPageResponseProjection subProjection) {
        return motivazione_fine_ARV_sec___associables(null, input, subProjection);
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_sec___associables(String alias, Terapia_ARVMotivazione_fine_ARV_sec___associablesParametrizedInput input, Motivazione_fine_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_fine_ARV_sec___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_sec(Motivazione_fine_ARVResponseProjection subProjection) {
        return motivazione_fine_ARV_sec(null, subProjection);
    }

    public Terapia_ARVResponseProjection motivazione_fine_ARV_sec(String alias, Motivazione_fine_ARVResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_fine_ARV_sec").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection motivazione_inizio_ARV___associables(Motivazione_inizio_ARVPageResponseProjection subProjection) {
        return motivazione_inizio_ARV___associables((String)null, subProjection);
    }

    public Terapia_ARVResponseProjection motivazione_inizio_ARV___associables(String alias, Motivazione_inizio_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_inizio_ARV___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection motivazione_inizio_ARV___associables(Terapia_ARVMotivazione_inizio_ARV___associablesParametrizedInput input, Motivazione_inizio_ARVPageResponseProjection subProjection) {
        return motivazione_inizio_ARV___associables(null, input, subProjection);
    }

    public Terapia_ARVResponseProjection motivazione_inizio_ARV___associables(String alias, Terapia_ARVMotivazione_inizio_ARV___associablesParametrizedInput input, Motivazione_inizio_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_inizio_ARV___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection motivazione_inizio_ARV(Motivazione_inizio_ARVResponseProjection subProjection) {
        return motivazione_inizio_ARV(null, subProjection);
    }

    public Terapia_ARVResponseProjection motivazione_inizio_ARV(String alias, Motivazione_inizio_ARVResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_inizio_ARV").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection warning____associables(WarningPageResponseProjection subProjection) {
        return warning____associables((String)null, subProjection);
    }

    public Terapia_ARVResponseProjection warning____associables(String alias, WarningPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("warning____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection warning____associables(Terapia_ARVWarning____associablesParametrizedInput input, WarningPageResponseProjection subProjection) {
        return warning____associables(null, input, subProjection);
    }

    public Terapia_ARVResponseProjection warning____associables(String alias, Terapia_ARVWarning____associablesParametrizedInput input, WarningPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("warning____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection warning_(WarningPageResponseProjection subProjection) {
        return warning_((String)null, subProjection);
    }

    public Terapia_ARVResponseProjection warning_(String alias, WarningPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("warning_").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection warning_(Terapia_ARVWarning_ParametrizedInput input, WarningPageResponseProjection subProjection) {
        return warning_(null, input, subProjection);
    }

    public Terapia_ARVResponseProjection warning_(String alias, Terapia_ARVWarning_ParametrizedInput input, WarningPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("warning_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection Paziente_terapia_ARV(PazienteResponseProjection subProjection) {
        return Paziente_terapia_ARV(null, subProjection);
    }

    public Terapia_ARVResponseProjection Paziente_terapia_ARV(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("Paziente_terapia_ARV").alias(alias).projection(subProjection));
        return this;
    }

    public Terapia_ARVResponseProjection typename() {
        return typename(null);
    }

    public Terapia_ARVResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Terapia_ARVResponseProjection deepCopy$() {
        return new Terapia_ARVResponseProjection(this);
    }


}
