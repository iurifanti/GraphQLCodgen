package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type C_dettaglio.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliC_dettaglioFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
    private String _id___eq;
    private String _id___ne;
    private Boolean _id___null;
    private Boolean _id___not___null;
    private java.util.List<String> _id___in;
    private java.util.List<String> _id___not___in;
    private String _id___lt;
    private String _id___lte;
    private String _id___gt;
    private String _id___gte;
    private Boolean anosmia_disgeusia___eq;
    private Boolean anosmia_disgeusia___ne;
    private Boolean anosmia_disgeusia___null;
    private Boolean anosmia_disgeusia___not___null;
    private String bmi___eq;
    private String bmi___ne;
    private Boolean bmi___null;
    private Boolean bmi___not___null;
    private java.util.List<String> bmi___in;
    private java.util.List<String> bmi___not___in;
    private String bmi___lt;
    private String bmi___lte;
    private String bmi___gt;
    private String bmi___gte;
    private Integer cd4_diagnosi_covid___eq;
    private Integer cd4_diagnosi_covid___ne;
    private Boolean cd4_diagnosi_covid___null;
    private Boolean cd4_diagnosi_covid___not___null;
    private java.util.List<Integer> cd4_diagnosi_covid___in;
    private java.util.List<Integer> cd4_diagnosi_covid___not___in;
    private Integer cd4_diagnosi_covid___lt;
    private Integer cd4_diagnosi_covid___lte;
    private Integer cd4_diagnosi_covid___gt;
    private Integer cd4_diagnosi_covid___gte;
    private String cdc___eq;
    private String cdc___ne;
    private Boolean cdc___null;
    private Boolean cdc___not___null;
    private java.util.List<String> cdc___in;
    private java.util.List<String> cdc___not___in;
    private String cdc___lt;
    private String cdc___lte;
    private String cdc___gt;
    private String cdc___gte;
    private String cdc___contains;
    private String cdc___not___contains;
    private String cdc___starts_with;
    private String cdc___not___starts_with;
    private String cdc___ends_with;
    private String cdc___not___ends_with;
    private Integer d_dimero___eq;
    private Integer d_dimero___ne;
    private Boolean d_dimero___null;
    private Boolean d_dimero___not___null;
    private java.util.List<Integer> d_dimero___in;
    private java.util.List<Integer> d_dimero___not___in;
    private Integer d_dimero___lt;
    private Integer d_dimero___lte;
    private Integer d_dimero___gt;
    private Integer d_dimero___gte;
    private String data_cd4_diagnosi_covid___eq;
    private String data_cd4_diagnosi_covid___ne;
    private Boolean data_cd4_diagnosi_covid___null;
    private Boolean data_cd4_diagnosi_covid___not___null;
    private java.util.List<String> data_cd4_diagnosi_covid___in;
    private java.util.List<String> data_cd4_diagnosi_covid___not___in;
    private String data_cd4_diagnosi_covid___lt;
    private String data_cd4_diagnosi_covid___lte;
    private String data_cd4_diagnosi_covid___gt;
    private String data_cd4_diagnosi_covid___gte;
    private String data_esami_ingresso___eq;
    private String data_esami_ingresso___ne;
    private Boolean data_esami_ingresso___null;
    private Boolean data_esami_ingresso___not___null;
    private java.util.List<String> data_esami_ingresso___in;
    private java.util.List<String> data_esami_ingresso___not___in;
    private String data_esami_ingresso___lt;
    private String data_esami_ingresso___lte;
    private String data_esami_ingresso___gt;
    private String data_esami_ingresso___gte;
    private String data_hivrna_diagnosi_covid___eq;
    private String data_hivrna_diagnosi_covid___ne;
    private Boolean data_hivrna_diagnosi_covid___null;
    private Boolean data_hivrna_diagnosi_covid___not___null;
    private java.util.List<String> data_hivrna_diagnosi_covid___in;
    private java.util.List<String> data_hivrna_diagnosi_covid___not___in;
    private String data_hivrna_diagnosi_covid___lt;
    private String data_hivrna_diagnosi_covid___lte;
    private String data_hivrna_diagnosi_covid___gt;
    private String data_hivrna_diagnosi_covid___gte;
    private String data_max_ventilazione___eq;
    private String data_max_ventilazione___ne;
    private Boolean data_max_ventilazione___null;
    private Boolean data_max_ventilazione___not___null;
    private java.util.List<String> data_max_ventilazione___in;
    private java.util.List<String> data_max_ventilazione___not___in;
    private String data_max_ventilazione___lt;
    private String data_max_ventilazione___lte;
    private String data_max_ventilazione___gt;
    private String data_max_ventilazione___gte;
    private String data_ospedalizzazione___eq;
    private String data_ospedalizzazione___ne;
    private Boolean data_ospedalizzazione___null;
    private Boolean data_ospedalizzazione___not___null;
    private java.util.List<String> data_ospedalizzazione___in;
    private java.util.List<String> data_ospedalizzazione___not___in;
    private String data_ospedalizzazione___lt;
    private String data_ospedalizzazione___lte;
    private String data_ospedalizzazione___gt;
    private String data_ospedalizzazione___gte;
    private String data_rianimazione___eq;
    private String data_rianimazione___ne;
    private Boolean data_rianimazione___null;
    private Boolean data_rianimazione___not___null;
    private java.util.List<String> data_rianimazione___in;
    private java.util.List<String> data_rianimazione___not___in;
    private String data_rianimazione___lt;
    private String data_rianimazione___lte;
    private String data_rianimazione___gt;
    private String data_rianimazione___gte;
    private String data_tampone___eq;
    private String data_tampone___ne;
    private Boolean data_tampone___null;
    private Boolean data_tampone___not___null;
    private java.util.List<String> data_tampone___in;
    private java.util.List<String> data_tampone___not___in;
    private String data_tampone___lt;
    private String data_tampone___lte;
    private String data_tampone___gt;
    private String data_tampone___gte;
    private String data_ultimo_contatto___eq;
    private String data_ultimo_contatto___ne;
    private Boolean data_ultimo_contatto___null;
    private Boolean data_ultimo_contatto___not___null;
    private java.util.List<String> data_ultimo_contatto___in;
    private java.util.List<String> data_ultimo_contatto___not___in;
    private String data_ultimo_contatto___lt;
    private String data_ultimo_contatto___lte;
    private String data_ultimo_contatto___gt;
    private String data_ultimo_contatto___gte;
    private Integer ferritina___eq;
    private Integer ferritina___ne;
    private Boolean ferritina___null;
    private Boolean ferritina___not___null;
    private java.util.List<Integer> ferritina___in;
    private java.util.List<Integer> ferritina___not___in;
    private Integer ferritina___lt;
    private Integer ferritina___lte;
    private Integer ferritina___gt;
    private Integer ferritina___gte;
    private Integer frequenza_resp___eq;
    private Integer frequenza_resp___ne;
    private Boolean frequenza_resp___null;
    private Boolean frequenza_resp___not___null;
    private java.util.List<Integer> frequenza_resp___in;
    private java.util.List<Integer> frequenza_resp___not___in;
    private Integer frequenza_resp___lt;
    private Integer frequenza_resp___lte;
    private Integer frequenza_resp___gt;
    private Integer frequenza_resp___gte;
    private String fumatore___eq;
    private String fumatore___ne;
    private Boolean fumatore___null;
    private Boolean fumatore___not___null;
    private java.util.List<String> fumatore___in;
    private java.util.List<String> fumatore___not___in;
    private String fumatore___lt;
    private String fumatore___lte;
    private String fumatore___gt;
    private String fumatore___gte;
    private String fumatore___contains;
    private String fumatore___not___contains;
    private String fumatore___starts_with;
    private String fumatore___not___starts_with;
    private String fumatore___ends_with;
    private String fumatore___not___ends_with;
    private Integer hivrna_diagnosi_covid___eq;
    private Integer hivrna_diagnosi_covid___ne;
    private Boolean hivrna_diagnosi_covid___null;
    private Boolean hivrna_diagnosi_covid___not___null;
    private java.util.List<Integer> hivrna_diagnosi_covid___in;
    private java.util.List<Integer> hivrna_diagnosi_covid___not___in;
    private Integer hivrna_diagnosi_covid___lt;
    private Integer hivrna_diagnosi_covid___lte;
    private Integer hivrna_diagnosi_covid___gt;
    private Integer hivrna_diagnosi_covid___gte;
    private Integer ldh___eq;
    private Integer ldh___ne;
    private Boolean ldh___null;
    private Boolean ldh___not___null;
    private java.util.List<Integer> ldh___in;
    private java.util.List<Integer> ldh___not___in;
    private Integer ldh___lt;
    private Integer ldh___lte;
    private Integer ldh___gt;
    private Integer ldh___gte;
    private Integer leucociti___eq;
    private Integer leucociti___ne;
    private Boolean leucociti___null;
    private Boolean leucociti___not___null;
    private java.util.List<Integer> leucociti___in;
    private java.util.List<Integer> leucociti___not___in;
    private Integer leucociti___lt;
    private Integer leucociti___lte;
    private Integer leucociti___gt;
    private Integer leucociti___gte;
    private Integer linfociti___eq;
    private Integer linfociti___ne;
    private Boolean linfociti___null;
    private Boolean linfociti___not___null;
    private java.util.List<Integer> linfociti___in;
    private java.util.List<Integer> linfociti___not___in;
    private Integer linfociti___lt;
    private Integer linfociti___lte;
    private Integer linfociti___gt;
    private Integer linfociti___gte;
    private Boolean obeso___eq;
    private Boolean obeso___ne;
    private Boolean obeso___null;
    private Boolean obeso___not___null;
    private Boolean ospedalizzazione___eq;
    private Boolean ospedalizzazione___ne;
    private Boolean ospedalizzazione___null;
    private Boolean ospedalizzazione___not___null;
    private String outcome_altro___eq;
    private String outcome_altro___ne;
    private Boolean outcome_altro___null;
    private Boolean outcome_altro___not___null;
    private java.util.List<String> outcome_altro___in;
    private java.util.List<String> outcome_altro___not___in;
    private String outcome_altro___lt;
    private String outcome_altro___lte;
    private String outcome_altro___gt;
    private String outcome_altro___gte;
    private String outcome_altro___contains;
    private String outcome_altro___not___contains;
    private String outcome_altro___starts_with;
    private String outcome_altro___not___starts_with;
    private String outcome_altro___ends_with;
    private String outcome_altro___not___ends_with;
    private Integer pcr___eq;
    private Integer pcr___ne;
    private Boolean pcr___null;
    private Boolean pcr___not___null;
    private java.util.List<Integer> pcr___in;
    private java.util.List<Integer> pcr___not___in;
    private Integer pcr___lt;
    private Integer pcr___lte;
    private Integer pcr___gt;
    private Integer pcr___gte;
    private String po2_fio2_ingresso___eq;
    private String po2_fio2_ingresso___ne;
    private Boolean po2_fio2_ingresso___null;
    private Boolean po2_fio2_ingresso___not___null;
    private java.util.List<String> po2_fio2_ingresso___in;
    private java.util.List<String> po2_fio2_ingresso___not___in;
    private String po2_fio2_ingresso___lt;
    private String po2_fio2_ingresso___lte;
    private String po2_fio2_ingresso___gt;
    private String po2_fio2_ingresso___gte;
    private Boolean rianimazione___eq;
    private Boolean rianimazione___ne;
    private Boolean rianimazione___null;
    private Boolean rianimazione___not___null;
    private String sintomi_altro___eq;
    private String sintomi_altro___ne;
    private Boolean sintomi_altro___null;
    private Boolean sintomi_altro___not___null;
    private java.util.List<String> sintomi_altro___in;
    private java.util.List<String> sintomi_altro___not___in;
    private String sintomi_altro___lt;
    private String sintomi_altro___lte;
    private String sintomi_altro___gt;
    private String sintomi_altro___gte;
    private String sintomi_altro___contains;
    private String sintomi_altro___not___contains;
    private String sintomi_altro___starts_with;
    private String sintomi_altro___not___starts_with;
    private String sintomi_altro___ends_with;
    private String sintomi_altro___not___ends_with;
    private String spo2_ingresso___eq;
    private String spo2_ingresso___ne;
    private Boolean spo2_ingresso___null;
    private Boolean spo2_ingresso___not___null;
    private java.util.List<String> spo2_ingresso___in;
    private java.util.List<String> spo2_ingresso___not___in;
    private String spo2_ingresso___lt;
    private String spo2_ingresso___lte;
    private String spo2_ingresso___gt;
    private String spo2_ingresso___gte;
    private String spo2_ingresso___contains;
    private String spo2_ingresso___not___contains;
    private String spo2_ingresso___starts_with;
    private String spo2_ingresso___not___starts_with;
    private String spo2_ingresso___ends_with;
    private String spo2_ingresso___not___ends_with;
    private java.util.List<CliC_dettaglioFilterDTO> AND;
    private java.util.List<CliC_dettaglioFilterDTO> OR;
    private CliC_dettaglioFilterDTO NOT;

    public CliC_dettaglioFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
    }

    public String get_id___eq() {
        return _id___eq;
    }
    public void set_id___eq(String _id___eq) {
        this._id___eq = _id___eq;
    }

    public String get_id___ne() {
        return _id___ne;
    }
    public void set_id___ne(String _id___ne) {
        this._id___ne = _id___ne;
    }

    public Boolean get_id___null() {
        return _id___null;
    }
    public void set_id___null(Boolean _id___null) {
        this._id___null = _id___null;
    }

    public Boolean get_id___not___null() {
        return _id___not___null;
    }
    public void set_id___not___null(Boolean _id___not___null) {
        this._id___not___null = _id___not___null;
    }

    public java.util.List<String> get_id___in() {
        return _id___in;
    }
    public void set_id___in(java.util.List<String> _id___in) {
        this._id___in = _id___in;
    }

    public java.util.List<String> get_id___not___in() {
        return _id___not___in;
    }
    public void set_id___not___in(java.util.List<String> _id___not___in) {
        this._id___not___in = _id___not___in;
    }

    public String get_id___lt() {
        return _id___lt;
    }
    public void set_id___lt(String _id___lt) {
        this._id___lt = _id___lt;
    }

    public String get_id___lte() {
        return _id___lte;
    }
    public void set_id___lte(String _id___lte) {
        this._id___lte = _id___lte;
    }

    public String get_id___gt() {
        return _id___gt;
    }
    public void set_id___gt(String _id___gt) {
        this._id___gt = _id___gt;
    }

    public String get_id___gte() {
        return _id___gte;
    }
    public void set_id___gte(String _id___gte) {
        this._id___gte = _id___gte;
    }

    public Boolean getAnosmia_disgeusia___eq() {
        return anosmia_disgeusia___eq;
    }
    public void setAnosmia_disgeusia___eq(Boolean anosmia_disgeusia___eq) {
        this.anosmia_disgeusia___eq = anosmia_disgeusia___eq;
    }

    public Boolean getAnosmia_disgeusia___ne() {
        return anosmia_disgeusia___ne;
    }
    public void setAnosmia_disgeusia___ne(Boolean anosmia_disgeusia___ne) {
        this.anosmia_disgeusia___ne = anosmia_disgeusia___ne;
    }

    public Boolean getAnosmia_disgeusia___null() {
        return anosmia_disgeusia___null;
    }
    public void setAnosmia_disgeusia___null(Boolean anosmia_disgeusia___null) {
        this.anosmia_disgeusia___null = anosmia_disgeusia___null;
    }

    public Boolean getAnosmia_disgeusia___not___null() {
        return anosmia_disgeusia___not___null;
    }
    public void setAnosmia_disgeusia___not___null(Boolean anosmia_disgeusia___not___null) {
        this.anosmia_disgeusia___not___null = anosmia_disgeusia___not___null;
    }

    public String getBmi___eq() {
        return bmi___eq;
    }
    public void setBmi___eq(String bmi___eq) {
        this.bmi___eq = bmi___eq;
    }

    public String getBmi___ne() {
        return bmi___ne;
    }
    public void setBmi___ne(String bmi___ne) {
        this.bmi___ne = bmi___ne;
    }

    public Boolean getBmi___null() {
        return bmi___null;
    }
    public void setBmi___null(Boolean bmi___null) {
        this.bmi___null = bmi___null;
    }

    public Boolean getBmi___not___null() {
        return bmi___not___null;
    }
    public void setBmi___not___null(Boolean bmi___not___null) {
        this.bmi___not___null = bmi___not___null;
    }

    public java.util.List<String> getBmi___in() {
        return bmi___in;
    }
    public void setBmi___in(java.util.List<String> bmi___in) {
        this.bmi___in = bmi___in;
    }

    public java.util.List<String> getBmi___not___in() {
        return bmi___not___in;
    }
    public void setBmi___not___in(java.util.List<String> bmi___not___in) {
        this.bmi___not___in = bmi___not___in;
    }

    public String getBmi___lt() {
        return bmi___lt;
    }
    public void setBmi___lt(String bmi___lt) {
        this.bmi___lt = bmi___lt;
    }

    public String getBmi___lte() {
        return bmi___lte;
    }
    public void setBmi___lte(String bmi___lte) {
        this.bmi___lte = bmi___lte;
    }

    public String getBmi___gt() {
        return bmi___gt;
    }
    public void setBmi___gt(String bmi___gt) {
        this.bmi___gt = bmi___gt;
    }

    public String getBmi___gte() {
        return bmi___gte;
    }
    public void setBmi___gte(String bmi___gte) {
        this.bmi___gte = bmi___gte;
    }

    public Integer getCd4_diagnosi_covid___eq() {
        return cd4_diagnosi_covid___eq;
    }
    public void setCd4_diagnosi_covid___eq(Integer cd4_diagnosi_covid___eq) {
        this.cd4_diagnosi_covid___eq = cd4_diagnosi_covid___eq;
    }

    public Integer getCd4_diagnosi_covid___ne() {
        return cd4_diagnosi_covid___ne;
    }
    public void setCd4_diagnosi_covid___ne(Integer cd4_diagnosi_covid___ne) {
        this.cd4_diagnosi_covid___ne = cd4_diagnosi_covid___ne;
    }

    public Boolean getCd4_diagnosi_covid___null() {
        return cd4_diagnosi_covid___null;
    }
    public void setCd4_diagnosi_covid___null(Boolean cd4_diagnosi_covid___null) {
        this.cd4_diagnosi_covid___null = cd4_diagnosi_covid___null;
    }

    public Boolean getCd4_diagnosi_covid___not___null() {
        return cd4_diagnosi_covid___not___null;
    }
    public void setCd4_diagnosi_covid___not___null(Boolean cd4_diagnosi_covid___not___null) {
        this.cd4_diagnosi_covid___not___null = cd4_diagnosi_covid___not___null;
    }

    public java.util.List<Integer> getCd4_diagnosi_covid___in() {
        return cd4_diagnosi_covid___in;
    }
    public void setCd4_diagnosi_covid___in(java.util.List<Integer> cd4_diagnosi_covid___in) {
        this.cd4_diagnosi_covid___in = cd4_diagnosi_covid___in;
    }

    public java.util.List<Integer> getCd4_diagnosi_covid___not___in() {
        return cd4_diagnosi_covid___not___in;
    }
    public void setCd4_diagnosi_covid___not___in(java.util.List<Integer> cd4_diagnosi_covid___not___in) {
        this.cd4_diagnosi_covid___not___in = cd4_diagnosi_covid___not___in;
    }

    public Integer getCd4_diagnosi_covid___lt() {
        return cd4_diagnosi_covid___lt;
    }
    public void setCd4_diagnosi_covid___lt(Integer cd4_diagnosi_covid___lt) {
        this.cd4_diagnosi_covid___lt = cd4_diagnosi_covid___lt;
    }

    public Integer getCd4_diagnosi_covid___lte() {
        return cd4_diagnosi_covid___lte;
    }
    public void setCd4_diagnosi_covid___lte(Integer cd4_diagnosi_covid___lte) {
        this.cd4_diagnosi_covid___lte = cd4_diagnosi_covid___lte;
    }

    public Integer getCd4_diagnosi_covid___gt() {
        return cd4_diagnosi_covid___gt;
    }
    public void setCd4_diagnosi_covid___gt(Integer cd4_diagnosi_covid___gt) {
        this.cd4_diagnosi_covid___gt = cd4_diagnosi_covid___gt;
    }

    public Integer getCd4_diagnosi_covid___gte() {
        return cd4_diagnosi_covid___gte;
    }
    public void setCd4_diagnosi_covid___gte(Integer cd4_diagnosi_covid___gte) {
        this.cd4_diagnosi_covid___gte = cd4_diagnosi_covid___gte;
    }

    public String getCdc___eq() {
        return cdc___eq;
    }
    public void setCdc___eq(String cdc___eq) {
        this.cdc___eq = cdc___eq;
    }

    public String getCdc___ne() {
        return cdc___ne;
    }
    public void setCdc___ne(String cdc___ne) {
        this.cdc___ne = cdc___ne;
    }

    public Boolean getCdc___null() {
        return cdc___null;
    }
    public void setCdc___null(Boolean cdc___null) {
        this.cdc___null = cdc___null;
    }

    public Boolean getCdc___not___null() {
        return cdc___not___null;
    }
    public void setCdc___not___null(Boolean cdc___not___null) {
        this.cdc___not___null = cdc___not___null;
    }

    public java.util.List<String> getCdc___in() {
        return cdc___in;
    }
    public void setCdc___in(java.util.List<String> cdc___in) {
        this.cdc___in = cdc___in;
    }

    public java.util.List<String> getCdc___not___in() {
        return cdc___not___in;
    }
    public void setCdc___not___in(java.util.List<String> cdc___not___in) {
        this.cdc___not___in = cdc___not___in;
    }

    public String getCdc___lt() {
        return cdc___lt;
    }
    public void setCdc___lt(String cdc___lt) {
        this.cdc___lt = cdc___lt;
    }

    public String getCdc___lte() {
        return cdc___lte;
    }
    public void setCdc___lte(String cdc___lte) {
        this.cdc___lte = cdc___lte;
    }

    public String getCdc___gt() {
        return cdc___gt;
    }
    public void setCdc___gt(String cdc___gt) {
        this.cdc___gt = cdc___gt;
    }

    public String getCdc___gte() {
        return cdc___gte;
    }
    public void setCdc___gte(String cdc___gte) {
        this.cdc___gte = cdc___gte;
    }

    public String getCdc___contains() {
        return cdc___contains;
    }
    public void setCdc___contains(String cdc___contains) {
        this.cdc___contains = cdc___contains;
    }

    public String getCdc___not___contains() {
        return cdc___not___contains;
    }
    public void setCdc___not___contains(String cdc___not___contains) {
        this.cdc___not___contains = cdc___not___contains;
    }

    public String getCdc___starts_with() {
        return cdc___starts_with;
    }
    public void setCdc___starts_with(String cdc___starts_with) {
        this.cdc___starts_with = cdc___starts_with;
    }

    public String getCdc___not___starts_with() {
        return cdc___not___starts_with;
    }
    public void setCdc___not___starts_with(String cdc___not___starts_with) {
        this.cdc___not___starts_with = cdc___not___starts_with;
    }

    public String getCdc___ends_with() {
        return cdc___ends_with;
    }
    public void setCdc___ends_with(String cdc___ends_with) {
        this.cdc___ends_with = cdc___ends_with;
    }

    public String getCdc___not___ends_with() {
        return cdc___not___ends_with;
    }
    public void setCdc___not___ends_with(String cdc___not___ends_with) {
        this.cdc___not___ends_with = cdc___not___ends_with;
    }

    public Integer getD_dimero___eq() {
        return d_dimero___eq;
    }
    public void setD_dimero___eq(Integer d_dimero___eq) {
        this.d_dimero___eq = d_dimero___eq;
    }

    public Integer getD_dimero___ne() {
        return d_dimero___ne;
    }
    public void setD_dimero___ne(Integer d_dimero___ne) {
        this.d_dimero___ne = d_dimero___ne;
    }

    public Boolean getD_dimero___null() {
        return d_dimero___null;
    }
    public void setD_dimero___null(Boolean d_dimero___null) {
        this.d_dimero___null = d_dimero___null;
    }

    public Boolean getD_dimero___not___null() {
        return d_dimero___not___null;
    }
    public void setD_dimero___not___null(Boolean d_dimero___not___null) {
        this.d_dimero___not___null = d_dimero___not___null;
    }

    public java.util.List<Integer> getD_dimero___in() {
        return d_dimero___in;
    }
    public void setD_dimero___in(java.util.List<Integer> d_dimero___in) {
        this.d_dimero___in = d_dimero___in;
    }

    public java.util.List<Integer> getD_dimero___not___in() {
        return d_dimero___not___in;
    }
    public void setD_dimero___not___in(java.util.List<Integer> d_dimero___not___in) {
        this.d_dimero___not___in = d_dimero___not___in;
    }

    public Integer getD_dimero___lt() {
        return d_dimero___lt;
    }
    public void setD_dimero___lt(Integer d_dimero___lt) {
        this.d_dimero___lt = d_dimero___lt;
    }

    public Integer getD_dimero___lte() {
        return d_dimero___lte;
    }
    public void setD_dimero___lte(Integer d_dimero___lte) {
        this.d_dimero___lte = d_dimero___lte;
    }

    public Integer getD_dimero___gt() {
        return d_dimero___gt;
    }
    public void setD_dimero___gt(Integer d_dimero___gt) {
        this.d_dimero___gt = d_dimero___gt;
    }

    public Integer getD_dimero___gte() {
        return d_dimero___gte;
    }
    public void setD_dimero___gte(Integer d_dimero___gte) {
        this.d_dimero___gte = d_dimero___gte;
    }

    public String getData_cd4_diagnosi_covid___eq() {
        return data_cd4_diagnosi_covid___eq;
    }
    public void setData_cd4_diagnosi_covid___eq(String data_cd4_diagnosi_covid___eq) {
        this.data_cd4_diagnosi_covid___eq = data_cd4_diagnosi_covid___eq;
    }

    public String getData_cd4_diagnosi_covid___ne() {
        return data_cd4_diagnosi_covid___ne;
    }
    public void setData_cd4_diagnosi_covid___ne(String data_cd4_diagnosi_covid___ne) {
        this.data_cd4_diagnosi_covid___ne = data_cd4_diagnosi_covid___ne;
    }

    public Boolean getData_cd4_diagnosi_covid___null() {
        return data_cd4_diagnosi_covid___null;
    }
    public void setData_cd4_diagnosi_covid___null(Boolean data_cd4_diagnosi_covid___null) {
        this.data_cd4_diagnosi_covid___null = data_cd4_diagnosi_covid___null;
    }

    public Boolean getData_cd4_diagnosi_covid___not___null() {
        return data_cd4_diagnosi_covid___not___null;
    }
    public void setData_cd4_diagnosi_covid___not___null(Boolean data_cd4_diagnosi_covid___not___null) {
        this.data_cd4_diagnosi_covid___not___null = data_cd4_diagnosi_covid___not___null;
    }

    public java.util.List<String> getData_cd4_diagnosi_covid___in() {
        return data_cd4_diagnosi_covid___in;
    }
    public void setData_cd4_diagnosi_covid___in(java.util.List<String> data_cd4_diagnosi_covid___in) {
        this.data_cd4_diagnosi_covid___in = data_cd4_diagnosi_covid___in;
    }

    public java.util.List<String> getData_cd4_diagnosi_covid___not___in() {
        return data_cd4_diagnosi_covid___not___in;
    }
    public void setData_cd4_diagnosi_covid___not___in(java.util.List<String> data_cd4_diagnosi_covid___not___in) {
        this.data_cd4_diagnosi_covid___not___in = data_cd4_diagnosi_covid___not___in;
    }

    public String getData_cd4_diagnosi_covid___lt() {
        return data_cd4_diagnosi_covid___lt;
    }
    public void setData_cd4_diagnosi_covid___lt(String data_cd4_diagnosi_covid___lt) {
        this.data_cd4_diagnosi_covid___lt = data_cd4_diagnosi_covid___lt;
    }

    public String getData_cd4_diagnosi_covid___lte() {
        return data_cd4_diagnosi_covid___lte;
    }
    public void setData_cd4_diagnosi_covid___lte(String data_cd4_diagnosi_covid___lte) {
        this.data_cd4_diagnosi_covid___lte = data_cd4_diagnosi_covid___lte;
    }

    public String getData_cd4_diagnosi_covid___gt() {
        return data_cd4_diagnosi_covid___gt;
    }
    public void setData_cd4_diagnosi_covid___gt(String data_cd4_diagnosi_covid___gt) {
        this.data_cd4_diagnosi_covid___gt = data_cd4_diagnosi_covid___gt;
    }

    public String getData_cd4_diagnosi_covid___gte() {
        return data_cd4_diagnosi_covid___gte;
    }
    public void setData_cd4_diagnosi_covid___gte(String data_cd4_diagnosi_covid___gte) {
        this.data_cd4_diagnosi_covid___gte = data_cd4_diagnosi_covid___gte;
    }

    public String getData_esami_ingresso___eq() {
        return data_esami_ingresso___eq;
    }
    public void setData_esami_ingresso___eq(String data_esami_ingresso___eq) {
        this.data_esami_ingresso___eq = data_esami_ingresso___eq;
    }

    public String getData_esami_ingresso___ne() {
        return data_esami_ingresso___ne;
    }
    public void setData_esami_ingresso___ne(String data_esami_ingresso___ne) {
        this.data_esami_ingresso___ne = data_esami_ingresso___ne;
    }

    public Boolean getData_esami_ingresso___null() {
        return data_esami_ingresso___null;
    }
    public void setData_esami_ingresso___null(Boolean data_esami_ingresso___null) {
        this.data_esami_ingresso___null = data_esami_ingresso___null;
    }

    public Boolean getData_esami_ingresso___not___null() {
        return data_esami_ingresso___not___null;
    }
    public void setData_esami_ingresso___not___null(Boolean data_esami_ingresso___not___null) {
        this.data_esami_ingresso___not___null = data_esami_ingresso___not___null;
    }

    public java.util.List<String> getData_esami_ingresso___in() {
        return data_esami_ingresso___in;
    }
    public void setData_esami_ingresso___in(java.util.List<String> data_esami_ingresso___in) {
        this.data_esami_ingresso___in = data_esami_ingresso___in;
    }

    public java.util.List<String> getData_esami_ingresso___not___in() {
        return data_esami_ingresso___not___in;
    }
    public void setData_esami_ingresso___not___in(java.util.List<String> data_esami_ingresso___not___in) {
        this.data_esami_ingresso___not___in = data_esami_ingresso___not___in;
    }

    public String getData_esami_ingresso___lt() {
        return data_esami_ingresso___lt;
    }
    public void setData_esami_ingresso___lt(String data_esami_ingresso___lt) {
        this.data_esami_ingresso___lt = data_esami_ingresso___lt;
    }

    public String getData_esami_ingresso___lte() {
        return data_esami_ingresso___lte;
    }
    public void setData_esami_ingresso___lte(String data_esami_ingresso___lte) {
        this.data_esami_ingresso___lte = data_esami_ingresso___lte;
    }

    public String getData_esami_ingresso___gt() {
        return data_esami_ingresso___gt;
    }
    public void setData_esami_ingresso___gt(String data_esami_ingresso___gt) {
        this.data_esami_ingresso___gt = data_esami_ingresso___gt;
    }

    public String getData_esami_ingresso___gte() {
        return data_esami_ingresso___gte;
    }
    public void setData_esami_ingresso___gte(String data_esami_ingresso___gte) {
        this.data_esami_ingresso___gte = data_esami_ingresso___gte;
    }

    public String getData_hivrna_diagnosi_covid___eq() {
        return data_hivrna_diagnosi_covid___eq;
    }
    public void setData_hivrna_diagnosi_covid___eq(String data_hivrna_diagnosi_covid___eq) {
        this.data_hivrna_diagnosi_covid___eq = data_hivrna_diagnosi_covid___eq;
    }

    public String getData_hivrna_diagnosi_covid___ne() {
        return data_hivrna_diagnosi_covid___ne;
    }
    public void setData_hivrna_diagnosi_covid___ne(String data_hivrna_diagnosi_covid___ne) {
        this.data_hivrna_diagnosi_covid___ne = data_hivrna_diagnosi_covid___ne;
    }

    public Boolean getData_hivrna_diagnosi_covid___null() {
        return data_hivrna_diagnosi_covid___null;
    }
    public void setData_hivrna_diagnosi_covid___null(Boolean data_hivrna_diagnosi_covid___null) {
        this.data_hivrna_diagnosi_covid___null = data_hivrna_diagnosi_covid___null;
    }

    public Boolean getData_hivrna_diagnosi_covid___not___null() {
        return data_hivrna_diagnosi_covid___not___null;
    }
    public void setData_hivrna_diagnosi_covid___not___null(Boolean data_hivrna_diagnosi_covid___not___null) {
        this.data_hivrna_diagnosi_covid___not___null = data_hivrna_diagnosi_covid___not___null;
    }

    public java.util.List<String> getData_hivrna_diagnosi_covid___in() {
        return data_hivrna_diagnosi_covid___in;
    }
    public void setData_hivrna_diagnosi_covid___in(java.util.List<String> data_hivrna_diagnosi_covid___in) {
        this.data_hivrna_diagnosi_covid___in = data_hivrna_diagnosi_covid___in;
    }

    public java.util.List<String> getData_hivrna_diagnosi_covid___not___in() {
        return data_hivrna_diagnosi_covid___not___in;
    }
    public void setData_hivrna_diagnosi_covid___not___in(java.util.List<String> data_hivrna_diagnosi_covid___not___in) {
        this.data_hivrna_diagnosi_covid___not___in = data_hivrna_diagnosi_covid___not___in;
    }

    public String getData_hivrna_diagnosi_covid___lt() {
        return data_hivrna_diagnosi_covid___lt;
    }
    public void setData_hivrna_diagnosi_covid___lt(String data_hivrna_diagnosi_covid___lt) {
        this.data_hivrna_diagnosi_covid___lt = data_hivrna_diagnosi_covid___lt;
    }

    public String getData_hivrna_diagnosi_covid___lte() {
        return data_hivrna_diagnosi_covid___lte;
    }
    public void setData_hivrna_diagnosi_covid___lte(String data_hivrna_diagnosi_covid___lte) {
        this.data_hivrna_diagnosi_covid___lte = data_hivrna_diagnosi_covid___lte;
    }

    public String getData_hivrna_diagnosi_covid___gt() {
        return data_hivrna_diagnosi_covid___gt;
    }
    public void setData_hivrna_diagnosi_covid___gt(String data_hivrna_diagnosi_covid___gt) {
        this.data_hivrna_diagnosi_covid___gt = data_hivrna_diagnosi_covid___gt;
    }

    public String getData_hivrna_diagnosi_covid___gte() {
        return data_hivrna_diagnosi_covid___gte;
    }
    public void setData_hivrna_diagnosi_covid___gte(String data_hivrna_diagnosi_covid___gte) {
        this.data_hivrna_diagnosi_covid___gte = data_hivrna_diagnosi_covid___gte;
    }

    public String getData_max_ventilazione___eq() {
        return data_max_ventilazione___eq;
    }
    public void setData_max_ventilazione___eq(String data_max_ventilazione___eq) {
        this.data_max_ventilazione___eq = data_max_ventilazione___eq;
    }

    public String getData_max_ventilazione___ne() {
        return data_max_ventilazione___ne;
    }
    public void setData_max_ventilazione___ne(String data_max_ventilazione___ne) {
        this.data_max_ventilazione___ne = data_max_ventilazione___ne;
    }

    public Boolean getData_max_ventilazione___null() {
        return data_max_ventilazione___null;
    }
    public void setData_max_ventilazione___null(Boolean data_max_ventilazione___null) {
        this.data_max_ventilazione___null = data_max_ventilazione___null;
    }

    public Boolean getData_max_ventilazione___not___null() {
        return data_max_ventilazione___not___null;
    }
    public void setData_max_ventilazione___not___null(Boolean data_max_ventilazione___not___null) {
        this.data_max_ventilazione___not___null = data_max_ventilazione___not___null;
    }

    public java.util.List<String> getData_max_ventilazione___in() {
        return data_max_ventilazione___in;
    }
    public void setData_max_ventilazione___in(java.util.List<String> data_max_ventilazione___in) {
        this.data_max_ventilazione___in = data_max_ventilazione___in;
    }

    public java.util.List<String> getData_max_ventilazione___not___in() {
        return data_max_ventilazione___not___in;
    }
    public void setData_max_ventilazione___not___in(java.util.List<String> data_max_ventilazione___not___in) {
        this.data_max_ventilazione___not___in = data_max_ventilazione___not___in;
    }

    public String getData_max_ventilazione___lt() {
        return data_max_ventilazione___lt;
    }
    public void setData_max_ventilazione___lt(String data_max_ventilazione___lt) {
        this.data_max_ventilazione___lt = data_max_ventilazione___lt;
    }

    public String getData_max_ventilazione___lte() {
        return data_max_ventilazione___lte;
    }
    public void setData_max_ventilazione___lte(String data_max_ventilazione___lte) {
        this.data_max_ventilazione___lte = data_max_ventilazione___lte;
    }

    public String getData_max_ventilazione___gt() {
        return data_max_ventilazione___gt;
    }
    public void setData_max_ventilazione___gt(String data_max_ventilazione___gt) {
        this.data_max_ventilazione___gt = data_max_ventilazione___gt;
    }

    public String getData_max_ventilazione___gte() {
        return data_max_ventilazione___gte;
    }
    public void setData_max_ventilazione___gte(String data_max_ventilazione___gte) {
        this.data_max_ventilazione___gte = data_max_ventilazione___gte;
    }

    public String getData_ospedalizzazione___eq() {
        return data_ospedalizzazione___eq;
    }
    public void setData_ospedalizzazione___eq(String data_ospedalizzazione___eq) {
        this.data_ospedalizzazione___eq = data_ospedalizzazione___eq;
    }

    public String getData_ospedalizzazione___ne() {
        return data_ospedalizzazione___ne;
    }
    public void setData_ospedalizzazione___ne(String data_ospedalizzazione___ne) {
        this.data_ospedalizzazione___ne = data_ospedalizzazione___ne;
    }

    public Boolean getData_ospedalizzazione___null() {
        return data_ospedalizzazione___null;
    }
    public void setData_ospedalizzazione___null(Boolean data_ospedalizzazione___null) {
        this.data_ospedalizzazione___null = data_ospedalizzazione___null;
    }

    public Boolean getData_ospedalizzazione___not___null() {
        return data_ospedalizzazione___not___null;
    }
    public void setData_ospedalizzazione___not___null(Boolean data_ospedalizzazione___not___null) {
        this.data_ospedalizzazione___not___null = data_ospedalizzazione___not___null;
    }

    public java.util.List<String> getData_ospedalizzazione___in() {
        return data_ospedalizzazione___in;
    }
    public void setData_ospedalizzazione___in(java.util.List<String> data_ospedalizzazione___in) {
        this.data_ospedalizzazione___in = data_ospedalizzazione___in;
    }

    public java.util.List<String> getData_ospedalizzazione___not___in() {
        return data_ospedalizzazione___not___in;
    }
    public void setData_ospedalizzazione___not___in(java.util.List<String> data_ospedalizzazione___not___in) {
        this.data_ospedalizzazione___not___in = data_ospedalizzazione___not___in;
    }

    public String getData_ospedalizzazione___lt() {
        return data_ospedalizzazione___lt;
    }
    public void setData_ospedalizzazione___lt(String data_ospedalizzazione___lt) {
        this.data_ospedalizzazione___lt = data_ospedalizzazione___lt;
    }

    public String getData_ospedalizzazione___lte() {
        return data_ospedalizzazione___lte;
    }
    public void setData_ospedalizzazione___lte(String data_ospedalizzazione___lte) {
        this.data_ospedalizzazione___lte = data_ospedalizzazione___lte;
    }

    public String getData_ospedalizzazione___gt() {
        return data_ospedalizzazione___gt;
    }
    public void setData_ospedalizzazione___gt(String data_ospedalizzazione___gt) {
        this.data_ospedalizzazione___gt = data_ospedalizzazione___gt;
    }

    public String getData_ospedalizzazione___gte() {
        return data_ospedalizzazione___gte;
    }
    public void setData_ospedalizzazione___gte(String data_ospedalizzazione___gte) {
        this.data_ospedalizzazione___gte = data_ospedalizzazione___gte;
    }

    public String getData_rianimazione___eq() {
        return data_rianimazione___eq;
    }
    public void setData_rianimazione___eq(String data_rianimazione___eq) {
        this.data_rianimazione___eq = data_rianimazione___eq;
    }

    public String getData_rianimazione___ne() {
        return data_rianimazione___ne;
    }
    public void setData_rianimazione___ne(String data_rianimazione___ne) {
        this.data_rianimazione___ne = data_rianimazione___ne;
    }

    public Boolean getData_rianimazione___null() {
        return data_rianimazione___null;
    }
    public void setData_rianimazione___null(Boolean data_rianimazione___null) {
        this.data_rianimazione___null = data_rianimazione___null;
    }

    public Boolean getData_rianimazione___not___null() {
        return data_rianimazione___not___null;
    }
    public void setData_rianimazione___not___null(Boolean data_rianimazione___not___null) {
        this.data_rianimazione___not___null = data_rianimazione___not___null;
    }

    public java.util.List<String> getData_rianimazione___in() {
        return data_rianimazione___in;
    }
    public void setData_rianimazione___in(java.util.List<String> data_rianimazione___in) {
        this.data_rianimazione___in = data_rianimazione___in;
    }

    public java.util.List<String> getData_rianimazione___not___in() {
        return data_rianimazione___not___in;
    }
    public void setData_rianimazione___not___in(java.util.List<String> data_rianimazione___not___in) {
        this.data_rianimazione___not___in = data_rianimazione___not___in;
    }

    public String getData_rianimazione___lt() {
        return data_rianimazione___lt;
    }
    public void setData_rianimazione___lt(String data_rianimazione___lt) {
        this.data_rianimazione___lt = data_rianimazione___lt;
    }

    public String getData_rianimazione___lte() {
        return data_rianimazione___lte;
    }
    public void setData_rianimazione___lte(String data_rianimazione___lte) {
        this.data_rianimazione___lte = data_rianimazione___lte;
    }

    public String getData_rianimazione___gt() {
        return data_rianimazione___gt;
    }
    public void setData_rianimazione___gt(String data_rianimazione___gt) {
        this.data_rianimazione___gt = data_rianimazione___gt;
    }

    public String getData_rianimazione___gte() {
        return data_rianimazione___gte;
    }
    public void setData_rianimazione___gte(String data_rianimazione___gte) {
        this.data_rianimazione___gte = data_rianimazione___gte;
    }

    public String getData_tampone___eq() {
        return data_tampone___eq;
    }
    public void setData_tampone___eq(String data_tampone___eq) {
        this.data_tampone___eq = data_tampone___eq;
    }

    public String getData_tampone___ne() {
        return data_tampone___ne;
    }
    public void setData_tampone___ne(String data_tampone___ne) {
        this.data_tampone___ne = data_tampone___ne;
    }

    public Boolean getData_tampone___null() {
        return data_tampone___null;
    }
    public void setData_tampone___null(Boolean data_tampone___null) {
        this.data_tampone___null = data_tampone___null;
    }

    public Boolean getData_tampone___not___null() {
        return data_tampone___not___null;
    }
    public void setData_tampone___not___null(Boolean data_tampone___not___null) {
        this.data_tampone___not___null = data_tampone___not___null;
    }

    public java.util.List<String> getData_tampone___in() {
        return data_tampone___in;
    }
    public void setData_tampone___in(java.util.List<String> data_tampone___in) {
        this.data_tampone___in = data_tampone___in;
    }

    public java.util.List<String> getData_tampone___not___in() {
        return data_tampone___not___in;
    }
    public void setData_tampone___not___in(java.util.List<String> data_tampone___not___in) {
        this.data_tampone___not___in = data_tampone___not___in;
    }

    public String getData_tampone___lt() {
        return data_tampone___lt;
    }
    public void setData_tampone___lt(String data_tampone___lt) {
        this.data_tampone___lt = data_tampone___lt;
    }

    public String getData_tampone___lte() {
        return data_tampone___lte;
    }
    public void setData_tampone___lte(String data_tampone___lte) {
        this.data_tampone___lte = data_tampone___lte;
    }

    public String getData_tampone___gt() {
        return data_tampone___gt;
    }
    public void setData_tampone___gt(String data_tampone___gt) {
        this.data_tampone___gt = data_tampone___gt;
    }

    public String getData_tampone___gte() {
        return data_tampone___gte;
    }
    public void setData_tampone___gte(String data_tampone___gte) {
        this.data_tampone___gte = data_tampone___gte;
    }

    public String getData_ultimo_contatto___eq() {
        return data_ultimo_contatto___eq;
    }
    public void setData_ultimo_contatto___eq(String data_ultimo_contatto___eq) {
        this.data_ultimo_contatto___eq = data_ultimo_contatto___eq;
    }

    public String getData_ultimo_contatto___ne() {
        return data_ultimo_contatto___ne;
    }
    public void setData_ultimo_contatto___ne(String data_ultimo_contatto___ne) {
        this.data_ultimo_contatto___ne = data_ultimo_contatto___ne;
    }

    public Boolean getData_ultimo_contatto___null() {
        return data_ultimo_contatto___null;
    }
    public void setData_ultimo_contatto___null(Boolean data_ultimo_contatto___null) {
        this.data_ultimo_contatto___null = data_ultimo_contatto___null;
    }

    public Boolean getData_ultimo_contatto___not___null() {
        return data_ultimo_contatto___not___null;
    }
    public void setData_ultimo_contatto___not___null(Boolean data_ultimo_contatto___not___null) {
        this.data_ultimo_contatto___not___null = data_ultimo_contatto___not___null;
    }

    public java.util.List<String> getData_ultimo_contatto___in() {
        return data_ultimo_contatto___in;
    }
    public void setData_ultimo_contatto___in(java.util.List<String> data_ultimo_contatto___in) {
        this.data_ultimo_contatto___in = data_ultimo_contatto___in;
    }

    public java.util.List<String> getData_ultimo_contatto___not___in() {
        return data_ultimo_contatto___not___in;
    }
    public void setData_ultimo_contatto___not___in(java.util.List<String> data_ultimo_contatto___not___in) {
        this.data_ultimo_contatto___not___in = data_ultimo_contatto___not___in;
    }

    public String getData_ultimo_contatto___lt() {
        return data_ultimo_contatto___lt;
    }
    public void setData_ultimo_contatto___lt(String data_ultimo_contatto___lt) {
        this.data_ultimo_contatto___lt = data_ultimo_contatto___lt;
    }

    public String getData_ultimo_contatto___lte() {
        return data_ultimo_contatto___lte;
    }
    public void setData_ultimo_contatto___lte(String data_ultimo_contatto___lte) {
        this.data_ultimo_contatto___lte = data_ultimo_contatto___lte;
    }

    public String getData_ultimo_contatto___gt() {
        return data_ultimo_contatto___gt;
    }
    public void setData_ultimo_contatto___gt(String data_ultimo_contatto___gt) {
        this.data_ultimo_contatto___gt = data_ultimo_contatto___gt;
    }

    public String getData_ultimo_contatto___gte() {
        return data_ultimo_contatto___gte;
    }
    public void setData_ultimo_contatto___gte(String data_ultimo_contatto___gte) {
        this.data_ultimo_contatto___gte = data_ultimo_contatto___gte;
    }

    public Integer getFerritina___eq() {
        return ferritina___eq;
    }
    public void setFerritina___eq(Integer ferritina___eq) {
        this.ferritina___eq = ferritina___eq;
    }

    public Integer getFerritina___ne() {
        return ferritina___ne;
    }
    public void setFerritina___ne(Integer ferritina___ne) {
        this.ferritina___ne = ferritina___ne;
    }

    public Boolean getFerritina___null() {
        return ferritina___null;
    }
    public void setFerritina___null(Boolean ferritina___null) {
        this.ferritina___null = ferritina___null;
    }

    public Boolean getFerritina___not___null() {
        return ferritina___not___null;
    }
    public void setFerritina___not___null(Boolean ferritina___not___null) {
        this.ferritina___not___null = ferritina___not___null;
    }

    public java.util.List<Integer> getFerritina___in() {
        return ferritina___in;
    }
    public void setFerritina___in(java.util.List<Integer> ferritina___in) {
        this.ferritina___in = ferritina___in;
    }

    public java.util.List<Integer> getFerritina___not___in() {
        return ferritina___not___in;
    }
    public void setFerritina___not___in(java.util.List<Integer> ferritina___not___in) {
        this.ferritina___not___in = ferritina___not___in;
    }

    public Integer getFerritina___lt() {
        return ferritina___lt;
    }
    public void setFerritina___lt(Integer ferritina___lt) {
        this.ferritina___lt = ferritina___lt;
    }

    public Integer getFerritina___lte() {
        return ferritina___lte;
    }
    public void setFerritina___lte(Integer ferritina___lte) {
        this.ferritina___lte = ferritina___lte;
    }

    public Integer getFerritina___gt() {
        return ferritina___gt;
    }
    public void setFerritina___gt(Integer ferritina___gt) {
        this.ferritina___gt = ferritina___gt;
    }

    public Integer getFerritina___gte() {
        return ferritina___gte;
    }
    public void setFerritina___gte(Integer ferritina___gte) {
        this.ferritina___gte = ferritina___gte;
    }

    public Integer getFrequenza_resp___eq() {
        return frequenza_resp___eq;
    }
    public void setFrequenza_resp___eq(Integer frequenza_resp___eq) {
        this.frequenza_resp___eq = frequenza_resp___eq;
    }

    public Integer getFrequenza_resp___ne() {
        return frequenza_resp___ne;
    }
    public void setFrequenza_resp___ne(Integer frequenza_resp___ne) {
        this.frequenza_resp___ne = frequenza_resp___ne;
    }

    public Boolean getFrequenza_resp___null() {
        return frequenza_resp___null;
    }
    public void setFrequenza_resp___null(Boolean frequenza_resp___null) {
        this.frequenza_resp___null = frequenza_resp___null;
    }

    public Boolean getFrequenza_resp___not___null() {
        return frequenza_resp___not___null;
    }
    public void setFrequenza_resp___not___null(Boolean frequenza_resp___not___null) {
        this.frequenza_resp___not___null = frequenza_resp___not___null;
    }

    public java.util.List<Integer> getFrequenza_resp___in() {
        return frequenza_resp___in;
    }
    public void setFrequenza_resp___in(java.util.List<Integer> frequenza_resp___in) {
        this.frequenza_resp___in = frequenza_resp___in;
    }

    public java.util.List<Integer> getFrequenza_resp___not___in() {
        return frequenza_resp___not___in;
    }
    public void setFrequenza_resp___not___in(java.util.List<Integer> frequenza_resp___not___in) {
        this.frequenza_resp___not___in = frequenza_resp___not___in;
    }

    public Integer getFrequenza_resp___lt() {
        return frequenza_resp___lt;
    }
    public void setFrequenza_resp___lt(Integer frequenza_resp___lt) {
        this.frequenza_resp___lt = frequenza_resp___lt;
    }

    public Integer getFrequenza_resp___lte() {
        return frequenza_resp___lte;
    }
    public void setFrequenza_resp___lte(Integer frequenza_resp___lte) {
        this.frequenza_resp___lte = frequenza_resp___lte;
    }

    public Integer getFrequenza_resp___gt() {
        return frequenza_resp___gt;
    }
    public void setFrequenza_resp___gt(Integer frequenza_resp___gt) {
        this.frequenza_resp___gt = frequenza_resp___gt;
    }

    public Integer getFrequenza_resp___gte() {
        return frequenza_resp___gte;
    }
    public void setFrequenza_resp___gte(Integer frequenza_resp___gte) {
        this.frequenza_resp___gte = frequenza_resp___gte;
    }

    public String getFumatore___eq() {
        return fumatore___eq;
    }
    public void setFumatore___eq(String fumatore___eq) {
        this.fumatore___eq = fumatore___eq;
    }

    public String getFumatore___ne() {
        return fumatore___ne;
    }
    public void setFumatore___ne(String fumatore___ne) {
        this.fumatore___ne = fumatore___ne;
    }

    public Boolean getFumatore___null() {
        return fumatore___null;
    }
    public void setFumatore___null(Boolean fumatore___null) {
        this.fumatore___null = fumatore___null;
    }

    public Boolean getFumatore___not___null() {
        return fumatore___not___null;
    }
    public void setFumatore___not___null(Boolean fumatore___not___null) {
        this.fumatore___not___null = fumatore___not___null;
    }

    public java.util.List<String> getFumatore___in() {
        return fumatore___in;
    }
    public void setFumatore___in(java.util.List<String> fumatore___in) {
        this.fumatore___in = fumatore___in;
    }

    public java.util.List<String> getFumatore___not___in() {
        return fumatore___not___in;
    }
    public void setFumatore___not___in(java.util.List<String> fumatore___not___in) {
        this.fumatore___not___in = fumatore___not___in;
    }

    public String getFumatore___lt() {
        return fumatore___lt;
    }
    public void setFumatore___lt(String fumatore___lt) {
        this.fumatore___lt = fumatore___lt;
    }

    public String getFumatore___lte() {
        return fumatore___lte;
    }
    public void setFumatore___lte(String fumatore___lte) {
        this.fumatore___lte = fumatore___lte;
    }

    public String getFumatore___gt() {
        return fumatore___gt;
    }
    public void setFumatore___gt(String fumatore___gt) {
        this.fumatore___gt = fumatore___gt;
    }

    public String getFumatore___gte() {
        return fumatore___gte;
    }
    public void setFumatore___gte(String fumatore___gte) {
        this.fumatore___gte = fumatore___gte;
    }

    public String getFumatore___contains() {
        return fumatore___contains;
    }
    public void setFumatore___contains(String fumatore___contains) {
        this.fumatore___contains = fumatore___contains;
    }

    public String getFumatore___not___contains() {
        return fumatore___not___contains;
    }
    public void setFumatore___not___contains(String fumatore___not___contains) {
        this.fumatore___not___contains = fumatore___not___contains;
    }

    public String getFumatore___starts_with() {
        return fumatore___starts_with;
    }
    public void setFumatore___starts_with(String fumatore___starts_with) {
        this.fumatore___starts_with = fumatore___starts_with;
    }

    public String getFumatore___not___starts_with() {
        return fumatore___not___starts_with;
    }
    public void setFumatore___not___starts_with(String fumatore___not___starts_with) {
        this.fumatore___not___starts_with = fumatore___not___starts_with;
    }

    public String getFumatore___ends_with() {
        return fumatore___ends_with;
    }
    public void setFumatore___ends_with(String fumatore___ends_with) {
        this.fumatore___ends_with = fumatore___ends_with;
    }

    public String getFumatore___not___ends_with() {
        return fumatore___not___ends_with;
    }
    public void setFumatore___not___ends_with(String fumatore___not___ends_with) {
        this.fumatore___not___ends_with = fumatore___not___ends_with;
    }

    public Integer getHivrna_diagnosi_covid___eq() {
        return hivrna_diagnosi_covid___eq;
    }
    public void setHivrna_diagnosi_covid___eq(Integer hivrna_diagnosi_covid___eq) {
        this.hivrna_diagnosi_covid___eq = hivrna_diagnosi_covid___eq;
    }

    public Integer getHivrna_diagnosi_covid___ne() {
        return hivrna_diagnosi_covid___ne;
    }
    public void setHivrna_diagnosi_covid___ne(Integer hivrna_diagnosi_covid___ne) {
        this.hivrna_diagnosi_covid___ne = hivrna_diagnosi_covid___ne;
    }

    public Boolean getHivrna_diagnosi_covid___null() {
        return hivrna_diagnosi_covid___null;
    }
    public void setHivrna_diagnosi_covid___null(Boolean hivrna_diagnosi_covid___null) {
        this.hivrna_diagnosi_covid___null = hivrna_diagnosi_covid___null;
    }

    public Boolean getHivrna_diagnosi_covid___not___null() {
        return hivrna_diagnosi_covid___not___null;
    }
    public void setHivrna_diagnosi_covid___not___null(Boolean hivrna_diagnosi_covid___not___null) {
        this.hivrna_diagnosi_covid___not___null = hivrna_diagnosi_covid___not___null;
    }

    public java.util.List<Integer> getHivrna_diagnosi_covid___in() {
        return hivrna_diagnosi_covid___in;
    }
    public void setHivrna_diagnosi_covid___in(java.util.List<Integer> hivrna_diagnosi_covid___in) {
        this.hivrna_diagnosi_covid___in = hivrna_diagnosi_covid___in;
    }

    public java.util.List<Integer> getHivrna_diagnosi_covid___not___in() {
        return hivrna_diagnosi_covid___not___in;
    }
    public void setHivrna_diagnosi_covid___not___in(java.util.List<Integer> hivrna_diagnosi_covid___not___in) {
        this.hivrna_diagnosi_covid___not___in = hivrna_diagnosi_covid___not___in;
    }

    public Integer getHivrna_diagnosi_covid___lt() {
        return hivrna_diagnosi_covid___lt;
    }
    public void setHivrna_diagnosi_covid___lt(Integer hivrna_diagnosi_covid___lt) {
        this.hivrna_diagnosi_covid___lt = hivrna_diagnosi_covid___lt;
    }

    public Integer getHivrna_diagnosi_covid___lte() {
        return hivrna_diagnosi_covid___lte;
    }
    public void setHivrna_diagnosi_covid___lte(Integer hivrna_diagnosi_covid___lte) {
        this.hivrna_diagnosi_covid___lte = hivrna_diagnosi_covid___lte;
    }

    public Integer getHivrna_diagnosi_covid___gt() {
        return hivrna_diagnosi_covid___gt;
    }
    public void setHivrna_diagnosi_covid___gt(Integer hivrna_diagnosi_covid___gt) {
        this.hivrna_diagnosi_covid___gt = hivrna_diagnosi_covid___gt;
    }

    public Integer getHivrna_diagnosi_covid___gte() {
        return hivrna_diagnosi_covid___gte;
    }
    public void setHivrna_diagnosi_covid___gte(Integer hivrna_diagnosi_covid___gte) {
        this.hivrna_diagnosi_covid___gte = hivrna_diagnosi_covid___gte;
    }

    public Integer getLdh___eq() {
        return ldh___eq;
    }
    public void setLdh___eq(Integer ldh___eq) {
        this.ldh___eq = ldh___eq;
    }

    public Integer getLdh___ne() {
        return ldh___ne;
    }
    public void setLdh___ne(Integer ldh___ne) {
        this.ldh___ne = ldh___ne;
    }

    public Boolean getLdh___null() {
        return ldh___null;
    }
    public void setLdh___null(Boolean ldh___null) {
        this.ldh___null = ldh___null;
    }

    public Boolean getLdh___not___null() {
        return ldh___not___null;
    }
    public void setLdh___not___null(Boolean ldh___not___null) {
        this.ldh___not___null = ldh___not___null;
    }

    public java.util.List<Integer> getLdh___in() {
        return ldh___in;
    }
    public void setLdh___in(java.util.List<Integer> ldh___in) {
        this.ldh___in = ldh___in;
    }

    public java.util.List<Integer> getLdh___not___in() {
        return ldh___not___in;
    }
    public void setLdh___not___in(java.util.List<Integer> ldh___not___in) {
        this.ldh___not___in = ldh___not___in;
    }

    public Integer getLdh___lt() {
        return ldh___lt;
    }
    public void setLdh___lt(Integer ldh___lt) {
        this.ldh___lt = ldh___lt;
    }

    public Integer getLdh___lte() {
        return ldh___lte;
    }
    public void setLdh___lte(Integer ldh___lte) {
        this.ldh___lte = ldh___lte;
    }

    public Integer getLdh___gt() {
        return ldh___gt;
    }
    public void setLdh___gt(Integer ldh___gt) {
        this.ldh___gt = ldh___gt;
    }

    public Integer getLdh___gte() {
        return ldh___gte;
    }
    public void setLdh___gte(Integer ldh___gte) {
        this.ldh___gte = ldh___gte;
    }

    public Integer getLeucociti___eq() {
        return leucociti___eq;
    }
    public void setLeucociti___eq(Integer leucociti___eq) {
        this.leucociti___eq = leucociti___eq;
    }

    public Integer getLeucociti___ne() {
        return leucociti___ne;
    }
    public void setLeucociti___ne(Integer leucociti___ne) {
        this.leucociti___ne = leucociti___ne;
    }

    public Boolean getLeucociti___null() {
        return leucociti___null;
    }
    public void setLeucociti___null(Boolean leucociti___null) {
        this.leucociti___null = leucociti___null;
    }

    public Boolean getLeucociti___not___null() {
        return leucociti___not___null;
    }
    public void setLeucociti___not___null(Boolean leucociti___not___null) {
        this.leucociti___not___null = leucociti___not___null;
    }

    public java.util.List<Integer> getLeucociti___in() {
        return leucociti___in;
    }
    public void setLeucociti___in(java.util.List<Integer> leucociti___in) {
        this.leucociti___in = leucociti___in;
    }

    public java.util.List<Integer> getLeucociti___not___in() {
        return leucociti___not___in;
    }
    public void setLeucociti___not___in(java.util.List<Integer> leucociti___not___in) {
        this.leucociti___not___in = leucociti___not___in;
    }

    public Integer getLeucociti___lt() {
        return leucociti___lt;
    }
    public void setLeucociti___lt(Integer leucociti___lt) {
        this.leucociti___lt = leucociti___lt;
    }

    public Integer getLeucociti___lte() {
        return leucociti___lte;
    }
    public void setLeucociti___lte(Integer leucociti___lte) {
        this.leucociti___lte = leucociti___lte;
    }

    public Integer getLeucociti___gt() {
        return leucociti___gt;
    }
    public void setLeucociti___gt(Integer leucociti___gt) {
        this.leucociti___gt = leucociti___gt;
    }

    public Integer getLeucociti___gte() {
        return leucociti___gte;
    }
    public void setLeucociti___gte(Integer leucociti___gte) {
        this.leucociti___gte = leucociti___gte;
    }

    public Integer getLinfociti___eq() {
        return linfociti___eq;
    }
    public void setLinfociti___eq(Integer linfociti___eq) {
        this.linfociti___eq = linfociti___eq;
    }

    public Integer getLinfociti___ne() {
        return linfociti___ne;
    }
    public void setLinfociti___ne(Integer linfociti___ne) {
        this.linfociti___ne = linfociti___ne;
    }

    public Boolean getLinfociti___null() {
        return linfociti___null;
    }
    public void setLinfociti___null(Boolean linfociti___null) {
        this.linfociti___null = linfociti___null;
    }

    public Boolean getLinfociti___not___null() {
        return linfociti___not___null;
    }
    public void setLinfociti___not___null(Boolean linfociti___not___null) {
        this.linfociti___not___null = linfociti___not___null;
    }

    public java.util.List<Integer> getLinfociti___in() {
        return linfociti___in;
    }
    public void setLinfociti___in(java.util.List<Integer> linfociti___in) {
        this.linfociti___in = linfociti___in;
    }

    public java.util.List<Integer> getLinfociti___not___in() {
        return linfociti___not___in;
    }
    public void setLinfociti___not___in(java.util.List<Integer> linfociti___not___in) {
        this.linfociti___not___in = linfociti___not___in;
    }

    public Integer getLinfociti___lt() {
        return linfociti___lt;
    }
    public void setLinfociti___lt(Integer linfociti___lt) {
        this.linfociti___lt = linfociti___lt;
    }

    public Integer getLinfociti___lte() {
        return linfociti___lte;
    }
    public void setLinfociti___lte(Integer linfociti___lte) {
        this.linfociti___lte = linfociti___lte;
    }

    public Integer getLinfociti___gt() {
        return linfociti___gt;
    }
    public void setLinfociti___gt(Integer linfociti___gt) {
        this.linfociti___gt = linfociti___gt;
    }

    public Integer getLinfociti___gte() {
        return linfociti___gte;
    }
    public void setLinfociti___gte(Integer linfociti___gte) {
        this.linfociti___gte = linfociti___gte;
    }

    public Boolean getObeso___eq() {
        return obeso___eq;
    }
    public void setObeso___eq(Boolean obeso___eq) {
        this.obeso___eq = obeso___eq;
    }

    public Boolean getObeso___ne() {
        return obeso___ne;
    }
    public void setObeso___ne(Boolean obeso___ne) {
        this.obeso___ne = obeso___ne;
    }

    public Boolean getObeso___null() {
        return obeso___null;
    }
    public void setObeso___null(Boolean obeso___null) {
        this.obeso___null = obeso___null;
    }

    public Boolean getObeso___not___null() {
        return obeso___not___null;
    }
    public void setObeso___not___null(Boolean obeso___not___null) {
        this.obeso___not___null = obeso___not___null;
    }

    public Boolean getOspedalizzazione___eq() {
        return ospedalizzazione___eq;
    }
    public void setOspedalizzazione___eq(Boolean ospedalizzazione___eq) {
        this.ospedalizzazione___eq = ospedalizzazione___eq;
    }

    public Boolean getOspedalizzazione___ne() {
        return ospedalizzazione___ne;
    }
    public void setOspedalizzazione___ne(Boolean ospedalizzazione___ne) {
        this.ospedalizzazione___ne = ospedalizzazione___ne;
    }

    public Boolean getOspedalizzazione___null() {
        return ospedalizzazione___null;
    }
    public void setOspedalizzazione___null(Boolean ospedalizzazione___null) {
        this.ospedalizzazione___null = ospedalizzazione___null;
    }

    public Boolean getOspedalizzazione___not___null() {
        return ospedalizzazione___not___null;
    }
    public void setOspedalizzazione___not___null(Boolean ospedalizzazione___not___null) {
        this.ospedalizzazione___not___null = ospedalizzazione___not___null;
    }

    public String getOutcome_altro___eq() {
        return outcome_altro___eq;
    }
    public void setOutcome_altro___eq(String outcome_altro___eq) {
        this.outcome_altro___eq = outcome_altro___eq;
    }

    public String getOutcome_altro___ne() {
        return outcome_altro___ne;
    }
    public void setOutcome_altro___ne(String outcome_altro___ne) {
        this.outcome_altro___ne = outcome_altro___ne;
    }

    public Boolean getOutcome_altro___null() {
        return outcome_altro___null;
    }
    public void setOutcome_altro___null(Boolean outcome_altro___null) {
        this.outcome_altro___null = outcome_altro___null;
    }

    public Boolean getOutcome_altro___not___null() {
        return outcome_altro___not___null;
    }
    public void setOutcome_altro___not___null(Boolean outcome_altro___not___null) {
        this.outcome_altro___not___null = outcome_altro___not___null;
    }

    public java.util.List<String> getOutcome_altro___in() {
        return outcome_altro___in;
    }
    public void setOutcome_altro___in(java.util.List<String> outcome_altro___in) {
        this.outcome_altro___in = outcome_altro___in;
    }

    public java.util.List<String> getOutcome_altro___not___in() {
        return outcome_altro___not___in;
    }
    public void setOutcome_altro___not___in(java.util.List<String> outcome_altro___not___in) {
        this.outcome_altro___not___in = outcome_altro___not___in;
    }

    public String getOutcome_altro___lt() {
        return outcome_altro___lt;
    }
    public void setOutcome_altro___lt(String outcome_altro___lt) {
        this.outcome_altro___lt = outcome_altro___lt;
    }

    public String getOutcome_altro___lte() {
        return outcome_altro___lte;
    }
    public void setOutcome_altro___lte(String outcome_altro___lte) {
        this.outcome_altro___lte = outcome_altro___lte;
    }

    public String getOutcome_altro___gt() {
        return outcome_altro___gt;
    }
    public void setOutcome_altro___gt(String outcome_altro___gt) {
        this.outcome_altro___gt = outcome_altro___gt;
    }

    public String getOutcome_altro___gte() {
        return outcome_altro___gte;
    }
    public void setOutcome_altro___gte(String outcome_altro___gte) {
        this.outcome_altro___gte = outcome_altro___gte;
    }

    public String getOutcome_altro___contains() {
        return outcome_altro___contains;
    }
    public void setOutcome_altro___contains(String outcome_altro___contains) {
        this.outcome_altro___contains = outcome_altro___contains;
    }

    public String getOutcome_altro___not___contains() {
        return outcome_altro___not___contains;
    }
    public void setOutcome_altro___not___contains(String outcome_altro___not___contains) {
        this.outcome_altro___not___contains = outcome_altro___not___contains;
    }

    public String getOutcome_altro___starts_with() {
        return outcome_altro___starts_with;
    }
    public void setOutcome_altro___starts_with(String outcome_altro___starts_with) {
        this.outcome_altro___starts_with = outcome_altro___starts_with;
    }

    public String getOutcome_altro___not___starts_with() {
        return outcome_altro___not___starts_with;
    }
    public void setOutcome_altro___not___starts_with(String outcome_altro___not___starts_with) {
        this.outcome_altro___not___starts_with = outcome_altro___not___starts_with;
    }

    public String getOutcome_altro___ends_with() {
        return outcome_altro___ends_with;
    }
    public void setOutcome_altro___ends_with(String outcome_altro___ends_with) {
        this.outcome_altro___ends_with = outcome_altro___ends_with;
    }

    public String getOutcome_altro___not___ends_with() {
        return outcome_altro___not___ends_with;
    }
    public void setOutcome_altro___not___ends_with(String outcome_altro___not___ends_with) {
        this.outcome_altro___not___ends_with = outcome_altro___not___ends_with;
    }

    public Integer getPcr___eq() {
        return pcr___eq;
    }
    public void setPcr___eq(Integer pcr___eq) {
        this.pcr___eq = pcr___eq;
    }

    public Integer getPcr___ne() {
        return pcr___ne;
    }
    public void setPcr___ne(Integer pcr___ne) {
        this.pcr___ne = pcr___ne;
    }

    public Boolean getPcr___null() {
        return pcr___null;
    }
    public void setPcr___null(Boolean pcr___null) {
        this.pcr___null = pcr___null;
    }

    public Boolean getPcr___not___null() {
        return pcr___not___null;
    }
    public void setPcr___not___null(Boolean pcr___not___null) {
        this.pcr___not___null = pcr___not___null;
    }

    public java.util.List<Integer> getPcr___in() {
        return pcr___in;
    }
    public void setPcr___in(java.util.List<Integer> pcr___in) {
        this.pcr___in = pcr___in;
    }

    public java.util.List<Integer> getPcr___not___in() {
        return pcr___not___in;
    }
    public void setPcr___not___in(java.util.List<Integer> pcr___not___in) {
        this.pcr___not___in = pcr___not___in;
    }

    public Integer getPcr___lt() {
        return pcr___lt;
    }
    public void setPcr___lt(Integer pcr___lt) {
        this.pcr___lt = pcr___lt;
    }

    public Integer getPcr___lte() {
        return pcr___lte;
    }
    public void setPcr___lte(Integer pcr___lte) {
        this.pcr___lte = pcr___lte;
    }

    public Integer getPcr___gt() {
        return pcr___gt;
    }
    public void setPcr___gt(Integer pcr___gt) {
        this.pcr___gt = pcr___gt;
    }

    public Integer getPcr___gte() {
        return pcr___gte;
    }
    public void setPcr___gte(Integer pcr___gte) {
        this.pcr___gte = pcr___gte;
    }

    public String getPo2_fio2_ingresso___eq() {
        return po2_fio2_ingresso___eq;
    }
    public void setPo2_fio2_ingresso___eq(String po2_fio2_ingresso___eq) {
        this.po2_fio2_ingresso___eq = po2_fio2_ingresso___eq;
    }

    public String getPo2_fio2_ingresso___ne() {
        return po2_fio2_ingresso___ne;
    }
    public void setPo2_fio2_ingresso___ne(String po2_fio2_ingresso___ne) {
        this.po2_fio2_ingresso___ne = po2_fio2_ingresso___ne;
    }

    public Boolean getPo2_fio2_ingresso___null() {
        return po2_fio2_ingresso___null;
    }
    public void setPo2_fio2_ingresso___null(Boolean po2_fio2_ingresso___null) {
        this.po2_fio2_ingresso___null = po2_fio2_ingresso___null;
    }

    public Boolean getPo2_fio2_ingresso___not___null() {
        return po2_fio2_ingresso___not___null;
    }
    public void setPo2_fio2_ingresso___not___null(Boolean po2_fio2_ingresso___not___null) {
        this.po2_fio2_ingresso___not___null = po2_fio2_ingresso___not___null;
    }

    public java.util.List<String> getPo2_fio2_ingresso___in() {
        return po2_fio2_ingresso___in;
    }
    public void setPo2_fio2_ingresso___in(java.util.List<String> po2_fio2_ingresso___in) {
        this.po2_fio2_ingresso___in = po2_fio2_ingresso___in;
    }

    public java.util.List<String> getPo2_fio2_ingresso___not___in() {
        return po2_fio2_ingresso___not___in;
    }
    public void setPo2_fio2_ingresso___not___in(java.util.List<String> po2_fio2_ingresso___not___in) {
        this.po2_fio2_ingresso___not___in = po2_fio2_ingresso___not___in;
    }

    public String getPo2_fio2_ingresso___lt() {
        return po2_fio2_ingresso___lt;
    }
    public void setPo2_fio2_ingresso___lt(String po2_fio2_ingresso___lt) {
        this.po2_fio2_ingresso___lt = po2_fio2_ingresso___lt;
    }

    public String getPo2_fio2_ingresso___lte() {
        return po2_fio2_ingresso___lte;
    }
    public void setPo2_fio2_ingresso___lte(String po2_fio2_ingresso___lte) {
        this.po2_fio2_ingresso___lte = po2_fio2_ingresso___lte;
    }

    public String getPo2_fio2_ingresso___gt() {
        return po2_fio2_ingresso___gt;
    }
    public void setPo2_fio2_ingresso___gt(String po2_fio2_ingresso___gt) {
        this.po2_fio2_ingresso___gt = po2_fio2_ingresso___gt;
    }

    public String getPo2_fio2_ingresso___gte() {
        return po2_fio2_ingresso___gte;
    }
    public void setPo2_fio2_ingresso___gte(String po2_fio2_ingresso___gte) {
        this.po2_fio2_ingresso___gte = po2_fio2_ingresso___gte;
    }

    public Boolean getRianimazione___eq() {
        return rianimazione___eq;
    }
    public void setRianimazione___eq(Boolean rianimazione___eq) {
        this.rianimazione___eq = rianimazione___eq;
    }

    public Boolean getRianimazione___ne() {
        return rianimazione___ne;
    }
    public void setRianimazione___ne(Boolean rianimazione___ne) {
        this.rianimazione___ne = rianimazione___ne;
    }

    public Boolean getRianimazione___null() {
        return rianimazione___null;
    }
    public void setRianimazione___null(Boolean rianimazione___null) {
        this.rianimazione___null = rianimazione___null;
    }

    public Boolean getRianimazione___not___null() {
        return rianimazione___not___null;
    }
    public void setRianimazione___not___null(Boolean rianimazione___not___null) {
        this.rianimazione___not___null = rianimazione___not___null;
    }

    public String getSintomi_altro___eq() {
        return sintomi_altro___eq;
    }
    public void setSintomi_altro___eq(String sintomi_altro___eq) {
        this.sintomi_altro___eq = sintomi_altro___eq;
    }

    public String getSintomi_altro___ne() {
        return sintomi_altro___ne;
    }
    public void setSintomi_altro___ne(String sintomi_altro___ne) {
        this.sintomi_altro___ne = sintomi_altro___ne;
    }

    public Boolean getSintomi_altro___null() {
        return sintomi_altro___null;
    }
    public void setSintomi_altro___null(Boolean sintomi_altro___null) {
        this.sintomi_altro___null = sintomi_altro___null;
    }

    public Boolean getSintomi_altro___not___null() {
        return sintomi_altro___not___null;
    }
    public void setSintomi_altro___not___null(Boolean sintomi_altro___not___null) {
        this.sintomi_altro___not___null = sintomi_altro___not___null;
    }

    public java.util.List<String> getSintomi_altro___in() {
        return sintomi_altro___in;
    }
    public void setSintomi_altro___in(java.util.List<String> sintomi_altro___in) {
        this.sintomi_altro___in = sintomi_altro___in;
    }

    public java.util.List<String> getSintomi_altro___not___in() {
        return sintomi_altro___not___in;
    }
    public void setSintomi_altro___not___in(java.util.List<String> sintomi_altro___not___in) {
        this.sintomi_altro___not___in = sintomi_altro___not___in;
    }

    public String getSintomi_altro___lt() {
        return sintomi_altro___lt;
    }
    public void setSintomi_altro___lt(String sintomi_altro___lt) {
        this.sintomi_altro___lt = sintomi_altro___lt;
    }

    public String getSintomi_altro___lte() {
        return sintomi_altro___lte;
    }
    public void setSintomi_altro___lte(String sintomi_altro___lte) {
        this.sintomi_altro___lte = sintomi_altro___lte;
    }

    public String getSintomi_altro___gt() {
        return sintomi_altro___gt;
    }
    public void setSintomi_altro___gt(String sintomi_altro___gt) {
        this.sintomi_altro___gt = sintomi_altro___gt;
    }

    public String getSintomi_altro___gte() {
        return sintomi_altro___gte;
    }
    public void setSintomi_altro___gte(String sintomi_altro___gte) {
        this.sintomi_altro___gte = sintomi_altro___gte;
    }

    public String getSintomi_altro___contains() {
        return sintomi_altro___contains;
    }
    public void setSintomi_altro___contains(String sintomi_altro___contains) {
        this.sintomi_altro___contains = sintomi_altro___contains;
    }

    public String getSintomi_altro___not___contains() {
        return sintomi_altro___not___contains;
    }
    public void setSintomi_altro___not___contains(String sintomi_altro___not___contains) {
        this.sintomi_altro___not___contains = sintomi_altro___not___contains;
    }

    public String getSintomi_altro___starts_with() {
        return sintomi_altro___starts_with;
    }
    public void setSintomi_altro___starts_with(String sintomi_altro___starts_with) {
        this.sintomi_altro___starts_with = sintomi_altro___starts_with;
    }

    public String getSintomi_altro___not___starts_with() {
        return sintomi_altro___not___starts_with;
    }
    public void setSintomi_altro___not___starts_with(String sintomi_altro___not___starts_with) {
        this.sintomi_altro___not___starts_with = sintomi_altro___not___starts_with;
    }

    public String getSintomi_altro___ends_with() {
        return sintomi_altro___ends_with;
    }
    public void setSintomi_altro___ends_with(String sintomi_altro___ends_with) {
        this.sintomi_altro___ends_with = sintomi_altro___ends_with;
    }

    public String getSintomi_altro___not___ends_with() {
        return sintomi_altro___not___ends_with;
    }
    public void setSintomi_altro___not___ends_with(String sintomi_altro___not___ends_with) {
        this.sintomi_altro___not___ends_with = sintomi_altro___not___ends_with;
    }

    public String getSpo2_ingresso___eq() {
        return spo2_ingresso___eq;
    }
    public void setSpo2_ingresso___eq(String spo2_ingresso___eq) {
        this.spo2_ingresso___eq = spo2_ingresso___eq;
    }

    public String getSpo2_ingresso___ne() {
        return spo2_ingresso___ne;
    }
    public void setSpo2_ingresso___ne(String spo2_ingresso___ne) {
        this.spo2_ingresso___ne = spo2_ingresso___ne;
    }

    public Boolean getSpo2_ingresso___null() {
        return spo2_ingresso___null;
    }
    public void setSpo2_ingresso___null(Boolean spo2_ingresso___null) {
        this.spo2_ingresso___null = spo2_ingresso___null;
    }

    public Boolean getSpo2_ingresso___not___null() {
        return spo2_ingresso___not___null;
    }
    public void setSpo2_ingresso___not___null(Boolean spo2_ingresso___not___null) {
        this.spo2_ingresso___not___null = spo2_ingresso___not___null;
    }

    public java.util.List<String> getSpo2_ingresso___in() {
        return spo2_ingresso___in;
    }
    public void setSpo2_ingresso___in(java.util.List<String> spo2_ingresso___in) {
        this.spo2_ingresso___in = spo2_ingresso___in;
    }

    public java.util.List<String> getSpo2_ingresso___not___in() {
        return spo2_ingresso___not___in;
    }
    public void setSpo2_ingresso___not___in(java.util.List<String> spo2_ingresso___not___in) {
        this.spo2_ingresso___not___in = spo2_ingresso___not___in;
    }

    public String getSpo2_ingresso___lt() {
        return spo2_ingresso___lt;
    }
    public void setSpo2_ingresso___lt(String spo2_ingresso___lt) {
        this.spo2_ingresso___lt = spo2_ingresso___lt;
    }

    public String getSpo2_ingresso___lte() {
        return spo2_ingresso___lte;
    }
    public void setSpo2_ingresso___lte(String spo2_ingresso___lte) {
        this.spo2_ingresso___lte = spo2_ingresso___lte;
    }

    public String getSpo2_ingresso___gt() {
        return spo2_ingresso___gt;
    }
    public void setSpo2_ingresso___gt(String spo2_ingresso___gt) {
        this.spo2_ingresso___gt = spo2_ingresso___gt;
    }

    public String getSpo2_ingresso___gte() {
        return spo2_ingresso___gte;
    }
    public void setSpo2_ingresso___gte(String spo2_ingresso___gte) {
        this.spo2_ingresso___gte = spo2_ingresso___gte;
    }

    public String getSpo2_ingresso___contains() {
        return spo2_ingresso___contains;
    }
    public void setSpo2_ingresso___contains(String spo2_ingresso___contains) {
        this.spo2_ingresso___contains = spo2_ingresso___contains;
    }

    public String getSpo2_ingresso___not___contains() {
        return spo2_ingresso___not___contains;
    }
    public void setSpo2_ingresso___not___contains(String spo2_ingresso___not___contains) {
        this.spo2_ingresso___not___contains = spo2_ingresso___not___contains;
    }

    public String getSpo2_ingresso___starts_with() {
        return spo2_ingresso___starts_with;
    }
    public void setSpo2_ingresso___starts_with(String spo2_ingresso___starts_with) {
        this.spo2_ingresso___starts_with = spo2_ingresso___starts_with;
    }

    public String getSpo2_ingresso___not___starts_with() {
        return spo2_ingresso___not___starts_with;
    }
    public void setSpo2_ingresso___not___starts_with(String spo2_ingresso___not___starts_with) {
        this.spo2_ingresso___not___starts_with = spo2_ingresso___not___starts_with;
    }

    public String getSpo2_ingresso___ends_with() {
        return spo2_ingresso___ends_with;
    }
    public void setSpo2_ingresso___ends_with(String spo2_ingresso___ends_with) {
        this.spo2_ingresso___ends_with = spo2_ingresso___ends_with;
    }

    public String getSpo2_ingresso___not___ends_with() {
        return spo2_ingresso___not___ends_with;
    }
    public void setSpo2_ingresso___not___ends_with(String spo2_ingresso___not___ends_with) {
        this.spo2_ingresso___not___ends_with = spo2_ingresso___not___ends_with;
    }

    public java.util.List<CliC_dettaglioFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliC_dettaglioFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliC_dettaglioFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliC_dettaglioFilterDTO> OR) {
        this.OR = OR;
    }

    public CliC_dettaglioFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliC_dettaglioFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
        }
        if (_id___eq != null) {
            joiner.add("_id___eq: " + GraphQLRequestSerializer.getEntry(_id___eq));
        }
        if (_id___ne != null) {
            joiner.add("_id___ne: " + GraphQLRequestSerializer.getEntry(_id___ne));
        }
        if (_id___null != null) {
            joiner.add("_id___null: " + GraphQLRequestSerializer.getEntry(_id___null));
        }
        if (_id___not___null != null) {
            joiner.add("_id___not___null: " + GraphQLRequestSerializer.getEntry(_id___not___null));
        }
        if (_id___in != null) {
            joiner.add("_id___in: " + GraphQLRequestSerializer.getEntry(_id___in));
        }
        if (_id___not___in != null) {
            joiner.add("_id___not___in: " + GraphQLRequestSerializer.getEntry(_id___not___in));
        }
        if (_id___lt != null) {
            joiner.add("_id___lt: " + GraphQLRequestSerializer.getEntry(_id___lt));
        }
        if (_id___lte != null) {
            joiner.add("_id___lte: " + GraphQLRequestSerializer.getEntry(_id___lte));
        }
        if (_id___gt != null) {
            joiner.add("_id___gt: " + GraphQLRequestSerializer.getEntry(_id___gt));
        }
        if (_id___gte != null) {
            joiner.add("_id___gte: " + GraphQLRequestSerializer.getEntry(_id___gte));
        }
        if (anosmia_disgeusia___eq != null) {
            joiner.add("anosmia_disgeusia___eq: " + GraphQLRequestSerializer.getEntry(anosmia_disgeusia___eq));
        }
        if (anosmia_disgeusia___ne != null) {
            joiner.add("anosmia_disgeusia___ne: " + GraphQLRequestSerializer.getEntry(anosmia_disgeusia___ne));
        }
        if (anosmia_disgeusia___null != null) {
            joiner.add("anosmia_disgeusia___null: " + GraphQLRequestSerializer.getEntry(anosmia_disgeusia___null));
        }
        if (anosmia_disgeusia___not___null != null) {
            joiner.add("anosmia_disgeusia___not___null: " + GraphQLRequestSerializer.getEntry(anosmia_disgeusia___not___null));
        }
        if (bmi___eq != null) {
            joiner.add("bmi___eq: " + GraphQLRequestSerializer.getEntry(bmi___eq));
        }
        if (bmi___ne != null) {
            joiner.add("bmi___ne: " + GraphQLRequestSerializer.getEntry(bmi___ne));
        }
        if (bmi___null != null) {
            joiner.add("bmi___null: " + GraphQLRequestSerializer.getEntry(bmi___null));
        }
        if (bmi___not___null != null) {
            joiner.add("bmi___not___null: " + GraphQLRequestSerializer.getEntry(bmi___not___null));
        }
        if (bmi___in != null) {
            joiner.add("bmi___in: " + GraphQLRequestSerializer.getEntry(bmi___in));
        }
        if (bmi___not___in != null) {
            joiner.add("bmi___not___in: " + GraphQLRequestSerializer.getEntry(bmi___not___in));
        }
        if (bmi___lt != null) {
            joiner.add("bmi___lt: " + GraphQLRequestSerializer.getEntry(bmi___lt));
        }
        if (bmi___lte != null) {
            joiner.add("bmi___lte: " + GraphQLRequestSerializer.getEntry(bmi___lte));
        }
        if (bmi___gt != null) {
            joiner.add("bmi___gt: " + GraphQLRequestSerializer.getEntry(bmi___gt));
        }
        if (bmi___gte != null) {
            joiner.add("bmi___gte: " + GraphQLRequestSerializer.getEntry(bmi___gte));
        }
        if (cd4_diagnosi_covid___eq != null) {
            joiner.add("cd4_diagnosi_covid___eq: " + GraphQLRequestSerializer.getEntry(cd4_diagnosi_covid___eq));
        }
        if (cd4_diagnosi_covid___ne != null) {
            joiner.add("cd4_diagnosi_covid___ne: " + GraphQLRequestSerializer.getEntry(cd4_diagnosi_covid___ne));
        }
        if (cd4_diagnosi_covid___null != null) {
            joiner.add("cd4_diagnosi_covid___null: " + GraphQLRequestSerializer.getEntry(cd4_diagnosi_covid___null));
        }
        if (cd4_diagnosi_covid___not___null != null) {
            joiner.add("cd4_diagnosi_covid___not___null: " + GraphQLRequestSerializer.getEntry(cd4_diagnosi_covid___not___null));
        }
        if (cd4_diagnosi_covid___in != null) {
            joiner.add("cd4_diagnosi_covid___in: " + GraphQLRequestSerializer.getEntry(cd4_diagnosi_covid___in));
        }
        if (cd4_diagnosi_covid___not___in != null) {
            joiner.add("cd4_diagnosi_covid___not___in: " + GraphQLRequestSerializer.getEntry(cd4_diagnosi_covid___not___in));
        }
        if (cd4_diagnosi_covid___lt != null) {
            joiner.add("cd4_diagnosi_covid___lt: " + GraphQLRequestSerializer.getEntry(cd4_diagnosi_covid___lt));
        }
        if (cd4_diagnosi_covid___lte != null) {
            joiner.add("cd4_diagnosi_covid___lte: " + GraphQLRequestSerializer.getEntry(cd4_diagnosi_covid___lte));
        }
        if (cd4_diagnosi_covid___gt != null) {
            joiner.add("cd4_diagnosi_covid___gt: " + GraphQLRequestSerializer.getEntry(cd4_diagnosi_covid___gt));
        }
        if (cd4_diagnosi_covid___gte != null) {
            joiner.add("cd4_diagnosi_covid___gte: " + GraphQLRequestSerializer.getEntry(cd4_diagnosi_covid___gte));
        }
        if (cdc___eq != null) {
            joiner.add("cdc___eq: " + GraphQLRequestSerializer.getEntry(cdc___eq));
        }
        if (cdc___ne != null) {
            joiner.add("cdc___ne: " + GraphQLRequestSerializer.getEntry(cdc___ne));
        }
        if (cdc___null != null) {
            joiner.add("cdc___null: " + GraphQLRequestSerializer.getEntry(cdc___null));
        }
        if (cdc___not___null != null) {
            joiner.add("cdc___not___null: " + GraphQLRequestSerializer.getEntry(cdc___not___null));
        }
        if (cdc___in != null) {
            joiner.add("cdc___in: " + GraphQLRequestSerializer.getEntry(cdc___in));
        }
        if (cdc___not___in != null) {
            joiner.add("cdc___not___in: " + GraphQLRequestSerializer.getEntry(cdc___not___in));
        }
        if (cdc___lt != null) {
            joiner.add("cdc___lt: " + GraphQLRequestSerializer.getEntry(cdc___lt));
        }
        if (cdc___lte != null) {
            joiner.add("cdc___lte: " + GraphQLRequestSerializer.getEntry(cdc___lte));
        }
        if (cdc___gt != null) {
            joiner.add("cdc___gt: " + GraphQLRequestSerializer.getEntry(cdc___gt));
        }
        if (cdc___gte != null) {
            joiner.add("cdc___gte: " + GraphQLRequestSerializer.getEntry(cdc___gte));
        }
        if (cdc___contains != null) {
            joiner.add("cdc___contains: " + GraphQLRequestSerializer.getEntry(cdc___contains));
        }
        if (cdc___not___contains != null) {
            joiner.add("cdc___not___contains: " + GraphQLRequestSerializer.getEntry(cdc___not___contains));
        }
        if (cdc___starts_with != null) {
            joiner.add("cdc___starts_with: " + GraphQLRequestSerializer.getEntry(cdc___starts_with));
        }
        if (cdc___not___starts_with != null) {
            joiner.add("cdc___not___starts_with: " + GraphQLRequestSerializer.getEntry(cdc___not___starts_with));
        }
        if (cdc___ends_with != null) {
            joiner.add("cdc___ends_with: " + GraphQLRequestSerializer.getEntry(cdc___ends_with));
        }
        if (cdc___not___ends_with != null) {
            joiner.add("cdc___not___ends_with: " + GraphQLRequestSerializer.getEntry(cdc___not___ends_with));
        }
        if (d_dimero___eq != null) {
            joiner.add("d_dimero___eq: " + GraphQLRequestSerializer.getEntry(d_dimero___eq));
        }
        if (d_dimero___ne != null) {
            joiner.add("d_dimero___ne: " + GraphQLRequestSerializer.getEntry(d_dimero___ne));
        }
        if (d_dimero___null != null) {
            joiner.add("d_dimero___null: " + GraphQLRequestSerializer.getEntry(d_dimero___null));
        }
        if (d_dimero___not___null != null) {
            joiner.add("d_dimero___not___null: " + GraphQLRequestSerializer.getEntry(d_dimero___not___null));
        }
        if (d_dimero___in != null) {
            joiner.add("d_dimero___in: " + GraphQLRequestSerializer.getEntry(d_dimero___in));
        }
        if (d_dimero___not___in != null) {
            joiner.add("d_dimero___not___in: " + GraphQLRequestSerializer.getEntry(d_dimero___not___in));
        }
        if (d_dimero___lt != null) {
            joiner.add("d_dimero___lt: " + GraphQLRequestSerializer.getEntry(d_dimero___lt));
        }
        if (d_dimero___lte != null) {
            joiner.add("d_dimero___lte: " + GraphQLRequestSerializer.getEntry(d_dimero___lte));
        }
        if (d_dimero___gt != null) {
            joiner.add("d_dimero___gt: " + GraphQLRequestSerializer.getEntry(d_dimero___gt));
        }
        if (d_dimero___gte != null) {
            joiner.add("d_dimero___gte: " + GraphQLRequestSerializer.getEntry(d_dimero___gte));
        }
        if (data_cd4_diagnosi_covid___eq != null) {
            joiner.add("data_cd4_diagnosi_covid___eq: " + GraphQLRequestSerializer.getEntry(data_cd4_diagnosi_covid___eq));
        }
        if (data_cd4_diagnosi_covid___ne != null) {
            joiner.add("data_cd4_diagnosi_covid___ne: " + GraphQLRequestSerializer.getEntry(data_cd4_diagnosi_covid___ne));
        }
        if (data_cd4_diagnosi_covid___null != null) {
            joiner.add("data_cd4_diagnosi_covid___null: " + GraphQLRequestSerializer.getEntry(data_cd4_diagnosi_covid___null));
        }
        if (data_cd4_diagnosi_covid___not___null != null) {
            joiner.add("data_cd4_diagnosi_covid___not___null: " + GraphQLRequestSerializer.getEntry(data_cd4_diagnosi_covid___not___null));
        }
        if (data_cd4_diagnosi_covid___in != null) {
            joiner.add("data_cd4_diagnosi_covid___in: " + GraphQLRequestSerializer.getEntry(data_cd4_diagnosi_covid___in));
        }
        if (data_cd4_diagnosi_covid___not___in != null) {
            joiner.add("data_cd4_diagnosi_covid___not___in: " + GraphQLRequestSerializer.getEntry(data_cd4_diagnosi_covid___not___in));
        }
        if (data_cd4_diagnosi_covid___lt != null) {
            joiner.add("data_cd4_diagnosi_covid___lt: " + GraphQLRequestSerializer.getEntry(data_cd4_diagnosi_covid___lt));
        }
        if (data_cd4_diagnosi_covid___lte != null) {
            joiner.add("data_cd4_diagnosi_covid___lte: " + GraphQLRequestSerializer.getEntry(data_cd4_diagnosi_covid___lte));
        }
        if (data_cd4_diagnosi_covid___gt != null) {
            joiner.add("data_cd4_diagnosi_covid___gt: " + GraphQLRequestSerializer.getEntry(data_cd4_diagnosi_covid___gt));
        }
        if (data_cd4_diagnosi_covid___gte != null) {
            joiner.add("data_cd4_diagnosi_covid___gte: " + GraphQLRequestSerializer.getEntry(data_cd4_diagnosi_covid___gte));
        }
        if (data_esami_ingresso___eq != null) {
            joiner.add("data_esami_ingresso___eq: " + GraphQLRequestSerializer.getEntry(data_esami_ingresso___eq));
        }
        if (data_esami_ingresso___ne != null) {
            joiner.add("data_esami_ingresso___ne: " + GraphQLRequestSerializer.getEntry(data_esami_ingresso___ne));
        }
        if (data_esami_ingresso___null != null) {
            joiner.add("data_esami_ingresso___null: " + GraphQLRequestSerializer.getEntry(data_esami_ingresso___null));
        }
        if (data_esami_ingresso___not___null != null) {
            joiner.add("data_esami_ingresso___not___null: " + GraphQLRequestSerializer.getEntry(data_esami_ingresso___not___null));
        }
        if (data_esami_ingresso___in != null) {
            joiner.add("data_esami_ingresso___in: " + GraphQLRequestSerializer.getEntry(data_esami_ingresso___in));
        }
        if (data_esami_ingresso___not___in != null) {
            joiner.add("data_esami_ingresso___not___in: " + GraphQLRequestSerializer.getEntry(data_esami_ingresso___not___in));
        }
        if (data_esami_ingresso___lt != null) {
            joiner.add("data_esami_ingresso___lt: " + GraphQLRequestSerializer.getEntry(data_esami_ingresso___lt));
        }
        if (data_esami_ingresso___lte != null) {
            joiner.add("data_esami_ingresso___lte: " + GraphQLRequestSerializer.getEntry(data_esami_ingresso___lte));
        }
        if (data_esami_ingresso___gt != null) {
            joiner.add("data_esami_ingresso___gt: " + GraphQLRequestSerializer.getEntry(data_esami_ingresso___gt));
        }
        if (data_esami_ingresso___gte != null) {
            joiner.add("data_esami_ingresso___gte: " + GraphQLRequestSerializer.getEntry(data_esami_ingresso___gte));
        }
        if (data_hivrna_diagnosi_covid___eq != null) {
            joiner.add("data_hivrna_diagnosi_covid___eq: " + GraphQLRequestSerializer.getEntry(data_hivrna_diagnosi_covid___eq));
        }
        if (data_hivrna_diagnosi_covid___ne != null) {
            joiner.add("data_hivrna_diagnosi_covid___ne: " + GraphQLRequestSerializer.getEntry(data_hivrna_diagnosi_covid___ne));
        }
        if (data_hivrna_diagnosi_covid___null != null) {
            joiner.add("data_hivrna_diagnosi_covid___null: " + GraphQLRequestSerializer.getEntry(data_hivrna_diagnosi_covid___null));
        }
        if (data_hivrna_diagnosi_covid___not___null != null) {
            joiner.add("data_hivrna_diagnosi_covid___not___null: " + GraphQLRequestSerializer.getEntry(data_hivrna_diagnosi_covid___not___null));
        }
        if (data_hivrna_diagnosi_covid___in != null) {
            joiner.add("data_hivrna_diagnosi_covid___in: " + GraphQLRequestSerializer.getEntry(data_hivrna_diagnosi_covid___in));
        }
        if (data_hivrna_diagnosi_covid___not___in != null) {
            joiner.add("data_hivrna_diagnosi_covid___not___in: " + GraphQLRequestSerializer.getEntry(data_hivrna_diagnosi_covid___not___in));
        }
        if (data_hivrna_diagnosi_covid___lt != null) {
            joiner.add("data_hivrna_diagnosi_covid___lt: " + GraphQLRequestSerializer.getEntry(data_hivrna_diagnosi_covid___lt));
        }
        if (data_hivrna_diagnosi_covid___lte != null) {
            joiner.add("data_hivrna_diagnosi_covid___lte: " + GraphQLRequestSerializer.getEntry(data_hivrna_diagnosi_covid___lte));
        }
        if (data_hivrna_diagnosi_covid___gt != null) {
            joiner.add("data_hivrna_diagnosi_covid___gt: " + GraphQLRequestSerializer.getEntry(data_hivrna_diagnosi_covid___gt));
        }
        if (data_hivrna_diagnosi_covid___gte != null) {
            joiner.add("data_hivrna_diagnosi_covid___gte: " + GraphQLRequestSerializer.getEntry(data_hivrna_diagnosi_covid___gte));
        }
        if (data_max_ventilazione___eq != null) {
            joiner.add("data_max_ventilazione___eq: " + GraphQLRequestSerializer.getEntry(data_max_ventilazione___eq));
        }
        if (data_max_ventilazione___ne != null) {
            joiner.add("data_max_ventilazione___ne: " + GraphQLRequestSerializer.getEntry(data_max_ventilazione___ne));
        }
        if (data_max_ventilazione___null != null) {
            joiner.add("data_max_ventilazione___null: " + GraphQLRequestSerializer.getEntry(data_max_ventilazione___null));
        }
        if (data_max_ventilazione___not___null != null) {
            joiner.add("data_max_ventilazione___not___null: " + GraphQLRequestSerializer.getEntry(data_max_ventilazione___not___null));
        }
        if (data_max_ventilazione___in != null) {
            joiner.add("data_max_ventilazione___in: " + GraphQLRequestSerializer.getEntry(data_max_ventilazione___in));
        }
        if (data_max_ventilazione___not___in != null) {
            joiner.add("data_max_ventilazione___not___in: " + GraphQLRequestSerializer.getEntry(data_max_ventilazione___not___in));
        }
        if (data_max_ventilazione___lt != null) {
            joiner.add("data_max_ventilazione___lt: " + GraphQLRequestSerializer.getEntry(data_max_ventilazione___lt));
        }
        if (data_max_ventilazione___lte != null) {
            joiner.add("data_max_ventilazione___lte: " + GraphQLRequestSerializer.getEntry(data_max_ventilazione___lte));
        }
        if (data_max_ventilazione___gt != null) {
            joiner.add("data_max_ventilazione___gt: " + GraphQLRequestSerializer.getEntry(data_max_ventilazione___gt));
        }
        if (data_max_ventilazione___gte != null) {
            joiner.add("data_max_ventilazione___gte: " + GraphQLRequestSerializer.getEntry(data_max_ventilazione___gte));
        }
        if (data_ospedalizzazione___eq != null) {
            joiner.add("data_ospedalizzazione___eq: " + GraphQLRequestSerializer.getEntry(data_ospedalizzazione___eq));
        }
        if (data_ospedalizzazione___ne != null) {
            joiner.add("data_ospedalizzazione___ne: " + GraphQLRequestSerializer.getEntry(data_ospedalizzazione___ne));
        }
        if (data_ospedalizzazione___null != null) {
            joiner.add("data_ospedalizzazione___null: " + GraphQLRequestSerializer.getEntry(data_ospedalizzazione___null));
        }
        if (data_ospedalizzazione___not___null != null) {
            joiner.add("data_ospedalizzazione___not___null: " + GraphQLRequestSerializer.getEntry(data_ospedalizzazione___not___null));
        }
        if (data_ospedalizzazione___in != null) {
            joiner.add("data_ospedalizzazione___in: " + GraphQLRequestSerializer.getEntry(data_ospedalizzazione___in));
        }
        if (data_ospedalizzazione___not___in != null) {
            joiner.add("data_ospedalizzazione___not___in: " + GraphQLRequestSerializer.getEntry(data_ospedalizzazione___not___in));
        }
        if (data_ospedalizzazione___lt != null) {
            joiner.add("data_ospedalizzazione___lt: " + GraphQLRequestSerializer.getEntry(data_ospedalizzazione___lt));
        }
        if (data_ospedalizzazione___lte != null) {
            joiner.add("data_ospedalizzazione___lte: " + GraphQLRequestSerializer.getEntry(data_ospedalizzazione___lte));
        }
        if (data_ospedalizzazione___gt != null) {
            joiner.add("data_ospedalizzazione___gt: " + GraphQLRequestSerializer.getEntry(data_ospedalizzazione___gt));
        }
        if (data_ospedalizzazione___gte != null) {
            joiner.add("data_ospedalizzazione___gte: " + GraphQLRequestSerializer.getEntry(data_ospedalizzazione___gte));
        }
        if (data_rianimazione___eq != null) {
            joiner.add("data_rianimazione___eq: " + GraphQLRequestSerializer.getEntry(data_rianimazione___eq));
        }
        if (data_rianimazione___ne != null) {
            joiner.add("data_rianimazione___ne: " + GraphQLRequestSerializer.getEntry(data_rianimazione___ne));
        }
        if (data_rianimazione___null != null) {
            joiner.add("data_rianimazione___null: " + GraphQLRequestSerializer.getEntry(data_rianimazione___null));
        }
        if (data_rianimazione___not___null != null) {
            joiner.add("data_rianimazione___not___null: " + GraphQLRequestSerializer.getEntry(data_rianimazione___not___null));
        }
        if (data_rianimazione___in != null) {
            joiner.add("data_rianimazione___in: " + GraphQLRequestSerializer.getEntry(data_rianimazione___in));
        }
        if (data_rianimazione___not___in != null) {
            joiner.add("data_rianimazione___not___in: " + GraphQLRequestSerializer.getEntry(data_rianimazione___not___in));
        }
        if (data_rianimazione___lt != null) {
            joiner.add("data_rianimazione___lt: " + GraphQLRequestSerializer.getEntry(data_rianimazione___lt));
        }
        if (data_rianimazione___lte != null) {
            joiner.add("data_rianimazione___lte: " + GraphQLRequestSerializer.getEntry(data_rianimazione___lte));
        }
        if (data_rianimazione___gt != null) {
            joiner.add("data_rianimazione___gt: " + GraphQLRequestSerializer.getEntry(data_rianimazione___gt));
        }
        if (data_rianimazione___gte != null) {
            joiner.add("data_rianimazione___gte: " + GraphQLRequestSerializer.getEntry(data_rianimazione___gte));
        }
        if (data_tampone___eq != null) {
            joiner.add("data_tampone___eq: " + GraphQLRequestSerializer.getEntry(data_tampone___eq));
        }
        if (data_tampone___ne != null) {
            joiner.add("data_tampone___ne: " + GraphQLRequestSerializer.getEntry(data_tampone___ne));
        }
        if (data_tampone___null != null) {
            joiner.add("data_tampone___null: " + GraphQLRequestSerializer.getEntry(data_tampone___null));
        }
        if (data_tampone___not___null != null) {
            joiner.add("data_tampone___not___null: " + GraphQLRequestSerializer.getEntry(data_tampone___not___null));
        }
        if (data_tampone___in != null) {
            joiner.add("data_tampone___in: " + GraphQLRequestSerializer.getEntry(data_tampone___in));
        }
        if (data_tampone___not___in != null) {
            joiner.add("data_tampone___not___in: " + GraphQLRequestSerializer.getEntry(data_tampone___not___in));
        }
        if (data_tampone___lt != null) {
            joiner.add("data_tampone___lt: " + GraphQLRequestSerializer.getEntry(data_tampone___lt));
        }
        if (data_tampone___lte != null) {
            joiner.add("data_tampone___lte: " + GraphQLRequestSerializer.getEntry(data_tampone___lte));
        }
        if (data_tampone___gt != null) {
            joiner.add("data_tampone___gt: " + GraphQLRequestSerializer.getEntry(data_tampone___gt));
        }
        if (data_tampone___gte != null) {
            joiner.add("data_tampone___gte: " + GraphQLRequestSerializer.getEntry(data_tampone___gte));
        }
        if (data_ultimo_contatto___eq != null) {
            joiner.add("data_ultimo_contatto___eq: " + GraphQLRequestSerializer.getEntry(data_ultimo_contatto___eq));
        }
        if (data_ultimo_contatto___ne != null) {
            joiner.add("data_ultimo_contatto___ne: " + GraphQLRequestSerializer.getEntry(data_ultimo_contatto___ne));
        }
        if (data_ultimo_contatto___null != null) {
            joiner.add("data_ultimo_contatto___null: " + GraphQLRequestSerializer.getEntry(data_ultimo_contatto___null));
        }
        if (data_ultimo_contatto___not___null != null) {
            joiner.add("data_ultimo_contatto___not___null: " + GraphQLRequestSerializer.getEntry(data_ultimo_contatto___not___null));
        }
        if (data_ultimo_contatto___in != null) {
            joiner.add("data_ultimo_contatto___in: " + GraphQLRequestSerializer.getEntry(data_ultimo_contatto___in));
        }
        if (data_ultimo_contatto___not___in != null) {
            joiner.add("data_ultimo_contatto___not___in: " + GraphQLRequestSerializer.getEntry(data_ultimo_contatto___not___in));
        }
        if (data_ultimo_contatto___lt != null) {
            joiner.add("data_ultimo_contatto___lt: " + GraphQLRequestSerializer.getEntry(data_ultimo_contatto___lt));
        }
        if (data_ultimo_contatto___lte != null) {
            joiner.add("data_ultimo_contatto___lte: " + GraphQLRequestSerializer.getEntry(data_ultimo_contatto___lte));
        }
        if (data_ultimo_contatto___gt != null) {
            joiner.add("data_ultimo_contatto___gt: " + GraphQLRequestSerializer.getEntry(data_ultimo_contatto___gt));
        }
        if (data_ultimo_contatto___gte != null) {
            joiner.add("data_ultimo_contatto___gte: " + GraphQLRequestSerializer.getEntry(data_ultimo_contatto___gte));
        }
        if (ferritina___eq != null) {
            joiner.add("ferritina___eq: " + GraphQLRequestSerializer.getEntry(ferritina___eq));
        }
        if (ferritina___ne != null) {
            joiner.add("ferritina___ne: " + GraphQLRequestSerializer.getEntry(ferritina___ne));
        }
        if (ferritina___null != null) {
            joiner.add("ferritina___null: " + GraphQLRequestSerializer.getEntry(ferritina___null));
        }
        if (ferritina___not___null != null) {
            joiner.add("ferritina___not___null: " + GraphQLRequestSerializer.getEntry(ferritina___not___null));
        }
        if (ferritina___in != null) {
            joiner.add("ferritina___in: " + GraphQLRequestSerializer.getEntry(ferritina___in));
        }
        if (ferritina___not___in != null) {
            joiner.add("ferritina___not___in: " + GraphQLRequestSerializer.getEntry(ferritina___not___in));
        }
        if (ferritina___lt != null) {
            joiner.add("ferritina___lt: " + GraphQLRequestSerializer.getEntry(ferritina___lt));
        }
        if (ferritina___lte != null) {
            joiner.add("ferritina___lte: " + GraphQLRequestSerializer.getEntry(ferritina___lte));
        }
        if (ferritina___gt != null) {
            joiner.add("ferritina___gt: " + GraphQLRequestSerializer.getEntry(ferritina___gt));
        }
        if (ferritina___gte != null) {
            joiner.add("ferritina___gte: " + GraphQLRequestSerializer.getEntry(ferritina___gte));
        }
        if (frequenza_resp___eq != null) {
            joiner.add("frequenza_resp___eq: " + GraphQLRequestSerializer.getEntry(frequenza_resp___eq));
        }
        if (frequenza_resp___ne != null) {
            joiner.add("frequenza_resp___ne: " + GraphQLRequestSerializer.getEntry(frequenza_resp___ne));
        }
        if (frequenza_resp___null != null) {
            joiner.add("frequenza_resp___null: " + GraphQLRequestSerializer.getEntry(frequenza_resp___null));
        }
        if (frequenza_resp___not___null != null) {
            joiner.add("frequenza_resp___not___null: " + GraphQLRequestSerializer.getEntry(frequenza_resp___not___null));
        }
        if (frequenza_resp___in != null) {
            joiner.add("frequenza_resp___in: " + GraphQLRequestSerializer.getEntry(frequenza_resp___in));
        }
        if (frequenza_resp___not___in != null) {
            joiner.add("frequenza_resp___not___in: " + GraphQLRequestSerializer.getEntry(frequenza_resp___not___in));
        }
        if (frequenza_resp___lt != null) {
            joiner.add("frequenza_resp___lt: " + GraphQLRequestSerializer.getEntry(frequenza_resp___lt));
        }
        if (frequenza_resp___lte != null) {
            joiner.add("frequenza_resp___lte: " + GraphQLRequestSerializer.getEntry(frequenza_resp___lte));
        }
        if (frequenza_resp___gt != null) {
            joiner.add("frequenza_resp___gt: " + GraphQLRequestSerializer.getEntry(frequenza_resp___gt));
        }
        if (frequenza_resp___gte != null) {
            joiner.add("frequenza_resp___gte: " + GraphQLRequestSerializer.getEntry(frequenza_resp___gte));
        }
        if (fumatore___eq != null) {
            joiner.add("fumatore___eq: " + GraphQLRequestSerializer.getEntry(fumatore___eq));
        }
        if (fumatore___ne != null) {
            joiner.add("fumatore___ne: " + GraphQLRequestSerializer.getEntry(fumatore___ne));
        }
        if (fumatore___null != null) {
            joiner.add("fumatore___null: " + GraphQLRequestSerializer.getEntry(fumatore___null));
        }
        if (fumatore___not___null != null) {
            joiner.add("fumatore___not___null: " + GraphQLRequestSerializer.getEntry(fumatore___not___null));
        }
        if (fumatore___in != null) {
            joiner.add("fumatore___in: " + GraphQLRequestSerializer.getEntry(fumatore___in));
        }
        if (fumatore___not___in != null) {
            joiner.add("fumatore___not___in: " + GraphQLRequestSerializer.getEntry(fumatore___not___in));
        }
        if (fumatore___lt != null) {
            joiner.add("fumatore___lt: " + GraphQLRequestSerializer.getEntry(fumatore___lt));
        }
        if (fumatore___lte != null) {
            joiner.add("fumatore___lte: " + GraphQLRequestSerializer.getEntry(fumatore___lte));
        }
        if (fumatore___gt != null) {
            joiner.add("fumatore___gt: " + GraphQLRequestSerializer.getEntry(fumatore___gt));
        }
        if (fumatore___gte != null) {
            joiner.add("fumatore___gte: " + GraphQLRequestSerializer.getEntry(fumatore___gte));
        }
        if (fumatore___contains != null) {
            joiner.add("fumatore___contains: " + GraphQLRequestSerializer.getEntry(fumatore___contains));
        }
        if (fumatore___not___contains != null) {
            joiner.add("fumatore___not___contains: " + GraphQLRequestSerializer.getEntry(fumatore___not___contains));
        }
        if (fumatore___starts_with != null) {
            joiner.add("fumatore___starts_with: " + GraphQLRequestSerializer.getEntry(fumatore___starts_with));
        }
        if (fumatore___not___starts_with != null) {
            joiner.add("fumatore___not___starts_with: " + GraphQLRequestSerializer.getEntry(fumatore___not___starts_with));
        }
        if (fumatore___ends_with != null) {
            joiner.add("fumatore___ends_with: " + GraphQLRequestSerializer.getEntry(fumatore___ends_with));
        }
        if (fumatore___not___ends_with != null) {
            joiner.add("fumatore___not___ends_with: " + GraphQLRequestSerializer.getEntry(fumatore___not___ends_with));
        }
        if (hivrna_diagnosi_covid___eq != null) {
            joiner.add("hivrna_diagnosi_covid___eq: " + GraphQLRequestSerializer.getEntry(hivrna_diagnosi_covid___eq));
        }
        if (hivrna_diagnosi_covid___ne != null) {
            joiner.add("hivrna_diagnosi_covid___ne: " + GraphQLRequestSerializer.getEntry(hivrna_diagnosi_covid___ne));
        }
        if (hivrna_diagnosi_covid___null != null) {
            joiner.add("hivrna_diagnosi_covid___null: " + GraphQLRequestSerializer.getEntry(hivrna_diagnosi_covid___null));
        }
        if (hivrna_diagnosi_covid___not___null != null) {
            joiner.add("hivrna_diagnosi_covid___not___null: " + GraphQLRequestSerializer.getEntry(hivrna_diagnosi_covid___not___null));
        }
        if (hivrna_diagnosi_covid___in != null) {
            joiner.add("hivrna_diagnosi_covid___in: " + GraphQLRequestSerializer.getEntry(hivrna_diagnosi_covid___in));
        }
        if (hivrna_diagnosi_covid___not___in != null) {
            joiner.add("hivrna_diagnosi_covid___not___in: " + GraphQLRequestSerializer.getEntry(hivrna_diagnosi_covid___not___in));
        }
        if (hivrna_diagnosi_covid___lt != null) {
            joiner.add("hivrna_diagnosi_covid___lt: " + GraphQLRequestSerializer.getEntry(hivrna_diagnosi_covid___lt));
        }
        if (hivrna_diagnosi_covid___lte != null) {
            joiner.add("hivrna_diagnosi_covid___lte: " + GraphQLRequestSerializer.getEntry(hivrna_diagnosi_covid___lte));
        }
        if (hivrna_diagnosi_covid___gt != null) {
            joiner.add("hivrna_diagnosi_covid___gt: " + GraphQLRequestSerializer.getEntry(hivrna_diagnosi_covid___gt));
        }
        if (hivrna_diagnosi_covid___gte != null) {
            joiner.add("hivrna_diagnosi_covid___gte: " + GraphQLRequestSerializer.getEntry(hivrna_diagnosi_covid___gte));
        }
        if (ldh___eq != null) {
            joiner.add("ldh___eq: " + GraphQLRequestSerializer.getEntry(ldh___eq));
        }
        if (ldh___ne != null) {
            joiner.add("ldh___ne: " + GraphQLRequestSerializer.getEntry(ldh___ne));
        }
        if (ldh___null != null) {
            joiner.add("ldh___null: " + GraphQLRequestSerializer.getEntry(ldh___null));
        }
        if (ldh___not___null != null) {
            joiner.add("ldh___not___null: " + GraphQLRequestSerializer.getEntry(ldh___not___null));
        }
        if (ldh___in != null) {
            joiner.add("ldh___in: " + GraphQLRequestSerializer.getEntry(ldh___in));
        }
        if (ldh___not___in != null) {
            joiner.add("ldh___not___in: " + GraphQLRequestSerializer.getEntry(ldh___not___in));
        }
        if (ldh___lt != null) {
            joiner.add("ldh___lt: " + GraphQLRequestSerializer.getEntry(ldh___lt));
        }
        if (ldh___lte != null) {
            joiner.add("ldh___lte: " + GraphQLRequestSerializer.getEntry(ldh___lte));
        }
        if (ldh___gt != null) {
            joiner.add("ldh___gt: " + GraphQLRequestSerializer.getEntry(ldh___gt));
        }
        if (ldh___gte != null) {
            joiner.add("ldh___gte: " + GraphQLRequestSerializer.getEntry(ldh___gte));
        }
        if (leucociti___eq != null) {
            joiner.add("leucociti___eq: " + GraphQLRequestSerializer.getEntry(leucociti___eq));
        }
        if (leucociti___ne != null) {
            joiner.add("leucociti___ne: " + GraphQLRequestSerializer.getEntry(leucociti___ne));
        }
        if (leucociti___null != null) {
            joiner.add("leucociti___null: " + GraphQLRequestSerializer.getEntry(leucociti___null));
        }
        if (leucociti___not___null != null) {
            joiner.add("leucociti___not___null: " + GraphQLRequestSerializer.getEntry(leucociti___not___null));
        }
        if (leucociti___in != null) {
            joiner.add("leucociti___in: " + GraphQLRequestSerializer.getEntry(leucociti___in));
        }
        if (leucociti___not___in != null) {
            joiner.add("leucociti___not___in: " + GraphQLRequestSerializer.getEntry(leucociti___not___in));
        }
        if (leucociti___lt != null) {
            joiner.add("leucociti___lt: " + GraphQLRequestSerializer.getEntry(leucociti___lt));
        }
        if (leucociti___lte != null) {
            joiner.add("leucociti___lte: " + GraphQLRequestSerializer.getEntry(leucociti___lte));
        }
        if (leucociti___gt != null) {
            joiner.add("leucociti___gt: " + GraphQLRequestSerializer.getEntry(leucociti___gt));
        }
        if (leucociti___gte != null) {
            joiner.add("leucociti___gte: " + GraphQLRequestSerializer.getEntry(leucociti___gte));
        }
        if (linfociti___eq != null) {
            joiner.add("linfociti___eq: " + GraphQLRequestSerializer.getEntry(linfociti___eq));
        }
        if (linfociti___ne != null) {
            joiner.add("linfociti___ne: " + GraphQLRequestSerializer.getEntry(linfociti___ne));
        }
        if (linfociti___null != null) {
            joiner.add("linfociti___null: " + GraphQLRequestSerializer.getEntry(linfociti___null));
        }
        if (linfociti___not___null != null) {
            joiner.add("linfociti___not___null: " + GraphQLRequestSerializer.getEntry(linfociti___not___null));
        }
        if (linfociti___in != null) {
            joiner.add("linfociti___in: " + GraphQLRequestSerializer.getEntry(linfociti___in));
        }
        if (linfociti___not___in != null) {
            joiner.add("linfociti___not___in: " + GraphQLRequestSerializer.getEntry(linfociti___not___in));
        }
        if (linfociti___lt != null) {
            joiner.add("linfociti___lt: " + GraphQLRequestSerializer.getEntry(linfociti___lt));
        }
        if (linfociti___lte != null) {
            joiner.add("linfociti___lte: " + GraphQLRequestSerializer.getEntry(linfociti___lte));
        }
        if (linfociti___gt != null) {
            joiner.add("linfociti___gt: " + GraphQLRequestSerializer.getEntry(linfociti___gt));
        }
        if (linfociti___gte != null) {
            joiner.add("linfociti___gte: " + GraphQLRequestSerializer.getEntry(linfociti___gte));
        }
        if (obeso___eq != null) {
            joiner.add("obeso___eq: " + GraphQLRequestSerializer.getEntry(obeso___eq));
        }
        if (obeso___ne != null) {
            joiner.add("obeso___ne: " + GraphQLRequestSerializer.getEntry(obeso___ne));
        }
        if (obeso___null != null) {
            joiner.add("obeso___null: " + GraphQLRequestSerializer.getEntry(obeso___null));
        }
        if (obeso___not___null != null) {
            joiner.add("obeso___not___null: " + GraphQLRequestSerializer.getEntry(obeso___not___null));
        }
        if (ospedalizzazione___eq != null) {
            joiner.add("ospedalizzazione___eq: " + GraphQLRequestSerializer.getEntry(ospedalizzazione___eq));
        }
        if (ospedalizzazione___ne != null) {
            joiner.add("ospedalizzazione___ne: " + GraphQLRequestSerializer.getEntry(ospedalizzazione___ne));
        }
        if (ospedalizzazione___null != null) {
            joiner.add("ospedalizzazione___null: " + GraphQLRequestSerializer.getEntry(ospedalizzazione___null));
        }
        if (ospedalizzazione___not___null != null) {
            joiner.add("ospedalizzazione___not___null: " + GraphQLRequestSerializer.getEntry(ospedalizzazione___not___null));
        }
        if (outcome_altro___eq != null) {
            joiner.add("outcome_altro___eq: " + GraphQLRequestSerializer.getEntry(outcome_altro___eq));
        }
        if (outcome_altro___ne != null) {
            joiner.add("outcome_altro___ne: " + GraphQLRequestSerializer.getEntry(outcome_altro___ne));
        }
        if (outcome_altro___null != null) {
            joiner.add("outcome_altro___null: " + GraphQLRequestSerializer.getEntry(outcome_altro___null));
        }
        if (outcome_altro___not___null != null) {
            joiner.add("outcome_altro___not___null: " + GraphQLRequestSerializer.getEntry(outcome_altro___not___null));
        }
        if (outcome_altro___in != null) {
            joiner.add("outcome_altro___in: " + GraphQLRequestSerializer.getEntry(outcome_altro___in));
        }
        if (outcome_altro___not___in != null) {
            joiner.add("outcome_altro___not___in: " + GraphQLRequestSerializer.getEntry(outcome_altro___not___in));
        }
        if (outcome_altro___lt != null) {
            joiner.add("outcome_altro___lt: " + GraphQLRequestSerializer.getEntry(outcome_altro___lt));
        }
        if (outcome_altro___lte != null) {
            joiner.add("outcome_altro___lte: " + GraphQLRequestSerializer.getEntry(outcome_altro___lte));
        }
        if (outcome_altro___gt != null) {
            joiner.add("outcome_altro___gt: " + GraphQLRequestSerializer.getEntry(outcome_altro___gt));
        }
        if (outcome_altro___gte != null) {
            joiner.add("outcome_altro___gte: " + GraphQLRequestSerializer.getEntry(outcome_altro___gte));
        }
        if (outcome_altro___contains != null) {
            joiner.add("outcome_altro___contains: " + GraphQLRequestSerializer.getEntry(outcome_altro___contains));
        }
        if (outcome_altro___not___contains != null) {
            joiner.add("outcome_altro___not___contains: " + GraphQLRequestSerializer.getEntry(outcome_altro___not___contains));
        }
        if (outcome_altro___starts_with != null) {
            joiner.add("outcome_altro___starts_with: " + GraphQLRequestSerializer.getEntry(outcome_altro___starts_with));
        }
        if (outcome_altro___not___starts_with != null) {
            joiner.add("outcome_altro___not___starts_with: " + GraphQLRequestSerializer.getEntry(outcome_altro___not___starts_with));
        }
        if (outcome_altro___ends_with != null) {
            joiner.add("outcome_altro___ends_with: " + GraphQLRequestSerializer.getEntry(outcome_altro___ends_with));
        }
        if (outcome_altro___not___ends_with != null) {
            joiner.add("outcome_altro___not___ends_with: " + GraphQLRequestSerializer.getEntry(outcome_altro___not___ends_with));
        }
        if (pcr___eq != null) {
            joiner.add("pcr___eq: " + GraphQLRequestSerializer.getEntry(pcr___eq));
        }
        if (pcr___ne != null) {
            joiner.add("pcr___ne: " + GraphQLRequestSerializer.getEntry(pcr___ne));
        }
        if (pcr___null != null) {
            joiner.add("pcr___null: " + GraphQLRequestSerializer.getEntry(pcr___null));
        }
        if (pcr___not___null != null) {
            joiner.add("pcr___not___null: " + GraphQLRequestSerializer.getEntry(pcr___not___null));
        }
        if (pcr___in != null) {
            joiner.add("pcr___in: " + GraphQLRequestSerializer.getEntry(pcr___in));
        }
        if (pcr___not___in != null) {
            joiner.add("pcr___not___in: " + GraphQLRequestSerializer.getEntry(pcr___not___in));
        }
        if (pcr___lt != null) {
            joiner.add("pcr___lt: " + GraphQLRequestSerializer.getEntry(pcr___lt));
        }
        if (pcr___lte != null) {
            joiner.add("pcr___lte: " + GraphQLRequestSerializer.getEntry(pcr___lte));
        }
        if (pcr___gt != null) {
            joiner.add("pcr___gt: " + GraphQLRequestSerializer.getEntry(pcr___gt));
        }
        if (pcr___gte != null) {
            joiner.add("pcr___gte: " + GraphQLRequestSerializer.getEntry(pcr___gte));
        }
        if (po2_fio2_ingresso___eq != null) {
            joiner.add("po2_fio2_ingresso___eq: " + GraphQLRequestSerializer.getEntry(po2_fio2_ingresso___eq));
        }
        if (po2_fio2_ingresso___ne != null) {
            joiner.add("po2_fio2_ingresso___ne: " + GraphQLRequestSerializer.getEntry(po2_fio2_ingresso___ne));
        }
        if (po2_fio2_ingresso___null != null) {
            joiner.add("po2_fio2_ingresso___null: " + GraphQLRequestSerializer.getEntry(po2_fio2_ingresso___null));
        }
        if (po2_fio2_ingresso___not___null != null) {
            joiner.add("po2_fio2_ingresso___not___null: " + GraphQLRequestSerializer.getEntry(po2_fio2_ingresso___not___null));
        }
        if (po2_fio2_ingresso___in != null) {
            joiner.add("po2_fio2_ingresso___in: " + GraphQLRequestSerializer.getEntry(po2_fio2_ingresso___in));
        }
        if (po2_fio2_ingresso___not___in != null) {
            joiner.add("po2_fio2_ingresso___not___in: " + GraphQLRequestSerializer.getEntry(po2_fio2_ingresso___not___in));
        }
        if (po2_fio2_ingresso___lt != null) {
            joiner.add("po2_fio2_ingresso___lt: " + GraphQLRequestSerializer.getEntry(po2_fio2_ingresso___lt));
        }
        if (po2_fio2_ingresso___lte != null) {
            joiner.add("po2_fio2_ingresso___lte: " + GraphQLRequestSerializer.getEntry(po2_fio2_ingresso___lte));
        }
        if (po2_fio2_ingresso___gt != null) {
            joiner.add("po2_fio2_ingresso___gt: " + GraphQLRequestSerializer.getEntry(po2_fio2_ingresso___gt));
        }
        if (po2_fio2_ingresso___gte != null) {
            joiner.add("po2_fio2_ingresso___gte: " + GraphQLRequestSerializer.getEntry(po2_fio2_ingresso___gte));
        }
        if (rianimazione___eq != null) {
            joiner.add("rianimazione___eq: " + GraphQLRequestSerializer.getEntry(rianimazione___eq));
        }
        if (rianimazione___ne != null) {
            joiner.add("rianimazione___ne: " + GraphQLRequestSerializer.getEntry(rianimazione___ne));
        }
        if (rianimazione___null != null) {
            joiner.add("rianimazione___null: " + GraphQLRequestSerializer.getEntry(rianimazione___null));
        }
        if (rianimazione___not___null != null) {
            joiner.add("rianimazione___not___null: " + GraphQLRequestSerializer.getEntry(rianimazione___not___null));
        }
        if (sintomi_altro___eq != null) {
            joiner.add("sintomi_altro___eq: " + GraphQLRequestSerializer.getEntry(sintomi_altro___eq));
        }
        if (sintomi_altro___ne != null) {
            joiner.add("sintomi_altro___ne: " + GraphQLRequestSerializer.getEntry(sintomi_altro___ne));
        }
        if (sintomi_altro___null != null) {
            joiner.add("sintomi_altro___null: " + GraphQLRequestSerializer.getEntry(sintomi_altro___null));
        }
        if (sintomi_altro___not___null != null) {
            joiner.add("sintomi_altro___not___null: " + GraphQLRequestSerializer.getEntry(sintomi_altro___not___null));
        }
        if (sintomi_altro___in != null) {
            joiner.add("sintomi_altro___in: " + GraphQLRequestSerializer.getEntry(sintomi_altro___in));
        }
        if (sintomi_altro___not___in != null) {
            joiner.add("sintomi_altro___not___in: " + GraphQLRequestSerializer.getEntry(sintomi_altro___not___in));
        }
        if (sintomi_altro___lt != null) {
            joiner.add("sintomi_altro___lt: " + GraphQLRequestSerializer.getEntry(sintomi_altro___lt));
        }
        if (sintomi_altro___lte != null) {
            joiner.add("sintomi_altro___lte: " + GraphQLRequestSerializer.getEntry(sintomi_altro___lte));
        }
        if (sintomi_altro___gt != null) {
            joiner.add("sintomi_altro___gt: " + GraphQLRequestSerializer.getEntry(sintomi_altro___gt));
        }
        if (sintomi_altro___gte != null) {
            joiner.add("sintomi_altro___gte: " + GraphQLRequestSerializer.getEntry(sintomi_altro___gte));
        }
        if (sintomi_altro___contains != null) {
            joiner.add("sintomi_altro___contains: " + GraphQLRequestSerializer.getEntry(sintomi_altro___contains));
        }
        if (sintomi_altro___not___contains != null) {
            joiner.add("sintomi_altro___not___contains: " + GraphQLRequestSerializer.getEntry(sintomi_altro___not___contains));
        }
        if (sintomi_altro___starts_with != null) {
            joiner.add("sintomi_altro___starts_with: " + GraphQLRequestSerializer.getEntry(sintomi_altro___starts_with));
        }
        if (sintomi_altro___not___starts_with != null) {
            joiner.add("sintomi_altro___not___starts_with: " + GraphQLRequestSerializer.getEntry(sintomi_altro___not___starts_with));
        }
        if (sintomi_altro___ends_with != null) {
            joiner.add("sintomi_altro___ends_with: " + GraphQLRequestSerializer.getEntry(sintomi_altro___ends_with));
        }
        if (sintomi_altro___not___ends_with != null) {
            joiner.add("sintomi_altro___not___ends_with: " + GraphQLRequestSerializer.getEntry(sintomi_altro___not___ends_with));
        }
        if (spo2_ingresso___eq != null) {
            joiner.add("spo2_ingresso___eq: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___eq));
        }
        if (spo2_ingresso___ne != null) {
            joiner.add("spo2_ingresso___ne: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___ne));
        }
        if (spo2_ingresso___null != null) {
            joiner.add("spo2_ingresso___null: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___null));
        }
        if (spo2_ingresso___not___null != null) {
            joiner.add("spo2_ingresso___not___null: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___not___null));
        }
        if (spo2_ingresso___in != null) {
            joiner.add("spo2_ingresso___in: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___in));
        }
        if (spo2_ingresso___not___in != null) {
            joiner.add("spo2_ingresso___not___in: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___not___in));
        }
        if (spo2_ingresso___lt != null) {
            joiner.add("spo2_ingresso___lt: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___lt));
        }
        if (spo2_ingresso___lte != null) {
            joiner.add("spo2_ingresso___lte: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___lte));
        }
        if (spo2_ingresso___gt != null) {
            joiner.add("spo2_ingresso___gt: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___gt));
        }
        if (spo2_ingresso___gte != null) {
            joiner.add("spo2_ingresso___gte: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___gte));
        }
        if (spo2_ingresso___contains != null) {
            joiner.add("spo2_ingresso___contains: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___contains));
        }
        if (spo2_ingresso___not___contains != null) {
            joiner.add("spo2_ingresso___not___contains: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___not___contains));
        }
        if (spo2_ingresso___starts_with != null) {
            joiner.add("spo2_ingresso___starts_with: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___starts_with));
        }
        if (spo2_ingresso___not___starts_with != null) {
            joiner.add("spo2_ingresso___not___starts_with: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___not___starts_with));
        }
        if (spo2_ingresso___ends_with != null) {
            joiner.add("spo2_ingresso___ends_with: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___ends_with));
        }
        if (spo2_ingresso___not___ends_with != null) {
            joiner.add("spo2_ingresso___not___ends_with: " + GraphQLRequestSerializer.getEntry(spo2_ingresso___not___ends_with));
        }
        if (AND != null) {
            joiner.add("AND: " + GraphQLRequestSerializer.getEntry(AND));
        }
        if (OR != null) {
            joiner.add("OR: " + GraphQLRequestSerializer.getEntry(OR));
        }
        if (NOT != null) {
            joiner.add("NOT: " + GraphQLRequestSerializer.getEntry(NOT));
        }
        return joiner.toString();
    }

    public static CliC_dettaglioFilterDTO.Builder builder() {
        return new CliC_dettaglioFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId___eq;
        private String _id___eq;
        private String _id___ne;
        private Boolean _id___null;
        private Boolean _id___not___null;
        private java.util.List<String> _id___in;
        private java.util.List<String> _id___not___in;
        private String _id___lt;
        private String _id___lte;
        private String _id___gt;
        private String _id___gte;
        private Boolean anosmia_disgeusia___eq;
        private Boolean anosmia_disgeusia___ne;
        private Boolean anosmia_disgeusia___null;
        private Boolean anosmia_disgeusia___not___null;
        private String bmi___eq;
        private String bmi___ne;
        private Boolean bmi___null;
        private Boolean bmi___not___null;
        private java.util.List<String> bmi___in;
        private java.util.List<String> bmi___not___in;
        private String bmi___lt;
        private String bmi___lte;
        private String bmi___gt;
        private String bmi___gte;
        private Integer cd4_diagnosi_covid___eq;
        private Integer cd4_diagnosi_covid___ne;
        private Boolean cd4_diagnosi_covid___null;
        private Boolean cd4_diagnosi_covid___not___null;
        private java.util.List<Integer> cd4_diagnosi_covid___in;
        private java.util.List<Integer> cd4_diagnosi_covid___not___in;
        private Integer cd4_diagnosi_covid___lt;
        private Integer cd4_diagnosi_covid___lte;
        private Integer cd4_diagnosi_covid___gt;
        private Integer cd4_diagnosi_covid___gte;
        private String cdc___eq;
        private String cdc___ne;
        private Boolean cdc___null;
        private Boolean cdc___not___null;
        private java.util.List<String> cdc___in;
        private java.util.List<String> cdc___not___in;
        private String cdc___lt;
        private String cdc___lte;
        private String cdc___gt;
        private String cdc___gte;
        private String cdc___contains;
        private String cdc___not___contains;
        private String cdc___starts_with;
        private String cdc___not___starts_with;
        private String cdc___ends_with;
        private String cdc___not___ends_with;
        private Integer d_dimero___eq;
        private Integer d_dimero___ne;
        private Boolean d_dimero___null;
        private Boolean d_dimero___not___null;
        private java.util.List<Integer> d_dimero___in;
        private java.util.List<Integer> d_dimero___not___in;
        private Integer d_dimero___lt;
        private Integer d_dimero___lte;
        private Integer d_dimero___gt;
        private Integer d_dimero___gte;
        private String data_cd4_diagnosi_covid___eq;
        private String data_cd4_diagnosi_covid___ne;
        private Boolean data_cd4_diagnosi_covid___null;
        private Boolean data_cd4_diagnosi_covid___not___null;
        private java.util.List<String> data_cd4_diagnosi_covid___in;
        private java.util.List<String> data_cd4_diagnosi_covid___not___in;
        private String data_cd4_diagnosi_covid___lt;
        private String data_cd4_diagnosi_covid___lte;
        private String data_cd4_diagnosi_covid___gt;
        private String data_cd4_diagnosi_covid___gte;
        private String data_esami_ingresso___eq;
        private String data_esami_ingresso___ne;
        private Boolean data_esami_ingresso___null;
        private Boolean data_esami_ingresso___not___null;
        private java.util.List<String> data_esami_ingresso___in;
        private java.util.List<String> data_esami_ingresso___not___in;
        private String data_esami_ingresso___lt;
        private String data_esami_ingresso___lte;
        private String data_esami_ingresso___gt;
        private String data_esami_ingresso___gte;
        private String data_hivrna_diagnosi_covid___eq;
        private String data_hivrna_diagnosi_covid___ne;
        private Boolean data_hivrna_diagnosi_covid___null;
        private Boolean data_hivrna_diagnosi_covid___not___null;
        private java.util.List<String> data_hivrna_diagnosi_covid___in;
        private java.util.List<String> data_hivrna_diagnosi_covid___not___in;
        private String data_hivrna_diagnosi_covid___lt;
        private String data_hivrna_diagnosi_covid___lte;
        private String data_hivrna_diagnosi_covid___gt;
        private String data_hivrna_diagnosi_covid___gte;
        private String data_max_ventilazione___eq;
        private String data_max_ventilazione___ne;
        private Boolean data_max_ventilazione___null;
        private Boolean data_max_ventilazione___not___null;
        private java.util.List<String> data_max_ventilazione___in;
        private java.util.List<String> data_max_ventilazione___not___in;
        private String data_max_ventilazione___lt;
        private String data_max_ventilazione___lte;
        private String data_max_ventilazione___gt;
        private String data_max_ventilazione___gte;
        private String data_ospedalizzazione___eq;
        private String data_ospedalizzazione___ne;
        private Boolean data_ospedalizzazione___null;
        private Boolean data_ospedalizzazione___not___null;
        private java.util.List<String> data_ospedalizzazione___in;
        private java.util.List<String> data_ospedalizzazione___not___in;
        private String data_ospedalizzazione___lt;
        private String data_ospedalizzazione___lte;
        private String data_ospedalizzazione___gt;
        private String data_ospedalizzazione___gte;
        private String data_rianimazione___eq;
        private String data_rianimazione___ne;
        private Boolean data_rianimazione___null;
        private Boolean data_rianimazione___not___null;
        private java.util.List<String> data_rianimazione___in;
        private java.util.List<String> data_rianimazione___not___in;
        private String data_rianimazione___lt;
        private String data_rianimazione___lte;
        private String data_rianimazione___gt;
        private String data_rianimazione___gte;
        private String data_tampone___eq;
        private String data_tampone___ne;
        private Boolean data_tampone___null;
        private Boolean data_tampone___not___null;
        private java.util.List<String> data_tampone___in;
        private java.util.List<String> data_tampone___not___in;
        private String data_tampone___lt;
        private String data_tampone___lte;
        private String data_tampone___gt;
        private String data_tampone___gte;
        private String data_ultimo_contatto___eq;
        private String data_ultimo_contatto___ne;
        private Boolean data_ultimo_contatto___null;
        private Boolean data_ultimo_contatto___not___null;
        private java.util.List<String> data_ultimo_contatto___in;
        private java.util.List<String> data_ultimo_contatto___not___in;
        private String data_ultimo_contatto___lt;
        private String data_ultimo_contatto___lte;
        private String data_ultimo_contatto___gt;
        private String data_ultimo_contatto___gte;
        private Integer ferritina___eq;
        private Integer ferritina___ne;
        private Boolean ferritina___null;
        private Boolean ferritina___not___null;
        private java.util.List<Integer> ferritina___in;
        private java.util.List<Integer> ferritina___not___in;
        private Integer ferritina___lt;
        private Integer ferritina___lte;
        private Integer ferritina___gt;
        private Integer ferritina___gte;
        private Integer frequenza_resp___eq;
        private Integer frequenza_resp___ne;
        private Boolean frequenza_resp___null;
        private Boolean frequenza_resp___not___null;
        private java.util.List<Integer> frequenza_resp___in;
        private java.util.List<Integer> frequenza_resp___not___in;
        private Integer frequenza_resp___lt;
        private Integer frequenza_resp___lte;
        private Integer frequenza_resp___gt;
        private Integer frequenza_resp___gte;
        private String fumatore___eq;
        private String fumatore___ne;
        private Boolean fumatore___null;
        private Boolean fumatore___not___null;
        private java.util.List<String> fumatore___in;
        private java.util.List<String> fumatore___not___in;
        private String fumatore___lt;
        private String fumatore___lte;
        private String fumatore___gt;
        private String fumatore___gte;
        private String fumatore___contains;
        private String fumatore___not___contains;
        private String fumatore___starts_with;
        private String fumatore___not___starts_with;
        private String fumatore___ends_with;
        private String fumatore___not___ends_with;
        private Integer hivrna_diagnosi_covid___eq;
        private Integer hivrna_diagnosi_covid___ne;
        private Boolean hivrna_diagnosi_covid___null;
        private Boolean hivrna_diagnosi_covid___not___null;
        private java.util.List<Integer> hivrna_diagnosi_covid___in;
        private java.util.List<Integer> hivrna_diagnosi_covid___not___in;
        private Integer hivrna_diagnosi_covid___lt;
        private Integer hivrna_diagnosi_covid___lte;
        private Integer hivrna_diagnosi_covid___gt;
        private Integer hivrna_diagnosi_covid___gte;
        private Integer ldh___eq;
        private Integer ldh___ne;
        private Boolean ldh___null;
        private Boolean ldh___not___null;
        private java.util.List<Integer> ldh___in;
        private java.util.List<Integer> ldh___not___in;
        private Integer ldh___lt;
        private Integer ldh___lte;
        private Integer ldh___gt;
        private Integer ldh___gte;
        private Integer leucociti___eq;
        private Integer leucociti___ne;
        private Boolean leucociti___null;
        private Boolean leucociti___not___null;
        private java.util.List<Integer> leucociti___in;
        private java.util.List<Integer> leucociti___not___in;
        private Integer leucociti___lt;
        private Integer leucociti___lte;
        private Integer leucociti___gt;
        private Integer leucociti___gte;
        private Integer linfociti___eq;
        private Integer linfociti___ne;
        private Boolean linfociti___null;
        private Boolean linfociti___not___null;
        private java.util.List<Integer> linfociti___in;
        private java.util.List<Integer> linfociti___not___in;
        private Integer linfociti___lt;
        private Integer linfociti___lte;
        private Integer linfociti___gt;
        private Integer linfociti___gte;
        private Boolean obeso___eq;
        private Boolean obeso___ne;
        private Boolean obeso___null;
        private Boolean obeso___not___null;
        private Boolean ospedalizzazione___eq;
        private Boolean ospedalizzazione___ne;
        private Boolean ospedalizzazione___null;
        private Boolean ospedalizzazione___not___null;
        private String outcome_altro___eq;
        private String outcome_altro___ne;
        private Boolean outcome_altro___null;
        private Boolean outcome_altro___not___null;
        private java.util.List<String> outcome_altro___in;
        private java.util.List<String> outcome_altro___not___in;
        private String outcome_altro___lt;
        private String outcome_altro___lte;
        private String outcome_altro___gt;
        private String outcome_altro___gte;
        private String outcome_altro___contains;
        private String outcome_altro___not___contains;
        private String outcome_altro___starts_with;
        private String outcome_altro___not___starts_with;
        private String outcome_altro___ends_with;
        private String outcome_altro___not___ends_with;
        private Integer pcr___eq;
        private Integer pcr___ne;
        private Boolean pcr___null;
        private Boolean pcr___not___null;
        private java.util.List<Integer> pcr___in;
        private java.util.List<Integer> pcr___not___in;
        private Integer pcr___lt;
        private Integer pcr___lte;
        private Integer pcr___gt;
        private Integer pcr___gte;
        private String po2_fio2_ingresso___eq;
        private String po2_fio2_ingresso___ne;
        private Boolean po2_fio2_ingresso___null;
        private Boolean po2_fio2_ingresso___not___null;
        private java.util.List<String> po2_fio2_ingresso___in;
        private java.util.List<String> po2_fio2_ingresso___not___in;
        private String po2_fio2_ingresso___lt;
        private String po2_fio2_ingresso___lte;
        private String po2_fio2_ingresso___gt;
        private String po2_fio2_ingresso___gte;
        private Boolean rianimazione___eq;
        private Boolean rianimazione___ne;
        private Boolean rianimazione___null;
        private Boolean rianimazione___not___null;
        private String sintomi_altro___eq;
        private String sintomi_altro___ne;
        private Boolean sintomi_altro___null;
        private Boolean sintomi_altro___not___null;
        private java.util.List<String> sintomi_altro___in;
        private java.util.List<String> sintomi_altro___not___in;
        private String sintomi_altro___lt;
        private String sintomi_altro___lte;
        private String sintomi_altro___gt;
        private String sintomi_altro___gte;
        private String sintomi_altro___contains;
        private String sintomi_altro___not___contains;
        private String sintomi_altro___starts_with;
        private String sintomi_altro___not___starts_with;
        private String sintomi_altro___ends_with;
        private String sintomi_altro___not___ends_with;
        private String spo2_ingresso___eq;
        private String spo2_ingresso___ne;
        private Boolean spo2_ingresso___null;
        private Boolean spo2_ingresso___not___null;
        private java.util.List<String> spo2_ingresso___in;
        private java.util.List<String> spo2_ingresso___not___in;
        private String spo2_ingresso___lt;
        private String spo2_ingresso___lte;
        private String spo2_ingresso___gt;
        private String spo2_ingresso___gte;
        private String spo2_ingresso___contains;
        private String spo2_ingresso___not___contains;
        private String spo2_ingresso___starts_with;
        private String spo2_ingresso___not___starts_with;
        private String spo2_ingresso___ends_with;
        private String spo2_ingresso___not___ends_with;
        private java.util.List<CliC_dettaglioFilterDTO> AND;
        private java.util.List<CliC_dettaglioFilterDTO> OR;
        private CliC_dettaglioFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
            return this;
        }

        public Builder set_id___eq(String _id___eq) {
            this._id___eq = _id___eq;
            return this;
        }

        public Builder set_id___ne(String _id___ne) {
            this._id___ne = _id___ne;
            return this;
        }

        public Builder set_id___null(Boolean _id___null) {
            this._id___null = _id___null;
            return this;
        }

        public Builder set_id___not___null(Boolean _id___not___null) {
            this._id___not___null = _id___not___null;
            return this;
        }

        public Builder set_id___in(java.util.List<String> _id___in) {
            this._id___in = _id___in;
            return this;
        }

        public Builder set_id___not___in(java.util.List<String> _id___not___in) {
            this._id___not___in = _id___not___in;
            return this;
        }

        public Builder set_id___lt(String _id___lt) {
            this._id___lt = _id___lt;
            return this;
        }

        public Builder set_id___lte(String _id___lte) {
            this._id___lte = _id___lte;
            return this;
        }

        public Builder set_id___gt(String _id___gt) {
            this._id___gt = _id___gt;
            return this;
        }

        public Builder set_id___gte(String _id___gte) {
            this._id___gte = _id___gte;
            return this;
        }

        public Builder setAnosmia_disgeusia___eq(Boolean anosmia_disgeusia___eq) {
            this.anosmia_disgeusia___eq = anosmia_disgeusia___eq;
            return this;
        }

        public Builder setAnosmia_disgeusia___ne(Boolean anosmia_disgeusia___ne) {
            this.anosmia_disgeusia___ne = anosmia_disgeusia___ne;
            return this;
        }

        public Builder setAnosmia_disgeusia___null(Boolean anosmia_disgeusia___null) {
            this.anosmia_disgeusia___null = anosmia_disgeusia___null;
            return this;
        }

        public Builder setAnosmia_disgeusia___not___null(Boolean anosmia_disgeusia___not___null) {
            this.anosmia_disgeusia___not___null = anosmia_disgeusia___not___null;
            return this;
        }

        public Builder setBmi___eq(String bmi___eq) {
            this.bmi___eq = bmi___eq;
            return this;
        }

        public Builder setBmi___ne(String bmi___ne) {
            this.bmi___ne = bmi___ne;
            return this;
        }

        public Builder setBmi___null(Boolean bmi___null) {
            this.bmi___null = bmi___null;
            return this;
        }

        public Builder setBmi___not___null(Boolean bmi___not___null) {
            this.bmi___not___null = bmi___not___null;
            return this;
        }

        public Builder setBmi___in(java.util.List<String> bmi___in) {
            this.bmi___in = bmi___in;
            return this;
        }

        public Builder setBmi___not___in(java.util.List<String> bmi___not___in) {
            this.bmi___not___in = bmi___not___in;
            return this;
        }

        public Builder setBmi___lt(String bmi___lt) {
            this.bmi___lt = bmi___lt;
            return this;
        }

        public Builder setBmi___lte(String bmi___lte) {
            this.bmi___lte = bmi___lte;
            return this;
        }

        public Builder setBmi___gt(String bmi___gt) {
            this.bmi___gt = bmi___gt;
            return this;
        }

        public Builder setBmi___gte(String bmi___gte) {
            this.bmi___gte = bmi___gte;
            return this;
        }

        public Builder setCd4_diagnosi_covid___eq(Integer cd4_diagnosi_covid___eq) {
            this.cd4_diagnosi_covid___eq = cd4_diagnosi_covid___eq;
            return this;
        }

        public Builder setCd4_diagnosi_covid___ne(Integer cd4_diagnosi_covid___ne) {
            this.cd4_diagnosi_covid___ne = cd4_diagnosi_covid___ne;
            return this;
        }

        public Builder setCd4_diagnosi_covid___null(Boolean cd4_diagnosi_covid___null) {
            this.cd4_diagnosi_covid___null = cd4_diagnosi_covid___null;
            return this;
        }

        public Builder setCd4_diagnosi_covid___not___null(Boolean cd4_diagnosi_covid___not___null) {
            this.cd4_diagnosi_covid___not___null = cd4_diagnosi_covid___not___null;
            return this;
        }

        public Builder setCd4_diagnosi_covid___in(java.util.List<Integer> cd4_diagnosi_covid___in) {
            this.cd4_diagnosi_covid___in = cd4_diagnosi_covid___in;
            return this;
        }

        public Builder setCd4_diagnosi_covid___not___in(java.util.List<Integer> cd4_diagnosi_covid___not___in) {
            this.cd4_diagnosi_covid___not___in = cd4_diagnosi_covid___not___in;
            return this;
        }

        public Builder setCd4_diagnosi_covid___lt(Integer cd4_diagnosi_covid___lt) {
            this.cd4_diagnosi_covid___lt = cd4_diagnosi_covid___lt;
            return this;
        }

        public Builder setCd4_diagnosi_covid___lte(Integer cd4_diagnosi_covid___lte) {
            this.cd4_diagnosi_covid___lte = cd4_diagnosi_covid___lte;
            return this;
        }

        public Builder setCd4_diagnosi_covid___gt(Integer cd4_diagnosi_covid___gt) {
            this.cd4_diagnosi_covid___gt = cd4_diagnosi_covid___gt;
            return this;
        }

        public Builder setCd4_diagnosi_covid___gte(Integer cd4_diagnosi_covid___gte) {
            this.cd4_diagnosi_covid___gte = cd4_diagnosi_covid___gte;
            return this;
        }

        public Builder setCdc___eq(String cdc___eq) {
            this.cdc___eq = cdc___eq;
            return this;
        }

        public Builder setCdc___ne(String cdc___ne) {
            this.cdc___ne = cdc___ne;
            return this;
        }

        public Builder setCdc___null(Boolean cdc___null) {
            this.cdc___null = cdc___null;
            return this;
        }

        public Builder setCdc___not___null(Boolean cdc___not___null) {
            this.cdc___not___null = cdc___not___null;
            return this;
        }

        public Builder setCdc___in(java.util.List<String> cdc___in) {
            this.cdc___in = cdc___in;
            return this;
        }

        public Builder setCdc___not___in(java.util.List<String> cdc___not___in) {
            this.cdc___not___in = cdc___not___in;
            return this;
        }

        public Builder setCdc___lt(String cdc___lt) {
            this.cdc___lt = cdc___lt;
            return this;
        }

        public Builder setCdc___lte(String cdc___lte) {
            this.cdc___lte = cdc___lte;
            return this;
        }

        public Builder setCdc___gt(String cdc___gt) {
            this.cdc___gt = cdc___gt;
            return this;
        }

        public Builder setCdc___gte(String cdc___gte) {
            this.cdc___gte = cdc___gte;
            return this;
        }

        public Builder setCdc___contains(String cdc___contains) {
            this.cdc___contains = cdc___contains;
            return this;
        }

        public Builder setCdc___not___contains(String cdc___not___contains) {
            this.cdc___not___contains = cdc___not___contains;
            return this;
        }

        public Builder setCdc___starts_with(String cdc___starts_with) {
            this.cdc___starts_with = cdc___starts_with;
            return this;
        }

        public Builder setCdc___not___starts_with(String cdc___not___starts_with) {
            this.cdc___not___starts_with = cdc___not___starts_with;
            return this;
        }

        public Builder setCdc___ends_with(String cdc___ends_with) {
            this.cdc___ends_with = cdc___ends_with;
            return this;
        }

        public Builder setCdc___not___ends_with(String cdc___not___ends_with) {
            this.cdc___not___ends_with = cdc___not___ends_with;
            return this;
        }

        public Builder setD_dimero___eq(Integer d_dimero___eq) {
            this.d_dimero___eq = d_dimero___eq;
            return this;
        }

        public Builder setD_dimero___ne(Integer d_dimero___ne) {
            this.d_dimero___ne = d_dimero___ne;
            return this;
        }

        public Builder setD_dimero___null(Boolean d_dimero___null) {
            this.d_dimero___null = d_dimero___null;
            return this;
        }

        public Builder setD_dimero___not___null(Boolean d_dimero___not___null) {
            this.d_dimero___not___null = d_dimero___not___null;
            return this;
        }

        public Builder setD_dimero___in(java.util.List<Integer> d_dimero___in) {
            this.d_dimero___in = d_dimero___in;
            return this;
        }

        public Builder setD_dimero___not___in(java.util.List<Integer> d_dimero___not___in) {
            this.d_dimero___not___in = d_dimero___not___in;
            return this;
        }

        public Builder setD_dimero___lt(Integer d_dimero___lt) {
            this.d_dimero___lt = d_dimero___lt;
            return this;
        }

        public Builder setD_dimero___lte(Integer d_dimero___lte) {
            this.d_dimero___lte = d_dimero___lte;
            return this;
        }

        public Builder setD_dimero___gt(Integer d_dimero___gt) {
            this.d_dimero___gt = d_dimero___gt;
            return this;
        }

        public Builder setD_dimero___gte(Integer d_dimero___gte) {
            this.d_dimero___gte = d_dimero___gte;
            return this;
        }

        public Builder setData_cd4_diagnosi_covid___eq(String data_cd4_diagnosi_covid___eq) {
            this.data_cd4_diagnosi_covid___eq = data_cd4_diagnosi_covid___eq;
            return this;
        }

        public Builder setData_cd4_diagnosi_covid___ne(String data_cd4_diagnosi_covid___ne) {
            this.data_cd4_diagnosi_covid___ne = data_cd4_diagnosi_covid___ne;
            return this;
        }

        public Builder setData_cd4_diagnosi_covid___null(Boolean data_cd4_diagnosi_covid___null) {
            this.data_cd4_diagnosi_covid___null = data_cd4_diagnosi_covid___null;
            return this;
        }

        public Builder setData_cd4_diagnosi_covid___not___null(Boolean data_cd4_diagnosi_covid___not___null) {
            this.data_cd4_diagnosi_covid___not___null = data_cd4_diagnosi_covid___not___null;
            return this;
        }

        public Builder setData_cd4_diagnosi_covid___in(java.util.List<String> data_cd4_diagnosi_covid___in) {
            this.data_cd4_diagnosi_covid___in = data_cd4_diagnosi_covid___in;
            return this;
        }

        public Builder setData_cd4_diagnosi_covid___not___in(java.util.List<String> data_cd4_diagnosi_covid___not___in) {
            this.data_cd4_diagnosi_covid___not___in = data_cd4_diagnosi_covid___not___in;
            return this;
        }

        public Builder setData_cd4_diagnosi_covid___lt(String data_cd4_diagnosi_covid___lt) {
            this.data_cd4_diagnosi_covid___lt = data_cd4_diagnosi_covid___lt;
            return this;
        }

        public Builder setData_cd4_diagnosi_covid___lte(String data_cd4_diagnosi_covid___lte) {
            this.data_cd4_diagnosi_covid___lte = data_cd4_diagnosi_covid___lte;
            return this;
        }

        public Builder setData_cd4_diagnosi_covid___gt(String data_cd4_diagnosi_covid___gt) {
            this.data_cd4_diagnosi_covid___gt = data_cd4_diagnosi_covid___gt;
            return this;
        }

        public Builder setData_cd4_diagnosi_covid___gte(String data_cd4_diagnosi_covid___gte) {
            this.data_cd4_diagnosi_covid___gte = data_cd4_diagnosi_covid___gte;
            return this;
        }

        public Builder setData_esami_ingresso___eq(String data_esami_ingresso___eq) {
            this.data_esami_ingresso___eq = data_esami_ingresso___eq;
            return this;
        }

        public Builder setData_esami_ingresso___ne(String data_esami_ingresso___ne) {
            this.data_esami_ingresso___ne = data_esami_ingresso___ne;
            return this;
        }

        public Builder setData_esami_ingresso___null(Boolean data_esami_ingresso___null) {
            this.data_esami_ingresso___null = data_esami_ingresso___null;
            return this;
        }

        public Builder setData_esami_ingresso___not___null(Boolean data_esami_ingresso___not___null) {
            this.data_esami_ingresso___not___null = data_esami_ingresso___not___null;
            return this;
        }

        public Builder setData_esami_ingresso___in(java.util.List<String> data_esami_ingresso___in) {
            this.data_esami_ingresso___in = data_esami_ingresso___in;
            return this;
        }

        public Builder setData_esami_ingresso___not___in(java.util.List<String> data_esami_ingresso___not___in) {
            this.data_esami_ingresso___not___in = data_esami_ingresso___not___in;
            return this;
        }

        public Builder setData_esami_ingresso___lt(String data_esami_ingresso___lt) {
            this.data_esami_ingresso___lt = data_esami_ingresso___lt;
            return this;
        }

        public Builder setData_esami_ingresso___lte(String data_esami_ingresso___lte) {
            this.data_esami_ingresso___lte = data_esami_ingresso___lte;
            return this;
        }

        public Builder setData_esami_ingresso___gt(String data_esami_ingresso___gt) {
            this.data_esami_ingresso___gt = data_esami_ingresso___gt;
            return this;
        }

        public Builder setData_esami_ingresso___gte(String data_esami_ingresso___gte) {
            this.data_esami_ingresso___gte = data_esami_ingresso___gte;
            return this;
        }

        public Builder setData_hivrna_diagnosi_covid___eq(String data_hivrna_diagnosi_covid___eq) {
            this.data_hivrna_diagnosi_covid___eq = data_hivrna_diagnosi_covid___eq;
            return this;
        }

        public Builder setData_hivrna_diagnosi_covid___ne(String data_hivrna_diagnosi_covid___ne) {
            this.data_hivrna_diagnosi_covid___ne = data_hivrna_diagnosi_covid___ne;
            return this;
        }

        public Builder setData_hivrna_diagnosi_covid___null(Boolean data_hivrna_diagnosi_covid___null) {
            this.data_hivrna_diagnosi_covid___null = data_hivrna_diagnosi_covid___null;
            return this;
        }

        public Builder setData_hivrna_diagnosi_covid___not___null(Boolean data_hivrna_diagnosi_covid___not___null) {
            this.data_hivrna_diagnosi_covid___not___null = data_hivrna_diagnosi_covid___not___null;
            return this;
        }

        public Builder setData_hivrna_diagnosi_covid___in(java.util.List<String> data_hivrna_diagnosi_covid___in) {
            this.data_hivrna_diagnosi_covid___in = data_hivrna_diagnosi_covid___in;
            return this;
        }

        public Builder setData_hivrna_diagnosi_covid___not___in(java.util.List<String> data_hivrna_diagnosi_covid___not___in) {
            this.data_hivrna_diagnosi_covid___not___in = data_hivrna_diagnosi_covid___not___in;
            return this;
        }

        public Builder setData_hivrna_diagnosi_covid___lt(String data_hivrna_diagnosi_covid___lt) {
            this.data_hivrna_diagnosi_covid___lt = data_hivrna_diagnosi_covid___lt;
            return this;
        }

        public Builder setData_hivrna_diagnosi_covid___lte(String data_hivrna_diagnosi_covid___lte) {
            this.data_hivrna_diagnosi_covid___lte = data_hivrna_diagnosi_covid___lte;
            return this;
        }

        public Builder setData_hivrna_diagnosi_covid___gt(String data_hivrna_diagnosi_covid___gt) {
            this.data_hivrna_diagnosi_covid___gt = data_hivrna_diagnosi_covid___gt;
            return this;
        }

        public Builder setData_hivrna_diagnosi_covid___gte(String data_hivrna_diagnosi_covid___gte) {
            this.data_hivrna_diagnosi_covid___gte = data_hivrna_diagnosi_covid___gte;
            return this;
        }

        public Builder setData_max_ventilazione___eq(String data_max_ventilazione___eq) {
            this.data_max_ventilazione___eq = data_max_ventilazione___eq;
            return this;
        }

        public Builder setData_max_ventilazione___ne(String data_max_ventilazione___ne) {
            this.data_max_ventilazione___ne = data_max_ventilazione___ne;
            return this;
        }

        public Builder setData_max_ventilazione___null(Boolean data_max_ventilazione___null) {
            this.data_max_ventilazione___null = data_max_ventilazione___null;
            return this;
        }

        public Builder setData_max_ventilazione___not___null(Boolean data_max_ventilazione___not___null) {
            this.data_max_ventilazione___not___null = data_max_ventilazione___not___null;
            return this;
        }

        public Builder setData_max_ventilazione___in(java.util.List<String> data_max_ventilazione___in) {
            this.data_max_ventilazione___in = data_max_ventilazione___in;
            return this;
        }

        public Builder setData_max_ventilazione___not___in(java.util.List<String> data_max_ventilazione___not___in) {
            this.data_max_ventilazione___not___in = data_max_ventilazione___not___in;
            return this;
        }

        public Builder setData_max_ventilazione___lt(String data_max_ventilazione___lt) {
            this.data_max_ventilazione___lt = data_max_ventilazione___lt;
            return this;
        }

        public Builder setData_max_ventilazione___lte(String data_max_ventilazione___lte) {
            this.data_max_ventilazione___lte = data_max_ventilazione___lte;
            return this;
        }

        public Builder setData_max_ventilazione___gt(String data_max_ventilazione___gt) {
            this.data_max_ventilazione___gt = data_max_ventilazione___gt;
            return this;
        }

        public Builder setData_max_ventilazione___gte(String data_max_ventilazione___gte) {
            this.data_max_ventilazione___gte = data_max_ventilazione___gte;
            return this;
        }

        public Builder setData_ospedalizzazione___eq(String data_ospedalizzazione___eq) {
            this.data_ospedalizzazione___eq = data_ospedalizzazione___eq;
            return this;
        }

        public Builder setData_ospedalizzazione___ne(String data_ospedalizzazione___ne) {
            this.data_ospedalizzazione___ne = data_ospedalizzazione___ne;
            return this;
        }

        public Builder setData_ospedalizzazione___null(Boolean data_ospedalizzazione___null) {
            this.data_ospedalizzazione___null = data_ospedalizzazione___null;
            return this;
        }

        public Builder setData_ospedalizzazione___not___null(Boolean data_ospedalizzazione___not___null) {
            this.data_ospedalizzazione___not___null = data_ospedalizzazione___not___null;
            return this;
        }

        public Builder setData_ospedalizzazione___in(java.util.List<String> data_ospedalizzazione___in) {
            this.data_ospedalizzazione___in = data_ospedalizzazione___in;
            return this;
        }

        public Builder setData_ospedalizzazione___not___in(java.util.List<String> data_ospedalizzazione___not___in) {
            this.data_ospedalizzazione___not___in = data_ospedalizzazione___not___in;
            return this;
        }

        public Builder setData_ospedalizzazione___lt(String data_ospedalizzazione___lt) {
            this.data_ospedalizzazione___lt = data_ospedalizzazione___lt;
            return this;
        }

        public Builder setData_ospedalizzazione___lte(String data_ospedalizzazione___lte) {
            this.data_ospedalizzazione___lte = data_ospedalizzazione___lte;
            return this;
        }

        public Builder setData_ospedalizzazione___gt(String data_ospedalizzazione___gt) {
            this.data_ospedalizzazione___gt = data_ospedalizzazione___gt;
            return this;
        }

        public Builder setData_ospedalizzazione___gte(String data_ospedalizzazione___gte) {
            this.data_ospedalizzazione___gte = data_ospedalizzazione___gte;
            return this;
        }

        public Builder setData_rianimazione___eq(String data_rianimazione___eq) {
            this.data_rianimazione___eq = data_rianimazione___eq;
            return this;
        }

        public Builder setData_rianimazione___ne(String data_rianimazione___ne) {
            this.data_rianimazione___ne = data_rianimazione___ne;
            return this;
        }

        public Builder setData_rianimazione___null(Boolean data_rianimazione___null) {
            this.data_rianimazione___null = data_rianimazione___null;
            return this;
        }

        public Builder setData_rianimazione___not___null(Boolean data_rianimazione___not___null) {
            this.data_rianimazione___not___null = data_rianimazione___not___null;
            return this;
        }

        public Builder setData_rianimazione___in(java.util.List<String> data_rianimazione___in) {
            this.data_rianimazione___in = data_rianimazione___in;
            return this;
        }

        public Builder setData_rianimazione___not___in(java.util.List<String> data_rianimazione___not___in) {
            this.data_rianimazione___not___in = data_rianimazione___not___in;
            return this;
        }

        public Builder setData_rianimazione___lt(String data_rianimazione___lt) {
            this.data_rianimazione___lt = data_rianimazione___lt;
            return this;
        }

        public Builder setData_rianimazione___lte(String data_rianimazione___lte) {
            this.data_rianimazione___lte = data_rianimazione___lte;
            return this;
        }

        public Builder setData_rianimazione___gt(String data_rianimazione___gt) {
            this.data_rianimazione___gt = data_rianimazione___gt;
            return this;
        }

        public Builder setData_rianimazione___gte(String data_rianimazione___gte) {
            this.data_rianimazione___gte = data_rianimazione___gte;
            return this;
        }

        public Builder setData_tampone___eq(String data_tampone___eq) {
            this.data_tampone___eq = data_tampone___eq;
            return this;
        }

        public Builder setData_tampone___ne(String data_tampone___ne) {
            this.data_tampone___ne = data_tampone___ne;
            return this;
        }

        public Builder setData_tampone___null(Boolean data_tampone___null) {
            this.data_tampone___null = data_tampone___null;
            return this;
        }

        public Builder setData_tampone___not___null(Boolean data_tampone___not___null) {
            this.data_tampone___not___null = data_tampone___not___null;
            return this;
        }

        public Builder setData_tampone___in(java.util.List<String> data_tampone___in) {
            this.data_tampone___in = data_tampone___in;
            return this;
        }

        public Builder setData_tampone___not___in(java.util.List<String> data_tampone___not___in) {
            this.data_tampone___not___in = data_tampone___not___in;
            return this;
        }

        public Builder setData_tampone___lt(String data_tampone___lt) {
            this.data_tampone___lt = data_tampone___lt;
            return this;
        }

        public Builder setData_tampone___lte(String data_tampone___lte) {
            this.data_tampone___lte = data_tampone___lte;
            return this;
        }

        public Builder setData_tampone___gt(String data_tampone___gt) {
            this.data_tampone___gt = data_tampone___gt;
            return this;
        }

        public Builder setData_tampone___gte(String data_tampone___gte) {
            this.data_tampone___gte = data_tampone___gte;
            return this;
        }

        public Builder setData_ultimo_contatto___eq(String data_ultimo_contatto___eq) {
            this.data_ultimo_contatto___eq = data_ultimo_contatto___eq;
            return this;
        }

        public Builder setData_ultimo_contatto___ne(String data_ultimo_contatto___ne) {
            this.data_ultimo_contatto___ne = data_ultimo_contatto___ne;
            return this;
        }

        public Builder setData_ultimo_contatto___null(Boolean data_ultimo_contatto___null) {
            this.data_ultimo_contatto___null = data_ultimo_contatto___null;
            return this;
        }

        public Builder setData_ultimo_contatto___not___null(Boolean data_ultimo_contatto___not___null) {
            this.data_ultimo_contatto___not___null = data_ultimo_contatto___not___null;
            return this;
        }

        public Builder setData_ultimo_contatto___in(java.util.List<String> data_ultimo_contatto___in) {
            this.data_ultimo_contatto___in = data_ultimo_contatto___in;
            return this;
        }

        public Builder setData_ultimo_contatto___not___in(java.util.List<String> data_ultimo_contatto___not___in) {
            this.data_ultimo_contatto___not___in = data_ultimo_contatto___not___in;
            return this;
        }

        public Builder setData_ultimo_contatto___lt(String data_ultimo_contatto___lt) {
            this.data_ultimo_contatto___lt = data_ultimo_contatto___lt;
            return this;
        }

        public Builder setData_ultimo_contatto___lte(String data_ultimo_contatto___lte) {
            this.data_ultimo_contatto___lte = data_ultimo_contatto___lte;
            return this;
        }

        public Builder setData_ultimo_contatto___gt(String data_ultimo_contatto___gt) {
            this.data_ultimo_contatto___gt = data_ultimo_contatto___gt;
            return this;
        }

        public Builder setData_ultimo_contatto___gte(String data_ultimo_contatto___gte) {
            this.data_ultimo_contatto___gte = data_ultimo_contatto___gte;
            return this;
        }

        public Builder setFerritina___eq(Integer ferritina___eq) {
            this.ferritina___eq = ferritina___eq;
            return this;
        }

        public Builder setFerritina___ne(Integer ferritina___ne) {
            this.ferritina___ne = ferritina___ne;
            return this;
        }

        public Builder setFerritina___null(Boolean ferritina___null) {
            this.ferritina___null = ferritina___null;
            return this;
        }

        public Builder setFerritina___not___null(Boolean ferritina___not___null) {
            this.ferritina___not___null = ferritina___not___null;
            return this;
        }

        public Builder setFerritina___in(java.util.List<Integer> ferritina___in) {
            this.ferritina___in = ferritina___in;
            return this;
        }

        public Builder setFerritina___not___in(java.util.List<Integer> ferritina___not___in) {
            this.ferritina___not___in = ferritina___not___in;
            return this;
        }

        public Builder setFerritina___lt(Integer ferritina___lt) {
            this.ferritina___lt = ferritina___lt;
            return this;
        }

        public Builder setFerritina___lte(Integer ferritina___lte) {
            this.ferritina___lte = ferritina___lte;
            return this;
        }

        public Builder setFerritina___gt(Integer ferritina___gt) {
            this.ferritina___gt = ferritina___gt;
            return this;
        }

        public Builder setFerritina___gte(Integer ferritina___gte) {
            this.ferritina___gte = ferritina___gte;
            return this;
        }

        public Builder setFrequenza_resp___eq(Integer frequenza_resp___eq) {
            this.frequenza_resp___eq = frequenza_resp___eq;
            return this;
        }

        public Builder setFrequenza_resp___ne(Integer frequenza_resp___ne) {
            this.frequenza_resp___ne = frequenza_resp___ne;
            return this;
        }

        public Builder setFrequenza_resp___null(Boolean frequenza_resp___null) {
            this.frequenza_resp___null = frequenza_resp___null;
            return this;
        }

        public Builder setFrequenza_resp___not___null(Boolean frequenza_resp___not___null) {
            this.frequenza_resp___not___null = frequenza_resp___not___null;
            return this;
        }

        public Builder setFrequenza_resp___in(java.util.List<Integer> frequenza_resp___in) {
            this.frequenza_resp___in = frequenza_resp___in;
            return this;
        }

        public Builder setFrequenza_resp___not___in(java.util.List<Integer> frequenza_resp___not___in) {
            this.frequenza_resp___not___in = frequenza_resp___not___in;
            return this;
        }

        public Builder setFrequenza_resp___lt(Integer frequenza_resp___lt) {
            this.frequenza_resp___lt = frequenza_resp___lt;
            return this;
        }

        public Builder setFrequenza_resp___lte(Integer frequenza_resp___lte) {
            this.frequenza_resp___lte = frequenza_resp___lte;
            return this;
        }

        public Builder setFrequenza_resp___gt(Integer frequenza_resp___gt) {
            this.frequenza_resp___gt = frequenza_resp___gt;
            return this;
        }

        public Builder setFrequenza_resp___gte(Integer frequenza_resp___gte) {
            this.frequenza_resp___gte = frequenza_resp___gte;
            return this;
        }

        public Builder setFumatore___eq(String fumatore___eq) {
            this.fumatore___eq = fumatore___eq;
            return this;
        }

        public Builder setFumatore___ne(String fumatore___ne) {
            this.fumatore___ne = fumatore___ne;
            return this;
        }

        public Builder setFumatore___null(Boolean fumatore___null) {
            this.fumatore___null = fumatore___null;
            return this;
        }

        public Builder setFumatore___not___null(Boolean fumatore___not___null) {
            this.fumatore___not___null = fumatore___not___null;
            return this;
        }

        public Builder setFumatore___in(java.util.List<String> fumatore___in) {
            this.fumatore___in = fumatore___in;
            return this;
        }

        public Builder setFumatore___not___in(java.util.List<String> fumatore___not___in) {
            this.fumatore___not___in = fumatore___not___in;
            return this;
        }

        public Builder setFumatore___lt(String fumatore___lt) {
            this.fumatore___lt = fumatore___lt;
            return this;
        }

        public Builder setFumatore___lte(String fumatore___lte) {
            this.fumatore___lte = fumatore___lte;
            return this;
        }

        public Builder setFumatore___gt(String fumatore___gt) {
            this.fumatore___gt = fumatore___gt;
            return this;
        }

        public Builder setFumatore___gte(String fumatore___gte) {
            this.fumatore___gte = fumatore___gte;
            return this;
        }

        public Builder setFumatore___contains(String fumatore___contains) {
            this.fumatore___contains = fumatore___contains;
            return this;
        }

        public Builder setFumatore___not___contains(String fumatore___not___contains) {
            this.fumatore___not___contains = fumatore___not___contains;
            return this;
        }

        public Builder setFumatore___starts_with(String fumatore___starts_with) {
            this.fumatore___starts_with = fumatore___starts_with;
            return this;
        }

        public Builder setFumatore___not___starts_with(String fumatore___not___starts_with) {
            this.fumatore___not___starts_with = fumatore___not___starts_with;
            return this;
        }

        public Builder setFumatore___ends_with(String fumatore___ends_with) {
            this.fumatore___ends_with = fumatore___ends_with;
            return this;
        }

        public Builder setFumatore___not___ends_with(String fumatore___not___ends_with) {
            this.fumatore___not___ends_with = fumatore___not___ends_with;
            return this;
        }

        public Builder setHivrna_diagnosi_covid___eq(Integer hivrna_diagnosi_covid___eq) {
            this.hivrna_diagnosi_covid___eq = hivrna_diagnosi_covid___eq;
            return this;
        }

        public Builder setHivrna_diagnosi_covid___ne(Integer hivrna_diagnosi_covid___ne) {
            this.hivrna_diagnosi_covid___ne = hivrna_diagnosi_covid___ne;
            return this;
        }

        public Builder setHivrna_diagnosi_covid___null(Boolean hivrna_diagnosi_covid___null) {
            this.hivrna_diagnosi_covid___null = hivrna_diagnosi_covid___null;
            return this;
        }

        public Builder setHivrna_diagnosi_covid___not___null(Boolean hivrna_diagnosi_covid___not___null) {
            this.hivrna_diagnosi_covid___not___null = hivrna_diagnosi_covid___not___null;
            return this;
        }

        public Builder setHivrna_diagnosi_covid___in(java.util.List<Integer> hivrna_diagnosi_covid___in) {
            this.hivrna_diagnosi_covid___in = hivrna_diagnosi_covid___in;
            return this;
        }

        public Builder setHivrna_diagnosi_covid___not___in(java.util.List<Integer> hivrna_diagnosi_covid___not___in) {
            this.hivrna_diagnosi_covid___not___in = hivrna_diagnosi_covid___not___in;
            return this;
        }

        public Builder setHivrna_diagnosi_covid___lt(Integer hivrna_diagnosi_covid___lt) {
            this.hivrna_diagnosi_covid___lt = hivrna_diagnosi_covid___lt;
            return this;
        }

        public Builder setHivrna_diagnosi_covid___lte(Integer hivrna_diagnosi_covid___lte) {
            this.hivrna_diagnosi_covid___lte = hivrna_diagnosi_covid___lte;
            return this;
        }

        public Builder setHivrna_diagnosi_covid___gt(Integer hivrna_diagnosi_covid___gt) {
            this.hivrna_diagnosi_covid___gt = hivrna_diagnosi_covid___gt;
            return this;
        }

        public Builder setHivrna_diagnosi_covid___gte(Integer hivrna_diagnosi_covid___gte) {
            this.hivrna_diagnosi_covid___gte = hivrna_diagnosi_covid___gte;
            return this;
        }

        public Builder setLdh___eq(Integer ldh___eq) {
            this.ldh___eq = ldh___eq;
            return this;
        }

        public Builder setLdh___ne(Integer ldh___ne) {
            this.ldh___ne = ldh___ne;
            return this;
        }

        public Builder setLdh___null(Boolean ldh___null) {
            this.ldh___null = ldh___null;
            return this;
        }

        public Builder setLdh___not___null(Boolean ldh___not___null) {
            this.ldh___not___null = ldh___not___null;
            return this;
        }

        public Builder setLdh___in(java.util.List<Integer> ldh___in) {
            this.ldh___in = ldh___in;
            return this;
        }

        public Builder setLdh___not___in(java.util.List<Integer> ldh___not___in) {
            this.ldh___not___in = ldh___not___in;
            return this;
        }

        public Builder setLdh___lt(Integer ldh___lt) {
            this.ldh___lt = ldh___lt;
            return this;
        }

        public Builder setLdh___lte(Integer ldh___lte) {
            this.ldh___lte = ldh___lte;
            return this;
        }

        public Builder setLdh___gt(Integer ldh___gt) {
            this.ldh___gt = ldh___gt;
            return this;
        }

        public Builder setLdh___gte(Integer ldh___gte) {
            this.ldh___gte = ldh___gte;
            return this;
        }

        public Builder setLeucociti___eq(Integer leucociti___eq) {
            this.leucociti___eq = leucociti___eq;
            return this;
        }

        public Builder setLeucociti___ne(Integer leucociti___ne) {
            this.leucociti___ne = leucociti___ne;
            return this;
        }

        public Builder setLeucociti___null(Boolean leucociti___null) {
            this.leucociti___null = leucociti___null;
            return this;
        }

        public Builder setLeucociti___not___null(Boolean leucociti___not___null) {
            this.leucociti___not___null = leucociti___not___null;
            return this;
        }

        public Builder setLeucociti___in(java.util.List<Integer> leucociti___in) {
            this.leucociti___in = leucociti___in;
            return this;
        }

        public Builder setLeucociti___not___in(java.util.List<Integer> leucociti___not___in) {
            this.leucociti___not___in = leucociti___not___in;
            return this;
        }

        public Builder setLeucociti___lt(Integer leucociti___lt) {
            this.leucociti___lt = leucociti___lt;
            return this;
        }

        public Builder setLeucociti___lte(Integer leucociti___lte) {
            this.leucociti___lte = leucociti___lte;
            return this;
        }

        public Builder setLeucociti___gt(Integer leucociti___gt) {
            this.leucociti___gt = leucociti___gt;
            return this;
        }

        public Builder setLeucociti___gte(Integer leucociti___gte) {
            this.leucociti___gte = leucociti___gte;
            return this;
        }

        public Builder setLinfociti___eq(Integer linfociti___eq) {
            this.linfociti___eq = linfociti___eq;
            return this;
        }

        public Builder setLinfociti___ne(Integer linfociti___ne) {
            this.linfociti___ne = linfociti___ne;
            return this;
        }

        public Builder setLinfociti___null(Boolean linfociti___null) {
            this.linfociti___null = linfociti___null;
            return this;
        }

        public Builder setLinfociti___not___null(Boolean linfociti___not___null) {
            this.linfociti___not___null = linfociti___not___null;
            return this;
        }

        public Builder setLinfociti___in(java.util.List<Integer> linfociti___in) {
            this.linfociti___in = linfociti___in;
            return this;
        }

        public Builder setLinfociti___not___in(java.util.List<Integer> linfociti___not___in) {
            this.linfociti___not___in = linfociti___not___in;
            return this;
        }

        public Builder setLinfociti___lt(Integer linfociti___lt) {
            this.linfociti___lt = linfociti___lt;
            return this;
        }

        public Builder setLinfociti___lte(Integer linfociti___lte) {
            this.linfociti___lte = linfociti___lte;
            return this;
        }

        public Builder setLinfociti___gt(Integer linfociti___gt) {
            this.linfociti___gt = linfociti___gt;
            return this;
        }

        public Builder setLinfociti___gte(Integer linfociti___gte) {
            this.linfociti___gte = linfociti___gte;
            return this;
        }

        public Builder setObeso___eq(Boolean obeso___eq) {
            this.obeso___eq = obeso___eq;
            return this;
        }

        public Builder setObeso___ne(Boolean obeso___ne) {
            this.obeso___ne = obeso___ne;
            return this;
        }

        public Builder setObeso___null(Boolean obeso___null) {
            this.obeso___null = obeso___null;
            return this;
        }

        public Builder setObeso___not___null(Boolean obeso___not___null) {
            this.obeso___not___null = obeso___not___null;
            return this;
        }

        public Builder setOspedalizzazione___eq(Boolean ospedalizzazione___eq) {
            this.ospedalizzazione___eq = ospedalizzazione___eq;
            return this;
        }

        public Builder setOspedalizzazione___ne(Boolean ospedalizzazione___ne) {
            this.ospedalizzazione___ne = ospedalizzazione___ne;
            return this;
        }

        public Builder setOspedalizzazione___null(Boolean ospedalizzazione___null) {
            this.ospedalizzazione___null = ospedalizzazione___null;
            return this;
        }

        public Builder setOspedalizzazione___not___null(Boolean ospedalizzazione___not___null) {
            this.ospedalizzazione___not___null = ospedalizzazione___not___null;
            return this;
        }

        public Builder setOutcome_altro___eq(String outcome_altro___eq) {
            this.outcome_altro___eq = outcome_altro___eq;
            return this;
        }

        public Builder setOutcome_altro___ne(String outcome_altro___ne) {
            this.outcome_altro___ne = outcome_altro___ne;
            return this;
        }

        public Builder setOutcome_altro___null(Boolean outcome_altro___null) {
            this.outcome_altro___null = outcome_altro___null;
            return this;
        }

        public Builder setOutcome_altro___not___null(Boolean outcome_altro___not___null) {
            this.outcome_altro___not___null = outcome_altro___not___null;
            return this;
        }

        public Builder setOutcome_altro___in(java.util.List<String> outcome_altro___in) {
            this.outcome_altro___in = outcome_altro___in;
            return this;
        }

        public Builder setOutcome_altro___not___in(java.util.List<String> outcome_altro___not___in) {
            this.outcome_altro___not___in = outcome_altro___not___in;
            return this;
        }

        public Builder setOutcome_altro___lt(String outcome_altro___lt) {
            this.outcome_altro___lt = outcome_altro___lt;
            return this;
        }

        public Builder setOutcome_altro___lte(String outcome_altro___lte) {
            this.outcome_altro___lte = outcome_altro___lte;
            return this;
        }

        public Builder setOutcome_altro___gt(String outcome_altro___gt) {
            this.outcome_altro___gt = outcome_altro___gt;
            return this;
        }

        public Builder setOutcome_altro___gte(String outcome_altro___gte) {
            this.outcome_altro___gte = outcome_altro___gte;
            return this;
        }

        public Builder setOutcome_altro___contains(String outcome_altro___contains) {
            this.outcome_altro___contains = outcome_altro___contains;
            return this;
        }

        public Builder setOutcome_altro___not___contains(String outcome_altro___not___contains) {
            this.outcome_altro___not___contains = outcome_altro___not___contains;
            return this;
        }

        public Builder setOutcome_altro___starts_with(String outcome_altro___starts_with) {
            this.outcome_altro___starts_with = outcome_altro___starts_with;
            return this;
        }

        public Builder setOutcome_altro___not___starts_with(String outcome_altro___not___starts_with) {
            this.outcome_altro___not___starts_with = outcome_altro___not___starts_with;
            return this;
        }

        public Builder setOutcome_altro___ends_with(String outcome_altro___ends_with) {
            this.outcome_altro___ends_with = outcome_altro___ends_with;
            return this;
        }

        public Builder setOutcome_altro___not___ends_with(String outcome_altro___not___ends_with) {
            this.outcome_altro___not___ends_with = outcome_altro___not___ends_with;
            return this;
        }

        public Builder setPcr___eq(Integer pcr___eq) {
            this.pcr___eq = pcr___eq;
            return this;
        }

        public Builder setPcr___ne(Integer pcr___ne) {
            this.pcr___ne = pcr___ne;
            return this;
        }

        public Builder setPcr___null(Boolean pcr___null) {
            this.pcr___null = pcr___null;
            return this;
        }

        public Builder setPcr___not___null(Boolean pcr___not___null) {
            this.pcr___not___null = pcr___not___null;
            return this;
        }

        public Builder setPcr___in(java.util.List<Integer> pcr___in) {
            this.pcr___in = pcr___in;
            return this;
        }

        public Builder setPcr___not___in(java.util.List<Integer> pcr___not___in) {
            this.pcr___not___in = pcr___not___in;
            return this;
        }

        public Builder setPcr___lt(Integer pcr___lt) {
            this.pcr___lt = pcr___lt;
            return this;
        }

        public Builder setPcr___lte(Integer pcr___lte) {
            this.pcr___lte = pcr___lte;
            return this;
        }

        public Builder setPcr___gt(Integer pcr___gt) {
            this.pcr___gt = pcr___gt;
            return this;
        }

        public Builder setPcr___gte(Integer pcr___gte) {
            this.pcr___gte = pcr___gte;
            return this;
        }

        public Builder setPo2_fio2_ingresso___eq(String po2_fio2_ingresso___eq) {
            this.po2_fio2_ingresso___eq = po2_fio2_ingresso___eq;
            return this;
        }

        public Builder setPo2_fio2_ingresso___ne(String po2_fio2_ingresso___ne) {
            this.po2_fio2_ingresso___ne = po2_fio2_ingresso___ne;
            return this;
        }

        public Builder setPo2_fio2_ingresso___null(Boolean po2_fio2_ingresso___null) {
            this.po2_fio2_ingresso___null = po2_fio2_ingresso___null;
            return this;
        }

        public Builder setPo2_fio2_ingresso___not___null(Boolean po2_fio2_ingresso___not___null) {
            this.po2_fio2_ingresso___not___null = po2_fio2_ingresso___not___null;
            return this;
        }

        public Builder setPo2_fio2_ingresso___in(java.util.List<String> po2_fio2_ingresso___in) {
            this.po2_fio2_ingresso___in = po2_fio2_ingresso___in;
            return this;
        }

        public Builder setPo2_fio2_ingresso___not___in(java.util.List<String> po2_fio2_ingresso___not___in) {
            this.po2_fio2_ingresso___not___in = po2_fio2_ingresso___not___in;
            return this;
        }

        public Builder setPo2_fio2_ingresso___lt(String po2_fio2_ingresso___lt) {
            this.po2_fio2_ingresso___lt = po2_fio2_ingresso___lt;
            return this;
        }

        public Builder setPo2_fio2_ingresso___lte(String po2_fio2_ingresso___lte) {
            this.po2_fio2_ingresso___lte = po2_fio2_ingresso___lte;
            return this;
        }

        public Builder setPo2_fio2_ingresso___gt(String po2_fio2_ingresso___gt) {
            this.po2_fio2_ingresso___gt = po2_fio2_ingresso___gt;
            return this;
        }

        public Builder setPo2_fio2_ingresso___gte(String po2_fio2_ingresso___gte) {
            this.po2_fio2_ingresso___gte = po2_fio2_ingresso___gte;
            return this;
        }

        public Builder setRianimazione___eq(Boolean rianimazione___eq) {
            this.rianimazione___eq = rianimazione___eq;
            return this;
        }

        public Builder setRianimazione___ne(Boolean rianimazione___ne) {
            this.rianimazione___ne = rianimazione___ne;
            return this;
        }

        public Builder setRianimazione___null(Boolean rianimazione___null) {
            this.rianimazione___null = rianimazione___null;
            return this;
        }

        public Builder setRianimazione___not___null(Boolean rianimazione___not___null) {
            this.rianimazione___not___null = rianimazione___not___null;
            return this;
        }

        public Builder setSintomi_altro___eq(String sintomi_altro___eq) {
            this.sintomi_altro___eq = sintomi_altro___eq;
            return this;
        }

        public Builder setSintomi_altro___ne(String sintomi_altro___ne) {
            this.sintomi_altro___ne = sintomi_altro___ne;
            return this;
        }

        public Builder setSintomi_altro___null(Boolean sintomi_altro___null) {
            this.sintomi_altro___null = sintomi_altro___null;
            return this;
        }

        public Builder setSintomi_altro___not___null(Boolean sintomi_altro___not___null) {
            this.sintomi_altro___not___null = sintomi_altro___not___null;
            return this;
        }

        public Builder setSintomi_altro___in(java.util.List<String> sintomi_altro___in) {
            this.sintomi_altro___in = sintomi_altro___in;
            return this;
        }

        public Builder setSintomi_altro___not___in(java.util.List<String> sintomi_altro___not___in) {
            this.sintomi_altro___not___in = sintomi_altro___not___in;
            return this;
        }

        public Builder setSintomi_altro___lt(String sintomi_altro___lt) {
            this.sintomi_altro___lt = sintomi_altro___lt;
            return this;
        }

        public Builder setSintomi_altro___lte(String sintomi_altro___lte) {
            this.sintomi_altro___lte = sintomi_altro___lte;
            return this;
        }

        public Builder setSintomi_altro___gt(String sintomi_altro___gt) {
            this.sintomi_altro___gt = sintomi_altro___gt;
            return this;
        }

        public Builder setSintomi_altro___gte(String sintomi_altro___gte) {
            this.sintomi_altro___gte = sintomi_altro___gte;
            return this;
        }

        public Builder setSintomi_altro___contains(String sintomi_altro___contains) {
            this.sintomi_altro___contains = sintomi_altro___contains;
            return this;
        }

        public Builder setSintomi_altro___not___contains(String sintomi_altro___not___contains) {
            this.sintomi_altro___not___contains = sintomi_altro___not___contains;
            return this;
        }

        public Builder setSintomi_altro___starts_with(String sintomi_altro___starts_with) {
            this.sintomi_altro___starts_with = sintomi_altro___starts_with;
            return this;
        }

        public Builder setSintomi_altro___not___starts_with(String sintomi_altro___not___starts_with) {
            this.sintomi_altro___not___starts_with = sintomi_altro___not___starts_with;
            return this;
        }

        public Builder setSintomi_altro___ends_with(String sintomi_altro___ends_with) {
            this.sintomi_altro___ends_with = sintomi_altro___ends_with;
            return this;
        }

        public Builder setSintomi_altro___not___ends_with(String sintomi_altro___not___ends_with) {
            this.sintomi_altro___not___ends_with = sintomi_altro___not___ends_with;
            return this;
        }

        public Builder setSpo2_ingresso___eq(String spo2_ingresso___eq) {
            this.spo2_ingresso___eq = spo2_ingresso___eq;
            return this;
        }

        public Builder setSpo2_ingresso___ne(String spo2_ingresso___ne) {
            this.spo2_ingresso___ne = spo2_ingresso___ne;
            return this;
        }

        public Builder setSpo2_ingresso___null(Boolean spo2_ingresso___null) {
            this.spo2_ingresso___null = spo2_ingresso___null;
            return this;
        }

        public Builder setSpo2_ingresso___not___null(Boolean spo2_ingresso___not___null) {
            this.spo2_ingresso___not___null = spo2_ingresso___not___null;
            return this;
        }

        public Builder setSpo2_ingresso___in(java.util.List<String> spo2_ingresso___in) {
            this.spo2_ingresso___in = spo2_ingresso___in;
            return this;
        }

        public Builder setSpo2_ingresso___not___in(java.util.List<String> spo2_ingresso___not___in) {
            this.spo2_ingresso___not___in = spo2_ingresso___not___in;
            return this;
        }

        public Builder setSpo2_ingresso___lt(String spo2_ingresso___lt) {
            this.spo2_ingresso___lt = spo2_ingresso___lt;
            return this;
        }

        public Builder setSpo2_ingresso___lte(String spo2_ingresso___lte) {
            this.spo2_ingresso___lte = spo2_ingresso___lte;
            return this;
        }

        public Builder setSpo2_ingresso___gt(String spo2_ingresso___gt) {
            this.spo2_ingresso___gt = spo2_ingresso___gt;
            return this;
        }

        public Builder setSpo2_ingresso___gte(String spo2_ingresso___gte) {
            this.spo2_ingresso___gte = spo2_ingresso___gte;
            return this;
        }

        public Builder setSpo2_ingresso___contains(String spo2_ingresso___contains) {
            this.spo2_ingresso___contains = spo2_ingresso___contains;
            return this;
        }

        public Builder setSpo2_ingresso___not___contains(String spo2_ingresso___not___contains) {
            this.spo2_ingresso___not___contains = spo2_ingresso___not___contains;
            return this;
        }

        public Builder setSpo2_ingresso___starts_with(String spo2_ingresso___starts_with) {
            this.spo2_ingresso___starts_with = spo2_ingresso___starts_with;
            return this;
        }

        public Builder setSpo2_ingresso___not___starts_with(String spo2_ingresso___not___starts_with) {
            this.spo2_ingresso___not___starts_with = spo2_ingresso___not___starts_with;
            return this;
        }

        public Builder setSpo2_ingresso___ends_with(String spo2_ingresso___ends_with) {
            this.spo2_ingresso___ends_with = spo2_ingresso___ends_with;
            return this;
        }

        public Builder setSpo2_ingresso___not___ends_with(String spo2_ingresso___not___ends_with) {
            this.spo2_ingresso___not___ends_with = spo2_ingresso___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliC_dettaglioFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliC_dettaglioFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliC_dettaglioFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliC_dettaglioFilterDTO build() {
            CliC_dettaglioFilterDTO result = new CliC_dettaglioFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
            result.set_id___eq(this._id___eq);
            result.set_id___ne(this._id___ne);
            result.set_id___null(this._id___null);
            result.set_id___not___null(this._id___not___null);
            result.set_id___in(this._id___in);
            result.set_id___not___in(this._id___not___in);
            result.set_id___lt(this._id___lt);
            result.set_id___lte(this._id___lte);
            result.set_id___gt(this._id___gt);
            result.set_id___gte(this._id___gte);
            result.setAnosmia_disgeusia___eq(this.anosmia_disgeusia___eq);
            result.setAnosmia_disgeusia___ne(this.anosmia_disgeusia___ne);
            result.setAnosmia_disgeusia___null(this.anosmia_disgeusia___null);
            result.setAnosmia_disgeusia___not___null(this.anosmia_disgeusia___not___null);
            result.setBmi___eq(this.bmi___eq);
            result.setBmi___ne(this.bmi___ne);
            result.setBmi___null(this.bmi___null);
            result.setBmi___not___null(this.bmi___not___null);
            result.setBmi___in(this.bmi___in);
            result.setBmi___not___in(this.bmi___not___in);
            result.setBmi___lt(this.bmi___lt);
            result.setBmi___lte(this.bmi___lte);
            result.setBmi___gt(this.bmi___gt);
            result.setBmi___gte(this.bmi___gte);
            result.setCd4_diagnosi_covid___eq(this.cd4_diagnosi_covid___eq);
            result.setCd4_diagnosi_covid___ne(this.cd4_diagnosi_covid___ne);
            result.setCd4_diagnosi_covid___null(this.cd4_diagnosi_covid___null);
            result.setCd4_diagnosi_covid___not___null(this.cd4_diagnosi_covid___not___null);
            result.setCd4_diagnosi_covid___in(this.cd4_diagnosi_covid___in);
            result.setCd4_diagnosi_covid___not___in(this.cd4_diagnosi_covid___not___in);
            result.setCd4_diagnosi_covid___lt(this.cd4_diagnosi_covid___lt);
            result.setCd4_diagnosi_covid___lte(this.cd4_diagnosi_covid___lte);
            result.setCd4_diagnosi_covid___gt(this.cd4_diagnosi_covid___gt);
            result.setCd4_diagnosi_covid___gte(this.cd4_diagnosi_covid___gte);
            result.setCdc___eq(this.cdc___eq);
            result.setCdc___ne(this.cdc___ne);
            result.setCdc___null(this.cdc___null);
            result.setCdc___not___null(this.cdc___not___null);
            result.setCdc___in(this.cdc___in);
            result.setCdc___not___in(this.cdc___not___in);
            result.setCdc___lt(this.cdc___lt);
            result.setCdc___lte(this.cdc___lte);
            result.setCdc___gt(this.cdc___gt);
            result.setCdc___gte(this.cdc___gte);
            result.setCdc___contains(this.cdc___contains);
            result.setCdc___not___contains(this.cdc___not___contains);
            result.setCdc___starts_with(this.cdc___starts_with);
            result.setCdc___not___starts_with(this.cdc___not___starts_with);
            result.setCdc___ends_with(this.cdc___ends_with);
            result.setCdc___not___ends_with(this.cdc___not___ends_with);
            result.setD_dimero___eq(this.d_dimero___eq);
            result.setD_dimero___ne(this.d_dimero___ne);
            result.setD_dimero___null(this.d_dimero___null);
            result.setD_dimero___not___null(this.d_dimero___not___null);
            result.setD_dimero___in(this.d_dimero___in);
            result.setD_dimero___not___in(this.d_dimero___not___in);
            result.setD_dimero___lt(this.d_dimero___lt);
            result.setD_dimero___lte(this.d_dimero___lte);
            result.setD_dimero___gt(this.d_dimero___gt);
            result.setD_dimero___gte(this.d_dimero___gte);
            result.setData_cd4_diagnosi_covid___eq(this.data_cd4_diagnosi_covid___eq);
            result.setData_cd4_diagnosi_covid___ne(this.data_cd4_diagnosi_covid___ne);
            result.setData_cd4_diagnosi_covid___null(this.data_cd4_diagnosi_covid___null);
            result.setData_cd4_diagnosi_covid___not___null(this.data_cd4_diagnosi_covid___not___null);
            result.setData_cd4_diagnosi_covid___in(this.data_cd4_diagnosi_covid___in);
            result.setData_cd4_diagnosi_covid___not___in(this.data_cd4_diagnosi_covid___not___in);
            result.setData_cd4_diagnosi_covid___lt(this.data_cd4_diagnosi_covid___lt);
            result.setData_cd4_diagnosi_covid___lte(this.data_cd4_diagnosi_covid___lte);
            result.setData_cd4_diagnosi_covid___gt(this.data_cd4_diagnosi_covid___gt);
            result.setData_cd4_diagnosi_covid___gte(this.data_cd4_diagnosi_covid___gte);
            result.setData_esami_ingresso___eq(this.data_esami_ingresso___eq);
            result.setData_esami_ingresso___ne(this.data_esami_ingresso___ne);
            result.setData_esami_ingresso___null(this.data_esami_ingresso___null);
            result.setData_esami_ingresso___not___null(this.data_esami_ingresso___not___null);
            result.setData_esami_ingresso___in(this.data_esami_ingresso___in);
            result.setData_esami_ingresso___not___in(this.data_esami_ingresso___not___in);
            result.setData_esami_ingresso___lt(this.data_esami_ingresso___lt);
            result.setData_esami_ingresso___lte(this.data_esami_ingresso___lte);
            result.setData_esami_ingresso___gt(this.data_esami_ingresso___gt);
            result.setData_esami_ingresso___gte(this.data_esami_ingresso___gte);
            result.setData_hivrna_diagnosi_covid___eq(this.data_hivrna_diagnosi_covid___eq);
            result.setData_hivrna_diagnosi_covid___ne(this.data_hivrna_diagnosi_covid___ne);
            result.setData_hivrna_diagnosi_covid___null(this.data_hivrna_diagnosi_covid___null);
            result.setData_hivrna_diagnosi_covid___not___null(this.data_hivrna_diagnosi_covid___not___null);
            result.setData_hivrna_diagnosi_covid___in(this.data_hivrna_diagnosi_covid___in);
            result.setData_hivrna_diagnosi_covid___not___in(this.data_hivrna_diagnosi_covid___not___in);
            result.setData_hivrna_diagnosi_covid___lt(this.data_hivrna_diagnosi_covid___lt);
            result.setData_hivrna_diagnosi_covid___lte(this.data_hivrna_diagnosi_covid___lte);
            result.setData_hivrna_diagnosi_covid___gt(this.data_hivrna_diagnosi_covid___gt);
            result.setData_hivrna_diagnosi_covid___gte(this.data_hivrna_diagnosi_covid___gte);
            result.setData_max_ventilazione___eq(this.data_max_ventilazione___eq);
            result.setData_max_ventilazione___ne(this.data_max_ventilazione___ne);
            result.setData_max_ventilazione___null(this.data_max_ventilazione___null);
            result.setData_max_ventilazione___not___null(this.data_max_ventilazione___not___null);
            result.setData_max_ventilazione___in(this.data_max_ventilazione___in);
            result.setData_max_ventilazione___not___in(this.data_max_ventilazione___not___in);
            result.setData_max_ventilazione___lt(this.data_max_ventilazione___lt);
            result.setData_max_ventilazione___lte(this.data_max_ventilazione___lte);
            result.setData_max_ventilazione___gt(this.data_max_ventilazione___gt);
            result.setData_max_ventilazione___gte(this.data_max_ventilazione___gte);
            result.setData_ospedalizzazione___eq(this.data_ospedalizzazione___eq);
            result.setData_ospedalizzazione___ne(this.data_ospedalizzazione___ne);
            result.setData_ospedalizzazione___null(this.data_ospedalizzazione___null);
            result.setData_ospedalizzazione___not___null(this.data_ospedalizzazione___not___null);
            result.setData_ospedalizzazione___in(this.data_ospedalizzazione___in);
            result.setData_ospedalizzazione___not___in(this.data_ospedalizzazione___not___in);
            result.setData_ospedalizzazione___lt(this.data_ospedalizzazione___lt);
            result.setData_ospedalizzazione___lte(this.data_ospedalizzazione___lte);
            result.setData_ospedalizzazione___gt(this.data_ospedalizzazione___gt);
            result.setData_ospedalizzazione___gte(this.data_ospedalizzazione___gte);
            result.setData_rianimazione___eq(this.data_rianimazione___eq);
            result.setData_rianimazione___ne(this.data_rianimazione___ne);
            result.setData_rianimazione___null(this.data_rianimazione___null);
            result.setData_rianimazione___not___null(this.data_rianimazione___not___null);
            result.setData_rianimazione___in(this.data_rianimazione___in);
            result.setData_rianimazione___not___in(this.data_rianimazione___not___in);
            result.setData_rianimazione___lt(this.data_rianimazione___lt);
            result.setData_rianimazione___lte(this.data_rianimazione___lte);
            result.setData_rianimazione___gt(this.data_rianimazione___gt);
            result.setData_rianimazione___gte(this.data_rianimazione___gte);
            result.setData_tampone___eq(this.data_tampone___eq);
            result.setData_tampone___ne(this.data_tampone___ne);
            result.setData_tampone___null(this.data_tampone___null);
            result.setData_tampone___not___null(this.data_tampone___not___null);
            result.setData_tampone___in(this.data_tampone___in);
            result.setData_tampone___not___in(this.data_tampone___not___in);
            result.setData_tampone___lt(this.data_tampone___lt);
            result.setData_tampone___lte(this.data_tampone___lte);
            result.setData_tampone___gt(this.data_tampone___gt);
            result.setData_tampone___gte(this.data_tampone___gte);
            result.setData_ultimo_contatto___eq(this.data_ultimo_contatto___eq);
            result.setData_ultimo_contatto___ne(this.data_ultimo_contatto___ne);
            result.setData_ultimo_contatto___null(this.data_ultimo_contatto___null);
            result.setData_ultimo_contatto___not___null(this.data_ultimo_contatto___not___null);
            result.setData_ultimo_contatto___in(this.data_ultimo_contatto___in);
            result.setData_ultimo_contatto___not___in(this.data_ultimo_contatto___not___in);
            result.setData_ultimo_contatto___lt(this.data_ultimo_contatto___lt);
            result.setData_ultimo_contatto___lte(this.data_ultimo_contatto___lte);
            result.setData_ultimo_contatto___gt(this.data_ultimo_contatto___gt);
            result.setData_ultimo_contatto___gte(this.data_ultimo_contatto___gte);
            result.setFerritina___eq(this.ferritina___eq);
            result.setFerritina___ne(this.ferritina___ne);
            result.setFerritina___null(this.ferritina___null);
            result.setFerritina___not___null(this.ferritina___not___null);
            result.setFerritina___in(this.ferritina___in);
            result.setFerritina___not___in(this.ferritina___not___in);
            result.setFerritina___lt(this.ferritina___lt);
            result.setFerritina___lte(this.ferritina___lte);
            result.setFerritina___gt(this.ferritina___gt);
            result.setFerritina___gte(this.ferritina___gte);
            result.setFrequenza_resp___eq(this.frequenza_resp___eq);
            result.setFrequenza_resp___ne(this.frequenza_resp___ne);
            result.setFrequenza_resp___null(this.frequenza_resp___null);
            result.setFrequenza_resp___not___null(this.frequenza_resp___not___null);
            result.setFrequenza_resp___in(this.frequenza_resp___in);
            result.setFrequenza_resp___not___in(this.frequenza_resp___not___in);
            result.setFrequenza_resp___lt(this.frequenza_resp___lt);
            result.setFrequenza_resp___lte(this.frequenza_resp___lte);
            result.setFrequenza_resp___gt(this.frequenza_resp___gt);
            result.setFrequenza_resp___gte(this.frequenza_resp___gte);
            result.setFumatore___eq(this.fumatore___eq);
            result.setFumatore___ne(this.fumatore___ne);
            result.setFumatore___null(this.fumatore___null);
            result.setFumatore___not___null(this.fumatore___not___null);
            result.setFumatore___in(this.fumatore___in);
            result.setFumatore___not___in(this.fumatore___not___in);
            result.setFumatore___lt(this.fumatore___lt);
            result.setFumatore___lte(this.fumatore___lte);
            result.setFumatore___gt(this.fumatore___gt);
            result.setFumatore___gte(this.fumatore___gte);
            result.setFumatore___contains(this.fumatore___contains);
            result.setFumatore___not___contains(this.fumatore___not___contains);
            result.setFumatore___starts_with(this.fumatore___starts_with);
            result.setFumatore___not___starts_with(this.fumatore___not___starts_with);
            result.setFumatore___ends_with(this.fumatore___ends_with);
            result.setFumatore___not___ends_with(this.fumatore___not___ends_with);
            result.setHivrna_diagnosi_covid___eq(this.hivrna_diagnosi_covid___eq);
            result.setHivrna_diagnosi_covid___ne(this.hivrna_diagnosi_covid___ne);
            result.setHivrna_diagnosi_covid___null(this.hivrna_diagnosi_covid___null);
            result.setHivrna_diagnosi_covid___not___null(this.hivrna_diagnosi_covid___not___null);
            result.setHivrna_diagnosi_covid___in(this.hivrna_diagnosi_covid___in);
            result.setHivrna_diagnosi_covid___not___in(this.hivrna_diagnosi_covid___not___in);
            result.setHivrna_diagnosi_covid___lt(this.hivrna_diagnosi_covid___lt);
            result.setHivrna_diagnosi_covid___lte(this.hivrna_diagnosi_covid___lte);
            result.setHivrna_diagnosi_covid___gt(this.hivrna_diagnosi_covid___gt);
            result.setHivrna_diagnosi_covid___gte(this.hivrna_diagnosi_covid___gte);
            result.setLdh___eq(this.ldh___eq);
            result.setLdh___ne(this.ldh___ne);
            result.setLdh___null(this.ldh___null);
            result.setLdh___not___null(this.ldh___not___null);
            result.setLdh___in(this.ldh___in);
            result.setLdh___not___in(this.ldh___not___in);
            result.setLdh___lt(this.ldh___lt);
            result.setLdh___lte(this.ldh___lte);
            result.setLdh___gt(this.ldh___gt);
            result.setLdh___gte(this.ldh___gte);
            result.setLeucociti___eq(this.leucociti___eq);
            result.setLeucociti___ne(this.leucociti___ne);
            result.setLeucociti___null(this.leucociti___null);
            result.setLeucociti___not___null(this.leucociti___not___null);
            result.setLeucociti___in(this.leucociti___in);
            result.setLeucociti___not___in(this.leucociti___not___in);
            result.setLeucociti___lt(this.leucociti___lt);
            result.setLeucociti___lte(this.leucociti___lte);
            result.setLeucociti___gt(this.leucociti___gt);
            result.setLeucociti___gte(this.leucociti___gte);
            result.setLinfociti___eq(this.linfociti___eq);
            result.setLinfociti___ne(this.linfociti___ne);
            result.setLinfociti___null(this.linfociti___null);
            result.setLinfociti___not___null(this.linfociti___not___null);
            result.setLinfociti___in(this.linfociti___in);
            result.setLinfociti___not___in(this.linfociti___not___in);
            result.setLinfociti___lt(this.linfociti___lt);
            result.setLinfociti___lte(this.linfociti___lte);
            result.setLinfociti___gt(this.linfociti___gt);
            result.setLinfociti___gte(this.linfociti___gte);
            result.setObeso___eq(this.obeso___eq);
            result.setObeso___ne(this.obeso___ne);
            result.setObeso___null(this.obeso___null);
            result.setObeso___not___null(this.obeso___not___null);
            result.setOspedalizzazione___eq(this.ospedalizzazione___eq);
            result.setOspedalizzazione___ne(this.ospedalizzazione___ne);
            result.setOspedalizzazione___null(this.ospedalizzazione___null);
            result.setOspedalizzazione___not___null(this.ospedalizzazione___not___null);
            result.setOutcome_altro___eq(this.outcome_altro___eq);
            result.setOutcome_altro___ne(this.outcome_altro___ne);
            result.setOutcome_altro___null(this.outcome_altro___null);
            result.setOutcome_altro___not___null(this.outcome_altro___not___null);
            result.setOutcome_altro___in(this.outcome_altro___in);
            result.setOutcome_altro___not___in(this.outcome_altro___not___in);
            result.setOutcome_altro___lt(this.outcome_altro___lt);
            result.setOutcome_altro___lte(this.outcome_altro___lte);
            result.setOutcome_altro___gt(this.outcome_altro___gt);
            result.setOutcome_altro___gte(this.outcome_altro___gte);
            result.setOutcome_altro___contains(this.outcome_altro___contains);
            result.setOutcome_altro___not___contains(this.outcome_altro___not___contains);
            result.setOutcome_altro___starts_with(this.outcome_altro___starts_with);
            result.setOutcome_altro___not___starts_with(this.outcome_altro___not___starts_with);
            result.setOutcome_altro___ends_with(this.outcome_altro___ends_with);
            result.setOutcome_altro___not___ends_with(this.outcome_altro___not___ends_with);
            result.setPcr___eq(this.pcr___eq);
            result.setPcr___ne(this.pcr___ne);
            result.setPcr___null(this.pcr___null);
            result.setPcr___not___null(this.pcr___not___null);
            result.setPcr___in(this.pcr___in);
            result.setPcr___not___in(this.pcr___not___in);
            result.setPcr___lt(this.pcr___lt);
            result.setPcr___lte(this.pcr___lte);
            result.setPcr___gt(this.pcr___gt);
            result.setPcr___gte(this.pcr___gte);
            result.setPo2_fio2_ingresso___eq(this.po2_fio2_ingresso___eq);
            result.setPo2_fio2_ingresso___ne(this.po2_fio2_ingresso___ne);
            result.setPo2_fio2_ingresso___null(this.po2_fio2_ingresso___null);
            result.setPo2_fio2_ingresso___not___null(this.po2_fio2_ingresso___not___null);
            result.setPo2_fio2_ingresso___in(this.po2_fio2_ingresso___in);
            result.setPo2_fio2_ingresso___not___in(this.po2_fio2_ingresso___not___in);
            result.setPo2_fio2_ingresso___lt(this.po2_fio2_ingresso___lt);
            result.setPo2_fio2_ingresso___lte(this.po2_fio2_ingresso___lte);
            result.setPo2_fio2_ingresso___gt(this.po2_fio2_ingresso___gt);
            result.setPo2_fio2_ingresso___gte(this.po2_fio2_ingresso___gte);
            result.setRianimazione___eq(this.rianimazione___eq);
            result.setRianimazione___ne(this.rianimazione___ne);
            result.setRianimazione___null(this.rianimazione___null);
            result.setRianimazione___not___null(this.rianimazione___not___null);
            result.setSintomi_altro___eq(this.sintomi_altro___eq);
            result.setSintomi_altro___ne(this.sintomi_altro___ne);
            result.setSintomi_altro___null(this.sintomi_altro___null);
            result.setSintomi_altro___not___null(this.sintomi_altro___not___null);
            result.setSintomi_altro___in(this.sintomi_altro___in);
            result.setSintomi_altro___not___in(this.sintomi_altro___not___in);
            result.setSintomi_altro___lt(this.sintomi_altro___lt);
            result.setSintomi_altro___lte(this.sintomi_altro___lte);
            result.setSintomi_altro___gt(this.sintomi_altro___gt);
            result.setSintomi_altro___gte(this.sintomi_altro___gte);
            result.setSintomi_altro___contains(this.sintomi_altro___contains);
            result.setSintomi_altro___not___contains(this.sintomi_altro___not___contains);
            result.setSintomi_altro___starts_with(this.sintomi_altro___starts_with);
            result.setSintomi_altro___not___starts_with(this.sintomi_altro___not___starts_with);
            result.setSintomi_altro___ends_with(this.sintomi_altro___ends_with);
            result.setSintomi_altro___not___ends_with(this.sintomi_altro___not___ends_with);
            result.setSpo2_ingresso___eq(this.spo2_ingresso___eq);
            result.setSpo2_ingresso___ne(this.spo2_ingresso___ne);
            result.setSpo2_ingresso___null(this.spo2_ingresso___null);
            result.setSpo2_ingresso___not___null(this.spo2_ingresso___not___null);
            result.setSpo2_ingresso___in(this.spo2_ingresso___in);
            result.setSpo2_ingresso___not___in(this.spo2_ingresso___not___in);
            result.setSpo2_ingresso___lt(this.spo2_ingresso___lt);
            result.setSpo2_ingresso___lte(this.spo2_ingresso___lte);
            result.setSpo2_ingresso___gt(this.spo2_ingresso___gt);
            result.setSpo2_ingresso___gte(this.spo2_ingresso___gte);
            result.setSpo2_ingresso___contains(this.spo2_ingresso___contains);
            result.setSpo2_ingresso___not___contains(this.spo2_ingresso___not___contains);
            result.setSpo2_ingresso___starts_with(this.spo2_ingresso___starts_with);
            result.setSpo2_ingresso___not___starts_with(this.spo2_ingresso___not___starts_with);
            result.setSpo2_ingresso___ends_with(this.spo2_ingresso___ends_with);
            result.setSpo2_ingresso___not___ends_with(this.spo2_ingresso___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
