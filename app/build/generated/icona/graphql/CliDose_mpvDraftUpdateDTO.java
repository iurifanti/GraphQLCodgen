package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update object of class Dose_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliDose_mpvDraftUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private String ciclo;
    private Integer numero_dose;
    private CliModalita_somministrazioneRoleRefDTO modalita_somministrazione_;

    public CliDose_mpvDraftUpdateDTO() {
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

    public Integer getNumero_dose() {
        return numero_dose;
    }
    public void setNumero_dose(Integer numero_dose) {
        this.numero_dose = numero_dose;
    }

    public CliModalita_somministrazioneRoleRefDTO getModalita_somministrazione_() {
        return modalita_somministrazione_;
    }
    public void setModalita_somministrazione_(CliModalita_somministrazioneRoleRefDTO modalita_somministrazione_) {
        this.modalita_somministrazione_ = modalita_somministrazione_;
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
        if (numero_dose != null) {
            joiner.add("numero_dose: " + GraphQLRequestSerializer.getEntry(numero_dose));
        }
        if (modalita_somministrazione_ != null) {
            joiner.add("modalita_somministrazione_: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione_));
        }
        return joiner.toString();
    }

    public static CliDose_mpvDraftUpdateDTO.Builder builder() {
        return new CliDose_mpvDraftUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String ciclo;
        private Integer numero_dose;
        private CliModalita_somministrazioneRoleRefDTO modalita_somministrazione_;

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

        public Builder setNumero_dose(Integer numero_dose) {
            this.numero_dose = numero_dose;
            return this;
        }

        public Builder setModalita_somministrazione_(CliModalita_somministrazioneRoleRefDTO modalita_somministrazione_) {
            this.modalita_somministrazione_ = modalita_somministrazione_;
            return this;
        }


        public CliDose_mpvDraftUpdateDTO build() {
            CliDose_mpvDraftUpdateDTO result = new CliDose_mpvDraftUpdateDTO();
            result.set_id(this._id);
            result.setCiclo(this.ciclo);
            result.setNumero_dose(this.numero_dose);
            result.setModalita_somministrazione_(this.modalita_somministrazione_);
            return result;
        }

    }
}
