package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Evento_epatico.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliEvento_epaticoCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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

    public CliEvento_epaticoCursorDTO() {
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

    public Boolean getAlcolizzazione() {
        return alcolizzazione;
    }
    public void setAlcolizzazione(Boolean alcolizzazione) {
        this.alcolizzazione = alcolizzazione;
    }

    public String getAltra_eziologia() {
        return altra_eziologia;
    }
    public void setAltra_eziologia(String altra_eziologia) {
        this.altra_eziologia = altra_eziologia;
    }

    public String getAltra_procedura_chirurgica() {
        return altra_procedura_chirurgica;
    }
    public void setAltra_procedura_chirurgica(String altra_procedura_chirurgica) {
        this.altra_procedura_chirurgica = altra_procedura_chirurgica;
    }

    public String getAltri_dettagli_istologia() {
        return altri_dettagli_istologia;
    }
    public void setAltri_dettagli_istologia(String altri_dettagli_istologia) {
        this.altri_dettagli_istologia = altri_dettagli_istologia;
    }

    public Boolean getChemioembolizzazione() {
        return chemioembolizzazione;
    }
    public void setChemioembolizzazione(Boolean chemioembolizzazione) {
        this.chemioembolizzazione = chemioembolizzazione;
    }

    public String getClassificazione_child() {
        return classificazione_child;
    }
    public void setClassificazione_child(String classificazione_child) {
        this.classificazione_child = classificazione_child;
    }

    public String getCodice_centro() {
        return codice_centro;
    }
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    public String getCommenti() {
        return commenti;
    }
    public void setCommenti(String commenti) {
        this.commenti = commenti;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getData_ricezione() {
        return data_ricezione;
    }
    public void setData_ricezione(String data_ricezione) {
        this.data_ricezione = data_ricezione;
    }

    public String getData_richiesta() {
        return data_richiesta;
    }
    public void setData_richiesta(String data_richiesta) {
        this.data_richiesta = data_richiesta;
    }

    public Boolean getEziologia_alcool() {
        return eziologia_alcool;
    }
    public void setEziologia_alcool(Boolean eziologia_alcool) {
        this.eziologia_alcool = eziologia_alcool;
    }

    public Boolean getEziologia_farmaci() {
        return eziologia_farmaci;
    }
    public void setEziologia_farmaci(Boolean eziologia_farmaci) {
        this.eziologia_farmaci = eziologia_farmaci;
    }

    public Boolean getEziologia_non_nota() {
        return eziologia_non_nota;
    }
    public void setEziologia_non_nota(Boolean eziologia_non_nota) {
        this.eziologia_non_nota = eziologia_non_nota;
    }

    public Integer getId_respond() {
        return id_respond;
    }
    public void setId_respond(Integer id_respond) {
        this.id_respond = id_respond;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public String getPatologie() {
        return patologie;
    }
    public void setPatologie(String patologie) {
        this.patologie = patologie;
    }

    public Boolean getResezione_epatica() {
        return resezione_epatica;
    }
    public void setResezione_epatica(Boolean resezione_epatica) {
        this.resezione_epatica = resezione_epatica;
    }

    public String getStato_richiesta() {
        return stato_richiesta;
    }
    public void setStato_richiesta(String stato_richiesta) {
        this.stato_richiesta = stato_richiesta;
    }

    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }

    public Boolean getTermoablazione() {
        return termoablazione;
    }
    public void setTermoablazione(Boolean termoablazione) {
        this.termoablazione = termoablazione;
    }

    public Boolean getTrapianto_epatico() {
        return trapianto_epatico;
    }
    public void setTrapianto_epatico(Boolean trapianto_epatico) {
        this.trapianto_epatico = trapianto_epatico;
    }

    public Boolean getWarning_respond_biop() {
        return warning_respond_biop;
    }
    public void setWarning_respond_biop(Boolean warning_respond_biop) {
        this.warning_respond_biop = warning_respond_biop;
    }

    public Boolean getWarning_respond_epa() {
        return warning_respond_epa;
    }
    public void setWarning_respond_epa(Boolean warning_respond_epa) {
        this.warning_respond_epa = warning_respond_epa;
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
        return joiner.toString();
    }

    public static CliEvento_epaticoCursorDTO.Builder builder() {
        return new CliEvento_epaticoCursorDTO.Builder();
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

        public Builder setAlcolizzazione(Boolean alcolizzazione) {
            this.alcolizzazione = alcolizzazione;
            return this;
        }

        public Builder setAltra_eziologia(String altra_eziologia) {
            this.altra_eziologia = altra_eziologia;
            return this;
        }

        public Builder setAltra_procedura_chirurgica(String altra_procedura_chirurgica) {
            this.altra_procedura_chirurgica = altra_procedura_chirurgica;
            return this;
        }

        public Builder setAltri_dettagli_istologia(String altri_dettagli_istologia) {
            this.altri_dettagli_istologia = altri_dettagli_istologia;
            return this;
        }

        public Builder setChemioembolizzazione(Boolean chemioembolizzazione) {
            this.chemioembolizzazione = chemioembolizzazione;
            return this;
        }

        public Builder setClassificazione_child(String classificazione_child) {
            this.classificazione_child = classificazione_child;
            return this;
        }

        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        public Builder setCommenti(String commenti) {
            this.commenti = commenti;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setData_ricezione(String data_ricezione) {
            this.data_ricezione = data_ricezione;
            return this;
        }

        public Builder setData_richiesta(String data_richiesta) {
            this.data_richiesta = data_richiesta;
            return this;
        }

        public Builder setEziologia_alcool(Boolean eziologia_alcool) {
            this.eziologia_alcool = eziologia_alcool;
            return this;
        }

        public Builder setEziologia_farmaci(Boolean eziologia_farmaci) {
            this.eziologia_farmaci = eziologia_farmaci;
            return this;
        }

        public Builder setEziologia_non_nota(Boolean eziologia_non_nota) {
            this.eziologia_non_nota = eziologia_non_nota;
            return this;
        }

        public Builder setId_respond(Integer id_respond) {
            this.id_respond = id_respond;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setPatologie(String patologie) {
            this.patologie = patologie;
            return this;
        }

        public Builder setResezione_epatica(Boolean resezione_epatica) {
            this.resezione_epatica = resezione_epatica;
            return this;
        }

        public Builder setStato_richiesta(String stato_richiesta) {
            this.stato_richiesta = stato_richiesta;
            return this;
        }

        public Builder setTeam(String team) {
            this.team = team;
            return this;
        }

        public Builder setTermoablazione(Boolean termoablazione) {
            this.termoablazione = termoablazione;
            return this;
        }

        public Builder setTrapianto_epatico(Boolean trapianto_epatico) {
            this.trapianto_epatico = trapianto_epatico;
            return this;
        }

        public Builder setWarning_respond_biop(Boolean warning_respond_biop) {
            this.warning_respond_biop = warning_respond_biop;
            return this;
        }

        public Builder setWarning_respond_epa(Boolean warning_respond_epa) {
            this.warning_respond_epa = warning_respond_epa;
            return this;
        }


        public CliEvento_epaticoCursorDTO build() {
            CliEvento_epaticoCursorDTO result = new CliEvento_epaticoCursorDTO();
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
            return result;
        }

    }
}
