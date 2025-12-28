package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of Dose_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliDose_mpvCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    @javax.validation.constraints.NotNull
    private String ciclo;
    private Integer numero_dose;
    @javax.validation.constraints.NotNull
    private String modalita_somministrazione_;

    public CliDose_mpvCreateDTO() {
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

    public static CliDose_mpvCreateDTO.Builder builder() {
        return new CliDose_mpvCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId;
        private String ciclo;
        private Integer numero_dose;
        private String modalita_somministrazione_;

        public Builder() {
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


        public CliDose_mpvCreateDTO build() {
            CliDose_mpvCreateDTO result = new CliDose_mpvCreateDTO();
            result.set_clientId(this._clientId);
            result.setCiclo(this.ciclo);
            result.setNumero_dose(this.numero_dose);
            result.setModalita_somministrazione_(this.modalita_somministrazione_);
            return result;
        }

    }
}
