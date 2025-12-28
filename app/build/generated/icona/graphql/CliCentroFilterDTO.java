package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Centro.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliCentroFilterDTO implements java.io.Serializable {

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
    private String addetto___eq;
    private String addetto___ne;
    private Boolean addetto___null;
    private Boolean addetto___not___null;
    private java.util.List<String> addetto___in;
    private java.util.List<String> addetto___not___in;
    private String addetto___lt;
    private String addetto___lte;
    private String addetto___gt;
    private String addetto___gte;
    private String addetto___contains;
    private String addetto___not___contains;
    private String addetto___starts_with;
    private String addetto___not___starts_with;
    private String addetto___ends_with;
    private String addetto___not___ends_with;
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
    private String codice_centro___eq;
    private String codice_centro___ne;
    private Boolean codice_centro___null;
    private Boolean codice_centro___not___null;
    private java.util.List<String> codice_centro___in;
    private java.util.List<String> codice_centro___not___in;
    private String codice_centro___lt;
    private String codice_centro___lte;
    private String codice_centro___gt;
    private String codice_centro___gte;
    private String codice_centro___contains;
    private String codice_centro___not___contains;
    private String codice_centro___starts_with;
    private String codice_centro___not___starts_with;
    private String codice_centro___ends_with;
    private String codice_centro___not___ends_with;
    private String email_pro___eq;
    private String email_pro___ne;
    private Boolean email_pro___null;
    private Boolean email_pro___not___null;
    private java.util.List<String> email_pro___in;
    private java.util.List<String> email_pro___not___in;
    private String email_pro___lt;
    private String email_pro___lte;
    private String email_pro___gt;
    private String email_pro___gte;
    private String email_pro___contains;
    private String email_pro___not___contains;
    private String email_pro___starts_with;
    private String email_pro___not___starts_with;
    private String email_pro___ends_with;
    private String email_pro___not___ends_with;
    private Integer gestione_scelta___eq;
    private Integer gestione_scelta___ne;
    private Boolean gestione_scelta___null;
    private Boolean gestione_scelta___not___null;
    private java.util.List<Integer> gestione_scelta___in;
    private java.util.List<Integer> gestione_scelta___not___in;
    private Integer gestione_scelta___lt;
    private Integer gestione_scelta___lte;
    private Integer gestione_scelta___gt;
    private Integer gestione_scelta___gte;
    private Integer in_elenco___eq;
    private Integer in_elenco___ne;
    private Boolean in_elenco___null;
    private Boolean in_elenco___not___null;
    private java.util.List<Integer> in_elenco___in;
    private java.util.List<Integer> in_elenco___not___in;
    private Integer in_elenco___lt;
    private Integer in_elenco___lte;
    private Integer in_elenco___gt;
    private Integer in_elenco___gte;
    private String indirizzo___eq;
    private String indirizzo___ne;
    private Boolean indirizzo___null;
    private Boolean indirizzo___not___null;
    private java.util.List<String> indirizzo___in;
    private java.util.List<String> indirizzo___not___in;
    private String indirizzo___lt;
    private String indirizzo___lte;
    private String indirizzo___gt;
    private String indirizzo___gte;
    private String indirizzo___contains;
    private String indirizzo___not___contains;
    private String indirizzo___starts_with;
    private String indirizzo___not___starts_with;
    private String indirizzo___ends_with;
    private String indirizzo___not___ends_with;
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
    private String primario___eq;
    private String primario___ne;
    private Boolean primario___null;
    private Boolean primario___not___null;
    private java.util.List<String> primario___in;
    private java.util.List<String> primario___not___in;
    private String primario___lt;
    private String primario___lte;
    private String primario___gt;
    private String primario___gte;
    private String primario___contains;
    private String primario___not___contains;
    private String primario___starts_with;
    private String primario___not___starts_with;
    private String primario___ends_with;
    private String primario___not___ends_with;
    private String telefono___eq;
    private String telefono___ne;
    private Boolean telefono___null;
    private Boolean telefono___not___null;
    private java.util.List<String> telefono___in;
    private java.util.List<String> telefono___not___in;
    private String telefono___lt;
    private String telefono___lte;
    private String telefono___gt;
    private String telefono___gte;
    private String telefono___contains;
    private String telefono___not___contains;
    private String telefono___starts_with;
    private String telefono___not___starts_with;
    private String telefono___ends_with;
    private String telefono___not___ends_with;
    private String trasferimento_a_centro___eq;
    private String trasferimento_a_centro___ne;
    private Boolean trasferimento_a_centro___null;
    private Boolean trasferimento_a_centro___not___null;
    private java.util.List<String> trasferimento_a_centro___in;
    private java.util.List<String> trasferimento_a_centro___not___in;
    private String trasferimento_a_centro___lt;
    private String trasferimento_a_centro___lte;
    private String trasferimento_a_centro___gt;
    private String trasferimento_a_centro___gte;
    private String trasferimento_da_centro___eq;
    private String trasferimento_da_centro___ne;
    private Boolean trasferimento_da_centro___null;
    private Boolean trasferimento_da_centro___not___null;
    private java.util.List<String> trasferimento_da_centro___in;
    private java.util.List<String> trasferimento_da_centro___not___in;
    private String trasferimento_da_centro___lt;
    private String trasferimento_da_centro___lte;
    private String trasferimento_da_centro___gt;
    private String trasferimento_da_centro___gte;
    private Boolean vax___eq;
    private Boolean vax___ne;
    private Boolean vax___null;
    private Boolean vax___not___null;
    private java.util.List<CliCentroFilterDTO> AND;
    private java.util.List<CliCentroFilterDTO> OR;
    private CliCentroFilterDTO NOT;

    public CliCentroFilterDTO() {
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

    public String getAddetto___eq() {
        return addetto___eq;
    }
    public void setAddetto___eq(String addetto___eq) {
        this.addetto___eq = addetto___eq;
    }

    public String getAddetto___ne() {
        return addetto___ne;
    }
    public void setAddetto___ne(String addetto___ne) {
        this.addetto___ne = addetto___ne;
    }

    public Boolean getAddetto___null() {
        return addetto___null;
    }
    public void setAddetto___null(Boolean addetto___null) {
        this.addetto___null = addetto___null;
    }

    public Boolean getAddetto___not___null() {
        return addetto___not___null;
    }
    public void setAddetto___not___null(Boolean addetto___not___null) {
        this.addetto___not___null = addetto___not___null;
    }

    public java.util.List<String> getAddetto___in() {
        return addetto___in;
    }
    public void setAddetto___in(java.util.List<String> addetto___in) {
        this.addetto___in = addetto___in;
    }

    public java.util.List<String> getAddetto___not___in() {
        return addetto___not___in;
    }
    public void setAddetto___not___in(java.util.List<String> addetto___not___in) {
        this.addetto___not___in = addetto___not___in;
    }

    public String getAddetto___lt() {
        return addetto___lt;
    }
    public void setAddetto___lt(String addetto___lt) {
        this.addetto___lt = addetto___lt;
    }

    public String getAddetto___lte() {
        return addetto___lte;
    }
    public void setAddetto___lte(String addetto___lte) {
        this.addetto___lte = addetto___lte;
    }

    public String getAddetto___gt() {
        return addetto___gt;
    }
    public void setAddetto___gt(String addetto___gt) {
        this.addetto___gt = addetto___gt;
    }

    public String getAddetto___gte() {
        return addetto___gte;
    }
    public void setAddetto___gte(String addetto___gte) {
        this.addetto___gte = addetto___gte;
    }

    public String getAddetto___contains() {
        return addetto___contains;
    }
    public void setAddetto___contains(String addetto___contains) {
        this.addetto___contains = addetto___contains;
    }

    public String getAddetto___not___contains() {
        return addetto___not___contains;
    }
    public void setAddetto___not___contains(String addetto___not___contains) {
        this.addetto___not___contains = addetto___not___contains;
    }

    public String getAddetto___starts_with() {
        return addetto___starts_with;
    }
    public void setAddetto___starts_with(String addetto___starts_with) {
        this.addetto___starts_with = addetto___starts_with;
    }

    public String getAddetto___not___starts_with() {
        return addetto___not___starts_with;
    }
    public void setAddetto___not___starts_with(String addetto___not___starts_with) {
        this.addetto___not___starts_with = addetto___not___starts_with;
    }

    public String getAddetto___ends_with() {
        return addetto___ends_with;
    }
    public void setAddetto___ends_with(String addetto___ends_with) {
        this.addetto___ends_with = addetto___ends_with;
    }

    public String getAddetto___not___ends_with() {
        return addetto___not___ends_with;
    }
    public void setAddetto___not___ends_with(String addetto___not___ends_with) {
        this.addetto___not___ends_with = addetto___not___ends_with;
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

    public String getCodice_centro___eq() {
        return codice_centro___eq;
    }
    public void setCodice_centro___eq(String codice_centro___eq) {
        this.codice_centro___eq = codice_centro___eq;
    }

    public String getCodice_centro___ne() {
        return codice_centro___ne;
    }
    public void setCodice_centro___ne(String codice_centro___ne) {
        this.codice_centro___ne = codice_centro___ne;
    }

    public Boolean getCodice_centro___null() {
        return codice_centro___null;
    }
    public void setCodice_centro___null(Boolean codice_centro___null) {
        this.codice_centro___null = codice_centro___null;
    }

    public Boolean getCodice_centro___not___null() {
        return codice_centro___not___null;
    }
    public void setCodice_centro___not___null(Boolean codice_centro___not___null) {
        this.codice_centro___not___null = codice_centro___not___null;
    }

    public java.util.List<String> getCodice_centro___in() {
        return codice_centro___in;
    }
    public void setCodice_centro___in(java.util.List<String> codice_centro___in) {
        this.codice_centro___in = codice_centro___in;
    }

    public java.util.List<String> getCodice_centro___not___in() {
        return codice_centro___not___in;
    }
    public void setCodice_centro___not___in(java.util.List<String> codice_centro___not___in) {
        this.codice_centro___not___in = codice_centro___not___in;
    }

    public String getCodice_centro___lt() {
        return codice_centro___lt;
    }
    public void setCodice_centro___lt(String codice_centro___lt) {
        this.codice_centro___lt = codice_centro___lt;
    }

    public String getCodice_centro___lte() {
        return codice_centro___lte;
    }
    public void setCodice_centro___lte(String codice_centro___lte) {
        this.codice_centro___lte = codice_centro___lte;
    }

    public String getCodice_centro___gt() {
        return codice_centro___gt;
    }
    public void setCodice_centro___gt(String codice_centro___gt) {
        this.codice_centro___gt = codice_centro___gt;
    }

    public String getCodice_centro___gte() {
        return codice_centro___gte;
    }
    public void setCodice_centro___gte(String codice_centro___gte) {
        this.codice_centro___gte = codice_centro___gte;
    }

    public String getCodice_centro___contains() {
        return codice_centro___contains;
    }
    public void setCodice_centro___contains(String codice_centro___contains) {
        this.codice_centro___contains = codice_centro___contains;
    }

    public String getCodice_centro___not___contains() {
        return codice_centro___not___contains;
    }
    public void setCodice_centro___not___contains(String codice_centro___not___contains) {
        this.codice_centro___not___contains = codice_centro___not___contains;
    }

    public String getCodice_centro___starts_with() {
        return codice_centro___starts_with;
    }
    public void setCodice_centro___starts_with(String codice_centro___starts_with) {
        this.codice_centro___starts_with = codice_centro___starts_with;
    }

    public String getCodice_centro___not___starts_with() {
        return codice_centro___not___starts_with;
    }
    public void setCodice_centro___not___starts_with(String codice_centro___not___starts_with) {
        this.codice_centro___not___starts_with = codice_centro___not___starts_with;
    }

    public String getCodice_centro___ends_with() {
        return codice_centro___ends_with;
    }
    public void setCodice_centro___ends_with(String codice_centro___ends_with) {
        this.codice_centro___ends_with = codice_centro___ends_with;
    }

    public String getCodice_centro___not___ends_with() {
        return codice_centro___not___ends_with;
    }
    public void setCodice_centro___not___ends_with(String codice_centro___not___ends_with) {
        this.codice_centro___not___ends_with = codice_centro___not___ends_with;
    }

    public String getEmail_pro___eq() {
        return email_pro___eq;
    }
    public void setEmail_pro___eq(String email_pro___eq) {
        this.email_pro___eq = email_pro___eq;
    }

    public String getEmail_pro___ne() {
        return email_pro___ne;
    }
    public void setEmail_pro___ne(String email_pro___ne) {
        this.email_pro___ne = email_pro___ne;
    }

    public Boolean getEmail_pro___null() {
        return email_pro___null;
    }
    public void setEmail_pro___null(Boolean email_pro___null) {
        this.email_pro___null = email_pro___null;
    }

    public Boolean getEmail_pro___not___null() {
        return email_pro___not___null;
    }
    public void setEmail_pro___not___null(Boolean email_pro___not___null) {
        this.email_pro___not___null = email_pro___not___null;
    }

    public java.util.List<String> getEmail_pro___in() {
        return email_pro___in;
    }
    public void setEmail_pro___in(java.util.List<String> email_pro___in) {
        this.email_pro___in = email_pro___in;
    }

    public java.util.List<String> getEmail_pro___not___in() {
        return email_pro___not___in;
    }
    public void setEmail_pro___not___in(java.util.List<String> email_pro___not___in) {
        this.email_pro___not___in = email_pro___not___in;
    }

    public String getEmail_pro___lt() {
        return email_pro___lt;
    }
    public void setEmail_pro___lt(String email_pro___lt) {
        this.email_pro___lt = email_pro___lt;
    }

    public String getEmail_pro___lte() {
        return email_pro___lte;
    }
    public void setEmail_pro___lte(String email_pro___lte) {
        this.email_pro___lte = email_pro___lte;
    }

    public String getEmail_pro___gt() {
        return email_pro___gt;
    }
    public void setEmail_pro___gt(String email_pro___gt) {
        this.email_pro___gt = email_pro___gt;
    }

    public String getEmail_pro___gte() {
        return email_pro___gte;
    }
    public void setEmail_pro___gte(String email_pro___gte) {
        this.email_pro___gte = email_pro___gte;
    }

    public String getEmail_pro___contains() {
        return email_pro___contains;
    }
    public void setEmail_pro___contains(String email_pro___contains) {
        this.email_pro___contains = email_pro___contains;
    }

    public String getEmail_pro___not___contains() {
        return email_pro___not___contains;
    }
    public void setEmail_pro___not___contains(String email_pro___not___contains) {
        this.email_pro___not___contains = email_pro___not___contains;
    }

    public String getEmail_pro___starts_with() {
        return email_pro___starts_with;
    }
    public void setEmail_pro___starts_with(String email_pro___starts_with) {
        this.email_pro___starts_with = email_pro___starts_with;
    }

    public String getEmail_pro___not___starts_with() {
        return email_pro___not___starts_with;
    }
    public void setEmail_pro___not___starts_with(String email_pro___not___starts_with) {
        this.email_pro___not___starts_with = email_pro___not___starts_with;
    }

    public String getEmail_pro___ends_with() {
        return email_pro___ends_with;
    }
    public void setEmail_pro___ends_with(String email_pro___ends_with) {
        this.email_pro___ends_with = email_pro___ends_with;
    }

    public String getEmail_pro___not___ends_with() {
        return email_pro___not___ends_with;
    }
    public void setEmail_pro___not___ends_with(String email_pro___not___ends_with) {
        this.email_pro___not___ends_with = email_pro___not___ends_with;
    }

    public Integer getGestione_scelta___eq() {
        return gestione_scelta___eq;
    }
    public void setGestione_scelta___eq(Integer gestione_scelta___eq) {
        this.gestione_scelta___eq = gestione_scelta___eq;
    }

    public Integer getGestione_scelta___ne() {
        return gestione_scelta___ne;
    }
    public void setGestione_scelta___ne(Integer gestione_scelta___ne) {
        this.gestione_scelta___ne = gestione_scelta___ne;
    }

    public Boolean getGestione_scelta___null() {
        return gestione_scelta___null;
    }
    public void setGestione_scelta___null(Boolean gestione_scelta___null) {
        this.gestione_scelta___null = gestione_scelta___null;
    }

    public Boolean getGestione_scelta___not___null() {
        return gestione_scelta___not___null;
    }
    public void setGestione_scelta___not___null(Boolean gestione_scelta___not___null) {
        this.gestione_scelta___not___null = gestione_scelta___not___null;
    }

    public java.util.List<Integer> getGestione_scelta___in() {
        return gestione_scelta___in;
    }
    public void setGestione_scelta___in(java.util.List<Integer> gestione_scelta___in) {
        this.gestione_scelta___in = gestione_scelta___in;
    }

    public java.util.List<Integer> getGestione_scelta___not___in() {
        return gestione_scelta___not___in;
    }
    public void setGestione_scelta___not___in(java.util.List<Integer> gestione_scelta___not___in) {
        this.gestione_scelta___not___in = gestione_scelta___not___in;
    }

    public Integer getGestione_scelta___lt() {
        return gestione_scelta___lt;
    }
    public void setGestione_scelta___lt(Integer gestione_scelta___lt) {
        this.gestione_scelta___lt = gestione_scelta___lt;
    }

    public Integer getGestione_scelta___lte() {
        return gestione_scelta___lte;
    }
    public void setGestione_scelta___lte(Integer gestione_scelta___lte) {
        this.gestione_scelta___lte = gestione_scelta___lte;
    }

    public Integer getGestione_scelta___gt() {
        return gestione_scelta___gt;
    }
    public void setGestione_scelta___gt(Integer gestione_scelta___gt) {
        this.gestione_scelta___gt = gestione_scelta___gt;
    }

    public Integer getGestione_scelta___gte() {
        return gestione_scelta___gte;
    }
    public void setGestione_scelta___gte(Integer gestione_scelta___gte) {
        this.gestione_scelta___gte = gestione_scelta___gte;
    }

    public Integer getIn_elenco___eq() {
        return in_elenco___eq;
    }
    public void setIn_elenco___eq(Integer in_elenco___eq) {
        this.in_elenco___eq = in_elenco___eq;
    }

    public Integer getIn_elenco___ne() {
        return in_elenco___ne;
    }
    public void setIn_elenco___ne(Integer in_elenco___ne) {
        this.in_elenco___ne = in_elenco___ne;
    }

    public Boolean getIn_elenco___null() {
        return in_elenco___null;
    }
    public void setIn_elenco___null(Boolean in_elenco___null) {
        this.in_elenco___null = in_elenco___null;
    }

    public Boolean getIn_elenco___not___null() {
        return in_elenco___not___null;
    }
    public void setIn_elenco___not___null(Boolean in_elenco___not___null) {
        this.in_elenco___not___null = in_elenco___not___null;
    }

    public java.util.List<Integer> getIn_elenco___in() {
        return in_elenco___in;
    }
    public void setIn_elenco___in(java.util.List<Integer> in_elenco___in) {
        this.in_elenco___in = in_elenco___in;
    }

    public java.util.List<Integer> getIn_elenco___not___in() {
        return in_elenco___not___in;
    }
    public void setIn_elenco___not___in(java.util.List<Integer> in_elenco___not___in) {
        this.in_elenco___not___in = in_elenco___not___in;
    }

    public Integer getIn_elenco___lt() {
        return in_elenco___lt;
    }
    public void setIn_elenco___lt(Integer in_elenco___lt) {
        this.in_elenco___lt = in_elenco___lt;
    }

    public Integer getIn_elenco___lte() {
        return in_elenco___lte;
    }
    public void setIn_elenco___lte(Integer in_elenco___lte) {
        this.in_elenco___lte = in_elenco___lte;
    }

    public Integer getIn_elenco___gt() {
        return in_elenco___gt;
    }
    public void setIn_elenco___gt(Integer in_elenco___gt) {
        this.in_elenco___gt = in_elenco___gt;
    }

    public Integer getIn_elenco___gte() {
        return in_elenco___gte;
    }
    public void setIn_elenco___gte(Integer in_elenco___gte) {
        this.in_elenco___gte = in_elenco___gte;
    }

    public String getIndirizzo___eq() {
        return indirizzo___eq;
    }
    public void setIndirizzo___eq(String indirizzo___eq) {
        this.indirizzo___eq = indirizzo___eq;
    }

    public String getIndirizzo___ne() {
        return indirizzo___ne;
    }
    public void setIndirizzo___ne(String indirizzo___ne) {
        this.indirizzo___ne = indirizzo___ne;
    }

    public Boolean getIndirizzo___null() {
        return indirizzo___null;
    }
    public void setIndirizzo___null(Boolean indirizzo___null) {
        this.indirizzo___null = indirizzo___null;
    }

    public Boolean getIndirizzo___not___null() {
        return indirizzo___not___null;
    }
    public void setIndirizzo___not___null(Boolean indirizzo___not___null) {
        this.indirizzo___not___null = indirizzo___not___null;
    }

    public java.util.List<String> getIndirizzo___in() {
        return indirizzo___in;
    }
    public void setIndirizzo___in(java.util.List<String> indirizzo___in) {
        this.indirizzo___in = indirizzo___in;
    }

    public java.util.List<String> getIndirizzo___not___in() {
        return indirizzo___not___in;
    }
    public void setIndirizzo___not___in(java.util.List<String> indirizzo___not___in) {
        this.indirizzo___not___in = indirizzo___not___in;
    }

    public String getIndirizzo___lt() {
        return indirizzo___lt;
    }
    public void setIndirizzo___lt(String indirizzo___lt) {
        this.indirizzo___lt = indirizzo___lt;
    }

    public String getIndirizzo___lte() {
        return indirizzo___lte;
    }
    public void setIndirizzo___lte(String indirizzo___lte) {
        this.indirizzo___lte = indirizzo___lte;
    }

    public String getIndirizzo___gt() {
        return indirizzo___gt;
    }
    public void setIndirizzo___gt(String indirizzo___gt) {
        this.indirizzo___gt = indirizzo___gt;
    }

    public String getIndirizzo___gte() {
        return indirizzo___gte;
    }
    public void setIndirizzo___gte(String indirizzo___gte) {
        this.indirizzo___gte = indirizzo___gte;
    }

    public String getIndirizzo___contains() {
        return indirizzo___contains;
    }
    public void setIndirizzo___contains(String indirizzo___contains) {
        this.indirizzo___contains = indirizzo___contains;
    }

    public String getIndirizzo___not___contains() {
        return indirizzo___not___contains;
    }
    public void setIndirizzo___not___contains(String indirizzo___not___contains) {
        this.indirizzo___not___contains = indirizzo___not___contains;
    }

    public String getIndirizzo___starts_with() {
        return indirizzo___starts_with;
    }
    public void setIndirizzo___starts_with(String indirizzo___starts_with) {
        this.indirizzo___starts_with = indirizzo___starts_with;
    }

    public String getIndirizzo___not___starts_with() {
        return indirizzo___not___starts_with;
    }
    public void setIndirizzo___not___starts_with(String indirizzo___not___starts_with) {
        this.indirizzo___not___starts_with = indirizzo___not___starts_with;
    }

    public String getIndirizzo___ends_with() {
        return indirizzo___ends_with;
    }
    public void setIndirizzo___ends_with(String indirizzo___ends_with) {
        this.indirizzo___ends_with = indirizzo___ends_with;
    }

    public String getIndirizzo___not___ends_with() {
        return indirizzo___not___ends_with;
    }
    public void setIndirizzo___not___ends_with(String indirizzo___not___ends_with) {
        this.indirizzo___not___ends_with = indirizzo___not___ends_with;
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

    public String getPrimario___eq() {
        return primario___eq;
    }
    public void setPrimario___eq(String primario___eq) {
        this.primario___eq = primario___eq;
    }

    public String getPrimario___ne() {
        return primario___ne;
    }
    public void setPrimario___ne(String primario___ne) {
        this.primario___ne = primario___ne;
    }

    public Boolean getPrimario___null() {
        return primario___null;
    }
    public void setPrimario___null(Boolean primario___null) {
        this.primario___null = primario___null;
    }

    public Boolean getPrimario___not___null() {
        return primario___not___null;
    }
    public void setPrimario___not___null(Boolean primario___not___null) {
        this.primario___not___null = primario___not___null;
    }

    public java.util.List<String> getPrimario___in() {
        return primario___in;
    }
    public void setPrimario___in(java.util.List<String> primario___in) {
        this.primario___in = primario___in;
    }

    public java.util.List<String> getPrimario___not___in() {
        return primario___not___in;
    }
    public void setPrimario___not___in(java.util.List<String> primario___not___in) {
        this.primario___not___in = primario___not___in;
    }

    public String getPrimario___lt() {
        return primario___lt;
    }
    public void setPrimario___lt(String primario___lt) {
        this.primario___lt = primario___lt;
    }

    public String getPrimario___lte() {
        return primario___lte;
    }
    public void setPrimario___lte(String primario___lte) {
        this.primario___lte = primario___lte;
    }

    public String getPrimario___gt() {
        return primario___gt;
    }
    public void setPrimario___gt(String primario___gt) {
        this.primario___gt = primario___gt;
    }

    public String getPrimario___gte() {
        return primario___gte;
    }
    public void setPrimario___gte(String primario___gte) {
        this.primario___gte = primario___gte;
    }

    public String getPrimario___contains() {
        return primario___contains;
    }
    public void setPrimario___contains(String primario___contains) {
        this.primario___contains = primario___contains;
    }

    public String getPrimario___not___contains() {
        return primario___not___contains;
    }
    public void setPrimario___not___contains(String primario___not___contains) {
        this.primario___not___contains = primario___not___contains;
    }

    public String getPrimario___starts_with() {
        return primario___starts_with;
    }
    public void setPrimario___starts_with(String primario___starts_with) {
        this.primario___starts_with = primario___starts_with;
    }

    public String getPrimario___not___starts_with() {
        return primario___not___starts_with;
    }
    public void setPrimario___not___starts_with(String primario___not___starts_with) {
        this.primario___not___starts_with = primario___not___starts_with;
    }

    public String getPrimario___ends_with() {
        return primario___ends_with;
    }
    public void setPrimario___ends_with(String primario___ends_with) {
        this.primario___ends_with = primario___ends_with;
    }

    public String getPrimario___not___ends_with() {
        return primario___not___ends_with;
    }
    public void setPrimario___not___ends_with(String primario___not___ends_with) {
        this.primario___not___ends_with = primario___not___ends_with;
    }

    public String getTelefono___eq() {
        return telefono___eq;
    }
    public void setTelefono___eq(String telefono___eq) {
        this.telefono___eq = telefono___eq;
    }

    public String getTelefono___ne() {
        return telefono___ne;
    }
    public void setTelefono___ne(String telefono___ne) {
        this.telefono___ne = telefono___ne;
    }

    public Boolean getTelefono___null() {
        return telefono___null;
    }
    public void setTelefono___null(Boolean telefono___null) {
        this.telefono___null = telefono___null;
    }

    public Boolean getTelefono___not___null() {
        return telefono___not___null;
    }
    public void setTelefono___not___null(Boolean telefono___not___null) {
        this.telefono___not___null = telefono___not___null;
    }

    public java.util.List<String> getTelefono___in() {
        return telefono___in;
    }
    public void setTelefono___in(java.util.List<String> telefono___in) {
        this.telefono___in = telefono___in;
    }

    public java.util.List<String> getTelefono___not___in() {
        return telefono___not___in;
    }
    public void setTelefono___not___in(java.util.List<String> telefono___not___in) {
        this.telefono___not___in = telefono___not___in;
    }

    public String getTelefono___lt() {
        return telefono___lt;
    }
    public void setTelefono___lt(String telefono___lt) {
        this.telefono___lt = telefono___lt;
    }

    public String getTelefono___lte() {
        return telefono___lte;
    }
    public void setTelefono___lte(String telefono___lte) {
        this.telefono___lte = telefono___lte;
    }

    public String getTelefono___gt() {
        return telefono___gt;
    }
    public void setTelefono___gt(String telefono___gt) {
        this.telefono___gt = telefono___gt;
    }

    public String getTelefono___gte() {
        return telefono___gte;
    }
    public void setTelefono___gte(String telefono___gte) {
        this.telefono___gte = telefono___gte;
    }

    public String getTelefono___contains() {
        return telefono___contains;
    }
    public void setTelefono___contains(String telefono___contains) {
        this.telefono___contains = telefono___contains;
    }

    public String getTelefono___not___contains() {
        return telefono___not___contains;
    }
    public void setTelefono___not___contains(String telefono___not___contains) {
        this.telefono___not___contains = telefono___not___contains;
    }

    public String getTelefono___starts_with() {
        return telefono___starts_with;
    }
    public void setTelefono___starts_with(String telefono___starts_with) {
        this.telefono___starts_with = telefono___starts_with;
    }

    public String getTelefono___not___starts_with() {
        return telefono___not___starts_with;
    }
    public void setTelefono___not___starts_with(String telefono___not___starts_with) {
        this.telefono___not___starts_with = telefono___not___starts_with;
    }

    public String getTelefono___ends_with() {
        return telefono___ends_with;
    }
    public void setTelefono___ends_with(String telefono___ends_with) {
        this.telefono___ends_with = telefono___ends_with;
    }

    public String getTelefono___not___ends_with() {
        return telefono___not___ends_with;
    }
    public void setTelefono___not___ends_with(String telefono___not___ends_with) {
        this.telefono___not___ends_with = telefono___not___ends_with;
    }

    public String getTrasferimento_a_centro___eq() {
        return trasferimento_a_centro___eq;
    }
    public void setTrasferimento_a_centro___eq(String trasferimento_a_centro___eq) {
        this.trasferimento_a_centro___eq = trasferimento_a_centro___eq;
    }

    public String getTrasferimento_a_centro___ne() {
        return trasferimento_a_centro___ne;
    }
    public void setTrasferimento_a_centro___ne(String trasferimento_a_centro___ne) {
        this.trasferimento_a_centro___ne = trasferimento_a_centro___ne;
    }

    public Boolean getTrasferimento_a_centro___null() {
        return trasferimento_a_centro___null;
    }
    public void setTrasferimento_a_centro___null(Boolean trasferimento_a_centro___null) {
        this.trasferimento_a_centro___null = trasferimento_a_centro___null;
    }

    public Boolean getTrasferimento_a_centro___not___null() {
        return trasferimento_a_centro___not___null;
    }
    public void setTrasferimento_a_centro___not___null(Boolean trasferimento_a_centro___not___null) {
        this.trasferimento_a_centro___not___null = trasferimento_a_centro___not___null;
    }

    public java.util.List<String> getTrasferimento_a_centro___in() {
        return trasferimento_a_centro___in;
    }
    public void setTrasferimento_a_centro___in(java.util.List<String> trasferimento_a_centro___in) {
        this.trasferimento_a_centro___in = trasferimento_a_centro___in;
    }

    public java.util.List<String> getTrasferimento_a_centro___not___in() {
        return trasferimento_a_centro___not___in;
    }
    public void setTrasferimento_a_centro___not___in(java.util.List<String> trasferimento_a_centro___not___in) {
        this.trasferimento_a_centro___not___in = trasferimento_a_centro___not___in;
    }

    public String getTrasferimento_a_centro___lt() {
        return trasferimento_a_centro___lt;
    }
    public void setTrasferimento_a_centro___lt(String trasferimento_a_centro___lt) {
        this.trasferimento_a_centro___lt = trasferimento_a_centro___lt;
    }

    public String getTrasferimento_a_centro___lte() {
        return trasferimento_a_centro___lte;
    }
    public void setTrasferimento_a_centro___lte(String trasferimento_a_centro___lte) {
        this.trasferimento_a_centro___lte = trasferimento_a_centro___lte;
    }

    public String getTrasferimento_a_centro___gt() {
        return trasferimento_a_centro___gt;
    }
    public void setTrasferimento_a_centro___gt(String trasferimento_a_centro___gt) {
        this.trasferimento_a_centro___gt = trasferimento_a_centro___gt;
    }

    public String getTrasferimento_a_centro___gte() {
        return trasferimento_a_centro___gte;
    }
    public void setTrasferimento_a_centro___gte(String trasferimento_a_centro___gte) {
        this.trasferimento_a_centro___gte = trasferimento_a_centro___gte;
    }

    public String getTrasferimento_da_centro___eq() {
        return trasferimento_da_centro___eq;
    }
    public void setTrasferimento_da_centro___eq(String trasferimento_da_centro___eq) {
        this.trasferimento_da_centro___eq = trasferimento_da_centro___eq;
    }

    public String getTrasferimento_da_centro___ne() {
        return trasferimento_da_centro___ne;
    }
    public void setTrasferimento_da_centro___ne(String trasferimento_da_centro___ne) {
        this.trasferimento_da_centro___ne = trasferimento_da_centro___ne;
    }

    public Boolean getTrasferimento_da_centro___null() {
        return trasferimento_da_centro___null;
    }
    public void setTrasferimento_da_centro___null(Boolean trasferimento_da_centro___null) {
        this.trasferimento_da_centro___null = trasferimento_da_centro___null;
    }

    public Boolean getTrasferimento_da_centro___not___null() {
        return trasferimento_da_centro___not___null;
    }
    public void setTrasferimento_da_centro___not___null(Boolean trasferimento_da_centro___not___null) {
        this.trasferimento_da_centro___not___null = trasferimento_da_centro___not___null;
    }

    public java.util.List<String> getTrasferimento_da_centro___in() {
        return trasferimento_da_centro___in;
    }
    public void setTrasferimento_da_centro___in(java.util.List<String> trasferimento_da_centro___in) {
        this.trasferimento_da_centro___in = trasferimento_da_centro___in;
    }

    public java.util.List<String> getTrasferimento_da_centro___not___in() {
        return trasferimento_da_centro___not___in;
    }
    public void setTrasferimento_da_centro___not___in(java.util.List<String> trasferimento_da_centro___not___in) {
        this.trasferimento_da_centro___not___in = trasferimento_da_centro___not___in;
    }

    public String getTrasferimento_da_centro___lt() {
        return trasferimento_da_centro___lt;
    }
    public void setTrasferimento_da_centro___lt(String trasferimento_da_centro___lt) {
        this.trasferimento_da_centro___lt = trasferimento_da_centro___lt;
    }

    public String getTrasferimento_da_centro___lte() {
        return trasferimento_da_centro___lte;
    }
    public void setTrasferimento_da_centro___lte(String trasferimento_da_centro___lte) {
        this.trasferimento_da_centro___lte = trasferimento_da_centro___lte;
    }

    public String getTrasferimento_da_centro___gt() {
        return trasferimento_da_centro___gt;
    }
    public void setTrasferimento_da_centro___gt(String trasferimento_da_centro___gt) {
        this.trasferimento_da_centro___gt = trasferimento_da_centro___gt;
    }

    public String getTrasferimento_da_centro___gte() {
        return trasferimento_da_centro___gte;
    }
    public void setTrasferimento_da_centro___gte(String trasferimento_da_centro___gte) {
        this.trasferimento_da_centro___gte = trasferimento_da_centro___gte;
    }

    public Boolean getVax___eq() {
        return vax___eq;
    }
    public void setVax___eq(Boolean vax___eq) {
        this.vax___eq = vax___eq;
    }

    public Boolean getVax___ne() {
        return vax___ne;
    }
    public void setVax___ne(Boolean vax___ne) {
        this.vax___ne = vax___ne;
    }

    public Boolean getVax___null() {
        return vax___null;
    }
    public void setVax___null(Boolean vax___null) {
        this.vax___null = vax___null;
    }

    public Boolean getVax___not___null() {
        return vax___not___null;
    }
    public void setVax___not___null(Boolean vax___not___null) {
        this.vax___not___null = vax___not___null;
    }

    public java.util.List<CliCentroFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliCentroFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliCentroFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliCentroFilterDTO> OR) {
        this.OR = OR;
    }

    public CliCentroFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliCentroFilterDTO NOT) {
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
        if (addetto___eq != null) {
            joiner.add("addetto___eq: " + GraphQLRequestSerializer.getEntry(addetto___eq));
        }
        if (addetto___ne != null) {
            joiner.add("addetto___ne: " + GraphQLRequestSerializer.getEntry(addetto___ne));
        }
        if (addetto___null != null) {
            joiner.add("addetto___null: " + GraphQLRequestSerializer.getEntry(addetto___null));
        }
        if (addetto___not___null != null) {
            joiner.add("addetto___not___null: " + GraphQLRequestSerializer.getEntry(addetto___not___null));
        }
        if (addetto___in != null) {
            joiner.add("addetto___in: " + GraphQLRequestSerializer.getEntry(addetto___in));
        }
        if (addetto___not___in != null) {
            joiner.add("addetto___not___in: " + GraphQLRequestSerializer.getEntry(addetto___not___in));
        }
        if (addetto___lt != null) {
            joiner.add("addetto___lt: " + GraphQLRequestSerializer.getEntry(addetto___lt));
        }
        if (addetto___lte != null) {
            joiner.add("addetto___lte: " + GraphQLRequestSerializer.getEntry(addetto___lte));
        }
        if (addetto___gt != null) {
            joiner.add("addetto___gt: " + GraphQLRequestSerializer.getEntry(addetto___gt));
        }
        if (addetto___gte != null) {
            joiner.add("addetto___gte: " + GraphQLRequestSerializer.getEntry(addetto___gte));
        }
        if (addetto___contains != null) {
            joiner.add("addetto___contains: " + GraphQLRequestSerializer.getEntry(addetto___contains));
        }
        if (addetto___not___contains != null) {
            joiner.add("addetto___not___contains: " + GraphQLRequestSerializer.getEntry(addetto___not___contains));
        }
        if (addetto___starts_with != null) {
            joiner.add("addetto___starts_with: " + GraphQLRequestSerializer.getEntry(addetto___starts_with));
        }
        if (addetto___not___starts_with != null) {
            joiner.add("addetto___not___starts_with: " + GraphQLRequestSerializer.getEntry(addetto___not___starts_with));
        }
        if (addetto___ends_with != null) {
            joiner.add("addetto___ends_with: " + GraphQLRequestSerializer.getEntry(addetto___ends_with));
        }
        if (addetto___not___ends_with != null) {
            joiner.add("addetto___not___ends_with: " + GraphQLRequestSerializer.getEntry(addetto___not___ends_with));
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
        if (codice_centro___eq != null) {
            joiner.add("codice_centro___eq: " + GraphQLRequestSerializer.getEntry(codice_centro___eq));
        }
        if (codice_centro___ne != null) {
            joiner.add("codice_centro___ne: " + GraphQLRequestSerializer.getEntry(codice_centro___ne));
        }
        if (codice_centro___null != null) {
            joiner.add("codice_centro___null: " + GraphQLRequestSerializer.getEntry(codice_centro___null));
        }
        if (codice_centro___not___null != null) {
            joiner.add("codice_centro___not___null: " + GraphQLRequestSerializer.getEntry(codice_centro___not___null));
        }
        if (codice_centro___in != null) {
            joiner.add("codice_centro___in: " + GraphQLRequestSerializer.getEntry(codice_centro___in));
        }
        if (codice_centro___not___in != null) {
            joiner.add("codice_centro___not___in: " + GraphQLRequestSerializer.getEntry(codice_centro___not___in));
        }
        if (codice_centro___lt != null) {
            joiner.add("codice_centro___lt: " + GraphQLRequestSerializer.getEntry(codice_centro___lt));
        }
        if (codice_centro___lte != null) {
            joiner.add("codice_centro___lte: " + GraphQLRequestSerializer.getEntry(codice_centro___lte));
        }
        if (codice_centro___gt != null) {
            joiner.add("codice_centro___gt: " + GraphQLRequestSerializer.getEntry(codice_centro___gt));
        }
        if (codice_centro___gte != null) {
            joiner.add("codice_centro___gte: " + GraphQLRequestSerializer.getEntry(codice_centro___gte));
        }
        if (codice_centro___contains != null) {
            joiner.add("codice_centro___contains: " + GraphQLRequestSerializer.getEntry(codice_centro___contains));
        }
        if (codice_centro___not___contains != null) {
            joiner.add("codice_centro___not___contains: " + GraphQLRequestSerializer.getEntry(codice_centro___not___contains));
        }
        if (codice_centro___starts_with != null) {
            joiner.add("codice_centro___starts_with: " + GraphQLRequestSerializer.getEntry(codice_centro___starts_with));
        }
        if (codice_centro___not___starts_with != null) {
            joiner.add("codice_centro___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_centro___not___starts_with));
        }
        if (codice_centro___ends_with != null) {
            joiner.add("codice_centro___ends_with: " + GraphQLRequestSerializer.getEntry(codice_centro___ends_with));
        }
        if (codice_centro___not___ends_with != null) {
            joiner.add("codice_centro___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_centro___not___ends_with));
        }
        if (email_pro___eq != null) {
            joiner.add("email_pro___eq: " + GraphQLRequestSerializer.getEntry(email_pro___eq));
        }
        if (email_pro___ne != null) {
            joiner.add("email_pro___ne: " + GraphQLRequestSerializer.getEntry(email_pro___ne));
        }
        if (email_pro___null != null) {
            joiner.add("email_pro___null: " + GraphQLRequestSerializer.getEntry(email_pro___null));
        }
        if (email_pro___not___null != null) {
            joiner.add("email_pro___not___null: " + GraphQLRequestSerializer.getEntry(email_pro___not___null));
        }
        if (email_pro___in != null) {
            joiner.add("email_pro___in: " + GraphQLRequestSerializer.getEntry(email_pro___in));
        }
        if (email_pro___not___in != null) {
            joiner.add("email_pro___not___in: " + GraphQLRequestSerializer.getEntry(email_pro___not___in));
        }
        if (email_pro___lt != null) {
            joiner.add("email_pro___lt: " + GraphQLRequestSerializer.getEntry(email_pro___lt));
        }
        if (email_pro___lte != null) {
            joiner.add("email_pro___lte: " + GraphQLRequestSerializer.getEntry(email_pro___lte));
        }
        if (email_pro___gt != null) {
            joiner.add("email_pro___gt: " + GraphQLRequestSerializer.getEntry(email_pro___gt));
        }
        if (email_pro___gte != null) {
            joiner.add("email_pro___gte: " + GraphQLRequestSerializer.getEntry(email_pro___gte));
        }
        if (email_pro___contains != null) {
            joiner.add("email_pro___contains: " + GraphQLRequestSerializer.getEntry(email_pro___contains));
        }
        if (email_pro___not___contains != null) {
            joiner.add("email_pro___not___contains: " + GraphQLRequestSerializer.getEntry(email_pro___not___contains));
        }
        if (email_pro___starts_with != null) {
            joiner.add("email_pro___starts_with: " + GraphQLRequestSerializer.getEntry(email_pro___starts_with));
        }
        if (email_pro___not___starts_with != null) {
            joiner.add("email_pro___not___starts_with: " + GraphQLRequestSerializer.getEntry(email_pro___not___starts_with));
        }
        if (email_pro___ends_with != null) {
            joiner.add("email_pro___ends_with: " + GraphQLRequestSerializer.getEntry(email_pro___ends_with));
        }
        if (email_pro___not___ends_with != null) {
            joiner.add("email_pro___not___ends_with: " + GraphQLRequestSerializer.getEntry(email_pro___not___ends_with));
        }
        if (gestione_scelta___eq != null) {
            joiner.add("gestione_scelta___eq: " + GraphQLRequestSerializer.getEntry(gestione_scelta___eq));
        }
        if (gestione_scelta___ne != null) {
            joiner.add("gestione_scelta___ne: " + GraphQLRequestSerializer.getEntry(gestione_scelta___ne));
        }
        if (gestione_scelta___null != null) {
            joiner.add("gestione_scelta___null: " + GraphQLRequestSerializer.getEntry(gestione_scelta___null));
        }
        if (gestione_scelta___not___null != null) {
            joiner.add("gestione_scelta___not___null: " + GraphQLRequestSerializer.getEntry(gestione_scelta___not___null));
        }
        if (gestione_scelta___in != null) {
            joiner.add("gestione_scelta___in: " + GraphQLRequestSerializer.getEntry(gestione_scelta___in));
        }
        if (gestione_scelta___not___in != null) {
            joiner.add("gestione_scelta___not___in: " + GraphQLRequestSerializer.getEntry(gestione_scelta___not___in));
        }
        if (gestione_scelta___lt != null) {
            joiner.add("gestione_scelta___lt: " + GraphQLRequestSerializer.getEntry(gestione_scelta___lt));
        }
        if (gestione_scelta___lte != null) {
            joiner.add("gestione_scelta___lte: " + GraphQLRequestSerializer.getEntry(gestione_scelta___lte));
        }
        if (gestione_scelta___gt != null) {
            joiner.add("gestione_scelta___gt: " + GraphQLRequestSerializer.getEntry(gestione_scelta___gt));
        }
        if (gestione_scelta___gte != null) {
            joiner.add("gestione_scelta___gte: " + GraphQLRequestSerializer.getEntry(gestione_scelta___gte));
        }
        if (in_elenco___eq != null) {
            joiner.add("in_elenco___eq: " + GraphQLRequestSerializer.getEntry(in_elenco___eq));
        }
        if (in_elenco___ne != null) {
            joiner.add("in_elenco___ne: " + GraphQLRequestSerializer.getEntry(in_elenco___ne));
        }
        if (in_elenco___null != null) {
            joiner.add("in_elenco___null: " + GraphQLRequestSerializer.getEntry(in_elenco___null));
        }
        if (in_elenco___not___null != null) {
            joiner.add("in_elenco___not___null: " + GraphQLRequestSerializer.getEntry(in_elenco___not___null));
        }
        if (in_elenco___in != null) {
            joiner.add("in_elenco___in: " + GraphQLRequestSerializer.getEntry(in_elenco___in));
        }
        if (in_elenco___not___in != null) {
            joiner.add("in_elenco___not___in: " + GraphQLRequestSerializer.getEntry(in_elenco___not___in));
        }
        if (in_elenco___lt != null) {
            joiner.add("in_elenco___lt: " + GraphQLRequestSerializer.getEntry(in_elenco___lt));
        }
        if (in_elenco___lte != null) {
            joiner.add("in_elenco___lte: " + GraphQLRequestSerializer.getEntry(in_elenco___lte));
        }
        if (in_elenco___gt != null) {
            joiner.add("in_elenco___gt: " + GraphQLRequestSerializer.getEntry(in_elenco___gt));
        }
        if (in_elenco___gte != null) {
            joiner.add("in_elenco___gte: " + GraphQLRequestSerializer.getEntry(in_elenco___gte));
        }
        if (indirizzo___eq != null) {
            joiner.add("indirizzo___eq: " + GraphQLRequestSerializer.getEntry(indirizzo___eq));
        }
        if (indirizzo___ne != null) {
            joiner.add("indirizzo___ne: " + GraphQLRequestSerializer.getEntry(indirizzo___ne));
        }
        if (indirizzo___null != null) {
            joiner.add("indirizzo___null: " + GraphQLRequestSerializer.getEntry(indirizzo___null));
        }
        if (indirizzo___not___null != null) {
            joiner.add("indirizzo___not___null: " + GraphQLRequestSerializer.getEntry(indirizzo___not___null));
        }
        if (indirizzo___in != null) {
            joiner.add("indirizzo___in: " + GraphQLRequestSerializer.getEntry(indirizzo___in));
        }
        if (indirizzo___not___in != null) {
            joiner.add("indirizzo___not___in: " + GraphQLRequestSerializer.getEntry(indirizzo___not___in));
        }
        if (indirizzo___lt != null) {
            joiner.add("indirizzo___lt: " + GraphQLRequestSerializer.getEntry(indirizzo___lt));
        }
        if (indirizzo___lte != null) {
            joiner.add("indirizzo___lte: " + GraphQLRequestSerializer.getEntry(indirizzo___lte));
        }
        if (indirizzo___gt != null) {
            joiner.add("indirizzo___gt: " + GraphQLRequestSerializer.getEntry(indirizzo___gt));
        }
        if (indirizzo___gte != null) {
            joiner.add("indirizzo___gte: " + GraphQLRequestSerializer.getEntry(indirizzo___gte));
        }
        if (indirizzo___contains != null) {
            joiner.add("indirizzo___contains: " + GraphQLRequestSerializer.getEntry(indirizzo___contains));
        }
        if (indirizzo___not___contains != null) {
            joiner.add("indirizzo___not___contains: " + GraphQLRequestSerializer.getEntry(indirizzo___not___contains));
        }
        if (indirizzo___starts_with != null) {
            joiner.add("indirizzo___starts_with: " + GraphQLRequestSerializer.getEntry(indirizzo___starts_with));
        }
        if (indirizzo___not___starts_with != null) {
            joiner.add("indirizzo___not___starts_with: " + GraphQLRequestSerializer.getEntry(indirizzo___not___starts_with));
        }
        if (indirizzo___ends_with != null) {
            joiner.add("indirizzo___ends_with: " + GraphQLRequestSerializer.getEntry(indirizzo___ends_with));
        }
        if (indirizzo___not___ends_with != null) {
            joiner.add("indirizzo___not___ends_with: " + GraphQLRequestSerializer.getEntry(indirizzo___not___ends_with));
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
        if (primario___eq != null) {
            joiner.add("primario___eq: " + GraphQLRequestSerializer.getEntry(primario___eq));
        }
        if (primario___ne != null) {
            joiner.add("primario___ne: " + GraphQLRequestSerializer.getEntry(primario___ne));
        }
        if (primario___null != null) {
            joiner.add("primario___null: " + GraphQLRequestSerializer.getEntry(primario___null));
        }
        if (primario___not___null != null) {
            joiner.add("primario___not___null: " + GraphQLRequestSerializer.getEntry(primario___not___null));
        }
        if (primario___in != null) {
            joiner.add("primario___in: " + GraphQLRequestSerializer.getEntry(primario___in));
        }
        if (primario___not___in != null) {
            joiner.add("primario___not___in: " + GraphQLRequestSerializer.getEntry(primario___not___in));
        }
        if (primario___lt != null) {
            joiner.add("primario___lt: " + GraphQLRequestSerializer.getEntry(primario___lt));
        }
        if (primario___lte != null) {
            joiner.add("primario___lte: " + GraphQLRequestSerializer.getEntry(primario___lte));
        }
        if (primario___gt != null) {
            joiner.add("primario___gt: " + GraphQLRequestSerializer.getEntry(primario___gt));
        }
        if (primario___gte != null) {
            joiner.add("primario___gte: " + GraphQLRequestSerializer.getEntry(primario___gte));
        }
        if (primario___contains != null) {
            joiner.add("primario___contains: " + GraphQLRequestSerializer.getEntry(primario___contains));
        }
        if (primario___not___contains != null) {
            joiner.add("primario___not___contains: " + GraphQLRequestSerializer.getEntry(primario___not___contains));
        }
        if (primario___starts_with != null) {
            joiner.add("primario___starts_with: " + GraphQLRequestSerializer.getEntry(primario___starts_with));
        }
        if (primario___not___starts_with != null) {
            joiner.add("primario___not___starts_with: " + GraphQLRequestSerializer.getEntry(primario___not___starts_with));
        }
        if (primario___ends_with != null) {
            joiner.add("primario___ends_with: " + GraphQLRequestSerializer.getEntry(primario___ends_with));
        }
        if (primario___not___ends_with != null) {
            joiner.add("primario___not___ends_with: " + GraphQLRequestSerializer.getEntry(primario___not___ends_with));
        }
        if (telefono___eq != null) {
            joiner.add("telefono___eq: " + GraphQLRequestSerializer.getEntry(telefono___eq));
        }
        if (telefono___ne != null) {
            joiner.add("telefono___ne: " + GraphQLRequestSerializer.getEntry(telefono___ne));
        }
        if (telefono___null != null) {
            joiner.add("telefono___null: " + GraphQLRequestSerializer.getEntry(telefono___null));
        }
        if (telefono___not___null != null) {
            joiner.add("telefono___not___null: " + GraphQLRequestSerializer.getEntry(telefono___not___null));
        }
        if (telefono___in != null) {
            joiner.add("telefono___in: " + GraphQLRequestSerializer.getEntry(telefono___in));
        }
        if (telefono___not___in != null) {
            joiner.add("telefono___not___in: " + GraphQLRequestSerializer.getEntry(telefono___not___in));
        }
        if (telefono___lt != null) {
            joiner.add("telefono___lt: " + GraphQLRequestSerializer.getEntry(telefono___lt));
        }
        if (telefono___lte != null) {
            joiner.add("telefono___lte: " + GraphQLRequestSerializer.getEntry(telefono___lte));
        }
        if (telefono___gt != null) {
            joiner.add("telefono___gt: " + GraphQLRequestSerializer.getEntry(telefono___gt));
        }
        if (telefono___gte != null) {
            joiner.add("telefono___gte: " + GraphQLRequestSerializer.getEntry(telefono___gte));
        }
        if (telefono___contains != null) {
            joiner.add("telefono___contains: " + GraphQLRequestSerializer.getEntry(telefono___contains));
        }
        if (telefono___not___contains != null) {
            joiner.add("telefono___not___contains: " + GraphQLRequestSerializer.getEntry(telefono___not___contains));
        }
        if (telefono___starts_with != null) {
            joiner.add("telefono___starts_with: " + GraphQLRequestSerializer.getEntry(telefono___starts_with));
        }
        if (telefono___not___starts_with != null) {
            joiner.add("telefono___not___starts_with: " + GraphQLRequestSerializer.getEntry(telefono___not___starts_with));
        }
        if (telefono___ends_with != null) {
            joiner.add("telefono___ends_with: " + GraphQLRequestSerializer.getEntry(telefono___ends_with));
        }
        if (telefono___not___ends_with != null) {
            joiner.add("telefono___not___ends_with: " + GraphQLRequestSerializer.getEntry(telefono___not___ends_with));
        }
        if (trasferimento_a_centro___eq != null) {
            joiner.add("trasferimento_a_centro___eq: " + GraphQLRequestSerializer.getEntry(trasferimento_a_centro___eq));
        }
        if (trasferimento_a_centro___ne != null) {
            joiner.add("trasferimento_a_centro___ne: " + GraphQLRequestSerializer.getEntry(trasferimento_a_centro___ne));
        }
        if (trasferimento_a_centro___null != null) {
            joiner.add("trasferimento_a_centro___null: " + GraphQLRequestSerializer.getEntry(trasferimento_a_centro___null));
        }
        if (trasferimento_a_centro___not___null != null) {
            joiner.add("trasferimento_a_centro___not___null: " + GraphQLRequestSerializer.getEntry(trasferimento_a_centro___not___null));
        }
        if (trasferimento_a_centro___in != null) {
            joiner.add("trasferimento_a_centro___in: " + GraphQLRequestSerializer.getEntry(trasferimento_a_centro___in));
        }
        if (trasferimento_a_centro___not___in != null) {
            joiner.add("trasferimento_a_centro___not___in: " + GraphQLRequestSerializer.getEntry(trasferimento_a_centro___not___in));
        }
        if (trasferimento_a_centro___lt != null) {
            joiner.add("trasferimento_a_centro___lt: " + GraphQLRequestSerializer.getEntry(trasferimento_a_centro___lt));
        }
        if (trasferimento_a_centro___lte != null) {
            joiner.add("trasferimento_a_centro___lte: " + GraphQLRequestSerializer.getEntry(trasferimento_a_centro___lte));
        }
        if (trasferimento_a_centro___gt != null) {
            joiner.add("trasferimento_a_centro___gt: " + GraphQLRequestSerializer.getEntry(trasferimento_a_centro___gt));
        }
        if (trasferimento_a_centro___gte != null) {
            joiner.add("trasferimento_a_centro___gte: " + GraphQLRequestSerializer.getEntry(trasferimento_a_centro___gte));
        }
        if (trasferimento_da_centro___eq != null) {
            joiner.add("trasferimento_da_centro___eq: " + GraphQLRequestSerializer.getEntry(trasferimento_da_centro___eq));
        }
        if (trasferimento_da_centro___ne != null) {
            joiner.add("trasferimento_da_centro___ne: " + GraphQLRequestSerializer.getEntry(trasferimento_da_centro___ne));
        }
        if (trasferimento_da_centro___null != null) {
            joiner.add("trasferimento_da_centro___null: " + GraphQLRequestSerializer.getEntry(trasferimento_da_centro___null));
        }
        if (trasferimento_da_centro___not___null != null) {
            joiner.add("trasferimento_da_centro___not___null: " + GraphQLRequestSerializer.getEntry(trasferimento_da_centro___not___null));
        }
        if (trasferimento_da_centro___in != null) {
            joiner.add("trasferimento_da_centro___in: " + GraphQLRequestSerializer.getEntry(trasferimento_da_centro___in));
        }
        if (trasferimento_da_centro___not___in != null) {
            joiner.add("trasferimento_da_centro___not___in: " + GraphQLRequestSerializer.getEntry(trasferimento_da_centro___not___in));
        }
        if (trasferimento_da_centro___lt != null) {
            joiner.add("trasferimento_da_centro___lt: " + GraphQLRequestSerializer.getEntry(trasferimento_da_centro___lt));
        }
        if (trasferimento_da_centro___lte != null) {
            joiner.add("trasferimento_da_centro___lte: " + GraphQLRequestSerializer.getEntry(trasferimento_da_centro___lte));
        }
        if (trasferimento_da_centro___gt != null) {
            joiner.add("trasferimento_da_centro___gt: " + GraphQLRequestSerializer.getEntry(trasferimento_da_centro___gt));
        }
        if (trasferimento_da_centro___gte != null) {
            joiner.add("trasferimento_da_centro___gte: " + GraphQLRequestSerializer.getEntry(trasferimento_da_centro___gte));
        }
        if (vax___eq != null) {
            joiner.add("vax___eq: " + GraphQLRequestSerializer.getEntry(vax___eq));
        }
        if (vax___ne != null) {
            joiner.add("vax___ne: " + GraphQLRequestSerializer.getEntry(vax___ne));
        }
        if (vax___null != null) {
            joiner.add("vax___null: " + GraphQLRequestSerializer.getEntry(vax___null));
        }
        if (vax___not___null != null) {
            joiner.add("vax___not___null: " + GraphQLRequestSerializer.getEntry(vax___not___null));
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

    public static CliCentroFilterDTO.Builder builder() {
        return new CliCentroFilterDTO.Builder();
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
        private String addetto___eq;
        private String addetto___ne;
        private Boolean addetto___null;
        private Boolean addetto___not___null;
        private java.util.List<String> addetto___in;
        private java.util.List<String> addetto___not___in;
        private String addetto___lt;
        private String addetto___lte;
        private String addetto___gt;
        private String addetto___gte;
        private String addetto___contains;
        private String addetto___not___contains;
        private String addetto___starts_with;
        private String addetto___not___starts_with;
        private String addetto___ends_with;
        private String addetto___not___ends_with;
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
        private String codice_centro___eq;
        private String codice_centro___ne;
        private Boolean codice_centro___null;
        private Boolean codice_centro___not___null;
        private java.util.List<String> codice_centro___in;
        private java.util.List<String> codice_centro___not___in;
        private String codice_centro___lt;
        private String codice_centro___lte;
        private String codice_centro___gt;
        private String codice_centro___gte;
        private String codice_centro___contains;
        private String codice_centro___not___contains;
        private String codice_centro___starts_with;
        private String codice_centro___not___starts_with;
        private String codice_centro___ends_with;
        private String codice_centro___not___ends_with;
        private String email_pro___eq;
        private String email_pro___ne;
        private Boolean email_pro___null;
        private Boolean email_pro___not___null;
        private java.util.List<String> email_pro___in;
        private java.util.List<String> email_pro___not___in;
        private String email_pro___lt;
        private String email_pro___lte;
        private String email_pro___gt;
        private String email_pro___gte;
        private String email_pro___contains;
        private String email_pro___not___contains;
        private String email_pro___starts_with;
        private String email_pro___not___starts_with;
        private String email_pro___ends_with;
        private String email_pro___not___ends_with;
        private Integer gestione_scelta___eq;
        private Integer gestione_scelta___ne;
        private Boolean gestione_scelta___null;
        private Boolean gestione_scelta___not___null;
        private java.util.List<Integer> gestione_scelta___in;
        private java.util.List<Integer> gestione_scelta___not___in;
        private Integer gestione_scelta___lt;
        private Integer gestione_scelta___lte;
        private Integer gestione_scelta___gt;
        private Integer gestione_scelta___gte;
        private Integer in_elenco___eq;
        private Integer in_elenco___ne;
        private Boolean in_elenco___null;
        private Boolean in_elenco___not___null;
        private java.util.List<Integer> in_elenco___in;
        private java.util.List<Integer> in_elenco___not___in;
        private Integer in_elenco___lt;
        private Integer in_elenco___lte;
        private Integer in_elenco___gt;
        private Integer in_elenco___gte;
        private String indirizzo___eq;
        private String indirizzo___ne;
        private Boolean indirizzo___null;
        private Boolean indirizzo___not___null;
        private java.util.List<String> indirizzo___in;
        private java.util.List<String> indirizzo___not___in;
        private String indirizzo___lt;
        private String indirizzo___lte;
        private String indirizzo___gt;
        private String indirizzo___gte;
        private String indirizzo___contains;
        private String indirizzo___not___contains;
        private String indirizzo___starts_with;
        private String indirizzo___not___starts_with;
        private String indirizzo___ends_with;
        private String indirizzo___not___ends_with;
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
        private String primario___eq;
        private String primario___ne;
        private Boolean primario___null;
        private Boolean primario___not___null;
        private java.util.List<String> primario___in;
        private java.util.List<String> primario___not___in;
        private String primario___lt;
        private String primario___lte;
        private String primario___gt;
        private String primario___gte;
        private String primario___contains;
        private String primario___not___contains;
        private String primario___starts_with;
        private String primario___not___starts_with;
        private String primario___ends_with;
        private String primario___not___ends_with;
        private String telefono___eq;
        private String telefono___ne;
        private Boolean telefono___null;
        private Boolean telefono___not___null;
        private java.util.List<String> telefono___in;
        private java.util.List<String> telefono___not___in;
        private String telefono___lt;
        private String telefono___lte;
        private String telefono___gt;
        private String telefono___gte;
        private String telefono___contains;
        private String telefono___not___contains;
        private String telefono___starts_with;
        private String telefono___not___starts_with;
        private String telefono___ends_with;
        private String telefono___not___ends_with;
        private String trasferimento_a_centro___eq;
        private String trasferimento_a_centro___ne;
        private Boolean trasferimento_a_centro___null;
        private Boolean trasferimento_a_centro___not___null;
        private java.util.List<String> trasferimento_a_centro___in;
        private java.util.List<String> trasferimento_a_centro___not___in;
        private String trasferimento_a_centro___lt;
        private String trasferimento_a_centro___lte;
        private String trasferimento_a_centro___gt;
        private String trasferimento_a_centro___gte;
        private String trasferimento_da_centro___eq;
        private String trasferimento_da_centro___ne;
        private Boolean trasferimento_da_centro___null;
        private Boolean trasferimento_da_centro___not___null;
        private java.util.List<String> trasferimento_da_centro___in;
        private java.util.List<String> trasferimento_da_centro___not___in;
        private String trasferimento_da_centro___lt;
        private String trasferimento_da_centro___lte;
        private String trasferimento_da_centro___gt;
        private String trasferimento_da_centro___gte;
        private Boolean vax___eq;
        private Boolean vax___ne;
        private Boolean vax___null;
        private Boolean vax___not___null;
        private java.util.List<CliCentroFilterDTO> AND;
        private java.util.List<CliCentroFilterDTO> OR;
        private CliCentroFilterDTO NOT;

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

        public Builder setAddetto___eq(String addetto___eq) {
            this.addetto___eq = addetto___eq;
            return this;
        }

        public Builder setAddetto___ne(String addetto___ne) {
            this.addetto___ne = addetto___ne;
            return this;
        }

        public Builder setAddetto___null(Boolean addetto___null) {
            this.addetto___null = addetto___null;
            return this;
        }

        public Builder setAddetto___not___null(Boolean addetto___not___null) {
            this.addetto___not___null = addetto___not___null;
            return this;
        }

        public Builder setAddetto___in(java.util.List<String> addetto___in) {
            this.addetto___in = addetto___in;
            return this;
        }

        public Builder setAddetto___not___in(java.util.List<String> addetto___not___in) {
            this.addetto___not___in = addetto___not___in;
            return this;
        }

        public Builder setAddetto___lt(String addetto___lt) {
            this.addetto___lt = addetto___lt;
            return this;
        }

        public Builder setAddetto___lte(String addetto___lte) {
            this.addetto___lte = addetto___lte;
            return this;
        }

        public Builder setAddetto___gt(String addetto___gt) {
            this.addetto___gt = addetto___gt;
            return this;
        }

        public Builder setAddetto___gte(String addetto___gte) {
            this.addetto___gte = addetto___gte;
            return this;
        }

        public Builder setAddetto___contains(String addetto___contains) {
            this.addetto___contains = addetto___contains;
            return this;
        }

        public Builder setAddetto___not___contains(String addetto___not___contains) {
            this.addetto___not___contains = addetto___not___contains;
            return this;
        }

        public Builder setAddetto___starts_with(String addetto___starts_with) {
            this.addetto___starts_with = addetto___starts_with;
            return this;
        }

        public Builder setAddetto___not___starts_with(String addetto___not___starts_with) {
            this.addetto___not___starts_with = addetto___not___starts_with;
            return this;
        }

        public Builder setAddetto___ends_with(String addetto___ends_with) {
            this.addetto___ends_with = addetto___ends_with;
            return this;
        }

        public Builder setAddetto___not___ends_with(String addetto___not___ends_with) {
            this.addetto___not___ends_with = addetto___not___ends_with;
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

        public Builder setCodice_centro___eq(String codice_centro___eq) {
            this.codice_centro___eq = codice_centro___eq;
            return this;
        }

        public Builder setCodice_centro___ne(String codice_centro___ne) {
            this.codice_centro___ne = codice_centro___ne;
            return this;
        }

        public Builder setCodice_centro___null(Boolean codice_centro___null) {
            this.codice_centro___null = codice_centro___null;
            return this;
        }

        public Builder setCodice_centro___not___null(Boolean codice_centro___not___null) {
            this.codice_centro___not___null = codice_centro___not___null;
            return this;
        }

        public Builder setCodice_centro___in(java.util.List<String> codice_centro___in) {
            this.codice_centro___in = codice_centro___in;
            return this;
        }

        public Builder setCodice_centro___not___in(java.util.List<String> codice_centro___not___in) {
            this.codice_centro___not___in = codice_centro___not___in;
            return this;
        }

        public Builder setCodice_centro___lt(String codice_centro___lt) {
            this.codice_centro___lt = codice_centro___lt;
            return this;
        }

        public Builder setCodice_centro___lte(String codice_centro___lte) {
            this.codice_centro___lte = codice_centro___lte;
            return this;
        }

        public Builder setCodice_centro___gt(String codice_centro___gt) {
            this.codice_centro___gt = codice_centro___gt;
            return this;
        }

        public Builder setCodice_centro___gte(String codice_centro___gte) {
            this.codice_centro___gte = codice_centro___gte;
            return this;
        }

        public Builder setCodice_centro___contains(String codice_centro___contains) {
            this.codice_centro___contains = codice_centro___contains;
            return this;
        }

        public Builder setCodice_centro___not___contains(String codice_centro___not___contains) {
            this.codice_centro___not___contains = codice_centro___not___contains;
            return this;
        }

        public Builder setCodice_centro___starts_with(String codice_centro___starts_with) {
            this.codice_centro___starts_with = codice_centro___starts_with;
            return this;
        }

        public Builder setCodice_centro___not___starts_with(String codice_centro___not___starts_with) {
            this.codice_centro___not___starts_with = codice_centro___not___starts_with;
            return this;
        }

        public Builder setCodice_centro___ends_with(String codice_centro___ends_with) {
            this.codice_centro___ends_with = codice_centro___ends_with;
            return this;
        }

        public Builder setCodice_centro___not___ends_with(String codice_centro___not___ends_with) {
            this.codice_centro___not___ends_with = codice_centro___not___ends_with;
            return this;
        }

        public Builder setEmail_pro___eq(String email_pro___eq) {
            this.email_pro___eq = email_pro___eq;
            return this;
        }

        public Builder setEmail_pro___ne(String email_pro___ne) {
            this.email_pro___ne = email_pro___ne;
            return this;
        }

        public Builder setEmail_pro___null(Boolean email_pro___null) {
            this.email_pro___null = email_pro___null;
            return this;
        }

        public Builder setEmail_pro___not___null(Boolean email_pro___not___null) {
            this.email_pro___not___null = email_pro___not___null;
            return this;
        }

        public Builder setEmail_pro___in(java.util.List<String> email_pro___in) {
            this.email_pro___in = email_pro___in;
            return this;
        }

        public Builder setEmail_pro___not___in(java.util.List<String> email_pro___not___in) {
            this.email_pro___not___in = email_pro___not___in;
            return this;
        }

        public Builder setEmail_pro___lt(String email_pro___lt) {
            this.email_pro___lt = email_pro___lt;
            return this;
        }

        public Builder setEmail_pro___lte(String email_pro___lte) {
            this.email_pro___lte = email_pro___lte;
            return this;
        }

        public Builder setEmail_pro___gt(String email_pro___gt) {
            this.email_pro___gt = email_pro___gt;
            return this;
        }

        public Builder setEmail_pro___gte(String email_pro___gte) {
            this.email_pro___gte = email_pro___gte;
            return this;
        }

        public Builder setEmail_pro___contains(String email_pro___contains) {
            this.email_pro___contains = email_pro___contains;
            return this;
        }

        public Builder setEmail_pro___not___contains(String email_pro___not___contains) {
            this.email_pro___not___contains = email_pro___not___contains;
            return this;
        }

        public Builder setEmail_pro___starts_with(String email_pro___starts_with) {
            this.email_pro___starts_with = email_pro___starts_with;
            return this;
        }

        public Builder setEmail_pro___not___starts_with(String email_pro___not___starts_with) {
            this.email_pro___not___starts_with = email_pro___not___starts_with;
            return this;
        }

        public Builder setEmail_pro___ends_with(String email_pro___ends_with) {
            this.email_pro___ends_with = email_pro___ends_with;
            return this;
        }

        public Builder setEmail_pro___not___ends_with(String email_pro___not___ends_with) {
            this.email_pro___not___ends_with = email_pro___not___ends_with;
            return this;
        }

        public Builder setGestione_scelta___eq(Integer gestione_scelta___eq) {
            this.gestione_scelta___eq = gestione_scelta___eq;
            return this;
        }

        public Builder setGestione_scelta___ne(Integer gestione_scelta___ne) {
            this.gestione_scelta___ne = gestione_scelta___ne;
            return this;
        }

        public Builder setGestione_scelta___null(Boolean gestione_scelta___null) {
            this.gestione_scelta___null = gestione_scelta___null;
            return this;
        }

        public Builder setGestione_scelta___not___null(Boolean gestione_scelta___not___null) {
            this.gestione_scelta___not___null = gestione_scelta___not___null;
            return this;
        }

        public Builder setGestione_scelta___in(java.util.List<Integer> gestione_scelta___in) {
            this.gestione_scelta___in = gestione_scelta___in;
            return this;
        }

        public Builder setGestione_scelta___not___in(java.util.List<Integer> gestione_scelta___not___in) {
            this.gestione_scelta___not___in = gestione_scelta___not___in;
            return this;
        }

        public Builder setGestione_scelta___lt(Integer gestione_scelta___lt) {
            this.gestione_scelta___lt = gestione_scelta___lt;
            return this;
        }

        public Builder setGestione_scelta___lte(Integer gestione_scelta___lte) {
            this.gestione_scelta___lte = gestione_scelta___lte;
            return this;
        }

        public Builder setGestione_scelta___gt(Integer gestione_scelta___gt) {
            this.gestione_scelta___gt = gestione_scelta___gt;
            return this;
        }

        public Builder setGestione_scelta___gte(Integer gestione_scelta___gte) {
            this.gestione_scelta___gte = gestione_scelta___gte;
            return this;
        }

        public Builder setIn_elenco___eq(Integer in_elenco___eq) {
            this.in_elenco___eq = in_elenco___eq;
            return this;
        }

        public Builder setIn_elenco___ne(Integer in_elenco___ne) {
            this.in_elenco___ne = in_elenco___ne;
            return this;
        }

        public Builder setIn_elenco___null(Boolean in_elenco___null) {
            this.in_elenco___null = in_elenco___null;
            return this;
        }

        public Builder setIn_elenco___not___null(Boolean in_elenco___not___null) {
            this.in_elenco___not___null = in_elenco___not___null;
            return this;
        }

        public Builder setIn_elenco___in(java.util.List<Integer> in_elenco___in) {
            this.in_elenco___in = in_elenco___in;
            return this;
        }

        public Builder setIn_elenco___not___in(java.util.List<Integer> in_elenco___not___in) {
            this.in_elenco___not___in = in_elenco___not___in;
            return this;
        }

        public Builder setIn_elenco___lt(Integer in_elenco___lt) {
            this.in_elenco___lt = in_elenco___lt;
            return this;
        }

        public Builder setIn_elenco___lte(Integer in_elenco___lte) {
            this.in_elenco___lte = in_elenco___lte;
            return this;
        }

        public Builder setIn_elenco___gt(Integer in_elenco___gt) {
            this.in_elenco___gt = in_elenco___gt;
            return this;
        }

        public Builder setIn_elenco___gte(Integer in_elenco___gte) {
            this.in_elenco___gte = in_elenco___gte;
            return this;
        }

        public Builder setIndirizzo___eq(String indirizzo___eq) {
            this.indirizzo___eq = indirizzo___eq;
            return this;
        }

        public Builder setIndirizzo___ne(String indirizzo___ne) {
            this.indirizzo___ne = indirizzo___ne;
            return this;
        }

        public Builder setIndirizzo___null(Boolean indirizzo___null) {
            this.indirizzo___null = indirizzo___null;
            return this;
        }

        public Builder setIndirizzo___not___null(Boolean indirizzo___not___null) {
            this.indirizzo___not___null = indirizzo___not___null;
            return this;
        }

        public Builder setIndirizzo___in(java.util.List<String> indirizzo___in) {
            this.indirizzo___in = indirizzo___in;
            return this;
        }

        public Builder setIndirizzo___not___in(java.util.List<String> indirizzo___not___in) {
            this.indirizzo___not___in = indirizzo___not___in;
            return this;
        }

        public Builder setIndirizzo___lt(String indirizzo___lt) {
            this.indirizzo___lt = indirizzo___lt;
            return this;
        }

        public Builder setIndirizzo___lte(String indirizzo___lte) {
            this.indirizzo___lte = indirizzo___lte;
            return this;
        }

        public Builder setIndirizzo___gt(String indirizzo___gt) {
            this.indirizzo___gt = indirizzo___gt;
            return this;
        }

        public Builder setIndirizzo___gte(String indirizzo___gte) {
            this.indirizzo___gte = indirizzo___gte;
            return this;
        }

        public Builder setIndirizzo___contains(String indirizzo___contains) {
            this.indirizzo___contains = indirizzo___contains;
            return this;
        }

        public Builder setIndirizzo___not___contains(String indirizzo___not___contains) {
            this.indirizzo___not___contains = indirizzo___not___contains;
            return this;
        }

        public Builder setIndirizzo___starts_with(String indirizzo___starts_with) {
            this.indirizzo___starts_with = indirizzo___starts_with;
            return this;
        }

        public Builder setIndirizzo___not___starts_with(String indirizzo___not___starts_with) {
            this.indirizzo___not___starts_with = indirizzo___not___starts_with;
            return this;
        }

        public Builder setIndirizzo___ends_with(String indirizzo___ends_with) {
            this.indirizzo___ends_with = indirizzo___ends_with;
            return this;
        }

        public Builder setIndirizzo___not___ends_with(String indirizzo___not___ends_with) {
            this.indirizzo___not___ends_with = indirizzo___not___ends_with;
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

        public Builder setPrimario___eq(String primario___eq) {
            this.primario___eq = primario___eq;
            return this;
        }

        public Builder setPrimario___ne(String primario___ne) {
            this.primario___ne = primario___ne;
            return this;
        }

        public Builder setPrimario___null(Boolean primario___null) {
            this.primario___null = primario___null;
            return this;
        }

        public Builder setPrimario___not___null(Boolean primario___not___null) {
            this.primario___not___null = primario___not___null;
            return this;
        }

        public Builder setPrimario___in(java.util.List<String> primario___in) {
            this.primario___in = primario___in;
            return this;
        }

        public Builder setPrimario___not___in(java.util.List<String> primario___not___in) {
            this.primario___not___in = primario___not___in;
            return this;
        }

        public Builder setPrimario___lt(String primario___lt) {
            this.primario___lt = primario___lt;
            return this;
        }

        public Builder setPrimario___lte(String primario___lte) {
            this.primario___lte = primario___lte;
            return this;
        }

        public Builder setPrimario___gt(String primario___gt) {
            this.primario___gt = primario___gt;
            return this;
        }

        public Builder setPrimario___gte(String primario___gte) {
            this.primario___gte = primario___gte;
            return this;
        }

        public Builder setPrimario___contains(String primario___contains) {
            this.primario___contains = primario___contains;
            return this;
        }

        public Builder setPrimario___not___contains(String primario___not___contains) {
            this.primario___not___contains = primario___not___contains;
            return this;
        }

        public Builder setPrimario___starts_with(String primario___starts_with) {
            this.primario___starts_with = primario___starts_with;
            return this;
        }

        public Builder setPrimario___not___starts_with(String primario___not___starts_with) {
            this.primario___not___starts_with = primario___not___starts_with;
            return this;
        }

        public Builder setPrimario___ends_with(String primario___ends_with) {
            this.primario___ends_with = primario___ends_with;
            return this;
        }

        public Builder setPrimario___not___ends_with(String primario___not___ends_with) {
            this.primario___not___ends_with = primario___not___ends_with;
            return this;
        }

        public Builder setTelefono___eq(String telefono___eq) {
            this.telefono___eq = telefono___eq;
            return this;
        }

        public Builder setTelefono___ne(String telefono___ne) {
            this.telefono___ne = telefono___ne;
            return this;
        }

        public Builder setTelefono___null(Boolean telefono___null) {
            this.telefono___null = telefono___null;
            return this;
        }

        public Builder setTelefono___not___null(Boolean telefono___not___null) {
            this.telefono___not___null = telefono___not___null;
            return this;
        }

        public Builder setTelefono___in(java.util.List<String> telefono___in) {
            this.telefono___in = telefono___in;
            return this;
        }

        public Builder setTelefono___not___in(java.util.List<String> telefono___not___in) {
            this.telefono___not___in = telefono___not___in;
            return this;
        }

        public Builder setTelefono___lt(String telefono___lt) {
            this.telefono___lt = telefono___lt;
            return this;
        }

        public Builder setTelefono___lte(String telefono___lte) {
            this.telefono___lte = telefono___lte;
            return this;
        }

        public Builder setTelefono___gt(String telefono___gt) {
            this.telefono___gt = telefono___gt;
            return this;
        }

        public Builder setTelefono___gte(String telefono___gte) {
            this.telefono___gte = telefono___gte;
            return this;
        }

        public Builder setTelefono___contains(String telefono___contains) {
            this.telefono___contains = telefono___contains;
            return this;
        }

        public Builder setTelefono___not___contains(String telefono___not___contains) {
            this.telefono___not___contains = telefono___not___contains;
            return this;
        }

        public Builder setTelefono___starts_with(String telefono___starts_with) {
            this.telefono___starts_with = telefono___starts_with;
            return this;
        }

        public Builder setTelefono___not___starts_with(String telefono___not___starts_with) {
            this.telefono___not___starts_with = telefono___not___starts_with;
            return this;
        }

        public Builder setTelefono___ends_with(String telefono___ends_with) {
            this.telefono___ends_with = telefono___ends_with;
            return this;
        }

        public Builder setTelefono___not___ends_with(String telefono___not___ends_with) {
            this.telefono___not___ends_with = telefono___not___ends_with;
            return this;
        }

        public Builder setTrasferimento_a_centro___eq(String trasferimento_a_centro___eq) {
            this.trasferimento_a_centro___eq = trasferimento_a_centro___eq;
            return this;
        }

        public Builder setTrasferimento_a_centro___ne(String trasferimento_a_centro___ne) {
            this.trasferimento_a_centro___ne = trasferimento_a_centro___ne;
            return this;
        }

        public Builder setTrasferimento_a_centro___null(Boolean trasferimento_a_centro___null) {
            this.trasferimento_a_centro___null = trasferimento_a_centro___null;
            return this;
        }

        public Builder setTrasferimento_a_centro___not___null(Boolean trasferimento_a_centro___not___null) {
            this.trasferimento_a_centro___not___null = trasferimento_a_centro___not___null;
            return this;
        }

        public Builder setTrasferimento_a_centro___in(java.util.List<String> trasferimento_a_centro___in) {
            this.trasferimento_a_centro___in = trasferimento_a_centro___in;
            return this;
        }

        public Builder setTrasferimento_a_centro___not___in(java.util.List<String> trasferimento_a_centro___not___in) {
            this.trasferimento_a_centro___not___in = trasferimento_a_centro___not___in;
            return this;
        }

        public Builder setTrasferimento_a_centro___lt(String trasferimento_a_centro___lt) {
            this.trasferimento_a_centro___lt = trasferimento_a_centro___lt;
            return this;
        }

        public Builder setTrasferimento_a_centro___lte(String trasferimento_a_centro___lte) {
            this.trasferimento_a_centro___lte = trasferimento_a_centro___lte;
            return this;
        }

        public Builder setTrasferimento_a_centro___gt(String trasferimento_a_centro___gt) {
            this.trasferimento_a_centro___gt = trasferimento_a_centro___gt;
            return this;
        }

        public Builder setTrasferimento_a_centro___gte(String trasferimento_a_centro___gte) {
            this.trasferimento_a_centro___gte = trasferimento_a_centro___gte;
            return this;
        }

        public Builder setTrasferimento_da_centro___eq(String trasferimento_da_centro___eq) {
            this.trasferimento_da_centro___eq = trasferimento_da_centro___eq;
            return this;
        }

        public Builder setTrasferimento_da_centro___ne(String trasferimento_da_centro___ne) {
            this.trasferimento_da_centro___ne = trasferimento_da_centro___ne;
            return this;
        }

        public Builder setTrasferimento_da_centro___null(Boolean trasferimento_da_centro___null) {
            this.trasferimento_da_centro___null = trasferimento_da_centro___null;
            return this;
        }

        public Builder setTrasferimento_da_centro___not___null(Boolean trasferimento_da_centro___not___null) {
            this.trasferimento_da_centro___not___null = trasferimento_da_centro___not___null;
            return this;
        }

        public Builder setTrasferimento_da_centro___in(java.util.List<String> trasferimento_da_centro___in) {
            this.trasferimento_da_centro___in = trasferimento_da_centro___in;
            return this;
        }

        public Builder setTrasferimento_da_centro___not___in(java.util.List<String> trasferimento_da_centro___not___in) {
            this.trasferimento_da_centro___not___in = trasferimento_da_centro___not___in;
            return this;
        }

        public Builder setTrasferimento_da_centro___lt(String trasferimento_da_centro___lt) {
            this.trasferimento_da_centro___lt = trasferimento_da_centro___lt;
            return this;
        }

        public Builder setTrasferimento_da_centro___lte(String trasferimento_da_centro___lte) {
            this.trasferimento_da_centro___lte = trasferimento_da_centro___lte;
            return this;
        }

        public Builder setTrasferimento_da_centro___gt(String trasferimento_da_centro___gt) {
            this.trasferimento_da_centro___gt = trasferimento_da_centro___gt;
            return this;
        }

        public Builder setTrasferimento_da_centro___gte(String trasferimento_da_centro___gte) {
            this.trasferimento_da_centro___gte = trasferimento_da_centro___gte;
            return this;
        }

        public Builder setVax___eq(Boolean vax___eq) {
            this.vax___eq = vax___eq;
            return this;
        }

        public Builder setVax___ne(Boolean vax___ne) {
            this.vax___ne = vax___ne;
            return this;
        }

        public Builder setVax___null(Boolean vax___null) {
            this.vax___null = vax___null;
            return this;
        }

        public Builder setVax___not___null(Boolean vax___not___null) {
            this.vax___not___null = vax___not___null;
            return this;
        }

        public Builder setAND(java.util.List<CliCentroFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliCentroFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliCentroFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliCentroFilterDTO build() {
            CliCentroFilterDTO result = new CliCentroFilterDTO();
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
            result.setAddetto___eq(this.addetto___eq);
            result.setAddetto___ne(this.addetto___ne);
            result.setAddetto___null(this.addetto___null);
            result.setAddetto___not___null(this.addetto___not___null);
            result.setAddetto___in(this.addetto___in);
            result.setAddetto___not___in(this.addetto___not___in);
            result.setAddetto___lt(this.addetto___lt);
            result.setAddetto___lte(this.addetto___lte);
            result.setAddetto___gt(this.addetto___gt);
            result.setAddetto___gte(this.addetto___gte);
            result.setAddetto___contains(this.addetto___contains);
            result.setAddetto___not___contains(this.addetto___not___contains);
            result.setAddetto___starts_with(this.addetto___starts_with);
            result.setAddetto___not___starts_with(this.addetto___not___starts_with);
            result.setAddetto___ends_with(this.addetto___ends_with);
            result.setAddetto___not___ends_with(this.addetto___not___ends_with);
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
            result.setCodice_centro___eq(this.codice_centro___eq);
            result.setCodice_centro___ne(this.codice_centro___ne);
            result.setCodice_centro___null(this.codice_centro___null);
            result.setCodice_centro___not___null(this.codice_centro___not___null);
            result.setCodice_centro___in(this.codice_centro___in);
            result.setCodice_centro___not___in(this.codice_centro___not___in);
            result.setCodice_centro___lt(this.codice_centro___lt);
            result.setCodice_centro___lte(this.codice_centro___lte);
            result.setCodice_centro___gt(this.codice_centro___gt);
            result.setCodice_centro___gte(this.codice_centro___gte);
            result.setCodice_centro___contains(this.codice_centro___contains);
            result.setCodice_centro___not___contains(this.codice_centro___not___contains);
            result.setCodice_centro___starts_with(this.codice_centro___starts_with);
            result.setCodice_centro___not___starts_with(this.codice_centro___not___starts_with);
            result.setCodice_centro___ends_with(this.codice_centro___ends_with);
            result.setCodice_centro___not___ends_with(this.codice_centro___not___ends_with);
            result.setEmail_pro___eq(this.email_pro___eq);
            result.setEmail_pro___ne(this.email_pro___ne);
            result.setEmail_pro___null(this.email_pro___null);
            result.setEmail_pro___not___null(this.email_pro___not___null);
            result.setEmail_pro___in(this.email_pro___in);
            result.setEmail_pro___not___in(this.email_pro___not___in);
            result.setEmail_pro___lt(this.email_pro___lt);
            result.setEmail_pro___lte(this.email_pro___lte);
            result.setEmail_pro___gt(this.email_pro___gt);
            result.setEmail_pro___gte(this.email_pro___gte);
            result.setEmail_pro___contains(this.email_pro___contains);
            result.setEmail_pro___not___contains(this.email_pro___not___contains);
            result.setEmail_pro___starts_with(this.email_pro___starts_with);
            result.setEmail_pro___not___starts_with(this.email_pro___not___starts_with);
            result.setEmail_pro___ends_with(this.email_pro___ends_with);
            result.setEmail_pro___not___ends_with(this.email_pro___not___ends_with);
            result.setGestione_scelta___eq(this.gestione_scelta___eq);
            result.setGestione_scelta___ne(this.gestione_scelta___ne);
            result.setGestione_scelta___null(this.gestione_scelta___null);
            result.setGestione_scelta___not___null(this.gestione_scelta___not___null);
            result.setGestione_scelta___in(this.gestione_scelta___in);
            result.setGestione_scelta___not___in(this.gestione_scelta___not___in);
            result.setGestione_scelta___lt(this.gestione_scelta___lt);
            result.setGestione_scelta___lte(this.gestione_scelta___lte);
            result.setGestione_scelta___gt(this.gestione_scelta___gt);
            result.setGestione_scelta___gte(this.gestione_scelta___gte);
            result.setIn_elenco___eq(this.in_elenco___eq);
            result.setIn_elenco___ne(this.in_elenco___ne);
            result.setIn_elenco___null(this.in_elenco___null);
            result.setIn_elenco___not___null(this.in_elenco___not___null);
            result.setIn_elenco___in(this.in_elenco___in);
            result.setIn_elenco___not___in(this.in_elenco___not___in);
            result.setIn_elenco___lt(this.in_elenco___lt);
            result.setIn_elenco___lte(this.in_elenco___lte);
            result.setIn_elenco___gt(this.in_elenco___gt);
            result.setIn_elenco___gte(this.in_elenco___gte);
            result.setIndirizzo___eq(this.indirizzo___eq);
            result.setIndirizzo___ne(this.indirizzo___ne);
            result.setIndirizzo___null(this.indirizzo___null);
            result.setIndirizzo___not___null(this.indirizzo___not___null);
            result.setIndirizzo___in(this.indirizzo___in);
            result.setIndirizzo___not___in(this.indirizzo___not___in);
            result.setIndirizzo___lt(this.indirizzo___lt);
            result.setIndirizzo___lte(this.indirizzo___lte);
            result.setIndirizzo___gt(this.indirizzo___gt);
            result.setIndirizzo___gte(this.indirizzo___gte);
            result.setIndirizzo___contains(this.indirizzo___contains);
            result.setIndirizzo___not___contains(this.indirizzo___not___contains);
            result.setIndirizzo___starts_with(this.indirizzo___starts_with);
            result.setIndirizzo___not___starts_with(this.indirizzo___not___starts_with);
            result.setIndirizzo___ends_with(this.indirizzo___ends_with);
            result.setIndirizzo___not___ends_with(this.indirizzo___not___ends_with);
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
            result.setPrimario___eq(this.primario___eq);
            result.setPrimario___ne(this.primario___ne);
            result.setPrimario___null(this.primario___null);
            result.setPrimario___not___null(this.primario___not___null);
            result.setPrimario___in(this.primario___in);
            result.setPrimario___not___in(this.primario___not___in);
            result.setPrimario___lt(this.primario___lt);
            result.setPrimario___lte(this.primario___lte);
            result.setPrimario___gt(this.primario___gt);
            result.setPrimario___gte(this.primario___gte);
            result.setPrimario___contains(this.primario___contains);
            result.setPrimario___not___contains(this.primario___not___contains);
            result.setPrimario___starts_with(this.primario___starts_with);
            result.setPrimario___not___starts_with(this.primario___not___starts_with);
            result.setPrimario___ends_with(this.primario___ends_with);
            result.setPrimario___not___ends_with(this.primario___not___ends_with);
            result.setTelefono___eq(this.telefono___eq);
            result.setTelefono___ne(this.telefono___ne);
            result.setTelefono___null(this.telefono___null);
            result.setTelefono___not___null(this.telefono___not___null);
            result.setTelefono___in(this.telefono___in);
            result.setTelefono___not___in(this.telefono___not___in);
            result.setTelefono___lt(this.telefono___lt);
            result.setTelefono___lte(this.telefono___lte);
            result.setTelefono___gt(this.telefono___gt);
            result.setTelefono___gte(this.telefono___gte);
            result.setTelefono___contains(this.telefono___contains);
            result.setTelefono___not___contains(this.telefono___not___contains);
            result.setTelefono___starts_with(this.telefono___starts_with);
            result.setTelefono___not___starts_with(this.telefono___not___starts_with);
            result.setTelefono___ends_with(this.telefono___ends_with);
            result.setTelefono___not___ends_with(this.telefono___not___ends_with);
            result.setTrasferimento_a_centro___eq(this.trasferimento_a_centro___eq);
            result.setTrasferimento_a_centro___ne(this.trasferimento_a_centro___ne);
            result.setTrasferimento_a_centro___null(this.trasferimento_a_centro___null);
            result.setTrasferimento_a_centro___not___null(this.trasferimento_a_centro___not___null);
            result.setTrasferimento_a_centro___in(this.trasferimento_a_centro___in);
            result.setTrasferimento_a_centro___not___in(this.trasferimento_a_centro___not___in);
            result.setTrasferimento_a_centro___lt(this.trasferimento_a_centro___lt);
            result.setTrasferimento_a_centro___lte(this.trasferimento_a_centro___lte);
            result.setTrasferimento_a_centro___gt(this.trasferimento_a_centro___gt);
            result.setTrasferimento_a_centro___gte(this.trasferimento_a_centro___gte);
            result.setTrasferimento_da_centro___eq(this.trasferimento_da_centro___eq);
            result.setTrasferimento_da_centro___ne(this.trasferimento_da_centro___ne);
            result.setTrasferimento_da_centro___null(this.trasferimento_da_centro___null);
            result.setTrasferimento_da_centro___not___null(this.trasferimento_da_centro___not___null);
            result.setTrasferimento_da_centro___in(this.trasferimento_da_centro___in);
            result.setTrasferimento_da_centro___not___in(this.trasferimento_da_centro___not___in);
            result.setTrasferimento_da_centro___lt(this.trasferimento_da_centro___lt);
            result.setTrasferimento_da_centro___lte(this.trasferimento_da_centro___lte);
            result.setTrasferimento_da_centro___gt(this.trasferimento_da_centro___gt);
            result.setTrasferimento_da_centro___gte(this.trasferimento_da_centro___gte);
            result.setVax___eq(this.vax___eq);
            result.setVax___ne(this.vax___ne);
            result.setVax___null(this.vax___null);
            result.setVax___not___null(this.vax___not___null);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
