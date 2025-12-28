package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Domanda, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliDomandaDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String condizioni_abilitazione_associate;
    private Integer ordine;
    private Boolean parametri_personali;
    private Boolean peso;
    private String testo;
    private CliDomandaDTO peso_domanda;
    private CliQuestionarioDTO questionario_;

    public CliDomandaDTO() {
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
     * The attribute _id of Domanda. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Domanda. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute condizioni_abilitazione_associate of Domanda. It is of type String. Path: CONCAT_CS - Concat (comma separated)condizione_abilitazione_ __id. Cannot be null.
     */
    public String getCondizioni_abilitazione_associate() {
        return condizioni_abilitazione_associate;
    }
    /**
     * The attribute condizioni_abilitazione_associate of Domanda. It is of type String. Path: CONCAT_CS - Concat (comma separated)condizione_abilitazione_ __id. Cannot be null.
     */
    public void setCondizioni_abilitazione_associate(String condizioni_abilitazione_associate) {
        this.condizioni_abilitazione_associate = condizioni_abilitazione_associate;
    }

    /**
     * The attribute ordine of Domanda. It is of type Int.
     */
    public Integer getOrdine() {
        return ordine;
    }
    /**
     * The attribute ordine of Domanda. It is of type Int.
     */
    public void setOrdine(Integer ordine) {
        this.ordine = ordine;
    }

    /**
     * The attribute parametri_personali of Domanda. It is of type Boolean. Path: questionario_ parametri_personali.
     */
    public Boolean getParametri_personali() {
        return parametri_personali;
    }
    /**
     * The attribute parametri_personali of Domanda. It is of type Boolean. Path: questionario_ parametri_personali.
     */
    public void setParametri_personali(Boolean parametri_personali) {
        this.parametri_personali = parametri_personali;
    }

    /**
     * The attribute peso of Domanda. It is of type Boolean.
     */
    public Boolean getPeso() {
        return peso;
    }
    /**
     * The attribute peso of Domanda. It is of type Boolean.
     */
    public void setPeso(Boolean peso) {
        this.peso = peso;
    }

    /**
     * The attribute testo of Domanda. It is of type Text.
     */
    public String getTesto() {
        return testo;
    }
    /**
     * The attribute testo of Domanda. It is of type Text.
     */
    public void setTesto(String testo) {
        this.testo = testo;
    }

    /**
     * The associated object for the role peso_domanda.
     */
    public CliDomandaDTO getPeso_domanda() {
        return peso_domanda;
    }
    /**
     * The associated object for the role peso_domanda.
     */
    public void setPeso_domanda(CliDomandaDTO peso_domanda) {
        this.peso_domanda = peso_domanda;
    }

    /**
     * The associated object for the role questionario_.
     */
    public CliQuestionarioDTO getQuestionario_() {
        return questionario_;
    }
    /**
     * The associated object for the role questionario_.
     */
    public void setQuestionario_(CliQuestionarioDTO questionario_) {
        this.questionario_ = questionario_;
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
        if (condizioni_abilitazione_associate != null) {
            joiner.add("condizioni_abilitazione_associate: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate));
        }
        if (ordine != null) {
            joiner.add("ordine: " + GraphQLRequestSerializer.getEntry(ordine));
        }
        if (parametri_personali != null) {
            joiner.add("parametri_personali: " + GraphQLRequestSerializer.getEntry(parametri_personali));
        }
        if (peso != null) {
            joiner.add("peso: " + GraphQLRequestSerializer.getEntry(peso));
        }
        if (testo != null) {
            joiner.add("testo: " + GraphQLRequestSerializer.getEntry(testo));
        }
        if (peso_domanda != null) {
            joiner.add("peso_domanda: " + GraphQLRequestSerializer.getEntry(peso_domanda));
        }
        if (questionario_ != null) {
            joiner.add("questionario_: " + GraphQLRequestSerializer.getEntry(questionario_));
        }
        return joiner.toString();
    }

    public static CliDomandaDTO.Builder builder() {
        return new CliDomandaDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String condizioni_abilitazione_associate;
        private Integer ordine;
        private Boolean parametri_personali;
        private Boolean peso;
        private String testo;
        private CliDomandaDTO peso_domanda;
        private CliQuestionarioDTO questionario_;

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
         * The attribute _id of Domanda. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute condizioni_abilitazione_associate of Domanda. It is of type String. Path: CONCAT_CS - Concat (comma separated)condizione_abilitazione_ __id. Cannot be null.
         */
        public Builder setCondizioni_abilitazione_associate(String condizioni_abilitazione_associate) {
            this.condizioni_abilitazione_associate = condizioni_abilitazione_associate;
            return this;
        }

        /**
         * The attribute ordine of Domanda. It is of type Int.
         */
        public Builder setOrdine(Integer ordine) {
            this.ordine = ordine;
            return this;
        }

        /**
         * The attribute parametri_personali of Domanda. It is of type Boolean. Path: questionario_ parametri_personali.
         */
        public Builder setParametri_personali(Boolean parametri_personali) {
            this.parametri_personali = parametri_personali;
            return this;
        }

        /**
         * The attribute peso of Domanda. It is of type Boolean.
         */
        public Builder setPeso(Boolean peso) {
            this.peso = peso;
            return this;
        }

        /**
         * The attribute testo of Domanda. It is of type Text.
         */
        public Builder setTesto(String testo) {
            this.testo = testo;
            return this;
        }

        /**
         * The associated object for the role peso_domanda.
         */
        public Builder setPeso_domanda(CliDomandaDTO peso_domanda) {
            this.peso_domanda = peso_domanda;
            return this;
        }

        /**
         * The associated object for the role questionario_.
         */
        public Builder setQuestionario_(CliQuestionarioDTO questionario_) {
            this.questionario_ = questionario_;
            return this;
        }


        public CliDomandaDTO build() {
            CliDomandaDTO result = new CliDomandaDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCondizioni_abilitazione_associate(this.condizioni_abilitazione_associate);
            result.setOrdine(this.ordine);
            result.setParametri_personali(this.parametri_personali);
            result.setPeso(this.peso);
            result.setTesto(this.testo);
            result.setPeso_domanda(this.peso_domanda);
            result.setQuestionario_(this.questionario_);
            return result;
        }

    }
}
