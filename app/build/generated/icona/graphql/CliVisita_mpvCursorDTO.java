package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Visita_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliVisita_mpvCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private Boolean arruolamento;
    private Boolean arruolamento_effettuato;
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
    private String gruppo_appartenenza;
    private Boolean hiv;
    private Integer hivrna_vaccinazione;
    private Boolean hpv;
    private Boolean mst;
    private String note_ricovero;
    private Integer num_dosi_mvabn;
    private Integer num_visite;
    private String paziente_ico;
    private Boolean ricovero;
    private Boolean sifilide;
    private String tipo_visita;
    private String tipo_visita_booster;
    private String vac_mvabn_22_23;
    private String vac_vaiolo_pre;

    public CliVisita_mpvCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Boolean getArruolamento() {
        return arruolamento;
    }
    public void setArruolamento(Boolean arruolamento) {
        this.arruolamento = arruolamento;
    }

    public Boolean getArruolamento_effettuato() {
        return arruolamento_effettuato;
    }
    public void setArruolamento_effettuato(Boolean arruolamento_effettuato) {
        this.arruolamento_effettuato = arruolamento_effettuato;
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

    public String getGruppo_appartenenza() {
        return gruppo_appartenenza;
    }
    public void setGruppo_appartenenza(String gruppo_appartenenza) {
        this.gruppo_appartenenza = gruppo_appartenenza;
    }

    public Boolean getHiv() {
        return hiv;
    }
    public void setHiv(Boolean hiv) {
        this.hiv = hiv;
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

    public Integer getNum_visite() {
        return num_visite;
    }
    public void setNum_visite(Integer num_visite) {
        this.num_visite = num_visite;
    }

    public String getPaziente_ico() {
        return paziente_ico;
    }
    public void setPaziente_ico(String paziente_ico) {
        this.paziente_ico = paziente_ico;
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

    public String getTipo_visita() {
        return tipo_visita;
    }
    public void setTipo_visita(String tipo_visita) {
        this.tipo_visita = tipo_visita;
    }

    public String getTipo_visita_booster() {
        return tipo_visita_booster;
    }
    public void setTipo_visita_booster(String tipo_visita_booster) {
        this.tipo_visita_booster = tipo_visita_booster;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (arruolamento != null) {
            joiner.add("arruolamento: " + GraphQLRequestSerializer.getEntry(arruolamento));
        }
        if (arruolamento_effettuato != null) {
            joiner.add("arruolamento_effettuato: " + GraphQLRequestSerializer.getEntry(arruolamento_effettuato));
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
        if (gruppo_appartenenza != null) {
            joiner.add("gruppo_appartenenza: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza));
        }
        if (hiv != null) {
            joiner.add("hiv: " + GraphQLRequestSerializer.getEntry(hiv));
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
        if (num_visite != null) {
            joiner.add("num_visite: " + GraphQLRequestSerializer.getEntry(num_visite));
        }
        if (paziente_ico != null) {
            joiner.add("paziente_ico: " + GraphQLRequestSerializer.getEntry(paziente_ico));
        }
        if (ricovero != null) {
            joiner.add("ricovero: " + GraphQLRequestSerializer.getEntry(ricovero));
        }
        if (sifilide != null) {
            joiner.add("sifilide: " + GraphQLRequestSerializer.getEntry(sifilide));
        }
        if (tipo_visita != null) {
            joiner.add("tipo_visita: " + GraphQLRequestSerializer.getEntry(tipo_visita));
        }
        if (tipo_visita_booster != null) {
            joiner.add("tipo_visita_booster: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster));
        }
        if (vac_mvabn_22_23 != null) {
            joiner.add("vac_mvabn_22_23: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23));
        }
        if (vac_vaiolo_pre != null) {
            joiner.add("vac_vaiolo_pre: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre));
        }
        return joiner.toString();
    }

    public static CliVisita_mpvCursorDTO.Builder builder() {
        return new CliVisita_mpvCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private Boolean arruolamento;
        private Boolean arruolamento_effettuato;
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
        private String gruppo_appartenenza;
        private Boolean hiv;
        private Integer hivrna_vaccinazione;
        private Boolean hpv;
        private Boolean mst;
        private String note_ricovero;
        private Integer num_dosi_mvabn;
        private Integer num_visite;
        private String paziente_ico;
        private Boolean ricovero;
        private Boolean sifilide;
        private String tipo_visita;
        private String tipo_visita_booster;
        private String vac_mvabn_22_23;
        private String vac_vaiolo_pre;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setArruolamento(Boolean arruolamento) {
            this.arruolamento = arruolamento;
            return this;
        }

        public Builder setArruolamento_effettuato(Boolean arruolamento_effettuato) {
            this.arruolamento_effettuato = arruolamento_effettuato;
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

        public Builder setGruppo_appartenenza(String gruppo_appartenenza) {
            this.gruppo_appartenenza = gruppo_appartenenza;
            return this;
        }

        public Builder setHiv(Boolean hiv) {
            this.hiv = hiv;
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

        public Builder setNum_visite(Integer num_visite) {
            this.num_visite = num_visite;
            return this;
        }

        public Builder setPaziente_ico(String paziente_ico) {
            this.paziente_ico = paziente_ico;
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

        public Builder setTipo_visita(String tipo_visita) {
            this.tipo_visita = tipo_visita;
            return this;
        }

        public Builder setTipo_visita_booster(String tipo_visita_booster) {
            this.tipo_visita_booster = tipo_visita_booster;
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


        public CliVisita_mpvCursorDTO build() {
            CliVisita_mpvCursorDTO result = new CliVisita_mpvCursorDTO();
            result.set_id(this._id);
            result.setArruolamento(this.arruolamento);
            result.setArruolamento_effettuato(this.arruolamento_effettuato);
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
            result.setGruppo_appartenenza(this.gruppo_appartenenza);
            result.setHiv(this.hiv);
            result.setHivrna_vaccinazione(this.hivrna_vaccinazione);
            result.setHpv(this.hpv);
            result.setMst(this.mst);
            result.setNote_ricovero(this.note_ricovero);
            result.setNum_dosi_mvabn(this.num_dosi_mvabn);
            result.setNum_visite(this.num_visite);
            result.setPaziente_ico(this.paziente_ico);
            result.setRicovero(this.ricovero);
            result.setSifilide(this.sifilide);
            result.setTipo_visita(this.tipo_visita);
            result.setTipo_visita_booster(this.tipo_visita_booster);
            result.setVac_mvabn_22_23(this.vac_mvabn_22_23);
            result.setVac_vaiolo_pre(this.vac_vaiolo_pre);
            return result;
        }

    }
}
