package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class AIC, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliAICDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String azienda;
    private String codice;
    private String confezione;
    private String data_fine_commercio;
    private String data_fine_validita_aic;
    private String data_inizio_commercio;
    private String data_inizio_validita_aic;
    private String marchio;
    private String principio_attivo;
    private String qta_principio_attivo;

    public CliAICDTO() {
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
     * The attribute _id of AIC. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of AIC. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute azienda of AIC. It is of type String. Max length: 255.
     */
    public String getAzienda() {
        return azienda;
    }
    /**
     * The attribute azienda of AIC. It is of type String. Max length: 255.
     */
    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    /**
     * The attribute codice of AIC. It is of type String. Max length: 255.Cannot be null.
     */
    public String getCodice() {
        return codice;
    }
    /**
     * The attribute codice of AIC. It is of type String. Max length: 255.Cannot be null.
     */
    public void setCodice(String codice) {
        this.codice = codice;
    }

    /**
     * The attribute confezione of AIC. It is of type String. Max length: 255.
     */
    public String getConfezione() {
        return confezione;
    }
    /**
     * The attribute confezione of AIC. It is of type String. Max length: 255.
     */
    public void setConfezione(String confezione) {
        this.confezione = confezione;
    }

    /**
     * The attribute data_fine_commercio of AIC. It is of type String. Max length: 255.
     */
    public String getData_fine_commercio() {
        return data_fine_commercio;
    }
    /**
     * The attribute data_fine_commercio of AIC. It is of type String. Max length: 255.
     */
    public void setData_fine_commercio(String data_fine_commercio) {
        this.data_fine_commercio = data_fine_commercio;
    }

    /**
     * The attribute data_fine_validita_aic of AIC. It is of type String. Max length: 255.
     */
    public String getData_fine_validita_aic() {
        return data_fine_validita_aic;
    }
    /**
     * The attribute data_fine_validita_aic of AIC. It is of type String. Max length: 255.
     */
    public void setData_fine_validita_aic(String data_fine_validita_aic) {
        this.data_fine_validita_aic = data_fine_validita_aic;
    }

    /**
     * The attribute data_inizio_commercio of AIC. It is of type String. Max length: 255.
     */
    public String getData_inizio_commercio() {
        return data_inizio_commercio;
    }
    /**
     * The attribute data_inizio_commercio of AIC. It is of type String. Max length: 255.
     */
    public void setData_inizio_commercio(String data_inizio_commercio) {
        this.data_inizio_commercio = data_inizio_commercio;
    }

    /**
     * The attribute data_inizio_validita_aic of AIC. It is of type String. Max length: 255.
     */
    public String getData_inizio_validita_aic() {
        return data_inizio_validita_aic;
    }
    /**
     * The attribute data_inizio_validita_aic of AIC. It is of type String. Max length: 255.
     */
    public void setData_inizio_validita_aic(String data_inizio_validita_aic) {
        this.data_inizio_validita_aic = data_inizio_validita_aic;
    }

    /**
     * The attribute marchio of AIC. It is of type String. Max length: 255.
     */
    public String getMarchio() {
        return marchio;
    }
    /**
     * The attribute marchio of AIC. It is of type String. Max length: 255.
     */
    public void setMarchio(String marchio) {
        this.marchio = marchio;
    }

    /**
     * The attribute principio_attivo of AIC. It is of type String. Max length: 255.
     */
    public String getPrincipio_attivo() {
        return principio_attivo;
    }
    /**
     * The attribute principio_attivo of AIC. It is of type String. Max length: 255.
     */
    public void setPrincipio_attivo(String principio_attivo) {
        this.principio_attivo = principio_attivo;
    }

    /**
     * The attribute qta_principio_attivo of AIC. It is of type String. Max length: 255.
     */
    public String getQta_principio_attivo() {
        return qta_principio_attivo;
    }
    /**
     * The attribute qta_principio_attivo of AIC. It is of type String. Max length: 255.
     */
    public void setQta_principio_attivo(String qta_principio_attivo) {
        this.qta_principio_attivo = qta_principio_attivo;
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
        if (azienda != null) {
            joiner.add("azienda: " + GraphQLRequestSerializer.getEntry(azienda));
        }
        if (codice != null) {
            joiner.add("codice: " + GraphQLRequestSerializer.getEntry(codice));
        }
        if (confezione != null) {
            joiner.add("confezione: " + GraphQLRequestSerializer.getEntry(confezione));
        }
        if (data_fine_commercio != null) {
            joiner.add("data_fine_commercio: " + GraphQLRequestSerializer.getEntry(data_fine_commercio));
        }
        if (data_fine_validita_aic != null) {
            joiner.add("data_fine_validita_aic: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic));
        }
        if (data_inizio_commercio != null) {
            joiner.add("data_inizio_commercio: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio));
        }
        if (data_inizio_validita_aic != null) {
            joiner.add("data_inizio_validita_aic: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic));
        }
        if (marchio != null) {
            joiner.add("marchio: " + GraphQLRequestSerializer.getEntry(marchio));
        }
        if (principio_attivo != null) {
            joiner.add("principio_attivo: " + GraphQLRequestSerializer.getEntry(principio_attivo));
        }
        if (qta_principio_attivo != null) {
            joiner.add("qta_principio_attivo: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo));
        }
        return joiner.toString();
    }

    public static CliAICDTO.Builder builder() {
        return new CliAICDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String azienda;
        private String codice;
        private String confezione;
        private String data_fine_commercio;
        private String data_fine_validita_aic;
        private String data_inizio_commercio;
        private String data_inizio_validita_aic;
        private String marchio;
        private String principio_attivo;
        private String qta_principio_attivo;

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
         * The attribute _id of AIC. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute azienda of AIC. It is of type String. Max length: 255.
         */
        public Builder setAzienda(String azienda) {
            this.azienda = azienda;
            return this;
        }

        /**
         * The attribute codice of AIC. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setCodice(String codice) {
            this.codice = codice;
            return this;
        }

        /**
         * The attribute confezione of AIC. It is of type String. Max length: 255.
         */
        public Builder setConfezione(String confezione) {
            this.confezione = confezione;
            return this;
        }

        /**
         * The attribute data_fine_commercio of AIC. It is of type String. Max length: 255.
         */
        public Builder setData_fine_commercio(String data_fine_commercio) {
            this.data_fine_commercio = data_fine_commercio;
            return this;
        }

        /**
         * The attribute data_fine_validita_aic of AIC. It is of type String. Max length: 255.
         */
        public Builder setData_fine_validita_aic(String data_fine_validita_aic) {
            this.data_fine_validita_aic = data_fine_validita_aic;
            return this;
        }

        /**
         * The attribute data_inizio_commercio of AIC. It is of type String. Max length: 255.
         */
        public Builder setData_inizio_commercio(String data_inizio_commercio) {
            this.data_inizio_commercio = data_inizio_commercio;
            return this;
        }

        /**
         * The attribute data_inizio_validita_aic of AIC. It is of type String. Max length: 255.
         */
        public Builder setData_inizio_validita_aic(String data_inizio_validita_aic) {
            this.data_inizio_validita_aic = data_inizio_validita_aic;
            return this;
        }

        /**
         * The attribute marchio of AIC. It is of type String. Max length: 255.
         */
        public Builder setMarchio(String marchio) {
            this.marchio = marchio;
            return this;
        }

        /**
         * The attribute principio_attivo of AIC. It is of type String. Max length: 255.
         */
        public Builder setPrincipio_attivo(String principio_attivo) {
            this.principio_attivo = principio_attivo;
            return this;
        }

        /**
         * The attribute qta_principio_attivo of AIC. It is of type String. Max length: 255.
         */
        public Builder setQta_principio_attivo(String qta_principio_attivo) {
            this.qta_principio_attivo = qta_principio_attivo;
            return this;
        }


        public CliAICDTO build() {
            CliAICDTO result = new CliAICDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAzienda(this.azienda);
            result.setCodice(this.codice);
            result.setConfezione(this.confezione);
            result.setData_fine_commercio(this.data_fine_commercio);
            result.setData_fine_validita_aic(this.data_fine_validita_aic);
            result.setData_inizio_commercio(this.data_inizio_commercio);
            result.setData_inizio_validita_aic(this.data_inizio_validita_aic);
            result.setMarchio(this.marchio);
            result.setPrincipio_attivo(this.principio_attivo);
            result.setQta_principio_attivo(this.qta_principio_attivo);
            return result;
        }

    }
}
