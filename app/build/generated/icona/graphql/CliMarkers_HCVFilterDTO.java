package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Markers_HCV.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliMarkers_HCVFilterDTO implements java.io.Serializable {

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
    private String altra_metodica___eq;
    private String altra_metodica___ne;
    private Boolean altra_metodica___null;
    private Boolean altra_metodica___not___null;
    private java.util.List<String> altra_metodica___in;
    private java.util.List<String> altra_metodica___not___in;
    private String altra_metodica___lt;
    private String altra_metodica___lte;
    private String altra_metodica___gt;
    private String altra_metodica___gte;
    private String altra_metodica___contains;
    private String altra_metodica___not___contains;
    private String altra_metodica___starts_with;
    private String altra_metodica___not___starts_with;
    private String altra_metodica___ends_with;
    private String altra_metodica___not___ends_with;
    private String altra_unita_di_misura___eq;
    private String altra_unita_di_misura___ne;
    private Boolean altra_unita_di_misura___null;
    private Boolean altra_unita_di_misura___not___null;
    private java.util.List<String> altra_unita_di_misura___in;
    private java.util.List<String> altra_unita_di_misura___not___in;
    private String altra_unita_di_misura___lt;
    private String altra_unita_di_misura___lte;
    private String altra_unita_di_misura___gt;
    private String altra_unita_di_misura___gte;
    private String altra_unita_di_misura___contains;
    private String altra_unita_di_misura___not___contains;
    private String altra_unita_di_misura___starts_with;
    private String altra_unita_di_misura___not___starts_with;
    private String altra_unita_di_misura___ends_with;
    private String altra_unita_di_misura___not___ends_with;
    private String altro_genotipo___eq;
    private String altro_genotipo___ne;
    private Boolean altro_genotipo___null;
    private Boolean altro_genotipo___not___null;
    private java.util.List<String> altro_genotipo___in;
    private java.util.List<String> altro_genotipo___not___in;
    private String altro_genotipo___lt;
    private String altro_genotipo___lte;
    private String altro_genotipo___gt;
    private String altro_genotipo___gte;
    private String altro_genotipo___contains;
    private String altro_genotipo___not___contains;
    private String altro_genotipo___starts_with;
    private String altro_genotipo___not___starts_with;
    private String altro_genotipo___ends_with;
    private String altro_genotipo___not___ends_with;
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
    private String esito___eq;
    private String esito___ne;
    private Boolean esito___null;
    private Boolean esito___not___null;
    private java.util.List<String> esito___in;
    private java.util.List<String> esito___not___in;
    private String esito___lt;
    private String esito___lte;
    private String esito___gt;
    private String esito___gte;
    private String esito___contains;
    private String esito___not___contains;
    private String esito___starts_with;
    private String esito___not___starts_with;
    private String esito___ends_with;
    private String esito___not___ends_with;
    private String genotipo___eq;
    private String genotipo___ne;
    private Boolean genotipo___null;
    private Boolean genotipo___not___null;
    private java.util.List<String> genotipo___in;
    private java.util.List<String> genotipo___not___in;
    private String genotipo___lt;
    private String genotipo___lte;
    private String genotipo___gt;
    private String genotipo___gte;
    private String genotipo___contains;
    private String genotipo___not___contains;
    private String genotipo___starts_with;
    private String genotipo___not___starts_with;
    private String genotipo___ends_with;
    private String genotipo___not___ends_with;
    private Integer lower_limit___eq;
    private Integer lower_limit___ne;
    private Boolean lower_limit___null;
    private Boolean lower_limit___not___null;
    private java.util.List<Integer> lower_limit___in;
    private java.util.List<Integer> lower_limit___not___in;
    private Integer lower_limit___lt;
    private Integer lower_limit___lte;
    private Integer lower_limit___gt;
    private Integer lower_limit___gte;
    private String metodica_genoma___eq;
    private String metodica_genoma___ne;
    private Boolean metodica_genoma___null;
    private Boolean metodica_genoma___not___null;
    private java.util.List<String> metodica_genoma___in;
    private java.util.List<String> metodica_genoma___not___in;
    private String metodica_genoma___lt;
    private String metodica_genoma___lte;
    private String metodica_genoma___gt;
    private String metodica_genoma___gte;
    private String metodica_genoma___contains;
    private String metodica_genoma___not___contains;
    private String metodica_genoma___starts_with;
    private String metodica_genoma___not___starts_with;
    private String metodica_genoma___ends_with;
    private String metodica_genoma___not___ends_with;
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
    private String tipologia_test___eq;
    private String tipologia_test___ne;
    private Boolean tipologia_test___null;
    private Boolean tipologia_test___not___null;
    private java.util.List<String> tipologia_test___in;
    private java.util.List<String> tipologia_test___not___in;
    private String tipologia_test___lt;
    private String tipologia_test___lte;
    private String tipologia_test___gt;
    private String tipologia_test___gte;
    private String tipologia_test___contains;
    private String tipologia_test___not___contains;
    private String tipologia_test___starts_with;
    private String tipologia_test___not___starts_with;
    private String tipologia_test___ends_with;
    private String tipologia_test___not___ends_with;
    private String unita_di_misura___eq;
    private String unita_di_misura___ne;
    private Boolean unita_di_misura___null;
    private Boolean unita_di_misura___not___null;
    private java.util.List<String> unita_di_misura___in;
    private java.util.List<String> unita_di_misura___not___in;
    private String unita_di_misura___lt;
    private String unita_di_misura___lte;
    private String unita_di_misura___gt;
    private String unita_di_misura___gte;
    private String unita_di_misura___contains;
    private String unita_di_misura___not___contains;
    private String unita_di_misura___starts_with;
    private String unita_di_misura___not___starts_with;
    private String unita_di_misura___ends_with;
    private String unita_di_misura___not___ends_with;
    private Integer valore___eq;
    private Integer valore___ne;
    private Boolean valore___null;
    private Boolean valore___not___null;
    private java.util.List<Integer> valore___in;
    private java.util.List<Integer> valore___not___in;
    private Integer valore___lt;
    private Integer valore___lte;
    private Integer valore___gt;
    private Integer valore___gte;
    private java.util.List<CliMarkers_HCVFilterDTO> AND;
    private java.util.List<CliMarkers_HCVFilterDTO> OR;
    private CliMarkers_HCVFilterDTO NOT;

    public CliMarkers_HCVFilterDTO() {
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

    public String getAltra_metodica___eq() {
        return altra_metodica___eq;
    }
    public void setAltra_metodica___eq(String altra_metodica___eq) {
        this.altra_metodica___eq = altra_metodica___eq;
    }

    public String getAltra_metodica___ne() {
        return altra_metodica___ne;
    }
    public void setAltra_metodica___ne(String altra_metodica___ne) {
        this.altra_metodica___ne = altra_metodica___ne;
    }

    public Boolean getAltra_metodica___null() {
        return altra_metodica___null;
    }
    public void setAltra_metodica___null(Boolean altra_metodica___null) {
        this.altra_metodica___null = altra_metodica___null;
    }

    public Boolean getAltra_metodica___not___null() {
        return altra_metodica___not___null;
    }
    public void setAltra_metodica___not___null(Boolean altra_metodica___not___null) {
        this.altra_metodica___not___null = altra_metodica___not___null;
    }

    public java.util.List<String> getAltra_metodica___in() {
        return altra_metodica___in;
    }
    public void setAltra_metodica___in(java.util.List<String> altra_metodica___in) {
        this.altra_metodica___in = altra_metodica___in;
    }

    public java.util.List<String> getAltra_metodica___not___in() {
        return altra_metodica___not___in;
    }
    public void setAltra_metodica___not___in(java.util.List<String> altra_metodica___not___in) {
        this.altra_metodica___not___in = altra_metodica___not___in;
    }

    public String getAltra_metodica___lt() {
        return altra_metodica___lt;
    }
    public void setAltra_metodica___lt(String altra_metodica___lt) {
        this.altra_metodica___lt = altra_metodica___lt;
    }

    public String getAltra_metodica___lte() {
        return altra_metodica___lte;
    }
    public void setAltra_metodica___lte(String altra_metodica___lte) {
        this.altra_metodica___lte = altra_metodica___lte;
    }

    public String getAltra_metodica___gt() {
        return altra_metodica___gt;
    }
    public void setAltra_metodica___gt(String altra_metodica___gt) {
        this.altra_metodica___gt = altra_metodica___gt;
    }

    public String getAltra_metodica___gte() {
        return altra_metodica___gte;
    }
    public void setAltra_metodica___gte(String altra_metodica___gte) {
        this.altra_metodica___gte = altra_metodica___gte;
    }

    public String getAltra_metodica___contains() {
        return altra_metodica___contains;
    }
    public void setAltra_metodica___contains(String altra_metodica___contains) {
        this.altra_metodica___contains = altra_metodica___contains;
    }

    public String getAltra_metodica___not___contains() {
        return altra_metodica___not___contains;
    }
    public void setAltra_metodica___not___contains(String altra_metodica___not___contains) {
        this.altra_metodica___not___contains = altra_metodica___not___contains;
    }

    public String getAltra_metodica___starts_with() {
        return altra_metodica___starts_with;
    }
    public void setAltra_metodica___starts_with(String altra_metodica___starts_with) {
        this.altra_metodica___starts_with = altra_metodica___starts_with;
    }

    public String getAltra_metodica___not___starts_with() {
        return altra_metodica___not___starts_with;
    }
    public void setAltra_metodica___not___starts_with(String altra_metodica___not___starts_with) {
        this.altra_metodica___not___starts_with = altra_metodica___not___starts_with;
    }

    public String getAltra_metodica___ends_with() {
        return altra_metodica___ends_with;
    }
    public void setAltra_metodica___ends_with(String altra_metodica___ends_with) {
        this.altra_metodica___ends_with = altra_metodica___ends_with;
    }

    public String getAltra_metodica___not___ends_with() {
        return altra_metodica___not___ends_with;
    }
    public void setAltra_metodica___not___ends_with(String altra_metodica___not___ends_with) {
        this.altra_metodica___not___ends_with = altra_metodica___not___ends_with;
    }

    public String getAltra_unita_di_misura___eq() {
        return altra_unita_di_misura___eq;
    }
    public void setAltra_unita_di_misura___eq(String altra_unita_di_misura___eq) {
        this.altra_unita_di_misura___eq = altra_unita_di_misura___eq;
    }

    public String getAltra_unita_di_misura___ne() {
        return altra_unita_di_misura___ne;
    }
    public void setAltra_unita_di_misura___ne(String altra_unita_di_misura___ne) {
        this.altra_unita_di_misura___ne = altra_unita_di_misura___ne;
    }

    public Boolean getAltra_unita_di_misura___null() {
        return altra_unita_di_misura___null;
    }
    public void setAltra_unita_di_misura___null(Boolean altra_unita_di_misura___null) {
        this.altra_unita_di_misura___null = altra_unita_di_misura___null;
    }

    public Boolean getAltra_unita_di_misura___not___null() {
        return altra_unita_di_misura___not___null;
    }
    public void setAltra_unita_di_misura___not___null(Boolean altra_unita_di_misura___not___null) {
        this.altra_unita_di_misura___not___null = altra_unita_di_misura___not___null;
    }

    public java.util.List<String> getAltra_unita_di_misura___in() {
        return altra_unita_di_misura___in;
    }
    public void setAltra_unita_di_misura___in(java.util.List<String> altra_unita_di_misura___in) {
        this.altra_unita_di_misura___in = altra_unita_di_misura___in;
    }

    public java.util.List<String> getAltra_unita_di_misura___not___in() {
        return altra_unita_di_misura___not___in;
    }
    public void setAltra_unita_di_misura___not___in(java.util.List<String> altra_unita_di_misura___not___in) {
        this.altra_unita_di_misura___not___in = altra_unita_di_misura___not___in;
    }

    public String getAltra_unita_di_misura___lt() {
        return altra_unita_di_misura___lt;
    }
    public void setAltra_unita_di_misura___lt(String altra_unita_di_misura___lt) {
        this.altra_unita_di_misura___lt = altra_unita_di_misura___lt;
    }

    public String getAltra_unita_di_misura___lte() {
        return altra_unita_di_misura___lte;
    }
    public void setAltra_unita_di_misura___lte(String altra_unita_di_misura___lte) {
        this.altra_unita_di_misura___lte = altra_unita_di_misura___lte;
    }

    public String getAltra_unita_di_misura___gt() {
        return altra_unita_di_misura___gt;
    }
    public void setAltra_unita_di_misura___gt(String altra_unita_di_misura___gt) {
        this.altra_unita_di_misura___gt = altra_unita_di_misura___gt;
    }

    public String getAltra_unita_di_misura___gte() {
        return altra_unita_di_misura___gte;
    }
    public void setAltra_unita_di_misura___gte(String altra_unita_di_misura___gte) {
        this.altra_unita_di_misura___gte = altra_unita_di_misura___gte;
    }

    public String getAltra_unita_di_misura___contains() {
        return altra_unita_di_misura___contains;
    }
    public void setAltra_unita_di_misura___contains(String altra_unita_di_misura___contains) {
        this.altra_unita_di_misura___contains = altra_unita_di_misura___contains;
    }

    public String getAltra_unita_di_misura___not___contains() {
        return altra_unita_di_misura___not___contains;
    }
    public void setAltra_unita_di_misura___not___contains(String altra_unita_di_misura___not___contains) {
        this.altra_unita_di_misura___not___contains = altra_unita_di_misura___not___contains;
    }

    public String getAltra_unita_di_misura___starts_with() {
        return altra_unita_di_misura___starts_with;
    }
    public void setAltra_unita_di_misura___starts_with(String altra_unita_di_misura___starts_with) {
        this.altra_unita_di_misura___starts_with = altra_unita_di_misura___starts_with;
    }

    public String getAltra_unita_di_misura___not___starts_with() {
        return altra_unita_di_misura___not___starts_with;
    }
    public void setAltra_unita_di_misura___not___starts_with(String altra_unita_di_misura___not___starts_with) {
        this.altra_unita_di_misura___not___starts_with = altra_unita_di_misura___not___starts_with;
    }

    public String getAltra_unita_di_misura___ends_with() {
        return altra_unita_di_misura___ends_with;
    }
    public void setAltra_unita_di_misura___ends_with(String altra_unita_di_misura___ends_with) {
        this.altra_unita_di_misura___ends_with = altra_unita_di_misura___ends_with;
    }

    public String getAltra_unita_di_misura___not___ends_with() {
        return altra_unita_di_misura___not___ends_with;
    }
    public void setAltra_unita_di_misura___not___ends_with(String altra_unita_di_misura___not___ends_with) {
        this.altra_unita_di_misura___not___ends_with = altra_unita_di_misura___not___ends_with;
    }

    public String getAltro_genotipo___eq() {
        return altro_genotipo___eq;
    }
    public void setAltro_genotipo___eq(String altro_genotipo___eq) {
        this.altro_genotipo___eq = altro_genotipo___eq;
    }

    public String getAltro_genotipo___ne() {
        return altro_genotipo___ne;
    }
    public void setAltro_genotipo___ne(String altro_genotipo___ne) {
        this.altro_genotipo___ne = altro_genotipo___ne;
    }

    public Boolean getAltro_genotipo___null() {
        return altro_genotipo___null;
    }
    public void setAltro_genotipo___null(Boolean altro_genotipo___null) {
        this.altro_genotipo___null = altro_genotipo___null;
    }

    public Boolean getAltro_genotipo___not___null() {
        return altro_genotipo___not___null;
    }
    public void setAltro_genotipo___not___null(Boolean altro_genotipo___not___null) {
        this.altro_genotipo___not___null = altro_genotipo___not___null;
    }

    public java.util.List<String> getAltro_genotipo___in() {
        return altro_genotipo___in;
    }
    public void setAltro_genotipo___in(java.util.List<String> altro_genotipo___in) {
        this.altro_genotipo___in = altro_genotipo___in;
    }

    public java.util.List<String> getAltro_genotipo___not___in() {
        return altro_genotipo___not___in;
    }
    public void setAltro_genotipo___not___in(java.util.List<String> altro_genotipo___not___in) {
        this.altro_genotipo___not___in = altro_genotipo___not___in;
    }

    public String getAltro_genotipo___lt() {
        return altro_genotipo___lt;
    }
    public void setAltro_genotipo___lt(String altro_genotipo___lt) {
        this.altro_genotipo___lt = altro_genotipo___lt;
    }

    public String getAltro_genotipo___lte() {
        return altro_genotipo___lte;
    }
    public void setAltro_genotipo___lte(String altro_genotipo___lte) {
        this.altro_genotipo___lte = altro_genotipo___lte;
    }

    public String getAltro_genotipo___gt() {
        return altro_genotipo___gt;
    }
    public void setAltro_genotipo___gt(String altro_genotipo___gt) {
        this.altro_genotipo___gt = altro_genotipo___gt;
    }

    public String getAltro_genotipo___gte() {
        return altro_genotipo___gte;
    }
    public void setAltro_genotipo___gte(String altro_genotipo___gte) {
        this.altro_genotipo___gte = altro_genotipo___gte;
    }

    public String getAltro_genotipo___contains() {
        return altro_genotipo___contains;
    }
    public void setAltro_genotipo___contains(String altro_genotipo___contains) {
        this.altro_genotipo___contains = altro_genotipo___contains;
    }

    public String getAltro_genotipo___not___contains() {
        return altro_genotipo___not___contains;
    }
    public void setAltro_genotipo___not___contains(String altro_genotipo___not___contains) {
        this.altro_genotipo___not___contains = altro_genotipo___not___contains;
    }

    public String getAltro_genotipo___starts_with() {
        return altro_genotipo___starts_with;
    }
    public void setAltro_genotipo___starts_with(String altro_genotipo___starts_with) {
        this.altro_genotipo___starts_with = altro_genotipo___starts_with;
    }

    public String getAltro_genotipo___not___starts_with() {
        return altro_genotipo___not___starts_with;
    }
    public void setAltro_genotipo___not___starts_with(String altro_genotipo___not___starts_with) {
        this.altro_genotipo___not___starts_with = altro_genotipo___not___starts_with;
    }

    public String getAltro_genotipo___ends_with() {
        return altro_genotipo___ends_with;
    }
    public void setAltro_genotipo___ends_with(String altro_genotipo___ends_with) {
        this.altro_genotipo___ends_with = altro_genotipo___ends_with;
    }

    public String getAltro_genotipo___not___ends_with() {
        return altro_genotipo___not___ends_with;
    }
    public void setAltro_genotipo___not___ends_with(String altro_genotipo___not___ends_with) {
        this.altro_genotipo___not___ends_with = altro_genotipo___not___ends_with;
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

    public String getEsito___eq() {
        return esito___eq;
    }
    public void setEsito___eq(String esito___eq) {
        this.esito___eq = esito___eq;
    }

    public String getEsito___ne() {
        return esito___ne;
    }
    public void setEsito___ne(String esito___ne) {
        this.esito___ne = esito___ne;
    }

    public Boolean getEsito___null() {
        return esito___null;
    }
    public void setEsito___null(Boolean esito___null) {
        this.esito___null = esito___null;
    }

    public Boolean getEsito___not___null() {
        return esito___not___null;
    }
    public void setEsito___not___null(Boolean esito___not___null) {
        this.esito___not___null = esito___not___null;
    }

    public java.util.List<String> getEsito___in() {
        return esito___in;
    }
    public void setEsito___in(java.util.List<String> esito___in) {
        this.esito___in = esito___in;
    }

    public java.util.List<String> getEsito___not___in() {
        return esito___not___in;
    }
    public void setEsito___not___in(java.util.List<String> esito___not___in) {
        this.esito___not___in = esito___not___in;
    }

    public String getEsito___lt() {
        return esito___lt;
    }
    public void setEsito___lt(String esito___lt) {
        this.esito___lt = esito___lt;
    }

    public String getEsito___lte() {
        return esito___lte;
    }
    public void setEsito___lte(String esito___lte) {
        this.esito___lte = esito___lte;
    }

    public String getEsito___gt() {
        return esito___gt;
    }
    public void setEsito___gt(String esito___gt) {
        this.esito___gt = esito___gt;
    }

    public String getEsito___gte() {
        return esito___gte;
    }
    public void setEsito___gte(String esito___gte) {
        this.esito___gte = esito___gte;
    }

    public String getEsito___contains() {
        return esito___contains;
    }
    public void setEsito___contains(String esito___contains) {
        this.esito___contains = esito___contains;
    }

    public String getEsito___not___contains() {
        return esito___not___contains;
    }
    public void setEsito___not___contains(String esito___not___contains) {
        this.esito___not___contains = esito___not___contains;
    }

    public String getEsito___starts_with() {
        return esito___starts_with;
    }
    public void setEsito___starts_with(String esito___starts_with) {
        this.esito___starts_with = esito___starts_with;
    }

    public String getEsito___not___starts_with() {
        return esito___not___starts_with;
    }
    public void setEsito___not___starts_with(String esito___not___starts_with) {
        this.esito___not___starts_with = esito___not___starts_with;
    }

    public String getEsito___ends_with() {
        return esito___ends_with;
    }
    public void setEsito___ends_with(String esito___ends_with) {
        this.esito___ends_with = esito___ends_with;
    }

    public String getEsito___not___ends_with() {
        return esito___not___ends_with;
    }
    public void setEsito___not___ends_with(String esito___not___ends_with) {
        this.esito___not___ends_with = esito___not___ends_with;
    }

    public String getGenotipo___eq() {
        return genotipo___eq;
    }
    public void setGenotipo___eq(String genotipo___eq) {
        this.genotipo___eq = genotipo___eq;
    }

    public String getGenotipo___ne() {
        return genotipo___ne;
    }
    public void setGenotipo___ne(String genotipo___ne) {
        this.genotipo___ne = genotipo___ne;
    }

    public Boolean getGenotipo___null() {
        return genotipo___null;
    }
    public void setGenotipo___null(Boolean genotipo___null) {
        this.genotipo___null = genotipo___null;
    }

    public Boolean getGenotipo___not___null() {
        return genotipo___not___null;
    }
    public void setGenotipo___not___null(Boolean genotipo___not___null) {
        this.genotipo___not___null = genotipo___not___null;
    }

    public java.util.List<String> getGenotipo___in() {
        return genotipo___in;
    }
    public void setGenotipo___in(java.util.List<String> genotipo___in) {
        this.genotipo___in = genotipo___in;
    }

    public java.util.List<String> getGenotipo___not___in() {
        return genotipo___not___in;
    }
    public void setGenotipo___not___in(java.util.List<String> genotipo___not___in) {
        this.genotipo___not___in = genotipo___not___in;
    }

    public String getGenotipo___lt() {
        return genotipo___lt;
    }
    public void setGenotipo___lt(String genotipo___lt) {
        this.genotipo___lt = genotipo___lt;
    }

    public String getGenotipo___lte() {
        return genotipo___lte;
    }
    public void setGenotipo___lte(String genotipo___lte) {
        this.genotipo___lte = genotipo___lte;
    }

    public String getGenotipo___gt() {
        return genotipo___gt;
    }
    public void setGenotipo___gt(String genotipo___gt) {
        this.genotipo___gt = genotipo___gt;
    }

    public String getGenotipo___gte() {
        return genotipo___gte;
    }
    public void setGenotipo___gte(String genotipo___gte) {
        this.genotipo___gte = genotipo___gte;
    }

    public String getGenotipo___contains() {
        return genotipo___contains;
    }
    public void setGenotipo___contains(String genotipo___contains) {
        this.genotipo___contains = genotipo___contains;
    }

    public String getGenotipo___not___contains() {
        return genotipo___not___contains;
    }
    public void setGenotipo___not___contains(String genotipo___not___contains) {
        this.genotipo___not___contains = genotipo___not___contains;
    }

    public String getGenotipo___starts_with() {
        return genotipo___starts_with;
    }
    public void setGenotipo___starts_with(String genotipo___starts_with) {
        this.genotipo___starts_with = genotipo___starts_with;
    }

    public String getGenotipo___not___starts_with() {
        return genotipo___not___starts_with;
    }
    public void setGenotipo___not___starts_with(String genotipo___not___starts_with) {
        this.genotipo___not___starts_with = genotipo___not___starts_with;
    }

    public String getGenotipo___ends_with() {
        return genotipo___ends_with;
    }
    public void setGenotipo___ends_with(String genotipo___ends_with) {
        this.genotipo___ends_with = genotipo___ends_with;
    }

    public String getGenotipo___not___ends_with() {
        return genotipo___not___ends_with;
    }
    public void setGenotipo___not___ends_with(String genotipo___not___ends_with) {
        this.genotipo___not___ends_with = genotipo___not___ends_with;
    }

    public Integer getLower_limit___eq() {
        return lower_limit___eq;
    }
    public void setLower_limit___eq(Integer lower_limit___eq) {
        this.lower_limit___eq = lower_limit___eq;
    }

    public Integer getLower_limit___ne() {
        return lower_limit___ne;
    }
    public void setLower_limit___ne(Integer lower_limit___ne) {
        this.lower_limit___ne = lower_limit___ne;
    }

    public Boolean getLower_limit___null() {
        return lower_limit___null;
    }
    public void setLower_limit___null(Boolean lower_limit___null) {
        this.lower_limit___null = lower_limit___null;
    }

    public Boolean getLower_limit___not___null() {
        return lower_limit___not___null;
    }
    public void setLower_limit___not___null(Boolean lower_limit___not___null) {
        this.lower_limit___not___null = lower_limit___not___null;
    }

    public java.util.List<Integer> getLower_limit___in() {
        return lower_limit___in;
    }
    public void setLower_limit___in(java.util.List<Integer> lower_limit___in) {
        this.lower_limit___in = lower_limit___in;
    }

    public java.util.List<Integer> getLower_limit___not___in() {
        return lower_limit___not___in;
    }
    public void setLower_limit___not___in(java.util.List<Integer> lower_limit___not___in) {
        this.lower_limit___not___in = lower_limit___not___in;
    }

    public Integer getLower_limit___lt() {
        return lower_limit___lt;
    }
    public void setLower_limit___lt(Integer lower_limit___lt) {
        this.lower_limit___lt = lower_limit___lt;
    }

    public Integer getLower_limit___lte() {
        return lower_limit___lte;
    }
    public void setLower_limit___lte(Integer lower_limit___lte) {
        this.lower_limit___lte = lower_limit___lte;
    }

    public Integer getLower_limit___gt() {
        return lower_limit___gt;
    }
    public void setLower_limit___gt(Integer lower_limit___gt) {
        this.lower_limit___gt = lower_limit___gt;
    }

    public Integer getLower_limit___gte() {
        return lower_limit___gte;
    }
    public void setLower_limit___gte(Integer lower_limit___gte) {
        this.lower_limit___gte = lower_limit___gte;
    }

    public String getMetodica_genoma___eq() {
        return metodica_genoma___eq;
    }
    public void setMetodica_genoma___eq(String metodica_genoma___eq) {
        this.metodica_genoma___eq = metodica_genoma___eq;
    }

    public String getMetodica_genoma___ne() {
        return metodica_genoma___ne;
    }
    public void setMetodica_genoma___ne(String metodica_genoma___ne) {
        this.metodica_genoma___ne = metodica_genoma___ne;
    }

    public Boolean getMetodica_genoma___null() {
        return metodica_genoma___null;
    }
    public void setMetodica_genoma___null(Boolean metodica_genoma___null) {
        this.metodica_genoma___null = metodica_genoma___null;
    }

    public Boolean getMetodica_genoma___not___null() {
        return metodica_genoma___not___null;
    }
    public void setMetodica_genoma___not___null(Boolean metodica_genoma___not___null) {
        this.metodica_genoma___not___null = metodica_genoma___not___null;
    }

    public java.util.List<String> getMetodica_genoma___in() {
        return metodica_genoma___in;
    }
    public void setMetodica_genoma___in(java.util.List<String> metodica_genoma___in) {
        this.metodica_genoma___in = metodica_genoma___in;
    }

    public java.util.List<String> getMetodica_genoma___not___in() {
        return metodica_genoma___not___in;
    }
    public void setMetodica_genoma___not___in(java.util.List<String> metodica_genoma___not___in) {
        this.metodica_genoma___not___in = metodica_genoma___not___in;
    }

    public String getMetodica_genoma___lt() {
        return metodica_genoma___lt;
    }
    public void setMetodica_genoma___lt(String metodica_genoma___lt) {
        this.metodica_genoma___lt = metodica_genoma___lt;
    }

    public String getMetodica_genoma___lte() {
        return metodica_genoma___lte;
    }
    public void setMetodica_genoma___lte(String metodica_genoma___lte) {
        this.metodica_genoma___lte = metodica_genoma___lte;
    }

    public String getMetodica_genoma___gt() {
        return metodica_genoma___gt;
    }
    public void setMetodica_genoma___gt(String metodica_genoma___gt) {
        this.metodica_genoma___gt = metodica_genoma___gt;
    }

    public String getMetodica_genoma___gte() {
        return metodica_genoma___gte;
    }
    public void setMetodica_genoma___gte(String metodica_genoma___gte) {
        this.metodica_genoma___gte = metodica_genoma___gte;
    }

    public String getMetodica_genoma___contains() {
        return metodica_genoma___contains;
    }
    public void setMetodica_genoma___contains(String metodica_genoma___contains) {
        this.metodica_genoma___contains = metodica_genoma___contains;
    }

    public String getMetodica_genoma___not___contains() {
        return metodica_genoma___not___contains;
    }
    public void setMetodica_genoma___not___contains(String metodica_genoma___not___contains) {
        this.metodica_genoma___not___contains = metodica_genoma___not___contains;
    }

    public String getMetodica_genoma___starts_with() {
        return metodica_genoma___starts_with;
    }
    public void setMetodica_genoma___starts_with(String metodica_genoma___starts_with) {
        this.metodica_genoma___starts_with = metodica_genoma___starts_with;
    }

    public String getMetodica_genoma___not___starts_with() {
        return metodica_genoma___not___starts_with;
    }
    public void setMetodica_genoma___not___starts_with(String metodica_genoma___not___starts_with) {
        this.metodica_genoma___not___starts_with = metodica_genoma___not___starts_with;
    }

    public String getMetodica_genoma___ends_with() {
        return metodica_genoma___ends_with;
    }
    public void setMetodica_genoma___ends_with(String metodica_genoma___ends_with) {
        this.metodica_genoma___ends_with = metodica_genoma___ends_with;
    }

    public String getMetodica_genoma___not___ends_with() {
        return metodica_genoma___not___ends_with;
    }
    public void setMetodica_genoma___not___ends_with(String metodica_genoma___not___ends_with) {
        this.metodica_genoma___not___ends_with = metodica_genoma___not___ends_with;
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

    public String getTipologia_test___eq() {
        return tipologia_test___eq;
    }
    public void setTipologia_test___eq(String tipologia_test___eq) {
        this.tipologia_test___eq = tipologia_test___eq;
    }

    public String getTipologia_test___ne() {
        return tipologia_test___ne;
    }
    public void setTipologia_test___ne(String tipologia_test___ne) {
        this.tipologia_test___ne = tipologia_test___ne;
    }

    public Boolean getTipologia_test___null() {
        return tipologia_test___null;
    }
    public void setTipologia_test___null(Boolean tipologia_test___null) {
        this.tipologia_test___null = tipologia_test___null;
    }

    public Boolean getTipologia_test___not___null() {
        return tipologia_test___not___null;
    }
    public void setTipologia_test___not___null(Boolean tipologia_test___not___null) {
        this.tipologia_test___not___null = tipologia_test___not___null;
    }

    public java.util.List<String> getTipologia_test___in() {
        return tipologia_test___in;
    }
    public void setTipologia_test___in(java.util.List<String> tipologia_test___in) {
        this.tipologia_test___in = tipologia_test___in;
    }

    public java.util.List<String> getTipologia_test___not___in() {
        return tipologia_test___not___in;
    }
    public void setTipologia_test___not___in(java.util.List<String> tipologia_test___not___in) {
        this.tipologia_test___not___in = tipologia_test___not___in;
    }

    public String getTipologia_test___lt() {
        return tipologia_test___lt;
    }
    public void setTipologia_test___lt(String tipologia_test___lt) {
        this.tipologia_test___lt = tipologia_test___lt;
    }

    public String getTipologia_test___lte() {
        return tipologia_test___lte;
    }
    public void setTipologia_test___lte(String tipologia_test___lte) {
        this.tipologia_test___lte = tipologia_test___lte;
    }

    public String getTipologia_test___gt() {
        return tipologia_test___gt;
    }
    public void setTipologia_test___gt(String tipologia_test___gt) {
        this.tipologia_test___gt = tipologia_test___gt;
    }

    public String getTipologia_test___gte() {
        return tipologia_test___gte;
    }
    public void setTipologia_test___gte(String tipologia_test___gte) {
        this.tipologia_test___gte = tipologia_test___gte;
    }

    public String getTipologia_test___contains() {
        return tipologia_test___contains;
    }
    public void setTipologia_test___contains(String tipologia_test___contains) {
        this.tipologia_test___contains = tipologia_test___contains;
    }

    public String getTipologia_test___not___contains() {
        return tipologia_test___not___contains;
    }
    public void setTipologia_test___not___contains(String tipologia_test___not___contains) {
        this.tipologia_test___not___contains = tipologia_test___not___contains;
    }

    public String getTipologia_test___starts_with() {
        return tipologia_test___starts_with;
    }
    public void setTipologia_test___starts_with(String tipologia_test___starts_with) {
        this.tipologia_test___starts_with = tipologia_test___starts_with;
    }

    public String getTipologia_test___not___starts_with() {
        return tipologia_test___not___starts_with;
    }
    public void setTipologia_test___not___starts_with(String tipologia_test___not___starts_with) {
        this.tipologia_test___not___starts_with = tipologia_test___not___starts_with;
    }

    public String getTipologia_test___ends_with() {
        return tipologia_test___ends_with;
    }
    public void setTipologia_test___ends_with(String tipologia_test___ends_with) {
        this.tipologia_test___ends_with = tipologia_test___ends_with;
    }

    public String getTipologia_test___not___ends_with() {
        return tipologia_test___not___ends_with;
    }
    public void setTipologia_test___not___ends_with(String tipologia_test___not___ends_with) {
        this.tipologia_test___not___ends_with = tipologia_test___not___ends_with;
    }

    public String getUnita_di_misura___eq() {
        return unita_di_misura___eq;
    }
    public void setUnita_di_misura___eq(String unita_di_misura___eq) {
        this.unita_di_misura___eq = unita_di_misura___eq;
    }

    public String getUnita_di_misura___ne() {
        return unita_di_misura___ne;
    }
    public void setUnita_di_misura___ne(String unita_di_misura___ne) {
        this.unita_di_misura___ne = unita_di_misura___ne;
    }

    public Boolean getUnita_di_misura___null() {
        return unita_di_misura___null;
    }
    public void setUnita_di_misura___null(Boolean unita_di_misura___null) {
        this.unita_di_misura___null = unita_di_misura___null;
    }

    public Boolean getUnita_di_misura___not___null() {
        return unita_di_misura___not___null;
    }
    public void setUnita_di_misura___not___null(Boolean unita_di_misura___not___null) {
        this.unita_di_misura___not___null = unita_di_misura___not___null;
    }

    public java.util.List<String> getUnita_di_misura___in() {
        return unita_di_misura___in;
    }
    public void setUnita_di_misura___in(java.util.List<String> unita_di_misura___in) {
        this.unita_di_misura___in = unita_di_misura___in;
    }

    public java.util.List<String> getUnita_di_misura___not___in() {
        return unita_di_misura___not___in;
    }
    public void setUnita_di_misura___not___in(java.util.List<String> unita_di_misura___not___in) {
        this.unita_di_misura___not___in = unita_di_misura___not___in;
    }

    public String getUnita_di_misura___lt() {
        return unita_di_misura___lt;
    }
    public void setUnita_di_misura___lt(String unita_di_misura___lt) {
        this.unita_di_misura___lt = unita_di_misura___lt;
    }

    public String getUnita_di_misura___lte() {
        return unita_di_misura___lte;
    }
    public void setUnita_di_misura___lte(String unita_di_misura___lte) {
        this.unita_di_misura___lte = unita_di_misura___lte;
    }

    public String getUnita_di_misura___gt() {
        return unita_di_misura___gt;
    }
    public void setUnita_di_misura___gt(String unita_di_misura___gt) {
        this.unita_di_misura___gt = unita_di_misura___gt;
    }

    public String getUnita_di_misura___gte() {
        return unita_di_misura___gte;
    }
    public void setUnita_di_misura___gte(String unita_di_misura___gte) {
        this.unita_di_misura___gte = unita_di_misura___gte;
    }

    public String getUnita_di_misura___contains() {
        return unita_di_misura___contains;
    }
    public void setUnita_di_misura___contains(String unita_di_misura___contains) {
        this.unita_di_misura___contains = unita_di_misura___contains;
    }

    public String getUnita_di_misura___not___contains() {
        return unita_di_misura___not___contains;
    }
    public void setUnita_di_misura___not___contains(String unita_di_misura___not___contains) {
        this.unita_di_misura___not___contains = unita_di_misura___not___contains;
    }

    public String getUnita_di_misura___starts_with() {
        return unita_di_misura___starts_with;
    }
    public void setUnita_di_misura___starts_with(String unita_di_misura___starts_with) {
        this.unita_di_misura___starts_with = unita_di_misura___starts_with;
    }

    public String getUnita_di_misura___not___starts_with() {
        return unita_di_misura___not___starts_with;
    }
    public void setUnita_di_misura___not___starts_with(String unita_di_misura___not___starts_with) {
        this.unita_di_misura___not___starts_with = unita_di_misura___not___starts_with;
    }

    public String getUnita_di_misura___ends_with() {
        return unita_di_misura___ends_with;
    }
    public void setUnita_di_misura___ends_with(String unita_di_misura___ends_with) {
        this.unita_di_misura___ends_with = unita_di_misura___ends_with;
    }

    public String getUnita_di_misura___not___ends_with() {
        return unita_di_misura___not___ends_with;
    }
    public void setUnita_di_misura___not___ends_with(String unita_di_misura___not___ends_with) {
        this.unita_di_misura___not___ends_with = unita_di_misura___not___ends_with;
    }

    public Integer getValore___eq() {
        return valore___eq;
    }
    public void setValore___eq(Integer valore___eq) {
        this.valore___eq = valore___eq;
    }

    public Integer getValore___ne() {
        return valore___ne;
    }
    public void setValore___ne(Integer valore___ne) {
        this.valore___ne = valore___ne;
    }

    public Boolean getValore___null() {
        return valore___null;
    }
    public void setValore___null(Boolean valore___null) {
        this.valore___null = valore___null;
    }

    public Boolean getValore___not___null() {
        return valore___not___null;
    }
    public void setValore___not___null(Boolean valore___not___null) {
        this.valore___not___null = valore___not___null;
    }

    public java.util.List<Integer> getValore___in() {
        return valore___in;
    }
    public void setValore___in(java.util.List<Integer> valore___in) {
        this.valore___in = valore___in;
    }

    public java.util.List<Integer> getValore___not___in() {
        return valore___not___in;
    }
    public void setValore___not___in(java.util.List<Integer> valore___not___in) {
        this.valore___not___in = valore___not___in;
    }

    public Integer getValore___lt() {
        return valore___lt;
    }
    public void setValore___lt(Integer valore___lt) {
        this.valore___lt = valore___lt;
    }

    public Integer getValore___lte() {
        return valore___lte;
    }
    public void setValore___lte(Integer valore___lte) {
        this.valore___lte = valore___lte;
    }

    public Integer getValore___gt() {
        return valore___gt;
    }
    public void setValore___gt(Integer valore___gt) {
        this.valore___gt = valore___gt;
    }

    public Integer getValore___gte() {
        return valore___gte;
    }
    public void setValore___gte(Integer valore___gte) {
        this.valore___gte = valore___gte;
    }

    public java.util.List<CliMarkers_HCVFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliMarkers_HCVFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliMarkers_HCVFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliMarkers_HCVFilterDTO> OR) {
        this.OR = OR;
    }

    public CliMarkers_HCVFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliMarkers_HCVFilterDTO NOT) {
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
        if (altra_metodica___eq != null) {
            joiner.add("altra_metodica___eq: " + GraphQLRequestSerializer.getEntry(altra_metodica___eq));
        }
        if (altra_metodica___ne != null) {
            joiner.add("altra_metodica___ne: " + GraphQLRequestSerializer.getEntry(altra_metodica___ne));
        }
        if (altra_metodica___null != null) {
            joiner.add("altra_metodica___null: " + GraphQLRequestSerializer.getEntry(altra_metodica___null));
        }
        if (altra_metodica___not___null != null) {
            joiner.add("altra_metodica___not___null: " + GraphQLRequestSerializer.getEntry(altra_metodica___not___null));
        }
        if (altra_metodica___in != null) {
            joiner.add("altra_metodica___in: " + GraphQLRequestSerializer.getEntry(altra_metodica___in));
        }
        if (altra_metodica___not___in != null) {
            joiner.add("altra_metodica___not___in: " + GraphQLRequestSerializer.getEntry(altra_metodica___not___in));
        }
        if (altra_metodica___lt != null) {
            joiner.add("altra_metodica___lt: " + GraphQLRequestSerializer.getEntry(altra_metodica___lt));
        }
        if (altra_metodica___lte != null) {
            joiner.add("altra_metodica___lte: " + GraphQLRequestSerializer.getEntry(altra_metodica___lte));
        }
        if (altra_metodica___gt != null) {
            joiner.add("altra_metodica___gt: " + GraphQLRequestSerializer.getEntry(altra_metodica___gt));
        }
        if (altra_metodica___gte != null) {
            joiner.add("altra_metodica___gte: " + GraphQLRequestSerializer.getEntry(altra_metodica___gte));
        }
        if (altra_metodica___contains != null) {
            joiner.add("altra_metodica___contains: " + GraphQLRequestSerializer.getEntry(altra_metodica___contains));
        }
        if (altra_metodica___not___contains != null) {
            joiner.add("altra_metodica___not___contains: " + GraphQLRequestSerializer.getEntry(altra_metodica___not___contains));
        }
        if (altra_metodica___starts_with != null) {
            joiner.add("altra_metodica___starts_with: " + GraphQLRequestSerializer.getEntry(altra_metodica___starts_with));
        }
        if (altra_metodica___not___starts_with != null) {
            joiner.add("altra_metodica___not___starts_with: " + GraphQLRequestSerializer.getEntry(altra_metodica___not___starts_with));
        }
        if (altra_metodica___ends_with != null) {
            joiner.add("altra_metodica___ends_with: " + GraphQLRequestSerializer.getEntry(altra_metodica___ends_with));
        }
        if (altra_metodica___not___ends_with != null) {
            joiner.add("altra_metodica___not___ends_with: " + GraphQLRequestSerializer.getEntry(altra_metodica___not___ends_with));
        }
        if (altra_unita_di_misura___eq != null) {
            joiner.add("altra_unita_di_misura___eq: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___eq));
        }
        if (altra_unita_di_misura___ne != null) {
            joiner.add("altra_unita_di_misura___ne: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___ne));
        }
        if (altra_unita_di_misura___null != null) {
            joiner.add("altra_unita_di_misura___null: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___null));
        }
        if (altra_unita_di_misura___not___null != null) {
            joiner.add("altra_unita_di_misura___not___null: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___not___null));
        }
        if (altra_unita_di_misura___in != null) {
            joiner.add("altra_unita_di_misura___in: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___in));
        }
        if (altra_unita_di_misura___not___in != null) {
            joiner.add("altra_unita_di_misura___not___in: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___not___in));
        }
        if (altra_unita_di_misura___lt != null) {
            joiner.add("altra_unita_di_misura___lt: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___lt));
        }
        if (altra_unita_di_misura___lte != null) {
            joiner.add("altra_unita_di_misura___lte: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___lte));
        }
        if (altra_unita_di_misura___gt != null) {
            joiner.add("altra_unita_di_misura___gt: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___gt));
        }
        if (altra_unita_di_misura___gte != null) {
            joiner.add("altra_unita_di_misura___gte: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___gte));
        }
        if (altra_unita_di_misura___contains != null) {
            joiner.add("altra_unita_di_misura___contains: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___contains));
        }
        if (altra_unita_di_misura___not___contains != null) {
            joiner.add("altra_unita_di_misura___not___contains: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___not___contains));
        }
        if (altra_unita_di_misura___starts_with != null) {
            joiner.add("altra_unita_di_misura___starts_with: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___starts_with));
        }
        if (altra_unita_di_misura___not___starts_with != null) {
            joiner.add("altra_unita_di_misura___not___starts_with: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___not___starts_with));
        }
        if (altra_unita_di_misura___ends_with != null) {
            joiner.add("altra_unita_di_misura___ends_with: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___ends_with));
        }
        if (altra_unita_di_misura___not___ends_with != null) {
            joiner.add("altra_unita_di_misura___not___ends_with: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura___not___ends_with));
        }
        if (altro_genotipo___eq != null) {
            joiner.add("altro_genotipo___eq: " + GraphQLRequestSerializer.getEntry(altro_genotipo___eq));
        }
        if (altro_genotipo___ne != null) {
            joiner.add("altro_genotipo___ne: " + GraphQLRequestSerializer.getEntry(altro_genotipo___ne));
        }
        if (altro_genotipo___null != null) {
            joiner.add("altro_genotipo___null: " + GraphQLRequestSerializer.getEntry(altro_genotipo___null));
        }
        if (altro_genotipo___not___null != null) {
            joiner.add("altro_genotipo___not___null: " + GraphQLRequestSerializer.getEntry(altro_genotipo___not___null));
        }
        if (altro_genotipo___in != null) {
            joiner.add("altro_genotipo___in: " + GraphQLRequestSerializer.getEntry(altro_genotipo___in));
        }
        if (altro_genotipo___not___in != null) {
            joiner.add("altro_genotipo___not___in: " + GraphQLRequestSerializer.getEntry(altro_genotipo___not___in));
        }
        if (altro_genotipo___lt != null) {
            joiner.add("altro_genotipo___lt: " + GraphQLRequestSerializer.getEntry(altro_genotipo___lt));
        }
        if (altro_genotipo___lte != null) {
            joiner.add("altro_genotipo___lte: " + GraphQLRequestSerializer.getEntry(altro_genotipo___lte));
        }
        if (altro_genotipo___gt != null) {
            joiner.add("altro_genotipo___gt: " + GraphQLRequestSerializer.getEntry(altro_genotipo___gt));
        }
        if (altro_genotipo___gte != null) {
            joiner.add("altro_genotipo___gte: " + GraphQLRequestSerializer.getEntry(altro_genotipo___gte));
        }
        if (altro_genotipo___contains != null) {
            joiner.add("altro_genotipo___contains: " + GraphQLRequestSerializer.getEntry(altro_genotipo___contains));
        }
        if (altro_genotipo___not___contains != null) {
            joiner.add("altro_genotipo___not___contains: " + GraphQLRequestSerializer.getEntry(altro_genotipo___not___contains));
        }
        if (altro_genotipo___starts_with != null) {
            joiner.add("altro_genotipo___starts_with: " + GraphQLRequestSerializer.getEntry(altro_genotipo___starts_with));
        }
        if (altro_genotipo___not___starts_with != null) {
            joiner.add("altro_genotipo___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_genotipo___not___starts_with));
        }
        if (altro_genotipo___ends_with != null) {
            joiner.add("altro_genotipo___ends_with: " + GraphQLRequestSerializer.getEntry(altro_genotipo___ends_with));
        }
        if (altro_genotipo___not___ends_with != null) {
            joiner.add("altro_genotipo___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_genotipo___not___ends_with));
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
        if (esito___eq != null) {
            joiner.add("esito___eq: " + GraphQLRequestSerializer.getEntry(esito___eq));
        }
        if (esito___ne != null) {
            joiner.add("esito___ne: " + GraphQLRequestSerializer.getEntry(esito___ne));
        }
        if (esito___null != null) {
            joiner.add("esito___null: " + GraphQLRequestSerializer.getEntry(esito___null));
        }
        if (esito___not___null != null) {
            joiner.add("esito___not___null: " + GraphQLRequestSerializer.getEntry(esito___not___null));
        }
        if (esito___in != null) {
            joiner.add("esito___in: " + GraphQLRequestSerializer.getEntry(esito___in));
        }
        if (esito___not___in != null) {
            joiner.add("esito___not___in: " + GraphQLRequestSerializer.getEntry(esito___not___in));
        }
        if (esito___lt != null) {
            joiner.add("esito___lt: " + GraphQLRequestSerializer.getEntry(esito___lt));
        }
        if (esito___lte != null) {
            joiner.add("esito___lte: " + GraphQLRequestSerializer.getEntry(esito___lte));
        }
        if (esito___gt != null) {
            joiner.add("esito___gt: " + GraphQLRequestSerializer.getEntry(esito___gt));
        }
        if (esito___gte != null) {
            joiner.add("esito___gte: " + GraphQLRequestSerializer.getEntry(esito___gte));
        }
        if (esito___contains != null) {
            joiner.add("esito___contains: " + GraphQLRequestSerializer.getEntry(esito___contains));
        }
        if (esito___not___contains != null) {
            joiner.add("esito___not___contains: " + GraphQLRequestSerializer.getEntry(esito___not___contains));
        }
        if (esito___starts_with != null) {
            joiner.add("esito___starts_with: " + GraphQLRequestSerializer.getEntry(esito___starts_with));
        }
        if (esito___not___starts_with != null) {
            joiner.add("esito___not___starts_with: " + GraphQLRequestSerializer.getEntry(esito___not___starts_with));
        }
        if (esito___ends_with != null) {
            joiner.add("esito___ends_with: " + GraphQLRequestSerializer.getEntry(esito___ends_with));
        }
        if (esito___not___ends_with != null) {
            joiner.add("esito___not___ends_with: " + GraphQLRequestSerializer.getEntry(esito___not___ends_with));
        }
        if (genotipo___eq != null) {
            joiner.add("genotipo___eq: " + GraphQLRequestSerializer.getEntry(genotipo___eq));
        }
        if (genotipo___ne != null) {
            joiner.add("genotipo___ne: " + GraphQLRequestSerializer.getEntry(genotipo___ne));
        }
        if (genotipo___null != null) {
            joiner.add("genotipo___null: " + GraphQLRequestSerializer.getEntry(genotipo___null));
        }
        if (genotipo___not___null != null) {
            joiner.add("genotipo___not___null: " + GraphQLRequestSerializer.getEntry(genotipo___not___null));
        }
        if (genotipo___in != null) {
            joiner.add("genotipo___in: " + GraphQLRequestSerializer.getEntry(genotipo___in));
        }
        if (genotipo___not___in != null) {
            joiner.add("genotipo___not___in: " + GraphQLRequestSerializer.getEntry(genotipo___not___in));
        }
        if (genotipo___lt != null) {
            joiner.add("genotipo___lt: " + GraphQLRequestSerializer.getEntry(genotipo___lt));
        }
        if (genotipo___lte != null) {
            joiner.add("genotipo___lte: " + GraphQLRequestSerializer.getEntry(genotipo___lte));
        }
        if (genotipo___gt != null) {
            joiner.add("genotipo___gt: " + GraphQLRequestSerializer.getEntry(genotipo___gt));
        }
        if (genotipo___gte != null) {
            joiner.add("genotipo___gte: " + GraphQLRequestSerializer.getEntry(genotipo___gte));
        }
        if (genotipo___contains != null) {
            joiner.add("genotipo___contains: " + GraphQLRequestSerializer.getEntry(genotipo___contains));
        }
        if (genotipo___not___contains != null) {
            joiner.add("genotipo___not___contains: " + GraphQLRequestSerializer.getEntry(genotipo___not___contains));
        }
        if (genotipo___starts_with != null) {
            joiner.add("genotipo___starts_with: " + GraphQLRequestSerializer.getEntry(genotipo___starts_with));
        }
        if (genotipo___not___starts_with != null) {
            joiner.add("genotipo___not___starts_with: " + GraphQLRequestSerializer.getEntry(genotipo___not___starts_with));
        }
        if (genotipo___ends_with != null) {
            joiner.add("genotipo___ends_with: " + GraphQLRequestSerializer.getEntry(genotipo___ends_with));
        }
        if (genotipo___not___ends_with != null) {
            joiner.add("genotipo___not___ends_with: " + GraphQLRequestSerializer.getEntry(genotipo___not___ends_with));
        }
        if (lower_limit___eq != null) {
            joiner.add("lower_limit___eq: " + GraphQLRequestSerializer.getEntry(lower_limit___eq));
        }
        if (lower_limit___ne != null) {
            joiner.add("lower_limit___ne: " + GraphQLRequestSerializer.getEntry(lower_limit___ne));
        }
        if (lower_limit___null != null) {
            joiner.add("lower_limit___null: " + GraphQLRequestSerializer.getEntry(lower_limit___null));
        }
        if (lower_limit___not___null != null) {
            joiner.add("lower_limit___not___null: " + GraphQLRequestSerializer.getEntry(lower_limit___not___null));
        }
        if (lower_limit___in != null) {
            joiner.add("lower_limit___in: " + GraphQLRequestSerializer.getEntry(lower_limit___in));
        }
        if (lower_limit___not___in != null) {
            joiner.add("lower_limit___not___in: " + GraphQLRequestSerializer.getEntry(lower_limit___not___in));
        }
        if (lower_limit___lt != null) {
            joiner.add("lower_limit___lt: " + GraphQLRequestSerializer.getEntry(lower_limit___lt));
        }
        if (lower_limit___lte != null) {
            joiner.add("lower_limit___lte: " + GraphQLRequestSerializer.getEntry(lower_limit___lte));
        }
        if (lower_limit___gt != null) {
            joiner.add("lower_limit___gt: " + GraphQLRequestSerializer.getEntry(lower_limit___gt));
        }
        if (lower_limit___gte != null) {
            joiner.add("lower_limit___gte: " + GraphQLRequestSerializer.getEntry(lower_limit___gte));
        }
        if (metodica_genoma___eq != null) {
            joiner.add("metodica_genoma___eq: " + GraphQLRequestSerializer.getEntry(metodica_genoma___eq));
        }
        if (metodica_genoma___ne != null) {
            joiner.add("metodica_genoma___ne: " + GraphQLRequestSerializer.getEntry(metodica_genoma___ne));
        }
        if (metodica_genoma___null != null) {
            joiner.add("metodica_genoma___null: " + GraphQLRequestSerializer.getEntry(metodica_genoma___null));
        }
        if (metodica_genoma___not___null != null) {
            joiner.add("metodica_genoma___not___null: " + GraphQLRequestSerializer.getEntry(metodica_genoma___not___null));
        }
        if (metodica_genoma___in != null) {
            joiner.add("metodica_genoma___in: " + GraphQLRequestSerializer.getEntry(metodica_genoma___in));
        }
        if (metodica_genoma___not___in != null) {
            joiner.add("metodica_genoma___not___in: " + GraphQLRequestSerializer.getEntry(metodica_genoma___not___in));
        }
        if (metodica_genoma___lt != null) {
            joiner.add("metodica_genoma___lt: " + GraphQLRequestSerializer.getEntry(metodica_genoma___lt));
        }
        if (metodica_genoma___lte != null) {
            joiner.add("metodica_genoma___lte: " + GraphQLRequestSerializer.getEntry(metodica_genoma___lte));
        }
        if (metodica_genoma___gt != null) {
            joiner.add("metodica_genoma___gt: " + GraphQLRequestSerializer.getEntry(metodica_genoma___gt));
        }
        if (metodica_genoma___gte != null) {
            joiner.add("metodica_genoma___gte: " + GraphQLRequestSerializer.getEntry(metodica_genoma___gte));
        }
        if (metodica_genoma___contains != null) {
            joiner.add("metodica_genoma___contains: " + GraphQLRequestSerializer.getEntry(metodica_genoma___contains));
        }
        if (metodica_genoma___not___contains != null) {
            joiner.add("metodica_genoma___not___contains: " + GraphQLRequestSerializer.getEntry(metodica_genoma___not___contains));
        }
        if (metodica_genoma___starts_with != null) {
            joiner.add("metodica_genoma___starts_with: " + GraphQLRequestSerializer.getEntry(metodica_genoma___starts_with));
        }
        if (metodica_genoma___not___starts_with != null) {
            joiner.add("metodica_genoma___not___starts_with: " + GraphQLRequestSerializer.getEntry(metodica_genoma___not___starts_with));
        }
        if (metodica_genoma___ends_with != null) {
            joiner.add("metodica_genoma___ends_with: " + GraphQLRequestSerializer.getEntry(metodica_genoma___ends_with));
        }
        if (metodica_genoma___not___ends_with != null) {
            joiner.add("metodica_genoma___not___ends_with: " + GraphQLRequestSerializer.getEntry(metodica_genoma___not___ends_with));
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
        if (tipologia_test___eq != null) {
            joiner.add("tipologia_test___eq: " + GraphQLRequestSerializer.getEntry(tipologia_test___eq));
        }
        if (tipologia_test___ne != null) {
            joiner.add("tipologia_test___ne: " + GraphQLRequestSerializer.getEntry(tipologia_test___ne));
        }
        if (tipologia_test___null != null) {
            joiner.add("tipologia_test___null: " + GraphQLRequestSerializer.getEntry(tipologia_test___null));
        }
        if (tipologia_test___not___null != null) {
            joiner.add("tipologia_test___not___null: " + GraphQLRequestSerializer.getEntry(tipologia_test___not___null));
        }
        if (tipologia_test___in != null) {
            joiner.add("tipologia_test___in: " + GraphQLRequestSerializer.getEntry(tipologia_test___in));
        }
        if (tipologia_test___not___in != null) {
            joiner.add("tipologia_test___not___in: " + GraphQLRequestSerializer.getEntry(tipologia_test___not___in));
        }
        if (tipologia_test___lt != null) {
            joiner.add("tipologia_test___lt: " + GraphQLRequestSerializer.getEntry(tipologia_test___lt));
        }
        if (tipologia_test___lte != null) {
            joiner.add("tipologia_test___lte: " + GraphQLRequestSerializer.getEntry(tipologia_test___lte));
        }
        if (tipologia_test___gt != null) {
            joiner.add("tipologia_test___gt: " + GraphQLRequestSerializer.getEntry(tipologia_test___gt));
        }
        if (tipologia_test___gte != null) {
            joiner.add("tipologia_test___gte: " + GraphQLRequestSerializer.getEntry(tipologia_test___gte));
        }
        if (tipologia_test___contains != null) {
            joiner.add("tipologia_test___contains: " + GraphQLRequestSerializer.getEntry(tipologia_test___contains));
        }
        if (tipologia_test___not___contains != null) {
            joiner.add("tipologia_test___not___contains: " + GraphQLRequestSerializer.getEntry(tipologia_test___not___contains));
        }
        if (tipologia_test___starts_with != null) {
            joiner.add("tipologia_test___starts_with: " + GraphQLRequestSerializer.getEntry(tipologia_test___starts_with));
        }
        if (tipologia_test___not___starts_with != null) {
            joiner.add("tipologia_test___not___starts_with: " + GraphQLRequestSerializer.getEntry(tipologia_test___not___starts_with));
        }
        if (tipologia_test___ends_with != null) {
            joiner.add("tipologia_test___ends_with: " + GraphQLRequestSerializer.getEntry(tipologia_test___ends_with));
        }
        if (tipologia_test___not___ends_with != null) {
            joiner.add("tipologia_test___not___ends_with: " + GraphQLRequestSerializer.getEntry(tipologia_test___not___ends_with));
        }
        if (unita_di_misura___eq != null) {
            joiner.add("unita_di_misura___eq: " + GraphQLRequestSerializer.getEntry(unita_di_misura___eq));
        }
        if (unita_di_misura___ne != null) {
            joiner.add("unita_di_misura___ne: " + GraphQLRequestSerializer.getEntry(unita_di_misura___ne));
        }
        if (unita_di_misura___null != null) {
            joiner.add("unita_di_misura___null: " + GraphQLRequestSerializer.getEntry(unita_di_misura___null));
        }
        if (unita_di_misura___not___null != null) {
            joiner.add("unita_di_misura___not___null: " + GraphQLRequestSerializer.getEntry(unita_di_misura___not___null));
        }
        if (unita_di_misura___in != null) {
            joiner.add("unita_di_misura___in: " + GraphQLRequestSerializer.getEntry(unita_di_misura___in));
        }
        if (unita_di_misura___not___in != null) {
            joiner.add("unita_di_misura___not___in: " + GraphQLRequestSerializer.getEntry(unita_di_misura___not___in));
        }
        if (unita_di_misura___lt != null) {
            joiner.add("unita_di_misura___lt: " + GraphQLRequestSerializer.getEntry(unita_di_misura___lt));
        }
        if (unita_di_misura___lte != null) {
            joiner.add("unita_di_misura___lte: " + GraphQLRequestSerializer.getEntry(unita_di_misura___lte));
        }
        if (unita_di_misura___gt != null) {
            joiner.add("unita_di_misura___gt: " + GraphQLRequestSerializer.getEntry(unita_di_misura___gt));
        }
        if (unita_di_misura___gte != null) {
            joiner.add("unita_di_misura___gte: " + GraphQLRequestSerializer.getEntry(unita_di_misura___gte));
        }
        if (unita_di_misura___contains != null) {
            joiner.add("unita_di_misura___contains: " + GraphQLRequestSerializer.getEntry(unita_di_misura___contains));
        }
        if (unita_di_misura___not___contains != null) {
            joiner.add("unita_di_misura___not___contains: " + GraphQLRequestSerializer.getEntry(unita_di_misura___not___contains));
        }
        if (unita_di_misura___starts_with != null) {
            joiner.add("unita_di_misura___starts_with: " + GraphQLRequestSerializer.getEntry(unita_di_misura___starts_with));
        }
        if (unita_di_misura___not___starts_with != null) {
            joiner.add("unita_di_misura___not___starts_with: " + GraphQLRequestSerializer.getEntry(unita_di_misura___not___starts_with));
        }
        if (unita_di_misura___ends_with != null) {
            joiner.add("unita_di_misura___ends_with: " + GraphQLRequestSerializer.getEntry(unita_di_misura___ends_with));
        }
        if (unita_di_misura___not___ends_with != null) {
            joiner.add("unita_di_misura___not___ends_with: " + GraphQLRequestSerializer.getEntry(unita_di_misura___not___ends_with));
        }
        if (valore___eq != null) {
            joiner.add("valore___eq: " + GraphQLRequestSerializer.getEntry(valore___eq));
        }
        if (valore___ne != null) {
            joiner.add("valore___ne: " + GraphQLRequestSerializer.getEntry(valore___ne));
        }
        if (valore___null != null) {
            joiner.add("valore___null: " + GraphQLRequestSerializer.getEntry(valore___null));
        }
        if (valore___not___null != null) {
            joiner.add("valore___not___null: " + GraphQLRequestSerializer.getEntry(valore___not___null));
        }
        if (valore___in != null) {
            joiner.add("valore___in: " + GraphQLRequestSerializer.getEntry(valore___in));
        }
        if (valore___not___in != null) {
            joiner.add("valore___not___in: " + GraphQLRequestSerializer.getEntry(valore___not___in));
        }
        if (valore___lt != null) {
            joiner.add("valore___lt: " + GraphQLRequestSerializer.getEntry(valore___lt));
        }
        if (valore___lte != null) {
            joiner.add("valore___lte: " + GraphQLRequestSerializer.getEntry(valore___lte));
        }
        if (valore___gt != null) {
            joiner.add("valore___gt: " + GraphQLRequestSerializer.getEntry(valore___gt));
        }
        if (valore___gte != null) {
            joiner.add("valore___gte: " + GraphQLRequestSerializer.getEntry(valore___gte));
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

    public static CliMarkers_HCVFilterDTO.Builder builder() {
        return new CliMarkers_HCVFilterDTO.Builder();
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
        private String altra_metodica___eq;
        private String altra_metodica___ne;
        private Boolean altra_metodica___null;
        private Boolean altra_metodica___not___null;
        private java.util.List<String> altra_metodica___in;
        private java.util.List<String> altra_metodica___not___in;
        private String altra_metodica___lt;
        private String altra_metodica___lte;
        private String altra_metodica___gt;
        private String altra_metodica___gte;
        private String altra_metodica___contains;
        private String altra_metodica___not___contains;
        private String altra_metodica___starts_with;
        private String altra_metodica___not___starts_with;
        private String altra_metodica___ends_with;
        private String altra_metodica___not___ends_with;
        private String altra_unita_di_misura___eq;
        private String altra_unita_di_misura___ne;
        private Boolean altra_unita_di_misura___null;
        private Boolean altra_unita_di_misura___not___null;
        private java.util.List<String> altra_unita_di_misura___in;
        private java.util.List<String> altra_unita_di_misura___not___in;
        private String altra_unita_di_misura___lt;
        private String altra_unita_di_misura___lte;
        private String altra_unita_di_misura___gt;
        private String altra_unita_di_misura___gte;
        private String altra_unita_di_misura___contains;
        private String altra_unita_di_misura___not___contains;
        private String altra_unita_di_misura___starts_with;
        private String altra_unita_di_misura___not___starts_with;
        private String altra_unita_di_misura___ends_with;
        private String altra_unita_di_misura___not___ends_with;
        private String altro_genotipo___eq;
        private String altro_genotipo___ne;
        private Boolean altro_genotipo___null;
        private Boolean altro_genotipo___not___null;
        private java.util.List<String> altro_genotipo___in;
        private java.util.List<String> altro_genotipo___not___in;
        private String altro_genotipo___lt;
        private String altro_genotipo___lte;
        private String altro_genotipo___gt;
        private String altro_genotipo___gte;
        private String altro_genotipo___contains;
        private String altro_genotipo___not___contains;
        private String altro_genotipo___starts_with;
        private String altro_genotipo___not___starts_with;
        private String altro_genotipo___ends_with;
        private String altro_genotipo___not___ends_with;
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
        private String esito___eq;
        private String esito___ne;
        private Boolean esito___null;
        private Boolean esito___not___null;
        private java.util.List<String> esito___in;
        private java.util.List<String> esito___not___in;
        private String esito___lt;
        private String esito___lte;
        private String esito___gt;
        private String esito___gte;
        private String esito___contains;
        private String esito___not___contains;
        private String esito___starts_with;
        private String esito___not___starts_with;
        private String esito___ends_with;
        private String esito___not___ends_with;
        private String genotipo___eq;
        private String genotipo___ne;
        private Boolean genotipo___null;
        private Boolean genotipo___not___null;
        private java.util.List<String> genotipo___in;
        private java.util.List<String> genotipo___not___in;
        private String genotipo___lt;
        private String genotipo___lte;
        private String genotipo___gt;
        private String genotipo___gte;
        private String genotipo___contains;
        private String genotipo___not___contains;
        private String genotipo___starts_with;
        private String genotipo___not___starts_with;
        private String genotipo___ends_with;
        private String genotipo___not___ends_with;
        private Integer lower_limit___eq;
        private Integer lower_limit___ne;
        private Boolean lower_limit___null;
        private Boolean lower_limit___not___null;
        private java.util.List<Integer> lower_limit___in;
        private java.util.List<Integer> lower_limit___not___in;
        private Integer lower_limit___lt;
        private Integer lower_limit___lte;
        private Integer lower_limit___gt;
        private Integer lower_limit___gte;
        private String metodica_genoma___eq;
        private String metodica_genoma___ne;
        private Boolean metodica_genoma___null;
        private Boolean metodica_genoma___not___null;
        private java.util.List<String> metodica_genoma___in;
        private java.util.List<String> metodica_genoma___not___in;
        private String metodica_genoma___lt;
        private String metodica_genoma___lte;
        private String metodica_genoma___gt;
        private String metodica_genoma___gte;
        private String metodica_genoma___contains;
        private String metodica_genoma___not___contains;
        private String metodica_genoma___starts_with;
        private String metodica_genoma___not___starts_with;
        private String metodica_genoma___ends_with;
        private String metodica_genoma___not___ends_with;
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
        private String tipologia_test___eq;
        private String tipologia_test___ne;
        private Boolean tipologia_test___null;
        private Boolean tipologia_test___not___null;
        private java.util.List<String> tipologia_test___in;
        private java.util.List<String> tipologia_test___not___in;
        private String tipologia_test___lt;
        private String tipologia_test___lte;
        private String tipologia_test___gt;
        private String tipologia_test___gte;
        private String tipologia_test___contains;
        private String tipologia_test___not___contains;
        private String tipologia_test___starts_with;
        private String tipologia_test___not___starts_with;
        private String tipologia_test___ends_with;
        private String tipologia_test___not___ends_with;
        private String unita_di_misura___eq;
        private String unita_di_misura___ne;
        private Boolean unita_di_misura___null;
        private Boolean unita_di_misura___not___null;
        private java.util.List<String> unita_di_misura___in;
        private java.util.List<String> unita_di_misura___not___in;
        private String unita_di_misura___lt;
        private String unita_di_misura___lte;
        private String unita_di_misura___gt;
        private String unita_di_misura___gte;
        private String unita_di_misura___contains;
        private String unita_di_misura___not___contains;
        private String unita_di_misura___starts_with;
        private String unita_di_misura___not___starts_with;
        private String unita_di_misura___ends_with;
        private String unita_di_misura___not___ends_with;
        private Integer valore___eq;
        private Integer valore___ne;
        private Boolean valore___null;
        private Boolean valore___not___null;
        private java.util.List<Integer> valore___in;
        private java.util.List<Integer> valore___not___in;
        private Integer valore___lt;
        private Integer valore___lte;
        private Integer valore___gt;
        private Integer valore___gte;
        private java.util.List<CliMarkers_HCVFilterDTO> AND;
        private java.util.List<CliMarkers_HCVFilterDTO> OR;
        private CliMarkers_HCVFilterDTO NOT;

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

        public Builder setAltra_metodica___eq(String altra_metodica___eq) {
            this.altra_metodica___eq = altra_metodica___eq;
            return this;
        }

        public Builder setAltra_metodica___ne(String altra_metodica___ne) {
            this.altra_metodica___ne = altra_metodica___ne;
            return this;
        }

        public Builder setAltra_metodica___null(Boolean altra_metodica___null) {
            this.altra_metodica___null = altra_metodica___null;
            return this;
        }

        public Builder setAltra_metodica___not___null(Boolean altra_metodica___not___null) {
            this.altra_metodica___not___null = altra_metodica___not___null;
            return this;
        }

        public Builder setAltra_metodica___in(java.util.List<String> altra_metodica___in) {
            this.altra_metodica___in = altra_metodica___in;
            return this;
        }

        public Builder setAltra_metodica___not___in(java.util.List<String> altra_metodica___not___in) {
            this.altra_metodica___not___in = altra_metodica___not___in;
            return this;
        }

        public Builder setAltra_metodica___lt(String altra_metodica___lt) {
            this.altra_metodica___lt = altra_metodica___lt;
            return this;
        }

        public Builder setAltra_metodica___lte(String altra_metodica___lte) {
            this.altra_metodica___lte = altra_metodica___lte;
            return this;
        }

        public Builder setAltra_metodica___gt(String altra_metodica___gt) {
            this.altra_metodica___gt = altra_metodica___gt;
            return this;
        }

        public Builder setAltra_metodica___gte(String altra_metodica___gte) {
            this.altra_metodica___gte = altra_metodica___gte;
            return this;
        }

        public Builder setAltra_metodica___contains(String altra_metodica___contains) {
            this.altra_metodica___contains = altra_metodica___contains;
            return this;
        }

        public Builder setAltra_metodica___not___contains(String altra_metodica___not___contains) {
            this.altra_metodica___not___contains = altra_metodica___not___contains;
            return this;
        }

        public Builder setAltra_metodica___starts_with(String altra_metodica___starts_with) {
            this.altra_metodica___starts_with = altra_metodica___starts_with;
            return this;
        }

        public Builder setAltra_metodica___not___starts_with(String altra_metodica___not___starts_with) {
            this.altra_metodica___not___starts_with = altra_metodica___not___starts_with;
            return this;
        }

        public Builder setAltra_metodica___ends_with(String altra_metodica___ends_with) {
            this.altra_metodica___ends_with = altra_metodica___ends_with;
            return this;
        }

        public Builder setAltra_metodica___not___ends_with(String altra_metodica___not___ends_with) {
            this.altra_metodica___not___ends_with = altra_metodica___not___ends_with;
            return this;
        }

        public Builder setAltra_unita_di_misura___eq(String altra_unita_di_misura___eq) {
            this.altra_unita_di_misura___eq = altra_unita_di_misura___eq;
            return this;
        }

        public Builder setAltra_unita_di_misura___ne(String altra_unita_di_misura___ne) {
            this.altra_unita_di_misura___ne = altra_unita_di_misura___ne;
            return this;
        }

        public Builder setAltra_unita_di_misura___null(Boolean altra_unita_di_misura___null) {
            this.altra_unita_di_misura___null = altra_unita_di_misura___null;
            return this;
        }

        public Builder setAltra_unita_di_misura___not___null(Boolean altra_unita_di_misura___not___null) {
            this.altra_unita_di_misura___not___null = altra_unita_di_misura___not___null;
            return this;
        }

        public Builder setAltra_unita_di_misura___in(java.util.List<String> altra_unita_di_misura___in) {
            this.altra_unita_di_misura___in = altra_unita_di_misura___in;
            return this;
        }

        public Builder setAltra_unita_di_misura___not___in(java.util.List<String> altra_unita_di_misura___not___in) {
            this.altra_unita_di_misura___not___in = altra_unita_di_misura___not___in;
            return this;
        }

        public Builder setAltra_unita_di_misura___lt(String altra_unita_di_misura___lt) {
            this.altra_unita_di_misura___lt = altra_unita_di_misura___lt;
            return this;
        }

        public Builder setAltra_unita_di_misura___lte(String altra_unita_di_misura___lte) {
            this.altra_unita_di_misura___lte = altra_unita_di_misura___lte;
            return this;
        }

        public Builder setAltra_unita_di_misura___gt(String altra_unita_di_misura___gt) {
            this.altra_unita_di_misura___gt = altra_unita_di_misura___gt;
            return this;
        }

        public Builder setAltra_unita_di_misura___gte(String altra_unita_di_misura___gte) {
            this.altra_unita_di_misura___gte = altra_unita_di_misura___gte;
            return this;
        }

        public Builder setAltra_unita_di_misura___contains(String altra_unita_di_misura___contains) {
            this.altra_unita_di_misura___contains = altra_unita_di_misura___contains;
            return this;
        }

        public Builder setAltra_unita_di_misura___not___contains(String altra_unita_di_misura___not___contains) {
            this.altra_unita_di_misura___not___contains = altra_unita_di_misura___not___contains;
            return this;
        }

        public Builder setAltra_unita_di_misura___starts_with(String altra_unita_di_misura___starts_with) {
            this.altra_unita_di_misura___starts_with = altra_unita_di_misura___starts_with;
            return this;
        }

        public Builder setAltra_unita_di_misura___not___starts_with(String altra_unita_di_misura___not___starts_with) {
            this.altra_unita_di_misura___not___starts_with = altra_unita_di_misura___not___starts_with;
            return this;
        }

        public Builder setAltra_unita_di_misura___ends_with(String altra_unita_di_misura___ends_with) {
            this.altra_unita_di_misura___ends_with = altra_unita_di_misura___ends_with;
            return this;
        }

        public Builder setAltra_unita_di_misura___not___ends_with(String altra_unita_di_misura___not___ends_with) {
            this.altra_unita_di_misura___not___ends_with = altra_unita_di_misura___not___ends_with;
            return this;
        }

        public Builder setAltro_genotipo___eq(String altro_genotipo___eq) {
            this.altro_genotipo___eq = altro_genotipo___eq;
            return this;
        }

        public Builder setAltro_genotipo___ne(String altro_genotipo___ne) {
            this.altro_genotipo___ne = altro_genotipo___ne;
            return this;
        }

        public Builder setAltro_genotipo___null(Boolean altro_genotipo___null) {
            this.altro_genotipo___null = altro_genotipo___null;
            return this;
        }

        public Builder setAltro_genotipo___not___null(Boolean altro_genotipo___not___null) {
            this.altro_genotipo___not___null = altro_genotipo___not___null;
            return this;
        }

        public Builder setAltro_genotipo___in(java.util.List<String> altro_genotipo___in) {
            this.altro_genotipo___in = altro_genotipo___in;
            return this;
        }

        public Builder setAltro_genotipo___not___in(java.util.List<String> altro_genotipo___not___in) {
            this.altro_genotipo___not___in = altro_genotipo___not___in;
            return this;
        }

        public Builder setAltro_genotipo___lt(String altro_genotipo___lt) {
            this.altro_genotipo___lt = altro_genotipo___lt;
            return this;
        }

        public Builder setAltro_genotipo___lte(String altro_genotipo___lte) {
            this.altro_genotipo___lte = altro_genotipo___lte;
            return this;
        }

        public Builder setAltro_genotipo___gt(String altro_genotipo___gt) {
            this.altro_genotipo___gt = altro_genotipo___gt;
            return this;
        }

        public Builder setAltro_genotipo___gte(String altro_genotipo___gte) {
            this.altro_genotipo___gte = altro_genotipo___gte;
            return this;
        }

        public Builder setAltro_genotipo___contains(String altro_genotipo___contains) {
            this.altro_genotipo___contains = altro_genotipo___contains;
            return this;
        }

        public Builder setAltro_genotipo___not___contains(String altro_genotipo___not___contains) {
            this.altro_genotipo___not___contains = altro_genotipo___not___contains;
            return this;
        }

        public Builder setAltro_genotipo___starts_with(String altro_genotipo___starts_with) {
            this.altro_genotipo___starts_with = altro_genotipo___starts_with;
            return this;
        }

        public Builder setAltro_genotipo___not___starts_with(String altro_genotipo___not___starts_with) {
            this.altro_genotipo___not___starts_with = altro_genotipo___not___starts_with;
            return this;
        }

        public Builder setAltro_genotipo___ends_with(String altro_genotipo___ends_with) {
            this.altro_genotipo___ends_with = altro_genotipo___ends_with;
            return this;
        }

        public Builder setAltro_genotipo___not___ends_with(String altro_genotipo___not___ends_with) {
            this.altro_genotipo___not___ends_with = altro_genotipo___not___ends_with;
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

        public Builder setEsito___eq(String esito___eq) {
            this.esito___eq = esito___eq;
            return this;
        }

        public Builder setEsito___ne(String esito___ne) {
            this.esito___ne = esito___ne;
            return this;
        }

        public Builder setEsito___null(Boolean esito___null) {
            this.esito___null = esito___null;
            return this;
        }

        public Builder setEsito___not___null(Boolean esito___not___null) {
            this.esito___not___null = esito___not___null;
            return this;
        }

        public Builder setEsito___in(java.util.List<String> esito___in) {
            this.esito___in = esito___in;
            return this;
        }

        public Builder setEsito___not___in(java.util.List<String> esito___not___in) {
            this.esito___not___in = esito___not___in;
            return this;
        }

        public Builder setEsito___lt(String esito___lt) {
            this.esito___lt = esito___lt;
            return this;
        }

        public Builder setEsito___lte(String esito___lte) {
            this.esito___lte = esito___lte;
            return this;
        }

        public Builder setEsito___gt(String esito___gt) {
            this.esito___gt = esito___gt;
            return this;
        }

        public Builder setEsito___gte(String esito___gte) {
            this.esito___gte = esito___gte;
            return this;
        }

        public Builder setEsito___contains(String esito___contains) {
            this.esito___contains = esito___contains;
            return this;
        }

        public Builder setEsito___not___contains(String esito___not___contains) {
            this.esito___not___contains = esito___not___contains;
            return this;
        }

        public Builder setEsito___starts_with(String esito___starts_with) {
            this.esito___starts_with = esito___starts_with;
            return this;
        }

        public Builder setEsito___not___starts_with(String esito___not___starts_with) {
            this.esito___not___starts_with = esito___not___starts_with;
            return this;
        }

        public Builder setEsito___ends_with(String esito___ends_with) {
            this.esito___ends_with = esito___ends_with;
            return this;
        }

        public Builder setEsito___not___ends_with(String esito___not___ends_with) {
            this.esito___not___ends_with = esito___not___ends_with;
            return this;
        }

        public Builder setGenotipo___eq(String genotipo___eq) {
            this.genotipo___eq = genotipo___eq;
            return this;
        }

        public Builder setGenotipo___ne(String genotipo___ne) {
            this.genotipo___ne = genotipo___ne;
            return this;
        }

        public Builder setGenotipo___null(Boolean genotipo___null) {
            this.genotipo___null = genotipo___null;
            return this;
        }

        public Builder setGenotipo___not___null(Boolean genotipo___not___null) {
            this.genotipo___not___null = genotipo___not___null;
            return this;
        }

        public Builder setGenotipo___in(java.util.List<String> genotipo___in) {
            this.genotipo___in = genotipo___in;
            return this;
        }

        public Builder setGenotipo___not___in(java.util.List<String> genotipo___not___in) {
            this.genotipo___not___in = genotipo___not___in;
            return this;
        }

        public Builder setGenotipo___lt(String genotipo___lt) {
            this.genotipo___lt = genotipo___lt;
            return this;
        }

        public Builder setGenotipo___lte(String genotipo___lte) {
            this.genotipo___lte = genotipo___lte;
            return this;
        }

        public Builder setGenotipo___gt(String genotipo___gt) {
            this.genotipo___gt = genotipo___gt;
            return this;
        }

        public Builder setGenotipo___gte(String genotipo___gte) {
            this.genotipo___gte = genotipo___gte;
            return this;
        }

        public Builder setGenotipo___contains(String genotipo___contains) {
            this.genotipo___contains = genotipo___contains;
            return this;
        }

        public Builder setGenotipo___not___contains(String genotipo___not___contains) {
            this.genotipo___not___contains = genotipo___not___contains;
            return this;
        }

        public Builder setGenotipo___starts_with(String genotipo___starts_with) {
            this.genotipo___starts_with = genotipo___starts_with;
            return this;
        }

        public Builder setGenotipo___not___starts_with(String genotipo___not___starts_with) {
            this.genotipo___not___starts_with = genotipo___not___starts_with;
            return this;
        }

        public Builder setGenotipo___ends_with(String genotipo___ends_with) {
            this.genotipo___ends_with = genotipo___ends_with;
            return this;
        }

        public Builder setGenotipo___not___ends_with(String genotipo___not___ends_with) {
            this.genotipo___not___ends_with = genotipo___not___ends_with;
            return this;
        }

        public Builder setLower_limit___eq(Integer lower_limit___eq) {
            this.lower_limit___eq = lower_limit___eq;
            return this;
        }

        public Builder setLower_limit___ne(Integer lower_limit___ne) {
            this.lower_limit___ne = lower_limit___ne;
            return this;
        }

        public Builder setLower_limit___null(Boolean lower_limit___null) {
            this.lower_limit___null = lower_limit___null;
            return this;
        }

        public Builder setLower_limit___not___null(Boolean lower_limit___not___null) {
            this.lower_limit___not___null = lower_limit___not___null;
            return this;
        }

        public Builder setLower_limit___in(java.util.List<Integer> lower_limit___in) {
            this.lower_limit___in = lower_limit___in;
            return this;
        }

        public Builder setLower_limit___not___in(java.util.List<Integer> lower_limit___not___in) {
            this.lower_limit___not___in = lower_limit___not___in;
            return this;
        }

        public Builder setLower_limit___lt(Integer lower_limit___lt) {
            this.lower_limit___lt = lower_limit___lt;
            return this;
        }

        public Builder setLower_limit___lte(Integer lower_limit___lte) {
            this.lower_limit___lte = lower_limit___lte;
            return this;
        }

        public Builder setLower_limit___gt(Integer lower_limit___gt) {
            this.lower_limit___gt = lower_limit___gt;
            return this;
        }

        public Builder setLower_limit___gte(Integer lower_limit___gte) {
            this.lower_limit___gte = lower_limit___gte;
            return this;
        }

        public Builder setMetodica_genoma___eq(String metodica_genoma___eq) {
            this.metodica_genoma___eq = metodica_genoma___eq;
            return this;
        }

        public Builder setMetodica_genoma___ne(String metodica_genoma___ne) {
            this.metodica_genoma___ne = metodica_genoma___ne;
            return this;
        }

        public Builder setMetodica_genoma___null(Boolean metodica_genoma___null) {
            this.metodica_genoma___null = metodica_genoma___null;
            return this;
        }

        public Builder setMetodica_genoma___not___null(Boolean metodica_genoma___not___null) {
            this.metodica_genoma___not___null = metodica_genoma___not___null;
            return this;
        }

        public Builder setMetodica_genoma___in(java.util.List<String> metodica_genoma___in) {
            this.metodica_genoma___in = metodica_genoma___in;
            return this;
        }

        public Builder setMetodica_genoma___not___in(java.util.List<String> metodica_genoma___not___in) {
            this.metodica_genoma___not___in = metodica_genoma___not___in;
            return this;
        }

        public Builder setMetodica_genoma___lt(String metodica_genoma___lt) {
            this.metodica_genoma___lt = metodica_genoma___lt;
            return this;
        }

        public Builder setMetodica_genoma___lte(String metodica_genoma___lte) {
            this.metodica_genoma___lte = metodica_genoma___lte;
            return this;
        }

        public Builder setMetodica_genoma___gt(String metodica_genoma___gt) {
            this.metodica_genoma___gt = metodica_genoma___gt;
            return this;
        }

        public Builder setMetodica_genoma___gte(String metodica_genoma___gte) {
            this.metodica_genoma___gte = metodica_genoma___gte;
            return this;
        }

        public Builder setMetodica_genoma___contains(String metodica_genoma___contains) {
            this.metodica_genoma___contains = metodica_genoma___contains;
            return this;
        }

        public Builder setMetodica_genoma___not___contains(String metodica_genoma___not___contains) {
            this.metodica_genoma___not___contains = metodica_genoma___not___contains;
            return this;
        }

        public Builder setMetodica_genoma___starts_with(String metodica_genoma___starts_with) {
            this.metodica_genoma___starts_with = metodica_genoma___starts_with;
            return this;
        }

        public Builder setMetodica_genoma___not___starts_with(String metodica_genoma___not___starts_with) {
            this.metodica_genoma___not___starts_with = metodica_genoma___not___starts_with;
            return this;
        }

        public Builder setMetodica_genoma___ends_with(String metodica_genoma___ends_with) {
            this.metodica_genoma___ends_with = metodica_genoma___ends_with;
            return this;
        }

        public Builder setMetodica_genoma___not___ends_with(String metodica_genoma___not___ends_with) {
            this.metodica_genoma___not___ends_with = metodica_genoma___not___ends_with;
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

        public Builder setTipologia_test___eq(String tipologia_test___eq) {
            this.tipologia_test___eq = tipologia_test___eq;
            return this;
        }

        public Builder setTipologia_test___ne(String tipologia_test___ne) {
            this.tipologia_test___ne = tipologia_test___ne;
            return this;
        }

        public Builder setTipologia_test___null(Boolean tipologia_test___null) {
            this.tipologia_test___null = tipologia_test___null;
            return this;
        }

        public Builder setTipologia_test___not___null(Boolean tipologia_test___not___null) {
            this.tipologia_test___not___null = tipologia_test___not___null;
            return this;
        }

        public Builder setTipologia_test___in(java.util.List<String> tipologia_test___in) {
            this.tipologia_test___in = tipologia_test___in;
            return this;
        }

        public Builder setTipologia_test___not___in(java.util.List<String> tipologia_test___not___in) {
            this.tipologia_test___not___in = tipologia_test___not___in;
            return this;
        }

        public Builder setTipologia_test___lt(String tipologia_test___lt) {
            this.tipologia_test___lt = tipologia_test___lt;
            return this;
        }

        public Builder setTipologia_test___lte(String tipologia_test___lte) {
            this.tipologia_test___lte = tipologia_test___lte;
            return this;
        }

        public Builder setTipologia_test___gt(String tipologia_test___gt) {
            this.tipologia_test___gt = tipologia_test___gt;
            return this;
        }

        public Builder setTipologia_test___gte(String tipologia_test___gte) {
            this.tipologia_test___gte = tipologia_test___gte;
            return this;
        }

        public Builder setTipologia_test___contains(String tipologia_test___contains) {
            this.tipologia_test___contains = tipologia_test___contains;
            return this;
        }

        public Builder setTipologia_test___not___contains(String tipologia_test___not___contains) {
            this.tipologia_test___not___contains = tipologia_test___not___contains;
            return this;
        }

        public Builder setTipologia_test___starts_with(String tipologia_test___starts_with) {
            this.tipologia_test___starts_with = tipologia_test___starts_with;
            return this;
        }

        public Builder setTipologia_test___not___starts_with(String tipologia_test___not___starts_with) {
            this.tipologia_test___not___starts_with = tipologia_test___not___starts_with;
            return this;
        }

        public Builder setTipologia_test___ends_with(String tipologia_test___ends_with) {
            this.tipologia_test___ends_with = tipologia_test___ends_with;
            return this;
        }

        public Builder setTipologia_test___not___ends_with(String tipologia_test___not___ends_with) {
            this.tipologia_test___not___ends_with = tipologia_test___not___ends_with;
            return this;
        }

        public Builder setUnita_di_misura___eq(String unita_di_misura___eq) {
            this.unita_di_misura___eq = unita_di_misura___eq;
            return this;
        }

        public Builder setUnita_di_misura___ne(String unita_di_misura___ne) {
            this.unita_di_misura___ne = unita_di_misura___ne;
            return this;
        }

        public Builder setUnita_di_misura___null(Boolean unita_di_misura___null) {
            this.unita_di_misura___null = unita_di_misura___null;
            return this;
        }

        public Builder setUnita_di_misura___not___null(Boolean unita_di_misura___not___null) {
            this.unita_di_misura___not___null = unita_di_misura___not___null;
            return this;
        }

        public Builder setUnita_di_misura___in(java.util.List<String> unita_di_misura___in) {
            this.unita_di_misura___in = unita_di_misura___in;
            return this;
        }

        public Builder setUnita_di_misura___not___in(java.util.List<String> unita_di_misura___not___in) {
            this.unita_di_misura___not___in = unita_di_misura___not___in;
            return this;
        }

        public Builder setUnita_di_misura___lt(String unita_di_misura___lt) {
            this.unita_di_misura___lt = unita_di_misura___lt;
            return this;
        }

        public Builder setUnita_di_misura___lte(String unita_di_misura___lte) {
            this.unita_di_misura___lte = unita_di_misura___lte;
            return this;
        }

        public Builder setUnita_di_misura___gt(String unita_di_misura___gt) {
            this.unita_di_misura___gt = unita_di_misura___gt;
            return this;
        }

        public Builder setUnita_di_misura___gte(String unita_di_misura___gte) {
            this.unita_di_misura___gte = unita_di_misura___gte;
            return this;
        }

        public Builder setUnita_di_misura___contains(String unita_di_misura___contains) {
            this.unita_di_misura___contains = unita_di_misura___contains;
            return this;
        }

        public Builder setUnita_di_misura___not___contains(String unita_di_misura___not___contains) {
            this.unita_di_misura___not___contains = unita_di_misura___not___contains;
            return this;
        }

        public Builder setUnita_di_misura___starts_with(String unita_di_misura___starts_with) {
            this.unita_di_misura___starts_with = unita_di_misura___starts_with;
            return this;
        }

        public Builder setUnita_di_misura___not___starts_with(String unita_di_misura___not___starts_with) {
            this.unita_di_misura___not___starts_with = unita_di_misura___not___starts_with;
            return this;
        }

        public Builder setUnita_di_misura___ends_with(String unita_di_misura___ends_with) {
            this.unita_di_misura___ends_with = unita_di_misura___ends_with;
            return this;
        }

        public Builder setUnita_di_misura___not___ends_with(String unita_di_misura___not___ends_with) {
            this.unita_di_misura___not___ends_with = unita_di_misura___not___ends_with;
            return this;
        }

        public Builder setValore___eq(Integer valore___eq) {
            this.valore___eq = valore___eq;
            return this;
        }

        public Builder setValore___ne(Integer valore___ne) {
            this.valore___ne = valore___ne;
            return this;
        }

        public Builder setValore___null(Boolean valore___null) {
            this.valore___null = valore___null;
            return this;
        }

        public Builder setValore___not___null(Boolean valore___not___null) {
            this.valore___not___null = valore___not___null;
            return this;
        }

        public Builder setValore___in(java.util.List<Integer> valore___in) {
            this.valore___in = valore___in;
            return this;
        }

        public Builder setValore___not___in(java.util.List<Integer> valore___not___in) {
            this.valore___not___in = valore___not___in;
            return this;
        }

        public Builder setValore___lt(Integer valore___lt) {
            this.valore___lt = valore___lt;
            return this;
        }

        public Builder setValore___lte(Integer valore___lte) {
            this.valore___lte = valore___lte;
            return this;
        }

        public Builder setValore___gt(Integer valore___gt) {
            this.valore___gt = valore___gt;
            return this;
        }

        public Builder setValore___gte(Integer valore___gte) {
            this.valore___gte = valore___gte;
            return this;
        }

        public Builder setAND(java.util.List<CliMarkers_HCVFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliMarkers_HCVFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliMarkers_HCVFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliMarkers_HCVFilterDTO build() {
            CliMarkers_HCVFilterDTO result = new CliMarkers_HCVFilterDTO();
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
            result.setAltra_metodica___eq(this.altra_metodica___eq);
            result.setAltra_metodica___ne(this.altra_metodica___ne);
            result.setAltra_metodica___null(this.altra_metodica___null);
            result.setAltra_metodica___not___null(this.altra_metodica___not___null);
            result.setAltra_metodica___in(this.altra_metodica___in);
            result.setAltra_metodica___not___in(this.altra_metodica___not___in);
            result.setAltra_metodica___lt(this.altra_metodica___lt);
            result.setAltra_metodica___lte(this.altra_metodica___lte);
            result.setAltra_metodica___gt(this.altra_metodica___gt);
            result.setAltra_metodica___gte(this.altra_metodica___gte);
            result.setAltra_metodica___contains(this.altra_metodica___contains);
            result.setAltra_metodica___not___contains(this.altra_metodica___not___contains);
            result.setAltra_metodica___starts_with(this.altra_metodica___starts_with);
            result.setAltra_metodica___not___starts_with(this.altra_metodica___not___starts_with);
            result.setAltra_metodica___ends_with(this.altra_metodica___ends_with);
            result.setAltra_metodica___not___ends_with(this.altra_metodica___not___ends_with);
            result.setAltra_unita_di_misura___eq(this.altra_unita_di_misura___eq);
            result.setAltra_unita_di_misura___ne(this.altra_unita_di_misura___ne);
            result.setAltra_unita_di_misura___null(this.altra_unita_di_misura___null);
            result.setAltra_unita_di_misura___not___null(this.altra_unita_di_misura___not___null);
            result.setAltra_unita_di_misura___in(this.altra_unita_di_misura___in);
            result.setAltra_unita_di_misura___not___in(this.altra_unita_di_misura___not___in);
            result.setAltra_unita_di_misura___lt(this.altra_unita_di_misura___lt);
            result.setAltra_unita_di_misura___lte(this.altra_unita_di_misura___lte);
            result.setAltra_unita_di_misura___gt(this.altra_unita_di_misura___gt);
            result.setAltra_unita_di_misura___gte(this.altra_unita_di_misura___gte);
            result.setAltra_unita_di_misura___contains(this.altra_unita_di_misura___contains);
            result.setAltra_unita_di_misura___not___contains(this.altra_unita_di_misura___not___contains);
            result.setAltra_unita_di_misura___starts_with(this.altra_unita_di_misura___starts_with);
            result.setAltra_unita_di_misura___not___starts_with(this.altra_unita_di_misura___not___starts_with);
            result.setAltra_unita_di_misura___ends_with(this.altra_unita_di_misura___ends_with);
            result.setAltra_unita_di_misura___not___ends_with(this.altra_unita_di_misura___not___ends_with);
            result.setAltro_genotipo___eq(this.altro_genotipo___eq);
            result.setAltro_genotipo___ne(this.altro_genotipo___ne);
            result.setAltro_genotipo___null(this.altro_genotipo___null);
            result.setAltro_genotipo___not___null(this.altro_genotipo___not___null);
            result.setAltro_genotipo___in(this.altro_genotipo___in);
            result.setAltro_genotipo___not___in(this.altro_genotipo___not___in);
            result.setAltro_genotipo___lt(this.altro_genotipo___lt);
            result.setAltro_genotipo___lte(this.altro_genotipo___lte);
            result.setAltro_genotipo___gt(this.altro_genotipo___gt);
            result.setAltro_genotipo___gte(this.altro_genotipo___gte);
            result.setAltro_genotipo___contains(this.altro_genotipo___contains);
            result.setAltro_genotipo___not___contains(this.altro_genotipo___not___contains);
            result.setAltro_genotipo___starts_with(this.altro_genotipo___starts_with);
            result.setAltro_genotipo___not___starts_with(this.altro_genotipo___not___starts_with);
            result.setAltro_genotipo___ends_with(this.altro_genotipo___ends_with);
            result.setAltro_genotipo___not___ends_with(this.altro_genotipo___not___ends_with);
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
            result.setEsito___eq(this.esito___eq);
            result.setEsito___ne(this.esito___ne);
            result.setEsito___null(this.esito___null);
            result.setEsito___not___null(this.esito___not___null);
            result.setEsito___in(this.esito___in);
            result.setEsito___not___in(this.esito___not___in);
            result.setEsito___lt(this.esito___lt);
            result.setEsito___lte(this.esito___lte);
            result.setEsito___gt(this.esito___gt);
            result.setEsito___gte(this.esito___gte);
            result.setEsito___contains(this.esito___contains);
            result.setEsito___not___contains(this.esito___not___contains);
            result.setEsito___starts_with(this.esito___starts_with);
            result.setEsito___not___starts_with(this.esito___not___starts_with);
            result.setEsito___ends_with(this.esito___ends_with);
            result.setEsito___not___ends_with(this.esito___not___ends_with);
            result.setGenotipo___eq(this.genotipo___eq);
            result.setGenotipo___ne(this.genotipo___ne);
            result.setGenotipo___null(this.genotipo___null);
            result.setGenotipo___not___null(this.genotipo___not___null);
            result.setGenotipo___in(this.genotipo___in);
            result.setGenotipo___not___in(this.genotipo___not___in);
            result.setGenotipo___lt(this.genotipo___lt);
            result.setGenotipo___lte(this.genotipo___lte);
            result.setGenotipo___gt(this.genotipo___gt);
            result.setGenotipo___gte(this.genotipo___gte);
            result.setGenotipo___contains(this.genotipo___contains);
            result.setGenotipo___not___contains(this.genotipo___not___contains);
            result.setGenotipo___starts_with(this.genotipo___starts_with);
            result.setGenotipo___not___starts_with(this.genotipo___not___starts_with);
            result.setGenotipo___ends_with(this.genotipo___ends_with);
            result.setGenotipo___not___ends_with(this.genotipo___not___ends_with);
            result.setLower_limit___eq(this.lower_limit___eq);
            result.setLower_limit___ne(this.lower_limit___ne);
            result.setLower_limit___null(this.lower_limit___null);
            result.setLower_limit___not___null(this.lower_limit___not___null);
            result.setLower_limit___in(this.lower_limit___in);
            result.setLower_limit___not___in(this.lower_limit___not___in);
            result.setLower_limit___lt(this.lower_limit___lt);
            result.setLower_limit___lte(this.lower_limit___lte);
            result.setLower_limit___gt(this.lower_limit___gt);
            result.setLower_limit___gte(this.lower_limit___gte);
            result.setMetodica_genoma___eq(this.metodica_genoma___eq);
            result.setMetodica_genoma___ne(this.metodica_genoma___ne);
            result.setMetodica_genoma___null(this.metodica_genoma___null);
            result.setMetodica_genoma___not___null(this.metodica_genoma___not___null);
            result.setMetodica_genoma___in(this.metodica_genoma___in);
            result.setMetodica_genoma___not___in(this.metodica_genoma___not___in);
            result.setMetodica_genoma___lt(this.metodica_genoma___lt);
            result.setMetodica_genoma___lte(this.metodica_genoma___lte);
            result.setMetodica_genoma___gt(this.metodica_genoma___gt);
            result.setMetodica_genoma___gte(this.metodica_genoma___gte);
            result.setMetodica_genoma___contains(this.metodica_genoma___contains);
            result.setMetodica_genoma___not___contains(this.metodica_genoma___not___contains);
            result.setMetodica_genoma___starts_with(this.metodica_genoma___starts_with);
            result.setMetodica_genoma___not___starts_with(this.metodica_genoma___not___starts_with);
            result.setMetodica_genoma___ends_with(this.metodica_genoma___ends_with);
            result.setMetodica_genoma___not___ends_with(this.metodica_genoma___not___ends_with);
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
            result.setTipologia_test___eq(this.tipologia_test___eq);
            result.setTipologia_test___ne(this.tipologia_test___ne);
            result.setTipologia_test___null(this.tipologia_test___null);
            result.setTipologia_test___not___null(this.tipologia_test___not___null);
            result.setTipologia_test___in(this.tipologia_test___in);
            result.setTipologia_test___not___in(this.tipologia_test___not___in);
            result.setTipologia_test___lt(this.tipologia_test___lt);
            result.setTipologia_test___lte(this.tipologia_test___lte);
            result.setTipologia_test___gt(this.tipologia_test___gt);
            result.setTipologia_test___gte(this.tipologia_test___gte);
            result.setTipologia_test___contains(this.tipologia_test___contains);
            result.setTipologia_test___not___contains(this.tipologia_test___not___contains);
            result.setTipologia_test___starts_with(this.tipologia_test___starts_with);
            result.setTipologia_test___not___starts_with(this.tipologia_test___not___starts_with);
            result.setTipologia_test___ends_with(this.tipologia_test___ends_with);
            result.setTipologia_test___not___ends_with(this.tipologia_test___not___ends_with);
            result.setUnita_di_misura___eq(this.unita_di_misura___eq);
            result.setUnita_di_misura___ne(this.unita_di_misura___ne);
            result.setUnita_di_misura___null(this.unita_di_misura___null);
            result.setUnita_di_misura___not___null(this.unita_di_misura___not___null);
            result.setUnita_di_misura___in(this.unita_di_misura___in);
            result.setUnita_di_misura___not___in(this.unita_di_misura___not___in);
            result.setUnita_di_misura___lt(this.unita_di_misura___lt);
            result.setUnita_di_misura___lte(this.unita_di_misura___lte);
            result.setUnita_di_misura___gt(this.unita_di_misura___gt);
            result.setUnita_di_misura___gte(this.unita_di_misura___gte);
            result.setUnita_di_misura___contains(this.unita_di_misura___contains);
            result.setUnita_di_misura___not___contains(this.unita_di_misura___not___contains);
            result.setUnita_di_misura___starts_with(this.unita_di_misura___starts_with);
            result.setUnita_di_misura___not___starts_with(this.unita_di_misura___not___starts_with);
            result.setUnita_di_misura___ends_with(this.unita_di_misura___ends_with);
            result.setUnita_di_misura___not___ends_with(this.unita_di_misura___not___ends_with);
            result.setValore___eq(this.valore___eq);
            result.setValore___ne(this.valore___ne);
            result.setValore___null(this.valore___null);
            result.setValore___not___null(this.valore___not___null);
            result.setValore___in(this.valore___in);
            result.setValore___not___in(this.valore___not___in);
            result.setValore___lt(this.valore___lt);
            result.setValore___lte(this.valore___lte);
            result.setValore___gt(this.valore___gt);
            result.setValore___gte(this.valore___gte);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
