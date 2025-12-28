package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Anamnesi.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliAnamnesiFilterDTO implements java.io.Serializable {

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
    private Boolean altro_luogo___eq;
    private Boolean altro_luogo___ne;
    private Boolean altro_luogo___null;
    private Boolean altro_luogo___not___null;
    private String altro_luogo_test_HIV___eq;
    private String altro_luogo_test_HIV___ne;
    private Boolean altro_luogo_test_HIV___null;
    private Boolean altro_luogo_test_HIV___not___null;
    private java.util.List<String> altro_luogo_test_HIV___in;
    private java.util.List<String> altro_luogo_test_HIV___not___in;
    private String altro_luogo_test_HIV___lt;
    private String altro_luogo_test_HIV___lte;
    private String altro_luogo_test_HIV___gt;
    private String altro_luogo_test_HIV___gte;
    private String altro_luogo_test_HIV___contains;
    private String altro_luogo_test_HIV___not___contains;
    private String altro_luogo_test_HIV___starts_with;
    private String altro_luogo_test_HIV___not___starts_with;
    private String altro_luogo_test_HIV___ends_with;
    private String altro_luogo_test_HIV___not___ends_with;
    private Integer anni_fumo_pregresso___eq;
    private Integer anni_fumo_pregresso___ne;
    private Boolean anni_fumo_pregresso___null;
    private Boolean anni_fumo_pregresso___not___null;
    private java.util.List<Integer> anni_fumo_pregresso___in;
    private java.util.List<Integer> anni_fumo_pregresso___not___in;
    private Integer anni_fumo_pregresso___lt;
    private Integer anni_fumo_pregresso___lte;
    private Integer anni_fumo_pregresso___gt;
    private Integer anni_fumo_pregresso___gte;
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
    private String data_enrol___eq;
    private String data_enrol___ne;
    private Boolean data_enrol___null;
    private Boolean data_enrol___not___null;
    private java.util.List<String> data_enrol___in;
    private java.util.List<String> data_enrol___not___in;
    private String data_enrol___lt;
    private String data_enrol___lte;
    private String data_enrol___gt;
    private String data_enrol___gte;
    private String data_prima_prep___eq;
    private String data_prima_prep___ne;
    private Boolean data_prima_prep___null;
    private Boolean data_prima_prep___not___null;
    private java.util.List<String> data_prima_prep___in;
    private java.util.List<String> data_prima_prep___not___in;
    private String data_prima_prep___lt;
    private String data_prima_prep___lte;
    private String data_prima_prep___gt;
    private String data_prima_prep___gte;
    private String data_primo_riscontro_HIV___eq;
    private String data_primo_riscontro_HIV___ne;
    private Boolean data_primo_riscontro_HIV___null;
    private Boolean data_primo_riscontro_HIV___not___null;
    private java.util.List<String> data_primo_riscontro_HIV___in;
    private java.util.List<String> data_primo_riscontro_HIV___not___in;
    private String data_primo_riscontro_HIV___lt;
    private String data_primo_riscontro_HIV___lte;
    private String data_primo_riscontro_HIV___gt;
    private String data_primo_riscontro_HIV___gte;
    private String data_sieroconversione___eq;
    private String data_sieroconversione___ne;
    private Boolean data_sieroconversione___null;
    private Boolean data_sieroconversione___not___null;
    private java.util.List<String> data_sieroconversione___in;
    private java.util.List<String> data_sieroconversione___not___in;
    private String data_sieroconversione___lt;
    private String data_sieroconversione___lte;
    private String data_sieroconversione___gt;
    private String data_sieroconversione___gte;
    private String data_ultima_prep___eq;
    private String data_ultima_prep___ne;
    private Boolean data_ultima_prep___null;
    private Boolean data_ultima_prep___not___null;
    private java.util.List<String> data_ultima_prep___in;
    private java.util.List<String> data_ultima_prep___not___in;
    private String data_ultima_prep___lt;
    private String data_ultima_prep___lte;
    private String data_ultima_prep___gt;
    private String data_ultima_prep___gte;
    private String data_ultimo_test_negativo___eq;
    private String data_ultimo_test_negativo___ne;
    private Boolean data_ultimo_test_negativo___null;
    private Boolean data_ultimo_test_negativo___not___null;
    private java.util.List<String> data_ultimo_test_negativo___in;
    private java.util.List<String> data_ultimo_test_negativo___not___in;
    private String data_ultimo_test_negativo___lt;
    private String data_ultimo_test_negativo___lte;
    private String data_ultimo_test_negativo___gt;
    private String data_ultimo_test_negativo___gte;
    private String familiarita_cardiovascolare___eq;
    private String familiarita_cardiovascolare___ne;
    private Boolean familiarita_cardiovascolare___null;
    private Boolean familiarita_cardiovascolare___not___null;
    private java.util.List<String> familiarita_cardiovascolare___in;
    private java.util.List<String> familiarita_cardiovascolare___not___in;
    private String familiarita_cardiovascolare___lt;
    private String familiarita_cardiovascolare___lte;
    private String familiarita_cardiovascolare___gt;
    private String familiarita_cardiovascolare___gte;
    private String familiarita_cardiovascolare___contains;
    private String familiarita_cardiovascolare___not___contains;
    private String familiarita_cardiovascolare___starts_with;
    private String familiarita_cardiovascolare___not___starts_with;
    private String familiarita_cardiovascolare___ends_with;
    private String familiarita_cardiovascolare___not___ends_with;
    private Boolean fumatore___eq;
    private Boolean fumatore___ne;
    private Boolean fumatore___null;
    private Boolean fumatore___not___null;
    private Boolean infezione_acuta___eq;
    private Boolean infezione_acuta___ne;
    private Boolean infezione_acuta___null;
    private Boolean infezione_acuta___not___null;
    private String paziente___eq;
    private String paziente___ne;
    private Boolean paziente___null;
    private Boolean paziente___not___null;
    private java.util.List<String> paziente___in;
    private java.util.List<String> paziente___not___in;
    private String paziente___lt;
    private String paziente___lte;
    private String paziente___gt;
    private String paziente___gte;
    private String paziente___contains;
    private String paziente___not___contains;
    private String paziente___starts_with;
    private String paziente___not___starts_with;
    private String paziente___ends_with;
    private String paziente___not___ends_with;
    private Boolean prep___eq;
    private Boolean prep___ne;
    private Boolean prep___null;
    private Boolean prep___not___null;
    private Boolean prep_quotidiana___eq;
    private Boolean prep_quotidiana___ne;
    private Boolean prep_quotidiana___null;
    private Boolean prep_quotidiana___not___null;
    private String scolarita___eq;
    private String scolarita___ne;
    private Boolean scolarita___null;
    private Boolean scolarita___not___null;
    private java.util.List<String> scolarita___in;
    private java.util.List<String> scolarita___not___in;
    private String scolarita___lt;
    private String scolarita___lte;
    private String scolarita___gt;
    private String scolarita___gte;
    private String scolarita___contains;
    private String scolarita___not___contains;
    private String scolarita___starts_with;
    private String scolarita___not___starts_with;
    private String scolarita___ends_with;
    private String scolarita___not___ends_with;
    private String team___eq;
    private String team___ne;
    private Boolean team___null;
    private Boolean team___not___null;
    private java.util.List<String> team___in;
    private java.util.List<String> team___not___in;
    private String team___lt;
    private String team___lte;
    private String team___gt;
    private String team___gte;
    private String team___contains;
    private String team___not___contains;
    private String team___starts_with;
    private String team___not___starts_with;
    private String team___ends_with;
    private String team___not___ends_with;
    private java.util.List<CliAnamnesiFilterDTO> AND;
    private java.util.List<CliAnamnesiFilterDTO> OR;
    private CliAnamnesiFilterDTO NOT;

    public CliAnamnesiFilterDTO() {
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

    public Boolean getAltro_luogo___eq() {
        return altro_luogo___eq;
    }
    public void setAltro_luogo___eq(Boolean altro_luogo___eq) {
        this.altro_luogo___eq = altro_luogo___eq;
    }

    public Boolean getAltro_luogo___ne() {
        return altro_luogo___ne;
    }
    public void setAltro_luogo___ne(Boolean altro_luogo___ne) {
        this.altro_luogo___ne = altro_luogo___ne;
    }

    public Boolean getAltro_luogo___null() {
        return altro_luogo___null;
    }
    public void setAltro_luogo___null(Boolean altro_luogo___null) {
        this.altro_luogo___null = altro_luogo___null;
    }

    public Boolean getAltro_luogo___not___null() {
        return altro_luogo___not___null;
    }
    public void setAltro_luogo___not___null(Boolean altro_luogo___not___null) {
        this.altro_luogo___not___null = altro_luogo___not___null;
    }

    public String getAltro_luogo_test_HIV___eq() {
        return altro_luogo_test_HIV___eq;
    }
    public void setAltro_luogo_test_HIV___eq(String altro_luogo_test_HIV___eq) {
        this.altro_luogo_test_HIV___eq = altro_luogo_test_HIV___eq;
    }

    public String getAltro_luogo_test_HIV___ne() {
        return altro_luogo_test_HIV___ne;
    }
    public void setAltro_luogo_test_HIV___ne(String altro_luogo_test_HIV___ne) {
        this.altro_luogo_test_HIV___ne = altro_luogo_test_HIV___ne;
    }

    public Boolean getAltro_luogo_test_HIV___null() {
        return altro_luogo_test_HIV___null;
    }
    public void setAltro_luogo_test_HIV___null(Boolean altro_luogo_test_HIV___null) {
        this.altro_luogo_test_HIV___null = altro_luogo_test_HIV___null;
    }

    public Boolean getAltro_luogo_test_HIV___not___null() {
        return altro_luogo_test_HIV___not___null;
    }
    public void setAltro_luogo_test_HIV___not___null(Boolean altro_luogo_test_HIV___not___null) {
        this.altro_luogo_test_HIV___not___null = altro_luogo_test_HIV___not___null;
    }

    public java.util.List<String> getAltro_luogo_test_HIV___in() {
        return altro_luogo_test_HIV___in;
    }
    public void setAltro_luogo_test_HIV___in(java.util.List<String> altro_luogo_test_HIV___in) {
        this.altro_luogo_test_HIV___in = altro_luogo_test_HIV___in;
    }

    public java.util.List<String> getAltro_luogo_test_HIV___not___in() {
        return altro_luogo_test_HIV___not___in;
    }
    public void setAltro_luogo_test_HIV___not___in(java.util.List<String> altro_luogo_test_HIV___not___in) {
        this.altro_luogo_test_HIV___not___in = altro_luogo_test_HIV___not___in;
    }

    public String getAltro_luogo_test_HIV___lt() {
        return altro_luogo_test_HIV___lt;
    }
    public void setAltro_luogo_test_HIV___lt(String altro_luogo_test_HIV___lt) {
        this.altro_luogo_test_HIV___lt = altro_luogo_test_HIV___lt;
    }

    public String getAltro_luogo_test_HIV___lte() {
        return altro_luogo_test_HIV___lte;
    }
    public void setAltro_luogo_test_HIV___lte(String altro_luogo_test_HIV___lte) {
        this.altro_luogo_test_HIV___lte = altro_luogo_test_HIV___lte;
    }

    public String getAltro_luogo_test_HIV___gt() {
        return altro_luogo_test_HIV___gt;
    }
    public void setAltro_luogo_test_HIV___gt(String altro_luogo_test_HIV___gt) {
        this.altro_luogo_test_HIV___gt = altro_luogo_test_HIV___gt;
    }

    public String getAltro_luogo_test_HIV___gte() {
        return altro_luogo_test_HIV___gte;
    }
    public void setAltro_luogo_test_HIV___gte(String altro_luogo_test_HIV___gte) {
        this.altro_luogo_test_HIV___gte = altro_luogo_test_HIV___gte;
    }

    public String getAltro_luogo_test_HIV___contains() {
        return altro_luogo_test_HIV___contains;
    }
    public void setAltro_luogo_test_HIV___contains(String altro_luogo_test_HIV___contains) {
        this.altro_luogo_test_HIV___contains = altro_luogo_test_HIV___contains;
    }

    public String getAltro_luogo_test_HIV___not___contains() {
        return altro_luogo_test_HIV___not___contains;
    }
    public void setAltro_luogo_test_HIV___not___contains(String altro_luogo_test_HIV___not___contains) {
        this.altro_luogo_test_HIV___not___contains = altro_luogo_test_HIV___not___contains;
    }

    public String getAltro_luogo_test_HIV___starts_with() {
        return altro_luogo_test_HIV___starts_with;
    }
    public void setAltro_luogo_test_HIV___starts_with(String altro_luogo_test_HIV___starts_with) {
        this.altro_luogo_test_HIV___starts_with = altro_luogo_test_HIV___starts_with;
    }

    public String getAltro_luogo_test_HIV___not___starts_with() {
        return altro_luogo_test_HIV___not___starts_with;
    }
    public void setAltro_luogo_test_HIV___not___starts_with(String altro_luogo_test_HIV___not___starts_with) {
        this.altro_luogo_test_HIV___not___starts_with = altro_luogo_test_HIV___not___starts_with;
    }

    public String getAltro_luogo_test_HIV___ends_with() {
        return altro_luogo_test_HIV___ends_with;
    }
    public void setAltro_luogo_test_HIV___ends_with(String altro_luogo_test_HIV___ends_with) {
        this.altro_luogo_test_HIV___ends_with = altro_luogo_test_HIV___ends_with;
    }

    public String getAltro_luogo_test_HIV___not___ends_with() {
        return altro_luogo_test_HIV___not___ends_with;
    }
    public void setAltro_luogo_test_HIV___not___ends_with(String altro_luogo_test_HIV___not___ends_with) {
        this.altro_luogo_test_HIV___not___ends_with = altro_luogo_test_HIV___not___ends_with;
    }

    public Integer getAnni_fumo_pregresso___eq() {
        return anni_fumo_pregresso___eq;
    }
    public void setAnni_fumo_pregresso___eq(Integer anni_fumo_pregresso___eq) {
        this.anni_fumo_pregresso___eq = anni_fumo_pregresso___eq;
    }

    public Integer getAnni_fumo_pregresso___ne() {
        return anni_fumo_pregresso___ne;
    }
    public void setAnni_fumo_pregresso___ne(Integer anni_fumo_pregresso___ne) {
        this.anni_fumo_pregresso___ne = anni_fumo_pregresso___ne;
    }

    public Boolean getAnni_fumo_pregresso___null() {
        return anni_fumo_pregresso___null;
    }
    public void setAnni_fumo_pregresso___null(Boolean anni_fumo_pregresso___null) {
        this.anni_fumo_pregresso___null = anni_fumo_pregresso___null;
    }

    public Boolean getAnni_fumo_pregresso___not___null() {
        return anni_fumo_pregresso___not___null;
    }
    public void setAnni_fumo_pregresso___not___null(Boolean anni_fumo_pregresso___not___null) {
        this.anni_fumo_pregresso___not___null = anni_fumo_pregresso___not___null;
    }

    public java.util.List<Integer> getAnni_fumo_pregresso___in() {
        return anni_fumo_pregresso___in;
    }
    public void setAnni_fumo_pregresso___in(java.util.List<Integer> anni_fumo_pregresso___in) {
        this.anni_fumo_pregresso___in = anni_fumo_pregresso___in;
    }

    public java.util.List<Integer> getAnni_fumo_pregresso___not___in() {
        return anni_fumo_pregresso___not___in;
    }
    public void setAnni_fumo_pregresso___not___in(java.util.List<Integer> anni_fumo_pregresso___not___in) {
        this.anni_fumo_pregresso___not___in = anni_fumo_pregresso___not___in;
    }

    public Integer getAnni_fumo_pregresso___lt() {
        return anni_fumo_pregresso___lt;
    }
    public void setAnni_fumo_pregresso___lt(Integer anni_fumo_pregresso___lt) {
        this.anni_fumo_pregresso___lt = anni_fumo_pregresso___lt;
    }

    public Integer getAnni_fumo_pregresso___lte() {
        return anni_fumo_pregresso___lte;
    }
    public void setAnni_fumo_pregresso___lte(Integer anni_fumo_pregresso___lte) {
        this.anni_fumo_pregresso___lte = anni_fumo_pregresso___lte;
    }

    public Integer getAnni_fumo_pregresso___gt() {
        return anni_fumo_pregresso___gt;
    }
    public void setAnni_fumo_pregresso___gt(Integer anni_fumo_pregresso___gt) {
        this.anni_fumo_pregresso___gt = anni_fumo_pregresso___gt;
    }

    public Integer getAnni_fumo_pregresso___gte() {
        return anni_fumo_pregresso___gte;
    }
    public void setAnni_fumo_pregresso___gte(Integer anni_fumo_pregresso___gte) {
        this.anni_fumo_pregresso___gte = anni_fumo_pregresso___gte;
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

    public String getData_enrol___eq() {
        return data_enrol___eq;
    }
    public void setData_enrol___eq(String data_enrol___eq) {
        this.data_enrol___eq = data_enrol___eq;
    }

    public String getData_enrol___ne() {
        return data_enrol___ne;
    }
    public void setData_enrol___ne(String data_enrol___ne) {
        this.data_enrol___ne = data_enrol___ne;
    }

    public Boolean getData_enrol___null() {
        return data_enrol___null;
    }
    public void setData_enrol___null(Boolean data_enrol___null) {
        this.data_enrol___null = data_enrol___null;
    }

    public Boolean getData_enrol___not___null() {
        return data_enrol___not___null;
    }
    public void setData_enrol___not___null(Boolean data_enrol___not___null) {
        this.data_enrol___not___null = data_enrol___not___null;
    }

    public java.util.List<String> getData_enrol___in() {
        return data_enrol___in;
    }
    public void setData_enrol___in(java.util.List<String> data_enrol___in) {
        this.data_enrol___in = data_enrol___in;
    }

    public java.util.List<String> getData_enrol___not___in() {
        return data_enrol___not___in;
    }
    public void setData_enrol___not___in(java.util.List<String> data_enrol___not___in) {
        this.data_enrol___not___in = data_enrol___not___in;
    }

    public String getData_enrol___lt() {
        return data_enrol___lt;
    }
    public void setData_enrol___lt(String data_enrol___lt) {
        this.data_enrol___lt = data_enrol___lt;
    }

    public String getData_enrol___lte() {
        return data_enrol___lte;
    }
    public void setData_enrol___lte(String data_enrol___lte) {
        this.data_enrol___lte = data_enrol___lte;
    }

    public String getData_enrol___gt() {
        return data_enrol___gt;
    }
    public void setData_enrol___gt(String data_enrol___gt) {
        this.data_enrol___gt = data_enrol___gt;
    }

    public String getData_enrol___gte() {
        return data_enrol___gte;
    }
    public void setData_enrol___gte(String data_enrol___gte) {
        this.data_enrol___gte = data_enrol___gte;
    }

    public String getData_prima_prep___eq() {
        return data_prima_prep___eq;
    }
    public void setData_prima_prep___eq(String data_prima_prep___eq) {
        this.data_prima_prep___eq = data_prima_prep___eq;
    }

    public String getData_prima_prep___ne() {
        return data_prima_prep___ne;
    }
    public void setData_prima_prep___ne(String data_prima_prep___ne) {
        this.data_prima_prep___ne = data_prima_prep___ne;
    }

    public Boolean getData_prima_prep___null() {
        return data_prima_prep___null;
    }
    public void setData_prima_prep___null(Boolean data_prima_prep___null) {
        this.data_prima_prep___null = data_prima_prep___null;
    }

    public Boolean getData_prima_prep___not___null() {
        return data_prima_prep___not___null;
    }
    public void setData_prima_prep___not___null(Boolean data_prima_prep___not___null) {
        this.data_prima_prep___not___null = data_prima_prep___not___null;
    }

    public java.util.List<String> getData_prima_prep___in() {
        return data_prima_prep___in;
    }
    public void setData_prima_prep___in(java.util.List<String> data_prima_prep___in) {
        this.data_prima_prep___in = data_prima_prep___in;
    }

    public java.util.List<String> getData_prima_prep___not___in() {
        return data_prima_prep___not___in;
    }
    public void setData_prima_prep___not___in(java.util.List<String> data_prima_prep___not___in) {
        this.data_prima_prep___not___in = data_prima_prep___not___in;
    }

    public String getData_prima_prep___lt() {
        return data_prima_prep___lt;
    }
    public void setData_prima_prep___lt(String data_prima_prep___lt) {
        this.data_prima_prep___lt = data_prima_prep___lt;
    }

    public String getData_prima_prep___lte() {
        return data_prima_prep___lte;
    }
    public void setData_prima_prep___lte(String data_prima_prep___lte) {
        this.data_prima_prep___lte = data_prima_prep___lte;
    }

    public String getData_prima_prep___gt() {
        return data_prima_prep___gt;
    }
    public void setData_prima_prep___gt(String data_prima_prep___gt) {
        this.data_prima_prep___gt = data_prima_prep___gt;
    }

    public String getData_prima_prep___gte() {
        return data_prima_prep___gte;
    }
    public void setData_prima_prep___gte(String data_prima_prep___gte) {
        this.data_prima_prep___gte = data_prima_prep___gte;
    }

    public String getData_primo_riscontro_HIV___eq() {
        return data_primo_riscontro_HIV___eq;
    }
    public void setData_primo_riscontro_HIV___eq(String data_primo_riscontro_HIV___eq) {
        this.data_primo_riscontro_HIV___eq = data_primo_riscontro_HIV___eq;
    }

    public String getData_primo_riscontro_HIV___ne() {
        return data_primo_riscontro_HIV___ne;
    }
    public void setData_primo_riscontro_HIV___ne(String data_primo_riscontro_HIV___ne) {
        this.data_primo_riscontro_HIV___ne = data_primo_riscontro_HIV___ne;
    }

    public Boolean getData_primo_riscontro_HIV___null() {
        return data_primo_riscontro_HIV___null;
    }
    public void setData_primo_riscontro_HIV___null(Boolean data_primo_riscontro_HIV___null) {
        this.data_primo_riscontro_HIV___null = data_primo_riscontro_HIV___null;
    }

    public Boolean getData_primo_riscontro_HIV___not___null() {
        return data_primo_riscontro_HIV___not___null;
    }
    public void setData_primo_riscontro_HIV___not___null(Boolean data_primo_riscontro_HIV___not___null) {
        this.data_primo_riscontro_HIV___not___null = data_primo_riscontro_HIV___not___null;
    }

    public java.util.List<String> getData_primo_riscontro_HIV___in() {
        return data_primo_riscontro_HIV___in;
    }
    public void setData_primo_riscontro_HIV___in(java.util.List<String> data_primo_riscontro_HIV___in) {
        this.data_primo_riscontro_HIV___in = data_primo_riscontro_HIV___in;
    }

    public java.util.List<String> getData_primo_riscontro_HIV___not___in() {
        return data_primo_riscontro_HIV___not___in;
    }
    public void setData_primo_riscontro_HIV___not___in(java.util.List<String> data_primo_riscontro_HIV___not___in) {
        this.data_primo_riscontro_HIV___not___in = data_primo_riscontro_HIV___not___in;
    }

    public String getData_primo_riscontro_HIV___lt() {
        return data_primo_riscontro_HIV___lt;
    }
    public void setData_primo_riscontro_HIV___lt(String data_primo_riscontro_HIV___lt) {
        this.data_primo_riscontro_HIV___lt = data_primo_riscontro_HIV___lt;
    }

    public String getData_primo_riscontro_HIV___lte() {
        return data_primo_riscontro_HIV___lte;
    }
    public void setData_primo_riscontro_HIV___lte(String data_primo_riscontro_HIV___lte) {
        this.data_primo_riscontro_HIV___lte = data_primo_riscontro_HIV___lte;
    }

    public String getData_primo_riscontro_HIV___gt() {
        return data_primo_riscontro_HIV___gt;
    }
    public void setData_primo_riscontro_HIV___gt(String data_primo_riscontro_HIV___gt) {
        this.data_primo_riscontro_HIV___gt = data_primo_riscontro_HIV___gt;
    }

    public String getData_primo_riscontro_HIV___gte() {
        return data_primo_riscontro_HIV___gte;
    }
    public void setData_primo_riscontro_HIV___gte(String data_primo_riscontro_HIV___gte) {
        this.data_primo_riscontro_HIV___gte = data_primo_riscontro_HIV___gte;
    }

    public String getData_sieroconversione___eq() {
        return data_sieroconversione___eq;
    }
    public void setData_sieroconversione___eq(String data_sieroconversione___eq) {
        this.data_sieroconversione___eq = data_sieroconversione___eq;
    }

    public String getData_sieroconversione___ne() {
        return data_sieroconversione___ne;
    }
    public void setData_sieroconversione___ne(String data_sieroconversione___ne) {
        this.data_sieroconversione___ne = data_sieroconversione___ne;
    }

    public Boolean getData_sieroconversione___null() {
        return data_sieroconversione___null;
    }
    public void setData_sieroconversione___null(Boolean data_sieroconversione___null) {
        this.data_sieroconversione___null = data_sieroconversione___null;
    }

    public Boolean getData_sieroconversione___not___null() {
        return data_sieroconversione___not___null;
    }
    public void setData_sieroconversione___not___null(Boolean data_sieroconversione___not___null) {
        this.data_sieroconversione___not___null = data_sieroconversione___not___null;
    }

    public java.util.List<String> getData_sieroconversione___in() {
        return data_sieroconversione___in;
    }
    public void setData_sieroconversione___in(java.util.List<String> data_sieroconversione___in) {
        this.data_sieroconversione___in = data_sieroconversione___in;
    }

    public java.util.List<String> getData_sieroconversione___not___in() {
        return data_sieroconversione___not___in;
    }
    public void setData_sieroconversione___not___in(java.util.List<String> data_sieroconversione___not___in) {
        this.data_sieroconversione___not___in = data_sieroconversione___not___in;
    }

    public String getData_sieroconversione___lt() {
        return data_sieroconversione___lt;
    }
    public void setData_sieroconversione___lt(String data_sieroconversione___lt) {
        this.data_sieroconversione___lt = data_sieroconversione___lt;
    }

    public String getData_sieroconversione___lte() {
        return data_sieroconversione___lte;
    }
    public void setData_sieroconversione___lte(String data_sieroconversione___lte) {
        this.data_sieroconversione___lte = data_sieroconversione___lte;
    }

    public String getData_sieroconversione___gt() {
        return data_sieroconversione___gt;
    }
    public void setData_sieroconversione___gt(String data_sieroconversione___gt) {
        this.data_sieroconversione___gt = data_sieroconversione___gt;
    }

    public String getData_sieroconversione___gte() {
        return data_sieroconversione___gte;
    }
    public void setData_sieroconversione___gte(String data_sieroconversione___gte) {
        this.data_sieroconversione___gte = data_sieroconversione___gte;
    }

    public String getData_ultima_prep___eq() {
        return data_ultima_prep___eq;
    }
    public void setData_ultima_prep___eq(String data_ultima_prep___eq) {
        this.data_ultima_prep___eq = data_ultima_prep___eq;
    }

    public String getData_ultima_prep___ne() {
        return data_ultima_prep___ne;
    }
    public void setData_ultima_prep___ne(String data_ultima_prep___ne) {
        this.data_ultima_prep___ne = data_ultima_prep___ne;
    }

    public Boolean getData_ultima_prep___null() {
        return data_ultima_prep___null;
    }
    public void setData_ultima_prep___null(Boolean data_ultima_prep___null) {
        this.data_ultima_prep___null = data_ultima_prep___null;
    }

    public Boolean getData_ultima_prep___not___null() {
        return data_ultima_prep___not___null;
    }
    public void setData_ultima_prep___not___null(Boolean data_ultima_prep___not___null) {
        this.data_ultima_prep___not___null = data_ultima_prep___not___null;
    }

    public java.util.List<String> getData_ultima_prep___in() {
        return data_ultima_prep___in;
    }
    public void setData_ultima_prep___in(java.util.List<String> data_ultima_prep___in) {
        this.data_ultima_prep___in = data_ultima_prep___in;
    }

    public java.util.List<String> getData_ultima_prep___not___in() {
        return data_ultima_prep___not___in;
    }
    public void setData_ultima_prep___not___in(java.util.List<String> data_ultima_prep___not___in) {
        this.data_ultima_prep___not___in = data_ultima_prep___not___in;
    }

    public String getData_ultima_prep___lt() {
        return data_ultima_prep___lt;
    }
    public void setData_ultima_prep___lt(String data_ultima_prep___lt) {
        this.data_ultima_prep___lt = data_ultima_prep___lt;
    }

    public String getData_ultima_prep___lte() {
        return data_ultima_prep___lte;
    }
    public void setData_ultima_prep___lte(String data_ultima_prep___lte) {
        this.data_ultima_prep___lte = data_ultima_prep___lte;
    }

    public String getData_ultima_prep___gt() {
        return data_ultima_prep___gt;
    }
    public void setData_ultima_prep___gt(String data_ultima_prep___gt) {
        this.data_ultima_prep___gt = data_ultima_prep___gt;
    }

    public String getData_ultima_prep___gte() {
        return data_ultima_prep___gte;
    }
    public void setData_ultima_prep___gte(String data_ultima_prep___gte) {
        this.data_ultima_prep___gte = data_ultima_prep___gte;
    }

    public String getData_ultimo_test_negativo___eq() {
        return data_ultimo_test_negativo___eq;
    }
    public void setData_ultimo_test_negativo___eq(String data_ultimo_test_negativo___eq) {
        this.data_ultimo_test_negativo___eq = data_ultimo_test_negativo___eq;
    }

    public String getData_ultimo_test_negativo___ne() {
        return data_ultimo_test_negativo___ne;
    }
    public void setData_ultimo_test_negativo___ne(String data_ultimo_test_negativo___ne) {
        this.data_ultimo_test_negativo___ne = data_ultimo_test_negativo___ne;
    }

    public Boolean getData_ultimo_test_negativo___null() {
        return data_ultimo_test_negativo___null;
    }
    public void setData_ultimo_test_negativo___null(Boolean data_ultimo_test_negativo___null) {
        this.data_ultimo_test_negativo___null = data_ultimo_test_negativo___null;
    }

    public Boolean getData_ultimo_test_negativo___not___null() {
        return data_ultimo_test_negativo___not___null;
    }
    public void setData_ultimo_test_negativo___not___null(Boolean data_ultimo_test_negativo___not___null) {
        this.data_ultimo_test_negativo___not___null = data_ultimo_test_negativo___not___null;
    }

    public java.util.List<String> getData_ultimo_test_negativo___in() {
        return data_ultimo_test_negativo___in;
    }
    public void setData_ultimo_test_negativo___in(java.util.List<String> data_ultimo_test_negativo___in) {
        this.data_ultimo_test_negativo___in = data_ultimo_test_negativo___in;
    }

    public java.util.List<String> getData_ultimo_test_negativo___not___in() {
        return data_ultimo_test_negativo___not___in;
    }
    public void setData_ultimo_test_negativo___not___in(java.util.List<String> data_ultimo_test_negativo___not___in) {
        this.data_ultimo_test_negativo___not___in = data_ultimo_test_negativo___not___in;
    }

    public String getData_ultimo_test_negativo___lt() {
        return data_ultimo_test_negativo___lt;
    }
    public void setData_ultimo_test_negativo___lt(String data_ultimo_test_negativo___lt) {
        this.data_ultimo_test_negativo___lt = data_ultimo_test_negativo___lt;
    }

    public String getData_ultimo_test_negativo___lte() {
        return data_ultimo_test_negativo___lte;
    }
    public void setData_ultimo_test_negativo___lte(String data_ultimo_test_negativo___lte) {
        this.data_ultimo_test_negativo___lte = data_ultimo_test_negativo___lte;
    }

    public String getData_ultimo_test_negativo___gt() {
        return data_ultimo_test_negativo___gt;
    }
    public void setData_ultimo_test_negativo___gt(String data_ultimo_test_negativo___gt) {
        this.data_ultimo_test_negativo___gt = data_ultimo_test_negativo___gt;
    }

    public String getData_ultimo_test_negativo___gte() {
        return data_ultimo_test_negativo___gte;
    }
    public void setData_ultimo_test_negativo___gte(String data_ultimo_test_negativo___gte) {
        this.data_ultimo_test_negativo___gte = data_ultimo_test_negativo___gte;
    }

    public String getFamiliarita_cardiovascolare___eq() {
        return familiarita_cardiovascolare___eq;
    }
    public void setFamiliarita_cardiovascolare___eq(String familiarita_cardiovascolare___eq) {
        this.familiarita_cardiovascolare___eq = familiarita_cardiovascolare___eq;
    }

    public String getFamiliarita_cardiovascolare___ne() {
        return familiarita_cardiovascolare___ne;
    }
    public void setFamiliarita_cardiovascolare___ne(String familiarita_cardiovascolare___ne) {
        this.familiarita_cardiovascolare___ne = familiarita_cardiovascolare___ne;
    }

    public Boolean getFamiliarita_cardiovascolare___null() {
        return familiarita_cardiovascolare___null;
    }
    public void setFamiliarita_cardiovascolare___null(Boolean familiarita_cardiovascolare___null) {
        this.familiarita_cardiovascolare___null = familiarita_cardiovascolare___null;
    }

    public Boolean getFamiliarita_cardiovascolare___not___null() {
        return familiarita_cardiovascolare___not___null;
    }
    public void setFamiliarita_cardiovascolare___not___null(Boolean familiarita_cardiovascolare___not___null) {
        this.familiarita_cardiovascolare___not___null = familiarita_cardiovascolare___not___null;
    }

    public java.util.List<String> getFamiliarita_cardiovascolare___in() {
        return familiarita_cardiovascolare___in;
    }
    public void setFamiliarita_cardiovascolare___in(java.util.List<String> familiarita_cardiovascolare___in) {
        this.familiarita_cardiovascolare___in = familiarita_cardiovascolare___in;
    }

    public java.util.List<String> getFamiliarita_cardiovascolare___not___in() {
        return familiarita_cardiovascolare___not___in;
    }
    public void setFamiliarita_cardiovascolare___not___in(java.util.List<String> familiarita_cardiovascolare___not___in) {
        this.familiarita_cardiovascolare___not___in = familiarita_cardiovascolare___not___in;
    }

    public String getFamiliarita_cardiovascolare___lt() {
        return familiarita_cardiovascolare___lt;
    }
    public void setFamiliarita_cardiovascolare___lt(String familiarita_cardiovascolare___lt) {
        this.familiarita_cardiovascolare___lt = familiarita_cardiovascolare___lt;
    }

    public String getFamiliarita_cardiovascolare___lte() {
        return familiarita_cardiovascolare___lte;
    }
    public void setFamiliarita_cardiovascolare___lte(String familiarita_cardiovascolare___lte) {
        this.familiarita_cardiovascolare___lte = familiarita_cardiovascolare___lte;
    }

    public String getFamiliarita_cardiovascolare___gt() {
        return familiarita_cardiovascolare___gt;
    }
    public void setFamiliarita_cardiovascolare___gt(String familiarita_cardiovascolare___gt) {
        this.familiarita_cardiovascolare___gt = familiarita_cardiovascolare___gt;
    }

    public String getFamiliarita_cardiovascolare___gte() {
        return familiarita_cardiovascolare___gte;
    }
    public void setFamiliarita_cardiovascolare___gte(String familiarita_cardiovascolare___gte) {
        this.familiarita_cardiovascolare___gte = familiarita_cardiovascolare___gte;
    }

    public String getFamiliarita_cardiovascolare___contains() {
        return familiarita_cardiovascolare___contains;
    }
    public void setFamiliarita_cardiovascolare___contains(String familiarita_cardiovascolare___contains) {
        this.familiarita_cardiovascolare___contains = familiarita_cardiovascolare___contains;
    }

    public String getFamiliarita_cardiovascolare___not___contains() {
        return familiarita_cardiovascolare___not___contains;
    }
    public void setFamiliarita_cardiovascolare___not___contains(String familiarita_cardiovascolare___not___contains) {
        this.familiarita_cardiovascolare___not___contains = familiarita_cardiovascolare___not___contains;
    }

    public String getFamiliarita_cardiovascolare___starts_with() {
        return familiarita_cardiovascolare___starts_with;
    }
    public void setFamiliarita_cardiovascolare___starts_with(String familiarita_cardiovascolare___starts_with) {
        this.familiarita_cardiovascolare___starts_with = familiarita_cardiovascolare___starts_with;
    }

    public String getFamiliarita_cardiovascolare___not___starts_with() {
        return familiarita_cardiovascolare___not___starts_with;
    }
    public void setFamiliarita_cardiovascolare___not___starts_with(String familiarita_cardiovascolare___not___starts_with) {
        this.familiarita_cardiovascolare___not___starts_with = familiarita_cardiovascolare___not___starts_with;
    }

    public String getFamiliarita_cardiovascolare___ends_with() {
        return familiarita_cardiovascolare___ends_with;
    }
    public void setFamiliarita_cardiovascolare___ends_with(String familiarita_cardiovascolare___ends_with) {
        this.familiarita_cardiovascolare___ends_with = familiarita_cardiovascolare___ends_with;
    }

    public String getFamiliarita_cardiovascolare___not___ends_with() {
        return familiarita_cardiovascolare___not___ends_with;
    }
    public void setFamiliarita_cardiovascolare___not___ends_with(String familiarita_cardiovascolare___not___ends_with) {
        this.familiarita_cardiovascolare___not___ends_with = familiarita_cardiovascolare___not___ends_with;
    }

    public Boolean getFumatore___eq() {
        return fumatore___eq;
    }
    public void setFumatore___eq(Boolean fumatore___eq) {
        this.fumatore___eq = fumatore___eq;
    }

    public Boolean getFumatore___ne() {
        return fumatore___ne;
    }
    public void setFumatore___ne(Boolean fumatore___ne) {
        this.fumatore___ne = fumatore___ne;
    }

    public Boolean getFumatore___null() {
        return fumatore___null;
    }
    public void setFumatore___null(Boolean fumatore___null) {
        this.fumatore___null = fumatore___null;
    }

    public Boolean getFumatore___not___null() {
        return fumatore___not___null;
    }
    public void setFumatore___not___null(Boolean fumatore___not___null) {
        this.fumatore___not___null = fumatore___not___null;
    }

    public Boolean getInfezione_acuta___eq() {
        return infezione_acuta___eq;
    }
    public void setInfezione_acuta___eq(Boolean infezione_acuta___eq) {
        this.infezione_acuta___eq = infezione_acuta___eq;
    }

    public Boolean getInfezione_acuta___ne() {
        return infezione_acuta___ne;
    }
    public void setInfezione_acuta___ne(Boolean infezione_acuta___ne) {
        this.infezione_acuta___ne = infezione_acuta___ne;
    }

    public Boolean getInfezione_acuta___null() {
        return infezione_acuta___null;
    }
    public void setInfezione_acuta___null(Boolean infezione_acuta___null) {
        this.infezione_acuta___null = infezione_acuta___null;
    }

    public Boolean getInfezione_acuta___not___null() {
        return infezione_acuta___not___null;
    }
    public void setInfezione_acuta___not___null(Boolean infezione_acuta___not___null) {
        this.infezione_acuta___not___null = infezione_acuta___not___null;
    }

    public String getPaziente___eq() {
        return paziente___eq;
    }
    public void setPaziente___eq(String paziente___eq) {
        this.paziente___eq = paziente___eq;
    }

    public String getPaziente___ne() {
        return paziente___ne;
    }
    public void setPaziente___ne(String paziente___ne) {
        this.paziente___ne = paziente___ne;
    }

    public Boolean getPaziente___null() {
        return paziente___null;
    }
    public void setPaziente___null(Boolean paziente___null) {
        this.paziente___null = paziente___null;
    }

    public Boolean getPaziente___not___null() {
        return paziente___not___null;
    }
    public void setPaziente___not___null(Boolean paziente___not___null) {
        this.paziente___not___null = paziente___not___null;
    }

    public java.util.List<String> getPaziente___in() {
        return paziente___in;
    }
    public void setPaziente___in(java.util.List<String> paziente___in) {
        this.paziente___in = paziente___in;
    }

    public java.util.List<String> getPaziente___not___in() {
        return paziente___not___in;
    }
    public void setPaziente___not___in(java.util.List<String> paziente___not___in) {
        this.paziente___not___in = paziente___not___in;
    }

    public String getPaziente___lt() {
        return paziente___lt;
    }
    public void setPaziente___lt(String paziente___lt) {
        this.paziente___lt = paziente___lt;
    }

    public String getPaziente___lte() {
        return paziente___lte;
    }
    public void setPaziente___lte(String paziente___lte) {
        this.paziente___lte = paziente___lte;
    }

    public String getPaziente___gt() {
        return paziente___gt;
    }
    public void setPaziente___gt(String paziente___gt) {
        this.paziente___gt = paziente___gt;
    }

    public String getPaziente___gte() {
        return paziente___gte;
    }
    public void setPaziente___gte(String paziente___gte) {
        this.paziente___gte = paziente___gte;
    }

    public String getPaziente___contains() {
        return paziente___contains;
    }
    public void setPaziente___contains(String paziente___contains) {
        this.paziente___contains = paziente___contains;
    }

    public String getPaziente___not___contains() {
        return paziente___not___contains;
    }
    public void setPaziente___not___contains(String paziente___not___contains) {
        this.paziente___not___contains = paziente___not___contains;
    }

    public String getPaziente___starts_with() {
        return paziente___starts_with;
    }
    public void setPaziente___starts_with(String paziente___starts_with) {
        this.paziente___starts_with = paziente___starts_with;
    }

    public String getPaziente___not___starts_with() {
        return paziente___not___starts_with;
    }
    public void setPaziente___not___starts_with(String paziente___not___starts_with) {
        this.paziente___not___starts_with = paziente___not___starts_with;
    }

    public String getPaziente___ends_with() {
        return paziente___ends_with;
    }
    public void setPaziente___ends_with(String paziente___ends_with) {
        this.paziente___ends_with = paziente___ends_with;
    }

    public String getPaziente___not___ends_with() {
        return paziente___not___ends_with;
    }
    public void setPaziente___not___ends_with(String paziente___not___ends_with) {
        this.paziente___not___ends_with = paziente___not___ends_with;
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

    public Boolean getPrep_quotidiana___eq() {
        return prep_quotidiana___eq;
    }
    public void setPrep_quotidiana___eq(Boolean prep_quotidiana___eq) {
        this.prep_quotidiana___eq = prep_quotidiana___eq;
    }

    public Boolean getPrep_quotidiana___ne() {
        return prep_quotidiana___ne;
    }
    public void setPrep_quotidiana___ne(Boolean prep_quotidiana___ne) {
        this.prep_quotidiana___ne = prep_quotidiana___ne;
    }

    public Boolean getPrep_quotidiana___null() {
        return prep_quotidiana___null;
    }
    public void setPrep_quotidiana___null(Boolean prep_quotidiana___null) {
        this.prep_quotidiana___null = prep_quotidiana___null;
    }

    public Boolean getPrep_quotidiana___not___null() {
        return prep_quotidiana___not___null;
    }
    public void setPrep_quotidiana___not___null(Boolean prep_quotidiana___not___null) {
        this.prep_quotidiana___not___null = prep_quotidiana___not___null;
    }

    public String getScolarita___eq() {
        return scolarita___eq;
    }
    public void setScolarita___eq(String scolarita___eq) {
        this.scolarita___eq = scolarita___eq;
    }

    public String getScolarita___ne() {
        return scolarita___ne;
    }
    public void setScolarita___ne(String scolarita___ne) {
        this.scolarita___ne = scolarita___ne;
    }

    public Boolean getScolarita___null() {
        return scolarita___null;
    }
    public void setScolarita___null(Boolean scolarita___null) {
        this.scolarita___null = scolarita___null;
    }

    public Boolean getScolarita___not___null() {
        return scolarita___not___null;
    }
    public void setScolarita___not___null(Boolean scolarita___not___null) {
        this.scolarita___not___null = scolarita___not___null;
    }

    public java.util.List<String> getScolarita___in() {
        return scolarita___in;
    }
    public void setScolarita___in(java.util.List<String> scolarita___in) {
        this.scolarita___in = scolarita___in;
    }

    public java.util.List<String> getScolarita___not___in() {
        return scolarita___not___in;
    }
    public void setScolarita___not___in(java.util.List<String> scolarita___not___in) {
        this.scolarita___not___in = scolarita___not___in;
    }

    public String getScolarita___lt() {
        return scolarita___lt;
    }
    public void setScolarita___lt(String scolarita___lt) {
        this.scolarita___lt = scolarita___lt;
    }

    public String getScolarita___lte() {
        return scolarita___lte;
    }
    public void setScolarita___lte(String scolarita___lte) {
        this.scolarita___lte = scolarita___lte;
    }

    public String getScolarita___gt() {
        return scolarita___gt;
    }
    public void setScolarita___gt(String scolarita___gt) {
        this.scolarita___gt = scolarita___gt;
    }

    public String getScolarita___gte() {
        return scolarita___gte;
    }
    public void setScolarita___gte(String scolarita___gte) {
        this.scolarita___gte = scolarita___gte;
    }

    public String getScolarita___contains() {
        return scolarita___contains;
    }
    public void setScolarita___contains(String scolarita___contains) {
        this.scolarita___contains = scolarita___contains;
    }

    public String getScolarita___not___contains() {
        return scolarita___not___contains;
    }
    public void setScolarita___not___contains(String scolarita___not___contains) {
        this.scolarita___not___contains = scolarita___not___contains;
    }

    public String getScolarita___starts_with() {
        return scolarita___starts_with;
    }
    public void setScolarita___starts_with(String scolarita___starts_with) {
        this.scolarita___starts_with = scolarita___starts_with;
    }

    public String getScolarita___not___starts_with() {
        return scolarita___not___starts_with;
    }
    public void setScolarita___not___starts_with(String scolarita___not___starts_with) {
        this.scolarita___not___starts_with = scolarita___not___starts_with;
    }

    public String getScolarita___ends_with() {
        return scolarita___ends_with;
    }
    public void setScolarita___ends_with(String scolarita___ends_with) {
        this.scolarita___ends_with = scolarita___ends_with;
    }

    public String getScolarita___not___ends_with() {
        return scolarita___not___ends_with;
    }
    public void setScolarita___not___ends_with(String scolarita___not___ends_with) {
        this.scolarita___not___ends_with = scolarita___not___ends_with;
    }

    public String getTeam___eq() {
        return team___eq;
    }
    public void setTeam___eq(String team___eq) {
        this.team___eq = team___eq;
    }

    public String getTeam___ne() {
        return team___ne;
    }
    public void setTeam___ne(String team___ne) {
        this.team___ne = team___ne;
    }

    public Boolean getTeam___null() {
        return team___null;
    }
    public void setTeam___null(Boolean team___null) {
        this.team___null = team___null;
    }

    public Boolean getTeam___not___null() {
        return team___not___null;
    }
    public void setTeam___not___null(Boolean team___not___null) {
        this.team___not___null = team___not___null;
    }

    public java.util.List<String> getTeam___in() {
        return team___in;
    }
    public void setTeam___in(java.util.List<String> team___in) {
        this.team___in = team___in;
    }

    public java.util.List<String> getTeam___not___in() {
        return team___not___in;
    }
    public void setTeam___not___in(java.util.List<String> team___not___in) {
        this.team___not___in = team___not___in;
    }

    public String getTeam___lt() {
        return team___lt;
    }
    public void setTeam___lt(String team___lt) {
        this.team___lt = team___lt;
    }

    public String getTeam___lte() {
        return team___lte;
    }
    public void setTeam___lte(String team___lte) {
        this.team___lte = team___lte;
    }

    public String getTeam___gt() {
        return team___gt;
    }
    public void setTeam___gt(String team___gt) {
        this.team___gt = team___gt;
    }

    public String getTeam___gte() {
        return team___gte;
    }
    public void setTeam___gte(String team___gte) {
        this.team___gte = team___gte;
    }

    public String getTeam___contains() {
        return team___contains;
    }
    public void setTeam___contains(String team___contains) {
        this.team___contains = team___contains;
    }

    public String getTeam___not___contains() {
        return team___not___contains;
    }
    public void setTeam___not___contains(String team___not___contains) {
        this.team___not___contains = team___not___contains;
    }

    public String getTeam___starts_with() {
        return team___starts_with;
    }
    public void setTeam___starts_with(String team___starts_with) {
        this.team___starts_with = team___starts_with;
    }

    public String getTeam___not___starts_with() {
        return team___not___starts_with;
    }
    public void setTeam___not___starts_with(String team___not___starts_with) {
        this.team___not___starts_with = team___not___starts_with;
    }

    public String getTeam___ends_with() {
        return team___ends_with;
    }
    public void setTeam___ends_with(String team___ends_with) {
        this.team___ends_with = team___ends_with;
    }

    public String getTeam___not___ends_with() {
        return team___not___ends_with;
    }
    public void setTeam___not___ends_with(String team___not___ends_with) {
        this.team___not___ends_with = team___not___ends_with;
    }

    public java.util.List<CliAnamnesiFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliAnamnesiFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliAnamnesiFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliAnamnesiFilterDTO> OR) {
        this.OR = OR;
    }

    public CliAnamnesiFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliAnamnesiFilterDTO NOT) {
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
        if (altro_luogo___eq != null) {
            joiner.add("altro_luogo___eq: " + GraphQLRequestSerializer.getEntry(altro_luogo___eq));
        }
        if (altro_luogo___ne != null) {
            joiner.add("altro_luogo___ne: " + GraphQLRequestSerializer.getEntry(altro_luogo___ne));
        }
        if (altro_luogo___null != null) {
            joiner.add("altro_luogo___null: " + GraphQLRequestSerializer.getEntry(altro_luogo___null));
        }
        if (altro_luogo___not___null != null) {
            joiner.add("altro_luogo___not___null: " + GraphQLRequestSerializer.getEntry(altro_luogo___not___null));
        }
        if (altro_luogo_test_HIV___eq != null) {
            joiner.add("altro_luogo_test_HIV___eq: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___eq));
        }
        if (altro_luogo_test_HIV___ne != null) {
            joiner.add("altro_luogo_test_HIV___ne: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___ne));
        }
        if (altro_luogo_test_HIV___null != null) {
            joiner.add("altro_luogo_test_HIV___null: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___null));
        }
        if (altro_luogo_test_HIV___not___null != null) {
            joiner.add("altro_luogo_test_HIV___not___null: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___not___null));
        }
        if (altro_luogo_test_HIV___in != null) {
            joiner.add("altro_luogo_test_HIV___in: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___in));
        }
        if (altro_luogo_test_HIV___not___in != null) {
            joiner.add("altro_luogo_test_HIV___not___in: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___not___in));
        }
        if (altro_luogo_test_HIV___lt != null) {
            joiner.add("altro_luogo_test_HIV___lt: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___lt));
        }
        if (altro_luogo_test_HIV___lte != null) {
            joiner.add("altro_luogo_test_HIV___lte: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___lte));
        }
        if (altro_luogo_test_HIV___gt != null) {
            joiner.add("altro_luogo_test_HIV___gt: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___gt));
        }
        if (altro_luogo_test_HIV___gte != null) {
            joiner.add("altro_luogo_test_HIV___gte: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___gte));
        }
        if (altro_luogo_test_HIV___contains != null) {
            joiner.add("altro_luogo_test_HIV___contains: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___contains));
        }
        if (altro_luogo_test_HIV___not___contains != null) {
            joiner.add("altro_luogo_test_HIV___not___contains: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___not___contains));
        }
        if (altro_luogo_test_HIV___starts_with != null) {
            joiner.add("altro_luogo_test_HIV___starts_with: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___starts_with));
        }
        if (altro_luogo_test_HIV___not___starts_with != null) {
            joiner.add("altro_luogo_test_HIV___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___not___starts_with));
        }
        if (altro_luogo_test_HIV___ends_with != null) {
            joiner.add("altro_luogo_test_HIV___ends_with: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___ends_with));
        }
        if (altro_luogo_test_HIV___not___ends_with != null) {
            joiner.add("altro_luogo_test_HIV___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_luogo_test_HIV___not___ends_with));
        }
        if (anni_fumo_pregresso___eq != null) {
            joiner.add("anni_fumo_pregresso___eq: " + GraphQLRequestSerializer.getEntry(anni_fumo_pregresso___eq));
        }
        if (anni_fumo_pregresso___ne != null) {
            joiner.add("anni_fumo_pregresso___ne: " + GraphQLRequestSerializer.getEntry(anni_fumo_pregresso___ne));
        }
        if (anni_fumo_pregresso___null != null) {
            joiner.add("anni_fumo_pregresso___null: " + GraphQLRequestSerializer.getEntry(anni_fumo_pregresso___null));
        }
        if (anni_fumo_pregresso___not___null != null) {
            joiner.add("anni_fumo_pregresso___not___null: " + GraphQLRequestSerializer.getEntry(anni_fumo_pregresso___not___null));
        }
        if (anni_fumo_pregresso___in != null) {
            joiner.add("anni_fumo_pregresso___in: " + GraphQLRequestSerializer.getEntry(anni_fumo_pregresso___in));
        }
        if (anni_fumo_pregresso___not___in != null) {
            joiner.add("anni_fumo_pregresso___not___in: " + GraphQLRequestSerializer.getEntry(anni_fumo_pregresso___not___in));
        }
        if (anni_fumo_pregresso___lt != null) {
            joiner.add("anni_fumo_pregresso___lt: " + GraphQLRequestSerializer.getEntry(anni_fumo_pregresso___lt));
        }
        if (anni_fumo_pregresso___lte != null) {
            joiner.add("anni_fumo_pregresso___lte: " + GraphQLRequestSerializer.getEntry(anni_fumo_pregresso___lte));
        }
        if (anni_fumo_pregresso___gt != null) {
            joiner.add("anni_fumo_pregresso___gt: " + GraphQLRequestSerializer.getEntry(anni_fumo_pregresso___gt));
        }
        if (anni_fumo_pregresso___gte != null) {
            joiner.add("anni_fumo_pregresso___gte: " + GraphQLRequestSerializer.getEntry(anni_fumo_pregresso___gte));
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
        if (data_enrol___eq != null) {
            joiner.add("data_enrol___eq: " + GraphQLRequestSerializer.getEntry(data_enrol___eq));
        }
        if (data_enrol___ne != null) {
            joiner.add("data_enrol___ne: " + GraphQLRequestSerializer.getEntry(data_enrol___ne));
        }
        if (data_enrol___null != null) {
            joiner.add("data_enrol___null: " + GraphQLRequestSerializer.getEntry(data_enrol___null));
        }
        if (data_enrol___not___null != null) {
            joiner.add("data_enrol___not___null: " + GraphQLRequestSerializer.getEntry(data_enrol___not___null));
        }
        if (data_enrol___in != null) {
            joiner.add("data_enrol___in: " + GraphQLRequestSerializer.getEntry(data_enrol___in));
        }
        if (data_enrol___not___in != null) {
            joiner.add("data_enrol___not___in: " + GraphQLRequestSerializer.getEntry(data_enrol___not___in));
        }
        if (data_enrol___lt != null) {
            joiner.add("data_enrol___lt: " + GraphQLRequestSerializer.getEntry(data_enrol___lt));
        }
        if (data_enrol___lte != null) {
            joiner.add("data_enrol___lte: " + GraphQLRequestSerializer.getEntry(data_enrol___lte));
        }
        if (data_enrol___gt != null) {
            joiner.add("data_enrol___gt: " + GraphQLRequestSerializer.getEntry(data_enrol___gt));
        }
        if (data_enrol___gte != null) {
            joiner.add("data_enrol___gte: " + GraphQLRequestSerializer.getEntry(data_enrol___gte));
        }
        if (data_prima_prep___eq != null) {
            joiner.add("data_prima_prep___eq: " + GraphQLRequestSerializer.getEntry(data_prima_prep___eq));
        }
        if (data_prima_prep___ne != null) {
            joiner.add("data_prima_prep___ne: " + GraphQLRequestSerializer.getEntry(data_prima_prep___ne));
        }
        if (data_prima_prep___null != null) {
            joiner.add("data_prima_prep___null: " + GraphQLRequestSerializer.getEntry(data_prima_prep___null));
        }
        if (data_prima_prep___not___null != null) {
            joiner.add("data_prima_prep___not___null: " + GraphQLRequestSerializer.getEntry(data_prima_prep___not___null));
        }
        if (data_prima_prep___in != null) {
            joiner.add("data_prima_prep___in: " + GraphQLRequestSerializer.getEntry(data_prima_prep___in));
        }
        if (data_prima_prep___not___in != null) {
            joiner.add("data_prima_prep___not___in: " + GraphQLRequestSerializer.getEntry(data_prima_prep___not___in));
        }
        if (data_prima_prep___lt != null) {
            joiner.add("data_prima_prep___lt: " + GraphQLRequestSerializer.getEntry(data_prima_prep___lt));
        }
        if (data_prima_prep___lte != null) {
            joiner.add("data_prima_prep___lte: " + GraphQLRequestSerializer.getEntry(data_prima_prep___lte));
        }
        if (data_prima_prep___gt != null) {
            joiner.add("data_prima_prep___gt: " + GraphQLRequestSerializer.getEntry(data_prima_prep___gt));
        }
        if (data_prima_prep___gte != null) {
            joiner.add("data_prima_prep___gte: " + GraphQLRequestSerializer.getEntry(data_prima_prep___gte));
        }
        if (data_primo_riscontro_HIV___eq != null) {
            joiner.add("data_primo_riscontro_HIV___eq: " + GraphQLRequestSerializer.getEntry(data_primo_riscontro_HIV___eq));
        }
        if (data_primo_riscontro_HIV___ne != null) {
            joiner.add("data_primo_riscontro_HIV___ne: " + GraphQLRequestSerializer.getEntry(data_primo_riscontro_HIV___ne));
        }
        if (data_primo_riscontro_HIV___null != null) {
            joiner.add("data_primo_riscontro_HIV___null: " + GraphQLRequestSerializer.getEntry(data_primo_riscontro_HIV___null));
        }
        if (data_primo_riscontro_HIV___not___null != null) {
            joiner.add("data_primo_riscontro_HIV___not___null: " + GraphQLRequestSerializer.getEntry(data_primo_riscontro_HIV___not___null));
        }
        if (data_primo_riscontro_HIV___in != null) {
            joiner.add("data_primo_riscontro_HIV___in: " + GraphQLRequestSerializer.getEntry(data_primo_riscontro_HIV___in));
        }
        if (data_primo_riscontro_HIV___not___in != null) {
            joiner.add("data_primo_riscontro_HIV___not___in: " + GraphQLRequestSerializer.getEntry(data_primo_riscontro_HIV___not___in));
        }
        if (data_primo_riscontro_HIV___lt != null) {
            joiner.add("data_primo_riscontro_HIV___lt: " + GraphQLRequestSerializer.getEntry(data_primo_riscontro_HIV___lt));
        }
        if (data_primo_riscontro_HIV___lte != null) {
            joiner.add("data_primo_riscontro_HIV___lte: " + GraphQLRequestSerializer.getEntry(data_primo_riscontro_HIV___lte));
        }
        if (data_primo_riscontro_HIV___gt != null) {
            joiner.add("data_primo_riscontro_HIV___gt: " + GraphQLRequestSerializer.getEntry(data_primo_riscontro_HIV___gt));
        }
        if (data_primo_riscontro_HIV___gte != null) {
            joiner.add("data_primo_riscontro_HIV___gte: " + GraphQLRequestSerializer.getEntry(data_primo_riscontro_HIV___gte));
        }
        if (data_sieroconversione___eq != null) {
            joiner.add("data_sieroconversione___eq: " + GraphQLRequestSerializer.getEntry(data_sieroconversione___eq));
        }
        if (data_sieroconversione___ne != null) {
            joiner.add("data_sieroconversione___ne: " + GraphQLRequestSerializer.getEntry(data_sieroconversione___ne));
        }
        if (data_sieroconversione___null != null) {
            joiner.add("data_sieroconversione___null: " + GraphQLRequestSerializer.getEntry(data_sieroconversione___null));
        }
        if (data_sieroconversione___not___null != null) {
            joiner.add("data_sieroconversione___not___null: " + GraphQLRequestSerializer.getEntry(data_sieroconversione___not___null));
        }
        if (data_sieroconversione___in != null) {
            joiner.add("data_sieroconversione___in: " + GraphQLRequestSerializer.getEntry(data_sieroconversione___in));
        }
        if (data_sieroconversione___not___in != null) {
            joiner.add("data_sieroconversione___not___in: " + GraphQLRequestSerializer.getEntry(data_sieroconversione___not___in));
        }
        if (data_sieroconversione___lt != null) {
            joiner.add("data_sieroconversione___lt: " + GraphQLRequestSerializer.getEntry(data_sieroconversione___lt));
        }
        if (data_sieroconversione___lte != null) {
            joiner.add("data_sieroconversione___lte: " + GraphQLRequestSerializer.getEntry(data_sieroconversione___lte));
        }
        if (data_sieroconversione___gt != null) {
            joiner.add("data_sieroconversione___gt: " + GraphQLRequestSerializer.getEntry(data_sieroconversione___gt));
        }
        if (data_sieroconversione___gte != null) {
            joiner.add("data_sieroconversione___gte: " + GraphQLRequestSerializer.getEntry(data_sieroconversione___gte));
        }
        if (data_ultima_prep___eq != null) {
            joiner.add("data_ultima_prep___eq: " + GraphQLRequestSerializer.getEntry(data_ultima_prep___eq));
        }
        if (data_ultima_prep___ne != null) {
            joiner.add("data_ultima_prep___ne: " + GraphQLRequestSerializer.getEntry(data_ultima_prep___ne));
        }
        if (data_ultima_prep___null != null) {
            joiner.add("data_ultima_prep___null: " + GraphQLRequestSerializer.getEntry(data_ultima_prep___null));
        }
        if (data_ultima_prep___not___null != null) {
            joiner.add("data_ultima_prep___not___null: " + GraphQLRequestSerializer.getEntry(data_ultima_prep___not___null));
        }
        if (data_ultima_prep___in != null) {
            joiner.add("data_ultima_prep___in: " + GraphQLRequestSerializer.getEntry(data_ultima_prep___in));
        }
        if (data_ultima_prep___not___in != null) {
            joiner.add("data_ultima_prep___not___in: " + GraphQLRequestSerializer.getEntry(data_ultima_prep___not___in));
        }
        if (data_ultima_prep___lt != null) {
            joiner.add("data_ultima_prep___lt: " + GraphQLRequestSerializer.getEntry(data_ultima_prep___lt));
        }
        if (data_ultima_prep___lte != null) {
            joiner.add("data_ultima_prep___lte: " + GraphQLRequestSerializer.getEntry(data_ultima_prep___lte));
        }
        if (data_ultima_prep___gt != null) {
            joiner.add("data_ultima_prep___gt: " + GraphQLRequestSerializer.getEntry(data_ultima_prep___gt));
        }
        if (data_ultima_prep___gte != null) {
            joiner.add("data_ultima_prep___gte: " + GraphQLRequestSerializer.getEntry(data_ultima_prep___gte));
        }
        if (data_ultimo_test_negativo___eq != null) {
            joiner.add("data_ultimo_test_negativo___eq: " + GraphQLRequestSerializer.getEntry(data_ultimo_test_negativo___eq));
        }
        if (data_ultimo_test_negativo___ne != null) {
            joiner.add("data_ultimo_test_negativo___ne: " + GraphQLRequestSerializer.getEntry(data_ultimo_test_negativo___ne));
        }
        if (data_ultimo_test_negativo___null != null) {
            joiner.add("data_ultimo_test_negativo___null: " + GraphQLRequestSerializer.getEntry(data_ultimo_test_negativo___null));
        }
        if (data_ultimo_test_negativo___not___null != null) {
            joiner.add("data_ultimo_test_negativo___not___null: " + GraphQLRequestSerializer.getEntry(data_ultimo_test_negativo___not___null));
        }
        if (data_ultimo_test_negativo___in != null) {
            joiner.add("data_ultimo_test_negativo___in: " + GraphQLRequestSerializer.getEntry(data_ultimo_test_negativo___in));
        }
        if (data_ultimo_test_negativo___not___in != null) {
            joiner.add("data_ultimo_test_negativo___not___in: " + GraphQLRequestSerializer.getEntry(data_ultimo_test_negativo___not___in));
        }
        if (data_ultimo_test_negativo___lt != null) {
            joiner.add("data_ultimo_test_negativo___lt: " + GraphQLRequestSerializer.getEntry(data_ultimo_test_negativo___lt));
        }
        if (data_ultimo_test_negativo___lte != null) {
            joiner.add("data_ultimo_test_negativo___lte: " + GraphQLRequestSerializer.getEntry(data_ultimo_test_negativo___lte));
        }
        if (data_ultimo_test_negativo___gt != null) {
            joiner.add("data_ultimo_test_negativo___gt: " + GraphQLRequestSerializer.getEntry(data_ultimo_test_negativo___gt));
        }
        if (data_ultimo_test_negativo___gte != null) {
            joiner.add("data_ultimo_test_negativo___gte: " + GraphQLRequestSerializer.getEntry(data_ultimo_test_negativo___gte));
        }
        if (familiarita_cardiovascolare___eq != null) {
            joiner.add("familiarita_cardiovascolare___eq: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___eq));
        }
        if (familiarita_cardiovascolare___ne != null) {
            joiner.add("familiarita_cardiovascolare___ne: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___ne));
        }
        if (familiarita_cardiovascolare___null != null) {
            joiner.add("familiarita_cardiovascolare___null: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___null));
        }
        if (familiarita_cardiovascolare___not___null != null) {
            joiner.add("familiarita_cardiovascolare___not___null: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___not___null));
        }
        if (familiarita_cardiovascolare___in != null) {
            joiner.add("familiarita_cardiovascolare___in: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___in));
        }
        if (familiarita_cardiovascolare___not___in != null) {
            joiner.add("familiarita_cardiovascolare___not___in: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___not___in));
        }
        if (familiarita_cardiovascolare___lt != null) {
            joiner.add("familiarita_cardiovascolare___lt: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___lt));
        }
        if (familiarita_cardiovascolare___lte != null) {
            joiner.add("familiarita_cardiovascolare___lte: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___lte));
        }
        if (familiarita_cardiovascolare___gt != null) {
            joiner.add("familiarita_cardiovascolare___gt: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___gt));
        }
        if (familiarita_cardiovascolare___gte != null) {
            joiner.add("familiarita_cardiovascolare___gte: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___gte));
        }
        if (familiarita_cardiovascolare___contains != null) {
            joiner.add("familiarita_cardiovascolare___contains: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___contains));
        }
        if (familiarita_cardiovascolare___not___contains != null) {
            joiner.add("familiarita_cardiovascolare___not___contains: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___not___contains));
        }
        if (familiarita_cardiovascolare___starts_with != null) {
            joiner.add("familiarita_cardiovascolare___starts_with: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___starts_with));
        }
        if (familiarita_cardiovascolare___not___starts_with != null) {
            joiner.add("familiarita_cardiovascolare___not___starts_with: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___not___starts_with));
        }
        if (familiarita_cardiovascolare___ends_with != null) {
            joiner.add("familiarita_cardiovascolare___ends_with: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___ends_with));
        }
        if (familiarita_cardiovascolare___not___ends_with != null) {
            joiner.add("familiarita_cardiovascolare___not___ends_with: " + GraphQLRequestSerializer.getEntry(familiarita_cardiovascolare___not___ends_with));
        }
        if (fumatore___eq != null) {
            joiner.add("fumatore___eq: " + GraphQLRequestSerializer.getEntry(fumatore___eq));
        }
        if (fumatore___ne != null) {
            joiner.add("fumatore___ne: " + GraphQLRequestSerializer.getEntry(fumatore___ne));
        }
        if (fumatore___null != null) {
            joiner.add("fumatore___null: " + GraphQLRequestSerializer.getEntry(fumatore___null));
        }
        if (fumatore___not___null != null) {
            joiner.add("fumatore___not___null: " + GraphQLRequestSerializer.getEntry(fumatore___not___null));
        }
        if (infezione_acuta___eq != null) {
            joiner.add("infezione_acuta___eq: " + GraphQLRequestSerializer.getEntry(infezione_acuta___eq));
        }
        if (infezione_acuta___ne != null) {
            joiner.add("infezione_acuta___ne: " + GraphQLRequestSerializer.getEntry(infezione_acuta___ne));
        }
        if (infezione_acuta___null != null) {
            joiner.add("infezione_acuta___null: " + GraphQLRequestSerializer.getEntry(infezione_acuta___null));
        }
        if (infezione_acuta___not___null != null) {
            joiner.add("infezione_acuta___not___null: " + GraphQLRequestSerializer.getEntry(infezione_acuta___not___null));
        }
        if (paziente___eq != null) {
            joiner.add("paziente___eq: " + GraphQLRequestSerializer.getEntry(paziente___eq));
        }
        if (paziente___ne != null) {
            joiner.add("paziente___ne: " + GraphQLRequestSerializer.getEntry(paziente___ne));
        }
        if (paziente___null != null) {
            joiner.add("paziente___null: " + GraphQLRequestSerializer.getEntry(paziente___null));
        }
        if (paziente___not___null != null) {
            joiner.add("paziente___not___null: " + GraphQLRequestSerializer.getEntry(paziente___not___null));
        }
        if (paziente___in != null) {
            joiner.add("paziente___in: " + GraphQLRequestSerializer.getEntry(paziente___in));
        }
        if (paziente___not___in != null) {
            joiner.add("paziente___not___in: " + GraphQLRequestSerializer.getEntry(paziente___not___in));
        }
        if (paziente___lt != null) {
            joiner.add("paziente___lt: " + GraphQLRequestSerializer.getEntry(paziente___lt));
        }
        if (paziente___lte != null) {
            joiner.add("paziente___lte: " + GraphQLRequestSerializer.getEntry(paziente___lte));
        }
        if (paziente___gt != null) {
            joiner.add("paziente___gt: " + GraphQLRequestSerializer.getEntry(paziente___gt));
        }
        if (paziente___gte != null) {
            joiner.add("paziente___gte: " + GraphQLRequestSerializer.getEntry(paziente___gte));
        }
        if (paziente___contains != null) {
            joiner.add("paziente___contains: " + GraphQLRequestSerializer.getEntry(paziente___contains));
        }
        if (paziente___not___contains != null) {
            joiner.add("paziente___not___contains: " + GraphQLRequestSerializer.getEntry(paziente___not___contains));
        }
        if (paziente___starts_with != null) {
            joiner.add("paziente___starts_with: " + GraphQLRequestSerializer.getEntry(paziente___starts_with));
        }
        if (paziente___not___starts_with != null) {
            joiner.add("paziente___not___starts_with: " + GraphQLRequestSerializer.getEntry(paziente___not___starts_with));
        }
        if (paziente___ends_with != null) {
            joiner.add("paziente___ends_with: " + GraphQLRequestSerializer.getEntry(paziente___ends_with));
        }
        if (paziente___not___ends_with != null) {
            joiner.add("paziente___not___ends_with: " + GraphQLRequestSerializer.getEntry(paziente___not___ends_with));
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
        if (prep_quotidiana___eq != null) {
            joiner.add("prep_quotidiana___eq: " + GraphQLRequestSerializer.getEntry(prep_quotidiana___eq));
        }
        if (prep_quotidiana___ne != null) {
            joiner.add("prep_quotidiana___ne: " + GraphQLRequestSerializer.getEntry(prep_quotidiana___ne));
        }
        if (prep_quotidiana___null != null) {
            joiner.add("prep_quotidiana___null: " + GraphQLRequestSerializer.getEntry(prep_quotidiana___null));
        }
        if (prep_quotidiana___not___null != null) {
            joiner.add("prep_quotidiana___not___null: " + GraphQLRequestSerializer.getEntry(prep_quotidiana___not___null));
        }
        if (scolarita___eq != null) {
            joiner.add("scolarita___eq: " + GraphQLRequestSerializer.getEntry(scolarita___eq));
        }
        if (scolarita___ne != null) {
            joiner.add("scolarita___ne: " + GraphQLRequestSerializer.getEntry(scolarita___ne));
        }
        if (scolarita___null != null) {
            joiner.add("scolarita___null: " + GraphQLRequestSerializer.getEntry(scolarita___null));
        }
        if (scolarita___not___null != null) {
            joiner.add("scolarita___not___null: " + GraphQLRequestSerializer.getEntry(scolarita___not___null));
        }
        if (scolarita___in != null) {
            joiner.add("scolarita___in: " + GraphQLRequestSerializer.getEntry(scolarita___in));
        }
        if (scolarita___not___in != null) {
            joiner.add("scolarita___not___in: " + GraphQLRequestSerializer.getEntry(scolarita___not___in));
        }
        if (scolarita___lt != null) {
            joiner.add("scolarita___lt: " + GraphQLRequestSerializer.getEntry(scolarita___lt));
        }
        if (scolarita___lte != null) {
            joiner.add("scolarita___lte: " + GraphQLRequestSerializer.getEntry(scolarita___lte));
        }
        if (scolarita___gt != null) {
            joiner.add("scolarita___gt: " + GraphQLRequestSerializer.getEntry(scolarita___gt));
        }
        if (scolarita___gte != null) {
            joiner.add("scolarita___gte: " + GraphQLRequestSerializer.getEntry(scolarita___gte));
        }
        if (scolarita___contains != null) {
            joiner.add("scolarita___contains: " + GraphQLRequestSerializer.getEntry(scolarita___contains));
        }
        if (scolarita___not___contains != null) {
            joiner.add("scolarita___not___contains: " + GraphQLRequestSerializer.getEntry(scolarita___not___contains));
        }
        if (scolarita___starts_with != null) {
            joiner.add("scolarita___starts_with: " + GraphQLRequestSerializer.getEntry(scolarita___starts_with));
        }
        if (scolarita___not___starts_with != null) {
            joiner.add("scolarita___not___starts_with: " + GraphQLRequestSerializer.getEntry(scolarita___not___starts_with));
        }
        if (scolarita___ends_with != null) {
            joiner.add("scolarita___ends_with: " + GraphQLRequestSerializer.getEntry(scolarita___ends_with));
        }
        if (scolarita___not___ends_with != null) {
            joiner.add("scolarita___not___ends_with: " + GraphQLRequestSerializer.getEntry(scolarita___not___ends_with));
        }
        if (team___eq != null) {
            joiner.add("team___eq: " + GraphQLRequestSerializer.getEntry(team___eq));
        }
        if (team___ne != null) {
            joiner.add("team___ne: " + GraphQLRequestSerializer.getEntry(team___ne));
        }
        if (team___null != null) {
            joiner.add("team___null: " + GraphQLRequestSerializer.getEntry(team___null));
        }
        if (team___not___null != null) {
            joiner.add("team___not___null: " + GraphQLRequestSerializer.getEntry(team___not___null));
        }
        if (team___in != null) {
            joiner.add("team___in: " + GraphQLRequestSerializer.getEntry(team___in));
        }
        if (team___not___in != null) {
            joiner.add("team___not___in: " + GraphQLRequestSerializer.getEntry(team___not___in));
        }
        if (team___lt != null) {
            joiner.add("team___lt: " + GraphQLRequestSerializer.getEntry(team___lt));
        }
        if (team___lte != null) {
            joiner.add("team___lte: " + GraphQLRequestSerializer.getEntry(team___lte));
        }
        if (team___gt != null) {
            joiner.add("team___gt: " + GraphQLRequestSerializer.getEntry(team___gt));
        }
        if (team___gte != null) {
            joiner.add("team___gte: " + GraphQLRequestSerializer.getEntry(team___gte));
        }
        if (team___contains != null) {
            joiner.add("team___contains: " + GraphQLRequestSerializer.getEntry(team___contains));
        }
        if (team___not___contains != null) {
            joiner.add("team___not___contains: " + GraphQLRequestSerializer.getEntry(team___not___contains));
        }
        if (team___starts_with != null) {
            joiner.add("team___starts_with: " + GraphQLRequestSerializer.getEntry(team___starts_with));
        }
        if (team___not___starts_with != null) {
            joiner.add("team___not___starts_with: " + GraphQLRequestSerializer.getEntry(team___not___starts_with));
        }
        if (team___ends_with != null) {
            joiner.add("team___ends_with: " + GraphQLRequestSerializer.getEntry(team___ends_with));
        }
        if (team___not___ends_with != null) {
            joiner.add("team___not___ends_with: " + GraphQLRequestSerializer.getEntry(team___not___ends_with));
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

    public static CliAnamnesiFilterDTO.Builder builder() {
        return new CliAnamnesiFilterDTO.Builder();
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
        private Boolean altro_luogo___eq;
        private Boolean altro_luogo___ne;
        private Boolean altro_luogo___null;
        private Boolean altro_luogo___not___null;
        private String altro_luogo_test_HIV___eq;
        private String altro_luogo_test_HIV___ne;
        private Boolean altro_luogo_test_HIV___null;
        private Boolean altro_luogo_test_HIV___not___null;
        private java.util.List<String> altro_luogo_test_HIV___in;
        private java.util.List<String> altro_luogo_test_HIV___not___in;
        private String altro_luogo_test_HIV___lt;
        private String altro_luogo_test_HIV___lte;
        private String altro_luogo_test_HIV___gt;
        private String altro_luogo_test_HIV___gte;
        private String altro_luogo_test_HIV___contains;
        private String altro_luogo_test_HIV___not___contains;
        private String altro_luogo_test_HIV___starts_with;
        private String altro_luogo_test_HIV___not___starts_with;
        private String altro_luogo_test_HIV___ends_with;
        private String altro_luogo_test_HIV___not___ends_with;
        private Integer anni_fumo_pregresso___eq;
        private Integer anni_fumo_pregresso___ne;
        private Boolean anni_fumo_pregresso___null;
        private Boolean anni_fumo_pregresso___not___null;
        private java.util.List<Integer> anni_fumo_pregresso___in;
        private java.util.List<Integer> anni_fumo_pregresso___not___in;
        private Integer anni_fumo_pregresso___lt;
        private Integer anni_fumo_pregresso___lte;
        private Integer anni_fumo_pregresso___gt;
        private Integer anni_fumo_pregresso___gte;
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
        private String data_enrol___eq;
        private String data_enrol___ne;
        private Boolean data_enrol___null;
        private Boolean data_enrol___not___null;
        private java.util.List<String> data_enrol___in;
        private java.util.List<String> data_enrol___not___in;
        private String data_enrol___lt;
        private String data_enrol___lte;
        private String data_enrol___gt;
        private String data_enrol___gte;
        private String data_prima_prep___eq;
        private String data_prima_prep___ne;
        private Boolean data_prima_prep___null;
        private Boolean data_prima_prep___not___null;
        private java.util.List<String> data_prima_prep___in;
        private java.util.List<String> data_prima_prep___not___in;
        private String data_prima_prep___lt;
        private String data_prima_prep___lte;
        private String data_prima_prep___gt;
        private String data_prima_prep___gte;
        private String data_primo_riscontro_HIV___eq;
        private String data_primo_riscontro_HIV___ne;
        private Boolean data_primo_riscontro_HIV___null;
        private Boolean data_primo_riscontro_HIV___not___null;
        private java.util.List<String> data_primo_riscontro_HIV___in;
        private java.util.List<String> data_primo_riscontro_HIV___not___in;
        private String data_primo_riscontro_HIV___lt;
        private String data_primo_riscontro_HIV___lte;
        private String data_primo_riscontro_HIV___gt;
        private String data_primo_riscontro_HIV___gte;
        private String data_sieroconversione___eq;
        private String data_sieroconversione___ne;
        private Boolean data_sieroconversione___null;
        private Boolean data_sieroconversione___not___null;
        private java.util.List<String> data_sieroconversione___in;
        private java.util.List<String> data_sieroconversione___not___in;
        private String data_sieroconversione___lt;
        private String data_sieroconversione___lte;
        private String data_sieroconversione___gt;
        private String data_sieroconversione___gte;
        private String data_ultima_prep___eq;
        private String data_ultima_prep___ne;
        private Boolean data_ultima_prep___null;
        private Boolean data_ultima_prep___not___null;
        private java.util.List<String> data_ultima_prep___in;
        private java.util.List<String> data_ultima_prep___not___in;
        private String data_ultima_prep___lt;
        private String data_ultima_prep___lte;
        private String data_ultima_prep___gt;
        private String data_ultima_prep___gte;
        private String data_ultimo_test_negativo___eq;
        private String data_ultimo_test_negativo___ne;
        private Boolean data_ultimo_test_negativo___null;
        private Boolean data_ultimo_test_negativo___not___null;
        private java.util.List<String> data_ultimo_test_negativo___in;
        private java.util.List<String> data_ultimo_test_negativo___not___in;
        private String data_ultimo_test_negativo___lt;
        private String data_ultimo_test_negativo___lte;
        private String data_ultimo_test_negativo___gt;
        private String data_ultimo_test_negativo___gte;
        private String familiarita_cardiovascolare___eq;
        private String familiarita_cardiovascolare___ne;
        private Boolean familiarita_cardiovascolare___null;
        private Boolean familiarita_cardiovascolare___not___null;
        private java.util.List<String> familiarita_cardiovascolare___in;
        private java.util.List<String> familiarita_cardiovascolare___not___in;
        private String familiarita_cardiovascolare___lt;
        private String familiarita_cardiovascolare___lte;
        private String familiarita_cardiovascolare___gt;
        private String familiarita_cardiovascolare___gte;
        private String familiarita_cardiovascolare___contains;
        private String familiarita_cardiovascolare___not___contains;
        private String familiarita_cardiovascolare___starts_with;
        private String familiarita_cardiovascolare___not___starts_with;
        private String familiarita_cardiovascolare___ends_with;
        private String familiarita_cardiovascolare___not___ends_with;
        private Boolean fumatore___eq;
        private Boolean fumatore___ne;
        private Boolean fumatore___null;
        private Boolean fumatore___not___null;
        private Boolean infezione_acuta___eq;
        private Boolean infezione_acuta___ne;
        private Boolean infezione_acuta___null;
        private Boolean infezione_acuta___not___null;
        private String paziente___eq;
        private String paziente___ne;
        private Boolean paziente___null;
        private Boolean paziente___not___null;
        private java.util.List<String> paziente___in;
        private java.util.List<String> paziente___not___in;
        private String paziente___lt;
        private String paziente___lte;
        private String paziente___gt;
        private String paziente___gte;
        private String paziente___contains;
        private String paziente___not___contains;
        private String paziente___starts_with;
        private String paziente___not___starts_with;
        private String paziente___ends_with;
        private String paziente___not___ends_with;
        private Boolean prep___eq;
        private Boolean prep___ne;
        private Boolean prep___null;
        private Boolean prep___not___null;
        private Boolean prep_quotidiana___eq;
        private Boolean prep_quotidiana___ne;
        private Boolean prep_quotidiana___null;
        private Boolean prep_quotidiana___not___null;
        private String scolarita___eq;
        private String scolarita___ne;
        private Boolean scolarita___null;
        private Boolean scolarita___not___null;
        private java.util.List<String> scolarita___in;
        private java.util.List<String> scolarita___not___in;
        private String scolarita___lt;
        private String scolarita___lte;
        private String scolarita___gt;
        private String scolarita___gte;
        private String scolarita___contains;
        private String scolarita___not___contains;
        private String scolarita___starts_with;
        private String scolarita___not___starts_with;
        private String scolarita___ends_with;
        private String scolarita___not___ends_with;
        private String team___eq;
        private String team___ne;
        private Boolean team___null;
        private Boolean team___not___null;
        private java.util.List<String> team___in;
        private java.util.List<String> team___not___in;
        private String team___lt;
        private String team___lte;
        private String team___gt;
        private String team___gte;
        private String team___contains;
        private String team___not___contains;
        private String team___starts_with;
        private String team___not___starts_with;
        private String team___ends_with;
        private String team___not___ends_with;
        private java.util.List<CliAnamnesiFilterDTO> AND;
        private java.util.List<CliAnamnesiFilterDTO> OR;
        private CliAnamnesiFilterDTO NOT;

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

        public Builder setAltro_luogo___eq(Boolean altro_luogo___eq) {
            this.altro_luogo___eq = altro_luogo___eq;
            return this;
        }

        public Builder setAltro_luogo___ne(Boolean altro_luogo___ne) {
            this.altro_luogo___ne = altro_luogo___ne;
            return this;
        }

        public Builder setAltro_luogo___null(Boolean altro_luogo___null) {
            this.altro_luogo___null = altro_luogo___null;
            return this;
        }

        public Builder setAltro_luogo___not___null(Boolean altro_luogo___not___null) {
            this.altro_luogo___not___null = altro_luogo___not___null;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___eq(String altro_luogo_test_HIV___eq) {
            this.altro_luogo_test_HIV___eq = altro_luogo_test_HIV___eq;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___ne(String altro_luogo_test_HIV___ne) {
            this.altro_luogo_test_HIV___ne = altro_luogo_test_HIV___ne;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___null(Boolean altro_luogo_test_HIV___null) {
            this.altro_luogo_test_HIV___null = altro_luogo_test_HIV___null;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___not___null(Boolean altro_luogo_test_HIV___not___null) {
            this.altro_luogo_test_HIV___not___null = altro_luogo_test_HIV___not___null;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___in(java.util.List<String> altro_luogo_test_HIV___in) {
            this.altro_luogo_test_HIV___in = altro_luogo_test_HIV___in;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___not___in(java.util.List<String> altro_luogo_test_HIV___not___in) {
            this.altro_luogo_test_HIV___not___in = altro_luogo_test_HIV___not___in;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___lt(String altro_luogo_test_HIV___lt) {
            this.altro_luogo_test_HIV___lt = altro_luogo_test_HIV___lt;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___lte(String altro_luogo_test_HIV___lte) {
            this.altro_luogo_test_HIV___lte = altro_luogo_test_HIV___lte;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___gt(String altro_luogo_test_HIV___gt) {
            this.altro_luogo_test_HIV___gt = altro_luogo_test_HIV___gt;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___gte(String altro_luogo_test_HIV___gte) {
            this.altro_luogo_test_HIV___gte = altro_luogo_test_HIV___gte;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___contains(String altro_luogo_test_HIV___contains) {
            this.altro_luogo_test_HIV___contains = altro_luogo_test_HIV___contains;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___not___contains(String altro_luogo_test_HIV___not___contains) {
            this.altro_luogo_test_HIV___not___contains = altro_luogo_test_HIV___not___contains;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___starts_with(String altro_luogo_test_HIV___starts_with) {
            this.altro_luogo_test_HIV___starts_with = altro_luogo_test_HIV___starts_with;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___not___starts_with(String altro_luogo_test_HIV___not___starts_with) {
            this.altro_luogo_test_HIV___not___starts_with = altro_luogo_test_HIV___not___starts_with;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___ends_with(String altro_luogo_test_HIV___ends_with) {
            this.altro_luogo_test_HIV___ends_with = altro_luogo_test_HIV___ends_with;
            return this;
        }

        public Builder setAltro_luogo_test_HIV___not___ends_with(String altro_luogo_test_HIV___not___ends_with) {
            this.altro_luogo_test_HIV___not___ends_with = altro_luogo_test_HIV___not___ends_with;
            return this;
        }

        public Builder setAnni_fumo_pregresso___eq(Integer anni_fumo_pregresso___eq) {
            this.anni_fumo_pregresso___eq = anni_fumo_pregresso___eq;
            return this;
        }

        public Builder setAnni_fumo_pregresso___ne(Integer anni_fumo_pregresso___ne) {
            this.anni_fumo_pregresso___ne = anni_fumo_pregresso___ne;
            return this;
        }

        public Builder setAnni_fumo_pregresso___null(Boolean anni_fumo_pregresso___null) {
            this.anni_fumo_pregresso___null = anni_fumo_pregresso___null;
            return this;
        }

        public Builder setAnni_fumo_pregresso___not___null(Boolean anni_fumo_pregresso___not___null) {
            this.anni_fumo_pregresso___not___null = anni_fumo_pregresso___not___null;
            return this;
        }

        public Builder setAnni_fumo_pregresso___in(java.util.List<Integer> anni_fumo_pregresso___in) {
            this.anni_fumo_pregresso___in = anni_fumo_pregresso___in;
            return this;
        }

        public Builder setAnni_fumo_pregresso___not___in(java.util.List<Integer> anni_fumo_pregresso___not___in) {
            this.anni_fumo_pregresso___not___in = anni_fumo_pregresso___not___in;
            return this;
        }

        public Builder setAnni_fumo_pregresso___lt(Integer anni_fumo_pregresso___lt) {
            this.anni_fumo_pregresso___lt = anni_fumo_pregresso___lt;
            return this;
        }

        public Builder setAnni_fumo_pregresso___lte(Integer anni_fumo_pregresso___lte) {
            this.anni_fumo_pregresso___lte = anni_fumo_pregresso___lte;
            return this;
        }

        public Builder setAnni_fumo_pregresso___gt(Integer anni_fumo_pregresso___gt) {
            this.anni_fumo_pregresso___gt = anni_fumo_pregresso___gt;
            return this;
        }

        public Builder setAnni_fumo_pregresso___gte(Integer anni_fumo_pregresso___gte) {
            this.anni_fumo_pregresso___gte = anni_fumo_pregresso___gte;
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

        public Builder setData_enrol___eq(String data_enrol___eq) {
            this.data_enrol___eq = data_enrol___eq;
            return this;
        }

        public Builder setData_enrol___ne(String data_enrol___ne) {
            this.data_enrol___ne = data_enrol___ne;
            return this;
        }

        public Builder setData_enrol___null(Boolean data_enrol___null) {
            this.data_enrol___null = data_enrol___null;
            return this;
        }

        public Builder setData_enrol___not___null(Boolean data_enrol___not___null) {
            this.data_enrol___not___null = data_enrol___not___null;
            return this;
        }

        public Builder setData_enrol___in(java.util.List<String> data_enrol___in) {
            this.data_enrol___in = data_enrol___in;
            return this;
        }

        public Builder setData_enrol___not___in(java.util.List<String> data_enrol___not___in) {
            this.data_enrol___not___in = data_enrol___not___in;
            return this;
        }

        public Builder setData_enrol___lt(String data_enrol___lt) {
            this.data_enrol___lt = data_enrol___lt;
            return this;
        }

        public Builder setData_enrol___lte(String data_enrol___lte) {
            this.data_enrol___lte = data_enrol___lte;
            return this;
        }

        public Builder setData_enrol___gt(String data_enrol___gt) {
            this.data_enrol___gt = data_enrol___gt;
            return this;
        }

        public Builder setData_enrol___gte(String data_enrol___gte) {
            this.data_enrol___gte = data_enrol___gte;
            return this;
        }

        public Builder setData_prima_prep___eq(String data_prima_prep___eq) {
            this.data_prima_prep___eq = data_prima_prep___eq;
            return this;
        }

        public Builder setData_prima_prep___ne(String data_prima_prep___ne) {
            this.data_prima_prep___ne = data_prima_prep___ne;
            return this;
        }

        public Builder setData_prima_prep___null(Boolean data_prima_prep___null) {
            this.data_prima_prep___null = data_prima_prep___null;
            return this;
        }

        public Builder setData_prima_prep___not___null(Boolean data_prima_prep___not___null) {
            this.data_prima_prep___not___null = data_prima_prep___not___null;
            return this;
        }

        public Builder setData_prima_prep___in(java.util.List<String> data_prima_prep___in) {
            this.data_prima_prep___in = data_prima_prep___in;
            return this;
        }

        public Builder setData_prima_prep___not___in(java.util.List<String> data_prima_prep___not___in) {
            this.data_prima_prep___not___in = data_prima_prep___not___in;
            return this;
        }

        public Builder setData_prima_prep___lt(String data_prima_prep___lt) {
            this.data_prima_prep___lt = data_prima_prep___lt;
            return this;
        }

        public Builder setData_prima_prep___lte(String data_prima_prep___lte) {
            this.data_prima_prep___lte = data_prima_prep___lte;
            return this;
        }

        public Builder setData_prima_prep___gt(String data_prima_prep___gt) {
            this.data_prima_prep___gt = data_prima_prep___gt;
            return this;
        }

        public Builder setData_prima_prep___gte(String data_prima_prep___gte) {
            this.data_prima_prep___gte = data_prima_prep___gte;
            return this;
        }

        public Builder setData_primo_riscontro_HIV___eq(String data_primo_riscontro_HIV___eq) {
            this.data_primo_riscontro_HIV___eq = data_primo_riscontro_HIV___eq;
            return this;
        }

        public Builder setData_primo_riscontro_HIV___ne(String data_primo_riscontro_HIV___ne) {
            this.data_primo_riscontro_HIV___ne = data_primo_riscontro_HIV___ne;
            return this;
        }

        public Builder setData_primo_riscontro_HIV___null(Boolean data_primo_riscontro_HIV___null) {
            this.data_primo_riscontro_HIV___null = data_primo_riscontro_HIV___null;
            return this;
        }

        public Builder setData_primo_riscontro_HIV___not___null(Boolean data_primo_riscontro_HIV___not___null) {
            this.data_primo_riscontro_HIV___not___null = data_primo_riscontro_HIV___not___null;
            return this;
        }

        public Builder setData_primo_riscontro_HIV___in(java.util.List<String> data_primo_riscontro_HIV___in) {
            this.data_primo_riscontro_HIV___in = data_primo_riscontro_HIV___in;
            return this;
        }

        public Builder setData_primo_riscontro_HIV___not___in(java.util.List<String> data_primo_riscontro_HIV___not___in) {
            this.data_primo_riscontro_HIV___not___in = data_primo_riscontro_HIV___not___in;
            return this;
        }

        public Builder setData_primo_riscontro_HIV___lt(String data_primo_riscontro_HIV___lt) {
            this.data_primo_riscontro_HIV___lt = data_primo_riscontro_HIV___lt;
            return this;
        }

        public Builder setData_primo_riscontro_HIV___lte(String data_primo_riscontro_HIV___lte) {
            this.data_primo_riscontro_HIV___lte = data_primo_riscontro_HIV___lte;
            return this;
        }

        public Builder setData_primo_riscontro_HIV___gt(String data_primo_riscontro_HIV___gt) {
            this.data_primo_riscontro_HIV___gt = data_primo_riscontro_HIV___gt;
            return this;
        }

        public Builder setData_primo_riscontro_HIV___gte(String data_primo_riscontro_HIV___gte) {
            this.data_primo_riscontro_HIV___gte = data_primo_riscontro_HIV___gte;
            return this;
        }

        public Builder setData_sieroconversione___eq(String data_sieroconversione___eq) {
            this.data_sieroconversione___eq = data_sieroconversione___eq;
            return this;
        }

        public Builder setData_sieroconversione___ne(String data_sieroconversione___ne) {
            this.data_sieroconversione___ne = data_sieroconversione___ne;
            return this;
        }

        public Builder setData_sieroconversione___null(Boolean data_sieroconversione___null) {
            this.data_sieroconversione___null = data_sieroconversione___null;
            return this;
        }

        public Builder setData_sieroconversione___not___null(Boolean data_sieroconversione___not___null) {
            this.data_sieroconversione___not___null = data_sieroconversione___not___null;
            return this;
        }

        public Builder setData_sieroconversione___in(java.util.List<String> data_sieroconversione___in) {
            this.data_sieroconversione___in = data_sieroconversione___in;
            return this;
        }

        public Builder setData_sieroconversione___not___in(java.util.List<String> data_sieroconversione___not___in) {
            this.data_sieroconversione___not___in = data_sieroconversione___not___in;
            return this;
        }

        public Builder setData_sieroconversione___lt(String data_sieroconversione___lt) {
            this.data_sieroconversione___lt = data_sieroconversione___lt;
            return this;
        }

        public Builder setData_sieroconversione___lte(String data_sieroconversione___lte) {
            this.data_sieroconversione___lte = data_sieroconversione___lte;
            return this;
        }

        public Builder setData_sieroconversione___gt(String data_sieroconversione___gt) {
            this.data_sieroconversione___gt = data_sieroconversione___gt;
            return this;
        }

        public Builder setData_sieroconversione___gte(String data_sieroconversione___gte) {
            this.data_sieroconversione___gte = data_sieroconversione___gte;
            return this;
        }

        public Builder setData_ultima_prep___eq(String data_ultima_prep___eq) {
            this.data_ultima_prep___eq = data_ultima_prep___eq;
            return this;
        }

        public Builder setData_ultima_prep___ne(String data_ultima_prep___ne) {
            this.data_ultima_prep___ne = data_ultima_prep___ne;
            return this;
        }

        public Builder setData_ultima_prep___null(Boolean data_ultima_prep___null) {
            this.data_ultima_prep___null = data_ultima_prep___null;
            return this;
        }

        public Builder setData_ultima_prep___not___null(Boolean data_ultima_prep___not___null) {
            this.data_ultima_prep___not___null = data_ultima_prep___not___null;
            return this;
        }

        public Builder setData_ultima_prep___in(java.util.List<String> data_ultima_prep___in) {
            this.data_ultima_prep___in = data_ultima_prep___in;
            return this;
        }

        public Builder setData_ultima_prep___not___in(java.util.List<String> data_ultima_prep___not___in) {
            this.data_ultima_prep___not___in = data_ultima_prep___not___in;
            return this;
        }

        public Builder setData_ultima_prep___lt(String data_ultima_prep___lt) {
            this.data_ultima_prep___lt = data_ultima_prep___lt;
            return this;
        }

        public Builder setData_ultima_prep___lte(String data_ultima_prep___lte) {
            this.data_ultima_prep___lte = data_ultima_prep___lte;
            return this;
        }

        public Builder setData_ultima_prep___gt(String data_ultima_prep___gt) {
            this.data_ultima_prep___gt = data_ultima_prep___gt;
            return this;
        }

        public Builder setData_ultima_prep___gte(String data_ultima_prep___gte) {
            this.data_ultima_prep___gte = data_ultima_prep___gte;
            return this;
        }

        public Builder setData_ultimo_test_negativo___eq(String data_ultimo_test_negativo___eq) {
            this.data_ultimo_test_negativo___eq = data_ultimo_test_negativo___eq;
            return this;
        }

        public Builder setData_ultimo_test_negativo___ne(String data_ultimo_test_negativo___ne) {
            this.data_ultimo_test_negativo___ne = data_ultimo_test_negativo___ne;
            return this;
        }

        public Builder setData_ultimo_test_negativo___null(Boolean data_ultimo_test_negativo___null) {
            this.data_ultimo_test_negativo___null = data_ultimo_test_negativo___null;
            return this;
        }

        public Builder setData_ultimo_test_negativo___not___null(Boolean data_ultimo_test_negativo___not___null) {
            this.data_ultimo_test_negativo___not___null = data_ultimo_test_negativo___not___null;
            return this;
        }

        public Builder setData_ultimo_test_negativo___in(java.util.List<String> data_ultimo_test_negativo___in) {
            this.data_ultimo_test_negativo___in = data_ultimo_test_negativo___in;
            return this;
        }

        public Builder setData_ultimo_test_negativo___not___in(java.util.List<String> data_ultimo_test_negativo___not___in) {
            this.data_ultimo_test_negativo___not___in = data_ultimo_test_negativo___not___in;
            return this;
        }

        public Builder setData_ultimo_test_negativo___lt(String data_ultimo_test_negativo___lt) {
            this.data_ultimo_test_negativo___lt = data_ultimo_test_negativo___lt;
            return this;
        }

        public Builder setData_ultimo_test_negativo___lte(String data_ultimo_test_negativo___lte) {
            this.data_ultimo_test_negativo___lte = data_ultimo_test_negativo___lte;
            return this;
        }

        public Builder setData_ultimo_test_negativo___gt(String data_ultimo_test_negativo___gt) {
            this.data_ultimo_test_negativo___gt = data_ultimo_test_negativo___gt;
            return this;
        }

        public Builder setData_ultimo_test_negativo___gte(String data_ultimo_test_negativo___gte) {
            this.data_ultimo_test_negativo___gte = data_ultimo_test_negativo___gte;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___eq(String familiarita_cardiovascolare___eq) {
            this.familiarita_cardiovascolare___eq = familiarita_cardiovascolare___eq;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___ne(String familiarita_cardiovascolare___ne) {
            this.familiarita_cardiovascolare___ne = familiarita_cardiovascolare___ne;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___null(Boolean familiarita_cardiovascolare___null) {
            this.familiarita_cardiovascolare___null = familiarita_cardiovascolare___null;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___not___null(Boolean familiarita_cardiovascolare___not___null) {
            this.familiarita_cardiovascolare___not___null = familiarita_cardiovascolare___not___null;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___in(java.util.List<String> familiarita_cardiovascolare___in) {
            this.familiarita_cardiovascolare___in = familiarita_cardiovascolare___in;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___not___in(java.util.List<String> familiarita_cardiovascolare___not___in) {
            this.familiarita_cardiovascolare___not___in = familiarita_cardiovascolare___not___in;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___lt(String familiarita_cardiovascolare___lt) {
            this.familiarita_cardiovascolare___lt = familiarita_cardiovascolare___lt;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___lte(String familiarita_cardiovascolare___lte) {
            this.familiarita_cardiovascolare___lte = familiarita_cardiovascolare___lte;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___gt(String familiarita_cardiovascolare___gt) {
            this.familiarita_cardiovascolare___gt = familiarita_cardiovascolare___gt;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___gte(String familiarita_cardiovascolare___gte) {
            this.familiarita_cardiovascolare___gte = familiarita_cardiovascolare___gte;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___contains(String familiarita_cardiovascolare___contains) {
            this.familiarita_cardiovascolare___contains = familiarita_cardiovascolare___contains;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___not___contains(String familiarita_cardiovascolare___not___contains) {
            this.familiarita_cardiovascolare___not___contains = familiarita_cardiovascolare___not___contains;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___starts_with(String familiarita_cardiovascolare___starts_with) {
            this.familiarita_cardiovascolare___starts_with = familiarita_cardiovascolare___starts_with;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___not___starts_with(String familiarita_cardiovascolare___not___starts_with) {
            this.familiarita_cardiovascolare___not___starts_with = familiarita_cardiovascolare___not___starts_with;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___ends_with(String familiarita_cardiovascolare___ends_with) {
            this.familiarita_cardiovascolare___ends_with = familiarita_cardiovascolare___ends_with;
            return this;
        }

        public Builder setFamiliarita_cardiovascolare___not___ends_with(String familiarita_cardiovascolare___not___ends_with) {
            this.familiarita_cardiovascolare___not___ends_with = familiarita_cardiovascolare___not___ends_with;
            return this;
        }

        public Builder setFumatore___eq(Boolean fumatore___eq) {
            this.fumatore___eq = fumatore___eq;
            return this;
        }

        public Builder setFumatore___ne(Boolean fumatore___ne) {
            this.fumatore___ne = fumatore___ne;
            return this;
        }

        public Builder setFumatore___null(Boolean fumatore___null) {
            this.fumatore___null = fumatore___null;
            return this;
        }

        public Builder setFumatore___not___null(Boolean fumatore___not___null) {
            this.fumatore___not___null = fumatore___not___null;
            return this;
        }

        public Builder setInfezione_acuta___eq(Boolean infezione_acuta___eq) {
            this.infezione_acuta___eq = infezione_acuta___eq;
            return this;
        }

        public Builder setInfezione_acuta___ne(Boolean infezione_acuta___ne) {
            this.infezione_acuta___ne = infezione_acuta___ne;
            return this;
        }

        public Builder setInfezione_acuta___null(Boolean infezione_acuta___null) {
            this.infezione_acuta___null = infezione_acuta___null;
            return this;
        }

        public Builder setInfezione_acuta___not___null(Boolean infezione_acuta___not___null) {
            this.infezione_acuta___not___null = infezione_acuta___not___null;
            return this;
        }

        public Builder setPaziente___eq(String paziente___eq) {
            this.paziente___eq = paziente___eq;
            return this;
        }

        public Builder setPaziente___ne(String paziente___ne) {
            this.paziente___ne = paziente___ne;
            return this;
        }

        public Builder setPaziente___null(Boolean paziente___null) {
            this.paziente___null = paziente___null;
            return this;
        }

        public Builder setPaziente___not___null(Boolean paziente___not___null) {
            this.paziente___not___null = paziente___not___null;
            return this;
        }

        public Builder setPaziente___in(java.util.List<String> paziente___in) {
            this.paziente___in = paziente___in;
            return this;
        }

        public Builder setPaziente___not___in(java.util.List<String> paziente___not___in) {
            this.paziente___not___in = paziente___not___in;
            return this;
        }

        public Builder setPaziente___lt(String paziente___lt) {
            this.paziente___lt = paziente___lt;
            return this;
        }

        public Builder setPaziente___lte(String paziente___lte) {
            this.paziente___lte = paziente___lte;
            return this;
        }

        public Builder setPaziente___gt(String paziente___gt) {
            this.paziente___gt = paziente___gt;
            return this;
        }

        public Builder setPaziente___gte(String paziente___gte) {
            this.paziente___gte = paziente___gte;
            return this;
        }

        public Builder setPaziente___contains(String paziente___contains) {
            this.paziente___contains = paziente___contains;
            return this;
        }

        public Builder setPaziente___not___contains(String paziente___not___contains) {
            this.paziente___not___contains = paziente___not___contains;
            return this;
        }

        public Builder setPaziente___starts_with(String paziente___starts_with) {
            this.paziente___starts_with = paziente___starts_with;
            return this;
        }

        public Builder setPaziente___not___starts_with(String paziente___not___starts_with) {
            this.paziente___not___starts_with = paziente___not___starts_with;
            return this;
        }

        public Builder setPaziente___ends_with(String paziente___ends_with) {
            this.paziente___ends_with = paziente___ends_with;
            return this;
        }

        public Builder setPaziente___not___ends_with(String paziente___not___ends_with) {
            this.paziente___not___ends_with = paziente___not___ends_with;
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

        public Builder setPrep_quotidiana___eq(Boolean prep_quotidiana___eq) {
            this.prep_quotidiana___eq = prep_quotidiana___eq;
            return this;
        }

        public Builder setPrep_quotidiana___ne(Boolean prep_quotidiana___ne) {
            this.prep_quotidiana___ne = prep_quotidiana___ne;
            return this;
        }

        public Builder setPrep_quotidiana___null(Boolean prep_quotidiana___null) {
            this.prep_quotidiana___null = prep_quotidiana___null;
            return this;
        }

        public Builder setPrep_quotidiana___not___null(Boolean prep_quotidiana___not___null) {
            this.prep_quotidiana___not___null = prep_quotidiana___not___null;
            return this;
        }

        public Builder setScolarita___eq(String scolarita___eq) {
            this.scolarita___eq = scolarita___eq;
            return this;
        }

        public Builder setScolarita___ne(String scolarita___ne) {
            this.scolarita___ne = scolarita___ne;
            return this;
        }

        public Builder setScolarita___null(Boolean scolarita___null) {
            this.scolarita___null = scolarita___null;
            return this;
        }

        public Builder setScolarita___not___null(Boolean scolarita___not___null) {
            this.scolarita___not___null = scolarita___not___null;
            return this;
        }

        public Builder setScolarita___in(java.util.List<String> scolarita___in) {
            this.scolarita___in = scolarita___in;
            return this;
        }

        public Builder setScolarita___not___in(java.util.List<String> scolarita___not___in) {
            this.scolarita___not___in = scolarita___not___in;
            return this;
        }

        public Builder setScolarita___lt(String scolarita___lt) {
            this.scolarita___lt = scolarita___lt;
            return this;
        }

        public Builder setScolarita___lte(String scolarita___lte) {
            this.scolarita___lte = scolarita___lte;
            return this;
        }

        public Builder setScolarita___gt(String scolarita___gt) {
            this.scolarita___gt = scolarita___gt;
            return this;
        }

        public Builder setScolarita___gte(String scolarita___gte) {
            this.scolarita___gte = scolarita___gte;
            return this;
        }

        public Builder setScolarita___contains(String scolarita___contains) {
            this.scolarita___contains = scolarita___contains;
            return this;
        }

        public Builder setScolarita___not___contains(String scolarita___not___contains) {
            this.scolarita___not___contains = scolarita___not___contains;
            return this;
        }

        public Builder setScolarita___starts_with(String scolarita___starts_with) {
            this.scolarita___starts_with = scolarita___starts_with;
            return this;
        }

        public Builder setScolarita___not___starts_with(String scolarita___not___starts_with) {
            this.scolarita___not___starts_with = scolarita___not___starts_with;
            return this;
        }

        public Builder setScolarita___ends_with(String scolarita___ends_with) {
            this.scolarita___ends_with = scolarita___ends_with;
            return this;
        }

        public Builder setScolarita___not___ends_with(String scolarita___not___ends_with) {
            this.scolarita___not___ends_with = scolarita___not___ends_with;
            return this;
        }

        public Builder setTeam___eq(String team___eq) {
            this.team___eq = team___eq;
            return this;
        }

        public Builder setTeam___ne(String team___ne) {
            this.team___ne = team___ne;
            return this;
        }

        public Builder setTeam___null(Boolean team___null) {
            this.team___null = team___null;
            return this;
        }

        public Builder setTeam___not___null(Boolean team___not___null) {
            this.team___not___null = team___not___null;
            return this;
        }

        public Builder setTeam___in(java.util.List<String> team___in) {
            this.team___in = team___in;
            return this;
        }

        public Builder setTeam___not___in(java.util.List<String> team___not___in) {
            this.team___not___in = team___not___in;
            return this;
        }

        public Builder setTeam___lt(String team___lt) {
            this.team___lt = team___lt;
            return this;
        }

        public Builder setTeam___lte(String team___lte) {
            this.team___lte = team___lte;
            return this;
        }

        public Builder setTeam___gt(String team___gt) {
            this.team___gt = team___gt;
            return this;
        }

        public Builder setTeam___gte(String team___gte) {
            this.team___gte = team___gte;
            return this;
        }

        public Builder setTeam___contains(String team___contains) {
            this.team___contains = team___contains;
            return this;
        }

        public Builder setTeam___not___contains(String team___not___contains) {
            this.team___not___contains = team___not___contains;
            return this;
        }

        public Builder setTeam___starts_with(String team___starts_with) {
            this.team___starts_with = team___starts_with;
            return this;
        }

        public Builder setTeam___not___starts_with(String team___not___starts_with) {
            this.team___not___starts_with = team___not___starts_with;
            return this;
        }

        public Builder setTeam___ends_with(String team___ends_with) {
            this.team___ends_with = team___ends_with;
            return this;
        }

        public Builder setTeam___not___ends_with(String team___not___ends_with) {
            this.team___not___ends_with = team___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliAnamnesiFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliAnamnesiFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliAnamnesiFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliAnamnesiFilterDTO build() {
            CliAnamnesiFilterDTO result = new CliAnamnesiFilterDTO();
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
            result.setAltro_luogo___eq(this.altro_luogo___eq);
            result.setAltro_luogo___ne(this.altro_luogo___ne);
            result.setAltro_luogo___null(this.altro_luogo___null);
            result.setAltro_luogo___not___null(this.altro_luogo___not___null);
            result.setAltro_luogo_test_HIV___eq(this.altro_luogo_test_HIV___eq);
            result.setAltro_luogo_test_HIV___ne(this.altro_luogo_test_HIV___ne);
            result.setAltro_luogo_test_HIV___null(this.altro_luogo_test_HIV___null);
            result.setAltro_luogo_test_HIV___not___null(this.altro_luogo_test_HIV___not___null);
            result.setAltro_luogo_test_HIV___in(this.altro_luogo_test_HIV___in);
            result.setAltro_luogo_test_HIV___not___in(this.altro_luogo_test_HIV___not___in);
            result.setAltro_luogo_test_HIV___lt(this.altro_luogo_test_HIV___lt);
            result.setAltro_luogo_test_HIV___lte(this.altro_luogo_test_HIV___lte);
            result.setAltro_luogo_test_HIV___gt(this.altro_luogo_test_HIV___gt);
            result.setAltro_luogo_test_HIV___gte(this.altro_luogo_test_HIV___gte);
            result.setAltro_luogo_test_HIV___contains(this.altro_luogo_test_HIV___contains);
            result.setAltro_luogo_test_HIV___not___contains(this.altro_luogo_test_HIV___not___contains);
            result.setAltro_luogo_test_HIV___starts_with(this.altro_luogo_test_HIV___starts_with);
            result.setAltro_luogo_test_HIV___not___starts_with(this.altro_luogo_test_HIV___not___starts_with);
            result.setAltro_luogo_test_HIV___ends_with(this.altro_luogo_test_HIV___ends_with);
            result.setAltro_luogo_test_HIV___not___ends_with(this.altro_luogo_test_HIV___not___ends_with);
            result.setAnni_fumo_pregresso___eq(this.anni_fumo_pregresso___eq);
            result.setAnni_fumo_pregresso___ne(this.anni_fumo_pregresso___ne);
            result.setAnni_fumo_pregresso___null(this.anni_fumo_pregresso___null);
            result.setAnni_fumo_pregresso___not___null(this.anni_fumo_pregresso___not___null);
            result.setAnni_fumo_pregresso___in(this.anni_fumo_pregresso___in);
            result.setAnni_fumo_pregresso___not___in(this.anni_fumo_pregresso___not___in);
            result.setAnni_fumo_pregresso___lt(this.anni_fumo_pregresso___lt);
            result.setAnni_fumo_pregresso___lte(this.anni_fumo_pregresso___lte);
            result.setAnni_fumo_pregresso___gt(this.anni_fumo_pregresso___gt);
            result.setAnni_fumo_pregresso___gte(this.anni_fumo_pregresso___gte);
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
            result.setData_enrol___eq(this.data_enrol___eq);
            result.setData_enrol___ne(this.data_enrol___ne);
            result.setData_enrol___null(this.data_enrol___null);
            result.setData_enrol___not___null(this.data_enrol___not___null);
            result.setData_enrol___in(this.data_enrol___in);
            result.setData_enrol___not___in(this.data_enrol___not___in);
            result.setData_enrol___lt(this.data_enrol___lt);
            result.setData_enrol___lte(this.data_enrol___lte);
            result.setData_enrol___gt(this.data_enrol___gt);
            result.setData_enrol___gte(this.data_enrol___gte);
            result.setData_prima_prep___eq(this.data_prima_prep___eq);
            result.setData_prima_prep___ne(this.data_prima_prep___ne);
            result.setData_prima_prep___null(this.data_prima_prep___null);
            result.setData_prima_prep___not___null(this.data_prima_prep___not___null);
            result.setData_prima_prep___in(this.data_prima_prep___in);
            result.setData_prima_prep___not___in(this.data_prima_prep___not___in);
            result.setData_prima_prep___lt(this.data_prima_prep___lt);
            result.setData_prima_prep___lte(this.data_prima_prep___lte);
            result.setData_prima_prep___gt(this.data_prima_prep___gt);
            result.setData_prima_prep___gte(this.data_prima_prep___gte);
            result.setData_primo_riscontro_HIV___eq(this.data_primo_riscontro_HIV___eq);
            result.setData_primo_riscontro_HIV___ne(this.data_primo_riscontro_HIV___ne);
            result.setData_primo_riscontro_HIV___null(this.data_primo_riscontro_HIV___null);
            result.setData_primo_riscontro_HIV___not___null(this.data_primo_riscontro_HIV___not___null);
            result.setData_primo_riscontro_HIV___in(this.data_primo_riscontro_HIV___in);
            result.setData_primo_riscontro_HIV___not___in(this.data_primo_riscontro_HIV___not___in);
            result.setData_primo_riscontro_HIV___lt(this.data_primo_riscontro_HIV___lt);
            result.setData_primo_riscontro_HIV___lte(this.data_primo_riscontro_HIV___lte);
            result.setData_primo_riscontro_HIV___gt(this.data_primo_riscontro_HIV___gt);
            result.setData_primo_riscontro_HIV___gte(this.data_primo_riscontro_HIV___gte);
            result.setData_sieroconversione___eq(this.data_sieroconversione___eq);
            result.setData_sieroconversione___ne(this.data_sieroconversione___ne);
            result.setData_sieroconversione___null(this.data_sieroconversione___null);
            result.setData_sieroconversione___not___null(this.data_sieroconversione___not___null);
            result.setData_sieroconversione___in(this.data_sieroconversione___in);
            result.setData_sieroconversione___not___in(this.data_sieroconversione___not___in);
            result.setData_sieroconversione___lt(this.data_sieroconversione___lt);
            result.setData_sieroconversione___lte(this.data_sieroconversione___lte);
            result.setData_sieroconversione___gt(this.data_sieroconversione___gt);
            result.setData_sieroconversione___gte(this.data_sieroconversione___gte);
            result.setData_ultima_prep___eq(this.data_ultima_prep___eq);
            result.setData_ultima_prep___ne(this.data_ultima_prep___ne);
            result.setData_ultima_prep___null(this.data_ultima_prep___null);
            result.setData_ultima_prep___not___null(this.data_ultima_prep___not___null);
            result.setData_ultima_prep___in(this.data_ultima_prep___in);
            result.setData_ultima_prep___not___in(this.data_ultima_prep___not___in);
            result.setData_ultima_prep___lt(this.data_ultima_prep___lt);
            result.setData_ultima_prep___lte(this.data_ultima_prep___lte);
            result.setData_ultima_prep___gt(this.data_ultima_prep___gt);
            result.setData_ultima_prep___gte(this.data_ultima_prep___gte);
            result.setData_ultimo_test_negativo___eq(this.data_ultimo_test_negativo___eq);
            result.setData_ultimo_test_negativo___ne(this.data_ultimo_test_negativo___ne);
            result.setData_ultimo_test_negativo___null(this.data_ultimo_test_negativo___null);
            result.setData_ultimo_test_negativo___not___null(this.data_ultimo_test_negativo___not___null);
            result.setData_ultimo_test_negativo___in(this.data_ultimo_test_negativo___in);
            result.setData_ultimo_test_negativo___not___in(this.data_ultimo_test_negativo___not___in);
            result.setData_ultimo_test_negativo___lt(this.data_ultimo_test_negativo___lt);
            result.setData_ultimo_test_negativo___lte(this.data_ultimo_test_negativo___lte);
            result.setData_ultimo_test_negativo___gt(this.data_ultimo_test_negativo___gt);
            result.setData_ultimo_test_negativo___gte(this.data_ultimo_test_negativo___gte);
            result.setFamiliarita_cardiovascolare___eq(this.familiarita_cardiovascolare___eq);
            result.setFamiliarita_cardiovascolare___ne(this.familiarita_cardiovascolare___ne);
            result.setFamiliarita_cardiovascolare___null(this.familiarita_cardiovascolare___null);
            result.setFamiliarita_cardiovascolare___not___null(this.familiarita_cardiovascolare___not___null);
            result.setFamiliarita_cardiovascolare___in(this.familiarita_cardiovascolare___in);
            result.setFamiliarita_cardiovascolare___not___in(this.familiarita_cardiovascolare___not___in);
            result.setFamiliarita_cardiovascolare___lt(this.familiarita_cardiovascolare___lt);
            result.setFamiliarita_cardiovascolare___lte(this.familiarita_cardiovascolare___lte);
            result.setFamiliarita_cardiovascolare___gt(this.familiarita_cardiovascolare___gt);
            result.setFamiliarita_cardiovascolare___gte(this.familiarita_cardiovascolare___gte);
            result.setFamiliarita_cardiovascolare___contains(this.familiarita_cardiovascolare___contains);
            result.setFamiliarita_cardiovascolare___not___contains(this.familiarita_cardiovascolare___not___contains);
            result.setFamiliarita_cardiovascolare___starts_with(this.familiarita_cardiovascolare___starts_with);
            result.setFamiliarita_cardiovascolare___not___starts_with(this.familiarita_cardiovascolare___not___starts_with);
            result.setFamiliarita_cardiovascolare___ends_with(this.familiarita_cardiovascolare___ends_with);
            result.setFamiliarita_cardiovascolare___not___ends_with(this.familiarita_cardiovascolare___not___ends_with);
            result.setFumatore___eq(this.fumatore___eq);
            result.setFumatore___ne(this.fumatore___ne);
            result.setFumatore___null(this.fumatore___null);
            result.setFumatore___not___null(this.fumatore___not___null);
            result.setInfezione_acuta___eq(this.infezione_acuta___eq);
            result.setInfezione_acuta___ne(this.infezione_acuta___ne);
            result.setInfezione_acuta___null(this.infezione_acuta___null);
            result.setInfezione_acuta___not___null(this.infezione_acuta___not___null);
            result.setPaziente___eq(this.paziente___eq);
            result.setPaziente___ne(this.paziente___ne);
            result.setPaziente___null(this.paziente___null);
            result.setPaziente___not___null(this.paziente___not___null);
            result.setPaziente___in(this.paziente___in);
            result.setPaziente___not___in(this.paziente___not___in);
            result.setPaziente___lt(this.paziente___lt);
            result.setPaziente___lte(this.paziente___lte);
            result.setPaziente___gt(this.paziente___gt);
            result.setPaziente___gte(this.paziente___gte);
            result.setPaziente___contains(this.paziente___contains);
            result.setPaziente___not___contains(this.paziente___not___contains);
            result.setPaziente___starts_with(this.paziente___starts_with);
            result.setPaziente___not___starts_with(this.paziente___not___starts_with);
            result.setPaziente___ends_with(this.paziente___ends_with);
            result.setPaziente___not___ends_with(this.paziente___not___ends_with);
            result.setPrep___eq(this.prep___eq);
            result.setPrep___ne(this.prep___ne);
            result.setPrep___null(this.prep___null);
            result.setPrep___not___null(this.prep___not___null);
            result.setPrep_quotidiana___eq(this.prep_quotidiana___eq);
            result.setPrep_quotidiana___ne(this.prep_quotidiana___ne);
            result.setPrep_quotidiana___null(this.prep_quotidiana___null);
            result.setPrep_quotidiana___not___null(this.prep_quotidiana___not___null);
            result.setScolarita___eq(this.scolarita___eq);
            result.setScolarita___ne(this.scolarita___ne);
            result.setScolarita___null(this.scolarita___null);
            result.setScolarita___not___null(this.scolarita___not___null);
            result.setScolarita___in(this.scolarita___in);
            result.setScolarita___not___in(this.scolarita___not___in);
            result.setScolarita___lt(this.scolarita___lt);
            result.setScolarita___lte(this.scolarita___lte);
            result.setScolarita___gt(this.scolarita___gt);
            result.setScolarita___gte(this.scolarita___gte);
            result.setScolarita___contains(this.scolarita___contains);
            result.setScolarita___not___contains(this.scolarita___not___contains);
            result.setScolarita___starts_with(this.scolarita___starts_with);
            result.setScolarita___not___starts_with(this.scolarita___not___starts_with);
            result.setScolarita___ends_with(this.scolarita___ends_with);
            result.setScolarita___not___ends_with(this.scolarita___not___ends_with);
            result.setTeam___eq(this.team___eq);
            result.setTeam___ne(this.team___ne);
            result.setTeam___null(this.team___null);
            result.setTeam___not___null(this.team___not___null);
            result.setTeam___in(this.team___in);
            result.setTeam___not___in(this.team___not___in);
            result.setTeam___lt(this.team___lt);
            result.setTeam___lte(this.team___lte);
            result.setTeam___gt(this.team___gt);
            result.setTeam___gte(this.team___gte);
            result.setTeam___contains(this.team___contains);
            result.setTeam___not___contains(this.team___not___contains);
            result.setTeam___starts_with(this.team___starts_with);
            result.setTeam___not___starts_with(this.team___not___starts_with);
            result.setTeam___ends_with(this.team___ends_with);
            result.setTeam___not___ends_with(this.team___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
