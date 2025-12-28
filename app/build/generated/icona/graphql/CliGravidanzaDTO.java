package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Gravidanza, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliGravidanzaDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String allattamento_seno1;
    private String allattamento_seno2;
    private String codice_centro;
    private String data_esito;
    private Integer eta_gestazionale;
    private Integer neonati;
    private String note;
    private String padre_hiv;
    private Integer peso1;
    private Integer peso2;
    private String probelma_ostetrico_specificare;
    private String problema_ostetrico_nome;
    private String sesso1;
    private String sesso2;
    private String ultima_mestruazione;
    private CliCodici_gravidanzaDTO anomalia;
    private CliCodici_gravidanzaDTO cariotipo1;
    private CliCodici_gravidanzaDTO cariotipo2;
    private CliCodici_gravidanzaDTO concepimento;
    private CliCodici_gravidanzaDTO esito;
    private CliCodici_gravidanzaDTO modalita;
    private CliCodici_gravidanzaDTO motivazione_interruzione;
    private CliCodici_gravidanzaDTO problema_ostetrico;
    private CliCodici_gravidanzaDTO procedura_invasiva;
    private CliPazienteDTO paziente_;

    public CliGravidanzaDTO() {
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
     * The attribute _id of Gravidanza. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Gravidanza. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute allattamento_seno1 of Gravidanza. It is of type String. Domain: Si OR No OR Non noto.}Max length: 20.
     */
    public String getAllattamento_seno1() {
        return allattamento_seno1;
    }
    /**
     * The attribute allattamento_seno1 of Gravidanza. It is of type String. Domain: Si OR No OR Non noto.}Max length: 20.
     */
    public void setAllattamento_seno1(String allattamento_seno1) {
        this.allattamento_seno1 = allattamento_seno1;
    }

    /**
     * The attribute allattamento_seno2 of Gravidanza. It is of type String. Domain: Si OR No OR Non noto.}Max length: 20.
     */
    public String getAllattamento_seno2() {
        return allattamento_seno2;
    }
    /**
     * The attribute allattamento_seno2 of Gravidanza. It is of type String. Domain: Si OR No OR Non noto.}Max length: 20.
     */
    public void setAllattamento_seno2(String allattamento_seno2) {
        this.allattamento_seno2 = allattamento_seno2;
    }

    /**
     * The attribute codice_centro of Gravidanza. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Gravidanza. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute data_esito of Gravidanza. It is of type Date @dateFormat.
     */
    public String getData_esito() {
        return data_esito;
    }
    /**
     * The attribute data_esito of Gravidanza. It is of type Date @dateFormat.
     */
    public void setData_esito(String data_esito) {
        this.data_esito = data_esito;
    }

    /**
     * The attribute eta_gestazionale of Gravidanza. It is of type Int.
     */
    public Integer getEta_gestazionale() {
        return eta_gestazionale;
    }
    /**
     * The attribute eta_gestazionale of Gravidanza. It is of type Int.
     */
    public void setEta_gestazionale(Integer eta_gestazionale) {
        this.eta_gestazionale = eta_gestazionale;
    }

    /**
     * The attribute neonati of Gravidanza. It is of type Int.
     */
    public Integer getNeonati() {
        return neonati;
    }
    /**
     * The attribute neonati of Gravidanza. It is of type Int.
     */
    public void setNeonati(Integer neonati) {
        this.neonati = neonati;
    }

    /**
     * The attribute note of Gravidanza. It is of type Text.
     */
    public String getNote() {
        return note;
    }
    /**
     * The attribute note of Gravidanza. It is of type Text.
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * The attribute padre_hiv of Gravidanza. It is of type String. Domain: Si OR No OR Non so.}Max length: 255.
     */
    public String getPadre_hiv() {
        return padre_hiv;
    }
    /**
     * The attribute padre_hiv of Gravidanza. It is of type String. Domain: Si OR No OR Non so.}Max length: 255.
     */
    public void setPadre_hiv(String padre_hiv) {
        this.padre_hiv = padre_hiv;
    }

    /**
     * The attribute peso1 of Gravidanza. It is of type Int.
     */
    public Integer getPeso1() {
        return peso1;
    }
    /**
     * The attribute peso1 of Gravidanza. It is of type Int.
     */
    public void setPeso1(Integer peso1) {
        this.peso1 = peso1;
    }

    /**
     * The attribute peso2 of Gravidanza. It is of type Int.
     */
    public Integer getPeso2() {
        return peso2;
    }
    /**
     * The attribute peso2 of Gravidanza. It is of type Int.
     */
    public void setPeso2(Integer peso2) {
        this.peso2 = peso2;
    }

    /**
     * The attribute probelma_ostetrico_specificare of Gravidanza. It is of type String. Max length: 255.
     */
    public String getProbelma_ostetrico_specificare() {
        return probelma_ostetrico_specificare;
    }
    /**
     * The attribute probelma_ostetrico_specificare of Gravidanza. It is of type String. Max length: 255.
     */
    public void setProbelma_ostetrico_specificare(String probelma_ostetrico_specificare) {
        this.probelma_ostetrico_specificare = probelma_ostetrico_specificare;
    }

    /**
     * The attribute problema_ostetrico_nome of Gravidanza. It is of type String. Path: problema_ostetrico nome.
     */
    public String getProblema_ostetrico_nome() {
        return problema_ostetrico_nome;
    }
    /**
     * The attribute problema_ostetrico_nome of Gravidanza. It is of type String. Path: problema_ostetrico nome.
     */
    public void setProblema_ostetrico_nome(String problema_ostetrico_nome) {
        this.problema_ostetrico_nome = problema_ostetrico_nome;
    }

    /**
     * The attribute sesso1 of Gravidanza. It is of type String. Domain: M OR F OR Non noto.}Max length: 20.
     */
    public String getSesso1() {
        return sesso1;
    }
    /**
     * The attribute sesso1 of Gravidanza. It is of type String. Domain: M OR F OR Non noto.}Max length: 20.
     */
    public void setSesso1(String sesso1) {
        this.sesso1 = sesso1;
    }

    /**
     * The attribute sesso2 of Gravidanza. It is of type String. Domain: M OR F OR Non noto.}Max length: 20.
     */
    public String getSesso2() {
        return sesso2;
    }
    /**
     * The attribute sesso2 of Gravidanza. It is of type String. Domain: M OR F OR Non noto.}Max length: 20.
     */
    public void setSesso2(String sesso2) {
        this.sesso2 = sesso2;
    }

    /**
     * The attribute ultima_mestruazione of Gravidanza. It is of type Date @dateFormat.
     */
    public String getUltima_mestruazione() {
        return ultima_mestruazione;
    }
    /**
     * The attribute ultima_mestruazione of Gravidanza. It is of type Date @dateFormat.
     */
    public void setUltima_mestruazione(String ultima_mestruazione) {
        this.ultima_mestruazione = ultima_mestruazione;
    }

    /**
     * The associated object for the role anomalia.
     */
    public CliCodici_gravidanzaDTO getAnomalia() {
        return anomalia;
    }
    /**
     * The associated object for the role anomalia.
     */
    public void setAnomalia(CliCodici_gravidanzaDTO anomalia) {
        this.anomalia = anomalia;
    }

    /**
     * The associated object for the role cariotipo1.
     */
    public CliCodici_gravidanzaDTO getCariotipo1() {
        return cariotipo1;
    }
    /**
     * The associated object for the role cariotipo1.
     */
    public void setCariotipo1(CliCodici_gravidanzaDTO cariotipo1) {
        this.cariotipo1 = cariotipo1;
    }

    /**
     * The associated object for the role cariotipo2.
     */
    public CliCodici_gravidanzaDTO getCariotipo2() {
        return cariotipo2;
    }
    /**
     * The associated object for the role cariotipo2.
     */
    public void setCariotipo2(CliCodici_gravidanzaDTO cariotipo2) {
        this.cariotipo2 = cariotipo2;
    }

    /**
     * The associated object for the role concepimento.
     */
    public CliCodici_gravidanzaDTO getConcepimento() {
        return concepimento;
    }
    /**
     * The associated object for the role concepimento.
     */
    public void setConcepimento(CliCodici_gravidanzaDTO concepimento) {
        this.concepimento = concepimento;
    }

    /**
     * The associated object for the role esito.
     */
    public CliCodici_gravidanzaDTO getEsito() {
        return esito;
    }
    /**
     * The associated object for the role esito.
     */
    public void setEsito(CliCodici_gravidanzaDTO esito) {
        this.esito = esito;
    }

    /**
     * The associated object for the role modalita.
     */
    public CliCodici_gravidanzaDTO getModalita() {
        return modalita;
    }
    /**
     * The associated object for the role modalita.
     */
    public void setModalita(CliCodici_gravidanzaDTO modalita) {
        this.modalita = modalita;
    }

    /**
     * The associated object for the role motivazione_interruzione.
     */
    public CliCodici_gravidanzaDTO getMotivazione_interruzione() {
        return motivazione_interruzione;
    }
    /**
     * The associated object for the role motivazione_interruzione.
     */
    public void setMotivazione_interruzione(CliCodici_gravidanzaDTO motivazione_interruzione) {
        this.motivazione_interruzione = motivazione_interruzione;
    }

    /**
     * The associated object for the role problema_ostetrico.
     */
    public CliCodici_gravidanzaDTO getProblema_ostetrico() {
        return problema_ostetrico;
    }
    /**
     * The associated object for the role problema_ostetrico.
     */
    public void setProblema_ostetrico(CliCodici_gravidanzaDTO problema_ostetrico) {
        this.problema_ostetrico = problema_ostetrico;
    }

    /**
     * The associated object for the role procedura_invasiva.
     */
    public CliCodici_gravidanzaDTO getProcedura_invasiva() {
        return procedura_invasiva;
    }
    /**
     * The associated object for the role procedura_invasiva.
     */
    public void setProcedura_invasiva(CliCodici_gravidanzaDTO procedura_invasiva) {
        this.procedura_invasiva = procedura_invasiva;
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
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (allattamento_seno1 != null) {
            joiner.add("allattamento_seno1: " + GraphQLRequestSerializer.getEntry(allattamento_seno1));
        }
        if (allattamento_seno2 != null) {
            joiner.add("allattamento_seno2: " + GraphQLRequestSerializer.getEntry(allattamento_seno2));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
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
        if (problema_ostetrico_nome != null) {
            joiner.add("problema_ostetrico_nome: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome));
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
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliGravidanzaDTO.Builder builder() {
        return new CliGravidanzaDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String allattamento_seno1;
        private String allattamento_seno2;
        private String codice_centro;
        private String data_esito;
        private Integer eta_gestazionale;
        private Integer neonati;
        private String note;
        private String padre_hiv;
        private Integer peso1;
        private Integer peso2;
        private String probelma_ostetrico_specificare;
        private String problema_ostetrico_nome;
        private String sesso1;
        private String sesso2;
        private String ultima_mestruazione;
        private CliCodici_gravidanzaDTO anomalia;
        private CliCodici_gravidanzaDTO cariotipo1;
        private CliCodici_gravidanzaDTO cariotipo2;
        private CliCodici_gravidanzaDTO concepimento;
        private CliCodici_gravidanzaDTO esito;
        private CliCodici_gravidanzaDTO modalita;
        private CliCodici_gravidanzaDTO motivazione_interruzione;
        private CliCodici_gravidanzaDTO problema_ostetrico;
        private CliCodici_gravidanzaDTO procedura_invasiva;
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
         * The attribute _id of Gravidanza. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute allattamento_seno1 of Gravidanza. It is of type String. Domain: Si OR No OR Non noto.}Max length: 20.
         */
        public Builder setAllattamento_seno1(String allattamento_seno1) {
            this.allattamento_seno1 = allattamento_seno1;
            return this;
        }

        /**
         * The attribute allattamento_seno2 of Gravidanza. It is of type String. Domain: Si OR No OR Non noto.}Max length: 20.
         */
        public Builder setAllattamento_seno2(String allattamento_seno2) {
            this.allattamento_seno2 = allattamento_seno2;
            return this;
        }

        /**
         * The attribute codice_centro of Gravidanza. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute data_esito of Gravidanza. It is of type Date @dateFormat.
         */
        public Builder setData_esito(String data_esito) {
            this.data_esito = data_esito;
            return this;
        }

        /**
         * The attribute eta_gestazionale of Gravidanza. It is of type Int.
         */
        public Builder setEta_gestazionale(Integer eta_gestazionale) {
            this.eta_gestazionale = eta_gestazionale;
            return this;
        }

        /**
         * The attribute neonati of Gravidanza. It is of type Int.
         */
        public Builder setNeonati(Integer neonati) {
            this.neonati = neonati;
            return this;
        }

        /**
         * The attribute note of Gravidanza. It is of type Text.
         */
        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        /**
         * The attribute padre_hiv of Gravidanza. It is of type String. Domain: Si OR No OR Non so.}Max length: 255.
         */
        public Builder setPadre_hiv(String padre_hiv) {
            this.padre_hiv = padre_hiv;
            return this;
        }

        /**
         * The attribute peso1 of Gravidanza. It is of type Int.
         */
        public Builder setPeso1(Integer peso1) {
            this.peso1 = peso1;
            return this;
        }

        /**
         * The attribute peso2 of Gravidanza. It is of type Int.
         */
        public Builder setPeso2(Integer peso2) {
            this.peso2 = peso2;
            return this;
        }

        /**
         * The attribute probelma_ostetrico_specificare of Gravidanza. It is of type String. Max length: 255.
         */
        public Builder setProbelma_ostetrico_specificare(String probelma_ostetrico_specificare) {
            this.probelma_ostetrico_specificare = probelma_ostetrico_specificare;
            return this;
        }

        /**
         * The attribute problema_ostetrico_nome of Gravidanza. It is of type String. Path: problema_ostetrico nome.
         */
        public Builder setProblema_ostetrico_nome(String problema_ostetrico_nome) {
            this.problema_ostetrico_nome = problema_ostetrico_nome;
            return this;
        }

        /**
         * The attribute sesso1 of Gravidanza. It is of type String. Domain: M OR F OR Non noto.}Max length: 20.
         */
        public Builder setSesso1(String sesso1) {
            this.sesso1 = sesso1;
            return this;
        }

        /**
         * The attribute sesso2 of Gravidanza. It is of type String. Domain: M OR F OR Non noto.}Max length: 20.
         */
        public Builder setSesso2(String sesso2) {
            this.sesso2 = sesso2;
            return this;
        }

        /**
         * The attribute ultima_mestruazione of Gravidanza. It is of type Date @dateFormat.
         */
        public Builder setUltima_mestruazione(String ultima_mestruazione) {
            this.ultima_mestruazione = ultima_mestruazione;
            return this;
        }

        /**
         * The associated object for the role anomalia.
         */
        public Builder setAnomalia(CliCodici_gravidanzaDTO anomalia) {
            this.anomalia = anomalia;
            return this;
        }

        /**
         * The associated object for the role cariotipo1.
         */
        public Builder setCariotipo1(CliCodici_gravidanzaDTO cariotipo1) {
            this.cariotipo1 = cariotipo1;
            return this;
        }

        /**
         * The associated object for the role cariotipo2.
         */
        public Builder setCariotipo2(CliCodici_gravidanzaDTO cariotipo2) {
            this.cariotipo2 = cariotipo2;
            return this;
        }

        /**
         * The associated object for the role concepimento.
         */
        public Builder setConcepimento(CliCodici_gravidanzaDTO concepimento) {
            this.concepimento = concepimento;
            return this;
        }

        /**
         * The associated object for the role esito.
         */
        public Builder setEsito(CliCodici_gravidanzaDTO esito) {
            this.esito = esito;
            return this;
        }

        /**
         * The associated object for the role modalita.
         */
        public Builder setModalita(CliCodici_gravidanzaDTO modalita) {
            this.modalita = modalita;
            return this;
        }

        /**
         * The associated object for the role motivazione_interruzione.
         */
        public Builder setMotivazione_interruzione(CliCodici_gravidanzaDTO motivazione_interruzione) {
            this.motivazione_interruzione = motivazione_interruzione;
            return this;
        }

        /**
         * The associated object for the role problema_ostetrico.
         */
        public Builder setProblema_ostetrico(CliCodici_gravidanzaDTO problema_ostetrico) {
            this.problema_ostetrico = problema_ostetrico;
            return this;
        }

        /**
         * The associated object for the role procedura_invasiva.
         */
        public Builder setProcedura_invasiva(CliCodici_gravidanzaDTO procedura_invasiva) {
            this.procedura_invasiva = procedura_invasiva;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliGravidanzaDTO build() {
            CliGravidanzaDTO result = new CliGravidanzaDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAllattamento_seno1(this.allattamento_seno1);
            result.setAllattamento_seno2(this.allattamento_seno2);
            result.setCodice_centro(this.codice_centro);
            result.setData_esito(this.data_esito);
            result.setEta_gestazionale(this.eta_gestazionale);
            result.setNeonati(this.neonati);
            result.setNote(this.note);
            result.setPadre_hiv(this.padre_hiv);
            result.setPeso1(this.peso1);
            result.setPeso2(this.peso2);
            result.setProbelma_ostetrico_specificare(this.probelma_ostetrico_specificare);
            result.setProblema_ostetrico_nome(this.problema_ostetrico_nome);
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
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
