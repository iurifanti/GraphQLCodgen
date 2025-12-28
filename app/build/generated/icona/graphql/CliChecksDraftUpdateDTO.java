package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update object of class Checks.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliChecksDraftUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private String check_id;
    private String descrizione;
    private String note;
    private Boolean risolto;
    private String specifiche;
    private CliH_PazienteRoleRefDTO h_Paziente_;
    private CliO_PazienteRoleRefDTO o_paziente_;
    private CliPazienteRoleRefDTO paziente_;

    public CliChecksDraftUpdateDTO() {
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

    public CliH_PazienteRoleRefDTO getH_Paziente_() {
        return h_Paziente_;
    }
    public void setH_Paziente_(CliH_PazienteRoleRefDTO h_Paziente_) {
        this.h_Paziente_ = h_Paziente_;
    }

    public CliO_PazienteRoleRefDTO getO_paziente_() {
        return o_paziente_;
    }
    public void setO_paziente_(CliO_PazienteRoleRefDTO o_paziente_) {
        this.o_paziente_ = o_paziente_;
    }

    public CliPazienteRoleRefDTO getPaziente_() {
        return paziente_;
    }
    public void setPaziente_(CliPazienteRoleRefDTO paziente_) {
        this.paziente_ = paziente_;
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
        if (h_Paziente_ != null) {
            joiner.add("h_Paziente_: " + GraphQLRequestSerializer.getEntry(h_Paziente_));
        }
        if (o_paziente_ != null) {
            joiner.add("o_paziente_: " + GraphQLRequestSerializer.getEntry(o_paziente_));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliChecksDraftUpdateDTO.Builder builder() {
        return new CliChecksDraftUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String check_id;
        private String descrizione;
        private String note;
        private Boolean risolto;
        private String specifiche;
        private CliH_PazienteRoleRefDTO h_Paziente_;
        private CliO_PazienteRoleRefDTO o_paziente_;
        private CliPazienteRoleRefDTO paziente_;

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

        public Builder setH_Paziente_(CliH_PazienteRoleRefDTO h_Paziente_) {
            this.h_Paziente_ = h_Paziente_;
            return this;
        }

        public Builder setO_paziente_(CliO_PazienteRoleRefDTO o_paziente_) {
            this.o_paziente_ = o_paziente_;
            return this;
        }

        public Builder setPaziente_(CliPazienteRoleRefDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliChecksDraftUpdateDTO build() {
            CliChecksDraftUpdateDTO result = new CliChecksDraftUpdateDTO();
            result.set_id(this._id);
            result.setCheck_id(this.check_id);
            result.setDescrizione(this.descrizione);
            result.setNote(this.note);
            result.setRisolto(this.risolto);
            result.setSpecifiche(this.specifiche);
            result.setH_Paziente_(this.h_Paziente_);
            result.setO_paziente_(this.o_paziente_);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
