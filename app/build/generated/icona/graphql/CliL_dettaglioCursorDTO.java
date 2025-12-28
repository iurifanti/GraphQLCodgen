package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
L_dettaglio.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliL_dettaglioCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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

    public CliL_dettaglioCursorDTO() {
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

    public Boolean getFlag_altezza() {
        return flag_altezza;
    }
    public void setFlag_altezza(Boolean flag_altezza) {
        this.flag_altezza = flag_altezza;
    }

    public Boolean getFlag_chimica() {
        return flag_chimica;
    }
    public void setFlag_chimica(Boolean flag_chimica) {
        this.flag_chimica = flag_chimica;
    }

    public Boolean getFlag_eventi_clinici() {
        return flag_eventi_clinici;
    }
    public void setFlag_eventi_clinici(Boolean flag_eventi_clinici) {
        this.flag_eventi_clinici = flag_eventi_clinici;
    }

    public Boolean getFlag_peso() {
        return flag_peso;
    }
    public void setFlag_peso(Boolean flag_peso) {
        this.flag_peso = flag_peso;
    }

    public Boolean getFlag_plasma_raccolto() {
        return flag_plasma_raccolto;
    }
    public void setFlag_plasma_raccolto(Boolean flag_plasma_raccolto) {
        this.flag_plasma_raccolto = flag_plasma_raccolto;
    }

    public Boolean getFlag_presentato() {
        return flag_presentato;
    }
    public void setFlag_presentato(Boolean flag_presentato) {
        this.flag_presentato = flag_presentato;
    }

    public Boolean getFlag_questionari() {
        return flag_questionari;
    }
    public void setFlag_questionari(Boolean flag_questionari) {
        this.flag_questionari = flag_questionari;
    }

    public Boolean getFlag_sangue_intero_raccolto() {
        return flag_sangue_intero_raccolto;
    }
    public void setFlag_sangue_intero_raccolto(Boolean flag_sangue_intero_raccolto) {
        this.flag_sangue_intero_raccolto = flag_sangue_intero_raccolto;
    }

    public Boolean getFlag_viro_immun() {
        return flag_viro_immun;
    }
    public void setFlag_viro_immun(Boolean flag_viro_immun) {
        this.flag_viro_immun = flag_viro_immun;
    }

    public Integer getMese() {
        return mese;
    }
    public void setMese(Integer mese) {
        this.mese = mese;
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

    public String getTempo_visita() {
        return tempo_visita;
    }
    public void setTempo_visita(String tempo_visita) {
        this.tempo_visita = tempo_visita;
    }

    public Boolean getViro_immun() {
        return viro_immun;
    }
    public void setViro_immun(Boolean viro_immun) {
        this.viro_immun = viro_immun;
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
        return joiner.toString();
    }

    public static CliL_dettaglioCursorDTO.Builder builder() {
        return new CliL_dettaglioCursorDTO.Builder();
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

        public Builder setFlag_altezza(Boolean flag_altezza) {
            this.flag_altezza = flag_altezza;
            return this;
        }

        public Builder setFlag_chimica(Boolean flag_chimica) {
            this.flag_chimica = flag_chimica;
            return this;
        }

        public Builder setFlag_eventi_clinici(Boolean flag_eventi_clinici) {
            this.flag_eventi_clinici = flag_eventi_clinici;
            return this;
        }

        public Builder setFlag_peso(Boolean flag_peso) {
            this.flag_peso = flag_peso;
            return this;
        }

        public Builder setFlag_plasma_raccolto(Boolean flag_plasma_raccolto) {
            this.flag_plasma_raccolto = flag_plasma_raccolto;
            return this;
        }

        public Builder setFlag_presentato(Boolean flag_presentato) {
            this.flag_presentato = flag_presentato;
            return this;
        }

        public Builder setFlag_questionari(Boolean flag_questionari) {
            this.flag_questionari = flag_questionari;
            return this;
        }

        public Builder setFlag_sangue_intero_raccolto(Boolean flag_sangue_intero_raccolto) {
            this.flag_sangue_intero_raccolto = flag_sangue_intero_raccolto;
            return this;
        }

        public Builder setFlag_viro_immun(Boolean flag_viro_immun) {
            this.flag_viro_immun = flag_viro_immun;
            return this;
        }

        public Builder setMese(Integer mese) {
            this.mese = mese;
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

        public Builder setTempo_visita(String tempo_visita) {
            this.tempo_visita = tempo_visita;
            return this;
        }

        public Builder setViro_immun(Boolean viro_immun) {
            this.viro_immun = viro_immun;
            return this;
        }


        public CliL_dettaglioCursorDTO build() {
            CliL_dettaglioCursorDTO result = new CliL_dettaglioCursorDTO();
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
            return result;
        }

    }
}
