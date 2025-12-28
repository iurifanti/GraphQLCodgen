package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Feedback.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliFeedbackFilterDTO implements java.io.Serializable {

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
    private String feedback___eq;
    private String feedback___ne;
    private Boolean feedback___null;
    private Boolean feedback___not___null;
    private java.util.List<String> feedback___in;
    private java.util.List<String> feedback___not___in;
    private String feedback___lt;
    private String feedback___lte;
    private String feedback___gt;
    private String feedback___gte;
    private String feedback___contains;
    private String feedback___not___contains;
    private String feedback___starts_with;
    private String feedback___not___starts_with;
    private String feedback___ends_with;
    private String feedback___not___ends_with;
    private String sezione___eq;
    private String sezione___ne;
    private Boolean sezione___null;
    private Boolean sezione___not___null;
    private java.util.List<String> sezione___in;
    private java.util.List<String> sezione___not___in;
    private String sezione___lt;
    private String sezione___lte;
    private String sezione___gt;
    private String sezione___gte;
    private String sezione___contains;
    private String sezione___not___contains;
    private String sezione___starts_with;
    private String sezione___not___starts_with;
    private String sezione___ends_with;
    private String sezione___not___ends_with;
    private String stato___eq;
    private String stato___ne;
    private Boolean stato___null;
    private Boolean stato___not___null;
    private java.util.List<String> stato___in;
    private java.util.List<String> stato___not___in;
    private String stato___lt;
    private String stato___lte;
    private String stato___gt;
    private String stato___gte;
    private String stato___contains;
    private String stato___not___contains;
    private String stato___starts_with;
    private String stato___not___starts_with;
    private String stato___ends_with;
    private String stato___not___ends_with;
    private java.util.List<CliFeedbackFilterDTO> AND;
    private java.util.List<CliFeedbackFilterDTO> OR;
    private CliFeedbackFilterDTO NOT;

    public CliFeedbackFilterDTO() {
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

    public String getFeedback___eq() {
        return feedback___eq;
    }
    public void setFeedback___eq(String feedback___eq) {
        this.feedback___eq = feedback___eq;
    }

    public String getFeedback___ne() {
        return feedback___ne;
    }
    public void setFeedback___ne(String feedback___ne) {
        this.feedback___ne = feedback___ne;
    }

    public Boolean getFeedback___null() {
        return feedback___null;
    }
    public void setFeedback___null(Boolean feedback___null) {
        this.feedback___null = feedback___null;
    }

    public Boolean getFeedback___not___null() {
        return feedback___not___null;
    }
    public void setFeedback___not___null(Boolean feedback___not___null) {
        this.feedback___not___null = feedback___not___null;
    }

    public java.util.List<String> getFeedback___in() {
        return feedback___in;
    }
    public void setFeedback___in(java.util.List<String> feedback___in) {
        this.feedback___in = feedback___in;
    }

    public java.util.List<String> getFeedback___not___in() {
        return feedback___not___in;
    }
    public void setFeedback___not___in(java.util.List<String> feedback___not___in) {
        this.feedback___not___in = feedback___not___in;
    }

    public String getFeedback___lt() {
        return feedback___lt;
    }
    public void setFeedback___lt(String feedback___lt) {
        this.feedback___lt = feedback___lt;
    }

    public String getFeedback___lte() {
        return feedback___lte;
    }
    public void setFeedback___lte(String feedback___lte) {
        this.feedback___lte = feedback___lte;
    }

    public String getFeedback___gt() {
        return feedback___gt;
    }
    public void setFeedback___gt(String feedback___gt) {
        this.feedback___gt = feedback___gt;
    }

    public String getFeedback___gte() {
        return feedback___gte;
    }
    public void setFeedback___gte(String feedback___gte) {
        this.feedback___gte = feedback___gte;
    }

    public String getFeedback___contains() {
        return feedback___contains;
    }
    public void setFeedback___contains(String feedback___contains) {
        this.feedback___contains = feedback___contains;
    }

    public String getFeedback___not___contains() {
        return feedback___not___contains;
    }
    public void setFeedback___not___contains(String feedback___not___contains) {
        this.feedback___not___contains = feedback___not___contains;
    }

    public String getFeedback___starts_with() {
        return feedback___starts_with;
    }
    public void setFeedback___starts_with(String feedback___starts_with) {
        this.feedback___starts_with = feedback___starts_with;
    }

    public String getFeedback___not___starts_with() {
        return feedback___not___starts_with;
    }
    public void setFeedback___not___starts_with(String feedback___not___starts_with) {
        this.feedback___not___starts_with = feedback___not___starts_with;
    }

    public String getFeedback___ends_with() {
        return feedback___ends_with;
    }
    public void setFeedback___ends_with(String feedback___ends_with) {
        this.feedback___ends_with = feedback___ends_with;
    }

    public String getFeedback___not___ends_with() {
        return feedback___not___ends_with;
    }
    public void setFeedback___not___ends_with(String feedback___not___ends_with) {
        this.feedback___not___ends_with = feedback___not___ends_with;
    }

    public String getSezione___eq() {
        return sezione___eq;
    }
    public void setSezione___eq(String sezione___eq) {
        this.sezione___eq = sezione___eq;
    }

    public String getSezione___ne() {
        return sezione___ne;
    }
    public void setSezione___ne(String sezione___ne) {
        this.sezione___ne = sezione___ne;
    }

    public Boolean getSezione___null() {
        return sezione___null;
    }
    public void setSezione___null(Boolean sezione___null) {
        this.sezione___null = sezione___null;
    }

    public Boolean getSezione___not___null() {
        return sezione___not___null;
    }
    public void setSezione___not___null(Boolean sezione___not___null) {
        this.sezione___not___null = sezione___not___null;
    }

    public java.util.List<String> getSezione___in() {
        return sezione___in;
    }
    public void setSezione___in(java.util.List<String> sezione___in) {
        this.sezione___in = sezione___in;
    }

    public java.util.List<String> getSezione___not___in() {
        return sezione___not___in;
    }
    public void setSezione___not___in(java.util.List<String> sezione___not___in) {
        this.sezione___not___in = sezione___not___in;
    }

    public String getSezione___lt() {
        return sezione___lt;
    }
    public void setSezione___lt(String sezione___lt) {
        this.sezione___lt = sezione___lt;
    }

    public String getSezione___lte() {
        return sezione___lte;
    }
    public void setSezione___lte(String sezione___lte) {
        this.sezione___lte = sezione___lte;
    }

    public String getSezione___gt() {
        return sezione___gt;
    }
    public void setSezione___gt(String sezione___gt) {
        this.sezione___gt = sezione___gt;
    }

    public String getSezione___gte() {
        return sezione___gte;
    }
    public void setSezione___gte(String sezione___gte) {
        this.sezione___gte = sezione___gte;
    }

    public String getSezione___contains() {
        return sezione___contains;
    }
    public void setSezione___contains(String sezione___contains) {
        this.sezione___contains = sezione___contains;
    }

    public String getSezione___not___contains() {
        return sezione___not___contains;
    }
    public void setSezione___not___contains(String sezione___not___contains) {
        this.sezione___not___contains = sezione___not___contains;
    }

    public String getSezione___starts_with() {
        return sezione___starts_with;
    }
    public void setSezione___starts_with(String sezione___starts_with) {
        this.sezione___starts_with = sezione___starts_with;
    }

    public String getSezione___not___starts_with() {
        return sezione___not___starts_with;
    }
    public void setSezione___not___starts_with(String sezione___not___starts_with) {
        this.sezione___not___starts_with = sezione___not___starts_with;
    }

    public String getSezione___ends_with() {
        return sezione___ends_with;
    }
    public void setSezione___ends_with(String sezione___ends_with) {
        this.sezione___ends_with = sezione___ends_with;
    }

    public String getSezione___not___ends_with() {
        return sezione___not___ends_with;
    }
    public void setSezione___not___ends_with(String sezione___not___ends_with) {
        this.sezione___not___ends_with = sezione___not___ends_with;
    }

    public String getStato___eq() {
        return stato___eq;
    }
    public void setStato___eq(String stato___eq) {
        this.stato___eq = stato___eq;
    }

    public String getStato___ne() {
        return stato___ne;
    }
    public void setStato___ne(String stato___ne) {
        this.stato___ne = stato___ne;
    }

    public Boolean getStato___null() {
        return stato___null;
    }
    public void setStato___null(Boolean stato___null) {
        this.stato___null = stato___null;
    }

    public Boolean getStato___not___null() {
        return stato___not___null;
    }
    public void setStato___not___null(Boolean stato___not___null) {
        this.stato___not___null = stato___not___null;
    }

    public java.util.List<String> getStato___in() {
        return stato___in;
    }
    public void setStato___in(java.util.List<String> stato___in) {
        this.stato___in = stato___in;
    }

    public java.util.List<String> getStato___not___in() {
        return stato___not___in;
    }
    public void setStato___not___in(java.util.List<String> stato___not___in) {
        this.stato___not___in = stato___not___in;
    }

    public String getStato___lt() {
        return stato___lt;
    }
    public void setStato___lt(String stato___lt) {
        this.stato___lt = stato___lt;
    }

    public String getStato___lte() {
        return stato___lte;
    }
    public void setStato___lte(String stato___lte) {
        this.stato___lte = stato___lte;
    }

    public String getStato___gt() {
        return stato___gt;
    }
    public void setStato___gt(String stato___gt) {
        this.stato___gt = stato___gt;
    }

    public String getStato___gte() {
        return stato___gte;
    }
    public void setStato___gte(String stato___gte) {
        this.stato___gte = stato___gte;
    }

    public String getStato___contains() {
        return stato___contains;
    }
    public void setStato___contains(String stato___contains) {
        this.stato___contains = stato___contains;
    }

    public String getStato___not___contains() {
        return stato___not___contains;
    }
    public void setStato___not___contains(String stato___not___contains) {
        this.stato___not___contains = stato___not___contains;
    }

    public String getStato___starts_with() {
        return stato___starts_with;
    }
    public void setStato___starts_with(String stato___starts_with) {
        this.stato___starts_with = stato___starts_with;
    }

    public String getStato___not___starts_with() {
        return stato___not___starts_with;
    }
    public void setStato___not___starts_with(String stato___not___starts_with) {
        this.stato___not___starts_with = stato___not___starts_with;
    }

    public String getStato___ends_with() {
        return stato___ends_with;
    }
    public void setStato___ends_with(String stato___ends_with) {
        this.stato___ends_with = stato___ends_with;
    }

    public String getStato___not___ends_with() {
        return stato___not___ends_with;
    }
    public void setStato___not___ends_with(String stato___not___ends_with) {
        this.stato___not___ends_with = stato___not___ends_with;
    }

    public java.util.List<CliFeedbackFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliFeedbackFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliFeedbackFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliFeedbackFilterDTO> OR) {
        this.OR = OR;
    }

    public CliFeedbackFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliFeedbackFilterDTO NOT) {
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
        if (feedback___eq != null) {
            joiner.add("feedback___eq: " + GraphQLRequestSerializer.getEntry(feedback___eq));
        }
        if (feedback___ne != null) {
            joiner.add("feedback___ne: " + GraphQLRequestSerializer.getEntry(feedback___ne));
        }
        if (feedback___null != null) {
            joiner.add("feedback___null: " + GraphQLRequestSerializer.getEntry(feedback___null));
        }
        if (feedback___not___null != null) {
            joiner.add("feedback___not___null: " + GraphQLRequestSerializer.getEntry(feedback___not___null));
        }
        if (feedback___in != null) {
            joiner.add("feedback___in: " + GraphQLRequestSerializer.getEntry(feedback___in));
        }
        if (feedback___not___in != null) {
            joiner.add("feedback___not___in: " + GraphQLRequestSerializer.getEntry(feedback___not___in));
        }
        if (feedback___lt != null) {
            joiner.add("feedback___lt: " + GraphQLRequestSerializer.getEntry(feedback___lt));
        }
        if (feedback___lte != null) {
            joiner.add("feedback___lte: " + GraphQLRequestSerializer.getEntry(feedback___lte));
        }
        if (feedback___gt != null) {
            joiner.add("feedback___gt: " + GraphQLRequestSerializer.getEntry(feedback___gt));
        }
        if (feedback___gte != null) {
            joiner.add("feedback___gte: " + GraphQLRequestSerializer.getEntry(feedback___gte));
        }
        if (feedback___contains != null) {
            joiner.add("feedback___contains: " + GraphQLRequestSerializer.getEntry(feedback___contains));
        }
        if (feedback___not___contains != null) {
            joiner.add("feedback___not___contains: " + GraphQLRequestSerializer.getEntry(feedback___not___contains));
        }
        if (feedback___starts_with != null) {
            joiner.add("feedback___starts_with: " + GraphQLRequestSerializer.getEntry(feedback___starts_with));
        }
        if (feedback___not___starts_with != null) {
            joiner.add("feedback___not___starts_with: " + GraphQLRequestSerializer.getEntry(feedback___not___starts_with));
        }
        if (feedback___ends_with != null) {
            joiner.add("feedback___ends_with: " + GraphQLRequestSerializer.getEntry(feedback___ends_with));
        }
        if (feedback___not___ends_with != null) {
            joiner.add("feedback___not___ends_with: " + GraphQLRequestSerializer.getEntry(feedback___not___ends_with));
        }
        if (sezione___eq != null) {
            joiner.add("sezione___eq: " + GraphQLRequestSerializer.getEntry(sezione___eq));
        }
        if (sezione___ne != null) {
            joiner.add("sezione___ne: " + GraphQLRequestSerializer.getEntry(sezione___ne));
        }
        if (sezione___null != null) {
            joiner.add("sezione___null: " + GraphQLRequestSerializer.getEntry(sezione___null));
        }
        if (sezione___not___null != null) {
            joiner.add("sezione___not___null: " + GraphQLRequestSerializer.getEntry(sezione___not___null));
        }
        if (sezione___in != null) {
            joiner.add("sezione___in: " + GraphQLRequestSerializer.getEntry(sezione___in));
        }
        if (sezione___not___in != null) {
            joiner.add("sezione___not___in: " + GraphQLRequestSerializer.getEntry(sezione___not___in));
        }
        if (sezione___lt != null) {
            joiner.add("sezione___lt: " + GraphQLRequestSerializer.getEntry(sezione___lt));
        }
        if (sezione___lte != null) {
            joiner.add("sezione___lte: " + GraphQLRequestSerializer.getEntry(sezione___lte));
        }
        if (sezione___gt != null) {
            joiner.add("sezione___gt: " + GraphQLRequestSerializer.getEntry(sezione___gt));
        }
        if (sezione___gte != null) {
            joiner.add("sezione___gte: " + GraphQLRequestSerializer.getEntry(sezione___gte));
        }
        if (sezione___contains != null) {
            joiner.add("sezione___contains: " + GraphQLRequestSerializer.getEntry(sezione___contains));
        }
        if (sezione___not___contains != null) {
            joiner.add("sezione___not___contains: " + GraphQLRequestSerializer.getEntry(sezione___not___contains));
        }
        if (sezione___starts_with != null) {
            joiner.add("sezione___starts_with: " + GraphQLRequestSerializer.getEntry(sezione___starts_with));
        }
        if (sezione___not___starts_with != null) {
            joiner.add("sezione___not___starts_with: " + GraphQLRequestSerializer.getEntry(sezione___not___starts_with));
        }
        if (sezione___ends_with != null) {
            joiner.add("sezione___ends_with: " + GraphQLRequestSerializer.getEntry(sezione___ends_with));
        }
        if (sezione___not___ends_with != null) {
            joiner.add("sezione___not___ends_with: " + GraphQLRequestSerializer.getEntry(sezione___not___ends_with));
        }
        if (stato___eq != null) {
            joiner.add("stato___eq: " + GraphQLRequestSerializer.getEntry(stato___eq));
        }
        if (stato___ne != null) {
            joiner.add("stato___ne: " + GraphQLRequestSerializer.getEntry(stato___ne));
        }
        if (stato___null != null) {
            joiner.add("stato___null: " + GraphQLRequestSerializer.getEntry(stato___null));
        }
        if (stato___not___null != null) {
            joiner.add("stato___not___null: " + GraphQLRequestSerializer.getEntry(stato___not___null));
        }
        if (stato___in != null) {
            joiner.add("stato___in: " + GraphQLRequestSerializer.getEntry(stato___in));
        }
        if (stato___not___in != null) {
            joiner.add("stato___not___in: " + GraphQLRequestSerializer.getEntry(stato___not___in));
        }
        if (stato___lt != null) {
            joiner.add("stato___lt: " + GraphQLRequestSerializer.getEntry(stato___lt));
        }
        if (stato___lte != null) {
            joiner.add("stato___lte: " + GraphQLRequestSerializer.getEntry(stato___lte));
        }
        if (stato___gt != null) {
            joiner.add("stato___gt: " + GraphQLRequestSerializer.getEntry(stato___gt));
        }
        if (stato___gte != null) {
            joiner.add("stato___gte: " + GraphQLRequestSerializer.getEntry(stato___gte));
        }
        if (stato___contains != null) {
            joiner.add("stato___contains: " + GraphQLRequestSerializer.getEntry(stato___contains));
        }
        if (stato___not___contains != null) {
            joiner.add("stato___not___contains: " + GraphQLRequestSerializer.getEntry(stato___not___contains));
        }
        if (stato___starts_with != null) {
            joiner.add("stato___starts_with: " + GraphQLRequestSerializer.getEntry(stato___starts_with));
        }
        if (stato___not___starts_with != null) {
            joiner.add("stato___not___starts_with: " + GraphQLRequestSerializer.getEntry(stato___not___starts_with));
        }
        if (stato___ends_with != null) {
            joiner.add("stato___ends_with: " + GraphQLRequestSerializer.getEntry(stato___ends_with));
        }
        if (stato___not___ends_with != null) {
            joiner.add("stato___not___ends_with: " + GraphQLRequestSerializer.getEntry(stato___not___ends_with));
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

    public static CliFeedbackFilterDTO.Builder builder() {
        return new CliFeedbackFilterDTO.Builder();
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
        private String feedback___eq;
        private String feedback___ne;
        private Boolean feedback___null;
        private Boolean feedback___not___null;
        private java.util.List<String> feedback___in;
        private java.util.List<String> feedback___not___in;
        private String feedback___lt;
        private String feedback___lte;
        private String feedback___gt;
        private String feedback___gte;
        private String feedback___contains;
        private String feedback___not___contains;
        private String feedback___starts_with;
        private String feedback___not___starts_with;
        private String feedback___ends_with;
        private String feedback___not___ends_with;
        private String sezione___eq;
        private String sezione___ne;
        private Boolean sezione___null;
        private Boolean sezione___not___null;
        private java.util.List<String> sezione___in;
        private java.util.List<String> sezione___not___in;
        private String sezione___lt;
        private String sezione___lte;
        private String sezione___gt;
        private String sezione___gte;
        private String sezione___contains;
        private String sezione___not___contains;
        private String sezione___starts_with;
        private String sezione___not___starts_with;
        private String sezione___ends_with;
        private String sezione___not___ends_with;
        private String stato___eq;
        private String stato___ne;
        private Boolean stato___null;
        private Boolean stato___not___null;
        private java.util.List<String> stato___in;
        private java.util.List<String> stato___not___in;
        private String stato___lt;
        private String stato___lte;
        private String stato___gt;
        private String stato___gte;
        private String stato___contains;
        private String stato___not___contains;
        private String stato___starts_with;
        private String stato___not___starts_with;
        private String stato___ends_with;
        private String stato___not___ends_with;
        private java.util.List<CliFeedbackFilterDTO> AND;
        private java.util.List<CliFeedbackFilterDTO> OR;
        private CliFeedbackFilterDTO NOT;

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

        public Builder setFeedback___eq(String feedback___eq) {
            this.feedback___eq = feedback___eq;
            return this;
        }

        public Builder setFeedback___ne(String feedback___ne) {
            this.feedback___ne = feedback___ne;
            return this;
        }

        public Builder setFeedback___null(Boolean feedback___null) {
            this.feedback___null = feedback___null;
            return this;
        }

        public Builder setFeedback___not___null(Boolean feedback___not___null) {
            this.feedback___not___null = feedback___not___null;
            return this;
        }

        public Builder setFeedback___in(java.util.List<String> feedback___in) {
            this.feedback___in = feedback___in;
            return this;
        }

        public Builder setFeedback___not___in(java.util.List<String> feedback___not___in) {
            this.feedback___not___in = feedback___not___in;
            return this;
        }

        public Builder setFeedback___lt(String feedback___lt) {
            this.feedback___lt = feedback___lt;
            return this;
        }

        public Builder setFeedback___lte(String feedback___lte) {
            this.feedback___lte = feedback___lte;
            return this;
        }

        public Builder setFeedback___gt(String feedback___gt) {
            this.feedback___gt = feedback___gt;
            return this;
        }

        public Builder setFeedback___gte(String feedback___gte) {
            this.feedback___gte = feedback___gte;
            return this;
        }

        public Builder setFeedback___contains(String feedback___contains) {
            this.feedback___contains = feedback___contains;
            return this;
        }

        public Builder setFeedback___not___contains(String feedback___not___contains) {
            this.feedback___not___contains = feedback___not___contains;
            return this;
        }

        public Builder setFeedback___starts_with(String feedback___starts_with) {
            this.feedback___starts_with = feedback___starts_with;
            return this;
        }

        public Builder setFeedback___not___starts_with(String feedback___not___starts_with) {
            this.feedback___not___starts_with = feedback___not___starts_with;
            return this;
        }

        public Builder setFeedback___ends_with(String feedback___ends_with) {
            this.feedback___ends_with = feedback___ends_with;
            return this;
        }

        public Builder setFeedback___not___ends_with(String feedback___not___ends_with) {
            this.feedback___not___ends_with = feedback___not___ends_with;
            return this;
        }

        public Builder setSezione___eq(String sezione___eq) {
            this.sezione___eq = sezione___eq;
            return this;
        }

        public Builder setSezione___ne(String sezione___ne) {
            this.sezione___ne = sezione___ne;
            return this;
        }

        public Builder setSezione___null(Boolean sezione___null) {
            this.sezione___null = sezione___null;
            return this;
        }

        public Builder setSezione___not___null(Boolean sezione___not___null) {
            this.sezione___not___null = sezione___not___null;
            return this;
        }

        public Builder setSezione___in(java.util.List<String> sezione___in) {
            this.sezione___in = sezione___in;
            return this;
        }

        public Builder setSezione___not___in(java.util.List<String> sezione___not___in) {
            this.sezione___not___in = sezione___not___in;
            return this;
        }

        public Builder setSezione___lt(String sezione___lt) {
            this.sezione___lt = sezione___lt;
            return this;
        }

        public Builder setSezione___lte(String sezione___lte) {
            this.sezione___lte = sezione___lte;
            return this;
        }

        public Builder setSezione___gt(String sezione___gt) {
            this.sezione___gt = sezione___gt;
            return this;
        }

        public Builder setSezione___gte(String sezione___gte) {
            this.sezione___gte = sezione___gte;
            return this;
        }

        public Builder setSezione___contains(String sezione___contains) {
            this.sezione___contains = sezione___contains;
            return this;
        }

        public Builder setSezione___not___contains(String sezione___not___contains) {
            this.sezione___not___contains = sezione___not___contains;
            return this;
        }

        public Builder setSezione___starts_with(String sezione___starts_with) {
            this.sezione___starts_with = sezione___starts_with;
            return this;
        }

        public Builder setSezione___not___starts_with(String sezione___not___starts_with) {
            this.sezione___not___starts_with = sezione___not___starts_with;
            return this;
        }

        public Builder setSezione___ends_with(String sezione___ends_with) {
            this.sezione___ends_with = sezione___ends_with;
            return this;
        }

        public Builder setSezione___not___ends_with(String sezione___not___ends_with) {
            this.sezione___not___ends_with = sezione___not___ends_with;
            return this;
        }

        public Builder setStato___eq(String stato___eq) {
            this.stato___eq = stato___eq;
            return this;
        }

        public Builder setStato___ne(String stato___ne) {
            this.stato___ne = stato___ne;
            return this;
        }

        public Builder setStato___null(Boolean stato___null) {
            this.stato___null = stato___null;
            return this;
        }

        public Builder setStato___not___null(Boolean stato___not___null) {
            this.stato___not___null = stato___not___null;
            return this;
        }

        public Builder setStato___in(java.util.List<String> stato___in) {
            this.stato___in = stato___in;
            return this;
        }

        public Builder setStato___not___in(java.util.List<String> stato___not___in) {
            this.stato___not___in = stato___not___in;
            return this;
        }

        public Builder setStato___lt(String stato___lt) {
            this.stato___lt = stato___lt;
            return this;
        }

        public Builder setStato___lte(String stato___lte) {
            this.stato___lte = stato___lte;
            return this;
        }

        public Builder setStato___gt(String stato___gt) {
            this.stato___gt = stato___gt;
            return this;
        }

        public Builder setStato___gte(String stato___gte) {
            this.stato___gte = stato___gte;
            return this;
        }

        public Builder setStato___contains(String stato___contains) {
            this.stato___contains = stato___contains;
            return this;
        }

        public Builder setStato___not___contains(String stato___not___contains) {
            this.stato___not___contains = stato___not___contains;
            return this;
        }

        public Builder setStato___starts_with(String stato___starts_with) {
            this.stato___starts_with = stato___starts_with;
            return this;
        }

        public Builder setStato___not___starts_with(String stato___not___starts_with) {
            this.stato___not___starts_with = stato___not___starts_with;
            return this;
        }

        public Builder setStato___ends_with(String stato___ends_with) {
            this.stato___ends_with = stato___ends_with;
            return this;
        }

        public Builder setStato___not___ends_with(String stato___not___ends_with) {
            this.stato___not___ends_with = stato___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliFeedbackFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliFeedbackFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliFeedbackFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliFeedbackFilterDTO build() {
            CliFeedbackFilterDTO result = new CliFeedbackFilterDTO();
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
            result.setFeedback___eq(this.feedback___eq);
            result.setFeedback___ne(this.feedback___ne);
            result.setFeedback___null(this.feedback___null);
            result.setFeedback___not___null(this.feedback___not___null);
            result.setFeedback___in(this.feedback___in);
            result.setFeedback___not___in(this.feedback___not___in);
            result.setFeedback___lt(this.feedback___lt);
            result.setFeedback___lte(this.feedback___lte);
            result.setFeedback___gt(this.feedback___gt);
            result.setFeedback___gte(this.feedback___gte);
            result.setFeedback___contains(this.feedback___contains);
            result.setFeedback___not___contains(this.feedback___not___contains);
            result.setFeedback___starts_with(this.feedback___starts_with);
            result.setFeedback___not___starts_with(this.feedback___not___starts_with);
            result.setFeedback___ends_with(this.feedback___ends_with);
            result.setFeedback___not___ends_with(this.feedback___not___ends_with);
            result.setSezione___eq(this.sezione___eq);
            result.setSezione___ne(this.sezione___ne);
            result.setSezione___null(this.sezione___null);
            result.setSezione___not___null(this.sezione___not___null);
            result.setSezione___in(this.sezione___in);
            result.setSezione___not___in(this.sezione___not___in);
            result.setSezione___lt(this.sezione___lt);
            result.setSezione___lte(this.sezione___lte);
            result.setSezione___gt(this.sezione___gt);
            result.setSezione___gte(this.sezione___gte);
            result.setSezione___contains(this.sezione___contains);
            result.setSezione___not___contains(this.sezione___not___contains);
            result.setSezione___starts_with(this.sezione___starts_with);
            result.setSezione___not___starts_with(this.sezione___not___starts_with);
            result.setSezione___ends_with(this.sezione___ends_with);
            result.setSezione___not___ends_with(this.sezione___not___ends_with);
            result.setStato___eq(this.stato___eq);
            result.setStato___ne(this.stato___ne);
            result.setStato___null(this.stato___null);
            result.setStato___not___null(this.stato___not___null);
            result.setStato___in(this.stato___in);
            result.setStato___not___in(this.stato___not___in);
            result.setStato___lt(this.stato___lt);
            result.setStato___lte(this.stato___lte);
            result.setStato___gt(this.stato___gt);
            result.setStato___gte(this.stato___gte);
            result.setStato___contains(this.stato___contains);
            result.setStato___not___contains(this.stato___not___contains);
            result.setStato___starts_with(this.stato___starts_with);
            result.setStato___not___starts_with(this.stato___not___starts_with);
            result.setStato___ends_with(this.stato___ends_with);
            result.setStato___not___ends_with(this.stato___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
