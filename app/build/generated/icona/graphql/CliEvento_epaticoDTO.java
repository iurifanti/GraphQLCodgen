package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Evento_epatico, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliEvento_epaticoDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private Boolean alcolizzazione;
    private String altra_eziologia;
    private String altra_procedura_chirurgica;
    private String altri_dettagli_istologia;
    private Boolean chemioembolizzazione;
    private String classificazione_child;
    private String codice_centro;
    private String commenti;
    private String data;
    private String data_ricezione;
    private String data_richiesta;
    private Boolean eziologia_alcool;
    private Boolean eziologia_farmaci;
    private Boolean eziologia_non_nota;
    private Integer id_respond;
    private String note;
    private String patologie;
    private Boolean resezione_epatica;
    private String stato_richiesta;
    private String team;
    private Boolean termoablazione;
    private Boolean trapianto_epatico;
    private Boolean warning_respond_biop;
    private Boolean warning_respond_epa;
    private CliPatologiaDTO patologia_epatica_dad1;
    private CliPazienteDTO paziente_;

    public CliEvento_epaticoDTO() {
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
     * The attribute _createdby of Evento_epatico. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Evento_epatico. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Evento_epatico. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Evento_epatico. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Evento_epatico. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Evento_epatico. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Evento_epatico. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Evento_epatico. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Evento_epatico. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Evento_epatico. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Evento_epatico. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Evento_epatico. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Evento_epatico. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Evento_epatico. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute alcolizzazione of Evento_epatico. It is of type Boolean.
     */
    public Boolean getAlcolizzazione() {
        return alcolizzazione;
    }
    /**
     * The attribute alcolizzazione of Evento_epatico. It is of type Boolean.
     */
    public void setAlcolizzazione(Boolean alcolizzazione) {
        this.alcolizzazione = alcolizzazione;
    }

    /**
     * The attribute altra_eziologia of Evento_epatico. It is of type String. Max length: 255.
     */
    public String getAltra_eziologia() {
        return altra_eziologia;
    }
    /**
     * The attribute altra_eziologia of Evento_epatico. It is of type String. Max length: 255.
     */
    public void setAltra_eziologia(String altra_eziologia) {
        this.altra_eziologia = altra_eziologia;
    }

    /**
     * The attribute altra_procedura_chirurgica of Evento_epatico. It is of type String. Max length: 255.
     */
    public String getAltra_procedura_chirurgica() {
        return altra_procedura_chirurgica;
    }
    /**
     * The attribute altra_procedura_chirurgica of Evento_epatico. It is of type String. Max length: 255.
     */
    public void setAltra_procedura_chirurgica(String altra_procedura_chirurgica) {
        this.altra_procedura_chirurgica = altra_procedura_chirurgica;
    }

    /**
     * The attribute altri_dettagli_istologia of Evento_epatico. It is of type String. Max length: 255.
     */
    public String getAltri_dettagli_istologia() {
        return altri_dettagli_istologia;
    }
    /**
     * The attribute altri_dettagli_istologia of Evento_epatico. It is of type String. Max length: 255.
     */
    public void setAltri_dettagli_istologia(String altri_dettagli_istologia) {
        this.altri_dettagli_istologia = altri_dettagli_istologia;
    }

    /**
     * The attribute chemioembolizzazione of Evento_epatico. It is of type Boolean.
     */
    public Boolean getChemioembolizzazione() {
        return chemioembolizzazione;
    }
    /**
     * The attribute chemioembolizzazione of Evento_epatico. It is of type Boolean.
     */
    public void setChemioembolizzazione(Boolean chemioembolizzazione) {
        this.chemioembolizzazione = chemioembolizzazione;
    }

    /**
     * The attribute classificazione_child of Evento_epatico. It is of type String. Domain: A OR B OR C.}Max length: 255.
     */
    public String getClassificazione_child() {
        return classificazione_child;
    }
    /**
     * The attribute classificazione_child of Evento_epatico. It is of type String. Domain: A OR B OR C.}Max length: 255.
     */
    public void setClassificazione_child(String classificazione_child) {
        this.classificazione_child = classificazione_child;
    }

    /**
     * The attribute codice_centro of Evento_epatico. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Evento_epatico. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute commenti of Evento_epatico. It is of type Text.
     */
    public String getCommenti() {
        return commenti;
    }
    /**
     * The attribute commenti of Evento_epatico. It is of type Text.
     */
    public void setCommenti(String commenti) {
        this.commenti = commenti;
    }

    /**
     * The attribute data of Evento_epatico. It is of type Date @dateFormat.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Evento_epatico. It is of type Date @dateFormat.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute data_ricezione of Evento_epatico. It is of type Date @dateFormat.
     */
    public String getData_ricezione() {
        return data_ricezione;
    }
    /**
     * The attribute data_ricezione of Evento_epatico. It is of type Date @dateFormat.
     */
    public void setData_ricezione(String data_ricezione) {
        this.data_ricezione = data_ricezione;
    }

    /**
     * The attribute data_richiesta of Evento_epatico. It is of type Date @dateFormat.
     */
    public String getData_richiesta() {
        return data_richiesta;
    }
    /**
     * The attribute data_richiesta of Evento_epatico. It is of type Date @dateFormat.
     */
    public void setData_richiesta(String data_richiesta) {
        this.data_richiesta = data_richiesta;
    }

    /**
     * The attribute eziologia_alcool of Evento_epatico. It is of type Boolean.
     */
    public Boolean getEziologia_alcool() {
        return eziologia_alcool;
    }
    /**
     * The attribute eziologia_alcool of Evento_epatico. It is of type Boolean.
     */
    public void setEziologia_alcool(Boolean eziologia_alcool) {
        this.eziologia_alcool = eziologia_alcool;
    }

    /**
     * The attribute eziologia_farmaci of Evento_epatico. It is of type Boolean.
     */
    public Boolean getEziologia_farmaci() {
        return eziologia_farmaci;
    }
    /**
     * The attribute eziologia_farmaci of Evento_epatico. It is of type Boolean.
     */
    public void setEziologia_farmaci(Boolean eziologia_farmaci) {
        this.eziologia_farmaci = eziologia_farmaci;
    }

    /**
     * The attribute eziologia_non_nota of Evento_epatico. It is of type Boolean.
     */
    public Boolean getEziologia_non_nota() {
        return eziologia_non_nota;
    }
    /**
     * The attribute eziologia_non_nota of Evento_epatico. It is of type Boolean.
     */
    public void setEziologia_non_nota(Boolean eziologia_non_nota) {
        this.eziologia_non_nota = eziologia_non_nota;
    }

    /**
     * The attribute id_respond of Evento_epatico. It is of type Int. Path: paziente_ id_respond.
     */
    public Integer getId_respond() {
        return id_respond;
    }
    /**
     * The attribute id_respond of Evento_epatico. It is of type Int. Path: paziente_ id_respond.
     */
    public void setId_respond(Integer id_respond) {
        this.id_respond = id_respond;
    }

    /**
     * The attribute note of Evento_epatico. It is of type Text.
     */
    public String getNote() {
        return note;
    }
    /**
     * The attribute note of Evento_epatico. It is of type Text.
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * The attribute patologie of Evento_epatico. It is of type String. Path: CONCAT_CS - Concat (comma separated)patologia_epatica nome. Cannot be null.
     */
    public String getPatologie() {
        return patologie;
    }
    /**
     * The attribute patologie of Evento_epatico. It is of type String. Path: CONCAT_CS - Concat (comma separated)patologia_epatica nome. Cannot be null.
     */
    public void setPatologie(String patologie) {
        this.patologie = patologie;
    }

    /**
     * The attribute resezione_epatica of Evento_epatico. It is of type Boolean.
     */
    public Boolean getResezione_epatica() {
        return resezione_epatica;
    }
    /**
     * The attribute resezione_epatica of Evento_epatico. It is of type Boolean.
     */
    public void setResezione_epatica(Boolean resezione_epatica) {
        this.resezione_epatica = resezione_epatica;
    }

    /**
     * The attribute stato_richiesta of Evento_epatico. It is of type String. Domain: Non ancora richiesta OR Reperita OR Non reperibile OR In attesa responso OR Ignorare.}Max length: 255.
     */
    public String getStato_richiesta() {
        return stato_richiesta;
    }
    /**
     * The attribute stato_richiesta of Evento_epatico. It is of type String. Domain: Non ancora richiesta OR Reperita OR Non reperibile OR In attesa responso OR Ignorare.}Max length: 255.
     */
    public void setStato_richiesta(String stato_richiesta) {
        this.stato_richiesta = stato_richiesta;
    }

    /**
     * The attribute team of Evento_epatico. It is of type String. Expression: '__CurrentUser.team'.
     */
    public String getTeam() {
        return team;
    }
    /**
     * The attribute team of Evento_epatico. It is of type String. Expression: '__CurrentUser.team'.
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * The attribute termoablazione of Evento_epatico. It is of type Boolean.
     */
    public Boolean getTermoablazione() {
        return termoablazione;
    }
    /**
     * The attribute termoablazione of Evento_epatico. It is of type Boolean.
     */
    public void setTermoablazione(Boolean termoablazione) {
        this.termoablazione = termoablazione;
    }

    /**
     * The attribute trapianto_epatico of Evento_epatico. It is of type Boolean.
     */
    public Boolean getTrapianto_epatico() {
        return trapianto_epatico;
    }
    /**
     * The attribute trapianto_epatico of Evento_epatico. It is of type Boolean.
     */
    public void setTrapianto_epatico(Boolean trapianto_epatico) {
        this.trapianto_epatico = trapianto_epatico;
    }

    /**
     * The attribute warning_respond_biop of Evento_epatico. It is of type Boolean. Path: OR - Logical ORbiopsia_epatica warning_respond.
     */
    public Boolean getWarning_respond_biop() {
        return warning_respond_biop;
    }
    /**
     * The attribute warning_respond_biop of Evento_epatico. It is of type Boolean. Path: OR - Logical ORbiopsia_epatica warning_respond.
     */
    public void setWarning_respond_biop(Boolean warning_respond_biop) {
        this.warning_respond_biop = warning_respond_biop;
    }

    /**
     * The attribute warning_respond_epa of Evento_epatico. It is of type Boolean. Path: OR - Logical ORpatologia_epatica warning_respond.
     */
    public Boolean getWarning_respond_epa() {
        return warning_respond_epa;
    }
    /**
     * The attribute warning_respond_epa of Evento_epatico. It is of type Boolean. Path: OR - Logical ORpatologia_epatica warning_respond.
     */
    public void setWarning_respond_epa(Boolean warning_respond_epa) {
        this.warning_respond_epa = warning_respond_epa;
    }

    /**
     * The associated object for the role patologia_epatica_dad1.
     */
    public CliPatologiaDTO getPatologia_epatica_dad1() {
        return patologia_epatica_dad1;
    }
    /**
     * The associated object for the role patologia_epatica_dad1.
     */
    public void setPatologia_epatica_dad1(CliPatologiaDTO patologia_epatica_dad1) {
        this.patologia_epatica_dad1 = patologia_epatica_dad1;
    }

    /**
     * The associated object for the role paziente_.
     */
    public CliPazienteDTO getPaziente_() {
        return paziente_;
    }
    /**
     * The associated object for the role paziente_.
     */
    public void setPaziente_(CliPazienteDTO paziente_) {
        this.paziente_ = paziente_;
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
        if (alcolizzazione != null) {
            joiner.add("alcolizzazione: " + GraphQLRequestSerializer.getEntry(alcolizzazione));
        }
        if (altra_eziologia != null) {
            joiner.add("altra_eziologia: " + GraphQLRequestSerializer.getEntry(altra_eziologia));
        }
        if (altra_procedura_chirurgica != null) {
            joiner.add("altra_procedura_chirurgica: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica));
        }
        if (altri_dettagli_istologia != null) {
            joiner.add("altri_dettagli_istologia: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia));
        }
        if (chemioembolizzazione != null) {
            joiner.add("chemioembolizzazione: " + GraphQLRequestSerializer.getEntry(chemioembolizzazione));
        }
        if (classificazione_child != null) {
            joiner.add("classificazione_child: " + GraphQLRequestSerializer.getEntry(classificazione_child));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (commenti != null) {
            joiner.add("commenti: " + GraphQLRequestSerializer.getEntry(commenti));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (data_ricezione != null) {
            joiner.add("data_ricezione: " + GraphQLRequestSerializer.getEntry(data_ricezione));
        }
        if (data_richiesta != null) {
            joiner.add("data_richiesta: " + GraphQLRequestSerializer.getEntry(data_richiesta));
        }
        if (eziologia_alcool != null) {
            joiner.add("eziologia_alcool: " + GraphQLRequestSerializer.getEntry(eziologia_alcool));
        }
        if (eziologia_farmaci != null) {
            joiner.add("eziologia_farmaci: " + GraphQLRequestSerializer.getEntry(eziologia_farmaci));
        }
        if (eziologia_non_nota != null) {
            joiner.add("eziologia_non_nota: " + GraphQLRequestSerializer.getEntry(eziologia_non_nota));
        }
        if (id_respond != null) {
            joiner.add("id_respond: " + GraphQLRequestSerializer.getEntry(id_respond));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (patologie != null) {
            joiner.add("patologie: " + GraphQLRequestSerializer.getEntry(patologie));
        }
        if (resezione_epatica != null) {
            joiner.add("resezione_epatica: " + GraphQLRequestSerializer.getEntry(resezione_epatica));
        }
        if (stato_richiesta != null) {
            joiner.add("stato_richiesta: " + GraphQLRequestSerializer.getEntry(stato_richiesta));
        }
        if (team != null) {
            joiner.add("team: " + GraphQLRequestSerializer.getEntry(team));
        }
        if (termoablazione != null) {
            joiner.add("termoablazione: " + GraphQLRequestSerializer.getEntry(termoablazione));
        }
        if (trapianto_epatico != null) {
            joiner.add("trapianto_epatico: " + GraphQLRequestSerializer.getEntry(trapianto_epatico));
        }
        if (warning_respond_biop != null) {
            joiner.add("warning_respond_biop: " + GraphQLRequestSerializer.getEntry(warning_respond_biop));
        }
        if (warning_respond_epa != null) {
            joiner.add("warning_respond_epa: " + GraphQLRequestSerializer.getEntry(warning_respond_epa));
        }
        if (patologia_epatica_dad1 != null) {
            joiner.add("patologia_epatica_dad1: " + GraphQLRequestSerializer.getEntry(patologia_epatica_dad1));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliEvento_epaticoDTO.Builder builder() {
        return new CliEvento_epaticoDTO.Builder();
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
        private Boolean alcolizzazione;
        private String altra_eziologia;
        private String altra_procedura_chirurgica;
        private String altri_dettagli_istologia;
        private Boolean chemioembolizzazione;
        private String classificazione_child;
        private String codice_centro;
        private String commenti;
        private String data;
        private String data_ricezione;
        private String data_richiesta;
        private Boolean eziologia_alcool;
        private Boolean eziologia_farmaci;
        private Boolean eziologia_non_nota;
        private Integer id_respond;
        private String note;
        private String patologie;
        private Boolean resezione_epatica;
        private String stato_richiesta;
        private String team;
        private Boolean termoablazione;
        private Boolean trapianto_epatico;
        private Boolean warning_respond_biop;
        private Boolean warning_respond_epa;
        private CliPatologiaDTO patologia_epatica_dad1;
        private CliPazienteDTO paziente_;

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
         * The attribute _createdby of Evento_epatico. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Evento_epatico. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Evento_epatico. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Evento_epatico. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Evento_epatico. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Evento_epatico. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Evento_epatico. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute alcolizzazione of Evento_epatico. It is of type Boolean.
         */
        public Builder setAlcolizzazione(Boolean alcolizzazione) {
            this.alcolizzazione = alcolizzazione;
            return this;
        }

        /**
         * The attribute altra_eziologia of Evento_epatico. It is of type String. Max length: 255.
         */
        public Builder setAltra_eziologia(String altra_eziologia) {
            this.altra_eziologia = altra_eziologia;
            return this;
        }

        /**
         * The attribute altra_procedura_chirurgica of Evento_epatico. It is of type String. Max length: 255.
         */
        public Builder setAltra_procedura_chirurgica(String altra_procedura_chirurgica) {
            this.altra_procedura_chirurgica = altra_procedura_chirurgica;
            return this;
        }

        /**
         * The attribute altri_dettagli_istologia of Evento_epatico. It is of type String. Max length: 255.
         */
        public Builder setAltri_dettagli_istologia(String altri_dettagli_istologia) {
            this.altri_dettagli_istologia = altri_dettagli_istologia;
            return this;
        }

        /**
         * The attribute chemioembolizzazione of Evento_epatico. It is of type Boolean.
         */
        public Builder setChemioembolizzazione(Boolean chemioembolizzazione) {
            this.chemioembolizzazione = chemioembolizzazione;
            return this;
        }

        /**
         * The attribute classificazione_child of Evento_epatico. It is of type String. Domain: A OR B OR C.}Max length: 255.
         */
        public Builder setClassificazione_child(String classificazione_child) {
            this.classificazione_child = classificazione_child;
            return this;
        }

        /**
         * The attribute codice_centro of Evento_epatico. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute commenti of Evento_epatico. It is of type Text.
         */
        public Builder setCommenti(String commenti) {
            this.commenti = commenti;
            return this;
        }

        /**
         * The attribute data of Evento_epatico. It is of type Date @dateFormat.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute data_ricezione of Evento_epatico. It is of type Date @dateFormat.
         */
        public Builder setData_ricezione(String data_ricezione) {
            this.data_ricezione = data_ricezione;
            return this;
        }

        /**
         * The attribute data_richiesta of Evento_epatico. It is of type Date @dateFormat.
         */
        public Builder setData_richiesta(String data_richiesta) {
            this.data_richiesta = data_richiesta;
            return this;
        }

        /**
         * The attribute eziologia_alcool of Evento_epatico. It is of type Boolean.
         */
        public Builder setEziologia_alcool(Boolean eziologia_alcool) {
            this.eziologia_alcool = eziologia_alcool;
            return this;
        }

        /**
         * The attribute eziologia_farmaci of Evento_epatico. It is of type Boolean.
         */
        public Builder setEziologia_farmaci(Boolean eziologia_farmaci) {
            this.eziologia_farmaci = eziologia_farmaci;
            return this;
        }

        /**
         * The attribute eziologia_non_nota of Evento_epatico. It is of type Boolean.
         */
        public Builder setEziologia_non_nota(Boolean eziologia_non_nota) {
            this.eziologia_non_nota = eziologia_non_nota;
            return this;
        }

        /**
         * The attribute id_respond of Evento_epatico. It is of type Int. Path: paziente_ id_respond.
         */
        public Builder setId_respond(Integer id_respond) {
            this.id_respond = id_respond;
            return this;
        }

        /**
         * The attribute note of Evento_epatico. It is of type Text.
         */
        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        /**
         * The attribute patologie of Evento_epatico. It is of type String. Path: CONCAT_CS - Concat (comma separated)patologia_epatica nome. Cannot be null.
         */
        public Builder setPatologie(String patologie) {
            this.patologie = patologie;
            return this;
        }

        /**
         * The attribute resezione_epatica of Evento_epatico. It is of type Boolean.
         */
        public Builder setResezione_epatica(Boolean resezione_epatica) {
            this.resezione_epatica = resezione_epatica;
            return this;
        }

        /**
         * The attribute stato_richiesta of Evento_epatico. It is of type String. Domain: Non ancora richiesta OR Reperita OR Non reperibile OR In attesa responso OR Ignorare.}Max length: 255.
         */
        public Builder setStato_richiesta(String stato_richiesta) {
            this.stato_richiesta = stato_richiesta;
            return this;
        }

        /**
         * The attribute team of Evento_epatico. It is of type String. Expression: '__CurrentUser.team'.
         */
        public Builder setTeam(String team) {
            this.team = team;
            return this;
        }

        /**
         * The attribute termoablazione of Evento_epatico. It is of type Boolean.
         */
        public Builder setTermoablazione(Boolean termoablazione) {
            this.termoablazione = termoablazione;
            return this;
        }

        /**
         * The attribute trapianto_epatico of Evento_epatico. It is of type Boolean.
         */
        public Builder setTrapianto_epatico(Boolean trapianto_epatico) {
            this.trapianto_epatico = trapianto_epatico;
            return this;
        }

        /**
         * The attribute warning_respond_biop of Evento_epatico. It is of type Boolean. Path: OR - Logical ORbiopsia_epatica warning_respond.
         */
        public Builder setWarning_respond_biop(Boolean warning_respond_biop) {
            this.warning_respond_biop = warning_respond_biop;
            return this;
        }

        /**
         * The attribute warning_respond_epa of Evento_epatico. It is of type Boolean. Path: OR - Logical ORpatologia_epatica warning_respond.
         */
        public Builder setWarning_respond_epa(Boolean warning_respond_epa) {
            this.warning_respond_epa = warning_respond_epa;
            return this;
        }

        /**
         * The associated object for the role patologia_epatica_dad1.
         */
        public Builder setPatologia_epatica_dad1(CliPatologiaDTO patologia_epatica_dad1) {
            this.patologia_epatica_dad1 = patologia_epatica_dad1;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliEvento_epaticoDTO build() {
            CliEvento_epaticoDTO result = new CliEvento_epaticoDTO();
            result.set_clientId(this._clientId);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAlcolizzazione(this.alcolizzazione);
            result.setAltra_eziologia(this.altra_eziologia);
            result.setAltra_procedura_chirurgica(this.altra_procedura_chirurgica);
            result.setAltri_dettagli_istologia(this.altri_dettagli_istologia);
            result.setChemioembolizzazione(this.chemioembolizzazione);
            result.setClassificazione_child(this.classificazione_child);
            result.setCodice_centro(this.codice_centro);
            result.setCommenti(this.commenti);
            result.setData(this.data);
            result.setData_ricezione(this.data_ricezione);
            result.setData_richiesta(this.data_richiesta);
            result.setEziologia_alcool(this.eziologia_alcool);
            result.setEziologia_farmaci(this.eziologia_farmaci);
            result.setEziologia_non_nota(this.eziologia_non_nota);
            result.setId_respond(this.id_respond);
            result.setNote(this.note);
            result.setPatologie(this.patologie);
            result.setResezione_epatica(this.resezione_epatica);
            result.setStato_richiesta(this.stato_richiesta);
            result.setTeam(this.team);
            result.setTermoablazione(this.termoablazione);
            result.setTrapianto_epatico(this.trapianto_epatico);
            result.setWarning_respond_biop(this.warning_respond_biop);
            result.setWarning_respond_epa(this.warning_respond_epa);
            result.setPatologia_epatica_dad1(this.patologia_epatica_dad1);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
