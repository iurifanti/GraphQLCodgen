package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Terapia_altro.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTerapia_altroCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String altra_motivazione_fine;
    private String altro_farmaco;
    private String codice_centro;
    private Integer count_dosaggi;
    private String data_fine;
    private String data_inizio;
    private String dosaggio;
    private Boolean epatica;
    private String farmaco_ATC;
    private String motivazione_fine;
    private String nome_farmaco;
    private String nome_gruppo;
    private String nome_tipo;
    private String object_title;
    private String ricerca_farmaco;

    public CliTerapia_altroCursorDTO() {
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

    public String getAltra_motivazione_fine() {
        return altra_motivazione_fine;
    }
    public void setAltra_motivazione_fine(String altra_motivazione_fine) {
        this.altra_motivazione_fine = altra_motivazione_fine;
    }

    public String getAltro_farmaco() {
        return altro_farmaco;
    }
    public void setAltro_farmaco(String altro_farmaco) {
        this.altro_farmaco = altro_farmaco;
    }

    public String getCodice_centro() {
        return codice_centro;
    }
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    public Integer getCount_dosaggi() {
        return count_dosaggi;
    }
    public void setCount_dosaggi(Integer count_dosaggi) {
        this.count_dosaggi = count_dosaggi;
    }

    public String getData_fine() {
        return data_fine;
    }
    public void setData_fine(String data_fine) {
        this.data_fine = data_fine;
    }

    public String getData_inizio() {
        return data_inizio;
    }
    public void setData_inizio(String data_inizio) {
        this.data_inizio = data_inizio;
    }

    public String getDosaggio() {
        return dosaggio;
    }
    public void setDosaggio(String dosaggio) {
        this.dosaggio = dosaggio;
    }

    public Boolean getEpatica() {
        return epatica;
    }
    public void setEpatica(Boolean epatica) {
        this.epatica = epatica;
    }

    public String getFarmaco_ATC() {
        return farmaco_ATC;
    }
    public void setFarmaco_ATC(String farmaco_ATC) {
        this.farmaco_ATC = farmaco_ATC;
    }

    public String getMotivazione_fine() {
        return motivazione_fine;
    }
    public void setMotivazione_fine(String motivazione_fine) {
        this.motivazione_fine = motivazione_fine;
    }

    public String getNome_farmaco() {
        return nome_farmaco;
    }
    public void setNome_farmaco(String nome_farmaco) {
        this.nome_farmaco = nome_farmaco;
    }

    public String getNome_gruppo() {
        return nome_gruppo;
    }
    public void setNome_gruppo(String nome_gruppo) {
        this.nome_gruppo = nome_gruppo;
    }

    public String getNome_tipo() {
        return nome_tipo;
    }
    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    public String getObject_title() {
        return object_title;
    }
    public void setObject_title(String object_title) {
        this.object_title = object_title;
    }

    public String getRicerca_farmaco() {
        return ricerca_farmaco;
    }
    public void setRicerca_farmaco(String ricerca_farmaco) {
        this.ricerca_farmaco = ricerca_farmaco;
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
        if (altra_motivazione_fine != null) {
            joiner.add("altra_motivazione_fine: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine));
        }
        if (altro_farmaco != null) {
            joiner.add("altro_farmaco: " + GraphQLRequestSerializer.getEntry(altro_farmaco));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (count_dosaggi != null) {
            joiner.add("count_dosaggi: " + GraphQLRequestSerializer.getEntry(count_dosaggi));
        }
        if (data_fine != null) {
            joiner.add("data_fine: " + GraphQLRequestSerializer.getEntry(data_fine));
        }
        if (data_inizio != null) {
            joiner.add("data_inizio: " + GraphQLRequestSerializer.getEntry(data_inizio));
        }
        if (dosaggio != null) {
            joiner.add("dosaggio: " + GraphQLRequestSerializer.getEntry(dosaggio));
        }
        if (epatica != null) {
            joiner.add("epatica: " + GraphQLRequestSerializer.getEntry(epatica));
        }
        if (farmaco_ATC != null) {
            joiner.add("farmaco_ATC: " + GraphQLRequestSerializer.getEntry(farmaco_ATC));
        }
        if (motivazione_fine != null) {
            joiner.add("motivazione_fine: " + GraphQLRequestSerializer.getEntry(motivazione_fine));
        }
        if (nome_farmaco != null) {
            joiner.add("nome_farmaco: " + GraphQLRequestSerializer.getEntry(nome_farmaco));
        }
        if (nome_gruppo != null) {
            joiner.add("nome_gruppo: " + GraphQLRequestSerializer.getEntry(nome_gruppo));
        }
        if (nome_tipo != null) {
            joiner.add("nome_tipo: " + GraphQLRequestSerializer.getEntry(nome_tipo));
        }
        if (object_title != null) {
            joiner.add("object_title: " + GraphQLRequestSerializer.getEntry(object_title));
        }
        if (ricerca_farmaco != null) {
            joiner.add("ricerca_farmaco: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco));
        }
        return joiner.toString();
    }

    public static CliTerapia_altroCursorDTO.Builder builder() {
        return new CliTerapia_altroCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _createdby;
        private String _createdon;
        private String _id;
        private String _lastmodifiedby;
        private String _lastmodifiedon;
        private String _ownedby;
        private String _ownedon;
        private String altra_motivazione_fine;
        private String altro_farmaco;
        private String codice_centro;
        private Integer count_dosaggi;
        private String data_fine;
        private String data_inizio;
        private String dosaggio;
        private Boolean epatica;
        private String farmaco_ATC;
        private String motivazione_fine;
        private String nome_farmaco;
        private String nome_gruppo;
        private String nome_tipo;
        private String object_title;
        private String ricerca_farmaco;

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

        public Builder setAltra_motivazione_fine(String altra_motivazione_fine) {
            this.altra_motivazione_fine = altra_motivazione_fine;
            return this;
        }

        public Builder setAltro_farmaco(String altro_farmaco) {
            this.altro_farmaco = altro_farmaco;
            return this;
        }

        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        public Builder setCount_dosaggi(Integer count_dosaggi) {
            this.count_dosaggi = count_dosaggi;
            return this;
        }

        public Builder setData_fine(String data_fine) {
            this.data_fine = data_fine;
            return this;
        }

        public Builder setData_inizio(String data_inizio) {
            this.data_inizio = data_inizio;
            return this;
        }

        public Builder setDosaggio(String dosaggio) {
            this.dosaggio = dosaggio;
            return this;
        }

        public Builder setEpatica(Boolean epatica) {
            this.epatica = epatica;
            return this;
        }

        public Builder setFarmaco_ATC(String farmaco_ATC) {
            this.farmaco_ATC = farmaco_ATC;
            return this;
        }

        public Builder setMotivazione_fine(String motivazione_fine) {
            this.motivazione_fine = motivazione_fine;
            return this;
        }

        public Builder setNome_farmaco(String nome_farmaco) {
            this.nome_farmaco = nome_farmaco;
            return this;
        }

        public Builder setNome_gruppo(String nome_gruppo) {
            this.nome_gruppo = nome_gruppo;
            return this;
        }

        public Builder setNome_tipo(String nome_tipo) {
            this.nome_tipo = nome_tipo;
            return this;
        }

        public Builder setObject_title(String object_title) {
            this.object_title = object_title;
            return this;
        }

        public Builder setRicerca_farmaco(String ricerca_farmaco) {
            this.ricerca_farmaco = ricerca_farmaco;
            return this;
        }


        public CliTerapia_altroCursorDTO build() {
            CliTerapia_altroCursorDTO result = new CliTerapia_altroCursorDTO();
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAltra_motivazione_fine(this.altra_motivazione_fine);
            result.setAltro_farmaco(this.altro_farmaco);
            result.setCodice_centro(this.codice_centro);
            result.setCount_dosaggi(this.count_dosaggi);
            result.setData_fine(this.data_fine);
            result.setData_inizio(this.data_inizio);
            result.setDosaggio(this.dosaggio);
            result.setEpatica(this.epatica);
            result.setFarmaco_ATC(this.farmaco_ATC);
            result.setMotivazione_fine(this.motivazione_fine);
            result.setNome_farmaco(this.nome_farmaco);
            result.setNome_gruppo(this.nome_gruppo);
            result.setNome_tipo(this.nome_tipo);
            result.setObject_title(this.object_title);
            result.setRicerca_farmaco(this.ricerca_farmaco);
            return result;
        }

    }
}
