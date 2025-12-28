package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class C_dettaglio, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliC_dettaglioDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Boolean anosmia_disgeusia;
    private String bmi;
    private Integer cd4_diagnosi_covid;
    private String cdc;
    private Integer d_dimero;
    private String data_cd4_diagnosi_covid;
    private String data_esami_ingresso;
    private String data_hivrna_diagnosi_covid;
    private String data_max_ventilazione;
    private String data_ospedalizzazione;
    private String data_rianimazione;
    private String data_tampone;
    private String data_ultimo_contatto;
    private Integer ferritina;
    private Integer frequenza_resp;
    private String fumatore;
    private Integer hivrna_diagnosi_covid;
    private Integer ldh;
    private Integer leucociti;
    private Integer linfociti;
    private Boolean obeso;
    private Boolean ospedalizzazione;
    private String outcome_altro;
    private Integer pcr;
    private String po2_fio2_ingresso;
    private Boolean rianimazione;
    private String sintomi_altro;
    private String spo2_ingresso;
    private CliLivello_ventilazione_covidDTO livello_ventilazione_covid_;
    private CliOutcome_covidDTO outcome_covid_;
    private CliH_PazienteDTO h_Paziente_;
    private CliPazienteDTO paziente_;

    public CliC_dettaglioDTO() {
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
     * The attribute _id of C_dettaglio. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of C_dettaglio. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute anosmia_disgeusia of C_dettaglio. It is of type Boolean.
     */
    public Boolean getAnosmia_disgeusia() {
        return anosmia_disgeusia;
    }
    /**
     * The attribute anosmia_disgeusia of C_dettaglio. It is of type Boolean.
     */
    public void setAnosmia_disgeusia(Boolean anosmia_disgeusia) {
        this.anosmia_disgeusia = anosmia_disgeusia;
    }

    /**
     * The attribute bmi of C_dettaglio. It is of type Real @realFormat.
     */
    public String getBmi() {
        return bmi;
    }
    /**
     * The attribute bmi of C_dettaglio. It is of type Real @realFormat.
     */
    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    /**
     * The attribute cd4_diagnosi_covid of C_dettaglio. It is of type Int.
     */
    public Integer getCd4_diagnosi_covid() {
        return cd4_diagnosi_covid;
    }
    /**
     * The attribute cd4_diagnosi_covid of C_dettaglio. It is of type Int.
     */
    public void setCd4_diagnosi_covid(Integer cd4_diagnosi_covid) {
        this.cd4_diagnosi_covid = cd4_diagnosi_covid;
    }

    /**
     * The attribute cdc of C_dettaglio. It is of type String. Domain: A OR B OR C.}Max length: 255.
     */
    public String getCdc() {
        return cdc;
    }
    /**
     * The attribute cdc of C_dettaglio. It is of type String. Domain: A OR B OR C.}Max length: 255.
     */
    public void setCdc(String cdc) {
        this.cdc = cdc;
    }

    /**
     * The attribute d_dimero of C_dettaglio. It is of type Int.
     */
    public Integer getD_dimero() {
        return d_dimero;
    }
    /**
     * The attribute d_dimero of C_dettaglio. It is of type Int.
     */
    public void setD_dimero(Integer d_dimero) {
        this.d_dimero = d_dimero;
    }

    /**
     * The attribute data_cd4_diagnosi_covid of C_dettaglio. It is of type Date @dateFormat.
     */
    public String getData_cd4_diagnosi_covid() {
        return data_cd4_diagnosi_covid;
    }
    /**
     * The attribute data_cd4_diagnosi_covid of C_dettaglio. It is of type Date @dateFormat.
     */
    public void setData_cd4_diagnosi_covid(String data_cd4_diagnosi_covid) {
        this.data_cd4_diagnosi_covid = data_cd4_diagnosi_covid;
    }

    /**
     * The attribute data_esami_ingresso of C_dettaglio. It is of type Date @dateFormat.
     */
    public String getData_esami_ingresso() {
        return data_esami_ingresso;
    }
    /**
     * The attribute data_esami_ingresso of C_dettaglio. It is of type Date @dateFormat.
     */
    public void setData_esami_ingresso(String data_esami_ingresso) {
        this.data_esami_ingresso = data_esami_ingresso;
    }

    /**
     * The attribute data_hivrna_diagnosi_covid of C_dettaglio. It is of type Date @dateFormat.
     */
    public String getData_hivrna_diagnosi_covid() {
        return data_hivrna_diagnosi_covid;
    }
    /**
     * The attribute data_hivrna_diagnosi_covid of C_dettaglio. It is of type Date @dateFormat.
     */
    public void setData_hivrna_diagnosi_covid(String data_hivrna_diagnosi_covid) {
        this.data_hivrna_diagnosi_covid = data_hivrna_diagnosi_covid;
    }

    /**
     * The attribute data_max_ventilazione of C_dettaglio. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData_max_ventilazione() {
        return data_max_ventilazione;
    }
    /**
     * The attribute data_max_ventilazione of C_dettaglio. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData_max_ventilazione(String data_max_ventilazione) {
        this.data_max_ventilazione = data_max_ventilazione;
    }

    /**
     * The attribute data_ospedalizzazione of C_dettaglio. It is of type Date @dateFormat.
     */
    public String getData_ospedalizzazione() {
        return data_ospedalizzazione;
    }
    /**
     * The attribute data_ospedalizzazione of C_dettaglio. It is of type Date @dateFormat.
     */
    public void setData_ospedalizzazione(String data_ospedalizzazione) {
        this.data_ospedalizzazione = data_ospedalizzazione;
    }

    /**
     * The attribute data_rianimazione of C_dettaglio. It is of type Date @dateFormat.
     */
    public String getData_rianimazione() {
        return data_rianimazione;
    }
    /**
     * The attribute data_rianimazione of C_dettaglio. It is of type Date @dateFormat.
     */
    public void setData_rianimazione(String data_rianimazione) {
        this.data_rianimazione = data_rianimazione;
    }

    /**
     * The attribute data_tampone of C_dettaglio. It is of type Date @dateFormat.
     */
    public String getData_tampone() {
        return data_tampone;
    }
    /**
     * The attribute data_tampone of C_dettaglio. It is of type Date @dateFormat.
     */
    public void setData_tampone(String data_tampone) {
        this.data_tampone = data_tampone;
    }

    /**
     * The attribute data_ultimo_contatto of C_dettaglio. It is of type Date @dateFormat.
     */
    public String getData_ultimo_contatto() {
        return data_ultimo_contatto;
    }
    /**
     * The attribute data_ultimo_contatto of C_dettaglio. It is of type Date @dateFormat.
     */
    public void setData_ultimo_contatto(String data_ultimo_contatto) {
        this.data_ultimo_contatto = data_ultimo_contatto;
    }

    /**
     * The attribute ferritina of C_dettaglio. It is of type Int.
     */
    public Integer getFerritina() {
        return ferritina;
    }
    /**
     * The attribute ferritina of C_dettaglio. It is of type Int.
     */
    public void setFerritina(Integer ferritina) {
        this.ferritina = ferritina;
    }

    /**
     * The attribute frequenza_resp of C_dettaglio. It is of type Int.
     */
    public Integer getFrequenza_resp() {
        return frequenza_resp;
    }
    /**
     * The attribute frequenza_resp of C_dettaglio. It is of type Int.
     */
    public void setFrequenza_resp(Integer frequenza_resp) {
        this.frequenza_resp = frequenza_resp;
    }

    /**
     * The attribute fumatore of C_dettaglio. It is of type String. Domain: Attivo OR Pregresso OR Non fumatore OR Sconosciuto.}Max length: 255.
     */
    public String getFumatore() {
        return fumatore;
    }
    /**
     * The attribute fumatore of C_dettaglio. It is of type String. Domain: Attivo OR Pregresso OR Non fumatore OR Sconosciuto.}Max length: 255.
     */
    public void setFumatore(String fumatore) {
        this.fumatore = fumatore;
    }

    /**
     * The attribute hivrna_diagnosi_covid of C_dettaglio. It is of type Int.
     */
    public Integer getHivrna_diagnosi_covid() {
        return hivrna_diagnosi_covid;
    }
    /**
     * The attribute hivrna_diagnosi_covid of C_dettaglio. It is of type Int.
     */
    public void setHivrna_diagnosi_covid(Integer hivrna_diagnosi_covid) {
        this.hivrna_diagnosi_covid = hivrna_diagnosi_covid;
    }

    /**
     * The attribute ldh of C_dettaglio. It is of type Int.
     */
    public Integer getLdh() {
        return ldh;
    }
    /**
     * The attribute ldh of C_dettaglio. It is of type Int.
     */
    public void setLdh(Integer ldh) {
        this.ldh = ldh;
    }

    /**
     * The attribute leucociti of C_dettaglio. It is of type Int.
     */
    public Integer getLeucociti() {
        return leucociti;
    }
    /**
     * The attribute leucociti of C_dettaglio. It is of type Int.
     */
    public void setLeucociti(Integer leucociti) {
        this.leucociti = leucociti;
    }

    /**
     * The attribute linfociti of C_dettaglio. It is of type Int.
     */
    public Integer getLinfociti() {
        return linfociti;
    }
    /**
     * The attribute linfociti of C_dettaglio. It is of type Int.
     */
    public void setLinfociti(Integer linfociti) {
        this.linfociti = linfociti;
    }

    /**
     * The attribute obeso of C_dettaglio. It is of type Boolean.
     */
    public Boolean getObeso() {
        return obeso;
    }
    /**
     * The attribute obeso of C_dettaglio. It is of type Boolean.
     */
    public void setObeso(Boolean obeso) {
        this.obeso = obeso;
    }

    /**
     * The attribute ospedalizzazione of C_dettaglio. It is of type Boolean. Cannot be null.
     */
    public Boolean getOspedalizzazione() {
        return ospedalizzazione;
    }
    /**
     * The attribute ospedalizzazione of C_dettaglio. It is of type Boolean. Cannot be null.
     */
    public void setOspedalizzazione(Boolean ospedalizzazione) {
        this.ospedalizzazione = ospedalizzazione;
    }

    /**
     * The attribute outcome_altro of C_dettaglio. It is of type Text.
     */
    public String getOutcome_altro() {
        return outcome_altro;
    }
    /**
     * The attribute outcome_altro of C_dettaglio. It is of type Text.
     */
    public void setOutcome_altro(String outcome_altro) {
        this.outcome_altro = outcome_altro;
    }

    /**
     * The attribute pcr of C_dettaglio. It is of type Int.
     */
    public Integer getPcr() {
        return pcr;
    }
    /**
     * The attribute pcr of C_dettaglio. It is of type Int.
     */
    public void setPcr(Integer pcr) {
        this.pcr = pcr;
    }

    /**
     * The attribute po2_fio2_ingresso of C_dettaglio. It is of type Real @realFormat.
     */
    public String getPo2_fio2_ingresso() {
        return po2_fio2_ingresso;
    }
    /**
     * The attribute po2_fio2_ingresso of C_dettaglio. It is of type Real @realFormat.
     */
    public void setPo2_fio2_ingresso(String po2_fio2_ingresso) {
        this.po2_fio2_ingresso = po2_fio2_ingresso;
    }

    /**
     * The attribute rianimazione of C_dettaglio. It is of type Boolean. Cannot be null.
     */
    public Boolean getRianimazione() {
        return rianimazione;
    }
    /**
     * The attribute rianimazione of C_dettaglio. It is of type Boolean. Cannot be null.
     */
    public void setRianimazione(Boolean rianimazione) {
        this.rianimazione = rianimazione;
    }

    /**
     * The attribute sintomi_altro of C_dettaglio. It is of type Text.
     */
    public String getSintomi_altro() {
        return sintomi_altro;
    }
    /**
     * The attribute sintomi_altro of C_dettaglio. It is of type Text.
     */
    public void setSintomi_altro(String sintomi_altro) {
        this.sintomi_altro = sintomi_altro;
    }

    /**
     * The attribute spo2_ingresso of C_dettaglio. It is of type String. Domain: Aria Ambiente OR O2.}Max length: 255.
     */
    public String getSpo2_ingresso() {
        return spo2_ingresso;
    }
    /**
     * The attribute spo2_ingresso of C_dettaglio. It is of type String. Domain: Aria Ambiente OR O2.}Max length: 255.
     */
    public void setSpo2_ingresso(String spo2_ingresso) {
        this.spo2_ingresso = spo2_ingresso;
    }

    /**
     * The associated object for the role livello_ventilazione_covid_.
     */
    public CliLivello_ventilazione_covidDTO getLivello_ventilazione_covid_() {
        return livello_ventilazione_covid_;
    }
    /**
     * The associated object for the role livello_ventilazione_covid_.
     */
    public void setLivello_ventilazione_covid_(CliLivello_ventilazione_covidDTO livello_ventilazione_covid_) {
        this.livello_ventilazione_covid_ = livello_ventilazione_covid_;
    }

    /**
     * The associated object for the role outcome_covid_.
     */
    public CliOutcome_covidDTO getOutcome_covid_() {
        return outcome_covid_;
    }
    /**
     * The associated object for the role outcome_covid_.
     */
    public void setOutcome_covid_(CliOutcome_covidDTO outcome_covid_) {
        this.outcome_covid_ = outcome_covid_;
    }

    /**
     * The associated object for the role h_Paziente_.
     */
    public CliH_PazienteDTO getH_Paziente_() {
        return h_Paziente_;
    }
    /**
     * The associated object for the role h_Paziente_.
     */
    public void setH_Paziente_(CliH_PazienteDTO h_Paziente_) {
        this.h_Paziente_ = h_Paziente_;
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
        if (anosmia_disgeusia != null) {
            joiner.add("anosmia_disgeusia: " + GraphQLRequestSerializer.getEntry(anosmia_disgeusia));
        }
        if (bmi != null) {
            joiner.add("bmi: " + GraphQLRequestSerializer.getEntry(bmi));
        }
        if (cd4_diagnosi_covid != null) {
            joiner.add("cd4_diagnosi_covid: " + GraphQLRequestSerializer.getEntry(cd4_diagnosi_covid));
        }
        if (cdc != null) {
            joiner.add("cdc: " + GraphQLRequestSerializer.getEntry(cdc));
        }
        if (d_dimero != null) {
            joiner.add("d_dimero: " + GraphQLRequestSerializer.getEntry(d_dimero));
        }
        if (data_cd4_diagnosi_covid != null) {
            joiner.add("data_cd4_diagnosi_covid: " + GraphQLRequestSerializer.getEntry(data_cd4_diagnosi_covid));
        }
        if (data_esami_ingresso != null) {
            joiner.add("data_esami_ingresso: " + GraphQLRequestSerializer.getEntry(data_esami_ingresso));
        }
        if (data_hivrna_diagnosi_covid != null) {
            joiner.add("data_hivrna_diagnosi_covid: " + GraphQLRequestSerializer.getEntry(data_hivrna_diagnosi_covid));
        }
        if (data_max_ventilazione != null) {
            joiner.add("data_max_ventilazione: " + GraphQLRequestSerializer.getEntry(data_max_ventilazione));
        }
        if (data_ospedalizzazione != null) {
            joiner.add("data_ospedalizzazione: " + GraphQLRequestSerializer.getEntry(data_ospedalizzazione));
        }
        if (data_rianimazione != null) {
            joiner.add("data_rianimazione: " + GraphQLRequestSerializer.getEntry(data_rianimazione));
        }
        if (data_tampone != null) {
            joiner.add("data_tampone: " + GraphQLRequestSerializer.getEntry(data_tampone));
        }
        if (data_ultimo_contatto != null) {
            joiner.add("data_ultimo_contatto: " + GraphQLRequestSerializer.getEntry(data_ultimo_contatto));
        }
        if (ferritina != null) {
            joiner.add("ferritina: " + GraphQLRequestSerializer.getEntry(ferritina));
        }
        if (frequenza_resp != null) {
            joiner.add("frequenza_resp: " + GraphQLRequestSerializer.getEntry(frequenza_resp));
        }
        if (fumatore != null) {
            joiner.add("fumatore: " + GraphQLRequestSerializer.getEntry(fumatore));
        }
        if (hivrna_diagnosi_covid != null) {
            joiner.add("hivrna_diagnosi_covid: " + GraphQLRequestSerializer.getEntry(hivrna_diagnosi_covid));
        }
        if (ldh != null) {
            joiner.add("ldh: " + GraphQLRequestSerializer.getEntry(ldh));
        }
        if (leucociti != null) {
            joiner.add("leucociti: " + GraphQLRequestSerializer.getEntry(leucociti));
        }
        if (linfociti != null) {
            joiner.add("linfociti: " + GraphQLRequestSerializer.getEntry(linfociti));
        }
        if (obeso != null) {
            joiner.add("obeso: " + GraphQLRequestSerializer.getEntry(obeso));
        }
        if (ospedalizzazione != null) {
            joiner.add("ospedalizzazione: " + GraphQLRequestSerializer.getEntry(ospedalizzazione));
        }
        if (outcome_altro != null) {
            joiner.add("outcome_altro: " + GraphQLRequestSerializer.getEntry(outcome_altro));
        }
        if (pcr != null) {
            joiner.add("pcr: " + GraphQLRequestSerializer.getEntry(pcr));
        }
        if (po2_fio2_ingresso != null) {
            joiner.add("po2_fio2_ingresso: " + GraphQLRequestSerializer.getEntry(po2_fio2_ingresso));
        }
        if (rianimazione != null) {
            joiner.add("rianimazione: " + GraphQLRequestSerializer.getEntry(rianimazione));
        }
        if (sintomi_altro != null) {
            joiner.add("sintomi_altro: " + GraphQLRequestSerializer.getEntry(sintomi_altro));
        }
        if (spo2_ingresso != null) {
            joiner.add("spo2_ingresso: " + GraphQLRequestSerializer.getEntry(spo2_ingresso));
        }
        if (livello_ventilazione_covid_ != null) {
            joiner.add("livello_ventilazione_covid_: " + GraphQLRequestSerializer.getEntry(livello_ventilazione_covid_));
        }
        if (outcome_covid_ != null) {
            joiner.add("outcome_covid_: " + GraphQLRequestSerializer.getEntry(outcome_covid_));
        }
        if (h_Paziente_ != null) {
            joiner.add("h_Paziente_: " + GraphQLRequestSerializer.getEntry(h_Paziente_));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliC_dettaglioDTO.Builder builder() {
        return new CliC_dettaglioDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Boolean anosmia_disgeusia;
        private String bmi;
        private Integer cd4_diagnosi_covid;
        private String cdc;
        private Integer d_dimero;
        private String data_cd4_diagnosi_covid;
        private String data_esami_ingresso;
        private String data_hivrna_diagnosi_covid;
        private String data_max_ventilazione;
        private String data_ospedalizzazione;
        private String data_rianimazione;
        private String data_tampone;
        private String data_ultimo_contatto;
        private Integer ferritina;
        private Integer frequenza_resp;
        private String fumatore;
        private Integer hivrna_diagnosi_covid;
        private Integer ldh;
        private Integer leucociti;
        private Integer linfociti;
        private Boolean obeso;
        private Boolean ospedalizzazione;
        private String outcome_altro;
        private Integer pcr;
        private String po2_fio2_ingresso;
        private Boolean rianimazione;
        private String sintomi_altro;
        private String spo2_ingresso;
        private CliLivello_ventilazione_covidDTO livello_ventilazione_covid_;
        private CliOutcome_covidDTO outcome_covid_;
        private CliH_PazienteDTO h_Paziente_;
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
         * The attribute _id of C_dettaglio. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute anosmia_disgeusia of C_dettaglio. It is of type Boolean.
         */
        public Builder setAnosmia_disgeusia(Boolean anosmia_disgeusia) {
            this.anosmia_disgeusia = anosmia_disgeusia;
            return this;
        }

        /**
         * The attribute bmi of C_dettaglio. It is of type Real @realFormat.
         */
        public Builder setBmi(String bmi) {
            this.bmi = bmi;
            return this;
        }

        /**
         * The attribute cd4_diagnosi_covid of C_dettaglio. It is of type Int.
         */
        public Builder setCd4_diagnosi_covid(Integer cd4_diagnosi_covid) {
            this.cd4_diagnosi_covid = cd4_diagnosi_covid;
            return this;
        }

        /**
         * The attribute cdc of C_dettaglio. It is of type String. Domain: A OR B OR C.}Max length: 255.
         */
        public Builder setCdc(String cdc) {
            this.cdc = cdc;
            return this;
        }

        /**
         * The attribute d_dimero of C_dettaglio. It is of type Int.
         */
        public Builder setD_dimero(Integer d_dimero) {
            this.d_dimero = d_dimero;
            return this;
        }

        /**
         * The attribute data_cd4_diagnosi_covid of C_dettaglio. It is of type Date @dateFormat.
         */
        public Builder setData_cd4_diagnosi_covid(String data_cd4_diagnosi_covid) {
            this.data_cd4_diagnosi_covid = data_cd4_diagnosi_covid;
            return this;
        }

        /**
         * The attribute data_esami_ingresso of C_dettaglio. It is of type Date @dateFormat.
         */
        public Builder setData_esami_ingresso(String data_esami_ingresso) {
            this.data_esami_ingresso = data_esami_ingresso;
            return this;
        }

        /**
         * The attribute data_hivrna_diagnosi_covid of C_dettaglio. It is of type Date @dateFormat.
         */
        public Builder setData_hivrna_diagnosi_covid(String data_hivrna_diagnosi_covid) {
            this.data_hivrna_diagnosi_covid = data_hivrna_diagnosi_covid;
            return this;
        }

        /**
         * The attribute data_max_ventilazione of C_dettaglio. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData_max_ventilazione(String data_max_ventilazione) {
            this.data_max_ventilazione = data_max_ventilazione;
            return this;
        }

        /**
         * The attribute data_ospedalizzazione of C_dettaglio. It is of type Date @dateFormat.
         */
        public Builder setData_ospedalizzazione(String data_ospedalizzazione) {
            this.data_ospedalizzazione = data_ospedalizzazione;
            return this;
        }

        /**
         * The attribute data_rianimazione of C_dettaglio. It is of type Date @dateFormat.
         */
        public Builder setData_rianimazione(String data_rianimazione) {
            this.data_rianimazione = data_rianimazione;
            return this;
        }

        /**
         * The attribute data_tampone of C_dettaglio. It is of type Date @dateFormat.
         */
        public Builder setData_tampone(String data_tampone) {
            this.data_tampone = data_tampone;
            return this;
        }

        /**
         * The attribute data_ultimo_contatto of C_dettaglio. It is of type Date @dateFormat.
         */
        public Builder setData_ultimo_contatto(String data_ultimo_contatto) {
            this.data_ultimo_contatto = data_ultimo_contatto;
            return this;
        }

        /**
         * The attribute ferritina of C_dettaglio. It is of type Int.
         */
        public Builder setFerritina(Integer ferritina) {
            this.ferritina = ferritina;
            return this;
        }

        /**
         * The attribute frequenza_resp of C_dettaglio. It is of type Int.
         */
        public Builder setFrequenza_resp(Integer frequenza_resp) {
            this.frequenza_resp = frequenza_resp;
            return this;
        }

        /**
         * The attribute fumatore of C_dettaglio. It is of type String. Domain: Attivo OR Pregresso OR Non fumatore OR Sconosciuto.}Max length: 255.
         */
        public Builder setFumatore(String fumatore) {
            this.fumatore = fumatore;
            return this;
        }

        /**
         * The attribute hivrna_diagnosi_covid of C_dettaglio. It is of type Int.
         */
        public Builder setHivrna_diagnosi_covid(Integer hivrna_diagnosi_covid) {
            this.hivrna_diagnosi_covid = hivrna_diagnosi_covid;
            return this;
        }

        /**
         * The attribute ldh of C_dettaglio. It is of type Int.
         */
        public Builder setLdh(Integer ldh) {
            this.ldh = ldh;
            return this;
        }

        /**
         * The attribute leucociti of C_dettaglio. It is of type Int.
         */
        public Builder setLeucociti(Integer leucociti) {
            this.leucociti = leucociti;
            return this;
        }

        /**
         * The attribute linfociti of C_dettaglio. It is of type Int.
         */
        public Builder setLinfociti(Integer linfociti) {
            this.linfociti = linfociti;
            return this;
        }

        /**
         * The attribute obeso of C_dettaglio. It is of type Boolean.
         */
        public Builder setObeso(Boolean obeso) {
            this.obeso = obeso;
            return this;
        }

        /**
         * The attribute ospedalizzazione of C_dettaglio. It is of type Boolean. Cannot be null.
         */
        public Builder setOspedalizzazione(Boolean ospedalizzazione) {
            this.ospedalizzazione = ospedalizzazione;
            return this;
        }

        /**
         * The attribute outcome_altro of C_dettaglio. It is of type Text.
         */
        public Builder setOutcome_altro(String outcome_altro) {
            this.outcome_altro = outcome_altro;
            return this;
        }

        /**
         * The attribute pcr of C_dettaglio. It is of type Int.
         */
        public Builder setPcr(Integer pcr) {
            this.pcr = pcr;
            return this;
        }

        /**
         * The attribute po2_fio2_ingresso of C_dettaglio. It is of type Real @realFormat.
         */
        public Builder setPo2_fio2_ingresso(String po2_fio2_ingresso) {
            this.po2_fio2_ingresso = po2_fio2_ingresso;
            return this;
        }

        /**
         * The attribute rianimazione of C_dettaglio. It is of type Boolean. Cannot be null.
         */
        public Builder setRianimazione(Boolean rianimazione) {
            this.rianimazione = rianimazione;
            return this;
        }

        /**
         * The attribute sintomi_altro of C_dettaglio. It is of type Text.
         */
        public Builder setSintomi_altro(String sintomi_altro) {
            this.sintomi_altro = sintomi_altro;
            return this;
        }

        /**
         * The attribute spo2_ingresso of C_dettaglio. It is of type String. Domain: Aria Ambiente OR O2.}Max length: 255.
         */
        public Builder setSpo2_ingresso(String spo2_ingresso) {
            this.spo2_ingresso = spo2_ingresso;
            return this;
        }

        /**
         * The associated object for the role livello_ventilazione_covid_.
         */
        public Builder setLivello_ventilazione_covid_(CliLivello_ventilazione_covidDTO livello_ventilazione_covid_) {
            this.livello_ventilazione_covid_ = livello_ventilazione_covid_;
            return this;
        }

        /**
         * The associated object for the role outcome_covid_.
         */
        public Builder setOutcome_covid_(CliOutcome_covidDTO outcome_covid_) {
            this.outcome_covid_ = outcome_covid_;
            return this;
        }

        /**
         * The associated object for the role h_Paziente_.
         */
        public Builder setH_Paziente_(CliH_PazienteDTO h_Paziente_) {
            this.h_Paziente_ = h_Paziente_;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliC_dettaglioDTO build() {
            CliC_dettaglioDTO result = new CliC_dettaglioDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAnosmia_disgeusia(this.anosmia_disgeusia);
            result.setBmi(this.bmi);
            result.setCd4_diagnosi_covid(this.cd4_diagnosi_covid);
            result.setCdc(this.cdc);
            result.setD_dimero(this.d_dimero);
            result.setData_cd4_diagnosi_covid(this.data_cd4_diagnosi_covid);
            result.setData_esami_ingresso(this.data_esami_ingresso);
            result.setData_hivrna_diagnosi_covid(this.data_hivrna_diagnosi_covid);
            result.setData_max_ventilazione(this.data_max_ventilazione);
            result.setData_ospedalizzazione(this.data_ospedalizzazione);
            result.setData_rianimazione(this.data_rianimazione);
            result.setData_tampone(this.data_tampone);
            result.setData_ultimo_contatto(this.data_ultimo_contatto);
            result.setFerritina(this.ferritina);
            result.setFrequenza_resp(this.frequenza_resp);
            result.setFumatore(this.fumatore);
            result.setHivrna_diagnosi_covid(this.hivrna_diagnosi_covid);
            result.setLdh(this.ldh);
            result.setLeucociti(this.leucociti);
            result.setLinfociti(this.linfociti);
            result.setObeso(this.obeso);
            result.setOspedalizzazione(this.ospedalizzazione);
            result.setOutcome_altro(this.outcome_altro);
            result.setPcr(this.pcr);
            result.setPo2_fio2_ingresso(this.po2_fio2_ingresso);
            result.setRianimazione(this.rianimazione);
            result.setSintomi_altro(this.sintomi_altro);
            result.setSpo2_ingresso(this.spo2_ingresso);
            result.setLivello_ventilazione_covid_(this.livello_ventilazione_covid_);
            result.setOutcome_covid_(this.outcome_covid_);
            result.setH_Paziente_(this.h_Paziente_);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
