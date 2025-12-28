package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Checks.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliChecksFilterDTO implements java.io.Serializable {

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
    private String check_id___eq;
    private String check_id___ne;
    private Boolean check_id___null;
    private Boolean check_id___not___null;
    private java.util.List<String> check_id___in;
    private java.util.List<String> check_id___not___in;
    private String check_id___lt;
    private String check_id___lte;
    private String check_id___gt;
    private String check_id___gte;
    private String check_id___contains;
    private String check_id___not___contains;
    private String check_id___starts_with;
    private String check_id___not___starts_with;
    private String check_id___ends_with;
    private String check_id___not___ends_with;
    private String codice_centro_h___eq;
    private String codice_centro_h___ne;
    private Boolean codice_centro_h___null;
    private Boolean codice_centro_h___not___null;
    private java.util.List<String> codice_centro_h___in;
    private java.util.List<String> codice_centro_h___not___in;
    private String codice_centro_h___lt;
    private String codice_centro_h___lte;
    private String codice_centro_h___gt;
    private String codice_centro_h___gte;
    private String codice_centro_h___contains;
    private String codice_centro_h___not___contains;
    private String codice_centro_h___starts_with;
    private String codice_centro_h___not___starts_with;
    private String codice_centro_h___ends_with;
    private String codice_centro_h___not___ends_with;
    private String codice_centro_i___eq;
    private String codice_centro_i___ne;
    private Boolean codice_centro_i___null;
    private Boolean codice_centro_i___not___null;
    private java.util.List<String> codice_centro_i___in;
    private java.util.List<String> codice_centro_i___not___in;
    private String codice_centro_i___lt;
    private String codice_centro_i___lte;
    private String codice_centro_i___gt;
    private String codice_centro_i___gte;
    private String codice_centro_i___contains;
    private String codice_centro_i___not___contains;
    private String codice_centro_i___starts_with;
    private String codice_centro_i___not___starts_with;
    private String codice_centro_i___ends_with;
    private String codice_centro_i___not___ends_with;
    private String codice_hepa___eq;
    private String codice_hepa___ne;
    private Boolean codice_hepa___null;
    private Boolean codice_hepa___not___null;
    private java.util.List<String> codice_hepa___in;
    private java.util.List<String> codice_hepa___not___in;
    private String codice_hepa___lt;
    private String codice_hepa___lte;
    private String codice_hepa___gt;
    private String codice_hepa___gte;
    private String codice_hepa___contains;
    private String codice_hepa___not___contains;
    private String codice_hepa___starts_with;
    private String codice_hepa___not___starts_with;
    private String codice_hepa___ends_with;
    private String codice_hepa___not___ends_with;
    private String codice_ico___eq;
    private String codice_ico___ne;
    private Boolean codice_ico___null;
    private Boolean codice_ico___not___null;
    private java.util.List<String> codice_ico___in;
    private java.util.List<String> codice_ico___not___in;
    private String codice_ico___lt;
    private String codice_ico___lte;
    private String codice_ico___gt;
    private String codice_ico___gte;
    private String codice_ico___contains;
    private String codice_ico___not___contains;
    private String codice_ico___starts_with;
    private String codice_ico___not___starts_with;
    private String codice_ico___ends_with;
    private String codice_ico___not___ends_with;
    private String descrizione___eq;
    private String descrizione___ne;
    private Boolean descrizione___null;
    private Boolean descrizione___not___null;
    private java.util.List<String> descrizione___in;
    private java.util.List<String> descrizione___not___in;
    private String descrizione___lt;
    private String descrizione___lte;
    private String descrizione___gt;
    private String descrizione___gte;
    private String descrizione___contains;
    private String descrizione___not___contains;
    private String descrizione___starts_with;
    private String descrizione___not___starts_with;
    private String descrizione___ends_with;
    private String descrizione___not___ends_with;
    private String note___eq;
    private String note___ne;
    private Boolean note___null;
    private Boolean note___not___null;
    private java.util.List<String> note___in;
    private java.util.List<String> note___not___in;
    private String note___lt;
    private String note___lte;
    private String note___gt;
    private String note___gte;
    private String note___contains;
    private String note___not___contains;
    private String note___starts_with;
    private String note___not___starts_with;
    private String note___ends_with;
    private String note___not___ends_with;
    private Boolean risolto___eq;
    private Boolean risolto___ne;
    private Boolean risolto___null;
    private Boolean risolto___not___null;
    private String specifiche___eq;
    private String specifiche___ne;
    private Boolean specifiche___null;
    private Boolean specifiche___not___null;
    private java.util.List<String> specifiche___in;
    private java.util.List<String> specifiche___not___in;
    private String specifiche___lt;
    private String specifiche___lte;
    private String specifiche___gt;
    private String specifiche___gte;
    private String specifiche___contains;
    private String specifiche___not___contains;
    private String specifiche___starts_with;
    private String specifiche___not___starts_with;
    private String specifiche___ends_with;
    private String specifiche___not___ends_with;
    private java.util.List<CliChecksFilterDTO> AND;
    private java.util.List<CliChecksFilterDTO> OR;
    private CliChecksFilterDTO NOT;

    public CliChecksFilterDTO() {
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

    public String getCheck_id___eq() {
        return check_id___eq;
    }
    public void setCheck_id___eq(String check_id___eq) {
        this.check_id___eq = check_id___eq;
    }

    public String getCheck_id___ne() {
        return check_id___ne;
    }
    public void setCheck_id___ne(String check_id___ne) {
        this.check_id___ne = check_id___ne;
    }

    public Boolean getCheck_id___null() {
        return check_id___null;
    }
    public void setCheck_id___null(Boolean check_id___null) {
        this.check_id___null = check_id___null;
    }

    public Boolean getCheck_id___not___null() {
        return check_id___not___null;
    }
    public void setCheck_id___not___null(Boolean check_id___not___null) {
        this.check_id___not___null = check_id___not___null;
    }

    public java.util.List<String> getCheck_id___in() {
        return check_id___in;
    }
    public void setCheck_id___in(java.util.List<String> check_id___in) {
        this.check_id___in = check_id___in;
    }

    public java.util.List<String> getCheck_id___not___in() {
        return check_id___not___in;
    }
    public void setCheck_id___not___in(java.util.List<String> check_id___not___in) {
        this.check_id___not___in = check_id___not___in;
    }

    public String getCheck_id___lt() {
        return check_id___lt;
    }
    public void setCheck_id___lt(String check_id___lt) {
        this.check_id___lt = check_id___lt;
    }

    public String getCheck_id___lte() {
        return check_id___lte;
    }
    public void setCheck_id___lte(String check_id___lte) {
        this.check_id___lte = check_id___lte;
    }

    public String getCheck_id___gt() {
        return check_id___gt;
    }
    public void setCheck_id___gt(String check_id___gt) {
        this.check_id___gt = check_id___gt;
    }

    public String getCheck_id___gte() {
        return check_id___gte;
    }
    public void setCheck_id___gte(String check_id___gte) {
        this.check_id___gte = check_id___gte;
    }

    public String getCheck_id___contains() {
        return check_id___contains;
    }
    public void setCheck_id___contains(String check_id___contains) {
        this.check_id___contains = check_id___contains;
    }

    public String getCheck_id___not___contains() {
        return check_id___not___contains;
    }
    public void setCheck_id___not___contains(String check_id___not___contains) {
        this.check_id___not___contains = check_id___not___contains;
    }

    public String getCheck_id___starts_with() {
        return check_id___starts_with;
    }
    public void setCheck_id___starts_with(String check_id___starts_with) {
        this.check_id___starts_with = check_id___starts_with;
    }

    public String getCheck_id___not___starts_with() {
        return check_id___not___starts_with;
    }
    public void setCheck_id___not___starts_with(String check_id___not___starts_with) {
        this.check_id___not___starts_with = check_id___not___starts_with;
    }

    public String getCheck_id___ends_with() {
        return check_id___ends_with;
    }
    public void setCheck_id___ends_with(String check_id___ends_with) {
        this.check_id___ends_with = check_id___ends_with;
    }

    public String getCheck_id___not___ends_with() {
        return check_id___not___ends_with;
    }
    public void setCheck_id___not___ends_with(String check_id___not___ends_with) {
        this.check_id___not___ends_with = check_id___not___ends_with;
    }

    public String getCodice_centro_h___eq() {
        return codice_centro_h___eq;
    }
    public void setCodice_centro_h___eq(String codice_centro_h___eq) {
        this.codice_centro_h___eq = codice_centro_h___eq;
    }

    public String getCodice_centro_h___ne() {
        return codice_centro_h___ne;
    }
    public void setCodice_centro_h___ne(String codice_centro_h___ne) {
        this.codice_centro_h___ne = codice_centro_h___ne;
    }

    public Boolean getCodice_centro_h___null() {
        return codice_centro_h___null;
    }
    public void setCodice_centro_h___null(Boolean codice_centro_h___null) {
        this.codice_centro_h___null = codice_centro_h___null;
    }

    public Boolean getCodice_centro_h___not___null() {
        return codice_centro_h___not___null;
    }
    public void setCodice_centro_h___not___null(Boolean codice_centro_h___not___null) {
        this.codice_centro_h___not___null = codice_centro_h___not___null;
    }

    public java.util.List<String> getCodice_centro_h___in() {
        return codice_centro_h___in;
    }
    public void setCodice_centro_h___in(java.util.List<String> codice_centro_h___in) {
        this.codice_centro_h___in = codice_centro_h___in;
    }

    public java.util.List<String> getCodice_centro_h___not___in() {
        return codice_centro_h___not___in;
    }
    public void setCodice_centro_h___not___in(java.util.List<String> codice_centro_h___not___in) {
        this.codice_centro_h___not___in = codice_centro_h___not___in;
    }

    public String getCodice_centro_h___lt() {
        return codice_centro_h___lt;
    }
    public void setCodice_centro_h___lt(String codice_centro_h___lt) {
        this.codice_centro_h___lt = codice_centro_h___lt;
    }

    public String getCodice_centro_h___lte() {
        return codice_centro_h___lte;
    }
    public void setCodice_centro_h___lte(String codice_centro_h___lte) {
        this.codice_centro_h___lte = codice_centro_h___lte;
    }

    public String getCodice_centro_h___gt() {
        return codice_centro_h___gt;
    }
    public void setCodice_centro_h___gt(String codice_centro_h___gt) {
        this.codice_centro_h___gt = codice_centro_h___gt;
    }

    public String getCodice_centro_h___gte() {
        return codice_centro_h___gte;
    }
    public void setCodice_centro_h___gte(String codice_centro_h___gte) {
        this.codice_centro_h___gte = codice_centro_h___gte;
    }

    public String getCodice_centro_h___contains() {
        return codice_centro_h___contains;
    }
    public void setCodice_centro_h___contains(String codice_centro_h___contains) {
        this.codice_centro_h___contains = codice_centro_h___contains;
    }

    public String getCodice_centro_h___not___contains() {
        return codice_centro_h___not___contains;
    }
    public void setCodice_centro_h___not___contains(String codice_centro_h___not___contains) {
        this.codice_centro_h___not___contains = codice_centro_h___not___contains;
    }

    public String getCodice_centro_h___starts_with() {
        return codice_centro_h___starts_with;
    }
    public void setCodice_centro_h___starts_with(String codice_centro_h___starts_with) {
        this.codice_centro_h___starts_with = codice_centro_h___starts_with;
    }

    public String getCodice_centro_h___not___starts_with() {
        return codice_centro_h___not___starts_with;
    }
    public void setCodice_centro_h___not___starts_with(String codice_centro_h___not___starts_with) {
        this.codice_centro_h___not___starts_with = codice_centro_h___not___starts_with;
    }

    public String getCodice_centro_h___ends_with() {
        return codice_centro_h___ends_with;
    }
    public void setCodice_centro_h___ends_with(String codice_centro_h___ends_with) {
        this.codice_centro_h___ends_with = codice_centro_h___ends_with;
    }

    public String getCodice_centro_h___not___ends_with() {
        return codice_centro_h___not___ends_with;
    }
    public void setCodice_centro_h___not___ends_with(String codice_centro_h___not___ends_with) {
        this.codice_centro_h___not___ends_with = codice_centro_h___not___ends_with;
    }

    public String getCodice_centro_i___eq() {
        return codice_centro_i___eq;
    }
    public void setCodice_centro_i___eq(String codice_centro_i___eq) {
        this.codice_centro_i___eq = codice_centro_i___eq;
    }

    public String getCodice_centro_i___ne() {
        return codice_centro_i___ne;
    }
    public void setCodice_centro_i___ne(String codice_centro_i___ne) {
        this.codice_centro_i___ne = codice_centro_i___ne;
    }

    public Boolean getCodice_centro_i___null() {
        return codice_centro_i___null;
    }
    public void setCodice_centro_i___null(Boolean codice_centro_i___null) {
        this.codice_centro_i___null = codice_centro_i___null;
    }

    public Boolean getCodice_centro_i___not___null() {
        return codice_centro_i___not___null;
    }
    public void setCodice_centro_i___not___null(Boolean codice_centro_i___not___null) {
        this.codice_centro_i___not___null = codice_centro_i___not___null;
    }

    public java.util.List<String> getCodice_centro_i___in() {
        return codice_centro_i___in;
    }
    public void setCodice_centro_i___in(java.util.List<String> codice_centro_i___in) {
        this.codice_centro_i___in = codice_centro_i___in;
    }

    public java.util.List<String> getCodice_centro_i___not___in() {
        return codice_centro_i___not___in;
    }
    public void setCodice_centro_i___not___in(java.util.List<String> codice_centro_i___not___in) {
        this.codice_centro_i___not___in = codice_centro_i___not___in;
    }

    public String getCodice_centro_i___lt() {
        return codice_centro_i___lt;
    }
    public void setCodice_centro_i___lt(String codice_centro_i___lt) {
        this.codice_centro_i___lt = codice_centro_i___lt;
    }

    public String getCodice_centro_i___lte() {
        return codice_centro_i___lte;
    }
    public void setCodice_centro_i___lte(String codice_centro_i___lte) {
        this.codice_centro_i___lte = codice_centro_i___lte;
    }

    public String getCodice_centro_i___gt() {
        return codice_centro_i___gt;
    }
    public void setCodice_centro_i___gt(String codice_centro_i___gt) {
        this.codice_centro_i___gt = codice_centro_i___gt;
    }

    public String getCodice_centro_i___gte() {
        return codice_centro_i___gte;
    }
    public void setCodice_centro_i___gte(String codice_centro_i___gte) {
        this.codice_centro_i___gte = codice_centro_i___gte;
    }

    public String getCodice_centro_i___contains() {
        return codice_centro_i___contains;
    }
    public void setCodice_centro_i___contains(String codice_centro_i___contains) {
        this.codice_centro_i___contains = codice_centro_i___contains;
    }

    public String getCodice_centro_i___not___contains() {
        return codice_centro_i___not___contains;
    }
    public void setCodice_centro_i___not___contains(String codice_centro_i___not___contains) {
        this.codice_centro_i___not___contains = codice_centro_i___not___contains;
    }

    public String getCodice_centro_i___starts_with() {
        return codice_centro_i___starts_with;
    }
    public void setCodice_centro_i___starts_with(String codice_centro_i___starts_with) {
        this.codice_centro_i___starts_with = codice_centro_i___starts_with;
    }

    public String getCodice_centro_i___not___starts_with() {
        return codice_centro_i___not___starts_with;
    }
    public void setCodice_centro_i___not___starts_with(String codice_centro_i___not___starts_with) {
        this.codice_centro_i___not___starts_with = codice_centro_i___not___starts_with;
    }

    public String getCodice_centro_i___ends_with() {
        return codice_centro_i___ends_with;
    }
    public void setCodice_centro_i___ends_with(String codice_centro_i___ends_with) {
        this.codice_centro_i___ends_with = codice_centro_i___ends_with;
    }

    public String getCodice_centro_i___not___ends_with() {
        return codice_centro_i___not___ends_with;
    }
    public void setCodice_centro_i___not___ends_with(String codice_centro_i___not___ends_with) {
        this.codice_centro_i___not___ends_with = codice_centro_i___not___ends_with;
    }

    public String getCodice_hepa___eq() {
        return codice_hepa___eq;
    }
    public void setCodice_hepa___eq(String codice_hepa___eq) {
        this.codice_hepa___eq = codice_hepa___eq;
    }

    public String getCodice_hepa___ne() {
        return codice_hepa___ne;
    }
    public void setCodice_hepa___ne(String codice_hepa___ne) {
        this.codice_hepa___ne = codice_hepa___ne;
    }

    public Boolean getCodice_hepa___null() {
        return codice_hepa___null;
    }
    public void setCodice_hepa___null(Boolean codice_hepa___null) {
        this.codice_hepa___null = codice_hepa___null;
    }

    public Boolean getCodice_hepa___not___null() {
        return codice_hepa___not___null;
    }
    public void setCodice_hepa___not___null(Boolean codice_hepa___not___null) {
        this.codice_hepa___not___null = codice_hepa___not___null;
    }

    public java.util.List<String> getCodice_hepa___in() {
        return codice_hepa___in;
    }
    public void setCodice_hepa___in(java.util.List<String> codice_hepa___in) {
        this.codice_hepa___in = codice_hepa___in;
    }

    public java.util.List<String> getCodice_hepa___not___in() {
        return codice_hepa___not___in;
    }
    public void setCodice_hepa___not___in(java.util.List<String> codice_hepa___not___in) {
        this.codice_hepa___not___in = codice_hepa___not___in;
    }

    public String getCodice_hepa___lt() {
        return codice_hepa___lt;
    }
    public void setCodice_hepa___lt(String codice_hepa___lt) {
        this.codice_hepa___lt = codice_hepa___lt;
    }

    public String getCodice_hepa___lte() {
        return codice_hepa___lte;
    }
    public void setCodice_hepa___lte(String codice_hepa___lte) {
        this.codice_hepa___lte = codice_hepa___lte;
    }

    public String getCodice_hepa___gt() {
        return codice_hepa___gt;
    }
    public void setCodice_hepa___gt(String codice_hepa___gt) {
        this.codice_hepa___gt = codice_hepa___gt;
    }

    public String getCodice_hepa___gte() {
        return codice_hepa___gte;
    }
    public void setCodice_hepa___gte(String codice_hepa___gte) {
        this.codice_hepa___gte = codice_hepa___gte;
    }

    public String getCodice_hepa___contains() {
        return codice_hepa___contains;
    }
    public void setCodice_hepa___contains(String codice_hepa___contains) {
        this.codice_hepa___contains = codice_hepa___contains;
    }

    public String getCodice_hepa___not___contains() {
        return codice_hepa___not___contains;
    }
    public void setCodice_hepa___not___contains(String codice_hepa___not___contains) {
        this.codice_hepa___not___contains = codice_hepa___not___contains;
    }

    public String getCodice_hepa___starts_with() {
        return codice_hepa___starts_with;
    }
    public void setCodice_hepa___starts_with(String codice_hepa___starts_with) {
        this.codice_hepa___starts_with = codice_hepa___starts_with;
    }

    public String getCodice_hepa___not___starts_with() {
        return codice_hepa___not___starts_with;
    }
    public void setCodice_hepa___not___starts_with(String codice_hepa___not___starts_with) {
        this.codice_hepa___not___starts_with = codice_hepa___not___starts_with;
    }

    public String getCodice_hepa___ends_with() {
        return codice_hepa___ends_with;
    }
    public void setCodice_hepa___ends_with(String codice_hepa___ends_with) {
        this.codice_hepa___ends_with = codice_hepa___ends_with;
    }

    public String getCodice_hepa___not___ends_with() {
        return codice_hepa___not___ends_with;
    }
    public void setCodice_hepa___not___ends_with(String codice_hepa___not___ends_with) {
        this.codice_hepa___not___ends_with = codice_hepa___not___ends_with;
    }

    public String getCodice_ico___eq() {
        return codice_ico___eq;
    }
    public void setCodice_ico___eq(String codice_ico___eq) {
        this.codice_ico___eq = codice_ico___eq;
    }

    public String getCodice_ico___ne() {
        return codice_ico___ne;
    }
    public void setCodice_ico___ne(String codice_ico___ne) {
        this.codice_ico___ne = codice_ico___ne;
    }

    public Boolean getCodice_ico___null() {
        return codice_ico___null;
    }
    public void setCodice_ico___null(Boolean codice_ico___null) {
        this.codice_ico___null = codice_ico___null;
    }

    public Boolean getCodice_ico___not___null() {
        return codice_ico___not___null;
    }
    public void setCodice_ico___not___null(Boolean codice_ico___not___null) {
        this.codice_ico___not___null = codice_ico___not___null;
    }

    public java.util.List<String> getCodice_ico___in() {
        return codice_ico___in;
    }
    public void setCodice_ico___in(java.util.List<String> codice_ico___in) {
        this.codice_ico___in = codice_ico___in;
    }

    public java.util.List<String> getCodice_ico___not___in() {
        return codice_ico___not___in;
    }
    public void setCodice_ico___not___in(java.util.List<String> codice_ico___not___in) {
        this.codice_ico___not___in = codice_ico___not___in;
    }

    public String getCodice_ico___lt() {
        return codice_ico___lt;
    }
    public void setCodice_ico___lt(String codice_ico___lt) {
        this.codice_ico___lt = codice_ico___lt;
    }

    public String getCodice_ico___lte() {
        return codice_ico___lte;
    }
    public void setCodice_ico___lte(String codice_ico___lte) {
        this.codice_ico___lte = codice_ico___lte;
    }

    public String getCodice_ico___gt() {
        return codice_ico___gt;
    }
    public void setCodice_ico___gt(String codice_ico___gt) {
        this.codice_ico___gt = codice_ico___gt;
    }

    public String getCodice_ico___gte() {
        return codice_ico___gte;
    }
    public void setCodice_ico___gte(String codice_ico___gte) {
        this.codice_ico___gte = codice_ico___gte;
    }

    public String getCodice_ico___contains() {
        return codice_ico___contains;
    }
    public void setCodice_ico___contains(String codice_ico___contains) {
        this.codice_ico___contains = codice_ico___contains;
    }

    public String getCodice_ico___not___contains() {
        return codice_ico___not___contains;
    }
    public void setCodice_ico___not___contains(String codice_ico___not___contains) {
        this.codice_ico___not___contains = codice_ico___not___contains;
    }

    public String getCodice_ico___starts_with() {
        return codice_ico___starts_with;
    }
    public void setCodice_ico___starts_with(String codice_ico___starts_with) {
        this.codice_ico___starts_with = codice_ico___starts_with;
    }

    public String getCodice_ico___not___starts_with() {
        return codice_ico___not___starts_with;
    }
    public void setCodice_ico___not___starts_with(String codice_ico___not___starts_with) {
        this.codice_ico___not___starts_with = codice_ico___not___starts_with;
    }

    public String getCodice_ico___ends_with() {
        return codice_ico___ends_with;
    }
    public void setCodice_ico___ends_with(String codice_ico___ends_with) {
        this.codice_ico___ends_with = codice_ico___ends_with;
    }

    public String getCodice_ico___not___ends_with() {
        return codice_ico___not___ends_with;
    }
    public void setCodice_ico___not___ends_with(String codice_ico___not___ends_with) {
        this.codice_ico___not___ends_with = codice_ico___not___ends_with;
    }

    public String getDescrizione___eq() {
        return descrizione___eq;
    }
    public void setDescrizione___eq(String descrizione___eq) {
        this.descrizione___eq = descrizione___eq;
    }

    public String getDescrizione___ne() {
        return descrizione___ne;
    }
    public void setDescrizione___ne(String descrizione___ne) {
        this.descrizione___ne = descrizione___ne;
    }

    public Boolean getDescrizione___null() {
        return descrizione___null;
    }
    public void setDescrizione___null(Boolean descrizione___null) {
        this.descrizione___null = descrizione___null;
    }

    public Boolean getDescrizione___not___null() {
        return descrizione___not___null;
    }
    public void setDescrizione___not___null(Boolean descrizione___not___null) {
        this.descrizione___not___null = descrizione___not___null;
    }

    public java.util.List<String> getDescrizione___in() {
        return descrizione___in;
    }
    public void setDescrizione___in(java.util.List<String> descrizione___in) {
        this.descrizione___in = descrizione___in;
    }

    public java.util.List<String> getDescrizione___not___in() {
        return descrizione___not___in;
    }
    public void setDescrizione___not___in(java.util.List<String> descrizione___not___in) {
        this.descrizione___not___in = descrizione___not___in;
    }

    public String getDescrizione___lt() {
        return descrizione___lt;
    }
    public void setDescrizione___lt(String descrizione___lt) {
        this.descrizione___lt = descrizione___lt;
    }

    public String getDescrizione___lte() {
        return descrizione___lte;
    }
    public void setDescrizione___lte(String descrizione___lte) {
        this.descrizione___lte = descrizione___lte;
    }

    public String getDescrizione___gt() {
        return descrizione___gt;
    }
    public void setDescrizione___gt(String descrizione___gt) {
        this.descrizione___gt = descrizione___gt;
    }

    public String getDescrizione___gte() {
        return descrizione___gte;
    }
    public void setDescrizione___gte(String descrizione___gte) {
        this.descrizione___gte = descrizione___gte;
    }

    public String getDescrizione___contains() {
        return descrizione___contains;
    }
    public void setDescrizione___contains(String descrizione___contains) {
        this.descrizione___contains = descrizione___contains;
    }

    public String getDescrizione___not___contains() {
        return descrizione___not___contains;
    }
    public void setDescrizione___not___contains(String descrizione___not___contains) {
        this.descrizione___not___contains = descrizione___not___contains;
    }

    public String getDescrizione___starts_with() {
        return descrizione___starts_with;
    }
    public void setDescrizione___starts_with(String descrizione___starts_with) {
        this.descrizione___starts_with = descrizione___starts_with;
    }

    public String getDescrizione___not___starts_with() {
        return descrizione___not___starts_with;
    }
    public void setDescrizione___not___starts_with(String descrizione___not___starts_with) {
        this.descrizione___not___starts_with = descrizione___not___starts_with;
    }

    public String getDescrizione___ends_with() {
        return descrizione___ends_with;
    }
    public void setDescrizione___ends_with(String descrizione___ends_with) {
        this.descrizione___ends_with = descrizione___ends_with;
    }

    public String getDescrizione___not___ends_with() {
        return descrizione___not___ends_with;
    }
    public void setDescrizione___not___ends_with(String descrizione___not___ends_with) {
        this.descrizione___not___ends_with = descrizione___not___ends_with;
    }

    public String getNote___eq() {
        return note___eq;
    }
    public void setNote___eq(String note___eq) {
        this.note___eq = note___eq;
    }

    public String getNote___ne() {
        return note___ne;
    }
    public void setNote___ne(String note___ne) {
        this.note___ne = note___ne;
    }

    public Boolean getNote___null() {
        return note___null;
    }
    public void setNote___null(Boolean note___null) {
        this.note___null = note___null;
    }

    public Boolean getNote___not___null() {
        return note___not___null;
    }
    public void setNote___not___null(Boolean note___not___null) {
        this.note___not___null = note___not___null;
    }

    public java.util.List<String> getNote___in() {
        return note___in;
    }
    public void setNote___in(java.util.List<String> note___in) {
        this.note___in = note___in;
    }

    public java.util.List<String> getNote___not___in() {
        return note___not___in;
    }
    public void setNote___not___in(java.util.List<String> note___not___in) {
        this.note___not___in = note___not___in;
    }

    public String getNote___lt() {
        return note___lt;
    }
    public void setNote___lt(String note___lt) {
        this.note___lt = note___lt;
    }

    public String getNote___lte() {
        return note___lte;
    }
    public void setNote___lte(String note___lte) {
        this.note___lte = note___lte;
    }

    public String getNote___gt() {
        return note___gt;
    }
    public void setNote___gt(String note___gt) {
        this.note___gt = note___gt;
    }

    public String getNote___gte() {
        return note___gte;
    }
    public void setNote___gte(String note___gte) {
        this.note___gte = note___gte;
    }

    public String getNote___contains() {
        return note___contains;
    }
    public void setNote___contains(String note___contains) {
        this.note___contains = note___contains;
    }

    public String getNote___not___contains() {
        return note___not___contains;
    }
    public void setNote___not___contains(String note___not___contains) {
        this.note___not___contains = note___not___contains;
    }

    public String getNote___starts_with() {
        return note___starts_with;
    }
    public void setNote___starts_with(String note___starts_with) {
        this.note___starts_with = note___starts_with;
    }

    public String getNote___not___starts_with() {
        return note___not___starts_with;
    }
    public void setNote___not___starts_with(String note___not___starts_with) {
        this.note___not___starts_with = note___not___starts_with;
    }

    public String getNote___ends_with() {
        return note___ends_with;
    }
    public void setNote___ends_with(String note___ends_with) {
        this.note___ends_with = note___ends_with;
    }

    public String getNote___not___ends_with() {
        return note___not___ends_with;
    }
    public void setNote___not___ends_with(String note___not___ends_with) {
        this.note___not___ends_with = note___not___ends_with;
    }

    public Boolean getRisolto___eq() {
        return risolto___eq;
    }
    public void setRisolto___eq(Boolean risolto___eq) {
        this.risolto___eq = risolto___eq;
    }

    public Boolean getRisolto___ne() {
        return risolto___ne;
    }
    public void setRisolto___ne(Boolean risolto___ne) {
        this.risolto___ne = risolto___ne;
    }

    public Boolean getRisolto___null() {
        return risolto___null;
    }
    public void setRisolto___null(Boolean risolto___null) {
        this.risolto___null = risolto___null;
    }

    public Boolean getRisolto___not___null() {
        return risolto___not___null;
    }
    public void setRisolto___not___null(Boolean risolto___not___null) {
        this.risolto___not___null = risolto___not___null;
    }

    public String getSpecifiche___eq() {
        return specifiche___eq;
    }
    public void setSpecifiche___eq(String specifiche___eq) {
        this.specifiche___eq = specifiche___eq;
    }

    public String getSpecifiche___ne() {
        return specifiche___ne;
    }
    public void setSpecifiche___ne(String specifiche___ne) {
        this.specifiche___ne = specifiche___ne;
    }

    public Boolean getSpecifiche___null() {
        return specifiche___null;
    }
    public void setSpecifiche___null(Boolean specifiche___null) {
        this.specifiche___null = specifiche___null;
    }

    public Boolean getSpecifiche___not___null() {
        return specifiche___not___null;
    }
    public void setSpecifiche___not___null(Boolean specifiche___not___null) {
        this.specifiche___not___null = specifiche___not___null;
    }

    public java.util.List<String> getSpecifiche___in() {
        return specifiche___in;
    }
    public void setSpecifiche___in(java.util.List<String> specifiche___in) {
        this.specifiche___in = specifiche___in;
    }

    public java.util.List<String> getSpecifiche___not___in() {
        return specifiche___not___in;
    }
    public void setSpecifiche___not___in(java.util.List<String> specifiche___not___in) {
        this.specifiche___not___in = specifiche___not___in;
    }

    public String getSpecifiche___lt() {
        return specifiche___lt;
    }
    public void setSpecifiche___lt(String specifiche___lt) {
        this.specifiche___lt = specifiche___lt;
    }

    public String getSpecifiche___lte() {
        return specifiche___lte;
    }
    public void setSpecifiche___lte(String specifiche___lte) {
        this.specifiche___lte = specifiche___lte;
    }

    public String getSpecifiche___gt() {
        return specifiche___gt;
    }
    public void setSpecifiche___gt(String specifiche___gt) {
        this.specifiche___gt = specifiche___gt;
    }

    public String getSpecifiche___gte() {
        return specifiche___gte;
    }
    public void setSpecifiche___gte(String specifiche___gte) {
        this.specifiche___gte = specifiche___gte;
    }

    public String getSpecifiche___contains() {
        return specifiche___contains;
    }
    public void setSpecifiche___contains(String specifiche___contains) {
        this.specifiche___contains = specifiche___contains;
    }

    public String getSpecifiche___not___contains() {
        return specifiche___not___contains;
    }
    public void setSpecifiche___not___contains(String specifiche___not___contains) {
        this.specifiche___not___contains = specifiche___not___contains;
    }

    public String getSpecifiche___starts_with() {
        return specifiche___starts_with;
    }
    public void setSpecifiche___starts_with(String specifiche___starts_with) {
        this.specifiche___starts_with = specifiche___starts_with;
    }

    public String getSpecifiche___not___starts_with() {
        return specifiche___not___starts_with;
    }
    public void setSpecifiche___not___starts_with(String specifiche___not___starts_with) {
        this.specifiche___not___starts_with = specifiche___not___starts_with;
    }

    public String getSpecifiche___ends_with() {
        return specifiche___ends_with;
    }
    public void setSpecifiche___ends_with(String specifiche___ends_with) {
        this.specifiche___ends_with = specifiche___ends_with;
    }

    public String getSpecifiche___not___ends_with() {
        return specifiche___not___ends_with;
    }
    public void setSpecifiche___not___ends_with(String specifiche___not___ends_with) {
        this.specifiche___not___ends_with = specifiche___not___ends_with;
    }

    public java.util.List<CliChecksFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliChecksFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliChecksFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliChecksFilterDTO> OR) {
        this.OR = OR;
    }

    public CliChecksFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliChecksFilterDTO NOT) {
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
        if (check_id___eq != null) {
            joiner.add("check_id___eq: " + GraphQLRequestSerializer.getEntry(check_id___eq));
        }
        if (check_id___ne != null) {
            joiner.add("check_id___ne: " + GraphQLRequestSerializer.getEntry(check_id___ne));
        }
        if (check_id___null != null) {
            joiner.add("check_id___null: " + GraphQLRequestSerializer.getEntry(check_id___null));
        }
        if (check_id___not___null != null) {
            joiner.add("check_id___not___null: " + GraphQLRequestSerializer.getEntry(check_id___not___null));
        }
        if (check_id___in != null) {
            joiner.add("check_id___in: " + GraphQLRequestSerializer.getEntry(check_id___in));
        }
        if (check_id___not___in != null) {
            joiner.add("check_id___not___in: " + GraphQLRequestSerializer.getEntry(check_id___not___in));
        }
        if (check_id___lt != null) {
            joiner.add("check_id___lt: " + GraphQLRequestSerializer.getEntry(check_id___lt));
        }
        if (check_id___lte != null) {
            joiner.add("check_id___lte: " + GraphQLRequestSerializer.getEntry(check_id___lte));
        }
        if (check_id___gt != null) {
            joiner.add("check_id___gt: " + GraphQLRequestSerializer.getEntry(check_id___gt));
        }
        if (check_id___gte != null) {
            joiner.add("check_id___gte: " + GraphQLRequestSerializer.getEntry(check_id___gte));
        }
        if (check_id___contains != null) {
            joiner.add("check_id___contains: " + GraphQLRequestSerializer.getEntry(check_id___contains));
        }
        if (check_id___not___contains != null) {
            joiner.add("check_id___not___contains: " + GraphQLRequestSerializer.getEntry(check_id___not___contains));
        }
        if (check_id___starts_with != null) {
            joiner.add("check_id___starts_with: " + GraphQLRequestSerializer.getEntry(check_id___starts_with));
        }
        if (check_id___not___starts_with != null) {
            joiner.add("check_id___not___starts_with: " + GraphQLRequestSerializer.getEntry(check_id___not___starts_with));
        }
        if (check_id___ends_with != null) {
            joiner.add("check_id___ends_with: " + GraphQLRequestSerializer.getEntry(check_id___ends_with));
        }
        if (check_id___not___ends_with != null) {
            joiner.add("check_id___not___ends_with: " + GraphQLRequestSerializer.getEntry(check_id___not___ends_with));
        }
        if (codice_centro_h___eq != null) {
            joiner.add("codice_centro_h___eq: " + GraphQLRequestSerializer.getEntry(codice_centro_h___eq));
        }
        if (codice_centro_h___ne != null) {
            joiner.add("codice_centro_h___ne: " + GraphQLRequestSerializer.getEntry(codice_centro_h___ne));
        }
        if (codice_centro_h___null != null) {
            joiner.add("codice_centro_h___null: " + GraphQLRequestSerializer.getEntry(codice_centro_h___null));
        }
        if (codice_centro_h___not___null != null) {
            joiner.add("codice_centro_h___not___null: " + GraphQLRequestSerializer.getEntry(codice_centro_h___not___null));
        }
        if (codice_centro_h___in != null) {
            joiner.add("codice_centro_h___in: " + GraphQLRequestSerializer.getEntry(codice_centro_h___in));
        }
        if (codice_centro_h___not___in != null) {
            joiner.add("codice_centro_h___not___in: " + GraphQLRequestSerializer.getEntry(codice_centro_h___not___in));
        }
        if (codice_centro_h___lt != null) {
            joiner.add("codice_centro_h___lt: " + GraphQLRequestSerializer.getEntry(codice_centro_h___lt));
        }
        if (codice_centro_h___lte != null) {
            joiner.add("codice_centro_h___lte: " + GraphQLRequestSerializer.getEntry(codice_centro_h___lte));
        }
        if (codice_centro_h___gt != null) {
            joiner.add("codice_centro_h___gt: " + GraphQLRequestSerializer.getEntry(codice_centro_h___gt));
        }
        if (codice_centro_h___gte != null) {
            joiner.add("codice_centro_h___gte: " + GraphQLRequestSerializer.getEntry(codice_centro_h___gte));
        }
        if (codice_centro_h___contains != null) {
            joiner.add("codice_centro_h___contains: " + GraphQLRequestSerializer.getEntry(codice_centro_h___contains));
        }
        if (codice_centro_h___not___contains != null) {
            joiner.add("codice_centro_h___not___contains: " + GraphQLRequestSerializer.getEntry(codice_centro_h___not___contains));
        }
        if (codice_centro_h___starts_with != null) {
            joiner.add("codice_centro_h___starts_with: " + GraphQLRequestSerializer.getEntry(codice_centro_h___starts_with));
        }
        if (codice_centro_h___not___starts_with != null) {
            joiner.add("codice_centro_h___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_centro_h___not___starts_with));
        }
        if (codice_centro_h___ends_with != null) {
            joiner.add("codice_centro_h___ends_with: " + GraphQLRequestSerializer.getEntry(codice_centro_h___ends_with));
        }
        if (codice_centro_h___not___ends_with != null) {
            joiner.add("codice_centro_h___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_centro_h___not___ends_with));
        }
        if (codice_centro_i___eq != null) {
            joiner.add("codice_centro_i___eq: " + GraphQLRequestSerializer.getEntry(codice_centro_i___eq));
        }
        if (codice_centro_i___ne != null) {
            joiner.add("codice_centro_i___ne: " + GraphQLRequestSerializer.getEntry(codice_centro_i___ne));
        }
        if (codice_centro_i___null != null) {
            joiner.add("codice_centro_i___null: " + GraphQLRequestSerializer.getEntry(codice_centro_i___null));
        }
        if (codice_centro_i___not___null != null) {
            joiner.add("codice_centro_i___not___null: " + GraphQLRequestSerializer.getEntry(codice_centro_i___not___null));
        }
        if (codice_centro_i___in != null) {
            joiner.add("codice_centro_i___in: " + GraphQLRequestSerializer.getEntry(codice_centro_i___in));
        }
        if (codice_centro_i___not___in != null) {
            joiner.add("codice_centro_i___not___in: " + GraphQLRequestSerializer.getEntry(codice_centro_i___not___in));
        }
        if (codice_centro_i___lt != null) {
            joiner.add("codice_centro_i___lt: " + GraphQLRequestSerializer.getEntry(codice_centro_i___lt));
        }
        if (codice_centro_i___lte != null) {
            joiner.add("codice_centro_i___lte: " + GraphQLRequestSerializer.getEntry(codice_centro_i___lte));
        }
        if (codice_centro_i___gt != null) {
            joiner.add("codice_centro_i___gt: " + GraphQLRequestSerializer.getEntry(codice_centro_i___gt));
        }
        if (codice_centro_i___gte != null) {
            joiner.add("codice_centro_i___gte: " + GraphQLRequestSerializer.getEntry(codice_centro_i___gte));
        }
        if (codice_centro_i___contains != null) {
            joiner.add("codice_centro_i___contains: " + GraphQLRequestSerializer.getEntry(codice_centro_i___contains));
        }
        if (codice_centro_i___not___contains != null) {
            joiner.add("codice_centro_i___not___contains: " + GraphQLRequestSerializer.getEntry(codice_centro_i___not___contains));
        }
        if (codice_centro_i___starts_with != null) {
            joiner.add("codice_centro_i___starts_with: " + GraphQLRequestSerializer.getEntry(codice_centro_i___starts_with));
        }
        if (codice_centro_i___not___starts_with != null) {
            joiner.add("codice_centro_i___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_centro_i___not___starts_with));
        }
        if (codice_centro_i___ends_with != null) {
            joiner.add("codice_centro_i___ends_with: " + GraphQLRequestSerializer.getEntry(codice_centro_i___ends_with));
        }
        if (codice_centro_i___not___ends_with != null) {
            joiner.add("codice_centro_i___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_centro_i___not___ends_with));
        }
        if (codice_hepa___eq != null) {
            joiner.add("codice_hepa___eq: " + GraphQLRequestSerializer.getEntry(codice_hepa___eq));
        }
        if (codice_hepa___ne != null) {
            joiner.add("codice_hepa___ne: " + GraphQLRequestSerializer.getEntry(codice_hepa___ne));
        }
        if (codice_hepa___null != null) {
            joiner.add("codice_hepa___null: " + GraphQLRequestSerializer.getEntry(codice_hepa___null));
        }
        if (codice_hepa___not___null != null) {
            joiner.add("codice_hepa___not___null: " + GraphQLRequestSerializer.getEntry(codice_hepa___not___null));
        }
        if (codice_hepa___in != null) {
            joiner.add("codice_hepa___in: " + GraphQLRequestSerializer.getEntry(codice_hepa___in));
        }
        if (codice_hepa___not___in != null) {
            joiner.add("codice_hepa___not___in: " + GraphQLRequestSerializer.getEntry(codice_hepa___not___in));
        }
        if (codice_hepa___lt != null) {
            joiner.add("codice_hepa___lt: " + GraphQLRequestSerializer.getEntry(codice_hepa___lt));
        }
        if (codice_hepa___lte != null) {
            joiner.add("codice_hepa___lte: " + GraphQLRequestSerializer.getEntry(codice_hepa___lte));
        }
        if (codice_hepa___gt != null) {
            joiner.add("codice_hepa___gt: " + GraphQLRequestSerializer.getEntry(codice_hepa___gt));
        }
        if (codice_hepa___gte != null) {
            joiner.add("codice_hepa___gte: " + GraphQLRequestSerializer.getEntry(codice_hepa___gte));
        }
        if (codice_hepa___contains != null) {
            joiner.add("codice_hepa___contains: " + GraphQLRequestSerializer.getEntry(codice_hepa___contains));
        }
        if (codice_hepa___not___contains != null) {
            joiner.add("codice_hepa___not___contains: " + GraphQLRequestSerializer.getEntry(codice_hepa___not___contains));
        }
        if (codice_hepa___starts_with != null) {
            joiner.add("codice_hepa___starts_with: " + GraphQLRequestSerializer.getEntry(codice_hepa___starts_with));
        }
        if (codice_hepa___not___starts_with != null) {
            joiner.add("codice_hepa___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_hepa___not___starts_with));
        }
        if (codice_hepa___ends_with != null) {
            joiner.add("codice_hepa___ends_with: " + GraphQLRequestSerializer.getEntry(codice_hepa___ends_with));
        }
        if (codice_hepa___not___ends_with != null) {
            joiner.add("codice_hepa___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_hepa___not___ends_with));
        }
        if (codice_ico___eq != null) {
            joiner.add("codice_ico___eq: " + GraphQLRequestSerializer.getEntry(codice_ico___eq));
        }
        if (codice_ico___ne != null) {
            joiner.add("codice_ico___ne: " + GraphQLRequestSerializer.getEntry(codice_ico___ne));
        }
        if (codice_ico___null != null) {
            joiner.add("codice_ico___null: " + GraphQLRequestSerializer.getEntry(codice_ico___null));
        }
        if (codice_ico___not___null != null) {
            joiner.add("codice_ico___not___null: " + GraphQLRequestSerializer.getEntry(codice_ico___not___null));
        }
        if (codice_ico___in != null) {
            joiner.add("codice_ico___in: " + GraphQLRequestSerializer.getEntry(codice_ico___in));
        }
        if (codice_ico___not___in != null) {
            joiner.add("codice_ico___not___in: " + GraphQLRequestSerializer.getEntry(codice_ico___not___in));
        }
        if (codice_ico___lt != null) {
            joiner.add("codice_ico___lt: " + GraphQLRequestSerializer.getEntry(codice_ico___lt));
        }
        if (codice_ico___lte != null) {
            joiner.add("codice_ico___lte: " + GraphQLRequestSerializer.getEntry(codice_ico___lte));
        }
        if (codice_ico___gt != null) {
            joiner.add("codice_ico___gt: " + GraphQLRequestSerializer.getEntry(codice_ico___gt));
        }
        if (codice_ico___gte != null) {
            joiner.add("codice_ico___gte: " + GraphQLRequestSerializer.getEntry(codice_ico___gte));
        }
        if (codice_ico___contains != null) {
            joiner.add("codice_ico___contains: " + GraphQLRequestSerializer.getEntry(codice_ico___contains));
        }
        if (codice_ico___not___contains != null) {
            joiner.add("codice_ico___not___contains: " + GraphQLRequestSerializer.getEntry(codice_ico___not___contains));
        }
        if (codice_ico___starts_with != null) {
            joiner.add("codice_ico___starts_with: " + GraphQLRequestSerializer.getEntry(codice_ico___starts_with));
        }
        if (codice_ico___not___starts_with != null) {
            joiner.add("codice_ico___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_ico___not___starts_with));
        }
        if (codice_ico___ends_with != null) {
            joiner.add("codice_ico___ends_with: " + GraphQLRequestSerializer.getEntry(codice_ico___ends_with));
        }
        if (codice_ico___not___ends_with != null) {
            joiner.add("codice_ico___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_ico___not___ends_with));
        }
        if (descrizione___eq != null) {
            joiner.add("descrizione___eq: " + GraphQLRequestSerializer.getEntry(descrizione___eq));
        }
        if (descrizione___ne != null) {
            joiner.add("descrizione___ne: " + GraphQLRequestSerializer.getEntry(descrizione___ne));
        }
        if (descrizione___null != null) {
            joiner.add("descrizione___null: " + GraphQLRequestSerializer.getEntry(descrizione___null));
        }
        if (descrizione___not___null != null) {
            joiner.add("descrizione___not___null: " + GraphQLRequestSerializer.getEntry(descrizione___not___null));
        }
        if (descrizione___in != null) {
            joiner.add("descrizione___in: " + GraphQLRequestSerializer.getEntry(descrizione___in));
        }
        if (descrizione___not___in != null) {
            joiner.add("descrizione___not___in: " + GraphQLRequestSerializer.getEntry(descrizione___not___in));
        }
        if (descrizione___lt != null) {
            joiner.add("descrizione___lt: " + GraphQLRequestSerializer.getEntry(descrizione___lt));
        }
        if (descrizione___lte != null) {
            joiner.add("descrizione___lte: " + GraphQLRequestSerializer.getEntry(descrizione___lte));
        }
        if (descrizione___gt != null) {
            joiner.add("descrizione___gt: " + GraphQLRequestSerializer.getEntry(descrizione___gt));
        }
        if (descrizione___gte != null) {
            joiner.add("descrizione___gte: " + GraphQLRequestSerializer.getEntry(descrizione___gte));
        }
        if (descrizione___contains != null) {
            joiner.add("descrizione___contains: " + GraphQLRequestSerializer.getEntry(descrizione___contains));
        }
        if (descrizione___not___contains != null) {
            joiner.add("descrizione___not___contains: " + GraphQLRequestSerializer.getEntry(descrizione___not___contains));
        }
        if (descrizione___starts_with != null) {
            joiner.add("descrizione___starts_with: " + GraphQLRequestSerializer.getEntry(descrizione___starts_with));
        }
        if (descrizione___not___starts_with != null) {
            joiner.add("descrizione___not___starts_with: " + GraphQLRequestSerializer.getEntry(descrizione___not___starts_with));
        }
        if (descrizione___ends_with != null) {
            joiner.add("descrizione___ends_with: " + GraphQLRequestSerializer.getEntry(descrizione___ends_with));
        }
        if (descrizione___not___ends_with != null) {
            joiner.add("descrizione___not___ends_with: " + GraphQLRequestSerializer.getEntry(descrizione___not___ends_with));
        }
        if (note___eq != null) {
            joiner.add("note___eq: " + GraphQLRequestSerializer.getEntry(note___eq));
        }
        if (note___ne != null) {
            joiner.add("note___ne: " + GraphQLRequestSerializer.getEntry(note___ne));
        }
        if (note___null != null) {
            joiner.add("note___null: " + GraphQLRequestSerializer.getEntry(note___null));
        }
        if (note___not___null != null) {
            joiner.add("note___not___null: " + GraphQLRequestSerializer.getEntry(note___not___null));
        }
        if (note___in != null) {
            joiner.add("note___in: " + GraphQLRequestSerializer.getEntry(note___in));
        }
        if (note___not___in != null) {
            joiner.add("note___not___in: " + GraphQLRequestSerializer.getEntry(note___not___in));
        }
        if (note___lt != null) {
            joiner.add("note___lt: " + GraphQLRequestSerializer.getEntry(note___lt));
        }
        if (note___lte != null) {
            joiner.add("note___lte: " + GraphQLRequestSerializer.getEntry(note___lte));
        }
        if (note___gt != null) {
            joiner.add("note___gt: " + GraphQLRequestSerializer.getEntry(note___gt));
        }
        if (note___gte != null) {
            joiner.add("note___gte: " + GraphQLRequestSerializer.getEntry(note___gte));
        }
        if (note___contains != null) {
            joiner.add("note___contains: " + GraphQLRequestSerializer.getEntry(note___contains));
        }
        if (note___not___contains != null) {
            joiner.add("note___not___contains: " + GraphQLRequestSerializer.getEntry(note___not___contains));
        }
        if (note___starts_with != null) {
            joiner.add("note___starts_with: " + GraphQLRequestSerializer.getEntry(note___starts_with));
        }
        if (note___not___starts_with != null) {
            joiner.add("note___not___starts_with: " + GraphQLRequestSerializer.getEntry(note___not___starts_with));
        }
        if (note___ends_with != null) {
            joiner.add("note___ends_with: " + GraphQLRequestSerializer.getEntry(note___ends_with));
        }
        if (note___not___ends_with != null) {
            joiner.add("note___not___ends_with: " + GraphQLRequestSerializer.getEntry(note___not___ends_with));
        }
        if (risolto___eq != null) {
            joiner.add("risolto___eq: " + GraphQLRequestSerializer.getEntry(risolto___eq));
        }
        if (risolto___ne != null) {
            joiner.add("risolto___ne: " + GraphQLRequestSerializer.getEntry(risolto___ne));
        }
        if (risolto___null != null) {
            joiner.add("risolto___null: " + GraphQLRequestSerializer.getEntry(risolto___null));
        }
        if (risolto___not___null != null) {
            joiner.add("risolto___not___null: " + GraphQLRequestSerializer.getEntry(risolto___not___null));
        }
        if (specifiche___eq != null) {
            joiner.add("specifiche___eq: " + GraphQLRequestSerializer.getEntry(specifiche___eq));
        }
        if (specifiche___ne != null) {
            joiner.add("specifiche___ne: " + GraphQLRequestSerializer.getEntry(specifiche___ne));
        }
        if (specifiche___null != null) {
            joiner.add("specifiche___null: " + GraphQLRequestSerializer.getEntry(specifiche___null));
        }
        if (specifiche___not___null != null) {
            joiner.add("specifiche___not___null: " + GraphQLRequestSerializer.getEntry(specifiche___not___null));
        }
        if (specifiche___in != null) {
            joiner.add("specifiche___in: " + GraphQLRequestSerializer.getEntry(specifiche___in));
        }
        if (specifiche___not___in != null) {
            joiner.add("specifiche___not___in: " + GraphQLRequestSerializer.getEntry(specifiche___not___in));
        }
        if (specifiche___lt != null) {
            joiner.add("specifiche___lt: " + GraphQLRequestSerializer.getEntry(specifiche___lt));
        }
        if (specifiche___lte != null) {
            joiner.add("specifiche___lte: " + GraphQLRequestSerializer.getEntry(specifiche___lte));
        }
        if (specifiche___gt != null) {
            joiner.add("specifiche___gt: " + GraphQLRequestSerializer.getEntry(specifiche___gt));
        }
        if (specifiche___gte != null) {
            joiner.add("specifiche___gte: " + GraphQLRequestSerializer.getEntry(specifiche___gte));
        }
        if (specifiche___contains != null) {
            joiner.add("specifiche___contains: " + GraphQLRequestSerializer.getEntry(specifiche___contains));
        }
        if (specifiche___not___contains != null) {
            joiner.add("specifiche___not___contains: " + GraphQLRequestSerializer.getEntry(specifiche___not___contains));
        }
        if (specifiche___starts_with != null) {
            joiner.add("specifiche___starts_with: " + GraphQLRequestSerializer.getEntry(specifiche___starts_with));
        }
        if (specifiche___not___starts_with != null) {
            joiner.add("specifiche___not___starts_with: " + GraphQLRequestSerializer.getEntry(specifiche___not___starts_with));
        }
        if (specifiche___ends_with != null) {
            joiner.add("specifiche___ends_with: " + GraphQLRequestSerializer.getEntry(specifiche___ends_with));
        }
        if (specifiche___not___ends_with != null) {
            joiner.add("specifiche___not___ends_with: " + GraphQLRequestSerializer.getEntry(specifiche___not___ends_with));
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

    public static CliChecksFilterDTO.Builder builder() {
        return new CliChecksFilterDTO.Builder();
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
        private String check_id___eq;
        private String check_id___ne;
        private Boolean check_id___null;
        private Boolean check_id___not___null;
        private java.util.List<String> check_id___in;
        private java.util.List<String> check_id___not___in;
        private String check_id___lt;
        private String check_id___lte;
        private String check_id___gt;
        private String check_id___gte;
        private String check_id___contains;
        private String check_id___not___contains;
        private String check_id___starts_with;
        private String check_id___not___starts_with;
        private String check_id___ends_with;
        private String check_id___not___ends_with;
        private String codice_centro_h___eq;
        private String codice_centro_h___ne;
        private Boolean codice_centro_h___null;
        private Boolean codice_centro_h___not___null;
        private java.util.List<String> codice_centro_h___in;
        private java.util.List<String> codice_centro_h___not___in;
        private String codice_centro_h___lt;
        private String codice_centro_h___lte;
        private String codice_centro_h___gt;
        private String codice_centro_h___gte;
        private String codice_centro_h___contains;
        private String codice_centro_h___not___contains;
        private String codice_centro_h___starts_with;
        private String codice_centro_h___not___starts_with;
        private String codice_centro_h___ends_with;
        private String codice_centro_h___not___ends_with;
        private String codice_centro_i___eq;
        private String codice_centro_i___ne;
        private Boolean codice_centro_i___null;
        private Boolean codice_centro_i___not___null;
        private java.util.List<String> codice_centro_i___in;
        private java.util.List<String> codice_centro_i___not___in;
        private String codice_centro_i___lt;
        private String codice_centro_i___lte;
        private String codice_centro_i___gt;
        private String codice_centro_i___gte;
        private String codice_centro_i___contains;
        private String codice_centro_i___not___contains;
        private String codice_centro_i___starts_with;
        private String codice_centro_i___not___starts_with;
        private String codice_centro_i___ends_with;
        private String codice_centro_i___not___ends_with;
        private String codice_hepa___eq;
        private String codice_hepa___ne;
        private Boolean codice_hepa___null;
        private Boolean codice_hepa___not___null;
        private java.util.List<String> codice_hepa___in;
        private java.util.List<String> codice_hepa___not___in;
        private String codice_hepa___lt;
        private String codice_hepa___lte;
        private String codice_hepa___gt;
        private String codice_hepa___gte;
        private String codice_hepa___contains;
        private String codice_hepa___not___contains;
        private String codice_hepa___starts_with;
        private String codice_hepa___not___starts_with;
        private String codice_hepa___ends_with;
        private String codice_hepa___not___ends_with;
        private String codice_ico___eq;
        private String codice_ico___ne;
        private Boolean codice_ico___null;
        private Boolean codice_ico___not___null;
        private java.util.List<String> codice_ico___in;
        private java.util.List<String> codice_ico___not___in;
        private String codice_ico___lt;
        private String codice_ico___lte;
        private String codice_ico___gt;
        private String codice_ico___gte;
        private String codice_ico___contains;
        private String codice_ico___not___contains;
        private String codice_ico___starts_with;
        private String codice_ico___not___starts_with;
        private String codice_ico___ends_with;
        private String codice_ico___not___ends_with;
        private String descrizione___eq;
        private String descrizione___ne;
        private Boolean descrizione___null;
        private Boolean descrizione___not___null;
        private java.util.List<String> descrizione___in;
        private java.util.List<String> descrizione___not___in;
        private String descrizione___lt;
        private String descrizione___lte;
        private String descrizione___gt;
        private String descrizione___gte;
        private String descrizione___contains;
        private String descrizione___not___contains;
        private String descrizione___starts_with;
        private String descrizione___not___starts_with;
        private String descrizione___ends_with;
        private String descrizione___not___ends_with;
        private String note___eq;
        private String note___ne;
        private Boolean note___null;
        private Boolean note___not___null;
        private java.util.List<String> note___in;
        private java.util.List<String> note___not___in;
        private String note___lt;
        private String note___lte;
        private String note___gt;
        private String note___gte;
        private String note___contains;
        private String note___not___contains;
        private String note___starts_with;
        private String note___not___starts_with;
        private String note___ends_with;
        private String note___not___ends_with;
        private Boolean risolto___eq;
        private Boolean risolto___ne;
        private Boolean risolto___null;
        private Boolean risolto___not___null;
        private String specifiche___eq;
        private String specifiche___ne;
        private Boolean specifiche___null;
        private Boolean specifiche___not___null;
        private java.util.List<String> specifiche___in;
        private java.util.List<String> specifiche___not___in;
        private String specifiche___lt;
        private String specifiche___lte;
        private String specifiche___gt;
        private String specifiche___gte;
        private String specifiche___contains;
        private String specifiche___not___contains;
        private String specifiche___starts_with;
        private String specifiche___not___starts_with;
        private String specifiche___ends_with;
        private String specifiche___not___ends_with;
        private java.util.List<CliChecksFilterDTO> AND;
        private java.util.List<CliChecksFilterDTO> OR;
        private CliChecksFilterDTO NOT;

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

        public Builder setCheck_id___eq(String check_id___eq) {
            this.check_id___eq = check_id___eq;
            return this;
        }

        public Builder setCheck_id___ne(String check_id___ne) {
            this.check_id___ne = check_id___ne;
            return this;
        }

        public Builder setCheck_id___null(Boolean check_id___null) {
            this.check_id___null = check_id___null;
            return this;
        }

        public Builder setCheck_id___not___null(Boolean check_id___not___null) {
            this.check_id___not___null = check_id___not___null;
            return this;
        }

        public Builder setCheck_id___in(java.util.List<String> check_id___in) {
            this.check_id___in = check_id___in;
            return this;
        }

        public Builder setCheck_id___not___in(java.util.List<String> check_id___not___in) {
            this.check_id___not___in = check_id___not___in;
            return this;
        }

        public Builder setCheck_id___lt(String check_id___lt) {
            this.check_id___lt = check_id___lt;
            return this;
        }

        public Builder setCheck_id___lte(String check_id___lte) {
            this.check_id___lte = check_id___lte;
            return this;
        }

        public Builder setCheck_id___gt(String check_id___gt) {
            this.check_id___gt = check_id___gt;
            return this;
        }

        public Builder setCheck_id___gte(String check_id___gte) {
            this.check_id___gte = check_id___gte;
            return this;
        }

        public Builder setCheck_id___contains(String check_id___contains) {
            this.check_id___contains = check_id___contains;
            return this;
        }

        public Builder setCheck_id___not___contains(String check_id___not___contains) {
            this.check_id___not___contains = check_id___not___contains;
            return this;
        }

        public Builder setCheck_id___starts_with(String check_id___starts_with) {
            this.check_id___starts_with = check_id___starts_with;
            return this;
        }

        public Builder setCheck_id___not___starts_with(String check_id___not___starts_with) {
            this.check_id___not___starts_with = check_id___not___starts_with;
            return this;
        }

        public Builder setCheck_id___ends_with(String check_id___ends_with) {
            this.check_id___ends_with = check_id___ends_with;
            return this;
        }

        public Builder setCheck_id___not___ends_with(String check_id___not___ends_with) {
            this.check_id___not___ends_with = check_id___not___ends_with;
            return this;
        }

        public Builder setCodice_centro_h___eq(String codice_centro_h___eq) {
            this.codice_centro_h___eq = codice_centro_h___eq;
            return this;
        }

        public Builder setCodice_centro_h___ne(String codice_centro_h___ne) {
            this.codice_centro_h___ne = codice_centro_h___ne;
            return this;
        }

        public Builder setCodice_centro_h___null(Boolean codice_centro_h___null) {
            this.codice_centro_h___null = codice_centro_h___null;
            return this;
        }

        public Builder setCodice_centro_h___not___null(Boolean codice_centro_h___not___null) {
            this.codice_centro_h___not___null = codice_centro_h___not___null;
            return this;
        }

        public Builder setCodice_centro_h___in(java.util.List<String> codice_centro_h___in) {
            this.codice_centro_h___in = codice_centro_h___in;
            return this;
        }

        public Builder setCodice_centro_h___not___in(java.util.List<String> codice_centro_h___not___in) {
            this.codice_centro_h___not___in = codice_centro_h___not___in;
            return this;
        }

        public Builder setCodice_centro_h___lt(String codice_centro_h___lt) {
            this.codice_centro_h___lt = codice_centro_h___lt;
            return this;
        }

        public Builder setCodice_centro_h___lte(String codice_centro_h___lte) {
            this.codice_centro_h___lte = codice_centro_h___lte;
            return this;
        }

        public Builder setCodice_centro_h___gt(String codice_centro_h___gt) {
            this.codice_centro_h___gt = codice_centro_h___gt;
            return this;
        }

        public Builder setCodice_centro_h___gte(String codice_centro_h___gte) {
            this.codice_centro_h___gte = codice_centro_h___gte;
            return this;
        }

        public Builder setCodice_centro_h___contains(String codice_centro_h___contains) {
            this.codice_centro_h___contains = codice_centro_h___contains;
            return this;
        }

        public Builder setCodice_centro_h___not___contains(String codice_centro_h___not___contains) {
            this.codice_centro_h___not___contains = codice_centro_h___not___contains;
            return this;
        }

        public Builder setCodice_centro_h___starts_with(String codice_centro_h___starts_with) {
            this.codice_centro_h___starts_with = codice_centro_h___starts_with;
            return this;
        }

        public Builder setCodice_centro_h___not___starts_with(String codice_centro_h___not___starts_with) {
            this.codice_centro_h___not___starts_with = codice_centro_h___not___starts_with;
            return this;
        }

        public Builder setCodice_centro_h___ends_with(String codice_centro_h___ends_with) {
            this.codice_centro_h___ends_with = codice_centro_h___ends_with;
            return this;
        }

        public Builder setCodice_centro_h___not___ends_with(String codice_centro_h___not___ends_with) {
            this.codice_centro_h___not___ends_with = codice_centro_h___not___ends_with;
            return this;
        }

        public Builder setCodice_centro_i___eq(String codice_centro_i___eq) {
            this.codice_centro_i___eq = codice_centro_i___eq;
            return this;
        }

        public Builder setCodice_centro_i___ne(String codice_centro_i___ne) {
            this.codice_centro_i___ne = codice_centro_i___ne;
            return this;
        }

        public Builder setCodice_centro_i___null(Boolean codice_centro_i___null) {
            this.codice_centro_i___null = codice_centro_i___null;
            return this;
        }

        public Builder setCodice_centro_i___not___null(Boolean codice_centro_i___not___null) {
            this.codice_centro_i___not___null = codice_centro_i___not___null;
            return this;
        }

        public Builder setCodice_centro_i___in(java.util.List<String> codice_centro_i___in) {
            this.codice_centro_i___in = codice_centro_i___in;
            return this;
        }

        public Builder setCodice_centro_i___not___in(java.util.List<String> codice_centro_i___not___in) {
            this.codice_centro_i___not___in = codice_centro_i___not___in;
            return this;
        }

        public Builder setCodice_centro_i___lt(String codice_centro_i___lt) {
            this.codice_centro_i___lt = codice_centro_i___lt;
            return this;
        }

        public Builder setCodice_centro_i___lte(String codice_centro_i___lte) {
            this.codice_centro_i___lte = codice_centro_i___lte;
            return this;
        }

        public Builder setCodice_centro_i___gt(String codice_centro_i___gt) {
            this.codice_centro_i___gt = codice_centro_i___gt;
            return this;
        }

        public Builder setCodice_centro_i___gte(String codice_centro_i___gte) {
            this.codice_centro_i___gte = codice_centro_i___gte;
            return this;
        }

        public Builder setCodice_centro_i___contains(String codice_centro_i___contains) {
            this.codice_centro_i___contains = codice_centro_i___contains;
            return this;
        }

        public Builder setCodice_centro_i___not___contains(String codice_centro_i___not___contains) {
            this.codice_centro_i___not___contains = codice_centro_i___not___contains;
            return this;
        }

        public Builder setCodice_centro_i___starts_with(String codice_centro_i___starts_with) {
            this.codice_centro_i___starts_with = codice_centro_i___starts_with;
            return this;
        }

        public Builder setCodice_centro_i___not___starts_with(String codice_centro_i___not___starts_with) {
            this.codice_centro_i___not___starts_with = codice_centro_i___not___starts_with;
            return this;
        }

        public Builder setCodice_centro_i___ends_with(String codice_centro_i___ends_with) {
            this.codice_centro_i___ends_with = codice_centro_i___ends_with;
            return this;
        }

        public Builder setCodice_centro_i___not___ends_with(String codice_centro_i___not___ends_with) {
            this.codice_centro_i___not___ends_with = codice_centro_i___not___ends_with;
            return this;
        }

        public Builder setCodice_hepa___eq(String codice_hepa___eq) {
            this.codice_hepa___eq = codice_hepa___eq;
            return this;
        }

        public Builder setCodice_hepa___ne(String codice_hepa___ne) {
            this.codice_hepa___ne = codice_hepa___ne;
            return this;
        }

        public Builder setCodice_hepa___null(Boolean codice_hepa___null) {
            this.codice_hepa___null = codice_hepa___null;
            return this;
        }

        public Builder setCodice_hepa___not___null(Boolean codice_hepa___not___null) {
            this.codice_hepa___not___null = codice_hepa___not___null;
            return this;
        }

        public Builder setCodice_hepa___in(java.util.List<String> codice_hepa___in) {
            this.codice_hepa___in = codice_hepa___in;
            return this;
        }

        public Builder setCodice_hepa___not___in(java.util.List<String> codice_hepa___not___in) {
            this.codice_hepa___not___in = codice_hepa___not___in;
            return this;
        }

        public Builder setCodice_hepa___lt(String codice_hepa___lt) {
            this.codice_hepa___lt = codice_hepa___lt;
            return this;
        }

        public Builder setCodice_hepa___lte(String codice_hepa___lte) {
            this.codice_hepa___lte = codice_hepa___lte;
            return this;
        }

        public Builder setCodice_hepa___gt(String codice_hepa___gt) {
            this.codice_hepa___gt = codice_hepa___gt;
            return this;
        }

        public Builder setCodice_hepa___gte(String codice_hepa___gte) {
            this.codice_hepa___gte = codice_hepa___gte;
            return this;
        }

        public Builder setCodice_hepa___contains(String codice_hepa___contains) {
            this.codice_hepa___contains = codice_hepa___contains;
            return this;
        }

        public Builder setCodice_hepa___not___contains(String codice_hepa___not___contains) {
            this.codice_hepa___not___contains = codice_hepa___not___contains;
            return this;
        }

        public Builder setCodice_hepa___starts_with(String codice_hepa___starts_with) {
            this.codice_hepa___starts_with = codice_hepa___starts_with;
            return this;
        }

        public Builder setCodice_hepa___not___starts_with(String codice_hepa___not___starts_with) {
            this.codice_hepa___not___starts_with = codice_hepa___not___starts_with;
            return this;
        }

        public Builder setCodice_hepa___ends_with(String codice_hepa___ends_with) {
            this.codice_hepa___ends_with = codice_hepa___ends_with;
            return this;
        }

        public Builder setCodice_hepa___not___ends_with(String codice_hepa___not___ends_with) {
            this.codice_hepa___not___ends_with = codice_hepa___not___ends_with;
            return this;
        }

        public Builder setCodice_ico___eq(String codice_ico___eq) {
            this.codice_ico___eq = codice_ico___eq;
            return this;
        }

        public Builder setCodice_ico___ne(String codice_ico___ne) {
            this.codice_ico___ne = codice_ico___ne;
            return this;
        }

        public Builder setCodice_ico___null(Boolean codice_ico___null) {
            this.codice_ico___null = codice_ico___null;
            return this;
        }

        public Builder setCodice_ico___not___null(Boolean codice_ico___not___null) {
            this.codice_ico___not___null = codice_ico___not___null;
            return this;
        }

        public Builder setCodice_ico___in(java.util.List<String> codice_ico___in) {
            this.codice_ico___in = codice_ico___in;
            return this;
        }

        public Builder setCodice_ico___not___in(java.util.List<String> codice_ico___not___in) {
            this.codice_ico___not___in = codice_ico___not___in;
            return this;
        }

        public Builder setCodice_ico___lt(String codice_ico___lt) {
            this.codice_ico___lt = codice_ico___lt;
            return this;
        }

        public Builder setCodice_ico___lte(String codice_ico___lte) {
            this.codice_ico___lte = codice_ico___lte;
            return this;
        }

        public Builder setCodice_ico___gt(String codice_ico___gt) {
            this.codice_ico___gt = codice_ico___gt;
            return this;
        }

        public Builder setCodice_ico___gte(String codice_ico___gte) {
            this.codice_ico___gte = codice_ico___gte;
            return this;
        }

        public Builder setCodice_ico___contains(String codice_ico___contains) {
            this.codice_ico___contains = codice_ico___contains;
            return this;
        }

        public Builder setCodice_ico___not___contains(String codice_ico___not___contains) {
            this.codice_ico___not___contains = codice_ico___not___contains;
            return this;
        }

        public Builder setCodice_ico___starts_with(String codice_ico___starts_with) {
            this.codice_ico___starts_with = codice_ico___starts_with;
            return this;
        }

        public Builder setCodice_ico___not___starts_with(String codice_ico___not___starts_with) {
            this.codice_ico___not___starts_with = codice_ico___not___starts_with;
            return this;
        }

        public Builder setCodice_ico___ends_with(String codice_ico___ends_with) {
            this.codice_ico___ends_with = codice_ico___ends_with;
            return this;
        }

        public Builder setCodice_ico___not___ends_with(String codice_ico___not___ends_with) {
            this.codice_ico___not___ends_with = codice_ico___not___ends_with;
            return this;
        }

        public Builder setDescrizione___eq(String descrizione___eq) {
            this.descrizione___eq = descrizione___eq;
            return this;
        }

        public Builder setDescrizione___ne(String descrizione___ne) {
            this.descrizione___ne = descrizione___ne;
            return this;
        }

        public Builder setDescrizione___null(Boolean descrizione___null) {
            this.descrizione___null = descrizione___null;
            return this;
        }

        public Builder setDescrizione___not___null(Boolean descrizione___not___null) {
            this.descrizione___not___null = descrizione___not___null;
            return this;
        }

        public Builder setDescrizione___in(java.util.List<String> descrizione___in) {
            this.descrizione___in = descrizione___in;
            return this;
        }

        public Builder setDescrizione___not___in(java.util.List<String> descrizione___not___in) {
            this.descrizione___not___in = descrizione___not___in;
            return this;
        }

        public Builder setDescrizione___lt(String descrizione___lt) {
            this.descrizione___lt = descrizione___lt;
            return this;
        }

        public Builder setDescrizione___lte(String descrizione___lte) {
            this.descrizione___lte = descrizione___lte;
            return this;
        }

        public Builder setDescrizione___gt(String descrizione___gt) {
            this.descrizione___gt = descrizione___gt;
            return this;
        }

        public Builder setDescrizione___gte(String descrizione___gte) {
            this.descrizione___gte = descrizione___gte;
            return this;
        }

        public Builder setDescrizione___contains(String descrizione___contains) {
            this.descrizione___contains = descrizione___contains;
            return this;
        }

        public Builder setDescrizione___not___contains(String descrizione___not___contains) {
            this.descrizione___not___contains = descrizione___not___contains;
            return this;
        }

        public Builder setDescrizione___starts_with(String descrizione___starts_with) {
            this.descrizione___starts_with = descrizione___starts_with;
            return this;
        }

        public Builder setDescrizione___not___starts_with(String descrizione___not___starts_with) {
            this.descrizione___not___starts_with = descrizione___not___starts_with;
            return this;
        }

        public Builder setDescrizione___ends_with(String descrizione___ends_with) {
            this.descrizione___ends_with = descrizione___ends_with;
            return this;
        }

        public Builder setDescrizione___not___ends_with(String descrizione___not___ends_with) {
            this.descrizione___not___ends_with = descrizione___not___ends_with;
            return this;
        }

        public Builder setNote___eq(String note___eq) {
            this.note___eq = note___eq;
            return this;
        }

        public Builder setNote___ne(String note___ne) {
            this.note___ne = note___ne;
            return this;
        }

        public Builder setNote___null(Boolean note___null) {
            this.note___null = note___null;
            return this;
        }

        public Builder setNote___not___null(Boolean note___not___null) {
            this.note___not___null = note___not___null;
            return this;
        }

        public Builder setNote___in(java.util.List<String> note___in) {
            this.note___in = note___in;
            return this;
        }

        public Builder setNote___not___in(java.util.List<String> note___not___in) {
            this.note___not___in = note___not___in;
            return this;
        }

        public Builder setNote___lt(String note___lt) {
            this.note___lt = note___lt;
            return this;
        }

        public Builder setNote___lte(String note___lte) {
            this.note___lte = note___lte;
            return this;
        }

        public Builder setNote___gt(String note___gt) {
            this.note___gt = note___gt;
            return this;
        }

        public Builder setNote___gte(String note___gte) {
            this.note___gte = note___gte;
            return this;
        }

        public Builder setNote___contains(String note___contains) {
            this.note___contains = note___contains;
            return this;
        }

        public Builder setNote___not___contains(String note___not___contains) {
            this.note___not___contains = note___not___contains;
            return this;
        }

        public Builder setNote___starts_with(String note___starts_with) {
            this.note___starts_with = note___starts_with;
            return this;
        }

        public Builder setNote___not___starts_with(String note___not___starts_with) {
            this.note___not___starts_with = note___not___starts_with;
            return this;
        }

        public Builder setNote___ends_with(String note___ends_with) {
            this.note___ends_with = note___ends_with;
            return this;
        }

        public Builder setNote___not___ends_with(String note___not___ends_with) {
            this.note___not___ends_with = note___not___ends_with;
            return this;
        }

        public Builder setRisolto___eq(Boolean risolto___eq) {
            this.risolto___eq = risolto___eq;
            return this;
        }

        public Builder setRisolto___ne(Boolean risolto___ne) {
            this.risolto___ne = risolto___ne;
            return this;
        }

        public Builder setRisolto___null(Boolean risolto___null) {
            this.risolto___null = risolto___null;
            return this;
        }

        public Builder setRisolto___not___null(Boolean risolto___not___null) {
            this.risolto___not___null = risolto___not___null;
            return this;
        }

        public Builder setSpecifiche___eq(String specifiche___eq) {
            this.specifiche___eq = specifiche___eq;
            return this;
        }

        public Builder setSpecifiche___ne(String specifiche___ne) {
            this.specifiche___ne = specifiche___ne;
            return this;
        }

        public Builder setSpecifiche___null(Boolean specifiche___null) {
            this.specifiche___null = specifiche___null;
            return this;
        }

        public Builder setSpecifiche___not___null(Boolean specifiche___not___null) {
            this.specifiche___not___null = specifiche___not___null;
            return this;
        }

        public Builder setSpecifiche___in(java.util.List<String> specifiche___in) {
            this.specifiche___in = specifiche___in;
            return this;
        }

        public Builder setSpecifiche___not___in(java.util.List<String> specifiche___not___in) {
            this.specifiche___not___in = specifiche___not___in;
            return this;
        }

        public Builder setSpecifiche___lt(String specifiche___lt) {
            this.specifiche___lt = specifiche___lt;
            return this;
        }

        public Builder setSpecifiche___lte(String specifiche___lte) {
            this.specifiche___lte = specifiche___lte;
            return this;
        }

        public Builder setSpecifiche___gt(String specifiche___gt) {
            this.specifiche___gt = specifiche___gt;
            return this;
        }

        public Builder setSpecifiche___gte(String specifiche___gte) {
            this.specifiche___gte = specifiche___gte;
            return this;
        }

        public Builder setSpecifiche___contains(String specifiche___contains) {
            this.specifiche___contains = specifiche___contains;
            return this;
        }

        public Builder setSpecifiche___not___contains(String specifiche___not___contains) {
            this.specifiche___not___contains = specifiche___not___contains;
            return this;
        }

        public Builder setSpecifiche___starts_with(String specifiche___starts_with) {
            this.specifiche___starts_with = specifiche___starts_with;
            return this;
        }

        public Builder setSpecifiche___not___starts_with(String specifiche___not___starts_with) {
            this.specifiche___not___starts_with = specifiche___not___starts_with;
            return this;
        }

        public Builder setSpecifiche___ends_with(String specifiche___ends_with) {
            this.specifiche___ends_with = specifiche___ends_with;
            return this;
        }

        public Builder setSpecifiche___not___ends_with(String specifiche___not___ends_with) {
            this.specifiche___not___ends_with = specifiche___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliChecksFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliChecksFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliChecksFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliChecksFilterDTO build() {
            CliChecksFilterDTO result = new CliChecksFilterDTO();
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
            result.setCheck_id___eq(this.check_id___eq);
            result.setCheck_id___ne(this.check_id___ne);
            result.setCheck_id___null(this.check_id___null);
            result.setCheck_id___not___null(this.check_id___not___null);
            result.setCheck_id___in(this.check_id___in);
            result.setCheck_id___not___in(this.check_id___not___in);
            result.setCheck_id___lt(this.check_id___lt);
            result.setCheck_id___lte(this.check_id___lte);
            result.setCheck_id___gt(this.check_id___gt);
            result.setCheck_id___gte(this.check_id___gte);
            result.setCheck_id___contains(this.check_id___contains);
            result.setCheck_id___not___contains(this.check_id___not___contains);
            result.setCheck_id___starts_with(this.check_id___starts_with);
            result.setCheck_id___not___starts_with(this.check_id___not___starts_with);
            result.setCheck_id___ends_with(this.check_id___ends_with);
            result.setCheck_id___not___ends_with(this.check_id___not___ends_with);
            result.setCodice_centro_h___eq(this.codice_centro_h___eq);
            result.setCodice_centro_h___ne(this.codice_centro_h___ne);
            result.setCodice_centro_h___null(this.codice_centro_h___null);
            result.setCodice_centro_h___not___null(this.codice_centro_h___not___null);
            result.setCodice_centro_h___in(this.codice_centro_h___in);
            result.setCodice_centro_h___not___in(this.codice_centro_h___not___in);
            result.setCodice_centro_h___lt(this.codice_centro_h___lt);
            result.setCodice_centro_h___lte(this.codice_centro_h___lte);
            result.setCodice_centro_h___gt(this.codice_centro_h___gt);
            result.setCodice_centro_h___gte(this.codice_centro_h___gte);
            result.setCodice_centro_h___contains(this.codice_centro_h___contains);
            result.setCodice_centro_h___not___contains(this.codice_centro_h___not___contains);
            result.setCodice_centro_h___starts_with(this.codice_centro_h___starts_with);
            result.setCodice_centro_h___not___starts_with(this.codice_centro_h___not___starts_with);
            result.setCodice_centro_h___ends_with(this.codice_centro_h___ends_with);
            result.setCodice_centro_h___not___ends_with(this.codice_centro_h___not___ends_with);
            result.setCodice_centro_i___eq(this.codice_centro_i___eq);
            result.setCodice_centro_i___ne(this.codice_centro_i___ne);
            result.setCodice_centro_i___null(this.codice_centro_i___null);
            result.setCodice_centro_i___not___null(this.codice_centro_i___not___null);
            result.setCodice_centro_i___in(this.codice_centro_i___in);
            result.setCodice_centro_i___not___in(this.codice_centro_i___not___in);
            result.setCodice_centro_i___lt(this.codice_centro_i___lt);
            result.setCodice_centro_i___lte(this.codice_centro_i___lte);
            result.setCodice_centro_i___gt(this.codice_centro_i___gt);
            result.setCodice_centro_i___gte(this.codice_centro_i___gte);
            result.setCodice_centro_i___contains(this.codice_centro_i___contains);
            result.setCodice_centro_i___not___contains(this.codice_centro_i___not___contains);
            result.setCodice_centro_i___starts_with(this.codice_centro_i___starts_with);
            result.setCodice_centro_i___not___starts_with(this.codice_centro_i___not___starts_with);
            result.setCodice_centro_i___ends_with(this.codice_centro_i___ends_with);
            result.setCodice_centro_i___not___ends_with(this.codice_centro_i___not___ends_with);
            result.setCodice_hepa___eq(this.codice_hepa___eq);
            result.setCodice_hepa___ne(this.codice_hepa___ne);
            result.setCodice_hepa___null(this.codice_hepa___null);
            result.setCodice_hepa___not___null(this.codice_hepa___not___null);
            result.setCodice_hepa___in(this.codice_hepa___in);
            result.setCodice_hepa___not___in(this.codice_hepa___not___in);
            result.setCodice_hepa___lt(this.codice_hepa___lt);
            result.setCodice_hepa___lte(this.codice_hepa___lte);
            result.setCodice_hepa___gt(this.codice_hepa___gt);
            result.setCodice_hepa___gte(this.codice_hepa___gte);
            result.setCodice_hepa___contains(this.codice_hepa___contains);
            result.setCodice_hepa___not___contains(this.codice_hepa___not___contains);
            result.setCodice_hepa___starts_with(this.codice_hepa___starts_with);
            result.setCodice_hepa___not___starts_with(this.codice_hepa___not___starts_with);
            result.setCodice_hepa___ends_with(this.codice_hepa___ends_with);
            result.setCodice_hepa___not___ends_with(this.codice_hepa___not___ends_with);
            result.setCodice_ico___eq(this.codice_ico___eq);
            result.setCodice_ico___ne(this.codice_ico___ne);
            result.setCodice_ico___null(this.codice_ico___null);
            result.setCodice_ico___not___null(this.codice_ico___not___null);
            result.setCodice_ico___in(this.codice_ico___in);
            result.setCodice_ico___not___in(this.codice_ico___not___in);
            result.setCodice_ico___lt(this.codice_ico___lt);
            result.setCodice_ico___lte(this.codice_ico___lte);
            result.setCodice_ico___gt(this.codice_ico___gt);
            result.setCodice_ico___gte(this.codice_ico___gte);
            result.setCodice_ico___contains(this.codice_ico___contains);
            result.setCodice_ico___not___contains(this.codice_ico___not___contains);
            result.setCodice_ico___starts_with(this.codice_ico___starts_with);
            result.setCodice_ico___not___starts_with(this.codice_ico___not___starts_with);
            result.setCodice_ico___ends_with(this.codice_ico___ends_with);
            result.setCodice_ico___not___ends_with(this.codice_ico___not___ends_with);
            result.setDescrizione___eq(this.descrizione___eq);
            result.setDescrizione___ne(this.descrizione___ne);
            result.setDescrizione___null(this.descrizione___null);
            result.setDescrizione___not___null(this.descrizione___not___null);
            result.setDescrizione___in(this.descrizione___in);
            result.setDescrizione___not___in(this.descrizione___not___in);
            result.setDescrizione___lt(this.descrizione___lt);
            result.setDescrizione___lte(this.descrizione___lte);
            result.setDescrizione___gt(this.descrizione___gt);
            result.setDescrizione___gte(this.descrizione___gte);
            result.setDescrizione___contains(this.descrizione___contains);
            result.setDescrizione___not___contains(this.descrizione___not___contains);
            result.setDescrizione___starts_with(this.descrizione___starts_with);
            result.setDescrizione___not___starts_with(this.descrizione___not___starts_with);
            result.setDescrizione___ends_with(this.descrizione___ends_with);
            result.setDescrizione___not___ends_with(this.descrizione___not___ends_with);
            result.setNote___eq(this.note___eq);
            result.setNote___ne(this.note___ne);
            result.setNote___null(this.note___null);
            result.setNote___not___null(this.note___not___null);
            result.setNote___in(this.note___in);
            result.setNote___not___in(this.note___not___in);
            result.setNote___lt(this.note___lt);
            result.setNote___lte(this.note___lte);
            result.setNote___gt(this.note___gt);
            result.setNote___gte(this.note___gte);
            result.setNote___contains(this.note___contains);
            result.setNote___not___contains(this.note___not___contains);
            result.setNote___starts_with(this.note___starts_with);
            result.setNote___not___starts_with(this.note___not___starts_with);
            result.setNote___ends_with(this.note___ends_with);
            result.setNote___not___ends_with(this.note___not___ends_with);
            result.setRisolto___eq(this.risolto___eq);
            result.setRisolto___ne(this.risolto___ne);
            result.setRisolto___null(this.risolto___null);
            result.setRisolto___not___null(this.risolto___not___null);
            result.setSpecifiche___eq(this.specifiche___eq);
            result.setSpecifiche___ne(this.specifiche___ne);
            result.setSpecifiche___null(this.specifiche___null);
            result.setSpecifiche___not___null(this.specifiche___not___null);
            result.setSpecifiche___in(this.specifiche___in);
            result.setSpecifiche___not___in(this.specifiche___not___in);
            result.setSpecifiche___lt(this.specifiche___lt);
            result.setSpecifiche___lte(this.specifiche___lte);
            result.setSpecifiche___gt(this.specifiche___gt);
            result.setSpecifiche___gte(this.specifiche___gte);
            result.setSpecifiche___contains(this.specifiche___contains);
            result.setSpecifiche___not___contains(this.specifiche___not___contains);
            result.setSpecifiche___starts_with(this.specifiche___starts_with);
            result.setSpecifiche___not___starts_with(this.specifiche___not___starts_with);
            result.setSpecifiche___ends_with(this.specifiche___ends_with);
            result.setSpecifiche___not___ends_with(this.specifiche___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
