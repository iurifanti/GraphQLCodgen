package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Markers_HIV.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMarkers_HIVFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
    private String FPR___eq;
    private String FPR___ne;
    private Boolean FPR___null;
    private Boolean FPR___not___null;
    private java.util.List<String> FPR___in;
    private java.util.List<String> FPR___not___in;
    private String FPR___lt;
    private String FPR___lte;
    private String FPR___gt;
    private String FPR___gte;
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
    private Boolean geno2pheno___eq;
    private Boolean geno2pheno___ne;
    private Boolean geno2pheno___null;
    private Boolean geno2pheno___not___null;
    private Integer hivrna___eq;
    private Integer hivrna___ne;
    private Boolean hivrna___null;
    private Boolean hivrna___not___null;
    private java.util.List<Integer> hivrna___in;
    private java.util.List<Integer> hivrna___not___in;
    private Integer hivrna___lt;
    private Integer hivrna___lte;
    private Integer hivrna___gt;
    private Integer hivrna___gte;
    private String hivrna_segno___eq;
    private String hivrna_segno___ne;
    private Boolean hivrna_segno___null;
    private Boolean hivrna_segno___not___null;
    private java.util.List<String> hivrna_segno___in;
    private java.util.List<String> hivrna_segno___not___in;
    private String hivrna_segno___lt;
    private String hivrna_segno___lte;
    private String hivrna_segno___gt;
    private String hivrna_segno___gte;
    private String hivrna_segno___contains;
    private String hivrna_segno___not___contains;
    private String hivrna_segno___starts_with;
    private String hivrna_segno___not___starts_with;
    private String hivrna_segno___ends_with;
    private String hivrna_segno___not___ends_with;
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
    private String metodica___eq;
    private String metodica___ne;
    private Boolean metodica___null;
    private Boolean metodica___not___null;
    private java.util.List<String> metodica___in;
    private java.util.List<String> metodica___not___in;
    private String metodica___lt;
    private String metodica___lte;
    private String metodica___gt;
    private String metodica___gte;
    private String metodica___contains;
    private String metodica___not___contains;
    private String metodica___starts_with;
    private String metodica___not___starts_with;
    private String metodica___ends_with;
    private String metodica___not___ends_with;
    private Integer nr_CD4___eq;
    private Integer nr_CD4___ne;
    private Boolean nr_CD4___null;
    private Boolean nr_CD4___not___null;
    private java.util.List<Integer> nr_CD4___in;
    private java.util.List<Integer> nr_CD4___not___in;
    private Integer nr_CD4___lt;
    private Integer nr_CD4___lte;
    private Integer nr_CD4___gt;
    private Integer nr_CD4___gte;
    private Integer nr_CD8___eq;
    private Integer nr_CD8___ne;
    private Boolean nr_CD8___null;
    private Boolean nr_CD8___not___null;
    private java.util.List<Integer> nr_CD8___in;
    private java.util.List<Integer> nr_CD8___not___in;
    private Integer nr_CD8___lt;
    private Integer nr_CD8___lte;
    private Integer nr_CD8___gt;
    private Integer nr_CD8___gte;
    private Integer nr_linfociti___eq;
    private Integer nr_linfociti___ne;
    private Boolean nr_linfociti___null;
    private Boolean nr_linfociti___not___null;
    private java.util.List<Integer> nr_linfociti___in;
    private java.util.List<Integer> nr_linfociti___not___in;
    private Integer nr_linfociti___lt;
    private Integer nr_linfociti___lte;
    private Integer nr_linfociti___gt;
    private Integer nr_linfociti___gte;
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
    private String perc_CD4___eq;
    private String perc_CD4___ne;
    private Boolean perc_CD4___null;
    private Boolean perc_CD4___not___null;
    private java.util.List<String> perc_CD4___in;
    private java.util.List<String> perc_CD4___not___in;
    private String perc_CD4___lt;
    private String perc_CD4___lte;
    private String perc_CD4___gt;
    private String perc_CD4___gte;
    private String perc_CD8___eq;
    private String perc_CD8___ne;
    private Boolean perc_CD8___null;
    private Boolean perc_CD8___not___null;
    private java.util.List<String> perc_CD8___in;
    private java.util.List<String> perc_CD8___not___in;
    private String perc_CD8___lt;
    private String perc_CD8___lte;
    private String perc_CD8___gt;
    private String perc_CD8___gte;
    private String tropismo___eq;
    private String tropismo___ne;
    private Boolean tropismo___null;
    private Boolean tropismo___not___null;
    private java.util.List<String> tropismo___in;
    private java.util.List<String> tropismo___not___in;
    private String tropismo___lt;
    private String tropismo___lte;
    private String tropismo___gt;
    private String tropismo___gte;
    private String tropismo___contains;
    private String tropismo___not___contains;
    private String tropismo___starts_with;
    private String tropismo___not___starts_with;
    private String tropismo___ends_with;
    private String tropismo___not___ends_with;
    private java.util.List<CliMarkers_HIVFilterDTO> AND;
    private java.util.List<CliMarkers_HIVFilterDTO> OR;
    private CliMarkers_HIVFilterDTO NOT;

    public CliMarkers_HIVFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
    }

    public String getFPR___eq() {
        return FPR___eq;
    }
    public void setFPR___eq(String FPR___eq) {
        this.FPR___eq = FPR___eq;
    }

    public String getFPR___ne() {
        return FPR___ne;
    }
    public void setFPR___ne(String FPR___ne) {
        this.FPR___ne = FPR___ne;
    }

    public Boolean getFPR___null() {
        return FPR___null;
    }
    public void setFPR___null(Boolean FPR___null) {
        this.FPR___null = FPR___null;
    }

    public Boolean getFPR___not___null() {
        return FPR___not___null;
    }
    public void setFPR___not___null(Boolean FPR___not___null) {
        this.FPR___not___null = FPR___not___null;
    }

    public java.util.List<String> getFPR___in() {
        return FPR___in;
    }
    public void setFPR___in(java.util.List<String> FPR___in) {
        this.FPR___in = FPR___in;
    }

    public java.util.List<String> getFPR___not___in() {
        return FPR___not___in;
    }
    public void setFPR___not___in(java.util.List<String> FPR___not___in) {
        this.FPR___not___in = FPR___not___in;
    }

    public String getFPR___lt() {
        return FPR___lt;
    }
    public void setFPR___lt(String FPR___lt) {
        this.FPR___lt = FPR___lt;
    }

    public String getFPR___lte() {
        return FPR___lte;
    }
    public void setFPR___lte(String FPR___lte) {
        this.FPR___lte = FPR___lte;
    }

    public String getFPR___gt() {
        return FPR___gt;
    }
    public void setFPR___gt(String FPR___gt) {
        this.FPR___gt = FPR___gt;
    }

    public String getFPR___gte() {
        return FPR___gte;
    }
    public void setFPR___gte(String FPR___gte) {
        this.FPR___gte = FPR___gte;
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

    public Boolean getGeno2pheno___eq() {
        return geno2pheno___eq;
    }
    public void setGeno2pheno___eq(Boolean geno2pheno___eq) {
        this.geno2pheno___eq = geno2pheno___eq;
    }

    public Boolean getGeno2pheno___ne() {
        return geno2pheno___ne;
    }
    public void setGeno2pheno___ne(Boolean geno2pheno___ne) {
        this.geno2pheno___ne = geno2pheno___ne;
    }

    public Boolean getGeno2pheno___null() {
        return geno2pheno___null;
    }
    public void setGeno2pheno___null(Boolean geno2pheno___null) {
        this.geno2pheno___null = geno2pheno___null;
    }

    public Boolean getGeno2pheno___not___null() {
        return geno2pheno___not___null;
    }
    public void setGeno2pheno___not___null(Boolean geno2pheno___not___null) {
        this.geno2pheno___not___null = geno2pheno___not___null;
    }

    public Integer getHivrna___eq() {
        return hivrna___eq;
    }
    public void setHivrna___eq(Integer hivrna___eq) {
        this.hivrna___eq = hivrna___eq;
    }

    public Integer getHivrna___ne() {
        return hivrna___ne;
    }
    public void setHivrna___ne(Integer hivrna___ne) {
        this.hivrna___ne = hivrna___ne;
    }

    public Boolean getHivrna___null() {
        return hivrna___null;
    }
    public void setHivrna___null(Boolean hivrna___null) {
        this.hivrna___null = hivrna___null;
    }

    public Boolean getHivrna___not___null() {
        return hivrna___not___null;
    }
    public void setHivrna___not___null(Boolean hivrna___not___null) {
        this.hivrna___not___null = hivrna___not___null;
    }

    public java.util.List<Integer> getHivrna___in() {
        return hivrna___in;
    }
    public void setHivrna___in(java.util.List<Integer> hivrna___in) {
        this.hivrna___in = hivrna___in;
    }

    public java.util.List<Integer> getHivrna___not___in() {
        return hivrna___not___in;
    }
    public void setHivrna___not___in(java.util.List<Integer> hivrna___not___in) {
        this.hivrna___not___in = hivrna___not___in;
    }

    public Integer getHivrna___lt() {
        return hivrna___lt;
    }
    public void setHivrna___lt(Integer hivrna___lt) {
        this.hivrna___lt = hivrna___lt;
    }

    public Integer getHivrna___lte() {
        return hivrna___lte;
    }
    public void setHivrna___lte(Integer hivrna___lte) {
        this.hivrna___lte = hivrna___lte;
    }

    public Integer getHivrna___gt() {
        return hivrna___gt;
    }
    public void setHivrna___gt(Integer hivrna___gt) {
        this.hivrna___gt = hivrna___gt;
    }

    public Integer getHivrna___gte() {
        return hivrna___gte;
    }
    public void setHivrna___gte(Integer hivrna___gte) {
        this.hivrna___gte = hivrna___gte;
    }

    public String getHivrna_segno___eq() {
        return hivrna_segno___eq;
    }
    public void setHivrna_segno___eq(String hivrna_segno___eq) {
        this.hivrna_segno___eq = hivrna_segno___eq;
    }

    public String getHivrna_segno___ne() {
        return hivrna_segno___ne;
    }
    public void setHivrna_segno___ne(String hivrna_segno___ne) {
        this.hivrna_segno___ne = hivrna_segno___ne;
    }

    public Boolean getHivrna_segno___null() {
        return hivrna_segno___null;
    }
    public void setHivrna_segno___null(Boolean hivrna_segno___null) {
        this.hivrna_segno___null = hivrna_segno___null;
    }

    public Boolean getHivrna_segno___not___null() {
        return hivrna_segno___not___null;
    }
    public void setHivrna_segno___not___null(Boolean hivrna_segno___not___null) {
        this.hivrna_segno___not___null = hivrna_segno___not___null;
    }

    public java.util.List<String> getHivrna_segno___in() {
        return hivrna_segno___in;
    }
    public void setHivrna_segno___in(java.util.List<String> hivrna_segno___in) {
        this.hivrna_segno___in = hivrna_segno___in;
    }

    public java.util.List<String> getHivrna_segno___not___in() {
        return hivrna_segno___not___in;
    }
    public void setHivrna_segno___not___in(java.util.List<String> hivrna_segno___not___in) {
        this.hivrna_segno___not___in = hivrna_segno___not___in;
    }

    public String getHivrna_segno___lt() {
        return hivrna_segno___lt;
    }
    public void setHivrna_segno___lt(String hivrna_segno___lt) {
        this.hivrna_segno___lt = hivrna_segno___lt;
    }

    public String getHivrna_segno___lte() {
        return hivrna_segno___lte;
    }
    public void setHivrna_segno___lte(String hivrna_segno___lte) {
        this.hivrna_segno___lte = hivrna_segno___lte;
    }

    public String getHivrna_segno___gt() {
        return hivrna_segno___gt;
    }
    public void setHivrna_segno___gt(String hivrna_segno___gt) {
        this.hivrna_segno___gt = hivrna_segno___gt;
    }

    public String getHivrna_segno___gte() {
        return hivrna_segno___gte;
    }
    public void setHivrna_segno___gte(String hivrna_segno___gte) {
        this.hivrna_segno___gte = hivrna_segno___gte;
    }

    public String getHivrna_segno___contains() {
        return hivrna_segno___contains;
    }
    public void setHivrna_segno___contains(String hivrna_segno___contains) {
        this.hivrna_segno___contains = hivrna_segno___contains;
    }

    public String getHivrna_segno___not___contains() {
        return hivrna_segno___not___contains;
    }
    public void setHivrna_segno___not___contains(String hivrna_segno___not___contains) {
        this.hivrna_segno___not___contains = hivrna_segno___not___contains;
    }

    public String getHivrna_segno___starts_with() {
        return hivrna_segno___starts_with;
    }
    public void setHivrna_segno___starts_with(String hivrna_segno___starts_with) {
        this.hivrna_segno___starts_with = hivrna_segno___starts_with;
    }

    public String getHivrna_segno___not___starts_with() {
        return hivrna_segno___not___starts_with;
    }
    public void setHivrna_segno___not___starts_with(String hivrna_segno___not___starts_with) {
        this.hivrna_segno___not___starts_with = hivrna_segno___not___starts_with;
    }

    public String getHivrna_segno___ends_with() {
        return hivrna_segno___ends_with;
    }
    public void setHivrna_segno___ends_with(String hivrna_segno___ends_with) {
        this.hivrna_segno___ends_with = hivrna_segno___ends_with;
    }

    public String getHivrna_segno___not___ends_with() {
        return hivrna_segno___not___ends_with;
    }
    public void setHivrna_segno___not___ends_with(String hivrna_segno___not___ends_with) {
        this.hivrna_segno___not___ends_with = hivrna_segno___not___ends_with;
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

    public String getMetodica___eq() {
        return metodica___eq;
    }
    public void setMetodica___eq(String metodica___eq) {
        this.metodica___eq = metodica___eq;
    }

    public String getMetodica___ne() {
        return metodica___ne;
    }
    public void setMetodica___ne(String metodica___ne) {
        this.metodica___ne = metodica___ne;
    }

    public Boolean getMetodica___null() {
        return metodica___null;
    }
    public void setMetodica___null(Boolean metodica___null) {
        this.metodica___null = metodica___null;
    }

    public Boolean getMetodica___not___null() {
        return metodica___not___null;
    }
    public void setMetodica___not___null(Boolean metodica___not___null) {
        this.metodica___not___null = metodica___not___null;
    }

    public java.util.List<String> getMetodica___in() {
        return metodica___in;
    }
    public void setMetodica___in(java.util.List<String> metodica___in) {
        this.metodica___in = metodica___in;
    }

    public java.util.List<String> getMetodica___not___in() {
        return metodica___not___in;
    }
    public void setMetodica___not___in(java.util.List<String> metodica___not___in) {
        this.metodica___not___in = metodica___not___in;
    }

    public String getMetodica___lt() {
        return metodica___lt;
    }
    public void setMetodica___lt(String metodica___lt) {
        this.metodica___lt = metodica___lt;
    }

    public String getMetodica___lte() {
        return metodica___lte;
    }
    public void setMetodica___lte(String metodica___lte) {
        this.metodica___lte = metodica___lte;
    }

    public String getMetodica___gt() {
        return metodica___gt;
    }
    public void setMetodica___gt(String metodica___gt) {
        this.metodica___gt = metodica___gt;
    }

    public String getMetodica___gte() {
        return metodica___gte;
    }
    public void setMetodica___gte(String metodica___gte) {
        this.metodica___gte = metodica___gte;
    }

    public String getMetodica___contains() {
        return metodica___contains;
    }
    public void setMetodica___contains(String metodica___contains) {
        this.metodica___contains = metodica___contains;
    }

    public String getMetodica___not___contains() {
        return metodica___not___contains;
    }
    public void setMetodica___not___contains(String metodica___not___contains) {
        this.metodica___not___contains = metodica___not___contains;
    }

    public String getMetodica___starts_with() {
        return metodica___starts_with;
    }
    public void setMetodica___starts_with(String metodica___starts_with) {
        this.metodica___starts_with = metodica___starts_with;
    }

    public String getMetodica___not___starts_with() {
        return metodica___not___starts_with;
    }
    public void setMetodica___not___starts_with(String metodica___not___starts_with) {
        this.metodica___not___starts_with = metodica___not___starts_with;
    }

    public String getMetodica___ends_with() {
        return metodica___ends_with;
    }
    public void setMetodica___ends_with(String metodica___ends_with) {
        this.metodica___ends_with = metodica___ends_with;
    }

    public String getMetodica___not___ends_with() {
        return metodica___not___ends_with;
    }
    public void setMetodica___not___ends_with(String metodica___not___ends_with) {
        this.metodica___not___ends_with = metodica___not___ends_with;
    }

    public Integer getNr_CD4___eq() {
        return nr_CD4___eq;
    }
    public void setNr_CD4___eq(Integer nr_CD4___eq) {
        this.nr_CD4___eq = nr_CD4___eq;
    }

    public Integer getNr_CD4___ne() {
        return nr_CD4___ne;
    }
    public void setNr_CD4___ne(Integer nr_CD4___ne) {
        this.nr_CD4___ne = nr_CD4___ne;
    }

    public Boolean getNr_CD4___null() {
        return nr_CD4___null;
    }
    public void setNr_CD4___null(Boolean nr_CD4___null) {
        this.nr_CD4___null = nr_CD4___null;
    }

    public Boolean getNr_CD4___not___null() {
        return nr_CD4___not___null;
    }
    public void setNr_CD4___not___null(Boolean nr_CD4___not___null) {
        this.nr_CD4___not___null = nr_CD4___not___null;
    }

    public java.util.List<Integer> getNr_CD4___in() {
        return nr_CD4___in;
    }
    public void setNr_CD4___in(java.util.List<Integer> nr_CD4___in) {
        this.nr_CD4___in = nr_CD4___in;
    }

    public java.util.List<Integer> getNr_CD4___not___in() {
        return nr_CD4___not___in;
    }
    public void setNr_CD4___not___in(java.util.List<Integer> nr_CD4___not___in) {
        this.nr_CD4___not___in = nr_CD4___not___in;
    }

    public Integer getNr_CD4___lt() {
        return nr_CD4___lt;
    }
    public void setNr_CD4___lt(Integer nr_CD4___lt) {
        this.nr_CD4___lt = nr_CD4___lt;
    }

    public Integer getNr_CD4___lte() {
        return nr_CD4___lte;
    }
    public void setNr_CD4___lte(Integer nr_CD4___lte) {
        this.nr_CD4___lte = nr_CD4___lte;
    }

    public Integer getNr_CD4___gt() {
        return nr_CD4___gt;
    }
    public void setNr_CD4___gt(Integer nr_CD4___gt) {
        this.nr_CD4___gt = nr_CD4___gt;
    }

    public Integer getNr_CD4___gte() {
        return nr_CD4___gte;
    }
    public void setNr_CD4___gte(Integer nr_CD4___gte) {
        this.nr_CD4___gte = nr_CD4___gte;
    }

    public Integer getNr_CD8___eq() {
        return nr_CD8___eq;
    }
    public void setNr_CD8___eq(Integer nr_CD8___eq) {
        this.nr_CD8___eq = nr_CD8___eq;
    }

    public Integer getNr_CD8___ne() {
        return nr_CD8___ne;
    }
    public void setNr_CD8___ne(Integer nr_CD8___ne) {
        this.nr_CD8___ne = nr_CD8___ne;
    }

    public Boolean getNr_CD8___null() {
        return nr_CD8___null;
    }
    public void setNr_CD8___null(Boolean nr_CD8___null) {
        this.nr_CD8___null = nr_CD8___null;
    }

    public Boolean getNr_CD8___not___null() {
        return nr_CD8___not___null;
    }
    public void setNr_CD8___not___null(Boolean nr_CD8___not___null) {
        this.nr_CD8___not___null = nr_CD8___not___null;
    }

    public java.util.List<Integer> getNr_CD8___in() {
        return nr_CD8___in;
    }
    public void setNr_CD8___in(java.util.List<Integer> nr_CD8___in) {
        this.nr_CD8___in = nr_CD8___in;
    }

    public java.util.List<Integer> getNr_CD8___not___in() {
        return nr_CD8___not___in;
    }
    public void setNr_CD8___not___in(java.util.List<Integer> nr_CD8___not___in) {
        this.nr_CD8___not___in = nr_CD8___not___in;
    }

    public Integer getNr_CD8___lt() {
        return nr_CD8___lt;
    }
    public void setNr_CD8___lt(Integer nr_CD8___lt) {
        this.nr_CD8___lt = nr_CD8___lt;
    }

    public Integer getNr_CD8___lte() {
        return nr_CD8___lte;
    }
    public void setNr_CD8___lte(Integer nr_CD8___lte) {
        this.nr_CD8___lte = nr_CD8___lte;
    }

    public Integer getNr_CD8___gt() {
        return nr_CD8___gt;
    }
    public void setNr_CD8___gt(Integer nr_CD8___gt) {
        this.nr_CD8___gt = nr_CD8___gt;
    }

    public Integer getNr_CD8___gte() {
        return nr_CD8___gte;
    }
    public void setNr_CD8___gte(Integer nr_CD8___gte) {
        this.nr_CD8___gte = nr_CD8___gte;
    }

    public Integer getNr_linfociti___eq() {
        return nr_linfociti___eq;
    }
    public void setNr_linfociti___eq(Integer nr_linfociti___eq) {
        this.nr_linfociti___eq = nr_linfociti___eq;
    }

    public Integer getNr_linfociti___ne() {
        return nr_linfociti___ne;
    }
    public void setNr_linfociti___ne(Integer nr_linfociti___ne) {
        this.nr_linfociti___ne = nr_linfociti___ne;
    }

    public Boolean getNr_linfociti___null() {
        return nr_linfociti___null;
    }
    public void setNr_linfociti___null(Boolean nr_linfociti___null) {
        this.nr_linfociti___null = nr_linfociti___null;
    }

    public Boolean getNr_linfociti___not___null() {
        return nr_linfociti___not___null;
    }
    public void setNr_linfociti___not___null(Boolean nr_linfociti___not___null) {
        this.nr_linfociti___not___null = nr_linfociti___not___null;
    }

    public java.util.List<Integer> getNr_linfociti___in() {
        return nr_linfociti___in;
    }
    public void setNr_linfociti___in(java.util.List<Integer> nr_linfociti___in) {
        this.nr_linfociti___in = nr_linfociti___in;
    }

    public java.util.List<Integer> getNr_linfociti___not___in() {
        return nr_linfociti___not___in;
    }
    public void setNr_linfociti___not___in(java.util.List<Integer> nr_linfociti___not___in) {
        this.nr_linfociti___not___in = nr_linfociti___not___in;
    }

    public Integer getNr_linfociti___lt() {
        return nr_linfociti___lt;
    }
    public void setNr_linfociti___lt(Integer nr_linfociti___lt) {
        this.nr_linfociti___lt = nr_linfociti___lt;
    }

    public Integer getNr_linfociti___lte() {
        return nr_linfociti___lte;
    }
    public void setNr_linfociti___lte(Integer nr_linfociti___lte) {
        this.nr_linfociti___lte = nr_linfociti___lte;
    }

    public Integer getNr_linfociti___gt() {
        return nr_linfociti___gt;
    }
    public void setNr_linfociti___gt(Integer nr_linfociti___gt) {
        this.nr_linfociti___gt = nr_linfociti___gt;
    }

    public Integer getNr_linfociti___gte() {
        return nr_linfociti___gte;
    }
    public void setNr_linfociti___gte(Integer nr_linfociti___gte) {
        this.nr_linfociti___gte = nr_linfociti___gte;
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

    public String getPerc_CD4___eq() {
        return perc_CD4___eq;
    }
    public void setPerc_CD4___eq(String perc_CD4___eq) {
        this.perc_CD4___eq = perc_CD4___eq;
    }

    public String getPerc_CD4___ne() {
        return perc_CD4___ne;
    }
    public void setPerc_CD4___ne(String perc_CD4___ne) {
        this.perc_CD4___ne = perc_CD4___ne;
    }

    public Boolean getPerc_CD4___null() {
        return perc_CD4___null;
    }
    public void setPerc_CD4___null(Boolean perc_CD4___null) {
        this.perc_CD4___null = perc_CD4___null;
    }

    public Boolean getPerc_CD4___not___null() {
        return perc_CD4___not___null;
    }
    public void setPerc_CD4___not___null(Boolean perc_CD4___not___null) {
        this.perc_CD4___not___null = perc_CD4___not___null;
    }

    public java.util.List<String> getPerc_CD4___in() {
        return perc_CD4___in;
    }
    public void setPerc_CD4___in(java.util.List<String> perc_CD4___in) {
        this.perc_CD4___in = perc_CD4___in;
    }

    public java.util.List<String> getPerc_CD4___not___in() {
        return perc_CD4___not___in;
    }
    public void setPerc_CD4___not___in(java.util.List<String> perc_CD4___not___in) {
        this.perc_CD4___not___in = perc_CD4___not___in;
    }

    public String getPerc_CD4___lt() {
        return perc_CD4___lt;
    }
    public void setPerc_CD4___lt(String perc_CD4___lt) {
        this.perc_CD4___lt = perc_CD4___lt;
    }

    public String getPerc_CD4___lte() {
        return perc_CD4___lte;
    }
    public void setPerc_CD4___lte(String perc_CD4___lte) {
        this.perc_CD4___lte = perc_CD4___lte;
    }

    public String getPerc_CD4___gt() {
        return perc_CD4___gt;
    }
    public void setPerc_CD4___gt(String perc_CD4___gt) {
        this.perc_CD4___gt = perc_CD4___gt;
    }

    public String getPerc_CD4___gte() {
        return perc_CD4___gte;
    }
    public void setPerc_CD4___gte(String perc_CD4___gte) {
        this.perc_CD4___gte = perc_CD4___gte;
    }

    public String getPerc_CD8___eq() {
        return perc_CD8___eq;
    }
    public void setPerc_CD8___eq(String perc_CD8___eq) {
        this.perc_CD8___eq = perc_CD8___eq;
    }

    public String getPerc_CD8___ne() {
        return perc_CD8___ne;
    }
    public void setPerc_CD8___ne(String perc_CD8___ne) {
        this.perc_CD8___ne = perc_CD8___ne;
    }

    public Boolean getPerc_CD8___null() {
        return perc_CD8___null;
    }
    public void setPerc_CD8___null(Boolean perc_CD8___null) {
        this.perc_CD8___null = perc_CD8___null;
    }

    public Boolean getPerc_CD8___not___null() {
        return perc_CD8___not___null;
    }
    public void setPerc_CD8___not___null(Boolean perc_CD8___not___null) {
        this.perc_CD8___not___null = perc_CD8___not___null;
    }

    public java.util.List<String> getPerc_CD8___in() {
        return perc_CD8___in;
    }
    public void setPerc_CD8___in(java.util.List<String> perc_CD8___in) {
        this.perc_CD8___in = perc_CD8___in;
    }

    public java.util.List<String> getPerc_CD8___not___in() {
        return perc_CD8___not___in;
    }
    public void setPerc_CD8___not___in(java.util.List<String> perc_CD8___not___in) {
        this.perc_CD8___not___in = perc_CD8___not___in;
    }

    public String getPerc_CD8___lt() {
        return perc_CD8___lt;
    }
    public void setPerc_CD8___lt(String perc_CD8___lt) {
        this.perc_CD8___lt = perc_CD8___lt;
    }

    public String getPerc_CD8___lte() {
        return perc_CD8___lte;
    }
    public void setPerc_CD8___lte(String perc_CD8___lte) {
        this.perc_CD8___lte = perc_CD8___lte;
    }

    public String getPerc_CD8___gt() {
        return perc_CD8___gt;
    }
    public void setPerc_CD8___gt(String perc_CD8___gt) {
        this.perc_CD8___gt = perc_CD8___gt;
    }

    public String getPerc_CD8___gte() {
        return perc_CD8___gte;
    }
    public void setPerc_CD8___gte(String perc_CD8___gte) {
        this.perc_CD8___gte = perc_CD8___gte;
    }

    public String getTropismo___eq() {
        return tropismo___eq;
    }
    public void setTropismo___eq(String tropismo___eq) {
        this.tropismo___eq = tropismo___eq;
    }

    public String getTropismo___ne() {
        return tropismo___ne;
    }
    public void setTropismo___ne(String tropismo___ne) {
        this.tropismo___ne = tropismo___ne;
    }

    public Boolean getTropismo___null() {
        return tropismo___null;
    }
    public void setTropismo___null(Boolean tropismo___null) {
        this.tropismo___null = tropismo___null;
    }

    public Boolean getTropismo___not___null() {
        return tropismo___not___null;
    }
    public void setTropismo___not___null(Boolean tropismo___not___null) {
        this.tropismo___not___null = tropismo___not___null;
    }

    public java.util.List<String> getTropismo___in() {
        return tropismo___in;
    }
    public void setTropismo___in(java.util.List<String> tropismo___in) {
        this.tropismo___in = tropismo___in;
    }

    public java.util.List<String> getTropismo___not___in() {
        return tropismo___not___in;
    }
    public void setTropismo___not___in(java.util.List<String> tropismo___not___in) {
        this.tropismo___not___in = tropismo___not___in;
    }

    public String getTropismo___lt() {
        return tropismo___lt;
    }
    public void setTropismo___lt(String tropismo___lt) {
        this.tropismo___lt = tropismo___lt;
    }

    public String getTropismo___lte() {
        return tropismo___lte;
    }
    public void setTropismo___lte(String tropismo___lte) {
        this.tropismo___lte = tropismo___lte;
    }

    public String getTropismo___gt() {
        return tropismo___gt;
    }
    public void setTropismo___gt(String tropismo___gt) {
        this.tropismo___gt = tropismo___gt;
    }

    public String getTropismo___gte() {
        return tropismo___gte;
    }
    public void setTropismo___gte(String tropismo___gte) {
        this.tropismo___gte = tropismo___gte;
    }

    public String getTropismo___contains() {
        return tropismo___contains;
    }
    public void setTropismo___contains(String tropismo___contains) {
        this.tropismo___contains = tropismo___contains;
    }

    public String getTropismo___not___contains() {
        return tropismo___not___contains;
    }
    public void setTropismo___not___contains(String tropismo___not___contains) {
        this.tropismo___not___contains = tropismo___not___contains;
    }

    public String getTropismo___starts_with() {
        return tropismo___starts_with;
    }
    public void setTropismo___starts_with(String tropismo___starts_with) {
        this.tropismo___starts_with = tropismo___starts_with;
    }

    public String getTropismo___not___starts_with() {
        return tropismo___not___starts_with;
    }
    public void setTropismo___not___starts_with(String tropismo___not___starts_with) {
        this.tropismo___not___starts_with = tropismo___not___starts_with;
    }

    public String getTropismo___ends_with() {
        return tropismo___ends_with;
    }
    public void setTropismo___ends_with(String tropismo___ends_with) {
        this.tropismo___ends_with = tropismo___ends_with;
    }

    public String getTropismo___not___ends_with() {
        return tropismo___not___ends_with;
    }
    public void setTropismo___not___ends_with(String tropismo___not___ends_with) {
        this.tropismo___not___ends_with = tropismo___not___ends_with;
    }

    public java.util.List<CliMarkers_HIVFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliMarkers_HIVFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliMarkers_HIVFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliMarkers_HIVFilterDTO> OR) {
        this.OR = OR;
    }

    public CliMarkers_HIVFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliMarkers_HIVFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
        }
        if (FPR___eq != null) {
            joiner.add("FPR___eq: " + GraphQLRequestSerializer.getEntry(FPR___eq));
        }
        if (FPR___ne != null) {
            joiner.add("FPR___ne: " + GraphQLRequestSerializer.getEntry(FPR___ne));
        }
        if (FPR___null != null) {
            joiner.add("FPR___null: " + GraphQLRequestSerializer.getEntry(FPR___null));
        }
        if (FPR___not___null != null) {
            joiner.add("FPR___not___null: " + GraphQLRequestSerializer.getEntry(FPR___not___null));
        }
        if (FPR___in != null) {
            joiner.add("FPR___in: " + GraphQLRequestSerializer.getEntry(FPR___in));
        }
        if (FPR___not___in != null) {
            joiner.add("FPR___not___in: " + GraphQLRequestSerializer.getEntry(FPR___not___in));
        }
        if (FPR___lt != null) {
            joiner.add("FPR___lt: " + GraphQLRequestSerializer.getEntry(FPR___lt));
        }
        if (FPR___lte != null) {
            joiner.add("FPR___lte: " + GraphQLRequestSerializer.getEntry(FPR___lte));
        }
        if (FPR___gt != null) {
            joiner.add("FPR___gt: " + GraphQLRequestSerializer.getEntry(FPR___gt));
        }
        if (FPR___gte != null) {
            joiner.add("FPR___gte: " + GraphQLRequestSerializer.getEntry(FPR___gte));
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
        if (geno2pheno___eq != null) {
            joiner.add("geno2pheno___eq: " + GraphQLRequestSerializer.getEntry(geno2pheno___eq));
        }
        if (geno2pheno___ne != null) {
            joiner.add("geno2pheno___ne: " + GraphQLRequestSerializer.getEntry(geno2pheno___ne));
        }
        if (geno2pheno___null != null) {
            joiner.add("geno2pheno___null: " + GraphQLRequestSerializer.getEntry(geno2pheno___null));
        }
        if (geno2pheno___not___null != null) {
            joiner.add("geno2pheno___not___null: " + GraphQLRequestSerializer.getEntry(geno2pheno___not___null));
        }
        if (hivrna___eq != null) {
            joiner.add("hivrna___eq: " + GraphQLRequestSerializer.getEntry(hivrna___eq));
        }
        if (hivrna___ne != null) {
            joiner.add("hivrna___ne: " + GraphQLRequestSerializer.getEntry(hivrna___ne));
        }
        if (hivrna___null != null) {
            joiner.add("hivrna___null: " + GraphQLRequestSerializer.getEntry(hivrna___null));
        }
        if (hivrna___not___null != null) {
            joiner.add("hivrna___not___null: " + GraphQLRequestSerializer.getEntry(hivrna___not___null));
        }
        if (hivrna___in != null) {
            joiner.add("hivrna___in: " + GraphQLRequestSerializer.getEntry(hivrna___in));
        }
        if (hivrna___not___in != null) {
            joiner.add("hivrna___not___in: " + GraphQLRequestSerializer.getEntry(hivrna___not___in));
        }
        if (hivrna___lt != null) {
            joiner.add("hivrna___lt: " + GraphQLRequestSerializer.getEntry(hivrna___lt));
        }
        if (hivrna___lte != null) {
            joiner.add("hivrna___lte: " + GraphQLRequestSerializer.getEntry(hivrna___lte));
        }
        if (hivrna___gt != null) {
            joiner.add("hivrna___gt: " + GraphQLRequestSerializer.getEntry(hivrna___gt));
        }
        if (hivrna___gte != null) {
            joiner.add("hivrna___gte: " + GraphQLRequestSerializer.getEntry(hivrna___gte));
        }
        if (hivrna_segno___eq != null) {
            joiner.add("hivrna_segno___eq: " + GraphQLRequestSerializer.getEntry(hivrna_segno___eq));
        }
        if (hivrna_segno___ne != null) {
            joiner.add("hivrna_segno___ne: " + GraphQLRequestSerializer.getEntry(hivrna_segno___ne));
        }
        if (hivrna_segno___null != null) {
            joiner.add("hivrna_segno___null: " + GraphQLRequestSerializer.getEntry(hivrna_segno___null));
        }
        if (hivrna_segno___not___null != null) {
            joiner.add("hivrna_segno___not___null: " + GraphQLRequestSerializer.getEntry(hivrna_segno___not___null));
        }
        if (hivrna_segno___in != null) {
            joiner.add("hivrna_segno___in: " + GraphQLRequestSerializer.getEntry(hivrna_segno___in));
        }
        if (hivrna_segno___not___in != null) {
            joiner.add("hivrna_segno___not___in: " + GraphQLRequestSerializer.getEntry(hivrna_segno___not___in));
        }
        if (hivrna_segno___lt != null) {
            joiner.add("hivrna_segno___lt: " + GraphQLRequestSerializer.getEntry(hivrna_segno___lt));
        }
        if (hivrna_segno___lte != null) {
            joiner.add("hivrna_segno___lte: " + GraphQLRequestSerializer.getEntry(hivrna_segno___lte));
        }
        if (hivrna_segno___gt != null) {
            joiner.add("hivrna_segno___gt: " + GraphQLRequestSerializer.getEntry(hivrna_segno___gt));
        }
        if (hivrna_segno___gte != null) {
            joiner.add("hivrna_segno___gte: " + GraphQLRequestSerializer.getEntry(hivrna_segno___gte));
        }
        if (hivrna_segno___contains != null) {
            joiner.add("hivrna_segno___contains: " + GraphQLRequestSerializer.getEntry(hivrna_segno___contains));
        }
        if (hivrna_segno___not___contains != null) {
            joiner.add("hivrna_segno___not___contains: " + GraphQLRequestSerializer.getEntry(hivrna_segno___not___contains));
        }
        if (hivrna_segno___starts_with != null) {
            joiner.add("hivrna_segno___starts_with: " + GraphQLRequestSerializer.getEntry(hivrna_segno___starts_with));
        }
        if (hivrna_segno___not___starts_with != null) {
            joiner.add("hivrna_segno___not___starts_with: " + GraphQLRequestSerializer.getEntry(hivrna_segno___not___starts_with));
        }
        if (hivrna_segno___ends_with != null) {
            joiner.add("hivrna_segno___ends_with: " + GraphQLRequestSerializer.getEntry(hivrna_segno___ends_with));
        }
        if (hivrna_segno___not___ends_with != null) {
            joiner.add("hivrna_segno___not___ends_with: " + GraphQLRequestSerializer.getEntry(hivrna_segno___not___ends_with));
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
        if (metodica___eq != null) {
            joiner.add("metodica___eq: " + GraphQLRequestSerializer.getEntry(metodica___eq));
        }
        if (metodica___ne != null) {
            joiner.add("metodica___ne: " + GraphQLRequestSerializer.getEntry(metodica___ne));
        }
        if (metodica___null != null) {
            joiner.add("metodica___null: " + GraphQLRequestSerializer.getEntry(metodica___null));
        }
        if (metodica___not___null != null) {
            joiner.add("metodica___not___null: " + GraphQLRequestSerializer.getEntry(metodica___not___null));
        }
        if (metodica___in != null) {
            joiner.add("metodica___in: " + GraphQLRequestSerializer.getEntry(metodica___in));
        }
        if (metodica___not___in != null) {
            joiner.add("metodica___not___in: " + GraphQLRequestSerializer.getEntry(metodica___not___in));
        }
        if (metodica___lt != null) {
            joiner.add("metodica___lt: " + GraphQLRequestSerializer.getEntry(metodica___lt));
        }
        if (metodica___lte != null) {
            joiner.add("metodica___lte: " + GraphQLRequestSerializer.getEntry(metodica___lte));
        }
        if (metodica___gt != null) {
            joiner.add("metodica___gt: " + GraphQLRequestSerializer.getEntry(metodica___gt));
        }
        if (metodica___gte != null) {
            joiner.add("metodica___gte: " + GraphQLRequestSerializer.getEntry(metodica___gte));
        }
        if (metodica___contains != null) {
            joiner.add("metodica___contains: " + GraphQLRequestSerializer.getEntry(metodica___contains));
        }
        if (metodica___not___contains != null) {
            joiner.add("metodica___not___contains: " + GraphQLRequestSerializer.getEntry(metodica___not___contains));
        }
        if (metodica___starts_with != null) {
            joiner.add("metodica___starts_with: " + GraphQLRequestSerializer.getEntry(metodica___starts_with));
        }
        if (metodica___not___starts_with != null) {
            joiner.add("metodica___not___starts_with: " + GraphQLRequestSerializer.getEntry(metodica___not___starts_with));
        }
        if (metodica___ends_with != null) {
            joiner.add("metodica___ends_with: " + GraphQLRequestSerializer.getEntry(metodica___ends_with));
        }
        if (metodica___not___ends_with != null) {
            joiner.add("metodica___not___ends_with: " + GraphQLRequestSerializer.getEntry(metodica___not___ends_with));
        }
        if (nr_CD4___eq != null) {
            joiner.add("nr_CD4___eq: " + GraphQLRequestSerializer.getEntry(nr_CD4___eq));
        }
        if (nr_CD4___ne != null) {
            joiner.add("nr_CD4___ne: " + GraphQLRequestSerializer.getEntry(nr_CD4___ne));
        }
        if (nr_CD4___null != null) {
            joiner.add("nr_CD4___null: " + GraphQLRequestSerializer.getEntry(nr_CD4___null));
        }
        if (nr_CD4___not___null != null) {
            joiner.add("nr_CD4___not___null: " + GraphQLRequestSerializer.getEntry(nr_CD4___not___null));
        }
        if (nr_CD4___in != null) {
            joiner.add("nr_CD4___in: " + GraphQLRequestSerializer.getEntry(nr_CD4___in));
        }
        if (nr_CD4___not___in != null) {
            joiner.add("nr_CD4___not___in: " + GraphQLRequestSerializer.getEntry(nr_CD4___not___in));
        }
        if (nr_CD4___lt != null) {
            joiner.add("nr_CD4___lt: " + GraphQLRequestSerializer.getEntry(nr_CD4___lt));
        }
        if (nr_CD4___lte != null) {
            joiner.add("nr_CD4___lte: " + GraphQLRequestSerializer.getEntry(nr_CD4___lte));
        }
        if (nr_CD4___gt != null) {
            joiner.add("nr_CD4___gt: " + GraphQLRequestSerializer.getEntry(nr_CD4___gt));
        }
        if (nr_CD4___gte != null) {
            joiner.add("nr_CD4___gte: " + GraphQLRequestSerializer.getEntry(nr_CD4___gte));
        }
        if (nr_CD8___eq != null) {
            joiner.add("nr_CD8___eq: " + GraphQLRequestSerializer.getEntry(nr_CD8___eq));
        }
        if (nr_CD8___ne != null) {
            joiner.add("nr_CD8___ne: " + GraphQLRequestSerializer.getEntry(nr_CD8___ne));
        }
        if (nr_CD8___null != null) {
            joiner.add("nr_CD8___null: " + GraphQLRequestSerializer.getEntry(nr_CD8___null));
        }
        if (nr_CD8___not___null != null) {
            joiner.add("nr_CD8___not___null: " + GraphQLRequestSerializer.getEntry(nr_CD8___not___null));
        }
        if (nr_CD8___in != null) {
            joiner.add("nr_CD8___in: " + GraphQLRequestSerializer.getEntry(nr_CD8___in));
        }
        if (nr_CD8___not___in != null) {
            joiner.add("nr_CD8___not___in: " + GraphQLRequestSerializer.getEntry(nr_CD8___not___in));
        }
        if (nr_CD8___lt != null) {
            joiner.add("nr_CD8___lt: " + GraphQLRequestSerializer.getEntry(nr_CD8___lt));
        }
        if (nr_CD8___lte != null) {
            joiner.add("nr_CD8___lte: " + GraphQLRequestSerializer.getEntry(nr_CD8___lte));
        }
        if (nr_CD8___gt != null) {
            joiner.add("nr_CD8___gt: " + GraphQLRequestSerializer.getEntry(nr_CD8___gt));
        }
        if (nr_CD8___gte != null) {
            joiner.add("nr_CD8___gte: " + GraphQLRequestSerializer.getEntry(nr_CD8___gte));
        }
        if (nr_linfociti___eq != null) {
            joiner.add("nr_linfociti___eq: " + GraphQLRequestSerializer.getEntry(nr_linfociti___eq));
        }
        if (nr_linfociti___ne != null) {
            joiner.add("nr_linfociti___ne: " + GraphQLRequestSerializer.getEntry(nr_linfociti___ne));
        }
        if (nr_linfociti___null != null) {
            joiner.add("nr_linfociti___null: " + GraphQLRequestSerializer.getEntry(nr_linfociti___null));
        }
        if (nr_linfociti___not___null != null) {
            joiner.add("nr_linfociti___not___null: " + GraphQLRequestSerializer.getEntry(nr_linfociti___not___null));
        }
        if (nr_linfociti___in != null) {
            joiner.add("nr_linfociti___in: " + GraphQLRequestSerializer.getEntry(nr_linfociti___in));
        }
        if (nr_linfociti___not___in != null) {
            joiner.add("nr_linfociti___not___in: " + GraphQLRequestSerializer.getEntry(nr_linfociti___not___in));
        }
        if (nr_linfociti___lt != null) {
            joiner.add("nr_linfociti___lt: " + GraphQLRequestSerializer.getEntry(nr_linfociti___lt));
        }
        if (nr_linfociti___lte != null) {
            joiner.add("nr_linfociti___lte: " + GraphQLRequestSerializer.getEntry(nr_linfociti___lte));
        }
        if (nr_linfociti___gt != null) {
            joiner.add("nr_linfociti___gt: " + GraphQLRequestSerializer.getEntry(nr_linfociti___gt));
        }
        if (nr_linfociti___gte != null) {
            joiner.add("nr_linfociti___gte: " + GraphQLRequestSerializer.getEntry(nr_linfociti___gte));
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
        if (perc_CD4___eq != null) {
            joiner.add("perc_CD4___eq: " + GraphQLRequestSerializer.getEntry(perc_CD4___eq));
        }
        if (perc_CD4___ne != null) {
            joiner.add("perc_CD4___ne: " + GraphQLRequestSerializer.getEntry(perc_CD4___ne));
        }
        if (perc_CD4___null != null) {
            joiner.add("perc_CD4___null: " + GraphQLRequestSerializer.getEntry(perc_CD4___null));
        }
        if (perc_CD4___not___null != null) {
            joiner.add("perc_CD4___not___null: " + GraphQLRequestSerializer.getEntry(perc_CD4___not___null));
        }
        if (perc_CD4___in != null) {
            joiner.add("perc_CD4___in: " + GraphQLRequestSerializer.getEntry(perc_CD4___in));
        }
        if (perc_CD4___not___in != null) {
            joiner.add("perc_CD4___not___in: " + GraphQLRequestSerializer.getEntry(perc_CD4___not___in));
        }
        if (perc_CD4___lt != null) {
            joiner.add("perc_CD4___lt: " + GraphQLRequestSerializer.getEntry(perc_CD4___lt));
        }
        if (perc_CD4___lte != null) {
            joiner.add("perc_CD4___lte: " + GraphQLRequestSerializer.getEntry(perc_CD4___lte));
        }
        if (perc_CD4___gt != null) {
            joiner.add("perc_CD4___gt: " + GraphQLRequestSerializer.getEntry(perc_CD4___gt));
        }
        if (perc_CD4___gte != null) {
            joiner.add("perc_CD4___gte: " + GraphQLRequestSerializer.getEntry(perc_CD4___gte));
        }
        if (perc_CD8___eq != null) {
            joiner.add("perc_CD8___eq: " + GraphQLRequestSerializer.getEntry(perc_CD8___eq));
        }
        if (perc_CD8___ne != null) {
            joiner.add("perc_CD8___ne: " + GraphQLRequestSerializer.getEntry(perc_CD8___ne));
        }
        if (perc_CD8___null != null) {
            joiner.add("perc_CD8___null: " + GraphQLRequestSerializer.getEntry(perc_CD8___null));
        }
        if (perc_CD8___not___null != null) {
            joiner.add("perc_CD8___not___null: " + GraphQLRequestSerializer.getEntry(perc_CD8___not___null));
        }
        if (perc_CD8___in != null) {
            joiner.add("perc_CD8___in: " + GraphQLRequestSerializer.getEntry(perc_CD8___in));
        }
        if (perc_CD8___not___in != null) {
            joiner.add("perc_CD8___not___in: " + GraphQLRequestSerializer.getEntry(perc_CD8___not___in));
        }
        if (perc_CD8___lt != null) {
            joiner.add("perc_CD8___lt: " + GraphQLRequestSerializer.getEntry(perc_CD8___lt));
        }
        if (perc_CD8___lte != null) {
            joiner.add("perc_CD8___lte: " + GraphQLRequestSerializer.getEntry(perc_CD8___lte));
        }
        if (perc_CD8___gt != null) {
            joiner.add("perc_CD8___gt: " + GraphQLRequestSerializer.getEntry(perc_CD8___gt));
        }
        if (perc_CD8___gte != null) {
            joiner.add("perc_CD8___gte: " + GraphQLRequestSerializer.getEntry(perc_CD8___gte));
        }
        if (tropismo___eq != null) {
            joiner.add("tropismo___eq: " + GraphQLRequestSerializer.getEntry(tropismo___eq));
        }
        if (tropismo___ne != null) {
            joiner.add("tropismo___ne: " + GraphQLRequestSerializer.getEntry(tropismo___ne));
        }
        if (tropismo___null != null) {
            joiner.add("tropismo___null: " + GraphQLRequestSerializer.getEntry(tropismo___null));
        }
        if (tropismo___not___null != null) {
            joiner.add("tropismo___not___null: " + GraphQLRequestSerializer.getEntry(tropismo___not___null));
        }
        if (tropismo___in != null) {
            joiner.add("tropismo___in: " + GraphQLRequestSerializer.getEntry(tropismo___in));
        }
        if (tropismo___not___in != null) {
            joiner.add("tropismo___not___in: " + GraphQLRequestSerializer.getEntry(tropismo___not___in));
        }
        if (tropismo___lt != null) {
            joiner.add("tropismo___lt: " + GraphQLRequestSerializer.getEntry(tropismo___lt));
        }
        if (tropismo___lte != null) {
            joiner.add("tropismo___lte: " + GraphQLRequestSerializer.getEntry(tropismo___lte));
        }
        if (tropismo___gt != null) {
            joiner.add("tropismo___gt: " + GraphQLRequestSerializer.getEntry(tropismo___gt));
        }
        if (tropismo___gte != null) {
            joiner.add("tropismo___gte: " + GraphQLRequestSerializer.getEntry(tropismo___gte));
        }
        if (tropismo___contains != null) {
            joiner.add("tropismo___contains: " + GraphQLRequestSerializer.getEntry(tropismo___contains));
        }
        if (tropismo___not___contains != null) {
            joiner.add("tropismo___not___contains: " + GraphQLRequestSerializer.getEntry(tropismo___not___contains));
        }
        if (tropismo___starts_with != null) {
            joiner.add("tropismo___starts_with: " + GraphQLRequestSerializer.getEntry(tropismo___starts_with));
        }
        if (tropismo___not___starts_with != null) {
            joiner.add("tropismo___not___starts_with: " + GraphQLRequestSerializer.getEntry(tropismo___not___starts_with));
        }
        if (tropismo___ends_with != null) {
            joiner.add("tropismo___ends_with: " + GraphQLRequestSerializer.getEntry(tropismo___ends_with));
        }
        if (tropismo___not___ends_with != null) {
            joiner.add("tropismo___not___ends_with: " + GraphQLRequestSerializer.getEntry(tropismo___not___ends_with));
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

    public static CliMarkers_HIVFilterDTO.Builder builder() {
        return new CliMarkers_HIVFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId___eq;
        private String FPR___eq;
        private String FPR___ne;
        private Boolean FPR___null;
        private Boolean FPR___not___null;
        private java.util.List<String> FPR___in;
        private java.util.List<String> FPR___not___in;
        private String FPR___lt;
        private String FPR___lte;
        private String FPR___gt;
        private String FPR___gte;
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
        private Boolean geno2pheno___eq;
        private Boolean geno2pheno___ne;
        private Boolean geno2pheno___null;
        private Boolean geno2pheno___not___null;
        private Integer hivrna___eq;
        private Integer hivrna___ne;
        private Boolean hivrna___null;
        private Boolean hivrna___not___null;
        private java.util.List<Integer> hivrna___in;
        private java.util.List<Integer> hivrna___not___in;
        private Integer hivrna___lt;
        private Integer hivrna___lte;
        private Integer hivrna___gt;
        private Integer hivrna___gte;
        private String hivrna_segno___eq;
        private String hivrna_segno___ne;
        private Boolean hivrna_segno___null;
        private Boolean hivrna_segno___not___null;
        private java.util.List<String> hivrna_segno___in;
        private java.util.List<String> hivrna_segno___not___in;
        private String hivrna_segno___lt;
        private String hivrna_segno___lte;
        private String hivrna_segno___gt;
        private String hivrna_segno___gte;
        private String hivrna_segno___contains;
        private String hivrna_segno___not___contains;
        private String hivrna_segno___starts_with;
        private String hivrna_segno___not___starts_with;
        private String hivrna_segno___ends_with;
        private String hivrna_segno___not___ends_with;
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
        private String metodica___eq;
        private String metodica___ne;
        private Boolean metodica___null;
        private Boolean metodica___not___null;
        private java.util.List<String> metodica___in;
        private java.util.List<String> metodica___not___in;
        private String metodica___lt;
        private String metodica___lte;
        private String metodica___gt;
        private String metodica___gte;
        private String metodica___contains;
        private String metodica___not___contains;
        private String metodica___starts_with;
        private String metodica___not___starts_with;
        private String metodica___ends_with;
        private String metodica___not___ends_with;
        private Integer nr_CD4___eq;
        private Integer nr_CD4___ne;
        private Boolean nr_CD4___null;
        private Boolean nr_CD4___not___null;
        private java.util.List<Integer> nr_CD4___in;
        private java.util.List<Integer> nr_CD4___not___in;
        private Integer nr_CD4___lt;
        private Integer nr_CD4___lte;
        private Integer nr_CD4___gt;
        private Integer nr_CD4___gte;
        private Integer nr_CD8___eq;
        private Integer nr_CD8___ne;
        private Boolean nr_CD8___null;
        private Boolean nr_CD8___not___null;
        private java.util.List<Integer> nr_CD8___in;
        private java.util.List<Integer> nr_CD8___not___in;
        private Integer nr_CD8___lt;
        private Integer nr_CD8___lte;
        private Integer nr_CD8___gt;
        private Integer nr_CD8___gte;
        private Integer nr_linfociti___eq;
        private Integer nr_linfociti___ne;
        private Boolean nr_linfociti___null;
        private Boolean nr_linfociti___not___null;
        private java.util.List<Integer> nr_linfociti___in;
        private java.util.List<Integer> nr_linfociti___not___in;
        private Integer nr_linfociti___lt;
        private Integer nr_linfociti___lte;
        private Integer nr_linfociti___gt;
        private Integer nr_linfociti___gte;
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
        private String perc_CD4___eq;
        private String perc_CD4___ne;
        private Boolean perc_CD4___null;
        private Boolean perc_CD4___not___null;
        private java.util.List<String> perc_CD4___in;
        private java.util.List<String> perc_CD4___not___in;
        private String perc_CD4___lt;
        private String perc_CD4___lte;
        private String perc_CD4___gt;
        private String perc_CD4___gte;
        private String perc_CD8___eq;
        private String perc_CD8___ne;
        private Boolean perc_CD8___null;
        private Boolean perc_CD8___not___null;
        private java.util.List<String> perc_CD8___in;
        private java.util.List<String> perc_CD8___not___in;
        private String perc_CD8___lt;
        private String perc_CD8___lte;
        private String perc_CD8___gt;
        private String perc_CD8___gte;
        private String tropismo___eq;
        private String tropismo___ne;
        private Boolean tropismo___null;
        private Boolean tropismo___not___null;
        private java.util.List<String> tropismo___in;
        private java.util.List<String> tropismo___not___in;
        private String tropismo___lt;
        private String tropismo___lte;
        private String tropismo___gt;
        private String tropismo___gte;
        private String tropismo___contains;
        private String tropismo___not___contains;
        private String tropismo___starts_with;
        private String tropismo___not___starts_with;
        private String tropismo___ends_with;
        private String tropismo___not___ends_with;
        private java.util.List<CliMarkers_HIVFilterDTO> AND;
        private java.util.List<CliMarkers_HIVFilterDTO> OR;
        private CliMarkers_HIVFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
            return this;
        }

        public Builder setFPR___eq(String FPR___eq) {
            this.FPR___eq = FPR___eq;
            return this;
        }

        public Builder setFPR___ne(String FPR___ne) {
            this.FPR___ne = FPR___ne;
            return this;
        }

        public Builder setFPR___null(Boolean FPR___null) {
            this.FPR___null = FPR___null;
            return this;
        }

        public Builder setFPR___not___null(Boolean FPR___not___null) {
            this.FPR___not___null = FPR___not___null;
            return this;
        }

        public Builder setFPR___in(java.util.List<String> FPR___in) {
            this.FPR___in = FPR___in;
            return this;
        }

        public Builder setFPR___not___in(java.util.List<String> FPR___not___in) {
            this.FPR___not___in = FPR___not___in;
            return this;
        }

        public Builder setFPR___lt(String FPR___lt) {
            this.FPR___lt = FPR___lt;
            return this;
        }

        public Builder setFPR___lte(String FPR___lte) {
            this.FPR___lte = FPR___lte;
            return this;
        }

        public Builder setFPR___gt(String FPR___gt) {
            this.FPR___gt = FPR___gt;
            return this;
        }

        public Builder setFPR___gte(String FPR___gte) {
            this.FPR___gte = FPR___gte;
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

        public Builder setGeno2pheno___eq(Boolean geno2pheno___eq) {
            this.geno2pheno___eq = geno2pheno___eq;
            return this;
        }

        public Builder setGeno2pheno___ne(Boolean geno2pheno___ne) {
            this.geno2pheno___ne = geno2pheno___ne;
            return this;
        }

        public Builder setGeno2pheno___null(Boolean geno2pheno___null) {
            this.geno2pheno___null = geno2pheno___null;
            return this;
        }

        public Builder setGeno2pheno___not___null(Boolean geno2pheno___not___null) {
            this.geno2pheno___not___null = geno2pheno___not___null;
            return this;
        }

        public Builder setHivrna___eq(Integer hivrna___eq) {
            this.hivrna___eq = hivrna___eq;
            return this;
        }

        public Builder setHivrna___ne(Integer hivrna___ne) {
            this.hivrna___ne = hivrna___ne;
            return this;
        }

        public Builder setHivrna___null(Boolean hivrna___null) {
            this.hivrna___null = hivrna___null;
            return this;
        }

        public Builder setHivrna___not___null(Boolean hivrna___not___null) {
            this.hivrna___not___null = hivrna___not___null;
            return this;
        }

        public Builder setHivrna___in(java.util.List<Integer> hivrna___in) {
            this.hivrna___in = hivrna___in;
            return this;
        }

        public Builder setHivrna___not___in(java.util.List<Integer> hivrna___not___in) {
            this.hivrna___not___in = hivrna___not___in;
            return this;
        }

        public Builder setHivrna___lt(Integer hivrna___lt) {
            this.hivrna___lt = hivrna___lt;
            return this;
        }

        public Builder setHivrna___lte(Integer hivrna___lte) {
            this.hivrna___lte = hivrna___lte;
            return this;
        }

        public Builder setHivrna___gt(Integer hivrna___gt) {
            this.hivrna___gt = hivrna___gt;
            return this;
        }

        public Builder setHivrna___gte(Integer hivrna___gte) {
            this.hivrna___gte = hivrna___gte;
            return this;
        }

        public Builder setHivrna_segno___eq(String hivrna_segno___eq) {
            this.hivrna_segno___eq = hivrna_segno___eq;
            return this;
        }

        public Builder setHivrna_segno___ne(String hivrna_segno___ne) {
            this.hivrna_segno___ne = hivrna_segno___ne;
            return this;
        }

        public Builder setHivrna_segno___null(Boolean hivrna_segno___null) {
            this.hivrna_segno___null = hivrna_segno___null;
            return this;
        }

        public Builder setHivrna_segno___not___null(Boolean hivrna_segno___not___null) {
            this.hivrna_segno___not___null = hivrna_segno___not___null;
            return this;
        }

        public Builder setHivrna_segno___in(java.util.List<String> hivrna_segno___in) {
            this.hivrna_segno___in = hivrna_segno___in;
            return this;
        }

        public Builder setHivrna_segno___not___in(java.util.List<String> hivrna_segno___not___in) {
            this.hivrna_segno___not___in = hivrna_segno___not___in;
            return this;
        }

        public Builder setHivrna_segno___lt(String hivrna_segno___lt) {
            this.hivrna_segno___lt = hivrna_segno___lt;
            return this;
        }

        public Builder setHivrna_segno___lte(String hivrna_segno___lte) {
            this.hivrna_segno___lte = hivrna_segno___lte;
            return this;
        }

        public Builder setHivrna_segno___gt(String hivrna_segno___gt) {
            this.hivrna_segno___gt = hivrna_segno___gt;
            return this;
        }

        public Builder setHivrna_segno___gte(String hivrna_segno___gte) {
            this.hivrna_segno___gte = hivrna_segno___gte;
            return this;
        }

        public Builder setHivrna_segno___contains(String hivrna_segno___contains) {
            this.hivrna_segno___contains = hivrna_segno___contains;
            return this;
        }

        public Builder setHivrna_segno___not___contains(String hivrna_segno___not___contains) {
            this.hivrna_segno___not___contains = hivrna_segno___not___contains;
            return this;
        }

        public Builder setHivrna_segno___starts_with(String hivrna_segno___starts_with) {
            this.hivrna_segno___starts_with = hivrna_segno___starts_with;
            return this;
        }

        public Builder setHivrna_segno___not___starts_with(String hivrna_segno___not___starts_with) {
            this.hivrna_segno___not___starts_with = hivrna_segno___not___starts_with;
            return this;
        }

        public Builder setHivrna_segno___ends_with(String hivrna_segno___ends_with) {
            this.hivrna_segno___ends_with = hivrna_segno___ends_with;
            return this;
        }

        public Builder setHivrna_segno___not___ends_with(String hivrna_segno___not___ends_with) {
            this.hivrna_segno___not___ends_with = hivrna_segno___not___ends_with;
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

        public Builder setMetodica___eq(String metodica___eq) {
            this.metodica___eq = metodica___eq;
            return this;
        }

        public Builder setMetodica___ne(String metodica___ne) {
            this.metodica___ne = metodica___ne;
            return this;
        }

        public Builder setMetodica___null(Boolean metodica___null) {
            this.metodica___null = metodica___null;
            return this;
        }

        public Builder setMetodica___not___null(Boolean metodica___not___null) {
            this.metodica___not___null = metodica___not___null;
            return this;
        }

        public Builder setMetodica___in(java.util.List<String> metodica___in) {
            this.metodica___in = metodica___in;
            return this;
        }

        public Builder setMetodica___not___in(java.util.List<String> metodica___not___in) {
            this.metodica___not___in = metodica___not___in;
            return this;
        }

        public Builder setMetodica___lt(String metodica___lt) {
            this.metodica___lt = metodica___lt;
            return this;
        }

        public Builder setMetodica___lte(String metodica___lte) {
            this.metodica___lte = metodica___lte;
            return this;
        }

        public Builder setMetodica___gt(String metodica___gt) {
            this.metodica___gt = metodica___gt;
            return this;
        }

        public Builder setMetodica___gte(String metodica___gte) {
            this.metodica___gte = metodica___gte;
            return this;
        }

        public Builder setMetodica___contains(String metodica___contains) {
            this.metodica___contains = metodica___contains;
            return this;
        }

        public Builder setMetodica___not___contains(String metodica___not___contains) {
            this.metodica___not___contains = metodica___not___contains;
            return this;
        }

        public Builder setMetodica___starts_with(String metodica___starts_with) {
            this.metodica___starts_with = metodica___starts_with;
            return this;
        }

        public Builder setMetodica___not___starts_with(String metodica___not___starts_with) {
            this.metodica___not___starts_with = metodica___not___starts_with;
            return this;
        }

        public Builder setMetodica___ends_with(String metodica___ends_with) {
            this.metodica___ends_with = metodica___ends_with;
            return this;
        }

        public Builder setMetodica___not___ends_with(String metodica___not___ends_with) {
            this.metodica___not___ends_with = metodica___not___ends_with;
            return this;
        }

        public Builder setNr_CD4___eq(Integer nr_CD4___eq) {
            this.nr_CD4___eq = nr_CD4___eq;
            return this;
        }

        public Builder setNr_CD4___ne(Integer nr_CD4___ne) {
            this.nr_CD4___ne = nr_CD4___ne;
            return this;
        }

        public Builder setNr_CD4___null(Boolean nr_CD4___null) {
            this.nr_CD4___null = nr_CD4___null;
            return this;
        }

        public Builder setNr_CD4___not___null(Boolean nr_CD4___not___null) {
            this.nr_CD4___not___null = nr_CD4___not___null;
            return this;
        }

        public Builder setNr_CD4___in(java.util.List<Integer> nr_CD4___in) {
            this.nr_CD4___in = nr_CD4___in;
            return this;
        }

        public Builder setNr_CD4___not___in(java.util.List<Integer> nr_CD4___not___in) {
            this.nr_CD4___not___in = nr_CD4___not___in;
            return this;
        }

        public Builder setNr_CD4___lt(Integer nr_CD4___lt) {
            this.nr_CD4___lt = nr_CD4___lt;
            return this;
        }

        public Builder setNr_CD4___lte(Integer nr_CD4___lte) {
            this.nr_CD4___lte = nr_CD4___lte;
            return this;
        }

        public Builder setNr_CD4___gt(Integer nr_CD4___gt) {
            this.nr_CD4___gt = nr_CD4___gt;
            return this;
        }

        public Builder setNr_CD4___gte(Integer nr_CD4___gte) {
            this.nr_CD4___gte = nr_CD4___gte;
            return this;
        }

        public Builder setNr_CD8___eq(Integer nr_CD8___eq) {
            this.nr_CD8___eq = nr_CD8___eq;
            return this;
        }

        public Builder setNr_CD8___ne(Integer nr_CD8___ne) {
            this.nr_CD8___ne = nr_CD8___ne;
            return this;
        }

        public Builder setNr_CD8___null(Boolean nr_CD8___null) {
            this.nr_CD8___null = nr_CD8___null;
            return this;
        }

        public Builder setNr_CD8___not___null(Boolean nr_CD8___not___null) {
            this.nr_CD8___not___null = nr_CD8___not___null;
            return this;
        }

        public Builder setNr_CD8___in(java.util.List<Integer> nr_CD8___in) {
            this.nr_CD8___in = nr_CD8___in;
            return this;
        }

        public Builder setNr_CD8___not___in(java.util.List<Integer> nr_CD8___not___in) {
            this.nr_CD8___not___in = nr_CD8___not___in;
            return this;
        }

        public Builder setNr_CD8___lt(Integer nr_CD8___lt) {
            this.nr_CD8___lt = nr_CD8___lt;
            return this;
        }

        public Builder setNr_CD8___lte(Integer nr_CD8___lte) {
            this.nr_CD8___lte = nr_CD8___lte;
            return this;
        }

        public Builder setNr_CD8___gt(Integer nr_CD8___gt) {
            this.nr_CD8___gt = nr_CD8___gt;
            return this;
        }

        public Builder setNr_CD8___gte(Integer nr_CD8___gte) {
            this.nr_CD8___gte = nr_CD8___gte;
            return this;
        }

        public Builder setNr_linfociti___eq(Integer nr_linfociti___eq) {
            this.nr_linfociti___eq = nr_linfociti___eq;
            return this;
        }

        public Builder setNr_linfociti___ne(Integer nr_linfociti___ne) {
            this.nr_linfociti___ne = nr_linfociti___ne;
            return this;
        }

        public Builder setNr_linfociti___null(Boolean nr_linfociti___null) {
            this.nr_linfociti___null = nr_linfociti___null;
            return this;
        }

        public Builder setNr_linfociti___not___null(Boolean nr_linfociti___not___null) {
            this.nr_linfociti___not___null = nr_linfociti___not___null;
            return this;
        }

        public Builder setNr_linfociti___in(java.util.List<Integer> nr_linfociti___in) {
            this.nr_linfociti___in = nr_linfociti___in;
            return this;
        }

        public Builder setNr_linfociti___not___in(java.util.List<Integer> nr_linfociti___not___in) {
            this.nr_linfociti___not___in = nr_linfociti___not___in;
            return this;
        }

        public Builder setNr_linfociti___lt(Integer nr_linfociti___lt) {
            this.nr_linfociti___lt = nr_linfociti___lt;
            return this;
        }

        public Builder setNr_linfociti___lte(Integer nr_linfociti___lte) {
            this.nr_linfociti___lte = nr_linfociti___lte;
            return this;
        }

        public Builder setNr_linfociti___gt(Integer nr_linfociti___gt) {
            this.nr_linfociti___gt = nr_linfociti___gt;
            return this;
        }

        public Builder setNr_linfociti___gte(Integer nr_linfociti___gte) {
            this.nr_linfociti___gte = nr_linfociti___gte;
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

        public Builder setPerc_CD4___eq(String perc_CD4___eq) {
            this.perc_CD4___eq = perc_CD4___eq;
            return this;
        }

        public Builder setPerc_CD4___ne(String perc_CD4___ne) {
            this.perc_CD4___ne = perc_CD4___ne;
            return this;
        }

        public Builder setPerc_CD4___null(Boolean perc_CD4___null) {
            this.perc_CD4___null = perc_CD4___null;
            return this;
        }

        public Builder setPerc_CD4___not___null(Boolean perc_CD4___not___null) {
            this.perc_CD4___not___null = perc_CD4___not___null;
            return this;
        }

        public Builder setPerc_CD4___in(java.util.List<String> perc_CD4___in) {
            this.perc_CD4___in = perc_CD4___in;
            return this;
        }

        public Builder setPerc_CD4___not___in(java.util.List<String> perc_CD4___not___in) {
            this.perc_CD4___not___in = perc_CD4___not___in;
            return this;
        }

        public Builder setPerc_CD4___lt(String perc_CD4___lt) {
            this.perc_CD4___lt = perc_CD4___lt;
            return this;
        }

        public Builder setPerc_CD4___lte(String perc_CD4___lte) {
            this.perc_CD4___lte = perc_CD4___lte;
            return this;
        }

        public Builder setPerc_CD4___gt(String perc_CD4___gt) {
            this.perc_CD4___gt = perc_CD4___gt;
            return this;
        }

        public Builder setPerc_CD4___gte(String perc_CD4___gte) {
            this.perc_CD4___gte = perc_CD4___gte;
            return this;
        }

        public Builder setPerc_CD8___eq(String perc_CD8___eq) {
            this.perc_CD8___eq = perc_CD8___eq;
            return this;
        }

        public Builder setPerc_CD8___ne(String perc_CD8___ne) {
            this.perc_CD8___ne = perc_CD8___ne;
            return this;
        }

        public Builder setPerc_CD8___null(Boolean perc_CD8___null) {
            this.perc_CD8___null = perc_CD8___null;
            return this;
        }

        public Builder setPerc_CD8___not___null(Boolean perc_CD8___not___null) {
            this.perc_CD8___not___null = perc_CD8___not___null;
            return this;
        }

        public Builder setPerc_CD8___in(java.util.List<String> perc_CD8___in) {
            this.perc_CD8___in = perc_CD8___in;
            return this;
        }

        public Builder setPerc_CD8___not___in(java.util.List<String> perc_CD8___not___in) {
            this.perc_CD8___not___in = perc_CD8___not___in;
            return this;
        }

        public Builder setPerc_CD8___lt(String perc_CD8___lt) {
            this.perc_CD8___lt = perc_CD8___lt;
            return this;
        }

        public Builder setPerc_CD8___lte(String perc_CD8___lte) {
            this.perc_CD8___lte = perc_CD8___lte;
            return this;
        }

        public Builder setPerc_CD8___gt(String perc_CD8___gt) {
            this.perc_CD8___gt = perc_CD8___gt;
            return this;
        }

        public Builder setPerc_CD8___gte(String perc_CD8___gte) {
            this.perc_CD8___gte = perc_CD8___gte;
            return this;
        }

        public Builder setTropismo___eq(String tropismo___eq) {
            this.tropismo___eq = tropismo___eq;
            return this;
        }

        public Builder setTropismo___ne(String tropismo___ne) {
            this.tropismo___ne = tropismo___ne;
            return this;
        }

        public Builder setTropismo___null(Boolean tropismo___null) {
            this.tropismo___null = tropismo___null;
            return this;
        }

        public Builder setTropismo___not___null(Boolean tropismo___not___null) {
            this.tropismo___not___null = tropismo___not___null;
            return this;
        }

        public Builder setTropismo___in(java.util.List<String> tropismo___in) {
            this.tropismo___in = tropismo___in;
            return this;
        }

        public Builder setTropismo___not___in(java.util.List<String> tropismo___not___in) {
            this.tropismo___not___in = tropismo___not___in;
            return this;
        }

        public Builder setTropismo___lt(String tropismo___lt) {
            this.tropismo___lt = tropismo___lt;
            return this;
        }

        public Builder setTropismo___lte(String tropismo___lte) {
            this.tropismo___lte = tropismo___lte;
            return this;
        }

        public Builder setTropismo___gt(String tropismo___gt) {
            this.tropismo___gt = tropismo___gt;
            return this;
        }

        public Builder setTropismo___gte(String tropismo___gte) {
            this.tropismo___gte = tropismo___gte;
            return this;
        }

        public Builder setTropismo___contains(String tropismo___contains) {
            this.tropismo___contains = tropismo___contains;
            return this;
        }

        public Builder setTropismo___not___contains(String tropismo___not___contains) {
            this.tropismo___not___contains = tropismo___not___contains;
            return this;
        }

        public Builder setTropismo___starts_with(String tropismo___starts_with) {
            this.tropismo___starts_with = tropismo___starts_with;
            return this;
        }

        public Builder setTropismo___not___starts_with(String tropismo___not___starts_with) {
            this.tropismo___not___starts_with = tropismo___not___starts_with;
            return this;
        }

        public Builder setTropismo___ends_with(String tropismo___ends_with) {
            this.tropismo___ends_with = tropismo___ends_with;
            return this;
        }

        public Builder setTropismo___not___ends_with(String tropismo___not___ends_with) {
            this.tropismo___not___ends_with = tropismo___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliMarkers_HIVFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliMarkers_HIVFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliMarkers_HIVFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliMarkers_HIVFilterDTO build() {
            CliMarkers_HIVFilterDTO result = new CliMarkers_HIVFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
            result.setFPR___eq(this.FPR___eq);
            result.setFPR___ne(this.FPR___ne);
            result.setFPR___null(this.FPR___null);
            result.setFPR___not___null(this.FPR___not___null);
            result.setFPR___in(this.FPR___in);
            result.setFPR___not___in(this.FPR___not___in);
            result.setFPR___lt(this.FPR___lt);
            result.setFPR___lte(this.FPR___lte);
            result.setFPR___gt(this.FPR___gt);
            result.setFPR___gte(this.FPR___gte);
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
            result.setGeno2pheno___eq(this.geno2pheno___eq);
            result.setGeno2pheno___ne(this.geno2pheno___ne);
            result.setGeno2pheno___null(this.geno2pheno___null);
            result.setGeno2pheno___not___null(this.geno2pheno___not___null);
            result.setHivrna___eq(this.hivrna___eq);
            result.setHivrna___ne(this.hivrna___ne);
            result.setHivrna___null(this.hivrna___null);
            result.setHivrna___not___null(this.hivrna___not___null);
            result.setHivrna___in(this.hivrna___in);
            result.setHivrna___not___in(this.hivrna___not___in);
            result.setHivrna___lt(this.hivrna___lt);
            result.setHivrna___lte(this.hivrna___lte);
            result.setHivrna___gt(this.hivrna___gt);
            result.setHivrna___gte(this.hivrna___gte);
            result.setHivrna_segno___eq(this.hivrna_segno___eq);
            result.setHivrna_segno___ne(this.hivrna_segno___ne);
            result.setHivrna_segno___null(this.hivrna_segno___null);
            result.setHivrna_segno___not___null(this.hivrna_segno___not___null);
            result.setHivrna_segno___in(this.hivrna_segno___in);
            result.setHivrna_segno___not___in(this.hivrna_segno___not___in);
            result.setHivrna_segno___lt(this.hivrna_segno___lt);
            result.setHivrna_segno___lte(this.hivrna_segno___lte);
            result.setHivrna_segno___gt(this.hivrna_segno___gt);
            result.setHivrna_segno___gte(this.hivrna_segno___gte);
            result.setHivrna_segno___contains(this.hivrna_segno___contains);
            result.setHivrna_segno___not___contains(this.hivrna_segno___not___contains);
            result.setHivrna_segno___starts_with(this.hivrna_segno___starts_with);
            result.setHivrna_segno___not___starts_with(this.hivrna_segno___not___starts_with);
            result.setHivrna_segno___ends_with(this.hivrna_segno___ends_with);
            result.setHivrna_segno___not___ends_with(this.hivrna_segno___not___ends_with);
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
            result.setMetodica___eq(this.metodica___eq);
            result.setMetodica___ne(this.metodica___ne);
            result.setMetodica___null(this.metodica___null);
            result.setMetodica___not___null(this.metodica___not___null);
            result.setMetodica___in(this.metodica___in);
            result.setMetodica___not___in(this.metodica___not___in);
            result.setMetodica___lt(this.metodica___lt);
            result.setMetodica___lte(this.metodica___lte);
            result.setMetodica___gt(this.metodica___gt);
            result.setMetodica___gte(this.metodica___gte);
            result.setMetodica___contains(this.metodica___contains);
            result.setMetodica___not___contains(this.metodica___not___contains);
            result.setMetodica___starts_with(this.metodica___starts_with);
            result.setMetodica___not___starts_with(this.metodica___not___starts_with);
            result.setMetodica___ends_with(this.metodica___ends_with);
            result.setMetodica___not___ends_with(this.metodica___not___ends_with);
            result.setNr_CD4___eq(this.nr_CD4___eq);
            result.setNr_CD4___ne(this.nr_CD4___ne);
            result.setNr_CD4___null(this.nr_CD4___null);
            result.setNr_CD4___not___null(this.nr_CD4___not___null);
            result.setNr_CD4___in(this.nr_CD4___in);
            result.setNr_CD4___not___in(this.nr_CD4___not___in);
            result.setNr_CD4___lt(this.nr_CD4___lt);
            result.setNr_CD4___lte(this.nr_CD4___lte);
            result.setNr_CD4___gt(this.nr_CD4___gt);
            result.setNr_CD4___gte(this.nr_CD4___gte);
            result.setNr_CD8___eq(this.nr_CD8___eq);
            result.setNr_CD8___ne(this.nr_CD8___ne);
            result.setNr_CD8___null(this.nr_CD8___null);
            result.setNr_CD8___not___null(this.nr_CD8___not___null);
            result.setNr_CD8___in(this.nr_CD8___in);
            result.setNr_CD8___not___in(this.nr_CD8___not___in);
            result.setNr_CD8___lt(this.nr_CD8___lt);
            result.setNr_CD8___lte(this.nr_CD8___lte);
            result.setNr_CD8___gt(this.nr_CD8___gt);
            result.setNr_CD8___gte(this.nr_CD8___gte);
            result.setNr_linfociti___eq(this.nr_linfociti___eq);
            result.setNr_linfociti___ne(this.nr_linfociti___ne);
            result.setNr_linfociti___null(this.nr_linfociti___null);
            result.setNr_linfociti___not___null(this.nr_linfociti___not___null);
            result.setNr_linfociti___in(this.nr_linfociti___in);
            result.setNr_linfociti___not___in(this.nr_linfociti___not___in);
            result.setNr_linfociti___lt(this.nr_linfociti___lt);
            result.setNr_linfociti___lte(this.nr_linfociti___lte);
            result.setNr_linfociti___gt(this.nr_linfociti___gt);
            result.setNr_linfociti___gte(this.nr_linfociti___gte);
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
            result.setPerc_CD4___eq(this.perc_CD4___eq);
            result.setPerc_CD4___ne(this.perc_CD4___ne);
            result.setPerc_CD4___null(this.perc_CD4___null);
            result.setPerc_CD4___not___null(this.perc_CD4___not___null);
            result.setPerc_CD4___in(this.perc_CD4___in);
            result.setPerc_CD4___not___in(this.perc_CD4___not___in);
            result.setPerc_CD4___lt(this.perc_CD4___lt);
            result.setPerc_CD4___lte(this.perc_CD4___lte);
            result.setPerc_CD4___gt(this.perc_CD4___gt);
            result.setPerc_CD4___gte(this.perc_CD4___gte);
            result.setPerc_CD8___eq(this.perc_CD8___eq);
            result.setPerc_CD8___ne(this.perc_CD8___ne);
            result.setPerc_CD8___null(this.perc_CD8___null);
            result.setPerc_CD8___not___null(this.perc_CD8___not___null);
            result.setPerc_CD8___in(this.perc_CD8___in);
            result.setPerc_CD8___not___in(this.perc_CD8___not___in);
            result.setPerc_CD8___lt(this.perc_CD8___lt);
            result.setPerc_CD8___lte(this.perc_CD8___lte);
            result.setPerc_CD8___gt(this.perc_CD8___gt);
            result.setPerc_CD8___gte(this.perc_CD8___gte);
            result.setTropismo___eq(this.tropismo___eq);
            result.setTropismo___ne(this.tropismo___ne);
            result.setTropismo___null(this.tropismo___null);
            result.setTropismo___not___null(this.tropismo___not___null);
            result.setTropismo___in(this.tropismo___in);
            result.setTropismo___not___in(this.tropismo___not___in);
            result.setTropismo___lt(this.tropismo___lt);
            result.setTropismo___lte(this.tropismo___lte);
            result.setTropismo___gt(this.tropismo___gt);
            result.setTropismo___gte(this.tropismo___gte);
            result.setTropismo___contains(this.tropismo___contains);
            result.setTropismo___not___contains(this.tropismo___not___contains);
            result.setTropismo___starts_with(this.tropismo___starts_with);
            result.setTropismo___not___starts_with(this.tropismo___not___starts_with);
            result.setTropismo___ends_with(this.tropismo___ends_with);
            result.setTropismo___not___ends_with(this.tropismo___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
