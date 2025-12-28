package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update object of class L_dettaglio.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliL_dettaglioDraftUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private Boolean altezza;
    private Boolean chimica;
    private String data;
    private Boolean eventi_clinici;
    private Boolean peso;
    private Boolean plasma_raccolto;
    private Boolean presentato;
    private Boolean questionari;
    private Boolean sangue_intero_raccolto;
    private Boolean viro_immun;
    private CliTempo_visitaRoleRefDTO tempo_visita_;

    public CliL_dettaglioDraftUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Boolean getAltezza() {
        return altezza;
    }
    public void setAltezza(Boolean altezza) {
        this.altezza = altezza;
    }

    public Boolean getChimica() {
        return chimica;
    }
    public void setChimica(Boolean chimica) {
        this.chimica = chimica;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public Boolean getEventi_clinici() {
        return eventi_clinici;
    }
    public void setEventi_clinici(Boolean eventi_clinici) {
        this.eventi_clinici = eventi_clinici;
    }

    public Boolean getPeso() {
        return peso;
    }
    public void setPeso(Boolean peso) {
        this.peso = peso;
    }

    public Boolean getPlasma_raccolto() {
        return plasma_raccolto;
    }
    public void setPlasma_raccolto(Boolean plasma_raccolto) {
        this.plasma_raccolto = plasma_raccolto;
    }

    public Boolean getPresentato() {
        return presentato;
    }
    public void setPresentato(Boolean presentato) {
        this.presentato = presentato;
    }

    public Boolean getQuestionari() {
        return questionari;
    }
    public void setQuestionari(Boolean questionari) {
        this.questionari = questionari;
    }

    public Boolean getSangue_intero_raccolto() {
        return sangue_intero_raccolto;
    }
    public void setSangue_intero_raccolto(Boolean sangue_intero_raccolto) {
        this.sangue_intero_raccolto = sangue_intero_raccolto;
    }

    public Boolean getViro_immun() {
        return viro_immun;
    }
    public void setViro_immun(Boolean viro_immun) {
        this.viro_immun = viro_immun;
    }

    public CliTempo_visitaRoleRefDTO getTempo_visita_() {
        return tempo_visita_;
    }
    public void setTempo_visita_(CliTempo_visitaRoleRefDTO tempo_visita_) {
        this.tempo_visita_ = tempo_visita_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        if (viro_immun != null) {
            joiner.add("viro_immun: " + GraphQLRequestSerializer.getEntry(viro_immun));
        }
        if (tempo_visita_ != null) {
            joiner.add("tempo_visita_: " + GraphQLRequestSerializer.getEntry(tempo_visita_));
        }
        return joiner.toString();
    }

    public static CliL_dettaglioDraftUpdateDTO.Builder builder() {
        return new CliL_dettaglioDraftUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private Boolean altezza;
        private Boolean chimica;
        private String data;
        private Boolean eventi_clinici;
        private Boolean peso;
        private Boolean plasma_raccolto;
        private Boolean presentato;
        private Boolean questionari;
        private Boolean sangue_intero_raccolto;
        private Boolean viro_immun;
        private CliTempo_visitaRoleRefDTO tempo_visita_;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAltezza(Boolean altezza) {
            this.altezza = altezza;
            return this;
        }

        public Builder setChimica(Boolean chimica) {
            this.chimica = chimica;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setEventi_clinici(Boolean eventi_clinici) {
            this.eventi_clinici = eventi_clinici;
            return this;
        }

        public Builder setPeso(Boolean peso) {
            this.peso = peso;
            return this;
        }

        public Builder setPlasma_raccolto(Boolean plasma_raccolto) {
            this.plasma_raccolto = plasma_raccolto;
            return this;
        }

        public Builder setPresentato(Boolean presentato) {
            this.presentato = presentato;
            return this;
        }

        public Builder setQuestionari(Boolean questionari) {
            this.questionari = questionari;
            return this;
        }

        public Builder setSangue_intero_raccolto(Boolean sangue_intero_raccolto) {
            this.sangue_intero_raccolto = sangue_intero_raccolto;
            return this;
        }

        public Builder setViro_immun(Boolean viro_immun) {
            this.viro_immun = viro_immun;
            return this;
        }

        public Builder setTempo_visita_(CliTempo_visitaRoleRefDTO tempo_visita_) {
            this.tempo_visita_ = tempo_visita_;
            return this;
        }


        public CliL_dettaglioDraftUpdateDTO build() {
            CliL_dettaglioDraftUpdateDTO result = new CliL_dettaglioDraftUpdateDTO();
            result.set_id(this._id);
            result.setAltezza(this.altezza);
            result.setChimica(this.chimica);
            result.setData(this.data);
            result.setEventi_clinici(this.eventi_clinici);
            result.setPeso(this.peso);
            result.setPlasma_raccolto(this.plasma_raccolto);
            result.setPresentato(this.presentato);
            result.setQuestionari(this.questionari);
            result.setSangue_intero_raccolto(this.sangue_intero_raccolto);
            result.setViro_immun(this.viro_immun);
            result.setTempo_visita_(this.tempo_visita_);
            return result;
        }

    }
}
