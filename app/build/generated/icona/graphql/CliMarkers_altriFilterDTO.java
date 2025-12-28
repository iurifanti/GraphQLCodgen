package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Markers_altri.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMarkers_altriFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
    private String AP_CD34_15___eq;
    private String AP_CD34_15___ne;
    private Boolean AP_CD34_15___null;
    private Boolean AP_CD34_15___not___null;
    private java.util.List<String> AP_CD34_15___in;
    private java.util.List<String> AP_CD34_15___not___in;
    private String AP_CD34_15___lt;
    private String AP_CD34_15___lte;
    private String AP_CD34_15___gt;
    private String AP_CD34_15___gte;
    private String CD14_11b_51_61___eq;
    private String CD14_11b_51_61___ne;
    private Boolean CD14_11b_51_61___null;
    private Boolean CD14_11b_51_61___not___null;
    private java.util.List<String> CD14_11b_51_61___in;
    private java.util.List<String> CD14_11b_51_61___not___in;
    private String CD14_11b_51_61___lt;
    private String CD14_11b_51_61___lte;
    private String CD14_11b_51_61___gt;
    private String CD14_11b_51_61___gte;
    private String CDACT___eq;
    private String CDACT___ne;
    private Boolean CDACT___null;
    private Boolean CDACT___not___null;
    private java.util.List<String> CDACT___in;
    private java.util.List<String> CDACT___not___in;
    private String CDACT___lt;
    private String CDACT___lte;
    private String CDACT___gt;
    private String CDACT___gte;
    private String CMVIgG_OD___eq;
    private String CMVIgG_OD___ne;
    private Boolean CMVIgG_OD___null;
    private Boolean CMVIgG_OD___not___null;
    private java.util.List<String> CMVIgG_OD___in;
    private java.util.List<String> CMVIgG_OD___not___in;
    private String CMVIgG_OD___lt;
    private String CMVIgG_OD___lte;
    private String CMVIgG_OD___gt;
    private String CMVIgG_OD___gte;
    private String Cistatina_C___eq;
    private String Cistatina_C___ne;
    private Boolean Cistatina_C___null;
    private Boolean Cistatina_C___not___null;
    private java.util.List<String> Cistatina_C___in;
    private java.util.List<String> Cistatina_C___not___in;
    private String Cistatina_C___lt;
    private String Cistatina_C___lte;
    private String Cistatina_C___gt;
    private String Cistatina_C___gte;
    private String EndoCAb___eq;
    private String EndoCAb___ne;
    private Boolean EndoCAb___null;
    private Boolean EndoCAb___not___null;
    private java.util.List<String> EndoCAb___in;
    private java.util.List<String> EndoCAb___not___in;
    private String EndoCAb___lt;
    private String EndoCAb___lte;
    private String EndoCAb___gt;
    private String EndoCAb___gte;
    private String HLADR_cd38_cd8___eq;
    private String HLADR_cd38_cd8___ne;
    private Boolean HLADR_cd38_cd8___null;
    private Boolean HLADR_cd38_cd8___not___null;
    private java.util.List<String> HLADR_cd38_cd8___in;
    private java.util.List<String> HLADR_cd38_cd8___not___in;
    private String HLADR_cd38_cd8___lt;
    private String HLADR_cd38_cd8___lte;
    private String HLADR_cd38_cd8___gt;
    private String HLADR_cd38_cd8___gte;
    private String IL6___eq;
    private String IL6___ne;
    private Boolean IL6___null;
    private Boolean IL6___not___null;
    private java.util.List<String> IL6___in;
    private java.util.List<String> IL6___not___in;
    private String IL6___lt;
    private String IL6___lte;
    private String IL6___gt;
    private String IL6___gte;
    private String LPS___eq;
    private String LPS___ne;
    private Boolean LPS___null;
    private Boolean LPS___not___null;
    private java.util.List<String> LPS___in;
    private java.util.List<String> LPS___not___in;
    private String LPS___lt;
    private String LPS___lte;
    private String LPS___gt;
    private String LPS___gte;
    private String LPS_P___eq;
    private String LPS_P___ne;
    private Boolean LPS_P___null;
    private Boolean LPS_P___not___null;
    private java.util.List<String> LPS_P___in;
    private java.util.List<String> LPS_P___not___in;
    private String LPS_P___lt;
    private String LPS_P___lte;
    private String LPS_P___gt;
    private String LPS_P___gte;
    private String LPS_V___eq;
    private String LPS_V___ne;
    private Boolean LPS_V___null;
    private Boolean LPS_V___not___null;
    private java.util.List<String> LPS_V___in;
    private java.util.List<String> LPS_V___not___in;
    private String LPS_V___lt;
    private String LPS_V___lte;
    private String LPS_V___gt;
    private String LPS_V___gte;
    private String LPS_recovery___eq;
    private String LPS_recovery___ne;
    private Boolean LPS_recovery___null;
    private Boolean LPS_recovery___not___null;
    private java.util.List<String> LPS_recovery___in;
    private java.util.List<String> LPS_recovery___not___in;
    private String LPS_recovery___lt;
    private String LPS_recovery___lte;
    private String LPS_recovery___gt;
    private String LPS_recovery___gte;
    private String PCR___eq;
    private String PCR___ne;
    private Boolean PCR___null;
    private Boolean PCR___not___null;
    private java.util.List<String> PCR___in;
    private java.util.List<String> PCR___not___in;
    private String PCR___lt;
    private String PCR___lte;
    private String PCR___gt;
    private String PCR___gte;
    private String PCR_US___eq;
    private String PCR_US___ne;
    private Boolean PCR_US___null;
    private Boolean PCR_US___not___null;
    private java.util.List<String> PCR_US___in;
    private java.util.List<String> PCR_US___not___in;
    private String PCR_US___lt;
    private String PCR_US___lte;
    private String PCR_US___gt;
    private String PCR_US___gte;
    private String PTX3___eq;
    private String PTX3___ne;
    private Boolean PTX3___null;
    private Boolean PTX3___not___null;
    private java.util.List<String> PTX3___in;
    private java.util.List<String> PTX3___not___in;
    private String PTX3___lt;
    private String PTX3___lte;
    private String PTX3___gt;
    private String PTX3___gte;
    private String TNFa___eq;
    private String TNFa___ne;
    private Boolean TNFa___null;
    private Boolean TNFa___not___null;
    private java.util.List<String> TNFa___in;
    private java.util.List<String> TNFa___not___in;
    private String TNFa___lt;
    private String TNFa___lte;
    private String TNFa___gt;
    private String TNFa___gte;
    private Integer VCAM1___eq;
    private Integer VCAM1___ne;
    private Boolean VCAM1___null;
    private Boolean VCAM1___not___null;
    private java.util.List<Integer> VCAM1___in;
    private java.util.List<Integer> VCAM1___not___in;
    private Integer VCAM1___lt;
    private Integer VCAM1___lte;
    private Integer VCAM1___gt;
    private Integer VCAM1___gte;
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
    private String anti3S_AU___eq;
    private String anti3S_AU___ne;
    private Boolean anti3S_AU___null;
    private Boolean anti3S_AU___not___null;
    private java.util.List<String> anti3S_AU___in;
    private java.util.List<String> anti3S_AU___not___in;
    private String anti3S_AU___lt;
    private String anti3S_AU___lte;
    private String anti3S_AU___gt;
    private String anti3S_AU___gte;
    private Boolean cell___eq;
    private Boolean cell___ne;
    private Boolean cell___null;
    private Boolean cell___not___null;
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
    private String hivdna_copie_cells___eq;
    private String hivdna_copie_cells___ne;
    private Boolean hivdna_copie_cells___null;
    private Boolean hivdna_copie_cells___not___null;
    private java.util.List<String> hivdna_copie_cells___in;
    private java.util.List<String> hivdna_copie_cells___not___in;
    private String hivdna_copie_cells___lt;
    private String hivdna_copie_cells___lte;
    private String hivdna_copie_cells___gt;
    private String hivdna_copie_cells___gte;
    private String hivdna_copie_ml___eq;
    private String hivdna_copie_ml___ne;
    private Boolean hivdna_copie_ml___null;
    private Boolean hivdna_copie_ml___not___null;
    private java.util.List<String> hivdna_copie_ml___in;
    private java.util.List<String> hivdna_copie_ml___not___in;
    private String hivdna_copie_ml___lt;
    private String hivdna_copie_ml___lte;
    private String hivdna_copie_ml___gt;
    private String hivdna_copie_ml___gte;
    private Boolean reliab___eq;
    private Boolean reliab___ne;
    private Boolean reliab___null;
    private Boolean reliab___not___null;
    private String rs1840680___eq;
    private String rs1840680___ne;
    private Boolean rs1840680___null;
    private Boolean rs1840680___not___null;
    private java.util.List<String> rs1840680___in;
    private java.util.List<String> rs1840680___not___in;
    private String rs1840680___lt;
    private String rs1840680___lte;
    private String rs1840680___gt;
    private String rs1840680___gte;
    private String rs1840680___contains;
    private String rs1840680___not___contains;
    private String rs1840680___starts_with;
    private String rs1840680___not___starts_with;
    private String rs1840680___ends_with;
    private String rs1840680___not___ends_with;
    private String rs2305619___eq;
    private String rs2305619___ne;
    private Boolean rs2305619___null;
    private Boolean rs2305619___not___null;
    private java.util.List<String> rs2305619___in;
    private java.util.List<String> rs2305619___not___in;
    private String rs2305619___lt;
    private String rs2305619___lte;
    private String rs2305619___gt;
    private String rs2305619___gte;
    private String rs2305619___contains;
    private String rs2305619___not___contains;
    private String rs2305619___starts_with;
    private String rs2305619___not___starts_with;
    private String rs2305619___ends_with;
    private String rs2305619___not___ends_with;
    private String rs35948036___eq;
    private String rs35948036___ne;
    private Boolean rs35948036___null;
    private Boolean rs35948036___not___null;
    private java.util.List<String> rs35948036___in;
    private java.util.List<String> rs35948036___not___in;
    private String rs35948036___lt;
    private String rs35948036___lte;
    private String rs35948036___gt;
    private String rs35948036___gte;
    private String rs35948036___contains;
    private String rs35948036___not___contains;
    private String rs35948036___starts_with;
    private String rs35948036___not___starts_with;
    private String rs35948036___ends_with;
    private String rs35948036___not___ends_with;
    private String rs3845978___eq;
    private String rs3845978___ne;
    private Boolean rs3845978___null;
    private Boolean rs3845978___not___null;
    private java.util.List<String> rs3845978___in;
    private java.util.List<String> rs3845978___not___in;
    private String rs3845978___lt;
    private String rs3845978___lte;
    private String rs3845978___gt;
    private String rs3845978___gte;
    private String rs3845978___contains;
    private String rs3845978___not___contains;
    private String rs3845978___starts_with;
    private String rs3845978___not___starts_with;
    private String rs3845978___ends_with;
    private String rs3845978___not___ends_with;
    private String sCD___eq;
    private String sCD___ne;
    private Boolean sCD___null;
    private Boolean sCD___not___null;
    private java.util.List<String> sCD___in;
    private java.util.List<String> sCD___not___in;
    private String sCD___lt;
    private String sCD___lte;
    private String sCD___gt;
    private String sCD___gte;
    private String sCD14___eq;
    private String sCD14___ne;
    private Boolean sCD14___null;
    private Boolean sCD14___not___null;
    private java.util.List<String> sCD14___in;
    private java.util.List<String> sCD14___not___in;
    private String sCD14___lt;
    private String sCD14___lte;
    private String sCD14___gt;
    private String sCD14___gte;
    private String sCD163___eq;
    private String sCD163___ne;
    private Boolean sCD163___null;
    private Boolean sCD163___not___null;
    private java.util.List<String> sCD163___in;
    private java.util.List<String> sCD163___not___in;
    private String sCD163___lt;
    private String sCD163___lte;
    private String sCD163___gt;
    private String sCD163___gte;
    private String tipo_marker___eq;
    private String tipo_marker___ne;
    private Boolean tipo_marker___null;
    private Boolean tipo_marker___not___null;
    private java.util.List<String> tipo_marker___in;
    private java.util.List<String> tipo_marker___not___in;
    private String tipo_marker___lt;
    private String tipo_marker___lte;
    private String tipo_marker___gt;
    private String tipo_marker___gte;
    private String tipo_marker___contains;
    private String tipo_marker___not___contains;
    private String tipo_marker___starts_with;
    private String tipo_marker___not___starts_with;
    private String tipo_marker___ends_with;
    private String tipo_marker___not___ends_with;
    private String valore___eq;
    private String valore___ne;
    private Boolean valore___null;
    private Boolean valore___not___null;
    private java.util.List<String> valore___in;
    private java.util.List<String> valore___not___in;
    private String valore___lt;
    private String valore___lte;
    private String valore___gt;
    private String valore___gte;
    private String valore___contains;
    private String valore___not___contains;
    private String valore___starts_with;
    private String valore___not___starts_with;
    private String valore___ends_with;
    private String valore___not___ends_with;
    private Boolean variable___eq;
    private Boolean variable___ne;
    private Boolean variable___null;
    private Boolean variable___not___null;
    private String volume___eq;
    private String volume___ne;
    private Boolean volume___null;
    private Boolean volume___not___null;
    private java.util.List<String> volume___in;
    private java.util.List<String> volume___not___in;
    private String volume___lt;
    private String volume___lte;
    private String volume___gt;
    private String volume___gte;
    private String volume___contains;
    private String volume___not___contains;
    private String volume___starts_with;
    private String volume___not___starts_with;
    private String volume___ends_with;
    private String volume___not___ends_with;
    private java.util.List<CliMarkers_altriFilterDTO> AND;
    private java.util.List<CliMarkers_altriFilterDTO> OR;
    private CliMarkers_altriFilterDTO NOT;

    public CliMarkers_altriFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
    }

    public String getAP_CD34_15___eq() {
        return AP_CD34_15___eq;
    }
    public void setAP_CD34_15___eq(String AP_CD34_15___eq) {
        this.AP_CD34_15___eq = AP_CD34_15___eq;
    }

    public String getAP_CD34_15___ne() {
        return AP_CD34_15___ne;
    }
    public void setAP_CD34_15___ne(String AP_CD34_15___ne) {
        this.AP_CD34_15___ne = AP_CD34_15___ne;
    }

    public Boolean getAP_CD34_15___null() {
        return AP_CD34_15___null;
    }
    public void setAP_CD34_15___null(Boolean AP_CD34_15___null) {
        this.AP_CD34_15___null = AP_CD34_15___null;
    }

    public Boolean getAP_CD34_15___not___null() {
        return AP_CD34_15___not___null;
    }
    public void setAP_CD34_15___not___null(Boolean AP_CD34_15___not___null) {
        this.AP_CD34_15___not___null = AP_CD34_15___not___null;
    }

    public java.util.List<String> getAP_CD34_15___in() {
        return AP_CD34_15___in;
    }
    public void setAP_CD34_15___in(java.util.List<String> AP_CD34_15___in) {
        this.AP_CD34_15___in = AP_CD34_15___in;
    }

    public java.util.List<String> getAP_CD34_15___not___in() {
        return AP_CD34_15___not___in;
    }
    public void setAP_CD34_15___not___in(java.util.List<String> AP_CD34_15___not___in) {
        this.AP_CD34_15___not___in = AP_CD34_15___not___in;
    }

    public String getAP_CD34_15___lt() {
        return AP_CD34_15___lt;
    }
    public void setAP_CD34_15___lt(String AP_CD34_15___lt) {
        this.AP_CD34_15___lt = AP_CD34_15___lt;
    }

    public String getAP_CD34_15___lte() {
        return AP_CD34_15___lte;
    }
    public void setAP_CD34_15___lte(String AP_CD34_15___lte) {
        this.AP_CD34_15___lte = AP_CD34_15___lte;
    }

    public String getAP_CD34_15___gt() {
        return AP_CD34_15___gt;
    }
    public void setAP_CD34_15___gt(String AP_CD34_15___gt) {
        this.AP_CD34_15___gt = AP_CD34_15___gt;
    }

    public String getAP_CD34_15___gte() {
        return AP_CD34_15___gte;
    }
    public void setAP_CD34_15___gte(String AP_CD34_15___gte) {
        this.AP_CD34_15___gte = AP_CD34_15___gte;
    }

    public String getCD14_11b_51_61___eq() {
        return CD14_11b_51_61___eq;
    }
    public void setCD14_11b_51_61___eq(String CD14_11b_51_61___eq) {
        this.CD14_11b_51_61___eq = CD14_11b_51_61___eq;
    }

    public String getCD14_11b_51_61___ne() {
        return CD14_11b_51_61___ne;
    }
    public void setCD14_11b_51_61___ne(String CD14_11b_51_61___ne) {
        this.CD14_11b_51_61___ne = CD14_11b_51_61___ne;
    }

    public Boolean getCD14_11b_51_61___null() {
        return CD14_11b_51_61___null;
    }
    public void setCD14_11b_51_61___null(Boolean CD14_11b_51_61___null) {
        this.CD14_11b_51_61___null = CD14_11b_51_61___null;
    }

    public Boolean getCD14_11b_51_61___not___null() {
        return CD14_11b_51_61___not___null;
    }
    public void setCD14_11b_51_61___not___null(Boolean CD14_11b_51_61___not___null) {
        this.CD14_11b_51_61___not___null = CD14_11b_51_61___not___null;
    }

    public java.util.List<String> getCD14_11b_51_61___in() {
        return CD14_11b_51_61___in;
    }
    public void setCD14_11b_51_61___in(java.util.List<String> CD14_11b_51_61___in) {
        this.CD14_11b_51_61___in = CD14_11b_51_61___in;
    }

    public java.util.List<String> getCD14_11b_51_61___not___in() {
        return CD14_11b_51_61___not___in;
    }
    public void setCD14_11b_51_61___not___in(java.util.List<String> CD14_11b_51_61___not___in) {
        this.CD14_11b_51_61___not___in = CD14_11b_51_61___not___in;
    }

    public String getCD14_11b_51_61___lt() {
        return CD14_11b_51_61___lt;
    }
    public void setCD14_11b_51_61___lt(String CD14_11b_51_61___lt) {
        this.CD14_11b_51_61___lt = CD14_11b_51_61___lt;
    }

    public String getCD14_11b_51_61___lte() {
        return CD14_11b_51_61___lte;
    }
    public void setCD14_11b_51_61___lte(String CD14_11b_51_61___lte) {
        this.CD14_11b_51_61___lte = CD14_11b_51_61___lte;
    }

    public String getCD14_11b_51_61___gt() {
        return CD14_11b_51_61___gt;
    }
    public void setCD14_11b_51_61___gt(String CD14_11b_51_61___gt) {
        this.CD14_11b_51_61___gt = CD14_11b_51_61___gt;
    }

    public String getCD14_11b_51_61___gte() {
        return CD14_11b_51_61___gte;
    }
    public void setCD14_11b_51_61___gte(String CD14_11b_51_61___gte) {
        this.CD14_11b_51_61___gte = CD14_11b_51_61___gte;
    }

    public String getCDACT___eq() {
        return CDACT___eq;
    }
    public void setCDACT___eq(String CDACT___eq) {
        this.CDACT___eq = CDACT___eq;
    }

    public String getCDACT___ne() {
        return CDACT___ne;
    }
    public void setCDACT___ne(String CDACT___ne) {
        this.CDACT___ne = CDACT___ne;
    }

    public Boolean getCDACT___null() {
        return CDACT___null;
    }
    public void setCDACT___null(Boolean CDACT___null) {
        this.CDACT___null = CDACT___null;
    }

    public Boolean getCDACT___not___null() {
        return CDACT___not___null;
    }
    public void setCDACT___not___null(Boolean CDACT___not___null) {
        this.CDACT___not___null = CDACT___not___null;
    }

    public java.util.List<String> getCDACT___in() {
        return CDACT___in;
    }
    public void setCDACT___in(java.util.List<String> CDACT___in) {
        this.CDACT___in = CDACT___in;
    }

    public java.util.List<String> getCDACT___not___in() {
        return CDACT___not___in;
    }
    public void setCDACT___not___in(java.util.List<String> CDACT___not___in) {
        this.CDACT___not___in = CDACT___not___in;
    }

    public String getCDACT___lt() {
        return CDACT___lt;
    }
    public void setCDACT___lt(String CDACT___lt) {
        this.CDACT___lt = CDACT___lt;
    }

    public String getCDACT___lte() {
        return CDACT___lte;
    }
    public void setCDACT___lte(String CDACT___lte) {
        this.CDACT___lte = CDACT___lte;
    }

    public String getCDACT___gt() {
        return CDACT___gt;
    }
    public void setCDACT___gt(String CDACT___gt) {
        this.CDACT___gt = CDACT___gt;
    }

    public String getCDACT___gte() {
        return CDACT___gte;
    }
    public void setCDACT___gte(String CDACT___gte) {
        this.CDACT___gte = CDACT___gte;
    }

    public String getCMVIgG_OD___eq() {
        return CMVIgG_OD___eq;
    }
    public void setCMVIgG_OD___eq(String CMVIgG_OD___eq) {
        this.CMVIgG_OD___eq = CMVIgG_OD___eq;
    }

    public String getCMVIgG_OD___ne() {
        return CMVIgG_OD___ne;
    }
    public void setCMVIgG_OD___ne(String CMVIgG_OD___ne) {
        this.CMVIgG_OD___ne = CMVIgG_OD___ne;
    }

    public Boolean getCMVIgG_OD___null() {
        return CMVIgG_OD___null;
    }
    public void setCMVIgG_OD___null(Boolean CMVIgG_OD___null) {
        this.CMVIgG_OD___null = CMVIgG_OD___null;
    }

    public Boolean getCMVIgG_OD___not___null() {
        return CMVIgG_OD___not___null;
    }
    public void setCMVIgG_OD___not___null(Boolean CMVIgG_OD___not___null) {
        this.CMVIgG_OD___not___null = CMVIgG_OD___not___null;
    }

    public java.util.List<String> getCMVIgG_OD___in() {
        return CMVIgG_OD___in;
    }
    public void setCMVIgG_OD___in(java.util.List<String> CMVIgG_OD___in) {
        this.CMVIgG_OD___in = CMVIgG_OD___in;
    }

    public java.util.List<String> getCMVIgG_OD___not___in() {
        return CMVIgG_OD___not___in;
    }
    public void setCMVIgG_OD___not___in(java.util.List<String> CMVIgG_OD___not___in) {
        this.CMVIgG_OD___not___in = CMVIgG_OD___not___in;
    }

    public String getCMVIgG_OD___lt() {
        return CMVIgG_OD___lt;
    }
    public void setCMVIgG_OD___lt(String CMVIgG_OD___lt) {
        this.CMVIgG_OD___lt = CMVIgG_OD___lt;
    }

    public String getCMVIgG_OD___lte() {
        return CMVIgG_OD___lte;
    }
    public void setCMVIgG_OD___lte(String CMVIgG_OD___lte) {
        this.CMVIgG_OD___lte = CMVIgG_OD___lte;
    }

    public String getCMVIgG_OD___gt() {
        return CMVIgG_OD___gt;
    }
    public void setCMVIgG_OD___gt(String CMVIgG_OD___gt) {
        this.CMVIgG_OD___gt = CMVIgG_OD___gt;
    }

    public String getCMVIgG_OD___gte() {
        return CMVIgG_OD___gte;
    }
    public void setCMVIgG_OD___gte(String CMVIgG_OD___gte) {
        this.CMVIgG_OD___gte = CMVIgG_OD___gte;
    }

    public String getCistatina_C___eq() {
        return Cistatina_C___eq;
    }
    public void setCistatina_C___eq(String Cistatina_C___eq) {
        this.Cistatina_C___eq = Cistatina_C___eq;
    }

    public String getCistatina_C___ne() {
        return Cistatina_C___ne;
    }
    public void setCistatina_C___ne(String Cistatina_C___ne) {
        this.Cistatina_C___ne = Cistatina_C___ne;
    }

    public Boolean getCistatina_C___null() {
        return Cistatina_C___null;
    }
    public void setCistatina_C___null(Boolean Cistatina_C___null) {
        this.Cistatina_C___null = Cistatina_C___null;
    }

    public Boolean getCistatina_C___not___null() {
        return Cistatina_C___not___null;
    }
    public void setCistatina_C___not___null(Boolean Cistatina_C___not___null) {
        this.Cistatina_C___not___null = Cistatina_C___not___null;
    }

    public java.util.List<String> getCistatina_C___in() {
        return Cistatina_C___in;
    }
    public void setCistatina_C___in(java.util.List<String> Cistatina_C___in) {
        this.Cistatina_C___in = Cistatina_C___in;
    }

    public java.util.List<String> getCistatina_C___not___in() {
        return Cistatina_C___not___in;
    }
    public void setCistatina_C___not___in(java.util.List<String> Cistatina_C___not___in) {
        this.Cistatina_C___not___in = Cistatina_C___not___in;
    }

    public String getCistatina_C___lt() {
        return Cistatina_C___lt;
    }
    public void setCistatina_C___lt(String Cistatina_C___lt) {
        this.Cistatina_C___lt = Cistatina_C___lt;
    }

    public String getCistatina_C___lte() {
        return Cistatina_C___lte;
    }
    public void setCistatina_C___lte(String Cistatina_C___lte) {
        this.Cistatina_C___lte = Cistatina_C___lte;
    }

    public String getCistatina_C___gt() {
        return Cistatina_C___gt;
    }
    public void setCistatina_C___gt(String Cistatina_C___gt) {
        this.Cistatina_C___gt = Cistatina_C___gt;
    }

    public String getCistatina_C___gte() {
        return Cistatina_C___gte;
    }
    public void setCistatina_C___gte(String Cistatina_C___gte) {
        this.Cistatina_C___gte = Cistatina_C___gte;
    }

    public String getEndoCAb___eq() {
        return EndoCAb___eq;
    }
    public void setEndoCAb___eq(String EndoCAb___eq) {
        this.EndoCAb___eq = EndoCAb___eq;
    }

    public String getEndoCAb___ne() {
        return EndoCAb___ne;
    }
    public void setEndoCAb___ne(String EndoCAb___ne) {
        this.EndoCAb___ne = EndoCAb___ne;
    }

    public Boolean getEndoCAb___null() {
        return EndoCAb___null;
    }
    public void setEndoCAb___null(Boolean EndoCAb___null) {
        this.EndoCAb___null = EndoCAb___null;
    }

    public Boolean getEndoCAb___not___null() {
        return EndoCAb___not___null;
    }
    public void setEndoCAb___not___null(Boolean EndoCAb___not___null) {
        this.EndoCAb___not___null = EndoCAb___not___null;
    }

    public java.util.List<String> getEndoCAb___in() {
        return EndoCAb___in;
    }
    public void setEndoCAb___in(java.util.List<String> EndoCAb___in) {
        this.EndoCAb___in = EndoCAb___in;
    }

    public java.util.List<String> getEndoCAb___not___in() {
        return EndoCAb___not___in;
    }
    public void setEndoCAb___not___in(java.util.List<String> EndoCAb___not___in) {
        this.EndoCAb___not___in = EndoCAb___not___in;
    }

    public String getEndoCAb___lt() {
        return EndoCAb___lt;
    }
    public void setEndoCAb___lt(String EndoCAb___lt) {
        this.EndoCAb___lt = EndoCAb___lt;
    }

    public String getEndoCAb___lte() {
        return EndoCAb___lte;
    }
    public void setEndoCAb___lte(String EndoCAb___lte) {
        this.EndoCAb___lte = EndoCAb___lte;
    }

    public String getEndoCAb___gt() {
        return EndoCAb___gt;
    }
    public void setEndoCAb___gt(String EndoCAb___gt) {
        this.EndoCAb___gt = EndoCAb___gt;
    }

    public String getEndoCAb___gte() {
        return EndoCAb___gte;
    }
    public void setEndoCAb___gte(String EndoCAb___gte) {
        this.EndoCAb___gte = EndoCAb___gte;
    }

    public String getHLADR_cd38_cd8___eq() {
        return HLADR_cd38_cd8___eq;
    }
    public void setHLADR_cd38_cd8___eq(String HLADR_cd38_cd8___eq) {
        this.HLADR_cd38_cd8___eq = HLADR_cd38_cd8___eq;
    }

    public String getHLADR_cd38_cd8___ne() {
        return HLADR_cd38_cd8___ne;
    }
    public void setHLADR_cd38_cd8___ne(String HLADR_cd38_cd8___ne) {
        this.HLADR_cd38_cd8___ne = HLADR_cd38_cd8___ne;
    }

    public Boolean getHLADR_cd38_cd8___null() {
        return HLADR_cd38_cd8___null;
    }
    public void setHLADR_cd38_cd8___null(Boolean HLADR_cd38_cd8___null) {
        this.HLADR_cd38_cd8___null = HLADR_cd38_cd8___null;
    }

    public Boolean getHLADR_cd38_cd8___not___null() {
        return HLADR_cd38_cd8___not___null;
    }
    public void setHLADR_cd38_cd8___not___null(Boolean HLADR_cd38_cd8___not___null) {
        this.HLADR_cd38_cd8___not___null = HLADR_cd38_cd8___not___null;
    }

    public java.util.List<String> getHLADR_cd38_cd8___in() {
        return HLADR_cd38_cd8___in;
    }
    public void setHLADR_cd38_cd8___in(java.util.List<String> HLADR_cd38_cd8___in) {
        this.HLADR_cd38_cd8___in = HLADR_cd38_cd8___in;
    }

    public java.util.List<String> getHLADR_cd38_cd8___not___in() {
        return HLADR_cd38_cd8___not___in;
    }
    public void setHLADR_cd38_cd8___not___in(java.util.List<String> HLADR_cd38_cd8___not___in) {
        this.HLADR_cd38_cd8___not___in = HLADR_cd38_cd8___not___in;
    }

    public String getHLADR_cd38_cd8___lt() {
        return HLADR_cd38_cd8___lt;
    }
    public void setHLADR_cd38_cd8___lt(String HLADR_cd38_cd8___lt) {
        this.HLADR_cd38_cd8___lt = HLADR_cd38_cd8___lt;
    }

    public String getHLADR_cd38_cd8___lte() {
        return HLADR_cd38_cd8___lte;
    }
    public void setHLADR_cd38_cd8___lte(String HLADR_cd38_cd8___lte) {
        this.HLADR_cd38_cd8___lte = HLADR_cd38_cd8___lte;
    }

    public String getHLADR_cd38_cd8___gt() {
        return HLADR_cd38_cd8___gt;
    }
    public void setHLADR_cd38_cd8___gt(String HLADR_cd38_cd8___gt) {
        this.HLADR_cd38_cd8___gt = HLADR_cd38_cd8___gt;
    }

    public String getHLADR_cd38_cd8___gte() {
        return HLADR_cd38_cd8___gte;
    }
    public void setHLADR_cd38_cd8___gte(String HLADR_cd38_cd8___gte) {
        this.HLADR_cd38_cd8___gte = HLADR_cd38_cd8___gte;
    }

    public String getIL6___eq() {
        return IL6___eq;
    }
    public void setIL6___eq(String IL6___eq) {
        this.IL6___eq = IL6___eq;
    }

    public String getIL6___ne() {
        return IL6___ne;
    }
    public void setIL6___ne(String IL6___ne) {
        this.IL6___ne = IL6___ne;
    }

    public Boolean getIL6___null() {
        return IL6___null;
    }
    public void setIL6___null(Boolean IL6___null) {
        this.IL6___null = IL6___null;
    }

    public Boolean getIL6___not___null() {
        return IL6___not___null;
    }
    public void setIL6___not___null(Boolean IL6___not___null) {
        this.IL6___not___null = IL6___not___null;
    }

    public java.util.List<String> getIL6___in() {
        return IL6___in;
    }
    public void setIL6___in(java.util.List<String> IL6___in) {
        this.IL6___in = IL6___in;
    }

    public java.util.List<String> getIL6___not___in() {
        return IL6___not___in;
    }
    public void setIL6___not___in(java.util.List<String> IL6___not___in) {
        this.IL6___not___in = IL6___not___in;
    }

    public String getIL6___lt() {
        return IL6___lt;
    }
    public void setIL6___lt(String IL6___lt) {
        this.IL6___lt = IL6___lt;
    }

    public String getIL6___lte() {
        return IL6___lte;
    }
    public void setIL6___lte(String IL6___lte) {
        this.IL6___lte = IL6___lte;
    }

    public String getIL6___gt() {
        return IL6___gt;
    }
    public void setIL6___gt(String IL6___gt) {
        this.IL6___gt = IL6___gt;
    }

    public String getIL6___gte() {
        return IL6___gte;
    }
    public void setIL6___gte(String IL6___gte) {
        this.IL6___gte = IL6___gte;
    }

    public String getLPS___eq() {
        return LPS___eq;
    }
    public void setLPS___eq(String LPS___eq) {
        this.LPS___eq = LPS___eq;
    }

    public String getLPS___ne() {
        return LPS___ne;
    }
    public void setLPS___ne(String LPS___ne) {
        this.LPS___ne = LPS___ne;
    }

    public Boolean getLPS___null() {
        return LPS___null;
    }
    public void setLPS___null(Boolean LPS___null) {
        this.LPS___null = LPS___null;
    }

    public Boolean getLPS___not___null() {
        return LPS___not___null;
    }
    public void setLPS___not___null(Boolean LPS___not___null) {
        this.LPS___not___null = LPS___not___null;
    }

    public java.util.List<String> getLPS___in() {
        return LPS___in;
    }
    public void setLPS___in(java.util.List<String> LPS___in) {
        this.LPS___in = LPS___in;
    }

    public java.util.List<String> getLPS___not___in() {
        return LPS___not___in;
    }
    public void setLPS___not___in(java.util.List<String> LPS___not___in) {
        this.LPS___not___in = LPS___not___in;
    }

    public String getLPS___lt() {
        return LPS___lt;
    }
    public void setLPS___lt(String LPS___lt) {
        this.LPS___lt = LPS___lt;
    }

    public String getLPS___lte() {
        return LPS___lte;
    }
    public void setLPS___lte(String LPS___lte) {
        this.LPS___lte = LPS___lte;
    }

    public String getLPS___gt() {
        return LPS___gt;
    }
    public void setLPS___gt(String LPS___gt) {
        this.LPS___gt = LPS___gt;
    }

    public String getLPS___gte() {
        return LPS___gte;
    }
    public void setLPS___gte(String LPS___gte) {
        this.LPS___gte = LPS___gte;
    }

    public String getLPS_P___eq() {
        return LPS_P___eq;
    }
    public void setLPS_P___eq(String LPS_P___eq) {
        this.LPS_P___eq = LPS_P___eq;
    }

    public String getLPS_P___ne() {
        return LPS_P___ne;
    }
    public void setLPS_P___ne(String LPS_P___ne) {
        this.LPS_P___ne = LPS_P___ne;
    }

    public Boolean getLPS_P___null() {
        return LPS_P___null;
    }
    public void setLPS_P___null(Boolean LPS_P___null) {
        this.LPS_P___null = LPS_P___null;
    }

    public Boolean getLPS_P___not___null() {
        return LPS_P___not___null;
    }
    public void setLPS_P___not___null(Boolean LPS_P___not___null) {
        this.LPS_P___not___null = LPS_P___not___null;
    }

    public java.util.List<String> getLPS_P___in() {
        return LPS_P___in;
    }
    public void setLPS_P___in(java.util.List<String> LPS_P___in) {
        this.LPS_P___in = LPS_P___in;
    }

    public java.util.List<String> getLPS_P___not___in() {
        return LPS_P___not___in;
    }
    public void setLPS_P___not___in(java.util.List<String> LPS_P___not___in) {
        this.LPS_P___not___in = LPS_P___not___in;
    }

    public String getLPS_P___lt() {
        return LPS_P___lt;
    }
    public void setLPS_P___lt(String LPS_P___lt) {
        this.LPS_P___lt = LPS_P___lt;
    }

    public String getLPS_P___lte() {
        return LPS_P___lte;
    }
    public void setLPS_P___lte(String LPS_P___lte) {
        this.LPS_P___lte = LPS_P___lte;
    }

    public String getLPS_P___gt() {
        return LPS_P___gt;
    }
    public void setLPS_P___gt(String LPS_P___gt) {
        this.LPS_P___gt = LPS_P___gt;
    }

    public String getLPS_P___gte() {
        return LPS_P___gte;
    }
    public void setLPS_P___gte(String LPS_P___gte) {
        this.LPS_P___gte = LPS_P___gte;
    }

    public String getLPS_V___eq() {
        return LPS_V___eq;
    }
    public void setLPS_V___eq(String LPS_V___eq) {
        this.LPS_V___eq = LPS_V___eq;
    }

    public String getLPS_V___ne() {
        return LPS_V___ne;
    }
    public void setLPS_V___ne(String LPS_V___ne) {
        this.LPS_V___ne = LPS_V___ne;
    }

    public Boolean getLPS_V___null() {
        return LPS_V___null;
    }
    public void setLPS_V___null(Boolean LPS_V___null) {
        this.LPS_V___null = LPS_V___null;
    }

    public Boolean getLPS_V___not___null() {
        return LPS_V___not___null;
    }
    public void setLPS_V___not___null(Boolean LPS_V___not___null) {
        this.LPS_V___not___null = LPS_V___not___null;
    }

    public java.util.List<String> getLPS_V___in() {
        return LPS_V___in;
    }
    public void setLPS_V___in(java.util.List<String> LPS_V___in) {
        this.LPS_V___in = LPS_V___in;
    }

    public java.util.List<String> getLPS_V___not___in() {
        return LPS_V___not___in;
    }
    public void setLPS_V___not___in(java.util.List<String> LPS_V___not___in) {
        this.LPS_V___not___in = LPS_V___not___in;
    }

    public String getLPS_V___lt() {
        return LPS_V___lt;
    }
    public void setLPS_V___lt(String LPS_V___lt) {
        this.LPS_V___lt = LPS_V___lt;
    }

    public String getLPS_V___lte() {
        return LPS_V___lte;
    }
    public void setLPS_V___lte(String LPS_V___lte) {
        this.LPS_V___lte = LPS_V___lte;
    }

    public String getLPS_V___gt() {
        return LPS_V___gt;
    }
    public void setLPS_V___gt(String LPS_V___gt) {
        this.LPS_V___gt = LPS_V___gt;
    }

    public String getLPS_V___gte() {
        return LPS_V___gte;
    }
    public void setLPS_V___gte(String LPS_V___gte) {
        this.LPS_V___gte = LPS_V___gte;
    }

    public String getLPS_recovery___eq() {
        return LPS_recovery___eq;
    }
    public void setLPS_recovery___eq(String LPS_recovery___eq) {
        this.LPS_recovery___eq = LPS_recovery___eq;
    }

    public String getLPS_recovery___ne() {
        return LPS_recovery___ne;
    }
    public void setLPS_recovery___ne(String LPS_recovery___ne) {
        this.LPS_recovery___ne = LPS_recovery___ne;
    }

    public Boolean getLPS_recovery___null() {
        return LPS_recovery___null;
    }
    public void setLPS_recovery___null(Boolean LPS_recovery___null) {
        this.LPS_recovery___null = LPS_recovery___null;
    }

    public Boolean getLPS_recovery___not___null() {
        return LPS_recovery___not___null;
    }
    public void setLPS_recovery___not___null(Boolean LPS_recovery___not___null) {
        this.LPS_recovery___not___null = LPS_recovery___not___null;
    }

    public java.util.List<String> getLPS_recovery___in() {
        return LPS_recovery___in;
    }
    public void setLPS_recovery___in(java.util.List<String> LPS_recovery___in) {
        this.LPS_recovery___in = LPS_recovery___in;
    }

    public java.util.List<String> getLPS_recovery___not___in() {
        return LPS_recovery___not___in;
    }
    public void setLPS_recovery___not___in(java.util.List<String> LPS_recovery___not___in) {
        this.LPS_recovery___not___in = LPS_recovery___not___in;
    }

    public String getLPS_recovery___lt() {
        return LPS_recovery___lt;
    }
    public void setLPS_recovery___lt(String LPS_recovery___lt) {
        this.LPS_recovery___lt = LPS_recovery___lt;
    }

    public String getLPS_recovery___lte() {
        return LPS_recovery___lte;
    }
    public void setLPS_recovery___lte(String LPS_recovery___lte) {
        this.LPS_recovery___lte = LPS_recovery___lte;
    }

    public String getLPS_recovery___gt() {
        return LPS_recovery___gt;
    }
    public void setLPS_recovery___gt(String LPS_recovery___gt) {
        this.LPS_recovery___gt = LPS_recovery___gt;
    }

    public String getLPS_recovery___gte() {
        return LPS_recovery___gte;
    }
    public void setLPS_recovery___gte(String LPS_recovery___gte) {
        this.LPS_recovery___gte = LPS_recovery___gte;
    }

    public String getPCR___eq() {
        return PCR___eq;
    }
    public void setPCR___eq(String PCR___eq) {
        this.PCR___eq = PCR___eq;
    }

    public String getPCR___ne() {
        return PCR___ne;
    }
    public void setPCR___ne(String PCR___ne) {
        this.PCR___ne = PCR___ne;
    }

    public Boolean getPCR___null() {
        return PCR___null;
    }
    public void setPCR___null(Boolean PCR___null) {
        this.PCR___null = PCR___null;
    }

    public Boolean getPCR___not___null() {
        return PCR___not___null;
    }
    public void setPCR___not___null(Boolean PCR___not___null) {
        this.PCR___not___null = PCR___not___null;
    }

    public java.util.List<String> getPCR___in() {
        return PCR___in;
    }
    public void setPCR___in(java.util.List<String> PCR___in) {
        this.PCR___in = PCR___in;
    }

    public java.util.List<String> getPCR___not___in() {
        return PCR___not___in;
    }
    public void setPCR___not___in(java.util.List<String> PCR___not___in) {
        this.PCR___not___in = PCR___not___in;
    }

    public String getPCR___lt() {
        return PCR___lt;
    }
    public void setPCR___lt(String PCR___lt) {
        this.PCR___lt = PCR___lt;
    }

    public String getPCR___lte() {
        return PCR___lte;
    }
    public void setPCR___lte(String PCR___lte) {
        this.PCR___lte = PCR___lte;
    }

    public String getPCR___gt() {
        return PCR___gt;
    }
    public void setPCR___gt(String PCR___gt) {
        this.PCR___gt = PCR___gt;
    }

    public String getPCR___gte() {
        return PCR___gte;
    }
    public void setPCR___gte(String PCR___gte) {
        this.PCR___gte = PCR___gte;
    }

    public String getPCR_US___eq() {
        return PCR_US___eq;
    }
    public void setPCR_US___eq(String PCR_US___eq) {
        this.PCR_US___eq = PCR_US___eq;
    }

    public String getPCR_US___ne() {
        return PCR_US___ne;
    }
    public void setPCR_US___ne(String PCR_US___ne) {
        this.PCR_US___ne = PCR_US___ne;
    }

    public Boolean getPCR_US___null() {
        return PCR_US___null;
    }
    public void setPCR_US___null(Boolean PCR_US___null) {
        this.PCR_US___null = PCR_US___null;
    }

    public Boolean getPCR_US___not___null() {
        return PCR_US___not___null;
    }
    public void setPCR_US___not___null(Boolean PCR_US___not___null) {
        this.PCR_US___not___null = PCR_US___not___null;
    }

    public java.util.List<String> getPCR_US___in() {
        return PCR_US___in;
    }
    public void setPCR_US___in(java.util.List<String> PCR_US___in) {
        this.PCR_US___in = PCR_US___in;
    }

    public java.util.List<String> getPCR_US___not___in() {
        return PCR_US___not___in;
    }
    public void setPCR_US___not___in(java.util.List<String> PCR_US___not___in) {
        this.PCR_US___not___in = PCR_US___not___in;
    }

    public String getPCR_US___lt() {
        return PCR_US___lt;
    }
    public void setPCR_US___lt(String PCR_US___lt) {
        this.PCR_US___lt = PCR_US___lt;
    }

    public String getPCR_US___lte() {
        return PCR_US___lte;
    }
    public void setPCR_US___lte(String PCR_US___lte) {
        this.PCR_US___lte = PCR_US___lte;
    }

    public String getPCR_US___gt() {
        return PCR_US___gt;
    }
    public void setPCR_US___gt(String PCR_US___gt) {
        this.PCR_US___gt = PCR_US___gt;
    }

    public String getPCR_US___gte() {
        return PCR_US___gte;
    }
    public void setPCR_US___gte(String PCR_US___gte) {
        this.PCR_US___gte = PCR_US___gte;
    }

    public String getPTX3___eq() {
        return PTX3___eq;
    }
    public void setPTX3___eq(String PTX3___eq) {
        this.PTX3___eq = PTX3___eq;
    }

    public String getPTX3___ne() {
        return PTX3___ne;
    }
    public void setPTX3___ne(String PTX3___ne) {
        this.PTX3___ne = PTX3___ne;
    }

    public Boolean getPTX3___null() {
        return PTX3___null;
    }
    public void setPTX3___null(Boolean PTX3___null) {
        this.PTX3___null = PTX3___null;
    }

    public Boolean getPTX3___not___null() {
        return PTX3___not___null;
    }
    public void setPTX3___not___null(Boolean PTX3___not___null) {
        this.PTX3___not___null = PTX3___not___null;
    }

    public java.util.List<String> getPTX3___in() {
        return PTX3___in;
    }
    public void setPTX3___in(java.util.List<String> PTX3___in) {
        this.PTX3___in = PTX3___in;
    }

    public java.util.List<String> getPTX3___not___in() {
        return PTX3___not___in;
    }
    public void setPTX3___not___in(java.util.List<String> PTX3___not___in) {
        this.PTX3___not___in = PTX3___not___in;
    }

    public String getPTX3___lt() {
        return PTX3___lt;
    }
    public void setPTX3___lt(String PTX3___lt) {
        this.PTX3___lt = PTX3___lt;
    }

    public String getPTX3___lte() {
        return PTX3___lte;
    }
    public void setPTX3___lte(String PTX3___lte) {
        this.PTX3___lte = PTX3___lte;
    }

    public String getPTX3___gt() {
        return PTX3___gt;
    }
    public void setPTX3___gt(String PTX3___gt) {
        this.PTX3___gt = PTX3___gt;
    }

    public String getPTX3___gte() {
        return PTX3___gte;
    }
    public void setPTX3___gte(String PTX3___gte) {
        this.PTX3___gte = PTX3___gte;
    }

    public String getTNFa___eq() {
        return TNFa___eq;
    }
    public void setTNFa___eq(String TNFa___eq) {
        this.TNFa___eq = TNFa___eq;
    }

    public String getTNFa___ne() {
        return TNFa___ne;
    }
    public void setTNFa___ne(String TNFa___ne) {
        this.TNFa___ne = TNFa___ne;
    }

    public Boolean getTNFa___null() {
        return TNFa___null;
    }
    public void setTNFa___null(Boolean TNFa___null) {
        this.TNFa___null = TNFa___null;
    }

    public Boolean getTNFa___not___null() {
        return TNFa___not___null;
    }
    public void setTNFa___not___null(Boolean TNFa___not___null) {
        this.TNFa___not___null = TNFa___not___null;
    }

    public java.util.List<String> getTNFa___in() {
        return TNFa___in;
    }
    public void setTNFa___in(java.util.List<String> TNFa___in) {
        this.TNFa___in = TNFa___in;
    }

    public java.util.List<String> getTNFa___not___in() {
        return TNFa___not___in;
    }
    public void setTNFa___not___in(java.util.List<String> TNFa___not___in) {
        this.TNFa___not___in = TNFa___not___in;
    }

    public String getTNFa___lt() {
        return TNFa___lt;
    }
    public void setTNFa___lt(String TNFa___lt) {
        this.TNFa___lt = TNFa___lt;
    }

    public String getTNFa___lte() {
        return TNFa___lte;
    }
    public void setTNFa___lte(String TNFa___lte) {
        this.TNFa___lte = TNFa___lte;
    }

    public String getTNFa___gt() {
        return TNFa___gt;
    }
    public void setTNFa___gt(String TNFa___gt) {
        this.TNFa___gt = TNFa___gt;
    }

    public String getTNFa___gte() {
        return TNFa___gte;
    }
    public void setTNFa___gte(String TNFa___gte) {
        this.TNFa___gte = TNFa___gte;
    }

    public Integer getVCAM1___eq() {
        return VCAM1___eq;
    }
    public void setVCAM1___eq(Integer VCAM1___eq) {
        this.VCAM1___eq = VCAM1___eq;
    }

    public Integer getVCAM1___ne() {
        return VCAM1___ne;
    }
    public void setVCAM1___ne(Integer VCAM1___ne) {
        this.VCAM1___ne = VCAM1___ne;
    }

    public Boolean getVCAM1___null() {
        return VCAM1___null;
    }
    public void setVCAM1___null(Boolean VCAM1___null) {
        this.VCAM1___null = VCAM1___null;
    }

    public Boolean getVCAM1___not___null() {
        return VCAM1___not___null;
    }
    public void setVCAM1___not___null(Boolean VCAM1___not___null) {
        this.VCAM1___not___null = VCAM1___not___null;
    }

    public java.util.List<Integer> getVCAM1___in() {
        return VCAM1___in;
    }
    public void setVCAM1___in(java.util.List<Integer> VCAM1___in) {
        this.VCAM1___in = VCAM1___in;
    }

    public java.util.List<Integer> getVCAM1___not___in() {
        return VCAM1___not___in;
    }
    public void setVCAM1___not___in(java.util.List<Integer> VCAM1___not___in) {
        this.VCAM1___not___in = VCAM1___not___in;
    }

    public Integer getVCAM1___lt() {
        return VCAM1___lt;
    }
    public void setVCAM1___lt(Integer VCAM1___lt) {
        this.VCAM1___lt = VCAM1___lt;
    }

    public Integer getVCAM1___lte() {
        return VCAM1___lte;
    }
    public void setVCAM1___lte(Integer VCAM1___lte) {
        this.VCAM1___lte = VCAM1___lte;
    }

    public Integer getVCAM1___gt() {
        return VCAM1___gt;
    }
    public void setVCAM1___gt(Integer VCAM1___gt) {
        this.VCAM1___gt = VCAM1___gt;
    }

    public Integer getVCAM1___gte() {
        return VCAM1___gte;
    }
    public void setVCAM1___gte(Integer VCAM1___gte) {
        this.VCAM1___gte = VCAM1___gte;
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

    public String getAnti3S_AU___eq() {
        return anti3S_AU___eq;
    }
    public void setAnti3S_AU___eq(String anti3S_AU___eq) {
        this.anti3S_AU___eq = anti3S_AU___eq;
    }

    public String getAnti3S_AU___ne() {
        return anti3S_AU___ne;
    }
    public void setAnti3S_AU___ne(String anti3S_AU___ne) {
        this.anti3S_AU___ne = anti3S_AU___ne;
    }

    public Boolean getAnti3S_AU___null() {
        return anti3S_AU___null;
    }
    public void setAnti3S_AU___null(Boolean anti3S_AU___null) {
        this.anti3S_AU___null = anti3S_AU___null;
    }

    public Boolean getAnti3S_AU___not___null() {
        return anti3S_AU___not___null;
    }
    public void setAnti3S_AU___not___null(Boolean anti3S_AU___not___null) {
        this.anti3S_AU___not___null = anti3S_AU___not___null;
    }

    public java.util.List<String> getAnti3S_AU___in() {
        return anti3S_AU___in;
    }
    public void setAnti3S_AU___in(java.util.List<String> anti3S_AU___in) {
        this.anti3S_AU___in = anti3S_AU___in;
    }

    public java.util.List<String> getAnti3S_AU___not___in() {
        return anti3S_AU___not___in;
    }
    public void setAnti3S_AU___not___in(java.util.List<String> anti3S_AU___not___in) {
        this.anti3S_AU___not___in = anti3S_AU___not___in;
    }

    public String getAnti3S_AU___lt() {
        return anti3S_AU___lt;
    }
    public void setAnti3S_AU___lt(String anti3S_AU___lt) {
        this.anti3S_AU___lt = anti3S_AU___lt;
    }

    public String getAnti3S_AU___lte() {
        return anti3S_AU___lte;
    }
    public void setAnti3S_AU___lte(String anti3S_AU___lte) {
        this.anti3S_AU___lte = anti3S_AU___lte;
    }

    public String getAnti3S_AU___gt() {
        return anti3S_AU___gt;
    }
    public void setAnti3S_AU___gt(String anti3S_AU___gt) {
        this.anti3S_AU___gt = anti3S_AU___gt;
    }

    public String getAnti3S_AU___gte() {
        return anti3S_AU___gte;
    }
    public void setAnti3S_AU___gte(String anti3S_AU___gte) {
        this.anti3S_AU___gte = anti3S_AU___gte;
    }

    public Boolean getCell___eq() {
        return cell___eq;
    }
    public void setCell___eq(Boolean cell___eq) {
        this.cell___eq = cell___eq;
    }

    public Boolean getCell___ne() {
        return cell___ne;
    }
    public void setCell___ne(Boolean cell___ne) {
        this.cell___ne = cell___ne;
    }

    public Boolean getCell___null() {
        return cell___null;
    }
    public void setCell___null(Boolean cell___null) {
        this.cell___null = cell___null;
    }

    public Boolean getCell___not___null() {
        return cell___not___null;
    }
    public void setCell___not___null(Boolean cell___not___null) {
        this.cell___not___null = cell___not___null;
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

    public String getHivdna_copie_cells___eq() {
        return hivdna_copie_cells___eq;
    }
    public void setHivdna_copie_cells___eq(String hivdna_copie_cells___eq) {
        this.hivdna_copie_cells___eq = hivdna_copie_cells___eq;
    }

    public String getHivdna_copie_cells___ne() {
        return hivdna_copie_cells___ne;
    }
    public void setHivdna_copie_cells___ne(String hivdna_copie_cells___ne) {
        this.hivdna_copie_cells___ne = hivdna_copie_cells___ne;
    }

    public Boolean getHivdna_copie_cells___null() {
        return hivdna_copie_cells___null;
    }
    public void setHivdna_copie_cells___null(Boolean hivdna_copie_cells___null) {
        this.hivdna_copie_cells___null = hivdna_copie_cells___null;
    }

    public Boolean getHivdna_copie_cells___not___null() {
        return hivdna_copie_cells___not___null;
    }
    public void setHivdna_copie_cells___not___null(Boolean hivdna_copie_cells___not___null) {
        this.hivdna_copie_cells___not___null = hivdna_copie_cells___not___null;
    }

    public java.util.List<String> getHivdna_copie_cells___in() {
        return hivdna_copie_cells___in;
    }
    public void setHivdna_copie_cells___in(java.util.List<String> hivdna_copie_cells___in) {
        this.hivdna_copie_cells___in = hivdna_copie_cells___in;
    }

    public java.util.List<String> getHivdna_copie_cells___not___in() {
        return hivdna_copie_cells___not___in;
    }
    public void setHivdna_copie_cells___not___in(java.util.List<String> hivdna_copie_cells___not___in) {
        this.hivdna_copie_cells___not___in = hivdna_copie_cells___not___in;
    }

    public String getHivdna_copie_cells___lt() {
        return hivdna_copie_cells___lt;
    }
    public void setHivdna_copie_cells___lt(String hivdna_copie_cells___lt) {
        this.hivdna_copie_cells___lt = hivdna_copie_cells___lt;
    }

    public String getHivdna_copie_cells___lte() {
        return hivdna_copie_cells___lte;
    }
    public void setHivdna_copie_cells___lte(String hivdna_copie_cells___lte) {
        this.hivdna_copie_cells___lte = hivdna_copie_cells___lte;
    }

    public String getHivdna_copie_cells___gt() {
        return hivdna_copie_cells___gt;
    }
    public void setHivdna_copie_cells___gt(String hivdna_copie_cells___gt) {
        this.hivdna_copie_cells___gt = hivdna_copie_cells___gt;
    }

    public String getHivdna_copie_cells___gte() {
        return hivdna_copie_cells___gte;
    }
    public void setHivdna_copie_cells___gte(String hivdna_copie_cells___gte) {
        this.hivdna_copie_cells___gte = hivdna_copie_cells___gte;
    }

    public String getHivdna_copie_ml___eq() {
        return hivdna_copie_ml___eq;
    }
    public void setHivdna_copie_ml___eq(String hivdna_copie_ml___eq) {
        this.hivdna_copie_ml___eq = hivdna_copie_ml___eq;
    }

    public String getHivdna_copie_ml___ne() {
        return hivdna_copie_ml___ne;
    }
    public void setHivdna_copie_ml___ne(String hivdna_copie_ml___ne) {
        this.hivdna_copie_ml___ne = hivdna_copie_ml___ne;
    }

    public Boolean getHivdna_copie_ml___null() {
        return hivdna_copie_ml___null;
    }
    public void setHivdna_copie_ml___null(Boolean hivdna_copie_ml___null) {
        this.hivdna_copie_ml___null = hivdna_copie_ml___null;
    }

    public Boolean getHivdna_copie_ml___not___null() {
        return hivdna_copie_ml___not___null;
    }
    public void setHivdna_copie_ml___not___null(Boolean hivdna_copie_ml___not___null) {
        this.hivdna_copie_ml___not___null = hivdna_copie_ml___not___null;
    }

    public java.util.List<String> getHivdna_copie_ml___in() {
        return hivdna_copie_ml___in;
    }
    public void setHivdna_copie_ml___in(java.util.List<String> hivdna_copie_ml___in) {
        this.hivdna_copie_ml___in = hivdna_copie_ml___in;
    }

    public java.util.List<String> getHivdna_copie_ml___not___in() {
        return hivdna_copie_ml___not___in;
    }
    public void setHivdna_copie_ml___not___in(java.util.List<String> hivdna_copie_ml___not___in) {
        this.hivdna_copie_ml___not___in = hivdna_copie_ml___not___in;
    }

    public String getHivdna_copie_ml___lt() {
        return hivdna_copie_ml___lt;
    }
    public void setHivdna_copie_ml___lt(String hivdna_copie_ml___lt) {
        this.hivdna_copie_ml___lt = hivdna_copie_ml___lt;
    }

    public String getHivdna_copie_ml___lte() {
        return hivdna_copie_ml___lte;
    }
    public void setHivdna_copie_ml___lte(String hivdna_copie_ml___lte) {
        this.hivdna_copie_ml___lte = hivdna_copie_ml___lte;
    }

    public String getHivdna_copie_ml___gt() {
        return hivdna_copie_ml___gt;
    }
    public void setHivdna_copie_ml___gt(String hivdna_copie_ml___gt) {
        this.hivdna_copie_ml___gt = hivdna_copie_ml___gt;
    }

    public String getHivdna_copie_ml___gte() {
        return hivdna_copie_ml___gte;
    }
    public void setHivdna_copie_ml___gte(String hivdna_copie_ml___gte) {
        this.hivdna_copie_ml___gte = hivdna_copie_ml___gte;
    }

    public Boolean getReliab___eq() {
        return reliab___eq;
    }
    public void setReliab___eq(Boolean reliab___eq) {
        this.reliab___eq = reliab___eq;
    }

    public Boolean getReliab___ne() {
        return reliab___ne;
    }
    public void setReliab___ne(Boolean reliab___ne) {
        this.reliab___ne = reliab___ne;
    }

    public Boolean getReliab___null() {
        return reliab___null;
    }
    public void setReliab___null(Boolean reliab___null) {
        this.reliab___null = reliab___null;
    }

    public Boolean getReliab___not___null() {
        return reliab___not___null;
    }
    public void setReliab___not___null(Boolean reliab___not___null) {
        this.reliab___not___null = reliab___not___null;
    }

    public String getRs1840680___eq() {
        return rs1840680___eq;
    }
    public void setRs1840680___eq(String rs1840680___eq) {
        this.rs1840680___eq = rs1840680___eq;
    }

    public String getRs1840680___ne() {
        return rs1840680___ne;
    }
    public void setRs1840680___ne(String rs1840680___ne) {
        this.rs1840680___ne = rs1840680___ne;
    }

    public Boolean getRs1840680___null() {
        return rs1840680___null;
    }
    public void setRs1840680___null(Boolean rs1840680___null) {
        this.rs1840680___null = rs1840680___null;
    }

    public Boolean getRs1840680___not___null() {
        return rs1840680___not___null;
    }
    public void setRs1840680___not___null(Boolean rs1840680___not___null) {
        this.rs1840680___not___null = rs1840680___not___null;
    }

    public java.util.List<String> getRs1840680___in() {
        return rs1840680___in;
    }
    public void setRs1840680___in(java.util.List<String> rs1840680___in) {
        this.rs1840680___in = rs1840680___in;
    }

    public java.util.List<String> getRs1840680___not___in() {
        return rs1840680___not___in;
    }
    public void setRs1840680___not___in(java.util.List<String> rs1840680___not___in) {
        this.rs1840680___not___in = rs1840680___not___in;
    }

    public String getRs1840680___lt() {
        return rs1840680___lt;
    }
    public void setRs1840680___lt(String rs1840680___lt) {
        this.rs1840680___lt = rs1840680___lt;
    }

    public String getRs1840680___lte() {
        return rs1840680___lte;
    }
    public void setRs1840680___lte(String rs1840680___lte) {
        this.rs1840680___lte = rs1840680___lte;
    }

    public String getRs1840680___gt() {
        return rs1840680___gt;
    }
    public void setRs1840680___gt(String rs1840680___gt) {
        this.rs1840680___gt = rs1840680___gt;
    }

    public String getRs1840680___gte() {
        return rs1840680___gte;
    }
    public void setRs1840680___gte(String rs1840680___gte) {
        this.rs1840680___gte = rs1840680___gte;
    }

    public String getRs1840680___contains() {
        return rs1840680___contains;
    }
    public void setRs1840680___contains(String rs1840680___contains) {
        this.rs1840680___contains = rs1840680___contains;
    }

    public String getRs1840680___not___contains() {
        return rs1840680___not___contains;
    }
    public void setRs1840680___not___contains(String rs1840680___not___contains) {
        this.rs1840680___not___contains = rs1840680___not___contains;
    }

    public String getRs1840680___starts_with() {
        return rs1840680___starts_with;
    }
    public void setRs1840680___starts_with(String rs1840680___starts_with) {
        this.rs1840680___starts_with = rs1840680___starts_with;
    }

    public String getRs1840680___not___starts_with() {
        return rs1840680___not___starts_with;
    }
    public void setRs1840680___not___starts_with(String rs1840680___not___starts_with) {
        this.rs1840680___not___starts_with = rs1840680___not___starts_with;
    }

    public String getRs1840680___ends_with() {
        return rs1840680___ends_with;
    }
    public void setRs1840680___ends_with(String rs1840680___ends_with) {
        this.rs1840680___ends_with = rs1840680___ends_with;
    }

    public String getRs1840680___not___ends_with() {
        return rs1840680___not___ends_with;
    }
    public void setRs1840680___not___ends_with(String rs1840680___not___ends_with) {
        this.rs1840680___not___ends_with = rs1840680___not___ends_with;
    }

    public String getRs2305619___eq() {
        return rs2305619___eq;
    }
    public void setRs2305619___eq(String rs2305619___eq) {
        this.rs2305619___eq = rs2305619___eq;
    }

    public String getRs2305619___ne() {
        return rs2305619___ne;
    }
    public void setRs2305619___ne(String rs2305619___ne) {
        this.rs2305619___ne = rs2305619___ne;
    }

    public Boolean getRs2305619___null() {
        return rs2305619___null;
    }
    public void setRs2305619___null(Boolean rs2305619___null) {
        this.rs2305619___null = rs2305619___null;
    }

    public Boolean getRs2305619___not___null() {
        return rs2305619___not___null;
    }
    public void setRs2305619___not___null(Boolean rs2305619___not___null) {
        this.rs2305619___not___null = rs2305619___not___null;
    }

    public java.util.List<String> getRs2305619___in() {
        return rs2305619___in;
    }
    public void setRs2305619___in(java.util.List<String> rs2305619___in) {
        this.rs2305619___in = rs2305619___in;
    }

    public java.util.List<String> getRs2305619___not___in() {
        return rs2305619___not___in;
    }
    public void setRs2305619___not___in(java.util.List<String> rs2305619___not___in) {
        this.rs2305619___not___in = rs2305619___not___in;
    }

    public String getRs2305619___lt() {
        return rs2305619___lt;
    }
    public void setRs2305619___lt(String rs2305619___lt) {
        this.rs2305619___lt = rs2305619___lt;
    }

    public String getRs2305619___lte() {
        return rs2305619___lte;
    }
    public void setRs2305619___lte(String rs2305619___lte) {
        this.rs2305619___lte = rs2305619___lte;
    }

    public String getRs2305619___gt() {
        return rs2305619___gt;
    }
    public void setRs2305619___gt(String rs2305619___gt) {
        this.rs2305619___gt = rs2305619___gt;
    }

    public String getRs2305619___gte() {
        return rs2305619___gte;
    }
    public void setRs2305619___gte(String rs2305619___gte) {
        this.rs2305619___gte = rs2305619___gte;
    }

    public String getRs2305619___contains() {
        return rs2305619___contains;
    }
    public void setRs2305619___contains(String rs2305619___contains) {
        this.rs2305619___contains = rs2305619___contains;
    }

    public String getRs2305619___not___contains() {
        return rs2305619___not___contains;
    }
    public void setRs2305619___not___contains(String rs2305619___not___contains) {
        this.rs2305619___not___contains = rs2305619___not___contains;
    }

    public String getRs2305619___starts_with() {
        return rs2305619___starts_with;
    }
    public void setRs2305619___starts_with(String rs2305619___starts_with) {
        this.rs2305619___starts_with = rs2305619___starts_with;
    }

    public String getRs2305619___not___starts_with() {
        return rs2305619___not___starts_with;
    }
    public void setRs2305619___not___starts_with(String rs2305619___not___starts_with) {
        this.rs2305619___not___starts_with = rs2305619___not___starts_with;
    }

    public String getRs2305619___ends_with() {
        return rs2305619___ends_with;
    }
    public void setRs2305619___ends_with(String rs2305619___ends_with) {
        this.rs2305619___ends_with = rs2305619___ends_with;
    }

    public String getRs2305619___not___ends_with() {
        return rs2305619___not___ends_with;
    }
    public void setRs2305619___not___ends_with(String rs2305619___not___ends_with) {
        this.rs2305619___not___ends_with = rs2305619___not___ends_with;
    }

    public String getRs35948036___eq() {
        return rs35948036___eq;
    }
    public void setRs35948036___eq(String rs35948036___eq) {
        this.rs35948036___eq = rs35948036___eq;
    }

    public String getRs35948036___ne() {
        return rs35948036___ne;
    }
    public void setRs35948036___ne(String rs35948036___ne) {
        this.rs35948036___ne = rs35948036___ne;
    }

    public Boolean getRs35948036___null() {
        return rs35948036___null;
    }
    public void setRs35948036___null(Boolean rs35948036___null) {
        this.rs35948036___null = rs35948036___null;
    }

    public Boolean getRs35948036___not___null() {
        return rs35948036___not___null;
    }
    public void setRs35948036___not___null(Boolean rs35948036___not___null) {
        this.rs35948036___not___null = rs35948036___not___null;
    }

    public java.util.List<String> getRs35948036___in() {
        return rs35948036___in;
    }
    public void setRs35948036___in(java.util.List<String> rs35948036___in) {
        this.rs35948036___in = rs35948036___in;
    }

    public java.util.List<String> getRs35948036___not___in() {
        return rs35948036___not___in;
    }
    public void setRs35948036___not___in(java.util.List<String> rs35948036___not___in) {
        this.rs35948036___not___in = rs35948036___not___in;
    }

    public String getRs35948036___lt() {
        return rs35948036___lt;
    }
    public void setRs35948036___lt(String rs35948036___lt) {
        this.rs35948036___lt = rs35948036___lt;
    }

    public String getRs35948036___lte() {
        return rs35948036___lte;
    }
    public void setRs35948036___lte(String rs35948036___lte) {
        this.rs35948036___lte = rs35948036___lte;
    }

    public String getRs35948036___gt() {
        return rs35948036___gt;
    }
    public void setRs35948036___gt(String rs35948036___gt) {
        this.rs35948036___gt = rs35948036___gt;
    }

    public String getRs35948036___gte() {
        return rs35948036___gte;
    }
    public void setRs35948036___gte(String rs35948036___gte) {
        this.rs35948036___gte = rs35948036___gte;
    }

    public String getRs35948036___contains() {
        return rs35948036___contains;
    }
    public void setRs35948036___contains(String rs35948036___contains) {
        this.rs35948036___contains = rs35948036___contains;
    }

    public String getRs35948036___not___contains() {
        return rs35948036___not___contains;
    }
    public void setRs35948036___not___contains(String rs35948036___not___contains) {
        this.rs35948036___not___contains = rs35948036___not___contains;
    }

    public String getRs35948036___starts_with() {
        return rs35948036___starts_with;
    }
    public void setRs35948036___starts_with(String rs35948036___starts_with) {
        this.rs35948036___starts_with = rs35948036___starts_with;
    }

    public String getRs35948036___not___starts_with() {
        return rs35948036___not___starts_with;
    }
    public void setRs35948036___not___starts_with(String rs35948036___not___starts_with) {
        this.rs35948036___not___starts_with = rs35948036___not___starts_with;
    }

    public String getRs35948036___ends_with() {
        return rs35948036___ends_with;
    }
    public void setRs35948036___ends_with(String rs35948036___ends_with) {
        this.rs35948036___ends_with = rs35948036___ends_with;
    }

    public String getRs35948036___not___ends_with() {
        return rs35948036___not___ends_with;
    }
    public void setRs35948036___not___ends_with(String rs35948036___not___ends_with) {
        this.rs35948036___not___ends_with = rs35948036___not___ends_with;
    }

    public String getRs3845978___eq() {
        return rs3845978___eq;
    }
    public void setRs3845978___eq(String rs3845978___eq) {
        this.rs3845978___eq = rs3845978___eq;
    }

    public String getRs3845978___ne() {
        return rs3845978___ne;
    }
    public void setRs3845978___ne(String rs3845978___ne) {
        this.rs3845978___ne = rs3845978___ne;
    }

    public Boolean getRs3845978___null() {
        return rs3845978___null;
    }
    public void setRs3845978___null(Boolean rs3845978___null) {
        this.rs3845978___null = rs3845978___null;
    }

    public Boolean getRs3845978___not___null() {
        return rs3845978___not___null;
    }
    public void setRs3845978___not___null(Boolean rs3845978___not___null) {
        this.rs3845978___not___null = rs3845978___not___null;
    }

    public java.util.List<String> getRs3845978___in() {
        return rs3845978___in;
    }
    public void setRs3845978___in(java.util.List<String> rs3845978___in) {
        this.rs3845978___in = rs3845978___in;
    }

    public java.util.List<String> getRs3845978___not___in() {
        return rs3845978___not___in;
    }
    public void setRs3845978___not___in(java.util.List<String> rs3845978___not___in) {
        this.rs3845978___not___in = rs3845978___not___in;
    }

    public String getRs3845978___lt() {
        return rs3845978___lt;
    }
    public void setRs3845978___lt(String rs3845978___lt) {
        this.rs3845978___lt = rs3845978___lt;
    }

    public String getRs3845978___lte() {
        return rs3845978___lte;
    }
    public void setRs3845978___lte(String rs3845978___lte) {
        this.rs3845978___lte = rs3845978___lte;
    }

    public String getRs3845978___gt() {
        return rs3845978___gt;
    }
    public void setRs3845978___gt(String rs3845978___gt) {
        this.rs3845978___gt = rs3845978___gt;
    }

    public String getRs3845978___gte() {
        return rs3845978___gte;
    }
    public void setRs3845978___gte(String rs3845978___gte) {
        this.rs3845978___gte = rs3845978___gte;
    }

    public String getRs3845978___contains() {
        return rs3845978___contains;
    }
    public void setRs3845978___contains(String rs3845978___contains) {
        this.rs3845978___contains = rs3845978___contains;
    }

    public String getRs3845978___not___contains() {
        return rs3845978___not___contains;
    }
    public void setRs3845978___not___contains(String rs3845978___not___contains) {
        this.rs3845978___not___contains = rs3845978___not___contains;
    }

    public String getRs3845978___starts_with() {
        return rs3845978___starts_with;
    }
    public void setRs3845978___starts_with(String rs3845978___starts_with) {
        this.rs3845978___starts_with = rs3845978___starts_with;
    }

    public String getRs3845978___not___starts_with() {
        return rs3845978___not___starts_with;
    }
    public void setRs3845978___not___starts_with(String rs3845978___not___starts_with) {
        this.rs3845978___not___starts_with = rs3845978___not___starts_with;
    }

    public String getRs3845978___ends_with() {
        return rs3845978___ends_with;
    }
    public void setRs3845978___ends_with(String rs3845978___ends_with) {
        this.rs3845978___ends_with = rs3845978___ends_with;
    }

    public String getRs3845978___not___ends_with() {
        return rs3845978___not___ends_with;
    }
    public void setRs3845978___not___ends_with(String rs3845978___not___ends_with) {
        this.rs3845978___not___ends_with = rs3845978___not___ends_with;
    }

    public String getSCD___eq() {
        return sCD___eq;
    }
    public void setSCD___eq(String sCD___eq) {
        this.sCD___eq = sCD___eq;
    }

    public String getSCD___ne() {
        return sCD___ne;
    }
    public void setSCD___ne(String sCD___ne) {
        this.sCD___ne = sCD___ne;
    }

    public Boolean getSCD___null() {
        return sCD___null;
    }
    public void setSCD___null(Boolean sCD___null) {
        this.sCD___null = sCD___null;
    }

    public Boolean getSCD___not___null() {
        return sCD___not___null;
    }
    public void setSCD___not___null(Boolean sCD___not___null) {
        this.sCD___not___null = sCD___not___null;
    }

    public java.util.List<String> getSCD___in() {
        return sCD___in;
    }
    public void setSCD___in(java.util.List<String> sCD___in) {
        this.sCD___in = sCD___in;
    }

    public java.util.List<String> getSCD___not___in() {
        return sCD___not___in;
    }
    public void setSCD___not___in(java.util.List<String> sCD___not___in) {
        this.sCD___not___in = sCD___not___in;
    }

    public String getSCD___lt() {
        return sCD___lt;
    }
    public void setSCD___lt(String sCD___lt) {
        this.sCD___lt = sCD___lt;
    }

    public String getSCD___lte() {
        return sCD___lte;
    }
    public void setSCD___lte(String sCD___lte) {
        this.sCD___lte = sCD___lte;
    }

    public String getSCD___gt() {
        return sCD___gt;
    }
    public void setSCD___gt(String sCD___gt) {
        this.sCD___gt = sCD___gt;
    }

    public String getSCD___gte() {
        return sCD___gte;
    }
    public void setSCD___gte(String sCD___gte) {
        this.sCD___gte = sCD___gte;
    }

    public String getSCD14___eq() {
        return sCD14___eq;
    }
    public void setSCD14___eq(String sCD14___eq) {
        this.sCD14___eq = sCD14___eq;
    }

    public String getSCD14___ne() {
        return sCD14___ne;
    }
    public void setSCD14___ne(String sCD14___ne) {
        this.sCD14___ne = sCD14___ne;
    }

    public Boolean getSCD14___null() {
        return sCD14___null;
    }
    public void setSCD14___null(Boolean sCD14___null) {
        this.sCD14___null = sCD14___null;
    }

    public Boolean getSCD14___not___null() {
        return sCD14___not___null;
    }
    public void setSCD14___not___null(Boolean sCD14___not___null) {
        this.sCD14___not___null = sCD14___not___null;
    }

    public java.util.List<String> getSCD14___in() {
        return sCD14___in;
    }
    public void setSCD14___in(java.util.List<String> sCD14___in) {
        this.sCD14___in = sCD14___in;
    }

    public java.util.List<String> getSCD14___not___in() {
        return sCD14___not___in;
    }
    public void setSCD14___not___in(java.util.List<String> sCD14___not___in) {
        this.sCD14___not___in = sCD14___not___in;
    }

    public String getSCD14___lt() {
        return sCD14___lt;
    }
    public void setSCD14___lt(String sCD14___lt) {
        this.sCD14___lt = sCD14___lt;
    }

    public String getSCD14___lte() {
        return sCD14___lte;
    }
    public void setSCD14___lte(String sCD14___lte) {
        this.sCD14___lte = sCD14___lte;
    }

    public String getSCD14___gt() {
        return sCD14___gt;
    }
    public void setSCD14___gt(String sCD14___gt) {
        this.sCD14___gt = sCD14___gt;
    }

    public String getSCD14___gte() {
        return sCD14___gte;
    }
    public void setSCD14___gte(String sCD14___gte) {
        this.sCD14___gte = sCD14___gte;
    }

    public String getSCD163___eq() {
        return sCD163___eq;
    }
    public void setSCD163___eq(String sCD163___eq) {
        this.sCD163___eq = sCD163___eq;
    }

    public String getSCD163___ne() {
        return sCD163___ne;
    }
    public void setSCD163___ne(String sCD163___ne) {
        this.sCD163___ne = sCD163___ne;
    }

    public Boolean getSCD163___null() {
        return sCD163___null;
    }
    public void setSCD163___null(Boolean sCD163___null) {
        this.sCD163___null = sCD163___null;
    }

    public Boolean getSCD163___not___null() {
        return sCD163___not___null;
    }
    public void setSCD163___not___null(Boolean sCD163___not___null) {
        this.sCD163___not___null = sCD163___not___null;
    }

    public java.util.List<String> getSCD163___in() {
        return sCD163___in;
    }
    public void setSCD163___in(java.util.List<String> sCD163___in) {
        this.sCD163___in = sCD163___in;
    }

    public java.util.List<String> getSCD163___not___in() {
        return sCD163___not___in;
    }
    public void setSCD163___not___in(java.util.List<String> sCD163___not___in) {
        this.sCD163___not___in = sCD163___not___in;
    }

    public String getSCD163___lt() {
        return sCD163___lt;
    }
    public void setSCD163___lt(String sCD163___lt) {
        this.sCD163___lt = sCD163___lt;
    }

    public String getSCD163___lte() {
        return sCD163___lte;
    }
    public void setSCD163___lte(String sCD163___lte) {
        this.sCD163___lte = sCD163___lte;
    }

    public String getSCD163___gt() {
        return sCD163___gt;
    }
    public void setSCD163___gt(String sCD163___gt) {
        this.sCD163___gt = sCD163___gt;
    }

    public String getSCD163___gte() {
        return sCD163___gte;
    }
    public void setSCD163___gte(String sCD163___gte) {
        this.sCD163___gte = sCD163___gte;
    }

    public String getTipo_marker___eq() {
        return tipo_marker___eq;
    }
    public void setTipo_marker___eq(String tipo_marker___eq) {
        this.tipo_marker___eq = tipo_marker___eq;
    }

    public String getTipo_marker___ne() {
        return tipo_marker___ne;
    }
    public void setTipo_marker___ne(String tipo_marker___ne) {
        this.tipo_marker___ne = tipo_marker___ne;
    }

    public Boolean getTipo_marker___null() {
        return tipo_marker___null;
    }
    public void setTipo_marker___null(Boolean tipo_marker___null) {
        this.tipo_marker___null = tipo_marker___null;
    }

    public Boolean getTipo_marker___not___null() {
        return tipo_marker___not___null;
    }
    public void setTipo_marker___not___null(Boolean tipo_marker___not___null) {
        this.tipo_marker___not___null = tipo_marker___not___null;
    }

    public java.util.List<String> getTipo_marker___in() {
        return tipo_marker___in;
    }
    public void setTipo_marker___in(java.util.List<String> tipo_marker___in) {
        this.tipo_marker___in = tipo_marker___in;
    }

    public java.util.List<String> getTipo_marker___not___in() {
        return tipo_marker___not___in;
    }
    public void setTipo_marker___not___in(java.util.List<String> tipo_marker___not___in) {
        this.tipo_marker___not___in = tipo_marker___not___in;
    }

    public String getTipo_marker___lt() {
        return tipo_marker___lt;
    }
    public void setTipo_marker___lt(String tipo_marker___lt) {
        this.tipo_marker___lt = tipo_marker___lt;
    }

    public String getTipo_marker___lte() {
        return tipo_marker___lte;
    }
    public void setTipo_marker___lte(String tipo_marker___lte) {
        this.tipo_marker___lte = tipo_marker___lte;
    }

    public String getTipo_marker___gt() {
        return tipo_marker___gt;
    }
    public void setTipo_marker___gt(String tipo_marker___gt) {
        this.tipo_marker___gt = tipo_marker___gt;
    }

    public String getTipo_marker___gte() {
        return tipo_marker___gte;
    }
    public void setTipo_marker___gte(String tipo_marker___gte) {
        this.tipo_marker___gte = tipo_marker___gte;
    }

    public String getTipo_marker___contains() {
        return tipo_marker___contains;
    }
    public void setTipo_marker___contains(String tipo_marker___contains) {
        this.tipo_marker___contains = tipo_marker___contains;
    }

    public String getTipo_marker___not___contains() {
        return tipo_marker___not___contains;
    }
    public void setTipo_marker___not___contains(String tipo_marker___not___contains) {
        this.tipo_marker___not___contains = tipo_marker___not___contains;
    }

    public String getTipo_marker___starts_with() {
        return tipo_marker___starts_with;
    }
    public void setTipo_marker___starts_with(String tipo_marker___starts_with) {
        this.tipo_marker___starts_with = tipo_marker___starts_with;
    }

    public String getTipo_marker___not___starts_with() {
        return tipo_marker___not___starts_with;
    }
    public void setTipo_marker___not___starts_with(String tipo_marker___not___starts_with) {
        this.tipo_marker___not___starts_with = tipo_marker___not___starts_with;
    }

    public String getTipo_marker___ends_with() {
        return tipo_marker___ends_with;
    }
    public void setTipo_marker___ends_with(String tipo_marker___ends_with) {
        this.tipo_marker___ends_with = tipo_marker___ends_with;
    }

    public String getTipo_marker___not___ends_with() {
        return tipo_marker___not___ends_with;
    }
    public void setTipo_marker___not___ends_with(String tipo_marker___not___ends_with) {
        this.tipo_marker___not___ends_with = tipo_marker___not___ends_with;
    }

    public String getValore___eq() {
        return valore___eq;
    }
    public void setValore___eq(String valore___eq) {
        this.valore___eq = valore___eq;
    }

    public String getValore___ne() {
        return valore___ne;
    }
    public void setValore___ne(String valore___ne) {
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

    public java.util.List<String> getValore___in() {
        return valore___in;
    }
    public void setValore___in(java.util.List<String> valore___in) {
        this.valore___in = valore___in;
    }

    public java.util.List<String> getValore___not___in() {
        return valore___not___in;
    }
    public void setValore___not___in(java.util.List<String> valore___not___in) {
        this.valore___not___in = valore___not___in;
    }

    public String getValore___lt() {
        return valore___lt;
    }
    public void setValore___lt(String valore___lt) {
        this.valore___lt = valore___lt;
    }

    public String getValore___lte() {
        return valore___lte;
    }
    public void setValore___lte(String valore___lte) {
        this.valore___lte = valore___lte;
    }

    public String getValore___gt() {
        return valore___gt;
    }
    public void setValore___gt(String valore___gt) {
        this.valore___gt = valore___gt;
    }

    public String getValore___gte() {
        return valore___gte;
    }
    public void setValore___gte(String valore___gte) {
        this.valore___gte = valore___gte;
    }

    public String getValore___contains() {
        return valore___contains;
    }
    public void setValore___contains(String valore___contains) {
        this.valore___contains = valore___contains;
    }

    public String getValore___not___contains() {
        return valore___not___contains;
    }
    public void setValore___not___contains(String valore___not___contains) {
        this.valore___not___contains = valore___not___contains;
    }

    public String getValore___starts_with() {
        return valore___starts_with;
    }
    public void setValore___starts_with(String valore___starts_with) {
        this.valore___starts_with = valore___starts_with;
    }

    public String getValore___not___starts_with() {
        return valore___not___starts_with;
    }
    public void setValore___not___starts_with(String valore___not___starts_with) {
        this.valore___not___starts_with = valore___not___starts_with;
    }

    public String getValore___ends_with() {
        return valore___ends_with;
    }
    public void setValore___ends_with(String valore___ends_with) {
        this.valore___ends_with = valore___ends_with;
    }

    public String getValore___not___ends_with() {
        return valore___not___ends_with;
    }
    public void setValore___not___ends_with(String valore___not___ends_with) {
        this.valore___not___ends_with = valore___not___ends_with;
    }

    public Boolean getVariable___eq() {
        return variable___eq;
    }
    public void setVariable___eq(Boolean variable___eq) {
        this.variable___eq = variable___eq;
    }

    public Boolean getVariable___ne() {
        return variable___ne;
    }
    public void setVariable___ne(Boolean variable___ne) {
        this.variable___ne = variable___ne;
    }

    public Boolean getVariable___null() {
        return variable___null;
    }
    public void setVariable___null(Boolean variable___null) {
        this.variable___null = variable___null;
    }

    public Boolean getVariable___not___null() {
        return variable___not___null;
    }
    public void setVariable___not___null(Boolean variable___not___null) {
        this.variable___not___null = variable___not___null;
    }

    public String getVolume___eq() {
        return volume___eq;
    }
    public void setVolume___eq(String volume___eq) {
        this.volume___eq = volume___eq;
    }

    public String getVolume___ne() {
        return volume___ne;
    }
    public void setVolume___ne(String volume___ne) {
        this.volume___ne = volume___ne;
    }

    public Boolean getVolume___null() {
        return volume___null;
    }
    public void setVolume___null(Boolean volume___null) {
        this.volume___null = volume___null;
    }

    public Boolean getVolume___not___null() {
        return volume___not___null;
    }
    public void setVolume___not___null(Boolean volume___not___null) {
        this.volume___not___null = volume___not___null;
    }

    public java.util.List<String> getVolume___in() {
        return volume___in;
    }
    public void setVolume___in(java.util.List<String> volume___in) {
        this.volume___in = volume___in;
    }

    public java.util.List<String> getVolume___not___in() {
        return volume___not___in;
    }
    public void setVolume___not___in(java.util.List<String> volume___not___in) {
        this.volume___not___in = volume___not___in;
    }

    public String getVolume___lt() {
        return volume___lt;
    }
    public void setVolume___lt(String volume___lt) {
        this.volume___lt = volume___lt;
    }

    public String getVolume___lte() {
        return volume___lte;
    }
    public void setVolume___lte(String volume___lte) {
        this.volume___lte = volume___lte;
    }

    public String getVolume___gt() {
        return volume___gt;
    }
    public void setVolume___gt(String volume___gt) {
        this.volume___gt = volume___gt;
    }

    public String getVolume___gte() {
        return volume___gte;
    }
    public void setVolume___gte(String volume___gte) {
        this.volume___gte = volume___gte;
    }

    public String getVolume___contains() {
        return volume___contains;
    }
    public void setVolume___contains(String volume___contains) {
        this.volume___contains = volume___contains;
    }

    public String getVolume___not___contains() {
        return volume___not___contains;
    }
    public void setVolume___not___contains(String volume___not___contains) {
        this.volume___not___contains = volume___not___contains;
    }

    public String getVolume___starts_with() {
        return volume___starts_with;
    }
    public void setVolume___starts_with(String volume___starts_with) {
        this.volume___starts_with = volume___starts_with;
    }

    public String getVolume___not___starts_with() {
        return volume___not___starts_with;
    }
    public void setVolume___not___starts_with(String volume___not___starts_with) {
        this.volume___not___starts_with = volume___not___starts_with;
    }

    public String getVolume___ends_with() {
        return volume___ends_with;
    }
    public void setVolume___ends_with(String volume___ends_with) {
        this.volume___ends_with = volume___ends_with;
    }

    public String getVolume___not___ends_with() {
        return volume___not___ends_with;
    }
    public void setVolume___not___ends_with(String volume___not___ends_with) {
        this.volume___not___ends_with = volume___not___ends_with;
    }

    public java.util.List<CliMarkers_altriFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliMarkers_altriFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliMarkers_altriFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliMarkers_altriFilterDTO> OR) {
        this.OR = OR;
    }

    public CliMarkers_altriFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliMarkers_altriFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
        }
        if (AP_CD34_15___eq != null) {
            joiner.add("AP_CD34_15___eq: " + GraphQLRequestSerializer.getEntry(AP_CD34_15___eq));
        }
        if (AP_CD34_15___ne != null) {
            joiner.add("AP_CD34_15___ne: " + GraphQLRequestSerializer.getEntry(AP_CD34_15___ne));
        }
        if (AP_CD34_15___null != null) {
            joiner.add("AP_CD34_15___null: " + GraphQLRequestSerializer.getEntry(AP_CD34_15___null));
        }
        if (AP_CD34_15___not___null != null) {
            joiner.add("AP_CD34_15___not___null: " + GraphQLRequestSerializer.getEntry(AP_CD34_15___not___null));
        }
        if (AP_CD34_15___in != null) {
            joiner.add("AP_CD34_15___in: " + GraphQLRequestSerializer.getEntry(AP_CD34_15___in));
        }
        if (AP_CD34_15___not___in != null) {
            joiner.add("AP_CD34_15___not___in: " + GraphQLRequestSerializer.getEntry(AP_CD34_15___not___in));
        }
        if (AP_CD34_15___lt != null) {
            joiner.add("AP_CD34_15___lt: " + GraphQLRequestSerializer.getEntry(AP_CD34_15___lt));
        }
        if (AP_CD34_15___lte != null) {
            joiner.add("AP_CD34_15___lte: " + GraphQLRequestSerializer.getEntry(AP_CD34_15___lte));
        }
        if (AP_CD34_15___gt != null) {
            joiner.add("AP_CD34_15___gt: " + GraphQLRequestSerializer.getEntry(AP_CD34_15___gt));
        }
        if (AP_CD34_15___gte != null) {
            joiner.add("AP_CD34_15___gte: " + GraphQLRequestSerializer.getEntry(AP_CD34_15___gte));
        }
        if (CD14_11b_51_61___eq != null) {
            joiner.add("CD14_11b_51_61___eq: " + GraphQLRequestSerializer.getEntry(CD14_11b_51_61___eq));
        }
        if (CD14_11b_51_61___ne != null) {
            joiner.add("CD14_11b_51_61___ne: " + GraphQLRequestSerializer.getEntry(CD14_11b_51_61___ne));
        }
        if (CD14_11b_51_61___null != null) {
            joiner.add("CD14_11b_51_61___null: " + GraphQLRequestSerializer.getEntry(CD14_11b_51_61___null));
        }
        if (CD14_11b_51_61___not___null != null) {
            joiner.add("CD14_11b_51_61___not___null: " + GraphQLRequestSerializer.getEntry(CD14_11b_51_61___not___null));
        }
        if (CD14_11b_51_61___in != null) {
            joiner.add("CD14_11b_51_61___in: " + GraphQLRequestSerializer.getEntry(CD14_11b_51_61___in));
        }
        if (CD14_11b_51_61___not___in != null) {
            joiner.add("CD14_11b_51_61___not___in: " + GraphQLRequestSerializer.getEntry(CD14_11b_51_61___not___in));
        }
        if (CD14_11b_51_61___lt != null) {
            joiner.add("CD14_11b_51_61___lt: " + GraphQLRequestSerializer.getEntry(CD14_11b_51_61___lt));
        }
        if (CD14_11b_51_61___lte != null) {
            joiner.add("CD14_11b_51_61___lte: " + GraphQLRequestSerializer.getEntry(CD14_11b_51_61___lte));
        }
        if (CD14_11b_51_61___gt != null) {
            joiner.add("CD14_11b_51_61___gt: " + GraphQLRequestSerializer.getEntry(CD14_11b_51_61___gt));
        }
        if (CD14_11b_51_61___gte != null) {
            joiner.add("CD14_11b_51_61___gte: " + GraphQLRequestSerializer.getEntry(CD14_11b_51_61___gte));
        }
        if (CDACT___eq != null) {
            joiner.add("CDACT___eq: " + GraphQLRequestSerializer.getEntry(CDACT___eq));
        }
        if (CDACT___ne != null) {
            joiner.add("CDACT___ne: " + GraphQLRequestSerializer.getEntry(CDACT___ne));
        }
        if (CDACT___null != null) {
            joiner.add("CDACT___null: " + GraphQLRequestSerializer.getEntry(CDACT___null));
        }
        if (CDACT___not___null != null) {
            joiner.add("CDACT___not___null: " + GraphQLRequestSerializer.getEntry(CDACT___not___null));
        }
        if (CDACT___in != null) {
            joiner.add("CDACT___in: " + GraphQLRequestSerializer.getEntry(CDACT___in));
        }
        if (CDACT___not___in != null) {
            joiner.add("CDACT___not___in: " + GraphQLRequestSerializer.getEntry(CDACT___not___in));
        }
        if (CDACT___lt != null) {
            joiner.add("CDACT___lt: " + GraphQLRequestSerializer.getEntry(CDACT___lt));
        }
        if (CDACT___lte != null) {
            joiner.add("CDACT___lte: " + GraphQLRequestSerializer.getEntry(CDACT___lte));
        }
        if (CDACT___gt != null) {
            joiner.add("CDACT___gt: " + GraphQLRequestSerializer.getEntry(CDACT___gt));
        }
        if (CDACT___gte != null) {
            joiner.add("CDACT___gte: " + GraphQLRequestSerializer.getEntry(CDACT___gte));
        }
        if (CMVIgG_OD___eq != null) {
            joiner.add("CMVIgG_OD___eq: " + GraphQLRequestSerializer.getEntry(CMVIgG_OD___eq));
        }
        if (CMVIgG_OD___ne != null) {
            joiner.add("CMVIgG_OD___ne: " + GraphQLRequestSerializer.getEntry(CMVIgG_OD___ne));
        }
        if (CMVIgG_OD___null != null) {
            joiner.add("CMVIgG_OD___null: " + GraphQLRequestSerializer.getEntry(CMVIgG_OD___null));
        }
        if (CMVIgG_OD___not___null != null) {
            joiner.add("CMVIgG_OD___not___null: " + GraphQLRequestSerializer.getEntry(CMVIgG_OD___not___null));
        }
        if (CMVIgG_OD___in != null) {
            joiner.add("CMVIgG_OD___in: " + GraphQLRequestSerializer.getEntry(CMVIgG_OD___in));
        }
        if (CMVIgG_OD___not___in != null) {
            joiner.add("CMVIgG_OD___not___in: " + GraphQLRequestSerializer.getEntry(CMVIgG_OD___not___in));
        }
        if (CMVIgG_OD___lt != null) {
            joiner.add("CMVIgG_OD___lt: " + GraphQLRequestSerializer.getEntry(CMVIgG_OD___lt));
        }
        if (CMVIgG_OD___lte != null) {
            joiner.add("CMVIgG_OD___lte: " + GraphQLRequestSerializer.getEntry(CMVIgG_OD___lte));
        }
        if (CMVIgG_OD___gt != null) {
            joiner.add("CMVIgG_OD___gt: " + GraphQLRequestSerializer.getEntry(CMVIgG_OD___gt));
        }
        if (CMVIgG_OD___gte != null) {
            joiner.add("CMVIgG_OD___gte: " + GraphQLRequestSerializer.getEntry(CMVIgG_OD___gte));
        }
        if (Cistatina_C___eq != null) {
            joiner.add("Cistatina_C___eq: " + GraphQLRequestSerializer.getEntry(Cistatina_C___eq));
        }
        if (Cistatina_C___ne != null) {
            joiner.add("Cistatina_C___ne: " + GraphQLRequestSerializer.getEntry(Cistatina_C___ne));
        }
        if (Cistatina_C___null != null) {
            joiner.add("Cistatina_C___null: " + GraphQLRequestSerializer.getEntry(Cistatina_C___null));
        }
        if (Cistatina_C___not___null != null) {
            joiner.add("Cistatina_C___not___null: " + GraphQLRequestSerializer.getEntry(Cistatina_C___not___null));
        }
        if (Cistatina_C___in != null) {
            joiner.add("Cistatina_C___in: " + GraphQLRequestSerializer.getEntry(Cistatina_C___in));
        }
        if (Cistatina_C___not___in != null) {
            joiner.add("Cistatina_C___not___in: " + GraphQLRequestSerializer.getEntry(Cistatina_C___not___in));
        }
        if (Cistatina_C___lt != null) {
            joiner.add("Cistatina_C___lt: " + GraphQLRequestSerializer.getEntry(Cistatina_C___lt));
        }
        if (Cistatina_C___lte != null) {
            joiner.add("Cistatina_C___lte: " + GraphQLRequestSerializer.getEntry(Cistatina_C___lte));
        }
        if (Cistatina_C___gt != null) {
            joiner.add("Cistatina_C___gt: " + GraphQLRequestSerializer.getEntry(Cistatina_C___gt));
        }
        if (Cistatina_C___gte != null) {
            joiner.add("Cistatina_C___gte: " + GraphQLRequestSerializer.getEntry(Cistatina_C___gte));
        }
        if (EndoCAb___eq != null) {
            joiner.add("EndoCAb___eq: " + GraphQLRequestSerializer.getEntry(EndoCAb___eq));
        }
        if (EndoCAb___ne != null) {
            joiner.add("EndoCAb___ne: " + GraphQLRequestSerializer.getEntry(EndoCAb___ne));
        }
        if (EndoCAb___null != null) {
            joiner.add("EndoCAb___null: " + GraphQLRequestSerializer.getEntry(EndoCAb___null));
        }
        if (EndoCAb___not___null != null) {
            joiner.add("EndoCAb___not___null: " + GraphQLRequestSerializer.getEntry(EndoCAb___not___null));
        }
        if (EndoCAb___in != null) {
            joiner.add("EndoCAb___in: " + GraphQLRequestSerializer.getEntry(EndoCAb___in));
        }
        if (EndoCAb___not___in != null) {
            joiner.add("EndoCAb___not___in: " + GraphQLRequestSerializer.getEntry(EndoCAb___not___in));
        }
        if (EndoCAb___lt != null) {
            joiner.add("EndoCAb___lt: " + GraphQLRequestSerializer.getEntry(EndoCAb___lt));
        }
        if (EndoCAb___lte != null) {
            joiner.add("EndoCAb___lte: " + GraphQLRequestSerializer.getEntry(EndoCAb___lte));
        }
        if (EndoCAb___gt != null) {
            joiner.add("EndoCAb___gt: " + GraphQLRequestSerializer.getEntry(EndoCAb___gt));
        }
        if (EndoCAb___gte != null) {
            joiner.add("EndoCAb___gte: " + GraphQLRequestSerializer.getEntry(EndoCAb___gte));
        }
        if (HLADR_cd38_cd8___eq != null) {
            joiner.add("HLADR_cd38_cd8___eq: " + GraphQLRequestSerializer.getEntry(HLADR_cd38_cd8___eq));
        }
        if (HLADR_cd38_cd8___ne != null) {
            joiner.add("HLADR_cd38_cd8___ne: " + GraphQLRequestSerializer.getEntry(HLADR_cd38_cd8___ne));
        }
        if (HLADR_cd38_cd8___null != null) {
            joiner.add("HLADR_cd38_cd8___null: " + GraphQLRequestSerializer.getEntry(HLADR_cd38_cd8___null));
        }
        if (HLADR_cd38_cd8___not___null != null) {
            joiner.add("HLADR_cd38_cd8___not___null: " + GraphQLRequestSerializer.getEntry(HLADR_cd38_cd8___not___null));
        }
        if (HLADR_cd38_cd8___in != null) {
            joiner.add("HLADR_cd38_cd8___in: " + GraphQLRequestSerializer.getEntry(HLADR_cd38_cd8___in));
        }
        if (HLADR_cd38_cd8___not___in != null) {
            joiner.add("HLADR_cd38_cd8___not___in: " + GraphQLRequestSerializer.getEntry(HLADR_cd38_cd8___not___in));
        }
        if (HLADR_cd38_cd8___lt != null) {
            joiner.add("HLADR_cd38_cd8___lt: " + GraphQLRequestSerializer.getEntry(HLADR_cd38_cd8___lt));
        }
        if (HLADR_cd38_cd8___lte != null) {
            joiner.add("HLADR_cd38_cd8___lte: " + GraphQLRequestSerializer.getEntry(HLADR_cd38_cd8___lte));
        }
        if (HLADR_cd38_cd8___gt != null) {
            joiner.add("HLADR_cd38_cd8___gt: " + GraphQLRequestSerializer.getEntry(HLADR_cd38_cd8___gt));
        }
        if (HLADR_cd38_cd8___gte != null) {
            joiner.add("HLADR_cd38_cd8___gte: " + GraphQLRequestSerializer.getEntry(HLADR_cd38_cd8___gte));
        }
        if (IL6___eq != null) {
            joiner.add("IL6___eq: " + GraphQLRequestSerializer.getEntry(IL6___eq));
        }
        if (IL6___ne != null) {
            joiner.add("IL6___ne: " + GraphQLRequestSerializer.getEntry(IL6___ne));
        }
        if (IL6___null != null) {
            joiner.add("IL6___null: " + GraphQLRequestSerializer.getEntry(IL6___null));
        }
        if (IL6___not___null != null) {
            joiner.add("IL6___not___null: " + GraphQLRequestSerializer.getEntry(IL6___not___null));
        }
        if (IL6___in != null) {
            joiner.add("IL6___in: " + GraphQLRequestSerializer.getEntry(IL6___in));
        }
        if (IL6___not___in != null) {
            joiner.add("IL6___not___in: " + GraphQLRequestSerializer.getEntry(IL6___not___in));
        }
        if (IL6___lt != null) {
            joiner.add("IL6___lt: " + GraphQLRequestSerializer.getEntry(IL6___lt));
        }
        if (IL6___lte != null) {
            joiner.add("IL6___lte: " + GraphQLRequestSerializer.getEntry(IL6___lte));
        }
        if (IL6___gt != null) {
            joiner.add("IL6___gt: " + GraphQLRequestSerializer.getEntry(IL6___gt));
        }
        if (IL6___gte != null) {
            joiner.add("IL6___gte: " + GraphQLRequestSerializer.getEntry(IL6___gte));
        }
        if (LPS___eq != null) {
            joiner.add("LPS___eq: " + GraphQLRequestSerializer.getEntry(LPS___eq));
        }
        if (LPS___ne != null) {
            joiner.add("LPS___ne: " + GraphQLRequestSerializer.getEntry(LPS___ne));
        }
        if (LPS___null != null) {
            joiner.add("LPS___null: " + GraphQLRequestSerializer.getEntry(LPS___null));
        }
        if (LPS___not___null != null) {
            joiner.add("LPS___not___null: " + GraphQLRequestSerializer.getEntry(LPS___not___null));
        }
        if (LPS___in != null) {
            joiner.add("LPS___in: " + GraphQLRequestSerializer.getEntry(LPS___in));
        }
        if (LPS___not___in != null) {
            joiner.add("LPS___not___in: " + GraphQLRequestSerializer.getEntry(LPS___not___in));
        }
        if (LPS___lt != null) {
            joiner.add("LPS___lt: " + GraphQLRequestSerializer.getEntry(LPS___lt));
        }
        if (LPS___lte != null) {
            joiner.add("LPS___lte: " + GraphQLRequestSerializer.getEntry(LPS___lte));
        }
        if (LPS___gt != null) {
            joiner.add("LPS___gt: " + GraphQLRequestSerializer.getEntry(LPS___gt));
        }
        if (LPS___gte != null) {
            joiner.add("LPS___gte: " + GraphQLRequestSerializer.getEntry(LPS___gte));
        }
        if (LPS_P___eq != null) {
            joiner.add("LPS_P___eq: " + GraphQLRequestSerializer.getEntry(LPS_P___eq));
        }
        if (LPS_P___ne != null) {
            joiner.add("LPS_P___ne: " + GraphQLRequestSerializer.getEntry(LPS_P___ne));
        }
        if (LPS_P___null != null) {
            joiner.add("LPS_P___null: " + GraphQLRequestSerializer.getEntry(LPS_P___null));
        }
        if (LPS_P___not___null != null) {
            joiner.add("LPS_P___not___null: " + GraphQLRequestSerializer.getEntry(LPS_P___not___null));
        }
        if (LPS_P___in != null) {
            joiner.add("LPS_P___in: " + GraphQLRequestSerializer.getEntry(LPS_P___in));
        }
        if (LPS_P___not___in != null) {
            joiner.add("LPS_P___not___in: " + GraphQLRequestSerializer.getEntry(LPS_P___not___in));
        }
        if (LPS_P___lt != null) {
            joiner.add("LPS_P___lt: " + GraphQLRequestSerializer.getEntry(LPS_P___lt));
        }
        if (LPS_P___lte != null) {
            joiner.add("LPS_P___lte: " + GraphQLRequestSerializer.getEntry(LPS_P___lte));
        }
        if (LPS_P___gt != null) {
            joiner.add("LPS_P___gt: " + GraphQLRequestSerializer.getEntry(LPS_P___gt));
        }
        if (LPS_P___gte != null) {
            joiner.add("LPS_P___gte: " + GraphQLRequestSerializer.getEntry(LPS_P___gte));
        }
        if (LPS_V___eq != null) {
            joiner.add("LPS_V___eq: " + GraphQLRequestSerializer.getEntry(LPS_V___eq));
        }
        if (LPS_V___ne != null) {
            joiner.add("LPS_V___ne: " + GraphQLRequestSerializer.getEntry(LPS_V___ne));
        }
        if (LPS_V___null != null) {
            joiner.add("LPS_V___null: " + GraphQLRequestSerializer.getEntry(LPS_V___null));
        }
        if (LPS_V___not___null != null) {
            joiner.add("LPS_V___not___null: " + GraphQLRequestSerializer.getEntry(LPS_V___not___null));
        }
        if (LPS_V___in != null) {
            joiner.add("LPS_V___in: " + GraphQLRequestSerializer.getEntry(LPS_V___in));
        }
        if (LPS_V___not___in != null) {
            joiner.add("LPS_V___not___in: " + GraphQLRequestSerializer.getEntry(LPS_V___not___in));
        }
        if (LPS_V___lt != null) {
            joiner.add("LPS_V___lt: " + GraphQLRequestSerializer.getEntry(LPS_V___lt));
        }
        if (LPS_V___lte != null) {
            joiner.add("LPS_V___lte: " + GraphQLRequestSerializer.getEntry(LPS_V___lte));
        }
        if (LPS_V___gt != null) {
            joiner.add("LPS_V___gt: " + GraphQLRequestSerializer.getEntry(LPS_V___gt));
        }
        if (LPS_V___gte != null) {
            joiner.add("LPS_V___gte: " + GraphQLRequestSerializer.getEntry(LPS_V___gte));
        }
        if (LPS_recovery___eq != null) {
            joiner.add("LPS_recovery___eq: " + GraphQLRequestSerializer.getEntry(LPS_recovery___eq));
        }
        if (LPS_recovery___ne != null) {
            joiner.add("LPS_recovery___ne: " + GraphQLRequestSerializer.getEntry(LPS_recovery___ne));
        }
        if (LPS_recovery___null != null) {
            joiner.add("LPS_recovery___null: " + GraphQLRequestSerializer.getEntry(LPS_recovery___null));
        }
        if (LPS_recovery___not___null != null) {
            joiner.add("LPS_recovery___not___null: " + GraphQLRequestSerializer.getEntry(LPS_recovery___not___null));
        }
        if (LPS_recovery___in != null) {
            joiner.add("LPS_recovery___in: " + GraphQLRequestSerializer.getEntry(LPS_recovery___in));
        }
        if (LPS_recovery___not___in != null) {
            joiner.add("LPS_recovery___not___in: " + GraphQLRequestSerializer.getEntry(LPS_recovery___not___in));
        }
        if (LPS_recovery___lt != null) {
            joiner.add("LPS_recovery___lt: " + GraphQLRequestSerializer.getEntry(LPS_recovery___lt));
        }
        if (LPS_recovery___lte != null) {
            joiner.add("LPS_recovery___lte: " + GraphQLRequestSerializer.getEntry(LPS_recovery___lte));
        }
        if (LPS_recovery___gt != null) {
            joiner.add("LPS_recovery___gt: " + GraphQLRequestSerializer.getEntry(LPS_recovery___gt));
        }
        if (LPS_recovery___gte != null) {
            joiner.add("LPS_recovery___gte: " + GraphQLRequestSerializer.getEntry(LPS_recovery___gte));
        }
        if (PCR___eq != null) {
            joiner.add("PCR___eq: " + GraphQLRequestSerializer.getEntry(PCR___eq));
        }
        if (PCR___ne != null) {
            joiner.add("PCR___ne: " + GraphQLRequestSerializer.getEntry(PCR___ne));
        }
        if (PCR___null != null) {
            joiner.add("PCR___null: " + GraphQLRequestSerializer.getEntry(PCR___null));
        }
        if (PCR___not___null != null) {
            joiner.add("PCR___not___null: " + GraphQLRequestSerializer.getEntry(PCR___not___null));
        }
        if (PCR___in != null) {
            joiner.add("PCR___in: " + GraphQLRequestSerializer.getEntry(PCR___in));
        }
        if (PCR___not___in != null) {
            joiner.add("PCR___not___in: " + GraphQLRequestSerializer.getEntry(PCR___not___in));
        }
        if (PCR___lt != null) {
            joiner.add("PCR___lt: " + GraphQLRequestSerializer.getEntry(PCR___lt));
        }
        if (PCR___lte != null) {
            joiner.add("PCR___lte: " + GraphQLRequestSerializer.getEntry(PCR___lte));
        }
        if (PCR___gt != null) {
            joiner.add("PCR___gt: " + GraphQLRequestSerializer.getEntry(PCR___gt));
        }
        if (PCR___gte != null) {
            joiner.add("PCR___gte: " + GraphQLRequestSerializer.getEntry(PCR___gte));
        }
        if (PCR_US___eq != null) {
            joiner.add("PCR_US___eq: " + GraphQLRequestSerializer.getEntry(PCR_US___eq));
        }
        if (PCR_US___ne != null) {
            joiner.add("PCR_US___ne: " + GraphQLRequestSerializer.getEntry(PCR_US___ne));
        }
        if (PCR_US___null != null) {
            joiner.add("PCR_US___null: " + GraphQLRequestSerializer.getEntry(PCR_US___null));
        }
        if (PCR_US___not___null != null) {
            joiner.add("PCR_US___not___null: " + GraphQLRequestSerializer.getEntry(PCR_US___not___null));
        }
        if (PCR_US___in != null) {
            joiner.add("PCR_US___in: " + GraphQLRequestSerializer.getEntry(PCR_US___in));
        }
        if (PCR_US___not___in != null) {
            joiner.add("PCR_US___not___in: " + GraphQLRequestSerializer.getEntry(PCR_US___not___in));
        }
        if (PCR_US___lt != null) {
            joiner.add("PCR_US___lt: " + GraphQLRequestSerializer.getEntry(PCR_US___lt));
        }
        if (PCR_US___lte != null) {
            joiner.add("PCR_US___lte: " + GraphQLRequestSerializer.getEntry(PCR_US___lte));
        }
        if (PCR_US___gt != null) {
            joiner.add("PCR_US___gt: " + GraphQLRequestSerializer.getEntry(PCR_US___gt));
        }
        if (PCR_US___gte != null) {
            joiner.add("PCR_US___gte: " + GraphQLRequestSerializer.getEntry(PCR_US___gte));
        }
        if (PTX3___eq != null) {
            joiner.add("PTX3___eq: " + GraphQLRequestSerializer.getEntry(PTX3___eq));
        }
        if (PTX3___ne != null) {
            joiner.add("PTX3___ne: " + GraphQLRequestSerializer.getEntry(PTX3___ne));
        }
        if (PTX3___null != null) {
            joiner.add("PTX3___null: " + GraphQLRequestSerializer.getEntry(PTX3___null));
        }
        if (PTX3___not___null != null) {
            joiner.add("PTX3___not___null: " + GraphQLRequestSerializer.getEntry(PTX3___not___null));
        }
        if (PTX3___in != null) {
            joiner.add("PTX3___in: " + GraphQLRequestSerializer.getEntry(PTX3___in));
        }
        if (PTX3___not___in != null) {
            joiner.add("PTX3___not___in: " + GraphQLRequestSerializer.getEntry(PTX3___not___in));
        }
        if (PTX3___lt != null) {
            joiner.add("PTX3___lt: " + GraphQLRequestSerializer.getEntry(PTX3___lt));
        }
        if (PTX3___lte != null) {
            joiner.add("PTX3___lte: " + GraphQLRequestSerializer.getEntry(PTX3___lte));
        }
        if (PTX3___gt != null) {
            joiner.add("PTX3___gt: " + GraphQLRequestSerializer.getEntry(PTX3___gt));
        }
        if (PTX3___gte != null) {
            joiner.add("PTX3___gte: " + GraphQLRequestSerializer.getEntry(PTX3___gte));
        }
        if (TNFa___eq != null) {
            joiner.add("TNFa___eq: " + GraphQLRequestSerializer.getEntry(TNFa___eq));
        }
        if (TNFa___ne != null) {
            joiner.add("TNFa___ne: " + GraphQLRequestSerializer.getEntry(TNFa___ne));
        }
        if (TNFa___null != null) {
            joiner.add("TNFa___null: " + GraphQLRequestSerializer.getEntry(TNFa___null));
        }
        if (TNFa___not___null != null) {
            joiner.add("TNFa___not___null: " + GraphQLRequestSerializer.getEntry(TNFa___not___null));
        }
        if (TNFa___in != null) {
            joiner.add("TNFa___in: " + GraphQLRequestSerializer.getEntry(TNFa___in));
        }
        if (TNFa___not___in != null) {
            joiner.add("TNFa___not___in: " + GraphQLRequestSerializer.getEntry(TNFa___not___in));
        }
        if (TNFa___lt != null) {
            joiner.add("TNFa___lt: " + GraphQLRequestSerializer.getEntry(TNFa___lt));
        }
        if (TNFa___lte != null) {
            joiner.add("TNFa___lte: " + GraphQLRequestSerializer.getEntry(TNFa___lte));
        }
        if (TNFa___gt != null) {
            joiner.add("TNFa___gt: " + GraphQLRequestSerializer.getEntry(TNFa___gt));
        }
        if (TNFa___gte != null) {
            joiner.add("TNFa___gte: " + GraphQLRequestSerializer.getEntry(TNFa___gte));
        }
        if (VCAM1___eq != null) {
            joiner.add("VCAM1___eq: " + GraphQLRequestSerializer.getEntry(VCAM1___eq));
        }
        if (VCAM1___ne != null) {
            joiner.add("VCAM1___ne: " + GraphQLRequestSerializer.getEntry(VCAM1___ne));
        }
        if (VCAM1___null != null) {
            joiner.add("VCAM1___null: " + GraphQLRequestSerializer.getEntry(VCAM1___null));
        }
        if (VCAM1___not___null != null) {
            joiner.add("VCAM1___not___null: " + GraphQLRequestSerializer.getEntry(VCAM1___not___null));
        }
        if (VCAM1___in != null) {
            joiner.add("VCAM1___in: " + GraphQLRequestSerializer.getEntry(VCAM1___in));
        }
        if (VCAM1___not___in != null) {
            joiner.add("VCAM1___not___in: " + GraphQLRequestSerializer.getEntry(VCAM1___not___in));
        }
        if (VCAM1___lt != null) {
            joiner.add("VCAM1___lt: " + GraphQLRequestSerializer.getEntry(VCAM1___lt));
        }
        if (VCAM1___lte != null) {
            joiner.add("VCAM1___lte: " + GraphQLRequestSerializer.getEntry(VCAM1___lte));
        }
        if (VCAM1___gt != null) {
            joiner.add("VCAM1___gt: " + GraphQLRequestSerializer.getEntry(VCAM1___gt));
        }
        if (VCAM1___gte != null) {
            joiner.add("VCAM1___gte: " + GraphQLRequestSerializer.getEntry(VCAM1___gte));
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
        if (anti3S_AU___eq != null) {
            joiner.add("anti3S_AU___eq: " + GraphQLRequestSerializer.getEntry(anti3S_AU___eq));
        }
        if (anti3S_AU___ne != null) {
            joiner.add("anti3S_AU___ne: " + GraphQLRequestSerializer.getEntry(anti3S_AU___ne));
        }
        if (anti3S_AU___null != null) {
            joiner.add("anti3S_AU___null: " + GraphQLRequestSerializer.getEntry(anti3S_AU___null));
        }
        if (anti3S_AU___not___null != null) {
            joiner.add("anti3S_AU___not___null: " + GraphQLRequestSerializer.getEntry(anti3S_AU___not___null));
        }
        if (anti3S_AU___in != null) {
            joiner.add("anti3S_AU___in: " + GraphQLRequestSerializer.getEntry(anti3S_AU___in));
        }
        if (anti3S_AU___not___in != null) {
            joiner.add("anti3S_AU___not___in: " + GraphQLRequestSerializer.getEntry(anti3S_AU___not___in));
        }
        if (anti3S_AU___lt != null) {
            joiner.add("anti3S_AU___lt: " + GraphQLRequestSerializer.getEntry(anti3S_AU___lt));
        }
        if (anti3S_AU___lte != null) {
            joiner.add("anti3S_AU___lte: " + GraphQLRequestSerializer.getEntry(anti3S_AU___lte));
        }
        if (anti3S_AU___gt != null) {
            joiner.add("anti3S_AU___gt: " + GraphQLRequestSerializer.getEntry(anti3S_AU___gt));
        }
        if (anti3S_AU___gte != null) {
            joiner.add("anti3S_AU___gte: " + GraphQLRequestSerializer.getEntry(anti3S_AU___gte));
        }
        if (cell___eq != null) {
            joiner.add("cell___eq: " + GraphQLRequestSerializer.getEntry(cell___eq));
        }
        if (cell___ne != null) {
            joiner.add("cell___ne: " + GraphQLRequestSerializer.getEntry(cell___ne));
        }
        if (cell___null != null) {
            joiner.add("cell___null: " + GraphQLRequestSerializer.getEntry(cell___null));
        }
        if (cell___not___null != null) {
            joiner.add("cell___not___null: " + GraphQLRequestSerializer.getEntry(cell___not___null));
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
        if (hivdna_copie_cells___eq != null) {
            joiner.add("hivdna_copie_cells___eq: " + GraphQLRequestSerializer.getEntry(hivdna_copie_cells___eq));
        }
        if (hivdna_copie_cells___ne != null) {
            joiner.add("hivdna_copie_cells___ne: " + GraphQLRequestSerializer.getEntry(hivdna_copie_cells___ne));
        }
        if (hivdna_copie_cells___null != null) {
            joiner.add("hivdna_copie_cells___null: " + GraphQLRequestSerializer.getEntry(hivdna_copie_cells___null));
        }
        if (hivdna_copie_cells___not___null != null) {
            joiner.add("hivdna_copie_cells___not___null: " + GraphQLRequestSerializer.getEntry(hivdna_copie_cells___not___null));
        }
        if (hivdna_copie_cells___in != null) {
            joiner.add("hivdna_copie_cells___in: " + GraphQLRequestSerializer.getEntry(hivdna_copie_cells___in));
        }
        if (hivdna_copie_cells___not___in != null) {
            joiner.add("hivdna_copie_cells___not___in: " + GraphQLRequestSerializer.getEntry(hivdna_copie_cells___not___in));
        }
        if (hivdna_copie_cells___lt != null) {
            joiner.add("hivdna_copie_cells___lt: " + GraphQLRequestSerializer.getEntry(hivdna_copie_cells___lt));
        }
        if (hivdna_copie_cells___lte != null) {
            joiner.add("hivdna_copie_cells___lte: " + GraphQLRequestSerializer.getEntry(hivdna_copie_cells___lte));
        }
        if (hivdna_copie_cells___gt != null) {
            joiner.add("hivdna_copie_cells___gt: " + GraphQLRequestSerializer.getEntry(hivdna_copie_cells___gt));
        }
        if (hivdna_copie_cells___gte != null) {
            joiner.add("hivdna_copie_cells___gte: " + GraphQLRequestSerializer.getEntry(hivdna_copie_cells___gte));
        }
        if (hivdna_copie_ml___eq != null) {
            joiner.add("hivdna_copie_ml___eq: " + GraphQLRequestSerializer.getEntry(hivdna_copie_ml___eq));
        }
        if (hivdna_copie_ml___ne != null) {
            joiner.add("hivdna_copie_ml___ne: " + GraphQLRequestSerializer.getEntry(hivdna_copie_ml___ne));
        }
        if (hivdna_copie_ml___null != null) {
            joiner.add("hivdna_copie_ml___null: " + GraphQLRequestSerializer.getEntry(hivdna_copie_ml___null));
        }
        if (hivdna_copie_ml___not___null != null) {
            joiner.add("hivdna_copie_ml___not___null: " + GraphQLRequestSerializer.getEntry(hivdna_copie_ml___not___null));
        }
        if (hivdna_copie_ml___in != null) {
            joiner.add("hivdna_copie_ml___in: " + GraphQLRequestSerializer.getEntry(hivdna_copie_ml___in));
        }
        if (hivdna_copie_ml___not___in != null) {
            joiner.add("hivdna_copie_ml___not___in: " + GraphQLRequestSerializer.getEntry(hivdna_copie_ml___not___in));
        }
        if (hivdna_copie_ml___lt != null) {
            joiner.add("hivdna_copie_ml___lt: " + GraphQLRequestSerializer.getEntry(hivdna_copie_ml___lt));
        }
        if (hivdna_copie_ml___lte != null) {
            joiner.add("hivdna_copie_ml___lte: " + GraphQLRequestSerializer.getEntry(hivdna_copie_ml___lte));
        }
        if (hivdna_copie_ml___gt != null) {
            joiner.add("hivdna_copie_ml___gt: " + GraphQLRequestSerializer.getEntry(hivdna_copie_ml___gt));
        }
        if (hivdna_copie_ml___gte != null) {
            joiner.add("hivdna_copie_ml___gte: " + GraphQLRequestSerializer.getEntry(hivdna_copie_ml___gte));
        }
        if (reliab___eq != null) {
            joiner.add("reliab___eq: " + GraphQLRequestSerializer.getEntry(reliab___eq));
        }
        if (reliab___ne != null) {
            joiner.add("reliab___ne: " + GraphQLRequestSerializer.getEntry(reliab___ne));
        }
        if (reliab___null != null) {
            joiner.add("reliab___null: " + GraphQLRequestSerializer.getEntry(reliab___null));
        }
        if (reliab___not___null != null) {
            joiner.add("reliab___not___null: " + GraphQLRequestSerializer.getEntry(reliab___not___null));
        }
        if (rs1840680___eq != null) {
            joiner.add("rs1840680___eq: " + GraphQLRequestSerializer.getEntry(rs1840680___eq));
        }
        if (rs1840680___ne != null) {
            joiner.add("rs1840680___ne: " + GraphQLRequestSerializer.getEntry(rs1840680___ne));
        }
        if (rs1840680___null != null) {
            joiner.add("rs1840680___null: " + GraphQLRequestSerializer.getEntry(rs1840680___null));
        }
        if (rs1840680___not___null != null) {
            joiner.add("rs1840680___not___null: " + GraphQLRequestSerializer.getEntry(rs1840680___not___null));
        }
        if (rs1840680___in != null) {
            joiner.add("rs1840680___in: " + GraphQLRequestSerializer.getEntry(rs1840680___in));
        }
        if (rs1840680___not___in != null) {
            joiner.add("rs1840680___not___in: " + GraphQLRequestSerializer.getEntry(rs1840680___not___in));
        }
        if (rs1840680___lt != null) {
            joiner.add("rs1840680___lt: " + GraphQLRequestSerializer.getEntry(rs1840680___lt));
        }
        if (rs1840680___lte != null) {
            joiner.add("rs1840680___lte: " + GraphQLRequestSerializer.getEntry(rs1840680___lte));
        }
        if (rs1840680___gt != null) {
            joiner.add("rs1840680___gt: " + GraphQLRequestSerializer.getEntry(rs1840680___gt));
        }
        if (rs1840680___gte != null) {
            joiner.add("rs1840680___gte: " + GraphQLRequestSerializer.getEntry(rs1840680___gte));
        }
        if (rs1840680___contains != null) {
            joiner.add("rs1840680___contains: " + GraphQLRequestSerializer.getEntry(rs1840680___contains));
        }
        if (rs1840680___not___contains != null) {
            joiner.add("rs1840680___not___contains: " + GraphQLRequestSerializer.getEntry(rs1840680___not___contains));
        }
        if (rs1840680___starts_with != null) {
            joiner.add("rs1840680___starts_with: " + GraphQLRequestSerializer.getEntry(rs1840680___starts_with));
        }
        if (rs1840680___not___starts_with != null) {
            joiner.add("rs1840680___not___starts_with: " + GraphQLRequestSerializer.getEntry(rs1840680___not___starts_with));
        }
        if (rs1840680___ends_with != null) {
            joiner.add("rs1840680___ends_with: " + GraphQLRequestSerializer.getEntry(rs1840680___ends_with));
        }
        if (rs1840680___not___ends_with != null) {
            joiner.add("rs1840680___not___ends_with: " + GraphQLRequestSerializer.getEntry(rs1840680___not___ends_with));
        }
        if (rs2305619___eq != null) {
            joiner.add("rs2305619___eq: " + GraphQLRequestSerializer.getEntry(rs2305619___eq));
        }
        if (rs2305619___ne != null) {
            joiner.add("rs2305619___ne: " + GraphQLRequestSerializer.getEntry(rs2305619___ne));
        }
        if (rs2305619___null != null) {
            joiner.add("rs2305619___null: " + GraphQLRequestSerializer.getEntry(rs2305619___null));
        }
        if (rs2305619___not___null != null) {
            joiner.add("rs2305619___not___null: " + GraphQLRequestSerializer.getEntry(rs2305619___not___null));
        }
        if (rs2305619___in != null) {
            joiner.add("rs2305619___in: " + GraphQLRequestSerializer.getEntry(rs2305619___in));
        }
        if (rs2305619___not___in != null) {
            joiner.add("rs2305619___not___in: " + GraphQLRequestSerializer.getEntry(rs2305619___not___in));
        }
        if (rs2305619___lt != null) {
            joiner.add("rs2305619___lt: " + GraphQLRequestSerializer.getEntry(rs2305619___lt));
        }
        if (rs2305619___lte != null) {
            joiner.add("rs2305619___lte: " + GraphQLRequestSerializer.getEntry(rs2305619___lte));
        }
        if (rs2305619___gt != null) {
            joiner.add("rs2305619___gt: " + GraphQLRequestSerializer.getEntry(rs2305619___gt));
        }
        if (rs2305619___gte != null) {
            joiner.add("rs2305619___gte: " + GraphQLRequestSerializer.getEntry(rs2305619___gte));
        }
        if (rs2305619___contains != null) {
            joiner.add("rs2305619___contains: " + GraphQLRequestSerializer.getEntry(rs2305619___contains));
        }
        if (rs2305619___not___contains != null) {
            joiner.add("rs2305619___not___contains: " + GraphQLRequestSerializer.getEntry(rs2305619___not___contains));
        }
        if (rs2305619___starts_with != null) {
            joiner.add("rs2305619___starts_with: " + GraphQLRequestSerializer.getEntry(rs2305619___starts_with));
        }
        if (rs2305619___not___starts_with != null) {
            joiner.add("rs2305619___not___starts_with: " + GraphQLRequestSerializer.getEntry(rs2305619___not___starts_with));
        }
        if (rs2305619___ends_with != null) {
            joiner.add("rs2305619___ends_with: " + GraphQLRequestSerializer.getEntry(rs2305619___ends_with));
        }
        if (rs2305619___not___ends_with != null) {
            joiner.add("rs2305619___not___ends_with: " + GraphQLRequestSerializer.getEntry(rs2305619___not___ends_with));
        }
        if (rs35948036___eq != null) {
            joiner.add("rs35948036___eq: " + GraphQLRequestSerializer.getEntry(rs35948036___eq));
        }
        if (rs35948036___ne != null) {
            joiner.add("rs35948036___ne: " + GraphQLRequestSerializer.getEntry(rs35948036___ne));
        }
        if (rs35948036___null != null) {
            joiner.add("rs35948036___null: " + GraphQLRequestSerializer.getEntry(rs35948036___null));
        }
        if (rs35948036___not___null != null) {
            joiner.add("rs35948036___not___null: " + GraphQLRequestSerializer.getEntry(rs35948036___not___null));
        }
        if (rs35948036___in != null) {
            joiner.add("rs35948036___in: " + GraphQLRequestSerializer.getEntry(rs35948036___in));
        }
        if (rs35948036___not___in != null) {
            joiner.add("rs35948036___not___in: " + GraphQLRequestSerializer.getEntry(rs35948036___not___in));
        }
        if (rs35948036___lt != null) {
            joiner.add("rs35948036___lt: " + GraphQLRequestSerializer.getEntry(rs35948036___lt));
        }
        if (rs35948036___lte != null) {
            joiner.add("rs35948036___lte: " + GraphQLRequestSerializer.getEntry(rs35948036___lte));
        }
        if (rs35948036___gt != null) {
            joiner.add("rs35948036___gt: " + GraphQLRequestSerializer.getEntry(rs35948036___gt));
        }
        if (rs35948036___gte != null) {
            joiner.add("rs35948036___gte: " + GraphQLRequestSerializer.getEntry(rs35948036___gte));
        }
        if (rs35948036___contains != null) {
            joiner.add("rs35948036___contains: " + GraphQLRequestSerializer.getEntry(rs35948036___contains));
        }
        if (rs35948036___not___contains != null) {
            joiner.add("rs35948036___not___contains: " + GraphQLRequestSerializer.getEntry(rs35948036___not___contains));
        }
        if (rs35948036___starts_with != null) {
            joiner.add("rs35948036___starts_with: " + GraphQLRequestSerializer.getEntry(rs35948036___starts_with));
        }
        if (rs35948036___not___starts_with != null) {
            joiner.add("rs35948036___not___starts_with: " + GraphQLRequestSerializer.getEntry(rs35948036___not___starts_with));
        }
        if (rs35948036___ends_with != null) {
            joiner.add("rs35948036___ends_with: " + GraphQLRequestSerializer.getEntry(rs35948036___ends_with));
        }
        if (rs35948036___not___ends_with != null) {
            joiner.add("rs35948036___not___ends_with: " + GraphQLRequestSerializer.getEntry(rs35948036___not___ends_with));
        }
        if (rs3845978___eq != null) {
            joiner.add("rs3845978___eq: " + GraphQLRequestSerializer.getEntry(rs3845978___eq));
        }
        if (rs3845978___ne != null) {
            joiner.add("rs3845978___ne: " + GraphQLRequestSerializer.getEntry(rs3845978___ne));
        }
        if (rs3845978___null != null) {
            joiner.add("rs3845978___null: " + GraphQLRequestSerializer.getEntry(rs3845978___null));
        }
        if (rs3845978___not___null != null) {
            joiner.add("rs3845978___not___null: " + GraphQLRequestSerializer.getEntry(rs3845978___not___null));
        }
        if (rs3845978___in != null) {
            joiner.add("rs3845978___in: " + GraphQLRequestSerializer.getEntry(rs3845978___in));
        }
        if (rs3845978___not___in != null) {
            joiner.add("rs3845978___not___in: " + GraphQLRequestSerializer.getEntry(rs3845978___not___in));
        }
        if (rs3845978___lt != null) {
            joiner.add("rs3845978___lt: " + GraphQLRequestSerializer.getEntry(rs3845978___lt));
        }
        if (rs3845978___lte != null) {
            joiner.add("rs3845978___lte: " + GraphQLRequestSerializer.getEntry(rs3845978___lte));
        }
        if (rs3845978___gt != null) {
            joiner.add("rs3845978___gt: " + GraphQLRequestSerializer.getEntry(rs3845978___gt));
        }
        if (rs3845978___gte != null) {
            joiner.add("rs3845978___gte: " + GraphQLRequestSerializer.getEntry(rs3845978___gte));
        }
        if (rs3845978___contains != null) {
            joiner.add("rs3845978___contains: " + GraphQLRequestSerializer.getEntry(rs3845978___contains));
        }
        if (rs3845978___not___contains != null) {
            joiner.add("rs3845978___not___contains: " + GraphQLRequestSerializer.getEntry(rs3845978___not___contains));
        }
        if (rs3845978___starts_with != null) {
            joiner.add("rs3845978___starts_with: " + GraphQLRequestSerializer.getEntry(rs3845978___starts_with));
        }
        if (rs3845978___not___starts_with != null) {
            joiner.add("rs3845978___not___starts_with: " + GraphQLRequestSerializer.getEntry(rs3845978___not___starts_with));
        }
        if (rs3845978___ends_with != null) {
            joiner.add("rs3845978___ends_with: " + GraphQLRequestSerializer.getEntry(rs3845978___ends_with));
        }
        if (rs3845978___not___ends_with != null) {
            joiner.add("rs3845978___not___ends_with: " + GraphQLRequestSerializer.getEntry(rs3845978___not___ends_with));
        }
        if (sCD___eq != null) {
            joiner.add("sCD___eq: " + GraphQLRequestSerializer.getEntry(sCD___eq));
        }
        if (sCD___ne != null) {
            joiner.add("sCD___ne: " + GraphQLRequestSerializer.getEntry(sCD___ne));
        }
        if (sCD___null != null) {
            joiner.add("sCD___null: " + GraphQLRequestSerializer.getEntry(sCD___null));
        }
        if (sCD___not___null != null) {
            joiner.add("sCD___not___null: " + GraphQLRequestSerializer.getEntry(sCD___not___null));
        }
        if (sCD___in != null) {
            joiner.add("sCD___in: " + GraphQLRequestSerializer.getEntry(sCD___in));
        }
        if (sCD___not___in != null) {
            joiner.add("sCD___not___in: " + GraphQLRequestSerializer.getEntry(sCD___not___in));
        }
        if (sCD___lt != null) {
            joiner.add("sCD___lt: " + GraphQLRequestSerializer.getEntry(sCD___lt));
        }
        if (sCD___lte != null) {
            joiner.add("sCD___lte: " + GraphQLRequestSerializer.getEntry(sCD___lte));
        }
        if (sCD___gt != null) {
            joiner.add("sCD___gt: " + GraphQLRequestSerializer.getEntry(sCD___gt));
        }
        if (sCD___gte != null) {
            joiner.add("sCD___gte: " + GraphQLRequestSerializer.getEntry(sCD___gte));
        }
        if (sCD14___eq != null) {
            joiner.add("sCD14___eq: " + GraphQLRequestSerializer.getEntry(sCD14___eq));
        }
        if (sCD14___ne != null) {
            joiner.add("sCD14___ne: " + GraphQLRequestSerializer.getEntry(sCD14___ne));
        }
        if (sCD14___null != null) {
            joiner.add("sCD14___null: " + GraphQLRequestSerializer.getEntry(sCD14___null));
        }
        if (sCD14___not___null != null) {
            joiner.add("sCD14___not___null: " + GraphQLRequestSerializer.getEntry(sCD14___not___null));
        }
        if (sCD14___in != null) {
            joiner.add("sCD14___in: " + GraphQLRequestSerializer.getEntry(sCD14___in));
        }
        if (sCD14___not___in != null) {
            joiner.add("sCD14___not___in: " + GraphQLRequestSerializer.getEntry(sCD14___not___in));
        }
        if (sCD14___lt != null) {
            joiner.add("sCD14___lt: " + GraphQLRequestSerializer.getEntry(sCD14___lt));
        }
        if (sCD14___lte != null) {
            joiner.add("sCD14___lte: " + GraphQLRequestSerializer.getEntry(sCD14___lte));
        }
        if (sCD14___gt != null) {
            joiner.add("sCD14___gt: " + GraphQLRequestSerializer.getEntry(sCD14___gt));
        }
        if (sCD14___gte != null) {
            joiner.add("sCD14___gte: " + GraphQLRequestSerializer.getEntry(sCD14___gte));
        }
        if (sCD163___eq != null) {
            joiner.add("sCD163___eq: " + GraphQLRequestSerializer.getEntry(sCD163___eq));
        }
        if (sCD163___ne != null) {
            joiner.add("sCD163___ne: " + GraphQLRequestSerializer.getEntry(sCD163___ne));
        }
        if (sCD163___null != null) {
            joiner.add("sCD163___null: " + GraphQLRequestSerializer.getEntry(sCD163___null));
        }
        if (sCD163___not___null != null) {
            joiner.add("sCD163___not___null: " + GraphQLRequestSerializer.getEntry(sCD163___not___null));
        }
        if (sCD163___in != null) {
            joiner.add("sCD163___in: " + GraphQLRequestSerializer.getEntry(sCD163___in));
        }
        if (sCD163___not___in != null) {
            joiner.add("sCD163___not___in: " + GraphQLRequestSerializer.getEntry(sCD163___not___in));
        }
        if (sCD163___lt != null) {
            joiner.add("sCD163___lt: " + GraphQLRequestSerializer.getEntry(sCD163___lt));
        }
        if (sCD163___lte != null) {
            joiner.add("sCD163___lte: " + GraphQLRequestSerializer.getEntry(sCD163___lte));
        }
        if (sCD163___gt != null) {
            joiner.add("sCD163___gt: " + GraphQLRequestSerializer.getEntry(sCD163___gt));
        }
        if (sCD163___gte != null) {
            joiner.add("sCD163___gte: " + GraphQLRequestSerializer.getEntry(sCD163___gte));
        }
        if (tipo_marker___eq != null) {
            joiner.add("tipo_marker___eq: " + GraphQLRequestSerializer.getEntry(tipo_marker___eq));
        }
        if (tipo_marker___ne != null) {
            joiner.add("tipo_marker___ne: " + GraphQLRequestSerializer.getEntry(tipo_marker___ne));
        }
        if (tipo_marker___null != null) {
            joiner.add("tipo_marker___null: " + GraphQLRequestSerializer.getEntry(tipo_marker___null));
        }
        if (tipo_marker___not___null != null) {
            joiner.add("tipo_marker___not___null: " + GraphQLRequestSerializer.getEntry(tipo_marker___not___null));
        }
        if (tipo_marker___in != null) {
            joiner.add("tipo_marker___in: " + GraphQLRequestSerializer.getEntry(tipo_marker___in));
        }
        if (tipo_marker___not___in != null) {
            joiner.add("tipo_marker___not___in: " + GraphQLRequestSerializer.getEntry(tipo_marker___not___in));
        }
        if (tipo_marker___lt != null) {
            joiner.add("tipo_marker___lt: " + GraphQLRequestSerializer.getEntry(tipo_marker___lt));
        }
        if (tipo_marker___lte != null) {
            joiner.add("tipo_marker___lte: " + GraphQLRequestSerializer.getEntry(tipo_marker___lte));
        }
        if (tipo_marker___gt != null) {
            joiner.add("tipo_marker___gt: " + GraphQLRequestSerializer.getEntry(tipo_marker___gt));
        }
        if (tipo_marker___gte != null) {
            joiner.add("tipo_marker___gte: " + GraphQLRequestSerializer.getEntry(tipo_marker___gte));
        }
        if (tipo_marker___contains != null) {
            joiner.add("tipo_marker___contains: " + GraphQLRequestSerializer.getEntry(tipo_marker___contains));
        }
        if (tipo_marker___not___contains != null) {
            joiner.add("tipo_marker___not___contains: " + GraphQLRequestSerializer.getEntry(tipo_marker___not___contains));
        }
        if (tipo_marker___starts_with != null) {
            joiner.add("tipo_marker___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_marker___starts_with));
        }
        if (tipo_marker___not___starts_with != null) {
            joiner.add("tipo_marker___not___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_marker___not___starts_with));
        }
        if (tipo_marker___ends_with != null) {
            joiner.add("tipo_marker___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_marker___ends_with));
        }
        if (tipo_marker___not___ends_with != null) {
            joiner.add("tipo_marker___not___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_marker___not___ends_with));
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
        if (valore___contains != null) {
            joiner.add("valore___contains: " + GraphQLRequestSerializer.getEntry(valore___contains));
        }
        if (valore___not___contains != null) {
            joiner.add("valore___not___contains: " + GraphQLRequestSerializer.getEntry(valore___not___contains));
        }
        if (valore___starts_with != null) {
            joiner.add("valore___starts_with: " + GraphQLRequestSerializer.getEntry(valore___starts_with));
        }
        if (valore___not___starts_with != null) {
            joiner.add("valore___not___starts_with: " + GraphQLRequestSerializer.getEntry(valore___not___starts_with));
        }
        if (valore___ends_with != null) {
            joiner.add("valore___ends_with: " + GraphQLRequestSerializer.getEntry(valore___ends_with));
        }
        if (valore___not___ends_with != null) {
            joiner.add("valore___not___ends_with: " + GraphQLRequestSerializer.getEntry(valore___not___ends_with));
        }
        if (variable___eq != null) {
            joiner.add("variable___eq: " + GraphQLRequestSerializer.getEntry(variable___eq));
        }
        if (variable___ne != null) {
            joiner.add("variable___ne: " + GraphQLRequestSerializer.getEntry(variable___ne));
        }
        if (variable___null != null) {
            joiner.add("variable___null: " + GraphQLRequestSerializer.getEntry(variable___null));
        }
        if (variable___not___null != null) {
            joiner.add("variable___not___null: " + GraphQLRequestSerializer.getEntry(variable___not___null));
        }
        if (volume___eq != null) {
            joiner.add("volume___eq: " + GraphQLRequestSerializer.getEntry(volume___eq));
        }
        if (volume___ne != null) {
            joiner.add("volume___ne: " + GraphQLRequestSerializer.getEntry(volume___ne));
        }
        if (volume___null != null) {
            joiner.add("volume___null: " + GraphQLRequestSerializer.getEntry(volume___null));
        }
        if (volume___not___null != null) {
            joiner.add("volume___not___null: " + GraphQLRequestSerializer.getEntry(volume___not___null));
        }
        if (volume___in != null) {
            joiner.add("volume___in: " + GraphQLRequestSerializer.getEntry(volume___in));
        }
        if (volume___not___in != null) {
            joiner.add("volume___not___in: " + GraphQLRequestSerializer.getEntry(volume___not___in));
        }
        if (volume___lt != null) {
            joiner.add("volume___lt: " + GraphQLRequestSerializer.getEntry(volume___lt));
        }
        if (volume___lte != null) {
            joiner.add("volume___lte: " + GraphQLRequestSerializer.getEntry(volume___lte));
        }
        if (volume___gt != null) {
            joiner.add("volume___gt: " + GraphQLRequestSerializer.getEntry(volume___gt));
        }
        if (volume___gte != null) {
            joiner.add("volume___gte: " + GraphQLRequestSerializer.getEntry(volume___gte));
        }
        if (volume___contains != null) {
            joiner.add("volume___contains: " + GraphQLRequestSerializer.getEntry(volume___contains));
        }
        if (volume___not___contains != null) {
            joiner.add("volume___not___contains: " + GraphQLRequestSerializer.getEntry(volume___not___contains));
        }
        if (volume___starts_with != null) {
            joiner.add("volume___starts_with: " + GraphQLRequestSerializer.getEntry(volume___starts_with));
        }
        if (volume___not___starts_with != null) {
            joiner.add("volume___not___starts_with: " + GraphQLRequestSerializer.getEntry(volume___not___starts_with));
        }
        if (volume___ends_with != null) {
            joiner.add("volume___ends_with: " + GraphQLRequestSerializer.getEntry(volume___ends_with));
        }
        if (volume___not___ends_with != null) {
            joiner.add("volume___not___ends_with: " + GraphQLRequestSerializer.getEntry(volume___not___ends_with));
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

    public static CliMarkers_altriFilterDTO.Builder builder() {
        return new CliMarkers_altriFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId___eq;
        private String AP_CD34_15___eq;
        private String AP_CD34_15___ne;
        private Boolean AP_CD34_15___null;
        private Boolean AP_CD34_15___not___null;
        private java.util.List<String> AP_CD34_15___in;
        private java.util.List<String> AP_CD34_15___not___in;
        private String AP_CD34_15___lt;
        private String AP_CD34_15___lte;
        private String AP_CD34_15___gt;
        private String AP_CD34_15___gte;
        private String CD14_11b_51_61___eq;
        private String CD14_11b_51_61___ne;
        private Boolean CD14_11b_51_61___null;
        private Boolean CD14_11b_51_61___not___null;
        private java.util.List<String> CD14_11b_51_61___in;
        private java.util.List<String> CD14_11b_51_61___not___in;
        private String CD14_11b_51_61___lt;
        private String CD14_11b_51_61___lte;
        private String CD14_11b_51_61___gt;
        private String CD14_11b_51_61___gte;
        private String CDACT___eq;
        private String CDACT___ne;
        private Boolean CDACT___null;
        private Boolean CDACT___not___null;
        private java.util.List<String> CDACT___in;
        private java.util.List<String> CDACT___not___in;
        private String CDACT___lt;
        private String CDACT___lte;
        private String CDACT___gt;
        private String CDACT___gte;
        private String CMVIgG_OD___eq;
        private String CMVIgG_OD___ne;
        private Boolean CMVIgG_OD___null;
        private Boolean CMVIgG_OD___not___null;
        private java.util.List<String> CMVIgG_OD___in;
        private java.util.List<String> CMVIgG_OD___not___in;
        private String CMVIgG_OD___lt;
        private String CMVIgG_OD___lte;
        private String CMVIgG_OD___gt;
        private String CMVIgG_OD___gte;
        private String Cistatina_C___eq;
        private String Cistatina_C___ne;
        private Boolean Cistatina_C___null;
        private Boolean Cistatina_C___not___null;
        private java.util.List<String> Cistatina_C___in;
        private java.util.List<String> Cistatina_C___not___in;
        private String Cistatina_C___lt;
        private String Cistatina_C___lte;
        private String Cistatina_C___gt;
        private String Cistatina_C___gte;
        private String EndoCAb___eq;
        private String EndoCAb___ne;
        private Boolean EndoCAb___null;
        private Boolean EndoCAb___not___null;
        private java.util.List<String> EndoCAb___in;
        private java.util.List<String> EndoCAb___not___in;
        private String EndoCAb___lt;
        private String EndoCAb___lte;
        private String EndoCAb___gt;
        private String EndoCAb___gte;
        private String HLADR_cd38_cd8___eq;
        private String HLADR_cd38_cd8___ne;
        private Boolean HLADR_cd38_cd8___null;
        private Boolean HLADR_cd38_cd8___not___null;
        private java.util.List<String> HLADR_cd38_cd8___in;
        private java.util.List<String> HLADR_cd38_cd8___not___in;
        private String HLADR_cd38_cd8___lt;
        private String HLADR_cd38_cd8___lte;
        private String HLADR_cd38_cd8___gt;
        private String HLADR_cd38_cd8___gte;
        private String IL6___eq;
        private String IL6___ne;
        private Boolean IL6___null;
        private Boolean IL6___not___null;
        private java.util.List<String> IL6___in;
        private java.util.List<String> IL6___not___in;
        private String IL6___lt;
        private String IL6___lte;
        private String IL6___gt;
        private String IL6___gte;
        private String LPS___eq;
        private String LPS___ne;
        private Boolean LPS___null;
        private Boolean LPS___not___null;
        private java.util.List<String> LPS___in;
        private java.util.List<String> LPS___not___in;
        private String LPS___lt;
        private String LPS___lte;
        private String LPS___gt;
        private String LPS___gte;
        private String LPS_P___eq;
        private String LPS_P___ne;
        private Boolean LPS_P___null;
        private Boolean LPS_P___not___null;
        private java.util.List<String> LPS_P___in;
        private java.util.List<String> LPS_P___not___in;
        private String LPS_P___lt;
        private String LPS_P___lte;
        private String LPS_P___gt;
        private String LPS_P___gte;
        private String LPS_V___eq;
        private String LPS_V___ne;
        private Boolean LPS_V___null;
        private Boolean LPS_V___not___null;
        private java.util.List<String> LPS_V___in;
        private java.util.List<String> LPS_V___not___in;
        private String LPS_V___lt;
        private String LPS_V___lte;
        private String LPS_V___gt;
        private String LPS_V___gte;
        private String LPS_recovery___eq;
        private String LPS_recovery___ne;
        private Boolean LPS_recovery___null;
        private Boolean LPS_recovery___not___null;
        private java.util.List<String> LPS_recovery___in;
        private java.util.List<String> LPS_recovery___not___in;
        private String LPS_recovery___lt;
        private String LPS_recovery___lte;
        private String LPS_recovery___gt;
        private String LPS_recovery___gte;
        private String PCR___eq;
        private String PCR___ne;
        private Boolean PCR___null;
        private Boolean PCR___not___null;
        private java.util.List<String> PCR___in;
        private java.util.List<String> PCR___not___in;
        private String PCR___lt;
        private String PCR___lte;
        private String PCR___gt;
        private String PCR___gte;
        private String PCR_US___eq;
        private String PCR_US___ne;
        private Boolean PCR_US___null;
        private Boolean PCR_US___not___null;
        private java.util.List<String> PCR_US___in;
        private java.util.List<String> PCR_US___not___in;
        private String PCR_US___lt;
        private String PCR_US___lte;
        private String PCR_US___gt;
        private String PCR_US___gte;
        private String PTX3___eq;
        private String PTX3___ne;
        private Boolean PTX3___null;
        private Boolean PTX3___not___null;
        private java.util.List<String> PTX3___in;
        private java.util.List<String> PTX3___not___in;
        private String PTX3___lt;
        private String PTX3___lte;
        private String PTX3___gt;
        private String PTX3___gte;
        private String TNFa___eq;
        private String TNFa___ne;
        private Boolean TNFa___null;
        private Boolean TNFa___not___null;
        private java.util.List<String> TNFa___in;
        private java.util.List<String> TNFa___not___in;
        private String TNFa___lt;
        private String TNFa___lte;
        private String TNFa___gt;
        private String TNFa___gte;
        private Integer VCAM1___eq;
        private Integer VCAM1___ne;
        private Boolean VCAM1___null;
        private Boolean VCAM1___not___null;
        private java.util.List<Integer> VCAM1___in;
        private java.util.List<Integer> VCAM1___not___in;
        private Integer VCAM1___lt;
        private Integer VCAM1___lte;
        private Integer VCAM1___gt;
        private Integer VCAM1___gte;
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
        private String anti3S_AU___eq;
        private String anti3S_AU___ne;
        private Boolean anti3S_AU___null;
        private Boolean anti3S_AU___not___null;
        private java.util.List<String> anti3S_AU___in;
        private java.util.List<String> anti3S_AU___not___in;
        private String anti3S_AU___lt;
        private String anti3S_AU___lte;
        private String anti3S_AU___gt;
        private String anti3S_AU___gte;
        private Boolean cell___eq;
        private Boolean cell___ne;
        private Boolean cell___null;
        private Boolean cell___not___null;
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
        private String hivdna_copie_cells___eq;
        private String hivdna_copie_cells___ne;
        private Boolean hivdna_copie_cells___null;
        private Boolean hivdna_copie_cells___not___null;
        private java.util.List<String> hivdna_copie_cells___in;
        private java.util.List<String> hivdna_copie_cells___not___in;
        private String hivdna_copie_cells___lt;
        private String hivdna_copie_cells___lte;
        private String hivdna_copie_cells___gt;
        private String hivdna_copie_cells___gte;
        private String hivdna_copie_ml___eq;
        private String hivdna_copie_ml___ne;
        private Boolean hivdna_copie_ml___null;
        private Boolean hivdna_copie_ml___not___null;
        private java.util.List<String> hivdna_copie_ml___in;
        private java.util.List<String> hivdna_copie_ml___not___in;
        private String hivdna_copie_ml___lt;
        private String hivdna_copie_ml___lte;
        private String hivdna_copie_ml___gt;
        private String hivdna_copie_ml___gte;
        private Boolean reliab___eq;
        private Boolean reliab___ne;
        private Boolean reliab___null;
        private Boolean reliab___not___null;
        private String rs1840680___eq;
        private String rs1840680___ne;
        private Boolean rs1840680___null;
        private Boolean rs1840680___not___null;
        private java.util.List<String> rs1840680___in;
        private java.util.List<String> rs1840680___not___in;
        private String rs1840680___lt;
        private String rs1840680___lte;
        private String rs1840680___gt;
        private String rs1840680___gte;
        private String rs1840680___contains;
        private String rs1840680___not___contains;
        private String rs1840680___starts_with;
        private String rs1840680___not___starts_with;
        private String rs1840680___ends_with;
        private String rs1840680___not___ends_with;
        private String rs2305619___eq;
        private String rs2305619___ne;
        private Boolean rs2305619___null;
        private Boolean rs2305619___not___null;
        private java.util.List<String> rs2305619___in;
        private java.util.List<String> rs2305619___not___in;
        private String rs2305619___lt;
        private String rs2305619___lte;
        private String rs2305619___gt;
        private String rs2305619___gte;
        private String rs2305619___contains;
        private String rs2305619___not___contains;
        private String rs2305619___starts_with;
        private String rs2305619___not___starts_with;
        private String rs2305619___ends_with;
        private String rs2305619___not___ends_with;
        private String rs35948036___eq;
        private String rs35948036___ne;
        private Boolean rs35948036___null;
        private Boolean rs35948036___not___null;
        private java.util.List<String> rs35948036___in;
        private java.util.List<String> rs35948036___not___in;
        private String rs35948036___lt;
        private String rs35948036___lte;
        private String rs35948036___gt;
        private String rs35948036___gte;
        private String rs35948036___contains;
        private String rs35948036___not___contains;
        private String rs35948036___starts_with;
        private String rs35948036___not___starts_with;
        private String rs35948036___ends_with;
        private String rs35948036___not___ends_with;
        private String rs3845978___eq;
        private String rs3845978___ne;
        private Boolean rs3845978___null;
        private Boolean rs3845978___not___null;
        private java.util.List<String> rs3845978___in;
        private java.util.List<String> rs3845978___not___in;
        private String rs3845978___lt;
        private String rs3845978___lte;
        private String rs3845978___gt;
        private String rs3845978___gte;
        private String rs3845978___contains;
        private String rs3845978___not___contains;
        private String rs3845978___starts_with;
        private String rs3845978___not___starts_with;
        private String rs3845978___ends_with;
        private String rs3845978___not___ends_with;
        private String sCD___eq;
        private String sCD___ne;
        private Boolean sCD___null;
        private Boolean sCD___not___null;
        private java.util.List<String> sCD___in;
        private java.util.List<String> sCD___not___in;
        private String sCD___lt;
        private String sCD___lte;
        private String sCD___gt;
        private String sCD___gte;
        private String sCD14___eq;
        private String sCD14___ne;
        private Boolean sCD14___null;
        private Boolean sCD14___not___null;
        private java.util.List<String> sCD14___in;
        private java.util.List<String> sCD14___not___in;
        private String sCD14___lt;
        private String sCD14___lte;
        private String sCD14___gt;
        private String sCD14___gte;
        private String sCD163___eq;
        private String sCD163___ne;
        private Boolean sCD163___null;
        private Boolean sCD163___not___null;
        private java.util.List<String> sCD163___in;
        private java.util.List<String> sCD163___not___in;
        private String sCD163___lt;
        private String sCD163___lte;
        private String sCD163___gt;
        private String sCD163___gte;
        private String tipo_marker___eq;
        private String tipo_marker___ne;
        private Boolean tipo_marker___null;
        private Boolean tipo_marker___not___null;
        private java.util.List<String> tipo_marker___in;
        private java.util.List<String> tipo_marker___not___in;
        private String tipo_marker___lt;
        private String tipo_marker___lte;
        private String tipo_marker___gt;
        private String tipo_marker___gte;
        private String tipo_marker___contains;
        private String tipo_marker___not___contains;
        private String tipo_marker___starts_with;
        private String tipo_marker___not___starts_with;
        private String tipo_marker___ends_with;
        private String tipo_marker___not___ends_with;
        private String valore___eq;
        private String valore___ne;
        private Boolean valore___null;
        private Boolean valore___not___null;
        private java.util.List<String> valore___in;
        private java.util.List<String> valore___not___in;
        private String valore___lt;
        private String valore___lte;
        private String valore___gt;
        private String valore___gte;
        private String valore___contains;
        private String valore___not___contains;
        private String valore___starts_with;
        private String valore___not___starts_with;
        private String valore___ends_with;
        private String valore___not___ends_with;
        private Boolean variable___eq;
        private Boolean variable___ne;
        private Boolean variable___null;
        private Boolean variable___not___null;
        private String volume___eq;
        private String volume___ne;
        private Boolean volume___null;
        private Boolean volume___not___null;
        private java.util.List<String> volume___in;
        private java.util.List<String> volume___not___in;
        private String volume___lt;
        private String volume___lte;
        private String volume___gt;
        private String volume___gte;
        private String volume___contains;
        private String volume___not___contains;
        private String volume___starts_with;
        private String volume___not___starts_with;
        private String volume___ends_with;
        private String volume___not___ends_with;
        private java.util.List<CliMarkers_altriFilterDTO> AND;
        private java.util.List<CliMarkers_altriFilterDTO> OR;
        private CliMarkers_altriFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
            return this;
        }

        public Builder setAP_CD34_15___eq(String AP_CD34_15___eq) {
            this.AP_CD34_15___eq = AP_CD34_15___eq;
            return this;
        }

        public Builder setAP_CD34_15___ne(String AP_CD34_15___ne) {
            this.AP_CD34_15___ne = AP_CD34_15___ne;
            return this;
        }

        public Builder setAP_CD34_15___null(Boolean AP_CD34_15___null) {
            this.AP_CD34_15___null = AP_CD34_15___null;
            return this;
        }

        public Builder setAP_CD34_15___not___null(Boolean AP_CD34_15___not___null) {
            this.AP_CD34_15___not___null = AP_CD34_15___not___null;
            return this;
        }

        public Builder setAP_CD34_15___in(java.util.List<String> AP_CD34_15___in) {
            this.AP_CD34_15___in = AP_CD34_15___in;
            return this;
        }

        public Builder setAP_CD34_15___not___in(java.util.List<String> AP_CD34_15___not___in) {
            this.AP_CD34_15___not___in = AP_CD34_15___not___in;
            return this;
        }

        public Builder setAP_CD34_15___lt(String AP_CD34_15___lt) {
            this.AP_CD34_15___lt = AP_CD34_15___lt;
            return this;
        }

        public Builder setAP_CD34_15___lte(String AP_CD34_15___lte) {
            this.AP_CD34_15___lte = AP_CD34_15___lte;
            return this;
        }

        public Builder setAP_CD34_15___gt(String AP_CD34_15___gt) {
            this.AP_CD34_15___gt = AP_CD34_15___gt;
            return this;
        }

        public Builder setAP_CD34_15___gte(String AP_CD34_15___gte) {
            this.AP_CD34_15___gte = AP_CD34_15___gte;
            return this;
        }

        public Builder setCD14_11b_51_61___eq(String CD14_11b_51_61___eq) {
            this.CD14_11b_51_61___eq = CD14_11b_51_61___eq;
            return this;
        }

        public Builder setCD14_11b_51_61___ne(String CD14_11b_51_61___ne) {
            this.CD14_11b_51_61___ne = CD14_11b_51_61___ne;
            return this;
        }

        public Builder setCD14_11b_51_61___null(Boolean CD14_11b_51_61___null) {
            this.CD14_11b_51_61___null = CD14_11b_51_61___null;
            return this;
        }

        public Builder setCD14_11b_51_61___not___null(Boolean CD14_11b_51_61___not___null) {
            this.CD14_11b_51_61___not___null = CD14_11b_51_61___not___null;
            return this;
        }

        public Builder setCD14_11b_51_61___in(java.util.List<String> CD14_11b_51_61___in) {
            this.CD14_11b_51_61___in = CD14_11b_51_61___in;
            return this;
        }

        public Builder setCD14_11b_51_61___not___in(java.util.List<String> CD14_11b_51_61___not___in) {
            this.CD14_11b_51_61___not___in = CD14_11b_51_61___not___in;
            return this;
        }

        public Builder setCD14_11b_51_61___lt(String CD14_11b_51_61___lt) {
            this.CD14_11b_51_61___lt = CD14_11b_51_61___lt;
            return this;
        }

        public Builder setCD14_11b_51_61___lte(String CD14_11b_51_61___lte) {
            this.CD14_11b_51_61___lte = CD14_11b_51_61___lte;
            return this;
        }

        public Builder setCD14_11b_51_61___gt(String CD14_11b_51_61___gt) {
            this.CD14_11b_51_61___gt = CD14_11b_51_61___gt;
            return this;
        }

        public Builder setCD14_11b_51_61___gte(String CD14_11b_51_61___gte) {
            this.CD14_11b_51_61___gte = CD14_11b_51_61___gte;
            return this;
        }

        public Builder setCDACT___eq(String CDACT___eq) {
            this.CDACT___eq = CDACT___eq;
            return this;
        }

        public Builder setCDACT___ne(String CDACT___ne) {
            this.CDACT___ne = CDACT___ne;
            return this;
        }

        public Builder setCDACT___null(Boolean CDACT___null) {
            this.CDACT___null = CDACT___null;
            return this;
        }

        public Builder setCDACT___not___null(Boolean CDACT___not___null) {
            this.CDACT___not___null = CDACT___not___null;
            return this;
        }

        public Builder setCDACT___in(java.util.List<String> CDACT___in) {
            this.CDACT___in = CDACT___in;
            return this;
        }

        public Builder setCDACT___not___in(java.util.List<String> CDACT___not___in) {
            this.CDACT___not___in = CDACT___not___in;
            return this;
        }

        public Builder setCDACT___lt(String CDACT___lt) {
            this.CDACT___lt = CDACT___lt;
            return this;
        }

        public Builder setCDACT___lte(String CDACT___lte) {
            this.CDACT___lte = CDACT___lte;
            return this;
        }

        public Builder setCDACT___gt(String CDACT___gt) {
            this.CDACT___gt = CDACT___gt;
            return this;
        }

        public Builder setCDACT___gte(String CDACT___gte) {
            this.CDACT___gte = CDACT___gte;
            return this;
        }

        public Builder setCMVIgG_OD___eq(String CMVIgG_OD___eq) {
            this.CMVIgG_OD___eq = CMVIgG_OD___eq;
            return this;
        }

        public Builder setCMVIgG_OD___ne(String CMVIgG_OD___ne) {
            this.CMVIgG_OD___ne = CMVIgG_OD___ne;
            return this;
        }

        public Builder setCMVIgG_OD___null(Boolean CMVIgG_OD___null) {
            this.CMVIgG_OD___null = CMVIgG_OD___null;
            return this;
        }

        public Builder setCMVIgG_OD___not___null(Boolean CMVIgG_OD___not___null) {
            this.CMVIgG_OD___not___null = CMVIgG_OD___not___null;
            return this;
        }

        public Builder setCMVIgG_OD___in(java.util.List<String> CMVIgG_OD___in) {
            this.CMVIgG_OD___in = CMVIgG_OD___in;
            return this;
        }

        public Builder setCMVIgG_OD___not___in(java.util.List<String> CMVIgG_OD___not___in) {
            this.CMVIgG_OD___not___in = CMVIgG_OD___not___in;
            return this;
        }

        public Builder setCMVIgG_OD___lt(String CMVIgG_OD___lt) {
            this.CMVIgG_OD___lt = CMVIgG_OD___lt;
            return this;
        }

        public Builder setCMVIgG_OD___lte(String CMVIgG_OD___lte) {
            this.CMVIgG_OD___lte = CMVIgG_OD___lte;
            return this;
        }

        public Builder setCMVIgG_OD___gt(String CMVIgG_OD___gt) {
            this.CMVIgG_OD___gt = CMVIgG_OD___gt;
            return this;
        }

        public Builder setCMVIgG_OD___gte(String CMVIgG_OD___gte) {
            this.CMVIgG_OD___gte = CMVIgG_OD___gte;
            return this;
        }

        public Builder setCistatina_C___eq(String Cistatina_C___eq) {
            this.Cistatina_C___eq = Cistatina_C___eq;
            return this;
        }

        public Builder setCistatina_C___ne(String Cistatina_C___ne) {
            this.Cistatina_C___ne = Cistatina_C___ne;
            return this;
        }

        public Builder setCistatina_C___null(Boolean Cistatina_C___null) {
            this.Cistatina_C___null = Cistatina_C___null;
            return this;
        }

        public Builder setCistatina_C___not___null(Boolean Cistatina_C___not___null) {
            this.Cistatina_C___not___null = Cistatina_C___not___null;
            return this;
        }

        public Builder setCistatina_C___in(java.util.List<String> Cistatina_C___in) {
            this.Cistatina_C___in = Cistatina_C___in;
            return this;
        }

        public Builder setCistatina_C___not___in(java.util.List<String> Cistatina_C___not___in) {
            this.Cistatina_C___not___in = Cistatina_C___not___in;
            return this;
        }

        public Builder setCistatina_C___lt(String Cistatina_C___lt) {
            this.Cistatina_C___lt = Cistatina_C___lt;
            return this;
        }

        public Builder setCistatina_C___lte(String Cistatina_C___lte) {
            this.Cistatina_C___lte = Cistatina_C___lte;
            return this;
        }

        public Builder setCistatina_C___gt(String Cistatina_C___gt) {
            this.Cistatina_C___gt = Cistatina_C___gt;
            return this;
        }

        public Builder setCistatina_C___gte(String Cistatina_C___gte) {
            this.Cistatina_C___gte = Cistatina_C___gte;
            return this;
        }

        public Builder setEndoCAb___eq(String EndoCAb___eq) {
            this.EndoCAb___eq = EndoCAb___eq;
            return this;
        }

        public Builder setEndoCAb___ne(String EndoCAb___ne) {
            this.EndoCAb___ne = EndoCAb___ne;
            return this;
        }

        public Builder setEndoCAb___null(Boolean EndoCAb___null) {
            this.EndoCAb___null = EndoCAb___null;
            return this;
        }

        public Builder setEndoCAb___not___null(Boolean EndoCAb___not___null) {
            this.EndoCAb___not___null = EndoCAb___not___null;
            return this;
        }

        public Builder setEndoCAb___in(java.util.List<String> EndoCAb___in) {
            this.EndoCAb___in = EndoCAb___in;
            return this;
        }

        public Builder setEndoCAb___not___in(java.util.List<String> EndoCAb___not___in) {
            this.EndoCAb___not___in = EndoCAb___not___in;
            return this;
        }

        public Builder setEndoCAb___lt(String EndoCAb___lt) {
            this.EndoCAb___lt = EndoCAb___lt;
            return this;
        }

        public Builder setEndoCAb___lte(String EndoCAb___lte) {
            this.EndoCAb___lte = EndoCAb___lte;
            return this;
        }

        public Builder setEndoCAb___gt(String EndoCAb___gt) {
            this.EndoCAb___gt = EndoCAb___gt;
            return this;
        }

        public Builder setEndoCAb___gte(String EndoCAb___gte) {
            this.EndoCAb___gte = EndoCAb___gte;
            return this;
        }

        public Builder setHLADR_cd38_cd8___eq(String HLADR_cd38_cd8___eq) {
            this.HLADR_cd38_cd8___eq = HLADR_cd38_cd8___eq;
            return this;
        }

        public Builder setHLADR_cd38_cd8___ne(String HLADR_cd38_cd8___ne) {
            this.HLADR_cd38_cd8___ne = HLADR_cd38_cd8___ne;
            return this;
        }

        public Builder setHLADR_cd38_cd8___null(Boolean HLADR_cd38_cd8___null) {
            this.HLADR_cd38_cd8___null = HLADR_cd38_cd8___null;
            return this;
        }

        public Builder setHLADR_cd38_cd8___not___null(Boolean HLADR_cd38_cd8___not___null) {
            this.HLADR_cd38_cd8___not___null = HLADR_cd38_cd8___not___null;
            return this;
        }

        public Builder setHLADR_cd38_cd8___in(java.util.List<String> HLADR_cd38_cd8___in) {
            this.HLADR_cd38_cd8___in = HLADR_cd38_cd8___in;
            return this;
        }

        public Builder setHLADR_cd38_cd8___not___in(java.util.List<String> HLADR_cd38_cd8___not___in) {
            this.HLADR_cd38_cd8___not___in = HLADR_cd38_cd8___not___in;
            return this;
        }

        public Builder setHLADR_cd38_cd8___lt(String HLADR_cd38_cd8___lt) {
            this.HLADR_cd38_cd8___lt = HLADR_cd38_cd8___lt;
            return this;
        }

        public Builder setHLADR_cd38_cd8___lte(String HLADR_cd38_cd8___lte) {
            this.HLADR_cd38_cd8___lte = HLADR_cd38_cd8___lte;
            return this;
        }

        public Builder setHLADR_cd38_cd8___gt(String HLADR_cd38_cd8___gt) {
            this.HLADR_cd38_cd8___gt = HLADR_cd38_cd8___gt;
            return this;
        }

        public Builder setHLADR_cd38_cd8___gte(String HLADR_cd38_cd8___gte) {
            this.HLADR_cd38_cd8___gte = HLADR_cd38_cd8___gte;
            return this;
        }

        public Builder setIL6___eq(String IL6___eq) {
            this.IL6___eq = IL6___eq;
            return this;
        }

        public Builder setIL6___ne(String IL6___ne) {
            this.IL6___ne = IL6___ne;
            return this;
        }

        public Builder setIL6___null(Boolean IL6___null) {
            this.IL6___null = IL6___null;
            return this;
        }

        public Builder setIL6___not___null(Boolean IL6___not___null) {
            this.IL6___not___null = IL6___not___null;
            return this;
        }

        public Builder setIL6___in(java.util.List<String> IL6___in) {
            this.IL6___in = IL6___in;
            return this;
        }

        public Builder setIL6___not___in(java.util.List<String> IL6___not___in) {
            this.IL6___not___in = IL6___not___in;
            return this;
        }

        public Builder setIL6___lt(String IL6___lt) {
            this.IL6___lt = IL6___lt;
            return this;
        }

        public Builder setIL6___lte(String IL6___lte) {
            this.IL6___lte = IL6___lte;
            return this;
        }

        public Builder setIL6___gt(String IL6___gt) {
            this.IL6___gt = IL6___gt;
            return this;
        }

        public Builder setIL6___gte(String IL6___gte) {
            this.IL6___gte = IL6___gte;
            return this;
        }

        public Builder setLPS___eq(String LPS___eq) {
            this.LPS___eq = LPS___eq;
            return this;
        }

        public Builder setLPS___ne(String LPS___ne) {
            this.LPS___ne = LPS___ne;
            return this;
        }

        public Builder setLPS___null(Boolean LPS___null) {
            this.LPS___null = LPS___null;
            return this;
        }

        public Builder setLPS___not___null(Boolean LPS___not___null) {
            this.LPS___not___null = LPS___not___null;
            return this;
        }

        public Builder setLPS___in(java.util.List<String> LPS___in) {
            this.LPS___in = LPS___in;
            return this;
        }

        public Builder setLPS___not___in(java.util.List<String> LPS___not___in) {
            this.LPS___not___in = LPS___not___in;
            return this;
        }

        public Builder setLPS___lt(String LPS___lt) {
            this.LPS___lt = LPS___lt;
            return this;
        }

        public Builder setLPS___lte(String LPS___lte) {
            this.LPS___lte = LPS___lte;
            return this;
        }

        public Builder setLPS___gt(String LPS___gt) {
            this.LPS___gt = LPS___gt;
            return this;
        }

        public Builder setLPS___gte(String LPS___gte) {
            this.LPS___gte = LPS___gte;
            return this;
        }

        public Builder setLPS_P___eq(String LPS_P___eq) {
            this.LPS_P___eq = LPS_P___eq;
            return this;
        }

        public Builder setLPS_P___ne(String LPS_P___ne) {
            this.LPS_P___ne = LPS_P___ne;
            return this;
        }

        public Builder setLPS_P___null(Boolean LPS_P___null) {
            this.LPS_P___null = LPS_P___null;
            return this;
        }

        public Builder setLPS_P___not___null(Boolean LPS_P___not___null) {
            this.LPS_P___not___null = LPS_P___not___null;
            return this;
        }

        public Builder setLPS_P___in(java.util.List<String> LPS_P___in) {
            this.LPS_P___in = LPS_P___in;
            return this;
        }

        public Builder setLPS_P___not___in(java.util.List<String> LPS_P___not___in) {
            this.LPS_P___not___in = LPS_P___not___in;
            return this;
        }

        public Builder setLPS_P___lt(String LPS_P___lt) {
            this.LPS_P___lt = LPS_P___lt;
            return this;
        }

        public Builder setLPS_P___lte(String LPS_P___lte) {
            this.LPS_P___lte = LPS_P___lte;
            return this;
        }

        public Builder setLPS_P___gt(String LPS_P___gt) {
            this.LPS_P___gt = LPS_P___gt;
            return this;
        }

        public Builder setLPS_P___gte(String LPS_P___gte) {
            this.LPS_P___gte = LPS_P___gte;
            return this;
        }

        public Builder setLPS_V___eq(String LPS_V___eq) {
            this.LPS_V___eq = LPS_V___eq;
            return this;
        }

        public Builder setLPS_V___ne(String LPS_V___ne) {
            this.LPS_V___ne = LPS_V___ne;
            return this;
        }

        public Builder setLPS_V___null(Boolean LPS_V___null) {
            this.LPS_V___null = LPS_V___null;
            return this;
        }

        public Builder setLPS_V___not___null(Boolean LPS_V___not___null) {
            this.LPS_V___not___null = LPS_V___not___null;
            return this;
        }

        public Builder setLPS_V___in(java.util.List<String> LPS_V___in) {
            this.LPS_V___in = LPS_V___in;
            return this;
        }

        public Builder setLPS_V___not___in(java.util.List<String> LPS_V___not___in) {
            this.LPS_V___not___in = LPS_V___not___in;
            return this;
        }

        public Builder setLPS_V___lt(String LPS_V___lt) {
            this.LPS_V___lt = LPS_V___lt;
            return this;
        }

        public Builder setLPS_V___lte(String LPS_V___lte) {
            this.LPS_V___lte = LPS_V___lte;
            return this;
        }

        public Builder setLPS_V___gt(String LPS_V___gt) {
            this.LPS_V___gt = LPS_V___gt;
            return this;
        }

        public Builder setLPS_V___gte(String LPS_V___gte) {
            this.LPS_V___gte = LPS_V___gte;
            return this;
        }

        public Builder setLPS_recovery___eq(String LPS_recovery___eq) {
            this.LPS_recovery___eq = LPS_recovery___eq;
            return this;
        }

        public Builder setLPS_recovery___ne(String LPS_recovery___ne) {
            this.LPS_recovery___ne = LPS_recovery___ne;
            return this;
        }

        public Builder setLPS_recovery___null(Boolean LPS_recovery___null) {
            this.LPS_recovery___null = LPS_recovery___null;
            return this;
        }

        public Builder setLPS_recovery___not___null(Boolean LPS_recovery___not___null) {
            this.LPS_recovery___not___null = LPS_recovery___not___null;
            return this;
        }

        public Builder setLPS_recovery___in(java.util.List<String> LPS_recovery___in) {
            this.LPS_recovery___in = LPS_recovery___in;
            return this;
        }

        public Builder setLPS_recovery___not___in(java.util.List<String> LPS_recovery___not___in) {
            this.LPS_recovery___not___in = LPS_recovery___not___in;
            return this;
        }

        public Builder setLPS_recovery___lt(String LPS_recovery___lt) {
            this.LPS_recovery___lt = LPS_recovery___lt;
            return this;
        }

        public Builder setLPS_recovery___lte(String LPS_recovery___lte) {
            this.LPS_recovery___lte = LPS_recovery___lte;
            return this;
        }

        public Builder setLPS_recovery___gt(String LPS_recovery___gt) {
            this.LPS_recovery___gt = LPS_recovery___gt;
            return this;
        }

        public Builder setLPS_recovery___gte(String LPS_recovery___gte) {
            this.LPS_recovery___gte = LPS_recovery___gte;
            return this;
        }

        public Builder setPCR___eq(String PCR___eq) {
            this.PCR___eq = PCR___eq;
            return this;
        }

        public Builder setPCR___ne(String PCR___ne) {
            this.PCR___ne = PCR___ne;
            return this;
        }

        public Builder setPCR___null(Boolean PCR___null) {
            this.PCR___null = PCR___null;
            return this;
        }

        public Builder setPCR___not___null(Boolean PCR___not___null) {
            this.PCR___not___null = PCR___not___null;
            return this;
        }

        public Builder setPCR___in(java.util.List<String> PCR___in) {
            this.PCR___in = PCR___in;
            return this;
        }

        public Builder setPCR___not___in(java.util.List<String> PCR___not___in) {
            this.PCR___not___in = PCR___not___in;
            return this;
        }

        public Builder setPCR___lt(String PCR___lt) {
            this.PCR___lt = PCR___lt;
            return this;
        }

        public Builder setPCR___lte(String PCR___lte) {
            this.PCR___lte = PCR___lte;
            return this;
        }

        public Builder setPCR___gt(String PCR___gt) {
            this.PCR___gt = PCR___gt;
            return this;
        }

        public Builder setPCR___gte(String PCR___gte) {
            this.PCR___gte = PCR___gte;
            return this;
        }

        public Builder setPCR_US___eq(String PCR_US___eq) {
            this.PCR_US___eq = PCR_US___eq;
            return this;
        }

        public Builder setPCR_US___ne(String PCR_US___ne) {
            this.PCR_US___ne = PCR_US___ne;
            return this;
        }

        public Builder setPCR_US___null(Boolean PCR_US___null) {
            this.PCR_US___null = PCR_US___null;
            return this;
        }

        public Builder setPCR_US___not___null(Boolean PCR_US___not___null) {
            this.PCR_US___not___null = PCR_US___not___null;
            return this;
        }

        public Builder setPCR_US___in(java.util.List<String> PCR_US___in) {
            this.PCR_US___in = PCR_US___in;
            return this;
        }

        public Builder setPCR_US___not___in(java.util.List<String> PCR_US___not___in) {
            this.PCR_US___not___in = PCR_US___not___in;
            return this;
        }

        public Builder setPCR_US___lt(String PCR_US___lt) {
            this.PCR_US___lt = PCR_US___lt;
            return this;
        }

        public Builder setPCR_US___lte(String PCR_US___lte) {
            this.PCR_US___lte = PCR_US___lte;
            return this;
        }

        public Builder setPCR_US___gt(String PCR_US___gt) {
            this.PCR_US___gt = PCR_US___gt;
            return this;
        }

        public Builder setPCR_US___gte(String PCR_US___gte) {
            this.PCR_US___gte = PCR_US___gte;
            return this;
        }

        public Builder setPTX3___eq(String PTX3___eq) {
            this.PTX3___eq = PTX3___eq;
            return this;
        }

        public Builder setPTX3___ne(String PTX3___ne) {
            this.PTX3___ne = PTX3___ne;
            return this;
        }

        public Builder setPTX3___null(Boolean PTX3___null) {
            this.PTX3___null = PTX3___null;
            return this;
        }

        public Builder setPTX3___not___null(Boolean PTX3___not___null) {
            this.PTX3___not___null = PTX3___not___null;
            return this;
        }

        public Builder setPTX3___in(java.util.List<String> PTX3___in) {
            this.PTX3___in = PTX3___in;
            return this;
        }

        public Builder setPTX3___not___in(java.util.List<String> PTX3___not___in) {
            this.PTX3___not___in = PTX3___not___in;
            return this;
        }

        public Builder setPTX3___lt(String PTX3___lt) {
            this.PTX3___lt = PTX3___lt;
            return this;
        }

        public Builder setPTX3___lte(String PTX3___lte) {
            this.PTX3___lte = PTX3___lte;
            return this;
        }

        public Builder setPTX3___gt(String PTX3___gt) {
            this.PTX3___gt = PTX3___gt;
            return this;
        }

        public Builder setPTX3___gte(String PTX3___gte) {
            this.PTX3___gte = PTX3___gte;
            return this;
        }

        public Builder setTNFa___eq(String TNFa___eq) {
            this.TNFa___eq = TNFa___eq;
            return this;
        }

        public Builder setTNFa___ne(String TNFa___ne) {
            this.TNFa___ne = TNFa___ne;
            return this;
        }

        public Builder setTNFa___null(Boolean TNFa___null) {
            this.TNFa___null = TNFa___null;
            return this;
        }

        public Builder setTNFa___not___null(Boolean TNFa___not___null) {
            this.TNFa___not___null = TNFa___not___null;
            return this;
        }

        public Builder setTNFa___in(java.util.List<String> TNFa___in) {
            this.TNFa___in = TNFa___in;
            return this;
        }

        public Builder setTNFa___not___in(java.util.List<String> TNFa___not___in) {
            this.TNFa___not___in = TNFa___not___in;
            return this;
        }

        public Builder setTNFa___lt(String TNFa___lt) {
            this.TNFa___lt = TNFa___lt;
            return this;
        }

        public Builder setTNFa___lte(String TNFa___lte) {
            this.TNFa___lte = TNFa___lte;
            return this;
        }

        public Builder setTNFa___gt(String TNFa___gt) {
            this.TNFa___gt = TNFa___gt;
            return this;
        }

        public Builder setTNFa___gte(String TNFa___gte) {
            this.TNFa___gte = TNFa___gte;
            return this;
        }

        public Builder setVCAM1___eq(Integer VCAM1___eq) {
            this.VCAM1___eq = VCAM1___eq;
            return this;
        }

        public Builder setVCAM1___ne(Integer VCAM1___ne) {
            this.VCAM1___ne = VCAM1___ne;
            return this;
        }

        public Builder setVCAM1___null(Boolean VCAM1___null) {
            this.VCAM1___null = VCAM1___null;
            return this;
        }

        public Builder setVCAM1___not___null(Boolean VCAM1___not___null) {
            this.VCAM1___not___null = VCAM1___not___null;
            return this;
        }

        public Builder setVCAM1___in(java.util.List<Integer> VCAM1___in) {
            this.VCAM1___in = VCAM1___in;
            return this;
        }

        public Builder setVCAM1___not___in(java.util.List<Integer> VCAM1___not___in) {
            this.VCAM1___not___in = VCAM1___not___in;
            return this;
        }

        public Builder setVCAM1___lt(Integer VCAM1___lt) {
            this.VCAM1___lt = VCAM1___lt;
            return this;
        }

        public Builder setVCAM1___lte(Integer VCAM1___lte) {
            this.VCAM1___lte = VCAM1___lte;
            return this;
        }

        public Builder setVCAM1___gt(Integer VCAM1___gt) {
            this.VCAM1___gt = VCAM1___gt;
            return this;
        }

        public Builder setVCAM1___gte(Integer VCAM1___gte) {
            this.VCAM1___gte = VCAM1___gte;
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

        public Builder setAnti3S_AU___eq(String anti3S_AU___eq) {
            this.anti3S_AU___eq = anti3S_AU___eq;
            return this;
        }

        public Builder setAnti3S_AU___ne(String anti3S_AU___ne) {
            this.anti3S_AU___ne = anti3S_AU___ne;
            return this;
        }

        public Builder setAnti3S_AU___null(Boolean anti3S_AU___null) {
            this.anti3S_AU___null = anti3S_AU___null;
            return this;
        }

        public Builder setAnti3S_AU___not___null(Boolean anti3S_AU___not___null) {
            this.anti3S_AU___not___null = anti3S_AU___not___null;
            return this;
        }

        public Builder setAnti3S_AU___in(java.util.List<String> anti3S_AU___in) {
            this.anti3S_AU___in = anti3S_AU___in;
            return this;
        }

        public Builder setAnti3S_AU___not___in(java.util.List<String> anti3S_AU___not___in) {
            this.anti3S_AU___not___in = anti3S_AU___not___in;
            return this;
        }

        public Builder setAnti3S_AU___lt(String anti3S_AU___lt) {
            this.anti3S_AU___lt = anti3S_AU___lt;
            return this;
        }

        public Builder setAnti3S_AU___lte(String anti3S_AU___lte) {
            this.anti3S_AU___lte = anti3S_AU___lte;
            return this;
        }

        public Builder setAnti3S_AU___gt(String anti3S_AU___gt) {
            this.anti3S_AU___gt = anti3S_AU___gt;
            return this;
        }

        public Builder setAnti3S_AU___gte(String anti3S_AU___gte) {
            this.anti3S_AU___gte = anti3S_AU___gte;
            return this;
        }

        public Builder setCell___eq(Boolean cell___eq) {
            this.cell___eq = cell___eq;
            return this;
        }

        public Builder setCell___ne(Boolean cell___ne) {
            this.cell___ne = cell___ne;
            return this;
        }

        public Builder setCell___null(Boolean cell___null) {
            this.cell___null = cell___null;
            return this;
        }

        public Builder setCell___not___null(Boolean cell___not___null) {
            this.cell___not___null = cell___not___null;
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

        public Builder setHivdna_copie_cells___eq(String hivdna_copie_cells___eq) {
            this.hivdna_copie_cells___eq = hivdna_copie_cells___eq;
            return this;
        }

        public Builder setHivdna_copie_cells___ne(String hivdna_copie_cells___ne) {
            this.hivdna_copie_cells___ne = hivdna_copie_cells___ne;
            return this;
        }

        public Builder setHivdna_copie_cells___null(Boolean hivdna_copie_cells___null) {
            this.hivdna_copie_cells___null = hivdna_copie_cells___null;
            return this;
        }

        public Builder setHivdna_copie_cells___not___null(Boolean hivdna_copie_cells___not___null) {
            this.hivdna_copie_cells___not___null = hivdna_copie_cells___not___null;
            return this;
        }

        public Builder setHivdna_copie_cells___in(java.util.List<String> hivdna_copie_cells___in) {
            this.hivdna_copie_cells___in = hivdna_copie_cells___in;
            return this;
        }

        public Builder setHivdna_copie_cells___not___in(java.util.List<String> hivdna_copie_cells___not___in) {
            this.hivdna_copie_cells___not___in = hivdna_copie_cells___not___in;
            return this;
        }

        public Builder setHivdna_copie_cells___lt(String hivdna_copie_cells___lt) {
            this.hivdna_copie_cells___lt = hivdna_copie_cells___lt;
            return this;
        }

        public Builder setHivdna_copie_cells___lte(String hivdna_copie_cells___lte) {
            this.hivdna_copie_cells___lte = hivdna_copie_cells___lte;
            return this;
        }

        public Builder setHivdna_copie_cells___gt(String hivdna_copie_cells___gt) {
            this.hivdna_copie_cells___gt = hivdna_copie_cells___gt;
            return this;
        }

        public Builder setHivdna_copie_cells___gte(String hivdna_copie_cells___gte) {
            this.hivdna_copie_cells___gte = hivdna_copie_cells___gte;
            return this;
        }

        public Builder setHivdna_copie_ml___eq(String hivdna_copie_ml___eq) {
            this.hivdna_copie_ml___eq = hivdna_copie_ml___eq;
            return this;
        }

        public Builder setHivdna_copie_ml___ne(String hivdna_copie_ml___ne) {
            this.hivdna_copie_ml___ne = hivdna_copie_ml___ne;
            return this;
        }

        public Builder setHivdna_copie_ml___null(Boolean hivdna_copie_ml___null) {
            this.hivdna_copie_ml___null = hivdna_copie_ml___null;
            return this;
        }

        public Builder setHivdna_copie_ml___not___null(Boolean hivdna_copie_ml___not___null) {
            this.hivdna_copie_ml___not___null = hivdna_copie_ml___not___null;
            return this;
        }

        public Builder setHivdna_copie_ml___in(java.util.List<String> hivdna_copie_ml___in) {
            this.hivdna_copie_ml___in = hivdna_copie_ml___in;
            return this;
        }

        public Builder setHivdna_copie_ml___not___in(java.util.List<String> hivdna_copie_ml___not___in) {
            this.hivdna_copie_ml___not___in = hivdna_copie_ml___not___in;
            return this;
        }

        public Builder setHivdna_copie_ml___lt(String hivdna_copie_ml___lt) {
            this.hivdna_copie_ml___lt = hivdna_copie_ml___lt;
            return this;
        }

        public Builder setHivdna_copie_ml___lte(String hivdna_copie_ml___lte) {
            this.hivdna_copie_ml___lte = hivdna_copie_ml___lte;
            return this;
        }

        public Builder setHivdna_copie_ml___gt(String hivdna_copie_ml___gt) {
            this.hivdna_copie_ml___gt = hivdna_copie_ml___gt;
            return this;
        }

        public Builder setHivdna_copie_ml___gte(String hivdna_copie_ml___gte) {
            this.hivdna_copie_ml___gte = hivdna_copie_ml___gte;
            return this;
        }

        public Builder setReliab___eq(Boolean reliab___eq) {
            this.reliab___eq = reliab___eq;
            return this;
        }

        public Builder setReliab___ne(Boolean reliab___ne) {
            this.reliab___ne = reliab___ne;
            return this;
        }

        public Builder setReliab___null(Boolean reliab___null) {
            this.reliab___null = reliab___null;
            return this;
        }

        public Builder setReliab___not___null(Boolean reliab___not___null) {
            this.reliab___not___null = reliab___not___null;
            return this;
        }

        public Builder setRs1840680___eq(String rs1840680___eq) {
            this.rs1840680___eq = rs1840680___eq;
            return this;
        }

        public Builder setRs1840680___ne(String rs1840680___ne) {
            this.rs1840680___ne = rs1840680___ne;
            return this;
        }

        public Builder setRs1840680___null(Boolean rs1840680___null) {
            this.rs1840680___null = rs1840680___null;
            return this;
        }

        public Builder setRs1840680___not___null(Boolean rs1840680___not___null) {
            this.rs1840680___not___null = rs1840680___not___null;
            return this;
        }

        public Builder setRs1840680___in(java.util.List<String> rs1840680___in) {
            this.rs1840680___in = rs1840680___in;
            return this;
        }

        public Builder setRs1840680___not___in(java.util.List<String> rs1840680___not___in) {
            this.rs1840680___not___in = rs1840680___not___in;
            return this;
        }

        public Builder setRs1840680___lt(String rs1840680___lt) {
            this.rs1840680___lt = rs1840680___lt;
            return this;
        }

        public Builder setRs1840680___lte(String rs1840680___lte) {
            this.rs1840680___lte = rs1840680___lte;
            return this;
        }

        public Builder setRs1840680___gt(String rs1840680___gt) {
            this.rs1840680___gt = rs1840680___gt;
            return this;
        }

        public Builder setRs1840680___gte(String rs1840680___gte) {
            this.rs1840680___gte = rs1840680___gte;
            return this;
        }

        public Builder setRs1840680___contains(String rs1840680___contains) {
            this.rs1840680___contains = rs1840680___contains;
            return this;
        }

        public Builder setRs1840680___not___contains(String rs1840680___not___contains) {
            this.rs1840680___not___contains = rs1840680___not___contains;
            return this;
        }

        public Builder setRs1840680___starts_with(String rs1840680___starts_with) {
            this.rs1840680___starts_with = rs1840680___starts_with;
            return this;
        }

        public Builder setRs1840680___not___starts_with(String rs1840680___not___starts_with) {
            this.rs1840680___not___starts_with = rs1840680___not___starts_with;
            return this;
        }

        public Builder setRs1840680___ends_with(String rs1840680___ends_with) {
            this.rs1840680___ends_with = rs1840680___ends_with;
            return this;
        }

        public Builder setRs1840680___not___ends_with(String rs1840680___not___ends_with) {
            this.rs1840680___not___ends_with = rs1840680___not___ends_with;
            return this;
        }

        public Builder setRs2305619___eq(String rs2305619___eq) {
            this.rs2305619___eq = rs2305619___eq;
            return this;
        }

        public Builder setRs2305619___ne(String rs2305619___ne) {
            this.rs2305619___ne = rs2305619___ne;
            return this;
        }

        public Builder setRs2305619___null(Boolean rs2305619___null) {
            this.rs2305619___null = rs2305619___null;
            return this;
        }

        public Builder setRs2305619___not___null(Boolean rs2305619___not___null) {
            this.rs2305619___not___null = rs2305619___not___null;
            return this;
        }

        public Builder setRs2305619___in(java.util.List<String> rs2305619___in) {
            this.rs2305619___in = rs2305619___in;
            return this;
        }

        public Builder setRs2305619___not___in(java.util.List<String> rs2305619___not___in) {
            this.rs2305619___not___in = rs2305619___not___in;
            return this;
        }

        public Builder setRs2305619___lt(String rs2305619___lt) {
            this.rs2305619___lt = rs2305619___lt;
            return this;
        }

        public Builder setRs2305619___lte(String rs2305619___lte) {
            this.rs2305619___lte = rs2305619___lte;
            return this;
        }

        public Builder setRs2305619___gt(String rs2305619___gt) {
            this.rs2305619___gt = rs2305619___gt;
            return this;
        }

        public Builder setRs2305619___gte(String rs2305619___gte) {
            this.rs2305619___gte = rs2305619___gte;
            return this;
        }

        public Builder setRs2305619___contains(String rs2305619___contains) {
            this.rs2305619___contains = rs2305619___contains;
            return this;
        }

        public Builder setRs2305619___not___contains(String rs2305619___not___contains) {
            this.rs2305619___not___contains = rs2305619___not___contains;
            return this;
        }

        public Builder setRs2305619___starts_with(String rs2305619___starts_with) {
            this.rs2305619___starts_with = rs2305619___starts_with;
            return this;
        }

        public Builder setRs2305619___not___starts_with(String rs2305619___not___starts_with) {
            this.rs2305619___not___starts_with = rs2305619___not___starts_with;
            return this;
        }

        public Builder setRs2305619___ends_with(String rs2305619___ends_with) {
            this.rs2305619___ends_with = rs2305619___ends_with;
            return this;
        }

        public Builder setRs2305619___not___ends_with(String rs2305619___not___ends_with) {
            this.rs2305619___not___ends_with = rs2305619___not___ends_with;
            return this;
        }

        public Builder setRs35948036___eq(String rs35948036___eq) {
            this.rs35948036___eq = rs35948036___eq;
            return this;
        }

        public Builder setRs35948036___ne(String rs35948036___ne) {
            this.rs35948036___ne = rs35948036___ne;
            return this;
        }

        public Builder setRs35948036___null(Boolean rs35948036___null) {
            this.rs35948036___null = rs35948036___null;
            return this;
        }

        public Builder setRs35948036___not___null(Boolean rs35948036___not___null) {
            this.rs35948036___not___null = rs35948036___not___null;
            return this;
        }

        public Builder setRs35948036___in(java.util.List<String> rs35948036___in) {
            this.rs35948036___in = rs35948036___in;
            return this;
        }

        public Builder setRs35948036___not___in(java.util.List<String> rs35948036___not___in) {
            this.rs35948036___not___in = rs35948036___not___in;
            return this;
        }

        public Builder setRs35948036___lt(String rs35948036___lt) {
            this.rs35948036___lt = rs35948036___lt;
            return this;
        }

        public Builder setRs35948036___lte(String rs35948036___lte) {
            this.rs35948036___lte = rs35948036___lte;
            return this;
        }

        public Builder setRs35948036___gt(String rs35948036___gt) {
            this.rs35948036___gt = rs35948036___gt;
            return this;
        }

        public Builder setRs35948036___gte(String rs35948036___gte) {
            this.rs35948036___gte = rs35948036___gte;
            return this;
        }

        public Builder setRs35948036___contains(String rs35948036___contains) {
            this.rs35948036___contains = rs35948036___contains;
            return this;
        }

        public Builder setRs35948036___not___contains(String rs35948036___not___contains) {
            this.rs35948036___not___contains = rs35948036___not___contains;
            return this;
        }

        public Builder setRs35948036___starts_with(String rs35948036___starts_with) {
            this.rs35948036___starts_with = rs35948036___starts_with;
            return this;
        }

        public Builder setRs35948036___not___starts_with(String rs35948036___not___starts_with) {
            this.rs35948036___not___starts_with = rs35948036___not___starts_with;
            return this;
        }

        public Builder setRs35948036___ends_with(String rs35948036___ends_with) {
            this.rs35948036___ends_with = rs35948036___ends_with;
            return this;
        }

        public Builder setRs35948036___not___ends_with(String rs35948036___not___ends_with) {
            this.rs35948036___not___ends_with = rs35948036___not___ends_with;
            return this;
        }

        public Builder setRs3845978___eq(String rs3845978___eq) {
            this.rs3845978___eq = rs3845978___eq;
            return this;
        }

        public Builder setRs3845978___ne(String rs3845978___ne) {
            this.rs3845978___ne = rs3845978___ne;
            return this;
        }

        public Builder setRs3845978___null(Boolean rs3845978___null) {
            this.rs3845978___null = rs3845978___null;
            return this;
        }

        public Builder setRs3845978___not___null(Boolean rs3845978___not___null) {
            this.rs3845978___not___null = rs3845978___not___null;
            return this;
        }

        public Builder setRs3845978___in(java.util.List<String> rs3845978___in) {
            this.rs3845978___in = rs3845978___in;
            return this;
        }

        public Builder setRs3845978___not___in(java.util.List<String> rs3845978___not___in) {
            this.rs3845978___not___in = rs3845978___not___in;
            return this;
        }

        public Builder setRs3845978___lt(String rs3845978___lt) {
            this.rs3845978___lt = rs3845978___lt;
            return this;
        }

        public Builder setRs3845978___lte(String rs3845978___lte) {
            this.rs3845978___lte = rs3845978___lte;
            return this;
        }

        public Builder setRs3845978___gt(String rs3845978___gt) {
            this.rs3845978___gt = rs3845978___gt;
            return this;
        }

        public Builder setRs3845978___gte(String rs3845978___gte) {
            this.rs3845978___gte = rs3845978___gte;
            return this;
        }

        public Builder setRs3845978___contains(String rs3845978___contains) {
            this.rs3845978___contains = rs3845978___contains;
            return this;
        }

        public Builder setRs3845978___not___contains(String rs3845978___not___contains) {
            this.rs3845978___not___contains = rs3845978___not___contains;
            return this;
        }

        public Builder setRs3845978___starts_with(String rs3845978___starts_with) {
            this.rs3845978___starts_with = rs3845978___starts_with;
            return this;
        }

        public Builder setRs3845978___not___starts_with(String rs3845978___not___starts_with) {
            this.rs3845978___not___starts_with = rs3845978___not___starts_with;
            return this;
        }

        public Builder setRs3845978___ends_with(String rs3845978___ends_with) {
            this.rs3845978___ends_with = rs3845978___ends_with;
            return this;
        }

        public Builder setRs3845978___not___ends_with(String rs3845978___not___ends_with) {
            this.rs3845978___not___ends_with = rs3845978___not___ends_with;
            return this;
        }

        public Builder setSCD___eq(String sCD___eq) {
            this.sCD___eq = sCD___eq;
            return this;
        }

        public Builder setSCD___ne(String sCD___ne) {
            this.sCD___ne = sCD___ne;
            return this;
        }

        public Builder setSCD___null(Boolean sCD___null) {
            this.sCD___null = sCD___null;
            return this;
        }

        public Builder setSCD___not___null(Boolean sCD___not___null) {
            this.sCD___not___null = sCD___not___null;
            return this;
        }

        public Builder setSCD___in(java.util.List<String> sCD___in) {
            this.sCD___in = sCD___in;
            return this;
        }

        public Builder setSCD___not___in(java.util.List<String> sCD___not___in) {
            this.sCD___not___in = sCD___not___in;
            return this;
        }

        public Builder setSCD___lt(String sCD___lt) {
            this.sCD___lt = sCD___lt;
            return this;
        }

        public Builder setSCD___lte(String sCD___lte) {
            this.sCD___lte = sCD___lte;
            return this;
        }

        public Builder setSCD___gt(String sCD___gt) {
            this.sCD___gt = sCD___gt;
            return this;
        }

        public Builder setSCD___gte(String sCD___gte) {
            this.sCD___gte = sCD___gte;
            return this;
        }

        public Builder setSCD14___eq(String sCD14___eq) {
            this.sCD14___eq = sCD14___eq;
            return this;
        }

        public Builder setSCD14___ne(String sCD14___ne) {
            this.sCD14___ne = sCD14___ne;
            return this;
        }

        public Builder setSCD14___null(Boolean sCD14___null) {
            this.sCD14___null = sCD14___null;
            return this;
        }

        public Builder setSCD14___not___null(Boolean sCD14___not___null) {
            this.sCD14___not___null = sCD14___not___null;
            return this;
        }

        public Builder setSCD14___in(java.util.List<String> sCD14___in) {
            this.sCD14___in = sCD14___in;
            return this;
        }

        public Builder setSCD14___not___in(java.util.List<String> sCD14___not___in) {
            this.sCD14___not___in = sCD14___not___in;
            return this;
        }

        public Builder setSCD14___lt(String sCD14___lt) {
            this.sCD14___lt = sCD14___lt;
            return this;
        }

        public Builder setSCD14___lte(String sCD14___lte) {
            this.sCD14___lte = sCD14___lte;
            return this;
        }

        public Builder setSCD14___gt(String sCD14___gt) {
            this.sCD14___gt = sCD14___gt;
            return this;
        }

        public Builder setSCD14___gte(String sCD14___gte) {
            this.sCD14___gte = sCD14___gte;
            return this;
        }

        public Builder setSCD163___eq(String sCD163___eq) {
            this.sCD163___eq = sCD163___eq;
            return this;
        }

        public Builder setSCD163___ne(String sCD163___ne) {
            this.sCD163___ne = sCD163___ne;
            return this;
        }

        public Builder setSCD163___null(Boolean sCD163___null) {
            this.sCD163___null = sCD163___null;
            return this;
        }

        public Builder setSCD163___not___null(Boolean sCD163___not___null) {
            this.sCD163___not___null = sCD163___not___null;
            return this;
        }

        public Builder setSCD163___in(java.util.List<String> sCD163___in) {
            this.sCD163___in = sCD163___in;
            return this;
        }

        public Builder setSCD163___not___in(java.util.List<String> sCD163___not___in) {
            this.sCD163___not___in = sCD163___not___in;
            return this;
        }

        public Builder setSCD163___lt(String sCD163___lt) {
            this.sCD163___lt = sCD163___lt;
            return this;
        }

        public Builder setSCD163___lte(String sCD163___lte) {
            this.sCD163___lte = sCD163___lte;
            return this;
        }

        public Builder setSCD163___gt(String sCD163___gt) {
            this.sCD163___gt = sCD163___gt;
            return this;
        }

        public Builder setSCD163___gte(String sCD163___gte) {
            this.sCD163___gte = sCD163___gte;
            return this;
        }

        public Builder setTipo_marker___eq(String tipo_marker___eq) {
            this.tipo_marker___eq = tipo_marker___eq;
            return this;
        }

        public Builder setTipo_marker___ne(String tipo_marker___ne) {
            this.tipo_marker___ne = tipo_marker___ne;
            return this;
        }

        public Builder setTipo_marker___null(Boolean tipo_marker___null) {
            this.tipo_marker___null = tipo_marker___null;
            return this;
        }

        public Builder setTipo_marker___not___null(Boolean tipo_marker___not___null) {
            this.tipo_marker___not___null = tipo_marker___not___null;
            return this;
        }

        public Builder setTipo_marker___in(java.util.List<String> tipo_marker___in) {
            this.tipo_marker___in = tipo_marker___in;
            return this;
        }

        public Builder setTipo_marker___not___in(java.util.List<String> tipo_marker___not___in) {
            this.tipo_marker___not___in = tipo_marker___not___in;
            return this;
        }

        public Builder setTipo_marker___lt(String tipo_marker___lt) {
            this.tipo_marker___lt = tipo_marker___lt;
            return this;
        }

        public Builder setTipo_marker___lte(String tipo_marker___lte) {
            this.tipo_marker___lte = tipo_marker___lte;
            return this;
        }

        public Builder setTipo_marker___gt(String tipo_marker___gt) {
            this.tipo_marker___gt = tipo_marker___gt;
            return this;
        }

        public Builder setTipo_marker___gte(String tipo_marker___gte) {
            this.tipo_marker___gte = tipo_marker___gte;
            return this;
        }

        public Builder setTipo_marker___contains(String tipo_marker___contains) {
            this.tipo_marker___contains = tipo_marker___contains;
            return this;
        }

        public Builder setTipo_marker___not___contains(String tipo_marker___not___contains) {
            this.tipo_marker___not___contains = tipo_marker___not___contains;
            return this;
        }

        public Builder setTipo_marker___starts_with(String tipo_marker___starts_with) {
            this.tipo_marker___starts_with = tipo_marker___starts_with;
            return this;
        }

        public Builder setTipo_marker___not___starts_with(String tipo_marker___not___starts_with) {
            this.tipo_marker___not___starts_with = tipo_marker___not___starts_with;
            return this;
        }

        public Builder setTipo_marker___ends_with(String tipo_marker___ends_with) {
            this.tipo_marker___ends_with = tipo_marker___ends_with;
            return this;
        }

        public Builder setTipo_marker___not___ends_with(String tipo_marker___not___ends_with) {
            this.tipo_marker___not___ends_with = tipo_marker___not___ends_with;
            return this;
        }

        public Builder setValore___eq(String valore___eq) {
            this.valore___eq = valore___eq;
            return this;
        }

        public Builder setValore___ne(String valore___ne) {
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

        public Builder setValore___in(java.util.List<String> valore___in) {
            this.valore___in = valore___in;
            return this;
        }

        public Builder setValore___not___in(java.util.List<String> valore___not___in) {
            this.valore___not___in = valore___not___in;
            return this;
        }

        public Builder setValore___lt(String valore___lt) {
            this.valore___lt = valore___lt;
            return this;
        }

        public Builder setValore___lte(String valore___lte) {
            this.valore___lte = valore___lte;
            return this;
        }

        public Builder setValore___gt(String valore___gt) {
            this.valore___gt = valore___gt;
            return this;
        }

        public Builder setValore___gte(String valore___gte) {
            this.valore___gte = valore___gte;
            return this;
        }

        public Builder setValore___contains(String valore___contains) {
            this.valore___contains = valore___contains;
            return this;
        }

        public Builder setValore___not___contains(String valore___not___contains) {
            this.valore___not___contains = valore___not___contains;
            return this;
        }

        public Builder setValore___starts_with(String valore___starts_with) {
            this.valore___starts_with = valore___starts_with;
            return this;
        }

        public Builder setValore___not___starts_with(String valore___not___starts_with) {
            this.valore___not___starts_with = valore___not___starts_with;
            return this;
        }

        public Builder setValore___ends_with(String valore___ends_with) {
            this.valore___ends_with = valore___ends_with;
            return this;
        }

        public Builder setValore___not___ends_with(String valore___not___ends_with) {
            this.valore___not___ends_with = valore___not___ends_with;
            return this;
        }

        public Builder setVariable___eq(Boolean variable___eq) {
            this.variable___eq = variable___eq;
            return this;
        }

        public Builder setVariable___ne(Boolean variable___ne) {
            this.variable___ne = variable___ne;
            return this;
        }

        public Builder setVariable___null(Boolean variable___null) {
            this.variable___null = variable___null;
            return this;
        }

        public Builder setVariable___not___null(Boolean variable___not___null) {
            this.variable___not___null = variable___not___null;
            return this;
        }

        public Builder setVolume___eq(String volume___eq) {
            this.volume___eq = volume___eq;
            return this;
        }

        public Builder setVolume___ne(String volume___ne) {
            this.volume___ne = volume___ne;
            return this;
        }

        public Builder setVolume___null(Boolean volume___null) {
            this.volume___null = volume___null;
            return this;
        }

        public Builder setVolume___not___null(Boolean volume___not___null) {
            this.volume___not___null = volume___not___null;
            return this;
        }

        public Builder setVolume___in(java.util.List<String> volume___in) {
            this.volume___in = volume___in;
            return this;
        }

        public Builder setVolume___not___in(java.util.List<String> volume___not___in) {
            this.volume___not___in = volume___not___in;
            return this;
        }

        public Builder setVolume___lt(String volume___lt) {
            this.volume___lt = volume___lt;
            return this;
        }

        public Builder setVolume___lte(String volume___lte) {
            this.volume___lte = volume___lte;
            return this;
        }

        public Builder setVolume___gt(String volume___gt) {
            this.volume___gt = volume___gt;
            return this;
        }

        public Builder setVolume___gte(String volume___gte) {
            this.volume___gte = volume___gte;
            return this;
        }

        public Builder setVolume___contains(String volume___contains) {
            this.volume___contains = volume___contains;
            return this;
        }

        public Builder setVolume___not___contains(String volume___not___contains) {
            this.volume___not___contains = volume___not___contains;
            return this;
        }

        public Builder setVolume___starts_with(String volume___starts_with) {
            this.volume___starts_with = volume___starts_with;
            return this;
        }

        public Builder setVolume___not___starts_with(String volume___not___starts_with) {
            this.volume___not___starts_with = volume___not___starts_with;
            return this;
        }

        public Builder setVolume___ends_with(String volume___ends_with) {
            this.volume___ends_with = volume___ends_with;
            return this;
        }

        public Builder setVolume___not___ends_with(String volume___not___ends_with) {
            this.volume___not___ends_with = volume___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliMarkers_altriFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliMarkers_altriFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliMarkers_altriFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliMarkers_altriFilterDTO build() {
            CliMarkers_altriFilterDTO result = new CliMarkers_altriFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
            result.setAP_CD34_15___eq(this.AP_CD34_15___eq);
            result.setAP_CD34_15___ne(this.AP_CD34_15___ne);
            result.setAP_CD34_15___null(this.AP_CD34_15___null);
            result.setAP_CD34_15___not___null(this.AP_CD34_15___not___null);
            result.setAP_CD34_15___in(this.AP_CD34_15___in);
            result.setAP_CD34_15___not___in(this.AP_CD34_15___not___in);
            result.setAP_CD34_15___lt(this.AP_CD34_15___lt);
            result.setAP_CD34_15___lte(this.AP_CD34_15___lte);
            result.setAP_CD34_15___gt(this.AP_CD34_15___gt);
            result.setAP_CD34_15___gte(this.AP_CD34_15___gte);
            result.setCD14_11b_51_61___eq(this.CD14_11b_51_61___eq);
            result.setCD14_11b_51_61___ne(this.CD14_11b_51_61___ne);
            result.setCD14_11b_51_61___null(this.CD14_11b_51_61___null);
            result.setCD14_11b_51_61___not___null(this.CD14_11b_51_61___not___null);
            result.setCD14_11b_51_61___in(this.CD14_11b_51_61___in);
            result.setCD14_11b_51_61___not___in(this.CD14_11b_51_61___not___in);
            result.setCD14_11b_51_61___lt(this.CD14_11b_51_61___lt);
            result.setCD14_11b_51_61___lte(this.CD14_11b_51_61___lte);
            result.setCD14_11b_51_61___gt(this.CD14_11b_51_61___gt);
            result.setCD14_11b_51_61___gte(this.CD14_11b_51_61___gte);
            result.setCDACT___eq(this.CDACT___eq);
            result.setCDACT___ne(this.CDACT___ne);
            result.setCDACT___null(this.CDACT___null);
            result.setCDACT___not___null(this.CDACT___not___null);
            result.setCDACT___in(this.CDACT___in);
            result.setCDACT___not___in(this.CDACT___not___in);
            result.setCDACT___lt(this.CDACT___lt);
            result.setCDACT___lte(this.CDACT___lte);
            result.setCDACT___gt(this.CDACT___gt);
            result.setCDACT___gte(this.CDACT___gte);
            result.setCMVIgG_OD___eq(this.CMVIgG_OD___eq);
            result.setCMVIgG_OD___ne(this.CMVIgG_OD___ne);
            result.setCMVIgG_OD___null(this.CMVIgG_OD___null);
            result.setCMVIgG_OD___not___null(this.CMVIgG_OD___not___null);
            result.setCMVIgG_OD___in(this.CMVIgG_OD___in);
            result.setCMVIgG_OD___not___in(this.CMVIgG_OD___not___in);
            result.setCMVIgG_OD___lt(this.CMVIgG_OD___lt);
            result.setCMVIgG_OD___lte(this.CMVIgG_OD___lte);
            result.setCMVIgG_OD___gt(this.CMVIgG_OD___gt);
            result.setCMVIgG_OD___gte(this.CMVIgG_OD___gte);
            result.setCistatina_C___eq(this.Cistatina_C___eq);
            result.setCistatina_C___ne(this.Cistatina_C___ne);
            result.setCistatina_C___null(this.Cistatina_C___null);
            result.setCistatina_C___not___null(this.Cistatina_C___not___null);
            result.setCistatina_C___in(this.Cistatina_C___in);
            result.setCistatina_C___not___in(this.Cistatina_C___not___in);
            result.setCistatina_C___lt(this.Cistatina_C___lt);
            result.setCistatina_C___lte(this.Cistatina_C___lte);
            result.setCistatina_C___gt(this.Cistatina_C___gt);
            result.setCistatina_C___gte(this.Cistatina_C___gte);
            result.setEndoCAb___eq(this.EndoCAb___eq);
            result.setEndoCAb___ne(this.EndoCAb___ne);
            result.setEndoCAb___null(this.EndoCAb___null);
            result.setEndoCAb___not___null(this.EndoCAb___not___null);
            result.setEndoCAb___in(this.EndoCAb___in);
            result.setEndoCAb___not___in(this.EndoCAb___not___in);
            result.setEndoCAb___lt(this.EndoCAb___lt);
            result.setEndoCAb___lte(this.EndoCAb___lte);
            result.setEndoCAb___gt(this.EndoCAb___gt);
            result.setEndoCAb___gte(this.EndoCAb___gte);
            result.setHLADR_cd38_cd8___eq(this.HLADR_cd38_cd8___eq);
            result.setHLADR_cd38_cd8___ne(this.HLADR_cd38_cd8___ne);
            result.setHLADR_cd38_cd8___null(this.HLADR_cd38_cd8___null);
            result.setHLADR_cd38_cd8___not___null(this.HLADR_cd38_cd8___not___null);
            result.setHLADR_cd38_cd8___in(this.HLADR_cd38_cd8___in);
            result.setHLADR_cd38_cd8___not___in(this.HLADR_cd38_cd8___not___in);
            result.setHLADR_cd38_cd8___lt(this.HLADR_cd38_cd8___lt);
            result.setHLADR_cd38_cd8___lte(this.HLADR_cd38_cd8___lte);
            result.setHLADR_cd38_cd8___gt(this.HLADR_cd38_cd8___gt);
            result.setHLADR_cd38_cd8___gte(this.HLADR_cd38_cd8___gte);
            result.setIL6___eq(this.IL6___eq);
            result.setIL6___ne(this.IL6___ne);
            result.setIL6___null(this.IL6___null);
            result.setIL6___not___null(this.IL6___not___null);
            result.setIL6___in(this.IL6___in);
            result.setIL6___not___in(this.IL6___not___in);
            result.setIL6___lt(this.IL6___lt);
            result.setIL6___lte(this.IL6___lte);
            result.setIL6___gt(this.IL6___gt);
            result.setIL6___gte(this.IL6___gte);
            result.setLPS___eq(this.LPS___eq);
            result.setLPS___ne(this.LPS___ne);
            result.setLPS___null(this.LPS___null);
            result.setLPS___not___null(this.LPS___not___null);
            result.setLPS___in(this.LPS___in);
            result.setLPS___not___in(this.LPS___not___in);
            result.setLPS___lt(this.LPS___lt);
            result.setLPS___lte(this.LPS___lte);
            result.setLPS___gt(this.LPS___gt);
            result.setLPS___gte(this.LPS___gte);
            result.setLPS_P___eq(this.LPS_P___eq);
            result.setLPS_P___ne(this.LPS_P___ne);
            result.setLPS_P___null(this.LPS_P___null);
            result.setLPS_P___not___null(this.LPS_P___not___null);
            result.setLPS_P___in(this.LPS_P___in);
            result.setLPS_P___not___in(this.LPS_P___not___in);
            result.setLPS_P___lt(this.LPS_P___lt);
            result.setLPS_P___lte(this.LPS_P___lte);
            result.setLPS_P___gt(this.LPS_P___gt);
            result.setLPS_P___gte(this.LPS_P___gte);
            result.setLPS_V___eq(this.LPS_V___eq);
            result.setLPS_V___ne(this.LPS_V___ne);
            result.setLPS_V___null(this.LPS_V___null);
            result.setLPS_V___not___null(this.LPS_V___not___null);
            result.setLPS_V___in(this.LPS_V___in);
            result.setLPS_V___not___in(this.LPS_V___not___in);
            result.setLPS_V___lt(this.LPS_V___lt);
            result.setLPS_V___lte(this.LPS_V___lte);
            result.setLPS_V___gt(this.LPS_V___gt);
            result.setLPS_V___gte(this.LPS_V___gte);
            result.setLPS_recovery___eq(this.LPS_recovery___eq);
            result.setLPS_recovery___ne(this.LPS_recovery___ne);
            result.setLPS_recovery___null(this.LPS_recovery___null);
            result.setLPS_recovery___not___null(this.LPS_recovery___not___null);
            result.setLPS_recovery___in(this.LPS_recovery___in);
            result.setLPS_recovery___not___in(this.LPS_recovery___not___in);
            result.setLPS_recovery___lt(this.LPS_recovery___lt);
            result.setLPS_recovery___lte(this.LPS_recovery___lte);
            result.setLPS_recovery___gt(this.LPS_recovery___gt);
            result.setLPS_recovery___gte(this.LPS_recovery___gte);
            result.setPCR___eq(this.PCR___eq);
            result.setPCR___ne(this.PCR___ne);
            result.setPCR___null(this.PCR___null);
            result.setPCR___not___null(this.PCR___not___null);
            result.setPCR___in(this.PCR___in);
            result.setPCR___not___in(this.PCR___not___in);
            result.setPCR___lt(this.PCR___lt);
            result.setPCR___lte(this.PCR___lte);
            result.setPCR___gt(this.PCR___gt);
            result.setPCR___gte(this.PCR___gte);
            result.setPCR_US___eq(this.PCR_US___eq);
            result.setPCR_US___ne(this.PCR_US___ne);
            result.setPCR_US___null(this.PCR_US___null);
            result.setPCR_US___not___null(this.PCR_US___not___null);
            result.setPCR_US___in(this.PCR_US___in);
            result.setPCR_US___not___in(this.PCR_US___not___in);
            result.setPCR_US___lt(this.PCR_US___lt);
            result.setPCR_US___lte(this.PCR_US___lte);
            result.setPCR_US___gt(this.PCR_US___gt);
            result.setPCR_US___gte(this.PCR_US___gte);
            result.setPTX3___eq(this.PTX3___eq);
            result.setPTX3___ne(this.PTX3___ne);
            result.setPTX3___null(this.PTX3___null);
            result.setPTX3___not___null(this.PTX3___not___null);
            result.setPTX3___in(this.PTX3___in);
            result.setPTX3___not___in(this.PTX3___not___in);
            result.setPTX3___lt(this.PTX3___lt);
            result.setPTX3___lte(this.PTX3___lte);
            result.setPTX3___gt(this.PTX3___gt);
            result.setPTX3___gte(this.PTX3___gte);
            result.setTNFa___eq(this.TNFa___eq);
            result.setTNFa___ne(this.TNFa___ne);
            result.setTNFa___null(this.TNFa___null);
            result.setTNFa___not___null(this.TNFa___not___null);
            result.setTNFa___in(this.TNFa___in);
            result.setTNFa___not___in(this.TNFa___not___in);
            result.setTNFa___lt(this.TNFa___lt);
            result.setTNFa___lte(this.TNFa___lte);
            result.setTNFa___gt(this.TNFa___gt);
            result.setTNFa___gte(this.TNFa___gte);
            result.setVCAM1___eq(this.VCAM1___eq);
            result.setVCAM1___ne(this.VCAM1___ne);
            result.setVCAM1___null(this.VCAM1___null);
            result.setVCAM1___not___null(this.VCAM1___not___null);
            result.setVCAM1___in(this.VCAM1___in);
            result.setVCAM1___not___in(this.VCAM1___not___in);
            result.setVCAM1___lt(this.VCAM1___lt);
            result.setVCAM1___lte(this.VCAM1___lte);
            result.setVCAM1___gt(this.VCAM1___gt);
            result.setVCAM1___gte(this.VCAM1___gte);
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
            result.setAnti3S_AU___eq(this.anti3S_AU___eq);
            result.setAnti3S_AU___ne(this.anti3S_AU___ne);
            result.setAnti3S_AU___null(this.anti3S_AU___null);
            result.setAnti3S_AU___not___null(this.anti3S_AU___not___null);
            result.setAnti3S_AU___in(this.anti3S_AU___in);
            result.setAnti3S_AU___not___in(this.anti3S_AU___not___in);
            result.setAnti3S_AU___lt(this.anti3S_AU___lt);
            result.setAnti3S_AU___lte(this.anti3S_AU___lte);
            result.setAnti3S_AU___gt(this.anti3S_AU___gt);
            result.setAnti3S_AU___gte(this.anti3S_AU___gte);
            result.setCell___eq(this.cell___eq);
            result.setCell___ne(this.cell___ne);
            result.setCell___null(this.cell___null);
            result.setCell___not___null(this.cell___not___null);
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
            result.setHivdna_copie_cells___eq(this.hivdna_copie_cells___eq);
            result.setHivdna_copie_cells___ne(this.hivdna_copie_cells___ne);
            result.setHivdna_copie_cells___null(this.hivdna_copie_cells___null);
            result.setHivdna_copie_cells___not___null(this.hivdna_copie_cells___not___null);
            result.setHivdna_copie_cells___in(this.hivdna_copie_cells___in);
            result.setHivdna_copie_cells___not___in(this.hivdna_copie_cells___not___in);
            result.setHivdna_copie_cells___lt(this.hivdna_copie_cells___lt);
            result.setHivdna_copie_cells___lte(this.hivdna_copie_cells___lte);
            result.setHivdna_copie_cells___gt(this.hivdna_copie_cells___gt);
            result.setHivdna_copie_cells___gte(this.hivdna_copie_cells___gte);
            result.setHivdna_copie_ml___eq(this.hivdna_copie_ml___eq);
            result.setHivdna_copie_ml___ne(this.hivdna_copie_ml___ne);
            result.setHivdna_copie_ml___null(this.hivdna_copie_ml___null);
            result.setHivdna_copie_ml___not___null(this.hivdna_copie_ml___not___null);
            result.setHivdna_copie_ml___in(this.hivdna_copie_ml___in);
            result.setHivdna_copie_ml___not___in(this.hivdna_copie_ml___not___in);
            result.setHivdna_copie_ml___lt(this.hivdna_copie_ml___lt);
            result.setHivdna_copie_ml___lte(this.hivdna_copie_ml___lte);
            result.setHivdna_copie_ml___gt(this.hivdna_copie_ml___gt);
            result.setHivdna_copie_ml___gte(this.hivdna_copie_ml___gte);
            result.setReliab___eq(this.reliab___eq);
            result.setReliab___ne(this.reliab___ne);
            result.setReliab___null(this.reliab___null);
            result.setReliab___not___null(this.reliab___not___null);
            result.setRs1840680___eq(this.rs1840680___eq);
            result.setRs1840680___ne(this.rs1840680___ne);
            result.setRs1840680___null(this.rs1840680___null);
            result.setRs1840680___not___null(this.rs1840680___not___null);
            result.setRs1840680___in(this.rs1840680___in);
            result.setRs1840680___not___in(this.rs1840680___not___in);
            result.setRs1840680___lt(this.rs1840680___lt);
            result.setRs1840680___lte(this.rs1840680___lte);
            result.setRs1840680___gt(this.rs1840680___gt);
            result.setRs1840680___gte(this.rs1840680___gte);
            result.setRs1840680___contains(this.rs1840680___contains);
            result.setRs1840680___not___contains(this.rs1840680___not___contains);
            result.setRs1840680___starts_with(this.rs1840680___starts_with);
            result.setRs1840680___not___starts_with(this.rs1840680___not___starts_with);
            result.setRs1840680___ends_with(this.rs1840680___ends_with);
            result.setRs1840680___not___ends_with(this.rs1840680___not___ends_with);
            result.setRs2305619___eq(this.rs2305619___eq);
            result.setRs2305619___ne(this.rs2305619___ne);
            result.setRs2305619___null(this.rs2305619___null);
            result.setRs2305619___not___null(this.rs2305619___not___null);
            result.setRs2305619___in(this.rs2305619___in);
            result.setRs2305619___not___in(this.rs2305619___not___in);
            result.setRs2305619___lt(this.rs2305619___lt);
            result.setRs2305619___lte(this.rs2305619___lte);
            result.setRs2305619___gt(this.rs2305619___gt);
            result.setRs2305619___gte(this.rs2305619___gte);
            result.setRs2305619___contains(this.rs2305619___contains);
            result.setRs2305619___not___contains(this.rs2305619___not___contains);
            result.setRs2305619___starts_with(this.rs2305619___starts_with);
            result.setRs2305619___not___starts_with(this.rs2305619___not___starts_with);
            result.setRs2305619___ends_with(this.rs2305619___ends_with);
            result.setRs2305619___not___ends_with(this.rs2305619___not___ends_with);
            result.setRs35948036___eq(this.rs35948036___eq);
            result.setRs35948036___ne(this.rs35948036___ne);
            result.setRs35948036___null(this.rs35948036___null);
            result.setRs35948036___not___null(this.rs35948036___not___null);
            result.setRs35948036___in(this.rs35948036___in);
            result.setRs35948036___not___in(this.rs35948036___not___in);
            result.setRs35948036___lt(this.rs35948036___lt);
            result.setRs35948036___lte(this.rs35948036___lte);
            result.setRs35948036___gt(this.rs35948036___gt);
            result.setRs35948036___gte(this.rs35948036___gte);
            result.setRs35948036___contains(this.rs35948036___contains);
            result.setRs35948036___not___contains(this.rs35948036___not___contains);
            result.setRs35948036___starts_with(this.rs35948036___starts_with);
            result.setRs35948036___not___starts_with(this.rs35948036___not___starts_with);
            result.setRs35948036___ends_with(this.rs35948036___ends_with);
            result.setRs35948036___not___ends_with(this.rs35948036___not___ends_with);
            result.setRs3845978___eq(this.rs3845978___eq);
            result.setRs3845978___ne(this.rs3845978___ne);
            result.setRs3845978___null(this.rs3845978___null);
            result.setRs3845978___not___null(this.rs3845978___not___null);
            result.setRs3845978___in(this.rs3845978___in);
            result.setRs3845978___not___in(this.rs3845978___not___in);
            result.setRs3845978___lt(this.rs3845978___lt);
            result.setRs3845978___lte(this.rs3845978___lte);
            result.setRs3845978___gt(this.rs3845978___gt);
            result.setRs3845978___gte(this.rs3845978___gte);
            result.setRs3845978___contains(this.rs3845978___contains);
            result.setRs3845978___not___contains(this.rs3845978___not___contains);
            result.setRs3845978___starts_with(this.rs3845978___starts_with);
            result.setRs3845978___not___starts_with(this.rs3845978___not___starts_with);
            result.setRs3845978___ends_with(this.rs3845978___ends_with);
            result.setRs3845978___not___ends_with(this.rs3845978___not___ends_with);
            result.setSCD___eq(this.sCD___eq);
            result.setSCD___ne(this.sCD___ne);
            result.setSCD___null(this.sCD___null);
            result.setSCD___not___null(this.sCD___not___null);
            result.setSCD___in(this.sCD___in);
            result.setSCD___not___in(this.sCD___not___in);
            result.setSCD___lt(this.sCD___lt);
            result.setSCD___lte(this.sCD___lte);
            result.setSCD___gt(this.sCD___gt);
            result.setSCD___gte(this.sCD___gte);
            result.setSCD14___eq(this.sCD14___eq);
            result.setSCD14___ne(this.sCD14___ne);
            result.setSCD14___null(this.sCD14___null);
            result.setSCD14___not___null(this.sCD14___not___null);
            result.setSCD14___in(this.sCD14___in);
            result.setSCD14___not___in(this.sCD14___not___in);
            result.setSCD14___lt(this.sCD14___lt);
            result.setSCD14___lte(this.sCD14___lte);
            result.setSCD14___gt(this.sCD14___gt);
            result.setSCD14___gte(this.sCD14___gte);
            result.setSCD163___eq(this.sCD163___eq);
            result.setSCD163___ne(this.sCD163___ne);
            result.setSCD163___null(this.sCD163___null);
            result.setSCD163___not___null(this.sCD163___not___null);
            result.setSCD163___in(this.sCD163___in);
            result.setSCD163___not___in(this.sCD163___not___in);
            result.setSCD163___lt(this.sCD163___lt);
            result.setSCD163___lte(this.sCD163___lte);
            result.setSCD163___gt(this.sCD163___gt);
            result.setSCD163___gte(this.sCD163___gte);
            result.setTipo_marker___eq(this.tipo_marker___eq);
            result.setTipo_marker___ne(this.tipo_marker___ne);
            result.setTipo_marker___null(this.tipo_marker___null);
            result.setTipo_marker___not___null(this.tipo_marker___not___null);
            result.setTipo_marker___in(this.tipo_marker___in);
            result.setTipo_marker___not___in(this.tipo_marker___not___in);
            result.setTipo_marker___lt(this.tipo_marker___lt);
            result.setTipo_marker___lte(this.tipo_marker___lte);
            result.setTipo_marker___gt(this.tipo_marker___gt);
            result.setTipo_marker___gte(this.tipo_marker___gte);
            result.setTipo_marker___contains(this.tipo_marker___contains);
            result.setTipo_marker___not___contains(this.tipo_marker___not___contains);
            result.setTipo_marker___starts_with(this.tipo_marker___starts_with);
            result.setTipo_marker___not___starts_with(this.tipo_marker___not___starts_with);
            result.setTipo_marker___ends_with(this.tipo_marker___ends_with);
            result.setTipo_marker___not___ends_with(this.tipo_marker___not___ends_with);
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
            result.setValore___contains(this.valore___contains);
            result.setValore___not___contains(this.valore___not___contains);
            result.setValore___starts_with(this.valore___starts_with);
            result.setValore___not___starts_with(this.valore___not___starts_with);
            result.setValore___ends_with(this.valore___ends_with);
            result.setValore___not___ends_with(this.valore___not___ends_with);
            result.setVariable___eq(this.variable___eq);
            result.setVariable___ne(this.variable___ne);
            result.setVariable___null(this.variable___null);
            result.setVariable___not___null(this.variable___not___null);
            result.setVolume___eq(this.volume___eq);
            result.setVolume___ne(this.volume___ne);
            result.setVolume___null(this.volume___null);
            result.setVolume___not___null(this.volume___not___null);
            result.setVolume___in(this.volume___in);
            result.setVolume___not___in(this.volume___not___in);
            result.setVolume___lt(this.volume___lt);
            result.setVolume___lte(this.volume___lte);
            result.setVolume___gt(this.volume___gt);
            result.setVolume___gte(this.volume___gte);
            result.setVolume___contains(this.volume___contains);
            result.setVolume___not___contains(this.volume___not___contains);
            result.setVolume___starts_with(this.volume___starts_with);
            result.setVolume___not___starts_with(this.volume___not___starts_with);
            result.setVolume___ends_with(this.volume___ends_with);
            result.setVolume___not___ends_with(this.volume___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
