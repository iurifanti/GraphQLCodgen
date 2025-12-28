package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of Evento_epatico.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliEvento_epaticoCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private Boolean alcolizzazione;
    private String altra_eziologia;
    private String altra_procedura_chirurgica;
    private String altri_dettagli_istologia;
    private Boolean chemioembolizzazione;
    private String classificazione_child;
    private String commenti;
    private String data;
    private String data_ricezione;
    private String data_richiesta;
    private Boolean eziologia_alcool;
    private Boolean eziologia_farmaci;
    private Boolean eziologia_non_nota;
    private String note;
    private Boolean resezione_epatica;
    private String stato_richiesta;
    private Boolean termoablazione;
    private Boolean trapianto_epatico;
    private java.util.List<String> biopsia_epatica;
    @javax.validation.constraints.NotNull
    private java.util.List<String> patologia_epatica;
    private String patologia_epatica_dad1;

    public CliEvento_epaticoCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
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

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
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

    public java.util.List<String> getBiopsia_epatica() {
        return biopsia_epatica;
    }
    public void setBiopsia_epatica(java.util.List<String> biopsia_epatica) {
        this.biopsia_epatica = biopsia_epatica;
    }

    public java.util.List<String> getPatologia_epatica() {
        return patologia_epatica;
    }
    public void setPatologia_epatica(java.util.List<String> patologia_epatica) {
        this.patologia_epatica = patologia_epatica;
    }

    public String getPatologia_epatica_dad1() {
        return patologia_epatica_dad1;
    }
    public void setPatologia_epatica_dad1(String patologia_epatica_dad1) {
        this.patologia_epatica_dad1 = patologia_epatica_dad1;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
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
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (resezione_epatica != null) {
            joiner.add("resezione_epatica: " + GraphQLRequestSerializer.getEntry(resezione_epatica));
        }
        if (stato_richiesta != null) {
            joiner.add("stato_richiesta: " + GraphQLRequestSerializer.getEntry(stato_richiesta));
        }
        if (termoablazione != null) {
            joiner.add("termoablazione: " + GraphQLRequestSerializer.getEntry(termoablazione));
        }
        if (trapianto_epatico != null) {
            joiner.add("trapianto_epatico: " + GraphQLRequestSerializer.getEntry(trapianto_epatico));
        }
        if (biopsia_epatica != null) {
            joiner.add("biopsia_epatica: " + GraphQLRequestSerializer.getEntry(biopsia_epatica));
        }
        if (patologia_epatica != null) {
            joiner.add("patologia_epatica: " + GraphQLRequestSerializer.getEntry(patologia_epatica));
        }
        if (patologia_epatica_dad1 != null) {
            joiner.add("patologia_epatica_dad1: " + GraphQLRequestSerializer.getEntry(patologia_epatica_dad1));
        }
        return joiner.toString();
    }

    public static CliEvento_epaticoCreateDTO.Builder builder() {
        return new CliEvento_epaticoCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private Boolean alcolizzazione;
        private String altra_eziologia;
        private String altra_procedura_chirurgica;
        private String altri_dettagli_istologia;
        private Boolean chemioembolizzazione;
        private String classificazione_child;
        private String commenti;
        private String data;
        private String data_ricezione;
        private String data_richiesta;
        private Boolean eziologia_alcool;
        private Boolean eziologia_farmaci;
        private Boolean eziologia_non_nota;
        private String note;
        private Boolean resezione_epatica;
        private String stato_richiesta;
        private Boolean termoablazione;
        private Boolean trapianto_epatico;
        private java.util.List<String> biopsia_epatica;
        private java.util.List<String> patologia_epatica;
        private String patologia_epatica_dad1;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
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

        public Builder setNote(String note) {
            this.note = note;
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

        public Builder setTermoablazione(Boolean termoablazione) {
            this.termoablazione = termoablazione;
            return this;
        }

        public Builder setTrapianto_epatico(Boolean trapianto_epatico) {
            this.trapianto_epatico = trapianto_epatico;
            return this;
        }

        public Builder setBiopsia_epatica(java.util.List<String> biopsia_epatica) {
            this.biopsia_epatica = biopsia_epatica;
            return this;
        }

        public Builder setPatologia_epatica(java.util.List<String> patologia_epatica) {
            this.patologia_epatica = patologia_epatica;
            return this;
        }

        public Builder setPatologia_epatica_dad1(String patologia_epatica_dad1) {
            this.patologia_epatica_dad1 = patologia_epatica_dad1;
            return this;
        }


        public CliEvento_epaticoCreateDTO build() {
            CliEvento_epaticoCreateDTO result = new CliEvento_epaticoCreateDTO();
            result.set_clientId(this._clientId);
            result.setAlcolizzazione(this.alcolizzazione);
            result.setAltra_eziologia(this.altra_eziologia);
            result.setAltra_procedura_chirurgica(this.altra_procedura_chirurgica);
            result.setAltri_dettagli_istologia(this.altri_dettagli_istologia);
            result.setChemioembolizzazione(this.chemioembolizzazione);
            result.setClassificazione_child(this.classificazione_child);
            result.setCommenti(this.commenti);
            result.setData(this.data);
            result.setData_ricezione(this.data_ricezione);
            result.setData_richiesta(this.data_richiesta);
            result.setEziologia_alcool(this.eziologia_alcool);
            result.setEziologia_farmaci(this.eziologia_farmaci);
            result.setEziologia_non_nota(this.eziologia_non_nota);
            result.setNote(this.note);
            result.setResezione_epatica(this.resezione_epatica);
            result.setStato_richiesta(this.stato_richiesta);
            result.setTermoablazione(this.termoablazione);
            result.setTrapianto_epatico(this.trapianto_epatico);
            result.setBiopsia_epatica(this.biopsia_epatica);
            result.setPatologia_epatica(this.patologia_epatica);
            result.setPatologia_epatica_dad1(this.patologia_epatica_dad1);
            return result;
        }

    }
}
