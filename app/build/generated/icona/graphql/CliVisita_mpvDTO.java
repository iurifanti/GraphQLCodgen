package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Visita_mpv, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliVisita_mpvDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
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
    private CliCentro_provenienzaDTO centro_provenienza_;
    private CliGruppoDTO gruppo_;
    private CliModalita_somministrazioneDTO modalita_somministrazione_pre1;
    private CliModalita_somministrazioneDTO modalita_somministrazione_pre2;
    private CliTipo_visita_mpvDTO tipo_visita_mp_;
    private CliTipo_visita_mpvDTO tipo_visita_mp_booster;
    private CliPazienteDTO paziente_;

    public CliVisita_mpvDTO() {
    }


    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public String get_clientId() {
        return _clientId;
    }
    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    /**
     * The attribute _id of Visita_mpv. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Visita_mpv. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute arruolamento of Visita_mpv. It is of type Boolean.
     */
    public Boolean getArruolamento() {
        return arruolamento;
    }
    /**
     * The attribute arruolamento of Visita_mpv. It is of type Boolean.
     */
    public void setArruolamento(Boolean arruolamento) {
        this.arruolamento = arruolamento;
    }

    /**
     * The attribute arruolamento_effettuato of Visita_mpv. It is of type Boolean. Path: m_Paziente_ arruolamento_effettuato.
     */
    public Boolean getArruolamento_effettuato() {
        return arruolamento_effettuato;
    }
    /**
     * The attribute arruolamento_effettuato of Visita_mpv. It is of type Boolean. Path: m_Paziente_ arruolamento_effettuato.
     */
    public void setArruolamento_effettuato(Boolean arruolamento_effettuato) {
        this.arruolamento_effettuato = arruolamento_effettuato;
    }

    /**
     * The attribute cd4_vaccinazione of Visita_mpv. It is of type Int.
     */
    public Integer getCd4_vaccinazione() {
        return cd4_vaccinazione;
    }
    /**
     * The attribute cd4_vaccinazione of Visita_mpv. It is of type Int.
     */
    public void setCd4_vaccinazione(Integer cd4_vaccinazione) {
        this.cd4_vaccinazione = cd4_vaccinazione;
    }

    /**
     * The attribute centro_prov of Visita_mpv. It is of type String. Max length: 255.
     */
    public String getCentro_prov() {
        return centro_prov;
    }
    /**
     * The attribute centro_prov of Visita_mpv. It is of type String. Max length: 255.
     */
    public void setCentro_prov(String centro_prov) {
        this.centro_prov = centro_prov;
    }

    /**
     * The attribute chemsex of Visita_mpv. It is of type Boolean.
     */
    public Boolean getChemsex() {
        return chemsex;
    }
    /**
     * The attribute chemsex of Visita_mpv. It is of type Boolean.
     */
    public void setChemsex(Boolean chemsex) {
        this.chemsex = chemsex;
    }

    /**
     * The attribute chlamydia of Visita_mpv. It is of type Boolean.
     */
    public Boolean getChlamydia() {
        return chlamydia;
    }
    /**
     * The attribute chlamydia of Visita_mpv. It is of type Boolean.
     */
    public void setChlamydia(Boolean chlamydia) {
        this.chlamydia = chlamydia;
    }

    /**
     * The attribute contatti_mpox of Visita_mpv. It is of type Boolean.
     */
    public Boolean getContatti_mpox() {
        return contatti_mpox;
    }
    /**
     * The attribute contatti_mpox of Visita_mpv. It is of type Boolean.
     */
    public void setContatti_mpox(Boolean contatti_mpox) {
        this.contatti_mpox = contatti_mpox;
    }

    /**
     * The attribute data of Visita_mpv. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Visita_mpv. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute data_chlamydia of Visita_mpv. It is of type Date @dateFormat.
     */
    public String getData_chlamydia() {
        return data_chlamydia;
    }
    /**
     * The attribute data_chlamydia of Visita_mpv. It is of type Date @dateFormat.
     */
    public void setData_chlamydia(String data_chlamydia) {
        this.data_chlamydia = data_chlamydia;
    }

    /**
     * The attribute data_contatto_mpox of Visita_mpv. It is of type Date @dateFormat.
     */
    public String getData_contatto_mpox() {
        return data_contatto_mpox;
    }
    /**
     * The attribute data_contatto_mpox of Visita_mpv. It is of type Date @dateFormat.
     */
    public void setData_contatto_mpox(String data_contatto_mpox) {
        this.data_contatto_mpox = data_contatto_mpox;
    }

    /**
     * The attribute data_gonorrea of Visita_mpv. It is of type Date @dateFormat.
     */
    public String getData_gonorrea() {
        return data_gonorrea;
    }
    /**
     * The attribute data_gonorrea of Visita_mpv. It is of type Date @dateFormat.
     */
    public void setData_gonorrea(String data_gonorrea) {
        this.data_gonorrea = data_gonorrea;
    }

    /**
     * The attribute data_hpv of Visita_mpv. It is of type Date @dateFormat.
     */
    public String getData_hpv() {
        return data_hpv;
    }
    /**
     * The attribute data_hpv of Visita_mpv. It is of type Date @dateFormat.
     */
    public void setData_hpv(String data_hpv) {
        this.data_hpv = data_hpv;
    }

    /**
     * The attribute data_mvabn_pre1 of Visita_mpv. It is of type Date @dateFormat.
     */
    public String getData_mvabn_pre1() {
        return data_mvabn_pre1;
    }
    /**
     * The attribute data_mvabn_pre1 of Visita_mpv. It is of type Date @dateFormat.
     */
    public void setData_mvabn_pre1(String data_mvabn_pre1) {
        this.data_mvabn_pre1 = data_mvabn_pre1;
    }

    /**
     * The attribute data_mvabn_pre2 of Visita_mpv. It is of type Date @dateFormat.
     */
    public String getData_mvabn_pre2() {
        return data_mvabn_pre2;
    }
    /**
     * The attribute data_mvabn_pre2 of Visita_mpv. It is of type Date @dateFormat.
     */
    public void setData_mvabn_pre2(String data_mvabn_pre2) {
        this.data_mvabn_pre2 = data_mvabn_pre2;
    }

    /**
     * The attribute data_sifilide of Visita_mpv. It is of type Date @dateFormat.
     */
    public String getData_sifilide() {
        return data_sifilide;
    }
    /**
     * The attribute data_sifilide of Visita_mpv. It is of type Date @dateFormat.
     */
    public void setData_sifilide(String data_sifilide) {
        this.data_sifilide = data_sifilide;
    }

    /**
     * The attribute gonorrea of Visita_mpv. It is of type Boolean.
     */
    public Boolean getGonorrea() {
        return gonorrea;
    }
    /**
     * The attribute gonorrea of Visita_mpv. It is of type Boolean.
     */
    public void setGonorrea(Boolean gonorrea) {
        this.gonorrea = gonorrea;
    }

    /**
     * The attribute gruppo_appartenenza of Visita_mpv. It is of type String. Path: gruppo_ nome. Cannot be null.
     */
    public String getGruppo_appartenenza() {
        return gruppo_appartenenza;
    }
    /**
     * The attribute gruppo_appartenenza of Visita_mpv. It is of type String. Path: gruppo_ nome. Cannot be null.
     */
    public void setGruppo_appartenenza(String gruppo_appartenenza) {
        this.gruppo_appartenenza = gruppo_appartenenza;
    }

    /**
     * The attribute hiv of Visita_mpv. It is of type Boolean. Path: m_Paziente_ hiv.
     */
    public Boolean getHiv() {
        return hiv;
    }
    /**
     * The attribute hiv of Visita_mpv. It is of type Boolean. Path: m_Paziente_ hiv.
     */
    public void setHiv(Boolean hiv) {
        this.hiv = hiv;
    }

    /**
     * The attribute hivrna_vaccinazione of Visita_mpv. It is of type Int.
     */
    public Integer getHivrna_vaccinazione() {
        return hivrna_vaccinazione;
    }
    /**
     * The attribute hivrna_vaccinazione of Visita_mpv. It is of type Int.
     */
    public void setHivrna_vaccinazione(Integer hivrna_vaccinazione) {
        this.hivrna_vaccinazione = hivrna_vaccinazione;
    }

    /**
     * The attribute hpv of Visita_mpv. It is of type Boolean.
     */
    public Boolean getHpv() {
        return hpv;
    }
    /**
     * The attribute hpv of Visita_mpv. It is of type Boolean.
     */
    public void setHpv(Boolean hpv) {
        this.hpv = hpv;
    }

    /**
     * The attribute mst of Visita_mpv. It is of type Boolean.
     */
    public Boolean getMst() {
        return mst;
    }
    /**
     * The attribute mst of Visita_mpv. It is of type Boolean.
     */
    public void setMst(Boolean mst) {
        this.mst = mst;
    }

    /**
     * The attribute note_ricovero of Visita_mpv. It is of type Text.
     */
    public String getNote_ricovero() {
        return note_ricovero;
    }
    /**
     * The attribute note_ricovero of Visita_mpv. It is of type Text.
     */
    public void setNote_ricovero(String note_ricovero) {
        this.note_ricovero = note_ricovero;
    }

    /**
     * The attribute num_dosi_mvabn of Visita_mpv. It is of type Int. Ranges: 1:2.
     */
    public Integer getNum_dosi_mvabn() {
        return num_dosi_mvabn;
    }
    /**
     * The attribute num_dosi_mvabn of Visita_mpv. It is of type Int. Ranges: 1:2.
     */
    public void setNum_dosi_mvabn(Integer num_dosi_mvabn) {
        this.num_dosi_mvabn = num_dosi_mvabn;
    }

    /**
     * The attribute num_visite of Visita_mpv. It is of type Int. Path: m_Paziente_ num_visite. Cannot be null.
     */
    public Integer getNum_visite() {
        return num_visite;
    }
    /**
     * The attribute num_visite of Visita_mpv. It is of type Int. Path: m_Paziente_ num_visite. Cannot be null.
     */
    public void setNum_visite(Integer num_visite) {
        this.num_visite = num_visite;
    }

    /**
     * The attribute paziente_ico of Visita_mpv. It is of type String. Path: paziente_ codice_interno. Cannot be null.
     */
    public String getPaziente_ico() {
        return paziente_ico;
    }
    /**
     * The attribute paziente_ico of Visita_mpv. It is of type String. Path: paziente_ codice_interno. Cannot be null.
     */
    public void setPaziente_ico(String paziente_ico) {
        this.paziente_ico = paziente_ico;
    }

    /**
     * The attribute ricovero of Visita_mpv. It is of type Boolean.
     */
    public Boolean getRicovero() {
        return ricovero;
    }
    /**
     * The attribute ricovero of Visita_mpv. It is of type Boolean.
     */
    public void setRicovero(Boolean ricovero) {
        this.ricovero = ricovero;
    }

    /**
     * The attribute sifilide of Visita_mpv. It is of type Boolean.
     */
    public Boolean getSifilide() {
        return sifilide;
    }
    /**
     * The attribute sifilide of Visita_mpv. It is of type Boolean.
     */
    public void setSifilide(Boolean sifilide) {
        this.sifilide = sifilide;
    }

    /**
     * The attribute tipo_visita of Visita_mpv. It is of type String. Path: tipo_visita_mp_ nome. Cannot be null.
     */
    public String getTipo_visita() {
        return tipo_visita;
    }
    /**
     * The attribute tipo_visita of Visita_mpv. It is of type String. Path: tipo_visita_mp_ nome. Cannot be null.
     */
    public void setTipo_visita(String tipo_visita) {
        this.tipo_visita = tipo_visita;
    }

    /**
     * The attribute tipo_visita_booster of Visita_mpv. It is of type String. Path: tipo_visita_mp_booster nome. Cannot be null.
     */
    public String getTipo_visita_booster() {
        return tipo_visita_booster;
    }
    /**
     * The attribute tipo_visita_booster of Visita_mpv. It is of type String. Path: tipo_visita_mp_booster nome. Cannot be null.
     */
    public void setTipo_visita_booster(String tipo_visita_booster) {
        this.tipo_visita_booster = tipo_visita_booster;
    }

    /**
     * The attribute vac_mvabn_22_23 of Visita_mpv. It is of type String. Domain: Si OR No OR Non so.}Max length: 255.
     */
    public String getVac_mvabn_22_23() {
        return vac_mvabn_22_23;
    }
    /**
     * The attribute vac_mvabn_22_23 of Visita_mpv. It is of type String. Domain: Si OR No OR Non so.}Max length: 255.
     */
    public void setVac_mvabn_22_23(String vac_mvabn_22_23) {
        this.vac_mvabn_22_23 = vac_mvabn_22_23;
    }

    /**
     * The attribute vac_vaiolo_pre of Visita_mpv. It is of type String. Domain: Si OR No OR Non so.}Max length: 255.
     */
    public String getVac_vaiolo_pre() {
        return vac_vaiolo_pre;
    }
    /**
     * The attribute vac_vaiolo_pre of Visita_mpv. It is of type String. Domain: Si OR No OR Non so.}Max length: 255.
     */
    public void setVac_vaiolo_pre(String vac_vaiolo_pre) {
        this.vac_vaiolo_pre = vac_vaiolo_pre;
    }

    /**
     * The associated object for the role centro_provenienza_.
     */
    public CliCentro_provenienzaDTO getCentro_provenienza_() {
        return centro_provenienza_;
    }
    /**
     * The associated object for the role centro_provenienza_.
     */
    public void setCentro_provenienza_(CliCentro_provenienzaDTO centro_provenienza_) {
        this.centro_provenienza_ = centro_provenienza_;
    }

    /**
     * The associated object for the role gruppo_.
     */
    public CliGruppoDTO getGruppo_() {
        return gruppo_;
    }
    /**
     * The associated object for the role gruppo_.
     */
    public void setGruppo_(CliGruppoDTO gruppo_) {
        this.gruppo_ = gruppo_;
    }

    /**
     * The associated object for the role modalita_somministrazione_pre1.
     */
    public CliModalita_somministrazioneDTO getModalita_somministrazione_pre1() {
        return modalita_somministrazione_pre1;
    }
    /**
     * The associated object for the role modalita_somministrazione_pre1.
     */
    public void setModalita_somministrazione_pre1(CliModalita_somministrazioneDTO modalita_somministrazione_pre1) {
        this.modalita_somministrazione_pre1 = modalita_somministrazione_pre1;
    }

    /**
     * The associated object for the role modalita_somministrazione_pre2.
     */
    public CliModalita_somministrazioneDTO getModalita_somministrazione_pre2() {
        return modalita_somministrazione_pre2;
    }
    /**
     * The associated object for the role modalita_somministrazione_pre2.
     */
    public void setModalita_somministrazione_pre2(CliModalita_somministrazioneDTO modalita_somministrazione_pre2) {
        this.modalita_somministrazione_pre2 = modalita_somministrazione_pre2;
    }

    /**
     * The associated object for the role tipo_visita_mp_.
     */
    public CliTipo_visita_mpvDTO getTipo_visita_mp_() {
        return tipo_visita_mp_;
    }
    /**
     * The associated object for the role tipo_visita_mp_.
     */
    public void setTipo_visita_mp_(CliTipo_visita_mpvDTO tipo_visita_mp_) {
        this.tipo_visita_mp_ = tipo_visita_mp_;
    }

    /**
     * The associated object for the role tipo_visita_mp_booster.
     */
    public CliTipo_visita_mpvDTO getTipo_visita_mp_booster() {
        return tipo_visita_mp_booster;
    }
    /**
     * The associated object for the role tipo_visita_mp_booster.
     */
    public void setTipo_visita_mp_booster(CliTipo_visita_mpvDTO tipo_visita_mp_booster) {
        this.tipo_visita_mp_booster = tipo_visita_mp_booster;
    }

    /**
     * The associated object for the role paziente_.
     */
    public CliPazienteDTO getPaziente_() {
        return paziente_;
    }
    /**
     * The associated object for the role paziente_.
     */
    public void setPaziente_(CliPazienteDTO paziente_) {
        this.paziente_ = paziente_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
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
        if (centro_provenienza_ != null) {
            joiner.add("centro_provenienza_: " + GraphQLRequestSerializer.getEntry(centro_provenienza_));
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
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliVisita_mpvDTO.Builder builder() {
        return new CliVisita_mpvDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
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
        private CliCentro_provenienzaDTO centro_provenienza_;
        private CliGruppoDTO gruppo_;
        private CliModalita_somministrazioneDTO modalita_somministrazione_pre1;
        private CliModalita_somministrazioneDTO modalita_somministrazione_pre2;
        private CliTipo_visita_mpvDTO tipo_visita_mp_;
        private CliTipo_visita_mpvDTO tipo_visita_mp_booster;
        private CliPazienteDTO paziente_;

        public Builder() {
        }

        /**
         * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
         */
        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        /**
         * The attribute _id of Visita_mpv. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute arruolamento of Visita_mpv. It is of type Boolean.
         */
        public Builder setArruolamento(Boolean arruolamento) {
            this.arruolamento = arruolamento;
            return this;
        }

        /**
         * The attribute arruolamento_effettuato of Visita_mpv. It is of type Boolean. Path: m_Paziente_ arruolamento_effettuato.
         */
        public Builder setArruolamento_effettuato(Boolean arruolamento_effettuato) {
            this.arruolamento_effettuato = arruolamento_effettuato;
            return this;
        }

        /**
         * The attribute cd4_vaccinazione of Visita_mpv. It is of type Int.
         */
        public Builder setCd4_vaccinazione(Integer cd4_vaccinazione) {
            this.cd4_vaccinazione = cd4_vaccinazione;
            return this;
        }

        /**
         * The attribute centro_prov of Visita_mpv. It is of type String. Max length: 255.
         */
        public Builder setCentro_prov(String centro_prov) {
            this.centro_prov = centro_prov;
            return this;
        }

        /**
         * The attribute chemsex of Visita_mpv. It is of type Boolean.
         */
        public Builder setChemsex(Boolean chemsex) {
            this.chemsex = chemsex;
            return this;
        }

        /**
         * The attribute chlamydia of Visita_mpv. It is of type Boolean.
         */
        public Builder setChlamydia(Boolean chlamydia) {
            this.chlamydia = chlamydia;
            return this;
        }

        /**
         * The attribute contatti_mpox of Visita_mpv. It is of type Boolean.
         */
        public Builder setContatti_mpox(Boolean contatti_mpox) {
            this.contatti_mpox = contatti_mpox;
            return this;
        }

        /**
         * The attribute data of Visita_mpv. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute data_chlamydia of Visita_mpv. It is of type Date @dateFormat.
         */
        public Builder setData_chlamydia(String data_chlamydia) {
            this.data_chlamydia = data_chlamydia;
            return this;
        }

        /**
         * The attribute data_contatto_mpox of Visita_mpv. It is of type Date @dateFormat.
         */
        public Builder setData_contatto_mpox(String data_contatto_mpox) {
            this.data_contatto_mpox = data_contatto_mpox;
            return this;
        }

        /**
         * The attribute data_gonorrea of Visita_mpv. It is of type Date @dateFormat.
         */
        public Builder setData_gonorrea(String data_gonorrea) {
            this.data_gonorrea = data_gonorrea;
            return this;
        }

        /**
         * The attribute data_hpv of Visita_mpv. It is of type Date @dateFormat.
         */
        public Builder setData_hpv(String data_hpv) {
            this.data_hpv = data_hpv;
            return this;
        }

        /**
         * The attribute data_mvabn_pre1 of Visita_mpv. It is of type Date @dateFormat.
         */
        public Builder setData_mvabn_pre1(String data_mvabn_pre1) {
            this.data_mvabn_pre1 = data_mvabn_pre1;
            return this;
        }

        /**
         * The attribute data_mvabn_pre2 of Visita_mpv. It is of type Date @dateFormat.
         */
        public Builder setData_mvabn_pre2(String data_mvabn_pre2) {
            this.data_mvabn_pre2 = data_mvabn_pre2;
            return this;
        }

        /**
         * The attribute data_sifilide of Visita_mpv. It is of type Date @dateFormat.
         */
        public Builder setData_sifilide(String data_sifilide) {
            this.data_sifilide = data_sifilide;
            return this;
        }

        /**
         * The attribute gonorrea of Visita_mpv. It is of type Boolean.
         */
        public Builder setGonorrea(Boolean gonorrea) {
            this.gonorrea = gonorrea;
            return this;
        }

        /**
         * The attribute gruppo_appartenenza of Visita_mpv. It is of type String. Path: gruppo_ nome. Cannot be null.
         */
        public Builder setGruppo_appartenenza(String gruppo_appartenenza) {
            this.gruppo_appartenenza = gruppo_appartenenza;
            return this;
        }

        /**
         * The attribute hiv of Visita_mpv. It is of type Boolean. Path: m_Paziente_ hiv.
         */
        public Builder setHiv(Boolean hiv) {
            this.hiv = hiv;
            return this;
        }

        /**
         * The attribute hivrna_vaccinazione of Visita_mpv. It is of type Int.
         */
        public Builder setHivrna_vaccinazione(Integer hivrna_vaccinazione) {
            this.hivrna_vaccinazione = hivrna_vaccinazione;
            return this;
        }

        /**
         * The attribute hpv of Visita_mpv. It is of type Boolean.
         */
        public Builder setHpv(Boolean hpv) {
            this.hpv = hpv;
            return this;
        }

        /**
         * The attribute mst of Visita_mpv. It is of type Boolean.
         */
        public Builder setMst(Boolean mst) {
            this.mst = mst;
            return this;
        }

        /**
         * The attribute note_ricovero of Visita_mpv. It is of type Text.
         */
        public Builder setNote_ricovero(String note_ricovero) {
            this.note_ricovero = note_ricovero;
            return this;
        }

        /**
         * The attribute num_dosi_mvabn of Visita_mpv. It is of type Int. Ranges: 1:2.
         */
        public Builder setNum_dosi_mvabn(Integer num_dosi_mvabn) {
            this.num_dosi_mvabn = num_dosi_mvabn;
            return this;
        }

        /**
         * The attribute num_visite of Visita_mpv. It is of type Int. Path: m_Paziente_ num_visite. Cannot be null.
         */
        public Builder setNum_visite(Integer num_visite) {
            this.num_visite = num_visite;
            return this;
        }

        /**
         * The attribute paziente_ico of Visita_mpv. It is of type String. Path: paziente_ codice_interno. Cannot be null.
         */
        public Builder setPaziente_ico(String paziente_ico) {
            this.paziente_ico = paziente_ico;
            return this;
        }

        /**
         * The attribute ricovero of Visita_mpv. It is of type Boolean.
         */
        public Builder setRicovero(Boolean ricovero) {
            this.ricovero = ricovero;
            return this;
        }

        /**
         * The attribute sifilide of Visita_mpv. It is of type Boolean.
         */
        public Builder setSifilide(Boolean sifilide) {
            this.sifilide = sifilide;
            return this;
        }

        /**
         * The attribute tipo_visita of Visita_mpv. It is of type String. Path: tipo_visita_mp_ nome. Cannot be null.
         */
        public Builder setTipo_visita(String tipo_visita) {
            this.tipo_visita = tipo_visita;
            return this;
        }

        /**
         * The attribute tipo_visita_booster of Visita_mpv. It is of type String. Path: tipo_visita_mp_booster nome. Cannot be null.
         */
        public Builder setTipo_visita_booster(String tipo_visita_booster) {
            this.tipo_visita_booster = tipo_visita_booster;
            return this;
        }

        /**
         * The attribute vac_mvabn_22_23 of Visita_mpv. It is of type String. Domain: Si OR No OR Non so.}Max length: 255.
         */
        public Builder setVac_mvabn_22_23(String vac_mvabn_22_23) {
            this.vac_mvabn_22_23 = vac_mvabn_22_23;
            return this;
        }

        /**
         * The attribute vac_vaiolo_pre of Visita_mpv. It is of type String. Domain: Si OR No OR Non so.}Max length: 255.
         */
        public Builder setVac_vaiolo_pre(String vac_vaiolo_pre) {
            this.vac_vaiolo_pre = vac_vaiolo_pre;
            return this;
        }

        /**
         * The associated object for the role centro_provenienza_.
         */
        public Builder setCentro_provenienza_(CliCentro_provenienzaDTO centro_provenienza_) {
            this.centro_provenienza_ = centro_provenienza_;
            return this;
        }

        /**
         * The associated object for the role gruppo_.
         */
        public Builder setGruppo_(CliGruppoDTO gruppo_) {
            this.gruppo_ = gruppo_;
            return this;
        }

        /**
         * The associated object for the role modalita_somministrazione_pre1.
         */
        public Builder setModalita_somministrazione_pre1(CliModalita_somministrazioneDTO modalita_somministrazione_pre1) {
            this.modalita_somministrazione_pre1 = modalita_somministrazione_pre1;
            return this;
        }

        /**
         * The associated object for the role modalita_somministrazione_pre2.
         */
        public Builder setModalita_somministrazione_pre2(CliModalita_somministrazioneDTO modalita_somministrazione_pre2) {
            this.modalita_somministrazione_pre2 = modalita_somministrazione_pre2;
            return this;
        }

        /**
         * The associated object for the role tipo_visita_mp_.
         */
        public Builder setTipo_visita_mp_(CliTipo_visita_mpvDTO tipo_visita_mp_) {
            this.tipo_visita_mp_ = tipo_visita_mp_;
            return this;
        }

        /**
         * The associated object for the role tipo_visita_mp_booster.
         */
        public Builder setTipo_visita_mp_booster(CliTipo_visita_mpvDTO tipo_visita_mp_booster) {
            this.tipo_visita_mp_booster = tipo_visita_mp_booster;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliVisita_mpvDTO build() {
            CliVisita_mpvDTO result = new CliVisita_mpvDTO();
            result.set_clientId(this._clientId);
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
            result.setCentro_provenienza_(this.centro_provenienza_);
            result.setGruppo_(this.gruppo_);
            result.setModalita_somministrazione_pre1(this.modalita_somministrazione_pre1);
            result.setModalita_somministrazione_pre2(this.modalita_somministrazione_pre2);
            result.setTipo_visita_mp_(this.tipo_visita_mp_);
            result.setTipo_visita_mp_booster(this.tipo_visita_mp_booster);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
