package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Motivazione_fine_ARV.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliMotivazione_fine_ARVFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
    private String _createdby___eq;
    private String _createdby___ne;
    private Boolean _createdby___null;
    private Boolean _createdby___not___null;
    private java.util.List<String> _createdby___in;
    private java.util.List<String> _createdby___not___in;
    private String _createdby___lt;
    private String _createdby___lte;
    private String _createdby___gt;
    private String _createdby___gte;
    private String _createdby___contains;
    private String _createdby___not___contains;
    private String _createdby___starts_with;
    private String _createdby___not___starts_with;
    private String _createdby___ends_with;
    private String _createdby___not___ends_with;
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
    private String _lastmodifiedby___eq;
    private String _lastmodifiedby___ne;
    private Boolean _lastmodifiedby___null;
    private Boolean _lastmodifiedby___not___null;
    private java.util.List<String> _lastmodifiedby___in;
    private java.util.List<String> _lastmodifiedby___not___in;
    private String _lastmodifiedby___lt;
    private String _lastmodifiedby___lte;
    private String _lastmodifiedby___gt;
    private String _lastmodifiedby___gte;
    private String _lastmodifiedby___contains;
    private String _lastmodifiedby___not___contains;
    private String _lastmodifiedby___starts_with;
    private String _lastmodifiedby___not___starts_with;
    private String _lastmodifiedby___ends_with;
    private String _lastmodifiedby___not___ends_with;
    private String _lastmodifiedon___eq;
    private String _lastmodifiedon___ne;
    private Boolean _lastmodifiedon___null;
    private Boolean _lastmodifiedon___not___null;
    private java.util.List<String> _lastmodifiedon___in;
    private java.util.List<String> _lastmodifiedon___not___in;
    private String _lastmodifiedon___lt;
    private String _lastmodifiedon___lte;
    private String _lastmodifiedon___gt;
    private String _lastmodifiedon___gte;
    private String _ownedby___eq;
    private String _ownedby___ne;
    private Boolean _ownedby___null;
    private Boolean _ownedby___not___null;
    private java.util.List<String> _ownedby___in;
    private java.util.List<String> _ownedby___not___in;
    private String _ownedby___lt;
    private String _ownedby___lte;
    private String _ownedby___gt;
    private String _ownedby___gte;
    private String _ownedby___contains;
    private String _ownedby___not___contains;
    private String _ownedby___starts_with;
    private String _ownedby___not___starts_with;
    private String _ownedby___ends_with;
    private String _ownedby___not___ends_with;
    private String _ownedon___eq;
    private String _ownedon___ne;
    private Boolean _ownedon___null;
    private Boolean _ownedon___not___null;
    private java.util.List<String> _ownedon___in;
    private java.util.List<String> _ownedon___not___in;
    private String _ownedon___lt;
    private String _ownedon___lte;
    private String _ownedon___gt;
    private String _ownedon___gte;
    private Integer codice___eq;
    private Integer codice___ne;
    private Boolean codice___null;
    private Boolean codice___not___null;
    private java.util.List<Integer> codice___in;
    private java.util.List<Integer> codice___not___in;
    private Integer codice___lt;
    private Integer codice___lte;
    private Integer codice___gt;
    private Integer codice___gte;
    private String codice_DAD___eq;
    private String codice_DAD___ne;
    private Boolean codice_DAD___null;
    private Boolean codice_DAD___not___null;
    private java.util.List<String> codice_DAD___in;
    private java.util.List<String> codice_DAD___not___in;
    private String codice_DAD___lt;
    private String codice_DAD___lte;
    private String codice_DAD___gt;
    private String codice_DAD___gte;
    private String codice_DAD___contains;
    private String codice_DAD___not___contains;
    private String codice_DAD___starts_with;
    private String codice_DAD___not___starts_with;
    private String codice_DAD___ends_with;
    private String codice_DAD___not___ends_with;
    private String gruppo___eq;
    private String gruppo___ne;
    private Boolean gruppo___null;
    private Boolean gruppo___not___null;
    private java.util.List<String> gruppo___in;
    private java.util.List<String> gruppo___not___in;
    private String gruppo___lt;
    private String gruppo___lte;
    private String gruppo___gt;
    private String gruppo___gte;
    private String gruppo___contains;
    private String gruppo___not___contains;
    private String gruppo___starts_with;
    private String gruppo___not___starts_with;
    private String gruppo___ends_with;
    private String gruppo___not___ends_with;
    private Boolean ico___eq;
    private Boolean ico___ne;
    private Boolean ico___null;
    private Boolean ico___not___null;
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
    private String nome_completo___eq;
    private String nome_completo___ne;
    private Boolean nome_completo___null;
    private Boolean nome_completo___not___null;
    private java.util.List<String> nome_completo___in;
    private java.util.List<String> nome_completo___not___in;
    private String nome_completo___lt;
    private String nome_completo___lte;
    private String nome_completo___gt;
    private String nome_completo___gte;
    private String nome_completo___contains;
    private String nome_completo___not___contains;
    private String nome_completo___starts_with;
    private String nome_completo___not___starts_with;
    private String nome_completo___ends_with;
    private String nome_completo___not___ends_with;
    private String nome_gruppo___eq;
    private String nome_gruppo___ne;
    private Boolean nome_gruppo___null;
    private Boolean nome_gruppo___not___null;
    private java.util.List<String> nome_gruppo___in;
    private java.util.List<String> nome_gruppo___not___in;
    private String nome_gruppo___lt;
    private String nome_gruppo___lte;
    private String nome_gruppo___gt;
    private String nome_gruppo___gte;
    private String nome_gruppo___contains;
    private String nome_gruppo___not___contains;
    private String nome_gruppo___starts_with;
    private String nome_gruppo___not___starts_with;
    private String nome_gruppo___ends_with;
    private String nome_gruppo___not___ends_with;
    private Boolean pride___eq;
    private Boolean pride___ne;
    private Boolean pride___null;
    private Boolean pride___not___null;
    private String sottogruppo___eq;
    private String sottogruppo___ne;
    private Boolean sottogruppo___null;
    private Boolean sottogruppo___not___null;
    private java.util.List<String> sottogruppo___in;
    private java.util.List<String> sottogruppo___not___in;
    private String sottogruppo___lt;
    private String sottogruppo___lte;
    private String sottogruppo___gt;
    private String sottogruppo___gte;
    private String sottogruppo___contains;
    private String sottogruppo___not___contains;
    private String sottogruppo___starts_with;
    private String sottogruppo___not___starts_with;
    private String sottogruppo___ends_with;
    private String sottogruppo___not___ends_with;
    private Integer visualizzato___eq;
    private Integer visualizzato___ne;
    private Boolean visualizzato___null;
    private Boolean visualizzato___not___null;
    private java.util.List<Integer> visualizzato___in;
    private java.util.List<Integer> visualizzato___not___in;
    private Integer visualizzato___lt;
    private Integer visualizzato___lte;
    private Integer visualizzato___gt;
    private Integer visualizzato___gte;
    private java.util.List<CliMotivazione_fine_ARVFilterDTO> AND;
    private java.util.List<CliMotivazione_fine_ARVFilterDTO> OR;
    private CliMotivazione_fine_ARVFilterDTO NOT;

    public CliMotivazione_fine_ARVFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
    }

    public String get_createdby___eq() {
        return _createdby___eq;
    }
    public void set_createdby___eq(String _createdby___eq) {
        this._createdby___eq = _createdby___eq;
    }

    public String get_createdby___ne() {
        return _createdby___ne;
    }
    public void set_createdby___ne(String _createdby___ne) {
        this._createdby___ne = _createdby___ne;
    }

    public Boolean get_createdby___null() {
        return _createdby___null;
    }
    public void set_createdby___null(Boolean _createdby___null) {
        this._createdby___null = _createdby___null;
    }

    public Boolean get_createdby___not___null() {
        return _createdby___not___null;
    }
    public void set_createdby___not___null(Boolean _createdby___not___null) {
        this._createdby___not___null = _createdby___not___null;
    }

    public java.util.List<String> get_createdby___in() {
        return _createdby___in;
    }
    public void set_createdby___in(java.util.List<String> _createdby___in) {
        this._createdby___in = _createdby___in;
    }

    public java.util.List<String> get_createdby___not___in() {
        return _createdby___not___in;
    }
    public void set_createdby___not___in(java.util.List<String> _createdby___not___in) {
        this._createdby___not___in = _createdby___not___in;
    }

    public String get_createdby___lt() {
        return _createdby___lt;
    }
    public void set_createdby___lt(String _createdby___lt) {
        this._createdby___lt = _createdby___lt;
    }

    public String get_createdby___lte() {
        return _createdby___lte;
    }
    public void set_createdby___lte(String _createdby___lte) {
        this._createdby___lte = _createdby___lte;
    }

    public String get_createdby___gt() {
        return _createdby___gt;
    }
    public void set_createdby___gt(String _createdby___gt) {
        this._createdby___gt = _createdby___gt;
    }

    public String get_createdby___gte() {
        return _createdby___gte;
    }
    public void set_createdby___gte(String _createdby___gte) {
        this._createdby___gte = _createdby___gte;
    }

    public String get_createdby___contains() {
        return _createdby___contains;
    }
    public void set_createdby___contains(String _createdby___contains) {
        this._createdby___contains = _createdby___contains;
    }

    public String get_createdby___not___contains() {
        return _createdby___not___contains;
    }
    public void set_createdby___not___contains(String _createdby___not___contains) {
        this._createdby___not___contains = _createdby___not___contains;
    }

    public String get_createdby___starts_with() {
        return _createdby___starts_with;
    }
    public void set_createdby___starts_with(String _createdby___starts_with) {
        this._createdby___starts_with = _createdby___starts_with;
    }

    public String get_createdby___not___starts_with() {
        return _createdby___not___starts_with;
    }
    public void set_createdby___not___starts_with(String _createdby___not___starts_with) {
        this._createdby___not___starts_with = _createdby___not___starts_with;
    }

    public String get_createdby___ends_with() {
        return _createdby___ends_with;
    }
    public void set_createdby___ends_with(String _createdby___ends_with) {
        this._createdby___ends_with = _createdby___ends_with;
    }

    public String get_createdby___not___ends_with() {
        return _createdby___not___ends_with;
    }
    public void set_createdby___not___ends_with(String _createdby___not___ends_with) {
        this._createdby___not___ends_with = _createdby___not___ends_with;
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

    public String get_lastmodifiedby___eq() {
        return _lastmodifiedby___eq;
    }
    public void set_lastmodifiedby___eq(String _lastmodifiedby___eq) {
        this._lastmodifiedby___eq = _lastmodifiedby___eq;
    }

    public String get_lastmodifiedby___ne() {
        return _lastmodifiedby___ne;
    }
    public void set_lastmodifiedby___ne(String _lastmodifiedby___ne) {
        this._lastmodifiedby___ne = _lastmodifiedby___ne;
    }

    public Boolean get_lastmodifiedby___null() {
        return _lastmodifiedby___null;
    }
    public void set_lastmodifiedby___null(Boolean _lastmodifiedby___null) {
        this._lastmodifiedby___null = _lastmodifiedby___null;
    }

    public Boolean get_lastmodifiedby___not___null() {
        return _lastmodifiedby___not___null;
    }
    public void set_lastmodifiedby___not___null(Boolean _lastmodifiedby___not___null) {
        this._lastmodifiedby___not___null = _lastmodifiedby___not___null;
    }

    public java.util.List<String> get_lastmodifiedby___in() {
        return _lastmodifiedby___in;
    }
    public void set_lastmodifiedby___in(java.util.List<String> _lastmodifiedby___in) {
        this._lastmodifiedby___in = _lastmodifiedby___in;
    }

    public java.util.List<String> get_lastmodifiedby___not___in() {
        return _lastmodifiedby___not___in;
    }
    public void set_lastmodifiedby___not___in(java.util.List<String> _lastmodifiedby___not___in) {
        this._lastmodifiedby___not___in = _lastmodifiedby___not___in;
    }

    public String get_lastmodifiedby___lt() {
        return _lastmodifiedby___lt;
    }
    public void set_lastmodifiedby___lt(String _lastmodifiedby___lt) {
        this._lastmodifiedby___lt = _lastmodifiedby___lt;
    }

    public String get_lastmodifiedby___lte() {
        return _lastmodifiedby___lte;
    }
    public void set_lastmodifiedby___lte(String _lastmodifiedby___lte) {
        this._lastmodifiedby___lte = _lastmodifiedby___lte;
    }

    public String get_lastmodifiedby___gt() {
        return _lastmodifiedby___gt;
    }
    public void set_lastmodifiedby___gt(String _lastmodifiedby___gt) {
        this._lastmodifiedby___gt = _lastmodifiedby___gt;
    }

    public String get_lastmodifiedby___gte() {
        return _lastmodifiedby___gte;
    }
    public void set_lastmodifiedby___gte(String _lastmodifiedby___gte) {
        this._lastmodifiedby___gte = _lastmodifiedby___gte;
    }

    public String get_lastmodifiedby___contains() {
        return _lastmodifiedby___contains;
    }
    public void set_lastmodifiedby___contains(String _lastmodifiedby___contains) {
        this._lastmodifiedby___contains = _lastmodifiedby___contains;
    }

    public String get_lastmodifiedby___not___contains() {
        return _lastmodifiedby___not___contains;
    }
    public void set_lastmodifiedby___not___contains(String _lastmodifiedby___not___contains) {
        this._lastmodifiedby___not___contains = _lastmodifiedby___not___contains;
    }

    public String get_lastmodifiedby___starts_with() {
        return _lastmodifiedby___starts_with;
    }
    public void set_lastmodifiedby___starts_with(String _lastmodifiedby___starts_with) {
        this._lastmodifiedby___starts_with = _lastmodifiedby___starts_with;
    }

    public String get_lastmodifiedby___not___starts_with() {
        return _lastmodifiedby___not___starts_with;
    }
    public void set_lastmodifiedby___not___starts_with(String _lastmodifiedby___not___starts_with) {
        this._lastmodifiedby___not___starts_with = _lastmodifiedby___not___starts_with;
    }

    public String get_lastmodifiedby___ends_with() {
        return _lastmodifiedby___ends_with;
    }
    public void set_lastmodifiedby___ends_with(String _lastmodifiedby___ends_with) {
        this._lastmodifiedby___ends_with = _lastmodifiedby___ends_with;
    }

    public String get_lastmodifiedby___not___ends_with() {
        return _lastmodifiedby___not___ends_with;
    }
    public void set_lastmodifiedby___not___ends_with(String _lastmodifiedby___not___ends_with) {
        this._lastmodifiedby___not___ends_with = _lastmodifiedby___not___ends_with;
    }

    public String get_lastmodifiedon___eq() {
        return _lastmodifiedon___eq;
    }
    public void set_lastmodifiedon___eq(String _lastmodifiedon___eq) {
        this._lastmodifiedon___eq = _lastmodifiedon___eq;
    }

    public String get_lastmodifiedon___ne() {
        return _lastmodifiedon___ne;
    }
    public void set_lastmodifiedon___ne(String _lastmodifiedon___ne) {
        this._lastmodifiedon___ne = _lastmodifiedon___ne;
    }

    public Boolean get_lastmodifiedon___null() {
        return _lastmodifiedon___null;
    }
    public void set_lastmodifiedon___null(Boolean _lastmodifiedon___null) {
        this._lastmodifiedon___null = _lastmodifiedon___null;
    }

    public Boolean get_lastmodifiedon___not___null() {
        return _lastmodifiedon___not___null;
    }
    public void set_lastmodifiedon___not___null(Boolean _lastmodifiedon___not___null) {
        this._lastmodifiedon___not___null = _lastmodifiedon___not___null;
    }

    public java.util.List<String> get_lastmodifiedon___in() {
        return _lastmodifiedon___in;
    }
    public void set_lastmodifiedon___in(java.util.List<String> _lastmodifiedon___in) {
        this._lastmodifiedon___in = _lastmodifiedon___in;
    }

    public java.util.List<String> get_lastmodifiedon___not___in() {
        return _lastmodifiedon___not___in;
    }
    public void set_lastmodifiedon___not___in(java.util.List<String> _lastmodifiedon___not___in) {
        this._lastmodifiedon___not___in = _lastmodifiedon___not___in;
    }

    public String get_lastmodifiedon___lt() {
        return _lastmodifiedon___lt;
    }
    public void set_lastmodifiedon___lt(String _lastmodifiedon___lt) {
        this._lastmodifiedon___lt = _lastmodifiedon___lt;
    }

    public String get_lastmodifiedon___lte() {
        return _lastmodifiedon___lte;
    }
    public void set_lastmodifiedon___lte(String _lastmodifiedon___lte) {
        this._lastmodifiedon___lte = _lastmodifiedon___lte;
    }

    public String get_lastmodifiedon___gt() {
        return _lastmodifiedon___gt;
    }
    public void set_lastmodifiedon___gt(String _lastmodifiedon___gt) {
        this._lastmodifiedon___gt = _lastmodifiedon___gt;
    }

    public String get_lastmodifiedon___gte() {
        return _lastmodifiedon___gte;
    }
    public void set_lastmodifiedon___gte(String _lastmodifiedon___gte) {
        this._lastmodifiedon___gte = _lastmodifiedon___gte;
    }

    public String get_ownedby___eq() {
        return _ownedby___eq;
    }
    public void set_ownedby___eq(String _ownedby___eq) {
        this._ownedby___eq = _ownedby___eq;
    }

    public String get_ownedby___ne() {
        return _ownedby___ne;
    }
    public void set_ownedby___ne(String _ownedby___ne) {
        this._ownedby___ne = _ownedby___ne;
    }

    public Boolean get_ownedby___null() {
        return _ownedby___null;
    }
    public void set_ownedby___null(Boolean _ownedby___null) {
        this._ownedby___null = _ownedby___null;
    }

    public Boolean get_ownedby___not___null() {
        return _ownedby___not___null;
    }
    public void set_ownedby___not___null(Boolean _ownedby___not___null) {
        this._ownedby___not___null = _ownedby___not___null;
    }

    public java.util.List<String> get_ownedby___in() {
        return _ownedby___in;
    }
    public void set_ownedby___in(java.util.List<String> _ownedby___in) {
        this._ownedby___in = _ownedby___in;
    }

    public java.util.List<String> get_ownedby___not___in() {
        return _ownedby___not___in;
    }
    public void set_ownedby___not___in(java.util.List<String> _ownedby___not___in) {
        this._ownedby___not___in = _ownedby___not___in;
    }

    public String get_ownedby___lt() {
        return _ownedby___lt;
    }
    public void set_ownedby___lt(String _ownedby___lt) {
        this._ownedby___lt = _ownedby___lt;
    }

    public String get_ownedby___lte() {
        return _ownedby___lte;
    }
    public void set_ownedby___lte(String _ownedby___lte) {
        this._ownedby___lte = _ownedby___lte;
    }

    public String get_ownedby___gt() {
        return _ownedby___gt;
    }
    public void set_ownedby___gt(String _ownedby___gt) {
        this._ownedby___gt = _ownedby___gt;
    }

    public String get_ownedby___gte() {
        return _ownedby___gte;
    }
    public void set_ownedby___gte(String _ownedby___gte) {
        this._ownedby___gte = _ownedby___gte;
    }

    public String get_ownedby___contains() {
        return _ownedby___contains;
    }
    public void set_ownedby___contains(String _ownedby___contains) {
        this._ownedby___contains = _ownedby___contains;
    }

    public String get_ownedby___not___contains() {
        return _ownedby___not___contains;
    }
    public void set_ownedby___not___contains(String _ownedby___not___contains) {
        this._ownedby___not___contains = _ownedby___not___contains;
    }

    public String get_ownedby___starts_with() {
        return _ownedby___starts_with;
    }
    public void set_ownedby___starts_with(String _ownedby___starts_with) {
        this._ownedby___starts_with = _ownedby___starts_with;
    }

    public String get_ownedby___not___starts_with() {
        return _ownedby___not___starts_with;
    }
    public void set_ownedby___not___starts_with(String _ownedby___not___starts_with) {
        this._ownedby___not___starts_with = _ownedby___not___starts_with;
    }

    public String get_ownedby___ends_with() {
        return _ownedby___ends_with;
    }
    public void set_ownedby___ends_with(String _ownedby___ends_with) {
        this._ownedby___ends_with = _ownedby___ends_with;
    }

    public String get_ownedby___not___ends_with() {
        return _ownedby___not___ends_with;
    }
    public void set_ownedby___not___ends_with(String _ownedby___not___ends_with) {
        this._ownedby___not___ends_with = _ownedby___not___ends_with;
    }

    public String get_ownedon___eq() {
        return _ownedon___eq;
    }
    public void set_ownedon___eq(String _ownedon___eq) {
        this._ownedon___eq = _ownedon___eq;
    }

    public String get_ownedon___ne() {
        return _ownedon___ne;
    }
    public void set_ownedon___ne(String _ownedon___ne) {
        this._ownedon___ne = _ownedon___ne;
    }

    public Boolean get_ownedon___null() {
        return _ownedon___null;
    }
    public void set_ownedon___null(Boolean _ownedon___null) {
        this._ownedon___null = _ownedon___null;
    }

    public Boolean get_ownedon___not___null() {
        return _ownedon___not___null;
    }
    public void set_ownedon___not___null(Boolean _ownedon___not___null) {
        this._ownedon___not___null = _ownedon___not___null;
    }

    public java.util.List<String> get_ownedon___in() {
        return _ownedon___in;
    }
    public void set_ownedon___in(java.util.List<String> _ownedon___in) {
        this._ownedon___in = _ownedon___in;
    }

    public java.util.List<String> get_ownedon___not___in() {
        return _ownedon___not___in;
    }
    public void set_ownedon___not___in(java.util.List<String> _ownedon___not___in) {
        this._ownedon___not___in = _ownedon___not___in;
    }

    public String get_ownedon___lt() {
        return _ownedon___lt;
    }
    public void set_ownedon___lt(String _ownedon___lt) {
        this._ownedon___lt = _ownedon___lt;
    }

    public String get_ownedon___lte() {
        return _ownedon___lte;
    }
    public void set_ownedon___lte(String _ownedon___lte) {
        this._ownedon___lte = _ownedon___lte;
    }

    public String get_ownedon___gt() {
        return _ownedon___gt;
    }
    public void set_ownedon___gt(String _ownedon___gt) {
        this._ownedon___gt = _ownedon___gt;
    }

    public String get_ownedon___gte() {
        return _ownedon___gte;
    }
    public void set_ownedon___gte(String _ownedon___gte) {
        this._ownedon___gte = _ownedon___gte;
    }

    public Integer getCodice___eq() {
        return codice___eq;
    }
    public void setCodice___eq(Integer codice___eq) {
        this.codice___eq = codice___eq;
    }

    public Integer getCodice___ne() {
        return codice___ne;
    }
    public void setCodice___ne(Integer codice___ne) {
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

    public java.util.List<Integer> getCodice___in() {
        return codice___in;
    }
    public void setCodice___in(java.util.List<Integer> codice___in) {
        this.codice___in = codice___in;
    }

    public java.util.List<Integer> getCodice___not___in() {
        return codice___not___in;
    }
    public void setCodice___not___in(java.util.List<Integer> codice___not___in) {
        this.codice___not___in = codice___not___in;
    }

    public Integer getCodice___lt() {
        return codice___lt;
    }
    public void setCodice___lt(Integer codice___lt) {
        this.codice___lt = codice___lt;
    }

    public Integer getCodice___lte() {
        return codice___lte;
    }
    public void setCodice___lte(Integer codice___lte) {
        this.codice___lte = codice___lte;
    }

    public Integer getCodice___gt() {
        return codice___gt;
    }
    public void setCodice___gt(Integer codice___gt) {
        this.codice___gt = codice___gt;
    }

    public Integer getCodice___gte() {
        return codice___gte;
    }
    public void setCodice___gte(Integer codice___gte) {
        this.codice___gte = codice___gte;
    }

    public String getCodice_DAD___eq() {
        return codice_DAD___eq;
    }
    public void setCodice_DAD___eq(String codice_DAD___eq) {
        this.codice_DAD___eq = codice_DAD___eq;
    }

    public String getCodice_DAD___ne() {
        return codice_DAD___ne;
    }
    public void setCodice_DAD___ne(String codice_DAD___ne) {
        this.codice_DAD___ne = codice_DAD___ne;
    }

    public Boolean getCodice_DAD___null() {
        return codice_DAD___null;
    }
    public void setCodice_DAD___null(Boolean codice_DAD___null) {
        this.codice_DAD___null = codice_DAD___null;
    }

    public Boolean getCodice_DAD___not___null() {
        return codice_DAD___not___null;
    }
    public void setCodice_DAD___not___null(Boolean codice_DAD___not___null) {
        this.codice_DAD___not___null = codice_DAD___not___null;
    }

    public java.util.List<String> getCodice_DAD___in() {
        return codice_DAD___in;
    }
    public void setCodice_DAD___in(java.util.List<String> codice_DAD___in) {
        this.codice_DAD___in = codice_DAD___in;
    }

    public java.util.List<String> getCodice_DAD___not___in() {
        return codice_DAD___not___in;
    }
    public void setCodice_DAD___not___in(java.util.List<String> codice_DAD___not___in) {
        this.codice_DAD___not___in = codice_DAD___not___in;
    }

    public String getCodice_DAD___lt() {
        return codice_DAD___lt;
    }
    public void setCodice_DAD___lt(String codice_DAD___lt) {
        this.codice_DAD___lt = codice_DAD___lt;
    }

    public String getCodice_DAD___lte() {
        return codice_DAD___lte;
    }
    public void setCodice_DAD___lte(String codice_DAD___lte) {
        this.codice_DAD___lte = codice_DAD___lte;
    }

    public String getCodice_DAD___gt() {
        return codice_DAD___gt;
    }
    public void setCodice_DAD___gt(String codice_DAD___gt) {
        this.codice_DAD___gt = codice_DAD___gt;
    }

    public String getCodice_DAD___gte() {
        return codice_DAD___gte;
    }
    public void setCodice_DAD___gte(String codice_DAD___gte) {
        this.codice_DAD___gte = codice_DAD___gte;
    }

    public String getCodice_DAD___contains() {
        return codice_DAD___contains;
    }
    public void setCodice_DAD___contains(String codice_DAD___contains) {
        this.codice_DAD___contains = codice_DAD___contains;
    }

    public String getCodice_DAD___not___contains() {
        return codice_DAD___not___contains;
    }
    public void setCodice_DAD___not___contains(String codice_DAD___not___contains) {
        this.codice_DAD___not___contains = codice_DAD___not___contains;
    }

    public String getCodice_DAD___starts_with() {
        return codice_DAD___starts_with;
    }
    public void setCodice_DAD___starts_with(String codice_DAD___starts_with) {
        this.codice_DAD___starts_with = codice_DAD___starts_with;
    }

    public String getCodice_DAD___not___starts_with() {
        return codice_DAD___not___starts_with;
    }
    public void setCodice_DAD___not___starts_with(String codice_DAD___not___starts_with) {
        this.codice_DAD___not___starts_with = codice_DAD___not___starts_with;
    }

    public String getCodice_DAD___ends_with() {
        return codice_DAD___ends_with;
    }
    public void setCodice_DAD___ends_with(String codice_DAD___ends_with) {
        this.codice_DAD___ends_with = codice_DAD___ends_with;
    }

    public String getCodice_DAD___not___ends_with() {
        return codice_DAD___not___ends_with;
    }
    public void setCodice_DAD___not___ends_with(String codice_DAD___not___ends_with) {
        this.codice_DAD___not___ends_with = codice_DAD___not___ends_with;
    }

    public String getGruppo___eq() {
        return gruppo___eq;
    }
    public void setGruppo___eq(String gruppo___eq) {
        this.gruppo___eq = gruppo___eq;
    }

    public String getGruppo___ne() {
        return gruppo___ne;
    }
    public void setGruppo___ne(String gruppo___ne) {
        this.gruppo___ne = gruppo___ne;
    }

    public Boolean getGruppo___null() {
        return gruppo___null;
    }
    public void setGruppo___null(Boolean gruppo___null) {
        this.gruppo___null = gruppo___null;
    }

    public Boolean getGruppo___not___null() {
        return gruppo___not___null;
    }
    public void setGruppo___not___null(Boolean gruppo___not___null) {
        this.gruppo___not___null = gruppo___not___null;
    }

    public java.util.List<String> getGruppo___in() {
        return gruppo___in;
    }
    public void setGruppo___in(java.util.List<String> gruppo___in) {
        this.gruppo___in = gruppo___in;
    }

    public java.util.List<String> getGruppo___not___in() {
        return gruppo___not___in;
    }
    public void setGruppo___not___in(java.util.List<String> gruppo___not___in) {
        this.gruppo___not___in = gruppo___not___in;
    }

    public String getGruppo___lt() {
        return gruppo___lt;
    }
    public void setGruppo___lt(String gruppo___lt) {
        this.gruppo___lt = gruppo___lt;
    }

    public String getGruppo___lte() {
        return gruppo___lte;
    }
    public void setGruppo___lte(String gruppo___lte) {
        this.gruppo___lte = gruppo___lte;
    }

    public String getGruppo___gt() {
        return gruppo___gt;
    }
    public void setGruppo___gt(String gruppo___gt) {
        this.gruppo___gt = gruppo___gt;
    }

    public String getGruppo___gte() {
        return gruppo___gte;
    }
    public void setGruppo___gte(String gruppo___gte) {
        this.gruppo___gte = gruppo___gte;
    }

    public String getGruppo___contains() {
        return gruppo___contains;
    }
    public void setGruppo___contains(String gruppo___contains) {
        this.gruppo___contains = gruppo___contains;
    }

    public String getGruppo___not___contains() {
        return gruppo___not___contains;
    }
    public void setGruppo___not___contains(String gruppo___not___contains) {
        this.gruppo___not___contains = gruppo___not___contains;
    }

    public String getGruppo___starts_with() {
        return gruppo___starts_with;
    }
    public void setGruppo___starts_with(String gruppo___starts_with) {
        this.gruppo___starts_with = gruppo___starts_with;
    }

    public String getGruppo___not___starts_with() {
        return gruppo___not___starts_with;
    }
    public void setGruppo___not___starts_with(String gruppo___not___starts_with) {
        this.gruppo___not___starts_with = gruppo___not___starts_with;
    }

    public String getGruppo___ends_with() {
        return gruppo___ends_with;
    }
    public void setGruppo___ends_with(String gruppo___ends_with) {
        this.gruppo___ends_with = gruppo___ends_with;
    }

    public String getGruppo___not___ends_with() {
        return gruppo___not___ends_with;
    }
    public void setGruppo___not___ends_with(String gruppo___not___ends_with) {
        this.gruppo___not___ends_with = gruppo___not___ends_with;
    }

    public Boolean getIco___eq() {
        return ico___eq;
    }
    public void setIco___eq(Boolean ico___eq) {
        this.ico___eq = ico___eq;
    }

    public Boolean getIco___ne() {
        return ico___ne;
    }
    public void setIco___ne(Boolean ico___ne) {
        this.ico___ne = ico___ne;
    }

    public Boolean getIco___null() {
        return ico___null;
    }
    public void setIco___null(Boolean ico___null) {
        this.ico___null = ico___null;
    }

    public Boolean getIco___not___null() {
        return ico___not___null;
    }
    public void setIco___not___null(Boolean ico___not___null) {
        this.ico___not___null = ico___not___null;
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

    public String getNome_completo___eq() {
        return nome_completo___eq;
    }
    public void setNome_completo___eq(String nome_completo___eq) {
        this.nome_completo___eq = nome_completo___eq;
    }

    public String getNome_completo___ne() {
        return nome_completo___ne;
    }
    public void setNome_completo___ne(String nome_completo___ne) {
        this.nome_completo___ne = nome_completo___ne;
    }

    public Boolean getNome_completo___null() {
        return nome_completo___null;
    }
    public void setNome_completo___null(Boolean nome_completo___null) {
        this.nome_completo___null = nome_completo___null;
    }

    public Boolean getNome_completo___not___null() {
        return nome_completo___not___null;
    }
    public void setNome_completo___not___null(Boolean nome_completo___not___null) {
        this.nome_completo___not___null = nome_completo___not___null;
    }

    public java.util.List<String> getNome_completo___in() {
        return nome_completo___in;
    }
    public void setNome_completo___in(java.util.List<String> nome_completo___in) {
        this.nome_completo___in = nome_completo___in;
    }

    public java.util.List<String> getNome_completo___not___in() {
        return nome_completo___not___in;
    }
    public void setNome_completo___not___in(java.util.List<String> nome_completo___not___in) {
        this.nome_completo___not___in = nome_completo___not___in;
    }

    public String getNome_completo___lt() {
        return nome_completo___lt;
    }
    public void setNome_completo___lt(String nome_completo___lt) {
        this.nome_completo___lt = nome_completo___lt;
    }

    public String getNome_completo___lte() {
        return nome_completo___lte;
    }
    public void setNome_completo___lte(String nome_completo___lte) {
        this.nome_completo___lte = nome_completo___lte;
    }

    public String getNome_completo___gt() {
        return nome_completo___gt;
    }
    public void setNome_completo___gt(String nome_completo___gt) {
        this.nome_completo___gt = nome_completo___gt;
    }

    public String getNome_completo___gte() {
        return nome_completo___gte;
    }
    public void setNome_completo___gte(String nome_completo___gte) {
        this.nome_completo___gte = nome_completo___gte;
    }

    public String getNome_completo___contains() {
        return nome_completo___contains;
    }
    public void setNome_completo___contains(String nome_completo___contains) {
        this.nome_completo___contains = nome_completo___contains;
    }

    public String getNome_completo___not___contains() {
        return nome_completo___not___contains;
    }
    public void setNome_completo___not___contains(String nome_completo___not___contains) {
        this.nome_completo___not___contains = nome_completo___not___contains;
    }

    public String getNome_completo___starts_with() {
        return nome_completo___starts_with;
    }
    public void setNome_completo___starts_with(String nome_completo___starts_with) {
        this.nome_completo___starts_with = nome_completo___starts_with;
    }

    public String getNome_completo___not___starts_with() {
        return nome_completo___not___starts_with;
    }
    public void setNome_completo___not___starts_with(String nome_completo___not___starts_with) {
        this.nome_completo___not___starts_with = nome_completo___not___starts_with;
    }

    public String getNome_completo___ends_with() {
        return nome_completo___ends_with;
    }
    public void setNome_completo___ends_with(String nome_completo___ends_with) {
        this.nome_completo___ends_with = nome_completo___ends_with;
    }

    public String getNome_completo___not___ends_with() {
        return nome_completo___not___ends_with;
    }
    public void setNome_completo___not___ends_with(String nome_completo___not___ends_with) {
        this.nome_completo___not___ends_with = nome_completo___not___ends_with;
    }

    public String getNome_gruppo___eq() {
        return nome_gruppo___eq;
    }
    public void setNome_gruppo___eq(String nome_gruppo___eq) {
        this.nome_gruppo___eq = nome_gruppo___eq;
    }

    public String getNome_gruppo___ne() {
        return nome_gruppo___ne;
    }
    public void setNome_gruppo___ne(String nome_gruppo___ne) {
        this.nome_gruppo___ne = nome_gruppo___ne;
    }

    public Boolean getNome_gruppo___null() {
        return nome_gruppo___null;
    }
    public void setNome_gruppo___null(Boolean nome_gruppo___null) {
        this.nome_gruppo___null = nome_gruppo___null;
    }

    public Boolean getNome_gruppo___not___null() {
        return nome_gruppo___not___null;
    }
    public void setNome_gruppo___not___null(Boolean nome_gruppo___not___null) {
        this.nome_gruppo___not___null = nome_gruppo___not___null;
    }

    public java.util.List<String> getNome_gruppo___in() {
        return nome_gruppo___in;
    }
    public void setNome_gruppo___in(java.util.List<String> nome_gruppo___in) {
        this.nome_gruppo___in = nome_gruppo___in;
    }

    public java.util.List<String> getNome_gruppo___not___in() {
        return nome_gruppo___not___in;
    }
    public void setNome_gruppo___not___in(java.util.List<String> nome_gruppo___not___in) {
        this.nome_gruppo___not___in = nome_gruppo___not___in;
    }

    public String getNome_gruppo___lt() {
        return nome_gruppo___lt;
    }
    public void setNome_gruppo___lt(String nome_gruppo___lt) {
        this.nome_gruppo___lt = nome_gruppo___lt;
    }

    public String getNome_gruppo___lte() {
        return nome_gruppo___lte;
    }
    public void setNome_gruppo___lte(String nome_gruppo___lte) {
        this.nome_gruppo___lte = nome_gruppo___lte;
    }

    public String getNome_gruppo___gt() {
        return nome_gruppo___gt;
    }
    public void setNome_gruppo___gt(String nome_gruppo___gt) {
        this.nome_gruppo___gt = nome_gruppo___gt;
    }

    public String getNome_gruppo___gte() {
        return nome_gruppo___gte;
    }
    public void setNome_gruppo___gte(String nome_gruppo___gte) {
        this.nome_gruppo___gte = nome_gruppo___gte;
    }

    public String getNome_gruppo___contains() {
        return nome_gruppo___contains;
    }
    public void setNome_gruppo___contains(String nome_gruppo___contains) {
        this.nome_gruppo___contains = nome_gruppo___contains;
    }

    public String getNome_gruppo___not___contains() {
        return nome_gruppo___not___contains;
    }
    public void setNome_gruppo___not___contains(String nome_gruppo___not___contains) {
        this.nome_gruppo___not___contains = nome_gruppo___not___contains;
    }

    public String getNome_gruppo___starts_with() {
        return nome_gruppo___starts_with;
    }
    public void setNome_gruppo___starts_with(String nome_gruppo___starts_with) {
        this.nome_gruppo___starts_with = nome_gruppo___starts_with;
    }

    public String getNome_gruppo___not___starts_with() {
        return nome_gruppo___not___starts_with;
    }
    public void setNome_gruppo___not___starts_with(String nome_gruppo___not___starts_with) {
        this.nome_gruppo___not___starts_with = nome_gruppo___not___starts_with;
    }

    public String getNome_gruppo___ends_with() {
        return nome_gruppo___ends_with;
    }
    public void setNome_gruppo___ends_with(String nome_gruppo___ends_with) {
        this.nome_gruppo___ends_with = nome_gruppo___ends_with;
    }

    public String getNome_gruppo___not___ends_with() {
        return nome_gruppo___not___ends_with;
    }
    public void setNome_gruppo___not___ends_with(String nome_gruppo___not___ends_with) {
        this.nome_gruppo___not___ends_with = nome_gruppo___not___ends_with;
    }

    public Boolean getPride___eq() {
        return pride___eq;
    }
    public void setPride___eq(Boolean pride___eq) {
        this.pride___eq = pride___eq;
    }

    public Boolean getPride___ne() {
        return pride___ne;
    }
    public void setPride___ne(Boolean pride___ne) {
        this.pride___ne = pride___ne;
    }

    public Boolean getPride___null() {
        return pride___null;
    }
    public void setPride___null(Boolean pride___null) {
        this.pride___null = pride___null;
    }

    public Boolean getPride___not___null() {
        return pride___not___null;
    }
    public void setPride___not___null(Boolean pride___not___null) {
        this.pride___not___null = pride___not___null;
    }

    public String getSottogruppo___eq() {
        return sottogruppo___eq;
    }
    public void setSottogruppo___eq(String sottogruppo___eq) {
        this.sottogruppo___eq = sottogruppo___eq;
    }

    public String getSottogruppo___ne() {
        return sottogruppo___ne;
    }
    public void setSottogruppo___ne(String sottogruppo___ne) {
        this.sottogruppo___ne = sottogruppo___ne;
    }

    public Boolean getSottogruppo___null() {
        return sottogruppo___null;
    }
    public void setSottogruppo___null(Boolean sottogruppo___null) {
        this.sottogruppo___null = sottogruppo___null;
    }

    public Boolean getSottogruppo___not___null() {
        return sottogruppo___not___null;
    }
    public void setSottogruppo___not___null(Boolean sottogruppo___not___null) {
        this.sottogruppo___not___null = sottogruppo___not___null;
    }

    public java.util.List<String> getSottogruppo___in() {
        return sottogruppo___in;
    }
    public void setSottogruppo___in(java.util.List<String> sottogruppo___in) {
        this.sottogruppo___in = sottogruppo___in;
    }

    public java.util.List<String> getSottogruppo___not___in() {
        return sottogruppo___not___in;
    }
    public void setSottogruppo___not___in(java.util.List<String> sottogruppo___not___in) {
        this.sottogruppo___not___in = sottogruppo___not___in;
    }

    public String getSottogruppo___lt() {
        return sottogruppo___lt;
    }
    public void setSottogruppo___lt(String sottogruppo___lt) {
        this.sottogruppo___lt = sottogruppo___lt;
    }

    public String getSottogruppo___lte() {
        return sottogruppo___lte;
    }
    public void setSottogruppo___lte(String sottogruppo___lte) {
        this.sottogruppo___lte = sottogruppo___lte;
    }

    public String getSottogruppo___gt() {
        return sottogruppo___gt;
    }
    public void setSottogruppo___gt(String sottogruppo___gt) {
        this.sottogruppo___gt = sottogruppo___gt;
    }

    public String getSottogruppo___gte() {
        return sottogruppo___gte;
    }
    public void setSottogruppo___gte(String sottogruppo___gte) {
        this.sottogruppo___gte = sottogruppo___gte;
    }

    public String getSottogruppo___contains() {
        return sottogruppo___contains;
    }
    public void setSottogruppo___contains(String sottogruppo___contains) {
        this.sottogruppo___contains = sottogruppo___contains;
    }

    public String getSottogruppo___not___contains() {
        return sottogruppo___not___contains;
    }
    public void setSottogruppo___not___contains(String sottogruppo___not___contains) {
        this.sottogruppo___not___contains = sottogruppo___not___contains;
    }

    public String getSottogruppo___starts_with() {
        return sottogruppo___starts_with;
    }
    public void setSottogruppo___starts_with(String sottogruppo___starts_with) {
        this.sottogruppo___starts_with = sottogruppo___starts_with;
    }

    public String getSottogruppo___not___starts_with() {
        return sottogruppo___not___starts_with;
    }
    public void setSottogruppo___not___starts_with(String sottogruppo___not___starts_with) {
        this.sottogruppo___not___starts_with = sottogruppo___not___starts_with;
    }

    public String getSottogruppo___ends_with() {
        return sottogruppo___ends_with;
    }
    public void setSottogruppo___ends_with(String sottogruppo___ends_with) {
        this.sottogruppo___ends_with = sottogruppo___ends_with;
    }

    public String getSottogruppo___not___ends_with() {
        return sottogruppo___not___ends_with;
    }
    public void setSottogruppo___not___ends_with(String sottogruppo___not___ends_with) {
        this.sottogruppo___not___ends_with = sottogruppo___not___ends_with;
    }

    public Integer getVisualizzato___eq() {
        return visualizzato___eq;
    }
    public void setVisualizzato___eq(Integer visualizzato___eq) {
        this.visualizzato___eq = visualizzato___eq;
    }

    public Integer getVisualizzato___ne() {
        return visualizzato___ne;
    }
    public void setVisualizzato___ne(Integer visualizzato___ne) {
        this.visualizzato___ne = visualizzato___ne;
    }

    public Boolean getVisualizzato___null() {
        return visualizzato___null;
    }
    public void setVisualizzato___null(Boolean visualizzato___null) {
        this.visualizzato___null = visualizzato___null;
    }

    public Boolean getVisualizzato___not___null() {
        return visualizzato___not___null;
    }
    public void setVisualizzato___not___null(Boolean visualizzato___not___null) {
        this.visualizzato___not___null = visualizzato___not___null;
    }

    public java.util.List<Integer> getVisualizzato___in() {
        return visualizzato___in;
    }
    public void setVisualizzato___in(java.util.List<Integer> visualizzato___in) {
        this.visualizzato___in = visualizzato___in;
    }

    public java.util.List<Integer> getVisualizzato___not___in() {
        return visualizzato___not___in;
    }
    public void setVisualizzato___not___in(java.util.List<Integer> visualizzato___not___in) {
        this.visualizzato___not___in = visualizzato___not___in;
    }

    public Integer getVisualizzato___lt() {
        return visualizzato___lt;
    }
    public void setVisualizzato___lt(Integer visualizzato___lt) {
        this.visualizzato___lt = visualizzato___lt;
    }

    public Integer getVisualizzato___lte() {
        return visualizzato___lte;
    }
    public void setVisualizzato___lte(Integer visualizzato___lte) {
        this.visualizzato___lte = visualizzato___lte;
    }

    public Integer getVisualizzato___gt() {
        return visualizzato___gt;
    }
    public void setVisualizzato___gt(Integer visualizzato___gt) {
        this.visualizzato___gt = visualizzato___gt;
    }

    public Integer getVisualizzato___gte() {
        return visualizzato___gte;
    }
    public void setVisualizzato___gte(Integer visualizzato___gte) {
        this.visualizzato___gte = visualizzato___gte;
    }

    public java.util.List<CliMotivazione_fine_ARVFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliMotivazione_fine_ARVFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliMotivazione_fine_ARVFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliMotivazione_fine_ARVFilterDTO> OR) {
        this.OR = OR;
    }

    public CliMotivazione_fine_ARVFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliMotivazione_fine_ARVFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
        }
        if (_createdby___eq != null) {
            joiner.add("_createdby___eq: " + GraphQLRequestSerializer.getEntry(_createdby___eq));
        }
        if (_createdby___ne != null) {
            joiner.add("_createdby___ne: " + GraphQLRequestSerializer.getEntry(_createdby___ne));
        }
        if (_createdby___null != null) {
            joiner.add("_createdby___null: " + GraphQLRequestSerializer.getEntry(_createdby___null));
        }
        if (_createdby___not___null != null) {
            joiner.add("_createdby___not___null: " + GraphQLRequestSerializer.getEntry(_createdby___not___null));
        }
        if (_createdby___in != null) {
            joiner.add("_createdby___in: " + GraphQLRequestSerializer.getEntry(_createdby___in));
        }
        if (_createdby___not___in != null) {
            joiner.add("_createdby___not___in: " + GraphQLRequestSerializer.getEntry(_createdby___not___in));
        }
        if (_createdby___lt != null) {
            joiner.add("_createdby___lt: " + GraphQLRequestSerializer.getEntry(_createdby___lt));
        }
        if (_createdby___lte != null) {
            joiner.add("_createdby___lte: " + GraphQLRequestSerializer.getEntry(_createdby___lte));
        }
        if (_createdby___gt != null) {
            joiner.add("_createdby___gt: " + GraphQLRequestSerializer.getEntry(_createdby___gt));
        }
        if (_createdby___gte != null) {
            joiner.add("_createdby___gte: " + GraphQLRequestSerializer.getEntry(_createdby___gte));
        }
        if (_createdby___contains != null) {
            joiner.add("_createdby___contains: " + GraphQLRequestSerializer.getEntry(_createdby___contains));
        }
        if (_createdby___not___contains != null) {
            joiner.add("_createdby___not___contains: " + GraphQLRequestSerializer.getEntry(_createdby___not___contains));
        }
        if (_createdby___starts_with != null) {
            joiner.add("_createdby___starts_with: " + GraphQLRequestSerializer.getEntry(_createdby___starts_with));
        }
        if (_createdby___not___starts_with != null) {
            joiner.add("_createdby___not___starts_with: " + GraphQLRequestSerializer.getEntry(_createdby___not___starts_with));
        }
        if (_createdby___ends_with != null) {
            joiner.add("_createdby___ends_with: " + GraphQLRequestSerializer.getEntry(_createdby___ends_with));
        }
        if (_createdby___not___ends_with != null) {
            joiner.add("_createdby___not___ends_with: " + GraphQLRequestSerializer.getEntry(_createdby___not___ends_with));
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
        if (_lastmodifiedby___eq != null) {
            joiner.add("_lastmodifiedby___eq: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___eq));
        }
        if (_lastmodifiedby___ne != null) {
            joiner.add("_lastmodifiedby___ne: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___ne));
        }
        if (_lastmodifiedby___null != null) {
            joiner.add("_lastmodifiedby___null: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___null));
        }
        if (_lastmodifiedby___not___null != null) {
            joiner.add("_lastmodifiedby___not___null: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___not___null));
        }
        if (_lastmodifiedby___in != null) {
            joiner.add("_lastmodifiedby___in: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___in));
        }
        if (_lastmodifiedby___not___in != null) {
            joiner.add("_lastmodifiedby___not___in: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___not___in));
        }
        if (_lastmodifiedby___lt != null) {
            joiner.add("_lastmodifiedby___lt: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___lt));
        }
        if (_lastmodifiedby___lte != null) {
            joiner.add("_lastmodifiedby___lte: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___lte));
        }
        if (_lastmodifiedby___gt != null) {
            joiner.add("_lastmodifiedby___gt: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___gt));
        }
        if (_lastmodifiedby___gte != null) {
            joiner.add("_lastmodifiedby___gte: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___gte));
        }
        if (_lastmodifiedby___contains != null) {
            joiner.add("_lastmodifiedby___contains: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___contains));
        }
        if (_lastmodifiedby___not___contains != null) {
            joiner.add("_lastmodifiedby___not___contains: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___not___contains));
        }
        if (_lastmodifiedby___starts_with != null) {
            joiner.add("_lastmodifiedby___starts_with: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___starts_with));
        }
        if (_lastmodifiedby___not___starts_with != null) {
            joiner.add("_lastmodifiedby___not___starts_with: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___not___starts_with));
        }
        if (_lastmodifiedby___ends_with != null) {
            joiner.add("_lastmodifiedby___ends_with: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___ends_with));
        }
        if (_lastmodifiedby___not___ends_with != null) {
            joiner.add("_lastmodifiedby___not___ends_with: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby___not___ends_with));
        }
        if (_lastmodifiedon___eq != null) {
            joiner.add("_lastmodifiedon___eq: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon___eq));
        }
        if (_lastmodifiedon___ne != null) {
            joiner.add("_lastmodifiedon___ne: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon___ne));
        }
        if (_lastmodifiedon___null != null) {
            joiner.add("_lastmodifiedon___null: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon___null));
        }
        if (_lastmodifiedon___not___null != null) {
            joiner.add("_lastmodifiedon___not___null: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon___not___null));
        }
        if (_lastmodifiedon___in != null) {
            joiner.add("_lastmodifiedon___in: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon___in));
        }
        if (_lastmodifiedon___not___in != null) {
            joiner.add("_lastmodifiedon___not___in: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon___not___in));
        }
        if (_lastmodifiedon___lt != null) {
            joiner.add("_lastmodifiedon___lt: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon___lt));
        }
        if (_lastmodifiedon___lte != null) {
            joiner.add("_lastmodifiedon___lte: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon___lte));
        }
        if (_lastmodifiedon___gt != null) {
            joiner.add("_lastmodifiedon___gt: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon___gt));
        }
        if (_lastmodifiedon___gte != null) {
            joiner.add("_lastmodifiedon___gte: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon___gte));
        }
        if (_ownedby___eq != null) {
            joiner.add("_ownedby___eq: " + GraphQLRequestSerializer.getEntry(_ownedby___eq));
        }
        if (_ownedby___ne != null) {
            joiner.add("_ownedby___ne: " + GraphQLRequestSerializer.getEntry(_ownedby___ne));
        }
        if (_ownedby___null != null) {
            joiner.add("_ownedby___null: " + GraphQLRequestSerializer.getEntry(_ownedby___null));
        }
        if (_ownedby___not___null != null) {
            joiner.add("_ownedby___not___null: " + GraphQLRequestSerializer.getEntry(_ownedby___not___null));
        }
        if (_ownedby___in != null) {
            joiner.add("_ownedby___in: " + GraphQLRequestSerializer.getEntry(_ownedby___in));
        }
        if (_ownedby___not___in != null) {
            joiner.add("_ownedby___not___in: " + GraphQLRequestSerializer.getEntry(_ownedby___not___in));
        }
        if (_ownedby___lt != null) {
            joiner.add("_ownedby___lt: " + GraphQLRequestSerializer.getEntry(_ownedby___lt));
        }
        if (_ownedby___lte != null) {
            joiner.add("_ownedby___lte: " + GraphQLRequestSerializer.getEntry(_ownedby___lte));
        }
        if (_ownedby___gt != null) {
            joiner.add("_ownedby___gt: " + GraphQLRequestSerializer.getEntry(_ownedby___gt));
        }
        if (_ownedby___gte != null) {
            joiner.add("_ownedby___gte: " + GraphQLRequestSerializer.getEntry(_ownedby___gte));
        }
        if (_ownedby___contains != null) {
            joiner.add("_ownedby___contains: " + GraphQLRequestSerializer.getEntry(_ownedby___contains));
        }
        if (_ownedby___not___contains != null) {
            joiner.add("_ownedby___not___contains: " + GraphQLRequestSerializer.getEntry(_ownedby___not___contains));
        }
        if (_ownedby___starts_with != null) {
            joiner.add("_ownedby___starts_with: " + GraphQLRequestSerializer.getEntry(_ownedby___starts_with));
        }
        if (_ownedby___not___starts_with != null) {
            joiner.add("_ownedby___not___starts_with: " + GraphQLRequestSerializer.getEntry(_ownedby___not___starts_with));
        }
        if (_ownedby___ends_with != null) {
            joiner.add("_ownedby___ends_with: " + GraphQLRequestSerializer.getEntry(_ownedby___ends_with));
        }
        if (_ownedby___not___ends_with != null) {
            joiner.add("_ownedby___not___ends_with: " + GraphQLRequestSerializer.getEntry(_ownedby___not___ends_with));
        }
        if (_ownedon___eq != null) {
            joiner.add("_ownedon___eq: " + GraphQLRequestSerializer.getEntry(_ownedon___eq));
        }
        if (_ownedon___ne != null) {
            joiner.add("_ownedon___ne: " + GraphQLRequestSerializer.getEntry(_ownedon___ne));
        }
        if (_ownedon___null != null) {
            joiner.add("_ownedon___null: " + GraphQLRequestSerializer.getEntry(_ownedon___null));
        }
        if (_ownedon___not___null != null) {
            joiner.add("_ownedon___not___null: " + GraphQLRequestSerializer.getEntry(_ownedon___not___null));
        }
        if (_ownedon___in != null) {
            joiner.add("_ownedon___in: " + GraphQLRequestSerializer.getEntry(_ownedon___in));
        }
        if (_ownedon___not___in != null) {
            joiner.add("_ownedon___not___in: " + GraphQLRequestSerializer.getEntry(_ownedon___not___in));
        }
        if (_ownedon___lt != null) {
            joiner.add("_ownedon___lt: " + GraphQLRequestSerializer.getEntry(_ownedon___lt));
        }
        if (_ownedon___lte != null) {
            joiner.add("_ownedon___lte: " + GraphQLRequestSerializer.getEntry(_ownedon___lte));
        }
        if (_ownedon___gt != null) {
            joiner.add("_ownedon___gt: " + GraphQLRequestSerializer.getEntry(_ownedon___gt));
        }
        if (_ownedon___gte != null) {
            joiner.add("_ownedon___gte: " + GraphQLRequestSerializer.getEntry(_ownedon___gte));
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
        if (codice_DAD___eq != null) {
            joiner.add("codice_DAD___eq: " + GraphQLRequestSerializer.getEntry(codice_DAD___eq));
        }
        if (codice_DAD___ne != null) {
            joiner.add("codice_DAD___ne: " + GraphQLRequestSerializer.getEntry(codice_DAD___ne));
        }
        if (codice_DAD___null != null) {
            joiner.add("codice_DAD___null: " + GraphQLRequestSerializer.getEntry(codice_DAD___null));
        }
        if (codice_DAD___not___null != null) {
            joiner.add("codice_DAD___not___null: " + GraphQLRequestSerializer.getEntry(codice_DAD___not___null));
        }
        if (codice_DAD___in != null) {
            joiner.add("codice_DAD___in: " + GraphQLRequestSerializer.getEntry(codice_DAD___in));
        }
        if (codice_DAD___not___in != null) {
            joiner.add("codice_DAD___not___in: " + GraphQLRequestSerializer.getEntry(codice_DAD___not___in));
        }
        if (codice_DAD___lt != null) {
            joiner.add("codice_DAD___lt: " + GraphQLRequestSerializer.getEntry(codice_DAD___lt));
        }
        if (codice_DAD___lte != null) {
            joiner.add("codice_DAD___lte: " + GraphQLRequestSerializer.getEntry(codice_DAD___lte));
        }
        if (codice_DAD___gt != null) {
            joiner.add("codice_DAD___gt: " + GraphQLRequestSerializer.getEntry(codice_DAD___gt));
        }
        if (codice_DAD___gte != null) {
            joiner.add("codice_DAD___gte: " + GraphQLRequestSerializer.getEntry(codice_DAD___gte));
        }
        if (codice_DAD___contains != null) {
            joiner.add("codice_DAD___contains: " + GraphQLRequestSerializer.getEntry(codice_DAD___contains));
        }
        if (codice_DAD___not___contains != null) {
            joiner.add("codice_DAD___not___contains: " + GraphQLRequestSerializer.getEntry(codice_DAD___not___contains));
        }
        if (codice_DAD___starts_with != null) {
            joiner.add("codice_DAD___starts_with: " + GraphQLRequestSerializer.getEntry(codice_DAD___starts_with));
        }
        if (codice_DAD___not___starts_with != null) {
            joiner.add("codice_DAD___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_DAD___not___starts_with));
        }
        if (codice_DAD___ends_with != null) {
            joiner.add("codice_DAD___ends_with: " + GraphQLRequestSerializer.getEntry(codice_DAD___ends_with));
        }
        if (codice_DAD___not___ends_with != null) {
            joiner.add("codice_DAD___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_DAD___not___ends_with));
        }
        if (gruppo___eq != null) {
            joiner.add("gruppo___eq: " + GraphQLRequestSerializer.getEntry(gruppo___eq));
        }
        if (gruppo___ne != null) {
            joiner.add("gruppo___ne: " + GraphQLRequestSerializer.getEntry(gruppo___ne));
        }
        if (gruppo___null != null) {
            joiner.add("gruppo___null: " + GraphQLRequestSerializer.getEntry(gruppo___null));
        }
        if (gruppo___not___null != null) {
            joiner.add("gruppo___not___null: " + GraphQLRequestSerializer.getEntry(gruppo___not___null));
        }
        if (gruppo___in != null) {
            joiner.add("gruppo___in: " + GraphQLRequestSerializer.getEntry(gruppo___in));
        }
        if (gruppo___not___in != null) {
            joiner.add("gruppo___not___in: " + GraphQLRequestSerializer.getEntry(gruppo___not___in));
        }
        if (gruppo___lt != null) {
            joiner.add("gruppo___lt: " + GraphQLRequestSerializer.getEntry(gruppo___lt));
        }
        if (gruppo___lte != null) {
            joiner.add("gruppo___lte: " + GraphQLRequestSerializer.getEntry(gruppo___lte));
        }
        if (gruppo___gt != null) {
            joiner.add("gruppo___gt: " + GraphQLRequestSerializer.getEntry(gruppo___gt));
        }
        if (gruppo___gte != null) {
            joiner.add("gruppo___gte: " + GraphQLRequestSerializer.getEntry(gruppo___gte));
        }
        if (gruppo___contains != null) {
            joiner.add("gruppo___contains: " + GraphQLRequestSerializer.getEntry(gruppo___contains));
        }
        if (gruppo___not___contains != null) {
            joiner.add("gruppo___not___contains: " + GraphQLRequestSerializer.getEntry(gruppo___not___contains));
        }
        if (gruppo___starts_with != null) {
            joiner.add("gruppo___starts_with: " + GraphQLRequestSerializer.getEntry(gruppo___starts_with));
        }
        if (gruppo___not___starts_with != null) {
            joiner.add("gruppo___not___starts_with: " + GraphQLRequestSerializer.getEntry(gruppo___not___starts_with));
        }
        if (gruppo___ends_with != null) {
            joiner.add("gruppo___ends_with: " + GraphQLRequestSerializer.getEntry(gruppo___ends_with));
        }
        if (gruppo___not___ends_with != null) {
            joiner.add("gruppo___not___ends_with: " + GraphQLRequestSerializer.getEntry(gruppo___not___ends_with));
        }
        if (ico___eq != null) {
            joiner.add("ico___eq: " + GraphQLRequestSerializer.getEntry(ico___eq));
        }
        if (ico___ne != null) {
            joiner.add("ico___ne: " + GraphQLRequestSerializer.getEntry(ico___ne));
        }
        if (ico___null != null) {
            joiner.add("ico___null: " + GraphQLRequestSerializer.getEntry(ico___null));
        }
        if (ico___not___null != null) {
            joiner.add("ico___not___null: " + GraphQLRequestSerializer.getEntry(ico___not___null));
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
        if (nome_completo___eq != null) {
            joiner.add("nome_completo___eq: " + GraphQLRequestSerializer.getEntry(nome_completo___eq));
        }
        if (nome_completo___ne != null) {
            joiner.add("nome_completo___ne: " + GraphQLRequestSerializer.getEntry(nome_completo___ne));
        }
        if (nome_completo___null != null) {
            joiner.add("nome_completo___null: " + GraphQLRequestSerializer.getEntry(nome_completo___null));
        }
        if (nome_completo___not___null != null) {
            joiner.add("nome_completo___not___null: " + GraphQLRequestSerializer.getEntry(nome_completo___not___null));
        }
        if (nome_completo___in != null) {
            joiner.add("nome_completo___in: " + GraphQLRequestSerializer.getEntry(nome_completo___in));
        }
        if (nome_completo___not___in != null) {
            joiner.add("nome_completo___not___in: " + GraphQLRequestSerializer.getEntry(nome_completo___not___in));
        }
        if (nome_completo___lt != null) {
            joiner.add("nome_completo___lt: " + GraphQLRequestSerializer.getEntry(nome_completo___lt));
        }
        if (nome_completo___lte != null) {
            joiner.add("nome_completo___lte: " + GraphQLRequestSerializer.getEntry(nome_completo___lte));
        }
        if (nome_completo___gt != null) {
            joiner.add("nome_completo___gt: " + GraphQLRequestSerializer.getEntry(nome_completo___gt));
        }
        if (nome_completo___gte != null) {
            joiner.add("nome_completo___gte: " + GraphQLRequestSerializer.getEntry(nome_completo___gte));
        }
        if (nome_completo___contains != null) {
            joiner.add("nome_completo___contains: " + GraphQLRequestSerializer.getEntry(nome_completo___contains));
        }
        if (nome_completo___not___contains != null) {
            joiner.add("nome_completo___not___contains: " + GraphQLRequestSerializer.getEntry(nome_completo___not___contains));
        }
        if (nome_completo___starts_with != null) {
            joiner.add("nome_completo___starts_with: " + GraphQLRequestSerializer.getEntry(nome_completo___starts_with));
        }
        if (nome_completo___not___starts_with != null) {
            joiner.add("nome_completo___not___starts_with: " + GraphQLRequestSerializer.getEntry(nome_completo___not___starts_with));
        }
        if (nome_completo___ends_with != null) {
            joiner.add("nome_completo___ends_with: " + GraphQLRequestSerializer.getEntry(nome_completo___ends_with));
        }
        if (nome_completo___not___ends_with != null) {
            joiner.add("nome_completo___not___ends_with: " + GraphQLRequestSerializer.getEntry(nome_completo___not___ends_with));
        }
        if (nome_gruppo___eq != null) {
            joiner.add("nome_gruppo___eq: " + GraphQLRequestSerializer.getEntry(nome_gruppo___eq));
        }
        if (nome_gruppo___ne != null) {
            joiner.add("nome_gruppo___ne: " + GraphQLRequestSerializer.getEntry(nome_gruppo___ne));
        }
        if (nome_gruppo___null != null) {
            joiner.add("nome_gruppo___null: " + GraphQLRequestSerializer.getEntry(nome_gruppo___null));
        }
        if (nome_gruppo___not___null != null) {
            joiner.add("nome_gruppo___not___null: " + GraphQLRequestSerializer.getEntry(nome_gruppo___not___null));
        }
        if (nome_gruppo___in != null) {
            joiner.add("nome_gruppo___in: " + GraphQLRequestSerializer.getEntry(nome_gruppo___in));
        }
        if (nome_gruppo___not___in != null) {
            joiner.add("nome_gruppo___not___in: " + GraphQLRequestSerializer.getEntry(nome_gruppo___not___in));
        }
        if (nome_gruppo___lt != null) {
            joiner.add("nome_gruppo___lt: " + GraphQLRequestSerializer.getEntry(nome_gruppo___lt));
        }
        if (nome_gruppo___lte != null) {
            joiner.add("nome_gruppo___lte: " + GraphQLRequestSerializer.getEntry(nome_gruppo___lte));
        }
        if (nome_gruppo___gt != null) {
            joiner.add("nome_gruppo___gt: " + GraphQLRequestSerializer.getEntry(nome_gruppo___gt));
        }
        if (nome_gruppo___gte != null) {
            joiner.add("nome_gruppo___gte: " + GraphQLRequestSerializer.getEntry(nome_gruppo___gte));
        }
        if (nome_gruppo___contains != null) {
            joiner.add("nome_gruppo___contains: " + GraphQLRequestSerializer.getEntry(nome_gruppo___contains));
        }
        if (nome_gruppo___not___contains != null) {
            joiner.add("nome_gruppo___not___contains: " + GraphQLRequestSerializer.getEntry(nome_gruppo___not___contains));
        }
        if (nome_gruppo___starts_with != null) {
            joiner.add("nome_gruppo___starts_with: " + GraphQLRequestSerializer.getEntry(nome_gruppo___starts_with));
        }
        if (nome_gruppo___not___starts_with != null) {
            joiner.add("nome_gruppo___not___starts_with: " + GraphQLRequestSerializer.getEntry(nome_gruppo___not___starts_with));
        }
        if (nome_gruppo___ends_with != null) {
            joiner.add("nome_gruppo___ends_with: " + GraphQLRequestSerializer.getEntry(nome_gruppo___ends_with));
        }
        if (nome_gruppo___not___ends_with != null) {
            joiner.add("nome_gruppo___not___ends_with: " + GraphQLRequestSerializer.getEntry(nome_gruppo___not___ends_with));
        }
        if (pride___eq != null) {
            joiner.add("pride___eq: " + GraphQLRequestSerializer.getEntry(pride___eq));
        }
        if (pride___ne != null) {
            joiner.add("pride___ne: " + GraphQLRequestSerializer.getEntry(pride___ne));
        }
        if (pride___null != null) {
            joiner.add("pride___null: " + GraphQLRequestSerializer.getEntry(pride___null));
        }
        if (pride___not___null != null) {
            joiner.add("pride___not___null: " + GraphQLRequestSerializer.getEntry(pride___not___null));
        }
        if (sottogruppo___eq != null) {
            joiner.add("sottogruppo___eq: " + GraphQLRequestSerializer.getEntry(sottogruppo___eq));
        }
        if (sottogruppo___ne != null) {
            joiner.add("sottogruppo___ne: " + GraphQLRequestSerializer.getEntry(sottogruppo___ne));
        }
        if (sottogruppo___null != null) {
            joiner.add("sottogruppo___null: " + GraphQLRequestSerializer.getEntry(sottogruppo___null));
        }
        if (sottogruppo___not___null != null) {
            joiner.add("sottogruppo___not___null: " + GraphQLRequestSerializer.getEntry(sottogruppo___not___null));
        }
        if (sottogruppo___in != null) {
            joiner.add("sottogruppo___in: " + GraphQLRequestSerializer.getEntry(sottogruppo___in));
        }
        if (sottogruppo___not___in != null) {
            joiner.add("sottogruppo___not___in: " + GraphQLRequestSerializer.getEntry(sottogruppo___not___in));
        }
        if (sottogruppo___lt != null) {
            joiner.add("sottogruppo___lt: " + GraphQLRequestSerializer.getEntry(sottogruppo___lt));
        }
        if (sottogruppo___lte != null) {
            joiner.add("sottogruppo___lte: " + GraphQLRequestSerializer.getEntry(sottogruppo___lte));
        }
        if (sottogruppo___gt != null) {
            joiner.add("sottogruppo___gt: " + GraphQLRequestSerializer.getEntry(sottogruppo___gt));
        }
        if (sottogruppo___gte != null) {
            joiner.add("sottogruppo___gte: " + GraphQLRequestSerializer.getEntry(sottogruppo___gte));
        }
        if (sottogruppo___contains != null) {
            joiner.add("sottogruppo___contains: " + GraphQLRequestSerializer.getEntry(sottogruppo___contains));
        }
        if (sottogruppo___not___contains != null) {
            joiner.add("sottogruppo___not___contains: " + GraphQLRequestSerializer.getEntry(sottogruppo___not___contains));
        }
        if (sottogruppo___starts_with != null) {
            joiner.add("sottogruppo___starts_with: " + GraphQLRequestSerializer.getEntry(sottogruppo___starts_with));
        }
        if (sottogruppo___not___starts_with != null) {
            joiner.add("sottogruppo___not___starts_with: " + GraphQLRequestSerializer.getEntry(sottogruppo___not___starts_with));
        }
        if (sottogruppo___ends_with != null) {
            joiner.add("sottogruppo___ends_with: " + GraphQLRequestSerializer.getEntry(sottogruppo___ends_with));
        }
        if (sottogruppo___not___ends_with != null) {
            joiner.add("sottogruppo___not___ends_with: " + GraphQLRequestSerializer.getEntry(sottogruppo___not___ends_with));
        }
        if (visualizzato___eq != null) {
            joiner.add("visualizzato___eq: " + GraphQLRequestSerializer.getEntry(visualizzato___eq));
        }
        if (visualizzato___ne != null) {
            joiner.add("visualizzato___ne: " + GraphQLRequestSerializer.getEntry(visualizzato___ne));
        }
        if (visualizzato___null != null) {
            joiner.add("visualizzato___null: " + GraphQLRequestSerializer.getEntry(visualizzato___null));
        }
        if (visualizzato___not___null != null) {
            joiner.add("visualizzato___not___null: " + GraphQLRequestSerializer.getEntry(visualizzato___not___null));
        }
        if (visualizzato___in != null) {
            joiner.add("visualizzato___in: " + GraphQLRequestSerializer.getEntry(visualizzato___in));
        }
        if (visualizzato___not___in != null) {
            joiner.add("visualizzato___not___in: " + GraphQLRequestSerializer.getEntry(visualizzato___not___in));
        }
        if (visualizzato___lt != null) {
            joiner.add("visualizzato___lt: " + GraphQLRequestSerializer.getEntry(visualizzato___lt));
        }
        if (visualizzato___lte != null) {
            joiner.add("visualizzato___lte: " + GraphQLRequestSerializer.getEntry(visualizzato___lte));
        }
        if (visualizzato___gt != null) {
            joiner.add("visualizzato___gt: " + GraphQLRequestSerializer.getEntry(visualizzato___gt));
        }
        if (visualizzato___gte != null) {
            joiner.add("visualizzato___gte: " + GraphQLRequestSerializer.getEntry(visualizzato___gte));
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

    public static CliMotivazione_fine_ARVFilterDTO.Builder builder() {
        return new CliMotivazione_fine_ARVFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId___eq;
        private String _createdby___eq;
        private String _createdby___ne;
        private Boolean _createdby___null;
        private Boolean _createdby___not___null;
        private java.util.List<String> _createdby___in;
        private java.util.List<String> _createdby___not___in;
        private String _createdby___lt;
        private String _createdby___lte;
        private String _createdby___gt;
        private String _createdby___gte;
        private String _createdby___contains;
        private String _createdby___not___contains;
        private String _createdby___starts_with;
        private String _createdby___not___starts_with;
        private String _createdby___ends_with;
        private String _createdby___not___ends_with;
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
        private String _lastmodifiedby___eq;
        private String _lastmodifiedby___ne;
        private Boolean _lastmodifiedby___null;
        private Boolean _lastmodifiedby___not___null;
        private java.util.List<String> _lastmodifiedby___in;
        private java.util.List<String> _lastmodifiedby___not___in;
        private String _lastmodifiedby___lt;
        private String _lastmodifiedby___lte;
        private String _lastmodifiedby___gt;
        private String _lastmodifiedby___gte;
        private String _lastmodifiedby___contains;
        private String _lastmodifiedby___not___contains;
        private String _lastmodifiedby___starts_with;
        private String _lastmodifiedby___not___starts_with;
        private String _lastmodifiedby___ends_with;
        private String _lastmodifiedby___not___ends_with;
        private String _lastmodifiedon___eq;
        private String _lastmodifiedon___ne;
        private Boolean _lastmodifiedon___null;
        private Boolean _lastmodifiedon___not___null;
        private java.util.List<String> _lastmodifiedon___in;
        private java.util.List<String> _lastmodifiedon___not___in;
        private String _lastmodifiedon___lt;
        private String _lastmodifiedon___lte;
        private String _lastmodifiedon___gt;
        private String _lastmodifiedon___gte;
        private String _ownedby___eq;
        private String _ownedby___ne;
        private Boolean _ownedby___null;
        private Boolean _ownedby___not___null;
        private java.util.List<String> _ownedby___in;
        private java.util.List<String> _ownedby___not___in;
        private String _ownedby___lt;
        private String _ownedby___lte;
        private String _ownedby___gt;
        private String _ownedby___gte;
        private String _ownedby___contains;
        private String _ownedby___not___contains;
        private String _ownedby___starts_with;
        private String _ownedby___not___starts_with;
        private String _ownedby___ends_with;
        private String _ownedby___not___ends_with;
        private String _ownedon___eq;
        private String _ownedon___ne;
        private Boolean _ownedon___null;
        private Boolean _ownedon___not___null;
        private java.util.List<String> _ownedon___in;
        private java.util.List<String> _ownedon___not___in;
        private String _ownedon___lt;
        private String _ownedon___lte;
        private String _ownedon___gt;
        private String _ownedon___gte;
        private Integer codice___eq;
        private Integer codice___ne;
        private Boolean codice___null;
        private Boolean codice___not___null;
        private java.util.List<Integer> codice___in;
        private java.util.List<Integer> codice___not___in;
        private Integer codice___lt;
        private Integer codice___lte;
        private Integer codice___gt;
        private Integer codice___gte;
        private String codice_DAD___eq;
        private String codice_DAD___ne;
        private Boolean codice_DAD___null;
        private Boolean codice_DAD___not___null;
        private java.util.List<String> codice_DAD___in;
        private java.util.List<String> codice_DAD___not___in;
        private String codice_DAD___lt;
        private String codice_DAD___lte;
        private String codice_DAD___gt;
        private String codice_DAD___gte;
        private String codice_DAD___contains;
        private String codice_DAD___not___contains;
        private String codice_DAD___starts_with;
        private String codice_DAD___not___starts_with;
        private String codice_DAD___ends_with;
        private String codice_DAD___not___ends_with;
        private String gruppo___eq;
        private String gruppo___ne;
        private Boolean gruppo___null;
        private Boolean gruppo___not___null;
        private java.util.List<String> gruppo___in;
        private java.util.List<String> gruppo___not___in;
        private String gruppo___lt;
        private String gruppo___lte;
        private String gruppo___gt;
        private String gruppo___gte;
        private String gruppo___contains;
        private String gruppo___not___contains;
        private String gruppo___starts_with;
        private String gruppo___not___starts_with;
        private String gruppo___ends_with;
        private String gruppo___not___ends_with;
        private Boolean ico___eq;
        private Boolean ico___ne;
        private Boolean ico___null;
        private Boolean ico___not___null;
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
        private String nome_completo___eq;
        private String nome_completo___ne;
        private Boolean nome_completo___null;
        private Boolean nome_completo___not___null;
        private java.util.List<String> nome_completo___in;
        private java.util.List<String> nome_completo___not___in;
        private String nome_completo___lt;
        private String nome_completo___lte;
        private String nome_completo___gt;
        private String nome_completo___gte;
        private String nome_completo___contains;
        private String nome_completo___not___contains;
        private String nome_completo___starts_with;
        private String nome_completo___not___starts_with;
        private String nome_completo___ends_with;
        private String nome_completo___not___ends_with;
        private String nome_gruppo___eq;
        private String nome_gruppo___ne;
        private Boolean nome_gruppo___null;
        private Boolean nome_gruppo___not___null;
        private java.util.List<String> nome_gruppo___in;
        private java.util.List<String> nome_gruppo___not___in;
        private String nome_gruppo___lt;
        private String nome_gruppo___lte;
        private String nome_gruppo___gt;
        private String nome_gruppo___gte;
        private String nome_gruppo___contains;
        private String nome_gruppo___not___contains;
        private String nome_gruppo___starts_with;
        private String nome_gruppo___not___starts_with;
        private String nome_gruppo___ends_with;
        private String nome_gruppo___not___ends_with;
        private Boolean pride___eq;
        private Boolean pride___ne;
        private Boolean pride___null;
        private Boolean pride___not___null;
        private String sottogruppo___eq;
        private String sottogruppo___ne;
        private Boolean sottogruppo___null;
        private Boolean sottogruppo___not___null;
        private java.util.List<String> sottogruppo___in;
        private java.util.List<String> sottogruppo___not___in;
        private String sottogruppo___lt;
        private String sottogruppo___lte;
        private String sottogruppo___gt;
        private String sottogruppo___gte;
        private String sottogruppo___contains;
        private String sottogruppo___not___contains;
        private String sottogruppo___starts_with;
        private String sottogruppo___not___starts_with;
        private String sottogruppo___ends_with;
        private String sottogruppo___not___ends_with;
        private Integer visualizzato___eq;
        private Integer visualizzato___ne;
        private Boolean visualizzato___null;
        private Boolean visualizzato___not___null;
        private java.util.List<Integer> visualizzato___in;
        private java.util.List<Integer> visualizzato___not___in;
        private Integer visualizzato___lt;
        private Integer visualizzato___lte;
        private Integer visualizzato___gt;
        private Integer visualizzato___gte;
        private java.util.List<CliMotivazione_fine_ARVFilterDTO> AND;
        private java.util.List<CliMotivazione_fine_ARVFilterDTO> OR;
        private CliMotivazione_fine_ARVFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
            return this;
        }

        public Builder set_createdby___eq(String _createdby___eq) {
            this._createdby___eq = _createdby___eq;
            return this;
        }

        public Builder set_createdby___ne(String _createdby___ne) {
            this._createdby___ne = _createdby___ne;
            return this;
        }

        public Builder set_createdby___null(Boolean _createdby___null) {
            this._createdby___null = _createdby___null;
            return this;
        }

        public Builder set_createdby___not___null(Boolean _createdby___not___null) {
            this._createdby___not___null = _createdby___not___null;
            return this;
        }

        public Builder set_createdby___in(java.util.List<String> _createdby___in) {
            this._createdby___in = _createdby___in;
            return this;
        }

        public Builder set_createdby___not___in(java.util.List<String> _createdby___not___in) {
            this._createdby___not___in = _createdby___not___in;
            return this;
        }

        public Builder set_createdby___lt(String _createdby___lt) {
            this._createdby___lt = _createdby___lt;
            return this;
        }

        public Builder set_createdby___lte(String _createdby___lte) {
            this._createdby___lte = _createdby___lte;
            return this;
        }

        public Builder set_createdby___gt(String _createdby___gt) {
            this._createdby___gt = _createdby___gt;
            return this;
        }

        public Builder set_createdby___gte(String _createdby___gte) {
            this._createdby___gte = _createdby___gte;
            return this;
        }

        public Builder set_createdby___contains(String _createdby___contains) {
            this._createdby___contains = _createdby___contains;
            return this;
        }

        public Builder set_createdby___not___contains(String _createdby___not___contains) {
            this._createdby___not___contains = _createdby___not___contains;
            return this;
        }

        public Builder set_createdby___starts_with(String _createdby___starts_with) {
            this._createdby___starts_with = _createdby___starts_with;
            return this;
        }

        public Builder set_createdby___not___starts_with(String _createdby___not___starts_with) {
            this._createdby___not___starts_with = _createdby___not___starts_with;
            return this;
        }

        public Builder set_createdby___ends_with(String _createdby___ends_with) {
            this._createdby___ends_with = _createdby___ends_with;
            return this;
        }

        public Builder set_createdby___not___ends_with(String _createdby___not___ends_with) {
            this._createdby___not___ends_with = _createdby___not___ends_with;
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

        public Builder set_lastmodifiedby___eq(String _lastmodifiedby___eq) {
            this._lastmodifiedby___eq = _lastmodifiedby___eq;
            return this;
        }

        public Builder set_lastmodifiedby___ne(String _lastmodifiedby___ne) {
            this._lastmodifiedby___ne = _lastmodifiedby___ne;
            return this;
        }

        public Builder set_lastmodifiedby___null(Boolean _lastmodifiedby___null) {
            this._lastmodifiedby___null = _lastmodifiedby___null;
            return this;
        }

        public Builder set_lastmodifiedby___not___null(Boolean _lastmodifiedby___not___null) {
            this._lastmodifiedby___not___null = _lastmodifiedby___not___null;
            return this;
        }

        public Builder set_lastmodifiedby___in(java.util.List<String> _lastmodifiedby___in) {
            this._lastmodifiedby___in = _lastmodifiedby___in;
            return this;
        }

        public Builder set_lastmodifiedby___not___in(java.util.List<String> _lastmodifiedby___not___in) {
            this._lastmodifiedby___not___in = _lastmodifiedby___not___in;
            return this;
        }

        public Builder set_lastmodifiedby___lt(String _lastmodifiedby___lt) {
            this._lastmodifiedby___lt = _lastmodifiedby___lt;
            return this;
        }

        public Builder set_lastmodifiedby___lte(String _lastmodifiedby___lte) {
            this._lastmodifiedby___lte = _lastmodifiedby___lte;
            return this;
        }

        public Builder set_lastmodifiedby___gt(String _lastmodifiedby___gt) {
            this._lastmodifiedby___gt = _lastmodifiedby___gt;
            return this;
        }

        public Builder set_lastmodifiedby___gte(String _lastmodifiedby___gte) {
            this._lastmodifiedby___gte = _lastmodifiedby___gte;
            return this;
        }

        public Builder set_lastmodifiedby___contains(String _lastmodifiedby___contains) {
            this._lastmodifiedby___contains = _lastmodifiedby___contains;
            return this;
        }

        public Builder set_lastmodifiedby___not___contains(String _lastmodifiedby___not___contains) {
            this._lastmodifiedby___not___contains = _lastmodifiedby___not___contains;
            return this;
        }

        public Builder set_lastmodifiedby___starts_with(String _lastmodifiedby___starts_with) {
            this._lastmodifiedby___starts_with = _lastmodifiedby___starts_with;
            return this;
        }

        public Builder set_lastmodifiedby___not___starts_with(String _lastmodifiedby___not___starts_with) {
            this._lastmodifiedby___not___starts_with = _lastmodifiedby___not___starts_with;
            return this;
        }

        public Builder set_lastmodifiedby___ends_with(String _lastmodifiedby___ends_with) {
            this._lastmodifiedby___ends_with = _lastmodifiedby___ends_with;
            return this;
        }

        public Builder set_lastmodifiedby___not___ends_with(String _lastmodifiedby___not___ends_with) {
            this._lastmodifiedby___not___ends_with = _lastmodifiedby___not___ends_with;
            return this;
        }

        public Builder set_lastmodifiedon___eq(String _lastmodifiedon___eq) {
            this._lastmodifiedon___eq = _lastmodifiedon___eq;
            return this;
        }

        public Builder set_lastmodifiedon___ne(String _lastmodifiedon___ne) {
            this._lastmodifiedon___ne = _lastmodifiedon___ne;
            return this;
        }

        public Builder set_lastmodifiedon___null(Boolean _lastmodifiedon___null) {
            this._lastmodifiedon___null = _lastmodifiedon___null;
            return this;
        }

        public Builder set_lastmodifiedon___not___null(Boolean _lastmodifiedon___not___null) {
            this._lastmodifiedon___not___null = _lastmodifiedon___not___null;
            return this;
        }

        public Builder set_lastmodifiedon___in(java.util.List<String> _lastmodifiedon___in) {
            this._lastmodifiedon___in = _lastmodifiedon___in;
            return this;
        }

        public Builder set_lastmodifiedon___not___in(java.util.List<String> _lastmodifiedon___not___in) {
            this._lastmodifiedon___not___in = _lastmodifiedon___not___in;
            return this;
        }

        public Builder set_lastmodifiedon___lt(String _lastmodifiedon___lt) {
            this._lastmodifiedon___lt = _lastmodifiedon___lt;
            return this;
        }

        public Builder set_lastmodifiedon___lte(String _lastmodifiedon___lte) {
            this._lastmodifiedon___lte = _lastmodifiedon___lte;
            return this;
        }

        public Builder set_lastmodifiedon___gt(String _lastmodifiedon___gt) {
            this._lastmodifiedon___gt = _lastmodifiedon___gt;
            return this;
        }

        public Builder set_lastmodifiedon___gte(String _lastmodifiedon___gte) {
            this._lastmodifiedon___gte = _lastmodifiedon___gte;
            return this;
        }

        public Builder set_ownedby___eq(String _ownedby___eq) {
            this._ownedby___eq = _ownedby___eq;
            return this;
        }

        public Builder set_ownedby___ne(String _ownedby___ne) {
            this._ownedby___ne = _ownedby___ne;
            return this;
        }

        public Builder set_ownedby___null(Boolean _ownedby___null) {
            this._ownedby___null = _ownedby___null;
            return this;
        }

        public Builder set_ownedby___not___null(Boolean _ownedby___not___null) {
            this._ownedby___not___null = _ownedby___not___null;
            return this;
        }

        public Builder set_ownedby___in(java.util.List<String> _ownedby___in) {
            this._ownedby___in = _ownedby___in;
            return this;
        }

        public Builder set_ownedby___not___in(java.util.List<String> _ownedby___not___in) {
            this._ownedby___not___in = _ownedby___not___in;
            return this;
        }

        public Builder set_ownedby___lt(String _ownedby___lt) {
            this._ownedby___lt = _ownedby___lt;
            return this;
        }

        public Builder set_ownedby___lte(String _ownedby___lte) {
            this._ownedby___lte = _ownedby___lte;
            return this;
        }

        public Builder set_ownedby___gt(String _ownedby___gt) {
            this._ownedby___gt = _ownedby___gt;
            return this;
        }

        public Builder set_ownedby___gte(String _ownedby___gte) {
            this._ownedby___gte = _ownedby___gte;
            return this;
        }

        public Builder set_ownedby___contains(String _ownedby___contains) {
            this._ownedby___contains = _ownedby___contains;
            return this;
        }

        public Builder set_ownedby___not___contains(String _ownedby___not___contains) {
            this._ownedby___not___contains = _ownedby___not___contains;
            return this;
        }

        public Builder set_ownedby___starts_with(String _ownedby___starts_with) {
            this._ownedby___starts_with = _ownedby___starts_with;
            return this;
        }

        public Builder set_ownedby___not___starts_with(String _ownedby___not___starts_with) {
            this._ownedby___not___starts_with = _ownedby___not___starts_with;
            return this;
        }

        public Builder set_ownedby___ends_with(String _ownedby___ends_with) {
            this._ownedby___ends_with = _ownedby___ends_with;
            return this;
        }

        public Builder set_ownedby___not___ends_with(String _ownedby___not___ends_with) {
            this._ownedby___not___ends_with = _ownedby___not___ends_with;
            return this;
        }

        public Builder set_ownedon___eq(String _ownedon___eq) {
            this._ownedon___eq = _ownedon___eq;
            return this;
        }

        public Builder set_ownedon___ne(String _ownedon___ne) {
            this._ownedon___ne = _ownedon___ne;
            return this;
        }

        public Builder set_ownedon___null(Boolean _ownedon___null) {
            this._ownedon___null = _ownedon___null;
            return this;
        }

        public Builder set_ownedon___not___null(Boolean _ownedon___not___null) {
            this._ownedon___not___null = _ownedon___not___null;
            return this;
        }

        public Builder set_ownedon___in(java.util.List<String> _ownedon___in) {
            this._ownedon___in = _ownedon___in;
            return this;
        }

        public Builder set_ownedon___not___in(java.util.List<String> _ownedon___not___in) {
            this._ownedon___not___in = _ownedon___not___in;
            return this;
        }

        public Builder set_ownedon___lt(String _ownedon___lt) {
            this._ownedon___lt = _ownedon___lt;
            return this;
        }

        public Builder set_ownedon___lte(String _ownedon___lte) {
            this._ownedon___lte = _ownedon___lte;
            return this;
        }

        public Builder set_ownedon___gt(String _ownedon___gt) {
            this._ownedon___gt = _ownedon___gt;
            return this;
        }

        public Builder set_ownedon___gte(String _ownedon___gte) {
            this._ownedon___gte = _ownedon___gte;
            return this;
        }

        public Builder setCodice___eq(Integer codice___eq) {
            this.codice___eq = codice___eq;
            return this;
        }

        public Builder setCodice___ne(Integer codice___ne) {
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

        public Builder setCodice___in(java.util.List<Integer> codice___in) {
            this.codice___in = codice___in;
            return this;
        }

        public Builder setCodice___not___in(java.util.List<Integer> codice___not___in) {
            this.codice___not___in = codice___not___in;
            return this;
        }

        public Builder setCodice___lt(Integer codice___lt) {
            this.codice___lt = codice___lt;
            return this;
        }

        public Builder setCodice___lte(Integer codice___lte) {
            this.codice___lte = codice___lte;
            return this;
        }

        public Builder setCodice___gt(Integer codice___gt) {
            this.codice___gt = codice___gt;
            return this;
        }

        public Builder setCodice___gte(Integer codice___gte) {
            this.codice___gte = codice___gte;
            return this;
        }

        public Builder setCodice_DAD___eq(String codice_DAD___eq) {
            this.codice_DAD___eq = codice_DAD___eq;
            return this;
        }

        public Builder setCodice_DAD___ne(String codice_DAD___ne) {
            this.codice_DAD___ne = codice_DAD___ne;
            return this;
        }

        public Builder setCodice_DAD___null(Boolean codice_DAD___null) {
            this.codice_DAD___null = codice_DAD___null;
            return this;
        }

        public Builder setCodice_DAD___not___null(Boolean codice_DAD___not___null) {
            this.codice_DAD___not___null = codice_DAD___not___null;
            return this;
        }

        public Builder setCodice_DAD___in(java.util.List<String> codice_DAD___in) {
            this.codice_DAD___in = codice_DAD___in;
            return this;
        }

        public Builder setCodice_DAD___not___in(java.util.List<String> codice_DAD___not___in) {
            this.codice_DAD___not___in = codice_DAD___not___in;
            return this;
        }

        public Builder setCodice_DAD___lt(String codice_DAD___lt) {
            this.codice_DAD___lt = codice_DAD___lt;
            return this;
        }

        public Builder setCodice_DAD___lte(String codice_DAD___lte) {
            this.codice_DAD___lte = codice_DAD___lte;
            return this;
        }

        public Builder setCodice_DAD___gt(String codice_DAD___gt) {
            this.codice_DAD___gt = codice_DAD___gt;
            return this;
        }

        public Builder setCodice_DAD___gte(String codice_DAD___gte) {
            this.codice_DAD___gte = codice_DAD___gte;
            return this;
        }

        public Builder setCodice_DAD___contains(String codice_DAD___contains) {
            this.codice_DAD___contains = codice_DAD___contains;
            return this;
        }

        public Builder setCodice_DAD___not___contains(String codice_DAD___not___contains) {
            this.codice_DAD___not___contains = codice_DAD___not___contains;
            return this;
        }

        public Builder setCodice_DAD___starts_with(String codice_DAD___starts_with) {
            this.codice_DAD___starts_with = codice_DAD___starts_with;
            return this;
        }

        public Builder setCodice_DAD___not___starts_with(String codice_DAD___not___starts_with) {
            this.codice_DAD___not___starts_with = codice_DAD___not___starts_with;
            return this;
        }

        public Builder setCodice_DAD___ends_with(String codice_DAD___ends_with) {
            this.codice_DAD___ends_with = codice_DAD___ends_with;
            return this;
        }

        public Builder setCodice_DAD___not___ends_with(String codice_DAD___not___ends_with) {
            this.codice_DAD___not___ends_with = codice_DAD___not___ends_with;
            return this;
        }

        public Builder setGruppo___eq(String gruppo___eq) {
            this.gruppo___eq = gruppo___eq;
            return this;
        }

        public Builder setGruppo___ne(String gruppo___ne) {
            this.gruppo___ne = gruppo___ne;
            return this;
        }

        public Builder setGruppo___null(Boolean gruppo___null) {
            this.gruppo___null = gruppo___null;
            return this;
        }

        public Builder setGruppo___not___null(Boolean gruppo___not___null) {
            this.gruppo___not___null = gruppo___not___null;
            return this;
        }

        public Builder setGruppo___in(java.util.List<String> gruppo___in) {
            this.gruppo___in = gruppo___in;
            return this;
        }

        public Builder setGruppo___not___in(java.util.List<String> gruppo___not___in) {
            this.gruppo___not___in = gruppo___not___in;
            return this;
        }

        public Builder setGruppo___lt(String gruppo___lt) {
            this.gruppo___lt = gruppo___lt;
            return this;
        }

        public Builder setGruppo___lte(String gruppo___lte) {
            this.gruppo___lte = gruppo___lte;
            return this;
        }

        public Builder setGruppo___gt(String gruppo___gt) {
            this.gruppo___gt = gruppo___gt;
            return this;
        }

        public Builder setGruppo___gte(String gruppo___gte) {
            this.gruppo___gte = gruppo___gte;
            return this;
        }

        public Builder setGruppo___contains(String gruppo___contains) {
            this.gruppo___contains = gruppo___contains;
            return this;
        }

        public Builder setGruppo___not___contains(String gruppo___not___contains) {
            this.gruppo___not___contains = gruppo___not___contains;
            return this;
        }

        public Builder setGruppo___starts_with(String gruppo___starts_with) {
            this.gruppo___starts_with = gruppo___starts_with;
            return this;
        }

        public Builder setGruppo___not___starts_with(String gruppo___not___starts_with) {
            this.gruppo___not___starts_with = gruppo___not___starts_with;
            return this;
        }

        public Builder setGruppo___ends_with(String gruppo___ends_with) {
            this.gruppo___ends_with = gruppo___ends_with;
            return this;
        }

        public Builder setGruppo___not___ends_with(String gruppo___not___ends_with) {
            this.gruppo___not___ends_with = gruppo___not___ends_with;
            return this;
        }

        public Builder setIco___eq(Boolean ico___eq) {
            this.ico___eq = ico___eq;
            return this;
        }

        public Builder setIco___ne(Boolean ico___ne) {
            this.ico___ne = ico___ne;
            return this;
        }

        public Builder setIco___null(Boolean ico___null) {
            this.ico___null = ico___null;
            return this;
        }

        public Builder setIco___not___null(Boolean ico___not___null) {
            this.ico___not___null = ico___not___null;
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

        public Builder setNome_completo___eq(String nome_completo___eq) {
            this.nome_completo___eq = nome_completo___eq;
            return this;
        }

        public Builder setNome_completo___ne(String nome_completo___ne) {
            this.nome_completo___ne = nome_completo___ne;
            return this;
        }

        public Builder setNome_completo___null(Boolean nome_completo___null) {
            this.nome_completo___null = nome_completo___null;
            return this;
        }

        public Builder setNome_completo___not___null(Boolean nome_completo___not___null) {
            this.nome_completo___not___null = nome_completo___not___null;
            return this;
        }

        public Builder setNome_completo___in(java.util.List<String> nome_completo___in) {
            this.nome_completo___in = nome_completo___in;
            return this;
        }

        public Builder setNome_completo___not___in(java.util.List<String> nome_completo___not___in) {
            this.nome_completo___not___in = nome_completo___not___in;
            return this;
        }

        public Builder setNome_completo___lt(String nome_completo___lt) {
            this.nome_completo___lt = nome_completo___lt;
            return this;
        }

        public Builder setNome_completo___lte(String nome_completo___lte) {
            this.nome_completo___lte = nome_completo___lte;
            return this;
        }

        public Builder setNome_completo___gt(String nome_completo___gt) {
            this.nome_completo___gt = nome_completo___gt;
            return this;
        }

        public Builder setNome_completo___gte(String nome_completo___gte) {
            this.nome_completo___gte = nome_completo___gte;
            return this;
        }

        public Builder setNome_completo___contains(String nome_completo___contains) {
            this.nome_completo___contains = nome_completo___contains;
            return this;
        }

        public Builder setNome_completo___not___contains(String nome_completo___not___contains) {
            this.nome_completo___not___contains = nome_completo___not___contains;
            return this;
        }

        public Builder setNome_completo___starts_with(String nome_completo___starts_with) {
            this.nome_completo___starts_with = nome_completo___starts_with;
            return this;
        }

        public Builder setNome_completo___not___starts_with(String nome_completo___not___starts_with) {
            this.nome_completo___not___starts_with = nome_completo___not___starts_with;
            return this;
        }

        public Builder setNome_completo___ends_with(String nome_completo___ends_with) {
            this.nome_completo___ends_with = nome_completo___ends_with;
            return this;
        }

        public Builder setNome_completo___not___ends_with(String nome_completo___not___ends_with) {
            this.nome_completo___not___ends_with = nome_completo___not___ends_with;
            return this;
        }

        public Builder setNome_gruppo___eq(String nome_gruppo___eq) {
            this.nome_gruppo___eq = nome_gruppo___eq;
            return this;
        }

        public Builder setNome_gruppo___ne(String nome_gruppo___ne) {
            this.nome_gruppo___ne = nome_gruppo___ne;
            return this;
        }

        public Builder setNome_gruppo___null(Boolean nome_gruppo___null) {
            this.nome_gruppo___null = nome_gruppo___null;
            return this;
        }

        public Builder setNome_gruppo___not___null(Boolean nome_gruppo___not___null) {
            this.nome_gruppo___not___null = nome_gruppo___not___null;
            return this;
        }

        public Builder setNome_gruppo___in(java.util.List<String> nome_gruppo___in) {
            this.nome_gruppo___in = nome_gruppo___in;
            return this;
        }

        public Builder setNome_gruppo___not___in(java.util.List<String> nome_gruppo___not___in) {
            this.nome_gruppo___not___in = nome_gruppo___not___in;
            return this;
        }

        public Builder setNome_gruppo___lt(String nome_gruppo___lt) {
            this.nome_gruppo___lt = nome_gruppo___lt;
            return this;
        }

        public Builder setNome_gruppo___lte(String nome_gruppo___lte) {
            this.nome_gruppo___lte = nome_gruppo___lte;
            return this;
        }

        public Builder setNome_gruppo___gt(String nome_gruppo___gt) {
            this.nome_gruppo___gt = nome_gruppo___gt;
            return this;
        }

        public Builder setNome_gruppo___gte(String nome_gruppo___gte) {
            this.nome_gruppo___gte = nome_gruppo___gte;
            return this;
        }

        public Builder setNome_gruppo___contains(String nome_gruppo___contains) {
            this.nome_gruppo___contains = nome_gruppo___contains;
            return this;
        }

        public Builder setNome_gruppo___not___contains(String nome_gruppo___not___contains) {
            this.nome_gruppo___not___contains = nome_gruppo___not___contains;
            return this;
        }

        public Builder setNome_gruppo___starts_with(String nome_gruppo___starts_with) {
            this.nome_gruppo___starts_with = nome_gruppo___starts_with;
            return this;
        }

        public Builder setNome_gruppo___not___starts_with(String nome_gruppo___not___starts_with) {
            this.nome_gruppo___not___starts_with = nome_gruppo___not___starts_with;
            return this;
        }

        public Builder setNome_gruppo___ends_with(String nome_gruppo___ends_with) {
            this.nome_gruppo___ends_with = nome_gruppo___ends_with;
            return this;
        }

        public Builder setNome_gruppo___not___ends_with(String nome_gruppo___not___ends_with) {
            this.nome_gruppo___not___ends_with = nome_gruppo___not___ends_with;
            return this;
        }

        public Builder setPride___eq(Boolean pride___eq) {
            this.pride___eq = pride___eq;
            return this;
        }

        public Builder setPride___ne(Boolean pride___ne) {
            this.pride___ne = pride___ne;
            return this;
        }

        public Builder setPride___null(Boolean pride___null) {
            this.pride___null = pride___null;
            return this;
        }

        public Builder setPride___not___null(Boolean pride___not___null) {
            this.pride___not___null = pride___not___null;
            return this;
        }

        public Builder setSottogruppo___eq(String sottogruppo___eq) {
            this.sottogruppo___eq = sottogruppo___eq;
            return this;
        }

        public Builder setSottogruppo___ne(String sottogruppo___ne) {
            this.sottogruppo___ne = sottogruppo___ne;
            return this;
        }

        public Builder setSottogruppo___null(Boolean sottogruppo___null) {
            this.sottogruppo___null = sottogruppo___null;
            return this;
        }

        public Builder setSottogruppo___not___null(Boolean sottogruppo___not___null) {
            this.sottogruppo___not___null = sottogruppo___not___null;
            return this;
        }

        public Builder setSottogruppo___in(java.util.List<String> sottogruppo___in) {
            this.sottogruppo___in = sottogruppo___in;
            return this;
        }

        public Builder setSottogruppo___not___in(java.util.List<String> sottogruppo___not___in) {
            this.sottogruppo___not___in = sottogruppo___not___in;
            return this;
        }

        public Builder setSottogruppo___lt(String sottogruppo___lt) {
            this.sottogruppo___lt = sottogruppo___lt;
            return this;
        }

        public Builder setSottogruppo___lte(String sottogruppo___lte) {
            this.sottogruppo___lte = sottogruppo___lte;
            return this;
        }

        public Builder setSottogruppo___gt(String sottogruppo___gt) {
            this.sottogruppo___gt = sottogruppo___gt;
            return this;
        }

        public Builder setSottogruppo___gte(String sottogruppo___gte) {
            this.sottogruppo___gte = sottogruppo___gte;
            return this;
        }

        public Builder setSottogruppo___contains(String sottogruppo___contains) {
            this.sottogruppo___contains = sottogruppo___contains;
            return this;
        }

        public Builder setSottogruppo___not___contains(String sottogruppo___not___contains) {
            this.sottogruppo___not___contains = sottogruppo___not___contains;
            return this;
        }

        public Builder setSottogruppo___starts_with(String sottogruppo___starts_with) {
            this.sottogruppo___starts_with = sottogruppo___starts_with;
            return this;
        }

        public Builder setSottogruppo___not___starts_with(String sottogruppo___not___starts_with) {
            this.sottogruppo___not___starts_with = sottogruppo___not___starts_with;
            return this;
        }

        public Builder setSottogruppo___ends_with(String sottogruppo___ends_with) {
            this.sottogruppo___ends_with = sottogruppo___ends_with;
            return this;
        }

        public Builder setSottogruppo___not___ends_with(String sottogruppo___not___ends_with) {
            this.sottogruppo___not___ends_with = sottogruppo___not___ends_with;
            return this;
        }

        public Builder setVisualizzato___eq(Integer visualizzato___eq) {
            this.visualizzato___eq = visualizzato___eq;
            return this;
        }

        public Builder setVisualizzato___ne(Integer visualizzato___ne) {
            this.visualizzato___ne = visualizzato___ne;
            return this;
        }

        public Builder setVisualizzato___null(Boolean visualizzato___null) {
            this.visualizzato___null = visualizzato___null;
            return this;
        }

        public Builder setVisualizzato___not___null(Boolean visualizzato___not___null) {
            this.visualizzato___not___null = visualizzato___not___null;
            return this;
        }

        public Builder setVisualizzato___in(java.util.List<Integer> visualizzato___in) {
            this.visualizzato___in = visualizzato___in;
            return this;
        }

        public Builder setVisualizzato___not___in(java.util.List<Integer> visualizzato___not___in) {
            this.visualizzato___not___in = visualizzato___not___in;
            return this;
        }

        public Builder setVisualizzato___lt(Integer visualizzato___lt) {
            this.visualizzato___lt = visualizzato___lt;
            return this;
        }

        public Builder setVisualizzato___lte(Integer visualizzato___lte) {
            this.visualizzato___lte = visualizzato___lte;
            return this;
        }

        public Builder setVisualizzato___gt(Integer visualizzato___gt) {
            this.visualizzato___gt = visualizzato___gt;
            return this;
        }

        public Builder setVisualizzato___gte(Integer visualizzato___gte) {
            this.visualizzato___gte = visualizzato___gte;
            return this;
        }

        public Builder setAND(java.util.List<CliMotivazione_fine_ARVFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliMotivazione_fine_ARVFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliMotivazione_fine_ARVFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliMotivazione_fine_ARVFilterDTO build() {
            CliMotivazione_fine_ARVFilterDTO result = new CliMotivazione_fine_ARVFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
            result.set_createdby___eq(this._createdby___eq);
            result.set_createdby___ne(this._createdby___ne);
            result.set_createdby___null(this._createdby___null);
            result.set_createdby___not___null(this._createdby___not___null);
            result.set_createdby___in(this._createdby___in);
            result.set_createdby___not___in(this._createdby___not___in);
            result.set_createdby___lt(this._createdby___lt);
            result.set_createdby___lte(this._createdby___lte);
            result.set_createdby___gt(this._createdby___gt);
            result.set_createdby___gte(this._createdby___gte);
            result.set_createdby___contains(this._createdby___contains);
            result.set_createdby___not___contains(this._createdby___not___contains);
            result.set_createdby___starts_with(this._createdby___starts_with);
            result.set_createdby___not___starts_with(this._createdby___not___starts_with);
            result.set_createdby___ends_with(this._createdby___ends_with);
            result.set_createdby___not___ends_with(this._createdby___not___ends_with);
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
            result.set_lastmodifiedby___eq(this._lastmodifiedby___eq);
            result.set_lastmodifiedby___ne(this._lastmodifiedby___ne);
            result.set_lastmodifiedby___null(this._lastmodifiedby___null);
            result.set_lastmodifiedby___not___null(this._lastmodifiedby___not___null);
            result.set_lastmodifiedby___in(this._lastmodifiedby___in);
            result.set_lastmodifiedby___not___in(this._lastmodifiedby___not___in);
            result.set_lastmodifiedby___lt(this._lastmodifiedby___lt);
            result.set_lastmodifiedby___lte(this._lastmodifiedby___lte);
            result.set_lastmodifiedby___gt(this._lastmodifiedby___gt);
            result.set_lastmodifiedby___gte(this._lastmodifiedby___gte);
            result.set_lastmodifiedby___contains(this._lastmodifiedby___contains);
            result.set_lastmodifiedby___not___contains(this._lastmodifiedby___not___contains);
            result.set_lastmodifiedby___starts_with(this._lastmodifiedby___starts_with);
            result.set_lastmodifiedby___not___starts_with(this._lastmodifiedby___not___starts_with);
            result.set_lastmodifiedby___ends_with(this._lastmodifiedby___ends_with);
            result.set_lastmodifiedby___not___ends_with(this._lastmodifiedby___not___ends_with);
            result.set_lastmodifiedon___eq(this._lastmodifiedon___eq);
            result.set_lastmodifiedon___ne(this._lastmodifiedon___ne);
            result.set_lastmodifiedon___null(this._lastmodifiedon___null);
            result.set_lastmodifiedon___not___null(this._lastmodifiedon___not___null);
            result.set_lastmodifiedon___in(this._lastmodifiedon___in);
            result.set_lastmodifiedon___not___in(this._lastmodifiedon___not___in);
            result.set_lastmodifiedon___lt(this._lastmodifiedon___lt);
            result.set_lastmodifiedon___lte(this._lastmodifiedon___lte);
            result.set_lastmodifiedon___gt(this._lastmodifiedon___gt);
            result.set_lastmodifiedon___gte(this._lastmodifiedon___gte);
            result.set_ownedby___eq(this._ownedby___eq);
            result.set_ownedby___ne(this._ownedby___ne);
            result.set_ownedby___null(this._ownedby___null);
            result.set_ownedby___not___null(this._ownedby___not___null);
            result.set_ownedby___in(this._ownedby___in);
            result.set_ownedby___not___in(this._ownedby___not___in);
            result.set_ownedby___lt(this._ownedby___lt);
            result.set_ownedby___lte(this._ownedby___lte);
            result.set_ownedby___gt(this._ownedby___gt);
            result.set_ownedby___gte(this._ownedby___gte);
            result.set_ownedby___contains(this._ownedby___contains);
            result.set_ownedby___not___contains(this._ownedby___not___contains);
            result.set_ownedby___starts_with(this._ownedby___starts_with);
            result.set_ownedby___not___starts_with(this._ownedby___not___starts_with);
            result.set_ownedby___ends_with(this._ownedby___ends_with);
            result.set_ownedby___not___ends_with(this._ownedby___not___ends_with);
            result.set_ownedon___eq(this._ownedon___eq);
            result.set_ownedon___ne(this._ownedon___ne);
            result.set_ownedon___null(this._ownedon___null);
            result.set_ownedon___not___null(this._ownedon___not___null);
            result.set_ownedon___in(this._ownedon___in);
            result.set_ownedon___not___in(this._ownedon___not___in);
            result.set_ownedon___lt(this._ownedon___lt);
            result.set_ownedon___lte(this._ownedon___lte);
            result.set_ownedon___gt(this._ownedon___gt);
            result.set_ownedon___gte(this._ownedon___gte);
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
            result.setCodice_DAD___eq(this.codice_DAD___eq);
            result.setCodice_DAD___ne(this.codice_DAD___ne);
            result.setCodice_DAD___null(this.codice_DAD___null);
            result.setCodice_DAD___not___null(this.codice_DAD___not___null);
            result.setCodice_DAD___in(this.codice_DAD___in);
            result.setCodice_DAD___not___in(this.codice_DAD___not___in);
            result.setCodice_DAD___lt(this.codice_DAD___lt);
            result.setCodice_DAD___lte(this.codice_DAD___lte);
            result.setCodice_DAD___gt(this.codice_DAD___gt);
            result.setCodice_DAD___gte(this.codice_DAD___gte);
            result.setCodice_DAD___contains(this.codice_DAD___contains);
            result.setCodice_DAD___not___contains(this.codice_DAD___not___contains);
            result.setCodice_DAD___starts_with(this.codice_DAD___starts_with);
            result.setCodice_DAD___not___starts_with(this.codice_DAD___not___starts_with);
            result.setCodice_DAD___ends_with(this.codice_DAD___ends_with);
            result.setCodice_DAD___not___ends_with(this.codice_DAD___not___ends_with);
            result.setGruppo___eq(this.gruppo___eq);
            result.setGruppo___ne(this.gruppo___ne);
            result.setGruppo___null(this.gruppo___null);
            result.setGruppo___not___null(this.gruppo___not___null);
            result.setGruppo___in(this.gruppo___in);
            result.setGruppo___not___in(this.gruppo___not___in);
            result.setGruppo___lt(this.gruppo___lt);
            result.setGruppo___lte(this.gruppo___lte);
            result.setGruppo___gt(this.gruppo___gt);
            result.setGruppo___gte(this.gruppo___gte);
            result.setGruppo___contains(this.gruppo___contains);
            result.setGruppo___not___contains(this.gruppo___not___contains);
            result.setGruppo___starts_with(this.gruppo___starts_with);
            result.setGruppo___not___starts_with(this.gruppo___not___starts_with);
            result.setGruppo___ends_with(this.gruppo___ends_with);
            result.setGruppo___not___ends_with(this.gruppo___not___ends_with);
            result.setIco___eq(this.ico___eq);
            result.setIco___ne(this.ico___ne);
            result.setIco___null(this.ico___null);
            result.setIco___not___null(this.ico___not___null);
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
            result.setNome_completo___eq(this.nome_completo___eq);
            result.setNome_completo___ne(this.nome_completo___ne);
            result.setNome_completo___null(this.nome_completo___null);
            result.setNome_completo___not___null(this.nome_completo___not___null);
            result.setNome_completo___in(this.nome_completo___in);
            result.setNome_completo___not___in(this.nome_completo___not___in);
            result.setNome_completo___lt(this.nome_completo___lt);
            result.setNome_completo___lte(this.nome_completo___lte);
            result.setNome_completo___gt(this.nome_completo___gt);
            result.setNome_completo___gte(this.nome_completo___gte);
            result.setNome_completo___contains(this.nome_completo___contains);
            result.setNome_completo___not___contains(this.nome_completo___not___contains);
            result.setNome_completo___starts_with(this.nome_completo___starts_with);
            result.setNome_completo___not___starts_with(this.nome_completo___not___starts_with);
            result.setNome_completo___ends_with(this.nome_completo___ends_with);
            result.setNome_completo___not___ends_with(this.nome_completo___not___ends_with);
            result.setNome_gruppo___eq(this.nome_gruppo___eq);
            result.setNome_gruppo___ne(this.nome_gruppo___ne);
            result.setNome_gruppo___null(this.nome_gruppo___null);
            result.setNome_gruppo___not___null(this.nome_gruppo___not___null);
            result.setNome_gruppo___in(this.nome_gruppo___in);
            result.setNome_gruppo___not___in(this.nome_gruppo___not___in);
            result.setNome_gruppo___lt(this.nome_gruppo___lt);
            result.setNome_gruppo___lte(this.nome_gruppo___lte);
            result.setNome_gruppo___gt(this.nome_gruppo___gt);
            result.setNome_gruppo___gte(this.nome_gruppo___gte);
            result.setNome_gruppo___contains(this.nome_gruppo___contains);
            result.setNome_gruppo___not___contains(this.nome_gruppo___not___contains);
            result.setNome_gruppo___starts_with(this.nome_gruppo___starts_with);
            result.setNome_gruppo___not___starts_with(this.nome_gruppo___not___starts_with);
            result.setNome_gruppo___ends_with(this.nome_gruppo___ends_with);
            result.setNome_gruppo___not___ends_with(this.nome_gruppo___not___ends_with);
            result.setPride___eq(this.pride___eq);
            result.setPride___ne(this.pride___ne);
            result.setPride___null(this.pride___null);
            result.setPride___not___null(this.pride___not___null);
            result.setSottogruppo___eq(this.sottogruppo___eq);
            result.setSottogruppo___ne(this.sottogruppo___ne);
            result.setSottogruppo___null(this.sottogruppo___null);
            result.setSottogruppo___not___null(this.sottogruppo___not___null);
            result.setSottogruppo___in(this.sottogruppo___in);
            result.setSottogruppo___not___in(this.sottogruppo___not___in);
            result.setSottogruppo___lt(this.sottogruppo___lt);
            result.setSottogruppo___lte(this.sottogruppo___lte);
            result.setSottogruppo___gt(this.sottogruppo___gt);
            result.setSottogruppo___gte(this.sottogruppo___gte);
            result.setSottogruppo___contains(this.sottogruppo___contains);
            result.setSottogruppo___not___contains(this.sottogruppo___not___contains);
            result.setSottogruppo___starts_with(this.sottogruppo___starts_with);
            result.setSottogruppo___not___starts_with(this.sottogruppo___not___starts_with);
            result.setSottogruppo___ends_with(this.sottogruppo___ends_with);
            result.setSottogruppo___not___ends_with(this.sottogruppo___not___ends_with);
            result.setVisualizzato___eq(this.visualizzato___eq);
            result.setVisualizzato___ne(this.visualizzato___ne);
            result.setVisualizzato___null(this.visualizzato___null);
            result.setVisualizzato___not___null(this.visualizzato___not___null);
            result.setVisualizzato___in(this.visualizzato___in);
            result.setVisualizzato___not___in(this.visualizzato___not___in);
            result.setVisualizzato___lt(this.visualizzato___lt);
            result.setVisualizzato___lte(this.visualizzato___lte);
            result.setVisualizzato___gt(this.visualizzato___gt);
            result.setVisualizzato___gte(this.visualizzato___gte);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
