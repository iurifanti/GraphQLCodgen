package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update objects of class Dose_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliDose_mpvDraftUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String ciclo;
    private Integer numero_dose;
    private CliModalita_somministrazioneRoleRefDTO modalita_somministrazione_;

    public CliDose_mpvDraftUpdateBulkDTO() {
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

    public static CliDose_mpvDraftUpdateBulkDTO.Builder builder() {
        return new CliDose_mpvDraftUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String ciclo;
        private Integer numero_dose;
        private CliModalita_somministrazioneRoleRefDTO modalita_somministrazione_;

        public Builder() {
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


        public CliDose_mpvDraftUpdateBulkDTO build() {
            CliDose_mpvDraftUpdateBulkDTO result = new CliDose_mpvDraftUpdateBulkDTO();
            result.setCiclo(this.ciclo);
            result.setNumero_dose(this.numero_dose);
            result.setModalita_somministrazione_(this.modalita_somministrazione_);
            return result;
        }

    }
}
