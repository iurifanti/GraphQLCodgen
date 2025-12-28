package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update objects of class Sierologie_covid.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliSierologie_covidDraftUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String data_prelievo;
    private Boolean esito;
    private String valore;
    private CliMetodica_sierologia_covidRoleRefDTO metodica_sierologia_covid_n;
    private CliTempo_sierologia_covidRoleRefDTO tempo_sierologia_covid_;
    private CliTipo_sierologia_covidRoleRefDTO tipo_sierologia_covid_;

    public CliSierologie_covidDraftUpdateBulkDTO() {
    }


    public String getData_prelievo() {
        return data_prelievo;
    }
    public void setData_prelievo(String data_prelievo) {
        this.data_prelievo = data_prelievo;
    }

    public Boolean getEsito() {
        return esito;
    }
    public void setEsito(Boolean esito) {
        this.esito = esito;
    }

    public String getValore() {
        return valore;
    }
    public void setValore(String valore) {
        this.valore = valore;
    }

    public CliMetodica_sierologia_covidRoleRefDTO getMetodica_sierologia_covid_n() {
        return metodica_sierologia_covid_n;
    }
    public void setMetodica_sierologia_covid_n(CliMetodica_sierologia_covidRoleRefDTO metodica_sierologia_covid_n) {
        this.metodica_sierologia_covid_n = metodica_sierologia_covid_n;
    }

    public CliTempo_sierologia_covidRoleRefDTO getTempo_sierologia_covid_() {
        return tempo_sierologia_covid_;
    }
    public void setTempo_sierologia_covid_(CliTempo_sierologia_covidRoleRefDTO tempo_sierologia_covid_) {
        this.tempo_sierologia_covid_ = tempo_sierologia_covid_;
    }

    public CliTipo_sierologia_covidRoleRefDTO getTipo_sierologia_covid_() {
        return tipo_sierologia_covid_;
    }
    public void setTipo_sierologia_covid_(CliTipo_sierologia_covidRoleRefDTO tipo_sierologia_covid_) {
        this.tipo_sierologia_covid_ = tipo_sierologia_covid_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (data_prelievo != null) {
            joiner.add("data_prelievo: " + GraphQLRequestSerializer.getEntry(data_prelievo));
        }
        if (esito != null) {
            joiner.add("esito: " + GraphQLRequestSerializer.getEntry(esito));
        }
        if (valore != null) {
            joiner.add("valore: " + GraphQLRequestSerializer.getEntry(valore));
        }
        if (metodica_sierologia_covid_n != null) {
            joiner.add("metodica_sierologia_covid_n: " + GraphQLRequestSerializer.getEntry(metodica_sierologia_covid_n));
        }
        if (tempo_sierologia_covid_ != null) {
            joiner.add("tempo_sierologia_covid_: " + GraphQLRequestSerializer.getEntry(tempo_sierologia_covid_));
        }
        if (tipo_sierologia_covid_ != null) {
            joiner.add("tipo_sierologia_covid_: " + GraphQLRequestSerializer.getEntry(tipo_sierologia_covid_));
        }
        return joiner.toString();
    }

    public static CliSierologie_covidDraftUpdateBulkDTO.Builder builder() {
        return new CliSierologie_covidDraftUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String data_prelievo;
        private Boolean esito;
        private String valore;
        private CliMetodica_sierologia_covidRoleRefDTO metodica_sierologia_covid_n;
        private CliTempo_sierologia_covidRoleRefDTO tempo_sierologia_covid_;
        private CliTipo_sierologia_covidRoleRefDTO tipo_sierologia_covid_;

        public Builder() {
        }

        public Builder setData_prelievo(String data_prelievo) {
            this.data_prelievo = data_prelievo;
            return this;
        }

        public Builder setEsito(Boolean esito) {
            this.esito = esito;
            return this;
        }

        public Builder setValore(String valore) {
            this.valore = valore;
            return this;
        }

        public Builder setMetodica_sierologia_covid_n(CliMetodica_sierologia_covidRoleRefDTO metodica_sierologia_covid_n) {
            this.metodica_sierologia_covid_n = metodica_sierologia_covid_n;
            return this;
        }

        public Builder setTempo_sierologia_covid_(CliTempo_sierologia_covidRoleRefDTO tempo_sierologia_covid_) {
            this.tempo_sierologia_covid_ = tempo_sierologia_covid_;
            return this;
        }

        public Builder setTipo_sierologia_covid_(CliTipo_sierologia_covidRoleRefDTO tipo_sierologia_covid_) {
            this.tipo_sierologia_covid_ = tipo_sierologia_covid_;
            return this;
        }


        public CliSierologie_covidDraftUpdateBulkDTO build() {
            CliSierologie_covidDraftUpdateBulkDTO result = new CliSierologie_covidDraftUpdateBulkDTO();
            result.setData_prelievo(this.data_prelievo);
            result.setEsito(this.esito);
            result.setValore(this.valore);
            result.setMetodica_sierologia_covid_n(this.metodica_sierologia_covid_n);
            result.setTempo_sierologia_covid_(this.tempo_sierologia_covid_);
            result.setTipo_sierologia_covid_(this.tipo_sierologia_covid_);
            return result;
        }

    }
}
