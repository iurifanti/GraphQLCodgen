package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Evento_epatico.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliEvento_epaticoFilterDTO implements java.io.Serializable {

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
    private Boolean alcolizzazione___eq;
    private Boolean alcolizzazione___ne;
    private Boolean alcolizzazione___null;
    private Boolean alcolizzazione___not___null;
    private String altra_eziologia___eq;
    private String altra_eziologia___ne;
    private Boolean altra_eziologia___null;
    private Boolean altra_eziologia___not___null;
    private java.util.List<String> altra_eziologia___in;
    private java.util.List<String> altra_eziologia___not___in;
    private String altra_eziologia___lt;
    private String altra_eziologia___lte;
    private String altra_eziologia___gt;
    private String altra_eziologia___gte;
    private String altra_eziologia___contains;
    private String altra_eziologia___not___contains;
    private String altra_eziologia___starts_with;
    private String altra_eziologia___not___starts_with;
    private String altra_eziologia___ends_with;
    private String altra_eziologia___not___ends_with;
    private String altra_procedura_chirurgica___eq;
    private String altra_procedura_chirurgica___ne;
    private Boolean altra_procedura_chirurgica___null;
    private Boolean altra_procedura_chirurgica___not___null;
    private java.util.List<String> altra_procedura_chirurgica___in;
    private java.util.List<String> altra_procedura_chirurgica___not___in;
    private String altra_procedura_chirurgica___lt;
    private String altra_procedura_chirurgica___lte;
    private String altra_procedura_chirurgica___gt;
    private String altra_procedura_chirurgica___gte;
    private String altra_procedura_chirurgica___contains;
    private String altra_procedura_chirurgica___not___contains;
    private String altra_procedura_chirurgica___starts_with;
    private String altra_procedura_chirurgica___not___starts_with;
    private String altra_procedura_chirurgica___ends_with;
    private String altra_procedura_chirurgica___not___ends_with;
    private String altri_dettagli_istologia___eq;
    private String altri_dettagli_istologia___ne;
    private Boolean altri_dettagli_istologia___null;
    private Boolean altri_dettagli_istologia___not___null;
    private java.util.List<String> altri_dettagli_istologia___in;
    private java.util.List<String> altri_dettagli_istologia___not___in;
    private String altri_dettagli_istologia___lt;
    private String altri_dettagli_istologia___lte;
    private String altri_dettagli_istologia___gt;
    private String altri_dettagli_istologia___gte;
    private String altri_dettagli_istologia___contains;
    private String altri_dettagli_istologia___not___contains;
    private String altri_dettagli_istologia___starts_with;
    private String altri_dettagli_istologia___not___starts_with;
    private String altri_dettagli_istologia___ends_with;
    private String altri_dettagli_istologia___not___ends_with;
    private Boolean chemioembolizzazione___eq;
    private Boolean chemioembolizzazione___ne;
    private Boolean chemioembolizzazione___null;
    private Boolean chemioembolizzazione___not___null;
    private String classificazione_child___eq;
    private String classificazione_child___ne;
    private Boolean classificazione_child___null;
    private Boolean classificazione_child___not___null;
    private java.util.List<String> classificazione_child___in;
    private java.util.List<String> classificazione_child___not___in;
    private String classificazione_child___lt;
    private String classificazione_child___lte;
    private String classificazione_child___gt;
    private String classificazione_child___gte;
    private String classificazione_child___contains;
    private String classificazione_child___not___contains;
    private String classificazione_child___starts_with;
    private String classificazione_child___not___starts_with;
    private String classificazione_child___ends_with;
    private String classificazione_child___not___ends_with;
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
    private String commenti___eq;
    private String commenti___ne;
    private Boolean commenti___null;
    private Boolean commenti___not___null;
    private java.util.List<String> commenti___in;
    private java.util.List<String> commenti___not___in;
    private String commenti___lt;
    private String commenti___lte;
    private String commenti___gt;
    private String commenti___gte;
    private String commenti___contains;
    private String commenti___not___contains;
    private String commenti___starts_with;
    private String commenti___not___starts_with;
    private String commenti___ends_with;
    private String commenti___not___ends_with;
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
    private String data_ricezione___eq;
    private String data_ricezione___ne;
    private Boolean data_ricezione___null;
    private Boolean data_ricezione___not___null;
    private java.util.List<String> data_ricezione___in;
    private java.util.List<String> data_ricezione___not___in;
    private String data_ricezione___lt;
    private String data_ricezione___lte;
    private String data_ricezione___gt;
    private String data_ricezione___gte;
    private String data_richiesta___eq;
    private String data_richiesta___ne;
    private Boolean data_richiesta___null;
    private Boolean data_richiesta___not___null;
    private java.util.List<String> data_richiesta___in;
    private java.util.List<String> data_richiesta___not___in;
    private String data_richiesta___lt;
    private String data_richiesta___lte;
    private String data_richiesta___gt;
    private String data_richiesta___gte;
    private Boolean eziologia_alcool___eq;
    private Boolean eziologia_alcool___ne;
    private Boolean eziologia_alcool___null;
    private Boolean eziologia_alcool___not___null;
    private Boolean eziologia_farmaci___eq;
    private Boolean eziologia_farmaci___ne;
    private Boolean eziologia_farmaci___null;
    private Boolean eziologia_farmaci___not___null;
    private Boolean eziologia_non_nota___eq;
    private Boolean eziologia_non_nota___ne;
    private Boolean eziologia_non_nota___null;
    private Boolean eziologia_non_nota___not___null;
    private Integer id_respond___eq;
    private Integer id_respond___ne;
    private Boolean id_respond___null;
    private Boolean id_respond___not___null;
    private java.util.List<Integer> id_respond___in;
    private java.util.List<Integer> id_respond___not___in;
    private Integer id_respond___lt;
    private Integer id_respond___lte;
    private Integer id_respond___gt;
    private Integer id_respond___gte;
    private String note___eq;
    private String note___ne;
    private Boolean note___null;
    private Boolean note___not___null;
    private java.util.List<String> note___in;
    private java.util.List<String> note___not___in;
    private String note___lt;
    private String note___lte;
    private String note___gt;
    private String note___gte;
    private String note___contains;
    private String note___not___contains;
    private String note___starts_with;
    private String note___not___starts_with;
    private String note___ends_with;
    private String note___not___ends_with;
    private String patologie___eq;
    private String patologie___ne;
    private Boolean patologie___null;
    private Boolean patologie___not___null;
    private java.util.List<String> patologie___in;
    private java.util.List<String> patologie___not___in;
    private String patologie___lt;
    private String patologie___lte;
    private String patologie___gt;
    private String patologie___gte;
    private String patologie___contains;
    private String patologie___not___contains;
    private String patologie___starts_with;
    private String patologie___not___starts_with;
    private String patologie___ends_with;
    private String patologie___not___ends_with;
    private Boolean resezione_epatica___eq;
    private Boolean resezione_epatica___ne;
    private Boolean resezione_epatica___null;
    private Boolean resezione_epatica___not___null;
    private String stato_richiesta___eq;
    private String stato_richiesta___ne;
    private Boolean stato_richiesta___null;
    private Boolean stato_richiesta___not___null;
    private java.util.List<String> stato_richiesta___in;
    private java.util.List<String> stato_richiesta___not___in;
    private String stato_richiesta___lt;
    private String stato_richiesta___lte;
    private String stato_richiesta___gt;
    private String stato_richiesta___gte;
    private String stato_richiesta___contains;
    private String stato_richiesta___not___contains;
    private String stato_richiesta___starts_with;
    private String stato_richiesta___not___starts_with;
    private String stato_richiesta___ends_with;
    private String stato_richiesta___not___ends_with;
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
    private Boolean termoablazione___eq;
    private Boolean termoablazione___ne;
    private Boolean termoablazione___null;
    private Boolean termoablazione___not___null;
    private Boolean trapianto_epatico___eq;
    private Boolean trapianto_epatico___ne;
    private Boolean trapianto_epatico___null;
    private Boolean trapianto_epatico___not___null;
    private Boolean warning_respond_biop___eq;
    private Boolean warning_respond_biop___ne;
    private Boolean warning_respond_biop___null;
    private Boolean warning_respond_biop___not___null;
    private Boolean warning_respond_epa___eq;
    private Boolean warning_respond_epa___ne;
    private Boolean warning_respond_epa___null;
    private Boolean warning_respond_epa___not___null;
    private java.util.List<CliEvento_epaticoFilterDTO> AND;
    private java.util.List<CliEvento_epaticoFilterDTO> OR;
    private CliEvento_epaticoFilterDTO NOT;

    public CliEvento_epaticoFilterDTO() {
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

    public Boolean getAlcolizzazione___eq() {
        return alcolizzazione___eq;
    }
    public void setAlcolizzazione___eq(Boolean alcolizzazione___eq) {
        this.alcolizzazione___eq = alcolizzazione___eq;
    }

    public Boolean getAlcolizzazione___ne() {
        return alcolizzazione___ne;
    }
    public void setAlcolizzazione___ne(Boolean alcolizzazione___ne) {
        this.alcolizzazione___ne = alcolizzazione___ne;
    }

    public Boolean getAlcolizzazione___null() {
        return alcolizzazione___null;
    }
    public void setAlcolizzazione___null(Boolean alcolizzazione___null) {
        this.alcolizzazione___null = alcolizzazione___null;
    }

    public Boolean getAlcolizzazione___not___null() {
        return alcolizzazione___not___null;
    }
    public void setAlcolizzazione___not___null(Boolean alcolizzazione___not___null) {
        this.alcolizzazione___not___null = alcolizzazione___not___null;
    }

    public String getAltra_eziologia___eq() {
        return altra_eziologia___eq;
    }
    public void setAltra_eziologia___eq(String altra_eziologia___eq) {
        this.altra_eziologia___eq = altra_eziologia___eq;
    }

    public String getAltra_eziologia___ne() {
        return altra_eziologia___ne;
    }
    public void setAltra_eziologia___ne(String altra_eziologia___ne) {
        this.altra_eziologia___ne = altra_eziologia___ne;
    }

    public Boolean getAltra_eziologia___null() {
        return altra_eziologia___null;
    }
    public void setAltra_eziologia___null(Boolean altra_eziologia___null) {
        this.altra_eziologia___null = altra_eziologia___null;
    }

    public Boolean getAltra_eziologia___not___null() {
        return altra_eziologia___not___null;
    }
    public void setAltra_eziologia___not___null(Boolean altra_eziologia___not___null) {
        this.altra_eziologia___not___null = altra_eziologia___not___null;
    }

    public java.util.List<String> getAltra_eziologia___in() {
        return altra_eziologia___in;
    }
    public void setAltra_eziologia___in(java.util.List<String> altra_eziologia___in) {
        this.altra_eziologia___in = altra_eziologia___in;
    }

    public java.util.List<String> getAltra_eziologia___not___in() {
        return altra_eziologia___not___in;
    }
    public void setAltra_eziologia___not___in(java.util.List<String> altra_eziologia___not___in) {
        this.altra_eziologia___not___in = altra_eziologia___not___in;
    }

    public String getAltra_eziologia___lt() {
        return altra_eziologia___lt;
    }
    public void setAltra_eziologia___lt(String altra_eziologia___lt) {
        this.altra_eziologia___lt = altra_eziologia___lt;
    }

    public String getAltra_eziologia___lte() {
        return altra_eziologia___lte;
    }
    public void setAltra_eziologia___lte(String altra_eziologia___lte) {
        this.altra_eziologia___lte = altra_eziologia___lte;
    }

    public String getAltra_eziologia___gt() {
        return altra_eziologia___gt;
    }
    public void setAltra_eziologia___gt(String altra_eziologia___gt) {
        this.altra_eziologia___gt = altra_eziologia___gt;
    }

    public String getAltra_eziologia___gte() {
        return altra_eziologia___gte;
    }
    public void setAltra_eziologia___gte(String altra_eziologia___gte) {
        this.altra_eziologia___gte = altra_eziologia___gte;
    }

    public String getAltra_eziologia___contains() {
        return altra_eziologia___contains;
    }
    public void setAltra_eziologia___contains(String altra_eziologia___contains) {
        this.altra_eziologia___contains = altra_eziologia___contains;
    }

    public String getAltra_eziologia___not___contains() {
        return altra_eziologia___not___contains;
    }
    public void setAltra_eziologia___not___contains(String altra_eziologia___not___contains) {
        this.altra_eziologia___not___contains = altra_eziologia___not___contains;
    }

    public String getAltra_eziologia___starts_with() {
        return altra_eziologia___starts_with;
    }
    public void setAltra_eziologia___starts_with(String altra_eziologia___starts_with) {
        this.altra_eziologia___starts_with = altra_eziologia___starts_with;
    }

    public String getAltra_eziologia___not___starts_with() {
        return altra_eziologia___not___starts_with;
    }
    public void setAltra_eziologia___not___starts_with(String altra_eziologia___not___starts_with) {
        this.altra_eziologia___not___starts_with = altra_eziologia___not___starts_with;
    }

    public String getAltra_eziologia___ends_with() {
        return altra_eziologia___ends_with;
    }
    public void setAltra_eziologia___ends_with(String altra_eziologia___ends_with) {
        this.altra_eziologia___ends_with = altra_eziologia___ends_with;
    }

    public String getAltra_eziologia___not___ends_with() {
        return altra_eziologia___not___ends_with;
    }
    public void setAltra_eziologia___not___ends_with(String altra_eziologia___not___ends_with) {
        this.altra_eziologia___not___ends_with = altra_eziologia___not___ends_with;
    }

    public String getAltra_procedura_chirurgica___eq() {
        return altra_procedura_chirurgica___eq;
    }
    public void setAltra_procedura_chirurgica___eq(String altra_procedura_chirurgica___eq) {
        this.altra_procedura_chirurgica___eq = altra_procedura_chirurgica___eq;
    }

    public String getAltra_procedura_chirurgica___ne() {
        return altra_procedura_chirurgica___ne;
    }
    public void setAltra_procedura_chirurgica___ne(String altra_procedura_chirurgica___ne) {
        this.altra_procedura_chirurgica___ne = altra_procedura_chirurgica___ne;
    }

    public Boolean getAltra_procedura_chirurgica___null() {
        return altra_procedura_chirurgica___null;
    }
    public void setAltra_procedura_chirurgica___null(Boolean altra_procedura_chirurgica___null) {
        this.altra_procedura_chirurgica___null = altra_procedura_chirurgica___null;
    }

    public Boolean getAltra_procedura_chirurgica___not___null() {
        return altra_procedura_chirurgica___not___null;
    }
    public void setAltra_procedura_chirurgica___not___null(Boolean altra_procedura_chirurgica___not___null) {
        this.altra_procedura_chirurgica___not___null = altra_procedura_chirurgica___not___null;
    }

    public java.util.List<String> getAltra_procedura_chirurgica___in() {
        return altra_procedura_chirurgica___in;
    }
    public void setAltra_procedura_chirurgica___in(java.util.List<String> altra_procedura_chirurgica___in) {
        this.altra_procedura_chirurgica___in = altra_procedura_chirurgica___in;
    }

    public java.util.List<String> getAltra_procedura_chirurgica___not___in() {
        return altra_procedura_chirurgica___not___in;
    }
    public void setAltra_procedura_chirurgica___not___in(java.util.List<String> altra_procedura_chirurgica___not___in) {
        this.altra_procedura_chirurgica___not___in = altra_procedura_chirurgica___not___in;
    }

    public String getAltra_procedura_chirurgica___lt() {
        return altra_procedura_chirurgica___lt;
    }
    public void setAltra_procedura_chirurgica___lt(String altra_procedura_chirurgica___lt) {
        this.altra_procedura_chirurgica___lt = altra_procedura_chirurgica___lt;
    }

    public String getAltra_procedura_chirurgica___lte() {
        return altra_procedura_chirurgica___lte;
    }
    public void setAltra_procedura_chirurgica___lte(String altra_procedura_chirurgica___lte) {
        this.altra_procedura_chirurgica___lte = altra_procedura_chirurgica___lte;
    }

    public String getAltra_procedura_chirurgica___gt() {
        return altra_procedura_chirurgica___gt;
    }
    public void setAltra_procedura_chirurgica___gt(String altra_procedura_chirurgica___gt) {
        this.altra_procedura_chirurgica___gt = altra_procedura_chirurgica___gt;
    }

    public String getAltra_procedura_chirurgica___gte() {
        return altra_procedura_chirurgica___gte;
    }
    public void setAltra_procedura_chirurgica___gte(String altra_procedura_chirurgica___gte) {
        this.altra_procedura_chirurgica___gte = altra_procedura_chirurgica___gte;
    }

    public String getAltra_procedura_chirurgica___contains() {
        return altra_procedura_chirurgica___contains;
    }
    public void setAltra_procedura_chirurgica___contains(String altra_procedura_chirurgica___contains) {
        this.altra_procedura_chirurgica___contains = altra_procedura_chirurgica___contains;
    }

    public String getAltra_procedura_chirurgica___not___contains() {
        return altra_procedura_chirurgica___not___contains;
    }
    public void setAltra_procedura_chirurgica___not___contains(String altra_procedura_chirurgica___not___contains) {
        this.altra_procedura_chirurgica___not___contains = altra_procedura_chirurgica___not___contains;
    }

    public String getAltra_procedura_chirurgica___starts_with() {
        return altra_procedura_chirurgica___starts_with;
    }
    public void setAltra_procedura_chirurgica___starts_with(String altra_procedura_chirurgica___starts_with) {
        this.altra_procedura_chirurgica___starts_with = altra_procedura_chirurgica___starts_with;
    }

    public String getAltra_procedura_chirurgica___not___starts_with() {
        return altra_procedura_chirurgica___not___starts_with;
    }
    public void setAltra_procedura_chirurgica___not___starts_with(String altra_procedura_chirurgica___not___starts_with) {
        this.altra_procedura_chirurgica___not___starts_with = altra_procedura_chirurgica___not___starts_with;
    }

    public String getAltra_procedura_chirurgica___ends_with() {
        return altra_procedura_chirurgica___ends_with;
    }
    public void setAltra_procedura_chirurgica___ends_with(String altra_procedura_chirurgica___ends_with) {
        this.altra_procedura_chirurgica___ends_with = altra_procedura_chirurgica___ends_with;
    }

    public String getAltra_procedura_chirurgica___not___ends_with() {
        return altra_procedura_chirurgica___not___ends_with;
    }
    public void setAltra_procedura_chirurgica___not___ends_with(String altra_procedura_chirurgica___not___ends_with) {
        this.altra_procedura_chirurgica___not___ends_with = altra_procedura_chirurgica___not___ends_with;
    }

    public String getAltri_dettagli_istologia___eq() {
        return altri_dettagli_istologia___eq;
    }
    public void setAltri_dettagli_istologia___eq(String altri_dettagli_istologia___eq) {
        this.altri_dettagli_istologia___eq = altri_dettagli_istologia___eq;
    }

    public String getAltri_dettagli_istologia___ne() {
        return altri_dettagli_istologia___ne;
    }
    public void setAltri_dettagli_istologia___ne(String altri_dettagli_istologia___ne) {
        this.altri_dettagli_istologia___ne = altri_dettagli_istologia___ne;
    }

    public Boolean getAltri_dettagli_istologia___null() {
        return altri_dettagli_istologia___null;
    }
    public void setAltri_dettagli_istologia___null(Boolean altri_dettagli_istologia___null) {
        this.altri_dettagli_istologia___null = altri_dettagli_istologia___null;
    }

    public Boolean getAltri_dettagli_istologia___not___null() {
        return altri_dettagli_istologia___not___null;
    }
    public void setAltri_dettagli_istologia___not___null(Boolean altri_dettagli_istologia___not___null) {
        this.altri_dettagli_istologia___not___null = altri_dettagli_istologia___not___null;
    }

    public java.util.List<String> getAltri_dettagli_istologia___in() {
        return altri_dettagli_istologia___in;
    }
    public void setAltri_dettagli_istologia___in(java.util.List<String> altri_dettagli_istologia___in) {
        this.altri_dettagli_istologia___in = altri_dettagli_istologia___in;
    }

    public java.util.List<String> getAltri_dettagli_istologia___not___in() {
        return altri_dettagli_istologia___not___in;
    }
    public void setAltri_dettagli_istologia___not___in(java.util.List<String> altri_dettagli_istologia___not___in) {
        this.altri_dettagli_istologia___not___in = altri_dettagli_istologia___not___in;
    }

    public String getAltri_dettagli_istologia___lt() {
        return altri_dettagli_istologia___lt;
    }
    public void setAltri_dettagli_istologia___lt(String altri_dettagli_istologia___lt) {
        this.altri_dettagli_istologia___lt = altri_dettagli_istologia___lt;
    }

    public String getAltri_dettagli_istologia___lte() {
        return altri_dettagli_istologia___lte;
    }
    public void setAltri_dettagli_istologia___lte(String altri_dettagli_istologia___lte) {
        this.altri_dettagli_istologia___lte = altri_dettagli_istologia___lte;
    }

    public String getAltri_dettagli_istologia___gt() {
        return altri_dettagli_istologia___gt;
    }
    public void setAltri_dettagli_istologia___gt(String altri_dettagli_istologia___gt) {
        this.altri_dettagli_istologia___gt = altri_dettagli_istologia___gt;
    }

    public String getAltri_dettagli_istologia___gte() {
        return altri_dettagli_istologia___gte;
    }
    public void setAltri_dettagli_istologia___gte(String altri_dettagli_istologia___gte) {
        this.altri_dettagli_istologia___gte = altri_dettagli_istologia___gte;
    }

    public String getAltri_dettagli_istologia___contains() {
        return altri_dettagli_istologia___contains;
    }
    public void setAltri_dettagli_istologia___contains(String altri_dettagli_istologia___contains) {
        this.altri_dettagli_istologia___contains = altri_dettagli_istologia___contains;
    }

    public String getAltri_dettagli_istologia___not___contains() {
        return altri_dettagli_istologia___not___contains;
    }
    public void setAltri_dettagli_istologia___not___contains(String altri_dettagli_istologia___not___contains) {
        this.altri_dettagli_istologia___not___contains = altri_dettagli_istologia___not___contains;
    }

    public String getAltri_dettagli_istologia___starts_with() {
        return altri_dettagli_istologia___starts_with;
    }
    public void setAltri_dettagli_istologia___starts_with(String altri_dettagli_istologia___starts_with) {
        this.altri_dettagli_istologia___starts_with = altri_dettagli_istologia___starts_with;
    }

    public String getAltri_dettagli_istologia___not___starts_with() {
        return altri_dettagli_istologia___not___starts_with;
    }
    public void setAltri_dettagli_istologia___not___starts_with(String altri_dettagli_istologia___not___starts_with) {
        this.altri_dettagli_istologia___not___starts_with = altri_dettagli_istologia___not___starts_with;
    }

    public String getAltri_dettagli_istologia___ends_with() {
        return altri_dettagli_istologia___ends_with;
    }
    public void setAltri_dettagli_istologia___ends_with(String altri_dettagli_istologia___ends_with) {
        this.altri_dettagli_istologia___ends_with = altri_dettagli_istologia___ends_with;
    }

    public String getAltri_dettagli_istologia___not___ends_with() {
        return altri_dettagli_istologia___not___ends_with;
    }
    public void setAltri_dettagli_istologia___not___ends_with(String altri_dettagli_istologia___not___ends_with) {
        this.altri_dettagli_istologia___not___ends_with = altri_dettagli_istologia___not___ends_with;
    }

    public Boolean getChemioembolizzazione___eq() {
        return chemioembolizzazione___eq;
    }
    public void setChemioembolizzazione___eq(Boolean chemioembolizzazione___eq) {
        this.chemioembolizzazione___eq = chemioembolizzazione___eq;
    }

    public Boolean getChemioembolizzazione___ne() {
        return chemioembolizzazione___ne;
    }
    public void setChemioembolizzazione___ne(Boolean chemioembolizzazione___ne) {
        this.chemioembolizzazione___ne = chemioembolizzazione___ne;
    }

    public Boolean getChemioembolizzazione___null() {
        return chemioembolizzazione___null;
    }
    public void setChemioembolizzazione___null(Boolean chemioembolizzazione___null) {
        this.chemioembolizzazione___null = chemioembolizzazione___null;
    }

    public Boolean getChemioembolizzazione___not___null() {
        return chemioembolizzazione___not___null;
    }
    public void setChemioembolizzazione___not___null(Boolean chemioembolizzazione___not___null) {
        this.chemioembolizzazione___not___null = chemioembolizzazione___not___null;
    }

    public String getClassificazione_child___eq() {
        return classificazione_child___eq;
    }
    public void setClassificazione_child___eq(String classificazione_child___eq) {
        this.classificazione_child___eq = classificazione_child___eq;
    }

    public String getClassificazione_child___ne() {
        return classificazione_child___ne;
    }
    public void setClassificazione_child___ne(String classificazione_child___ne) {
        this.classificazione_child___ne = classificazione_child___ne;
    }

    public Boolean getClassificazione_child___null() {
        return classificazione_child___null;
    }
    public void setClassificazione_child___null(Boolean classificazione_child___null) {
        this.classificazione_child___null = classificazione_child___null;
    }

    public Boolean getClassificazione_child___not___null() {
        return classificazione_child___not___null;
    }
    public void setClassificazione_child___not___null(Boolean classificazione_child___not___null) {
        this.classificazione_child___not___null = classificazione_child___not___null;
    }

    public java.util.List<String> getClassificazione_child___in() {
        return classificazione_child___in;
    }
    public void setClassificazione_child___in(java.util.List<String> classificazione_child___in) {
        this.classificazione_child___in = classificazione_child___in;
    }

    public java.util.List<String> getClassificazione_child___not___in() {
        return classificazione_child___not___in;
    }
    public void setClassificazione_child___not___in(java.util.List<String> classificazione_child___not___in) {
        this.classificazione_child___not___in = classificazione_child___not___in;
    }

    public String getClassificazione_child___lt() {
        return classificazione_child___lt;
    }
    public void setClassificazione_child___lt(String classificazione_child___lt) {
        this.classificazione_child___lt = classificazione_child___lt;
    }

    public String getClassificazione_child___lte() {
        return classificazione_child___lte;
    }
    public void setClassificazione_child___lte(String classificazione_child___lte) {
        this.classificazione_child___lte = classificazione_child___lte;
    }

    public String getClassificazione_child___gt() {
        return classificazione_child___gt;
    }
    public void setClassificazione_child___gt(String classificazione_child___gt) {
        this.classificazione_child___gt = classificazione_child___gt;
    }

    public String getClassificazione_child___gte() {
        return classificazione_child___gte;
    }
    public void setClassificazione_child___gte(String classificazione_child___gte) {
        this.classificazione_child___gte = classificazione_child___gte;
    }

    public String getClassificazione_child___contains() {
        return classificazione_child___contains;
    }
    public void setClassificazione_child___contains(String classificazione_child___contains) {
        this.classificazione_child___contains = classificazione_child___contains;
    }

    public String getClassificazione_child___not___contains() {
        return classificazione_child___not___contains;
    }
    public void setClassificazione_child___not___contains(String classificazione_child___not___contains) {
        this.classificazione_child___not___contains = classificazione_child___not___contains;
    }

    public String getClassificazione_child___starts_with() {
        return classificazione_child___starts_with;
    }
    public void setClassificazione_child___starts_with(String classificazione_child___starts_with) {
        this.classificazione_child___starts_with = classificazione_child___starts_with;
    }

    public String getClassificazione_child___not___starts_with() {
        return classificazione_child___not___starts_with;
    }
    public void setClassificazione_child___not___starts_with(String classificazione_child___not___starts_with) {
        this.classificazione_child___not___starts_with = classificazione_child___not___starts_with;
    }

    public String getClassificazione_child___ends_with() {
        return classificazione_child___ends_with;
    }
    public void setClassificazione_child___ends_with(String classificazione_child___ends_with) {
        this.classificazione_child___ends_with = classificazione_child___ends_with;
    }

    public String getClassificazione_child___not___ends_with() {
        return classificazione_child___not___ends_with;
    }
    public void setClassificazione_child___not___ends_with(String classificazione_child___not___ends_with) {
        this.classificazione_child___not___ends_with = classificazione_child___not___ends_with;
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

    public String getCommenti___eq() {
        return commenti___eq;
    }
    public void setCommenti___eq(String commenti___eq) {
        this.commenti___eq = commenti___eq;
    }

    public String getCommenti___ne() {
        return commenti___ne;
    }
    public void setCommenti___ne(String commenti___ne) {
        this.commenti___ne = commenti___ne;
    }

    public Boolean getCommenti___null() {
        return commenti___null;
    }
    public void setCommenti___null(Boolean commenti___null) {
        this.commenti___null = commenti___null;
    }

    public Boolean getCommenti___not___null() {
        return commenti___not___null;
    }
    public void setCommenti___not___null(Boolean commenti___not___null) {
        this.commenti___not___null = commenti___not___null;
    }

    public java.util.List<String> getCommenti___in() {
        return commenti___in;
    }
    public void setCommenti___in(java.util.List<String> commenti___in) {
        this.commenti___in = commenti___in;
    }

    public java.util.List<String> getCommenti___not___in() {
        return commenti___not___in;
    }
    public void setCommenti___not___in(java.util.List<String> commenti___not___in) {
        this.commenti___not___in = commenti___not___in;
    }

    public String getCommenti___lt() {
        return commenti___lt;
    }
    public void setCommenti___lt(String commenti___lt) {
        this.commenti___lt = commenti___lt;
    }

    public String getCommenti___lte() {
        return commenti___lte;
    }
    public void setCommenti___lte(String commenti___lte) {
        this.commenti___lte = commenti___lte;
    }

    public String getCommenti___gt() {
        return commenti___gt;
    }
    public void setCommenti___gt(String commenti___gt) {
        this.commenti___gt = commenti___gt;
    }

    public String getCommenti___gte() {
        return commenti___gte;
    }
    public void setCommenti___gte(String commenti___gte) {
        this.commenti___gte = commenti___gte;
    }

    public String getCommenti___contains() {
        return commenti___contains;
    }
    public void setCommenti___contains(String commenti___contains) {
        this.commenti___contains = commenti___contains;
    }

    public String getCommenti___not___contains() {
        return commenti___not___contains;
    }
    public void setCommenti___not___contains(String commenti___not___contains) {
        this.commenti___not___contains = commenti___not___contains;
    }

    public String getCommenti___starts_with() {
        return commenti___starts_with;
    }
    public void setCommenti___starts_with(String commenti___starts_with) {
        this.commenti___starts_with = commenti___starts_with;
    }

    public String getCommenti___not___starts_with() {
        return commenti___not___starts_with;
    }
    public void setCommenti___not___starts_with(String commenti___not___starts_with) {
        this.commenti___not___starts_with = commenti___not___starts_with;
    }

    public String getCommenti___ends_with() {
        return commenti___ends_with;
    }
    public void setCommenti___ends_with(String commenti___ends_with) {
        this.commenti___ends_with = commenti___ends_with;
    }

    public String getCommenti___not___ends_with() {
        return commenti___not___ends_with;
    }
    public void setCommenti___not___ends_with(String commenti___not___ends_with) {
        this.commenti___not___ends_with = commenti___not___ends_with;
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

    public String getData_ricezione___eq() {
        return data_ricezione___eq;
    }
    public void setData_ricezione___eq(String data_ricezione___eq) {
        this.data_ricezione___eq = data_ricezione___eq;
    }

    public String getData_ricezione___ne() {
        return data_ricezione___ne;
    }
    public void setData_ricezione___ne(String data_ricezione___ne) {
        this.data_ricezione___ne = data_ricezione___ne;
    }

    public Boolean getData_ricezione___null() {
        return data_ricezione___null;
    }
    public void setData_ricezione___null(Boolean data_ricezione___null) {
        this.data_ricezione___null = data_ricezione___null;
    }

    public Boolean getData_ricezione___not___null() {
        return data_ricezione___not___null;
    }
    public void setData_ricezione___not___null(Boolean data_ricezione___not___null) {
        this.data_ricezione___not___null = data_ricezione___not___null;
    }

    public java.util.List<String> getData_ricezione___in() {
        return data_ricezione___in;
    }
    public void setData_ricezione___in(java.util.List<String> data_ricezione___in) {
        this.data_ricezione___in = data_ricezione___in;
    }

    public java.util.List<String> getData_ricezione___not___in() {
        return data_ricezione___not___in;
    }
    public void setData_ricezione___not___in(java.util.List<String> data_ricezione___not___in) {
        this.data_ricezione___not___in = data_ricezione___not___in;
    }

    public String getData_ricezione___lt() {
        return data_ricezione___lt;
    }
    public void setData_ricezione___lt(String data_ricezione___lt) {
        this.data_ricezione___lt = data_ricezione___lt;
    }

    public String getData_ricezione___lte() {
        return data_ricezione___lte;
    }
    public void setData_ricezione___lte(String data_ricezione___lte) {
        this.data_ricezione___lte = data_ricezione___lte;
    }

    public String getData_ricezione___gt() {
        return data_ricezione___gt;
    }
    public void setData_ricezione___gt(String data_ricezione___gt) {
        this.data_ricezione___gt = data_ricezione___gt;
    }

    public String getData_ricezione___gte() {
        return data_ricezione___gte;
    }
    public void setData_ricezione___gte(String data_ricezione___gte) {
        this.data_ricezione___gte = data_ricezione___gte;
    }

    public String getData_richiesta___eq() {
        return data_richiesta___eq;
    }
    public void setData_richiesta___eq(String data_richiesta___eq) {
        this.data_richiesta___eq = data_richiesta___eq;
    }

    public String getData_richiesta___ne() {
        return data_richiesta___ne;
    }
    public void setData_richiesta___ne(String data_richiesta___ne) {
        this.data_richiesta___ne = data_richiesta___ne;
    }

    public Boolean getData_richiesta___null() {
        return data_richiesta___null;
    }
    public void setData_richiesta___null(Boolean data_richiesta___null) {
        this.data_richiesta___null = data_richiesta___null;
    }

    public Boolean getData_richiesta___not___null() {
        return data_richiesta___not___null;
    }
    public void setData_richiesta___not___null(Boolean data_richiesta___not___null) {
        this.data_richiesta___not___null = data_richiesta___not___null;
    }

    public java.util.List<String> getData_richiesta___in() {
        return data_richiesta___in;
    }
    public void setData_richiesta___in(java.util.List<String> data_richiesta___in) {
        this.data_richiesta___in = data_richiesta___in;
    }

    public java.util.List<String> getData_richiesta___not___in() {
        return data_richiesta___not___in;
    }
    public void setData_richiesta___not___in(java.util.List<String> data_richiesta___not___in) {
        this.data_richiesta___not___in = data_richiesta___not___in;
    }

    public String getData_richiesta___lt() {
        return data_richiesta___lt;
    }
    public void setData_richiesta___lt(String data_richiesta___lt) {
        this.data_richiesta___lt = data_richiesta___lt;
    }

    public String getData_richiesta___lte() {
        return data_richiesta___lte;
    }
    public void setData_richiesta___lte(String data_richiesta___lte) {
        this.data_richiesta___lte = data_richiesta___lte;
    }

    public String getData_richiesta___gt() {
        return data_richiesta___gt;
    }
    public void setData_richiesta___gt(String data_richiesta___gt) {
        this.data_richiesta___gt = data_richiesta___gt;
    }

    public String getData_richiesta___gte() {
        return data_richiesta___gte;
    }
    public void setData_richiesta___gte(String data_richiesta___gte) {
        this.data_richiesta___gte = data_richiesta___gte;
    }

    public Boolean getEziologia_alcool___eq() {
        return eziologia_alcool___eq;
    }
    public void setEziologia_alcool___eq(Boolean eziologia_alcool___eq) {
        this.eziologia_alcool___eq = eziologia_alcool___eq;
    }

    public Boolean getEziologia_alcool___ne() {
        return eziologia_alcool___ne;
    }
    public void setEziologia_alcool___ne(Boolean eziologia_alcool___ne) {
        this.eziologia_alcool___ne = eziologia_alcool___ne;
    }

    public Boolean getEziologia_alcool___null() {
        return eziologia_alcool___null;
    }
    public void setEziologia_alcool___null(Boolean eziologia_alcool___null) {
        this.eziologia_alcool___null = eziologia_alcool___null;
    }

    public Boolean getEziologia_alcool___not___null() {
        return eziologia_alcool___not___null;
    }
    public void setEziologia_alcool___not___null(Boolean eziologia_alcool___not___null) {
        this.eziologia_alcool___not___null = eziologia_alcool___not___null;
    }

    public Boolean getEziologia_farmaci___eq() {
        return eziologia_farmaci___eq;
    }
    public void setEziologia_farmaci___eq(Boolean eziologia_farmaci___eq) {
        this.eziologia_farmaci___eq = eziologia_farmaci___eq;
    }

    public Boolean getEziologia_farmaci___ne() {
        return eziologia_farmaci___ne;
    }
    public void setEziologia_farmaci___ne(Boolean eziologia_farmaci___ne) {
        this.eziologia_farmaci___ne = eziologia_farmaci___ne;
    }

    public Boolean getEziologia_farmaci___null() {
        return eziologia_farmaci___null;
    }
    public void setEziologia_farmaci___null(Boolean eziologia_farmaci___null) {
        this.eziologia_farmaci___null = eziologia_farmaci___null;
    }

    public Boolean getEziologia_farmaci___not___null() {
        return eziologia_farmaci___not___null;
    }
    public void setEziologia_farmaci___not___null(Boolean eziologia_farmaci___not___null) {
        this.eziologia_farmaci___not___null = eziologia_farmaci___not___null;
    }

    public Boolean getEziologia_non_nota___eq() {
        return eziologia_non_nota___eq;
    }
    public void setEziologia_non_nota___eq(Boolean eziologia_non_nota___eq) {
        this.eziologia_non_nota___eq = eziologia_non_nota___eq;
    }

    public Boolean getEziologia_non_nota___ne() {
        return eziologia_non_nota___ne;
    }
    public void setEziologia_non_nota___ne(Boolean eziologia_non_nota___ne) {
        this.eziologia_non_nota___ne = eziologia_non_nota___ne;
    }

    public Boolean getEziologia_non_nota___null() {
        return eziologia_non_nota___null;
    }
    public void setEziologia_non_nota___null(Boolean eziologia_non_nota___null) {
        this.eziologia_non_nota___null = eziologia_non_nota___null;
    }

    public Boolean getEziologia_non_nota___not___null() {
        return eziologia_non_nota___not___null;
    }
    public void setEziologia_non_nota___not___null(Boolean eziologia_non_nota___not___null) {
        this.eziologia_non_nota___not___null = eziologia_non_nota___not___null;
    }

    public Integer getId_respond___eq() {
        return id_respond___eq;
    }
    public void setId_respond___eq(Integer id_respond___eq) {
        this.id_respond___eq = id_respond___eq;
    }

    public Integer getId_respond___ne() {
        return id_respond___ne;
    }
    public void setId_respond___ne(Integer id_respond___ne) {
        this.id_respond___ne = id_respond___ne;
    }

    public Boolean getId_respond___null() {
        return id_respond___null;
    }
    public void setId_respond___null(Boolean id_respond___null) {
        this.id_respond___null = id_respond___null;
    }

    public Boolean getId_respond___not___null() {
        return id_respond___not___null;
    }
    public void setId_respond___not___null(Boolean id_respond___not___null) {
        this.id_respond___not___null = id_respond___not___null;
    }

    public java.util.List<Integer> getId_respond___in() {
        return id_respond___in;
    }
    public void setId_respond___in(java.util.List<Integer> id_respond___in) {
        this.id_respond___in = id_respond___in;
    }

    public java.util.List<Integer> getId_respond___not___in() {
        return id_respond___not___in;
    }
    public void setId_respond___not___in(java.util.List<Integer> id_respond___not___in) {
        this.id_respond___not___in = id_respond___not___in;
    }

    public Integer getId_respond___lt() {
        return id_respond___lt;
    }
    public void setId_respond___lt(Integer id_respond___lt) {
        this.id_respond___lt = id_respond___lt;
    }

    public Integer getId_respond___lte() {
        return id_respond___lte;
    }
    public void setId_respond___lte(Integer id_respond___lte) {
        this.id_respond___lte = id_respond___lte;
    }

    public Integer getId_respond___gt() {
        return id_respond___gt;
    }
    public void setId_respond___gt(Integer id_respond___gt) {
        this.id_respond___gt = id_respond___gt;
    }

    public Integer getId_respond___gte() {
        return id_respond___gte;
    }
    public void setId_respond___gte(Integer id_respond___gte) {
        this.id_respond___gte = id_respond___gte;
    }

    public String getNote___eq() {
        return note___eq;
    }
    public void setNote___eq(String note___eq) {
        this.note___eq = note___eq;
    }

    public String getNote___ne() {
        return note___ne;
    }
    public void setNote___ne(String note___ne) {
        this.note___ne = note___ne;
    }

    public Boolean getNote___null() {
        return note___null;
    }
    public void setNote___null(Boolean note___null) {
        this.note___null = note___null;
    }

    public Boolean getNote___not___null() {
        return note___not___null;
    }
    public void setNote___not___null(Boolean note___not___null) {
        this.note___not___null = note___not___null;
    }

    public java.util.List<String> getNote___in() {
        return note___in;
    }
    public void setNote___in(java.util.List<String> note___in) {
        this.note___in = note___in;
    }

    public java.util.List<String> getNote___not___in() {
        return note___not___in;
    }
    public void setNote___not___in(java.util.List<String> note___not___in) {
        this.note___not___in = note___not___in;
    }

    public String getNote___lt() {
        return note___lt;
    }
    public void setNote___lt(String note___lt) {
        this.note___lt = note___lt;
    }

    public String getNote___lte() {
        return note___lte;
    }
    public void setNote___lte(String note___lte) {
        this.note___lte = note___lte;
    }

    public String getNote___gt() {
        return note___gt;
    }
    public void setNote___gt(String note___gt) {
        this.note___gt = note___gt;
    }

    public String getNote___gte() {
        return note___gte;
    }
    public void setNote___gte(String note___gte) {
        this.note___gte = note___gte;
    }

    public String getNote___contains() {
        return note___contains;
    }
    public void setNote___contains(String note___contains) {
        this.note___contains = note___contains;
    }

    public String getNote___not___contains() {
        return note___not___contains;
    }
    public void setNote___not___contains(String note___not___contains) {
        this.note___not___contains = note___not___contains;
    }

    public String getNote___starts_with() {
        return note___starts_with;
    }
    public void setNote___starts_with(String note___starts_with) {
        this.note___starts_with = note___starts_with;
    }

    public String getNote___not___starts_with() {
        return note___not___starts_with;
    }
    public void setNote___not___starts_with(String note___not___starts_with) {
        this.note___not___starts_with = note___not___starts_with;
    }

    public String getNote___ends_with() {
        return note___ends_with;
    }
    public void setNote___ends_with(String note___ends_with) {
        this.note___ends_with = note___ends_with;
    }

    public String getNote___not___ends_with() {
        return note___not___ends_with;
    }
    public void setNote___not___ends_with(String note___not___ends_with) {
        this.note___not___ends_with = note___not___ends_with;
    }

    public String getPatologie___eq() {
        return patologie___eq;
    }
    public void setPatologie___eq(String patologie___eq) {
        this.patologie___eq = patologie___eq;
    }

    public String getPatologie___ne() {
        return patologie___ne;
    }
    public void setPatologie___ne(String patologie___ne) {
        this.patologie___ne = patologie___ne;
    }

    public Boolean getPatologie___null() {
        return patologie___null;
    }
    public void setPatologie___null(Boolean patologie___null) {
        this.patologie___null = patologie___null;
    }

    public Boolean getPatologie___not___null() {
        return patologie___not___null;
    }
    public void setPatologie___not___null(Boolean patologie___not___null) {
        this.patologie___not___null = patologie___not___null;
    }

    public java.util.List<String> getPatologie___in() {
        return patologie___in;
    }
    public void setPatologie___in(java.util.List<String> patologie___in) {
        this.patologie___in = patologie___in;
    }

    public java.util.List<String> getPatologie___not___in() {
        return patologie___not___in;
    }
    public void setPatologie___not___in(java.util.List<String> patologie___not___in) {
        this.patologie___not___in = patologie___not___in;
    }

    public String getPatologie___lt() {
        return patologie___lt;
    }
    public void setPatologie___lt(String patologie___lt) {
        this.patologie___lt = patologie___lt;
    }

    public String getPatologie___lte() {
        return patologie___lte;
    }
    public void setPatologie___lte(String patologie___lte) {
        this.patologie___lte = patologie___lte;
    }

    public String getPatologie___gt() {
        return patologie___gt;
    }
    public void setPatologie___gt(String patologie___gt) {
        this.patologie___gt = patologie___gt;
    }

    public String getPatologie___gte() {
        return patologie___gte;
    }
    public void setPatologie___gte(String patologie___gte) {
        this.patologie___gte = patologie___gte;
    }

    public String getPatologie___contains() {
        return patologie___contains;
    }
    public void setPatologie___contains(String patologie___contains) {
        this.patologie___contains = patologie___contains;
    }

    public String getPatologie___not___contains() {
        return patologie___not___contains;
    }
    public void setPatologie___not___contains(String patologie___not___contains) {
        this.patologie___not___contains = patologie___not___contains;
    }

    public String getPatologie___starts_with() {
        return patologie___starts_with;
    }
    public void setPatologie___starts_with(String patologie___starts_with) {
        this.patologie___starts_with = patologie___starts_with;
    }

    public String getPatologie___not___starts_with() {
        return patologie___not___starts_with;
    }
    public void setPatologie___not___starts_with(String patologie___not___starts_with) {
        this.patologie___not___starts_with = patologie___not___starts_with;
    }

    public String getPatologie___ends_with() {
        return patologie___ends_with;
    }
    public void setPatologie___ends_with(String patologie___ends_with) {
        this.patologie___ends_with = patologie___ends_with;
    }

    public String getPatologie___not___ends_with() {
        return patologie___not___ends_with;
    }
    public void setPatologie___not___ends_with(String patologie___not___ends_with) {
        this.patologie___not___ends_with = patologie___not___ends_with;
    }

    public Boolean getResezione_epatica___eq() {
        return resezione_epatica___eq;
    }
    public void setResezione_epatica___eq(Boolean resezione_epatica___eq) {
        this.resezione_epatica___eq = resezione_epatica___eq;
    }

    public Boolean getResezione_epatica___ne() {
        return resezione_epatica___ne;
    }
    public void setResezione_epatica___ne(Boolean resezione_epatica___ne) {
        this.resezione_epatica___ne = resezione_epatica___ne;
    }

    public Boolean getResezione_epatica___null() {
        return resezione_epatica___null;
    }
    public void setResezione_epatica___null(Boolean resezione_epatica___null) {
        this.resezione_epatica___null = resezione_epatica___null;
    }

    public Boolean getResezione_epatica___not___null() {
        return resezione_epatica___not___null;
    }
    public void setResezione_epatica___not___null(Boolean resezione_epatica___not___null) {
        this.resezione_epatica___not___null = resezione_epatica___not___null;
    }

    public String getStato_richiesta___eq() {
        return stato_richiesta___eq;
    }
    public void setStato_richiesta___eq(String stato_richiesta___eq) {
        this.stato_richiesta___eq = stato_richiesta___eq;
    }

    public String getStato_richiesta___ne() {
        return stato_richiesta___ne;
    }
    public void setStato_richiesta___ne(String stato_richiesta___ne) {
        this.stato_richiesta___ne = stato_richiesta___ne;
    }

    public Boolean getStato_richiesta___null() {
        return stato_richiesta___null;
    }
    public void setStato_richiesta___null(Boolean stato_richiesta___null) {
        this.stato_richiesta___null = stato_richiesta___null;
    }

    public Boolean getStato_richiesta___not___null() {
        return stato_richiesta___not___null;
    }
    public void setStato_richiesta___not___null(Boolean stato_richiesta___not___null) {
        this.stato_richiesta___not___null = stato_richiesta___not___null;
    }

    public java.util.List<String> getStato_richiesta___in() {
        return stato_richiesta___in;
    }
    public void setStato_richiesta___in(java.util.List<String> stato_richiesta___in) {
        this.stato_richiesta___in = stato_richiesta___in;
    }

    public java.util.List<String> getStato_richiesta___not___in() {
        return stato_richiesta___not___in;
    }
    public void setStato_richiesta___not___in(java.util.List<String> stato_richiesta___not___in) {
        this.stato_richiesta___not___in = stato_richiesta___not___in;
    }

    public String getStato_richiesta___lt() {
        return stato_richiesta___lt;
    }
    public void setStato_richiesta___lt(String stato_richiesta___lt) {
        this.stato_richiesta___lt = stato_richiesta___lt;
    }

    public String getStato_richiesta___lte() {
        return stato_richiesta___lte;
    }
    public void setStato_richiesta___lte(String stato_richiesta___lte) {
        this.stato_richiesta___lte = stato_richiesta___lte;
    }

    public String getStato_richiesta___gt() {
        return stato_richiesta___gt;
    }
    public void setStato_richiesta___gt(String stato_richiesta___gt) {
        this.stato_richiesta___gt = stato_richiesta___gt;
    }

    public String getStato_richiesta___gte() {
        return stato_richiesta___gte;
    }
    public void setStato_richiesta___gte(String stato_richiesta___gte) {
        this.stato_richiesta___gte = stato_richiesta___gte;
    }

    public String getStato_richiesta___contains() {
        return stato_richiesta___contains;
    }
    public void setStato_richiesta___contains(String stato_richiesta___contains) {
        this.stato_richiesta___contains = stato_richiesta___contains;
    }

    public String getStato_richiesta___not___contains() {
        return stato_richiesta___not___contains;
    }
    public void setStato_richiesta___not___contains(String stato_richiesta___not___contains) {
        this.stato_richiesta___not___contains = stato_richiesta___not___contains;
    }

    public String getStato_richiesta___starts_with() {
        return stato_richiesta___starts_with;
    }
    public void setStato_richiesta___starts_with(String stato_richiesta___starts_with) {
        this.stato_richiesta___starts_with = stato_richiesta___starts_with;
    }

    public String getStato_richiesta___not___starts_with() {
        return stato_richiesta___not___starts_with;
    }
    public void setStato_richiesta___not___starts_with(String stato_richiesta___not___starts_with) {
        this.stato_richiesta___not___starts_with = stato_richiesta___not___starts_with;
    }

    public String getStato_richiesta___ends_with() {
        return stato_richiesta___ends_with;
    }
    public void setStato_richiesta___ends_with(String stato_richiesta___ends_with) {
        this.stato_richiesta___ends_with = stato_richiesta___ends_with;
    }

    public String getStato_richiesta___not___ends_with() {
        return stato_richiesta___not___ends_with;
    }
    public void setStato_richiesta___not___ends_with(String stato_richiesta___not___ends_with) {
        this.stato_richiesta___not___ends_with = stato_richiesta___not___ends_with;
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

    public Boolean getTermoablazione___eq() {
        return termoablazione___eq;
    }
    public void setTermoablazione___eq(Boolean termoablazione___eq) {
        this.termoablazione___eq = termoablazione___eq;
    }

    public Boolean getTermoablazione___ne() {
        return termoablazione___ne;
    }
    public void setTermoablazione___ne(Boolean termoablazione___ne) {
        this.termoablazione___ne = termoablazione___ne;
    }

    public Boolean getTermoablazione___null() {
        return termoablazione___null;
    }
    public void setTermoablazione___null(Boolean termoablazione___null) {
        this.termoablazione___null = termoablazione___null;
    }

    public Boolean getTermoablazione___not___null() {
        return termoablazione___not___null;
    }
    public void setTermoablazione___not___null(Boolean termoablazione___not___null) {
        this.termoablazione___not___null = termoablazione___not___null;
    }

    public Boolean getTrapianto_epatico___eq() {
        return trapianto_epatico___eq;
    }
    public void setTrapianto_epatico___eq(Boolean trapianto_epatico___eq) {
        this.trapianto_epatico___eq = trapianto_epatico___eq;
    }

    public Boolean getTrapianto_epatico___ne() {
        return trapianto_epatico___ne;
    }
    public void setTrapianto_epatico___ne(Boolean trapianto_epatico___ne) {
        this.trapianto_epatico___ne = trapianto_epatico___ne;
    }

    public Boolean getTrapianto_epatico___null() {
        return trapianto_epatico___null;
    }
    public void setTrapianto_epatico___null(Boolean trapianto_epatico___null) {
        this.trapianto_epatico___null = trapianto_epatico___null;
    }

    public Boolean getTrapianto_epatico___not___null() {
        return trapianto_epatico___not___null;
    }
    public void setTrapianto_epatico___not___null(Boolean trapianto_epatico___not___null) {
        this.trapianto_epatico___not___null = trapianto_epatico___not___null;
    }

    public Boolean getWarning_respond_biop___eq() {
        return warning_respond_biop___eq;
    }
    public void setWarning_respond_biop___eq(Boolean warning_respond_biop___eq) {
        this.warning_respond_biop___eq = warning_respond_biop___eq;
    }

    public Boolean getWarning_respond_biop___ne() {
        return warning_respond_biop___ne;
    }
    public void setWarning_respond_biop___ne(Boolean warning_respond_biop___ne) {
        this.warning_respond_biop___ne = warning_respond_biop___ne;
    }

    public Boolean getWarning_respond_biop___null() {
        return warning_respond_biop___null;
    }
    public void setWarning_respond_biop___null(Boolean warning_respond_biop___null) {
        this.warning_respond_biop___null = warning_respond_biop___null;
    }

    public Boolean getWarning_respond_biop___not___null() {
        return warning_respond_biop___not___null;
    }
    public void setWarning_respond_biop___not___null(Boolean warning_respond_biop___not___null) {
        this.warning_respond_biop___not___null = warning_respond_biop___not___null;
    }

    public Boolean getWarning_respond_epa___eq() {
        return warning_respond_epa___eq;
    }
    public void setWarning_respond_epa___eq(Boolean warning_respond_epa___eq) {
        this.warning_respond_epa___eq = warning_respond_epa___eq;
    }

    public Boolean getWarning_respond_epa___ne() {
        return warning_respond_epa___ne;
    }
    public void setWarning_respond_epa___ne(Boolean warning_respond_epa___ne) {
        this.warning_respond_epa___ne = warning_respond_epa___ne;
    }

    public Boolean getWarning_respond_epa___null() {
        return warning_respond_epa___null;
    }
    public void setWarning_respond_epa___null(Boolean warning_respond_epa___null) {
        this.warning_respond_epa___null = warning_respond_epa___null;
    }

    public Boolean getWarning_respond_epa___not___null() {
        return warning_respond_epa___not___null;
    }
    public void setWarning_respond_epa___not___null(Boolean warning_respond_epa___not___null) {
        this.warning_respond_epa___not___null = warning_respond_epa___not___null;
    }

    public java.util.List<CliEvento_epaticoFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliEvento_epaticoFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliEvento_epaticoFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliEvento_epaticoFilterDTO> OR) {
        this.OR = OR;
    }

    public CliEvento_epaticoFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliEvento_epaticoFilterDTO NOT) {
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
        if (alcolizzazione___eq != null) {
            joiner.add("alcolizzazione___eq: " + GraphQLRequestSerializer.getEntry(alcolizzazione___eq));
        }
        if (alcolizzazione___ne != null) {
            joiner.add("alcolizzazione___ne: " + GraphQLRequestSerializer.getEntry(alcolizzazione___ne));
        }
        if (alcolizzazione___null != null) {
            joiner.add("alcolizzazione___null: " + GraphQLRequestSerializer.getEntry(alcolizzazione___null));
        }
        if (alcolizzazione___not___null != null) {
            joiner.add("alcolizzazione___not___null: " + GraphQLRequestSerializer.getEntry(alcolizzazione___not___null));
        }
        if (altra_eziologia___eq != null) {
            joiner.add("altra_eziologia___eq: " + GraphQLRequestSerializer.getEntry(altra_eziologia___eq));
        }
        if (altra_eziologia___ne != null) {
            joiner.add("altra_eziologia___ne: " + GraphQLRequestSerializer.getEntry(altra_eziologia___ne));
        }
        if (altra_eziologia___null != null) {
            joiner.add("altra_eziologia___null: " + GraphQLRequestSerializer.getEntry(altra_eziologia___null));
        }
        if (altra_eziologia___not___null != null) {
            joiner.add("altra_eziologia___not___null: " + GraphQLRequestSerializer.getEntry(altra_eziologia___not___null));
        }
        if (altra_eziologia___in != null) {
            joiner.add("altra_eziologia___in: " + GraphQLRequestSerializer.getEntry(altra_eziologia___in));
        }
        if (altra_eziologia___not___in != null) {
            joiner.add("altra_eziologia___not___in: " + GraphQLRequestSerializer.getEntry(altra_eziologia___not___in));
        }
        if (altra_eziologia___lt != null) {
            joiner.add("altra_eziologia___lt: " + GraphQLRequestSerializer.getEntry(altra_eziologia___lt));
        }
        if (altra_eziologia___lte != null) {
            joiner.add("altra_eziologia___lte: " + GraphQLRequestSerializer.getEntry(altra_eziologia___lte));
        }
        if (altra_eziologia___gt != null) {
            joiner.add("altra_eziologia___gt: " + GraphQLRequestSerializer.getEntry(altra_eziologia___gt));
        }
        if (altra_eziologia___gte != null) {
            joiner.add("altra_eziologia___gte: " + GraphQLRequestSerializer.getEntry(altra_eziologia___gte));
        }
        if (altra_eziologia___contains != null) {
            joiner.add("altra_eziologia___contains: " + GraphQLRequestSerializer.getEntry(altra_eziologia___contains));
        }
        if (altra_eziologia___not___contains != null) {
            joiner.add("altra_eziologia___not___contains: " + GraphQLRequestSerializer.getEntry(altra_eziologia___not___contains));
        }
        if (altra_eziologia___starts_with != null) {
            joiner.add("altra_eziologia___starts_with: " + GraphQLRequestSerializer.getEntry(altra_eziologia___starts_with));
        }
        if (altra_eziologia___not___starts_with != null) {
            joiner.add("altra_eziologia___not___starts_with: " + GraphQLRequestSerializer.getEntry(altra_eziologia___not___starts_with));
        }
        if (altra_eziologia___ends_with != null) {
            joiner.add("altra_eziologia___ends_with: " + GraphQLRequestSerializer.getEntry(altra_eziologia___ends_with));
        }
        if (altra_eziologia___not___ends_with != null) {
            joiner.add("altra_eziologia___not___ends_with: " + GraphQLRequestSerializer.getEntry(altra_eziologia___not___ends_with));
        }
        if (altra_procedura_chirurgica___eq != null) {
            joiner.add("altra_procedura_chirurgica___eq: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___eq));
        }
        if (altra_procedura_chirurgica___ne != null) {
            joiner.add("altra_procedura_chirurgica___ne: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___ne));
        }
        if (altra_procedura_chirurgica___null != null) {
            joiner.add("altra_procedura_chirurgica___null: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___null));
        }
        if (altra_procedura_chirurgica___not___null != null) {
            joiner.add("altra_procedura_chirurgica___not___null: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___not___null));
        }
        if (altra_procedura_chirurgica___in != null) {
            joiner.add("altra_procedura_chirurgica___in: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___in));
        }
        if (altra_procedura_chirurgica___not___in != null) {
            joiner.add("altra_procedura_chirurgica___not___in: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___not___in));
        }
        if (altra_procedura_chirurgica___lt != null) {
            joiner.add("altra_procedura_chirurgica___lt: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___lt));
        }
        if (altra_procedura_chirurgica___lte != null) {
            joiner.add("altra_procedura_chirurgica___lte: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___lte));
        }
        if (altra_procedura_chirurgica___gt != null) {
            joiner.add("altra_procedura_chirurgica___gt: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___gt));
        }
        if (altra_procedura_chirurgica___gte != null) {
            joiner.add("altra_procedura_chirurgica___gte: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___gte));
        }
        if (altra_procedura_chirurgica___contains != null) {
            joiner.add("altra_procedura_chirurgica___contains: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___contains));
        }
        if (altra_procedura_chirurgica___not___contains != null) {
            joiner.add("altra_procedura_chirurgica___not___contains: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___not___contains));
        }
        if (altra_procedura_chirurgica___starts_with != null) {
            joiner.add("altra_procedura_chirurgica___starts_with: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___starts_with));
        }
        if (altra_procedura_chirurgica___not___starts_with != null) {
            joiner.add("altra_procedura_chirurgica___not___starts_with: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___not___starts_with));
        }
        if (altra_procedura_chirurgica___ends_with != null) {
            joiner.add("altra_procedura_chirurgica___ends_with: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___ends_with));
        }
        if (altra_procedura_chirurgica___not___ends_with != null) {
            joiner.add("altra_procedura_chirurgica___not___ends_with: " + GraphQLRequestSerializer.getEntry(altra_procedura_chirurgica___not___ends_with));
        }
        if (altri_dettagli_istologia___eq != null) {
            joiner.add("altri_dettagli_istologia___eq: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___eq));
        }
        if (altri_dettagli_istologia___ne != null) {
            joiner.add("altri_dettagli_istologia___ne: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___ne));
        }
        if (altri_dettagli_istologia___null != null) {
            joiner.add("altri_dettagli_istologia___null: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___null));
        }
        if (altri_dettagli_istologia___not___null != null) {
            joiner.add("altri_dettagli_istologia___not___null: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___not___null));
        }
        if (altri_dettagli_istologia___in != null) {
            joiner.add("altri_dettagli_istologia___in: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___in));
        }
        if (altri_dettagli_istologia___not___in != null) {
            joiner.add("altri_dettagli_istologia___not___in: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___not___in));
        }
        if (altri_dettagli_istologia___lt != null) {
            joiner.add("altri_dettagli_istologia___lt: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___lt));
        }
        if (altri_dettagli_istologia___lte != null) {
            joiner.add("altri_dettagli_istologia___lte: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___lte));
        }
        if (altri_dettagli_istologia___gt != null) {
            joiner.add("altri_dettagli_istologia___gt: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___gt));
        }
        if (altri_dettagli_istologia___gte != null) {
            joiner.add("altri_dettagli_istologia___gte: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___gte));
        }
        if (altri_dettagli_istologia___contains != null) {
            joiner.add("altri_dettagli_istologia___contains: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___contains));
        }
        if (altri_dettagli_istologia___not___contains != null) {
            joiner.add("altri_dettagli_istologia___not___contains: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___not___contains));
        }
        if (altri_dettagli_istologia___starts_with != null) {
            joiner.add("altri_dettagli_istologia___starts_with: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___starts_with));
        }
        if (altri_dettagli_istologia___not___starts_with != null) {
            joiner.add("altri_dettagli_istologia___not___starts_with: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___not___starts_with));
        }
        if (altri_dettagli_istologia___ends_with != null) {
            joiner.add("altri_dettagli_istologia___ends_with: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___ends_with));
        }
        if (altri_dettagli_istologia___not___ends_with != null) {
            joiner.add("altri_dettagli_istologia___not___ends_with: " + GraphQLRequestSerializer.getEntry(altri_dettagli_istologia___not___ends_with));
        }
        if (chemioembolizzazione___eq != null) {
            joiner.add("chemioembolizzazione___eq: " + GraphQLRequestSerializer.getEntry(chemioembolizzazione___eq));
        }
        if (chemioembolizzazione___ne != null) {
            joiner.add("chemioembolizzazione___ne: " + GraphQLRequestSerializer.getEntry(chemioembolizzazione___ne));
        }
        if (chemioembolizzazione___null != null) {
            joiner.add("chemioembolizzazione___null: " + GraphQLRequestSerializer.getEntry(chemioembolizzazione___null));
        }
        if (chemioembolizzazione___not___null != null) {
            joiner.add("chemioembolizzazione___not___null: " + GraphQLRequestSerializer.getEntry(chemioembolizzazione___not___null));
        }
        if (classificazione_child___eq != null) {
            joiner.add("classificazione_child___eq: " + GraphQLRequestSerializer.getEntry(classificazione_child___eq));
        }
        if (classificazione_child___ne != null) {
            joiner.add("classificazione_child___ne: " + GraphQLRequestSerializer.getEntry(classificazione_child___ne));
        }
        if (classificazione_child___null != null) {
            joiner.add("classificazione_child___null: " + GraphQLRequestSerializer.getEntry(classificazione_child___null));
        }
        if (classificazione_child___not___null != null) {
            joiner.add("classificazione_child___not___null: " + GraphQLRequestSerializer.getEntry(classificazione_child___not___null));
        }
        if (classificazione_child___in != null) {
            joiner.add("classificazione_child___in: " + GraphQLRequestSerializer.getEntry(classificazione_child___in));
        }
        if (classificazione_child___not___in != null) {
            joiner.add("classificazione_child___not___in: " + GraphQLRequestSerializer.getEntry(classificazione_child___not___in));
        }
        if (classificazione_child___lt != null) {
            joiner.add("classificazione_child___lt: " + GraphQLRequestSerializer.getEntry(classificazione_child___lt));
        }
        if (classificazione_child___lte != null) {
            joiner.add("classificazione_child___lte: " + GraphQLRequestSerializer.getEntry(classificazione_child___lte));
        }
        if (classificazione_child___gt != null) {
            joiner.add("classificazione_child___gt: " + GraphQLRequestSerializer.getEntry(classificazione_child___gt));
        }
        if (classificazione_child___gte != null) {
            joiner.add("classificazione_child___gte: " + GraphQLRequestSerializer.getEntry(classificazione_child___gte));
        }
        if (classificazione_child___contains != null) {
            joiner.add("classificazione_child___contains: " + GraphQLRequestSerializer.getEntry(classificazione_child___contains));
        }
        if (classificazione_child___not___contains != null) {
            joiner.add("classificazione_child___not___contains: " + GraphQLRequestSerializer.getEntry(classificazione_child___not___contains));
        }
        if (classificazione_child___starts_with != null) {
            joiner.add("classificazione_child___starts_with: " + GraphQLRequestSerializer.getEntry(classificazione_child___starts_with));
        }
        if (classificazione_child___not___starts_with != null) {
            joiner.add("classificazione_child___not___starts_with: " + GraphQLRequestSerializer.getEntry(classificazione_child___not___starts_with));
        }
        if (classificazione_child___ends_with != null) {
            joiner.add("classificazione_child___ends_with: " + GraphQLRequestSerializer.getEntry(classificazione_child___ends_with));
        }
        if (classificazione_child___not___ends_with != null) {
            joiner.add("classificazione_child___not___ends_with: " + GraphQLRequestSerializer.getEntry(classificazione_child___not___ends_with));
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
        if (commenti___eq != null) {
            joiner.add("commenti___eq: " + GraphQLRequestSerializer.getEntry(commenti___eq));
        }
        if (commenti___ne != null) {
            joiner.add("commenti___ne: " + GraphQLRequestSerializer.getEntry(commenti___ne));
        }
        if (commenti___null != null) {
            joiner.add("commenti___null: " + GraphQLRequestSerializer.getEntry(commenti___null));
        }
        if (commenti___not___null != null) {
            joiner.add("commenti___not___null: " + GraphQLRequestSerializer.getEntry(commenti___not___null));
        }
        if (commenti___in != null) {
            joiner.add("commenti___in: " + GraphQLRequestSerializer.getEntry(commenti___in));
        }
        if (commenti___not___in != null) {
            joiner.add("commenti___not___in: " + GraphQLRequestSerializer.getEntry(commenti___not___in));
        }
        if (commenti___lt != null) {
            joiner.add("commenti___lt: " + GraphQLRequestSerializer.getEntry(commenti___lt));
        }
        if (commenti___lte != null) {
            joiner.add("commenti___lte: " + GraphQLRequestSerializer.getEntry(commenti___lte));
        }
        if (commenti___gt != null) {
            joiner.add("commenti___gt: " + GraphQLRequestSerializer.getEntry(commenti___gt));
        }
        if (commenti___gte != null) {
            joiner.add("commenti___gte: " + GraphQLRequestSerializer.getEntry(commenti___gte));
        }
        if (commenti___contains != null) {
            joiner.add("commenti___contains: " + GraphQLRequestSerializer.getEntry(commenti___contains));
        }
        if (commenti___not___contains != null) {
            joiner.add("commenti___not___contains: " + GraphQLRequestSerializer.getEntry(commenti___not___contains));
        }
        if (commenti___starts_with != null) {
            joiner.add("commenti___starts_with: " + GraphQLRequestSerializer.getEntry(commenti___starts_with));
        }
        if (commenti___not___starts_with != null) {
            joiner.add("commenti___not___starts_with: " + GraphQLRequestSerializer.getEntry(commenti___not___starts_with));
        }
        if (commenti___ends_with != null) {
            joiner.add("commenti___ends_with: " + GraphQLRequestSerializer.getEntry(commenti___ends_with));
        }
        if (commenti___not___ends_with != null) {
            joiner.add("commenti___not___ends_with: " + GraphQLRequestSerializer.getEntry(commenti___not___ends_with));
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
        if (data_ricezione___eq != null) {
            joiner.add("data_ricezione___eq: " + GraphQLRequestSerializer.getEntry(data_ricezione___eq));
        }
        if (data_ricezione___ne != null) {
            joiner.add("data_ricezione___ne: " + GraphQLRequestSerializer.getEntry(data_ricezione___ne));
        }
        if (data_ricezione___null != null) {
            joiner.add("data_ricezione___null: " + GraphQLRequestSerializer.getEntry(data_ricezione___null));
        }
        if (data_ricezione___not___null != null) {
            joiner.add("data_ricezione___not___null: " + GraphQLRequestSerializer.getEntry(data_ricezione___not___null));
        }
        if (data_ricezione___in != null) {
            joiner.add("data_ricezione___in: " + GraphQLRequestSerializer.getEntry(data_ricezione___in));
        }
        if (data_ricezione___not___in != null) {
            joiner.add("data_ricezione___not___in: " + GraphQLRequestSerializer.getEntry(data_ricezione___not___in));
        }
        if (data_ricezione___lt != null) {
            joiner.add("data_ricezione___lt: " + GraphQLRequestSerializer.getEntry(data_ricezione___lt));
        }
        if (data_ricezione___lte != null) {
            joiner.add("data_ricezione___lte: " + GraphQLRequestSerializer.getEntry(data_ricezione___lte));
        }
        if (data_ricezione___gt != null) {
            joiner.add("data_ricezione___gt: " + GraphQLRequestSerializer.getEntry(data_ricezione___gt));
        }
        if (data_ricezione___gte != null) {
            joiner.add("data_ricezione___gte: " + GraphQLRequestSerializer.getEntry(data_ricezione___gte));
        }
        if (data_richiesta___eq != null) {
            joiner.add("data_richiesta___eq: " + GraphQLRequestSerializer.getEntry(data_richiesta___eq));
        }
        if (data_richiesta___ne != null) {
            joiner.add("data_richiesta___ne: " + GraphQLRequestSerializer.getEntry(data_richiesta___ne));
        }
        if (data_richiesta___null != null) {
            joiner.add("data_richiesta___null: " + GraphQLRequestSerializer.getEntry(data_richiesta___null));
        }
        if (data_richiesta___not___null != null) {
            joiner.add("data_richiesta___not___null: " + GraphQLRequestSerializer.getEntry(data_richiesta___not___null));
        }
        if (data_richiesta___in != null) {
            joiner.add("data_richiesta___in: " + GraphQLRequestSerializer.getEntry(data_richiesta___in));
        }
        if (data_richiesta___not___in != null) {
            joiner.add("data_richiesta___not___in: " + GraphQLRequestSerializer.getEntry(data_richiesta___not___in));
        }
        if (data_richiesta___lt != null) {
            joiner.add("data_richiesta___lt: " + GraphQLRequestSerializer.getEntry(data_richiesta___lt));
        }
        if (data_richiesta___lte != null) {
            joiner.add("data_richiesta___lte: " + GraphQLRequestSerializer.getEntry(data_richiesta___lte));
        }
        if (data_richiesta___gt != null) {
            joiner.add("data_richiesta___gt: " + GraphQLRequestSerializer.getEntry(data_richiesta___gt));
        }
        if (data_richiesta___gte != null) {
            joiner.add("data_richiesta___gte: " + GraphQLRequestSerializer.getEntry(data_richiesta___gte));
        }
        if (eziologia_alcool___eq != null) {
            joiner.add("eziologia_alcool___eq: " + GraphQLRequestSerializer.getEntry(eziologia_alcool___eq));
        }
        if (eziologia_alcool___ne != null) {
            joiner.add("eziologia_alcool___ne: " + GraphQLRequestSerializer.getEntry(eziologia_alcool___ne));
        }
        if (eziologia_alcool___null != null) {
            joiner.add("eziologia_alcool___null: " + GraphQLRequestSerializer.getEntry(eziologia_alcool___null));
        }
        if (eziologia_alcool___not___null != null) {
            joiner.add("eziologia_alcool___not___null: " + GraphQLRequestSerializer.getEntry(eziologia_alcool___not___null));
        }
        if (eziologia_farmaci___eq != null) {
            joiner.add("eziologia_farmaci___eq: " + GraphQLRequestSerializer.getEntry(eziologia_farmaci___eq));
        }
        if (eziologia_farmaci___ne != null) {
            joiner.add("eziologia_farmaci___ne: " + GraphQLRequestSerializer.getEntry(eziologia_farmaci___ne));
        }
        if (eziologia_farmaci___null != null) {
            joiner.add("eziologia_farmaci___null: " + GraphQLRequestSerializer.getEntry(eziologia_farmaci___null));
        }
        if (eziologia_farmaci___not___null != null) {
            joiner.add("eziologia_farmaci___not___null: " + GraphQLRequestSerializer.getEntry(eziologia_farmaci___not___null));
        }
        if (eziologia_non_nota___eq != null) {
            joiner.add("eziologia_non_nota___eq: " + GraphQLRequestSerializer.getEntry(eziologia_non_nota___eq));
        }
        if (eziologia_non_nota___ne != null) {
            joiner.add("eziologia_non_nota___ne: " + GraphQLRequestSerializer.getEntry(eziologia_non_nota___ne));
        }
        if (eziologia_non_nota___null != null) {
            joiner.add("eziologia_non_nota___null: " + GraphQLRequestSerializer.getEntry(eziologia_non_nota___null));
        }
        if (eziologia_non_nota___not___null != null) {
            joiner.add("eziologia_non_nota___not___null: " + GraphQLRequestSerializer.getEntry(eziologia_non_nota___not___null));
        }
        if (id_respond___eq != null) {
            joiner.add("id_respond___eq: " + GraphQLRequestSerializer.getEntry(id_respond___eq));
        }
        if (id_respond___ne != null) {
            joiner.add("id_respond___ne: " + GraphQLRequestSerializer.getEntry(id_respond___ne));
        }
        if (id_respond___null != null) {
            joiner.add("id_respond___null: " + GraphQLRequestSerializer.getEntry(id_respond___null));
        }
        if (id_respond___not___null != null) {
            joiner.add("id_respond___not___null: " + GraphQLRequestSerializer.getEntry(id_respond___not___null));
        }
        if (id_respond___in != null) {
            joiner.add("id_respond___in: " + GraphQLRequestSerializer.getEntry(id_respond___in));
        }
        if (id_respond___not___in != null) {
            joiner.add("id_respond___not___in: " + GraphQLRequestSerializer.getEntry(id_respond___not___in));
        }
        if (id_respond___lt != null) {
            joiner.add("id_respond___lt: " + GraphQLRequestSerializer.getEntry(id_respond___lt));
        }
        if (id_respond___lte != null) {
            joiner.add("id_respond___lte: " + GraphQLRequestSerializer.getEntry(id_respond___lte));
        }
        if (id_respond___gt != null) {
            joiner.add("id_respond___gt: " + GraphQLRequestSerializer.getEntry(id_respond___gt));
        }
        if (id_respond___gte != null) {
            joiner.add("id_respond___gte: " + GraphQLRequestSerializer.getEntry(id_respond___gte));
        }
        if (note___eq != null) {
            joiner.add("note___eq: " + GraphQLRequestSerializer.getEntry(note___eq));
        }
        if (note___ne != null) {
            joiner.add("note___ne: " + GraphQLRequestSerializer.getEntry(note___ne));
        }
        if (note___null != null) {
            joiner.add("note___null: " + GraphQLRequestSerializer.getEntry(note___null));
        }
        if (note___not___null != null) {
            joiner.add("note___not___null: " + GraphQLRequestSerializer.getEntry(note___not___null));
        }
        if (note___in != null) {
            joiner.add("note___in: " + GraphQLRequestSerializer.getEntry(note___in));
        }
        if (note___not___in != null) {
            joiner.add("note___not___in: " + GraphQLRequestSerializer.getEntry(note___not___in));
        }
        if (note___lt != null) {
            joiner.add("note___lt: " + GraphQLRequestSerializer.getEntry(note___lt));
        }
        if (note___lte != null) {
            joiner.add("note___lte: " + GraphQLRequestSerializer.getEntry(note___lte));
        }
        if (note___gt != null) {
            joiner.add("note___gt: " + GraphQLRequestSerializer.getEntry(note___gt));
        }
        if (note___gte != null) {
            joiner.add("note___gte: " + GraphQLRequestSerializer.getEntry(note___gte));
        }
        if (note___contains != null) {
            joiner.add("note___contains: " + GraphQLRequestSerializer.getEntry(note___contains));
        }
        if (note___not___contains != null) {
            joiner.add("note___not___contains: " + GraphQLRequestSerializer.getEntry(note___not___contains));
        }
        if (note___starts_with != null) {
            joiner.add("note___starts_with: " + GraphQLRequestSerializer.getEntry(note___starts_with));
        }
        if (note___not___starts_with != null) {
            joiner.add("note___not___starts_with: " + GraphQLRequestSerializer.getEntry(note___not___starts_with));
        }
        if (note___ends_with != null) {
            joiner.add("note___ends_with: " + GraphQLRequestSerializer.getEntry(note___ends_with));
        }
        if (note___not___ends_with != null) {
            joiner.add("note___not___ends_with: " + GraphQLRequestSerializer.getEntry(note___not___ends_with));
        }
        if (patologie___eq != null) {
            joiner.add("patologie___eq: " + GraphQLRequestSerializer.getEntry(patologie___eq));
        }
        if (patologie___ne != null) {
            joiner.add("patologie___ne: " + GraphQLRequestSerializer.getEntry(patologie___ne));
        }
        if (patologie___null != null) {
            joiner.add("patologie___null: " + GraphQLRequestSerializer.getEntry(patologie___null));
        }
        if (patologie___not___null != null) {
            joiner.add("patologie___not___null: " + GraphQLRequestSerializer.getEntry(patologie___not___null));
        }
        if (patologie___in != null) {
            joiner.add("patologie___in: " + GraphQLRequestSerializer.getEntry(patologie___in));
        }
        if (patologie___not___in != null) {
            joiner.add("patologie___not___in: " + GraphQLRequestSerializer.getEntry(patologie___not___in));
        }
        if (patologie___lt != null) {
            joiner.add("patologie___lt: " + GraphQLRequestSerializer.getEntry(patologie___lt));
        }
        if (patologie___lte != null) {
            joiner.add("patologie___lte: " + GraphQLRequestSerializer.getEntry(patologie___lte));
        }
        if (patologie___gt != null) {
            joiner.add("patologie___gt: " + GraphQLRequestSerializer.getEntry(patologie___gt));
        }
        if (patologie___gte != null) {
            joiner.add("patologie___gte: " + GraphQLRequestSerializer.getEntry(patologie___gte));
        }
        if (patologie___contains != null) {
            joiner.add("patologie___contains: " + GraphQLRequestSerializer.getEntry(patologie___contains));
        }
        if (patologie___not___contains != null) {
            joiner.add("patologie___not___contains: " + GraphQLRequestSerializer.getEntry(patologie___not___contains));
        }
        if (patologie___starts_with != null) {
            joiner.add("patologie___starts_with: " + GraphQLRequestSerializer.getEntry(patologie___starts_with));
        }
        if (patologie___not___starts_with != null) {
            joiner.add("patologie___not___starts_with: " + GraphQLRequestSerializer.getEntry(patologie___not___starts_with));
        }
        if (patologie___ends_with != null) {
            joiner.add("patologie___ends_with: " + GraphQLRequestSerializer.getEntry(patologie___ends_with));
        }
        if (patologie___not___ends_with != null) {
            joiner.add("patologie___not___ends_with: " + GraphQLRequestSerializer.getEntry(patologie___not___ends_with));
        }
        if (resezione_epatica___eq != null) {
            joiner.add("resezione_epatica___eq: " + GraphQLRequestSerializer.getEntry(resezione_epatica___eq));
        }
        if (resezione_epatica___ne != null) {
            joiner.add("resezione_epatica___ne: " + GraphQLRequestSerializer.getEntry(resezione_epatica___ne));
        }
        if (resezione_epatica___null != null) {
            joiner.add("resezione_epatica___null: " + GraphQLRequestSerializer.getEntry(resezione_epatica___null));
        }
        if (resezione_epatica___not___null != null) {
            joiner.add("resezione_epatica___not___null: " + GraphQLRequestSerializer.getEntry(resezione_epatica___not___null));
        }
        if (stato_richiesta___eq != null) {
            joiner.add("stato_richiesta___eq: " + GraphQLRequestSerializer.getEntry(stato_richiesta___eq));
        }
        if (stato_richiesta___ne != null) {
            joiner.add("stato_richiesta___ne: " + GraphQLRequestSerializer.getEntry(stato_richiesta___ne));
        }
        if (stato_richiesta___null != null) {
            joiner.add("stato_richiesta___null: " + GraphQLRequestSerializer.getEntry(stato_richiesta___null));
        }
        if (stato_richiesta___not___null != null) {
            joiner.add("stato_richiesta___not___null: " + GraphQLRequestSerializer.getEntry(stato_richiesta___not___null));
        }
        if (stato_richiesta___in != null) {
            joiner.add("stato_richiesta___in: " + GraphQLRequestSerializer.getEntry(stato_richiesta___in));
        }
        if (stato_richiesta___not___in != null) {
            joiner.add("stato_richiesta___not___in: " + GraphQLRequestSerializer.getEntry(stato_richiesta___not___in));
        }
        if (stato_richiesta___lt != null) {
            joiner.add("stato_richiesta___lt: " + GraphQLRequestSerializer.getEntry(stato_richiesta___lt));
        }
        if (stato_richiesta___lte != null) {
            joiner.add("stato_richiesta___lte: " + GraphQLRequestSerializer.getEntry(stato_richiesta___lte));
        }
        if (stato_richiesta___gt != null) {
            joiner.add("stato_richiesta___gt: " + GraphQLRequestSerializer.getEntry(stato_richiesta___gt));
        }
        if (stato_richiesta___gte != null) {
            joiner.add("stato_richiesta___gte: " + GraphQLRequestSerializer.getEntry(stato_richiesta___gte));
        }
        if (stato_richiesta___contains != null) {
            joiner.add("stato_richiesta___contains: " + GraphQLRequestSerializer.getEntry(stato_richiesta___contains));
        }
        if (stato_richiesta___not___contains != null) {
            joiner.add("stato_richiesta___not___contains: " + GraphQLRequestSerializer.getEntry(stato_richiesta___not___contains));
        }
        if (stato_richiesta___starts_with != null) {
            joiner.add("stato_richiesta___starts_with: " + GraphQLRequestSerializer.getEntry(stato_richiesta___starts_with));
        }
        if (stato_richiesta___not___starts_with != null) {
            joiner.add("stato_richiesta___not___starts_with: " + GraphQLRequestSerializer.getEntry(stato_richiesta___not___starts_with));
        }
        if (stato_richiesta___ends_with != null) {
            joiner.add("stato_richiesta___ends_with: " + GraphQLRequestSerializer.getEntry(stato_richiesta___ends_with));
        }
        if (stato_richiesta___not___ends_with != null) {
            joiner.add("stato_richiesta___not___ends_with: " + GraphQLRequestSerializer.getEntry(stato_richiesta___not___ends_with));
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
        if (termoablazione___eq != null) {
            joiner.add("termoablazione___eq: " + GraphQLRequestSerializer.getEntry(termoablazione___eq));
        }
        if (termoablazione___ne != null) {
            joiner.add("termoablazione___ne: " + GraphQLRequestSerializer.getEntry(termoablazione___ne));
        }
        if (termoablazione___null != null) {
            joiner.add("termoablazione___null: " + GraphQLRequestSerializer.getEntry(termoablazione___null));
        }
        if (termoablazione___not___null != null) {
            joiner.add("termoablazione___not___null: " + GraphQLRequestSerializer.getEntry(termoablazione___not___null));
        }
        if (trapianto_epatico___eq != null) {
            joiner.add("trapianto_epatico___eq: " + GraphQLRequestSerializer.getEntry(trapianto_epatico___eq));
        }
        if (trapianto_epatico___ne != null) {
            joiner.add("trapianto_epatico___ne: " + GraphQLRequestSerializer.getEntry(trapianto_epatico___ne));
        }
        if (trapianto_epatico___null != null) {
            joiner.add("trapianto_epatico___null: " + GraphQLRequestSerializer.getEntry(trapianto_epatico___null));
        }
        if (trapianto_epatico___not___null != null) {
            joiner.add("trapianto_epatico___not___null: " + GraphQLRequestSerializer.getEntry(trapianto_epatico___not___null));
        }
        if (warning_respond_biop___eq != null) {
            joiner.add("warning_respond_biop___eq: " + GraphQLRequestSerializer.getEntry(warning_respond_biop___eq));
        }
        if (warning_respond_biop___ne != null) {
            joiner.add("warning_respond_biop___ne: " + GraphQLRequestSerializer.getEntry(warning_respond_biop___ne));
        }
        if (warning_respond_biop___null != null) {
            joiner.add("warning_respond_biop___null: " + GraphQLRequestSerializer.getEntry(warning_respond_biop___null));
        }
        if (warning_respond_biop___not___null != null) {
            joiner.add("warning_respond_biop___not___null: " + GraphQLRequestSerializer.getEntry(warning_respond_biop___not___null));
        }
        if (warning_respond_epa___eq != null) {
            joiner.add("warning_respond_epa___eq: " + GraphQLRequestSerializer.getEntry(warning_respond_epa___eq));
        }
        if (warning_respond_epa___ne != null) {
            joiner.add("warning_respond_epa___ne: " + GraphQLRequestSerializer.getEntry(warning_respond_epa___ne));
        }
        if (warning_respond_epa___null != null) {
            joiner.add("warning_respond_epa___null: " + GraphQLRequestSerializer.getEntry(warning_respond_epa___null));
        }
        if (warning_respond_epa___not___null != null) {
            joiner.add("warning_respond_epa___not___null: " + GraphQLRequestSerializer.getEntry(warning_respond_epa___not___null));
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

    public static CliEvento_epaticoFilterDTO.Builder builder() {
        return new CliEvento_epaticoFilterDTO.Builder();
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
        private Boolean alcolizzazione___eq;
        private Boolean alcolizzazione___ne;
        private Boolean alcolizzazione___null;
        private Boolean alcolizzazione___not___null;
        private String altra_eziologia___eq;
        private String altra_eziologia___ne;
        private Boolean altra_eziologia___null;
        private Boolean altra_eziologia___not___null;
        private java.util.List<String> altra_eziologia___in;
        private java.util.List<String> altra_eziologia___not___in;
        private String altra_eziologia___lt;
        private String altra_eziologia___lte;
        private String altra_eziologia___gt;
        private String altra_eziologia___gte;
        private String altra_eziologia___contains;
        private String altra_eziologia___not___contains;
        private String altra_eziologia___starts_with;
        private String altra_eziologia___not___starts_with;
        private String altra_eziologia___ends_with;
        private String altra_eziologia___not___ends_with;
        private String altra_procedura_chirurgica___eq;
        private String altra_procedura_chirurgica___ne;
        private Boolean altra_procedura_chirurgica___null;
        private Boolean altra_procedura_chirurgica___not___null;
        private java.util.List<String> altra_procedura_chirurgica___in;
        private java.util.List<String> altra_procedura_chirurgica___not___in;
        private String altra_procedura_chirurgica___lt;
        private String altra_procedura_chirurgica___lte;
        private String altra_procedura_chirurgica___gt;
        private String altra_procedura_chirurgica___gte;
        private String altra_procedura_chirurgica___contains;
        private String altra_procedura_chirurgica___not___contains;
        private String altra_procedura_chirurgica___starts_with;
        private String altra_procedura_chirurgica___not___starts_with;
        private String altra_procedura_chirurgica___ends_with;
        private String altra_procedura_chirurgica___not___ends_with;
        private String altri_dettagli_istologia___eq;
        private String altri_dettagli_istologia___ne;
        private Boolean altri_dettagli_istologia___null;
        private Boolean altri_dettagli_istologia___not___null;
        private java.util.List<String> altri_dettagli_istologia___in;
        private java.util.List<String> altri_dettagli_istologia___not___in;
        private String altri_dettagli_istologia___lt;
        private String altri_dettagli_istologia___lte;
        private String altri_dettagli_istologia___gt;
        private String altri_dettagli_istologia___gte;
        private String altri_dettagli_istologia___contains;
        private String altri_dettagli_istologia___not___contains;
        private String altri_dettagli_istologia___starts_with;
        private String altri_dettagli_istologia___not___starts_with;
        private String altri_dettagli_istologia___ends_with;
        private String altri_dettagli_istologia___not___ends_with;
        private Boolean chemioembolizzazione___eq;
        private Boolean chemioembolizzazione___ne;
        private Boolean chemioembolizzazione___null;
        private Boolean chemioembolizzazione___not___null;
        private String classificazione_child___eq;
        private String classificazione_child___ne;
        private Boolean classificazione_child___null;
        private Boolean classificazione_child___not___null;
        private java.util.List<String> classificazione_child___in;
        private java.util.List<String> classificazione_child___not___in;
        private String classificazione_child___lt;
        private String classificazione_child___lte;
        private String classificazione_child___gt;
        private String classificazione_child___gte;
        private String classificazione_child___contains;
        private String classificazione_child___not___contains;
        private String classificazione_child___starts_with;
        private String classificazione_child___not___starts_with;
        private String classificazione_child___ends_with;
        private String classificazione_child___not___ends_with;
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
        private String commenti___eq;
        private String commenti___ne;
        private Boolean commenti___null;
        private Boolean commenti___not___null;
        private java.util.List<String> commenti___in;
        private java.util.List<String> commenti___not___in;
        private String commenti___lt;
        private String commenti___lte;
        private String commenti___gt;
        private String commenti___gte;
        private String commenti___contains;
        private String commenti___not___contains;
        private String commenti___starts_with;
        private String commenti___not___starts_with;
        private String commenti___ends_with;
        private String commenti___not___ends_with;
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
        private String data_ricezione___eq;
        private String data_ricezione___ne;
        private Boolean data_ricezione___null;
        private Boolean data_ricezione___not___null;
        private java.util.List<String> data_ricezione___in;
        private java.util.List<String> data_ricezione___not___in;
        private String data_ricezione___lt;
        private String data_ricezione___lte;
        private String data_ricezione___gt;
        private String data_ricezione___gte;
        private String data_richiesta___eq;
        private String data_richiesta___ne;
        private Boolean data_richiesta___null;
        private Boolean data_richiesta___not___null;
        private java.util.List<String> data_richiesta___in;
        private java.util.List<String> data_richiesta___not___in;
        private String data_richiesta___lt;
        private String data_richiesta___lte;
        private String data_richiesta___gt;
        private String data_richiesta___gte;
        private Boolean eziologia_alcool___eq;
        private Boolean eziologia_alcool___ne;
        private Boolean eziologia_alcool___null;
        private Boolean eziologia_alcool___not___null;
        private Boolean eziologia_farmaci___eq;
        private Boolean eziologia_farmaci___ne;
        private Boolean eziologia_farmaci___null;
        private Boolean eziologia_farmaci___not___null;
        private Boolean eziologia_non_nota___eq;
        private Boolean eziologia_non_nota___ne;
        private Boolean eziologia_non_nota___null;
        private Boolean eziologia_non_nota___not___null;
        private Integer id_respond___eq;
        private Integer id_respond___ne;
        private Boolean id_respond___null;
        private Boolean id_respond___not___null;
        private java.util.List<Integer> id_respond___in;
        private java.util.List<Integer> id_respond___not___in;
        private Integer id_respond___lt;
        private Integer id_respond___lte;
        private Integer id_respond___gt;
        private Integer id_respond___gte;
        private String note___eq;
        private String note___ne;
        private Boolean note___null;
        private Boolean note___not___null;
        private java.util.List<String> note___in;
        private java.util.List<String> note___not___in;
        private String note___lt;
        private String note___lte;
        private String note___gt;
        private String note___gte;
        private String note___contains;
        private String note___not___contains;
        private String note___starts_with;
        private String note___not___starts_with;
        private String note___ends_with;
        private String note___not___ends_with;
        private String patologie___eq;
        private String patologie___ne;
        private Boolean patologie___null;
        private Boolean patologie___not___null;
        private java.util.List<String> patologie___in;
        private java.util.List<String> patologie___not___in;
        private String patologie___lt;
        private String patologie___lte;
        private String patologie___gt;
        private String patologie___gte;
        private String patologie___contains;
        private String patologie___not___contains;
        private String patologie___starts_with;
        private String patologie___not___starts_with;
        private String patologie___ends_with;
        private String patologie___not___ends_with;
        private Boolean resezione_epatica___eq;
        private Boolean resezione_epatica___ne;
        private Boolean resezione_epatica___null;
        private Boolean resezione_epatica___not___null;
        private String stato_richiesta___eq;
        private String stato_richiesta___ne;
        private Boolean stato_richiesta___null;
        private Boolean stato_richiesta___not___null;
        private java.util.List<String> stato_richiesta___in;
        private java.util.List<String> stato_richiesta___not___in;
        private String stato_richiesta___lt;
        private String stato_richiesta___lte;
        private String stato_richiesta___gt;
        private String stato_richiesta___gte;
        private String stato_richiesta___contains;
        private String stato_richiesta___not___contains;
        private String stato_richiesta___starts_with;
        private String stato_richiesta___not___starts_with;
        private String stato_richiesta___ends_with;
        private String stato_richiesta___not___ends_with;
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
        private Boolean termoablazione___eq;
        private Boolean termoablazione___ne;
        private Boolean termoablazione___null;
        private Boolean termoablazione___not___null;
        private Boolean trapianto_epatico___eq;
        private Boolean trapianto_epatico___ne;
        private Boolean trapianto_epatico___null;
        private Boolean trapianto_epatico___not___null;
        private Boolean warning_respond_biop___eq;
        private Boolean warning_respond_biop___ne;
        private Boolean warning_respond_biop___null;
        private Boolean warning_respond_biop___not___null;
        private Boolean warning_respond_epa___eq;
        private Boolean warning_respond_epa___ne;
        private Boolean warning_respond_epa___null;
        private Boolean warning_respond_epa___not___null;
        private java.util.List<CliEvento_epaticoFilterDTO> AND;
        private java.util.List<CliEvento_epaticoFilterDTO> OR;
        private CliEvento_epaticoFilterDTO NOT;

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

        public Builder setAlcolizzazione___eq(Boolean alcolizzazione___eq) {
            this.alcolizzazione___eq = alcolizzazione___eq;
            return this;
        }

        public Builder setAlcolizzazione___ne(Boolean alcolizzazione___ne) {
            this.alcolizzazione___ne = alcolizzazione___ne;
            return this;
        }

        public Builder setAlcolizzazione___null(Boolean alcolizzazione___null) {
            this.alcolizzazione___null = alcolizzazione___null;
            return this;
        }

        public Builder setAlcolizzazione___not___null(Boolean alcolizzazione___not___null) {
            this.alcolizzazione___not___null = alcolizzazione___not___null;
            return this;
        }

        public Builder setAltra_eziologia___eq(String altra_eziologia___eq) {
            this.altra_eziologia___eq = altra_eziologia___eq;
            return this;
        }

        public Builder setAltra_eziologia___ne(String altra_eziologia___ne) {
            this.altra_eziologia___ne = altra_eziologia___ne;
            return this;
        }

        public Builder setAltra_eziologia___null(Boolean altra_eziologia___null) {
            this.altra_eziologia___null = altra_eziologia___null;
            return this;
        }

        public Builder setAltra_eziologia___not___null(Boolean altra_eziologia___not___null) {
            this.altra_eziologia___not___null = altra_eziologia___not___null;
            return this;
        }

        public Builder setAltra_eziologia___in(java.util.List<String> altra_eziologia___in) {
            this.altra_eziologia___in = altra_eziologia___in;
            return this;
        }

        public Builder setAltra_eziologia___not___in(java.util.List<String> altra_eziologia___not___in) {
            this.altra_eziologia___not___in = altra_eziologia___not___in;
            return this;
        }

        public Builder setAltra_eziologia___lt(String altra_eziologia___lt) {
            this.altra_eziologia___lt = altra_eziologia___lt;
            return this;
        }

        public Builder setAltra_eziologia___lte(String altra_eziologia___lte) {
            this.altra_eziologia___lte = altra_eziologia___lte;
            return this;
        }

        public Builder setAltra_eziologia___gt(String altra_eziologia___gt) {
            this.altra_eziologia___gt = altra_eziologia___gt;
            return this;
        }

        public Builder setAltra_eziologia___gte(String altra_eziologia___gte) {
            this.altra_eziologia___gte = altra_eziologia___gte;
            return this;
        }

        public Builder setAltra_eziologia___contains(String altra_eziologia___contains) {
            this.altra_eziologia___contains = altra_eziologia___contains;
            return this;
        }

        public Builder setAltra_eziologia___not___contains(String altra_eziologia___not___contains) {
            this.altra_eziologia___not___contains = altra_eziologia___not___contains;
            return this;
        }

        public Builder setAltra_eziologia___starts_with(String altra_eziologia___starts_with) {
            this.altra_eziologia___starts_with = altra_eziologia___starts_with;
            return this;
        }

        public Builder setAltra_eziologia___not___starts_with(String altra_eziologia___not___starts_with) {
            this.altra_eziologia___not___starts_with = altra_eziologia___not___starts_with;
            return this;
        }

        public Builder setAltra_eziologia___ends_with(String altra_eziologia___ends_with) {
            this.altra_eziologia___ends_with = altra_eziologia___ends_with;
            return this;
        }

        public Builder setAltra_eziologia___not___ends_with(String altra_eziologia___not___ends_with) {
            this.altra_eziologia___not___ends_with = altra_eziologia___not___ends_with;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___eq(String altra_procedura_chirurgica___eq) {
            this.altra_procedura_chirurgica___eq = altra_procedura_chirurgica___eq;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___ne(String altra_procedura_chirurgica___ne) {
            this.altra_procedura_chirurgica___ne = altra_procedura_chirurgica___ne;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___null(Boolean altra_procedura_chirurgica___null) {
            this.altra_procedura_chirurgica___null = altra_procedura_chirurgica___null;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___not___null(Boolean altra_procedura_chirurgica___not___null) {
            this.altra_procedura_chirurgica___not___null = altra_procedura_chirurgica___not___null;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___in(java.util.List<String> altra_procedura_chirurgica___in) {
            this.altra_procedura_chirurgica___in = altra_procedura_chirurgica___in;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___not___in(java.util.List<String> altra_procedura_chirurgica___not___in) {
            this.altra_procedura_chirurgica___not___in = altra_procedura_chirurgica___not___in;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___lt(String altra_procedura_chirurgica___lt) {
            this.altra_procedura_chirurgica___lt = altra_procedura_chirurgica___lt;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___lte(String altra_procedura_chirurgica___lte) {
            this.altra_procedura_chirurgica___lte = altra_procedura_chirurgica___lte;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___gt(String altra_procedura_chirurgica___gt) {
            this.altra_procedura_chirurgica___gt = altra_procedura_chirurgica___gt;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___gte(String altra_procedura_chirurgica___gte) {
            this.altra_procedura_chirurgica___gte = altra_procedura_chirurgica___gte;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___contains(String altra_procedura_chirurgica___contains) {
            this.altra_procedura_chirurgica___contains = altra_procedura_chirurgica___contains;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___not___contains(String altra_procedura_chirurgica___not___contains) {
            this.altra_procedura_chirurgica___not___contains = altra_procedura_chirurgica___not___contains;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___starts_with(String altra_procedura_chirurgica___starts_with) {
            this.altra_procedura_chirurgica___starts_with = altra_procedura_chirurgica___starts_with;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___not___starts_with(String altra_procedura_chirurgica___not___starts_with) {
            this.altra_procedura_chirurgica___not___starts_with = altra_procedura_chirurgica___not___starts_with;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___ends_with(String altra_procedura_chirurgica___ends_with) {
            this.altra_procedura_chirurgica___ends_with = altra_procedura_chirurgica___ends_with;
            return this;
        }

        public Builder setAltra_procedura_chirurgica___not___ends_with(String altra_procedura_chirurgica___not___ends_with) {
            this.altra_procedura_chirurgica___not___ends_with = altra_procedura_chirurgica___not___ends_with;
            return this;
        }

        public Builder setAltri_dettagli_istologia___eq(String altri_dettagli_istologia___eq) {
            this.altri_dettagli_istologia___eq = altri_dettagli_istologia___eq;
            return this;
        }

        public Builder setAltri_dettagli_istologia___ne(String altri_dettagli_istologia___ne) {
            this.altri_dettagli_istologia___ne = altri_dettagli_istologia___ne;
            return this;
        }

        public Builder setAltri_dettagli_istologia___null(Boolean altri_dettagli_istologia___null) {
            this.altri_dettagli_istologia___null = altri_dettagli_istologia___null;
            return this;
        }

        public Builder setAltri_dettagli_istologia___not___null(Boolean altri_dettagli_istologia___not___null) {
            this.altri_dettagli_istologia___not___null = altri_dettagli_istologia___not___null;
            return this;
        }

        public Builder setAltri_dettagli_istologia___in(java.util.List<String> altri_dettagli_istologia___in) {
            this.altri_dettagli_istologia___in = altri_dettagli_istologia___in;
            return this;
        }

        public Builder setAltri_dettagli_istologia___not___in(java.util.List<String> altri_dettagli_istologia___not___in) {
            this.altri_dettagli_istologia___not___in = altri_dettagli_istologia___not___in;
            return this;
        }

        public Builder setAltri_dettagli_istologia___lt(String altri_dettagli_istologia___lt) {
            this.altri_dettagli_istologia___lt = altri_dettagli_istologia___lt;
            return this;
        }

        public Builder setAltri_dettagli_istologia___lte(String altri_dettagli_istologia___lte) {
            this.altri_dettagli_istologia___lte = altri_dettagli_istologia___lte;
            return this;
        }

        public Builder setAltri_dettagli_istologia___gt(String altri_dettagli_istologia___gt) {
            this.altri_dettagli_istologia___gt = altri_dettagli_istologia___gt;
            return this;
        }

        public Builder setAltri_dettagli_istologia___gte(String altri_dettagli_istologia___gte) {
            this.altri_dettagli_istologia___gte = altri_dettagli_istologia___gte;
            return this;
        }

        public Builder setAltri_dettagli_istologia___contains(String altri_dettagli_istologia___contains) {
            this.altri_dettagli_istologia___contains = altri_dettagli_istologia___contains;
            return this;
        }

        public Builder setAltri_dettagli_istologia___not___contains(String altri_dettagli_istologia___not___contains) {
            this.altri_dettagli_istologia___not___contains = altri_dettagli_istologia___not___contains;
            return this;
        }

        public Builder setAltri_dettagli_istologia___starts_with(String altri_dettagli_istologia___starts_with) {
            this.altri_dettagli_istologia___starts_with = altri_dettagli_istologia___starts_with;
            return this;
        }

        public Builder setAltri_dettagli_istologia___not___starts_with(String altri_dettagli_istologia___not___starts_with) {
            this.altri_dettagli_istologia___not___starts_with = altri_dettagli_istologia___not___starts_with;
            return this;
        }

        public Builder setAltri_dettagli_istologia___ends_with(String altri_dettagli_istologia___ends_with) {
            this.altri_dettagli_istologia___ends_with = altri_dettagli_istologia___ends_with;
            return this;
        }

        public Builder setAltri_dettagli_istologia___not___ends_with(String altri_dettagli_istologia___not___ends_with) {
            this.altri_dettagli_istologia___not___ends_with = altri_dettagli_istologia___not___ends_with;
            return this;
        }

        public Builder setChemioembolizzazione___eq(Boolean chemioembolizzazione___eq) {
            this.chemioembolizzazione___eq = chemioembolizzazione___eq;
            return this;
        }

        public Builder setChemioembolizzazione___ne(Boolean chemioembolizzazione___ne) {
            this.chemioembolizzazione___ne = chemioembolizzazione___ne;
            return this;
        }

        public Builder setChemioembolizzazione___null(Boolean chemioembolizzazione___null) {
            this.chemioembolizzazione___null = chemioembolizzazione___null;
            return this;
        }

        public Builder setChemioembolizzazione___not___null(Boolean chemioembolizzazione___not___null) {
            this.chemioembolizzazione___not___null = chemioembolizzazione___not___null;
            return this;
        }

        public Builder setClassificazione_child___eq(String classificazione_child___eq) {
            this.classificazione_child___eq = classificazione_child___eq;
            return this;
        }

        public Builder setClassificazione_child___ne(String classificazione_child___ne) {
            this.classificazione_child___ne = classificazione_child___ne;
            return this;
        }

        public Builder setClassificazione_child___null(Boolean classificazione_child___null) {
            this.classificazione_child___null = classificazione_child___null;
            return this;
        }

        public Builder setClassificazione_child___not___null(Boolean classificazione_child___not___null) {
            this.classificazione_child___not___null = classificazione_child___not___null;
            return this;
        }

        public Builder setClassificazione_child___in(java.util.List<String> classificazione_child___in) {
            this.classificazione_child___in = classificazione_child___in;
            return this;
        }

        public Builder setClassificazione_child___not___in(java.util.List<String> classificazione_child___not___in) {
            this.classificazione_child___not___in = classificazione_child___not___in;
            return this;
        }

        public Builder setClassificazione_child___lt(String classificazione_child___lt) {
            this.classificazione_child___lt = classificazione_child___lt;
            return this;
        }

        public Builder setClassificazione_child___lte(String classificazione_child___lte) {
            this.classificazione_child___lte = classificazione_child___lte;
            return this;
        }

        public Builder setClassificazione_child___gt(String classificazione_child___gt) {
            this.classificazione_child___gt = classificazione_child___gt;
            return this;
        }

        public Builder setClassificazione_child___gte(String classificazione_child___gte) {
            this.classificazione_child___gte = classificazione_child___gte;
            return this;
        }

        public Builder setClassificazione_child___contains(String classificazione_child___contains) {
            this.classificazione_child___contains = classificazione_child___contains;
            return this;
        }

        public Builder setClassificazione_child___not___contains(String classificazione_child___not___contains) {
            this.classificazione_child___not___contains = classificazione_child___not___contains;
            return this;
        }

        public Builder setClassificazione_child___starts_with(String classificazione_child___starts_with) {
            this.classificazione_child___starts_with = classificazione_child___starts_with;
            return this;
        }

        public Builder setClassificazione_child___not___starts_with(String classificazione_child___not___starts_with) {
            this.classificazione_child___not___starts_with = classificazione_child___not___starts_with;
            return this;
        }

        public Builder setClassificazione_child___ends_with(String classificazione_child___ends_with) {
            this.classificazione_child___ends_with = classificazione_child___ends_with;
            return this;
        }

        public Builder setClassificazione_child___not___ends_with(String classificazione_child___not___ends_with) {
            this.classificazione_child___not___ends_with = classificazione_child___not___ends_with;
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

        public Builder setCommenti___eq(String commenti___eq) {
            this.commenti___eq = commenti___eq;
            return this;
        }

        public Builder setCommenti___ne(String commenti___ne) {
            this.commenti___ne = commenti___ne;
            return this;
        }

        public Builder setCommenti___null(Boolean commenti___null) {
            this.commenti___null = commenti___null;
            return this;
        }

        public Builder setCommenti___not___null(Boolean commenti___not___null) {
            this.commenti___not___null = commenti___not___null;
            return this;
        }

        public Builder setCommenti___in(java.util.List<String> commenti___in) {
            this.commenti___in = commenti___in;
            return this;
        }

        public Builder setCommenti___not___in(java.util.List<String> commenti___not___in) {
            this.commenti___not___in = commenti___not___in;
            return this;
        }

        public Builder setCommenti___lt(String commenti___lt) {
            this.commenti___lt = commenti___lt;
            return this;
        }

        public Builder setCommenti___lte(String commenti___lte) {
            this.commenti___lte = commenti___lte;
            return this;
        }

        public Builder setCommenti___gt(String commenti___gt) {
            this.commenti___gt = commenti___gt;
            return this;
        }

        public Builder setCommenti___gte(String commenti___gte) {
            this.commenti___gte = commenti___gte;
            return this;
        }

        public Builder setCommenti___contains(String commenti___contains) {
            this.commenti___contains = commenti___contains;
            return this;
        }

        public Builder setCommenti___not___contains(String commenti___not___contains) {
            this.commenti___not___contains = commenti___not___contains;
            return this;
        }

        public Builder setCommenti___starts_with(String commenti___starts_with) {
            this.commenti___starts_with = commenti___starts_with;
            return this;
        }

        public Builder setCommenti___not___starts_with(String commenti___not___starts_with) {
            this.commenti___not___starts_with = commenti___not___starts_with;
            return this;
        }

        public Builder setCommenti___ends_with(String commenti___ends_with) {
            this.commenti___ends_with = commenti___ends_with;
            return this;
        }

        public Builder setCommenti___not___ends_with(String commenti___not___ends_with) {
            this.commenti___not___ends_with = commenti___not___ends_with;
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

        public Builder setData_ricezione___eq(String data_ricezione___eq) {
            this.data_ricezione___eq = data_ricezione___eq;
            return this;
        }

        public Builder setData_ricezione___ne(String data_ricezione___ne) {
            this.data_ricezione___ne = data_ricezione___ne;
            return this;
        }

        public Builder setData_ricezione___null(Boolean data_ricezione___null) {
            this.data_ricezione___null = data_ricezione___null;
            return this;
        }

        public Builder setData_ricezione___not___null(Boolean data_ricezione___not___null) {
            this.data_ricezione___not___null = data_ricezione___not___null;
            return this;
        }

        public Builder setData_ricezione___in(java.util.List<String> data_ricezione___in) {
            this.data_ricezione___in = data_ricezione___in;
            return this;
        }

        public Builder setData_ricezione___not___in(java.util.List<String> data_ricezione___not___in) {
            this.data_ricezione___not___in = data_ricezione___not___in;
            return this;
        }

        public Builder setData_ricezione___lt(String data_ricezione___lt) {
            this.data_ricezione___lt = data_ricezione___lt;
            return this;
        }

        public Builder setData_ricezione___lte(String data_ricezione___lte) {
            this.data_ricezione___lte = data_ricezione___lte;
            return this;
        }

        public Builder setData_ricezione___gt(String data_ricezione___gt) {
            this.data_ricezione___gt = data_ricezione___gt;
            return this;
        }

        public Builder setData_ricezione___gte(String data_ricezione___gte) {
            this.data_ricezione___gte = data_ricezione___gte;
            return this;
        }

        public Builder setData_richiesta___eq(String data_richiesta___eq) {
            this.data_richiesta___eq = data_richiesta___eq;
            return this;
        }

        public Builder setData_richiesta___ne(String data_richiesta___ne) {
            this.data_richiesta___ne = data_richiesta___ne;
            return this;
        }

        public Builder setData_richiesta___null(Boolean data_richiesta___null) {
            this.data_richiesta___null = data_richiesta___null;
            return this;
        }

        public Builder setData_richiesta___not___null(Boolean data_richiesta___not___null) {
            this.data_richiesta___not___null = data_richiesta___not___null;
            return this;
        }

        public Builder setData_richiesta___in(java.util.List<String> data_richiesta___in) {
            this.data_richiesta___in = data_richiesta___in;
            return this;
        }

        public Builder setData_richiesta___not___in(java.util.List<String> data_richiesta___not___in) {
            this.data_richiesta___not___in = data_richiesta___not___in;
            return this;
        }

        public Builder setData_richiesta___lt(String data_richiesta___lt) {
            this.data_richiesta___lt = data_richiesta___lt;
            return this;
        }

        public Builder setData_richiesta___lte(String data_richiesta___lte) {
            this.data_richiesta___lte = data_richiesta___lte;
            return this;
        }

        public Builder setData_richiesta___gt(String data_richiesta___gt) {
            this.data_richiesta___gt = data_richiesta___gt;
            return this;
        }

        public Builder setData_richiesta___gte(String data_richiesta___gte) {
            this.data_richiesta___gte = data_richiesta___gte;
            return this;
        }

        public Builder setEziologia_alcool___eq(Boolean eziologia_alcool___eq) {
            this.eziologia_alcool___eq = eziologia_alcool___eq;
            return this;
        }

        public Builder setEziologia_alcool___ne(Boolean eziologia_alcool___ne) {
            this.eziologia_alcool___ne = eziologia_alcool___ne;
            return this;
        }

        public Builder setEziologia_alcool___null(Boolean eziologia_alcool___null) {
            this.eziologia_alcool___null = eziologia_alcool___null;
            return this;
        }

        public Builder setEziologia_alcool___not___null(Boolean eziologia_alcool___not___null) {
            this.eziologia_alcool___not___null = eziologia_alcool___not___null;
            return this;
        }

        public Builder setEziologia_farmaci___eq(Boolean eziologia_farmaci___eq) {
            this.eziologia_farmaci___eq = eziologia_farmaci___eq;
            return this;
        }

        public Builder setEziologia_farmaci___ne(Boolean eziologia_farmaci___ne) {
            this.eziologia_farmaci___ne = eziologia_farmaci___ne;
            return this;
        }

        public Builder setEziologia_farmaci___null(Boolean eziologia_farmaci___null) {
            this.eziologia_farmaci___null = eziologia_farmaci___null;
            return this;
        }

        public Builder setEziologia_farmaci___not___null(Boolean eziologia_farmaci___not___null) {
            this.eziologia_farmaci___not___null = eziologia_farmaci___not___null;
            return this;
        }

        public Builder setEziologia_non_nota___eq(Boolean eziologia_non_nota___eq) {
            this.eziologia_non_nota___eq = eziologia_non_nota___eq;
            return this;
        }

        public Builder setEziologia_non_nota___ne(Boolean eziologia_non_nota___ne) {
            this.eziologia_non_nota___ne = eziologia_non_nota___ne;
            return this;
        }

        public Builder setEziologia_non_nota___null(Boolean eziologia_non_nota___null) {
            this.eziologia_non_nota___null = eziologia_non_nota___null;
            return this;
        }

        public Builder setEziologia_non_nota___not___null(Boolean eziologia_non_nota___not___null) {
            this.eziologia_non_nota___not___null = eziologia_non_nota___not___null;
            return this;
        }

        public Builder setId_respond___eq(Integer id_respond___eq) {
            this.id_respond___eq = id_respond___eq;
            return this;
        }

        public Builder setId_respond___ne(Integer id_respond___ne) {
            this.id_respond___ne = id_respond___ne;
            return this;
        }

        public Builder setId_respond___null(Boolean id_respond___null) {
            this.id_respond___null = id_respond___null;
            return this;
        }

        public Builder setId_respond___not___null(Boolean id_respond___not___null) {
            this.id_respond___not___null = id_respond___not___null;
            return this;
        }

        public Builder setId_respond___in(java.util.List<Integer> id_respond___in) {
            this.id_respond___in = id_respond___in;
            return this;
        }

        public Builder setId_respond___not___in(java.util.List<Integer> id_respond___not___in) {
            this.id_respond___not___in = id_respond___not___in;
            return this;
        }

        public Builder setId_respond___lt(Integer id_respond___lt) {
            this.id_respond___lt = id_respond___lt;
            return this;
        }

        public Builder setId_respond___lte(Integer id_respond___lte) {
            this.id_respond___lte = id_respond___lte;
            return this;
        }

        public Builder setId_respond___gt(Integer id_respond___gt) {
            this.id_respond___gt = id_respond___gt;
            return this;
        }

        public Builder setId_respond___gte(Integer id_respond___gte) {
            this.id_respond___gte = id_respond___gte;
            return this;
        }

        public Builder setNote___eq(String note___eq) {
            this.note___eq = note___eq;
            return this;
        }

        public Builder setNote___ne(String note___ne) {
            this.note___ne = note___ne;
            return this;
        }

        public Builder setNote___null(Boolean note___null) {
            this.note___null = note___null;
            return this;
        }

        public Builder setNote___not___null(Boolean note___not___null) {
            this.note___not___null = note___not___null;
            return this;
        }

        public Builder setNote___in(java.util.List<String> note___in) {
            this.note___in = note___in;
            return this;
        }

        public Builder setNote___not___in(java.util.List<String> note___not___in) {
            this.note___not___in = note___not___in;
            return this;
        }

        public Builder setNote___lt(String note___lt) {
            this.note___lt = note___lt;
            return this;
        }

        public Builder setNote___lte(String note___lte) {
            this.note___lte = note___lte;
            return this;
        }

        public Builder setNote___gt(String note___gt) {
            this.note___gt = note___gt;
            return this;
        }

        public Builder setNote___gte(String note___gte) {
            this.note___gte = note___gte;
            return this;
        }

        public Builder setNote___contains(String note___contains) {
            this.note___contains = note___contains;
            return this;
        }

        public Builder setNote___not___contains(String note___not___contains) {
            this.note___not___contains = note___not___contains;
            return this;
        }

        public Builder setNote___starts_with(String note___starts_with) {
            this.note___starts_with = note___starts_with;
            return this;
        }

        public Builder setNote___not___starts_with(String note___not___starts_with) {
            this.note___not___starts_with = note___not___starts_with;
            return this;
        }

        public Builder setNote___ends_with(String note___ends_with) {
            this.note___ends_with = note___ends_with;
            return this;
        }

        public Builder setNote___not___ends_with(String note___not___ends_with) {
            this.note___not___ends_with = note___not___ends_with;
            return this;
        }

        public Builder setPatologie___eq(String patologie___eq) {
            this.patologie___eq = patologie___eq;
            return this;
        }

        public Builder setPatologie___ne(String patologie___ne) {
            this.patologie___ne = patologie___ne;
            return this;
        }

        public Builder setPatologie___null(Boolean patologie___null) {
            this.patologie___null = patologie___null;
            return this;
        }

        public Builder setPatologie___not___null(Boolean patologie___not___null) {
            this.patologie___not___null = patologie___not___null;
            return this;
        }

        public Builder setPatologie___in(java.util.List<String> patologie___in) {
            this.patologie___in = patologie___in;
            return this;
        }

        public Builder setPatologie___not___in(java.util.List<String> patologie___not___in) {
            this.patologie___not___in = patologie___not___in;
            return this;
        }

        public Builder setPatologie___lt(String patologie___lt) {
            this.patologie___lt = patologie___lt;
            return this;
        }

        public Builder setPatologie___lte(String patologie___lte) {
            this.patologie___lte = patologie___lte;
            return this;
        }

        public Builder setPatologie___gt(String patologie___gt) {
            this.patologie___gt = patologie___gt;
            return this;
        }

        public Builder setPatologie___gte(String patologie___gte) {
            this.patologie___gte = patologie___gte;
            return this;
        }

        public Builder setPatologie___contains(String patologie___contains) {
            this.patologie___contains = patologie___contains;
            return this;
        }

        public Builder setPatologie___not___contains(String patologie___not___contains) {
            this.patologie___not___contains = patologie___not___contains;
            return this;
        }

        public Builder setPatologie___starts_with(String patologie___starts_with) {
            this.patologie___starts_with = patologie___starts_with;
            return this;
        }

        public Builder setPatologie___not___starts_with(String patologie___not___starts_with) {
            this.patologie___not___starts_with = patologie___not___starts_with;
            return this;
        }

        public Builder setPatologie___ends_with(String patologie___ends_with) {
            this.patologie___ends_with = patologie___ends_with;
            return this;
        }

        public Builder setPatologie___not___ends_with(String patologie___not___ends_with) {
            this.patologie___not___ends_with = patologie___not___ends_with;
            return this;
        }

        public Builder setResezione_epatica___eq(Boolean resezione_epatica___eq) {
            this.resezione_epatica___eq = resezione_epatica___eq;
            return this;
        }

        public Builder setResezione_epatica___ne(Boolean resezione_epatica___ne) {
            this.resezione_epatica___ne = resezione_epatica___ne;
            return this;
        }

        public Builder setResezione_epatica___null(Boolean resezione_epatica___null) {
            this.resezione_epatica___null = resezione_epatica___null;
            return this;
        }

        public Builder setResezione_epatica___not___null(Boolean resezione_epatica___not___null) {
            this.resezione_epatica___not___null = resezione_epatica___not___null;
            return this;
        }

        public Builder setStato_richiesta___eq(String stato_richiesta___eq) {
            this.stato_richiesta___eq = stato_richiesta___eq;
            return this;
        }

        public Builder setStato_richiesta___ne(String stato_richiesta___ne) {
            this.stato_richiesta___ne = stato_richiesta___ne;
            return this;
        }

        public Builder setStato_richiesta___null(Boolean stato_richiesta___null) {
            this.stato_richiesta___null = stato_richiesta___null;
            return this;
        }

        public Builder setStato_richiesta___not___null(Boolean stato_richiesta___not___null) {
            this.stato_richiesta___not___null = stato_richiesta___not___null;
            return this;
        }

        public Builder setStato_richiesta___in(java.util.List<String> stato_richiesta___in) {
            this.stato_richiesta___in = stato_richiesta___in;
            return this;
        }

        public Builder setStato_richiesta___not___in(java.util.List<String> stato_richiesta___not___in) {
            this.stato_richiesta___not___in = stato_richiesta___not___in;
            return this;
        }

        public Builder setStato_richiesta___lt(String stato_richiesta___lt) {
            this.stato_richiesta___lt = stato_richiesta___lt;
            return this;
        }

        public Builder setStato_richiesta___lte(String stato_richiesta___lte) {
            this.stato_richiesta___lte = stato_richiesta___lte;
            return this;
        }

        public Builder setStato_richiesta___gt(String stato_richiesta___gt) {
            this.stato_richiesta___gt = stato_richiesta___gt;
            return this;
        }

        public Builder setStato_richiesta___gte(String stato_richiesta___gte) {
            this.stato_richiesta___gte = stato_richiesta___gte;
            return this;
        }

        public Builder setStato_richiesta___contains(String stato_richiesta___contains) {
            this.stato_richiesta___contains = stato_richiesta___contains;
            return this;
        }

        public Builder setStato_richiesta___not___contains(String stato_richiesta___not___contains) {
            this.stato_richiesta___not___contains = stato_richiesta___not___contains;
            return this;
        }

        public Builder setStato_richiesta___starts_with(String stato_richiesta___starts_with) {
            this.stato_richiesta___starts_with = stato_richiesta___starts_with;
            return this;
        }

        public Builder setStato_richiesta___not___starts_with(String stato_richiesta___not___starts_with) {
            this.stato_richiesta___not___starts_with = stato_richiesta___not___starts_with;
            return this;
        }

        public Builder setStato_richiesta___ends_with(String stato_richiesta___ends_with) {
            this.stato_richiesta___ends_with = stato_richiesta___ends_with;
            return this;
        }

        public Builder setStato_richiesta___not___ends_with(String stato_richiesta___not___ends_with) {
            this.stato_richiesta___not___ends_with = stato_richiesta___not___ends_with;
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

        public Builder setTermoablazione___eq(Boolean termoablazione___eq) {
            this.termoablazione___eq = termoablazione___eq;
            return this;
        }

        public Builder setTermoablazione___ne(Boolean termoablazione___ne) {
            this.termoablazione___ne = termoablazione___ne;
            return this;
        }

        public Builder setTermoablazione___null(Boolean termoablazione___null) {
            this.termoablazione___null = termoablazione___null;
            return this;
        }

        public Builder setTermoablazione___not___null(Boolean termoablazione___not___null) {
            this.termoablazione___not___null = termoablazione___not___null;
            return this;
        }

        public Builder setTrapianto_epatico___eq(Boolean trapianto_epatico___eq) {
            this.trapianto_epatico___eq = trapianto_epatico___eq;
            return this;
        }

        public Builder setTrapianto_epatico___ne(Boolean trapianto_epatico___ne) {
            this.trapianto_epatico___ne = trapianto_epatico___ne;
            return this;
        }

        public Builder setTrapianto_epatico___null(Boolean trapianto_epatico___null) {
            this.trapianto_epatico___null = trapianto_epatico___null;
            return this;
        }

        public Builder setTrapianto_epatico___not___null(Boolean trapianto_epatico___not___null) {
            this.trapianto_epatico___not___null = trapianto_epatico___not___null;
            return this;
        }

        public Builder setWarning_respond_biop___eq(Boolean warning_respond_biop___eq) {
            this.warning_respond_biop___eq = warning_respond_biop___eq;
            return this;
        }

        public Builder setWarning_respond_biop___ne(Boolean warning_respond_biop___ne) {
            this.warning_respond_biop___ne = warning_respond_biop___ne;
            return this;
        }

        public Builder setWarning_respond_biop___null(Boolean warning_respond_biop___null) {
            this.warning_respond_biop___null = warning_respond_biop___null;
            return this;
        }

        public Builder setWarning_respond_biop___not___null(Boolean warning_respond_biop___not___null) {
            this.warning_respond_biop___not___null = warning_respond_biop___not___null;
            return this;
        }

        public Builder setWarning_respond_epa___eq(Boolean warning_respond_epa___eq) {
            this.warning_respond_epa___eq = warning_respond_epa___eq;
            return this;
        }

        public Builder setWarning_respond_epa___ne(Boolean warning_respond_epa___ne) {
            this.warning_respond_epa___ne = warning_respond_epa___ne;
            return this;
        }

        public Builder setWarning_respond_epa___null(Boolean warning_respond_epa___null) {
            this.warning_respond_epa___null = warning_respond_epa___null;
            return this;
        }

        public Builder setWarning_respond_epa___not___null(Boolean warning_respond_epa___not___null) {
            this.warning_respond_epa___not___null = warning_respond_epa___not___null;
            return this;
        }

        public Builder setAND(java.util.List<CliEvento_epaticoFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliEvento_epaticoFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliEvento_epaticoFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliEvento_epaticoFilterDTO build() {
            CliEvento_epaticoFilterDTO result = new CliEvento_epaticoFilterDTO();
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
            result.setAlcolizzazione___eq(this.alcolizzazione___eq);
            result.setAlcolizzazione___ne(this.alcolizzazione___ne);
            result.setAlcolizzazione___null(this.alcolizzazione___null);
            result.setAlcolizzazione___not___null(this.alcolizzazione___not___null);
            result.setAltra_eziologia___eq(this.altra_eziologia___eq);
            result.setAltra_eziologia___ne(this.altra_eziologia___ne);
            result.setAltra_eziologia___null(this.altra_eziologia___null);
            result.setAltra_eziologia___not___null(this.altra_eziologia___not___null);
            result.setAltra_eziologia___in(this.altra_eziologia___in);
            result.setAltra_eziologia___not___in(this.altra_eziologia___not___in);
            result.setAltra_eziologia___lt(this.altra_eziologia___lt);
            result.setAltra_eziologia___lte(this.altra_eziologia___lte);
            result.setAltra_eziologia___gt(this.altra_eziologia___gt);
            result.setAltra_eziologia___gte(this.altra_eziologia___gte);
            result.setAltra_eziologia___contains(this.altra_eziologia___contains);
            result.setAltra_eziologia___not___contains(this.altra_eziologia___not___contains);
            result.setAltra_eziologia___starts_with(this.altra_eziologia___starts_with);
            result.setAltra_eziologia___not___starts_with(this.altra_eziologia___not___starts_with);
            result.setAltra_eziologia___ends_with(this.altra_eziologia___ends_with);
            result.setAltra_eziologia___not___ends_with(this.altra_eziologia___not___ends_with);
            result.setAltra_procedura_chirurgica___eq(this.altra_procedura_chirurgica___eq);
            result.setAltra_procedura_chirurgica___ne(this.altra_procedura_chirurgica___ne);
            result.setAltra_procedura_chirurgica___null(this.altra_procedura_chirurgica___null);
            result.setAltra_procedura_chirurgica___not___null(this.altra_procedura_chirurgica___not___null);
            result.setAltra_procedura_chirurgica___in(this.altra_procedura_chirurgica___in);
            result.setAltra_procedura_chirurgica___not___in(this.altra_procedura_chirurgica___not___in);
            result.setAltra_procedura_chirurgica___lt(this.altra_procedura_chirurgica___lt);
            result.setAltra_procedura_chirurgica___lte(this.altra_procedura_chirurgica___lte);
            result.setAltra_procedura_chirurgica___gt(this.altra_procedura_chirurgica___gt);
            result.setAltra_procedura_chirurgica___gte(this.altra_procedura_chirurgica___gte);
            result.setAltra_procedura_chirurgica___contains(this.altra_procedura_chirurgica___contains);
            result.setAltra_procedura_chirurgica___not___contains(this.altra_procedura_chirurgica___not___contains);
            result.setAltra_procedura_chirurgica___starts_with(this.altra_procedura_chirurgica___starts_with);
            result.setAltra_procedura_chirurgica___not___starts_with(this.altra_procedura_chirurgica___not___starts_with);
            result.setAltra_procedura_chirurgica___ends_with(this.altra_procedura_chirurgica___ends_with);
            result.setAltra_procedura_chirurgica___not___ends_with(this.altra_procedura_chirurgica___not___ends_with);
            result.setAltri_dettagli_istologia___eq(this.altri_dettagli_istologia___eq);
            result.setAltri_dettagli_istologia___ne(this.altri_dettagli_istologia___ne);
            result.setAltri_dettagli_istologia___null(this.altri_dettagli_istologia___null);
            result.setAltri_dettagli_istologia___not___null(this.altri_dettagli_istologia___not___null);
            result.setAltri_dettagli_istologia___in(this.altri_dettagli_istologia___in);
            result.setAltri_dettagli_istologia___not___in(this.altri_dettagli_istologia___not___in);
            result.setAltri_dettagli_istologia___lt(this.altri_dettagli_istologia___lt);
            result.setAltri_dettagli_istologia___lte(this.altri_dettagli_istologia___lte);
            result.setAltri_dettagli_istologia___gt(this.altri_dettagli_istologia___gt);
            result.setAltri_dettagli_istologia___gte(this.altri_dettagli_istologia___gte);
            result.setAltri_dettagli_istologia___contains(this.altri_dettagli_istologia___contains);
            result.setAltri_dettagli_istologia___not___contains(this.altri_dettagli_istologia___not___contains);
            result.setAltri_dettagli_istologia___starts_with(this.altri_dettagli_istologia___starts_with);
            result.setAltri_dettagli_istologia___not___starts_with(this.altri_dettagli_istologia___not___starts_with);
            result.setAltri_dettagli_istologia___ends_with(this.altri_dettagli_istologia___ends_with);
            result.setAltri_dettagli_istologia___not___ends_with(this.altri_dettagli_istologia___not___ends_with);
            result.setChemioembolizzazione___eq(this.chemioembolizzazione___eq);
            result.setChemioembolizzazione___ne(this.chemioembolizzazione___ne);
            result.setChemioembolizzazione___null(this.chemioembolizzazione___null);
            result.setChemioembolizzazione___not___null(this.chemioembolizzazione___not___null);
            result.setClassificazione_child___eq(this.classificazione_child___eq);
            result.setClassificazione_child___ne(this.classificazione_child___ne);
            result.setClassificazione_child___null(this.classificazione_child___null);
            result.setClassificazione_child___not___null(this.classificazione_child___not___null);
            result.setClassificazione_child___in(this.classificazione_child___in);
            result.setClassificazione_child___not___in(this.classificazione_child___not___in);
            result.setClassificazione_child___lt(this.classificazione_child___lt);
            result.setClassificazione_child___lte(this.classificazione_child___lte);
            result.setClassificazione_child___gt(this.classificazione_child___gt);
            result.setClassificazione_child___gte(this.classificazione_child___gte);
            result.setClassificazione_child___contains(this.classificazione_child___contains);
            result.setClassificazione_child___not___contains(this.classificazione_child___not___contains);
            result.setClassificazione_child___starts_with(this.classificazione_child___starts_with);
            result.setClassificazione_child___not___starts_with(this.classificazione_child___not___starts_with);
            result.setClassificazione_child___ends_with(this.classificazione_child___ends_with);
            result.setClassificazione_child___not___ends_with(this.classificazione_child___not___ends_with);
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
            result.setCommenti___eq(this.commenti___eq);
            result.setCommenti___ne(this.commenti___ne);
            result.setCommenti___null(this.commenti___null);
            result.setCommenti___not___null(this.commenti___not___null);
            result.setCommenti___in(this.commenti___in);
            result.setCommenti___not___in(this.commenti___not___in);
            result.setCommenti___lt(this.commenti___lt);
            result.setCommenti___lte(this.commenti___lte);
            result.setCommenti___gt(this.commenti___gt);
            result.setCommenti___gte(this.commenti___gte);
            result.setCommenti___contains(this.commenti___contains);
            result.setCommenti___not___contains(this.commenti___not___contains);
            result.setCommenti___starts_with(this.commenti___starts_with);
            result.setCommenti___not___starts_with(this.commenti___not___starts_with);
            result.setCommenti___ends_with(this.commenti___ends_with);
            result.setCommenti___not___ends_with(this.commenti___not___ends_with);
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
            result.setData_ricezione___eq(this.data_ricezione___eq);
            result.setData_ricezione___ne(this.data_ricezione___ne);
            result.setData_ricezione___null(this.data_ricezione___null);
            result.setData_ricezione___not___null(this.data_ricezione___not___null);
            result.setData_ricezione___in(this.data_ricezione___in);
            result.setData_ricezione___not___in(this.data_ricezione___not___in);
            result.setData_ricezione___lt(this.data_ricezione___lt);
            result.setData_ricezione___lte(this.data_ricezione___lte);
            result.setData_ricezione___gt(this.data_ricezione___gt);
            result.setData_ricezione___gte(this.data_ricezione___gte);
            result.setData_richiesta___eq(this.data_richiesta___eq);
            result.setData_richiesta___ne(this.data_richiesta___ne);
            result.setData_richiesta___null(this.data_richiesta___null);
            result.setData_richiesta___not___null(this.data_richiesta___not___null);
            result.setData_richiesta___in(this.data_richiesta___in);
            result.setData_richiesta___not___in(this.data_richiesta___not___in);
            result.setData_richiesta___lt(this.data_richiesta___lt);
            result.setData_richiesta___lte(this.data_richiesta___lte);
            result.setData_richiesta___gt(this.data_richiesta___gt);
            result.setData_richiesta___gte(this.data_richiesta___gte);
            result.setEziologia_alcool___eq(this.eziologia_alcool___eq);
            result.setEziologia_alcool___ne(this.eziologia_alcool___ne);
            result.setEziologia_alcool___null(this.eziologia_alcool___null);
            result.setEziologia_alcool___not___null(this.eziologia_alcool___not___null);
            result.setEziologia_farmaci___eq(this.eziologia_farmaci___eq);
            result.setEziologia_farmaci___ne(this.eziologia_farmaci___ne);
            result.setEziologia_farmaci___null(this.eziologia_farmaci___null);
            result.setEziologia_farmaci___not___null(this.eziologia_farmaci___not___null);
            result.setEziologia_non_nota___eq(this.eziologia_non_nota___eq);
            result.setEziologia_non_nota___ne(this.eziologia_non_nota___ne);
            result.setEziologia_non_nota___null(this.eziologia_non_nota___null);
            result.setEziologia_non_nota___not___null(this.eziologia_non_nota___not___null);
            result.setId_respond___eq(this.id_respond___eq);
            result.setId_respond___ne(this.id_respond___ne);
            result.setId_respond___null(this.id_respond___null);
            result.setId_respond___not___null(this.id_respond___not___null);
            result.setId_respond___in(this.id_respond___in);
            result.setId_respond___not___in(this.id_respond___not___in);
            result.setId_respond___lt(this.id_respond___lt);
            result.setId_respond___lte(this.id_respond___lte);
            result.setId_respond___gt(this.id_respond___gt);
            result.setId_respond___gte(this.id_respond___gte);
            result.setNote___eq(this.note___eq);
            result.setNote___ne(this.note___ne);
            result.setNote___null(this.note___null);
            result.setNote___not___null(this.note___not___null);
            result.setNote___in(this.note___in);
            result.setNote___not___in(this.note___not___in);
            result.setNote___lt(this.note___lt);
            result.setNote___lte(this.note___lte);
            result.setNote___gt(this.note___gt);
            result.setNote___gte(this.note___gte);
            result.setNote___contains(this.note___contains);
            result.setNote___not___contains(this.note___not___contains);
            result.setNote___starts_with(this.note___starts_with);
            result.setNote___not___starts_with(this.note___not___starts_with);
            result.setNote___ends_with(this.note___ends_with);
            result.setNote___not___ends_with(this.note___not___ends_with);
            result.setPatologie___eq(this.patologie___eq);
            result.setPatologie___ne(this.patologie___ne);
            result.setPatologie___null(this.patologie___null);
            result.setPatologie___not___null(this.patologie___not___null);
            result.setPatologie___in(this.patologie___in);
            result.setPatologie___not___in(this.patologie___not___in);
            result.setPatologie___lt(this.patologie___lt);
            result.setPatologie___lte(this.patologie___lte);
            result.setPatologie___gt(this.patologie___gt);
            result.setPatologie___gte(this.patologie___gte);
            result.setPatologie___contains(this.patologie___contains);
            result.setPatologie___not___contains(this.patologie___not___contains);
            result.setPatologie___starts_with(this.patologie___starts_with);
            result.setPatologie___not___starts_with(this.patologie___not___starts_with);
            result.setPatologie___ends_with(this.patologie___ends_with);
            result.setPatologie___not___ends_with(this.patologie___not___ends_with);
            result.setResezione_epatica___eq(this.resezione_epatica___eq);
            result.setResezione_epatica___ne(this.resezione_epatica___ne);
            result.setResezione_epatica___null(this.resezione_epatica___null);
            result.setResezione_epatica___not___null(this.resezione_epatica___not___null);
            result.setStato_richiesta___eq(this.stato_richiesta___eq);
            result.setStato_richiesta___ne(this.stato_richiesta___ne);
            result.setStato_richiesta___null(this.stato_richiesta___null);
            result.setStato_richiesta___not___null(this.stato_richiesta___not___null);
            result.setStato_richiesta___in(this.stato_richiesta___in);
            result.setStato_richiesta___not___in(this.stato_richiesta___not___in);
            result.setStato_richiesta___lt(this.stato_richiesta___lt);
            result.setStato_richiesta___lte(this.stato_richiesta___lte);
            result.setStato_richiesta___gt(this.stato_richiesta___gt);
            result.setStato_richiesta___gte(this.stato_richiesta___gte);
            result.setStato_richiesta___contains(this.stato_richiesta___contains);
            result.setStato_richiesta___not___contains(this.stato_richiesta___not___contains);
            result.setStato_richiesta___starts_with(this.stato_richiesta___starts_with);
            result.setStato_richiesta___not___starts_with(this.stato_richiesta___not___starts_with);
            result.setStato_richiesta___ends_with(this.stato_richiesta___ends_with);
            result.setStato_richiesta___not___ends_with(this.stato_richiesta___not___ends_with);
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
            result.setTermoablazione___eq(this.termoablazione___eq);
            result.setTermoablazione___ne(this.termoablazione___ne);
            result.setTermoablazione___null(this.termoablazione___null);
            result.setTermoablazione___not___null(this.termoablazione___not___null);
            result.setTrapianto_epatico___eq(this.trapianto_epatico___eq);
            result.setTrapianto_epatico___ne(this.trapianto_epatico___ne);
            result.setTrapianto_epatico___null(this.trapianto_epatico___null);
            result.setTrapianto_epatico___not___null(this.trapianto_epatico___not___null);
            result.setWarning_respond_biop___eq(this.warning_respond_biop___eq);
            result.setWarning_respond_biop___ne(this.warning_respond_biop___ne);
            result.setWarning_respond_biop___null(this.warning_respond_biop___null);
            result.setWarning_respond_biop___not___null(this.warning_respond_biop___not___null);
            result.setWarning_respond_epa___eq(this.warning_respond_epa___eq);
            result.setWarning_respond_epa___ne(this.warning_respond_epa___ne);
            result.setWarning_respond_epa___null(this.warning_respond_epa___null);
            result.setWarning_respond_epa___not___null(this.warning_respond_epa___not___null);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
