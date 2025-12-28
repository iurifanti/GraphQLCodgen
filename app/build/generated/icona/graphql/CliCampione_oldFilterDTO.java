package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type campione_old.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliCampione_oldFilterDTO implements java.io.Serializable {

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
    private String campione___eq;
    private String campione___ne;
    private Boolean campione___null;
    private Boolean campione___not___null;
    private java.util.List<String> campione___in;
    private java.util.List<String> campione___not___in;
    private String campione___lt;
    private String campione___lte;
    private String campione___gt;
    private String campione___gte;
    private String campione___contains;
    private String campione___not___contains;
    private String campione___starts_with;
    private String campione___not___starts_with;
    private String campione___ends_with;
    private String campione___not___ends_with;
    private String centro_icona___eq;
    private String centro_icona___ne;
    private Boolean centro_icona___null;
    private Boolean centro_icona___not___null;
    private java.util.List<String> centro_icona___in;
    private java.util.List<String> centro_icona___not___in;
    private String centro_icona___lt;
    private String centro_icona___lte;
    private String centro_icona___gt;
    private String centro_icona___gte;
    private String centro_icona___contains;
    private String centro_icona___not___contains;
    private String centro_icona___starts_with;
    private String centro_icona___not___starts_with;
    private String centro_icona___ends_with;
    private String centro_icona___not___ends_with;
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
    private String etichetta___eq;
    private String etichetta___ne;
    private Boolean etichetta___null;
    private Boolean etichetta___not___null;
    private java.util.List<String> etichetta___in;
    private java.util.List<String> etichetta___not___in;
    private String etichetta___lt;
    private String etichetta___lte;
    private String etichetta___gt;
    private String etichetta___gte;
    private String etichetta___contains;
    private String etichetta___not___contains;
    private String etichetta___starts_with;
    private String etichetta___not___starts_with;
    private String etichetta___ends_with;
    private String etichetta___not___ends_with;
    private Integer id_campione___eq;
    private Integer id_campione___ne;
    private Boolean id_campione___null;
    private Boolean id_campione___not___null;
    private java.util.List<Integer> id_campione___in;
    private java.util.List<Integer> id_campione___not___in;
    private Integer id_campione___lt;
    private Integer id_campione___lte;
    private Integer id_campione___gt;
    private Integer id_campione___gte;
    private String note_campione___eq;
    private String note_campione___ne;
    private Boolean note_campione___null;
    private Boolean note_campione___not___null;
    private java.util.List<String> note_campione___in;
    private java.util.List<String> note_campione___not___in;
    private String note_campione___lt;
    private String note_campione___lte;
    private String note_campione___gt;
    private String note_campione___gte;
    private String note_campione___contains;
    private String note_campione___not___contains;
    private String note_campione___starts_with;
    private String note_campione___not___starts_with;
    private String note_campione___ends_with;
    private String note_campione___not___ends_with;
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
    private String paziente_hepaicona___eq;
    private String paziente_hepaicona___ne;
    private Boolean paziente_hepaicona___null;
    private Boolean paziente_hepaicona___not___null;
    private java.util.List<String> paziente_hepaicona___in;
    private java.util.List<String> paziente_hepaicona___not___in;
    private String paziente_hepaicona___lt;
    private String paziente_hepaicona___lte;
    private String paziente_hepaicona___gt;
    private String paziente_hepaicona___gte;
    private String paziente_hepaicona___contains;
    private String paziente_hepaicona___not___contains;
    private String paziente_hepaicona___starts_with;
    private String paziente_hepaicona___not___starts_with;
    private String paziente_hepaicona___ends_with;
    private String paziente_hepaicona___not___ends_with;
    private String paziente_icona___eq;
    private String paziente_icona___ne;
    private Boolean paziente_icona___null;
    private Boolean paziente_icona___not___null;
    private java.util.List<String> paziente_icona___in;
    private java.util.List<String> paziente_icona___not___in;
    private String paziente_icona___lt;
    private String paziente_icona___lte;
    private String paziente_icona___gt;
    private String paziente_icona___gte;
    private String paziente_icona___contains;
    private String paziente_icona___not___contains;
    private String paziente_icona___starts_with;
    private String paziente_icona___not___starts_with;
    private String paziente_icona___ends_with;
    private String paziente_icona___not___ends_with;
    private String paziente_nascita___eq;
    private String paziente_nascita___ne;
    private Boolean paziente_nascita___null;
    private Boolean paziente_nascita___not___null;
    private java.util.List<String> paziente_nascita___in;
    private java.util.List<String> paziente_nascita___not___in;
    private String paziente_nascita___lt;
    private String paziente_nascita___lte;
    private String paziente_nascita___gt;
    private String paziente_nascita___gte;
    private String posizioni___eq;
    private String posizioni___ne;
    private Boolean posizioni___null;
    private Boolean posizioni___not___null;
    private java.util.List<String> posizioni___in;
    private java.util.List<String> posizioni___not___in;
    private String posizioni___lt;
    private String posizioni___lte;
    private String posizioni___gt;
    private String posizioni___gte;
    private String posizioni___contains;
    private String posizioni___not___contains;
    private String posizioni___starts_with;
    private String posizioni___not___starts_with;
    private String posizioni___ends_with;
    private String posizioni___not___ends_with;
    private Integer provette_iniziali___eq;
    private Integer provette_iniziali___ne;
    private Boolean provette_iniziali___null;
    private Boolean provette_iniziali___not___null;
    private java.util.List<Integer> provette_iniziali___in;
    private java.util.List<Integer> provette_iniziali___not___in;
    private Integer provette_iniziali___lt;
    private Integer provette_iniziali___lte;
    private Integer provette_iniziali___gt;
    private Integer provette_iniziali___gte;
    private Integer provette_rimanenti___eq;
    private Integer provette_rimanenti___ne;
    private Boolean provette_rimanenti___null;
    private Boolean provette_rimanenti___not___null;
    private java.util.List<Integer> provette_rimanenti___in;
    private java.util.List<Integer> provette_rimanenti___not___in;
    private Integer provette_rimanenti___lt;
    private Integer provette_rimanenti___lte;
    private Integer provette_rimanenti___gt;
    private Integer provette_rimanenti___gte;
    private String qt___eq;
    private String qt___ne;
    private Boolean qt___null;
    private Boolean qt___not___null;
    private java.util.List<String> qt___in;
    private java.util.List<String> qt___not___in;
    private String qt___lt;
    private String qt___lte;
    private String qt___gt;
    private String qt___gte;
    private String quantita___eq;
    private String quantita___ne;
    private Boolean quantita___null;
    private Boolean quantita___not___null;
    private java.util.List<String> quantita___in;
    private java.util.List<String> quantita___not___in;
    private String quantita___lt;
    private String quantita___lte;
    private String quantita___gt;
    private String quantita___gte;
    private String quantita___contains;
    private String quantita___not___contains;
    private String quantita___starts_with;
    private String quantita___not___starts_with;
    private String quantita___ends_with;
    private String quantita___not___ends_with;
    private String rack___eq;
    private String rack___ne;
    private Boolean rack___null;
    private Boolean rack___not___null;
    private java.util.List<String> rack___in;
    private java.util.List<String> rack___not___in;
    private String rack___lt;
    private String rack___lte;
    private String rack___gt;
    private String rack___gte;
    private String rack___contains;
    private String rack___not___contains;
    private String rack___starts_with;
    private String rack___not___starts_with;
    private String rack___ends_with;
    private String rack___not___ends_with;
    private String sede_biobanca___eq;
    private String sede_biobanca___ne;
    private Boolean sede_biobanca___null;
    private Boolean sede_biobanca___not___null;
    private java.util.List<String> sede_biobanca___in;
    private java.util.List<String> sede_biobanca___not___in;
    private String sede_biobanca___lt;
    private String sede_biobanca___lte;
    private String sede_biobanca___gt;
    private String sede_biobanca___gte;
    private String sede_biobanca___contains;
    private String sede_biobanca___not___contains;
    private String sede_biobanca___starts_with;
    private String sede_biobanca___not___starts_with;
    private String sede_biobanca___ends_with;
    private String sede_biobanca___not___ends_with;
    private String um___eq;
    private String um___ne;
    private Boolean um___null;
    private Boolean um___not___null;
    private java.util.List<String> um___in;
    private java.util.List<String> um___not___in;
    private String um___lt;
    private String um___lte;
    private String um___gt;
    private String um___gte;
    private String um___contains;
    private String um___not___contains;
    private String um___starts_with;
    private String um___not___starts_with;
    private String um___ends_with;
    private String um___not___ends_with;
    private java.util.List<CliCampione_oldFilterDTO> AND;
    private java.util.List<CliCampione_oldFilterDTO> OR;
    private CliCampione_oldFilterDTO NOT;

    public CliCampione_oldFilterDTO() {
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

    public String getCampione___eq() {
        return campione___eq;
    }
    public void setCampione___eq(String campione___eq) {
        this.campione___eq = campione___eq;
    }

    public String getCampione___ne() {
        return campione___ne;
    }
    public void setCampione___ne(String campione___ne) {
        this.campione___ne = campione___ne;
    }

    public Boolean getCampione___null() {
        return campione___null;
    }
    public void setCampione___null(Boolean campione___null) {
        this.campione___null = campione___null;
    }

    public Boolean getCampione___not___null() {
        return campione___not___null;
    }
    public void setCampione___not___null(Boolean campione___not___null) {
        this.campione___not___null = campione___not___null;
    }

    public java.util.List<String> getCampione___in() {
        return campione___in;
    }
    public void setCampione___in(java.util.List<String> campione___in) {
        this.campione___in = campione___in;
    }

    public java.util.List<String> getCampione___not___in() {
        return campione___not___in;
    }
    public void setCampione___not___in(java.util.List<String> campione___not___in) {
        this.campione___not___in = campione___not___in;
    }

    public String getCampione___lt() {
        return campione___lt;
    }
    public void setCampione___lt(String campione___lt) {
        this.campione___lt = campione___lt;
    }

    public String getCampione___lte() {
        return campione___lte;
    }
    public void setCampione___lte(String campione___lte) {
        this.campione___lte = campione___lte;
    }

    public String getCampione___gt() {
        return campione___gt;
    }
    public void setCampione___gt(String campione___gt) {
        this.campione___gt = campione___gt;
    }

    public String getCampione___gte() {
        return campione___gte;
    }
    public void setCampione___gte(String campione___gte) {
        this.campione___gte = campione___gte;
    }

    public String getCampione___contains() {
        return campione___contains;
    }
    public void setCampione___contains(String campione___contains) {
        this.campione___contains = campione___contains;
    }

    public String getCampione___not___contains() {
        return campione___not___contains;
    }
    public void setCampione___not___contains(String campione___not___contains) {
        this.campione___not___contains = campione___not___contains;
    }

    public String getCampione___starts_with() {
        return campione___starts_with;
    }
    public void setCampione___starts_with(String campione___starts_with) {
        this.campione___starts_with = campione___starts_with;
    }

    public String getCampione___not___starts_with() {
        return campione___not___starts_with;
    }
    public void setCampione___not___starts_with(String campione___not___starts_with) {
        this.campione___not___starts_with = campione___not___starts_with;
    }

    public String getCampione___ends_with() {
        return campione___ends_with;
    }
    public void setCampione___ends_with(String campione___ends_with) {
        this.campione___ends_with = campione___ends_with;
    }

    public String getCampione___not___ends_with() {
        return campione___not___ends_with;
    }
    public void setCampione___not___ends_with(String campione___not___ends_with) {
        this.campione___not___ends_with = campione___not___ends_with;
    }

    public String getCentro_icona___eq() {
        return centro_icona___eq;
    }
    public void setCentro_icona___eq(String centro_icona___eq) {
        this.centro_icona___eq = centro_icona___eq;
    }

    public String getCentro_icona___ne() {
        return centro_icona___ne;
    }
    public void setCentro_icona___ne(String centro_icona___ne) {
        this.centro_icona___ne = centro_icona___ne;
    }

    public Boolean getCentro_icona___null() {
        return centro_icona___null;
    }
    public void setCentro_icona___null(Boolean centro_icona___null) {
        this.centro_icona___null = centro_icona___null;
    }

    public Boolean getCentro_icona___not___null() {
        return centro_icona___not___null;
    }
    public void setCentro_icona___not___null(Boolean centro_icona___not___null) {
        this.centro_icona___not___null = centro_icona___not___null;
    }

    public java.util.List<String> getCentro_icona___in() {
        return centro_icona___in;
    }
    public void setCentro_icona___in(java.util.List<String> centro_icona___in) {
        this.centro_icona___in = centro_icona___in;
    }

    public java.util.List<String> getCentro_icona___not___in() {
        return centro_icona___not___in;
    }
    public void setCentro_icona___not___in(java.util.List<String> centro_icona___not___in) {
        this.centro_icona___not___in = centro_icona___not___in;
    }

    public String getCentro_icona___lt() {
        return centro_icona___lt;
    }
    public void setCentro_icona___lt(String centro_icona___lt) {
        this.centro_icona___lt = centro_icona___lt;
    }

    public String getCentro_icona___lte() {
        return centro_icona___lte;
    }
    public void setCentro_icona___lte(String centro_icona___lte) {
        this.centro_icona___lte = centro_icona___lte;
    }

    public String getCentro_icona___gt() {
        return centro_icona___gt;
    }
    public void setCentro_icona___gt(String centro_icona___gt) {
        this.centro_icona___gt = centro_icona___gt;
    }

    public String getCentro_icona___gte() {
        return centro_icona___gte;
    }
    public void setCentro_icona___gte(String centro_icona___gte) {
        this.centro_icona___gte = centro_icona___gte;
    }

    public String getCentro_icona___contains() {
        return centro_icona___contains;
    }
    public void setCentro_icona___contains(String centro_icona___contains) {
        this.centro_icona___contains = centro_icona___contains;
    }

    public String getCentro_icona___not___contains() {
        return centro_icona___not___contains;
    }
    public void setCentro_icona___not___contains(String centro_icona___not___contains) {
        this.centro_icona___not___contains = centro_icona___not___contains;
    }

    public String getCentro_icona___starts_with() {
        return centro_icona___starts_with;
    }
    public void setCentro_icona___starts_with(String centro_icona___starts_with) {
        this.centro_icona___starts_with = centro_icona___starts_with;
    }

    public String getCentro_icona___not___starts_with() {
        return centro_icona___not___starts_with;
    }
    public void setCentro_icona___not___starts_with(String centro_icona___not___starts_with) {
        this.centro_icona___not___starts_with = centro_icona___not___starts_with;
    }

    public String getCentro_icona___ends_with() {
        return centro_icona___ends_with;
    }
    public void setCentro_icona___ends_with(String centro_icona___ends_with) {
        this.centro_icona___ends_with = centro_icona___ends_with;
    }

    public String getCentro_icona___not___ends_with() {
        return centro_icona___not___ends_with;
    }
    public void setCentro_icona___not___ends_with(String centro_icona___not___ends_with) {
        this.centro_icona___not___ends_with = centro_icona___not___ends_with;
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

    public String getEtichetta___eq() {
        return etichetta___eq;
    }
    public void setEtichetta___eq(String etichetta___eq) {
        this.etichetta___eq = etichetta___eq;
    }

    public String getEtichetta___ne() {
        return etichetta___ne;
    }
    public void setEtichetta___ne(String etichetta___ne) {
        this.etichetta___ne = etichetta___ne;
    }

    public Boolean getEtichetta___null() {
        return etichetta___null;
    }
    public void setEtichetta___null(Boolean etichetta___null) {
        this.etichetta___null = etichetta___null;
    }

    public Boolean getEtichetta___not___null() {
        return etichetta___not___null;
    }
    public void setEtichetta___not___null(Boolean etichetta___not___null) {
        this.etichetta___not___null = etichetta___not___null;
    }

    public java.util.List<String> getEtichetta___in() {
        return etichetta___in;
    }
    public void setEtichetta___in(java.util.List<String> etichetta___in) {
        this.etichetta___in = etichetta___in;
    }

    public java.util.List<String> getEtichetta___not___in() {
        return etichetta___not___in;
    }
    public void setEtichetta___not___in(java.util.List<String> etichetta___not___in) {
        this.etichetta___not___in = etichetta___not___in;
    }

    public String getEtichetta___lt() {
        return etichetta___lt;
    }
    public void setEtichetta___lt(String etichetta___lt) {
        this.etichetta___lt = etichetta___lt;
    }

    public String getEtichetta___lte() {
        return etichetta___lte;
    }
    public void setEtichetta___lte(String etichetta___lte) {
        this.etichetta___lte = etichetta___lte;
    }

    public String getEtichetta___gt() {
        return etichetta___gt;
    }
    public void setEtichetta___gt(String etichetta___gt) {
        this.etichetta___gt = etichetta___gt;
    }

    public String getEtichetta___gte() {
        return etichetta___gte;
    }
    public void setEtichetta___gte(String etichetta___gte) {
        this.etichetta___gte = etichetta___gte;
    }

    public String getEtichetta___contains() {
        return etichetta___contains;
    }
    public void setEtichetta___contains(String etichetta___contains) {
        this.etichetta___contains = etichetta___contains;
    }

    public String getEtichetta___not___contains() {
        return etichetta___not___contains;
    }
    public void setEtichetta___not___contains(String etichetta___not___contains) {
        this.etichetta___not___contains = etichetta___not___contains;
    }

    public String getEtichetta___starts_with() {
        return etichetta___starts_with;
    }
    public void setEtichetta___starts_with(String etichetta___starts_with) {
        this.etichetta___starts_with = etichetta___starts_with;
    }

    public String getEtichetta___not___starts_with() {
        return etichetta___not___starts_with;
    }
    public void setEtichetta___not___starts_with(String etichetta___not___starts_with) {
        this.etichetta___not___starts_with = etichetta___not___starts_with;
    }

    public String getEtichetta___ends_with() {
        return etichetta___ends_with;
    }
    public void setEtichetta___ends_with(String etichetta___ends_with) {
        this.etichetta___ends_with = etichetta___ends_with;
    }

    public String getEtichetta___not___ends_with() {
        return etichetta___not___ends_with;
    }
    public void setEtichetta___not___ends_with(String etichetta___not___ends_with) {
        this.etichetta___not___ends_with = etichetta___not___ends_with;
    }

    public Integer getId_campione___eq() {
        return id_campione___eq;
    }
    public void setId_campione___eq(Integer id_campione___eq) {
        this.id_campione___eq = id_campione___eq;
    }

    public Integer getId_campione___ne() {
        return id_campione___ne;
    }
    public void setId_campione___ne(Integer id_campione___ne) {
        this.id_campione___ne = id_campione___ne;
    }

    public Boolean getId_campione___null() {
        return id_campione___null;
    }
    public void setId_campione___null(Boolean id_campione___null) {
        this.id_campione___null = id_campione___null;
    }

    public Boolean getId_campione___not___null() {
        return id_campione___not___null;
    }
    public void setId_campione___not___null(Boolean id_campione___not___null) {
        this.id_campione___not___null = id_campione___not___null;
    }

    public java.util.List<Integer> getId_campione___in() {
        return id_campione___in;
    }
    public void setId_campione___in(java.util.List<Integer> id_campione___in) {
        this.id_campione___in = id_campione___in;
    }

    public java.util.List<Integer> getId_campione___not___in() {
        return id_campione___not___in;
    }
    public void setId_campione___not___in(java.util.List<Integer> id_campione___not___in) {
        this.id_campione___not___in = id_campione___not___in;
    }

    public Integer getId_campione___lt() {
        return id_campione___lt;
    }
    public void setId_campione___lt(Integer id_campione___lt) {
        this.id_campione___lt = id_campione___lt;
    }

    public Integer getId_campione___lte() {
        return id_campione___lte;
    }
    public void setId_campione___lte(Integer id_campione___lte) {
        this.id_campione___lte = id_campione___lte;
    }

    public Integer getId_campione___gt() {
        return id_campione___gt;
    }
    public void setId_campione___gt(Integer id_campione___gt) {
        this.id_campione___gt = id_campione___gt;
    }

    public Integer getId_campione___gte() {
        return id_campione___gte;
    }
    public void setId_campione___gte(Integer id_campione___gte) {
        this.id_campione___gte = id_campione___gte;
    }

    public String getNote_campione___eq() {
        return note_campione___eq;
    }
    public void setNote_campione___eq(String note_campione___eq) {
        this.note_campione___eq = note_campione___eq;
    }

    public String getNote_campione___ne() {
        return note_campione___ne;
    }
    public void setNote_campione___ne(String note_campione___ne) {
        this.note_campione___ne = note_campione___ne;
    }

    public Boolean getNote_campione___null() {
        return note_campione___null;
    }
    public void setNote_campione___null(Boolean note_campione___null) {
        this.note_campione___null = note_campione___null;
    }

    public Boolean getNote_campione___not___null() {
        return note_campione___not___null;
    }
    public void setNote_campione___not___null(Boolean note_campione___not___null) {
        this.note_campione___not___null = note_campione___not___null;
    }

    public java.util.List<String> getNote_campione___in() {
        return note_campione___in;
    }
    public void setNote_campione___in(java.util.List<String> note_campione___in) {
        this.note_campione___in = note_campione___in;
    }

    public java.util.List<String> getNote_campione___not___in() {
        return note_campione___not___in;
    }
    public void setNote_campione___not___in(java.util.List<String> note_campione___not___in) {
        this.note_campione___not___in = note_campione___not___in;
    }

    public String getNote_campione___lt() {
        return note_campione___lt;
    }
    public void setNote_campione___lt(String note_campione___lt) {
        this.note_campione___lt = note_campione___lt;
    }

    public String getNote_campione___lte() {
        return note_campione___lte;
    }
    public void setNote_campione___lte(String note_campione___lte) {
        this.note_campione___lte = note_campione___lte;
    }

    public String getNote_campione___gt() {
        return note_campione___gt;
    }
    public void setNote_campione___gt(String note_campione___gt) {
        this.note_campione___gt = note_campione___gt;
    }

    public String getNote_campione___gte() {
        return note_campione___gte;
    }
    public void setNote_campione___gte(String note_campione___gte) {
        this.note_campione___gte = note_campione___gte;
    }

    public String getNote_campione___contains() {
        return note_campione___contains;
    }
    public void setNote_campione___contains(String note_campione___contains) {
        this.note_campione___contains = note_campione___contains;
    }

    public String getNote_campione___not___contains() {
        return note_campione___not___contains;
    }
    public void setNote_campione___not___contains(String note_campione___not___contains) {
        this.note_campione___not___contains = note_campione___not___contains;
    }

    public String getNote_campione___starts_with() {
        return note_campione___starts_with;
    }
    public void setNote_campione___starts_with(String note_campione___starts_with) {
        this.note_campione___starts_with = note_campione___starts_with;
    }

    public String getNote_campione___not___starts_with() {
        return note_campione___not___starts_with;
    }
    public void setNote_campione___not___starts_with(String note_campione___not___starts_with) {
        this.note_campione___not___starts_with = note_campione___not___starts_with;
    }

    public String getNote_campione___ends_with() {
        return note_campione___ends_with;
    }
    public void setNote_campione___ends_with(String note_campione___ends_with) {
        this.note_campione___ends_with = note_campione___ends_with;
    }

    public String getNote_campione___not___ends_with() {
        return note_campione___not___ends_with;
    }
    public void setNote_campione___not___ends_with(String note_campione___not___ends_with) {
        this.note_campione___not___ends_with = note_campione___not___ends_with;
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

    public String getPaziente_hepaicona___eq() {
        return paziente_hepaicona___eq;
    }
    public void setPaziente_hepaicona___eq(String paziente_hepaicona___eq) {
        this.paziente_hepaicona___eq = paziente_hepaicona___eq;
    }

    public String getPaziente_hepaicona___ne() {
        return paziente_hepaicona___ne;
    }
    public void setPaziente_hepaicona___ne(String paziente_hepaicona___ne) {
        this.paziente_hepaicona___ne = paziente_hepaicona___ne;
    }

    public Boolean getPaziente_hepaicona___null() {
        return paziente_hepaicona___null;
    }
    public void setPaziente_hepaicona___null(Boolean paziente_hepaicona___null) {
        this.paziente_hepaicona___null = paziente_hepaicona___null;
    }

    public Boolean getPaziente_hepaicona___not___null() {
        return paziente_hepaicona___not___null;
    }
    public void setPaziente_hepaicona___not___null(Boolean paziente_hepaicona___not___null) {
        this.paziente_hepaicona___not___null = paziente_hepaicona___not___null;
    }

    public java.util.List<String> getPaziente_hepaicona___in() {
        return paziente_hepaicona___in;
    }
    public void setPaziente_hepaicona___in(java.util.List<String> paziente_hepaicona___in) {
        this.paziente_hepaicona___in = paziente_hepaicona___in;
    }

    public java.util.List<String> getPaziente_hepaicona___not___in() {
        return paziente_hepaicona___not___in;
    }
    public void setPaziente_hepaicona___not___in(java.util.List<String> paziente_hepaicona___not___in) {
        this.paziente_hepaicona___not___in = paziente_hepaicona___not___in;
    }

    public String getPaziente_hepaicona___lt() {
        return paziente_hepaicona___lt;
    }
    public void setPaziente_hepaicona___lt(String paziente_hepaicona___lt) {
        this.paziente_hepaicona___lt = paziente_hepaicona___lt;
    }

    public String getPaziente_hepaicona___lte() {
        return paziente_hepaicona___lte;
    }
    public void setPaziente_hepaicona___lte(String paziente_hepaicona___lte) {
        this.paziente_hepaicona___lte = paziente_hepaicona___lte;
    }

    public String getPaziente_hepaicona___gt() {
        return paziente_hepaicona___gt;
    }
    public void setPaziente_hepaicona___gt(String paziente_hepaicona___gt) {
        this.paziente_hepaicona___gt = paziente_hepaicona___gt;
    }

    public String getPaziente_hepaicona___gte() {
        return paziente_hepaicona___gte;
    }
    public void setPaziente_hepaicona___gte(String paziente_hepaicona___gte) {
        this.paziente_hepaicona___gte = paziente_hepaicona___gte;
    }

    public String getPaziente_hepaicona___contains() {
        return paziente_hepaicona___contains;
    }
    public void setPaziente_hepaicona___contains(String paziente_hepaicona___contains) {
        this.paziente_hepaicona___contains = paziente_hepaicona___contains;
    }

    public String getPaziente_hepaicona___not___contains() {
        return paziente_hepaicona___not___contains;
    }
    public void setPaziente_hepaicona___not___contains(String paziente_hepaicona___not___contains) {
        this.paziente_hepaicona___not___contains = paziente_hepaicona___not___contains;
    }

    public String getPaziente_hepaicona___starts_with() {
        return paziente_hepaicona___starts_with;
    }
    public void setPaziente_hepaicona___starts_with(String paziente_hepaicona___starts_with) {
        this.paziente_hepaicona___starts_with = paziente_hepaicona___starts_with;
    }

    public String getPaziente_hepaicona___not___starts_with() {
        return paziente_hepaicona___not___starts_with;
    }
    public void setPaziente_hepaicona___not___starts_with(String paziente_hepaicona___not___starts_with) {
        this.paziente_hepaicona___not___starts_with = paziente_hepaicona___not___starts_with;
    }

    public String getPaziente_hepaicona___ends_with() {
        return paziente_hepaicona___ends_with;
    }
    public void setPaziente_hepaicona___ends_with(String paziente_hepaicona___ends_with) {
        this.paziente_hepaicona___ends_with = paziente_hepaicona___ends_with;
    }

    public String getPaziente_hepaicona___not___ends_with() {
        return paziente_hepaicona___not___ends_with;
    }
    public void setPaziente_hepaicona___not___ends_with(String paziente_hepaicona___not___ends_with) {
        this.paziente_hepaicona___not___ends_with = paziente_hepaicona___not___ends_with;
    }

    public String getPaziente_icona___eq() {
        return paziente_icona___eq;
    }
    public void setPaziente_icona___eq(String paziente_icona___eq) {
        this.paziente_icona___eq = paziente_icona___eq;
    }

    public String getPaziente_icona___ne() {
        return paziente_icona___ne;
    }
    public void setPaziente_icona___ne(String paziente_icona___ne) {
        this.paziente_icona___ne = paziente_icona___ne;
    }

    public Boolean getPaziente_icona___null() {
        return paziente_icona___null;
    }
    public void setPaziente_icona___null(Boolean paziente_icona___null) {
        this.paziente_icona___null = paziente_icona___null;
    }

    public Boolean getPaziente_icona___not___null() {
        return paziente_icona___not___null;
    }
    public void setPaziente_icona___not___null(Boolean paziente_icona___not___null) {
        this.paziente_icona___not___null = paziente_icona___not___null;
    }

    public java.util.List<String> getPaziente_icona___in() {
        return paziente_icona___in;
    }
    public void setPaziente_icona___in(java.util.List<String> paziente_icona___in) {
        this.paziente_icona___in = paziente_icona___in;
    }

    public java.util.List<String> getPaziente_icona___not___in() {
        return paziente_icona___not___in;
    }
    public void setPaziente_icona___not___in(java.util.List<String> paziente_icona___not___in) {
        this.paziente_icona___not___in = paziente_icona___not___in;
    }

    public String getPaziente_icona___lt() {
        return paziente_icona___lt;
    }
    public void setPaziente_icona___lt(String paziente_icona___lt) {
        this.paziente_icona___lt = paziente_icona___lt;
    }

    public String getPaziente_icona___lte() {
        return paziente_icona___lte;
    }
    public void setPaziente_icona___lte(String paziente_icona___lte) {
        this.paziente_icona___lte = paziente_icona___lte;
    }

    public String getPaziente_icona___gt() {
        return paziente_icona___gt;
    }
    public void setPaziente_icona___gt(String paziente_icona___gt) {
        this.paziente_icona___gt = paziente_icona___gt;
    }

    public String getPaziente_icona___gte() {
        return paziente_icona___gte;
    }
    public void setPaziente_icona___gte(String paziente_icona___gte) {
        this.paziente_icona___gte = paziente_icona___gte;
    }

    public String getPaziente_icona___contains() {
        return paziente_icona___contains;
    }
    public void setPaziente_icona___contains(String paziente_icona___contains) {
        this.paziente_icona___contains = paziente_icona___contains;
    }

    public String getPaziente_icona___not___contains() {
        return paziente_icona___not___contains;
    }
    public void setPaziente_icona___not___contains(String paziente_icona___not___contains) {
        this.paziente_icona___not___contains = paziente_icona___not___contains;
    }

    public String getPaziente_icona___starts_with() {
        return paziente_icona___starts_with;
    }
    public void setPaziente_icona___starts_with(String paziente_icona___starts_with) {
        this.paziente_icona___starts_with = paziente_icona___starts_with;
    }

    public String getPaziente_icona___not___starts_with() {
        return paziente_icona___not___starts_with;
    }
    public void setPaziente_icona___not___starts_with(String paziente_icona___not___starts_with) {
        this.paziente_icona___not___starts_with = paziente_icona___not___starts_with;
    }

    public String getPaziente_icona___ends_with() {
        return paziente_icona___ends_with;
    }
    public void setPaziente_icona___ends_with(String paziente_icona___ends_with) {
        this.paziente_icona___ends_with = paziente_icona___ends_with;
    }

    public String getPaziente_icona___not___ends_with() {
        return paziente_icona___not___ends_with;
    }
    public void setPaziente_icona___not___ends_with(String paziente_icona___not___ends_with) {
        this.paziente_icona___not___ends_with = paziente_icona___not___ends_with;
    }

    public String getPaziente_nascita___eq() {
        return paziente_nascita___eq;
    }
    public void setPaziente_nascita___eq(String paziente_nascita___eq) {
        this.paziente_nascita___eq = paziente_nascita___eq;
    }

    public String getPaziente_nascita___ne() {
        return paziente_nascita___ne;
    }
    public void setPaziente_nascita___ne(String paziente_nascita___ne) {
        this.paziente_nascita___ne = paziente_nascita___ne;
    }

    public Boolean getPaziente_nascita___null() {
        return paziente_nascita___null;
    }
    public void setPaziente_nascita___null(Boolean paziente_nascita___null) {
        this.paziente_nascita___null = paziente_nascita___null;
    }

    public Boolean getPaziente_nascita___not___null() {
        return paziente_nascita___not___null;
    }
    public void setPaziente_nascita___not___null(Boolean paziente_nascita___not___null) {
        this.paziente_nascita___not___null = paziente_nascita___not___null;
    }

    public java.util.List<String> getPaziente_nascita___in() {
        return paziente_nascita___in;
    }
    public void setPaziente_nascita___in(java.util.List<String> paziente_nascita___in) {
        this.paziente_nascita___in = paziente_nascita___in;
    }

    public java.util.List<String> getPaziente_nascita___not___in() {
        return paziente_nascita___not___in;
    }
    public void setPaziente_nascita___not___in(java.util.List<String> paziente_nascita___not___in) {
        this.paziente_nascita___not___in = paziente_nascita___not___in;
    }

    public String getPaziente_nascita___lt() {
        return paziente_nascita___lt;
    }
    public void setPaziente_nascita___lt(String paziente_nascita___lt) {
        this.paziente_nascita___lt = paziente_nascita___lt;
    }

    public String getPaziente_nascita___lte() {
        return paziente_nascita___lte;
    }
    public void setPaziente_nascita___lte(String paziente_nascita___lte) {
        this.paziente_nascita___lte = paziente_nascita___lte;
    }

    public String getPaziente_nascita___gt() {
        return paziente_nascita___gt;
    }
    public void setPaziente_nascita___gt(String paziente_nascita___gt) {
        this.paziente_nascita___gt = paziente_nascita___gt;
    }

    public String getPaziente_nascita___gte() {
        return paziente_nascita___gte;
    }
    public void setPaziente_nascita___gte(String paziente_nascita___gte) {
        this.paziente_nascita___gte = paziente_nascita___gte;
    }

    public String getPosizioni___eq() {
        return posizioni___eq;
    }
    public void setPosizioni___eq(String posizioni___eq) {
        this.posizioni___eq = posizioni___eq;
    }

    public String getPosizioni___ne() {
        return posizioni___ne;
    }
    public void setPosizioni___ne(String posizioni___ne) {
        this.posizioni___ne = posizioni___ne;
    }

    public Boolean getPosizioni___null() {
        return posizioni___null;
    }
    public void setPosizioni___null(Boolean posizioni___null) {
        this.posizioni___null = posizioni___null;
    }

    public Boolean getPosizioni___not___null() {
        return posizioni___not___null;
    }
    public void setPosizioni___not___null(Boolean posizioni___not___null) {
        this.posizioni___not___null = posizioni___not___null;
    }

    public java.util.List<String> getPosizioni___in() {
        return posizioni___in;
    }
    public void setPosizioni___in(java.util.List<String> posizioni___in) {
        this.posizioni___in = posizioni___in;
    }

    public java.util.List<String> getPosizioni___not___in() {
        return posizioni___not___in;
    }
    public void setPosizioni___not___in(java.util.List<String> posizioni___not___in) {
        this.posizioni___not___in = posizioni___not___in;
    }

    public String getPosizioni___lt() {
        return posizioni___lt;
    }
    public void setPosizioni___lt(String posizioni___lt) {
        this.posizioni___lt = posizioni___lt;
    }

    public String getPosizioni___lte() {
        return posizioni___lte;
    }
    public void setPosizioni___lte(String posizioni___lte) {
        this.posizioni___lte = posizioni___lte;
    }

    public String getPosizioni___gt() {
        return posizioni___gt;
    }
    public void setPosizioni___gt(String posizioni___gt) {
        this.posizioni___gt = posizioni___gt;
    }

    public String getPosizioni___gte() {
        return posizioni___gte;
    }
    public void setPosizioni___gte(String posizioni___gte) {
        this.posizioni___gte = posizioni___gte;
    }

    public String getPosizioni___contains() {
        return posizioni___contains;
    }
    public void setPosizioni___contains(String posizioni___contains) {
        this.posizioni___contains = posizioni___contains;
    }

    public String getPosizioni___not___contains() {
        return posizioni___not___contains;
    }
    public void setPosizioni___not___contains(String posizioni___not___contains) {
        this.posizioni___not___contains = posizioni___not___contains;
    }

    public String getPosizioni___starts_with() {
        return posizioni___starts_with;
    }
    public void setPosizioni___starts_with(String posizioni___starts_with) {
        this.posizioni___starts_with = posizioni___starts_with;
    }

    public String getPosizioni___not___starts_with() {
        return posizioni___not___starts_with;
    }
    public void setPosizioni___not___starts_with(String posizioni___not___starts_with) {
        this.posizioni___not___starts_with = posizioni___not___starts_with;
    }

    public String getPosizioni___ends_with() {
        return posizioni___ends_with;
    }
    public void setPosizioni___ends_with(String posizioni___ends_with) {
        this.posizioni___ends_with = posizioni___ends_with;
    }

    public String getPosizioni___not___ends_with() {
        return posizioni___not___ends_with;
    }
    public void setPosizioni___not___ends_with(String posizioni___not___ends_with) {
        this.posizioni___not___ends_with = posizioni___not___ends_with;
    }

    public Integer getProvette_iniziali___eq() {
        return provette_iniziali___eq;
    }
    public void setProvette_iniziali___eq(Integer provette_iniziali___eq) {
        this.provette_iniziali___eq = provette_iniziali___eq;
    }

    public Integer getProvette_iniziali___ne() {
        return provette_iniziali___ne;
    }
    public void setProvette_iniziali___ne(Integer provette_iniziali___ne) {
        this.provette_iniziali___ne = provette_iniziali___ne;
    }

    public Boolean getProvette_iniziali___null() {
        return provette_iniziali___null;
    }
    public void setProvette_iniziali___null(Boolean provette_iniziali___null) {
        this.provette_iniziali___null = provette_iniziali___null;
    }

    public Boolean getProvette_iniziali___not___null() {
        return provette_iniziali___not___null;
    }
    public void setProvette_iniziali___not___null(Boolean provette_iniziali___not___null) {
        this.provette_iniziali___not___null = provette_iniziali___not___null;
    }

    public java.util.List<Integer> getProvette_iniziali___in() {
        return provette_iniziali___in;
    }
    public void setProvette_iniziali___in(java.util.List<Integer> provette_iniziali___in) {
        this.provette_iniziali___in = provette_iniziali___in;
    }

    public java.util.List<Integer> getProvette_iniziali___not___in() {
        return provette_iniziali___not___in;
    }
    public void setProvette_iniziali___not___in(java.util.List<Integer> provette_iniziali___not___in) {
        this.provette_iniziali___not___in = provette_iniziali___not___in;
    }

    public Integer getProvette_iniziali___lt() {
        return provette_iniziali___lt;
    }
    public void setProvette_iniziali___lt(Integer provette_iniziali___lt) {
        this.provette_iniziali___lt = provette_iniziali___lt;
    }

    public Integer getProvette_iniziali___lte() {
        return provette_iniziali___lte;
    }
    public void setProvette_iniziali___lte(Integer provette_iniziali___lte) {
        this.provette_iniziali___lte = provette_iniziali___lte;
    }

    public Integer getProvette_iniziali___gt() {
        return provette_iniziali___gt;
    }
    public void setProvette_iniziali___gt(Integer provette_iniziali___gt) {
        this.provette_iniziali___gt = provette_iniziali___gt;
    }

    public Integer getProvette_iniziali___gte() {
        return provette_iniziali___gte;
    }
    public void setProvette_iniziali___gte(Integer provette_iniziali___gte) {
        this.provette_iniziali___gte = provette_iniziali___gte;
    }

    public Integer getProvette_rimanenti___eq() {
        return provette_rimanenti___eq;
    }
    public void setProvette_rimanenti___eq(Integer provette_rimanenti___eq) {
        this.provette_rimanenti___eq = provette_rimanenti___eq;
    }

    public Integer getProvette_rimanenti___ne() {
        return provette_rimanenti___ne;
    }
    public void setProvette_rimanenti___ne(Integer provette_rimanenti___ne) {
        this.provette_rimanenti___ne = provette_rimanenti___ne;
    }

    public Boolean getProvette_rimanenti___null() {
        return provette_rimanenti___null;
    }
    public void setProvette_rimanenti___null(Boolean provette_rimanenti___null) {
        this.provette_rimanenti___null = provette_rimanenti___null;
    }

    public Boolean getProvette_rimanenti___not___null() {
        return provette_rimanenti___not___null;
    }
    public void setProvette_rimanenti___not___null(Boolean provette_rimanenti___not___null) {
        this.provette_rimanenti___not___null = provette_rimanenti___not___null;
    }

    public java.util.List<Integer> getProvette_rimanenti___in() {
        return provette_rimanenti___in;
    }
    public void setProvette_rimanenti___in(java.util.List<Integer> provette_rimanenti___in) {
        this.provette_rimanenti___in = provette_rimanenti___in;
    }

    public java.util.List<Integer> getProvette_rimanenti___not___in() {
        return provette_rimanenti___not___in;
    }
    public void setProvette_rimanenti___not___in(java.util.List<Integer> provette_rimanenti___not___in) {
        this.provette_rimanenti___not___in = provette_rimanenti___not___in;
    }

    public Integer getProvette_rimanenti___lt() {
        return provette_rimanenti___lt;
    }
    public void setProvette_rimanenti___lt(Integer provette_rimanenti___lt) {
        this.provette_rimanenti___lt = provette_rimanenti___lt;
    }

    public Integer getProvette_rimanenti___lte() {
        return provette_rimanenti___lte;
    }
    public void setProvette_rimanenti___lte(Integer provette_rimanenti___lte) {
        this.provette_rimanenti___lte = provette_rimanenti___lte;
    }

    public Integer getProvette_rimanenti___gt() {
        return provette_rimanenti___gt;
    }
    public void setProvette_rimanenti___gt(Integer provette_rimanenti___gt) {
        this.provette_rimanenti___gt = provette_rimanenti___gt;
    }

    public Integer getProvette_rimanenti___gte() {
        return provette_rimanenti___gte;
    }
    public void setProvette_rimanenti___gte(Integer provette_rimanenti___gte) {
        this.provette_rimanenti___gte = provette_rimanenti___gte;
    }

    public String getQt___eq() {
        return qt___eq;
    }
    public void setQt___eq(String qt___eq) {
        this.qt___eq = qt___eq;
    }

    public String getQt___ne() {
        return qt___ne;
    }
    public void setQt___ne(String qt___ne) {
        this.qt___ne = qt___ne;
    }

    public Boolean getQt___null() {
        return qt___null;
    }
    public void setQt___null(Boolean qt___null) {
        this.qt___null = qt___null;
    }

    public Boolean getQt___not___null() {
        return qt___not___null;
    }
    public void setQt___not___null(Boolean qt___not___null) {
        this.qt___not___null = qt___not___null;
    }

    public java.util.List<String> getQt___in() {
        return qt___in;
    }
    public void setQt___in(java.util.List<String> qt___in) {
        this.qt___in = qt___in;
    }

    public java.util.List<String> getQt___not___in() {
        return qt___not___in;
    }
    public void setQt___not___in(java.util.List<String> qt___not___in) {
        this.qt___not___in = qt___not___in;
    }

    public String getQt___lt() {
        return qt___lt;
    }
    public void setQt___lt(String qt___lt) {
        this.qt___lt = qt___lt;
    }

    public String getQt___lte() {
        return qt___lte;
    }
    public void setQt___lte(String qt___lte) {
        this.qt___lte = qt___lte;
    }

    public String getQt___gt() {
        return qt___gt;
    }
    public void setQt___gt(String qt___gt) {
        this.qt___gt = qt___gt;
    }

    public String getQt___gte() {
        return qt___gte;
    }
    public void setQt___gte(String qt___gte) {
        this.qt___gte = qt___gte;
    }

    public String getQuantita___eq() {
        return quantita___eq;
    }
    public void setQuantita___eq(String quantita___eq) {
        this.quantita___eq = quantita___eq;
    }

    public String getQuantita___ne() {
        return quantita___ne;
    }
    public void setQuantita___ne(String quantita___ne) {
        this.quantita___ne = quantita___ne;
    }

    public Boolean getQuantita___null() {
        return quantita___null;
    }
    public void setQuantita___null(Boolean quantita___null) {
        this.quantita___null = quantita___null;
    }

    public Boolean getQuantita___not___null() {
        return quantita___not___null;
    }
    public void setQuantita___not___null(Boolean quantita___not___null) {
        this.quantita___not___null = quantita___not___null;
    }

    public java.util.List<String> getQuantita___in() {
        return quantita___in;
    }
    public void setQuantita___in(java.util.List<String> quantita___in) {
        this.quantita___in = quantita___in;
    }

    public java.util.List<String> getQuantita___not___in() {
        return quantita___not___in;
    }
    public void setQuantita___not___in(java.util.List<String> quantita___not___in) {
        this.quantita___not___in = quantita___not___in;
    }

    public String getQuantita___lt() {
        return quantita___lt;
    }
    public void setQuantita___lt(String quantita___lt) {
        this.quantita___lt = quantita___lt;
    }

    public String getQuantita___lte() {
        return quantita___lte;
    }
    public void setQuantita___lte(String quantita___lte) {
        this.quantita___lte = quantita___lte;
    }

    public String getQuantita___gt() {
        return quantita___gt;
    }
    public void setQuantita___gt(String quantita___gt) {
        this.quantita___gt = quantita___gt;
    }

    public String getQuantita___gte() {
        return quantita___gte;
    }
    public void setQuantita___gte(String quantita___gte) {
        this.quantita___gte = quantita___gte;
    }

    public String getQuantita___contains() {
        return quantita___contains;
    }
    public void setQuantita___contains(String quantita___contains) {
        this.quantita___contains = quantita___contains;
    }

    public String getQuantita___not___contains() {
        return quantita___not___contains;
    }
    public void setQuantita___not___contains(String quantita___not___contains) {
        this.quantita___not___contains = quantita___not___contains;
    }

    public String getQuantita___starts_with() {
        return quantita___starts_with;
    }
    public void setQuantita___starts_with(String quantita___starts_with) {
        this.quantita___starts_with = quantita___starts_with;
    }

    public String getQuantita___not___starts_with() {
        return quantita___not___starts_with;
    }
    public void setQuantita___not___starts_with(String quantita___not___starts_with) {
        this.quantita___not___starts_with = quantita___not___starts_with;
    }

    public String getQuantita___ends_with() {
        return quantita___ends_with;
    }
    public void setQuantita___ends_with(String quantita___ends_with) {
        this.quantita___ends_with = quantita___ends_with;
    }

    public String getQuantita___not___ends_with() {
        return quantita___not___ends_with;
    }
    public void setQuantita___not___ends_with(String quantita___not___ends_with) {
        this.quantita___not___ends_with = quantita___not___ends_with;
    }

    public String getRack___eq() {
        return rack___eq;
    }
    public void setRack___eq(String rack___eq) {
        this.rack___eq = rack___eq;
    }

    public String getRack___ne() {
        return rack___ne;
    }
    public void setRack___ne(String rack___ne) {
        this.rack___ne = rack___ne;
    }

    public Boolean getRack___null() {
        return rack___null;
    }
    public void setRack___null(Boolean rack___null) {
        this.rack___null = rack___null;
    }

    public Boolean getRack___not___null() {
        return rack___not___null;
    }
    public void setRack___not___null(Boolean rack___not___null) {
        this.rack___not___null = rack___not___null;
    }

    public java.util.List<String> getRack___in() {
        return rack___in;
    }
    public void setRack___in(java.util.List<String> rack___in) {
        this.rack___in = rack___in;
    }

    public java.util.List<String> getRack___not___in() {
        return rack___not___in;
    }
    public void setRack___not___in(java.util.List<String> rack___not___in) {
        this.rack___not___in = rack___not___in;
    }

    public String getRack___lt() {
        return rack___lt;
    }
    public void setRack___lt(String rack___lt) {
        this.rack___lt = rack___lt;
    }

    public String getRack___lte() {
        return rack___lte;
    }
    public void setRack___lte(String rack___lte) {
        this.rack___lte = rack___lte;
    }

    public String getRack___gt() {
        return rack___gt;
    }
    public void setRack___gt(String rack___gt) {
        this.rack___gt = rack___gt;
    }

    public String getRack___gte() {
        return rack___gte;
    }
    public void setRack___gte(String rack___gte) {
        this.rack___gte = rack___gte;
    }

    public String getRack___contains() {
        return rack___contains;
    }
    public void setRack___contains(String rack___contains) {
        this.rack___contains = rack___contains;
    }

    public String getRack___not___contains() {
        return rack___not___contains;
    }
    public void setRack___not___contains(String rack___not___contains) {
        this.rack___not___contains = rack___not___contains;
    }

    public String getRack___starts_with() {
        return rack___starts_with;
    }
    public void setRack___starts_with(String rack___starts_with) {
        this.rack___starts_with = rack___starts_with;
    }

    public String getRack___not___starts_with() {
        return rack___not___starts_with;
    }
    public void setRack___not___starts_with(String rack___not___starts_with) {
        this.rack___not___starts_with = rack___not___starts_with;
    }

    public String getRack___ends_with() {
        return rack___ends_with;
    }
    public void setRack___ends_with(String rack___ends_with) {
        this.rack___ends_with = rack___ends_with;
    }

    public String getRack___not___ends_with() {
        return rack___not___ends_with;
    }
    public void setRack___not___ends_with(String rack___not___ends_with) {
        this.rack___not___ends_with = rack___not___ends_with;
    }

    public String getSede_biobanca___eq() {
        return sede_biobanca___eq;
    }
    public void setSede_biobanca___eq(String sede_biobanca___eq) {
        this.sede_biobanca___eq = sede_biobanca___eq;
    }

    public String getSede_biobanca___ne() {
        return sede_biobanca___ne;
    }
    public void setSede_biobanca___ne(String sede_biobanca___ne) {
        this.sede_biobanca___ne = sede_biobanca___ne;
    }

    public Boolean getSede_biobanca___null() {
        return sede_biobanca___null;
    }
    public void setSede_biobanca___null(Boolean sede_biobanca___null) {
        this.sede_biobanca___null = sede_biobanca___null;
    }

    public Boolean getSede_biobanca___not___null() {
        return sede_biobanca___not___null;
    }
    public void setSede_biobanca___not___null(Boolean sede_biobanca___not___null) {
        this.sede_biobanca___not___null = sede_biobanca___not___null;
    }

    public java.util.List<String> getSede_biobanca___in() {
        return sede_biobanca___in;
    }
    public void setSede_biobanca___in(java.util.List<String> sede_biobanca___in) {
        this.sede_biobanca___in = sede_biobanca___in;
    }

    public java.util.List<String> getSede_biobanca___not___in() {
        return sede_biobanca___not___in;
    }
    public void setSede_biobanca___not___in(java.util.List<String> sede_biobanca___not___in) {
        this.sede_biobanca___not___in = sede_biobanca___not___in;
    }

    public String getSede_biobanca___lt() {
        return sede_biobanca___lt;
    }
    public void setSede_biobanca___lt(String sede_biobanca___lt) {
        this.sede_biobanca___lt = sede_biobanca___lt;
    }

    public String getSede_biobanca___lte() {
        return sede_biobanca___lte;
    }
    public void setSede_biobanca___lte(String sede_biobanca___lte) {
        this.sede_biobanca___lte = sede_biobanca___lte;
    }

    public String getSede_biobanca___gt() {
        return sede_biobanca___gt;
    }
    public void setSede_biobanca___gt(String sede_biobanca___gt) {
        this.sede_biobanca___gt = sede_biobanca___gt;
    }

    public String getSede_biobanca___gte() {
        return sede_biobanca___gte;
    }
    public void setSede_biobanca___gte(String sede_biobanca___gte) {
        this.sede_biobanca___gte = sede_biobanca___gte;
    }

    public String getSede_biobanca___contains() {
        return sede_biobanca___contains;
    }
    public void setSede_biobanca___contains(String sede_biobanca___contains) {
        this.sede_biobanca___contains = sede_biobanca___contains;
    }

    public String getSede_biobanca___not___contains() {
        return sede_biobanca___not___contains;
    }
    public void setSede_biobanca___not___contains(String sede_biobanca___not___contains) {
        this.sede_biobanca___not___contains = sede_biobanca___not___contains;
    }

    public String getSede_biobanca___starts_with() {
        return sede_biobanca___starts_with;
    }
    public void setSede_biobanca___starts_with(String sede_biobanca___starts_with) {
        this.sede_biobanca___starts_with = sede_biobanca___starts_with;
    }

    public String getSede_biobanca___not___starts_with() {
        return sede_biobanca___not___starts_with;
    }
    public void setSede_biobanca___not___starts_with(String sede_biobanca___not___starts_with) {
        this.sede_biobanca___not___starts_with = sede_biobanca___not___starts_with;
    }

    public String getSede_biobanca___ends_with() {
        return sede_biobanca___ends_with;
    }
    public void setSede_biobanca___ends_with(String sede_biobanca___ends_with) {
        this.sede_biobanca___ends_with = sede_biobanca___ends_with;
    }

    public String getSede_biobanca___not___ends_with() {
        return sede_biobanca___not___ends_with;
    }
    public void setSede_biobanca___not___ends_with(String sede_biobanca___not___ends_with) {
        this.sede_biobanca___not___ends_with = sede_biobanca___not___ends_with;
    }

    public String getUm___eq() {
        return um___eq;
    }
    public void setUm___eq(String um___eq) {
        this.um___eq = um___eq;
    }

    public String getUm___ne() {
        return um___ne;
    }
    public void setUm___ne(String um___ne) {
        this.um___ne = um___ne;
    }

    public Boolean getUm___null() {
        return um___null;
    }
    public void setUm___null(Boolean um___null) {
        this.um___null = um___null;
    }

    public Boolean getUm___not___null() {
        return um___not___null;
    }
    public void setUm___not___null(Boolean um___not___null) {
        this.um___not___null = um___not___null;
    }

    public java.util.List<String> getUm___in() {
        return um___in;
    }
    public void setUm___in(java.util.List<String> um___in) {
        this.um___in = um___in;
    }

    public java.util.List<String> getUm___not___in() {
        return um___not___in;
    }
    public void setUm___not___in(java.util.List<String> um___not___in) {
        this.um___not___in = um___not___in;
    }

    public String getUm___lt() {
        return um___lt;
    }
    public void setUm___lt(String um___lt) {
        this.um___lt = um___lt;
    }

    public String getUm___lte() {
        return um___lte;
    }
    public void setUm___lte(String um___lte) {
        this.um___lte = um___lte;
    }

    public String getUm___gt() {
        return um___gt;
    }
    public void setUm___gt(String um___gt) {
        this.um___gt = um___gt;
    }

    public String getUm___gte() {
        return um___gte;
    }
    public void setUm___gte(String um___gte) {
        this.um___gte = um___gte;
    }

    public String getUm___contains() {
        return um___contains;
    }
    public void setUm___contains(String um___contains) {
        this.um___contains = um___contains;
    }

    public String getUm___not___contains() {
        return um___not___contains;
    }
    public void setUm___not___contains(String um___not___contains) {
        this.um___not___contains = um___not___contains;
    }

    public String getUm___starts_with() {
        return um___starts_with;
    }
    public void setUm___starts_with(String um___starts_with) {
        this.um___starts_with = um___starts_with;
    }

    public String getUm___not___starts_with() {
        return um___not___starts_with;
    }
    public void setUm___not___starts_with(String um___not___starts_with) {
        this.um___not___starts_with = um___not___starts_with;
    }

    public String getUm___ends_with() {
        return um___ends_with;
    }
    public void setUm___ends_with(String um___ends_with) {
        this.um___ends_with = um___ends_with;
    }

    public String getUm___not___ends_with() {
        return um___not___ends_with;
    }
    public void setUm___not___ends_with(String um___not___ends_with) {
        this.um___not___ends_with = um___not___ends_with;
    }

    public java.util.List<CliCampione_oldFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliCampione_oldFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliCampione_oldFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliCampione_oldFilterDTO> OR) {
        this.OR = OR;
    }

    public CliCampione_oldFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliCampione_oldFilterDTO NOT) {
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
        if (campione___eq != null) {
            joiner.add("campione___eq: " + GraphQLRequestSerializer.getEntry(campione___eq));
        }
        if (campione___ne != null) {
            joiner.add("campione___ne: " + GraphQLRequestSerializer.getEntry(campione___ne));
        }
        if (campione___null != null) {
            joiner.add("campione___null: " + GraphQLRequestSerializer.getEntry(campione___null));
        }
        if (campione___not___null != null) {
            joiner.add("campione___not___null: " + GraphQLRequestSerializer.getEntry(campione___not___null));
        }
        if (campione___in != null) {
            joiner.add("campione___in: " + GraphQLRequestSerializer.getEntry(campione___in));
        }
        if (campione___not___in != null) {
            joiner.add("campione___not___in: " + GraphQLRequestSerializer.getEntry(campione___not___in));
        }
        if (campione___lt != null) {
            joiner.add("campione___lt: " + GraphQLRequestSerializer.getEntry(campione___lt));
        }
        if (campione___lte != null) {
            joiner.add("campione___lte: " + GraphQLRequestSerializer.getEntry(campione___lte));
        }
        if (campione___gt != null) {
            joiner.add("campione___gt: " + GraphQLRequestSerializer.getEntry(campione___gt));
        }
        if (campione___gte != null) {
            joiner.add("campione___gte: " + GraphQLRequestSerializer.getEntry(campione___gte));
        }
        if (campione___contains != null) {
            joiner.add("campione___contains: " + GraphQLRequestSerializer.getEntry(campione___contains));
        }
        if (campione___not___contains != null) {
            joiner.add("campione___not___contains: " + GraphQLRequestSerializer.getEntry(campione___not___contains));
        }
        if (campione___starts_with != null) {
            joiner.add("campione___starts_with: " + GraphQLRequestSerializer.getEntry(campione___starts_with));
        }
        if (campione___not___starts_with != null) {
            joiner.add("campione___not___starts_with: " + GraphQLRequestSerializer.getEntry(campione___not___starts_with));
        }
        if (campione___ends_with != null) {
            joiner.add("campione___ends_with: " + GraphQLRequestSerializer.getEntry(campione___ends_with));
        }
        if (campione___not___ends_with != null) {
            joiner.add("campione___not___ends_with: " + GraphQLRequestSerializer.getEntry(campione___not___ends_with));
        }
        if (centro_icona___eq != null) {
            joiner.add("centro_icona___eq: " + GraphQLRequestSerializer.getEntry(centro_icona___eq));
        }
        if (centro_icona___ne != null) {
            joiner.add("centro_icona___ne: " + GraphQLRequestSerializer.getEntry(centro_icona___ne));
        }
        if (centro_icona___null != null) {
            joiner.add("centro_icona___null: " + GraphQLRequestSerializer.getEntry(centro_icona___null));
        }
        if (centro_icona___not___null != null) {
            joiner.add("centro_icona___not___null: " + GraphQLRequestSerializer.getEntry(centro_icona___not___null));
        }
        if (centro_icona___in != null) {
            joiner.add("centro_icona___in: " + GraphQLRequestSerializer.getEntry(centro_icona___in));
        }
        if (centro_icona___not___in != null) {
            joiner.add("centro_icona___not___in: " + GraphQLRequestSerializer.getEntry(centro_icona___not___in));
        }
        if (centro_icona___lt != null) {
            joiner.add("centro_icona___lt: " + GraphQLRequestSerializer.getEntry(centro_icona___lt));
        }
        if (centro_icona___lte != null) {
            joiner.add("centro_icona___lte: " + GraphQLRequestSerializer.getEntry(centro_icona___lte));
        }
        if (centro_icona___gt != null) {
            joiner.add("centro_icona___gt: " + GraphQLRequestSerializer.getEntry(centro_icona___gt));
        }
        if (centro_icona___gte != null) {
            joiner.add("centro_icona___gte: " + GraphQLRequestSerializer.getEntry(centro_icona___gte));
        }
        if (centro_icona___contains != null) {
            joiner.add("centro_icona___contains: " + GraphQLRequestSerializer.getEntry(centro_icona___contains));
        }
        if (centro_icona___not___contains != null) {
            joiner.add("centro_icona___not___contains: " + GraphQLRequestSerializer.getEntry(centro_icona___not___contains));
        }
        if (centro_icona___starts_with != null) {
            joiner.add("centro_icona___starts_with: " + GraphQLRequestSerializer.getEntry(centro_icona___starts_with));
        }
        if (centro_icona___not___starts_with != null) {
            joiner.add("centro_icona___not___starts_with: " + GraphQLRequestSerializer.getEntry(centro_icona___not___starts_with));
        }
        if (centro_icona___ends_with != null) {
            joiner.add("centro_icona___ends_with: " + GraphQLRequestSerializer.getEntry(centro_icona___ends_with));
        }
        if (centro_icona___not___ends_with != null) {
            joiner.add("centro_icona___not___ends_with: " + GraphQLRequestSerializer.getEntry(centro_icona___not___ends_with));
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
        if (etichetta___eq != null) {
            joiner.add("etichetta___eq: " + GraphQLRequestSerializer.getEntry(etichetta___eq));
        }
        if (etichetta___ne != null) {
            joiner.add("etichetta___ne: " + GraphQLRequestSerializer.getEntry(etichetta___ne));
        }
        if (etichetta___null != null) {
            joiner.add("etichetta___null: " + GraphQLRequestSerializer.getEntry(etichetta___null));
        }
        if (etichetta___not___null != null) {
            joiner.add("etichetta___not___null: " + GraphQLRequestSerializer.getEntry(etichetta___not___null));
        }
        if (etichetta___in != null) {
            joiner.add("etichetta___in: " + GraphQLRequestSerializer.getEntry(etichetta___in));
        }
        if (etichetta___not___in != null) {
            joiner.add("etichetta___not___in: " + GraphQLRequestSerializer.getEntry(etichetta___not___in));
        }
        if (etichetta___lt != null) {
            joiner.add("etichetta___lt: " + GraphQLRequestSerializer.getEntry(etichetta___lt));
        }
        if (etichetta___lte != null) {
            joiner.add("etichetta___lte: " + GraphQLRequestSerializer.getEntry(etichetta___lte));
        }
        if (etichetta___gt != null) {
            joiner.add("etichetta___gt: " + GraphQLRequestSerializer.getEntry(etichetta___gt));
        }
        if (etichetta___gte != null) {
            joiner.add("etichetta___gte: " + GraphQLRequestSerializer.getEntry(etichetta___gte));
        }
        if (etichetta___contains != null) {
            joiner.add("etichetta___contains: " + GraphQLRequestSerializer.getEntry(etichetta___contains));
        }
        if (etichetta___not___contains != null) {
            joiner.add("etichetta___not___contains: " + GraphQLRequestSerializer.getEntry(etichetta___not___contains));
        }
        if (etichetta___starts_with != null) {
            joiner.add("etichetta___starts_with: " + GraphQLRequestSerializer.getEntry(etichetta___starts_with));
        }
        if (etichetta___not___starts_with != null) {
            joiner.add("etichetta___not___starts_with: " + GraphQLRequestSerializer.getEntry(etichetta___not___starts_with));
        }
        if (etichetta___ends_with != null) {
            joiner.add("etichetta___ends_with: " + GraphQLRequestSerializer.getEntry(etichetta___ends_with));
        }
        if (etichetta___not___ends_with != null) {
            joiner.add("etichetta___not___ends_with: " + GraphQLRequestSerializer.getEntry(etichetta___not___ends_with));
        }
        if (id_campione___eq != null) {
            joiner.add("id_campione___eq: " + GraphQLRequestSerializer.getEntry(id_campione___eq));
        }
        if (id_campione___ne != null) {
            joiner.add("id_campione___ne: " + GraphQLRequestSerializer.getEntry(id_campione___ne));
        }
        if (id_campione___null != null) {
            joiner.add("id_campione___null: " + GraphQLRequestSerializer.getEntry(id_campione___null));
        }
        if (id_campione___not___null != null) {
            joiner.add("id_campione___not___null: " + GraphQLRequestSerializer.getEntry(id_campione___not___null));
        }
        if (id_campione___in != null) {
            joiner.add("id_campione___in: " + GraphQLRequestSerializer.getEntry(id_campione___in));
        }
        if (id_campione___not___in != null) {
            joiner.add("id_campione___not___in: " + GraphQLRequestSerializer.getEntry(id_campione___not___in));
        }
        if (id_campione___lt != null) {
            joiner.add("id_campione___lt: " + GraphQLRequestSerializer.getEntry(id_campione___lt));
        }
        if (id_campione___lte != null) {
            joiner.add("id_campione___lte: " + GraphQLRequestSerializer.getEntry(id_campione___lte));
        }
        if (id_campione___gt != null) {
            joiner.add("id_campione___gt: " + GraphQLRequestSerializer.getEntry(id_campione___gt));
        }
        if (id_campione___gte != null) {
            joiner.add("id_campione___gte: " + GraphQLRequestSerializer.getEntry(id_campione___gte));
        }
        if (note_campione___eq != null) {
            joiner.add("note_campione___eq: " + GraphQLRequestSerializer.getEntry(note_campione___eq));
        }
        if (note_campione___ne != null) {
            joiner.add("note_campione___ne: " + GraphQLRequestSerializer.getEntry(note_campione___ne));
        }
        if (note_campione___null != null) {
            joiner.add("note_campione___null: " + GraphQLRequestSerializer.getEntry(note_campione___null));
        }
        if (note_campione___not___null != null) {
            joiner.add("note_campione___not___null: " + GraphQLRequestSerializer.getEntry(note_campione___not___null));
        }
        if (note_campione___in != null) {
            joiner.add("note_campione___in: " + GraphQLRequestSerializer.getEntry(note_campione___in));
        }
        if (note_campione___not___in != null) {
            joiner.add("note_campione___not___in: " + GraphQLRequestSerializer.getEntry(note_campione___not___in));
        }
        if (note_campione___lt != null) {
            joiner.add("note_campione___lt: " + GraphQLRequestSerializer.getEntry(note_campione___lt));
        }
        if (note_campione___lte != null) {
            joiner.add("note_campione___lte: " + GraphQLRequestSerializer.getEntry(note_campione___lte));
        }
        if (note_campione___gt != null) {
            joiner.add("note_campione___gt: " + GraphQLRequestSerializer.getEntry(note_campione___gt));
        }
        if (note_campione___gte != null) {
            joiner.add("note_campione___gte: " + GraphQLRequestSerializer.getEntry(note_campione___gte));
        }
        if (note_campione___contains != null) {
            joiner.add("note_campione___contains: " + GraphQLRequestSerializer.getEntry(note_campione___contains));
        }
        if (note_campione___not___contains != null) {
            joiner.add("note_campione___not___contains: " + GraphQLRequestSerializer.getEntry(note_campione___not___contains));
        }
        if (note_campione___starts_with != null) {
            joiner.add("note_campione___starts_with: " + GraphQLRequestSerializer.getEntry(note_campione___starts_with));
        }
        if (note_campione___not___starts_with != null) {
            joiner.add("note_campione___not___starts_with: " + GraphQLRequestSerializer.getEntry(note_campione___not___starts_with));
        }
        if (note_campione___ends_with != null) {
            joiner.add("note_campione___ends_with: " + GraphQLRequestSerializer.getEntry(note_campione___ends_with));
        }
        if (note_campione___not___ends_with != null) {
            joiner.add("note_campione___not___ends_with: " + GraphQLRequestSerializer.getEntry(note_campione___not___ends_with));
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
        if (paziente_hepaicona___eq != null) {
            joiner.add("paziente_hepaicona___eq: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___eq));
        }
        if (paziente_hepaicona___ne != null) {
            joiner.add("paziente_hepaicona___ne: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___ne));
        }
        if (paziente_hepaicona___null != null) {
            joiner.add("paziente_hepaicona___null: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___null));
        }
        if (paziente_hepaicona___not___null != null) {
            joiner.add("paziente_hepaicona___not___null: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___not___null));
        }
        if (paziente_hepaicona___in != null) {
            joiner.add("paziente_hepaicona___in: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___in));
        }
        if (paziente_hepaicona___not___in != null) {
            joiner.add("paziente_hepaicona___not___in: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___not___in));
        }
        if (paziente_hepaicona___lt != null) {
            joiner.add("paziente_hepaicona___lt: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___lt));
        }
        if (paziente_hepaicona___lte != null) {
            joiner.add("paziente_hepaicona___lte: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___lte));
        }
        if (paziente_hepaicona___gt != null) {
            joiner.add("paziente_hepaicona___gt: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___gt));
        }
        if (paziente_hepaicona___gte != null) {
            joiner.add("paziente_hepaicona___gte: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___gte));
        }
        if (paziente_hepaicona___contains != null) {
            joiner.add("paziente_hepaicona___contains: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___contains));
        }
        if (paziente_hepaicona___not___contains != null) {
            joiner.add("paziente_hepaicona___not___contains: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___not___contains));
        }
        if (paziente_hepaicona___starts_with != null) {
            joiner.add("paziente_hepaicona___starts_with: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___starts_with));
        }
        if (paziente_hepaicona___not___starts_with != null) {
            joiner.add("paziente_hepaicona___not___starts_with: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___not___starts_with));
        }
        if (paziente_hepaicona___ends_with != null) {
            joiner.add("paziente_hepaicona___ends_with: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___ends_with));
        }
        if (paziente_hepaicona___not___ends_with != null) {
            joiner.add("paziente_hepaicona___not___ends_with: " + GraphQLRequestSerializer.getEntry(paziente_hepaicona___not___ends_with));
        }
        if (paziente_icona___eq != null) {
            joiner.add("paziente_icona___eq: " + GraphQLRequestSerializer.getEntry(paziente_icona___eq));
        }
        if (paziente_icona___ne != null) {
            joiner.add("paziente_icona___ne: " + GraphQLRequestSerializer.getEntry(paziente_icona___ne));
        }
        if (paziente_icona___null != null) {
            joiner.add("paziente_icona___null: " + GraphQLRequestSerializer.getEntry(paziente_icona___null));
        }
        if (paziente_icona___not___null != null) {
            joiner.add("paziente_icona___not___null: " + GraphQLRequestSerializer.getEntry(paziente_icona___not___null));
        }
        if (paziente_icona___in != null) {
            joiner.add("paziente_icona___in: " + GraphQLRequestSerializer.getEntry(paziente_icona___in));
        }
        if (paziente_icona___not___in != null) {
            joiner.add("paziente_icona___not___in: " + GraphQLRequestSerializer.getEntry(paziente_icona___not___in));
        }
        if (paziente_icona___lt != null) {
            joiner.add("paziente_icona___lt: " + GraphQLRequestSerializer.getEntry(paziente_icona___lt));
        }
        if (paziente_icona___lte != null) {
            joiner.add("paziente_icona___lte: " + GraphQLRequestSerializer.getEntry(paziente_icona___lte));
        }
        if (paziente_icona___gt != null) {
            joiner.add("paziente_icona___gt: " + GraphQLRequestSerializer.getEntry(paziente_icona___gt));
        }
        if (paziente_icona___gte != null) {
            joiner.add("paziente_icona___gte: " + GraphQLRequestSerializer.getEntry(paziente_icona___gte));
        }
        if (paziente_icona___contains != null) {
            joiner.add("paziente_icona___contains: " + GraphQLRequestSerializer.getEntry(paziente_icona___contains));
        }
        if (paziente_icona___not___contains != null) {
            joiner.add("paziente_icona___not___contains: " + GraphQLRequestSerializer.getEntry(paziente_icona___not___contains));
        }
        if (paziente_icona___starts_with != null) {
            joiner.add("paziente_icona___starts_with: " + GraphQLRequestSerializer.getEntry(paziente_icona___starts_with));
        }
        if (paziente_icona___not___starts_with != null) {
            joiner.add("paziente_icona___not___starts_with: " + GraphQLRequestSerializer.getEntry(paziente_icona___not___starts_with));
        }
        if (paziente_icona___ends_with != null) {
            joiner.add("paziente_icona___ends_with: " + GraphQLRequestSerializer.getEntry(paziente_icona___ends_with));
        }
        if (paziente_icona___not___ends_with != null) {
            joiner.add("paziente_icona___not___ends_with: " + GraphQLRequestSerializer.getEntry(paziente_icona___not___ends_with));
        }
        if (paziente_nascita___eq != null) {
            joiner.add("paziente_nascita___eq: " + GraphQLRequestSerializer.getEntry(paziente_nascita___eq));
        }
        if (paziente_nascita___ne != null) {
            joiner.add("paziente_nascita___ne: " + GraphQLRequestSerializer.getEntry(paziente_nascita___ne));
        }
        if (paziente_nascita___null != null) {
            joiner.add("paziente_nascita___null: " + GraphQLRequestSerializer.getEntry(paziente_nascita___null));
        }
        if (paziente_nascita___not___null != null) {
            joiner.add("paziente_nascita___not___null: " + GraphQLRequestSerializer.getEntry(paziente_nascita___not___null));
        }
        if (paziente_nascita___in != null) {
            joiner.add("paziente_nascita___in: " + GraphQLRequestSerializer.getEntry(paziente_nascita___in));
        }
        if (paziente_nascita___not___in != null) {
            joiner.add("paziente_nascita___not___in: " + GraphQLRequestSerializer.getEntry(paziente_nascita___not___in));
        }
        if (paziente_nascita___lt != null) {
            joiner.add("paziente_nascita___lt: " + GraphQLRequestSerializer.getEntry(paziente_nascita___lt));
        }
        if (paziente_nascita___lte != null) {
            joiner.add("paziente_nascita___lte: " + GraphQLRequestSerializer.getEntry(paziente_nascita___lte));
        }
        if (paziente_nascita___gt != null) {
            joiner.add("paziente_nascita___gt: " + GraphQLRequestSerializer.getEntry(paziente_nascita___gt));
        }
        if (paziente_nascita___gte != null) {
            joiner.add("paziente_nascita___gte: " + GraphQLRequestSerializer.getEntry(paziente_nascita___gte));
        }
        if (posizioni___eq != null) {
            joiner.add("posizioni___eq: " + GraphQLRequestSerializer.getEntry(posizioni___eq));
        }
        if (posizioni___ne != null) {
            joiner.add("posizioni___ne: " + GraphQLRequestSerializer.getEntry(posizioni___ne));
        }
        if (posizioni___null != null) {
            joiner.add("posizioni___null: " + GraphQLRequestSerializer.getEntry(posizioni___null));
        }
        if (posizioni___not___null != null) {
            joiner.add("posizioni___not___null: " + GraphQLRequestSerializer.getEntry(posizioni___not___null));
        }
        if (posizioni___in != null) {
            joiner.add("posizioni___in: " + GraphQLRequestSerializer.getEntry(posizioni___in));
        }
        if (posizioni___not___in != null) {
            joiner.add("posizioni___not___in: " + GraphQLRequestSerializer.getEntry(posizioni___not___in));
        }
        if (posizioni___lt != null) {
            joiner.add("posizioni___lt: " + GraphQLRequestSerializer.getEntry(posizioni___lt));
        }
        if (posizioni___lte != null) {
            joiner.add("posizioni___lte: " + GraphQLRequestSerializer.getEntry(posizioni___lte));
        }
        if (posizioni___gt != null) {
            joiner.add("posizioni___gt: " + GraphQLRequestSerializer.getEntry(posizioni___gt));
        }
        if (posizioni___gte != null) {
            joiner.add("posizioni___gte: " + GraphQLRequestSerializer.getEntry(posizioni___gte));
        }
        if (posizioni___contains != null) {
            joiner.add("posizioni___contains: " + GraphQLRequestSerializer.getEntry(posizioni___contains));
        }
        if (posizioni___not___contains != null) {
            joiner.add("posizioni___not___contains: " + GraphQLRequestSerializer.getEntry(posizioni___not___contains));
        }
        if (posizioni___starts_with != null) {
            joiner.add("posizioni___starts_with: " + GraphQLRequestSerializer.getEntry(posizioni___starts_with));
        }
        if (posizioni___not___starts_with != null) {
            joiner.add("posizioni___not___starts_with: " + GraphQLRequestSerializer.getEntry(posizioni___not___starts_with));
        }
        if (posizioni___ends_with != null) {
            joiner.add("posizioni___ends_with: " + GraphQLRequestSerializer.getEntry(posizioni___ends_with));
        }
        if (posizioni___not___ends_with != null) {
            joiner.add("posizioni___not___ends_with: " + GraphQLRequestSerializer.getEntry(posizioni___not___ends_with));
        }
        if (provette_iniziali___eq != null) {
            joiner.add("provette_iniziali___eq: " + GraphQLRequestSerializer.getEntry(provette_iniziali___eq));
        }
        if (provette_iniziali___ne != null) {
            joiner.add("provette_iniziali___ne: " + GraphQLRequestSerializer.getEntry(provette_iniziali___ne));
        }
        if (provette_iniziali___null != null) {
            joiner.add("provette_iniziali___null: " + GraphQLRequestSerializer.getEntry(provette_iniziali___null));
        }
        if (provette_iniziali___not___null != null) {
            joiner.add("provette_iniziali___not___null: " + GraphQLRequestSerializer.getEntry(provette_iniziali___not___null));
        }
        if (provette_iniziali___in != null) {
            joiner.add("provette_iniziali___in: " + GraphQLRequestSerializer.getEntry(provette_iniziali___in));
        }
        if (provette_iniziali___not___in != null) {
            joiner.add("provette_iniziali___not___in: " + GraphQLRequestSerializer.getEntry(provette_iniziali___not___in));
        }
        if (provette_iniziali___lt != null) {
            joiner.add("provette_iniziali___lt: " + GraphQLRequestSerializer.getEntry(provette_iniziali___lt));
        }
        if (provette_iniziali___lte != null) {
            joiner.add("provette_iniziali___lte: " + GraphQLRequestSerializer.getEntry(provette_iniziali___lte));
        }
        if (provette_iniziali___gt != null) {
            joiner.add("provette_iniziali___gt: " + GraphQLRequestSerializer.getEntry(provette_iniziali___gt));
        }
        if (provette_iniziali___gte != null) {
            joiner.add("provette_iniziali___gte: " + GraphQLRequestSerializer.getEntry(provette_iniziali___gte));
        }
        if (provette_rimanenti___eq != null) {
            joiner.add("provette_rimanenti___eq: " + GraphQLRequestSerializer.getEntry(provette_rimanenti___eq));
        }
        if (provette_rimanenti___ne != null) {
            joiner.add("provette_rimanenti___ne: " + GraphQLRequestSerializer.getEntry(provette_rimanenti___ne));
        }
        if (provette_rimanenti___null != null) {
            joiner.add("provette_rimanenti___null: " + GraphQLRequestSerializer.getEntry(provette_rimanenti___null));
        }
        if (provette_rimanenti___not___null != null) {
            joiner.add("provette_rimanenti___not___null: " + GraphQLRequestSerializer.getEntry(provette_rimanenti___not___null));
        }
        if (provette_rimanenti___in != null) {
            joiner.add("provette_rimanenti___in: " + GraphQLRequestSerializer.getEntry(provette_rimanenti___in));
        }
        if (provette_rimanenti___not___in != null) {
            joiner.add("provette_rimanenti___not___in: " + GraphQLRequestSerializer.getEntry(provette_rimanenti___not___in));
        }
        if (provette_rimanenti___lt != null) {
            joiner.add("provette_rimanenti___lt: " + GraphQLRequestSerializer.getEntry(provette_rimanenti___lt));
        }
        if (provette_rimanenti___lte != null) {
            joiner.add("provette_rimanenti___lte: " + GraphQLRequestSerializer.getEntry(provette_rimanenti___lte));
        }
        if (provette_rimanenti___gt != null) {
            joiner.add("provette_rimanenti___gt: " + GraphQLRequestSerializer.getEntry(provette_rimanenti___gt));
        }
        if (provette_rimanenti___gte != null) {
            joiner.add("provette_rimanenti___gte: " + GraphQLRequestSerializer.getEntry(provette_rimanenti___gte));
        }
        if (qt___eq != null) {
            joiner.add("qt___eq: " + GraphQLRequestSerializer.getEntry(qt___eq));
        }
        if (qt___ne != null) {
            joiner.add("qt___ne: " + GraphQLRequestSerializer.getEntry(qt___ne));
        }
        if (qt___null != null) {
            joiner.add("qt___null: " + GraphQLRequestSerializer.getEntry(qt___null));
        }
        if (qt___not___null != null) {
            joiner.add("qt___not___null: " + GraphQLRequestSerializer.getEntry(qt___not___null));
        }
        if (qt___in != null) {
            joiner.add("qt___in: " + GraphQLRequestSerializer.getEntry(qt___in));
        }
        if (qt___not___in != null) {
            joiner.add("qt___not___in: " + GraphQLRequestSerializer.getEntry(qt___not___in));
        }
        if (qt___lt != null) {
            joiner.add("qt___lt: " + GraphQLRequestSerializer.getEntry(qt___lt));
        }
        if (qt___lte != null) {
            joiner.add("qt___lte: " + GraphQLRequestSerializer.getEntry(qt___lte));
        }
        if (qt___gt != null) {
            joiner.add("qt___gt: " + GraphQLRequestSerializer.getEntry(qt___gt));
        }
        if (qt___gte != null) {
            joiner.add("qt___gte: " + GraphQLRequestSerializer.getEntry(qt___gte));
        }
        if (quantita___eq != null) {
            joiner.add("quantita___eq: " + GraphQLRequestSerializer.getEntry(quantita___eq));
        }
        if (quantita___ne != null) {
            joiner.add("quantita___ne: " + GraphQLRequestSerializer.getEntry(quantita___ne));
        }
        if (quantita___null != null) {
            joiner.add("quantita___null: " + GraphQLRequestSerializer.getEntry(quantita___null));
        }
        if (quantita___not___null != null) {
            joiner.add("quantita___not___null: " + GraphQLRequestSerializer.getEntry(quantita___not___null));
        }
        if (quantita___in != null) {
            joiner.add("quantita___in: " + GraphQLRequestSerializer.getEntry(quantita___in));
        }
        if (quantita___not___in != null) {
            joiner.add("quantita___not___in: " + GraphQLRequestSerializer.getEntry(quantita___not___in));
        }
        if (quantita___lt != null) {
            joiner.add("quantita___lt: " + GraphQLRequestSerializer.getEntry(quantita___lt));
        }
        if (quantita___lte != null) {
            joiner.add("quantita___lte: " + GraphQLRequestSerializer.getEntry(quantita___lte));
        }
        if (quantita___gt != null) {
            joiner.add("quantita___gt: " + GraphQLRequestSerializer.getEntry(quantita___gt));
        }
        if (quantita___gte != null) {
            joiner.add("quantita___gte: " + GraphQLRequestSerializer.getEntry(quantita___gte));
        }
        if (quantita___contains != null) {
            joiner.add("quantita___contains: " + GraphQLRequestSerializer.getEntry(quantita___contains));
        }
        if (quantita___not___contains != null) {
            joiner.add("quantita___not___contains: " + GraphQLRequestSerializer.getEntry(quantita___not___contains));
        }
        if (quantita___starts_with != null) {
            joiner.add("quantita___starts_with: " + GraphQLRequestSerializer.getEntry(quantita___starts_with));
        }
        if (quantita___not___starts_with != null) {
            joiner.add("quantita___not___starts_with: " + GraphQLRequestSerializer.getEntry(quantita___not___starts_with));
        }
        if (quantita___ends_with != null) {
            joiner.add("quantita___ends_with: " + GraphQLRequestSerializer.getEntry(quantita___ends_with));
        }
        if (quantita___not___ends_with != null) {
            joiner.add("quantita___not___ends_with: " + GraphQLRequestSerializer.getEntry(quantita___not___ends_with));
        }
        if (rack___eq != null) {
            joiner.add("rack___eq: " + GraphQLRequestSerializer.getEntry(rack___eq));
        }
        if (rack___ne != null) {
            joiner.add("rack___ne: " + GraphQLRequestSerializer.getEntry(rack___ne));
        }
        if (rack___null != null) {
            joiner.add("rack___null: " + GraphQLRequestSerializer.getEntry(rack___null));
        }
        if (rack___not___null != null) {
            joiner.add("rack___not___null: " + GraphQLRequestSerializer.getEntry(rack___not___null));
        }
        if (rack___in != null) {
            joiner.add("rack___in: " + GraphQLRequestSerializer.getEntry(rack___in));
        }
        if (rack___not___in != null) {
            joiner.add("rack___not___in: " + GraphQLRequestSerializer.getEntry(rack___not___in));
        }
        if (rack___lt != null) {
            joiner.add("rack___lt: " + GraphQLRequestSerializer.getEntry(rack___lt));
        }
        if (rack___lte != null) {
            joiner.add("rack___lte: " + GraphQLRequestSerializer.getEntry(rack___lte));
        }
        if (rack___gt != null) {
            joiner.add("rack___gt: " + GraphQLRequestSerializer.getEntry(rack___gt));
        }
        if (rack___gte != null) {
            joiner.add("rack___gte: " + GraphQLRequestSerializer.getEntry(rack___gte));
        }
        if (rack___contains != null) {
            joiner.add("rack___contains: " + GraphQLRequestSerializer.getEntry(rack___contains));
        }
        if (rack___not___contains != null) {
            joiner.add("rack___not___contains: " + GraphQLRequestSerializer.getEntry(rack___not___contains));
        }
        if (rack___starts_with != null) {
            joiner.add("rack___starts_with: " + GraphQLRequestSerializer.getEntry(rack___starts_with));
        }
        if (rack___not___starts_with != null) {
            joiner.add("rack___not___starts_with: " + GraphQLRequestSerializer.getEntry(rack___not___starts_with));
        }
        if (rack___ends_with != null) {
            joiner.add("rack___ends_with: " + GraphQLRequestSerializer.getEntry(rack___ends_with));
        }
        if (rack___not___ends_with != null) {
            joiner.add("rack___not___ends_with: " + GraphQLRequestSerializer.getEntry(rack___not___ends_with));
        }
        if (sede_biobanca___eq != null) {
            joiner.add("sede_biobanca___eq: " + GraphQLRequestSerializer.getEntry(sede_biobanca___eq));
        }
        if (sede_biobanca___ne != null) {
            joiner.add("sede_biobanca___ne: " + GraphQLRequestSerializer.getEntry(sede_biobanca___ne));
        }
        if (sede_biobanca___null != null) {
            joiner.add("sede_biobanca___null: " + GraphQLRequestSerializer.getEntry(sede_biobanca___null));
        }
        if (sede_biobanca___not___null != null) {
            joiner.add("sede_biobanca___not___null: " + GraphQLRequestSerializer.getEntry(sede_biobanca___not___null));
        }
        if (sede_biobanca___in != null) {
            joiner.add("sede_biobanca___in: " + GraphQLRequestSerializer.getEntry(sede_biobanca___in));
        }
        if (sede_biobanca___not___in != null) {
            joiner.add("sede_biobanca___not___in: " + GraphQLRequestSerializer.getEntry(sede_biobanca___not___in));
        }
        if (sede_biobanca___lt != null) {
            joiner.add("sede_biobanca___lt: " + GraphQLRequestSerializer.getEntry(sede_biobanca___lt));
        }
        if (sede_biobanca___lte != null) {
            joiner.add("sede_biobanca___lte: " + GraphQLRequestSerializer.getEntry(sede_biobanca___lte));
        }
        if (sede_biobanca___gt != null) {
            joiner.add("sede_biobanca___gt: " + GraphQLRequestSerializer.getEntry(sede_biobanca___gt));
        }
        if (sede_biobanca___gte != null) {
            joiner.add("sede_biobanca___gte: " + GraphQLRequestSerializer.getEntry(sede_biobanca___gte));
        }
        if (sede_biobanca___contains != null) {
            joiner.add("sede_biobanca___contains: " + GraphQLRequestSerializer.getEntry(sede_biobanca___contains));
        }
        if (sede_biobanca___not___contains != null) {
            joiner.add("sede_biobanca___not___contains: " + GraphQLRequestSerializer.getEntry(sede_biobanca___not___contains));
        }
        if (sede_biobanca___starts_with != null) {
            joiner.add("sede_biobanca___starts_with: " + GraphQLRequestSerializer.getEntry(sede_biobanca___starts_with));
        }
        if (sede_biobanca___not___starts_with != null) {
            joiner.add("sede_biobanca___not___starts_with: " + GraphQLRequestSerializer.getEntry(sede_biobanca___not___starts_with));
        }
        if (sede_biobanca___ends_with != null) {
            joiner.add("sede_biobanca___ends_with: " + GraphQLRequestSerializer.getEntry(sede_biobanca___ends_with));
        }
        if (sede_biobanca___not___ends_with != null) {
            joiner.add("sede_biobanca___not___ends_with: " + GraphQLRequestSerializer.getEntry(sede_biobanca___not___ends_with));
        }
        if (um___eq != null) {
            joiner.add("um___eq: " + GraphQLRequestSerializer.getEntry(um___eq));
        }
        if (um___ne != null) {
            joiner.add("um___ne: " + GraphQLRequestSerializer.getEntry(um___ne));
        }
        if (um___null != null) {
            joiner.add("um___null: " + GraphQLRequestSerializer.getEntry(um___null));
        }
        if (um___not___null != null) {
            joiner.add("um___not___null: " + GraphQLRequestSerializer.getEntry(um___not___null));
        }
        if (um___in != null) {
            joiner.add("um___in: " + GraphQLRequestSerializer.getEntry(um___in));
        }
        if (um___not___in != null) {
            joiner.add("um___not___in: " + GraphQLRequestSerializer.getEntry(um___not___in));
        }
        if (um___lt != null) {
            joiner.add("um___lt: " + GraphQLRequestSerializer.getEntry(um___lt));
        }
        if (um___lte != null) {
            joiner.add("um___lte: " + GraphQLRequestSerializer.getEntry(um___lte));
        }
        if (um___gt != null) {
            joiner.add("um___gt: " + GraphQLRequestSerializer.getEntry(um___gt));
        }
        if (um___gte != null) {
            joiner.add("um___gte: " + GraphQLRequestSerializer.getEntry(um___gte));
        }
        if (um___contains != null) {
            joiner.add("um___contains: " + GraphQLRequestSerializer.getEntry(um___contains));
        }
        if (um___not___contains != null) {
            joiner.add("um___not___contains: " + GraphQLRequestSerializer.getEntry(um___not___contains));
        }
        if (um___starts_with != null) {
            joiner.add("um___starts_with: " + GraphQLRequestSerializer.getEntry(um___starts_with));
        }
        if (um___not___starts_with != null) {
            joiner.add("um___not___starts_with: " + GraphQLRequestSerializer.getEntry(um___not___starts_with));
        }
        if (um___ends_with != null) {
            joiner.add("um___ends_with: " + GraphQLRequestSerializer.getEntry(um___ends_with));
        }
        if (um___not___ends_with != null) {
            joiner.add("um___not___ends_with: " + GraphQLRequestSerializer.getEntry(um___not___ends_with));
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

    public static CliCampione_oldFilterDTO.Builder builder() {
        return new CliCampione_oldFilterDTO.Builder();
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
        private String campione___eq;
        private String campione___ne;
        private Boolean campione___null;
        private Boolean campione___not___null;
        private java.util.List<String> campione___in;
        private java.util.List<String> campione___not___in;
        private String campione___lt;
        private String campione___lte;
        private String campione___gt;
        private String campione___gte;
        private String campione___contains;
        private String campione___not___contains;
        private String campione___starts_with;
        private String campione___not___starts_with;
        private String campione___ends_with;
        private String campione___not___ends_with;
        private String centro_icona___eq;
        private String centro_icona___ne;
        private Boolean centro_icona___null;
        private Boolean centro_icona___not___null;
        private java.util.List<String> centro_icona___in;
        private java.util.List<String> centro_icona___not___in;
        private String centro_icona___lt;
        private String centro_icona___lte;
        private String centro_icona___gt;
        private String centro_icona___gte;
        private String centro_icona___contains;
        private String centro_icona___not___contains;
        private String centro_icona___starts_with;
        private String centro_icona___not___starts_with;
        private String centro_icona___ends_with;
        private String centro_icona___not___ends_with;
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
        private String etichetta___eq;
        private String etichetta___ne;
        private Boolean etichetta___null;
        private Boolean etichetta___not___null;
        private java.util.List<String> etichetta___in;
        private java.util.List<String> etichetta___not___in;
        private String etichetta___lt;
        private String etichetta___lte;
        private String etichetta___gt;
        private String etichetta___gte;
        private String etichetta___contains;
        private String etichetta___not___contains;
        private String etichetta___starts_with;
        private String etichetta___not___starts_with;
        private String etichetta___ends_with;
        private String etichetta___not___ends_with;
        private Integer id_campione___eq;
        private Integer id_campione___ne;
        private Boolean id_campione___null;
        private Boolean id_campione___not___null;
        private java.util.List<Integer> id_campione___in;
        private java.util.List<Integer> id_campione___not___in;
        private Integer id_campione___lt;
        private Integer id_campione___lte;
        private Integer id_campione___gt;
        private Integer id_campione___gte;
        private String note_campione___eq;
        private String note_campione___ne;
        private Boolean note_campione___null;
        private Boolean note_campione___not___null;
        private java.util.List<String> note_campione___in;
        private java.util.List<String> note_campione___not___in;
        private String note_campione___lt;
        private String note_campione___lte;
        private String note_campione___gt;
        private String note_campione___gte;
        private String note_campione___contains;
        private String note_campione___not___contains;
        private String note_campione___starts_with;
        private String note_campione___not___starts_with;
        private String note_campione___ends_with;
        private String note_campione___not___ends_with;
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
        private String paziente_hepaicona___eq;
        private String paziente_hepaicona___ne;
        private Boolean paziente_hepaicona___null;
        private Boolean paziente_hepaicona___not___null;
        private java.util.List<String> paziente_hepaicona___in;
        private java.util.List<String> paziente_hepaicona___not___in;
        private String paziente_hepaicona___lt;
        private String paziente_hepaicona___lte;
        private String paziente_hepaicona___gt;
        private String paziente_hepaicona___gte;
        private String paziente_hepaicona___contains;
        private String paziente_hepaicona___not___contains;
        private String paziente_hepaicona___starts_with;
        private String paziente_hepaicona___not___starts_with;
        private String paziente_hepaicona___ends_with;
        private String paziente_hepaicona___not___ends_with;
        private String paziente_icona___eq;
        private String paziente_icona___ne;
        private Boolean paziente_icona___null;
        private Boolean paziente_icona___not___null;
        private java.util.List<String> paziente_icona___in;
        private java.util.List<String> paziente_icona___not___in;
        private String paziente_icona___lt;
        private String paziente_icona___lte;
        private String paziente_icona___gt;
        private String paziente_icona___gte;
        private String paziente_icona___contains;
        private String paziente_icona___not___contains;
        private String paziente_icona___starts_with;
        private String paziente_icona___not___starts_with;
        private String paziente_icona___ends_with;
        private String paziente_icona___not___ends_with;
        private String paziente_nascita___eq;
        private String paziente_nascita___ne;
        private Boolean paziente_nascita___null;
        private Boolean paziente_nascita___not___null;
        private java.util.List<String> paziente_nascita___in;
        private java.util.List<String> paziente_nascita___not___in;
        private String paziente_nascita___lt;
        private String paziente_nascita___lte;
        private String paziente_nascita___gt;
        private String paziente_nascita___gte;
        private String posizioni___eq;
        private String posizioni___ne;
        private Boolean posizioni___null;
        private Boolean posizioni___not___null;
        private java.util.List<String> posizioni___in;
        private java.util.List<String> posizioni___not___in;
        private String posizioni___lt;
        private String posizioni___lte;
        private String posizioni___gt;
        private String posizioni___gte;
        private String posizioni___contains;
        private String posizioni___not___contains;
        private String posizioni___starts_with;
        private String posizioni___not___starts_with;
        private String posizioni___ends_with;
        private String posizioni___not___ends_with;
        private Integer provette_iniziali___eq;
        private Integer provette_iniziali___ne;
        private Boolean provette_iniziali___null;
        private Boolean provette_iniziali___not___null;
        private java.util.List<Integer> provette_iniziali___in;
        private java.util.List<Integer> provette_iniziali___not___in;
        private Integer provette_iniziali___lt;
        private Integer provette_iniziali___lte;
        private Integer provette_iniziali___gt;
        private Integer provette_iniziali___gte;
        private Integer provette_rimanenti___eq;
        private Integer provette_rimanenti___ne;
        private Boolean provette_rimanenti___null;
        private Boolean provette_rimanenti___not___null;
        private java.util.List<Integer> provette_rimanenti___in;
        private java.util.List<Integer> provette_rimanenti___not___in;
        private Integer provette_rimanenti___lt;
        private Integer provette_rimanenti___lte;
        private Integer provette_rimanenti___gt;
        private Integer provette_rimanenti___gte;
        private String qt___eq;
        private String qt___ne;
        private Boolean qt___null;
        private Boolean qt___not___null;
        private java.util.List<String> qt___in;
        private java.util.List<String> qt___not___in;
        private String qt___lt;
        private String qt___lte;
        private String qt___gt;
        private String qt___gte;
        private String quantita___eq;
        private String quantita___ne;
        private Boolean quantita___null;
        private Boolean quantita___not___null;
        private java.util.List<String> quantita___in;
        private java.util.List<String> quantita___not___in;
        private String quantita___lt;
        private String quantita___lte;
        private String quantita___gt;
        private String quantita___gte;
        private String quantita___contains;
        private String quantita___not___contains;
        private String quantita___starts_with;
        private String quantita___not___starts_with;
        private String quantita___ends_with;
        private String quantita___not___ends_with;
        private String rack___eq;
        private String rack___ne;
        private Boolean rack___null;
        private Boolean rack___not___null;
        private java.util.List<String> rack___in;
        private java.util.List<String> rack___not___in;
        private String rack___lt;
        private String rack___lte;
        private String rack___gt;
        private String rack___gte;
        private String rack___contains;
        private String rack___not___contains;
        private String rack___starts_with;
        private String rack___not___starts_with;
        private String rack___ends_with;
        private String rack___not___ends_with;
        private String sede_biobanca___eq;
        private String sede_biobanca___ne;
        private Boolean sede_biobanca___null;
        private Boolean sede_biobanca___not___null;
        private java.util.List<String> sede_biobanca___in;
        private java.util.List<String> sede_biobanca___not___in;
        private String sede_biobanca___lt;
        private String sede_biobanca___lte;
        private String sede_biobanca___gt;
        private String sede_biobanca___gte;
        private String sede_biobanca___contains;
        private String sede_biobanca___not___contains;
        private String sede_biobanca___starts_with;
        private String sede_biobanca___not___starts_with;
        private String sede_biobanca___ends_with;
        private String sede_biobanca___not___ends_with;
        private String um___eq;
        private String um___ne;
        private Boolean um___null;
        private Boolean um___not___null;
        private java.util.List<String> um___in;
        private java.util.List<String> um___not___in;
        private String um___lt;
        private String um___lte;
        private String um___gt;
        private String um___gte;
        private String um___contains;
        private String um___not___contains;
        private String um___starts_with;
        private String um___not___starts_with;
        private String um___ends_with;
        private String um___not___ends_with;
        private java.util.List<CliCampione_oldFilterDTO> AND;
        private java.util.List<CliCampione_oldFilterDTO> OR;
        private CliCampione_oldFilterDTO NOT;

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

        public Builder setCampione___eq(String campione___eq) {
            this.campione___eq = campione___eq;
            return this;
        }

        public Builder setCampione___ne(String campione___ne) {
            this.campione___ne = campione___ne;
            return this;
        }

        public Builder setCampione___null(Boolean campione___null) {
            this.campione___null = campione___null;
            return this;
        }

        public Builder setCampione___not___null(Boolean campione___not___null) {
            this.campione___not___null = campione___not___null;
            return this;
        }

        public Builder setCampione___in(java.util.List<String> campione___in) {
            this.campione___in = campione___in;
            return this;
        }

        public Builder setCampione___not___in(java.util.List<String> campione___not___in) {
            this.campione___not___in = campione___not___in;
            return this;
        }

        public Builder setCampione___lt(String campione___lt) {
            this.campione___lt = campione___lt;
            return this;
        }

        public Builder setCampione___lte(String campione___lte) {
            this.campione___lte = campione___lte;
            return this;
        }

        public Builder setCampione___gt(String campione___gt) {
            this.campione___gt = campione___gt;
            return this;
        }

        public Builder setCampione___gte(String campione___gte) {
            this.campione___gte = campione___gte;
            return this;
        }

        public Builder setCampione___contains(String campione___contains) {
            this.campione___contains = campione___contains;
            return this;
        }

        public Builder setCampione___not___contains(String campione___not___contains) {
            this.campione___not___contains = campione___not___contains;
            return this;
        }

        public Builder setCampione___starts_with(String campione___starts_with) {
            this.campione___starts_with = campione___starts_with;
            return this;
        }

        public Builder setCampione___not___starts_with(String campione___not___starts_with) {
            this.campione___not___starts_with = campione___not___starts_with;
            return this;
        }

        public Builder setCampione___ends_with(String campione___ends_with) {
            this.campione___ends_with = campione___ends_with;
            return this;
        }

        public Builder setCampione___not___ends_with(String campione___not___ends_with) {
            this.campione___not___ends_with = campione___not___ends_with;
            return this;
        }

        public Builder setCentro_icona___eq(String centro_icona___eq) {
            this.centro_icona___eq = centro_icona___eq;
            return this;
        }

        public Builder setCentro_icona___ne(String centro_icona___ne) {
            this.centro_icona___ne = centro_icona___ne;
            return this;
        }

        public Builder setCentro_icona___null(Boolean centro_icona___null) {
            this.centro_icona___null = centro_icona___null;
            return this;
        }

        public Builder setCentro_icona___not___null(Boolean centro_icona___not___null) {
            this.centro_icona___not___null = centro_icona___not___null;
            return this;
        }

        public Builder setCentro_icona___in(java.util.List<String> centro_icona___in) {
            this.centro_icona___in = centro_icona___in;
            return this;
        }

        public Builder setCentro_icona___not___in(java.util.List<String> centro_icona___not___in) {
            this.centro_icona___not___in = centro_icona___not___in;
            return this;
        }

        public Builder setCentro_icona___lt(String centro_icona___lt) {
            this.centro_icona___lt = centro_icona___lt;
            return this;
        }

        public Builder setCentro_icona___lte(String centro_icona___lte) {
            this.centro_icona___lte = centro_icona___lte;
            return this;
        }

        public Builder setCentro_icona___gt(String centro_icona___gt) {
            this.centro_icona___gt = centro_icona___gt;
            return this;
        }

        public Builder setCentro_icona___gte(String centro_icona___gte) {
            this.centro_icona___gte = centro_icona___gte;
            return this;
        }

        public Builder setCentro_icona___contains(String centro_icona___contains) {
            this.centro_icona___contains = centro_icona___contains;
            return this;
        }

        public Builder setCentro_icona___not___contains(String centro_icona___not___contains) {
            this.centro_icona___not___contains = centro_icona___not___contains;
            return this;
        }

        public Builder setCentro_icona___starts_with(String centro_icona___starts_with) {
            this.centro_icona___starts_with = centro_icona___starts_with;
            return this;
        }

        public Builder setCentro_icona___not___starts_with(String centro_icona___not___starts_with) {
            this.centro_icona___not___starts_with = centro_icona___not___starts_with;
            return this;
        }

        public Builder setCentro_icona___ends_with(String centro_icona___ends_with) {
            this.centro_icona___ends_with = centro_icona___ends_with;
            return this;
        }

        public Builder setCentro_icona___not___ends_with(String centro_icona___not___ends_with) {
            this.centro_icona___not___ends_with = centro_icona___not___ends_with;
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

        public Builder setEtichetta___eq(String etichetta___eq) {
            this.etichetta___eq = etichetta___eq;
            return this;
        }

        public Builder setEtichetta___ne(String etichetta___ne) {
            this.etichetta___ne = etichetta___ne;
            return this;
        }

        public Builder setEtichetta___null(Boolean etichetta___null) {
            this.etichetta___null = etichetta___null;
            return this;
        }

        public Builder setEtichetta___not___null(Boolean etichetta___not___null) {
            this.etichetta___not___null = etichetta___not___null;
            return this;
        }

        public Builder setEtichetta___in(java.util.List<String> etichetta___in) {
            this.etichetta___in = etichetta___in;
            return this;
        }

        public Builder setEtichetta___not___in(java.util.List<String> etichetta___not___in) {
            this.etichetta___not___in = etichetta___not___in;
            return this;
        }

        public Builder setEtichetta___lt(String etichetta___lt) {
            this.etichetta___lt = etichetta___lt;
            return this;
        }

        public Builder setEtichetta___lte(String etichetta___lte) {
            this.etichetta___lte = etichetta___lte;
            return this;
        }

        public Builder setEtichetta___gt(String etichetta___gt) {
            this.etichetta___gt = etichetta___gt;
            return this;
        }

        public Builder setEtichetta___gte(String etichetta___gte) {
            this.etichetta___gte = etichetta___gte;
            return this;
        }

        public Builder setEtichetta___contains(String etichetta___contains) {
            this.etichetta___contains = etichetta___contains;
            return this;
        }

        public Builder setEtichetta___not___contains(String etichetta___not___contains) {
            this.etichetta___not___contains = etichetta___not___contains;
            return this;
        }

        public Builder setEtichetta___starts_with(String etichetta___starts_with) {
            this.etichetta___starts_with = etichetta___starts_with;
            return this;
        }

        public Builder setEtichetta___not___starts_with(String etichetta___not___starts_with) {
            this.etichetta___not___starts_with = etichetta___not___starts_with;
            return this;
        }

        public Builder setEtichetta___ends_with(String etichetta___ends_with) {
            this.etichetta___ends_with = etichetta___ends_with;
            return this;
        }

        public Builder setEtichetta___not___ends_with(String etichetta___not___ends_with) {
            this.etichetta___not___ends_with = etichetta___not___ends_with;
            return this;
        }

        public Builder setId_campione___eq(Integer id_campione___eq) {
            this.id_campione___eq = id_campione___eq;
            return this;
        }

        public Builder setId_campione___ne(Integer id_campione___ne) {
            this.id_campione___ne = id_campione___ne;
            return this;
        }

        public Builder setId_campione___null(Boolean id_campione___null) {
            this.id_campione___null = id_campione___null;
            return this;
        }

        public Builder setId_campione___not___null(Boolean id_campione___not___null) {
            this.id_campione___not___null = id_campione___not___null;
            return this;
        }

        public Builder setId_campione___in(java.util.List<Integer> id_campione___in) {
            this.id_campione___in = id_campione___in;
            return this;
        }

        public Builder setId_campione___not___in(java.util.List<Integer> id_campione___not___in) {
            this.id_campione___not___in = id_campione___not___in;
            return this;
        }

        public Builder setId_campione___lt(Integer id_campione___lt) {
            this.id_campione___lt = id_campione___lt;
            return this;
        }

        public Builder setId_campione___lte(Integer id_campione___lte) {
            this.id_campione___lte = id_campione___lte;
            return this;
        }

        public Builder setId_campione___gt(Integer id_campione___gt) {
            this.id_campione___gt = id_campione___gt;
            return this;
        }

        public Builder setId_campione___gte(Integer id_campione___gte) {
            this.id_campione___gte = id_campione___gte;
            return this;
        }

        public Builder setNote_campione___eq(String note_campione___eq) {
            this.note_campione___eq = note_campione___eq;
            return this;
        }

        public Builder setNote_campione___ne(String note_campione___ne) {
            this.note_campione___ne = note_campione___ne;
            return this;
        }

        public Builder setNote_campione___null(Boolean note_campione___null) {
            this.note_campione___null = note_campione___null;
            return this;
        }

        public Builder setNote_campione___not___null(Boolean note_campione___not___null) {
            this.note_campione___not___null = note_campione___not___null;
            return this;
        }

        public Builder setNote_campione___in(java.util.List<String> note_campione___in) {
            this.note_campione___in = note_campione___in;
            return this;
        }

        public Builder setNote_campione___not___in(java.util.List<String> note_campione___not___in) {
            this.note_campione___not___in = note_campione___not___in;
            return this;
        }

        public Builder setNote_campione___lt(String note_campione___lt) {
            this.note_campione___lt = note_campione___lt;
            return this;
        }

        public Builder setNote_campione___lte(String note_campione___lte) {
            this.note_campione___lte = note_campione___lte;
            return this;
        }

        public Builder setNote_campione___gt(String note_campione___gt) {
            this.note_campione___gt = note_campione___gt;
            return this;
        }

        public Builder setNote_campione___gte(String note_campione___gte) {
            this.note_campione___gte = note_campione___gte;
            return this;
        }

        public Builder setNote_campione___contains(String note_campione___contains) {
            this.note_campione___contains = note_campione___contains;
            return this;
        }

        public Builder setNote_campione___not___contains(String note_campione___not___contains) {
            this.note_campione___not___contains = note_campione___not___contains;
            return this;
        }

        public Builder setNote_campione___starts_with(String note_campione___starts_with) {
            this.note_campione___starts_with = note_campione___starts_with;
            return this;
        }

        public Builder setNote_campione___not___starts_with(String note_campione___not___starts_with) {
            this.note_campione___not___starts_with = note_campione___not___starts_with;
            return this;
        }

        public Builder setNote_campione___ends_with(String note_campione___ends_with) {
            this.note_campione___ends_with = note_campione___ends_with;
            return this;
        }

        public Builder setNote_campione___not___ends_with(String note_campione___not___ends_with) {
            this.note_campione___not___ends_with = note_campione___not___ends_with;
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

        public Builder setPaziente_hepaicona___eq(String paziente_hepaicona___eq) {
            this.paziente_hepaicona___eq = paziente_hepaicona___eq;
            return this;
        }

        public Builder setPaziente_hepaicona___ne(String paziente_hepaicona___ne) {
            this.paziente_hepaicona___ne = paziente_hepaicona___ne;
            return this;
        }

        public Builder setPaziente_hepaicona___null(Boolean paziente_hepaicona___null) {
            this.paziente_hepaicona___null = paziente_hepaicona___null;
            return this;
        }

        public Builder setPaziente_hepaicona___not___null(Boolean paziente_hepaicona___not___null) {
            this.paziente_hepaicona___not___null = paziente_hepaicona___not___null;
            return this;
        }

        public Builder setPaziente_hepaicona___in(java.util.List<String> paziente_hepaicona___in) {
            this.paziente_hepaicona___in = paziente_hepaicona___in;
            return this;
        }

        public Builder setPaziente_hepaicona___not___in(java.util.List<String> paziente_hepaicona___not___in) {
            this.paziente_hepaicona___not___in = paziente_hepaicona___not___in;
            return this;
        }

        public Builder setPaziente_hepaicona___lt(String paziente_hepaicona___lt) {
            this.paziente_hepaicona___lt = paziente_hepaicona___lt;
            return this;
        }

        public Builder setPaziente_hepaicona___lte(String paziente_hepaicona___lte) {
            this.paziente_hepaicona___lte = paziente_hepaicona___lte;
            return this;
        }

        public Builder setPaziente_hepaicona___gt(String paziente_hepaicona___gt) {
            this.paziente_hepaicona___gt = paziente_hepaicona___gt;
            return this;
        }

        public Builder setPaziente_hepaicona___gte(String paziente_hepaicona___gte) {
            this.paziente_hepaicona___gte = paziente_hepaicona___gte;
            return this;
        }

        public Builder setPaziente_hepaicona___contains(String paziente_hepaicona___contains) {
            this.paziente_hepaicona___contains = paziente_hepaicona___contains;
            return this;
        }

        public Builder setPaziente_hepaicona___not___contains(String paziente_hepaicona___not___contains) {
            this.paziente_hepaicona___not___contains = paziente_hepaicona___not___contains;
            return this;
        }

        public Builder setPaziente_hepaicona___starts_with(String paziente_hepaicona___starts_with) {
            this.paziente_hepaicona___starts_with = paziente_hepaicona___starts_with;
            return this;
        }

        public Builder setPaziente_hepaicona___not___starts_with(String paziente_hepaicona___not___starts_with) {
            this.paziente_hepaicona___not___starts_with = paziente_hepaicona___not___starts_with;
            return this;
        }

        public Builder setPaziente_hepaicona___ends_with(String paziente_hepaicona___ends_with) {
            this.paziente_hepaicona___ends_with = paziente_hepaicona___ends_with;
            return this;
        }

        public Builder setPaziente_hepaicona___not___ends_with(String paziente_hepaicona___not___ends_with) {
            this.paziente_hepaicona___not___ends_with = paziente_hepaicona___not___ends_with;
            return this;
        }

        public Builder setPaziente_icona___eq(String paziente_icona___eq) {
            this.paziente_icona___eq = paziente_icona___eq;
            return this;
        }

        public Builder setPaziente_icona___ne(String paziente_icona___ne) {
            this.paziente_icona___ne = paziente_icona___ne;
            return this;
        }

        public Builder setPaziente_icona___null(Boolean paziente_icona___null) {
            this.paziente_icona___null = paziente_icona___null;
            return this;
        }

        public Builder setPaziente_icona___not___null(Boolean paziente_icona___not___null) {
            this.paziente_icona___not___null = paziente_icona___not___null;
            return this;
        }

        public Builder setPaziente_icona___in(java.util.List<String> paziente_icona___in) {
            this.paziente_icona___in = paziente_icona___in;
            return this;
        }

        public Builder setPaziente_icona___not___in(java.util.List<String> paziente_icona___not___in) {
            this.paziente_icona___not___in = paziente_icona___not___in;
            return this;
        }

        public Builder setPaziente_icona___lt(String paziente_icona___lt) {
            this.paziente_icona___lt = paziente_icona___lt;
            return this;
        }

        public Builder setPaziente_icona___lte(String paziente_icona___lte) {
            this.paziente_icona___lte = paziente_icona___lte;
            return this;
        }

        public Builder setPaziente_icona___gt(String paziente_icona___gt) {
            this.paziente_icona___gt = paziente_icona___gt;
            return this;
        }

        public Builder setPaziente_icona___gte(String paziente_icona___gte) {
            this.paziente_icona___gte = paziente_icona___gte;
            return this;
        }

        public Builder setPaziente_icona___contains(String paziente_icona___contains) {
            this.paziente_icona___contains = paziente_icona___contains;
            return this;
        }

        public Builder setPaziente_icona___not___contains(String paziente_icona___not___contains) {
            this.paziente_icona___not___contains = paziente_icona___not___contains;
            return this;
        }

        public Builder setPaziente_icona___starts_with(String paziente_icona___starts_with) {
            this.paziente_icona___starts_with = paziente_icona___starts_with;
            return this;
        }

        public Builder setPaziente_icona___not___starts_with(String paziente_icona___not___starts_with) {
            this.paziente_icona___not___starts_with = paziente_icona___not___starts_with;
            return this;
        }

        public Builder setPaziente_icona___ends_with(String paziente_icona___ends_with) {
            this.paziente_icona___ends_with = paziente_icona___ends_with;
            return this;
        }

        public Builder setPaziente_icona___not___ends_with(String paziente_icona___not___ends_with) {
            this.paziente_icona___not___ends_with = paziente_icona___not___ends_with;
            return this;
        }

        public Builder setPaziente_nascita___eq(String paziente_nascita___eq) {
            this.paziente_nascita___eq = paziente_nascita___eq;
            return this;
        }

        public Builder setPaziente_nascita___ne(String paziente_nascita___ne) {
            this.paziente_nascita___ne = paziente_nascita___ne;
            return this;
        }

        public Builder setPaziente_nascita___null(Boolean paziente_nascita___null) {
            this.paziente_nascita___null = paziente_nascita___null;
            return this;
        }

        public Builder setPaziente_nascita___not___null(Boolean paziente_nascita___not___null) {
            this.paziente_nascita___not___null = paziente_nascita___not___null;
            return this;
        }

        public Builder setPaziente_nascita___in(java.util.List<String> paziente_nascita___in) {
            this.paziente_nascita___in = paziente_nascita___in;
            return this;
        }

        public Builder setPaziente_nascita___not___in(java.util.List<String> paziente_nascita___not___in) {
            this.paziente_nascita___not___in = paziente_nascita___not___in;
            return this;
        }

        public Builder setPaziente_nascita___lt(String paziente_nascita___lt) {
            this.paziente_nascita___lt = paziente_nascita___lt;
            return this;
        }

        public Builder setPaziente_nascita___lte(String paziente_nascita___lte) {
            this.paziente_nascita___lte = paziente_nascita___lte;
            return this;
        }

        public Builder setPaziente_nascita___gt(String paziente_nascita___gt) {
            this.paziente_nascita___gt = paziente_nascita___gt;
            return this;
        }

        public Builder setPaziente_nascita___gte(String paziente_nascita___gte) {
            this.paziente_nascita___gte = paziente_nascita___gte;
            return this;
        }

        public Builder setPosizioni___eq(String posizioni___eq) {
            this.posizioni___eq = posizioni___eq;
            return this;
        }

        public Builder setPosizioni___ne(String posizioni___ne) {
            this.posizioni___ne = posizioni___ne;
            return this;
        }

        public Builder setPosizioni___null(Boolean posizioni___null) {
            this.posizioni___null = posizioni___null;
            return this;
        }

        public Builder setPosizioni___not___null(Boolean posizioni___not___null) {
            this.posizioni___not___null = posizioni___not___null;
            return this;
        }

        public Builder setPosizioni___in(java.util.List<String> posizioni___in) {
            this.posizioni___in = posizioni___in;
            return this;
        }

        public Builder setPosizioni___not___in(java.util.List<String> posizioni___not___in) {
            this.posizioni___not___in = posizioni___not___in;
            return this;
        }

        public Builder setPosizioni___lt(String posizioni___lt) {
            this.posizioni___lt = posizioni___lt;
            return this;
        }

        public Builder setPosizioni___lte(String posizioni___lte) {
            this.posizioni___lte = posizioni___lte;
            return this;
        }

        public Builder setPosizioni___gt(String posizioni___gt) {
            this.posizioni___gt = posizioni___gt;
            return this;
        }

        public Builder setPosizioni___gte(String posizioni___gte) {
            this.posizioni___gte = posizioni___gte;
            return this;
        }

        public Builder setPosizioni___contains(String posizioni___contains) {
            this.posizioni___contains = posizioni___contains;
            return this;
        }

        public Builder setPosizioni___not___contains(String posizioni___not___contains) {
            this.posizioni___not___contains = posizioni___not___contains;
            return this;
        }

        public Builder setPosizioni___starts_with(String posizioni___starts_with) {
            this.posizioni___starts_with = posizioni___starts_with;
            return this;
        }

        public Builder setPosizioni___not___starts_with(String posizioni___not___starts_with) {
            this.posizioni___not___starts_with = posizioni___not___starts_with;
            return this;
        }

        public Builder setPosizioni___ends_with(String posizioni___ends_with) {
            this.posizioni___ends_with = posizioni___ends_with;
            return this;
        }

        public Builder setPosizioni___not___ends_with(String posizioni___not___ends_with) {
            this.posizioni___not___ends_with = posizioni___not___ends_with;
            return this;
        }

        public Builder setProvette_iniziali___eq(Integer provette_iniziali___eq) {
            this.provette_iniziali___eq = provette_iniziali___eq;
            return this;
        }

        public Builder setProvette_iniziali___ne(Integer provette_iniziali___ne) {
            this.provette_iniziali___ne = provette_iniziali___ne;
            return this;
        }

        public Builder setProvette_iniziali___null(Boolean provette_iniziali___null) {
            this.provette_iniziali___null = provette_iniziali___null;
            return this;
        }

        public Builder setProvette_iniziali___not___null(Boolean provette_iniziali___not___null) {
            this.provette_iniziali___not___null = provette_iniziali___not___null;
            return this;
        }

        public Builder setProvette_iniziali___in(java.util.List<Integer> provette_iniziali___in) {
            this.provette_iniziali___in = provette_iniziali___in;
            return this;
        }

        public Builder setProvette_iniziali___not___in(java.util.List<Integer> provette_iniziali___not___in) {
            this.provette_iniziali___not___in = provette_iniziali___not___in;
            return this;
        }

        public Builder setProvette_iniziali___lt(Integer provette_iniziali___lt) {
            this.provette_iniziali___lt = provette_iniziali___lt;
            return this;
        }

        public Builder setProvette_iniziali___lte(Integer provette_iniziali___lte) {
            this.provette_iniziali___lte = provette_iniziali___lte;
            return this;
        }

        public Builder setProvette_iniziali___gt(Integer provette_iniziali___gt) {
            this.provette_iniziali___gt = provette_iniziali___gt;
            return this;
        }

        public Builder setProvette_iniziali___gte(Integer provette_iniziali___gte) {
            this.provette_iniziali___gte = provette_iniziali___gte;
            return this;
        }

        public Builder setProvette_rimanenti___eq(Integer provette_rimanenti___eq) {
            this.provette_rimanenti___eq = provette_rimanenti___eq;
            return this;
        }

        public Builder setProvette_rimanenti___ne(Integer provette_rimanenti___ne) {
            this.provette_rimanenti___ne = provette_rimanenti___ne;
            return this;
        }

        public Builder setProvette_rimanenti___null(Boolean provette_rimanenti___null) {
            this.provette_rimanenti___null = provette_rimanenti___null;
            return this;
        }

        public Builder setProvette_rimanenti___not___null(Boolean provette_rimanenti___not___null) {
            this.provette_rimanenti___not___null = provette_rimanenti___not___null;
            return this;
        }

        public Builder setProvette_rimanenti___in(java.util.List<Integer> provette_rimanenti___in) {
            this.provette_rimanenti___in = provette_rimanenti___in;
            return this;
        }

        public Builder setProvette_rimanenti___not___in(java.util.List<Integer> provette_rimanenti___not___in) {
            this.provette_rimanenti___not___in = provette_rimanenti___not___in;
            return this;
        }

        public Builder setProvette_rimanenti___lt(Integer provette_rimanenti___lt) {
            this.provette_rimanenti___lt = provette_rimanenti___lt;
            return this;
        }

        public Builder setProvette_rimanenti___lte(Integer provette_rimanenti___lte) {
            this.provette_rimanenti___lte = provette_rimanenti___lte;
            return this;
        }

        public Builder setProvette_rimanenti___gt(Integer provette_rimanenti___gt) {
            this.provette_rimanenti___gt = provette_rimanenti___gt;
            return this;
        }

        public Builder setProvette_rimanenti___gte(Integer provette_rimanenti___gte) {
            this.provette_rimanenti___gte = provette_rimanenti___gte;
            return this;
        }

        public Builder setQt___eq(String qt___eq) {
            this.qt___eq = qt___eq;
            return this;
        }

        public Builder setQt___ne(String qt___ne) {
            this.qt___ne = qt___ne;
            return this;
        }

        public Builder setQt___null(Boolean qt___null) {
            this.qt___null = qt___null;
            return this;
        }

        public Builder setQt___not___null(Boolean qt___not___null) {
            this.qt___not___null = qt___not___null;
            return this;
        }

        public Builder setQt___in(java.util.List<String> qt___in) {
            this.qt___in = qt___in;
            return this;
        }

        public Builder setQt___not___in(java.util.List<String> qt___not___in) {
            this.qt___not___in = qt___not___in;
            return this;
        }

        public Builder setQt___lt(String qt___lt) {
            this.qt___lt = qt___lt;
            return this;
        }

        public Builder setQt___lte(String qt___lte) {
            this.qt___lte = qt___lte;
            return this;
        }

        public Builder setQt___gt(String qt___gt) {
            this.qt___gt = qt___gt;
            return this;
        }

        public Builder setQt___gte(String qt___gte) {
            this.qt___gte = qt___gte;
            return this;
        }

        public Builder setQuantita___eq(String quantita___eq) {
            this.quantita___eq = quantita___eq;
            return this;
        }

        public Builder setQuantita___ne(String quantita___ne) {
            this.quantita___ne = quantita___ne;
            return this;
        }

        public Builder setQuantita___null(Boolean quantita___null) {
            this.quantita___null = quantita___null;
            return this;
        }

        public Builder setQuantita___not___null(Boolean quantita___not___null) {
            this.quantita___not___null = quantita___not___null;
            return this;
        }

        public Builder setQuantita___in(java.util.List<String> quantita___in) {
            this.quantita___in = quantita___in;
            return this;
        }

        public Builder setQuantita___not___in(java.util.List<String> quantita___not___in) {
            this.quantita___not___in = quantita___not___in;
            return this;
        }

        public Builder setQuantita___lt(String quantita___lt) {
            this.quantita___lt = quantita___lt;
            return this;
        }

        public Builder setQuantita___lte(String quantita___lte) {
            this.quantita___lte = quantita___lte;
            return this;
        }

        public Builder setQuantita___gt(String quantita___gt) {
            this.quantita___gt = quantita___gt;
            return this;
        }

        public Builder setQuantita___gte(String quantita___gte) {
            this.quantita___gte = quantita___gte;
            return this;
        }

        public Builder setQuantita___contains(String quantita___contains) {
            this.quantita___contains = quantita___contains;
            return this;
        }

        public Builder setQuantita___not___contains(String quantita___not___contains) {
            this.quantita___not___contains = quantita___not___contains;
            return this;
        }

        public Builder setQuantita___starts_with(String quantita___starts_with) {
            this.quantita___starts_with = quantita___starts_with;
            return this;
        }

        public Builder setQuantita___not___starts_with(String quantita___not___starts_with) {
            this.quantita___not___starts_with = quantita___not___starts_with;
            return this;
        }

        public Builder setQuantita___ends_with(String quantita___ends_with) {
            this.quantita___ends_with = quantita___ends_with;
            return this;
        }

        public Builder setQuantita___not___ends_with(String quantita___not___ends_with) {
            this.quantita___not___ends_with = quantita___not___ends_with;
            return this;
        }

        public Builder setRack___eq(String rack___eq) {
            this.rack___eq = rack___eq;
            return this;
        }

        public Builder setRack___ne(String rack___ne) {
            this.rack___ne = rack___ne;
            return this;
        }

        public Builder setRack___null(Boolean rack___null) {
            this.rack___null = rack___null;
            return this;
        }

        public Builder setRack___not___null(Boolean rack___not___null) {
            this.rack___not___null = rack___not___null;
            return this;
        }

        public Builder setRack___in(java.util.List<String> rack___in) {
            this.rack___in = rack___in;
            return this;
        }

        public Builder setRack___not___in(java.util.List<String> rack___not___in) {
            this.rack___not___in = rack___not___in;
            return this;
        }

        public Builder setRack___lt(String rack___lt) {
            this.rack___lt = rack___lt;
            return this;
        }

        public Builder setRack___lte(String rack___lte) {
            this.rack___lte = rack___lte;
            return this;
        }

        public Builder setRack___gt(String rack___gt) {
            this.rack___gt = rack___gt;
            return this;
        }

        public Builder setRack___gte(String rack___gte) {
            this.rack___gte = rack___gte;
            return this;
        }

        public Builder setRack___contains(String rack___contains) {
            this.rack___contains = rack___contains;
            return this;
        }

        public Builder setRack___not___contains(String rack___not___contains) {
            this.rack___not___contains = rack___not___contains;
            return this;
        }

        public Builder setRack___starts_with(String rack___starts_with) {
            this.rack___starts_with = rack___starts_with;
            return this;
        }

        public Builder setRack___not___starts_with(String rack___not___starts_with) {
            this.rack___not___starts_with = rack___not___starts_with;
            return this;
        }

        public Builder setRack___ends_with(String rack___ends_with) {
            this.rack___ends_with = rack___ends_with;
            return this;
        }

        public Builder setRack___not___ends_with(String rack___not___ends_with) {
            this.rack___not___ends_with = rack___not___ends_with;
            return this;
        }

        public Builder setSede_biobanca___eq(String sede_biobanca___eq) {
            this.sede_biobanca___eq = sede_biobanca___eq;
            return this;
        }

        public Builder setSede_biobanca___ne(String sede_biobanca___ne) {
            this.sede_biobanca___ne = sede_biobanca___ne;
            return this;
        }

        public Builder setSede_biobanca___null(Boolean sede_biobanca___null) {
            this.sede_biobanca___null = sede_biobanca___null;
            return this;
        }

        public Builder setSede_biobanca___not___null(Boolean sede_biobanca___not___null) {
            this.sede_biobanca___not___null = sede_biobanca___not___null;
            return this;
        }

        public Builder setSede_biobanca___in(java.util.List<String> sede_biobanca___in) {
            this.sede_biobanca___in = sede_biobanca___in;
            return this;
        }

        public Builder setSede_biobanca___not___in(java.util.List<String> sede_biobanca___not___in) {
            this.sede_biobanca___not___in = sede_biobanca___not___in;
            return this;
        }

        public Builder setSede_biobanca___lt(String sede_biobanca___lt) {
            this.sede_biobanca___lt = sede_biobanca___lt;
            return this;
        }

        public Builder setSede_biobanca___lte(String sede_biobanca___lte) {
            this.sede_biobanca___lte = sede_biobanca___lte;
            return this;
        }

        public Builder setSede_biobanca___gt(String sede_biobanca___gt) {
            this.sede_biobanca___gt = sede_biobanca___gt;
            return this;
        }

        public Builder setSede_biobanca___gte(String sede_biobanca___gte) {
            this.sede_biobanca___gte = sede_biobanca___gte;
            return this;
        }

        public Builder setSede_biobanca___contains(String sede_biobanca___contains) {
            this.sede_biobanca___contains = sede_biobanca___contains;
            return this;
        }

        public Builder setSede_biobanca___not___contains(String sede_biobanca___not___contains) {
            this.sede_biobanca___not___contains = sede_biobanca___not___contains;
            return this;
        }

        public Builder setSede_biobanca___starts_with(String sede_biobanca___starts_with) {
            this.sede_biobanca___starts_with = sede_biobanca___starts_with;
            return this;
        }

        public Builder setSede_biobanca___not___starts_with(String sede_biobanca___not___starts_with) {
            this.sede_biobanca___not___starts_with = sede_biobanca___not___starts_with;
            return this;
        }

        public Builder setSede_biobanca___ends_with(String sede_biobanca___ends_with) {
            this.sede_biobanca___ends_with = sede_biobanca___ends_with;
            return this;
        }

        public Builder setSede_biobanca___not___ends_with(String sede_biobanca___not___ends_with) {
            this.sede_biobanca___not___ends_with = sede_biobanca___not___ends_with;
            return this;
        }

        public Builder setUm___eq(String um___eq) {
            this.um___eq = um___eq;
            return this;
        }

        public Builder setUm___ne(String um___ne) {
            this.um___ne = um___ne;
            return this;
        }

        public Builder setUm___null(Boolean um___null) {
            this.um___null = um___null;
            return this;
        }

        public Builder setUm___not___null(Boolean um___not___null) {
            this.um___not___null = um___not___null;
            return this;
        }

        public Builder setUm___in(java.util.List<String> um___in) {
            this.um___in = um___in;
            return this;
        }

        public Builder setUm___not___in(java.util.List<String> um___not___in) {
            this.um___not___in = um___not___in;
            return this;
        }

        public Builder setUm___lt(String um___lt) {
            this.um___lt = um___lt;
            return this;
        }

        public Builder setUm___lte(String um___lte) {
            this.um___lte = um___lte;
            return this;
        }

        public Builder setUm___gt(String um___gt) {
            this.um___gt = um___gt;
            return this;
        }

        public Builder setUm___gte(String um___gte) {
            this.um___gte = um___gte;
            return this;
        }

        public Builder setUm___contains(String um___contains) {
            this.um___contains = um___contains;
            return this;
        }

        public Builder setUm___not___contains(String um___not___contains) {
            this.um___not___contains = um___not___contains;
            return this;
        }

        public Builder setUm___starts_with(String um___starts_with) {
            this.um___starts_with = um___starts_with;
            return this;
        }

        public Builder setUm___not___starts_with(String um___not___starts_with) {
            this.um___not___starts_with = um___not___starts_with;
            return this;
        }

        public Builder setUm___ends_with(String um___ends_with) {
            this.um___ends_with = um___ends_with;
            return this;
        }

        public Builder setUm___not___ends_with(String um___not___ends_with) {
            this.um___not___ends_with = um___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliCampione_oldFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliCampione_oldFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliCampione_oldFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliCampione_oldFilterDTO build() {
            CliCampione_oldFilterDTO result = new CliCampione_oldFilterDTO();
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
            result.setCampione___eq(this.campione___eq);
            result.setCampione___ne(this.campione___ne);
            result.setCampione___null(this.campione___null);
            result.setCampione___not___null(this.campione___not___null);
            result.setCampione___in(this.campione___in);
            result.setCampione___not___in(this.campione___not___in);
            result.setCampione___lt(this.campione___lt);
            result.setCampione___lte(this.campione___lte);
            result.setCampione___gt(this.campione___gt);
            result.setCampione___gte(this.campione___gte);
            result.setCampione___contains(this.campione___contains);
            result.setCampione___not___contains(this.campione___not___contains);
            result.setCampione___starts_with(this.campione___starts_with);
            result.setCampione___not___starts_with(this.campione___not___starts_with);
            result.setCampione___ends_with(this.campione___ends_with);
            result.setCampione___not___ends_with(this.campione___not___ends_with);
            result.setCentro_icona___eq(this.centro_icona___eq);
            result.setCentro_icona___ne(this.centro_icona___ne);
            result.setCentro_icona___null(this.centro_icona___null);
            result.setCentro_icona___not___null(this.centro_icona___not___null);
            result.setCentro_icona___in(this.centro_icona___in);
            result.setCentro_icona___not___in(this.centro_icona___not___in);
            result.setCentro_icona___lt(this.centro_icona___lt);
            result.setCentro_icona___lte(this.centro_icona___lte);
            result.setCentro_icona___gt(this.centro_icona___gt);
            result.setCentro_icona___gte(this.centro_icona___gte);
            result.setCentro_icona___contains(this.centro_icona___contains);
            result.setCentro_icona___not___contains(this.centro_icona___not___contains);
            result.setCentro_icona___starts_with(this.centro_icona___starts_with);
            result.setCentro_icona___not___starts_with(this.centro_icona___not___starts_with);
            result.setCentro_icona___ends_with(this.centro_icona___ends_with);
            result.setCentro_icona___not___ends_with(this.centro_icona___not___ends_with);
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
            result.setEtichetta___eq(this.etichetta___eq);
            result.setEtichetta___ne(this.etichetta___ne);
            result.setEtichetta___null(this.etichetta___null);
            result.setEtichetta___not___null(this.etichetta___not___null);
            result.setEtichetta___in(this.etichetta___in);
            result.setEtichetta___not___in(this.etichetta___not___in);
            result.setEtichetta___lt(this.etichetta___lt);
            result.setEtichetta___lte(this.etichetta___lte);
            result.setEtichetta___gt(this.etichetta___gt);
            result.setEtichetta___gte(this.etichetta___gte);
            result.setEtichetta___contains(this.etichetta___contains);
            result.setEtichetta___not___contains(this.etichetta___not___contains);
            result.setEtichetta___starts_with(this.etichetta___starts_with);
            result.setEtichetta___not___starts_with(this.etichetta___not___starts_with);
            result.setEtichetta___ends_with(this.etichetta___ends_with);
            result.setEtichetta___not___ends_with(this.etichetta___not___ends_with);
            result.setId_campione___eq(this.id_campione___eq);
            result.setId_campione___ne(this.id_campione___ne);
            result.setId_campione___null(this.id_campione___null);
            result.setId_campione___not___null(this.id_campione___not___null);
            result.setId_campione___in(this.id_campione___in);
            result.setId_campione___not___in(this.id_campione___not___in);
            result.setId_campione___lt(this.id_campione___lt);
            result.setId_campione___lte(this.id_campione___lte);
            result.setId_campione___gt(this.id_campione___gt);
            result.setId_campione___gte(this.id_campione___gte);
            result.setNote_campione___eq(this.note_campione___eq);
            result.setNote_campione___ne(this.note_campione___ne);
            result.setNote_campione___null(this.note_campione___null);
            result.setNote_campione___not___null(this.note_campione___not___null);
            result.setNote_campione___in(this.note_campione___in);
            result.setNote_campione___not___in(this.note_campione___not___in);
            result.setNote_campione___lt(this.note_campione___lt);
            result.setNote_campione___lte(this.note_campione___lte);
            result.setNote_campione___gt(this.note_campione___gt);
            result.setNote_campione___gte(this.note_campione___gte);
            result.setNote_campione___contains(this.note_campione___contains);
            result.setNote_campione___not___contains(this.note_campione___not___contains);
            result.setNote_campione___starts_with(this.note_campione___starts_with);
            result.setNote_campione___not___starts_with(this.note_campione___not___starts_with);
            result.setNote_campione___ends_with(this.note_campione___ends_with);
            result.setNote_campione___not___ends_with(this.note_campione___not___ends_with);
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
            result.setPaziente_hepaicona___eq(this.paziente_hepaicona___eq);
            result.setPaziente_hepaicona___ne(this.paziente_hepaicona___ne);
            result.setPaziente_hepaicona___null(this.paziente_hepaicona___null);
            result.setPaziente_hepaicona___not___null(this.paziente_hepaicona___not___null);
            result.setPaziente_hepaicona___in(this.paziente_hepaicona___in);
            result.setPaziente_hepaicona___not___in(this.paziente_hepaicona___not___in);
            result.setPaziente_hepaicona___lt(this.paziente_hepaicona___lt);
            result.setPaziente_hepaicona___lte(this.paziente_hepaicona___lte);
            result.setPaziente_hepaicona___gt(this.paziente_hepaicona___gt);
            result.setPaziente_hepaicona___gte(this.paziente_hepaicona___gte);
            result.setPaziente_hepaicona___contains(this.paziente_hepaicona___contains);
            result.setPaziente_hepaicona___not___contains(this.paziente_hepaicona___not___contains);
            result.setPaziente_hepaicona___starts_with(this.paziente_hepaicona___starts_with);
            result.setPaziente_hepaicona___not___starts_with(this.paziente_hepaicona___not___starts_with);
            result.setPaziente_hepaicona___ends_with(this.paziente_hepaicona___ends_with);
            result.setPaziente_hepaicona___not___ends_with(this.paziente_hepaicona___not___ends_with);
            result.setPaziente_icona___eq(this.paziente_icona___eq);
            result.setPaziente_icona___ne(this.paziente_icona___ne);
            result.setPaziente_icona___null(this.paziente_icona___null);
            result.setPaziente_icona___not___null(this.paziente_icona___not___null);
            result.setPaziente_icona___in(this.paziente_icona___in);
            result.setPaziente_icona___not___in(this.paziente_icona___not___in);
            result.setPaziente_icona___lt(this.paziente_icona___lt);
            result.setPaziente_icona___lte(this.paziente_icona___lte);
            result.setPaziente_icona___gt(this.paziente_icona___gt);
            result.setPaziente_icona___gte(this.paziente_icona___gte);
            result.setPaziente_icona___contains(this.paziente_icona___contains);
            result.setPaziente_icona___not___contains(this.paziente_icona___not___contains);
            result.setPaziente_icona___starts_with(this.paziente_icona___starts_with);
            result.setPaziente_icona___not___starts_with(this.paziente_icona___not___starts_with);
            result.setPaziente_icona___ends_with(this.paziente_icona___ends_with);
            result.setPaziente_icona___not___ends_with(this.paziente_icona___not___ends_with);
            result.setPaziente_nascita___eq(this.paziente_nascita___eq);
            result.setPaziente_nascita___ne(this.paziente_nascita___ne);
            result.setPaziente_nascita___null(this.paziente_nascita___null);
            result.setPaziente_nascita___not___null(this.paziente_nascita___not___null);
            result.setPaziente_nascita___in(this.paziente_nascita___in);
            result.setPaziente_nascita___not___in(this.paziente_nascita___not___in);
            result.setPaziente_nascita___lt(this.paziente_nascita___lt);
            result.setPaziente_nascita___lte(this.paziente_nascita___lte);
            result.setPaziente_nascita___gt(this.paziente_nascita___gt);
            result.setPaziente_nascita___gte(this.paziente_nascita___gte);
            result.setPosizioni___eq(this.posizioni___eq);
            result.setPosizioni___ne(this.posizioni___ne);
            result.setPosizioni___null(this.posizioni___null);
            result.setPosizioni___not___null(this.posizioni___not___null);
            result.setPosizioni___in(this.posizioni___in);
            result.setPosizioni___not___in(this.posizioni___not___in);
            result.setPosizioni___lt(this.posizioni___lt);
            result.setPosizioni___lte(this.posizioni___lte);
            result.setPosizioni___gt(this.posizioni___gt);
            result.setPosizioni___gte(this.posizioni___gte);
            result.setPosizioni___contains(this.posizioni___contains);
            result.setPosizioni___not___contains(this.posizioni___not___contains);
            result.setPosizioni___starts_with(this.posizioni___starts_with);
            result.setPosizioni___not___starts_with(this.posizioni___not___starts_with);
            result.setPosizioni___ends_with(this.posizioni___ends_with);
            result.setPosizioni___not___ends_with(this.posizioni___not___ends_with);
            result.setProvette_iniziali___eq(this.provette_iniziali___eq);
            result.setProvette_iniziali___ne(this.provette_iniziali___ne);
            result.setProvette_iniziali___null(this.provette_iniziali___null);
            result.setProvette_iniziali___not___null(this.provette_iniziali___not___null);
            result.setProvette_iniziali___in(this.provette_iniziali___in);
            result.setProvette_iniziali___not___in(this.provette_iniziali___not___in);
            result.setProvette_iniziali___lt(this.provette_iniziali___lt);
            result.setProvette_iniziali___lte(this.provette_iniziali___lte);
            result.setProvette_iniziali___gt(this.provette_iniziali___gt);
            result.setProvette_iniziali___gte(this.provette_iniziali___gte);
            result.setProvette_rimanenti___eq(this.provette_rimanenti___eq);
            result.setProvette_rimanenti___ne(this.provette_rimanenti___ne);
            result.setProvette_rimanenti___null(this.provette_rimanenti___null);
            result.setProvette_rimanenti___not___null(this.provette_rimanenti___not___null);
            result.setProvette_rimanenti___in(this.provette_rimanenti___in);
            result.setProvette_rimanenti___not___in(this.provette_rimanenti___not___in);
            result.setProvette_rimanenti___lt(this.provette_rimanenti___lt);
            result.setProvette_rimanenti___lte(this.provette_rimanenti___lte);
            result.setProvette_rimanenti___gt(this.provette_rimanenti___gt);
            result.setProvette_rimanenti___gte(this.provette_rimanenti___gte);
            result.setQt___eq(this.qt___eq);
            result.setQt___ne(this.qt___ne);
            result.setQt___null(this.qt___null);
            result.setQt___not___null(this.qt___not___null);
            result.setQt___in(this.qt___in);
            result.setQt___not___in(this.qt___not___in);
            result.setQt___lt(this.qt___lt);
            result.setQt___lte(this.qt___lte);
            result.setQt___gt(this.qt___gt);
            result.setQt___gte(this.qt___gte);
            result.setQuantita___eq(this.quantita___eq);
            result.setQuantita___ne(this.quantita___ne);
            result.setQuantita___null(this.quantita___null);
            result.setQuantita___not___null(this.quantita___not___null);
            result.setQuantita___in(this.quantita___in);
            result.setQuantita___not___in(this.quantita___not___in);
            result.setQuantita___lt(this.quantita___lt);
            result.setQuantita___lte(this.quantita___lte);
            result.setQuantita___gt(this.quantita___gt);
            result.setQuantita___gte(this.quantita___gte);
            result.setQuantita___contains(this.quantita___contains);
            result.setQuantita___not___contains(this.quantita___not___contains);
            result.setQuantita___starts_with(this.quantita___starts_with);
            result.setQuantita___not___starts_with(this.quantita___not___starts_with);
            result.setQuantita___ends_with(this.quantita___ends_with);
            result.setQuantita___not___ends_with(this.quantita___not___ends_with);
            result.setRack___eq(this.rack___eq);
            result.setRack___ne(this.rack___ne);
            result.setRack___null(this.rack___null);
            result.setRack___not___null(this.rack___not___null);
            result.setRack___in(this.rack___in);
            result.setRack___not___in(this.rack___not___in);
            result.setRack___lt(this.rack___lt);
            result.setRack___lte(this.rack___lte);
            result.setRack___gt(this.rack___gt);
            result.setRack___gte(this.rack___gte);
            result.setRack___contains(this.rack___contains);
            result.setRack___not___contains(this.rack___not___contains);
            result.setRack___starts_with(this.rack___starts_with);
            result.setRack___not___starts_with(this.rack___not___starts_with);
            result.setRack___ends_with(this.rack___ends_with);
            result.setRack___not___ends_with(this.rack___not___ends_with);
            result.setSede_biobanca___eq(this.sede_biobanca___eq);
            result.setSede_biobanca___ne(this.sede_biobanca___ne);
            result.setSede_biobanca___null(this.sede_biobanca___null);
            result.setSede_biobanca___not___null(this.sede_biobanca___not___null);
            result.setSede_biobanca___in(this.sede_biobanca___in);
            result.setSede_biobanca___not___in(this.sede_biobanca___not___in);
            result.setSede_biobanca___lt(this.sede_biobanca___lt);
            result.setSede_biobanca___lte(this.sede_biobanca___lte);
            result.setSede_biobanca___gt(this.sede_biobanca___gt);
            result.setSede_biobanca___gte(this.sede_biobanca___gte);
            result.setSede_biobanca___contains(this.sede_biobanca___contains);
            result.setSede_biobanca___not___contains(this.sede_biobanca___not___contains);
            result.setSede_biobanca___starts_with(this.sede_biobanca___starts_with);
            result.setSede_biobanca___not___starts_with(this.sede_biobanca___not___starts_with);
            result.setSede_biobanca___ends_with(this.sede_biobanca___ends_with);
            result.setSede_biobanca___not___ends_with(this.sede_biobanca___not___ends_with);
            result.setUm___eq(this.um___eq);
            result.setUm___ne(this.um___ne);
            result.setUm___null(this.um___null);
            result.setUm___not___null(this.um___not___null);
            result.setUm___in(this.um___in);
            result.setUm___not___in(this.um___not___in);
            result.setUm___lt(this.um___lt);
            result.setUm___lte(this.um___lte);
            result.setUm___gt(this.um___gt);
            result.setUm___gte(this.um___gte);
            result.setUm___contains(this.um___contains);
            result.setUm___not___contains(this.um___not___contains);
            result.setUm___starts_with(this.um___starts_with);
            result.setUm___not___starts_with(this.um___not___starts_with);
            result.setUm___ends_with(this.um___ends_with);
            result.setUm___not___ends_with(this.um___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
