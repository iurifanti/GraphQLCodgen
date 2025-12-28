package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
campione_old.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliCampione_oldCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String campione;
    private String centro_icona;
    private String data_prelievo;
    private String etichetta;
    private Integer id_campione;
    private String note_campione;
    private String object_title;
    private String paziente_hepaicona;
    private String paziente_icona;
    private String paziente_nascita;
    private String posizioni;
    private Integer provette_iniziali;
    private Integer provette_rimanenti;
    private String qt;
    private String quantita;
    private String rack;
    private String sede_biobanca;
    private String um;

    public CliCampione_oldCursorDTO() {
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

    public String getCampione() {
        return campione;
    }
    public void setCampione(String campione) {
        this.campione = campione;
    }

    public String getCentro_icona() {
        return centro_icona;
    }
    public void setCentro_icona(String centro_icona) {
        this.centro_icona = centro_icona;
    }

    public String getData_prelievo() {
        return data_prelievo;
    }
    public void setData_prelievo(String data_prelievo) {
        this.data_prelievo = data_prelievo;
    }

    public String getEtichetta() {
        return etichetta;
    }
    public void setEtichetta(String etichetta) {
        this.etichetta = etichetta;
    }

    public Integer getId_campione() {
        return id_campione;
    }
    public void setId_campione(Integer id_campione) {
        this.id_campione = id_campione;
    }

    public String getNote_campione() {
        return note_campione;
    }
    public void setNote_campione(String note_campione) {
        this.note_campione = note_campione;
    }

    public String getObject_title() {
        return object_title;
    }
    public void setObject_title(String object_title) {
        this.object_title = object_title;
    }

    public String getPaziente_hepaicona() {
        return paziente_hepaicona;
    }
    public void setPaziente_hepaicona(String paziente_hepaicona) {
        this.paziente_hepaicona = paziente_hepaicona;
    }

    public String getPaziente_icona() {
        return paziente_icona;
    }
    public void setPaziente_icona(String paziente_icona) {
        this.paziente_icona = paziente_icona;
    }

    public String getPaziente_nascita() {
        return paziente_nascita;
    }
    public void setPaziente_nascita(String paziente_nascita) {
        this.paziente_nascita = paziente_nascita;
    }

    public String getPosizioni() {
        return posizioni;
    }
    public void setPosizioni(String posizioni) {
        this.posizioni = posizioni;
    }

    public Integer getProvette_iniziali() {
        return provette_iniziali;
    }
    public void setProvette_iniziali(Integer provette_iniziali) {
        this.provette_iniziali = provette_iniziali;
    }

    public Integer getProvette_rimanenti() {
        return provette_rimanenti;
    }
    public void setProvette_rimanenti(Integer provette_rimanenti) {
        this.provette_rimanenti = provette_rimanenti;
    }

    public String getQt() {
        return qt;
    }
    public void setQt(String qt) {
        this.qt = qt;
    }

    public String getQuantita() {
        return quantita;
    }
    public void setQuantita(String quantita) {
        this.quantita = quantita;
    }

    public String getRack() {
        return rack;
    }
    public void setRack(String rack) {
        this.rack = rack;
    }

    public String getSede_biobanca() {
        return sede_biobanca;
    }
    public void setSede_biobanca(String sede_biobanca) {
        this.sede_biobanca = sede_biobanca;
    }

    public String getUm() {
        return um;
    }
    public void setUm(String um) {
        this.um = um;
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
        if (campione != null) {
            joiner.add("campione: " + GraphQLRequestSerializer.getEntry(campione));
        }
        if (centro_icona != null) {
            joiner.add("centro_icona: " + GraphQLRequestSerializer.getEntry(centro_icona));
        }
        if (data_prelievo != null) {
            joiner.add("data_prelievo: " + GraphQLRequestSerializer.getEntry(data_prelievo));
        }
        if (etichetta != null) {
            joiner.add("etichetta: " + GraphQLRequestSerializer.getEntry(etichetta));
        }
        if (id_campione != null) {
            joiner.add("id_campione: " + GraphQLRequestSerializer.getEntry(id_campione));
        }
        if (note_campione != null) {
            joiner.add("note_campione: " + GraphQLRequestSerializer.getEntry(note_campione));
        }
        if (object_title != null) {
            joiner.add("object_title: " + GraphQLRequestSerializer.getEntry(object_title));
        }
        if (paziente_hepaicona != null) {
            joiner.add("paziente_hepaicona: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona));
        }
        if (paziente_icona != null) {
            joiner.add("paziente_icona: " + GraphQLRequestSerializer.getEntry(paziente_icona));
        }
        if (paziente_nascita != null) {
            joiner.add("paziente_nascita: " + GraphQLRequestSerializer.getEntry(paziente_nascita));
        }
        if (posizioni != null) {
            joiner.add("posizioni: " + GraphQLRequestSerializer.getEntry(posizioni));
        }
        if (provette_iniziali != null) {
            joiner.add("provette_iniziali: " + GraphQLRequestSerializer.getEntry(provette_iniziali));
        }
        if (provette_rimanenti != null) {
            joiner.add("provette_rimanenti: " + GraphQLRequestSerializer.getEntry(provette_rimanenti));
        }
        if (qt != null) {
            joiner.add("qt: " + GraphQLRequestSerializer.getEntry(qt));
        }
        if (quantita != null) {
            joiner.add("quantita: " + GraphQLRequestSerializer.getEntry(quantita));
        }
        if (rack != null) {
            joiner.add("rack: " + GraphQLRequestSerializer.getEntry(rack));
        }
        if (sede_biobanca != null) {
            joiner.add("sede_biobanca: " + GraphQLRequestSerializer.getEntry(sede_biobanca));
        }
        if (um != null) {
            joiner.add("um: " + GraphQLRequestSerializer.getEntry(um));
        }
        return joiner.toString();
    }

    public static CliCampione_oldCursorDTO.Builder builder() {
        return new CliCampione_oldCursorDTO.Builder();
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
        private String campione;
        private String centro_icona;
        private String data_prelievo;
        private String etichetta;
        private Integer id_campione;
        private String note_campione;
        private String object_title;
        private String paziente_hepaicona;
        private String paziente_icona;
        private String paziente_nascita;
        private String posizioni;
        private Integer provette_iniziali;
        private Integer provette_rimanenti;
        private String qt;
        private String quantita;
        private String rack;
        private String sede_biobanca;
        private String um;

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

        public Builder setCampione(String campione) {
            this.campione = campione;
            return this;
        }

        public Builder setCentro_icona(String centro_icona) {
            this.centro_icona = centro_icona;
            return this;
        }

        public Builder setData_prelievo(String data_prelievo) {
            this.data_prelievo = data_prelievo;
            return this;
        }

        public Builder setEtichetta(String etichetta) {
            this.etichetta = etichetta;
            return this;
        }

        public Builder setId_campione(Integer id_campione) {
            this.id_campione = id_campione;
            return this;
        }

        public Builder setNote_campione(String note_campione) {
            this.note_campione = note_campione;
            return this;
        }

        public Builder setObject_title(String object_title) {
            this.object_title = object_title;
            return this;
        }

        public Builder setPaziente_hepaicona(String paziente_hepaicona) {
            this.paziente_hepaicona = paziente_hepaicona;
            return this;
        }

        public Builder setPaziente_icona(String paziente_icona) {
            this.paziente_icona = paziente_icona;
            return this;
        }

        public Builder setPaziente_nascita(String paziente_nascita) {
            this.paziente_nascita = paziente_nascita;
            return this;
        }

        public Builder setPosizioni(String posizioni) {
            this.posizioni = posizioni;
            return this;
        }

        public Builder setProvette_iniziali(Integer provette_iniziali) {
            this.provette_iniziali = provette_iniziali;
            return this;
        }

        public Builder setProvette_rimanenti(Integer provette_rimanenti) {
            this.provette_rimanenti = provette_rimanenti;
            return this;
        }

        public Builder setQt(String qt) {
            this.qt = qt;
            return this;
        }

        public Builder setQuantita(String quantita) {
            this.quantita = quantita;
            return this;
        }

        public Builder setRack(String rack) {
            this.rack = rack;
            return this;
        }

        public Builder setSede_biobanca(String sede_biobanca) {
            this.sede_biobanca = sede_biobanca;
            return this;
        }

        public Builder setUm(String um) {
            this.um = um;
            return this;
        }


        public CliCampione_oldCursorDTO build() {
            CliCampione_oldCursorDTO result = new CliCampione_oldCursorDTO();
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setCampione(this.campione);
            result.setCentro_icona(this.centro_icona);
            result.setData_prelievo(this.data_prelievo);
            result.setEtichetta(this.etichetta);
            result.setId_campione(this.id_campione);
            result.setNote_campione(this.note_campione);
            result.setObject_title(this.object_title);
            result.setPaziente_hepaicona(this.paziente_hepaicona);
            result.setPaziente_icona(this.paziente_icona);
            result.setPaziente_nascita(this.paziente_nascita);
            result.setPosizioni(this.posizioni);
            result.setProvette_iniziali(this.provette_iniziali);
            result.setProvette_rimanenti(this.provette_rimanenti);
            result.setQt(this.qt);
            result.setQuantita(this.quantita);
            result.setRack(this.rack);
            result.setSede_biobanca(this.sede_biobanca);
            result.setUm(this.um);
            return result;
        }

    }
}
