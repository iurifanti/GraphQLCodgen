package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Mutazione.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMutazioneFilterDTO implements java.io.Serializable {

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
    private String aa1___eq;
    private String aa1___ne;
    private Boolean aa1___null;
    private Boolean aa1___not___null;
    private java.util.List<String> aa1___in;
    private java.util.List<String> aa1___not___in;
    private String aa1___lt;
    private String aa1___lte;
    private String aa1___gt;
    private String aa1___gte;
    private String aa1___contains;
    private String aa1___not___contains;
    private String aa1___starts_with;
    private String aa1___not___starts_with;
    private String aa1___ends_with;
    private String aa1___not___ends_with;
    private String aa2___eq;
    private String aa2___ne;
    private Boolean aa2___null;
    private Boolean aa2___not___null;
    private java.util.List<String> aa2___in;
    private java.util.List<String> aa2___not___in;
    private String aa2___lt;
    private String aa2___lte;
    private String aa2___gt;
    private String aa2___gte;
    private String aa2___contains;
    private String aa2___not___contains;
    private String aa2___starts_with;
    private String aa2___not___starts_with;
    private String aa2___ends_with;
    private String aa2___not___ends_with;
    private String aa3___eq;
    private String aa3___ne;
    private Boolean aa3___null;
    private Boolean aa3___not___null;
    private java.util.List<String> aa3___in;
    private java.util.List<String> aa3___not___in;
    private String aa3___lt;
    private String aa3___lte;
    private String aa3___gt;
    private String aa3___gte;
    private String aa3___contains;
    private String aa3___not___contains;
    private String aa3___starts_with;
    private String aa3___not___starts_with;
    private String aa3___ends_with;
    private String aa3___not___ends_with;
    private String aa4___eq;
    private String aa4___ne;
    private Boolean aa4___null;
    private Boolean aa4___not___null;
    private java.util.List<String> aa4___in;
    private java.util.List<String> aa4___not___in;
    private String aa4___lt;
    private String aa4___lte;
    private String aa4___gt;
    private String aa4___gte;
    private String aa4___contains;
    private String aa4___not___contains;
    private String aa4___starts_with;
    private String aa4___not___starts_with;
    private String aa4___ends_with;
    private String aa4___not___ends_with;
    private String aa5___eq;
    private String aa5___ne;
    private Boolean aa5___null;
    private Boolean aa5___not___null;
    private java.util.List<String> aa5___in;
    private java.util.List<String> aa5___not___in;
    private String aa5___lt;
    private String aa5___lte;
    private String aa5___gt;
    private String aa5___gte;
    private String aa5___contains;
    private String aa5___not___contains;
    private String aa5___starts_with;
    private String aa5___not___starts_with;
    private String aa5___ends_with;
    private String aa5___not___ends_with;
    private Boolean deletion___eq;
    private Boolean deletion___ne;
    private Boolean deletion___null;
    private Boolean deletion___not___null;
    private Boolean insert___eq;
    private Boolean insert___ne;
    private Boolean insert___null;
    private Boolean insert___not___null;
    private Boolean no_farmaco___eq;
    private Boolean no_farmaco___ne;
    private Boolean no_farmaco___null;
    private Boolean no_farmaco___not___null;
    private String object_title___eq;
    private String object_title___ne;
    private Boolean object_title___null;
    private Boolean object_title___not___null;
    private java.util.List<String> object_title___in;
    private java.util.List<String> object_title___not___in;
    private String object_title___lt;
    private String object_title___lte;
    private String object_title___gt;
    private String object_title___gte;
    private String object_title___contains;
    private String object_title___not___contains;
    private String object_title___starts_with;
    private String object_title___not___starts_with;
    private String object_title___ends_with;
    private String object_title___not___ends_with;
    private Integer posizione___eq;
    private Integer posizione___ne;
    private Boolean posizione___null;
    private Boolean posizione___not___null;
    private java.util.List<Integer> posizione___in;
    private java.util.List<Integer> posizione___not___in;
    private Integer posizione___lt;
    private Integer posizione___lte;
    private Integer posizione___gt;
    private Integer posizione___gte;
    private String regione_genoma___eq;
    private String regione_genoma___ne;
    private Boolean regione_genoma___null;
    private Boolean regione_genoma___not___null;
    private java.util.List<String> regione_genoma___in;
    private java.util.List<String> regione_genoma___not___in;
    private String regione_genoma___lt;
    private String regione_genoma___lte;
    private String regione_genoma___gt;
    private String regione_genoma___gte;
    private String regione_genoma___contains;
    private String regione_genoma___not___contains;
    private String regione_genoma___starts_with;
    private String regione_genoma___not___starts_with;
    private String regione_genoma___ends_with;
    private String regione_genoma___not___ends_with;
    private Boolean shift___eq;
    private Boolean shift___ne;
    private Boolean shift___null;
    private Boolean shift___not___null;
    private Integer temp_id___eq;
    private Integer temp_id___ne;
    private Boolean temp_id___null;
    private Boolean temp_id___not___null;
    private java.util.List<Integer> temp_id___in;
    private java.util.List<Integer> temp_id___not___in;
    private Integer temp_id___lt;
    private Integer temp_id___lte;
    private Integer temp_id___gt;
    private Integer temp_id___gte;
    private java.util.List<CliMutazioneFilterDTO> AND;
    private java.util.List<CliMutazioneFilterDTO> OR;
    private CliMutazioneFilterDTO NOT;

    public CliMutazioneFilterDTO() {
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

    public String getAa1___eq() {
        return aa1___eq;
    }
    public void setAa1___eq(String aa1___eq) {
        this.aa1___eq = aa1___eq;
    }

    public String getAa1___ne() {
        return aa1___ne;
    }
    public void setAa1___ne(String aa1___ne) {
        this.aa1___ne = aa1___ne;
    }

    public Boolean getAa1___null() {
        return aa1___null;
    }
    public void setAa1___null(Boolean aa1___null) {
        this.aa1___null = aa1___null;
    }

    public Boolean getAa1___not___null() {
        return aa1___not___null;
    }
    public void setAa1___not___null(Boolean aa1___not___null) {
        this.aa1___not___null = aa1___not___null;
    }

    public java.util.List<String> getAa1___in() {
        return aa1___in;
    }
    public void setAa1___in(java.util.List<String> aa1___in) {
        this.aa1___in = aa1___in;
    }

    public java.util.List<String> getAa1___not___in() {
        return aa1___not___in;
    }
    public void setAa1___not___in(java.util.List<String> aa1___not___in) {
        this.aa1___not___in = aa1___not___in;
    }

    public String getAa1___lt() {
        return aa1___lt;
    }
    public void setAa1___lt(String aa1___lt) {
        this.aa1___lt = aa1___lt;
    }

    public String getAa1___lte() {
        return aa1___lte;
    }
    public void setAa1___lte(String aa1___lte) {
        this.aa1___lte = aa1___lte;
    }

    public String getAa1___gt() {
        return aa1___gt;
    }
    public void setAa1___gt(String aa1___gt) {
        this.aa1___gt = aa1___gt;
    }

    public String getAa1___gte() {
        return aa1___gte;
    }
    public void setAa1___gte(String aa1___gte) {
        this.aa1___gte = aa1___gte;
    }

    public String getAa1___contains() {
        return aa1___contains;
    }
    public void setAa1___contains(String aa1___contains) {
        this.aa1___contains = aa1___contains;
    }

    public String getAa1___not___contains() {
        return aa1___not___contains;
    }
    public void setAa1___not___contains(String aa1___not___contains) {
        this.aa1___not___contains = aa1___not___contains;
    }

    public String getAa1___starts_with() {
        return aa1___starts_with;
    }
    public void setAa1___starts_with(String aa1___starts_with) {
        this.aa1___starts_with = aa1___starts_with;
    }

    public String getAa1___not___starts_with() {
        return aa1___not___starts_with;
    }
    public void setAa1___not___starts_with(String aa1___not___starts_with) {
        this.aa1___not___starts_with = aa1___not___starts_with;
    }

    public String getAa1___ends_with() {
        return aa1___ends_with;
    }
    public void setAa1___ends_with(String aa1___ends_with) {
        this.aa1___ends_with = aa1___ends_with;
    }

    public String getAa1___not___ends_with() {
        return aa1___not___ends_with;
    }
    public void setAa1___not___ends_with(String aa1___not___ends_with) {
        this.aa1___not___ends_with = aa1___not___ends_with;
    }

    public String getAa2___eq() {
        return aa2___eq;
    }
    public void setAa2___eq(String aa2___eq) {
        this.aa2___eq = aa2___eq;
    }

    public String getAa2___ne() {
        return aa2___ne;
    }
    public void setAa2___ne(String aa2___ne) {
        this.aa2___ne = aa2___ne;
    }

    public Boolean getAa2___null() {
        return aa2___null;
    }
    public void setAa2___null(Boolean aa2___null) {
        this.aa2___null = aa2___null;
    }

    public Boolean getAa2___not___null() {
        return aa2___not___null;
    }
    public void setAa2___not___null(Boolean aa2___not___null) {
        this.aa2___not___null = aa2___not___null;
    }

    public java.util.List<String> getAa2___in() {
        return aa2___in;
    }
    public void setAa2___in(java.util.List<String> aa2___in) {
        this.aa2___in = aa2___in;
    }

    public java.util.List<String> getAa2___not___in() {
        return aa2___not___in;
    }
    public void setAa2___not___in(java.util.List<String> aa2___not___in) {
        this.aa2___not___in = aa2___not___in;
    }

    public String getAa2___lt() {
        return aa2___lt;
    }
    public void setAa2___lt(String aa2___lt) {
        this.aa2___lt = aa2___lt;
    }

    public String getAa2___lte() {
        return aa2___lte;
    }
    public void setAa2___lte(String aa2___lte) {
        this.aa2___lte = aa2___lte;
    }

    public String getAa2___gt() {
        return aa2___gt;
    }
    public void setAa2___gt(String aa2___gt) {
        this.aa2___gt = aa2___gt;
    }

    public String getAa2___gte() {
        return aa2___gte;
    }
    public void setAa2___gte(String aa2___gte) {
        this.aa2___gte = aa2___gte;
    }

    public String getAa2___contains() {
        return aa2___contains;
    }
    public void setAa2___contains(String aa2___contains) {
        this.aa2___contains = aa2___contains;
    }

    public String getAa2___not___contains() {
        return aa2___not___contains;
    }
    public void setAa2___not___contains(String aa2___not___contains) {
        this.aa2___not___contains = aa2___not___contains;
    }

    public String getAa2___starts_with() {
        return aa2___starts_with;
    }
    public void setAa2___starts_with(String aa2___starts_with) {
        this.aa2___starts_with = aa2___starts_with;
    }

    public String getAa2___not___starts_with() {
        return aa2___not___starts_with;
    }
    public void setAa2___not___starts_with(String aa2___not___starts_with) {
        this.aa2___not___starts_with = aa2___not___starts_with;
    }

    public String getAa2___ends_with() {
        return aa2___ends_with;
    }
    public void setAa2___ends_with(String aa2___ends_with) {
        this.aa2___ends_with = aa2___ends_with;
    }

    public String getAa2___not___ends_with() {
        return aa2___not___ends_with;
    }
    public void setAa2___not___ends_with(String aa2___not___ends_with) {
        this.aa2___not___ends_with = aa2___not___ends_with;
    }

    public String getAa3___eq() {
        return aa3___eq;
    }
    public void setAa3___eq(String aa3___eq) {
        this.aa3___eq = aa3___eq;
    }

    public String getAa3___ne() {
        return aa3___ne;
    }
    public void setAa3___ne(String aa3___ne) {
        this.aa3___ne = aa3___ne;
    }

    public Boolean getAa3___null() {
        return aa3___null;
    }
    public void setAa3___null(Boolean aa3___null) {
        this.aa3___null = aa3___null;
    }

    public Boolean getAa3___not___null() {
        return aa3___not___null;
    }
    public void setAa3___not___null(Boolean aa3___not___null) {
        this.aa3___not___null = aa3___not___null;
    }

    public java.util.List<String> getAa3___in() {
        return aa3___in;
    }
    public void setAa3___in(java.util.List<String> aa3___in) {
        this.aa3___in = aa3___in;
    }

    public java.util.List<String> getAa3___not___in() {
        return aa3___not___in;
    }
    public void setAa3___not___in(java.util.List<String> aa3___not___in) {
        this.aa3___not___in = aa3___not___in;
    }

    public String getAa3___lt() {
        return aa3___lt;
    }
    public void setAa3___lt(String aa3___lt) {
        this.aa3___lt = aa3___lt;
    }

    public String getAa3___lte() {
        return aa3___lte;
    }
    public void setAa3___lte(String aa3___lte) {
        this.aa3___lte = aa3___lte;
    }

    public String getAa3___gt() {
        return aa3___gt;
    }
    public void setAa3___gt(String aa3___gt) {
        this.aa3___gt = aa3___gt;
    }

    public String getAa3___gte() {
        return aa3___gte;
    }
    public void setAa3___gte(String aa3___gte) {
        this.aa3___gte = aa3___gte;
    }

    public String getAa3___contains() {
        return aa3___contains;
    }
    public void setAa3___contains(String aa3___contains) {
        this.aa3___contains = aa3___contains;
    }

    public String getAa3___not___contains() {
        return aa3___not___contains;
    }
    public void setAa3___not___contains(String aa3___not___contains) {
        this.aa3___not___contains = aa3___not___contains;
    }

    public String getAa3___starts_with() {
        return aa3___starts_with;
    }
    public void setAa3___starts_with(String aa3___starts_with) {
        this.aa3___starts_with = aa3___starts_with;
    }

    public String getAa3___not___starts_with() {
        return aa3___not___starts_with;
    }
    public void setAa3___not___starts_with(String aa3___not___starts_with) {
        this.aa3___not___starts_with = aa3___not___starts_with;
    }

    public String getAa3___ends_with() {
        return aa3___ends_with;
    }
    public void setAa3___ends_with(String aa3___ends_with) {
        this.aa3___ends_with = aa3___ends_with;
    }

    public String getAa3___not___ends_with() {
        return aa3___not___ends_with;
    }
    public void setAa3___not___ends_with(String aa3___not___ends_with) {
        this.aa3___not___ends_with = aa3___not___ends_with;
    }

    public String getAa4___eq() {
        return aa4___eq;
    }
    public void setAa4___eq(String aa4___eq) {
        this.aa4___eq = aa4___eq;
    }

    public String getAa4___ne() {
        return aa4___ne;
    }
    public void setAa4___ne(String aa4___ne) {
        this.aa4___ne = aa4___ne;
    }

    public Boolean getAa4___null() {
        return aa4___null;
    }
    public void setAa4___null(Boolean aa4___null) {
        this.aa4___null = aa4___null;
    }

    public Boolean getAa4___not___null() {
        return aa4___not___null;
    }
    public void setAa4___not___null(Boolean aa4___not___null) {
        this.aa4___not___null = aa4___not___null;
    }

    public java.util.List<String> getAa4___in() {
        return aa4___in;
    }
    public void setAa4___in(java.util.List<String> aa4___in) {
        this.aa4___in = aa4___in;
    }

    public java.util.List<String> getAa4___not___in() {
        return aa4___not___in;
    }
    public void setAa4___not___in(java.util.List<String> aa4___not___in) {
        this.aa4___not___in = aa4___not___in;
    }

    public String getAa4___lt() {
        return aa4___lt;
    }
    public void setAa4___lt(String aa4___lt) {
        this.aa4___lt = aa4___lt;
    }

    public String getAa4___lte() {
        return aa4___lte;
    }
    public void setAa4___lte(String aa4___lte) {
        this.aa4___lte = aa4___lte;
    }

    public String getAa4___gt() {
        return aa4___gt;
    }
    public void setAa4___gt(String aa4___gt) {
        this.aa4___gt = aa4___gt;
    }

    public String getAa4___gte() {
        return aa4___gte;
    }
    public void setAa4___gte(String aa4___gte) {
        this.aa4___gte = aa4___gte;
    }

    public String getAa4___contains() {
        return aa4___contains;
    }
    public void setAa4___contains(String aa4___contains) {
        this.aa4___contains = aa4___contains;
    }

    public String getAa4___not___contains() {
        return aa4___not___contains;
    }
    public void setAa4___not___contains(String aa4___not___contains) {
        this.aa4___not___contains = aa4___not___contains;
    }

    public String getAa4___starts_with() {
        return aa4___starts_with;
    }
    public void setAa4___starts_with(String aa4___starts_with) {
        this.aa4___starts_with = aa4___starts_with;
    }

    public String getAa4___not___starts_with() {
        return aa4___not___starts_with;
    }
    public void setAa4___not___starts_with(String aa4___not___starts_with) {
        this.aa4___not___starts_with = aa4___not___starts_with;
    }

    public String getAa4___ends_with() {
        return aa4___ends_with;
    }
    public void setAa4___ends_with(String aa4___ends_with) {
        this.aa4___ends_with = aa4___ends_with;
    }

    public String getAa4___not___ends_with() {
        return aa4___not___ends_with;
    }
    public void setAa4___not___ends_with(String aa4___not___ends_with) {
        this.aa4___not___ends_with = aa4___not___ends_with;
    }

    public String getAa5___eq() {
        return aa5___eq;
    }
    public void setAa5___eq(String aa5___eq) {
        this.aa5___eq = aa5___eq;
    }

    public String getAa5___ne() {
        return aa5___ne;
    }
    public void setAa5___ne(String aa5___ne) {
        this.aa5___ne = aa5___ne;
    }

    public Boolean getAa5___null() {
        return aa5___null;
    }
    public void setAa5___null(Boolean aa5___null) {
        this.aa5___null = aa5___null;
    }

    public Boolean getAa5___not___null() {
        return aa5___not___null;
    }
    public void setAa5___not___null(Boolean aa5___not___null) {
        this.aa5___not___null = aa5___not___null;
    }

    public java.util.List<String> getAa5___in() {
        return aa5___in;
    }
    public void setAa5___in(java.util.List<String> aa5___in) {
        this.aa5___in = aa5___in;
    }

    public java.util.List<String> getAa5___not___in() {
        return aa5___not___in;
    }
    public void setAa5___not___in(java.util.List<String> aa5___not___in) {
        this.aa5___not___in = aa5___not___in;
    }

    public String getAa5___lt() {
        return aa5___lt;
    }
    public void setAa5___lt(String aa5___lt) {
        this.aa5___lt = aa5___lt;
    }

    public String getAa5___lte() {
        return aa5___lte;
    }
    public void setAa5___lte(String aa5___lte) {
        this.aa5___lte = aa5___lte;
    }

    public String getAa5___gt() {
        return aa5___gt;
    }
    public void setAa5___gt(String aa5___gt) {
        this.aa5___gt = aa5___gt;
    }

    public String getAa5___gte() {
        return aa5___gte;
    }
    public void setAa5___gte(String aa5___gte) {
        this.aa5___gte = aa5___gte;
    }

    public String getAa5___contains() {
        return aa5___contains;
    }
    public void setAa5___contains(String aa5___contains) {
        this.aa5___contains = aa5___contains;
    }

    public String getAa5___not___contains() {
        return aa5___not___contains;
    }
    public void setAa5___not___contains(String aa5___not___contains) {
        this.aa5___not___contains = aa5___not___contains;
    }

    public String getAa5___starts_with() {
        return aa5___starts_with;
    }
    public void setAa5___starts_with(String aa5___starts_with) {
        this.aa5___starts_with = aa5___starts_with;
    }

    public String getAa5___not___starts_with() {
        return aa5___not___starts_with;
    }
    public void setAa5___not___starts_with(String aa5___not___starts_with) {
        this.aa5___not___starts_with = aa5___not___starts_with;
    }

    public String getAa5___ends_with() {
        return aa5___ends_with;
    }
    public void setAa5___ends_with(String aa5___ends_with) {
        this.aa5___ends_with = aa5___ends_with;
    }

    public String getAa5___not___ends_with() {
        return aa5___not___ends_with;
    }
    public void setAa5___not___ends_with(String aa5___not___ends_with) {
        this.aa5___not___ends_with = aa5___not___ends_with;
    }

    public Boolean getDeletion___eq() {
        return deletion___eq;
    }
    public void setDeletion___eq(Boolean deletion___eq) {
        this.deletion___eq = deletion___eq;
    }

    public Boolean getDeletion___ne() {
        return deletion___ne;
    }
    public void setDeletion___ne(Boolean deletion___ne) {
        this.deletion___ne = deletion___ne;
    }

    public Boolean getDeletion___null() {
        return deletion___null;
    }
    public void setDeletion___null(Boolean deletion___null) {
        this.deletion___null = deletion___null;
    }

    public Boolean getDeletion___not___null() {
        return deletion___not___null;
    }
    public void setDeletion___not___null(Boolean deletion___not___null) {
        this.deletion___not___null = deletion___not___null;
    }

    public Boolean getInsert___eq() {
        return insert___eq;
    }
    public void setInsert___eq(Boolean insert___eq) {
        this.insert___eq = insert___eq;
    }

    public Boolean getInsert___ne() {
        return insert___ne;
    }
    public void setInsert___ne(Boolean insert___ne) {
        this.insert___ne = insert___ne;
    }

    public Boolean getInsert___null() {
        return insert___null;
    }
    public void setInsert___null(Boolean insert___null) {
        this.insert___null = insert___null;
    }

    public Boolean getInsert___not___null() {
        return insert___not___null;
    }
    public void setInsert___not___null(Boolean insert___not___null) {
        this.insert___not___null = insert___not___null;
    }

    public Boolean getNo_farmaco___eq() {
        return no_farmaco___eq;
    }
    public void setNo_farmaco___eq(Boolean no_farmaco___eq) {
        this.no_farmaco___eq = no_farmaco___eq;
    }

    public Boolean getNo_farmaco___ne() {
        return no_farmaco___ne;
    }
    public void setNo_farmaco___ne(Boolean no_farmaco___ne) {
        this.no_farmaco___ne = no_farmaco___ne;
    }

    public Boolean getNo_farmaco___null() {
        return no_farmaco___null;
    }
    public void setNo_farmaco___null(Boolean no_farmaco___null) {
        this.no_farmaco___null = no_farmaco___null;
    }

    public Boolean getNo_farmaco___not___null() {
        return no_farmaco___not___null;
    }
    public void setNo_farmaco___not___null(Boolean no_farmaco___not___null) {
        this.no_farmaco___not___null = no_farmaco___not___null;
    }

    public String getObject_title___eq() {
        return object_title___eq;
    }
    public void setObject_title___eq(String object_title___eq) {
        this.object_title___eq = object_title___eq;
    }

    public String getObject_title___ne() {
        return object_title___ne;
    }
    public void setObject_title___ne(String object_title___ne) {
        this.object_title___ne = object_title___ne;
    }

    public Boolean getObject_title___null() {
        return object_title___null;
    }
    public void setObject_title___null(Boolean object_title___null) {
        this.object_title___null = object_title___null;
    }

    public Boolean getObject_title___not___null() {
        return object_title___not___null;
    }
    public void setObject_title___not___null(Boolean object_title___not___null) {
        this.object_title___not___null = object_title___not___null;
    }

    public java.util.List<String> getObject_title___in() {
        return object_title___in;
    }
    public void setObject_title___in(java.util.List<String> object_title___in) {
        this.object_title___in = object_title___in;
    }

    public java.util.List<String> getObject_title___not___in() {
        return object_title___not___in;
    }
    public void setObject_title___not___in(java.util.List<String> object_title___not___in) {
        this.object_title___not___in = object_title___not___in;
    }

    public String getObject_title___lt() {
        return object_title___lt;
    }
    public void setObject_title___lt(String object_title___lt) {
        this.object_title___lt = object_title___lt;
    }

    public String getObject_title___lte() {
        return object_title___lte;
    }
    public void setObject_title___lte(String object_title___lte) {
        this.object_title___lte = object_title___lte;
    }

    public String getObject_title___gt() {
        return object_title___gt;
    }
    public void setObject_title___gt(String object_title___gt) {
        this.object_title___gt = object_title___gt;
    }

    public String getObject_title___gte() {
        return object_title___gte;
    }
    public void setObject_title___gte(String object_title___gte) {
        this.object_title___gte = object_title___gte;
    }

    public String getObject_title___contains() {
        return object_title___contains;
    }
    public void setObject_title___contains(String object_title___contains) {
        this.object_title___contains = object_title___contains;
    }

    public String getObject_title___not___contains() {
        return object_title___not___contains;
    }
    public void setObject_title___not___contains(String object_title___not___contains) {
        this.object_title___not___contains = object_title___not___contains;
    }

    public String getObject_title___starts_with() {
        return object_title___starts_with;
    }
    public void setObject_title___starts_with(String object_title___starts_with) {
        this.object_title___starts_with = object_title___starts_with;
    }

    public String getObject_title___not___starts_with() {
        return object_title___not___starts_with;
    }
    public void setObject_title___not___starts_with(String object_title___not___starts_with) {
        this.object_title___not___starts_with = object_title___not___starts_with;
    }

    public String getObject_title___ends_with() {
        return object_title___ends_with;
    }
    public void setObject_title___ends_with(String object_title___ends_with) {
        this.object_title___ends_with = object_title___ends_with;
    }

    public String getObject_title___not___ends_with() {
        return object_title___not___ends_with;
    }
    public void setObject_title___not___ends_with(String object_title___not___ends_with) {
        this.object_title___not___ends_with = object_title___not___ends_with;
    }

    public Integer getPosizione___eq() {
        return posizione___eq;
    }
    public void setPosizione___eq(Integer posizione___eq) {
        this.posizione___eq = posizione___eq;
    }

    public Integer getPosizione___ne() {
        return posizione___ne;
    }
    public void setPosizione___ne(Integer posizione___ne) {
        this.posizione___ne = posizione___ne;
    }

    public Boolean getPosizione___null() {
        return posizione___null;
    }
    public void setPosizione___null(Boolean posizione___null) {
        this.posizione___null = posizione___null;
    }

    public Boolean getPosizione___not___null() {
        return posizione___not___null;
    }
    public void setPosizione___not___null(Boolean posizione___not___null) {
        this.posizione___not___null = posizione___not___null;
    }

    public java.util.List<Integer> getPosizione___in() {
        return posizione___in;
    }
    public void setPosizione___in(java.util.List<Integer> posizione___in) {
        this.posizione___in = posizione___in;
    }

    public java.util.List<Integer> getPosizione___not___in() {
        return posizione___not___in;
    }
    public void setPosizione___not___in(java.util.List<Integer> posizione___not___in) {
        this.posizione___not___in = posizione___not___in;
    }

    public Integer getPosizione___lt() {
        return posizione___lt;
    }
    public void setPosizione___lt(Integer posizione___lt) {
        this.posizione___lt = posizione___lt;
    }

    public Integer getPosizione___lte() {
        return posizione___lte;
    }
    public void setPosizione___lte(Integer posizione___lte) {
        this.posizione___lte = posizione___lte;
    }

    public Integer getPosizione___gt() {
        return posizione___gt;
    }
    public void setPosizione___gt(Integer posizione___gt) {
        this.posizione___gt = posizione___gt;
    }

    public Integer getPosizione___gte() {
        return posizione___gte;
    }
    public void setPosizione___gte(Integer posizione___gte) {
        this.posizione___gte = posizione___gte;
    }

    public String getRegione_genoma___eq() {
        return regione_genoma___eq;
    }
    public void setRegione_genoma___eq(String regione_genoma___eq) {
        this.regione_genoma___eq = regione_genoma___eq;
    }

    public String getRegione_genoma___ne() {
        return regione_genoma___ne;
    }
    public void setRegione_genoma___ne(String regione_genoma___ne) {
        this.regione_genoma___ne = regione_genoma___ne;
    }

    public Boolean getRegione_genoma___null() {
        return regione_genoma___null;
    }
    public void setRegione_genoma___null(Boolean regione_genoma___null) {
        this.regione_genoma___null = regione_genoma___null;
    }

    public Boolean getRegione_genoma___not___null() {
        return regione_genoma___not___null;
    }
    public void setRegione_genoma___not___null(Boolean regione_genoma___not___null) {
        this.regione_genoma___not___null = regione_genoma___not___null;
    }

    public java.util.List<String> getRegione_genoma___in() {
        return regione_genoma___in;
    }
    public void setRegione_genoma___in(java.util.List<String> regione_genoma___in) {
        this.regione_genoma___in = regione_genoma___in;
    }

    public java.util.List<String> getRegione_genoma___not___in() {
        return regione_genoma___not___in;
    }
    public void setRegione_genoma___not___in(java.util.List<String> regione_genoma___not___in) {
        this.regione_genoma___not___in = regione_genoma___not___in;
    }

    public String getRegione_genoma___lt() {
        return regione_genoma___lt;
    }
    public void setRegione_genoma___lt(String regione_genoma___lt) {
        this.regione_genoma___lt = regione_genoma___lt;
    }

    public String getRegione_genoma___lte() {
        return regione_genoma___lte;
    }
    public void setRegione_genoma___lte(String regione_genoma___lte) {
        this.regione_genoma___lte = regione_genoma___lte;
    }

    public String getRegione_genoma___gt() {
        return regione_genoma___gt;
    }
    public void setRegione_genoma___gt(String regione_genoma___gt) {
        this.regione_genoma___gt = regione_genoma___gt;
    }

    public String getRegione_genoma___gte() {
        return regione_genoma___gte;
    }
    public void setRegione_genoma___gte(String regione_genoma___gte) {
        this.regione_genoma___gte = regione_genoma___gte;
    }

    public String getRegione_genoma___contains() {
        return regione_genoma___contains;
    }
    public void setRegione_genoma___contains(String regione_genoma___contains) {
        this.regione_genoma___contains = regione_genoma___contains;
    }

    public String getRegione_genoma___not___contains() {
        return regione_genoma___not___contains;
    }
    public void setRegione_genoma___not___contains(String regione_genoma___not___contains) {
        this.regione_genoma___not___contains = regione_genoma___not___contains;
    }

    public String getRegione_genoma___starts_with() {
        return regione_genoma___starts_with;
    }
    public void setRegione_genoma___starts_with(String regione_genoma___starts_with) {
        this.regione_genoma___starts_with = regione_genoma___starts_with;
    }

    public String getRegione_genoma___not___starts_with() {
        return regione_genoma___not___starts_with;
    }
    public void setRegione_genoma___not___starts_with(String regione_genoma___not___starts_with) {
        this.regione_genoma___not___starts_with = regione_genoma___not___starts_with;
    }

    public String getRegione_genoma___ends_with() {
        return regione_genoma___ends_with;
    }
    public void setRegione_genoma___ends_with(String regione_genoma___ends_with) {
        this.regione_genoma___ends_with = regione_genoma___ends_with;
    }

    public String getRegione_genoma___not___ends_with() {
        return regione_genoma___not___ends_with;
    }
    public void setRegione_genoma___not___ends_with(String regione_genoma___not___ends_with) {
        this.regione_genoma___not___ends_with = regione_genoma___not___ends_with;
    }

    public Boolean getShift___eq() {
        return shift___eq;
    }
    public void setShift___eq(Boolean shift___eq) {
        this.shift___eq = shift___eq;
    }

    public Boolean getShift___ne() {
        return shift___ne;
    }
    public void setShift___ne(Boolean shift___ne) {
        this.shift___ne = shift___ne;
    }

    public Boolean getShift___null() {
        return shift___null;
    }
    public void setShift___null(Boolean shift___null) {
        this.shift___null = shift___null;
    }

    public Boolean getShift___not___null() {
        return shift___not___null;
    }
    public void setShift___not___null(Boolean shift___not___null) {
        this.shift___not___null = shift___not___null;
    }

    public Integer getTemp_id___eq() {
        return temp_id___eq;
    }
    public void setTemp_id___eq(Integer temp_id___eq) {
        this.temp_id___eq = temp_id___eq;
    }

    public Integer getTemp_id___ne() {
        return temp_id___ne;
    }
    public void setTemp_id___ne(Integer temp_id___ne) {
        this.temp_id___ne = temp_id___ne;
    }

    public Boolean getTemp_id___null() {
        return temp_id___null;
    }
    public void setTemp_id___null(Boolean temp_id___null) {
        this.temp_id___null = temp_id___null;
    }

    public Boolean getTemp_id___not___null() {
        return temp_id___not___null;
    }
    public void setTemp_id___not___null(Boolean temp_id___not___null) {
        this.temp_id___not___null = temp_id___not___null;
    }

    public java.util.List<Integer> getTemp_id___in() {
        return temp_id___in;
    }
    public void setTemp_id___in(java.util.List<Integer> temp_id___in) {
        this.temp_id___in = temp_id___in;
    }

    public java.util.List<Integer> getTemp_id___not___in() {
        return temp_id___not___in;
    }
    public void setTemp_id___not___in(java.util.List<Integer> temp_id___not___in) {
        this.temp_id___not___in = temp_id___not___in;
    }

    public Integer getTemp_id___lt() {
        return temp_id___lt;
    }
    public void setTemp_id___lt(Integer temp_id___lt) {
        this.temp_id___lt = temp_id___lt;
    }

    public Integer getTemp_id___lte() {
        return temp_id___lte;
    }
    public void setTemp_id___lte(Integer temp_id___lte) {
        this.temp_id___lte = temp_id___lte;
    }

    public Integer getTemp_id___gt() {
        return temp_id___gt;
    }
    public void setTemp_id___gt(Integer temp_id___gt) {
        this.temp_id___gt = temp_id___gt;
    }

    public Integer getTemp_id___gte() {
        return temp_id___gte;
    }
    public void setTemp_id___gte(Integer temp_id___gte) {
        this.temp_id___gte = temp_id___gte;
    }

    public java.util.List<CliMutazioneFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliMutazioneFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliMutazioneFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliMutazioneFilterDTO> OR) {
        this.OR = OR;
    }

    public CliMutazioneFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliMutazioneFilterDTO NOT) {
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
        if (aa1___eq != null) {
            joiner.add("aa1___eq: " + GraphQLRequestSerializer.getEntry(aa1___eq));
        }
        if (aa1___ne != null) {
            joiner.add("aa1___ne: " + GraphQLRequestSerializer.getEntry(aa1___ne));
        }
        if (aa1___null != null) {
            joiner.add("aa1___null: " + GraphQLRequestSerializer.getEntry(aa1___null));
        }
        if (aa1___not___null != null) {
            joiner.add("aa1___not___null: " + GraphQLRequestSerializer.getEntry(aa1___not___null));
        }
        if (aa1___in != null) {
            joiner.add("aa1___in: " + GraphQLRequestSerializer.getEntry(aa1___in));
        }
        if (aa1___not___in != null) {
            joiner.add("aa1___not___in: " + GraphQLRequestSerializer.getEntry(aa1___not___in));
        }
        if (aa1___lt != null) {
            joiner.add("aa1___lt: " + GraphQLRequestSerializer.getEntry(aa1___lt));
        }
        if (aa1___lte != null) {
            joiner.add("aa1___lte: " + GraphQLRequestSerializer.getEntry(aa1___lte));
        }
        if (aa1___gt != null) {
            joiner.add("aa1___gt: " + GraphQLRequestSerializer.getEntry(aa1___gt));
        }
        if (aa1___gte != null) {
            joiner.add("aa1___gte: " + GraphQLRequestSerializer.getEntry(aa1___gte));
        }
        if (aa1___contains != null) {
            joiner.add("aa1___contains: " + GraphQLRequestSerializer.getEntry(aa1___contains));
        }
        if (aa1___not___contains != null) {
            joiner.add("aa1___not___contains: " + GraphQLRequestSerializer.getEntry(aa1___not___contains));
        }
        if (aa1___starts_with != null) {
            joiner.add("aa1___starts_with: " + GraphQLRequestSerializer.getEntry(aa1___starts_with));
        }
        if (aa1___not___starts_with != null) {
            joiner.add("aa1___not___starts_with: " + GraphQLRequestSerializer.getEntry(aa1___not___starts_with));
        }
        if (aa1___ends_with != null) {
            joiner.add("aa1___ends_with: " + GraphQLRequestSerializer.getEntry(aa1___ends_with));
        }
        if (aa1___not___ends_with != null) {
            joiner.add("aa1___not___ends_with: " + GraphQLRequestSerializer.getEntry(aa1___not___ends_with));
        }
        if (aa2___eq != null) {
            joiner.add("aa2___eq: " + GraphQLRequestSerializer.getEntry(aa2___eq));
        }
        if (aa2___ne != null) {
            joiner.add("aa2___ne: " + GraphQLRequestSerializer.getEntry(aa2___ne));
        }
        if (aa2___null != null) {
            joiner.add("aa2___null: " + GraphQLRequestSerializer.getEntry(aa2___null));
        }
        if (aa2___not___null != null) {
            joiner.add("aa2___not___null: " + GraphQLRequestSerializer.getEntry(aa2___not___null));
        }
        if (aa2___in != null) {
            joiner.add("aa2___in: " + GraphQLRequestSerializer.getEntry(aa2___in));
        }
        if (aa2___not___in != null) {
            joiner.add("aa2___not___in: " + GraphQLRequestSerializer.getEntry(aa2___not___in));
        }
        if (aa2___lt != null) {
            joiner.add("aa2___lt: " + GraphQLRequestSerializer.getEntry(aa2___lt));
        }
        if (aa2___lte != null) {
            joiner.add("aa2___lte: " + GraphQLRequestSerializer.getEntry(aa2___lte));
        }
        if (aa2___gt != null) {
            joiner.add("aa2___gt: " + GraphQLRequestSerializer.getEntry(aa2___gt));
        }
        if (aa2___gte != null) {
            joiner.add("aa2___gte: " + GraphQLRequestSerializer.getEntry(aa2___gte));
        }
        if (aa2___contains != null) {
            joiner.add("aa2___contains: " + GraphQLRequestSerializer.getEntry(aa2___contains));
        }
        if (aa2___not___contains != null) {
            joiner.add("aa2___not___contains: " + GraphQLRequestSerializer.getEntry(aa2___not___contains));
        }
        if (aa2___starts_with != null) {
            joiner.add("aa2___starts_with: " + GraphQLRequestSerializer.getEntry(aa2___starts_with));
        }
        if (aa2___not___starts_with != null) {
            joiner.add("aa2___not___starts_with: " + GraphQLRequestSerializer.getEntry(aa2___not___starts_with));
        }
        if (aa2___ends_with != null) {
            joiner.add("aa2___ends_with: " + GraphQLRequestSerializer.getEntry(aa2___ends_with));
        }
        if (aa2___not___ends_with != null) {
            joiner.add("aa2___not___ends_with: " + GraphQLRequestSerializer.getEntry(aa2___not___ends_with));
        }
        if (aa3___eq != null) {
            joiner.add("aa3___eq: " + GraphQLRequestSerializer.getEntry(aa3___eq));
        }
        if (aa3___ne != null) {
            joiner.add("aa3___ne: " + GraphQLRequestSerializer.getEntry(aa3___ne));
        }
        if (aa3___null != null) {
            joiner.add("aa3___null: " + GraphQLRequestSerializer.getEntry(aa3___null));
        }
        if (aa3___not___null != null) {
            joiner.add("aa3___not___null: " + GraphQLRequestSerializer.getEntry(aa3___not___null));
        }
        if (aa3___in != null) {
            joiner.add("aa3___in: " + GraphQLRequestSerializer.getEntry(aa3___in));
        }
        if (aa3___not___in != null) {
            joiner.add("aa3___not___in: " + GraphQLRequestSerializer.getEntry(aa3___not___in));
        }
        if (aa3___lt != null) {
            joiner.add("aa3___lt: " + GraphQLRequestSerializer.getEntry(aa3___lt));
        }
        if (aa3___lte != null) {
            joiner.add("aa3___lte: " + GraphQLRequestSerializer.getEntry(aa3___lte));
        }
        if (aa3___gt != null) {
            joiner.add("aa3___gt: " + GraphQLRequestSerializer.getEntry(aa3___gt));
        }
        if (aa3___gte != null) {
            joiner.add("aa3___gte: " + GraphQLRequestSerializer.getEntry(aa3___gte));
        }
        if (aa3___contains != null) {
            joiner.add("aa3___contains: " + GraphQLRequestSerializer.getEntry(aa3___contains));
        }
        if (aa3___not___contains != null) {
            joiner.add("aa3___not___contains: " + GraphQLRequestSerializer.getEntry(aa3___not___contains));
        }
        if (aa3___starts_with != null) {
            joiner.add("aa3___starts_with: " + GraphQLRequestSerializer.getEntry(aa3___starts_with));
        }
        if (aa3___not___starts_with != null) {
            joiner.add("aa3___not___starts_with: " + GraphQLRequestSerializer.getEntry(aa3___not___starts_with));
        }
        if (aa3___ends_with != null) {
            joiner.add("aa3___ends_with: " + GraphQLRequestSerializer.getEntry(aa3___ends_with));
        }
        if (aa3___not___ends_with != null) {
            joiner.add("aa3___not___ends_with: " + GraphQLRequestSerializer.getEntry(aa3___not___ends_with));
        }
        if (aa4___eq != null) {
            joiner.add("aa4___eq: " + GraphQLRequestSerializer.getEntry(aa4___eq));
        }
        if (aa4___ne != null) {
            joiner.add("aa4___ne: " + GraphQLRequestSerializer.getEntry(aa4___ne));
        }
        if (aa4___null != null) {
            joiner.add("aa4___null: " + GraphQLRequestSerializer.getEntry(aa4___null));
        }
        if (aa4___not___null != null) {
            joiner.add("aa4___not___null: " + GraphQLRequestSerializer.getEntry(aa4___not___null));
        }
        if (aa4___in != null) {
            joiner.add("aa4___in: " + GraphQLRequestSerializer.getEntry(aa4___in));
        }
        if (aa4___not___in != null) {
            joiner.add("aa4___not___in: " + GraphQLRequestSerializer.getEntry(aa4___not___in));
        }
        if (aa4___lt != null) {
            joiner.add("aa4___lt: " + GraphQLRequestSerializer.getEntry(aa4___lt));
        }
        if (aa4___lte != null) {
            joiner.add("aa4___lte: " + GraphQLRequestSerializer.getEntry(aa4___lte));
        }
        if (aa4___gt != null) {
            joiner.add("aa4___gt: " + GraphQLRequestSerializer.getEntry(aa4___gt));
        }
        if (aa4___gte != null) {
            joiner.add("aa4___gte: " + GraphQLRequestSerializer.getEntry(aa4___gte));
        }
        if (aa4___contains != null) {
            joiner.add("aa4___contains: " + GraphQLRequestSerializer.getEntry(aa4___contains));
        }
        if (aa4___not___contains != null) {
            joiner.add("aa4___not___contains: " + GraphQLRequestSerializer.getEntry(aa4___not___contains));
        }
        if (aa4___starts_with != null) {
            joiner.add("aa4___starts_with: " + GraphQLRequestSerializer.getEntry(aa4___starts_with));
        }
        if (aa4___not___starts_with != null) {
            joiner.add("aa4___not___starts_with: " + GraphQLRequestSerializer.getEntry(aa4___not___starts_with));
        }
        if (aa4___ends_with != null) {
            joiner.add("aa4___ends_with: " + GraphQLRequestSerializer.getEntry(aa4___ends_with));
        }
        if (aa4___not___ends_with != null) {
            joiner.add("aa4___not___ends_with: " + GraphQLRequestSerializer.getEntry(aa4___not___ends_with));
        }
        if (aa5___eq != null) {
            joiner.add("aa5___eq: " + GraphQLRequestSerializer.getEntry(aa5___eq));
        }
        if (aa5___ne != null) {
            joiner.add("aa5___ne: " + GraphQLRequestSerializer.getEntry(aa5___ne));
        }
        if (aa5___null != null) {
            joiner.add("aa5___null: " + GraphQLRequestSerializer.getEntry(aa5___null));
        }
        if (aa5___not___null != null) {
            joiner.add("aa5___not___null: " + GraphQLRequestSerializer.getEntry(aa5___not___null));
        }
        if (aa5___in != null) {
            joiner.add("aa5___in: " + GraphQLRequestSerializer.getEntry(aa5___in));
        }
        if (aa5___not___in != null) {
            joiner.add("aa5___not___in: " + GraphQLRequestSerializer.getEntry(aa5___not___in));
        }
        if (aa5___lt != null) {
            joiner.add("aa5___lt: " + GraphQLRequestSerializer.getEntry(aa5___lt));
        }
        if (aa5___lte != null) {
            joiner.add("aa5___lte: " + GraphQLRequestSerializer.getEntry(aa5___lte));
        }
        if (aa5___gt != null) {
            joiner.add("aa5___gt: " + GraphQLRequestSerializer.getEntry(aa5___gt));
        }
        if (aa5___gte != null) {
            joiner.add("aa5___gte: " + GraphQLRequestSerializer.getEntry(aa5___gte));
        }
        if (aa5___contains != null) {
            joiner.add("aa5___contains: " + GraphQLRequestSerializer.getEntry(aa5___contains));
        }
        if (aa5___not___contains != null) {
            joiner.add("aa5___not___contains: " + GraphQLRequestSerializer.getEntry(aa5___not___contains));
        }
        if (aa5___starts_with != null) {
            joiner.add("aa5___starts_with: " + GraphQLRequestSerializer.getEntry(aa5___starts_with));
        }
        if (aa5___not___starts_with != null) {
            joiner.add("aa5___not___starts_with: " + GraphQLRequestSerializer.getEntry(aa5___not___starts_with));
        }
        if (aa5___ends_with != null) {
            joiner.add("aa5___ends_with: " + GraphQLRequestSerializer.getEntry(aa5___ends_with));
        }
        if (aa5___not___ends_with != null) {
            joiner.add("aa5___not___ends_with: " + GraphQLRequestSerializer.getEntry(aa5___not___ends_with));
        }
        if (deletion___eq != null) {
            joiner.add("deletion___eq: " + GraphQLRequestSerializer.getEntry(deletion___eq));
        }
        if (deletion___ne != null) {
            joiner.add("deletion___ne: " + GraphQLRequestSerializer.getEntry(deletion___ne));
        }
        if (deletion___null != null) {
            joiner.add("deletion___null: " + GraphQLRequestSerializer.getEntry(deletion___null));
        }
        if (deletion___not___null != null) {
            joiner.add("deletion___not___null: " + GraphQLRequestSerializer.getEntry(deletion___not___null));
        }
        if (insert___eq != null) {
            joiner.add("insert___eq: " + GraphQLRequestSerializer.getEntry(insert___eq));
        }
        if (insert___ne != null) {
            joiner.add("insert___ne: " + GraphQLRequestSerializer.getEntry(insert___ne));
        }
        if (insert___null != null) {
            joiner.add("insert___null: " + GraphQLRequestSerializer.getEntry(insert___null));
        }
        if (insert___not___null != null) {
            joiner.add("insert___not___null: " + GraphQLRequestSerializer.getEntry(insert___not___null));
        }
        if (no_farmaco___eq != null) {
            joiner.add("no_farmaco___eq: " + GraphQLRequestSerializer.getEntry(no_farmaco___eq));
        }
        if (no_farmaco___ne != null) {
            joiner.add("no_farmaco___ne: " + GraphQLRequestSerializer.getEntry(no_farmaco___ne));
        }
        if (no_farmaco___null != null) {
            joiner.add("no_farmaco___null: " + GraphQLRequestSerializer.getEntry(no_farmaco___null));
        }
        if (no_farmaco___not___null != null) {
            joiner.add("no_farmaco___not___null: " + GraphQLRequestSerializer.getEntry(no_farmaco___not___null));
        }
        if (object_title___eq != null) {
            joiner.add("object_title___eq: " + GraphQLRequestSerializer.getEntry(object_title___eq));
        }
        if (object_title___ne != null) {
            joiner.add("object_title___ne: " + GraphQLRequestSerializer.getEntry(object_title___ne));
        }
        if (object_title___null != null) {
            joiner.add("object_title___null: " + GraphQLRequestSerializer.getEntry(object_title___null));
        }
        if (object_title___not___null != null) {
            joiner.add("object_title___not___null: " + GraphQLRequestSerializer.getEntry(object_title___not___null));
        }
        if (object_title___in != null) {
            joiner.add("object_title___in: " + GraphQLRequestSerializer.getEntry(object_title___in));
        }
        if (object_title___not___in != null) {
            joiner.add("object_title___not___in: " + GraphQLRequestSerializer.getEntry(object_title___not___in));
        }
        if (object_title___lt != null) {
            joiner.add("object_title___lt: " + GraphQLRequestSerializer.getEntry(object_title___lt));
        }
        if (object_title___lte != null) {
            joiner.add("object_title___lte: " + GraphQLRequestSerializer.getEntry(object_title___lte));
        }
        if (object_title___gt != null) {
            joiner.add("object_title___gt: " + GraphQLRequestSerializer.getEntry(object_title___gt));
        }
        if (object_title___gte != null) {
            joiner.add("object_title___gte: " + GraphQLRequestSerializer.getEntry(object_title___gte));
        }
        if (object_title___contains != null) {
            joiner.add("object_title___contains: " + GraphQLRequestSerializer.getEntry(object_title___contains));
        }
        if (object_title___not___contains != null) {
            joiner.add("object_title___not___contains: " + GraphQLRequestSerializer.getEntry(object_title___not___contains));
        }
        if (object_title___starts_with != null) {
            joiner.add("object_title___starts_with: " + GraphQLRequestSerializer.getEntry(object_title___starts_with));
        }
        if (object_title___not___starts_with != null) {
            joiner.add("object_title___not___starts_with: " + GraphQLRequestSerializer.getEntry(object_title___not___starts_with));
        }
        if (object_title___ends_with != null) {
            joiner.add("object_title___ends_with: " + GraphQLRequestSerializer.getEntry(object_title___ends_with));
        }
        if (object_title___not___ends_with != null) {
            joiner.add("object_title___not___ends_with: " + GraphQLRequestSerializer.getEntry(object_title___not___ends_with));
        }
        if (posizione___eq != null) {
            joiner.add("posizione___eq: " + GraphQLRequestSerializer.getEntry(posizione___eq));
        }
        if (posizione___ne != null) {
            joiner.add("posizione___ne: " + GraphQLRequestSerializer.getEntry(posizione___ne));
        }
        if (posizione___null != null) {
            joiner.add("posizione___null: " + GraphQLRequestSerializer.getEntry(posizione___null));
        }
        if (posizione___not___null != null) {
            joiner.add("posizione___not___null: " + GraphQLRequestSerializer.getEntry(posizione___not___null));
        }
        if (posizione___in != null) {
            joiner.add("posizione___in: " + GraphQLRequestSerializer.getEntry(posizione___in));
        }
        if (posizione___not___in != null) {
            joiner.add("posizione___not___in: " + GraphQLRequestSerializer.getEntry(posizione___not___in));
        }
        if (posizione___lt != null) {
            joiner.add("posizione___lt: " + GraphQLRequestSerializer.getEntry(posizione___lt));
        }
        if (posizione___lte != null) {
            joiner.add("posizione___lte: " + GraphQLRequestSerializer.getEntry(posizione___lte));
        }
        if (posizione___gt != null) {
            joiner.add("posizione___gt: " + GraphQLRequestSerializer.getEntry(posizione___gt));
        }
        if (posizione___gte != null) {
            joiner.add("posizione___gte: " + GraphQLRequestSerializer.getEntry(posizione___gte));
        }
        if (regione_genoma___eq != null) {
            joiner.add("regione_genoma___eq: " + GraphQLRequestSerializer.getEntry(regione_genoma___eq));
        }
        if (regione_genoma___ne != null) {
            joiner.add("regione_genoma___ne: " + GraphQLRequestSerializer.getEntry(regione_genoma___ne));
        }
        if (regione_genoma___null != null) {
            joiner.add("regione_genoma___null: " + GraphQLRequestSerializer.getEntry(regione_genoma___null));
        }
        if (regione_genoma___not___null != null) {
            joiner.add("regione_genoma___not___null: " + GraphQLRequestSerializer.getEntry(regione_genoma___not___null));
        }
        if (regione_genoma___in != null) {
            joiner.add("regione_genoma___in: " + GraphQLRequestSerializer.getEntry(regione_genoma___in));
        }
        if (regione_genoma___not___in != null) {
            joiner.add("regione_genoma___not___in: " + GraphQLRequestSerializer.getEntry(regione_genoma___not___in));
        }
        if (regione_genoma___lt != null) {
            joiner.add("regione_genoma___lt: " + GraphQLRequestSerializer.getEntry(regione_genoma___lt));
        }
        if (regione_genoma___lte != null) {
            joiner.add("regione_genoma___lte: " + GraphQLRequestSerializer.getEntry(regione_genoma___lte));
        }
        if (regione_genoma___gt != null) {
            joiner.add("regione_genoma___gt: " + GraphQLRequestSerializer.getEntry(regione_genoma___gt));
        }
        if (regione_genoma___gte != null) {
            joiner.add("regione_genoma___gte: " + GraphQLRequestSerializer.getEntry(regione_genoma___gte));
        }
        if (regione_genoma___contains != null) {
            joiner.add("regione_genoma___contains: " + GraphQLRequestSerializer.getEntry(regione_genoma___contains));
        }
        if (regione_genoma___not___contains != null) {
            joiner.add("regione_genoma___not___contains: " + GraphQLRequestSerializer.getEntry(regione_genoma___not___contains));
        }
        if (regione_genoma___starts_with != null) {
            joiner.add("regione_genoma___starts_with: " + GraphQLRequestSerializer.getEntry(regione_genoma___starts_with));
        }
        if (regione_genoma___not___starts_with != null) {
            joiner.add("regione_genoma___not___starts_with: " + GraphQLRequestSerializer.getEntry(regione_genoma___not___starts_with));
        }
        if (regione_genoma___ends_with != null) {
            joiner.add("regione_genoma___ends_with: " + GraphQLRequestSerializer.getEntry(regione_genoma___ends_with));
        }
        if (regione_genoma___not___ends_with != null) {
            joiner.add("regione_genoma___not___ends_with: " + GraphQLRequestSerializer.getEntry(regione_genoma___not___ends_with));
        }
        if (shift___eq != null) {
            joiner.add("shift___eq: " + GraphQLRequestSerializer.getEntry(shift___eq));
        }
        if (shift___ne != null) {
            joiner.add("shift___ne: " + GraphQLRequestSerializer.getEntry(shift___ne));
        }
        if (shift___null != null) {
            joiner.add("shift___null: " + GraphQLRequestSerializer.getEntry(shift___null));
        }
        if (shift___not___null != null) {
            joiner.add("shift___not___null: " + GraphQLRequestSerializer.getEntry(shift___not___null));
        }
        if (temp_id___eq != null) {
            joiner.add("temp_id___eq: " + GraphQLRequestSerializer.getEntry(temp_id___eq));
        }
        if (temp_id___ne != null) {
            joiner.add("temp_id___ne: " + GraphQLRequestSerializer.getEntry(temp_id___ne));
        }
        if (temp_id___null != null) {
            joiner.add("temp_id___null: " + GraphQLRequestSerializer.getEntry(temp_id___null));
        }
        if (temp_id___not___null != null) {
            joiner.add("temp_id___not___null: " + GraphQLRequestSerializer.getEntry(temp_id___not___null));
        }
        if (temp_id___in != null) {
            joiner.add("temp_id___in: " + GraphQLRequestSerializer.getEntry(temp_id___in));
        }
        if (temp_id___not___in != null) {
            joiner.add("temp_id___not___in: " + GraphQLRequestSerializer.getEntry(temp_id___not___in));
        }
        if (temp_id___lt != null) {
            joiner.add("temp_id___lt: " + GraphQLRequestSerializer.getEntry(temp_id___lt));
        }
        if (temp_id___lte != null) {
            joiner.add("temp_id___lte: " + GraphQLRequestSerializer.getEntry(temp_id___lte));
        }
        if (temp_id___gt != null) {
            joiner.add("temp_id___gt: " + GraphQLRequestSerializer.getEntry(temp_id___gt));
        }
        if (temp_id___gte != null) {
            joiner.add("temp_id___gte: " + GraphQLRequestSerializer.getEntry(temp_id___gte));
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

    public static CliMutazioneFilterDTO.Builder builder() {
        return new CliMutazioneFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
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
        private String aa1___eq;
        private String aa1___ne;
        private Boolean aa1___null;
        private Boolean aa1___not___null;
        private java.util.List<String> aa1___in;
        private java.util.List<String> aa1___not___in;
        private String aa1___lt;
        private String aa1___lte;
        private String aa1___gt;
        private String aa1___gte;
        private String aa1___contains;
        private String aa1___not___contains;
        private String aa1___starts_with;
        private String aa1___not___starts_with;
        private String aa1___ends_with;
        private String aa1___not___ends_with;
        private String aa2___eq;
        private String aa2___ne;
        private Boolean aa2___null;
        private Boolean aa2___not___null;
        private java.util.List<String> aa2___in;
        private java.util.List<String> aa2___not___in;
        private String aa2___lt;
        private String aa2___lte;
        private String aa2___gt;
        private String aa2___gte;
        private String aa2___contains;
        private String aa2___not___contains;
        private String aa2___starts_with;
        private String aa2___not___starts_with;
        private String aa2___ends_with;
        private String aa2___not___ends_with;
        private String aa3___eq;
        private String aa3___ne;
        private Boolean aa3___null;
        private Boolean aa3___not___null;
        private java.util.List<String> aa3___in;
        private java.util.List<String> aa3___not___in;
        private String aa3___lt;
        private String aa3___lte;
        private String aa3___gt;
        private String aa3___gte;
        private String aa3___contains;
        private String aa3___not___contains;
        private String aa3___starts_with;
        private String aa3___not___starts_with;
        private String aa3___ends_with;
        private String aa3___not___ends_with;
        private String aa4___eq;
        private String aa4___ne;
        private Boolean aa4___null;
        private Boolean aa4___not___null;
        private java.util.List<String> aa4___in;
        private java.util.List<String> aa4___not___in;
        private String aa4___lt;
        private String aa4___lte;
        private String aa4___gt;
        private String aa4___gte;
        private String aa4___contains;
        private String aa4___not___contains;
        private String aa4___starts_with;
        private String aa4___not___starts_with;
        private String aa4___ends_with;
        private String aa4___not___ends_with;
        private String aa5___eq;
        private String aa5___ne;
        private Boolean aa5___null;
        private Boolean aa5___not___null;
        private java.util.List<String> aa5___in;
        private java.util.List<String> aa5___not___in;
        private String aa5___lt;
        private String aa5___lte;
        private String aa5___gt;
        private String aa5___gte;
        private String aa5___contains;
        private String aa5___not___contains;
        private String aa5___starts_with;
        private String aa5___not___starts_with;
        private String aa5___ends_with;
        private String aa5___not___ends_with;
        private Boolean deletion___eq;
        private Boolean deletion___ne;
        private Boolean deletion___null;
        private Boolean deletion___not___null;
        private Boolean insert___eq;
        private Boolean insert___ne;
        private Boolean insert___null;
        private Boolean insert___not___null;
        private Boolean no_farmaco___eq;
        private Boolean no_farmaco___ne;
        private Boolean no_farmaco___null;
        private Boolean no_farmaco___not___null;
        private String object_title___eq;
        private String object_title___ne;
        private Boolean object_title___null;
        private Boolean object_title___not___null;
        private java.util.List<String> object_title___in;
        private java.util.List<String> object_title___not___in;
        private String object_title___lt;
        private String object_title___lte;
        private String object_title___gt;
        private String object_title___gte;
        private String object_title___contains;
        private String object_title___not___contains;
        private String object_title___starts_with;
        private String object_title___not___starts_with;
        private String object_title___ends_with;
        private String object_title___not___ends_with;
        private Integer posizione___eq;
        private Integer posizione___ne;
        private Boolean posizione___null;
        private Boolean posizione___not___null;
        private java.util.List<Integer> posizione___in;
        private java.util.List<Integer> posizione___not___in;
        private Integer posizione___lt;
        private Integer posizione___lte;
        private Integer posizione___gt;
        private Integer posizione___gte;
        private String regione_genoma___eq;
        private String regione_genoma___ne;
        private Boolean regione_genoma___null;
        private Boolean regione_genoma___not___null;
        private java.util.List<String> regione_genoma___in;
        private java.util.List<String> regione_genoma___not___in;
        private String regione_genoma___lt;
        private String regione_genoma___lte;
        private String regione_genoma___gt;
        private String regione_genoma___gte;
        private String regione_genoma___contains;
        private String regione_genoma___not___contains;
        private String regione_genoma___starts_with;
        private String regione_genoma___not___starts_with;
        private String regione_genoma___ends_with;
        private String regione_genoma___not___ends_with;
        private Boolean shift___eq;
        private Boolean shift___ne;
        private Boolean shift___null;
        private Boolean shift___not___null;
        private Integer temp_id___eq;
        private Integer temp_id___ne;
        private Boolean temp_id___null;
        private Boolean temp_id___not___null;
        private java.util.List<Integer> temp_id___in;
        private java.util.List<Integer> temp_id___not___in;
        private Integer temp_id___lt;
        private Integer temp_id___lte;
        private Integer temp_id___gt;
        private Integer temp_id___gte;
        private java.util.List<CliMutazioneFilterDTO> AND;
        private java.util.List<CliMutazioneFilterDTO> OR;
        private CliMutazioneFilterDTO NOT;

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

        public Builder setAa1___eq(String aa1___eq) {
            this.aa1___eq = aa1___eq;
            return this;
        }

        public Builder setAa1___ne(String aa1___ne) {
            this.aa1___ne = aa1___ne;
            return this;
        }

        public Builder setAa1___null(Boolean aa1___null) {
            this.aa1___null = aa1___null;
            return this;
        }

        public Builder setAa1___not___null(Boolean aa1___not___null) {
            this.aa1___not___null = aa1___not___null;
            return this;
        }

        public Builder setAa1___in(java.util.List<String> aa1___in) {
            this.aa1___in = aa1___in;
            return this;
        }

        public Builder setAa1___not___in(java.util.List<String> aa1___not___in) {
            this.aa1___not___in = aa1___not___in;
            return this;
        }

        public Builder setAa1___lt(String aa1___lt) {
            this.aa1___lt = aa1___lt;
            return this;
        }

        public Builder setAa1___lte(String aa1___lte) {
            this.aa1___lte = aa1___lte;
            return this;
        }

        public Builder setAa1___gt(String aa1___gt) {
            this.aa1___gt = aa1___gt;
            return this;
        }

        public Builder setAa1___gte(String aa1___gte) {
            this.aa1___gte = aa1___gte;
            return this;
        }

        public Builder setAa1___contains(String aa1___contains) {
            this.aa1___contains = aa1___contains;
            return this;
        }

        public Builder setAa1___not___contains(String aa1___not___contains) {
            this.aa1___not___contains = aa1___not___contains;
            return this;
        }

        public Builder setAa1___starts_with(String aa1___starts_with) {
            this.aa1___starts_with = aa1___starts_with;
            return this;
        }

        public Builder setAa1___not___starts_with(String aa1___not___starts_with) {
            this.aa1___not___starts_with = aa1___not___starts_with;
            return this;
        }

        public Builder setAa1___ends_with(String aa1___ends_with) {
            this.aa1___ends_with = aa1___ends_with;
            return this;
        }

        public Builder setAa1___not___ends_with(String aa1___not___ends_with) {
            this.aa1___not___ends_with = aa1___not___ends_with;
            return this;
        }

        public Builder setAa2___eq(String aa2___eq) {
            this.aa2___eq = aa2___eq;
            return this;
        }

        public Builder setAa2___ne(String aa2___ne) {
            this.aa2___ne = aa2___ne;
            return this;
        }

        public Builder setAa2___null(Boolean aa2___null) {
            this.aa2___null = aa2___null;
            return this;
        }

        public Builder setAa2___not___null(Boolean aa2___not___null) {
            this.aa2___not___null = aa2___not___null;
            return this;
        }

        public Builder setAa2___in(java.util.List<String> aa2___in) {
            this.aa2___in = aa2___in;
            return this;
        }

        public Builder setAa2___not___in(java.util.List<String> aa2___not___in) {
            this.aa2___not___in = aa2___not___in;
            return this;
        }

        public Builder setAa2___lt(String aa2___lt) {
            this.aa2___lt = aa2___lt;
            return this;
        }

        public Builder setAa2___lte(String aa2___lte) {
            this.aa2___lte = aa2___lte;
            return this;
        }

        public Builder setAa2___gt(String aa2___gt) {
            this.aa2___gt = aa2___gt;
            return this;
        }

        public Builder setAa2___gte(String aa2___gte) {
            this.aa2___gte = aa2___gte;
            return this;
        }

        public Builder setAa2___contains(String aa2___contains) {
            this.aa2___contains = aa2___contains;
            return this;
        }

        public Builder setAa2___not___contains(String aa2___not___contains) {
            this.aa2___not___contains = aa2___not___contains;
            return this;
        }

        public Builder setAa2___starts_with(String aa2___starts_with) {
            this.aa2___starts_with = aa2___starts_with;
            return this;
        }

        public Builder setAa2___not___starts_with(String aa2___not___starts_with) {
            this.aa2___not___starts_with = aa2___not___starts_with;
            return this;
        }

        public Builder setAa2___ends_with(String aa2___ends_with) {
            this.aa2___ends_with = aa2___ends_with;
            return this;
        }

        public Builder setAa2___not___ends_with(String aa2___not___ends_with) {
            this.aa2___not___ends_with = aa2___not___ends_with;
            return this;
        }

        public Builder setAa3___eq(String aa3___eq) {
            this.aa3___eq = aa3___eq;
            return this;
        }

        public Builder setAa3___ne(String aa3___ne) {
            this.aa3___ne = aa3___ne;
            return this;
        }

        public Builder setAa3___null(Boolean aa3___null) {
            this.aa3___null = aa3___null;
            return this;
        }

        public Builder setAa3___not___null(Boolean aa3___not___null) {
            this.aa3___not___null = aa3___not___null;
            return this;
        }

        public Builder setAa3___in(java.util.List<String> aa3___in) {
            this.aa3___in = aa3___in;
            return this;
        }

        public Builder setAa3___not___in(java.util.List<String> aa3___not___in) {
            this.aa3___not___in = aa3___not___in;
            return this;
        }

        public Builder setAa3___lt(String aa3___lt) {
            this.aa3___lt = aa3___lt;
            return this;
        }

        public Builder setAa3___lte(String aa3___lte) {
            this.aa3___lte = aa3___lte;
            return this;
        }

        public Builder setAa3___gt(String aa3___gt) {
            this.aa3___gt = aa3___gt;
            return this;
        }

        public Builder setAa3___gte(String aa3___gte) {
            this.aa3___gte = aa3___gte;
            return this;
        }

        public Builder setAa3___contains(String aa3___contains) {
            this.aa3___contains = aa3___contains;
            return this;
        }

        public Builder setAa3___not___contains(String aa3___not___contains) {
            this.aa3___not___contains = aa3___not___contains;
            return this;
        }

        public Builder setAa3___starts_with(String aa3___starts_with) {
            this.aa3___starts_with = aa3___starts_with;
            return this;
        }

        public Builder setAa3___not___starts_with(String aa3___not___starts_with) {
            this.aa3___not___starts_with = aa3___not___starts_with;
            return this;
        }

        public Builder setAa3___ends_with(String aa3___ends_with) {
            this.aa3___ends_with = aa3___ends_with;
            return this;
        }

        public Builder setAa3___not___ends_with(String aa3___not___ends_with) {
            this.aa3___not___ends_with = aa3___not___ends_with;
            return this;
        }

        public Builder setAa4___eq(String aa4___eq) {
            this.aa4___eq = aa4___eq;
            return this;
        }

        public Builder setAa4___ne(String aa4___ne) {
            this.aa4___ne = aa4___ne;
            return this;
        }

        public Builder setAa4___null(Boolean aa4___null) {
            this.aa4___null = aa4___null;
            return this;
        }

        public Builder setAa4___not___null(Boolean aa4___not___null) {
            this.aa4___not___null = aa4___not___null;
            return this;
        }

        public Builder setAa4___in(java.util.List<String> aa4___in) {
            this.aa4___in = aa4___in;
            return this;
        }

        public Builder setAa4___not___in(java.util.List<String> aa4___not___in) {
            this.aa4___not___in = aa4___not___in;
            return this;
        }

        public Builder setAa4___lt(String aa4___lt) {
            this.aa4___lt = aa4___lt;
            return this;
        }

        public Builder setAa4___lte(String aa4___lte) {
            this.aa4___lte = aa4___lte;
            return this;
        }

        public Builder setAa4___gt(String aa4___gt) {
            this.aa4___gt = aa4___gt;
            return this;
        }

        public Builder setAa4___gte(String aa4___gte) {
            this.aa4___gte = aa4___gte;
            return this;
        }

        public Builder setAa4___contains(String aa4___contains) {
            this.aa4___contains = aa4___contains;
            return this;
        }

        public Builder setAa4___not___contains(String aa4___not___contains) {
            this.aa4___not___contains = aa4___not___contains;
            return this;
        }

        public Builder setAa4___starts_with(String aa4___starts_with) {
            this.aa4___starts_with = aa4___starts_with;
            return this;
        }

        public Builder setAa4___not___starts_with(String aa4___not___starts_with) {
            this.aa4___not___starts_with = aa4___not___starts_with;
            return this;
        }

        public Builder setAa4___ends_with(String aa4___ends_with) {
            this.aa4___ends_with = aa4___ends_with;
            return this;
        }

        public Builder setAa4___not___ends_with(String aa4___not___ends_with) {
            this.aa4___not___ends_with = aa4___not___ends_with;
            return this;
        }

        public Builder setAa5___eq(String aa5___eq) {
            this.aa5___eq = aa5___eq;
            return this;
        }

        public Builder setAa5___ne(String aa5___ne) {
            this.aa5___ne = aa5___ne;
            return this;
        }

        public Builder setAa5___null(Boolean aa5___null) {
            this.aa5___null = aa5___null;
            return this;
        }

        public Builder setAa5___not___null(Boolean aa5___not___null) {
            this.aa5___not___null = aa5___not___null;
            return this;
        }

        public Builder setAa5___in(java.util.List<String> aa5___in) {
            this.aa5___in = aa5___in;
            return this;
        }

        public Builder setAa5___not___in(java.util.List<String> aa5___not___in) {
            this.aa5___not___in = aa5___not___in;
            return this;
        }

        public Builder setAa5___lt(String aa5___lt) {
            this.aa5___lt = aa5___lt;
            return this;
        }

        public Builder setAa5___lte(String aa5___lte) {
            this.aa5___lte = aa5___lte;
            return this;
        }

        public Builder setAa5___gt(String aa5___gt) {
            this.aa5___gt = aa5___gt;
            return this;
        }

        public Builder setAa5___gte(String aa5___gte) {
            this.aa5___gte = aa5___gte;
            return this;
        }

        public Builder setAa5___contains(String aa5___contains) {
            this.aa5___contains = aa5___contains;
            return this;
        }

        public Builder setAa5___not___contains(String aa5___not___contains) {
            this.aa5___not___contains = aa5___not___contains;
            return this;
        }

        public Builder setAa5___starts_with(String aa5___starts_with) {
            this.aa5___starts_with = aa5___starts_with;
            return this;
        }

        public Builder setAa5___not___starts_with(String aa5___not___starts_with) {
            this.aa5___not___starts_with = aa5___not___starts_with;
            return this;
        }

        public Builder setAa5___ends_with(String aa5___ends_with) {
            this.aa5___ends_with = aa5___ends_with;
            return this;
        }

        public Builder setAa5___not___ends_with(String aa5___not___ends_with) {
            this.aa5___not___ends_with = aa5___not___ends_with;
            return this;
        }

        public Builder setDeletion___eq(Boolean deletion___eq) {
            this.deletion___eq = deletion___eq;
            return this;
        }

        public Builder setDeletion___ne(Boolean deletion___ne) {
            this.deletion___ne = deletion___ne;
            return this;
        }

        public Builder setDeletion___null(Boolean deletion___null) {
            this.deletion___null = deletion___null;
            return this;
        }

        public Builder setDeletion___not___null(Boolean deletion___not___null) {
            this.deletion___not___null = deletion___not___null;
            return this;
        }

        public Builder setInsert___eq(Boolean insert___eq) {
            this.insert___eq = insert___eq;
            return this;
        }

        public Builder setInsert___ne(Boolean insert___ne) {
            this.insert___ne = insert___ne;
            return this;
        }

        public Builder setInsert___null(Boolean insert___null) {
            this.insert___null = insert___null;
            return this;
        }

        public Builder setInsert___not___null(Boolean insert___not___null) {
            this.insert___not___null = insert___not___null;
            return this;
        }

        public Builder setNo_farmaco___eq(Boolean no_farmaco___eq) {
            this.no_farmaco___eq = no_farmaco___eq;
            return this;
        }

        public Builder setNo_farmaco___ne(Boolean no_farmaco___ne) {
            this.no_farmaco___ne = no_farmaco___ne;
            return this;
        }

        public Builder setNo_farmaco___null(Boolean no_farmaco___null) {
            this.no_farmaco___null = no_farmaco___null;
            return this;
        }

        public Builder setNo_farmaco___not___null(Boolean no_farmaco___not___null) {
            this.no_farmaco___not___null = no_farmaco___not___null;
            return this;
        }

        public Builder setObject_title___eq(String object_title___eq) {
            this.object_title___eq = object_title___eq;
            return this;
        }

        public Builder setObject_title___ne(String object_title___ne) {
            this.object_title___ne = object_title___ne;
            return this;
        }

        public Builder setObject_title___null(Boolean object_title___null) {
            this.object_title___null = object_title___null;
            return this;
        }

        public Builder setObject_title___not___null(Boolean object_title___not___null) {
            this.object_title___not___null = object_title___not___null;
            return this;
        }

        public Builder setObject_title___in(java.util.List<String> object_title___in) {
            this.object_title___in = object_title___in;
            return this;
        }

        public Builder setObject_title___not___in(java.util.List<String> object_title___not___in) {
            this.object_title___not___in = object_title___not___in;
            return this;
        }

        public Builder setObject_title___lt(String object_title___lt) {
            this.object_title___lt = object_title___lt;
            return this;
        }

        public Builder setObject_title___lte(String object_title___lte) {
            this.object_title___lte = object_title___lte;
            return this;
        }

        public Builder setObject_title___gt(String object_title___gt) {
            this.object_title___gt = object_title___gt;
            return this;
        }

        public Builder setObject_title___gte(String object_title___gte) {
            this.object_title___gte = object_title___gte;
            return this;
        }

        public Builder setObject_title___contains(String object_title___contains) {
            this.object_title___contains = object_title___contains;
            return this;
        }

        public Builder setObject_title___not___contains(String object_title___not___contains) {
            this.object_title___not___contains = object_title___not___contains;
            return this;
        }

        public Builder setObject_title___starts_with(String object_title___starts_with) {
            this.object_title___starts_with = object_title___starts_with;
            return this;
        }

        public Builder setObject_title___not___starts_with(String object_title___not___starts_with) {
            this.object_title___not___starts_with = object_title___not___starts_with;
            return this;
        }

        public Builder setObject_title___ends_with(String object_title___ends_with) {
            this.object_title___ends_with = object_title___ends_with;
            return this;
        }

        public Builder setObject_title___not___ends_with(String object_title___not___ends_with) {
            this.object_title___not___ends_with = object_title___not___ends_with;
            return this;
        }

        public Builder setPosizione___eq(Integer posizione___eq) {
            this.posizione___eq = posizione___eq;
            return this;
        }

        public Builder setPosizione___ne(Integer posizione___ne) {
            this.posizione___ne = posizione___ne;
            return this;
        }

        public Builder setPosizione___null(Boolean posizione___null) {
            this.posizione___null = posizione___null;
            return this;
        }

        public Builder setPosizione___not___null(Boolean posizione___not___null) {
            this.posizione___not___null = posizione___not___null;
            return this;
        }

        public Builder setPosizione___in(java.util.List<Integer> posizione___in) {
            this.posizione___in = posizione___in;
            return this;
        }

        public Builder setPosizione___not___in(java.util.List<Integer> posizione___not___in) {
            this.posizione___not___in = posizione___not___in;
            return this;
        }

        public Builder setPosizione___lt(Integer posizione___lt) {
            this.posizione___lt = posizione___lt;
            return this;
        }

        public Builder setPosizione___lte(Integer posizione___lte) {
            this.posizione___lte = posizione___lte;
            return this;
        }

        public Builder setPosizione___gt(Integer posizione___gt) {
            this.posizione___gt = posizione___gt;
            return this;
        }

        public Builder setPosizione___gte(Integer posizione___gte) {
            this.posizione___gte = posizione___gte;
            return this;
        }

        public Builder setRegione_genoma___eq(String regione_genoma___eq) {
            this.regione_genoma___eq = regione_genoma___eq;
            return this;
        }

        public Builder setRegione_genoma___ne(String regione_genoma___ne) {
            this.regione_genoma___ne = regione_genoma___ne;
            return this;
        }

        public Builder setRegione_genoma___null(Boolean regione_genoma___null) {
            this.regione_genoma___null = regione_genoma___null;
            return this;
        }

        public Builder setRegione_genoma___not___null(Boolean regione_genoma___not___null) {
            this.regione_genoma___not___null = regione_genoma___not___null;
            return this;
        }

        public Builder setRegione_genoma___in(java.util.List<String> regione_genoma___in) {
            this.regione_genoma___in = regione_genoma___in;
            return this;
        }

        public Builder setRegione_genoma___not___in(java.util.List<String> regione_genoma___not___in) {
            this.regione_genoma___not___in = regione_genoma___not___in;
            return this;
        }

        public Builder setRegione_genoma___lt(String regione_genoma___lt) {
            this.regione_genoma___lt = regione_genoma___lt;
            return this;
        }

        public Builder setRegione_genoma___lte(String regione_genoma___lte) {
            this.regione_genoma___lte = regione_genoma___lte;
            return this;
        }

        public Builder setRegione_genoma___gt(String regione_genoma___gt) {
            this.regione_genoma___gt = regione_genoma___gt;
            return this;
        }

        public Builder setRegione_genoma___gte(String regione_genoma___gte) {
            this.regione_genoma___gte = regione_genoma___gte;
            return this;
        }

        public Builder setRegione_genoma___contains(String regione_genoma___contains) {
            this.regione_genoma___contains = regione_genoma___contains;
            return this;
        }

        public Builder setRegione_genoma___not___contains(String regione_genoma___not___contains) {
            this.regione_genoma___not___contains = regione_genoma___not___contains;
            return this;
        }

        public Builder setRegione_genoma___starts_with(String regione_genoma___starts_with) {
            this.regione_genoma___starts_with = regione_genoma___starts_with;
            return this;
        }

        public Builder setRegione_genoma___not___starts_with(String regione_genoma___not___starts_with) {
            this.regione_genoma___not___starts_with = regione_genoma___not___starts_with;
            return this;
        }

        public Builder setRegione_genoma___ends_with(String regione_genoma___ends_with) {
            this.regione_genoma___ends_with = regione_genoma___ends_with;
            return this;
        }

        public Builder setRegione_genoma___not___ends_with(String regione_genoma___not___ends_with) {
            this.regione_genoma___not___ends_with = regione_genoma___not___ends_with;
            return this;
        }

        public Builder setShift___eq(Boolean shift___eq) {
            this.shift___eq = shift___eq;
            return this;
        }

        public Builder setShift___ne(Boolean shift___ne) {
            this.shift___ne = shift___ne;
            return this;
        }

        public Builder setShift___null(Boolean shift___null) {
            this.shift___null = shift___null;
            return this;
        }

        public Builder setShift___not___null(Boolean shift___not___null) {
            this.shift___not___null = shift___not___null;
            return this;
        }

        public Builder setTemp_id___eq(Integer temp_id___eq) {
            this.temp_id___eq = temp_id___eq;
            return this;
        }

        public Builder setTemp_id___ne(Integer temp_id___ne) {
            this.temp_id___ne = temp_id___ne;
            return this;
        }

        public Builder setTemp_id___null(Boolean temp_id___null) {
            this.temp_id___null = temp_id___null;
            return this;
        }

        public Builder setTemp_id___not___null(Boolean temp_id___not___null) {
            this.temp_id___not___null = temp_id___not___null;
            return this;
        }

        public Builder setTemp_id___in(java.util.List<Integer> temp_id___in) {
            this.temp_id___in = temp_id___in;
            return this;
        }

        public Builder setTemp_id___not___in(java.util.List<Integer> temp_id___not___in) {
            this.temp_id___not___in = temp_id___not___in;
            return this;
        }

        public Builder setTemp_id___lt(Integer temp_id___lt) {
            this.temp_id___lt = temp_id___lt;
            return this;
        }

        public Builder setTemp_id___lte(Integer temp_id___lte) {
            this.temp_id___lte = temp_id___lte;
            return this;
        }

        public Builder setTemp_id___gt(Integer temp_id___gt) {
            this.temp_id___gt = temp_id___gt;
            return this;
        }

        public Builder setTemp_id___gte(Integer temp_id___gte) {
            this.temp_id___gte = temp_id___gte;
            return this;
        }

        public Builder setAND(java.util.List<CliMutazioneFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliMutazioneFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliMutazioneFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliMutazioneFilterDTO build() {
            CliMutazioneFilterDTO result = new CliMutazioneFilterDTO();
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
            result.setAa1___eq(this.aa1___eq);
            result.setAa1___ne(this.aa1___ne);
            result.setAa1___null(this.aa1___null);
            result.setAa1___not___null(this.aa1___not___null);
            result.setAa1___in(this.aa1___in);
            result.setAa1___not___in(this.aa1___not___in);
            result.setAa1___lt(this.aa1___lt);
            result.setAa1___lte(this.aa1___lte);
            result.setAa1___gt(this.aa1___gt);
            result.setAa1___gte(this.aa1___gte);
            result.setAa1___contains(this.aa1___contains);
            result.setAa1___not___contains(this.aa1___not___contains);
            result.setAa1___starts_with(this.aa1___starts_with);
            result.setAa1___not___starts_with(this.aa1___not___starts_with);
            result.setAa1___ends_with(this.aa1___ends_with);
            result.setAa1___not___ends_with(this.aa1___not___ends_with);
            result.setAa2___eq(this.aa2___eq);
            result.setAa2___ne(this.aa2___ne);
            result.setAa2___null(this.aa2___null);
            result.setAa2___not___null(this.aa2___not___null);
            result.setAa2___in(this.aa2___in);
            result.setAa2___not___in(this.aa2___not___in);
            result.setAa2___lt(this.aa2___lt);
            result.setAa2___lte(this.aa2___lte);
            result.setAa2___gt(this.aa2___gt);
            result.setAa2___gte(this.aa2___gte);
            result.setAa2___contains(this.aa2___contains);
            result.setAa2___not___contains(this.aa2___not___contains);
            result.setAa2___starts_with(this.aa2___starts_with);
            result.setAa2___not___starts_with(this.aa2___not___starts_with);
            result.setAa2___ends_with(this.aa2___ends_with);
            result.setAa2___not___ends_with(this.aa2___not___ends_with);
            result.setAa3___eq(this.aa3___eq);
            result.setAa3___ne(this.aa3___ne);
            result.setAa3___null(this.aa3___null);
            result.setAa3___not___null(this.aa3___not___null);
            result.setAa3___in(this.aa3___in);
            result.setAa3___not___in(this.aa3___not___in);
            result.setAa3___lt(this.aa3___lt);
            result.setAa3___lte(this.aa3___lte);
            result.setAa3___gt(this.aa3___gt);
            result.setAa3___gte(this.aa3___gte);
            result.setAa3___contains(this.aa3___contains);
            result.setAa3___not___contains(this.aa3___not___contains);
            result.setAa3___starts_with(this.aa3___starts_with);
            result.setAa3___not___starts_with(this.aa3___not___starts_with);
            result.setAa3___ends_with(this.aa3___ends_with);
            result.setAa3___not___ends_with(this.aa3___not___ends_with);
            result.setAa4___eq(this.aa4___eq);
            result.setAa4___ne(this.aa4___ne);
            result.setAa4___null(this.aa4___null);
            result.setAa4___not___null(this.aa4___not___null);
            result.setAa4___in(this.aa4___in);
            result.setAa4___not___in(this.aa4___not___in);
            result.setAa4___lt(this.aa4___lt);
            result.setAa4___lte(this.aa4___lte);
            result.setAa4___gt(this.aa4___gt);
            result.setAa4___gte(this.aa4___gte);
            result.setAa4___contains(this.aa4___contains);
            result.setAa4___not___contains(this.aa4___not___contains);
            result.setAa4___starts_with(this.aa4___starts_with);
            result.setAa4___not___starts_with(this.aa4___not___starts_with);
            result.setAa4___ends_with(this.aa4___ends_with);
            result.setAa4___not___ends_with(this.aa4___not___ends_with);
            result.setAa5___eq(this.aa5___eq);
            result.setAa5___ne(this.aa5___ne);
            result.setAa5___null(this.aa5___null);
            result.setAa5___not___null(this.aa5___not___null);
            result.setAa5___in(this.aa5___in);
            result.setAa5___not___in(this.aa5___not___in);
            result.setAa5___lt(this.aa5___lt);
            result.setAa5___lte(this.aa5___lte);
            result.setAa5___gt(this.aa5___gt);
            result.setAa5___gte(this.aa5___gte);
            result.setAa5___contains(this.aa5___contains);
            result.setAa5___not___contains(this.aa5___not___contains);
            result.setAa5___starts_with(this.aa5___starts_with);
            result.setAa5___not___starts_with(this.aa5___not___starts_with);
            result.setAa5___ends_with(this.aa5___ends_with);
            result.setAa5___not___ends_with(this.aa5___not___ends_with);
            result.setDeletion___eq(this.deletion___eq);
            result.setDeletion___ne(this.deletion___ne);
            result.setDeletion___null(this.deletion___null);
            result.setDeletion___not___null(this.deletion___not___null);
            result.setInsert___eq(this.insert___eq);
            result.setInsert___ne(this.insert___ne);
            result.setInsert___null(this.insert___null);
            result.setInsert___not___null(this.insert___not___null);
            result.setNo_farmaco___eq(this.no_farmaco___eq);
            result.setNo_farmaco___ne(this.no_farmaco___ne);
            result.setNo_farmaco___null(this.no_farmaco___null);
            result.setNo_farmaco___not___null(this.no_farmaco___not___null);
            result.setObject_title___eq(this.object_title___eq);
            result.setObject_title___ne(this.object_title___ne);
            result.setObject_title___null(this.object_title___null);
            result.setObject_title___not___null(this.object_title___not___null);
            result.setObject_title___in(this.object_title___in);
            result.setObject_title___not___in(this.object_title___not___in);
            result.setObject_title___lt(this.object_title___lt);
            result.setObject_title___lte(this.object_title___lte);
            result.setObject_title___gt(this.object_title___gt);
            result.setObject_title___gte(this.object_title___gte);
            result.setObject_title___contains(this.object_title___contains);
            result.setObject_title___not___contains(this.object_title___not___contains);
            result.setObject_title___starts_with(this.object_title___starts_with);
            result.setObject_title___not___starts_with(this.object_title___not___starts_with);
            result.setObject_title___ends_with(this.object_title___ends_with);
            result.setObject_title___not___ends_with(this.object_title___not___ends_with);
            result.setPosizione___eq(this.posizione___eq);
            result.setPosizione___ne(this.posizione___ne);
            result.setPosizione___null(this.posizione___null);
            result.setPosizione___not___null(this.posizione___not___null);
            result.setPosizione___in(this.posizione___in);
            result.setPosizione___not___in(this.posizione___not___in);
            result.setPosizione___lt(this.posizione___lt);
            result.setPosizione___lte(this.posizione___lte);
            result.setPosizione___gt(this.posizione___gt);
            result.setPosizione___gte(this.posizione___gte);
            result.setRegione_genoma___eq(this.regione_genoma___eq);
            result.setRegione_genoma___ne(this.regione_genoma___ne);
            result.setRegione_genoma___null(this.regione_genoma___null);
            result.setRegione_genoma___not___null(this.regione_genoma___not___null);
            result.setRegione_genoma___in(this.regione_genoma___in);
            result.setRegione_genoma___not___in(this.regione_genoma___not___in);
            result.setRegione_genoma___lt(this.regione_genoma___lt);
            result.setRegione_genoma___lte(this.regione_genoma___lte);
            result.setRegione_genoma___gt(this.regione_genoma___gt);
            result.setRegione_genoma___gte(this.regione_genoma___gte);
            result.setRegione_genoma___contains(this.regione_genoma___contains);
            result.setRegione_genoma___not___contains(this.regione_genoma___not___contains);
            result.setRegione_genoma___starts_with(this.regione_genoma___starts_with);
            result.setRegione_genoma___not___starts_with(this.regione_genoma___not___starts_with);
            result.setRegione_genoma___ends_with(this.regione_genoma___ends_with);
            result.setRegione_genoma___not___ends_with(this.regione_genoma___not___ends_with);
            result.setShift___eq(this.shift___eq);
            result.setShift___ne(this.shift___ne);
            result.setShift___null(this.shift___null);
            result.setShift___not___null(this.shift___not___null);
            result.setTemp_id___eq(this.temp_id___eq);
            result.setTemp_id___ne(this.temp_id___ne);
            result.setTemp_id___null(this.temp_id___null);
            result.setTemp_id___not___null(this.temp_id___not___null);
            result.setTemp_id___in(this.temp_id___in);
            result.setTemp_id___not___in(this.temp_id___not___in);
            result.setTemp_id___lt(this.temp_id___lt);
            result.setTemp_id___lte(this.temp_id___lte);
            result.setTemp_id___gt(this.temp_id___gt);
            result.setTemp_id___gte(this.temp_id___gte);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
