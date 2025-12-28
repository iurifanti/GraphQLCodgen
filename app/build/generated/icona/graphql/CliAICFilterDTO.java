package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type AIC.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliAICFilterDTO implements java.io.Serializable {

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
    private String azienda___eq;
    private String azienda___ne;
    private Boolean azienda___null;
    private Boolean azienda___not___null;
    private java.util.List<String> azienda___in;
    private java.util.List<String> azienda___not___in;
    private String azienda___lt;
    private String azienda___lte;
    private String azienda___gt;
    private String azienda___gte;
    private String azienda___contains;
    private String azienda___not___contains;
    private String azienda___starts_with;
    private String azienda___not___starts_with;
    private String azienda___ends_with;
    private String azienda___not___ends_with;
    private String codice___eq;
    private String codice___ne;
    private Boolean codice___null;
    private Boolean codice___not___null;
    private java.util.List<String> codice___in;
    private java.util.List<String> codice___not___in;
    private String codice___lt;
    private String codice___lte;
    private String codice___gt;
    private String codice___gte;
    private String codice___contains;
    private String codice___not___contains;
    private String codice___starts_with;
    private String codice___not___starts_with;
    private String codice___ends_with;
    private String codice___not___ends_with;
    private String confezione___eq;
    private String confezione___ne;
    private Boolean confezione___null;
    private Boolean confezione___not___null;
    private java.util.List<String> confezione___in;
    private java.util.List<String> confezione___not___in;
    private String confezione___lt;
    private String confezione___lte;
    private String confezione___gt;
    private String confezione___gte;
    private String confezione___contains;
    private String confezione___not___contains;
    private String confezione___starts_with;
    private String confezione___not___starts_with;
    private String confezione___ends_with;
    private String confezione___not___ends_with;
    private String data_fine_commercio___eq;
    private String data_fine_commercio___ne;
    private Boolean data_fine_commercio___null;
    private Boolean data_fine_commercio___not___null;
    private java.util.List<String> data_fine_commercio___in;
    private java.util.List<String> data_fine_commercio___not___in;
    private String data_fine_commercio___lt;
    private String data_fine_commercio___lte;
    private String data_fine_commercio___gt;
    private String data_fine_commercio___gte;
    private String data_fine_commercio___contains;
    private String data_fine_commercio___not___contains;
    private String data_fine_commercio___starts_with;
    private String data_fine_commercio___not___starts_with;
    private String data_fine_commercio___ends_with;
    private String data_fine_commercio___not___ends_with;
    private String data_fine_validita_aic___eq;
    private String data_fine_validita_aic___ne;
    private Boolean data_fine_validita_aic___null;
    private Boolean data_fine_validita_aic___not___null;
    private java.util.List<String> data_fine_validita_aic___in;
    private java.util.List<String> data_fine_validita_aic___not___in;
    private String data_fine_validita_aic___lt;
    private String data_fine_validita_aic___lte;
    private String data_fine_validita_aic___gt;
    private String data_fine_validita_aic___gte;
    private String data_fine_validita_aic___contains;
    private String data_fine_validita_aic___not___contains;
    private String data_fine_validita_aic___starts_with;
    private String data_fine_validita_aic___not___starts_with;
    private String data_fine_validita_aic___ends_with;
    private String data_fine_validita_aic___not___ends_with;
    private String data_inizio_commercio___eq;
    private String data_inizio_commercio___ne;
    private Boolean data_inizio_commercio___null;
    private Boolean data_inizio_commercio___not___null;
    private java.util.List<String> data_inizio_commercio___in;
    private java.util.List<String> data_inizio_commercio___not___in;
    private String data_inizio_commercio___lt;
    private String data_inizio_commercio___lte;
    private String data_inizio_commercio___gt;
    private String data_inizio_commercio___gte;
    private String data_inizio_commercio___contains;
    private String data_inizio_commercio___not___contains;
    private String data_inizio_commercio___starts_with;
    private String data_inizio_commercio___not___starts_with;
    private String data_inizio_commercio___ends_with;
    private String data_inizio_commercio___not___ends_with;
    private String data_inizio_validita_aic___eq;
    private String data_inizio_validita_aic___ne;
    private Boolean data_inizio_validita_aic___null;
    private Boolean data_inizio_validita_aic___not___null;
    private java.util.List<String> data_inizio_validita_aic___in;
    private java.util.List<String> data_inizio_validita_aic___not___in;
    private String data_inizio_validita_aic___lt;
    private String data_inizio_validita_aic___lte;
    private String data_inizio_validita_aic___gt;
    private String data_inizio_validita_aic___gte;
    private String data_inizio_validita_aic___contains;
    private String data_inizio_validita_aic___not___contains;
    private String data_inizio_validita_aic___starts_with;
    private String data_inizio_validita_aic___not___starts_with;
    private String data_inizio_validita_aic___ends_with;
    private String data_inizio_validita_aic___not___ends_with;
    private String marchio___eq;
    private String marchio___ne;
    private Boolean marchio___null;
    private Boolean marchio___not___null;
    private java.util.List<String> marchio___in;
    private java.util.List<String> marchio___not___in;
    private String marchio___lt;
    private String marchio___lte;
    private String marchio___gt;
    private String marchio___gte;
    private String marchio___contains;
    private String marchio___not___contains;
    private String marchio___starts_with;
    private String marchio___not___starts_with;
    private String marchio___ends_with;
    private String marchio___not___ends_with;
    private String principio_attivo___eq;
    private String principio_attivo___ne;
    private Boolean principio_attivo___null;
    private Boolean principio_attivo___not___null;
    private java.util.List<String> principio_attivo___in;
    private java.util.List<String> principio_attivo___not___in;
    private String principio_attivo___lt;
    private String principio_attivo___lte;
    private String principio_attivo___gt;
    private String principio_attivo___gte;
    private String principio_attivo___contains;
    private String principio_attivo___not___contains;
    private String principio_attivo___starts_with;
    private String principio_attivo___not___starts_with;
    private String principio_attivo___ends_with;
    private String principio_attivo___not___ends_with;
    private String qta_principio_attivo___eq;
    private String qta_principio_attivo___ne;
    private Boolean qta_principio_attivo___null;
    private Boolean qta_principio_attivo___not___null;
    private java.util.List<String> qta_principio_attivo___in;
    private java.util.List<String> qta_principio_attivo___not___in;
    private String qta_principio_attivo___lt;
    private String qta_principio_attivo___lte;
    private String qta_principio_attivo___gt;
    private String qta_principio_attivo___gte;
    private String qta_principio_attivo___contains;
    private String qta_principio_attivo___not___contains;
    private String qta_principio_attivo___starts_with;
    private String qta_principio_attivo___not___starts_with;
    private String qta_principio_attivo___ends_with;
    private String qta_principio_attivo___not___ends_with;
    private java.util.List<CliAICFilterDTO> AND;
    private java.util.List<CliAICFilterDTO> OR;
    private CliAICFilterDTO NOT;

    public CliAICFilterDTO() {
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

    public String getAzienda___eq() {
        return azienda___eq;
    }
    public void setAzienda___eq(String azienda___eq) {
        this.azienda___eq = azienda___eq;
    }

    public String getAzienda___ne() {
        return azienda___ne;
    }
    public void setAzienda___ne(String azienda___ne) {
        this.azienda___ne = azienda___ne;
    }

    public Boolean getAzienda___null() {
        return azienda___null;
    }
    public void setAzienda___null(Boolean azienda___null) {
        this.azienda___null = azienda___null;
    }

    public Boolean getAzienda___not___null() {
        return azienda___not___null;
    }
    public void setAzienda___not___null(Boolean azienda___not___null) {
        this.azienda___not___null = azienda___not___null;
    }

    public java.util.List<String> getAzienda___in() {
        return azienda___in;
    }
    public void setAzienda___in(java.util.List<String> azienda___in) {
        this.azienda___in = azienda___in;
    }

    public java.util.List<String> getAzienda___not___in() {
        return azienda___not___in;
    }
    public void setAzienda___not___in(java.util.List<String> azienda___not___in) {
        this.azienda___not___in = azienda___not___in;
    }

    public String getAzienda___lt() {
        return azienda___lt;
    }
    public void setAzienda___lt(String azienda___lt) {
        this.azienda___lt = azienda___lt;
    }

    public String getAzienda___lte() {
        return azienda___lte;
    }
    public void setAzienda___lte(String azienda___lte) {
        this.azienda___lte = azienda___lte;
    }

    public String getAzienda___gt() {
        return azienda___gt;
    }
    public void setAzienda___gt(String azienda___gt) {
        this.azienda___gt = azienda___gt;
    }

    public String getAzienda___gte() {
        return azienda___gte;
    }
    public void setAzienda___gte(String azienda___gte) {
        this.azienda___gte = azienda___gte;
    }

    public String getAzienda___contains() {
        return azienda___contains;
    }
    public void setAzienda___contains(String azienda___contains) {
        this.azienda___contains = azienda___contains;
    }

    public String getAzienda___not___contains() {
        return azienda___not___contains;
    }
    public void setAzienda___not___contains(String azienda___not___contains) {
        this.azienda___not___contains = azienda___not___contains;
    }

    public String getAzienda___starts_with() {
        return azienda___starts_with;
    }
    public void setAzienda___starts_with(String azienda___starts_with) {
        this.azienda___starts_with = azienda___starts_with;
    }

    public String getAzienda___not___starts_with() {
        return azienda___not___starts_with;
    }
    public void setAzienda___not___starts_with(String azienda___not___starts_with) {
        this.azienda___not___starts_with = azienda___not___starts_with;
    }

    public String getAzienda___ends_with() {
        return azienda___ends_with;
    }
    public void setAzienda___ends_with(String azienda___ends_with) {
        this.azienda___ends_with = azienda___ends_with;
    }

    public String getAzienda___not___ends_with() {
        return azienda___not___ends_with;
    }
    public void setAzienda___not___ends_with(String azienda___not___ends_with) {
        this.azienda___not___ends_with = azienda___not___ends_with;
    }

    public String getCodice___eq() {
        return codice___eq;
    }
    public void setCodice___eq(String codice___eq) {
        this.codice___eq = codice___eq;
    }

    public String getCodice___ne() {
        return codice___ne;
    }
    public void setCodice___ne(String codice___ne) {
        this.codice___ne = codice___ne;
    }

    public Boolean getCodice___null() {
        return codice___null;
    }
    public void setCodice___null(Boolean codice___null) {
        this.codice___null = codice___null;
    }

    public Boolean getCodice___not___null() {
        return codice___not___null;
    }
    public void setCodice___not___null(Boolean codice___not___null) {
        this.codice___not___null = codice___not___null;
    }

    public java.util.List<String> getCodice___in() {
        return codice___in;
    }
    public void setCodice___in(java.util.List<String> codice___in) {
        this.codice___in = codice___in;
    }

    public java.util.List<String> getCodice___not___in() {
        return codice___not___in;
    }
    public void setCodice___not___in(java.util.List<String> codice___not___in) {
        this.codice___not___in = codice___not___in;
    }

    public String getCodice___lt() {
        return codice___lt;
    }
    public void setCodice___lt(String codice___lt) {
        this.codice___lt = codice___lt;
    }

    public String getCodice___lte() {
        return codice___lte;
    }
    public void setCodice___lte(String codice___lte) {
        this.codice___lte = codice___lte;
    }

    public String getCodice___gt() {
        return codice___gt;
    }
    public void setCodice___gt(String codice___gt) {
        this.codice___gt = codice___gt;
    }

    public String getCodice___gte() {
        return codice___gte;
    }
    public void setCodice___gte(String codice___gte) {
        this.codice___gte = codice___gte;
    }

    public String getCodice___contains() {
        return codice___contains;
    }
    public void setCodice___contains(String codice___contains) {
        this.codice___contains = codice___contains;
    }

    public String getCodice___not___contains() {
        return codice___not___contains;
    }
    public void setCodice___not___contains(String codice___not___contains) {
        this.codice___not___contains = codice___not___contains;
    }

    public String getCodice___starts_with() {
        return codice___starts_with;
    }
    public void setCodice___starts_with(String codice___starts_with) {
        this.codice___starts_with = codice___starts_with;
    }

    public String getCodice___not___starts_with() {
        return codice___not___starts_with;
    }
    public void setCodice___not___starts_with(String codice___not___starts_with) {
        this.codice___not___starts_with = codice___not___starts_with;
    }

    public String getCodice___ends_with() {
        return codice___ends_with;
    }
    public void setCodice___ends_with(String codice___ends_with) {
        this.codice___ends_with = codice___ends_with;
    }

    public String getCodice___not___ends_with() {
        return codice___not___ends_with;
    }
    public void setCodice___not___ends_with(String codice___not___ends_with) {
        this.codice___not___ends_with = codice___not___ends_with;
    }

    public String getConfezione___eq() {
        return confezione___eq;
    }
    public void setConfezione___eq(String confezione___eq) {
        this.confezione___eq = confezione___eq;
    }

    public String getConfezione___ne() {
        return confezione___ne;
    }
    public void setConfezione___ne(String confezione___ne) {
        this.confezione___ne = confezione___ne;
    }

    public Boolean getConfezione___null() {
        return confezione___null;
    }
    public void setConfezione___null(Boolean confezione___null) {
        this.confezione___null = confezione___null;
    }

    public Boolean getConfezione___not___null() {
        return confezione___not___null;
    }
    public void setConfezione___not___null(Boolean confezione___not___null) {
        this.confezione___not___null = confezione___not___null;
    }

    public java.util.List<String> getConfezione___in() {
        return confezione___in;
    }
    public void setConfezione___in(java.util.List<String> confezione___in) {
        this.confezione___in = confezione___in;
    }

    public java.util.List<String> getConfezione___not___in() {
        return confezione___not___in;
    }
    public void setConfezione___not___in(java.util.List<String> confezione___not___in) {
        this.confezione___not___in = confezione___not___in;
    }

    public String getConfezione___lt() {
        return confezione___lt;
    }
    public void setConfezione___lt(String confezione___lt) {
        this.confezione___lt = confezione___lt;
    }

    public String getConfezione___lte() {
        return confezione___lte;
    }
    public void setConfezione___lte(String confezione___lte) {
        this.confezione___lte = confezione___lte;
    }

    public String getConfezione___gt() {
        return confezione___gt;
    }
    public void setConfezione___gt(String confezione___gt) {
        this.confezione___gt = confezione___gt;
    }

    public String getConfezione___gte() {
        return confezione___gte;
    }
    public void setConfezione___gte(String confezione___gte) {
        this.confezione___gte = confezione___gte;
    }

    public String getConfezione___contains() {
        return confezione___contains;
    }
    public void setConfezione___contains(String confezione___contains) {
        this.confezione___contains = confezione___contains;
    }

    public String getConfezione___not___contains() {
        return confezione___not___contains;
    }
    public void setConfezione___not___contains(String confezione___not___contains) {
        this.confezione___not___contains = confezione___not___contains;
    }

    public String getConfezione___starts_with() {
        return confezione___starts_with;
    }
    public void setConfezione___starts_with(String confezione___starts_with) {
        this.confezione___starts_with = confezione___starts_with;
    }

    public String getConfezione___not___starts_with() {
        return confezione___not___starts_with;
    }
    public void setConfezione___not___starts_with(String confezione___not___starts_with) {
        this.confezione___not___starts_with = confezione___not___starts_with;
    }

    public String getConfezione___ends_with() {
        return confezione___ends_with;
    }
    public void setConfezione___ends_with(String confezione___ends_with) {
        this.confezione___ends_with = confezione___ends_with;
    }

    public String getConfezione___not___ends_with() {
        return confezione___not___ends_with;
    }
    public void setConfezione___not___ends_with(String confezione___not___ends_with) {
        this.confezione___not___ends_with = confezione___not___ends_with;
    }

    public String getData_fine_commercio___eq() {
        return data_fine_commercio___eq;
    }
    public void setData_fine_commercio___eq(String data_fine_commercio___eq) {
        this.data_fine_commercio___eq = data_fine_commercio___eq;
    }

    public String getData_fine_commercio___ne() {
        return data_fine_commercio___ne;
    }
    public void setData_fine_commercio___ne(String data_fine_commercio___ne) {
        this.data_fine_commercio___ne = data_fine_commercio___ne;
    }

    public Boolean getData_fine_commercio___null() {
        return data_fine_commercio___null;
    }
    public void setData_fine_commercio___null(Boolean data_fine_commercio___null) {
        this.data_fine_commercio___null = data_fine_commercio___null;
    }

    public Boolean getData_fine_commercio___not___null() {
        return data_fine_commercio___not___null;
    }
    public void setData_fine_commercio___not___null(Boolean data_fine_commercio___not___null) {
        this.data_fine_commercio___not___null = data_fine_commercio___not___null;
    }

    public java.util.List<String> getData_fine_commercio___in() {
        return data_fine_commercio___in;
    }
    public void setData_fine_commercio___in(java.util.List<String> data_fine_commercio___in) {
        this.data_fine_commercio___in = data_fine_commercio___in;
    }

    public java.util.List<String> getData_fine_commercio___not___in() {
        return data_fine_commercio___not___in;
    }
    public void setData_fine_commercio___not___in(java.util.List<String> data_fine_commercio___not___in) {
        this.data_fine_commercio___not___in = data_fine_commercio___not___in;
    }

    public String getData_fine_commercio___lt() {
        return data_fine_commercio___lt;
    }
    public void setData_fine_commercio___lt(String data_fine_commercio___lt) {
        this.data_fine_commercio___lt = data_fine_commercio___lt;
    }

    public String getData_fine_commercio___lte() {
        return data_fine_commercio___lte;
    }
    public void setData_fine_commercio___lte(String data_fine_commercio___lte) {
        this.data_fine_commercio___lte = data_fine_commercio___lte;
    }

    public String getData_fine_commercio___gt() {
        return data_fine_commercio___gt;
    }
    public void setData_fine_commercio___gt(String data_fine_commercio___gt) {
        this.data_fine_commercio___gt = data_fine_commercio___gt;
    }

    public String getData_fine_commercio___gte() {
        return data_fine_commercio___gte;
    }
    public void setData_fine_commercio___gte(String data_fine_commercio___gte) {
        this.data_fine_commercio___gte = data_fine_commercio___gte;
    }

    public String getData_fine_commercio___contains() {
        return data_fine_commercio___contains;
    }
    public void setData_fine_commercio___contains(String data_fine_commercio___contains) {
        this.data_fine_commercio___contains = data_fine_commercio___contains;
    }

    public String getData_fine_commercio___not___contains() {
        return data_fine_commercio___not___contains;
    }
    public void setData_fine_commercio___not___contains(String data_fine_commercio___not___contains) {
        this.data_fine_commercio___not___contains = data_fine_commercio___not___contains;
    }

    public String getData_fine_commercio___starts_with() {
        return data_fine_commercio___starts_with;
    }
    public void setData_fine_commercio___starts_with(String data_fine_commercio___starts_with) {
        this.data_fine_commercio___starts_with = data_fine_commercio___starts_with;
    }

    public String getData_fine_commercio___not___starts_with() {
        return data_fine_commercio___not___starts_with;
    }
    public void setData_fine_commercio___not___starts_with(String data_fine_commercio___not___starts_with) {
        this.data_fine_commercio___not___starts_with = data_fine_commercio___not___starts_with;
    }

    public String getData_fine_commercio___ends_with() {
        return data_fine_commercio___ends_with;
    }
    public void setData_fine_commercio___ends_with(String data_fine_commercio___ends_with) {
        this.data_fine_commercio___ends_with = data_fine_commercio___ends_with;
    }

    public String getData_fine_commercio___not___ends_with() {
        return data_fine_commercio___not___ends_with;
    }
    public void setData_fine_commercio___not___ends_with(String data_fine_commercio___not___ends_with) {
        this.data_fine_commercio___not___ends_with = data_fine_commercio___not___ends_with;
    }

    public String getData_fine_validita_aic___eq() {
        return data_fine_validita_aic___eq;
    }
    public void setData_fine_validita_aic___eq(String data_fine_validita_aic___eq) {
        this.data_fine_validita_aic___eq = data_fine_validita_aic___eq;
    }

    public String getData_fine_validita_aic___ne() {
        return data_fine_validita_aic___ne;
    }
    public void setData_fine_validita_aic___ne(String data_fine_validita_aic___ne) {
        this.data_fine_validita_aic___ne = data_fine_validita_aic___ne;
    }

    public Boolean getData_fine_validita_aic___null() {
        return data_fine_validita_aic___null;
    }
    public void setData_fine_validita_aic___null(Boolean data_fine_validita_aic___null) {
        this.data_fine_validita_aic___null = data_fine_validita_aic___null;
    }

    public Boolean getData_fine_validita_aic___not___null() {
        return data_fine_validita_aic___not___null;
    }
    public void setData_fine_validita_aic___not___null(Boolean data_fine_validita_aic___not___null) {
        this.data_fine_validita_aic___not___null = data_fine_validita_aic___not___null;
    }

    public java.util.List<String> getData_fine_validita_aic___in() {
        return data_fine_validita_aic___in;
    }
    public void setData_fine_validita_aic___in(java.util.List<String> data_fine_validita_aic___in) {
        this.data_fine_validita_aic___in = data_fine_validita_aic___in;
    }

    public java.util.List<String> getData_fine_validita_aic___not___in() {
        return data_fine_validita_aic___not___in;
    }
    public void setData_fine_validita_aic___not___in(java.util.List<String> data_fine_validita_aic___not___in) {
        this.data_fine_validita_aic___not___in = data_fine_validita_aic___not___in;
    }

    public String getData_fine_validita_aic___lt() {
        return data_fine_validita_aic___lt;
    }
    public void setData_fine_validita_aic___lt(String data_fine_validita_aic___lt) {
        this.data_fine_validita_aic___lt = data_fine_validita_aic___lt;
    }

    public String getData_fine_validita_aic___lte() {
        return data_fine_validita_aic___lte;
    }
    public void setData_fine_validita_aic___lte(String data_fine_validita_aic___lte) {
        this.data_fine_validita_aic___lte = data_fine_validita_aic___lte;
    }

    public String getData_fine_validita_aic___gt() {
        return data_fine_validita_aic___gt;
    }
    public void setData_fine_validita_aic___gt(String data_fine_validita_aic___gt) {
        this.data_fine_validita_aic___gt = data_fine_validita_aic___gt;
    }

    public String getData_fine_validita_aic___gte() {
        return data_fine_validita_aic___gte;
    }
    public void setData_fine_validita_aic___gte(String data_fine_validita_aic___gte) {
        this.data_fine_validita_aic___gte = data_fine_validita_aic___gte;
    }

    public String getData_fine_validita_aic___contains() {
        return data_fine_validita_aic___contains;
    }
    public void setData_fine_validita_aic___contains(String data_fine_validita_aic___contains) {
        this.data_fine_validita_aic___contains = data_fine_validita_aic___contains;
    }

    public String getData_fine_validita_aic___not___contains() {
        return data_fine_validita_aic___not___contains;
    }
    public void setData_fine_validita_aic___not___contains(String data_fine_validita_aic___not___contains) {
        this.data_fine_validita_aic___not___contains = data_fine_validita_aic___not___contains;
    }

    public String getData_fine_validita_aic___starts_with() {
        return data_fine_validita_aic___starts_with;
    }
    public void setData_fine_validita_aic___starts_with(String data_fine_validita_aic___starts_with) {
        this.data_fine_validita_aic___starts_with = data_fine_validita_aic___starts_with;
    }

    public String getData_fine_validita_aic___not___starts_with() {
        return data_fine_validita_aic___not___starts_with;
    }
    public void setData_fine_validita_aic___not___starts_with(String data_fine_validita_aic___not___starts_with) {
        this.data_fine_validita_aic___not___starts_with = data_fine_validita_aic___not___starts_with;
    }

    public String getData_fine_validita_aic___ends_with() {
        return data_fine_validita_aic___ends_with;
    }
    public void setData_fine_validita_aic___ends_with(String data_fine_validita_aic___ends_with) {
        this.data_fine_validita_aic___ends_with = data_fine_validita_aic___ends_with;
    }

    public String getData_fine_validita_aic___not___ends_with() {
        return data_fine_validita_aic___not___ends_with;
    }
    public void setData_fine_validita_aic___not___ends_with(String data_fine_validita_aic___not___ends_with) {
        this.data_fine_validita_aic___not___ends_with = data_fine_validita_aic___not___ends_with;
    }

    public String getData_inizio_commercio___eq() {
        return data_inizio_commercio___eq;
    }
    public void setData_inizio_commercio___eq(String data_inizio_commercio___eq) {
        this.data_inizio_commercio___eq = data_inizio_commercio___eq;
    }

    public String getData_inizio_commercio___ne() {
        return data_inizio_commercio___ne;
    }
    public void setData_inizio_commercio___ne(String data_inizio_commercio___ne) {
        this.data_inizio_commercio___ne = data_inizio_commercio___ne;
    }

    public Boolean getData_inizio_commercio___null() {
        return data_inizio_commercio___null;
    }
    public void setData_inizio_commercio___null(Boolean data_inizio_commercio___null) {
        this.data_inizio_commercio___null = data_inizio_commercio___null;
    }

    public Boolean getData_inizio_commercio___not___null() {
        return data_inizio_commercio___not___null;
    }
    public void setData_inizio_commercio___not___null(Boolean data_inizio_commercio___not___null) {
        this.data_inizio_commercio___not___null = data_inizio_commercio___not___null;
    }

    public java.util.List<String> getData_inizio_commercio___in() {
        return data_inizio_commercio___in;
    }
    public void setData_inizio_commercio___in(java.util.List<String> data_inizio_commercio___in) {
        this.data_inizio_commercio___in = data_inizio_commercio___in;
    }

    public java.util.List<String> getData_inizio_commercio___not___in() {
        return data_inizio_commercio___not___in;
    }
    public void setData_inizio_commercio___not___in(java.util.List<String> data_inizio_commercio___not___in) {
        this.data_inizio_commercio___not___in = data_inizio_commercio___not___in;
    }

    public String getData_inizio_commercio___lt() {
        return data_inizio_commercio___lt;
    }
    public void setData_inizio_commercio___lt(String data_inizio_commercio___lt) {
        this.data_inizio_commercio___lt = data_inizio_commercio___lt;
    }

    public String getData_inizio_commercio___lte() {
        return data_inizio_commercio___lte;
    }
    public void setData_inizio_commercio___lte(String data_inizio_commercio___lte) {
        this.data_inizio_commercio___lte = data_inizio_commercio___lte;
    }

    public String getData_inizio_commercio___gt() {
        return data_inizio_commercio___gt;
    }
    public void setData_inizio_commercio___gt(String data_inizio_commercio___gt) {
        this.data_inizio_commercio___gt = data_inizio_commercio___gt;
    }

    public String getData_inizio_commercio___gte() {
        return data_inizio_commercio___gte;
    }
    public void setData_inizio_commercio___gte(String data_inizio_commercio___gte) {
        this.data_inizio_commercio___gte = data_inizio_commercio___gte;
    }

    public String getData_inizio_commercio___contains() {
        return data_inizio_commercio___contains;
    }
    public void setData_inizio_commercio___contains(String data_inizio_commercio___contains) {
        this.data_inizio_commercio___contains = data_inizio_commercio___contains;
    }

    public String getData_inizio_commercio___not___contains() {
        return data_inizio_commercio___not___contains;
    }
    public void setData_inizio_commercio___not___contains(String data_inizio_commercio___not___contains) {
        this.data_inizio_commercio___not___contains = data_inizio_commercio___not___contains;
    }

    public String getData_inizio_commercio___starts_with() {
        return data_inizio_commercio___starts_with;
    }
    public void setData_inizio_commercio___starts_with(String data_inizio_commercio___starts_with) {
        this.data_inizio_commercio___starts_with = data_inizio_commercio___starts_with;
    }

    public String getData_inizio_commercio___not___starts_with() {
        return data_inizio_commercio___not___starts_with;
    }
    public void setData_inizio_commercio___not___starts_with(String data_inizio_commercio___not___starts_with) {
        this.data_inizio_commercio___not___starts_with = data_inizio_commercio___not___starts_with;
    }

    public String getData_inizio_commercio___ends_with() {
        return data_inizio_commercio___ends_with;
    }
    public void setData_inizio_commercio___ends_with(String data_inizio_commercio___ends_with) {
        this.data_inizio_commercio___ends_with = data_inizio_commercio___ends_with;
    }

    public String getData_inizio_commercio___not___ends_with() {
        return data_inizio_commercio___not___ends_with;
    }
    public void setData_inizio_commercio___not___ends_with(String data_inizio_commercio___not___ends_with) {
        this.data_inizio_commercio___not___ends_with = data_inizio_commercio___not___ends_with;
    }

    public String getData_inizio_validita_aic___eq() {
        return data_inizio_validita_aic___eq;
    }
    public void setData_inizio_validita_aic___eq(String data_inizio_validita_aic___eq) {
        this.data_inizio_validita_aic___eq = data_inizio_validita_aic___eq;
    }

    public String getData_inizio_validita_aic___ne() {
        return data_inizio_validita_aic___ne;
    }
    public void setData_inizio_validita_aic___ne(String data_inizio_validita_aic___ne) {
        this.data_inizio_validita_aic___ne = data_inizio_validita_aic___ne;
    }

    public Boolean getData_inizio_validita_aic___null() {
        return data_inizio_validita_aic___null;
    }
    public void setData_inizio_validita_aic___null(Boolean data_inizio_validita_aic___null) {
        this.data_inizio_validita_aic___null = data_inizio_validita_aic___null;
    }

    public Boolean getData_inizio_validita_aic___not___null() {
        return data_inizio_validita_aic___not___null;
    }
    public void setData_inizio_validita_aic___not___null(Boolean data_inizio_validita_aic___not___null) {
        this.data_inizio_validita_aic___not___null = data_inizio_validita_aic___not___null;
    }

    public java.util.List<String> getData_inizio_validita_aic___in() {
        return data_inizio_validita_aic___in;
    }
    public void setData_inizio_validita_aic___in(java.util.List<String> data_inizio_validita_aic___in) {
        this.data_inizio_validita_aic___in = data_inizio_validita_aic___in;
    }

    public java.util.List<String> getData_inizio_validita_aic___not___in() {
        return data_inizio_validita_aic___not___in;
    }
    public void setData_inizio_validita_aic___not___in(java.util.List<String> data_inizio_validita_aic___not___in) {
        this.data_inizio_validita_aic___not___in = data_inizio_validita_aic___not___in;
    }

    public String getData_inizio_validita_aic___lt() {
        return data_inizio_validita_aic___lt;
    }
    public void setData_inizio_validita_aic___lt(String data_inizio_validita_aic___lt) {
        this.data_inizio_validita_aic___lt = data_inizio_validita_aic___lt;
    }

    public String getData_inizio_validita_aic___lte() {
        return data_inizio_validita_aic___lte;
    }
    public void setData_inizio_validita_aic___lte(String data_inizio_validita_aic___lte) {
        this.data_inizio_validita_aic___lte = data_inizio_validita_aic___lte;
    }

    public String getData_inizio_validita_aic___gt() {
        return data_inizio_validita_aic___gt;
    }
    public void setData_inizio_validita_aic___gt(String data_inizio_validita_aic___gt) {
        this.data_inizio_validita_aic___gt = data_inizio_validita_aic___gt;
    }

    public String getData_inizio_validita_aic___gte() {
        return data_inizio_validita_aic___gte;
    }
    public void setData_inizio_validita_aic___gte(String data_inizio_validita_aic___gte) {
        this.data_inizio_validita_aic___gte = data_inizio_validita_aic___gte;
    }

    public String getData_inizio_validita_aic___contains() {
        return data_inizio_validita_aic___contains;
    }
    public void setData_inizio_validita_aic___contains(String data_inizio_validita_aic___contains) {
        this.data_inizio_validita_aic___contains = data_inizio_validita_aic___contains;
    }

    public String getData_inizio_validita_aic___not___contains() {
        return data_inizio_validita_aic___not___contains;
    }
    public void setData_inizio_validita_aic___not___contains(String data_inizio_validita_aic___not___contains) {
        this.data_inizio_validita_aic___not___contains = data_inizio_validita_aic___not___contains;
    }

    public String getData_inizio_validita_aic___starts_with() {
        return data_inizio_validita_aic___starts_with;
    }
    public void setData_inizio_validita_aic___starts_with(String data_inizio_validita_aic___starts_with) {
        this.data_inizio_validita_aic___starts_with = data_inizio_validita_aic___starts_with;
    }

    public String getData_inizio_validita_aic___not___starts_with() {
        return data_inizio_validita_aic___not___starts_with;
    }
    public void setData_inizio_validita_aic___not___starts_with(String data_inizio_validita_aic___not___starts_with) {
        this.data_inizio_validita_aic___not___starts_with = data_inizio_validita_aic___not___starts_with;
    }

    public String getData_inizio_validita_aic___ends_with() {
        return data_inizio_validita_aic___ends_with;
    }
    public void setData_inizio_validita_aic___ends_with(String data_inizio_validita_aic___ends_with) {
        this.data_inizio_validita_aic___ends_with = data_inizio_validita_aic___ends_with;
    }

    public String getData_inizio_validita_aic___not___ends_with() {
        return data_inizio_validita_aic___not___ends_with;
    }
    public void setData_inizio_validita_aic___not___ends_with(String data_inizio_validita_aic___not___ends_with) {
        this.data_inizio_validita_aic___not___ends_with = data_inizio_validita_aic___not___ends_with;
    }

    public String getMarchio___eq() {
        return marchio___eq;
    }
    public void setMarchio___eq(String marchio___eq) {
        this.marchio___eq = marchio___eq;
    }

    public String getMarchio___ne() {
        return marchio___ne;
    }
    public void setMarchio___ne(String marchio___ne) {
        this.marchio___ne = marchio___ne;
    }

    public Boolean getMarchio___null() {
        return marchio___null;
    }
    public void setMarchio___null(Boolean marchio___null) {
        this.marchio___null = marchio___null;
    }

    public Boolean getMarchio___not___null() {
        return marchio___not___null;
    }
    public void setMarchio___not___null(Boolean marchio___not___null) {
        this.marchio___not___null = marchio___not___null;
    }

    public java.util.List<String> getMarchio___in() {
        return marchio___in;
    }
    public void setMarchio___in(java.util.List<String> marchio___in) {
        this.marchio___in = marchio___in;
    }

    public java.util.List<String> getMarchio___not___in() {
        return marchio___not___in;
    }
    public void setMarchio___not___in(java.util.List<String> marchio___not___in) {
        this.marchio___not___in = marchio___not___in;
    }

    public String getMarchio___lt() {
        return marchio___lt;
    }
    public void setMarchio___lt(String marchio___lt) {
        this.marchio___lt = marchio___lt;
    }

    public String getMarchio___lte() {
        return marchio___lte;
    }
    public void setMarchio___lte(String marchio___lte) {
        this.marchio___lte = marchio___lte;
    }

    public String getMarchio___gt() {
        return marchio___gt;
    }
    public void setMarchio___gt(String marchio___gt) {
        this.marchio___gt = marchio___gt;
    }

    public String getMarchio___gte() {
        return marchio___gte;
    }
    public void setMarchio___gte(String marchio___gte) {
        this.marchio___gte = marchio___gte;
    }

    public String getMarchio___contains() {
        return marchio___contains;
    }
    public void setMarchio___contains(String marchio___contains) {
        this.marchio___contains = marchio___contains;
    }

    public String getMarchio___not___contains() {
        return marchio___not___contains;
    }
    public void setMarchio___not___contains(String marchio___not___contains) {
        this.marchio___not___contains = marchio___not___contains;
    }

    public String getMarchio___starts_with() {
        return marchio___starts_with;
    }
    public void setMarchio___starts_with(String marchio___starts_with) {
        this.marchio___starts_with = marchio___starts_with;
    }

    public String getMarchio___not___starts_with() {
        return marchio___not___starts_with;
    }
    public void setMarchio___not___starts_with(String marchio___not___starts_with) {
        this.marchio___not___starts_with = marchio___not___starts_with;
    }

    public String getMarchio___ends_with() {
        return marchio___ends_with;
    }
    public void setMarchio___ends_with(String marchio___ends_with) {
        this.marchio___ends_with = marchio___ends_with;
    }

    public String getMarchio___not___ends_with() {
        return marchio___not___ends_with;
    }
    public void setMarchio___not___ends_with(String marchio___not___ends_with) {
        this.marchio___not___ends_with = marchio___not___ends_with;
    }

    public String getPrincipio_attivo___eq() {
        return principio_attivo___eq;
    }
    public void setPrincipio_attivo___eq(String principio_attivo___eq) {
        this.principio_attivo___eq = principio_attivo___eq;
    }

    public String getPrincipio_attivo___ne() {
        return principio_attivo___ne;
    }
    public void setPrincipio_attivo___ne(String principio_attivo___ne) {
        this.principio_attivo___ne = principio_attivo___ne;
    }

    public Boolean getPrincipio_attivo___null() {
        return principio_attivo___null;
    }
    public void setPrincipio_attivo___null(Boolean principio_attivo___null) {
        this.principio_attivo___null = principio_attivo___null;
    }

    public Boolean getPrincipio_attivo___not___null() {
        return principio_attivo___not___null;
    }
    public void setPrincipio_attivo___not___null(Boolean principio_attivo___not___null) {
        this.principio_attivo___not___null = principio_attivo___not___null;
    }

    public java.util.List<String> getPrincipio_attivo___in() {
        return principio_attivo___in;
    }
    public void setPrincipio_attivo___in(java.util.List<String> principio_attivo___in) {
        this.principio_attivo___in = principio_attivo___in;
    }

    public java.util.List<String> getPrincipio_attivo___not___in() {
        return principio_attivo___not___in;
    }
    public void setPrincipio_attivo___not___in(java.util.List<String> principio_attivo___not___in) {
        this.principio_attivo___not___in = principio_attivo___not___in;
    }

    public String getPrincipio_attivo___lt() {
        return principio_attivo___lt;
    }
    public void setPrincipio_attivo___lt(String principio_attivo___lt) {
        this.principio_attivo___lt = principio_attivo___lt;
    }

    public String getPrincipio_attivo___lte() {
        return principio_attivo___lte;
    }
    public void setPrincipio_attivo___lte(String principio_attivo___lte) {
        this.principio_attivo___lte = principio_attivo___lte;
    }

    public String getPrincipio_attivo___gt() {
        return principio_attivo___gt;
    }
    public void setPrincipio_attivo___gt(String principio_attivo___gt) {
        this.principio_attivo___gt = principio_attivo___gt;
    }

    public String getPrincipio_attivo___gte() {
        return principio_attivo___gte;
    }
    public void setPrincipio_attivo___gte(String principio_attivo___gte) {
        this.principio_attivo___gte = principio_attivo___gte;
    }

    public String getPrincipio_attivo___contains() {
        return principio_attivo___contains;
    }
    public void setPrincipio_attivo___contains(String principio_attivo___contains) {
        this.principio_attivo___contains = principio_attivo___contains;
    }

    public String getPrincipio_attivo___not___contains() {
        return principio_attivo___not___contains;
    }
    public void setPrincipio_attivo___not___contains(String principio_attivo___not___contains) {
        this.principio_attivo___not___contains = principio_attivo___not___contains;
    }

    public String getPrincipio_attivo___starts_with() {
        return principio_attivo___starts_with;
    }
    public void setPrincipio_attivo___starts_with(String principio_attivo___starts_with) {
        this.principio_attivo___starts_with = principio_attivo___starts_with;
    }

    public String getPrincipio_attivo___not___starts_with() {
        return principio_attivo___not___starts_with;
    }
    public void setPrincipio_attivo___not___starts_with(String principio_attivo___not___starts_with) {
        this.principio_attivo___not___starts_with = principio_attivo___not___starts_with;
    }

    public String getPrincipio_attivo___ends_with() {
        return principio_attivo___ends_with;
    }
    public void setPrincipio_attivo___ends_with(String principio_attivo___ends_with) {
        this.principio_attivo___ends_with = principio_attivo___ends_with;
    }

    public String getPrincipio_attivo___not___ends_with() {
        return principio_attivo___not___ends_with;
    }
    public void setPrincipio_attivo___not___ends_with(String principio_attivo___not___ends_with) {
        this.principio_attivo___not___ends_with = principio_attivo___not___ends_with;
    }

    public String getQta_principio_attivo___eq() {
        return qta_principio_attivo___eq;
    }
    public void setQta_principio_attivo___eq(String qta_principio_attivo___eq) {
        this.qta_principio_attivo___eq = qta_principio_attivo___eq;
    }

    public String getQta_principio_attivo___ne() {
        return qta_principio_attivo___ne;
    }
    public void setQta_principio_attivo___ne(String qta_principio_attivo___ne) {
        this.qta_principio_attivo___ne = qta_principio_attivo___ne;
    }

    public Boolean getQta_principio_attivo___null() {
        return qta_principio_attivo___null;
    }
    public void setQta_principio_attivo___null(Boolean qta_principio_attivo___null) {
        this.qta_principio_attivo___null = qta_principio_attivo___null;
    }

    public Boolean getQta_principio_attivo___not___null() {
        return qta_principio_attivo___not___null;
    }
    public void setQta_principio_attivo___not___null(Boolean qta_principio_attivo___not___null) {
        this.qta_principio_attivo___not___null = qta_principio_attivo___not___null;
    }

    public java.util.List<String> getQta_principio_attivo___in() {
        return qta_principio_attivo___in;
    }
    public void setQta_principio_attivo___in(java.util.List<String> qta_principio_attivo___in) {
        this.qta_principio_attivo___in = qta_principio_attivo___in;
    }

    public java.util.List<String> getQta_principio_attivo___not___in() {
        return qta_principio_attivo___not___in;
    }
    public void setQta_principio_attivo___not___in(java.util.List<String> qta_principio_attivo___not___in) {
        this.qta_principio_attivo___not___in = qta_principio_attivo___not___in;
    }

    public String getQta_principio_attivo___lt() {
        return qta_principio_attivo___lt;
    }
    public void setQta_principio_attivo___lt(String qta_principio_attivo___lt) {
        this.qta_principio_attivo___lt = qta_principio_attivo___lt;
    }

    public String getQta_principio_attivo___lte() {
        return qta_principio_attivo___lte;
    }
    public void setQta_principio_attivo___lte(String qta_principio_attivo___lte) {
        this.qta_principio_attivo___lte = qta_principio_attivo___lte;
    }

    public String getQta_principio_attivo___gt() {
        return qta_principio_attivo___gt;
    }
    public void setQta_principio_attivo___gt(String qta_principio_attivo___gt) {
        this.qta_principio_attivo___gt = qta_principio_attivo___gt;
    }

    public String getQta_principio_attivo___gte() {
        return qta_principio_attivo___gte;
    }
    public void setQta_principio_attivo___gte(String qta_principio_attivo___gte) {
        this.qta_principio_attivo___gte = qta_principio_attivo___gte;
    }

    public String getQta_principio_attivo___contains() {
        return qta_principio_attivo___contains;
    }
    public void setQta_principio_attivo___contains(String qta_principio_attivo___contains) {
        this.qta_principio_attivo___contains = qta_principio_attivo___contains;
    }

    public String getQta_principio_attivo___not___contains() {
        return qta_principio_attivo___not___contains;
    }
    public void setQta_principio_attivo___not___contains(String qta_principio_attivo___not___contains) {
        this.qta_principio_attivo___not___contains = qta_principio_attivo___not___contains;
    }

    public String getQta_principio_attivo___starts_with() {
        return qta_principio_attivo___starts_with;
    }
    public void setQta_principio_attivo___starts_with(String qta_principio_attivo___starts_with) {
        this.qta_principio_attivo___starts_with = qta_principio_attivo___starts_with;
    }

    public String getQta_principio_attivo___not___starts_with() {
        return qta_principio_attivo___not___starts_with;
    }
    public void setQta_principio_attivo___not___starts_with(String qta_principio_attivo___not___starts_with) {
        this.qta_principio_attivo___not___starts_with = qta_principio_attivo___not___starts_with;
    }

    public String getQta_principio_attivo___ends_with() {
        return qta_principio_attivo___ends_with;
    }
    public void setQta_principio_attivo___ends_with(String qta_principio_attivo___ends_with) {
        this.qta_principio_attivo___ends_with = qta_principio_attivo___ends_with;
    }

    public String getQta_principio_attivo___not___ends_with() {
        return qta_principio_attivo___not___ends_with;
    }
    public void setQta_principio_attivo___not___ends_with(String qta_principio_attivo___not___ends_with) {
        this.qta_principio_attivo___not___ends_with = qta_principio_attivo___not___ends_with;
    }

    public java.util.List<CliAICFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliAICFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliAICFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliAICFilterDTO> OR) {
        this.OR = OR;
    }

    public CliAICFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliAICFilterDTO NOT) {
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
        if (azienda___eq != null) {
            joiner.add("azienda___eq: " + GraphQLRequestSerializer.getEntry(azienda___eq));
        }
        if (azienda___ne != null) {
            joiner.add("azienda___ne: " + GraphQLRequestSerializer.getEntry(azienda___ne));
        }
        if (azienda___null != null) {
            joiner.add("azienda___null: " + GraphQLRequestSerializer.getEntry(azienda___null));
        }
        if (azienda___not___null != null) {
            joiner.add("azienda___not___null: " + GraphQLRequestSerializer.getEntry(azienda___not___null));
        }
        if (azienda___in != null) {
            joiner.add("azienda___in: " + GraphQLRequestSerializer.getEntry(azienda___in));
        }
        if (azienda___not___in != null) {
            joiner.add("azienda___not___in: " + GraphQLRequestSerializer.getEntry(azienda___not___in));
        }
        if (azienda___lt != null) {
            joiner.add("azienda___lt: " + GraphQLRequestSerializer.getEntry(azienda___lt));
        }
        if (azienda___lte != null) {
            joiner.add("azienda___lte: " + GraphQLRequestSerializer.getEntry(azienda___lte));
        }
        if (azienda___gt != null) {
            joiner.add("azienda___gt: " + GraphQLRequestSerializer.getEntry(azienda___gt));
        }
        if (azienda___gte != null) {
            joiner.add("azienda___gte: " + GraphQLRequestSerializer.getEntry(azienda___gte));
        }
        if (azienda___contains != null) {
            joiner.add("azienda___contains: " + GraphQLRequestSerializer.getEntry(azienda___contains));
        }
        if (azienda___not___contains != null) {
            joiner.add("azienda___not___contains: " + GraphQLRequestSerializer.getEntry(azienda___not___contains));
        }
        if (azienda___starts_with != null) {
            joiner.add("azienda___starts_with: " + GraphQLRequestSerializer.getEntry(azienda___starts_with));
        }
        if (azienda___not___starts_with != null) {
            joiner.add("azienda___not___starts_with: " + GraphQLRequestSerializer.getEntry(azienda___not___starts_with));
        }
        if (azienda___ends_with != null) {
            joiner.add("azienda___ends_with: " + GraphQLRequestSerializer.getEntry(azienda___ends_with));
        }
        if (azienda___not___ends_with != null) {
            joiner.add("azienda___not___ends_with: " + GraphQLRequestSerializer.getEntry(azienda___not___ends_with));
        }
        if (codice___eq != null) {
            joiner.add("codice___eq: " + GraphQLRequestSerializer.getEntry(codice___eq));
        }
        if (codice___ne != null) {
            joiner.add("codice___ne: " + GraphQLRequestSerializer.getEntry(codice___ne));
        }
        if (codice___null != null) {
            joiner.add("codice___null: " + GraphQLRequestSerializer.getEntry(codice___null));
        }
        if (codice___not___null != null) {
            joiner.add("codice___not___null: " + GraphQLRequestSerializer.getEntry(codice___not___null));
        }
        if (codice___in != null) {
            joiner.add("codice___in: " + GraphQLRequestSerializer.getEntry(codice___in));
        }
        if (codice___not___in != null) {
            joiner.add("codice___not___in: " + GraphQLRequestSerializer.getEntry(codice___not___in));
        }
        if (codice___lt != null) {
            joiner.add("codice___lt: " + GraphQLRequestSerializer.getEntry(codice___lt));
        }
        if (codice___lte != null) {
            joiner.add("codice___lte: " + GraphQLRequestSerializer.getEntry(codice___lte));
        }
        if (codice___gt != null) {
            joiner.add("codice___gt: " + GraphQLRequestSerializer.getEntry(codice___gt));
        }
        if (codice___gte != null) {
            joiner.add("codice___gte: " + GraphQLRequestSerializer.getEntry(codice___gte));
        }
        if (codice___contains != null) {
            joiner.add("codice___contains: " + GraphQLRequestSerializer.getEntry(codice___contains));
        }
        if (codice___not___contains != null) {
            joiner.add("codice___not___contains: " + GraphQLRequestSerializer.getEntry(codice___not___contains));
        }
        if (codice___starts_with != null) {
            joiner.add("codice___starts_with: " + GraphQLRequestSerializer.getEntry(codice___starts_with));
        }
        if (codice___not___starts_with != null) {
            joiner.add("codice___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice___not___starts_with));
        }
        if (codice___ends_with != null) {
            joiner.add("codice___ends_with: " + GraphQLRequestSerializer.getEntry(codice___ends_with));
        }
        if (codice___not___ends_with != null) {
            joiner.add("codice___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice___not___ends_with));
        }
        if (confezione___eq != null) {
            joiner.add("confezione___eq: " + GraphQLRequestSerializer.getEntry(confezione___eq));
        }
        if (confezione___ne != null) {
            joiner.add("confezione___ne: " + GraphQLRequestSerializer.getEntry(confezione___ne));
        }
        if (confezione___null != null) {
            joiner.add("confezione___null: " + GraphQLRequestSerializer.getEntry(confezione___null));
        }
        if (confezione___not___null != null) {
            joiner.add("confezione___not___null: " + GraphQLRequestSerializer.getEntry(confezione___not___null));
        }
        if (confezione___in != null) {
            joiner.add("confezione___in: " + GraphQLRequestSerializer.getEntry(confezione___in));
        }
        if (confezione___not___in != null) {
            joiner.add("confezione___not___in: " + GraphQLRequestSerializer.getEntry(confezione___not___in));
        }
        if (confezione___lt != null) {
            joiner.add("confezione___lt: " + GraphQLRequestSerializer.getEntry(confezione___lt));
        }
        if (confezione___lte != null) {
            joiner.add("confezione___lte: " + GraphQLRequestSerializer.getEntry(confezione___lte));
        }
        if (confezione___gt != null) {
            joiner.add("confezione___gt: " + GraphQLRequestSerializer.getEntry(confezione___gt));
        }
        if (confezione___gte != null) {
            joiner.add("confezione___gte: " + GraphQLRequestSerializer.getEntry(confezione___gte));
        }
        if (confezione___contains != null) {
            joiner.add("confezione___contains: " + GraphQLRequestSerializer.getEntry(confezione___contains));
        }
        if (confezione___not___contains != null) {
            joiner.add("confezione___not___contains: " + GraphQLRequestSerializer.getEntry(confezione___not___contains));
        }
        if (confezione___starts_with != null) {
            joiner.add("confezione___starts_with: " + GraphQLRequestSerializer.getEntry(confezione___starts_with));
        }
        if (confezione___not___starts_with != null) {
            joiner.add("confezione___not___starts_with: " + GraphQLRequestSerializer.getEntry(confezione___not___starts_with));
        }
        if (confezione___ends_with != null) {
            joiner.add("confezione___ends_with: " + GraphQLRequestSerializer.getEntry(confezione___ends_with));
        }
        if (confezione___not___ends_with != null) {
            joiner.add("confezione___not___ends_with: " + GraphQLRequestSerializer.getEntry(confezione___not___ends_with));
        }
        if (data_fine_commercio___eq != null) {
            joiner.add("data_fine_commercio___eq: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___eq));
        }
        if (data_fine_commercio___ne != null) {
            joiner.add("data_fine_commercio___ne: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___ne));
        }
        if (data_fine_commercio___null != null) {
            joiner.add("data_fine_commercio___null: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___null));
        }
        if (data_fine_commercio___not___null != null) {
            joiner.add("data_fine_commercio___not___null: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___not___null));
        }
        if (data_fine_commercio___in != null) {
            joiner.add("data_fine_commercio___in: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___in));
        }
        if (data_fine_commercio___not___in != null) {
            joiner.add("data_fine_commercio___not___in: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___not___in));
        }
        if (data_fine_commercio___lt != null) {
            joiner.add("data_fine_commercio___lt: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___lt));
        }
        if (data_fine_commercio___lte != null) {
            joiner.add("data_fine_commercio___lte: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___lte));
        }
        if (data_fine_commercio___gt != null) {
            joiner.add("data_fine_commercio___gt: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___gt));
        }
        if (data_fine_commercio___gte != null) {
            joiner.add("data_fine_commercio___gte: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___gte));
        }
        if (data_fine_commercio___contains != null) {
            joiner.add("data_fine_commercio___contains: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___contains));
        }
        if (data_fine_commercio___not___contains != null) {
            joiner.add("data_fine_commercio___not___contains: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___not___contains));
        }
        if (data_fine_commercio___starts_with != null) {
            joiner.add("data_fine_commercio___starts_with: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___starts_with));
        }
        if (data_fine_commercio___not___starts_with != null) {
            joiner.add("data_fine_commercio___not___starts_with: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___not___starts_with));
        }
        if (data_fine_commercio___ends_with != null) {
            joiner.add("data_fine_commercio___ends_with: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___ends_with));
        }
        if (data_fine_commercio___not___ends_with != null) {
            joiner.add("data_fine_commercio___not___ends_with: " + GraphQLRequestSerializer.getEntry(data_fine_commercio___not___ends_with));
        }
        if (data_fine_validita_aic___eq != null) {
            joiner.add("data_fine_validita_aic___eq: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___eq));
        }
        if (data_fine_validita_aic___ne != null) {
            joiner.add("data_fine_validita_aic___ne: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___ne));
        }
        if (data_fine_validita_aic___null != null) {
            joiner.add("data_fine_validita_aic___null: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___null));
        }
        if (data_fine_validita_aic___not___null != null) {
            joiner.add("data_fine_validita_aic___not___null: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___not___null));
        }
        if (data_fine_validita_aic___in != null) {
            joiner.add("data_fine_validita_aic___in: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___in));
        }
        if (data_fine_validita_aic___not___in != null) {
            joiner.add("data_fine_validita_aic___not___in: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___not___in));
        }
        if (data_fine_validita_aic___lt != null) {
            joiner.add("data_fine_validita_aic___lt: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___lt));
        }
        if (data_fine_validita_aic___lte != null) {
            joiner.add("data_fine_validita_aic___lte: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___lte));
        }
        if (data_fine_validita_aic___gt != null) {
            joiner.add("data_fine_validita_aic___gt: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___gt));
        }
        if (data_fine_validita_aic___gte != null) {
            joiner.add("data_fine_validita_aic___gte: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___gte));
        }
        if (data_fine_validita_aic___contains != null) {
            joiner.add("data_fine_validita_aic___contains: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___contains));
        }
        if (data_fine_validita_aic___not___contains != null) {
            joiner.add("data_fine_validita_aic___not___contains: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___not___contains));
        }
        if (data_fine_validita_aic___starts_with != null) {
            joiner.add("data_fine_validita_aic___starts_with: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___starts_with));
        }
        if (data_fine_validita_aic___not___starts_with != null) {
            joiner.add("data_fine_validita_aic___not___starts_with: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___not___starts_with));
        }
        if (data_fine_validita_aic___ends_with != null) {
            joiner.add("data_fine_validita_aic___ends_with: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___ends_with));
        }
        if (data_fine_validita_aic___not___ends_with != null) {
            joiner.add("data_fine_validita_aic___not___ends_with: " + GraphQLRequestSerializer.getEntry(data_fine_validita_aic___not___ends_with));
        }
        if (data_inizio_commercio___eq != null) {
            joiner.add("data_inizio_commercio___eq: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___eq));
        }
        if (data_inizio_commercio___ne != null) {
            joiner.add("data_inizio_commercio___ne: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___ne));
        }
        if (data_inizio_commercio___null != null) {
            joiner.add("data_inizio_commercio___null: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___null));
        }
        if (data_inizio_commercio___not___null != null) {
            joiner.add("data_inizio_commercio___not___null: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___not___null));
        }
        if (data_inizio_commercio___in != null) {
            joiner.add("data_inizio_commercio___in: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___in));
        }
        if (data_inizio_commercio___not___in != null) {
            joiner.add("data_inizio_commercio___not___in: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___not___in));
        }
        if (data_inizio_commercio___lt != null) {
            joiner.add("data_inizio_commercio___lt: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___lt));
        }
        if (data_inizio_commercio___lte != null) {
            joiner.add("data_inizio_commercio___lte: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___lte));
        }
        if (data_inizio_commercio___gt != null) {
            joiner.add("data_inizio_commercio___gt: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___gt));
        }
        if (data_inizio_commercio___gte != null) {
            joiner.add("data_inizio_commercio___gte: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___gte));
        }
        if (data_inizio_commercio___contains != null) {
            joiner.add("data_inizio_commercio___contains: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___contains));
        }
        if (data_inizio_commercio___not___contains != null) {
            joiner.add("data_inizio_commercio___not___contains: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___not___contains));
        }
        if (data_inizio_commercio___starts_with != null) {
            joiner.add("data_inizio_commercio___starts_with: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___starts_with));
        }
        if (data_inizio_commercio___not___starts_with != null) {
            joiner.add("data_inizio_commercio___not___starts_with: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___not___starts_with));
        }
        if (data_inizio_commercio___ends_with != null) {
            joiner.add("data_inizio_commercio___ends_with: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___ends_with));
        }
        if (data_inizio_commercio___not___ends_with != null) {
            joiner.add("data_inizio_commercio___not___ends_with: " + GraphQLRequestSerializer.getEntry(data_inizio_commercio___not___ends_with));
        }
        if (data_inizio_validita_aic___eq != null) {
            joiner.add("data_inizio_validita_aic___eq: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___eq));
        }
        if (data_inizio_validita_aic___ne != null) {
            joiner.add("data_inizio_validita_aic___ne: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___ne));
        }
        if (data_inizio_validita_aic___null != null) {
            joiner.add("data_inizio_validita_aic___null: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___null));
        }
        if (data_inizio_validita_aic___not___null != null) {
            joiner.add("data_inizio_validita_aic___not___null: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___not___null));
        }
        if (data_inizio_validita_aic___in != null) {
            joiner.add("data_inizio_validita_aic___in: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___in));
        }
        if (data_inizio_validita_aic___not___in != null) {
            joiner.add("data_inizio_validita_aic___not___in: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___not___in));
        }
        if (data_inizio_validita_aic___lt != null) {
            joiner.add("data_inizio_validita_aic___lt: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___lt));
        }
        if (data_inizio_validita_aic___lte != null) {
            joiner.add("data_inizio_validita_aic___lte: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___lte));
        }
        if (data_inizio_validita_aic___gt != null) {
            joiner.add("data_inizio_validita_aic___gt: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___gt));
        }
        if (data_inizio_validita_aic___gte != null) {
            joiner.add("data_inizio_validita_aic___gte: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___gte));
        }
        if (data_inizio_validita_aic___contains != null) {
            joiner.add("data_inizio_validita_aic___contains: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___contains));
        }
        if (data_inizio_validita_aic___not___contains != null) {
            joiner.add("data_inizio_validita_aic___not___contains: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___not___contains));
        }
        if (data_inizio_validita_aic___starts_with != null) {
            joiner.add("data_inizio_validita_aic___starts_with: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___starts_with));
        }
        if (data_inizio_validita_aic___not___starts_with != null) {
            joiner.add("data_inizio_validita_aic___not___starts_with: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___not___starts_with));
        }
        if (data_inizio_validita_aic___ends_with != null) {
            joiner.add("data_inizio_validita_aic___ends_with: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___ends_with));
        }
        if (data_inizio_validita_aic___not___ends_with != null) {
            joiner.add("data_inizio_validita_aic___not___ends_with: " + GraphQLRequestSerializer.getEntry(data_inizio_validita_aic___not___ends_with));
        }
        if (marchio___eq != null) {
            joiner.add("marchio___eq: " + GraphQLRequestSerializer.getEntry(marchio___eq));
        }
        if (marchio___ne != null) {
            joiner.add("marchio___ne: " + GraphQLRequestSerializer.getEntry(marchio___ne));
        }
        if (marchio___null != null) {
            joiner.add("marchio___null: " + GraphQLRequestSerializer.getEntry(marchio___null));
        }
        if (marchio___not___null != null) {
            joiner.add("marchio___not___null: " + GraphQLRequestSerializer.getEntry(marchio___not___null));
        }
        if (marchio___in != null) {
            joiner.add("marchio___in: " + GraphQLRequestSerializer.getEntry(marchio___in));
        }
        if (marchio___not___in != null) {
            joiner.add("marchio___not___in: " + GraphQLRequestSerializer.getEntry(marchio___not___in));
        }
        if (marchio___lt != null) {
            joiner.add("marchio___lt: " + GraphQLRequestSerializer.getEntry(marchio___lt));
        }
        if (marchio___lte != null) {
            joiner.add("marchio___lte: " + GraphQLRequestSerializer.getEntry(marchio___lte));
        }
        if (marchio___gt != null) {
            joiner.add("marchio___gt: " + GraphQLRequestSerializer.getEntry(marchio___gt));
        }
        if (marchio___gte != null) {
            joiner.add("marchio___gte: " + GraphQLRequestSerializer.getEntry(marchio___gte));
        }
        if (marchio___contains != null) {
            joiner.add("marchio___contains: " + GraphQLRequestSerializer.getEntry(marchio___contains));
        }
        if (marchio___not___contains != null) {
            joiner.add("marchio___not___contains: " + GraphQLRequestSerializer.getEntry(marchio___not___contains));
        }
        if (marchio___starts_with != null) {
            joiner.add("marchio___starts_with: " + GraphQLRequestSerializer.getEntry(marchio___starts_with));
        }
        if (marchio___not___starts_with != null) {
            joiner.add("marchio___not___starts_with: " + GraphQLRequestSerializer.getEntry(marchio___not___starts_with));
        }
        if (marchio___ends_with != null) {
            joiner.add("marchio___ends_with: " + GraphQLRequestSerializer.getEntry(marchio___ends_with));
        }
        if (marchio___not___ends_with != null) {
            joiner.add("marchio___not___ends_with: " + GraphQLRequestSerializer.getEntry(marchio___not___ends_with));
        }
        if (principio_attivo___eq != null) {
            joiner.add("principio_attivo___eq: " + GraphQLRequestSerializer.getEntry(principio_attivo___eq));
        }
        if (principio_attivo___ne != null) {
            joiner.add("principio_attivo___ne: " + GraphQLRequestSerializer.getEntry(principio_attivo___ne));
        }
        if (principio_attivo___null != null) {
            joiner.add("principio_attivo___null: " + GraphQLRequestSerializer.getEntry(principio_attivo___null));
        }
        if (principio_attivo___not___null != null) {
            joiner.add("principio_attivo___not___null: " + GraphQLRequestSerializer.getEntry(principio_attivo___not___null));
        }
        if (principio_attivo___in != null) {
            joiner.add("principio_attivo___in: " + GraphQLRequestSerializer.getEntry(principio_attivo___in));
        }
        if (principio_attivo___not___in != null) {
            joiner.add("principio_attivo___not___in: " + GraphQLRequestSerializer.getEntry(principio_attivo___not___in));
        }
        if (principio_attivo___lt != null) {
            joiner.add("principio_attivo___lt: " + GraphQLRequestSerializer.getEntry(principio_attivo___lt));
        }
        if (principio_attivo___lte != null) {
            joiner.add("principio_attivo___lte: " + GraphQLRequestSerializer.getEntry(principio_attivo___lte));
        }
        if (principio_attivo___gt != null) {
            joiner.add("principio_attivo___gt: " + GraphQLRequestSerializer.getEntry(principio_attivo___gt));
        }
        if (principio_attivo___gte != null) {
            joiner.add("principio_attivo___gte: " + GraphQLRequestSerializer.getEntry(principio_attivo___gte));
        }
        if (principio_attivo___contains != null) {
            joiner.add("principio_attivo___contains: " + GraphQLRequestSerializer.getEntry(principio_attivo___contains));
        }
        if (principio_attivo___not___contains != null) {
            joiner.add("principio_attivo___not___contains: " + GraphQLRequestSerializer.getEntry(principio_attivo___not___contains));
        }
        if (principio_attivo___starts_with != null) {
            joiner.add("principio_attivo___starts_with: " + GraphQLRequestSerializer.getEntry(principio_attivo___starts_with));
        }
        if (principio_attivo___not___starts_with != null) {
            joiner.add("principio_attivo___not___starts_with: " + GraphQLRequestSerializer.getEntry(principio_attivo___not___starts_with));
        }
        if (principio_attivo___ends_with != null) {
            joiner.add("principio_attivo___ends_with: " + GraphQLRequestSerializer.getEntry(principio_attivo___ends_with));
        }
        if (principio_attivo___not___ends_with != null) {
            joiner.add("principio_attivo___not___ends_with: " + GraphQLRequestSerializer.getEntry(principio_attivo___not___ends_with));
        }
        if (qta_principio_attivo___eq != null) {
            joiner.add("qta_principio_attivo___eq: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___eq));
        }
        if (qta_principio_attivo___ne != null) {
            joiner.add("qta_principio_attivo___ne: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___ne));
        }
        if (qta_principio_attivo___null != null) {
            joiner.add("qta_principio_attivo___null: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___null));
        }
        if (qta_principio_attivo___not___null != null) {
            joiner.add("qta_principio_attivo___not___null: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___not___null));
        }
        if (qta_principio_attivo___in != null) {
            joiner.add("qta_principio_attivo___in: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___in));
        }
        if (qta_principio_attivo___not___in != null) {
            joiner.add("qta_principio_attivo___not___in: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___not___in));
        }
        if (qta_principio_attivo___lt != null) {
            joiner.add("qta_principio_attivo___lt: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___lt));
        }
        if (qta_principio_attivo___lte != null) {
            joiner.add("qta_principio_attivo___lte: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___lte));
        }
        if (qta_principio_attivo___gt != null) {
            joiner.add("qta_principio_attivo___gt: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___gt));
        }
        if (qta_principio_attivo___gte != null) {
            joiner.add("qta_principio_attivo___gte: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___gte));
        }
        if (qta_principio_attivo___contains != null) {
            joiner.add("qta_principio_attivo___contains: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___contains));
        }
        if (qta_principio_attivo___not___contains != null) {
            joiner.add("qta_principio_attivo___not___contains: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___not___contains));
        }
        if (qta_principio_attivo___starts_with != null) {
            joiner.add("qta_principio_attivo___starts_with: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___starts_with));
        }
        if (qta_principio_attivo___not___starts_with != null) {
            joiner.add("qta_principio_attivo___not___starts_with: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___not___starts_with));
        }
        if (qta_principio_attivo___ends_with != null) {
            joiner.add("qta_principio_attivo___ends_with: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___ends_with));
        }
        if (qta_principio_attivo___not___ends_with != null) {
            joiner.add("qta_principio_attivo___not___ends_with: " + GraphQLRequestSerializer.getEntry(qta_principio_attivo___not___ends_with));
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

    public static CliAICFilterDTO.Builder builder() {
        return new CliAICFilterDTO.Builder();
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
        private String azienda___eq;
        private String azienda___ne;
        private Boolean azienda___null;
        private Boolean azienda___not___null;
        private java.util.List<String> azienda___in;
        private java.util.List<String> azienda___not___in;
        private String azienda___lt;
        private String azienda___lte;
        private String azienda___gt;
        private String azienda___gte;
        private String azienda___contains;
        private String azienda___not___contains;
        private String azienda___starts_with;
        private String azienda___not___starts_with;
        private String azienda___ends_with;
        private String azienda___not___ends_with;
        private String codice___eq;
        private String codice___ne;
        private Boolean codice___null;
        private Boolean codice___not___null;
        private java.util.List<String> codice___in;
        private java.util.List<String> codice___not___in;
        private String codice___lt;
        private String codice___lte;
        private String codice___gt;
        private String codice___gte;
        private String codice___contains;
        private String codice___not___contains;
        private String codice___starts_with;
        private String codice___not___starts_with;
        private String codice___ends_with;
        private String codice___not___ends_with;
        private String confezione___eq;
        private String confezione___ne;
        private Boolean confezione___null;
        private Boolean confezione___not___null;
        private java.util.List<String> confezione___in;
        private java.util.List<String> confezione___not___in;
        private String confezione___lt;
        private String confezione___lte;
        private String confezione___gt;
        private String confezione___gte;
        private String confezione___contains;
        private String confezione___not___contains;
        private String confezione___starts_with;
        private String confezione___not___starts_with;
        private String confezione___ends_with;
        private String confezione___not___ends_with;
        private String data_fine_commercio___eq;
        private String data_fine_commercio___ne;
        private Boolean data_fine_commercio___null;
        private Boolean data_fine_commercio___not___null;
        private java.util.List<String> data_fine_commercio___in;
        private java.util.List<String> data_fine_commercio___not___in;
        private String data_fine_commercio___lt;
        private String data_fine_commercio___lte;
        private String data_fine_commercio___gt;
        private String data_fine_commercio___gte;
        private String data_fine_commercio___contains;
        private String data_fine_commercio___not___contains;
        private String data_fine_commercio___starts_with;
        private String data_fine_commercio___not___starts_with;
        private String data_fine_commercio___ends_with;
        private String data_fine_commercio___not___ends_with;
        private String data_fine_validita_aic___eq;
        private String data_fine_validita_aic___ne;
        private Boolean data_fine_validita_aic___null;
        private Boolean data_fine_validita_aic___not___null;
        private java.util.List<String> data_fine_validita_aic___in;
        private java.util.List<String> data_fine_validita_aic___not___in;
        private String data_fine_validita_aic___lt;
        private String data_fine_validita_aic___lte;
        private String data_fine_validita_aic___gt;
        private String data_fine_validita_aic___gte;
        private String data_fine_validita_aic___contains;
        private String data_fine_validita_aic___not___contains;
        private String data_fine_validita_aic___starts_with;
        private String data_fine_validita_aic___not___starts_with;
        private String data_fine_validita_aic___ends_with;
        private String data_fine_validita_aic___not___ends_with;
        private String data_inizio_commercio___eq;
        private String data_inizio_commercio___ne;
        private Boolean data_inizio_commercio___null;
        private Boolean data_inizio_commercio___not___null;
        private java.util.List<String> data_inizio_commercio___in;
        private java.util.List<String> data_inizio_commercio___not___in;
        private String data_inizio_commercio___lt;
        private String data_inizio_commercio___lte;
        private String data_inizio_commercio___gt;
        private String data_inizio_commercio___gte;
        private String data_inizio_commercio___contains;
        private String data_inizio_commercio___not___contains;
        private String data_inizio_commercio___starts_with;
        private String data_inizio_commercio___not___starts_with;
        private String data_inizio_commercio___ends_with;
        private String data_inizio_commercio___not___ends_with;
        private String data_inizio_validita_aic___eq;
        private String data_inizio_validita_aic___ne;
        private Boolean data_inizio_validita_aic___null;
        private Boolean data_inizio_validita_aic___not___null;
        private java.util.List<String> data_inizio_validita_aic___in;
        private java.util.List<String> data_inizio_validita_aic___not___in;
        private String data_inizio_validita_aic___lt;
        private String data_inizio_validita_aic___lte;
        private String data_inizio_validita_aic___gt;
        private String data_inizio_validita_aic___gte;
        private String data_inizio_validita_aic___contains;
        private String data_inizio_validita_aic___not___contains;
        private String data_inizio_validita_aic___starts_with;
        private String data_inizio_validita_aic___not___starts_with;
        private String data_inizio_validita_aic___ends_with;
        private String data_inizio_validita_aic___not___ends_with;
        private String marchio___eq;
        private String marchio___ne;
        private Boolean marchio___null;
        private Boolean marchio___not___null;
        private java.util.List<String> marchio___in;
        private java.util.List<String> marchio___not___in;
        private String marchio___lt;
        private String marchio___lte;
        private String marchio___gt;
        private String marchio___gte;
        private String marchio___contains;
        private String marchio___not___contains;
        private String marchio___starts_with;
        private String marchio___not___starts_with;
        private String marchio___ends_with;
        private String marchio___not___ends_with;
        private String principio_attivo___eq;
        private String principio_attivo___ne;
        private Boolean principio_attivo___null;
        private Boolean principio_attivo___not___null;
        private java.util.List<String> principio_attivo___in;
        private java.util.List<String> principio_attivo___not___in;
        private String principio_attivo___lt;
        private String principio_attivo___lte;
        private String principio_attivo___gt;
        private String principio_attivo___gte;
        private String principio_attivo___contains;
        private String principio_attivo___not___contains;
        private String principio_attivo___starts_with;
        private String principio_attivo___not___starts_with;
        private String principio_attivo___ends_with;
        private String principio_attivo___not___ends_with;
        private String qta_principio_attivo___eq;
        private String qta_principio_attivo___ne;
        private Boolean qta_principio_attivo___null;
        private Boolean qta_principio_attivo___not___null;
        private java.util.List<String> qta_principio_attivo___in;
        private java.util.List<String> qta_principio_attivo___not___in;
        private String qta_principio_attivo___lt;
        private String qta_principio_attivo___lte;
        private String qta_principio_attivo___gt;
        private String qta_principio_attivo___gte;
        private String qta_principio_attivo___contains;
        private String qta_principio_attivo___not___contains;
        private String qta_principio_attivo___starts_with;
        private String qta_principio_attivo___not___starts_with;
        private String qta_principio_attivo___ends_with;
        private String qta_principio_attivo___not___ends_with;
        private java.util.List<CliAICFilterDTO> AND;
        private java.util.List<CliAICFilterDTO> OR;
        private CliAICFilterDTO NOT;

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

        public Builder setAzienda___eq(String azienda___eq) {
            this.azienda___eq = azienda___eq;
            return this;
        }

        public Builder setAzienda___ne(String azienda___ne) {
            this.azienda___ne = azienda___ne;
            return this;
        }

        public Builder setAzienda___null(Boolean azienda___null) {
            this.azienda___null = azienda___null;
            return this;
        }

        public Builder setAzienda___not___null(Boolean azienda___not___null) {
            this.azienda___not___null = azienda___not___null;
            return this;
        }

        public Builder setAzienda___in(java.util.List<String> azienda___in) {
            this.azienda___in = azienda___in;
            return this;
        }

        public Builder setAzienda___not___in(java.util.List<String> azienda___not___in) {
            this.azienda___not___in = azienda___not___in;
            return this;
        }

        public Builder setAzienda___lt(String azienda___lt) {
            this.azienda___lt = azienda___lt;
            return this;
        }

        public Builder setAzienda___lte(String azienda___lte) {
            this.azienda___lte = azienda___lte;
            return this;
        }

        public Builder setAzienda___gt(String azienda___gt) {
            this.azienda___gt = azienda___gt;
            return this;
        }

        public Builder setAzienda___gte(String azienda___gte) {
            this.azienda___gte = azienda___gte;
            return this;
        }

        public Builder setAzienda___contains(String azienda___contains) {
            this.azienda___contains = azienda___contains;
            return this;
        }

        public Builder setAzienda___not___contains(String azienda___not___contains) {
            this.azienda___not___contains = azienda___not___contains;
            return this;
        }

        public Builder setAzienda___starts_with(String azienda___starts_with) {
            this.azienda___starts_with = azienda___starts_with;
            return this;
        }

        public Builder setAzienda___not___starts_with(String azienda___not___starts_with) {
            this.azienda___not___starts_with = azienda___not___starts_with;
            return this;
        }

        public Builder setAzienda___ends_with(String azienda___ends_with) {
            this.azienda___ends_with = azienda___ends_with;
            return this;
        }

        public Builder setAzienda___not___ends_with(String azienda___not___ends_with) {
            this.azienda___not___ends_with = azienda___not___ends_with;
            return this;
        }

        public Builder setCodice___eq(String codice___eq) {
            this.codice___eq = codice___eq;
            return this;
        }

        public Builder setCodice___ne(String codice___ne) {
            this.codice___ne = codice___ne;
            return this;
        }

        public Builder setCodice___null(Boolean codice___null) {
            this.codice___null = codice___null;
            return this;
        }

        public Builder setCodice___not___null(Boolean codice___not___null) {
            this.codice___not___null = codice___not___null;
            return this;
        }

        public Builder setCodice___in(java.util.List<String> codice___in) {
            this.codice___in = codice___in;
            return this;
        }

        public Builder setCodice___not___in(java.util.List<String> codice___not___in) {
            this.codice___not___in = codice___not___in;
            return this;
        }

        public Builder setCodice___lt(String codice___lt) {
            this.codice___lt = codice___lt;
            return this;
        }

        public Builder setCodice___lte(String codice___lte) {
            this.codice___lte = codice___lte;
            return this;
        }

        public Builder setCodice___gt(String codice___gt) {
            this.codice___gt = codice___gt;
            return this;
        }

        public Builder setCodice___gte(String codice___gte) {
            this.codice___gte = codice___gte;
            return this;
        }

        public Builder setCodice___contains(String codice___contains) {
            this.codice___contains = codice___contains;
            return this;
        }

        public Builder setCodice___not___contains(String codice___not___contains) {
            this.codice___not___contains = codice___not___contains;
            return this;
        }

        public Builder setCodice___starts_with(String codice___starts_with) {
            this.codice___starts_with = codice___starts_with;
            return this;
        }

        public Builder setCodice___not___starts_with(String codice___not___starts_with) {
            this.codice___not___starts_with = codice___not___starts_with;
            return this;
        }

        public Builder setCodice___ends_with(String codice___ends_with) {
            this.codice___ends_with = codice___ends_with;
            return this;
        }

        public Builder setCodice___not___ends_with(String codice___not___ends_with) {
            this.codice___not___ends_with = codice___not___ends_with;
            return this;
        }

        public Builder setConfezione___eq(String confezione___eq) {
            this.confezione___eq = confezione___eq;
            return this;
        }

        public Builder setConfezione___ne(String confezione___ne) {
            this.confezione___ne = confezione___ne;
            return this;
        }

        public Builder setConfezione___null(Boolean confezione___null) {
            this.confezione___null = confezione___null;
            return this;
        }

        public Builder setConfezione___not___null(Boolean confezione___not___null) {
            this.confezione___not___null = confezione___not___null;
            return this;
        }

        public Builder setConfezione___in(java.util.List<String> confezione___in) {
            this.confezione___in = confezione___in;
            return this;
        }

        public Builder setConfezione___not___in(java.util.List<String> confezione___not___in) {
            this.confezione___not___in = confezione___not___in;
            return this;
        }

        public Builder setConfezione___lt(String confezione___lt) {
            this.confezione___lt = confezione___lt;
            return this;
        }

        public Builder setConfezione___lte(String confezione___lte) {
            this.confezione___lte = confezione___lte;
            return this;
        }

        public Builder setConfezione___gt(String confezione___gt) {
            this.confezione___gt = confezione___gt;
            return this;
        }

        public Builder setConfezione___gte(String confezione___gte) {
            this.confezione___gte = confezione___gte;
            return this;
        }

        public Builder setConfezione___contains(String confezione___contains) {
            this.confezione___contains = confezione___contains;
            return this;
        }

        public Builder setConfezione___not___contains(String confezione___not___contains) {
            this.confezione___not___contains = confezione___not___contains;
            return this;
        }

        public Builder setConfezione___starts_with(String confezione___starts_with) {
            this.confezione___starts_with = confezione___starts_with;
            return this;
        }

        public Builder setConfezione___not___starts_with(String confezione___not___starts_with) {
            this.confezione___not___starts_with = confezione___not___starts_with;
            return this;
        }

        public Builder setConfezione___ends_with(String confezione___ends_with) {
            this.confezione___ends_with = confezione___ends_with;
            return this;
        }

        public Builder setConfezione___not___ends_with(String confezione___not___ends_with) {
            this.confezione___not___ends_with = confezione___not___ends_with;
            return this;
        }

        public Builder setData_fine_commercio___eq(String data_fine_commercio___eq) {
            this.data_fine_commercio___eq = data_fine_commercio___eq;
            return this;
        }

        public Builder setData_fine_commercio___ne(String data_fine_commercio___ne) {
            this.data_fine_commercio___ne = data_fine_commercio___ne;
            return this;
        }

        public Builder setData_fine_commercio___null(Boolean data_fine_commercio___null) {
            this.data_fine_commercio___null = data_fine_commercio___null;
            return this;
        }

        public Builder setData_fine_commercio___not___null(Boolean data_fine_commercio___not___null) {
            this.data_fine_commercio___not___null = data_fine_commercio___not___null;
            return this;
        }

        public Builder setData_fine_commercio___in(java.util.List<String> data_fine_commercio___in) {
            this.data_fine_commercio___in = data_fine_commercio___in;
            return this;
        }

        public Builder setData_fine_commercio___not___in(java.util.List<String> data_fine_commercio___not___in) {
            this.data_fine_commercio___not___in = data_fine_commercio___not___in;
            return this;
        }

        public Builder setData_fine_commercio___lt(String data_fine_commercio___lt) {
            this.data_fine_commercio___lt = data_fine_commercio___lt;
            return this;
        }

        public Builder setData_fine_commercio___lte(String data_fine_commercio___lte) {
            this.data_fine_commercio___lte = data_fine_commercio___lte;
            return this;
        }

        public Builder setData_fine_commercio___gt(String data_fine_commercio___gt) {
            this.data_fine_commercio___gt = data_fine_commercio___gt;
            return this;
        }

        public Builder setData_fine_commercio___gte(String data_fine_commercio___gte) {
            this.data_fine_commercio___gte = data_fine_commercio___gte;
            return this;
        }

        public Builder setData_fine_commercio___contains(String data_fine_commercio___contains) {
            this.data_fine_commercio___contains = data_fine_commercio___contains;
            return this;
        }

        public Builder setData_fine_commercio___not___contains(String data_fine_commercio___not___contains) {
            this.data_fine_commercio___not___contains = data_fine_commercio___not___contains;
            return this;
        }

        public Builder setData_fine_commercio___starts_with(String data_fine_commercio___starts_with) {
            this.data_fine_commercio___starts_with = data_fine_commercio___starts_with;
            return this;
        }

        public Builder setData_fine_commercio___not___starts_with(String data_fine_commercio___not___starts_with) {
            this.data_fine_commercio___not___starts_with = data_fine_commercio___not___starts_with;
            return this;
        }

        public Builder setData_fine_commercio___ends_with(String data_fine_commercio___ends_with) {
            this.data_fine_commercio___ends_with = data_fine_commercio___ends_with;
            return this;
        }

        public Builder setData_fine_commercio___not___ends_with(String data_fine_commercio___not___ends_with) {
            this.data_fine_commercio___not___ends_with = data_fine_commercio___not___ends_with;
            return this;
        }

        public Builder setData_fine_validita_aic___eq(String data_fine_validita_aic___eq) {
            this.data_fine_validita_aic___eq = data_fine_validita_aic___eq;
            return this;
        }

        public Builder setData_fine_validita_aic___ne(String data_fine_validita_aic___ne) {
            this.data_fine_validita_aic___ne = data_fine_validita_aic___ne;
            return this;
        }

        public Builder setData_fine_validita_aic___null(Boolean data_fine_validita_aic___null) {
            this.data_fine_validita_aic___null = data_fine_validita_aic___null;
            return this;
        }

        public Builder setData_fine_validita_aic___not___null(Boolean data_fine_validita_aic___not___null) {
            this.data_fine_validita_aic___not___null = data_fine_validita_aic___not___null;
            return this;
        }

        public Builder setData_fine_validita_aic___in(java.util.List<String> data_fine_validita_aic___in) {
            this.data_fine_validita_aic___in = data_fine_validita_aic___in;
            return this;
        }

        public Builder setData_fine_validita_aic___not___in(java.util.List<String> data_fine_validita_aic___not___in) {
            this.data_fine_validita_aic___not___in = data_fine_validita_aic___not___in;
            return this;
        }

        public Builder setData_fine_validita_aic___lt(String data_fine_validita_aic___lt) {
            this.data_fine_validita_aic___lt = data_fine_validita_aic___lt;
            return this;
        }

        public Builder setData_fine_validita_aic___lte(String data_fine_validita_aic___lte) {
            this.data_fine_validita_aic___lte = data_fine_validita_aic___lte;
            return this;
        }

        public Builder setData_fine_validita_aic___gt(String data_fine_validita_aic___gt) {
            this.data_fine_validita_aic___gt = data_fine_validita_aic___gt;
            return this;
        }

        public Builder setData_fine_validita_aic___gte(String data_fine_validita_aic___gte) {
            this.data_fine_validita_aic___gte = data_fine_validita_aic___gte;
            return this;
        }

        public Builder setData_fine_validita_aic___contains(String data_fine_validita_aic___contains) {
            this.data_fine_validita_aic___contains = data_fine_validita_aic___contains;
            return this;
        }

        public Builder setData_fine_validita_aic___not___contains(String data_fine_validita_aic___not___contains) {
            this.data_fine_validita_aic___not___contains = data_fine_validita_aic___not___contains;
            return this;
        }

        public Builder setData_fine_validita_aic___starts_with(String data_fine_validita_aic___starts_with) {
            this.data_fine_validita_aic___starts_with = data_fine_validita_aic___starts_with;
            return this;
        }

        public Builder setData_fine_validita_aic___not___starts_with(String data_fine_validita_aic___not___starts_with) {
            this.data_fine_validita_aic___not___starts_with = data_fine_validita_aic___not___starts_with;
            return this;
        }

        public Builder setData_fine_validita_aic___ends_with(String data_fine_validita_aic___ends_with) {
            this.data_fine_validita_aic___ends_with = data_fine_validita_aic___ends_with;
            return this;
        }

        public Builder setData_fine_validita_aic___not___ends_with(String data_fine_validita_aic___not___ends_with) {
            this.data_fine_validita_aic___not___ends_with = data_fine_validita_aic___not___ends_with;
            return this;
        }

        public Builder setData_inizio_commercio___eq(String data_inizio_commercio___eq) {
            this.data_inizio_commercio___eq = data_inizio_commercio___eq;
            return this;
        }

        public Builder setData_inizio_commercio___ne(String data_inizio_commercio___ne) {
            this.data_inizio_commercio___ne = data_inizio_commercio___ne;
            return this;
        }

        public Builder setData_inizio_commercio___null(Boolean data_inizio_commercio___null) {
            this.data_inizio_commercio___null = data_inizio_commercio___null;
            return this;
        }

        public Builder setData_inizio_commercio___not___null(Boolean data_inizio_commercio___not___null) {
            this.data_inizio_commercio___not___null = data_inizio_commercio___not___null;
            return this;
        }

        public Builder setData_inizio_commercio___in(java.util.List<String> data_inizio_commercio___in) {
            this.data_inizio_commercio___in = data_inizio_commercio___in;
            return this;
        }

        public Builder setData_inizio_commercio___not___in(java.util.List<String> data_inizio_commercio___not___in) {
            this.data_inizio_commercio___not___in = data_inizio_commercio___not___in;
            return this;
        }

        public Builder setData_inizio_commercio___lt(String data_inizio_commercio___lt) {
            this.data_inizio_commercio___lt = data_inizio_commercio___lt;
            return this;
        }

        public Builder setData_inizio_commercio___lte(String data_inizio_commercio___lte) {
            this.data_inizio_commercio___lte = data_inizio_commercio___lte;
            return this;
        }

        public Builder setData_inizio_commercio___gt(String data_inizio_commercio___gt) {
            this.data_inizio_commercio___gt = data_inizio_commercio___gt;
            return this;
        }

        public Builder setData_inizio_commercio___gte(String data_inizio_commercio___gte) {
            this.data_inizio_commercio___gte = data_inizio_commercio___gte;
            return this;
        }

        public Builder setData_inizio_commercio___contains(String data_inizio_commercio___contains) {
            this.data_inizio_commercio___contains = data_inizio_commercio___contains;
            return this;
        }

        public Builder setData_inizio_commercio___not___contains(String data_inizio_commercio___not___contains) {
            this.data_inizio_commercio___not___contains = data_inizio_commercio___not___contains;
            return this;
        }

        public Builder setData_inizio_commercio___starts_with(String data_inizio_commercio___starts_with) {
            this.data_inizio_commercio___starts_with = data_inizio_commercio___starts_with;
            return this;
        }

        public Builder setData_inizio_commercio___not___starts_with(String data_inizio_commercio___not___starts_with) {
            this.data_inizio_commercio___not___starts_with = data_inizio_commercio___not___starts_with;
            return this;
        }

        public Builder setData_inizio_commercio___ends_with(String data_inizio_commercio___ends_with) {
            this.data_inizio_commercio___ends_with = data_inizio_commercio___ends_with;
            return this;
        }

        public Builder setData_inizio_commercio___not___ends_with(String data_inizio_commercio___not___ends_with) {
            this.data_inizio_commercio___not___ends_with = data_inizio_commercio___not___ends_with;
            return this;
        }

        public Builder setData_inizio_validita_aic___eq(String data_inizio_validita_aic___eq) {
            this.data_inizio_validita_aic___eq = data_inizio_validita_aic___eq;
            return this;
        }

        public Builder setData_inizio_validita_aic___ne(String data_inizio_validita_aic___ne) {
            this.data_inizio_validita_aic___ne = data_inizio_validita_aic___ne;
            return this;
        }

        public Builder setData_inizio_validita_aic___null(Boolean data_inizio_validita_aic___null) {
            this.data_inizio_validita_aic___null = data_inizio_validita_aic___null;
            return this;
        }

        public Builder setData_inizio_validita_aic___not___null(Boolean data_inizio_validita_aic___not___null) {
            this.data_inizio_validita_aic___not___null = data_inizio_validita_aic___not___null;
            return this;
        }

        public Builder setData_inizio_validita_aic___in(java.util.List<String> data_inizio_validita_aic___in) {
            this.data_inizio_validita_aic___in = data_inizio_validita_aic___in;
            return this;
        }

        public Builder setData_inizio_validita_aic___not___in(java.util.List<String> data_inizio_validita_aic___not___in) {
            this.data_inizio_validita_aic___not___in = data_inizio_validita_aic___not___in;
            return this;
        }

        public Builder setData_inizio_validita_aic___lt(String data_inizio_validita_aic___lt) {
            this.data_inizio_validita_aic___lt = data_inizio_validita_aic___lt;
            return this;
        }

        public Builder setData_inizio_validita_aic___lte(String data_inizio_validita_aic___lte) {
            this.data_inizio_validita_aic___lte = data_inizio_validita_aic___lte;
            return this;
        }

        public Builder setData_inizio_validita_aic___gt(String data_inizio_validita_aic___gt) {
            this.data_inizio_validita_aic___gt = data_inizio_validita_aic___gt;
            return this;
        }

        public Builder setData_inizio_validita_aic___gte(String data_inizio_validita_aic___gte) {
            this.data_inizio_validita_aic___gte = data_inizio_validita_aic___gte;
            return this;
        }

        public Builder setData_inizio_validita_aic___contains(String data_inizio_validita_aic___contains) {
            this.data_inizio_validita_aic___contains = data_inizio_validita_aic___contains;
            return this;
        }

        public Builder setData_inizio_validita_aic___not___contains(String data_inizio_validita_aic___not___contains) {
            this.data_inizio_validita_aic___not___contains = data_inizio_validita_aic___not___contains;
            return this;
        }

        public Builder setData_inizio_validita_aic___starts_with(String data_inizio_validita_aic___starts_with) {
            this.data_inizio_validita_aic___starts_with = data_inizio_validita_aic___starts_with;
            return this;
        }

        public Builder setData_inizio_validita_aic___not___starts_with(String data_inizio_validita_aic___not___starts_with) {
            this.data_inizio_validita_aic___not___starts_with = data_inizio_validita_aic___not___starts_with;
            return this;
        }

        public Builder setData_inizio_validita_aic___ends_with(String data_inizio_validita_aic___ends_with) {
            this.data_inizio_validita_aic___ends_with = data_inizio_validita_aic___ends_with;
            return this;
        }

        public Builder setData_inizio_validita_aic___not___ends_with(String data_inizio_validita_aic___not___ends_with) {
            this.data_inizio_validita_aic___not___ends_with = data_inizio_validita_aic___not___ends_with;
            return this;
        }

        public Builder setMarchio___eq(String marchio___eq) {
            this.marchio___eq = marchio___eq;
            return this;
        }

        public Builder setMarchio___ne(String marchio___ne) {
            this.marchio___ne = marchio___ne;
            return this;
        }

        public Builder setMarchio___null(Boolean marchio___null) {
            this.marchio___null = marchio___null;
            return this;
        }

        public Builder setMarchio___not___null(Boolean marchio___not___null) {
            this.marchio___not___null = marchio___not___null;
            return this;
        }

        public Builder setMarchio___in(java.util.List<String> marchio___in) {
            this.marchio___in = marchio___in;
            return this;
        }

        public Builder setMarchio___not___in(java.util.List<String> marchio___not___in) {
            this.marchio___not___in = marchio___not___in;
            return this;
        }

        public Builder setMarchio___lt(String marchio___lt) {
            this.marchio___lt = marchio___lt;
            return this;
        }

        public Builder setMarchio___lte(String marchio___lte) {
            this.marchio___lte = marchio___lte;
            return this;
        }

        public Builder setMarchio___gt(String marchio___gt) {
            this.marchio___gt = marchio___gt;
            return this;
        }

        public Builder setMarchio___gte(String marchio___gte) {
            this.marchio___gte = marchio___gte;
            return this;
        }

        public Builder setMarchio___contains(String marchio___contains) {
            this.marchio___contains = marchio___contains;
            return this;
        }

        public Builder setMarchio___not___contains(String marchio___not___contains) {
            this.marchio___not___contains = marchio___not___contains;
            return this;
        }

        public Builder setMarchio___starts_with(String marchio___starts_with) {
            this.marchio___starts_with = marchio___starts_with;
            return this;
        }

        public Builder setMarchio___not___starts_with(String marchio___not___starts_with) {
            this.marchio___not___starts_with = marchio___not___starts_with;
            return this;
        }

        public Builder setMarchio___ends_with(String marchio___ends_with) {
            this.marchio___ends_with = marchio___ends_with;
            return this;
        }

        public Builder setMarchio___not___ends_with(String marchio___not___ends_with) {
            this.marchio___not___ends_with = marchio___not___ends_with;
            return this;
        }

        public Builder setPrincipio_attivo___eq(String principio_attivo___eq) {
            this.principio_attivo___eq = principio_attivo___eq;
            return this;
        }

        public Builder setPrincipio_attivo___ne(String principio_attivo___ne) {
            this.principio_attivo___ne = principio_attivo___ne;
            return this;
        }

        public Builder setPrincipio_attivo___null(Boolean principio_attivo___null) {
            this.principio_attivo___null = principio_attivo___null;
            return this;
        }

        public Builder setPrincipio_attivo___not___null(Boolean principio_attivo___not___null) {
            this.principio_attivo___not___null = principio_attivo___not___null;
            return this;
        }

        public Builder setPrincipio_attivo___in(java.util.List<String> principio_attivo___in) {
            this.principio_attivo___in = principio_attivo___in;
            return this;
        }

        public Builder setPrincipio_attivo___not___in(java.util.List<String> principio_attivo___not___in) {
            this.principio_attivo___not___in = principio_attivo___not___in;
            return this;
        }

        public Builder setPrincipio_attivo___lt(String principio_attivo___lt) {
            this.principio_attivo___lt = principio_attivo___lt;
            return this;
        }

        public Builder setPrincipio_attivo___lte(String principio_attivo___lte) {
            this.principio_attivo___lte = principio_attivo___lte;
            return this;
        }

        public Builder setPrincipio_attivo___gt(String principio_attivo___gt) {
            this.principio_attivo___gt = principio_attivo___gt;
            return this;
        }

        public Builder setPrincipio_attivo___gte(String principio_attivo___gte) {
            this.principio_attivo___gte = principio_attivo___gte;
            return this;
        }

        public Builder setPrincipio_attivo___contains(String principio_attivo___contains) {
            this.principio_attivo___contains = principio_attivo___contains;
            return this;
        }

        public Builder setPrincipio_attivo___not___contains(String principio_attivo___not___contains) {
            this.principio_attivo___not___contains = principio_attivo___not___contains;
            return this;
        }

        public Builder setPrincipio_attivo___starts_with(String principio_attivo___starts_with) {
            this.principio_attivo___starts_with = principio_attivo___starts_with;
            return this;
        }

        public Builder setPrincipio_attivo___not___starts_with(String principio_attivo___not___starts_with) {
            this.principio_attivo___not___starts_with = principio_attivo___not___starts_with;
            return this;
        }

        public Builder setPrincipio_attivo___ends_with(String principio_attivo___ends_with) {
            this.principio_attivo___ends_with = principio_attivo___ends_with;
            return this;
        }

        public Builder setPrincipio_attivo___not___ends_with(String principio_attivo___not___ends_with) {
            this.principio_attivo___not___ends_with = principio_attivo___not___ends_with;
            return this;
        }

        public Builder setQta_principio_attivo___eq(String qta_principio_attivo___eq) {
            this.qta_principio_attivo___eq = qta_principio_attivo___eq;
            return this;
        }

        public Builder setQta_principio_attivo___ne(String qta_principio_attivo___ne) {
            this.qta_principio_attivo___ne = qta_principio_attivo___ne;
            return this;
        }

        public Builder setQta_principio_attivo___null(Boolean qta_principio_attivo___null) {
            this.qta_principio_attivo___null = qta_principio_attivo___null;
            return this;
        }

        public Builder setQta_principio_attivo___not___null(Boolean qta_principio_attivo___not___null) {
            this.qta_principio_attivo___not___null = qta_principio_attivo___not___null;
            return this;
        }

        public Builder setQta_principio_attivo___in(java.util.List<String> qta_principio_attivo___in) {
            this.qta_principio_attivo___in = qta_principio_attivo___in;
            return this;
        }

        public Builder setQta_principio_attivo___not___in(java.util.List<String> qta_principio_attivo___not___in) {
            this.qta_principio_attivo___not___in = qta_principio_attivo___not___in;
            return this;
        }

        public Builder setQta_principio_attivo___lt(String qta_principio_attivo___lt) {
            this.qta_principio_attivo___lt = qta_principio_attivo___lt;
            return this;
        }

        public Builder setQta_principio_attivo___lte(String qta_principio_attivo___lte) {
            this.qta_principio_attivo___lte = qta_principio_attivo___lte;
            return this;
        }

        public Builder setQta_principio_attivo___gt(String qta_principio_attivo___gt) {
            this.qta_principio_attivo___gt = qta_principio_attivo___gt;
            return this;
        }

        public Builder setQta_principio_attivo___gte(String qta_principio_attivo___gte) {
            this.qta_principio_attivo___gte = qta_principio_attivo___gte;
            return this;
        }

        public Builder setQta_principio_attivo___contains(String qta_principio_attivo___contains) {
            this.qta_principio_attivo___contains = qta_principio_attivo___contains;
            return this;
        }

        public Builder setQta_principio_attivo___not___contains(String qta_principio_attivo___not___contains) {
            this.qta_principio_attivo___not___contains = qta_principio_attivo___not___contains;
            return this;
        }

        public Builder setQta_principio_attivo___starts_with(String qta_principio_attivo___starts_with) {
            this.qta_principio_attivo___starts_with = qta_principio_attivo___starts_with;
            return this;
        }

        public Builder setQta_principio_attivo___not___starts_with(String qta_principio_attivo___not___starts_with) {
            this.qta_principio_attivo___not___starts_with = qta_principio_attivo___not___starts_with;
            return this;
        }

        public Builder setQta_principio_attivo___ends_with(String qta_principio_attivo___ends_with) {
            this.qta_principio_attivo___ends_with = qta_principio_attivo___ends_with;
            return this;
        }

        public Builder setQta_principio_attivo___not___ends_with(String qta_principio_attivo___not___ends_with) {
            this.qta_principio_attivo___not___ends_with = qta_principio_attivo___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliAICFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliAICFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliAICFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliAICFilterDTO build() {
            CliAICFilterDTO result = new CliAICFilterDTO();
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
            result.setAzienda___eq(this.azienda___eq);
            result.setAzienda___ne(this.azienda___ne);
            result.setAzienda___null(this.azienda___null);
            result.setAzienda___not___null(this.azienda___not___null);
            result.setAzienda___in(this.azienda___in);
            result.setAzienda___not___in(this.azienda___not___in);
            result.setAzienda___lt(this.azienda___lt);
            result.setAzienda___lte(this.azienda___lte);
            result.setAzienda___gt(this.azienda___gt);
            result.setAzienda___gte(this.azienda___gte);
            result.setAzienda___contains(this.azienda___contains);
            result.setAzienda___not___contains(this.azienda___not___contains);
            result.setAzienda___starts_with(this.azienda___starts_with);
            result.setAzienda___not___starts_with(this.azienda___not___starts_with);
            result.setAzienda___ends_with(this.azienda___ends_with);
            result.setAzienda___not___ends_with(this.azienda___not___ends_with);
            result.setCodice___eq(this.codice___eq);
            result.setCodice___ne(this.codice___ne);
            result.setCodice___null(this.codice___null);
            result.setCodice___not___null(this.codice___not___null);
            result.setCodice___in(this.codice___in);
            result.setCodice___not___in(this.codice___not___in);
            result.setCodice___lt(this.codice___lt);
            result.setCodice___lte(this.codice___lte);
            result.setCodice___gt(this.codice___gt);
            result.setCodice___gte(this.codice___gte);
            result.setCodice___contains(this.codice___contains);
            result.setCodice___not___contains(this.codice___not___contains);
            result.setCodice___starts_with(this.codice___starts_with);
            result.setCodice___not___starts_with(this.codice___not___starts_with);
            result.setCodice___ends_with(this.codice___ends_with);
            result.setCodice___not___ends_with(this.codice___not___ends_with);
            result.setConfezione___eq(this.confezione___eq);
            result.setConfezione___ne(this.confezione___ne);
            result.setConfezione___null(this.confezione___null);
            result.setConfezione___not___null(this.confezione___not___null);
            result.setConfezione___in(this.confezione___in);
            result.setConfezione___not___in(this.confezione___not___in);
            result.setConfezione___lt(this.confezione___lt);
            result.setConfezione___lte(this.confezione___lte);
            result.setConfezione___gt(this.confezione___gt);
            result.setConfezione___gte(this.confezione___gte);
            result.setConfezione___contains(this.confezione___contains);
            result.setConfezione___not___contains(this.confezione___not___contains);
            result.setConfezione___starts_with(this.confezione___starts_with);
            result.setConfezione___not___starts_with(this.confezione___not___starts_with);
            result.setConfezione___ends_with(this.confezione___ends_with);
            result.setConfezione___not___ends_with(this.confezione___not___ends_with);
            result.setData_fine_commercio___eq(this.data_fine_commercio___eq);
            result.setData_fine_commercio___ne(this.data_fine_commercio___ne);
            result.setData_fine_commercio___null(this.data_fine_commercio___null);
            result.setData_fine_commercio___not___null(this.data_fine_commercio___not___null);
            result.setData_fine_commercio___in(this.data_fine_commercio___in);
            result.setData_fine_commercio___not___in(this.data_fine_commercio___not___in);
            result.setData_fine_commercio___lt(this.data_fine_commercio___lt);
            result.setData_fine_commercio___lte(this.data_fine_commercio___lte);
            result.setData_fine_commercio___gt(this.data_fine_commercio___gt);
            result.setData_fine_commercio___gte(this.data_fine_commercio___gte);
            result.setData_fine_commercio___contains(this.data_fine_commercio___contains);
            result.setData_fine_commercio___not___contains(this.data_fine_commercio___not___contains);
            result.setData_fine_commercio___starts_with(this.data_fine_commercio___starts_with);
            result.setData_fine_commercio___not___starts_with(this.data_fine_commercio___not___starts_with);
            result.setData_fine_commercio___ends_with(this.data_fine_commercio___ends_with);
            result.setData_fine_commercio___not___ends_with(this.data_fine_commercio___not___ends_with);
            result.setData_fine_validita_aic___eq(this.data_fine_validita_aic___eq);
            result.setData_fine_validita_aic___ne(this.data_fine_validita_aic___ne);
            result.setData_fine_validita_aic___null(this.data_fine_validita_aic___null);
            result.setData_fine_validita_aic___not___null(this.data_fine_validita_aic___not___null);
            result.setData_fine_validita_aic___in(this.data_fine_validita_aic___in);
            result.setData_fine_validita_aic___not___in(this.data_fine_validita_aic___not___in);
            result.setData_fine_validita_aic___lt(this.data_fine_validita_aic___lt);
            result.setData_fine_validita_aic___lte(this.data_fine_validita_aic___lte);
            result.setData_fine_validita_aic___gt(this.data_fine_validita_aic___gt);
            result.setData_fine_validita_aic___gte(this.data_fine_validita_aic___gte);
            result.setData_fine_validita_aic___contains(this.data_fine_validita_aic___contains);
            result.setData_fine_validita_aic___not___contains(this.data_fine_validita_aic___not___contains);
            result.setData_fine_validita_aic___starts_with(this.data_fine_validita_aic___starts_with);
            result.setData_fine_validita_aic___not___starts_with(this.data_fine_validita_aic___not___starts_with);
            result.setData_fine_validita_aic___ends_with(this.data_fine_validita_aic___ends_with);
            result.setData_fine_validita_aic___not___ends_with(this.data_fine_validita_aic___not___ends_with);
            result.setData_inizio_commercio___eq(this.data_inizio_commercio___eq);
            result.setData_inizio_commercio___ne(this.data_inizio_commercio___ne);
            result.setData_inizio_commercio___null(this.data_inizio_commercio___null);
            result.setData_inizio_commercio___not___null(this.data_inizio_commercio___not___null);
            result.setData_inizio_commercio___in(this.data_inizio_commercio___in);
            result.setData_inizio_commercio___not___in(this.data_inizio_commercio___not___in);
            result.setData_inizio_commercio___lt(this.data_inizio_commercio___lt);
            result.setData_inizio_commercio___lte(this.data_inizio_commercio___lte);
            result.setData_inizio_commercio___gt(this.data_inizio_commercio___gt);
            result.setData_inizio_commercio___gte(this.data_inizio_commercio___gte);
            result.setData_inizio_commercio___contains(this.data_inizio_commercio___contains);
            result.setData_inizio_commercio___not___contains(this.data_inizio_commercio___not___contains);
            result.setData_inizio_commercio___starts_with(this.data_inizio_commercio___starts_with);
            result.setData_inizio_commercio___not___starts_with(this.data_inizio_commercio___not___starts_with);
            result.setData_inizio_commercio___ends_with(this.data_inizio_commercio___ends_with);
            result.setData_inizio_commercio___not___ends_with(this.data_inizio_commercio___not___ends_with);
            result.setData_inizio_validita_aic___eq(this.data_inizio_validita_aic___eq);
            result.setData_inizio_validita_aic___ne(this.data_inizio_validita_aic___ne);
            result.setData_inizio_validita_aic___null(this.data_inizio_validita_aic___null);
            result.setData_inizio_validita_aic___not___null(this.data_inizio_validita_aic___not___null);
            result.setData_inizio_validita_aic___in(this.data_inizio_validita_aic___in);
            result.setData_inizio_validita_aic___not___in(this.data_inizio_validita_aic___not___in);
            result.setData_inizio_validita_aic___lt(this.data_inizio_validita_aic___lt);
            result.setData_inizio_validita_aic___lte(this.data_inizio_validita_aic___lte);
            result.setData_inizio_validita_aic___gt(this.data_inizio_validita_aic___gt);
            result.setData_inizio_validita_aic___gte(this.data_inizio_validita_aic___gte);
            result.setData_inizio_validita_aic___contains(this.data_inizio_validita_aic___contains);
            result.setData_inizio_validita_aic___not___contains(this.data_inizio_validita_aic___not___contains);
            result.setData_inizio_validita_aic___starts_with(this.data_inizio_validita_aic___starts_with);
            result.setData_inizio_validita_aic___not___starts_with(this.data_inizio_validita_aic___not___starts_with);
            result.setData_inizio_validita_aic___ends_with(this.data_inizio_validita_aic___ends_with);
            result.setData_inizio_validita_aic___not___ends_with(this.data_inizio_validita_aic___not___ends_with);
            result.setMarchio___eq(this.marchio___eq);
            result.setMarchio___ne(this.marchio___ne);
            result.setMarchio___null(this.marchio___null);
            result.setMarchio___not___null(this.marchio___not___null);
            result.setMarchio___in(this.marchio___in);
            result.setMarchio___not___in(this.marchio___not___in);
            result.setMarchio___lt(this.marchio___lt);
            result.setMarchio___lte(this.marchio___lte);
            result.setMarchio___gt(this.marchio___gt);
            result.setMarchio___gte(this.marchio___gte);
            result.setMarchio___contains(this.marchio___contains);
            result.setMarchio___not___contains(this.marchio___not___contains);
            result.setMarchio___starts_with(this.marchio___starts_with);
            result.setMarchio___not___starts_with(this.marchio___not___starts_with);
            result.setMarchio___ends_with(this.marchio___ends_with);
            result.setMarchio___not___ends_with(this.marchio___not___ends_with);
            result.setPrincipio_attivo___eq(this.principio_attivo___eq);
            result.setPrincipio_attivo___ne(this.principio_attivo___ne);
            result.setPrincipio_attivo___null(this.principio_attivo___null);
            result.setPrincipio_attivo___not___null(this.principio_attivo___not___null);
            result.setPrincipio_attivo___in(this.principio_attivo___in);
            result.setPrincipio_attivo___not___in(this.principio_attivo___not___in);
            result.setPrincipio_attivo___lt(this.principio_attivo___lt);
            result.setPrincipio_attivo___lte(this.principio_attivo___lte);
            result.setPrincipio_attivo___gt(this.principio_attivo___gt);
            result.setPrincipio_attivo___gte(this.principio_attivo___gte);
            result.setPrincipio_attivo___contains(this.principio_attivo___contains);
            result.setPrincipio_attivo___not___contains(this.principio_attivo___not___contains);
            result.setPrincipio_attivo___starts_with(this.principio_attivo___starts_with);
            result.setPrincipio_attivo___not___starts_with(this.principio_attivo___not___starts_with);
            result.setPrincipio_attivo___ends_with(this.principio_attivo___ends_with);
            result.setPrincipio_attivo___not___ends_with(this.principio_attivo___not___ends_with);
            result.setQta_principio_attivo___eq(this.qta_principio_attivo___eq);
            result.setQta_principio_attivo___ne(this.qta_principio_attivo___ne);
            result.setQta_principio_attivo___null(this.qta_principio_attivo___null);
            result.setQta_principio_attivo___not___null(this.qta_principio_attivo___not___null);
            result.setQta_principio_attivo___in(this.qta_principio_attivo___in);
            result.setQta_principio_attivo___not___in(this.qta_principio_attivo___not___in);
            result.setQta_principio_attivo___lt(this.qta_principio_attivo___lt);
            result.setQta_principio_attivo___lte(this.qta_principio_attivo___lte);
            result.setQta_principio_attivo___gt(this.qta_principio_attivo___gt);
            result.setQta_principio_attivo___gte(this.qta_principio_attivo___gte);
            result.setQta_principio_attivo___contains(this.qta_principio_attivo___contains);
            result.setQta_principio_attivo___not___contains(this.qta_principio_attivo___not___contains);
            result.setQta_principio_attivo___starts_with(this.qta_principio_attivo___starts_with);
            result.setQta_principio_attivo___not___starts_with(this.qta_principio_attivo___not___starts_with);
            result.setQta_principio_attivo___ends_with(this.qta_principio_attivo___ends_with);
            result.setQta_principio_attivo___not___ends_with(this.qta_principio_attivo___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
