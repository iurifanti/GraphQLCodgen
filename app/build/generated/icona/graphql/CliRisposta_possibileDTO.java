package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Risposta_possibile, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliRisposta_possibileDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String conc;
    private Integer domande_associate;
    private String domande_associate_ids;
    private Integer ordine;
    private String punteggio;
    private Integer risposte_associate;
    private String risposte_associate_ids;
    private String testo;

    public CliRisposta_possibileDTO() {
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
     * The attribute _id of Risposta_possibile. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Risposta_possibile. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute conc of Risposta_possibile. It is of type String. Expression: 'concat("id##",__id,"|testo##",testo,"|ordine##",ordine,"|punteggio##",punteggio,"@@")'.
     */
    public String getConc() {
        return conc;
    }
    /**
     * The attribute conc of Risposta_possibile. It is of type String. Expression: 'concat("id##",__id,"|testo##",testo,"|ordine##",ordine,"|punteggio##",punteggio,"@@")'.
     */
    public void setConc(String conc) {
        this.conc = conc;
    }

    /**
     * The attribute domande_associate of Risposta_possibile. It is of type Int. Path: COUNT_DISTINCT - Count distinctdomanda_ __id. Cannot be null.
     */
    public Integer getDomande_associate() {
        return domande_associate;
    }
    /**
     * The attribute domande_associate of Risposta_possibile. It is of type Int. Path: COUNT_DISTINCT - Count distinctdomanda_ __id. Cannot be null.
     */
    public void setDomande_associate(Integer domande_associate) {
        this.domande_associate = domande_associate;
    }

    /**
     * The attribute domande_associate_ids of Risposta_possibile. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)domanda_ __id. Cannot be null.
     */
    public String getDomande_associate_ids() {
        return domande_associate_ids;
    }
    /**
     * The attribute domande_associate_ids of Risposta_possibile. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)domanda_ __id. Cannot be null.
     */
    public void setDomande_associate_ids(String domande_associate_ids) {
        this.domande_associate_ids = domande_associate_ids;
    }

    /**
     * The attribute ordine of Risposta_possibile. It is of type Int.
     */
    public Integer getOrdine() {
        return ordine;
    }
    /**
     * The attribute ordine of Risposta_possibile. It is of type Int.
     */
    public void setOrdine(Integer ordine) {
        this.ordine = ordine;
    }

    /**
     * The attribute punteggio of Risposta_possibile. It is of type Real @realFormat.
     */
    public String getPunteggio() {
        return punteggio;
    }
    /**
     * The attribute punteggio of Risposta_possibile. It is of type Real @realFormat.
     */
    public void setPunteggio(String punteggio) {
        this.punteggio = punteggio;
    }

    /**
     * The attribute risposte_associate of Risposta_possibile. It is of type Int. Path: COUNT_DISTINCT - Count distinctrisposta_multipla __id. Cannot be null.
     */
    public Integer getRisposte_associate() {
        return risposte_associate;
    }
    /**
     * The attribute risposte_associate of Risposta_possibile. It is of type Int. Path: COUNT_DISTINCT - Count distinctrisposta_multipla __id. Cannot be null.
     */
    public void setRisposte_associate(Integer risposte_associate) {
        this.risposte_associate = risposte_associate;
    }

    /**
     * The attribute risposte_associate_ids of Risposta_possibile. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)risposta_multipla __id. Cannot be null.
     */
    public String getRisposte_associate_ids() {
        return risposte_associate_ids;
    }
    /**
     * The attribute risposte_associate_ids of Risposta_possibile. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)risposta_multipla __id. Cannot be null.
     */
    public void setRisposte_associate_ids(String risposte_associate_ids) {
        this.risposte_associate_ids = risposte_associate_ids;
    }

    /**
     * The attribute testo of Risposta_possibile. It is of type String. Max length: 255.
     */
    public String getTesto() {
        return testo;
    }
    /**
     * The attribute testo of Risposta_possibile. It is of type String. Max length: 255.
     */
    public void setTesto(String testo) {
        this.testo = testo;
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
        if (conc != null) {
            joiner.add("conc: " + GraphQLRequestSerializer.getEntry(conc));
        }
        if (domande_associate != null) {
            joiner.add("domande_associate: " + GraphQLRequestSerializer.getEntry(domande_associate));
        }
        if (domande_associate_ids != null) {
            joiner.add("domande_associate_ids: " + GraphQLRequestSerializer.getEntry(domande_associate_ids));
        }
        if (ordine != null) {
            joiner.add("ordine: " + GraphQLRequestSerializer.getEntry(ordine));
        }
        if (punteggio != null) {
            joiner.add("punteggio: " + GraphQLRequestSerializer.getEntry(punteggio));
        }
        if (risposte_associate != null) {
            joiner.add("risposte_associate: " + GraphQLRequestSerializer.getEntry(risposte_associate));
        }
        if (risposte_associate_ids != null) {
            joiner.add("risposte_associate_ids: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids));
        }
        if (testo != null) {
            joiner.add("testo: " + GraphQLRequestSerializer.getEntry(testo));
        }
        return joiner.toString();
    }

    public static CliRisposta_possibileDTO.Builder builder() {
        return new CliRisposta_possibileDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String conc;
        private Integer domande_associate;
        private String domande_associate_ids;
        private Integer ordine;
        private String punteggio;
        private Integer risposte_associate;
        private String risposte_associate_ids;
        private String testo;

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
         * The attribute _id of Risposta_possibile. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute conc of Risposta_possibile. It is of type String. Expression: 'concat("id##",__id,"|testo##",testo,"|ordine##",ordine,"|punteggio##",punteggio,"@@")'.
         */
        public Builder setConc(String conc) {
            this.conc = conc;
            return this;
        }

        /**
         * The attribute domande_associate of Risposta_possibile. It is of type Int. Path: COUNT_DISTINCT - Count distinctdomanda_ __id. Cannot be null.
         */
        public Builder setDomande_associate(Integer domande_associate) {
            this.domande_associate = domande_associate;
            return this;
        }

        /**
         * The attribute domande_associate_ids of Risposta_possibile. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)domanda_ __id. Cannot be null.
         */
        public Builder setDomande_associate_ids(String domande_associate_ids) {
            this.domande_associate_ids = domande_associate_ids;
            return this;
        }

        /**
         * The attribute ordine of Risposta_possibile. It is of type Int.
         */
        public Builder setOrdine(Integer ordine) {
            this.ordine = ordine;
            return this;
        }

        /**
         * The attribute punteggio of Risposta_possibile. It is of type Real @realFormat.
         */
        public Builder setPunteggio(String punteggio) {
            this.punteggio = punteggio;
            return this;
        }

        /**
         * The attribute risposte_associate of Risposta_possibile. It is of type Int. Path: COUNT_DISTINCT - Count distinctrisposta_multipla __id. Cannot be null.
         */
        public Builder setRisposte_associate(Integer risposte_associate) {
            this.risposte_associate = risposte_associate;
            return this;
        }

        /**
         * The attribute risposte_associate_ids of Risposta_possibile. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)risposta_multipla __id. Cannot be null.
         */
        public Builder setRisposte_associate_ids(String risposte_associate_ids) {
            this.risposte_associate_ids = risposte_associate_ids;
            return this;
        }

        /**
         * The attribute testo of Risposta_possibile. It is of type String. Max length: 255.
         */
        public Builder setTesto(String testo) {
            this.testo = testo;
            return this;
        }


        public CliRisposta_possibileDTO build() {
            CliRisposta_possibileDTO result = new CliRisposta_possibileDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setConc(this.conc);
            result.setDomande_associate(this.domande_associate);
            result.setDomande_associate_ids(this.domande_associate_ids);
            result.setOrdine(this.ordine);
            result.setPunteggio(this.punteggio);
            result.setRisposte_associate(this.risposte_associate);
            result.setRisposte_associate_ids(this.risposte_associate_ids);
            result.setTesto(this.testo);
            return result;
        }

    }
}
