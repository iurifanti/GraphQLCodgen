package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of class Markers_HBV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMarkers_HBVUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String altra_metodica;
    private String altra_unita_di_misura;
    private String data;
    private String esito;
    private String genotipo_hbv;
    private Integer lower_limit;
    private String tipologia_test;
    private Integer valore;
    private CliMetodica_genoma_HCV_HBVRoleRefDTO metodica_genoma_HBV;
    private CliUnita_di_misura_viremiaRoleRefDTO unita_di_misura_viremia;

    public CliMarkers_HBVUpdateBulkDTO() {
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

    public String getGenotipo_hbv() {
        return genotipo_hbv;
    }
    public void setGenotipo_hbv(String genotipo_hbv) {
        this.genotipo_hbv = genotipo_hbv;
    }

    public Integer getLower_limit() {
        return lower_limit;
    }
    public void setLower_limit(Integer lower_limit) {
        this.lower_limit = lower_limit;
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

    public CliMetodica_genoma_HCV_HBVRoleRefDTO getMetodica_genoma_HBV() {
        return metodica_genoma_HBV;
    }
    public void setMetodica_genoma_HBV(CliMetodica_genoma_HCV_HBVRoleRefDTO metodica_genoma_HBV) {
        this.metodica_genoma_HBV = metodica_genoma_HBV;
    }

    public CliUnita_di_misura_viremiaRoleRefDTO getUnita_di_misura_viremia() {
        return unita_di_misura_viremia;
    }
    public void setUnita_di_misura_viremia(CliUnita_di_misura_viremiaRoleRefDTO unita_di_misura_viremia) {
        this.unita_di_misura_viremia = unita_di_misura_viremia;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (altra_metodica != null) {
            joiner.add("altra_metodica: " + GraphQLRequestSerializer.getEntry(altra_metodica));
        }
        if (altra_unita_di_misura != null) {
            joiner.add("altra_unita_di_misura: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (esito != null) {
            joiner.add("esito: " + GraphQLRequestSerializer.getEntry(esito));
        }
        if (genotipo_hbv != null) {
            joiner.add("genotipo_hbv: " + GraphQLRequestSerializer.getEntry(genotipo_hbv));
        }
        if (lower_limit != null) {
            joiner.add("lower_limit: " + GraphQLRequestSerializer.getEntry(lower_limit));
        }
        if (tipologia_test != null) {
            joiner.add("tipologia_test: " + GraphQLRequestSerializer.getEntry(tipologia_test));
        }
        if (valore != null) {
            joiner.add("valore: " + GraphQLRequestSerializer.getEntry(valore));
        }
        if (metodica_genoma_HBV != null) {
            joiner.add("metodica_genoma_HBV: " + GraphQLRequestSerializer.getEntry(metodica_genoma_HBV));
        }
        if (unita_di_misura_viremia != null) {
            joiner.add("unita_di_misura_viremia: " + GraphQLRequestSerializer.getEntry(unita_di_misura_viremia));
        }
        return joiner.toString();
    }

    public static CliMarkers_HBVUpdateBulkDTO.Builder builder() {
        return new CliMarkers_HBVUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String altra_metodica;
        private String altra_unita_di_misura;
        private String data;
        private String esito;
        private String genotipo_hbv;
        private Integer lower_limit;
        private String tipologia_test;
        private Integer valore;
        private CliMetodica_genoma_HCV_HBVRoleRefDTO metodica_genoma_HBV;
        private CliUnita_di_misura_viremiaRoleRefDTO unita_di_misura_viremia;

        public Builder() {
        }

        public Builder setAltra_metodica(String altra_metodica) {
            this.altra_metodica = altra_metodica;
            return this;
        }

        public Builder setAltra_unita_di_misura(String altra_unita_di_misura) {
            this.altra_unita_di_misura = altra_unita_di_misura;
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

        public Builder setGenotipo_hbv(String genotipo_hbv) {
            this.genotipo_hbv = genotipo_hbv;
            return this;
        }

        public Builder setLower_limit(Integer lower_limit) {
            this.lower_limit = lower_limit;
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

        public Builder setMetodica_genoma_HBV(CliMetodica_genoma_HCV_HBVRoleRefDTO metodica_genoma_HBV) {
            this.metodica_genoma_HBV = metodica_genoma_HBV;
            return this;
        }

        public Builder setUnita_di_misura_viremia(CliUnita_di_misura_viremiaRoleRefDTO unita_di_misura_viremia) {
            this.unita_di_misura_viremia = unita_di_misura_viremia;
            return this;
        }


        public CliMarkers_HBVUpdateBulkDTO build() {
            CliMarkers_HBVUpdateBulkDTO result = new CliMarkers_HBVUpdateBulkDTO();
            result.setAltra_metodica(this.altra_metodica);
            result.setAltra_unita_di_misura(this.altra_unita_di_misura);
            result.setData(this.data);
            result.setEsito(this.esito);
            result.setGenotipo_hbv(this.genotipo_hbv);
            result.setLower_limit(this.lower_limit);
            result.setTipologia_test(this.tipologia_test);
            result.setValore(this.valore);
            result.setMetodica_genoma_HBV(this.metodica_genoma_HBV);
            result.setUnita_di_misura_viremia(this.unita_di_misura_viremia);
            return result;
        }

    }
}
