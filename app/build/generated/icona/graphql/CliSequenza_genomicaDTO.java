package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Sequenza_genomica, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliSequenza_genomicaDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String altra_metodica;
    private String altro_centro;
    private String codice_centro;
    private String codice_paziente;
    private String data_analisi;
    private String data_prelievo;
    private String effettuato_su;
    private String elenco_mutazioni_ENV;
    private String elenco_mutazioni_INT;
    private String elenco_mutazioni_PR;
    private String elenco_mutazioni_RT;
    private String elenco_mutazioni_V3;
    private String etichetta;
    private String filtro_codice_paziente;
    private Integer mutazioni;
    private String mutazioni_no_farmaco;
    private Boolean nessuna_mutazione_ENV;
    private Boolean nessuna_mutazione_INT;
    private Boolean nessuna_mutazione_PR;
    private Boolean nessuna_mutazione_RT;
    private Boolean nessuna_mutazione_V3;
    private String nucleotidi;
    private String regione;
    private String sottotipo;
    private String tipo_sequenza;
    private CliCentro_sequenziatoreDTO centro_sequenziatore;
    private CliMetodica_genotipoDTO metodica_genotipo;
    private CliPazienteDTO paziente;

    public CliSequenza_genomicaDTO() {
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
     * The attribute _createdby of Sequenza_genomica. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Sequenza_genomica. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Sequenza_genomica. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Sequenza_genomica. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Sequenza_genomica. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Sequenza_genomica. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Sequenza_genomica. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Sequenza_genomica. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Sequenza_genomica. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Sequenza_genomica. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Sequenza_genomica. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Sequenza_genomica. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Sequenza_genomica. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Sequenza_genomica. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute altra_metodica of Sequenza_genomica. It is of type String. Max length: 255.
     */
    public String getAltra_metodica() {
        return altra_metodica;
    }
    /**
     * The attribute altra_metodica of Sequenza_genomica. It is of type String. Max length: 255.
     */
    public void setAltra_metodica(String altra_metodica) {
        this.altra_metodica = altra_metodica;
    }

    /**
     * The attribute altro_centro of Sequenza_genomica. It is of type String. Max length: 255.
     */
    public String getAltro_centro() {
        return altro_centro;
    }
    /**
     * The attribute altro_centro of Sequenza_genomica. It is of type String. Max length: 255.
     */
    public void setAltro_centro(String altro_centro) {
        this.altro_centro = altro_centro;
    }

    /**
     * The attribute codice_centro of Sequenza_genomica. It is of type String. Path: paziente.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Sequenza_genomica. It is of type String. Path: paziente.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute codice_paziente of Sequenza_genomica. It is of type String. Path: paziente codice_interno. Cannot be null.
     */
    public String getCodice_paziente() {
        return codice_paziente;
    }
    /**
     * The attribute codice_paziente of Sequenza_genomica. It is of type String. Path: paziente codice_interno. Cannot be null.
     */
    public void setCodice_paziente(String codice_paziente) {
        this.codice_paziente = codice_paziente;
    }

    /**
     * The attribute data_analisi of Sequenza_genomica. It is of type Date @dateFormat.
     */
    public String getData_analisi() {
        return data_analisi;
    }
    /**
     * The attribute data_analisi of Sequenza_genomica. It is of type Date @dateFormat.
     */
    public void setData_analisi(String data_analisi) {
        this.data_analisi = data_analisi;
    }

    /**
     * The attribute data_prelievo of Sequenza_genomica. It is of type Date @dateFormat.
     */
    public String getData_prelievo() {
        return data_prelievo;
    }
    /**
     * The attribute data_prelievo of Sequenza_genomica. It is of type Date @dateFormat.
     */
    public void setData_prelievo(String data_prelievo) {
        this.data_prelievo = data_prelievo;
    }

    /**
     * The attribute effettuato_su of Sequenza_genomica. It is of type String. Domain: RNA OR DNA.}Max length: 255.
     */
    public String getEffettuato_su() {
        return effettuato_su;
    }
    /**
     * The attribute effettuato_su of Sequenza_genomica. It is of type String. Domain: RNA OR DNA.}Max length: 255.
     */
    public void setEffettuato_su(String effettuato_su) {
        this.effettuato_su = effettuato_su;
    }

    /**
     * The attribute elenco_mutazioni_ENV of Sequenza_genomica. It is of type Text.
     */
    public String getElenco_mutazioni_ENV() {
        return elenco_mutazioni_ENV;
    }
    /**
     * The attribute elenco_mutazioni_ENV of Sequenza_genomica. It is of type Text.
     */
    public void setElenco_mutazioni_ENV(String elenco_mutazioni_ENV) {
        this.elenco_mutazioni_ENV = elenco_mutazioni_ENV;
    }

    /**
     * The attribute elenco_mutazioni_INT of Sequenza_genomica. It is of type Text.
     */
    public String getElenco_mutazioni_INT() {
        return elenco_mutazioni_INT;
    }
    /**
     * The attribute elenco_mutazioni_INT of Sequenza_genomica. It is of type Text.
     */
    public void setElenco_mutazioni_INT(String elenco_mutazioni_INT) {
        this.elenco_mutazioni_INT = elenco_mutazioni_INT;
    }

    /**
     * The attribute elenco_mutazioni_PR of Sequenza_genomica. It is of type Text.
     */
    public String getElenco_mutazioni_PR() {
        return elenco_mutazioni_PR;
    }
    /**
     * The attribute elenco_mutazioni_PR of Sequenza_genomica. It is of type Text.
     */
    public void setElenco_mutazioni_PR(String elenco_mutazioni_PR) {
        this.elenco_mutazioni_PR = elenco_mutazioni_PR;
    }

    /**
     * The attribute elenco_mutazioni_RT of Sequenza_genomica. It is of type Text.
     */
    public String getElenco_mutazioni_RT() {
        return elenco_mutazioni_RT;
    }
    /**
     * The attribute elenco_mutazioni_RT of Sequenza_genomica. It is of type Text.
     */
    public void setElenco_mutazioni_RT(String elenco_mutazioni_RT) {
        this.elenco_mutazioni_RT = elenco_mutazioni_RT;
    }

    /**
     * The attribute elenco_mutazioni_V3 of Sequenza_genomica. It is of type Text.
     */
    public String getElenco_mutazioni_V3() {
        return elenco_mutazioni_V3;
    }
    /**
     * The attribute elenco_mutazioni_V3 of Sequenza_genomica. It is of type Text.
     */
    public void setElenco_mutazioni_V3(String elenco_mutazioni_V3) {
        this.elenco_mutazioni_V3 = elenco_mutazioni_V3;
    }

    /**
     * The attribute etichetta of Sequenza_genomica. It is of type String. Max length: 255.
     */
    public String getEtichetta() {
        return etichetta;
    }
    /**
     * The attribute etichetta of Sequenza_genomica. It is of type String. Max length: 255.
     */
    public void setEtichetta(String etichetta) {
        this.etichetta = etichetta;
    }

    /**
     * The attribute filtro_codice_paziente of Sequenza_genomica. It is of type String. Max length: 255.
     */
    public String getFiltro_codice_paziente() {
        return filtro_codice_paziente;
    }
    /**
     * The attribute filtro_codice_paziente of Sequenza_genomica. It is of type String. Max length: 255.
     */
    public void setFiltro_codice_paziente(String filtro_codice_paziente) {
        this.filtro_codice_paziente = filtro_codice_paziente;
    }

    /**
     * The attribute mutazioni of Sequenza_genomica. It is of type Int. Path: COUNT_ALL - Count allmutazione __id. Cannot be null.
     */
    public Integer getMutazioni() {
        return mutazioni;
    }
    /**
     * The attribute mutazioni of Sequenza_genomica. It is of type Int. Path: COUNT_ALL - Count allmutazione __id. Cannot be null.
     */
    public void setMutazioni(Integer mutazioni) {
        this.mutazioni = mutazioni;
    }

    /**
     * The attribute mutazioni_no_farmaco of Sequenza_genomica. It is of type Text.
     */
    public String getMutazioni_no_farmaco() {
        return mutazioni_no_farmaco;
    }
    /**
     * The attribute mutazioni_no_farmaco of Sequenza_genomica. It is of type Text.
     */
    public void setMutazioni_no_farmaco(String mutazioni_no_farmaco) {
        this.mutazioni_no_farmaco = mutazioni_no_farmaco;
    }

    /**
     * The attribute nessuna_mutazione_ENV of Sequenza_genomica. It is of type Boolean.
     */
    public Boolean getNessuna_mutazione_ENV() {
        return nessuna_mutazione_ENV;
    }
    /**
     * The attribute nessuna_mutazione_ENV of Sequenza_genomica. It is of type Boolean.
     */
    public void setNessuna_mutazione_ENV(Boolean nessuna_mutazione_ENV) {
        this.nessuna_mutazione_ENV = nessuna_mutazione_ENV;
    }

    /**
     * The attribute nessuna_mutazione_INT of Sequenza_genomica. It is of type Boolean.
     */
    public Boolean getNessuna_mutazione_INT() {
        return nessuna_mutazione_INT;
    }
    /**
     * The attribute nessuna_mutazione_INT of Sequenza_genomica. It is of type Boolean.
     */
    public void setNessuna_mutazione_INT(Boolean nessuna_mutazione_INT) {
        this.nessuna_mutazione_INT = nessuna_mutazione_INT;
    }

    /**
     * The attribute nessuna_mutazione_PR of Sequenza_genomica. It is of type Boolean.
     */
    public Boolean getNessuna_mutazione_PR() {
        return nessuna_mutazione_PR;
    }
    /**
     * The attribute nessuna_mutazione_PR of Sequenza_genomica. It is of type Boolean.
     */
    public void setNessuna_mutazione_PR(Boolean nessuna_mutazione_PR) {
        this.nessuna_mutazione_PR = nessuna_mutazione_PR;
    }

    /**
     * The attribute nessuna_mutazione_RT of Sequenza_genomica. It is of type Boolean.
     */
    public Boolean getNessuna_mutazione_RT() {
        return nessuna_mutazione_RT;
    }
    /**
     * The attribute nessuna_mutazione_RT of Sequenza_genomica. It is of type Boolean.
     */
    public void setNessuna_mutazione_RT(Boolean nessuna_mutazione_RT) {
        this.nessuna_mutazione_RT = nessuna_mutazione_RT;
    }

    /**
     * The attribute nessuna_mutazione_V3 of Sequenza_genomica. It is of type Boolean.
     */
    public Boolean getNessuna_mutazione_V3() {
        return nessuna_mutazione_V3;
    }
    /**
     * The attribute nessuna_mutazione_V3 of Sequenza_genomica. It is of type Boolean.
     */
    public void setNessuna_mutazione_V3(Boolean nessuna_mutazione_V3) {
        this.nessuna_mutazione_V3 = nessuna_mutazione_V3;
    }

    /**
     * The attribute nucleotidi of Sequenza_genomica. It is of type Text.
     */
    public String getNucleotidi() {
        return nucleotidi;
    }
    /**
     * The attribute nucleotidi of Sequenza_genomica. It is of type Text.
     */
    public void setNucleotidi(String nucleotidi) {
        this.nucleotidi = nucleotidi;
    }

    /**
     * The attribute regione of Sequenza_genomica. It is of type String. Max length: 255.
     */
    public String getRegione() {
        return regione;
    }
    /**
     * The attribute regione of Sequenza_genomica. It is of type String. Max length: 255.
     */
    public void setRegione(String regione) {
        this.regione = regione;
    }

    /**
     * The attribute sottotipo of Sequenza_genomica. It is of type String. Max length: 255.
     */
    public String getSottotipo() {
        return sottotipo;
    }
    /**
     * The attribute sottotipo of Sequenza_genomica. It is of type String. Max length: 255.
     */
    public void setSottotipo(String sottotipo) {
        this.sottotipo = sottotipo;
    }

    /**
     * The attribute tipo_sequenza of Sequenza_genomica. It is of type String. Domain: fenotipo virtuale OR genotipo OR fenotipo.}Max length: 255.
     */
    public String getTipo_sequenza() {
        return tipo_sequenza;
    }
    /**
     * The attribute tipo_sequenza of Sequenza_genomica. It is of type String. Domain: fenotipo virtuale OR genotipo OR fenotipo.}Max length: 255.
     */
    public void setTipo_sequenza(String tipo_sequenza) {
        this.tipo_sequenza = tipo_sequenza;
    }

    /**
     * The associated object for the role centro_sequenziatore.
     */
    public CliCentro_sequenziatoreDTO getCentro_sequenziatore() {
        return centro_sequenziatore;
    }
    /**
     * The associated object for the role centro_sequenziatore.
     */
    public void setCentro_sequenziatore(CliCentro_sequenziatoreDTO centro_sequenziatore) {
        this.centro_sequenziatore = centro_sequenziatore;
    }

    /**
     * The associated object for the role metodica_genotipo.
     */
    public CliMetodica_genotipoDTO getMetodica_genotipo() {
        return metodica_genotipo;
    }
    /**
     * The associated object for the role metodica_genotipo.
     */
    public void setMetodica_genotipo(CliMetodica_genotipoDTO metodica_genotipo) {
        this.metodica_genotipo = metodica_genotipo;
    }

    /**
     * The associated object for the role paziente.
     */
    public CliPazienteDTO getPaziente() {
        return paziente;
    }
    /**
     * The associated object for the role paziente.
     */
    public void setPaziente(CliPazienteDTO paziente) {
        this.paziente = paziente;
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
        if (altra_metodica != null) {
            joiner.add("altra_metodica: " + GraphQLRequestSerializer.getEntry(altra_metodica));
        }
        if (altro_centro != null) {
            joiner.add("altro_centro: " + GraphQLRequestSerializer.getEntry(altro_centro));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (codice_paziente != null) {
            joiner.add("codice_paziente: " + GraphQLRequestSerializer.getEntry(codice_paziente));
        }
        if (data_analisi != null) {
            joiner.add("data_analisi: " + GraphQLRequestSerializer.getEntry(data_analisi));
        }
        if (data_prelievo != null) {
            joiner.add("data_prelievo: " + GraphQLRequestSerializer.getEntry(data_prelievo));
        }
        if (effettuato_su != null) {
            joiner.add("effettuato_su: " + GraphQLRequestSerializer.getEntry(effettuato_su));
        }
        if (elenco_mutazioni_ENV != null) {
            joiner.add("elenco_mutazioni_ENV: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV));
        }
        if (elenco_mutazioni_INT != null) {
            joiner.add("elenco_mutazioni_INT: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT));
        }
        if (elenco_mutazioni_PR != null) {
            joiner.add("elenco_mutazioni_PR: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR));
        }
        if (elenco_mutazioni_RT != null) {
            joiner.add("elenco_mutazioni_RT: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT));
        }
        if (elenco_mutazioni_V3 != null) {
            joiner.add("elenco_mutazioni_V3: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3));
        }
        if (etichetta != null) {
            joiner.add("etichetta: " + GraphQLRequestSerializer.getEntry(etichetta));
        }
        if (filtro_codice_paziente != null) {
            joiner.add("filtro_codice_paziente: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente));
        }
        if (mutazioni != null) {
            joiner.add("mutazioni: " + GraphQLRequestSerializer.getEntry(mutazioni));
        }
        if (mutazioni_no_farmaco != null) {
            joiner.add("mutazioni_no_farmaco: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco));
        }
        if (nessuna_mutazione_ENV != null) {
            joiner.add("nessuna_mutazione_ENV: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_ENV));
        }
        if (nessuna_mutazione_INT != null) {
            joiner.add("nessuna_mutazione_INT: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_INT));
        }
        if (nessuna_mutazione_PR != null) {
            joiner.add("nessuna_mutazione_PR: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_PR));
        }
        if (nessuna_mutazione_RT != null) {
            joiner.add("nessuna_mutazione_RT: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_RT));
        }
        if (nessuna_mutazione_V3 != null) {
            joiner.add("nessuna_mutazione_V3: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_V3));
        }
        if (nucleotidi != null) {
            joiner.add("nucleotidi: " + GraphQLRequestSerializer.getEntry(nucleotidi));
        }
        if (regione != null) {
            joiner.add("regione: " + GraphQLRequestSerializer.getEntry(regione));
        }
        if (sottotipo != null) {
            joiner.add("sottotipo: " + GraphQLRequestSerializer.getEntry(sottotipo));
        }
        if (tipo_sequenza != null) {
            joiner.add("tipo_sequenza: " + GraphQLRequestSerializer.getEntry(tipo_sequenza));
        }
        if (centro_sequenziatore != null) {
            joiner.add("centro_sequenziatore: " + GraphQLRequestSerializer.getEntry(centro_sequenziatore));
        }
        if (metodica_genotipo != null) {
            joiner.add("metodica_genotipo: " + GraphQLRequestSerializer.getEntry(metodica_genotipo));
        }
        if (paziente != null) {
            joiner.add("paziente: " + GraphQLRequestSerializer.getEntry(paziente));
        }
        return joiner.toString();
    }

    public static CliSequenza_genomicaDTO.Builder builder() {
        return new CliSequenza_genomicaDTO.Builder();
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
        private String altra_metodica;
        private String altro_centro;
        private String codice_centro;
        private String codice_paziente;
        private String data_analisi;
        private String data_prelievo;
        private String effettuato_su;
        private String elenco_mutazioni_ENV;
        private String elenco_mutazioni_INT;
        private String elenco_mutazioni_PR;
        private String elenco_mutazioni_RT;
        private String elenco_mutazioni_V3;
        private String etichetta;
        private String filtro_codice_paziente;
        private Integer mutazioni;
        private String mutazioni_no_farmaco;
        private Boolean nessuna_mutazione_ENV;
        private Boolean nessuna_mutazione_INT;
        private Boolean nessuna_mutazione_PR;
        private Boolean nessuna_mutazione_RT;
        private Boolean nessuna_mutazione_V3;
        private String nucleotidi;
        private String regione;
        private String sottotipo;
        private String tipo_sequenza;
        private CliCentro_sequenziatoreDTO centro_sequenziatore;
        private CliMetodica_genotipoDTO metodica_genotipo;
        private CliPazienteDTO paziente;

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
         * The attribute _createdby of Sequenza_genomica. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Sequenza_genomica. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Sequenza_genomica. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Sequenza_genomica. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Sequenza_genomica. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Sequenza_genomica. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Sequenza_genomica. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute altra_metodica of Sequenza_genomica. It is of type String. Max length: 255.
         */
        public Builder setAltra_metodica(String altra_metodica) {
            this.altra_metodica = altra_metodica;
            return this;
        }

        /**
         * The attribute altro_centro of Sequenza_genomica. It is of type String. Max length: 255.
         */
        public Builder setAltro_centro(String altro_centro) {
            this.altro_centro = altro_centro;
            return this;
        }

        /**
         * The attribute codice_centro of Sequenza_genomica. It is of type String. Path: paziente.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute codice_paziente of Sequenza_genomica. It is of type String. Path: paziente codice_interno. Cannot be null.
         */
        public Builder setCodice_paziente(String codice_paziente) {
            this.codice_paziente = codice_paziente;
            return this;
        }

        /**
         * The attribute data_analisi of Sequenza_genomica. It is of type Date @dateFormat.
         */
        public Builder setData_analisi(String data_analisi) {
            this.data_analisi = data_analisi;
            return this;
        }

        /**
         * The attribute data_prelievo of Sequenza_genomica. It is of type Date @dateFormat.
         */
        public Builder setData_prelievo(String data_prelievo) {
            this.data_prelievo = data_prelievo;
            return this;
        }

        /**
         * The attribute effettuato_su of Sequenza_genomica. It is of type String. Domain: RNA OR DNA.}Max length: 255.
         */
        public Builder setEffettuato_su(String effettuato_su) {
            this.effettuato_su = effettuato_su;
            return this;
        }

        /**
         * The attribute elenco_mutazioni_ENV of Sequenza_genomica. It is of type Text.
         */
        public Builder setElenco_mutazioni_ENV(String elenco_mutazioni_ENV) {
            this.elenco_mutazioni_ENV = elenco_mutazioni_ENV;
            return this;
        }

        /**
         * The attribute elenco_mutazioni_INT of Sequenza_genomica. It is of type Text.
         */
        public Builder setElenco_mutazioni_INT(String elenco_mutazioni_INT) {
            this.elenco_mutazioni_INT = elenco_mutazioni_INT;
            return this;
        }

        /**
         * The attribute elenco_mutazioni_PR of Sequenza_genomica. It is of type Text.
         */
        public Builder setElenco_mutazioni_PR(String elenco_mutazioni_PR) {
            this.elenco_mutazioni_PR = elenco_mutazioni_PR;
            return this;
        }

        /**
         * The attribute elenco_mutazioni_RT of Sequenza_genomica. It is of type Text.
         */
        public Builder setElenco_mutazioni_RT(String elenco_mutazioni_RT) {
            this.elenco_mutazioni_RT = elenco_mutazioni_RT;
            return this;
        }

        /**
         * The attribute elenco_mutazioni_V3 of Sequenza_genomica. It is of type Text.
         */
        public Builder setElenco_mutazioni_V3(String elenco_mutazioni_V3) {
            this.elenco_mutazioni_V3 = elenco_mutazioni_V3;
            return this;
        }

        /**
         * The attribute etichetta of Sequenza_genomica. It is of type String. Max length: 255.
         */
        public Builder setEtichetta(String etichetta) {
            this.etichetta = etichetta;
            return this;
        }

        /**
         * The attribute filtro_codice_paziente of Sequenza_genomica. It is of type String. Max length: 255.
         */
        public Builder setFiltro_codice_paziente(String filtro_codice_paziente) {
            this.filtro_codice_paziente = filtro_codice_paziente;
            return this;
        }

        /**
         * The attribute mutazioni of Sequenza_genomica. It is of type Int. Path: COUNT_ALL - Count allmutazione __id. Cannot be null.
         */
        public Builder setMutazioni(Integer mutazioni) {
            this.mutazioni = mutazioni;
            return this;
        }

        /**
         * The attribute mutazioni_no_farmaco of Sequenza_genomica. It is of type Text.
         */
        public Builder setMutazioni_no_farmaco(String mutazioni_no_farmaco) {
            this.mutazioni_no_farmaco = mutazioni_no_farmaco;
            return this;
        }

        /**
         * The attribute nessuna_mutazione_ENV of Sequenza_genomica. It is of type Boolean.
         */
        public Builder setNessuna_mutazione_ENV(Boolean nessuna_mutazione_ENV) {
            this.nessuna_mutazione_ENV = nessuna_mutazione_ENV;
            return this;
        }

        /**
         * The attribute nessuna_mutazione_INT of Sequenza_genomica. It is of type Boolean.
         */
        public Builder setNessuna_mutazione_INT(Boolean nessuna_mutazione_INT) {
            this.nessuna_mutazione_INT = nessuna_mutazione_INT;
            return this;
        }

        /**
         * The attribute nessuna_mutazione_PR of Sequenza_genomica. It is of type Boolean.
         */
        public Builder setNessuna_mutazione_PR(Boolean nessuna_mutazione_PR) {
            this.nessuna_mutazione_PR = nessuna_mutazione_PR;
            return this;
        }

        /**
         * The attribute nessuna_mutazione_RT of Sequenza_genomica. It is of type Boolean.
         */
        public Builder setNessuna_mutazione_RT(Boolean nessuna_mutazione_RT) {
            this.nessuna_mutazione_RT = nessuna_mutazione_RT;
            return this;
        }

        /**
         * The attribute nessuna_mutazione_V3 of Sequenza_genomica. It is of type Boolean.
         */
        public Builder setNessuna_mutazione_V3(Boolean nessuna_mutazione_V3) {
            this.nessuna_mutazione_V3 = nessuna_mutazione_V3;
            return this;
        }

        /**
         * The attribute nucleotidi of Sequenza_genomica. It is of type Text.
         */
        public Builder setNucleotidi(String nucleotidi) {
            this.nucleotidi = nucleotidi;
            return this;
        }

        /**
         * The attribute regione of Sequenza_genomica. It is of type String. Max length: 255.
         */
        public Builder setRegione(String regione) {
            this.regione = regione;
            return this;
        }

        /**
         * The attribute sottotipo of Sequenza_genomica. It is of type String. Max length: 255.
         */
        public Builder setSottotipo(String sottotipo) {
            this.sottotipo = sottotipo;
            return this;
        }

        /**
         * The attribute tipo_sequenza of Sequenza_genomica. It is of type String. Domain: fenotipo virtuale OR genotipo OR fenotipo.}Max length: 255.
         */
        public Builder setTipo_sequenza(String tipo_sequenza) {
            this.tipo_sequenza = tipo_sequenza;
            return this;
        }

        /**
         * The associated object for the role centro_sequenziatore.
         */
        public Builder setCentro_sequenziatore(CliCentro_sequenziatoreDTO centro_sequenziatore) {
            this.centro_sequenziatore = centro_sequenziatore;
            return this;
        }

        /**
         * The associated object for the role metodica_genotipo.
         */
        public Builder setMetodica_genotipo(CliMetodica_genotipoDTO metodica_genotipo) {
            this.metodica_genotipo = metodica_genotipo;
            return this;
        }

        /**
         * The associated object for the role paziente.
         */
        public Builder setPaziente(CliPazienteDTO paziente) {
            this.paziente = paziente;
            return this;
        }


        public CliSequenza_genomicaDTO build() {
            CliSequenza_genomicaDTO result = new CliSequenza_genomicaDTO();
            result.set_clientId(this._clientId);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAltra_metodica(this.altra_metodica);
            result.setAltro_centro(this.altro_centro);
            result.setCodice_centro(this.codice_centro);
            result.setCodice_paziente(this.codice_paziente);
            result.setData_analisi(this.data_analisi);
            result.setData_prelievo(this.data_prelievo);
            result.setEffettuato_su(this.effettuato_su);
            result.setElenco_mutazioni_ENV(this.elenco_mutazioni_ENV);
            result.setElenco_mutazioni_INT(this.elenco_mutazioni_INT);
            result.setElenco_mutazioni_PR(this.elenco_mutazioni_PR);
            result.setElenco_mutazioni_RT(this.elenco_mutazioni_RT);
            result.setElenco_mutazioni_V3(this.elenco_mutazioni_V3);
            result.setEtichetta(this.etichetta);
            result.setFiltro_codice_paziente(this.filtro_codice_paziente);
            result.setMutazioni(this.mutazioni);
            result.setMutazioni_no_farmaco(this.mutazioni_no_farmaco);
            result.setNessuna_mutazione_ENV(this.nessuna_mutazione_ENV);
            result.setNessuna_mutazione_INT(this.nessuna_mutazione_INT);
            result.setNessuna_mutazione_PR(this.nessuna_mutazione_PR);
            result.setNessuna_mutazione_RT(this.nessuna_mutazione_RT);
            result.setNessuna_mutazione_V3(this.nessuna_mutazione_V3);
            result.setNucleotidi(this.nucleotidi);
            result.setRegione(this.regione);
            result.setSottotipo(this.sottotipo);
            result.setTipo_sequenza(this.tipo_sequenza);
            result.setCentro_sequenziatore(this.centro_sequenziatore);
            result.setMetodica_genotipo(this.metodica_genotipo);
            result.setPaziente(this.paziente);
            return result;
        }

    }
}
