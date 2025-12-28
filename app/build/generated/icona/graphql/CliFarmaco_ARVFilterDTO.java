package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Farmaco_ARV.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliFarmaco_ARVFilterDTO implements java.io.Serializable {

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
    private Integer anno_generico___eq;
    private Integer anno_generico___ne;
    private Boolean anno_generico___null;
    private Boolean anno_generico___not___null;
    private java.util.List<Integer> anno_generico___in;
    private java.util.List<Integer> anno_generico___not___in;
    private Integer anno_generico___lt;
    private Integer anno_generico___lte;
    private Integer anno_generico___gt;
    private Integer anno_generico___gte;
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
    private String componenti___eq;
    private String componenti___ne;
    private Boolean componenti___null;
    private Boolean componenti___not___null;
    private java.util.List<String> componenti___in;
    private java.util.List<String> componenti___not___in;
    private String componenti___lt;
    private String componenti___lte;
    private String componenti___gt;
    private String componenti___gte;
    private String componenti___contains;
    private String componenti___not___contains;
    private String componenti___starts_with;
    private String componenti___not___starts_with;
    private String componenti___ends_with;
    private String componenti___not___ends_with;
    private Boolean generico___eq;
    private Boolean generico___ne;
    private Boolean generico___null;
    private Boolean generico___not___null;
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
    private String nome_tipo___eq;
    private String nome_tipo___ne;
    private Boolean nome_tipo___null;
    private Boolean nome_tipo___not___null;
    private java.util.List<String> nome_tipo___in;
    private java.util.List<String> nome_tipo___not___in;
    private String nome_tipo___lt;
    private String nome_tipo___lte;
    private String nome_tipo___gt;
    private String nome_tipo___gte;
    private String nome_tipo___contains;
    private String nome_tipo___not___contains;
    private String nome_tipo___starts_with;
    private String nome_tipo___not___starts_with;
    private String nome_tipo___ends_with;
    private String nome_tipo___not___ends_with;
    private Boolean obsoleto___eq;
    private Boolean obsoleto___ne;
    private Boolean obsoleto___null;
    private Boolean obsoleto___not___null;
    private Boolean posologia___eq;
    private Boolean posologia___ne;
    private Boolean posologia___null;
    private Boolean posologia___not___null;
    private Boolean prep___eq;
    private Boolean prep___ne;
    private Boolean prep___null;
    private Boolean prep___not___null;
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
    private Integer tipo___eq;
    private Integer tipo___ne;
    private Boolean tipo___null;
    private Boolean tipo___not___null;
    private java.util.List<Integer> tipo___in;
    private java.util.List<Integer> tipo___not___in;
    private Integer tipo___lt;
    private Integer tipo___lte;
    private Integer tipo___gt;
    private Integer tipo___gte;
    private java.util.List<CliFarmaco_ARVFilterDTO> AND;
    private java.util.List<CliFarmaco_ARVFilterDTO> OR;
    private CliFarmaco_ARVFilterDTO NOT;

    public CliFarmaco_ARVFilterDTO() {
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

    public Integer getAnno_generico___eq() {
        return anno_generico___eq;
    }
    public void setAnno_generico___eq(Integer anno_generico___eq) {
        this.anno_generico___eq = anno_generico___eq;
    }

    public Integer getAnno_generico___ne() {
        return anno_generico___ne;
    }
    public void setAnno_generico___ne(Integer anno_generico___ne) {
        this.anno_generico___ne = anno_generico___ne;
    }

    public Boolean getAnno_generico___null() {
        return anno_generico___null;
    }
    public void setAnno_generico___null(Boolean anno_generico___null) {
        this.anno_generico___null = anno_generico___null;
    }

    public Boolean getAnno_generico___not___null() {
        return anno_generico___not___null;
    }
    public void setAnno_generico___not___null(Boolean anno_generico___not___null) {
        this.anno_generico___not___null = anno_generico___not___null;
    }

    public java.util.List<Integer> getAnno_generico___in() {
        return anno_generico___in;
    }
    public void setAnno_generico___in(java.util.List<Integer> anno_generico___in) {
        this.anno_generico___in = anno_generico___in;
    }

    public java.util.List<Integer> getAnno_generico___not___in() {
        return anno_generico___not___in;
    }
    public void setAnno_generico___not___in(java.util.List<Integer> anno_generico___not___in) {
        this.anno_generico___not___in = anno_generico___not___in;
    }

    public Integer getAnno_generico___lt() {
        return anno_generico___lt;
    }
    public void setAnno_generico___lt(Integer anno_generico___lt) {
        this.anno_generico___lt = anno_generico___lt;
    }

    public Integer getAnno_generico___lte() {
        return anno_generico___lte;
    }
    public void setAnno_generico___lte(Integer anno_generico___lte) {
        this.anno_generico___lte = anno_generico___lte;
    }

    public Integer getAnno_generico___gt() {
        return anno_generico___gt;
    }
    public void setAnno_generico___gt(Integer anno_generico___gt) {
        this.anno_generico___gt = anno_generico___gt;
    }

    public Integer getAnno_generico___gte() {
        return anno_generico___gte;
    }
    public void setAnno_generico___gte(Integer anno_generico___gte) {
        this.anno_generico___gte = anno_generico___gte;
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

    public String getComponenti___eq() {
        return componenti___eq;
    }
    public void setComponenti___eq(String componenti___eq) {
        this.componenti___eq = componenti___eq;
    }

    public String getComponenti___ne() {
        return componenti___ne;
    }
    public void setComponenti___ne(String componenti___ne) {
        this.componenti___ne = componenti___ne;
    }

    public Boolean getComponenti___null() {
        return componenti___null;
    }
    public void setComponenti___null(Boolean componenti___null) {
        this.componenti___null = componenti___null;
    }

    public Boolean getComponenti___not___null() {
        return componenti___not___null;
    }
    public void setComponenti___not___null(Boolean componenti___not___null) {
        this.componenti___not___null = componenti___not___null;
    }

    public java.util.List<String> getComponenti___in() {
        return componenti___in;
    }
    public void setComponenti___in(java.util.List<String> componenti___in) {
        this.componenti___in = componenti___in;
    }

    public java.util.List<String> getComponenti___not___in() {
        return componenti___not___in;
    }
    public void setComponenti___not___in(java.util.List<String> componenti___not___in) {
        this.componenti___not___in = componenti___not___in;
    }

    public String getComponenti___lt() {
        return componenti___lt;
    }
    public void setComponenti___lt(String componenti___lt) {
        this.componenti___lt = componenti___lt;
    }

    public String getComponenti___lte() {
        return componenti___lte;
    }
    public void setComponenti___lte(String componenti___lte) {
        this.componenti___lte = componenti___lte;
    }

    public String getComponenti___gt() {
        return componenti___gt;
    }
    public void setComponenti___gt(String componenti___gt) {
        this.componenti___gt = componenti___gt;
    }

    public String getComponenti___gte() {
        return componenti___gte;
    }
    public void setComponenti___gte(String componenti___gte) {
        this.componenti___gte = componenti___gte;
    }

    public String getComponenti___contains() {
        return componenti___contains;
    }
    public void setComponenti___contains(String componenti___contains) {
        this.componenti___contains = componenti___contains;
    }

    public String getComponenti___not___contains() {
        return componenti___not___contains;
    }
    public void setComponenti___not___contains(String componenti___not___contains) {
        this.componenti___not___contains = componenti___not___contains;
    }

    public String getComponenti___starts_with() {
        return componenti___starts_with;
    }
    public void setComponenti___starts_with(String componenti___starts_with) {
        this.componenti___starts_with = componenti___starts_with;
    }

    public String getComponenti___not___starts_with() {
        return componenti___not___starts_with;
    }
    public void setComponenti___not___starts_with(String componenti___not___starts_with) {
        this.componenti___not___starts_with = componenti___not___starts_with;
    }

    public String getComponenti___ends_with() {
        return componenti___ends_with;
    }
    public void setComponenti___ends_with(String componenti___ends_with) {
        this.componenti___ends_with = componenti___ends_with;
    }

    public String getComponenti___not___ends_with() {
        return componenti___not___ends_with;
    }
    public void setComponenti___not___ends_with(String componenti___not___ends_with) {
        this.componenti___not___ends_with = componenti___not___ends_with;
    }

    public Boolean getGenerico___eq() {
        return generico___eq;
    }
    public void setGenerico___eq(Boolean generico___eq) {
        this.generico___eq = generico___eq;
    }

    public Boolean getGenerico___ne() {
        return generico___ne;
    }
    public void setGenerico___ne(Boolean generico___ne) {
        this.generico___ne = generico___ne;
    }

    public Boolean getGenerico___null() {
        return generico___null;
    }
    public void setGenerico___null(Boolean generico___null) {
        this.generico___null = generico___null;
    }

    public Boolean getGenerico___not___null() {
        return generico___not___null;
    }
    public void setGenerico___not___null(Boolean generico___not___null) {
        this.generico___not___null = generico___not___null;
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

    public String getNome_tipo___eq() {
        return nome_tipo___eq;
    }
    public void setNome_tipo___eq(String nome_tipo___eq) {
        this.nome_tipo___eq = nome_tipo___eq;
    }

    public String getNome_tipo___ne() {
        return nome_tipo___ne;
    }
    public void setNome_tipo___ne(String nome_tipo___ne) {
        this.nome_tipo___ne = nome_tipo___ne;
    }

    public Boolean getNome_tipo___null() {
        return nome_tipo___null;
    }
    public void setNome_tipo___null(Boolean nome_tipo___null) {
        this.nome_tipo___null = nome_tipo___null;
    }

    public Boolean getNome_tipo___not___null() {
        return nome_tipo___not___null;
    }
    public void setNome_tipo___not___null(Boolean nome_tipo___not___null) {
        this.nome_tipo___not___null = nome_tipo___not___null;
    }

    public java.util.List<String> getNome_tipo___in() {
        return nome_tipo___in;
    }
    public void setNome_tipo___in(java.util.List<String> nome_tipo___in) {
        this.nome_tipo___in = nome_tipo___in;
    }

    public java.util.List<String> getNome_tipo___not___in() {
        return nome_tipo___not___in;
    }
    public void setNome_tipo___not___in(java.util.List<String> nome_tipo___not___in) {
        this.nome_tipo___not___in = nome_tipo___not___in;
    }

    public String getNome_tipo___lt() {
        return nome_tipo___lt;
    }
    public void setNome_tipo___lt(String nome_tipo___lt) {
        this.nome_tipo___lt = nome_tipo___lt;
    }

    public String getNome_tipo___lte() {
        return nome_tipo___lte;
    }
    public void setNome_tipo___lte(String nome_tipo___lte) {
        this.nome_tipo___lte = nome_tipo___lte;
    }

    public String getNome_tipo___gt() {
        return nome_tipo___gt;
    }
    public void setNome_tipo___gt(String nome_tipo___gt) {
        this.nome_tipo___gt = nome_tipo___gt;
    }

    public String getNome_tipo___gte() {
        return nome_tipo___gte;
    }
    public void setNome_tipo___gte(String nome_tipo___gte) {
        this.nome_tipo___gte = nome_tipo___gte;
    }

    public String getNome_tipo___contains() {
        return nome_tipo___contains;
    }
    public void setNome_tipo___contains(String nome_tipo___contains) {
        this.nome_tipo___contains = nome_tipo___contains;
    }

    public String getNome_tipo___not___contains() {
        return nome_tipo___not___contains;
    }
    public void setNome_tipo___not___contains(String nome_tipo___not___contains) {
        this.nome_tipo___not___contains = nome_tipo___not___contains;
    }

    public String getNome_tipo___starts_with() {
        return nome_tipo___starts_with;
    }
    public void setNome_tipo___starts_with(String nome_tipo___starts_with) {
        this.nome_tipo___starts_with = nome_tipo___starts_with;
    }

    public String getNome_tipo___not___starts_with() {
        return nome_tipo___not___starts_with;
    }
    public void setNome_tipo___not___starts_with(String nome_tipo___not___starts_with) {
        this.nome_tipo___not___starts_with = nome_tipo___not___starts_with;
    }

    public String getNome_tipo___ends_with() {
        return nome_tipo___ends_with;
    }
    public void setNome_tipo___ends_with(String nome_tipo___ends_with) {
        this.nome_tipo___ends_with = nome_tipo___ends_with;
    }

    public String getNome_tipo___not___ends_with() {
        return nome_tipo___not___ends_with;
    }
    public void setNome_tipo___not___ends_with(String nome_tipo___not___ends_with) {
        this.nome_tipo___not___ends_with = nome_tipo___not___ends_with;
    }

    public Boolean getObsoleto___eq() {
        return obsoleto___eq;
    }
    public void setObsoleto___eq(Boolean obsoleto___eq) {
        this.obsoleto___eq = obsoleto___eq;
    }

    public Boolean getObsoleto___ne() {
        return obsoleto___ne;
    }
    public void setObsoleto___ne(Boolean obsoleto___ne) {
        this.obsoleto___ne = obsoleto___ne;
    }

    public Boolean getObsoleto___null() {
        return obsoleto___null;
    }
    public void setObsoleto___null(Boolean obsoleto___null) {
        this.obsoleto___null = obsoleto___null;
    }

    public Boolean getObsoleto___not___null() {
        return obsoleto___not___null;
    }
    public void setObsoleto___not___null(Boolean obsoleto___not___null) {
        this.obsoleto___not___null = obsoleto___not___null;
    }

    public Boolean getPosologia___eq() {
        return posologia___eq;
    }
    public void setPosologia___eq(Boolean posologia___eq) {
        this.posologia___eq = posologia___eq;
    }

    public Boolean getPosologia___ne() {
        return posologia___ne;
    }
    public void setPosologia___ne(Boolean posologia___ne) {
        this.posologia___ne = posologia___ne;
    }

    public Boolean getPosologia___null() {
        return posologia___null;
    }
    public void setPosologia___null(Boolean posologia___null) {
        this.posologia___null = posologia___null;
    }

    public Boolean getPosologia___not___null() {
        return posologia___not___null;
    }
    public void setPosologia___not___null(Boolean posologia___not___null) {
        this.posologia___not___null = posologia___not___null;
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

    public Integer getTipo___eq() {
        return tipo___eq;
    }
    public void setTipo___eq(Integer tipo___eq) {
        this.tipo___eq = tipo___eq;
    }

    public Integer getTipo___ne() {
        return tipo___ne;
    }
    public void setTipo___ne(Integer tipo___ne) {
        this.tipo___ne = tipo___ne;
    }

    public Boolean getTipo___null() {
        return tipo___null;
    }
    public void setTipo___null(Boolean tipo___null) {
        this.tipo___null = tipo___null;
    }

    public Boolean getTipo___not___null() {
        return tipo___not___null;
    }
    public void setTipo___not___null(Boolean tipo___not___null) {
        this.tipo___not___null = tipo___not___null;
    }

    public java.util.List<Integer> getTipo___in() {
        return tipo___in;
    }
    public void setTipo___in(java.util.List<Integer> tipo___in) {
        this.tipo___in = tipo___in;
    }

    public java.util.List<Integer> getTipo___not___in() {
        return tipo___not___in;
    }
    public void setTipo___not___in(java.util.List<Integer> tipo___not___in) {
        this.tipo___not___in = tipo___not___in;
    }

    public Integer getTipo___lt() {
        return tipo___lt;
    }
    public void setTipo___lt(Integer tipo___lt) {
        this.tipo___lt = tipo___lt;
    }

    public Integer getTipo___lte() {
        return tipo___lte;
    }
    public void setTipo___lte(Integer tipo___lte) {
        this.tipo___lte = tipo___lte;
    }

    public Integer getTipo___gt() {
        return tipo___gt;
    }
    public void setTipo___gt(Integer tipo___gt) {
        this.tipo___gt = tipo___gt;
    }

    public Integer getTipo___gte() {
        return tipo___gte;
    }
    public void setTipo___gte(Integer tipo___gte) {
        this.tipo___gte = tipo___gte;
    }

    public java.util.List<CliFarmaco_ARVFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliFarmaco_ARVFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliFarmaco_ARVFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliFarmaco_ARVFilterDTO> OR) {
        this.OR = OR;
    }

    public CliFarmaco_ARVFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliFarmaco_ARVFilterDTO NOT) {
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
        if (anno_generico___eq != null) {
            joiner.add("anno_generico___eq: " + GraphQLRequestSerializer.getEntry(anno_generico___eq));
        }
        if (anno_generico___ne != null) {
            joiner.add("anno_generico___ne: " + GraphQLRequestSerializer.getEntry(anno_generico___ne));
        }
        if (anno_generico___null != null) {
            joiner.add("anno_generico___null: " + GraphQLRequestSerializer.getEntry(anno_generico___null));
        }
        if (anno_generico___not___null != null) {
            joiner.add("anno_generico___not___null: " + GraphQLRequestSerializer.getEntry(anno_generico___not___null));
        }
        if (anno_generico___in != null) {
            joiner.add("anno_generico___in: " + GraphQLRequestSerializer.getEntry(anno_generico___in));
        }
        if (anno_generico___not___in != null) {
            joiner.add("anno_generico___not___in: " + GraphQLRequestSerializer.getEntry(anno_generico___not___in));
        }
        if (anno_generico___lt != null) {
            joiner.add("anno_generico___lt: " + GraphQLRequestSerializer.getEntry(anno_generico___lt));
        }
        if (anno_generico___lte != null) {
            joiner.add("anno_generico___lte: " + GraphQLRequestSerializer.getEntry(anno_generico___lte));
        }
        if (anno_generico___gt != null) {
            joiner.add("anno_generico___gt: " + GraphQLRequestSerializer.getEntry(anno_generico___gt));
        }
        if (anno_generico___gte != null) {
            joiner.add("anno_generico___gte: " + GraphQLRequestSerializer.getEntry(anno_generico___gte));
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
        if (componenti___eq != null) {
            joiner.add("componenti___eq: " + GraphQLRequestSerializer.getEntry(componenti___eq));
        }
        if (componenti___ne != null) {
            joiner.add("componenti___ne: " + GraphQLRequestSerializer.getEntry(componenti___ne));
        }
        if (componenti___null != null) {
            joiner.add("componenti___null: " + GraphQLRequestSerializer.getEntry(componenti___null));
        }
        if (componenti___not___null != null) {
            joiner.add("componenti___not___null: " + GraphQLRequestSerializer.getEntry(componenti___not___null));
        }
        if (componenti___in != null) {
            joiner.add("componenti___in: " + GraphQLRequestSerializer.getEntry(componenti___in));
        }
        if (componenti___not___in != null) {
            joiner.add("componenti___not___in: " + GraphQLRequestSerializer.getEntry(componenti___not___in));
        }
        if (componenti___lt != null) {
            joiner.add("componenti___lt: " + GraphQLRequestSerializer.getEntry(componenti___lt));
        }
        if (componenti___lte != null) {
            joiner.add("componenti___lte: " + GraphQLRequestSerializer.getEntry(componenti___lte));
        }
        if (componenti___gt != null) {
            joiner.add("componenti___gt: " + GraphQLRequestSerializer.getEntry(componenti___gt));
        }
        if (componenti___gte != null) {
            joiner.add("componenti___gte: " + GraphQLRequestSerializer.getEntry(componenti___gte));
        }
        if (componenti___contains != null) {
            joiner.add("componenti___contains: " + GraphQLRequestSerializer.getEntry(componenti___contains));
        }
        if (componenti___not___contains != null) {
            joiner.add("componenti___not___contains: " + GraphQLRequestSerializer.getEntry(componenti___not___contains));
        }
        if (componenti___starts_with != null) {
            joiner.add("componenti___starts_with: " + GraphQLRequestSerializer.getEntry(componenti___starts_with));
        }
        if (componenti___not___starts_with != null) {
            joiner.add("componenti___not___starts_with: " + GraphQLRequestSerializer.getEntry(componenti___not___starts_with));
        }
        if (componenti___ends_with != null) {
            joiner.add("componenti___ends_with: " + GraphQLRequestSerializer.getEntry(componenti___ends_with));
        }
        if (componenti___not___ends_with != null) {
            joiner.add("componenti___not___ends_with: " + GraphQLRequestSerializer.getEntry(componenti___not___ends_with));
        }
        if (generico___eq != null) {
            joiner.add("generico___eq: " + GraphQLRequestSerializer.getEntry(generico___eq));
        }
        if (generico___ne != null) {
            joiner.add("generico___ne: " + GraphQLRequestSerializer.getEntry(generico___ne));
        }
        if (generico___null != null) {
            joiner.add("generico___null: " + GraphQLRequestSerializer.getEntry(generico___null));
        }
        if (generico___not___null != null) {
            joiner.add("generico___not___null: " + GraphQLRequestSerializer.getEntry(generico___not___null));
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
        if (nome_tipo___eq != null) {
            joiner.add("nome_tipo___eq: " + GraphQLRequestSerializer.getEntry(nome_tipo___eq));
        }
        if (nome_tipo___ne != null) {
            joiner.add("nome_tipo___ne: " + GraphQLRequestSerializer.getEntry(nome_tipo___ne));
        }
        if (nome_tipo___null != null) {
            joiner.add("nome_tipo___null: " + GraphQLRequestSerializer.getEntry(nome_tipo___null));
        }
        if (nome_tipo___not___null != null) {
            joiner.add("nome_tipo___not___null: " + GraphQLRequestSerializer.getEntry(nome_tipo___not___null));
        }
        if (nome_tipo___in != null) {
            joiner.add("nome_tipo___in: " + GraphQLRequestSerializer.getEntry(nome_tipo___in));
        }
        if (nome_tipo___not___in != null) {
            joiner.add("nome_tipo___not___in: " + GraphQLRequestSerializer.getEntry(nome_tipo___not___in));
        }
        if (nome_tipo___lt != null) {
            joiner.add("nome_tipo___lt: " + GraphQLRequestSerializer.getEntry(nome_tipo___lt));
        }
        if (nome_tipo___lte != null) {
            joiner.add("nome_tipo___lte: " + GraphQLRequestSerializer.getEntry(nome_tipo___lte));
        }
        if (nome_tipo___gt != null) {
            joiner.add("nome_tipo___gt: " + GraphQLRequestSerializer.getEntry(nome_tipo___gt));
        }
        if (nome_tipo___gte != null) {
            joiner.add("nome_tipo___gte: " + GraphQLRequestSerializer.getEntry(nome_tipo___gte));
        }
        if (nome_tipo___contains != null) {
            joiner.add("nome_tipo___contains: " + GraphQLRequestSerializer.getEntry(nome_tipo___contains));
        }
        if (nome_tipo___not___contains != null) {
            joiner.add("nome_tipo___not___contains: " + GraphQLRequestSerializer.getEntry(nome_tipo___not___contains));
        }
        if (nome_tipo___starts_with != null) {
            joiner.add("nome_tipo___starts_with: " + GraphQLRequestSerializer.getEntry(nome_tipo___starts_with));
        }
        if (nome_tipo___not___starts_with != null) {
            joiner.add("nome_tipo___not___starts_with: " + GraphQLRequestSerializer.getEntry(nome_tipo___not___starts_with));
        }
        if (nome_tipo___ends_with != null) {
            joiner.add("nome_tipo___ends_with: " + GraphQLRequestSerializer.getEntry(nome_tipo___ends_with));
        }
        if (nome_tipo___not___ends_with != null) {
            joiner.add("nome_tipo___not___ends_with: " + GraphQLRequestSerializer.getEntry(nome_tipo___not___ends_with));
        }
        if (obsoleto___eq != null) {
            joiner.add("obsoleto___eq: " + GraphQLRequestSerializer.getEntry(obsoleto___eq));
        }
        if (obsoleto___ne != null) {
            joiner.add("obsoleto___ne: " + GraphQLRequestSerializer.getEntry(obsoleto___ne));
        }
        if (obsoleto___null != null) {
            joiner.add("obsoleto___null: " + GraphQLRequestSerializer.getEntry(obsoleto___null));
        }
        if (obsoleto___not___null != null) {
            joiner.add("obsoleto___not___null: " + GraphQLRequestSerializer.getEntry(obsoleto___not___null));
        }
        if (posologia___eq != null) {
            joiner.add("posologia___eq: " + GraphQLRequestSerializer.getEntry(posologia___eq));
        }
        if (posologia___ne != null) {
            joiner.add("posologia___ne: " + GraphQLRequestSerializer.getEntry(posologia___ne));
        }
        if (posologia___null != null) {
            joiner.add("posologia___null: " + GraphQLRequestSerializer.getEntry(posologia___null));
        }
        if (posologia___not___null != null) {
            joiner.add("posologia___not___null: " + GraphQLRequestSerializer.getEntry(posologia___not___null));
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
        if (tipo___eq != null) {
            joiner.add("tipo___eq: " + GraphQLRequestSerializer.getEntry(tipo___eq));
        }
        if (tipo___ne != null) {
            joiner.add("tipo___ne: " + GraphQLRequestSerializer.getEntry(tipo___ne));
        }
        if (tipo___null != null) {
            joiner.add("tipo___null: " + GraphQLRequestSerializer.getEntry(tipo___null));
        }
        if (tipo___not___null != null) {
            joiner.add("tipo___not___null: " + GraphQLRequestSerializer.getEntry(tipo___not___null));
        }
        if (tipo___in != null) {
            joiner.add("tipo___in: " + GraphQLRequestSerializer.getEntry(tipo___in));
        }
        if (tipo___not___in != null) {
            joiner.add("tipo___not___in: " + GraphQLRequestSerializer.getEntry(tipo___not___in));
        }
        if (tipo___lt != null) {
            joiner.add("tipo___lt: " + GraphQLRequestSerializer.getEntry(tipo___lt));
        }
        if (tipo___lte != null) {
            joiner.add("tipo___lte: " + GraphQLRequestSerializer.getEntry(tipo___lte));
        }
        if (tipo___gt != null) {
            joiner.add("tipo___gt: " + GraphQLRequestSerializer.getEntry(tipo___gt));
        }
        if (tipo___gte != null) {
            joiner.add("tipo___gte: " + GraphQLRequestSerializer.getEntry(tipo___gte));
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

    public static CliFarmaco_ARVFilterDTO.Builder builder() {
        return new CliFarmaco_ARVFilterDTO.Builder();
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
        private Integer anno_generico___eq;
        private Integer anno_generico___ne;
        private Boolean anno_generico___null;
        private Boolean anno_generico___not___null;
        private java.util.List<Integer> anno_generico___in;
        private java.util.List<Integer> anno_generico___not___in;
        private Integer anno_generico___lt;
        private Integer anno_generico___lte;
        private Integer anno_generico___gt;
        private Integer anno_generico___gte;
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
        private String componenti___eq;
        private String componenti___ne;
        private Boolean componenti___null;
        private Boolean componenti___not___null;
        private java.util.List<String> componenti___in;
        private java.util.List<String> componenti___not___in;
        private String componenti___lt;
        private String componenti___lte;
        private String componenti___gt;
        private String componenti___gte;
        private String componenti___contains;
        private String componenti___not___contains;
        private String componenti___starts_with;
        private String componenti___not___starts_with;
        private String componenti___ends_with;
        private String componenti___not___ends_with;
        private Boolean generico___eq;
        private Boolean generico___ne;
        private Boolean generico___null;
        private Boolean generico___not___null;
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
        private String nome_tipo___eq;
        private String nome_tipo___ne;
        private Boolean nome_tipo___null;
        private Boolean nome_tipo___not___null;
        private java.util.List<String> nome_tipo___in;
        private java.util.List<String> nome_tipo___not___in;
        private String nome_tipo___lt;
        private String nome_tipo___lte;
        private String nome_tipo___gt;
        private String nome_tipo___gte;
        private String nome_tipo___contains;
        private String nome_tipo___not___contains;
        private String nome_tipo___starts_with;
        private String nome_tipo___not___starts_with;
        private String nome_tipo___ends_with;
        private String nome_tipo___not___ends_with;
        private Boolean obsoleto___eq;
        private Boolean obsoleto___ne;
        private Boolean obsoleto___null;
        private Boolean obsoleto___not___null;
        private Boolean posologia___eq;
        private Boolean posologia___ne;
        private Boolean posologia___null;
        private Boolean posologia___not___null;
        private Boolean prep___eq;
        private Boolean prep___ne;
        private Boolean prep___null;
        private Boolean prep___not___null;
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
        private Integer tipo___eq;
        private Integer tipo___ne;
        private Boolean tipo___null;
        private Boolean tipo___not___null;
        private java.util.List<Integer> tipo___in;
        private java.util.List<Integer> tipo___not___in;
        private Integer tipo___lt;
        private Integer tipo___lte;
        private Integer tipo___gt;
        private Integer tipo___gte;
        private java.util.List<CliFarmaco_ARVFilterDTO> AND;
        private java.util.List<CliFarmaco_ARVFilterDTO> OR;
        private CliFarmaco_ARVFilterDTO NOT;

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

        public Builder setAnno_generico___eq(Integer anno_generico___eq) {
            this.anno_generico___eq = anno_generico___eq;
            return this;
        }

        public Builder setAnno_generico___ne(Integer anno_generico___ne) {
            this.anno_generico___ne = anno_generico___ne;
            return this;
        }

        public Builder setAnno_generico___null(Boolean anno_generico___null) {
            this.anno_generico___null = anno_generico___null;
            return this;
        }

        public Builder setAnno_generico___not___null(Boolean anno_generico___not___null) {
            this.anno_generico___not___null = anno_generico___not___null;
            return this;
        }

        public Builder setAnno_generico___in(java.util.List<Integer> anno_generico___in) {
            this.anno_generico___in = anno_generico___in;
            return this;
        }

        public Builder setAnno_generico___not___in(java.util.List<Integer> anno_generico___not___in) {
            this.anno_generico___not___in = anno_generico___not___in;
            return this;
        }

        public Builder setAnno_generico___lt(Integer anno_generico___lt) {
            this.anno_generico___lt = anno_generico___lt;
            return this;
        }

        public Builder setAnno_generico___lte(Integer anno_generico___lte) {
            this.anno_generico___lte = anno_generico___lte;
            return this;
        }

        public Builder setAnno_generico___gt(Integer anno_generico___gt) {
            this.anno_generico___gt = anno_generico___gt;
            return this;
        }

        public Builder setAnno_generico___gte(Integer anno_generico___gte) {
            this.anno_generico___gte = anno_generico___gte;
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

        public Builder setComponenti___eq(String componenti___eq) {
            this.componenti___eq = componenti___eq;
            return this;
        }

        public Builder setComponenti___ne(String componenti___ne) {
            this.componenti___ne = componenti___ne;
            return this;
        }

        public Builder setComponenti___null(Boolean componenti___null) {
            this.componenti___null = componenti___null;
            return this;
        }

        public Builder setComponenti___not___null(Boolean componenti___not___null) {
            this.componenti___not___null = componenti___not___null;
            return this;
        }

        public Builder setComponenti___in(java.util.List<String> componenti___in) {
            this.componenti___in = componenti___in;
            return this;
        }

        public Builder setComponenti___not___in(java.util.List<String> componenti___not___in) {
            this.componenti___not___in = componenti___not___in;
            return this;
        }

        public Builder setComponenti___lt(String componenti___lt) {
            this.componenti___lt = componenti___lt;
            return this;
        }

        public Builder setComponenti___lte(String componenti___lte) {
            this.componenti___lte = componenti___lte;
            return this;
        }

        public Builder setComponenti___gt(String componenti___gt) {
            this.componenti___gt = componenti___gt;
            return this;
        }

        public Builder setComponenti___gte(String componenti___gte) {
            this.componenti___gte = componenti___gte;
            return this;
        }

        public Builder setComponenti___contains(String componenti___contains) {
            this.componenti___contains = componenti___contains;
            return this;
        }

        public Builder setComponenti___not___contains(String componenti___not___contains) {
            this.componenti___not___contains = componenti___not___contains;
            return this;
        }

        public Builder setComponenti___starts_with(String componenti___starts_with) {
            this.componenti___starts_with = componenti___starts_with;
            return this;
        }

        public Builder setComponenti___not___starts_with(String componenti___not___starts_with) {
            this.componenti___not___starts_with = componenti___not___starts_with;
            return this;
        }

        public Builder setComponenti___ends_with(String componenti___ends_with) {
            this.componenti___ends_with = componenti___ends_with;
            return this;
        }

        public Builder setComponenti___not___ends_with(String componenti___not___ends_with) {
            this.componenti___not___ends_with = componenti___not___ends_with;
            return this;
        }

        public Builder setGenerico___eq(Boolean generico___eq) {
            this.generico___eq = generico___eq;
            return this;
        }

        public Builder setGenerico___ne(Boolean generico___ne) {
            this.generico___ne = generico___ne;
            return this;
        }

        public Builder setGenerico___null(Boolean generico___null) {
            this.generico___null = generico___null;
            return this;
        }

        public Builder setGenerico___not___null(Boolean generico___not___null) {
            this.generico___not___null = generico___not___null;
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

        public Builder setNome_tipo___eq(String nome_tipo___eq) {
            this.nome_tipo___eq = nome_tipo___eq;
            return this;
        }

        public Builder setNome_tipo___ne(String nome_tipo___ne) {
            this.nome_tipo___ne = nome_tipo___ne;
            return this;
        }

        public Builder setNome_tipo___null(Boolean nome_tipo___null) {
            this.nome_tipo___null = nome_tipo___null;
            return this;
        }

        public Builder setNome_tipo___not___null(Boolean nome_tipo___not___null) {
            this.nome_tipo___not___null = nome_tipo___not___null;
            return this;
        }

        public Builder setNome_tipo___in(java.util.List<String> nome_tipo___in) {
            this.nome_tipo___in = nome_tipo___in;
            return this;
        }

        public Builder setNome_tipo___not___in(java.util.List<String> nome_tipo___not___in) {
            this.nome_tipo___not___in = nome_tipo___not___in;
            return this;
        }

        public Builder setNome_tipo___lt(String nome_tipo___lt) {
            this.nome_tipo___lt = nome_tipo___lt;
            return this;
        }

        public Builder setNome_tipo___lte(String nome_tipo___lte) {
            this.nome_tipo___lte = nome_tipo___lte;
            return this;
        }

        public Builder setNome_tipo___gt(String nome_tipo___gt) {
            this.nome_tipo___gt = nome_tipo___gt;
            return this;
        }

        public Builder setNome_tipo___gte(String nome_tipo___gte) {
            this.nome_tipo___gte = nome_tipo___gte;
            return this;
        }

        public Builder setNome_tipo___contains(String nome_tipo___contains) {
            this.nome_tipo___contains = nome_tipo___contains;
            return this;
        }

        public Builder setNome_tipo___not___contains(String nome_tipo___not___contains) {
            this.nome_tipo___not___contains = nome_tipo___not___contains;
            return this;
        }

        public Builder setNome_tipo___starts_with(String nome_tipo___starts_with) {
            this.nome_tipo___starts_with = nome_tipo___starts_with;
            return this;
        }

        public Builder setNome_tipo___not___starts_with(String nome_tipo___not___starts_with) {
            this.nome_tipo___not___starts_with = nome_tipo___not___starts_with;
            return this;
        }

        public Builder setNome_tipo___ends_with(String nome_tipo___ends_with) {
            this.nome_tipo___ends_with = nome_tipo___ends_with;
            return this;
        }

        public Builder setNome_tipo___not___ends_with(String nome_tipo___not___ends_with) {
            this.nome_tipo___not___ends_with = nome_tipo___not___ends_with;
            return this;
        }

        public Builder setObsoleto___eq(Boolean obsoleto___eq) {
            this.obsoleto___eq = obsoleto___eq;
            return this;
        }

        public Builder setObsoleto___ne(Boolean obsoleto___ne) {
            this.obsoleto___ne = obsoleto___ne;
            return this;
        }

        public Builder setObsoleto___null(Boolean obsoleto___null) {
            this.obsoleto___null = obsoleto___null;
            return this;
        }

        public Builder setObsoleto___not___null(Boolean obsoleto___not___null) {
            this.obsoleto___not___null = obsoleto___not___null;
            return this;
        }

        public Builder setPosologia___eq(Boolean posologia___eq) {
            this.posologia___eq = posologia___eq;
            return this;
        }

        public Builder setPosologia___ne(Boolean posologia___ne) {
            this.posologia___ne = posologia___ne;
            return this;
        }

        public Builder setPosologia___null(Boolean posologia___null) {
            this.posologia___null = posologia___null;
            return this;
        }

        public Builder setPosologia___not___null(Boolean posologia___not___null) {
            this.posologia___not___null = posologia___not___null;
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

        public Builder setTipo___eq(Integer tipo___eq) {
            this.tipo___eq = tipo___eq;
            return this;
        }

        public Builder setTipo___ne(Integer tipo___ne) {
            this.tipo___ne = tipo___ne;
            return this;
        }

        public Builder setTipo___null(Boolean tipo___null) {
            this.tipo___null = tipo___null;
            return this;
        }

        public Builder setTipo___not___null(Boolean tipo___not___null) {
            this.tipo___not___null = tipo___not___null;
            return this;
        }

        public Builder setTipo___in(java.util.List<Integer> tipo___in) {
            this.tipo___in = tipo___in;
            return this;
        }

        public Builder setTipo___not___in(java.util.List<Integer> tipo___not___in) {
            this.tipo___not___in = tipo___not___in;
            return this;
        }

        public Builder setTipo___lt(Integer tipo___lt) {
            this.tipo___lt = tipo___lt;
            return this;
        }

        public Builder setTipo___lte(Integer tipo___lte) {
            this.tipo___lte = tipo___lte;
            return this;
        }

        public Builder setTipo___gt(Integer tipo___gt) {
            this.tipo___gt = tipo___gt;
            return this;
        }

        public Builder setTipo___gte(Integer tipo___gte) {
            this.tipo___gte = tipo___gte;
            return this;
        }

        public Builder setAND(java.util.List<CliFarmaco_ARVFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliFarmaco_ARVFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliFarmaco_ARVFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliFarmaco_ARVFilterDTO build() {
            CliFarmaco_ARVFilterDTO result = new CliFarmaco_ARVFilterDTO();
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
            result.setAnno_generico___eq(this.anno_generico___eq);
            result.setAnno_generico___ne(this.anno_generico___ne);
            result.setAnno_generico___null(this.anno_generico___null);
            result.setAnno_generico___not___null(this.anno_generico___not___null);
            result.setAnno_generico___in(this.anno_generico___in);
            result.setAnno_generico___not___in(this.anno_generico___not___in);
            result.setAnno_generico___lt(this.anno_generico___lt);
            result.setAnno_generico___lte(this.anno_generico___lte);
            result.setAnno_generico___gt(this.anno_generico___gt);
            result.setAnno_generico___gte(this.anno_generico___gte);
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
            result.setComponenti___eq(this.componenti___eq);
            result.setComponenti___ne(this.componenti___ne);
            result.setComponenti___null(this.componenti___null);
            result.setComponenti___not___null(this.componenti___not___null);
            result.setComponenti___in(this.componenti___in);
            result.setComponenti___not___in(this.componenti___not___in);
            result.setComponenti___lt(this.componenti___lt);
            result.setComponenti___lte(this.componenti___lte);
            result.setComponenti___gt(this.componenti___gt);
            result.setComponenti___gte(this.componenti___gte);
            result.setComponenti___contains(this.componenti___contains);
            result.setComponenti___not___contains(this.componenti___not___contains);
            result.setComponenti___starts_with(this.componenti___starts_with);
            result.setComponenti___not___starts_with(this.componenti___not___starts_with);
            result.setComponenti___ends_with(this.componenti___ends_with);
            result.setComponenti___not___ends_with(this.componenti___not___ends_with);
            result.setGenerico___eq(this.generico___eq);
            result.setGenerico___ne(this.generico___ne);
            result.setGenerico___null(this.generico___null);
            result.setGenerico___not___null(this.generico___not___null);
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
            result.setNome_tipo___eq(this.nome_tipo___eq);
            result.setNome_tipo___ne(this.nome_tipo___ne);
            result.setNome_tipo___null(this.nome_tipo___null);
            result.setNome_tipo___not___null(this.nome_tipo___not___null);
            result.setNome_tipo___in(this.nome_tipo___in);
            result.setNome_tipo___not___in(this.nome_tipo___not___in);
            result.setNome_tipo___lt(this.nome_tipo___lt);
            result.setNome_tipo___lte(this.nome_tipo___lte);
            result.setNome_tipo___gt(this.nome_tipo___gt);
            result.setNome_tipo___gte(this.nome_tipo___gte);
            result.setNome_tipo___contains(this.nome_tipo___contains);
            result.setNome_tipo___not___contains(this.nome_tipo___not___contains);
            result.setNome_tipo___starts_with(this.nome_tipo___starts_with);
            result.setNome_tipo___not___starts_with(this.nome_tipo___not___starts_with);
            result.setNome_tipo___ends_with(this.nome_tipo___ends_with);
            result.setNome_tipo___not___ends_with(this.nome_tipo___not___ends_with);
            result.setObsoleto___eq(this.obsoleto___eq);
            result.setObsoleto___ne(this.obsoleto___ne);
            result.setObsoleto___null(this.obsoleto___null);
            result.setObsoleto___not___null(this.obsoleto___not___null);
            result.setPosologia___eq(this.posologia___eq);
            result.setPosologia___ne(this.posologia___ne);
            result.setPosologia___null(this.posologia___null);
            result.setPosologia___not___null(this.posologia___not___null);
            result.setPrep___eq(this.prep___eq);
            result.setPrep___ne(this.prep___ne);
            result.setPrep___null(this.prep___null);
            result.setPrep___not___null(this.prep___not___null);
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
            result.setTipo___eq(this.tipo___eq);
            result.setTipo___ne(this.tipo___ne);
            result.setTipo___null(this.tipo___null);
            result.setTipo___not___null(this.tipo___not___null);
            result.setTipo___in(this.tipo___in);
            result.setTipo___not___in(this.tipo___not___in);
            result.setTipo___lt(this.tipo___lt);
            result.setTipo___lte(this.tipo___lte);
            result.setTipo___gt(this.tipo___gt);
            result.setTipo___gte(this.tipo___gte);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
