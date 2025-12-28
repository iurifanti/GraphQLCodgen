package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Checks.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliChecksCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String check_id;
    private String codice_centro_h;
    private String codice_centro_i;
    private String codice_hepa;
    private String codice_ico;
    private String descrizione;
    private String note;
    private Boolean risolto;
    private String specifiche;

    public CliChecksCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCheck_id() {
        return check_id;
    }
    public void setCheck_id(String check_id) {
        this.check_id = check_id;
    }

    public String getCodice_centro_h() {
        return codice_centro_h;
    }
    public void setCodice_centro_h(String codice_centro_h) {
        this.codice_centro_h = codice_centro_h;
    }

    public String getCodice_centro_i() {
        return codice_centro_i;
    }
    public void setCodice_centro_i(String codice_centro_i) {
        this.codice_centro_i = codice_centro_i;
    }

    public String getCodice_hepa() {
        return codice_hepa;
    }
    public void setCodice_hepa(String codice_hepa) {
        this.codice_hepa = codice_hepa;
    }

    public String getCodice_ico() {
        return codice_ico;
    }
    public void setCodice_ico(String codice_ico) {
        this.codice_ico = codice_ico;
    }

    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getRisolto() {
        return risolto;
    }
    public void setRisolto(Boolean risolto) {
        this.risolto = risolto;
    }

    public String getSpecifiche() {
        return specifiche;
    }
    public void setSpecifiche(String specifiche) {
        this.specifiche = specifiche;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (check_id != null) {
            joiner.add("check_id: " + GraphQLRequestSerializer.getEntry(check_id));
        }
        if (codice_centro_h != null) {
            joiner.add("codice_centro_h: " + GraphQLRequestSerializer.getEntry(codice_centro_h));
        }
        if (codice_centro_i != null) {
            joiner.add("codice_centro_i: " + GraphQLRequestSerializer.getEntry(codice_centro_i));
        }
        if (codice_hepa != null) {
            joiner.add("codice_hepa: " + GraphQLRequestSerializer.getEntry(codice_hepa));
        }
        if (codice_ico != null) {
            joiner.add("codice_ico: " + GraphQLRequestSerializer.getEntry(codice_ico));
        }
        if (descrizione != null) {
            joiner.add("descrizione: " + GraphQLRequestSerializer.getEntry(descrizione));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (risolto != null) {
            joiner.add("risolto: " + GraphQLRequestSerializer.getEntry(risolto));
        }
        if (specifiche != null) {
            joiner.add("specifiche: " + GraphQLRequestSerializer.getEntry(specifiche));
        }
        return joiner.toString();
    }

    public static CliChecksCursorDTO.Builder builder() {
        return new CliChecksCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String check_id;
        private String codice_centro_h;
        private String codice_centro_i;
        private String codice_hepa;
        private String codice_ico;
        private String descrizione;
        private String note;
        private Boolean risolto;
        private String specifiche;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setCheck_id(String check_id) {
            this.check_id = check_id;
            return this;
        }

        public Builder setCodice_centro_h(String codice_centro_h) {
            this.codice_centro_h = codice_centro_h;
            return this;
        }

        public Builder setCodice_centro_i(String codice_centro_i) {
            this.codice_centro_i = codice_centro_i;
            return this;
        }

        public Builder setCodice_hepa(String codice_hepa) {
            this.codice_hepa = codice_hepa;
            return this;
        }

        public Builder setCodice_ico(String codice_ico) {
            this.codice_ico = codice_ico;
            return this;
        }

        public Builder setDescrizione(String descrizione) {
            this.descrizione = descrizione;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setRisolto(Boolean risolto) {
            this.risolto = risolto;
            return this;
        }

        public Builder setSpecifiche(String specifiche) {
            this.specifiche = specifiche;
            return this;
        }


        public CliChecksCursorDTO build() {
            CliChecksCursorDTO result = new CliChecksCursorDTO();
            result.set_id(this._id);
            result.setCheck_id(this.check_id);
            result.setCodice_centro_h(this.codice_centro_h);
            result.setCodice_centro_i(this.codice_centro_i);
            result.setCodice_hepa(this.codice_hepa);
            result.setCodice_ico(this.codice_ico);
            result.setDescrizione(this.descrizione);
            result.setNote(this.note);
            result.setRisolto(this.risolto);
            result.setSpecifiche(this.specifiche);
            return result;
        }

    }
}
