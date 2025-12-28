package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Dropout.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliDropoutFilterDTO implements java.io.Serializable {

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
    private String altro_causa_decesso___eq;
    private String altro_causa_decesso___ne;
    private Boolean altro_causa_decesso___null;
    private Boolean altro_causa_decesso___not___null;
    private java.util.List<String> altro_causa_decesso___in;
    private java.util.List<String> altro_causa_decesso___not___in;
    private String altro_causa_decesso___lt;
    private String altro_causa_decesso___lte;
    private String altro_causa_decesso___gt;
    private String altro_causa_decesso___gte;
    private String altro_causa_decesso___contains;
    private String altro_causa_decesso___not___contains;
    private String altro_causa_decesso___starts_with;
    private String altro_causa_decesso___not___starts_with;
    private String altro_causa_decesso___ends_with;
    private String altro_causa_decesso___not___ends_with;
    private String altro_motivo_drop___eq;
    private String altro_motivo_drop___ne;
    private Boolean altro_motivo_drop___null;
    private Boolean altro_motivo_drop___not___null;
    private java.util.List<String> altro_motivo_drop___in;
    private java.util.List<String> altro_motivo_drop___not___in;
    private String altro_motivo_drop___lt;
    private String altro_motivo_drop___lte;
    private String altro_motivo_drop___gt;
    private String altro_motivo_drop___gte;
    private String altro_motivo_drop___contains;
    private String altro_motivo_drop___not___contains;
    private String altro_motivo_drop___starts_with;
    private String altro_motivo_drop___not___starts_with;
    private String altro_motivo_drop___ends_with;
    private String altro_motivo_drop___not___ends_with;
    private String altro_sede_decesso___eq;
    private String altro_sede_decesso___ne;
    private Boolean altro_sede_decesso___null;
    private Boolean altro_sede_decesso___not___null;
    private java.util.List<String> altro_sede_decesso___in;
    private java.util.List<String> altro_sede_decesso___not___in;
    private String altro_sede_decesso___lt;
    private String altro_sede_decesso___lte;
    private String altro_sede_decesso___gt;
    private String altro_sede_decesso___gte;
    private String altro_sede_decesso___contains;
    private String altro_sede_decesso___not___contains;
    private String altro_sede_decesso___starts_with;
    private String altro_sede_decesso___not___starts_with;
    private String altro_sede_decesso___ends_with;
    private String altro_sede_decesso___not___ends_with;
    private Boolean autopsia___eq;
    private Boolean autopsia___ne;
    private Boolean autopsia___null;
    private Boolean autopsia___not___null;
    private String causa_decesso_nome1___eq;
    private String causa_decesso_nome1___ne;
    private Boolean causa_decesso_nome1___null;
    private Boolean causa_decesso_nome1___not___null;
    private java.util.List<String> causa_decesso_nome1___in;
    private java.util.List<String> causa_decesso_nome1___not___in;
    private String causa_decesso_nome1___lt;
    private String causa_decesso_nome1___lte;
    private String causa_decesso_nome1___gt;
    private String causa_decesso_nome1___gte;
    private String causa_decesso_nome1___contains;
    private String causa_decesso_nome1___not___contains;
    private String causa_decesso_nome1___starts_with;
    private String causa_decesso_nome1___not___starts_with;
    private String causa_decesso_nome1___ends_with;
    private String causa_decesso_nome1___not___ends_with;
    private String causa_decesso_nome2___eq;
    private String causa_decesso_nome2___ne;
    private Boolean causa_decesso_nome2___null;
    private Boolean causa_decesso_nome2___not___null;
    private java.util.List<String> causa_decesso_nome2___in;
    private java.util.List<String> causa_decesso_nome2___not___in;
    private String causa_decesso_nome2___lt;
    private String causa_decesso_nome2___lte;
    private String causa_decesso_nome2___gt;
    private String causa_decesso_nome2___gte;
    private String causa_decesso_nome2___contains;
    private String causa_decesso_nome2___not___contains;
    private String causa_decesso_nome2___starts_with;
    private String causa_decesso_nome2___not___starts_with;
    private String causa_decesso_nome2___ends_with;
    private String causa_decesso_nome2___not___ends_with;
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
    private String data___eq;
    private String data___ne;
    private Boolean data___null;
    private Boolean data___not___null;
    private java.util.List<String> data___in;
    private java.util.List<String> data___not___in;
    private String data___lt;
    private String data___lte;
    private String data___gt;
    private String data___gte;
    private String data_decesso___eq;
    private String data_decesso___ne;
    private Boolean data_decesso___null;
    private Boolean data_decesso___not___null;
    private java.util.List<String> data_decesso___in;
    private java.util.List<String> data_decesso___not___in;
    private String data_decesso___lt;
    private String data_decesso___lte;
    private String data_decesso___gt;
    private String data_decesso___gte;
    private String data_status_vita___eq;
    private String data_status_vita___ne;
    private Boolean data_status_vita___null;
    private Boolean data_status_vita___not___null;
    private java.util.List<String> data_status_vita___in;
    private java.util.List<String> data_status_vita___not___in;
    private String data_status_vita___lt;
    private String data_status_vita___lte;
    private String data_status_vita___gt;
    private String data_status_vita___gte;
    private Boolean deceduto___eq;
    private Boolean deceduto___ne;
    private Boolean deceduto___null;
    private Boolean deceduto___not___null;
    private String luogo_decesso___eq;
    private String luogo_decesso___ne;
    private Boolean luogo_decesso___null;
    private Boolean luogo_decesso___not___null;
    private java.util.List<String> luogo_decesso___in;
    private java.util.List<String> luogo_decesso___not___in;
    private String luogo_decesso___lt;
    private String luogo_decesso___lte;
    private String luogo_decesso___gt;
    private String luogo_decesso___gte;
    private String luogo_decesso___contains;
    private String luogo_decesso___not___contains;
    private String luogo_decesso___starts_with;
    private String luogo_decesso___not___starts_with;
    private String luogo_decesso___ends_with;
    private String luogo_decesso___not___ends_with;
    private String motivo_decesso___eq;
    private String motivo_decesso___ne;
    private Boolean motivo_decesso___null;
    private Boolean motivo_decesso___not___null;
    private java.util.List<String> motivo_decesso___in;
    private java.util.List<String> motivo_decesso___not___in;
    private String motivo_decesso___lt;
    private String motivo_decesso___lte;
    private String motivo_decesso___gt;
    private String motivo_decesso___gte;
    private String motivo_decesso___contains;
    private String motivo_decesso___not___contains;
    private String motivo_decesso___starts_with;
    private String motivo_decesso___not___starts_with;
    private String motivo_decesso___ends_with;
    private String motivo_decesso___not___ends_with;
    private String motivo_dropout___eq;
    private String motivo_dropout___ne;
    private Boolean motivo_dropout___null;
    private Boolean motivo_dropout___not___null;
    private java.util.List<String> motivo_dropout___in;
    private java.util.List<String> motivo_dropout___not___in;
    private String motivo_dropout___lt;
    private String motivo_dropout___lte;
    private String motivo_dropout___gt;
    private String motivo_dropout___gte;
    private String motivo_dropout___contains;
    private String motivo_dropout___not___contains;
    private String motivo_dropout___starts_with;
    private String motivo_dropout___not___starts_with;
    private String motivo_dropout___ends_with;
    private String motivo_dropout___not___ends_with;
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
    private String status_vita___eq;
    private String status_vita___ne;
    private Boolean status_vita___null;
    private Boolean status_vita___not___null;
    private java.util.List<String> status_vita___in;
    private java.util.List<String> status_vita___not___in;
    private String status_vita___lt;
    private String status_vita___lte;
    private String status_vita___gt;
    private String status_vita___gte;
    private String status_vita___contains;
    private String status_vita___not___contains;
    private String status_vita___starts_with;
    private String status_vita___not___starts_with;
    private String status_vita___ends_with;
    private String status_vita___not___ends_with;
    private String ultima_visita_ok___eq;
    private String ultima_visita_ok___ne;
    private Boolean ultima_visita_ok___null;
    private Boolean ultima_visita_ok___not___null;
    private java.util.List<String> ultima_visita_ok___in;
    private java.util.List<String> ultima_visita_ok___not___in;
    private String ultima_visita_ok___lt;
    private String ultima_visita_ok___lte;
    private String ultima_visita_ok___gt;
    private String ultima_visita_ok___gte;
    private Boolean undropped___eq;
    private Boolean undropped___ne;
    private Boolean undropped___null;
    private Boolean undropped___not___null;
    private java.util.List<CliDropoutFilterDTO> AND;
    private java.util.List<CliDropoutFilterDTO> OR;
    private CliDropoutFilterDTO NOT;

    public CliDropoutFilterDTO() {
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

    public String getAltro_causa_decesso___eq() {
        return altro_causa_decesso___eq;
    }
    public void setAltro_causa_decesso___eq(String altro_causa_decesso___eq) {
        this.altro_causa_decesso___eq = altro_causa_decesso___eq;
    }

    public String getAltro_causa_decesso___ne() {
        return altro_causa_decesso___ne;
    }
    public void setAltro_causa_decesso___ne(String altro_causa_decesso___ne) {
        this.altro_causa_decesso___ne = altro_causa_decesso___ne;
    }

    public Boolean getAltro_causa_decesso___null() {
        return altro_causa_decesso___null;
    }
    public void setAltro_causa_decesso___null(Boolean altro_causa_decesso___null) {
        this.altro_causa_decesso___null = altro_causa_decesso___null;
    }

    public Boolean getAltro_causa_decesso___not___null() {
        return altro_causa_decesso___not___null;
    }
    public void setAltro_causa_decesso___not___null(Boolean altro_causa_decesso___not___null) {
        this.altro_causa_decesso___not___null = altro_causa_decesso___not___null;
    }

    public java.util.List<String> getAltro_causa_decesso___in() {
        return altro_causa_decesso___in;
    }
    public void setAltro_causa_decesso___in(java.util.List<String> altro_causa_decesso___in) {
        this.altro_causa_decesso___in = altro_causa_decesso___in;
    }

    public java.util.List<String> getAltro_causa_decesso___not___in() {
        return altro_causa_decesso___not___in;
    }
    public void setAltro_causa_decesso___not___in(java.util.List<String> altro_causa_decesso___not___in) {
        this.altro_causa_decesso___not___in = altro_causa_decesso___not___in;
    }

    public String getAltro_causa_decesso___lt() {
        return altro_causa_decesso___lt;
    }
    public void setAltro_causa_decesso___lt(String altro_causa_decesso___lt) {
        this.altro_causa_decesso___lt = altro_causa_decesso___lt;
    }

    public String getAltro_causa_decesso___lte() {
        return altro_causa_decesso___lte;
    }
    public void setAltro_causa_decesso___lte(String altro_causa_decesso___lte) {
        this.altro_causa_decesso___lte = altro_causa_decesso___lte;
    }

    public String getAltro_causa_decesso___gt() {
        return altro_causa_decesso___gt;
    }
    public void setAltro_causa_decesso___gt(String altro_causa_decesso___gt) {
        this.altro_causa_decesso___gt = altro_causa_decesso___gt;
    }

    public String getAltro_causa_decesso___gte() {
        return altro_causa_decesso___gte;
    }
    public void setAltro_causa_decesso___gte(String altro_causa_decesso___gte) {
        this.altro_causa_decesso___gte = altro_causa_decesso___gte;
    }

    public String getAltro_causa_decesso___contains() {
        return altro_causa_decesso___contains;
    }
    public void setAltro_causa_decesso___contains(String altro_causa_decesso___contains) {
        this.altro_causa_decesso___contains = altro_causa_decesso___contains;
    }

    public String getAltro_causa_decesso___not___contains() {
        return altro_causa_decesso___not___contains;
    }
    public void setAltro_causa_decesso___not___contains(String altro_causa_decesso___not___contains) {
        this.altro_causa_decesso___not___contains = altro_causa_decesso___not___contains;
    }

    public String getAltro_causa_decesso___starts_with() {
        return altro_causa_decesso___starts_with;
    }
    public void setAltro_causa_decesso___starts_with(String altro_causa_decesso___starts_with) {
        this.altro_causa_decesso___starts_with = altro_causa_decesso___starts_with;
    }

    public String getAltro_causa_decesso___not___starts_with() {
        return altro_causa_decesso___not___starts_with;
    }
    public void setAltro_causa_decesso___not___starts_with(String altro_causa_decesso___not___starts_with) {
        this.altro_causa_decesso___not___starts_with = altro_causa_decesso___not___starts_with;
    }

    public String getAltro_causa_decesso___ends_with() {
        return altro_causa_decesso___ends_with;
    }
    public void setAltro_causa_decesso___ends_with(String altro_causa_decesso___ends_with) {
        this.altro_causa_decesso___ends_with = altro_causa_decesso___ends_with;
    }

    public String getAltro_causa_decesso___not___ends_with() {
        return altro_causa_decesso___not___ends_with;
    }
    public void setAltro_causa_decesso___not___ends_with(String altro_causa_decesso___not___ends_with) {
        this.altro_causa_decesso___not___ends_with = altro_causa_decesso___not___ends_with;
    }

    public String getAltro_motivo_drop___eq() {
        return altro_motivo_drop___eq;
    }
    public void setAltro_motivo_drop___eq(String altro_motivo_drop___eq) {
        this.altro_motivo_drop___eq = altro_motivo_drop___eq;
    }

    public String getAltro_motivo_drop___ne() {
        return altro_motivo_drop___ne;
    }
    public void setAltro_motivo_drop___ne(String altro_motivo_drop___ne) {
        this.altro_motivo_drop___ne = altro_motivo_drop___ne;
    }

    public Boolean getAltro_motivo_drop___null() {
        return altro_motivo_drop___null;
    }
    public void setAltro_motivo_drop___null(Boolean altro_motivo_drop___null) {
        this.altro_motivo_drop___null = altro_motivo_drop___null;
    }

    public Boolean getAltro_motivo_drop___not___null() {
        return altro_motivo_drop___not___null;
    }
    public void setAltro_motivo_drop___not___null(Boolean altro_motivo_drop___not___null) {
        this.altro_motivo_drop___not___null = altro_motivo_drop___not___null;
    }

    public java.util.List<String> getAltro_motivo_drop___in() {
        return altro_motivo_drop___in;
    }
    public void setAltro_motivo_drop___in(java.util.List<String> altro_motivo_drop___in) {
        this.altro_motivo_drop___in = altro_motivo_drop___in;
    }

    public java.util.List<String> getAltro_motivo_drop___not___in() {
        return altro_motivo_drop___not___in;
    }
    public void setAltro_motivo_drop___not___in(java.util.List<String> altro_motivo_drop___not___in) {
        this.altro_motivo_drop___not___in = altro_motivo_drop___not___in;
    }

    public String getAltro_motivo_drop___lt() {
        return altro_motivo_drop___lt;
    }
    public void setAltro_motivo_drop___lt(String altro_motivo_drop___lt) {
        this.altro_motivo_drop___lt = altro_motivo_drop___lt;
    }

    public String getAltro_motivo_drop___lte() {
        return altro_motivo_drop___lte;
    }
    public void setAltro_motivo_drop___lte(String altro_motivo_drop___lte) {
        this.altro_motivo_drop___lte = altro_motivo_drop___lte;
    }

    public String getAltro_motivo_drop___gt() {
        return altro_motivo_drop___gt;
    }
    public void setAltro_motivo_drop___gt(String altro_motivo_drop___gt) {
        this.altro_motivo_drop___gt = altro_motivo_drop___gt;
    }

    public String getAltro_motivo_drop___gte() {
        return altro_motivo_drop___gte;
    }
    public void setAltro_motivo_drop___gte(String altro_motivo_drop___gte) {
        this.altro_motivo_drop___gte = altro_motivo_drop___gte;
    }

    public String getAltro_motivo_drop___contains() {
        return altro_motivo_drop___contains;
    }
    public void setAltro_motivo_drop___contains(String altro_motivo_drop___contains) {
        this.altro_motivo_drop___contains = altro_motivo_drop___contains;
    }

    public String getAltro_motivo_drop___not___contains() {
        return altro_motivo_drop___not___contains;
    }
    public void setAltro_motivo_drop___not___contains(String altro_motivo_drop___not___contains) {
        this.altro_motivo_drop___not___contains = altro_motivo_drop___not___contains;
    }

    public String getAltro_motivo_drop___starts_with() {
        return altro_motivo_drop___starts_with;
    }
    public void setAltro_motivo_drop___starts_with(String altro_motivo_drop___starts_with) {
        this.altro_motivo_drop___starts_with = altro_motivo_drop___starts_with;
    }

    public String getAltro_motivo_drop___not___starts_with() {
        return altro_motivo_drop___not___starts_with;
    }
    public void setAltro_motivo_drop___not___starts_with(String altro_motivo_drop___not___starts_with) {
        this.altro_motivo_drop___not___starts_with = altro_motivo_drop___not___starts_with;
    }

    public String getAltro_motivo_drop___ends_with() {
        return altro_motivo_drop___ends_with;
    }
    public void setAltro_motivo_drop___ends_with(String altro_motivo_drop___ends_with) {
        this.altro_motivo_drop___ends_with = altro_motivo_drop___ends_with;
    }

    public String getAltro_motivo_drop___not___ends_with() {
        return altro_motivo_drop___not___ends_with;
    }
    public void setAltro_motivo_drop___not___ends_with(String altro_motivo_drop___not___ends_with) {
        this.altro_motivo_drop___not___ends_with = altro_motivo_drop___not___ends_with;
    }

    public String getAltro_sede_decesso___eq() {
        return altro_sede_decesso___eq;
    }
    public void setAltro_sede_decesso___eq(String altro_sede_decesso___eq) {
        this.altro_sede_decesso___eq = altro_sede_decesso___eq;
    }

    public String getAltro_sede_decesso___ne() {
        return altro_sede_decesso___ne;
    }
    public void setAltro_sede_decesso___ne(String altro_sede_decesso___ne) {
        this.altro_sede_decesso___ne = altro_sede_decesso___ne;
    }

    public Boolean getAltro_sede_decesso___null() {
        return altro_sede_decesso___null;
    }
    public void setAltro_sede_decesso___null(Boolean altro_sede_decesso___null) {
        this.altro_sede_decesso___null = altro_sede_decesso___null;
    }

    public Boolean getAltro_sede_decesso___not___null() {
        return altro_sede_decesso___not___null;
    }
    public void setAltro_sede_decesso___not___null(Boolean altro_sede_decesso___not___null) {
        this.altro_sede_decesso___not___null = altro_sede_decesso___not___null;
    }

    public java.util.List<String> getAltro_sede_decesso___in() {
        return altro_sede_decesso___in;
    }
    public void setAltro_sede_decesso___in(java.util.List<String> altro_sede_decesso___in) {
        this.altro_sede_decesso___in = altro_sede_decesso___in;
    }

    public java.util.List<String> getAltro_sede_decesso___not___in() {
        return altro_sede_decesso___not___in;
    }
    public void setAltro_sede_decesso___not___in(java.util.List<String> altro_sede_decesso___not___in) {
        this.altro_sede_decesso___not___in = altro_sede_decesso___not___in;
    }

    public String getAltro_sede_decesso___lt() {
        return altro_sede_decesso___lt;
    }
    public void setAltro_sede_decesso___lt(String altro_sede_decesso___lt) {
        this.altro_sede_decesso___lt = altro_sede_decesso___lt;
    }

    public String getAltro_sede_decesso___lte() {
        return altro_sede_decesso___lte;
    }
    public void setAltro_sede_decesso___lte(String altro_sede_decesso___lte) {
        this.altro_sede_decesso___lte = altro_sede_decesso___lte;
    }

    public String getAltro_sede_decesso___gt() {
        return altro_sede_decesso___gt;
    }
    public void setAltro_sede_decesso___gt(String altro_sede_decesso___gt) {
        this.altro_sede_decesso___gt = altro_sede_decesso___gt;
    }

    public String getAltro_sede_decesso___gte() {
        return altro_sede_decesso___gte;
    }
    public void setAltro_sede_decesso___gte(String altro_sede_decesso___gte) {
        this.altro_sede_decesso___gte = altro_sede_decesso___gte;
    }

    public String getAltro_sede_decesso___contains() {
        return altro_sede_decesso___contains;
    }
    public void setAltro_sede_decesso___contains(String altro_sede_decesso___contains) {
        this.altro_sede_decesso___contains = altro_sede_decesso___contains;
    }

    public String getAltro_sede_decesso___not___contains() {
        return altro_sede_decesso___not___contains;
    }
    public void setAltro_sede_decesso___not___contains(String altro_sede_decesso___not___contains) {
        this.altro_sede_decesso___not___contains = altro_sede_decesso___not___contains;
    }

    public String getAltro_sede_decesso___starts_with() {
        return altro_sede_decesso___starts_with;
    }
    public void setAltro_sede_decesso___starts_with(String altro_sede_decesso___starts_with) {
        this.altro_sede_decesso___starts_with = altro_sede_decesso___starts_with;
    }

    public String getAltro_sede_decesso___not___starts_with() {
        return altro_sede_decesso___not___starts_with;
    }
    public void setAltro_sede_decesso___not___starts_with(String altro_sede_decesso___not___starts_with) {
        this.altro_sede_decesso___not___starts_with = altro_sede_decesso___not___starts_with;
    }

    public String getAltro_sede_decesso___ends_with() {
        return altro_sede_decesso___ends_with;
    }
    public void setAltro_sede_decesso___ends_with(String altro_sede_decesso___ends_with) {
        this.altro_sede_decesso___ends_with = altro_sede_decesso___ends_with;
    }

    public String getAltro_sede_decesso___not___ends_with() {
        return altro_sede_decesso___not___ends_with;
    }
    public void setAltro_sede_decesso___not___ends_with(String altro_sede_decesso___not___ends_with) {
        this.altro_sede_decesso___not___ends_with = altro_sede_decesso___not___ends_with;
    }

    public Boolean getAutopsia___eq() {
        return autopsia___eq;
    }
    public void setAutopsia___eq(Boolean autopsia___eq) {
        this.autopsia___eq = autopsia___eq;
    }

    public Boolean getAutopsia___ne() {
        return autopsia___ne;
    }
    public void setAutopsia___ne(Boolean autopsia___ne) {
        this.autopsia___ne = autopsia___ne;
    }

    public Boolean getAutopsia___null() {
        return autopsia___null;
    }
    public void setAutopsia___null(Boolean autopsia___null) {
        this.autopsia___null = autopsia___null;
    }

    public Boolean getAutopsia___not___null() {
        return autopsia___not___null;
    }
    public void setAutopsia___not___null(Boolean autopsia___not___null) {
        this.autopsia___not___null = autopsia___not___null;
    }

    public String getCausa_decesso_nome1___eq() {
        return causa_decesso_nome1___eq;
    }
    public void setCausa_decesso_nome1___eq(String causa_decesso_nome1___eq) {
        this.causa_decesso_nome1___eq = causa_decesso_nome1___eq;
    }

    public String getCausa_decesso_nome1___ne() {
        return causa_decesso_nome1___ne;
    }
    public void setCausa_decesso_nome1___ne(String causa_decesso_nome1___ne) {
        this.causa_decesso_nome1___ne = causa_decesso_nome1___ne;
    }

    public Boolean getCausa_decesso_nome1___null() {
        return causa_decesso_nome1___null;
    }
    public void setCausa_decesso_nome1___null(Boolean causa_decesso_nome1___null) {
        this.causa_decesso_nome1___null = causa_decesso_nome1___null;
    }

    public Boolean getCausa_decesso_nome1___not___null() {
        return causa_decesso_nome1___not___null;
    }
    public void setCausa_decesso_nome1___not___null(Boolean causa_decesso_nome1___not___null) {
        this.causa_decesso_nome1___not___null = causa_decesso_nome1___not___null;
    }

    public java.util.List<String> getCausa_decesso_nome1___in() {
        return causa_decesso_nome1___in;
    }
    public void setCausa_decesso_nome1___in(java.util.List<String> causa_decesso_nome1___in) {
        this.causa_decesso_nome1___in = causa_decesso_nome1___in;
    }

    public java.util.List<String> getCausa_decesso_nome1___not___in() {
        return causa_decesso_nome1___not___in;
    }
    public void setCausa_decesso_nome1___not___in(java.util.List<String> causa_decesso_nome1___not___in) {
        this.causa_decesso_nome1___not___in = causa_decesso_nome1___not___in;
    }

    public String getCausa_decesso_nome1___lt() {
        return causa_decesso_nome1___lt;
    }
    public void setCausa_decesso_nome1___lt(String causa_decesso_nome1___lt) {
        this.causa_decesso_nome1___lt = causa_decesso_nome1___lt;
    }

    public String getCausa_decesso_nome1___lte() {
        return causa_decesso_nome1___lte;
    }
    public void setCausa_decesso_nome1___lte(String causa_decesso_nome1___lte) {
        this.causa_decesso_nome1___lte = causa_decesso_nome1___lte;
    }

    public String getCausa_decesso_nome1___gt() {
        return causa_decesso_nome1___gt;
    }
    public void setCausa_decesso_nome1___gt(String causa_decesso_nome1___gt) {
        this.causa_decesso_nome1___gt = causa_decesso_nome1___gt;
    }

    public String getCausa_decesso_nome1___gte() {
        return causa_decesso_nome1___gte;
    }
    public void setCausa_decesso_nome1___gte(String causa_decesso_nome1___gte) {
        this.causa_decesso_nome1___gte = causa_decesso_nome1___gte;
    }

    public String getCausa_decesso_nome1___contains() {
        return causa_decesso_nome1___contains;
    }
    public void setCausa_decesso_nome1___contains(String causa_decesso_nome1___contains) {
        this.causa_decesso_nome1___contains = causa_decesso_nome1___contains;
    }

    public String getCausa_decesso_nome1___not___contains() {
        return causa_decesso_nome1___not___contains;
    }
    public void setCausa_decesso_nome1___not___contains(String causa_decesso_nome1___not___contains) {
        this.causa_decesso_nome1___not___contains = causa_decesso_nome1___not___contains;
    }

    public String getCausa_decesso_nome1___starts_with() {
        return causa_decesso_nome1___starts_with;
    }
    public void setCausa_decesso_nome1___starts_with(String causa_decesso_nome1___starts_with) {
        this.causa_decesso_nome1___starts_with = causa_decesso_nome1___starts_with;
    }

    public String getCausa_decesso_nome1___not___starts_with() {
        return causa_decesso_nome1___not___starts_with;
    }
    public void setCausa_decesso_nome1___not___starts_with(String causa_decesso_nome1___not___starts_with) {
        this.causa_decesso_nome1___not___starts_with = causa_decesso_nome1___not___starts_with;
    }

    public String getCausa_decesso_nome1___ends_with() {
        return causa_decesso_nome1___ends_with;
    }
    public void setCausa_decesso_nome1___ends_with(String causa_decesso_nome1___ends_with) {
        this.causa_decesso_nome1___ends_with = causa_decesso_nome1___ends_with;
    }

    public String getCausa_decesso_nome1___not___ends_with() {
        return causa_decesso_nome1___not___ends_with;
    }
    public void setCausa_decesso_nome1___not___ends_with(String causa_decesso_nome1___not___ends_with) {
        this.causa_decesso_nome1___not___ends_with = causa_decesso_nome1___not___ends_with;
    }

    public String getCausa_decesso_nome2___eq() {
        return causa_decesso_nome2___eq;
    }
    public void setCausa_decesso_nome2___eq(String causa_decesso_nome2___eq) {
        this.causa_decesso_nome2___eq = causa_decesso_nome2___eq;
    }

    public String getCausa_decesso_nome2___ne() {
        return causa_decesso_nome2___ne;
    }
    public void setCausa_decesso_nome2___ne(String causa_decesso_nome2___ne) {
        this.causa_decesso_nome2___ne = causa_decesso_nome2___ne;
    }

    public Boolean getCausa_decesso_nome2___null() {
        return causa_decesso_nome2___null;
    }
    public void setCausa_decesso_nome2___null(Boolean causa_decesso_nome2___null) {
        this.causa_decesso_nome2___null = causa_decesso_nome2___null;
    }

    public Boolean getCausa_decesso_nome2___not___null() {
        return causa_decesso_nome2___not___null;
    }
    public void setCausa_decesso_nome2___not___null(Boolean causa_decesso_nome2___not___null) {
        this.causa_decesso_nome2___not___null = causa_decesso_nome2___not___null;
    }

    public java.util.List<String> getCausa_decesso_nome2___in() {
        return causa_decesso_nome2___in;
    }
    public void setCausa_decesso_nome2___in(java.util.List<String> causa_decesso_nome2___in) {
        this.causa_decesso_nome2___in = causa_decesso_nome2___in;
    }

    public java.util.List<String> getCausa_decesso_nome2___not___in() {
        return causa_decesso_nome2___not___in;
    }
    public void setCausa_decesso_nome2___not___in(java.util.List<String> causa_decesso_nome2___not___in) {
        this.causa_decesso_nome2___not___in = causa_decesso_nome2___not___in;
    }

    public String getCausa_decesso_nome2___lt() {
        return causa_decesso_nome2___lt;
    }
    public void setCausa_decesso_nome2___lt(String causa_decesso_nome2___lt) {
        this.causa_decesso_nome2___lt = causa_decesso_nome2___lt;
    }

    public String getCausa_decesso_nome2___lte() {
        return causa_decesso_nome2___lte;
    }
    public void setCausa_decesso_nome2___lte(String causa_decesso_nome2___lte) {
        this.causa_decesso_nome2___lte = causa_decesso_nome2___lte;
    }

    public String getCausa_decesso_nome2___gt() {
        return causa_decesso_nome2___gt;
    }
    public void setCausa_decesso_nome2___gt(String causa_decesso_nome2___gt) {
        this.causa_decesso_nome2___gt = causa_decesso_nome2___gt;
    }

    public String getCausa_decesso_nome2___gte() {
        return causa_decesso_nome2___gte;
    }
    public void setCausa_decesso_nome2___gte(String causa_decesso_nome2___gte) {
        this.causa_decesso_nome2___gte = causa_decesso_nome2___gte;
    }

    public String getCausa_decesso_nome2___contains() {
        return causa_decesso_nome2___contains;
    }
    public void setCausa_decesso_nome2___contains(String causa_decesso_nome2___contains) {
        this.causa_decesso_nome2___contains = causa_decesso_nome2___contains;
    }

    public String getCausa_decesso_nome2___not___contains() {
        return causa_decesso_nome2___not___contains;
    }
    public void setCausa_decesso_nome2___not___contains(String causa_decesso_nome2___not___contains) {
        this.causa_decesso_nome2___not___contains = causa_decesso_nome2___not___contains;
    }

    public String getCausa_decesso_nome2___starts_with() {
        return causa_decesso_nome2___starts_with;
    }
    public void setCausa_decesso_nome2___starts_with(String causa_decesso_nome2___starts_with) {
        this.causa_decesso_nome2___starts_with = causa_decesso_nome2___starts_with;
    }

    public String getCausa_decesso_nome2___not___starts_with() {
        return causa_decesso_nome2___not___starts_with;
    }
    public void setCausa_decesso_nome2___not___starts_with(String causa_decesso_nome2___not___starts_with) {
        this.causa_decesso_nome2___not___starts_with = causa_decesso_nome2___not___starts_with;
    }

    public String getCausa_decesso_nome2___ends_with() {
        return causa_decesso_nome2___ends_with;
    }
    public void setCausa_decesso_nome2___ends_with(String causa_decesso_nome2___ends_with) {
        this.causa_decesso_nome2___ends_with = causa_decesso_nome2___ends_with;
    }

    public String getCausa_decesso_nome2___not___ends_with() {
        return causa_decesso_nome2___not___ends_with;
    }
    public void setCausa_decesso_nome2___not___ends_with(String causa_decesso_nome2___not___ends_with) {
        this.causa_decesso_nome2___not___ends_with = causa_decesso_nome2___not___ends_with;
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

    public String getData___eq() {
        return data___eq;
    }
    public void setData___eq(String data___eq) {
        this.data___eq = data___eq;
    }

    public String getData___ne() {
        return data___ne;
    }
    public void setData___ne(String data___ne) {
        this.data___ne = data___ne;
    }

    public Boolean getData___null() {
        return data___null;
    }
    public void setData___null(Boolean data___null) {
        this.data___null = data___null;
    }

    public Boolean getData___not___null() {
        return data___not___null;
    }
    public void setData___not___null(Boolean data___not___null) {
        this.data___not___null = data___not___null;
    }

    public java.util.List<String> getData___in() {
        return data___in;
    }
    public void setData___in(java.util.List<String> data___in) {
        this.data___in = data___in;
    }

    public java.util.List<String> getData___not___in() {
        return data___not___in;
    }
    public void setData___not___in(java.util.List<String> data___not___in) {
        this.data___not___in = data___not___in;
    }

    public String getData___lt() {
        return data___lt;
    }
    public void setData___lt(String data___lt) {
        this.data___lt = data___lt;
    }

    public String getData___lte() {
        return data___lte;
    }
    public void setData___lte(String data___lte) {
        this.data___lte = data___lte;
    }

    public String getData___gt() {
        return data___gt;
    }
    public void setData___gt(String data___gt) {
        this.data___gt = data___gt;
    }

    public String getData___gte() {
        return data___gte;
    }
    public void setData___gte(String data___gte) {
        this.data___gte = data___gte;
    }

    public String getData_decesso___eq() {
        return data_decesso___eq;
    }
    public void setData_decesso___eq(String data_decesso___eq) {
        this.data_decesso___eq = data_decesso___eq;
    }

    public String getData_decesso___ne() {
        return data_decesso___ne;
    }
    public void setData_decesso___ne(String data_decesso___ne) {
        this.data_decesso___ne = data_decesso___ne;
    }

    public Boolean getData_decesso___null() {
        return data_decesso___null;
    }
    public void setData_decesso___null(Boolean data_decesso___null) {
        this.data_decesso___null = data_decesso___null;
    }

    public Boolean getData_decesso___not___null() {
        return data_decesso___not___null;
    }
    public void setData_decesso___not___null(Boolean data_decesso___not___null) {
        this.data_decesso___not___null = data_decesso___not___null;
    }

    public java.util.List<String> getData_decesso___in() {
        return data_decesso___in;
    }
    public void setData_decesso___in(java.util.List<String> data_decesso___in) {
        this.data_decesso___in = data_decesso___in;
    }

    public java.util.List<String> getData_decesso___not___in() {
        return data_decesso___not___in;
    }
    public void setData_decesso___not___in(java.util.List<String> data_decesso___not___in) {
        this.data_decesso___not___in = data_decesso___not___in;
    }

    public String getData_decesso___lt() {
        return data_decesso___lt;
    }
    public void setData_decesso___lt(String data_decesso___lt) {
        this.data_decesso___lt = data_decesso___lt;
    }

    public String getData_decesso___lte() {
        return data_decesso___lte;
    }
    public void setData_decesso___lte(String data_decesso___lte) {
        this.data_decesso___lte = data_decesso___lte;
    }

    public String getData_decesso___gt() {
        return data_decesso___gt;
    }
    public void setData_decesso___gt(String data_decesso___gt) {
        this.data_decesso___gt = data_decesso___gt;
    }

    public String getData_decesso___gte() {
        return data_decesso___gte;
    }
    public void setData_decesso___gte(String data_decesso___gte) {
        this.data_decesso___gte = data_decesso___gte;
    }

    public String getData_status_vita___eq() {
        return data_status_vita___eq;
    }
    public void setData_status_vita___eq(String data_status_vita___eq) {
        this.data_status_vita___eq = data_status_vita___eq;
    }

    public String getData_status_vita___ne() {
        return data_status_vita___ne;
    }
    public void setData_status_vita___ne(String data_status_vita___ne) {
        this.data_status_vita___ne = data_status_vita___ne;
    }

    public Boolean getData_status_vita___null() {
        return data_status_vita___null;
    }
    public void setData_status_vita___null(Boolean data_status_vita___null) {
        this.data_status_vita___null = data_status_vita___null;
    }

    public Boolean getData_status_vita___not___null() {
        return data_status_vita___not___null;
    }
    public void setData_status_vita___not___null(Boolean data_status_vita___not___null) {
        this.data_status_vita___not___null = data_status_vita___not___null;
    }

    public java.util.List<String> getData_status_vita___in() {
        return data_status_vita___in;
    }
    public void setData_status_vita___in(java.util.List<String> data_status_vita___in) {
        this.data_status_vita___in = data_status_vita___in;
    }

    public java.util.List<String> getData_status_vita___not___in() {
        return data_status_vita___not___in;
    }
    public void setData_status_vita___not___in(java.util.List<String> data_status_vita___not___in) {
        this.data_status_vita___not___in = data_status_vita___not___in;
    }

    public String getData_status_vita___lt() {
        return data_status_vita___lt;
    }
    public void setData_status_vita___lt(String data_status_vita___lt) {
        this.data_status_vita___lt = data_status_vita___lt;
    }

    public String getData_status_vita___lte() {
        return data_status_vita___lte;
    }
    public void setData_status_vita___lte(String data_status_vita___lte) {
        this.data_status_vita___lte = data_status_vita___lte;
    }

    public String getData_status_vita___gt() {
        return data_status_vita___gt;
    }
    public void setData_status_vita___gt(String data_status_vita___gt) {
        this.data_status_vita___gt = data_status_vita___gt;
    }

    public String getData_status_vita___gte() {
        return data_status_vita___gte;
    }
    public void setData_status_vita___gte(String data_status_vita___gte) {
        this.data_status_vita___gte = data_status_vita___gte;
    }

    public Boolean getDeceduto___eq() {
        return deceduto___eq;
    }
    public void setDeceduto___eq(Boolean deceduto___eq) {
        this.deceduto___eq = deceduto___eq;
    }

    public Boolean getDeceduto___ne() {
        return deceduto___ne;
    }
    public void setDeceduto___ne(Boolean deceduto___ne) {
        this.deceduto___ne = deceduto___ne;
    }

    public Boolean getDeceduto___null() {
        return deceduto___null;
    }
    public void setDeceduto___null(Boolean deceduto___null) {
        this.deceduto___null = deceduto___null;
    }

    public Boolean getDeceduto___not___null() {
        return deceduto___not___null;
    }
    public void setDeceduto___not___null(Boolean deceduto___not___null) {
        this.deceduto___not___null = deceduto___not___null;
    }

    public String getLuogo_decesso___eq() {
        return luogo_decesso___eq;
    }
    public void setLuogo_decesso___eq(String luogo_decesso___eq) {
        this.luogo_decesso___eq = luogo_decesso___eq;
    }

    public String getLuogo_decesso___ne() {
        return luogo_decesso___ne;
    }
    public void setLuogo_decesso___ne(String luogo_decesso___ne) {
        this.luogo_decesso___ne = luogo_decesso___ne;
    }

    public Boolean getLuogo_decesso___null() {
        return luogo_decesso___null;
    }
    public void setLuogo_decesso___null(Boolean luogo_decesso___null) {
        this.luogo_decesso___null = luogo_decesso___null;
    }

    public Boolean getLuogo_decesso___not___null() {
        return luogo_decesso___not___null;
    }
    public void setLuogo_decesso___not___null(Boolean luogo_decesso___not___null) {
        this.luogo_decesso___not___null = luogo_decesso___not___null;
    }

    public java.util.List<String> getLuogo_decesso___in() {
        return luogo_decesso___in;
    }
    public void setLuogo_decesso___in(java.util.List<String> luogo_decesso___in) {
        this.luogo_decesso___in = luogo_decesso___in;
    }

    public java.util.List<String> getLuogo_decesso___not___in() {
        return luogo_decesso___not___in;
    }
    public void setLuogo_decesso___not___in(java.util.List<String> luogo_decesso___not___in) {
        this.luogo_decesso___not___in = luogo_decesso___not___in;
    }

    public String getLuogo_decesso___lt() {
        return luogo_decesso___lt;
    }
    public void setLuogo_decesso___lt(String luogo_decesso___lt) {
        this.luogo_decesso___lt = luogo_decesso___lt;
    }

    public String getLuogo_decesso___lte() {
        return luogo_decesso___lte;
    }
    public void setLuogo_decesso___lte(String luogo_decesso___lte) {
        this.luogo_decesso___lte = luogo_decesso___lte;
    }

    public String getLuogo_decesso___gt() {
        return luogo_decesso___gt;
    }
    public void setLuogo_decesso___gt(String luogo_decesso___gt) {
        this.luogo_decesso___gt = luogo_decesso___gt;
    }

    public String getLuogo_decesso___gte() {
        return luogo_decesso___gte;
    }
    public void setLuogo_decesso___gte(String luogo_decesso___gte) {
        this.luogo_decesso___gte = luogo_decesso___gte;
    }

    public String getLuogo_decesso___contains() {
        return luogo_decesso___contains;
    }
    public void setLuogo_decesso___contains(String luogo_decesso___contains) {
        this.luogo_decesso___contains = luogo_decesso___contains;
    }

    public String getLuogo_decesso___not___contains() {
        return luogo_decesso___not___contains;
    }
    public void setLuogo_decesso___not___contains(String luogo_decesso___not___contains) {
        this.luogo_decesso___not___contains = luogo_decesso___not___contains;
    }

    public String getLuogo_decesso___starts_with() {
        return luogo_decesso___starts_with;
    }
    public void setLuogo_decesso___starts_with(String luogo_decesso___starts_with) {
        this.luogo_decesso___starts_with = luogo_decesso___starts_with;
    }

    public String getLuogo_decesso___not___starts_with() {
        return luogo_decesso___not___starts_with;
    }
    public void setLuogo_decesso___not___starts_with(String luogo_decesso___not___starts_with) {
        this.luogo_decesso___not___starts_with = luogo_decesso___not___starts_with;
    }

    public String getLuogo_decesso___ends_with() {
        return luogo_decesso___ends_with;
    }
    public void setLuogo_decesso___ends_with(String luogo_decesso___ends_with) {
        this.luogo_decesso___ends_with = luogo_decesso___ends_with;
    }

    public String getLuogo_decesso___not___ends_with() {
        return luogo_decesso___not___ends_with;
    }
    public void setLuogo_decesso___not___ends_with(String luogo_decesso___not___ends_with) {
        this.luogo_decesso___not___ends_with = luogo_decesso___not___ends_with;
    }

    public String getMotivo_decesso___eq() {
        return motivo_decesso___eq;
    }
    public void setMotivo_decesso___eq(String motivo_decesso___eq) {
        this.motivo_decesso___eq = motivo_decesso___eq;
    }

    public String getMotivo_decesso___ne() {
        return motivo_decesso___ne;
    }
    public void setMotivo_decesso___ne(String motivo_decesso___ne) {
        this.motivo_decesso___ne = motivo_decesso___ne;
    }

    public Boolean getMotivo_decesso___null() {
        return motivo_decesso___null;
    }
    public void setMotivo_decesso___null(Boolean motivo_decesso___null) {
        this.motivo_decesso___null = motivo_decesso___null;
    }

    public Boolean getMotivo_decesso___not___null() {
        return motivo_decesso___not___null;
    }
    public void setMotivo_decesso___not___null(Boolean motivo_decesso___not___null) {
        this.motivo_decesso___not___null = motivo_decesso___not___null;
    }

    public java.util.List<String> getMotivo_decesso___in() {
        return motivo_decesso___in;
    }
    public void setMotivo_decesso___in(java.util.List<String> motivo_decesso___in) {
        this.motivo_decesso___in = motivo_decesso___in;
    }

    public java.util.List<String> getMotivo_decesso___not___in() {
        return motivo_decesso___not___in;
    }
    public void setMotivo_decesso___not___in(java.util.List<String> motivo_decesso___not___in) {
        this.motivo_decesso___not___in = motivo_decesso___not___in;
    }

    public String getMotivo_decesso___lt() {
        return motivo_decesso___lt;
    }
    public void setMotivo_decesso___lt(String motivo_decesso___lt) {
        this.motivo_decesso___lt = motivo_decesso___lt;
    }

    public String getMotivo_decesso___lte() {
        return motivo_decesso___lte;
    }
    public void setMotivo_decesso___lte(String motivo_decesso___lte) {
        this.motivo_decesso___lte = motivo_decesso___lte;
    }

    public String getMotivo_decesso___gt() {
        return motivo_decesso___gt;
    }
    public void setMotivo_decesso___gt(String motivo_decesso___gt) {
        this.motivo_decesso___gt = motivo_decesso___gt;
    }

    public String getMotivo_decesso___gte() {
        return motivo_decesso___gte;
    }
    public void setMotivo_decesso___gte(String motivo_decesso___gte) {
        this.motivo_decesso___gte = motivo_decesso___gte;
    }

    public String getMotivo_decesso___contains() {
        return motivo_decesso___contains;
    }
    public void setMotivo_decesso___contains(String motivo_decesso___contains) {
        this.motivo_decesso___contains = motivo_decesso___contains;
    }

    public String getMotivo_decesso___not___contains() {
        return motivo_decesso___not___contains;
    }
    public void setMotivo_decesso___not___contains(String motivo_decesso___not___contains) {
        this.motivo_decesso___not___contains = motivo_decesso___not___contains;
    }

    public String getMotivo_decesso___starts_with() {
        return motivo_decesso___starts_with;
    }
    public void setMotivo_decesso___starts_with(String motivo_decesso___starts_with) {
        this.motivo_decesso___starts_with = motivo_decesso___starts_with;
    }

    public String getMotivo_decesso___not___starts_with() {
        return motivo_decesso___not___starts_with;
    }
    public void setMotivo_decesso___not___starts_with(String motivo_decesso___not___starts_with) {
        this.motivo_decesso___not___starts_with = motivo_decesso___not___starts_with;
    }

    public String getMotivo_decesso___ends_with() {
        return motivo_decesso___ends_with;
    }
    public void setMotivo_decesso___ends_with(String motivo_decesso___ends_with) {
        this.motivo_decesso___ends_with = motivo_decesso___ends_with;
    }

    public String getMotivo_decesso___not___ends_with() {
        return motivo_decesso___not___ends_with;
    }
    public void setMotivo_decesso___not___ends_with(String motivo_decesso___not___ends_with) {
        this.motivo_decesso___not___ends_with = motivo_decesso___not___ends_with;
    }

    public String getMotivo_dropout___eq() {
        return motivo_dropout___eq;
    }
    public void setMotivo_dropout___eq(String motivo_dropout___eq) {
        this.motivo_dropout___eq = motivo_dropout___eq;
    }

    public String getMotivo_dropout___ne() {
        return motivo_dropout___ne;
    }
    public void setMotivo_dropout___ne(String motivo_dropout___ne) {
        this.motivo_dropout___ne = motivo_dropout___ne;
    }

    public Boolean getMotivo_dropout___null() {
        return motivo_dropout___null;
    }
    public void setMotivo_dropout___null(Boolean motivo_dropout___null) {
        this.motivo_dropout___null = motivo_dropout___null;
    }

    public Boolean getMotivo_dropout___not___null() {
        return motivo_dropout___not___null;
    }
    public void setMotivo_dropout___not___null(Boolean motivo_dropout___not___null) {
        this.motivo_dropout___not___null = motivo_dropout___not___null;
    }

    public java.util.List<String> getMotivo_dropout___in() {
        return motivo_dropout___in;
    }
    public void setMotivo_dropout___in(java.util.List<String> motivo_dropout___in) {
        this.motivo_dropout___in = motivo_dropout___in;
    }

    public java.util.List<String> getMotivo_dropout___not___in() {
        return motivo_dropout___not___in;
    }
    public void setMotivo_dropout___not___in(java.util.List<String> motivo_dropout___not___in) {
        this.motivo_dropout___not___in = motivo_dropout___not___in;
    }

    public String getMotivo_dropout___lt() {
        return motivo_dropout___lt;
    }
    public void setMotivo_dropout___lt(String motivo_dropout___lt) {
        this.motivo_dropout___lt = motivo_dropout___lt;
    }

    public String getMotivo_dropout___lte() {
        return motivo_dropout___lte;
    }
    public void setMotivo_dropout___lte(String motivo_dropout___lte) {
        this.motivo_dropout___lte = motivo_dropout___lte;
    }

    public String getMotivo_dropout___gt() {
        return motivo_dropout___gt;
    }
    public void setMotivo_dropout___gt(String motivo_dropout___gt) {
        this.motivo_dropout___gt = motivo_dropout___gt;
    }

    public String getMotivo_dropout___gte() {
        return motivo_dropout___gte;
    }
    public void setMotivo_dropout___gte(String motivo_dropout___gte) {
        this.motivo_dropout___gte = motivo_dropout___gte;
    }

    public String getMotivo_dropout___contains() {
        return motivo_dropout___contains;
    }
    public void setMotivo_dropout___contains(String motivo_dropout___contains) {
        this.motivo_dropout___contains = motivo_dropout___contains;
    }

    public String getMotivo_dropout___not___contains() {
        return motivo_dropout___not___contains;
    }
    public void setMotivo_dropout___not___contains(String motivo_dropout___not___contains) {
        this.motivo_dropout___not___contains = motivo_dropout___not___contains;
    }

    public String getMotivo_dropout___starts_with() {
        return motivo_dropout___starts_with;
    }
    public void setMotivo_dropout___starts_with(String motivo_dropout___starts_with) {
        this.motivo_dropout___starts_with = motivo_dropout___starts_with;
    }

    public String getMotivo_dropout___not___starts_with() {
        return motivo_dropout___not___starts_with;
    }
    public void setMotivo_dropout___not___starts_with(String motivo_dropout___not___starts_with) {
        this.motivo_dropout___not___starts_with = motivo_dropout___not___starts_with;
    }

    public String getMotivo_dropout___ends_with() {
        return motivo_dropout___ends_with;
    }
    public void setMotivo_dropout___ends_with(String motivo_dropout___ends_with) {
        this.motivo_dropout___ends_with = motivo_dropout___ends_with;
    }

    public String getMotivo_dropout___not___ends_with() {
        return motivo_dropout___not___ends_with;
    }
    public void setMotivo_dropout___not___ends_with(String motivo_dropout___not___ends_with) {
        this.motivo_dropout___not___ends_with = motivo_dropout___not___ends_with;
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

    public String getStatus_vita___eq() {
        return status_vita___eq;
    }
    public void setStatus_vita___eq(String status_vita___eq) {
        this.status_vita___eq = status_vita___eq;
    }

    public String getStatus_vita___ne() {
        return status_vita___ne;
    }
    public void setStatus_vita___ne(String status_vita___ne) {
        this.status_vita___ne = status_vita___ne;
    }

    public Boolean getStatus_vita___null() {
        return status_vita___null;
    }
    public void setStatus_vita___null(Boolean status_vita___null) {
        this.status_vita___null = status_vita___null;
    }

    public Boolean getStatus_vita___not___null() {
        return status_vita___not___null;
    }
    public void setStatus_vita___not___null(Boolean status_vita___not___null) {
        this.status_vita___not___null = status_vita___not___null;
    }

    public java.util.List<String> getStatus_vita___in() {
        return status_vita___in;
    }
    public void setStatus_vita___in(java.util.List<String> status_vita___in) {
        this.status_vita___in = status_vita___in;
    }

    public java.util.List<String> getStatus_vita___not___in() {
        return status_vita___not___in;
    }
    public void setStatus_vita___not___in(java.util.List<String> status_vita___not___in) {
        this.status_vita___not___in = status_vita___not___in;
    }

    public String getStatus_vita___lt() {
        return status_vita___lt;
    }
    public void setStatus_vita___lt(String status_vita___lt) {
        this.status_vita___lt = status_vita___lt;
    }

    public String getStatus_vita___lte() {
        return status_vita___lte;
    }
    public void setStatus_vita___lte(String status_vita___lte) {
        this.status_vita___lte = status_vita___lte;
    }

    public String getStatus_vita___gt() {
        return status_vita___gt;
    }
    public void setStatus_vita___gt(String status_vita___gt) {
        this.status_vita___gt = status_vita___gt;
    }

    public String getStatus_vita___gte() {
        return status_vita___gte;
    }
    public void setStatus_vita___gte(String status_vita___gte) {
        this.status_vita___gte = status_vita___gte;
    }

    public String getStatus_vita___contains() {
        return status_vita___contains;
    }
    public void setStatus_vita___contains(String status_vita___contains) {
        this.status_vita___contains = status_vita___contains;
    }

    public String getStatus_vita___not___contains() {
        return status_vita___not___contains;
    }
    public void setStatus_vita___not___contains(String status_vita___not___contains) {
        this.status_vita___not___contains = status_vita___not___contains;
    }

    public String getStatus_vita___starts_with() {
        return status_vita___starts_with;
    }
    public void setStatus_vita___starts_with(String status_vita___starts_with) {
        this.status_vita___starts_with = status_vita___starts_with;
    }

    public String getStatus_vita___not___starts_with() {
        return status_vita___not___starts_with;
    }
    public void setStatus_vita___not___starts_with(String status_vita___not___starts_with) {
        this.status_vita___not___starts_with = status_vita___not___starts_with;
    }

    public String getStatus_vita___ends_with() {
        return status_vita___ends_with;
    }
    public void setStatus_vita___ends_with(String status_vita___ends_with) {
        this.status_vita___ends_with = status_vita___ends_with;
    }

    public String getStatus_vita___not___ends_with() {
        return status_vita___not___ends_with;
    }
    public void setStatus_vita___not___ends_with(String status_vita___not___ends_with) {
        this.status_vita___not___ends_with = status_vita___not___ends_with;
    }

    public String getUltima_visita_ok___eq() {
        return ultima_visita_ok___eq;
    }
    public void setUltima_visita_ok___eq(String ultima_visita_ok___eq) {
        this.ultima_visita_ok___eq = ultima_visita_ok___eq;
    }

    public String getUltima_visita_ok___ne() {
        return ultima_visita_ok___ne;
    }
    public void setUltima_visita_ok___ne(String ultima_visita_ok___ne) {
        this.ultima_visita_ok___ne = ultima_visita_ok___ne;
    }

    public Boolean getUltima_visita_ok___null() {
        return ultima_visita_ok___null;
    }
    public void setUltima_visita_ok___null(Boolean ultima_visita_ok___null) {
        this.ultima_visita_ok___null = ultima_visita_ok___null;
    }

    public Boolean getUltima_visita_ok___not___null() {
        return ultima_visita_ok___not___null;
    }
    public void setUltima_visita_ok___not___null(Boolean ultima_visita_ok___not___null) {
        this.ultima_visita_ok___not___null = ultima_visita_ok___not___null;
    }

    public java.util.List<String> getUltima_visita_ok___in() {
        return ultima_visita_ok___in;
    }
    public void setUltima_visita_ok___in(java.util.List<String> ultima_visita_ok___in) {
        this.ultima_visita_ok___in = ultima_visita_ok___in;
    }

    public java.util.List<String> getUltima_visita_ok___not___in() {
        return ultima_visita_ok___not___in;
    }
    public void setUltima_visita_ok___not___in(java.util.List<String> ultima_visita_ok___not___in) {
        this.ultima_visita_ok___not___in = ultima_visita_ok___not___in;
    }

    public String getUltima_visita_ok___lt() {
        return ultima_visita_ok___lt;
    }
    public void setUltima_visita_ok___lt(String ultima_visita_ok___lt) {
        this.ultima_visita_ok___lt = ultima_visita_ok___lt;
    }

    public String getUltima_visita_ok___lte() {
        return ultima_visita_ok___lte;
    }
    public void setUltima_visita_ok___lte(String ultima_visita_ok___lte) {
        this.ultima_visita_ok___lte = ultima_visita_ok___lte;
    }

    public String getUltima_visita_ok___gt() {
        return ultima_visita_ok___gt;
    }
    public void setUltima_visita_ok___gt(String ultima_visita_ok___gt) {
        this.ultima_visita_ok___gt = ultima_visita_ok___gt;
    }

    public String getUltima_visita_ok___gte() {
        return ultima_visita_ok___gte;
    }
    public void setUltima_visita_ok___gte(String ultima_visita_ok___gte) {
        this.ultima_visita_ok___gte = ultima_visita_ok___gte;
    }

    public Boolean getUndropped___eq() {
        return undropped___eq;
    }
    public void setUndropped___eq(Boolean undropped___eq) {
        this.undropped___eq = undropped___eq;
    }

    public Boolean getUndropped___ne() {
        return undropped___ne;
    }
    public void setUndropped___ne(Boolean undropped___ne) {
        this.undropped___ne = undropped___ne;
    }

    public Boolean getUndropped___null() {
        return undropped___null;
    }
    public void setUndropped___null(Boolean undropped___null) {
        this.undropped___null = undropped___null;
    }

    public Boolean getUndropped___not___null() {
        return undropped___not___null;
    }
    public void setUndropped___not___null(Boolean undropped___not___null) {
        this.undropped___not___null = undropped___not___null;
    }

    public java.util.List<CliDropoutFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliDropoutFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliDropoutFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliDropoutFilterDTO> OR) {
        this.OR = OR;
    }

    public CliDropoutFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliDropoutFilterDTO NOT) {
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
        if (altro_causa_decesso___eq != null) {
            joiner.add("altro_causa_decesso___eq: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___eq));
        }
        if (altro_causa_decesso___ne != null) {
            joiner.add("altro_causa_decesso___ne: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___ne));
        }
        if (altro_causa_decesso___null != null) {
            joiner.add("altro_causa_decesso___null: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___null));
        }
        if (altro_causa_decesso___not___null != null) {
            joiner.add("altro_causa_decesso___not___null: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___not___null));
        }
        if (altro_causa_decesso___in != null) {
            joiner.add("altro_causa_decesso___in: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___in));
        }
        if (altro_causa_decesso___not___in != null) {
            joiner.add("altro_causa_decesso___not___in: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___not___in));
        }
        if (altro_causa_decesso___lt != null) {
            joiner.add("altro_causa_decesso___lt: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___lt));
        }
        if (altro_causa_decesso___lte != null) {
            joiner.add("altro_causa_decesso___lte: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___lte));
        }
        if (altro_causa_decesso___gt != null) {
            joiner.add("altro_causa_decesso___gt: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___gt));
        }
        if (altro_causa_decesso___gte != null) {
            joiner.add("altro_causa_decesso___gte: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___gte));
        }
        if (altro_causa_decesso___contains != null) {
            joiner.add("altro_causa_decesso___contains: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___contains));
        }
        if (altro_causa_decesso___not___contains != null) {
            joiner.add("altro_causa_decesso___not___contains: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___not___contains));
        }
        if (altro_causa_decesso___starts_with != null) {
            joiner.add("altro_causa_decesso___starts_with: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___starts_with));
        }
        if (altro_causa_decesso___not___starts_with != null) {
            joiner.add("altro_causa_decesso___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___not___starts_with));
        }
        if (altro_causa_decesso___ends_with != null) {
            joiner.add("altro_causa_decesso___ends_with: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___ends_with));
        }
        if (altro_causa_decesso___not___ends_with != null) {
            joiner.add("altro_causa_decesso___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso___not___ends_with));
        }
        if (altro_motivo_drop___eq != null) {
            joiner.add("altro_motivo_drop___eq: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___eq));
        }
        if (altro_motivo_drop___ne != null) {
            joiner.add("altro_motivo_drop___ne: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___ne));
        }
        if (altro_motivo_drop___null != null) {
            joiner.add("altro_motivo_drop___null: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___null));
        }
        if (altro_motivo_drop___not___null != null) {
            joiner.add("altro_motivo_drop___not___null: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___not___null));
        }
        if (altro_motivo_drop___in != null) {
            joiner.add("altro_motivo_drop___in: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___in));
        }
        if (altro_motivo_drop___not___in != null) {
            joiner.add("altro_motivo_drop___not___in: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___not___in));
        }
        if (altro_motivo_drop___lt != null) {
            joiner.add("altro_motivo_drop___lt: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___lt));
        }
        if (altro_motivo_drop___lte != null) {
            joiner.add("altro_motivo_drop___lte: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___lte));
        }
        if (altro_motivo_drop___gt != null) {
            joiner.add("altro_motivo_drop___gt: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___gt));
        }
        if (altro_motivo_drop___gte != null) {
            joiner.add("altro_motivo_drop___gte: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___gte));
        }
        if (altro_motivo_drop___contains != null) {
            joiner.add("altro_motivo_drop___contains: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___contains));
        }
        if (altro_motivo_drop___not___contains != null) {
            joiner.add("altro_motivo_drop___not___contains: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___not___contains));
        }
        if (altro_motivo_drop___starts_with != null) {
            joiner.add("altro_motivo_drop___starts_with: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___starts_with));
        }
        if (altro_motivo_drop___not___starts_with != null) {
            joiner.add("altro_motivo_drop___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___not___starts_with));
        }
        if (altro_motivo_drop___ends_with != null) {
            joiner.add("altro_motivo_drop___ends_with: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___ends_with));
        }
        if (altro_motivo_drop___not___ends_with != null) {
            joiner.add("altro_motivo_drop___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop___not___ends_with));
        }
        if (altro_sede_decesso___eq != null) {
            joiner.add("altro_sede_decesso___eq: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___eq));
        }
        if (altro_sede_decesso___ne != null) {
            joiner.add("altro_sede_decesso___ne: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___ne));
        }
        if (altro_sede_decesso___null != null) {
            joiner.add("altro_sede_decesso___null: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___null));
        }
        if (altro_sede_decesso___not___null != null) {
            joiner.add("altro_sede_decesso___not___null: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___not___null));
        }
        if (altro_sede_decesso___in != null) {
            joiner.add("altro_sede_decesso___in: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___in));
        }
        if (altro_sede_decesso___not___in != null) {
            joiner.add("altro_sede_decesso___not___in: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___not___in));
        }
        if (altro_sede_decesso___lt != null) {
            joiner.add("altro_sede_decesso___lt: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___lt));
        }
        if (altro_sede_decesso___lte != null) {
            joiner.add("altro_sede_decesso___lte: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___lte));
        }
        if (altro_sede_decesso___gt != null) {
            joiner.add("altro_sede_decesso___gt: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___gt));
        }
        if (altro_sede_decesso___gte != null) {
            joiner.add("altro_sede_decesso___gte: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___gte));
        }
        if (altro_sede_decesso___contains != null) {
            joiner.add("altro_sede_decesso___contains: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___contains));
        }
        if (altro_sede_decesso___not___contains != null) {
            joiner.add("altro_sede_decesso___not___contains: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___not___contains));
        }
        if (altro_sede_decesso___starts_with != null) {
            joiner.add("altro_sede_decesso___starts_with: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___starts_with));
        }
        if (altro_sede_decesso___not___starts_with != null) {
            joiner.add("altro_sede_decesso___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___not___starts_with));
        }
        if (altro_sede_decesso___ends_with != null) {
            joiner.add("altro_sede_decesso___ends_with: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___ends_with));
        }
        if (altro_sede_decesso___not___ends_with != null) {
            joiner.add("altro_sede_decesso___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso___not___ends_with));
        }
        if (autopsia___eq != null) {
            joiner.add("autopsia___eq: " + GraphQLRequestSerializer.getEntry(autopsia___eq));
        }
        if (autopsia___ne != null) {
            joiner.add("autopsia___ne: " + GraphQLRequestSerializer.getEntry(autopsia___ne));
        }
        if (autopsia___null != null) {
            joiner.add("autopsia___null: " + GraphQLRequestSerializer.getEntry(autopsia___null));
        }
        if (autopsia___not___null != null) {
            joiner.add("autopsia___not___null: " + GraphQLRequestSerializer.getEntry(autopsia___not___null));
        }
        if (causa_decesso_nome1___eq != null) {
            joiner.add("causa_decesso_nome1___eq: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___eq));
        }
        if (causa_decesso_nome1___ne != null) {
            joiner.add("causa_decesso_nome1___ne: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___ne));
        }
        if (causa_decesso_nome1___null != null) {
            joiner.add("causa_decesso_nome1___null: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___null));
        }
        if (causa_decesso_nome1___not___null != null) {
            joiner.add("causa_decesso_nome1___not___null: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___not___null));
        }
        if (causa_decesso_nome1___in != null) {
            joiner.add("causa_decesso_nome1___in: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___in));
        }
        if (causa_decesso_nome1___not___in != null) {
            joiner.add("causa_decesso_nome1___not___in: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___not___in));
        }
        if (causa_decesso_nome1___lt != null) {
            joiner.add("causa_decesso_nome1___lt: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___lt));
        }
        if (causa_decesso_nome1___lte != null) {
            joiner.add("causa_decesso_nome1___lte: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___lte));
        }
        if (causa_decesso_nome1___gt != null) {
            joiner.add("causa_decesso_nome1___gt: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___gt));
        }
        if (causa_decesso_nome1___gte != null) {
            joiner.add("causa_decesso_nome1___gte: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___gte));
        }
        if (causa_decesso_nome1___contains != null) {
            joiner.add("causa_decesso_nome1___contains: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___contains));
        }
        if (causa_decesso_nome1___not___contains != null) {
            joiner.add("causa_decesso_nome1___not___contains: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___not___contains));
        }
        if (causa_decesso_nome1___starts_with != null) {
            joiner.add("causa_decesso_nome1___starts_with: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___starts_with));
        }
        if (causa_decesso_nome1___not___starts_with != null) {
            joiner.add("causa_decesso_nome1___not___starts_with: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___not___starts_with));
        }
        if (causa_decesso_nome1___ends_with != null) {
            joiner.add("causa_decesso_nome1___ends_with: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___ends_with));
        }
        if (causa_decesso_nome1___not___ends_with != null) {
            joiner.add("causa_decesso_nome1___not___ends_with: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1___not___ends_with));
        }
        if (causa_decesso_nome2___eq != null) {
            joiner.add("causa_decesso_nome2___eq: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___eq));
        }
        if (causa_decesso_nome2___ne != null) {
            joiner.add("causa_decesso_nome2___ne: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___ne));
        }
        if (causa_decesso_nome2___null != null) {
            joiner.add("causa_decesso_nome2___null: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___null));
        }
        if (causa_decesso_nome2___not___null != null) {
            joiner.add("causa_decesso_nome2___not___null: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___not___null));
        }
        if (causa_decesso_nome2___in != null) {
            joiner.add("causa_decesso_nome2___in: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___in));
        }
        if (causa_decesso_nome2___not___in != null) {
            joiner.add("causa_decesso_nome2___not___in: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___not___in));
        }
        if (causa_decesso_nome2___lt != null) {
            joiner.add("causa_decesso_nome2___lt: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___lt));
        }
        if (causa_decesso_nome2___lte != null) {
            joiner.add("causa_decesso_nome2___lte: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___lte));
        }
        if (causa_decesso_nome2___gt != null) {
            joiner.add("causa_decesso_nome2___gt: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___gt));
        }
        if (causa_decesso_nome2___gte != null) {
            joiner.add("causa_decesso_nome2___gte: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___gte));
        }
        if (causa_decesso_nome2___contains != null) {
            joiner.add("causa_decesso_nome2___contains: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___contains));
        }
        if (causa_decesso_nome2___not___contains != null) {
            joiner.add("causa_decesso_nome2___not___contains: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___not___contains));
        }
        if (causa_decesso_nome2___starts_with != null) {
            joiner.add("causa_decesso_nome2___starts_with: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___starts_with));
        }
        if (causa_decesso_nome2___not___starts_with != null) {
            joiner.add("causa_decesso_nome2___not___starts_with: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___not___starts_with));
        }
        if (causa_decesso_nome2___ends_with != null) {
            joiner.add("causa_decesso_nome2___ends_with: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___ends_with));
        }
        if (causa_decesso_nome2___not___ends_with != null) {
            joiner.add("causa_decesso_nome2___not___ends_with: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2___not___ends_with));
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
        if (data___eq != null) {
            joiner.add("data___eq: " + GraphQLRequestSerializer.getEntry(data___eq));
        }
        if (data___ne != null) {
            joiner.add("data___ne: " + GraphQLRequestSerializer.getEntry(data___ne));
        }
        if (data___null != null) {
            joiner.add("data___null: " + GraphQLRequestSerializer.getEntry(data___null));
        }
        if (data___not___null != null) {
            joiner.add("data___not___null: " + GraphQLRequestSerializer.getEntry(data___not___null));
        }
        if (data___in != null) {
            joiner.add("data___in: " + GraphQLRequestSerializer.getEntry(data___in));
        }
        if (data___not___in != null) {
            joiner.add("data___not___in: " + GraphQLRequestSerializer.getEntry(data___not___in));
        }
        if (data___lt != null) {
            joiner.add("data___lt: " + GraphQLRequestSerializer.getEntry(data___lt));
        }
        if (data___lte != null) {
            joiner.add("data___lte: " + GraphQLRequestSerializer.getEntry(data___lte));
        }
        if (data___gt != null) {
            joiner.add("data___gt: " + GraphQLRequestSerializer.getEntry(data___gt));
        }
        if (data___gte != null) {
            joiner.add("data___gte: " + GraphQLRequestSerializer.getEntry(data___gte));
        }
        if (data_decesso___eq != null) {
            joiner.add("data_decesso___eq: " + GraphQLRequestSerializer.getEntry(data_decesso___eq));
        }
        if (data_decesso___ne != null) {
            joiner.add("data_decesso___ne: " + GraphQLRequestSerializer.getEntry(data_decesso___ne));
        }
        if (data_decesso___null != null) {
            joiner.add("data_decesso___null: " + GraphQLRequestSerializer.getEntry(data_decesso___null));
        }
        if (data_decesso___not___null != null) {
            joiner.add("data_decesso___not___null: " + GraphQLRequestSerializer.getEntry(data_decesso___not___null));
        }
        if (data_decesso___in != null) {
            joiner.add("data_decesso___in: " + GraphQLRequestSerializer.getEntry(data_decesso___in));
        }
        if (data_decesso___not___in != null) {
            joiner.add("data_decesso___not___in: " + GraphQLRequestSerializer.getEntry(data_decesso___not___in));
        }
        if (data_decesso___lt != null) {
            joiner.add("data_decesso___lt: " + GraphQLRequestSerializer.getEntry(data_decesso___lt));
        }
        if (data_decesso___lte != null) {
            joiner.add("data_decesso___lte: " + GraphQLRequestSerializer.getEntry(data_decesso___lte));
        }
        if (data_decesso___gt != null) {
            joiner.add("data_decesso___gt: " + GraphQLRequestSerializer.getEntry(data_decesso___gt));
        }
        if (data_decesso___gte != null) {
            joiner.add("data_decesso___gte: " + GraphQLRequestSerializer.getEntry(data_decesso___gte));
        }
        if (data_status_vita___eq != null) {
            joiner.add("data_status_vita___eq: " + GraphQLRequestSerializer.getEntry(data_status_vita___eq));
        }
        if (data_status_vita___ne != null) {
            joiner.add("data_status_vita___ne: " + GraphQLRequestSerializer.getEntry(data_status_vita___ne));
        }
        if (data_status_vita___null != null) {
            joiner.add("data_status_vita___null: " + GraphQLRequestSerializer.getEntry(data_status_vita___null));
        }
        if (data_status_vita___not___null != null) {
            joiner.add("data_status_vita___not___null: " + GraphQLRequestSerializer.getEntry(data_status_vita___not___null));
        }
        if (data_status_vita___in != null) {
            joiner.add("data_status_vita___in: " + GraphQLRequestSerializer.getEntry(data_status_vita___in));
        }
        if (data_status_vita___not___in != null) {
            joiner.add("data_status_vita___not___in: " + GraphQLRequestSerializer.getEntry(data_status_vita___not___in));
        }
        if (data_status_vita___lt != null) {
            joiner.add("data_status_vita___lt: " + GraphQLRequestSerializer.getEntry(data_status_vita___lt));
        }
        if (data_status_vita___lte != null) {
            joiner.add("data_status_vita___lte: " + GraphQLRequestSerializer.getEntry(data_status_vita___lte));
        }
        if (data_status_vita___gt != null) {
            joiner.add("data_status_vita___gt: " + GraphQLRequestSerializer.getEntry(data_status_vita___gt));
        }
        if (data_status_vita___gte != null) {
            joiner.add("data_status_vita___gte: " + GraphQLRequestSerializer.getEntry(data_status_vita___gte));
        }
        if (deceduto___eq != null) {
            joiner.add("deceduto___eq: " + GraphQLRequestSerializer.getEntry(deceduto___eq));
        }
        if (deceduto___ne != null) {
            joiner.add("deceduto___ne: " + GraphQLRequestSerializer.getEntry(deceduto___ne));
        }
        if (deceduto___null != null) {
            joiner.add("deceduto___null: " + GraphQLRequestSerializer.getEntry(deceduto___null));
        }
        if (deceduto___not___null != null) {
            joiner.add("deceduto___not___null: " + GraphQLRequestSerializer.getEntry(deceduto___not___null));
        }
        if (luogo_decesso___eq != null) {
            joiner.add("luogo_decesso___eq: " + GraphQLRequestSerializer.getEntry(luogo_decesso___eq));
        }
        if (luogo_decesso___ne != null) {
            joiner.add("luogo_decesso___ne: " + GraphQLRequestSerializer.getEntry(luogo_decesso___ne));
        }
        if (luogo_decesso___null != null) {
            joiner.add("luogo_decesso___null: " + GraphQLRequestSerializer.getEntry(luogo_decesso___null));
        }
        if (luogo_decesso___not___null != null) {
            joiner.add("luogo_decesso___not___null: " + GraphQLRequestSerializer.getEntry(luogo_decesso___not___null));
        }
        if (luogo_decesso___in != null) {
            joiner.add("luogo_decesso___in: " + GraphQLRequestSerializer.getEntry(luogo_decesso___in));
        }
        if (luogo_decesso___not___in != null) {
            joiner.add("luogo_decesso___not___in: " + GraphQLRequestSerializer.getEntry(luogo_decesso___not___in));
        }
        if (luogo_decesso___lt != null) {
            joiner.add("luogo_decesso___lt: " + GraphQLRequestSerializer.getEntry(luogo_decesso___lt));
        }
        if (luogo_decesso___lte != null) {
            joiner.add("luogo_decesso___lte: " + GraphQLRequestSerializer.getEntry(luogo_decesso___lte));
        }
        if (luogo_decesso___gt != null) {
            joiner.add("luogo_decesso___gt: " + GraphQLRequestSerializer.getEntry(luogo_decesso___gt));
        }
        if (luogo_decesso___gte != null) {
            joiner.add("luogo_decesso___gte: " + GraphQLRequestSerializer.getEntry(luogo_decesso___gte));
        }
        if (luogo_decesso___contains != null) {
            joiner.add("luogo_decesso___contains: " + GraphQLRequestSerializer.getEntry(luogo_decesso___contains));
        }
        if (luogo_decesso___not___contains != null) {
            joiner.add("luogo_decesso___not___contains: " + GraphQLRequestSerializer.getEntry(luogo_decesso___not___contains));
        }
        if (luogo_decesso___starts_with != null) {
            joiner.add("luogo_decesso___starts_with: " + GraphQLRequestSerializer.getEntry(luogo_decesso___starts_with));
        }
        if (luogo_decesso___not___starts_with != null) {
            joiner.add("luogo_decesso___not___starts_with: " + GraphQLRequestSerializer.getEntry(luogo_decesso___not___starts_with));
        }
        if (luogo_decesso___ends_with != null) {
            joiner.add("luogo_decesso___ends_with: " + GraphQLRequestSerializer.getEntry(luogo_decesso___ends_with));
        }
        if (luogo_decesso___not___ends_with != null) {
            joiner.add("luogo_decesso___not___ends_with: " + GraphQLRequestSerializer.getEntry(luogo_decesso___not___ends_with));
        }
        if (motivo_decesso___eq != null) {
            joiner.add("motivo_decesso___eq: " + GraphQLRequestSerializer.getEntry(motivo_decesso___eq));
        }
        if (motivo_decesso___ne != null) {
            joiner.add("motivo_decesso___ne: " + GraphQLRequestSerializer.getEntry(motivo_decesso___ne));
        }
        if (motivo_decesso___null != null) {
            joiner.add("motivo_decesso___null: " + GraphQLRequestSerializer.getEntry(motivo_decesso___null));
        }
        if (motivo_decesso___not___null != null) {
            joiner.add("motivo_decesso___not___null: " + GraphQLRequestSerializer.getEntry(motivo_decesso___not___null));
        }
        if (motivo_decesso___in != null) {
            joiner.add("motivo_decesso___in: " + GraphQLRequestSerializer.getEntry(motivo_decesso___in));
        }
        if (motivo_decesso___not___in != null) {
            joiner.add("motivo_decesso___not___in: " + GraphQLRequestSerializer.getEntry(motivo_decesso___not___in));
        }
        if (motivo_decesso___lt != null) {
            joiner.add("motivo_decesso___lt: " + GraphQLRequestSerializer.getEntry(motivo_decesso___lt));
        }
        if (motivo_decesso___lte != null) {
            joiner.add("motivo_decesso___lte: " + GraphQLRequestSerializer.getEntry(motivo_decesso___lte));
        }
        if (motivo_decesso___gt != null) {
            joiner.add("motivo_decesso___gt: " + GraphQLRequestSerializer.getEntry(motivo_decesso___gt));
        }
        if (motivo_decesso___gte != null) {
            joiner.add("motivo_decesso___gte: " + GraphQLRequestSerializer.getEntry(motivo_decesso___gte));
        }
        if (motivo_decesso___contains != null) {
            joiner.add("motivo_decesso___contains: " + GraphQLRequestSerializer.getEntry(motivo_decesso___contains));
        }
        if (motivo_decesso___not___contains != null) {
            joiner.add("motivo_decesso___not___contains: " + GraphQLRequestSerializer.getEntry(motivo_decesso___not___contains));
        }
        if (motivo_decesso___starts_with != null) {
            joiner.add("motivo_decesso___starts_with: " + GraphQLRequestSerializer.getEntry(motivo_decesso___starts_with));
        }
        if (motivo_decesso___not___starts_with != null) {
            joiner.add("motivo_decesso___not___starts_with: " + GraphQLRequestSerializer.getEntry(motivo_decesso___not___starts_with));
        }
        if (motivo_decesso___ends_with != null) {
            joiner.add("motivo_decesso___ends_with: " + GraphQLRequestSerializer.getEntry(motivo_decesso___ends_with));
        }
        if (motivo_decesso___not___ends_with != null) {
            joiner.add("motivo_decesso___not___ends_with: " + GraphQLRequestSerializer.getEntry(motivo_decesso___not___ends_with));
        }
        if (motivo_dropout___eq != null) {
            joiner.add("motivo_dropout___eq: " + GraphQLRequestSerializer.getEntry(motivo_dropout___eq));
        }
        if (motivo_dropout___ne != null) {
            joiner.add("motivo_dropout___ne: " + GraphQLRequestSerializer.getEntry(motivo_dropout___ne));
        }
        if (motivo_dropout___null != null) {
            joiner.add("motivo_dropout___null: " + GraphQLRequestSerializer.getEntry(motivo_dropout___null));
        }
        if (motivo_dropout___not___null != null) {
            joiner.add("motivo_dropout___not___null: " + GraphQLRequestSerializer.getEntry(motivo_dropout___not___null));
        }
        if (motivo_dropout___in != null) {
            joiner.add("motivo_dropout___in: " + GraphQLRequestSerializer.getEntry(motivo_dropout___in));
        }
        if (motivo_dropout___not___in != null) {
            joiner.add("motivo_dropout___not___in: " + GraphQLRequestSerializer.getEntry(motivo_dropout___not___in));
        }
        if (motivo_dropout___lt != null) {
            joiner.add("motivo_dropout___lt: " + GraphQLRequestSerializer.getEntry(motivo_dropout___lt));
        }
        if (motivo_dropout___lte != null) {
            joiner.add("motivo_dropout___lte: " + GraphQLRequestSerializer.getEntry(motivo_dropout___lte));
        }
        if (motivo_dropout___gt != null) {
            joiner.add("motivo_dropout___gt: " + GraphQLRequestSerializer.getEntry(motivo_dropout___gt));
        }
        if (motivo_dropout___gte != null) {
            joiner.add("motivo_dropout___gte: " + GraphQLRequestSerializer.getEntry(motivo_dropout___gte));
        }
        if (motivo_dropout___contains != null) {
            joiner.add("motivo_dropout___contains: " + GraphQLRequestSerializer.getEntry(motivo_dropout___contains));
        }
        if (motivo_dropout___not___contains != null) {
            joiner.add("motivo_dropout___not___contains: " + GraphQLRequestSerializer.getEntry(motivo_dropout___not___contains));
        }
        if (motivo_dropout___starts_with != null) {
            joiner.add("motivo_dropout___starts_with: " + GraphQLRequestSerializer.getEntry(motivo_dropout___starts_with));
        }
        if (motivo_dropout___not___starts_with != null) {
            joiner.add("motivo_dropout___not___starts_with: " + GraphQLRequestSerializer.getEntry(motivo_dropout___not___starts_with));
        }
        if (motivo_dropout___ends_with != null) {
            joiner.add("motivo_dropout___ends_with: " + GraphQLRequestSerializer.getEntry(motivo_dropout___ends_with));
        }
        if (motivo_dropout___not___ends_with != null) {
            joiner.add("motivo_dropout___not___ends_with: " + GraphQLRequestSerializer.getEntry(motivo_dropout___not___ends_with));
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
        if (status_vita___eq != null) {
            joiner.add("status_vita___eq: " + GraphQLRequestSerializer.getEntry(status_vita___eq));
        }
        if (status_vita___ne != null) {
            joiner.add("status_vita___ne: " + GraphQLRequestSerializer.getEntry(status_vita___ne));
        }
        if (status_vita___null != null) {
            joiner.add("status_vita___null: " + GraphQLRequestSerializer.getEntry(status_vita___null));
        }
        if (status_vita___not___null != null) {
            joiner.add("status_vita___not___null: " + GraphQLRequestSerializer.getEntry(status_vita___not___null));
        }
        if (status_vita___in != null) {
            joiner.add("status_vita___in: " + GraphQLRequestSerializer.getEntry(status_vita___in));
        }
        if (status_vita___not___in != null) {
            joiner.add("status_vita___not___in: " + GraphQLRequestSerializer.getEntry(status_vita___not___in));
        }
        if (status_vita___lt != null) {
            joiner.add("status_vita___lt: " + GraphQLRequestSerializer.getEntry(status_vita___lt));
        }
        if (status_vita___lte != null) {
            joiner.add("status_vita___lte: " + GraphQLRequestSerializer.getEntry(status_vita___lte));
        }
        if (status_vita___gt != null) {
            joiner.add("status_vita___gt: " + GraphQLRequestSerializer.getEntry(status_vita___gt));
        }
        if (status_vita___gte != null) {
            joiner.add("status_vita___gte: " + GraphQLRequestSerializer.getEntry(status_vita___gte));
        }
        if (status_vita___contains != null) {
            joiner.add("status_vita___contains: " + GraphQLRequestSerializer.getEntry(status_vita___contains));
        }
        if (status_vita___not___contains != null) {
            joiner.add("status_vita___not___contains: " + GraphQLRequestSerializer.getEntry(status_vita___not___contains));
        }
        if (status_vita___starts_with != null) {
            joiner.add("status_vita___starts_with: " + GraphQLRequestSerializer.getEntry(status_vita___starts_with));
        }
        if (status_vita___not___starts_with != null) {
            joiner.add("status_vita___not___starts_with: " + GraphQLRequestSerializer.getEntry(status_vita___not___starts_with));
        }
        if (status_vita___ends_with != null) {
            joiner.add("status_vita___ends_with: " + GraphQLRequestSerializer.getEntry(status_vita___ends_with));
        }
        if (status_vita___not___ends_with != null) {
            joiner.add("status_vita___not___ends_with: " + GraphQLRequestSerializer.getEntry(status_vita___not___ends_with));
        }
        if (ultima_visita_ok___eq != null) {
            joiner.add("ultima_visita_ok___eq: " + GraphQLRequestSerializer.getEntry(ultima_visita_ok___eq));
        }
        if (ultima_visita_ok___ne != null) {
            joiner.add("ultima_visita_ok___ne: " + GraphQLRequestSerializer.getEntry(ultima_visita_ok___ne));
        }
        if (ultima_visita_ok___null != null) {
            joiner.add("ultima_visita_ok___null: " + GraphQLRequestSerializer.getEntry(ultima_visita_ok___null));
        }
        if (ultima_visita_ok___not___null != null) {
            joiner.add("ultima_visita_ok___not___null: " + GraphQLRequestSerializer.getEntry(ultima_visita_ok___not___null));
        }
        if (ultima_visita_ok___in != null) {
            joiner.add("ultima_visita_ok___in: " + GraphQLRequestSerializer.getEntry(ultima_visita_ok___in));
        }
        if (ultima_visita_ok___not___in != null) {
            joiner.add("ultima_visita_ok___not___in: " + GraphQLRequestSerializer.getEntry(ultima_visita_ok___not___in));
        }
        if (ultima_visita_ok___lt != null) {
            joiner.add("ultima_visita_ok___lt: " + GraphQLRequestSerializer.getEntry(ultima_visita_ok___lt));
        }
        if (ultima_visita_ok___lte != null) {
            joiner.add("ultima_visita_ok___lte: " + GraphQLRequestSerializer.getEntry(ultima_visita_ok___lte));
        }
        if (ultima_visita_ok___gt != null) {
            joiner.add("ultima_visita_ok___gt: " + GraphQLRequestSerializer.getEntry(ultima_visita_ok___gt));
        }
        if (ultima_visita_ok___gte != null) {
            joiner.add("ultima_visita_ok___gte: " + GraphQLRequestSerializer.getEntry(ultima_visita_ok___gte));
        }
        if (undropped___eq != null) {
            joiner.add("undropped___eq: " + GraphQLRequestSerializer.getEntry(undropped___eq));
        }
        if (undropped___ne != null) {
            joiner.add("undropped___ne: " + GraphQLRequestSerializer.getEntry(undropped___ne));
        }
        if (undropped___null != null) {
            joiner.add("undropped___null: " + GraphQLRequestSerializer.getEntry(undropped___null));
        }
        if (undropped___not___null != null) {
            joiner.add("undropped___not___null: " + GraphQLRequestSerializer.getEntry(undropped___not___null));
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

    public static CliDropoutFilterDTO.Builder builder() {
        return new CliDropoutFilterDTO.Builder();
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
        private String altro_causa_decesso___eq;
        private String altro_causa_decesso___ne;
        private Boolean altro_causa_decesso___null;
        private Boolean altro_causa_decesso___not___null;
        private java.util.List<String> altro_causa_decesso___in;
        private java.util.List<String> altro_causa_decesso___not___in;
        private String altro_causa_decesso___lt;
        private String altro_causa_decesso___lte;
        private String altro_causa_decesso___gt;
        private String altro_causa_decesso___gte;
        private String altro_causa_decesso___contains;
        private String altro_causa_decesso___not___contains;
        private String altro_causa_decesso___starts_with;
        private String altro_causa_decesso___not___starts_with;
        private String altro_causa_decesso___ends_with;
        private String altro_causa_decesso___not___ends_with;
        private String altro_motivo_drop___eq;
        private String altro_motivo_drop___ne;
        private Boolean altro_motivo_drop___null;
        private Boolean altro_motivo_drop___not___null;
        private java.util.List<String> altro_motivo_drop___in;
        private java.util.List<String> altro_motivo_drop___not___in;
        private String altro_motivo_drop___lt;
        private String altro_motivo_drop___lte;
        private String altro_motivo_drop___gt;
        private String altro_motivo_drop___gte;
        private String altro_motivo_drop___contains;
        private String altro_motivo_drop___not___contains;
        private String altro_motivo_drop___starts_with;
        private String altro_motivo_drop___not___starts_with;
        private String altro_motivo_drop___ends_with;
        private String altro_motivo_drop___not___ends_with;
        private String altro_sede_decesso___eq;
        private String altro_sede_decesso___ne;
        private Boolean altro_sede_decesso___null;
        private Boolean altro_sede_decesso___not___null;
        private java.util.List<String> altro_sede_decesso___in;
        private java.util.List<String> altro_sede_decesso___not___in;
        private String altro_sede_decesso___lt;
        private String altro_sede_decesso___lte;
        private String altro_sede_decesso___gt;
        private String altro_sede_decesso___gte;
        private String altro_sede_decesso___contains;
        private String altro_sede_decesso___not___contains;
        private String altro_sede_decesso___starts_with;
        private String altro_sede_decesso___not___starts_with;
        private String altro_sede_decesso___ends_with;
        private String altro_sede_decesso___not___ends_with;
        private Boolean autopsia___eq;
        private Boolean autopsia___ne;
        private Boolean autopsia___null;
        private Boolean autopsia___not___null;
        private String causa_decesso_nome1___eq;
        private String causa_decesso_nome1___ne;
        private Boolean causa_decesso_nome1___null;
        private Boolean causa_decesso_nome1___not___null;
        private java.util.List<String> causa_decesso_nome1___in;
        private java.util.List<String> causa_decesso_nome1___not___in;
        private String causa_decesso_nome1___lt;
        private String causa_decesso_nome1___lte;
        private String causa_decesso_nome1___gt;
        private String causa_decesso_nome1___gte;
        private String causa_decesso_nome1___contains;
        private String causa_decesso_nome1___not___contains;
        private String causa_decesso_nome1___starts_with;
        private String causa_decesso_nome1___not___starts_with;
        private String causa_decesso_nome1___ends_with;
        private String causa_decesso_nome1___not___ends_with;
        private String causa_decesso_nome2___eq;
        private String causa_decesso_nome2___ne;
        private Boolean causa_decesso_nome2___null;
        private Boolean causa_decesso_nome2___not___null;
        private java.util.List<String> causa_decesso_nome2___in;
        private java.util.List<String> causa_decesso_nome2___not___in;
        private String causa_decesso_nome2___lt;
        private String causa_decesso_nome2___lte;
        private String causa_decesso_nome2___gt;
        private String causa_decesso_nome2___gte;
        private String causa_decesso_nome2___contains;
        private String causa_decesso_nome2___not___contains;
        private String causa_decesso_nome2___starts_with;
        private String causa_decesso_nome2___not___starts_with;
        private String causa_decesso_nome2___ends_with;
        private String causa_decesso_nome2___not___ends_with;
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
        private String data___eq;
        private String data___ne;
        private Boolean data___null;
        private Boolean data___not___null;
        private java.util.List<String> data___in;
        private java.util.List<String> data___not___in;
        private String data___lt;
        private String data___lte;
        private String data___gt;
        private String data___gte;
        private String data_decesso___eq;
        private String data_decesso___ne;
        private Boolean data_decesso___null;
        private Boolean data_decesso___not___null;
        private java.util.List<String> data_decesso___in;
        private java.util.List<String> data_decesso___not___in;
        private String data_decesso___lt;
        private String data_decesso___lte;
        private String data_decesso___gt;
        private String data_decesso___gte;
        private String data_status_vita___eq;
        private String data_status_vita___ne;
        private Boolean data_status_vita___null;
        private Boolean data_status_vita___not___null;
        private java.util.List<String> data_status_vita___in;
        private java.util.List<String> data_status_vita___not___in;
        private String data_status_vita___lt;
        private String data_status_vita___lte;
        private String data_status_vita___gt;
        private String data_status_vita___gte;
        private Boolean deceduto___eq;
        private Boolean deceduto___ne;
        private Boolean deceduto___null;
        private Boolean deceduto___not___null;
        private String luogo_decesso___eq;
        private String luogo_decesso___ne;
        private Boolean luogo_decesso___null;
        private Boolean luogo_decesso___not___null;
        private java.util.List<String> luogo_decesso___in;
        private java.util.List<String> luogo_decesso___not___in;
        private String luogo_decesso___lt;
        private String luogo_decesso___lte;
        private String luogo_decesso___gt;
        private String luogo_decesso___gte;
        private String luogo_decesso___contains;
        private String luogo_decesso___not___contains;
        private String luogo_decesso___starts_with;
        private String luogo_decesso___not___starts_with;
        private String luogo_decesso___ends_with;
        private String luogo_decesso___not___ends_with;
        private String motivo_decesso___eq;
        private String motivo_decesso___ne;
        private Boolean motivo_decesso___null;
        private Boolean motivo_decesso___not___null;
        private java.util.List<String> motivo_decesso___in;
        private java.util.List<String> motivo_decesso___not___in;
        private String motivo_decesso___lt;
        private String motivo_decesso___lte;
        private String motivo_decesso___gt;
        private String motivo_decesso___gte;
        private String motivo_decesso___contains;
        private String motivo_decesso___not___contains;
        private String motivo_decesso___starts_with;
        private String motivo_decesso___not___starts_with;
        private String motivo_decesso___ends_with;
        private String motivo_decesso___not___ends_with;
        private String motivo_dropout___eq;
        private String motivo_dropout___ne;
        private Boolean motivo_dropout___null;
        private Boolean motivo_dropout___not___null;
        private java.util.List<String> motivo_dropout___in;
        private java.util.List<String> motivo_dropout___not___in;
        private String motivo_dropout___lt;
        private String motivo_dropout___lte;
        private String motivo_dropout___gt;
        private String motivo_dropout___gte;
        private String motivo_dropout___contains;
        private String motivo_dropout___not___contains;
        private String motivo_dropout___starts_with;
        private String motivo_dropout___not___starts_with;
        private String motivo_dropout___ends_with;
        private String motivo_dropout___not___ends_with;
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
        private String status_vita___eq;
        private String status_vita___ne;
        private Boolean status_vita___null;
        private Boolean status_vita___not___null;
        private java.util.List<String> status_vita___in;
        private java.util.List<String> status_vita___not___in;
        private String status_vita___lt;
        private String status_vita___lte;
        private String status_vita___gt;
        private String status_vita___gte;
        private String status_vita___contains;
        private String status_vita___not___contains;
        private String status_vita___starts_with;
        private String status_vita___not___starts_with;
        private String status_vita___ends_with;
        private String status_vita___not___ends_with;
        private String ultima_visita_ok___eq;
        private String ultima_visita_ok___ne;
        private Boolean ultima_visita_ok___null;
        private Boolean ultima_visita_ok___not___null;
        private java.util.List<String> ultima_visita_ok___in;
        private java.util.List<String> ultima_visita_ok___not___in;
        private String ultima_visita_ok___lt;
        private String ultima_visita_ok___lte;
        private String ultima_visita_ok___gt;
        private String ultima_visita_ok___gte;
        private Boolean undropped___eq;
        private Boolean undropped___ne;
        private Boolean undropped___null;
        private Boolean undropped___not___null;
        private java.util.List<CliDropoutFilterDTO> AND;
        private java.util.List<CliDropoutFilterDTO> OR;
        private CliDropoutFilterDTO NOT;

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

        public Builder setAltro_causa_decesso___eq(String altro_causa_decesso___eq) {
            this.altro_causa_decesso___eq = altro_causa_decesso___eq;
            return this;
        }

        public Builder setAltro_causa_decesso___ne(String altro_causa_decesso___ne) {
            this.altro_causa_decesso___ne = altro_causa_decesso___ne;
            return this;
        }

        public Builder setAltro_causa_decesso___null(Boolean altro_causa_decesso___null) {
            this.altro_causa_decesso___null = altro_causa_decesso___null;
            return this;
        }

        public Builder setAltro_causa_decesso___not___null(Boolean altro_causa_decesso___not___null) {
            this.altro_causa_decesso___not___null = altro_causa_decesso___not___null;
            return this;
        }

        public Builder setAltro_causa_decesso___in(java.util.List<String> altro_causa_decesso___in) {
            this.altro_causa_decesso___in = altro_causa_decesso___in;
            return this;
        }

        public Builder setAltro_causa_decesso___not___in(java.util.List<String> altro_causa_decesso___not___in) {
            this.altro_causa_decesso___not___in = altro_causa_decesso___not___in;
            return this;
        }

        public Builder setAltro_causa_decesso___lt(String altro_causa_decesso___lt) {
            this.altro_causa_decesso___lt = altro_causa_decesso___lt;
            return this;
        }

        public Builder setAltro_causa_decesso___lte(String altro_causa_decesso___lte) {
            this.altro_causa_decesso___lte = altro_causa_decesso___lte;
            return this;
        }

        public Builder setAltro_causa_decesso___gt(String altro_causa_decesso___gt) {
            this.altro_causa_decesso___gt = altro_causa_decesso___gt;
            return this;
        }

        public Builder setAltro_causa_decesso___gte(String altro_causa_decesso___gte) {
            this.altro_causa_decesso___gte = altro_causa_decesso___gte;
            return this;
        }

        public Builder setAltro_causa_decesso___contains(String altro_causa_decesso___contains) {
            this.altro_causa_decesso___contains = altro_causa_decesso___contains;
            return this;
        }

        public Builder setAltro_causa_decesso___not___contains(String altro_causa_decesso___not___contains) {
            this.altro_causa_decesso___not___contains = altro_causa_decesso___not___contains;
            return this;
        }

        public Builder setAltro_causa_decesso___starts_with(String altro_causa_decesso___starts_with) {
            this.altro_causa_decesso___starts_with = altro_causa_decesso___starts_with;
            return this;
        }

        public Builder setAltro_causa_decesso___not___starts_with(String altro_causa_decesso___not___starts_with) {
            this.altro_causa_decesso___not___starts_with = altro_causa_decesso___not___starts_with;
            return this;
        }

        public Builder setAltro_causa_decesso___ends_with(String altro_causa_decesso___ends_with) {
            this.altro_causa_decesso___ends_with = altro_causa_decesso___ends_with;
            return this;
        }

        public Builder setAltro_causa_decesso___not___ends_with(String altro_causa_decesso___not___ends_with) {
            this.altro_causa_decesso___not___ends_with = altro_causa_decesso___not___ends_with;
            return this;
        }

        public Builder setAltro_motivo_drop___eq(String altro_motivo_drop___eq) {
            this.altro_motivo_drop___eq = altro_motivo_drop___eq;
            return this;
        }

        public Builder setAltro_motivo_drop___ne(String altro_motivo_drop___ne) {
            this.altro_motivo_drop___ne = altro_motivo_drop___ne;
            return this;
        }

        public Builder setAltro_motivo_drop___null(Boolean altro_motivo_drop___null) {
            this.altro_motivo_drop___null = altro_motivo_drop___null;
            return this;
        }

        public Builder setAltro_motivo_drop___not___null(Boolean altro_motivo_drop___not___null) {
            this.altro_motivo_drop___not___null = altro_motivo_drop___not___null;
            return this;
        }

        public Builder setAltro_motivo_drop___in(java.util.List<String> altro_motivo_drop___in) {
            this.altro_motivo_drop___in = altro_motivo_drop___in;
            return this;
        }

        public Builder setAltro_motivo_drop___not___in(java.util.List<String> altro_motivo_drop___not___in) {
            this.altro_motivo_drop___not___in = altro_motivo_drop___not___in;
            return this;
        }

        public Builder setAltro_motivo_drop___lt(String altro_motivo_drop___lt) {
            this.altro_motivo_drop___lt = altro_motivo_drop___lt;
            return this;
        }

        public Builder setAltro_motivo_drop___lte(String altro_motivo_drop___lte) {
            this.altro_motivo_drop___lte = altro_motivo_drop___lte;
            return this;
        }

        public Builder setAltro_motivo_drop___gt(String altro_motivo_drop___gt) {
            this.altro_motivo_drop___gt = altro_motivo_drop___gt;
            return this;
        }

        public Builder setAltro_motivo_drop___gte(String altro_motivo_drop___gte) {
            this.altro_motivo_drop___gte = altro_motivo_drop___gte;
            return this;
        }

        public Builder setAltro_motivo_drop___contains(String altro_motivo_drop___contains) {
            this.altro_motivo_drop___contains = altro_motivo_drop___contains;
            return this;
        }

        public Builder setAltro_motivo_drop___not___contains(String altro_motivo_drop___not___contains) {
            this.altro_motivo_drop___not___contains = altro_motivo_drop___not___contains;
            return this;
        }

        public Builder setAltro_motivo_drop___starts_with(String altro_motivo_drop___starts_with) {
            this.altro_motivo_drop___starts_with = altro_motivo_drop___starts_with;
            return this;
        }

        public Builder setAltro_motivo_drop___not___starts_with(String altro_motivo_drop___not___starts_with) {
            this.altro_motivo_drop___not___starts_with = altro_motivo_drop___not___starts_with;
            return this;
        }

        public Builder setAltro_motivo_drop___ends_with(String altro_motivo_drop___ends_with) {
            this.altro_motivo_drop___ends_with = altro_motivo_drop___ends_with;
            return this;
        }

        public Builder setAltro_motivo_drop___not___ends_with(String altro_motivo_drop___not___ends_with) {
            this.altro_motivo_drop___not___ends_with = altro_motivo_drop___not___ends_with;
            return this;
        }

        public Builder setAltro_sede_decesso___eq(String altro_sede_decesso___eq) {
            this.altro_sede_decesso___eq = altro_sede_decesso___eq;
            return this;
        }

        public Builder setAltro_sede_decesso___ne(String altro_sede_decesso___ne) {
            this.altro_sede_decesso___ne = altro_sede_decesso___ne;
            return this;
        }

        public Builder setAltro_sede_decesso___null(Boolean altro_sede_decesso___null) {
            this.altro_sede_decesso___null = altro_sede_decesso___null;
            return this;
        }

        public Builder setAltro_sede_decesso___not___null(Boolean altro_sede_decesso___not___null) {
            this.altro_sede_decesso___not___null = altro_sede_decesso___not___null;
            return this;
        }

        public Builder setAltro_sede_decesso___in(java.util.List<String> altro_sede_decesso___in) {
            this.altro_sede_decesso___in = altro_sede_decesso___in;
            return this;
        }

        public Builder setAltro_sede_decesso___not___in(java.util.List<String> altro_sede_decesso___not___in) {
            this.altro_sede_decesso___not___in = altro_sede_decesso___not___in;
            return this;
        }

        public Builder setAltro_sede_decesso___lt(String altro_sede_decesso___lt) {
            this.altro_sede_decesso___lt = altro_sede_decesso___lt;
            return this;
        }

        public Builder setAltro_sede_decesso___lte(String altro_sede_decesso___lte) {
            this.altro_sede_decesso___lte = altro_sede_decesso___lte;
            return this;
        }

        public Builder setAltro_sede_decesso___gt(String altro_sede_decesso___gt) {
            this.altro_sede_decesso___gt = altro_sede_decesso___gt;
            return this;
        }

        public Builder setAltro_sede_decesso___gte(String altro_sede_decesso___gte) {
            this.altro_sede_decesso___gte = altro_sede_decesso___gte;
            return this;
        }

        public Builder setAltro_sede_decesso___contains(String altro_sede_decesso___contains) {
            this.altro_sede_decesso___contains = altro_sede_decesso___contains;
            return this;
        }

        public Builder setAltro_sede_decesso___not___contains(String altro_sede_decesso___not___contains) {
            this.altro_sede_decesso___not___contains = altro_sede_decesso___not___contains;
            return this;
        }

        public Builder setAltro_sede_decesso___starts_with(String altro_sede_decesso___starts_with) {
            this.altro_sede_decesso___starts_with = altro_sede_decesso___starts_with;
            return this;
        }

        public Builder setAltro_sede_decesso___not___starts_with(String altro_sede_decesso___not___starts_with) {
            this.altro_sede_decesso___not___starts_with = altro_sede_decesso___not___starts_with;
            return this;
        }

        public Builder setAltro_sede_decesso___ends_with(String altro_sede_decesso___ends_with) {
            this.altro_sede_decesso___ends_with = altro_sede_decesso___ends_with;
            return this;
        }

        public Builder setAltro_sede_decesso___not___ends_with(String altro_sede_decesso___not___ends_with) {
            this.altro_sede_decesso___not___ends_with = altro_sede_decesso___not___ends_with;
            return this;
        }

        public Builder setAutopsia___eq(Boolean autopsia___eq) {
            this.autopsia___eq = autopsia___eq;
            return this;
        }

        public Builder setAutopsia___ne(Boolean autopsia___ne) {
            this.autopsia___ne = autopsia___ne;
            return this;
        }

        public Builder setAutopsia___null(Boolean autopsia___null) {
            this.autopsia___null = autopsia___null;
            return this;
        }

        public Builder setAutopsia___not___null(Boolean autopsia___not___null) {
            this.autopsia___not___null = autopsia___not___null;
            return this;
        }

        public Builder setCausa_decesso_nome1___eq(String causa_decesso_nome1___eq) {
            this.causa_decesso_nome1___eq = causa_decesso_nome1___eq;
            return this;
        }

        public Builder setCausa_decesso_nome1___ne(String causa_decesso_nome1___ne) {
            this.causa_decesso_nome1___ne = causa_decesso_nome1___ne;
            return this;
        }

        public Builder setCausa_decesso_nome1___null(Boolean causa_decesso_nome1___null) {
            this.causa_decesso_nome1___null = causa_decesso_nome1___null;
            return this;
        }

        public Builder setCausa_decesso_nome1___not___null(Boolean causa_decesso_nome1___not___null) {
            this.causa_decesso_nome1___not___null = causa_decesso_nome1___not___null;
            return this;
        }

        public Builder setCausa_decesso_nome1___in(java.util.List<String> causa_decesso_nome1___in) {
            this.causa_decesso_nome1___in = causa_decesso_nome1___in;
            return this;
        }

        public Builder setCausa_decesso_nome1___not___in(java.util.List<String> causa_decesso_nome1___not___in) {
            this.causa_decesso_nome1___not___in = causa_decesso_nome1___not___in;
            return this;
        }

        public Builder setCausa_decesso_nome1___lt(String causa_decesso_nome1___lt) {
            this.causa_decesso_nome1___lt = causa_decesso_nome1___lt;
            return this;
        }

        public Builder setCausa_decesso_nome1___lte(String causa_decesso_nome1___lte) {
            this.causa_decesso_nome1___lte = causa_decesso_nome1___lte;
            return this;
        }

        public Builder setCausa_decesso_nome1___gt(String causa_decesso_nome1___gt) {
            this.causa_decesso_nome1___gt = causa_decesso_nome1___gt;
            return this;
        }

        public Builder setCausa_decesso_nome1___gte(String causa_decesso_nome1___gte) {
            this.causa_decesso_nome1___gte = causa_decesso_nome1___gte;
            return this;
        }

        public Builder setCausa_decesso_nome1___contains(String causa_decesso_nome1___contains) {
            this.causa_decesso_nome1___contains = causa_decesso_nome1___contains;
            return this;
        }

        public Builder setCausa_decesso_nome1___not___contains(String causa_decesso_nome1___not___contains) {
            this.causa_decesso_nome1___not___contains = causa_decesso_nome1___not___contains;
            return this;
        }

        public Builder setCausa_decesso_nome1___starts_with(String causa_decesso_nome1___starts_with) {
            this.causa_decesso_nome1___starts_with = causa_decesso_nome1___starts_with;
            return this;
        }

        public Builder setCausa_decesso_nome1___not___starts_with(String causa_decesso_nome1___not___starts_with) {
            this.causa_decesso_nome1___not___starts_with = causa_decesso_nome1___not___starts_with;
            return this;
        }

        public Builder setCausa_decesso_nome1___ends_with(String causa_decesso_nome1___ends_with) {
            this.causa_decesso_nome1___ends_with = causa_decesso_nome1___ends_with;
            return this;
        }

        public Builder setCausa_decesso_nome1___not___ends_with(String causa_decesso_nome1___not___ends_with) {
            this.causa_decesso_nome1___not___ends_with = causa_decesso_nome1___not___ends_with;
            return this;
        }

        public Builder setCausa_decesso_nome2___eq(String causa_decesso_nome2___eq) {
            this.causa_decesso_nome2___eq = causa_decesso_nome2___eq;
            return this;
        }

        public Builder setCausa_decesso_nome2___ne(String causa_decesso_nome2___ne) {
            this.causa_decesso_nome2___ne = causa_decesso_nome2___ne;
            return this;
        }

        public Builder setCausa_decesso_nome2___null(Boolean causa_decesso_nome2___null) {
            this.causa_decesso_nome2___null = causa_decesso_nome2___null;
            return this;
        }

        public Builder setCausa_decesso_nome2___not___null(Boolean causa_decesso_nome2___not___null) {
            this.causa_decesso_nome2___not___null = causa_decesso_nome2___not___null;
            return this;
        }

        public Builder setCausa_decesso_nome2___in(java.util.List<String> causa_decesso_nome2___in) {
            this.causa_decesso_nome2___in = causa_decesso_nome2___in;
            return this;
        }

        public Builder setCausa_decesso_nome2___not___in(java.util.List<String> causa_decesso_nome2___not___in) {
            this.causa_decesso_nome2___not___in = causa_decesso_nome2___not___in;
            return this;
        }

        public Builder setCausa_decesso_nome2___lt(String causa_decesso_nome2___lt) {
            this.causa_decesso_nome2___lt = causa_decesso_nome2___lt;
            return this;
        }

        public Builder setCausa_decesso_nome2___lte(String causa_decesso_nome2___lte) {
            this.causa_decesso_nome2___lte = causa_decesso_nome2___lte;
            return this;
        }

        public Builder setCausa_decesso_nome2___gt(String causa_decesso_nome2___gt) {
            this.causa_decesso_nome2___gt = causa_decesso_nome2___gt;
            return this;
        }

        public Builder setCausa_decesso_nome2___gte(String causa_decesso_nome2___gte) {
            this.causa_decesso_nome2___gte = causa_decesso_nome2___gte;
            return this;
        }

        public Builder setCausa_decesso_nome2___contains(String causa_decesso_nome2___contains) {
            this.causa_decesso_nome2___contains = causa_decesso_nome2___contains;
            return this;
        }

        public Builder setCausa_decesso_nome2___not___contains(String causa_decesso_nome2___not___contains) {
            this.causa_decesso_nome2___not___contains = causa_decesso_nome2___not___contains;
            return this;
        }

        public Builder setCausa_decesso_nome2___starts_with(String causa_decesso_nome2___starts_with) {
            this.causa_decesso_nome2___starts_with = causa_decesso_nome2___starts_with;
            return this;
        }

        public Builder setCausa_decesso_nome2___not___starts_with(String causa_decesso_nome2___not___starts_with) {
            this.causa_decesso_nome2___not___starts_with = causa_decesso_nome2___not___starts_with;
            return this;
        }

        public Builder setCausa_decesso_nome2___ends_with(String causa_decesso_nome2___ends_with) {
            this.causa_decesso_nome2___ends_with = causa_decesso_nome2___ends_with;
            return this;
        }

        public Builder setCausa_decesso_nome2___not___ends_with(String causa_decesso_nome2___not___ends_with) {
            this.causa_decesso_nome2___not___ends_with = causa_decesso_nome2___not___ends_with;
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

        public Builder setData___eq(String data___eq) {
            this.data___eq = data___eq;
            return this;
        }

        public Builder setData___ne(String data___ne) {
            this.data___ne = data___ne;
            return this;
        }

        public Builder setData___null(Boolean data___null) {
            this.data___null = data___null;
            return this;
        }

        public Builder setData___not___null(Boolean data___not___null) {
            this.data___not___null = data___not___null;
            return this;
        }

        public Builder setData___in(java.util.List<String> data___in) {
            this.data___in = data___in;
            return this;
        }

        public Builder setData___not___in(java.util.List<String> data___not___in) {
            this.data___not___in = data___not___in;
            return this;
        }

        public Builder setData___lt(String data___lt) {
            this.data___lt = data___lt;
            return this;
        }

        public Builder setData___lte(String data___lte) {
            this.data___lte = data___lte;
            return this;
        }

        public Builder setData___gt(String data___gt) {
            this.data___gt = data___gt;
            return this;
        }

        public Builder setData___gte(String data___gte) {
            this.data___gte = data___gte;
            return this;
        }

        public Builder setData_decesso___eq(String data_decesso___eq) {
            this.data_decesso___eq = data_decesso___eq;
            return this;
        }

        public Builder setData_decesso___ne(String data_decesso___ne) {
            this.data_decesso___ne = data_decesso___ne;
            return this;
        }

        public Builder setData_decesso___null(Boolean data_decesso___null) {
            this.data_decesso___null = data_decesso___null;
            return this;
        }

        public Builder setData_decesso___not___null(Boolean data_decesso___not___null) {
            this.data_decesso___not___null = data_decesso___not___null;
            return this;
        }

        public Builder setData_decesso___in(java.util.List<String> data_decesso___in) {
            this.data_decesso___in = data_decesso___in;
            return this;
        }

        public Builder setData_decesso___not___in(java.util.List<String> data_decesso___not___in) {
            this.data_decesso___not___in = data_decesso___not___in;
            return this;
        }

        public Builder setData_decesso___lt(String data_decesso___lt) {
            this.data_decesso___lt = data_decesso___lt;
            return this;
        }

        public Builder setData_decesso___lte(String data_decesso___lte) {
            this.data_decesso___lte = data_decesso___lte;
            return this;
        }

        public Builder setData_decesso___gt(String data_decesso___gt) {
            this.data_decesso___gt = data_decesso___gt;
            return this;
        }

        public Builder setData_decesso___gte(String data_decesso___gte) {
            this.data_decesso___gte = data_decesso___gte;
            return this;
        }

        public Builder setData_status_vita___eq(String data_status_vita___eq) {
            this.data_status_vita___eq = data_status_vita___eq;
            return this;
        }

        public Builder setData_status_vita___ne(String data_status_vita___ne) {
            this.data_status_vita___ne = data_status_vita___ne;
            return this;
        }

        public Builder setData_status_vita___null(Boolean data_status_vita___null) {
            this.data_status_vita___null = data_status_vita___null;
            return this;
        }

        public Builder setData_status_vita___not___null(Boolean data_status_vita___not___null) {
            this.data_status_vita___not___null = data_status_vita___not___null;
            return this;
        }

        public Builder setData_status_vita___in(java.util.List<String> data_status_vita___in) {
            this.data_status_vita___in = data_status_vita___in;
            return this;
        }

        public Builder setData_status_vita___not___in(java.util.List<String> data_status_vita___not___in) {
            this.data_status_vita___not___in = data_status_vita___not___in;
            return this;
        }

        public Builder setData_status_vita___lt(String data_status_vita___lt) {
            this.data_status_vita___lt = data_status_vita___lt;
            return this;
        }

        public Builder setData_status_vita___lte(String data_status_vita___lte) {
            this.data_status_vita___lte = data_status_vita___lte;
            return this;
        }

        public Builder setData_status_vita___gt(String data_status_vita___gt) {
            this.data_status_vita___gt = data_status_vita___gt;
            return this;
        }

        public Builder setData_status_vita___gte(String data_status_vita___gte) {
            this.data_status_vita___gte = data_status_vita___gte;
            return this;
        }

        public Builder setDeceduto___eq(Boolean deceduto___eq) {
            this.deceduto___eq = deceduto___eq;
            return this;
        }

        public Builder setDeceduto___ne(Boolean deceduto___ne) {
            this.deceduto___ne = deceduto___ne;
            return this;
        }

        public Builder setDeceduto___null(Boolean deceduto___null) {
            this.deceduto___null = deceduto___null;
            return this;
        }

        public Builder setDeceduto___not___null(Boolean deceduto___not___null) {
            this.deceduto___not___null = deceduto___not___null;
            return this;
        }

        public Builder setLuogo_decesso___eq(String luogo_decesso___eq) {
            this.luogo_decesso___eq = luogo_decesso___eq;
            return this;
        }

        public Builder setLuogo_decesso___ne(String luogo_decesso___ne) {
            this.luogo_decesso___ne = luogo_decesso___ne;
            return this;
        }

        public Builder setLuogo_decesso___null(Boolean luogo_decesso___null) {
            this.luogo_decesso___null = luogo_decesso___null;
            return this;
        }

        public Builder setLuogo_decesso___not___null(Boolean luogo_decesso___not___null) {
            this.luogo_decesso___not___null = luogo_decesso___not___null;
            return this;
        }

        public Builder setLuogo_decesso___in(java.util.List<String> luogo_decesso___in) {
            this.luogo_decesso___in = luogo_decesso___in;
            return this;
        }

        public Builder setLuogo_decesso___not___in(java.util.List<String> luogo_decesso___not___in) {
            this.luogo_decesso___not___in = luogo_decesso___not___in;
            return this;
        }

        public Builder setLuogo_decesso___lt(String luogo_decesso___lt) {
            this.luogo_decesso___lt = luogo_decesso___lt;
            return this;
        }

        public Builder setLuogo_decesso___lte(String luogo_decesso___lte) {
            this.luogo_decesso___lte = luogo_decesso___lte;
            return this;
        }

        public Builder setLuogo_decesso___gt(String luogo_decesso___gt) {
            this.luogo_decesso___gt = luogo_decesso___gt;
            return this;
        }

        public Builder setLuogo_decesso___gte(String luogo_decesso___gte) {
            this.luogo_decesso___gte = luogo_decesso___gte;
            return this;
        }

        public Builder setLuogo_decesso___contains(String luogo_decesso___contains) {
            this.luogo_decesso___contains = luogo_decesso___contains;
            return this;
        }

        public Builder setLuogo_decesso___not___contains(String luogo_decesso___not___contains) {
            this.luogo_decesso___not___contains = luogo_decesso___not___contains;
            return this;
        }

        public Builder setLuogo_decesso___starts_with(String luogo_decesso___starts_with) {
            this.luogo_decesso___starts_with = luogo_decesso___starts_with;
            return this;
        }

        public Builder setLuogo_decesso___not___starts_with(String luogo_decesso___not___starts_with) {
            this.luogo_decesso___not___starts_with = luogo_decesso___not___starts_with;
            return this;
        }

        public Builder setLuogo_decesso___ends_with(String luogo_decesso___ends_with) {
            this.luogo_decesso___ends_with = luogo_decesso___ends_with;
            return this;
        }

        public Builder setLuogo_decesso___not___ends_with(String luogo_decesso___not___ends_with) {
            this.luogo_decesso___not___ends_with = luogo_decesso___not___ends_with;
            return this;
        }

        public Builder setMotivo_decesso___eq(String motivo_decesso___eq) {
            this.motivo_decesso___eq = motivo_decesso___eq;
            return this;
        }

        public Builder setMotivo_decesso___ne(String motivo_decesso___ne) {
            this.motivo_decesso___ne = motivo_decesso___ne;
            return this;
        }

        public Builder setMotivo_decesso___null(Boolean motivo_decesso___null) {
            this.motivo_decesso___null = motivo_decesso___null;
            return this;
        }

        public Builder setMotivo_decesso___not___null(Boolean motivo_decesso___not___null) {
            this.motivo_decesso___not___null = motivo_decesso___not___null;
            return this;
        }

        public Builder setMotivo_decesso___in(java.util.List<String> motivo_decesso___in) {
            this.motivo_decesso___in = motivo_decesso___in;
            return this;
        }

        public Builder setMotivo_decesso___not___in(java.util.List<String> motivo_decesso___not___in) {
            this.motivo_decesso___not___in = motivo_decesso___not___in;
            return this;
        }

        public Builder setMotivo_decesso___lt(String motivo_decesso___lt) {
            this.motivo_decesso___lt = motivo_decesso___lt;
            return this;
        }

        public Builder setMotivo_decesso___lte(String motivo_decesso___lte) {
            this.motivo_decesso___lte = motivo_decesso___lte;
            return this;
        }

        public Builder setMotivo_decesso___gt(String motivo_decesso___gt) {
            this.motivo_decesso___gt = motivo_decesso___gt;
            return this;
        }

        public Builder setMotivo_decesso___gte(String motivo_decesso___gte) {
            this.motivo_decesso___gte = motivo_decesso___gte;
            return this;
        }

        public Builder setMotivo_decesso___contains(String motivo_decesso___contains) {
            this.motivo_decesso___contains = motivo_decesso___contains;
            return this;
        }

        public Builder setMotivo_decesso___not___contains(String motivo_decesso___not___contains) {
            this.motivo_decesso___not___contains = motivo_decesso___not___contains;
            return this;
        }

        public Builder setMotivo_decesso___starts_with(String motivo_decesso___starts_with) {
            this.motivo_decesso___starts_with = motivo_decesso___starts_with;
            return this;
        }

        public Builder setMotivo_decesso___not___starts_with(String motivo_decesso___not___starts_with) {
            this.motivo_decesso___not___starts_with = motivo_decesso___not___starts_with;
            return this;
        }

        public Builder setMotivo_decesso___ends_with(String motivo_decesso___ends_with) {
            this.motivo_decesso___ends_with = motivo_decesso___ends_with;
            return this;
        }

        public Builder setMotivo_decesso___not___ends_with(String motivo_decesso___not___ends_with) {
            this.motivo_decesso___not___ends_with = motivo_decesso___not___ends_with;
            return this;
        }

        public Builder setMotivo_dropout___eq(String motivo_dropout___eq) {
            this.motivo_dropout___eq = motivo_dropout___eq;
            return this;
        }

        public Builder setMotivo_dropout___ne(String motivo_dropout___ne) {
            this.motivo_dropout___ne = motivo_dropout___ne;
            return this;
        }

        public Builder setMotivo_dropout___null(Boolean motivo_dropout___null) {
            this.motivo_dropout___null = motivo_dropout___null;
            return this;
        }

        public Builder setMotivo_dropout___not___null(Boolean motivo_dropout___not___null) {
            this.motivo_dropout___not___null = motivo_dropout___not___null;
            return this;
        }

        public Builder setMotivo_dropout___in(java.util.List<String> motivo_dropout___in) {
            this.motivo_dropout___in = motivo_dropout___in;
            return this;
        }

        public Builder setMotivo_dropout___not___in(java.util.List<String> motivo_dropout___not___in) {
            this.motivo_dropout___not___in = motivo_dropout___not___in;
            return this;
        }

        public Builder setMotivo_dropout___lt(String motivo_dropout___lt) {
            this.motivo_dropout___lt = motivo_dropout___lt;
            return this;
        }

        public Builder setMotivo_dropout___lte(String motivo_dropout___lte) {
            this.motivo_dropout___lte = motivo_dropout___lte;
            return this;
        }

        public Builder setMotivo_dropout___gt(String motivo_dropout___gt) {
            this.motivo_dropout___gt = motivo_dropout___gt;
            return this;
        }

        public Builder setMotivo_dropout___gte(String motivo_dropout___gte) {
            this.motivo_dropout___gte = motivo_dropout___gte;
            return this;
        }

        public Builder setMotivo_dropout___contains(String motivo_dropout___contains) {
            this.motivo_dropout___contains = motivo_dropout___contains;
            return this;
        }

        public Builder setMotivo_dropout___not___contains(String motivo_dropout___not___contains) {
            this.motivo_dropout___not___contains = motivo_dropout___not___contains;
            return this;
        }

        public Builder setMotivo_dropout___starts_with(String motivo_dropout___starts_with) {
            this.motivo_dropout___starts_with = motivo_dropout___starts_with;
            return this;
        }

        public Builder setMotivo_dropout___not___starts_with(String motivo_dropout___not___starts_with) {
            this.motivo_dropout___not___starts_with = motivo_dropout___not___starts_with;
            return this;
        }

        public Builder setMotivo_dropout___ends_with(String motivo_dropout___ends_with) {
            this.motivo_dropout___ends_with = motivo_dropout___ends_with;
            return this;
        }

        public Builder setMotivo_dropout___not___ends_with(String motivo_dropout___not___ends_with) {
            this.motivo_dropout___not___ends_with = motivo_dropout___not___ends_with;
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

        public Builder setStatus_vita___eq(String status_vita___eq) {
            this.status_vita___eq = status_vita___eq;
            return this;
        }

        public Builder setStatus_vita___ne(String status_vita___ne) {
            this.status_vita___ne = status_vita___ne;
            return this;
        }

        public Builder setStatus_vita___null(Boolean status_vita___null) {
            this.status_vita___null = status_vita___null;
            return this;
        }

        public Builder setStatus_vita___not___null(Boolean status_vita___not___null) {
            this.status_vita___not___null = status_vita___not___null;
            return this;
        }

        public Builder setStatus_vita___in(java.util.List<String> status_vita___in) {
            this.status_vita___in = status_vita___in;
            return this;
        }

        public Builder setStatus_vita___not___in(java.util.List<String> status_vita___not___in) {
            this.status_vita___not___in = status_vita___not___in;
            return this;
        }

        public Builder setStatus_vita___lt(String status_vita___lt) {
            this.status_vita___lt = status_vita___lt;
            return this;
        }

        public Builder setStatus_vita___lte(String status_vita___lte) {
            this.status_vita___lte = status_vita___lte;
            return this;
        }

        public Builder setStatus_vita___gt(String status_vita___gt) {
            this.status_vita___gt = status_vita___gt;
            return this;
        }

        public Builder setStatus_vita___gte(String status_vita___gte) {
            this.status_vita___gte = status_vita___gte;
            return this;
        }

        public Builder setStatus_vita___contains(String status_vita___contains) {
            this.status_vita___contains = status_vita___contains;
            return this;
        }

        public Builder setStatus_vita___not___contains(String status_vita___not___contains) {
            this.status_vita___not___contains = status_vita___not___contains;
            return this;
        }

        public Builder setStatus_vita___starts_with(String status_vita___starts_with) {
            this.status_vita___starts_with = status_vita___starts_with;
            return this;
        }

        public Builder setStatus_vita___not___starts_with(String status_vita___not___starts_with) {
            this.status_vita___not___starts_with = status_vita___not___starts_with;
            return this;
        }

        public Builder setStatus_vita___ends_with(String status_vita___ends_with) {
            this.status_vita___ends_with = status_vita___ends_with;
            return this;
        }

        public Builder setStatus_vita___not___ends_with(String status_vita___not___ends_with) {
            this.status_vita___not___ends_with = status_vita___not___ends_with;
            return this;
        }

        public Builder setUltima_visita_ok___eq(String ultima_visita_ok___eq) {
            this.ultima_visita_ok___eq = ultima_visita_ok___eq;
            return this;
        }

        public Builder setUltima_visita_ok___ne(String ultima_visita_ok___ne) {
            this.ultima_visita_ok___ne = ultima_visita_ok___ne;
            return this;
        }

        public Builder setUltima_visita_ok___null(Boolean ultima_visita_ok___null) {
            this.ultima_visita_ok___null = ultima_visita_ok___null;
            return this;
        }

        public Builder setUltima_visita_ok___not___null(Boolean ultima_visita_ok___not___null) {
            this.ultima_visita_ok___not___null = ultima_visita_ok___not___null;
            return this;
        }

        public Builder setUltima_visita_ok___in(java.util.List<String> ultima_visita_ok___in) {
            this.ultima_visita_ok___in = ultima_visita_ok___in;
            return this;
        }

        public Builder setUltima_visita_ok___not___in(java.util.List<String> ultima_visita_ok___not___in) {
            this.ultima_visita_ok___not___in = ultima_visita_ok___not___in;
            return this;
        }

        public Builder setUltima_visita_ok___lt(String ultima_visita_ok___lt) {
            this.ultima_visita_ok___lt = ultima_visita_ok___lt;
            return this;
        }

        public Builder setUltima_visita_ok___lte(String ultima_visita_ok___lte) {
            this.ultima_visita_ok___lte = ultima_visita_ok___lte;
            return this;
        }

        public Builder setUltima_visita_ok___gt(String ultima_visita_ok___gt) {
            this.ultima_visita_ok___gt = ultima_visita_ok___gt;
            return this;
        }

        public Builder setUltima_visita_ok___gte(String ultima_visita_ok___gte) {
            this.ultima_visita_ok___gte = ultima_visita_ok___gte;
            return this;
        }

        public Builder setUndropped___eq(Boolean undropped___eq) {
            this.undropped___eq = undropped___eq;
            return this;
        }

        public Builder setUndropped___ne(Boolean undropped___ne) {
            this.undropped___ne = undropped___ne;
            return this;
        }

        public Builder setUndropped___null(Boolean undropped___null) {
            this.undropped___null = undropped___null;
            return this;
        }

        public Builder setUndropped___not___null(Boolean undropped___not___null) {
            this.undropped___not___null = undropped___not___null;
            return this;
        }

        public Builder setAND(java.util.List<CliDropoutFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliDropoutFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliDropoutFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliDropoutFilterDTO build() {
            CliDropoutFilterDTO result = new CliDropoutFilterDTO();
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
            result.setAltro_causa_decesso___eq(this.altro_causa_decesso___eq);
            result.setAltro_causa_decesso___ne(this.altro_causa_decesso___ne);
            result.setAltro_causa_decesso___null(this.altro_causa_decesso___null);
            result.setAltro_causa_decesso___not___null(this.altro_causa_decesso___not___null);
            result.setAltro_causa_decesso___in(this.altro_causa_decesso___in);
            result.setAltro_causa_decesso___not___in(this.altro_causa_decesso___not___in);
            result.setAltro_causa_decesso___lt(this.altro_causa_decesso___lt);
            result.setAltro_causa_decesso___lte(this.altro_causa_decesso___lte);
            result.setAltro_causa_decesso___gt(this.altro_causa_decesso___gt);
            result.setAltro_causa_decesso___gte(this.altro_causa_decesso___gte);
            result.setAltro_causa_decesso___contains(this.altro_causa_decesso___contains);
            result.setAltro_causa_decesso___not___contains(this.altro_causa_decesso___not___contains);
            result.setAltro_causa_decesso___starts_with(this.altro_causa_decesso___starts_with);
            result.setAltro_causa_decesso___not___starts_with(this.altro_causa_decesso___not___starts_with);
            result.setAltro_causa_decesso___ends_with(this.altro_causa_decesso___ends_with);
            result.setAltro_causa_decesso___not___ends_with(this.altro_causa_decesso___not___ends_with);
            result.setAltro_motivo_drop___eq(this.altro_motivo_drop___eq);
            result.setAltro_motivo_drop___ne(this.altro_motivo_drop___ne);
            result.setAltro_motivo_drop___null(this.altro_motivo_drop___null);
            result.setAltro_motivo_drop___not___null(this.altro_motivo_drop___not___null);
            result.setAltro_motivo_drop___in(this.altro_motivo_drop___in);
            result.setAltro_motivo_drop___not___in(this.altro_motivo_drop___not___in);
            result.setAltro_motivo_drop___lt(this.altro_motivo_drop___lt);
            result.setAltro_motivo_drop___lte(this.altro_motivo_drop___lte);
            result.setAltro_motivo_drop___gt(this.altro_motivo_drop___gt);
            result.setAltro_motivo_drop___gte(this.altro_motivo_drop___gte);
            result.setAltro_motivo_drop___contains(this.altro_motivo_drop___contains);
            result.setAltro_motivo_drop___not___contains(this.altro_motivo_drop___not___contains);
            result.setAltro_motivo_drop___starts_with(this.altro_motivo_drop___starts_with);
            result.setAltro_motivo_drop___not___starts_with(this.altro_motivo_drop___not___starts_with);
            result.setAltro_motivo_drop___ends_with(this.altro_motivo_drop___ends_with);
            result.setAltro_motivo_drop___not___ends_with(this.altro_motivo_drop___not___ends_with);
            result.setAltro_sede_decesso___eq(this.altro_sede_decesso___eq);
            result.setAltro_sede_decesso___ne(this.altro_sede_decesso___ne);
            result.setAltro_sede_decesso___null(this.altro_sede_decesso___null);
            result.setAltro_sede_decesso___not___null(this.altro_sede_decesso___not___null);
            result.setAltro_sede_decesso___in(this.altro_sede_decesso___in);
            result.setAltro_sede_decesso___not___in(this.altro_sede_decesso___not___in);
            result.setAltro_sede_decesso___lt(this.altro_sede_decesso___lt);
            result.setAltro_sede_decesso___lte(this.altro_sede_decesso___lte);
            result.setAltro_sede_decesso___gt(this.altro_sede_decesso___gt);
            result.setAltro_sede_decesso___gte(this.altro_sede_decesso___gte);
            result.setAltro_sede_decesso___contains(this.altro_sede_decesso___contains);
            result.setAltro_sede_decesso___not___contains(this.altro_sede_decesso___not___contains);
            result.setAltro_sede_decesso___starts_with(this.altro_sede_decesso___starts_with);
            result.setAltro_sede_decesso___not___starts_with(this.altro_sede_decesso___not___starts_with);
            result.setAltro_sede_decesso___ends_with(this.altro_sede_decesso___ends_with);
            result.setAltro_sede_decesso___not___ends_with(this.altro_sede_decesso___not___ends_with);
            result.setAutopsia___eq(this.autopsia___eq);
            result.setAutopsia___ne(this.autopsia___ne);
            result.setAutopsia___null(this.autopsia___null);
            result.setAutopsia___not___null(this.autopsia___not___null);
            result.setCausa_decesso_nome1___eq(this.causa_decesso_nome1___eq);
            result.setCausa_decesso_nome1___ne(this.causa_decesso_nome1___ne);
            result.setCausa_decesso_nome1___null(this.causa_decesso_nome1___null);
            result.setCausa_decesso_nome1___not___null(this.causa_decesso_nome1___not___null);
            result.setCausa_decesso_nome1___in(this.causa_decesso_nome1___in);
            result.setCausa_decesso_nome1___not___in(this.causa_decesso_nome1___not___in);
            result.setCausa_decesso_nome1___lt(this.causa_decesso_nome1___lt);
            result.setCausa_decesso_nome1___lte(this.causa_decesso_nome1___lte);
            result.setCausa_decesso_nome1___gt(this.causa_decesso_nome1___gt);
            result.setCausa_decesso_nome1___gte(this.causa_decesso_nome1___gte);
            result.setCausa_decesso_nome1___contains(this.causa_decesso_nome1___contains);
            result.setCausa_decesso_nome1___not___contains(this.causa_decesso_nome1___not___contains);
            result.setCausa_decesso_nome1___starts_with(this.causa_decesso_nome1___starts_with);
            result.setCausa_decesso_nome1___not___starts_with(this.causa_decesso_nome1___not___starts_with);
            result.setCausa_decesso_nome1___ends_with(this.causa_decesso_nome1___ends_with);
            result.setCausa_decesso_nome1___not___ends_with(this.causa_decesso_nome1___not___ends_with);
            result.setCausa_decesso_nome2___eq(this.causa_decesso_nome2___eq);
            result.setCausa_decesso_nome2___ne(this.causa_decesso_nome2___ne);
            result.setCausa_decesso_nome2___null(this.causa_decesso_nome2___null);
            result.setCausa_decesso_nome2___not___null(this.causa_decesso_nome2___not___null);
            result.setCausa_decesso_nome2___in(this.causa_decesso_nome2___in);
            result.setCausa_decesso_nome2___not___in(this.causa_decesso_nome2___not___in);
            result.setCausa_decesso_nome2___lt(this.causa_decesso_nome2___lt);
            result.setCausa_decesso_nome2___lte(this.causa_decesso_nome2___lte);
            result.setCausa_decesso_nome2___gt(this.causa_decesso_nome2___gt);
            result.setCausa_decesso_nome2___gte(this.causa_decesso_nome2___gte);
            result.setCausa_decesso_nome2___contains(this.causa_decesso_nome2___contains);
            result.setCausa_decesso_nome2___not___contains(this.causa_decesso_nome2___not___contains);
            result.setCausa_decesso_nome2___starts_with(this.causa_decesso_nome2___starts_with);
            result.setCausa_decesso_nome2___not___starts_with(this.causa_decesso_nome2___not___starts_with);
            result.setCausa_decesso_nome2___ends_with(this.causa_decesso_nome2___ends_with);
            result.setCausa_decesso_nome2___not___ends_with(this.causa_decesso_nome2___not___ends_with);
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
            result.setData___eq(this.data___eq);
            result.setData___ne(this.data___ne);
            result.setData___null(this.data___null);
            result.setData___not___null(this.data___not___null);
            result.setData___in(this.data___in);
            result.setData___not___in(this.data___not___in);
            result.setData___lt(this.data___lt);
            result.setData___lte(this.data___lte);
            result.setData___gt(this.data___gt);
            result.setData___gte(this.data___gte);
            result.setData_decesso___eq(this.data_decesso___eq);
            result.setData_decesso___ne(this.data_decesso___ne);
            result.setData_decesso___null(this.data_decesso___null);
            result.setData_decesso___not___null(this.data_decesso___not___null);
            result.setData_decesso___in(this.data_decesso___in);
            result.setData_decesso___not___in(this.data_decesso___not___in);
            result.setData_decesso___lt(this.data_decesso___lt);
            result.setData_decesso___lte(this.data_decesso___lte);
            result.setData_decesso___gt(this.data_decesso___gt);
            result.setData_decesso___gte(this.data_decesso___gte);
            result.setData_status_vita___eq(this.data_status_vita___eq);
            result.setData_status_vita___ne(this.data_status_vita___ne);
            result.setData_status_vita___null(this.data_status_vita___null);
            result.setData_status_vita___not___null(this.data_status_vita___not___null);
            result.setData_status_vita___in(this.data_status_vita___in);
            result.setData_status_vita___not___in(this.data_status_vita___not___in);
            result.setData_status_vita___lt(this.data_status_vita___lt);
            result.setData_status_vita___lte(this.data_status_vita___lte);
            result.setData_status_vita___gt(this.data_status_vita___gt);
            result.setData_status_vita___gte(this.data_status_vita___gte);
            result.setDeceduto___eq(this.deceduto___eq);
            result.setDeceduto___ne(this.deceduto___ne);
            result.setDeceduto___null(this.deceduto___null);
            result.setDeceduto___not___null(this.deceduto___not___null);
            result.setLuogo_decesso___eq(this.luogo_decesso___eq);
            result.setLuogo_decesso___ne(this.luogo_decesso___ne);
            result.setLuogo_decesso___null(this.luogo_decesso___null);
            result.setLuogo_decesso___not___null(this.luogo_decesso___not___null);
            result.setLuogo_decesso___in(this.luogo_decesso___in);
            result.setLuogo_decesso___not___in(this.luogo_decesso___not___in);
            result.setLuogo_decesso___lt(this.luogo_decesso___lt);
            result.setLuogo_decesso___lte(this.luogo_decesso___lte);
            result.setLuogo_decesso___gt(this.luogo_decesso___gt);
            result.setLuogo_decesso___gte(this.luogo_decesso___gte);
            result.setLuogo_decesso___contains(this.luogo_decesso___contains);
            result.setLuogo_decesso___not___contains(this.luogo_decesso___not___contains);
            result.setLuogo_decesso___starts_with(this.luogo_decesso___starts_with);
            result.setLuogo_decesso___not___starts_with(this.luogo_decesso___not___starts_with);
            result.setLuogo_decesso___ends_with(this.luogo_decesso___ends_with);
            result.setLuogo_decesso___not___ends_with(this.luogo_decesso___not___ends_with);
            result.setMotivo_decesso___eq(this.motivo_decesso___eq);
            result.setMotivo_decesso___ne(this.motivo_decesso___ne);
            result.setMotivo_decesso___null(this.motivo_decesso___null);
            result.setMotivo_decesso___not___null(this.motivo_decesso___not___null);
            result.setMotivo_decesso___in(this.motivo_decesso___in);
            result.setMotivo_decesso___not___in(this.motivo_decesso___not___in);
            result.setMotivo_decesso___lt(this.motivo_decesso___lt);
            result.setMotivo_decesso___lte(this.motivo_decesso___lte);
            result.setMotivo_decesso___gt(this.motivo_decesso___gt);
            result.setMotivo_decesso___gte(this.motivo_decesso___gte);
            result.setMotivo_decesso___contains(this.motivo_decesso___contains);
            result.setMotivo_decesso___not___contains(this.motivo_decesso___not___contains);
            result.setMotivo_decesso___starts_with(this.motivo_decesso___starts_with);
            result.setMotivo_decesso___not___starts_with(this.motivo_decesso___not___starts_with);
            result.setMotivo_decesso___ends_with(this.motivo_decesso___ends_with);
            result.setMotivo_decesso___not___ends_with(this.motivo_decesso___not___ends_with);
            result.setMotivo_dropout___eq(this.motivo_dropout___eq);
            result.setMotivo_dropout___ne(this.motivo_dropout___ne);
            result.setMotivo_dropout___null(this.motivo_dropout___null);
            result.setMotivo_dropout___not___null(this.motivo_dropout___not___null);
            result.setMotivo_dropout___in(this.motivo_dropout___in);
            result.setMotivo_dropout___not___in(this.motivo_dropout___not___in);
            result.setMotivo_dropout___lt(this.motivo_dropout___lt);
            result.setMotivo_dropout___lte(this.motivo_dropout___lte);
            result.setMotivo_dropout___gt(this.motivo_dropout___gt);
            result.setMotivo_dropout___gte(this.motivo_dropout___gte);
            result.setMotivo_dropout___contains(this.motivo_dropout___contains);
            result.setMotivo_dropout___not___contains(this.motivo_dropout___not___contains);
            result.setMotivo_dropout___starts_with(this.motivo_dropout___starts_with);
            result.setMotivo_dropout___not___starts_with(this.motivo_dropout___not___starts_with);
            result.setMotivo_dropout___ends_with(this.motivo_dropout___ends_with);
            result.setMotivo_dropout___not___ends_with(this.motivo_dropout___not___ends_with);
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
            result.setStatus_vita___eq(this.status_vita___eq);
            result.setStatus_vita___ne(this.status_vita___ne);
            result.setStatus_vita___null(this.status_vita___null);
            result.setStatus_vita___not___null(this.status_vita___not___null);
            result.setStatus_vita___in(this.status_vita___in);
            result.setStatus_vita___not___in(this.status_vita___not___in);
            result.setStatus_vita___lt(this.status_vita___lt);
            result.setStatus_vita___lte(this.status_vita___lte);
            result.setStatus_vita___gt(this.status_vita___gt);
            result.setStatus_vita___gte(this.status_vita___gte);
            result.setStatus_vita___contains(this.status_vita___contains);
            result.setStatus_vita___not___contains(this.status_vita___not___contains);
            result.setStatus_vita___starts_with(this.status_vita___starts_with);
            result.setStatus_vita___not___starts_with(this.status_vita___not___starts_with);
            result.setStatus_vita___ends_with(this.status_vita___ends_with);
            result.setStatus_vita___not___ends_with(this.status_vita___not___ends_with);
            result.setUltima_visita_ok___eq(this.ultima_visita_ok___eq);
            result.setUltima_visita_ok___ne(this.ultima_visita_ok___ne);
            result.setUltima_visita_ok___null(this.ultima_visita_ok___null);
            result.setUltima_visita_ok___not___null(this.ultima_visita_ok___not___null);
            result.setUltima_visita_ok___in(this.ultima_visita_ok___in);
            result.setUltima_visita_ok___not___in(this.ultima_visita_ok___not___in);
            result.setUltima_visita_ok___lt(this.ultima_visita_ok___lt);
            result.setUltima_visita_ok___lte(this.ultima_visita_ok___lte);
            result.setUltima_visita_ok___gt(this.ultima_visita_ok___gt);
            result.setUltima_visita_ok___gte(this.ultima_visita_ok___gte);
            result.setUndropped___eq(this.undropped___eq);
            result.setUndropped___ne(this.undropped___ne);
            result.setUndropped___null(this.undropped___null);
            result.setUndropped___not___null(this.undropped___not___null);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
