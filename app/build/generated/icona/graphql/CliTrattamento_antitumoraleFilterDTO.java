package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Trattamento_antitumorale.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTrattamento_antitumoraleFilterDTO implements java.io.Serializable {

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
    private String altro___eq;
    private String altro___ne;
    private Boolean altro___null;
    private Boolean altro___not___null;
    private java.util.List<String> altro___in;
    private java.util.List<String> altro___not___in;
    private String altro___lt;
    private String altro___lte;
    private String altro___gt;
    private String altro___gte;
    private String altro___contains;
    private String altro___not___contains;
    private String altro___starts_with;
    private String altro___not___starts_with;
    private String altro___ends_with;
    private String altro___not___ends_with;
    private Boolean cellulare___eq;
    private Boolean cellulare___ne;
    private Boolean cellulare___null;
    private Boolean cellulare___not___null;
    private Boolean chemioterapia___eq;
    private Boolean chemioterapia___ne;
    private Boolean chemioterapia___null;
    private Boolean chemioterapia___not___null;
    private Boolean chirurgico___eq;
    private Boolean chirurgico___ne;
    private Boolean chirurgico___null;
    private Boolean chirurgico___not___null;
    private Integer cicli_effettuati___eq;
    private Integer cicli_effettuati___ne;
    private Boolean cicli_effettuati___null;
    private Boolean cicli_effettuati___not___null;
    private java.util.List<Integer> cicli_effettuati___in;
    private java.util.List<Integer> cicli_effettuati___not___in;
    private Integer cicli_effettuati___lt;
    private Integer cicli_effettuati___lte;
    private Integer cicli_effettuati___gt;
    private Integer cicli_effettuati___gte;
    private Integer cicli_previsti___eq;
    private Integer cicli_previsti___ne;
    private Boolean cicli_previsti___null;
    private Boolean cicli_previsti___not___null;
    private java.util.List<Integer> cicli_previsti___in;
    private java.util.List<Integer> cicli_previsti___not___in;
    private Integer cicli_previsti___lt;
    private Integer cicli_previsti___lte;
    private Integer cicli_previsti___gt;
    private Integer cicli_previsti___gte;
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
    private String data_fine___eq;
    private String data_fine___ne;
    private Boolean data_fine___null;
    private Boolean data_fine___not___null;
    private java.util.List<String> data_fine___in;
    private java.util.List<String> data_fine___not___in;
    private String data_fine___lt;
    private String data_fine___lte;
    private String data_fine___gt;
    private String data_fine___gte;
    private String dose_gray_totale___eq;
    private String dose_gray_totale___ne;
    private Boolean dose_gray_totale___null;
    private Boolean dose_gray_totale___not___null;
    private java.util.List<String> dose_gray_totale___in;
    private java.util.List<String> dose_gray_totale___not___in;
    private String dose_gray_totale___lt;
    private String dose_gray_totale___lte;
    private String dose_gray_totale___gt;
    private String dose_gray_totale___gte;
    private String farmaci_antitumorali___eq;
    private String farmaci_antitumorali___ne;
    private Boolean farmaci_antitumorali___null;
    private Boolean farmaci_antitumorali___not___null;
    private java.util.List<String> farmaci_antitumorali___in;
    private java.util.List<String> farmaci_antitumorali___not___in;
    private String farmaci_antitumorali___lt;
    private String farmaci_antitumorali___lte;
    private String farmaci_antitumorali___gt;
    private String farmaci_antitumorali___gte;
    private String farmaci_antitumorali___contains;
    private String farmaci_antitumorali___not___contains;
    private String farmaci_antitumorali___starts_with;
    private String farmaci_antitumorali___not___starts_with;
    private String farmaci_antitumorali___ends_with;
    private String farmaci_antitumorali___not___ends_with;
    private String filtra_farmaci___eq;
    private String filtra_farmaci___ne;
    private Boolean filtra_farmaci___null;
    private Boolean filtra_farmaci___not___null;
    private java.util.List<String> filtra_farmaci___in;
    private java.util.List<String> filtra_farmaci___not___in;
    private String filtra_farmaci___lt;
    private String filtra_farmaci___lte;
    private String filtra_farmaci___gt;
    private String filtra_farmaci___gte;
    private String filtra_farmaci___contains;
    private String filtra_farmaci___not___contains;
    private String filtra_farmaci___starts_with;
    private String filtra_farmaci___not___starts_with;
    private String filtra_farmaci___ends_with;
    private String filtra_farmaci___not___ends_with;
    private Boolean immunoterapia___eq;
    private Boolean immunoterapia___ne;
    private Boolean immunoterapia___null;
    private Boolean immunoterapia___not___null;
    private String infezioni___eq;
    private String infezioni___ne;
    private Boolean infezioni___null;
    private Boolean infezioni___not___null;
    private java.util.List<String> infezioni___in;
    private java.util.List<String> infezioni___not___in;
    private String infezioni___lt;
    private String infezioni___lte;
    private String infezioni___gt;
    private String infezioni___gte;
    private String infezioni___contains;
    private String infezioni___not___contains;
    private String infezioni___starts_with;
    private String infezioni___not___starts_with;
    private String infezioni___ends_with;
    private String infezioni___not___ends_with;
    private Integer linea___eq;
    private Integer linea___ne;
    private Boolean linea___null;
    private Boolean linea___not___null;
    private java.util.List<Integer> linea___in;
    private java.util.List<Integer> linea___not___in;
    private Integer linea___lt;
    private Integer linea___lte;
    private Integer linea___gt;
    private Integer linea___gte;
    private Boolean ormonale___eq;
    private Boolean ormonale___ne;
    private Boolean ormonale___null;
    private Boolean ormonale___not___null;
    private Boolean radioterapia___eq;
    private Boolean radioterapia___ne;
    private Boolean radioterapia___null;
    private Boolean radioterapia___not___null;
    private Boolean risposta_trattamento___eq;
    private Boolean risposta_trattamento___ne;
    private Boolean risposta_trattamento___null;
    private Boolean risposta_trattamento___not___null;
    private Boolean sepsi_severa___eq;
    private Boolean sepsi_severa___ne;
    private Boolean sepsi_severa___null;
    private Boolean sepsi_severa___not___null;
    private Boolean staminali___eq;
    private Boolean staminali___ne;
    private Boolean staminali___null;
    private Boolean staminali___not___null;
    private String tipo_trattamento___eq;
    private String tipo_trattamento___ne;
    private Boolean tipo_trattamento___null;
    private Boolean tipo_trattamento___not___null;
    private java.util.List<String> tipo_trattamento___in;
    private java.util.List<String> tipo_trattamento___not___in;
    private String tipo_trattamento___lt;
    private String tipo_trattamento___lte;
    private String tipo_trattamento___gt;
    private String tipo_trattamento___gte;
    private String tipo_trattamento___contains;
    private String tipo_trattamento___not___contains;
    private String tipo_trattamento___starts_with;
    private String tipo_trattamento___not___starts_with;
    private String tipo_trattamento___ends_with;
    private String tipo_trattamento___not___ends_with;
    private Boolean tossicita_GI___eq;
    private Boolean tossicita_GI___ne;
    private Boolean tossicita_GI___null;
    private Boolean tossicita_GI___not___null;
    private Boolean tossicita_SNC___eq;
    private Boolean tossicita_SNC___ne;
    private Boolean tossicita_SNC___null;
    private Boolean tossicita_SNC___not___null;
    private Boolean tossicita_anemia___eq;
    private Boolean tossicita_anemia___ne;
    private Boolean tossicita_anemia___null;
    private Boolean tossicita_anemia___not___null;
    private Boolean tossicita_cardiaca___eq;
    private Boolean tossicita_cardiaca___ne;
    private Boolean tossicita_cardiaca___null;
    private Boolean tossicita_cardiaca___not___null;
    private Boolean tossicita_epatica___eq;
    private Boolean tossicita_epatica___ne;
    private Boolean tossicita_epatica___null;
    private Boolean tossicita_epatica___not___null;
    private Boolean tossicita_neutropenia___eq;
    private Boolean tossicita_neutropenia___ne;
    private Boolean tossicita_neutropenia___null;
    private Boolean tossicita_neutropenia___not___null;
    private Boolean tossicita_piastrinopenia___eq;
    private Boolean tossicita_piastrinopenia___ne;
    private Boolean tossicita_piastrinopenia___null;
    private Boolean tossicita_piastrinopenia___not___null;
    private java.util.List<CliTrattamento_antitumoraleFilterDTO> AND;
    private java.util.List<CliTrattamento_antitumoraleFilterDTO> OR;
    private CliTrattamento_antitumoraleFilterDTO NOT;

    public CliTrattamento_antitumoraleFilterDTO() {
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

    public String getAltro___eq() {
        return altro___eq;
    }
    public void setAltro___eq(String altro___eq) {
        this.altro___eq = altro___eq;
    }

    public String getAltro___ne() {
        return altro___ne;
    }
    public void setAltro___ne(String altro___ne) {
        this.altro___ne = altro___ne;
    }

    public Boolean getAltro___null() {
        return altro___null;
    }
    public void setAltro___null(Boolean altro___null) {
        this.altro___null = altro___null;
    }

    public Boolean getAltro___not___null() {
        return altro___not___null;
    }
    public void setAltro___not___null(Boolean altro___not___null) {
        this.altro___not___null = altro___not___null;
    }

    public java.util.List<String> getAltro___in() {
        return altro___in;
    }
    public void setAltro___in(java.util.List<String> altro___in) {
        this.altro___in = altro___in;
    }

    public java.util.List<String> getAltro___not___in() {
        return altro___not___in;
    }
    public void setAltro___not___in(java.util.List<String> altro___not___in) {
        this.altro___not___in = altro___not___in;
    }

    public String getAltro___lt() {
        return altro___lt;
    }
    public void setAltro___lt(String altro___lt) {
        this.altro___lt = altro___lt;
    }

    public String getAltro___lte() {
        return altro___lte;
    }
    public void setAltro___lte(String altro___lte) {
        this.altro___lte = altro___lte;
    }

    public String getAltro___gt() {
        return altro___gt;
    }
    public void setAltro___gt(String altro___gt) {
        this.altro___gt = altro___gt;
    }

    public String getAltro___gte() {
        return altro___gte;
    }
    public void setAltro___gte(String altro___gte) {
        this.altro___gte = altro___gte;
    }

    public String getAltro___contains() {
        return altro___contains;
    }
    public void setAltro___contains(String altro___contains) {
        this.altro___contains = altro___contains;
    }

    public String getAltro___not___contains() {
        return altro___not___contains;
    }
    public void setAltro___not___contains(String altro___not___contains) {
        this.altro___not___contains = altro___not___contains;
    }

    public String getAltro___starts_with() {
        return altro___starts_with;
    }
    public void setAltro___starts_with(String altro___starts_with) {
        this.altro___starts_with = altro___starts_with;
    }

    public String getAltro___not___starts_with() {
        return altro___not___starts_with;
    }
    public void setAltro___not___starts_with(String altro___not___starts_with) {
        this.altro___not___starts_with = altro___not___starts_with;
    }

    public String getAltro___ends_with() {
        return altro___ends_with;
    }
    public void setAltro___ends_with(String altro___ends_with) {
        this.altro___ends_with = altro___ends_with;
    }

    public String getAltro___not___ends_with() {
        return altro___not___ends_with;
    }
    public void setAltro___not___ends_with(String altro___not___ends_with) {
        this.altro___not___ends_with = altro___not___ends_with;
    }

    public Boolean getCellulare___eq() {
        return cellulare___eq;
    }
    public void setCellulare___eq(Boolean cellulare___eq) {
        this.cellulare___eq = cellulare___eq;
    }

    public Boolean getCellulare___ne() {
        return cellulare___ne;
    }
    public void setCellulare___ne(Boolean cellulare___ne) {
        this.cellulare___ne = cellulare___ne;
    }

    public Boolean getCellulare___null() {
        return cellulare___null;
    }
    public void setCellulare___null(Boolean cellulare___null) {
        this.cellulare___null = cellulare___null;
    }

    public Boolean getCellulare___not___null() {
        return cellulare___not___null;
    }
    public void setCellulare___not___null(Boolean cellulare___not___null) {
        this.cellulare___not___null = cellulare___not___null;
    }

    public Boolean getChemioterapia___eq() {
        return chemioterapia___eq;
    }
    public void setChemioterapia___eq(Boolean chemioterapia___eq) {
        this.chemioterapia___eq = chemioterapia___eq;
    }

    public Boolean getChemioterapia___ne() {
        return chemioterapia___ne;
    }
    public void setChemioterapia___ne(Boolean chemioterapia___ne) {
        this.chemioterapia___ne = chemioterapia___ne;
    }

    public Boolean getChemioterapia___null() {
        return chemioterapia___null;
    }
    public void setChemioterapia___null(Boolean chemioterapia___null) {
        this.chemioterapia___null = chemioterapia___null;
    }

    public Boolean getChemioterapia___not___null() {
        return chemioterapia___not___null;
    }
    public void setChemioterapia___not___null(Boolean chemioterapia___not___null) {
        this.chemioterapia___not___null = chemioterapia___not___null;
    }

    public Boolean getChirurgico___eq() {
        return chirurgico___eq;
    }
    public void setChirurgico___eq(Boolean chirurgico___eq) {
        this.chirurgico___eq = chirurgico___eq;
    }

    public Boolean getChirurgico___ne() {
        return chirurgico___ne;
    }
    public void setChirurgico___ne(Boolean chirurgico___ne) {
        this.chirurgico___ne = chirurgico___ne;
    }

    public Boolean getChirurgico___null() {
        return chirurgico___null;
    }
    public void setChirurgico___null(Boolean chirurgico___null) {
        this.chirurgico___null = chirurgico___null;
    }

    public Boolean getChirurgico___not___null() {
        return chirurgico___not___null;
    }
    public void setChirurgico___not___null(Boolean chirurgico___not___null) {
        this.chirurgico___not___null = chirurgico___not___null;
    }

    public Integer getCicli_effettuati___eq() {
        return cicli_effettuati___eq;
    }
    public void setCicli_effettuati___eq(Integer cicli_effettuati___eq) {
        this.cicli_effettuati___eq = cicli_effettuati___eq;
    }

    public Integer getCicli_effettuati___ne() {
        return cicli_effettuati___ne;
    }
    public void setCicli_effettuati___ne(Integer cicli_effettuati___ne) {
        this.cicli_effettuati___ne = cicli_effettuati___ne;
    }

    public Boolean getCicli_effettuati___null() {
        return cicli_effettuati___null;
    }
    public void setCicli_effettuati___null(Boolean cicli_effettuati___null) {
        this.cicli_effettuati___null = cicli_effettuati___null;
    }

    public Boolean getCicli_effettuati___not___null() {
        return cicli_effettuati___not___null;
    }
    public void setCicli_effettuati___not___null(Boolean cicli_effettuati___not___null) {
        this.cicli_effettuati___not___null = cicli_effettuati___not___null;
    }

    public java.util.List<Integer> getCicli_effettuati___in() {
        return cicli_effettuati___in;
    }
    public void setCicli_effettuati___in(java.util.List<Integer> cicli_effettuati___in) {
        this.cicli_effettuati___in = cicli_effettuati___in;
    }

    public java.util.List<Integer> getCicli_effettuati___not___in() {
        return cicli_effettuati___not___in;
    }
    public void setCicli_effettuati___not___in(java.util.List<Integer> cicli_effettuati___not___in) {
        this.cicli_effettuati___not___in = cicli_effettuati___not___in;
    }

    public Integer getCicli_effettuati___lt() {
        return cicli_effettuati___lt;
    }
    public void setCicli_effettuati___lt(Integer cicli_effettuati___lt) {
        this.cicli_effettuati___lt = cicli_effettuati___lt;
    }

    public Integer getCicli_effettuati___lte() {
        return cicli_effettuati___lte;
    }
    public void setCicli_effettuati___lte(Integer cicli_effettuati___lte) {
        this.cicli_effettuati___lte = cicli_effettuati___lte;
    }

    public Integer getCicli_effettuati___gt() {
        return cicli_effettuati___gt;
    }
    public void setCicli_effettuati___gt(Integer cicli_effettuati___gt) {
        this.cicli_effettuati___gt = cicli_effettuati___gt;
    }

    public Integer getCicli_effettuati___gte() {
        return cicli_effettuati___gte;
    }
    public void setCicli_effettuati___gte(Integer cicli_effettuati___gte) {
        this.cicli_effettuati___gte = cicli_effettuati___gte;
    }

    public Integer getCicli_previsti___eq() {
        return cicli_previsti___eq;
    }
    public void setCicli_previsti___eq(Integer cicli_previsti___eq) {
        this.cicli_previsti___eq = cicli_previsti___eq;
    }

    public Integer getCicli_previsti___ne() {
        return cicli_previsti___ne;
    }
    public void setCicli_previsti___ne(Integer cicli_previsti___ne) {
        this.cicli_previsti___ne = cicli_previsti___ne;
    }

    public Boolean getCicli_previsti___null() {
        return cicli_previsti___null;
    }
    public void setCicli_previsti___null(Boolean cicli_previsti___null) {
        this.cicli_previsti___null = cicli_previsti___null;
    }

    public Boolean getCicli_previsti___not___null() {
        return cicli_previsti___not___null;
    }
    public void setCicli_previsti___not___null(Boolean cicli_previsti___not___null) {
        this.cicli_previsti___not___null = cicli_previsti___not___null;
    }

    public java.util.List<Integer> getCicli_previsti___in() {
        return cicli_previsti___in;
    }
    public void setCicli_previsti___in(java.util.List<Integer> cicli_previsti___in) {
        this.cicli_previsti___in = cicli_previsti___in;
    }

    public java.util.List<Integer> getCicli_previsti___not___in() {
        return cicli_previsti___not___in;
    }
    public void setCicli_previsti___not___in(java.util.List<Integer> cicli_previsti___not___in) {
        this.cicli_previsti___not___in = cicli_previsti___not___in;
    }

    public Integer getCicli_previsti___lt() {
        return cicli_previsti___lt;
    }
    public void setCicli_previsti___lt(Integer cicli_previsti___lt) {
        this.cicli_previsti___lt = cicli_previsti___lt;
    }

    public Integer getCicli_previsti___lte() {
        return cicli_previsti___lte;
    }
    public void setCicli_previsti___lte(Integer cicli_previsti___lte) {
        this.cicli_previsti___lte = cicli_previsti___lte;
    }

    public Integer getCicli_previsti___gt() {
        return cicli_previsti___gt;
    }
    public void setCicli_previsti___gt(Integer cicli_previsti___gt) {
        this.cicli_previsti___gt = cicli_previsti___gt;
    }

    public Integer getCicli_previsti___gte() {
        return cicli_previsti___gte;
    }
    public void setCicli_previsti___gte(Integer cicli_previsti___gte) {
        this.cicli_previsti___gte = cicli_previsti___gte;
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

    public String getData_fine___eq() {
        return data_fine___eq;
    }
    public void setData_fine___eq(String data_fine___eq) {
        this.data_fine___eq = data_fine___eq;
    }

    public String getData_fine___ne() {
        return data_fine___ne;
    }
    public void setData_fine___ne(String data_fine___ne) {
        this.data_fine___ne = data_fine___ne;
    }

    public Boolean getData_fine___null() {
        return data_fine___null;
    }
    public void setData_fine___null(Boolean data_fine___null) {
        this.data_fine___null = data_fine___null;
    }

    public Boolean getData_fine___not___null() {
        return data_fine___not___null;
    }
    public void setData_fine___not___null(Boolean data_fine___not___null) {
        this.data_fine___not___null = data_fine___not___null;
    }

    public java.util.List<String> getData_fine___in() {
        return data_fine___in;
    }
    public void setData_fine___in(java.util.List<String> data_fine___in) {
        this.data_fine___in = data_fine___in;
    }

    public java.util.List<String> getData_fine___not___in() {
        return data_fine___not___in;
    }
    public void setData_fine___not___in(java.util.List<String> data_fine___not___in) {
        this.data_fine___not___in = data_fine___not___in;
    }

    public String getData_fine___lt() {
        return data_fine___lt;
    }
    public void setData_fine___lt(String data_fine___lt) {
        this.data_fine___lt = data_fine___lt;
    }

    public String getData_fine___lte() {
        return data_fine___lte;
    }
    public void setData_fine___lte(String data_fine___lte) {
        this.data_fine___lte = data_fine___lte;
    }

    public String getData_fine___gt() {
        return data_fine___gt;
    }
    public void setData_fine___gt(String data_fine___gt) {
        this.data_fine___gt = data_fine___gt;
    }

    public String getData_fine___gte() {
        return data_fine___gte;
    }
    public void setData_fine___gte(String data_fine___gte) {
        this.data_fine___gte = data_fine___gte;
    }

    public String getDose_gray_totale___eq() {
        return dose_gray_totale___eq;
    }
    public void setDose_gray_totale___eq(String dose_gray_totale___eq) {
        this.dose_gray_totale___eq = dose_gray_totale___eq;
    }

    public String getDose_gray_totale___ne() {
        return dose_gray_totale___ne;
    }
    public void setDose_gray_totale___ne(String dose_gray_totale___ne) {
        this.dose_gray_totale___ne = dose_gray_totale___ne;
    }

    public Boolean getDose_gray_totale___null() {
        return dose_gray_totale___null;
    }
    public void setDose_gray_totale___null(Boolean dose_gray_totale___null) {
        this.dose_gray_totale___null = dose_gray_totale___null;
    }

    public Boolean getDose_gray_totale___not___null() {
        return dose_gray_totale___not___null;
    }
    public void setDose_gray_totale___not___null(Boolean dose_gray_totale___not___null) {
        this.dose_gray_totale___not___null = dose_gray_totale___not___null;
    }

    public java.util.List<String> getDose_gray_totale___in() {
        return dose_gray_totale___in;
    }
    public void setDose_gray_totale___in(java.util.List<String> dose_gray_totale___in) {
        this.dose_gray_totale___in = dose_gray_totale___in;
    }

    public java.util.List<String> getDose_gray_totale___not___in() {
        return dose_gray_totale___not___in;
    }
    public void setDose_gray_totale___not___in(java.util.List<String> dose_gray_totale___not___in) {
        this.dose_gray_totale___not___in = dose_gray_totale___not___in;
    }

    public String getDose_gray_totale___lt() {
        return dose_gray_totale___lt;
    }
    public void setDose_gray_totale___lt(String dose_gray_totale___lt) {
        this.dose_gray_totale___lt = dose_gray_totale___lt;
    }

    public String getDose_gray_totale___lte() {
        return dose_gray_totale___lte;
    }
    public void setDose_gray_totale___lte(String dose_gray_totale___lte) {
        this.dose_gray_totale___lte = dose_gray_totale___lte;
    }

    public String getDose_gray_totale___gt() {
        return dose_gray_totale___gt;
    }
    public void setDose_gray_totale___gt(String dose_gray_totale___gt) {
        this.dose_gray_totale___gt = dose_gray_totale___gt;
    }

    public String getDose_gray_totale___gte() {
        return dose_gray_totale___gte;
    }
    public void setDose_gray_totale___gte(String dose_gray_totale___gte) {
        this.dose_gray_totale___gte = dose_gray_totale___gte;
    }

    public String getFarmaci_antitumorali___eq() {
        return farmaci_antitumorali___eq;
    }
    public void setFarmaci_antitumorali___eq(String farmaci_antitumorali___eq) {
        this.farmaci_antitumorali___eq = farmaci_antitumorali___eq;
    }

    public String getFarmaci_antitumorali___ne() {
        return farmaci_antitumorali___ne;
    }
    public void setFarmaci_antitumorali___ne(String farmaci_antitumorali___ne) {
        this.farmaci_antitumorali___ne = farmaci_antitumorali___ne;
    }

    public Boolean getFarmaci_antitumorali___null() {
        return farmaci_antitumorali___null;
    }
    public void setFarmaci_antitumorali___null(Boolean farmaci_antitumorali___null) {
        this.farmaci_antitumorali___null = farmaci_antitumorali___null;
    }

    public Boolean getFarmaci_antitumorali___not___null() {
        return farmaci_antitumorali___not___null;
    }
    public void setFarmaci_antitumorali___not___null(Boolean farmaci_antitumorali___not___null) {
        this.farmaci_antitumorali___not___null = farmaci_antitumorali___not___null;
    }

    public java.util.List<String> getFarmaci_antitumorali___in() {
        return farmaci_antitumorali___in;
    }
    public void setFarmaci_antitumorali___in(java.util.List<String> farmaci_antitumorali___in) {
        this.farmaci_antitumorali___in = farmaci_antitumorali___in;
    }

    public java.util.List<String> getFarmaci_antitumorali___not___in() {
        return farmaci_antitumorali___not___in;
    }
    public void setFarmaci_antitumorali___not___in(java.util.List<String> farmaci_antitumorali___not___in) {
        this.farmaci_antitumorali___not___in = farmaci_antitumorali___not___in;
    }

    public String getFarmaci_antitumorali___lt() {
        return farmaci_antitumorali___lt;
    }
    public void setFarmaci_antitumorali___lt(String farmaci_antitumorali___lt) {
        this.farmaci_antitumorali___lt = farmaci_antitumorali___lt;
    }

    public String getFarmaci_antitumorali___lte() {
        return farmaci_antitumorali___lte;
    }
    public void setFarmaci_antitumorali___lte(String farmaci_antitumorali___lte) {
        this.farmaci_antitumorali___lte = farmaci_antitumorali___lte;
    }

    public String getFarmaci_antitumorali___gt() {
        return farmaci_antitumorali___gt;
    }
    public void setFarmaci_antitumorali___gt(String farmaci_antitumorali___gt) {
        this.farmaci_antitumorali___gt = farmaci_antitumorali___gt;
    }

    public String getFarmaci_antitumorali___gte() {
        return farmaci_antitumorali___gte;
    }
    public void setFarmaci_antitumorali___gte(String farmaci_antitumorali___gte) {
        this.farmaci_antitumorali___gte = farmaci_antitumorali___gte;
    }

    public String getFarmaci_antitumorali___contains() {
        return farmaci_antitumorali___contains;
    }
    public void setFarmaci_antitumorali___contains(String farmaci_antitumorali___contains) {
        this.farmaci_antitumorali___contains = farmaci_antitumorali___contains;
    }

    public String getFarmaci_antitumorali___not___contains() {
        return farmaci_antitumorali___not___contains;
    }
    public void setFarmaci_antitumorali___not___contains(String farmaci_antitumorali___not___contains) {
        this.farmaci_antitumorali___not___contains = farmaci_antitumorali___not___contains;
    }

    public String getFarmaci_antitumorali___starts_with() {
        return farmaci_antitumorali___starts_with;
    }
    public void setFarmaci_antitumorali___starts_with(String farmaci_antitumorali___starts_with) {
        this.farmaci_antitumorali___starts_with = farmaci_antitumorali___starts_with;
    }

    public String getFarmaci_antitumorali___not___starts_with() {
        return farmaci_antitumorali___not___starts_with;
    }
    public void setFarmaci_antitumorali___not___starts_with(String farmaci_antitumorali___not___starts_with) {
        this.farmaci_antitumorali___not___starts_with = farmaci_antitumorali___not___starts_with;
    }

    public String getFarmaci_antitumorali___ends_with() {
        return farmaci_antitumorali___ends_with;
    }
    public void setFarmaci_antitumorali___ends_with(String farmaci_antitumorali___ends_with) {
        this.farmaci_antitumorali___ends_with = farmaci_antitumorali___ends_with;
    }

    public String getFarmaci_antitumorali___not___ends_with() {
        return farmaci_antitumorali___not___ends_with;
    }
    public void setFarmaci_antitumorali___not___ends_with(String farmaci_antitumorali___not___ends_with) {
        this.farmaci_antitumorali___not___ends_with = farmaci_antitumorali___not___ends_with;
    }

    public String getFiltra_farmaci___eq() {
        return filtra_farmaci___eq;
    }
    public void setFiltra_farmaci___eq(String filtra_farmaci___eq) {
        this.filtra_farmaci___eq = filtra_farmaci___eq;
    }

    public String getFiltra_farmaci___ne() {
        return filtra_farmaci___ne;
    }
    public void setFiltra_farmaci___ne(String filtra_farmaci___ne) {
        this.filtra_farmaci___ne = filtra_farmaci___ne;
    }

    public Boolean getFiltra_farmaci___null() {
        return filtra_farmaci___null;
    }
    public void setFiltra_farmaci___null(Boolean filtra_farmaci___null) {
        this.filtra_farmaci___null = filtra_farmaci___null;
    }

    public Boolean getFiltra_farmaci___not___null() {
        return filtra_farmaci___not___null;
    }
    public void setFiltra_farmaci___not___null(Boolean filtra_farmaci___not___null) {
        this.filtra_farmaci___not___null = filtra_farmaci___not___null;
    }

    public java.util.List<String> getFiltra_farmaci___in() {
        return filtra_farmaci___in;
    }
    public void setFiltra_farmaci___in(java.util.List<String> filtra_farmaci___in) {
        this.filtra_farmaci___in = filtra_farmaci___in;
    }

    public java.util.List<String> getFiltra_farmaci___not___in() {
        return filtra_farmaci___not___in;
    }
    public void setFiltra_farmaci___not___in(java.util.List<String> filtra_farmaci___not___in) {
        this.filtra_farmaci___not___in = filtra_farmaci___not___in;
    }

    public String getFiltra_farmaci___lt() {
        return filtra_farmaci___lt;
    }
    public void setFiltra_farmaci___lt(String filtra_farmaci___lt) {
        this.filtra_farmaci___lt = filtra_farmaci___lt;
    }

    public String getFiltra_farmaci___lte() {
        return filtra_farmaci___lte;
    }
    public void setFiltra_farmaci___lte(String filtra_farmaci___lte) {
        this.filtra_farmaci___lte = filtra_farmaci___lte;
    }

    public String getFiltra_farmaci___gt() {
        return filtra_farmaci___gt;
    }
    public void setFiltra_farmaci___gt(String filtra_farmaci___gt) {
        this.filtra_farmaci___gt = filtra_farmaci___gt;
    }

    public String getFiltra_farmaci___gte() {
        return filtra_farmaci___gte;
    }
    public void setFiltra_farmaci___gte(String filtra_farmaci___gte) {
        this.filtra_farmaci___gte = filtra_farmaci___gte;
    }

    public String getFiltra_farmaci___contains() {
        return filtra_farmaci___contains;
    }
    public void setFiltra_farmaci___contains(String filtra_farmaci___contains) {
        this.filtra_farmaci___contains = filtra_farmaci___contains;
    }

    public String getFiltra_farmaci___not___contains() {
        return filtra_farmaci___not___contains;
    }
    public void setFiltra_farmaci___not___contains(String filtra_farmaci___not___contains) {
        this.filtra_farmaci___not___contains = filtra_farmaci___not___contains;
    }

    public String getFiltra_farmaci___starts_with() {
        return filtra_farmaci___starts_with;
    }
    public void setFiltra_farmaci___starts_with(String filtra_farmaci___starts_with) {
        this.filtra_farmaci___starts_with = filtra_farmaci___starts_with;
    }

    public String getFiltra_farmaci___not___starts_with() {
        return filtra_farmaci___not___starts_with;
    }
    public void setFiltra_farmaci___not___starts_with(String filtra_farmaci___not___starts_with) {
        this.filtra_farmaci___not___starts_with = filtra_farmaci___not___starts_with;
    }

    public String getFiltra_farmaci___ends_with() {
        return filtra_farmaci___ends_with;
    }
    public void setFiltra_farmaci___ends_with(String filtra_farmaci___ends_with) {
        this.filtra_farmaci___ends_with = filtra_farmaci___ends_with;
    }

    public String getFiltra_farmaci___not___ends_with() {
        return filtra_farmaci___not___ends_with;
    }
    public void setFiltra_farmaci___not___ends_with(String filtra_farmaci___not___ends_with) {
        this.filtra_farmaci___not___ends_with = filtra_farmaci___not___ends_with;
    }

    public Boolean getImmunoterapia___eq() {
        return immunoterapia___eq;
    }
    public void setImmunoterapia___eq(Boolean immunoterapia___eq) {
        this.immunoterapia___eq = immunoterapia___eq;
    }

    public Boolean getImmunoterapia___ne() {
        return immunoterapia___ne;
    }
    public void setImmunoterapia___ne(Boolean immunoterapia___ne) {
        this.immunoterapia___ne = immunoterapia___ne;
    }

    public Boolean getImmunoterapia___null() {
        return immunoterapia___null;
    }
    public void setImmunoterapia___null(Boolean immunoterapia___null) {
        this.immunoterapia___null = immunoterapia___null;
    }

    public Boolean getImmunoterapia___not___null() {
        return immunoterapia___not___null;
    }
    public void setImmunoterapia___not___null(Boolean immunoterapia___not___null) {
        this.immunoterapia___not___null = immunoterapia___not___null;
    }

    public String getInfezioni___eq() {
        return infezioni___eq;
    }
    public void setInfezioni___eq(String infezioni___eq) {
        this.infezioni___eq = infezioni___eq;
    }

    public String getInfezioni___ne() {
        return infezioni___ne;
    }
    public void setInfezioni___ne(String infezioni___ne) {
        this.infezioni___ne = infezioni___ne;
    }

    public Boolean getInfezioni___null() {
        return infezioni___null;
    }
    public void setInfezioni___null(Boolean infezioni___null) {
        this.infezioni___null = infezioni___null;
    }

    public Boolean getInfezioni___not___null() {
        return infezioni___not___null;
    }
    public void setInfezioni___not___null(Boolean infezioni___not___null) {
        this.infezioni___not___null = infezioni___not___null;
    }

    public java.util.List<String> getInfezioni___in() {
        return infezioni___in;
    }
    public void setInfezioni___in(java.util.List<String> infezioni___in) {
        this.infezioni___in = infezioni___in;
    }

    public java.util.List<String> getInfezioni___not___in() {
        return infezioni___not___in;
    }
    public void setInfezioni___not___in(java.util.List<String> infezioni___not___in) {
        this.infezioni___not___in = infezioni___not___in;
    }

    public String getInfezioni___lt() {
        return infezioni___lt;
    }
    public void setInfezioni___lt(String infezioni___lt) {
        this.infezioni___lt = infezioni___lt;
    }

    public String getInfezioni___lte() {
        return infezioni___lte;
    }
    public void setInfezioni___lte(String infezioni___lte) {
        this.infezioni___lte = infezioni___lte;
    }

    public String getInfezioni___gt() {
        return infezioni___gt;
    }
    public void setInfezioni___gt(String infezioni___gt) {
        this.infezioni___gt = infezioni___gt;
    }

    public String getInfezioni___gte() {
        return infezioni___gte;
    }
    public void setInfezioni___gte(String infezioni___gte) {
        this.infezioni___gte = infezioni___gte;
    }

    public String getInfezioni___contains() {
        return infezioni___contains;
    }
    public void setInfezioni___contains(String infezioni___contains) {
        this.infezioni___contains = infezioni___contains;
    }

    public String getInfezioni___not___contains() {
        return infezioni___not___contains;
    }
    public void setInfezioni___not___contains(String infezioni___not___contains) {
        this.infezioni___not___contains = infezioni___not___contains;
    }

    public String getInfezioni___starts_with() {
        return infezioni___starts_with;
    }
    public void setInfezioni___starts_with(String infezioni___starts_with) {
        this.infezioni___starts_with = infezioni___starts_with;
    }

    public String getInfezioni___not___starts_with() {
        return infezioni___not___starts_with;
    }
    public void setInfezioni___not___starts_with(String infezioni___not___starts_with) {
        this.infezioni___not___starts_with = infezioni___not___starts_with;
    }

    public String getInfezioni___ends_with() {
        return infezioni___ends_with;
    }
    public void setInfezioni___ends_with(String infezioni___ends_with) {
        this.infezioni___ends_with = infezioni___ends_with;
    }

    public String getInfezioni___not___ends_with() {
        return infezioni___not___ends_with;
    }
    public void setInfezioni___not___ends_with(String infezioni___not___ends_with) {
        this.infezioni___not___ends_with = infezioni___not___ends_with;
    }

    public Integer getLinea___eq() {
        return linea___eq;
    }
    public void setLinea___eq(Integer linea___eq) {
        this.linea___eq = linea___eq;
    }

    public Integer getLinea___ne() {
        return linea___ne;
    }
    public void setLinea___ne(Integer linea___ne) {
        this.linea___ne = linea___ne;
    }

    public Boolean getLinea___null() {
        return linea___null;
    }
    public void setLinea___null(Boolean linea___null) {
        this.linea___null = linea___null;
    }

    public Boolean getLinea___not___null() {
        return linea___not___null;
    }
    public void setLinea___not___null(Boolean linea___not___null) {
        this.linea___not___null = linea___not___null;
    }

    public java.util.List<Integer> getLinea___in() {
        return linea___in;
    }
    public void setLinea___in(java.util.List<Integer> linea___in) {
        this.linea___in = linea___in;
    }

    public java.util.List<Integer> getLinea___not___in() {
        return linea___not___in;
    }
    public void setLinea___not___in(java.util.List<Integer> linea___not___in) {
        this.linea___not___in = linea___not___in;
    }

    public Integer getLinea___lt() {
        return linea___lt;
    }
    public void setLinea___lt(Integer linea___lt) {
        this.linea___lt = linea___lt;
    }

    public Integer getLinea___lte() {
        return linea___lte;
    }
    public void setLinea___lte(Integer linea___lte) {
        this.linea___lte = linea___lte;
    }

    public Integer getLinea___gt() {
        return linea___gt;
    }
    public void setLinea___gt(Integer linea___gt) {
        this.linea___gt = linea___gt;
    }

    public Integer getLinea___gte() {
        return linea___gte;
    }
    public void setLinea___gte(Integer linea___gte) {
        this.linea___gte = linea___gte;
    }

    public Boolean getOrmonale___eq() {
        return ormonale___eq;
    }
    public void setOrmonale___eq(Boolean ormonale___eq) {
        this.ormonale___eq = ormonale___eq;
    }

    public Boolean getOrmonale___ne() {
        return ormonale___ne;
    }
    public void setOrmonale___ne(Boolean ormonale___ne) {
        this.ormonale___ne = ormonale___ne;
    }

    public Boolean getOrmonale___null() {
        return ormonale___null;
    }
    public void setOrmonale___null(Boolean ormonale___null) {
        this.ormonale___null = ormonale___null;
    }

    public Boolean getOrmonale___not___null() {
        return ormonale___not___null;
    }
    public void setOrmonale___not___null(Boolean ormonale___not___null) {
        this.ormonale___not___null = ormonale___not___null;
    }

    public Boolean getRadioterapia___eq() {
        return radioterapia___eq;
    }
    public void setRadioterapia___eq(Boolean radioterapia___eq) {
        this.radioterapia___eq = radioterapia___eq;
    }

    public Boolean getRadioterapia___ne() {
        return radioterapia___ne;
    }
    public void setRadioterapia___ne(Boolean radioterapia___ne) {
        this.radioterapia___ne = radioterapia___ne;
    }

    public Boolean getRadioterapia___null() {
        return radioterapia___null;
    }
    public void setRadioterapia___null(Boolean radioterapia___null) {
        this.radioterapia___null = radioterapia___null;
    }

    public Boolean getRadioterapia___not___null() {
        return radioterapia___not___null;
    }
    public void setRadioterapia___not___null(Boolean radioterapia___not___null) {
        this.radioterapia___not___null = radioterapia___not___null;
    }

    public Boolean getRisposta_trattamento___eq() {
        return risposta_trattamento___eq;
    }
    public void setRisposta_trattamento___eq(Boolean risposta_trattamento___eq) {
        this.risposta_trattamento___eq = risposta_trattamento___eq;
    }

    public Boolean getRisposta_trattamento___ne() {
        return risposta_trattamento___ne;
    }
    public void setRisposta_trattamento___ne(Boolean risposta_trattamento___ne) {
        this.risposta_trattamento___ne = risposta_trattamento___ne;
    }

    public Boolean getRisposta_trattamento___null() {
        return risposta_trattamento___null;
    }
    public void setRisposta_trattamento___null(Boolean risposta_trattamento___null) {
        this.risposta_trattamento___null = risposta_trattamento___null;
    }

    public Boolean getRisposta_trattamento___not___null() {
        return risposta_trattamento___not___null;
    }
    public void setRisposta_trattamento___not___null(Boolean risposta_trattamento___not___null) {
        this.risposta_trattamento___not___null = risposta_trattamento___not___null;
    }

    public Boolean getSepsi_severa___eq() {
        return sepsi_severa___eq;
    }
    public void setSepsi_severa___eq(Boolean sepsi_severa___eq) {
        this.sepsi_severa___eq = sepsi_severa___eq;
    }

    public Boolean getSepsi_severa___ne() {
        return sepsi_severa___ne;
    }
    public void setSepsi_severa___ne(Boolean sepsi_severa___ne) {
        this.sepsi_severa___ne = sepsi_severa___ne;
    }

    public Boolean getSepsi_severa___null() {
        return sepsi_severa___null;
    }
    public void setSepsi_severa___null(Boolean sepsi_severa___null) {
        this.sepsi_severa___null = sepsi_severa___null;
    }

    public Boolean getSepsi_severa___not___null() {
        return sepsi_severa___not___null;
    }
    public void setSepsi_severa___not___null(Boolean sepsi_severa___not___null) {
        this.sepsi_severa___not___null = sepsi_severa___not___null;
    }

    public Boolean getStaminali___eq() {
        return staminali___eq;
    }
    public void setStaminali___eq(Boolean staminali___eq) {
        this.staminali___eq = staminali___eq;
    }

    public Boolean getStaminali___ne() {
        return staminali___ne;
    }
    public void setStaminali___ne(Boolean staminali___ne) {
        this.staminali___ne = staminali___ne;
    }

    public Boolean getStaminali___null() {
        return staminali___null;
    }
    public void setStaminali___null(Boolean staminali___null) {
        this.staminali___null = staminali___null;
    }

    public Boolean getStaminali___not___null() {
        return staminali___not___null;
    }
    public void setStaminali___not___null(Boolean staminali___not___null) {
        this.staminali___not___null = staminali___not___null;
    }

    public String getTipo_trattamento___eq() {
        return tipo_trattamento___eq;
    }
    public void setTipo_trattamento___eq(String tipo_trattamento___eq) {
        this.tipo_trattamento___eq = tipo_trattamento___eq;
    }

    public String getTipo_trattamento___ne() {
        return tipo_trattamento___ne;
    }
    public void setTipo_trattamento___ne(String tipo_trattamento___ne) {
        this.tipo_trattamento___ne = tipo_trattamento___ne;
    }

    public Boolean getTipo_trattamento___null() {
        return tipo_trattamento___null;
    }
    public void setTipo_trattamento___null(Boolean tipo_trattamento___null) {
        this.tipo_trattamento___null = tipo_trattamento___null;
    }

    public Boolean getTipo_trattamento___not___null() {
        return tipo_trattamento___not___null;
    }
    public void setTipo_trattamento___not___null(Boolean tipo_trattamento___not___null) {
        this.tipo_trattamento___not___null = tipo_trattamento___not___null;
    }

    public java.util.List<String> getTipo_trattamento___in() {
        return tipo_trattamento___in;
    }
    public void setTipo_trattamento___in(java.util.List<String> tipo_trattamento___in) {
        this.tipo_trattamento___in = tipo_trattamento___in;
    }

    public java.util.List<String> getTipo_trattamento___not___in() {
        return tipo_trattamento___not___in;
    }
    public void setTipo_trattamento___not___in(java.util.List<String> tipo_trattamento___not___in) {
        this.tipo_trattamento___not___in = tipo_trattamento___not___in;
    }

    public String getTipo_trattamento___lt() {
        return tipo_trattamento___lt;
    }
    public void setTipo_trattamento___lt(String tipo_trattamento___lt) {
        this.tipo_trattamento___lt = tipo_trattamento___lt;
    }

    public String getTipo_trattamento___lte() {
        return tipo_trattamento___lte;
    }
    public void setTipo_trattamento___lte(String tipo_trattamento___lte) {
        this.tipo_trattamento___lte = tipo_trattamento___lte;
    }

    public String getTipo_trattamento___gt() {
        return tipo_trattamento___gt;
    }
    public void setTipo_trattamento___gt(String tipo_trattamento___gt) {
        this.tipo_trattamento___gt = tipo_trattamento___gt;
    }

    public String getTipo_trattamento___gte() {
        return tipo_trattamento___gte;
    }
    public void setTipo_trattamento___gte(String tipo_trattamento___gte) {
        this.tipo_trattamento___gte = tipo_trattamento___gte;
    }

    public String getTipo_trattamento___contains() {
        return tipo_trattamento___contains;
    }
    public void setTipo_trattamento___contains(String tipo_trattamento___contains) {
        this.tipo_trattamento___contains = tipo_trattamento___contains;
    }

    public String getTipo_trattamento___not___contains() {
        return tipo_trattamento___not___contains;
    }
    public void setTipo_trattamento___not___contains(String tipo_trattamento___not___contains) {
        this.tipo_trattamento___not___contains = tipo_trattamento___not___contains;
    }

    public String getTipo_trattamento___starts_with() {
        return tipo_trattamento___starts_with;
    }
    public void setTipo_trattamento___starts_with(String tipo_trattamento___starts_with) {
        this.tipo_trattamento___starts_with = tipo_trattamento___starts_with;
    }

    public String getTipo_trattamento___not___starts_with() {
        return tipo_trattamento___not___starts_with;
    }
    public void setTipo_trattamento___not___starts_with(String tipo_trattamento___not___starts_with) {
        this.tipo_trattamento___not___starts_with = tipo_trattamento___not___starts_with;
    }

    public String getTipo_trattamento___ends_with() {
        return tipo_trattamento___ends_with;
    }
    public void setTipo_trattamento___ends_with(String tipo_trattamento___ends_with) {
        this.tipo_trattamento___ends_with = tipo_trattamento___ends_with;
    }

    public String getTipo_trattamento___not___ends_with() {
        return tipo_trattamento___not___ends_with;
    }
    public void setTipo_trattamento___not___ends_with(String tipo_trattamento___not___ends_with) {
        this.tipo_trattamento___not___ends_with = tipo_trattamento___not___ends_with;
    }

    public Boolean getTossicita_GI___eq() {
        return tossicita_GI___eq;
    }
    public void setTossicita_GI___eq(Boolean tossicita_GI___eq) {
        this.tossicita_GI___eq = tossicita_GI___eq;
    }

    public Boolean getTossicita_GI___ne() {
        return tossicita_GI___ne;
    }
    public void setTossicita_GI___ne(Boolean tossicita_GI___ne) {
        this.tossicita_GI___ne = tossicita_GI___ne;
    }

    public Boolean getTossicita_GI___null() {
        return tossicita_GI___null;
    }
    public void setTossicita_GI___null(Boolean tossicita_GI___null) {
        this.tossicita_GI___null = tossicita_GI___null;
    }

    public Boolean getTossicita_GI___not___null() {
        return tossicita_GI___not___null;
    }
    public void setTossicita_GI___not___null(Boolean tossicita_GI___not___null) {
        this.tossicita_GI___not___null = tossicita_GI___not___null;
    }

    public Boolean getTossicita_SNC___eq() {
        return tossicita_SNC___eq;
    }
    public void setTossicita_SNC___eq(Boolean tossicita_SNC___eq) {
        this.tossicita_SNC___eq = tossicita_SNC___eq;
    }

    public Boolean getTossicita_SNC___ne() {
        return tossicita_SNC___ne;
    }
    public void setTossicita_SNC___ne(Boolean tossicita_SNC___ne) {
        this.tossicita_SNC___ne = tossicita_SNC___ne;
    }

    public Boolean getTossicita_SNC___null() {
        return tossicita_SNC___null;
    }
    public void setTossicita_SNC___null(Boolean tossicita_SNC___null) {
        this.tossicita_SNC___null = tossicita_SNC___null;
    }

    public Boolean getTossicita_SNC___not___null() {
        return tossicita_SNC___not___null;
    }
    public void setTossicita_SNC___not___null(Boolean tossicita_SNC___not___null) {
        this.tossicita_SNC___not___null = tossicita_SNC___not___null;
    }

    public Boolean getTossicita_anemia___eq() {
        return tossicita_anemia___eq;
    }
    public void setTossicita_anemia___eq(Boolean tossicita_anemia___eq) {
        this.tossicita_anemia___eq = tossicita_anemia___eq;
    }

    public Boolean getTossicita_anemia___ne() {
        return tossicita_anemia___ne;
    }
    public void setTossicita_anemia___ne(Boolean tossicita_anemia___ne) {
        this.tossicita_anemia___ne = tossicita_anemia___ne;
    }

    public Boolean getTossicita_anemia___null() {
        return tossicita_anemia___null;
    }
    public void setTossicita_anemia___null(Boolean tossicita_anemia___null) {
        this.tossicita_anemia___null = tossicita_anemia___null;
    }

    public Boolean getTossicita_anemia___not___null() {
        return tossicita_anemia___not___null;
    }
    public void setTossicita_anemia___not___null(Boolean tossicita_anemia___not___null) {
        this.tossicita_anemia___not___null = tossicita_anemia___not___null;
    }

    public Boolean getTossicita_cardiaca___eq() {
        return tossicita_cardiaca___eq;
    }
    public void setTossicita_cardiaca___eq(Boolean tossicita_cardiaca___eq) {
        this.tossicita_cardiaca___eq = tossicita_cardiaca___eq;
    }

    public Boolean getTossicita_cardiaca___ne() {
        return tossicita_cardiaca___ne;
    }
    public void setTossicita_cardiaca___ne(Boolean tossicita_cardiaca___ne) {
        this.tossicita_cardiaca___ne = tossicita_cardiaca___ne;
    }

    public Boolean getTossicita_cardiaca___null() {
        return tossicita_cardiaca___null;
    }
    public void setTossicita_cardiaca___null(Boolean tossicita_cardiaca___null) {
        this.tossicita_cardiaca___null = tossicita_cardiaca___null;
    }

    public Boolean getTossicita_cardiaca___not___null() {
        return tossicita_cardiaca___not___null;
    }
    public void setTossicita_cardiaca___not___null(Boolean tossicita_cardiaca___not___null) {
        this.tossicita_cardiaca___not___null = tossicita_cardiaca___not___null;
    }

    public Boolean getTossicita_epatica___eq() {
        return tossicita_epatica___eq;
    }
    public void setTossicita_epatica___eq(Boolean tossicita_epatica___eq) {
        this.tossicita_epatica___eq = tossicita_epatica___eq;
    }

    public Boolean getTossicita_epatica___ne() {
        return tossicita_epatica___ne;
    }
    public void setTossicita_epatica___ne(Boolean tossicita_epatica___ne) {
        this.tossicita_epatica___ne = tossicita_epatica___ne;
    }

    public Boolean getTossicita_epatica___null() {
        return tossicita_epatica___null;
    }
    public void setTossicita_epatica___null(Boolean tossicita_epatica___null) {
        this.tossicita_epatica___null = tossicita_epatica___null;
    }

    public Boolean getTossicita_epatica___not___null() {
        return tossicita_epatica___not___null;
    }
    public void setTossicita_epatica___not___null(Boolean tossicita_epatica___not___null) {
        this.tossicita_epatica___not___null = tossicita_epatica___not___null;
    }

    public Boolean getTossicita_neutropenia___eq() {
        return tossicita_neutropenia___eq;
    }
    public void setTossicita_neutropenia___eq(Boolean tossicita_neutropenia___eq) {
        this.tossicita_neutropenia___eq = tossicita_neutropenia___eq;
    }

    public Boolean getTossicita_neutropenia___ne() {
        return tossicita_neutropenia___ne;
    }
    public void setTossicita_neutropenia___ne(Boolean tossicita_neutropenia___ne) {
        this.tossicita_neutropenia___ne = tossicita_neutropenia___ne;
    }

    public Boolean getTossicita_neutropenia___null() {
        return tossicita_neutropenia___null;
    }
    public void setTossicita_neutropenia___null(Boolean tossicita_neutropenia___null) {
        this.tossicita_neutropenia___null = tossicita_neutropenia___null;
    }

    public Boolean getTossicita_neutropenia___not___null() {
        return tossicita_neutropenia___not___null;
    }
    public void setTossicita_neutropenia___not___null(Boolean tossicita_neutropenia___not___null) {
        this.tossicita_neutropenia___not___null = tossicita_neutropenia___not___null;
    }

    public Boolean getTossicita_piastrinopenia___eq() {
        return tossicita_piastrinopenia___eq;
    }
    public void setTossicita_piastrinopenia___eq(Boolean tossicita_piastrinopenia___eq) {
        this.tossicita_piastrinopenia___eq = tossicita_piastrinopenia___eq;
    }

    public Boolean getTossicita_piastrinopenia___ne() {
        return tossicita_piastrinopenia___ne;
    }
    public void setTossicita_piastrinopenia___ne(Boolean tossicita_piastrinopenia___ne) {
        this.tossicita_piastrinopenia___ne = tossicita_piastrinopenia___ne;
    }

    public Boolean getTossicita_piastrinopenia___null() {
        return tossicita_piastrinopenia___null;
    }
    public void setTossicita_piastrinopenia___null(Boolean tossicita_piastrinopenia___null) {
        this.tossicita_piastrinopenia___null = tossicita_piastrinopenia___null;
    }

    public Boolean getTossicita_piastrinopenia___not___null() {
        return tossicita_piastrinopenia___not___null;
    }
    public void setTossicita_piastrinopenia___not___null(Boolean tossicita_piastrinopenia___not___null) {
        this.tossicita_piastrinopenia___not___null = tossicita_piastrinopenia___not___null;
    }

    public java.util.List<CliTrattamento_antitumoraleFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliTrattamento_antitumoraleFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliTrattamento_antitumoraleFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliTrattamento_antitumoraleFilterDTO> OR) {
        this.OR = OR;
    }

    public CliTrattamento_antitumoraleFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliTrattamento_antitumoraleFilterDTO NOT) {
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
        if (altro___eq != null) {
            joiner.add("altro___eq: " + GraphQLRequestSerializer.getEntry(altro___eq));
        }
        if (altro___ne != null) {
            joiner.add("altro___ne: " + GraphQLRequestSerializer.getEntry(altro___ne));
        }
        if (altro___null != null) {
            joiner.add("altro___null: " + GraphQLRequestSerializer.getEntry(altro___null));
        }
        if (altro___not___null != null) {
            joiner.add("altro___not___null: " + GraphQLRequestSerializer.getEntry(altro___not___null));
        }
        if (altro___in != null) {
            joiner.add("altro___in: " + GraphQLRequestSerializer.getEntry(altro___in));
        }
        if (altro___not___in != null) {
            joiner.add("altro___not___in: " + GraphQLRequestSerializer.getEntry(altro___not___in));
        }
        if (altro___lt != null) {
            joiner.add("altro___lt: " + GraphQLRequestSerializer.getEntry(altro___lt));
        }
        if (altro___lte != null) {
            joiner.add("altro___lte: " + GraphQLRequestSerializer.getEntry(altro___lte));
        }
        if (altro___gt != null) {
            joiner.add("altro___gt: " + GraphQLRequestSerializer.getEntry(altro___gt));
        }
        if (altro___gte != null) {
            joiner.add("altro___gte: " + GraphQLRequestSerializer.getEntry(altro___gte));
        }
        if (altro___contains != null) {
            joiner.add("altro___contains: " + GraphQLRequestSerializer.getEntry(altro___contains));
        }
        if (altro___not___contains != null) {
            joiner.add("altro___not___contains: " + GraphQLRequestSerializer.getEntry(altro___not___contains));
        }
        if (altro___starts_with != null) {
            joiner.add("altro___starts_with: " + GraphQLRequestSerializer.getEntry(altro___starts_with));
        }
        if (altro___not___starts_with != null) {
            joiner.add("altro___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro___not___starts_with));
        }
        if (altro___ends_with != null) {
            joiner.add("altro___ends_with: " + GraphQLRequestSerializer.getEntry(altro___ends_with));
        }
        if (altro___not___ends_with != null) {
            joiner.add("altro___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro___not___ends_with));
        }
        if (cellulare___eq != null) {
            joiner.add("cellulare___eq: " + GraphQLRequestSerializer.getEntry(cellulare___eq));
        }
        if (cellulare___ne != null) {
            joiner.add("cellulare___ne: " + GraphQLRequestSerializer.getEntry(cellulare___ne));
        }
        if (cellulare___null != null) {
            joiner.add("cellulare___null: " + GraphQLRequestSerializer.getEntry(cellulare___null));
        }
        if (cellulare___not___null != null) {
            joiner.add("cellulare___not___null: " + GraphQLRequestSerializer.getEntry(cellulare___not___null));
        }
        if (chemioterapia___eq != null) {
            joiner.add("chemioterapia___eq: " + GraphQLRequestSerializer.getEntry(chemioterapia___eq));
        }
        if (chemioterapia___ne != null) {
            joiner.add("chemioterapia___ne: " + GraphQLRequestSerializer.getEntry(chemioterapia___ne));
        }
        if (chemioterapia___null != null) {
            joiner.add("chemioterapia___null: " + GraphQLRequestSerializer.getEntry(chemioterapia___null));
        }
        if (chemioterapia___not___null != null) {
            joiner.add("chemioterapia___not___null: " + GraphQLRequestSerializer.getEntry(chemioterapia___not___null));
        }
        if (chirurgico___eq != null) {
            joiner.add("chirurgico___eq: " + GraphQLRequestSerializer.getEntry(chirurgico___eq));
        }
        if (chirurgico___ne != null) {
            joiner.add("chirurgico___ne: " + GraphQLRequestSerializer.getEntry(chirurgico___ne));
        }
        if (chirurgico___null != null) {
            joiner.add("chirurgico___null: " + GraphQLRequestSerializer.getEntry(chirurgico___null));
        }
        if (chirurgico___not___null != null) {
            joiner.add("chirurgico___not___null: " + GraphQLRequestSerializer.getEntry(chirurgico___not___null));
        }
        if (cicli_effettuati___eq != null) {
            joiner.add("cicli_effettuati___eq: " + GraphQLRequestSerializer.getEntry(cicli_effettuati___eq));
        }
        if (cicli_effettuati___ne != null) {
            joiner.add("cicli_effettuati___ne: " + GraphQLRequestSerializer.getEntry(cicli_effettuati___ne));
        }
        if (cicli_effettuati___null != null) {
            joiner.add("cicli_effettuati___null: " + GraphQLRequestSerializer.getEntry(cicli_effettuati___null));
        }
        if (cicli_effettuati___not___null != null) {
            joiner.add("cicli_effettuati___not___null: " + GraphQLRequestSerializer.getEntry(cicli_effettuati___not___null));
        }
        if (cicli_effettuati___in != null) {
            joiner.add("cicli_effettuati___in: " + GraphQLRequestSerializer.getEntry(cicli_effettuati___in));
        }
        if (cicli_effettuati___not___in != null) {
            joiner.add("cicli_effettuati___not___in: " + GraphQLRequestSerializer.getEntry(cicli_effettuati___not___in));
        }
        if (cicli_effettuati___lt != null) {
            joiner.add("cicli_effettuati___lt: " + GraphQLRequestSerializer.getEntry(cicli_effettuati___lt));
        }
        if (cicli_effettuati___lte != null) {
            joiner.add("cicli_effettuati___lte: " + GraphQLRequestSerializer.getEntry(cicli_effettuati___lte));
        }
        if (cicli_effettuati___gt != null) {
            joiner.add("cicli_effettuati___gt: " + GraphQLRequestSerializer.getEntry(cicli_effettuati___gt));
        }
        if (cicli_effettuati___gte != null) {
            joiner.add("cicli_effettuati___gte: " + GraphQLRequestSerializer.getEntry(cicli_effettuati___gte));
        }
        if (cicli_previsti___eq != null) {
            joiner.add("cicli_previsti___eq: " + GraphQLRequestSerializer.getEntry(cicli_previsti___eq));
        }
        if (cicli_previsti___ne != null) {
            joiner.add("cicli_previsti___ne: " + GraphQLRequestSerializer.getEntry(cicli_previsti___ne));
        }
        if (cicli_previsti___null != null) {
            joiner.add("cicli_previsti___null: " + GraphQLRequestSerializer.getEntry(cicli_previsti___null));
        }
        if (cicli_previsti___not___null != null) {
            joiner.add("cicli_previsti___not___null: " + GraphQLRequestSerializer.getEntry(cicli_previsti___not___null));
        }
        if (cicli_previsti___in != null) {
            joiner.add("cicli_previsti___in: " + GraphQLRequestSerializer.getEntry(cicli_previsti___in));
        }
        if (cicli_previsti___not___in != null) {
            joiner.add("cicli_previsti___not___in: " + GraphQLRequestSerializer.getEntry(cicli_previsti___not___in));
        }
        if (cicli_previsti___lt != null) {
            joiner.add("cicli_previsti___lt: " + GraphQLRequestSerializer.getEntry(cicli_previsti___lt));
        }
        if (cicli_previsti___lte != null) {
            joiner.add("cicli_previsti___lte: " + GraphQLRequestSerializer.getEntry(cicli_previsti___lte));
        }
        if (cicli_previsti___gt != null) {
            joiner.add("cicli_previsti___gt: " + GraphQLRequestSerializer.getEntry(cicli_previsti___gt));
        }
        if (cicli_previsti___gte != null) {
            joiner.add("cicli_previsti___gte: " + GraphQLRequestSerializer.getEntry(cicli_previsti___gte));
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
        if (data_fine___eq != null) {
            joiner.add("data_fine___eq: " + GraphQLRequestSerializer.getEntry(data_fine___eq));
        }
        if (data_fine___ne != null) {
            joiner.add("data_fine___ne: " + GraphQLRequestSerializer.getEntry(data_fine___ne));
        }
        if (data_fine___null != null) {
            joiner.add("data_fine___null: " + GraphQLRequestSerializer.getEntry(data_fine___null));
        }
        if (data_fine___not___null != null) {
            joiner.add("data_fine___not___null: " + GraphQLRequestSerializer.getEntry(data_fine___not___null));
        }
        if (data_fine___in != null) {
            joiner.add("data_fine___in: " + GraphQLRequestSerializer.getEntry(data_fine___in));
        }
        if (data_fine___not___in != null) {
            joiner.add("data_fine___not___in: " + GraphQLRequestSerializer.getEntry(data_fine___not___in));
        }
        if (data_fine___lt != null) {
            joiner.add("data_fine___lt: " + GraphQLRequestSerializer.getEntry(data_fine___lt));
        }
        if (data_fine___lte != null) {
            joiner.add("data_fine___lte: " + GraphQLRequestSerializer.getEntry(data_fine___lte));
        }
        if (data_fine___gt != null) {
            joiner.add("data_fine___gt: " + GraphQLRequestSerializer.getEntry(data_fine___gt));
        }
        if (data_fine___gte != null) {
            joiner.add("data_fine___gte: " + GraphQLRequestSerializer.getEntry(data_fine___gte));
        }
        if (dose_gray_totale___eq != null) {
            joiner.add("dose_gray_totale___eq: " + GraphQLRequestSerializer.getEntry(dose_gray_totale___eq));
        }
        if (dose_gray_totale___ne != null) {
            joiner.add("dose_gray_totale___ne: " + GraphQLRequestSerializer.getEntry(dose_gray_totale___ne));
        }
        if (dose_gray_totale___null != null) {
            joiner.add("dose_gray_totale___null: " + GraphQLRequestSerializer.getEntry(dose_gray_totale___null));
        }
        if (dose_gray_totale___not___null != null) {
            joiner.add("dose_gray_totale___not___null: " + GraphQLRequestSerializer.getEntry(dose_gray_totale___not___null));
        }
        if (dose_gray_totale___in != null) {
            joiner.add("dose_gray_totale___in: " + GraphQLRequestSerializer.getEntry(dose_gray_totale___in));
        }
        if (dose_gray_totale___not___in != null) {
            joiner.add("dose_gray_totale___not___in: " + GraphQLRequestSerializer.getEntry(dose_gray_totale___not___in));
        }
        if (dose_gray_totale___lt != null) {
            joiner.add("dose_gray_totale___lt: " + GraphQLRequestSerializer.getEntry(dose_gray_totale___lt));
        }
        if (dose_gray_totale___lte != null) {
            joiner.add("dose_gray_totale___lte: " + GraphQLRequestSerializer.getEntry(dose_gray_totale___lte));
        }
        if (dose_gray_totale___gt != null) {
            joiner.add("dose_gray_totale___gt: " + GraphQLRequestSerializer.getEntry(dose_gray_totale___gt));
        }
        if (dose_gray_totale___gte != null) {
            joiner.add("dose_gray_totale___gte: " + GraphQLRequestSerializer.getEntry(dose_gray_totale___gte));
        }
        if (farmaci_antitumorali___eq != null) {
            joiner.add("farmaci_antitumorali___eq: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___eq));
        }
        if (farmaci_antitumorali___ne != null) {
            joiner.add("farmaci_antitumorali___ne: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___ne));
        }
        if (farmaci_antitumorali___null != null) {
            joiner.add("farmaci_antitumorali___null: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___null));
        }
        if (farmaci_antitumorali___not___null != null) {
            joiner.add("farmaci_antitumorali___not___null: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___not___null));
        }
        if (farmaci_antitumorali___in != null) {
            joiner.add("farmaci_antitumorali___in: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___in));
        }
        if (farmaci_antitumorali___not___in != null) {
            joiner.add("farmaci_antitumorali___not___in: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___not___in));
        }
        if (farmaci_antitumorali___lt != null) {
            joiner.add("farmaci_antitumorali___lt: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___lt));
        }
        if (farmaci_antitumorali___lte != null) {
            joiner.add("farmaci_antitumorali___lte: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___lte));
        }
        if (farmaci_antitumorali___gt != null) {
            joiner.add("farmaci_antitumorali___gt: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___gt));
        }
        if (farmaci_antitumorali___gte != null) {
            joiner.add("farmaci_antitumorali___gte: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___gte));
        }
        if (farmaci_antitumorali___contains != null) {
            joiner.add("farmaci_antitumorali___contains: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___contains));
        }
        if (farmaci_antitumorali___not___contains != null) {
            joiner.add("farmaci_antitumorali___not___contains: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___not___contains));
        }
        if (farmaci_antitumorali___starts_with != null) {
            joiner.add("farmaci_antitumorali___starts_with: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___starts_with));
        }
        if (farmaci_antitumorali___not___starts_with != null) {
            joiner.add("farmaci_antitumorali___not___starts_with: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___not___starts_with));
        }
        if (farmaci_antitumorali___ends_with != null) {
            joiner.add("farmaci_antitumorali___ends_with: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___ends_with));
        }
        if (farmaci_antitumorali___not___ends_with != null) {
            joiner.add("farmaci_antitumorali___not___ends_with: " + GraphQLRequestSerializer.getEntry(farmaci_antitumorali___not___ends_with));
        }
        if (filtra_farmaci___eq != null) {
            joiner.add("filtra_farmaci___eq: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___eq));
        }
        if (filtra_farmaci___ne != null) {
            joiner.add("filtra_farmaci___ne: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___ne));
        }
        if (filtra_farmaci___null != null) {
            joiner.add("filtra_farmaci___null: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___null));
        }
        if (filtra_farmaci___not___null != null) {
            joiner.add("filtra_farmaci___not___null: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___not___null));
        }
        if (filtra_farmaci___in != null) {
            joiner.add("filtra_farmaci___in: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___in));
        }
        if (filtra_farmaci___not___in != null) {
            joiner.add("filtra_farmaci___not___in: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___not___in));
        }
        if (filtra_farmaci___lt != null) {
            joiner.add("filtra_farmaci___lt: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___lt));
        }
        if (filtra_farmaci___lte != null) {
            joiner.add("filtra_farmaci___lte: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___lte));
        }
        if (filtra_farmaci___gt != null) {
            joiner.add("filtra_farmaci___gt: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___gt));
        }
        if (filtra_farmaci___gte != null) {
            joiner.add("filtra_farmaci___gte: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___gte));
        }
        if (filtra_farmaci___contains != null) {
            joiner.add("filtra_farmaci___contains: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___contains));
        }
        if (filtra_farmaci___not___contains != null) {
            joiner.add("filtra_farmaci___not___contains: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___not___contains));
        }
        if (filtra_farmaci___starts_with != null) {
            joiner.add("filtra_farmaci___starts_with: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___starts_with));
        }
        if (filtra_farmaci___not___starts_with != null) {
            joiner.add("filtra_farmaci___not___starts_with: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___not___starts_with));
        }
        if (filtra_farmaci___ends_with != null) {
            joiner.add("filtra_farmaci___ends_with: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___ends_with));
        }
        if (filtra_farmaci___not___ends_with != null) {
            joiner.add("filtra_farmaci___not___ends_with: " + GraphQLRequestSerializer.getEntry(filtra_farmaci___not___ends_with));
        }
        if (immunoterapia___eq != null) {
            joiner.add("immunoterapia___eq: " + GraphQLRequestSerializer.getEntry(immunoterapia___eq));
        }
        if (immunoterapia___ne != null) {
            joiner.add("immunoterapia___ne: " + GraphQLRequestSerializer.getEntry(immunoterapia___ne));
        }
        if (immunoterapia___null != null) {
            joiner.add("immunoterapia___null: " + GraphQLRequestSerializer.getEntry(immunoterapia___null));
        }
        if (immunoterapia___not___null != null) {
            joiner.add("immunoterapia___not___null: " + GraphQLRequestSerializer.getEntry(immunoterapia___not___null));
        }
        if (infezioni___eq != null) {
            joiner.add("infezioni___eq: " + GraphQLRequestSerializer.getEntry(infezioni___eq));
        }
        if (infezioni___ne != null) {
            joiner.add("infezioni___ne: " + GraphQLRequestSerializer.getEntry(infezioni___ne));
        }
        if (infezioni___null != null) {
            joiner.add("infezioni___null: " + GraphQLRequestSerializer.getEntry(infezioni___null));
        }
        if (infezioni___not___null != null) {
            joiner.add("infezioni___not___null: " + GraphQLRequestSerializer.getEntry(infezioni___not___null));
        }
        if (infezioni___in != null) {
            joiner.add("infezioni___in: " + GraphQLRequestSerializer.getEntry(infezioni___in));
        }
        if (infezioni___not___in != null) {
            joiner.add("infezioni___not___in: " + GraphQLRequestSerializer.getEntry(infezioni___not___in));
        }
        if (infezioni___lt != null) {
            joiner.add("infezioni___lt: " + GraphQLRequestSerializer.getEntry(infezioni___lt));
        }
        if (infezioni___lte != null) {
            joiner.add("infezioni___lte: " + GraphQLRequestSerializer.getEntry(infezioni___lte));
        }
        if (infezioni___gt != null) {
            joiner.add("infezioni___gt: " + GraphQLRequestSerializer.getEntry(infezioni___gt));
        }
        if (infezioni___gte != null) {
            joiner.add("infezioni___gte: " + GraphQLRequestSerializer.getEntry(infezioni___gte));
        }
        if (infezioni___contains != null) {
            joiner.add("infezioni___contains: " + GraphQLRequestSerializer.getEntry(infezioni___contains));
        }
        if (infezioni___not___contains != null) {
            joiner.add("infezioni___not___contains: " + GraphQLRequestSerializer.getEntry(infezioni___not___contains));
        }
        if (infezioni___starts_with != null) {
            joiner.add("infezioni___starts_with: " + GraphQLRequestSerializer.getEntry(infezioni___starts_with));
        }
        if (infezioni___not___starts_with != null) {
            joiner.add("infezioni___not___starts_with: " + GraphQLRequestSerializer.getEntry(infezioni___not___starts_with));
        }
        if (infezioni___ends_with != null) {
            joiner.add("infezioni___ends_with: " + GraphQLRequestSerializer.getEntry(infezioni___ends_with));
        }
        if (infezioni___not___ends_with != null) {
            joiner.add("infezioni___not___ends_with: " + GraphQLRequestSerializer.getEntry(infezioni___not___ends_with));
        }
        if (linea___eq != null) {
            joiner.add("linea___eq: " + GraphQLRequestSerializer.getEntry(linea___eq));
        }
        if (linea___ne != null) {
            joiner.add("linea___ne: " + GraphQLRequestSerializer.getEntry(linea___ne));
        }
        if (linea___null != null) {
            joiner.add("linea___null: " + GraphQLRequestSerializer.getEntry(linea___null));
        }
        if (linea___not___null != null) {
            joiner.add("linea___not___null: " + GraphQLRequestSerializer.getEntry(linea___not___null));
        }
        if (linea___in != null) {
            joiner.add("linea___in: " + GraphQLRequestSerializer.getEntry(linea___in));
        }
        if (linea___not___in != null) {
            joiner.add("linea___not___in: " + GraphQLRequestSerializer.getEntry(linea___not___in));
        }
        if (linea___lt != null) {
            joiner.add("linea___lt: " + GraphQLRequestSerializer.getEntry(linea___lt));
        }
        if (linea___lte != null) {
            joiner.add("linea___lte: " + GraphQLRequestSerializer.getEntry(linea___lte));
        }
        if (linea___gt != null) {
            joiner.add("linea___gt: " + GraphQLRequestSerializer.getEntry(linea___gt));
        }
        if (linea___gte != null) {
            joiner.add("linea___gte: " + GraphQLRequestSerializer.getEntry(linea___gte));
        }
        if (ormonale___eq != null) {
            joiner.add("ormonale___eq: " + GraphQLRequestSerializer.getEntry(ormonale___eq));
        }
        if (ormonale___ne != null) {
            joiner.add("ormonale___ne: " + GraphQLRequestSerializer.getEntry(ormonale___ne));
        }
        if (ormonale___null != null) {
            joiner.add("ormonale___null: " + GraphQLRequestSerializer.getEntry(ormonale___null));
        }
        if (ormonale___not___null != null) {
            joiner.add("ormonale___not___null: " + GraphQLRequestSerializer.getEntry(ormonale___not___null));
        }
        if (radioterapia___eq != null) {
            joiner.add("radioterapia___eq: " + GraphQLRequestSerializer.getEntry(radioterapia___eq));
        }
        if (radioterapia___ne != null) {
            joiner.add("radioterapia___ne: " + GraphQLRequestSerializer.getEntry(radioterapia___ne));
        }
        if (radioterapia___null != null) {
            joiner.add("radioterapia___null: " + GraphQLRequestSerializer.getEntry(radioterapia___null));
        }
        if (radioterapia___not___null != null) {
            joiner.add("radioterapia___not___null: " + GraphQLRequestSerializer.getEntry(radioterapia___not___null));
        }
        if (risposta_trattamento___eq != null) {
            joiner.add("risposta_trattamento___eq: " + GraphQLRequestSerializer.getEntry(risposta_trattamento___eq));
        }
        if (risposta_trattamento___ne != null) {
            joiner.add("risposta_trattamento___ne: " + GraphQLRequestSerializer.getEntry(risposta_trattamento___ne));
        }
        if (risposta_trattamento___null != null) {
            joiner.add("risposta_trattamento___null: " + GraphQLRequestSerializer.getEntry(risposta_trattamento___null));
        }
        if (risposta_trattamento___not___null != null) {
            joiner.add("risposta_trattamento___not___null: " + GraphQLRequestSerializer.getEntry(risposta_trattamento___not___null));
        }
        if (sepsi_severa___eq != null) {
            joiner.add("sepsi_severa___eq: " + GraphQLRequestSerializer.getEntry(sepsi_severa___eq));
        }
        if (sepsi_severa___ne != null) {
            joiner.add("sepsi_severa___ne: " + GraphQLRequestSerializer.getEntry(sepsi_severa___ne));
        }
        if (sepsi_severa___null != null) {
            joiner.add("sepsi_severa___null: " + GraphQLRequestSerializer.getEntry(sepsi_severa___null));
        }
        if (sepsi_severa___not___null != null) {
            joiner.add("sepsi_severa___not___null: " + GraphQLRequestSerializer.getEntry(sepsi_severa___not___null));
        }
        if (staminali___eq != null) {
            joiner.add("staminali___eq: " + GraphQLRequestSerializer.getEntry(staminali___eq));
        }
        if (staminali___ne != null) {
            joiner.add("staminali___ne: " + GraphQLRequestSerializer.getEntry(staminali___ne));
        }
        if (staminali___null != null) {
            joiner.add("staminali___null: " + GraphQLRequestSerializer.getEntry(staminali___null));
        }
        if (staminali___not___null != null) {
            joiner.add("staminali___not___null: " + GraphQLRequestSerializer.getEntry(staminali___not___null));
        }
        if (tipo_trattamento___eq != null) {
            joiner.add("tipo_trattamento___eq: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___eq));
        }
        if (tipo_trattamento___ne != null) {
            joiner.add("tipo_trattamento___ne: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___ne));
        }
        if (tipo_trattamento___null != null) {
            joiner.add("tipo_trattamento___null: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___null));
        }
        if (tipo_trattamento___not___null != null) {
            joiner.add("tipo_trattamento___not___null: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___not___null));
        }
        if (tipo_trattamento___in != null) {
            joiner.add("tipo_trattamento___in: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___in));
        }
        if (tipo_trattamento___not___in != null) {
            joiner.add("tipo_trattamento___not___in: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___not___in));
        }
        if (tipo_trattamento___lt != null) {
            joiner.add("tipo_trattamento___lt: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___lt));
        }
        if (tipo_trattamento___lte != null) {
            joiner.add("tipo_trattamento___lte: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___lte));
        }
        if (tipo_trattamento___gt != null) {
            joiner.add("tipo_trattamento___gt: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___gt));
        }
        if (tipo_trattamento___gte != null) {
            joiner.add("tipo_trattamento___gte: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___gte));
        }
        if (tipo_trattamento___contains != null) {
            joiner.add("tipo_trattamento___contains: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___contains));
        }
        if (tipo_trattamento___not___contains != null) {
            joiner.add("tipo_trattamento___not___contains: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___not___contains));
        }
        if (tipo_trattamento___starts_with != null) {
            joiner.add("tipo_trattamento___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___starts_with));
        }
        if (tipo_trattamento___not___starts_with != null) {
            joiner.add("tipo_trattamento___not___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___not___starts_with));
        }
        if (tipo_trattamento___ends_with != null) {
            joiner.add("tipo_trattamento___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___ends_with));
        }
        if (tipo_trattamento___not___ends_with != null) {
            joiner.add("tipo_trattamento___not___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_trattamento___not___ends_with));
        }
        if (tossicita_GI___eq != null) {
            joiner.add("tossicita_GI___eq: " + GraphQLRequestSerializer.getEntry(tossicita_GI___eq));
        }
        if (tossicita_GI___ne != null) {
            joiner.add("tossicita_GI___ne: " + GraphQLRequestSerializer.getEntry(tossicita_GI___ne));
        }
        if (tossicita_GI___null != null) {
            joiner.add("tossicita_GI___null: " + GraphQLRequestSerializer.getEntry(tossicita_GI___null));
        }
        if (tossicita_GI___not___null != null) {
            joiner.add("tossicita_GI___not___null: " + GraphQLRequestSerializer.getEntry(tossicita_GI___not___null));
        }
        if (tossicita_SNC___eq != null) {
            joiner.add("tossicita_SNC___eq: " + GraphQLRequestSerializer.getEntry(tossicita_SNC___eq));
        }
        if (tossicita_SNC___ne != null) {
            joiner.add("tossicita_SNC___ne: " + GraphQLRequestSerializer.getEntry(tossicita_SNC___ne));
        }
        if (tossicita_SNC___null != null) {
            joiner.add("tossicita_SNC___null: " + GraphQLRequestSerializer.getEntry(tossicita_SNC___null));
        }
        if (tossicita_SNC___not___null != null) {
            joiner.add("tossicita_SNC___not___null: " + GraphQLRequestSerializer.getEntry(tossicita_SNC___not___null));
        }
        if (tossicita_anemia___eq != null) {
            joiner.add("tossicita_anemia___eq: " + GraphQLRequestSerializer.getEntry(tossicita_anemia___eq));
        }
        if (tossicita_anemia___ne != null) {
            joiner.add("tossicita_anemia___ne: " + GraphQLRequestSerializer.getEntry(tossicita_anemia___ne));
        }
        if (tossicita_anemia___null != null) {
            joiner.add("tossicita_anemia___null: " + GraphQLRequestSerializer.getEntry(tossicita_anemia___null));
        }
        if (tossicita_anemia___not___null != null) {
            joiner.add("tossicita_anemia___not___null: " + GraphQLRequestSerializer.getEntry(tossicita_anemia___not___null));
        }
        if (tossicita_cardiaca___eq != null) {
            joiner.add("tossicita_cardiaca___eq: " + GraphQLRequestSerializer.getEntry(tossicita_cardiaca___eq));
        }
        if (tossicita_cardiaca___ne != null) {
            joiner.add("tossicita_cardiaca___ne: " + GraphQLRequestSerializer.getEntry(tossicita_cardiaca___ne));
        }
        if (tossicita_cardiaca___null != null) {
            joiner.add("tossicita_cardiaca___null: " + GraphQLRequestSerializer.getEntry(tossicita_cardiaca___null));
        }
        if (tossicita_cardiaca___not___null != null) {
            joiner.add("tossicita_cardiaca___not___null: " + GraphQLRequestSerializer.getEntry(tossicita_cardiaca___not___null));
        }
        if (tossicita_epatica___eq != null) {
            joiner.add("tossicita_epatica___eq: " + GraphQLRequestSerializer.getEntry(tossicita_epatica___eq));
        }
        if (tossicita_epatica___ne != null) {
            joiner.add("tossicita_epatica___ne: " + GraphQLRequestSerializer.getEntry(tossicita_epatica___ne));
        }
        if (tossicita_epatica___null != null) {
            joiner.add("tossicita_epatica___null: " + GraphQLRequestSerializer.getEntry(tossicita_epatica___null));
        }
        if (tossicita_epatica___not___null != null) {
            joiner.add("tossicita_epatica___not___null: " + GraphQLRequestSerializer.getEntry(tossicita_epatica___not___null));
        }
        if (tossicita_neutropenia___eq != null) {
            joiner.add("tossicita_neutropenia___eq: " + GraphQLRequestSerializer.getEntry(tossicita_neutropenia___eq));
        }
        if (tossicita_neutropenia___ne != null) {
            joiner.add("tossicita_neutropenia___ne: " + GraphQLRequestSerializer.getEntry(tossicita_neutropenia___ne));
        }
        if (tossicita_neutropenia___null != null) {
            joiner.add("tossicita_neutropenia___null: " + GraphQLRequestSerializer.getEntry(tossicita_neutropenia___null));
        }
        if (tossicita_neutropenia___not___null != null) {
            joiner.add("tossicita_neutropenia___not___null: " + GraphQLRequestSerializer.getEntry(tossicita_neutropenia___not___null));
        }
        if (tossicita_piastrinopenia___eq != null) {
            joiner.add("tossicita_piastrinopenia___eq: " + GraphQLRequestSerializer.getEntry(tossicita_piastrinopenia___eq));
        }
        if (tossicita_piastrinopenia___ne != null) {
            joiner.add("tossicita_piastrinopenia___ne: " + GraphQLRequestSerializer.getEntry(tossicita_piastrinopenia___ne));
        }
        if (tossicita_piastrinopenia___null != null) {
            joiner.add("tossicita_piastrinopenia___null: " + GraphQLRequestSerializer.getEntry(tossicita_piastrinopenia___null));
        }
        if (tossicita_piastrinopenia___not___null != null) {
            joiner.add("tossicita_piastrinopenia___not___null: " + GraphQLRequestSerializer.getEntry(tossicita_piastrinopenia___not___null));
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

    public static CliTrattamento_antitumoraleFilterDTO.Builder builder() {
        return new CliTrattamento_antitumoraleFilterDTO.Builder();
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
        private String altro___eq;
        private String altro___ne;
        private Boolean altro___null;
        private Boolean altro___not___null;
        private java.util.List<String> altro___in;
        private java.util.List<String> altro___not___in;
        private String altro___lt;
        private String altro___lte;
        private String altro___gt;
        private String altro___gte;
        private String altro___contains;
        private String altro___not___contains;
        private String altro___starts_with;
        private String altro___not___starts_with;
        private String altro___ends_with;
        private String altro___not___ends_with;
        private Boolean cellulare___eq;
        private Boolean cellulare___ne;
        private Boolean cellulare___null;
        private Boolean cellulare___not___null;
        private Boolean chemioterapia___eq;
        private Boolean chemioterapia___ne;
        private Boolean chemioterapia___null;
        private Boolean chemioterapia___not___null;
        private Boolean chirurgico___eq;
        private Boolean chirurgico___ne;
        private Boolean chirurgico___null;
        private Boolean chirurgico___not___null;
        private Integer cicli_effettuati___eq;
        private Integer cicli_effettuati___ne;
        private Boolean cicli_effettuati___null;
        private Boolean cicli_effettuati___not___null;
        private java.util.List<Integer> cicli_effettuati___in;
        private java.util.List<Integer> cicli_effettuati___not___in;
        private Integer cicli_effettuati___lt;
        private Integer cicli_effettuati___lte;
        private Integer cicli_effettuati___gt;
        private Integer cicli_effettuati___gte;
        private Integer cicli_previsti___eq;
        private Integer cicli_previsti___ne;
        private Boolean cicli_previsti___null;
        private Boolean cicli_previsti___not___null;
        private java.util.List<Integer> cicli_previsti___in;
        private java.util.List<Integer> cicli_previsti___not___in;
        private Integer cicli_previsti___lt;
        private Integer cicli_previsti___lte;
        private Integer cicli_previsti___gt;
        private Integer cicli_previsti___gte;
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
        private String data_fine___eq;
        private String data_fine___ne;
        private Boolean data_fine___null;
        private Boolean data_fine___not___null;
        private java.util.List<String> data_fine___in;
        private java.util.List<String> data_fine___not___in;
        private String data_fine___lt;
        private String data_fine___lte;
        private String data_fine___gt;
        private String data_fine___gte;
        private String dose_gray_totale___eq;
        private String dose_gray_totale___ne;
        private Boolean dose_gray_totale___null;
        private Boolean dose_gray_totale___not___null;
        private java.util.List<String> dose_gray_totale___in;
        private java.util.List<String> dose_gray_totale___not___in;
        private String dose_gray_totale___lt;
        private String dose_gray_totale___lte;
        private String dose_gray_totale___gt;
        private String dose_gray_totale___gte;
        private String farmaci_antitumorali___eq;
        private String farmaci_antitumorali___ne;
        private Boolean farmaci_antitumorali___null;
        private Boolean farmaci_antitumorali___not___null;
        private java.util.List<String> farmaci_antitumorali___in;
        private java.util.List<String> farmaci_antitumorali___not___in;
        private String farmaci_antitumorali___lt;
        private String farmaci_antitumorali___lte;
        private String farmaci_antitumorali___gt;
        private String farmaci_antitumorali___gte;
        private String farmaci_antitumorali___contains;
        private String farmaci_antitumorali___not___contains;
        private String farmaci_antitumorali___starts_with;
        private String farmaci_antitumorali___not___starts_with;
        private String farmaci_antitumorali___ends_with;
        private String farmaci_antitumorali___not___ends_with;
        private String filtra_farmaci___eq;
        private String filtra_farmaci___ne;
        private Boolean filtra_farmaci___null;
        private Boolean filtra_farmaci___not___null;
        private java.util.List<String> filtra_farmaci___in;
        private java.util.List<String> filtra_farmaci___not___in;
        private String filtra_farmaci___lt;
        private String filtra_farmaci___lte;
        private String filtra_farmaci___gt;
        private String filtra_farmaci___gte;
        private String filtra_farmaci___contains;
        private String filtra_farmaci___not___contains;
        private String filtra_farmaci___starts_with;
        private String filtra_farmaci___not___starts_with;
        private String filtra_farmaci___ends_with;
        private String filtra_farmaci___not___ends_with;
        private Boolean immunoterapia___eq;
        private Boolean immunoterapia___ne;
        private Boolean immunoterapia___null;
        private Boolean immunoterapia___not___null;
        private String infezioni___eq;
        private String infezioni___ne;
        private Boolean infezioni___null;
        private Boolean infezioni___not___null;
        private java.util.List<String> infezioni___in;
        private java.util.List<String> infezioni___not___in;
        private String infezioni___lt;
        private String infezioni___lte;
        private String infezioni___gt;
        private String infezioni___gte;
        private String infezioni___contains;
        private String infezioni___not___contains;
        private String infezioni___starts_with;
        private String infezioni___not___starts_with;
        private String infezioni___ends_with;
        private String infezioni___not___ends_with;
        private Integer linea___eq;
        private Integer linea___ne;
        private Boolean linea___null;
        private Boolean linea___not___null;
        private java.util.List<Integer> linea___in;
        private java.util.List<Integer> linea___not___in;
        private Integer linea___lt;
        private Integer linea___lte;
        private Integer linea___gt;
        private Integer linea___gte;
        private Boolean ormonale___eq;
        private Boolean ormonale___ne;
        private Boolean ormonale___null;
        private Boolean ormonale___not___null;
        private Boolean radioterapia___eq;
        private Boolean radioterapia___ne;
        private Boolean radioterapia___null;
        private Boolean radioterapia___not___null;
        private Boolean risposta_trattamento___eq;
        private Boolean risposta_trattamento___ne;
        private Boolean risposta_trattamento___null;
        private Boolean risposta_trattamento___not___null;
        private Boolean sepsi_severa___eq;
        private Boolean sepsi_severa___ne;
        private Boolean sepsi_severa___null;
        private Boolean sepsi_severa___not___null;
        private Boolean staminali___eq;
        private Boolean staminali___ne;
        private Boolean staminali___null;
        private Boolean staminali___not___null;
        private String tipo_trattamento___eq;
        private String tipo_trattamento___ne;
        private Boolean tipo_trattamento___null;
        private Boolean tipo_trattamento___not___null;
        private java.util.List<String> tipo_trattamento___in;
        private java.util.List<String> tipo_trattamento___not___in;
        private String tipo_trattamento___lt;
        private String tipo_trattamento___lte;
        private String tipo_trattamento___gt;
        private String tipo_trattamento___gte;
        private String tipo_trattamento___contains;
        private String tipo_trattamento___not___contains;
        private String tipo_trattamento___starts_with;
        private String tipo_trattamento___not___starts_with;
        private String tipo_trattamento___ends_with;
        private String tipo_trattamento___not___ends_with;
        private Boolean tossicita_GI___eq;
        private Boolean tossicita_GI___ne;
        private Boolean tossicita_GI___null;
        private Boolean tossicita_GI___not___null;
        private Boolean tossicita_SNC___eq;
        private Boolean tossicita_SNC___ne;
        private Boolean tossicita_SNC___null;
        private Boolean tossicita_SNC___not___null;
        private Boolean tossicita_anemia___eq;
        private Boolean tossicita_anemia___ne;
        private Boolean tossicita_anemia___null;
        private Boolean tossicita_anemia___not___null;
        private Boolean tossicita_cardiaca___eq;
        private Boolean tossicita_cardiaca___ne;
        private Boolean tossicita_cardiaca___null;
        private Boolean tossicita_cardiaca___not___null;
        private Boolean tossicita_epatica___eq;
        private Boolean tossicita_epatica___ne;
        private Boolean tossicita_epatica___null;
        private Boolean tossicita_epatica___not___null;
        private Boolean tossicita_neutropenia___eq;
        private Boolean tossicita_neutropenia___ne;
        private Boolean tossicita_neutropenia___null;
        private Boolean tossicita_neutropenia___not___null;
        private Boolean tossicita_piastrinopenia___eq;
        private Boolean tossicita_piastrinopenia___ne;
        private Boolean tossicita_piastrinopenia___null;
        private Boolean tossicita_piastrinopenia___not___null;
        private java.util.List<CliTrattamento_antitumoraleFilterDTO> AND;
        private java.util.List<CliTrattamento_antitumoraleFilterDTO> OR;
        private CliTrattamento_antitumoraleFilterDTO NOT;

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

        public Builder setAltro___eq(String altro___eq) {
            this.altro___eq = altro___eq;
            return this;
        }

        public Builder setAltro___ne(String altro___ne) {
            this.altro___ne = altro___ne;
            return this;
        }

        public Builder setAltro___null(Boolean altro___null) {
            this.altro___null = altro___null;
            return this;
        }

        public Builder setAltro___not___null(Boolean altro___not___null) {
            this.altro___not___null = altro___not___null;
            return this;
        }

        public Builder setAltro___in(java.util.List<String> altro___in) {
            this.altro___in = altro___in;
            return this;
        }

        public Builder setAltro___not___in(java.util.List<String> altro___not___in) {
            this.altro___not___in = altro___not___in;
            return this;
        }

        public Builder setAltro___lt(String altro___lt) {
            this.altro___lt = altro___lt;
            return this;
        }

        public Builder setAltro___lte(String altro___lte) {
            this.altro___lte = altro___lte;
            return this;
        }

        public Builder setAltro___gt(String altro___gt) {
            this.altro___gt = altro___gt;
            return this;
        }

        public Builder setAltro___gte(String altro___gte) {
            this.altro___gte = altro___gte;
            return this;
        }

        public Builder setAltro___contains(String altro___contains) {
            this.altro___contains = altro___contains;
            return this;
        }

        public Builder setAltro___not___contains(String altro___not___contains) {
            this.altro___not___contains = altro___not___contains;
            return this;
        }

        public Builder setAltro___starts_with(String altro___starts_with) {
            this.altro___starts_with = altro___starts_with;
            return this;
        }

        public Builder setAltro___not___starts_with(String altro___not___starts_with) {
            this.altro___not___starts_with = altro___not___starts_with;
            return this;
        }

        public Builder setAltro___ends_with(String altro___ends_with) {
            this.altro___ends_with = altro___ends_with;
            return this;
        }

        public Builder setAltro___not___ends_with(String altro___not___ends_with) {
            this.altro___not___ends_with = altro___not___ends_with;
            return this;
        }

        public Builder setCellulare___eq(Boolean cellulare___eq) {
            this.cellulare___eq = cellulare___eq;
            return this;
        }

        public Builder setCellulare___ne(Boolean cellulare___ne) {
            this.cellulare___ne = cellulare___ne;
            return this;
        }

        public Builder setCellulare___null(Boolean cellulare___null) {
            this.cellulare___null = cellulare___null;
            return this;
        }

        public Builder setCellulare___not___null(Boolean cellulare___not___null) {
            this.cellulare___not___null = cellulare___not___null;
            return this;
        }

        public Builder setChemioterapia___eq(Boolean chemioterapia___eq) {
            this.chemioterapia___eq = chemioterapia___eq;
            return this;
        }

        public Builder setChemioterapia___ne(Boolean chemioterapia___ne) {
            this.chemioterapia___ne = chemioterapia___ne;
            return this;
        }

        public Builder setChemioterapia___null(Boolean chemioterapia___null) {
            this.chemioterapia___null = chemioterapia___null;
            return this;
        }

        public Builder setChemioterapia___not___null(Boolean chemioterapia___not___null) {
            this.chemioterapia___not___null = chemioterapia___not___null;
            return this;
        }

        public Builder setChirurgico___eq(Boolean chirurgico___eq) {
            this.chirurgico___eq = chirurgico___eq;
            return this;
        }

        public Builder setChirurgico___ne(Boolean chirurgico___ne) {
            this.chirurgico___ne = chirurgico___ne;
            return this;
        }

        public Builder setChirurgico___null(Boolean chirurgico___null) {
            this.chirurgico___null = chirurgico___null;
            return this;
        }

        public Builder setChirurgico___not___null(Boolean chirurgico___not___null) {
            this.chirurgico___not___null = chirurgico___not___null;
            return this;
        }

        public Builder setCicli_effettuati___eq(Integer cicli_effettuati___eq) {
            this.cicli_effettuati___eq = cicli_effettuati___eq;
            return this;
        }

        public Builder setCicli_effettuati___ne(Integer cicli_effettuati___ne) {
            this.cicli_effettuati___ne = cicli_effettuati___ne;
            return this;
        }

        public Builder setCicli_effettuati___null(Boolean cicli_effettuati___null) {
            this.cicli_effettuati___null = cicli_effettuati___null;
            return this;
        }

        public Builder setCicli_effettuati___not___null(Boolean cicli_effettuati___not___null) {
            this.cicli_effettuati___not___null = cicli_effettuati___not___null;
            return this;
        }

        public Builder setCicli_effettuati___in(java.util.List<Integer> cicli_effettuati___in) {
            this.cicli_effettuati___in = cicli_effettuati___in;
            return this;
        }

        public Builder setCicli_effettuati___not___in(java.util.List<Integer> cicli_effettuati___not___in) {
            this.cicli_effettuati___not___in = cicli_effettuati___not___in;
            return this;
        }

        public Builder setCicli_effettuati___lt(Integer cicli_effettuati___lt) {
            this.cicli_effettuati___lt = cicli_effettuati___lt;
            return this;
        }

        public Builder setCicli_effettuati___lte(Integer cicli_effettuati___lte) {
            this.cicli_effettuati___lte = cicli_effettuati___lte;
            return this;
        }

        public Builder setCicli_effettuati___gt(Integer cicli_effettuati___gt) {
            this.cicli_effettuati___gt = cicli_effettuati___gt;
            return this;
        }

        public Builder setCicli_effettuati___gte(Integer cicli_effettuati___gte) {
            this.cicli_effettuati___gte = cicli_effettuati___gte;
            return this;
        }

        public Builder setCicli_previsti___eq(Integer cicli_previsti___eq) {
            this.cicli_previsti___eq = cicli_previsti___eq;
            return this;
        }

        public Builder setCicli_previsti___ne(Integer cicli_previsti___ne) {
            this.cicli_previsti___ne = cicli_previsti___ne;
            return this;
        }

        public Builder setCicli_previsti___null(Boolean cicli_previsti___null) {
            this.cicli_previsti___null = cicli_previsti___null;
            return this;
        }

        public Builder setCicli_previsti___not___null(Boolean cicli_previsti___not___null) {
            this.cicli_previsti___not___null = cicli_previsti___not___null;
            return this;
        }

        public Builder setCicli_previsti___in(java.util.List<Integer> cicli_previsti___in) {
            this.cicli_previsti___in = cicli_previsti___in;
            return this;
        }

        public Builder setCicli_previsti___not___in(java.util.List<Integer> cicli_previsti___not___in) {
            this.cicli_previsti___not___in = cicli_previsti___not___in;
            return this;
        }

        public Builder setCicli_previsti___lt(Integer cicli_previsti___lt) {
            this.cicli_previsti___lt = cicli_previsti___lt;
            return this;
        }

        public Builder setCicli_previsti___lte(Integer cicli_previsti___lte) {
            this.cicli_previsti___lte = cicli_previsti___lte;
            return this;
        }

        public Builder setCicli_previsti___gt(Integer cicli_previsti___gt) {
            this.cicli_previsti___gt = cicli_previsti___gt;
            return this;
        }

        public Builder setCicli_previsti___gte(Integer cicli_previsti___gte) {
            this.cicli_previsti___gte = cicli_previsti___gte;
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

        public Builder setData_fine___eq(String data_fine___eq) {
            this.data_fine___eq = data_fine___eq;
            return this;
        }

        public Builder setData_fine___ne(String data_fine___ne) {
            this.data_fine___ne = data_fine___ne;
            return this;
        }

        public Builder setData_fine___null(Boolean data_fine___null) {
            this.data_fine___null = data_fine___null;
            return this;
        }

        public Builder setData_fine___not___null(Boolean data_fine___not___null) {
            this.data_fine___not___null = data_fine___not___null;
            return this;
        }

        public Builder setData_fine___in(java.util.List<String> data_fine___in) {
            this.data_fine___in = data_fine___in;
            return this;
        }

        public Builder setData_fine___not___in(java.util.List<String> data_fine___not___in) {
            this.data_fine___not___in = data_fine___not___in;
            return this;
        }

        public Builder setData_fine___lt(String data_fine___lt) {
            this.data_fine___lt = data_fine___lt;
            return this;
        }

        public Builder setData_fine___lte(String data_fine___lte) {
            this.data_fine___lte = data_fine___lte;
            return this;
        }

        public Builder setData_fine___gt(String data_fine___gt) {
            this.data_fine___gt = data_fine___gt;
            return this;
        }

        public Builder setData_fine___gte(String data_fine___gte) {
            this.data_fine___gte = data_fine___gte;
            return this;
        }

        public Builder setDose_gray_totale___eq(String dose_gray_totale___eq) {
            this.dose_gray_totale___eq = dose_gray_totale___eq;
            return this;
        }

        public Builder setDose_gray_totale___ne(String dose_gray_totale___ne) {
            this.dose_gray_totale___ne = dose_gray_totale___ne;
            return this;
        }

        public Builder setDose_gray_totale___null(Boolean dose_gray_totale___null) {
            this.dose_gray_totale___null = dose_gray_totale___null;
            return this;
        }

        public Builder setDose_gray_totale___not___null(Boolean dose_gray_totale___not___null) {
            this.dose_gray_totale___not___null = dose_gray_totale___not___null;
            return this;
        }

        public Builder setDose_gray_totale___in(java.util.List<String> dose_gray_totale___in) {
            this.dose_gray_totale___in = dose_gray_totale___in;
            return this;
        }

        public Builder setDose_gray_totale___not___in(java.util.List<String> dose_gray_totale___not___in) {
            this.dose_gray_totale___not___in = dose_gray_totale___not___in;
            return this;
        }

        public Builder setDose_gray_totale___lt(String dose_gray_totale___lt) {
            this.dose_gray_totale___lt = dose_gray_totale___lt;
            return this;
        }

        public Builder setDose_gray_totale___lte(String dose_gray_totale___lte) {
            this.dose_gray_totale___lte = dose_gray_totale___lte;
            return this;
        }

        public Builder setDose_gray_totale___gt(String dose_gray_totale___gt) {
            this.dose_gray_totale___gt = dose_gray_totale___gt;
            return this;
        }

        public Builder setDose_gray_totale___gte(String dose_gray_totale___gte) {
            this.dose_gray_totale___gte = dose_gray_totale___gte;
            return this;
        }

        public Builder setFarmaci_antitumorali___eq(String farmaci_antitumorali___eq) {
            this.farmaci_antitumorali___eq = farmaci_antitumorali___eq;
            return this;
        }

        public Builder setFarmaci_antitumorali___ne(String farmaci_antitumorali___ne) {
            this.farmaci_antitumorali___ne = farmaci_antitumorali___ne;
            return this;
        }

        public Builder setFarmaci_antitumorali___null(Boolean farmaci_antitumorali___null) {
            this.farmaci_antitumorali___null = farmaci_antitumorali___null;
            return this;
        }

        public Builder setFarmaci_antitumorali___not___null(Boolean farmaci_antitumorali___not___null) {
            this.farmaci_antitumorali___not___null = farmaci_antitumorali___not___null;
            return this;
        }

        public Builder setFarmaci_antitumorali___in(java.util.List<String> farmaci_antitumorali___in) {
            this.farmaci_antitumorali___in = farmaci_antitumorali___in;
            return this;
        }

        public Builder setFarmaci_antitumorali___not___in(java.util.List<String> farmaci_antitumorali___not___in) {
            this.farmaci_antitumorali___not___in = farmaci_antitumorali___not___in;
            return this;
        }

        public Builder setFarmaci_antitumorali___lt(String farmaci_antitumorali___lt) {
            this.farmaci_antitumorali___lt = farmaci_antitumorali___lt;
            return this;
        }

        public Builder setFarmaci_antitumorali___lte(String farmaci_antitumorali___lte) {
            this.farmaci_antitumorali___lte = farmaci_antitumorali___lte;
            return this;
        }

        public Builder setFarmaci_antitumorali___gt(String farmaci_antitumorali___gt) {
            this.farmaci_antitumorali___gt = farmaci_antitumorali___gt;
            return this;
        }

        public Builder setFarmaci_antitumorali___gte(String farmaci_antitumorali___gte) {
            this.farmaci_antitumorali___gte = farmaci_antitumorali___gte;
            return this;
        }

        public Builder setFarmaci_antitumorali___contains(String farmaci_antitumorali___contains) {
            this.farmaci_antitumorali___contains = farmaci_antitumorali___contains;
            return this;
        }

        public Builder setFarmaci_antitumorali___not___contains(String farmaci_antitumorali___not___contains) {
            this.farmaci_antitumorali___not___contains = farmaci_antitumorali___not___contains;
            return this;
        }

        public Builder setFarmaci_antitumorali___starts_with(String farmaci_antitumorali___starts_with) {
            this.farmaci_antitumorali___starts_with = farmaci_antitumorali___starts_with;
            return this;
        }

        public Builder setFarmaci_antitumorali___not___starts_with(String farmaci_antitumorali___not___starts_with) {
            this.farmaci_antitumorali___not___starts_with = farmaci_antitumorali___not___starts_with;
            return this;
        }

        public Builder setFarmaci_antitumorali___ends_with(String farmaci_antitumorali___ends_with) {
            this.farmaci_antitumorali___ends_with = farmaci_antitumorali___ends_with;
            return this;
        }

        public Builder setFarmaci_antitumorali___not___ends_with(String farmaci_antitumorali___not___ends_with) {
            this.farmaci_antitumorali___not___ends_with = farmaci_antitumorali___not___ends_with;
            return this;
        }

        public Builder setFiltra_farmaci___eq(String filtra_farmaci___eq) {
            this.filtra_farmaci___eq = filtra_farmaci___eq;
            return this;
        }

        public Builder setFiltra_farmaci___ne(String filtra_farmaci___ne) {
            this.filtra_farmaci___ne = filtra_farmaci___ne;
            return this;
        }

        public Builder setFiltra_farmaci___null(Boolean filtra_farmaci___null) {
            this.filtra_farmaci___null = filtra_farmaci___null;
            return this;
        }

        public Builder setFiltra_farmaci___not___null(Boolean filtra_farmaci___not___null) {
            this.filtra_farmaci___not___null = filtra_farmaci___not___null;
            return this;
        }

        public Builder setFiltra_farmaci___in(java.util.List<String> filtra_farmaci___in) {
            this.filtra_farmaci___in = filtra_farmaci___in;
            return this;
        }

        public Builder setFiltra_farmaci___not___in(java.util.List<String> filtra_farmaci___not___in) {
            this.filtra_farmaci___not___in = filtra_farmaci___not___in;
            return this;
        }

        public Builder setFiltra_farmaci___lt(String filtra_farmaci___lt) {
            this.filtra_farmaci___lt = filtra_farmaci___lt;
            return this;
        }

        public Builder setFiltra_farmaci___lte(String filtra_farmaci___lte) {
            this.filtra_farmaci___lte = filtra_farmaci___lte;
            return this;
        }

        public Builder setFiltra_farmaci___gt(String filtra_farmaci___gt) {
            this.filtra_farmaci___gt = filtra_farmaci___gt;
            return this;
        }

        public Builder setFiltra_farmaci___gte(String filtra_farmaci___gte) {
            this.filtra_farmaci___gte = filtra_farmaci___gte;
            return this;
        }

        public Builder setFiltra_farmaci___contains(String filtra_farmaci___contains) {
            this.filtra_farmaci___contains = filtra_farmaci___contains;
            return this;
        }

        public Builder setFiltra_farmaci___not___contains(String filtra_farmaci___not___contains) {
            this.filtra_farmaci___not___contains = filtra_farmaci___not___contains;
            return this;
        }

        public Builder setFiltra_farmaci___starts_with(String filtra_farmaci___starts_with) {
            this.filtra_farmaci___starts_with = filtra_farmaci___starts_with;
            return this;
        }

        public Builder setFiltra_farmaci___not___starts_with(String filtra_farmaci___not___starts_with) {
            this.filtra_farmaci___not___starts_with = filtra_farmaci___not___starts_with;
            return this;
        }

        public Builder setFiltra_farmaci___ends_with(String filtra_farmaci___ends_with) {
            this.filtra_farmaci___ends_with = filtra_farmaci___ends_with;
            return this;
        }

        public Builder setFiltra_farmaci___not___ends_with(String filtra_farmaci___not___ends_with) {
            this.filtra_farmaci___not___ends_with = filtra_farmaci___not___ends_with;
            return this;
        }

        public Builder setImmunoterapia___eq(Boolean immunoterapia___eq) {
            this.immunoterapia___eq = immunoterapia___eq;
            return this;
        }

        public Builder setImmunoterapia___ne(Boolean immunoterapia___ne) {
            this.immunoterapia___ne = immunoterapia___ne;
            return this;
        }

        public Builder setImmunoterapia___null(Boolean immunoterapia___null) {
            this.immunoterapia___null = immunoterapia___null;
            return this;
        }

        public Builder setImmunoterapia___not___null(Boolean immunoterapia___not___null) {
            this.immunoterapia___not___null = immunoterapia___not___null;
            return this;
        }

        public Builder setInfezioni___eq(String infezioni___eq) {
            this.infezioni___eq = infezioni___eq;
            return this;
        }

        public Builder setInfezioni___ne(String infezioni___ne) {
            this.infezioni___ne = infezioni___ne;
            return this;
        }

        public Builder setInfezioni___null(Boolean infezioni___null) {
            this.infezioni___null = infezioni___null;
            return this;
        }

        public Builder setInfezioni___not___null(Boolean infezioni___not___null) {
            this.infezioni___not___null = infezioni___not___null;
            return this;
        }

        public Builder setInfezioni___in(java.util.List<String> infezioni___in) {
            this.infezioni___in = infezioni___in;
            return this;
        }

        public Builder setInfezioni___not___in(java.util.List<String> infezioni___not___in) {
            this.infezioni___not___in = infezioni___not___in;
            return this;
        }

        public Builder setInfezioni___lt(String infezioni___lt) {
            this.infezioni___lt = infezioni___lt;
            return this;
        }

        public Builder setInfezioni___lte(String infezioni___lte) {
            this.infezioni___lte = infezioni___lte;
            return this;
        }

        public Builder setInfezioni___gt(String infezioni___gt) {
            this.infezioni___gt = infezioni___gt;
            return this;
        }

        public Builder setInfezioni___gte(String infezioni___gte) {
            this.infezioni___gte = infezioni___gte;
            return this;
        }

        public Builder setInfezioni___contains(String infezioni___contains) {
            this.infezioni___contains = infezioni___contains;
            return this;
        }

        public Builder setInfezioni___not___contains(String infezioni___not___contains) {
            this.infezioni___not___contains = infezioni___not___contains;
            return this;
        }

        public Builder setInfezioni___starts_with(String infezioni___starts_with) {
            this.infezioni___starts_with = infezioni___starts_with;
            return this;
        }

        public Builder setInfezioni___not___starts_with(String infezioni___not___starts_with) {
            this.infezioni___not___starts_with = infezioni___not___starts_with;
            return this;
        }

        public Builder setInfezioni___ends_with(String infezioni___ends_with) {
            this.infezioni___ends_with = infezioni___ends_with;
            return this;
        }

        public Builder setInfezioni___not___ends_with(String infezioni___not___ends_with) {
            this.infezioni___not___ends_with = infezioni___not___ends_with;
            return this;
        }

        public Builder setLinea___eq(Integer linea___eq) {
            this.linea___eq = linea___eq;
            return this;
        }

        public Builder setLinea___ne(Integer linea___ne) {
            this.linea___ne = linea___ne;
            return this;
        }

        public Builder setLinea___null(Boolean linea___null) {
            this.linea___null = linea___null;
            return this;
        }

        public Builder setLinea___not___null(Boolean linea___not___null) {
            this.linea___not___null = linea___not___null;
            return this;
        }

        public Builder setLinea___in(java.util.List<Integer> linea___in) {
            this.linea___in = linea___in;
            return this;
        }

        public Builder setLinea___not___in(java.util.List<Integer> linea___not___in) {
            this.linea___not___in = linea___not___in;
            return this;
        }

        public Builder setLinea___lt(Integer linea___lt) {
            this.linea___lt = linea___lt;
            return this;
        }

        public Builder setLinea___lte(Integer linea___lte) {
            this.linea___lte = linea___lte;
            return this;
        }

        public Builder setLinea___gt(Integer linea___gt) {
            this.linea___gt = linea___gt;
            return this;
        }

        public Builder setLinea___gte(Integer linea___gte) {
            this.linea___gte = linea___gte;
            return this;
        }

        public Builder setOrmonale___eq(Boolean ormonale___eq) {
            this.ormonale___eq = ormonale___eq;
            return this;
        }

        public Builder setOrmonale___ne(Boolean ormonale___ne) {
            this.ormonale___ne = ormonale___ne;
            return this;
        }

        public Builder setOrmonale___null(Boolean ormonale___null) {
            this.ormonale___null = ormonale___null;
            return this;
        }

        public Builder setOrmonale___not___null(Boolean ormonale___not___null) {
            this.ormonale___not___null = ormonale___not___null;
            return this;
        }

        public Builder setRadioterapia___eq(Boolean radioterapia___eq) {
            this.radioterapia___eq = radioterapia___eq;
            return this;
        }

        public Builder setRadioterapia___ne(Boolean radioterapia___ne) {
            this.radioterapia___ne = radioterapia___ne;
            return this;
        }

        public Builder setRadioterapia___null(Boolean radioterapia___null) {
            this.radioterapia___null = radioterapia___null;
            return this;
        }

        public Builder setRadioterapia___not___null(Boolean radioterapia___not___null) {
            this.radioterapia___not___null = radioterapia___not___null;
            return this;
        }

        public Builder setRisposta_trattamento___eq(Boolean risposta_trattamento___eq) {
            this.risposta_trattamento___eq = risposta_trattamento___eq;
            return this;
        }

        public Builder setRisposta_trattamento___ne(Boolean risposta_trattamento___ne) {
            this.risposta_trattamento___ne = risposta_trattamento___ne;
            return this;
        }

        public Builder setRisposta_trattamento___null(Boolean risposta_trattamento___null) {
            this.risposta_trattamento___null = risposta_trattamento___null;
            return this;
        }

        public Builder setRisposta_trattamento___not___null(Boolean risposta_trattamento___not___null) {
            this.risposta_trattamento___not___null = risposta_trattamento___not___null;
            return this;
        }

        public Builder setSepsi_severa___eq(Boolean sepsi_severa___eq) {
            this.sepsi_severa___eq = sepsi_severa___eq;
            return this;
        }

        public Builder setSepsi_severa___ne(Boolean sepsi_severa___ne) {
            this.sepsi_severa___ne = sepsi_severa___ne;
            return this;
        }

        public Builder setSepsi_severa___null(Boolean sepsi_severa___null) {
            this.sepsi_severa___null = sepsi_severa___null;
            return this;
        }

        public Builder setSepsi_severa___not___null(Boolean sepsi_severa___not___null) {
            this.sepsi_severa___not___null = sepsi_severa___not___null;
            return this;
        }

        public Builder setStaminali___eq(Boolean staminali___eq) {
            this.staminali___eq = staminali___eq;
            return this;
        }

        public Builder setStaminali___ne(Boolean staminali___ne) {
            this.staminali___ne = staminali___ne;
            return this;
        }

        public Builder setStaminali___null(Boolean staminali___null) {
            this.staminali___null = staminali___null;
            return this;
        }

        public Builder setStaminali___not___null(Boolean staminali___not___null) {
            this.staminali___not___null = staminali___not___null;
            return this;
        }

        public Builder setTipo_trattamento___eq(String tipo_trattamento___eq) {
            this.tipo_trattamento___eq = tipo_trattamento___eq;
            return this;
        }

        public Builder setTipo_trattamento___ne(String tipo_trattamento___ne) {
            this.tipo_trattamento___ne = tipo_trattamento___ne;
            return this;
        }

        public Builder setTipo_trattamento___null(Boolean tipo_trattamento___null) {
            this.tipo_trattamento___null = tipo_trattamento___null;
            return this;
        }

        public Builder setTipo_trattamento___not___null(Boolean tipo_trattamento___not___null) {
            this.tipo_trattamento___not___null = tipo_trattamento___not___null;
            return this;
        }

        public Builder setTipo_trattamento___in(java.util.List<String> tipo_trattamento___in) {
            this.tipo_trattamento___in = tipo_trattamento___in;
            return this;
        }

        public Builder setTipo_trattamento___not___in(java.util.List<String> tipo_trattamento___not___in) {
            this.tipo_trattamento___not___in = tipo_trattamento___not___in;
            return this;
        }

        public Builder setTipo_trattamento___lt(String tipo_trattamento___lt) {
            this.tipo_trattamento___lt = tipo_trattamento___lt;
            return this;
        }

        public Builder setTipo_trattamento___lte(String tipo_trattamento___lte) {
            this.tipo_trattamento___lte = tipo_trattamento___lte;
            return this;
        }

        public Builder setTipo_trattamento___gt(String tipo_trattamento___gt) {
            this.tipo_trattamento___gt = tipo_trattamento___gt;
            return this;
        }

        public Builder setTipo_trattamento___gte(String tipo_trattamento___gte) {
            this.tipo_trattamento___gte = tipo_trattamento___gte;
            return this;
        }

        public Builder setTipo_trattamento___contains(String tipo_trattamento___contains) {
            this.tipo_trattamento___contains = tipo_trattamento___contains;
            return this;
        }

        public Builder setTipo_trattamento___not___contains(String tipo_trattamento___not___contains) {
            this.tipo_trattamento___not___contains = tipo_trattamento___not___contains;
            return this;
        }

        public Builder setTipo_trattamento___starts_with(String tipo_trattamento___starts_with) {
            this.tipo_trattamento___starts_with = tipo_trattamento___starts_with;
            return this;
        }

        public Builder setTipo_trattamento___not___starts_with(String tipo_trattamento___not___starts_with) {
            this.tipo_trattamento___not___starts_with = tipo_trattamento___not___starts_with;
            return this;
        }

        public Builder setTipo_trattamento___ends_with(String tipo_trattamento___ends_with) {
            this.tipo_trattamento___ends_with = tipo_trattamento___ends_with;
            return this;
        }

        public Builder setTipo_trattamento___not___ends_with(String tipo_trattamento___not___ends_with) {
            this.tipo_trattamento___not___ends_with = tipo_trattamento___not___ends_with;
            return this;
        }

        public Builder setTossicita_GI___eq(Boolean tossicita_GI___eq) {
            this.tossicita_GI___eq = tossicita_GI___eq;
            return this;
        }

        public Builder setTossicita_GI___ne(Boolean tossicita_GI___ne) {
            this.tossicita_GI___ne = tossicita_GI___ne;
            return this;
        }

        public Builder setTossicita_GI___null(Boolean tossicita_GI___null) {
            this.tossicita_GI___null = tossicita_GI___null;
            return this;
        }

        public Builder setTossicita_GI___not___null(Boolean tossicita_GI___not___null) {
            this.tossicita_GI___not___null = tossicita_GI___not___null;
            return this;
        }

        public Builder setTossicita_SNC___eq(Boolean tossicita_SNC___eq) {
            this.tossicita_SNC___eq = tossicita_SNC___eq;
            return this;
        }

        public Builder setTossicita_SNC___ne(Boolean tossicita_SNC___ne) {
            this.tossicita_SNC___ne = tossicita_SNC___ne;
            return this;
        }

        public Builder setTossicita_SNC___null(Boolean tossicita_SNC___null) {
            this.tossicita_SNC___null = tossicita_SNC___null;
            return this;
        }

        public Builder setTossicita_SNC___not___null(Boolean tossicita_SNC___not___null) {
            this.tossicita_SNC___not___null = tossicita_SNC___not___null;
            return this;
        }

        public Builder setTossicita_anemia___eq(Boolean tossicita_anemia___eq) {
            this.tossicita_anemia___eq = tossicita_anemia___eq;
            return this;
        }

        public Builder setTossicita_anemia___ne(Boolean tossicita_anemia___ne) {
            this.tossicita_anemia___ne = tossicita_anemia___ne;
            return this;
        }

        public Builder setTossicita_anemia___null(Boolean tossicita_anemia___null) {
            this.tossicita_anemia___null = tossicita_anemia___null;
            return this;
        }

        public Builder setTossicita_anemia___not___null(Boolean tossicita_anemia___not___null) {
            this.tossicita_anemia___not___null = tossicita_anemia___not___null;
            return this;
        }

        public Builder setTossicita_cardiaca___eq(Boolean tossicita_cardiaca___eq) {
            this.tossicita_cardiaca___eq = tossicita_cardiaca___eq;
            return this;
        }

        public Builder setTossicita_cardiaca___ne(Boolean tossicita_cardiaca___ne) {
            this.tossicita_cardiaca___ne = tossicita_cardiaca___ne;
            return this;
        }

        public Builder setTossicita_cardiaca___null(Boolean tossicita_cardiaca___null) {
            this.tossicita_cardiaca___null = tossicita_cardiaca___null;
            return this;
        }

        public Builder setTossicita_cardiaca___not___null(Boolean tossicita_cardiaca___not___null) {
            this.tossicita_cardiaca___not___null = tossicita_cardiaca___not___null;
            return this;
        }

        public Builder setTossicita_epatica___eq(Boolean tossicita_epatica___eq) {
            this.tossicita_epatica___eq = tossicita_epatica___eq;
            return this;
        }

        public Builder setTossicita_epatica___ne(Boolean tossicita_epatica___ne) {
            this.tossicita_epatica___ne = tossicita_epatica___ne;
            return this;
        }

        public Builder setTossicita_epatica___null(Boolean tossicita_epatica___null) {
            this.tossicita_epatica___null = tossicita_epatica___null;
            return this;
        }

        public Builder setTossicita_epatica___not___null(Boolean tossicita_epatica___not___null) {
            this.tossicita_epatica___not___null = tossicita_epatica___not___null;
            return this;
        }

        public Builder setTossicita_neutropenia___eq(Boolean tossicita_neutropenia___eq) {
            this.tossicita_neutropenia___eq = tossicita_neutropenia___eq;
            return this;
        }

        public Builder setTossicita_neutropenia___ne(Boolean tossicita_neutropenia___ne) {
            this.tossicita_neutropenia___ne = tossicita_neutropenia___ne;
            return this;
        }

        public Builder setTossicita_neutropenia___null(Boolean tossicita_neutropenia___null) {
            this.tossicita_neutropenia___null = tossicita_neutropenia___null;
            return this;
        }

        public Builder setTossicita_neutropenia___not___null(Boolean tossicita_neutropenia___not___null) {
            this.tossicita_neutropenia___not___null = tossicita_neutropenia___not___null;
            return this;
        }

        public Builder setTossicita_piastrinopenia___eq(Boolean tossicita_piastrinopenia___eq) {
            this.tossicita_piastrinopenia___eq = tossicita_piastrinopenia___eq;
            return this;
        }

        public Builder setTossicita_piastrinopenia___ne(Boolean tossicita_piastrinopenia___ne) {
            this.tossicita_piastrinopenia___ne = tossicita_piastrinopenia___ne;
            return this;
        }

        public Builder setTossicita_piastrinopenia___null(Boolean tossicita_piastrinopenia___null) {
            this.tossicita_piastrinopenia___null = tossicita_piastrinopenia___null;
            return this;
        }

        public Builder setTossicita_piastrinopenia___not___null(Boolean tossicita_piastrinopenia___not___null) {
            this.tossicita_piastrinopenia___not___null = tossicita_piastrinopenia___not___null;
            return this;
        }

        public Builder setAND(java.util.List<CliTrattamento_antitumoraleFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliTrattamento_antitumoraleFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliTrattamento_antitumoraleFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliTrattamento_antitumoraleFilterDTO build() {
            CliTrattamento_antitumoraleFilterDTO result = new CliTrattamento_antitumoraleFilterDTO();
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
            result.setAltro___eq(this.altro___eq);
            result.setAltro___ne(this.altro___ne);
            result.setAltro___null(this.altro___null);
            result.setAltro___not___null(this.altro___not___null);
            result.setAltro___in(this.altro___in);
            result.setAltro___not___in(this.altro___not___in);
            result.setAltro___lt(this.altro___lt);
            result.setAltro___lte(this.altro___lte);
            result.setAltro___gt(this.altro___gt);
            result.setAltro___gte(this.altro___gte);
            result.setAltro___contains(this.altro___contains);
            result.setAltro___not___contains(this.altro___not___contains);
            result.setAltro___starts_with(this.altro___starts_with);
            result.setAltro___not___starts_with(this.altro___not___starts_with);
            result.setAltro___ends_with(this.altro___ends_with);
            result.setAltro___not___ends_with(this.altro___not___ends_with);
            result.setCellulare___eq(this.cellulare___eq);
            result.setCellulare___ne(this.cellulare___ne);
            result.setCellulare___null(this.cellulare___null);
            result.setCellulare___not___null(this.cellulare___not___null);
            result.setChemioterapia___eq(this.chemioterapia___eq);
            result.setChemioterapia___ne(this.chemioterapia___ne);
            result.setChemioterapia___null(this.chemioterapia___null);
            result.setChemioterapia___not___null(this.chemioterapia___not___null);
            result.setChirurgico___eq(this.chirurgico___eq);
            result.setChirurgico___ne(this.chirurgico___ne);
            result.setChirurgico___null(this.chirurgico___null);
            result.setChirurgico___not___null(this.chirurgico___not___null);
            result.setCicli_effettuati___eq(this.cicli_effettuati___eq);
            result.setCicli_effettuati___ne(this.cicli_effettuati___ne);
            result.setCicli_effettuati___null(this.cicli_effettuati___null);
            result.setCicli_effettuati___not___null(this.cicli_effettuati___not___null);
            result.setCicli_effettuati___in(this.cicli_effettuati___in);
            result.setCicli_effettuati___not___in(this.cicli_effettuati___not___in);
            result.setCicli_effettuati___lt(this.cicli_effettuati___lt);
            result.setCicli_effettuati___lte(this.cicli_effettuati___lte);
            result.setCicli_effettuati___gt(this.cicli_effettuati___gt);
            result.setCicli_effettuati___gte(this.cicli_effettuati___gte);
            result.setCicli_previsti___eq(this.cicli_previsti___eq);
            result.setCicli_previsti___ne(this.cicli_previsti___ne);
            result.setCicli_previsti___null(this.cicli_previsti___null);
            result.setCicli_previsti___not___null(this.cicli_previsti___not___null);
            result.setCicli_previsti___in(this.cicli_previsti___in);
            result.setCicli_previsti___not___in(this.cicli_previsti___not___in);
            result.setCicli_previsti___lt(this.cicli_previsti___lt);
            result.setCicli_previsti___lte(this.cicli_previsti___lte);
            result.setCicli_previsti___gt(this.cicli_previsti___gt);
            result.setCicli_previsti___gte(this.cicli_previsti___gte);
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
            result.setData_fine___eq(this.data_fine___eq);
            result.setData_fine___ne(this.data_fine___ne);
            result.setData_fine___null(this.data_fine___null);
            result.setData_fine___not___null(this.data_fine___not___null);
            result.setData_fine___in(this.data_fine___in);
            result.setData_fine___not___in(this.data_fine___not___in);
            result.setData_fine___lt(this.data_fine___lt);
            result.setData_fine___lte(this.data_fine___lte);
            result.setData_fine___gt(this.data_fine___gt);
            result.setData_fine___gte(this.data_fine___gte);
            result.setDose_gray_totale___eq(this.dose_gray_totale___eq);
            result.setDose_gray_totale___ne(this.dose_gray_totale___ne);
            result.setDose_gray_totale___null(this.dose_gray_totale___null);
            result.setDose_gray_totale___not___null(this.dose_gray_totale___not___null);
            result.setDose_gray_totale___in(this.dose_gray_totale___in);
            result.setDose_gray_totale___not___in(this.dose_gray_totale___not___in);
            result.setDose_gray_totale___lt(this.dose_gray_totale___lt);
            result.setDose_gray_totale___lte(this.dose_gray_totale___lte);
            result.setDose_gray_totale___gt(this.dose_gray_totale___gt);
            result.setDose_gray_totale___gte(this.dose_gray_totale___gte);
            result.setFarmaci_antitumorali___eq(this.farmaci_antitumorali___eq);
            result.setFarmaci_antitumorali___ne(this.farmaci_antitumorali___ne);
            result.setFarmaci_antitumorali___null(this.farmaci_antitumorali___null);
            result.setFarmaci_antitumorali___not___null(this.farmaci_antitumorali___not___null);
            result.setFarmaci_antitumorali___in(this.farmaci_antitumorali___in);
            result.setFarmaci_antitumorali___not___in(this.farmaci_antitumorali___not___in);
            result.setFarmaci_antitumorali___lt(this.farmaci_antitumorali___lt);
            result.setFarmaci_antitumorali___lte(this.farmaci_antitumorali___lte);
            result.setFarmaci_antitumorali___gt(this.farmaci_antitumorali___gt);
            result.setFarmaci_antitumorali___gte(this.farmaci_antitumorali___gte);
            result.setFarmaci_antitumorali___contains(this.farmaci_antitumorali___contains);
            result.setFarmaci_antitumorali___not___contains(this.farmaci_antitumorali___not___contains);
            result.setFarmaci_antitumorali___starts_with(this.farmaci_antitumorali___starts_with);
            result.setFarmaci_antitumorali___not___starts_with(this.farmaci_antitumorali___not___starts_with);
            result.setFarmaci_antitumorali___ends_with(this.farmaci_antitumorali___ends_with);
            result.setFarmaci_antitumorali___not___ends_with(this.farmaci_antitumorali___not___ends_with);
            result.setFiltra_farmaci___eq(this.filtra_farmaci___eq);
            result.setFiltra_farmaci___ne(this.filtra_farmaci___ne);
            result.setFiltra_farmaci___null(this.filtra_farmaci___null);
            result.setFiltra_farmaci___not___null(this.filtra_farmaci___not___null);
            result.setFiltra_farmaci___in(this.filtra_farmaci___in);
            result.setFiltra_farmaci___not___in(this.filtra_farmaci___not___in);
            result.setFiltra_farmaci___lt(this.filtra_farmaci___lt);
            result.setFiltra_farmaci___lte(this.filtra_farmaci___lte);
            result.setFiltra_farmaci___gt(this.filtra_farmaci___gt);
            result.setFiltra_farmaci___gte(this.filtra_farmaci___gte);
            result.setFiltra_farmaci___contains(this.filtra_farmaci___contains);
            result.setFiltra_farmaci___not___contains(this.filtra_farmaci___not___contains);
            result.setFiltra_farmaci___starts_with(this.filtra_farmaci___starts_with);
            result.setFiltra_farmaci___not___starts_with(this.filtra_farmaci___not___starts_with);
            result.setFiltra_farmaci___ends_with(this.filtra_farmaci___ends_with);
            result.setFiltra_farmaci___not___ends_with(this.filtra_farmaci___not___ends_with);
            result.setImmunoterapia___eq(this.immunoterapia___eq);
            result.setImmunoterapia___ne(this.immunoterapia___ne);
            result.setImmunoterapia___null(this.immunoterapia___null);
            result.setImmunoterapia___not___null(this.immunoterapia___not___null);
            result.setInfezioni___eq(this.infezioni___eq);
            result.setInfezioni___ne(this.infezioni___ne);
            result.setInfezioni___null(this.infezioni___null);
            result.setInfezioni___not___null(this.infezioni___not___null);
            result.setInfezioni___in(this.infezioni___in);
            result.setInfezioni___not___in(this.infezioni___not___in);
            result.setInfezioni___lt(this.infezioni___lt);
            result.setInfezioni___lte(this.infezioni___lte);
            result.setInfezioni___gt(this.infezioni___gt);
            result.setInfezioni___gte(this.infezioni___gte);
            result.setInfezioni___contains(this.infezioni___contains);
            result.setInfezioni___not___contains(this.infezioni___not___contains);
            result.setInfezioni___starts_with(this.infezioni___starts_with);
            result.setInfezioni___not___starts_with(this.infezioni___not___starts_with);
            result.setInfezioni___ends_with(this.infezioni___ends_with);
            result.setInfezioni___not___ends_with(this.infezioni___not___ends_with);
            result.setLinea___eq(this.linea___eq);
            result.setLinea___ne(this.linea___ne);
            result.setLinea___null(this.linea___null);
            result.setLinea___not___null(this.linea___not___null);
            result.setLinea___in(this.linea___in);
            result.setLinea___not___in(this.linea___not___in);
            result.setLinea___lt(this.linea___lt);
            result.setLinea___lte(this.linea___lte);
            result.setLinea___gt(this.linea___gt);
            result.setLinea___gte(this.linea___gte);
            result.setOrmonale___eq(this.ormonale___eq);
            result.setOrmonale___ne(this.ormonale___ne);
            result.setOrmonale___null(this.ormonale___null);
            result.setOrmonale___not___null(this.ormonale___not___null);
            result.setRadioterapia___eq(this.radioterapia___eq);
            result.setRadioterapia___ne(this.radioterapia___ne);
            result.setRadioterapia___null(this.radioterapia___null);
            result.setRadioterapia___not___null(this.radioterapia___not___null);
            result.setRisposta_trattamento___eq(this.risposta_trattamento___eq);
            result.setRisposta_trattamento___ne(this.risposta_trattamento___ne);
            result.setRisposta_trattamento___null(this.risposta_trattamento___null);
            result.setRisposta_trattamento___not___null(this.risposta_trattamento___not___null);
            result.setSepsi_severa___eq(this.sepsi_severa___eq);
            result.setSepsi_severa___ne(this.sepsi_severa___ne);
            result.setSepsi_severa___null(this.sepsi_severa___null);
            result.setSepsi_severa___not___null(this.sepsi_severa___not___null);
            result.setStaminali___eq(this.staminali___eq);
            result.setStaminali___ne(this.staminali___ne);
            result.setStaminali___null(this.staminali___null);
            result.setStaminali___not___null(this.staminali___not___null);
            result.setTipo_trattamento___eq(this.tipo_trattamento___eq);
            result.setTipo_trattamento___ne(this.tipo_trattamento___ne);
            result.setTipo_trattamento___null(this.tipo_trattamento___null);
            result.setTipo_trattamento___not___null(this.tipo_trattamento___not___null);
            result.setTipo_trattamento___in(this.tipo_trattamento___in);
            result.setTipo_trattamento___not___in(this.tipo_trattamento___not___in);
            result.setTipo_trattamento___lt(this.tipo_trattamento___lt);
            result.setTipo_trattamento___lte(this.tipo_trattamento___lte);
            result.setTipo_trattamento___gt(this.tipo_trattamento___gt);
            result.setTipo_trattamento___gte(this.tipo_trattamento___gte);
            result.setTipo_trattamento___contains(this.tipo_trattamento___contains);
            result.setTipo_trattamento___not___contains(this.tipo_trattamento___not___contains);
            result.setTipo_trattamento___starts_with(this.tipo_trattamento___starts_with);
            result.setTipo_trattamento___not___starts_with(this.tipo_trattamento___not___starts_with);
            result.setTipo_trattamento___ends_with(this.tipo_trattamento___ends_with);
            result.setTipo_trattamento___not___ends_with(this.tipo_trattamento___not___ends_with);
            result.setTossicita_GI___eq(this.tossicita_GI___eq);
            result.setTossicita_GI___ne(this.tossicita_GI___ne);
            result.setTossicita_GI___null(this.tossicita_GI___null);
            result.setTossicita_GI___not___null(this.tossicita_GI___not___null);
            result.setTossicita_SNC___eq(this.tossicita_SNC___eq);
            result.setTossicita_SNC___ne(this.tossicita_SNC___ne);
            result.setTossicita_SNC___null(this.tossicita_SNC___null);
            result.setTossicita_SNC___not___null(this.tossicita_SNC___not___null);
            result.setTossicita_anemia___eq(this.tossicita_anemia___eq);
            result.setTossicita_anemia___ne(this.tossicita_anemia___ne);
            result.setTossicita_anemia___null(this.tossicita_anemia___null);
            result.setTossicita_anemia___not___null(this.tossicita_anemia___not___null);
            result.setTossicita_cardiaca___eq(this.tossicita_cardiaca___eq);
            result.setTossicita_cardiaca___ne(this.tossicita_cardiaca___ne);
            result.setTossicita_cardiaca___null(this.tossicita_cardiaca___null);
            result.setTossicita_cardiaca___not___null(this.tossicita_cardiaca___not___null);
            result.setTossicita_epatica___eq(this.tossicita_epatica___eq);
            result.setTossicita_epatica___ne(this.tossicita_epatica___ne);
            result.setTossicita_epatica___null(this.tossicita_epatica___null);
            result.setTossicita_epatica___not___null(this.tossicita_epatica___not___null);
            result.setTossicita_neutropenia___eq(this.tossicita_neutropenia___eq);
            result.setTossicita_neutropenia___ne(this.tossicita_neutropenia___ne);
            result.setTossicita_neutropenia___null(this.tossicita_neutropenia___null);
            result.setTossicita_neutropenia___not___null(this.tossicita_neutropenia___not___null);
            result.setTossicita_piastrinopenia___eq(this.tossicita_piastrinopenia___eq);
            result.setTossicita_piastrinopenia___ne(this.tossicita_piastrinopenia___ne);
            result.setTossicita_piastrinopenia___null(this.tossicita_piastrinopenia___null);
            result.setTossicita_piastrinopenia___not___null(this.tossicita_piastrinopenia___not___null);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
