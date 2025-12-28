package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for draft create objects of class Checks.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliChecksDraftCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String check_id;
    private String descrizione;
    private String note;
    private Boolean risolto;
    private String specifiche;
    private String h_Paziente_;
    private String o_paziente_;
    private String paziente_;

    public CliChecksDraftCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
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

    public String getH_Paziente_() {
        return h_Paziente_;
    }
    public void setH_Paziente_(String h_Paziente_) {
        this.h_Paziente_ = h_Paziente_;
    }

    public String getO_paziente_() {
        return o_paziente_;
    }
    public void setO_paziente_(String o_paziente_) {
        this.o_paziente_ = o_paziente_;
    }

    public String getPaziente_() {
        return paziente_;
    }
    public void setPaziente_(String paziente_) {
        this.paziente_ = paziente_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
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

    public static CliChecksDraftCreateDTO.Builder builder() {
        return new CliChecksDraftCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId;
        private String check_id;
        private String descrizione;
        private String note;
        private Boolean risolto;
        private String specifiche;
        private String h_Paziente_;
        private String o_paziente_;
        private String paziente_;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
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

        public Builder setH_Paziente_(String h_Paziente_) {
            this.h_Paziente_ = h_Paziente_;
            return this;
        }

        public Builder setO_paziente_(String o_paziente_) {
            this.o_paziente_ = o_paziente_;
            return this;
        }

        public Builder setPaziente_(String paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliChecksDraftCreateDTO build() {
            CliChecksDraftCreateDTO result = new CliChecksDraftCreateDTO();
            result.set_clientId(this._clientId);
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
