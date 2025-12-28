package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Visita_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Visita_mpvResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Visita_mpvResponseProjection() {
    }

    public Visita_mpvResponseProjection(Visita_mpvResponseProjection projection) {
        super(projection);
    }

    public Visita_mpvResponseProjection(List<Visita_mpvResponseProjection> projections) {
        super(projections);
    }

    public Visita_mpvResponseProjection all$() {
        return all$(3);
    }

    public Visita_mpvResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.arruolamento();
        this.arruolamento_effettuato();
        this.cd4_vaccinazione();
        this.centro_prov();
        this.chemsex();
        this.chlamydia();
        this.contatti_mpox();
        this.data();
        this.data_chlamydia();
        this.data_contatto_mpox();
        this.data_gonorrea();
        this.data_hpv();
        this.data_mvabn_pre1();
        this.data_mvabn_pre2();
        this.data_sifilide();
        this.gonorrea();
        this.gruppo_appartenenza();
        this.hiv();
        this.hivrna_vaccinazione();
        this.hpv();
        this.mst();
        this.note_ricovero();
        this.num_dosi_mvabn();
        this.num_visite();
        this.paziente_ico();
        this.ricovero();
        this.sifilide();
        this.tipo_visita();
        this.tipo_visita_booster();
        this.vac_mvabn_22_23();
        this.vac_vaiolo_pre();
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Centro_provenienzaPageResponseProjection.centro_provenienza____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Centro_provenienzaPageResponseProjection.centro_provenienza____associables", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Centro_provenienzaPageResponseProjection.centro_provenienza____associables", 0) + 1);
            this.centro_provenienza____associables(new Centro_provenienzaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Centro_provenienzaPageResponseProjection.centro_provenienza____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Centro_provenienzaResponseProjection.centro_provenienza_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Centro_provenienzaResponseProjection.centro_provenienza_", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Centro_provenienzaResponseProjection.centro_provenienza_", 0) + 1);
            this.centro_provenienza_(new Centro_provenienzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Centro_provenienzaResponseProjection.centro_provenienza_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Comorbidita_mpvPageResponseProjection.comorbidita_mpv____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Comorbidita_mpvPageResponseProjection.comorbidita_mpv____associables", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Comorbidita_mpvPageResponseProjection.comorbidita_mpv____associables", 0) + 1);
            this.comorbidita_mpv____associables(new Comorbidita_mpvPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Comorbidita_mpvPageResponseProjection.comorbidita_mpv____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Comorbidita_mpvPageResponseProjection.comorbidita_mpv_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Comorbidita_mpvPageResponseProjection.comorbidita_mpv_", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Comorbidita_mpvPageResponseProjection.comorbidita_mpv_", 0) + 1);
            this.comorbidita_mpv_(new Comorbidita_mpvPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Comorbidita_mpvPageResponseProjection.comorbidita_mpv_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Dose_mpvPageResponseProjection.dose_mpv_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Dose_mpvPageResponseProjection.dose_mpv_", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Dose_mpvPageResponseProjection.dose_mpv_", 0) + 1);
            this.dose_mpv_(new Dose_mpvPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Dose_mpvPageResponseProjection.dose_mpv_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Episodio_MPOXPageResponseProjection.episodio_MPOX_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Episodio_MPOXPageResponseProjection.episodio_MPOX_", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Episodio_MPOXPageResponseProjection.episodio_MPOX_", 0) + 1);
            this.episodio_MPOX_(new Episodio_MPOXPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Episodio_MPOXPageResponseProjection.episodio_MPOX_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.GruppoPageResponseProjection.gruppo____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.GruppoPageResponseProjection.gruppo____associables", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.GruppoPageResponseProjection.gruppo____associables", 0) + 1);
            this.gruppo____associables(new GruppoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.GruppoPageResponseProjection.gruppo____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.GruppoResponseProjection.gruppo_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.GruppoResponseProjection.gruppo_", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.GruppoResponseProjection.gruppo_", 0) + 1);
            this.gruppo_(new GruppoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.GruppoResponseProjection.gruppo_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Modalita_somministrazionePageResponseProjection.modalita_somministrazione_pre1___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Modalita_somministrazionePageResponseProjection.modalita_somministrazione_pre1___associables", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Modalita_somministrazionePageResponseProjection.modalita_somministrazione_pre1___associables", 0) + 1);
            this.modalita_somministrazione_pre1___associables(new Modalita_somministrazionePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Modalita_somministrazionePageResponseProjection.modalita_somministrazione_pre1___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Modalita_somministrazioneResponseProjection.modalita_somministrazione_pre1", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Modalita_somministrazioneResponseProjection.modalita_somministrazione_pre1", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Modalita_somministrazioneResponseProjection.modalita_somministrazione_pre1", 0) + 1);
            this.modalita_somministrazione_pre1(new Modalita_somministrazioneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Modalita_somministrazioneResponseProjection.modalita_somministrazione_pre1", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Modalita_somministrazionePageResponseProjection.modalita_somministrazione_pre2___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Modalita_somministrazionePageResponseProjection.modalita_somministrazione_pre2___associables", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Modalita_somministrazionePageResponseProjection.modalita_somministrazione_pre2___associables", 0) + 1);
            this.modalita_somministrazione_pre2___associables(new Modalita_somministrazionePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Modalita_somministrazionePageResponseProjection.modalita_somministrazione_pre2___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Modalita_somministrazioneResponseProjection.modalita_somministrazione_pre2", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Modalita_somministrazioneResponseProjection.modalita_somministrazione_pre2", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Modalita_somministrazioneResponseProjection.modalita_somministrazione_pre2", 0) + 1);
            this.modalita_somministrazione_pre2(new Modalita_somministrazioneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Modalita_somministrazioneResponseProjection.modalita_somministrazione_pre2", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Tipo_visita_mpvPageResponseProjection.tipo_visita_mp____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Tipo_visita_mpvPageResponseProjection.tipo_visita_mp____associables", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Tipo_visita_mpvPageResponseProjection.tipo_visita_mp____associables", 0) + 1);
            this.tipo_visita_mp____associables(new Tipo_visita_mpvPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Tipo_visita_mpvPageResponseProjection.tipo_visita_mp____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Tipo_visita_mpvResponseProjection.tipo_visita_mp_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Tipo_visita_mpvResponseProjection.tipo_visita_mp_", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Tipo_visita_mpvResponseProjection.tipo_visita_mp_", 0) + 1);
            this.tipo_visita_mp_(new Tipo_visita_mpvResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Tipo_visita_mpvResponseProjection.tipo_visita_mp_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Tipo_visita_mpvPageResponseProjection.tipo_visita_mp_booster___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Tipo_visita_mpvPageResponseProjection.tipo_visita_mp_booster___associables", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Tipo_visita_mpvPageResponseProjection.tipo_visita_mp_booster___associables", 0) + 1);
            this.tipo_visita_mp_booster___associables(new Tipo_visita_mpvPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Tipo_visita_mpvPageResponseProjection.tipo_visita_mp_booster___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Tipo_visita_mpvResponseProjection.tipo_visita_mp_booster", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.Tipo_visita_mpvResponseProjection.tipo_visita_mp_booster", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Tipo_visita_mpvResponseProjection.tipo_visita_mp_booster", 0) + 1);
            this.tipo_visita_mp_booster(new Tipo_visita_mpvResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.Tipo_visita_mpvResponseProjection.tipo_visita_mp_booster", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Visita_mpvResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Visita_mpvResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public Visita_mpvResponseProjection _clientId() {
        return _clientId(null);
    }

    public Visita_mpvResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection _id() {
        return _id(null);
    }

    public Visita_mpvResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection arruolamento() {
        return arruolamento(null);
    }

    public Visita_mpvResponseProjection arruolamento(String alias) {
        add$(new GraphQLResponseField("arruolamento").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection arruolamento_effettuato() {
        return arruolamento_effettuato(null);
    }

    public Visita_mpvResponseProjection arruolamento_effettuato(String alias) {
        add$(new GraphQLResponseField("arruolamento_effettuato").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection cd4_vaccinazione() {
        return cd4_vaccinazione(null);
    }

    public Visita_mpvResponseProjection cd4_vaccinazione(String alias) {
        add$(new GraphQLResponseField("cd4_vaccinazione").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection centro_prov() {
        return centro_prov(null);
    }

    public Visita_mpvResponseProjection centro_prov(String alias) {
        add$(new GraphQLResponseField("centro_prov").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection chemsex() {
        return chemsex(null);
    }

    public Visita_mpvResponseProjection chemsex(String alias) {
        add$(new GraphQLResponseField("chemsex").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection chlamydia() {
        return chlamydia(null);
    }

    public Visita_mpvResponseProjection chlamydia(String alias) {
        add$(new GraphQLResponseField("chlamydia").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection contatti_mpox() {
        return contatti_mpox(null);
    }

    public Visita_mpvResponseProjection contatti_mpox(String alias) {
        add$(new GraphQLResponseField("contatti_mpox").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection data() {
        return data(null);
    }

    public Visita_mpvResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection data_chlamydia() {
        return data_chlamydia(null);
    }

    public Visita_mpvResponseProjection data_chlamydia(String alias) {
        add$(new GraphQLResponseField("data_chlamydia").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection data_contatto_mpox() {
        return data_contatto_mpox(null);
    }

    public Visita_mpvResponseProjection data_contatto_mpox(String alias) {
        add$(new GraphQLResponseField("data_contatto_mpox").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection data_gonorrea() {
        return data_gonorrea(null);
    }

    public Visita_mpvResponseProjection data_gonorrea(String alias) {
        add$(new GraphQLResponseField("data_gonorrea").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection data_hpv() {
        return data_hpv(null);
    }

    public Visita_mpvResponseProjection data_hpv(String alias) {
        add$(new GraphQLResponseField("data_hpv").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection data_mvabn_pre1() {
        return data_mvabn_pre1(null);
    }

    public Visita_mpvResponseProjection data_mvabn_pre1(String alias) {
        add$(new GraphQLResponseField("data_mvabn_pre1").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection data_mvabn_pre2() {
        return data_mvabn_pre2(null);
    }

    public Visita_mpvResponseProjection data_mvabn_pre2(String alias) {
        add$(new GraphQLResponseField("data_mvabn_pre2").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection data_sifilide() {
        return data_sifilide(null);
    }

    public Visita_mpvResponseProjection data_sifilide(String alias) {
        add$(new GraphQLResponseField("data_sifilide").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection gonorrea() {
        return gonorrea(null);
    }

    public Visita_mpvResponseProjection gonorrea(String alias) {
        add$(new GraphQLResponseField("gonorrea").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection gruppo_appartenenza() {
        return gruppo_appartenenza(null);
    }

    public Visita_mpvResponseProjection gruppo_appartenenza(String alias) {
        add$(new GraphQLResponseField("gruppo_appartenenza").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection hiv() {
        return hiv(null);
    }

    public Visita_mpvResponseProjection hiv(String alias) {
        add$(new GraphQLResponseField("hiv").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection hivrna_vaccinazione() {
        return hivrna_vaccinazione(null);
    }

    public Visita_mpvResponseProjection hivrna_vaccinazione(String alias) {
        add$(new GraphQLResponseField("hivrna_vaccinazione").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection hpv() {
        return hpv(null);
    }

    public Visita_mpvResponseProjection hpv(String alias) {
        add$(new GraphQLResponseField("hpv").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection mst() {
        return mst(null);
    }

    public Visita_mpvResponseProjection mst(String alias) {
        add$(new GraphQLResponseField("mst").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection note_ricovero() {
        return note_ricovero(null);
    }

    public Visita_mpvResponseProjection note_ricovero(String alias) {
        add$(new GraphQLResponseField("note_ricovero").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection num_dosi_mvabn() {
        return num_dosi_mvabn(null);
    }

    public Visita_mpvResponseProjection num_dosi_mvabn(String alias) {
        add$(new GraphQLResponseField("num_dosi_mvabn").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection num_visite() {
        return num_visite(null);
    }

    public Visita_mpvResponseProjection num_visite(String alias) {
        add$(new GraphQLResponseField("num_visite").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection paziente_ico() {
        return paziente_ico(null);
    }

    public Visita_mpvResponseProjection paziente_ico(String alias) {
        add$(new GraphQLResponseField("paziente_ico").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection ricovero() {
        return ricovero(null);
    }

    public Visita_mpvResponseProjection ricovero(String alias) {
        add$(new GraphQLResponseField("ricovero").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection sifilide() {
        return sifilide(null);
    }

    public Visita_mpvResponseProjection sifilide(String alias) {
        add$(new GraphQLResponseField("sifilide").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection tipo_visita() {
        return tipo_visita(null);
    }

    public Visita_mpvResponseProjection tipo_visita(String alias) {
        add$(new GraphQLResponseField("tipo_visita").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection tipo_visita_booster() {
        return tipo_visita_booster(null);
    }

    public Visita_mpvResponseProjection tipo_visita_booster(String alias) {
        add$(new GraphQLResponseField("tipo_visita_booster").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection vac_mvabn_22_23() {
        return vac_mvabn_22_23(null);
    }

    public Visita_mpvResponseProjection vac_mvabn_22_23(String alias) {
        add$(new GraphQLResponseField("vac_mvabn_22_23").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection vac_vaiolo_pre() {
        return vac_vaiolo_pre(null);
    }

    public Visita_mpvResponseProjection vac_vaiolo_pre(String alias) {
        add$(new GraphQLResponseField("vac_vaiolo_pre").alias(alias));
        return this;
    }

    public Visita_mpvResponseProjection centro_provenienza____associables(Centro_provenienzaPageResponseProjection subProjection) {
        return centro_provenienza____associables((String)null, subProjection);
    }

    public Visita_mpvResponseProjection centro_provenienza____associables(String alias, Centro_provenienzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("centro_provenienza____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection centro_provenienza____associables(Visita_mpvCentro_provenienza____associablesParametrizedInput input, Centro_provenienzaPageResponseProjection subProjection) {
        return centro_provenienza____associables(null, input, subProjection);
    }

    public Visita_mpvResponseProjection centro_provenienza____associables(String alias, Visita_mpvCentro_provenienza____associablesParametrizedInput input, Centro_provenienzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("centro_provenienza____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection centro_provenienza_(Centro_provenienzaResponseProjection subProjection) {
        return centro_provenienza_(null, subProjection);
    }

    public Visita_mpvResponseProjection centro_provenienza_(String alias, Centro_provenienzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("centro_provenienza_").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection comorbidita_mpv____associables(Comorbidita_mpvPageResponseProjection subProjection) {
        return comorbidita_mpv____associables((String)null, subProjection);
    }

    public Visita_mpvResponseProjection comorbidita_mpv____associables(String alias, Comorbidita_mpvPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("comorbidita_mpv____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection comorbidita_mpv____associables(Visita_mpvComorbidita_mpv____associablesParametrizedInput input, Comorbidita_mpvPageResponseProjection subProjection) {
        return comorbidita_mpv____associables(null, input, subProjection);
    }

    public Visita_mpvResponseProjection comorbidita_mpv____associables(String alias, Visita_mpvComorbidita_mpv____associablesParametrizedInput input, Comorbidita_mpvPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("comorbidita_mpv____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection comorbidita_mpv_(Comorbidita_mpvPageResponseProjection subProjection) {
        return comorbidita_mpv_((String)null, subProjection);
    }

    public Visita_mpvResponseProjection comorbidita_mpv_(String alias, Comorbidita_mpvPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("comorbidita_mpv_").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection comorbidita_mpv_(Visita_mpvComorbidita_mpv_ParametrizedInput input, Comorbidita_mpvPageResponseProjection subProjection) {
        return comorbidita_mpv_(null, input, subProjection);
    }

    public Visita_mpvResponseProjection comorbidita_mpv_(String alias, Visita_mpvComorbidita_mpv_ParametrizedInput input, Comorbidita_mpvPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("comorbidita_mpv_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection dose_mpv_(Dose_mpvPageResponseProjection subProjection) {
        return dose_mpv_((String)null, subProjection);
    }

    public Visita_mpvResponseProjection dose_mpv_(String alias, Dose_mpvPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("dose_mpv_").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection dose_mpv_(Visita_mpvDose_mpv_ParametrizedInput input, Dose_mpvPageResponseProjection subProjection) {
        return dose_mpv_(null, input, subProjection);
    }

    public Visita_mpvResponseProjection dose_mpv_(String alias, Visita_mpvDose_mpv_ParametrizedInput input, Dose_mpvPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("dose_mpv_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection episodio_MPOX_(Episodio_MPOXPageResponseProjection subProjection) {
        return episodio_MPOX_((String)null, subProjection);
    }

    public Visita_mpvResponseProjection episodio_MPOX_(String alias, Episodio_MPOXPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("episodio_MPOX_").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection episodio_MPOX_(Visita_mpvEpisodio_MPOX_ParametrizedInput input, Episodio_MPOXPageResponseProjection subProjection) {
        return episodio_MPOX_(null, input, subProjection);
    }

    public Visita_mpvResponseProjection episodio_MPOX_(String alias, Visita_mpvEpisodio_MPOX_ParametrizedInput input, Episodio_MPOXPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("episodio_MPOX_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection gruppo____associables(GruppoPageResponseProjection subProjection) {
        return gruppo____associables((String)null, subProjection);
    }

    public Visita_mpvResponseProjection gruppo____associables(String alias, GruppoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("gruppo____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection gruppo____associables(Visita_mpvGruppo____associablesParametrizedInput input, GruppoPageResponseProjection subProjection) {
        return gruppo____associables(null, input, subProjection);
    }

    public Visita_mpvResponseProjection gruppo____associables(String alias, Visita_mpvGruppo____associablesParametrizedInput input, GruppoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("gruppo____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection gruppo_(GruppoResponseProjection subProjection) {
        return gruppo_(null, subProjection);
    }

    public Visita_mpvResponseProjection gruppo_(String alias, GruppoResponseProjection subProjection) {
        add$(new GraphQLResponseField("gruppo_").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection modalita_somministrazione_pre1___associables(Modalita_somministrazionePageResponseProjection subProjection) {
        return modalita_somministrazione_pre1___associables((String)null, subProjection);
    }

    public Visita_mpvResponseProjection modalita_somministrazione_pre1___associables(String alias, Modalita_somministrazionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("modalita_somministrazione_pre1___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection modalita_somministrazione_pre1___associables(Visita_mpvModalita_somministrazione_pre1___associablesParametrizedInput input, Modalita_somministrazionePageResponseProjection subProjection) {
        return modalita_somministrazione_pre1___associables(null, input, subProjection);
    }

    public Visita_mpvResponseProjection modalita_somministrazione_pre1___associables(String alias, Visita_mpvModalita_somministrazione_pre1___associablesParametrizedInput input, Modalita_somministrazionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("modalita_somministrazione_pre1___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection modalita_somministrazione_pre1(Modalita_somministrazioneResponseProjection subProjection) {
        return modalita_somministrazione_pre1(null, subProjection);
    }

    public Visita_mpvResponseProjection modalita_somministrazione_pre1(String alias, Modalita_somministrazioneResponseProjection subProjection) {
        add$(new GraphQLResponseField("modalita_somministrazione_pre1").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection modalita_somministrazione_pre2___associables(Modalita_somministrazionePageResponseProjection subProjection) {
        return modalita_somministrazione_pre2___associables((String)null, subProjection);
    }

    public Visita_mpvResponseProjection modalita_somministrazione_pre2___associables(String alias, Modalita_somministrazionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("modalita_somministrazione_pre2___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection modalita_somministrazione_pre2___associables(Visita_mpvModalita_somministrazione_pre2___associablesParametrizedInput input, Modalita_somministrazionePageResponseProjection subProjection) {
        return modalita_somministrazione_pre2___associables(null, input, subProjection);
    }

    public Visita_mpvResponseProjection modalita_somministrazione_pre2___associables(String alias, Visita_mpvModalita_somministrazione_pre2___associablesParametrizedInput input, Modalita_somministrazionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("modalita_somministrazione_pre2___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection modalita_somministrazione_pre2(Modalita_somministrazioneResponseProjection subProjection) {
        return modalita_somministrazione_pre2(null, subProjection);
    }

    public Visita_mpvResponseProjection modalita_somministrazione_pre2(String alias, Modalita_somministrazioneResponseProjection subProjection) {
        add$(new GraphQLResponseField("modalita_somministrazione_pre2").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection tipo_visita_mp____associables(Tipo_visita_mpvPageResponseProjection subProjection) {
        return tipo_visita_mp____associables((String)null, subProjection);
    }

    public Visita_mpvResponseProjection tipo_visita_mp____associables(String alias, Tipo_visita_mpvPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_visita_mp____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection tipo_visita_mp____associables(Visita_mpvTipo_visita_mp____associablesParametrizedInput input, Tipo_visita_mpvPageResponseProjection subProjection) {
        return tipo_visita_mp____associables(null, input, subProjection);
    }

    public Visita_mpvResponseProjection tipo_visita_mp____associables(String alias, Visita_mpvTipo_visita_mp____associablesParametrizedInput input, Tipo_visita_mpvPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_visita_mp____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection tipo_visita_mp_(Tipo_visita_mpvResponseProjection subProjection) {
        return tipo_visita_mp_(null, subProjection);
    }

    public Visita_mpvResponseProjection tipo_visita_mp_(String alias, Tipo_visita_mpvResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_visita_mp_").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection tipo_visita_mp_booster___associables(Tipo_visita_mpvPageResponseProjection subProjection) {
        return tipo_visita_mp_booster___associables((String)null, subProjection);
    }

    public Visita_mpvResponseProjection tipo_visita_mp_booster___associables(String alias, Tipo_visita_mpvPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_visita_mp_booster___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection tipo_visita_mp_booster___associables(Visita_mpvTipo_visita_mp_booster___associablesParametrizedInput input, Tipo_visita_mpvPageResponseProjection subProjection) {
        return tipo_visita_mp_booster___associables(null, input, subProjection);
    }

    public Visita_mpvResponseProjection tipo_visita_mp_booster___associables(String alias, Visita_mpvTipo_visita_mp_booster___associablesParametrizedInput input, Tipo_visita_mpvPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_visita_mp_booster___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection tipo_visita_mp_booster(Tipo_visita_mpvResponseProjection subProjection) {
        return tipo_visita_mp_booster(null, subProjection);
    }

    public Visita_mpvResponseProjection tipo_visita_mp_booster(String alias, Tipo_visita_mpvResponseProjection subProjection) {
        add$(new GraphQLResponseField("tipo_visita_mp_booster").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public Visita_mpvResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Visita_mpvResponseProjection typename() {
        return typename(null);
    }

    public Visita_mpvResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Visita_mpvResponseProjection deepCopy$() {
        return new Visita_mpvResponseProjection(this);
    }


}
