package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Markers_HDV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliMarkers_HDVCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
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

    public CliMarkers_HDVCursorDTO() {
    }


    public String get_createdby() {
        return _createdby;
    }
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    public String get_createdon() {
        return _createdon;
    }
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    public String get_ownedby() {
        return _ownedby;
    }
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    public String get_ownedon() {
        return _ownedon;
    }
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_createdby != null) {
            joiner.add("_createdby: " + GraphQLRequestSerializer.getEntry(_createdby));
        }
        if (_createdon != null) {
            joiner.add("_createdon: " + GraphQLRequestSerializer.getEntry(_createdon));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (_lastmodifiedby != null) {
            joiner.add("_lastmodifiedby: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby));
        }
        if (_lastmodifiedon != null) {
            joiner.add("_lastmodifiedon: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon));
        }
        if (_ownedby != null) {
            joiner.add("_ownedby: " + GraphQLRequestSerializer.getEntry(_ownedby));
        }
        if (_ownedon != null) {
            joiner.add("_ownedon: " + GraphQLRequestSerializer.getEntry(_ownedon));
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
        return joiner.toString();
    }

    public static CliMarkers_HDVCursorDTO.Builder builder() {
        return new CliMarkers_HDVCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _createdby;
        private String _createdon;
        private String _id;
        private String _lastmodifiedby;
        private String _lastmodifiedon;
        private String _ownedby;
        private String _ownedon;
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

        public Builder() {
        }

        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
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


        public CliMarkers_HDVCursorDTO build() {
            CliMarkers_HDVCursorDTO result = new CliMarkers_HDVCursorDTO();
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
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
            return result;
        }

    }
}
