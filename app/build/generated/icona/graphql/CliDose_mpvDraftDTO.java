package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft object of class Dose_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliDose_mpvDraftDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String _clientId;
    private String ciclo;
    private Integer numero_dose;
    private String modalita_somministrazione_;

    public CliDose_mpvDraftDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public String getCiclo() {
        return ciclo;
    }
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getNumero_dose() {
        return numero_dose;
    }
    public void setNumero_dose(Integer numero_dose) {
        this.numero_dose = numero_dose;
    }

    public String getModalita_somministrazione_() {
        return modalita_somministrazione_;
    }
    public void setModalita_somministrazione_(String modalita_somministrazione_) {
        this.modalita_somministrazione_ = modalita_somministrazione_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (ciclo != null) {
            joiner.add("ciclo: " + GraphQLRequestSerializer.getEntry(ciclo));
        }
        if (numero_dose != null) {
            joiner.add("numero_dose: " + GraphQLRequestSerializer.getEntry(numero_dose));
        }
        if (modalita_somministrazione_ != null) {
            joiner.add("modalita_somministrazione_: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione_));
        }
        return joiner.toString();
    }

    public static CliDose_mpvDraftDTO.Builder builder() {
        return new CliDose_mpvDraftDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private String _clientId;
        private String ciclo;
        private Integer numero_dose;
        private String modalita_somministrazione_;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setCiclo(String ciclo) {
            this.ciclo = ciclo;
            return this;
        }

        public Builder setNumero_dose(Integer numero_dose) {
            this.numero_dose = numero_dose;
            return this;
        }

        public Builder setModalita_somministrazione_(String modalita_somministrazione_) {
            this.modalita_somministrazione_ = modalita_somministrazione_;
            return this;
        }


        public CliDose_mpvDraftDTO build() {
            CliDose_mpvDraftDTO result = new CliDose_mpvDraftDTO();
            result.set_id(this._id);
            result.set_clientId(this._clientId);
            result.setCiclo(this.ciclo);
            result.setNumero_dose(this.numero_dose);
            result.setModalita_somministrazione_(this.modalita_somministrazione_);
            return result;
        }

    }
}
