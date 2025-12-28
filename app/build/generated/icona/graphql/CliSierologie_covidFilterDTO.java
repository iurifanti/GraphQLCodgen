package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Sierologie_covid.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliSierologie_covidFilterDTO implements java.io.Serializable {

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
    private Integer cc_id___eq;
    private Integer cc_id___ne;
    private Boolean cc_id___null;
    private Boolean cc_id___not___null;
    private java.util.List<Integer> cc_id___in;
    private java.util.List<Integer> cc_id___not___in;
    private Integer cc_id___lt;
    private Integer cc_id___lte;
    private Integer cc_id___gt;
    private Integer cc_id___gte;
    private String data_cc___eq;
    private String data_cc___ne;
    private Boolean data_cc___null;
    private Boolean data_cc___not___null;
    private java.util.List<String> data_cc___in;
    private java.util.List<String> data_cc___not___in;
    private String data_cc___lt;
    private String data_cc___lte;
    private String data_cc___gt;
    private String data_cc___gte;
    private String data_prelievo___eq;
    private String data_prelievo___ne;
    private Boolean data_prelievo___null;
    private Boolean data_prelievo___not___null;
    private java.util.List<String> data_prelievo___in;
    private java.util.List<String> data_prelievo___not___in;
    private String data_prelievo___lt;
    private String data_prelievo___lte;
    private String data_prelievo___gt;
    private String data_prelievo___gte;
    private Boolean esito___eq;
    private Boolean esito___ne;
    private Boolean esito___null;
    private Boolean esito___not___null;
    private String metodica___eq;
    private String metodica___ne;
    private Boolean metodica___null;
    private Boolean metodica___not___null;
    private java.util.List<String> metodica___in;
    private java.util.List<String> metodica___not___in;
    private String metodica___lt;
    private String metodica___lte;
    private String metodica___gt;
    private String metodica___gte;
    private String metodica___contains;
    private String metodica___not___contains;
    private String metodica___starts_with;
    private String metodica___not___starts_with;
    private String metodica___ends_with;
    private String metodica___not___ends_with;
    private Boolean solo_esito___eq;
    private Boolean solo_esito___ne;
    private Boolean solo_esito___null;
    private Boolean solo_esito___not___null;
    private String tempo___eq;
    private String tempo___ne;
    private Boolean tempo___null;
    private Boolean tempo___not___null;
    private java.util.List<String> tempo___in;
    private java.util.List<String> tempo___not___in;
    private String tempo___lt;
    private String tempo___lte;
    private String tempo___gt;
    private String tempo___gte;
    private String tempo___contains;
    private String tempo___not___contains;
    private String tempo___starts_with;
    private String tempo___not___starts_with;
    private String tempo___ends_with;
    private String tempo___not___ends_with;
    private String tipo_sierologia___eq;
    private String tipo_sierologia___ne;
    private Boolean tipo_sierologia___null;
    private Boolean tipo_sierologia___not___null;
    private java.util.List<String> tipo_sierologia___in;
    private java.util.List<String> tipo_sierologia___not___in;
    private String tipo_sierologia___lt;
    private String tipo_sierologia___lte;
    private String tipo_sierologia___gt;
    private String tipo_sierologia___gte;
    private String tipo_sierologia___contains;
    private String tipo_sierologia___not___contains;
    private String tipo_sierologia___starts_with;
    private String tipo_sierologia___not___starts_with;
    private String tipo_sierologia___ends_with;
    private String tipo_sierologia___not___ends_with;
    private String valore___eq;
    private String valore___ne;
    private Boolean valore___null;
    private Boolean valore___not___null;
    private java.util.List<String> valore___in;
    private java.util.List<String> valore___not___in;
    private String valore___lt;
    private String valore___lte;
    private String valore___gt;
    private String valore___gte;
    private Boolean vax_ico___eq;
    private Boolean vax_ico___ne;
    private Boolean vax_ico___null;
    private Boolean vax_ico___not___null;
    private java.util.List<CliSierologie_covidFilterDTO> AND;
    private java.util.List<CliSierologie_covidFilterDTO> OR;
    private CliSierologie_covidFilterDTO NOT;

    public CliSierologie_covidFilterDTO() {
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

    public Integer getCc_id___eq() {
        return cc_id___eq;
    }
    public void setCc_id___eq(Integer cc_id___eq) {
        this.cc_id___eq = cc_id___eq;
    }

    public Integer getCc_id___ne() {
        return cc_id___ne;
    }
    public void setCc_id___ne(Integer cc_id___ne) {
        this.cc_id___ne = cc_id___ne;
    }

    public Boolean getCc_id___null() {
        return cc_id___null;
    }
    public void setCc_id___null(Boolean cc_id___null) {
        this.cc_id___null = cc_id___null;
    }

    public Boolean getCc_id___not___null() {
        return cc_id___not___null;
    }
    public void setCc_id___not___null(Boolean cc_id___not___null) {
        this.cc_id___not___null = cc_id___not___null;
    }

    public java.util.List<Integer> getCc_id___in() {
        return cc_id___in;
    }
    public void setCc_id___in(java.util.List<Integer> cc_id___in) {
        this.cc_id___in = cc_id___in;
    }

    public java.util.List<Integer> getCc_id___not___in() {
        return cc_id___not___in;
    }
    public void setCc_id___not___in(java.util.List<Integer> cc_id___not___in) {
        this.cc_id___not___in = cc_id___not___in;
    }

    public Integer getCc_id___lt() {
        return cc_id___lt;
    }
    public void setCc_id___lt(Integer cc_id___lt) {
        this.cc_id___lt = cc_id___lt;
    }

    public Integer getCc_id___lte() {
        return cc_id___lte;
    }
    public void setCc_id___lte(Integer cc_id___lte) {
        this.cc_id___lte = cc_id___lte;
    }

    public Integer getCc_id___gt() {
        return cc_id___gt;
    }
    public void setCc_id___gt(Integer cc_id___gt) {
        this.cc_id___gt = cc_id___gt;
    }

    public Integer getCc_id___gte() {
        return cc_id___gte;
    }
    public void setCc_id___gte(Integer cc_id___gte) {
        this.cc_id___gte = cc_id___gte;
    }

    public String getData_cc___eq() {
        return data_cc___eq;
    }
    public void setData_cc___eq(String data_cc___eq) {
        this.data_cc___eq = data_cc___eq;
    }

    public String getData_cc___ne() {
        return data_cc___ne;
    }
    public void setData_cc___ne(String data_cc___ne) {
        this.data_cc___ne = data_cc___ne;
    }

    public Boolean getData_cc___null() {
        return data_cc___null;
    }
    public void setData_cc___null(Boolean data_cc___null) {
        this.data_cc___null = data_cc___null;
    }

    public Boolean getData_cc___not___null() {
        return data_cc___not___null;
    }
    public void setData_cc___not___null(Boolean data_cc___not___null) {
        this.data_cc___not___null = data_cc___not___null;
    }

    public java.util.List<String> getData_cc___in() {
        return data_cc___in;
    }
    public void setData_cc___in(java.util.List<String> data_cc___in) {
        this.data_cc___in = data_cc___in;
    }

    public java.util.List<String> getData_cc___not___in() {
        return data_cc___not___in;
    }
    public void setData_cc___not___in(java.util.List<String> data_cc___not___in) {
        this.data_cc___not___in = data_cc___not___in;
    }

    public String getData_cc___lt() {
        return data_cc___lt;
    }
    public void setData_cc___lt(String data_cc___lt) {
        this.data_cc___lt = data_cc___lt;
    }

    public String getData_cc___lte() {
        return data_cc___lte;
    }
    public void setData_cc___lte(String data_cc___lte) {
        this.data_cc___lte = data_cc___lte;
    }

    public String getData_cc___gt() {
        return data_cc___gt;
    }
    public void setData_cc___gt(String data_cc___gt) {
        this.data_cc___gt = data_cc___gt;
    }

    public String getData_cc___gte() {
        return data_cc___gte;
    }
    public void setData_cc___gte(String data_cc___gte) {
        this.data_cc___gte = data_cc___gte;
    }

    public String getData_prelievo___eq() {
        return data_prelievo___eq;
    }
    public void setData_prelievo___eq(String data_prelievo___eq) {
        this.data_prelievo___eq = data_prelievo___eq;
    }

    public String getData_prelievo___ne() {
        return data_prelievo___ne;
    }
    public void setData_prelievo___ne(String data_prelievo___ne) {
        this.data_prelievo___ne = data_prelievo___ne;
    }

    public Boolean getData_prelievo___null() {
        return data_prelievo___null;
    }
    public void setData_prelievo___null(Boolean data_prelievo___null) {
        this.data_prelievo___null = data_prelievo___null;
    }

    public Boolean getData_prelievo___not___null() {
        return data_prelievo___not___null;
    }
    public void setData_prelievo___not___null(Boolean data_prelievo___not___null) {
        this.data_prelievo___not___null = data_prelievo___not___null;
    }

    public java.util.List<String> getData_prelievo___in() {
        return data_prelievo___in;
    }
    public void setData_prelievo___in(java.util.List<String> data_prelievo___in) {
        this.data_prelievo___in = data_prelievo___in;
    }

    public java.util.List<String> getData_prelievo___not___in() {
        return data_prelievo___not___in;
    }
    public void setData_prelievo___not___in(java.util.List<String> data_prelievo___not___in) {
        this.data_prelievo___not___in = data_prelievo___not___in;
    }

    public String getData_prelievo___lt() {
        return data_prelievo___lt;
    }
    public void setData_prelievo___lt(String data_prelievo___lt) {
        this.data_prelievo___lt = data_prelievo___lt;
    }

    public String getData_prelievo___lte() {
        return data_prelievo___lte;
    }
    public void setData_prelievo___lte(String data_prelievo___lte) {
        this.data_prelievo___lte = data_prelievo___lte;
    }

    public String getData_prelievo___gt() {
        return data_prelievo___gt;
    }
    public void setData_prelievo___gt(String data_prelievo___gt) {
        this.data_prelievo___gt = data_prelievo___gt;
    }

    public String getData_prelievo___gte() {
        return data_prelievo___gte;
    }
    public void setData_prelievo___gte(String data_prelievo___gte) {
        this.data_prelievo___gte = data_prelievo___gte;
    }

    public Boolean getEsito___eq() {
        return esito___eq;
    }
    public void setEsito___eq(Boolean esito___eq) {
        this.esito___eq = esito___eq;
    }

    public Boolean getEsito___ne() {
        return esito___ne;
    }
    public void setEsito___ne(Boolean esito___ne) {
        this.esito___ne = esito___ne;
    }

    public Boolean getEsito___null() {
        return esito___null;
    }
    public void setEsito___null(Boolean esito___null) {
        this.esito___null = esito___null;
    }

    public Boolean getEsito___not___null() {
        return esito___not___null;
    }
    public void setEsito___not___null(Boolean esito___not___null) {
        this.esito___not___null = esito___not___null;
    }

    public String getMetodica___eq() {
        return metodica___eq;
    }
    public void setMetodica___eq(String metodica___eq) {
        this.metodica___eq = metodica___eq;
    }

    public String getMetodica___ne() {
        return metodica___ne;
    }
    public void setMetodica___ne(String metodica___ne) {
        this.metodica___ne = metodica___ne;
    }

    public Boolean getMetodica___null() {
        return metodica___null;
    }
    public void setMetodica___null(Boolean metodica___null) {
        this.metodica___null = metodica___null;
    }

    public Boolean getMetodica___not___null() {
        return metodica___not___null;
    }
    public void setMetodica___not___null(Boolean metodica___not___null) {
        this.metodica___not___null = metodica___not___null;
    }

    public java.util.List<String> getMetodica___in() {
        return metodica___in;
    }
    public void setMetodica___in(java.util.List<String> metodica___in) {
        this.metodica___in = metodica___in;
    }

    public java.util.List<String> getMetodica___not___in() {
        return metodica___not___in;
    }
    public void setMetodica___not___in(java.util.List<String> metodica___not___in) {
        this.metodica___not___in = metodica___not___in;
    }

    public String getMetodica___lt() {
        return metodica___lt;
    }
    public void setMetodica___lt(String metodica___lt) {
        this.metodica___lt = metodica___lt;
    }

    public String getMetodica___lte() {
        return metodica___lte;
    }
    public void setMetodica___lte(String metodica___lte) {
        this.metodica___lte = metodica___lte;
    }

    public String getMetodica___gt() {
        return metodica___gt;
    }
    public void setMetodica___gt(String metodica___gt) {
        this.metodica___gt = metodica___gt;
    }

    public String getMetodica___gte() {
        return metodica___gte;
    }
    public void setMetodica___gte(String metodica___gte) {
        this.metodica___gte = metodica___gte;
    }

    public String getMetodica___contains() {
        return metodica___contains;
    }
    public void setMetodica___contains(String metodica___contains) {
        this.metodica___contains = metodica___contains;
    }

    public String getMetodica___not___contains() {
        return metodica___not___contains;
    }
    public void setMetodica___not___contains(String metodica___not___contains) {
        this.metodica___not___contains = metodica___not___contains;
    }

    public String getMetodica___starts_with() {
        return metodica___starts_with;
    }
    public void setMetodica___starts_with(String metodica___starts_with) {
        this.metodica___starts_with = metodica___starts_with;
    }

    public String getMetodica___not___starts_with() {
        return metodica___not___starts_with;
    }
    public void setMetodica___not___starts_with(String metodica___not___starts_with) {
        this.metodica___not___starts_with = metodica___not___starts_with;
    }

    public String getMetodica___ends_with() {
        return metodica___ends_with;
    }
    public void setMetodica___ends_with(String metodica___ends_with) {
        this.metodica___ends_with = metodica___ends_with;
    }

    public String getMetodica___not___ends_with() {
        return metodica___not___ends_with;
    }
    public void setMetodica___not___ends_with(String metodica___not___ends_with) {
        this.metodica___not___ends_with = metodica___not___ends_with;
    }

    public Boolean getSolo_esito___eq() {
        return solo_esito___eq;
    }
    public void setSolo_esito___eq(Boolean solo_esito___eq) {
        this.solo_esito___eq = solo_esito___eq;
    }

    public Boolean getSolo_esito___ne() {
        return solo_esito___ne;
    }
    public void setSolo_esito___ne(Boolean solo_esito___ne) {
        this.solo_esito___ne = solo_esito___ne;
    }

    public Boolean getSolo_esito___null() {
        return solo_esito___null;
    }
    public void setSolo_esito___null(Boolean solo_esito___null) {
        this.solo_esito___null = solo_esito___null;
    }

    public Boolean getSolo_esito___not___null() {
        return solo_esito___not___null;
    }
    public void setSolo_esito___not___null(Boolean solo_esito___not___null) {
        this.solo_esito___not___null = solo_esito___not___null;
    }

    public String getTempo___eq() {
        return tempo___eq;
    }
    public void setTempo___eq(String tempo___eq) {
        this.tempo___eq = tempo___eq;
    }

    public String getTempo___ne() {
        return tempo___ne;
    }
    public void setTempo___ne(String tempo___ne) {
        this.tempo___ne = tempo___ne;
    }

    public Boolean getTempo___null() {
        return tempo___null;
    }
    public void setTempo___null(Boolean tempo___null) {
        this.tempo___null = tempo___null;
    }

    public Boolean getTempo___not___null() {
        return tempo___not___null;
    }
    public void setTempo___not___null(Boolean tempo___not___null) {
        this.tempo___not___null = tempo___not___null;
    }

    public java.util.List<String> getTempo___in() {
        return tempo___in;
    }
    public void setTempo___in(java.util.List<String> tempo___in) {
        this.tempo___in = tempo___in;
    }

    public java.util.List<String> getTempo___not___in() {
        return tempo___not___in;
    }
    public void setTempo___not___in(java.util.List<String> tempo___not___in) {
        this.tempo___not___in = tempo___not___in;
    }

    public String getTempo___lt() {
        return tempo___lt;
    }
    public void setTempo___lt(String tempo___lt) {
        this.tempo___lt = tempo___lt;
    }

    public String getTempo___lte() {
        return tempo___lte;
    }
    public void setTempo___lte(String tempo___lte) {
        this.tempo___lte = tempo___lte;
    }

    public String getTempo___gt() {
        return tempo___gt;
    }
    public void setTempo___gt(String tempo___gt) {
        this.tempo___gt = tempo___gt;
    }

    public String getTempo___gte() {
        return tempo___gte;
    }
    public void setTempo___gte(String tempo___gte) {
        this.tempo___gte = tempo___gte;
    }

    public String getTempo___contains() {
        return tempo___contains;
    }
    public void setTempo___contains(String tempo___contains) {
        this.tempo___contains = tempo___contains;
    }

    public String getTempo___not___contains() {
        return tempo___not___contains;
    }
    public void setTempo___not___contains(String tempo___not___contains) {
        this.tempo___not___contains = tempo___not___contains;
    }

    public String getTempo___starts_with() {
        return tempo___starts_with;
    }
    public void setTempo___starts_with(String tempo___starts_with) {
        this.tempo___starts_with = tempo___starts_with;
    }

    public String getTempo___not___starts_with() {
        return tempo___not___starts_with;
    }
    public void setTempo___not___starts_with(String tempo___not___starts_with) {
        this.tempo___not___starts_with = tempo___not___starts_with;
    }

    public String getTempo___ends_with() {
        return tempo___ends_with;
    }
    public void setTempo___ends_with(String tempo___ends_with) {
        this.tempo___ends_with = tempo___ends_with;
    }

    public String getTempo___not___ends_with() {
        return tempo___not___ends_with;
    }
    public void setTempo___not___ends_with(String tempo___not___ends_with) {
        this.tempo___not___ends_with = tempo___not___ends_with;
    }

    public String getTipo_sierologia___eq() {
        return tipo_sierologia___eq;
    }
    public void setTipo_sierologia___eq(String tipo_sierologia___eq) {
        this.tipo_sierologia___eq = tipo_sierologia___eq;
    }

    public String getTipo_sierologia___ne() {
        return tipo_sierologia___ne;
    }
    public void setTipo_sierologia___ne(String tipo_sierologia___ne) {
        this.tipo_sierologia___ne = tipo_sierologia___ne;
    }

    public Boolean getTipo_sierologia___null() {
        return tipo_sierologia___null;
    }
    public void setTipo_sierologia___null(Boolean tipo_sierologia___null) {
        this.tipo_sierologia___null = tipo_sierologia___null;
    }

    public Boolean getTipo_sierologia___not___null() {
        return tipo_sierologia___not___null;
    }
    public void setTipo_sierologia___not___null(Boolean tipo_sierologia___not___null) {
        this.tipo_sierologia___not___null = tipo_sierologia___not___null;
    }

    public java.util.List<String> getTipo_sierologia___in() {
        return tipo_sierologia___in;
    }
    public void setTipo_sierologia___in(java.util.List<String> tipo_sierologia___in) {
        this.tipo_sierologia___in = tipo_sierologia___in;
    }

    public java.util.List<String> getTipo_sierologia___not___in() {
        return tipo_sierologia___not___in;
    }
    public void setTipo_sierologia___not___in(java.util.List<String> tipo_sierologia___not___in) {
        this.tipo_sierologia___not___in = tipo_sierologia___not___in;
    }

    public String getTipo_sierologia___lt() {
        return tipo_sierologia___lt;
    }
    public void setTipo_sierologia___lt(String tipo_sierologia___lt) {
        this.tipo_sierologia___lt = tipo_sierologia___lt;
    }

    public String getTipo_sierologia___lte() {
        return tipo_sierologia___lte;
    }
    public void setTipo_sierologia___lte(String tipo_sierologia___lte) {
        this.tipo_sierologia___lte = tipo_sierologia___lte;
    }

    public String getTipo_sierologia___gt() {
        return tipo_sierologia___gt;
    }
    public void setTipo_sierologia___gt(String tipo_sierologia___gt) {
        this.tipo_sierologia___gt = tipo_sierologia___gt;
    }

    public String getTipo_sierologia___gte() {
        return tipo_sierologia___gte;
    }
    public void setTipo_sierologia___gte(String tipo_sierologia___gte) {
        this.tipo_sierologia___gte = tipo_sierologia___gte;
    }

    public String getTipo_sierologia___contains() {
        return tipo_sierologia___contains;
    }
    public void setTipo_sierologia___contains(String tipo_sierologia___contains) {
        this.tipo_sierologia___contains = tipo_sierologia___contains;
    }

    public String getTipo_sierologia___not___contains() {
        return tipo_sierologia___not___contains;
    }
    public void setTipo_sierologia___not___contains(String tipo_sierologia___not___contains) {
        this.tipo_sierologia___not___contains = tipo_sierologia___not___contains;
    }

    public String getTipo_sierologia___starts_with() {
        return tipo_sierologia___starts_with;
    }
    public void setTipo_sierologia___starts_with(String tipo_sierologia___starts_with) {
        this.tipo_sierologia___starts_with = tipo_sierologia___starts_with;
    }

    public String getTipo_sierologia___not___starts_with() {
        return tipo_sierologia___not___starts_with;
    }
    public void setTipo_sierologia___not___starts_with(String tipo_sierologia___not___starts_with) {
        this.tipo_sierologia___not___starts_with = tipo_sierologia___not___starts_with;
    }

    public String getTipo_sierologia___ends_with() {
        return tipo_sierologia___ends_with;
    }
    public void setTipo_sierologia___ends_with(String tipo_sierologia___ends_with) {
        this.tipo_sierologia___ends_with = tipo_sierologia___ends_with;
    }

    public String getTipo_sierologia___not___ends_with() {
        return tipo_sierologia___not___ends_with;
    }
    public void setTipo_sierologia___not___ends_with(String tipo_sierologia___not___ends_with) {
        this.tipo_sierologia___not___ends_with = tipo_sierologia___not___ends_with;
    }

    public String getValore___eq() {
        return valore___eq;
    }
    public void setValore___eq(String valore___eq) {
        this.valore___eq = valore___eq;
    }

    public String getValore___ne() {
        return valore___ne;
    }
    public void setValore___ne(String valore___ne) {
        this.valore___ne = valore___ne;
    }

    public Boolean getValore___null() {
        return valore___null;
    }
    public void setValore___null(Boolean valore___null) {
        this.valore___null = valore___null;
    }

    public Boolean getValore___not___null() {
        return valore___not___null;
    }
    public void setValore___not___null(Boolean valore___not___null) {
        this.valore___not___null = valore___not___null;
    }

    public java.util.List<String> getValore___in() {
        return valore___in;
    }
    public void setValore___in(java.util.List<String> valore___in) {
        this.valore___in = valore___in;
    }

    public java.util.List<String> getValore___not___in() {
        return valore___not___in;
    }
    public void setValore___not___in(java.util.List<String> valore___not___in) {
        this.valore___not___in = valore___not___in;
    }

    public String getValore___lt() {
        return valore___lt;
    }
    public void setValore___lt(String valore___lt) {
        this.valore___lt = valore___lt;
    }

    public String getValore___lte() {
        return valore___lte;
    }
    public void setValore___lte(String valore___lte) {
        this.valore___lte = valore___lte;
    }

    public String getValore___gt() {
        return valore___gt;
    }
    public void setValore___gt(String valore___gt) {
        this.valore___gt = valore___gt;
    }

    public String getValore___gte() {
        return valore___gte;
    }
    public void setValore___gte(String valore___gte) {
        this.valore___gte = valore___gte;
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

    public java.util.List<CliSierologie_covidFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliSierologie_covidFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliSierologie_covidFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliSierologie_covidFilterDTO> OR) {
        this.OR = OR;
    }

    public CliSierologie_covidFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliSierologie_covidFilterDTO NOT) {
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
        if (cc_id___eq != null) {
            joiner.add("cc_id___eq: " + GraphQLRequestSerializer.getEntry(cc_id___eq));
        }
        if (cc_id___ne != null) {
            joiner.add("cc_id___ne: " + GraphQLRequestSerializer.getEntry(cc_id___ne));
        }
        if (cc_id___null != null) {
            joiner.add("cc_id___null: " + GraphQLRequestSerializer.getEntry(cc_id___null));
        }
        if (cc_id___not___null != null) {
            joiner.add("cc_id___not___null: " + GraphQLRequestSerializer.getEntry(cc_id___not___null));
        }
        if (cc_id___in != null) {
            joiner.add("cc_id___in: " + GraphQLRequestSerializer.getEntry(cc_id___in));
        }
        if (cc_id___not___in != null) {
            joiner.add("cc_id___not___in: " + GraphQLRequestSerializer.getEntry(cc_id___not___in));
        }
        if (cc_id___lt != null) {
            joiner.add("cc_id___lt: " + GraphQLRequestSerializer.getEntry(cc_id___lt));
        }
        if (cc_id___lte != null) {
            joiner.add("cc_id___lte: " + GraphQLRequestSerializer.getEntry(cc_id___lte));
        }
        if (cc_id___gt != null) {
            joiner.add("cc_id___gt: " + GraphQLRequestSerializer.getEntry(cc_id___gt));
        }
        if (cc_id___gte != null) {
            joiner.add("cc_id___gte: " + GraphQLRequestSerializer.getEntry(cc_id___gte));
        }
        if (data_cc___eq != null) {
            joiner.add("data_cc___eq: " + GraphQLRequestSerializer.getEntry(data_cc___eq));
        }
        if (data_cc___ne != null) {
            joiner.add("data_cc___ne: " + GraphQLRequestSerializer.getEntry(data_cc___ne));
        }
        if (data_cc___null != null) {
            joiner.add("data_cc___null: " + GraphQLRequestSerializer.getEntry(data_cc___null));
        }
        if (data_cc___not___null != null) {
            joiner.add("data_cc___not___null: " + GraphQLRequestSerializer.getEntry(data_cc___not___null));
        }
        if (data_cc___in != null) {
            joiner.add("data_cc___in: " + GraphQLRequestSerializer.getEntry(data_cc___in));
        }
        if (data_cc___not___in != null) {
            joiner.add("data_cc___not___in: " + GraphQLRequestSerializer.getEntry(data_cc___not___in));
        }
        if (data_cc___lt != null) {
            joiner.add("data_cc___lt: " + GraphQLRequestSerializer.getEntry(data_cc___lt));
        }
        if (data_cc___lte != null) {
            joiner.add("data_cc___lte: " + GraphQLRequestSerializer.getEntry(data_cc___lte));
        }
        if (data_cc___gt != null) {
            joiner.add("data_cc___gt: " + GraphQLRequestSerializer.getEntry(data_cc___gt));
        }
        if (data_cc___gte != null) {
            joiner.add("data_cc___gte: " + GraphQLRequestSerializer.getEntry(data_cc___gte));
        }
        if (data_prelievo___eq != null) {
            joiner.add("data_prelievo___eq: " + GraphQLRequestSerializer.getEntry(data_prelievo___eq));
        }
        if (data_prelievo___ne != null) {
            joiner.add("data_prelievo___ne: " + GraphQLRequestSerializer.getEntry(data_prelievo___ne));
        }
        if (data_prelievo___null != null) {
            joiner.add("data_prelievo___null: " + GraphQLRequestSerializer.getEntry(data_prelievo___null));
        }
        if (data_prelievo___not___null != null) {
            joiner.add("data_prelievo___not___null: " + GraphQLRequestSerializer.getEntry(data_prelievo___not___null));
        }
        if (data_prelievo___in != null) {
            joiner.add("data_prelievo___in: " + GraphQLRequestSerializer.getEntry(data_prelievo___in));
        }
        if (data_prelievo___not___in != null) {
            joiner.add("data_prelievo___not___in: " + GraphQLRequestSerializer.getEntry(data_prelievo___not___in));
        }
        if (data_prelievo___lt != null) {
            joiner.add("data_prelievo___lt: " + GraphQLRequestSerializer.getEntry(data_prelievo___lt));
        }
        if (data_prelievo___lte != null) {
            joiner.add("data_prelievo___lte: " + GraphQLRequestSerializer.getEntry(data_prelievo___lte));
        }
        if (data_prelievo___gt != null) {
            joiner.add("data_prelievo___gt: " + GraphQLRequestSerializer.getEntry(data_prelievo___gt));
        }
        if (data_prelievo___gte != null) {
            joiner.add("data_prelievo___gte: " + GraphQLRequestSerializer.getEntry(data_prelievo___gte));
        }
        if (esito___eq != null) {
            joiner.add("esito___eq: " + GraphQLRequestSerializer.getEntry(esito___eq));
        }
        if (esito___ne != null) {
            joiner.add("esito___ne: " + GraphQLRequestSerializer.getEntry(esito___ne));
        }
        if (esito___null != null) {
            joiner.add("esito___null: " + GraphQLRequestSerializer.getEntry(esito___null));
        }
        if (esito___not___null != null) {
            joiner.add("esito___not___null: " + GraphQLRequestSerializer.getEntry(esito___not___null));
        }
        if (metodica___eq != null) {
            joiner.add("metodica___eq: " + GraphQLRequestSerializer.getEntry(metodica___eq));
        }
        if (metodica___ne != null) {
            joiner.add("metodica___ne: " + GraphQLRequestSerializer.getEntry(metodica___ne));
        }
        if (metodica___null != null) {
            joiner.add("metodica___null: " + GraphQLRequestSerializer.getEntry(metodica___null));
        }
        if (metodica___not___null != null) {
            joiner.add("metodica___not___null: " + GraphQLRequestSerializer.getEntry(metodica___not___null));
        }
        if (metodica___in != null) {
            joiner.add("metodica___in: " + GraphQLRequestSerializer.getEntry(metodica___in));
        }
        if (metodica___not___in != null) {
            joiner.add("metodica___not___in: " + GraphQLRequestSerializer.getEntry(metodica___not___in));
        }
        if (metodica___lt != null) {
            joiner.add("metodica___lt: " + GraphQLRequestSerializer.getEntry(metodica___lt));
        }
        if (metodica___lte != null) {
            joiner.add("metodica___lte: " + GraphQLRequestSerializer.getEntry(metodica___lte));
        }
        if (metodica___gt != null) {
            joiner.add("metodica___gt: " + GraphQLRequestSerializer.getEntry(metodica___gt));
        }
        if (metodica___gte != null) {
            joiner.add("metodica___gte: " + GraphQLRequestSerializer.getEntry(metodica___gte));
        }
        if (metodica___contains != null) {
            joiner.add("metodica___contains: " + GraphQLRequestSerializer.getEntry(metodica___contains));
        }
        if (metodica___not___contains != null) {
            joiner.add("metodica___not___contains: " + GraphQLRequestSerializer.getEntry(metodica___not___contains));
        }
        if (metodica___starts_with != null) {
            joiner.add("metodica___starts_with: " + GraphQLRequestSerializer.getEntry(metodica___starts_with));
        }
        if (metodica___not___starts_with != null) {
            joiner.add("metodica___not___starts_with: " + GraphQLRequestSerializer.getEntry(metodica___not___starts_with));
        }
        if (metodica___ends_with != null) {
            joiner.add("metodica___ends_with: " + GraphQLRequestSerializer.getEntry(metodica___ends_with));
        }
        if (metodica___not___ends_with != null) {
            joiner.add("metodica___not___ends_with: " + GraphQLRequestSerializer.getEntry(metodica___not___ends_with));
        }
        if (solo_esito___eq != null) {
            joiner.add("solo_esito___eq: " + GraphQLRequestSerializer.getEntry(solo_esito___eq));
        }
        if (solo_esito___ne != null) {
            joiner.add("solo_esito___ne: " + GraphQLRequestSerializer.getEntry(solo_esito___ne));
        }
        if (solo_esito___null != null) {
            joiner.add("solo_esito___null: " + GraphQLRequestSerializer.getEntry(solo_esito___null));
        }
        if (solo_esito___not___null != null) {
            joiner.add("solo_esito___not___null: " + GraphQLRequestSerializer.getEntry(solo_esito___not___null));
        }
        if (tempo___eq != null) {
            joiner.add("tempo___eq: " + GraphQLRequestSerializer.getEntry(tempo___eq));
        }
        if (tempo___ne != null) {
            joiner.add("tempo___ne: " + GraphQLRequestSerializer.getEntry(tempo___ne));
        }
        if (tempo___null != null) {
            joiner.add("tempo___null: " + GraphQLRequestSerializer.getEntry(tempo___null));
        }
        if (tempo___not___null != null) {
            joiner.add("tempo___not___null: " + GraphQLRequestSerializer.getEntry(tempo___not___null));
        }
        if (tempo___in != null) {
            joiner.add("tempo___in: " + GraphQLRequestSerializer.getEntry(tempo___in));
        }
        if (tempo___not___in != null) {
            joiner.add("tempo___not___in: " + GraphQLRequestSerializer.getEntry(tempo___not___in));
        }
        if (tempo___lt != null) {
            joiner.add("tempo___lt: " + GraphQLRequestSerializer.getEntry(tempo___lt));
        }
        if (tempo___lte != null) {
            joiner.add("tempo___lte: " + GraphQLRequestSerializer.getEntry(tempo___lte));
        }
        if (tempo___gt != null) {
            joiner.add("tempo___gt: " + GraphQLRequestSerializer.getEntry(tempo___gt));
        }
        if (tempo___gte != null) {
            joiner.add("tempo___gte: " + GraphQLRequestSerializer.getEntry(tempo___gte));
        }
        if (tempo___contains != null) {
            joiner.add("tempo___contains: " + GraphQLRequestSerializer.getEntry(tempo___contains));
        }
        if (tempo___not___contains != null) {
            joiner.add("tempo___not___contains: " + GraphQLRequestSerializer.getEntry(tempo___not___contains));
        }
        if (tempo___starts_with != null) {
            joiner.add("tempo___starts_with: " + GraphQLRequestSerializer.getEntry(tempo___starts_with));
        }
        if (tempo___not___starts_with != null) {
            joiner.add("tempo___not___starts_with: " + GraphQLRequestSerializer.getEntry(tempo___not___starts_with));
        }
        if (tempo___ends_with != null) {
            joiner.add("tempo___ends_with: " + GraphQLRequestSerializer.getEntry(tempo___ends_with));
        }
        if (tempo___not___ends_with != null) {
            joiner.add("tempo___not___ends_with: " + GraphQLRequestSerializer.getEntry(tempo___not___ends_with));
        }
        if (tipo_sierologia___eq != null) {
            joiner.add("tipo_sierologia___eq: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___eq));
        }
        if (tipo_sierologia___ne != null) {
            joiner.add("tipo_sierologia___ne: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___ne));
        }
        if (tipo_sierologia___null != null) {
            joiner.add("tipo_sierologia___null: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___null));
        }
        if (tipo_sierologia___not___null != null) {
            joiner.add("tipo_sierologia___not___null: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___not___null));
        }
        if (tipo_sierologia___in != null) {
            joiner.add("tipo_sierologia___in: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___in));
        }
        if (tipo_sierologia___not___in != null) {
            joiner.add("tipo_sierologia___not___in: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___not___in));
        }
        if (tipo_sierologia___lt != null) {
            joiner.add("tipo_sierologia___lt: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___lt));
        }
        if (tipo_sierologia___lte != null) {
            joiner.add("tipo_sierologia___lte: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___lte));
        }
        if (tipo_sierologia___gt != null) {
            joiner.add("tipo_sierologia___gt: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___gt));
        }
        if (tipo_sierologia___gte != null) {
            joiner.add("tipo_sierologia___gte: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___gte));
        }
        if (tipo_sierologia___contains != null) {
            joiner.add("tipo_sierologia___contains: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___contains));
        }
        if (tipo_sierologia___not___contains != null) {
            joiner.add("tipo_sierologia___not___contains: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___not___contains));
        }
        if (tipo_sierologia___starts_with != null) {
            joiner.add("tipo_sierologia___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___starts_with));
        }
        if (tipo_sierologia___not___starts_with != null) {
            joiner.add("tipo_sierologia___not___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___not___starts_with));
        }
        if (tipo_sierologia___ends_with != null) {
            joiner.add("tipo_sierologia___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___ends_with));
        }
        if (tipo_sierologia___not___ends_with != null) {
            joiner.add("tipo_sierologia___not___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_sierologia___not___ends_with));
        }
        if (valore___eq != null) {
            joiner.add("valore___eq: " + GraphQLRequestSerializer.getEntry(valore___eq));
        }
        if (valore___ne != null) {
            joiner.add("valore___ne: " + GraphQLRequestSerializer.getEntry(valore___ne));
        }
        if (valore___null != null) {
            joiner.add("valore___null: " + GraphQLRequestSerializer.getEntry(valore___null));
        }
        if (valore___not___null != null) {
            joiner.add("valore___not___null: " + GraphQLRequestSerializer.getEntry(valore___not___null));
        }
        if (valore___in != null) {
            joiner.add("valore___in: " + GraphQLRequestSerializer.getEntry(valore___in));
        }
        if (valore___not___in != null) {
            joiner.add("valore___not___in: " + GraphQLRequestSerializer.getEntry(valore___not___in));
        }
        if (valore___lt != null) {
            joiner.add("valore___lt: " + GraphQLRequestSerializer.getEntry(valore___lt));
        }
        if (valore___lte != null) {
            joiner.add("valore___lte: " + GraphQLRequestSerializer.getEntry(valore___lte));
        }
        if (valore___gt != null) {
            joiner.add("valore___gt: " + GraphQLRequestSerializer.getEntry(valore___gt));
        }
        if (valore___gte != null) {
            joiner.add("valore___gte: " + GraphQLRequestSerializer.getEntry(valore___gte));
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

    public static CliSierologie_covidFilterDTO.Builder builder() {
        return new CliSierologie_covidFilterDTO.Builder();
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
        private Integer cc_id___eq;
        private Integer cc_id___ne;
        private Boolean cc_id___null;
        private Boolean cc_id___not___null;
        private java.util.List<Integer> cc_id___in;
        private java.util.List<Integer> cc_id___not___in;
        private Integer cc_id___lt;
        private Integer cc_id___lte;
        private Integer cc_id___gt;
        private Integer cc_id___gte;
        private String data_cc___eq;
        private String data_cc___ne;
        private Boolean data_cc___null;
        private Boolean data_cc___not___null;
        private java.util.List<String> data_cc___in;
        private java.util.List<String> data_cc___not___in;
        private String data_cc___lt;
        private String data_cc___lte;
        private String data_cc___gt;
        private String data_cc___gte;
        private String data_prelievo___eq;
        private String data_prelievo___ne;
        private Boolean data_prelievo___null;
        private Boolean data_prelievo___not___null;
        private java.util.List<String> data_prelievo___in;
        private java.util.List<String> data_prelievo___not___in;
        private String data_prelievo___lt;
        private String data_prelievo___lte;
        private String data_prelievo___gt;
        private String data_prelievo___gte;
        private Boolean esito___eq;
        private Boolean esito___ne;
        private Boolean esito___null;
        private Boolean esito___not___null;
        private String metodica___eq;
        private String metodica___ne;
        private Boolean metodica___null;
        private Boolean metodica___not___null;
        private java.util.List<String> metodica___in;
        private java.util.List<String> metodica___not___in;
        private String metodica___lt;
        private String metodica___lte;
        private String metodica___gt;
        private String metodica___gte;
        private String metodica___contains;
        private String metodica___not___contains;
        private String metodica___starts_with;
        private String metodica___not___starts_with;
        private String metodica___ends_with;
        private String metodica___not___ends_with;
        private Boolean solo_esito___eq;
        private Boolean solo_esito___ne;
        private Boolean solo_esito___null;
        private Boolean solo_esito___not___null;
        private String tempo___eq;
        private String tempo___ne;
        private Boolean tempo___null;
        private Boolean tempo___not___null;
        private java.util.List<String> tempo___in;
        private java.util.List<String> tempo___not___in;
        private String tempo___lt;
        private String tempo___lte;
        private String tempo___gt;
        private String tempo___gte;
        private String tempo___contains;
        private String tempo___not___contains;
        private String tempo___starts_with;
        private String tempo___not___starts_with;
        private String tempo___ends_with;
        private String tempo___not___ends_with;
        private String tipo_sierologia___eq;
        private String tipo_sierologia___ne;
        private Boolean tipo_sierologia___null;
        private Boolean tipo_sierologia___not___null;
        private java.util.List<String> tipo_sierologia___in;
        private java.util.List<String> tipo_sierologia___not___in;
        private String tipo_sierologia___lt;
        private String tipo_sierologia___lte;
        private String tipo_sierologia___gt;
        private String tipo_sierologia___gte;
        private String tipo_sierologia___contains;
        private String tipo_sierologia___not___contains;
        private String tipo_sierologia___starts_with;
        private String tipo_sierologia___not___starts_with;
        private String tipo_sierologia___ends_with;
        private String tipo_sierologia___not___ends_with;
        private String valore___eq;
        private String valore___ne;
        private Boolean valore___null;
        private Boolean valore___not___null;
        private java.util.List<String> valore___in;
        private java.util.List<String> valore___not___in;
        private String valore___lt;
        private String valore___lte;
        private String valore___gt;
        private String valore___gte;
        private Boolean vax_ico___eq;
        private Boolean vax_ico___ne;
        private Boolean vax_ico___null;
        private Boolean vax_ico___not___null;
        private java.util.List<CliSierologie_covidFilterDTO> AND;
        private java.util.List<CliSierologie_covidFilterDTO> OR;
        private CliSierologie_covidFilterDTO NOT;

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

        public Builder setCc_id___eq(Integer cc_id___eq) {
            this.cc_id___eq = cc_id___eq;
            return this;
        }

        public Builder setCc_id___ne(Integer cc_id___ne) {
            this.cc_id___ne = cc_id___ne;
            return this;
        }

        public Builder setCc_id___null(Boolean cc_id___null) {
            this.cc_id___null = cc_id___null;
            return this;
        }

        public Builder setCc_id___not___null(Boolean cc_id___not___null) {
            this.cc_id___not___null = cc_id___not___null;
            return this;
        }

        public Builder setCc_id___in(java.util.List<Integer> cc_id___in) {
            this.cc_id___in = cc_id___in;
            return this;
        }

        public Builder setCc_id___not___in(java.util.List<Integer> cc_id___not___in) {
            this.cc_id___not___in = cc_id___not___in;
            return this;
        }

        public Builder setCc_id___lt(Integer cc_id___lt) {
            this.cc_id___lt = cc_id___lt;
            return this;
        }

        public Builder setCc_id___lte(Integer cc_id___lte) {
            this.cc_id___lte = cc_id___lte;
            return this;
        }

        public Builder setCc_id___gt(Integer cc_id___gt) {
            this.cc_id___gt = cc_id___gt;
            return this;
        }

        public Builder setCc_id___gte(Integer cc_id___gte) {
            this.cc_id___gte = cc_id___gte;
            return this;
        }

        public Builder setData_cc___eq(String data_cc___eq) {
            this.data_cc___eq = data_cc___eq;
            return this;
        }

        public Builder setData_cc___ne(String data_cc___ne) {
            this.data_cc___ne = data_cc___ne;
            return this;
        }

        public Builder setData_cc___null(Boolean data_cc___null) {
            this.data_cc___null = data_cc___null;
            return this;
        }

        public Builder setData_cc___not___null(Boolean data_cc___not___null) {
            this.data_cc___not___null = data_cc___not___null;
            return this;
        }

        public Builder setData_cc___in(java.util.List<String> data_cc___in) {
            this.data_cc___in = data_cc___in;
            return this;
        }

        public Builder setData_cc___not___in(java.util.List<String> data_cc___not___in) {
            this.data_cc___not___in = data_cc___not___in;
            return this;
        }

        public Builder setData_cc___lt(String data_cc___lt) {
            this.data_cc___lt = data_cc___lt;
            return this;
        }

        public Builder setData_cc___lte(String data_cc___lte) {
            this.data_cc___lte = data_cc___lte;
            return this;
        }

        public Builder setData_cc___gt(String data_cc___gt) {
            this.data_cc___gt = data_cc___gt;
            return this;
        }

        public Builder setData_cc___gte(String data_cc___gte) {
            this.data_cc___gte = data_cc___gte;
            return this;
        }

        public Builder setData_prelievo___eq(String data_prelievo___eq) {
            this.data_prelievo___eq = data_prelievo___eq;
            return this;
        }

        public Builder setData_prelievo___ne(String data_prelievo___ne) {
            this.data_prelievo___ne = data_prelievo___ne;
            return this;
        }

        public Builder setData_prelievo___null(Boolean data_prelievo___null) {
            this.data_prelievo___null = data_prelievo___null;
            return this;
        }

        public Builder setData_prelievo___not___null(Boolean data_prelievo___not___null) {
            this.data_prelievo___not___null = data_prelievo___not___null;
            return this;
        }

        public Builder setData_prelievo___in(java.util.List<String> data_prelievo___in) {
            this.data_prelievo___in = data_prelievo___in;
            return this;
        }

        public Builder setData_prelievo___not___in(java.util.List<String> data_prelievo___not___in) {
            this.data_prelievo___not___in = data_prelievo___not___in;
            return this;
        }

        public Builder setData_prelievo___lt(String data_prelievo___lt) {
            this.data_prelievo___lt = data_prelievo___lt;
            return this;
        }

        public Builder setData_prelievo___lte(String data_prelievo___lte) {
            this.data_prelievo___lte = data_prelievo___lte;
            return this;
        }

        public Builder setData_prelievo___gt(String data_prelievo___gt) {
            this.data_prelievo___gt = data_prelievo___gt;
            return this;
        }

        public Builder setData_prelievo___gte(String data_prelievo___gte) {
            this.data_prelievo___gte = data_prelievo___gte;
            return this;
        }

        public Builder setEsito___eq(Boolean esito___eq) {
            this.esito___eq = esito___eq;
            return this;
        }

        public Builder setEsito___ne(Boolean esito___ne) {
            this.esito___ne = esito___ne;
            return this;
        }

        public Builder setEsito___null(Boolean esito___null) {
            this.esito___null = esito___null;
            return this;
        }

        public Builder setEsito___not___null(Boolean esito___not___null) {
            this.esito___not___null = esito___not___null;
            return this;
        }

        public Builder setMetodica___eq(String metodica___eq) {
            this.metodica___eq = metodica___eq;
            return this;
        }

        public Builder setMetodica___ne(String metodica___ne) {
            this.metodica___ne = metodica___ne;
            return this;
        }

        public Builder setMetodica___null(Boolean metodica___null) {
            this.metodica___null = metodica___null;
            return this;
        }

        public Builder setMetodica___not___null(Boolean metodica___not___null) {
            this.metodica___not___null = metodica___not___null;
            return this;
        }

        public Builder setMetodica___in(java.util.List<String> metodica___in) {
            this.metodica___in = metodica___in;
            return this;
        }

        public Builder setMetodica___not___in(java.util.List<String> metodica___not___in) {
            this.metodica___not___in = metodica___not___in;
            return this;
        }

        public Builder setMetodica___lt(String metodica___lt) {
            this.metodica___lt = metodica___lt;
            return this;
        }

        public Builder setMetodica___lte(String metodica___lte) {
            this.metodica___lte = metodica___lte;
            return this;
        }

        public Builder setMetodica___gt(String metodica___gt) {
            this.metodica___gt = metodica___gt;
            return this;
        }

        public Builder setMetodica___gte(String metodica___gte) {
            this.metodica___gte = metodica___gte;
            return this;
        }

        public Builder setMetodica___contains(String metodica___contains) {
            this.metodica___contains = metodica___contains;
            return this;
        }

        public Builder setMetodica___not___contains(String metodica___not___contains) {
            this.metodica___not___contains = metodica___not___contains;
            return this;
        }

        public Builder setMetodica___starts_with(String metodica___starts_with) {
            this.metodica___starts_with = metodica___starts_with;
            return this;
        }

        public Builder setMetodica___not___starts_with(String metodica___not___starts_with) {
            this.metodica___not___starts_with = metodica___not___starts_with;
            return this;
        }

        public Builder setMetodica___ends_with(String metodica___ends_with) {
            this.metodica___ends_with = metodica___ends_with;
            return this;
        }

        public Builder setMetodica___not___ends_with(String metodica___not___ends_with) {
            this.metodica___not___ends_with = metodica___not___ends_with;
            return this;
        }

        public Builder setSolo_esito___eq(Boolean solo_esito___eq) {
            this.solo_esito___eq = solo_esito___eq;
            return this;
        }

        public Builder setSolo_esito___ne(Boolean solo_esito___ne) {
            this.solo_esito___ne = solo_esito___ne;
            return this;
        }

        public Builder setSolo_esito___null(Boolean solo_esito___null) {
            this.solo_esito___null = solo_esito___null;
            return this;
        }

        public Builder setSolo_esito___not___null(Boolean solo_esito___not___null) {
            this.solo_esito___not___null = solo_esito___not___null;
            return this;
        }

        public Builder setTempo___eq(String tempo___eq) {
            this.tempo___eq = tempo___eq;
            return this;
        }

        public Builder setTempo___ne(String tempo___ne) {
            this.tempo___ne = tempo___ne;
            return this;
        }

        public Builder setTempo___null(Boolean tempo___null) {
            this.tempo___null = tempo___null;
            return this;
        }

        public Builder setTempo___not___null(Boolean tempo___not___null) {
            this.tempo___not___null = tempo___not___null;
            return this;
        }

        public Builder setTempo___in(java.util.List<String> tempo___in) {
            this.tempo___in = tempo___in;
            return this;
        }

        public Builder setTempo___not___in(java.util.List<String> tempo___not___in) {
            this.tempo___not___in = tempo___not___in;
            return this;
        }

        public Builder setTempo___lt(String tempo___lt) {
            this.tempo___lt = tempo___lt;
            return this;
        }

        public Builder setTempo___lte(String tempo___lte) {
            this.tempo___lte = tempo___lte;
            return this;
        }

        public Builder setTempo___gt(String tempo___gt) {
            this.tempo___gt = tempo___gt;
            return this;
        }

        public Builder setTempo___gte(String tempo___gte) {
            this.tempo___gte = tempo___gte;
            return this;
        }

        public Builder setTempo___contains(String tempo___contains) {
            this.tempo___contains = tempo___contains;
            return this;
        }

        public Builder setTempo___not___contains(String tempo___not___contains) {
            this.tempo___not___contains = tempo___not___contains;
            return this;
        }

        public Builder setTempo___starts_with(String tempo___starts_with) {
            this.tempo___starts_with = tempo___starts_with;
            return this;
        }

        public Builder setTempo___not___starts_with(String tempo___not___starts_with) {
            this.tempo___not___starts_with = tempo___not___starts_with;
            return this;
        }

        public Builder setTempo___ends_with(String tempo___ends_with) {
            this.tempo___ends_with = tempo___ends_with;
            return this;
        }

        public Builder setTempo___not___ends_with(String tempo___not___ends_with) {
            this.tempo___not___ends_with = tempo___not___ends_with;
            return this;
        }

        public Builder setTipo_sierologia___eq(String tipo_sierologia___eq) {
            this.tipo_sierologia___eq = tipo_sierologia___eq;
            return this;
        }

        public Builder setTipo_sierologia___ne(String tipo_sierologia___ne) {
            this.tipo_sierologia___ne = tipo_sierologia___ne;
            return this;
        }

        public Builder setTipo_sierologia___null(Boolean tipo_sierologia___null) {
            this.tipo_sierologia___null = tipo_sierologia___null;
            return this;
        }

        public Builder setTipo_sierologia___not___null(Boolean tipo_sierologia___not___null) {
            this.tipo_sierologia___not___null = tipo_sierologia___not___null;
            return this;
        }

        public Builder setTipo_sierologia___in(java.util.List<String> tipo_sierologia___in) {
            this.tipo_sierologia___in = tipo_sierologia___in;
            return this;
        }

        public Builder setTipo_sierologia___not___in(java.util.List<String> tipo_sierologia___not___in) {
            this.tipo_sierologia___not___in = tipo_sierologia___not___in;
            return this;
        }

        public Builder setTipo_sierologia___lt(String tipo_sierologia___lt) {
            this.tipo_sierologia___lt = tipo_sierologia___lt;
            return this;
        }

        public Builder setTipo_sierologia___lte(String tipo_sierologia___lte) {
            this.tipo_sierologia___lte = tipo_sierologia___lte;
            return this;
        }

        public Builder setTipo_sierologia___gt(String tipo_sierologia___gt) {
            this.tipo_sierologia___gt = tipo_sierologia___gt;
            return this;
        }

        public Builder setTipo_sierologia___gte(String tipo_sierologia___gte) {
            this.tipo_sierologia___gte = tipo_sierologia___gte;
            return this;
        }

        public Builder setTipo_sierologia___contains(String tipo_sierologia___contains) {
            this.tipo_sierologia___contains = tipo_sierologia___contains;
            return this;
        }

        public Builder setTipo_sierologia___not___contains(String tipo_sierologia___not___contains) {
            this.tipo_sierologia___not___contains = tipo_sierologia___not___contains;
            return this;
        }

        public Builder setTipo_sierologia___starts_with(String tipo_sierologia___starts_with) {
            this.tipo_sierologia___starts_with = tipo_sierologia___starts_with;
            return this;
        }

        public Builder setTipo_sierologia___not___starts_with(String tipo_sierologia___not___starts_with) {
            this.tipo_sierologia___not___starts_with = tipo_sierologia___not___starts_with;
            return this;
        }

        public Builder setTipo_sierologia___ends_with(String tipo_sierologia___ends_with) {
            this.tipo_sierologia___ends_with = tipo_sierologia___ends_with;
            return this;
        }

        public Builder setTipo_sierologia___not___ends_with(String tipo_sierologia___not___ends_with) {
            this.tipo_sierologia___not___ends_with = tipo_sierologia___not___ends_with;
            return this;
        }

        public Builder setValore___eq(String valore___eq) {
            this.valore___eq = valore___eq;
            return this;
        }

        public Builder setValore___ne(String valore___ne) {
            this.valore___ne = valore___ne;
            return this;
        }

        public Builder setValore___null(Boolean valore___null) {
            this.valore___null = valore___null;
            return this;
        }

        public Builder setValore___not___null(Boolean valore___not___null) {
            this.valore___not___null = valore___not___null;
            return this;
        }

        public Builder setValore___in(java.util.List<String> valore___in) {
            this.valore___in = valore___in;
            return this;
        }

        public Builder setValore___not___in(java.util.List<String> valore___not___in) {
            this.valore___not___in = valore___not___in;
            return this;
        }

        public Builder setValore___lt(String valore___lt) {
            this.valore___lt = valore___lt;
            return this;
        }

        public Builder setValore___lte(String valore___lte) {
            this.valore___lte = valore___lte;
            return this;
        }

        public Builder setValore___gt(String valore___gt) {
            this.valore___gt = valore___gt;
            return this;
        }

        public Builder setValore___gte(String valore___gte) {
            this.valore___gte = valore___gte;
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

        public Builder setAND(java.util.List<CliSierologie_covidFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliSierologie_covidFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliSierologie_covidFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliSierologie_covidFilterDTO build() {
            CliSierologie_covidFilterDTO result = new CliSierologie_covidFilterDTO();
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
            result.setCc_id___eq(this.cc_id___eq);
            result.setCc_id___ne(this.cc_id___ne);
            result.setCc_id___null(this.cc_id___null);
            result.setCc_id___not___null(this.cc_id___not___null);
            result.setCc_id___in(this.cc_id___in);
            result.setCc_id___not___in(this.cc_id___not___in);
            result.setCc_id___lt(this.cc_id___lt);
            result.setCc_id___lte(this.cc_id___lte);
            result.setCc_id___gt(this.cc_id___gt);
            result.setCc_id___gte(this.cc_id___gte);
            result.setData_cc___eq(this.data_cc___eq);
            result.setData_cc___ne(this.data_cc___ne);
            result.setData_cc___null(this.data_cc___null);
            result.setData_cc___not___null(this.data_cc___not___null);
            result.setData_cc___in(this.data_cc___in);
            result.setData_cc___not___in(this.data_cc___not___in);
            result.setData_cc___lt(this.data_cc___lt);
            result.setData_cc___lte(this.data_cc___lte);
            result.setData_cc___gt(this.data_cc___gt);
            result.setData_cc___gte(this.data_cc___gte);
            result.setData_prelievo___eq(this.data_prelievo___eq);
            result.setData_prelievo___ne(this.data_prelievo___ne);
            result.setData_prelievo___null(this.data_prelievo___null);
            result.setData_prelievo___not___null(this.data_prelievo___not___null);
            result.setData_prelievo___in(this.data_prelievo___in);
            result.setData_prelievo___not___in(this.data_prelievo___not___in);
            result.setData_prelievo___lt(this.data_prelievo___lt);
            result.setData_prelievo___lte(this.data_prelievo___lte);
            result.setData_prelievo___gt(this.data_prelievo___gt);
            result.setData_prelievo___gte(this.data_prelievo___gte);
            result.setEsito___eq(this.esito___eq);
            result.setEsito___ne(this.esito___ne);
            result.setEsito___null(this.esito___null);
            result.setEsito___not___null(this.esito___not___null);
            result.setMetodica___eq(this.metodica___eq);
            result.setMetodica___ne(this.metodica___ne);
            result.setMetodica___null(this.metodica___null);
            result.setMetodica___not___null(this.metodica___not___null);
            result.setMetodica___in(this.metodica___in);
            result.setMetodica___not___in(this.metodica___not___in);
            result.setMetodica___lt(this.metodica___lt);
            result.setMetodica___lte(this.metodica___lte);
            result.setMetodica___gt(this.metodica___gt);
            result.setMetodica___gte(this.metodica___gte);
            result.setMetodica___contains(this.metodica___contains);
            result.setMetodica___not___contains(this.metodica___not___contains);
            result.setMetodica___starts_with(this.metodica___starts_with);
            result.setMetodica___not___starts_with(this.metodica___not___starts_with);
            result.setMetodica___ends_with(this.metodica___ends_with);
            result.setMetodica___not___ends_with(this.metodica___not___ends_with);
            result.setSolo_esito___eq(this.solo_esito___eq);
            result.setSolo_esito___ne(this.solo_esito___ne);
            result.setSolo_esito___null(this.solo_esito___null);
            result.setSolo_esito___not___null(this.solo_esito___not___null);
            result.setTempo___eq(this.tempo___eq);
            result.setTempo___ne(this.tempo___ne);
            result.setTempo___null(this.tempo___null);
            result.setTempo___not___null(this.tempo___not___null);
            result.setTempo___in(this.tempo___in);
            result.setTempo___not___in(this.tempo___not___in);
            result.setTempo___lt(this.tempo___lt);
            result.setTempo___lte(this.tempo___lte);
            result.setTempo___gt(this.tempo___gt);
            result.setTempo___gte(this.tempo___gte);
            result.setTempo___contains(this.tempo___contains);
            result.setTempo___not___contains(this.tempo___not___contains);
            result.setTempo___starts_with(this.tempo___starts_with);
            result.setTempo___not___starts_with(this.tempo___not___starts_with);
            result.setTempo___ends_with(this.tempo___ends_with);
            result.setTempo___not___ends_with(this.tempo___not___ends_with);
            result.setTipo_sierologia___eq(this.tipo_sierologia___eq);
            result.setTipo_sierologia___ne(this.tipo_sierologia___ne);
            result.setTipo_sierologia___null(this.tipo_sierologia___null);
            result.setTipo_sierologia___not___null(this.tipo_sierologia___not___null);
            result.setTipo_sierologia___in(this.tipo_sierologia___in);
            result.setTipo_sierologia___not___in(this.tipo_sierologia___not___in);
            result.setTipo_sierologia___lt(this.tipo_sierologia___lt);
            result.setTipo_sierologia___lte(this.tipo_sierologia___lte);
            result.setTipo_sierologia___gt(this.tipo_sierologia___gt);
            result.setTipo_sierologia___gte(this.tipo_sierologia___gte);
            result.setTipo_sierologia___contains(this.tipo_sierologia___contains);
            result.setTipo_sierologia___not___contains(this.tipo_sierologia___not___contains);
            result.setTipo_sierologia___starts_with(this.tipo_sierologia___starts_with);
            result.setTipo_sierologia___not___starts_with(this.tipo_sierologia___not___starts_with);
            result.setTipo_sierologia___ends_with(this.tipo_sierologia___ends_with);
            result.setTipo_sierologia___not___ends_with(this.tipo_sierologia___not___ends_with);
            result.setValore___eq(this.valore___eq);
            result.setValore___ne(this.valore___ne);
            result.setValore___null(this.valore___null);
            result.setValore___not___null(this.valore___not___null);
            result.setValore___in(this.valore___in);
            result.setValore___not___in(this.valore___not___in);
            result.setValore___lt(this.valore___lt);
            result.setValore___lte(this.valore___lte);
            result.setValore___gt(this.valore___gt);
            result.setValore___gte(this.valore___gte);
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
