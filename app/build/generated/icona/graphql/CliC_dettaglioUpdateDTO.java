package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a single object of class C_dettaglio.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliC_dettaglioUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
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
    private CliEventoRoleObjectsDTO evento_covid;
    private CliLivello_ventilazione_covidRoleRefDTO livello_ventilazione_covid_;
    private CliOutcome_covidRoleRefDTO outcome_covid_;
    private CliTerapia_covidRoleObjectsDTO terapia_covid_;

    public CliC_dettaglioUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Boolean getAnosmia_disgeusia() {
        return anosmia_disgeusia;
    }
    public void setAnosmia_disgeusia(Boolean anosmia_disgeusia) {
        this.anosmia_disgeusia = anosmia_disgeusia;
    }

    public String getBmi() {
        return bmi;
    }
    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public Integer getCd4_diagnosi_covid() {
        return cd4_diagnosi_covid;
    }
    public void setCd4_diagnosi_covid(Integer cd4_diagnosi_covid) {
        this.cd4_diagnosi_covid = cd4_diagnosi_covid;
    }

    public String getCdc() {
        return cdc;
    }
    public void setCdc(String cdc) {
        this.cdc = cdc;
    }

    public Integer getD_dimero() {
        return d_dimero;
    }
    public void setD_dimero(Integer d_dimero) {
        this.d_dimero = d_dimero;
    }

    public String getData_cd4_diagnosi_covid() {
        return data_cd4_diagnosi_covid;
    }
    public void setData_cd4_diagnosi_covid(String data_cd4_diagnosi_covid) {
        this.data_cd4_diagnosi_covid = data_cd4_diagnosi_covid;
    }

    public String getData_esami_ingresso() {
        return data_esami_ingresso;
    }
    public void setData_esami_ingresso(String data_esami_ingresso) {
        this.data_esami_ingresso = data_esami_ingresso;
    }

    public String getData_hivrna_diagnosi_covid() {
        return data_hivrna_diagnosi_covid;
    }
    public void setData_hivrna_diagnosi_covid(String data_hivrna_diagnosi_covid) {
        this.data_hivrna_diagnosi_covid = data_hivrna_diagnosi_covid;
    }

    public String getData_max_ventilazione() {
        return data_max_ventilazione;
    }
    public void setData_max_ventilazione(String data_max_ventilazione) {
        this.data_max_ventilazione = data_max_ventilazione;
    }

    public String getData_ospedalizzazione() {
        return data_ospedalizzazione;
    }
    public void setData_ospedalizzazione(String data_ospedalizzazione) {
        this.data_ospedalizzazione = data_ospedalizzazione;
    }

    public String getData_rianimazione() {
        return data_rianimazione;
    }
    public void setData_rianimazione(String data_rianimazione) {
        this.data_rianimazione = data_rianimazione;
    }

    public String getData_tampone() {
        return data_tampone;
    }
    public void setData_tampone(String data_tampone) {
        this.data_tampone = data_tampone;
    }

    public String getData_ultimo_contatto() {
        return data_ultimo_contatto;
    }
    public void setData_ultimo_contatto(String data_ultimo_contatto) {
        this.data_ultimo_contatto = data_ultimo_contatto;
    }

    public Integer getFerritina() {
        return ferritina;
    }
    public void setFerritina(Integer ferritina) {
        this.ferritina = ferritina;
    }

    public Integer getFrequenza_resp() {
        return frequenza_resp;
    }
    public void setFrequenza_resp(Integer frequenza_resp) {
        this.frequenza_resp = frequenza_resp;
    }

    public String getFumatore() {
        return fumatore;
    }
    public void setFumatore(String fumatore) {
        this.fumatore = fumatore;
    }

    public Integer getHivrna_diagnosi_covid() {
        return hivrna_diagnosi_covid;
    }
    public void setHivrna_diagnosi_covid(Integer hivrna_diagnosi_covid) {
        this.hivrna_diagnosi_covid = hivrna_diagnosi_covid;
    }

    public Integer getLdh() {
        return ldh;
    }
    public void setLdh(Integer ldh) {
        this.ldh = ldh;
    }

    public Integer getLeucociti() {
        return leucociti;
    }
    public void setLeucociti(Integer leucociti) {
        this.leucociti = leucociti;
    }

    public Integer getLinfociti() {
        return linfociti;
    }
    public void setLinfociti(Integer linfociti) {
        this.linfociti = linfociti;
    }

    public Boolean getObeso() {
        return obeso;
    }
    public void setObeso(Boolean obeso) {
        this.obeso = obeso;
    }

    public Boolean getOspedalizzazione() {
        return ospedalizzazione;
    }
    public void setOspedalizzazione(Boolean ospedalizzazione) {
        this.ospedalizzazione = ospedalizzazione;
    }

    public String getOutcome_altro() {
        return outcome_altro;
    }
    public void setOutcome_altro(String outcome_altro) {
        this.outcome_altro = outcome_altro;
    }

    public Integer getPcr() {
        return pcr;
    }
    public void setPcr(Integer pcr) {
        this.pcr = pcr;
    }

    public String getPo2_fio2_ingresso() {
        return po2_fio2_ingresso;
    }
    public void setPo2_fio2_ingresso(String po2_fio2_ingresso) {
        this.po2_fio2_ingresso = po2_fio2_ingresso;
    }

    public Boolean getRianimazione() {
        return rianimazione;
    }
    public void setRianimazione(Boolean rianimazione) {
        this.rianimazione = rianimazione;
    }

    public String getSintomi_altro() {
        return sintomi_altro;
    }
    public void setSintomi_altro(String sintomi_altro) {
        this.sintomi_altro = sintomi_altro;
    }

    public String getSpo2_ingresso() {
        return spo2_ingresso;
    }
    public void setSpo2_ingresso(String spo2_ingresso) {
        this.spo2_ingresso = spo2_ingresso;
    }

    public CliEventoRoleObjectsDTO getEvento_covid() {
        return evento_covid;
    }
    public void setEvento_covid(CliEventoRoleObjectsDTO evento_covid) {
        this.evento_covid = evento_covid;
    }

    public CliLivello_ventilazione_covidRoleRefDTO getLivello_ventilazione_covid_() {
        return livello_ventilazione_covid_;
    }
    public void setLivello_ventilazione_covid_(CliLivello_ventilazione_covidRoleRefDTO livello_ventilazione_covid_) {
        this.livello_ventilazione_covid_ = livello_ventilazione_covid_;
    }

    public CliOutcome_covidRoleRefDTO getOutcome_covid_() {
        return outcome_covid_;
    }
    public void setOutcome_covid_(CliOutcome_covidRoleRefDTO outcome_covid_) {
        this.outcome_covid_ = outcome_covid_;
    }

    public CliTerapia_covidRoleObjectsDTO getTerapia_covid_() {
        return terapia_covid_;
    }
    public void setTerapia_covid_(CliTerapia_covidRoleObjectsDTO terapia_covid_) {
        this.terapia_covid_ = terapia_covid_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        if (evento_covid != null) {
            joiner.add("evento_covid: " + GraphQLRequestSerializer.getEntry(evento_covid));
        }
        if (livello_ventilazione_covid_ != null) {
            joiner.add("livello_ventilazione_covid_: " + GraphQLRequestSerializer.getEntry(livello_ventilazione_covid_));
        }
        if (outcome_covid_ != null) {
            joiner.add("outcome_covid_: " + GraphQLRequestSerializer.getEntry(outcome_covid_));
        }
        if (terapia_covid_ != null) {
            joiner.add("terapia_covid_: " + GraphQLRequestSerializer.getEntry(terapia_covid_));
        }
        return joiner.toString();
    }

    public static CliC_dettaglioUpdateDTO.Builder builder() {
        return new CliC_dettaglioUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

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
        private CliEventoRoleObjectsDTO evento_covid;
        private CliLivello_ventilazione_covidRoleRefDTO livello_ventilazione_covid_;
        private CliOutcome_covidRoleRefDTO outcome_covid_;
        private CliTerapia_covidRoleObjectsDTO terapia_covid_;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAnosmia_disgeusia(Boolean anosmia_disgeusia) {
            this.anosmia_disgeusia = anosmia_disgeusia;
            return this;
        }

        public Builder setBmi(String bmi) {
            this.bmi = bmi;
            return this;
        }

        public Builder setCd4_diagnosi_covid(Integer cd4_diagnosi_covid) {
            this.cd4_diagnosi_covid = cd4_diagnosi_covid;
            return this;
        }

        public Builder setCdc(String cdc) {
            this.cdc = cdc;
            return this;
        }

        public Builder setD_dimero(Integer d_dimero) {
            this.d_dimero = d_dimero;
            return this;
        }

        public Builder setData_cd4_diagnosi_covid(String data_cd4_diagnosi_covid) {
            this.data_cd4_diagnosi_covid = data_cd4_diagnosi_covid;
            return this;
        }

        public Builder setData_esami_ingresso(String data_esami_ingresso) {
            this.data_esami_ingresso = data_esami_ingresso;
            return this;
        }

        public Builder setData_hivrna_diagnosi_covid(String data_hivrna_diagnosi_covid) {
            this.data_hivrna_diagnosi_covid = data_hivrna_diagnosi_covid;
            return this;
        }

        public Builder setData_max_ventilazione(String data_max_ventilazione) {
            this.data_max_ventilazione = data_max_ventilazione;
            return this;
        }

        public Builder setData_ospedalizzazione(String data_ospedalizzazione) {
            this.data_ospedalizzazione = data_ospedalizzazione;
            return this;
        }

        public Builder setData_rianimazione(String data_rianimazione) {
            this.data_rianimazione = data_rianimazione;
            return this;
        }

        public Builder setData_tampone(String data_tampone) {
            this.data_tampone = data_tampone;
            return this;
        }

        public Builder setData_ultimo_contatto(String data_ultimo_contatto) {
            this.data_ultimo_contatto = data_ultimo_contatto;
            return this;
        }

        public Builder setFerritina(Integer ferritina) {
            this.ferritina = ferritina;
            return this;
        }

        public Builder setFrequenza_resp(Integer frequenza_resp) {
            this.frequenza_resp = frequenza_resp;
            return this;
        }

        public Builder setFumatore(String fumatore) {
            this.fumatore = fumatore;
            return this;
        }

        public Builder setHivrna_diagnosi_covid(Integer hivrna_diagnosi_covid) {
            this.hivrna_diagnosi_covid = hivrna_diagnosi_covid;
            return this;
        }

        public Builder setLdh(Integer ldh) {
            this.ldh = ldh;
            return this;
        }

        public Builder setLeucociti(Integer leucociti) {
            this.leucociti = leucociti;
            return this;
        }

        public Builder setLinfociti(Integer linfociti) {
            this.linfociti = linfociti;
            return this;
        }

        public Builder setObeso(Boolean obeso) {
            this.obeso = obeso;
            return this;
        }

        public Builder setOspedalizzazione(Boolean ospedalizzazione) {
            this.ospedalizzazione = ospedalizzazione;
            return this;
        }

        public Builder setOutcome_altro(String outcome_altro) {
            this.outcome_altro = outcome_altro;
            return this;
        }

        public Builder setPcr(Integer pcr) {
            this.pcr = pcr;
            return this;
        }

        public Builder setPo2_fio2_ingresso(String po2_fio2_ingresso) {
            this.po2_fio2_ingresso = po2_fio2_ingresso;
            return this;
        }

        public Builder setRianimazione(Boolean rianimazione) {
            this.rianimazione = rianimazione;
            return this;
        }

        public Builder setSintomi_altro(String sintomi_altro) {
            this.sintomi_altro = sintomi_altro;
            return this;
        }

        public Builder setSpo2_ingresso(String spo2_ingresso) {
            this.spo2_ingresso = spo2_ingresso;
            return this;
        }

        public Builder setEvento_covid(CliEventoRoleObjectsDTO evento_covid) {
            this.evento_covid = evento_covid;
            return this;
        }

        public Builder setLivello_ventilazione_covid_(CliLivello_ventilazione_covidRoleRefDTO livello_ventilazione_covid_) {
            this.livello_ventilazione_covid_ = livello_ventilazione_covid_;
            return this;
        }

        public Builder setOutcome_covid_(CliOutcome_covidRoleRefDTO outcome_covid_) {
            this.outcome_covid_ = outcome_covid_;
            return this;
        }

        public Builder setTerapia_covid_(CliTerapia_covidRoleObjectsDTO terapia_covid_) {
            this.terapia_covid_ = terapia_covid_;
            return this;
        }


        public CliC_dettaglioUpdateDTO build() {
            CliC_dettaglioUpdateDTO result = new CliC_dettaglioUpdateDTO();
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
            result.setEvento_covid(this.evento_covid);
            result.setLivello_ventilazione_covid_(this.livello_ventilazione_covid_);
            result.setOutcome_covid_(this.outcome_covid_);
            result.setTerapia_covid_(this.terapia_covid_);
            return result;
        }

    }
}
