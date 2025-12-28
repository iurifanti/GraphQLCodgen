package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a single object of class Risposta.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliRispostaUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private String risposta_dec;
    private Integer risposta_int;
    private String risposta_str;
    private CliDomandaRoleRefDTO domanda_;
    private CliRisposta_possibileRoleRefsDTO risposta_possibile_multipla;

    public CliRispostaUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getRisposta_dec() {
        return risposta_dec;
    }
    public void setRisposta_dec(String risposta_dec) {
        this.risposta_dec = risposta_dec;
    }

    public Integer getRisposta_int() {
        return risposta_int;
    }
    public void setRisposta_int(Integer risposta_int) {
        this.risposta_int = risposta_int;
    }

    public String getRisposta_str() {
        return risposta_str;
    }
    public void setRisposta_str(String risposta_str) {
        this.risposta_str = risposta_str;
    }

    public CliDomandaRoleRefDTO getDomanda_() {
        return domanda_;
    }
    public void setDomanda_(CliDomandaRoleRefDTO domanda_) {
        this.domanda_ = domanda_;
    }

    public CliRisposta_possibileRoleRefsDTO getRisposta_possibile_multipla() {
        return risposta_possibile_multipla;
    }
    public void setRisposta_possibile_multipla(CliRisposta_possibileRoleRefsDTO risposta_possibile_multipla) {
        this.risposta_possibile_multipla = risposta_possibile_multipla;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (risposta_dec != null) {
            joiner.add("risposta_dec: " + GraphQLRequestSerializer.getEntry(risposta_dec));
        }
        if (risposta_int != null) {
            joiner.add("risposta_int: " + GraphQLRequestSerializer.getEntry(risposta_int));
        }
        if (risposta_str != null) {
            joiner.add("risposta_str: " + GraphQLRequestSerializer.getEntry(risposta_str));
        }
        if (domanda_ != null) {
            joiner.add("domanda_: " + GraphQLRequestSerializer.getEntry(domanda_));
        }
        if (risposta_possibile_multipla != null) {
            joiner.add("risposta_possibile_multipla: " + GraphQLRequestSerializer.getEntry(risposta_possibile_multipla));
        }
        return joiner.toString();
    }

    public static CliRispostaUpdateDTO.Builder builder() {
        return new CliRispostaUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String risposta_dec;
        private Integer risposta_int;
        private String risposta_str;
        private CliDomandaRoleRefDTO domanda_;
        private CliRisposta_possibileRoleRefsDTO risposta_possibile_multipla;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setRisposta_dec(String risposta_dec) {
            this.risposta_dec = risposta_dec;
            return this;
        }

        public Builder setRisposta_int(Integer risposta_int) {
            this.risposta_int = risposta_int;
            return this;
        }

        public Builder setRisposta_str(String risposta_str) {
            this.risposta_str = risposta_str;
            return this;
        }

        public Builder setDomanda_(CliDomandaRoleRefDTO domanda_) {
            this.domanda_ = domanda_;
            return this;
        }

        public Builder setRisposta_possibile_multipla(CliRisposta_possibileRoleRefsDTO risposta_possibile_multipla) {
            this.risposta_possibile_multipla = risposta_possibile_multipla;
            return this;
        }


        public CliRispostaUpdateDTO build() {
            CliRispostaUpdateDTO result = new CliRispostaUpdateDTO();
            result.set_id(this._id);
            result.setRisposta_dec(this.risposta_dec);
            result.setRisposta_int(this.risposta_int);
            result.setRisposta_str(this.risposta_str);
            result.setDomanda_(this.domanda_);
            result.setRisposta_possibile_multipla(this.risposta_possibile_multipla);
            return result;
        }

    }
}
