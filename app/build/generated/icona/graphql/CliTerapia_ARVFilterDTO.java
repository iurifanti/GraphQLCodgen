package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Terapia_ARV.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTerapia_ARVFilterDTO implements java.io.Serializable {

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
    private String altro_inizio_terapia___eq;
    private String altro_inizio_terapia___ne;
    private Boolean altro_inizio_terapia___null;
    private Boolean altro_inizio_terapia___not___null;
    private java.util.List<String> altro_inizio_terapia___in;
    private java.util.List<String> altro_inizio_terapia___not___in;
    private String altro_inizio_terapia___lt;
    private String altro_inizio_terapia___lte;
    private String altro_inizio_terapia___gt;
    private String altro_inizio_terapia___gte;
    private String altro_inizio_terapia___contains;
    private String altro_inizio_terapia___not___contains;
    private String altro_inizio_terapia___starts_with;
    private String altro_inizio_terapia___not___starts_with;
    private String altro_inizio_terapia___ends_with;
    private String altro_inizio_terapia___not___ends_with;
    private String altro_variazione_terapia___eq;
    private String altro_variazione_terapia___ne;
    private Boolean altro_variazione_terapia___null;
    private Boolean altro_variazione_terapia___not___null;
    private java.util.List<String> altro_variazione_terapia___in;
    private java.util.List<String> altro_variazione_terapia___not___in;
    private String altro_variazione_terapia___lt;
    private String altro_variazione_terapia___lte;
    private String altro_variazione_terapia___gt;
    private String altro_variazione_terapia___gte;
    private String altro_variazione_terapia___contains;
    private String altro_variazione_terapia___not___contains;
    private String altro_variazione_terapia___starts_with;
    private String altro_variazione_terapia___not___starts_with;
    private String altro_variazione_terapia___ends_with;
    private String altro_variazione_terapia___not___ends_with;
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
    private String booster___eq;
    private String booster___ne;
    private Boolean booster___null;
    private Boolean booster___not___null;
    private java.util.List<String> booster___in;
    private java.util.List<String> booster___not___in;
    private String booster___lt;
    private String booster___lte;
    private String booster___gt;
    private String booster___gte;
    private String booster___contains;
    private String booster___not___contains;
    private String booster___starts_with;
    private String booster___not___starts_with;
    private String booster___ends_with;
    private String booster___not___ends_with;
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
    private Boolean disponibile_generico___eq;
    private Boolean disponibile_generico___ne;
    private Boolean disponibile_generico___null;
    private Boolean disponibile_generico___not___null;
    private Boolean doppio_cieco___eq;
    private Boolean doppio_cieco___ne;
    private Boolean doppio_cieco___null;
    private Boolean doppio_cieco___not___null;
    private Integer dosaggi_count___eq;
    private Integer dosaggi_count___ne;
    private Boolean dosaggi_count___null;
    private Boolean dosaggi_count___not___null;
    private java.util.List<Integer> dosaggi_count___in;
    private java.util.List<Integer> dosaggi_count___not___in;
    private Integer dosaggi_count___lt;
    private Integer dosaggi_count___lte;
    private Integer dosaggi_count___gt;
    private Integer dosaggi_count___gte;
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
    private String filtro_farmaco___eq;
    private String filtro_farmaco___ne;
    private Boolean filtro_farmaco___null;
    private Boolean filtro_farmaco___not___null;
    private java.util.List<String> filtro_farmaco___in;
    private java.util.List<String> filtro_farmaco___not___in;
    private String filtro_farmaco___lt;
    private String filtro_farmaco___lte;
    private String filtro_farmaco___gt;
    private String filtro_farmaco___gte;
    private String filtro_farmaco___contains;
    private String filtro_farmaco___not___contains;
    private String filtro_farmaco___starts_with;
    private String filtro_farmaco___not___starts_with;
    private String filtro_farmaco___ends_with;
    private String filtro_farmaco___not___ends_with;
    private String generico___eq;
    private String generico___ne;
    private Boolean generico___null;
    private Boolean generico___not___null;
    private java.util.List<String> generico___in;
    private java.util.List<String> generico___not___in;
    private String generico___lt;
    private String generico___lte;
    private String generico___gt;
    private String generico___gte;
    private String generico___contains;
    private String generico___not___contains;
    private String generico___starts_with;
    private String generico___not___starts_with;
    private String generico___ends_with;
    private String generico___not___ends_with;
    private String genotipo_guidata___eq;
    private String genotipo_guidata___ne;
    private Boolean genotipo_guidata___null;
    private Boolean genotipo_guidata___not___null;
    private java.util.List<String> genotipo_guidata___in;
    private java.util.List<String> genotipo_guidata___not___in;
    private String genotipo_guidata___lt;
    private String genotipo_guidata___lte;
    private String genotipo_guidata___gt;
    private String genotipo_guidata___gte;
    private String genotipo_guidata___contains;
    private String genotipo_guidata___not___contains;
    private String genotipo_guidata___starts_with;
    private String genotipo_guidata___not___starts_with;
    private String genotipo_guidata___ends_with;
    private String genotipo_guidata___not___ends_with;
    private Boolean long_acting___eq;
    private Boolean long_acting___ne;
    private Boolean long_acting___null;
    private Boolean long_acting___not___null;
    private String motivazione_fine_ARV_princ____eq;
    private String motivazione_fine_ARV_princ____ne;
    private Boolean motivazione_fine_ARV_princ____null;
    private Boolean motivazione_fine_ARV_princ____not___null;
    private java.util.List<String> motivazione_fine_ARV_princ____in;
    private java.util.List<String> motivazione_fine_ARV_princ____not___in;
    private String motivazione_fine_ARV_princ____lt;
    private String motivazione_fine_ARV_princ____lte;
    private String motivazione_fine_ARV_princ____gt;
    private String motivazione_fine_ARV_princ____gte;
    private String motivazione_fine_ARV_princ____contains;
    private String motivazione_fine_ARV_princ____not___contains;
    private String motivazione_fine_ARV_princ____starts_with;
    private String motivazione_fine_ARV_princ____not___starts_with;
    private String motivazione_fine_ARV_princ____ends_with;
    private String motivazione_fine_ARV_princ____not___ends_with;
    private String motivazione_fine_ARV_sec____eq;
    private String motivazione_fine_ARV_sec____ne;
    private Boolean motivazione_fine_ARV_sec____null;
    private Boolean motivazione_fine_ARV_sec____not___null;
    private java.util.List<String> motivazione_fine_ARV_sec____in;
    private java.util.List<String> motivazione_fine_ARV_sec____not___in;
    private String motivazione_fine_ARV_sec____lt;
    private String motivazione_fine_ARV_sec____lte;
    private String motivazione_fine_ARV_sec____gt;
    private String motivazione_fine_ARV_sec____gte;
    private String motivazione_fine_ARV_sec____contains;
    private String motivazione_fine_ARV_sec____not___contains;
    private String motivazione_fine_ARV_sec____starts_with;
    private String motivazione_fine_ARV_sec____not___starts_with;
    private String motivazione_fine_ARV_sec____ends_with;
    private String motivazione_fine_ARV_sec____not___ends_with;
    private String motivazione_inizio_ARV____eq;
    private String motivazione_inizio_ARV____ne;
    private Boolean motivazione_inizio_ARV____null;
    private Boolean motivazione_inizio_ARV____not___null;
    private java.util.List<String> motivazione_inizio_ARV____in;
    private java.util.List<String> motivazione_inizio_ARV____not___in;
    private String motivazione_inizio_ARV____lt;
    private String motivazione_inizio_ARV____lte;
    private String motivazione_inizio_ARV____gt;
    private String motivazione_inizio_ARV____gte;
    private String motivazione_inizio_ARV____contains;
    private String motivazione_inizio_ARV____not___contains;
    private String motivazione_inizio_ARV____starts_with;
    private String motivazione_inizio_ARV____not___starts_with;
    private String motivazione_inizio_ARV____ends_with;
    private String motivazione_inizio_ARV____not___ends_with;
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
    private String nome_trial___eq;
    private String nome_trial___ne;
    private Boolean nome_trial___null;
    private Boolean nome_trial___not___null;
    private java.util.List<String> nome_trial___in;
    private java.util.List<String> nome_trial___not___in;
    private String nome_trial___lt;
    private String nome_trial___lte;
    private String nome_trial___gt;
    private String nome_trial___gte;
    private String nome_trial___contains;
    private String nome_trial___not___contains;
    private String nome_trial___starts_with;
    private String nome_trial___not___starts_with;
    private String nome_trial___ends_with;
    private String nome_trial___not___ends_with;
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
    private String once___eq;
    private String once___ne;
    private Boolean once___null;
    private Boolean once___not___null;
    private java.util.List<String> once___in;
    private java.util.List<String> once___not___in;
    private String once___lt;
    private String once___lte;
    private String once___gt;
    private String once___gte;
    private String once___contains;
    private String once___not___contains;
    private String once___starts_with;
    private String once___not___starts_with;
    private String once___ends_with;
    private String once___not___ends_with;
    private String user_team___eq;
    private String user_team___ne;
    private Boolean user_team___null;
    private Boolean user_team___not___null;
    private java.util.List<String> user_team___in;
    private java.util.List<String> user_team___not___in;
    private String user_team___lt;
    private String user_team___lte;
    private String user_team___gt;
    private String user_team___gte;
    private String user_team___contains;
    private String user_team___not___contains;
    private String user_team___starts_with;
    private String user_team___not___starts_with;
    private String user_team___ends_with;
    private String user_team___not___ends_with;
    private java.util.List<CliTerapia_ARVFilterDTO> AND;
    private java.util.List<CliTerapia_ARVFilterDTO> OR;
    private CliTerapia_ARVFilterDTO NOT;

    public CliTerapia_ARVFilterDTO() {
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

    public String getAltro_inizio_terapia___eq() {
        return altro_inizio_terapia___eq;
    }
    public void setAltro_inizio_terapia___eq(String altro_inizio_terapia___eq) {
        this.altro_inizio_terapia___eq = altro_inizio_terapia___eq;
    }

    public String getAltro_inizio_terapia___ne() {
        return altro_inizio_terapia___ne;
    }
    public void setAltro_inizio_terapia___ne(String altro_inizio_terapia___ne) {
        this.altro_inizio_terapia___ne = altro_inizio_terapia___ne;
    }

    public Boolean getAltro_inizio_terapia___null() {
        return altro_inizio_terapia___null;
    }
    public void setAltro_inizio_terapia___null(Boolean altro_inizio_terapia___null) {
        this.altro_inizio_terapia___null = altro_inizio_terapia___null;
    }

    public Boolean getAltro_inizio_terapia___not___null() {
        return altro_inizio_terapia___not___null;
    }
    public void setAltro_inizio_terapia___not___null(Boolean altro_inizio_terapia___not___null) {
        this.altro_inizio_terapia___not___null = altro_inizio_terapia___not___null;
    }

    public java.util.List<String> getAltro_inizio_terapia___in() {
        return altro_inizio_terapia___in;
    }
    public void setAltro_inizio_terapia___in(java.util.List<String> altro_inizio_terapia___in) {
        this.altro_inizio_terapia___in = altro_inizio_terapia___in;
    }

    public java.util.List<String> getAltro_inizio_terapia___not___in() {
        return altro_inizio_terapia___not___in;
    }
    public void setAltro_inizio_terapia___not___in(java.util.List<String> altro_inizio_terapia___not___in) {
        this.altro_inizio_terapia___not___in = altro_inizio_terapia___not___in;
    }

    public String getAltro_inizio_terapia___lt() {
        return altro_inizio_terapia___lt;
    }
    public void setAltro_inizio_terapia___lt(String altro_inizio_terapia___lt) {
        this.altro_inizio_terapia___lt = altro_inizio_terapia___lt;
    }

    public String getAltro_inizio_terapia___lte() {
        return altro_inizio_terapia___lte;
    }
    public void setAltro_inizio_terapia___lte(String altro_inizio_terapia___lte) {
        this.altro_inizio_terapia___lte = altro_inizio_terapia___lte;
    }

    public String getAltro_inizio_terapia___gt() {
        return altro_inizio_terapia___gt;
    }
    public void setAltro_inizio_terapia___gt(String altro_inizio_terapia___gt) {
        this.altro_inizio_terapia___gt = altro_inizio_terapia___gt;
    }

    public String getAltro_inizio_terapia___gte() {
        return altro_inizio_terapia___gte;
    }
    public void setAltro_inizio_terapia___gte(String altro_inizio_terapia___gte) {
        this.altro_inizio_terapia___gte = altro_inizio_terapia___gte;
    }

    public String getAltro_inizio_terapia___contains() {
        return altro_inizio_terapia___contains;
    }
    public void setAltro_inizio_terapia___contains(String altro_inizio_terapia___contains) {
        this.altro_inizio_terapia___contains = altro_inizio_terapia___contains;
    }

    public String getAltro_inizio_terapia___not___contains() {
        return altro_inizio_terapia___not___contains;
    }
    public void setAltro_inizio_terapia___not___contains(String altro_inizio_terapia___not___contains) {
        this.altro_inizio_terapia___not___contains = altro_inizio_terapia___not___contains;
    }

    public String getAltro_inizio_terapia___starts_with() {
        return altro_inizio_terapia___starts_with;
    }
    public void setAltro_inizio_terapia___starts_with(String altro_inizio_terapia___starts_with) {
        this.altro_inizio_terapia___starts_with = altro_inizio_terapia___starts_with;
    }

    public String getAltro_inizio_terapia___not___starts_with() {
        return altro_inizio_terapia___not___starts_with;
    }
    public void setAltro_inizio_terapia___not___starts_with(String altro_inizio_terapia___not___starts_with) {
        this.altro_inizio_terapia___not___starts_with = altro_inizio_terapia___not___starts_with;
    }

    public String getAltro_inizio_terapia___ends_with() {
        return altro_inizio_terapia___ends_with;
    }
    public void setAltro_inizio_terapia___ends_with(String altro_inizio_terapia___ends_with) {
        this.altro_inizio_terapia___ends_with = altro_inizio_terapia___ends_with;
    }

    public String getAltro_inizio_terapia___not___ends_with() {
        return altro_inizio_terapia___not___ends_with;
    }
    public void setAltro_inizio_terapia___not___ends_with(String altro_inizio_terapia___not___ends_with) {
        this.altro_inizio_terapia___not___ends_with = altro_inizio_terapia___not___ends_with;
    }

    public String getAltro_variazione_terapia___eq() {
        return altro_variazione_terapia___eq;
    }
    public void setAltro_variazione_terapia___eq(String altro_variazione_terapia___eq) {
        this.altro_variazione_terapia___eq = altro_variazione_terapia___eq;
    }

    public String getAltro_variazione_terapia___ne() {
        return altro_variazione_terapia___ne;
    }
    public void setAltro_variazione_terapia___ne(String altro_variazione_terapia___ne) {
        this.altro_variazione_terapia___ne = altro_variazione_terapia___ne;
    }

    public Boolean getAltro_variazione_terapia___null() {
        return altro_variazione_terapia___null;
    }
    public void setAltro_variazione_terapia___null(Boolean altro_variazione_terapia___null) {
        this.altro_variazione_terapia___null = altro_variazione_terapia___null;
    }

    public Boolean getAltro_variazione_terapia___not___null() {
        return altro_variazione_terapia___not___null;
    }
    public void setAltro_variazione_terapia___not___null(Boolean altro_variazione_terapia___not___null) {
        this.altro_variazione_terapia___not___null = altro_variazione_terapia___not___null;
    }

    public java.util.List<String> getAltro_variazione_terapia___in() {
        return altro_variazione_terapia___in;
    }
    public void setAltro_variazione_terapia___in(java.util.List<String> altro_variazione_terapia___in) {
        this.altro_variazione_terapia___in = altro_variazione_terapia___in;
    }

    public java.util.List<String> getAltro_variazione_terapia___not___in() {
        return altro_variazione_terapia___not___in;
    }
    public void setAltro_variazione_terapia___not___in(java.util.List<String> altro_variazione_terapia___not___in) {
        this.altro_variazione_terapia___not___in = altro_variazione_terapia___not___in;
    }

    public String getAltro_variazione_terapia___lt() {
        return altro_variazione_terapia___lt;
    }
    public void setAltro_variazione_terapia___lt(String altro_variazione_terapia___lt) {
        this.altro_variazione_terapia___lt = altro_variazione_terapia___lt;
    }

    public String getAltro_variazione_terapia___lte() {
        return altro_variazione_terapia___lte;
    }
    public void setAltro_variazione_terapia___lte(String altro_variazione_terapia___lte) {
        this.altro_variazione_terapia___lte = altro_variazione_terapia___lte;
    }

    public String getAltro_variazione_terapia___gt() {
        return altro_variazione_terapia___gt;
    }
    public void setAltro_variazione_terapia___gt(String altro_variazione_terapia___gt) {
        this.altro_variazione_terapia___gt = altro_variazione_terapia___gt;
    }

    public String getAltro_variazione_terapia___gte() {
        return altro_variazione_terapia___gte;
    }
    public void setAltro_variazione_terapia___gte(String altro_variazione_terapia___gte) {
        this.altro_variazione_terapia___gte = altro_variazione_terapia___gte;
    }

    public String getAltro_variazione_terapia___contains() {
        return altro_variazione_terapia___contains;
    }
    public void setAltro_variazione_terapia___contains(String altro_variazione_terapia___contains) {
        this.altro_variazione_terapia___contains = altro_variazione_terapia___contains;
    }

    public String getAltro_variazione_terapia___not___contains() {
        return altro_variazione_terapia___not___contains;
    }
    public void setAltro_variazione_terapia___not___contains(String altro_variazione_terapia___not___contains) {
        this.altro_variazione_terapia___not___contains = altro_variazione_terapia___not___contains;
    }

    public String getAltro_variazione_terapia___starts_with() {
        return altro_variazione_terapia___starts_with;
    }
    public void setAltro_variazione_terapia___starts_with(String altro_variazione_terapia___starts_with) {
        this.altro_variazione_terapia___starts_with = altro_variazione_terapia___starts_with;
    }

    public String getAltro_variazione_terapia___not___starts_with() {
        return altro_variazione_terapia___not___starts_with;
    }
    public void setAltro_variazione_terapia___not___starts_with(String altro_variazione_terapia___not___starts_with) {
        this.altro_variazione_terapia___not___starts_with = altro_variazione_terapia___not___starts_with;
    }

    public String getAltro_variazione_terapia___ends_with() {
        return altro_variazione_terapia___ends_with;
    }
    public void setAltro_variazione_terapia___ends_with(String altro_variazione_terapia___ends_with) {
        this.altro_variazione_terapia___ends_with = altro_variazione_terapia___ends_with;
    }

    public String getAltro_variazione_terapia___not___ends_with() {
        return altro_variazione_terapia___not___ends_with;
    }
    public void setAltro_variazione_terapia___not___ends_with(String altro_variazione_terapia___not___ends_with) {
        this.altro_variazione_terapia___not___ends_with = altro_variazione_terapia___not___ends_with;
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

    public String getBooster___eq() {
        return booster___eq;
    }
    public void setBooster___eq(String booster___eq) {
        this.booster___eq = booster___eq;
    }

    public String getBooster___ne() {
        return booster___ne;
    }
    public void setBooster___ne(String booster___ne) {
        this.booster___ne = booster___ne;
    }

    public Boolean getBooster___null() {
        return booster___null;
    }
    public void setBooster___null(Boolean booster___null) {
        this.booster___null = booster___null;
    }

    public Boolean getBooster___not___null() {
        return booster___not___null;
    }
    public void setBooster___not___null(Boolean booster___not___null) {
        this.booster___not___null = booster___not___null;
    }

    public java.util.List<String> getBooster___in() {
        return booster___in;
    }
    public void setBooster___in(java.util.List<String> booster___in) {
        this.booster___in = booster___in;
    }

    public java.util.List<String> getBooster___not___in() {
        return booster___not___in;
    }
    public void setBooster___not___in(java.util.List<String> booster___not___in) {
        this.booster___not___in = booster___not___in;
    }

    public String getBooster___lt() {
        return booster___lt;
    }
    public void setBooster___lt(String booster___lt) {
        this.booster___lt = booster___lt;
    }

    public String getBooster___lte() {
        return booster___lte;
    }
    public void setBooster___lte(String booster___lte) {
        this.booster___lte = booster___lte;
    }

    public String getBooster___gt() {
        return booster___gt;
    }
    public void setBooster___gt(String booster___gt) {
        this.booster___gt = booster___gt;
    }

    public String getBooster___gte() {
        return booster___gte;
    }
    public void setBooster___gte(String booster___gte) {
        this.booster___gte = booster___gte;
    }

    public String getBooster___contains() {
        return booster___contains;
    }
    public void setBooster___contains(String booster___contains) {
        this.booster___contains = booster___contains;
    }

    public String getBooster___not___contains() {
        return booster___not___contains;
    }
    public void setBooster___not___contains(String booster___not___contains) {
        this.booster___not___contains = booster___not___contains;
    }

    public String getBooster___starts_with() {
        return booster___starts_with;
    }
    public void setBooster___starts_with(String booster___starts_with) {
        this.booster___starts_with = booster___starts_with;
    }

    public String getBooster___not___starts_with() {
        return booster___not___starts_with;
    }
    public void setBooster___not___starts_with(String booster___not___starts_with) {
        this.booster___not___starts_with = booster___not___starts_with;
    }

    public String getBooster___ends_with() {
        return booster___ends_with;
    }
    public void setBooster___ends_with(String booster___ends_with) {
        this.booster___ends_with = booster___ends_with;
    }

    public String getBooster___not___ends_with() {
        return booster___not___ends_with;
    }
    public void setBooster___not___ends_with(String booster___not___ends_with) {
        this.booster___not___ends_with = booster___not___ends_with;
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

    public Boolean getDisponibile_generico___eq() {
        return disponibile_generico___eq;
    }
    public void setDisponibile_generico___eq(Boolean disponibile_generico___eq) {
        this.disponibile_generico___eq = disponibile_generico___eq;
    }

    public Boolean getDisponibile_generico___ne() {
        return disponibile_generico___ne;
    }
    public void setDisponibile_generico___ne(Boolean disponibile_generico___ne) {
        this.disponibile_generico___ne = disponibile_generico___ne;
    }

    public Boolean getDisponibile_generico___null() {
        return disponibile_generico___null;
    }
    public void setDisponibile_generico___null(Boolean disponibile_generico___null) {
        this.disponibile_generico___null = disponibile_generico___null;
    }

    public Boolean getDisponibile_generico___not___null() {
        return disponibile_generico___not___null;
    }
    public void setDisponibile_generico___not___null(Boolean disponibile_generico___not___null) {
        this.disponibile_generico___not___null = disponibile_generico___not___null;
    }

    public Boolean getDoppio_cieco___eq() {
        return doppio_cieco___eq;
    }
    public void setDoppio_cieco___eq(Boolean doppio_cieco___eq) {
        this.doppio_cieco___eq = doppio_cieco___eq;
    }

    public Boolean getDoppio_cieco___ne() {
        return doppio_cieco___ne;
    }
    public void setDoppio_cieco___ne(Boolean doppio_cieco___ne) {
        this.doppio_cieco___ne = doppio_cieco___ne;
    }

    public Boolean getDoppio_cieco___null() {
        return doppio_cieco___null;
    }
    public void setDoppio_cieco___null(Boolean doppio_cieco___null) {
        this.doppio_cieco___null = doppio_cieco___null;
    }

    public Boolean getDoppio_cieco___not___null() {
        return doppio_cieco___not___null;
    }
    public void setDoppio_cieco___not___null(Boolean doppio_cieco___not___null) {
        this.doppio_cieco___not___null = doppio_cieco___not___null;
    }

    public Integer getDosaggi_count___eq() {
        return dosaggi_count___eq;
    }
    public void setDosaggi_count___eq(Integer dosaggi_count___eq) {
        this.dosaggi_count___eq = dosaggi_count___eq;
    }

    public Integer getDosaggi_count___ne() {
        return dosaggi_count___ne;
    }
    public void setDosaggi_count___ne(Integer dosaggi_count___ne) {
        this.dosaggi_count___ne = dosaggi_count___ne;
    }

    public Boolean getDosaggi_count___null() {
        return dosaggi_count___null;
    }
    public void setDosaggi_count___null(Boolean dosaggi_count___null) {
        this.dosaggi_count___null = dosaggi_count___null;
    }

    public Boolean getDosaggi_count___not___null() {
        return dosaggi_count___not___null;
    }
    public void setDosaggi_count___not___null(Boolean dosaggi_count___not___null) {
        this.dosaggi_count___not___null = dosaggi_count___not___null;
    }

    public java.util.List<Integer> getDosaggi_count___in() {
        return dosaggi_count___in;
    }
    public void setDosaggi_count___in(java.util.List<Integer> dosaggi_count___in) {
        this.dosaggi_count___in = dosaggi_count___in;
    }

    public java.util.List<Integer> getDosaggi_count___not___in() {
        return dosaggi_count___not___in;
    }
    public void setDosaggi_count___not___in(java.util.List<Integer> dosaggi_count___not___in) {
        this.dosaggi_count___not___in = dosaggi_count___not___in;
    }

    public Integer getDosaggi_count___lt() {
        return dosaggi_count___lt;
    }
    public void setDosaggi_count___lt(Integer dosaggi_count___lt) {
        this.dosaggi_count___lt = dosaggi_count___lt;
    }

    public Integer getDosaggi_count___lte() {
        return dosaggi_count___lte;
    }
    public void setDosaggi_count___lte(Integer dosaggi_count___lte) {
        this.dosaggi_count___lte = dosaggi_count___lte;
    }

    public Integer getDosaggi_count___gt() {
        return dosaggi_count___gt;
    }
    public void setDosaggi_count___gt(Integer dosaggi_count___gt) {
        this.dosaggi_count___gt = dosaggi_count___gt;
    }

    public Integer getDosaggi_count___gte() {
        return dosaggi_count___gte;
    }
    public void setDosaggi_count___gte(Integer dosaggi_count___gte) {
        this.dosaggi_count___gte = dosaggi_count___gte;
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

    public String getFiltro_farmaco___eq() {
        return filtro_farmaco___eq;
    }
    public void setFiltro_farmaco___eq(String filtro_farmaco___eq) {
        this.filtro_farmaco___eq = filtro_farmaco___eq;
    }

    public String getFiltro_farmaco___ne() {
        return filtro_farmaco___ne;
    }
    public void setFiltro_farmaco___ne(String filtro_farmaco___ne) {
        this.filtro_farmaco___ne = filtro_farmaco___ne;
    }

    public Boolean getFiltro_farmaco___null() {
        return filtro_farmaco___null;
    }
    public void setFiltro_farmaco___null(Boolean filtro_farmaco___null) {
        this.filtro_farmaco___null = filtro_farmaco___null;
    }

    public Boolean getFiltro_farmaco___not___null() {
        return filtro_farmaco___not___null;
    }
    public void setFiltro_farmaco___not___null(Boolean filtro_farmaco___not___null) {
        this.filtro_farmaco___not___null = filtro_farmaco___not___null;
    }

    public java.util.List<String> getFiltro_farmaco___in() {
        return filtro_farmaco___in;
    }
    public void setFiltro_farmaco___in(java.util.List<String> filtro_farmaco___in) {
        this.filtro_farmaco___in = filtro_farmaco___in;
    }

    public java.util.List<String> getFiltro_farmaco___not___in() {
        return filtro_farmaco___not___in;
    }
    public void setFiltro_farmaco___not___in(java.util.List<String> filtro_farmaco___not___in) {
        this.filtro_farmaco___not___in = filtro_farmaco___not___in;
    }

    public String getFiltro_farmaco___lt() {
        return filtro_farmaco___lt;
    }
    public void setFiltro_farmaco___lt(String filtro_farmaco___lt) {
        this.filtro_farmaco___lt = filtro_farmaco___lt;
    }

    public String getFiltro_farmaco___lte() {
        return filtro_farmaco___lte;
    }
    public void setFiltro_farmaco___lte(String filtro_farmaco___lte) {
        this.filtro_farmaco___lte = filtro_farmaco___lte;
    }

    public String getFiltro_farmaco___gt() {
        return filtro_farmaco___gt;
    }
    public void setFiltro_farmaco___gt(String filtro_farmaco___gt) {
        this.filtro_farmaco___gt = filtro_farmaco___gt;
    }

    public String getFiltro_farmaco___gte() {
        return filtro_farmaco___gte;
    }
    public void setFiltro_farmaco___gte(String filtro_farmaco___gte) {
        this.filtro_farmaco___gte = filtro_farmaco___gte;
    }

    public String getFiltro_farmaco___contains() {
        return filtro_farmaco___contains;
    }
    public void setFiltro_farmaco___contains(String filtro_farmaco___contains) {
        this.filtro_farmaco___contains = filtro_farmaco___contains;
    }

    public String getFiltro_farmaco___not___contains() {
        return filtro_farmaco___not___contains;
    }
    public void setFiltro_farmaco___not___contains(String filtro_farmaco___not___contains) {
        this.filtro_farmaco___not___contains = filtro_farmaco___not___contains;
    }

    public String getFiltro_farmaco___starts_with() {
        return filtro_farmaco___starts_with;
    }
    public void setFiltro_farmaco___starts_with(String filtro_farmaco___starts_with) {
        this.filtro_farmaco___starts_with = filtro_farmaco___starts_with;
    }

    public String getFiltro_farmaco___not___starts_with() {
        return filtro_farmaco___not___starts_with;
    }
    public void setFiltro_farmaco___not___starts_with(String filtro_farmaco___not___starts_with) {
        this.filtro_farmaco___not___starts_with = filtro_farmaco___not___starts_with;
    }

    public String getFiltro_farmaco___ends_with() {
        return filtro_farmaco___ends_with;
    }
    public void setFiltro_farmaco___ends_with(String filtro_farmaco___ends_with) {
        this.filtro_farmaco___ends_with = filtro_farmaco___ends_with;
    }

    public String getFiltro_farmaco___not___ends_with() {
        return filtro_farmaco___not___ends_with;
    }
    public void setFiltro_farmaco___not___ends_with(String filtro_farmaco___not___ends_with) {
        this.filtro_farmaco___not___ends_with = filtro_farmaco___not___ends_with;
    }

    public String getGenerico___eq() {
        return generico___eq;
    }
    public void setGenerico___eq(String generico___eq) {
        this.generico___eq = generico___eq;
    }

    public String getGenerico___ne() {
        return generico___ne;
    }
    public void setGenerico___ne(String generico___ne) {
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

    public java.util.List<String> getGenerico___in() {
        return generico___in;
    }
    public void setGenerico___in(java.util.List<String> generico___in) {
        this.generico___in = generico___in;
    }

    public java.util.List<String> getGenerico___not___in() {
        return generico___not___in;
    }
    public void setGenerico___not___in(java.util.List<String> generico___not___in) {
        this.generico___not___in = generico___not___in;
    }

    public String getGenerico___lt() {
        return generico___lt;
    }
    public void setGenerico___lt(String generico___lt) {
        this.generico___lt = generico___lt;
    }

    public String getGenerico___lte() {
        return generico___lte;
    }
    public void setGenerico___lte(String generico___lte) {
        this.generico___lte = generico___lte;
    }

    public String getGenerico___gt() {
        return generico___gt;
    }
    public void setGenerico___gt(String generico___gt) {
        this.generico___gt = generico___gt;
    }

    public String getGenerico___gte() {
        return generico___gte;
    }
    public void setGenerico___gte(String generico___gte) {
        this.generico___gte = generico___gte;
    }

    public String getGenerico___contains() {
        return generico___contains;
    }
    public void setGenerico___contains(String generico___contains) {
        this.generico___contains = generico___contains;
    }

    public String getGenerico___not___contains() {
        return generico___not___contains;
    }
    public void setGenerico___not___contains(String generico___not___contains) {
        this.generico___not___contains = generico___not___contains;
    }

    public String getGenerico___starts_with() {
        return generico___starts_with;
    }
    public void setGenerico___starts_with(String generico___starts_with) {
        this.generico___starts_with = generico___starts_with;
    }

    public String getGenerico___not___starts_with() {
        return generico___not___starts_with;
    }
    public void setGenerico___not___starts_with(String generico___not___starts_with) {
        this.generico___not___starts_with = generico___not___starts_with;
    }

    public String getGenerico___ends_with() {
        return generico___ends_with;
    }
    public void setGenerico___ends_with(String generico___ends_with) {
        this.generico___ends_with = generico___ends_with;
    }

    public String getGenerico___not___ends_with() {
        return generico___not___ends_with;
    }
    public void setGenerico___not___ends_with(String generico___not___ends_with) {
        this.generico___not___ends_with = generico___not___ends_with;
    }

    public String getGenotipo_guidata___eq() {
        return genotipo_guidata___eq;
    }
    public void setGenotipo_guidata___eq(String genotipo_guidata___eq) {
        this.genotipo_guidata___eq = genotipo_guidata___eq;
    }

    public String getGenotipo_guidata___ne() {
        return genotipo_guidata___ne;
    }
    public void setGenotipo_guidata___ne(String genotipo_guidata___ne) {
        this.genotipo_guidata___ne = genotipo_guidata___ne;
    }

    public Boolean getGenotipo_guidata___null() {
        return genotipo_guidata___null;
    }
    public void setGenotipo_guidata___null(Boolean genotipo_guidata___null) {
        this.genotipo_guidata___null = genotipo_guidata___null;
    }

    public Boolean getGenotipo_guidata___not___null() {
        return genotipo_guidata___not___null;
    }
    public void setGenotipo_guidata___not___null(Boolean genotipo_guidata___not___null) {
        this.genotipo_guidata___not___null = genotipo_guidata___not___null;
    }

    public java.util.List<String> getGenotipo_guidata___in() {
        return genotipo_guidata___in;
    }
    public void setGenotipo_guidata___in(java.util.List<String> genotipo_guidata___in) {
        this.genotipo_guidata___in = genotipo_guidata___in;
    }

    public java.util.List<String> getGenotipo_guidata___not___in() {
        return genotipo_guidata___not___in;
    }
    public void setGenotipo_guidata___not___in(java.util.List<String> genotipo_guidata___not___in) {
        this.genotipo_guidata___not___in = genotipo_guidata___not___in;
    }

    public String getGenotipo_guidata___lt() {
        return genotipo_guidata___lt;
    }
    public void setGenotipo_guidata___lt(String genotipo_guidata___lt) {
        this.genotipo_guidata___lt = genotipo_guidata___lt;
    }

    public String getGenotipo_guidata___lte() {
        return genotipo_guidata___lte;
    }
    public void setGenotipo_guidata___lte(String genotipo_guidata___lte) {
        this.genotipo_guidata___lte = genotipo_guidata___lte;
    }

    public String getGenotipo_guidata___gt() {
        return genotipo_guidata___gt;
    }
    public void setGenotipo_guidata___gt(String genotipo_guidata___gt) {
        this.genotipo_guidata___gt = genotipo_guidata___gt;
    }

    public String getGenotipo_guidata___gte() {
        return genotipo_guidata___gte;
    }
    public void setGenotipo_guidata___gte(String genotipo_guidata___gte) {
        this.genotipo_guidata___gte = genotipo_guidata___gte;
    }

    public String getGenotipo_guidata___contains() {
        return genotipo_guidata___contains;
    }
    public void setGenotipo_guidata___contains(String genotipo_guidata___contains) {
        this.genotipo_guidata___contains = genotipo_guidata___contains;
    }

    public String getGenotipo_guidata___not___contains() {
        return genotipo_guidata___not___contains;
    }
    public void setGenotipo_guidata___not___contains(String genotipo_guidata___not___contains) {
        this.genotipo_guidata___not___contains = genotipo_guidata___not___contains;
    }

    public String getGenotipo_guidata___starts_with() {
        return genotipo_guidata___starts_with;
    }
    public void setGenotipo_guidata___starts_with(String genotipo_guidata___starts_with) {
        this.genotipo_guidata___starts_with = genotipo_guidata___starts_with;
    }

    public String getGenotipo_guidata___not___starts_with() {
        return genotipo_guidata___not___starts_with;
    }
    public void setGenotipo_guidata___not___starts_with(String genotipo_guidata___not___starts_with) {
        this.genotipo_guidata___not___starts_with = genotipo_guidata___not___starts_with;
    }

    public String getGenotipo_guidata___ends_with() {
        return genotipo_guidata___ends_with;
    }
    public void setGenotipo_guidata___ends_with(String genotipo_guidata___ends_with) {
        this.genotipo_guidata___ends_with = genotipo_guidata___ends_with;
    }

    public String getGenotipo_guidata___not___ends_with() {
        return genotipo_guidata___not___ends_with;
    }
    public void setGenotipo_guidata___not___ends_with(String genotipo_guidata___not___ends_with) {
        this.genotipo_guidata___not___ends_with = genotipo_guidata___not___ends_with;
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

    public String getMotivazione_fine_ARV_princ____eq() {
        return motivazione_fine_ARV_princ____eq;
    }
    public void setMotivazione_fine_ARV_princ____eq(String motivazione_fine_ARV_princ____eq) {
        this.motivazione_fine_ARV_princ____eq = motivazione_fine_ARV_princ____eq;
    }

    public String getMotivazione_fine_ARV_princ____ne() {
        return motivazione_fine_ARV_princ____ne;
    }
    public void setMotivazione_fine_ARV_princ____ne(String motivazione_fine_ARV_princ____ne) {
        this.motivazione_fine_ARV_princ____ne = motivazione_fine_ARV_princ____ne;
    }

    public Boolean getMotivazione_fine_ARV_princ____null() {
        return motivazione_fine_ARV_princ____null;
    }
    public void setMotivazione_fine_ARV_princ____null(Boolean motivazione_fine_ARV_princ____null) {
        this.motivazione_fine_ARV_princ____null = motivazione_fine_ARV_princ____null;
    }

    public Boolean getMotivazione_fine_ARV_princ____not___null() {
        return motivazione_fine_ARV_princ____not___null;
    }
    public void setMotivazione_fine_ARV_princ____not___null(Boolean motivazione_fine_ARV_princ____not___null) {
        this.motivazione_fine_ARV_princ____not___null = motivazione_fine_ARV_princ____not___null;
    }

    public java.util.List<String> getMotivazione_fine_ARV_princ____in() {
        return motivazione_fine_ARV_princ____in;
    }
    public void setMotivazione_fine_ARV_princ____in(java.util.List<String> motivazione_fine_ARV_princ____in) {
        this.motivazione_fine_ARV_princ____in = motivazione_fine_ARV_princ____in;
    }

    public java.util.List<String> getMotivazione_fine_ARV_princ____not___in() {
        return motivazione_fine_ARV_princ____not___in;
    }
    public void setMotivazione_fine_ARV_princ____not___in(java.util.List<String> motivazione_fine_ARV_princ____not___in) {
        this.motivazione_fine_ARV_princ____not___in = motivazione_fine_ARV_princ____not___in;
    }

    public String getMotivazione_fine_ARV_princ____lt() {
        return motivazione_fine_ARV_princ____lt;
    }
    public void setMotivazione_fine_ARV_princ____lt(String motivazione_fine_ARV_princ____lt) {
        this.motivazione_fine_ARV_princ____lt = motivazione_fine_ARV_princ____lt;
    }

    public String getMotivazione_fine_ARV_princ____lte() {
        return motivazione_fine_ARV_princ____lte;
    }
    public void setMotivazione_fine_ARV_princ____lte(String motivazione_fine_ARV_princ____lte) {
        this.motivazione_fine_ARV_princ____lte = motivazione_fine_ARV_princ____lte;
    }

    public String getMotivazione_fine_ARV_princ____gt() {
        return motivazione_fine_ARV_princ____gt;
    }
    public void setMotivazione_fine_ARV_princ____gt(String motivazione_fine_ARV_princ____gt) {
        this.motivazione_fine_ARV_princ____gt = motivazione_fine_ARV_princ____gt;
    }

    public String getMotivazione_fine_ARV_princ____gte() {
        return motivazione_fine_ARV_princ____gte;
    }
    public void setMotivazione_fine_ARV_princ____gte(String motivazione_fine_ARV_princ____gte) {
        this.motivazione_fine_ARV_princ____gte = motivazione_fine_ARV_princ____gte;
    }

    public String getMotivazione_fine_ARV_princ____contains() {
        return motivazione_fine_ARV_princ____contains;
    }
    public void setMotivazione_fine_ARV_princ____contains(String motivazione_fine_ARV_princ____contains) {
        this.motivazione_fine_ARV_princ____contains = motivazione_fine_ARV_princ____contains;
    }

    public String getMotivazione_fine_ARV_princ____not___contains() {
        return motivazione_fine_ARV_princ____not___contains;
    }
    public void setMotivazione_fine_ARV_princ____not___contains(String motivazione_fine_ARV_princ____not___contains) {
        this.motivazione_fine_ARV_princ____not___contains = motivazione_fine_ARV_princ____not___contains;
    }

    public String getMotivazione_fine_ARV_princ____starts_with() {
        return motivazione_fine_ARV_princ____starts_with;
    }
    public void setMotivazione_fine_ARV_princ____starts_with(String motivazione_fine_ARV_princ____starts_with) {
        this.motivazione_fine_ARV_princ____starts_with = motivazione_fine_ARV_princ____starts_with;
    }

    public String getMotivazione_fine_ARV_princ____not___starts_with() {
        return motivazione_fine_ARV_princ____not___starts_with;
    }
    public void setMotivazione_fine_ARV_princ____not___starts_with(String motivazione_fine_ARV_princ____not___starts_with) {
        this.motivazione_fine_ARV_princ____not___starts_with = motivazione_fine_ARV_princ____not___starts_with;
    }

    public String getMotivazione_fine_ARV_princ____ends_with() {
        return motivazione_fine_ARV_princ____ends_with;
    }
    public void setMotivazione_fine_ARV_princ____ends_with(String motivazione_fine_ARV_princ____ends_with) {
        this.motivazione_fine_ARV_princ____ends_with = motivazione_fine_ARV_princ____ends_with;
    }

    public String getMotivazione_fine_ARV_princ____not___ends_with() {
        return motivazione_fine_ARV_princ____not___ends_with;
    }
    public void setMotivazione_fine_ARV_princ____not___ends_with(String motivazione_fine_ARV_princ____not___ends_with) {
        this.motivazione_fine_ARV_princ____not___ends_with = motivazione_fine_ARV_princ____not___ends_with;
    }

    public String getMotivazione_fine_ARV_sec____eq() {
        return motivazione_fine_ARV_sec____eq;
    }
    public void setMotivazione_fine_ARV_sec____eq(String motivazione_fine_ARV_sec____eq) {
        this.motivazione_fine_ARV_sec____eq = motivazione_fine_ARV_sec____eq;
    }

    public String getMotivazione_fine_ARV_sec____ne() {
        return motivazione_fine_ARV_sec____ne;
    }
    public void setMotivazione_fine_ARV_sec____ne(String motivazione_fine_ARV_sec____ne) {
        this.motivazione_fine_ARV_sec____ne = motivazione_fine_ARV_sec____ne;
    }

    public Boolean getMotivazione_fine_ARV_sec____null() {
        return motivazione_fine_ARV_sec____null;
    }
    public void setMotivazione_fine_ARV_sec____null(Boolean motivazione_fine_ARV_sec____null) {
        this.motivazione_fine_ARV_sec____null = motivazione_fine_ARV_sec____null;
    }

    public Boolean getMotivazione_fine_ARV_sec____not___null() {
        return motivazione_fine_ARV_sec____not___null;
    }
    public void setMotivazione_fine_ARV_sec____not___null(Boolean motivazione_fine_ARV_sec____not___null) {
        this.motivazione_fine_ARV_sec____not___null = motivazione_fine_ARV_sec____not___null;
    }

    public java.util.List<String> getMotivazione_fine_ARV_sec____in() {
        return motivazione_fine_ARV_sec____in;
    }
    public void setMotivazione_fine_ARV_sec____in(java.util.List<String> motivazione_fine_ARV_sec____in) {
        this.motivazione_fine_ARV_sec____in = motivazione_fine_ARV_sec____in;
    }

    public java.util.List<String> getMotivazione_fine_ARV_sec____not___in() {
        return motivazione_fine_ARV_sec____not___in;
    }
    public void setMotivazione_fine_ARV_sec____not___in(java.util.List<String> motivazione_fine_ARV_sec____not___in) {
        this.motivazione_fine_ARV_sec____not___in = motivazione_fine_ARV_sec____not___in;
    }

    public String getMotivazione_fine_ARV_sec____lt() {
        return motivazione_fine_ARV_sec____lt;
    }
    public void setMotivazione_fine_ARV_sec____lt(String motivazione_fine_ARV_sec____lt) {
        this.motivazione_fine_ARV_sec____lt = motivazione_fine_ARV_sec____lt;
    }

    public String getMotivazione_fine_ARV_sec____lte() {
        return motivazione_fine_ARV_sec____lte;
    }
    public void setMotivazione_fine_ARV_sec____lte(String motivazione_fine_ARV_sec____lte) {
        this.motivazione_fine_ARV_sec____lte = motivazione_fine_ARV_sec____lte;
    }

    public String getMotivazione_fine_ARV_sec____gt() {
        return motivazione_fine_ARV_sec____gt;
    }
    public void setMotivazione_fine_ARV_sec____gt(String motivazione_fine_ARV_sec____gt) {
        this.motivazione_fine_ARV_sec____gt = motivazione_fine_ARV_sec____gt;
    }

    public String getMotivazione_fine_ARV_sec____gte() {
        return motivazione_fine_ARV_sec____gte;
    }
    public void setMotivazione_fine_ARV_sec____gte(String motivazione_fine_ARV_sec____gte) {
        this.motivazione_fine_ARV_sec____gte = motivazione_fine_ARV_sec____gte;
    }

    public String getMotivazione_fine_ARV_sec____contains() {
        return motivazione_fine_ARV_sec____contains;
    }
    public void setMotivazione_fine_ARV_sec____contains(String motivazione_fine_ARV_sec____contains) {
        this.motivazione_fine_ARV_sec____contains = motivazione_fine_ARV_sec____contains;
    }

    public String getMotivazione_fine_ARV_sec____not___contains() {
        return motivazione_fine_ARV_sec____not___contains;
    }
    public void setMotivazione_fine_ARV_sec____not___contains(String motivazione_fine_ARV_sec____not___contains) {
        this.motivazione_fine_ARV_sec____not___contains = motivazione_fine_ARV_sec____not___contains;
    }

    public String getMotivazione_fine_ARV_sec____starts_with() {
        return motivazione_fine_ARV_sec____starts_with;
    }
    public void setMotivazione_fine_ARV_sec____starts_with(String motivazione_fine_ARV_sec____starts_with) {
        this.motivazione_fine_ARV_sec____starts_with = motivazione_fine_ARV_sec____starts_with;
    }

    public String getMotivazione_fine_ARV_sec____not___starts_with() {
        return motivazione_fine_ARV_sec____not___starts_with;
    }
    public void setMotivazione_fine_ARV_sec____not___starts_with(String motivazione_fine_ARV_sec____not___starts_with) {
        this.motivazione_fine_ARV_sec____not___starts_with = motivazione_fine_ARV_sec____not___starts_with;
    }

    public String getMotivazione_fine_ARV_sec____ends_with() {
        return motivazione_fine_ARV_sec____ends_with;
    }
    public void setMotivazione_fine_ARV_sec____ends_with(String motivazione_fine_ARV_sec____ends_with) {
        this.motivazione_fine_ARV_sec____ends_with = motivazione_fine_ARV_sec____ends_with;
    }

    public String getMotivazione_fine_ARV_sec____not___ends_with() {
        return motivazione_fine_ARV_sec____not___ends_with;
    }
    public void setMotivazione_fine_ARV_sec____not___ends_with(String motivazione_fine_ARV_sec____not___ends_with) {
        this.motivazione_fine_ARV_sec____not___ends_with = motivazione_fine_ARV_sec____not___ends_with;
    }

    public String getMotivazione_inizio_ARV____eq() {
        return motivazione_inizio_ARV____eq;
    }
    public void setMotivazione_inizio_ARV____eq(String motivazione_inizio_ARV____eq) {
        this.motivazione_inizio_ARV____eq = motivazione_inizio_ARV____eq;
    }

    public String getMotivazione_inizio_ARV____ne() {
        return motivazione_inizio_ARV____ne;
    }
    public void setMotivazione_inizio_ARV____ne(String motivazione_inizio_ARV____ne) {
        this.motivazione_inizio_ARV____ne = motivazione_inizio_ARV____ne;
    }

    public Boolean getMotivazione_inizio_ARV____null() {
        return motivazione_inizio_ARV____null;
    }
    public void setMotivazione_inizio_ARV____null(Boolean motivazione_inizio_ARV____null) {
        this.motivazione_inizio_ARV____null = motivazione_inizio_ARV____null;
    }

    public Boolean getMotivazione_inizio_ARV____not___null() {
        return motivazione_inizio_ARV____not___null;
    }
    public void setMotivazione_inizio_ARV____not___null(Boolean motivazione_inizio_ARV____not___null) {
        this.motivazione_inizio_ARV____not___null = motivazione_inizio_ARV____not___null;
    }

    public java.util.List<String> getMotivazione_inizio_ARV____in() {
        return motivazione_inizio_ARV____in;
    }
    public void setMotivazione_inizio_ARV____in(java.util.List<String> motivazione_inizio_ARV____in) {
        this.motivazione_inizio_ARV____in = motivazione_inizio_ARV____in;
    }

    public java.util.List<String> getMotivazione_inizio_ARV____not___in() {
        return motivazione_inizio_ARV____not___in;
    }
    public void setMotivazione_inizio_ARV____not___in(java.util.List<String> motivazione_inizio_ARV____not___in) {
        this.motivazione_inizio_ARV____not___in = motivazione_inizio_ARV____not___in;
    }

    public String getMotivazione_inizio_ARV____lt() {
        return motivazione_inizio_ARV____lt;
    }
    public void setMotivazione_inizio_ARV____lt(String motivazione_inizio_ARV____lt) {
        this.motivazione_inizio_ARV____lt = motivazione_inizio_ARV____lt;
    }

    public String getMotivazione_inizio_ARV____lte() {
        return motivazione_inizio_ARV____lte;
    }
    public void setMotivazione_inizio_ARV____lte(String motivazione_inizio_ARV____lte) {
        this.motivazione_inizio_ARV____lte = motivazione_inizio_ARV____lte;
    }

    public String getMotivazione_inizio_ARV____gt() {
        return motivazione_inizio_ARV____gt;
    }
    public void setMotivazione_inizio_ARV____gt(String motivazione_inizio_ARV____gt) {
        this.motivazione_inizio_ARV____gt = motivazione_inizio_ARV____gt;
    }

    public String getMotivazione_inizio_ARV____gte() {
        return motivazione_inizio_ARV____gte;
    }
    public void setMotivazione_inizio_ARV____gte(String motivazione_inizio_ARV____gte) {
        this.motivazione_inizio_ARV____gte = motivazione_inizio_ARV____gte;
    }

    public String getMotivazione_inizio_ARV____contains() {
        return motivazione_inizio_ARV____contains;
    }
    public void setMotivazione_inizio_ARV____contains(String motivazione_inizio_ARV____contains) {
        this.motivazione_inizio_ARV____contains = motivazione_inizio_ARV____contains;
    }

    public String getMotivazione_inizio_ARV____not___contains() {
        return motivazione_inizio_ARV____not___contains;
    }
    public void setMotivazione_inizio_ARV____not___contains(String motivazione_inizio_ARV____not___contains) {
        this.motivazione_inizio_ARV____not___contains = motivazione_inizio_ARV____not___contains;
    }

    public String getMotivazione_inizio_ARV____starts_with() {
        return motivazione_inizio_ARV____starts_with;
    }
    public void setMotivazione_inizio_ARV____starts_with(String motivazione_inizio_ARV____starts_with) {
        this.motivazione_inizio_ARV____starts_with = motivazione_inizio_ARV____starts_with;
    }

    public String getMotivazione_inizio_ARV____not___starts_with() {
        return motivazione_inizio_ARV____not___starts_with;
    }
    public void setMotivazione_inizio_ARV____not___starts_with(String motivazione_inizio_ARV____not___starts_with) {
        this.motivazione_inizio_ARV____not___starts_with = motivazione_inizio_ARV____not___starts_with;
    }

    public String getMotivazione_inizio_ARV____ends_with() {
        return motivazione_inizio_ARV____ends_with;
    }
    public void setMotivazione_inizio_ARV____ends_with(String motivazione_inizio_ARV____ends_with) {
        this.motivazione_inizio_ARV____ends_with = motivazione_inizio_ARV____ends_with;
    }

    public String getMotivazione_inizio_ARV____not___ends_with() {
        return motivazione_inizio_ARV____not___ends_with;
    }
    public void setMotivazione_inizio_ARV____not___ends_with(String motivazione_inizio_ARV____not___ends_with) {
        this.motivazione_inizio_ARV____not___ends_with = motivazione_inizio_ARV____not___ends_with;
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

    public String getNome_trial___eq() {
        return nome_trial___eq;
    }
    public void setNome_trial___eq(String nome_trial___eq) {
        this.nome_trial___eq = nome_trial___eq;
    }

    public String getNome_trial___ne() {
        return nome_trial___ne;
    }
    public void setNome_trial___ne(String nome_trial___ne) {
        this.nome_trial___ne = nome_trial___ne;
    }

    public Boolean getNome_trial___null() {
        return nome_trial___null;
    }
    public void setNome_trial___null(Boolean nome_trial___null) {
        this.nome_trial___null = nome_trial___null;
    }

    public Boolean getNome_trial___not___null() {
        return nome_trial___not___null;
    }
    public void setNome_trial___not___null(Boolean nome_trial___not___null) {
        this.nome_trial___not___null = nome_trial___not___null;
    }

    public java.util.List<String> getNome_trial___in() {
        return nome_trial___in;
    }
    public void setNome_trial___in(java.util.List<String> nome_trial___in) {
        this.nome_trial___in = nome_trial___in;
    }

    public java.util.List<String> getNome_trial___not___in() {
        return nome_trial___not___in;
    }
    public void setNome_trial___not___in(java.util.List<String> nome_trial___not___in) {
        this.nome_trial___not___in = nome_trial___not___in;
    }

    public String getNome_trial___lt() {
        return nome_trial___lt;
    }
    public void setNome_trial___lt(String nome_trial___lt) {
        this.nome_trial___lt = nome_trial___lt;
    }

    public String getNome_trial___lte() {
        return nome_trial___lte;
    }
    public void setNome_trial___lte(String nome_trial___lte) {
        this.nome_trial___lte = nome_trial___lte;
    }

    public String getNome_trial___gt() {
        return nome_trial___gt;
    }
    public void setNome_trial___gt(String nome_trial___gt) {
        this.nome_trial___gt = nome_trial___gt;
    }

    public String getNome_trial___gte() {
        return nome_trial___gte;
    }
    public void setNome_trial___gte(String nome_trial___gte) {
        this.nome_trial___gte = nome_trial___gte;
    }

    public String getNome_trial___contains() {
        return nome_trial___contains;
    }
    public void setNome_trial___contains(String nome_trial___contains) {
        this.nome_trial___contains = nome_trial___contains;
    }

    public String getNome_trial___not___contains() {
        return nome_trial___not___contains;
    }
    public void setNome_trial___not___contains(String nome_trial___not___contains) {
        this.nome_trial___not___contains = nome_trial___not___contains;
    }

    public String getNome_trial___starts_with() {
        return nome_trial___starts_with;
    }
    public void setNome_trial___starts_with(String nome_trial___starts_with) {
        this.nome_trial___starts_with = nome_trial___starts_with;
    }

    public String getNome_trial___not___starts_with() {
        return nome_trial___not___starts_with;
    }
    public void setNome_trial___not___starts_with(String nome_trial___not___starts_with) {
        this.nome_trial___not___starts_with = nome_trial___not___starts_with;
    }

    public String getNome_trial___ends_with() {
        return nome_trial___ends_with;
    }
    public void setNome_trial___ends_with(String nome_trial___ends_with) {
        this.nome_trial___ends_with = nome_trial___ends_with;
    }

    public String getNome_trial___not___ends_with() {
        return nome_trial___not___ends_with;
    }
    public void setNome_trial___not___ends_with(String nome_trial___not___ends_with) {
        this.nome_trial___not___ends_with = nome_trial___not___ends_with;
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

    public String getOnce___eq() {
        return once___eq;
    }
    public void setOnce___eq(String once___eq) {
        this.once___eq = once___eq;
    }

    public String getOnce___ne() {
        return once___ne;
    }
    public void setOnce___ne(String once___ne) {
        this.once___ne = once___ne;
    }

    public Boolean getOnce___null() {
        return once___null;
    }
    public void setOnce___null(Boolean once___null) {
        this.once___null = once___null;
    }

    public Boolean getOnce___not___null() {
        return once___not___null;
    }
    public void setOnce___not___null(Boolean once___not___null) {
        this.once___not___null = once___not___null;
    }

    public java.util.List<String> getOnce___in() {
        return once___in;
    }
    public void setOnce___in(java.util.List<String> once___in) {
        this.once___in = once___in;
    }

    public java.util.List<String> getOnce___not___in() {
        return once___not___in;
    }
    public void setOnce___not___in(java.util.List<String> once___not___in) {
        this.once___not___in = once___not___in;
    }

    public String getOnce___lt() {
        return once___lt;
    }
    public void setOnce___lt(String once___lt) {
        this.once___lt = once___lt;
    }

    public String getOnce___lte() {
        return once___lte;
    }
    public void setOnce___lte(String once___lte) {
        this.once___lte = once___lte;
    }

    public String getOnce___gt() {
        return once___gt;
    }
    public void setOnce___gt(String once___gt) {
        this.once___gt = once___gt;
    }

    public String getOnce___gte() {
        return once___gte;
    }
    public void setOnce___gte(String once___gte) {
        this.once___gte = once___gte;
    }

    public String getOnce___contains() {
        return once___contains;
    }
    public void setOnce___contains(String once___contains) {
        this.once___contains = once___contains;
    }

    public String getOnce___not___contains() {
        return once___not___contains;
    }
    public void setOnce___not___contains(String once___not___contains) {
        this.once___not___contains = once___not___contains;
    }

    public String getOnce___starts_with() {
        return once___starts_with;
    }
    public void setOnce___starts_with(String once___starts_with) {
        this.once___starts_with = once___starts_with;
    }

    public String getOnce___not___starts_with() {
        return once___not___starts_with;
    }
    public void setOnce___not___starts_with(String once___not___starts_with) {
        this.once___not___starts_with = once___not___starts_with;
    }

    public String getOnce___ends_with() {
        return once___ends_with;
    }
    public void setOnce___ends_with(String once___ends_with) {
        this.once___ends_with = once___ends_with;
    }

    public String getOnce___not___ends_with() {
        return once___not___ends_with;
    }
    public void setOnce___not___ends_with(String once___not___ends_with) {
        this.once___not___ends_with = once___not___ends_with;
    }

    public String getUser_team___eq() {
        return user_team___eq;
    }
    public void setUser_team___eq(String user_team___eq) {
        this.user_team___eq = user_team___eq;
    }

    public String getUser_team___ne() {
        return user_team___ne;
    }
    public void setUser_team___ne(String user_team___ne) {
        this.user_team___ne = user_team___ne;
    }

    public Boolean getUser_team___null() {
        return user_team___null;
    }
    public void setUser_team___null(Boolean user_team___null) {
        this.user_team___null = user_team___null;
    }

    public Boolean getUser_team___not___null() {
        return user_team___not___null;
    }
    public void setUser_team___not___null(Boolean user_team___not___null) {
        this.user_team___not___null = user_team___not___null;
    }

    public java.util.List<String> getUser_team___in() {
        return user_team___in;
    }
    public void setUser_team___in(java.util.List<String> user_team___in) {
        this.user_team___in = user_team___in;
    }

    public java.util.List<String> getUser_team___not___in() {
        return user_team___not___in;
    }
    public void setUser_team___not___in(java.util.List<String> user_team___not___in) {
        this.user_team___not___in = user_team___not___in;
    }

    public String getUser_team___lt() {
        return user_team___lt;
    }
    public void setUser_team___lt(String user_team___lt) {
        this.user_team___lt = user_team___lt;
    }

    public String getUser_team___lte() {
        return user_team___lte;
    }
    public void setUser_team___lte(String user_team___lte) {
        this.user_team___lte = user_team___lte;
    }

    public String getUser_team___gt() {
        return user_team___gt;
    }
    public void setUser_team___gt(String user_team___gt) {
        this.user_team___gt = user_team___gt;
    }

    public String getUser_team___gte() {
        return user_team___gte;
    }
    public void setUser_team___gte(String user_team___gte) {
        this.user_team___gte = user_team___gte;
    }

    public String getUser_team___contains() {
        return user_team___contains;
    }
    public void setUser_team___contains(String user_team___contains) {
        this.user_team___contains = user_team___contains;
    }

    public String getUser_team___not___contains() {
        return user_team___not___contains;
    }
    public void setUser_team___not___contains(String user_team___not___contains) {
        this.user_team___not___contains = user_team___not___contains;
    }

    public String getUser_team___starts_with() {
        return user_team___starts_with;
    }
    public void setUser_team___starts_with(String user_team___starts_with) {
        this.user_team___starts_with = user_team___starts_with;
    }

    public String getUser_team___not___starts_with() {
        return user_team___not___starts_with;
    }
    public void setUser_team___not___starts_with(String user_team___not___starts_with) {
        this.user_team___not___starts_with = user_team___not___starts_with;
    }

    public String getUser_team___ends_with() {
        return user_team___ends_with;
    }
    public void setUser_team___ends_with(String user_team___ends_with) {
        this.user_team___ends_with = user_team___ends_with;
    }

    public String getUser_team___not___ends_with() {
        return user_team___not___ends_with;
    }
    public void setUser_team___not___ends_with(String user_team___not___ends_with) {
        this.user_team___not___ends_with = user_team___not___ends_with;
    }

    public java.util.List<CliTerapia_ARVFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliTerapia_ARVFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliTerapia_ARVFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliTerapia_ARVFilterDTO> OR) {
        this.OR = OR;
    }

    public CliTerapia_ARVFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliTerapia_ARVFilterDTO NOT) {
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
        if (altro_inizio_terapia___eq != null) {
            joiner.add("altro_inizio_terapia___eq: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___eq));
        }
        if (altro_inizio_terapia___ne != null) {
            joiner.add("altro_inizio_terapia___ne: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___ne));
        }
        if (altro_inizio_terapia___null != null) {
            joiner.add("altro_inizio_terapia___null: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___null));
        }
        if (altro_inizio_terapia___not___null != null) {
            joiner.add("altro_inizio_terapia___not___null: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___not___null));
        }
        if (altro_inizio_terapia___in != null) {
            joiner.add("altro_inizio_terapia___in: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___in));
        }
        if (altro_inizio_terapia___not___in != null) {
            joiner.add("altro_inizio_terapia___not___in: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___not___in));
        }
        if (altro_inizio_terapia___lt != null) {
            joiner.add("altro_inizio_terapia___lt: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___lt));
        }
        if (altro_inizio_terapia___lte != null) {
            joiner.add("altro_inizio_terapia___lte: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___lte));
        }
        if (altro_inizio_terapia___gt != null) {
            joiner.add("altro_inizio_terapia___gt: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___gt));
        }
        if (altro_inizio_terapia___gte != null) {
            joiner.add("altro_inizio_terapia___gte: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___gte));
        }
        if (altro_inizio_terapia___contains != null) {
            joiner.add("altro_inizio_terapia___contains: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___contains));
        }
        if (altro_inizio_terapia___not___contains != null) {
            joiner.add("altro_inizio_terapia___not___contains: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___not___contains));
        }
        if (altro_inizio_terapia___starts_with != null) {
            joiner.add("altro_inizio_terapia___starts_with: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___starts_with));
        }
        if (altro_inizio_terapia___not___starts_with != null) {
            joiner.add("altro_inizio_terapia___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___not___starts_with));
        }
        if (altro_inizio_terapia___ends_with != null) {
            joiner.add("altro_inizio_terapia___ends_with: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___ends_with));
        }
        if (altro_inizio_terapia___not___ends_with != null) {
            joiner.add("altro_inizio_terapia___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia___not___ends_with));
        }
        if (altro_variazione_terapia___eq != null) {
            joiner.add("altro_variazione_terapia___eq: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___eq));
        }
        if (altro_variazione_terapia___ne != null) {
            joiner.add("altro_variazione_terapia___ne: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___ne));
        }
        if (altro_variazione_terapia___null != null) {
            joiner.add("altro_variazione_terapia___null: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___null));
        }
        if (altro_variazione_terapia___not___null != null) {
            joiner.add("altro_variazione_terapia___not___null: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___not___null));
        }
        if (altro_variazione_terapia___in != null) {
            joiner.add("altro_variazione_terapia___in: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___in));
        }
        if (altro_variazione_terapia___not___in != null) {
            joiner.add("altro_variazione_terapia___not___in: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___not___in));
        }
        if (altro_variazione_terapia___lt != null) {
            joiner.add("altro_variazione_terapia___lt: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___lt));
        }
        if (altro_variazione_terapia___lte != null) {
            joiner.add("altro_variazione_terapia___lte: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___lte));
        }
        if (altro_variazione_terapia___gt != null) {
            joiner.add("altro_variazione_terapia___gt: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___gt));
        }
        if (altro_variazione_terapia___gte != null) {
            joiner.add("altro_variazione_terapia___gte: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___gte));
        }
        if (altro_variazione_terapia___contains != null) {
            joiner.add("altro_variazione_terapia___contains: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___contains));
        }
        if (altro_variazione_terapia___not___contains != null) {
            joiner.add("altro_variazione_terapia___not___contains: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___not___contains));
        }
        if (altro_variazione_terapia___starts_with != null) {
            joiner.add("altro_variazione_terapia___starts_with: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___starts_with));
        }
        if (altro_variazione_terapia___not___starts_with != null) {
            joiner.add("altro_variazione_terapia___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___not___starts_with));
        }
        if (altro_variazione_terapia___ends_with != null) {
            joiner.add("altro_variazione_terapia___ends_with: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___ends_with));
        }
        if (altro_variazione_terapia___not___ends_with != null) {
            joiner.add("altro_variazione_terapia___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia___not___ends_with));
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
        if (booster___eq != null) {
            joiner.add("booster___eq: " + GraphQLRequestSerializer.getEntry(booster___eq));
        }
        if (booster___ne != null) {
            joiner.add("booster___ne: " + GraphQLRequestSerializer.getEntry(booster___ne));
        }
        if (booster___null != null) {
            joiner.add("booster___null: " + GraphQLRequestSerializer.getEntry(booster___null));
        }
        if (booster___not___null != null) {
            joiner.add("booster___not___null: " + GraphQLRequestSerializer.getEntry(booster___not___null));
        }
        if (booster___in != null) {
            joiner.add("booster___in: " + GraphQLRequestSerializer.getEntry(booster___in));
        }
        if (booster___not___in != null) {
            joiner.add("booster___not___in: " + GraphQLRequestSerializer.getEntry(booster___not___in));
        }
        if (booster___lt != null) {
            joiner.add("booster___lt: " + GraphQLRequestSerializer.getEntry(booster___lt));
        }
        if (booster___lte != null) {
            joiner.add("booster___lte: " + GraphQLRequestSerializer.getEntry(booster___lte));
        }
        if (booster___gt != null) {
            joiner.add("booster___gt: " + GraphQLRequestSerializer.getEntry(booster___gt));
        }
        if (booster___gte != null) {
            joiner.add("booster___gte: " + GraphQLRequestSerializer.getEntry(booster___gte));
        }
        if (booster___contains != null) {
            joiner.add("booster___contains: " + GraphQLRequestSerializer.getEntry(booster___contains));
        }
        if (booster___not___contains != null) {
            joiner.add("booster___not___contains: " + GraphQLRequestSerializer.getEntry(booster___not___contains));
        }
        if (booster___starts_with != null) {
            joiner.add("booster___starts_with: " + GraphQLRequestSerializer.getEntry(booster___starts_with));
        }
        if (booster___not___starts_with != null) {
            joiner.add("booster___not___starts_with: " + GraphQLRequestSerializer.getEntry(booster___not___starts_with));
        }
        if (booster___ends_with != null) {
            joiner.add("booster___ends_with: " + GraphQLRequestSerializer.getEntry(booster___ends_with));
        }
        if (booster___not___ends_with != null) {
            joiner.add("booster___not___ends_with: " + GraphQLRequestSerializer.getEntry(booster___not___ends_with));
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
        if (disponibile_generico___eq != null) {
            joiner.add("disponibile_generico___eq: " + GraphQLRequestSerializer.getEntry(disponibile_generico___eq));
        }
        if (disponibile_generico___ne != null) {
            joiner.add("disponibile_generico___ne: " + GraphQLRequestSerializer.getEntry(disponibile_generico___ne));
        }
        if (disponibile_generico___null != null) {
            joiner.add("disponibile_generico___null: " + GraphQLRequestSerializer.getEntry(disponibile_generico___null));
        }
        if (disponibile_generico___not___null != null) {
            joiner.add("disponibile_generico___not___null: " + GraphQLRequestSerializer.getEntry(disponibile_generico___not___null));
        }
        if (doppio_cieco___eq != null) {
            joiner.add("doppio_cieco___eq: " + GraphQLRequestSerializer.getEntry(doppio_cieco___eq));
        }
        if (doppio_cieco___ne != null) {
            joiner.add("doppio_cieco___ne: " + GraphQLRequestSerializer.getEntry(doppio_cieco___ne));
        }
        if (doppio_cieco___null != null) {
            joiner.add("doppio_cieco___null: " + GraphQLRequestSerializer.getEntry(doppio_cieco___null));
        }
        if (doppio_cieco___not___null != null) {
            joiner.add("doppio_cieco___not___null: " + GraphQLRequestSerializer.getEntry(doppio_cieco___not___null));
        }
        if (dosaggi_count___eq != null) {
            joiner.add("dosaggi_count___eq: " + GraphQLRequestSerializer.getEntry(dosaggi_count___eq));
        }
        if (dosaggi_count___ne != null) {
            joiner.add("dosaggi_count___ne: " + GraphQLRequestSerializer.getEntry(dosaggi_count___ne));
        }
        if (dosaggi_count___null != null) {
            joiner.add("dosaggi_count___null: " + GraphQLRequestSerializer.getEntry(dosaggi_count___null));
        }
        if (dosaggi_count___not___null != null) {
            joiner.add("dosaggi_count___not___null: " + GraphQLRequestSerializer.getEntry(dosaggi_count___not___null));
        }
        if (dosaggi_count___in != null) {
            joiner.add("dosaggi_count___in: " + GraphQLRequestSerializer.getEntry(dosaggi_count___in));
        }
        if (dosaggi_count___not___in != null) {
            joiner.add("dosaggi_count___not___in: " + GraphQLRequestSerializer.getEntry(dosaggi_count___not___in));
        }
        if (dosaggi_count___lt != null) {
            joiner.add("dosaggi_count___lt: " + GraphQLRequestSerializer.getEntry(dosaggi_count___lt));
        }
        if (dosaggi_count___lte != null) {
            joiner.add("dosaggi_count___lte: " + GraphQLRequestSerializer.getEntry(dosaggi_count___lte));
        }
        if (dosaggi_count___gt != null) {
            joiner.add("dosaggi_count___gt: " + GraphQLRequestSerializer.getEntry(dosaggi_count___gt));
        }
        if (dosaggi_count___gte != null) {
            joiner.add("dosaggi_count___gte: " + GraphQLRequestSerializer.getEntry(dosaggi_count___gte));
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
        if (filtro_farmaco___eq != null) {
            joiner.add("filtro_farmaco___eq: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___eq));
        }
        if (filtro_farmaco___ne != null) {
            joiner.add("filtro_farmaco___ne: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___ne));
        }
        if (filtro_farmaco___null != null) {
            joiner.add("filtro_farmaco___null: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___null));
        }
        if (filtro_farmaco___not___null != null) {
            joiner.add("filtro_farmaco___not___null: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___not___null));
        }
        if (filtro_farmaco___in != null) {
            joiner.add("filtro_farmaco___in: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___in));
        }
        if (filtro_farmaco___not___in != null) {
            joiner.add("filtro_farmaco___not___in: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___not___in));
        }
        if (filtro_farmaco___lt != null) {
            joiner.add("filtro_farmaco___lt: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___lt));
        }
        if (filtro_farmaco___lte != null) {
            joiner.add("filtro_farmaco___lte: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___lte));
        }
        if (filtro_farmaco___gt != null) {
            joiner.add("filtro_farmaco___gt: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___gt));
        }
        if (filtro_farmaco___gte != null) {
            joiner.add("filtro_farmaco___gte: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___gte));
        }
        if (filtro_farmaco___contains != null) {
            joiner.add("filtro_farmaco___contains: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___contains));
        }
        if (filtro_farmaco___not___contains != null) {
            joiner.add("filtro_farmaco___not___contains: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___not___contains));
        }
        if (filtro_farmaco___starts_with != null) {
            joiner.add("filtro_farmaco___starts_with: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___starts_with));
        }
        if (filtro_farmaco___not___starts_with != null) {
            joiner.add("filtro_farmaco___not___starts_with: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___not___starts_with));
        }
        if (filtro_farmaco___ends_with != null) {
            joiner.add("filtro_farmaco___ends_with: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___ends_with));
        }
        if (filtro_farmaco___not___ends_with != null) {
            joiner.add("filtro_farmaco___not___ends_with: " + GraphQLRequestSerializer.getEntry(filtro_farmaco___not___ends_with));
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
        if (generico___in != null) {
            joiner.add("generico___in: " + GraphQLRequestSerializer.getEntry(generico___in));
        }
        if (generico___not___in != null) {
            joiner.add("generico___not___in: " + GraphQLRequestSerializer.getEntry(generico___not___in));
        }
        if (generico___lt != null) {
            joiner.add("generico___lt: " + GraphQLRequestSerializer.getEntry(generico___lt));
        }
        if (generico___lte != null) {
            joiner.add("generico___lte: " + GraphQLRequestSerializer.getEntry(generico___lte));
        }
        if (generico___gt != null) {
            joiner.add("generico___gt: " + GraphQLRequestSerializer.getEntry(generico___gt));
        }
        if (generico___gte != null) {
            joiner.add("generico___gte: " + GraphQLRequestSerializer.getEntry(generico___gte));
        }
        if (generico___contains != null) {
            joiner.add("generico___contains: " + GraphQLRequestSerializer.getEntry(generico___contains));
        }
        if (generico___not___contains != null) {
            joiner.add("generico___not___contains: " + GraphQLRequestSerializer.getEntry(generico___not___contains));
        }
        if (generico___starts_with != null) {
            joiner.add("generico___starts_with: " + GraphQLRequestSerializer.getEntry(generico___starts_with));
        }
        if (generico___not___starts_with != null) {
            joiner.add("generico___not___starts_with: " + GraphQLRequestSerializer.getEntry(generico___not___starts_with));
        }
        if (generico___ends_with != null) {
            joiner.add("generico___ends_with: " + GraphQLRequestSerializer.getEntry(generico___ends_with));
        }
        if (generico___not___ends_with != null) {
            joiner.add("generico___not___ends_with: " + GraphQLRequestSerializer.getEntry(generico___not___ends_with));
        }
        if (genotipo_guidata___eq != null) {
            joiner.add("genotipo_guidata___eq: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___eq));
        }
        if (genotipo_guidata___ne != null) {
            joiner.add("genotipo_guidata___ne: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___ne));
        }
        if (genotipo_guidata___null != null) {
            joiner.add("genotipo_guidata___null: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___null));
        }
        if (genotipo_guidata___not___null != null) {
            joiner.add("genotipo_guidata___not___null: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___not___null));
        }
        if (genotipo_guidata___in != null) {
            joiner.add("genotipo_guidata___in: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___in));
        }
        if (genotipo_guidata___not___in != null) {
            joiner.add("genotipo_guidata___not___in: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___not___in));
        }
        if (genotipo_guidata___lt != null) {
            joiner.add("genotipo_guidata___lt: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___lt));
        }
        if (genotipo_guidata___lte != null) {
            joiner.add("genotipo_guidata___lte: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___lte));
        }
        if (genotipo_guidata___gt != null) {
            joiner.add("genotipo_guidata___gt: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___gt));
        }
        if (genotipo_guidata___gte != null) {
            joiner.add("genotipo_guidata___gte: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___gte));
        }
        if (genotipo_guidata___contains != null) {
            joiner.add("genotipo_guidata___contains: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___contains));
        }
        if (genotipo_guidata___not___contains != null) {
            joiner.add("genotipo_guidata___not___contains: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___not___contains));
        }
        if (genotipo_guidata___starts_with != null) {
            joiner.add("genotipo_guidata___starts_with: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___starts_with));
        }
        if (genotipo_guidata___not___starts_with != null) {
            joiner.add("genotipo_guidata___not___starts_with: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___not___starts_with));
        }
        if (genotipo_guidata___ends_with != null) {
            joiner.add("genotipo_guidata___ends_with: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___ends_with));
        }
        if (genotipo_guidata___not___ends_with != null) {
            joiner.add("genotipo_guidata___not___ends_with: " + GraphQLRequestSerializer.getEntry(genotipo_guidata___not___ends_with));
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
        if (motivazione_fine_ARV_princ____eq != null) {
            joiner.add("motivazione_fine_ARV_princ____eq: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____eq));
        }
        if (motivazione_fine_ARV_princ____ne != null) {
            joiner.add("motivazione_fine_ARV_princ____ne: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____ne));
        }
        if (motivazione_fine_ARV_princ____null != null) {
            joiner.add("motivazione_fine_ARV_princ____null: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____null));
        }
        if (motivazione_fine_ARV_princ____not___null != null) {
            joiner.add("motivazione_fine_ARV_princ____not___null: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____not___null));
        }
        if (motivazione_fine_ARV_princ____in != null) {
            joiner.add("motivazione_fine_ARV_princ____in: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____in));
        }
        if (motivazione_fine_ARV_princ____not___in != null) {
            joiner.add("motivazione_fine_ARV_princ____not___in: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____not___in));
        }
        if (motivazione_fine_ARV_princ____lt != null) {
            joiner.add("motivazione_fine_ARV_princ____lt: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____lt));
        }
        if (motivazione_fine_ARV_princ____lte != null) {
            joiner.add("motivazione_fine_ARV_princ____lte: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____lte));
        }
        if (motivazione_fine_ARV_princ____gt != null) {
            joiner.add("motivazione_fine_ARV_princ____gt: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____gt));
        }
        if (motivazione_fine_ARV_princ____gte != null) {
            joiner.add("motivazione_fine_ARV_princ____gte: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____gte));
        }
        if (motivazione_fine_ARV_princ____contains != null) {
            joiner.add("motivazione_fine_ARV_princ____contains: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____contains));
        }
        if (motivazione_fine_ARV_princ____not___contains != null) {
            joiner.add("motivazione_fine_ARV_princ____not___contains: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____not___contains));
        }
        if (motivazione_fine_ARV_princ____starts_with != null) {
            joiner.add("motivazione_fine_ARV_princ____starts_with: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____starts_with));
        }
        if (motivazione_fine_ARV_princ____not___starts_with != null) {
            joiner.add("motivazione_fine_ARV_princ____not___starts_with: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____not___starts_with));
        }
        if (motivazione_fine_ARV_princ____ends_with != null) {
            joiner.add("motivazione_fine_ARV_princ____ends_with: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____ends_with));
        }
        if (motivazione_fine_ARV_princ____not___ends_with != null) {
            joiner.add("motivazione_fine_ARV_princ____not___ends_with: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ____not___ends_with));
        }
        if (motivazione_fine_ARV_sec____eq != null) {
            joiner.add("motivazione_fine_ARV_sec____eq: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____eq));
        }
        if (motivazione_fine_ARV_sec____ne != null) {
            joiner.add("motivazione_fine_ARV_sec____ne: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____ne));
        }
        if (motivazione_fine_ARV_sec____null != null) {
            joiner.add("motivazione_fine_ARV_sec____null: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____null));
        }
        if (motivazione_fine_ARV_sec____not___null != null) {
            joiner.add("motivazione_fine_ARV_sec____not___null: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____not___null));
        }
        if (motivazione_fine_ARV_sec____in != null) {
            joiner.add("motivazione_fine_ARV_sec____in: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____in));
        }
        if (motivazione_fine_ARV_sec____not___in != null) {
            joiner.add("motivazione_fine_ARV_sec____not___in: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____not___in));
        }
        if (motivazione_fine_ARV_sec____lt != null) {
            joiner.add("motivazione_fine_ARV_sec____lt: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____lt));
        }
        if (motivazione_fine_ARV_sec____lte != null) {
            joiner.add("motivazione_fine_ARV_sec____lte: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____lte));
        }
        if (motivazione_fine_ARV_sec____gt != null) {
            joiner.add("motivazione_fine_ARV_sec____gt: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____gt));
        }
        if (motivazione_fine_ARV_sec____gte != null) {
            joiner.add("motivazione_fine_ARV_sec____gte: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____gte));
        }
        if (motivazione_fine_ARV_sec____contains != null) {
            joiner.add("motivazione_fine_ARV_sec____contains: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____contains));
        }
        if (motivazione_fine_ARV_sec____not___contains != null) {
            joiner.add("motivazione_fine_ARV_sec____not___contains: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____not___contains));
        }
        if (motivazione_fine_ARV_sec____starts_with != null) {
            joiner.add("motivazione_fine_ARV_sec____starts_with: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____starts_with));
        }
        if (motivazione_fine_ARV_sec____not___starts_with != null) {
            joiner.add("motivazione_fine_ARV_sec____not___starts_with: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____not___starts_with));
        }
        if (motivazione_fine_ARV_sec____ends_with != null) {
            joiner.add("motivazione_fine_ARV_sec____ends_with: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____ends_with));
        }
        if (motivazione_fine_ARV_sec____not___ends_with != null) {
            joiner.add("motivazione_fine_ARV_sec____not___ends_with: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec____not___ends_with));
        }
        if (motivazione_inizio_ARV____eq != null) {
            joiner.add("motivazione_inizio_ARV____eq: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____eq));
        }
        if (motivazione_inizio_ARV____ne != null) {
            joiner.add("motivazione_inizio_ARV____ne: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____ne));
        }
        if (motivazione_inizio_ARV____null != null) {
            joiner.add("motivazione_inizio_ARV____null: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____null));
        }
        if (motivazione_inizio_ARV____not___null != null) {
            joiner.add("motivazione_inizio_ARV____not___null: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____not___null));
        }
        if (motivazione_inizio_ARV____in != null) {
            joiner.add("motivazione_inizio_ARV____in: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____in));
        }
        if (motivazione_inizio_ARV____not___in != null) {
            joiner.add("motivazione_inizio_ARV____not___in: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____not___in));
        }
        if (motivazione_inizio_ARV____lt != null) {
            joiner.add("motivazione_inizio_ARV____lt: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____lt));
        }
        if (motivazione_inizio_ARV____lte != null) {
            joiner.add("motivazione_inizio_ARV____lte: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____lte));
        }
        if (motivazione_inizio_ARV____gt != null) {
            joiner.add("motivazione_inizio_ARV____gt: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____gt));
        }
        if (motivazione_inizio_ARV____gte != null) {
            joiner.add("motivazione_inizio_ARV____gte: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____gte));
        }
        if (motivazione_inizio_ARV____contains != null) {
            joiner.add("motivazione_inizio_ARV____contains: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____contains));
        }
        if (motivazione_inizio_ARV____not___contains != null) {
            joiner.add("motivazione_inizio_ARV____not___contains: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____not___contains));
        }
        if (motivazione_inizio_ARV____starts_with != null) {
            joiner.add("motivazione_inizio_ARV____starts_with: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____starts_with));
        }
        if (motivazione_inizio_ARV____not___starts_with != null) {
            joiner.add("motivazione_inizio_ARV____not___starts_with: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____not___starts_with));
        }
        if (motivazione_inizio_ARV____ends_with != null) {
            joiner.add("motivazione_inizio_ARV____ends_with: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____ends_with));
        }
        if (motivazione_inizio_ARV____not___ends_with != null) {
            joiner.add("motivazione_inizio_ARV____not___ends_with: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV____not___ends_with));
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
        if (nome_trial___eq != null) {
            joiner.add("nome_trial___eq: " + GraphQLRequestSerializer.getEntry(nome_trial___eq));
        }
        if (nome_trial___ne != null) {
            joiner.add("nome_trial___ne: " + GraphQLRequestSerializer.getEntry(nome_trial___ne));
        }
        if (nome_trial___null != null) {
            joiner.add("nome_trial___null: " + GraphQLRequestSerializer.getEntry(nome_trial___null));
        }
        if (nome_trial___not___null != null) {
            joiner.add("nome_trial___not___null: " + GraphQLRequestSerializer.getEntry(nome_trial___not___null));
        }
        if (nome_trial___in != null) {
            joiner.add("nome_trial___in: " + GraphQLRequestSerializer.getEntry(nome_trial___in));
        }
        if (nome_trial___not___in != null) {
            joiner.add("nome_trial___not___in: " + GraphQLRequestSerializer.getEntry(nome_trial___not___in));
        }
        if (nome_trial___lt != null) {
            joiner.add("nome_trial___lt: " + GraphQLRequestSerializer.getEntry(nome_trial___lt));
        }
        if (nome_trial___lte != null) {
            joiner.add("nome_trial___lte: " + GraphQLRequestSerializer.getEntry(nome_trial___lte));
        }
        if (nome_trial___gt != null) {
            joiner.add("nome_trial___gt: " + GraphQLRequestSerializer.getEntry(nome_trial___gt));
        }
        if (nome_trial___gte != null) {
            joiner.add("nome_trial___gte: " + GraphQLRequestSerializer.getEntry(nome_trial___gte));
        }
        if (nome_trial___contains != null) {
            joiner.add("nome_trial___contains: " + GraphQLRequestSerializer.getEntry(nome_trial___contains));
        }
        if (nome_trial___not___contains != null) {
            joiner.add("nome_trial___not___contains: " + GraphQLRequestSerializer.getEntry(nome_trial___not___contains));
        }
        if (nome_trial___starts_with != null) {
            joiner.add("nome_trial___starts_with: " + GraphQLRequestSerializer.getEntry(nome_trial___starts_with));
        }
        if (nome_trial___not___starts_with != null) {
            joiner.add("nome_trial___not___starts_with: " + GraphQLRequestSerializer.getEntry(nome_trial___not___starts_with));
        }
        if (nome_trial___ends_with != null) {
            joiner.add("nome_trial___ends_with: " + GraphQLRequestSerializer.getEntry(nome_trial___ends_with));
        }
        if (nome_trial___not___ends_with != null) {
            joiner.add("nome_trial___not___ends_with: " + GraphQLRequestSerializer.getEntry(nome_trial___not___ends_with));
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
        if (once___eq != null) {
            joiner.add("once___eq: " + GraphQLRequestSerializer.getEntry(once___eq));
        }
        if (once___ne != null) {
            joiner.add("once___ne: " + GraphQLRequestSerializer.getEntry(once___ne));
        }
        if (once___null != null) {
            joiner.add("once___null: " + GraphQLRequestSerializer.getEntry(once___null));
        }
        if (once___not___null != null) {
            joiner.add("once___not___null: " + GraphQLRequestSerializer.getEntry(once___not___null));
        }
        if (once___in != null) {
            joiner.add("once___in: " + GraphQLRequestSerializer.getEntry(once___in));
        }
        if (once___not___in != null) {
            joiner.add("once___not___in: " + GraphQLRequestSerializer.getEntry(once___not___in));
        }
        if (once___lt != null) {
            joiner.add("once___lt: " + GraphQLRequestSerializer.getEntry(once___lt));
        }
        if (once___lte != null) {
            joiner.add("once___lte: " + GraphQLRequestSerializer.getEntry(once___lte));
        }
        if (once___gt != null) {
            joiner.add("once___gt: " + GraphQLRequestSerializer.getEntry(once___gt));
        }
        if (once___gte != null) {
            joiner.add("once___gte: " + GraphQLRequestSerializer.getEntry(once___gte));
        }
        if (once___contains != null) {
            joiner.add("once___contains: " + GraphQLRequestSerializer.getEntry(once___contains));
        }
        if (once___not___contains != null) {
            joiner.add("once___not___contains: " + GraphQLRequestSerializer.getEntry(once___not___contains));
        }
        if (once___starts_with != null) {
            joiner.add("once___starts_with: " + GraphQLRequestSerializer.getEntry(once___starts_with));
        }
        if (once___not___starts_with != null) {
            joiner.add("once___not___starts_with: " + GraphQLRequestSerializer.getEntry(once___not___starts_with));
        }
        if (once___ends_with != null) {
            joiner.add("once___ends_with: " + GraphQLRequestSerializer.getEntry(once___ends_with));
        }
        if (once___not___ends_with != null) {
            joiner.add("once___not___ends_with: " + GraphQLRequestSerializer.getEntry(once___not___ends_with));
        }
        if (user_team___eq != null) {
            joiner.add("user_team___eq: " + GraphQLRequestSerializer.getEntry(user_team___eq));
        }
        if (user_team___ne != null) {
            joiner.add("user_team___ne: " + GraphQLRequestSerializer.getEntry(user_team___ne));
        }
        if (user_team___null != null) {
            joiner.add("user_team___null: " + GraphQLRequestSerializer.getEntry(user_team___null));
        }
        if (user_team___not___null != null) {
            joiner.add("user_team___not___null: " + GraphQLRequestSerializer.getEntry(user_team___not___null));
        }
        if (user_team___in != null) {
            joiner.add("user_team___in: " + GraphQLRequestSerializer.getEntry(user_team___in));
        }
        if (user_team___not___in != null) {
            joiner.add("user_team___not___in: " + GraphQLRequestSerializer.getEntry(user_team___not___in));
        }
        if (user_team___lt != null) {
            joiner.add("user_team___lt: " + GraphQLRequestSerializer.getEntry(user_team___lt));
        }
        if (user_team___lte != null) {
            joiner.add("user_team___lte: " + GraphQLRequestSerializer.getEntry(user_team___lte));
        }
        if (user_team___gt != null) {
            joiner.add("user_team___gt: " + GraphQLRequestSerializer.getEntry(user_team___gt));
        }
        if (user_team___gte != null) {
            joiner.add("user_team___gte: " + GraphQLRequestSerializer.getEntry(user_team___gte));
        }
        if (user_team___contains != null) {
            joiner.add("user_team___contains: " + GraphQLRequestSerializer.getEntry(user_team___contains));
        }
        if (user_team___not___contains != null) {
            joiner.add("user_team___not___contains: " + GraphQLRequestSerializer.getEntry(user_team___not___contains));
        }
        if (user_team___starts_with != null) {
            joiner.add("user_team___starts_with: " + GraphQLRequestSerializer.getEntry(user_team___starts_with));
        }
        if (user_team___not___starts_with != null) {
            joiner.add("user_team___not___starts_with: " + GraphQLRequestSerializer.getEntry(user_team___not___starts_with));
        }
        if (user_team___ends_with != null) {
            joiner.add("user_team___ends_with: " + GraphQLRequestSerializer.getEntry(user_team___ends_with));
        }
        if (user_team___not___ends_with != null) {
            joiner.add("user_team___not___ends_with: " + GraphQLRequestSerializer.getEntry(user_team___not___ends_with));
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

    public static CliTerapia_ARVFilterDTO.Builder builder() {
        return new CliTerapia_ARVFilterDTO.Builder();
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
        private String altro_inizio_terapia___eq;
        private String altro_inizio_terapia___ne;
        private Boolean altro_inizio_terapia___null;
        private Boolean altro_inizio_terapia___not___null;
        private java.util.List<String> altro_inizio_terapia___in;
        private java.util.List<String> altro_inizio_terapia___not___in;
        private String altro_inizio_terapia___lt;
        private String altro_inizio_terapia___lte;
        private String altro_inizio_terapia___gt;
        private String altro_inizio_terapia___gte;
        private String altro_inizio_terapia___contains;
        private String altro_inizio_terapia___not___contains;
        private String altro_inizio_terapia___starts_with;
        private String altro_inizio_terapia___not___starts_with;
        private String altro_inizio_terapia___ends_with;
        private String altro_inizio_terapia___not___ends_with;
        private String altro_variazione_terapia___eq;
        private String altro_variazione_terapia___ne;
        private Boolean altro_variazione_terapia___null;
        private Boolean altro_variazione_terapia___not___null;
        private java.util.List<String> altro_variazione_terapia___in;
        private java.util.List<String> altro_variazione_terapia___not___in;
        private String altro_variazione_terapia___lt;
        private String altro_variazione_terapia___lte;
        private String altro_variazione_terapia___gt;
        private String altro_variazione_terapia___gte;
        private String altro_variazione_terapia___contains;
        private String altro_variazione_terapia___not___contains;
        private String altro_variazione_terapia___starts_with;
        private String altro_variazione_terapia___not___starts_with;
        private String altro_variazione_terapia___ends_with;
        private String altro_variazione_terapia___not___ends_with;
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
        private String booster___eq;
        private String booster___ne;
        private Boolean booster___null;
        private Boolean booster___not___null;
        private java.util.List<String> booster___in;
        private java.util.List<String> booster___not___in;
        private String booster___lt;
        private String booster___lte;
        private String booster___gt;
        private String booster___gte;
        private String booster___contains;
        private String booster___not___contains;
        private String booster___starts_with;
        private String booster___not___starts_with;
        private String booster___ends_with;
        private String booster___not___ends_with;
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
        private Boolean disponibile_generico___eq;
        private Boolean disponibile_generico___ne;
        private Boolean disponibile_generico___null;
        private Boolean disponibile_generico___not___null;
        private Boolean doppio_cieco___eq;
        private Boolean doppio_cieco___ne;
        private Boolean doppio_cieco___null;
        private Boolean doppio_cieco___not___null;
        private Integer dosaggi_count___eq;
        private Integer dosaggi_count___ne;
        private Boolean dosaggi_count___null;
        private Boolean dosaggi_count___not___null;
        private java.util.List<Integer> dosaggi_count___in;
        private java.util.List<Integer> dosaggi_count___not___in;
        private Integer dosaggi_count___lt;
        private Integer dosaggi_count___lte;
        private Integer dosaggi_count___gt;
        private Integer dosaggi_count___gte;
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
        private String filtro_farmaco___eq;
        private String filtro_farmaco___ne;
        private Boolean filtro_farmaco___null;
        private Boolean filtro_farmaco___not___null;
        private java.util.List<String> filtro_farmaco___in;
        private java.util.List<String> filtro_farmaco___not___in;
        private String filtro_farmaco___lt;
        private String filtro_farmaco___lte;
        private String filtro_farmaco___gt;
        private String filtro_farmaco___gte;
        private String filtro_farmaco___contains;
        private String filtro_farmaco___not___contains;
        private String filtro_farmaco___starts_with;
        private String filtro_farmaco___not___starts_with;
        private String filtro_farmaco___ends_with;
        private String filtro_farmaco___not___ends_with;
        private String generico___eq;
        private String generico___ne;
        private Boolean generico___null;
        private Boolean generico___not___null;
        private java.util.List<String> generico___in;
        private java.util.List<String> generico___not___in;
        private String generico___lt;
        private String generico___lte;
        private String generico___gt;
        private String generico___gte;
        private String generico___contains;
        private String generico___not___contains;
        private String generico___starts_with;
        private String generico___not___starts_with;
        private String generico___ends_with;
        private String generico___not___ends_with;
        private String genotipo_guidata___eq;
        private String genotipo_guidata___ne;
        private Boolean genotipo_guidata___null;
        private Boolean genotipo_guidata___not___null;
        private java.util.List<String> genotipo_guidata___in;
        private java.util.List<String> genotipo_guidata___not___in;
        private String genotipo_guidata___lt;
        private String genotipo_guidata___lte;
        private String genotipo_guidata___gt;
        private String genotipo_guidata___gte;
        private String genotipo_guidata___contains;
        private String genotipo_guidata___not___contains;
        private String genotipo_guidata___starts_with;
        private String genotipo_guidata___not___starts_with;
        private String genotipo_guidata___ends_with;
        private String genotipo_guidata___not___ends_with;
        private Boolean long_acting___eq;
        private Boolean long_acting___ne;
        private Boolean long_acting___null;
        private Boolean long_acting___not___null;
        private String motivazione_fine_ARV_princ____eq;
        private String motivazione_fine_ARV_princ____ne;
        private Boolean motivazione_fine_ARV_princ____null;
        private Boolean motivazione_fine_ARV_princ____not___null;
        private java.util.List<String> motivazione_fine_ARV_princ____in;
        private java.util.List<String> motivazione_fine_ARV_princ____not___in;
        private String motivazione_fine_ARV_princ____lt;
        private String motivazione_fine_ARV_princ____lte;
        private String motivazione_fine_ARV_princ____gt;
        private String motivazione_fine_ARV_princ____gte;
        private String motivazione_fine_ARV_princ____contains;
        private String motivazione_fine_ARV_princ____not___contains;
        private String motivazione_fine_ARV_princ____starts_with;
        private String motivazione_fine_ARV_princ____not___starts_with;
        private String motivazione_fine_ARV_princ____ends_with;
        private String motivazione_fine_ARV_princ____not___ends_with;
        private String motivazione_fine_ARV_sec____eq;
        private String motivazione_fine_ARV_sec____ne;
        private Boolean motivazione_fine_ARV_sec____null;
        private Boolean motivazione_fine_ARV_sec____not___null;
        private java.util.List<String> motivazione_fine_ARV_sec____in;
        private java.util.List<String> motivazione_fine_ARV_sec____not___in;
        private String motivazione_fine_ARV_sec____lt;
        private String motivazione_fine_ARV_sec____lte;
        private String motivazione_fine_ARV_sec____gt;
        private String motivazione_fine_ARV_sec____gte;
        private String motivazione_fine_ARV_sec____contains;
        private String motivazione_fine_ARV_sec____not___contains;
        private String motivazione_fine_ARV_sec____starts_with;
        private String motivazione_fine_ARV_sec____not___starts_with;
        private String motivazione_fine_ARV_sec____ends_with;
        private String motivazione_fine_ARV_sec____not___ends_with;
        private String motivazione_inizio_ARV____eq;
        private String motivazione_inizio_ARV____ne;
        private Boolean motivazione_inizio_ARV____null;
        private Boolean motivazione_inizio_ARV____not___null;
        private java.util.List<String> motivazione_inizio_ARV____in;
        private java.util.List<String> motivazione_inizio_ARV____not___in;
        private String motivazione_inizio_ARV____lt;
        private String motivazione_inizio_ARV____lte;
        private String motivazione_inizio_ARV____gt;
        private String motivazione_inizio_ARV____gte;
        private String motivazione_inizio_ARV____contains;
        private String motivazione_inizio_ARV____not___contains;
        private String motivazione_inizio_ARV____starts_with;
        private String motivazione_inizio_ARV____not___starts_with;
        private String motivazione_inizio_ARV____ends_with;
        private String motivazione_inizio_ARV____not___ends_with;
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
        private String nome_trial___eq;
        private String nome_trial___ne;
        private Boolean nome_trial___null;
        private Boolean nome_trial___not___null;
        private java.util.List<String> nome_trial___in;
        private java.util.List<String> nome_trial___not___in;
        private String nome_trial___lt;
        private String nome_trial___lte;
        private String nome_trial___gt;
        private String nome_trial___gte;
        private String nome_trial___contains;
        private String nome_trial___not___contains;
        private String nome_trial___starts_with;
        private String nome_trial___not___starts_with;
        private String nome_trial___ends_with;
        private String nome_trial___not___ends_with;
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
        private String once___eq;
        private String once___ne;
        private Boolean once___null;
        private Boolean once___not___null;
        private java.util.List<String> once___in;
        private java.util.List<String> once___not___in;
        private String once___lt;
        private String once___lte;
        private String once___gt;
        private String once___gte;
        private String once___contains;
        private String once___not___contains;
        private String once___starts_with;
        private String once___not___starts_with;
        private String once___ends_with;
        private String once___not___ends_with;
        private String user_team___eq;
        private String user_team___ne;
        private Boolean user_team___null;
        private Boolean user_team___not___null;
        private java.util.List<String> user_team___in;
        private java.util.List<String> user_team___not___in;
        private String user_team___lt;
        private String user_team___lte;
        private String user_team___gt;
        private String user_team___gte;
        private String user_team___contains;
        private String user_team___not___contains;
        private String user_team___starts_with;
        private String user_team___not___starts_with;
        private String user_team___ends_with;
        private String user_team___not___ends_with;
        private java.util.List<CliTerapia_ARVFilterDTO> AND;
        private java.util.List<CliTerapia_ARVFilterDTO> OR;
        private CliTerapia_ARVFilterDTO NOT;

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

        public Builder setAltro_inizio_terapia___eq(String altro_inizio_terapia___eq) {
            this.altro_inizio_terapia___eq = altro_inizio_terapia___eq;
            return this;
        }

        public Builder setAltro_inizio_terapia___ne(String altro_inizio_terapia___ne) {
            this.altro_inizio_terapia___ne = altro_inizio_terapia___ne;
            return this;
        }

        public Builder setAltro_inizio_terapia___null(Boolean altro_inizio_terapia___null) {
            this.altro_inizio_terapia___null = altro_inizio_terapia___null;
            return this;
        }

        public Builder setAltro_inizio_terapia___not___null(Boolean altro_inizio_terapia___not___null) {
            this.altro_inizio_terapia___not___null = altro_inizio_terapia___not___null;
            return this;
        }

        public Builder setAltro_inizio_terapia___in(java.util.List<String> altro_inizio_terapia___in) {
            this.altro_inizio_terapia___in = altro_inizio_terapia___in;
            return this;
        }

        public Builder setAltro_inizio_terapia___not___in(java.util.List<String> altro_inizio_terapia___not___in) {
            this.altro_inizio_terapia___not___in = altro_inizio_terapia___not___in;
            return this;
        }

        public Builder setAltro_inizio_terapia___lt(String altro_inizio_terapia___lt) {
            this.altro_inizio_terapia___lt = altro_inizio_terapia___lt;
            return this;
        }

        public Builder setAltro_inizio_terapia___lte(String altro_inizio_terapia___lte) {
            this.altro_inizio_terapia___lte = altro_inizio_terapia___lte;
            return this;
        }

        public Builder setAltro_inizio_terapia___gt(String altro_inizio_terapia___gt) {
            this.altro_inizio_terapia___gt = altro_inizio_terapia___gt;
            return this;
        }

        public Builder setAltro_inizio_terapia___gte(String altro_inizio_terapia___gte) {
            this.altro_inizio_terapia___gte = altro_inizio_terapia___gte;
            return this;
        }

        public Builder setAltro_inizio_terapia___contains(String altro_inizio_terapia___contains) {
            this.altro_inizio_terapia___contains = altro_inizio_terapia___contains;
            return this;
        }

        public Builder setAltro_inizio_terapia___not___contains(String altro_inizio_terapia___not___contains) {
            this.altro_inizio_terapia___not___contains = altro_inizio_terapia___not___contains;
            return this;
        }

        public Builder setAltro_inizio_terapia___starts_with(String altro_inizio_terapia___starts_with) {
            this.altro_inizio_terapia___starts_with = altro_inizio_terapia___starts_with;
            return this;
        }

        public Builder setAltro_inizio_terapia___not___starts_with(String altro_inizio_terapia___not___starts_with) {
            this.altro_inizio_terapia___not___starts_with = altro_inizio_terapia___not___starts_with;
            return this;
        }

        public Builder setAltro_inizio_terapia___ends_with(String altro_inizio_terapia___ends_with) {
            this.altro_inizio_terapia___ends_with = altro_inizio_terapia___ends_with;
            return this;
        }

        public Builder setAltro_inizio_terapia___not___ends_with(String altro_inizio_terapia___not___ends_with) {
            this.altro_inizio_terapia___not___ends_with = altro_inizio_terapia___not___ends_with;
            return this;
        }

        public Builder setAltro_variazione_terapia___eq(String altro_variazione_terapia___eq) {
            this.altro_variazione_terapia___eq = altro_variazione_terapia___eq;
            return this;
        }

        public Builder setAltro_variazione_terapia___ne(String altro_variazione_terapia___ne) {
            this.altro_variazione_terapia___ne = altro_variazione_terapia___ne;
            return this;
        }

        public Builder setAltro_variazione_terapia___null(Boolean altro_variazione_terapia___null) {
            this.altro_variazione_terapia___null = altro_variazione_terapia___null;
            return this;
        }

        public Builder setAltro_variazione_terapia___not___null(Boolean altro_variazione_terapia___not___null) {
            this.altro_variazione_terapia___not___null = altro_variazione_terapia___not___null;
            return this;
        }

        public Builder setAltro_variazione_terapia___in(java.util.List<String> altro_variazione_terapia___in) {
            this.altro_variazione_terapia___in = altro_variazione_terapia___in;
            return this;
        }

        public Builder setAltro_variazione_terapia___not___in(java.util.List<String> altro_variazione_terapia___not___in) {
            this.altro_variazione_terapia___not___in = altro_variazione_terapia___not___in;
            return this;
        }

        public Builder setAltro_variazione_terapia___lt(String altro_variazione_terapia___lt) {
            this.altro_variazione_terapia___lt = altro_variazione_terapia___lt;
            return this;
        }

        public Builder setAltro_variazione_terapia___lte(String altro_variazione_terapia___lte) {
            this.altro_variazione_terapia___lte = altro_variazione_terapia___lte;
            return this;
        }

        public Builder setAltro_variazione_terapia___gt(String altro_variazione_terapia___gt) {
            this.altro_variazione_terapia___gt = altro_variazione_terapia___gt;
            return this;
        }

        public Builder setAltro_variazione_terapia___gte(String altro_variazione_terapia___gte) {
            this.altro_variazione_terapia___gte = altro_variazione_terapia___gte;
            return this;
        }

        public Builder setAltro_variazione_terapia___contains(String altro_variazione_terapia___contains) {
            this.altro_variazione_terapia___contains = altro_variazione_terapia___contains;
            return this;
        }

        public Builder setAltro_variazione_terapia___not___contains(String altro_variazione_terapia___not___contains) {
            this.altro_variazione_terapia___not___contains = altro_variazione_terapia___not___contains;
            return this;
        }

        public Builder setAltro_variazione_terapia___starts_with(String altro_variazione_terapia___starts_with) {
            this.altro_variazione_terapia___starts_with = altro_variazione_terapia___starts_with;
            return this;
        }

        public Builder setAltro_variazione_terapia___not___starts_with(String altro_variazione_terapia___not___starts_with) {
            this.altro_variazione_terapia___not___starts_with = altro_variazione_terapia___not___starts_with;
            return this;
        }

        public Builder setAltro_variazione_terapia___ends_with(String altro_variazione_terapia___ends_with) {
            this.altro_variazione_terapia___ends_with = altro_variazione_terapia___ends_with;
            return this;
        }

        public Builder setAltro_variazione_terapia___not___ends_with(String altro_variazione_terapia___not___ends_with) {
            this.altro_variazione_terapia___not___ends_with = altro_variazione_terapia___not___ends_with;
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

        public Builder setBooster___eq(String booster___eq) {
            this.booster___eq = booster___eq;
            return this;
        }

        public Builder setBooster___ne(String booster___ne) {
            this.booster___ne = booster___ne;
            return this;
        }

        public Builder setBooster___null(Boolean booster___null) {
            this.booster___null = booster___null;
            return this;
        }

        public Builder setBooster___not___null(Boolean booster___not___null) {
            this.booster___not___null = booster___not___null;
            return this;
        }

        public Builder setBooster___in(java.util.List<String> booster___in) {
            this.booster___in = booster___in;
            return this;
        }

        public Builder setBooster___not___in(java.util.List<String> booster___not___in) {
            this.booster___not___in = booster___not___in;
            return this;
        }

        public Builder setBooster___lt(String booster___lt) {
            this.booster___lt = booster___lt;
            return this;
        }

        public Builder setBooster___lte(String booster___lte) {
            this.booster___lte = booster___lte;
            return this;
        }

        public Builder setBooster___gt(String booster___gt) {
            this.booster___gt = booster___gt;
            return this;
        }

        public Builder setBooster___gte(String booster___gte) {
            this.booster___gte = booster___gte;
            return this;
        }

        public Builder setBooster___contains(String booster___contains) {
            this.booster___contains = booster___contains;
            return this;
        }

        public Builder setBooster___not___contains(String booster___not___contains) {
            this.booster___not___contains = booster___not___contains;
            return this;
        }

        public Builder setBooster___starts_with(String booster___starts_with) {
            this.booster___starts_with = booster___starts_with;
            return this;
        }

        public Builder setBooster___not___starts_with(String booster___not___starts_with) {
            this.booster___not___starts_with = booster___not___starts_with;
            return this;
        }

        public Builder setBooster___ends_with(String booster___ends_with) {
            this.booster___ends_with = booster___ends_with;
            return this;
        }

        public Builder setBooster___not___ends_with(String booster___not___ends_with) {
            this.booster___not___ends_with = booster___not___ends_with;
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

        public Builder setDisponibile_generico___eq(Boolean disponibile_generico___eq) {
            this.disponibile_generico___eq = disponibile_generico___eq;
            return this;
        }

        public Builder setDisponibile_generico___ne(Boolean disponibile_generico___ne) {
            this.disponibile_generico___ne = disponibile_generico___ne;
            return this;
        }

        public Builder setDisponibile_generico___null(Boolean disponibile_generico___null) {
            this.disponibile_generico___null = disponibile_generico___null;
            return this;
        }

        public Builder setDisponibile_generico___not___null(Boolean disponibile_generico___not___null) {
            this.disponibile_generico___not___null = disponibile_generico___not___null;
            return this;
        }

        public Builder setDoppio_cieco___eq(Boolean doppio_cieco___eq) {
            this.doppio_cieco___eq = doppio_cieco___eq;
            return this;
        }

        public Builder setDoppio_cieco___ne(Boolean doppio_cieco___ne) {
            this.doppio_cieco___ne = doppio_cieco___ne;
            return this;
        }

        public Builder setDoppio_cieco___null(Boolean doppio_cieco___null) {
            this.doppio_cieco___null = doppio_cieco___null;
            return this;
        }

        public Builder setDoppio_cieco___not___null(Boolean doppio_cieco___not___null) {
            this.doppio_cieco___not___null = doppio_cieco___not___null;
            return this;
        }

        public Builder setDosaggi_count___eq(Integer dosaggi_count___eq) {
            this.dosaggi_count___eq = dosaggi_count___eq;
            return this;
        }

        public Builder setDosaggi_count___ne(Integer dosaggi_count___ne) {
            this.dosaggi_count___ne = dosaggi_count___ne;
            return this;
        }

        public Builder setDosaggi_count___null(Boolean dosaggi_count___null) {
            this.dosaggi_count___null = dosaggi_count___null;
            return this;
        }

        public Builder setDosaggi_count___not___null(Boolean dosaggi_count___not___null) {
            this.dosaggi_count___not___null = dosaggi_count___not___null;
            return this;
        }

        public Builder setDosaggi_count___in(java.util.List<Integer> dosaggi_count___in) {
            this.dosaggi_count___in = dosaggi_count___in;
            return this;
        }

        public Builder setDosaggi_count___not___in(java.util.List<Integer> dosaggi_count___not___in) {
            this.dosaggi_count___not___in = dosaggi_count___not___in;
            return this;
        }

        public Builder setDosaggi_count___lt(Integer dosaggi_count___lt) {
            this.dosaggi_count___lt = dosaggi_count___lt;
            return this;
        }

        public Builder setDosaggi_count___lte(Integer dosaggi_count___lte) {
            this.dosaggi_count___lte = dosaggi_count___lte;
            return this;
        }

        public Builder setDosaggi_count___gt(Integer dosaggi_count___gt) {
            this.dosaggi_count___gt = dosaggi_count___gt;
            return this;
        }

        public Builder setDosaggi_count___gte(Integer dosaggi_count___gte) {
            this.dosaggi_count___gte = dosaggi_count___gte;
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

        public Builder setFiltro_farmaco___eq(String filtro_farmaco___eq) {
            this.filtro_farmaco___eq = filtro_farmaco___eq;
            return this;
        }

        public Builder setFiltro_farmaco___ne(String filtro_farmaco___ne) {
            this.filtro_farmaco___ne = filtro_farmaco___ne;
            return this;
        }

        public Builder setFiltro_farmaco___null(Boolean filtro_farmaco___null) {
            this.filtro_farmaco___null = filtro_farmaco___null;
            return this;
        }

        public Builder setFiltro_farmaco___not___null(Boolean filtro_farmaco___not___null) {
            this.filtro_farmaco___not___null = filtro_farmaco___not___null;
            return this;
        }

        public Builder setFiltro_farmaco___in(java.util.List<String> filtro_farmaco___in) {
            this.filtro_farmaco___in = filtro_farmaco___in;
            return this;
        }

        public Builder setFiltro_farmaco___not___in(java.util.List<String> filtro_farmaco___not___in) {
            this.filtro_farmaco___not___in = filtro_farmaco___not___in;
            return this;
        }

        public Builder setFiltro_farmaco___lt(String filtro_farmaco___lt) {
            this.filtro_farmaco___lt = filtro_farmaco___lt;
            return this;
        }

        public Builder setFiltro_farmaco___lte(String filtro_farmaco___lte) {
            this.filtro_farmaco___lte = filtro_farmaco___lte;
            return this;
        }

        public Builder setFiltro_farmaco___gt(String filtro_farmaco___gt) {
            this.filtro_farmaco___gt = filtro_farmaco___gt;
            return this;
        }

        public Builder setFiltro_farmaco___gte(String filtro_farmaco___gte) {
            this.filtro_farmaco___gte = filtro_farmaco___gte;
            return this;
        }

        public Builder setFiltro_farmaco___contains(String filtro_farmaco___contains) {
            this.filtro_farmaco___contains = filtro_farmaco___contains;
            return this;
        }

        public Builder setFiltro_farmaco___not___contains(String filtro_farmaco___not___contains) {
            this.filtro_farmaco___not___contains = filtro_farmaco___not___contains;
            return this;
        }

        public Builder setFiltro_farmaco___starts_with(String filtro_farmaco___starts_with) {
            this.filtro_farmaco___starts_with = filtro_farmaco___starts_with;
            return this;
        }

        public Builder setFiltro_farmaco___not___starts_with(String filtro_farmaco___not___starts_with) {
            this.filtro_farmaco___not___starts_with = filtro_farmaco___not___starts_with;
            return this;
        }

        public Builder setFiltro_farmaco___ends_with(String filtro_farmaco___ends_with) {
            this.filtro_farmaco___ends_with = filtro_farmaco___ends_with;
            return this;
        }

        public Builder setFiltro_farmaco___not___ends_with(String filtro_farmaco___not___ends_with) {
            this.filtro_farmaco___not___ends_with = filtro_farmaco___not___ends_with;
            return this;
        }

        public Builder setGenerico___eq(String generico___eq) {
            this.generico___eq = generico___eq;
            return this;
        }

        public Builder setGenerico___ne(String generico___ne) {
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

        public Builder setGenerico___in(java.util.List<String> generico___in) {
            this.generico___in = generico___in;
            return this;
        }

        public Builder setGenerico___not___in(java.util.List<String> generico___not___in) {
            this.generico___not___in = generico___not___in;
            return this;
        }

        public Builder setGenerico___lt(String generico___lt) {
            this.generico___lt = generico___lt;
            return this;
        }

        public Builder setGenerico___lte(String generico___lte) {
            this.generico___lte = generico___lte;
            return this;
        }

        public Builder setGenerico___gt(String generico___gt) {
            this.generico___gt = generico___gt;
            return this;
        }

        public Builder setGenerico___gte(String generico___gte) {
            this.generico___gte = generico___gte;
            return this;
        }

        public Builder setGenerico___contains(String generico___contains) {
            this.generico___contains = generico___contains;
            return this;
        }

        public Builder setGenerico___not___contains(String generico___not___contains) {
            this.generico___not___contains = generico___not___contains;
            return this;
        }

        public Builder setGenerico___starts_with(String generico___starts_with) {
            this.generico___starts_with = generico___starts_with;
            return this;
        }

        public Builder setGenerico___not___starts_with(String generico___not___starts_with) {
            this.generico___not___starts_with = generico___not___starts_with;
            return this;
        }

        public Builder setGenerico___ends_with(String generico___ends_with) {
            this.generico___ends_with = generico___ends_with;
            return this;
        }

        public Builder setGenerico___not___ends_with(String generico___not___ends_with) {
            this.generico___not___ends_with = generico___not___ends_with;
            return this;
        }

        public Builder setGenotipo_guidata___eq(String genotipo_guidata___eq) {
            this.genotipo_guidata___eq = genotipo_guidata___eq;
            return this;
        }

        public Builder setGenotipo_guidata___ne(String genotipo_guidata___ne) {
            this.genotipo_guidata___ne = genotipo_guidata___ne;
            return this;
        }

        public Builder setGenotipo_guidata___null(Boolean genotipo_guidata___null) {
            this.genotipo_guidata___null = genotipo_guidata___null;
            return this;
        }

        public Builder setGenotipo_guidata___not___null(Boolean genotipo_guidata___not___null) {
            this.genotipo_guidata___not___null = genotipo_guidata___not___null;
            return this;
        }

        public Builder setGenotipo_guidata___in(java.util.List<String> genotipo_guidata___in) {
            this.genotipo_guidata___in = genotipo_guidata___in;
            return this;
        }

        public Builder setGenotipo_guidata___not___in(java.util.List<String> genotipo_guidata___not___in) {
            this.genotipo_guidata___not___in = genotipo_guidata___not___in;
            return this;
        }

        public Builder setGenotipo_guidata___lt(String genotipo_guidata___lt) {
            this.genotipo_guidata___lt = genotipo_guidata___lt;
            return this;
        }

        public Builder setGenotipo_guidata___lte(String genotipo_guidata___lte) {
            this.genotipo_guidata___lte = genotipo_guidata___lte;
            return this;
        }

        public Builder setGenotipo_guidata___gt(String genotipo_guidata___gt) {
            this.genotipo_guidata___gt = genotipo_guidata___gt;
            return this;
        }

        public Builder setGenotipo_guidata___gte(String genotipo_guidata___gte) {
            this.genotipo_guidata___gte = genotipo_guidata___gte;
            return this;
        }

        public Builder setGenotipo_guidata___contains(String genotipo_guidata___contains) {
            this.genotipo_guidata___contains = genotipo_guidata___contains;
            return this;
        }

        public Builder setGenotipo_guidata___not___contains(String genotipo_guidata___not___contains) {
            this.genotipo_guidata___not___contains = genotipo_guidata___not___contains;
            return this;
        }

        public Builder setGenotipo_guidata___starts_with(String genotipo_guidata___starts_with) {
            this.genotipo_guidata___starts_with = genotipo_guidata___starts_with;
            return this;
        }

        public Builder setGenotipo_guidata___not___starts_with(String genotipo_guidata___not___starts_with) {
            this.genotipo_guidata___not___starts_with = genotipo_guidata___not___starts_with;
            return this;
        }

        public Builder setGenotipo_guidata___ends_with(String genotipo_guidata___ends_with) {
            this.genotipo_guidata___ends_with = genotipo_guidata___ends_with;
            return this;
        }

        public Builder setGenotipo_guidata___not___ends_with(String genotipo_guidata___not___ends_with) {
            this.genotipo_guidata___not___ends_with = genotipo_guidata___not___ends_with;
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

        public Builder setMotivazione_fine_ARV_princ____eq(String motivazione_fine_ARV_princ____eq) {
            this.motivazione_fine_ARV_princ____eq = motivazione_fine_ARV_princ____eq;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____ne(String motivazione_fine_ARV_princ____ne) {
            this.motivazione_fine_ARV_princ____ne = motivazione_fine_ARV_princ____ne;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____null(Boolean motivazione_fine_ARV_princ____null) {
            this.motivazione_fine_ARV_princ____null = motivazione_fine_ARV_princ____null;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____not___null(Boolean motivazione_fine_ARV_princ____not___null) {
            this.motivazione_fine_ARV_princ____not___null = motivazione_fine_ARV_princ____not___null;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____in(java.util.List<String> motivazione_fine_ARV_princ____in) {
            this.motivazione_fine_ARV_princ____in = motivazione_fine_ARV_princ____in;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____not___in(java.util.List<String> motivazione_fine_ARV_princ____not___in) {
            this.motivazione_fine_ARV_princ____not___in = motivazione_fine_ARV_princ____not___in;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____lt(String motivazione_fine_ARV_princ____lt) {
            this.motivazione_fine_ARV_princ____lt = motivazione_fine_ARV_princ____lt;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____lte(String motivazione_fine_ARV_princ____lte) {
            this.motivazione_fine_ARV_princ____lte = motivazione_fine_ARV_princ____lte;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____gt(String motivazione_fine_ARV_princ____gt) {
            this.motivazione_fine_ARV_princ____gt = motivazione_fine_ARV_princ____gt;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____gte(String motivazione_fine_ARV_princ____gte) {
            this.motivazione_fine_ARV_princ____gte = motivazione_fine_ARV_princ____gte;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____contains(String motivazione_fine_ARV_princ____contains) {
            this.motivazione_fine_ARV_princ____contains = motivazione_fine_ARV_princ____contains;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____not___contains(String motivazione_fine_ARV_princ____not___contains) {
            this.motivazione_fine_ARV_princ____not___contains = motivazione_fine_ARV_princ____not___contains;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____starts_with(String motivazione_fine_ARV_princ____starts_with) {
            this.motivazione_fine_ARV_princ____starts_with = motivazione_fine_ARV_princ____starts_with;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____not___starts_with(String motivazione_fine_ARV_princ____not___starts_with) {
            this.motivazione_fine_ARV_princ____not___starts_with = motivazione_fine_ARV_princ____not___starts_with;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____ends_with(String motivazione_fine_ARV_princ____ends_with) {
            this.motivazione_fine_ARV_princ____ends_with = motivazione_fine_ARV_princ____ends_with;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ____not___ends_with(String motivazione_fine_ARV_princ____not___ends_with) {
            this.motivazione_fine_ARV_princ____not___ends_with = motivazione_fine_ARV_princ____not___ends_with;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____eq(String motivazione_fine_ARV_sec____eq) {
            this.motivazione_fine_ARV_sec____eq = motivazione_fine_ARV_sec____eq;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____ne(String motivazione_fine_ARV_sec____ne) {
            this.motivazione_fine_ARV_sec____ne = motivazione_fine_ARV_sec____ne;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____null(Boolean motivazione_fine_ARV_sec____null) {
            this.motivazione_fine_ARV_sec____null = motivazione_fine_ARV_sec____null;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____not___null(Boolean motivazione_fine_ARV_sec____not___null) {
            this.motivazione_fine_ARV_sec____not___null = motivazione_fine_ARV_sec____not___null;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____in(java.util.List<String> motivazione_fine_ARV_sec____in) {
            this.motivazione_fine_ARV_sec____in = motivazione_fine_ARV_sec____in;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____not___in(java.util.List<String> motivazione_fine_ARV_sec____not___in) {
            this.motivazione_fine_ARV_sec____not___in = motivazione_fine_ARV_sec____not___in;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____lt(String motivazione_fine_ARV_sec____lt) {
            this.motivazione_fine_ARV_sec____lt = motivazione_fine_ARV_sec____lt;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____lte(String motivazione_fine_ARV_sec____lte) {
            this.motivazione_fine_ARV_sec____lte = motivazione_fine_ARV_sec____lte;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____gt(String motivazione_fine_ARV_sec____gt) {
            this.motivazione_fine_ARV_sec____gt = motivazione_fine_ARV_sec____gt;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____gte(String motivazione_fine_ARV_sec____gte) {
            this.motivazione_fine_ARV_sec____gte = motivazione_fine_ARV_sec____gte;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____contains(String motivazione_fine_ARV_sec____contains) {
            this.motivazione_fine_ARV_sec____contains = motivazione_fine_ARV_sec____contains;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____not___contains(String motivazione_fine_ARV_sec____not___contains) {
            this.motivazione_fine_ARV_sec____not___contains = motivazione_fine_ARV_sec____not___contains;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____starts_with(String motivazione_fine_ARV_sec____starts_with) {
            this.motivazione_fine_ARV_sec____starts_with = motivazione_fine_ARV_sec____starts_with;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____not___starts_with(String motivazione_fine_ARV_sec____not___starts_with) {
            this.motivazione_fine_ARV_sec____not___starts_with = motivazione_fine_ARV_sec____not___starts_with;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____ends_with(String motivazione_fine_ARV_sec____ends_with) {
            this.motivazione_fine_ARV_sec____ends_with = motivazione_fine_ARV_sec____ends_with;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec____not___ends_with(String motivazione_fine_ARV_sec____not___ends_with) {
            this.motivazione_fine_ARV_sec____not___ends_with = motivazione_fine_ARV_sec____not___ends_with;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____eq(String motivazione_inizio_ARV____eq) {
            this.motivazione_inizio_ARV____eq = motivazione_inizio_ARV____eq;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____ne(String motivazione_inizio_ARV____ne) {
            this.motivazione_inizio_ARV____ne = motivazione_inizio_ARV____ne;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____null(Boolean motivazione_inizio_ARV____null) {
            this.motivazione_inizio_ARV____null = motivazione_inizio_ARV____null;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____not___null(Boolean motivazione_inizio_ARV____not___null) {
            this.motivazione_inizio_ARV____not___null = motivazione_inizio_ARV____not___null;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____in(java.util.List<String> motivazione_inizio_ARV____in) {
            this.motivazione_inizio_ARV____in = motivazione_inizio_ARV____in;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____not___in(java.util.List<String> motivazione_inizio_ARV____not___in) {
            this.motivazione_inizio_ARV____not___in = motivazione_inizio_ARV____not___in;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____lt(String motivazione_inizio_ARV____lt) {
            this.motivazione_inizio_ARV____lt = motivazione_inizio_ARV____lt;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____lte(String motivazione_inizio_ARV____lte) {
            this.motivazione_inizio_ARV____lte = motivazione_inizio_ARV____lte;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____gt(String motivazione_inizio_ARV____gt) {
            this.motivazione_inizio_ARV____gt = motivazione_inizio_ARV____gt;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____gte(String motivazione_inizio_ARV____gte) {
            this.motivazione_inizio_ARV____gte = motivazione_inizio_ARV____gte;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____contains(String motivazione_inizio_ARV____contains) {
            this.motivazione_inizio_ARV____contains = motivazione_inizio_ARV____contains;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____not___contains(String motivazione_inizio_ARV____not___contains) {
            this.motivazione_inizio_ARV____not___contains = motivazione_inizio_ARV____not___contains;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____starts_with(String motivazione_inizio_ARV____starts_with) {
            this.motivazione_inizio_ARV____starts_with = motivazione_inizio_ARV____starts_with;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____not___starts_with(String motivazione_inizio_ARV____not___starts_with) {
            this.motivazione_inizio_ARV____not___starts_with = motivazione_inizio_ARV____not___starts_with;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____ends_with(String motivazione_inizio_ARV____ends_with) {
            this.motivazione_inizio_ARV____ends_with = motivazione_inizio_ARV____ends_with;
            return this;
        }

        public Builder setMotivazione_inizio_ARV____not___ends_with(String motivazione_inizio_ARV____not___ends_with) {
            this.motivazione_inizio_ARV____not___ends_with = motivazione_inizio_ARV____not___ends_with;
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

        public Builder setNome_trial___eq(String nome_trial___eq) {
            this.nome_trial___eq = nome_trial___eq;
            return this;
        }

        public Builder setNome_trial___ne(String nome_trial___ne) {
            this.nome_trial___ne = nome_trial___ne;
            return this;
        }

        public Builder setNome_trial___null(Boolean nome_trial___null) {
            this.nome_trial___null = nome_trial___null;
            return this;
        }

        public Builder setNome_trial___not___null(Boolean nome_trial___not___null) {
            this.nome_trial___not___null = nome_trial___not___null;
            return this;
        }

        public Builder setNome_trial___in(java.util.List<String> nome_trial___in) {
            this.nome_trial___in = nome_trial___in;
            return this;
        }

        public Builder setNome_trial___not___in(java.util.List<String> nome_trial___not___in) {
            this.nome_trial___not___in = nome_trial___not___in;
            return this;
        }

        public Builder setNome_trial___lt(String nome_trial___lt) {
            this.nome_trial___lt = nome_trial___lt;
            return this;
        }

        public Builder setNome_trial___lte(String nome_trial___lte) {
            this.nome_trial___lte = nome_trial___lte;
            return this;
        }

        public Builder setNome_trial___gt(String nome_trial___gt) {
            this.nome_trial___gt = nome_trial___gt;
            return this;
        }

        public Builder setNome_trial___gte(String nome_trial___gte) {
            this.nome_trial___gte = nome_trial___gte;
            return this;
        }

        public Builder setNome_trial___contains(String nome_trial___contains) {
            this.nome_trial___contains = nome_trial___contains;
            return this;
        }

        public Builder setNome_trial___not___contains(String nome_trial___not___contains) {
            this.nome_trial___not___contains = nome_trial___not___contains;
            return this;
        }

        public Builder setNome_trial___starts_with(String nome_trial___starts_with) {
            this.nome_trial___starts_with = nome_trial___starts_with;
            return this;
        }

        public Builder setNome_trial___not___starts_with(String nome_trial___not___starts_with) {
            this.nome_trial___not___starts_with = nome_trial___not___starts_with;
            return this;
        }

        public Builder setNome_trial___ends_with(String nome_trial___ends_with) {
            this.nome_trial___ends_with = nome_trial___ends_with;
            return this;
        }

        public Builder setNome_trial___not___ends_with(String nome_trial___not___ends_with) {
            this.nome_trial___not___ends_with = nome_trial___not___ends_with;
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

        public Builder setOnce___eq(String once___eq) {
            this.once___eq = once___eq;
            return this;
        }

        public Builder setOnce___ne(String once___ne) {
            this.once___ne = once___ne;
            return this;
        }

        public Builder setOnce___null(Boolean once___null) {
            this.once___null = once___null;
            return this;
        }

        public Builder setOnce___not___null(Boolean once___not___null) {
            this.once___not___null = once___not___null;
            return this;
        }

        public Builder setOnce___in(java.util.List<String> once___in) {
            this.once___in = once___in;
            return this;
        }

        public Builder setOnce___not___in(java.util.List<String> once___not___in) {
            this.once___not___in = once___not___in;
            return this;
        }

        public Builder setOnce___lt(String once___lt) {
            this.once___lt = once___lt;
            return this;
        }

        public Builder setOnce___lte(String once___lte) {
            this.once___lte = once___lte;
            return this;
        }

        public Builder setOnce___gt(String once___gt) {
            this.once___gt = once___gt;
            return this;
        }

        public Builder setOnce___gte(String once___gte) {
            this.once___gte = once___gte;
            return this;
        }

        public Builder setOnce___contains(String once___contains) {
            this.once___contains = once___contains;
            return this;
        }

        public Builder setOnce___not___contains(String once___not___contains) {
            this.once___not___contains = once___not___contains;
            return this;
        }

        public Builder setOnce___starts_with(String once___starts_with) {
            this.once___starts_with = once___starts_with;
            return this;
        }

        public Builder setOnce___not___starts_with(String once___not___starts_with) {
            this.once___not___starts_with = once___not___starts_with;
            return this;
        }

        public Builder setOnce___ends_with(String once___ends_with) {
            this.once___ends_with = once___ends_with;
            return this;
        }

        public Builder setOnce___not___ends_with(String once___not___ends_with) {
            this.once___not___ends_with = once___not___ends_with;
            return this;
        }

        public Builder setUser_team___eq(String user_team___eq) {
            this.user_team___eq = user_team___eq;
            return this;
        }

        public Builder setUser_team___ne(String user_team___ne) {
            this.user_team___ne = user_team___ne;
            return this;
        }

        public Builder setUser_team___null(Boolean user_team___null) {
            this.user_team___null = user_team___null;
            return this;
        }

        public Builder setUser_team___not___null(Boolean user_team___not___null) {
            this.user_team___not___null = user_team___not___null;
            return this;
        }

        public Builder setUser_team___in(java.util.List<String> user_team___in) {
            this.user_team___in = user_team___in;
            return this;
        }

        public Builder setUser_team___not___in(java.util.List<String> user_team___not___in) {
            this.user_team___not___in = user_team___not___in;
            return this;
        }

        public Builder setUser_team___lt(String user_team___lt) {
            this.user_team___lt = user_team___lt;
            return this;
        }

        public Builder setUser_team___lte(String user_team___lte) {
            this.user_team___lte = user_team___lte;
            return this;
        }

        public Builder setUser_team___gt(String user_team___gt) {
            this.user_team___gt = user_team___gt;
            return this;
        }

        public Builder setUser_team___gte(String user_team___gte) {
            this.user_team___gte = user_team___gte;
            return this;
        }

        public Builder setUser_team___contains(String user_team___contains) {
            this.user_team___contains = user_team___contains;
            return this;
        }

        public Builder setUser_team___not___contains(String user_team___not___contains) {
            this.user_team___not___contains = user_team___not___contains;
            return this;
        }

        public Builder setUser_team___starts_with(String user_team___starts_with) {
            this.user_team___starts_with = user_team___starts_with;
            return this;
        }

        public Builder setUser_team___not___starts_with(String user_team___not___starts_with) {
            this.user_team___not___starts_with = user_team___not___starts_with;
            return this;
        }

        public Builder setUser_team___ends_with(String user_team___ends_with) {
            this.user_team___ends_with = user_team___ends_with;
            return this;
        }

        public Builder setUser_team___not___ends_with(String user_team___not___ends_with) {
            this.user_team___not___ends_with = user_team___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliTerapia_ARVFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliTerapia_ARVFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliTerapia_ARVFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliTerapia_ARVFilterDTO build() {
            CliTerapia_ARVFilterDTO result = new CliTerapia_ARVFilterDTO();
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
            result.setAltro_inizio_terapia___eq(this.altro_inizio_terapia___eq);
            result.setAltro_inizio_terapia___ne(this.altro_inizio_terapia___ne);
            result.setAltro_inizio_terapia___null(this.altro_inizio_terapia___null);
            result.setAltro_inizio_terapia___not___null(this.altro_inizio_terapia___not___null);
            result.setAltro_inizio_terapia___in(this.altro_inizio_terapia___in);
            result.setAltro_inizio_terapia___not___in(this.altro_inizio_terapia___not___in);
            result.setAltro_inizio_terapia___lt(this.altro_inizio_terapia___lt);
            result.setAltro_inizio_terapia___lte(this.altro_inizio_terapia___lte);
            result.setAltro_inizio_terapia___gt(this.altro_inizio_terapia___gt);
            result.setAltro_inizio_terapia___gte(this.altro_inizio_terapia___gte);
            result.setAltro_inizio_terapia___contains(this.altro_inizio_terapia___contains);
            result.setAltro_inizio_terapia___not___contains(this.altro_inizio_terapia___not___contains);
            result.setAltro_inizio_terapia___starts_with(this.altro_inizio_terapia___starts_with);
            result.setAltro_inizio_terapia___not___starts_with(this.altro_inizio_terapia___not___starts_with);
            result.setAltro_inizio_terapia___ends_with(this.altro_inizio_terapia___ends_with);
            result.setAltro_inizio_terapia___not___ends_with(this.altro_inizio_terapia___not___ends_with);
            result.setAltro_variazione_terapia___eq(this.altro_variazione_terapia___eq);
            result.setAltro_variazione_terapia___ne(this.altro_variazione_terapia___ne);
            result.setAltro_variazione_terapia___null(this.altro_variazione_terapia___null);
            result.setAltro_variazione_terapia___not___null(this.altro_variazione_terapia___not___null);
            result.setAltro_variazione_terapia___in(this.altro_variazione_terapia___in);
            result.setAltro_variazione_terapia___not___in(this.altro_variazione_terapia___not___in);
            result.setAltro_variazione_terapia___lt(this.altro_variazione_terapia___lt);
            result.setAltro_variazione_terapia___lte(this.altro_variazione_terapia___lte);
            result.setAltro_variazione_terapia___gt(this.altro_variazione_terapia___gt);
            result.setAltro_variazione_terapia___gte(this.altro_variazione_terapia___gte);
            result.setAltro_variazione_terapia___contains(this.altro_variazione_terapia___contains);
            result.setAltro_variazione_terapia___not___contains(this.altro_variazione_terapia___not___contains);
            result.setAltro_variazione_terapia___starts_with(this.altro_variazione_terapia___starts_with);
            result.setAltro_variazione_terapia___not___starts_with(this.altro_variazione_terapia___not___starts_with);
            result.setAltro_variazione_terapia___ends_with(this.altro_variazione_terapia___ends_with);
            result.setAltro_variazione_terapia___not___ends_with(this.altro_variazione_terapia___not___ends_with);
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
            result.setBooster___eq(this.booster___eq);
            result.setBooster___ne(this.booster___ne);
            result.setBooster___null(this.booster___null);
            result.setBooster___not___null(this.booster___not___null);
            result.setBooster___in(this.booster___in);
            result.setBooster___not___in(this.booster___not___in);
            result.setBooster___lt(this.booster___lt);
            result.setBooster___lte(this.booster___lte);
            result.setBooster___gt(this.booster___gt);
            result.setBooster___gte(this.booster___gte);
            result.setBooster___contains(this.booster___contains);
            result.setBooster___not___contains(this.booster___not___contains);
            result.setBooster___starts_with(this.booster___starts_with);
            result.setBooster___not___starts_with(this.booster___not___starts_with);
            result.setBooster___ends_with(this.booster___ends_with);
            result.setBooster___not___ends_with(this.booster___not___ends_with);
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
            result.setDisponibile_generico___eq(this.disponibile_generico___eq);
            result.setDisponibile_generico___ne(this.disponibile_generico___ne);
            result.setDisponibile_generico___null(this.disponibile_generico___null);
            result.setDisponibile_generico___not___null(this.disponibile_generico___not___null);
            result.setDoppio_cieco___eq(this.doppio_cieco___eq);
            result.setDoppio_cieco___ne(this.doppio_cieco___ne);
            result.setDoppio_cieco___null(this.doppio_cieco___null);
            result.setDoppio_cieco___not___null(this.doppio_cieco___not___null);
            result.setDosaggi_count___eq(this.dosaggi_count___eq);
            result.setDosaggi_count___ne(this.dosaggi_count___ne);
            result.setDosaggi_count___null(this.dosaggi_count___null);
            result.setDosaggi_count___not___null(this.dosaggi_count___not___null);
            result.setDosaggi_count___in(this.dosaggi_count___in);
            result.setDosaggi_count___not___in(this.dosaggi_count___not___in);
            result.setDosaggi_count___lt(this.dosaggi_count___lt);
            result.setDosaggi_count___lte(this.dosaggi_count___lte);
            result.setDosaggi_count___gt(this.dosaggi_count___gt);
            result.setDosaggi_count___gte(this.dosaggi_count___gte);
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
            result.setFiltro_farmaco___eq(this.filtro_farmaco___eq);
            result.setFiltro_farmaco___ne(this.filtro_farmaco___ne);
            result.setFiltro_farmaco___null(this.filtro_farmaco___null);
            result.setFiltro_farmaco___not___null(this.filtro_farmaco___not___null);
            result.setFiltro_farmaco___in(this.filtro_farmaco___in);
            result.setFiltro_farmaco___not___in(this.filtro_farmaco___not___in);
            result.setFiltro_farmaco___lt(this.filtro_farmaco___lt);
            result.setFiltro_farmaco___lte(this.filtro_farmaco___lte);
            result.setFiltro_farmaco___gt(this.filtro_farmaco___gt);
            result.setFiltro_farmaco___gte(this.filtro_farmaco___gte);
            result.setFiltro_farmaco___contains(this.filtro_farmaco___contains);
            result.setFiltro_farmaco___not___contains(this.filtro_farmaco___not___contains);
            result.setFiltro_farmaco___starts_with(this.filtro_farmaco___starts_with);
            result.setFiltro_farmaco___not___starts_with(this.filtro_farmaco___not___starts_with);
            result.setFiltro_farmaco___ends_with(this.filtro_farmaco___ends_with);
            result.setFiltro_farmaco___not___ends_with(this.filtro_farmaco___not___ends_with);
            result.setGenerico___eq(this.generico___eq);
            result.setGenerico___ne(this.generico___ne);
            result.setGenerico___null(this.generico___null);
            result.setGenerico___not___null(this.generico___not___null);
            result.setGenerico___in(this.generico___in);
            result.setGenerico___not___in(this.generico___not___in);
            result.setGenerico___lt(this.generico___lt);
            result.setGenerico___lte(this.generico___lte);
            result.setGenerico___gt(this.generico___gt);
            result.setGenerico___gte(this.generico___gte);
            result.setGenerico___contains(this.generico___contains);
            result.setGenerico___not___contains(this.generico___not___contains);
            result.setGenerico___starts_with(this.generico___starts_with);
            result.setGenerico___not___starts_with(this.generico___not___starts_with);
            result.setGenerico___ends_with(this.generico___ends_with);
            result.setGenerico___not___ends_with(this.generico___not___ends_with);
            result.setGenotipo_guidata___eq(this.genotipo_guidata___eq);
            result.setGenotipo_guidata___ne(this.genotipo_guidata___ne);
            result.setGenotipo_guidata___null(this.genotipo_guidata___null);
            result.setGenotipo_guidata___not___null(this.genotipo_guidata___not___null);
            result.setGenotipo_guidata___in(this.genotipo_guidata___in);
            result.setGenotipo_guidata___not___in(this.genotipo_guidata___not___in);
            result.setGenotipo_guidata___lt(this.genotipo_guidata___lt);
            result.setGenotipo_guidata___lte(this.genotipo_guidata___lte);
            result.setGenotipo_guidata___gt(this.genotipo_guidata___gt);
            result.setGenotipo_guidata___gte(this.genotipo_guidata___gte);
            result.setGenotipo_guidata___contains(this.genotipo_guidata___contains);
            result.setGenotipo_guidata___not___contains(this.genotipo_guidata___not___contains);
            result.setGenotipo_guidata___starts_with(this.genotipo_guidata___starts_with);
            result.setGenotipo_guidata___not___starts_with(this.genotipo_guidata___not___starts_with);
            result.setGenotipo_guidata___ends_with(this.genotipo_guidata___ends_with);
            result.setGenotipo_guidata___not___ends_with(this.genotipo_guidata___not___ends_with);
            result.setLong_acting___eq(this.long_acting___eq);
            result.setLong_acting___ne(this.long_acting___ne);
            result.setLong_acting___null(this.long_acting___null);
            result.setLong_acting___not___null(this.long_acting___not___null);
            result.setMotivazione_fine_ARV_princ____eq(this.motivazione_fine_ARV_princ____eq);
            result.setMotivazione_fine_ARV_princ____ne(this.motivazione_fine_ARV_princ____ne);
            result.setMotivazione_fine_ARV_princ____null(this.motivazione_fine_ARV_princ____null);
            result.setMotivazione_fine_ARV_princ____not___null(this.motivazione_fine_ARV_princ____not___null);
            result.setMotivazione_fine_ARV_princ____in(this.motivazione_fine_ARV_princ____in);
            result.setMotivazione_fine_ARV_princ____not___in(this.motivazione_fine_ARV_princ____not___in);
            result.setMotivazione_fine_ARV_princ____lt(this.motivazione_fine_ARV_princ____lt);
            result.setMotivazione_fine_ARV_princ____lte(this.motivazione_fine_ARV_princ____lte);
            result.setMotivazione_fine_ARV_princ____gt(this.motivazione_fine_ARV_princ____gt);
            result.setMotivazione_fine_ARV_princ____gte(this.motivazione_fine_ARV_princ____gte);
            result.setMotivazione_fine_ARV_princ____contains(this.motivazione_fine_ARV_princ____contains);
            result.setMotivazione_fine_ARV_princ____not___contains(this.motivazione_fine_ARV_princ____not___contains);
            result.setMotivazione_fine_ARV_princ____starts_with(this.motivazione_fine_ARV_princ____starts_with);
            result.setMotivazione_fine_ARV_princ____not___starts_with(this.motivazione_fine_ARV_princ____not___starts_with);
            result.setMotivazione_fine_ARV_princ____ends_with(this.motivazione_fine_ARV_princ____ends_with);
            result.setMotivazione_fine_ARV_princ____not___ends_with(this.motivazione_fine_ARV_princ____not___ends_with);
            result.setMotivazione_fine_ARV_sec____eq(this.motivazione_fine_ARV_sec____eq);
            result.setMotivazione_fine_ARV_sec____ne(this.motivazione_fine_ARV_sec____ne);
            result.setMotivazione_fine_ARV_sec____null(this.motivazione_fine_ARV_sec____null);
            result.setMotivazione_fine_ARV_sec____not___null(this.motivazione_fine_ARV_sec____not___null);
            result.setMotivazione_fine_ARV_sec____in(this.motivazione_fine_ARV_sec____in);
            result.setMotivazione_fine_ARV_sec____not___in(this.motivazione_fine_ARV_sec____not___in);
            result.setMotivazione_fine_ARV_sec____lt(this.motivazione_fine_ARV_sec____lt);
            result.setMotivazione_fine_ARV_sec____lte(this.motivazione_fine_ARV_sec____lte);
            result.setMotivazione_fine_ARV_sec____gt(this.motivazione_fine_ARV_sec____gt);
            result.setMotivazione_fine_ARV_sec____gte(this.motivazione_fine_ARV_sec____gte);
            result.setMotivazione_fine_ARV_sec____contains(this.motivazione_fine_ARV_sec____contains);
            result.setMotivazione_fine_ARV_sec____not___contains(this.motivazione_fine_ARV_sec____not___contains);
            result.setMotivazione_fine_ARV_sec____starts_with(this.motivazione_fine_ARV_sec____starts_with);
            result.setMotivazione_fine_ARV_sec____not___starts_with(this.motivazione_fine_ARV_sec____not___starts_with);
            result.setMotivazione_fine_ARV_sec____ends_with(this.motivazione_fine_ARV_sec____ends_with);
            result.setMotivazione_fine_ARV_sec____not___ends_with(this.motivazione_fine_ARV_sec____not___ends_with);
            result.setMotivazione_inizio_ARV____eq(this.motivazione_inizio_ARV____eq);
            result.setMotivazione_inizio_ARV____ne(this.motivazione_inizio_ARV____ne);
            result.setMotivazione_inizio_ARV____null(this.motivazione_inizio_ARV____null);
            result.setMotivazione_inizio_ARV____not___null(this.motivazione_inizio_ARV____not___null);
            result.setMotivazione_inizio_ARV____in(this.motivazione_inizio_ARV____in);
            result.setMotivazione_inizio_ARV____not___in(this.motivazione_inizio_ARV____not___in);
            result.setMotivazione_inizio_ARV____lt(this.motivazione_inizio_ARV____lt);
            result.setMotivazione_inizio_ARV____lte(this.motivazione_inizio_ARV____lte);
            result.setMotivazione_inizio_ARV____gt(this.motivazione_inizio_ARV____gt);
            result.setMotivazione_inizio_ARV____gte(this.motivazione_inizio_ARV____gte);
            result.setMotivazione_inizio_ARV____contains(this.motivazione_inizio_ARV____contains);
            result.setMotivazione_inizio_ARV____not___contains(this.motivazione_inizio_ARV____not___contains);
            result.setMotivazione_inizio_ARV____starts_with(this.motivazione_inizio_ARV____starts_with);
            result.setMotivazione_inizio_ARV____not___starts_with(this.motivazione_inizio_ARV____not___starts_with);
            result.setMotivazione_inizio_ARV____ends_with(this.motivazione_inizio_ARV____ends_with);
            result.setMotivazione_inizio_ARV____not___ends_with(this.motivazione_inizio_ARV____not___ends_with);
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
            result.setNome_trial___eq(this.nome_trial___eq);
            result.setNome_trial___ne(this.nome_trial___ne);
            result.setNome_trial___null(this.nome_trial___null);
            result.setNome_trial___not___null(this.nome_trial___not___null);
            result.setNome_trial___in(this.nome_trial___in);
            result.setNome_trial___not___in(this.nome_trial___not___in);
            result.setNome_trial___lt(this.nome_trial___lt);
            result.setNome_trial___lte(this.nome_trial___lte);
            result.setNome_trial___gt(this.nome_trial___gt);
            result.setNome_trial___gte(this.nome_trial___gte);
            result.setNome_trial___contains(this.nome_trial___contains);
            result.setNome_trial___not___contains(this.nome_trial___not___contains);
            result.setNome_trial___starts_with(this.nome_trial___starts_with);
            result.setNome_trial___not___starts_with(this.nome_trial___not___starts_with);
            result.setNome_trial___ends_with(this.nome_trial___ends_with);
            result.setNome_trial___not___ends_with(this.nome_trial___not___ends_with);
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
            result.setOnce___eq(this.once___eq);
            result.setOnce___ne(this.once___ne);
            result.setOnce___null(this.once___null);
            result.setOnce___not___null(this.once___not___null);
            result.setOnce___in(this.once___in);
            result.setOnce___not___in(this.once___not___in);
            result.setOnce___lt(this.once___lt);
            result.setOnce___lte(this.once___lte);
            result.setOnce___gt(this.once___gt);
            result.setOnce___gte(this.once___gte);
            result.setOnce___contains(this.once___contains);
            result.setOnce___not___contains(this.once___not___contains);
            result.setOnce___starts_with(this.once___starts_with);
            result.setOnce___not___starts_with(this.once___not___starts_with);
            result.setOnce___ends_with(this.once___ends_with);
            result.setOnce___not___ends_with(this.once___not___ends_with);
            result.setUser_team___eq(this.user_team___eq);
            result.setUser_team___ne(this.user_team___ne);
            result.setUser_team___null(this.user_team___null);
            result.setUser_team___not___null(this.user_team___not___null);
            result.setUser_team___in(this.user_team___in);
            result.setUser_team___not___in(this.user_team___not___in);
            result.setUser_team___lt(this.user_team___lt);
            result.setUser_team___lte(this.user_team___lte);
            result.setUser_team___gt(this.user_team___gt);
            result.setUser_team___gte(this.user_team___gte);
            result.setUser_team___contains(this.user_team___contains);
            result.setUser_team___not___contains(this.user_team___not___contains);
            result.setUser_team___starts_with(this.user_team___starts_with);
            result.setUser_team___not___starts_with(this.user_team___not___starts_with);
            result.setUser_team___ends_with(this.user_team___ends_with);
            result.setUser_team___not___ends_with(this.user_team___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
