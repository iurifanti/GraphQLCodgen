package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
AIC.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliAICCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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

    public CliAICCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAzienda() {
        return azienda;
    }
    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    public String getCodice() {
        return codice;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getConfezione() {
        return confezione;
    }
    public void setConfezione(String confezione) {
        this.confezione = confezione;
    }

    public String getData_fine_commercio() {
        return data_fine_commercio;
    }
    public void setData_fine_commercio(String data_fine_commercio) {
        this.data_fine_commercio = data_fine_commercio;
    }

    public String getData_fine_validita_aic() {
        return data_fine_validita_aic;
    }
    public void setData_fine_validita_aic(String data_fine_validita_aic) {
        this.data_fine_validita_aic = data_fine_validita_aic;
    }

    public String getData_inizio_commercio() {
        return data_inizio_commercio;
    }
    public void setData_inizio_commercio(String data_inizio_commercio) {
        this.data_inizio_commercio = data_inizio_commercio;
    }

    public String getData_inizio_validita_aic() {
        return data_inizio_validita_aic;
    }
    public void setData_inizio_validita_aic(String data_inizio_validita_aic) {
        this.data_inizio_validita_aic = data_inizio_validita_aic;
    }

    public String getMarchio() {
        return marchio;
    }
    public void setMarchio(String marchio) {
        this.marchio = marchio;
    }

    public String getPrincipio_attivo() {
        return principio_attivo;
    }
    public void setPrincipio_attivo(String principio_attivo) {
        this.principio_attivo = principio_attivo;
    }

    public String getQta_principio_attivo() {
        return qta_principio_attivo;
    }
    public void setQta_principio_attivo(String qta_principio_attivo) {
        this.qta_principio_attivo = qta_principio_attivo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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

    public static CliAICCursorDTO.Builder builder() {
        return new CliAICCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

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

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAzienda(String azienda) {
            this.azienda = azienda;
            return this;
        }

        public Builder setCodice(String codice) {
            this.codice = codice;
            return this;
        }

        public Builder setConfezione(String confezione) {
            this.confezione = confezione;
            return this;
        }

        public Builder setData_fine_commercio(String data_fine_commercio) {
            this.data_fine_commercio = data_fine_commercio;
            return this;
        }

        public Builder setData_fine_validita_aic(String data_fine_validita_aic) {
            this.data_fine_validita_aic = data_fine_validita_aic;
            return this;
        }

        public Builder setData_inizio_commercio(String data_inizio_commercio) {
            this.data_inizio_commercio = data_inizio_commercio;
            return this;
        }

        public Builder setData_inizio_validita_aic(String data_inizio_validita_aic) {
            this.data_inizio_validita_aic = data_inizio_validita_aic;
            return this;
        }

        public Builder setMarchio(String marchio) {
            this.marchio = marchio;
            return this;
        }

        public Builder setPrincipio_attivo(String principio_attivo) {
            this.principio_attivo = principio_attivo;
            return this;
        }

        public Builder setQta_principio_attivo(String qta_principio_attivo) {
            this.qta_principio_attivo = qta_principio_attivo;
            return this;
        }


        public CliAICCursorDTO build() {
            CliAICCursorDTO result = new CliAICCursorDTO();
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
