package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type V_dettaglio.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliV_dettaglioFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
    private String _createdon___eq;
    private String _createdon___ne;
    private Boolean _createdon___null;
    private Boolean _createdon___not___null;
    private java.util.List<String> _createdon___in;
    private java.util.List<String> _createdon___not___in;
    private String _createdon___lt;
    private String _createdon___lte;
    private String _createdon___gt;
    private String _createdon___gte;
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
    private String altro_evento_prima_dose___eq;
    private String altro_evento_prima_dose___ne;
    private Boolean altro_evento_prima_dose___null;
    private Boolean altro_evento_prima_dose___not___null;
    private java.util.List<String> altro_evento_prima_dose___in;
    private java.util.List<String> altro_evento_prima_dose___not___in;
    private String altro_evento_prima_dose___lt;
    private String altro_evento_prima_dose___lte;
    private String altro_evento_prima_dose___gt;
    private String altro_evento_prima_dose___gte;
    private String altro_evento_prima_dose___contains;
    private String altro_evento_prima_dose___not___contains;
    private String altro_evento_prima_dose___starts_with;
    private String altro_evento_prima_dose___not___starts_with;
    private String altro_evento_prima_dose___ends_with;
    private String altro_evento_prima_dose___not___ends_with;
    private String altro_evento_seconda_dose___eq;
    private String altro_evento_seconda_dose___ne;
    private Boolean altro_evento_seconda_dose___null;
    private Boolean altro_evento_seconda_dose___not___null;
    private java.util.List<String> altro_evento_seconda_dose___in;
    private java.util.List<String> altro_evento_seconda_dose___not___in;
    private String altro_evento_seconda_dose___lt;
    private String altro_evento_seconda_dose___lte;
    private String altro_evento_seconda_dose___gt;
    private String altro_evento_seconda_dose___gte;
    private String altro_evento_seconda_dose___contains;
    private String altro_evento_seconda_dose___not___contains;
    private String altro_evento_seconda_dose___starts_with;
    private String altro_evento_seconda_dose___not___starts_with;
    private String altro_evento_seconda_dose___ends_with;
    private String altro_evento_seconda_dose___not___ends_with;
    private String altro_motivazione_seconda_dose___eq;
    private String altro_motivazione_seconda_dose___ne;
    private Boolean altro_motivazione_seconda_dose___null;
    private Boolean altro_motivazione_seconda_dose___not___null;
    private java.util.List<String> altro_motivazione_seconda_dose___in;
    private java.util.List<String> altro_motivazione_seconda_dose___not___in;
    private String altro_motivazione_seconda_dose___lt;
    private String altro_motivazione_seconda_dose___lte;
    private String altro_motivazione_seconda_dose___gt;
    private String altro_motivazione_seconda_dose___gte;
    private String altro_motivazione_seconda_dose___contains;
    private String altro_motivazione_seconda_dose___not___contains;
    private String altro_motivazione_seconda_dose___starts_with;
    private String altro_motivazione_seconda_dose___not___starts_with;
    private String altro_motivazione_seconda_dose___ends_with;
    private String altro_motivazione_seconda_dose___not___ends_with;
    private Boolean assenza_lavoro_prima_dose___eq;
    private Boolean assenza_lavoro_prima_dose___ne;
    private Boolean assenza_lavoro_prima_dose___null;
    private Boolean assenza_lavoro_prima_dose___not___null;
    private Boolean assenza_lavoro_seconda_dose___eq;
    private Boolean assenza_lavoro_seconda_dose___ne;
    private Boolean assenza_lavoro_seconda_dose___null;
    private Boolean assenza_lavoro_seconda_dose___not___null;
    private Integer count_eventi_prima_dose___eq;
    private Integer count_eventi_prima_dose___ne;
    private Boolean count_eventi_prima_dose___null;
    private Boolean count_eventi_prima_dose___not___null;
    private java.util.List<Integer> count_eventi_prima_dose___in;
    private java.util.List<Integer> count_eventi_prima_dose___not___in;
    private Integer count_eventi_prima_dose___lt;
    private Integer count_eventi_prima_dose___lte;
    private Integer count_eventi_prima_dose___gt;
    private Integer count_eventi_prima_dose___gte;
    private Integer count_eventi_seconda_dose___eq;
    private Integer count_eventi_seconda_dose___ne;
    private Boolean count_eventi_seconda_dose___null;
    private Boolean count_eventi_seconda_dose___not___null;
    private java.util.List<Integer> count_eventi_seconda_dose___in;
    private java.util.List<Integer> count_eventi_seconda_dose___not___in;
    private Integer count_eventi_seconda_dose___lt;
    private Integer count_eventi_seconda_dose___lte;
    private Integer count_eventi_seconda_dose___gt;
    private Integer count_eventi_seconda_dose___gte;
    private String data_prima_dose___eq;
    private String data_prima_dose___ne;
    private Boolean data_prima_dose___null;
    private Boolean data_prima_dose___not___null;
    private java.util.List<String> data_prima_dose___in;
    private java.util.List<String> data_prima_dose___not___in;
    private String data_prima_dose___lt;
    private String data_prima_dose___lte;
    private String data_prima_dose___gt;
    private String data_prima_dose___gte;
    private String data_primo_tampone___eq;
    private String data_primo_tampone___ne;
    private Boolean data_primo_tampone___null;
    private Boolean data_primo_tampone___not___null;
    private java.util.List<String> data_primo_tampone___in;
    private java.util.List<String> data_primo_tampone___not___in;
    private String data_primo_tampone___lt;
    private String data_primo_tampone___lte;
    private String data_primo_tampone___gt;
    private String data_primo_tampone___gte;
    private String data_primo_tampone_post___eq;
    private String data_primo_tampone_post___ne;
    private Boolean data_primo_tampone_post___null;
    private Boolean data_primo_tampone_post___not___null;
    private java.util.List<String> data_primo_tampone_post___in;
    private java.util.List<String> data_primo_tampone_post___not___in;
    private String data_primo_tampone_post___lt;
    private String data_primo_tampone_post___lte;
    private String data_primo_tampone_post___gt;
    private String data_primo_tampone_post___gte;
    private String data_seconda_dose___eq;
    private String data_seconda_dose___ne;
    private Boolean data_seconda_dose___null;
    private Boolean data_seconda_dose___not___null;
    private java.util.List<String> data_seconda_dose___in;
    private java.util.List<String> data_seconda_dose___not___in;
    private String data_seconda_dose___lt;
    private String data_seconda_dose___lte;
    private String data_seconda_dose___gt;
    private String data_seconda_dose___gte;
    private String decorso_infezione_covid___eq;
    private String decorso_infezione_covid___ne;
    private Boolean decorso_infezione_covid___null;
    private Boolean decorso_infezione_covid___not___null;
    private java.util.List<String> decorso_infezione_covid___in;
    private java.util.List<String> decorso_infezione_covid___not___in;
    private String decorso_infezione_covid___lt;
    private String decorso_infezione_covid___lte;
    private String decorso_infezione_covid___gt;
    private String decorso_infezione_covid___gte;
    private String decorso_infezione_covid___contains;
    private String decorso_infezione_covid___not___contains;
    private String decorso_infezione_covid___starts_with;
    private String decorso_infezione_covid___not___starts_with;
    private String decorso_infezione_covid___ends_with;
    private String decorso_infezione_covid___not___ends_with;
    private String decorso_infezione_covid_post___eq;
    private String decorso_infezione_covid_post___ne;
    private Boolean decorso_infezione_covid_post___null;
    private Boolean decorso_infezione_covid_post___not___null;
    private java.util.List<String> decorso_infezione_covid_post___in;
    private java.util.List<String> decorso_infezione_covid_post___not___in;
    private String decorso_infezione_covid_post___lt;
    private String decorso_infezione_covid_post___lte;
    private String decorso_infezione_covid_post___gt;
    private String decorso_infezione_covid_post___gte;
    private String decorso_infezione_covid_post___contains;
    private String decorso_infezione_covid_post___not___contains;
    private String decorso_infezione_covid_post___starts_with;
    private String decorso_infezione_covid_post___not___starts_with;
    private String decorso_infezione_covid_post___ends_with;
    private String decorso_infezione_covid_post___not___ends_with;
    private String dosi_vaccino_covid___eq;
    private String dosi_vaccino_covid___ne;
    private Boolean dosi_vaccino_covid___null;
    private Boolean dosi_vaccino_covid___not___null;
    private java.util.List<String> dosi_vaccino_covid___in;
    private java.util.List<String> dosi_vaccino_covid___not___in;
    private String dosi_vaccino_covid___lt;
    private String dosi_vaccino_covid___lte;
    private String dosi_vaccino_covid___gt;
    private String dosi_vaccino_covid___gte;
    private String dosi_vaccino_covid___contains;
    private String dosi_vaccino_covid___not___contains;
    private String dosi_vaccino_covid___starts_with;
    private String dosi_vaccino_covid___not___starts_with;
    private String dosi_vaccino_covid___ends_with;
    private String dosi_vaccino_covid___not___ends_with;
    private Boolean farmaci_prima_dose_bool___eq;
    private Boolean farmaci_prima_dose_bool___ne;
    private Boolean farmaci_prima_dose_bool___null;
    private Boolean farmaci_prima_dose_bool___not___null;
    private String farmaci_prima_dose_text___eq;
    private String farmaci_prima_dose_text___ne;
    private Boolean farmaci_prima_dose_text___null;
    private Boolean farmaci_prima_dose_text___not___null;
    private java.util.List<String> farmaci_prima_dose_text___in;
    private java.util.List<String> farmaci_prima_dose_text___not___in;
    private String farmaci_prima_dose_text___lt;
    private String farmaci_prima_dose_text___lte;
    private String farmaci_prima_dose_text___gt;
    private String farmaci_prima_dose_text___gte;
    private String farmaci_prima_dose_text___contains;
    private String farmaci_prima_dose_text___not___contains;
    private String farmaci_prima_dose_text___starts_with;
    private String farmaci_prima_dose_text___not___starts_with;
    private String farmaci_prima_dose_text___ends_with;
    private String farmaci_prima_dose_text___not___ends_with;
    private Boolean farmaci_seconda_dose_bool___eq;
    private Boolean farmaci_seconda_dose_bool___ne;
    private Boolean farmaci_seconda_dose_bool___null;
    private Boolean farmaci_seconda_dose_bool___not___null;
    private String farmaci_seconda_dose_text___eq;
    private String farmaci_seconda_dose_text___ne;
    private Boolean farmaci_seconda_dose_text___null;
    private Boolean farmaci_seconda_dose_text___not___null;
    private java.util.List<String> farmaci_seconda_dose_text___in;
    private java.util.List<String> farmaci_seconda_dose_text___not___in;
    private String farmaci_seconda_dose_text___lt;
    private String farmaci_seconda_dose_text___lte;
    private String farmaci_seconda_dose_text___gt;
    private String farmaci_seconda_dose_text___gte;
    private String farmaci_seconda_dose_text___contains;
    private String farmaci_seconda_dose_text___not___contains;
    private String farmaci_seconda_dose_text___starts_with;
    private String farmaci_seconda_dose_text___not___starts_with;
    private String farmaci_seconda_dose_text___ends_with;
    private String farmaci_seconda_dose_text___not___ends_with;
    private Boolean imped_attivita_prima_dose___eq;
    private Boolean imped_attivita_prima_dose___ne;
    private Boolean imped_attivita_prima_dose___null;
    private Boolean imped_attivita_prima_dose___not___null;
    private Boolean imped_attivita_seconda_dose___eq;
    private Boolean imped_attivita_seconda_dose___ne;
    private Boolean imped_attivita_seconda_dose___null;
    private Boolean imped_attivita_seconda_dose___not___null;
    private Boolean infezione_covid___eq;
    private Boolean infezione_covid___ne;
    private Boolean infezione_covid___null;
    private Boolean infezione_covid___not___null;
    private Boolean infezione_covid_post___eq;
    private Boolean infezione_covid_post___ne;
    private Boolean infezione_covid_post___null;
    private Boolean infezione_covid_post___not___null;
    private Boolean intubazione___eq;
    private Boolean intubazione___ne;
    private Boolean intubazione___null;
    private Boolean intubazione___not___null;
    private String ore_durata_sintomi_prima_dose___eq;
    private String ore_durata_sintomi_prima_dose___ne;
    private Boolean ore_durata_sintomi_prima_dose___null;
    private Boolean ore_durata_sintomi_prima_dose___not___null;
    private java.util.List<String> ore_durata_sintomi_prima_dose___in;
    private java.util.List<String> ore_durata_sintomi_prima_dose___not___in;
    private String ore_durata_sintomi_prima_dose___lt;
    private String ore_durata_sintomi_prima_dose___lte;
    private String ore_durata_sintomi_prima_dose___gt;
    private String ore_durata_sintomi_prima_dose___gte;
    private String ore_durata_sintomi_seconda_dose___eq;
    private String ore_durata_sintomi_seconda_dose___ne;
    private Boolean ore_durata_sintomi_seconda_dose___null;
    private Boolean ore_durata_sintomi_seconda_dose___not___null;
    private java.util.List<String> ore_durata_sintomi_seconda_dose___in;
    private java.util.List<String> ore_durata_sintomi_seconda_dose___not___in;
    private String ore_durata_sintomi_seconda_dose___lt;
    private String ore_durata_sintomi_seconda_dose___lte;
    private String ore_durata_sintomi_seconda_dose___gt;
    private String ore_durata_sintomi_seconda_dose___gte;
    private String ore_primo_sintomo_prima_dose___eq;
    private String ore_primo_sintomo_prima_dose___ne;
    private Boolean ore_primo_sintomo_prima_dose___null;
    private Boolean ore_primo_sintomo_prima_dose___not___null;
    private java.util.List<String> ore_primo_sintomo_prima_dose___in;
    private java.util.List<String> ore_primo_sintomo_prima_dose___not___in;
    private String ore_primo_sintomo_prima_dose___lt;
    private String ore_primo_sintomo_prima_dose___lte;
    private String ore_primo_sintomo_prima_dose___gt;
    private String ore_primo_sintomo_prima_dose___gte;
    private String ore_primo_sintomo_seconda_dose___eq;
    private String ore_primo_sintomo_seconda_dose___ne;
    private Boolean ore_primo_sintomo_seconda_dose___null;
    private Boolean ore_primo_sintomo_seconda_dose___not___null;
    private java.util.List<String> ore_primo_sintomo_seconda_dose___in;
    private java.util.List<String> ore_primo_sintomo_seconda_dose___not___in;
    private String ore_primo_sintomo_seconda_dose___lt;
    private String ore_primo_sintomo_seconda_dose___lte;
    private String ore_primo_sintomo_seconda_dose___gt;
    private String ore_primo_sintomo_seconda_dose___gte;
    private Boolean ospedale_prima_dose___eq;
    private Boolean ospedale_prima_dose___ne;
    private Boolean ospedale_prima_dose___null;
    private Boolean ospedale_prima_dose___not___null;
    private Boolean ospedale_seconda_dose___eq;
    private Boolean ospedale_seconda_dose___ne;
    private Boolean ospedale_seconda_dose___null;
    private Boolean ospedale_seconda_dose___not___null;
    private Boolean ospedalizzazione___eq;
    private Boolean ospedalizzazione___ne;
    private Boolean ospedalizzazione___null;
    private Boolean ospedalizzazione___not___null;
    private Boolean seconda_dose___eq;
    private Boolean seconda_dose___ne;
    private Boolean seconda_dose___null;
    private Boolean seconda_dose___not___null;
    private Boolean terapia_corticoster___eq;
    private Boolean terapia_corticoster___ne;
    private Boolean terapia_corticoster___null;
    private Boolean terapia_corticoster___not___null;
    private Boolean terapia_immunosopp___eq;
    private Boolean terapia_immunosopp___ne;
    private Boolean terapia_immunosopp___null;
    private Boolean terapia_immunosopp___not___null;
    private String terapia_immunosopp_desc___eq;
    private String terapia_immunosopp_desc___ne;
    private Boolean terapia_immunosopp_desc___null;
    private Boolean terapia_immunosopp_desc___not___null;
    private java.util.List<String> terapia_immunosopp_desc___in;
    private java.util.List<String> terapia_immunosopp_desc___not___in;
    private String terapia_immunosopp_desc___lt;
    private String terapia_immunosopp_desc___lte;
    private String terapia_immunosopp_desc___gt;
    private String terapia_immunosopp_desc___gte;
    private String terapia_immunosopp_desc___contains;
    private String terapia_immunosopp_desc___not___contains;
    private String terapia_immunosopp_desc___starts_with;
    private String terapia_immunosopp_desc___not___starts_with;
    private String terapia_immunosopp_desc___ends_with;
    private String terapia_immunosopp_desc___not___ends_with;
    private Boolean vax_ico___eq;
    private Boolean vax_ico___ne;
    private Boolean vax_ico___null;
    private Boolean vax_ico___not___null;
    private java.util.List<CliV_dettaglioFilterDTO> AND;
    private java.util.List<CliV_dettaglioFilterDTO> OR;
    private CliV_dettaglioFilterDTO NOT;

    public CliV_dettaglioFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
    }

    public String get_createdon___eq() {
        return _createdon___eq;
    }
    public void set_createdon___eq(String _createdon___eq) {
        this._createdon___eq = _createdon___eq;
    }

    public String get_createdon___ne() {
        return _createdon___ne;
    }
    public void set_createdon___ne(String _createdon___ne) {
        this._createdon___ne = _createdon___ne;
    }

    public Boolean get_createdon___null() {
        return _createdon___null;
    }
    public void set_createdon___null(Boolean _createdon___null) {
        this._createdon___null = _createdon___null;
    }

    public Boolean get_createdon___not___null() {
        return _createdon___not___null;
    }
    public void set_createdon___not___null(Boolean _createdon___not___null) {
        this._createdon___not___null = _createdon___not___null;
    }

    public java.util.List<String> get_createdon___in() {
        return _createdon___in;
    }
    public void set_createdon___in(java.util.List<String> _createdon___in) {
        this._createdon___in = _createdon___in;
    }

    public java.util.List<String> get_createdon___not___in() {
        return _createdon___not___in;
    }
    public void set_createdon___not___in(java.util.List<String> _createdon___not___in) {
        this._createdon___not___in = _createdon___not___in;
    }

    public String get_createdon___lt() {
        return _createdon___lt;
    }
    public void set_createdon___lt(String _createdon___lt) {
        this._createdon___lt = _createdon___lt;
    }

    public String get_createdon___lte() {
        return _createdon___lte;
    }
    public void set_createdon___lte(String _createdon___lte) {
        this._createdon___lte = _createdon___lte;
    }

    public String get_createdon___gt() {
        return _createdon___gt;
    }
    public void set_createdon___gt(String _createdon___gt) {
        this._createdon___gt = _createdon___gt;
    }

    public String get_createdon___gte() {
        return _createdon___gte;
    }
    public void set_createdon___gte(String _createdon___gte) {
        this._createdon___gte = _createdon___gte;
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

    public String getAltro_evento_prima_dose___eq() {
        return altro_evento_prima_dose___eq;
    }
    public void setAltro_evento_prima_dose___eq(String altro_evento_prima_dose___eq) {
        this.altro_evento_prima_dose___eq = altro_evento_prima_dose___eq;
    }

    public String getAltro_evento_prima_dose___ne() {
        return altro_evento_prima_dose___ne;
    }
    public void setAltro_evento_prima_dose___ne(String altro_evento_prima_dose___ne) {
        this.altro_evento_prima_dose___ne = altro_evento_prima_dose___ne;
    }

    public Boolean getAltro_evento_prima_dose___null() {
        return altro_evento_prima_dose___null;
    }
    public void setAltro_evento_prima_dose___null(Boolean altro_evento_prima_dose___null) {
        this.altro_evento_prima_dose___null = altro_evento_prima_dose___null;
    }

    public Boolean getAltro_evento_prima_dose___not___null() {
        return altro_evento_prima_dose___not___null;
    }
    public void setAltro_evento_prima_dose___not___null(Boolean altro_evento_prima_dose___not___null) {
        this.altro_evento_prima_dose___not___null = altro_evento_prima_dose___not___null;
    }

    public java.util.List<String> getAltro_evento_prima_dose___in() {
        return altro_evento_prima_dose___in;
    }
    public void setAltro_evento_prima_dose___in(java.util.List<String> altro_evento_prima_dose___in) {
        this.altro_evento_prima_dose___in = altro_evento_prima_dose___in;
    }

    public java.util.List<String> getAltro_evento_prima_dose___not___in() {
        return altro_evento_prima_dose___not___in;
    }
    public void setAltro_evento_prima_dose___not___in(java.util.List<String> altro_evento_prima_dose___not___in) {
        this.altro_evento_prima_dose___not___in = altro_evento_prima_dose___not___in;
    }

    public String getAltro_evento_prima_dose___lt() {
        return altro_evento_prima_dose___lt;
    }
    public void setAltro_evento_prima_dose___lt(String altro_evento_prima_dose___lt) {
        this.altro_evento_prima_dose___lt = altro_evento_prima_dose___lt;
    }

    public String getAltro_evento_prima_dose___lte() {
        return altro_evento_prima_dose___lte;
    }
    public void setAltro_evento_prima_dose___lte(String altro_evento_prima_dose___lte) {
        this.altro_evento_prima_dose___lte = altro_evento_prima_dose___lte;
    }

    public String getAltro_evento_prima_dose___gt() {
        return altro_evento_prima_dose___gt;
    }
    public void setAltro_evento_prima_dose___gt(String altro_evento_prima_dose___gt) {
        this.altro_evento_prima_dose___gt = altro_evento_prima_dose___gt;
    }

    public String getAltro_evento_prima_dose___gte() {
        return altro_evento_prima_dose___gte;
    }
    public void setAltro_evento_prima_dose___gte(String altro_evento_prima_dose___gte) {
        this.altro_evento_prima_dose___gte = altro_evento_prima_dose___gte;
    }

    public String getAltro_evento_prima_dose___contains() {
        return altro_evento_prima_dose___contains;
    }
    public void setAltro_evento_prima_dose___contains(String altro_evento_prima_dose___contains) {
        this.altro_evento_prima_dose___contains = altro_evento_prima_dose___contains;
    }

    public String getAltro_evento_prima_dose___not___contains() {
        return altro_evento_prima_dose___not___contains;
    }
    public void setAltro_evento_prima_dose___not___contains(String altro_evento_prima_dose___not___contains) {
        this.altro_evento_prima_dose___not___contains = altro_evento_prima_dose___not___contains;
    }

    public String getAltro_evento_prima_dose___starts_with() {
        return altro_evento_prima_dose___starts_with;
    }
    public void setAltro_evento_prima_dose___starts_with(String altro_evento_prima_dose___starts_with) {
        this.altro_evento_prima_dose___starts_with = altro_evento_prima_dose___starts_with;
    }

    public String getAltro_evento_prima_dose___not___starts_with() {
        return altro_evento_prima_dose___not___starts_with;
    }
    public void setAltro_evento_prima_dose___not___starts_with(String altro_evento_prima_dose___not___starts_with) {
        this.altro_evento_prima_dose___not___starts_with = altro_evento_prima_dose___not___starts_with;
    }

    public String getAltro_evento_prima_dose___ends_with() {
        return altro_evento_prima_dose___ends_with;
    }
    public void setAltro_evento_prima_dose___ends_with(String altro_evento_prima_dose___ends_with) {
        this.altro_evento_prima_dose___ends_with = altro_evento_prima_dose___ends_with;
    }

    public String getAltro_evento_prima_dose___not___ends_with() {
        return altro_evento_prima_dose___not___ends_with;
    }
    public void setAltro_evento_prima_dose___not___ends_with(String altro_evento_prima_dose___not___ends_with) {
        this.altro_evento_prima_dose___not___ends_with = altro_evento_prima_dose___not___ends_with;
    }

    public String getAltro_evento_seconda_dose___eq() {
        return altro_evento_seconda_dose___eq;
    }
    public void setAltro_evento_seconda_dose___eq(String altro_evento_seconda_dose___eq) {
        this.altro_evento_seconda_dose___eq = altro_evento_seconda_dose___eq;
    }

    public String getAltro_evento_seconda_dose___ne() {
        return altro_evento_seconda_dose___ne;
    }
    public void setAltro_evento_seconda_dose___ne(String altro_evento_seconda_dose___ne) {
        this.altro_evento_seconda_dose___ne = altro_evento_seconda_dose___ne;
    }

    public Boolean getAltro_evento_seconda_dose___null() {
        return altro_evento_seconda_dose___null;
    }
    public void setAltro_evento_seconda_dose___null(Boolean altro_evento_seconda_dose___null) {
        this.altro_evento_seconda_dose___null = altro_evento_seconda_dose___null;
    }

    public Boolean getAltro_evento_seconda_dose___not___null() {
        return altro_evento_seconda_dose___not___null;
    }
    public void setAltro_evento_seconda_dose___not___null(Boolean altro_evento_seconda_dose___not___null) {
        this.altro_evento_seconda_dose___not___null = altro_evento_seconda_dose___not___null;
    }

    public java.util.List<String> getAltro_evento_seconda_dose___in() {
        return altro_evento_seconda_dose___in;
    }
    public void setAltro_evento_seconda_dose___in(java.util.List<String> altro_evento_seconda_dose___in) {
        this.altro_evento_seconda_dose___in = altro_evento_seconda_dose___in;
    }

    public java.util.List<String> getAltro_evento_seconda_dose___not___in() {
        return altro_evento_seconda_dose___not___in;
    }
    public void setAltro_evento_seconda_dose___not___in(java.util.List<String> altro_evento_seconda_dose___not___in) {
        this.altro_evento_seconda_dose___not___in = altro_evento_seconda_dose___not___in;
    }

    public String getAltro_evento_seconda_dose___lt() {
        return altro_evento_seconda_dose___lt;
    }
    public void setAltro_evento_seconda_dose___lt(String altro_evento_seconda_dose___lt) {
        this.altro_evento_seconda_dose___lt = altro_evento_seconda_dose___lt;
    }

    public String getAltro_evento_seconda_dose___lte() {
        return altro_evento_seconda_dose___lte;
    }
    public void setAltro_evento_seconda_dose___lte(String altro_evento_seconda_dose___lte) {
        this.altro_evento_seconda_dose___lte = altro_evento_seconda_dose___lte;
    }

    public String getAltro_evento_seconda_dose___gt() {
        return altro_evento_seconda_dose___gt;
    }
    public void setAltro_evento_seconda_dose___gt(String altro_evento_seconda_dose___gt) {
        this.altro_evento_seconda_dose___gt = altro_evento_seconda_dose___gt;
    }

    public String getAltro_evento_seconda_dose___gte() {
        return altro_evento_seconda_dose___gte;
    }
    public void setAltro_evento_seconda_dose___gte(String altro_evento_seconda_dose___gte) {
        this.altro_evento_seconda_dose___gte = altro_evento_seconda_dose___gte;
    }

    public String getAltro_evento_seconda_dose___contains() {
        return altro_evento_seconda_dose___contains;
    }
    public void setAltro_evento_seconda_dose___contains(String altro_evento_seconda_dose___contains) {
        this.altro_evento_seconda_dose___contains = altro_evento_seconda_dose___contains;
    }

    public String getAltro_evento_seconda_dose___not___contains() {
        return altro_evento_seconda_dose___not___contains;
    }
    public void setAltro_evento_seconda_dose___not___contains(String altro_evento_seconda_dose___not___contains) {
        this.altro_evento_seconda_dose___not___contains = altro_evento_seconda_dose___not___contains;
    }

    public String getAltro_evento_seconda_dose___starts_with() {
        return altro_evento_seconda_dose___starts_with;
    }
    public void setAltro_evento_seconda_dose___starts_with(String altro_evento_seconda_dose___starts_with) {
        this.altro_evento_seconda_dose___starts_with = altro_evento_seconda_dose___starts_with;
    }

    public String getAltro_evento_seconda_dose___not___starts_with() {
        return altro_evento_seconda_dose___not___starts_with;
    }
    public void setAltro_evento_seconda_dose___not___starts_with(String altro_evento_seconda_dose___not___starts_with) {
        this.altro_evento_seconda_dose___not___starts_with = altro_evento_seconda_dose___not___starts_with;
    }

    public String getAltro_evento_seconda_dose___ends_with() {
        return altro_evento_seconda_dose___ends_with;
    }
    public void setAltro_evento_seconda_dose___ends_with(String altro_evento_seconda_dose___ends_with) {
        this.altro_evento_seconda_dose___ends_with = altro_evento_seconda_dose___ends_with;
    }

    public String getAltro_evento_seconda_dose___not___ends_with() {
        return altro_evento_seconda_dose___not___ends_with;
    }
    public void setAltro_evento_seconda_dose___not___ends_with(String altro_evento_seconda_dose___not___ends_with) {
        this.altro_evento_seconda_dose___not___ends_with = altro_evento_seconda_dose___not___ends_with;
    }

    public String getAltro_motivazione_seconda_dose___eq() {
        return altro_motivazione_seconda_dose___eq;
    }
    public void setAltro_motivazione_seconda_dose___eq(String altro_motivazione_seconda_dose___eq) {
        this.altro_motivazione_seconda_dose___eq = altro_motivazione_seconda_dose___eq;
    }

    public String getAltro_motivazione_seconda_dose___ne() {
        return altro_motivazione_seconda_dose___ne;
    }
    public void setAltro_motivazione_seconda_dose___ne(String altro_motivazione_seconda_dose___ne) {
        this.altro_motivazione_seconda_dose___ne = altro_motivazione_seconda_dose___ne;
    }

    public Boolean getAltro_motivazione_seconda_dose___null() {
        return altro_motivazione_seconda_dose___null;
    }
    public void setAltro_motivazione_seconda_dose___null(Boolean altro_motivazione_seconda_dose___null) {
        this.altro_motivazione_seconda_dose___null = altro_motivazione_seconda_dose___null;
    }

    public Boolean getAltro_motivazione_seconda_dose___not___null() {
        return altro_motivazione_seconda_dose___not___null;
    }
    public void setAltro_motivazione_seconda_dose___not___null(Boolean altro_motivazione_seconda_dose___not___null) {
        this.altro_motivazione_seconda_dose___not___null = altro_motivazione_seconda_dose___not___null;
    }

    public java.util.List<String> getAltro_motivazione_seconda_dose___in() {
        return altro_motivazione_seconda_dose___in;
    }
    public void setAltro_motivazione_seconda_dose___in(java.util.List<String> altro_motivazione_seconda_dose___in) {
        this.altro_motivazione_seconda_dose___in = altro_motivazione_seconda_dose___in;
    }

    public java.util.List<String> getAltro_motivazione_seconda_dose___not___in() {
        return altro_motivazione_seconda_dose___not___in;
    }
    public void setAltro_motivazione_seconda_dose___not___in(java.util.List<String> altro_motivazione_seconda_dose___not___in) {
        this.altro_motivazione_seconda_dose___not___in = altro_motivazione_seconda_dose___not___in;
    }

    public String getAltro_motivazione_seconda_dose___lt() {
        return altro_motivazione_seconda_dose___lt;
    }
    public void setAltro_motivazione_seconda_dose___lt(String altro_motivazione_seconda_dose___lt) {
        this.altro_motivazione_seconda_dose___lt = altro_motivazione_seconda_dose___lt;
    }

    public String getAltro_motivazione_seconda_dose___lte() {
        return altro_motivazione_seconda_dose___lte;
    }
    public void setAltro_motivazione_seconda_dose___lte(String altro_motivazione_seconda_dose___lte) {
        this.altro_motivazione_seconda_dose___lte = altro_motivazione_seconda_dose___lte;
    }

    public String getAltro_motivazione_seconda_dose___gt() {
        return altro_motivazione_seconda_dose___gt;
    }
    public void setAltro_motivazione_seconda_dose___gt(String altro_motivazione_seconda_dose___gt) {
        this.altro_motivazione_seconda_dose___gt = altro_motivazione_seconda_dose___gt;
    }

    public String getAltro_motivazione_seconda_dose___gte() {
        return altro_motivazione_seconda_dose___gte;
    }
    public void setAltro_motivazione_seconda_dose___gte(String altro_motivazione_seconda_dose___gte) {
        this.altro_motivazione_seconda_dose___gte = altro_motivazione_seconda_dose___gte;
    }

    public String getAltro_motivazione_seconda_dose___contains() {
        return altro_motivazione_seconda_dose___contains;
    }
    public void setAltro_motivazione_seconda_dose___contains(String altro_motivazione_seconda_dose___contains) {
        this.altro_motivazione_seconda_dose___contains = altro_motivazione_seconda_dose___contains;
    }

    public String getAltro_motivazione_seconda_dose___not___contains() {
        return altro_motivazione_seconda_dose___not___contains;
    }
    public void setAltro_motivazione_seconda_dose___not___contains(String altro_motivazione_seconda_dose___not___contains) {
        this.altro_motivazione_seconda_dose___not___contains = altro_motivazione_seconda_dose___not___contains;
    }

    public String getAltro_motivazione_seconda_dose___starts_with() {
        return altro_motivazione_seconda_dose___starts_with;
    }
    public void setAltro_motivazione_seconda_dose___starts_with(String altro_motivazione_seconda_dose___starts_with) {
        this.altro_motivazione_seconda_dose___starts_with = altro_motivazione_seconda_dose___starts_with;
    }

    public String getAltro_motivazione_seconda_dose___not___starts_with() {
        return altro_motivazione_seconda_dose___not___starts_with;
    }
    public void setAltro_motivazione_seconda_dose___not___starts_with(String altro_motivazione_seconda_dose___not___starts_with) {
        this.altro_motivazione_seconda_dose___not___starts_with = altro_motivazione_seconda_dose___not___starts_with;
    }

    public String getAltro_motivazione_seconda_dose___ends_with() {
        return altro_motivazione_seconda_dose___ends_with;
    }
    public void setAltro_motivazione_seconda_dose___ends_with(String altro_motivazione_seconda_dose___ends_with) {
        this.altro_motivazione_seconda_dose___ends_with = altro_motivazione_seconda_dose___ends_with;
    }

    public String getAltro_motivazione_seconda_dose___not___ends_with() {
        return altro_motivazione_seconda_dose___not___ends_with;
    }
    public void setAltro_motivazione_seconda_dose___not___ends_with(String altro_motivazione_seconda_dose___not___ends_with) {
        this.altro_motivazione_seconda_dose___not___ends_with = altro_motivazione_seconda_dose___not___ends_with;
    }

    public Boolean getAssenza_lavoro_prima_dose___eq() {
        return assenza_lavoro_prima_dose___eq;
    }
    public void setAssenza_lavoro_prima_dose___eq(Boolean assenza_lavoro_prima_dose___eq) {
        this.assenza_lavoro_prima_dose___eq = assenza_lavoro_prima_dose___eq;
    }

    public Boolean getAssenza_lavoro_prima_dose___ne() {
        return assenza_lavoro_prima_dose___ne;
    }
    public void setAssenza_lavoro_prima_dose___ne(Boolean assenza_lavoro_prima_dose___ne) {
        this.assenza_lavoro_prima_dose___ne = assenza_lavoro_prima_dose___ne;
    }

    public Boolean getAssenza_lavoro_prima_dose___null() {
        return assenza_lavoro_prima_dose___null;
    }
    public void setAssenza_lavoro_prima_dose___null(Boolean assenza_lavoro_prima_dose___null) {
        this.assenza_lavoro_prima_dose___null = assenza_lavoro_prima_dose___null;
    }

    public Boolean getAssenza_lavoro_prima_dose___not___null() {
        return assenza_lavoro_prima_dose___not___null;
    }
    public void setAssenza_lavoro_prima_dose___not___null(Boolean assenza_lavoro_prima_dose___not___null) {
        this.assenza_lavoro_prima_dose___not___null = assenza_lavoro_prima_dose___not___null;
    }

    public Boolean getAssenza_lavoro_seconda_dose___eq() {
        return assenza_lavoro_seconda_dose___eq;
    }
    public void setAssenza_lavoro_seconda_dose___eq(Boolean assenza_lavoro_seconda_dose___eq) {
        this.assenza_lavoro_seconda_dose___eq = assenza_lavoro_seconda_dose___eq;
    }

    public Boolean getAssenza_lavoro_seconda_dose___ne() {
        return assenza_lavoro_seconda_dose___ne;
    }
    public void setAssenza_lavoro_seconda_dose___ne(Boolean assenza_lavoro_seconda_dose___ne) {
        this.assenza_lavoro_seconda_dose___ne = assenza_lavoro_seconda_dose___ne;
    }

    public Boolean getAssenza_lavoro_seconda_dose___null() {
        return assenza_lavoro_seconda_dose___null;
    }
    public void setAssenza_lavoro_seconda_dose___null(Boolean assenza_lavoro_seconda_dose___null) {
        this.assenza_lavoro_seconda_dose___null = assenza_lavoro_seconda_dose___null;
    }

    public Boolean getAssenza_lavoro_seconda_dose___not___null() {
        return assenza_lavoro_seconda_dose___not___null;
    }
    public void setAssenza_lavoro_seconda_dose___not___null(Boolean assenza_lavoro_seconda_dose___not___null) {
        this.assenza_lavoro_seconda_dose___not___null = assenza_lavoro_seconda_dose___not___null;
    }

    public Integer getCount_eventi_prima_dose___eq() {
        return count_eventi_prima_dose___eq;
    }
    public void setCount_eventi_prima_dose___eq(Integer count_eventi_prima_dose___eq) {
        this.count_eventi_prima_dose___eq = count_eventi_prima_dose___eq;
    }

    public Integer getCount_eventi_prima_dose___ne() {
        return count_eventi_prima_dose___ne;
    }
    public void setCount_eventi_prima_dose___ne(Integer count_eventi_prima_dose___ne) {
        this.count_eventi_prima_dose___ne = count_eventi_prima_dose___ne;
    }

    public Boolean getCount_eventi_prima_dose___null() {
        return count_eventi_prima_dose___null;
    }
    public void setCount_eventi_prima_dose___null(Boolean count_eventi_prima_dose___null) {
        this.count_eventi_prima_dose___null = count_eventi_prima_dose___null;
    }

    public Boolean getCount_eventi_prima_dose___not___null() {
        return count_eventi_prima_dose___not___null;
    }
    public void setCount_eventi_prima_dose___not___null(Boolean count_eventi_prima_dose___not___null) {
        this.count_eventi_prima_dose___not___null = count_eventi_prima_dose___not___null;
    }

    public java.util.List<Integer> getCount_eventi_prima_dose___in() {
        return count_eventi_prima_dose___in;
    }
    public void setCount_eventi_prima_dose___in(java.util.List<Integer> count_eventi_prima_dose___in) {
        this.count_eventi_prima_dose___in = count_eventi_prima_dose___in;
    }

    public java.util.List<Integer> getCount_eventi_prima_dose___not___in() {
        return count_eventi_prima_dose___not___in;
    }
    public void setCount_eventi_prima_dose___not___in(java.util.List<Integer> count_eventi_prima_dose___not___in) {
        this.count_eventi_prima_dose___not___in = count_eventi_prima_dose___not___in;
    }

    public Integer getCount_eventi_prima_dose___lt() {
        return count_eventi_prima_dose___lt;
    }
    public void setCount_eventi_prima_dose___lt(Integer count_eventi_prima_dose___lt) {
        this.count_eventi_prima_dose___lt = count_eventi_prima_dose___lt;
    }

    public Integer getCount_eventi_prima_dose___lte() {
        return count_eventi_prima_dose___lte;
    }
    public void setCount_eventi_prima_dose___lte(Integer count_eventi_prima_dose___lte) {
        this.count_eventi_prima_dose___lte = count_eventi_prima_dose___lte;
    }

    public Integer getCount_eventi_prima_dose___gt() {
        return count_eventi_prima_dose___gt;
    }
    public void setCount_eventi_prima_dose___gt(Integer count_eventi_prima_dose___gt) {
        this.count_eventi_prima_dose___gt = count_eventi_prima_dose___gt;
    }

    public Integer getCount_eventi_prima_dose___gte() {
        return count_eventi_prima_dose___gte;
    }
    public void setCount_eventi_prima_dose___gte(Integer count_eventi_prima_dose___gte) {
        this.count_eventi_prima_dose___gte = count_eventi_prima_dose___gte;
    }

    public Integer getCount_eventi_seconda_dose___eq() {
        return count_eventi_seconda_dose___eq;
    }
    public void setCount_eventi_seconda_dose___eq(Integer count_eventi_seconda_dose___eq) {
        this.count_eventi_seconda_dose___eq = count_eventi_seconda_dose___eq;
    }

    public Integer getCount_eventi_seconda_dose___ne() {
        return count_eventi_seconda_dose___ne;
    }
    public void setCount_eventi_seconda_dose___ne(Integer count_eventi_seconda_dose___ne) {
        this.count_eventi_seconda_dose___ne = count_eventi_seconda_dose___ne;
    }

    public Boolean getCount_eventi_seconda_dose___null() {
        return count_eventi_seconda_dose___null;
    }
    public void setCount_eventi_seconda_dose___null(Boolean count_eventi_seconda_dose___null) {
        this.count_eventi_seconda_dose___null = count_eventi_seconda_dose___null;
    }

    public Boolean getCount_eventi_seconda_dose___not___null() {
        return count_eventi_seconda_dose___not___null;
    }
    public void setCount_eventi_seconda_dose___not___null(Boolean count_eventi_seconda_dose___not___null) {
        this.count_eventi_seconda_dose___not___null = count_eventi_seconda_dose___not___null;
    }

    public java.util.List<Integer> getCount_eventi_seconda_dose___in() {
        return count_eventi_seconda_dose___in;
    }
    public void setCount_eventi_seconda_dose___in(java.util.List<Integer> count_eventi_seconda_dose___in) {
        this.count_eventi_seconda_dose___in = count_eventi_seconda_dose___in;
    }

    public java.util.List<Integer> getCount_eventi_seconda_dose___not___in() {
        return count_eventi_seconda_dose___not___in;
    }
    public void setCount_eventi_seconda_dose___not___in(java.util.List<Integer> count_eventi_seconda_dose___not___in) {
        this.count_eventi_seconda_dose___not___in = count_eventi_seconda_dose___not___in;
    }

    public Integer getCount_eventi_seconda_dose___lt() {
        return count_eventi_seconda_dose___lt;
    }
    public void setCount_eventi_seconda_dose___lt(Integer count_eventi_seconda_dose___lt) {
        this.count_eventi_seconda_dose___lt = count_eventi_seconda_dose___lt;
    }

    public Integer getCount_eventi_seconda_dose___lte() {
        return count_eventi_seconda_dose___lte;
    }
    public void setCount_eventi_seconda_dose___lte(Integer count_eventi_seconda_dose___lte) {
        this.count_eventi_seconda_dose___lte = count_eventi_seconda_dose___lte;
    }

    public Integer getCount_eventi_seconda_dose___gt() {
        return count_eventi_seconda_dose___gt;
    }
    public void setCount_eventi_seconda_dose___gt(Integer count_eventi_seconda_dose___gt) {
        this.count_eventi_seconda_dose___gt = count_eventi_seconda_dose___gt;
    }

    public Integer getCount_eventi_seconda_dose___gte() {
        return count_eventi_seconda_dose___gte;
    }
    public void setCount_eventi_seconda_dose___gte(Integer count_eventi_seconda_dose___gte) {
        this.count_eventi_seconda_dose___gte = count_eventi_seconda_dose___gte;
    }

    public String getData_prima_dose___eq() {
        return data_prima_dose___eq;
    }
    public void setData_prima_dose___eq(String data_prima_dose___eq) {
        this.data_prima_dose___eq = data_prima_dose___eq;
    }

    public String getData_prima_dose___ne() {
        return data_prima_dose___ne;
    }
    public void setData_prima_dose___ne(String data_prima_dose___ne) {
        this.data_prima_dose___ne = data_prima_dose___ne;
    }

    public Boolean getData_prima_dose___null() {
        return data_prima_dose___null;
    }
    public void setData_prima_dose___null(Boolean data_prima_dose___null) {
        this.data_prima_dose___null = data_prima_dose___null;
    }

    public Boolean getData_prima_dose___not___null() {
        return data_prima_dose___not___null;
    }
    public void setData_prima_dose___not___null(Boolean data_prima_dose___not___null) {
        this.data_prima_dose___not___null = data_prima_dose___not___null;
    }

    public java.util.List<String> getData_prima_dose___in() {
        return data_prima_dose___in;
    }
    public void setData_prima_dose___in(java.util.List<String> data_prima_dose___in) {
        this.data_prima_dose___in = data_prima_dose___in;
    }

    public java.util.List<String> getData_prima_dose___not___in() {
        return data_prima_dose___not___in;
    }
    public void setData_prima_dose___not___in(java.util.List<String> data_prima_dose___not___in) {
        this.data_prima_dose___not___in = data_prima_dose___not___in;
    }

    public String getData_prima_dose___lt() {
        return data_prima_dose___lt;
    }
    public void setData_prima_dose___lt(String data_prima_dose___lt) {
        this.data_prima_dose___lt = data_prima_dose___lt;
    }

    public String getData_prima_dose___lte() {
        return data_prima_dose___lte;
    }
    public void setData_prima_dose___lte(String data_prima_dose___lte) {
        this.data_prima_dose___lte = data_prima_dose___lte;
    }

    public String getData_prima_dose___gt() {
        return data_prima_dose___gt;
    }
    public void setData_prima_dose___gt(String data_prima_dose___gt) {
        this.data_prima_dose___gt = data_prima_dose___gt;
    }

    public String getData_prima_dose___gte() {
        return data_prima_dose___gte;
    }
    public void setData_prima_dose___gte(String data_prima_dose___gte) {
        this.data_prima_dose___gte = data_prima_dose___gte;
    }

    public String getData_primo_tampone___eq() {
        return data_primo_tampone___eq;
    }
    public void setData_primo_tampone___eq(String data_primo_tampone___eq) {
        this.data_primo_tampone___eq = data_primo_tampone___eq;
    }

    public String getData_primo_tampone___ne() {
        return data_primo_tampone___ne;
    }
    public void setData_primo_tampone___ne(String data_primo_tampone___ne) {
        this.data_primo_tampone___ne = data_primo_tampone___ne;
    }

    public Boolean getData_primo_tampone___null() {
        return data_primo_tampone___null;
    }
    public void setData_primo_tampone___null(Boolean data_primo_tampone___null) {
        this.data_primo_tampone___null = data_primo_tampone___null;
    }

    public Boolean getData_primo_tampone___not___null() {
        return data_primo_tampone___not___null;
    }
    public void setData_primo_tampone___not___null(Boolean data_primo_tampone___not___null) {
        this.data_primo_tampone___not___null = data_primo_tampone___not___null;
    }

    public java.util.List<String> getData_primo_tampone___in() {
        return data_primo_tampone___in;
    }
    public void setData_primo_tampone___in(java.util.List<String> data_primo_tampone___in) {
        this.data_primo_tampone___in = data_primo_tampone___in;
    }

    public java.util.List<String> getData_primo_tampone___not___in() {
        return data_primo_tampone___not___in;
    }
    public void setData_primo_tampone___not___in(java.util.List<String> data_primo_tampone___not___in) {
        this.data_primo_tampone___not___in = data_primo_tampone___not___in;
    }

    public String getData_primo_tampone___lt() {
        return data_primo_tampone___lt;
    }
    public void setData_primo_tampone___lt(String data_primo_tampone___lt) {
        this.data_primo_tampone___lt = data_primo_tampone___lt;
    }

    public String getData_primo_tampone___lte() {
        return data_primo_tampone___lte;
    }
    public void setData_primo_tampone___lte(String data_primo_tampone___lte) {
        this.data_primo_tampone___lte = data_primo_tampone___lte;
    }

    public String getData_primo_tampone___gt() {
        return data_primo_tampone___gt;
    }
    public void setData_primo_tampone___gt(String data_primo_tampone___gt) {
        this.data_primo_tampone___gt = data_primo_tampone___gt;
    }

    public String getData_primo_tampone___gte() {
        return data_primo_tampone___gte;
    }
    public void setData_primo_tampone___gte(String data_primo_tampone___gte) {
        this.data_primo_tampone___gte = data_primo_tampone___gte;
    }

    public String getData_primo_tampone_post___eq() {
        return data_primo_tampone_post___eq;
    }
    public void setData_primo_tampone_post___eq(String data_primo_tampone_post___eq) {
        this.data_primo_tampone_post___eq = data_primo_tampone_post___eq;
    }

    public String getData_primo_tampone_post___ne() {
        return data_primo_tampone_post___ne;
    }
    public void setData_primo_tampone_post___ne(String data_primo_tampone_post___ne) {
        this.data_primo_tampone_post___ne = data_primo_tampone_post___ne;
    }

    public Boolean getData_primo_tampone_post___null() {
        return data_primo_tampone_post___null;
    }
    public void setData_primo_tampone_post___null(Boolean data_primo_tampone_post___null) {
        this.data_primo_tampone_post___null = data_primo_tampone_post___null;
    }

    public Boolean getData_primo_tampone_post___not___null() {
        return data_primo_tampone_post___not___null;
    }
    public void setData_primo_tampone_post___not___null(Boolean data_primo_tampone_post___not___null) {
        this.data_primo_tampone_post___not___null = data_primo_tampone_post___not___null;
    }

    public java.util.List<String> getData_primo_tampone_post___in() {
        return data_primo_tampone_post___in;
    }
    public void setData_primo_tampone_post___in(java.util.List<String> data_primo_tampone_post___in) {
        this.data_primo_tampone_post___in = data_primo_tampone_post___in;
    }

    public java.util.List<String> getData_primo_tampone_post___not___in() {
        return data_primo_tampone_post___not___in;
    }
    public void setData_primo_tampone_post___not___in(java.util.List<String> data_primo_tampone_post___not___in) {
        this.data_primo_tampone_post___not___in = data_primo_tampone_post___not___in;
    }

    public String getData_primo_tampone_post___lt() {
        return data_primo_tampone_post___lt;
    }
    public void setData_primo_tampone_post___lt(String data_primo_tampone_post___lt) {
        this.data_primo_tampone_post___lt = data_primo_tampone_post___lt;
    }

    public String getData_primo_tampone_post___lte() {
        return data_primo_tampone_post___lte;
    }
    public void setData_primo_tampone_post___lte(String data_primo_tampone_post___lte) {
        this.data_primo_tampone_post___lte = data_primo_tampone_post___lte;
    }

    public String getData_primo_tampone_post___gt() {
        return data_primo_tampone_post___gt;
    }
    public void setData_primo_tampone_post___gt(String data_primo_tampone_post___gt) {
        this.data_primo_tampone_post___gt = data_primo_tampone_post___gt;
    }

    public String getData_primo_tampone_post___gte() {
        return data_primo_tampone_post___gte;
    }
    public void setData_primo_tampone_post___gte(String data_primo_tampone_post___gte) {
        this.data_primo_tampone_post___gte = data_primo_tampone_post___gte;
    }

    public String getData_seconda_dose___eq() {
        return data_seconda_dose___eq;
    }
    public void setData_seconda_dose___eq(String data_seconda_dose___eq) {
        this.data_seconda_dose___eq = data_seconda_dose___eq;
    }

    public String getData_seconda_dose___ne() {
        return data_seconda_dose___ne;
    }
    public void setData_seconda_dose___ne(String data_seconda_dose___ne) {
        this.data_seconda_dose___ne = data_seconda_dose___ne;
    }

    public Boolean getData_seconda_dose___null() {
        return data_seconda_dose___null;
    }
    public void setData_seconda_dose___null(Boolean data_seconda_dose___null) {
        this.data_seconda_dose___null = data_seconda_dose___null;
    }

    public Boolean getData_seconda_dose___not___null() {
        return data_seconda_dose___not___null;
    }
    public void setData_seconda_dose___not___null(Boolean data_seconda_dose___not___null) {
        this.data_seconda_dose___not___null = data_seconda_dose___not___null;
    }

    public java.util.List<String> getData_seconda_dose___in() {
        return data_seconda_dose___in;
    }
    public void setData_seconda_dose___in(java.util.List<String> data_seconda_dose___in) {
        this.data_seconda_dose___in = data_seconda_dose___in;
    }

    public java.util.List<String> getData_seconda_dose___not___in() {
        return data_seconda_dose___not___in;
    }
    public void setData_seconda_dose___not___in(java.util.List<String> data_seconda_dose___not___in) {
        this.data_seconda_dose___not___in = data_seconda_dose___not___in;
    }

    public String getData_seconda_dose___lt() {
        return data_seconda_dose___lt;
    }
    public void setData_seconda_dose___lt(String data_seconda_dose___lt) {
        this.data_seconda_dose___lt = data_seconda_dose___lt;
    }

    public String getData_seconda_dose___lte() {
        return data_seconda_dose___lte;
    }
    public void setData_seconda_dose___lte(String data_seconda_dose___lte) {
        this.data_seconda_dose___lte = data_seconda_dose___lte;
    }

    public String getData_seconda_dose___gt() {
        return data_seconda_dose___gt;
    }
    public void setData_seconda_dose___gt(String data_seconda_dose___gt) {
        this.data_seconda_dose___gt = data_seconda_dose___gt;
    }

    public String getData_seconda_dose___gte() {
        return data_seconda_dose___gte;
    }
    public void setData_seconda_dose___gte(String data_seconda_dose___gte) {
        this.data_seconda_dose___gte = data_seconda_dose___gte;
    }

    public String getDecorso_infezione_covid___eq() {
        return decorso_infezione_covid___eq;
    }
    public void setDecorso_infezione_covid___eq(String decorso_infezione_covid___eq) {
        this.decorso_infezione_covid___eq = decorso_infezione_covid___eq;
    }

    public String getDecorso_infezione_covid___ne() {
        return decorso_infezione_covid___ne;
    }
    public void setDecorso_infezione_covid___ne(String decorso_infezione_covid___ne) {
        this.decorso_infezione_covid___ne = decorso_infezione_covid___ne;
    }

    public Boolean getDecorso_infezione_covid___null() {
        return decorso_infezione_covid___null;
    }
    public void setDecorso_infezione_covid___null(Boolean decorso_infezione_covid___null) {
        this.decorso_infezione_covid___null = decorso_infezione_covid___null;
    }

    public Boolean getDecorso_infezione_covid___not___null() {
        return decorso_infezione_covid___not___null;
    }
    public void setDecorso_infezione_covid___not___null(Boolean decorso_infezione_covid___not___null) {
        this.decorso_infezione_covid___not___null = decorso_infezione_covid___not___null;
    }

    public java.util.List<String> getDecorso_infezione_covid___in() {
        return decorso_infezione_covid___in;
    }
    public void setDecorso_infezione_covid___in(java.util.List<String> decorso_infezione_covid___in) {
        this.decorso_infezione_covid___in = decorso_infezione_covid___in;
    }

    public java.util.List<String> getDecorso_infezione_covid___not___in() {
        return decorso_infezione_covid___not___in;
    }
    public void setDecorso_infezione_covid___not___in(java.util.List<String> decorso_infezione_covid___not___in) {
        this.decorso_infezione_covid___not___in = decorso_infezione_covid___not___in;
    }

    public String getDecorso_infezione_covid___lt() {
        return decorso_infezione_covid___lt;
    }
    public void setDecorso_infezione_covid___lt(String decorso_infezione_covid___lt) {
        this.decorso_infezione_covid___lt = decorso_infezione_covid___lt;
    }

    public String getDecorso_infezione_covid___lte() {
        return decorso_infezione_covid___lte;
    }
    public void setDecorso_infezione_covid___lte(String decorso_infezione_covid___lte) {
        this.decorso_infezione_covid___lte = decorso_infezione_covid___lte;
    }

    public String getDecorso_infezione_covid___gt() {
        return decorso_infezione_covid___gt;
    }
    public void setDecorso_infezione_covid___gt(String decorso_infezione_covid___gt) {
        this.decorso_infezione_covid___gt = decorso_infezione_covid___gt;
    }

    public String getDecorso_infezione_covid___gte() {
        return decorso_infezione_covid___gte;
    }
    public void setDecorso_infezione_covid___gte(String decorso_infezione_covid___gte) {
        this.decorso_infezione_covid___gte = decorso_infezione_covid___gte;
    }

    public String getDecorso_infezione_covid___contains() {
        return decorso_infezione_covid___contains;
    }
    public void setDecorso_infezione_covid___contains(String decorso_infezione_covid___contains) {
        this.decorso_infezione_covid___contains = decorso_infezione_covid___contains;
    }

    public String getDecorso_infezione_covid___not___contains() {
        return decorso_infezione_covid___not___contains;
    }
    public void setDecorso_infezione_covid___not___contains(String decorso_infezione_covid___not___contains) {
        this.decorso_infezione_covid___not___contains = decorso_infezione_covid___not___contains;
    }

    public String getDecorso_infezione_covid___starts_with() {
        return decorso_infezione_covid___starts_with;
    }
    public void setDecorso_infezione_covid___starts_with(String decorso_infezione_covid___starts_with) {
        this.decorso_infezione_covid___starts_with = decorso_infezione_covid___starts_with;
    }

    public String getDecorso_infezione_covid___not___starts_with() {
        return decorso_infezione_covid___not___starts_with;
    }
    public void setDecorso_infezione_covid___not___starts_with(String decorso_infezione_covid___not___starts_with) {
        this.decorso_infezione_covid___not___starts_with = decorso_infezione_covid___not___starts_with;
    }

    public String getDecorso_infezione_covid___ends_with() {
        return decorso_infezione_covid___ends_with;
    }
    public void setDecorso_infezione_covid___ends_with(String decorso_infezione_covid___ends_with) {
        this.decorso_infezione_covid___ends_with = decorso_infezione_covid___ends_with;
    }

    public String getDecorso_infezione_covid___not___ends_with() {
        return decorso_infezione_covid___not___ends_with;
    }
    public void setDecorso_infezione_covid___not___ends_with(String decorso_infezione_covid___not___ends_with) {
        this.decorso_infezione_covid___not___ends_with = decorso_infezione_covid___not___ends_with;
    }

    public String getDecorso_infezione_covid_post___eq() {
        return decorso_infezione_covid_post___eq;
    }
    public void setDecorso_infezione_covid_post___eq(String decorso_infezione_covid_post___eq) {
        this.decorso_infezione_covid_post___eq = decorso_infezione_covid_post___eq;
    }

    public String getDecorso_infezione_covid_post___ne() {
        return decorso_infezione_covid_post___ne;
    }
    public void setDecorso_infezione_covid_post___ne(String decorso_infezione_covid_post___ne) {
        this.decorso_infezione_covid_post___ne = decorso_infezione_covid_post___ne;
    }

    public Boolean getDecorso_infezione_covid_post___null() {
        return decorso_infezione_covid_post___null;
    }
    public void setDecorso_infezione_covid_post___null(Boolean decorso_infezione_covid_post___null) {
        this.decorso_infezione_covid_post___null = decorso_infezione_covid_post___null;
    }

    public Boolean getDecorso_infezione_covid_post___not___null() {
        return decorso_infezione_covid_post___not___null;
    }
    public void setDecorso_infezione_covid_post___not___null(Boolean decorso_infezione_covid_post___not___null) {
        this.decorso_infezione_covid_post___not___null = decorso_infezione_covid_post___not___null;
    }

    public java.util.List<String> getDecorso_infezione_covid_post___in() {
        return decorso_infezione_covid_post___in;
    }
    public void setDecorso_infezione_covid_post___in(java.util.List<String> decorso_infezione_covid_post___in) {
        this.decorso_infezione_covid_post___in = decorso_infezione_covid_post___in;
    }

    public java.util.List<String> getDecorso_infezione_covid_post___not___in() {
        return decorso_infezione_covid_post___not___in;
    }
    public void setDecorso_infezione_covid_post___not___in(java.util.List<String> decorso_infezione_covid_post___not___in) {
        this.decorso_infezione_covid_post___not___in = decorso_infezione_covid_post___not___in;
    }

    public String getDecorso_infezione_covid_post___lt() {
        return decorso_infezione_covid_post___lt;
    }
    public void setDecorso_infezione_covid_post___lt(String decorso_infezione_covid_post___lt) {
        this.decorso_infezione_covid_post___lt = decorso_infezione_covid_post___lt;
    }

    public String getDecorso_infezione_covid_post___lte() {
        return decorso_infezione_covid_post___lte;
    }
    public void setDecorso_infezione_covid_post___lte(String decorso_infezione_covid_post___lte) {
        this.decorso_infezione_covid_post___lte = decorso_infezione_covid_post___lte;
    }

    public String getDecorso_infezione_covid_post___gt() {
        return decorso_infezione_covid_post___gt;
    }
    public void setDecorso_infezione_covid_post___gt(String decorso_infezione_covid_post___gt) {
        this.decorso_infezione_covid_post___gt = decorso_infezione_covid_post___gt;
    }

    public String getDecorso_infezione_covid_post___gte() {
        return decorso_infezione_covid_post___gte;
    }
    public void setDecorso_infezione_covid_post___gte(String decorso_infezione_covid_post___gte) {
        this.decorso_infezione_covid_post___gte = decorso_infezione_covid_post___gte;
    }

    public String getDecorso_infezione_covid_post___contains() {
        return decorso_infezione_covid_post___contains;
    }
    public void setDecorso_infezione_covid_post___contains(String decorso_infezione_covid_post___contains) {
        this.decorso_infezione_covid_post___contains = decorso_infezione_covid_post___contains;
    }

    public String getDecorso_infezione_covid_post___not___contains() {
        return decorso_infezione_covid_post___not___contains;
    }
    public void setDecorso_infezione_covid_post___not___contains(String decorso_infezione_covid_post___not___contains) {
        this.decorso_infezione_covid_post___not___contains = decorso_infezione_covid_post___not___contains;
    }

    public String getDecorso_infezione_covid_post___starts_with() {
        return decorso_infezione_covid_post___starts_with;
    }
    public void setDecorso_infezione_covid_post___starts_with(String decorso_infezione_covid_post___starts_with) {
        this.decorso_infezione_covid_post___starts_with = decorso_infezione_covid_post___starts_with;
    }

    public String getDecorso_infezione_covid_post___not___starts_with() {
        return decorso_infezione_covid_post___not___starts_with;
    }
    public void setDecorso_infezione_covid_post___not___starts_with(String decorso_infezione_covid_post___not___starts_with) {
        this.decorso_infezione_covid_post___not___starts_with = decorso_infezione_covid_post___not___starts_with;
    }

    public String getDecorso_infezione_covid_post___ends_with() {
        return decorso_infezione_covid_post___ends_with;
    }
    public void setDecorso_infezione_covid_post___ends_with(String decorso_infezione_covid_post___ends_with) {
        this.decorso_infezione_covid_post___ends_with = decorso_infezione_covid_post___ends_with;
    }

    public String getDecorso_infezione_covid_post___not___ends_with() {
        return decorso_infezione_covid_post___not___ends_with;
    }
    public void setDecorso_infezione_covid_post___not___ends_with(String decorso_infezione_covid_post___not___ends_with) {
        this.decorso_infezione_covid_post___not___ends_with = decorso_infezione_covid_post___not___ends_with;
    }

    public String getDosi_vaccino_covid___eq() {
        return dosi_vaccino_covid___eq;
    }
    public void setDosi_vaccino_covid___eq(String dosi_vaccino_covid___eq) {
        this.dosi_vaccino_covid___eq = dosi_vaccino_covid___eq;
    }

    public String getDosi_vaccino_covid___ne() {
        return dosi_vaccino_covid___ne;
    }
    public void setDosi_vaccino_covid___ne(String dosi_vaccino_covid___ne) {
        this.dosi_vaccino_covid___ne = dosi_vaccino_covid___ne;
    }

    public Boolean getDosi_vaccino_covid___null() {
        return dosi_vaccino_covid___null;
    }
    public void setDosi_vaccino_covid___null(Boolean dosi_vaccino_covid___null) {
        this.dosi_vaccino_covid___null = dosi_vaccino_covid___null;
    }

    public Boolean getDosi_vaccino_covid___not___null() {
        return dosi_vaccino_covid___not___null;
    }
    public void setDosi_vaccino_covid___not___null(Boolean dosi_vaccino_covid___not___null) {
        this.dosi_vaccino_covid___not___null = dosi_vaccino_covid___not___null;
    }

    public java.util.List<String> getDosi_vaccino_covid___in() {
        return dosi_vaccino_covid___in;
    }
    public void setDosi_vaccino_covid___in(java.util.List<String> dosi_vaccino_covid___in) {
        this.dosi_vaccino_covid___in = dosi_vaccino_covid___in;
    }

    public java.util.List<String> getDosi_vaccino_covid___not___in() {
        return dosi_vaccino_covid___not___in;
    }
    public void setDosi_vaccino_covid___not___in(java.util.List<String> dosi_vaccino_covid___not___in) {
        this.dosi_vaccino_covid___not___in = dosi_vaccino_covid___not___in;
    }

    public String getDosi_vaccino_covid___lt() {
        return dosi_vaccino_covid___lt;
    }
    public void setDosi_vaccino_covid___lt(String dosi_vaccino_covid___lt) {
        this.dosi_vaccino_covid___lt = dosi_vaccino_covid___lt;
    }

    public String getDosi_vaccino_covid___lte() {
        return dosi_vaccino_covid___lte;
    }
    public void setDosi_vaccino_covid___lte(String dosi_vaccino_covid___lte) {
        this.dosi_vaccino_covid___lte = dosi_vaccino_covid___lte;
    }

    public String getDosi_vaccino_covid___gt() {
        return dosi_vaccino_covid___gt;
    }
    public void setDosi_vaccino_covid___gt(String dosi_vaccino_covid___gt) {
        this.dosi_vaccino_covid___gt = dosi_vaccino_covid___gt;
    }

    public String getDosi_vaccino_covid___gte() {
        return dosi_vaccino_covid___gte;
    }
    public void setDosi_vaccino_covid___gte(String dosi_vaccino_covid___gte) {
        this.dosi_vaccino_covid___gte = dosi_vaccino_covid___gte;
    }

    public String getDosi_vaccino_covid___contains() {
        return dosi_vaccino_covid___contains;
    }
    public void setDosi_vaccino_covid___contains(String dosi_vaccino_covid___contains) {
        this.dosi_vaccino_covid___contains = dosi_vaccino_covid___contains;
    }

    public String getDosi_vaccino_covid___not___contains() {
        return dosi_vaccino_covid___not___contains;
    }
    public void setDosi_vaccino_covid___not___contains(String dosi_vaccino_covid___not___contains) {
        this.dosi_vaccino_covid___not___contains = dosi_vaccino_covid___not___contains;
    }

    public String getDosi_vaccino_covid___starts_with() {
        return dosi_vaccino_covid___starts_with;
    }
    public void setDosi_vaccino_covid___starts_with(String dosi_vaccino_covid___starts_with) {
        this.dosi_vaccino_covid___starts_with = dosi_vaccino_covid___starts_with;
    }

    public String getDosi_vaccino_covid___not___starts_with() {
        return dosi_vaccino_covid___not___starts_with;
    }
    public void setDosi_vaccino_covid___not___starts_with(String dosi_vaccino_covid___not___starts_with) {
        this.dosi_vaccino_covid___not___starts_with = dosi_vaccino_covid___not___starts_with;
    }

    public String getDosi_vaccino_covid___ends_with() {
        return dosi_vaccino_covid___ends_with;
    }
    public void setDosi_vaccino_covid___ends_with(String dosi_vaccino_covid___ends_with) {
        this.dosi_vaccino_covid___ends_with = dosi_vaccino_covid___ends_with;
    }

    public String getDosi_vaccino_covid___not___ends_with() {
        return dosi_vaccino_covid___not___ends_with;
    }
    public void setDosi_vaccino_covid___not___ends_with(String dosi_vaccino_covid___not___ends_with) {
        this.dosi_vaccino_covid___not___ends_with = dosi_vaccino_covid___not___ends_with;
    }

    public Boolean getFarmaci_prima_dose_bool___eq() {
        return farmaci_prima_dose_bool___eq;
    }
    public void setFarmaci_prima_dose_bool___eq(Boolean farmaci_prima_dose_bool___eq) {
        this.farmaci_prima_dose_bool___eq = farmaci_prima_dose_bool___eq;
    }

    public Boolean getFarmaci_prima_dose_bool___ne() {
        return farmaci_prima_dose_bool___ne;
    }
    public void setFarmaci_prima_dose_bool___ne(Boolean farmaci_prima_dose_bool___ne) {
        this.farmaci_prima_dose_bool___ne = farmaci_prima_dose_bool___ne;
    }

    public Boolean getFarmaci_prima_dose_bool___null() {
        return farmaci_prima_dose_bool___null;
    }
    public void setFarmaci_prima_dose_bool___null(Boolean farmaci_prima_dose_bool___null) {
        this.farmaci_prima_dose_bool___null = farmaci_prima_dose_bool___null;
    }

    public Boolean getFarmaci_prima_dose_bool___not___null() {
        return farmaci_prima_dose_bool___not___null;
    }
    public void setFarmaci_prima_dose_bool___not___null(Boolean farmaci_prima_dose_bool___not___null) {
        this.farmaci_prima_dose_bool___not___null = farmaci_prima_dose_bool___not___null;
    }

    public String getFarmaci_prima_dose_text___eq() {
        return farmaci_prima_dose_text___eq;
    }
    public void setFarmaci_prima_dose_text___eq(String farmaci_prima_dose_text___eq) {
        this.farmaci_prima_dose_text___eq = farmaci_prima_dose_text___eq;
    }

    public String getFarmaci_prima_dose_text___ne() {
        return farmaci_prima_dose_text___ne;
    }
    public void setFarmaci_prima_dose_text___ne(String farmaci_prima_dose_text___ne) {
        this.farmaci_prima_dose_text___ne = farmaci_prima_dose_text___ne;
    }

    public Boolean getFarmaci_prima_dose_text___null() {
        return farmaci_prima_dose_text___null;
    }
    public void setFarmaci_prima_dose_text___null(Boolean farmaci_prima_dose_text___null) {
        this.farmaci_prima_dose_text___null = farmaci_prima_dose_text___null;
    }

    public Boolean getFarmaci_prima_dose_text___not___null() {
        return farmaci_prima_dose_text___not___null;
    }
    public void setFarmaci_prima_dose_text___not___null(Boolean farmaci_prima_dose_text___not___null) {
        this.farmaci_prima_dose_text___not___null = farmaci_prima_dose_text___not___null;
    }

    public java.util.List<String> getFarmaci_prima_dose_text___in() {
        return farmaci_prima_dose_text___in;
    }
    public void setFarmaci_prima_dose_text___in(java.util.List<String> farmaci_prima_dose_text___in) {
        this.farmaci_prima_dose_text___in = farmaci_prima_dose_text___in;
    }

    public java.util.List<String> getFarmaci_prima_dose_text___not___in() {
        return farmaci_prima_dose_text___not___in;
    }
    public void setFarmaci_prima_dose_text___not___in(java.util.List<String> farmaci_prima_dose_text___not___in) {
        this.farmaci_prima_dose_text___not___in = farmaci_prima_dose_text___not___in;
    }

    public String getFarmaci_prima_dose_text___lt() {
        return farmaci_prima_dose_text___lt;
    }
    public void setFarmaci_prima_dose_text___lt(String farmaci_prima_dose_text___lt) {
        this.farmaci_prima_dose_text___lt = farmaci_prima_dose_text___lt;
    }

    public String getFarmaci_prima_dose_text___lte() {
        return farmaci_prima_dose_text___lte;
    }
    public void setFarmaci_prima_dose_text___lte(String farmaci_prima_dose_text___lte) {
        this.farmaci_prima_dose_text___lte = farmaci_prima_dose_text___lte;
    }

    public String getFarmaci_prima_dose_text___gt() {
        return farmaci_prima_dose_text___gt;
    }
    public void setFarmaci_prima_dose_text___gt(String farmaci_prima_dose_text___gt) {
        this.farmaci_prima_dose_text___gt = farmaci_prima_dose_text___gt;
    }

    public String getFarmaci_prima_dose_text___gte() {
        return farmaci_prima_dose_text___gte;
    }
    public void setFarmaci_prima_dose_text___gte(String farmaci_prima_dose_text___gte) {
        this.farmaci_prima_dose_text___gte = farmaci_prima_dose_text___gte;
    }

    public String getFarmaci_prima_dose_text___contains() {
        return farmaci_prima_dose_text___contains;
    }
    public void setFarmaci_prima_dose_text___contains(String farmaci_prima_dose_text___contains) {
        this.farmaci_prima_dose_text___contains = farmaci_prima_dose_text___contains;
    }

    public String getFarmaci_prima_dose_text___not___contains() {
        return farmaci_prima_dose_text___not___contains;
    }
    public void setFarmaci_prima_dose_text___not___contains(String farmaci_prima_dose_text___not___contains) {
        this.farmaci_prima_dose_text___not___contains = farmaci_prima_dose_text___not___contains;
    }

    public String getFarmaci_prima_dose_text___starts_with() {
        return farmaci_prima_dose_text___starts_with;
    }
    public void setFarmaci_prima_dose_text___starts_with(String farmaci_prima_dose_text___starts_with) {
        this.farmaci_prima_dose_text___starts_with = farmaci_prima_dose_text___starts_with;
    }

    public String getFarmaci_prima_dose_text___not___starts_with() {
        return farmaci_prima_dose_text___not___starts_with;
    }
    public void setFarmaci_prima_dose_text___not___starts_with(String farmaci_prima_dose_text___not___starts_with) {
        this.farmaci_prima_dose_text___not___starts_with = farmaci_prima_dose_text___not___starts_with;
    }

    public String getFarmaci_prima_dose_text___ends_with() {
        return farmaci_prima_dose_text___ends_with;
    }
    public void setFarmaci_prima_dose_text___ends_with(String farmaci_prima_dose_text___ends_with) {
        this.farmaci_prima_dose_text___ends_with = farmaci_prima_dose_text___ends_with;
    }

    public String getFarmaci_prima_dose_text___not___ends_with() {
        return farmaci_prima_dose_text___not___ends_with;
    }
    public void setFarmaci_prima_dose_text___not___ends_with(String farmaci_prima_dose_text___not___ends_with) {
        this.farmaci_prima_dose_text___not___ends_with = farmaci_prima_dose_text___not___ends_with;
    }

    public Boolean getFarmaci_seconda_dose_bool___eq() {
        return farmaci_seconda_dose_bool___eq;
    }
    public void setFarmaci_seconda_dose_bool___eq(Boolean farmaci_seconda_dose_bool___eq) {
        this.farmaci_seconda_dose_bool___eq = farmaci_seconda_dose_bool___eq;
    }

    public Boolean getFarmaci_seconda_dose_bool___ne() {
        return farmaci_seconda_dose_bool___ne;
    }
    public void setFarmaci_seconda_dose_bool___ne(Boolean farmaci_seconda_dose_bool___ne) {
        this.farmaci_seconda_dose_bool___ne = farmaci_seconda_dose_bool___ne;
    }

    public Boolean getFarmaci_seconda_dose_bool___null() {
        return farmaci_seconda_dose_bool___null;
    }
    public void setFarmaci_seconda_dose_bool___null(Boolean farmaci_seconda_dose_bool___null) {
        this.farmaci_seconda_dose_bool___null = farmaci_seconda_dose_bool___null;
    }

    public Boolean getFarmaci_seconda_dose_bool___not___null() {
        return farmaci_seconda_dose_bool___not___null;
    }
    public void setFarmaci_seconda_dose_bool___not___null(Boolean farmaci_seconda_dose_bool___not___null) {
        this.farmaci_seconda_dose_bool___not___null = farmaci_seconda_dose_bool___not___null;
    }

    public String getFarmaci_seconda_dose_text___eq() {
        return farmaci_seconda_dose_text___eq;
    }
    public void setFarmaci_seconda_dose_text___eq(String farmaci_seconda_dose_text___eq) {
        this.farmaci_seconda_dose_text___eq = farmaci_seconda_dose_text___eq;
    }

    public String getFarmaci_seconda_dose_text___ne() {
        return farmaci_seconda_dose_text___ne;
    }
    public void setFarmaci_seconda_dose_text___ne(String farmaci_seconda_dose_text___ne) {
        this.farmaci_seconda_dose_text___ne = farmaci_seconda_dose_text___ne;
    }

    public Boolean getFarmaci_seconda_dose_text___null() {
        return farmaci_seconda_dose_text___null;
    }
    public void setFarmaci_seconda_dose_text___null(Boolean farmaci_seconda_dose_text___null) {
        this.farmaci_seconda_dose_text___null = farmaci_seconda_dose_text___null;
    }

    public Boolean getFarmaci_seconda_dose_text___not___null() {
        return farmaci_seconda_dose_text___not___null;
    }
    public void setFarmaci_seconda_dose_text___not___null(Boolean farmaci_seconda_dose_text___not___null) {
        this.farmaci_seconda_dose_text___not___null = farmaci_seconda_dose_text___not___null;
    }

    public java.util.List<String> getFarmaci_seconda_dose_text___in() {
        return farmaci_seconda_dose_text___in;
    }
    public void setFarmaci_seconda_dose_text___in(java.util.List<String> farmaci_seconda_dose_text___in) {
        this.farmaci_seconda_dose_text___in = farmaci_seconda_dose_text___in;
    }

    public java.util.List<String> getFarmaci_seconda_dose_text___not___in() {
        return farmaci_seconda_dose_text___not___in;
    }
    public void setFarmaci_seconda_dose_text___not___in(java.util.List<String> farmaci_seconda_dose_text___not___in) {
        this.farmaci_seconda_dose_text___not___in = farmaci_seconda_dose_text___not___in;
    }

    public String getFarmaci_seconda_dose_text___lt() {
        return farmaci_seconda_dose_text___lt;
    }
    public void setFarmaci_seconda_dose_text___lt(String farmaci_seconda_dose_text___lt) {
        this.farmaci_seconda_dose_text___lt = farmaci_seconda_dose_text___lt;
    }

    public String getFarmaci_seconda_dose_text___lte() {
        return farmaci_seconda_dose_text___lte;
    }
    public void setFarmaci_seconda_dose_text___lte(String farmaci_seconda_dose_text___lte) {
        this.farmaci_seconda_dose_text___lte = farmaci_seconda_dose_text___lte;
    }

    public String getFarmaci_seconda_dose_text___gt() {
        return farmaci_seconda_dose_text___gt;
    }
    public void setFarmaci_seconda_dose_text___gt(String farmaci_seconda_dose_text___gt) {
        this.farmaci_seconda_dose_text___gt = farmaci_seconda_dose_text___gt;
    }

    public String getFarmaci_seconda_dose_text___gte() {
        return farmaci_seconda_dose_text___gte;
    }
    public void setFarmaci_seconda_dose_text___gte(String farmaci_seconda_dose_text___gte) {
        this.farmaci_seconda_dose_text___gte = farmaci_seconda_dose_text___gte;
    }

    public String getFarmaci_seconda_dose_text___contains() {
        return farmaci_seconda_dose_text___contains;
    }
    public void setFarmaci_seconda_dose_text___contains(String farmaci_seconda_dose_text___contains) {
        this.farmaci_seconda_dose_text___contains = farmaci_seconda_dose_text___contains;
    }

    public String getFarmaci_seconda_dose_text___not___contains() {
        return farmaci_seconda_dose_text___not___contains;
    }
    public void setFarmaci_seconda_dose_text___not___contains(String farmaci_seconda_dose_text___not___contains) {
        this.farmaci_seconda_dose_text___not___contains = farmaci_seconda_dose_text___not___contains;
    }

    public String getFarmaci_seconda_dose_text___starts_with() {
        return farmaci_seconda_dose_text___starts_with;
    }
    public void setFarmaci_seconda_dose_text___starts_with(String farmaci_seconda_dose_text___starts_with) {
        this.farmaci_seconda_dose_text___starts_with = farmaci_seconda_dose_text___starts_with;
    }

    public String getFarmaci_seconda_dose_text___not___starts_with() {
        return farmaci_seconda_dose_text___not___starts_with;
    }
    public void setFarmaci_seconda_dose_text___not___starts_with(String farmaci_seconda_dose_text___not___starts_with) {
        this.farmaci_seconda_dose_text___not___starts_with = farmaci_seconda_dose_text___not___starts_with;
    }

    public String getFarmaci_seconda_dose_text___ends_with() {
        return farmaci_seconda_dose_text___ends_with;
    }
    public void setFarmaci_seconda_dose_text___ends_with(String farmaci_seconda_dose_text___ends_with) {
        this.farmaci_seconda_dose_text___ends_with = farmaci_seconda_dose_text___ends_with;
    }

    public String getFarmaci_seconda_dose_text___not___ends_with() {
        return farmaci_seconda_dose_text___not___ends_with;
    }
    public void setFarmaci_seconda_dose_text___not___ends_with(String farmaci_seconda_dose_text___not___ends_with) {
        this.farmaci_seconda_dose_text___not___ends_with = farmaci_seconda_dose_text___not___ends_with;
    }

    public Boolean getImped_attivita_prima_dose___eq() {
        return imped_attivita_prima_dose___eq;
    }
    public void setImped_attivita_prima_dose___eq(Boolean imped_attivita_prima_dose___eq) {
        this.imped_attivita_prima_dose___eq = imped_attivita_prima_dose___eq;
    }

    public Boolean getImped_attivita_prima_dose___ne() {
        return imped_attivita_prima_dose___ne;
    }
    public void setImped_attivita_prima_dose___ne(Boolean imped_attivita_prima_dose___ne) {
        this.imped_attivita_prima_dose___ne = imped_attivita_prima_dose___ne;
    }

    public Boolean getImped_attivita_prima_dose___null() {
        return imped_attivita_prima_dose___null;
    }
    public void setImped_attivita_prima_dose___null(Boolean imped_attivita_prima_dose___null) {
        this.imped_attivita_prima_dose___null = imped_attivita_prima_dose___null;
    }

    public Boolean getImped_attivita_prima_dose___not___null() {
        return imped_attivita_prima_dose___not___null;
    }
    public void setImped_attivita_prima_dose___not___null(Boolean imped_attivita_prima_dose___not___null) {
        this.imped_attivita_prima_dose___not___null = imped_attivita_prima_dose___not___null;
    }

    public Boolean getImped_attivita_seconda_dose___eq() {
        return imped_attivita_seconda_dose___eq;
    }
    public void setImped_attivita_seconda_dose___eq(Boolean imped_attivita_seconda_dose___eq) {
        this.imped_attivita_seconda_dose___eq = imped_attivita_seconda_dose___eq;
    }

    public Boolean getImped_attivita_seconda_dose___ne() {
        return imped_attivita_seconda_dose___ne;
    }
    public void setImped_attivita_seconda_dose___ne(Boolean imped_attivita_seconda_dose___ne) {
        this.imped_attivita_seconda_dose___ne = imped_attivita_seconda_dose___ne;
    }

    public Boolean getImped_attivita_seconda_dose___null() {
        return imped_attivita_seconda_dose___null;
    }
    public void setImped_attivita_seconda_dose___null(Boolean imped_attivita_seconda_dose___null) {
        this.imped_attivita_seconda_dose___null = imped_attivita_seconda_dose___null;
    }

    public Boolean getImped_attivita_seconda_dose___not___null() {
        return imped_attivita_seconda_dose___not___null;
    }
    public void setImped_attivita_seconda_dose___not___null(Boolean imped_attivita_seconda_dose___not___null) {
        this.imped_attivita_seconda_dose___not___null = imped_attivita_seconda_dose___not___null;
    }

    public Boolean getInfezione_covid___eq() {
        return infezione_covid___eq;
    }
    public void setInfezione_covid___eq(Boolean infezione_covid___eq) {
        this.infezione_covid___eq = infezione_covid___eq;
    }

    public Boolean getInfezione_covid___ne() {
        return infezione_covid___ne;
    }
    public void setInfezione_covid___ne(Boolean infezione_covid___ne) {
        this.infezione_covid___ne = infezione_covid___ne;
    }

    public Boolean getInfezione_covid___null() {
        return infezione_covid___null;
    }
    public void setInfezione_covid___null(Boolean infezione_covid___null) {
        this.infezione_covid___null = infezione_covid___null;
    }

    public Boolean getInfezione_covid___not___null() {
        return infezione_covid___not___null;
    }
    public void setInfezione_covid___not___null(Boolean infezione_covid___not___null) {
        this.infezione_covid___not___null = infezione_covid___not___null;
    }

    public Boolean getInfezione_covid_post___eq() {
        return infezione_covid_post___eq;
    }
    public void setInfezione_covid_post___eq(Boolean infezione_covid_post___eq) {
        this.infezione_covid_post___eq = infezione_covid_post___eq;
    }

    public Boolean getInfezione_covid_post___ne() {
        return infezione_covid_post___ne;
    }
    public void setInfezione_covid_post___ne(Boolean infezione_covid_post___ne) {
        this.infezione_covid_post___ne = infezione_covid_post___ne;
    }

    public Boolean getInfezione_covid_post___null() {
        return infezione_covid_post___null;
    }
    public void setInfezione_covid_post___null(Boolean infezione_covid_post___null) {
        this.infezione_covid_post___null = infezione_covid_post___null;
    }

    public Boolean getInfezione_covid_post___not___null() {
        return infezione_covid_post___not___null;
    }
    public void setInfezione_covid_post___not___null(Boolean infezione_covid_post___not___null) {
        this.infezione_covid_post___not___null = infezione_covid_post___not___null;
    }

    public Boolean getIntubazione___eq() {
        return intubazione___eq;
    }
    public void setIntubazione___eq(Boolean intubazione___eq) {
        this.intubazione___eq = intubazione___eq;
    }

    public Boolean getIntubazione___ne() {
        return intubazione___ne;
    }
    public void setIntubazione___ne(Boolean intubazione___ne) {
        this.intubazione___ne = intubazione___ne;
    }

    public Boolean getIntubazione___null() {
        return intubazione___null;
    }
    public void setIntubazione___null(Boolean intubazione___null) {
        this.intubazione___null = intubazione___null;
    }

    public Boolean getIntubazione___not___null() {
        return intubazione___not___null;
    }
    public void setIntubazione___not___null(Boolean intubazione___not___null) {
        this.intubazione___not___null = intubazione___not___null;
    }

    public String getOre_durata_sintomi_prima_dose___eq() {
        return ore_durata_sintomi_prima_dose___eq;
    }
    public void setOre_durata_sintomi_prima_dose___eq(String ore_durata_sintomi_prima_dose___eq) {
        this.ore_durata_sintomi_prima_dose___eq = ore_durata_sintomi_prima_dose___eq;
    }

    public String getOre_durata_sintomi_prima_dose___ne() {
        return ore_durata_sintomi_prima_dose___ne;
    }
    public void setOre_durata_sintomi_prima_dose___ne(String ore_durata_sintomi_prima_dose___ne) {
        this.ore_durata_sintomi_prima_dose___ne = ore_durata_sintomi_prima_dose___ne;
    }

    public Boolean getOre_durata_sintomi_prima_dose___null() {
        return ore_durata_sintomi_prima_dose___null;
    }
    public void setOre_durata_sintomi_prima_dose___null(Boolean ore_durata_sintomi_prima_dose___null) {
        this.ore_durata_sintomi_prima_dose___null = ore_durata_sintomi_prima_dose___null;
    }

    public Boolean getOre_durata_sintomi_prima_dose___not___null() {
        return ore_durata_sintomi_prima_dose___not___null;
    }
    public void setOre_durata_sintomi_prima_dose___not___null(Boolean ore_durata_sintomi_prima_dose___not___null) {
        this.ore_durata_sintomi_prima_dose___not___null = ore_durata_sintomi_prima_dose___not___null;
    }

    public java.util.List<String> getOre_durata_sintomi_prima_dose___in() {
        return ore_durata_sintomi_prima_dose___in;
    }
    public void setOre_durata_sintomi_prima_dose___in(java.util.List<String> ore_durata_sintomi_prima_dose___in) {
        this.ore_durata_sintomi_prima_dose___in = ore_durata_sintomi_prima_dose___in;
    }

    public java.util.List<String> getOre_durata_sintomi_prima_dose___not___in() {
        return ore_durata_sintomi_prima_dose___not___in;
    }
    public void setOre_durata_sintomi_prima_dose___not___in(java.util.List<String> ore_durata_sintomi_prima_dose___not___in) {
        this.ore_durata_sintomi_prima_dose___not___in = ore_durata_sintomi_prima_dose___not___in;
    }

    public String getOre_durata_sintomi_prima_dose___lt() {
        return ore_durata_sintomi_prima_dose___lt;
    }
    public void setOre_durata_sintomi_prima_dose___lt(String ore_durata_sintomi_prima_dose___lt) {
        this.ore_durata_sintomi_prima_dose___lt = ore_durata_sintomi_prima_dose___lt;
    }

    public String getOre_durata_sintomi_prima_dose___lte() {
        return ore_durata_sintomi_prima_dose___lte;
    }
    public void setOre_durata_sintomi_prima_dose___lte(String ore_durata_sintomi_prima_dose___lte) {
        this.ore_durata_sintomi_prima_dose___lte = ore_durata_sintomi_prima_dose___lte;
    }

    public String getOre_durata_sintomi_prima_dose___gt() {
        return ore_durata_sintomi_prima_dose___gt;
    }
    public void setOre_durata_sintomi_prima_dose___gt(String ore_durata_sintomi_prima_dose___gt) {
        this.ore_durata_sintomi_prima_dose___gt = ore_durata_sintomi_prima_dose___gt;
    }

    public String getOre_durata_sintomi_prima_dose___gte() {
        return ore_durata_sintomi_prima_dose___gte;
    }
    public void setOre_durata_sintomi_prima_dose___gte(String ore_durata_sintomi_prima_dose___gte) {
        this.ore_durata_sintomi_prima_dose___gte = ore_durata_sintomi_prima_dose___gte;
    }

    public String getOre_durata_sintomi_seconda_dose___eq() {
        return ore_durata_sintomi_seconda_dose___eq;
    }
    public void setOre_durata_sintomi_seconda_dose___eq(String ore_durata_sintomi_seconda_dose___eq) {
        this.ore_durata_sintomi_seconda_dose___eq = ore_durata_sintomi_seconda_dose___eq;
    }

    public String getOre_durata_sintomi_seconda_dose___ne() {
        return ore_durata_sintomi_seconda_dose___ne;
    }
    public void setOre_durata_sintomi_seconda_dose___ne(String ore_durata_sintomi_seconda_dose___ne) {
        this.ore_durata_sintomi_seconda_dose___ne = ore_durata_sintomi_seconda_dose___ne;
    }

    public Boolean getOre_durata_sintomi_seconda_dose___null() {
        return ore_durata_sintomi_seconda_dose___null;
    }
    public void setOre_durata_sintomi_seconda_dose___null(Boolean ore_durata_sintomi_seconda_dose___null) {
        this.ore_durata_sintomi_seconda_dose___null = ore_durata_sintomi_seconda_dose___null;
    }

    public Boolean getOre_durata_sintomi_seconda_dose___not___null() {
        return ore_durata_sintomi_seconda_dose___not___null;
    }
    public void setOre_durata_sintomi_seconda_dose___not___null(Boolean ore_durata_sintomi_seconda_dose___not___null) {
        this.ore_durata_sintomi_seconda_dose___not___null = ore_durata_sintomi_seconda_dose___not___null;
    }

    public java.util.List<String> getOre_durata_sintomi_seconda_dose___in() {
        return ore_durata_sintomi_seconda_dose___in;
    }
    public void setOre_durata_sintomi_seconda_dose___in(java.util.List<String> ore_durata_sintomi_seconda_dose___in) {
        this.ore_durata_sintomi_seconda_dose___in = ore_durata_sintomi_seconda_dose___in;
    }

    public java.util.List<String> getOre_durata_sintomi_seconda_dose___not___in() {
        return ore_durata_sintomi_seconda_dose___not___in;
    }
    public void setOre_durata_sintomi_seconda_dose___not___in(java.util.List<String> ore_durata_sintomi_seconda_dose___not___in) {
        this.ore_durata_sintomi_seconda_dose___not___in = ore_durata_sintomi_seconda_dose___not___in;
    }

    public String getOre_durata_sintomi_seconda_dose___lt() {
        return ore_durata_sintomi_seconda_dose___lt;
    }
    public void setOre_durata_sintomi_seconda_dose___lt(String ore_durata_sintomi_seconda_dose___lt) {
        this.ore_durata_sintomi_seconda_dose___lt = ore_durata_sintomi_seconda_dose___lt;
    }

    public String getOre_durata_sintomi_seconda_dose___lte() {
        return ore_durata_sintomi_seconda_dose___lte;
    }
    public void setOre_durata_sintomi_seconda_dose___lte(String ore_durata_sintomi_seconda_dose___lte) {
        this.ore_durata_sintomi_seconda_dose___lte = ore_durata_sintomi_seconda_dose___lte;
    }

    public String getOre_durata_sintomi_seconda_dose___gt() {
        return ore_durata_sintomi_seconda_dose___gt;
    }
    public void setOre_durata_sintomi_seconda_dose___gt(String ore_durata_sintomi_seconda_dose___gt) {
        this.ore_durata_sintomi_seconda_dose___gt = ore_durata_sintomi_seconda_dose___gt;
    }

    public String getOre_durata_sintomi_seconda_dose___gte() {
        return ore_durata_sintomi_seconda_dose___gte;
    }
    public void setOre_durata_sintomi_seconda_dose___gte(String ore_durata_sintomi_seconda_dose___gte) {
        this.ore_durata_sintomi_seconda_dose___gte = ore_durata_sintomi_seconda_dose___gte;
    }

    public String getOre_primo_sintomo_prima_dose___eq() {
        return ore_primo_sintomo_prima_dose___eq;
    }
    public void setOre_primo_sintomo_prima_dose___eq(String ore_primo_sintomo_prima_dose___eq) {
        this.ore_primo_sintomo_prima_dose___eq = ore_primo_sintomo_prima_dose___eq;
    }

    public String getOre_primo_sintomo_prima_dose___ne() {
        return ore_primo_sintomo_prima_dose___ne;
    }
    public void setOre_primo_sintomo_prima_dose___ne(String ore_primo_sintomo_prima_dose___ne) {
        this.ore_primo_sintomo_prima_dose___ne = ore_primo_sintomo_prima_dose___ne;
    }

    public Boolean getOre_primo_sintomo_prima_dose___null() {
        return ore_primo_sintomo_prima_dose___null;
    }
    public void setOre_primo_sintomo_prima_dose___null(Boolean ore_primo_sintomo_prima_dose___null) {
        this.ore_primo_sintomo_prima_dose___null = ore_primo_sintomo_prima_dose___null;
    }

    public Boolean getOre_primo_sintomo_prima_dose___not___null() {
        return ore_primo_sintomo_prima_dose___not___null;
    }
    public void setOre_primo_sintomo_prima_dose___not___null(Boolean ore_primo_sintomo_prima_dose___not___null) {
        this.ore_primo_sintomo_prima_dose___not___null = ore_primo_sintomo_prima_dose___not___null;
    }

    public java.util.List<String> getOre_primo_sintomo_prima_dose___in() {
        return ore_primo_sintomo_prima_dose___in;
    }
    public void setOre_primo_sintomo_prima_dose___in(java.util.List<String> ore_primo_sintomo_prima_dose___in) {
        this.ore_primo_sintomo_prima_dose___in = ore_primo_sintomo_prima_dose___in;
    }

    public java.util.List<String> getOre_primo_sintomo_prima_dose___not___in() {
        return ore_primo_sintomo_prima_dose___not___in;
    }
    public void setOre_primo_sintomo_prima_dose___not___in(java.util.List<String> ore_primo_sintomo_prima_dose___not___in) {
        this.ore_primo_sintomo_prima_dose___not___in = ore_primo_sintomo_prima_dose___not___in;
    }

    public String getOre_primo_sintomo_prima_dose___lt() {
        return ore_primo_sintomo_prima_dose___lt;
    }
    public void setOre_primo_sintomo_prima_dose___lt(String ore_primo_sintomo_prima_dose___lt) {
        this.ore_primo_sintomo_prima_dose___lt = ore_primo_sintomo_prima_dose___lt;
    }

    public String getOre_primo_sintomo_prima_dose___lte() {
        return ore_primo_sintomo_prima_dose___lte;
    }
    public void setOre_primo_sintomo_prima_dose___lte(String ore_primo_sintomo_prima_dose___lte) {
        this.ore_primo_sintomo_prima_dose___lte = ore_primo_sintomo_prima_dose___lte;
    }

    public String getOre_primo_sintomo_prima_dose___gt() {
        return ore_primo_sintomo_prima_dose___gt;
    }
    public void setOre_primo_sintomo_prima_dose___gt(String ore_primo_sintomo_prima_dose___gt) {
        this.ore_primo_sintomo_prima_dose___gt = ore_primo_sintomo_prima_dose___gt;
    }

    public String getOre_primo_sintomo_prima_dose___gte() {
        return ore_primo_sintomo_prima_dose___gte;
    }
    public void setOre_primo_sintomo_prima_dose___gte(String ore_primo_sintomo_prima_dose___gte) {
        this.ore_primo_sintomo_prima_dose___gte = ore_primo_sintomo_prima_dose___gte;
    }

    public String getOre_primo_sintomo_seconda_dose___eq() {
        return ore_primo_sintomo_seconda_dose___eq;
    }
    public void setOre_primo_sintomo_seconda_dose___eq(String ore_primo_sintomo_seconda_dose___eq) {
        this.ore_primo_sintomo_seconda_dose___eq = ore_primo_sintomo_seconda_dose___eq;
    }

    public String getOre_primo_sintomo_seconda_dose___ne() {
        return ore_primo_sintomo_seconda_dose___ne;
    }
    public void setOre_primo_sintomo_seconda_dose___ne(String ore_primo_sintomo_seconda_dose___ne) {
        this.ore_primo_sintomo_seconda_dose___ne = ore_primo_sintomo_seconda_dose___ne;
    }

    public Boolean getOre_primo_sintomo_seconda_dose___null() {
        return ore_primo_sintomo_seconda_dose___null;
    }
    public void setOre_primo_sintomo_seconda_dose___null(Boolean ore_primo_sintomo_seconda_dose___null) {
        this.ore_primo_sintomo_seconda_dose___null = ore_primo_sintomo_seconda_dose___null;
    }

    public Boolean getOre_primo_sintomo_seconda_dose___not___null() {
        return ore_primo_sintomo_seconda_dose___not___null;
    }
    public void setOre_primo_sintomo_seconda_dose___not___null(Boolean ore_primo_sintomo_seconda_dose___not___null) {
        this.ore_primo_sintomo_seconda_dose___not___null = ore_primo_sintomo_seconda_dose___not___null;
    }

    public java.util.List<String> getOre_primo_sintomo_seconda_dose___in() {
        return ore_primo_sintomo_seconda_dose___in;
    }
    public void setOre_primo_sintomo_seconda_dose___in(java.util.List<String> ore_primo_sintomo_seconda_dose___in) {
        this.ore_primo_sintomo_seconda_dose___in = ore_primo_sintomo_seconda_dose___in;
    }

    public java.util.List<String> getOre_primo_sintomo_seconda_dose___not___in() {
        return ore_primo_sintomo_seconda_dose___not___in;
    }
    public void setOre_primo_sintomo_seconda_dose___not___in(java.util.List<String> ore_primo_sintomo_seconda_dose___not___in) {
        this.ore_primo_sintomo_seconda_dose___not___in = ore_primo_sintomo_seconda_dose___not___in;
    }

    public String getOre_primo_sintomo_seconda_dose___lt() {
        return ore_primo_sintomo_seconda_dose___lt;
    }
    public void setOre_primo_sintomo_seconda_dose___lt(String ore_primo_sintomo_seconda_dose___lt) {
        this.ore_primo_sintomo_seconda_dose___lt = ore_primo_sintomo_seconda_dose___lt;
    }

    public String getOre_primo_sintomo_seconda_dose___lte() {
        return ore_primo_sintomo_seconda_dose___lte;
    }
    public void setOre_primo_sintomo_seconda_dose___lte(String ore_primo_sintomo_seconda_dose___lte) {
        this.ore_primo_sintomo_seconda_dose___lte = ore_primo_sintomo_seconda_dose___lte;
    }

    public String getOre_primo_sintomo_seconda_dose___gt() {
        return ore_primo_sintomo_seconda_dose___gt;
    }
    public void setOre_primo_sintomo_seconda_dose___gt(String ore_primo_sintomo_seconda_dose___gt) {
        this.ore_primo_sintomo_seconda_dose___gt = ore_primo_sintomo_seconda_dose___gt;
    }

    public String getOre_primo_sintomo_seconda_dose___gte() {
        return ore_primo_sintomo_seconda_dose___gte;
    }
    public void setOre_primo_sintomo_seconda_dose___gte(String ore_primo_sintomo_seconda_dose___gte) {
        this.ore_primo_sintomo_seconda_dose___gte = ore_primo_sintomo_seconda_dose___gte;
    }

    public Boolean getOspedale_prima_dose___eq() {
        return ospedale_prima_dose___eq;
    }
    public void setOspedale_prima_dose___eq(Boolean ospedale_prima_dose___eq) {
        this.ospedale_prima_dose___eq = ospedale_prima_dose___eq;
    }

    public Boolean getOspedale_prima_dose___ne() {
        return ospedale_prima_dose___ne;
    }
    public void setOspedale_prima_dose___ne(Boolean ospedale_prima_dose___ne) {
        this.ospedale_prima_dose___ne = ospedale_prima_dose___ne;
    }

    public Boolean getOspedale_prima_dose___null() {
        return ospedale_prima_dose___null;
    }
    public void setOspedale_prima_dose___null(Boolean ospedale_prima_dose___null) {
        this.ospedale_prima_dose___null = ospedale_prima_dose___null;
    }

    public Boolean getOspedale_prima_dose___not___null() {
        return ospedale_prima_dose___not___null;
    }
    public void setOspedale_prima_dose___not___null(Boolean ospedale_prima_dose___not___null) {
        this.ospedale_prima_dose___not___null = ospedale_prima_dose___not___null;
    }

    public Boolean getOspedale_seconda_dose___eq() {
        return ospedale_seconda_dose___eq;
    }
    public void setOspedale_seconda_dose___eq(Boolean ospedale_seconda_dose___eq) {
        this.ospedale_seconda_dose___eq = ospedale_seconda_dose___eq;
    }

    public Boolean getOspedale_seconda_dose___ne() {
        return ospedale_seconda_dose___ne;
    }
    public void setOspedale_seconda_dose___ne(Boolean ospedale_seconda_dose___ne) {
        this.ospedale_seconda_dose___ne = ospedale_seconda_dose___ne;
    }

    public Boolean getOspedale_seconda_dose___null() {
        return ospedale_seconda_dose___null;
    }
    public void setOspedale_seconda_dose___null(Boolean ospedale_seconda_dose___null) {
        this.ospedale_seconda_dose___null = ospedale_seconda_dose___null;
    }

    public Boolean getOspedale_seconda_dose___not___null() {
        return ospedale_seconda_dose___not___null;
    }
    public void setOspedale_seconda_dose___not___null(Boolean ospedale_seconda_dose___not___null) {
        this.ospedale_seconda_dose___not___null = ospedale_seconda_dose___not___null;
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

    public Boolean getSeconda_dose___eq() {
        return seconda_dose___eq;
    }
    public void setSeconda_dose___eq(Boolean seconda_dose___eq) {
        this.seconda_dose___eq = seconda_dose___eq;
    }

    public Boolean getSeconda_dose___ne() {
        return seconda_dose___ne;
    }
    public void setSeconda_dose___ne(Boolean seconda_dose___ne) {
        this.seconda_dose___ne = seconda_dose___ne;
    }

    public Boolean getSeconda_dose___null() {
        return seconda_dose___null;
    }
    public void setSeconda_dose___null(Boolean seconda_dose___null) {
        this.seconda_dose___null = seconda_dose___null;
    }

    public Boolean getSeconda_dose___not___null() {
        return seconda_dose___not___null;
    }
    public void setSeconda_dose___not___null(Boolean seconda_dose___not___null) {
        this.seconda_dose___not___null = seconda_dose___not___null;
    }

    public Boolean getTerapia_corticoster___eq() {
        return terapia_corticoster___eq;
    }
    public void setTerapia_corticoster___eq(Boolean terapia_corticoster___eq) {
        this.terapia_corticoster___eq = terapia_corticoster___eq;
    }

    public Boolean getTerapia_corticoster___ne() {
        return terapia_corticoster___ne;
    }
    public void setTerapia_corticoster___ne(Boolean terapia_corticoster___ne) {
        this.terapia_corticoster___ne = terapia_corticoster___ne;
    }

    public Boolean getTerapia_corticoster___null() {
        return terapia_corticoster___null;
    }
    public void setTerapia_corticoster___null(Boolean terapia_corticoster___null) {
        this.terapia_corticoster___null = terapia_corticoster___null;
    }

    public Boolean getTerapia_corticoster___not___null() {
        return terapia_corticoster___not___null;
    }
    public void setTerapia_corticoster___not___null(Boolean terapia_corticoster___not___null) {
        this.terapia_corticoster___not___null = terapia_corticoster___not___null;
    }

    public Boolean getTerapia_immunosopp___eq() {
        return terapia_immunosopp___eq;
    }
    public void setTerapia_immunosopp___eq(Boolean terapia_immunosopp___eq) {
        this.terapia_immunosopp___eq = terapia_immunosopp___eq;
    }

    public Boolean getTerapia_immunosopp___ne() {
        return terapia_immunosopp___ne;
    }
    public void setTerapia_immunosopp___ne(Boolean terapia_immunosopp___ne) {
        this.terapia_immunosopp___ne = terapia_immunosopp___ne;
    }

    public Boolean getTerapia_immunosopp___null() {
        return terapia_immunosopp___null;
    }
    public void setTerapia_immunosopp___null(Boolean terapia_immunosopp___null) {
        this.terapia_immunosopp___null = terapia_immunosopp___null;
    }

    public Boolean getTerapia_immunosopp___not___null() {
        return terapia_immunosopp___not___null;
    }
    public void setTerapia_immunosopp___not___null(Boolean terapia_immunosopp___not___null) {
        this.terapia_immunosopp___not___null = terapia_immunosopp___not___null;
    }

    public String getTerapia_immunosopp_desc___eq() {
        return terapia_immunosopp_desc___eq;
    }
    public void setTerapia_immunosopp_desc___eq(String terapia_immunosopp_desc___eq) {
        this.terapia_immunosopp_desc___eq = terapia_immunosopp_desc___eq;
    }

    public String getTerapia_immunosopp_desc___ne() {
        return terapia_immunosopp_desc___ne;
    }
    public void setTerapia_immunosopp_desc___ne(String terapia_immunosopp_desc___ne) {
        this.terapia_immunosopp_desc___ne = terapia_immunosopp_desc___ne;
    }

    public Boolean getTerapia_immunosopp_desc___null() {
        return terapia_immunosopp_desc___null;
    }
    public void setTerapia_immunosopp_desc___null(Boolean terapia_immunosopp_desc___null) {
        this.terapia_immunosopp_desc___null = terapia_immunosopp_desc___null;
    }

    public Boolean getTerapia_immunosopp_desc___not___null() {
        return terapia_immunosopp_desc___not___null;
    }
    public void setTerapia_immunosopp_desc___not___null(Boolean terapia_immunosopp_desc___not___null) {
        this.terapia_immunosopp_desc___not___null = terapia_immunosopp_desc___not___null;
    }

    public java.util.List<String> getTerapia_immunosopp_desc___in() {
        return terapia_immunosopp_desc___in;
    }
    public void setTerapia_immunosopp_desc___in(java.util.List<String> terapia_immunosopp_desc___in) {
        this.terapia_immunosopp_desc___in = terapia_immunosopp_desc___in;
    }

    public java.util.List<String> getTerapia_immunosopp_desc___not___in() {
        return terapia_immunosopp_desc___not___in;
    }
    public void setTerapia_immunosopp_desc___not___in(java.util.List<String> terapia_immunosopp_desc___not___in) {
        this.terapia_immunosopp_desc___not___in = terapia_immunosopp_desc___not___in;
    }

    public String getTerapia_immunosopp_desc___lt() {
        return terapia_immunosopp_desc___lt;
    }
    public void setTerapia_immunosopp_desc___lt(String terapia_immunosopp_desc___lt) {
        this.terapia_immunosopp_desc___lt = terapia_immunosopp_desc___lt;
    }

    public String getTerapia_immunosopp_desc___lte() {
        return terapia_immunosopp_desc___lte;
    }
    public void setTerapia_immunosopp_desc___lte(String terapia_immunosopp_desc___lte) {
        this.terapia_immunosopp_desc___lte = terapia_immunosopp_desc___lte;
    }

    public String getTerapia_immunosopp_desc___gt() {
        return terapia_immunosopp_desc___gt;
    }
    public void setTerapia_immunosopp_desc___gt(String terapia_immunosopp_desc___gt) {
        this.terapia_immunosopp_desc___gt = terapia_immunosopp_desc___gt;
    }

    public String getTerapia_immunosopp_desc___gte() {
        return terapia_immunosopp_desc___gte;
    }
    public void setTerapia_immunosopp_desc___gte(String terapia_immunosopp_desc___gte) {
        this.terapia_immunosopp_desc___gte = terapia_immunosopp_desc___gte;
    }

    public String getTerapia_immunosopp_desc___contains() {
        return terapia_immunosopp_desc___contains;
    }
    public void setTerapia_immunosopp_desc___contains(String terapia_immunosopp_desc___contains) {
        this.terapia_immunosopp_desc___contains = terapia_immunosopp_desc___contains;
    }

    public String getTerapia_immunosopp_desc___not___contains() {
        return terapia_immunosopp_desc___not___contains;
    }
    public void setTerapia_immunosopp_desc___not___contains(String terapia_immunosopp_desc___not___contains) {
        this.terapia_immunosopp_desc___not___contains = terapia_immunosopp_desc___not___contains;
    }

    public String getTerapia_immunosopp_desc___starts_with() {
        return terapia_immunosopp_desc___starts_with;
    }
    public void setTerapia_immunosopp_desc___starts_with(String terapia_immunosopp_desc___starts_with) {
        this.terapia_immunosopp_desc___starts_with = terapia_immunosopp_desc___starts_with;
    }

    public String getTerapia_immunosopp_desc___not___starts_with() {
        return terapia_immunosopp_desc___not___starts_with;
    }
    public void setTerapia_immunosopp_desc___not___starts_with(String terapia_immunosopp_desc___not___starts_with) {
        this.terapia_immunosopp_desc___not___starts_with = terapia_immunosopp_desc___not___starts_with;
    }

    public String getTerapia_immunosopp_desc___ends_with() {
        return terapia_immunosopp_desc___ends_with;
    }
    public void setTerapia_immunosopp_desc___ends_with(String terapia_immunosopp_desc___ends_with) {
        this.terapia_immunosopp_desc___ends_with = terapia_immunosopp_desc___ends_with;
    }

    public String getTerapia_immunosopp_desc___not___ends_with() {
        return terapia_immunosopp_desc___not___ends_with;
    }
    public void setTerapia_immunosopp_desc___not___ends_with(String terapia_immunosopp_desc___not___ends_with) {
        this.terapia_immunosopp_desc___not___ends_with = terapia_immunosopp_desc___not___ends_with;
    }

    public Boolean getVax_ico___eq() {
        return vax_ico___eq;
    }
    public void setVax_ico___eq(Boolean vax_ico___eq) {
        this.vax_ico___eq = vax_ico___eq;
    }

    public Boolean getVax_ico___ne() {
        return vax_ico___ne;
    }
    public void setVax_ico___ne(Boolean vax_ico___ne) {
        this.vax_ico___ne = vax_ico___ne;
    }

    public Boolean getVax_ico___null() {
        return vax_ico___null;
    }
    public void setVax_ico___null(Boolean vax_ico___null) {
        this.vax_ico___null = vax_ico___null;
    }

    public Boolean getVax_ico___not___null() {
        return vax_ico___not___null;
    }
    public void setVax_ico___not___null(Boolean vax_ico___not___null) {
        this.vax_ico___not___null = vax_ico___not___null;
    }

    public java.util.List<CliV_dettaglioFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliV_dettaglioFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliV_dettaglioFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliV_dettaglioFilterDTO> OR) {
        this.OR = OR;
    }

    public CliV_dettaglioFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliV_dettaglioFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
        }
        if (_createdon___eq != null) {
            joiner.add("_createdon___eq: " + GraphQLRequestSerializer.getEntry(_createdon___eq));
        }
        if (_createdon___ne != null) {
            joiner.add("_createdon___ne: " + GraphQLRequestSerializer.getEntry(_createdon___ne));
        }
        if (_createdon___null != null) {
            joiner.add("_createdon___null: " + GraphQLRequestSerializer.getEntry(_createdon___null));
        }
        if (_createdon___not___null != null) {
            joiner.add("_createdon___not___null: " + GraphQLRequestSerializer.getEntry(_createdon___not___null));
        }
        if (_createdon___in != null) {
            joiner.add("_createdon___in: " + GraphQLRequestSerializer.getEntry(_createdon___in));
        }
        if (_createdon___not___in != null) {
            joiner.add("_createdon___not___in: " + GraphQLRequestSerializer.getEntry(_createdon___not___in));
        }
        if (_createdon___lt != null) {
            joiner.add("_createdon___lt: " + GraphQLRequestSerializer.getEntry(_createdon___lt));
        }
        if (_createdon___lte != null) {
            joiner.add("_createdon___lte: " + GraphQLRequestSerializer.getEntry(_createdon___lte));
        }
        if (_createdon___gt != null) {
            joiner.add("_createdon___gt: " + GraphQLRequestSerializer.getEntry(_createdon___gt));
        }
        if (_createdon___gte != null) {
            joiner.add("_createdon___gte: " + GraphQLRequestSerializer.getEntry(_createdon___gte));
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
        if (altro_evento_prima_dose___eq != null) {
            joiner.add("altro_evento_prima_dose___eq: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___eq));
        }
        if (altro_evento_prima_dose___ne != null) {
            joiner.add("altro_evento_prima_dose___ne: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___ne));
        }
        if (altro_evento_prima_dose___null != null) {
            joiner.add("altro_evento_prima_dose___null: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___null));
        }
        if (altro_evento_prima_dose___not___null != null) {
            joiner.add("altro_evento_prima_dose___not___null: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___not___null));
        }
        if (altro_evento_prima_dose___in != null) {
            joiner.add("altro_evento_prima_dose___in: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___in));
        }
        if (altro_evento_prima_dose___not___in != null) {
            joiner.add("altro_evento_prima_dose___not___in: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___not___in));
        }
        if (altro_evento_prima_dose___lt != null) {
            joiner.add("altro_evento_prima_dose___lt: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___lt));
        }
        if (altro_evento_prima_dose___lte != null) {
            joiner.add("altro_evento_prima_dose___lte: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___lte));
        }
        if (altro_evento_prima_dose___gt != null) {
            joiner.add("altro_evento_prima_dose___gt: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___gt));
        }
        if (altro_evento_prima_dose___gte != null) {
            joiner.add("altro_evento_prima_dose___gte: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___gte));
        }
        if (altro_evento_prima_dose___contains != null) {
            joiner.add("altro_evento_prima_dose___contains: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___contains));
        }
        if (altro_evento_prima_dose___not___contains != null) {
            joiner.add("altro_evento_prima_dose___not___contains: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___not___contains));
        }
        if (altro_evento_prima_dose___starts_with != null) {
            joiner.add("altro_evento_prima_dose___starts_with: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___starts_with));
        }
        if (altro_evento_prima_dose___not___starts_with != null) {
            joiner.add("altro_evento_prima_dose___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___not___starts_with));
        }
        if (altro_evento_prima_dose___ends_with != null) {
            joiner.add("altro_evento_prima_dose___ends_with: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___ends_with));
        }
        if (altro_evento_prima_dose___not___ends_with != null) {
            joiner.add("altro_evento_prima_dose___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose___not___ends_with));
        }
        if (altro_evento_seconda_dose___eq != null) {
            joiner.add("altro_evento_seconda_dose___eq: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___eq));
        }
        if (altro_evento_seconda_dose___ne != null) {
            joiner.add("altro_evento_seconda_dose___ne: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___ne));
        }
        if (altro_evento_seconda_dose___null != null) {
            joiner.add("altro_evento_seconda_dose___null: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___null));
        }
        if (altro_evento_seconda_dose___not___null != null) {
            joiner.add("altro_evento_seconda_dose___not___null: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___not___null));
        }
        if (altro_evento_seconda_dose___in != null) {
            joiner.add("altro_evento_seconda_dose___in: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___in));
        }
        if (altro_evento_seconda_dose___not___in != null) {
            joiner.add("altro_evento_seconda_dose___not___in: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___not___in));
        }
        if (altro_evento_seconda_dose___lt != null) {
            joiner.add("altro_evento_seconda_dose___lt: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___lt));
        }
        if (altro_evento_seconda_dose___lte != null) {
            joiner.add("altro_evento_seconda_dose___lte: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___lte));
        }
        if (altro_evento_seconda_dose___gt != null) {
            joiner.add("altro_evento_seconda_dose___gt: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___gt));
        }
        if (altro_evento_seconda_dose___gte != null) {
            joiner.add("altro_evento_seconda_dose___gte: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___gte));
        }
        if (altro_evento_seconda_dose___contains != null) {
            joiner.add("altro_evento_seconda_dose___contains: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___contains));
        }
        if (altro_evento_seconda_dose___not___contains != null) {
            joiner.add("altro_evento_seconda_dose___not___contains: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___not___contains));
        }
        if (altro_evento_seconda_dose___starts_with != null) {
            joiner.add("altro_evento_seconda_dose___starts_with: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___starts_with));
        }
        if (altro_evento_seconda_dose___not___starts_with != null) {
            joiner.add("altro_evento_seconda_dose___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___not___starts_with));
        }
        if (altro_evento_seconda_dose___ends_with != null) {
            joiner.add("altro_evento_seconda_dose___ends_with: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___ends_with));
        }
        if (altro_evento_seconda_dose___not___ends_with != null) {
            joiner.add("altro_evento_seconda_dose___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose___not___ends_with));
        }
        if (altro_motivazione_seconda_dose___eq != null) {
            joiner.add("altro_motivazione_seconda_dose___eq: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___eq));
        }
        if (altro_motivazione_seconda_dose___ne != null) {
            joiner.add("altro_motivazione_seconda_dose___ne: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___ne));
        }
        if (altro_motivazione_seconda_dose___null != null) {
            joiner.add("altro_motivazione_seconda_dose___null: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___null));
        }
        if (altro_motivazione_seconda_dose___not___null != null) {
            joiner.add("altro_motivazione_seconda_dose___not___null: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___not___null));
        }
        if (altro_motivazione_seconda_dose___in != null) {
            joiner.add("altro_motivazione_seconda_dose___in: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___in));
        }
        if (altro_motivazione_seconda_dose___not___in != null) {
            joiner.add("altro_motivazione_seconda_dose___not___in: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___not___in));
        }
        if (altro_motivazione_seconda_dose___lt != null) {
            joiner.add("altro_motivazione_seconda_dose___lt: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___lt));
        }
        if (altro_motivazione_seconda_dose___lte != null) {
            joiner.add("altro_motivazione_seconda_dose___lte: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___lte));
        }
        if (altro_motivazione_seconda_dose___gt != null) {
            joiner.add("altro_motivazione_seconda_dose___gt: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___gt));
        }
        if (altro_motivazione_seconda_dose___gte != null) {
            joiner.add("altro_motivazione_seconda_dose___gte: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___gte));
        }
        if (altro_motivazione_seconda_dose___contains != null) {
            joiner.add("altro_motivazione_seconda_dose___contains: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___contains));
        }
        if (altro_motivazione_seconda_dose___not___contains != null) {
            joiner.add("altro_motivazione_seconda_dose___not___contains: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___not___contains));
        }
        if (altro_motivazione_seconda_dose___starts_with != null) {
            joiner.add("altro_motivazione_seconda_dose___starts_with: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___starts_with));
        }
        if (altro_motivazione_seconda_dose___not___starts_with != null) {
            joiner.add("altro_motivazione_seconda_dose___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___not___starts_with));
        }
        if (altro_motivazione_seconda_dose___ends_with != null) {
            joiner.add("altro_motivazione_seconda_dose___ends_with: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___ends_with));
        }
        if (altro_motivazione_seconda_dose___not___ends_with != null) {
            joiner.add("altro_motivazione_seconda_dose___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose___not___ends_with));
        }
        if (assenza_lavoro_prima_dose___eq != null) {
            joiner.add("assenza_lavoro_prima_dose___eq: " + GraphQLRequestSerializer.getEntry(assenza_lavoro_prima_dose___eq));
        }
        if (assenza_lavoro_prima_dose___ne != null) {
            joiner.add("assenza_lavoro_prima_dose___ne: " + GraphQLRequestSerializer.getEntry(assenza_lavoro_prima_dose___ne));
        }
        if (assenza_lavoro_prima_dose___null != null) {
            joiner.add("assenza_lavoro_prima_dose___null: " + GraphQLRequestSerializer.getEntry(assenza_lavoro_prima_dose___null));
        }
        if (assenza_lavoro_prima_dose___not___null != null) {
            joiner.add("assenza_lavoro_prima_dose___not___null: " + GraphQLRequestSerializer.getEntry(assenza_lavoro_prima_dose___not___null));
        }
        if (assenza_lavoro_seconda_dose___eq != null) {
            joiner.add("assenza_lavoro_seconda_dose___eq: " + GraphQLRequestSerializer.getEntry(assenza_lavoro_seconda_dose___eq));
        }
        if (assenza_lavoro_seconda_dose___ne != null) {
            joiner.add("assenza_lavoro_seconda_dose___ne: " + GraphQLRequestSerializer.getEntry(assenza_lavoro_seconda_dose___ne));
        }
        if (assenza_lavoro_seconda_dose___null != null) {
            joiner.add("assenza_lavoro_seconda_dose___null: " + GraphQLRequestSerializer.getEntry(assenza_lavoro_seconda_dose___null));
        }
        if (assenza_lavoro_seconda_dose___not___null != null) {
            joiner.add("assenza_lavoro_seconda_dose___not___null: " + GraphQLRequestSerializer.getEntry(assenza_lavoro_seconda_dose___not___null));
        }
        if (count_eventi_prima_dose___eq != null) {
            joiner.add("count_eventi_prima_dose___eq: " + GraphQLRequestSerializer.getEntry(count_eventi_prima_dose___eq));
        }
        if (count_eventi_prima_dose___ne != null) {
            joiner.add("count_eventi_prima_dose___ne: " + GraphQLRequestSerializer.getEntry(count_eventi_prima_dose___ne));
        }
        if (count_eventi_prima_dose___null != null) {
            joiner.add("count_eventi_prima_dose___null: " + GraphQLRequestSerializer.getEntry(count_eventi_prima_dose___null));
        }
        if (count_eventi_prima_dose___not___null != null) {
            joiner.add("count_eventi_prima_dose___not___null: " + GraphQLRequestSerializer.getEntry(count_eventi_prima_dose___not___null));
        }
        if (count_eventi_prima_dose___in != null) {
            joiner.add("count_eventi_prima_dose___in: " + GraphQLRequestSerializer.getEntry(count_eventi_prima_dose___in));
        }
        if (count_eventi_prima_dose___not___in != null) {
            joiner.add("count_eventi_prima_dose___not___in: " + GraphQLRequestSerializer.getEntry(count_eventi_prima_dose___not___in));
        }
        if (count_eventi_prima_dose___lt != null) {
            joiner.add("count_eventi_prima_dose___lt: " + GraphQLRequestSerializer.getEntry(count_eventi_prima_dose___lt));
        }
        if (count_eventi_prima_dose___lte != null) {
            joiner.add("count_eventi_prima_dose___lte: " + GraphQLRequestSerializer.getEntry(count_eventi_prima_dose___lte));
        }
        if (count_eventi_prima_dose___gt != null) {
            joiner.add("count_eventi_prima_dose___gt: " + GraphQLRequestSerializer.getEntry(count_eventi_prima_dose___gt));
        }
        if (count_eventi_prima_dose___gte != null) {
            joiner.add("count_eventi_prima_dose___gte: " + GraphQLRequestSerializer.getEntry(count_eventi_prima_dose___gte));
        }
        if (count_eventi_seconda_dose___eq != null) {
            joiner.add("count_eventi_seconda_dose___eq: " + GraphQLRequestSerializer.getEntry(count_eventi_seconda_dose___eq));
        }
        if (count_eventi_seconda_dose___ne != null) {
            joiner.add("count_eventi_seconda_dose___ne: " + GraphQLRequestSerializer.getEntry(count_eventi_seconda_dose___ne));
        }
        if (count_eventi_seconda_dose___null != null) {
            joiner.add("count_eventi_seconda_dose___null: " + GraphQLRequestSerializer.getEntry(count_eventi_seconda_dose___null));
        }
        if (count_eventi_seconda_dose___not___null != null) {
            joiner.add("count_eventi_seconda_dose___not___null: " + GraphQLRequestSerializer.getEntry(count_eventi_seconda_dose___not___null));
        }
        if (count_eventi_seconda_dose___in != null) {
            joiner.add("count_eventi_seconda_dose___in: " + GraphQLRequestSerializer.getEntry(count_eventi_seconda_dose___in));
        }
        if (count_eventi_seconda_dose___not___in != null) {
            joiner.add("count_eventi_seconda_dose___not___in: " + GraphQLRequestSerializer.getEntry(count_eventi_seconda_dose___not___in));
        }
        if (count_eventi_seconda_dose___lt != null) {
            joiner.add("count_eventi_seconda_dose___lt: " + GraphQLRequestSerializer.getEntry(count_eventi_seconda_dose___lt));
        }
        if (count_eventi_seconda_dose___lte != null) {
            joiner.add("count_eventi_seconda_dose___lte: " + GraphQLRequestSerializer.getEntry(count_eventi_seconda_dose___lte));
        }
        if (count_eventi_seconda_dose___gt != null) {
            joiner.add("count_eventi_seconda_dose___gt: " + GraphQLRequestSerializer.getEntry(count_eventi_seconda_dose___gt));
        }
        if (count_eventi_seconda_dose___gte != null) {
            joiner.add("count_eventi_seconda_dose___gte: " + GraphQLRequestSerializer.getEntry(count_eventi_seconda_dose___gte));
        }
        if (data_prima_dose___eq != null) {
            joiner.add("data_prima_dose___eq: " + GraphQLRequestSerializer.getEntry(data_prima_dose___eq));
        }
        if (data_prima_dose___ne != null) {
            joiner.add("data_prima_dose___ne: " + GraphQLRequestSerializer.getEntry(data_prima_dose___ne));
        }
        if (data_prima_dose___null != null) {
            joiner.add("data_prima_dose___null: " + GraphQLRequestSerializer.getEntry(data_prima_dose___null));
        }
        if (data_prima_dose___not___null != null) {
            joiner.add("data_prima_dose___not___null: " + GraphQLRequestSerializer.getEntry(data_prima_dose___not___null));
        }
        if (data_prima_dose___in != null) {
            joiner.add("data_prima_dose___in: " + GraphQLRequestSerializer.getEntry(data_prima_dose___in));
        }
        if (data_prima_dose___not___in != null) {
            joiner.add("data_prima_dose___not___in: " + GraphQLRequestSerializer.getEntry(data_prima_dose___not___in));
        }
        if (data_prima_dose___lt != null) {
            joiner.add("data_prima_dose___lt: " + GraphQLRequestSerializer.getEntry(data_prima_dose___lt));
        }
        if (data_prima_dose___lte != null) {
            joiner.add("data_prima_dose___lte: " + GraphQLRequestSerializer.getEntry(data_prima_dose___lte));
        }
        if (data_prima_dose___gt != null) {
            joiner.add("data_prima_dose___gt: " + GraphQLRequestSerializer.getEntry(data_prima_dose___gt));
        }
        if (data_prima_dose___gte != null) {
            joiner.add("data_prima_dose___gte: " + GraphQLRequestSerializer.getEntry(data_prima_dose___gte));
        }
        if (data_primo_tampone___eq != null) {
            joiner.add("data_primo_tampone___eq: " + GraphQLRequestSerializer.getEntry(data_primo_tampone___eq));
        }
        if (data_primo_tampone___ne != null) {
            joiner.add("data_primo_tampone___ne: " + GraphQLRequestSerializer.getEntry(data_primo_tampone___ne));
        }
        if (data_primo_tampone___null != null) {
            joiner.add("data_primo_tampone___null: " + GraphQLRequestSerializer.getEntry(data_primo_tampone___null));
        }
        if (data_primo_tampone___not___null != null) {
            joiner.add("data_primo_tampone___not___null: " + GraphQLRequestSerializer.getEntry(data_primo_tampone___not___null));
        }
        if (data_primo_tampone___in != null) {
            joiner.add("data_primo_tampone___in: " + GraphQLRequestSerializer.getEntry(data_primo_tampone___in));
        }
        if (data_primo_tampone___not___in != null) {
            joiner.add("data_primo_tampone___not___in: " + GraphQLRequestSerializer.getEntry(data_primo_tampone___not___in));
        }
        if (data_primo_tampone___lt != null) {
            joiner.add("data_primo_tampone___lt: " + GraphQLRequestSerializer.getEntry(data_primo_tampone___lt));
        }
        if (data_primo_tampone___lte != null) {
            joiner.add("data_primo_tampone___lte: " + GraphQLRequestSerializer.getEntry(data_primo_tampone___lte));
        }
        if (data_primo_tampone___gt != null) {
            joiner.add("data_primo_tampone___gt: " + GraphQLRequestSerializer.getEntry(data_primo_tampone___gt));
        }
        if (data_primo_tampone___gte != null) {
            joiner.add("data_primo_tampone___gte: " + GraphQLRequestSerializer.getEntry(data_primo_tampone___gte));
        }
        if (data_primo_tampone_post___eq != null) {
            joiner.add("data_primo_tampone_post___eq: " + GraphQLRequestSerializer.getEntry(data_primo_tampone_post___eq));
        }
        if (data_primo_tampone_post___ne != null) {
            joiner.add("data_primo_tampone_post___ne: " + GraphQLRequestSerializer.getEntry(data_primo_tampone_post___ne));
        }
        if (data_primo_tampone_post___null != null) {
            joiner.add("data_primo_tampone_post___null: " + GraphQLRequestSerializer.getEntry(data_primo_tampone_post___null));
        }
        if (data_primo_tampone_post___not___null != null) {
            joiner.add("data_primo_tampone_post___not___null: " + GraphQLRequestSerializer.getEntry(data_primo_tampone_post___not___null));
        }
        if (data_primo_tampone_post___in != null) {
            joiner.add("data_primo_tampone_post___in: " + GraphQLRequestSerializer.getEntry(data_primo_tampone_post___in));
        }
        if (data_primo_tampone_post___not___in != null) {
            joiner.add("data_primo_tampone_post___not___in: " + GraphQLRequestSerializer.getEntry(data_primo_tampone_post___not___in));
        }
        if (data_primo_tampone_post___lt != null) {
            joiner.add("data_primo_tampone_post___lt: " + GraphQLRequestSerializer.getEntry(data_primo_tampone_post___lt));
        }
        if (data_primo_tampone_post___lte != null) {
            joiner.add("data_primo_tampone_post___lte: " + GraphQLRequestSerializer.getEntry(data_primo_tampone_post___lte));
        }
        if (data_primo_tampone_post___gt != null) {
            joiner.add("data_primo_tampone_post___gt: " + GraphQLRequestSerializer.getEntry(data_primo_tampone_post___gt));
        }
        if (data_primo_tampone_post___gte != null) {
            joiner.add("data_primo_tampone_post___gte: " + GraphQLRequestSerializer.getEntry(data_primo_tampone_post___gte));
        }
        if (data_seconda_dose___eq != null) {
            joiner.add("data_seconda_dose___eq: " + GraphQLRequestSerializer.getEntry(data_seconda_dose___eq));
        }
        if (data_seconda_dose___ne != null) {
            joiner.add("data_seconda_dose___ne: " + GraphQLRequestSerializer.getEntry(data_seconda_dose___ne));
        }
        if (data_seconda_dose___null != null) {
            joiner.add("data_seconda_dose___null: " + GraphQLRequestSerializer.getEntry(data_seconda_dose___null));
        }
        if (data_seconda_dose___not___null != null) {
            joiner.add("data_seconda_dose___not___null: " + GraphQLRequestSerializer.getEntry(data_seconda_dose___not___null));
        }
        if (data_seconda_dose___in != null) {
            joiner.add("data_seconda_dose___in: " + GraphQLRequestSerializer.getEntry(data_seconda_dose___in));
        }
        if (data_seconda_dose___not___in != null) {
            joiner.add("data_seconda_dose___not___in: " + GraphQLRequestSerializer.getEntry(data_seconda_dose___not___in));
        }
        if (data_seconda_dose___lt != null) {
            joiner.add("data_seconda_dose___lt: " + GraphQLRequestSerializer.getEntry(data_seconda_dose___lt));
        }
        if (data_seconda_dose___lte != null) {
            joiner.add("data_seconda_dose___lte: " + GraphQLRequestSerializer.getEntry(data_seconda_dose___lte));
        }
        if (data_seconda_dose___gt != null) {
            joiner.add("data_seconda_dose___gt: " + GraphQLRequestSerializer.getEntry(data_seconda_dose___gt));
        }
        if (data_seconda_dose___gte != null) {
            joiner.add("data_seconda_dose___gte: " + GraphQLRequestSerializer.getEntry(data_seconda_dose___gte));
        }
        if (decorso_infezione_covid___eq != null) {
            joiner.add("decorso_infezione_covid___eq: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___eq));
        }
        if (decorso_infezione_covid___ne != null) {
            joiner.add("decorso_infezione_covid___ne: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___ne));
        }
        if (decorso_infezione_covid___null != null) {
            joiner.add("decorso_infezione_covid___null: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___null));
        }
        if (decorso_infezione_covid___not___null != null) {
            joiner.add("decorso_infezione_covid___not___null: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___not___null));
        }
        if (decorso_infezione_covid___in != null) {
            joiner.add("decorso_infezione_covid___in: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___in));
        }
        if (decorso_infezione_covid___not___in != null) {
            joiner.add("decorso_infezione_covid___not___in: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___not___in));
        }
        if (decorso_infezione_covid___lt != null) {
            joiner.add("decorso_infezione_covid___lt: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___lt));
        }
        if (decorso_infezione_covid___lte != null) {
            joiner.add("decorso_infezione_covid___lte: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___lte));
        }
        if (decorso_infezione_covid___gt != null) {
            joiner.add("decorso_infezione_covid___gt: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___gt));
        }
        if (decorso_infezione_covid___gte != null) {
            joiner.add("decorso_infezione_covid___gte: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___gte));
        }
        if (decorso_infezione_covid___contains != null) {
            joiner.add("decorso_infezione_covid___contains: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___contains));
        }
        if (decorso_infezione_covid___not___contains != null) {
            joiner.add("decorso_infezione_covid___not___contains: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___not___contains));
        }
        if (decorso_infezione_covid___starts_with != null) {
            joiner.add("decorso_infezione_covid___starts_with: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___starts_with));
        }
        if (decorso_infezione_covid___not___starts_with != null) {
            joiner.add("decorso_infezione_covid___not___starts_with: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___not___starts_with));
        }
        if (decorso_infezione_covid___ends_with != null) {
            joiner.add("decorso_infezione_covid___ends_with: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___ends_with));
        }
        if (decorso_infezione_covid___not___ends_with != null) {
            joiner.add("decorso_infezione_covid___not___ends_with: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid___not___ends_with));
        }
        if (decorso_infezione_covid_post___eq != null) {
            joiner.add("decorso_infezione_covid_post___eq: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___eq));
        }
        if (decorso_infezione_covid_post___ne != null) {
            joiner.add("decorso_infezione_covid_post___ne: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___ne));
        }
        if (decorso_infezione_covid_post___null != null) {
            joiner.add("decorso_infezione_covid_post___null: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___null));
        }
        if (decorso_infezione_covid_post___not___null != null) {
            joiner.add("decorso_infezione_covid_post___not___null: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___not___null));
        }
        if (decorso_infezione_covid_post___in != null) {
            joiner.add("decorso_infezione_covid_post___in: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___in));
        }
        if (decorso_infezione_covid_post___not___in != null) {
            joiner.add("decorso_infezione_covid_post___not___in: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___not___in));
        }
        if (decorso_infezione_covid_post___lt != null) {
            joiner.add("decorso_infezione_covid_post___lt: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___lt));
        }
        if (decorso_infezione_covid_post___lte != null) {
            joiner.add("decorso_infezione_covid_post___lte: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___lte));
        }
        if (decorso_infezione_covid_post___gt != null) {
            joiner.add("decorso_infezione_covid_post___gt: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___gt));
        }
        if (decorso_infezione_covid_post___gte != null) {
            joiner.add("decorso_infezione_covid_post___gte: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___gte));
        }
        if (decorso_infezione_covid_post___contains != null) {
            joiner.add("decorso_infezione_covid_post___contains: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___contains));
        }
        if (decorso_infezione_covid_post___not___contains != null) {
            joiner.add("decorso_infezione_covid_post___not___contains: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___not___contains));
        }
        if (decorso_infezione_covid_post___starts_with != null) {
            joiner.add("decorso_infezione_covid_post___starts_with: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___starts_with));
        }
        if (decorso_infezione_covid_post___not___starts_with != null) {
            joiner.add("decorso_infezione_covid_post___not___starts_with: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___not___starts_with));
        }
        if (decorso_infezione_covid_post___ends_with != null) {
            joiner.add("decorso_infezione_covid_post___ends_with: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___ends_with));
        }
        if (decorso_infezione_covid_post___not___ends_with != null) {
            joiner.add("decorso_infezione_covid_post___not___ends_with: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post___not___ends_with));
        }
        if (dosi_vaccino_covid___eq != null) {
            joiner.add("dosi_vaccino_covid___eq: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___eq));
        }
        if (dosi_vaccino_covid___ne != null) {
            joiner.add("dosi_vaccino_covid___ne: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___ne));
        }
        if (dosi_vaccino_covid___null != null) {
            joiner.add("dosi_vaccino_covid___null: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___null));
        }
        if (dosi_vaccino_covid___not___null != null) {
            joiner.add("dosi_vaccino_covid___not___null: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___not___null));
        }
        if (dosi_vaccino_covid___in != null) {
            joiner.add("dosi_vaccino_covid___in: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___in));
        }
        if (dosi_vaccino_covid___not___in != null) {
            joiner.add("dosi_vaccino_covid___not___in: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___not___in));
        }
        if (dosi_vaccino_covid___lt != null) {
            joiner.add("dosi_vaccino_covid___lt: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___lt));
        }
        if (dosi_vaccino_covid___lte != null) {
            joiner.add("dosi_vaccino_covid___lte: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___lte));
        }
        if (dosi_vaccino_covid___gt != null) {
            joiner.add("dosi_vaccino_covid___gt: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___gt));
        }
        if (dosi_vaccino_covid___gte != null) {
            joiner.add("dosi_vaccino_covid___gte: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___gte));
        }
        if (dosi_vaccino_covid___contains != null) {
            joiner.add("dosi_vaccino_covid___contains: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___contains));
        }
        if (dosi_vaccino_covid___not___contains != null) {
            joiner.add("dosi_vaccino_covid___not___contains: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___not___contains));
        }
        if (dosi_vaccino_covid___starts_with != null) {
            joiner.add("dosi_vaccino_covid___starts_with: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___starts_with));
        }
        if (dosi_vaccino_covid___not___starts_with != null) {
            joiner.add("dosi_vaccino_covid___not___starts_with: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___not___starts_with));
        }
        if (dosi_vaccino_covid___ends_with != null) {
            joiner.add("dosi_vaccino_covid___ends_with: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___ends_with));
        }
        if (dosi_vaccino_covid___not___ends_with != null) {
            joiner.add("dosi_vaccino_covid___not___ends_with: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid___not___ends_with));
        }
        if (farmaci_prima_dose_bool___eq != null) {
            joiner.add("farmaci_prima_dose_bool___eq: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_bool___eq));
        }
        if (farmaci_prima_dose_bool___ne != null) {
            joiner.add("farmaci_prima_dose_bool___ne: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_bool___ne));
        }
        if (farmaci_prima_dose_bool___null != null) {
            joiner.add("farmaci_prima_dose_bool___null: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_bool___null));
        }
        if (farmaci_prima_dose_bool___not___null != null) {
            joiner.add("farmaci_prima_dose_bool___not___null: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_bool___not___null));
        }
        if (farmaci_prima_dose_text___eq != null) {
            joiner.add("farmaci_prima_dose_text___eq: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___eq));
        }
        if (farmaci_prima_dose_text___ne != null) {
            joiner.add("farmaci_prima_dose_text___ne: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___ne));
        }
        if (farmaci_prima_dose_text___null != null) {
            joiner.add("farmaci_prima_dose_text___null: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___null));
        }
        if (farmaci_prima_dose_text___not___null != null) {
            joiner.add("farmaci_prima_dose_text___not___null: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___not___null));
        }
        if (farmaci_prima_dose_text___in != null) {
            joiner.add("farmaci_prima_dose_text___in: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___in));
        }
        if (farmaci_prima_dose_text___not___in != null) {
            joiner.add("farmaci_prima_dose_text___not___in: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___not___in));
        }
        if (farmaci_prima_dose_text___lt != null) {
            joiner.add("farmaci_prima_dose_text___lt: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___lt));
        }
        if (farmaci_prima_dose_text___lte != null) {
            joiner.add("farmaci_prima_dose_text___lte: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___lte));
        }
        if (farmaci_prima_dose_text___gt != null) {
            joiner.add("farmaci_prima_dose_text___gt: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___gt));
        }
        if (farmaci_prima_dose_text___gte != null) {
            joiner.add("farmaci_prima_dose_text___gte: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___gte));
        }
        if (farmaci_prima_dose_text___contains != null) {
            joiner.add("farmaci_prima_dose_text___contains: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___contains));
        }
        if (farmaci_prima_dose_text___not___contains != null) {
            joiner.add("farmaci_prima_dose_text___not___contains: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___not___contains));
        }
        if (farmaci_prima_dose_text___starts_with != null) {
            joiner.add("farmaci_prima_dose_text___starts_with: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___starts_with));
        }
        if (farmaci_prima_dose_text___not___starts_with != null) {
            joiner.add("farmaci_prima_dose_text___not___starts_with: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___not___starts_with));
        }
        if (farmaci_prima_dose_text___ends_with != null) {
            joiner.add("farmaci_prima_dose_text___ends_with: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___ends_with));
        }
        if (farmaci_prima_dose_text___not___ends_with != null) {
            joiner.add("farmaci_prima_dose_text___not___ends_with: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text___not___ends_with));
        }
        if (farmaci_seconda_dose_bool___eq != null) {
            joiner.add("farmaci_seconda_dose_bool___eq: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_bool___eq));
        }
        if (farmaci_seconda_dose_bool___ne != null) {
            joiner.add("farmaci_seconda_dose_bool___ne: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_bool___ne));
        }
        if (farmaci_seconda_dose_bool___null != null) {
            joiner.add("farmaci_seconda_dose_bool___null: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_bool___null));
        }
        if (farmaci_seconda_dose_bool___not___null != null) {
            joiner.add("farmaci_seconda_dose_bool___not___null: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_bool___not___null));
        }
        if (farmaci_seconda_dose_text___eq != null) {
            joiner.add("farmaci_seconda_dose_text___eq: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___eq));
        }
        if (farmaci_seconda_dose_text___ne != null) {
            joiner.add("farmaci_seconda_dose_text___ne: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___ne));
        }
        if (farmaci_seconda_dose_text___null != null) {
            joiner.add("farmaci_seconda_dose_text___null: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___null));
        }
        if (farmaci_seconda_dose_text___not___null != null) {
            joiner.add("farmaci_seconda_dose_text___not___null: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___not___null));
        }
        if (farmaci_seconda_dose_text___in != null) {
            joiner.add("farmaci_seconda_dose_text___in: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___in));
        }
        if (farmaci_seconda_dose_text___not___in != null) {
            joiner.add("farmaci_seconda_dose_text___not___in: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___not___in));
        }
        if (farmaci_seconda_dose_text___lt != null) {
            joiner.add("farmaci_seconda_dose_text___lt: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___lt));
        }
        if (farmaci_seconda_dose_text___lte != null) {
            joiner.add("farmaci_seconda_dose_text___lte: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___lte));
        }
        if (farmaci_seconda_dose_text___gt != null) {
            joiner.add("farmaci_seconda_dose_text___gt: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___gt));
        }
        if (farmaci_seconda_dose_text___gte != null) {
            joiner.add("farmaci_seconda_dose_text___gte: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___gte));
        }
        if (farmaci_seconda_dose_text___contains != null) {
            joiner.add("farmaci_seconda_dose_text___contains: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___contains));
        }
        if (farmaci_seconda_dose_text___not___contains != null) {
            joiner.add("farmaci_seconda_dose_text___not___contains: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___not___contains));
        }
        if (farmaci_seconda_dose_text___starts_with != null) {
            joiner.add("farmaci_seconda_dose_text___starts_with: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___starts_with));
        }
        if (farmaci_seconda_dose_text___not___starts_with != null) {
            joiner.add("farmaci_seconda_dose_text___not___starts_with: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___not___starts_with));
        }
        if (farmaci_seconda_dose_text___ends_with != null) {
            joiner.add("farmaci_seconda_dose_text___ends_with: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___ends_with));
        }
        if (farmaci_seconda_dose_text___not___ends_with != null) {
            joiner.add("farmaci_seconda_dose_text___not___ends_with: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text___not___ends_with));
        }
        if (imped_attivita_prima_dose___eq != null) {
            joiner.add("imped_attivita_prima_dose___eq: " + GraphQLRequestSerializer.getEntry(imped_attivita_prima_dose___eq));
        }
        if (imped_attivita_prima_dose___ne != null) {
            joiner.add("imped_attivita_prima_dose___ne: " + GraphQLRequestSerializer.getEntry(imped_attivita_prima_dose___ne));
        }
        if (imped_attivita_prima_dose___null != null) {
            joiner.add("imped_attivita_prima_dose___null: " + GraphQLRequestSerializer.getEntry(imped_attivita_prima_dose___null));
        }
        if (imped_attivita_prima_dose___not___null != null) {
            joiner.add("imped_attivita_prima_dose___not___null: " + GraphQLRequestSerializer.getEntry(imped_attivita_prima_dose___not___null));
        }
        if (imped_attivita_seconda_dose___eq != null) {
            joiner.add("imped_attivita_seconda_dose___eq: " + GraphQLRequestSerializer.getEntry(imped_attivita_seconda_dose___eq));
        }
        if (imped_attivita_seconda_dose___ne != null) {
            joiner.add("imped_attivita_seconda_dose___ne: " + GraphQLRequestSerializer.getEntry(imped_attivita_seconda_dose___ne));
        }
        if (imped_attivita_seconda_dose___null != null) {
            joiner.add("imped_attivita_seconda_dose___null: " + GraphQLRequestSerializer.getEntry(imped_attivita_seconda_dose___null));
        }
        if (imped_attivita_seconda_dose___not___null != null) {
            joiner.add("imped_attivita_seconda_dose___not___null: " + GraphQLRequestSerializer.getEntry(imped_attivita_seconda_dose___not___null));
        }
        if (infezione_covid___eq != null) {
            joiner.add("infezione_covid___eq: " + GraphQLRequestSerializer.getEntry(infezione_covid___eq));
        }
        if (infezione_covid___ne != null) {
            joiner.add("infezione_covid___ne: " + GraphQLRequestSerializer.getEntry(infezione_covid___ne));
        }
        if (infezione_covid___null != null) {
            joiner.add("infezione_covid___null: " + GraphQLRequestSerializer.getEntry(infezione_covid___null));
        }
        if (infezione_covid___not___null != null) {
            joiner.add("infezione_covid___not___null: " + GraphQLRequestSerializer.getEntry(infezione_covid___not___null));
        }
        if (infezione_covid_post___eq != null) {
            joiner.add("infezione_covid_post___eq: " + GraphQLRequestSerializer.getEntry(infezione_covid_post___eq));
        }
        if (infezione_covid_post___ne != null) {
            joiner.add("infezione_covid_post___ne: " + GraphQLRequestSerializer.getEntry(infezione_covid_post___ne));
        }
        if (infezione_covid_post___null != null) {
            joiner.add("infezione_covid_post___null: " + GraphQLRequestSerializer.getEntry(infezione_covid_post___null));
        }
        if (infezione_covid_post___not___null != null) {
            joiner.add("infezione_covid_post___not___null: " + GraphQLRequestSerializer.getEntry(infezione_covid_post___not___null));
        }
        if (intubazione___eq != null) {
            joiner.add("intubazione___eq: " + GraphQLRequestSerializer.getEntry(intubazione___eq));
        }
        if (intubazione___ne != null) {
            joiner.add("intubazione___ne: " + GraphQLRequestSerializer.getEntry(intubazione___ne));
        }
        if (intubazione___null != null) {
            joiner.add("intubazione___null: " + GraphQLRequestSerializer.getEntry(intubazione___null));
        }
        if (intubazione___not___null != null) {
            joiner.add("intubazione___not___null: " + GraphQLRequestSerializer.getEntry(intubazione___not___null));
        }
        if (ore_durata_sintomi_prima_dose___eq != null) {
            joiner.add("ore_durata_sintomi_prima_dose___eq: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose___eq));
        }
        if (ore_durata_sintomi_prima_dose___ne != null) {
            joiner.add("ore_durata_sintomi_prima_dose___ne: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose___ne));
        }
        if (ore_durata_sintomi_prima_dose___null != null) {
            joiner.add("ore_durata_sintomi_prima_dose___null: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose___null));
        }
        if (ore_durata_sintomi_prima_dose___not___null != null) {
            joiner.add("ore_durata_sintomi_prima_dose___not___null: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose___not___null));
        }
        if (ore_durata_sintomi_prima_dose___in != null) {
            joiner.add("ore_durata_sintomi_prima_dose___in: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose___in));
        }
        if (ore_durata_sintomi_prima_dose___not___in != null) {
            joiner.add("ore_durata_sintomi_prima_dose___not___in: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose___not___in));
        }
        if (ore_durata_sintomi_prima_dose___lt != null) {
            joiner.add("ore_durata_sintomi_prima_dose___lt: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose___lt));
        }
        if (ore_durata_sintomi_prima_dose___lte != null) {
            joiner.add("ore_durata_sintomi_prima_dose___lte: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose___lte));
        }
        if (ore_durata_sintomi_prima_dose___gt != null) {
            joiner.add("ore_durata_sintomi_prima_dose___gt: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose___gt));
        }
        if (ore_durata_sintomi_prima_dose___gte != null) {
            joiner.add("ore_durata_sintomi_prima_dose___gte: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose___gte));
        }
        if (ore_durata_sintomi_seconda_dose___eq != null) {
            joiner.add("ore_durata_sintomi_seconda_dose___eq: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_seconda_dose___eq));
        }
        if (ore_durata_sintomi_seconda_dose___ne != null) {
            joiner.add("ore_durata_sintomi_seconda_dose___ne: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_seconda_dose___ne));
        }
        if (ore_durata_sintomi_seconda_dose___null != null) {
            joiner.add("ore_durata_sintomi_seconda_dose___null: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_seconda_dose___null));
        }
        if (ore_durata_sintomi_seconda_dose___not___null != null) {
            joiner.add("ore_durata_sintomi_seconda_dose___not___null: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_seconda_dose___not___null));
        }
        if (ore_durata_sintomi_seconda_dose___in != null) {
            joiner.add("ore_durata_sintomi_seconda_dose___in: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_seconda_dose___in));
        }
        if (ore_durata_sintomi_seconda_dose___not___in != null) {
            joiner.add("ore_durata_sintomi_seconda_dose___not___in: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_seconda_dose___not___in));
        }
        if (ore_durata_sintomi_seconda_dose___lt != null) {
            joiner.add("ore_durata_sintomi_seconda_dose___lt: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_seconda_dose___lt));
        }
        if (ore_durata_sintomi_seconda_dose___lte != null) {
            joiner.add("ore_durata_sintomi_seconda_dose___lte: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_seconda_dose___lte));
        }
        if (ore_durata_sintomi_seconda_dose___gt != null) {
            joiner.add("ore_durata_sintomi_seconda_dose___gt: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_seconda_dose___gt));
        }
        if (ore_durata_sintomi_seconda_dose___gte != null) {
            joiner.add("ore_durata_sintomi_seconda_dose___gte: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_seconda_dose___gte));
        }
        if (ore_primo_sintomo_prima_dose___eq != null) {
            joiner.add("ore_primo_sintomo_prima_dose___eq: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose___eq));
        }
        if (ore_primo_sintomo_prima_dose___ne != null) {
            joiner.add("ore_primo_sintomo_prima_dose___ne: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose___ne));
        }
        if (ore_primo_sintomo_prima_dose___null != null) {
            joiner.add("ore_primo_sintomo_prima_dose___null: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose___null));
        }
        if (ore_primo_sintomo_prima_dose___not___null != null) {
            joiner.add("ore_primo_sintomo_prima_dose___not___null: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose___not___null));
        }
        if (ore_primo_sintomo_prima_dose___in != null) {
            joiner.add("ore_primo_sintomo_prima_dose___in: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose___in));
        }
        if (ore_primo_sintomo_prima_dose___not___in != null) {
            joiner.add("ore_primo_sintomo_prima_dose___not___in: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose___not___in));
        }
        if (ore_primo_sintomo_prima_dose___lt != null) {
            joiner.add("ore_primo_sintomo_prima_dose___lt: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose___lt));
        }
        if (ore_primo_sintomo_prima_dose___lte != null) {
            joiner.add("ore_primo_sintomo_prima_dose___lte: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose___lte));
        }
        if (ore_primo_sintomo_prima_dose___gt != null) {
            joiner.add("ore_primo_sintomo_prima_dose___gt: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose___gt));
        }
        if (ore_primo_sintomo_prima_dose___gte != null) {
            joiner.add("ore_primo_sintomo_prima_dose___gte: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose___gte));
        }
        if (ore_primo_sintomo_seconda_dose___eq != null) {
            joiner.add("ore_primo_sintomo_seconda_dose___eq: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_seconda_dose___eq));
        }
        if (ore_primo_sintomo_seconda_dose___ne != null) {
            joiner.add("ore_primo_sintomo_seconda_dose___ne: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_seconda_dose___ne));
        }
        if (ore_primo_sintomo_seconda_dose___null != null) {
            joiner.add("ore_primo_sintomo_seconda_dose___null: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_seconda_dose___null));
        }
        if (ore_primo_sintomo_seconda_dose___not___null != null) {
            joiner.add("ore_primo_sintomo_seconda_dose___not___null: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_seconda_dose___not___null));
        }
        if (ore_primo_sintomo_seconda_dose___in != null) {
            joiner.add("ore_primo_sintomo_seconda_dose___in: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_seconda_dose___in));
        }
        if (ore_primo_sintomo_seconda_dose___not___in != null) {
            joiner.add("ore_primo_sintomo_seconda_dose___not___in: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_seconda_dose___not___in));
        }
        if (ore_primo_sintomo_seconda_dose___lt != null) {
            joiner.add("ore_primo_sintomo_seconda_dose___lt: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_seconda_dose___lt));
        }
        if (ore_primo_sintomo_seconda_dose___lte != null) {
            joiner.add("ore_primo_sintomo_seconda_dose___lte: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_seconda_dose___lte));
        }
        if (ore_primo_sintomo_seconda_dose___gt != null) {
            joiner.add("ore_primo_sintomo_seconda_dose___gt: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_seconda_dose___gt));
        }
        if (ore_primo_sintomo_seconda_dose___gte != null) {
            joiner.add("ore_primo_sintomo_seconda_dose___gte: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_seconda_dose___gte));
        }
        if (ospedale_prima_dose___eq != null) {
            joiner.add("ospedale_prima_dose___eq: " + GraphQLRequestSerializer.getEntry(ospedale_prima_dose___eq));
        }
        if (ospedale_prima_dose___ne != null) {
            joiner.add("ospedale_prima_dose___ne: " + GraphQLRequestSerializer.getEntry(ospedale_prima_dose___ne));
        }
        if (ospedale_prima_dose___null != null) {
            joiner.add("ospedale_prima_dose___null: " + GraphQLRequestSerializer.getEntry(ospedale_prima_dose___null));
        }
        if (ospedale_prima_dose___not___null != null) {
            joiner.add("ospedale_prima_dose___not___null: " + GraphQLRequestSerializer.getEntry(ospedale_prima_dose___not___null));
        }
        if (ospedale_seconda_dose___eq != null) {
            joiner.add("ospedale_seconda_dose___eq: " + GraphQLRequestSerializer.getEntry(ospedale_seconda_dose___eq));
        }
        if (ospedale_seconda_dose___ne != null) {
            joiner.add("ospedale_seconda_dose___ne: " + GraphQLRequestSerializer.getEntry(ospedale_seconda_dose___ne));
        }
        if (ospedale_seconda_dose___null != null) {
            joiner.add("ospedale_seconda_dose___null: " + GraphQLRequestSerializer.getEntry(ospedale_seconda_dose___null));
        }
        if (ospedale_seconda_dose___not___null != null) {
            joiner.add("ospedale_seconda_dose___not___null: " + GraphQLRequestSerializer.getEntry(ospedale_seconda_dose___not___null));
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
        if (seconda_dose___eq != null) {
            joiner.add("seconda_dose___eq: " + GraphQLRequestSerializer.getEntry(seconda_dose___eq));
        }
        if (seconda_dose___ne != null) {
            joiner.add("seconda_dose___ne: " + GraphQLRequestSerializer.getEntry(seconda_dose___ne));
        }
        if (seconda_dose___null != null) {
            joiner.add("seconda_dose___null: " + GraphQLRequestSerializer.getEntry(seconda_dose___null));
        }
        if (seconda_dose___not___null != null) {
            joiner.add("seconda_dose___not___null: " + GraphQLRequestSerializer.getEntry(seconda_dose___not___null));
        }
        if (terapia_corticoster___eq != null) {
            joiner.add("terapia_corticoster___eq: " + GraphQLRequestSerializer.getEntry(terapia_corticoster___eq));
        }
        if (terapia_corticoster___ne != null) {
            joiner.add("terapia_corticoster___ne: " + GraphQLRequestSerializer.getEntry(terapia_corticoster___ne));
        }
        if (terapia_corticoster___null != null) {
            joiner.add("terapia_corticoster___null: " + GraphQLRequestSerializer.getEntry(terapia_corticoster___null));
        }
        if (terapia_corticoster___not___null != null) {
            joiner.add("terapia_corticoster___not___null: " + GraphQLRequestSerializer.getEntry(terapia_corticoster___not___null));
        }
        if (terapia_immunosopp___eq != null) {
            joiner.add("terapia_immunosopp___eq: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp___eq));
        }
        if (terapia_immunosopp___ne != null) {
            joiner.add("terapia_immunosopp___ne: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp___ne));
        }
        if (terapia_immunosopp___null != null) {
            joiner.add("terapia_immunosopp___null: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp___null));
        }
        if (terapia_immunosopp___not___null != null) {
            joiner.add("terapia_immunosopp___not___null: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp___not___null));
        }
        if (terapia_immunosopp_desc___eq != null) {
            joiner.add("terapia_immunosopp_desc___eq: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___eq));
        }
        if (terapia_immunosopp_desc___ne != null) {
            joiner.add("terapia_immunosopp_desc___ne: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___ne));
        }
        if (terapia_immunosopp_desc___null != null) {
            joiner.add("terapia_immunosopp_desc___null: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___null));
        }
        if (terapia_immunosopp_desc___not___null != null) {
            joiner.add("terapia_immunosopp_desc___not___null: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___not___null));
        }
        if (terapia_immunosopp_desc___in != null) {
            joiner.add("terapia_immunosopp_desc___in: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___in));
        }
        if (terapia_immunosopp_desc___not___in != null) {
            joiner.add("terapia_immunosopp_desc___not___in: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___not___in));
        }
        if (terapia_immunosopp_desc___lt != null) {
            joiner.add("terapia_immunosopp_desc___lt: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___lt));
        }
        if (terapia_immunosopp_desc___lte != null) {
            joiner.add("terapia_immunosopp_desc___lte: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___lte));
        }
        if (terapia_immunosopp_desc___gt != null) {
            joiner.add("terapia_immunosopp_desc___gt: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___gt));
        }
        if (terapia_immunosopp_desc___gte != null) {
            joiner.add("terapia_immunosopp_desc___gte: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___gte));
        }
        if (terapia_immunosopp_desc___contains != null) {
            joiner.add("terapia_immunosopp_desc___contains: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___contains));
        }
        if (terapia_immunosopp_desc___not___contains != null) {
            joiner.add("terapia_immunosopp_desc___not___contains: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___not___contains));
        }
        if (terapia_immunosopp_desc___starts_with != null) {
            joiner.add("terapia_immunosopp_desc___starts_with: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___starts_with));
        }
        if (terapia_immunosopp_desc___not___starts_with != null) {
            joiner.add("terapia_immunosopp_desc___not___starts_with: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___not___starts_with));
        }
        if (terapia_immunosopp_desc___ends_with != null) {
            joiner.add("terapia_immunosopp_desc___ends_with: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___ends_with));
        }
        if (terapia_immunosopp_desc___not___ends_with != null) {
            joiner.add("terapia_immunosopp_desc___not___ends_with: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc___not___ends_with));
        }
        if (vax_ico___eq != null) {
            joiner.add("vax_ico___eq: " + GraphQLRequestSerializer.getEntry(vax_ico___eq));
        }
        if (vax_ico___ne != null) {
            joiner.add("vax_ico___ne: " + GraphQLRequestSerializer.getEntry(vax_ico___ne));
        }
        if (vax_ico___null != null) {
            joiner.add("vax_ico___null: " + GraphQLRequestSerializer.getEntry(vax_ico___null));
        }
        if (vax_ico___not___null != null) {
            joiner.add("vax_ico___not___null: " + GraphQLRequestSerializer.getEntry(vax_ico___not___null));
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

    public static CliV_dettaglioFilterDTO.Builder builder() {
        return new CliV_dettaglioFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId___eq;
        private String _createdon___eq;
        private String _createdon___ne;
        private Boolean _createdon___null;
        private Boolean _createdon___not___null;
        private java.util.List<String> _createdon___in;
        private java.util.List<String> _createdon___not___in;
        private String _createdon___lt;
        private String _createdon___lte;
        private String _createdon___gt;
        private String _createdon___gte;
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
        private String altro_evento_prima_dose___eq;
        private String altro_evento_prima_dose___ne;
        private Boolean altro_evento_prima_dose___null;
        private Boolean altro_evento_prima_dose___not___null;
        private java.util.List<String> altro_evento_prima_dose___in;
        private java.util.List<String> altro_evento_prima_dose___not___in;
        private String altro_evento_prima_dose___lt;
        private String altro_evento_prima_dose___lte;
        private String altro_evento_prima_dose___gt;
        private String altro_evento_prima_dose___gte;
        private String altro_evento_prima_dose___contains;
        private String altro_evento_prima_dose___not___contains;
        private String altro_evento_prima_dose___starts_with;
        private String altro_evento_prima_dose___not___starts_with;
        private String altro_evento_prima_dose___ends_with;
        private String altro_evento_prima_dose___not___ends_with;
        private String altro_evento_seconda_dose___eq;
        private String altro_evento_seconda_dose___ne;
        private Boolean altro_evento_seconda_dose___null;
        private Boolean altro_evento_seconda_dose___not___null;
        private java.util.List<String> altro_evento_seconda_dose___in;
        private java.util.List<String> altro_evento_seconda_dose___not___in;
        private String altro_evento_seconda_dose___lt;
        private String altro_evento_seconda_dose___lte;
        private String altro_evento_seconda_dose___gt;
        private String altro_evento_seconda_dose___gte;
        private String altro_evento_seconda_dose___contains;
        private String altro_evento_seconda_dose___not___contains;
        private String altro_evento_seconda_dose___starts_with;
        private String altro_evento_seconda_dose___not___starts_with;
        private String altro_evento_seconda_dose___ends_with;
        private String altro_evento_seconda_dose___not___ends_with;
        private String altro_motivazione_seconda_dose___eq;
        private String altro_motivazione_seconda_dose___ne;
        private Boolean altro_motivazione_seconda_dose___null;
        private Boolean altro_motivazione_seconda_dose___not___null;
        private java.util.List<String> altro_motivazione_seconda_dose___in;
        private java.util.List<String> altro_motivazione_seconda_dose___not___in;
        private String altro_motivazione_seconda_dose___lt;
        private String altro_motivazione_seconda_dose___lte;
        private String altro_motivazione_seconda_dose___gt;
        private String altro_motivazione_seconda_dose___gte;
        private String altro_motivazione_seconda_dose___contains;
        private String altro_motivazione_seconda_dose___not___contains;
        private String altro_motivazione_seconda_dose___starts_with;
        private String altro_motivazione_seconda_dose___not___starts_with;
        private String altro_motivazione_seconda_dose___ends_with;
        private String altro_motivazione_seconda_dose___not___ends_with;
        private Boolean assenza_lavoro_prima_dose___eq;
        private Boolean assenza_lavoro_prima_dose___ne;
        private Boolean assenza_lavoro_prima_dose___null;
        private Boolean assenza_lavoro_prima_dose___not___null;
        private Boolean assenza_lavoro_seconda_dose___eq;
        private Boolean assenza_lavoro_seconda_dose___ne;
        private Boolean assenza_lavoro_seconda_dose___null;
        private Boolean assenza_lavoro_seconda_dose___not___null;
        private Integer count_eventi_prima_dose___eq;
        private Integer count_eventi_prima_dose___ne;
        private Boolean count_eventi_prima_dose___null;
        private Boolean count_eventi_prima_dose___not___null;
        private java.util.List<Integer> count_eventi_prima_dose___in;
        private java.util.List<Integer> count_eventi_prima_dose___not___in;
        private Integer count_eventi_prima_dose___lt;
        private Integer count_eventi_prima_dose___lte;
        private Integer count_eventi_prima_dose___gt;
        private Integer count_eventi_prima_dose___gte;
        private Integer count_eventi_seconda_dose___eq;
        private Integer count_eventi_seconda_dose___ne;
        private Boolean count_eventi_seconda_dose___null;
        private Boolean count_eventi_seconda_dose___not___null;
        private java.util.List<Integer> count_eventi_seconda_dose___in;
        private java.util.List<Integer> count_eventi_seconda_dose___not___in;
        private Integer count_eventi_seconda_dose___lt;
        private Integer count_eventi_seconda_dose___lte;
        private Integer count_eventi_seconda_dose___gt;
        private Integer count_eventi_seconda_dose___gte;
        private String data_prima_dose___eq;
        private String data_prima_dose___ne;
        private Boolean data_prima_dose___null;
        private Boolean data_prima_dose___not___null;
        private java.util.List<String> data_prima_dose___in;
        private java.util.List<String> data_prima_dose___not___in;
        private String data_prima_dose___lt;
        private String data_prima_dose___lte;
        private String data_prima_dose___gt;
        private String data_prima_dose___gte;
        private String data_primo_tampone___eq;
        private String data_primo_tampone___ne;
        private Boolean data_primo_tampone___null;
        private Boolean data_primo_tampone___not___null;
        private java.util.List<String> data_primo_tampone___in;
        private java.util.List<String> data_primo_tampone___not___in;
        private String data_primo_tampone___lt;
        private String data_primo_tampone___lte;
        private String data_primo_tampone___gt;
        private String data_primo_tampone___gte;
        private String data_primo_tampone_post___eq;
        private String data_primo_tampone_post___ne;
        private Boolean data_primo_tampone_post___null;
        private Boolean data_primo_tampone_post___not___null;
        private java.util.List<String> data_primo_tampone_post___in;
        private java.util.List<String> data_primo_tampone_post___not___in;
        private String data_primo_tampone_post___lt;
        private String data_primo_tampone_post___lte;
        private String data_primo_tampone_post___gt;
        private String data_primo_tampone_post___gte;
        private String data_seconda_dose___eq;
        private String data_seconda_dose___ne;
        private Boolean data_seconda_dose___null;
        private Boolean data_seconda_dose___not___null;
        private java.util.List<String> data_seconda_dose___in;
        private java.util.List<String> data_seconda_dose___not___in;
        private String data_seconda_dose___lt;
        private String data_seconda_dose___lte;
        private String data_seconda_dose___gt;
        private String data_seconda_dose___gte;
        private String decorso_infezione_covid___eq;
        private String decorso_infezione_covid___ne;
        private Boolean decorso_infezione_covid___null;
        private Boolean decorso_infezione_covid___not___null;
        private java.util.List<String> decorso_infezione_covid___in;
        private java.util.List<String> decorso_infezione_covid___not___in;
        private String decorso_infezione_covid___lt;
        private String decorso_infezione_covid___lte;
        private String decorso_infezione_covid___gt;
        private String decorso_infezione_covid___gte;
        private String decorso_infezione_covid___contains;
        private String decorso_infezione_covid___not___contains;
        private String decorso_infezione_covid___starts_with;
        private String decorso_infezione_covid___not___starts_with;
        private String decorso_infezione_covid___ends_with;
        private String decorso_infezione_covid___not___ends_with;
        private String decorso_infezione_covid_post___eq;
        private String decorso_infezione_covid_post___ne;
        private Boolean decorso_infezione_covid_post___null;
        private Boolean decorso_infezione_covid_post___not___null;
        private java.util.List<String> decorso_infezione_covid_post___in;
        private java.util.List<String> decorso_infezione_covid_post___not___in;
        private String decorso_infezione_covid_post___lt;
        private String decorso_infezione_covid_post___lte;
        private String decorso_infezione_covid_post___gt;
        private String decorso_infezione_covid_post___gte;
        private String decorso_infezione_covid_post___contains;
        private String decorso_infezione_covid_post___not___contains;
        private String decorso_infezione_covid_post___starts_with;
        private String decorso_infezione_covid_post___not___starts_with;
        private String decorso_infezione_covid_post___ends_with;
        private String decorso_infezione_covid_post___not___ends_with;
        private String dosi_vaccino_covid___eq;
        private String dosi_vaccino_covid___ne;
        private Boolean dosi_vaccino_covid___null;
        private Boolean dosi_vaccino_covid___not___null;
        private java.util.List<String> dosi_vaccino_covid___in;
        private java.util.List<String> dosi_vaccino_covid___not___in;
        private String dosi_vaccino_covid___lt;
        private String dosi_vaccino_covid___lte;
        private String dosi_vaccino_covid___gt;
        private String dosi_vaccino_covid___gte;
        private String dosi_vaccino_covid___contains;
        private String dosi_vaccino_covid___not___contains;
        private String dosi_vaccino_covid___starts_with;
        private String dosi_vaccino_covid___not___starts_with;
        private String dosi_vaccino_covid___ends_with;
        private String dosi_vaccino_covid___not___ends_with;
        private Boolean farmaci_prima_dose_bool___eq;
        private Boolean farmaci_prima_dose_bool___ne;
        private Boolean farmaci_prima_dose_bool___null;
        private Boolean farmaci_prima_dose_bool___not___null;
        private String farmaci_prima_dose_text___eq;
        private String farmaci_prima_dose_text___ne;
        private Boolean farmaci_prima_dose_text___null;
        private Boolean farmaci_prima_dose_text___not___null;
        private java.util.List<String> farmaci_prima_dose_text___in;
        private java.util.List<String> farmaci_prima_dose_text___not___in;
        private String farmaci_prima_dose_text___lt;
        private String farmaci_prima_dose_text___lte;
        private String farmaci_prima_dose_text___gt;
        private String farmaci_prima_dose_text___gte;
        private String farmaci_prima_dose_text___contains;
        private String farmaci_prima_dose_text___not___contains;
        private String farmaci_prima_dose_text___starts_with;
        private String farmaci_prima_dose_text___not___starts_with;
        private String farmaci_prima_dose_text___ends_with;
        private String farmaci_prima_dose_text___not___ends_with;
        private Boolean farmaci_seconda_dose_bool___eq;
        private Boolean farmaci_seconda_dose_bool___ne;
        private Boolean farmaci_seconda_dose_bool___null;
        private Boolean farmaci_seconda_dose_bool___not___null;
        private String farmaci_seconda_dose_text___eq;
        private String farmaci_seconda_dose_text___ne;
        private Boolean farmaci_seconda_dose_text___null;
        private Boolean farmaci_seconda_dose_text___not___null;
        private java.util.List<String> farmaci_seconda_dose_text___in;
        private java.util.List<String> farmaci_seconda_dose_text___not___in;
        private String farmaci_seconda_dose_text___lt;
        private String farmaci_seconda_dose_text___lte;
        private String farmaci_seconda_dose_text___gt;
        private String farmaci_seconda_dose_text___gte;
        private String farmaci_seconda_dose_text___contains;
        private String farmaci_seconda_dose_text___not___contains;
        private String farmaci_seconda_dose_text___starts_with;
        private String farmaci_seconda_dose_text___not___starts_with;
        private String farmaci_seconda_dose_text___ends_with;
        private String farmaci_seconda_dose_text___not___ends_with;
        private Boolean imped_attivita_prima_dose___eq;
        private Boolean imped_attivita_prima_dose___ne;
        private Boolean imped_attivita_prima_dose___null;
        private Boolean imped_attivita_prima_dose___not___null;
        private Boolean imped_attivita_seconda_dose___eq;
        private Boolean imped_attivita_seconda_dose___ne;
        private Boolean imped_attivita_seconda_dose___null;
        private Boolean imped_attivita_seconda_dose___not___null;
        private Boolean infezione_covid___eq;
        private Boolean infezione_covid___ne;
        private Boolean infezione_covid___null;
        private Boolean infezione_covid___not___null;
        private Boolean infezione_covid_post___eq;
        private Boolean infezione_covid_post___ne;
        private Boolean infezione_covid_post___null;
        private Boolean infezione_covid_post___not___null;
        private Boolean intubazione___eq;
        private Boolean intubazione___ne;
        private Boolean intubazione___null;
        private Boolean intubazione___not___null;
        private String ore_durata_sintomi_prima_dose___eq;
        private String ore_durata_sintomi_prima_dose___ne;
        private Boolean ore_durata_sintomi_prima_dose___null;
        private Boolean ore_durata_sintomi_prima_dose___not___null;
        private java.util.List<String> ore_durata_sintomi_prima_dose___in;
        private java.util.List<String> ore_durata_sintomi_prima_dose___not___in;
        private String ore_durata_sintomi_prima_dose___lt;
        private String ore_durata_sintomi_prima_dose___lte;
        private String ore_durata_sintomi_prima_dose___gt;
        private String ore_durata_sintomi_prima_dose___gte;
        private String ore_durata_sintomi_seconda_dose___eq;
        private String ore_durata_sintomi_seconda_dose___ne;
        private Boolean ore_durata_sintomi_seconda_dose___null;
        private Boolean ore_durata_sintomi_seconda_dose___not___null;
        private java.util.List<String> ore_durata_sintomi_seconda_dose___in;
        private java.util.List<String> ore_durata_sintomi_seconda_dose___not___in;
        private String ore_durata_sintomi_seconda_dose___lt;
        private String ore_durata_sintomi_seconda_dose___lte;
        private String ore_durata_sintomi_seconda_dose___gt;
        private String ore_durata_sintomi_seconda_dose___gte;
        private String ore_primo_sintomo_prima_dose___eq;
        private String ore_primo_sintomo_prima_dose___ne;
        private Boolean ore_primo_sintomo_prima_dose___null;
        private Boolean ore_primo_sintomo_prima_dose___not___null;
        private java.util.List<String> ore_primo_sintomo_prima_dose___in;
        private java.util.List<String> ore_primo_sintomo_prima_dose___not___in;
        private String ore_primo_sintomo_prima_dose___lt;
        private String ore_primo_sintomo_prima_dose___lte;
        private String ore_primo_sintomo_prima_dose___gt;
        private String ore_primo_sintomo_prima_dose___gte;
        private String ore_primo_sintomo_seconda_dose___eq;
        private String ore_primo_sintomo_seconda_dose___ne;
        private Boolean ore_primo_sintomo_seconda_dose___null;
        private Boolean ore_primo_sintomo_seconda_dose___not___null;
        private java.util.List<String> ore_primo_sintomo_seconda_dose___in;
        private java.util.List<String> ore_primo_sintomo_seconda_dose___not___in;
        private String ore_primo_sintomo_seconda_dose___lt;
        private String ore_primo_sintomo_seconda_dose___lte;
        private String ore_primo_sintomo_seconda_dose___gt;
        private String ore_primo_sintomo_seconda_dose___gte;
        private Boolean ospedale_prima_dose___eq;
        private Boolean ospedale_prima_dose___ne;
        private Boolean ospedale_prima_dose___null;
        private Boolean ospedale_prima_dose___not___null;
        private Boolean ospedale_seconda_dose___eq;
        private Boolean ospedale_seconda_dose___ne;
        private Boolean ospedale_seconda_dose___null;
        private Boolean ospedale_seconda_dose___not___null;
        private Boolean ospedalizzazione___eq;
        private Boolean ospedalizzazione___ne;
        private Boolean ospedalizzazione___null;
        private Boolean ospedalizzazione___not___null;
        private Boolean seconda_dose___eq;
        private Boolean seconda_dose___ne;
        private Boolean seconda_dose___null;
        private Boolean seconda_dose___not___null;
        private Boolean terapia_corticoster___eq;
        private Boolean terapia_corticoster___ne;
        private Boolean terapia_corticoster___null;
        private Boolean terapia_corticoster___not___null;
        private Boolean terapia_immunosopp___eq;
        private Boolean terapia_immunosopp___ne;
        private Boolean terapia_immunosopp___null;
        private Boolean terapia_immunosopp___not___null;
        private String terapia_immunosopp_desc___eq;
        private String terapia_immunosopp_desc___ne;
        private Boolean terapia_immunosopp_desc___null;
        private Boolean terapia_immunosopp_desc___not___null;
        private java.util.List<String> terapia_immunosopp_desc___in;
        private java.util.List<String> terapia_immunosopp_desc___not___in;
        private String terapia_immunosopp_desc___lt;
        private String terapia_immunosopp_desc___lte;
        private String terapia_immunosopp_desc___gt;
        private String terapia_immunosopp_desc___gte;
        private String terapia_immunosopp_desc___contains;
        private String terapia_immunosopp_desc___not___contains;
        private String terapia_immunosopp_desc___starts_with;
        private String terapia_immunosopp_desc___not___starts_with;
        private String terapia_immunosopp_desc___ends_with;
        private String terapia_immunosopp_desc___not___ends_with;
        private Boolean vax_ico___eq;
        private Boolean vax_ico___ne;
        private Boolean vax_ico___null;
        private Boolean vax_ico___not___null;
        private java.util.List<CliV_dettaglioFilterDTO> AND;
        private java.util.List<CliV_dettaglioFilterDTO> OR;
        private CliV_dettaglioFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
            return this;
        }

        public Builder set_createdon___eq(String _createdon___eq) {
            this._createdon___eq = _createdon___eq;
            return this;
        }

        public Builder set_createdon___ne(String _createdon___ne) {
            this._createdon___ne = _createdon___ne;
            return this;
        }

        public Builder set_createdon___null(Boolean _createdon___null) {
            this._createdon___null = _createdon___null;
            return this;
        }

        public Builder set_createdon___not___null(Boolean _createdon___not___null) {
            this._createdon___not___null = _createdon___not___null;
            return this;
        }

        public Builder set_createdon___in(java.util.List<String> _createdon___in) {
            this._createdon___in = _createdon___in;
            return this;
        }

        public Builder set_createdon___not___in(java.util.List<String> _createdon___not___in) {
            this._createdon___not___in = _createdon___not___in;
            return this;
        }

        public Builder set_createdon___lt(String _createdon___lt) {
            this._createdon___lt = _createdon___lt;
            return this;
        }

        public Builder set_createdon___lte(String _createdon___lte) {
            this._createdon___lte = _createdon___lte;
            return this;
        }

        public Builder set_createdon___gt(String _createdon___gt) {
            this._createdon___gt = _createdon___gt;
            return this;
        }

        public Builder set_createdon___gte(String _createdon___gte) {
            this._createdon___gte = _createdon___gte;
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

        public Builder setAltro_evento_prima_dose___eq(String altro_evento_prima_dose___eq) {
            this.altro_evento_prima_dose___eq = altro_evento_prima_dose___eq;
            return this;
        }

        public Builder setAltro_evento_prima_dose___ne(String altro_evento_prima_dose___ne) {
            this.altro_evento_prima_dose___ne = altro_evento_prima_dose___ne;
            return this;
        }

        public Builder setAltro_evento_prima_dose___null(Boolean altro_evento_prima_dose___null) {
            this.altro_evento_prima_dose___null = altro_evento_prima_dose___null;
            return this;
        }

        public Builder setAltro_evento_prima_dose___not___null(Boolean altro_evento_prima_dose___not___null) {
            this.altro_evento_prima_dose___not___null = altro_evento_prima_dose___not___null;
            return this;
        }

        public Builder setAltro_evento_prima_dose___in(java.util.List<String> altro_evento_prima_dose___in) {
            this.altro_evento_prima_dose___in = altro_evento_prima_dose___in;
            return this;
        }

        public Builder setAltro_evento_prima_dose___not___in(java.util.List<String> altro_evento_prima_dose___not___in) {
            this.altro_evento_prima_dose___not___in = altro_evento_prima_dose___not___in;
            return this;
        }

        public Builder setAltro_evento_prima_dose___lt(String altro_evento_prima_dose___lt) {
            this.altro_evento_prima_dose___lt = altro_evento_prima_dose___lt;
            return this;
        }

        public Builder setAltro_evento_prima_dose___lte(String altro_evento_prima_dose___lte) {
            this.altro_evento_prima_dose___lte = altro_evento_prima_dose___lte;
            return this;
        }

        public Builder setAltro_evento_prima_dose___gt(String altro_evento_prima_dose___gt) {
            this.altro_evento_prima_dose___gt = altro_evento_prima_dose___gt;
            return this;
        }

        public Builder setAltro_evento_prima_dose___gte(String altro_evento_prima_dose___gte) {
            this.altro_evento_prima_dose___gte = altro_evento_prima_dose___gte;
            return this;
        }

        public Builder setAltro_evento_prima_dose___contains(String altro_evento_prima_dose___contains) {
            this.altro_evento_prima_dose___contains = altro_evento_prima_dose___contains;
            return this;
        }

        public Builder setAltro_evento_prima_dose___not___contains(String altro_evento_prima_dose___not___contains) {
            this.altro_evento_prima_dose___not___contains = altro_evento_prima_dose___not___contains;
            return this;
        }

        public Builder setAltro_evento_prima_dose___starts_with(String altro_evento_prima_dose___starts_with) {
            this.altro_evento_prima_dose___starts_with = altro_evento_prima_dose___starts_with;
            return this;
        }

        public Builder setAltro_evento_prima_dose___not___starts_with(String altro_evento_prima_dose___not___starts_with) {
            this.altro_evento_prima_dose___not___starts_with = altro_evento_prima_dose___not___starts_with;
            return this;
        }

        public Builder setAltro_evento_prima_dose___ends_with(String altro_evento_prima_dose___ends_with) {
            this.altro_evento_prima_dose___ends_with = altro_evento_prima_dose___ends_with;
            return this;
        }

        public Builder setAltro_evento_prima_dose___not___ends_with(String altro_evento_prima_dose___not___ends_with) {
            this.altro_evento_prima_dose___not___ends_with = altro_evento_prima_dose___not___ends_with;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___eq(String altro_evento_seconda_dose___eq) {
            this.altro_evento_seconda_dose___eq = altro_evento_seconda_dose___eq;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___ne(String altro_evento_seconda_dose___ne) {
            this.altro_evento_seconda_dose___ne = altro_evento_seconda_dose___ne;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___null(Boolean altro_evento_seconda_dose___null) {
            this.altro_evento_seconda_dose___null = altro_evento_seconda_dose___null;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___not___null(Boolean altro_evento_seconda_dose___not___null) {
            this.altro_evento_seconda_dose___not___null = altro_evento_seconda_dose___not___null;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___in(java.util.List<String> altro_evento_seconda_dose___in) {
            this.altro_evento_seconda_dose___in = altro_evento_seconda_dose___in;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___not___in(java.util.List<String> altro_evento_seconda_dose___not___in) {
            this.altro_evento_seconda_dose___not___in = altro_evento_seconda_dose___not___in;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___lt(String altro_evento_seconda_dose___lt) {
            this.altro_evento_seconda_dose___lt = altro_evento_seconda_dose___lt;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___lte(String altro_evento_seconda_dose___lte) {
            this.altro_evento_seconda_dose___lte = altro_evento_seconda_dose___lte;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___gt(String altro_evento_seconda_dose___gt) {
            this.altro_evento_seconda_dose___gt = altro_evento_seconda_dose___gt;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___gte(String altro_evento_seconda_dose___gte) {
            this.altro_evento_seconda_dose___gte = altro_evento_seconda_dose___gte;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___contains(String altro_evento_seconda_dose___contains) {
            this.altro_evento_seconda_dose___contains = altro_evento_seconda_dose___contains;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___not___contains(String altro_evento_seconda_dose___not___contains) {
            this.altro_evento_seconda_dose___not___contains = altro_evento_seconda_dose___not___contains;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___starts_with(String altro_evento_seconda_dose___starts_with) {
            this.altro_evento_seconda_dose___starts_with = altro_evento_seconda_dose___starts_with;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___not___starts_with(String altro_evento_seconda_dose___not___starts_with) {
            this.altro_evento_seconda_dose___not___starts_with = altro_evento_seconda_dose___not___starts_with;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___ends_with(String altro_evento_seconda_dose___ends_with) {
            this.altro_evento_seconda_dose___ends_with = altro_evento_seconda_dose___ends_with;
            return this;
        }

        public Builder setAltro_evento_seconda_dose___not___ends_with(String altro_evento_seconda_dose___not___ends_with) {
            this.altro_evento_seconda_dose___not___ends_with = altro_evento_seconda_dose___not___ends_with;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___eq(String altro_motivazione_seconda_dose___eq) {
            this.altro_motivazione_seconda_dose___eq = altro_motivazione_seconda_dose___eq;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___ne(String altro_motivazione_seconda_dose___ne) {
            this.altro_motivazione_seconda_dose___ne = altro_motivazione_seconda_dose___ne;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___null(Boolean altro_motivazione_seconda_dose___null) {
            this.altro_motivazione_seconda_dose___null = altro_motivazione_seconda_dose___null;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___not___null(Boolean altro_motivazione_seconda_dose___not___null) {
            this.altro_motivazione_seconda_dose___not___null = altro_motivazione_seconda_dose___not___null;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___in(java.util.List<String> altro_motivazione_seconda_dose___in) {
            this.altro_motivazione_seconda_dose___in = altro_motivazione_seconda_dose___in;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___not___in(java.util.List<String> altro_motivazione_seconda_dose___not___in) {
            this.altro_motivazione_seconda_dose___not___in = altro_motivazione_seconda_dose___not___in;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___lt(String altro_motivazione_seconda_dose___lt) {
            this.altro_motivazione_seconda_dose___lt = altro_motivazione_seconda_dose___lt;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___lte(String altro_motivazione_seconda_dose___lte) {
            this.altro_motivazione_seconda_dose___lte = altro_motivazione_seconda_dose___lte;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___gt(String altro_motivazione_seconda_dose___gt) {
            this.altro_motivazione_seconda_dose___gt = altro_motivazione_seconda_dose___gt;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___gte(String altro_motivazione_seconda_dose___gte) {
            this.altro_motivazione_seconda_dose___gte = altro_motivazione_seconda_dose___gte;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___contains(String altro_motivazione_seconda_dose___contains) {
            this.altro_motivazione_seconda_dose___contains = altro_motivazione_seconda_dose___contains;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___not___contains(String altro_motivazione_seconda_dose___not___contains) {
            this.altro_motivazione_seconda_dose___not___contains = altro_motivazione_seconda_dose___not___contains;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___starts_with(String altro_motivazione_seconda_dose___starts_with) {
            this.altro_motivazione_seconda_dose___starts_with = altro_motivazione_seconda_dose___starts_with;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___not___starts_with(String altro_motivazione_seconda_dose___not___starts_with) {
            this.altro_motivazione_seconda_dose___not___starts_with = altro_motivazione_seconda_dose___not___starts_with;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___ends_with(String altro_motivazione_seconda_dose___ends_with) {
            this.altro_motivazione_seconda_dose___ends_with = altro_motivazione_seconda_dose___ends_with;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose___not___ends_with(String altro_motivazione_seconda_dose___not___ends_with) {
            this.altro_motivazione_seconda_dose___not___ends_with = altro_motivazione_seconda_dose___not___ends_with;
            return this;
        }

        public Builder setAssenza_lavoro_prima_dose___eq(Boolean assenza_lavoro_prima_dose___eq) {
            this.assenza_lavoro_prima_dose___eq = assenza_lavoro_prima_dose___eq;
            return this;
        }

        public Builder setAssenza_lavoro_prima_dose___ne(Boolean assenza_lavoro_prima_dose___ne) {
            this.assenza_lavoro_prima_dose___ne = assenza_lavoro_prima_dose___ne;
            return this;
        }

        public Builder setAssenza_lavoro_prima_dose___null(Boolean assenza_lavoro_prima_dose___null) {
            this.assenza_lavoro_prima_dose___null = assenza_lavoro_prima_dose___null;
            return this;
        }

        public Builder setAssenza_lavoro_prima_dose___not___null(Boolean assenza_lavoro_prima_dose___not___null) {
            this.assenza_lavoro_prima_dose___not___null = assenza_lavoro_prima_dose___not___null;
            return this;
        }

        public Builder setAssenza_lavoro_seconda_dose___eq(Boolean assenza_lavoro_seconda_dose___eq) {
            this.assenza_lavoro_seconda_dose___eq = assenza_lavoro_seconda_dose___eq;
            return this;
        }

        public Builder setAssenza_lavoro_seconda_dose___ne(Boolean assenza_lavoro_seconda_dose___ne) {
            this.assenza_lavoro_seconda_dose___ne = assenza_lavoro_seconda_dose___ne;
            return this;
        }

        public Builder setAssenza_lavoro_seconda_dose___null(Boolean assenza_lavoro_seconda_dose___null) {
            this.assenza_lavoro_seconda_dose___null = assenza_lavoro_seconda_dose___null;
            return this;
        }

        public Builder setAssenza_lavoro_seconda_dose___not___null(Boolean assenza_lavoro_seconda_dose___not___null) {
            this.assenza_lavoro_seconda_dose___not___null = assenza_lavoro_seconda_dose___not___null;
            return this;
        }

        public Builder setCount_eventi_prima_dose___eq(Integer count_eventi_prima_dose___eq) {
            this.count_eventi_prima_dose___eq = count_eventi_prima_dose___eq;
            return this;
        }

        public Builder setCount_eventi_prima_dose___ne(Integer count_eventi_prima_dose___ne) {
            this.count_eventi_prima_dose___ne = count_eventi_prima_dose___ne;
            return this;
        }

        public Builder setCount_eventi_prima_dose___null(Boolean count_eventi_prima_dose___null) {
            this.count_eventi_prima_dose___null = count_eventi_prima_dose___null;
            return this;
        }

        public Builder setCount_eventi_prima_dose___not___null(Boolean count_eventi_prima_dose___not___null) {
            this.count_eventi_prima_dose___not___null = count_eventi_prima_dose___not___null;
            return this;
        }

        public Builder setCount_eventi_prima_dose___in(java.util.List<Integer> count_eventi_prima_dose___in) {
            this.count_eventi_prima_dose___in = count_eventi_prima_dose___in;
            return this;
        }

        public Builder setCount_eventi_prima_dose___not___in(java.util.List<Integer> count_eventi_prima_dose___not___in) {
            this.count_eventi_prima_dose___not___in = count_eventi_prima_dose___not___in;
            return this;
        }

        public Builder setCount_eventi_prima_dose___lt(Integer count_eventi_prima_dose___lt) {
            this.count_eventi_prima_dose___lt = count_eventi_prima_dose___lt;
            return this;
        }

        public Builder setCount_eventi_prima_dose___lte(Integer count_eventi_prima_dose___lte) {
            this.count_eventi_prima_dose___lte = count_eventi_prima_dose___lte;
            return this;
        }

        public Builder setCount_eventi_prima_dose___gt(Integer count_eventi_prima_dose___gt) {
            this.count_eventi_prima_dose___gt = count_eventi_prima_dose___gt;
            return this;
        }

        public Builder setCount_eventi_prima_dose___gte(Integer count_eventi_prima_dose___gte) {
            this.count_eventi_prima_dose___gte = count_eventi_prima_dose___gte;
            return this;
        }

        public Builder setCount_eventi_seconda_dose___eq(Integer count_eventi_seconda_dose___eq) {
            this.count_eventi_seconda_dose___eq = count_eventi_seconda_dose___eq;
            return this;
        }

        public Builder setCount_eventi_seconda_dose___ne(Integer count_eventi_seconda_dose___ne) {
            this.count_eventi_seconda_dose___ne = count_eventi_seconda_dose___ne;
            return this;
        }

        public Builder setCount_eventi_seconda_dose___null(Boolean count_eventi_seconda_dose___null) {
            this.count_eventi_seconda_dose___null = count_eventi_seconda_dose___null;
            return this;
        }

        public Builder setCount_eventi_seconda_dose___not___null(Boolean count_eventi_seconda_dose___not___null) {
            this.count_eventi_seconda_dose___not___null = count_eventi_seconda_dose___not___null;
            return this;
        }

        public Builder setCount_eventi_seconda_dose___in(java.util.List<Integer> count_eventi_seconda_dose___in) {
            this.count_eventi_seconda_dose___in = count_eventi_seconda_dose___in;
            return this;
        }

        public Builder setCount_eventi_seconda_dose___not___in(java.util.List<Integer> count_eventi_seconda_dose___not___in) {
            this.count_eventi_seconda_dose___not___in = count_eventi_seconda_dose___not___in;
            return this;
        }

        public Builder setCount_eventi_seconda_dose___lt(Integer count_eventi_seconda_dose___lt) {
            this.count_eventi_seconda_dose___lt = count_eventi_seconda_dose___lt;
            return this;
        }

        public Builder setCount_eventi_seconda_dose___lte(Integer count_eventi_seconda_dose___lte) {
            this.count_eventi_seconda_dose___lte = count_eventi_seconda_dose___lte;
            return this;
        }

        public Builder setCount_eventi_seconda_dose___gt(Integer count_eventi_seconda_dose___gt) {
            this.count_eventi_seconda_dose___gt = count_eventi_seconda_dose___gt;
            return this;
        }

        public Builder setCount_eventi_seconda_dose___gte(Integer count_eventi_seconda_dose___gte) {
            this.count_eventi_seconda_dose___gte = count_eventi_seconda_dose___gte;
            return this;
        }

        public Builder setData_prima_dose___eq(String data_prima_dose___eq) {
            this.data_prima_dose___eq = data_prima_dose___eq;
            return this;
        }

        public Builder setData_prima_dose___ne(String data_prima_dose___ne) {
            this.data_prima_dose___ne = data_prima_dose___ne;
            return this;
        }

        public Builder setData_prima_dose___null(Boolean data_prima_dose___null) {
            this.data_prima_dose___null = data_prima_dose___null;
            return this;
        }

        public Builder setData_prima_dose___not___null(Boolean data_prima_dose___not___null) {
            this.data_prima_dose___not___null = data_prima_dose___not___null;
            return this;
        }

        public Builder setData_prima_dose___in(java.util.List<String> data_prima_dose___in) {
            this.data_prima_dose___in = data_prima_dose___in;
            return this;
        }

        public Builder setData_prima_dose___not___in(java.util.List<String> data_prima_dose___not___in) {
            this.data_prima_dose___not___in = data_prima_dose___not___in;
            return this;
        }

        public Builder setData_prima_dose___lt(String data_prima_dose___lt) {
            this.data_prima_dose___lt = data_prima_dose___lt;
            return this;
        }

        public Builder setData_prima_dose___lte(String data_prima_dose___lte) {
            this.data_prima_dose___lte = data_prima_dose___lte;
            return this;
        }

        public Builder setData_prima_dose___gt(String data_prima_dose___gt) {
            this.data_prima_dose___gt = data_prima_dose___gt;
            return this;
        }

        public Builder setData_prima_dose___gte(String data_prima_dose___gte) {
            this.data_prima_dose___gte = data_prima_dose___gte;
            return this;
        }

        public Builder setData_primo_tampone___eq(String data_primo_tampone___eq) {
            this.data_primo_tampone___eq = data_primo_tampone___eq;
            return this;
        }

        public Builder setData_primo_tampone___ne(String data_primo_tampone___ne) {
            this.data_primo_tampone___ne = data_primo_tampone___ne;
            return this;
        }

        public Builder setData_primo_tampone___null(Boolean data_primo_tampone___null) {
            this.data_primo_tampone___null = data_primo_tampone___null;
            return this;
        }

        public Builder setData_primo_tampone___not___null(Boolean data_primo_tampone___not___null) {
            this.data_primo_tampone___not___null = data_primo_tampone___not___null;
            return this;
        }

        public Builder setData_primo_tampone___in(java.util.List<String> data_primo_tampone___in) {
            this.data_primo_tampone___in = data_primo_tampone___in;
            return this;
        }

        public Builder setData_primo_tampone___not___in(java.util.List<String> data_primo_tampone___not___in) {
            this.data_primo_tampone___not___in = data_primo_tampone___not___in;
            return this;
        }

        public Builder setData_primo_tampone___lt(String data_primo_tampone___lt) {
            this.data_primo_tampone___lt = data_primo_tampone___lt;
            return this;
        }

        public Builder setData_primo_tampone___lte(String data_primo_tampone___lte) {
            this.data_primo_tampone___lte = data_primo_tampone___lte;
            return this;
        }

        public Builder setData_primo_tampone___gt(String data_primo_tampone___gt) {
            this.data_primo_tampone___gt = data_primo_tampone___gt;
            return this;
        }

        public Builder setData_primo_tampone___gte(String data_primo_tampone___gte) {
            this.data_primo_tampone___gte = data_primo_tampone___gte;
            return this;
        }

        public Builder setData_primo_tampone_post___eq(String data_primo_tampone_post___eq) {
            this.data_primo_tampone_post___eq = data_primo_tampone_post___eq;
            return this;
        }

        public Builder setData_primo_tampone_post___ne(String data_primo_tampone_post___ne) {
            this.data_primo_tampone_post___ne = data_primo_tampone_post___ne;
            return this;
        }

        public Builder setData_primo_tampone_post___null(Boolean data_primo_tampone_post___null) {
            this.data_primo_tampone_post___null = data_primo_tampone_post___null;
            return this;
        }

        public Builder setData_primo_tampone_post___not___null(Boolean data_primo_tampone_post___not___null) {
            this.data_primo_tampone_post___not___null = data_primo_tampone_post___not___null;
            return this;
        }

        public Builder setData_primo_tampone_post___in(java.util.List<String> data_primo_tampone_post___in) {
            this.data_primo_tampone_post___in = data_primo_tampone_post___in;
            return this;
        }

        public Builder setData_primo_tampone_post___not___in(java.util.List<String> data_primo_tampone_post___not___in) {
            this.data_primo_tampone_post___not___in = data_primo_tampone_post___not___in;
            return this;
        }

        public Builder setData_primo_tampone_post___lt(String data_primo_tampone_post___lt) {
            this.data_primo_tampone_post___lt = data_primo_tampone_post___lt;
            return this;
        }

        public Builder setData_primo_tampone_post___lte(String data_primo_tampone_post___lte) {
            this.data_primo_tampone_post___lte = data_primo_tampone_post___lte;
            return this;
        }

        public Builder setData_primo_tampone_post___gt(String data_primo_tampone_post___gt) {
            this.data_primo_tampone_post___gt = data_primo_tampone_post___gt;
            return this;
        }

        public Builder setData_primo_tampone_post___gte(String data_primo_tampone_post___gte) {
            this.data_primo_tampone_post___gte = data_primo_tampone_post___gte;
            return this;
        }

        public Builder setData_seconda_dose___eq(String data_seconda_dose___eq) {
            this.data_seconda_dose___eq = data_seconda_dose___eq;
            return this;
        }

        public Builder setData_seconda_dose___ne(String data_seconda_dose___ne) {
            this.data_seconda_dose___ne = data_seconda_dose___ne;
            return this;
        }

        public Builder setData_seconda_dose___null(Boolean data_seconda_dose___null) {
            this.data_seconda_dose___null = data_seconda_dose___null;
            return this;
        }

        public Builder setData_seconda_dose___not___null(Boolean data_seconda_dose___not___null) {
            this.data_seconda_dose___not___null = data_seconda_dose___not___null;
            return this;
        }

        public Builder setData_seconda_dose___in(java.util.List<String> data_seconda_dose___in) {
            this.data_seconda_dose___in = data_seconda_dose___in;
            return this;
        }

        public Builder setData_seconda_dose___not___in(java.util.List<String> data_seconda_dose___not___in) {
            this.data_seconda_dose___not___in = data_seconda_dose___not___in;
            return this;
        }

        public Builder setData_seconda_dose___lt(String data_seconda_dose___lt) {
            this.data_seconda_dose___lt = data_seconda_dose___lt;
            return this;
        }

        public Builder setData_seconda_dose___lte(String data_seconda_dose___lte) {
            this.data_seconda_dose___lte = data_seconda_dose___lte;
            return this;
        }

        public Builder setData_seconda_dose___gt(String data_seconda_dose___gt) {
            this.data_seconda_dose___gt = data_seconda_dose___gt;
            return this;
        }

        public Builder setData_seconda_dose___gte(String data_seconda_dose___gte) {
            this.data_seconda_dose___gte = data_seconda_dose___gte;
            return this;
        }

        public Builder setDecorso_infezione_covid___eq(String decorso_infezione_covid___eq) {
            this.decorso_infezione_covid___eq = decorso_infezione_covid___eq;
            return this;
        }

        public Builder setDecorso_infezione_covid___ne(String decorso_infezione_covid___ne) {
            this.decorso_infezione_covid___ne = decorso_infezione_covid___ne;
            return this;
        }

        public Builder setDecorso_infezione_covid___null(Boolean decorso_infezione_covid___null) {
            this.decorso_infezione_covid___null = decorso_infezione_covid___null;
            return this;
        }

        public Builder setDecorso_infezione_covid___not___null(Boolean decorso_infezione_covid___not___null) {
            this.decorso_infezione_covid___not___null = decorso_infezione_covid___not___null;
            return this;
        }

        public Builder setDecorso_infezione_covid___in(java.util.List<String> decorso_infezione_covid___in) {
            this.decorso_infezione_covid___in = decorso_infezione_covid___in;
            return this;
        }

        public Builder setDecorso_infezione_covid___not___in(java.util.List<String> decorso_infezione_covid___not___in) {
            this.decorso_infezione_covid___not___in = decorso_infezione_covid___not___in;
            return this;
        }

        public Builder setDecorso_infezione_covid___lt(String decorso_infezione_covid___lt) {
            this.decorso_infezione_covid___lt = decorso_infezione_covid___lt;
            return this;
        }

        public Builder setDecorso_infezione_covid___lte(String decorso_infezione_covid___lte) {
            this.decorso_infezione_covid___lte = decorso_infezione_covid___lte;
            return this;
        }

        public Builder setDecorso_infezione_covid___gt(String decorso_infezione_covid___gt) {
            this.decorso_infezione_covid___gt = decorso_infezione_covid___gt;
            return this;
        }

        public Builder setDecorso_infezione_covid___gte(String decorso_infezione_covid___gte) {
            this.decorso_infezione_covid___gte = decorso_infezione_covid___gte;
            return this;
        }

        public Builder setDecorso_infezione_covid___contains(String decorso_infezione_covid___contains) {
            this.decorso_infezione_covid___contains = decorso_infezione_covid___contains;
            return this;
        }

        public Builder setDecorso_infezione_covid___not___contains(String decorso_infezione_covid___not___contains) {
            this.decorso_infezione_covid___not___contains = decorso_infezione_covid___not___contains;
            return this;
        }

        public Builder setDecorso_infezione_covid___starts_with(String decorso_infezione_covid___starts_with) {
            this.decorso_infezione_covid___starts_with = decorso_infezione_covid___starts_with;
            return this;
        }

        public Builder setDecorso_infezione_covid___not___starts_with(String decorso_infezione_covid___not___starts_with) {
            this.decorso_infezione_covid___not___starts_with = decorso_infezione_covid___not___starts_with;
            return this;
        }

        public Builder setDecorso_infezione_covid___ends_with(String decorso_infezione_covid___ends_with) {
            this.decorso_infezione_covid___ends_with = decorso_infezione_covid___ends_with;
            return this;
        }

        public Builder setDecorso_infezione_covid___not___ends_with(String decorso_infezione_covid___not___ends_with) {
            this.decorso_infezione_covid___not___ends_with = decorso_infezione_covid___not___ends_with;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___eq(String decorso_infezione_covid_post___eq) {
            this.decorso_infezione_covid_post___eq = decorso_infezione_covid_post___eq;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___ne(String decorso_infezione_covid_post___ne) {
            this.decorso_infezione_covid_post___ne = decorso_infezione_covid_post___ne;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___null(Boolean decorso_infezione_covid_post___null) {
            this.decorso_infezione_covid_post___null = decorso_infezione_covid_post___null;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___not___null(Boolean decorso_infezione_covid_post___not___null) {
            this.decorso_infezione_covid_post___not___null = decorso_infezione_covid_post___not___null;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___in(java.util.List<String> decorso_infezione_covid_post___in) {
            this.decorso_infezione_covid_post___in = decorso_infezione_covid_post___in;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___not___in(java.util.List<String> decorso_infezione_covid_post___not___in) {
            this.decorso_infezione_covid_post___not___in = decorso_infezione_covid_post___not___in;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___lt(String decorso_infezione_covid_post___lt) {
            this.decorso_infezione_covid_post___lt = decorso_infezione_covid_post___lt;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___lte(String decorso_infezione_covid_post___lte) {
            this.decorso_infezione_covid_post___lte = decorso_infezione_covid_post___lte;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___gt(String decorso_infezione_covid_post___gt) {
            this.decorso_infezione_covid_post___gt = decorso_infezione_covid_post___gt;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___gte(String decorso_infezione_covid_post___gte) {
            this.decorso_infezione_covid_post___gte = decorso_infezione_covid_post___gte;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___contains(String decorso_infezione_covid_post___contains) {
            this.decorso_infezione_covid_post___contains = decorso_infezione_covid_post___contains;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___not___contains(String decorso_infezione_covid_post___not___contains) {
            this.decorso_infezione_covid_post___not___contains = decorso_infezione_covid_post___not___contains;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___starts_with(String decorso_infezione_covid_post___starts_with) {
            this.decorso_infezione_covid_post___starts_with = decorso_infezione_covid_post___starts_with;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___not___starts_with(String decorso_infezione_covid_post___not___starts_with) {
            this.decorso_infezione_covid_post___not___starts_with = decorso_infezione_covid_post___not___starts_with;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___ends_with(String decorso_infezione_covid_post___ends_with) {
            this.decorso_infezione_covid_post___ends_with = decorso_infezione_covid_post___ends_with;
            return this;
        }

        public Builder setDecorso_infezione_covid_post___not___ends_with(String decorso_infezione_covid_post___not___ends_with) {
            this.decorso_infezione_covid_post___not___ends_with = decorso_infezione_covid_post___not___ends_with;
            return this;
        }

        public Builder setDosi_vaccino_covid___eq(String dosi_vaccino_covid___eq) {
            this.dosi_vaccino_covid___eq = dosi_vaccino_covid___eq;
            return this;
        }

        public Builder setDosi_vaccino_covid___ne(String dosi_vaccino_covid___ne) {
            this.dosi_vaccino_covid___ne = dosi_vaccino_covid___ne;
            return this;
        }

        public Builder setDosi_vaccino_covid___null(Boolean dosi_vaccino_covid___null) {
            this.dosi_vaccino_covid___null = dosi_vaccino_covid___null;
            return this;
        }

        public Builder setDosi_vaccino_covid___not___null(Boolean dosi_vaccino_covid___not___null) {
            this.dosi_vaccino_covid___not___null = dosi_vaccino_covid___not___null;
            return this;
        }

        public Builder setDosi_vaccino_covid___in(java.util.List<String> dosi_vaccino_covid___in) {
            this.dosi_vaccino_covid___in = dosi_vaccino_covid___in;
            return this;
        }

        public Builder setDosi_vaccino_covid___not___in(java.util.List<String> dosi_vaccino_covid___not___in) {
            this.dosi_vaccino_covid___not___in = dosi_vaccino_covid___not___in;
            return this;
        }

        public Builder setDosi_vaccino_covid___lt(String dosi_vaccino_covid___lt) {
            this.dosi_vaccino_covid___lt = dosi_vaccino_covid___lt;
            return this;
        }

        public Builder setDosi_vaccino_covid___lte(String dosi_vaccino_covid___lte) {
            this.dosi_vaccino_covid___lte = dosi_vaccino_covid___lte;
            return this;
        }

        public Builder setDosi_vaccino_covid___gt(String dosi_vaccino_covid___gt) {
            this.dosi_vaccino_covid___gt = dosi_vaccino_covid___gt;
            return this;
        }

        public Builder setDosi_vaccino_covid___gte(String dosi_vaccino_covid___gte) {
            this.dosi_vaccino_covid___gte = dosi_vaccino_covid___gte;
            return this;
        }

        public Builder setDosi_vaccino_covid___contains(String dosi_vaccino_covid___contains) {
            this.dosi_vaccino_covid___contains = dosi_vaccino_covid___contains;
            return this;
        }

        public Builder setDosi_vaccino_covid___not___contains(String dosi_vaccino_covid___not___contains) {
            this.dosi_vaccino_covid___not___contains = dosi_vaccino_covid___not___contains;
            return this;
        }

        public Builder setDosi_vaccino_covid___starts_with(String dosi_vaccino_covid___starts_with) {
            this.dosi_vaccino_covid___starts_with = dosi_vaccino_covid___starts_with;
            return this;
        }

        public Builder setDosi_vaccino_covid___not___starts_with(String dosi_vaccino_covid___not___starts_with) {
            this.dosi_vaccino_covid___not___starts_with = dosi_vaccino_covid___not___starts_with;
            return this;
        }

        public Builder setDosi_vaccino_covid___ends_with(String dosi_vaccino_covid___ends_with) {
            this.dosi_vaccino_covid___ends_with = dosi_vaccino_covid___ends_with;
            return this;
        }

        public Builder setDosi_vaccino_covid___not___ends_with(String dosi_vaccino_covid___not___ends_with) {
            this.dosi_vaccino_covid___not___ends_with = dosi_vaccino_covid___not___ends_with;
            return this;
        }

        public Builder setFarmaci_prima_dose_bool___eq(Boolean farmaci_prima_dose_bool___eq) {
            this.farmaci_prima_dose_bool___eq = farmaci_prima_dose_bool___eq;
            return this;
        }

        public Builder setFarmaci_prima_dose_bool___ne(Boolean farmaci_prima_dose_bool___ne) {
            this.farmaci_prima_dose_bool___ne = farmaci_prima_dose_bool___ne;
            return this;
        }

        public Builder setFarmaci_prima_dose_bool___null(Boolean farmaci_prima_dose_bool___null) {
            this.farmaci_prima_dose_bool___null = farmaci_prima_dose_bool___null;
            return this;
        }

        public Builder setFarmaci_prima_dose_bool___not___null(Boolean farmaci_prima_dose_bool___not___null) {
            this.farmaci_prima_dose_bool___not___null = farmaci_prima_dose_bool___not___null;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___eq(String farmaci_prima_dose_text___eq) {
            this.farmaci_prima_dose_text___eq = farmaci_prima_dose_text___eq;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___ne(String farmaci_prima_dose_text___ne) {
            this.farmaci_prima_dose_text___ne = farmaci_prima_dose_text___ne;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___null(Boolean farmaci_prima_dose_text___null) {
            this.farmaci_prima_dose_text___null = farmaci_prima_dose_text___null;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___not___null(Boolean farmaci_prima_dose_text___not___null) {
            this.farmaci_prima_dose_text___not___null = farmaci_prima_dose_text___not___null;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___in(java.util.List<String> farmaci_prima_dose_text___in) {
            this.farmaci_prima_dose_text___in = farmaci_prima_dose_text___in;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___not___in(java.util.List<String> farmaci_prima_dose_text___not___in) {
            this.farmaci_prima_dose_text___not___in = farmaci_prima_dose_text___not___in;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___lt(String farmaci_prima_dose_text___lt) {
            this.farmaci_prima_dose_text___lt = farmaci_prima_dose_text___lt;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___lte(String farmaci_prima_dose_text___lte) {
            this.farmaci_prima_dose_text___lte = farmaci_prima_dose_text___lte;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___gt(String farmaci_prima_dose_text___gt) {
            this.farmaci_prima_dose_text___gt = farmaci_prima_dose_text___gt;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___gte(String farmaci_prima_dose_text___gte) {
            this.farmaci_prima_dose_text___gte = farmaci_prima_dose_text___gte;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___contains(String farmaci_prima_dose_text___contains) {
            this.farmaci_prima_dose_text___contains = farmaci_prima_dose_text___contains;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___not___contains(String farmaci_prima_dose_text___not___contains) {
            this.farmaci_prima_dose_text___not___contains = farmaci_prima_dose_text___not___contains;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___starts_with(String farmaci_prima_dose_text___starts_with) {
            this.farmaci_prima_dose_text___starts_with = farmaci_prima_dose_text___starts_with;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___not___starts_with(String farmaci_prima_dose_text___not___starts_with) {
            this.farmaci_prima_dose_text___not___starts_with = farmaci_prima_dose_text___not___starts_with;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___ends_with(String farmaci_prima_dose_text___ends_with) {
            this.farmaci_prima_dose_text___ends_with = farmaci_prima_dose_text___ends_with;
            return this;
        }

        public Builder setFarmaci_prima_dose_text___not___ends_with(String farmaci_prima_dose_text___not___ends_with) {
            this.farmaci_prima_dose_text___not___ends_with = farmaci_prima_dose_text___not___ends_with;
            return this;
        }

        public Builder setFarmaci_seconda_dose_bool___eq(Boolean farmaci_seconda_dose_bool___eq) {
            this.farmaci_seconda_dose_bool___eq = farmaci_seconda_dose_bool___eq;
            return this;
        }

        public Builder setFarmaci_seconda_dose_bool___ne(Boolean farmaci_seconda_dose_bool___ne) {
            this.farmaci_seconda_dose_bool___ne = farmaci_seconda_dose_bool___ne;
            return this;
        }

        public Builder setFarmaci_seconda_dose_bool___null(Boolean farmaci_seconda_dose_bool___null) {
            this.farmaci_seconda_dose_bool___null = farmaci_seconda_dose_bool___null;
            return this;
        }

        public Builder setFarmaci_seconda_dose_bool___not___null(Boolean farmaci_seconda_dose_bool___not___null) {
            this.farmaci_seconda_dose_bool___not___null = farmaci_seconda_dose_bool___not___null;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___eq(String farmaci_seconda_dose_text___eq) {
            this.farmaci_seconda_dose_text___eq = farmaci_seconda_dose_text___eq;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___ne(String farmaci_seconda_dose_text___ne) {
            this.farmaci_seconda_dose_text___ne = farmaci_seconda_dose_text___ne;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___null(Boolean farmaci_seconda_dose_text___null) {
            this.farmaci_seconda_dose_text___null = farmaci_seconda_dose_text___null;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___not___null(Boolean farmaci_seconda_dose_text___not___null) {
            this.farmaci_seconda_dose_text___not___null = farmaci_seconda_dose_text___not___null;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___in(java.util.List<String> farmaci_seconda_dose_text___in) {
            this.farmaci_seconda_dose_text___in = farmaci_seconda_dose_text___in;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___not___in(java.util.List<String> farmaci_seconda_dose_text___not___in) {
            this.farmaci_seconda_dose_text___not___in = farmaci_seconda_dose_text___not___in;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___lt(String farmaci_seconda_dose_text___lt) {
            this.farmaci_seconda_dose_text___lt = farmaci_seconda_dose_text___lt;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___lte(String farmaci_seconda_dose_text___lte) {
            this.farmaci_seconda_dose_text___lte = farmaci_seconda_dose_text___lte;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___gt(String farmaci_seconda_dose_text___gt) {
            this.farmaci_seconda_dose_text___gt = farmaci_seconda_dose_text___gt;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___gte(String farmaci_seconda_dose_text___gte) {
            this.farmaci_seconda_dose_text___gte = farmaci_seconda_dose_text___gte;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___contains(String farmaci_seconda_dose_text___contains) {
            this.farmaci_seconda_dose_text___contains = farmaci_seconda_dose_text___contains;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___not___contains(String farmaci_seconda_dose_text___not___contains) {
            this.farmaci_seconda_dose_text___not___contains = farmaci_seconda_dose_text___not___contains;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___starts_with(String farmaci_seconda_dose_text___starts_with) {
            this.farmaci_seconda_dose_text___starts_with = farmaci_seconda_dose_text___starts_with;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___not___starts_with(String farmaci_seconda_dose_text___not___starts_with) {
            this.farmaci_seconda_dose_text___not___starts_with = farmaci_seconda_dose_text___not___starts_with;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___ends_with(String farmaci_seconda_dose_text___ends_with) {
            this.farmaci_seconda_dose_text___ends_with = farmaci_seconda_dose_text___ends_with;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text___not___ends_with(String farmaci_seconda_dose_text___not___ends_with) {
            this.farmaci_seconda_dose_text___not___ends_with = farmaci_seconda_dose_text___not___ends_with;
            return this;
        }

        public Builder setImped_attivita_prima_dose___eq(Boolean imped_attivita_prima_dose___eq) {
            this.imped_attivita_prima_dose___eq = imped_attivita_prima_dose___eq;
            return this;
        }

        public Builder setImped_attivita_prima_dose___ne(Boolean imped_attivita_prima_dose___ne) {
            this.imped_attivita_prima_dose___ne = imped_attivita_prima_dose___ne;
            return this;
        }

        public Builder setImped_attivita_prima_dose___null(Boolean imped_attivita_prima_dose___null) {
            this.imped_attivita_prima_dose___null = imped_attivita_prima_dose___null;
            return this;
        }

        public Builder setImped_attivita_prima_dose___not___null(Boolean imped_attivita_prima_dose___not___null) {
            this.imped_attivita_prima_dose___not___null = imped_attivita_prima_dose___not___null;
            return this;
        }

        public Builder setImped_attivita_seconda_dose___eq(Boolean imped_attivita_seconda_dose___eq) {
            this.imped_attivita_seconda_dose___eq = imped_attivita_seconda_dose___eq;
            return this;
        }

        public Builder setImped_attivita_seconda_dose___ne(Boolean imped_attivita_seconda_dose___ne) {
            this.imped_attivita_seconda_dose___ne = imped_attivita_seconda_dose___ne;
            return this;
        }

        public Builder setImped_attivita_seconda_dose___null(Boolean imped_attivita_seconda_dose___null) {
            this.imped_attivita_seconda_dose___null = imped_attivita_seconda_dose___null;
            return this;
        }

        public Builder setImped_attivita_seconda_dose___not___null(Boolean imped_attivita_seconda_dose___not___null) {
            this.imped_attivita_seconda_dose___not___null = imped_attivita_seconda_dose___not___null;
            return this;
        }

        public Builder setInfezione_covid___eq(Boolean infezione_covid___eq) {
            this.infezione_covid___eq = infezione_covid___eq;
            return this;
        }

        public Builder setInfezione_covid___ne(Boolean infezione_covid___ne) {
            this.infezione_covid___ne = infezione_covid___ne;
            return this;
        }

        public Builder setInfezione_covid___null(Boolean infezione_covid___null) {
            this.infezione_covid___null = infezione_covid___null;
            return this;
        }

        public Builder setInfezione_covid___not___null(Boolean infezione_covid___not___null) {
            this.infezione_covid___not___null = infezione_covid___not___null;
            return this;
        }

        public Builder setInfezione_covid_post___eq(Boolean infezione_covid_post___eq) {
            this.infezione_covid_post___eq = infezione_covid_post___eq;
            return this;
        }

        public Builder setInfezione_covid_post___ne(Boolean infezione_covid_post___ne) {
            this.infezione_covid_post___ne = infezione_covid_post___ne;
            return this;
        }

        public Builder setInfezione_covid_post___null(Boolean infezione_covid_post___null) {
            this.infezione_covid_post___null = infezione_covid_post___null;
            return this;
        }

        public Builder setInfezione_covid_post___not___null(Boolean infezione_covid_post___not___null) {
            this.infezione_covid_post___not___null = infezione_covid_post___not___null;
            return this;
        }

        public Builder setIntubazione___eq(Boolean intubazione___eq) {
            this.intubazione___eq = intubazione___eq;
            return this;
        }

        public Builder setIntubazione___ne(Boolean intubazione___ne) {
            this.intubazione___ne = intubazione___ne;
            return this;
        }

        public Builder setIntubazione___null(Boolean intubazione___null) {
            this.intubazione___null = intubazione___null;
            return this;
        }

        public Builder setIntubazione___not___null(Boolean intubazione___not___null) {
            this.intubazione___not___null = intubazione___not___null;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose___eq(String ore_durata_sintomi_prima_dose___eq) {
            this.ore_durata_sintomi_prima_dose___eq = ore_durata_sintomi_prima_dose___eq;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose___ne(String ore_durata_sintomi_prima_dose___ne) {
            this.ore_durata_sintomi_prima_dose___ne = ore_durata_sintomi_prima_dose___ne;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose___null(Boolean ore_durata_sintomi_prima_dose___null) {
            this.ore_durata_sintomi_prima_dose___null = ore_durata_sintomi_prima_dose___null;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose___not___null(Boolean ore_durata_sintomi_prima_dose___not___null) {
            this.ore_durata_sintomi_prima_dose___not___null = ore_durata_sintomi_prima_dose___not___null;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose___in(java.util.List<String> ore_durata_sintomi_prima_dose___in) {
            this.ore_durata_sintomi_prima_dose___in = ore_durata_sintomi_prima_dose___in;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose___not___in(java.util.List<String> ore_durata_sintomi_prima_dose___not___in) {
            this.ore_durata_sintomi_prima_dose___not___in = ore_durata_sintomi_prima_dose___not___in;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose___lt(String ore_durata_sintomi_prima_dose___lt) {
            this.ore_durata_sintomi_prima_dose___lt = ore_durata_sintomi_prima_dose___lt;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose___lte(String ore_durata_sintomi_prima_dose___lte) {
            this.ore_durata_sintomi_prima_dose___lte = ore_durata_sintomi_prima_dose___lte;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose___gt(String ore_durata_sintomi_prima_dose___gt) {
            this.ore_durata_sintomi_prima_dose___gt = ore_durata_sintomi_prima_dose___gt;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose___gte(String ore_durata_sintomi_prima_dose___gte) {
            this.ore_durata_sintomi_prima_dose___gte = ore_durata_sintomi_prima_dose___gte;
            return this;
        }

        public Builder setOre_durata_sintomi_seconda_dose___eq(String ore_durata_sintomi_seconda_dose___eq) {
            this.ore_durata_sintomi_seconda_dose___eq = ore_durata_sintomi_seconda_dose___eq;
            return this;
        }

        public Builder setOre_durata_sintomi_seconda_dose___ne(String ore_durata_sintomi_seconda_dose___ne) {
            this.ore_durata_sintomi_seconda_dose___ne = ore_durata_sintomi_seconda_dose___ne;
            return this;
        }

        public Builder setOre_durata_sintomi_seconda_dose___null(Boolean ore_durata_sintomi_seconda_dose___null) {
            this.ore_durata_sintomi_seconda_dose___null = ore_durata_sintomi_seconda_dose___null;
            return this;
        }

        public Builder setOre_durata_sintomi_seconda_dose___not___null(Boolean ore_durata_sintomi_seconda_dose___not___null) {
            this.ore_durata_sintomi_seconda_dose___not___null = ore_durata_sintomi_seconda_dose___not___null;
            return this;
        }

        public Builder setOre_durata_sintomi_seconda_dose___in(java.util.List<String> ore_durata_sintomi_seconda_dose___in) {
            this.ore_durata_sintomi_seconda_dose___in = ore_durata_sintomi_seconda_dose___in;
            return this;
        }

        public Builder setOre_durata_sintomi_seconda_dose___not___in(java.util.List<String> ore_durata_sintomi_seconda_dose___not___in) {
            this.ore_durata_sintomi_seconda_dose___not___in = ore_durata_sintomi_seconda_dose___not___in;
            return this;
        }

        public Builder setOre_durata_sintomi_seconda_dose___lt(String ore_durata_sintomi_seconda_dose___lt) {
            this.ore_durata_sintomi_seconda_dose___lt = ore_durata_sintomi_seconda_dose___lt;
            return this;
        }

        public Builder setOre_durata_sintomi_seconda_dose___lte(String ore_durata_sintomi_seconda_dose___lte) {
            this.ore_durata_sintomi_seconda_dose___lte = ore_durata_sintomi_seconda_dose___lte;
            return this;
        }

        public Builder setOre_durata_sintomi_seconda_dose___gt(String ore_durata_sintomi_seconda_dose___gt) {
            this.ore_durata_sintomi_seconda_dose___gt = ore_durata_sintomi_seconda_dose___gt;
            return this;
        }

        public Builder setOre_durata_sintomi_seconda_dose___gte(String ore_durata_sintomi_seconda_dose___gte) {
            this.ore_durata_sintomi_seconda_dose___gte = ore_durata_sintomi_seconda_dose___gte;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose___eq(String ore_primo_sintomo_prima_dose___eq) {
            this.ore_primo_sintomo_prima_dose___eq = ore_primo_sintomo_prima_dose___eq;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose___ne(String ore_primo_sintomo_prima_dose___ne) {
            this.ore_primo_sintomo_prima_dose___ne = ore_primo_sintomo_prima_dose___ne;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose___null(Boolean ore_primo_sintomo_prima_dose___null) {
            this.ore_primo_sintomo_prima_dose___null = ore_primo_sintomo_prima_dose___null;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose___not___null(Boolean ore_primo_sintomo_prima_dose___not___null) {
            this.ore_primo_sintomo_prima_dose___not___null = ore_primo_sintomo_prima_dose___not___null;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose___in(java.util.List<String> ore_primo_sintomo_prima_dose___in) {
            this.ore_primo_sintomo_prima_dose___in = ore_primo_sintomo_prima_dose___in;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose___not___in(java.util.List<String> ore_primo_sintomo_prima_dose___not___in) {
            this.ore_primo_sintomo_prima_dose___not___in = ore_primo_sintomo_prima_dose___not___in;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose___lt(String ore_primo_sintomo_prima_dose___lt) {
            this.ore_primo_sintomo_prima_dose___lt = ore_primo_sintomo_prima_dose___lt;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose___lte(String ore_primo_sintomo_prima_dose___lte) {
            this.ore_primo_sintomo_prima_dose___lte = ore_primo_sintomo_prima_dose___lte;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose___gt(String ore_primo_sintomo_prima_dose___gt) {
            this.ore_primo_sintomo_prima_dose___gt = ore_primo_sintomo_prima_dose___gt;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose___gte(String ore_primo_sintomo_prima_dose___gte) {
            this.ore_primo_sintomo_prima_dose___gte = ore_primo_sintomo_prima_dose___gte;
            return this;
        }

        public Builder setOre_primo_sintomo_seconda_dose___eq(String ore_primo_sintomo_seconda_dose___eq) {
            this.ore_primo_sintomo_seconda_dose___eq = ore_primo_sintomo_seconda_dose___eq;
            return this;
        }

        public Builder setOre_primo_sintomo_seconda_dose___ne(String ore_primo_sintomo_seconda_dose___ne) {
            this.ore_primo_sintomo_seconda_dose___ne = ore_primo_sintomo_seconda_dose___ne;
            return this;
        }

        public Builder setOre_primo_sintomo_seconda_dose___null(Boolean ore_primo_sintomo_seconda_dose___null) {
            this.ore_primo_sintomo_seconda_dose___null = ore_primo_sintomo_seconda_dose___null;
            return this;
        }

        public Builder setOre_primo_sintomo_seconda_dose___not___null(Boolean ore_primo_sintomo_seconda_dose___not___null) {
            this.ore_primo_sintomo_seconda_dose___not___null = ore_primo_sintomo_seconda_dose___not___null;
            return this;
        }

        public Builder setOre_primo_sintomo_seconda_dose___in(java.util.List<String> ore_primo_sintomo_seconda_dose___in) {
            this.ore_primo_sintomo_seconda_dose___in = ore_primo_sintomo_seconda_dose___in;
            return this;
        }

        public Builder setOre_primo_sintomo_seconda_dose___not___in(java.util.List<String> ore_primo_sintomo_seconda_dose___not___in) {
            this.ore_primo_sintomo_seconda_dose___not___in = ore_primo_sintomo_seconda_dose___not___in;
            return this;
        }

        public Builder setOre_primo_sintomo_seconda_dose___lt(String ore_primo_sintomo_seconda_dose___lt) {
            this.ore_primo_sintomo_seconda_dose___lt = ore_primo_sintomo_seconda_dose___lt;
            return this;
        }

        public Builder setOre_primo_sintomo_seconda_dose___lte(String ore_primo_sintomo_seconda_dose___lte) {
            this.ore_primo_sintomo_seconda_dose___lte = ore_primo_sintomo_seconda_dose___lte;
            return this;
        }

        public Builder setOre_primo_sintomo_seconda_dose___gt(String ore_primo_sintomo_seconda_dose___gt) {
            this.ore_primo_sintomo_seconda_dose___gt = ore_primo_sintomo_seconda_dose___gt;
            return this;
        }

        public Builder setOre_primo_sintomo_seconda_dose___gte(String ore_primo_sintomo_seconda_dose___gte) {
            this.ore_primo_sintomo_seconda_dose___gte = ore_primo_sintomo_seconda_dose___gte;
            return this;
        }

        public Builder setOspedale_prima_dose___eq(Boolean ospedale_prima_dose___eq) {
            this.ospedale_prima_dose___eq = ospedale_prima_dose___eq;
            return this;
        }

        public Builder setOspedale_prima_dose___ne(Boolean ospedale_prima_dose___ne) {
            this.ospedale_prima_dose___ne = ospedale_prima_dose___ne;
            return this;
        }

        public Builder setOspedale_prima_dose___null(Boolean ospedale_prima_dose___null) {
            this.ospedale_prima_dose___null = ospedale_prima_dose___null;
            return this;
        }

        public Builder setOspedale_prima_dose___not___null(Boolean ospedale_prima_dose___not___null) {
            this.ospedale_prima_dose___not___null = ospedale_prima_dose___not___null;
            return this;
        }

        public Builder setOspedale_seconda_dose___eq(Boolean ospedale_seconda_dose___eq) {
            this.ospedale_seconda_dose___eq = ospedale_seconda_dose___eq;
            return this;
        }

        public Builder setOspedale_seconda_dose___ne(Boolean ospedale_seconda_dose___ne) {
            this.ospedale_seconda_dose___ne = ospedale_seconda_dose___ne;
            return this;
        }

        public Builder setOspedale_seconda_dose___null(Boolean ospedale_seconda_dose___null) {
            this.ospedale_seconda_dose___null = ospedale_seconda_dose___null;
            return this;
        }

        public Builder setOspedale_seconda_dose___not___null(Boolean ospedale_seconda_dose___not___null) {
            this.ospedale_seconda_dose___not___null = ospedale_seconda_dose___not___null;
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

        public Builder setSeconda_dose___eq(Boolean seconda_dose___eq) {
            this.seconda_dose___eq = seconda_dose___eq;
            return this;
        }

        public Builder setSeconda_dose___ne(Boolean seconda_dose___ne) {
            this.seconda_dose___ne = seconda_dose___ne;
            return this;
        }

        public Builder setSeconda_dose___null(Boolean seconda_dose___null) {
            this.seconda_dose___null = seconda_dose___null;
            return this;
        }

        public Builder setSeconda_dose___not___null(Boolean seconda_dose___not___null) {
            this.seconda_dose___not___null = seconda_dose___not___null;
            return this;
        }

        public Builder setTerapia_corticoster___eq(Boolean terapia_corticoster___eq) {
            this.terapia_corticoster___eq = terapia_corticoster___eq;
            return this;
        }

        public Builder setTerapia_corticoster___ne(Boolean terapia_corticoster___ne) {
            this.terapia_corticoster___ne = terapia_corticoster___ne;
            return this;
        }

        public Builder setTerapia_corticoster___null(Boolean terapia_corticoster___null) {
            this.terapia_corticoster___null = terapia_corticoster___null;
            return this;
        }

        public Builder setTerapia_corticoster___not___null(Boolean terapia_corticoster___not___null) {
            this.terapia_corticoster___not___null = terapia_corticoster___not___null;
            return this;
        }

        public Builder setTerapia_immunosopp___eq(Boolean terapia_immunosopp___eq) {
            this.terapia_immunosopp___eq = terapia_immunosopp___eq;
            return this;
        }

        public Builder setTerapia_immunosopp___ne(Boolean terapia_immunosopp___ne) {
            this.terapia_immunosopp___ne = terapia_immunosopp___ne;
            return this;
        }

        public Builder setTerapia_immunosopp___null(Boolean terapia_immunosopp___null) {
            this.terapia_immunosopp___null = terapia_immunosopp___null;
            return this;
        }

        public Builder setTerapia_immunosopp___not___null(Boolean terapia_immunosopp___not___null) {
            this.terapia_immunosopp___not___null = terapia_immunosopp___not___null;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___eq(String terapia_immunosopp_desc___eq) {
            this.terapia_immunosopp_desc___eq = terapia_immunosopp_desc___eq;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___ne(String terapia_immunosopp_desc___ne) {
            this.terapia_immunosopp_desc___ne = terapia_immunosopp_desc___ne;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___null(Boolean terapia_immunosopp_desc___null) {
            this.terapia_immunosopp_desc___null = terapia_immunosopp_desc___null;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___not___null(Boolean terapia_immunosopp_desc___not___null) {
            this.terapia_immunosopp_desc___not___null = terapia_immunosopp_desc___not___null;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___in(java.util.List<String> terapia_immunosopp_desc___in) {
            this.terapia_immunosopp_desc___in = terapia_immunosopp_desc___in;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___not___in(java.util.List<String> terapia_immunosopp_desc___not___in) {
            this.terapia_immunosopp_desc___not___in = terapia_immunosopp_desc___not___in;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___lt(String terapia_immunosopp_desc___lt) {
            this.terapia_immunosopp_desc___lt = terapia_immunosopp_desc___lt;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___lte(String terapia_immunosopp_desc___lte) {
            this.terapia_immunosopp_desc___lte = terapia_immunosopp_desc___lte;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___gt(String terapia_immunosopp_desc___gt) {
            this.terapia_immunosopp_desc___gt = terapia_immunosopp_desc___gt;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___gte(String terapia_immunosopp_desc___gte) {
            this.terapia_immunosopp_desc___gte = terapia_immunosopp_desc___gte;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___contains(String terapia_immunosopp_desc___contains) {
            this.terapia_immunosopp_desc___contains = terapia_immunosopp_desc___contains;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___not___contains(String terapia_immunosopp_desc___not___contains) {
            this.terapia_immunosopp_desc___not___contains = terapia_immunosopp_desc___not___contains;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___starts_with(String terapia_immunosopp_desc___starts_with) {
            this.terapia_immunosopp_desc___starts_with = terapia_immunosopp_desc___starts_with;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___not___starts_with(String terapia_immunosopp_desc___not___starts_with) {
            this.terapia_immunosopp_desc___not___starts_with = terapia_immunosopp_desc___not___starts_with;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___ends_with(String terapia_immunosopp_desc___ends_with) {
            this.terapia_immunosopp_desc___ends_with = terapia_immunosopp_desc___ends_with;
            return this;
        }

        public Builder setTerapia_immunosopp_desc___not___ends_with(String terapia_immunosopp_desc___not___ends_with) {
            this.terapia_immunosopp_desc___not___ends_with = terapia_immunosopp_desc___not___ends_with;
            return this;
        }

        public Builder setVax_ico___eq(Boolean vax_ico___eq) {
            this.vax_ico___eq = vax_ico___eq;
            return this;
        }

        public Builder setVax_ico___ne(Boolean vax_ico___ne) {
            this.vax_ico___ne = vax_ico___ne;
            return this;
        }

        public Builder setVax_ico___null(Boolean vax_ico___null) {
            this.vax_ico___null = vax_ico___null;
            return this;
        }

        public Builder setVax_ico___not___null(Boolean vax_ico___not___null) {
            this.vax_ico___not___null = vax_ico___not___null;
            return this;
        }

        public Builder setAND(java.util.List<CliV_dettaglioFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliV_dettaglioFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliV_dettaglioFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliV_dettaglioFilterDTO build() {
            CliV_dettaglioFilterDTO result = new CliV_dettaglioFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
            result.set_createdon___eq(this._createdon___eq);
            result.set_createdon___ne(this._createdon___ne);
            result.set_createdon___null(this._createdon___null);
            result.set_createdon___not___null(this._createdon___not___null);
            result.set_createdon___in(this._createdon___in);
            result.set_createdon___not___in(this._createdon___not___in);
            result.set_createdon___lt(this._createdon___lt);
            result.set_createdon___lte(this._createdon___lte);
            result.set_createdon___gt(this._createdon___gt);
            result.set_createdon___gte(this._createdon___gte);
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
            result.setAltro_evento_prima_dose___eq(this.altro_evento_prima_dose___eq);
            result.setAltro_evento_prima_dose___ne(this.altro_evento_prima_dose___ne);
            result.setAltro_evento_prima_dose___null(this.altro_evento_prima_dose___null);
            result.setAltro_evento_prima_dose___not___null(this.altro_evento_prima_dose___not___null);
            result.setAltro_evento_prima_dose___in(this.altro_evento_prima_dose___in);
            result.setAltro_evento_prima_dose___not___in(this.altro_evento_prima_dose___not___in);
            result.setAltro_evento_prima_dose___lt(this.altro_evento_prima_dose___lt);
            result.setAltro_evento_prima_dose___lte(this.altro_evento_prima_dose___lte);
            result.setAltro_evento_prima_dose___gt(this.altro_evento_prima_dose___gt);
            result.setAltro_evento_prima_dose___gte(this.altro_evento_prima_dose___gte);
            result.setAltro_evento_prima_dose___contains(this.altro_evento_prima_dose___contains);
            result.setAltro_evento_prima_dose___not___contains(this.altro_evento_prima_dose___not___contains);
            result.setAltro_evento_prima_dose___starts_with(this.altro_evento_prima_dose___starts_with);
            result.setAltro_evento_prima_dose___not___starts_with(this.altro_evento_prima_dose___not___starts_with);
            result.setAltro_evento_prima_dose___ends_with(this.altro_evento_prima_dose___ends_with);
            result.setAltro_evento_prima_dose___not___ends_with(this.altro_evento_prima_dose___not___ends_with);
            result.setAltro_evento_seconda_dose___eq(this.altro_evento_seconda_dose___eq);
            result.setAltro_evento_seconda_dose___ne(this.altro_evento_seconda_dose___ne);
            result.setAltro_evento_seconda_dose___null(this.altro_evento_seconda_dose___null);
            result.setAltro_evento_seconda_dose___not___null(this.altro_evento_seconda_dose___not___null);
            result.setAltro_evento_seconda_dose___in(this.altro_evento_seconda_dose___in);
            result.setAltro_evento_seconda_dose___not___in(this.altro_evento_seconda_dose___not___in);
            result.setAltro_evento_seconda_dose___lt(this.altro_evento_seconda_dose___lt);
            result.setAltro_evento_seconda_dose___lte(this.altro_evento_seconda_dose___lte);
            result.setAltro_evento_seconda_dose___gt(this.altro_evento_seconda_dose___gt);
            result.setAltro_evento_seconda_dose___gte(this.altro_evento_seconda_dose___gte);
            result.setAltro_evento_seconda_dose___contains(this.altro_evento_seconda_dose___contains);
            result.setAltro_evento_seconda_dose___not___contains(this.altro_evento_seconda_dose___not___contains);
            result.setAltro_evento_seconda_dose___starts_with(this.altro_evento_seconda_dose___starts_with);
            result.setAltro_evento_seconda_dose___not___starts_with(this.altro_evento_seconda_dose___not___starts_with);
            result.setAltro_evento_seconda_dose___ends_with(this.altro_evento_seconda_dose___ends_with);
            result.setAltro_evento_seconda_dose___not___ends_with(this.altro_evento_seconda_dose___not___ends_with);
            result.setAltro_motivazione_seconda_dose___eq(this.altro_motivazione_seconda_dose___eq);
            result.setAltro_motivazione_seconda_dose___ne(this.altro_motivazione_seconda_dose___ne);
            result.setAltro_motivazione_seconda_dose___null(this.altro_motivazione_seconda_dose___null);
            result.setAltro_motivazione_seconda_dose___not___null(this.altro_motivazione_seconda_dose___not___null);
            result.setAltro_motivazione_seconda_dose___in(this.altro_motivazione_seconda_dose___in);
            result.setAltro_motivazione_seconda_dose___not___in(this.altro_motivazione_seconda_dose___not___in);
            result.setAltro_motivazione_seconda_dose___lt(this.altro_motivazione_seconda_dose___lt);
            result.setAltro_motivazione_seconda_dose___lte(this.altro_motivazione_seconda_dose___lte);
            result.setAltro_motivazione_seconda_dose___gt(this.altro_motivazione_seconda_dose___gt);
            result.setAltro_motivazione_seconda_dose___gte(this.altro_motivazione_seconda_dose___gte);
            result.setAltro_motivazione_seconda_dose___contains(this.altro_motivazione_seconda_dose___contains);
            result.setAltro_motivazione_seconda_dose___not___contains(this.altro_motivazione_seconda_dose___not___contains);
            result.setAltro_motivazione_seconda_dose___starts_with(this.altro_motivazione_seconda_dose___starts_with);
            result.setAltro_motivazione_seconda_dose___not___starts_with(this.altro_motivazione_seconda_dose___not___starts_with);
            result.setAltro_motivazione_seconda_dose___ends_with(this.altro_motivazione_seconda_dose___ends_with);
            result.setAltro_motivazione_seconda_dose___not___ends_with(this.altro_motivazione_seconda_dose___not___ends_with);
            result.setAssenza_lavoro_prima_dose___eq(this.assenza_lavoro_prima_dose___eq);
            result.setAssenza_lavoro_prima_dose___ne(this.assenza_lavoro_prima_dose___ne);
            result.setAssenza_lavoro_prima_dose___null(this.assenza_lavoro_prima_dose___null);
            result.setAssenza_lavoro_prima_dose___not___null(this.assenza_lavoro_prima_dose___not___null);
            result.setAssenza_lavoro_seconda_dose___eq(this.assenza_lavoro_seconda_dose___eq);
            result.setAssenza_lavoro_seconda_dose___ne(this.assenza_lavoro_seconda_dose___ne);
            result.setAssenza_lavoro_seconda_dose___null(this.assenza_lavoro_seconda_dose___null);
            result.setAssenza_lavoro_seconda_dose___not___null(this.assenza_lavoro_seconda_dose___not___null);
            result.setCount_eventi_prima_dose___eq(this.count_eventi_prima_dose___eq);
            result.setCount_eventi_prima_dose___ne(this.count_eventi_prima_dose___ne);
            result.setCount_eventi_prima_dose___null(this.count_eventi_prima_dose___null);
            result.setCount_eventi_prima_dose___not___null(this.count_eventi_prima_dose___not___null);
            result.setCount_eventi_prima_dose___in(this.count_eventi_prima_dose___in);
            result.setCount_eventi_prima_dose___not___in(this.count_eventi_prima_dose___not___in);
            result.setCount_eventi_prima_dose___lt(this.count_eventi_prima_dose___lt);
            result.setCount_eventi_prima_dose___lte(this.count_eventi_prima_dose___lte);
            result.setCount_eventi_prima_dose___gt(this.count_eventi_prima_dose___gt);
            result.setCount_eventi_prima_dose___gte(this.count_eventi_prima_dose___gte);
            result.setCount_eventi_seconda_dose___eq(this.count_eventi_seconda_dose___eq);
            result.setCount_eventi_seconda_dose___ne(this.count_eventi_seconda_dose___ne);
            result.setCount_eventi_seconda_dose___null(this.count_eventi_seconda_dose___null);
            result.setCount_eventi_seconda_dose___not___null(this.count_eventi_seconda_dose___not___null);
            result.setCount_eventi_seconda_dose___in(this.count_eventi_seconda_dose___in);
            result.setCount_eventi_seconda_dose___not___in(this.count_eventi_seconda_dose___not___in);
            result.setCount_eventi_seconda_dose___lt(this.count_eventi_seconda_dose___lt);
            result.setCount_eventi_seconda_dose___lte(this.count_eventi_seconda_dose___lte);
            result.setCount_eventi_seconda_dose___gt(this.count_eventi_seconda_dose___gt);
            result.setCount_eventi_seconda_dose___gte(this.count_eventi_seconda_dose___gte);
            result.setData_prima_dose___eq(this.data_prima_dose___eq);
            result.setData_prima_dose___ne(this.data_prima_dose___ne);
            result.setData_prima_dose___null(this.data_prima_dose___null);
            result.setData_prima_dose___not___null(this.data_prima_dose___not___null);
            result.setData_prima_dose___in(this.data_prima_dose___in);
            result.setData_prima_dose___not___in(this.data_prima_dose___not___in);
            result.setData_prima_dose___lt(this.data_prima_dose___lt);
            result.setData_prima_dose___lte(this.data_prima_dose___lte);
            result.setData_prima_dose___gt(this.data_prima_dose___gt);
            result.setData_prima_dose___gte(this.data_prima_dose___gte);
            result.setData_primo_tampone___eq(this.data_primo_tampone___eq);
            result.setData_primo_tampone___ne(this.data_primo_tampone___ne);
            result.setData_primo_tampone___null(this.data_primo_tampone___null);
            result.setData_primo_tampone___not___null(this.data_primo_tampone___not___null);
            result.setData_primo_tampone___in(this.data_primo_tampone___in);
            result.setData_primo_tampone___not___in(this.data_primo_tampone___not___in);
            result.setData_primo_tampone___lt(this.data_primo_tampone___lt);
            result.setData_primo_tampone___lte(this.data_primo_tampone___lte);
            result.setData_primo_tampone___gt(this.data_primo_tampone___gt);
            result.setData_primo_tampone___gte(this.data_primo_tampone___gte);
            result.setData_primo_tampone_post___eq(this.data_primo_tampone_post___eq);
            result.setData_primo_tampone_post___ne(this.data_primo_tampone_post___ne);
            result.setData_primo_tampone_post___null(this.data_primo_tampone_post___null);
            result.setData_primo_tampone_post___not___null(this.data_primo_tampone_post___not___null);
            result.setData_primo_tampone_post___in(this.data_primo_tampone_post___in);
            result.setData_primo_tampone_post___not___in(this.data_primo_tampone_post___not___in);
            result.setData_primo_tampone_post___lt(this.data_primo_tampone_post___lt);
            result.setData_primo_tampone_post___lte(this.data_primo_tampone_post___lte);
            result.setData_primo_tampone_post___gt(this.data_primo_tampone_post___gt);
            result.setData_primo_tampone_post___gte(this.data_primo_tampone_post___gte);
            result.setData_seconda_dose___eq(this.data_seconda_dose___eq);
            result.setData_seconda_dose___ne(this.data_seconda_dose___ne);
            result.setData_seconda_dose___null(this.data_seconda_dose___null);
            result.setData_seconda_dose___not___null(this.data_seconda_dose___not___null);
            result.setData_seconda_dose___in(this.data_seconda_dose___in);
            result.setData_seconda_dose___not___in(this.data_seconda_dose___not___in);
            result.setData_seconda_dose___lt(this.data_seconda_dose___lt);
            result.setData_seconda_dose___lte(this.data_seconda_dose___lte);
            result.setData_seconda_dose___gt(this.data_seconda_dose___gt);
            result.setData_seconda_dose___gte(this.data_seconda_dose___gte);
            result.setDecorso_infezione_covid___eq(this.decorso_infezione_covid___eq);
            result.setDecorso_infezione_covid___ne(this.decorso_infezione_covid___ne);
            result.setDecorso_infezione_covid___null(this.decorso_infezione_covid___null);
            result.setDecorso_infezione_covid___not___null(this.decorso_infezione_covid___not___null);
            result.setDecorso_infezione_covid___in(this.decorso_infezione_covid___in);
            result.setDecorso_infezione_covid___not___in(this.decorso_infezione_covid___not___in);
            result.setDecorso_infezione_covid___lt(this.decorso_infezione_covid___lt);
            result.setDecorso_infezione_covid___lte(this.decorso_infezione_covid___lte);
            result.setDecorso_infezione_covid___gt(this.decorso_infezione_covid___gt);
            result.setDecorso_infezione_covid___gte(this.decorso_infezione_covid___gte);
            result.setDecorso_infezione_covid___contains(this.decorso_infezione_covid___contains);
            result.setDecorso_infezione_covid___not___contains(this.decorso_infezione_covid___not___contains);
            result.setDecorso_infezione_covid___starts_with(this.decorso_infezione_covid___starts_with);
            result.setDecorso_infezione_covid___not___starts_with(this.decorso_infezione_covid___not___starts_with);
            result.setDecorso_infezione_covid___ends_with(this.decorso_infezione_covid___ends_with);
            result.setDecorso_infezione_covid___not___ends_with(this.decorso_infezione_covid___not___ends_with);
            result.setDecorso_infezione_covid_post___eq(this.decorso_infezione_covid_post___eq);
            result.setDecorso_infezione_covid_post___ne(this.decorso_infezione_covid_post___ne);
            result.setDecorso_infezione_covid_post___null(this.decorso_infezione_covid_post___null);
            result.setDecorso_infezione_covid_post___not___null(this.decorso_infezione_covid_post___not___null);
            result.setDecorso_infezione_covid_post___in(this.decorso_infezione_covid_post___in);
            result.setDecorso_infezione_covid_post___not___in(this.decorso_infezione_covid_post___not___in);
            result.setDecorso_infezione_covid_post___lt(this.decorso_infezione_covid_post___lt);
            result.setDecorso_infezione_covid_post___lte(this.decorso_infezione_covid_post___lte);
            result.setDecorso_infezione_covid_post___gt(this.decorso_infezione_covid_post___gt);
            result.setDecorso_infezione_covid_post___gte(this.decorso_infezione_covid_post___gte);
            result.setDecorso_infezione_covid_post___contains(this.decorso_infezione_covid_post___contains);
            result.setDecorso_infezione_covid_post___not___contains(this.decorso_infezione_covid_post___not___contains);
            result.setDecorso_infezione_covid_post___starts_with(this.decorso_infezione_covid_post___starts_with);
            result.setDecorso_infezione_covid_post___not___starts_with(this.decorso_infezione_covid_post___not___starts_with);
            result.setDecorso_infezione_covid_post___ends_with(this.decorso_infezione_covid_post___ends_with);
            result.setDecorso_infezione_covid_post___not___ends_with(this.decorso_infezione_covid_post___not___ends_with);
            result.setDosi_vaccino_covid___eq(this.dosi_vaccino_covid___eq);
            result.setDosi_vaccino_covid___ne(this.dosi_vaccino_covid___ne);
            result.setDosi_vaccino_covid___null(this.dosi_vaccino_covid___null);
            result.setDosi_vaccino_covid___not___null(this.dosi_vaccino_covid___not___null);
            result.setDosi_vaccino_covid___in(this.dosi_vaccino_covid___in);
            result.setDosi_vaccino_covid___not___in(this.dosi_vaccino_covid___not___in);
            result.setDosi_vaccino_covid___lt(this.dosi_vaccino_covid___lt);
            result.setDosi_vaccino_covid___lte(this.dosi_vaccino_covid___lte);
            result.setDosi_vaccino_covid___gt(this.dosi_vaccino_covid___gt);
            result.setDosi_vaccino_covid___gte(this.dosi_vaccino_covid___gte);
            result.setDosi_vaccino_covid___contains(this.dosi_vaccino_covid___contains);
            result.setDosi_vaccino_covid___not___contains(this.dosi_vaccino_covid___not___contains);
            result.setDosi_vaccino_covid___starts_with(this.dosi_vaccino_covid___starts_with);
            result.setDosi_vaccino_covid___not___starts_with(this.dosi_vaccino_covid___not___starts_with);
            result.setDosi_vaccino_covid___ends_with(this.dosi_vaccino_covid___ends_with);
            result.setDosi_vaccino_covid___not___ends_with(this.dosi_vaccino_covid___not___ends_with);
            result.setFarmaci_prima_dose_bool___eq(this.farmaci_prima_dose_bool___eq);
            result.setFarmaci_prima_dose_bool___ne(this.farmaci_prima_dose_bool___ne);
            result.setFarmaci_prima_dose_bool___null(this.farmaci_prima_dose_bool___null);
            result.setFarmaci_prima_dose_bool___not___null(this.farmaci_prima_dose_bool___not___null);
            result.setFarmaci_prima_dose_text___eq(this.farmaci_prima_dose_text___eq);
            result.setFarmaci_prima_dose_text___ne(this.farmaci_prima_dose_text___ne);
            result.setFarmaci_prima_dose_text___null(this.farmaci_prima_dose_text___null);
            result.setFarmaci_prima_dose_text___not___null(this.farmaci_prima_dose_text___not___null);
            result.setFarmaci_prima_dose_text___in(this.farmaci_prima_dose_text___in);
            result.setFarmaci_prima_dose_text___not___in(this.farmaci_prima_dose_text___not___in);
            result.setFarmaci_prima_dose_text___lt(this.farmaci_prima_dose_text___lt);
            result.setFarmaci_prima_dose_text___lte(this.farmaci_prima_dose_text___lte);
            result.setFarmaci_prima_dose_text___gt(this.farmaci_prima_dose_text___gt);
            result.setFarmaci_prima_dose_text___gte(this.farmaci_prima_dose_text___gte);
            result.setFarmaci_prima_dose_text___contains(this.farmaci_prima_dose_text___contains);
            result.setFarmaci_prima_dose_text___not___contains(this.farmaci_prima_dose_text___not___contains);
            result.setFarmaci_prima_dose_text___starts_with(this.farmaci_prima_dose_text___starts_with);
            result.setFarmaci_prima_dose_text___not___starts_with(this.farmaci_prima_dose_text___not___starts_with);
            result.setFarmaci_prima_dose_text___ends_with(this.farmaci_prima_dose_text___ends_with);
            result.setFarmaci_prima_dose_text___not___ends_with(this.farmaci_prima_dose_text___not___ends_with);
            result.setFarmaci_seconda_dose_bool___eq(this.farmaci_seconda_dose_bool___eq);
            result.setFarmaci_seconda_dose_bool___ne(this.farmaci_seconda_dose_bool___ne);
            result.setFarmaci_seconda_dose_bool___null(this.farmaci_seconda_dose_bool___null);
            result.setFarmaci_seconda_dose_bool___not___null(this.farmaci_seconda_dose_bool___not___null);
            result.setFarmaci_seconda_dose_text___eq(this.farmaci_seconda_dose_text___eq);
            result.setFarmaci_seconda_dose_text___ne(this.farmaci_seconda_dose_text___ne);
            result.setFarmaci_seconda_dose_text___null(this.farmaci_seconda_dose_text___null);
            result.setFarmaci_seconda_dose_text___not___null(this.farmaci_seconda_dose_text___not___null);
            result.setFarmaci_seconda_dose_text___in(this.farmaci_seconda_dose_text___in);
            result.setFarmaci_seconda_dose_text___not___in(this.farmaci_seconda_dose_text___not___in);
            result.setFarmaci_seconda_dose_text___lt(this.farmaci_seconda_dose_text___lt);
            result.setFarmaci_seconda_dose_text___lte(this.farmaci_seconda_dose_text___lte);
            result.setFarmaci_seconda_dose_text___gt(this.farmaci_seconda_dose_text___gt);
            result.setFarmaci_seconda_dose_text___gte(this.farmaci_seconda_dose_text___gte);
            result.setFarmaci_seconda_dose_text___contains(this.farmaci_seconda_dose_text___contains);
            result.setFarmaci_seconda_dose_text___not___contains(this.farmaci_seconda_dose_text___not___contains);
            result.setFarmaci_seconda_dose_text___starts_with(this.farmaci_seconda_dose_text___starts_with);
            result.setFarmaci_seconda_dose_text___not___starts_with(this.farmaci_seconda_dose_text___not___starts_with);
            result.setFarmaci_seconda_dose_text___ends_with(this.farmaci_seconda_dose_text___ends_with);
            result.setFarmaci_seconda_dose_text___not___ends_with(this.farmaci_seconda_dose_text___not___ends_with);
            result.setImped_attivita_prima_dose___eq(this.imped_attivita_prima_dose___eq);
            result.setImped_attivita_prima_dose___ne(this.imped_attivita_prima_dose___ne);
            result.setImped_attivita_prima_dose___null(this.imped_attivita_prima_dose___null);
            result.setImped_attivita_prima_dose___not___null(this.imped_attivita_prima_dose___not___null);
            result.setImped_attivita_seconda_dose___eq(this.imped_attivita_seconda_dose___eq);
            result.setImped_attivita_seconda_dose___ne(this.imped_attivita_seconda_dose___ne);
            result.setImped_attivita_seconda_dose___null(this.imped_attivita_seconda_dose___null);
            result.setImped_attivita_seconda_dose___not___null(this.imped_attivita_seconda_dose___not___null);
            result.setInfezione_covid___eq(this.infezione_covid___eq);
            result.setInfezione_covid___ne(this.infezione_covid___ne);
            result.setInfezione_covid___null(this.infezione_covid___null);
            result.setInfezione_covid___not___null(this.infezione_covid___not___null);
            result.setInfezione_covid_post___eq(this.infezione_covid_post___eq);
            result.setInfezione_covid_post___ne(this.infezione_covid_post___ne);
            result.setInfezione_covid_post___null(this.infezione_covid_post___null);
            result.setInfezione_covid_post___not___null(this.infezione_covid_post___not___null);
            result.setIntubazione___eq(this.intubazione___eq);
            result.setIntubazione___ne(this.intubazione___ne);
            result.setIntubazione___null(this.intubazione___null);
            result.setIntubazione___not___null(this.intubazione___not___null);
            result.setOre_durata_sintomi_prima_dose___eq(this.ore_durata_sintomi_prima_dose___eq);
            result.setOre_durata_sintomi_prima_dose___ne(this.ore_durata_sintomi_prima_dose___ne);
            result.setOre_durata_sintomi_prima_dose___null(this.ore_durata_sintomi_prima_dose___null);
            result.setOre_durata_sintomi_prima_dose___not___null(this.ore_durata_sintomi_prima_dose___not___null);
            result.setOre_durata_sintomi_prima_dose___in(this.ore_durata_sintomi_prima_dose___in);
            result.setOre_durata_sintomi_prima_dose___not___in(this.ore_durata_sintomi_prima_dose___not___in);
            result.setOre_durata_sintomi_prima_dose___lt(this.ore_durata_sintomi_prima_dose___lt);
            result.setOre_durata_sintomi_prima_dose___lte(this.ore_durata_sintomi_prima_dose___lte);
            result.setOre_durata_sintomi_prima_dose___gt(this.ore_durata_sintomi_prima_dose___gt);
            result.setOre_durata_sintomi_prima_dose___gte(this.ore_durata_sintomi_prima_dose___gte);
            result.setOre_durata_sintomi_seconda_dose___eq(this.ore_durata_sintomi_seconda_dose___eq);
            result.setOre_durata_sintomi_seconda_dose___ne(this.ore_durata_sintomi_seconda_dose___ne);
            result.setOre_durata_sintomi_seconda_dose___null(this.ore_durata_sintomi_seconda_dose___null);
            result.setOre_durata_sintomi_seconda_dose___not___null(this.ore_durata_sintomi_seconda_dose___not___null);
            result.setOre_durata_sintomi_seconda_dose___in(this.ore_durata_sintomi_seconda_dose___in);
            result.setOre_durata_sintomi_seconda_dose___not___in(this.ore_durata_sintomi_seconda_dose___not___in);
            result.setOre_durata_sintomi_seconda_dose___lt(this.ore_durata_sintomi_seconda_dose___lt);
            result.setOre_durata_sintomi_seconda_dose___lte(this.ore_durata_sintomi_seconda_dose___lte);
            result.setOre_durata_sintomi_seconda_dose___gt(this.ore_durata_sintomi_seconda_dose___gt);
            result.setOre_durata_sintomi_seconda_dose___gte(this.ore_durata_sintomi_seconda_dose___gte);
            result.setOre_primo_sintomo_prima_dose___eq(this.ore_primo_sintomo_prima_dose___eq);
            result.setOre_primo_sintomo_prima_dose___ne(this.ore_primo_sintomo_prima_dose___ne);
            result.setOre_primo_sintomo_prima_dose___null(this.ore_primo_sintomo_prima_dose___null);
            result.setOre_primo_sintomo_prima_dose___not___null(this.ore_primo_sintomo_prima_dose___not___null);
            result.setOre_primo_sintomo_prima_dose___in(this.ore_primo_sintomo_prima_dose___in);
            result.setOre_primo_sintomo_prima_dose___not___in(this.ore_primo_sintomo_prima_dose___not___in);
            result.setOre_primo_sintomo_prima_dose___lt(this.ore_primo_sintomo_prima_dose___lt);
            result.setOre_primo_sintomo_prima_dose___lte(this.ore_primo_sintomo_prima_dose___lte);
            result.setOre_primo_sintomo_prima_dose___gt(this.ore_primo_sintomo_prima_dose___gt);
            result.setOre_primo_sintomo_prima_dose___gte(this.ore_primo_sintomo_prima_dose___gte);
            result.setOre_primo_sintomo_seconda_dose___eq(this.ore_primo_sintomo_seconda_dose___eq);
            result.setOre_primo_sintomo_seconda_dose___ne(this.ore_primo_sintomo_seconda_dose___ne);
            result.setOre_primo_sintomo_seconda_dose___null(this.ore_primo_sintomo_seconda_dose___null);
            result.setOre_primo_sintomo_seconda_dose___not___null(this.ore_primo_sintomo_seconda_dose___not___null);
            result.setOre_primo_sintomo_seconda_dose___in(this.ore_primo_sintomo_seconda_dose___in);
            result.setOre_primo_sintomo_seconda_dose___not___in(this.ore_primo_sintomo_seconda_dose___not___in);
            result.setOre_primo_sintomo_seconda_dose___lt(this.ore_primo_sintomo_seconda_dose___lt);
            result.setOre_primo_sintomo_seconda_dose___lte(this.ore_primo_sintomo_seconda_dose___lte);
            result.setOre_primo_sintomo_seconda_dose___gt(this.ore_primo_sintomo_seconda_dose___gt);
            result.setOre_primo_sintomo_seconda_dose___gte(this.ore_primo_sintomo_seconda_dose___gte);
            result.setOspedale_prima_dose___eq(this.ospedale_prima_dose___eq);
            result.setOspedale_prima_dose___ne(this.ospedale_prima_dose___ne);
            result.setOspedale_prima_dose___null(this.ospedale_prima_dose___null);
            result.setOspedale_prima_dose___not___null(this.ospedale_prima_dose___not___null);
            result.setOspedale_seconda_dose___eq(this.ospedale_seconda_dose___eq);
            result.setOspedale_seconda_dose___ne(this.ospedale_seconda_dose___ne);
            result.setOspedale_seconda_dose___null(this.ospedale_seconda_dose___null);
            result.setOspedale_seconda_dose___not___null(this.ospedale_seconda_dose___not___null);
            result.setOspedalizzazione___eq(this.ospedalizzazione___eq);
            result.setOspedalizzazione___ne(this.ospedalizzazione___ne);
            result.setOspedalizzazione___null(this.ospedalizzazione___null);
            result.setOspedalizzazione___not___null(this.ospedalizzazione___not___null);
            result.setSeconda_dose___eq(this.seconda_dose___eq);
            result.setSeconda_dose___ne(this.seconda_dose___ne);
            result.setSeconda_dose___null(this.seconda_dose___null);
            result.setSeconda_dose___not___null(this.seconda_dose___not___null);
            result.setTerapia_corticoster___eq(this.terapia_corticoster___eq);
            result.setTerapia_corticoster___ne(this.terapia_corticoster___ne);
            result.setTerapia_corticoster___null(this.terapia_corticoster___null);
            result.setTerapia_corticoster___not___null(this.terapia_corticoster___not___null);
            result.setTerapia_immunosopp___eq(this.terapia_immunosopp___eq);
            result.setTerapia_immunosopp___ne(this.terapia_immunosopp___ne);
            result.setTerapia_immunosopp___null(this.terapia_immunosopp___null);
            result.setTerapia_immunosopp___not___null(this.terapia_immunosopp___not___null);
            result.setTerapia_immunosopp_desc___eq(this.terapia_immunosopp_desc___eq);
            result.setTerapia_immunosopp_desc___ne(this.terapia_immunosopp_desc___ne);
            result.setTerapia_immunosopp_desc___null(this.terapia_immunosopp_desc___null);
            result.setTerapia_immunosopp_desc___not___null(this.terapia_immunosopp_desc___not___null);
            result.setTerapia_immunosopp_desc___in(this.terapia_immunosopp_desc___in);
            result.setTerapia_immunosopp_desc___not___in(this.terapia_immunosopp_desc___not___in);
            result.setTerapia_immunosopp_desc___lt(this.terapia_immunosopp_desc___lt);
            result.setTerapia_immunosopp_desc___lte(this.terapia_immunosopp_desc___lte);
            result.setTerapia_immunosopp_desc___gt(this.terapia_immunosopp_desc___gt);
            result.setTerapia_immunosopp_desc___gte(this.terapia_immunosopp_desc___gte);
            result.setTerapia_immunosopp_desc___contains(this.terapia_immunosopp_desc___contains);
            result.setTerapia_immunosopp_desc___not___contains(this.terapia_immunosopp_desc___not___contains);
            result.setTerapia_immunosopp_desc___starts_with(this.terapia_immunosopp_desc___starts_with);
            result.setTerapia_immunosopp_desc___not___starts_with(this.terapia_immunosopp_desc___not___starts_with);
            result.setTerapia_immunosopp_desc___ends_with(this.terapia_immunosopp_desc___ends_with);
            result.setTerapia_immunosopp_desc___not___ends_with(this.terapia_immunosopp_desc___not___ends_with);
            result.setVax_ico___eq(this.vax_ico___eq);
            result.setVax_ico___ne(this.vax_ico___ne);
            result.setVax_ico___null(this.vax_ico___null);
            result.setVax_ico___not___null(this.vax_ico___not___null);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
