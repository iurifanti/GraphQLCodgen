package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Tempo_visita, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTempo_visitaDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Boolean altezza;
    private Boolean chimica;
    private Boolean eventi_clinici;
    private Integer mese;
    private String name;
    private Boolean peso;
    private Boolean plasma_raccolto;
    private Boolean presentato;
    private Boolean questionari;
    private Boolean sangue_intero_raccolto;
    private Boolean viro_immun;

    public CliTempo_visitaDTO() {
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
     * The attribute _id of Tempo_visita. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Tempo_visita. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altezza of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public Boolean getAltezza() {
        return altezza;
    }
    /**
     * The attribute altezza of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public void setAltezza(Boolean altezza) {
        this.altezza = altezza;
    }

    /**
     * The attribute chimica of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public Boolean getChimica() {
        return chimica;
    }
    /**
     * The attribute chimica of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public void setChimica(Boolean chimica) {
        this.chimica = chimica;
    }

    /**
     * The attribute eventi_clinici of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public Boolean getEventi_clinici() {
        return eventi_clinici;
    }
    /**
     * The attribute eventi_clinici of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public void setEventi_clinici(Boolean eventi_clinici) {
        this.eventi_clinici = eventi_clinici;
    }

    /**
     * The attribute mese of Tempo_visita. It is of type Int. Cannot be null.
     */
    public Integer getMese() {
        return mese;
    }
    /**
     * The attribute mese of Tempo_visita. It is of type Int. Cannot be null.
     */
    public void setMese(Integer mese) {
        this.mese = mese;
    }

    /**
     * The attribute name of Tempo_visita. It is of type String. Max length: 255.Cannot be null.
     */
    public String getName() {
        return name;
    }
    /**
     * The attribute name of Tempo_visita. It is of type String. Max length: 255.Cannot be null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The attribute peso of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public Boolean getPeso() {
        return peso;
    }
    /**
     * The attribute peso of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public void setPeso(Boolean peso) {
        this.peso = peso;
    }

    /**
     * The attribute plasma_raccolto of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public Boolean getPlasma_raccolto() {
        return plasma_raccolto;
    }
    /**
     * The attribute plasma_raccolto of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public void setPlasma_raccolto(Boolean plasma_raccolto) {
        this.plasma_raccolto = plasma_raccolto;
    }

    /**
     * The attribute presentato of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public Boolean getPresentato() {
        return presentato;
    }
    /**
     * The attribute presentato of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public void setPresentato(Boolean presentato) {
        this.presentato = presentato;
    }

    /**
     * The attribute questionari of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public Boolean getQuestionari() {
        return questionari;
    }
    /**
     * The attribute questionari of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public void setQuestionari(Boolean questionari) {
        this.questionari = questionari;
    }

    /**
     * The attribute sangue_intero_raccolto of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public Boolean getSangue_intero_raccolto() {
        return sangue_intero_raccolto;
    }
    /**
     * The attribute sangue_intero_raccolto of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public void setSangue_intero_raccolto(Boolean sangue_intero_raccolto) {
        this.sangue_intero_raccolto = sangue_intero_raccolto;
    }

    /**
     * The attribute viro_immun of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public Boolean getViro_immun() {
        return viro_immun;
    }
    /**
     * The attribute viro_immun of Tempo_visita. It is of type Boolean. Cannot be null.
     */
    public void setViro_immun(Boolean viro_immun) {
        this.viro_immun = viro_immun;
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
        if (eventi_clinici != null) {
            joiner.add("eventi_clinici: " + GraphQLRequestSerializer.getEntry(eventi_clinici));
        }
        if (mese != null) {
            joiner.add("mese: " + GraphQLRequestSerializer.getEntry(mese));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
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
        return joiner.toString();
    }

    public static CliTempo_visitaDTO.Builder builder() {
        return new CliTempo_visitaDTO.Builder();
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
        private Boolean eventi_clinici;
        private Integer mese;
        private String name;
        private Boolean peso;
        private Boolean plasma_raccolto;
        private Boolean presentato;
        private Boolean questionari;
        private Boolean sangue_intero_raccolto;
        private Boolean viro_immun;

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
         * The attribute _id of Tempo_visita. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altezza of Tempo_visita. It is of type Boolean. Cannot be null.
         */
        public Builder setAltezza(Boolean altezza) {
            this.altezza = altezza;
            return this;
        }

        /**
         * The attribute chimica of Tempo_visita. It is of type Boolean. Cannot be null.
         */
        public Builder setChimica(Boolean chimica) {
            this.chimica = chimica;
            return this;
        }

        /**
         * The attribute eventi_clinici of Tempo_visita. It is of type Boolean. Cannot be null.
         */
        public Builder setEventi_clinici(Boolean eventi_clinici) {
            this.eventi_clinici = eventi_clinici;
            return this;
        }

        /**
         * The attribute mese of Tempo_visita. It is of type Int. Cannot be null.
         */
        public Builder setMese(Integer mese) {
            this.mese = mese;
            return this;
        }

        /**
         * The attribute name of Tempo_visita. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The attribute peso of Tempo_visita. It is of type Boolean. Cannot be null.
         */
        public Builder setPeso(Boolean peso) {
            this.peso = peso;
            return this;
        }

        /**
         * The attribute plasma_raccolto of Tempo_visita. It is of type Boolean. Cannot be null.
         */
        public Builder setPlasma_raccolto(Boolean plasma_raccolto) {
            this.plasma_raccolto = plasma_raccolto;
            return this;
        }

        /**
         * The attribute presentato of Tempo_visita. It is of type Boolean. Cannot be null.
         */
        public Builder setPresentato(Boolean presentato) {
            this.presentato = presentato;
            return this;
        }

        /**
         * The attribute questionari of Tempo_visita. It is of type Boolean. Cannot be null.
         */
        public Builder setQuestionari(Boolean questionari) {
            this.questionari = questionari;
            return this;
        }

        /**
         * The attribute sangue_intero_raccolto of Tempo_visita. It is of type Boolean. Cannot be null.
         */
        public Builder setSangue_intero_raccolto(Boolean sangue_intero_raccolto) {
            this.sangue_intero_raccolto = sangue_intero_raccolto;
            return this;
        }

        /**
         * The attribute viro_immun of Tempo_visita. It is of type Boolean. Cannot be null.
         */
        public Builder setViro_immun(Boolean viro_immun) {
            this.viro_immun = viro_immun;
            return this;
        }


        public CliTempo_visitaDTO build() {
            CliTempo_visitaDTO result = new CliTempo_visitaDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAltezza(this.altezza);
            result.setChimica(this.chimica);
            result.setEventi_clinici(this.eventi_clinici);
            result.setMese(this.mese);
            result.setName(this.name);
            result.setPeso(this.peso);
            result.setPlasma_raccolto(this.plasma_raccolto);
            result.setPresentato(this.presentato);
            result.setQuestionari(this.questionari);
            result.setSangue_intero_raccolto(this.sangue_intero_raccolto);
            result.setViro_immun(this.viro_immun);
            return result;
        }

    }
}
