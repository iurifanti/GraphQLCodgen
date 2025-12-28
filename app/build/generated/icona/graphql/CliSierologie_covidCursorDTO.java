package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Sierologie_covid.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliSierologie_covidCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private Integer cc_id;
    private String data_cc;
    private String data_prelievo;
    private Boolean esito;
    private String metodica;
    private Boolean solo_esito;
    private String tempo;
    private String tipo_sierologia;
    private String valore;
    private Boolean vax_ico;

    public CliSierologie_covidCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getCc_id() {
        return cc_id;
    }
    public void setCc_id(Integer cc_id) {
        this.cc_id = cc_id;
    }

    public String getData_cc() {
        return data_cc;
    }
    public void setData_cc(String data_cc) {
        this.data_cc = data_cc;
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

    public String getMetodica() {
        return metodica;
    }
    public void setMetodica(String metodica) {
        this.metodica = metodica;
    }

    public Boolean getSolo_esito() {
        return solo_esito;
    }
    public void setSolo_esito(Boolean solo_esito) {
        this.solo_esito = solo_esito;
    }

    public String getTempo() {
        return tempo;
    }
    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getTipo_sierologia() {
        return tipo_sierologia;
    }
    public void setTipo_sierologia(String tipo_sierologia) {
        this.tipo_sierologia = tipo_sierologia;
    }

    public String getValore() {
        return valore;
    }
    public void setValore(String valore) {
        this.valore = valore;
    }

    public Boolean getVax_ico() {
        return vax_ico;
    }
    public void setVax_ico(Boolean vax_ico) {
        this.vax_ico = vax_ico;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (cc_id != null) {
            joiner.add("cc_id: " + GraphQLRequestSerializer.getEntry(cc_id));
        }
        if (data_cc != null) {
            joiner.add("data_cc: " + GraphQLRequestSerializer.getEntry(data_cc));
        }
        if (data_prelievo != null) {
            joiner.add("data_prelievo: " + GraphQLRequestSerializer.getEntry(data_prelievo));
        }
        if (esito != null) {
            joiner.add("esito: " + GraphQLRequestSerializer.getEntry(esito));
        }
        if (metodica != null) {
            joiner.add("metodica: " + GraphQLRequestSerializer.getEntry(metodica));
        }
        if (solo_esito != null) {
            joiner.add("solo_esito: " + GraphQLRequestSerializer.getEntry(solo_esito));
        }
        if (tempo != null) {
            joiner.add("tempo: " + GraphQLRequestSerializer.getEntry(tempo));
        }
        if (tipo_sierologia != null) {
            joiner.add("tipo_sierologia: " + GraphQLRequestSerializer.getEntry(tipo_sierologia));
        }
        if (valore != null) {
            joiner.add("valore: " + GraphQLRequestSerializer.getEntry(valore));
        }
        if (vax_ico != null) {
            joiner.add("vax_ico: " + GraphQLRequestSerializer.getEntry(vax_ico));
        }
        return joiner.toString();
    }

    public static CliSierologie_covidCursorDTO.Builder builder() {
        return new CliSierologie_covidCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private Integer cc_id;
        private String data_cc;
        private String data_prelievo;
        private Boolean esito;
        private String metodica;
        private Boolean solo_esito;
        private String tempo;
        private String tipo_sierologia;
        private String valore;
        private Boolean vax_ico;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setCc_id(Integer cc_id) {
            this.cc_id = cc_id;
            return this;
        }

        public Builder setData_cc(String data_cc) {
            this.data_cc = data_cc;
            return this;
        }

        public Builder setData_prelievo(String data_prelievo) {
            this.data_prelievo = data_prelievo;
            return this;
        }

        public Builder setEsito(Boolean esito) {
            this.esito = esito;
            return this;
        }

        public Builder setMetodica(String metodica) {
            this.metodica = metodica;
            return this;
        }

        public Builder setSolo_esito(Boolean solo_esito) {
            this.solo_esito = solo_esito;
            return this;
        }

        public Builder setTempo(String tempo) {
            this.tempo = tempo;
            return this;
        }

        public Builder setTipo_sierologia(String tipo_sierologia) {
            this.tipo_sierologia = tipo_sierologia;
            return this;
        }

        public Builder setValore(String valore) {
            this.valore = valore;
            return this;
        }

        public Builder setVax_ico(Boolean vax_ico) {
            this.vax_ico = vax_ico;
            return this;
        }


        public CliSierologie_covidCursorDTO build() {
            CliSierologie_covidCursorDTO result = new CliSierologie_covidCursorDTO();
            result.set_id(this._id);
            result.setCc_id(this.cc_id);
            result.setData_cc(this.data_cc);
            result.setData_prelievo(this.data_prelievo);
            result.setEsito(this.esito);
            result.setMetodica(this.metodica);
            result.setSolo_esito(this.solo_esito);
            result.setTempo(this.tempo);
            result.setTipo_sierologia(this.tipo_sierologia);
            result.setValore(this.valore);
            result.setVax_ico(this.vax_ico);
            return result;
        }

    }
}
