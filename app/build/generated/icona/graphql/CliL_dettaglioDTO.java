package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class L_dettaglio, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliL_dettaglioDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Boolean altezza;
    private Boolean chimica;
    private String data;
    private Boolean eventi_clinici;
    private Boolean flag_altezza;
    private Boolean flag_chimica;
    private Boolean flag_eventi_clinici;
    private Boolean flag_peso;
    private Boolean flag_plasma_raccolto;
    private Boolean flag_presentato;
    private Boolean flag_questionari;
    private Boolean flag_sangue_intero_raccolto;
    private Boolean flag_viro_immun;
    private Integer mese;
    private Boolean peso;
    private Boolean plasma_raccolto;
    private Boolean presentato;
    private Boolean questionari;
    private Boolean sangue_intero_raccolto;
    private String tempo_visita;
    private Boolean viro_immun;
    private CliTempo_visitaDTO tempo_visita_;
    private CliH_PazienteDTO h_Paziente_;
    private CliPazienteDTO paziente_;

    public CliL_dettaglioDTO() {
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
     * The attribute _id of L_dettaglio. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of L_dettaglio. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altezza of L_dettaglio. It is of type Boolean.
     */
    public Boolean getAltezza() {
        return altezza;
    }
    /**
     * The attribute altezza of L_dettaglio. It is of type Boolean.
     */
    public void setAltezza(Boolean altezza) {
        this.altezza = altezza;
    }

    /**
     * The attribute chimica of L_dettaglio. It is of type Boolean.
     */
    public Boolean getChimica() {
        return chimica;
    }
    /**
     * The attribute chimica of L_dettaglio. It is of type Boolean.
     */
    public void setChimica(Boolean chimica) {
        this.chimica = chimica;
    }

    /**
     * The attribute data of L_dettaglio. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of L_dettaglio. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute eventi_clinici of L_dettaglio. It is of type Boolean.
     */
    public Boolean getEventi_clinici() {
        return eventi_clinici;
    }
    /**
     * The attribute eventi_clinici of L_dettaglio. It is of type Boolean.
     */
    public void setEventi_clinici(Boolean eventi_clinici) {
        this.eventi_clinici = eventi_clinici;
    }

    /**
     * The attribute flag_altezza of L_dettaglio. It is of type Boolean. Path: tempo_visita_ altezza. Cannot be null.
     */
    public Boolean getFlag_altezza() {
        return flag_altezza;
    }
    /**
     * The attribute flag_altezza of L_dettaglio. It is of type Boolean. Path: tempo_visita_ altezza. Cannot be null.
     */
    public void setFlag_altezza(Boolean flag_altezza) {
        this.flag_altezza = flag_altezza;
    }

    /**
     * The attribute flag_chimica of L_dettaglio. It is of type Boolean. Path: tempo_visita_ chimica. Cannot be null.
     */
    public Boolean getFlag_chimica() {
        return flag_chimica;
    }
    /**
     * The attribute flag_chimica of L_dettaglio. It is of type Boolean. Path: tempo_visita_ chimica. Cannot be null.
     */
    public void setFlag_chimica(Boolean flag_chimica) {
        this.flag_chimica = flag_chimica;
    }

    /**
     * The attribute flag_eventi_clinici of L_dettaglio. It is of type Boolean. Path: tempo_visita_ eventi_clinici. Cannot be null.
     */
    public Boolean getFlag_eventi_clinici() {
        return flag_eventi_clinici;
    }
    /**
     * The attribute flag_eventi_clinici of L_dettaglio. It is of type Boolean. Path: tempo_visita_ eventi_clinici. Cannot be null.
     */
    public void setFlag_eventi_clinici(Boolean flag_eventi_clinici) {
        this.flag_eventi_clinici = flag_eventi_clinici;
    }

    /**
     * The attribute flag_peso of L_dettaglio. It is of type Boolean. Path: tempo_visita_ peso. Cannot be null.
     */
    public Boolean getFlag_peso() {
        return flag_peso;
    }
    /**
     * The attribute flag_peso of L_dettaglio. It is of type Boolean. Path: tempo_visita_ peso. Cannot be null.
     */
    public void setFlag_peso(Boolean flag_peso) {
        this.flag_peso = flag_peso;
    }

    /**
     * The attribute flag_plasma_raccolto of L_dettaglio. It is of type Boolean. Path: tempo_visita_ plasma_raccolto. Cannot be null.
     */
    public Boolean getFlag_plasma_raccolto() {
        return flag_plasma_raccolto;
    }
    /**
     * The attribute flag_plasma_raccolto of L_dettaglio. It is of type Boolean. Path: tempo_visita_ plasma_raccolto. Cannot be null.
     */
    public void setFlag_plasma_raccolto(Boolean flag_plasma_raccolto) {
        this.flag_plasma_raccolto = flag_plasma_raccolto;
    }

    /**
     * The attribute flag_presentato of L_dettaglio. It is of type Boolean. Path: tempo_visita_ presentato. Cannot be null.
     */
    public Boolean getFlag_presentato() {
        return flag_presentato;
    }
    /**
     * The attribute flag_presentato of L_dettaglio. It is of type Boolean. Path: tempo_visita_ presentato. Cannot be null.
     */
    public void setFlag_presentato(Boolean flag_presentato) {
        this.flag_presentato = flag_presentato;
    }

    /**
     * The attribute flag_questionari of L_dettaglio. It is of type Boolean. Path: tempo_visita_ questionari. Cannot be null.
     */
    public Boolean getFlag_questionari() {
        return flag_questionari;
    }
    /**
     * The attribute flag_questionari of L_dettaglio. It is of type Boolean. Path: tempo_visita_ questionari. Cannot be null.
     */
    public void setFlag_questionari(Boolean flag_questionari) {
        this.flag_questionari = flag_questionari;
    }

    /**
     * The attribute flag_sangue_intero_raccolto of L_dettaglio. It is of type Boolean. Path: tempo_visita_ sangue_intero_raccolto. Cannot be null.
     */
    public Boolean getFlag_sangue_intero_raccolto() {
        return flag_sangue_intero_raccolto;
    }
    /**
     * The attribute flag_sangue_intero_raccolto of L_dettaglio. It is of type Boolean. Path: tempo_visita_ sangue_intero_raccolto. Cannot be null.
     */
    public void setFlag_sangue_intero_raccolto(Boolean flag_sangue_intero_raccolto) {
        this.flag_sangue_intero_raccolto = flag_sangue_intero_raccolto;
    }

    /**
     * The attribute flag_viro_immun of L_dettaglio. It is of type Boolean. Path: tempo_visita_ viro_immun. Cannot be null.
     */
    public Boolean getFlag_viro_immun() {
        return flag_viro_immun;
    }
    /**
     * The attribute flag_viro_immun of L_dettaglio. It is of type Boolean. Path: tempo_visita_ viro_immun. Cannot be null.
     */
    public void setFlag_viro_immun(Boolean flag_viro_immun) {
        this.flag_viro_immun = flag_viro_immun;
    }

    /**
     * The attribute mese of L_dettaglio. It is of type Int. Path: tempo_visita_ mese. Cannot be null.
     */
    public Integer getMese() {
        return mese;
    }
    /**
     * The attribute mese of L_dettaglio. It is of type Int. Path: tempo_visita_ mese. Cannot be null.
     */
    public void setMese(Integer mese) {
        this.mese = mese;
    }

    /**
     * The attribute peso of L_dettaglio. It is of type Boolean.
     */
    public Boolean getPeso() {
        return peso;
    }
    /**
     * The attribute peso of L_dettaglio. It is of type Boolean.
     */
    public void setPeso(Boolean peso) {
        this.peso = peso;
    }

    /**
     * The attribute plasma_raccolto of L_dettaglio. It is of type Boolean.
     */
    public Boolean getPlasma_raccolto() {
        return plasma_raccolto;
    }
    /**
     * The attribute plasma_raccolto of L_dettaglio. It is of type Boolean.
     */
    public void setPlasma_raccolto(Boolean plasma_raccolto) {
        this.plasma_raccolto = plasma_raccolto;
    }

    /**
     * The attribute presentato of L_dettaglio. It is of type Boolean.
     */
    public Boolean getPresentato() {
        return presentato;
    }
    /**
     * The attribute presentato of L_dettaglio. It is of type Boolean.
     */
    public void setPresentato(Boolean presentato) {
        this.presentato = presentato;
    }

    /**
     * The attribute questionari of L_dettaglio. It is of type Boolean.
     */
    public Boolean getQuestionari() {
        return questionari;
    }
    /**
     * The attribute questionari of L_dettaglio. It is of type Boolean.
     */
    public void setQuestionari(Boolean questionari) {
        this.questionari = questionari;
    }

    /**
     * The attribute sangue_intero_raccolto of L_dettaglio. It is of type Boolean.
     */
    public Boolean getSangue_intero_raccolto() {
        return sangue_intero_raccolto;
    }
    /**
     * The attribute sangue_intero_raccolto of L_dettaglio. It is of type Boolean.
     */
    public void setSangue_intero_raccolto(Boolean sangue_intero_raccolto) {
        this.sangue_intero_raccolto = sangue_intero_raccolto;
    }

    /**
     * The attribute tempo_visita of L_dettaglio. It is of type String. Path: tempo_visita_ name. Cannot be null.
     */
    public String getTempo_visita() {
        return tempo_visita;
    }
    /**
     * The attribute tempo_visita of L_dettaglio. It is of type String. Path: tempo_visita_ name. Cannot be null.
     */
    public void setTempo_visita(String tempo_visita) {
        this.tempo_visita = tempo_visita;
    }

    /**
     * The attribute viro_immun of L_dettaglio. It is of type Boolean.
     */
    public Boolean getViro_immun() {
        return viro_immun;
    }
    /**
     * The attribute viro_immun of L_dettaglio. It is of type Boolean.
     */
    public void setViro_immun(Boolean viro_immun) {
        this.viro_immun = viro_immun;
    }

    /**
     * The associated object for the role tempo_visita_.
     */
    public CliTempo_visitaDTO getTempo_visita_() {
        return tempo_visita_;
    }
    /**
     * The associated object for the role tempo_visita_.
     */
    public void setTempo_visita_(CliTempo_visitaDTO tempo_visita_) {
        this.tempo_visita_ = tempo_visita_;
    }

    /**
     * The associated object for the role h_Paziente_.
     */
    public CliH_PazienteDTO getH_Paziente_() {
        return h_Paziente_;
    }
    /**
     * The associated object for the role h_Paziente_.
     */
    public void setH_Paziente_(CliH_PazienteDTO h_Paziente_) {
        this.h_Paziente_ = h_Paziente_;
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
        if (altezza != null) {
            joiner.add("altezza: " + GraphQLRequestSerializer.getEntry(altezza));
        }
        if (chimica != null) {
            joiner.add("chimica: " + GraphQLRequestSerializer.getEntry(chimica));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (eventi_clinici != null) {
            joiner.add("eventi_clinici: " + GraphQLRequestSerializer.getEntry(eventi_clinici));
        }
        if (flag_altezza != null) {
            joiner.add("flag_altezza: " + GraphQLRequestSerializer.getEntry(flag_altezza));
        }
        if (flag_chimica != null) {
            joiner.add("flag_chimica: " + GraphQLRequestSerializer.getEntry(flag_chimica));
        }
        if (flag_eventi_clinici != null) {
            joiner.add("flag_eventi_clinici: " + GraphQLRequestSerializer.getEntry(flag_eventi_clinici));
        }
        if (flag_peso != null) {
            joiner.add("flag_peso: " + GraphQLRequestSerializer.getEntry(flag_peso));
        }
        if (flag_plasma_raccolto != null) {
            joiner.add("flag_plasma_raccolto: " + GraphQLRequestSerializer.getEntry(flag_plasma_raccolto));
        }
        if (flag_presentato != null) {
            joiner.add("flag_presentato: " + GraphQLRequestSerializer.getEntry(flag_presentato));
        }
        if (flag_questionari != null) {
            joiner.add("flag_questionari: " + GraphQLRequestSerializer.getEntry(flag_questionari));
        }
        if (flag_sangue_intero_raccolto != null) {
            joiner.add("flag_sangue_intero_raccolto: " + GraphQLRequestSerializer.getEntry(flag_sangue_intero_raccolto));
        }
        if (flag_viro_immun != null) {
            joiner.add("flag_viro_immun: " + GraphQLRequestSerializer.getEntry(flag_viro_immun));
        }
        if (mese != null) {
            joiner.add("mese: " + GraphQLRequestSerializer.getEntry(mese));
        }
        if (peso != null) {
            joiner.add("peso: " + GraphQLRequestSerializer.getEntry(peso));
        }
        if (plasma_raccolto != null) {
            joiner.add("plasma_raccolto: " + GraphQLRequestSerializer.getEntry(plasma_raccolto));
        }
        if (presentato != null) {
            joiner.add("presentato: " + GraphQLRequestSerializer.getEntry(presentato));
        }
        if (questionari != null) {
            joiner.add("questionari: " + GraphQLRequestSerializer.getEntry(questionari));
        }
        if (sangue_intero_raccolto != null) {
            joiner.add("sangue_intero_raccolto: " + GraphQLRequestSerializer.getEntry(sangue_intero_raccolto));
        }
        if (tempo_visita != null) {
            joiner.add("tempo_visita: " + GraphQLRequestSerializer.getEntry(tempo_visita));
        }
        if (viro_immun != null) {
            joiner.add("viro_immun: " + GraphQLRequestSerializer.getEntry(viro_immun));
        }
        if (tempo_visita_ != null) {
            joiner.add("tempo_visita_: " + GraphQLRequestSerializer.getEntry(tempo_visita_));
        }
        if (h_Paziente_ != null) {
            joiner.add("h_Paziente_: " + GraphQLRequestSerializer.getEntry(h_Paziente_));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliL_dettaglioDTO.Builder builder() {
        return new CliL_dettaglioDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Boolean altezza;
        private Boolean chimica;
        private String data;
        private Boolean eventi_clinici;
        private Boolean flag_altezza;
        private Boolean flag_chimica;
        private Boolean flag_eventi_clinici;
        private Boolean flag_peso;
        private Boolean flag_plasma_raccolto;
        private Boolean flag_presentato;
        private Boolean flag_questionari;
        private Boolean flag_sangue_intero_raccolto;
        private Boolean flag_viro_immun;
        private Integer mese;
        private Boolean peso;
        private Boolean plasma_raccolto;
        private Boolean presentato;
        private Boolean questionari;
        private Boolean sangue_intero_raccolto;
        private String tempo_visita;
        private Boolean viro_immun;
        private CliTempo_visitaDTO tempo_visita_;
        private CliH_PazienteDTO h_Paziente_;
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
         * The attribute _id of L_dettaglio. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altezza of L_dettaglio. It is of type Boolean.
         */
        public Builder setAltezza(Boolean altezza) {
            this.altezza = altezza;
            return this;
        }

        /**
         * The attribute chimica of L_dettaglio. It is of type Boolean.
         */
        public Builder setChimica(Boolean chimica) {
            this.chimica = chimica;
            return this;
        }

        /**
         * The attribute data of L_dettaglio. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute eventi_clinici of L_dettaglio. It is of type Boolean.
         */
        public Builder setEventi_clinici(Boolean eventi_clinici) {
            this.eventi_clinici = eventi_clinici;
            return this;
        }

        /**
         * The attribute flag_altezza of L_dettaglio. It is of type Boolean. Path: tempo_visita_ altezza. Cannot be null.
         */
        public Builder setFlag_altezza(Boolean flag_altezza) {
            this.flag_altezza = flag_altezza;
            return this;
        }

        /**
         * The attribute flag_chimica of L_dettaglio. It is of type Boolean. Path: tempo_visita_ chimica. Cannot be null.
         */
        public Builder setFlag_chimica(Boolean flag_chimica) {
            this.flag_chimica = flag_chimica;
            return this;
        }

        /**
         * The attribute flag_eventi_clinici of L_dettaglio. It is of type Boolean. Path: tempo_visita_ eventi_clinici. Cannot be null.
         */
        public Builder setFlag_eventi_clinici(Boolean flag_eventi_clinici) {
            this.flag_eventi_clinici = flag_eventi_clinici;
            return this;
        }

        /**
         * The attribute flag_peso of L_dettaglio. It is of type Boolean. Path: tempo_visita_ peso. Cannot be null.
         */
        public Builder setFlag_peso(Boolean flag_peso) {
            this.flag_peso = flag_peso;
            return this;
        }

        /**
         * The attribute flag_plasma_raccolto of L_dettaglio. It is of type Boolean. Path: tempo_visita_ plasma_raccolto. Cannot be null.
         */
        public Builder setFlag_plasma_raccolto(Boolean flag_plasma_raccolto) {
            this.flag_plasma_raccolto = flag_plasma_raccolto;
            return this;
        }

        /**
         * The attribute flag_presentato of L_dettaglio. It is of type Boolean. Path: tempo_visita_ presentato. Cannot be null.
         */
        public Builder setFlag_presentato(Boolean flag_presentato) {
            this.flag_presentato = flag_presentato;
            return this;
        }

        /**
         * The attribute flag_questionari of L_dettaglio. It is of type Boolean. Path: tempo_visita_ questionari. Cannot be null.
         */
        public Builder setFlag_questionari(Boolean flag_questionari) {
            this.flag_questionari = flag_questionari;
            return this;
        }

        /**
         * The attribute flag_sangue_intero_raccolto of L_dettaglio. It is of type Boolean. Path: tempo_visita_ sangue_intero_raccolto. Cannot be null.
         */
        public Builder setFlag_sangue_intero_raccolto(Boolean flag_sangue_intero_raccolto) {
            this.flag_sangue_intero_raccolto = flag_sangue_intero_raccolto;
            return this;
        }

        /**
         * The attribute flag_viro_immun of L_dettaglio. It is of type Boolean. Path: tempo_visita_ viro_immun. Cannot be null.
         */
        public Builder setFlag_viro_immun(Boolean flag_viro_immun) {
            this.flag_viro_immun = flag_viro_immun;
            return this;
        }

        /**
         * The attribute mese of L_dettaglio. It is of type Int. Path: tempo_visita_ mese. Cannot be null.
         */
        public Builder setMese(Integer mese) {
            this.mese = mese;
            return this;
        }

        /**
         * The attribute peso of L_dettaglio. It is of type Boolean.
         */
        public Builder setPeso(Boolean peso) {
            this.peso = peso;
            return this;
        }

        /**
         * The attribute plasma_raccolto of L_dettaglio. It is of type Boolean.
         */
        public Builder setPlasma_raccolto(Boolean plasma_raccolto) {
            this.plasma_raccolto = plasma_raccolto;
            return this;
        }

        /**
         * The attribute presentato of L_dettaglio. It is of type Boolean.
         */
        public Builder setPresentato(Boolean presentato) {
            this.presentato = presentato;
            return this;
        }

        /**
         * The attribute questionari of L_dettaglio. It is of type Boolean.
         */
        public Builder setQuestionari(Boolean questionari) {
            this.questionari = questionari;
            return this;
        }

        /**
         * The attribute sangue_intero_raccolto of L_dettaglio. It is of type Boolean.
         */
        public Builder setSangue_intero_raccolto(Boolean sangue_intero_raccolto) {
            this.sangue_intero_raccolto = sangue_intero_raccolto;
            return this;
        }

        /**
         * The attribute tempo_visita of L_dettaglio. It is of type String. Path: tempo_visita_ name. Cannot be null.
         */
        public Builder setTempo_visita(String tempo_visita) {
            this.tempo_visita = tempo_visita;
            return this;
        }

        /**
         * The attribute viro_immun of L_dettaglio. It is of type Boolean.
         */
        public Builder setViro_immun(Boolean viro_immun) {
            this.viro_immun = viro_immun;
            return this;
        }

        /**
         * The associated object for the role tempo_visita_.
         */
        public Builder setTempo_visita_(CliTempo_visitaDTO tempo_visita_) {
            this.tempo_visita_ = tempo_visita_;
            return this;
        }

        /**
         * The associated object for the role h_Paziente_.
         */
        public Builder setH_Paziente_(CliH_PazienteDTO h_Paziente_) {
            this.h_Paziente_ = h_Paziente_;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliL_dettaglioDTO build() {
            CliL_dettaglioDTO result = new CliL_dettaglioDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAltezza(this.altezza);
            result.setChimica(this.chimica);
            result.setData(this.data);
            result.setEventi_clinici(this.eventi_clinici);
            result.setFlag_altezza(this.flag_altezza);
            result.setFlag_chimica(this.flag_chimica);
            result.setFlag_eventi_clinici(this.flag_eventi_clinici);
            result.setFlag_peso(this.flag_peso);
            result.setFlag_plasma_raccolto(this.flag_plasma_raccolto);
            result.setFlag_presentato(this.flag_presentato);
            result.setFlag_questionari(this.flag_questionari);
            result.setFlag_sangue_intero_raccolto(this.flag_sangue_intero_raccolto);
            result.setFlag_viro_immun(this.flag_viro_immun);
            result.setMese(this.mese);
            result.setPeso(this.peso);
            result.setPlasma_raccolto(this.plasma_raccolto);
            result.setPresentato(this.presentato);
            result.setQuestionari(this.questionari);
            result.setSangue_intero_raccolto(this.sangue_intero_raccolto);
            result.setTempo_visita(this.tempo_visita);
            result.setViro_immun(this.viro_immun);
            result.setTempo_visita_(this.tempo_visita_);
            result.setH_Paziente_(this.h_Paziente_);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
