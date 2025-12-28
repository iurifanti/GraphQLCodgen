package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Farmaco_ATC.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliFarmaco_ATCFilterDTO implements java.io.Serializable {

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
    private Boolean antitumorale___eq;
    private Boolean antitumorale___ne;
    private Boolean antitumorale___null;
    private Boolean antitumorale___not___null;
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
    private String ddd___eq;
    private String ddd___ne;
    private Boolean ddd___null;
    private Boolean ddd___not___null;
    private java.util.List<String> ddd___in;
    private java.util.List<String> ddd___not___in;
    private String ddd___lt;
    private String ddd___lte;
    private String ddd___gt;
    private String ddd___gte;
    private String ddd_kind___eq;
    private String ddd_kind___ne;
    private Boolean ddd_kind___null;
    private Boolean ddd_kind___not___null;
    private java.util.List<String> ddd_kind___in;
    private java.util.List<String> ddd_kind___not___in;
    private String ddd_kind___lt;
    private String ddd_kind___lte;
    private String ddd_kind___gt;
    private String ddd_kind___gte;
    private String ddd_kind___contains;
    private String ddd_kind___not___contains;
    private String ddd_kind___starts_with;
    private String ddd_kind___not___starts_with;
    private String ddd_kind___ends_with;
    private String ddd_kind___not___ends_with;
    private String ddd_note___eq;
    private String ddd_note___ne;
    private Boolean ddd_note___null;
    private Boolean ddd_note___not___null;
    private java.util.List<String> ddd_note___in;
    private java.util.List<String> ddd_note___not___in;
    private String ddd_note___lt;
    private String ddd_note___lte;
    private String ddd_note___gt;
    private String ddd_note___gte;
    private String ddd_note___contains;
    private String ddd_note___not___contains;
    private String ddd_note___starts_with;
    private String ddd_note___not___starts_with;
    private String ddd_note___ends_with;
    private String ddd_note___not___ends_with;
    private String ddd_um___eq;
    private String ddd_um___ne;
    private Boolean ddd_um___null;
    private Boolean ddd_um___not___null;
    private java.util.List<String> ddd_um___in;
    private java.util.List<String> ddd_um___not___in;
    private String ddd_um___lt;
    private String ddd_um___lte;
    private String ddd_um___gt;
    private String ddd_um___gte;
    private String ddd_um___contains;
    private String ddd_um___not___contains;
    private String ddd_um___starts_with;
    private String ddd_um___not___starts_with;
    private String ddd_um___ends_with;
    private String ddd_um___not___ends_with;
    private Boolean epatico___eq;
    private Boolean epatico___ne;
    private Boolean epatico___null;
    private Boolean epatico___not___null;
    private Boolean hiv___eq;
    private Boolean hiv___ne;
    private Boolean hiv___null;
    private Boolean hiv___not___null;
    private Integer livello___eq;
    private Integer livello___ne;
    private Boolean livello___null;
    private Boolean livello___not___null;
    private java.util.List<Integer> livello___in;
    private java.util.List<Integer> livello___not___in;
    private Integer livello___lt;
    private Integer livello___lte;
    private Integer livello___gt;
    private Integer livello___gte;
    private Boolean long_acting___eq;
    private Boolean long_acting___ne;
    private Boolean long_acting___null;
    private Boolean long_acting___not___null;
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
    private Boolean non_arv___eq;
    private Boolean non_arv___ne;
    private Boolean non_arv___null;
    private Boolean non_arv___not___null;
    private Boolean prep___eq;
    private Boolean prep___ne;
    private Boolean prep___null;
    private Boolean prep___not___null;
    private String titolo___eq;
    private String titolo___ne;
    private Boolean titolo___null;
    private Boolean titolo___not___null;
    private java.util.List<String> titolo___in;
    private java.util.List<String> titolo___not___in;
    private String titolo___lt;
    private String titolo___lte;
    private String titolo___gt;
    private String titolo___gte;
    private String titolo___contains;
    private String titolo___not___contains;
    private String titolo___starts_with;
    private String titolo___not___starts_with;
    private String titolo___ends_with;
    private String titolo___not___ends_with;
    private java.util.List<CliFarmaco_ATCFilterDTO> AND;
    private java.util.List<CliFarmaco_ATCFilterDTO> OR;
    private CliFarmaco_ATCFilterDTO NOT;

    public CliFarmaco_ATCFilterDTO() {
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

    public Boolean getAntitumorale___eq() {
        return antitumorale___eq;
    }
    public void setAntitumorale___eq(Boolean antitumorale___eq) {
        this.antitumorale___eq = antitumorale___eq;
    }

    public Boolean getAntitumorale___ne() {
        return antitumorale___ne;
    }
    public void setAntitumorale___ne(Boolean antitumorale___ne) {
        this.antitumorale___ne = antitumorale___ne;
    }

    public Boolean getAntitumorale___null() {
        return antitumorale___null;
    }
    public void setAntitumorale___null(Boolean antitumorale___null) {
        this.antitumorale___null = antitumorale___null;
    }

    public Boolean getAntitumorale___not___null() {
        return antitumorale___not___null;
    }
    public void setAntitumorale___not___null(Boolean antitumorale___not___null) {
        this.antitumorale___not___null = antitumorale___not___null;
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

    public String getDdd___eq() {
        return ddd___eq;
    }
    public void setDdd___eq(String ddd___eq) {
        this.ddd___eq = ddd___eq;
    }

    public String getDdd___ne() {
        return ddd___ne;
    }
    public void setDdd___ne(String ddd___ne) {
        this.ddd___ne = ddd___ne;
    }

    public Boolean getDdd___null() {
        return ddd___null;
    }
    public void setDdd___null(Boolean ddd___null) {
        this.ddd___null = ddd___null;
    }

    public Boolean getDdd___not___null() {
        return ddd___not___null;
    }
    public void setDdd___not___null(Boolean ddd___not___null) {
        this.ddd___not___null = ddd___not___null;
    }

    public java.util.List<String> getDdd___in() {
        return ddd___in;
    }
    public void setDdd___in(java.util.List<String> ddd___in) {
        this.ddd___in = ddd___in;
    }

    public java.util.List<String> getDdd___not___in() {
        return ddd___not___in;
    }
    public void setDdd___not___in(java.util.List<String> ddd___not___in) {
        this.ddd___not___in = ddd___not___in;
    }

    public String getDdd___lt() {
        return ddd___lt;
    }
    public void setDdd___lt(String ddd___lt) {
        this.ddd___lt = ddd___lt;
    }

    public String getDdd___lte() {
        return ddd___lte;
    }
    public void setDdd___lte(String ddd___lte) {
        this.ddd___lte = ddd___lte;
    }

    public String getDdd___gt() {
        return ddd___gt;
    }
    public void setDdd___gt(String ddd___gt) {
        this.ddd___gt = ddd___gt;
    }

    public String getDdd___gte() {
        return ddd___gte;
    }
    public void setDdd___gte(String ddd___gte) {
        this.ddd___gte = ddd___gte;
    }

    public String getDdd_kind___eq() {
        return ddd_kind___eq;
    }
    public void setDdd_kind___eq(String ddd_kind___eq) {
        this.ddd_kind___eq = ddd_kind___eq;
    }

    public String getDdd_kind___ne() {
        return ddd_kind___ne;
    }
    public void setDdd_kind___ne(String ddd_kind___ne) {
        this.ddd_kind___ne = ddd_kind___ne;
    }

    public Boolean getDdd_kind___null() {
        return ddd_kind___null;
    }
    public void setDdd_kind___null(Boolean ddd_kind___null) {
        this.ddd_kind___null = ddd_kind___null;
    }

    public Boolean getDdd_kind___not___null() {
        return ddd_kind___not___null;
    }
    public void setDdd_kind___not___null(Boolean ddd_kind___not___null) {
        this.ddd_kind___not___null = ddd_kind___not___null;
    }

    public java.util.List<String> getDdd_kind___in() {
        return ddd_kind___in;
    }
    public void setDdd_kind___in(java.util.List<String> ddd_kind___in) {
        this.ddd_kind___in = ddd_kind___in;
    }

    public java.util.List<String> getDdd_kind___not___in() {
        return ddd_kind___not___in;
    }
    public void setDdd_kind___not___in(java.util.List<String> ddd_kind___not___in) {
        this.ddd_kind___not___in = ddd_kind___not___in;
    }

    public String getDdd_kind___lt() {
        return ddd_kind___lt;
    }
    public void setDdd_kind___lt(String ddd_kind___lt) {
        this.ddd_kind___lt = ddd_kind___lt;
    }

    public String getDdd_kind___lte() {
        return ddd_kind___lte;
    }
    public void setDdd_kind___lte(String ddd_kind___lte) {
        this.ddd_kind___lte = ddd_kind___lte;
    }

    public String getDdd_kind___gt() {
        return ddd_kind___gt;
    }
    public void setDdd_kind___gt(String ddd_kind___gt) {
        this.ddd_kind___gt = ddd_kind___gt;
    }

    public String getDdd_kind___gte() {
        return ddd_kind___gte;
    }
    public void setDdd_kind___gte(String ddd_kind___gte) {
        this.ddd_kind___gte = ddd_kind___gte;
    }

    public String getDdd_kind___contains() {
        return ddd_kind___contains;
    }
    public void setDdd_kind___contains(String ddd_kind___contains) {
        this.ddd_kind___contains = ddd_kind___contains;
    }

    public String getDdd_kind___not___contains() {
        return ddd_kind___not___contains;
    }
    public void setDdd_kind___not___contains(String ddd_kind___not___contains) {
        this.ddd_kind___not___contains = ddd_kind___not___contains;
    }

    public String getDdd_kind___starts_with() {
        return ddd_kind___starts_with;
    }
    public void setDdd_kind___starts_with(String ddd_kind___starts_with) {
        this.ddd_kind___starts_with = ddd_kind___starts_with;
    }

    public String getDdd_kind___not___starts_with() {
        return ddd_kind___not___starts_with;
    }
    public void setDdd_kind___not___starts_with(String ddd_kind___not___starts_with) {
        this.ddd_kind___not___starts_with = ddd_kind___not___starts_with;
    }

    public String getDdd_kind___ends_with() {
        return ddd_kind___ends_with;
    }
    public void setDdd_kind___ends_with(String ddd_kind___ends_with) {
        this.ddd_kind___ends_with = ddd_kind___ends_with;
    }

    public String getDdd_kind___not___ends_with() {
        return ddd_kind___not___ends_with;
    }
    public void setDdd_kind___not___ends_with(String ddd_kind___not___ends_with) {
        this.ddd_kind___not___ends_with = ddd_kind___not___ends_with;
    }

    public String getDdd_note___eq() {
        return ddd_note___eq;
    }
    public void setDdd_note___eq(String ddd_note___eq) {
        this.ddd_note___eq = ddd_note___eq;
    }

    public String getDdd_note___ne() {
        return ddd_note___ne;
    }
    public void setDdd_note___ne(String ddd_note___ne) {
        this.ddd_note___ne = ddd_note___ne;
    }

    public Boolean getDdd_note___null() {
        return ddd_note___null;
    }
    public void setDdd_note___null(Boolean ddd_note___null) {
        this.ddd_note___null = ddd_note___null;
    }

    public Boolean getDdd_note___not___null() {
        return ddd_note___not___null;
    }
    public void setDdd_note___not___null(Boolean ddd_note___not___null) {
        this.ddd_note___not___null = ddd_note___not___null;
    }

    public java.util.List<String> getDdd_note___in() {
        return ddd_note___in;
    }
    public void setDdd_note___in(java.util.List<String> ddd_note___in) {
        this.ddd_note___in = ddd_note___in;
    }

    public java.util.List<String> getDdd_note___not___in() {
        return ddd_note___not___in;
    }
    public void setDdd_note___not___in(java.util.List<String> ddd_note___not___in) {
        this.ddd_note___not___in = ddd_note___not___in;
    }

    public String getDdd_note___lt() {
        return ddd_note___lt;
    }
    public void setDdd_note___lt(String ddd_note___lt) {
        this.ddd_note___lt = ddd_note___lt;
    }

    public String getDdd_note___lte() {
        return ddd_note___lte;
    }
    public void setDdd_note___lte(String ddd_note___lte) {
        this.ddd_note___lte = ddd_note___lte;
    }

    public String getDdd_note___gt() {
        return ddd_note___gt;
    }
    public void setDdd_note___gt(String ddd_note___gt) {
        this.ddd_note___gt = ddd_note___gt;
    }

    public String getDdd_note___gte() {
        return ddd_note___gte;
    }
    public void setDdd_note___gte(String ddd_note___gte) {
        this.ddd_note___gte = ddd_note___gte;
    }

    public String getDdd_note___contains() {
        return ddd_note___contains;
    }
    public void setDdd_note___contains(String ddd_note___contains) {
        this.ddd_note___contains = ddd_note___contains;
    }

    public String getDdd_note___not___contains() {
        return ddd_note___not___contains;
    }
    public void setDdd_note___not___contains(String ddd_note___not___contains) {
        this.ddd_note___not___contains = ddd_note___not___contains;
    }

    public String getDdd_note___starts_with() {
        return ddd_note___starts_with;
    }
    public void setDdd_note___starts_with(String ddd_note___starts_with) {
        this.ddd_note___starts_with = ddd_note___starts_with;
    }

    public String getDdd_note___not___starts_with() {
        return ddd_note___not___starts_with;
    }
    public void setDdd_note___not___starts_with(String ddd_note___not___starts_with) {
        this.ddd_note___not___starts_with = ddd_note___not___starts_with;
    }

    public String getDdd_note___ends_with() {
        return ddd_note___ends_with;
    }
    public void setDdd_note___ends_with(String ddd_note___ends_with) {
        this.ddd_note___ends_with = ddd_note___ends_with;
    }

    public String getDdd_note___not___ends_with() {
        return ddd_note___not___ends_with;
    }
    public void setDdd_note___not___ends_with(String ddd_note___not___ends_with) {
        this.ddd_note___not___ends_with = ddd_note___not___ends_with;
    }

    public String getDdd_um___eq() {
        return ddd_um___eq;
    }
    public void setDdd_um___eq(String ddd_um___eq) {
        this.ddd_um___eq = ddd_um___eq;
    }

    public String getDdd_um___ne() {
        return ddd_um___ne;
    }
    public void setDdd_um___ne(String ddd_um___ne) {
        this.ddd_um___ne = ddd_um___ne;
    }

    public Boolean getDdd_um___null() {
        return ddd_um___null;
    }
    public void setDdd_um___null(Boolean ddd_um___null) {
        this.ddd_um___null = ddd_um___null;
    }

    public Boolean getDdd_um___not___null() {
        return ddd_um___not___null;
    }
    public void setDdd_um___not___null(Boolean ddd_um___not___null) {
        this.ddd_um___not___null = ddd_um___not___null;
    }

    public java.util.List<String> getDdd_um___in() {
        return ddd_um___in;
    }
    public void setDdd_um___in(java.util.List<String> ddd_um___in) {
        this.ddd_um___in = ddd_um___in;
    }

    public java.util.List<String> getDdd_um___not___in() {
        return ddd_um___not___in;
    }
    public void setDdd_um___not___in(java.util.List<String> ddd_um___not___in) {
        this.ddd_um___not___in = ddd_um___not___in;
    }

    public String getDdd_um___lt() {
        return ddd_um___lt;
    }
    public void setDdd_um___lt(String ddd_um___lt) {
        this.ddd_um___lt = ddd_um___lt;
    }

    public String getDdd_um___lte() {
        return ddd_um___lte;
    }
    public void setDdd_um___lte(String ddd_um___lte) {
        this.ddd_um___lte = ddd_um___lte;
    }

    public String getDdd_um___gt() {
        return ddd_um___gt;
    }
    public void setDdd_um___gt(String ddd_um___gt) {
        this.ddd_um___gt = ddd_um___gt;
    }

    public String getDdd_um___gte() {
        return ddd_um___gte;
    }
    public void setDdd_um___gte(String ddd_um___gte) {
        this.ddd_um___gte = ddd_um___gte;
    }

    public String getDdd_um___contains() {
        return ddd_um___contains;
    }
    public void setDdd_um___contains(String ddd_um___contains) {
        this.ddd_um___contains = ddd_um___contains;
    }

    public String getDdd_um___not___contains() {
        return ddd_um___not___contains;
    }
    public void setDdd_um___not___contains(String ddd_um___not___contains) {
        this.ddd_um___not___contains = ddd_um___not___contains;
    }

    public String getDdd_um___starts_with() {
        return ddd_um___starts_with;
    }
    public void setDdd_um___starts_with(String ddd_um___starts_with) {
        this.ddd_um___starts_with = ddd_um___starts_with;
    }

    public String getDdd_um___not___starts_with() {
        return ddd_um___not___starts_with;
    }
    public void setDdd_um___not___starts_with(String ddd_um___not___starts_with) {
        this.ddd_um___not___starts_with = ddd_um___not___starts_with;
    }

    public String getDdd_um___ends_with() {
        return ddd_um___ends_with;
    }
    public void setDdd_um___ends_with(String ddd_um___ends_with) {
        this.ddd_um___ends_with = ddd_um___ends_with;
    }

    public String getDdd_um___not___ends_with() {
        return ddd_um___not___ends_with;
    }
    public void setDdd_um___not___ends_with(String ddd_um___not___ends_with) {
        this.ddd_um___not___ends_with = ddd_um___not___ends_with;
    }

    public Boolean getEpatico___eq() {
        return epatico___eq;
    }
    public void setEpatico___eq(Boolean epatico___eq) {
        this.epatico___eq = epatico___eq;
    }

    public Boolean getEpatico___ne() {
        return epatico___ne;
    }
    public void setEpatico___ne(Boolean epatico___ne) {
        this.epatico___ne = epatico___ne;
    }

    public Boolean getEpatico___null() {
        return epatico___null;
    }
    public void setEpatico___null(Boolean epatico___null) {
        this.epatico___null = epatico___null;
    }

    public Boolean getEpatico___not___null() {
        return epatico___not___null;
    }
    public void setEpatico___not___null(Boolean epatico___not___null) {
        this.epatico___not___null = epatico___not___null;
    }

    public Boolean getHiv___eq() {
        return hiv___eq;
    }
    public void setHiv___eq(Boolean hiv___eq) {
        this.hiv___eq = hiv___eq;
    }

    public Boolean getHiv___ne() {
        return hiv___ne;
    }
    public void setHiv___ne(Boolean hiv___ne) {
        this.hiv___ne = hiv___ne;
    }

    public Boolean getHiv___null() {
        return hiv___null;
    }
    public void setHiv___null(Boolean hiv___null) {
        this.hiv___null = hiv___null;
    }

    public Boolean getHiv___not___null() {
        return hiv___not___null;
    }
    public void setHiv___not___null(Boolean hiv___not___null) {
        this.hiv___not___null = hiv___not___null;
    }

    public Integer getLivello___eq() {
        return livello___eq;
    }
    public void setLivello___eq(Integer livello___eq) {
        this.livello___eq = livello___eq;
    }

    public Integer getLivello___ne() {
        return livello___ne;
    }
    public void setLivello___ne(Integer livello___ne) {
        this.livello___ne = livello___ne;
    }

    public Boolean getLivello___null() {
        return livello___null;
    }
    public void setLivello___null(Boolean livello___null) {
        this.livello___null = livello___null;
    }

    public Boolean getLivello___not___null() {
        return livello___not___null;
    }
    public void setLivello___not___null(Boolean livello___not___null) {
        this.livello___not___null = livello___not___null;
    }

    public java.util.List<Integer> getLivello___in() {
        return livello___in;
    }
    public void setLivello___in(java.util.List<Integer> livello___in) {
        this.livello___in = livello___in;
    }

    public java.util.List<Integer> getLivello___not___in() {
        return livello___not___in;
    }
    public void setLivello___not___in(java.util.List<Integer> livello___not___in) {
        this.livello___not___in = livello___not___in;
    }

    public Integer getLivello___lt() {
        return livello___lt;
    }
    public void setLivello___lt(Integer livello___lt) {
        this.livello___lt = livello___lt;
    }

    public Integer getLivello___lte() {
        return livello___lte;
    }
    public void setLivello___lte(Integer livello___lte) {
        this.livello___lte = livello___lte;
    }

    public Integer getLivello___gt() {
        return livello___gt;
    }
    public void setLivello___gt(Integer livello___gt) {
        this.livello___gt = livello___gt;
    }

    public Integer getLivello___gte() {
        return livello___gte;
    }
    public void setLivello___gte(Integer livello___gte) {
        this.livello___gte = livello___gte;
    }

    public Boolean getLong_acting___eq() {
        return long_acting___eq;
    }
    public void setLong_acting___eq(Boolean long_acting___eq) {
        this.long_acting___eq = long_acting___eq;
    }

    public Boolean getLong_acting___ne() {
        return long_acting___ne;
    }
    public void setLong_acting___ne(Boolean long_acting___ne) {
        this.long_acting___ne = long_acting___ne;
    }

    public Boolean getLong_acting___null() {
        return long_acting___null;
    }
    public void setLong_acting___null(Boolean long_acting___null) {
        this.long_acting___null = long_acting___null;
    }

    public Boolean getLong_acting___not___null() {
        return long_acting___not___null;
    }
    public void setLong_acting___not___null(Boolean long_acting___not___null) {
        this.long_acting___not___null = long_acting___not___null;
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

    public Boolean getNon_arv___eq() {
        return non_arv___eq;
    }
    public void setNon_arv___eq(Boolean non_arv___eq) {
        this.non_arv___eq = non_arv___eq;
    }

    public Boolean getNon_arv___ne() {
        return non_arv___ne;
    }
    public void setNon_arv___ne(Boolean non_arv___ne) {
        this.non_arv___ne = non_arv___ne;
    }

    public Boolean getNon_arv___null() {
        return non_arv___null;
    }
    public void setNon_arv___null(Boolean non_arv___null) {
        this.non_arv___null = non_arv___null;
    }

    public Boolean getNon_arv___not___null() {
        return non_arv___not___null;
    }
    public void setNon_arv___not___null(Boolean non_arv___not___null) {
        this.non_arv___not___null = non_arv___not___null;
    }

    public Boolean getPrep___eq() {
        return prep___eq;
    }
    public void setPrep___eq(Boolean prep___eq) {
        this.prep___eq = prep___eq;
    }

    public Boolean getPrep___ne() {
        return prep___ne;
    }
    public void setPrep___ne(Boolean prep___ne) {
        this.prep___ne = prep___ne;
    }

    public Boolean getPrep___null() {
        return prep___null;
    }
    public void setPrep___null(Boolean prep___null) {
        this.prep___null = prep___null;
    }

    public Boolean getPrep___not___null() {
        return prep___not___null;
    }
    public void setPrep___not___null(Boolean prep___not___null) {
        this.prep___not___null = prep___not___null;
    }

    public String getTitolo___eq() {
        return titolo___eq;
    }
    public void setTitolo___eq(String titolo___eq) {
        this.titolo___eq = titolo___eq;
    }

    public String getTitolo___ne() {
        return titolo___ne;
    }
    public void setTitolo___ne(String titolo___ne) {
        this.titolo___ne = titolo___ne;
    }

    public Boolean getTitolo___null() {
        return titolo___null;
    }
    public void setTitolo___null(Boolean titolo___null) {
        this.titolo___null = titolo___null;
    }

    public Boolean getTitolo___not___null() {
        return titolo___not___null;
    }
    public void setTitolo___not___null(Boolean titolo___not___null) {
        this.titolo___not___null = titolo___not___null;
    }

    public java.util.List<String> getTitolo___in() {
        return titolo___in;
    }
    public void setTitolo___in(java.util.List<String> titolo___in) {
        this.titolo___in = titolo___in;
    }

    public java.util.List<String> getTitolo___not___in() {
        return titolo___not___in;
    }
    public void setTitolo___not___in(java.util.List<String> titolo___not___in) {
        this.titolo___not___in = titolo___not___in;
    }

    public String getTitolo___lt() {
        return titolo___lt;
    }
    public void setTitolo___lt(String titolo___lt) {
        this.titolo___lt = titolo___lt;
    }

    public String getTitolo___lte() {
        return titolo___lte;
    }
    public void setTitolo___lte(String titolo___lte) {
        this.titolo___lte = titolo___lte;
    }

    public String getTitolo___gt() {
        return titolo___gt;
    }
    public void setTitolo___gt(String titolo___gt) {
        this.titolo___gt = titolo___gt;
    }

    public String getTitolo___gte() {
        return titolo___gte;
    }
    public void setTitolo___gte(String titolo___gte) {
        this.titolo___gte = titolo___gte;
    }

    public String getTitolo___contains() {
        return titolo___contains;
    }
    public void setTitolo___contains(String titolo___contains) {
        this.titolo___contains = titolo___contains;
    }

    public String getTitolo___not___contains() {
        return titolo___not___contains;
    }
    public void setTitolo___not___contains(String titolo___not___contains) {
        this.titolo___not___contains = titolo___not___contains;
    }

    public String getTitolo___starts_with() {
        return titolo___starts_with;
    }
    public void setTitolo___starts_with(String titolo___starts_with) {
        this.titolo___starts_with = titolo___starts_with;
    }

    public String getTitolo___not___starts_with() {
        return titolo___not___starts_with;
    }
    public void setTitolo___not___starts_with(String titolo___not___starts_with) {
        this.titolo___not___starts_with = titolo___not___starts_with;
    }

    public String getTitolo___ends_with() {
        return titolo___ends_with;
    }
    public void setTitolo___ends_with(String titolo___ends_with) {
        this.titolo___ends_with = titolo___ends_with;
    }

    public String getTitolo___not___ends_with() {
        return titolo___not___ends_with;
    }
    public void setTitolo___not___ends_with(String titolo___not___ends_with) {
        this.titolo___not___ends_with = titolo___not___ends_with;
    }

    public java.util.List<CliFarmaco_ATCFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliFarmaco_ATCFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliFarmaco_ATCFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliFarmaco_ATCFilterDTO> OR) {
        this.OR = OR;
    }

    public CliFarmaco_ATCFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliFarmaco_ATCFilterDTO NOT) {
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
        if (antitumorale___eq != null) {
            joiner.add("antitumorale___eq: " + GraphQLRequestSerializer.getEntry(antitumorale___eq));
        }
        if (antitumorale___ne != null) {
            joiner.add("antitumorale___ne: " + GraphQLRequestSerializer.getEntry(antitumorale___ne));
        }
        if (antitumorale___null != null) {
            joiner.add("antitumorale___null: " + GraphQLRequestSerializer.getEntry(antitumorale___null));
        }
        if (antitumorale___not___null != null) {
            joiner.add("antitumorale___not___null: " + GraphQLRequestSerializer.getEntry(antitumorale___not___null));
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
        if (ddd___eq != null) {
            joiner.add("ddd___eq: " + GraphQLRequestSerializer.getEntry(ddd___eq));
        }
        if (ddd___ne != null) {
            joiner.add("ddd___ne: " + GraphQLRequestSerializer.getEntry(ddd___ne));
        }
        if (ddd___null != null) {
            joiner.add("ddd___null: " + GraphQLRequestSerializer.getEntry(ddd___null));
        }
        if (ddd___not___null != null) {
            joiner.add("ddd___not___null: " + GraphQLRequestSerializer.getEntry(ddd___not___null));
        }
        if (ddd___in != null) {
            joiner.add("ddd___in: " + GraphQLRequestSerializer.getEntry(ddd___in));
        }
        if (ddd___not___in != null) {
            joiner.add("ddd___not___in: " + GraphQLRequestSerializer.getEntry(ddd___not___in));
        }
        if (ddd___lt != null) {
            joiner.add("ddd___lt: " + GraphQLRequestSerializer.getEntry(ddd___lt));
        }
        if (ddd___lte != null) {
            joiner.add("ddd___lte: " + GraphQLRequestSerializer.getEntry(ddd___lte));
        }
        if (ddd___gt != null) {
            joiner.add("ddd___gt: " + GraphQLRequestSerializer.getEntry(ddd___gt));
        }
        if (ddd___gte != null) {
            joiner.add("ddd___gte: " + GraphQLRequestSerializer.getEntry(ddd___gte));
        }
        if (ddd_kind___eq != null) {
            joiner.add("ddd_kind___eq: " + GraphQLRequestSerializer.getEntry(ddd_kind___eq));
        }
        if (ddd_kind___ne != null) {
            joiner.add("ddd_kind___ne: " + GraphQLRequestSerializer.getEntry(ddd_kind___ne));
        }
        if (ddd_kind___null != null) {
            joiner.add("ddd_kind___null: " + GraphQLRequestSerializer.getEntry(ddd_kind___null));
        }
        if (ddd_kind___not___null != null) {
            joiner.add("ddd_kind___not___null: " + GraphQLRequestSerializer.getEntry(ddd_kind___not___null));
        }
        if (ddd_kind___in != null) {
            joiner.add("ddd_kind___in: " + GraphQLRequestSerializer.getEntry(ddd_kind___in));
        }
        if (ddd_kind___not___in != null) {
            joiner.add("ddd_kind___not___in: " + GraphQLRequestSerializer.getEntry(ddd_kind___not___in));
        }
        if (ddd_kind___lt != null) {
            joiner.add("ddd_kind___lt: " + GraphQLRequestSerializer.getEntry(ddd_kind___lt));
        }
        if (ddd_kind___lte != null) {
            joiner.add("ddd_kind___lte: " + GraphQLRequestSerializer.getEntry(ddd_kind___lte));
        }
        if (ddd_kind___gt != null) {
            joiner.add("ddd_kind___gt: " + GraphQLRequestSerializer.getEntry(ddd_kind___gt));
        }
        if (ddd_kind___gte != null) {
            joiner.add("ddd_kind___gte: " + GraphQLRequestSerializer.getEntry(ddd_kind___gte));
        }
        if (ddd_kind___contains != null) {
            joiner.add("ddd_kind___contains: " + GraphQLRequestSerializer.getEntry(ddd_kind___contains));
        }
        if (ddd_kind___not___contains != null) {
            joiner.add("ddd_kind___not___contains: " + GraphQLRequestSerializer.getEntry(ddd_kind___not___contains));
        }
        if (ddd_kind___starts_with != null) {
            joiner.add("ddd_kind___starts_with: " + GraphQLRequestSerializer.getEntry(ddd_kind___starts_with));
        }
        if (ddd_kind___not___starts_with != null) {
            joiner.add("ddd_kind___not___starts_with: " + GraphQLRequestSerializer.getEntry(ddd_kind___not___starts_with));
        }
        if (ddd_kind___ends_with != null) {
            joiner.add("ddd_kind___ends_with: " + GraphQLRequestSerializer.getEntry(ddd_kind___ends_with));
        }
        if (ddd_kind___not___ends_with != null) {
            joiner.add("ddd_kind___not___ends_with: " + GraphQLRequestSerializer.getEntry(ddd_kind___not___ends_with));
        }
        if (ddd_note___eq != null) {
            joiner.add("ddd_note___eq: " + GraphQLRequestSerializer.getEntry(ddd_note___eq));
        }
        if (ddd_note___ne != null) {
            joiner.add("ddd_note___ne: " + GraphQLRequestSerializer.getEntry(ddd_note___ne));
        }
        if (ddd_note___null != null) {
            joiner.add("ddd_note___null: " + GraphQLRequestSerializer.getEntry(ddd_note___null));
        }
        if (ddd_note___not___null != null) {
            joiner.add("ddd_note___not___null: " + GraphQLRequestSerializer.getEntry(ddd_note___not___null));
        }
        if (ddd_note___in != null) {
            joiner.add("ddd_note___in: " + GraphQLRequestSerializer.getEntry(ddd_note___in));
        }
        if (ddd_note___not___in != null) {
            joiner.add("ddd_note___not___in: " + GraphQLRequestSerializer.getEntry(ddd_note___not___in));
        }
        if (ddd_note___lt != null) {
            joiner.add("ddd_note___lt: " + GraphQLRequestSerializer.getEntry(ddd_note___lt));
        }
        if (ddd_note___lte != null) {
            joiner.add("ddd_note___lte: " + GraphQLRequestSerializer.getEntry(ddd_note___lte));
        }
        if (ddd_note___gt != null) {
            joiner.add("ddd_note___gt: " + GraphQLRequestSerializer.getEntry(ddd_note___gt));
        }
        if (ddd_note___gte != null) {
            joiner.add("ddd_note___gte: " + GraphQLRequestSerializer.getEntry(ddd_note___gte));
        }
        if (ddd_note___contains != null) {
            joiner.add("ddd_note___contains: " + GraphQLRequestSerializer.getEntry(ddd_note___contains));
        }
        if (ddd_note___not___contains != null) {
            joiner.add("ddd_note___not___contains: " + GraphQLRequestSerializer.getEntry(ddd_note___not___contains));
        }
        if (ddd_note___starts_with != null) {
            joiner.add("ddd_note___starts_with: " + GraphQLRequestSerializer.getEntry(ddd_note___starts_with));
        }
        if (ddd_note___not___starts_with != null) {
            joiner.add("ddd_note___not___starts_with: " + GraphQLRequestSerializer.getEntry(ddd_note___not___starts_with));
        }
        if (ddd_note___ends_with != null) {
            joiner.add("ddd_note___ends_with: " + GraphQLRequestSerializer.getEntry(ddd_note___ends_with));
        }
        if (ddd_note___not___ends_with != null) {
            joiner.add("ddd_note___not___ends_with: " + GraphQLRequestSerializer.getEntry(ddd_note___not___ends_with));
        }
        if (ddd_um___eq != null) {
            joiner.add("ddd_um___eq: " + GraphQLRequestSerializer.getEntry(ddd_um___eq));
        }
        if (ddd_um___ne != null) {
            joiner.add("ddd_um___ne: " + GraphQLRequestSerializer.getEntry(ddd_um___ne));
        }
        if (ddd_um___null != null) {
            joiner.add("ddd_um___null: " + GraphQLRequestSerializer.getEntry(ddd_um___null));
        }
        if (ddd_um___not___null != null) {
            joiner.add("ddd_um___not___null: " + GraphQLRequestSerializer.getEntry(ddd_um___not___null));
        }
        if (ddd_um___in != null) {
            joiner.add("ddd_um___in: " + GraphQLRequestSerializer.getEntry(ddd_um___in));
        }
        if (ddd_um___not___in != null) {
            joiner.add("ddd_um___not___in: " + GraphQLRequestSerializer.getEntry(ddd_um___not___in));
        }
        if (ddd_um___lt != null) {
            joiner.add("ddd_um___lt: " + GraphQLRequestSerializer.getEntry(ddd_um___lt));
        }
        if (ddd_um___lte != null) {
            joiner.add("ddd_um___lte: " + GraphQLRequestSerializer.getEntry(ddd_um___lte));
        }
        if (ddd_um___gt != null) {
            joiner.add("ddd_um___gt: " + GraphQLRequestSerializer.getEntry(ddd_um___gt));
        }
        if (ddd_um___gte != null) {
            joiner.add("ddd_um___gte: " + GraphQLRequestSerializer.getEntry(ddd_um___gte));
        }
        if (ddd_um___contains != null) {
            joiner.add("ddd_um___contains: " + GraphQLRequestSerializer.getEntry(ddd_um___contains));
        }
        if (ddd_um___not___contains != null) {
            joiner.add("ddd_um___not___contains: " + GraphQLRequestSerializer.getEntry(ddd_um___not___contains));
        }
        if (ddd_um___starts_with != null) {
            joiner.add("ddd_um___starts_with: " + GraphQLRequestSerializer.getEntry(ddd_um___starts_with));
        }
        if (ddd_um___not___starts_with != null) {
            joiner.add("ddd_um___not___starts_with: " + GraphQLRequestSerializer.getEntry(ddd_um___not___starts_with));
        }
        if (ddd_um___ends_with != null) {
            joiner.add("ddd_um___ends_with: " + GraphQLRequestSerializer.getEntry(ddd_um___ends_with));
        }
        if (ddd_um___not___ends_with != null) {
            joiner.add("ddd_um___not___ends_with: " + GraphQLRequestSerializer.getEntry(ddd_um___not___ends_with));
        }
        if (epatico___eq != null) {
            joiner.add("epatico___eq: " + GraphQLRequestSerializer.getEntry(epatico___eq));
        }
        if (epatico___ne != null) {
            joiner.add("epatico___ne: " + GraphQLRequestSerializer.getEntry(epatico___ne));
        }
        if (epatico___null != null) {
            joiner.add("epatico___null: " + GraphQLRequestSerializer.getEntry(epatico___null));
        }
        if (epatico___not___null != null) {
            joiner.add("epatico___not___null: " + GraphQLRequestSerializer.getEntry(epatico___not___null));
        }
        if (hiv___eq != null) {
            joiner.add("hiv___eq: " + GraphQLRequestSerializer.getEntry(hiv___eq));
        }
        if (hiv___ne != null) {
            joiner.add("hiv___ne: " + GraphQLRequestSerializer.getEntry(hiv___ne));
        }
        if (hiv___null != null) {
            joiner.add("hiv___null: " + GraphQLRequestSerializer.getEntry(hiv___null));
        }
        if (hiv___not___null != null) {
            joiner.add("hiv___not___null: " + GraphQLRequestSerializer.getEntry(hiv___not___null));
        }
        if (livello___eq != null) {
            joiner.add("livello___eq: " + GraphQLRequestSerializer.getEntry(livello___eq));
        }
        if (livello___ne != null) {
            joiner.add("livello___ne: " + GraphQLRequestSerializer.getEntry(livello___ne));
        }
        if (livello___null != null) {
            joiner.add("livello___null: " + GraphQLRequestSerializer.getEntry(livello___null));
        }
        if (livello___not___null != null) {
            joiner.add("livello___not___null: " + GraphQLRequestSerializer.getEntry(livello___not___null));
        }
        if (livello___in != null) {
            joiner.add("livello___in: " + GraphQLRequestSerializer.getEntry(livello___in));
        }
        if (livello___not___in != null) {
            joiner.add("livello___not___in: " + GraphQLRequestSerializer.getEntry(livello___not___in));
        }
        if (livello___lt != null) {
            joiner.add("livello___lt: " + GraphQLRequestSerializer.getEntry(livello___lt));
        }
        if (livello___lte != null) {
            joiner.add("livello___lte: " + GraphQLRequestSerializer.getEntry(livello___lte));
        }
        if (livello___gt != null) {
            joiner.add("livello___gt: " + GraphQLRequestSerializer.getEntry(livello___gt));
        }
        if (livello___gte != null) {
            joiner.add("livello___gte: " + GraphQLRequestSerializer.getEntry(livello___gte));
        }
        if (long_acting___eq != null) {
            joiner.add("long_acting___eq: " + GraphQLRequestSerializer.getEntry(long_acting___eq));
        }
        if (long_acting___ne != null) {
            joiner.add("long_acting___ne: " + GraphQLRequestSerializer.getEntry(long_acting___ne));
        }
        if (long_acting___null != null) {
            joiner.add("long_acting___null: " + GraphQLRequestSerializer.getEntry(long_acting___null));
        }
        if (long_acting___not___null != null) {
            joiner.add("long_acting___not___null: " + GraphQLRequestSerializer.getEntry(long_acting___not___null));
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
        if (non_arv___eq != null) {
            joiner.add("non_arv___eq: " + GraphQLRequestSerializer.getEntry(non_arv___eq));
        }
        if (non_arv___ne != null) {
            joiner.add("non_arv___ne: " + GraphQLRequestSerializer.getEntry(non_arv___ne));
        }
        if (non_arv___null != null) {
            joiner.add("non_arv___null: " + GraphQLRequestSerializer.getEntry(non_arv___null));
        }
        if (non_arv___not___null != null) {
            joiner.add("non_arv___not___null: " + GraphQLRequestSerializer.getEntry(non_arv___not___null));
        }
        if (prep___eq != null) {
            joiner.add("prep___eq: " + GraphQLRequestSerializer.getEntry(prep___eq));
        }
        if (prep___ne != null) {
            joiner.add("prep___ne: " + GraphQLRequestSerializer.getEntry(prep___ne));
        }
        if (prep___null != null) {
            joiner.add("prep___null: " + GraphQLRequestSerializer.getEntry(prep___null));
        }
        if (prep___not___null != null) {
            joiner.add("prep___not___null: " + GraphQLRequestSerializer.getEntry(prep___not___null));
        }
        if (titolo___eq != null) {
            joiner.add("titolo___eq: " + GraphQLRequestSerializer.getEntry(titolo___eq));
        }
        if (titolo___ne != null) {
            joiner.add("titolo___ne: " + GraphQLRequestSerializer.getEntry(titolo___ne));
        }
        if (titolo___null != null) {
            joiner.add("titolo___null: " + GraphQLRequestSerializer.getEntry(titolo___null));
        }
        if (titolo___not___null != null) {
            joiner.add("titolo___not___null: " + GraphQLRequestSerializer.getEntry(titolo___not___null));
        }
        if (titolo___in != null) {
            joiner.add("titolo___in: " + GraphQLRequestSerializer.getEntry(titolo___in));
        }
        if (titolo___not___in != null) {
            joiner.add("titolo___not___in: " + GraphQLRequestSerializer.getEntry(titolo___not___in));
        }
        if (titolo___lt != null) {
            joiner.add("titolo___lt: " + GraphQLRequestSerializer.getEntry(titolo___lt));
        }
        if (titolo___lte != null) {
            joiner.add("titolo___lte: " + GraphQLRequestSerializer.getEntry(titolo___lte));
        }
        if (titolo___gt != null) {
            joiner.add("titolo___gt: " + GraphQLRequestSerializer.getEntry(titolo___gt));
        }
        if (titolo___gte != null) {
            joiner.add("titolo___gte: " + GraphQLRequestSerializer.getEntry(titolo___gte));
        }
        if (titolo___contains != null) {
            joiner.add("titolo___contains: " + GraphQLRequestSerializer.getEntry(titolo___contains));
        }
        if (titolo___not___contains != null) {
            joiner.add("titolo___not___contains: " + GraphQLRequestSerializer.getEntry(titolo___not___contains));
        }
        if (titolo___starts_with != null) {
            joiner.add("titolo___starts_with: " + GraphQLRequestSerializer.getEntry(titolo___starts_with));
        }
        if (titolo___not___starts_with != null) {
            joiner.add("titolo___not___starts_with: " + GraphQLRequestSerializer.getEntry(titolo___not___starts_with));
        }
        if (titolo___ends_with != null) {
            joiner.add("titolo___ends_with: " + GraphQLRequestSerializer.getEntry(titolo___ends_with));
        }
        if (titolo___not___ends_with != null) {
            joiner.add("titolo___not___ends_with: " + GraphQLRequestSerializer.getEntry(titolo___not___ends_with));
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

    public static CliFarmaco_ATCFilterDTO.Builder builder() {
        return new CliFarmaco_ATCFilterDTO.Builder();
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
        private Boolean antitumorale___eq;
        private Boolean antitumorale___ne;
        private Boolean antitumorale___null;
        private Boolean antitumorale___not___null;
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
        private String ddd___eq;
        private String ddd___ne;
        private Boolean ddd___null;
        private Boolean ddd___not___null;
        private java.util.List<String> ddd___in;
        private java.util.List<String> ddd___not___in;
        private String ddd___lt;
        private String ddd___lte;
        private String ddd___gt;
        private String ddd___gte;
        private String ddd_kind___eq;
        private String ddd_kind___ne;
        private Boolean ddd_kind___null;
        private Boolean ddd_kind___not___null;
        private java.util.List<String> ddd_kind___in;
        private java.util.List<String> ddd_kind___not___in;
        private String ddd_kind___lt;
        private String ddd_kind___lte;
        private String ddd_kind___gt;
        private String ddd_kind___gte;
        private String ddd_kind___contains;
        private String ddd_kind___not___contains;
        private String ddd_kind___starts_with;
        private String ddd_kind___not___starts_with;
        private String ddd_kind___ends_with;
        private String ddd_kind___not___ends_with;
        private String ddd_note___eq;
        private String ddd_note___ne;
        private Boolean ddd_note___null;
        private Boolean ddd_note___not___null;
        private java.util.List<String> ddd_note___in;
        private java.util.List<String> ddd_note___not___in;
        private String ddd_note___lt;
        private String ddd_note___lte;
        private String ddd_note___gt;
        private String ddd_note___gte;
        private String ddd_note___contains;
        private String ddd_note___not___contains;
        private String ddd_note___starts_with;
        private String ddd_note___not___starts_with;
        private String ddd_note___ends_with;
        private String ddd_note___not___ends_with;
        private String ddd_um___eq;
        private String ddd_um___ne;
        private Boolean ddd_um___null;
        private Boolean ddd_um___not___null;
        private java.util.List<String> ddd_um___in;
        private java.util.List<String> ddd_um___not___in;
        private String ddd_um___lt;
        private String ddd_um___lte;
        private String ddd_um___gt;
        private String ddd_um___gte;
        private String ddd_um___contains;
        private String ddd_um___not___contains;
        private String ddd_um___starts_with;
        private String ddd_um___not___starts_with;
        private String ddd_um___ends_with;
        private String ddd_um___not___ends_with;
        private Boolean epatico___eq;
        private Boolean epatico___ne;
        private Boolean epatico___null;
        private Boolean epatico___not___null;
        private Boolean hiv___eq;
        private Boolean hiv___ne;
        private Boolean hiv___null;
        private Boolean hiv___not___null;
        private Integer livello___eq;
        private Integer livello___ne;
        private Boolean livello___null;
        private Boolean livello___not___null;
        private java.util.List<Integer> livello___in;
        private java.util.List<Integer> livello___not___in;
        private Integer livello___lt;
        private Integer livello___lte;
        private Integer livello___gt;
        private Integer livello___gte;
        private Boolean long_acting___eq;
        private Boolean long_acting___ne;
        private Boolean long_acting___null;
        private Boolean long_acting___not___null;
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
        private Boolean non_arv___eq;
        private Boolean non_arv___ne;
        private Boolean non_arv___null;
        private Boolean non_arv___not___null;
        private Boolean prep___eq;
        private Boolean prep___ne;
        private Boolean prep___null;
        private Boolean prep___not___null;
        private String titolo___eq;
        private String titolo___ne;
        private Boolean titolo___null;
        private Boolean titolo___not___null;
        private java.util.List<String> titolo___in;
        private java.util.List<String> titolo___not___in;
        private String titolo___lt;
        private String titolo___lte;
        private String titolo___gt;
        private String titolo___gte;
        private String titolo___contains;
        private String titolo___not___contains;
        private String titolo___starts_with;
        private String titolo___not___starts_with;
        private String titolo___ends_with;
        private String titolo___not___ends_with;
        private java.util.List<CliFarmaco_ATCFilterDTO> AND;
        private java.util.List<CliFarmaco_ATCFilterDTO> OR;
        private CliFarmaco_ATCFilterDTO NOT;

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

        public Builder setAntitumorale___eq(Boolean antitumorale___eq) {
            this.antitumorale___eq = antitumorale___eq;
            return this;
        }

        public Builder setAntitumorale___ne(Boolean antitumorale___ne) {
            this.antitumorale___ne = antitumorale___ne;
            return this;
        }

        public Builder setAntitumorale___null(Boolean antitumorale___null) {
            this.antitumorale___null = antitumorale___null;
            return this;
        }

        public Builder setAntitumorale___not___null(Boolean antitumorale___not___null) {
            this.antitumorale___not___null = antitumorale___not___null;
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

        public Builder setDdd___eq(String ddd___eq) {
            this.ddd___eq = ddd___eq;
            return this;
        }

        public Builder setDdd___ne(String ddd___ne) {
            this.ddd___ne = ddd___ne;
            return this;
        }

        public Builder setDdd___null(Boolean ddd___null) {
            this.ddd___null = ddd___null;
            return this;
        }

        public Builder setDdd___not___null(Boolean ddd___not___null) {
            this.ddd___not___null = ddd___not___null;
            return this;
        }

        public Builder setDdd___in(java.util.List<String> ddd___in) {
            this.ddd___in = ddd___in;
            return this;
        }

        public Builder setDdd___not___in(java.util.List<String> ddd___not___in) {
            this.ddd___not___in = ddd___not___in;
            return this;
        }

        public Builder setDdd___lt(String ddd___lt) {
            this.ddd___lt = ddd___lt;
            return this;
        }

        public Builder setDdd___lte(String ddd___lte) {
            this.ddd___lte = ddd___lte;
            return this;
        }

        public Builder setDdd___gt(String ddd___gt) {
            this.ddd___gt = ddd___gt;
            return this;
        }

        public Builder setDdd___gte(String ddd___gte) {
            this.ddd___gte = ddd___gte;
            return this;
        }

        public Builder setDdd_kind___eq(String ddd_kind___eq) {
            this.ddd_kind___eq = ddd_kind___eq;
            return this;
        }

        public Builder setDdd_kind___ne(String ddd_kind___ne) {
            this.ddd_kind___ne = ddd_kind___ne;
            return this;
        }

        public Builder setDdd_kind___null(Boolean ddd_kind___null) {
            this.ddd_kind___null = ddd_kind___null;
            return this;
        }

        public Builder setDdd_kind___not___null(Boolean ddd_kind___not___null) {
            this.ddd_kind___not___null = ddd_kind___not___null;
            return this;
        }

        public Builder setDdd_kind___in(java.util.List<String> ddd_kind___in) {
            this.ddd_kind___in = ddd_kind___in;
            return this;
        }

        public Builder setDdd_kind___not___in(java.util.List<String> ddd_kind___not___in) {
            this.ddd_kind___not___in = ddd_kind___not___in;
            return this;
        }

        public Builder setDdd_kind___lt(String ddd_kind___lt) {
            this.ddd_kind___lt = ddd_kind___lt;
            return this;
        }

        public Builder setDdd_kind___lte(String ddd_kind___lte) {
            this.ddd_kind___lte = ddd_kind___lte;
            return this;
        }

        public Builder setDdd_kind___gt(String ddd_kind___gt) {
            this.ddd_kind___gt = ddd_kind___gt;
            return this;
        }

        public Builder setDdd_kind___gte(String ddd_kind___gte) {
            this.ddd_kind___gte = ddd_kind___gte;
            return this;
        }

        public Builder setDdd_kind___contains(String ddd_kind___contains) {
            this.ddd_kind___contains = ddd_kind___contains;
            return this;
        }

        public Builder setDdd_kind___not___contains(String ddd_kind___not___contains) {
            this.ddd_kind___not___contains = ddd_kind___not___contains;
            return this;
        }

        public Builder setDdd_kind___starts_with(String ddd_kind___starts_with) {
            this.ddd_kind___starts_with = ddd_kind___starts_with;
            return this;
        }

        public Builder setDdd_kind___not___starts_with(String ddd_kind___not___starts_with) {
            this.ddd_kind___not___starts_with = ddd_kind___not___starts_with;
            return this;
        }

        public Builder setDdd_kind___ends_with(String ddd_kind___ends_with) {
            this.ddd_kind___ends_with = ddd_kind___ends_with;
            return this;
        }

        public Builder setDdd_kind___not___ends_with(String ddd_kind___not___ends_with) {
            this.ddd_kind___not___ends_with = ddd_kind___not___ends_with;
            return this;
        }

        public Builder setDdd_note___eq(String ddd_note___eq) {
            this.ddd_note___eq = ddd_note___eq;
            return this;
        }

        public Builder setDdd_note___ne(String ddd_note___ne) {
            this.ddd_note___ne = ddd_note___ne;
            return this;
        }

        public Builder setDdd_note___null(Boolean ddd_note___null) {
            this.ddd_note___null = ddd_note___null;
            return this;
        }

        public Builder setDdd_note___not___null(Boolean ddd_note___not___null) {
            this.ddd_note___not___null = ddd_note___not___null;
            return this;
        }

        public Builder setDdd_note___in(java.util.List<String> ddd_note___in) {
            this.ddd_note___in = ddd_note___in;
            return this;
        }

        public Builder setDdd_note___not___in(java.util.List<String> ddd_note___not___in) {
            this.ddd_note___not___in = ddd_note___not___in;
            return this;
        }

        public Builder setDdd_note___lt(String ddd_note___lt) {
            this.ddd_note___lt = ddd_note___lt;
            return this;
        }

        public Builder setDdd_note___lte(String ddd_note___lte) {
            this.ddd_note___lte = ddd_note___lte;
            return this;
        }

        public Builder setDdd_note___gt(String ddd_note___gt) {
            this.ddd_note___gt = ddd_note___gt;
            return this;
        }

        public Builder setDdd_note___gte(String ddd_note___gte) {
            this.ddd_note___gte = ddd_note___gte;
            return this;
        }

        public Builder setDdd_note___contains(String ddd_note___contains) {
            this.ddd_note___contains = ddd_note___contains;
            return this;
        }

        public Builder setDdd_note___not___contains(String ddd_note___not___contains) {
            this.ddd_note___not___contains = ddd_note___not___contains;
            return this;
        }

        public Builder setDdd_note___starts_with(String ddd_note___starts_with) {
            this.ddd_note___starts_with = ddd_note___starts_with;
            return this;
        }

        public Builder setDdd_note___not___starts_with(String ddd_note___not___starts_with) {
            this.ddd_note___not___starts_with = ddd_note___not___starts_with;
            return this;
        }

        public Builder setDdd_note___ends_with(String ddd_note___ends_with) {
            this.ddd_note___ends_with = ddd_note___ends_with;
            return this;
        }

        public Builder setDdd_note___not___ends_with(String ddd_note___not___ends_with) {
            this.ddd_note___not___ends_with = ddd_note___not___ends_with;
            return this;
        }

        public Builder setDdd_um___eq(String ddd_um___eq) {
            this.ddd_um___eq = ddd_um___eq;
            return this;
        }

        public Builder setDdd_um___ne(String ddd_um___ne) {
            this.ddd_um___ne = ddd_um___ne;
            return this;
        }

        public Builder setDdd_um___null(Boolean ddd_um___null) {
            this.ddd_um___null = ddd_um___null;
            return this;
        }

        public Builder setDdd_um___not___null(Boolean ddd_um___not___null) {
            this.ddd_um___not___null = ddd_um___not___null;
            return this;
        }

        public Builder setDdd_um___in(java.util.List<String> ddd_um___in) {
            this.ddd_um___in = ddd_um___in;
            return this;
        }

        public Builder setDdd_um___not___in(java.util.List<String> ddd_um___not___in) {
            this.ddd_um___not___in = ddd_um___not___in;
            return this;
        }

        public Builder setDdd_um___lt(String ddd_um___lt) {
            this.ddd_um___lt = ddd_um___lt;
            return this;
        }

        public Builder setDdd_um___lte(String ddd_um___lte) {
            this.ddd_um___lte = ddd_um___lte;
            return this;
        }

        public Builder setDdd_um___gt(String ddd_um___gt) {
            this.ddd_um___gt = ddd_um___gt;
            return this;
        }

        public Builder setDdd_um___gte(String ddd_um___gte) {
            this.ddd_um___gte = ddd_um___gte;
            return this;
        }

        public Builder setDdd_um___contains(String ddd_um___contains) {
            this.ddd_um___contains = ddd_um___contains;
            return this;
        }

        public Builder setDdd_um___not___contains(String ddd_um___not___contains) {
            this.ddd_um___not___contains = ddd_um___not___contains;
            return this;
        }

        public Builder setDdd_um___starts_with(String ddd_um___starts_with) {
            this.ddd_um___starts_with = ddd_um___starts_with;
            return this;
        }

        public Builder setDdd_um___not___starts_with(String ddd_um___not___starts_with) {
            this.ddd_um___not___starts_with = ddd_um___not___starts_with;
            return this;
        }

        public Builder setDdd_um___ends_with(String ddd_um___ends_with) {
            this.ddd_um___ends_with = ddd_um___ends_with;
            return this;
        }

        public Builder setDdd_um___not___ends_with(String ddd_um___not___ends_with) {
            this.ddd_um___not___ends_with = ddd_um___not___ends_with;
            return this;
        }

        public Builder setEpatico___eq(Boolean epatico___eq) {
            this.epatico___eq = epatico___eq;
            return this;
        }

        public Builder setEpatico___ne(Boolean epatico___ne) {
            this.epatico___ne = epatico___ne;
            return this;
        }

        public Builder setEpatico___null(Boolean epatico___null) {
            this.epatico___null = epatico___null;
            return this;
        }

        public Builder setEpatico___not___null(Boolean epatico___not___null) {
            this.epatico___not___null = epatico___not___null;
            return this;
        }

        public Builder setHiv___eq(Boolean hiv___eq) {
            this.hiv___eq = hiv___eq;
            return this;
        }

        public Builder setHiv___ne(Boolean hiv___ne) {
            this.hiv___ne = hiv___ne;
            return this;
        }

        public Builder setHiv___null(Boolean hiv___null) {
            this.hiv___null = hiv___null;
            return this;
        }

        public Builder setHiv___not___null(Boolean hiv___not___null) {
            this.hiv___not___null = hiv___not___null;
            return this;
        }

        public Builder setLivello___eq(Integer livello___eq) {
            this.livello___eq = livello___eq;
            return this;
        }

        public Builder setLivello___ne(Integer livello___ne) {
            this.livello___ne = livello___ne;
            return this;
        }

        public Builder setLivello___null(Boolean livello___null) {
            this.livello___null = livello___null;
            return this;
        }

        public Builder setLivello___not___null(Boolean livello___not___null) {
            this.livello___not___null = livello___not___null;
            return this;
        }

        public Builder setLivello___in(java.util.List<Integer> livello___in) {
            this.livello___in = livello___in;
            return this;
        }

        public Builder setLivello___not___in(java.util.List<Integer> livello___not___in) {
            this.livello___not___in = livello___not___in;
            return this;
        }

        public Builder setLivello___lt(Integer livello___lt) {
            this.livello___lt = livello___lt;
            return this;
        }

        public Builder setLivello___lte(Integer livello___lte) {
            this.livello___lte = livello___lte;
            return this;
        }

        public Builder setLivello___gt(Integer livello___gt) {
            this.livello___gt = livello___gt;
            return this;
        }

        public Builder setLivello___gte(Integer livello___gte) {
            this.livello___gte = livello___gte;
            return this;
        }

        public Builder setLong_acting___eq(Boolean long_acting___eq) {
            this.long_acting___eq = long_acting___eq;
            return this;
        }

        public Builder setLong_acting___ne(Boolean long_acting___ne) {
            this.long_acting___ne = long_acting___ne;
            return this;
        }

        public Builder setLong_acting___null(Boolean long_acting___null) {
            this.long_acting___null = long_acting___null;
            return this;
        }

        public Builder setLong_acting___not___null(Boolean long_acting___not___null) {
            this.long_acting___not___null = long_acting___not___null;
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

        public Builder setNon_arv___eq(Boolean non_arv___eq) {
            this.non_arv___eq = non_arv___eq;
            return this;
        }

        public Builder setNon_arv___ne(Boolean non_arv___ne) {
            this.non_arv___ne = non_arv___ne;
            return this;
        }

        public Builder setNon_arv___null(Boolean non_arv___null) {
            this.non_arv___null = non_arv___null;
            return this;
        }

        public Builder setNon_arv___not___null(Boolean non_arv___not___null) {
            this.non_arv___not___null = non_arv___not___null;
            return this;
        }

        public Builder setPrep___eq(Boolean prep___eq) {
            this.prep___eq = prep___eq;
            return this;
        }

        public Builder setPrep___ne(Boolean prep___ne) {
            this.prep___ne = prep___ne;
            return this;
        }

        public Builder setPrep___null(Boolean prep___null) {
            this.prep___null = prep___null;
            return this;
        }

        public Builder setPrep___not___null(Boolean prep___not___null) {
            this.prep___not___null = prep___not___null;
            return this;
        }

        public Builder setTitolo___eq(String titolo___eq) {
            this.titolo___eq = titolo___eq;
            return this;
        }

        public Builder setTitolo___ne(String titolo___ne) {
            this.titolo___ne = titolo___ne;
            return this;
        }

        public Builder setTitolo___null(Boolean titolo___null) {
            this.titolo___null = titolo___null;
            return this;
        }

        public Builder setTitolo___not___null(Boolean titolo___not___null) {
            this.titolo___not___null = titolo___not___null;
            return this;
        }

        public Builder setTitolo___in(java.util.List<String> titolo___in) {
            this.titolo___in = titolo___in;
            return this;
        }

        public Builder setTitolo___not___in(java.util.List<String> titolo___not___in) {
            this.titolo___not___in = titolo___not___in;
            return this;
        }

        public Builder setTitolo___lt(String titolo___lt) {
            this.titolo___lt = titolo___lt;
            return this;
        }

        public Builder setTitolo___lte(String titolo___lte) {
            this.titolo___lte = titolo___lte;
            return this;
        }

        public Builder setTitolo___gt(String titolo___gt) {
            this.titolo___gt = titolo___gt;
            return this;
        }

        public Builder setTitolo___gte(String titolo___gte) {
            this.titolo___gte = titolo___gte;
            return this;
        }

        public Builder setTitolo___contains(String titolo___contains) {
            this.titolo___contains = titolo___contains;
            return this;
        }

        public Builder setTitolo___not___contains(String titolo___not___contains) {
            this.titolo___not___contains = titolo___not___contains;
            return this;
        }

        public Builder setTitolo___starts_with(String titolo___starts_with) {
            this.titolo___starts_with = titolo___starts_with;
            return this;
        }

        public Builder setTitolo___not___starts_with(String titolo___not___starts_with) {
            this.titolo___not___starts_with = titolo___not___starts_with;
            return this;
        }

        public Builder setTitolo___ends_with(String titolo___ends_with) {
            this.titolo___ends_with = titolo___ends_with;
            return this;
        }

        public Builder setTitolo___not___ends_with(String titolo___not___ends_with) {
            this.titolo___not___ends_with = titolo___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliFarmaco_ATCFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliFarmaco_ATCFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliFarmaco_ATCFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliFarmaco_ATCFilterDTO build() {
            CliFarmaco_ATCFilterDTO result = new CliFarmaco_ATCFilterDTO();
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
            result.setAntitumorale___eq(this.antitumorale___eq);
            result.setAntitumorale___ne(this.antitumorale___ne);
            result.setAntitumorale___null(this.antitumorale___null);
            result.setAntitumorale___not___null(this.antitumorale___not___null);
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
            result.setDdd___eq(this.ddd___eq);
            result.setDdd___ne(this.ddd___ne);
            result.setDdd___null(this.ddd___null);
            result.setDdd___not___null(this.ddd___not___null);
            result.setDdd___in(this.ddd___in);
            result.setDdd___not___in(this.ddd___not___in);
            result.setDdd___lt(this.ddd___lt);
            result.setDdd___lte(this.ddd___lte);
            result.setDdd___gt(this.ddd___gt);
            result.setDdd___gte(this.ddd___gte);
            result.setDdd_kind___eq(this.ddd_kind___eq);
            result.setDdd_kind___ne(this.ddd_kind___ne);
            result.setDdd_kind___null(this.ddd_kind___null);
            result.setDdd_kind___not___null(this.ddd_kind___not___null);
            result.setDdd_kind___in(this.ddd_kind___in);
            result.setDdd_kind___not___in(this.ddd_kind___not___in);
            result.setDdd_kind___lt(this.ddd_kind___lt);
            result.setDdd_kind___lte(this.ddd_kind___lte);
            result.setDdd_kind___gt(this.ddd_kind___gt);
            result.setDdd_kind___gte(this.ddd_kind___gte);
            result.setDdd_kind___contains(this.ddd_kind___contains);
            result.setDdd_kind___not___contains(this.ddd_kind___not___contains);
            result.setDdd_kind___starts_with(this.ddd_kind___starts_with);
            result.setDdd_kind___not___starts_with(this.ddd_kind___not___starts_with);
            result.setDdd_kind___ends_with(this.ddd_kind___ends_with);
            result.setDdd_kind___not___ends_with(this.ddd_kind___not___ends_with);
            result.setDdd_note___eq(this.ddd_note___eq);
            result.setDdd_note___ne(this.ddd_note___ne);
            result.setDdd_note___null(this.ddd_note___null);
            result.setDdd_note___not___null(this.ddd_note___not___null);
            result.setDdd_note___in(this.ddd_note___in);
            result.setDdd_note___not___in(this.ddd_note___not___in);
            result.setDdd_note___lt(this.ddd_note___lt);
            result.setDdd_note___lte(this.ddd_note___lte);
            result.setDdd_note___gt(this.ddd_note___gt);
            result.setDdd_note___gte(this.ddd_note___gte);
            result.setDdd_note___contains(this.ddd_note___contains);
            result.setDdd_note___not___contains(this.ddd_note___not___contains);
            result.setDdd_note___starts_with(this.ddd_note___starts_with);
            result.setDdd_note___not___starts_with(this.ddd_note___not___starts_with);
            result.setDdd_note___ends_with(this.ddd_note___ends_with);
            result.setDdd_note___not___ends_with(this.ddd_note___not___ends_with);
            result.setDdd_um___eq(this.ddd_um___eq);
            result.setDdd_um___ne(this.ddd_um___ne);
            result.setDdd_um___null(this.ddd_um___null);
            result.setDdd_um___not___null(this.ddd_um___not___null);
            result.setDdd_um___in(this.ddd_um___in);
            result.setDdd_um___not___in(this.ddd_um___not___in);
            result.setDdd_um___lt(this.ddd_um___lt);
            result.setDdd_um___lte(this.ddd_um___lte);
            result.setDdd_um___gt(this.ddd_um___gt);
            result.setDdd_um___gte(this.ddd_um___gte);
            result.setDdd_um___contains(this.ddd_um___contains);
            result.setDdd_um___not___contains(this.ddd_um___not___contains);
            result.setDdd_um___starts_with(this.ddd_um___starts_with);
            result.setDdd_um___not___starts_with(this.ddd_um___not___starts_with);
            result.setDdd_um___ends_with(this.ddd_um___ends_with);
            result.setDdd_um___not___ends_with(this.ddd_um___not___ends_with);
            result.setEpatico___eq(this.epatico___eq);
            result.setEpatico___ne(this.epatico___ne);
            result.setEpatico___null(this.epatico___null);
            result.setEpatico___not___null(this.epatico___not___null);
            result.setHiv___eq(this.hiv___eq);
            result.setHiv___ne(this.hiv___ne);
            result.setHiv___null(this.hiv___null);
            result.setHiv___not___null(this.hiv___not___null);
            result.setLivello___eq(this.livello___eq);
            result.setLivello___ne(this.livello___ne);
            result.setLivello___null(this.livello___null);
            result.setLivello___not___null(this.livello___not___null);
            result.setLivello___in(this.livello___in);
            result.setLivello___not___in(this.livello___not___in);
            result.setLivello___lt(this.livello___lt);
            result.setLivello___lte(this.livello___lte);
            result.setLivello___gt(this.livello___gt);
            result.setLivello___gte(this.livello___gte);
            result.setLong_acting___eq(this.long_acting___eq);
            result.setLong_acting___ne(this.long_acting___ne);
            result.setLong_acting___null(this.long_acting___null);
            result.setLong_acting___not___null(this.long_acting___not___null);
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
            result.setNon_arv___eq(this.non_arv___eq);
            result.setNon_arv___ne(this.non_arv___ne);
            result.setNon_arv___null(this.non_arv___null);
            result.setNon_arv___not___null(this.non_arv___not___null);
            result.setPrep___eq(this.prep___eq);
            result.setPrep___ne(this.prep___ne);
            result.setPrep___null(this.prep___null);
            result.setPrep___not___null(this.prep___not___null);
            result.setTitolo___eq(this.titolo___eq);
            result.setTitolo___ne(this.titolo___ne);
            result.setTitolo___null(this.titolo___null);
            result.setTitolo___not___null(this.titolo___not___null);
            result.setTitolo___in(this.titolo___in);
            result.setTitolo___not___in(this.titolo___not___in);
            result.setTitolo___lt(this.titolo___lt);
            result.setTitolo___lte(this.titolo___lte);
            result.setTitolo___gt(this.titolo___gt);
            result.setTitolo___gte(this.titolo___gte);
            result.setTitolo___contains(this.titolo___contains);
            result.setTitolo___not___contains(this.titolo___not___contains);
            result.setTitolo___starts_with(this.titolo___starts_with);
            result.setTitolo___not___starts_with(this.titolo___not___starts_with);
            result.setTitolo___ends_with(this.titolo___ends_with);
            result.setTitolo___not___ends_with(this.titolo___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
