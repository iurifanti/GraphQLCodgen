package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class campione_old, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliCampione_oldDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
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
    private CliSede_biobancaDTO sede_biobanca_;

    public CliCampione_oldDTO() {
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
     * The attribute _createdby of campione_old. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of campione_old. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of campione_old. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of campione_old. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of campione_old. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of campione_old. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of campione_old. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of campione_old. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of campione_old. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of campione_old. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of campione_old. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of campione_old. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of campione_old. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of campione_old. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute campione of campione_old. It is of type String. Domain: P OR S OR C OR SA.}Max length: 255.Cannot be null.
     */
    public String getCampione() {
        return campione;
    }
    /**
     * The attribute campione of campione_old. It is of type String. Domain: P OR S OR C OR SA.}Max length: 255.Cannot be null.
     */
    public void setCampione(String campione) {
        this.campione = campione;
    }

    /**
     * The attribute centro_icona of campione_old. It is of type String. Path: paziente.centro_appartenenza_attuale codice_centro.
     */
    public String getCentro_icona() {
        return centro_icona;
    }
    /**
     * The attribute centro_icona of campione_old. It is of type String. Path: paziente.centro_appartenenza_attuale codice_centro.
     */
    public void setCentro_icona(String centro_icona) {
        this.centro_icona = centro_icona;
    }

    /**
     * The attribute data_prelievo of campione_old. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData_prelievo() {
        return data_prelievo;
    }
    /**
     * The attribute data_prelievo of campione_old. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData_prelievo(String data_prelievo) {
        this.data_prelievo = data_prelievo;
    }

    /**
     * The attribute etichetta of campione_old. It is of type String. Max length: 255.Cannot be null.
     */
    public String getEtichetta() {
        return etichetta;
    }
    /**
     * The attribute etichetta of campione_old. It is of type String. Max length: 255.Cannot be null.
     */
    public void setEtichetta(String etichetta) {
        this.etichetta = etichetta;
    }

    /**
     * The attribute id_campione of campione_old. It is of type Int.
     */
    public Integer getId_campione() {
        return id_campione;
    }
    /**
     * The attribute id_campione of campione_old. It is of type Int.
     */
    public void setId_campione(Integer id_campione) {
        this.id_campione = id_campione;
    }

    /**
     * The attribute note_campione of campione_old. It is of type Text.
     */
    public String getNote_campione() {
        return note_campione;
    }
    /**
     * The attribute note_campione of campione_old. It is of type Text.
     */
    public void setNote_campione(String note_campione) {
        this.note_campione = note_campione;
    }

    /**
     * The attribute object_title of campione_old. It is of type String. Expression: 'concat("Campione: ", rack," (", posizioni,")")'.
     */
    public String getObject_title() {
        return object_title;
    }
    /**
     * The attribute object_title of campione_old. It is of type String. Expression: 'concat("Campione: ", rack," (", posizioni,")")'.
     */
    public void setObject_title(String object_title) {
        this.object_title = object_title;
    }

    /**
     * The attribute paziente_hepaicona of campione_old. It is of type String. Path: h_paziente codice_interno. Cannot be null.
     */
    public String getPaziente_hepaicona() {
        return paziente_hepaicona;
    }
    /**
     * The attribute paziente_hepaicona of campione_old. It is of type String. Path: h_paziente codice_interno. Cannot be null.
     */
    public void setPaziente_hepaicona(String paziente_hepaicona) {
        this.paziente_hepaicona = paziente_hepaicona;
    }

    /**
     * The attribute paziente_icona of campione_old. It is of type String. Path: paziente codice_interno. Cannot be null.
     */
    public String getPaziente_icona() {
        return paziente_icona;
    }
    /**
     * The attribute paziente_icona of campione_old. It is of type String. Path: paziente codice_interno. Cannot be null.
     */
    public void setPaziente_icona(String paziente_icona) {
        this.paziente_icona = paziente_icona;
    }

    /**
     * The attribute paziente_nascita of campione_old. It is of type Date @dateFormat. Path: paziente nascita.
     */
    public String getPaziente_nascita() {
        return paziente_nascita;
    }
    /**
     * The attribute paziente_nascita of campione_old. It is of type Date @dateFormat. Path: paziente nascita.
     */
    public void setPaziente_nascita(String paziente_nascita) {
        this.paziente_nascita = paziente_nascita;
    }

    /**
     * The attribute posizioni of campione_old. It is of type String. Max length: 255.
     */
    public String getPosizioni() {
        return posizioni;
    }
    /**
     * The attribute posizioni of campione_old. It is of type String. Max length: 255.
     */
    public void setPosizioni(String posizioni) {
        this.posizioni = posizioni;
    }

    /**
     * The attribute provette_iniziali of campione_old. It is of type Int.
     */
    public Integer getProvette_iniziali() {
        return provette_iniziali;
    }
    /**
     * The attribute provette_iniziali of campione_old. It is of type Int.
     */
    public void setProvette_iniziali(Integer provette_iniziali) {
        this.provette_iniziali = provette_iniziali;
    }

    /**
     * The attribute provette_rimanenti of campione_old. It is of type Int.
     */
    public Integer getProvette_rimanenti() {
        return provette_rimanenti;
    }
    /**
     * The attribute provette_rimanenti of campione_old. It is of type Int.
     */
    public void setProvette_rimanenti(Integer provette_rimanenti) {
        this.provette_rimanenti = provette_rimanenti;
    }

    /**
     * The attribute qt of campione_old. It is of type Real @realFormat. Ranges: 0.5:20.
     */
    public String getQt() {
        return qt;
    }
    /**
     * The attribute qt of campione_old. It is of type Real @realFormat. Ranges: 0.5:20.
     */
    public void setQt(String qt) {
        this.qt = qt;
    }

    /**
     * The attribute quantita of campione_old. It is of type String. Max length: 255.
     */
    public String getQuantita() {
        return quantita;
    }
    /**
     * The attribute quantita of campione_old. It is of type String. Max length: 255.
     */
    public void setQuantita(String quantita) {
        this.quantita = quantita;
    }

    /**
     * The attribute rack of campione_old. It is of type String. Max length: 255.Cannot be null.
     */
    public String getRack() {
        return rack;
    }
    /**
     * The attribute rack of campione_old. It is of type String. Max length: 255.Cannot be null.
     */
    public void setRack(String rack) {
        this.rack = rack;
    }

    /**
     * The attribute sede_biobanca of campione_old. It is of type String. Path: sede_biobanca_ name. Cannot be null.
     */
    public String getSede_biobanca() {
        return sede_biobanca;
    }
    /**
     * The attribute sede_biobanca of campione_old. It is of type String. Path: sede_biobanca_ name. Cannot be null.
     */
    public void setSede_biobanca(String sede_biobanca) {
        this.sede_biobanca = sede_biobanca;
    }

    /**
     * The attribute um of campione_old. It is of type String. Domain: mL OR 10^6 cells.}Max length: 255.
     */
    public String getUm() {
        return um;
    }
    /**
     * The attribute um of campione_old. It is of type String. Domain: mL OR 10^6 cells.}Max length: 255.
     */
    public void setUm(String um) {
        this.um = um;
    }

    /**
     * The associated object for the role sede_biobanca_.
     */
    public CliSede_biobancaDTO getSede_biobanca_() {
        return sede_biobanca_;
    }
    /**
     * The associated object for the role sede_biobanca_.
     */
    public void setSede_biobanca_(CliSede_biobancaDTO sede_biobanca_) {
        this.sede_biobanca_ = sede_biobanca_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
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
        if (sede_biobanca_ != null) {
            joiner.add("sede_biobanca_: " + GraphQLRequestSerializer.getEntry(sede_biobanca_));
        }
        return joiner.toString();
    }

    public static CliCampione_oldDTO.Builder builder() {
        return new CliCampione_oldDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
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
        private CliSede_biobancaDTO sede_biobanca_;

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
         * The attribute _createdby of campione_old. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of campione_old. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of campione_old. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of campione_old. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of campione_old. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of campione_old. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of campione_old. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute campione of campione_old. It is of type String. Domain: P OR S OR C OR SA.}Max length: 255.Cannot be null.
         */
        public Builder setCampione(String campione) {
            this.campione = campione;
            return this;
        }

        /**
         * The attribute centro_icona of campione_old. It is of type String. Path: paziente.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCentro_icona(String centro_icona) {
            this.centro_icona = centro_icona;
            return this;
        }

        /**
         * The attribute data_prelievo of campione_old. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData_prelievo(String data_prelievo) {
            this.data_prelievo = data_prelievo;
            return this;
        }

        /**
         * The attribute etichetta of campione_old. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setEtichetta(String etichetta) {
            this.etichetta = etichetta;
            return this;
        }

        /**
         * The attribute id_campione of campione_old. It is of type Int.
         */
        public Builder setId_campione(Integer id_campione) {
            this.id_campione = id_campione;
            return this;
        }

        /**
         * The attribute note_campione of campione_old. It is of type Text.
         */
        public Builder setNote_campione(String note_campione) {
            this.note_campione = note_campione;
            return this;
        }

        /**
         * The attribute object_title of campione_old. It is of type String. Expression: 'concat("Campione: ", rack," (", posizioni,")")'.
         */
        public Builder setObject_title(String object_title) {
            this.object_title = object_title;
            return this;
        }

        /**
         * The attribute paziente_hepaicona of campione_old. It is of type String. Path: h_paziente codice_interno. Cannot be null.
         */
        public Builder setPaziente_hepaicona(String paziente_hepaicona) {
            this.paziente_hepaicona = paziente_hepaicona;
            return this;
        }

        /**
         * The attribute paziente_icona of campione_old. It is of type String. Path: paziente codice_interno. Cannot be null.
         */
        public Builder setPaziente_icona(String paziente_icona) {
            this.paziente_icona = paziente_icona;
            return this;
        }

        /**
         * The attribute paziente_nascita of campione_old. It is of type Date @dateFormat. Path: paziente nascita.
         */
        public Builder setPaziente_nascita(String paziente_nascita) {
            this.paziente_nascita = paziente_nascita;
            return this;
        }

        /**
         * The attribute posizioni of campione_old. It is of type String. Max length: 255.
         */
        public Builder setPosizioni(String posizioni) {
            this.posizioni = posizioni;
            return this;
        }

        /**
         * The attribute provette_iniziali of campione_old. It is of type Int.
         */
        public Builder setProvette_iniziali(Integer provette_iniziali) {
            this.provette_iniziali = provette_iniziali;
            return this;
        }

        /**
         * The attribute provette_rimanenti of campione_old. It is of type Int.
         */
        public Builder setProvette_rimanenti(Integer provette_rimanenti) {
            this.provette_rimanenti = provette_rimanenti;
            return this;
        }

        /**
         * The attribute qt of campione_old. It is of type Real @realFormat. Ranges: 0.5:20.
         */
        public Builder setQt(String qt) {
            this.qt = qt;
            return this;
        }

        /**
         * The attribute quantita of campione_old. It is of type String. Max length: 255.
         */
        public Builder setQuantita(String quantita) {
            this.quantita = quantita;
            return this;
        }

        /**
         * The attribute rack of campione_old. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setRack(String rack) {
            this.rack = rack;
            return this;
        }

        /**
         * The attribute sede_biobanca of campione_old. It is of type String. Path: sede_biobanca_ name. Cannot be null.
         */
        public Builder setSede_biobanca(String sede_biobanca) {
            this.sede_biobanca = sede_biobanca;
            return this;
        }

        /**
         * The attribute um of campione_old. It is of type String. Domain: mL OR 10^6 cells.}Max length: 255.
         */
        public Builder setUm(String um) {
            this.um = um;
            return this;
        }

        /**
         * The associated object for the role sede_biobanca_.
         */
        public Builder setSede_biobanca_(CliSede_biobancaDTO sede_biobanca_) {
            this.sede_biobanca_ = sede_biobanca_;
            return this;
        }


        public CliCampione_oldDTO build() {
            CliCampione_oldDTO result = new CliCampione_oldDTO();
            result.set_clientId(this._clientId);
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
            result.setSede_biobanca_(this.sede_biobanca_);
            return result;
        }

    }
}
