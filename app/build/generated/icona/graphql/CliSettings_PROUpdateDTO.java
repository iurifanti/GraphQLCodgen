package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a single object of singleton class Settings_PRO.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliSettings_PROUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliPendingFileReferenceDTO template_credenziali;
    private Integer tempo_disponibile_mesi;
    private CliRange_BMIRoleObjectsDTO range_BMI_;
    private CliTesto_introRoleObjectsDTO testo_intro_;

    public CliSettings_PROUpdateDTO() {
    }


    public CliPendingFileReferenceDTO getTemplate_credenziali() {
        return template_credenziali;
    }
    public void setTemplate_credenziali(CliPendingFileReferenceDTO template_credenziali) {
        this.template_credenziali = template_credenziali;
    }

    public Integer getTempo_disponibile_mesi() {
        return tempo_disponibile_mesi;
    }
    public void setTempo_disponibile_mesi(Integer tempo_disponibile_mesi) {
        this.tempo_disponibile_mesi = tempo_disponibile_mesi;
    }

    public CliRange_BMIRoleObjectsDTO getRange_BMI_() {
        return range_BMI_;
    }
    public void setRange_BMI_(CliRange_BMIRoleObjectsDTO range_BMI_) {
        this.range_BMI_ = range_BMI_;
    }

    public CliTesto_introRoleObjectsDTO getTesto_intro_() {
        return testo_intro_;
    }
    public void setTesto_intro_(CliTesto_introRoleObjectsDTO testo_intro_) {
        this.testo_intro_ = testo_intro_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (template_credenziali != null) {
            joiner.add("template_credenziali: " + GraphQLRequestSerializer.getEntry(template_credenziali));
        }
        if (tempo_disponibile_mesi != null) {
            joiner.add("tempo_disponibile_mesi: " + GraphQLRequestSerializer.getEntry(tempo_disponibile_mesi));
        }
        if (range_BMI_ != null) {
            joiner.add("range_BMI_: " + GraphQLRequestSerializer.getEntry(range_BMI_));
        }
        if (testo_intro_ != null) {
            joiner.add("testo_intro_: " + GraphQLRequestSerializer.getEntry(testo_intro_));
        }
        return joiner.toString();
    }

    public static CliSettings_PROUpdateDTO.Builder builder() {
        return new CliSettings_PROUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private CliPendingFileReferenceDTO template_credenziali;
        private Integer tempo_disponibile_mesi;
        private CliRange_BMIRoleObjectsDTO range_BMI_;
        private CliTesto_introRoleObjectsDTO testo_intro_;

        public Builder() {
        }

        public Builder setTemplate_credenziali(CliPendingFileReferenceDTO template_credenziali) {
            this.template_credenziali = template_credenziali;
            return this;
        }

        public Builder setTempo_disponibile_mesi(Integer tempo_disponibile_mesi) {
            this.tempo_disponibile_mesi = tempo_disponibile_mesi;
            return this;
        }

        public Builder setRange_BMI_(CliRange_BMIRoleObjectsDTO range_BMI_) {
            this.range_BMI_ = range_BMI_;
            return this;
        }

        public Builder setTesto_intro_(CliTesto_introRoleObjectsDTO testo_intro_) {
            this.testo_intro_ = testo_intro_;
            return this;
        }


        public CliSettings_PROUpdateDTO build() {
            CliSettings_PROUpdateDTO result = new CliSettings_PROUpdateDTO();
            result.setTemplate_credenziali(this.template_credenziali);
            result.setTempo_disponibile_mesi(this.tempo_disponibile_mesi);
            result.setRange_BMI_(this.range_BMI_);
            result.setTesto_intro_(this.testo_intro_);
            return result;
        }

    }
}
