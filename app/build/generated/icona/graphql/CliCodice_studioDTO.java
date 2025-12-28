package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Codice_studio, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliCodice_studioDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String codice;
    private String data_arruolamento;
    private String note;
    private String studio;
    private String titolo;
    private CliStudio_pazienteDTO studio_paziente_;
    private CliPazienteDTO paziente_;

    public CliCodice_studioDTO() {
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
     * The attribute _id of Codice_studio. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Codice_studio. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute codice of Codice_studio. It is of type String. Max length: 255.Cannot be null.
     */
    public String getCodice() {
        return codice;
    }
    /**
     * The attribute codice of Codice_studio. It is of type String. Max length: 255.Cannot be null.
     */
    public void setCodice(String codice) {
        this.codice = codice;
    }

    /**
     * The attribute data_arruolamento of Codice_studio. It is of type Date @dateFormat.
     */
    public String getData_arruolamento() {
        return data_arruolamento;
    }
    /**
     * The attribute data_arruolamento of Codice_studio. It is of type Date @dateFormat.
     */
    public void setData_arruolamento(String data_arruolamento) {
        this.data_arruolamento = data_arruolamento;
    }

    /**
     * The attribute note of Codice_studio. It is of type Text.
     */
    public String getNote() {
        return note;
    }
    /**
     * The attribute note of Codice_studio. It is of type Text.
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * The attribute studio of Codice_studio. It is of type String. Path: studio_paziente_ nome. Cannot be null.
     */
    public String getStudio() {
        return studio;
    }
    /**
     * The attribute studio of Codice_studio. It is of type String. Path: studio_paziente_ nome. Cannot be null.
     */
    public void setStudio(String studio) {
        this.studio = studio;
    }

    /**
     * The attribute titolo of Codice_studio. It is of type String. Expression: 'concat(studio,": ",codice)'.Cannot be null.
     */
    public String getTitolo() {
        return titolo;
    }
    /**
     * The attribute titolo of Codice_studio. It is of type String. Expression: 'concat(studio,": ",codice)'.Cannot be null.
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * The associated object for the role studio_paziente_.
     */
    public CliStudio_pazienteDTO getStudio_paziente_() {
        return studio_paziente_;
    }
    /**
     * The associated object for the role studio_paziente_.
     */
    public void setStudio_paziente_(CliStudio_pazienteDTO studio_paziente_) {
        this.studio_paziente_ = studio_paziente_;
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
        if (codice != null) {
            joiner.add("codice: " + GraphQLRequestSerializer.getEntry(codice));
        }
        if (data_arruolamento != null) {
            joiner.add("data_arruolamento: " + GraphQLRequestSerializer.getEntry(data_arruolamento));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (studio != null) {
            joiner.add("studio: " + GraphQLRequestSerializer.getEntry(studio));
        }
        if (titolo != null) {
            joiner.add("titolo: " + GraphQLRequestSerializer.getEntry(titolo));
        }
        if (studio_paziente_ != null) {
            joiner.add("studio_paziente_: " + GraphQLRequestSerializer.getEntry(studio_paziente_));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliCodice_studioDTO.Builder builder() {
        return new CliCodice_studioDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String codice;
        private String data_arruolamento;
        private String note;
        private String studio;
        private String titolo;
        private CliStudio_pazienteDTO studio_paziente_;
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
         * The attribute _id of Codice_studio. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute codice of Codice_studio. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setCodice(String codice) {
            this.codice = codice;
            return this;
        }

        /**
         * The attribute data_arruolamento of Codice_studio. It is of type Date @dateFormat.
         */
        public Builder setData_arruolamento(String data_arruolamento) {
            this.data_arruolamento = data_arruolamento;
            return this;
        }

        /**
         * The attribute note of Codice_studio. It is of type Text.
         */
        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        /**
         * The attribute studio of Codice_studio. It is of type String. Path: studio_paziente_ nome. Cannot be null.
         */
        public Builder setStudio(String studio) {
            this.studio = studio;
            return this;
        }

        /**
         * The attribute titolo of Codice_studio. It is of type String. Expression: 'concat(studio,": ",codice)'.Cannot be null.
         */
        public Builder setTitolo(String titolo) {
            this.titolo = titolo;
            return this;
        }

        /**
         * The associated object for the role studio_paziente_.
         */
        public Builder setStudio_paziente_(CliStudio_pazienteDTO studio_paziente_) {
            this.studio_paziente_ = studio_paziente_;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliCodice_studioDTO build() {
            CliCodice_studioDTO result = new CliCodice_studioDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCodice(this.codice);
            result.setData_arruolamento(this.data_arruolamento);
            result.setNote(this.note);
            result.setStudio(this.studio);
            result.setTitolo(this.titolo);
            result.setStudio_paziente_(this.studio_paziente_);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
