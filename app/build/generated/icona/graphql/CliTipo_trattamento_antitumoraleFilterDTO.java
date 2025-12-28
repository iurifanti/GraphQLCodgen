package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Tipo_trattamento_antitumorale.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTipo_trattamento_antitumoraleFilterDTO implements java.io.Serializable {

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
    private String farmaco_antitumorali_associati___eq;
    private String farmaco_antitumorali_associati___ne;
    private Boolean farmaco_antitumorali_associati___null;
    private Boolean farmaco_antitumorali_associati___not___null;
    private java.util.List<String> farmaco_antitumorali_associati___in;
    private java.util.List<String> farmaco_antitumorali_associati___not___in;
    private String farmaco_antitumorali_associati___lt;
    private String farmaco_antitumorali_associati___lte;
    private String farmaco_antitumorali_associati___gt;
    private String farmaco_antitumorali_associati___gte;
    private String farmaco_antitumorali_associati___contains;
    private String farmaco_antitumorali_associati___not___contains;
    private String farmaco_antitumorali_associati___starts_with;
    private String farmaco_antitumorali_associati___not___starts_with;
    private String farmaco_antitumorali_associati___ends_with;
    private String farmaco_antitumorali_associati___not___ends_with;
    private Boolean immunoterapia___eq;
    private Boolean immunoterapia___ne;
    private Boolean immunoterapia___null;
    private Boolean immunoterapia___not___null;
    private Integer n_farmaci_antitumorali_associati___eq;
    private Integer n_farmaci_antitumorali_associati___ne;
    private Boolean n_farmaci_antitumorali_associati___null;
    private Boolean n_farmaci_antitumorali_associati___not___null;
    private java.util.List<Integer> n_farmaci_antitumorali_associati___in;
    private java.util.List<Integer> n_farmaci_antitumorali_associati___not___in;
    private Integer n_farmaci_antitumorali_associati___lt;
    private Integer n_farmaci_antitumorali_associati___lte;
    private Integer n_farmaci_antitumorali_associati___gt;
    private Integer n_farmaci_antitumorali_associati___gte;
    private String nome___eq;
    private String nome___ne;
    private Boolean nome___null;
    private Boolean nome___not___null;
    private java.util.List<String> nome___in;
    private java.util.List<String> nome___not___in;
    private String nome___lt;
    private String nome___lte;
    private String nome___gt;
    private String nome___gte;
    private String nome___contains;
    private String nome___not___contains;
    private String nome___starts_with;
    private String nome___not___starts_with;
    private String nome___ends_with;
    private String nome___not___ends_with;
    private Boolean ormonale___eq;
    private Boolean ormonale___ne;
    private Boolean ormonale___null;
    private Boolean ormonale___not___null;
    private Boolean radioterapia___eq;
    private Boolean radioterapia___ne;
    private Boolean radioterapia___null;
    private Boolean radioterapia___not___null;
    private Boolean staminali___eq;
    private Boolean staminali___ne;
    private Boolean staminali___null;
    private Boolean staminali___not___null;
    private java.util.List<CliTipo_trattamento_antitumoraleFilterDTO> AND;
    private java.util.List<CliTipo_trattamento_antitumoraleFilterDTO> OR;
    private CliTipo_trattamento_antitumoraleFilterDTO NOT;

    public CliTipo_trattamento_antitumoraleFilterDTO() {
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

    public String getFarmaco_antitumorali_associati___eq() {
        return farmaco_antitumorali_associati___eq;
    }
    public void setFarmaco_antitumorali_associati___eq(String farmaco_antitumorali_associati___eq) {
        this.farmaco_antitumorali_associati___eq = farmaco_antitumorali_associati___eq;
    }

    public String getFarmaco_antitumorali_associati___ne() {
        return farmaco_antitumorali_associati___ne;
    }
    public void setFarmaco_antitumorali_associati___ne(String farmaco_antitumorali_associati___ne) {
        this.farmaco_antitumorali_associati___ne = farmaco_antitumorali_associati___ne;
    }

    public Boolean getFarmaco_antitumorali_associati___null() {
        return farmaco_antitumorali_associati___null;
    }
    public void setFarmaco_antitumorali_associati___null(Boolean farmaco_antitumorali_associati___null) {
        this.farmaco_antitumorali_associati___null = farmaco_antitumorali_associati___null;
    }

    public Boolean getFarmaco_antitumorali_associati___not___null() {
        return farmaco_antitumorali_associati___not___null;
    }
    public void setFarmaco_antitumorali_associati___not___null(Boolean farmaco_antitumorali_associati___not___null) {
        this.farmaco_antitumorali_associati___not___null = farmaco_antitumorali_associati___not___null;
    }

    public java.util.List<String> getFarmaco_antitumorali_associati___in() {
        return farmaco_antitumorali_associati___in;
    }
    public void setFarmaco_antitumorali_associati___in(java.util.List<String> farmaco_antitumorali_associati___in) {
        this.farmaco_antitumorali_associati___in = farmaco_antitumorali_associati___in;
    }

    public java.util.List<String> getFarmaco_antitumorali_associati___not___in() {
        return farmaco_antitumorali_associati___not___in;
    }
    public void setFarmaco_antitumorali_associati___not___in(java.util.List<String> farmaco_antitumorali_associati___not___in) {
        this.farmaco_antitumorali_associati___not___in = farmaco_antitumorali_associati___not___in;
    }

    public String getFarmaco_antitumorali_associati___lt() {
        return farmaco_antitumorali_associati___lt;
    }
    public void setFarmaco_antitumorali_associati___lt(String farmaco_antitumorali_associati___lt) {
        this.farmaco_antitumorali_associati___lt = farmaco_antitumorali_associati___lt;
    }

    public String getFarmaco_antitumorali_associati___lte() {
        return farmaco_antitumorali_associati___lte;
    }
    public void setFarmaco_antitumorali_associati___lte(String farmaco_antitumorali_associati___lte) {
        this.farmaco_antitumorali_associati___lte = farmaco_antitumorali_associati___lte;
    }

    public String getFarmaco_antitumorali_associati___gt() {
        return farmaco_antitumorali_associati___gt;
    }
    public void setFarmaco_antitumorali_associati___gt(String farmaco_antitumorali_associati___gt) {
        this.farmaco_antitumorali_associati___gt = farmaco_antitumorali_associati___gt;
    }

    public String getFarmaco_antitumorali_associati___gte() {
        return farmaco_antitumorali_associati___gte;
    }
    public void setFarmaco_antitumorali_associati___gte(String farmaco_antitumorali_associati___gte) {
        this.farmaco_antitumorali_associati___gte = farmaco_antitumorali_associati___gte;
    }

    public String getFarmaco_antitumorali_associati___contains() {
        return farmaco_antitumorali_associati___contains;
    }
    public void setFarmaco_antitumorali_associati___contains(String farmaco_antitumorali_associati___contains) {
        this.farmaco_antitumorali_associati___contains = farmaco_antitumorali_associati___contains;
    }

    public String getFarmaco_antitumorali_associati___not___contains() {
        return farmaco_antitumorali_associati___not___contains;
    }
    public void setFarmaco_antitumorali_associati___not___contains(String farmaco_antitumorali_associati___not___contains) {
        this.farmaco_antitumorali_associati___not___contains = farmaco_antitumorali_associati___not___contains;
    }

    public String getFarmaco_antitumorali_associati___starts_with() {
        return farmaco_antitumorali_associati___starts_with;
    }
    public void setFarmaco_antitumorali_associati___starts_with(String farmaco_antitumorali_associati___starts_with) {
        this.farmaco_antitumorali_associati___starts_with = farmaco_antitumorali_associati___starts_with;
    }

    public String getFarmaco_antitumorali_associati___not___starts_with() {
        return farmaco_antitumorali_associati___not___starts_with;
    }
    public void setFarmaco_antitumorali_associati___not___starts_with(String farmaco_antitumorali_associati___not___starts_with) {
        this.farmaco_antitumorali_associati___not___starts_with = farmaco_antitumorali_associati___not___starts_with;
    }

    public String getFarmaco_antitumorali_associati___ends_with() {
        return farmaco_antitumorali_associati___ends_with;
    }
    public void setFarmaco_antitumorali_associati___ends_with(String farmaco_antitumorali_associati___ends_with) {
        this.farmaco_antitumorali_associati___ends_with = farmaco_antitumorali_associati___ends_with;
    }

    public String getFarmaco_antitumorali_associati___not___ends_with() {
        return farmaco_antitumorali_associati___not___ends_with;
    }
    public void setFarmaco_antitumorali_associati___not___ends_with(String farmaco_antitumorali_associati___not___ends_with) {
        this.farmaco_antitumorali_associati___not___ends_with = farmaco_antitumorali_associati___not___ends_with;
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

    public Integer getN_farmaci_antitumorali_associati___eq() {
        return n_farmaci_antitumorali_associati___eq;
    }
    public void setN_farmaci_antitumorali_associati___eq(Integer n_farmaci_antitumorali_associati___eq) {
        this.n_farmaci_antitumorali_associati___eq = n_farmaci_antitumorali_associati___eq;
    }

    public Integer getN_farmaci_antitumorali_associati___ne() {
        return n_farmaci_antitumorali_associati___ne;
    }
    public void setN_farmaci_antitumorali_associati___ne(Integer n_farmaci_antitumorali_associati___ne) {
        this.n_farmaci_antitumorali_associati___ne = n_farmaci_antitumorali_associati___ne;
    }

    public Boolean getN_farmaci_antitumorali_associati___null() {
        return n_farmaci_antitumorali_associati___null;
    }
    public void setN_farmaci_antitumorali_associati___null(Boolean n_farmaci_antitumorali_associati___null) {
        this.n_farmaci_antitumorali_associati___null = n_farmaci_antitumorali_associati___null;
    }

    public Boolean getN_farmaci_antitumorali_associati___not___null() {
        return n_farmaci_antitumorali_associati___not___null;
    }
    public void setN_farmaci_antitumorali_associati___not___null(Boolean n_farmaci_antitumorali_associati___not___null) {
        this.n_farmaci_antitumorali_associati___not___null = n_farmaci_antitumorali_associati___not___null;
    }

    public java.util.List<Integer> getN_farmaci_antitumorali_associati___in() {
        return n_farmaci_antitumorali_associati___in;
    }
    public void setN_farmaci_antitumorali_associati___in(java.util.List<Integer> n_farmaci_antitumorali_associati___in) {
        this.n_farmaci_antitumorali_associati___in = n_farmaci_antitumorali_associati___in;
    }

    public java.util.List<Integer> getN_farmaci_antitumorali_associati___not___in() {
        return n_farmaci_antitumorali_associati___not___in;
    }
    public void setN_farmaci_antitumorali_associati___not___in(java.util.List<Integer> n_farmaci_antitumorali_associati___not___in) {
        this.n_farmaci_antitumorali_associati___not___in = n_farmaci_antitumorali_associati___not___in;
    }

    public Integer getN_farmaci_antitumorali_associati___lt() {
        return n_farmaci_antitumorali_associati___lt;
    }
    public void setN_farmaci_antitumorali_associati___lt(Integer n_farmaci_antitumorali_associati___lt) {
        this.n_farmaci_antitumorali_associati___lt = n_farmaci_antitumorali_associati___lt;
    }

    public Integer getN_farmaci_antitumorali_associati___lte() {
        return n_farmaci_antitumorali_associati___lte;
    }
    public void setN_farmaci_antitumorali_associati___lte(Integer n_farmaci_antitumorali_associati___lte) {
        this.n_farmaci_antitumorali_associati___lte = n_farmaci_antitumorali_associati___lte;
    }

    public Integer getN_farmaci_antitumorali_associati___gt() {
        return n_farmaci_antitumorali_associati___gt;
    }
    public void setN_farmaci_antitumorali_associati___gt(Integer n_farmaci_antitumorali_associati___gt) {
        this.n_farmaci_antitumorali_associati___gt = n_farmaci_antitumorali_associati___gt;
    }

    public Integer getN_farmaci_antitumorali_associati___gte() {
        return n_farmaci_antitumorali_associati___gte;
    }
    public void setN_farmaci_antitumorali_associati___gte(Integer n_farmaci_antitumorali_associati___gte) {
        this.n_farmaci_antitumorali_associati___gte = n_farmaci_antitumorali_associati___gte;
    }

    public String getNome___eq() {
        return nome___eq;
    }
    public void setNome___eq(String nome___eq) {
        this.nome___eq = nome___eq;
    }

    public String getNome___ne() {
        return nome___ne;
    }
    public void setNome___ne(String nome___ne) {
        this.nome___ne = nome___ne;
    }

    public Boolean getNome___null() {
        return nome___null;
    }
    public void setNome___null(Boolean nome___null) {
        this.nome___null = nome___null;
    }

    public Boolean getNome___not___null() {
        return nome___not___null;
    }
    public void setNome___not___null(Boolean nome___not___null) {
        this.nome___not___null = nome___not___null;
    }

    public java.util.List<String> getNome___in() {
        return nome___in;
    }
    public void setNome___in(java.util.List<String> nome___in) {
        this.nome___in = nome___in;
    }

    public java.util.List<String> getNome___not___in() {
        return nome___not___in;
    }
    public void setNome___not___in(java.util.List<String> nome___not___in) {
        this.nome___not___in = nome___not___in;
    }

    public String getNome___lt() {
        return nome___lt;
    }
    public void setNome___lt(String nome___lt) {
        this.nome___lt = nome___lt;
    }

    public String getNome___lte() {
        return nome___lte;
    }
    public void setNome___lte(String nome___lte) {
        this.nome___lte = nome___lte;
    }

    public String getNome___gt() {
        return nome___gt;
    }
    public void setNome___gt(String nome___gt) {
        this.nome___gt = nome___gt;
    }

    public String getNome___gte() {
        return nome___gte;
    }
    public void setNome___gte(String nome___gte) {
        this.nome___gte = nome___gte;
    }

    public String getNome___contains() {
        return nome___contains;
    }
    public void setNome___contains(String nome___contains) {
        this.nome___contains = nome___contains;
    }

    public String getNome___not___contains() {
        return nome___not___contains;
    }
    public void setNome___not___contains(String nome___not___contains) {
        this.nome___not___contains = nome___not___contains;
    }

    public String getNome___starts_with() {
        return nome___starts_with;
    }
    public void setNome___starts_with(String nome___starts_with) {
        this.nome___starts_with = nome___starts_with;
    }

    public String getNome___not___starts_with() {
        return nome___not___starts_with;
    }
    public void setNome___not___starts_with(String nome___not___starts_with) {
        this.nome___not___starts_with = nome___not___starts_with;
    }

    public String getNome___ends_with() {
        return nome___ends_with;
    }
    public void setNome___ends_with(String nome___ends_with) {
        this.nome___ends_with = nome___ends_with;
    }

    public String getNome___not___ends_with() {
        return nome___not___ends_with;
    }
    public void setNome___not___ends_with(String nome___not___ends_with) {
        this.nome___not___ends_with = nome___not___ends_with;
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

    public java.util.List<CliTipo_trattamento_antitumoraleFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliTipo_trattamento_antitumoraleFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliTipo_trattamento_antitumoraleFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliTipo_trattamento_antitumoraleFilterDTO> OR) {
        this.OR = OR;
    }

    public CliTipo_trattamento_antitumoraleFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliTipo_trattamento_antitumoraleFilterDTO NOT) {
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
        if (farmaco_antitumorali_associati___eq != null) {
            joiner.add("farmaco_antitumorali_associati___eq: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___eq));
        }
        if (farmaco_antitumorali_associati___ne != null) {
            joiner.add("farmaco_antitumorali_associati___ne: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___ne));
        }
        if (farmaco_antitumorali_associati___null != null) {
            joiner.add("farmaco_antitumorali_associati___null: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___null));
        }
        if (farmaco_antitumorali_associati___not___null != null) {
            joiner.add("farmaco_antitumorali_associati___not___null: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___not___null));
        }
        if (farmaco_antitumorali_associati___in != null) {
            joiner.add("farmaco_antitumorali_associati___in: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___in));
        }
        if (farmaco_antitumorali_associati___not___in != null) {
            joiner.add("farmaco_antitumorali_associati___not___in: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___not___in));
        }
        if (farmaco_antitumorali_associati___lt != null) {
            joiner.add("farmaco_antitumorali_associati___lt: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___lt));
        }
        if (farmaco_antitumorali_associati___lte != null) {
            joiner.add("farmaco_antitumorali_associati___lte: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___lte));
        }
        if (farmaco_antitumorali_associati___gt != null) {
            joiner.add("farmaco_antitumorali_associati___gt: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___gt));
        }
        if (farmaco_antitumorali_associati___gte != null) {
            joiner.add("farmaco_antitumorali_associati___gte: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___gte));
        }
        if (farmaco_antitumorali_associati___contains != null) {
            joiner.add("farmaco_antitumorali_associati___contains: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___contains));
        }
        if (farmaco_antitumorali_associati___not___contains != null) {
            joiner.add("farmaco_antitumorali_associati___not___contains: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___not___contains));
        }
        if (farmaco_antitumorali_associati___starts_with != null) {
            joiner.add("farmaco_antitumorali_associati___starts_with: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___starts_with));
        }
        if (farmaco_antitumorali_associati___not___starts_with != null) {
            joiner.add("farmaco_antitumorali_associati___not___starts_with: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___not___starts_with));
        }
        if (farmaco_antitumorali_associati___ends_with != null) {
            joiner.add("farmaco_antitumorali_associati___ends_with: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___ends_with));
        }
        if (farmaco_antitumorali_associati___not___ends_with != null) {
            joiner.add("farmaco_antitumorali_associati___not___ends_with: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati___not___ends_with));
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
        if (n_farmaci_antitumorali_associati___eq != null) {
            joiner.add("n_farmaci_antitumorali_associati___eq: " + GraphQLRequestSerializer.getEntry(n_farmaci_antitumorali_associati___eq));
        }
        if (n_farmaci_antitumorali_associati___ne != null) {
            joiner.add("n_farmaci_antitumorali_associati___ne: " + GraphQLRequestSerializer.getEntry(n_farmaci_antitumorali_associati___ne));
        }
        if (n_farmaci_antitumorali_associati___null != null) {
            joiner.add("n_farmaci_antitumorali_associati___null: " + GraphQLRequestSerializer.getEntry(n_farmaci_antitumorali_associati___null));
        }
        if (n_farmaci_antitumorali_associati___not___null != null) {
            joiner.add("n_farmaci_antitumorali_associati___not___null: " + GraphQLRequestSerializer.getEntry(n_farmaci_antitumorali_associati___not___null));
        }
        if (n_farmaci_antitumorali_associati___in != null) {
            joiner.add("n_farmaci_antitumorali_associati___in: " + GraphQLRequestSerializer.getEntry(n_farmaci_antitumorali_associati___in));
        }
        if (n_farmaci_antitumorali_associati___not___in != null) {
            joiner.add("n_farmaci_antitumorali_associati___not___in: " + GraphQLRequestSerializer.getEntry(n_farmaci_antitumorali_associati___not___in));
        }
        if (n_farmaci_antitumorali_associati___lt != null) {
            joiner.add("n_farmaci_antitumorali_associati___lt: " + GraphQLRequestSerializer.getEntry(n_farmaci_antitumorali_associati___lt));
        }
        if (n_farmaci_antitumorali_associati___lte != null) {
            joiner.add("n_farmaci_antitumorali_associati___lte: " + GraphQLRequestSerializer.getEntry(n_farmaci_antitumorali_associati___lte));
        }
        if (n_farmaci_antitumorali_associati___gt != null) {
            joiner.add("n_farmaci_antitumorali_associati___gt: " + GraphQLRequestSerializer.getEntry(n_farmaci_antitumorali_associati___gt));
        }
        if (n_farmaci_antitumorali_associati___gte != null) {
            joiner.add("n_farmaci_antitumorali_associati___gte: " + GraphQLRequestSerializer.getEntry(n_farmaci_antitumorali_associati___gte));
        }
        if (nome___eq != null) {
            joiner.add("nome___eq: " + GraphQLRequestSerializer.getEntry(nome___eq));
        }
        if (nome___ne != null) {
            joiner.add("nome___ne: " + GraphQLRequestSerializer.getEntry(nome___ne));
        }
        if (nome___null != null) {
            joiner.add("nome___null: " + GraphQLRequestSerializer.getEntry(nome___null));
        }
        if (nome___not___null != null) {
            joiner.add("nome___not___null: " + GraphQLRequestSerializer.getEntry(nome___not___null));
        }
        if (nome___in != null) {
            joiner.add("nome___in: " + GraphQLRequestSerializer.getEntry(nome___in));
        }
        if (nome___not___in != null) {
            joiner.add("nome___not___in: " + GraphQLRequestSerializer.getEntry(nome___not___in));
        }
        if (nome___lt != null) {
            joiner.add("nome___lt: " + GraphQLRequestSerializer.getEntry(nome___lt));
        }
        if (nome___lte != null) {
            joiner.add("nome___lte: " + GraphQLRequestSerializer.getEntry(nome___lte));
        }
        if (nome___gt != null) {
            joiner.add("nome___gt: " + GraphQLRequestSerializer.getEntry(nome___gt));
        }
        if (nome___gte != null) {
            joiner.add("nome___gte: " + GraphQLRequestSerializer.getEntry(nome___gte));
        }
        if (nome___contains != null) {
            joiner.add("nome___contains: " + GraphQLRequestSerializer.getEntry(nome___contains));
        }
        if (nome___not___contains != null) {
            joiner.add("nome___not___contains: " + GraphQLRequestSerializer.getEntry(nome___not___contains));
        }
        if (nome___starts_with != null) {
            joiner.add("nome___starts_with: " + GraphQLRequestSerializer.getEntry(nome___starts_with));
        }
        if (nome___not___starts_with != null) {
            joiner.add("nome___not___starts_with: " + GraphQLRequestSerializer.getEntry(nome___not___starts_with));
        }
        if (nome___ends_with != null) {
            joiner.add("nome___ends_with: " + GraphQLRequestSerializer.getEntry(nome___ends_with));
        }
        if (nome___not___ends_with != null) {
            joiner.add("nome___not___ends_with: " + GraphQLRequestSerializer.getEntry(nome___not___ends_with));
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

    public static CliTipo_trattamento_antitumoraleFilterDTO.Builder builder() {
        return new CliTipo_trattamento_antitumoraleFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
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
        private String farmaco_antitumorali_associati___eq;
        private String farmaco_antitumorali_associati___ne;
        private Boolean farmaco_antitumorali_associati___null;
        private Boolean farmaco_antitumorali_associati___not___null;
        private java.util.List<String> farmaco_antitumorali_associati___in;
        private java.util.List<String> farmaco_antitumorali_associati___not___in;
        private String farmaco_antitumorali_associati___lt;
        private String farmaco_antitumorali_associati___lte;
        private String farmaco_antitumorali_associati___gt;
        private String farmaco_antitumorali_associati___gte;
        private String farmaco_antitumorali_associati___contains;
        private String farmaco_antitumorali_associati___not___contains;
        private String farmaco_antitumorali_associati___starts_with;
        private String farmaco_antitumorali_associati___not___starts_with;
        private String farmaco_antitumorali_associati___ends_with;
        private String farmaco_antitumorali_associati___not___ends_with;
        private Boolean immunoterapia___eq;
        private Boolean immunoterapia___ne;
        private Boolean immunoterapia___null;
        private Boolean immunoterapia___not___null;
        private Integer n_farmaci_antitumorali_associati___eq;
        private Integer n_farmaci_antitumorali_associati___ne;
        private Boolean n_farmaci_antitumorali_associati___null;
        private Boolean n_farmaci_antitumorali_associati___not___null;
        private java.util.List<Integer> n_farmaci_antitumorali_associati___in;
        private java.util.List<Integer> n_farmaci_antitumorali_associati___not___in;
        private Integer n_farmaci_antitumorali_associati___lt;
        private Integer n_farmaci_antitumorali_associati___lte;
        private Integer n_farmaci_antitumorali_associati___gt;
        private Integer n_farmaci_antitumorali_associati___gte;
        private String nome___eq;
        private String nome___ne;
        private Boolean nome___null;
        private Boolean nome___not___null;
        private java.util.List<String> nome___in;
        private java.util.List<String> nome___not___in;
        private String nome___lt;
        private String nome___lte;
        private String nome___gt;
        private String nome___gte;
        private String nome___contains;
        private String nome___not___contains;
        private String nome___starts_with;
        private String nome___not___starts_with;
        private String nome___ends_with;
        private String nome___not___ends_with;
        private Boolean ormonale___eq;
        private Boolean ormonale___ne;
        private Boolean ormonale___null;
        private Boolean ormonale___not___null;
        private Boolean radioterapia___eq;
        private Boolean radioterapia___ne;
        private Boolean radioterapia___null;
        private Boolean radioterapia___not___null;
        private Boolean staminali___eq;
        private Boolean staminali___ne;
        private Boolean staminali___null;
        private Boolean staminali___not___null;
        private java.util.List<CliTipo_trattamento_antitumoraleFilterDTO> AND;
        private java.util.List<CliTipo_trattamento_antitumoraleFilterDTO> OR;
        private CliTipo_trattamento_antitumoraleFilterDTO NOT;

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

        public Builder setFarmaco_antitumorali_associati___eq(String farmaco_antitumorali_associati___eq) {
            this.farmaco_antitumorali_associati___eq = farmaco_antitumorali_associati___eq;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___ne(String farmaco_antitumorali_associati___ne) {
            this.farmaco_antitumorali_associati___ne = farmaco_antitumorali_associati___ne;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___null(Boolean farmaco_antitumorali_associati___null) {
            this.farmaco_antitumorali_associati___null = farmaco_antitumorali_associati___null;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___not___null(Boolean farmaco_antitumorali_associati___not___null) {
            this.farmaco_antitumorali_associati___not___null = farmaco_antitumorali_associati___not___null;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___in(java.util.List<String> farmaco_antitumorali_associati___in) {
            this.farmaco_antitumorali_associati___in = farmaco_antitumorali_associati___in;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___not___in(java.util.List<String> farmaco_antitumorali_associati___not___in) {
            this.farmaco_antitumorali_associati___not___in = farmaco_antitumorali_associati___not___in;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___lt(String farmaco_antitumorali_associati___lt) {
            this.farmaco_antitumorali_associati___lt = farmaco_antitumorali_associati___lt;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___lte(String farmaco_antitumorali_associati___lte) {
            this.farmaco_antitumorali_associati___lte = farmaco_antitumorali_associati___lte;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___gt(String farmaco_antitumorali_associati___gt) {
            this.farmaco_antitumorali_associati___gt = farmaco_antitumorali_associati___gt;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___gte(String farmaco_antitumorali_associati___gte) {
            this.farmaco_antitumorali_associati___gte = farmaco_antitumorali_associati___gte;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___contains(String farmaco_antitumorali_associati___contains) {
            this.farmaco_antitumorali_associati___contains = farmaco_antitumorali_associati___contains;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___not___contains(String farmaco_antitumorali_associati___not___contains) {
            this.farmaco_antitumorali_associati___not___contains = farmaco_antitumorali_associati___not___contains;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___starts_with(String farmaco_antitumorali_associati___starts_with) {
            this.farmaco_antitumorali_associati___starts_with = farmaco_antitumorali_associati___starts_with;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___not___starts_with(String farmaco_antitumorali_associati___not___starts_with) {
            this.farmaco_antitumorali_associati___not___starts_with = farmaco_antitumorali_associati___not___starts_with;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___ends_with(String farmaco_antitumorali_associati___ends_with) {
            this.farmaco_antitumorali_associati___ends_with = farmaco_antitumorali_associati___ends_with;
            return this;
        }

        public Builder setFarmaco_antitumorali_associati___not___ends_with(String farmaco_antitumorali_associati___not___ends_with) {
            this.farmaco_antitumorali_associati___not___ends_with = farmaco_antitumorali_associati___not___ends_with;
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

        public Builder setN_farmaci_antitumorali_associati___eq(Integer n_farmaci_antitumorali_associati___eq) {
            this.n_farmaci_antitumorali_associati___eq = n_farmaci_antitumorali_associati___eq;
            return this;
        }

        public Builder setN_farmaci_antitumorali_associati___ne(Integer n_farmaci_antitumorali_associati___ne) {
            this.n_farmaci_antitumorali_associati___ne = n_farmaci_antitumorali_associati___ne;
            return this;
        }

        public Builder setN_farmaci_antitumorali_associati___null(Boolean n_farmaci_antitumorali_associati___null) {
            this.n_farmaci_antitumorali_associati___null = n_farmaci_antitumorali_associati___null;
            return this;
        }

        public Builder setN_farmaci_antitumorali_associati___not___null(Boolean n_farmaci_antitumorali_associati___not___null) {
            this.n_farmaci_antitumorali_associati___not___null = n_farmaci_antitumorali_associati___not___null;
            return this;
        }

        public Builder setN_farmaci_antitumorali_associati___in(java.util.List<Integer> n_farmaci_antitumorali_associati___in) {
            this.n_farmaci_antitumorali_associati___in = n_farmaci_antitumorali_associati___in;
            return this;
        }

        public Builder setN_farmaci_antitumorali_associati___not___in(java.util.List<Integer> n_farmaci_antitumorali_associati___not___in) {
            this.n_farmaci_antitumorali_associati___not___in = n_farmaci_antitumorali_associati___not___in;
            return this;
        }

        public Builder setN_farmaci_antitumorali_associati___lt(Integer n_farmaci_antitumorali_associati___lt) {
            this.n_farmaci_antitumorali_associati___lt = n_farmaci_antitumorali_associati___lt;
            return this;
        }

        public Builder setN_farmaci_antitumorali_associati___lte(Integer n_farmaci_antitumorali_associati___lte) {
            this.n_farmaci_antitumorali_associati___lte = n_farmaci_antitumorali_associati___lte;
            return this;
        }

        public Builder setN_farmaci_antitumorali_associati___gt(Integer n_farmaci_antitumorali_associati___gt) {
            this.n_farmaci_antitumorali_associati___gt = n_farmaci_antitumorali_associati___gt;
            return this;
        }

        public Builder setN_farmaci_antitumorali_associati___gte(Integer n_farmaci_antitumorali_associati___gte) {
            this.n_farmaci_antitumorali_associati___gte = n_farmaci_antitumorali_associati___gte;
            return this;
        }

        public Builder setNome___eq(String nome___eq) {
            this.nome___eq = nome___eq;
            return this;
        }

        public Builder setNome___ne(String nome___ne) {
            this.nome___ne = nome___ne;
            return this;
        }

        public Builder setNome___null(Boolean nome___null) {
            this.nome___null = nome___null;
            return this;
        }

        public Builder setNome___not___null(Boolean nome___not___null) {
            this.nome___not___null = nome___not___null;
            return this;
        }

        public Builder setNome___in(java.util.List<String> nome___in) {
            this.nome___in = nome___in;
            return this;
        }

        public Builder setNome___not___in(java.util.List<String> nome___not___in) {
            this.nome___not___in = nome___not___in;
            return this;
        }

        public Builder setNome___lt(String nome___lt) {
            this.nome___lt = nome___lt;
            return this;
        }

        public Builder setNome___lte(String nome___lte) {
            this.nome___lte = nome___lte;
            return this;
        }

        public Builder setNome___gt(String nome___gt) {
            this.nome___gt = nome___gt;
            return this;
        }

        public Builder setNome___gte(String nome___gte) {
            this.nome___gte = nome___gte;
            return this;
        }

        public Builder setNome___contains(String nome___contains) {
            this.nome___contains = nome___contains;
            return this;
        }

        public Builder setNome___not___contains(String nome___not___contains) {
            this.nome___not___contains = nome___not___contains;
            return this;
        }

        public Builder setNome___starts_with(String nome___starts_with) {
            this.nome___starts_with = nome___starts_with;
            return this;
        }

        public Builder setNome___not___starts_with(String nome___not___starts_with) {
            this.nome___not___starts_with = nome___not___starts_with;
            return this;
        }

        public Builder setNome___ends_with(String nome___ends_with) {
            this.nome___ends_with = nome___ends_with;
            return this;
        }

        public Builder setNome___not___ends_with(String nome___not___ends_with) {
            this.nome___not___ends_with = nome___not___ends_with;
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

        public Builder setAND(java.util.List<CliTipo_trattamento_antitumoraleFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliTipo_trattamento_antitumoraleFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliTipo_trattamento_antitumoraleFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliTipo_trattamento_antitumoraleFilterDTO build() {
            CliTipo_trattamento_antitumoraleFilterDTO result = new CliTipo_trattamento_antitumoraleFilterDTO();
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
            result.setFarmaco_antitumorali_associati___eq(this.farmaco_antitumorali_associati___eq);
            result.setFarmaco_antitumorali_associati___ne(this.farmaco_antitumorali_associati___ne);
            result.setFarmaco_antitumorali_associati___null(this.farmaco_antitumorali_associati___null);
            result.setFarmaco_antitumorali_associati___not___null(this.farmaco_antitumorali_associati___not___null);
            result.setFarmaco_antitumorali_associati___in(this.farmaco_antitumorali_associati___in);
            result.setFarmaco_antitumorali_associati___not___in(this.farmaco_antitumorali_associati___not___in);
            result.setFarmaco_antitumorali_associati___lt(this.farmaco_antitumorali_associati___lt);
            result.setFarmaco_antitumorali_associati___lte(this.farmaco_antitumorali_associati___lte);
            result.setFarmaco_antitumorali_associati___gt(this.farmaco_antitumorali_associati___gt);
            result.setFarmaco_antitumorali_associati___gte(this.farmaco_antitumorali_associati___gte);
            result.setFarmaco_antitumorali_associati___contains(this.farmaco_antitumorali_associati___contains);
            result.setFarmaco_antitumorali_associati___not___contains(this.farmaco_antitumorali_associati___not___contains);
            result.setFarmaco_antitumorali_associati___starts_with(this.farmaco_antitumorali_associati___starts_with);
            result.setFarmaco_antitumorali_associati___not___starts_with(this.farmaco_antitumorali_associati___not___starts_with);
            result.setFarmaco_antitumorali_associati___ends_with(this.farmaco_antitumorali_associati___ends_with);
            result.setFarmaco_antitumorali_associati___not___ends_with(this.farmaco_antitumorali_associati___not___ends_with);
            result.setImmunoterapia___eq(this.immunoterapia___eq);
            result.setImmunoterapia___ne(this.immunoterapia___ne);
            result.setImmunoterapia___null(this.immunoterapia___null);
            result.setImmunoterapia___not___null(this.immunoterapia___not___null);
            result.setN_farmaci_antitumorali_associati___eq(this.n_farmaci_antitumorali_associati___eq);
            result.setN_farmaci_antitumorali_associati___ne(this.n_farmaci_antitumorali_associati___ne);
            result.setN_farmaci_antitumorali_associati___null(this.n_farmaci_antitumorali_associati___null);
            result.setN_farmaci_antitumorali_associati___not___null(this.n_farmaci_antitumorali_associati___not___null);
            result.setN_farmaci_antitumorali_associati___in(this.n_farmaci_antitumorali_associati___in);
            result.setN_farmaci_antitumorali_associati___not___in(this.n_farmaci_antitumorali_associati___not___in);
            result.setN_farmaci_antitumorali_associati___lt(this.n_farmaci_antitumorali_associati___lt);
            result.setN_farmaci_antitumorali_associati___lte(this.n_farmaci_antitumorali_associati___lte);
            result.setN_farmaci_antitumorali_associati___gt(this.n_farmaci_antitumorali_associati___gt);
            result.setN_farmaci_antitumorali_associati___gte(this.n_farmaci_antitumorali_associati___gte);
            result.setNome___eq(this.nome___eq);
            result.setNome___ne(this.nome___ne);
            result.setNome___null(this.nome___null);
            result.setNome___not___null(this.nome___not___null);
            result.setNome___in(this.nome___in);
            result.setNome___not___in(this.nome___not___in);
            result.setNome___lt(this.nome___lt);
            result.setNome___lte(this.nome___lte);
            result.setNome___gt(this.nome___gt);
            result.setNome___gte(this.nome___gte);
            result.setNome___contains(this.nome___contains);
            result.setNome___not___contains(this.nome___not___contains);
            result.setNome___starts_with(this.nome___starts_with);
            result.setNome___not___starts_with(this.nome___not___starts_with);
            result.setNome___ends_with(this.nome___ends_with);
            result.setNome___not___ends_with(this.nome___not___ends_with);
            result.setOrmonale___eq(this.ormonale___eq);
            result.setOrmonale___ne(this.ormonale___ne);
            result.setOrmonale___null(this.ormonale___null);
            result.setOrmonale___not___null(this.ormonale___not___null);
            result.setRadioterapia___eq(this.radioterapia___eq);
            result.setRadioterapia___ne(this.radioterapia___ne);
            result.setRadioterapia___null(this.radioterapia___null);
            result.setRadioterapia___not___null(this.radioterapia___not___null);
            result.setStaminali___eq(this.staminali___eq);
            result.setStaminali___ne(this.staminali___ne);
            result.setStaminali___null(this.staminali___null);
            result.setStaminali___not___null(this.staminali___not___null);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
