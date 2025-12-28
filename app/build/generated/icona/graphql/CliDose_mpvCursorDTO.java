package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Dose_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliDose_mpvCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String ciclo;
    private String modalita_somministrazione;
    private Integer numero_dose;

    public CliDose_mpvCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCiclo() {
        return ciclo;
    }
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getModalita_somministrazione() {
        return modalita_somministrazione;
    }
    public void setModalita_somministrazione(String modalita_somministrazione) {
        this.modalita_somministrazione = modalita_somministrazione;
    }

    public Integer getNumero_dose() {
        return numero_dose;
    }
    public void setNumero_dose(Integer numero_dose) {
        this.numero_dose = numero_dose;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (ciclo != null) {
            joiner.add("ciclo: " + GraphQLRequestSerializer.getEntry(ciclo));
        }
        if (modalita_somministrazione != null) {
            joiner.add("modalita_somministrazione: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione));
        }
        if (numero_dose != null) {
            joiner.add("numero_dose: " + GraphQLRequestSerializer.getEntry(numero_dose));
        }
        return joiner.toString();
    }

    public static CliDose_mpvCursorDTO.Builder builder() {
        return new CliDose_mpvCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String ciclo;
        private String modalita_somministrazione;
        private Integer numero_dose;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setCiclo(String ciclo) {
            this.ciclo = ciclo;
            return this;
        }

        public Builder setModalita_somministrazione(String modalita_somministrazione) {
            this.modalita_somministrazione = modalita_somministrazione;
            return this;
        }

        public Builder setNumero_dose(Integer numero_dose) {
            this.numero_dose = numero_dose;
            return this;
        }


        public CliDose_mpvCursorDTO build() {
            CliDose_mpvCursorDTO result = new CliDose_mpvCursorDTO();
            result.set_id(this._id);
            result.setCiclo(this.ciclo);
            result.setModalita_somministrazione(this.modalita_somministrazione);
            result.setNumero_dose(this.numero_dose);
            return result;
        }

    }
}
