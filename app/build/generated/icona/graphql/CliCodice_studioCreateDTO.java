package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of Codice_studio.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliCodice_studioCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    @javax.validation.constraints.NotNull
    private String codice;
    private String data_arruolamento;
    private String note;
    @javax.validation.constraints.NotNull
    private String studio_paziente_;

    public CliCodice_studioCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public String getCodice() {
        return codice;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getData_arruolamento() {
        return data_arruolamento;
    }
    public void setData_arruolamento(String data_arruolamento) {
        this.data_arruolamento = data_arruolamento;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public String getStudio_paziente_() {
        return studio_paziente_;
    }
    public void setStudio_paziente_(String studio_paziente_) {
        this.studio_paziente_ = studio_paziente_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
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
        if (studio_paziente_ != null) {
            joiner.add("studio_paziente_: " + GraphQLRequestSerializer.getEntry(studio_paziente_));
        }
        return joiner.toString();
    }

    public static CliCodice_studioCreateDTO.Builder builder() {
        return new CliCodice_studioCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String codice;
        private String data_arruolamento;
        private String note;
        private String studio_paziente_;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setCodice(String codice) {
            this.codice = codice;
            return this;
        }

        public Builder setData_arruolamento(String data_arruolamento) {
            this.data_arruolamento = data_arruolamento;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setStudio_paziente_(String studio_paziente_) {
            this.studio_paziente_ = studio_paziente_;
            return this;
        }


        public CliCodice_studioCreateDTO build() {
            CliCodice_studioCreateDTO result = new CliCodice_studioCreateDTO();
            result.set_clientId(this._clientId);
            result.setCodice(this.codice);
            result.setData_arruolamento(this.data_arruolamento);
            result.setNote(this.note);
            result.setStudio_paziente_(this.studio_paziente_);
            return result;
        }

    }
}
