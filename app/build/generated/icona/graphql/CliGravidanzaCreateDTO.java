package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of Gravidanza.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliGravidanzaCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String allattamento_seno1;
    private String allattamento_seno2;
    private String data_esito;
    private Integer eta_gestazionale;
    private Integer neonati;
    private String note;
    private String padre_hiv;
    private Integer peso1;
    private Integer peso2;
    private String probelma_ostetrico_specificare;
    private String sesso1;
    private String sesso2;
    private String ultima_mestruazione;
    private String anomalia;
    private String cariotipo1;
    private String cariotipo2;
    private String concepimento;
    private String esito;
    private String modalita;
    private String motivazione_interruzione;
    private String problema_ostetrico;
    private String procedura_invasiva;

    public CliGravidanzaCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public String getAllattamento_seno1() {
        return allattamento_seno1;
    }
    public void setAllattamento_seno1(String allattamento_seno1) {
        this.allattamento_seno1 = allattamento_seno1;
    }

    public String getAllattamento_seno2() {
        return allattamento_seno2;
    }
    public void setAllattamento_seno2(String allattamento_seno2) {
        this.allattamento_seno2 = allattamento_seno2;
    }

    public String getData_esito() {
        return data_esito;
    }
    public void setData_esito(String data_esito) {
        this.data_esito = data_esito;
    }

    public Integer getEta_gestazionale() {
        return eta_gestazionale;
    }
    public void setEta_gestazionale(Integer eta_gestazionale) {
        this.eta_gestazionale = eta_gestazionale;
    }

    public Integer getNeonati() {
        return neonati;
    }
    public void setNeonati(Integer neonati) {
        this.neonati = neonati;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public String getPadre_hiv() {
        return padre_hiv;
    }
    public void setPadre_hiv(String padre_hiv) {
        this.padre_hiv = padre_hiv;
    }

    public Integer getPeso1() {
        return peso1;
    }
    public void setPeso1(Integer peso1) {
        this.peso1 = peso1;
    }

    public Integer getPeso2() {
        return peso2;
    }
    public void setPeso2(Integer peso2) {
        this.peso2 = peso2;
    }

    public String getProbelma_ostetrico_specificare() {
        return probelma_ostetrico_specificare;
    }
    public void setProbelma_ostetrico_specificare(String probelma_ostetrico_specificare) {
        this.probelma_ostetrico_specificare = probelma_ostetrico_specificare;
    }

    public String getSesso1() {
        return sesso1;
    }
    public void setSesso1(String sesso1) {
        this.sesso1 = sesso1;
    }

    public String getSesso2() {
        return sesso2;
    }
    public void setSesso2(String sesso2) {
        this.sesso2 = sesso2;
    }

    public String getUltima_mestruazione() {
        return ultima_mestruazione;
    }
    public void setUltima_mestruazione(String ultima_mestruazione) {
        this.ultima_mestruazione = ultima_mestruazione;
    }

    public String getAnomalia() {
        return anomalia;
    }
    public void setAnomalia(String anomalia) {
        this.anomalia = anomalia;
    }

    public String getCariotipo1() {
        return cariotipo1;
    }
    public void setCariotipo1(String cariotipo1) {
        this.cariotipo1 = cariotipo1;
    }

    public String getCariotipo2() {
        return cariotipo2;
    }
    public void setCariotipo2(String cariotipo2) {
        this.cariotipo2 = cariotipo2;
    }

    public String getConcepimento() {
        return concepimento;
    }
    public void setConcepimento(String concepimento) {
        this.concepimento = concepimento;
    }

    public String getEsito() {
        return esito;
    }
    public void setEsito(String esito) {
        this.esito = esito;
    }

    public String getModalita() {
        return modalita;
    }
    public void setModalita(String modalita) {
        this.modalita = modalita;
    }

    public String getMotivazione_interruzione() {
        return motivazione_interruzione;
    }
    public void setMotivazione_interruzione(String motivazione_interruzione) {
        this.motivazione_interruzione = motivazione_interruzione;
    }

    public String getProblema_ostetrico() {
        return problema_ostetrico;
    }
    public void setProblema_ostetrico(String problema_ostetrico) {
        this.problema_ostetrico = problema_ostetrico;
    }

    public String getProcedura_invasiva() {
        return procedura_invasiva;
    }
    public void setProcedura_invasiva(String procedura_invasiva) {
        this.procedura_invasiva = procedura_invasiva;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (allattamento_seno1 != null) {
            joiner.add("allattamento_seno1: " + GraphQLRequestSerializer.getEntry(allattamento_seno1));
        }
        if (allattamento_seno2 != null) {
            joiner.add("allattamento_seno2: " + GraphQLRequestSerializer.getEntry(allattamento_seno2));
        }
        if (data_esito != null) {
            joiner.add("data_esito: " + GraphQLRequestSerializer.getEntry(data_esito));
        }
        if (eta_gestazionale != null) {
            joiner.add("eta_gestazionale: " + GraphQLRequestSerializer.getEntry(eta_gestazionale));
        }
        if (neonati != null) {
            joiner.add("neonati: " + GraphQLRequestSerializer.getEntry(neonati));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (padre_hiv != null) {
            joiner.add("padre_hiv: " + GraphQLRequestSerializer.getEntry(padre_hiv));
        }
        if (peso1 != null) {
            joiner.add("peso1: " + GraphQLRequestSerializer.getEntry(peso1));
        }
        if (peso2 != null) {
            joiner.add("peso2: " + GraphQLRequestSerializer.getEntry(peso2));
        }
        if (probelma_ostetrico_specificare != null) {
            joiner.add("probelma_ostetrico_specificare: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare));
        }
        if (sesso1 != null) {
            joiner.add("sesso1: " + GraphQLRequestSerializer.getEntry(sesso1));
        }
        if (sesso2 != null) {
            joiner.add("sesso2: " + GraphQLRequestSerializer.getEntry(sesso2));
        }
        if (ultima_mestruazione != null) {
            joiner.add("ultima_mestruazione: " + GraphQLRequestSerializer.getEntry(ultima_mestruazione));
        }
        if (anomalia != null) {
            joiner.add("anomalia: " + GraphQLRequestSerializer.getEntry(anomalia));
        }
        if (cariotipo1 != null) {
            joiner.add("cariotipo1: " + GraphQLRequestSerializer.getEntry(cariotipo1));
        }
        if (cariotipo2 != null) {
            joiner.add("cariotipo2: " + GraphQLRequestSerializer.getEntry(cariotipo2));
        }
        if (concepimento != null) {
            joiner.add("concepimento: " + GraphQLRequestSerializer.getEntry(concepimento));
        }
        if (esito != null) {
            joiner.add("esito: " + GraphQLRequestSerializer.getEntry(esito));
        }
        if (modalita != null) {
            joiner.add("modalita: " + GraphQLRequestSerializer.getEntry(modalita));
        }
        if (motivazione_interruzione != null) {
            joiner.add("motivazione_interruzione: " + GraphQLRequestSerializer.getEntry(motivazione_interruzione));
        }
        if (problema_ostetrico != null) {
            joiner.add("problema_ostetrico: " + GraphQLRequestSerializer.getEntry(problema_ostetrico));
        }
        if (procedura_invasiva != null) {
            joiner.add("procedura_invasiva: " + GraphQLRequestSerializer.getEntry(procedura_invasiva));
        }
        return joiner.toString();
    }

    public static CliGravidanzaCreateDTO.Builder builder() {
        return new CliGravidanzaCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId;
        private String allattamento_seno1;
        private String allattamento_seno2;
        private String data_esito;
        private Integer eta_gestazionale;
        private Integer neonati;
        private String note;
        private String padre_hiv;
        private Integer peso1;
        private Integer peso2;
        private String probelma_ostetrico_specificare;
        private String sesso1;
        private String sesso2;
        private String ultima_mestruazione;
        private String anomalia;
        private String cariotipo1;
        private String cariotipo2;
        private String concepimento;
        private String esito;
        private String modalita;
        private String motivazione_interruzione;
        private String problema_ostetrico;
        private String procedura_invasiva;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setAllattamento_seno1(String allattamento_seno1) {
            this.allattamento_seno1 = allattamento_seno1;
            return this;
        }

        public Builder setAllattamento_seno2(String allattamento_seno2) {
            this.allattamento_seno2 = allattamento_seno2;
            return this;
        }

        public Builder setData_esito(String data_esito) {
            this.data_esito = data_esito;
            return this;
        }

        public Builder setEta_gestazionale(Integer eta_gestazionale) {
            this.eta_gestazionale = eta_gestazionale;
            return this;
        }

        public Builder setNeonati(Integer neonati) {
            this.neonati = neonati;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setPadre_hiv(String padre_hiv) {
            this.padre_hiv = padre_hiv;
            return this;
        }

        public Builder setPeso1(Integer peso1) {
            this.peso1 = peso1;
            return this;
        }

        public Builder setPeso2(Integer peso2) {
            this.peso2 = peso2;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare(String probelma_ostetrico_specificare) {
            this.probelma_ostetrico_specificare = probelma_ostetrico_specificare;
            return this;
        }

        public Builder setSesso1(String sesso1) {
            this.sesso1 = sesso1;
            return this;
        }

        public Builder setSesso2(String sesso2) {
            this.sesso2 = sesso2;
            return this;
        }

        public Builder setUltima_mestruazione(String ultima_mestruazione) {
            this.ultima_mestruazione = ultima_mestruazione;
            return this;
        }

        public Builder setAnomalia(String anomalia) {
            this.anomalia = anomalia;
            return this;
        }

        public Builder setCariotipo1(String cariotipo1) {
            this.cariotipo1 = cariotipo1;
            return this;
        }

        public Builder setCariotipo2(String cariotipo2) {
            this.cariotipo2 = cariotipo2;
            return this;
        }

        public Builder setConcepimento(String concepimento) {
            this.concepimento = concepimento;
            return this;
        }

        public Builder setEsito(String esito) {
            this.esito = esito;
            return this;
        }

        public Builder setModalita(String modalita) {
            this.modalita = modalita;
            return this;
        }

        public Builder setMotivazione_interruzione(String motivazione_interruzione) {
            this.motivazione_interruzione = motivazione_interruzione;
            return this;
        }

        public Builder setProblema_ostetrico(String problema_ostetrico) {
            this.problema_ostetrico = problema_ostetrico;
            return this;
        }

        public Builder setProcedura_invasiva(String procedura_invasiva) {
            this.procedura_invasiva = procedura_invasiva;
            return this;
        }


        public CliGravidanzaCreateDTO build() {
            CliGravidanzaCreateDTO result = new CliGravidanzaCreateDTO();
            result.set_clientId(this._clientId);
            result.setAllattamento_seno1(this.allattamento_seno1);
            result.setAllattamento_seno2(this.allattamento_seno2);
            result.setData_esito(this.data_esito);
            result.setEta_gestazionale(this.eta_gestazionale);
            result.setNeonati(this.neonati);
            result.setNote(this.note);
            result.setPadre_hiv(this.padre_hiv);
            result.setPeso1(this.peso1);
            result.setPeso2(this.peso2);
            result.setProbelma_ostetrico_specificare(this.probelma_ostetrico_specificare);
            result.setSesso1(this.sesso1);
            result.setSesso2(this.sesso2);
            result.setUltima_mestruazione(this.ultima_mestruazione);
            result.setAnomalia(this.anomalia);
            result.setCariotipo1(this.cariotipo1);
            result.setCariotipo2(this.cariotipo2);
            result.setConcepimento(this.concepimento);
            result.setEsito(this.esito);
            result.setModalita(this.modalita);
            result.setMotivazione_interruzione(this.motivazione_interruzione);
            result.setProblema_ostetrico(this.problema_ostetrico);
            result.setProcedura_invasiva(this.procedura_invasiva);
            return result;
        }

    }
}
