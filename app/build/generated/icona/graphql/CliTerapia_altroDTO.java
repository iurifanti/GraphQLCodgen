package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Terapia_altro, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliTerapia_altroDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
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
    private CliDosaggioDTO dosaggio_;
    private CliFarmaco_altroDTO farmaco;
    private CliFarmaco_ATCDTO farmaco_ATC_;
    private CliPazienteDTO Paziente_terapia_altro;
    private CliPazienteDTO paziente_epatica;

    public CliTerapia_altroDTO() {
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
     * The attribute _createdby of Terapia_altro. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Terapia_altro. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Terapia_altro. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Terapia_altro. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Terapia_altro. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Terapia_altro. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Terapia_altro. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Terapia_altro. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Terapia_altro. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Terapia_altro. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Terapia_altro. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Terapia_altro. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Terapia_altro. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Terapia_altro. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute altra_motivazione_fine of Terapia_altro. It is of type Text.
     */
    public String getAltra_motivazione_fine() {
        return altra_motivazione_fine;
    }
    /**
     * The attribute altra_motivazione_fine of Terapia_altro. It is of type Text.
     */
    public void setAltra_motivazione_fine(String altra_motivazione_fine) {
        this.altra_motivazione_fine = altra_motivazione_fine;
    }

    /**
     * The attribute altro_farmaco of Terapia_altro. It is of type String. Max length: 255.
     */
    public String getAltro_farmaco() {
        return altro_farmaco;
    }
    /**
     * The attribute altro_farmaco of Terapia_altro. It is of type String. Max length: 255.
     */
    public void setAltro_farmaco(String altro_farmaco) {
        this.altro_farmaco = altro_farmaco;
    }

    /**
     * The attribute codice_centro of Terapia_altro. It is of type String. Path: Paziente_terapia_altro.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Terapia_altro. It is of type String. Path: Paziente_terapia_altro.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute count_dosaggi of Terapia_altro. It is of type Int. Path: COUNT_ALL - Count allfarmaco.dosaggio_ nome.
     */
    public Integer getCount_dosaggi() {
        return count_dosaggi;
    }
    /**
     * The attribute count_dosaggi of Terapia_altro. It is of type Int. Path: COUNT_ALL - Count allfarmaco.dosaggio_ nome.
     */
    public void setCount_dosaggi(Integer count_dosaggi) {
        this.count_dosaggi = count_dosaggi;
    }

    /**
     * The attribute data_fine of Terapia_altro. It is of type Date @dateFormat.
     */
    public String getData_fine() {
        return data_fine;
    }
    /**
     * The attribute data_fine of Terapia_altro. It is of type Date @dateFormat.
     */
    public void setData_fine(String data_fine) {
        this.data_fine = data_fine;
    }

    /**
     * The attribute data_inizio of Terapia_altro. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData_inizio() {
        return data_inizio;
    }
    /**
     * The attribute data_inizio of Terapia_altro. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData_inizio(String data_inizio) {
        this.data_inizio = data_inizio;
    }

    /**
     * The attribute dosaggio of Terapia_altro. It is of type String. Max length: 255.
     */
    public String getDosaggio() {
        return dosaggio;
    }
    /**
     * The attribute dosaggio of Terapia_altro. It is of type String. Max length: 255.
     */
    public void setDosaggio(String dosaggio) {
        this.dosaggio = dosaggio;
    }

    /**
     * The attribute epatica of Terapia_altro. It is of type Boolean. Expression: '!isNull(firstNotNull(paziente_epatico_h,paziente_epatico_i,paziente_epatico_o,paziente_epatica_b))'.Cannot be null.
     */
    public Boolean getEpatica() {
        return epatica;
    }
    /**
     * The attribute epatica of Terapia_altro. It is of type Boolean. Expression: '!isNull(firstNotNull(paziente_epatico_h,paziente_epatico_i,paziente_epatico_o,paziente_epatica_b))'.Cannot be null.
     */
    public void setEpatica(Boolean epatica) {
        this.epatica = epatica;
    }

    /**
     * The attribute farmaco_ATC of Terapia_altro. It is of type String. Path: farmaco_ATC_ nome. Cannot be null.
     */
    public String getFarmaco_ATC() {
        return farmaco_ATC;
    }
    /**
     * The attribute farmaco_ATC of Terapia_altro. It is of type String. Path: farmaco_ATC_ nome. Cannot be null.
     */
    public void setFarmaco_ATC(String farmaco_ATC) {
        this.farmaco_ATC = farmaco_ATC;
    }

    /**
     * The attribute motivazione_fine of Terapia_altro. It is of type String. Domain: fine ciclo OR altro (specificare) OR scelta del paziente OR tossicita OR inefficacia.}Max length: 255.
     */
    public String getMotivazione_fine() {
        return motivazione_fine;
    }
    /**
     * The attribute motivazione_fine of Terapia_altro. It is of type String. Domain: fine ciclo OR altro (specificare) OR scelta del paziente OR tossicita OR inefficacia.}Max length: 255.
     */
    public void setMotivazione_fine(String motivazione_fine) {
        this.motivazione_fine = motivazione_fine;
    }

    /**
     * The attribute nome_farmaco of Terapia_altro. It is of type String. Path: farmaco nome. Cannot be null.
     */
    public String getNome_farmaco() {
        return nome_farmaco;
    }
    /**
     * The attribute nome_farmaco of Terapia_altro. It is of type String. Path: farmaco nome. Cannot be null.
     */
    public void setNome_farmaco(String nome_farmaco) {
        this.nome_farmaco = nome_farmaco;
    }

    /**
     * The attribute nome_gruppo of Terapia_altro. It is of type String. Path: farmaco nome_gruppo.
     */
    public String getNome_gruppo() {
        return nome_gruppo;
    }
    /**
     * The attribute nome_gruppo of Terapia_altro. It is of type String. Path: farmaco nome_gruppo.
     */
    public void setNome_gruppo(String nome_gruppo) {
        this.nome_gruppo = nome_gruppo;
    }

    /**
     * The attribute nome_tipo of Terapia_altro. It is of type String. Path: farmaco nome_tipo.
     */
    public String getNome_tipo() {
        return nome_tipo;
    }
    /**
     * The attribute nome_tipo of Terapia_altro. It is of type String. Path: farmaco nome_tipo.
     */
    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    /**
     * The attribute object_title of Terapia_altro. It is of type String. Expression: 'concat("Farmaco non ARV: ", data_inizio, " (", nome_farmaco,")")'.Cannot be null.
     */
    public String getObject_title() {
        return object_title;
    }
    /**
     * The attribute object_title of Terapia_altro. It is of type String. Expression: 'concat("Farmaco non ARV: ", data_inizio, " (", nome_farmaco,")")'.Cannot be null.
     */
    public void setObject_title(String object_title) {
        this.object_title = object_title;
    }

    /**
     * The attribute ricerca_farmaco of Terapia_altro. It is of type String. Max length: 255.
     */
    public String getRicerca_farmaco() {
        return ricerca_farmaco;
    }
    /**
     * The attribute ricerca_farmaco of Terapia_altro. It is of type String. Max length: 255.
     */
    public void setRicerca_farmaco(String ricerca_farmaco) {
        this.ricerca_farmaco = ricerca_farmaco;
    }

    /**
     * The associated object for the role dosaggio_.
     */
    public CliDosaggioDTO getDosaggio_() {
        return dosaggio_;
    }
    /**
     * The associated object for the role dosaggio_.
     */
    public void setDosaggio_(CliDosaggioDTO dosaggio_) {
        this.dosaggio_ = dosaggio_;
    }

    /**
     * The associated object for the role farmaco.
     */
    public CliFarmaco_altroDTO getFarmaco() {
        return farmaco;
    }
    /**
     * The associated object for the role farmaco.
     */
    public void setFarmaco(CliFarmaco_altroDTO farmaco) {
        this.farmaco = farmaco;
    }

    /**
     * The associated object for the role farmaco_ATC_.
     */
    public CliFarmaco_ATCDTO getFarmaco_ATC_() {
        return farmaco_ATC_;
    }
    /**
     * The associated object for the role farmaco_ATC_.
     */
    public void setFarmaco_ATC_(CliFarmaco_ATCDTO farmaco_ATC_) {
        this.farmaco_ATC_ = farmaco_ATC_;
    }

    /**
     * The associated object for the role Paziente_terapia_altro.
     */
    public CliPazienteDTO getPaziente_terapia_altro() {
        return Paziente_terapia_altro;
    }
    /**
     * The associated object for the role Paziente_terapia_altro.
     */
    public void setPaziente_terapia_altro(CliPazienteDTO Paziente_terapia_altro) {
        this.Paziente_terapia_altro = Paziente_terapia_altro;
    }

    /**
     * The associated object for the role paziente_epatica.
     */
    public CliPazienteDTO getPaziente_epatica() {
        return paziente_epatica;
    }
    /**
     * The associated object for the role paziente_epatica.
     */
    public void setPaziente_epatica(CliPazienteDTO paziente_epatica) {
        this.paziente_epatica = paziente_epatica;
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
        if (dosaggio_ != null) {
            joiner.add("dosaggio_: " + GraphQLRequestSerializer.getEntry(dosaggio_));
        }
        if (farmaco != null) {
            joiner.add("farmaco: " + GraphQLRequestSerializer.getEntry(farmaco));
        }
        if (farmaco_ATC_ != null) {
            joiner.add("farmaco_ATC_: " + GraphQLRequestSerializer.getEntry(farmaco_ATC_));
        }
        if (Paziente_terapia_altro != null) {
            joiner.add("Paziente_terapia_altro: " + GraphQLRequestSerializer.getEntry(Paziente_terapia_altro));
        }
        if (paziente_epatica != null) {
            joiner.add("paziente_epatica: " + GraphQLRequestSerializer.getEntry(paziente_epatica));
        }
        return joiner.toString();
    }

    public static CliTerapia_altroDTO.Builder builder() {
        return new CliTerapia_altroDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
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
        private CliDosaggioDTO dosaggio_;
        private CliFarmaco_altroDTO farmaco;
        private CliFarmaco_ATCDTO farmaco_ATC_;
        private CliPazienteDTO Paziente_terapia_altro;
        private CliPazienteDTO paziente_epatica;

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
         * The attribute _createdby of Terapia_altro. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Terapia_altro. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Terapia_altro. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Terapia_altro. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Terapia_altro. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Terapia_altro. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Terapia_altro. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute altra_motivazione_fine of Terapia_altro. It is of type Text.
         */
        public Builder setAltra_motivazione_fine(String altra_motivazione_fine) {
            this.altra_motivazione_fine = altra_motivazione_fine;
            return this;
        }

        /**
         * The attribute altro_farmaco of Terapia_altro. It is of type String. Max length: 255.
         */
        public Builder setAltro_farmaco(String altro_farmaco) {
            this.altro_farmaco = altro_farmaco;
            return this;
        }

        /**
         * The attribute codice_centro of Terapia_altro. It is of type String. Path: Paziente_terapia_altro.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute count_dosaggi of Terapia_altro. It is of type Int. Path: COUNT_ALL - Count allfarmaco.dosaggio_ nome.
         */
        public Builder setCount_dosaggi(Integer count_dosaggi) {
            this.count_dosaggi = count_dosaggi;
            return this;
        }

        /**
         * The attribute data_fine of Terapia_altro. It is of type Date @dateFormat.
         */
        public Builder setData_fine(String data_fine) {
            this.data_fine = data_fine;
            return this;
        }

        /**
         * The attribute data_inizio of Terapia_altro. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData_inizio(String data_inizio) {
            this.data_inizio = data_inizio;
            return this;
        }

        /**
         * The attribute dosaggio of Terapia_altro. It is of type String. Max length: 255.
         */
        public Builder setDosaggio(String dosaggio) {
            this.dosaggio = dosaggio;
            return this;
        }

        /**
         * The attribute epatica of Terapia_altro. It is of type Boolean. Expression: '!isNull(firstNotNull(paziente_epatico_h,paziente_epatico_i,paziente_epatico_o,paziente_epatica_b))'.Cannot be null.
         */
        public Builder setEpatica(Boolean epatica) {
            this.epatica = epatica;
            return this;
        }

        /**
         * The attribute farmaco_ATC of Terapia_altro. It is of type String. Path: farmaco_ATC_ nome. Cannot be null.
         */
        public Builder setFarmaco_ATC(String farmaco_ATC) {
            this.farmaco_ATC = farmaco_ATC;
            return this;
        }

        /**
         * The attribute motivazione_fine of Terapia_altro. It is of type String. Domain: fine ciclo OR altro (specificare) OR scelta del paziente OR tossicita OR inefficacia.}Max length: 255.
         */
        public Builder setMotivazione_fine(String motivazione_fine) {
            this.motivazione_fine = motivazione_fine;
            return this;
        }

        /**
         * The attribute nome_farmaco of Terapia_altro. It is of type String. Path: farmaco nome. Cannot be null.
         */
        public Builder setNome_farmaco(String nome_farmaco) {
            this.nome_farmaco = nome_farmaco;
            return this;
        }

        /**
         * The attribute nome_gruppo of Terapia_altro. It is of type String. Path: farmaco nome_gruppo.
         */
        public Builder setNome_gruppo(String nome_gruppo) {
            this.nome_gruppo = nome_gruppo;
            return this;
        }

        /**
         * The attribute nome_tipo of Terapia_altro. It is of type String. Path: farmaco nome_tipo.
         */
        public Builder setNome_tipo(String nome_tipo) {
            this.nome_tipo = nome_tipo;
            return this;
        }

        /**
         * The attribute object_title of Terapia_altro. It is of type String. Expression: 'concat("Farmaco non ARV: ", data_inizio, " (", nome_farmaco,")")'.Cannot be null.
         */
        public Builder setObject_title(String object_title) {
            this.object_title = object_title;
            return this;
        }

        /**
         * The attribute ricerca_farmaco of Terapia_altro. It is of type String. Max length: 255.
         */
        public Builder setRicerca_farmaco(String ricerca_farmaco) {
            this.ricerca_farmaco = ricerca_farmaco;
            return this;
        }

        /**
         * The associated object for the role dosaggio_.
         */
        public Builder setDosaggio_(CliDosaggioDTO dosaggio_) {
            this.dosaggio_ = dosaggio_;
            return this;
        }

        /**
         * The associated object for the role farmaco.
         */
        public Builder setFarmaco(CliFarmaco_altroDTO farmaco) {
            this.farmaco = farmaco;
            return this;
        }

        /**
         * The associated object for the role farmaco_ATC_.
         */
        public Builder setFarmaco_ATC_(CliFarmaco_ATCDTO farmaco_ATC_) {
            this.farmaco_ATC_ = farmaco_ATC_;
            return this;
        }

        /**
         * The associated object for the role Paziente_terapia_altro.
         */
        public Builder setPaziente_terapia_altro(CliPazienteDTO Paziente_terapia_altro) {
            this.Paziente_terapia_altro = Paziente_terapia_altro;
            return this;
        }

        /**
         * The associated object for the role paziente_epatica.
         */
        public Builder setPaziente_epatica(CliPazienteDTO paziente_epatica) {
            this.paziente_epatica = paziente_epatica;
            return this;
        }


        public CliTerapia_altroDTO build() {
            CliTerapia_altroDTO result = new CliTerapia_altroDTO();
            result.set_clientId(this._clientId);
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
            result.setDosaggio_(this.dosaggio_);
            result.setFarmaco(this.farmaco);
            result.setFarmaco_ATC_(this.farmaco_ATC_);
            result.setPaziente_terapia_altro(this.Paziente_terapia_altro);
            result.setPaziente_epatica(this.paziente_epatica);
            return result;
        }

    }
}
