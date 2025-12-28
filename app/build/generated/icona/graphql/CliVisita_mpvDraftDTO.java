package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft object of class Visita_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliVisita_mpvDraftDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String _clientId;
    private Boolean arruolamento;
    private Integer cd4_vaccinazione;
    private String centro_prov;
    private Boolean chemsex;
    private Boolean chlamydia;
    private Boolean contatti_mpox;
    private String data;
    private String data_chlamydia;
    private String data_contatto_mpox;
    private String data_gonorrea;
    private String data_hpv;
    private String data_mvabn_pre1;
    private String data_mvabn_pre2;
    private String data_sifilide;
    private Boolean gonorrea;
    private Integer hivrna_vaccinazione;
    private Boolean hpv;
    private Boolean mst;
    private String note_ricovero;
    private Integer num_dosi_mvabn;
    private Boolean ricovero;
    private Boolean sifilide;
    private String vac_mvabn_22_23;
    private String vac_vaiolo_pre;
    private String centro_provenienza_;
    private CliComorbidita_mpvDraftRoleRefsDTO comorbidita_mpv_;
    private CliDose_mpvDraftRoleObjectsDTO dose_mpv_;
    private CliEpisodio_MPOXDraftRoleObjectsDTO episodio_MPOX_;
    private String gruppo_;
    private String modalita_somministrazione_pre1;
    private String modalita_somministrazione_pre2;
    private String tipo_visita_mp_;
    private String tipo_visita_mp_booster;

    public CliVisita_mpvDraftDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public Boolean getArruolamento() {
        return arruolamento;
    }
    public void setArruolamento(Boolean arruolamento) {
        this.arruolamento = arruolamento;
    }

    public Integer getCd4_vaccinazione() {
        return cd4_vaccinazione;
    }
    public void setCd4_vaccinazione(Integer cd4_vaccinazione) {
        this.cd4_vaccinazione = cd4_vaccinazione;
    }

    public String getCentro_prov() {
        return centro_prov;
    }
    public void setCentro_prov(String centro_prov) {
        this.centro_prov = centro_prov;
    }

    public Boolean getChemsex() {
        return chemsex;
    }
    public void setChemsex(Boolean chemsex) {
        this.chemsex = chemsex;
    }

    public Boolean getChlamydia() {
        return chlamydia;
    }
    public void setChlamydia(Boolean chlamydia) {
        this.chlamydia = chlamydia;
    }

    public Boolean getContatti_mpox() {
        return contatti_mpox;
    }
    public void setContatti_mpox(Boolean contatti_mpox) {
        this.contatti_mpox = contatti_mpox;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getData_chlamydia() {
        return data_chlamydia;
    }
    public void setData_chlamydia(String data_chlamydia) {
        this.data_chlamydia = data_chlamydia;
    }

    public String getData_contatto_mpox() {
        return data_contatto_mpox;
    }
    public void setData_contatto_mpox(String data_contatto_mpox) {
        this.data_contatto_mpox = data_contatto_mpox;
    }

    public String getData_gonorrea() {
        return data_gonorrea;
    }
    public void setData_gonorrea(String data_gonorrea) {
        this.data_gonorrea = data_gonorrea;
    }

    public String getData_hpv() {
        return data_hpv;
    }
    public void setData_hpv(String data_hpv) {
        this.data_hpv = data_hpv;
    }

    public String getData_mvabn_pre1() {
        return data_mvabn_pre1;
    }
    public void setData_mvabn_pre1(String data_mvabn_pre1) {
        this.data_mvabn_pre1 = data_mvabn_pre1;
    }

    public String getData_mvabn_pre2() {
        return data_mvabn_pre2;
    }
    public void setData_mvabn_pre2(String data_mvabn_pre2) {
        this.data_mvabn_pre2 = data_mvabn_pre2;
    }

    public String getData_sifilide() {
        return data_sifilide;
    }
    public void setData_sifilide(String data_sifilide) {
        this.data_sifilide = data_sifilide;
    }

    public Boolean getGonorrea() {
        return gonorrea;
    }
    public void setGonorrea(Boolean gonorrea) {
        this.gonorrea = gonorrea;
    }

    public Integer getHivrna_vaccinazione() {
        return hivrna_vaccinazione;
    }
    public void setHivrna_vaccinazione(Integer hivrna_vaccinazione) {
        this.hivrna_vaccinazione = hivrna_vaccinazione;
    }

    public Boolean getHpv() {
        return hpv;
    }
    public void setHpv(Boolean hpv) {
        this.hpv = hpv;
    }

    public Boolean getMst() {
        return mst;
    }
    public void setMst(Boolean mst) {
        this.mst = mst;
    }

    public String getNote_ricovero() {
        return note_ricovero;
    }
    public void setNote_ricovero(String note_ricovero) {
        this.note_ricovero = note_ricovero;
    }

    public Integer getNum_dosi_mvabn() {
        return num_dosi_mvabn;
    }
    public void setNum_dosi_mvabn(Integer num_dosi_mvabn) {
        this.num_dosi_mvabn = num_dosi_mvabn;
    }

    public Boolean getRicovero() {
        return ricovero;
    }
    public void setRicovero(Boolean ricovero) {
        this.ricovero = ricovero;
    }

    public Boolean getSifilide() {
        return sifilide;
    }
    public void setSifilide(Boolean sifilide) {
        this.sifilide = sifilide;
    }

    public String getVac_mvabn_22_23() {
        return vac_mvabn_22_23;
    }
    public void setVac_mvabn_22_23(String vac_mvabn_22_23) {
        this.vac_mvabn_22_23 = vac_mvabn_22_23;
    }

    public String getVac_vaiolo_pre() {
        return vac_vaiolo_pre;
    }
    public void setVac_vaiolo_pre(String vac_vaiolo_pre) {
        this.vac_vaiolo_pre = vac_vaiolo_pre;
    }

    public String getCentro_provenienza_() {
        return centro_provenienza_;
    }
    public void setCentro_provenienza_(String centro_provenienza_) {
        this.centro_provenienza_ = centro_provenienza_;
    }

    public CliComorbidita_mpvDraftRoleRefsDTO getComorbidita_mpv_() {
        return comorbidita_mpv_;
    }
    public void setComorbidita_mpv_(CliComorbidita_mpvDraftRoleRefsDTO comorbidita_mpv_) {
        this.comorbidita_mpv_ = comorbidita_mpv_;
    }

    public CliDose_mpvDraftRoleObjectsDTO getDose_mpv_() {
        return dose_mpv_;
    }
    public void setDose_mpv_(CliDose_mpvDraftRoleObjectsDTO dose_mpv_) {
        this.dose_mpv_ = dose_mpv_;
    }

    public CliEpisodio_MPOXDraftRoleObjectsDTO getEpisodio_MPOX_() {
        return episodio_MPOX_;
    }
    public void setEpisodio_MPOX_(CliEpisodio_MPOXDraftRoleObjectsDTO episodio_MPOX_) {
        this.episodio_MPOX_ = episodio_MPOX_;
    }

    public String getGruppo_() {
        return gruppo_;
    }
    public void setGruppo_(String gruppo_) {
        this.gruppo_ = gruppo_;
    }

    public String getModalita_somministrazione_pre1() {
        return modalita_somministrazione_pre1;
    }
    public void setModalita_somministrazione_pre1(String modalita_somministrazione_pre1) {
        this.modalita_somministrazione_pre1 = modalita_somministrazione_pre1;
    }

    public String getModalita_somministrazione_pre2() {
        return modalita_somministrazione_pre2;
    }
    public void setModalita_somministrazione_pre2(String modalita_somministrazione_pre2) {
        this.modalita_somministrazione_pre2 = modalita_somministrazione_pre2;
    }

    public String getTipo_visita_mp_() {
        return tipo_visita_mp_;
    }
    public void setTipo_visita_mp_(String tipo_visita_mp_) {
        this.tipo_visita_mp_ = tipo_visita_mp_;
    }

    public String getTipo_visita_mp_booster() {
        return tipo_visita_mp_booster;
    }
    public void setTipo_visita_mp_booster(String tipo_visita_mp_booster) {
        this.tipo_visita_mp_booster = tipo_visita_mp_booster;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (arruolamento != null) {
            joiner.add("arruolamento: " + GraphQLRequestSerializer.getEntry(arruolamento));
        }
        if (cd4_vaccinazione != null) {
            joiner.add("cd4_vaccinazione: " + GraphQLRequestSerializer.getEntry(cd4_vaccinazione));
        }
        if (centro_prov != null) {
            joiner.add("centro_prov: " + GraphQLRequestSerializer.getEntry(centro_prov));
        }
        if (chemsex != null) {
            joiner.add("chemsex: " + GraphQLRequestSerializer.getEntry(chemsex));
        }
        if (chlamydia != null) {
            joiner.add("chlamydia: " + GraphQLRequestSerializer.getEntry(chlamydia));
        }
        if (contatti_mpox != null) {
            joiner.add("contatti_mpox: " + GraphQLRequestSerializer.getEntry(contatti_mpox));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (data_chlamydia != null) {
            joiner.add("data_chlamydia: " + GraphQLRequestSerializer.getEntry(data_chlamydia));
        }
        if (data_contatto_mpox != null) {
            joiner.add("data_contatto_mpox: " + GraphQLRequestSerializer.getEntry(data_contatto_mpox));
        }
        if (data_gonorrea != null) {
            joiner.add("data_gonorrea: " + GraphQLRequestSerializer.getEntry(data_gonorrea));
        }
        if (data_hpv != null) {
            joiner.add("data_hpv: " + GraphQLRequestSerializer.getEntry(data_hpv));
        }
        if (data_mvabn_pre1 != null) {
            joiner.add("data_mvabn_pre1: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre1));
        }
        if (data_mvabn_pre2 != null) {
            joiner.add("data_mvabn_pre2: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre2));
        }
        if (data_sifilide != null) {
            joiner.add("data_sifilide: " + GraphQLRequestSerializer.getEntry(data_sifilide));
        }
        if (gonorrea != null) {
            joiner.add("gonorrea: " + GraphQLRequestSerializer.getEntry(gonorrea));
        }
        if (hivrna_vaccinazione != null) {
            joiner.add("hivrna_vaccinazione: " + GraphQLRequestSerializer.getEntry(hivrna_vaccinazione));
        }
        if (hpv != null) {
            joiner.add("hpv: " + GraphQLRequestSerializer.getEntry(hpv));
        }
        if (mst != null) {
            joiner.add("mst: " + GraphQLRequestSerializer.getEntry(mst));
        }
        if (note_ricovero != null) {
            joiner.add("note_ricovero: " + GraphQLRequestSerializer.getEntry(note_ricovero));
        }
        if (num_dosi_mvabn != null) {
            joiner.add("num_dosi_mvabn: " + GraphQLRequestSerializer.getEntry(num_dosi_mvabn));
        }
        if (ricovero != null) {
            joiner.add("ricovero: " + GraphQLRequestSerializer.getEntry(ricovero));
        }
        if (sifilide != null) {
            joiner.add("sifilide: " + GraphQLRequestSerializer.getEntry(sifilide));
        }
        if (vac_mvabn_22_23 != null) {
            joiner.add("vac_mvabn_22_23: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23));
        }
        if (vac_vaiolo_pre != null) {
            joiner.add("vac_vaiolo_pre: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre));
        }
        if (centro_provenienza_ != null) {
            joiner.add("centro_provenienza_: " + GraphQLRequestSerializer.getEntry(centro_provenienza_));
        }
        if (comorbidita_mpv_ != null) {
            joiner.add("comorbidita_mpv_: " + GraphQLRequestSerializer.getEntry(comorbidita_mpv_));
        }
        if (dose_mpv_ != null) {
            joiner.add("dose_mpv_: " + GraphQLRequestSerializer.getEntry(dose_mpv_));
        }
        if (episodio_MPOX_ != null) {
            joiner.add("episodio_MPOX_: " + GraphQLRequestSerializer.getEntry(episodio_MPOX_));
        }
        if (gruppo_ != null) {
            joiner.add("gruppo_: " + GraphQLRequestSerializer.getEntry(gruppo_));
        }
        if (modalita_somministrazione_pre1 != null) {
            joiner.add("modalita_somministrazione_pre1: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione_pre1));
        }
        if (modalita_somministrazione_pre2 != null) {
            joiner.add("modalita_somministrazione_pre2: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione_pre2));
        }
        if (tipo_visita_mp_ != null) {
            joiner.add("tipo_visita_mp_: " + GraphQLRequestSerializer.getEntry(tipo_visita_mp_));
        }
        if (tipo_visita_mp_booster != null) {
            joiner.add("tipo_visita_mp_booster: " + GraphQLRequestSerializer.getEntry(tipo_visita_mp_booster));
        }
        return joiner.toString();
    }

    public static CliVisita_mpvDraftDTO.Builder builder() {
        return new CliVisita_mpvDraftDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private String _clientId;
        private Boolean arruolamento;
        private Integer cd4_vaccinazione;
        private String centro_prov;
        private Boolean chemsex;
        private Boolean chlamydia;
        private Boolean contatti_mpox;
        private String data;
        private String data_chlamydia;
        private String data_contatto_mpox;
        private String data_gonorrea;
        private String data_hpv;
        private String data_mvabn_pre1;
        private String data_mvabn_pre2;
        private String data_sifilide;
        private Boolean gonorrea;
        private Integer hivrna_vaccinazione;
        private Boolean hpv;
        private Boolean mst;
        private String note_ricovero;
        private Integer num_dosi_mvabn;
        private Boolean ricovero;
        private Boolean sifilide;
        private String vac_mvabn_22_23;
        private String vac_vaiolo_pre;
        private String centro_provenienza_;
        private CliComorbidita_mpvDraftRoleRefsDTO comorbidita_mpv_;
        private CliDose_mpvDraftRoleObjectsDTO dose_mpv_;
        private CliEpisodio_MPOXDraftRoleObjectsDTO episodio_MPOX_;
        private String gruppo_;
        private String modalita_somministrazione_pre1;
        private String modalita_somministrazione_pre2;
        private String tipo_visita_mp_;
        private String tipo_visita_mp_booster;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setArruolamento(Boolean arruolamento) {
            this.arruolamento = arruolamento;
            return this;
        }

        public Builder setCd4_vaccinazione(Integer cd4_vaccinazione) {
            this.cd4_vaccinazione = cd4_vaccinazione;
            return this;
        }

        public Builder setCentro_prov(String centro_prov) {
            this.centro_prov = centro_prov;
            return this;
        }

        public Builder setChemsex(Boolean chemsex) {
            this.chemsex = chemsex;
            return this;
        }

        public Builder setChlamydia(Boolean chlamydia) {
            this.chlamydia = chlamydia;
            return this;
        }

        public Builder setContatti_mpox(Boolean contatti_mpox) {
            this.contatti_mpox = contatti_mpox;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setData_chlamydia(String data_chlamydia) {
            this.data_chlamydia = data_chlamydia;
            return this;
        }

        public Builder setData_contatto_mpox(String data_contatto_mpox) {
            this.data_contatto_mpox = data_contatto_mpox;
            return this;
        }

        public Builder setData_gonorrea(String data_gonorrea) {
            this.data_gonorrea = data_gonorrea;
            return this;
        }

        public Builder setData_hpv(String data_hpv) {
            this.data_hpv = data_hpv;
            return this;
        }

        public Builder setData_mvabn_pre1(String data_mvabn_pre1) {
            this.data_mvabn_pre1 = data_mvabn_pre1;
            return this;
        }

        public Builder setData_mvabn_pre2(String data_mvabn_pre2) {
            this.data_mvabn_pre2 = data_mvabn_pre2;
            return this;
        }

        public Builder setData_sifilide(String data_sifilide) {
            this.data_sifilide = data_sifilide;
            return this;
        }

        public Builder setGonorrea(Boolean gonorrea) {
            this.gonorrea = gonorrea;
            return this;
        }

        public Builder setHivrna_vaccinazione(Integer hivrna_vaccinazione) {
            this.hivrna_vaccinazione = hivrna_vaccinazione;
            return this;
        }

        public Builder setHpv(Boolean hpv) {
            this.hpv = hpv;
            return this;
        }

        public Builder setMst(Boolean mst) {
            this.mst = mst;
            return this;
        }

        public Builder setNote_ricovero(String note_ricovero) {
            this.note_ricovero = note_ricovero;
            return this;
        }

        public Builder setNum_dosi_mvabn(Integer num_dosi_mvabn) {
            this.num_dosi_mvabn = num_dosi_mvabn;
            return this;
        }

        public Builder setRicovero(Boolean ricovero) {
            this.ricovero = ricovero;
            return this;
        }

        public Builder setSifilide(Boolean sifilide) {
            this.sifilide = sifilide;
            return this;
        }

        public Builder setVac_mvabn_22_23(String vac_mvabn_22_23) {
            this.vac_mvabn_22_23 = vac_mvabn_22_23;
            return this;
        }

        public Builder setVac_vaiolo_pre(String vac_vaiolo_pre) {
            this.vac_vaiolo_pre = vac_vaiolo_pre;
            return this;
        }

        public Builder setCentro_provenienza_(String centro_provenienza_) {
            this.centro_provenienza_ = centro_provenienza_;
            return this;
        }

        public Builder setComorbidita_mpv_(CliComorbidita_mpvDraftRoleRefsDTO comorbidita_mpv_) {
            this.comorbidita_mpv_ = comorbidita_mpv_;
            return this;
        }

        public Builder setDose_mpv_(CliDose_mpvDraftRoleObjectsDTO dose_mpv_) {
            this.dose_mpv_ = dose_mpv_;
            return this;
        }

        public Builder setEpisodio_MPOX_(CliEpisodio_MPOXDraftRoleObjectsDTO episodio_MPOX_) {
            this.episodio_MPOX_ = episodio_MPOX_;
            return this;
        }

        public Builder setGruppo_(String gruppo_) {
            this.gruppo_ = gruppo_;
            return this;
        }

        public Builder setModalita_somministrazione_pre1(String modalita_somministrazione_pre1) {
            this.modalita_somministrazione_pre1 = modalita_somministrazione_pre1;
            return this;
        }

        public Builder setModalita_somministrazione_pre2(String modalita_somministrazione_pre2) {
            this.modalita_somministrazione_pre2 = modalita_somministrazione_pre2;
            return this;
        }

        public Builder setTipo_visita_mp_(String tipo_visita_mp_) {
            this.tipo_visita_mp_ = tipo_visita_mp_;
            return this;
        }

        public Builder setTipo_visita_mp_booster(String tipo_visita_mp_booster) {
            this.tipo_visita_mp_booster = tipo_visita_mp_booster;
            return this;
        }


        public CliVisita_mpvDraftDTO build() {
            CliVisita_mpvDraftDTO result = new CliVisita_mpvDraftDTO();
            result.set_id(this._id);
            result.set_clientId(this._clientId);
            result.setArruolamento(this.arruolamento);
            result.setCd4_vaccinazione(this.cd4_vaccinazione);
            result.setCentro_prov(this.centro_prov);
            result.setChemsex(this.chemsex);
            result.setChlamydia(this.chlamydia);
            result.setContatti_mpox(this.contatti_mpox);
            result.setData(this.data);
            result.setData_chlamydia(this.data_chlamydia);
            result.setData_contatto_mpox(this.data_contatto_mpox);
            result.setData_gonorrea(this.data_gonorrea);
            result.setData_hpv(this.data_hpv);
            result.setData_mvabn_pre1(this.data_mvabn_pre1);
            result.setData_mvabn_pre2(this.data_mvabn_pre2);
            result.setData_sifilide(this.data_sifilide);
            result.setGonorrea(this.gonorrea);
            result.setHivrna_vaccinazione(this.hivrna_vaccinazione);
            result.setHpv(this.hpv);
            result.setMst(this.mst);
            result.setNote_ricovero(this.note_ricovero);
            result.setNum_dosi_mvabn(this.num_dosi_mvabn);
            result.setRicovero(this.ricovero);
            result.setSifilide(this.sifilide);
            result.setVac_mvabn_22_23(this.vac_mvabn_22_23);
            result.setVac_vaiolo_pre(this.vac_vaiolo_pre);
            result.setCentro_provenienza_(this.centro_provenienza_);
            result.setComorbidita_mpv_(this.comorbidita_mpv_);
            result.setDose_mpv_(this.dose_mpv_);
            result.setEpisodio_MPOX_(this.episodio_MPOX_);
            result.setGruppo_(this.gruppo_);
            result.setModalita_somministrazione_pre1(this.modalita_somministrazione_pre1);
            result.setModalita_somministrazione_pre2(this.modalita_somministrazione_pre2);
            result.setTipo_visita_mp_(this.tipo_visita_mp_);
            result.setTipo_visita_mp_booster(this.tipo_visita_mp_booster);
            return result;
        }

    }
}
