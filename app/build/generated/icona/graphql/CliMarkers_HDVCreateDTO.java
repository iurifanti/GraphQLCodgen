package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of Markers_HDV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliMarkers_HDVCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String altra_metodica;
    private String altra_unita_di_misura;
    private String altro_genotipo;
    @javax.validation.constraints.NotNull
    private String data;
    private String esito;
    private String genotipo_hdv;
    private Integer lower_limit;
    private String sottotipo;
    private String tipologia_test;
    private Integer valore;
    private String metodica_genoma_HDV;
    private String unita_di_misura_viremia_;

    public CliMarkers_HDVCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public String getAltra_metodica() {
        return altra_metodica;
    }
    public void setAltra_metodica(String altra_metodica) {
        this.altra_metodica = altra_metodica;
    }

    public String getAltra_unita_di_misura() {
        return altra_unita_di_misura;
    }
    public void setAltra_unita_di_misura(String altra_unita_di_misura) {
        this.altra_unita_di_misura = altra_unita_di_misura;
    }

    public String getAltro_genotipo() {
        return altro_genotipo;
    }
    public void setAltro_genotipo(String altro_genotipo) {
        this.altro_genotipo = altro_genotipo;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getEsito() {
        return esito;
    }
    public void setEsito(String esito) {
        this.esito = esito;
    }

    public String getGenotipo_hdv() {
        return genotipo_hdv;
    }
    public void setGenotipo_hdv(String genotipo_hdv) {
        this.genotipo_hdv = genotipo_hdv;
    }

    public Integer getLower_limit() {
        return lower_limit;
    }
    public void setLower_limit(Integer lower_limit) {
        this.lower_limit = lower_limit;
    }

    public String getSottotipo() {
        return sottotipo;
    }
    public void setSottotipo(String sottotipo) {
        this.sottotipo = sottotipo;
    }

    public String getTipologia_test() {
        return tipologia_test;
    }
    public void setTipologia_test(String tipologia_test) {
        this.tipologia_test = tipologia_test;
    }

    public Integer getValore() {
        return valore;
    }
    public void setValore(Integer valore) {
        this.valore = valore;
    }

    public String getMetodica_genoma_HDV() {
        return metodica_genoma_HDV;
    }
    public void setMetodica_genoma_HDV(String metodica_genoma_HDV) {
        this.metodica_genoma_HDV = metodica_genoma_HDV;
    }

    public String getUnita_di_misura_viremia_() {
        return unita_di_misura_viremia_;
    }
    public void setUnita_di_misura_viremia_(String unita_di_misura_viremia_) {
        this.unita_di_misura_viremia_ = unita_di_misura_viremia_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (altra_metodica != null) {
            joiner.add("altra_metodica: " + GraphQLRequestSerializer.getEntry(altra_metodica));
        }
        if (altra_unita_di_misura != null) {
            joiner.add("altra_unita_di_misura: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura));
        }
        if (altro_genotipo != null) {
            joiner.add("altro_genotipo: " + GraphQLRequestSerializer.getEntry(altro_genotipo));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (esito != null) {
            joiner.add("esito: " + GraphQLRequestSerializer.getEntry(esito));
        }
        if (genotipo_hdv != null) {
            joiner.add("genotipo_hdv: " + GraphQLRequestSerializer.getEntry(genotipo_hdv));
        }
        if (lower_limit != null) {
            joiner.add("lower_limit: " + GraphQLRequestSerializer.getEntry(lower_limit));
        }
        if (sottotipo != null) {
            joiner.add("sottotipo: " + GraphQLRequestSerializer.getEntry(sottotipo));
        }
        if (tipologia_test != null) {
            joiner.add("tipologia_test: " + GraphQLRequestSerializer.getEntry(tipologia_test));
        }
        if (valore != null) {
            joiner.add("valore: " + GraphQLRequestSerializer.getEntry(valore));
        }
        if (metodica_genoma_HDV != null) {
            joiner.add("metodica_genoma_HDV: " + GraphQLRequestSerializer.getEntry(metodica_genoma_HDV));
        }
        if (unita_di_misura_viremia_ != null) {
            joiner.add("unita_di_misura_viremia_: " + GraphQLRequestSerializer.getEntry(unita_di_misura_viremia_));
        }
        return joiner.toString();
    }

    public static CliMarkers_HDVCreateDTO.Builder builder() {
        return new CliMarkers_HDVCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId;
        private String altra_metodica;
        private String altra_unita_di_misura;
        private String altro_genotipo;
        private String data;
        private String esito;
        private String genotipo_hdv;
        private Integer lower_limit;
        private String sottotipo;
        private String tipologia_test;
        private Integer valore;
        private String metodica_genoma_HDV;
        private String unita_di_misura_viremia_;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setAltra_metodica(String altra_metodica) {
            this.altra_metodica = altra_metodica;
            return this;
        }

        public Builder setAltra_unita_di_misura(String altra_unita_di_misura) {
            this.altra_unita_di_misura = altra_unita_di_misura;
            return this;
        }

        public Builder setAltro_genotipo(String altro_genotipo) {
            this.altro_genotipo = altro_genotipo;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setEsito(String esito) {
            this.esito = esito;
            return this;
        }

        public Builder setGenotipo_hdv(String genotipo_hdv) {
            this.genotipo_hdv = genotipo_hdv;
            return this;
        }

        public Builder setLower_limit(Integer lower_limit) {
            this.lower_limit = lower_limit;
            return this;
        }

        public Builder setSottotipo(String sottotipo) {
            this.sottotipo = sottotipo;
            return this;
        }

        public Builder setTipologia_test(String tipologia_test) {
            this.tipologia_test = tipologia_test;
            return this;
        }

        public Builder setValore(Integer valore) {
            this.valore = valore;
            return this;
        }

        public Builder setMetodica_genoma_HDV(String metodica_genoma_HDV) {
            this.metodica_genoma_HDV = metodica_genoma_HDV;
            return this;
        }

        public Builder setUnita_di_misura_viremia_(String unita_di_misura_viremia_) {
            this.unita_di_misura_viremia_ = unita_di_misura_viremia_;
            return this;
        }


        public CliMarkers_HDVCreateDTO build() {
            CliMarkers_HDVCreateDTO result = new CliMarkers_HDVCreateDTO();
            result.set_clientId(this._clientId);
            result.setAltra_metodica(this.altra_metodica);
            result.setAltra_unita_di_misura(this.altra_unita_di_misura);
            result.setAltro_genotipo(this.altro_genotipo);
            result.setData(this.data);
            result.setEsito(this.esito);
            result.setGenotipo_hdv(this.genotipo_hdv);
            result.setLower_limit(this.lower_limit);
            result.setSottotipo(this.sottotipo);
            result.setTipologia_test(this.tipologia_test);
            result.setValore(this.valore);
            result.setMetodica_genoma_HDV(this.metodica_genoma_HDV);
            result.setUnita_di_misura_viremia_(this.unita_di_misura_viremia_);
            return result;
        }

    }
}
