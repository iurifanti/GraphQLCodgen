package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Codice_studio.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliCodice_studioCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String codice;
    private String data_arruolamento;
    private String note;
    private String studio;
    private String titolo;

    public CliCodice_studioCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
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

    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        return joiner.toString();
    }

    public static CliCodice_studioCursorDTO.Builder builder() {
        return new CliCodice_studioCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private String codice;
        private String data_arruolamento;
        private String note;
        private String studio;
        private String titolo;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
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

        public Builder setStudio(String studio) {
            this.studio = studio;
            return this;
        }

        public Builder setTitolo(String titolo) {
            this.titolo = titolo;
            return this;
        }


        public CliCodice_studioCursorDTO build() {
            CliCodice_studioCursorDTO result = new CliCodice_studioCursorDTO();
            result.set_id(this._id);
            result.setCodice(this.codice);
            result.setData_arruolamento(this.data_arruolamento);
            result.setNote(this.note);
            result.setStudio(this.studio);
            result.setTitolo(this.titolo);
            return result;
        }

    }
}
