package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Sierologie_covid, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliSierologie_covidDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
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
    private CliMetodica_sierologia_covidDTO metodica_sierologia_covid_n;
    private CliTempo_sierologia_covidDTO tempo_sierologia_covid_;
    private CliTipo_sierologia_covidDTO tipo_sierologia_covid_;
    private CliControllo_clinicoDTO controllo_clinico_;
    private CliV_dettaglioDTO v_dettaglio_;

    public CliSierologie_covidDTO() {
    }


    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public String get_clientId() {
        return _clientId;
    }
    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    /**
     * The attribute _id of Sierologie_covid. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Sierologie_covid. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute cc_id of Sierologie_covid. It is of type Int. Path: controllo_clinico_ __id. Cannot be null.
     */
    public Integer getCc_id() {
        return cc_id;
    }
    /**
     * The attribute cc_id of Sierologie_covid. It is of type Int. Path: controllo_clinico_ __id. Cannot be null.
     */
    public void setCc_id(Integer cc_id) {
        this.cc_id = cc_id;
    }

    /**
     * The attribute data_cc of Sierologie_covid. It is of type Date @dateFormat. Path: controllo_clinico_ data. Cannot be null.
     */
    public String getData_cc() {
        return data_cc;
    }
    /**
     * The attribute data_cc of Sierologie_covid. It is of type Date @dateFormat. Path: controllo_clinico_ data. Cannot be null.
     */
    public void setData_cc(String data_cc) {
        this.data_cc = data_cc;
    }

    /**
     * The attribute data_prelievo of Sierologie_covid. It is of type Date @dateFormat.
     */
    public String getData_prelievo() {
        return data_prelievo;
    }
    /**
     * The attribute data_prelievo of Sierologie_covid. It is of type Date @dateFormat.
     */
    public void setData_prelievo(String data_prelievo) {
        this.data_prelievo = data_prelievo;
    }

    /**
     * The attribute esito of Sierologie_covid. It is of type Boolean.
     */
    public Boolean getEsito() {
        return esito;
    }
    /**
     * The attribute esito of Sierologie_covid. It is of type Boolean.
     */
    public void setEsito(Boolean esito) {
        this.esito = esito;
    }

    /**
     * The attribute metodica of Sierologie_covid. It is of type String. Path: metodica_sierologia_covid_n nome.
     */
    public String getMetodica() {
        return metodica;
    }
    /**
     * The attribute metodica of Sierologie_covid. It is of type String. Path: metodica_sierologia_covid_n nome.
     */
    public void setMetodica(String metodica) {
        this.metodica = metodica;
    }

    /**
     * The attribute solo_esito of Sierologie_covid. It is of type Boolean. Path: tipo_sierologia_covid_ solo_esito.
     */
    public Boolean getSolo_esito() {
        return solo_esito;
    }
    /**
     * The attribute solo_esito of Sierologie_covid. It is of type Boolean. Path: tipo_sierologia_covid_ solo_esito.
     */
    public void setSolo_esito(Boolean solo_esito) {
        this.solo_esito = solo_esito;
    }

    /**
     * The attribute tempo of Sierologie_covid. It is of type String. Path: tempo_sierologia_covid_ nome.
     */
    public String getTempo() {
        return tempo;
    }
    /**
     * The attribute tempo of Sierologie_covid. It is of type String. Path: tempo_sierologia_covid_ nome.
     */
    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    /**
     * The attribute tipo_sierologia of Sierologie_covid. It is of type String. Path: tipo_sierologia_covid_ nome.
     */
    public String getTipo_sierologia() {
        return tipo_sierologia;
    }
    /**
     * The attribute tipo_sierologia of Sierologie_covid. It is of type String. Path: tipo_sierologia_covid_ nome.
     */
    public void setTipo_sierologia(String tipo_sierologia) {
        this.tipo_sierologia = tipo_sierologia;
    }

    /**
     * The attribute valore of Sierologie_covid. It is of type Real @realFormat.
     */
    public String getValore() {
        return valore;
    }
    /**
     * The attribute valore of Sierologie_covid. It is of type Real @realFormat.
     */
    public void setValore(String valore) {
        this.valore = valore;
    }

    /**
     * The attribute vax_ico of Sierologie_covid. It is of type Boolean. Path: v_dettaglio_ vax_ico.
     */
    public Boolean getVax_ico() {
        return vax_ico;
    }
    /**
     * The attribute vax_ico of Sierologie_covid. It is of type Boolean. Path: v_dettaglio_ vax_ico.
     */
    public void setVax_ico(Boolean vax_ico) {
        this.vax_ico = vax_ico;
    }

    /**
     * The associated object for the role metodica_sierologia_covid_n.
     */
    public CliMetodica_sierologia_covidDTO getMetodica_sierologia_covid_n() {
        return metodica_sierologia_covid_n;
    }
    /**
     * The associated object for the role metodica_sierologia_covid_n.
     */
    public void setMetodica_sierologia_covid_n(CliMetodica_sierologia_covidDTO metodica_sierologia_covid_n) {
        this.metodica_sierologia_covid_n = metodica_sierologia_covid_n;
    }

    /**
     * The associated object for the role tempo_sierologia_covid_.
     */
    public CliTempo_sierologia_covidDTO getTempo_sierologia_covid_() {
        return tempo_sierologia_covid_;
    }
    /**
     * The associated object for the role tempo_sierologia_covid_.
     */
    public void setTempo_sierologia_covid_(CliTempo_sierologia_covidDTO tempo_sierologia_covid_) {
        this.tempo_sierologia_covid_ = tempo_sierologia_covid_;
    }

    /**
     * The associated object for the role tipo_sierologia_covid_.
     */
    public CliTipo_sierologia_covidDTO getTipo_sierologia_covid_() {
        return tipo_sierologia_covid_;
    }
    /**
     * The associated object for the role tipo_sierologia_covid_.
     */
    public void setTipo_sierologia_covid_(CliTipo_sierologia_covidDTO tipo_sierologia_covid_) {
        this.tipo_sierologia_covid_ = tipo_sierologia_covid_;
    }

    /**
     * The associated object for the role controllo_clinico_.
     */
    public CliControllo_clinicoDTO getControllo_clinico_() {
        return controllo_clinico_;
    }
    /**
     * The associated object for the role controllo_clinico_.
     */
    public void setControllo_clinico_(CliControllo_clinicoDTO controllo_clinico_) {
        this.controllo_clinico_ = controllo_clinico_;
    }

    /**
     * The associated object for the role v_dettaglio_.
     */
    public CliV_dettaglioDTO getV_dettaglio_() {
        return v_dettaglio_;
    }
    /**
     * The associated object for the role v_dettaglio_.
     */
    public void setV_dettaglio_(CliV_dettaglioDTO v_dettaglio_) {
        this.v_dettaglio_ = v_dettaglio_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
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
        if (metodica_sierologia_covid_n != null) {
            joiner.add("metodica_sierologia_covid_n: " + GraphQLRequestSerializer.getEntry(metodica_sierologia_covid_n));
        }
        if (tempo_sierologia_covid_ != null) {
            joiner.add("tempo_sierologia_covid_: " + GraphQLRequestSerializer.getEntry(tempo_sierologia_covid_));
        }
        if (tipo_sierologia_covid_ != null) {
            joiner.add("tipo_sierologia_covid_: " + GraphQLRequestSerializer.getEntry(tipo_sierologia_covid_));
        }
        if (controllo_clinico_ != null) {
            joiner.add("controllo_clinico_: " + GraphQLRequestSerializer.getEntry(controllo_clinico_));
        }
        if (v_dettaglio_ != null) {
            joiner.add("v_dettaglio_: " + GraphQLRequestSerializer.getEntry(v_dettaglio_));
        }
        return joiner.toString();
    }

    public static CliSierologie_covidDTO.Builder builder() {
        return new CliSierologie_covidDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
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
        private CliMetodica_sierologia_covidDTO metodica_sierologia_covid_n;
        private CliTempo_sierologia_covidDTO tempo_sierologia_covid_;
        private CliTipo_sierologia_covidDTO tipo_sierologia_covid_;
        private CliControllo_clinicoDTO controllo_clinico_;
        private CliV_dettaglioDTO v_dettaglio_;

        public Builder() {
        }

        /**
         * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
         */
        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        /**
         * The attribute _id of Sierologie_covid. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute cc_id of Sierologie_covid. It is of type Int. Path: controllo_clinico_ __id. Cannot be null.
         */
        public Builder setCc_id(Integer cc_id) {
            this.cc_id = cc_id;
            return this;
        }

        /**
         * The attribute data_cc of Sierologie_covid. It is of type Date @dateFormat. Path: controllo_clinico_ data. Cannot be null.
         */
        public Builder setData_cc(String data_cc) {
            this.data_cc = data_cc;
            return this;
        }

        /**
         * The attribute data_prelievo of Sierologie_covid. It is of type Date @dateFormat.
         */
        public Builder setData_prelievo(String data_prelievo) {
            this.data_prelievo = data_prelievo;
            return this;
        }

        /**
         * The attribute esito of Sierologie_covid. It is of type Boolean.
         */
        public Builder setEsito(Boolean esito) {
            this.esito = esito;
            return this;
        }

        /**
         * The attribute metodica of Sierologie_covid. It is of type String. Path: metodica_sierologia_covid_n nome.
         */
        public Builder setMetodica(String metodica) {
            this.metodica = metodica;
            return this;
        }

        /**
         * The attribute solo_esito of Sierologie_covid. It is of type Boolean. Path: tipo_sierologia_covid_ solo_esito.
         */
        public Builder setSolo_esito(Boolean solo_esito) {
            this.solo_esito = solo_esito;
            return this;
        }

        /**
         * The attribute tempo of Sierologie_covid. It is of type String. Path: tempo_sierologia_covid_ nome.
         */
        public Builder setTempo(String tempo) {
            this.tempo = tempo;
            return this;
        }

        /**
         * The attribute tipo_sierologia of Sierologie_covid. It is of type String. Path: tipo_sierologia_covid_ nome.
         */
        public Builder setTipo_sierologia(String tipo_sierologia) {
            this.tipo_sierologia = tipo_sierologia;
            return this;
        }

        /**
         * The attribute valore of Sierologie_covid. It is of type Real @realFormat.
         */
        public Builder setValore(String valore) {
            this.valore = valore;
            return this;
        }

        /**
         * The attribute vax_ico of Sierologie_covid. It is of type Boolean. Path: v_dettaglio_ vax_ico.
         */
        public Builder setVax_ico(Boolean vax_ico) {
            this.vax_ico = vax_ico;
            return this;
        }

        /**
         * The associated object for the role metodica_sierologia_covid_n.
         */
        public Builder setMetodica_sierologia_covid_n(CliMetodica_sierologia_covidDTO metodica_sierologia_covid_n) {
            this.metodica_sierologia_covid_n = metodica_sierologia_covid_n;
            return this;
        }

        /**
         * The associated object for the role tempo_sierologia_covid_.
         */
        public Builder setTempo_sierologia_covid_(CliTempo_sierologia_covidDTO tempo_sierologia_covid_) {
            this.tempo_sierologia_covid_ = tempo_sierologia_covid_;
            return this;
        }

        /**
         * The associated object for the role tipo_sierologia_covid_.
         */
        public Builder setTipo_sierologia_covid_(CliTipo_sierologia_covidDTO tipo_sierologia_covid_) {
            this.tipo_sierologia_covid_ = tipo_sierologia_covid_;
            return this;
        }

        /**
         * The associated object for the role controllo_clinico_.
         */
        public Builder setControllo_clinico_(CliControllo_clinicoDTO controllo_clinico_) {
            this.controllo_clinico_ = controllo_clinico_;
            return this;
        }

        /**
         * The associated object for the role v_dettaglio_.
         */
        public Builder setV_dettaglio_(CliV_dettaglioDTO v_dettaglio_) {
            this.v_dettaglio_ = v_dettaglio_;
            return this;
        }


        public CliSierologie_covidDTO build() {
            CliSierologie_covidDTO result = new CliSierologie_covidDTO();
            result.set_clientId(this._clientId);
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
            result.setMetodica_sierologia_covid_n(this.metodica_sierologia_covid_n);
            result.setTempo_sierologia_covid_(this.tempo_sierologia_covid_);
            result.setTipo_sierologia_covid_(this.tipo_sierologia_covid_);
            result.setControllo_clinico_(this.controllo_clinico_);
            result.setV_dettaglio_(this.v_dettaglio_);
            return result;
        }

    }
}
