package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of Risposta.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliRispostaCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String risposta_dec;
    private Integer risposta_int;
    private String risposta_str;
    @javax.validation.constraints.NotNull
    private String domanda_;
    private java.util.List<String> risposta_possibile_multipla;

    public CliRispostaCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
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

    public String getDomanda_() {
        return domanda_;
    }
    public void setDomanda_(String domanda_) {
        this.domanda_ = domanda_;
    }

    public java.util.List<String> getRisposta_possibile_multipla() {
        return risposta_possibile_multipla;
    }
    public void setRisposta_possibile_multipla(java.util.List<String> risposta_possibile_multipla) {
        this.risposta_possibile_multipla = risposta_possibile_multipla;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
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

    public static CliRispostaCreateDTO.Builder builder() {
        return new CliRispostaCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId;
        private String risposta_dec;
        private Integer risposta_int;
        private String risposta_str;
        private String domanda_;
        private java.util.List<String> risposta_possibile_multipla;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
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

        public Builder setDomanda_(String domanda_) {
            this.domanda_ = domanda_;
            return this;
        }

        public Builder setRisposta_possibile_multipla(java.util.List<String> risposta_possibile_multipla) {
            this.risposta_possibile_multipla = risposta_possibile_multipla;
            return this;
        }


        public CliRispostaCreateDTO build() {
            CliRispostaCreateDTO result = new CliRispostaCreateDTO();
            result.set_clientId(this._clientId);
            result.setRisposta_dec(this.risposta_dec);
            result.setRisposta_int(this.risposta_int);
            result.setRisposta_str(this.risposta_str);
            result.setDomanda_(this.domanda_);
            result.setRisposta_possibile_multipla(this.risposta_possibile_multipla);
            return result;
        }

    }
}
