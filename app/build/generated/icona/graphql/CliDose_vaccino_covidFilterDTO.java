package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Dose_vaccino_covid.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliDose_vaccino_covidFilterDTO implements java.io.Serializable {

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
    private String altro_evento___eq;
    private String altro_evento___ne;
    private Boolean altro_evento___null;
    private Boolean altro_evento___not___null;
    private java.util.List<String> altro_evento___in;
    private java.util.List<String> altro_evento___not___in;
    private String altro_evento___lt;
    private String altro_evento___lte;
    private String altro_evento___gt;
    private String altro_evento___gte;
    private String altro_evento___contains;
    private String altro_evento___not___contains;
    private String altro_evento___starts_with;
    private String altro_evento___not___starts_with;
    private String altro_evento___ends_with;
    private String altro_evento___not___ends_with;
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
    private Integer count_eventi___eq;
    private Integer count_eventi___ne;
    private Boolean count_eventi___null;
    private Boolean count_eventi___not___null;
    private java.util.List<Integer> count_eventi___in;
    private java.util.List<Integer> count_eventi___not___in;
    private Integer count_eventi___lt;
    private Integer count_eventi___lte;
    private Integer count_eventi___gt;
    private Integer count_eventi___gte;
    private String data___eq;
    private String data___ne;
    private Boolean data___null;
    private Boolean data___not___null;
    private java.util.List<String> data___in;
    private java.util.List<String> data___not___in;
    private String data___lt;
    private String data___lte;
    private String data___gt;
    private String data___gte;
    private Boolean dose_successiva___eq;
    private Boolean dose_successiva___ne;
    private Boolean dose_successiva___null;
    private Boolean dose_successiva___not___null;
    private String eventi_avversi___eq;
    private String eventi_avversi___ne;
    private Boolean eventi_avversi___null;
    private Boolean eventi_avversi___not___null;
    private java.util.List<String> eventi_avversi___in;
    private java.util.List<String> eventi_avversi___not___in;
    private String eventi_avversi___lt;
    private String eventi_avversi___lte;
    private String eventi_avversi___gt;
    private String eventi_avversi___gte;
    private String eventi_avversi___contains;
    private String eventi_avversi___not___contains;
    private String eventi_avversi___starts_with;
    private String eventi_avversi___not___starts_with;
    private String eventi_avversi___ends_with;
    private String eventi_avversi___not___ends_with;
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
    private Boolean imped_attivita_prima_dose___eq;
    private Boolean imped_attivita_prima_dose___ne;
    private Boolean imped_attivita_prima_dose___null;
    private Boolean imped_attivita_prima_dose___not___null;
    private String motivazioni_dose_successiva___eq;
    private String motivazioni_dose_successiva___ne;
    private Boolean motivazioni_dose_successiva___null;
    private Boolean motivazioni_dose_successiva___not___null;
    private java.util.List<String> motivazioni_dose_successiva___in;
    private java.util.List<String> motivazioni_dose_successiva___not___in;
    private String motivazioni_dose_successiva___lt;
    private String motivazioni_dose_successiva___lte;
    private String motivazioni_dose_successiva___gt;
    private String motivazioni_dose_successiva___gte;
    private String motivazioni_dose_successiva___contains;
    private String motivazioni_dose_successiva___not___contains;
    private String motivazioni_dose_successiva___starts_with;
    private String motivazioni_dose_successiva___not___starts_with;
    private String motivazioni_dose_successiva___ends_with;
    private String motivazioni_dose_successiva___not___ends_with;
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
    private String ore_durata_sintomi_prima_dose_1___eq;
    private String ore_durata_sintomi_prima_dose_1___ne;
    private Boolean ore_durata_sintomi_prima_dose_1___null;
    private Boolean ore_durata_sintomi_prima_dose_1___not___null;
    private java.util.List<String> ore_durata_sintomi_prima_dose_1___in;
    private java.util.List<String> ore_durata_sintomi_prima_dose_1___not___in;
    private String ore_durata_sintomi_prima_dose_1___lt;
    private String ore_durata_sintomi_prima_dose_1___lte;
    private String ore_durata_sintomi_prima_dose_1___gt;
    private String ore_durata_sintomi_prima_dose_1___gte;
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
    private String ore_primo_sintomo_prima_dose_1___eq;
    private String ore_primo_sintomo_prima_dose_1___ne;
    private Boolean ore_primo_sintomo_prima_dose_1___null;
    private Boolean ore_primo_sintomo_prima_dose_1___not___null;
    private java.util.List<String> ore_primo_sintomo_prima_dose_1___in;
    private java.util.List<String> ore_primo_sintomo_prima_dose_1___not___in;
    private String ore_primo_sintomo_prima_dose_1___lt;
    private String ore_primo_sintomo_prima_dose_1___lte;
    private String ore_primo_sintomo_prima_dose_1___gt;
    private String ore_primo_sintomo_prima_dose_1___gte;
    private Boolean ospedale_prima_dose___eq;
    private Boolean ospedale_prima_dose___ne;
    private Boolean ospedale_prima_dose___null;
    private Boolean ospedale_prima_dose___not___null;
    private String vaccino___eq;
    private String vaccino___ne;
    private Boolean vaccino___null;
    private Boolean vaccino___not___null;
    private java.util.List<String> vaccino___in;
    private java.util.List<String> vaccino___not___in;
    private String vaccino___lt;
    private String vaccino___lte;
    private String vaccino___gt;
    private String vaccino___gte;
    private String vaccino___contains;
    private String vaccino___not___contains;
    private String vaccino___starts_with;
    private String vaccino___not___starts_with;
    private String vaccino___ends_with;
    private String vaccino___not___ends_with;
    private java.util.List<CliDose_vaccino_covidFilterDTO> AND;
    private java.util.List<CliDose_vaccino_covidFilterDTO> OR;
    private CliDose_vaccino_covidFilterDTO NOT;

    public CliDose_vaccino_covidFilterDTO() {
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

    public String getAltro_evento___eq() {
        return altro_evento___eq;
    }
    public void setAltro_evento___eq(String altro_evento___eq) {
        this.altro_evento___eq = altro_evento___eq;
    }

    public String getAltro_evento___ne() {
        return altro_evento___ne;
    }
    public void setAltro_evento___ne(String altro_evento___ne) {
        this.altro_evento___ne = altro_evento___ne;
    }

    public Boolean getAltro_evento___null() {
        return altro_evento___null;
    }
    public void setAltro_evento___null(Boolean altro_evento___null) {
        this.altro_evento___null = altro_evento___null;
    }

    public Boolean getAltro_evento___not___null() {
        return altro_evento___not___null;
    }
    public void setAltro_evento___not___null(Boolean altro_evento___not___null) {
        this.altro_evento___not___null = altro_evento___not___null;
    }

    public java.util.List<String> getAltro_evento___in() {
        return altro_evento___in;
    }
    public void setAltro_evento___in(java.util.List<String> altro_evento___in) {
        this.altro_evento___in = altro_evento___in;
    }

    public java.util.List<String> getAltro_evento___not___in() {
        return altro_evento___not___in;
    }
    public void setAltro_evento___not___in(java.util.List<String> altro_evento___not___in) {
        this.altro_evento___not___in = altro_evento___not___in;
    }

    public String getAltro_evento___lt() {
        return altro_evento___lt;
    }
    public void setAltro_evento___lt(String altro_evento___lt) {
        this.altro_evento___lt = altro_evento___lt;
    }

    public String getAltro_evento___lte() {
        return altro_evento___lte;
    }
    public void setAltro_evento___lte(String altro_evento___lte) {
        this.altro_evento___lte = altro_evento___lte;
    }

    public String getAltro_evento___gt() {
        return altro_evento___gt;
    }
    public void setAltro_evento___gt(String altro_evento___gt) {
        this.altro_evento___gt = altro_evento___gt;
    }

    public String getAltro_evento___gte() {
        return altro_evento___gte;
    }
    public void setAltro_evento___gte(String altro_evento___gte) {
        this.altro_evento___gte = altro_evento___gte;
    }

    public String getAltro_evento___contains() {
        return altro_evento___contains;
    }
    public void setAltro_evento___contains(String altro_evento___contains) {
        this.altro_evento___contains = altro_evento___contains;
    }

    public String getAltro_evento___not___contains() {
        return altro_evento___not___contains;
    }
    public void setAltro_evento___not___contains(String altro_evento___not___contains) {
        this.altro_evento___not___contains = altro_evento___not___contains;
    }

    public String getAltro_evento___starts_with() {
        return altro_evento___starts_with;
    }
    public void setAltro_evento___starts_with(String altro_evento___starts_with) {
        this.altro_evento___starts_with = altro_evento___starts_with;
    }

    public String getAltro_evento___not___starts_with() {
        return altro_evento___not___starts_with;
    }
    public void setAltro_evento___not___starts_with(String altro_evento___not___starts_with) {
        this.altro_evento___not___starts_with = altro_evento___not___starts_with;
    }

    public String getAltro_evento___ends_with() {
        return altro_evento___ends_with;
    }
    public void setAltro_evento___ends_with(String altro_evento___ends_with) {
        this.altro_evento___ends_with = altro_evento___ends_with;
    }

    public String getAltro_evento___not___ends_with() {
        return altro_evento___not___ends_with;
    }
    public void setAltro_evento___not___ends_with(String altro_evento___not___ends_with) {
        this.altro_evento___not___ends_with = altro_evento___not___ends_with;
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

    public Integer getCount_eventi___eq() {
        return count_eventi___eq;
    }
    public void setCount_eventi___eq(Integer count_eventi___eq) {
        this.count_eventi___eq = count_eventi___eq;
    }

    public Integer getCount_eventi___ne() {
        return count_eventi___ne;
    }
    public void setCount_eventi___ne(Integer count_eventi___ne) {
        this.count_eventi___ne = count_eventi___ne;
    }

    public Boolean getCount_eventi___null() {
        return count_eventi___null;
    }
    public void setCount_eventi___null(Boolean count_eventi___null) {
        this.count_eventi___null = count_eventi___null;
    }

    public Boolean getCount_eventi___not___null() {
        return count_eventi___not___null;
    }
    public void setCount_eventi___not___null(Boolean count_eventi___not___null) {
        this.count_eventi___not___null = count_eventi___not___null;
    }

    public java.util.List<Integer> getCount_eventi___in() {
        return count_eventi___in;
    }
    public void setCount_eventi___in(java.util.List<Integer> count_eventi___in) {
        this.count_eventi___in = count_eventi___in;
    }

    public java.util.List<Integer> getCount_eventi___not___in() {
        return count_eventi___not___in;
    }
    public void setCount_eventi___not___in(java.util.List<Integer> count_eventi___not___in) {
        this.count_eventi___not___in = count_eventi___not___in;
    }

    public Integer getCount_eventi___lt() {
        return count_eventi___lt;
    }
    public void setCount_eventi___lt(Integer count_eventi___lt) {
        this.count_eventi___lt = count_eventi___lt;
    }

    public Integer getCount_eventi___lte() {
        return count_eventi___lte;
    }
    public void setCount_eventi___lte(Integer count_eventi___lte) {
        this.count_eventi___lte = count_eventi___lte;
    }

    public Integer getCount_eventi___gt() {
        return count_eventi___gt;
    }
    public void setCount_eventi___gt(Integer count_eventi___gt) {
        this.count_eventi___gt = count_eventi___gt;
    }

    public Integer getCount_eventi___gte() {
        return count_eventi___gte;
    }
    public void setCount_eventi___gte(Integer count_eventi___gte) {
        this.count_eventi___gte = count_eventi___gte;
    }

    public String getData___eq() {
        return data___eq;
    }
    public void setData___eq(String data___eq) {
        this.data___eq = data___eq;
    }

    public String getData___ne() {
        return data___ne;
    }
    public void setData___ne(String data___ne) {
        this.data___ne = data___ne;
    }

    public Boolean getData___null() {
        return data___null;
    }
    public void setData___null(Boolean data___null) {
        this.data___null = data___null;
    }

    public Boolean getData___not___null() {
        return data___not___null;
    }
    public void setData___not___null(Boolean data___not___null) {
        this.data___not___null = data___not___null;
    }

    public java.util.List<String> getData___in() {
        return data___in;
    }
    public void setData___in(java.util.List<String> data___in) {
        this.data___in = data___in;
    }

    public java.util.List<String> getData___not___in() {
        return data___not___in;
    }
    public void setData___not___in(java.util.List<String> data___not___in) {
        this.data___not___in = data___not___in;
    }

    public String getData___lt() {
        return data___lt;
    }
    public void setData___lt(String data___lt) {
        this.data___lt = data___lt;
    }

    public String getData___lte() {
        return data___lte;
    }
    public void setData___lte(String data___lte) {
        this.data___lte = data___lte;
    }

    public String getData___gt() {
        return data___gt;
    }
    public void setData___gt(String data___gt) {
        this.data___gt = data___gt;
    }

    public String getData___gte() {
        return data___gte;
    }
    public void setData___gte(String data___gte) {
        this.data___gte = data___gte;
    }

    public Boolean getDose_successiva___eq() {
        return dose_successiva___eq;
    }
    public void setDose_successiva___eq(Boolean dose_successiva___eq) {
        this.dose_successiva___eq = dose_successiva___eq;
    }

    public Boolean getDose_successiva___ne() {
        return dose_successiva___ne;
    }
    public void setDose_successiva___ne(Boolean dose_successiva___ne) {
        this.dose_successiva___ne = dose_successiva___ne;
    }

    public Boolean getDose_successiva___null() {
        return dose_successiva___null;
    }
    public void setDose_successiva___null(Boolean dose_successiva___null) {
        this.dose_successiva___null = dose_successiva___null;
    }

    public Boolean getDose_successiva___not___null() {
        return dose_successiva___not___null;
    }
    public void setDose_successiva___not___null(Boolean dose_successiva___not___null) {
        this.dose_successiva___not___null = dose_successiva___not___null;
    }

    public String getEventi_avversi___eq() {
        return eventi_avversi___eq;
    }
    public void setEventi_avversi___eq(String eventi_avversi___eq) {
        this.eventi_avversi___eq = eventi_avversi___eq;
    }

    public String getEventi_avversi___ne() {
        return eventi_avversi___ne;
    }
    public void setEventi_avversi___ne(String eventi_avversi___ne) {
        this.eventi_avversi___ne = eventi_avversi___ne;
    }

    public Boolean getEventi_avversi___null() {
        return eventi_avversi___null;
    }
    public void setEventi_avversi___null(Boolean eventi_avversi___null) {
        this.eventi_avversi___null = eventi_avversi___null;
    }

    public Boolean getEventi_avversi___not___null() {
        return eventi_avversi___not___null;
    }
    public void setEventi_avversi___not___null(Boolean eventi_avversi___not___null) {
        this.eventi_avversi___not___null = eventi_avversi___not___null;
    }

    public java.util.List<String> getEventi_avversi___in() {
        return eventi_avversi___in;
    }
    public void setEventi_avversi___in(java.util.List<String> eventi_avversi___in) {
        this.eventi_avversi___in = eventi_avversi___in;
    }

    public java.util.List<String> getEventi_avversi___not___in() {
        return eventi_avversi___not___in;
    }
    public void setEventi_avversi___not___in(java.util.List<String> eventi_avversi___not___in) {
        this.eventi_avversi___not___in = eventi_avversi___not___in;
    }

    public String getEventi_avversi___lt() {
        return eventi_avversi___lt;
    }
    public void setEventi_avversi___lt(String eventi_avversi___lt) {
        this.eventi_avversi___lt = eventi_avversi___lt;
    }

    public String getEventi_avversi___lte() {
        return eventi_avversi___lte;
    }
    public void setEventi_avversi___lte(String eventi_avversi___lte) {
        this.eventi_avversi___lte = eventi_avversi___lte;
    }

    public String getEventi_avversi___gt() {
        return eventi_avversi___gt;
    }
    public void setEventi_avversi___gt(String eventi_avversi___gt) {
        this.eventi_avversi___gt = eventi_avversi___gt;
    }

    public String getEventi_avversi___gte() {
        return eventi_avversi___gte;
    }
    public void setEventi_avversi___gte(String eventi_avversi___gte) {
        this.eventi_avversi___gte = eventi_avversi___gte;
    }

    public String getEventi_avversi___contains() {
        return eventi_avversi___contains;
    }
    public void setEventi_avversi___contains(String eventi_avversi___contains) {
        this.eventi_avversi___contains = eventi_avversi___contains;
    }

    public String getEventi_avversi___not___contains() {
        return eventi_avversi___not___contains;
    }
    public void setEventi_avversi___not___contains(String eventi_avversi___not___contains) {
        this.eventi_avversi___not___contains = eventi_avversi___not___contains;
    }

    public String getEventi_avversi___starts_with() {
        return eventi_avversi___starts_with;
    }
    public void setEventi_avversi___starts_with(String eventi_avversi___starts_with) {
        this.eventi_avversi___starts_with = eventi_avversi___starts_with;
    }

    public String getEventi_avversi___not___starts_with() {
        return eventi_avversi___not___starts_with;
    }
    public void setEventi_avversi___not___starts_with(String eventi_avversi___not___starts_with) {
        this.eventi_avversi___not___starts_with = eventi_avversi___not___starts_with;
    }

    public String getEventi_avversi___ends_with() {
        return eventi_avversi___ends_with;
    }
    public void setEventi_avversi___ends_with(String eventi_avversi___ends_with) {
        this.eventi_avversi___ends_with = eventi_avversi___ends_with;
    }

    public String getEventi_avversi___not___ends_with() {
        return eventi_avversi___not___ends_with;
    }
    public void setEventi_avversi___not___ends_with(String eventi_avversi___not___ends_with) {
        this.eventi_avversi___not___ends_with = eventi_avversi___not___ends_with;
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

    public String getMotivazioni_dose_successiva___eq() {
        return motivazioni_dose_successiva___eq;
    }
    public void setMotivazioni_dose_successiva___eq(String motivazioni_dose_successiva___eq) {
        this.motivazioni_dose_successiva___eq = motivazioni_dose_successiva___eq;
    }

    public String getMotivazioni_dose_successiva___ne() {
        return motivazioni_dose_successiva___ne;
    }
    public void setMotivazioni_dose_successiva___ne(String motivazioni_dose_successiva___ne) {
        this.motivazioni_dose_successiva___ne = motivazioni_dose_successiva___ne;
    }

    public Boolean getMotivazioni_dose_successiva___null() {
        return motivazioni_dose_successiva___null;
    }
    public void setMotivazioni_dose_successiva___null(Boolean motivazioni_dose_successiva___null) {
        this.motivazioni_dose_successiva___null = motivazioni_dose_successiva___null;
    }

    public Boolean getMotivazioni_dose_successiva___not___null() {
        return motivazioni_dose_successiva___not___null;
    }
    public void setMotivazioni_dose_successiva___not___null(Boolean motivazioni_dose_successiva___not___null) {
        this.motivazioni_dose_successiva___not___null = motivazioni_dose_successiva___not___null;
    }

    public java.util.List<String> getMotivazioni_dose_successiva___in() {
        return motivazioni_dose_successiva___in;
    }
    public void setMotivazioni_dose_successiva___in(java.util.List<String> motivazioni_dose_successiva___in) {
        this.motivazioni_dose_successiva___in = motivazioni_dose_successiva___in;
    }

    public java.util.List<String> getMotivazioni_dose_successiva___not___in() {
        return motivazioni_dose_successiva___not___in;
    }
    public void setMotivazioni_dose_successiva___not___in(java.util.List<String> motivazioni_dose_successiva___not___in) {
        this.motivazioni_dose_successiva___not___in = motivazioni_dose_successiva___not___in;
    }

    public String getMotivazioni_dose_successiva___lt() {
        return motivazioni_dose_successiva___lt;
    }
    public void setMotivazioni_dose_successiva___lt(String motivazioni_dose_successiva___lt) {
        this.motivazioni_dose_successiva___lt = motivazioni_dose_successiva___lt;
    }

    public String getMotivazioni_dose_successiva___lte() {
        return motivazioni_dose_successiva___lte;
    }
    public void setMotivazioni_dose_successiva___lte(String motivazioni_dose_successiva___lte) {
        this.motivazioni_dose_successiva___lte = motivazioni_dose_successiva___lte;
    }

    public String getMotivazioni_dose_successiva___gt() {
        return motivazioni_dose_successiva___gt;
    }
    public void setMotivazioni_dose_successiva___gt(String motivazioni_dose_successiva___gt) {
        this.motivazioni_dose_successiva___gt = motivazioni_dose_successiva___gt;
    }

    public String getMotivazioni_dose_successiva___gte() {
        return motivazioni_dose_successiva___gte;
    }
    public void setMotivazioni_dose_successiva___gte(String motivazioni_dose_successiva___gte) {
        this.motivazioni_dose_successiva___gte = motivazioni_dose_successiva___gte;
    }

    public String getMotivazioni_dose_successiva___contains() {
        return motivazioni_dose_successiva___contains;
    }
    public void setMotivazioni_dose_successiva___contains(String motivazioni_dose_successiva___contains) {
        this.motivazioni_dose_successiva___contains = motivazioni_dose_successiva___contains;
    }

    public String getMotivazioni_dose_successiva___not___contains() {
        return motivazioni_dose_successiva___not___contains;
    }
    public void setMotivazioni_dose_successiva___not___contains(String motivazioni_dose_successiva___not___contains) {
        this.motivazioni_dose_successiva___not___contains = motivazioni_dose_successiva___not___contains;
    }

    public String getMotivazioni_dose_successiva___starts_with() {
        return motivazioni_dose_successiva___starts_with;
    }
    public void setMotivazioni_dose_successiva___starts_with(String motivazioni_dose_successiva___starts_with) {
        this.motivazioni_dose_successiva___starts_with = motivazioni_dose_successiva___starts_with;
    }

    public String getMotivazioni_dose_successiva___not___starts_with() {
        return motivazioni_dose_successiva___not___starts_with;
    }
    public void setMotivazioni_dose_successiva___not___starts_with(String motivazioni_dose_successiva___not___starts_with) {
        this.motivazioni_dose_successiva___not___starts_with = motivazioni_dose_successiva___not___starts_with;
    }

    public String getMotivazioni_dose_successiva___ends_with() {
        return motivazioni_dose_successiva___ends_with;
    }
    public void setMotivazioni_dose_successiva___ends_with(String motivazioni_dose_successiva___ends_with) {
        this.motivazioni_dose_successiva___ends_with = motivazioni_dose_successiva___ends_with;
    }

    public String getMotivazioni_dose_successiva___not___ends_with() {
        return motivazioni_dose_successiva___not___ends_with;
    }
    public void setMotivazioni_dose_successiva___not___ends_with(String motivazioni_dose_successiva___not___ends_with) {
        this.motivazioni_dose_successiva___not___ends_with = motivazioni_dose_successiva___not___ends_with;
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

    public String getOre_durata_sintomi_prima_dose_1___eq() {
        return ore_durata_sintomi_prima_dose_1___eq;
    }
    public void setOre_durata_sintomi_prima_dose_1___eq(String ore_durata_sintomi_prima_dose_1___eq) {
        this.ore_durata_sintomi_prima_dose_1___eq = ore_durata_sintomi_prima_dose_1___eq;
    }

    public String getOre_durata_sintomi_prima_dose_1___ne() {
        return ore_durata_sintomi_prima_dose_1___ne;
    }
    public void setOre_durata_sintomi_prima_dose_1___ne(String ore_durata_sintomi_prima_dose_1___ne) {
        this.ore_durata_sintomi_prima_dose_1___ne = ore_durata_sintomi_prima_dose_1___ne;
    }

    public Boolean getOre_durata_sintomi_prima_dose_1___null() {
        return ore_durata_sintomi_prima_dose_1___null;
    }
    public void setOre_durata_sintomi_prima_dose_1___null(Boolean ore_durata_sintomi_prima_dose_1___null) {
        this.ore_durata_sintomi_prima_dose_1___null = ore_durata_sintomi_prima_dose_1___null;
    }

    public Boolean getOre_durata_sintomi_prima_dose_1___not___null() {
        return ore_durata_sintomi_prima_dose_1___not___null;
    }
    public void setOre_durata_sintomi_prima_dose_1___not___null(Boolean ore_durata_sintomi_prima_dose_1___not___null) {
        this.ore_durata_sintomi_prima_dose_1___not___null = ore_durata_sintomi_prima_dose_1___not___null;
    }

    public java.util.List<String> getOre_durata_sintomi_prima_dose_1___in() {
        return ore_durata_sintomi_prima_dose_1___in;
    }
    public void setOre_durata_sintomi_prima_dose_1___in(java.util.List<String> ore_durata_sintomi_prima_dose_1___in) {
        this.ore_durata_sintomi_prima_dose_1___in = ore_durata_sintomi_prima_dose_1___in;
    }

    public java.util.List<String> getOre_durata_sintomi_prima_dose_1___not___in() {
        return ore_durata_sintomi_prima_dose_1___not___in;
    }
    public void setOre_durata_sintomi_prima_dose_1___not___in(java.util.List<String> ore_durata_sintomi_prima_dose_1___not___in) {
        this.ore_durata_sintomi_prima_dose_1___not___in = ore_durata_sintomi_prima_dose_1___not___in;
    }

    public String getOre_durata_sintomi_prima_dose_1___lt() {
        return ore_durata_sintomi_prima_dose_1___lt;
    }
    public void setOre_durata_sintomi_prima_dose_1___lt(String ore_durata_sintomi_prima_dose_1___lt) {
        this.ore_durata_sintomi_prima_dose_1___lt = ore_durata_sintomi_prima_dose_1___lt;
    }

    public String getOre_durata_sintomi_prima_dose_1___lte() {
        return ore_durata_sintomi_prima_dose_1___lte;
    }
    public void setOre_durata_sintomi_prima_dose_1___lte(String ore_durata_sintomi_prima_dose_1___lte) {
        this.ore_durata_sintomi_prima_dose_1___lte = ore_durata_sintomi_prima_dose_1___lte;
    }

    public String getOre_durata_sintomi_prima_dose_1___gt() {
        return ore_durata_sintomi_prima_dose_1___gt;
    }
    public void setOre_durata_sintomi_prima_dose_1___gt(String ore_durata_sintomi_prima_dose_1___gt) {
        this.ore_durata_sintomi_prima_dose_1___gt = ore_durata_sintomi_prima_dose_1___gt;
    }

    public String getOre_durata_sintomi_prima_dose_1___gte() {
        return ore_durata_sintomi_prima_dose_1___gte;
    }
    public void setOre_durata_sintomi_prima_dose_1___gte(String ore_durata_sintomi_prima_dose_1___gte) {
        this.ore_durata_sintomi_prima_dose_1___gte = ore_durata_sintomi_prima_dose_1___gte;
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

    public String getOre_primo_sintomo_prima_dose_1___eq() {
        return ore_primo_sintomo_prima_dose_1___eq;
    }
    public void setOre_primo_sintomo_prima_dose_1___eq(String ore_primo_sintomo_prima_dose_1___eq) {
        this.ore_primo_sintomo_prima_dose_1___eq = ore_primo_sintomo_prima_dose_1___eq;
    }

    public String getOre_primo_sintomo_prima_dose_1___ne() {
        return ore_primo_sintomo_prima_dose_1___ne;
    }
    public void setOre_primo_sintomo_prima_dose_1___ne(String ore_primo_sintomo_prima_dose_1___ne) {
        this.ore_primo_sintomo_prima_dose_1___ne = ore_primo_sintomo_prima_dose_1___ne;
    }

    public Boolean getOre_primo_sintomo_prima_dose_1___null() {
        return ore_primo_sintomo_prima_dose_1___null;
    }
    public void setOre_primo_sintomo_prima_dose_1___null(Boolean ore_primo_sintomo_prima_dose_1___null) {
        this.ore_primo_sintomo_prima_dose_1___null = ore_primo_sintomo_prima_dose_1___null;
    }

    public Boolean getOre_primo_sintomo_prima_dose_1___not___null() {
        return ore_primo_sintomo_prima_dose_1___not___null;
    }
    public void setOre_primo_sintomo_prima_dose_1___not___null(Boolean ore_primo_sintomo_prima_dose_1___not___null) {
        this.ore_primo_sintomo_prima_dose_1___not___null = ore_primo_sintomo_prima_dose_1___not___null;
    }

    public java.util.List<String> getOre_primo_sintomo_prima_dose_1___in() {
        return ore_primo_sintomo_prima_dose_1___in;
    }
    public void setOre_primo_sintomo_prima_dose_1___in(java.util.List<String> ore_primo_sintomo_prima_dose_1___in) {
        this.ore_primo_sintomo_prima_dose_1___in = ore_primo_sintomo_prima_dose_1___in;
    }

    public java.util.List<String> getOre_primo_sintomo_prima_dose_1___not___in() {
        return ore_primo_sintomo_prima_dose_1___not___in;
    }
    public void setOre_primo_sintomo_prima_dose_1___not___in(java.util.List<String> ore_primo_sintomo_prima_dose_1___not___in) {
        this.ore_primo_sintomo_prima_dose_1___not___in = ore_primo_sintomo_prima_dose_1___not___in;
    }

    public String getOre_primo_sintomo_prima_dose_1___lt() {
        return ore_primo_sintomo_prima_dose_1___lt;
    }
    public void setOre_primo_sintomo_prima_dose_1___lt(String ore_primo_sintomo_prima_dose_1___lt) {
        this.ore_primo_sintomo_prima_dose_1___lt = ore_primo_sintomo_prima_dose_1___lt;
    }

    public String getOre_primo_sintomo_prima_dose_1___lte() {
        return ore_primo_sintomo_prima_dose_1___lte;
    }
    public void setOre_primo_sintomo_prima_dose_1___lte(String ore_primo_sintomo_prima_dose_1___lte) {
        this.ore_primo_sintomo_prima_dose_1___lte = ore_primo_sintomo_prima_dose_1___lte;
    }

    public String getOre_primo_sintomo_prima_dose_1___gt() {
        return ore_primo_sintomo_prima_dose_1___gt;
    }
    public void setOre_primo_sintomo_prima_dose_1___gt(String ore_primo_sintomo_prima_dose_1___gt) {
        this.ore_primo_sintomo_prima_dose_1___gt = ore_primo_sintomo_prima_dose_1___gt;
    }

    public String getOre_primo_sintomo_prima_dose_1___gte() {
        return ore_primo_sintomo_prima_dose_1___gte;
    }
    public void setOre_primo_sintomo_prima_dose_1___gte(String ore_primo_sintomo_prima_dose_1___gte) {
        this.ore_primo_sintomo_prima_dose_1___gte = ore_primo_sintomo_prima_dose_1___gte;
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

    public String getVaccino___eq() {
        return vaccino___eq;
    }
    public void setVaccino___eq(String vaccino___eq) {
        this.vaccino___eq = vaccino___eq;
    }

    public String getVaccino___ne() {
        return vaccino___ne;
    }
    public void setVaccino___ne(String vaccino___ne) {
        this.vaccino___ne = vaccino___ne;
    }

    public Boolean getVaccino___null() {
        return vaccino___null;
    }
    public void setVaccino___null(Boolean vaccino___null) {
        this.vaccino___null = vaccino___null;
    }

    public Boolean getVaccino___not___null() {
        return vaccino___not___null;
    }
    public void setVaccino___not___null(Boolean vaccino___not___null) {
        this.vaccino___not___null = vaccino___not___null;
    }

    public java.util.List<String> getVaccino___in() {
        return vaccino___in;
    }
    public void setVaccino___in(java.util.List<String> vaccino___in) {
        this.vaccino___in = vaccino___in;
    }

    public java.util.List<String> getVaccino___not___in() {
        return vaccino___not___in;
    }
    public void setVaccino___not___in(java.util.List<String> vaccino___not___in) {
        this.vaccino___not___in = vaccino___not___in;
    }

    public String getVaccino___lt() {
        return vaccino___lt;
    }
    public void setVaccino___lt(String vaccino___lt) {
        this.vaccino___lt = vaccino___lt;
    }

    public String getVaccino___lte() {
        return vaccino___lte;
    }
    public void setVaccino___lte(String vaccino___lte) {
        this.vaccino___lte = vaccino___lte;
    }

    public String getVaccino___gt() {
        return vaccino___gt;
    }
    public void setVaccino___gt(String vaccino___gt) {
        this.vaccino___gt = vaccino___gt;
    }

    public String getVaccino___gte() {
        return vaccino___gte;
    }
    public void setVaccino___gte(String vaccino___gte) {
        this.vaccino___gte = vaccino___gte;
    }

    public String getVaccino___contains() {
        return vaccino___contains;
    }
    public void setVaccino___contains(String vaccino___contains) {
        this.vaccino___contains = vaccino___contains;
    }

    public String getVaccino___not___contains() {
        return vaccino___not___contains;
    }
    public void setVaccino___not___contains(String vaccino___not___contains) {
        this.vaccino___not___contains = vaccino___not___contains;
    }

    public String getVaccino___starts_with() {
        return vaccino___starts_with;
    }
    public void setVaccino___starts_with(String vaccino___starts_with) {
        this.vaccino___starts_with = vaccino___starts_with;
    }

    public String getVaccino___not___starts_with() {
        return vaccino___not___starts_with;
    }
    public void setVaccino___not___starts_with(String vaccino___not___starts_with) {
        this.vaccino___not___starts_with = vaccino___not___starts_with;
    }

    public String getVaccino___ends_with() {
        return vaccino___ends_with;
    }
    public void setVaccino___ends_with(String vaccino___ends_with) {
        this.vaccino___ends_with = vaccino___ends_with;
    }

    public String getVaccino___not___ends_with() {
        return vaccino___not___ends_with;
    }
    public void setVaccino___not___ends_with(String vaccino___not___ends_with) {
        this.vaccino___not___ends_with = vaccino___not___ends_with;
    }

    public java.util.List<CliDose_vaccino_covidFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliDose_vaccino_covidFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliDose_vaccino_covidFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliDose_vaccino_covidFilterDTO> OR) {
        this.OR = OR;
    }

    public CliDose_vaccino_covidFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliDose_vaccino_covidFilterDTO NOT) {
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
        if (altro_evento___eq != null) {
            joiner.add("altro_evento___eq: " + GraphQLRequestSerializer.getEntry(altro_evento___eq));
        }
        if (altro_evento___ne != null) {
            joiner.add("altro_evento___ne: " + GraphQLRequestSerializer.getEntry(altro_evento___ne));
        }
        if (altro_evento___null != null) {
            joiner.add("altro_evento___null: " + GraphQLRequestSerializer.getEntry(altro_evento___null));
        }
        if (altro_evento___not___null != null) {
            joiner.add("altro_evento___not___null: " + GraphQLRequestSerializer.getEntry(altro_evento___not___null));
        }
        if (altro_evento___in != null) {
            joiner.add("altro_evento___in: " + GraphQLRequestSerializer.getEntry(altro_evento___in));
        }
        if (altro_evento___not___in != null) {
            joiner.add("altro_evento___not___in: " + GraphQLRequestSerializer.getEntry(altro_evento___not___in));
        }
        if (altro_evento___lt != null) {
            joiner.add("altro_evento___lt: " + GraphQLRequestSerializer.getEntry(altro_evento___lt));
        }
        if (altro_evento___lte != null) {
            joiner.add("altro_evento___lte: " + GraphQLRequestSerializer.getEntry(altro_evento___lte));
        }
        if (altro_evento___gt != null) {
            joiner.add("altro_evento___gt: " + GraphQLRequestSerializer.getEntry(altro_evento___gt));
        }
        if (altro_evento___gte != null) {
            joiner.add("altro_evento___gte: " + GraphQLRequestSerializer.getEntry(altro_evento___gte));
        }
        if (altro_evento___contains != null) {
            joiner.add("altro_evento___contains: " + GraphQLRequestSerializer.getEntry(altro_evento___contains));
        }
        if (altro_evento___not___contains != null) {
            joiner.add("altro_evento___not___contains: " + GraphQLRequestSerializer.getEntry(altro_evento___not___contains));
        }
        if (altro_evento___starts_with != null) {
            joiner.add("altro_evento___starts_with: " + GraphQLRequestSerializer.getEntry(altro_evento___starts_with));
        }
        if (altro_evento___not___starts_with != null) {
            joiner.add("altro_evento___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_evento___not___starts_with));
        }
        if (altro_evento___ends_with != null) {
            joiner.add("altro_evento___ends_with: " + GraphQLRequestSerializer.getEntry(altro_evento___ends_with));
        }
        if (altro_evento___not___ends_with != null) {
            joiner.add("altro_evento___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_evento___not___ends_with));
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
        if (count_eventi___eq != null) {
            joiner.add("count_eventi___eq: " + GraphQLRequestSerializer.getEntry(count_eventi___eq));
        }
        if (count_eventi___ne != null) {
            joiner.add("count_eventi___ne: " + GraphQLRequestSerializer.getEntry(count_eventi___ne));
        }
        if (count_eventi___null != null) {
            joiner.add("count_eventi___null: " + GraphQLRequestSerializer.getEntry(count_eventi___null));
        }
        if (count_eventi___not___null != null) {
            joiner.add("count_eventi___not___null: " + GraphQLRequestSerializer.getEntry(count_eventi___not___null));
        }
        if (count_eventi___in != null) {
            joiner.add("count_eventi___in: " + GraphQLRequestSerializer.getEntry(count_eventi___in));
        }
        if (count_eventi___not___in != null) {
            joiner.add("count_eventi___not___in: " + GraphQLRequestSerializer.getEntry(count_eventi___not___in));
        }
        if (count_eventi___lt != null) {
            joiner.add("count_eventi___lt: " + GraphQLRequestSerializer.getEntry(count_eventi___lt));
        }
        if (count_eventi___lte != null) {
            joiner.add("count_eventi___lte: " + GraphQLRequestSerializer.getEntry(count_eventi___lte));
        }
        if (count_eventi___gt != null) {
            joiner.add("count_eventi___gt: " + GraphQLRequestSerializer.getEntry(count_eventi___gt));
        }
        if (count_eventi___gte != null) {
            joiner.add("count_eventi___gte: " + GraphQLRequestSerializer.getEntry(count_eventi___gte));
        }
        if (data___eq != null) {
            joiner.add("data___eq: " + GraphQLRequestSerializer.getEntry(data___eq));
        }
        if (data___ne != null) {
            joiner.add("data___ne: " + GraphQLRequestSerializer.getEntry(data___ne));
        }
        if (data___null != null) {
            joiner.add("data___null: " + GraphQLRequestSerializer.getEntry(data___null));
        }
        if (data___not___null != null) {
            joiner.add("data___not___null: " + GraphQLRequestSerializer.getEntry(data___not___null));
        }
        if (data___in != null) {
            joiner.add("data___in: " + GraphQLRequestSerializer.getEntry(data___in));
        }
        if (data___not___in != null) {
            joiner.add("data___not___in: " + GraphQLRequestSerializer.getEntry(data___not___in));
        }
        if (data___lt != null) {
            joiner.add("data___lt: " + GraphQLRequestSerializer.getEntry(data___lt));
        }
        if (data___lte != null) {
            joiner.add("data___lte: " + GraphQLRequestSerializer.getEntry(data___lte));
        }
        if (data___gt != null) {
            joiner.add("data___gt: " + GraphQLRequestSerializer.getEntry(data___gt));
        }
        if (data___gte != null) {
            joiner.add("data___gte: " + GraphQLRequestSerializer.getEntry(data___gte));
        }
        if (dose_successiva___eq != null) {
            joiner.add("dose_successiva___eq: " + GraphQLRequestSerializer.getEntry(dose_successiva___eq));
        }
        if (dose_successiva___ne != null) {
            joiner.add("dose_successiva___ne: " + GraphQLRequestSerializer.getEntry(dose_successiva___ne));
        }
        if (dose_successiva___null != null) {
            joiner.add("dose_successiva___null: " + GraphQLRequestSerializer.getEntry(dose_successiva___null));
        }
        if (dose_successiva___not___null != null) {
            joiner.add("dose_successiva___not___null: " + GraphQLRequestSerializer.getEntry(dose_successiva___not___null));
        }
        if (eventi_avversi___eq != null) {
            joiner.add("eventi_avversi___eq: " + GraphQLRequestSerializer.getEntry(eventi_avversi___eq));
        }
        if (eventi_avversi___ne != null) {
            joiner.add("eventi_avversi___ne: " + GraphQLRequestSerializer.getEntry(eventi_avversi___ne));
        }
        if (eventi_avversi___null != null) {
            joiner.add("eventi_avversi___null: " + GraphQLRequestSerializer.getEntry(eventi_avversi___null));
        }
        if (eventi_avversi___not___null != null) {
            joiner.add("eventi_avversi___not___null: " + GraphQLRequestSerializer.getEntry(eventi_avversi___not___null));
        }
        if (eventi_avversi___in != null) {
            joiner.add("eventi_avversi___in: " + GraphQLRequestSerializer.getEntry(eventi_avversi___in));
        }
        if (eventi_avversi___not___in != null) {
            joiner.add("eventi_avversi___not___in: " + GraphQLRequestSerializer.getEntry(eventi_avversi___not___in));
        }
        if (eventi_avversi___lt != null) {
            joiner.add("eventi_avversi___lt: " + GraphQLRequestSerializer.getEntry(eventi_avversi___lt));
        }
        if (eventi_avversi___lte != null) {
            joiner.add("eventi_avversi___lte: " + GraphQLRequestSerializer.getEntry(eventi_avversi___lte));
        }
        if (eventi_avversi___gt != null) {
            joiner.add("eventi_avversi___gt: " + GraphQLRequestSerializer.getEntry(eventi_avversi___gt));
        }
        if (eventi_avversi___gte != null) {
            joiner.add("eventi_avversi___gte: " + GraphQLRequestSerializer.getEntry(eventi_avversi___gte));
        }
        if (eventi_avversi___contains != null) {
            joiner.add("eventi_avversi___contains: " + GraphQLRequestSerializer.getEntry(eventi_avversi___contains));
        }
        if (eventi_avversi___not___contains != null) {
            joiner.add("eventi_avversi___not___contains: " + GraphQLRequestSerializer.getEntry(eventi_avversi___not___contains));
        }
        if (eventi_avversi___starts_with != null) {
            joiner.add("eventi_avversi___starts_with: " + GraphQLRequestSerializer.getEntry(eventi_avversi___starts_with));
        }
        if (eventi_avversi___not___starts_with != null) {
            joiner.add("eventi_avversi___not___starts_with: " + GraphQLRequestSerializer.getEntry(eventi_avversi___not___starts_with));
        }
        if (eventi_avversi___ends_with != null) {
            joiner.add("eventi_avversi___ends_with: " + GraphQLRequestSerializer.getEntry(eventi_avversi___ends_with));
        }
        if (eventi_avversi___not___ends_with != null) {
            joiner.add("eventi_avversi___not___ends_with: " + GraphQLRequestSerializer.getEntry(eventi_avversi___not___ends_with));
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
        if (motivazioni_dose_successiva___eq != null) {
            joiner.add("motivazioni_dose_successiva___eq: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___eq));
        }
        if (motivazioni_dose_successiva___ne != null) {
            joiner.add("motivazioni_dose_successiva___ne: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___ne));
        }
        if (motivazioni_dose_successiva___null != null) {
            joiner.add("motivazioni_dose_successiva___null: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___null));
        }
        if (motivazioni_dose_successiva___not___null != null) {
            joiner.add("motivazioni_dose_successiva___not___null: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___not___null));
        }
        if (motivazioni_dose_successiva___in != null) {
            joiner.add("motivazioni_dose_successiva___in: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___in));
        }
        if (motivazioni_dose_successiva___not___in != null) {
            joiner.add("motivazioni_dose_successiva___not___in: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___not___in));
        }
        if (motivazioni_dose_successiva___lt != null) {
            joiner.add("motivazioni_dose_successiva___lt: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___lt));
        }
        if (motivazioni_dose_successiva___lte != null) {
            joiner.add("motivazioni_dose_successiva___lte: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___lte));
        }
        if (motivazioni_dose_successiva___gt != null) {
            joiner.add("motivazioni_dose_successiva___gt: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___gt));
        }
        if (motivazioni_dose_successiva___gte != null) {
            joiner.add("motivazioni_dose_successiva___gte: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___gte));
        }
        if (motivazioni_dose_successiva___contains != null) {
            joiner.add("motivazioni_dose_successiva___contains: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___contains));
        }
        if (motivazioni_dose_successiva___not___contains != null) {
            joiner.add("motivazioni_dose_successiva___not___contains: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___not___contains));
        }
        if (motivazioni_dose_successiva___starts_with != null) {
            joiner.add("motivazioni_dose_successiva___starts_with: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___starts_with));
        }
        if (motivazioni_dose_successiva___not___starts_with != null) {
            joiner.add("motivazioni_dose_successiva___not___starts_with: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___not___starts_with));
        }
        if (motivazioni_dose_successiva___ends_with != null) {
            joiner.add("motivazioni_dose_successiva___ends_with: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___ends_with));
        }
        if (motivazioni_dose_successiva___not___ends_with != null) {
            joiner.add("motivazioni_dose_successiva___not___ends_with: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva___not___ends_with));
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
        if (ore_durata_sintomi_prima_dose_1___eq != null) {
            joiner.add("ore_durata_sintomi_prima_dose_1___eq: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose_1___eq));
        }
        if (ore_durata_sintomi_prima_dose_1___ne != null) {
            joiner.add("ore_durata_sintomi_prima_dose_1___ne: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose_1___ne));
        }
        if (ore_durata_sintomi_prima_dose_1___null != null) {
            joiner.add("ore_durata_sintomi_prima_dose_1___null: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose_1___null));
        }
        if (ore_durata_sintomi_prima_dose_1___not___null != null) {
            joiner.add("ore_durata_sintomi_prima_dose_1___not___null: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose_1___not___null));
        }
        if (ore_durata_sintomi_prima_dose_1___in != null) {
            joiner.add("ore_durata_sintomi_prima_dose_1___in: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose_1___in));
        }
        if (ore_durata_sintomi_prima_dose_1___not___in != null) {
            joiner.add("ore_durata_sintomi_prima_dose_1___not___in: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose_1___not___in));
        }
        if (ore_durata_sintomi_prima_dose_1___lt != null) {
            joiner.add("ore_durata_sintomi_prima_dose_1___lt: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose_1___lt));
        }
        if (ore_durata_sintomi_prima_dose_1___lte != null) {
            joiner.add("ore_durata_sintomi_prima_dose_1___lte: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose_1___lte));
        }
        if (ore_durata_sintomi_prima_dose_1___gt != null) {
            joiner.add("ore_durata_sintomi_prima_dose_1___gt: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose_1___gt));
        }
        if (ore_durata_sintomi_prima_dose_1___gte != null) {
            joiner.add("ore_durata_sintomi_prima_dose_1___gte: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose_1___gte));
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
        if (ore_primo_sintomo_prima_dose_1___eq != null) {
            joiner.add("ore_primo_sintomo_prima_dose_1___eq: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose_1___eq));
        }
        if (ore_primo_sintomo_prima_dose_1___ne != null) {
            joiner.add("ore_primo_sintomo_prima_dose_1___ne: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose_1___ne));
        }
        if (ore_primo_sintomo_prima_dose_1___null != null) {
            joiner.add("ore_primo_sintomo_prima_dose_1___null: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose_1___null));
        }
        if (ore_primo_sintomo_prima_dose_1___not___null != null) {
            joiner.add("ore_primo_sintomo_prima_dose_1___not___null: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose_1___not___null));
        }
        if (ore_primo_sintomo_prima_dose_1___in != null) {
            joiner.add("ore_primo_sintomo_prima_dose_1___in: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose_1___in));
        }
        if (ore_primo_sintomo_prima_dose_1___not___in != null) {
            joiner.add("ore_primo_sintomo_prima_dose_1___not___in: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose_1___not___in));
        }
        if (ore_primo_sintomo_prima_dose_1___lt != null) {
            joiner.add("ore_primo_sintomo_prima_dose_1___lt: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose_1___lt));
        }
        if (ore_primo_sintomo_prima_dose_1___lte != null) {
            joiner.add("ore_primo_sintomo_prima_dose_1___lte: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose_1___lte));
        }
        if (ore_primo_sintomo_prima_dose_1___gt != null) {
            joiner.add("ore_primo_sintomo_prima_dose_1___gt: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose_1___gt));
        }
        if (ore_primo_sintomo_prima_dose_1___gte != null) {
            joiner.add("ore_primo_sintomo_prima_dose_1___gte: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose_1___gte));
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
        if (vaccino___eq != null) {
            joiner.add("vaccino___eq: " + GraphQLRequestSerializer.getEntry(vaccino___eq));
        }
        if (vaccino___ne != null) {
            joiner.add("vaccino___ne: " + GraphQLRequestSerializer.getEntry(vaccino___ne));
        }
        if (vaccino___null != null) {
            joiner.add("vaccino___null: " + GraphQLRequestSerializer.getEntry(vaccino___null));
        }
        if (vaccino___not___null != null) {
            joiner.add("vaccino___not___null: " + GraphQLRequestSerializer.getEntry(vaccino___not___null));
        }
        if (vaccino___in != null) {
            joiner.add("vaccino___in: " + GraphQLRequestSerializer.getEntry(vaccino___in));
        }
        if (vaccino___not___in != null) {
            joiner.add("vaccino___not___in: " + GraphQLRequestSerializer.getEntry(vaccino___not___in));
        }
        if (vaccino___lt != null) {
            joiner.add("vaccino___lt: " + GraphQLRequestSerializer.getEntry(vaccino___lt));
        }
        if (vaccino___lte != null) {
            joiner.add("vaccino___lte: " + GraphQLRequestSerializer.getEntry(vaccino___lte));
        }
        if (vaccino___gt != null) {
            joiner.add("vaccino___gt: " + GraphQLRequestSerializer.getEntry(vaccino___gt));
        }
        if (vaccino___gte != null) {
            joiner.add("vaccino___gte: " + GraphQLRequestSerializer.getEntry(vaccino___gte));
        }
        if (vaccino___contains != null) {
            joiner.add("vaccino___contains: " + GraphQLRequestSerializer.getEntry(vaccino___contains));
        }
        if (vaccino___not___contains != null) {
            joiner.add("vaccino___not___contains: " + GraphQLRequestSerializer.getEntry(vaccino___not___contains));
        }
        if (vaccino___starts_with != null) {
            joiner.add("vaccino___starts_with: " + GraphQLRequestSerializer.getEntry(vaccino___starts_with));
        }
        if (vaccino___not___starts_with != null) {
            joiner.add("vaccino___not___starts_with: " + GraphQLRequestSerializer.getEntry(vaccino___not___starts_with));
        }
        if (vaccino___ends_with != null) {
            joiner.add("vaccino___ends_with: " + GraphQLRequestSerializer.getEntry(vaccino___ends_with));
        }
        if (vaccino___not___ends_with != null) {
            joiner.add("vaccino___not___ends_with: " + GraphQLRequestSerializer.getEntry(vaccino___not___ends_with));
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

    public static CliDose_vaccino_covidFilterDTO.Builder builder() {
        return new CliDose_vaccino_covidFilterDTO.Builder();
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
        private String altro_evento___eq;
        private String altro_evento___ne;
        private Boolean altro_evento___null;
        private Boolean altro_evento___not___null;
        private java.util.List<String> altro_evento___in;
        private java.util.List<String> altro_evento___not___in;
        private String altro_evento___lt;
        private String altro_evento___lte;
        private String altro_evento___gt;
        private String altro_evento___gte;
        private String altro_evento___contains;
        private String altro_evento___not___contains;
        private String altro_evento___starts_with;
        private String altro_evento___not___starts_with;
        private String altro_evento___ends_with;
        private String altro_evento___not___ends_with;
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
        private Integer count_eventi___eq;
        private Integer count_eventi___ne;
        private Boolean count_eventi___null;
        private Boolean count_eventi___not___null;
        private java.util.List<Integer> count_eventi___in;
        private java.util.List<Integer> count_eventi___not___in;
        private Integer count_eventi___lt;
        private Integer count_eventi___lte;
        private Integer count_eventi___gt;
        private Integer count_eventi___gte;
        private String data___eq;
        private String data___ne;
        private Boolean data___null;
        private Boolean data___not___null;
        private java.util.List<String> data___in;
        private java.util.List<String> data___not___in;
        private String data___lt;
        private String data___lte;
        private String data___gt;
        private String data___gte;
        private Boolean dose_successiva___eq;
        private Boolean dose_successiva___ne;
        private Boolean dose_successiva___null;
        private Boolean dose_successiva___not___null;
        private String eventi_avversi___eq;
        private String eventi_avversi___ne;
        private Boolean eventi_avversi___null;
        private Boolean eventi_avversi___not___null;
        private java.util.List<String> eventi_avversi___in;
        private java.util.List<String> eventi_avversi___not___in;
        private String eventi_avversi___lt;
        private String eventi_avversi___lte;
        private String eventi_avversi___gt;
        private String eventi_avversi___gte;
        private String eventi_avversi___contains;
        private String eventi_avversi___not___contains;
        private String eventi_avversi___starts_with;
        private String eventi_avversi___not___starts_with;
        private String eventi_avversi___ends_with;
        private String eventi_avversi___not___ends_with;
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
        private Boolean imped_attivita_prima_dose___eq;
        private Boolean imped_attivita_prima_dose___ne;
        private Boolean imped_attivita_prima_dose___null;
        private Boolean imped_attivita_prima_dose___not___null;
        private String motivazioni_dose_successiva___eq;
        private String motivazioni_dose_successiva___ne;
        private Boolean motivazioni_dose_successiva___null;
        private Boolean motivazioni_dose_successiva___not___null;
        private java.util.List<String> motivazioni_dose_successiva___in;
        private java.util.List<String> motivazioni_dose_successiva___not___in;
        private String motivazioni_dose_successiva___lt;
        private String motivazioni_dose_successiva___lte;
        private String motivazioni_dose_successiva___gt;
        private String motivazioni_dose_successiva___gte;
        private String motivazioni_dose_successiva___contains;
        private String motivazioni_dose_successiva___not___contains;
        private String motivazioni_dose_successiva___starts_with;
        private String motivazioni_dose_successiva___not___starts_with;
        private String motivazioni_dose_successiva___ends_with;
        private String motivazioni_dose_successiva___not___ends_with;
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
        private String ore_durata_sintomi_prima_dose_1___eq;
        private String ore_durata_sintomi_prima_dose_1___ne;
        private Boolean ore_durata_sintomi_prima_dose_1___null;
        private Boolean ore_durata_sintomi_prima_dose_1___not___null;
        private java.util.List<String> ore_durata_sintomi_prima_dose_1___in;
        private java.util.List<String> ore_durata_sintomi_prima_dose_1___not___in;
        private String ore_durata_sintomi_prima_dose_1___lt;
        private String ore_durata_sintomi_prima_dose_1___lte;
        private String ore_durata_sintomi_prima_dose_1___gt;
        private String ore_durata_sintomi_prima_dose_1___gte;
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
        private String ore_primo_sintomo_prima_dose_1___eq;
        private String ore_primo_sintomo_prima_dose_1___ne;
        private Boolean ore_primo_sintomo_prima_dose_1___null;
        private Boolean ore_primo_sintomo_prima_dose_1___not___null;
        private java.util.List<String> ore_primo_sintomo_prima_dose_1___in;
        private java.util.List<String> ore_primo_sintomo_prima_dose_1___not___in;
        private String ore_primo_sintomo_prima_dose_1___lt;
        private String ore_primo_sintomo_prima_dose_1___lte;
        private String ore_primo_sintomo_prima_dose_1___gt;
        private String ore_primo_sintomo_prima_dose_1___gte;
        private Boolean ospedale_prima_dose___eq;
        private Boolean ospedale_prima_dose___ne;
        private Boolean ospedale_prima_dose___null;
        private Boolean ospedale_prima_dose___not___null;
        private String vaccino___eq;
        private String vaccino___ne;
        private Boolean vaccino___null;
        private Boolean vaccino___not___null;
        private java.util.List<String> vaccino___in;
        private java.util.List<String> vaccino___not___in;
        private String vaccino___lt;
        private String vaccino___lte;
        private String vaccino___gt;
        private String vaccino___gte;
        private String vaccino___contains;
        private String vaccino___not___contains;
        private String vaccino___starts_with;
        private String vaccino___not___starts_with;
        private String vaccino___ends_with;
        private String vaccino___not___ends_with;
        private java.util.List<CliDose_vaccino_covidFilterDTO> AND;
        private java.util.List<CliDose_vaccino_covidFilterDTO> OR;
        private CliDose_vaccino_covidFilterDTO NOT;

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

        public Builder setAltro_evento___eq(String altro_evento___eq) {
            this.altro_evento___eq = altro_evento___eq;
            return this;
        }

        public Builder setAltro_evento___ne(String altro_evento___ne) {
            this.altro_evento___ne = altro_evento___ne;
            return this;
        }

        public Builder setAltro_evento___null(Boolean altro_evento___null) {
            this.altro_evento___null = altro_evento___null;
            return this;
        }

        public Builder setAltro_evento___not___null(Boolean altro_evento___not___null) {
            this.altro_evento___not___null = altro_evento___not___null;
            return this;
        }

        public Builder setAltro_evento___in(java.util.List<String> altro_evento___in) {
            this.altro_evento___in = altro_evento___in;
            return this;
        }

        public Builder setAltro_evento___not___in(java.util.List<String> altro_evento___not___in) {
            this.altro_evento___not___in = altro_evento___not___in;
            return this;
        }

        public Builder setAltro_evento___lt(String altro_evento___lt) {
            this.altro_evento___lt = altro_evento___lt;
            return this;
        }

        public Builder setAltro_evento___lte(String altro_evento___lte) {
            this.altro_evento___lte = altro_evento___lte;
            return this;
        }

        public Builder setAltro_evento___gt(String altro_evento___gt) {
            this.altro_evento___gt = altro_evento___gt;
            return this;
        }

        public Builder setAltro_evento___gte(String altro_evento___gte) {
            this.altro_evento___gte = altro_evento___gte;
            return this;
        }

        public Builder setAltro_evento___contains(String altro_evento___contains) {
            this.altro_evento___contains = altro_evento___contains;
            return this;
        }

        public Builder setAltro_evento___not___contains(String altro_evento___not___contains) {
            this.altro_evento___not___contains = altro_evento___not___contains;
            return this;
        }

        public Builder setAltro_evento___starts_with(String altro_evento___starts_with) {
            this.altro_evento___starts_with = altro_evento___starts_with;
            return this;
        }

        public Builder setAltro_evento___not___starts_with(String altro_evento___not___starts_with) {
            this.altro_evento___not___starts_with = altro_evento___not___starts_with;
            return this;
        }

        public Builder setAltro_evento___ends_with(String altro_evento___ends_with) {
            this.altro_evento___ends_with = altro_evento___ends_with;
            return this;
        }

        public Builder setAltro_evento___not___ends_with(String altro_evento___not___ends_with) {
            this.altro_evento___not___ends_with = altro_evento___not___ends_with;
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

        public Builder setCount_eventi___eq(Integer count_eventi___eq) {
            this.count_eventi___eq = count_eventi___eq;
            return this;
        }

        public Builder setCount_eventi___ne(Integer count_eventi___ne) {
            this.count_eventi___ne = count_eventi___ne;
            return this;
        }

        public Builder setCount_eventi___null(Boolean count_eventi___null) {
            this.count_eventi___null = count_eventi___null;
            return this;
        }

        public Builder setCount_eventi___not___null(Boolean count_eventi___not___null) {
            this.count_eventi___not___null = count_eventi___not___null;
            return this;
        }

        public Builder setCount_eventi___in(java.util.List<Integer> count_eventi___in) {
            this.count_eventi___in = count_eventi___in;
            return this;
        }

        public Builder setCount_eventi___not___in(java.util.List<Integer> count_eventi___not___in) {
            this.count_eventi___not___in = count_eventi___not___in;
            return this;
        }

        public Builder setCount_eventi___lt(Integer count_eventi___lt) {
            this.count_eventi___lt = count_eventi___lt;
            return this;
        }

        public Builder setCount_eventi___lte(Integer count_eventi___lte) {
            this.count_eventi___lte = count_eventi___lte;
            return this;
        }

        public Builder setCount_eventi___gt(Integer count_eventi___gt) {
            this.count_eventi___gt = count_eventi___gt;
            return this;
        }

        public Builder setCount_eventi___gte(Integer count_eventi___gte) {
            this.count_eventi___gte = count_eventi___gte;
            return this;
        }

        public Builder setData___eq(String data___eq) {
            this.data___eq = data___eq;
            return this;
        }

        public Builder setData___ne(String data___ne) {
            this.data___ne = data___ne;
            return this;
        }

        public Builder setData___null(Boolean data___null) {
            this.data___null = data___null;
            return this;
        }

        public Builder setData___not___null(Boolean data___not___null) {
            this.data___not___null = data___not___null;
            return this;
        }

        public Builder setData___in(java.util.List<String> data___in) {
            this.data___in = data___in;
            return this;
        }

        public Builder setData___not___in(java.util.List<String> data___not___in) {
            this.data___not___in = data___not___in;
            return this;
        }

        public Builder setData___lt(String data___lt) {
            this.data___lt = data___lt;
            return this;
        }

        public Builder setData___lte(String data___lte) {
            this.data___lte = data___lte;
            return this;
        }

        public Builder setData___gt(String data___gt) {
            this.data___gt = data___gt;
            return this;
        }

        public Builder setData___gte(String data___gte) {
            this.data___gte = data___gte;
            return this;
        }

        public Builder setDose_successiva___eq(Boolean dose_successiva___eq) {
            this.dose_successiva___eq = dose_successiva___eq;
            return this;
        }

        public Builder setDose_successiva___ne(Boolean dose_successiva___ne) {
            this.dose_successiva___ne = dose_successiva___ne;
            return this;
        }

        public Builder setDose_successiva___null(Boolean dose_successiva___null) {
            this.dose_successiva___null = dose_successiva___null;
            return this;
        }

        public Builder setDose_successiva___not___null(Boolean dose_successiva___not___null) {
            this.dose_successiva___not___null = dose_successiva___not___null;
            return this;
        }

        public Builder setEventi_avversi___eq(String eventi_avversi___eq) {
            this.eventi_avversi___eq = eventi_avversi___eq;
            return this;
        }

        public Builder setEventi_avversi___ne(String eventi_avversi___ne) {
            this.eventi_avversi___ne = eventi_avversi___ne;
            return this;
        }

        public Builder setEventi_avversi___null(Boolean eventi_avversi___null) {
            this.eventi_avversi___null = eventi_avversi___null;
            return this;
        }

        public Builder setEventi_avversi___not___null(Boolean eventi_avversi___not___null) {
            this.eventi_avversi___not___null = eventi_avversi___not___null;
            return this;
        }

        public Builder setEventi_avversi___in(java.util.List<String> eventi_avversi___in) {
            this.eventi_avversi___in = eventi_avversi___in;
            return this;
        }

        public Builder setEventi_avversi___not___in(java.util.List<String> eventi_avversi___not___in) {
            this.eventi_avversi___not___in = eventi_avversi___not___in;
            return this;
        }

        public Builder setEventi_avversi___lt(String eventi_avversi___lt) {
            this.eventi_avversi___lt = eventi_avversi___lt;
            return this;
        }

        public Builder setEventi_avversi___lte(String eventi_avversi___lte) {
            this.eventi_avversi___lte = eventi_avversi___lte;
            return this;
        }

        public Builder setEventi_avversi___gt(String eventi_avversi___gt) {
            this.eventi_avversi___gt = eventi_avversi___gt;
            return this;
        }

        public Builder setEventi_avversi___gte(String eventi_avversi___gte) {
            this.eventi_avversi___gte = eventi_avversi___gte;
            return this;
        }

        public Builder setEventi_avversi___contains(String eventi_avversi___contains) {
            this.eventi_avversi___contains = eventi_avversi___contains;
            return this;
        }

        public Builder setEventi_avversi___not___contains(String eventi_avversi___not___contains) {
            this.eventi_avversi___not___contains = eventi_avversi___not___contains;
            return this;
        }

        public Builder setEventi_avversi___starts_with(String eventi_avversi___starts_with) {
            this.eventi_avversi___starts_with = eventi_avversi___starts_with;
            return this;
        }

        public Builder setEventi_avversi___not___starts_with(String eventi_avversi___not___starts_with) {
            this.eventi_avversi___not___starts_with = eventi_avversi___not___starts_with;
            return this;
        }

        public Builder setEventi_avversi___ends_with(String eventi_avversi___ends_with) {
            this.eventi_avversi___ends_with = eventi_avversi___ends_with;
            return this;
        }

        public Builder setEventi_avversi___not___ends_with(String eventi_avversi___not___ends_with) {
            this.eventi_avversi___not___ends_with = eventi_avversi___not___ends_with;
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

        public Builder setMotivazioni_dose_successiva___eq(String motivazioni_dose_successiva___eq) {
            this.motivazioni_dose_successiva___eq = motivazioni_dose_successiva___eq;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___ne(String motivazioni_dose_successiva___ne) {
            this.motivazioni_dose_successiva___ne = motivazioni_dose_successiva___ne;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___null(Boolean motivazioni_dose_successiva___null) {
            this.motivazioni_dose_successiva___null = motivazioni_dose_successiva___null;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___not___null(Boolean motivazioni_dose_successiva___not___null) {
            this.motivazioni_dose_successiva___not___null = motivazioni_dose_successiva___not___null;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___in(java.util.List<String> motivazioni_dose_successiva___in) {
            this.motivazioni_dose_successiva___in = motivazioni_dose_successiva___in;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___not___in(java.util.List<String> motivazioni_dose_successiva___not___in) {
            this.motivazioni_dose_successiva___not___in = motivazioni_dose_successiva___not___in;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___lt(String motivazioni_dose_successiva___lt) {
            this.motivazioni_dose_successiva___lt = motivazioni_dose_successiva___lt;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___lte(String motivazioni_dose_successiva___lte) {
            this.motivazioni_dose_successiva___lte = motivazioni_dose_successiva___lte;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___gt(String motivazioni_dose_successiva___gt) {
            this.motivazioni_dose_successiva___gt = motivazioni_dose_successiva___gt;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___gte(String motivazioni_dose_successiva___gte) {
            this.motivazioni_dose_successiva___gte = motivazioni_dose_successiva___gte;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___contains(String motivazioni_dose_successiva___contains) {
            this.motivazioni_dose_successiva___contains = motivazioni_dose_successiva___contains;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___not___contains(String motivazioni_dose_successiva___not___contains) {
            this.motivazioni_dose_successiva___not___contains = motivazioni_dose_successiva___not___contains;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___starts_with(String motivazioni_dose_successiva___starts_with) {
            this.motivazioni_dose_successiva___starts_with = motivazioni_dose_successiva___starts_with;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___not___starts_with(String motivazioni_dose_successiva___not___starts_with) {
            this.motivazioni_dose_successiva___not___starts_with = motivazioni_dose_successiva___not___starts_with;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___ends_with(String motivazioni_dose_successiva___ends_with) {
            this.motivazioni_dose_successiva___ends_with = motivazioni_dose_successiva___ends_with;
            return this;
        }

        public Builder setMotivazioni_dose_successiva___not___ends_with(String motivazioni_dose_successiva___not___ends_with) {
            this.motivazioni_dose_successiva___not___ends_with = motivazioni_dose_successiva___not___ends_with;
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

        public Builder setOre_durata_sintomi_prima_dose_1___eq(String ore_durata_sintomi_prima_dose_1___eq) {
            this.ore_durata_sintomi_prima_dose_1___eq = ore_durata_sintomi_prima_dose_1___eq;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose_1___ne(String ore_durata_sintomi_prima_dose_1___ne) {
            this.ore_durata_sintomi_prima_dose_1___ne = ore_durata_sintomi_prima_dose_1___ne;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose_1___null(Boolean ore_durata_sintomi_prima_dose_1___null) {
            this.ore_durata_sintomi_prima_dose_1___null = ore_durata_sintomi_prima_dose_1___null;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose_1___not___null(Boolean ore_durata_sintomi_prima_dose_1___not___null) {
            this.ore_durata_sintomi_prima_dose_1___not___null = ore_durata_sintomi_prima_dose_1___not___null;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose_1___in(java.util.List<String> ore_durata_sintomi_prima_dose_1___in) {
            this.ore_durata_sintomi_prima_dose_1___in = ore_durata_sintomi_prima_dose_1___in;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose_1___not___in(java.util.List<String> ore_durata_sintomi_prima_dose_1___not___in) {
            this.ore_durata_sintomi_prima_dose_1___not___in = ore_durata_sintomi_prima_dose_1___not___in;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose_1___lt(String ore_durata_sintomi_prima_dose_1___lt) {
            this.ore_durata_sintomi_prima_dose_1___lt = ore_durata_sintomi_prima_dose_1___lt;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose_1___lte(String ore_durata_sintomi_prima_dose_1___lte) {
            this.ore_durata_sintomi_prima_dose_1___lte = ore_durata_sintomi_prima_dose_1___lte;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose_1___gt(String ore_durata_sintomi_prima_dose_1___gt) {
            this.ore_durata_sintomi_prima_dose_1___gt = ore_durata_sintomi_prima_dose_1___gt;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose_1___gte(String ore_durata_sintomi_prima_dose_1___gte) {
            this.ore_durata_sintomi_prima_dose_1___gte = ore_durata_sintomi_prima_dose_1___gte;
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

        public Builder setOre_primo_sintomo_prima_dose_1___eq(String ore_primo_sintomo_prima_dose_1___eq) {
            this.ore_primo_sintomo_prima_dose_1___eq = ore_primo_sintomo_prima_dose_1___eq;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose_1___ne(String ore_primo_sintomo_prima_dose_1___ne) {
            this.ore_primo_sintomo_prima_dose_1___ne = ore_primo_sintomo_prima_dose_1___ne;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose_1___null(Boolean ore_primo_sintomo_prima_dose_1___null) {
            this.ore_primo_sintomo_prima_dose_1___null = ore_primo_sintomo_prima_dose_1___null;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose_1___not___null(Boolean ore_primo_sintomo_prima_dose_1___not___null) {
            this.ore_primo_sintomo_prima_dose_1___not___null = ore_primo_sintomo_prima_dose_1___not___null;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose_1___in(java.util.List<String> ore_primo_sintomo_prima_dose_1___in) {
            this.ore_primo_sintomo_prima_dose_1___in = ore_primo_sintomo_prima_dose_1___in;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose_1___not___in(java.util.List<String> ore_primo_sintomo_prima_dose_1___not___in) {
            this.ore_primo_sintomo_prima_dose_1___not___in = ore_primo_sintomo_prima_dose_1___not___in;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose_1___lt(String ore_primo_sintomo_prima_dose_1___lt) {
            this.ore_primo_sintomo_prima_dose_1___lt = ore_primo_sintomo_prima_dose_1___lt;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose_1___lte(String ore_primo_sintomo_prima_dose_1___lte) {
            this.ore_primo_sintomo_prima_dose_1___lte = ore_primo_sintomo_prima_dose_1___lte;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose_1___gt(String ore_primo_sintomo_prima_dose_1___gt) {
            this.ore_primo_sintomo_prima_dose_1___gt = ore_primo_sintomo_prima_dose_1___gt;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose_1___gte(String ore_primo_sintomo_prima_dose_1___gte) {
            this.ore_primo_sintomo_prima_dose_1___gte = ore_primo_sintomo_prima_dose_1___gte;
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

        public Builder setVaccino___eq(String vaccino___eq) {
            this.vaccino___eq = vaccino___eq;
            return this;
        }

        public Builder setVaccino___ne(String vaccino___ne) {
            this.vaccino___ne = vaccino___ne;
            return this;
        }

        public Builder setVaccino___null(Boolean vaccino___null) {
            this.vaccino___null = vaccino___null;
            return this;
        }

        public Builder setVaccino___not___null(Boolean vaccino___not___null) {
            this.vaccino___not___null = vaccino___not___null;
            return this;
        }

        public Builder setVaccino___in(java.util.List<String> vaccino___in) {
            this.vaccino___in = vaccino___in;
            return this;
        }

        public Builder setVaccino___not___in(java.util.List<String> vaccino___not___in) {
            this.vaccino___not___in = vaccino___not___in;
            return this;
        }

        public Builder setVaccino___lt(String vaccino___lt) {
            this.vaccino___lt = vaccino___lt;
            return this;
        }

        public Builder setVaccino___lte(String vaccino___lte) {
            this.vaccino___lte = vaccino___lte;
            return this;
        }

        public Builder setVaccino___gt(String vaccino___gt) {
            this.vaccino___gt = vaccino___gt;
            return this;
        }

        public Builder setVaccino___gte(String vaccino___gte) {
            this.vaccino___gte = vaccino___gte;
            return this;
        }

        public Builder setVaccino___contains(String vaccino___contains) {
            this.vaccino___contains = vaccino___contains;
            return this;
        }

        public Builder setVaccino___not___contains(String vaccino___not___contains) {
            this.vaccino___not___contains = vaccino___not___contains;
            return this;
        }

        public Builder setVaccino___starts_with(String vaccino___starts_with) {
            this.vaccino___starts_with = vaccino___starts_with;
            return this;
        }

        public Builder setVaccino___not___starts_with(String vaccino___not___starts_with) {
            this.vaccino___not___starts_with = vaccino___not___starts_with;
            return this;
        }

        public Builder setVaccino___ends_with(String vaccino___ends_with) {
            this.vaccino___ends_with = vaccino___ends_with;
            return this;
        }

        public Builder setVaccino___not___ends_with(String vaccino___not___ends_with) {
            this.vaccino___not___ends_with = vaccino___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliDose_vaccino_covidFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliDose_vaccino_covidFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliDose_vaccino_covidFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliDose_vaccino_covidFilterDTO build() {
            CliDose_vaccino_covidFilterDTO result = new CliDose_vaccino_covidFilterDTO();
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
            result.setAltro_evento___eq(this.altro_evento___eq);
            result.setAltro_evento___ne(this.altro_evento___ne);
            result.setAltro_evento___null(this.altro_evento___null);
            result.setAltro_evento___not___null(this.altro_evento___not___null);
            result.setAltro_evento___in(this.altro_evento___in);
            result.setAltro_evento___not___in(this.altro_evento___not___in);
            result.setAltro_evento___lt(this.altro_evento___lt);
            result.setAltro_evento___lte(this.altro_evento___lte);
            result.setAltro_evento___gt(this.altro_evento___gt);
            result.setAltro_evento___gte(this.altro_evento___gte);
            result.setAltro_evento___contains(this.altro_evento___contains);
            result.setAltro_evento___not___contains(this.altro_evento___not___contains);
            result.setAltro_evento___starts_with(this.altro_evento___starts_with);
            result.setAltro_evento___not___starts_with(this.altro_evento___not___starts_with);
            result.setAltro_evento___ends_with(this.altro_evento___ends_with);
            result.setAltro_evento___not___ends_with(this.altro_evento___not___ends_with);
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
            result.setCount_eventi___eq(this.count_eventi___eq);
            result.setCount_eventi___ne(this.count_eventi___ne);
            result.setCount_eventi___null(this.count_eventi___null);
            result.setCount_eventi___not___null(this.count_eventi___not___null);
            result.setCount_eventi___in(this.count_eventi___in);
            result.setCount_eventi___not___in(this.count_eventi___not___in);
            result.setCount_eventi___lt(this.count_eventi___lt);
            result.setCount_eventi___lte(this.count_eventi___lte);
            result.setCount_eventi___gt(this.count_eventi___gt);
            result.setCount_eventi___gte(this.count_eventi___gte);
            result.setData___eq(this.data___eq);
            result.setData___ne(this.data___ne);
            result.setData___null(this.data___null);
            result.setData___not___null(this.data___not___null);
            result.setData___in(this.data___in);
            result.setData___not___in(this.data___not___in);
            result.setData___lt(this.data___lt);
            result.setData___lte(this.data___lte);
            result.setData___gt(this.data___gt);
            result.setData___gte(this.data___gte);
            result.setDose_successiva___eq(this.dose_successiva___eq);
            result.setDose_successiva___ne(this.dose_successiva___ne);
            result.setDose_successiva___null(this.dose_successiva___null);
            result.setDose_successiva___not___null(this.dose_successiva___not___null);
            result.setEventi_avversi___eq(this.eventi_avversi___eq);
            result.setEventi_avversi___ne(this.eventi_avversi___ne);
            result.setEventi_avversi___null(this.eventi_avversi___null);
            result.setEventi_avversi___not___null(this.eventi_avversi___not___null);
            result.setEventi_avversi___in(this.eventi_avversi___in);
            result.setEventi_avversi___not___in(this.eventi_avversi___not___in);
            result.setEventi_avversi___lt(this.eventi_avversi___lt);
            result.setEventi_avversi___lte(this.eventi_avversi___lte);
            result.setEventi_avversi___gt(this.eventi_avversi___gt);
            result.setEventi_avversi___gte(this.eventi_avversi___gte);
            result.setEventi_avversi___contains(this.eventi_avversi___contains);
            result.setEventi_avversi___not___contains(this.eventi_avversi___not___contains);
            result.setEventi_avversi___starts_with(this.eventi_avversi___starts_with);
            result.setEventi_avversi___not___starts_with(this.eventi_avversi___not___starts_with);
            result.setEventi_avversi___ends_with(this.eventi_avversi___ends_with);
            result.setEventi_avversi___not___ends_with(this.eventi_avversi___not___ends_with);
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
            result.setImped_attivita_prima_dose___eq(this.imped_attivita_prima_dose___eq);
            result.setImped_attivita_prima_dose___ne(this.imped_attivita_prima_dose___ne);
            result.setImped_attivita_prima_dose___null(this.imped_attivita_prima_dose___null);
            result.setImped_attivita_prima_dose___not___null(this.imped_attivita_prima_dose___not___null);
            result.setMotivazioni_dose_successiva___eq(this.motivazioni_dose_successiva___eq);
            result.setMotivazioni_dose_successiva___ne(this.motivazioni_dose_successiva___ne);
            result.setMotivazioni_dose_successiva___null(this.motivazioni_dose_successiva___null);
            result.setMotivazioni_dose_successiva___not___null(this.motivazioni_dose_successiva___not___null);
            result.setMotivazioni_dose_successiva___in(this.motivazioni_dose_successiva___in);
            result.setMotivazioni_dose_successiva___not___in(this.motivazioni_dose_successiva___not___in);
            result.setMotivazioni_dose_successiva___lt(this.motivazioni_dose_successiva___lt);
            result.setMotivazioni_dose_successiva___lte(this.motivazioni_dose_successiva___lte);
            result.setMotivazioni_dose_successiva___gt(this.motivazioni_dose_successiva___gt);
            result.setMotivazioni_dose_successiva___gte(this.motivazioni_dose_successiva___gte);
            result.setMotivazioni_dose_successiva___contains(this.motivazioni_dose_successiva___contains);
            result.setMotivazioni_dose_successiva___not___contains(this.motivazioni_dose_successiva___not___contains);
            result.setMotivazioni_dose_successiva___starts_with(this.motivazioni_dose_successiva___starts_with);
            result.setMotivazioni_dose_successiva___not___starts_with(this.motivazioni_dose_successiva___not___starts_with);
            result.setMotivazioni_dose_successiva___ends_with(this.motivazioni_dose_successiva___ends_with);
            result.setMotivazioni_dose_successiva___not___ends_with(this.motivazioni_dose_successiva___not___ends_with);
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
            result.setOre_durata_sintomi_prima_dose_1___eq(this.ore_durata_sintomi_prima_dose_1___eq);
            result.setOre_durata_sintomi_prima_dose_1___ne(this.ore_durata_sintomi_prima_dose_1___ne);
            result.setOre_durata_sintomi_prima_dose_1___null(this.ore_durata_sintomi_prima_dose_1___null);
            result.setOre_durata_sintomi_prima_dose_1___not___null(this.ore_durata_sintomi_prima_dose_1___not___null);
            result.setOre_durata_sintomi_prima_dose_1___in(this.ore_durata_sintomi_prima_dose_1___in);
            result.setOre_durata_sintomi_prima_dose_1___not___in(this.ore_durata_sintomi_prima_dose_1___not___in);
            result.setOre_durata_sintomi_prima_dose_1___lt(this.ore_durata_sintomi_prima_dose_1___lt);
            result.setOre_durata_sintomi_prima_dose_1___lte(this.ore_durata_sintomi_prima_dose_1___lte);
            result.setOre_durata_sintomi_prima_dose_1___gt(this.ore_durata_sintomi_prima_dose_1___gt);
            result.setOre_durata_sintomi_prima_dose_1___gte(this.ore_durata_sintomi_prima_dose_1___gte);
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
            result.setOre_primo_sintomo_prima_dose_1___eq(this.ore_primo_sintomo_prima_dose_1___eq);
            result.setOre_primo_sintomo_prima_dose_1___ne(this.ore_primo_sintomo_prima_dose_1___ne);
            result.setOre_primo_sintomo_prima_dose_1___null(this.ore_primo_sintomo_prima_dose_1___null);
            result.setOre_primo_sintomo_prima_dose_1___not___null(this.ore_primo_sintomo_prima_dose_1___not___null);
            result.setOre_primo_sintomo_prima_dose_1___in(this.ore_primo_sintomo_prima_dose_1___in);
            result.setOre_primo_sintomo_prima_dose_1___not___in(this.ore_primo_sintomo_prima_dose_1___not___in);
            result.setOre_primo_sintomo_prima_dose_1___lt(this.ore_primo_sintomo_prima_dose_1___lt);
            result.setOre_primo_sintomo_prima_dose_1___lte(this.ore_primo_sintomo_prima_dose_1___lte);
            result.setOre_primo_sintomo_prima_dose_1___gt(this.ore_primo_sintomo_prima_dose_1___gt);
            result.setOre_primo_sintomo_prima_dose_1___gte(this.ore_primo_sintomo_prima_dose_1___gte);
            result.setOspedale_prima_dose___eq(this.ospedale_prima_dose___eq);
            result.setOspedale_prima_dose___ne(this.ospedale_prima_dose___ne);
            result.setOspedale_prima_dose___null(this.ospedale_prima_dose___null);
            result.setOspedale_prima_dose___not___null(this.ospedale_prima_dose___not___null);
            result.setVaccino___eq(this.vaccino___eq);
            result.setVaccino___ne(this.vaccino___ne);
            result.setVaccino___null(this.vaccino___null);
            result.setVaccino___not___null(this.vaccino___not___null);
            result.setVaccino___in(this.vaccino___in);
            result.setVaccino___not___in(this.vaccino___not___in);
            result.setVaccino___lt(this.vaccino___lt);
            result.setVaccino___lte(this.vaccino___lte);
            result.setVaccino___gt(this.vaccino___gt);
            result.setVaccino___gte(this.vaccino___gte);
            result.setVaccino___contains(this.vaccino___contains);
            result.setVaccino___not___contains(this.vaccino___not___contains);
            result.setVaccino___starts_with(this.vaccino___starts_with);
            result.setVaccino___not___starts_with(this.vaccino___not___starts_with);
            result.setVaccino___ends_with(this.vaccino___ends_with);
            result.setVaccino___not___ends_with(this.vaccino___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
