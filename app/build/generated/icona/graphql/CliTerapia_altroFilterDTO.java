package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Terapia_altro.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTerapia_altroFilterDTO implements java.io.Serializable {

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
    private String altra_motivazione_fine___eq;
    private String altra_motivazione_fine___ne;
    private Boolean altra_motivazione_fine___null;
    private Boolean altra_motivazione_fine___not___null;
    private java.util.List<String> altra_motivazione_fine___in;
    private java.util.List<String> altra_motivazione_fine___not___in;
    private String altra_motivazione_fine___lt;
    private String altra_motivazione_fine___lte;
    private String altra_motivazione_fine___gt;
    private String altra_motivazione_fine___gte;
    private String altra_motivazione_fine___contains;
    private String altra_motivazione_fine___not___contains;
    private String altra_motivazione_fine___starts_with;
    private String altra_motivazione_fine___not___starts_with;
    private String altra_motivazione_fine___ends_with;
    private String altra_motivazione_fine___not___ends_with;
    private String altro_farmaco___eq;
    private String altro_farmaco___ne;
    private Boolean altro_farmaco___null;
    private Boolean altro_farmaco___not___null;
    private java.util.List<String> altro_farmaco___in;
    private java.util.List<String> altro_farmaco___not___in;
    private String altro_farmaco___lt;
    private String altro_farmaco___lte;
    private String altro_farmaco___gt;
    private String altro_farmaco___gte;
    private String altro_farmaco___contains;
    private String altro_farmaco___not___contains;
    private String altro_farmaco___starts_with;
    private String altro_farmaco___not___starts_with;
    private String altro_farmaco___ends_with;
    private String altro_farmaco___not___ends_with;
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
    private Integer count_dosaggi___eq;
    private Integer count_dosaggi___ne;
    private Boolean count_dosaggi___null;
    private Boolean count_dosaggi___not___null;
    private java.util.List<Integer> count_dosaggi___in;
    private java.util.List<Integer> count_dosaggi___not___in;
    private Integer count_dosaggi___lt;
    private Integer count_dosaggi___lte;
    private Integer count_dosaggi___gt;
    private Integer count_dosaggi___gte;
    private String data_fine___eq;
    private String data_fine___ne;
    private Boolean data_fine___null;
    private Boolean data_fine___not___null;
    private java.util.List<String> data_fine___in;
    private java.util.List<String> data_fine___not___in;
    private String data_fine___lt;
    private String data_fine___lte;
    private String data_fine___gt;
    private String data_fine___gte;
    private String data_inizio___eq;
    private String data_inizio___ne;
    private Boolean data_inizio___null;
    private Boolean data_inizio___not___null;
    private java.util.List<String> data_inizio___in;
    private java.util.List<String> data_inizio___not___in;
    private String data_inizio___lt;
    private String data_inizio___lte;
    private String data_inizio___gt;
    private String data_inizio___gte;
    private String dosaggio___eq;
    private String dosaggio___ne;
    private Boolean dosaggio___null;
    private Boolean dosaggio___not___null;
    private java.util.List<String> dosaggio___in;
    private java.util.List<String> dosaggio___not___in;
    private String dosaggio___lt;
    private String dosaggio___lte;
    private String dosaggio___gt;
    private String dosaggio___gte;
    private String dosaggio___contains;
    private String dosaggio___not___contains;
    private String dosaggio___starts_with;
    private String dosaggio___not___starts_with;
    private String dosaggio___ends_with;
    private String dosaggio___not___ends_with;
    private Boolean epatica___eq;
    private Boolean epatica___ne;
    private Boolean epatica___null;
    private Boolean epatica___not___null;
    private String farmaco_ATC___eq;
    private String farmaco_ATC___ne;
    private Boolean farmaco_ATC___null;
    private Boolean farmaco_ATC___not___null;
    private java.util.List<String> farmaco_ATC___in;
    private java.util.List<String> farmaco_ATC___not___in;
    private String farmaco_ATC___lt;
    private String farmaco_ATC___lte;
    private String farmaco_ATC___gt;
    private String farmaco_ATC___gte;
    private String farmaco_ATC___contains;
    private String farmaco_ATC___not___contains;
    private String farmaco_ATC___starts_with;
    private String farmaco_ATC___not___starts_with;
    private String farmaco_ATC___ends_with;
    private String farmaco_ATC___not___ends_with;
    private String motivazione_fine___eq;
    private String motivazione_fine___ne;
    private Boolean motivazione_fine___null;
    private Boolean motivazione_fine___not___null;
    private java.util.List<String> motivazione_fine___in;
    private java.util.List<String> motivazione_fine___not___in;
    private String motivazione_fine___lt;
    private String motivazione_fine___lte;
    private String motivazione_fine___gt;
    private String motivazione_fine___gte;
    private String motivazione_fine___contains;
    private String motivazione_fine___not___contains;
    private String motivazione_fine___starts_with;
    private String motivazione_fine___not___starts_with;
    private String motivazione_fine___ends_with;
    private String motivazione_fine___not___ends_with;
    private String nome_farmaco___eq;
    private String nome_farmaco___ne;
    private Boolean nome_farmaco___null;
    private Boolean nome_farmaco___not___null;
    private java.util.List<String> nome_farmaco___in;
    private java.util.List<String> nome_farmaco___not___in;
    private String nome_farmaco___lt;
    private String nome_farmaco___lte;
    private String nome_farmaco___gt;
    private String nome_farmaco___gte;
    private String nome_farmaco___contains;
    private String nome_farmaco___not___contains;
    private String nome_farmaco___starts_with;
    private String nome_farmaco___not___starts_with;
    private String nome_farmaco___ends_with;
    private String nome_farmaco___not___ends_with;
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
    private String ricerca_farmaco___eq;
    private String ricerca_farmaco___ne;
    private Boolean ricerca_farmaco___null;
    private Boolean ricerca_farmaco___not___null;
    private java.util.List<String> ricerca_farmaco___in;
    private java.util.List<String> ricerca_farmaco___not___in;
    private String ricerca_farmaco___lt;
    private String ricerca_farmaco___lte;
    private String ricerca_farmaco___gt;
    private String ricerca_farmaco___gte;
    private String ricerca_farmaco___contains;
    private String ricerca_farmaco___not___contains;
    private String ricerca_farmaco___starts_with;
    private String ricerca_farmaco___not___starts_with;
    private String ricerca_farmaco___ends_with;
    private String ricerca_farmaco___not___ends_with;
    private java.util.List<CliTerapia_altroFilterDTO> AND;
    private java.util.List<CliTerapia_altroFilterDTO> OR;
    private CliTerapia_altroFilterDTO NOT;

    public CliTerapia_altroFilterDTO() {
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

    public String getAltra_motivazione_fine___eq() {
        return altra_motivazione_fine___eq;
    }
    public void setAltra_motivazione_fine___eq(String altra_motivazione_fine___eq) {
        this.altra_motivazione_fine___eq = altra_motivazione_fine___eq;
    }

    public String getAltra_motivazione_fine___ne() {
        return altra_motivazione_fine___ne;
    }
    public void setAltra_motivazione_fine___ne(String altra_motivazione_fine___ne) {
        this.altra_motivazione_fine___ne = altra_motivazione_fine___ne;
    }

    public Boolean getAltra_motivazione_fine___null() {
        return altra_motivazione_fine___null;
    }
    public void setAltra_motivazione_fine___null(Boolean altra_motivazione_fine___null) {
        this.altra_motivazione_fine___null = altra_motivazione_fine___null;
    }

    public Boolean getAltra_motivazione_fine___not___null() {
        return altra_motivazione_fine___not___null;
    }
    public void setAltra_motivazione_fine___not___null(Boolean altra_motivazione_fine___not___null) {
        this.altra_motivazione_fine___not___null = altra_motivazione_fine___not___null;
    }

    public java.util.List<String> getAltra_motivazione_fine___in() {
        return altra_motivazione_fine___in;
    }
    public void setAltra_motivazione_fine___in(java.util.List<String> altra_motivazione_fine___in) {
        this.altra_motivazione_fine___in = altra_motivazione_fine___in;
    }

    public java.util.List<String> getAltra_motivazione_fine___not___in() {
        return altra_motivazione_fine___not___in;
    }
    public void setAltra_motivazione_fine___not___in(java.util.List<String> altra_motivazione_fine___not___in) {
        this.altra_motivazione_fine___not___in = altra_motivazione_fine___not___in;
    }

    public String getAltra_motivazione_fine___lt() {
        return altra_motivazione_fine___lt;
    }
    public void setAltra_motivazione_fine___lt(String altra_motivazione_fine___lt) {
        this.altra_motivazione_fine___lt = altra_motivazione_fine___lt;
    }

    public String getAltra_motivazione_fine___lte() {
        return altra_motivazione_fine___lte;
    }
    public void setAltra_motivazione_fine___lte(String altra_motivazione_fine___lte) {
        this.altra_motivazione_fine___lte = altra_motivazione_fine___lte;
    }

    public String getAltra_motivazione_fine___gt() {
        return altra_motivazione_fine___gt;
    }
    public void setAltra_motivazione_fine___gt(String altra_motivazione_fine___gt) {
        this.altra_motivazione_fine___gt = altra_motivazione_fine___gt;
    }

    public String getAltra_motivazione_fine___gte() {
        return altra_motivazione_fine___gte;
    }
    public void setAltra_motivazione_fine___gte(String altra_motivazione_fine___gte) {
        this.altra_motivazione_fine___gte = altra_motivazione_fine___gte;
    }

    public String getAltra_motivazione_fine___contains() {
        return altra_motivazione_fine___contains;
    }
    public void setAltra_motivazione_fine___contains(String altra_motivazione_fine___contains) {
        this.altra_motivazione_fine___contains = altra_motivazione_fine___contains;
    }

    public String getAltra_motivazione_fine___not___contains() {
        return altra_motivazione_fine___not___contains;
    }
    public void setAltra_motivazione_fine___not___contains(String altra_motivazione_fine___not___contains) {
        this.altra_motivazione_fine___not___contains = altra_motivazione_fine___not___contains;
    }

    public String getAltra_motivazione_fine___starts_with() {
        return altra_motivazione_fine___starts_with;
    }
    public void setAltra_motivazione_fine___starts_with(String altra_motivazione_fine___starts_with) {
        this.altra_motivazione_fine___starts_with = altra_motivazione_fine___starts_with;
    }

    public String getAltra_motivazione_fine___not___starts_with() {
        return altra_motivazione_fine___not___starts_with;
    }
    public void setAltra_motivazione_fine___not___starts_with(String altra_motivazione_fine___not___starts_with) {
        this.altra_motivazione_fine___not___starts_with = altra_motivazione_fine___not___starts_with;
    }

    public String getAltra_motivazione_fine___ends_with() {
        return altra_motivazione_fine___ends_with;
    }
    public void setAltra_motivazione_fine___ends_with(String altra_motivazione_fine___ends_with) {
        this.altra_motivazione_fine___ends_with = altra_motivazione_fine___ends_with;
    }

    public String getAltra_motivazione_fine___not___ends_with() {
        return altra_motivazione_fine___not___ends_with;
    }
    public void setAltra_motivazione_fine___not___ends_with(String altra_motivazione_fine___not___ends_with) {
        this.altra_motivazione_fine___not___ends_with = altra_motivazione_fine___not___ends_with;
    }

    public String getAltro_farmaco___eq() {
        return altro_farmaco___eq;
    }
    public void setAltro_farmaco___eq(String altro_farmaco___eq) {
        this.altro_farmaco___eq = altro_farmaco___eq;
    }

    public String getAltro_farmaco___ne() {
        return altro_farmaco___ne;
    }
    public void setAltro_farmaco___ne(String altro_farmaco___ne) {
        this.altro_farmaco___ne = altro_farmaco___ne;
    }

    public Boolean getAltro_farmaco___null() {
        return altro_farmaco___null;
    }
    public void setAltro_farmaco___null(Boolean altro_farmaco___null) {
        this.altro_farmaco___null = altro_farmaco___null;
    }

    public Boolean getAltro_farmaco___not___null() {
        return altro_farmaco___not___null;
    }
    public void setAltro_farmaco___not___null(Boolean altro_farmaco___not___null) {
        this.altro_farmaco___not___null = altro_farmaco___not___null;
    }

    public java.util.List<String> getAltro_farmaco___in() {
        return altro_farmaco___in;
    }
    public void setAltro_farmaco___in(java.util.List<String> altro_farmaco___in) {
        this.altro_farmaco___in = altro_farmaco___in;
    }

    public java.util.List<String> getAltro_farmaco___not___in() {
        return altro_farmaco___not___in;
    }
    public void setAltro_farmaco___not___in(java.util.List<String> altro_farmaco___not___in) {
        this.altro_farmaco___not___in = altro_farmaco___not___in;
    }

    public String getAltro_farmaco___lt() {
        return altro_farmaco___lt;
    }
    public void setAltro_farmaco___lt(String altro_farmaco___lt) {
        this.altro_farmaco___lt = altro_farmaco___lt;
    }

    public String getAltro_farmaco___lte() {
        return altro_farmaco___lte;
    }
    public void setAltro_farmaco___lte(String altro_farmaco___lte) {
        this.altro_farmaco___lte = altro_farmaco___lte;
    }

    public String getAltro_farmaco___gt() {
        return altro_farmaco___gt;
    }
    public void setAltro_farmaco___gt(String altro_farmaco___gt) {
        this.altro_farmaco___gt = altro_farmaco___gt;
    }

    public String getAltro_farmaco___gte() {
        return altro_farmaco___gte;
    }
    public void setAltro_farmaco___gte(String altro_farmaco___gte) {
        this.altro_farmaco___gte = altro_farmaco___gte;
    }

    public String getAltro_farmaco___contains() {
        return altro_farmaco___contains;
    }
    public void setAltro_farmaco___contains(String altro_farmaco___contains) {
        this.altro_farmaco___contains = altro_farmaco___contains;
    }

    public String getAltro_farmaco___not___contains() {
        return altro_farmaco___not___contains;
    }
    public void setAltro_farmaco___not___contains(String altro_farmaco___not___contains) {
        this.altro_farmaco___not___contains = altro_farmaco___not___contains;
    }

    public String getAltro_farmaco___starts_with() {
        return altro_farmaco___starts_with;
    }
    public void setAltro_farmaco___starts_with(String altro_farmaco___starts_with) {
        this.altro_farmaco___starts_with = altro_farmaco___starts_with;
    }

    public String getAltro_farmaco___not___starts_with() {
        return altro_farmaco___not___starts_with;
    }
    public void setAltro_farmaco___not___starts_with(String altro_farmaco___not___starts_with) {
        this.altro_farmaco___not___starts_with = altro_farmaco___not___starts_with;
    }

    public String getAltro_farmaco___ends_with() {
        return altro_farmaco___ends_with;
    }
    public void setAltro_farmaco___ends_with(String altro_farmaco___ends_with) {
        this.altro_farmaco___ends_with = altro_farmaco___ends_with;
    }

    public String getAltro_farmaco___not___ends_with() {
        return altro_farmaco___not___ends_with;
    }
    public void setAltro_farmaco___not___ends_with(String altro_farmaco___not___ends_with) {
        this.altro_farmaco___not___ends_with = altro_farmaco___not___ends_with;
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

    public Integer getCount_dosaggi___eq() {
        return count_dosaggi___eq;
    }
    public void setCount_dosaggi___eq(Integer count_dosaggi___eq) {
        this.count_dosaggi___eq = count_dosaggi___eq;
    }

    public Integer getCount_dosaggi___ne() {
        return count_dosaggi___ne;
    }
    public void setCount_dosaggi___ne(Integer count_dosaggi___ne) {
        this.count_dosaggi___ne = count_dosaggi___ne;
    }

    public Boolean getCount_dosaggi___null() {
        return count_dosaggi___null;
    }
    public void setCount_dosaggi___null(Boolean count_dosaggi___null) {
        this.count_dosaggi___null = count_dosaggi___null;
    }

    public Boolean getCount_dosaggi___not___null() {
        return count_dosaggi___not___null;
    }
    public void setCount_dosaggi___not___null(Boolean count_dosaggi___not___null) {
        this.count_dosaggi___not___null = count_dosaggi___not___null;
    }

    public java.util.List<Integer> getCount_dosaggi___in() {
        return count_dosaggi___in;
    }
    public void setCount_dosaggi___in(java.util.List<Integer> count_dosaggi___in) {
        this.count_dosaggi___in = count_dosaggi___in;
    }

    public java.util.List<Integer> getCount_dosaggi___not___in() {
        return count_dosaggi___not___in;
    }
    public void setCount_dosaggi___not___in(java.util.List<Integer> count_dosaggi___not___in) {
        this.count_dosaggi___not___in = count_dosaggi___not___in;
    }

    public Integer getCount_dosaggi___lt() {
        return count_dosaggi___lt;
    }
    public void setCount_dosaggi___lt(Integer count_dosaggi___lt) {
        this.count_dosaggi___lt = count_dosaggi___lt;
    }

    public Integer getCount_dosaggi___lte() {
        return count_dosaggi___lte;
    }
    public void setCount_dosaggi___lte(Integer count_dosaggi___lte) {
        this.count_dosaggi___lte = count_dosaggi___lte;
    }

    public Integer getCount_dosaggi___gt() {
        return count_dosaggi___gt;
    }
    public void setCount_dosaggi___gt(Integer count_dosaggi___gt) {
        this.count_dosaggi___gt = count_dosaggi___gt;
    }

    public Integer getCount_dosaggi___gte() {
        return count_dosaggi___gte;
    }
    public void setCount_dosaggi___gte(Integer count_dosaggi___gte) {
        this.count_dosaggi___gte = count_dosaggi___gte;
    }

    public String getData_fine___eq() {
        return data_fine___eq;
    }
    public void setData_fine___eq(String data_fine___eq) {
        this.data_fine___eq = data_fine___eq;
    }

    public String getData_fine___ne() {
        return data_fine___ne;
    }
    public void setData_fine___ne(String data_fine___ne) {
        this.data_fine___ne = data_fine___ne;
    }

    public Boolean getData_fine___null() {
        return data_fine___null;
    }
    public void setData_fine___null(Boolean data_fine___null) {
        this.data_fine___null = data_fine___null;
    }

    public Boolean getData_fine___not___null() {
        return data_fine___not___null;
    }
    public void setData_fine___not___null(Boolean data_fine___not___null) {
        this.data_fine___not___null = data_fine___not___null;
    }

    public java.util.List<String> getData_fine___in() {
        return data_fine___in;
    }
    public void setData_fine___in(java.util.List<String> data_fine___in) {
        this.data_fine___in = data_fine___in;
    }

    public java.util.List<String> getData_fine___not___in() {
        return data_fine___not___in;
    }
    public void setData_fine___not___in(java.util.List<String> data_fine___not___in) {
        this.data_fine___not___in = data_fine___not___in;
    }

    public String getData_fine___lt() {
        return data_fine___lt;
    }
    public void setData_fine___lt(String data_fine___lt) {
        this.data_fine___lt = data_fine___lt;
    }

    public String getData_fine___lte() {
        return data_fine___lte;
    }
    public void setData_fine___lte(String data_fine___lte) {
        this.data_fine___lte = data_fine___lte;
    }

    public String getData_fine___gt() {
        return data_fine___gt;
    }
    public void setData_fine___gt(String data_fine___gt) {
        this.data_fine___gt = data_fine___gt;
    }

    public String getData_fine___gte() {
        return data_fine___gte;
    }
    public void setData_fine___gte(String data_fine___gte) {
        this.data_fine___gte = data_fine___gte;
    }

    public String getData_inizio___eq() {
        return data_inizio___eq;
    }
    public void setData_inizio___eq(String data_inizio___eq) {
        this.data_inizio___eq = data_inizio___eq;
    }

    public String getData_inizio___ne() {
        return data_inizio___ne;
    }
    public void setData_inizio___ne(String data_inizio___ne) {
        this.data_inizio___ne = data_inizio___ne;
    }

    public Boolean getData_inizio___null() {
        return data_inizio___null;
    }
    public void setData_inizio___null(Boolean data_inizio___null) {
        this.data_inizio___null = data_inizio___null;
    }

    public Boolean getData_inizio___not___null() {
        return data_inizio___not___null;
    }
    public void setData_inizio___not___null(Boolean data_inizio___not___null) {
        this.data_inizio___not___null = data_inizio___not___null;
    }

    public java.util.List<String> getData_inizio___in() {
        return data_inizio___in;
    }
    public void setData_inizio___in(java.util.List<String> data_inizio___in) {
        this.data_inizio___in = data_inizio___in;
    }

    public java.util.List<String> getData_inizio___not___in() {
        return data_inizio___not___in;
    }
    public void setData_inizio___not___in(java.util.List<String> data_inizio___not___in) {
        this.data_inizio___not___in = data_inizio___not___in;
    }

    public String getData_inizio___lt() {
        return data_inizio___lt;
    }
    public void setData_inizio___lt(String data_inizio___lt) {
        this.data_inizio___lt = data_inizio___lt;
    }

    public String getData_inizio___lte() {
        return data_inizio___lte;
    }
    public void setData_inizio___lte(String data_inizio___lte) {
        this.data_inizio___lte = data_inizio___lte;
    }

    public String getData_inizio___gt() {
        return data_inizio___gt;
    }
    public void setData_inizio___gt(String data_inizio___gt) {
        this.data_inizio___gt = data_inizio___gt;
    }

    public String getData_inizio___gte() {
        return data_inizio___gte;
    }
    public void setData_inizio___gte(String data_inizio___gte) {
        this.data_inizio___gte = data_inizio___gte;
    }

    public String getDosaggio___eq() {
        return dosaggio___eq;
    }
    public void setDosaggio___eq(String dosaggio___eq) {
        this.dosaggio___eq = dosaggio___eq;
    }

    public String getDosaggio___ne() {
        return dosaggio___ne;
    }
    public void setDosaggio___ne(String dosaggio___ne) {
        this.dosaggio___ne = dosaggio___ne;
    }

    public Boolean getDosaggio___null() {
        return dosaggio___null;
    }
    public void setDosaggio___null(Boolean dosaggio___null) {
        this.dosaggio___null = dosaggio___null;
    }

    public Boolean getDosaggio___not___null() {
        return dosaggio___not___null;
    }
    public void setDosaggio___not___null(Boolean dosaggio___not___null) {
        this.dosaggio___not___null = dosaggio___not___null;
    }

    public java.util.List<String> getDosaggio___in() {
        return dosaggio___in;
    }
    public void setDosaggio___in(java.util.List<String> dosaggio___in) {
        this.dosaggio___in = dosaggio___in;
    }

    public java.util.List<String> getDosaggio___not___in() {
        return dosaggio___not___in;
    }
    public void setDosaggio___not___in(java.util.List<String> dosaggio___not___in) {
        this.dosaggio___not___in = dosaggio___not___in;
    }

    public String getDosaggio___lt() {
        return dosaggio___lt;
    }
    public void setDosaggio___lt(String dosaggio___lt) {
        this.dosaggio___lt = dosaggio___lt;
    }

    public String getDosaggio___lte() {
        return dosaggio___lte;
    }
    public void setDosaggio___lte(String dosaggio___lte) {
        this.dosaggio___lte = dosaggio___lte;
    }

    public String getDosaggio___gt() {
        return dosaggio___gt;
    }
    public void setDosaggio___gt(String dosaggio___gt) {
        this.dosaggio___gt = dosaggio___gt;
    }

    public String getDosaggio___gte() {
        return dosaggio___gte;
    }
    public void setDosaggio___gte(String dosaggio___gte) {
        this.dosaggio___gte = dosaggio___gte;
    }

    public String getDosaggio___contains() {
        return dosaggio___contains;
    }
    public void setDosaggio___contains(String dosaggio___contains) {
        this.dosaggio___contains = dosaggio___contains;
    }

    public String getDosaggio___not___contains() {
        return dosaggio___not___contains;
    }
    public void setDosaggio___not___contains(String dosaggio___not___contains) {
        this.dosaggio___not___contains = dosaggio___not___contains;
    }

    public String getDosaggio___starts_with() {
        return dosaggio___starts_with;
    }
    public void setDosaggio___starts_with(String dosaggio___starts_with) {
        this.dosaggio___starts_with = dosaggio___starts_with;
    }

    public String getDosaggio___not___starts_with() {
        return dosaggio___not___starts_with;
    }
    public void setDosaggio___not___starts_with(String dosaggio___not___starts_with) {
        this.dosaggio___not___starts_with = dosaggio___not___starts_with;
    }

    public String getDosaggio___ends_with() {
        return dosaggio___ends_with;
    }
    public void setDosaggio___ends_with(String dosaggio___ends_with) {
        this.dosaggio___ends_with = dosaggio___ends_with;
    }

    public String getDosaggio___not___ends_with() {
        return dosaggio___not___ends_with;
    }
    public void setDosaggio___not___ends_with(String dosaggio___not___ends_with) {
        this.dosaggio___not___ends_with = dosaggio___not___ends_with;
    }

    public Boolean getEpatica___eq() {
        return epatica___eq;
    }
    public void setEpatica___eq(Boolean epatica___eq) {
        this.epatica___eq = epatica___eq;
    }

    public Boolean getEpatica___ne() {
        return epatica___ne;
    }
    public void setEpatica___ne(Boolean epatica___ne) {
        this.epatica___ne = epatica___ne;
    }

    public Boolean getEpatica___null() {
        return epatica___null;
    }
    public void setEpatica___null(Boolean epatica___null) {
        this.epatica___null = epatica___null;
    }

    public Boolean getEpatica___not___null() {
        return epatica___not___null;
    }
    public void setEpatica___not___null(Boolean epatica___not___null) {
        this.epatica___not___null = epatica___not___null;
    }

    public String getFarmaco_ATC___eq() {
        return farmaco_ATC___eq;
    }
    public void setFarmaco_ATC___eq(String farmaco_ATC___eq) {
        this.farmaco_ATC___eq = farmaco_ATC___eq;
    }

    public String getFarmaco_ATC___ne() {
        return farmaco_ATC___ne;
    }
    public void setFarmaco_ATC___ne(String farmaco_ATC___ne) {
        this.farmaco_ATC___ne = farmaco_ATC___ne;
    }

    public Boolean getFarmaco_ATC___null() {
        return farmaco_ATC___null;
    }
    public void setFarmaco_ATC___null(Boolean farmaco_ATC___null) {
        this.farmaco_ATC___null = farmaco_ATC___null;
    }

    public Boolean getFarmaco_ATC___not___null() {
        return farmaco_ATC___not___null;
    }
    public void setFarmaco_ATC___not___null(Boolean farmaco_ATC___not___null) {
        this.farmaco_ATC___not___null = farmaco_ATC___not___null;
    }

    public java.util.List<String> getFarmaco_ATC___in() {
        return farmaco_ATC___in;
    }
    public void setFarmaco_ATC___in(java.util.List<String> farmaco_ATC___in) {
        this.farmaco_ATC___in = farmaco_ATC___in;
    }

    public java.util.List<String> getFarmaco_ATC___not___in() {
        return farmaco_ATC___not___in;
    }
    public void setFarmaco_ATC___not___in(java.util.List<String> farmaco_ATC___not___in) {
        this.farmaco_ATC___not___in = farmaco_ATC___not___in;
    }

    public String getFarmaco_ATC___lt() {
        return farmaco_ATC___lt;
    }
    public void setFarmaco_ATC___lt(String farmaco_ATC___lt) {
        this.farmaco_ATC___lt = farmaco_ATC___lt;
    }

    public String getFarmaco_ATC___lte() {
        return farmaco_ATC___lte;
    }
    public void setFarmaco_ATC___lte(String farmaco_ATC___lte) {
        this.farmaco_ATC___lte = farmaco_ATC___lte;
    }

    public String getFarmaco_ATC___gt() {
        return farmaco_ATC___gt;
    }
    public void setFarmaco_ATC___gt(String farmaco_ATC___gt) {
        this.farmaco_ATC___gt = farmaco_ATC___gt;
    }

    public String getFarmaco_ATC___gte() {
        return farmaco_ATC___gte;
    }
    public void setFarmaco_ATC___gte(String farmaco_ATC___gte) {
        this.farmaco_ATC___gte = farmaco_ATC___gte;
    }

    public String getFarmaco_ATC___contains() {
        return farmaco_ATC___contains;
    }
    public void setFarmaco_ATC___contains(String farmaco_ATC___contains) {
        this.farmaco_ATC___contains = farmaco_ATC___contains;
    }

    public String getFarmaco_ATC___not___contains() {
        return farmaco_ATC___not___contains;
    }
    public void setFarmaco_ATC___not___contains(String farmaco_ATC___not___contains) {
        this.farmaco_ATC___not___contains = farmaco_ATC___not___contains;
    }

    public String getFarmaco_ATC___starts_with() {
        return farmaco_ATC___starts_with;
    }
    public void setFarmaco_ATC___starts_with(String farmaco_ATC___starts_with) {
        this.farmaco_ATC___starts_with = farmaco_ATC___starts_with;
    }

    public String getFarmaco_ATC___not___starts_with() {
        return farmaco_ATC___not___starts_with;
    }
    public void setFarmaco_ATC___not___starts_with(String farmaco_ATC___not___starts_with) {
        this.farmaco_ATC___not___starts_with = farmaco_ATC___not___starts_with;
    }

    public String getFarmaco_ATC___ends_with() {
        return farmaco_ATC___ends_with;
    }
    public void setFarmaco_ATC___ends_with(String farmaco_ATC___ends_with) {
        this.farmaco_ATC___ends_with = farmaco_ATC___ends_with;
    }

    public String getFarmaco_ATC___not___ends_with() {
        return farmaco_ATC___not___ends_with;
    }
    public void setFarmaco_ATC___not___ends_with(String farmaco_ATC___not___ends_with) {
        this.farmaco_ATC___not___ends_with = farmaco_ATC___not___ends_with;
    }

    public String getMotivazione_fine___eq() {
        return motivazione_fine___eq;
    }
    public void setMotivazione_fine___eq(String motivazione_fine___eq) {
        this.motivazione_fine___eq = motivazione_fine___eq;
    }

    public String getMotivazione_fine___ne() {
        return motivazione_fine___ne;
    }
    public void setMotivazione_fine___ne(String motivazione_fine___ne) {
        this.motivazione_fine___ne = motivazione_fine___ne;
    }

    public Boolean getMotivazione_fine___null() {
        return motivazione_fine___null;
    }
    public void setMotivazione_fine___null(Boolean motivazione_fine___null) {
        this.motivazione_fine___null = motivazione_fine___null;
    }

    public Boolean getMotivazione_fine___not___null() {
        return motivazione_fine___not___null;
    }
    public void setMotivazione_fine___not___null(Boolean motivazione_fine___not___null) {
        this.motivazione_fine___not___null = motivazione_fine___not___null;
    }

    public java.util.List<String> getMotivazione_fine___in() {
        return motivazione_fine___in;
    }
    public void setMotivazione_fine___in(java.util.List<String> motivazione_fine___in) {
        this.motivazione_fine___in = motivazione_fine___in;
    }

    public java.util.List<String> getMotivazione_fine___not___in() {
        return motivazione_fine___not___in;
    }
    public void setMotivazione_fine___not___in(java.util.List<String> motivazione_fine___not___in) {
        this.motivazione_fine___not___in = motivazione_fine___not___in;
    }

    public String getMotivazione_fine___lt() {
        return motivazione_fine___lt;
    }
    public void setMotivazione_fine___lt(String motivazione_fine___lt) {
        this.motivazione_fine___lt = motivazione_fine___lt;
    }

    public String getMotivazione_fine___lte() {
        return motivazione_fine___lte;
    }
    public void setMotivazione_fine___lte(String motivazione_fine___lte) {
        this.motivazione_fine___lte = motivazione_fine___lte;
    }

    public String getMotivazione_fine___gt() {
        return motivazione_fine___gt;
    }
    public void setMotivazione_fine___gt(String motivazione_fine___gt) {
        this.motivazione_fine___gt = motivazione_fine___gt;
    }

    public String getMotivazione_fine___gte() {
        return motivazione_fine___gte;
    }
    public void setMotivazione_fine___gte(String motivazione_fine___gte) {
        this.motivazione_fine___gte = motivazione_fine___gte;
    }

    public String getMotivazione_fine___contains() {
        return motivazione_fine___contains;
    }
    public void setMotivazione_fine___contains(String motivazione_fine___contains) {
        this.motivazione_fine___contains = motivazione_fine___contains;
    }

    public String getMotivazione_fine___not___contains() {
        return motivazione_fine___not___contains;
    }
    public void setMotivazione_fine___not___contains(String motivazione_fine___not___contains) {
        this.motivazione_fine___not___contains = motivazione_fine___not___contains;
    }

    public String getMotivazione_fine___starts_with() {
        return motivazione_fine___starts_with;
    }
    public void setMotivazione_fine___starts_with(String motivazione_fine___starts_with) {
        this.motivazione_fine___starts_with = motivazione_fine___starts_with;
    }

    public String getMotivazione_fine___not___starts_with() {
        return motivazione_fine___not___starts_with;
    }
    public void setMotivazione_fine___not___starts_with(String motivazione_fine___not___starts_with) {
        this.motivazione_fine___not___starts_with = motivazione_fine___not___starts_with;
    }

    public String getMotivazione_fine___ends_with() {
        return motivazione_fine___ends_with;
    }
    public void setMotivazione_fine___ends_with(String motivazione_fine___ends_with) {
        this.motivazione_fine___ends_with = motivazione_fine___ends_with;
    }

    public String getMotivazione_fine___not___ends_with() {
        return motivazione_fine___not___ends_with;
    }
    public void setMotivazione_fine___not___ends_with(String motivazione_fine___not___ends_with) {
        this.motivazione_fine___not___ends_with = motivazione_fine___not___ends_with;
    }

    public String getNome_farmaco___eq() {
        return nome_farmaco___eq;
    }
    public void setNome_farmaco___eq(String nome_farmaco___eq) {
        this.nome_farmaco___eq = nome_farmaco___eq;
    }

    public String getNome_farmaco___ne() {
        return nome_farmaco___ne;
    }
    public void setNome_farmaco___ne(String nome_farmaco___ne) {
        this.nome_farmaco___ne = nome_farmaco___ne;
    }

    public Boolean getNome_farmaco___null() {
        return nome_farmaco___null;
    }
    public void setNome_farmaco___null(Boolean nome_farmaco___null) {
        this.nome_farmaco___null = nome_farmaco___null;
    }

    public Boolean getNome_farmaco___not___null() {
        return nome_farmaco___not___null;
    }
    public void setNome_farmaco___not___null(Boolean nome_farmaco___not___null) {
        this.nome_farmaco___not___null = nome_farmaco___not___null;
    }

    public java.util.List<String> getNome_farmaco___in() {
        return nome_farmaco___in;
    }
    public void setNome_farmaco___in(java.util.List<String> nome_farmaco___in) {
        this.nome_farmaco___in = nome_farmaco___in;
    }

    public java.util.List<String> getNome_farmaco___not___in() {
        return nome_farmaco___not___in;
    }
    public void setNome_farmaco___not___in(java.util.List<String> nome_farmaco___not___in) {
        this.nome_farmaco___not___in = nome_farmaco___not___in;
    }

    public String getNome_farmaco___lt() {
        return nome_farmaco___lt;
    }
    public void setNome_farmaco___lt(String nome_farmaco___lt) {
        this.nome_farmaco___lt = nome_farmaco___lt;
    }

    public String getNome_farmaco___lte() {
        return nome_farmaco___lte;
    }
    public void setNome_farmaco___lte(String nome_farmaco___lte) {
        this.nome_farmaco___lte = nome_farmaco___lte;
    }

    public String getNome_farmaco___gt() {
        return nome_farmaco___gt;
    }
    public void setNome_farmaco___gt(String nome_farmaco___gt) {
        this.nome_farmaco___gt = nome_farmaco___gt;
    }

    public String getNome_farmaco___gte() {
        return nome_farmaco___gte;
    }
    public void setNome_farmaco___gte(String nome_farmaco___gte) {
        this.nome_farmaco___gte = nome_farmaco___gte;
    }

    public String getNome_farmaco___contains() {
        return nome_farmaco___contains;
    }
    public void setNome_farmaco___contains(String nome_farmaco___contains) {
        this.nome_farmaco___contains = nome_farmaco___contains;
    }

    public String getNome_farmaco___not___contains() {
        return nome_farmaco___not___contains;
    }
    public void setNome_farmaco___not___contains(String nome_farmaco___not___contains) {
        this.nome_farmaco___not___contains = nome_farmaco___not___contains;
    }

    public String getNome_farmaco___starts_with() {
        return nome_farmaco___starts_with;
    }
    public void setNome_farmaco___starts_with(String nome_farmaco___starts_with) {
        this.nome_farmaco___starts_with = nome_farmaco___starts_with;
    }

    public String getNome_farmaco___not___starts_with() {
        return nome_farmaco___not___starts_with;
    }
    public void setNome_farmaco___not___starts_with(String nome_farmaco___not___starts_with) {
        this.nome_farmaco___not___starts_with = nome_farmaco___not___starts_with;
    }

    public String getNome_farmaco___ends_with() {
        return nome_farmaco___ends_with;
    }
    public void setNome_farmaco___ends_with(String nome_farmaco___ends_with) {
        this.nome_farmaco___ends_with = nome_farmaco___ends_with;
    }

    public String getNome_farmaco___not___ends_with() {
        return nome_farmaco___not___ends_with;
    }
    public void setNome_farmaco___not___ends_with(String nome_farmaco___not___ends_with) {
        this.nome_farmaco___not___ends_with = nome_farmaco___not___ends_with;
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

    public String getRicerca_farmaco___eq() {
        return ricerca_farmaco___eq;
    }
    public void setRicerca_farmaco___eq(String ricerca_farmaco___eq) {
        this.ricerca_farmaco___eq = ricerca_farmaco___eq;
    }

    public String getRicerca_farmaco___ne() {
        return ricerca_farmaco___ne;
    }
    public void setRicerca_farmaco___ne(String ricerca_farmaco___ne) {
        this.ricerca_farmaco___ne = ricerca_farmaco___ne;
    }

    public Boolean getRicerca_farmaco___null() {
        return ricerca_farmaco___null;
    }
    public void setRicerca_farmaco___null(Boolean ricerca_farmaco___null) {
        this.ricerca_farmaco___null = ricerca_farmaco___null;
    }

    public Boolean getRicerca_farmaco___not___null() {
        return ricerca_farmaco___not___null;
    }
    public void setRicerca_farmaco___not___null(Boolean ricerca_farmaco___not___null) {
        this.ricerca_farmaco___not___null = ricerca_farmaco___not___null;
    }

    public java.util.List<String> getRicerca_farmaco___in() {
        return ricerca_farmaco___in;
    }
    public void setRicerca_farmaco___in(java.util.List<String> ricerca_farmaco___in) {
        this.ricerca_farmaco___in = ricerca_farmaco___in;
    }

    public java.util.List<String> getRicerca_farmaco___not___in() {
        return ricerca_farmaco___not___in;
    }
    public void setRicerca_farmaco___not___in(java.util.List<String> ricerca_farmaco___not___in) {
        this.ricerca_farmaco___not___in = ricerca_farmaco___not___in;
    }

    public String getRicerca_farmaco___lt() {
        return ricerca_farmaco___lt;
    }
    public void setRicerca_farmaco___lt(String ricerca_farmaco___lt) {
        this.ricerca_farmaco___lt = ricerca_farmaco___lt;
    }

    public String getRicerca_farmaco___lte() {
        return ricerca_farmaco___lte;
    }
    public void setRicerca_farmaco___lte(String ricerca_farmaco___lte) {
        this.ricerca_farmaco___lte = ricerca_farmaco___lte;
    }

    public String getRicerca_farmaco___gt() {
        return ricerca_farmaco___gt;
    }
    public void setRicerca_farmaco___gt(String ricerca_farmaco___gt) {
        this.ricerca_farmaco___gt = ricerca_farmaco___gt;
    }

    public String getRicerca_farmaco___gte() {
        return ricerca_farmaco___gte;
    }
    public void setRicerca_farmaco___gte(String ricerca_farmaco___gte) {
        this.ricerca_farmaco___gte = ricerca_farmaco___gte;
    }

    public String getRicerca_farmaco___contains() {
        return ricerca_farmaco___contains;
    }
    public void setRicerca_farmaco___contains(String ricerca_farmaco___contains) {
        this.ricerca_farmaco___contains = ricerca_farmaco___contains;
    }

    public String getRicerca_farmaco___not___contains() {
        return ricerca_farmaco___not___contains;
    }
    public void setRicerca_farmaco___not___contains(String ricerca_farmaco___not___contains) {
        this.ricerca_farmaco___not___contains = ricerca_farmaco___not___contains;
    }

    public String getRicerca_farmaco___starts_with() {
        return ricerca_farmaco___starts_with;
    }
    public void setRicerca_farmaco___starts_with(String ricerca_farmaco___starts_with) {
        this.ricerca_farmaco___starts_with = ricerca_farmaco___starts_with;
    }

    public String getRicerca_farmaco___not___starts_with() {
        return ricerca_farmaco___not___starts_with;
    }
    public void setRicerca_farmaco___not___starts_with(String ricerca_farmaco___not___starts_with) {
        this.ricerca_farmaco___not___starts_with = ricerca_farmaco___not___starts_with;
    }

    public String getRicerca_farmaco___ends_with() {
        return ricerca_farmaco___ends_with;
    }
    public void setRicerca_farmaco___ends_with(String ricerca_farmaco___ends_with) {
        this.ricerca_farmaco___ends_with = ricerca_farmaco___ends_with;
    }

    public String getRicerca_farmaco___not___ends_with() {
        return ricerca_farmaco___not___ends_with;
    }
    public void setRicerca_farmaco___not___ends_with(String ricerca_farmaco___not___ends_with) {
        this.ricerca_farmaco___not___ends_with = ricerca_farmaco___not___ends_with;
    }

    public java.util.List<CliTerapia_altroFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliTerapia_altroFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliTerapia_altroFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliTerapia_altroFilterDTO> OR) {
        this.OR = OR;
    }

    public CliTerapia_altroFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliTerapia_altroFilterDTO NOT) {
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
        if (altra_motivazione_fine___eq != null) {
            joiner.add("altra_motivazione_fine___eq: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___eq));
        }
        if (altra_motivazione_fine___ne != null) {
            joiner.add("altra_motivazione_fine___ne: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___ne));
        }
        if (altra_motivazione_fine___null != null) {
            joiner.add("altra_motivazione_fine___null: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___null));
        }
        if (altra_motivazione_fine___not___null != null) {
            joiner.add("altra_motivazione_fine___not___null: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___not___null));
        }
        if (altra_motivazione_fine___in != null) {
            joiner.add("altra_motivazione_fine___in: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___in));
        }
        if (altra_motivazione_fine___not___in != null) {
            joiner.add("altra_motivazione_fine___not___in: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___not___in));
        }
        if (altra_motivazione_fine___lt != null) {
            joiner.add("altra_motivazione_fine___lt: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___lt));
        }
        if (altra_motivazione_fine___lte != null) {
            joiner.add("altra_motivazione_fine___lte: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___lte));
        }
        if (altra_motivazione_fine___gt != null) {
            joiner.add("altra_motivazione_fine___gt: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___gt));
        }
        if (altra_motivazione_fine___gte != null) {
            joiner.add("altra_motivazione_fine___gte: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___gte));
        }
        if (altra_motivazione_fine___contains != null) {
            joiner.add("altra_motivazione_fine___contains: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___contains));
        }
        if (altra_motivazione_fine___not___contains != null) {
            joiner.add("altra_motivazione_fine___not___contains: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___not___contains));
        }
        if (altra_motivazione_fine___starts_with != null) {
            joiner.add("altra_motivazione_fine___starts_with: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___starts_with));
        }
        if (altra_motivazione_fine___not___starts_with != null) {
            joiner.add("altra_motivazione_fine___not___starts_with: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___not___starts_with));
        }
        if (altra_motivazione_fine___ends_with != null) {
            joiner.add("altra_motivazione_fine___ends_with: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___ends_with));
        }
        if (altra_motivazione_fine___not___ends_with != null) {
            joiner.add("altra_motivazione_fine___not___ends_with: " + GraphQLRequestSerializer.getEntry(altra_motivazione_fine___not___ends_with));
        }
        if (altro_farmaco___eq != null) {
            joiner.add("altro_farmaco___eq: " + GraphQLRequestSerializer.getEntry(altro_farmaco___eq));
        }
        if (altro_farmaco___ne != null) {
            joiner.add("altro_farmaco___ne: " + GraphQLRequestSerializer.getEntry(altro_farmaco___ne));
        }
        if (altro_farmaco___null != null) {
            joiner.add("altro_farmaco___null: " + GraphQLRequestSerializer.getEntry(altro_farmaco___null));
        }
        if (altro_farmaco___not___null != null) {
            joiner.add("altro_farmaco___not___null: " + GraphQLRequestSerializer.getEntry(altro_farmaco___not___null));
        }
        if (altro_farmaco___in != null) {
            joiner.add("altro_farmaco___in: " + GraphQLRequestSerializer.getEntry(altro_farmaco___in));
        }
        if (altro_farmaco___not___in != null) {
            joiner.add("altro_farmaco___not___in: " + GraphQLRequestSerializer.getEntry(altro_farmaco___not___in));
        }
        if (altro_farmaco___lt != null) {
            joiner.add("altro_farmaco___lt: " + GraphQLRequestSerializer.getEntry(altro_farmaco___lt));
        }
        if (altro_farmaco___lte != null) {
            joiner.add("altro_farmaco___lte: " + GraphQLRequestSerializer.getEntry(altro_farmaco___lte));
        }
        if (altro_farmaco___gt != null) {
            joiner.add("altro_farmaco___gt: " + GraphQLRequestSerializer.getEntry(altro_farmaco___gt));
        }
        if (altro_farmaco___gte != null) {
            joiner.add("altro_farmaco___gte: " + GraphQLRequestSerializer.getEntry(altro_farmaco___gte));
        }
        if (altro_farmaco___contains != null) {
            joiner.add("altro_farmaco___contains: " + GraphQLRequestSerializer.getEntry(altro_farmaco___contains));
        }
        if (altro_farmaco___not___contains != null) {
            joiner.add("altro_farmaco___not___contains: " + GraphQLRequestSerializer.getEntry(altro_farmaco___not___contains));
        }
        if (altro_farmaco___starts_with != null) {
            joiner.add("altro_farmaco___starts_with: " + GraphQLRequestSerializer.getEntry(altro_farmaco___starts_with));
        }
        if (altro_farmaco___not___starts_with != null) {
            joiner.add("altro_farmaco___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_farmaco___not___starts_with));
        }
        if (altro_farmaco___ends_with != null) {
            joiner.add("altro_farmaco___ends_with: " + GraphQLRequestSerializer.getEntry(altro_farmaco___ends_with));
        }
        if (altro_farmaco___not___ends_with != null) {
            joiner.add("altro_farmaco___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_farmaco___not___ends_with));
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
        if (count_dosaggi___eq != null) {
            joiner.add("count_dosaggi___eq: " + GraphQLRequestSerializer.getEntry(count_dosaggi___eq));
        }
        if (count_dosaggi___ne != null) {
            joiner.add("count_dosaggi___ne: " + GraphQLRequestSerializer.getEntry(count_dosaggi___ne));
        }
        if (count_dosaggi___null != null) {
            joiner.add("count_dosaggi___null: " + GraphQLRequestSerializer.getEntry(count_dosaggi___null));
        }
        if (count_dosaggi___not___null != null) {
            joiner.add("count_dosaggi___not___null: " + GraphQLRequestSerializer.getEntry(count_dosaggi___not___null));
        }
        if (count_dosaggi___in != null) {
            joiner.add("count_dosaggi___in: " + GraphQLRequestSerializer.getEntry(count_dosaggi___in));
        }
        if (count_dosaggi___not___in != null) {
            joiner.add("count_dosaggi___not___in: " + GraphQLRequestSerializer.getEntry(count_dosaggi___not___in));
        }
        if (count_dosaggi___lt != null) {
            joiner.add("count_dosaggi___lt: " + GraphQLRequestSerializer.getEntry(count_dosaggi___lt));
        }
        if (count_dosaggi___lte != null) {
            joiner.add("count_dosaggi___lte: " + GraphQLRequestSerializer.getEntry(count_dosaggi___lte));
        }
        if (count_dosaggi___gt != null) {
            joiner.add("count_dosaggi___gt: " + GraphQLRequestSerializer.getEntry(count_dosaggi___gt));
        }
        if (count_dosaggi___gte != null) {
            joiner.add("count_dosaggi___gte: " + GraphQLRequestSerializer.getEntry(count_dosaggi___gte));
        }
        if (data_fine___eq != null) {
            joiner.add("data_fine___eq: " + GraphQLRequestSerializer.getEntry(data_fine___eq));
        }
        if (data_fine___ne != null) {
            joiner.add("data_fine___ne: " + GraphQLRequestSerializer.getEntry(data_fine___ne));
        }
        if (data_fine___null != null) {
            joiner.add("data_fine___null: " + GraphQLRequestSerializer.getEntry(data_fine___null));
        }
        if (data_fine___not___null != null) {
            joiner.add("data_fine___not___null: " + GraphQLRequestSerializer.getEntry(data_fine___not___null));
        }
        if (data_fine___in != null) {
            joiner.add("data_fine___in: " + GraphQLRequestSerializer.getEntry(data_fine___in));
        }
        if (data_fine___not___in != null) {
            joiner.add("data_fine___not___in: " + GraphQLRequestSerializer.getEntry(data_fine___not___in));
        }
        if (data_fine___lt != null) {
            joiner.add("data_fine___lt: " + GraphQLRequestSerializer.getEntry(data_fine___lt));
        }
        if (data_fine___lte != null) {
            joiner.add("data_fine___lte: " + GraphQLRequestSerializer.getEntry(data_fine___lte));
        }
        if (data_fine___gt != null) {
            joiner.add("data_fine___gt: " + GraphQLRequestSerializer.getEntry(data_fine___gt));
        }
        if (data_fine___gte != null) {
            joiner.add("data_fine___gte: " + GraphQLRequestSerializer.getEntry(data_fine___gte));
        }
        if (data_inizio___eq != null) {
            joiner.add("data_inizio___eq: " + GraphQLRequestSerializer.getEntry(data_inizio___eq));
        }
        if (data_inizio___ne != null) {
            joiner.add("data_inizio___ne: " + GraphQLRequestSerializer.getEntry(data_inizio___ne));
        }
        if (data_inizio___null != null) {
            joiner.add("data_inizio___null: " + GraphQLRequestSerializer.getEntry(data_inizio___null));
        }
        if (data_inizio___not___null != null) {
            joiner.add("data_inizio___not___null: " + GraphQLRequestSerializer.getEntry(data_inizio___not___null));
        }
        if (data_inizio___in != null) {
            joiner.add("data_inizio___in: " + GraphQLRequestSerializer.getEntry(data_inizio___in));
        }
        if (data_inizio___not___in != null) {
            joiner.add("data_inizio___not___in: " + GraphQLRequestSerializer.getEntry(data_inizio___not___in));
        }
        if (data_inizio___lt != null) {
            joiner.add("data_inizio___lt: " + GraphQLRequestSerializer.getEntry(data_inizio___lt));
        }
        if (data_inizio___lte != null) {
            joiner.add("data_inizio___lte: " + GraphQLRequestSerializer.getEntry(data_inizio___lte));
        }
        if (data_inizio___gt != null) {
            joiner.add("data_inizio___gt: " + GraphQLRequestSerializer.getEntry(data_inizio___gt));
        }
        if (data_inizio___gte != null) {
            joiner.add("data_inizio___gte: " + GraphQLRequestSerializer.getEntry(data_inizio___gte));
        }
        if (dosaggio___eq != null) {
            joiner.add("dosaggio___eq: " + GraphQLRequestSerializer.getEntry(dosaggio___eq));
        }
        if (dosaggio___ne != null) {
            joiner.add("dosaggio___ne: " + GraphQLRequestSerializer.getEntry(dosaggio___ne));
        }
        if (dosaggio___null != null) {
            joiner.add("dosaggio___null: " + GraphQLRequestSerializer.getEntry(dosaggio___null));
        }
        if (dosaggio___not___null != null) {
            joiner.add("dosaggio___not___null: " + GraphQLRequestSerializer.getEntry(dosaggio___not___null));
        }
        if (dosaggio___in != null) {
            joiner.add("dosaggio___in: " + GraphQLRequestSerializer.getEntry(dosaggio___in));
        }
        if (dosaggio___not___in != null) {
            joiner.add("dosaggio___not___in: " + GraphQLRequestSerializer.getEntry(dosaggio___not___in));
        }
        if (dosaggio___lt != null) {
            joiner.add("dosaggio___lt: " + GraphQLRequestSerializer.getEntry(dosaggio___lt));
        }
        if (dosaggio___lte != null) {
            joiner.add("dosaggio___lte: " + GraphQLRequestSerializer.getEntry(dosaggio___lte));
        }
        if (dosaggio___gt != null) {
            joiner.add("dosaggio___gt: " + GraphQLRequestSerializer.getEntry(dosaggio___gt));
        }
        if (dosaggio___gte != null) {
            joiner.add("dosaggio___gte: " + GraphQLRequestSerializer.getEntry(dosaggio___gte));
        }
        if (dosaggio___contains != null) {
            joiner.add("dosaggio___contains: " + GraphQLRequestSerializer.getEntry(dosaggio___contains));
        }
        if (dosaggio___not___contains != null) {
            joiner.add("dosaggio___not___contains: " + GraphQLRequestSerializer.getEntry(dosaggio___not___contains));
        }
        if (dosaggio___starts_with != null) {
            joiner.add("dosaggio___starts_with: " + GraphQLRequestSerializer.getEntry(dosaggio___starts_with));
        }
        if (dosaggio___not___starts_with != null) {
            joiner.add("dosaggio___not___starts_with: " + GraphQLRequestSerializer.getEntry(dosaggio___not___starts_with));
        }
        if (dosaggio___ends_with != null) {
            joiner.add("dosaggio___ends_with: " + GraphQLRequestSerializer.getEntry(dosaggio___ends_with));
        }
        if (dosaggio___not___ends_with != null) {
            joiner.add("dosaggio___not___ends_with: " + GraphQLRequestSerializer.getEntry(dosaggio___not___ends_with));
        }
        if (epatica___eq != null) {
            joiner.add("epatica___eq: " + GraphQLRequestSerializer.getEntry(epatica___eq));
        }
        if (epatica___ne != null) {
            joiner.add("epatica___ne: " + GraphQLRequestSerializer.getEntry(epatica___ne));
        }
        if (epatica___null != null) {
            joiner.add("epatica___null: " + GraphQLRequestSerializer.getEntry(epatica___null));
        }
        if (epatica___not___null != null) {
            joiner.add("epatica___not___null: " + GraphQLRequestSerializer.getEntry(epatica___not___null));
        }
        if (farmaco_ATC___eq != null) {
            joiner.add("farmaco_ATC___eq: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___eq));
        }
        if (farmaco_ATC___ne != null) {
            joiner.add("farmaco_ATC___ne: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___ne));
        }
        if (farmaco_ATC___null != null) {
            joiner.add("farmaco_ATC___null: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___null));
        }
        if (farmaco_ATC___not___null != null) {
            joiner.add("farmaco_ATC___not___null: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___not___null));
        }
        if (farmaco_ATC___in != null) {
            joiner.add("farmaco_ATC___in: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___in));
        }
        if (farmaco_ATC___not___in != null) {
            joiner.add("farmaco_ATC___not___in: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___not___in));
        }
        if (farmaco_ATC___lt != null) {
            joiner.add("farmaco_ATC___lt: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___lt));
        }
        if (farmaco_ATC___lte != null) {
            joiner.add("farmaco_ATC___lte: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___lte));
        }
        if (farmaco_ATC___gt != null) {
            joiner.add("farmaco_ATC___gt: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___gt));
        }
        if (farmaco_ATC___gte != null) {
            joiner.add("farmaco_ATC___gte: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___gte));
        }
        if (farmaco_ATC___contains != null) {
            joiner.add("farmaco_ATC___contains: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___contains));
        }
        if (farmaco_ATC___not___contains != null) {
            joiner.add("farmaco_ATC___not___contains: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___not___contains));
        }
        if (farmaco_ATC___starts_with != null) {
            joiner.add("farmaco_ATC___starts_with: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___starts_with));
        }
        if (farmaco_ATC___not___starts_with != null) {
            joiner.add("farmaco_ATC___not___starts_with: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___not___starts_with));
        }
        if (farmaco_ATC___ends_with != null) {
            joiner.add("farmaco_ATC___ends_with: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___ends_with));
        }
        if (farmaco_ATC___not___ends_with != null) {
            joiner.add("farmaco_ATC___not___ends_with: " + GraphQLRequestSerializer.getEntry(farmaco_ATC___not___ends_with));
        }
        if (motivazione_fine___eq != null) {
            joiner.add("motivazione_fine___eq: " + GraphQLRequestSerializer.getEntry(motivazione_fine___eq));
        }
        if (motivazione_fine___ne != null) {
            joiner.add("motivazione_fine___ne: " + GraphQLRequestSerializer.getEntry(motivazione_fine___ne));
        }
        if (motivazione_fine___null != null) {
            joiner.add("motivazione_fine___null: " + GraphQLRequestSerializer.getEntry(motivazione_fine___null));
        }
        if (motivazione_fine___not___null != null) {
            joiner.add("motivazione_fine___not___null: " + GraphQLRequestSerializer.getEntry(motivazione_fine___not___null));
        }
        if (motivazione_fine___in != null) {
            joiner.add("motivazione_fine___in: " + GraphQLRequestSerializer.getEntry(motivazione_fine___in));
        }
        if (motivazione_fine___not___in != null) {
            joiner.add("motivazione_fine___not___in: " + GraphQLRequestSerializer.getEntry(motivazione_fine___not___in));
        }
        if (motivazione_fine___lt != null) {
            joiner.add("motivazione_fine___lt: " + GraphQLRequestSerializer.getEntry(motivazione_fine___lt));
        }
        if (motivazione_fine___lte != null) {
            joiner.add("motivazione_fine___lte: " + GraphQLRequestSerializer.getEntry(motivazione_fine___lte));
        }
        if (motivazione_fine___gt != null) {
            joiner.add("motivazione_fine___gt: " + GraphQLRequestSerializer.getEntry(motivazione_fine___gt));
        }
        if (motivazione_fine___gte != null) {
            joiner.add("motivazione_fine___gte: " + GraphQLRequestSerializer.getEntry(motivazione_fine___gte));
        }
        if (motivazione_fine___contains != null) {
            joiner.add("motivazione_fine___contains: " + GraphQLRequestSerializer.getEntry(motivazione_fine___contains));
        }
        if (motivazione_fine___not___contains != null) {
            joiner.add("motivazione_fine___not___contains: " + GraphQLRequestSerializer.getEntry(motivazione_fine___not___contains));
        }
        if (motivazione_fine___starts_with != null) {
            joiner.add("motivazione_fine___starts_with: " + GraphQLRequestSerializer.getEntry(motivazione_fine___starts_with));
        }
        if (motivazione_fine___not___starts_with != null) {
            joiner.add("motivazione_fine___not___starts_with: " + GraphQLRequestSerializer.getEntry(motivazione_fine___not___starts_with));
        }
        if (motivazione_fine___ends_with != null) {
            joiner.add("motivazione_fine___ends_with: " + GraphQLRequestSerializer.getEntry(motivazione_fine___ends_with));
        }
        if (motivazione_fine___not___ends_with != null) {
            joiner.add("motivazione_fine___not___ends_with: " + GraphQLRequestSerializer.getEntry(motivazione_fine___not___ends_with));
        }
        if (nome_farmaco___eq != null) {
            joiner.add("nome_farmaco___eq: " + GraphQLRequestSerializer.getEntry(nome_farmaco___eq));
        }
        if (nome_farmaco___ne != null) {
            joiner.add("nome_farmaco___ne: " + GraphQLRequestSerializer.getEntry(nome_farmaco___ne));
        }
        if (nome_farmaco___null != null) {
            joiner.add("nome_farmaco___null: " + GraphQLRequestSerializer.getEntry(nome_farmaco___null));
        }
        if (nome_farmaco___not___null != null) {
            joiner.add("nome_farmaco___not___null: " + GraphQLRequestSerializer.getEntry(nome_farmaco___not___null));
        }
        if (nome_farmaco___in != null) {
            joiner.add("nome_farmaco___in: " + GraphQLRequestSerializer.getEntry(nome_farmaco___in));
        }
        if (nome_farmaco___not___in != null) {
            joiner.add("nome_farmaco___not___in: " + GraphQLRequestSerializer.getEntry(nome_farmaco___not___in));
        }
        if (nome_farmaco___lt != null) {
            joiner.add("nome_farmaco___lt: " + GraphQLRequestSerializer.getEntry(nome_farmaco___lt));
        }
        if (nome_farmaco___lte != null) {
            joiner.add("nome_farmaco___lte: " + GraphQLRequestSerializer.getEntry(nome_farmaco___lte));
        }
        if (nome_farmaco___gt != null) {
            joiner.add("nome_farmaco___gt: " + GraphQLRequestSerializer.getEntry(nome_farmaco___gt));
        }
        if (nome_farmaco___gte != null) {
            joiner.add("nome_farmaco___gte: " + GraphQLRequestSerializer.getEntry(nome_farmaco___gte));
        }
        if (nome_farmaco___contains != null) {
            joiner.add("nome_farmaco___contains: " + GraphQLRequestSerializer.getEntry(nome_farmaco___contains));
        }
        if (nome_farmaco___not___contains != null) {
            joiner.add("nome_farmaco___not___contains: " + GraphQLRequestSerializer.getEntry(nome_farmaco___not___contains));
        }
        if (nome_farmaco___starts_with != null) {
            joiner.add("nome_farmaco___starts_with: " + GraphQLRequestSerializer.getEntry(nome_farmaco___starts_with));
        }
        if (nome_farmaco___not___starts_with != null) {
            joiner.add("nome_farmaco___not___starts_with: " + GraphQLRequestSerializer.getEntry(nome_farmaco___not___starts_with));
        }
        if (nome_farmaco___ends_with != null) {
            joiner.add("nome_farmaco___ends_with: " + GraphQLRequestSerializer.getEntry(nome_farmaco___ends_with));
        }
        if (nome_farmaco___not___ends_with != null) {
            joiner.add("nome_farmaco___not___ends_with: " + GraphQLRequestSerializer.getEntry(nome_farmaco___not___ends_with));
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
        if (ricerca_farmaco___eq != null) {
            joiner.add("ricerca_farmaco___eq: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___eq));
        }
        if (ricerca_farmaco___ne != null) {
            joiner.add("ricerca_farmaco___ne: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___ne));
        }
        if (ricerca_farmaco___null != null) {
            joiner.add("ricerca_farmaco___null: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___null));
        }
        if (ricerca_farmaco___not___null != null) {
            joiner.add("ricerca_farmaco___not___null: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___not___null));
        }
        if (ricerca_farmaco___in != null) {
            joiner.add("ricerca_farmaco___in: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___in));
        }
        if (ricerca_farmaco___not___in != null) {
            joiner.add("ricerca_farmaco___not___in: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___not___in));
        }
        if (ricerca_farmaco___lt != null) {
            joiner.add("ricerca_farmaco___lt: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___lt));
        }
        if (ricerca_farmaco___lte != null) {
            joiner.add("ricerca_farmaco___lte: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___lte));
        }
        if (ricerca_farmaco___gt != null) {
            joiner.add("ricerca_farmaco___gt: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___gt));
        }
        if (ricerca_farmaco___gte != null) {
            joiner.add("ricerca_farmaco___gte: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___gte));
        }
        if (ricerca_farmaco___contains != null) {
            joiner.add("ricerca_farmaco___contains: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___contains));
        }
        if (ricerca_farmaco___not___contains != null) {
            joiner.add("ricerca_farmaco___not___contains: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___not___contains));
        }
        if (ricerca_farmaco___starts_with != null) {
            joiner.add("ricerca_farmaco___starts_with: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___starts_with));
        }
        if (ricerca_farmaco___not___starts_with != null) {
            joiner.add("ricerca_farmaco___not___starts_with: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___not___starts_with));
        }
        if (ricerca_farmaco___ends_with != null) {
            joiner.add("ricerca_farmaco___ends_with: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___ends_with));
        }
        if (ricerca_farmaco___not___ends_with != null) {
            joiner.add("ricerca_farmaco___not___ends_with: " + GraphQLRequestSerializer.getEntry(ricerca_farmaco___not___ends_with));
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

    public static CliTerapia_altroFilterDTO.Builder builder() {
        return new CliTerapia_altroFilterDTO.Builder();
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
        private String altra_motivazione_fine___eq;
        private String altra_motivazione_fine___ne;
        private Boolean altra_motivazione_fine___null;
        private Boolean altra_motivazione_fine___not___null;
        private java.util.List<String> altra_motivazione_fine___in;
        private java.util.List<String> altra_motivazione_fine___not___in;
        private String altra_motivazione_fine___lt;
        private String altra_motivazione_fine___lte;
        private String altra_motivazione_fine___gt;
        private String altra_motivazione_fine___gte;
        private String altra_motivazione_fine___contains;
        private String altra_motivazione_fine___not___contains;
        private String altra_motivazione_fine___starts_with;
        private String altra_motivazione_fine___not___starts_with;
        private String altra_motivazione_fine___ends_with;
        private String altra_motivazione_fine___not___ends_with;
        private String altro_farmaco___eq;
        private String altro_farmaco___ne;
        private Boolean altro_farmaco___null;
        private Boolean altro_farmaco___not___null;
        private java.util.List<String> altro_farmaco___in;
        private java.util.List<String> altro_farmaco___not___in;
        private String altro_farmaco___lt;
        private String altro_farmaco___lte;
        private String altro_farmaco___gt;
        private String altro_farmaco___gte;
        private String altro_farmaco___contains;
        private String altro_farmaco___not___contains;
        private String altro_farmaco___starts_with;
        private String altro_farmaco___not___starts_with;
        private String altro_farmaco___ends_with;
        private String altro_farmaco___not___ends_with;
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
        private Integer count_dosaggi___eq;
        private Integer count_dosaggi___ne;
        private Boolean count_dosaggi___null;
        private Boolean count_dosaggi___not___null;
        private java.util.List<Integer> count_dosaggi___in;
        private java.util.List<Integer> count_dosaggi___not___in;
        private Integer count_dosaggi___lt;
        private Integer count_dosaggi___lte;
        private Integer count_dosaggi___gt;
        private Integer count_dosaggi___gte;
        private String data_fine___eq;
        private String data_fine___ne;
        private Boolean data_fine___null;
        private Boolean data_fine___not___null;
        private java.util.List<String> data_fine___in;
        private java.util.List<String> data_fine___not___in;
        private String data_fine___lt;
        private String data_fine___lte;
        private String data_fine___gt;
        private String data_fine___gte;
        private String data_inizio___eq;
        private String data_inizio___ne;
        private Boolean data_inizio___null;
        private Boolean data_inizio___not___null;
        private java.util.List<String> data_inizio___in;
        private java.util.List<String> data_inizio___not___in;
        private String data_inizio___lt;
        private String data_inizio___lte;
        private String data_inizio___gt;
        private String data_inizio___gte;
        private String dosaggio___eq;
        private String dosaggio___ne;
        private Boolean dosaggio___null;
        private Boolean dosaggio___not___null;
        private java.util.List<String> dosaggio___in;
        private java.util.List<String> dosaggio___not___in;
        private String dosaggio___lt;
        private String dosaggio___lte;
        private String dosaggio___gt;
        private String dosaggio___gte;
        private String dosaggio___contains;
        private String dosaggio___not___contains;
        private String dosaggio___starts_with;
        private String dosaggio___not___starts_with;
        private String dosaggio___ends_with;
        private String dosaggio___not___ends_with;
        private Boolean epatica___eq;
        private Boolean epatica___ne;
        private Boolean epatica___null;
        private Boolean epatica___not___null;
        private String farmaco_ATC___eq;
        private String farmaco_ATC___ne;
        private Boolean farmaco_ATC___null;
        private Boolean farmaco_ATC___not___null;
        private java.util.List<String> farmaco_ATC___in;
        private java.util.List<String> farmaco_ATC___not___in;
        private String farmaco_ATC___lt;
        private String farmaco_ATC___lte;
        private String farmaco_ATC___gt;
        private String farmaco_ATC___gte;
        private String farmaco_ATC___contains;
        private String farmaco_ATC___not___contains;
        private String farmaco_ATC___starts_with;
        private String farmaco_ATC___not___starts_with;
        private String farmaco_ATC___ends_with;
        private String farmaco_ATC___not___ends_with;
        private String motivazione_fine___eq;
        private String motivazione_fine___ne;
        private Boolean motivazione_fine___null;
        private Boolean motivazione_fine___not___null;
        private java.util.List<String> motivazione_fine___in;
        private java.util.List<String> motivazione_fine___not___in;
        private String motivazione_fine___lt;
        private String motivazione_fine___lte;
        private String motivazione_fine___gt;
        private String motivazione_fine___gte;
        private String motivazione_fine___contains;
        private String motivazione_fine___not___contains;
        private String motivazione_fine___starts_with;
        private String motivazione_fine___not___starts_with;
        private String motivazione_fine___ends_with;
        private String motivazione_fine___not___ends_with;
        private String nome_farmaco___eq;
        private String nome_farmaco___ne;
        private Boolean nome_farmaco___null;
        private Boolean nome_farmaco___not___null;
        private java.util.List<String> nome_farmaco___in;
        private java.util.List<String> nome_farmaco___not___in;
        private String nome_farmaco___lt;
        private String nome_farmaco___lte;
        private String nome_farmaco___gt;
        private String nome_farmaco___gte;
        private String nome_farmaco___contains;
        private String nome_farmaco___not___contains;
        private String nome_farmaco___starts_with;
        private String nome_farmaco___not___starts_with;
        private String nome_farmaco___ends_with;
        private String nome_farmaco___not___ends_with;
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
        private String ricerca_farmaco___eq;
        private String ricerca_farmaco___ne;
        private Boolean ricerca_farmaco___null;
        private Boolean ricerca_farmaco___not___null;
        private java.util.List<String> ricerca_farmaco___in;
        private java.util.List<String> ricerca_farmaco___not___in;
        private String ricerca_farmaco___lt;
        private String ricerca_farmaco___lte;
        private String ricerca_farmaco___gt;
        private String ricerca_farmaco___gte;
        private String ricerca_farmaco___contains;
        private String ricerca_farmaco___not___contains;
        private String ricerca_farmaco___starts_with;
        private String ricerca_farmaco___not___starts_with;
        private String ricerca_farmaco___ends_with;
        private String ricerca_farmaco___not___ends_with;
        private java.util.List<CliTerapia_altroFilterDTO> AND;
        private java.util.List<CliTerapia_altroFilterDTO> OR;
        private CliTerapia_altroFilterDTO NOT;

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

        public Builder setAltra_motivazione_fine___eq(String altra_motivazione_fine___eq) {
            this.altra_motivazione_fine___eq = altra_motivazione_fine___eq;
            return this;
        }

        public Builder setAltra_motivazione_fine___ne(String altra_motivazione_fine___ne) {
            this.altra_motivazione_fine___ne = altra_motivazione_fine___ne;
            return this;
        }

        public Builder setAltra_motivazione_fine___null(Boolean altra_motivazione_fine___null) {
            this.altra_motivazione_fine___null = altra_motivazione_fine___null;
            return this;
        }

        public Builder setAltra_motivazione_fine___not___null(Boolean altra_motivazione_fine___not___null) {
            this.altra_motivazione_fine___not___null = altra_motivazione_fine___not___null;
            return this;
        }

        public Builder setAltra_motivazione_fine___in(java.util.List<String> altra_motivazione_fine___in) {
            this.altra_motivazione_fine___in = altra_motivazione_fine___in;
            return this;
        }

        public Builder setAltra_motivazione_fine___not___in(java.util.List<String> altra_motivazione_fine___not___in) {
            this.altra_motivazione_fine___not___in = altra_motivazione_fine___not___in;
            return this;
        }

        public Builder setAltra_motivazione_fine___lt(String altra_motivazione_fine___lt) {
            this.altra_motivazione_fine___lt = altra_motivazione_fine___lt;
            return this;
        }

        public Builder setAltra_motivazione_fine___lte(String altra_motivazione_fine___lte) {
            this.altra_motivazione_fine___lte = altra_motivazione_fine___lte;
            return this;
        }

        public Builder setAltra_motivazione_fine___gt(String altra_motivazione_fine___gt) {
            this.altra_motivazione_fine___gt = altra_motivazione_fine___gt;
            return this;
        }

        public Builder setAltra_motivazione_fine___gte(String altra_motivazione_fine___gte) {
            this.altra_motivazione_fine___gte = altra_motivazione_fine___gte;
            return this;
        }

        public Builder setAltra_motivazione_fine___contains(String altra_motivazione_fine___contains) {
            this.altra_motivazione_fine___contains = altra_motivazione_fine___contains;
            return this;
        }

        public Builder setAltra_motivazione_fine___not___contains(String altra_motivazione_fine___not___contains) {
            this.altra_motivazione_fine___not___contains = altra_motivazione_fine___not___contains;
            return this;
        }

        public Builder setAltra_motivazione_fine___starts_with(String altra_motivazione_fine___starts_with) {
            this.altra_motivazione_fine___starts_with = altra_motivazione_fine___starts_with;
            return this;
        }

        public Builder setAltra_motivazione_fine___not___starts_with(String altra_motivazione_fine___not___starts_with) {
            this.altra_motivazione_fine___not___starts_with = altra_motivazione_fine___not___starts_with;
            return this;
        }

        public Builder setAltra_motivazione_fine___ends_with(String altra_motivazione_fine___ends_with) {
            this.altra_motivazione_fine___ends_with = altra_motivazione_fine___ends_with;
            return this;
        }

        public Builder setAltra_motivazione_fine___not___ends_with(String altra_motivazione_fine___not___ends_with) {
            this.altra_motivazione_fine___not___ends_with = altra_motivazione_fine___not___ends_with;
            return this;
        }

        public Builder setAltro_farmaco___eq(String altro_farmaco___eq) {
            this.altro_farmaco___eq = altro_farmaco___eq;
            return this;
        }

        public Builder setAltro_farmaco___ne(String altro_farmaco___ne) {
            this.altro_farmaco___ne = altro_farmaco___ne;
            return this;
        }

        public Builder setAltro_farmaco___null(Boolean altro_farmaco___null) {
            this.altro_farmaco___null = altro_farmaco___null;
            return this;
        }

        public Builder setAltro_farmaco___not___null(Boolean altro_farmaco___not___null) {
            this.altro_farmaco___not___null = altro_farmaco___not___null;
            return this;
        }

        public Builder setAltro_farmaco___in(java.util.List<String> altro_farmaco___in) {
            this.altro_farmaco___in = altro_farmaco___in;
            return this;
        }

        public Builder setAltro_farmaco___not___in(java.util.List<String> altro_farmaco___not___in) {
            this.altro_farmaco___not___in = altro_farmaco___not___in;
            return this;
        }

        public Builder setAltro_farmaco___lt(String altro_farmaco___lt) {
            this.altro_farmaco___lt = altro_farmaco___lt;
            return this;
        }

        public Builder setAltro_farmaco___lte(String altro_farmaco___lte) {
            this.altro_farmaco___lte = altro_farmaco___lte;
            return this;
        }

        public Builder setAltro_farmaco___gt(String altro_farmaco___gt) {
            this.altro_farmaco___gt = altro_farmaco___gt;
            return this;
        }

        public Builder setAltro_farmaco___gte(String altro_farmaco___gte) {
            this.altro_farmaco___gte = altro_farmaco___gte;
            return this;
        }

        public Builder setAltro_farmaco___contains(String altro_farmaco___contains) {
            this.altro_farmaco___contains = altro_farmaco___contains;
            return this;
        }

        public Builder setAltro_farmaco___not___contains(String altro_farmaco___not___contains) {
            this.altro_farmaco___not___contains = altro_farmaco___not___contains;
            return this;
        }

        public Builder setAltro_farmaco___starts_with(String altro_farmaco___starts_with) {
            this.altro_farmaco___starts_with = altro_farmaco___starts_with;
            return this;
        }

        public Builder setAltro_farmaco___not___starts_with(String altro_farmaco___not___starts_with) {
            this.altro_farmaco___not___starts_with = altro_farmaco___not___starts_with;
            return this;
        }

        public Builder setAltro_farmaco___ends_with(String altro_farmaco___ends_with) {
            this.altro_farmaco___ends_with = altro_farmaco___ends_with;
            return this;
        }

        public Builder setAltro_farmaco___not___ends_with(String altro_farmaco___not___ends_with) {
            this.altro_farmaco___not___ends_with = altro_farmaco___not___ends_with;
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

        public Builder setCount_dosaggi___eq(Integer count_dosaggi___eq) {
            this.count_dosaggi___eq = count_dosaggi___eq;
            return this;
        }

        public Builder setCount_dosaggi___ne(Integer count_dosaggi___ne) {
            this.count_dosaggi___ne = count_dosaggi___ne;
            return this;
        }

        public Builder setCount_dosaggi___null(Boolean count_dosaggi___null) {
            this.count_dosaggi___null = count_dosaggi___null;
            return this;
        }

        public Builder setCount_dosaggi___not___null(Boolean count_dosaggi___not___null) {
            this.count_dosaggi___not___null = count_dosaggi___not___null;
            return this;
        }

        public Builder setCount_dosaggi___in(java.util.List<Integer> count_dosaggi___in) {
            this.count_dosaggi___in = count_dosaggi___in;
            return this;
        }

        public Builder setCount_dosaggi___not___in(java.util.List<Integer> count_dosaggi___not___in) {
            this.count_dosaggi___not___in = count_dosaggi___not___in;
            return this;
        }

        public Builder setCount_dosaggi___lt(Integer count_dosaggi___lt) {
            this.count_dosaggi___lt = count_dosaggi___lt;
            return this;
        }

        public Builder setCount_dosaggi___lte(Integer count_dosaggi___lte) {
            this.count_dosaggi___lte = count_dosaggi___lte;
            return this;
        }

        public Builder setCount_dosaggi___gt(Integer count_dosaggi___gt) {
            this.count_dosaggi___gt = count_dosaggi___gt;
            return this;
        }

        public Builder setCount_dosaggi___gte(Integer count_dosaggi___gte) {
            this.count_dosaggi___gte = count_dosaggi___gte;
            return this;
        }

        public Builder setData_fine___eq(String data_fine___eq) {
            this.data_fine___eq = data_fine___eq;
            return this;
        }

        public Builder setData_fine___ne(String data_fine___ne) {
            this.data_fine___ne = data_fine___ne;
            return this;
        }

        public Builder setData_fine___null(Boolean data_fine___null) {
            this.data_fine___null = data_fine___null;
            return this;
        }

        public Builder setData_fine___not___null(Boolean data_fine___not___null) {
            this.data_fine___not___null = data_fine___not___null;
            return this;
        }

        public Builder setData_fine___in(java.util.List<String> data_fine___in) {
            this.data_fine___in = data_fine___in;
            return this;
        }

        public Builder setData_fine___not___in(java.util.List<String> data_fine___not___in) {
            this.data_fine___not___in = data_fine___not___in;
            return this;
        }

        public Builder setData_fine___lt(String data_fine___lt) {
            this.data_fine___lt = data_fine___lt;
            return this;
        }

        public Builder setData_fine___lte(String data_fine___lte) {
            this.data_fine___lte = data_fine___lte;
            return this;
        }

        public Builder setData_fine___gt(String data_fine___gt) {
            this.data_fine___gt = data_fine___gt;
            return this;
        }

        public Builder setData_fine___gte(String data_fine___gte) {
            this.data_fine___gte = data_fine___gte;
            return this;
        }

        public Builder setData_inizio___eq(String data_inizio___eq) {
            this.data_inizio___eq = data_inizio___eq;
            return this;
        }

        public Builder setData_inizio___ne(String data_inizio___ne) {
            this.data_inizio___ne = data_inizio___ne;
            return this;
        }

        public Builder setData_inizio___null(Boolean data_inizio___null) {
            this.data_inizio___null = data_inizio___null;
            return this;
        }

        public Builder setData_inizio___not___null(Boolean data_inizio___not___null) {
            this.data_inizio___not___null = data_inizio___not___null;
            return this;
        }

        public Builder setData_inizio___in(java.util.List<String> data_inizio___in) {
            this.data_inizio___in = data_inizio___in;
            return this;
        }

        public Builder setData_inizio___not___in(java.util.List<String> data_inizio___not___in) {
            this.data_inizio___not___in = data_inizio___not___in;
            return this;
        }

        public Builder setData_inizio___lt(String data_inizio___lt) {
            this.data_inizio___lt = data_inizio___lt;
            return this;
        }

        public Builder setData_inizio___lte(String data_inizio___lte) {
            this.data_inizio___lte = data_inizio___lte;
            return this;
        }

        public Builder setData_inizio___gt(String data_inizio___gt) {
            this.data_inizio___gt = data_inizio___gt;
            return this;
        }

        public Builder setData_inizio___gte(String data_inizio___gte) {
            this.data_inizio___gte = data_inizio___gte;
            return this;
        }

        public Builder setDosaggio___eq(String dosaggio___eq) {
            this.dosaggio___eq = dosaggio___eq;
            return this;
        }

        public Builder setDosaggio___ne(String dosaggio___ne) {
            this.dosaggio___ne = dosaggio___ne;
            return this;
        }

        public Builder setDosaggio___null(Boolean dosaggio___null) {
            this.dosaggio___null = dosaggio___null;
            return this;
        }

        public Builder setDosaggio___not___null(Boolean dosaggio___not___null) {
            this.dosaggio___not___null = dosaggio___not___null;
            return this;
        }

        public Builder setDosaggio___in(java.util.List<String> dosaggio___in) {
            this.dosaggio___in = dosaggio___in;
            return this;
        }

        public Builder setDosaggio___not___in(java.util.List<String> dosaggio___not___in) {
            this.dosaggio___not___in = dosaggio___not___in;
            return this;
        }

        public Builder setDosaggio___lt(String dosaggio___lt) {
            this.dosaggio___lt = dosaggio___lt;
            return this;
        }

        public Builder setDosaggio___lte(String dosaggio___lte) {
            this.dosaggio___lte = dosaggio___lte;
            return this;
        }

        public Builder setDosaggio___gt(String dosaggio___gt) {
            this.dosaggio___gt = dosaggio___gt;
            return this;
        }

        public Builder setDosaggio___gte(String dosaggio___gte) {
            this.dosaggio___gte = dosaggio___gte;
            return this;
        }

        public Builder setDosaggio___contains(String dosaggio___contains) {
            this.dosaggio___contains = dosaggio___contains;
            return this;
        }

        public Builder setDosaggio___not___contains(String dosaggio___not___contains) {
            this.dosaggio___not___contains = dosaggio___not___contains;
            return this;
        }

        public Builder setDosaggio___starts_with(String dosaggio___starts_with) {
            this.dosaggio___starts_with = dosaggio___starts_with;
            return this;
        }

        public Builder setDosaggio___not___starts_with(String dosaggio___not___starts_with) {
            this.dosaggio___not___starts_with = dosaggio___not___starts_with;
            return this;
        }

        public Builder setDosaggio___ends_with(String dosaggio___ends_with) {
            this.dosaggio___ends_with = dosaggio___ends_with;
            return this;
        }

        public Builder setDosaggio___not___ends_with(String dosaggio___not___ends_with) {
            this.dosaggio___not___ends_with = dosaggio___not___ends_with;
            return this;
        }

        public Builder setEpatica___eq(Boolean epatica___eq) {
            this.epatica___eq = epatica___eq;
            return this;
        }

        public Builder setEpatica___ne(Boolean epatica___ne) {
            this.epatica___ne = epatica___ne;
            return this;
        }

        public Builder setEpatica___null(Boolean epatica___null) {
            this.epatica___null = epatica___null;
            return this;
        }

        public Builder setEpatica___not___null(Boolean epatica___not___null) {
            this.epatica___not___null = epatica___not___null;
            return this;
        }

        public Builder setFarmaco_ATC___eq(String farmaco_ATC___eq) {
            this.farmaco_ATC___eq = farmaco_ATC___eq;
            return this;
        }

        public Builder setFarmaco_ATC___ne(String farmaco_ATC___ne) {
            this.farmaco_ATC___ne = farmaco_ATC___ne;
            return this;
        }

        public Builder setFarmaco_ATC___null(Boolean farmaco_ATC___null) {
            this.farmaco_ATC___null = farmaco_ATC___null;
            return this;
        }

        public Builder setFarmaco_ATC___not___null(Boolean farmaco_ATC___not___null) {
            this.farmaco_ATC___not___null = farmaco_ATC___not___null;
            return this;
        }

        public Builder setFarmaco_ATC___in(java.util.List<String> farmaco_ATC___in) {
            this.farmaco_ATC___in = farmaco_ATC___in;
            return this;
        }

        public Builder setFarmaco_ATC___not___in(java.util.List<String> farmaco_ATC___not___in) {
            this.farmaco_ATC___not___in = farmaco_ATC___not___in;
            return this;
        }

        public Builder setFarmaco_ATC___lt(String farmaco_ATC___lt) {
            this.farmaco_ATC___lt = farmaco_ATC___lt;
            return this;
        }

        public Builder setFarmaco_ATC___lte(String farmaco_ATC___lte) {
            this.farmaco_ATC___lte = farmaco_ATC___lte;
            return this;
        }

        public Builder setFarmaco_ATC___gt(String farmaco_ATC___gt) {
            this.farmaco_ATC___gt = farmaco_ATC___gt;
            return this;
        }

        public Builder setFarmaco_ATC___gte(String farmaco_ATC___gte) {
            this.farmaco_ATC___gte = farmaco_ATC___gte;
            return this;
        }

        public Builder setFarmaco_ATC___contains(String farmaco_ATC___contains) {
            this.farmaco_ATC___contains = farmaco_ATC___contains;
            return this;
        }

        public Builder setFarmaco_ATC___not___contains(String farmaco_ATC___not___contains) {
            this.farmaco_ATC___not___contains = farmaco_ATC___not___contains;
            return this;
        }

        public Builder setFarmaco_ATC___starts_with(String farmaco_ATC___starts_with) {
            this.farmaco_ATC___starts_with = farmaco_ATC___starts_with;
            return this;
        }

        public Builder setFarmaco_ATC___not___starts_with(String farmaco_ATC___not___starts_with) {
            this.farmaco_ATC___not___starts_with = farmaco_ATC___not___starts_with;
            return this;
        }

        public Builder setFarmaco_ATC___ends_with(String farmaco_ATC___ends_with) {
            this.farmaco_ATC___ends_with = farmaco_ATC___ends_with;
            return this;
        }

        public Builder setFarmaco_ATC___not___ends_with(String farmaco_ATC___not___ends_with) {
            this.farmaco_ATC___not___ends_with = farmaco_ATC___not___ends_with;
            return this;
        }

        public Builder setMotivazione_fine___eq(String motivazione_fine___eq) {
            this.motivazione_fine___eq = motivazione_fine___eq;
            return this;
        }

        public Builder setMotivazione_fine___ne(String motivazione_fine___ne) {
            this.motivazione_fine___ne = motivazione_fine___ne;
            return this;
        }

        public Builder setMotivazione_fine___null(Boolean motivazione_fine___null) {
            this.motivazione_fine___null = motivazione_fine___null;
            return this;
        }

        public Builder setMotivazione_fine___not___null(Boolean motivazione_fine___not___null) {
            this.motivazione_fine___not___null = motivazione_fine___not___null;
            return this;
        }

        public Builder setMotivazione_fine___in(java.util.List<String> motivazione_fine___in) {
            this.motivazione_fine___in = motivazione_fine___in;
            return this;
        }

        public Builder setMotivazione_fine___not___in(java.util.List<String> motivazione_fine___not___in) {
            this.motivazione_fine___not___in = motivazione_fine___not___in;
            return this;
        }

        public Builder setMotivazione_fine___lt(String motivazione_fine___lt) {
            this.motivazione_fine___lt = motivazione_fine___lt;
            return this;
        }

        public Builder setMotivazione_fine___lte(String motivazione_fine___lte) {
            this.motivazione_fine___lte = motivazione_fine___lte;
            return this;
        }

        public Builder setMotivazione_fine___gt(String motivazione_fine___gt) {
            this.motivazione_fine___gt = motivazione_fine___gt;
            return this;
        }

        public Builder setMotivazione_fine___gte(String motivazione_fine___gte) {
            this.motivazione_fine___gte = motivazione_fine___gte;
            return this;
        }

        public Builder setMotivazione_fine___contains(String motivazione_fine___contains) {
            this.motivazione_fine___contains = motivazione_fine___contains;
            return this;
        }

        public Builder setMotivazione_fine___not___contains(String motivazione_fine___not___contains) {
            this.motivazione_fine___not___contains = motivazione_fine___not___contains;
            return this;
        }

        public Builder setMotivazione_fine___starts_with(String motivazione_fine___starts_with) {
            this.motivazione_fine___starts_with = motivazione_fine___starts_with;
            return this;
        }

        public Builder setMotivazione_fine___not___starts_with(String motivazione_fine___not___starts_with) {
            this.motivazione_fine___not___starts_with = motivazione_fine___not___starts_with;
            return this;
        }

        public Builder setMotivazione_fine___ends_with(String motivazione_fine___ends_with) {
            this.motivazione_fine___ends_with = motivazione_fine___ends_with;
            return this;
        }

        public Builder setMotivazione_fine___not___ends_with(String motivazione_fine___not___ends_with) {
            this.motivazione_fine___not___ends_with = motivazione_fine___not___ends_with;
            return this;
        }

        public Builder setNome_farmaco___eq(String nome_farmaco___eq) {
            this.nome_farmaco___eq = nome_farmaco___eq;
            return this;
        }

        public Builder setNome_farmaco___ne(String nome_farmaco___ne) {
            this.nome_farmaco___ne = nome_farmaco___ne;
            return this;
        }

        public Builder setNome_farmaco___null(Boolean nome_farmaco___null) {
            this.nome_farmaco___null = nome_farmaco___null;
            return this;
        }

        public Builder setNome_farmaco___not___null(Boolean nome_farmaco___not___null) {
            this.nome_farmaco___not___null = nome_farmaco___not___null;
            return this;
        }

        public Builder setNome_farmaco___in(java.util.List<String> nome_farmaco___in) {
            this.nome_farmaco___in = nome_farmaco___in;
            return this;
        }

        public Builder setNome_farmaco___not___in(java.util.List<String> nome_farmaco___not___in) {
            this.nome_farmaco___not___in = nome_farmaco___not___in;
            return this;
        }

        public Builder setNome_farmaco___lt(String nome_farmaco___lt) {
            this.nome_farmaco___lt = nome_farmaco___lt;
            return this;
        }

        public Builder setNome_farmaco___lte(String nome_farmaco___lte) {
            this.nome_farmaco___lte = nome_farmaco___lte;
            return this;
        }

        public Builder setNome_farmaco___gt(String nome_farmaco___gt) {
            this.nome_farmaco___gt = nome_farmaco___gt;
            return this;
        }

        public Builder setNome_farmaco___gte(String nome_farmaco___gte) {
            this.nome_farmaco___gte = nome_farmaco___gte;
            return this;
        }

        public Builder setNome_farmaco___contains(String nome_farmaco___contains) {
            this.nome_farmaco___contains = nome_farmaco___contains;
            return this;
        }

        public Builder setNome_farmaco___not___contains(String nome_farmaco___not___contains) {
            this.nome_farmaco___not___contains = nome_farmaco___not___contains;
            return this;
        }

        public Builder setNome_farmaco___starts_with(String nome_farmaco___starts_with) {
            this.nome_farmaco___starts_with = nome_farmaco___starts_with;
            return this;
        }

        public Builder setNome_farmaco___not___starts_with(String nome_farmaco___not___starts_with) {
            this.nome_farmaco___not___starts_with = nome_farmaco___not___starts_with;
            return this;
        }

        public Builder setNome_farmaco___ends_with(String nome_farmaco___ends_with) {
            this.nome_farmaco___ends_with = nome_farmaco___ends_with;
            return this;
        }

        public Builder setNome_farmaco___not___ends_with(String nome_farmaco___not___ends_with) {
            this.nome_farmaco___not___ends_with = nome_farmaco___not___ends_with;
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

        public Builder setRicerca_farmaco___eq(String ricerca_farmaco___eq) {
            this.ricerca_farmaco___eq = ricerca_farmaco___eq;
            return this;
        }

        public Builder setRicerca_farmaco___ne(String ricerca_farmaco___ne) {
            this.ricerca_farmaco___ne = ricerca_farmaco___ne;
            return this;
        }

        public Builder setRicerca_farmaco___null(Boolean ricerca_farmaco___null) {
            this.ricerca_farmaco___null = ricerca_farmaco___null;
            return this;
        }

        public Builder setRicerca_farmaco___not___null(Boolean ricerca_farmaco___not___null) {
            this.ricerca_farmaco___not___null = ricerca_farmaco___not___null;
            return this;
        }

        public Builder setRicerca_farmaco___in(java.util.List<String> ricerca_farmaco___in) {
            this.ricerca_farmaco___in = ricerca_farmaco___in;
            return this;
        }

        public Builder setRicerca_farmaco___not___in(java.util.List<String> ricerca_farmaco___not___in) {
            this.ricerca_farmaco___not___in = ricerca_farmaco___not___in;
            return this;
        }

        public Builder setRicerca_farmaco___lt(String ricerca_farmaco___lt) {
            this.ricerca_farmaco___lt = ricerca_farmaco___lt;
            return this;
        }

        public Builder setRicerca_farmaco___lte(String ricerca_farmaco___lte) {
            this.ricerca_farmaco___lte = ricerca_farmaco___lte;
            return this;
        }

        public Builder setRicerca_farmaco___gt(String ricerca_farmaco___gt) {
            this.ricerca_farmaco___gt = ricerca_farmaco___gt;
            return this;
        }

        public Builder setRicerca_farmaco___gte(String ricerca_farmaco___gte) {
            this.ricerca_farmaco___gte = ricerca_farmaco___gte;
            return this;
        }

        public Builder setRicerca_farmaco___contains(String ricerca_farmaco___contains) {
            this.ricerca_farmaco___contains = ricerca_farmaco___contains;
            return this;
        }

        public Builder setRicerca_farmaco___not___contains(String ricerca_farmaco___not___contains) {
            this.ricerca_farmaco___not___contains = ricerca_farmaco___not___contains;
            return this;
        }

        public Builder setRicerca_farmaco___starts_with(String ricerca_farmaco___starts_with) {
            this.ricerca_farmaco___starts_with = ricerca_farmaco___starts_with;
            return this;
        }

        public Builder setRicerca_farmaco___not___starts_with(String ricerca_farmaco___not___starts_with) {
            this.ricerca_farmaco___not___starts_with = ricerca_farmaco___not___starts_with;
            return this;
        }

        public Builder setRicerca_farmaco___ends_with(String ricerca_farmaco___ends_with) {
            this.ricerca_farmaco___ends_with = ricerca_farmaco___ends_with;
            return this;
        }

        public Builder setRicerca_farmaco___not___ends_with(String ricerca_farmaco___not___ends_with) {
            this.ricerca_farmaco___not___ends_with = ricerca_farmaco___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliTerapia_altroFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliTerapia_altroFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliTerapia_altroFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliTerapia_altroFilterDTO build() {
            CliTerapia_altroFilterDTO result = new CliTerapia_altroFilterDTO();
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
            result.setAltra_motivazione_fine___eq(this.altra_motivazione_fine___eq);
            result.setAltra_motivazione_fine___ne(this.altra_motivazione_fine___ne);
            result.setAltra_motivazione_fine___null(this.altra_motivazione_fine___null);
            result.setAltra_motivazione_fine___not___null(this.altra_motivazione_fine___not___null);
            result.setAltra_motivazione_fine___in(this.altra_motivazione_fine___in);
            result.setAltra_motivazione_fine___not___in(this.altra_motivazione_fine___not___in);
            result.setAltra_motivazione_fine___lt(this.altra_motivazione_fine___lt);
            result.setAltra_motivazione_fine___lte(this.altra_motivazione_fine___lte);
            result.setAltra_motivazione_fine___gt(this.altra_motivazione_fine___gt);
            result.setAltra_motivazione_fine___gte(this.altra_motivazione_fine___gte);
            result.setAltra_motivazione_fine___contains(this.altra_motivazione_fine___contains);
            result.setAltra_motivazione_fine___not___contains(this.altra_motivazione_fine___not___contains);
            result.setAltra_motivazione_fine___starts_with(this.altra_motivazione_fine___starts_with);
            result.setAltra_motivazione_fine___not___starts_with(this.altra_motivazione_fine___not___starts_with);
            result.setAltra_motivazione_fine___ends_with(this.altra_motivazione_fine___ends_with);
            result.setAltra_motivazione_fine___not___ends_with(this.altra_motivazione_fine___not___ends_with);
            result.setAltro_farmaco___eq(this.altro_farmaco___eq);
            result.setAltro_farmaco___ne(this.altro_farmaco___ne);
            result.setAltro_farmaco___null(this.altro_farmaco___null);
            result.setAltro_farmaco___not___null(this.altro_farmaco___not___null);
            result.setAltro_farmaco___in(this.altro_farmaco___in);
            result.setAltro_farmaco___not___in(this.altro_farmaco___not___in);
            result.setAltro_farmaco___lt(this.altro_farmaco___lt);
            result.setAltro_farmaco___lte(this.altro_farmaco___lte);
            result.setAltro_farmaco___gt(this.altro_farmaco___gt);
            result.setAltro_farmaco___gte(this.altro_farmaco___gte);
            result.setAltro_farmaco___contains(this.altro_farmaco___contains);
            result.setAltro_farmaco___not___contains(this.altro_farmaco___not___contains);
            result.setAltro_farmaco___starts_with(this.altro_farmaco___starts_with);
            result.setAltro_farmaco___not___starts_with(this.altro_farmaco___not___starts_with);
            result.setAltro_farmaco___ends_with(this.altro_farmaco___ends_with);
            result.setAltro_farmaco___not___ends_with(this.altro_farmaco___not___ends_with);
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
            result.setCount_dosaggi___eq(this.count_dosaggi___eq);
            result.setCount_dosaggi___ne(this.count_dosaggi___ne);
            result.setCount_dosaggi___null(this.count_dosaggi___null);
            result.setCount_dosaggi___not___null(this.count_dosaggi___not___null);
            result.setCount_dosaggi___in(this.count_dosaggi___in);
            result.setCount_dosaggi___not___in(this.count_dosaggi___not___in);
            result.setCount_dosaggi___lt(this.count_dosaggi___lt);
            result.setCount_dosaggi___lte(this.count_dosaggi___lte);
            result.setCount_dosaggi___gt(this.count_dosaggi___gt);
            result.setCount_dosaggi___gte(this.count_dosaggi___gte);
            result.setData_fine___eq(this.data_fine___eq);
            result.setData_fine___ne(this.data_fine___ne);
            result.setData_fine___null(this.data_fine___null);
            result.setData_fine___not___null(this.data_fine___not___null);
            result.setData_fine___in(this.data_fine___in);
            result.setData_fine___not___in(this.data_fine___not___in);
            result.setData_fine___lt(this.data_fine___lt);
            result.setData_fine___lte(this.data_fine___lte);
            result.setData_fine___gt(this.data_fine___gt);
            result.setData_fine___gte(this.data_fine___gte);
            result.setData_inizio___eq(this.data_inizio___eq);
            result.setData_inizio___ne(this.data_inizio___ne);
            result.setData_inizio___null(this.data_inizio___null);
            result.setData_inizio___not___null(this.data_inizio___not___null);
            result.setData_inizio___in(this.data_inizio___in);
            result.setData_inizio___not___in(this.data_inizio___not___in);
            result.setData_inizio___lt(this.data_inizio___lt);
            result.setData_inizio___lte(this.data_inizio___lte);
            result.setData_inizio___gt(this.data_inizio___gt);
            result.setData_inizio___gte(this.data_inizio___gte);
            result.setDosaggio___eq(this.dosaggio___eq);
            result.setDosaggio___ne(this.dosaggio___ne);
            result.setDosaggio___null(this.dosaggio___null);
            result.setDosaggio___not___null(this.dosaggio___not___null);
            result.setDosaggio___in(this.dosaggio___in);
            result.setDosaggio___not___in(this.dosaggio___not___in);
            result.setDosaggio___lt(this.dosaggio___lt);
            result.setDosaggio___lte(this.dosaggio___lte);
            result.setDosaggio___gt(this.dosaggio___gt);
            result.setDosaggio___gte(this.dosaggio___gte);
            result.setDosaggio___contains(this.dosaggio___contains);
            result.setDosaggio___not___contains(this.dosaggio___not___contains);
            result.setDosaggio___starts_with(this.dosaggio___starts_with);
            result.setDosaggio___not___starts_with(this.dosaggio___not___starts_with);
            result.setDosaggio___ends_with(this.dosaggio___ends_with);
            result.setDosaggio___not___ends_with(this.dosaggio___not___ends_with);
            result.setEpatica___eq(this.epatica___eq);
            result.setEpatica___ne(this.epatica___ne);
            result.setEpatica___null(this.epatica___null);
            result.setEpatica___not___null(this.epatica___not___null);
            result.setFarmaco_ATC___eq(this.farmaco_ATC___eq);
            result.setFarmaco_ATC___ne(this.farmaco_ATC___ne);
            result.setFarmaco_ATC___null(this.farmaco_ATC___null);
            result.setFarmaco_ATC___not___null(this.farmaco_ATC___not___null);
            result.setFarmaco_ATC___in(this.farmaco_ATC___in);
            result.setFarmaco_ATC___not___in(this.farmaco_ATC___not___in);
            result.setFarmaco_ATC___lt(this.farmaco_ATC___lt);
            result.setFarmaco_ATC___lte(this.farmaco_ATC___lte);
            result.setFarmaco_ATC___gt(this.farmaco_ATC___gt);
            result.setFarmaco_ATC___gte(this.farmaco_ATC___gte);
            result.setFarmaco_ATC___contains(this.farmaco_ATC___contains);
            result.setFarmaco_ATC___not___contains(this.farmaco_ATC___not___contains);
            result.setFarmaco_ATC___starts_with(this.farmaco_ATC___starts_with);
            result.setFarmaco_ATC___not___starts_with(this.farmaco_ATC___not___starts_with);
            result.setFarmaco_ATC___ends_with(this.farmaco_ATC___ends_with);
            result.setFarmaco_ATC___not___ends_with(this.farmaco_ATC___not___ends_with);
            result.setMotivazione_fine___eq(this.motivazione_fine___eq);
            result.setMotivazione_fine___ne(this.motivazione_fine___ne);
            result.setMotivazione_fine___null(this.motivazione_fine___null);
            result.setMotivazione_fine___not___null(this.motivazione_fine___not___null);
            result.setMotivazione_fine___in(this.motivazione_fine___in);
            result.setMotivazione_fine___not___in(this.motivazione_fine___not___in);
            result.setMotivazione_fine___lt(this.motivazione_fine___lt);
            result.setMotivazione_fine___lte(this.motivazione_fine___lte);
            result.setMotivazione_fine___gt(this.motivazione_fine___gt);
            result.setMotivazione_fine___gte(this.motivazione_fine___gte);
            result.setMotivazione_fine___contains(this.motivazione_fine___contains);
            result.setMotivazione_fine___not___contains(this.motivazione_fine___not___contains);
            result.setMotivazione_fine___starts_with(this.motivazione_fine___starts_with);
            result.setMotivazione_fine___not___starts_with(this.motivazione_fine___not___starts_with);
            result.setMotivazione_fine___ends_with(this.motivazione_fine___ends_with);
            result.setMotivazione_fine___not___ends_with(this.motivazione_fine___not___ends_with);
            result.setNome_farmaco___eq(this.nome_farmaco___eq);
            result.setNome_farmaco___ne(this.nome_farmaco___ne);
            result.setNome_farmaco___null(this.nome_farmaco___null);
            result.setNome_farmaco___not___null(this.nome_farmaco___not___null);
            result.setNome_farmaco___in(this.nome_farmaco___in);
            result.setNome_farmaco___not___in(this.nome_farmaco___not___in);
            result.setNome_farmaco___lt(this.nome_farmaco___lt);
            result.setNome_farmaco___lte(this.nome_farmaco___lte);
            result.setNome_farmaco___gt(this.nome_farmaco___gt);
            result.setNome_farmaco___gte(this.nome_farmaco___gte);
            result.setNome_farmaco___contains(this.nome_farmaco___contains);
            result.setNome_farmaco___not___contains(this.nome_farmaco___not___contains);
            result.setNome_farmaco___starts_with(this.nome_farmaco___starts_with);
            result.setNome_farmaco___not___starts_with(this.nome_farmaco___not___starts_with);
            result.setNome_farmaco___ends_with(this.nome_farmaco___ends_with);
            result.setNome_farmaco___not___ends_with(this.nome_farmaco___not___ends_with);
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
            result.setRicerca_farmaco___eq(this.ricerca_farmaco___eq);
            result.setRicerca_farmaco___ne(this.ricerca_farmaco___ne);
            result.setRicerca_farmaco___null(this.ricerca_farmaco___null);
            result.setRicerca_farmaco___not___null(this.ricerca_farmaco___not___null);
            result.setRicerca_farmaco___in(this.ricerca_farmaco___in);
            result.setRicerca_farmaco___not___in(this.ricerca_farmaco___not___in);
            result.setRicerca_farmaco___lt(this.ricerca_farmaco___lt);
            result.setRicerca_farmaco___lte(this.ricerca_farmaco___lte);
            result.setRicerca_farmaco___gt(this.ricerca_farmaco___gt);
            result.setRicerca_farmaco___gte(this.ricerca_farmaco___gte);
            result.setRicerca_farmaco___contains(this.ricerca_farmaco___contains);
            result.setRicerca_farmaco___not___contains(this.ricerca_farmaco___not___contains);
            result.setRicerca_farmaco___starts_with(this.ricerca_farmaco___starts_with);
            result.setRicerca_farmaco___not___starts_with(this.ricerca_farmaco___not___starts_with);
            result.setRicerca_farmaco___ends_with(this.ricerca_farmaco___ends_with);
            result.setRicerca_farmaco___not___ends_with(this.ricerca_farmaco___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
