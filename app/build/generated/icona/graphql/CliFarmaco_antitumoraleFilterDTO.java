package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Farmaco_antitumorale.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliFarmaco_antitumoraleFilterDTO implements java.io.Serializable {

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
    private String combinazioni___eq;
    private String combinazioni___ne;
    private Boolean combinazioni___null;
    private Boolean combinazioni___not___null;
    private java.util.List<String> combinazioni___in;
    private java.util.List<String> combinazioni___not___in;
    private String combinazioni___lt;
    private String combinazioni___lte;
    private String combinazioni___gt;
    private String combinazioni___gte;
    private String combinazioni___contains;
    private String combinazioni___not___contains;
    private String combinazioni___starts_with;
    private String combinazioni___not___starts_with;
    private String combinazioni___ends_with;
    private String combinazioni___not___ends_with;
    private String farmaco_ATC___eq;
    private String farmaco_ATC___ne;
    private Boolean farmaco_ATC___null;
    private Boolean farmaco_ATC___not___null;
    private java.util.List<String> farmaco_ATC___in;
    private java.util.List<String> farmaco_ATC___not___in;
    private String farmaco_ATC___lt;
    private String farmaco_ATC___lte;
    private String farmaco_ATC___gt;
    private String farmaco_ATC___gte;
    private String farmaco_ATC___contains;
    private String farmaco_ATC___not___contains;
    private String farmaco_ATC___starts_with;
    private String farmaco_ATC___not___starts_with;
    private String farmaco_ATC___ends_with;
    private String farmaco_ATC___not___ends_with;
    private Integer n_tipi_trattamento_associati___eq;
    private Integer n_tipi_trattamento_associati___ne;
    private Boolean n_tipi_trattamento_associati___null;
    private Boolean n_tipi_trattamento_associati___not___null;
    private java.util.List<Integer> n_tipi_trattamento_associati___in;
    private java.util.List<Integer> n_tipi_trattamento_associati___not___in;
    private Integer n_tipi_trattamento_associati___lt;
    private Integer n_tipi_trattamento_associati___lte;
    private Integer n_tipi_trattamento_associati___gt;
    private Integer n_tipi_trattamento_associati___gte;
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
    private String tipi_trattamento_associati___eq;
    private String tipi_trattamento_associati___ne;
    private Boolean tipi_trattamento_associati___null;
    private Boolean tipi_trattamento_associati___not___null;
    private java.util.List<String> tipi_trattamento_associati___in;
    private java.util.List<String> tipi_trattamento_associati___not___in;
    private String tipi_trattamento_associati___lt;
    private String tipi_trattamento_associati___lte;
    private String tipi_trattamento_associati___gt;
    private String tipi_trattamento_associati___gte;
    private String tipi_trattamento_associati___contains;
    private String tipi_trattamento_associati___not___contains;
    private String tipi_trattamento_associati___starts_with;
    private String tipi_trattamento_associati___not___starts_with;
    private String tipi_trattamento_associati___ends_with;
    private String tipi_trattamento_associati___not___ends_with;
    private java.util.List<CliFarmaco_antitumoraleFilterDTO> AND;
    private java.util.List<CliFarmaco_antitumoraleFilterDTO> OR;
    private CliFarmaco_antitumoraleFilterDTO NOT;

    public CliFarmaco_antitumoraleFilterDTO() {
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

    public String getCombinazioni___eq() {
        return combinazioni___eq;
    }
    public void setCombinazioni___eq(String combinazioni___eq) {
        this.combinazioni___eq = combinazioni___eq;
    }

    public String getCombinazioni___ne() {
        return combinazioni___ne;
    }
    public void setCombinazioni___ne(String combinazioni___ne) {
        this.combinazioni___ne = combinazioni___ne;
    }

    public Boolean getCombinazioni___null() {
        return combinazioni___null;
    }
    public void setCombinazioni___null(Boolean combinazioni___null) {
        this.combinazioni___null = combinazioni___null;
    }

    public Boolean getCombinazioni___not___null() {
        return combinazioni___not___null;
    }
    public void setCombinazioni___not___null(Boolean combinazioni___not___null) {
        this.combinazioni___not___null = combinazioni___not___null;
    }

    public java.util.List<String> getCombinazioni___in() {
        return combinazioni___in;
    }
    public void setCombinazioni___in(java.util.List<String> combinazioni___in) {
        this.combinazioni___in = combinazioni___in;
    }

    public java.util.List<String> getCombinazioni___not___in() {
        return combinazioni___not___in;
    }
    public void setCombinazioni___not___in(java.util.List<String> combinazioni___not___in) {
        this.combinazioni___not___in = combinazioni___not___in;
    }

    public String getCombinazioni___lt() {
        return combinazioni___lt;
    }
    public void setCombinazioni___lt(String combinazioni___lt) {
        this.combinazioni___lt = combinazioni___lt;
    }

    public String getCombinazioni___lte() {
        return combinazioni___lte;
    }
    public void setCombinazioni___lte(String combinazioni___lte) {
        this.combinazioni___lte = combinazioni___lte;
    }

    public String getCombinazioni___gt() {
        return combinazioni___gt;
    }
    public void setCombinazioni___gt(String combinazioni___gt) {
        this.combinazioni___gt = combinazioni___gt;
    }

    public String getCombinazioni___gte() {
        return combinazioni___gte;
    }
    public void setCombinazioni___gte(String combinazioni___gte) {
        this.combinazioni___gte = combinazioni___gte;
    }

    public String getCombinazioni___contains() {
        return combinazioni___contains;
    }
    public void setCombinazioni___contains(String combinazioni___contains) {
        this.combinazioni___contains = combinazioni___contains;
    }

    public String getCombinazioni___not___contains() {
        return combinazioni___not___contains;
    }
    public void setCombinazioni___not___contains(String combinazioni___not___contains) {
        this.combinazioni___not___contains = combinazioni___not___contains;
    }

    public String getCombinazioni___starts_with() {
        return combinazioni___starts_with;
    }
    public void setCombinazioni___starts_with(String combinazioni___starts_with) {
        this.combinazioni___starts_with = combinazioni___starts_with;
    }

    public String getCombinazioni___not___starts_with() {
        return combinazioni___not___starts_with;
    }
    public void setCombinazioni___not___starts_with(String combinazioni___not___starts_with) {
        this.combinazioni___not___starts_with = combinazioni___not___starts_with;
    }

    public String getCombinazioni___ends_with() {
        return combinazioni___ends_with;
    }
    public void setCombinazioni___ends_with(String combinazioni___ends_with) {
        this.combinazioni___ends_with = combinazioni___ends_with;
    }

    public String getCombinazioni___not___ends_with() {
        return combinazioni___not___ends_with;
    }
    public void setCombinazioni___not___ends_with(String combinazioni___not___ends_with) {
        this.combinazioni___not___ends_with = combinazioni___not___ends_with;
    }

    public String getFarmaco_ATC___eq() {
        return farmaco_ATC___eq;
    }
    public void setFarmaco_ATC___eq(String farmaco_ATC___eq) {
        this.farmaco_ATC___eq = farmaco_ATC___eq;
    }

    public String getFarmaco_ATC___ne() {
        return farmaco_ATC___ne;
    }
    public void setFarmaco_ATC___ne(String farmaco_ATC___ne) {
        this.farmaco_ATC___ne = farmaco_ATC___ne;
    }

    public Boolean getFarmaco_ATC___null() {
        return farmaco_ATC___null;
    }
    public void setFarmaco_ATC___null(Boolean farmaco_ATC___null) {
        this.farmaco_ATC___null = farmaco_ATC___null;
    }

    public Boolean getFarmaco_ATC___not___null() {
        return farmaco_ATC___not___null;
    }
    public void setFarmaco_ATC___not___null(Boolean farmaco_ATC___not___null) {
        this.farmaco_ATC___not___null = farmaco_ATC___not___null;
    }

    public java.util.List<String> getFarmaco_ATC___in() {
        return farmaco_ATC___in;
    }
    public void setFarmaco_ATC___in(java.util.List<String> farmaco_ATC___in) {
        this.farmaco_ATC___in = farmaco_ATC___in;
    }

    public java.util.List<String> getFarmaco_ATC___not___in() {
        return farmaco_ATC___not___in;
    }
    public void setFarmaco_ATC___not___in(java.util.List<String> farmaco_ATC___not___in) {
        this.farmaco_ATC___not___in = farmaco_ATC___not___in;
    }

    public String getFarmaco_ATC___lt() {
        return farmaco_ATC___lt;
    }
    public void setFarmaco_ATC___lt(String farmaco_ATC___lt) {
        this.farmaco_ATC___lt = farmaco_ATC___lt;
    }

    public String getFarmaco_ATC___lte() {
        return farmaco_ATC___lte;
    }
    public void setFarmaco_ATC___lte(String farmaco_ATC___lte) {
        this.farmaco_ATC___lte = farmaco_ATC___lte;
    }

    public String getFarmaco_ATC___gt() {
        return farmaco_ATC___gt;
    }
    public void setFarmaco_ATC___gt(String farmaco_ATC___gt) {
        this.farmaco_ATC___gt = farmaco_ATC___gt;
    }

    public String getFarmaco_ATC___gte() {
        return farmaco_ATC___gte;
    }
    public void setFarmaco_ATC___gte(String farmaco_ATC___gte) {
        this.farmaco_ATC___gte = farmaco_ATC___gte;
    }

    public String getFarmaco_ATC___contains() {
        return farmaco_ATC___contains;
    }
    public void setFarmaco_ATC___contains(String farmaco_ATC___contains) {
        this.farmaco_ATC___contains = farmaco_ATC___contains;
    }

    public String getFarmaco_ATC___not___contains() {
        return farmaco_ATC___not___contains;
    }
    public void setFarmaco_ATC___not___contains(String farmaco_ATC___not___contains) {
        this.farmaco_ATC___not___contains = farmaco_ATC___not___contains;
    }

    public String getFarmaco_ATC___starts_with() {
        return farmaco_ATC___starts_with;
    }
    public void setFarmaco_ATC___starts_with(String farmaco_ATC___starts_with) {
        this.farmaco_ATC___starts_with = farmaco_ATC___starts_with;
    }

    public String getFarmaco_ATC___not___starts_with() {
        return farmaco_ATC___not___starts_with;
    }
    public void setFarmaco_ATC___not___starts_with(String farmaco_ATC___not___starts_with) {
        this.farmaco_ATC___not___starts_with = farmaco_ATC___not___starts_with;
    }

    public String getFarmaco_ATC___ends_with() {
        return farmaco_ATC___ends_with;
    }
    public void setFarmaco_ATC___ends_with(String farmaco_ATC___ends_with) {
        this.farmaco_ATC___ends_with = farmaco_ATC___ends_with;
    }

    public String getFarmaco_ATC___not___ends_with() {
        return farmaco_ATC___not___ends_with;
    }
    public void setFarmaco_ATC___not___ends_with(String farmaco_ATC___not___ends_with) {
        this.farmaco_ATC___not___ends_with = farmaco_ATC___not___ends_with;
    }

    public Integer getN_tipi_trattamento_associati___eq() {
        return n_tipi_trattamento_associati___eq;
    }
    public void setN_tipi_trattamento_associati___eq(Integer n_tipi_trattamento_associati___eq) {
        this.n_tipi_trattamento_associati___eq = n_tipi_trattamento_associati___eq;
    }

    public Integer getN_tipi_trattamento_associati___ne() {
        return n_tipi_trattamento_associati___ne;
    }
    public void setN_tipi_trattamento_associati___ne(Integer n_tipi_trattamento_associati___ne) {
        this.n_tipi_trattamento_associati___ne = n_tipi_trattamento_associati___ne;
    }

    public Boolean getN_tipi_trattamento_associati___null() {
        return n_tipi_trattamento_associati___null;
    }
    public void setN_tipi_trattamento_associati___null(Boolean n_tipi_trattamento_associati___null) {
        this.n_tipi_trattamento_associati___null = n_tipi_trattamento_associati___null;
    }

    public Boolean getN_tipi_trattamento_associati___not___null() {
        return n_tipi_trattamento_associati___not___null;
    }
    public void setN_tipi_trattamento_associati___not___null(Boolean n_tipi_trattamento_associati___not___null) {
        this.n_tipi_trattamento_associati___not___null = n_tipi_trattamento_associati___not___null;
    }

    public java.util.List<Integer> getN_tipi_trattamento_associati___in() {
        return n_tipi_trattamento_associati___in;
    }
    public void setN_tipi_trattamento_associati___in(java.util.List<Integer> n_tipi_trattamento_associati___in) {
        this.n_tipi_trattamento_associati___in = n_tipi_trattamento_associati___in;
    }

    public java.util.List<Integer> getN_tipi_trattamento_associati___not___in() {
        return n_tipi_trattamento_associati___not___in;
    }
    public void setN_tipi_trattamento_associati___not___in(java.util.List<Integer> n_tipi_trattamento_associati___not___in) {
        this.n_tipi_trattamento_associati___not___in = n_tipi_trattamento_associati___not___in;
    }

    public Integer getN_tipi_trattamento_associati___lt() {
        return n_tipi_trattamento_associati___lt;
    }
    public void setN_tipi_trattamento_associati___lt(Integer n_tipi_trattamento_associati___lt) {
        this.n_tipi_trattamento_associati___lt = n_tipi_trattamento_associati___lt;
    }

    public Integer getN_tipi_trattamento_associati___lte() {
        return n_tipi_trattamento_associati___lte;
    }
    public void setN_tipi_trattamento_associati___lte(Integer n_tipi_trattamento_associati___lte) {
        this.n_tipi_trattamento_associati___lte = n_tipi_trattamento_associati___lte;
    }

    public Integer getN_tipi_trattamento_associati___gt() {
        return n_tipi_trattamento_associati___gt;
    }
    public void setN_tipi_trattamento_associati___gt(Integer n_tipi_trattamento_associati___gt) {
        this.n_tipi_trattamento_associati___gt = n_tipi_trattamento_associati___gt;
    }

    public Integer getN_tipi_trattamento_associati___gte() {
        return n_tipi_trattamento_associati___gte;
    }
    public void setN_tipi_trattamento_associati___gte(Integer n_tipi_trattamento_associati___gte) {
        this.n_tipi_trattamento_associati___gte = n_tipi_trattamento_associati___gte;
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

    public String getTipi_trattamento_associati___eq() {
        return tipi_trattamento_associati___eq;
    }
    public void setTipi_trattamento_associati___eq(String tipi_trattamento_associati___eq) {
        this.tipi_trattamento_associati___eq = tipi_trattamento_associati___eq;
    }

    public String getTipi_trattamento_associati___ne() {
        return tipi_trattamento_associati___ne;
    }
    public void setTipi_trattamento_associati___ne(String tipi_trattamento_associati___ne) {
        this.tipi_trattamento_associati___ne = tipi_trattamento_associati___ne;
    }

    public Boolean getTipi_trattamento_associati___null() {
        return tipi_trattamento_associati___null;
    }
    public void setTipi_trattamento_associati___null(Boolean tipi_trattamento_associati___null) {
        this.tipi_trattamento_associati___null = tipi_trattamento_associati___null;
    }

    public Boolean getTipi_trattamento_associati___not___null() {
        return tipi_trattamento_associati___not___null;
    }
    public void setTipi_trattamento_associati___not___null(Boolean tipi_trattamento_associati___not___null) {
        this.tipi_trattamento_associati___not___null = tipi_trattamento_associati___not___null;
    }

    public java.util.List<String> getTipi_trattamento_associati___in() {
        return tipi_trattamento_associati___in;
    }
    public void setTipi_trattamento_associati___in(java.util.List<String> tipi_trattamento_associati___in) {
        this.tipi_trattamento_associati___in = tipi_trattamento_associati___in;
    }

    public java.util.List<String> getTipi_trattamento_associati___not___in() {
        return tipi_trattamento_associati___not___in;
    }
    public void setTipi_trattamento_associati___not___in(java.util.List<String> tipi_trattamento_associati___not___in) {
        this.tipi_trattamento_associati___not___in = tipi_trattamento_associati___not___in;
    }

    public String getTipi_trattamento_associati___lt() {
        return tipi_trattamento_associati___lt;
    }
    public void setTipi_trattamento_associati___lt(String tipi_trattamento_associati___lt) {
        this.tipi_trattamento_associati___lt = tipi_trattamento_associati___lt;
    }

    public String getTipi_trattamento_associati___lte() {
        return tipi_trattamento_associati___lte;
    }
    public void setTipi_trattamento_associati___lte(String tipi_trattamento_associati___lte) {
        this.tipi_trattamento_associati___lte = tipi_trattamento_associati___lte;
    }

    public String getTipi_trattamento_associati___gt() {
        return tipi_trattamento_associati___gt;
    }
    public void setTipi_trattamento_associati___gt(String tipi_trattamento_associati___gt) {
        this.tipi_trattamento_associati___gt = tipi_trattamento_associati___gt;
    }

    public String getTipi_trattamento_associati___gte() {
        return tipi_trattamento_associati___gte;
    }
    public void setTipi_trattamento_associati___gte(String tipi_trattamento_associati___gte) {
        this.tipi_trattamento_associati___gte = tipi_trattamento_associati___gte;
    }

    public String getTipi_trattamento_associati___contains() {
        return tipi_trattamento_associati___contains;
    }
    public void setTipi_trattamento_associati___contains(String tipi_trattamento_associati___contains) {
        this.tipi_trattamento_associati___contains = tipi_trattamento_associati___contains;
    }

    public String getTipi_trattamento_associati___not___contains() {
        return tipi_trattamento_associati___not___contains;
    }
    public void setTipi_trattamento_associati___not___contains(String tipi_trattamento_associati___not___contains) {
        this.tipi_trattamento_associati___not___contains = tipi_trattamento_associati___not___contains;
    }

    public String getTipi_trattamento_associati___starts_with() {
        return tipi_trattamento_associati___starts_with;
    }
    public void setTipi_trattamento_associati___starts_with(String tipi_trattamento_associati___starts_with) {
        this.tipi_trattamento_associati___starts_with = tipi_trattamento_associati___starts_with;
    }

    public String getTipi_trattamento_associati___not___starts_with() {
        return tipi_trattamento_associati___not___starts_with;
    }
    public void setTipi_trattamento_associati___not___starts_with(String tipi_trattamento_associati___not___starts_with) {
        this.tipi_trattamento_associati___not___starts_with = tipi_trattamento_associati___not___starts_with;
    }

    public String getTipi_trattamento_associati___ends_with() {
        return tipi_trattamento_associati___ends_with;
    }
    public void setTipi_trattamento_associati___ends_with(String tipi_trattamento_associati___ends_with) {
        this.tipi_trattamento_associati___ends_with = tipi_trattamento_associati___ends_with;
    }

    public String getTipi_trattamento_associati___not___ends_with() {
        return tipi_trattamento_associati___not___ends_with;
    }
    public void setTipi_trattamento_associati___not___ends_with(String tipi_trattamento_associati___not___ends_with) {
        this.tipi_trattamento_associati___not___ends_with = tipi_trattamento_associati___not___ends_with;
    }

    public java.util.List<CliFarmaco_antitumoraleFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliFarmaco_antitumoraleFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliFarmaco_antitumoraleFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliFarmaco_antitumoraleFilterDTO> OR) {
        this.OR = OR;
    }

    public CliFarmaco_antitumoraleFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliFarmaco_antitumoraleFilterDTO NOT) {
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
        if (combinazioni___eq != null) {
            joiner.add("combinazioni___eq: " + GraphQLRequestSerializer.getEntry(combinazioni___eq));
        }
        if (combinazioni___ne != null) {
            joiner.add("combinazioni___ne: " + GraphQLRequestSerializer.getEntry(combinazioni___ne));
        }
        if (combinazioni___null != null) {
            joiner.add("combinazioni___null: " + GraphQLRequestSerializer.getEntry(combinazioni___null));
        }
        if (combinazioni___not___null != null) {
            joiner.add("combinazioni___not___null: " + GraphQLRequestSerializer.getEntry(combinazioni___not___null));
        }
        if (combinazioni___in != null) {
            joiner.add("combinazioni___in: " + GraphQLRequestSerializer.getEntry(combinazioni___in));
        }
        if (combinazioni___not___in != null) {
            joiner.add("combinazioni___not___in: " + GraphQLRequestSerializer.getEntry(combinazioni___not___in));
        }
        if (combinazioni___lt != null) {
            joiner.add("combinazioni___lt: " + GraphQLRequestSerializer.getEntry(combinazioni___lt));
        }
        if (combinazioni___lte != null) {
            joiner.add("combinazioni___lte: " + GraphQLRequestSerializer.getEntry(combinazioni___lte));
        }
        if (combinazioni___gt != null) {
            joiner.add("combinazioni___gt: " + GraphQLRequestSerializer.getEntry(combinazioni___gt));
        }
        if (combinazioni___gte != null) {
            joiner.add("combinazioni___gte: " + GraphQLRequestSerializer.getEntry(combinazioni___gte));
        }
        if (combinazioni___contains != null) {
            joiner.add("combinazioni___contains: " + GraphQLRequestSerializer.getEntry(combinazioni___contains));
        }
        if (combinazioni___not___contains != null) {
            joiner.add("combinazioni___not___contains: " + GraphQLRequestSerializer.getEntry(combinazioni___not___contains));
        }
        if (combinazioni___starts_with != null) {
            joiner.add("combinazioni___starts_with: " + GraphQLRequestSerializer.getEntry(combinazioni___starts_with));
        }
        if (combinazioni___not___starts_with != null) {
            joiner.add("combinazioni___not___starts_with: " + GraphQLRequestSerializer.getEntry(combinazioni___not___starts_with));
        }
        if (combinazioni___ends_with != null) {
            joiner.add("combinazioni___ends_with: " + GraphQLRequestSerializer.getEntry(combinazioni___ends_with));
        }
        if (combinazioni___not___ends_with != null) {
            joiner.add("combinazioni___not___ends_with: " + GraphQLRequestSerializer.getEntry(combinazioni___not___ends_with));
        }
        if (farmaco_ATC___eq != null) {
            joiner.add("farmaco_ATC___eq: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___eq));
        }
        if (farmaco_ATC___ne != null) {
            joiner.add("farmaco_ATC___ne: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___ne));
        }
        if (farmaco_ATC___null != null) {
            joiner.add("farmaco_ATC___null: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___null));
        }
        if (farmaco_ATC___not___null != null) {
            joiner.add("farmaco_ATC___not___null: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___not___null));
        }
        if (farmaco_ATC___in != null) {
            joiner.add("farmaco_ATC___in: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___in));
        }
        if (farmaco_ATC___not___in != null) {
            joiner.add("farmaco_ATC___not___in: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___not___in));
        }
        if (farmaco_ATC___lt != null) {
            joiner.add("farmaco_ATC___lt: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___lt));
        }
        if (farmaco_ATC___lte != null) {
            joiner.add("farmaco_ATC___lte: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___lte));
        }
        if (farmaco_ATC___gt != null) {
            joiner.add("farmaco_ATC___gt: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___gt));
        }
        if (farmaco_ATC___gte != null) {
            joiner.add("farmaco_ATC___gte: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___gte));
        }
        if (farmaco_ATC___contains != null) {
            joiner.add("farmaco_ATC___contains: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___contains));
        }
        if (farmaco_ATC___not___contains != null) {
            joiner.add("farmaco_ATC___not___contains: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___not___contains));
        }
        if (farmaco_ATC___starts_with != null) {
            joiner.add("farmaco_ATC___starts_with: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___starts_with));
        }
        if (farmaco_ATC___not___starts_with != null) {
            joiner.add("farmaco_ATC___not___starts_with: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___not___starts_with));
        }
        if (farmaco_ATC___ends_with != null) {
            joiner.add("farmaco_ATC___ends_with: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___ends_with));
        }
        if (farmaco_ATC___not___ends_with != null) {
            joiner.add("farmaco_ATC___not___ends_with: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___not___ends_with));
        }
        if (n_tipi_trattamento_associati___eq != null) {
            joiner.add("n_tipi_trattamento_associati___eq: " + GraphQLRequestSerializer.getEntry(n_tipi_trattamento_associati___eq));
        }
        if (n_tipi_trattamento_associati___ne != null) {
            joiner.add("n_tipi_trattamento_associati___ne: " + GraphQLRequestSerializer.getEntry(n_tipi_trattamento_associati___ne));
        }
        if (n_tipi_trattamento_associati___null != null) {
            joiner.add("n_tipi_trattamento_associati___null: " + GraphQLRequestSerializer.getEntry(n_tipi_trattamento_associati___null));
        }
        if (n_tipi_trattamento_associati___not___null != null) {
            joiner.add("n_tipi_trattamento_associati___not___null: " + GraphQLRequestSerializer.getEntry(n_tipi_trattamento_associati___not___null));
        }
        if (n_tipi_trattamento_associati___in != null) {
            joiner.add("n_tipi_trattamento_associati___in: " + GraphQLRequestSerializer.getEntry(n_tipi_trattamento_associati___in));
        }
        if (n_tipi_trattamento_associati___not___in != null) {
            joiner.add("n_tipi_trattamento_associati___not___in: " + GraphQLRequestSerializer.getEntry(n_tipi_trattamento_associati___not___in));
        }
        if (n_tipi_trattamento_associati___lt != null) {
            joiner.add("n_tipi_trattamento_associati___lt: " + GraphQLRequestSerializer.getEntry(n_tipi_trattamento_associati___lt));
        }
        if (n_tipi_trattamento_associati___lte != null) {
            joiner.add("n_tipi_trattamento_associati___lte: " + GraphQLRequestSerializer.getEntry(n_tipi_trattamento_associati___lte));
        }
        if (n_tipi_trattamento_associati___gt != null) {
            joiner.add("n_tipi_trattamento_associati___gt: " + GraphQLRequestSerializer.getEntry(n_tipi_trattamento_associati___gt));
        }
        if (n_tipi_trattamento_associati___gte != null) {
            joiner.add("n_tipi_trattamento_associati___gte: " + GraphQLRequestSerializer.getEntry(n_tipi_trattamento_associati___gte));
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
        if (tipi_trattamento_associati___eq != null) {
            joiner.add("tipi_trattamento_associati___eq: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___eq));
        }
        if (tipi_trattamento_associati___ne != null) {
            joiner.add("tipi_trattamento_associati___ne: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___ne));
        }
        if (tipi_trattamento_associati___null != null) {
            joiner.add("tipi_trattamento_associati___null: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___null));
        }
        if (tipi_trattamento_associati___not___null != null) {
            joiner.add("tipi_trattamento_associati___not___null: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___not___null));
        }
        if (tipi_trattamento_associati___in != null) {
            joiner.add("tipi_trattamento_associati___in: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___in));
        }
        if (tipi_trattamento_associati___not___in != null) {
            joiner.add("tipi_trattamento_associati___not___in: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___not___in));
        }
        if (tipi_trattamento_associati___lt != null) {
            joiner.add("tipi_trattamento_associati___lt: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___lt));
        }
        if (tipi_trattamento_associati___lte != null) {
            joiner.add("tipi_trattamento_associati___lte: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___lte));
        }
        if (tipi_trattamento_associati___gt != null) {
            joiner.add("tipi_trattamento_associati___gt: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___gt));
        }
        if (tipi_trattamento_associati___gte != null) {
            joiner.add("tipi_trattamento_associati___gte: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___gte));
        }
        if (tipi_trattamento_associati___contains != null) {
            joiner.add("tipi_trattamento_associati___contains: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___contains));
        }
        if (tipi_trattamento_associati___not___contains != null) {
            joiner.add("tipi_trattamento_associati___not___contains: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___not___contains));
        }
        if (tipi_trattamento_associati___starts_with != null) {
            joiner.add("tipi_trattamento_associati___starts_with: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___starts_with));
        }
        if (tipi_trattamento_associati___not___starts_with != null) {
            joiner.add("tipi_trattamento_associati___not___starts_with: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___not___starts_with));
        }
        if (tipi_trattamento_associati___ends_with != null) {
            joiner.add("tipi_trattamento_associati___ends_with: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___ends_with));
        }
        if (tipi_trattamento_associati___not___ends_with != null) {
            joiner.add("tipi_trattamento_associati___not___ends_with: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati___not___ends_with));
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

    public static CliFarmaco_antitumoraleFilterDTO.Builder builder() {
        return new CliFarmaco_antitumoraleFilterDTO.Builder();
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
        private String combinazioni___eq;
        private String combinazioni___ne;
        private Boolean combinazioni___null;
        private Boolean combinazioni___not___null;
        private java.util.List<String> combinazioni___in;
        private java.util.List<String> combinazioni___not___in;
        private String combinazioni___lt;
        private String combinazioni___lte;
        private String combinazioni___gt;
        private String combinazioni___gte;
        private String combinazioni___contains;
        private String combinazioni___not___contains;
        private String combinazioni___starts_with;
        private String combinazioni___not___starts_with;
        private String combinazioni___ends_with;
        private String combinazioni___not___ends_with;
        private String farmaco_ATC___eq;
        private String farmaco_ATC___ne;
        private Boolean farmaco_ATC___null;
        private Boolean farmaco_ATC___not___null;
        private java.util.List<String> farmaco_ATC___in;
        private java.util.List<String> farmaco_ATC___not___in;
        private String farmaco_ATC___lt;
        private String farmaco_ATC___lte;
        private String farmaco_ATC___gt;
        private String farmaco_ATC___gte;
        private String farmaco_ATC___contains;
        private String farmaco_ATC___not___contains;
        private String farmaco_ATC___starts_with;
        private String farmaco_ATC___not___starts_with;
        private String farmaco_ATC___ends_with;
        private String farmaco_ATC___not___ends_with;
        private Integer n_tipi_trattamento_associati___eq;
        private Integer n_tipi_trattamento_associati___ne;
        private Boolean n_tipi_trattamento_associati___null;
        private Boolean n_tipi_trattamento_associati___not___null;
        private java.util.List<Integer> n_tipi_trattamento_associati___in;
        private java.util.List<Integer> n_tipi_trattamento_associati___not___in;
        private Integer n_tipi_trattamento_associati___lt;
        private Integer n_tipi_trattamento_associati___lte;
        private Integer n_tipi_trattamento_associati___gt;
        private Integer n_tipi_trattamento_associati___gte;
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
        private String tipi_trattamento_associati___eq;
        private String tipi_trattamento_associati___ne;
        private Boolean tipi_trattamento_associati___null;
        private Boolean tipi_trattamento_associati___not___null;
        private java.util.List<String> tipi_trattamento_associati___in;
        private java.util.List<String> tipi_trattamento_associati___not___in;
        private String tipi_trattamento_associati___lt;
        private String tipi_trattamento_associati___lte;
        private String tipi_trattamento_associati___gt;
        private String tipi_trattamento_associati___gte;
        private String tipi_trattamento_associati___contains;
        private String tipi_trattamento_associati___not___contains;
        private String tipi_trattamento_associati___starts_with;
        private String tipi_trattamento_associati___not___starts_with;
        private String tipi_trattamento_associati___ends_with;
        private String tipi_trattamento_associati___not___ends_with;
        private java.util.List<CliFarmaco_antitumoraleFilterDTO> AND;
        private java.util.List<CliFarmaco_antitumoraleFilterDTO> OR;
        private CliFarmaco_antitumoraleFilterDTO NOT;

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

        public Builder setCombinazioni___eq(String combinazioni___eq) {
            this.combinazioni___eq = combinazioni___eq;
            return this;
        }

        public Builder setCombinazioni___ne(String combinazioni___ne) {
            this.combinazioni___ne = combinazioni___ne;
            return this;
        }

        public Builder setCombinazioni___null(Boolean combinazioni___null) {
            this.combinazioni___null = combinazioni___null;
            return this;
        }

        public Builder setCombinazioni___not___null(Boolean combinazioni___not___null) {
            this.combinazioni___not___null = combinazioni___not___null;
            return this;
        }

        public Builder setCombinazioni___in(java.util.List<String> combinazioni___in) {
            this.combinazioni___in = combinazioni___in;
            return this;
        }

        public Builder setCombinazioni___not___in(java.util.List<String> combinazioni___not___in) {
            this.combinazioni___not___in = combinazioni___not___in;
            return this;
        }

        public Builder setCombinazioni___lt(String combinazioni___lt) {
            this.combinazioni___lt = combinazioni___lt;
            return this;
        }

        public Builder setCombinazioni___lte(String combinazioni___lte) {
            this.combinazioni___lte = combinazioni___lte;
            return this;
        }

        public Builder setCombinazioni___gt(String combinazioni___gt) {
            this.combinazioni___gt = combinazioni___gt;
            return this;
        }

        public Builder setCombinazioni___gte(String combinazioni___gte) {
            this.combinazioni___gte = combinazioni___gte;
            return this;
        }

        public Builder setCombinazioni___contains(String combinazioni___contains) {
            this.combinazioni___contains = combinazioni___contains;
            return this;
        }

        public Builder setCombinazioni___not___contains(String combinazioni___not___contains) {
            this.combinazioni___not___contains = combinazioni___not___contains;
            return this;
        }

        public Builder setCombinazioni___starts_with(String combinazioni___starts_with) {
            this.combinazioni___starts_with = combinazioni___starts_with;
            return this;
        }

        public Builder setCombinazioni___not___starts_with(String combinazioni___not___starts_with) {
            this.combinazioni___not___starts_with = combinazioni___not___starts_with;
            return this;
        }

        public Builder setCombinazioni___ends_with(String combinazioni___ends_with) {
            this.combinazioni___ends_with = combinazioni___ends_with;
            return this;
        }

        public Builder setCombinazioni___not___ends_with(String combinazioni___not___ends_with) {
            this.combinazioni___not___ends_with = combinazioni___not___ends_with;
            return this;
        }

        public Builder setFarmaco_ATC___eq(String farmaco_ATC___eq) {
            this.farmaco_ATC___eq = farmaco_ATC___eq;
            return this;
        }

        public Builder setFarmaco_ATC___ne(String farmaco_ATC___ne) {
            this.farmaco_ATC___ne = farmaco_ATC___ne;
            return this;
        }

        public Builder setFarmaco_ATC___null(Boolean farmaco_ATC___null) {
            this.farmaco_ATC___null = farmaco_ATC___null;
            return this;
        }

        public Builder setFarmaco_ATC___not___null(Boolean farmaco_ATC___not___null) {
            this.farmaco_ATC___not___null = farmaco_ATC___not___null;
            return this;
        }

        public Builder setFarmaco_ATC___in(java.util.List<String> farmaco_ATC___in) {
            this.farmaco_ATC___in = farmaco_ATC___in;
            return this;
        }

        public Builder setFarmaco_ATC___not___in(java.util.List<String> farmaco_ATC___not___in) {
            this.farmaco_ATC___not___in = farmaco_ATC___not___in;
            return this;
        }

        public Builder setFarmaco_ATC___lt(String farmaco_ATC___lt) {
            this.farmaco_ATC___lt = farmaco_ATC___lt;
            return this;
        }

        public Builder setFarmaco_ATC___lte(String farmaco_ATC___lte) {
            this.farmaco_ATC___lte = farmaco_ATC___lte;
            return this;
        }

        public Builder setFarmaco_ATC___gt(String farmaco_ATC___gt) {
            this.farmaco_ATC___gt = farmaco_ATC___gt;
            return this;
        }

        public Builder setFarmaco_ATC___gte(String farmaco_ATC___gte) {
            this.farmaco_ATC___gte = farmaco_ATC___gte;
            return this;
        }

        public Builder setFarmaco_ATC___contains(String farmaco_ATC___contains) {
            this.farmaco_ATC___contains = farmaco_ATC___contains;
            return this;
        }

        public Builder setFarmaco_ATC___not___contains(String farmaco_ATC___not___contains) {
            this.farmaco_ATC___not___contains = farmaco_ATC___not___contains;
            return this;
        }

        public Builder setFarmaco_ATC___starts_with(String farmaco_ATC___starts_with) {
            this.farmaco_ATC___starts_with = farmaco_ATC___starts_with;
            return this;
        }

        public Builder setFarmaco_ATC___not___starts_with(String farmaco_ATC___not___starts_with) {
            this.farmaco_ATC___not___starts_with = farmaco_ATC___not___starts_with;
            return this;
        }

        public Builder setFarmaco_ATC___ends_with(String farmaco_ATC___ends_with) {
            this.farmaco_ATC___ends_with = farmaco_ATC___ends_with;
            return this;
        }

        public Builder setFarmaco_ATC___not___ends_with(String farmaco_ATC___not___ends_with) {
            this.farmaco_ATC___not___ends_with = farmaco_ATC___not___ends_with;
            return this;
        }

        public Builder setN_tipi_trattamento_associati___eq(Integer n_tipi_trattamento_associati___eq) {
            this.n_tipi_trattamento_associati___eq = n_tipi_trattamento_associati___eq;
            return this;
        }

        public Builder setN_tipi_trattamento_associati___ne(Integer n_tipi_trattamento_associati___ne) {
            this.n_tipi_trattamento_associati___ne = n_tipi_trattamento_associati___ne;
            return this;
        }

        public Builder setN_tipi_trattamento_associati___null(Boolean n_tipi_trattamento_associati___null) {
            this.n_tipi_trattamento_associati___null = n_tipi_trattamento_associati___null;
            return this;
        }

        public Builder setN_tipi_trattamento_associati___not___null(Boolean n_tipi_trattamento_associati___not___null) {
            this.n_tipi_trattamento_associati___not___null = n_tipi_trattamento_associati___not___null;
            return this;
        }

        public Builder setN_tipi_trattamento_associati___in(java.util.List<Integer> n_tipi_trattamento_associati___in) {
            this.n_tipi_trattamento_associati___in = n_tipi_trattamento_associati___in;
            return this;
        }

        public Builder setN_tipi_trattamento_associati___not___in(java.util.List<Integer> n_tipi_trattamento_associati___not___in) {
            this.n_tipi_trattamento_associati___not___in = n_tipi_trattamento_associati___not___in;
            return this;
        }

        public Builder setN_tipi_trattamento_associati___lt(Integer n_tipi_trattamento_associati___lt) {
            this.n_tipi_trattamento_associati___lt = n_tipi_trattamento_associati___lt;
            return this;
        }

        public Builder setN_tipi_trattamento_associati___lte(Integer n_tipi_trattamento_associati___lte) {
            this.n_tipi_trattamento_associati___lte = n_tipi_trattamento_associati___lte;
            return this;
        }

        public Builder setN_tipi_trattamento_associati___gt(Integer n_tipi_trattamento_associati___gt) {
            this.n_tipi_trattamento_associati___gt = n_tipi_trattamento_associati___gt;
            return this;
        }

        public Builder setN_tipi_trattamento_associati___gte(Integer n_tipi_trattamento_associati___gte) {
            this.n_tipi_trattamento_associati___gte = n_tipi_trattamento_associati___gte;
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

        public Builder setTipi_trattamento_associati___eq(String tipi_trattamento_associati___eq) {
            this.tipi_trattamento_associati___eq = tipi_trattamento_associati___eq;
            return this;
        }

        public Builder setTipi_trattamento_associati___ne(String tipi_trattamento_associati___ne) {
            this.tipi_trattamento_associati___ne = tipi_trattamento_associati___ne;
            return this;
        }

        public Builder setTipi_trattamento_associati___null(Boolean tipi_trattamento_associati___null) {
            this.tipi_trattamento_associati___null = tipi_trattamento_associati___null;
            return this;
        }

        public Builder setTipi_trattamento_associati___not___null(Boolean tipi_trattamento_associati___not___null) {
            this.tipi_trattamento_associati___not___null = tipi_trattamento_associati___not___null;
            return this;
        }

        public Builder setTipi_trattamento_associati___in(java.util.List<String> tipi_trattamento_associati___in) {
            this.tipi_trattamento_associati___in = tipi_trattamento_associati___in;
            return this;
        }

        public Builder setTipi_trattamento_associati___not___in(java.util.List<String> tipi_trattamento_associati___not___in) {
            this.tipi_trattamento_associati___not___in = tipi_trattamento_associati___not___in;
            return this;
        }

        public Builder setTipi_trattamento_associati___lt(String tipi_trattamento_associati___lt) {
            this.tipi_trattamento_associati___lt = tipi_trattamento_associati___lt;
            return this;
        }

        public Builder setTipi_trattamento_associati___lte(String tipi_trattamento_associati___lte) {
            this.tipi_trattamento_associati___lte = tipi_trattamento_associati___lte;
            return this;
        }

        public Builder setTipi_trattamento_associati___gt(String tipi_trattamento_associati___gt) {
            this.tipi_trattamento_associati___gt = tipi_trattamento_associati___gt;
            return this;
        }

        public Builder setTipi_trattamento_associati___gte(String tipi_trattamento_associati___gte) {
            this.tipi_trattamento_associati___gte = tipi_trattamento_associati___gte;
            return this;
        }

        public Builder setTipi_trattamento_associati___contains(String tipi_trattamento_associati___contains) {
            this.tipi_trattamento_associati___contains = tipi_trattamento_associati___contains;
            return this;
        }

        public Builder setTipi_trattamento_associati___not___contains(String tipi_trattamento_associati___not___contains) {
            this.tipi_trattamento_associati___not___contains = tipi_trattamento_associati___not___contains;
            return this;
        }

        public Builder setTipi_trattamento_associati___starts_with(String tipi_trattamento_associati___starts_with) {
            this.tipi_trattamento_associati___starts_with = tipi_trattamento_associati___starts_with;
            return this;
        }

        public Builder setTipi_trattamento_associati___not___starts_with(String tipi_trattamento_associati___not___starts_with) {
            this.tipi_trattamento_associati___not___starts_with = tipi_trattamento_associati___not___starts_with;
            return this;
        }

        public Builder setTipi_trattamento_associati___ends_with(String tipi_trattamento_associati___ends_with) {
            this.tipi_trattamento_associati___ends_with = tipi_trattamento_associati___ends_with;
            return this;
        }

        public Builder setTipi_trattamento_associati___not___ends_with(String tipi_trattamento_associati___not___ends_with) {
            this.tipi_trattamento_associati___not___ends_with = tipi_trattamento_associati___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliFarmaco_antitumoraleFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliFarmaco_antitumoraleFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliFarmaco_antitumoraleFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliFarmaco_antitumoraleFilterDTO build() {
            CliFarmaco_antitumoraleFilterDTO result = new CliFarmaco_antitumoraleFilterDTO();
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
            result.setCombinazioni___eq(this.combinazioni___eq);
            result.setCombinazioni___ne(this.combinazioni___ne);
            result.setCombinazioni___null(this.combinazioni___null);
            result.setCombinazioni___not___null(this.combinazioni___not___null);
            result.setCombinazioni___in(this.combinazioni___in);
            result.setCombinazioni___not___in(this.combinazioni___not___in);
            result.setCombinazioni___lt(this.combinazioni___lt);
            result.setCombinazioni___lte(this.combinazioni___lte);
            result.setCombinazioni___gt(this.combinazioni___gt);
            result.setCombinazioni___gte(this.combinazioni___gte);
            result.setCombinazioni___contains(this.combinazioni___contains);
            result.setCombinazioni___not___contains(this.combinazioni___not___contains);
            result.setCombinazioni___starts_with(this.combinazioni___starts_with);
            result.setCombinazioni___not___starts_with(this.combinazioni___not___starts_with);
            result.setCombinazioni___ends_with(this.combinazioni___ends_with);
            result.setCombinazioni___not___ends_with(this.combinazioni___not___ends_with);
            result.setFarmaco_ATC___eq(this.farmaco_ATC___eq);
            result.setFarmaco_ATC___ne(this.farmaco_ATC___ne);
            result.setFarmaco_ATC___null(this.farmaco_ATC___null);
            result.setFarmaco_ATC___not___null(this.farmaco_ATC___not___null);
            result.setFarmaco_ATC___in(this.farmaco_ATC___in);
            result.setFarmaco_ATC___not___in(this.farmaco_ATC___not___in);
            result.setFarmaco_ATC___lt(this.farmaco_ATC___lt);
            result.setFarmaco_ATC___lte(this.farmaco_ATC___lte);
            result.setFarmaco_ATC___gt(this.farmaco_ATC___gt);
            result.setFarmaco_ATC___gte(this.farmaco_ATC___gte);
            result.setFarmaco_ATC___contains(this.farmaco_ATC___contains);
            result.setFarmaco_ATC___not___contains(this.farmaco_ATC___not___contains);
            result.setFarmaco_ATC___starts_with(this.farmaco_ATC___starts_with);
            result.setFarmaco_ATC___not___starts_with(this.farmaco_ATC___not___starts_with);
            result.setFarmaco_ATC___ends_with(this.farmaco_ATC___ends_with);
            result.setFarmaco_ATC___not___ends_with(this.farmaco_ATC___not___ends_with);
            result.setN_tipi_trattamento_associati___eq(this.n_tipi_trattamento_associati___eq);
            result.setN_tipi_trattamento_associati___ne(this.n_tipi_trattamento_associati___ne);
            result.setN_tipi_trattamento_associati___null(this.n_tipi_trattamento_associati___null);
            result.setN_tipi_trattamento_associati___not___null(this.n_tipi_trattamento_associati___not___null);
            result.setN_tipi_trattamento_associati___in(this.n_tipi_trattamento_associati___in);
            result.setN_tipi_trattamento_associati___not___in(this.n_tipi_trattamento_associati___not___in);
            result.setN_tipi_trattamento_associati___lt(this.n_tipi_trattamento_associati___lt);
            result.setN_tipi_trattamento_associati___lte(this.n_tipi_trattamento_associati___lte);
            result.setN_tipi_trattamento_associati___gt(this.n_tipi_trattamento_associati___gt);
            result.setN_tipi_trattamento_associati___gte(this.n_tipi_trattamento_associati___gte);
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
            result.setTipi_trattamento_associati___eq(this.tipi_trattamento_associati___eq);
            result.setTipi_trattamento_associati___ne(this.tipi_trattamento_associati___ne);
            result.setTipi_trattamento_associati___null(this.tipi_trattamento_associati___null);
            result.setTipi_trattamento_associati___not___null(this.tipi_trattamento_associati___not___null);
            result.setTipi_trattamento_associati___in(this.tipi_trattamento_associati___in);
            result.setTipi_trattamento_associati___not___in(this.tipi_trattamento_associati___not___in);
            result.setTipi_trattamento_associati___lt(this.tipi_trattamento_associati___lt);
            result.setTipi_trattamento_associati___lte(this.tipi_trattamento_associati___lte);
            result.setTipi_trattamento_associati___gt(this.tipi_trattamento_associati___gt);
            result.setTipi_trattamento_associati___gte(this.tipi_trattamento_associati___gte);
            result.setTipi_trattamento_associati___contains(this.tipi_trattamento_associati___contains);
            result.setTipi_trattamento_associati___not___contains(this.tipi_trattamento_associati___not___contains);
            result.setTipi_trattamento_associati___starts_with(this.tipi_trattamento_associati___starts_with);
            result.setTipi_trattamento_associati___not___starts_with(this.tipi_trattamento_associati___not___starts_with);
            result.setTipi_trattamento_associati___ends_with(this.tipi_trattamento_associati___ends_with);
            result.setTipi_trattamento_associati___not___ends_with(this.tipi_trattamento_associati___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
