package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Esame_strumentale.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliEsame_strumentaleFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
    private String IQR___eq;
    private String IQR___ne;
    private Boolean IQR___null;
    private Boolean IQR___not___null;
    private java.util.List<String> IQR___in;
    private java.util.List<String> IQR___not___in;
    private String IQR___lt;
    private String IQR___lte;
    private String IQR___gt;
    private String IQR___gte;
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
    private String altro_esame___eq;
    private String altro_esame___ne;
    private Boolean altro_esame___null;
    private Boolean altro_esame___not___null;
    private java.util.List<String> altro_esame___in;
    private java.util.List<String> altro_esame___not___in;
    private String altro_esame___lt;
    private String altro_esame___lte;
    private String altro_esame___gt;
    private String altro_esame___gte;
    private String altro_esame___contains;
    private String altro_esame___not___contains;
    private String altro_esame___starts_with;
    private String altro_esame___not___starts_with;
    private String altro_esame___ends_with;
    private String altro_esame___not___ends_with;
    private String bmd_colonna___eq;
    private String bmd_colonna___ne;
    private Boolean bmd_colonna___null;
    private Boolean bmd_colonna___not___null;
    private java.util.List<String> bmd_colonna___in;
    private java.util.List<String> bmd_colonna___not___in;
    private String bmd_colonna___lt;
    private String bmd_colonna___lte;
    private String bmd_colonna___gt;
    private String bmd_colonna___gte;
    private String bmd_femore___eq;
    private String bmd_femore___ne;
    private Boolean bmd_femore___null;
    private Boolean bmd_femore___not___null;
    private java.util.List<String> bmd_femore___in;
    private java.util.List<String> bmd_femore___not___in;
    private String bmd_femore___lt;
    private String bmd_femore___lte;
    private String bmd_femore___gt;
    private String bmd_femore___gte;
    private Integer cap_iqr___eq;
    private Integer cap_iqr___ne;
    private Boolean cap_iqr___null;
    private Boolean cap_iqr___not___null;
    private java.util.List<Integer> cap_iqr___in;
    private java.util.List<Integer> cap_iqr___not___in;
    private Integer cap_iqr___lt;
    private Integer cap_iqr___lte;
    private Integer cap_iqr___gt;
    private Integer cap_iqr___gte;
    private Integer cap_mediano___eq;
    private Integer cap_mediano___ne;
    private Boolean cap_mediano___null;
    private Boolean cap_mediano___not___null;
    private java.util.List<Integer> cap_mediano___in;
    private java.util.List<Integer> cap_mediano___not___in;
    private Integer cap_mediano___lt;
    private Integer cap_mediano___lte;
    private Integer cap_mediano___gt;
    private Integer cap_mediano___gte;
    private String classe_rischio_hpv___eq;
    private String classe_rischio_hpv___ne;
    private Boolean classe_rischio_hpv___null;
    private Boolean classe_rischio_hpv___not___null;
    private java.util.List<String> classe_rischio_hpv___in;
    private java.util.List<String> classe_rischio_hpv___not___in;
    private String classe_rischio_hpv___lt;
    private String classe_rischio_hpv___lte;
    private String classe_rischio_hpv___gt;
    private String classe_rischio_hpv___gte;
    private String classe_rischio_hpv___contains;
    private String classe_rischio_hpv___not___contains;
    private String classe_rischio_hpv___starts_with;
    private String classe_rischio_hpv___not___starts_with;
    private String classe_rischio_hpv___ends_with;
    private String classe_rischio_hpv___not___ends_with;
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
    private String esame___eq;
    private String esame___ne;
    private Boolean esame___null;
    private Boolean esame___not___null;
    private java.util.List<String> esame___in;
    private java.util.List<String> esame___not___in;
    private String esame___lt;
    private String esame___lte;
    private String esame___gt;
    private String esame___gte;
    private String esame___contains;
    private String esame___not___contains;
    private String esame___starts_with;
    private String esame___not___starts_with;
    private String esame___ends_with;
    private String esame___not___ends_with;
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
    private String genotipi_hpv___eq;
    private String genotipi_hpv___ne;
    private Boolean genotipi_hpv___null;
    private Boolean genotipi_hpv___not___null;
    private java.util.List<String> genotipi_hpv___in;
    private java.util.List<String> genotipi_hpv___not___in;
    private String genotipi_hpv___lt;
    private String genotipi_hpv___lte;
    private String genotipi_hpv___gt;
    private String genotipi_hpv___gte;
    private String genotipi_hpv___contains;
    private String genotipi_hpv___not___contains;
    private String genotipi_hpv___starts_with;
    private String genotipi_hpv___not___starts_with;
    private String genotipi_hpv___ends_with;
    private String genotipi_hpv___not___ends_with;
    private Integer i_paziente___eq;
    private Integer i_paziente___ne;
    private Boolean i_paziente___null;
    private Boolean i_paziente___not___null;
    private java.util.List<Integer> i_paziente___in;
    private java.util.List<Integer> i_paziente___not___in;
    private Integer i_paziente___lt;
    private Integer i_paziente___lte;
    private Integer i_paziente___gt;
    private Integer i_paziente___gte;
    private String metavir___eq;
    private String metavir___ne;
    private Boolean metavir___null;
    private Boolean metavir___not___null;
    private java.util.List<String> metavir___in;
    private java.util.List<String> metavir___not___in;
    private String metavir___lt;
    private String metavir___lte;
    private String metavir___gt;
    private String metavir___gte;
    private String metavir___contains;
    private String metavir___not___contains;
    private String metavir___starts_with;
    private String metavir___not___starts_with;
    private String metavir___ends_with;
    private String metavir___not___ends_with;
    private Boolean patologico___eq;
    private Boolean patologico___ne;
    private Boolean patologico___null;
    private Boolean patologico___not___null;
    private Integer paziente_ok___eq;
    private Integer paziente_ok___ne;
    private Boolean paziente_ok___null;
    private Boolean paziente_ok___not___null;
    private java.util.List<Integer> paziente_ok___in;
    private java.util.List<Integer> paziente_ok___not___in;
    private Integer paziente_ok___lt;
    private Integer paziente_ok___lte;
    private Integer paziente_ok___gt;
    private Integer paziente_ok___gte;
    private String stifness___eq;
    private String stifness___ne;
    private Boolean stifness___null;
    private Boolean stifness___not___null;
    private java.util.List<String> stifness___in;
    private java.util.List<String> stifness___not___in;
    private String stifness___lt;
    private String stifness___lte;
    private String stifness___gt;
    private String stifness___gte;
    private String success_rate___eq;
    private String success_rate___ne;
    private Boolean success_rate___null;
    private Boolean success_rate___not___null;
    private java.util.List<String> success_rate___in;
    private java.util.List<String> success_rate___not___in;
    private String success_rate___lt;
    private String success_rate___lte;
    private String success_rate___gt;
    private String success_rate___gte;
    private String t_score_colonna___eq;
    private String t_score_colonna___ne;
    private Boolean t_score_colonna___null;
    private Boolean t_score_colonna___not___null;
    private java.util.List<String> t_score_colonna___in;
    private java.util.List<String> t_score_colonna___not___in;
    private String t_score_colonna___lt;
    private String t_score_colonna___lte;
    private String t_score_colonna___gt;
    private String t_score_colonna___gte;
    private String t_score_femore___eq;
    private String t_score_femore___ne;
    private Boolean t_score_femore___null;
    private Boolean t_score_femore___not___null;
    private java.util.List<String> t_score_femore___in;
    private java.util.List<String> t_score_femore___not___in;
    private String t_score_femore___lt;
    private String t_score_femore___lte;
    private String t_score_femore___gt;
    private String t_score_femore___gte;
    private String z_score_colonna___eq;
    private String z_score_colonna___ne;
    private Boolean z_score_colonna___null;
    private Boolean z_score_colonna___not___null;
    private java.util.List<String> z_score_colonna___in;
    private java.util.List<String> z_score_colonna___not___in;
    private String z_score_colonna___lt;
    private String z_score_colonna___lte;
    private String z_score_colonna___gt;
    private String z_score_colonna___gte;
    private String z_score_femore___eq;
    private String z_score_femore___ne;
    private Boolean z_score_femore___null;
    private Boolean z_score_femore___not___null;
    private java.util.List<String> z_score_femore___in;
    private java.util.List<String> z_score_femore___not___in;
    private String z_score_femore___lt;
    private String z_score_femore___lte;
    private String z_score_femore___gt;
    private String z_score_femore___gte;
    private java.util.List<CliEsame_strumentaleFilterDTO> AND;
    private java.util.List<CliEsame_strumentaleFilterDTO> OR;
    private CliEsame_strumentaleFilterDTO NOT;

    public CliEsame_strumentaleFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
    }

    public String getIQR___eq() {
        return IQR___eq;
    }
    public void setIQR___eq(String IQR___eq) {
        this.IQR___eq = IQR___eq;
    }

    public String getIQR___ne() {
        return IQR___ne;
    }
    public void setIQR___ne(String IQR___ne) {
        this.IQR___ne = IQR___ne;
    }

    public Boolean getIQR___null() {
        return IQR___null;
    }
    public void setIQR___null(Boolean IQR___null) {
        this.IQR___null = IQR___null;
    }

    public Boolean getIQR___not___null() {
        return IQR___not___null;
    }
    public void setIQR___not___null(Boolean IQR___not___null) {
        this.IQR___not___null = IQR___not___null;
    }

    public java.util.List<String> getIQR___in() {
        return IQR___in;
    }
    public void setIQR___in(java.util.List<String> IQR___in) {
        this.IQR___in = IQR___in;
    }

    public java.util.List<String> getIQR___not___in() {
        return IQR___not___in;
    }
    public void setIQR___not___in(java.util.List<String> IQR___not___in) {
        this.IQR___not___in = IQR___not___in;
    }

    public String getIQR___lt() {
        return IQR___lt;
    }
    public void setIQR___lt(String IQR___lt) {
        this.IQR___lt = IQR___lt;
    }

    public String getIQR___lte() {
        return IQR___lte;
    }
    public void setIQR___lte(String IQR___lte) {
        this.IQR___lte = IQR___lte;
    }

    public String getIQR___gt() {
        return IQR___gt;
    }
    public void setIQR___gt(String IQR___gt) {
        this.IQR___gt = IQR___gt;
    }

    public String getIQR___gte() {
        return IQR___gte;
    }
    public void setIQR___gte(String IQR___gte) {
        this.IQR___gte = IQR___gte;
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

    public String getAltro_esame___eq() {
        return altro_esame___eq;
    }
    public void setAltro_esame___eq(String altro_esame___eq) {
        this.altro_esame___eq = altro_esame___eq;
    }

    public String getAltro_esame___ne() {
        return altro_esame___ne;
    }
    public void setAltro_esame___ne(String altro_esame___ne) {
        this.altro_esame___ne = altro_esame___ne;
    }

    public Boolean getAltro_esame___null() {
        return altro_esame___null;
    }
    public void setAltro_esame___null(Boolean altro_esame___null) {
        this.altro_esame___null = altro_esame___null;
    }

    public Boolean getAltro_esame___not___null() {
        return altro_esame___not___null;
    }
    public void setAltro_esame___not___null(Boolean altro_esame___not___null) {
        this.altro_esame___not___null = altro_esame___not___null;
    }

    public java.util.List<String> getAltro_esame___in() {
        return altro_esame___in;
    }
    public void setAltro_esame___in(java.util.List<String> altro_esame___in) {
        this.altro_esame___in = altro_esame___in;
    }

    public java.util.List<String> getAltro_esame___not___in() {
        return altro_esame___not___in;
    }
    public void setAltro_esame___not___in(java.util.List<String> altro_esame___not___in) {
        this.altro_esame___not___in = altro_esame___not___in;
    }

    public String getAltro_esame___lt() {
        return altro_esame___lt;
    }
    public void setAltro_esame___lt(String altro_esame___lt) {
        this.altro_esame___lt = altro_esame___lt;
    }

    public String getAltro_esame___lte() {
        return altro_esame___lte;
    }
    public void setAltro_esame___lte(String altro_esame___lte) {
        this.altro_esame___lte = altro_esame___lte;
    }

    public String getAltro_esame___gt() {
        return altro_esame___gt;
    }
    public void setAltro_esame___gt(String altro_esame___gt) {
        this.altro_esame___gt = altro_esame___gt;
    }

    public String getAltro_esame___gte() {
        return altro_esame___gte;
    }
    public void setAltro_esame___gte(String altro_esame___gte) {
        this.altro_esame___gte = altro_esame___gte;
    }

    public String getAltro_esame___contains() {
        return altro_esame___contains;
    }
    public void setAltro_esame___contains(String altro_esame___contains) {
        this.altro_esame___contains = altro_esame___contains;
    }

    public String getAltro_esame___not___contains() {
        return altro_esame___not___contains;
    }
    public void setAltro_esame___not___contains(String altro_esame___not___contains) {
        this.altro_esame___not___contains = altro_esame___not___contains;
    }

    public String getAltro_esame___starts_with() {
        return altro_esame___starts_with;
    }
    public void setAltro_esame___starts_with(String altro_esame___starts_with) {
        this.altro_esame___starts_with = altro_esame___starts_with;
    }

    public String getAltro_esame___not___starts_with() {
        return altro_esame___not___starts_with;
    }
    public void setAltro_esame___not___starts_with(String altro_esame___not___starts_with) {
        this.altro_esame___not___starts_with = altro_esame___not___starts_with;
    }

    public String getAltro_esame___ends_with() {
        return altro_esame___ends_with;
    }
    public void setAltro_esame___ends_with(String altro_esame___ends_with) {
        this.altro_esame___ends_with = altro_esame___ends_with;
    }

    public String getAltro_esame___not___ends_with() {
        return altro_esame___not___ends_with;
    }
    public void setAltro_esame___not___ends_with(String altro_esame___not___ends_with) {
        this.altro_esame___not___ends_with = altro_esame___not___ends_with;
    }

    public String getBmd_colonna___eq() {
        return bmd_colonna___eq;
    }
    public void setBmd_colonna___eq(String bmd_colonna___eq) {
        this.bmd_colonna___eq = bmd_colonna___eq;
    }

    public String getBmd_colonna___ne() {
        return bmd_colonna___ne;
    }
    public void setBmd_colonna___ne(String bmd_colonna___ne) {
        this.bmd_colonna___ne = bmd_colonna___ne;
    }

    public Boolean getBmd_colonna___null() {
        return bmd_colonna___null;
    }
    public void setBmd_colonna___null(Boolean bmd_colonna___null) {
        this.bmd_colonna___null = bmd_colonna___null;
    }

    public Boolean getBmd_colonna___not___null() {
        return bmd_colonna___not___null;
    }
    public void setBmd_colonna___not___null(Boolean bmd_colonna___not___null) {
        this.bmd_colonna___not___null = bmd_colonna___not___null;
    }

    public java.util.List<String> getBmd_colonna___in() {
        return bmd_colonna___in;
    }
    public void setBmd_colonna___in(java.util.List<String> bmd_colonna___in) {
        this.bmd_colonna___in = bmd_colonna___in;
    }

    public java.util.List<String> getBmd_colonna___not___in() {
        return bmd_colonna___not___in;
    }
    public void setBmd_colonna___not___in(java.util.List<String> bmd_colonna___not___in) {
        this.bmd_colonna___not___in = bmd_colonna___not___in;
    }

    public String getBmd_colonna___lt() {
        return bmd_colonna___lt;
    }
    public void setBmd_colonna___lt(String bmd_colonna___lt) {
        this.bmd_colonna___lt = bmd_colonna___lt;
    }

    public String getBmd_colonna___lte() {
        return bmd_colonna___lte;
    }
    public void setBmd_colonna___lte(String bmd_colonna___lte) {
        this.bmd_colonna___lte = bmd_colonna___lte;
    }

    public String getBmd_colonna___gt() {
        return bmd_colonna___gt;
    }
    public void setBmd_colonna___gt(String bmd_colonna___gt) {
        this.bmd_colonna___gt = bmd_colonna___gt;
    }

    public String getBmd_colonna___gte() {
        return bmd_colonna___gte;
    }
    public void setBmd_colonna___gte(String bmd_colonna___gte) {
        this.bmd_colonna___gte = bmd_colonna___gte;
    }

    public String getBmd_femore___eq() {
        return bmd_femore___eq;
    }
    public void setBmd_femore___eq(String bmd_femore___eq) {
        this.bmd_femore___eq = bmd_femore___eq;
    }

    public String getBmd_femore___ne() {
        return bmd_femore___ne;
    }
    public void setBmd_femore___ne(String bmd_femore___ne) {
        this.bmd_femore___ne = bmd_femore___ne;
    }

    public Boolean getBmd_femore___null() {
        return bmd_femore___null;
    }
    public void setBmd_femore___null(Boolean bmd_femore___null) {
        this.bmd_femore___null = bmd_femore___null;
    }

    public Boolean getBmd_femore___not___null() {
        return bmd_femore___not___null;
    }
    public void setBmd_femore___not___null(Boolean bmd_femore___not___null) {
        this.bmd_femore___not___null = bmd_femore___not___null;
    }

    public java.util.List<String> getBmd_femore___in() {
        return bmd_femore___in;
    }
    public void setBmd_femore___in(java.util.List<String> bmd_femore___in) {
        this.bmd_femore___in = bmd_femore___in;
    }

    public java.util.List<String> getBmd_femore___not___in() {
        return bmd_femore___not___in;
    }
    public void setBmd_femore___not___in(java.util.List<String> bmd_femore___not___in) {
        this.bmd_femore___not___in = bmd_femore___not___in;
    }

    public String getBmd_femore___lt() {
        return bmd_femore___lt;
    }
    public void setBmd_femore___lt(String bmd_femore___lt) {
        this.bmd_femore___lt = bmd_femore___lt;
    }

    public String getBmd_femore___lte() {
        return bmd_femore___lte;
    }
    public void setBmd_femore___lte(String bmd_femore___lte) {
        this.bmd_femore___lte = bmd_femore___lte;
    }

    public String getBmd_femore___gt() {
        return bmd_femore___gt;
    }
    public void setBmd_femore___gt(String bmd_femore___gt) {
        this.bmd_femore___gt = bmd_femore___gt;
    }

    public String getBmd_femore___gte() {
        return bmd_femore___gte;
    }
    public void setBmd_femore___gte(String bmd_femore___gte) {
        this.bmd_femore___gte = bmd_femore___gte;
    }

    public Integer getCap_iqr___eq() {
        return cap_iqr___eq;
    }
    public void setCap_iqr___eq(Integer cap_iqr___eq) {
        this.cap_iqr___eq = cap_iqr___eq;
    }

    public Integer getCap_iqr___ne() {
        return cap_iqr___ne;
    }
    public void setCap_iqr___ne(Integer cap_iqr___ne) {
        this.cap_iqr___ne = cap_iqr___ne;
    }

    public Boolean getCap_iqr___null() {
        return cap_iqr___null;
    }
    public void setCap_iqr___null(Boolean cap_iqr___null) {
        this.cap_iqr___null = cap_iqr___null;
    }

    public Boolean getCap_iqr___not___null() {
        return cap_iqr___not___null;
    }
    public void setCap_iqr___not___null(Boolean cap_iqr___not___null) {
        this.cap_iqr___not___null = cap_iqr___not___null;
    }

    public java.util.List<Integer> getCap_iqr___in() {
        return cap_iqr___in;
    }
    public void setCap_iqr___in(java.util.List<Integer> cap_iqr___in) {
        this.cap_iqr___in = cap_iqr___in;
    }

    public java.util.List<Integer> getCap_iqr___not___in() {
        return cap_iqr___not___in;
    }
    public void setCap_iqr___not___in(java.util.List<Integer> cap_iqr___not___in) {
        this.cap_iqr___not___in = cap_iqr___not___in;
    }

    public Integer getCap_iqr___lt() {
        return cap_iqr___lt;
    }
    public void setCap_iqr___lt(Integer cap_iqr___lt) {
        this.cap_iqr___lt = cap_iqr___lt;
    }

    public Integer getCap_iqr___lte() {
        return cap_iqr___lte;
    }
    public void setCap_iqr___lte(Integer cap_iqr___lte) {
        this.cap_iqr___lte = cap_iqr___lte;
    }

    public Integer getCap_iqr___gt() {
        return cap_iqr___gt;
    }
    public void setCap_iqr___gt(Integer cap_iqr___gt) {
        this.cap_iqr___gt = cap_iqr___gt;
    }

    public Integer getCap_iqr___gte() {
        return cap_iqr___gte;
    }
    public void setCap_iqr___gte(Integer cap_iqr___gte) {
        this.cap_iqr___gte = cap_iqr___gte;
    }

    public Integer getCap_mediano___eq() {
        return cap_mediano___eq;
    }
    public void setCap_mediano___eq(Integer cap_mediano___eq) {
        this.cap_mediano___eq = cap_mediano___eq;
    }

    public Integer getCap_mediano___ne() {
        return cap_mediano___ne;
    }
    public void setCap_mediano___ne(Integer cap_mediano___ne) {
        this.cap_mediano___ne = cap_mediano___ne;
    }

    public Boolean getCap_mediano___null() {
        return cap_mediano___null;
    }
    public void setCap_mediano___null(Boolean cap_mediano___null) {
        this.cap_mediano___null = cap_mediano___null;
    }

    public Boolean getCap_mediano___not___null() {
        return cap_mediano___not___null;
    }
    public void setCap_mediano___not___null(Boolean cap_mediano___not___null) {
        this.cap_mediano___not___null = cap_mediano___not___null;
    }

    public java.util.List<Integer> getCap_mediano___in() {
        return cap_mediano___in;
    }
    public void setCap_mediano___in(java.util.List<Integer> cap_mediano___in) {
        this.cap_mediano___in = cap_mediano___in;
    }

    public java.util.List<Integer> getCap_mediano___not___in() {
        return cap_mediano___not___in;
    }
    public void setCap_mediano___not___in(java.util.List<Integer> cap_mediano___not___in) {
        this.cap_mediano___not___in = cap_mediano___not___in;
    }

    public Integer getCap_mediano___lt() {
        return cap_mediano___lt;
    }
    public void setCap_mediano___lt(Integer cap_mediano___lt) {
        this.cap_mediano___lt = cap_mediano___lt;
    }

    public Integer getCap_mediano___lte() {
        return cap_mediano___lte;
    }
    public void setCap_mediano___lte(Integer cap_mediano___lte) {
        this.cap_mediano___lte = cap_mediano___lte;
    }

    public Integer getCap_mediano___gt() {
        return cap_mediano___gt;
    }
    public void setCap_mediano___gt(Integer cap_mediano___gt) {
        this.cap_mediano___gt = cap_mediano___gt;
    }

    public Integer getCap_mediano___gte() {
        return cap_mediano___gte;
    }
    public void setCap_mediano___gte(Integer cap_mediano___gte) {
        this.cap_mediano___gte = cap_mediano___gte;
    }

    public String getClasse_rischio_hpv___eq() {
        return classe_rischio_hpv___eq;
    }
    public void setClasse_rischio_hpv___eq(String classe_rischio_hpv___eq) {
        this.classe_rischio_hpv___eq = classe_rischio_hpv___eq;
    }

    public String getClasse_rischio_hpv___ne() {
        return classe_rischio_hpv___ne;
    }
    public void setClasse_rischio_hpv___ne(String classe_rischio_hpv___ne) {
        this.classe_rischio_hpv___ne = classe_rischio_hpv___ne;
    }

    public Boolean getClasse_rischio_hpv___null() {
        return classe_rischio_hpv___null;
    }
    public void setClasse_rischio_hpv___null(Boolean classe_rischio_hpv___null) {
        this.classe_rischio_hpv___null = classe_rischio_hpv___null;
    }

    public Boolean getClasse_rischio_hpv___not___null() {
        return classe_rischio_hpv___not___null;
    }
    public void setClasse_rischio_hpv___not___null(Boolean classe_rischio_hpv___not___null) {
        this.classe_rischio_hpv___not___null = classe_rischio_hpv___not___null;
    }

    public java.util.List<String> getClasse_rischio_hpv___in() {
        return classe_rischio_hpv___in;
    }
    public void setClasse_rischio_hpv___in(java.util.List<String> classe_rischio_hpv___in) {
        this.classe_rischio_hpv___in = classe_rischio_hpv___in;
    }

    public java.util.List<String> getClasse_rischio_hpv___not___in() {
        return classe_rischio_hpv___not___in;
    }
    public void setClasse_rischio_hpv___not___in(java.util.List<String> classe_rischio_hpv___not___in) {
        this.classe_rischio_hpv___not___in = classe_rischio_hpv___not___in;
    }

    public String getClasse_rischio_hpv___lt() {
        return classe_rischio_hpv___lt;
    }
    public void setClasse_rischio_hpv___lt(String classe_rischio_hpv___lt) {
        this.classe_rischio_hpv___lt = classe_rischio_hpv___lt;
    }

    public String getClasse_rischio_hpv___lte() {
        return classe_rischio_hpv___lte;
    }
    public void setClasse_rischio_hpv___lte(String classe_rischio_hpv___lte) {
        this.classe_rischio_hpv___lte = classe_rischio_hpv___lte;
    }

    public String getClasse_rischio_hpv___gt() {
        return classe_rischio_hpv___gt;
    }
    public void setClasse_rischio_hpv___gt(String classe_rischio_hpv___gt) {
        this.classe_rischio_hpv___gt = classe_rischio_hpv___gt;
    }

    public String getClasse_rischio_hpv___gte() {
        return classe_rischio_hpv___gte;
    }
    public void setClasse_rischio_hpv___gte(String classe_rischio_hpv___gte) {
        this.classe_rischio_hpv___gte = classe_rischio_hpv___gte;
    }

    public String getClasse_rischio_hpv___contains() {
        return classe_rischio_hpv___contains;
    }
    public void setClasse_rischio_hpv___contains(String classe_rischio_hpv___contains) {
        this.classe_rischio_hpv___contains = classe_rischio_hpv___contains;
    }

    public String getClasse_rischio_hpv___not___contains() {
        return classe_rischio_hpv___not___contains;
    }
    public void setClasse_rischio_hpv___not___contains(String classe_rischio_hpv___not___contains) {
        this.classe_rischio_hpv___not___contains = classe_rischio_hpv___not___contains;
    }

    public String getClasse_rischio_hpv___starts_with() {
        return classe_rischio_hpv___starts_with;
    }
    public void setClasse_rischio_hpv___starts_with(String classe_rischio_hpv___starts_with) {
        this.classe_rischio_hpv___starts_with = classe_rischio_hpv___starts_with;
    }

    public String getClasse_rischio_hpv___not___starts_with() {
        return classe_rischio_hpv___not___starts_with;
    }
    public void setClasse_rischio_hpv___not___starts_with(String classe_rischio_hpv___not___starts_with) {
        this.classe_rischio_hpv___not___starts_with = classe_rischio_hpv___not___starts_with;
    }

    public String getClasse_rischio_hpv___ends_with() {
        return classe_rischio_hpv___ends_with;
    }
    public void setClasse_rischio_hpv___ends_with(String classe_rischio_hpv___ends_with) {
        this.classe_rischio_hpv___ends_with = classe_rischio_hpv___ends_with;
    }

    public String getClasse_rischio_hpv___not___ends_with() {
        return classe_rischio_hpv___not___ends_with;
    }
    public void setClasse_rischio_hpv___not___ends_with(String classe_rischio_hpv___not___ends_with) {
        this.classe_rischio_hpv___not___ends_with = classe_rischio_hpv___not___ends_with;
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

    public String getEsame___eq() {
        return esame___eq;
    }
    public void setEsame___eq(String esame___eq) {
        this.esame___eq = esame___eq;
    }

    public String getEsame___ne() {
        return esame___ne;
    }
    public void setEsame___ne(String esame___ne) {
        this.esame___ne = esame___ne;
    }

    public Boolean getEsame___null() {
        return esame___null;
    }
    public void setEsame___null(Boolean esame___null) {
        this.esame___null = esame___null;
    }

    public Boolean getEsame___not___null() {
        return esame___not___null;
    }
    public void setEsame___not___null(Boolean esame___not___null) {
        this.esame___not___null = esame___not___null;
    }

    public java.util.List<String> getEsame___in() {
        return esame___in;
    }
    public void setEsame___in(java.util.List<String> esame___in) {
        this.esame___in = esame___in;
    }

    public java.util.List<String> getEsame___not___in() {
        return esame___not___in;
    }
    public void setEsame___not___in(java.util.List<String> esame___not___in) {
        this.esame___not___in = esame___not___in;
    }

    public String getEsame___lt() {
        return esame___lt;
    }
    public void setEsame___lt(String esame___lt) {
        this.esame___lt = esame___lt;
    }

    public String getEsame___lte() {
        return esame___lte;
    }
    public void setEsame___lte(String esame___lte) {
        this.esame___lte = esame___lte;
    }

    public String getEsame___gt() {
        return esame___gt;
    }
    public void setEsame___gt(String esame___gt) {
        this.esame___gt = esame___gt;
    }

    public String getEsame___gte() {
        return esame___gte;
    }
    public void setEsame___gte(String esame___gte) {
        this.esame___gte = esame___gte;
    }

    public String getEsame___contains() {
        return esame___contains;
    }
    public void setEsame___contains(String esame___contains) {
        this.esame___contains = esame___contains;
    }

    public String getEsame___not___contains() {
        return esame___not___contains;
    }
    public void setEsame___not___contains(String esame___not___contains) {
        this.esame___not___contains = esame___not___contains;
    }

    public String getEsame___starts_with() {
        return esame___starts_with;
    }
    public void setEsame___starts_with(String esame___starts_with) {
        this.esame___starts_with = esame___starts_with;
    }

    public String getEsame___not___starts_with() {
        return esame___not___starts_with;
    }
    public void setEsame___not___starts_with(String esame___not___starts_with) {
        this.esame___not___starts_with = esame___not___starts_with;
    }

    public String getEsame___ends_with() {
        return esame___ends_with;
    }
    public void setEsame___ends_with(String esame___ends_with) {
        this.esame___ends_with = esame___ends_with;
    }

    public String getEsame___not___ends_with() {
        return esame___not___ends_with;
    }
    public void setEsame___not___ends_with(String esame___not___ends_with) {
        this.esame___not___ends_with = esame___not___ends_with;
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

    public String getGenotipi_hpv___eq() {
        return genotipi_hpv___eq;
    }
    public void setGenotipi_hpv___eq(String genotipi_hpv___eq) {
        this.genotipi_hpv___eq = genotipi_hpv___eq;
    }

    public String getGenotipi_hpv___ne() {
        return genotipi_hpv___ne;
    }
    public void setGenotipi_hpv___ne(String genotipi_hpv___ne) {
        this.genotipi_hpv___ne = genotipi_hpv___ne;
    }

    public Boolean getGenotipi_hpv___null() {
        return genotipi_hpv___null;
    }
    public void setGenotipi_hpv___null(Boolean genotipi_hpv___null) {
        this.genotipi_hpv___null = genotipi_hpv___null;
    }

    public Boolean getGenotipi_hpv___not___null() {
        return genotipi_hpv___not___null;
    }
    public void setGenotipi_hpv___not___null(Boolean genotipi_hpv___not___null) {
        this.genotipi_hpv___not___null = genotipi_hpv___not___null;
    }

    public java.util.List<String> getGenotipi_hpv___in() {
        return genotipi_hpv___in;
    }
    public void setGenotipi_hpv___in(java.util.List<String> genotipi_hpv___in) {
        this.genotipi_hpv___in = genotipi_hpv___in;
    }

    public java.util.List<String> getGenotipi_hpv___not___in() {
        return genotipi_hpv___not___in;
    }
    public void setGenotipi_hpv___not___in(java.util.List<String> genotipi_hpv___not___in) {
        this.genotipi_hpv___not___in = genotipi_hpv___not___in;
    }

    public String getGenotipi_hpv___lt() {
        return genotipi_hpv___lt;
    }
    public void setGenotipi_hpv___lt(String genotipi_hpv___lt) {
        this.genotipi_hpv___lt = genotipi_hpv___lt;
    }

    public String getGenotipi_hpv___lte() {
        return genotipi_hpv___lte;
    }
    public void setGenotipi_hpv___lte(String genotipi_hpv___lte) {
        this.genotipi_hpv___lte = genotipi_hpv___lte;
    }

    public String getGenotipi_hpv___gt() {
        return genotipi_hpv___gt;
    }
    public void setGenotipi_hpv___gt(String genotipi_hpv___gt) {
        this.genotipi_hpv___gt = genotipi_hpv___gt;
    }

    public String getGenotipi_hpv___gte() {
        return genotipi_hpv___gte;
    }
    public void setGenotipi_hpv___gte(String genotipi_hpv___gte) {
        this.genotipi_hpv___gte = genotipi_hpv___gte;
    }

    public String getGenotipi_hpv___contains() {
        return genotipi_hpv___contains;
    }
    public void setGenotipi_hpv___contains(String genotipi_hpv___contains) {
        this.genotipi_hpv___contains = genotipi_hpv___contains;
    }

    public String getGenotipi_hpv___not___contains() {
        return genotipi_hpv___not___contains;
    }
    public void setGenotipi_hpv___not___contains(String genotipi_hpv___not___contains) {
        this.genotipi_hpv___not___contains = genotipi_hpv___not___contains;
    }

    public String getGenotipi_hpv___starts_with() {
        return genotipi_hpv___starts_with;
    }
    public void setGenotipi_hpv___starts_with(String genotipi_hpv___starts_with) {
        this.genotipi_hpv___starts_with = genotipi_hpv___starts_with;
    }

    public String getGenotipi_hpv___not___starts_with() {
        return genotipi_hpv___not___starts_with;
    }
    public void setGenotipi_hpv___not___starts_with(String genotipi_hpv___not___starts_with) {
        this.genotipi_hpv___not___starts_with = genotipi_hpv___not___starts_with;
    }

    public String getGenotipi_hpv___ends_with() {
        return genotipi_hpv___ends_with;
    }
    public void setGenotipi_hpv___ends_with(String genotipi_hpv___ends_with) {
        this.genotipi_hpv___ends_with = genotipi_hpv___ends_with;
    }

    public String getGenotipi_hpv___not___ends_with() {
        return genotipi_hpv___not___ends_with;
    }
    public void setGenotipi_hpv___not___ends_with(String genotipi_hpv___not___ends_with) {
        this.genotipi_hpv___not___ends_with = genotipi_hpv___not___ends_with;
    }

    public Integer getI_paziente___eq() {
        return i_paziente___eq;
    }
    public void setI_paziente___eq(Integer i_paziente___eq) {
        this.i_paziente___eq = i_paziente___eq;
    }

    public Integer getI_paziente___ne() {
        return i_paziente___ne;
    }
    public void setI_paziente___ne(Integer i_paziente___ne) {
        this.i_paziente___ne = i_paziente___ne;
    }

    public Boolean getI_paziente___null() {
        return i_paziente___null;
    }
    public void setI_paziente___null(Boolean i_paziente___null) {
        this.i_paziente___null = i_paziente___null;
    }

    public Boolean getI_paziente___not___null() {
        return i_paziente___not___null;
    }
    public void setI_paziente___not___null(Boolean i_paziente___not___null) {
        this.i_paziente___not___null = i_paziente___not___null;
    }

    public java.util.List<Integer> getI_paziente___in() {
        return i_paziente___in;
    }
    public void setI_paziente___in(java.util.List<Integer> i_paziente___in) {
        this.i_paziente___in = i_paziente___in;
    }

    public java.util.List<Integer> getI_paziente___not___in() {
        return i_paziente___not___in;
    }
    public void setI_paziente___not___in(java.util.List<Integer> i_paziente___not___in) {
        this.i_paziente___not___in = i_paziente___not___in;
    }

    public Integer getI_paziente___lt() {
        return i_paziente___lt;
    }
    public void setI_paziente___lt(Integer i_paziente___lt) {
        this.i_paziente___lt = i_paziente___lt;
    }

    public Integer getI_paziente___lte() {
        return i_paziente___lte;
    }
    public void setI_paziente___lte(Integer i_paziente___lte) {
        this.i_paziente___lte = i_paziente___lte;
    }

    public Integer getI_paziente___gt() {
        return i_paziente___gt;
    }
    public void setI_paziente___gt(Integer i_paziente___gt) {
        this.i_paziente___gt = i_paziente___gt;
    }

    public Integer getI_paziente___gte() {
        return i_paziente___gte;
    }
    public void setI_paziente___gte(Integer i_paziente___gte) {
        this.i_paziente___gte = i_paziente___gte;
    }

    public String getMetavir___eq() {
        return metavir___eq;
    }
    public void setMetavir___eq(String metavir___eq) {
        this.metavir___eq = metavir___eq;
    }

    public String getMetavir___ne() {
        return metavir___ne;
    }
    public void setMetavir___ne(String metavir___ne) {
        this.metavir___ne = metavir___ne;
    }

    public Boolean getMetavir___null() {
        return metavir___null;
    }
    public void setMetavir___null(Boolean metavir___null) {
        this.metavir___null = metavir___null;
    }

    public Boolean getMetavir___not___null() {
        return metavir___not___null;
    }
    public void setMetavir___not___null(Boolean metavir___not___null) {
        this.metavir___not___null = metavir___not___null;
    }

    public java.util.List<String> getMetavir___in() {
        return metavir___in;
    }
    public void setMetavir___in(java.util.List<String> metavir___in) {
        this.metavir___in = metavir___in;
    }

    public java.util.List<String> getMetavir___not___in() {
        return metavir___not___in;
    }
    public void setMetavir___not___in(java.util.List<String> metavir___not___in) {
        this.metavir___not___in = metavir___not___in;
    }

    public String getMetavir___lt() {
        return metavir___lt;
    }
    public void setMetavir___lt(String metavir___lt) {
        this.metavir___lt = metavir___lt;
    }

    public String getMetavir___lte() {
        return metavir___lte;
    }
    public void setMetavir___lte(String metavir___lte) {
        this.metavir___lte = metavir___lte;
    }

    public String getMetavir___gt() {
        return metavir___gt;
    }
    public void setMetavir___gt(String metavir___gt) {
        this.metavir___gt = metavir___gt;
    }

    public String getMetavir___gte() {
        return metavir___gte;
    }
    public void setMetavir___gte(String metavir___gte) {
        this.metavir___gte = metavir___gte;
    }

    public String getMetavir___contains() {
        return metavir___contains;
    }
    public void setMetavir___contains(String metavir___contains) {
        this.metavir___contains = metavir___contains;
    }

    public String getMetavir___not___contains() {
        return metavir___not___contains;
    }
    public void setMetavir___not___contains(String metavir___not___contains) {
        this.metavir___not___contains = metavir___not___contains;
    }

    public String getMetavir___starts_with() {
        return metavir___starts_with;
    }
    public void setMetavir___starts_with(String metavir___starts_with) {
        this.metavir___starts_with = metavir___starts_with;
    }

    public String getMetavir___not___starts_with() {
        return metavir___not___starts_with;
    }
    public void setMetavir___not___starts_with(String metavir___not___starts_with) {
        this.metavir___not___starts_with = metavir___not___starts_with;
    }

    public String getMetavir___ends_with() {
        return metavir___ends_with;
    }
    public void setMetavir___ends_with(String metavir___ends_with) {
        this.metavir___ends_with = metavir___ends_with;
    }

    public String getMetavir___not___ends_with() {
        return metavir___not___ends_with;
    }
    public void setMetavir___not___ends_with(String metavir___not___ends_with) {
        this.metavir___not___ends_with = metavir___not___ends_with;
    }

    public Boolean getPatologico___eq() {
        return patologico___eq;
    }
    public void setPatologico___eq(Boolean patologico___eq) {
        this.patologico___eq = patologico___eq;
    }

    public Boolean getPatologico___ne() {
        return patologico___ne;
    }
    public void setPatologico___ne(Boolean patologico___ne) {
        this.patologico___ne = patologico___ne;
    }

    public Boolean getPatologico___null() {
        return patologico___null;
    }
    public void setPatologico___null(Boolean patologico___null) {
        this.patologico___null = patologico___null;
    }

    public Boolean getPatologico___not___null() {
        return patologico___not___null;
    }
    public void setPatologico___not___null(Boolean patologico___not___null) {
        this.patologico___not___null = patologico___not___null;
    }

    public Integer getPaziente_ok___eq() {
        return paziente_ok___eq;
    }
    public void setPaziente_ok___eq(Integer paziente_ok___eq) {
        this.paziente_ok___eq = paziente_ok___eq;
    }

    public Integer getPaziente_ok___ne() {
        return paziente_ok___ne;
    }
    public void setPaziente_ok___ne(Integer paziente_ok___ne) {
        this.paziente_ok___ne = paziente_ok___ne;
    }

    public Boolean getPaziente_ok___null() {
        return paziente_ok___null;
    }
    public void setPaziente_ok___null(Boolean paziente_ok___null) {
        this.paziente_ok___null = paziente_ok___null;
    }

    public Boolean getPaziente_ok___not___null() {
        return paziente_ok___not___null;
    }
    public void setPaziente_ok___not___null(Boolean paziente_ok___not___null) {
        this.paziente_ok___not___null = paziente_ok___not___null;
    }

    public java.util.List<Integer> getPaziente_ok___in() {
        return paziente_ok___in;
    }
    public void setPaziente_ok___in(java.util.List<Integer> paziente_ok___in) {
        this.paziente_ok___in = paziente_ok___in;
    }

    public java.util.List<Integer> getPaziente_ok___not___in() {
        return paziente_ok___not___in;
    }
    public void setPaziente_ok___not___in(java.util.List<Integer> paziente_ok___not___in) {
        this.paziente_ok___not___in = paziente_ok___not___in;
    }

    public Integer getPaziente_ok___lt() {
        return paziente_ok___lt;
    }
    public void setPaziente_ok___lt(Integer paziente_ok___lt) {
        this.paziente_ok___lt = paziente_ok___lt;
    }

    public Integer getPaziente_ok___lte() {
        return paziente_ok___lte;
    }
    public void setPaziente_ok___lte(Integer paziente_ok___lte) {
        this.paziente_ok___lte = paziente_ok___lte;
    }

    public Integer getPaziente_ok___gt() {
        return paziente_ok___gt;
    }
    public void setPaziente_ok___gt(Integer paziente_ok___gt) {
        this.paziente_ok___gt = paziente_ok___gt;
    }

    public Integer getPaziente_ok___gte() {
        return paziente_ok___gte;
    }
    public void setPaziente_ok___gte(Integer paziente_ok___gte) {
        this.paziente_ok___gte = paziente_ok___gte;
    }

    public String getStifness___eq() {
        return stifness___eq;
    }
    public void setStifness___eq(String stifness___eq) {
        this.stifness___eq = stifness___eq;
    }

    public String getStifness___ne() {
        return stifness___ne;
    }
    public void setStifness___ne(String stifness___ne) {
        this.stifness___ne = stifness___ne;
    }

    public Boolean getStifness___null() {
        return stifness___null;
    }
    public void setStifness___null(Boolean stifness___null) {
        this.stifness___null = stifness___null;
    }

    public Boolean getStifness___not___null() {
        return stifness___not___null;
    }
    public void setStifness___not___null(Boolean stifness___not___null) {
        this.stifness___not___null = stifness___not___null;
    }

    public java.util.List<String> getStifness___in() {
        return stifness___in;
    }
    public void setStifness___in(java.util.List<String> stifness___in) {
        this.stifness___in = stifness___in;
    }

    public java.util.List<String> getStifness___not___in() {
        return stifness___not___in;
    }
    public void setStifness___not___in(java.util.List<String> stifness___not___in) {
        this.stifness___not___in = stifness___not___in;
    }

    public String getStifness___lt() {
        return stifness___lt;
    }
    public void setStifness___lt(String stifness___lt) {
        this.stifness___lt = stifness___lt;
    }

    public String getStifness___lte() {
        return stifness___lte;
    }
    public void setStifness___lte(String stifness___lte) {
        this.stifness___lte = stifness___lte;
    }

    public String getStifness___gt() {
        return stifness___gt;
    }
    public void setStifness___gt(String stifness___gt) {
        this.stifness___gt = stifness___gt;
    }

    public String getStifness___gte() {
        return stifness___gte;
    }
    public void setStifness___gte(String stifness___gte) {
        this.stifness___gte = stifness___gte;
    }

    public String getSuccess_rate___eq() {
        return success_rate___eq;
    }
    public void setSuccess_rate___eq(String success_rate___eq) {
        this.success_rate___eq = success_rate___eq;
    }

    public String getSuccess_rate___ne() {
        return success_rate___ne;
    }
    public void setSuccess_rate___ne(String success_rate___ne) {
        this.success_rate___ne = success_rate___ne;
    }

    public Boolean getSuccess_rate___null() {
        return success_rate___null;
    }
    public void setSuccess_rate___null(Boolean success_rate___null) {
        this.success_rate___null = success_rate___null;
    }

    public Boolean getSuccess_rate___not___null() {
        return success_rate___not___null;
    }
    public void setSuccess_rate___not___null(Boolean success_rate___not___null) {
        this.success_rate___not___null = success_rate___not___null;
    }

    public java.util.List<String> getSuccess_rate___in() {
        return success_rate___in;
    }
    public void setSuccess_rate___in(java.util.List<String> success_rate___in) {
        this.success_rate___in = success_rate___in;
    }

    public java.util.List<String> getSuccess_rate___not___in() {
        return success_rate___not___in;
    }
    public void setSuccess_rate___not___in(java.util.List<String> success_rate___not___in) {
        this.success_rate___not___in = success_rate___not___in;
    }

    public String getSuccess_rate___lt() {
        return success_rate___lt;
    }
    public void setSuccess_rate___lt(String success_rate___lt) {
        this.success_rate___lt = success_rate___lt;
    }

    public String getSuccess_rate___lte() {
        return success_rate___lte;
    }
    public void setSuccess_rate___lte(String success_rate___lte) {
        this.success_rate___lte = success_rate___lte;
    }

    public String getSuccess_rate___gt() {
        return success_rate___gt;
    }
    public void setSuccess_rate___gt(String success_rate___gt) {
        this.success_rate___gt = success_rate___gt;
    }

    public String getSuccess_rate___gte() {
        return success_rate___gte;
    }
    public void setSuccess_rate___gte(String success_rate___gte) {
        this.success_rate___gte = success_rate___gte;
    }

    public String getT_score_colonna___eq() {
        return t_score_colonna___eq;
    }
    public void setT_score_colonna___eq(String t_score_colonna___eq) {
        this.t_score_colonna___eq = t_score_colonna___eq;
    }

    public String getT_score_colonna___ne() {
        return t_score_colonna___ne;
    }
    public void setT_score_colonna___ne(String t_score_colonna___ne) {
        this.t_score_colonna___ne = t_score_colonna___ne;
    }

    public Boolean getT_score_colonna___null() {
        return t_score_colonna___null;
    }
    public void setT_score_colonna___null(Boolean t_score_colonna___null) {
        this.t_score_colonna___null = t_score_colonna___null;
    }

    public Boolean getT_score_colonna___not___null() {
        return t_score_colonna___not___null;
    }
    public void setT_score_colonna___not___null(Boolean t_score_colonna___not___null) {
        this.t_score_colonna___not___null = t_score_colonna___not___null;
    }

    public java.util.List<String> getT_score_colonna___in() {
        return t_score_colonna___in;
    }
    public void setT_score_colonna___in(java.util.List<String> t_score_colonna___in) {
        this.t_score_colonna___in = t_score_colonna___in;
    }

    public java.util.List<String> getT_score_colonna___not___in() {
        return t_score_colonna___not___in;
    }
    public void setT_score_colonna___not___in(java.util.List<String> t_score_colonna___not___in) {
        this.t_score_colonna___not___in = t_score_colonna___not___in;
    }

    public String getT_score_colonna___lt() {
        return t_score_colonna___lt;
    }
    public void setT_score_colonna___lt(String t_score_colonna___lt) {
        this.t_score_colonna___lt = t_score_colonna___lt;
    }

    public String getT_score_colonna___lte() {
        return t_score_colonna___lte;
    }
    public void setT_score_colonna___lte(String t_score_colonna___lte) {
        this.t_score_colonna___lte = t_score_colonna___lte;
    }

    public String getT_score_colonna___gt() {
        return t_score_colonna___gt;
    }
    public void setT_score_colonna___gt(String t_score_colonna___gt) {
        this.t_score_colonna___gt = t_score_colonna___gt;
    }

    public String getT_score_colonna___gte() {
        return t_score_colonna___gte;
    }
    public void setT_score_colonna___gte(String t_score_colonna___gte) {
        this.t_score_colonna___gte = t_score_colonna___gte;
    }

    public String getT_score_femore___eq() {
        return t_score_femore___eq;
    }
    public void setT_score_femore___eq(String t_score_femore___eq) {
        this.t_score_femore___eq = t_score_femore___eq;
    }

    public String getT_score_femore___ne() {
        return t_score_femore___ne;
    }
    public void setT_score_femore___ne(String t_score_femore___ne) {
        this.t_score_femore___ne = t_score_femore___ne;
    }

    public Boolean getT_score_femore___null() {
        return t_score_femore___null;
    }
    public void setT_score_femore___null(Boolean t_score_femore___null) {
        this.t_score_femore___null = t_score_femore___null;
    }

    public Boolean getT_score_femore___not___null() {
        return t_score_femore___not___null;
    }
    public void setT_score_femore___not___null(Boolean t_score_femore___not___null) {
        this.t_score_femore___not___null = t_score_femore___not___null;
    }

    public java.util.List<String> getT_score_femore___in() {
        return t_score_femore___in;
    }
    public void setT_score_femore___in(java.util.List<String> t_score_femore___in) {
        this.t_score_femore___in = t_score_femore___in;
    }

    public java.util.List<String> getT_score_femore___not___in() {
        return t_score_femore___not___in;
    }
    public void setT_score_femore___not___in(java.util.List<String> t_score_femore___not___in) {
        this.t_score_femore___not___in = t_score_femore___not___in;
    }

    public String getT_score_femore___lt() {
        return t_score_femore___lt;
    }
    public void setT_score_femore___lt(String t_score_femore___lt) {
        this.t_score_femore___lt = t_score_femore___lt;
    }

    public String getT_score_femore___lte() {
        return t_score_femore___lte;
    }
    public void setT_score_femore___lte(String t_score_femore___lte) {
        this.t_score_femore___lte = t_score_femore___lte;
    }

    public String getT_score_femore___gt() {
        return t_score_femore___gt;
    }
    public void setT_score_femore___gt(String t_score_femore___gt) {
        this.t_score_femore___gt = t_score_femore___gt;
    }

    public String getT_score_femore___gte() {
        return t_score_femore___gte;
    }
    public void setT_score_femore___gte(String t_score_femore___gte) {
        this.t_score_femore___gte = t_score_femore___gte;
    }

    public String getZ_score_colonna___eq() {
        return z_score_colonna___eq;
    }
    public void setZ_score_colonna___eq(String z_score_colonna___eq) {
        this.z_score_colonna___eq = z_score_colonna___eq;
    }

    public String getZ_score_colonna___ne() {
        return z_score_colonna___ne;
    }
    public void setZ_score_colonna___ne(String z_score_colonna___ne) {
        this.z_score_colonna___ne = z_score_colonna___ne;
    }

    public Boolean getZ_score_colonna___null() {
        return z_score_colonna___null;
    }
    public void setZ_score_colonna___null(Boolean z_score_colonna___null) {
        this.z_score_colonna___null = z_score_colonna___null;
    }

    public Boolean getZ_score_colonna___not___null() {
        return z_score_colonna___not___null;
    }
    public void setZ_score_colonna___not___null(Boolean z_score_colonna___not___null) {
        this.z_score_colonna___not___null = z_score_colonna___not___null;
    }

    public java.util.List<String> getZ_score_colonna___in() {
        return z_score_colonna___in;
    }
    public void setZ_score_colonna___in(java.util.List<String> z_score_colonna___in) {
        this.z_score_colonna___in = z_score_colonna___in;
    }

    public java.util.List<String> getZ_score_colonna___not___in() {
        return z_score_colonna___not___in;
    }
    public void setZ_score_colonna___not___in(java.util.List<String> z_score_colonna___not___in) {
        this.z_score_colonna___not___in = z_score_colonna___not___in;
    }

    public String getZ_score_colonna___lt() {
        return z_score_colonna___lt;
    }
    public void setZ_score_colonna___lt(String z_score_colonna___lt) {
        this.z_score_colonna___lt = z_score_colonna___lt;
    }

    public String getZ_score_colonna___lte() {
        return z_score_colonna___lte;
    }
    public void setZ_score_colonna___lte(String z_score_colonna___lte) {
        this.z_score_colonna___lte = z_score_colonna___lte;
    }

    public String getZ_score_colonna___gt() {
        return z_score_colonna___gt;
    }
    public void setZ_score_colonna___gt(String z_score_colonna___gt) {
        this.z_score_colonna___gt = z_score_colonna___gt;
    }

    public String getZ_score_colonna___gte() {
        return z_score_colonna___gte;
    }
    public void setZ_score_colonna___gte(String z_score_colonna___gte) {
        this.z_score_colonna___gte = z_score_colonna___gte;
    }

    public String getZ_score_femore___eq() {
        return z_score_femore___eq;
    }
    public void setZ_score_femore___eq(String z_score_femore___eq) {
        this.z_score_femore___eq = z_score_femore___eq;
    }

    public String getZ_score_femore___ne() {
        return z_score_femore___ne;
    }
    public void setZ_score_femore___ne(String z_score_femore___ne) {
        this.z_score_femore___ne = z_score_femore___ne;
    }

    public Boolean getZ_score_femore___null() {
        return z_score_femore___null;
    }
    public void setZ_score_femore___null(Boolean z_score_femore___null) {
        this.z_score_femore___null = z_score_femore___null;
    }

    public Boolean getZ_score_femore___not___null() {
        return z_score_femore___not___null;
    }
    public void setZ_score_femore___not___null(Boolean z_score_femore___not___null) {
        this.z_score_femore___not___null = z_score_femore___not___null;
    }

    public java.util.List<String> getZ_score_femore___in() {
        return z_score_femore___in;
    }
    public void setZ_score_femore___in(java.util.List<String> z_score_femore___in) {
        this.z_score_femore___in = z_score_femore___in;
    }

    public java.util.List<String> getZ_score_femore___not___in() {
        return z_score_femore___not___in;
    }
    public void setZ_score_femore___not___in(java.util.List<String> z_score_femore___not___in) {
        this.z_score_femore___not___in = z_score_femore___not___in;
    }

    public String getZ_score_femore___lt() {
        return z_score_femore___lt;
    }
    public void setZ_score_femore___lt(String z_score_femore___lt) {
        this.z_score_femore___lt = z_score_femore___lt;
    }

    public String getZ_score_femore___lte() {
        return z_score_femore___lte;
    }
    public void setZ_score_femore___lte(String z_score_femore___lte) {
        this.z_score_femore___lte = z_score_femore___lte;
    }

    public String getZ_score_femore___gt() {
        return z_score_femore___gt;
    }
    public void setZ_score_femore___gt(String z_score_femore___gt) {
        this.z_score_femore___gt = z_score_femore___gt;
    }

    public String getZ_score_femore___gte() {
        return z_score_femore___gte;
    }
    public void setZ_score_femore___gte(String z_score_femore___gte) {
        this.z_score_femore___gte = z_score_femore___gte;
    }

    public java.util.List<CliEsame_strumentaleFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliEsame_strumentaleFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliEsame_strumentaleFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliEsame_strumentaleFilterDTO> OR) {
        this.OR = OR;
    }

    public CliEsame_strumentaleFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliEsame_strumentaleFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
        }
        if (IQR___eq != null) {
            joiner.add("IQR___eq: " + GraphQLRequestSerializer.getEntry(IQR___eq));
        }
        if (IQR___ne != null) {
            joiner.add("IQR___ne: " + GraphQLRequestSerializer.getEntry(IQR___ne));
        }
        if (IQR___null != null) {
            joiner.add("IQR___null: " + GraphQLRequestSerializer.getEntry(IQR___null));
        }
        if (IQR___not___null != null) {
            joiner.add("IQR___not___null: " + GraphQLRequestSerializer.getEntry(IQR___not___null));
        }
        if (IQR___in != null) {
            joiner.add("IQR___in: " + GraphQLRequestSerializer.getEntry(IQR___in));
        }
        if (IQR___not___in != null) {
            joiner.add("IQR___not___in: " + GraphQLRequestSerializer.getEntry(IQR___not___in));
        }
        if (IQR___lt != null) {
            joiner.add("IQR___lt: " + GraphQLRequestSerializer.getEntry(IQR___lt));
        }
        if (IQR___lte != null) {
            joiner.add("IQR___lte: " + GraphQLRequestSerializer.getEntry(IQR___lte));
        }
        if (IQR___gt != null) {
            joiner.add("IQR___gt: " + GraphQLRequestSerializer.getEntry(IQR___gt));
        }
        if (IQR___gte != null) {
            joiner.add("IQR___gte: " + GraphQLRequestSerializer.getEntry(IQR___gte));
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
        if (altro_esame___eq != null) {
            joiner.add("altro_esame___eq: " + GraphQLRequestSerializer.getEntry(altro_esame___eq));
        }
        if (altro_esame___ne != null) {
            joiner.add("altro_esame___ne: " + GraphQLRequestSerializer.getEntry(altro_esame___ne));
        }
        if (altro_esame___null != null) {
            joiner.add("altro_esame___null: " + GraphQLRequestSerializer.getEntry(altro_esame___null));
        }
        if (altro_esame___not___null != null) {
            joiner.add("altro_esame___not___null: " + GraphQLRequestSerializer.getEntry(altro_esame___not___null));
        }
        if (altro_esame___in != null) {
            joiner.add("altro_esame___in: " + GraphQLRequestSerializer.getEntry(altro_esame___in));
        }
        if (altro_esame___not___in != null) {
            joiner.add("altro_esame___not___in: " + GraphQLRequestSerializer.getEntry(altro_esame___not___in));
        }
        if (altro_esame___lt != null) {
            joiner.add("altro_esame___lt: " + GraphQLRequestSerializer.getEntry(altro_esame___lt));
        }
        if (altro_esame___lte != null) {
            joiner.add("altro_esame___lte: " + GraphQLRequestSerializer.getEntry(altro_esame___lte));
        }
        if (altro_esame___gt != null) {
            joiner.add("altro_esame___gt: " + GraphQLRequestSerializer.getEntry(altro_esame___gt));
        }
        if (altro_esame___gte != null) {
            joiner.add("altro_esame___gte: " + GraphQLRequestSerializer.getEntry(altro_esame___gte));
        }
        if (altro_esame___contains != null) {
            joiner.add("altro_esame___contains: " + GraphQLRequestSerializer.getEntry(altro_esame___contains));
        }
        if (altro_esame___not___contains != null) {
            joiner.add("altro_esame___not___contains: " + GraphQLRequestSerializer.getEntry(altro_esame___not___contains));
        }
        if (altro_esame___starts_with != null) {
            joiner.add("altro_esame___starts_with: " + GraphQLRequestSerializer.getEntry(altro_esame___starts_with));
        }
        if (altro_esame___not___starts_with != null) {
            joiner.add("altro_esame___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_esame___not___starts_with));
        }
        if (altro_esame___ends_with != null) {
            joiner.add("altro_esame___ends_with: " + GraphQLRequestSerializer.getEntry(altro_esame___ends_with));
        }
        if (altro_esame___not___ends_with != null) {
            joiner.add("altro_esame___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_esame___not___ends_with));
        }
        if (bmd_colonna___eq != null) {
            joiner.add("bmd_colonna___eq: " + GraphQLRequestSerializer.getEntry(bmd_colonna___eq));
        }
        if (bmd_colonna___ne != null) {
            joiner.add("bmd_colonna___ne: " + GraphQLRequestSerializer.getEntry(bmd_colonna___ne));
        }
        if (bmd_colonna___null != null) {
            joiner.add("bmd_colonna___null: " + GraphQLRequestSerializer.getEntry(bmd_colonna___null));
        }
        if (bmd_colonna___not___null != null) {
            joiner.add("bmd_colonna___not___null: " + GraphQLRequestSerializer.getEntry(bmd_colonna___not___null));
        }
        if (bmd_colonna___in != null) {
            joiner.add("bmd_colonna___in: " + GraphQLRequestSerializer.getEntry(bmd_colonna___in));
        }
        if (bmd_colonna___not___in != null) {
            joiner.add("bmd_colonna___not___in: " + GraphQLRequestSerializer.getEntry(bmd_colonna___not___in));
        }
        if (bmd_colonna___lt != null) {
            joiner.add("bmd_colonna___lt: " + GraphQLRequestSerializer.getEntry(bmd_colonna___lt));
        }
        if (bmd_colonna___lte != null) {
            joiner.add("bmd_colonna___lte: " + GraphQLRequestSerializer.getEntry(bmd_colonna___lte));
        }
        if (bmd_colonna___gt != null) {
            joiner.add("bmd_colonna___gt: " + GraphQLRequestSerializer.getEntry(bmd_colonna___gt));
        }
        if (bmd_colonna___gte != null) {
            joiner.add("bmd_colonna___gte: " + GraphQLRequestSerializer.getEntry(bmd_colonna___gte));
        }
        if (bmd_femore___eq != null) {
            joiner.add("bmd_femore___eq: " + GraphQLRequestSerializer.getEntry(bmd_femore___eq));
        }
        if (bmd_femore___ne != null) {
            joiner.add("bmd_femore___ne: " + GraphQLRequestSerializer.getEntry(bmd_femore___ne));
        }
        if (bmd_femore___null != null) {
            joiner.add("bmd_femore___null: " + GraphQLRequestSerializer.getEntry(bmd_femore___null));
        }
        if (bmd_femore___not___null != null) {
            joiner.add("bmd_femore___not___null: " + GraphQLRequestSerializer.getEntry(bmd_femore___not___null));
        }
        if (bmd_femore___in != null) {
            joiner.add("bmd_femore___in: " + GraphQLRequestSerializer.getEntry(bmd_femore___in));
        }
        if (bmd_femore___not___in != null) {
            joiner.add("bmd_femore___not___in: " + GraphQLRequestSerializer.getEntry(bmd_femore___not___in));
        }
        if (bmd_femore___lt != null) {
            joiner.add("bmd_femore___lt: " + GraphQLRequestSerializer.getEntry(bmd_femore___lt));
        }
        if (bmd_femore___lte != null) {
            joiner.add("bmd_femore___lte: " + GraphQLRequestSerializer.getEntry(bmd_femore___lte));
        }
        if (bmd_femore___gt != null) {
            joiner.add("bmd_femore___gt: " + GraphQLRequestSerializer.getEntry(bmd_femore___gt));
        }
        if (bmd_femore___gte != null) {
            joiner.add("bmd_femore___gte: " + GraphQLRequestSerializer.getEntry(bmd_femore___gte));
        }
        if (cap_iqr___eq != null) {
            joiner.add("cap_iqr___eq: " + GraphQLRequestSerializer.getEntry(cap_iqr___eq));
        }
        if (cap_iqr___ne != null) {
            joiner.add("cap_iqr___ne: " + GraphQLRequestSerializer.getEntry(cap_iqr___ne));
        }
        if (cap_iqr___null != null) {
            joiner.add("cap_iqr___null: " + GraphQLRequestSerializer.getEntry(cap_iqr___null));
        }
        if (cap_iqr___not___null != null) {
            joiner.add("cap_iqr___not___null: " + GraphQLRequestSerializer.getEntry(cap_iqr___not___null));
        }
        if (cap_iqr___in != null) {
            joiner.add("cap_iqr___in: " + GraphQLRequestSerializer.getEntry(cap_iqr___in));
        }
        if (cap_iqr___not___in != null) {
            joiner.add("cap_iqr___not___in: " + GraphQLRequestSerializer.getEntry(cap_iqr___not___in));
        }
        if (cap_iqr___lt != null) {
            joiner.add("cap_iqr___lt: " + GraphQLRequestSerializer.getEntry(cap_iqr___lt));
        }
        if (cap_iqr___lte != null) {
            joiner.add("cap_iqr___lte: " + GraphQLRequestSerializer.getEntry(cap_iqr___lte));
        }
        if (cap_iqr___gt != null) {
            joiner.add("cap_iqr___gt: " + GraphQLRequestSerializer.getEntry(cap_iqr___gt));
        }
        if (cap_iqr___gte != null) {
            joiner.add("cap_iqr___gte: " + GraphQLRequestSerializer.getEntry(cap_iqr___gte));
        }
        if (cap_mediano___eq != null) {
            joiner.add("cap_mediano___eq: " + GraphQLRequestSerializer.getEntry(cap_mediano___eq));
        }
        if (cap_mediano___ne != null) {
            joiner.add("cap_mediano___ne: " + GraphQLRequestSerializer.getEntry(cap_mediano___ne));
        }
        if (cap_mediano___null != null) {
            joiner.add("cap_mediano___null: " + GraphQLRequestSerializer.getEntry(cap_mediano___null));
        }
        if (cap_mediano___not___null != null) {
            joiner.add("cap_mediano___not___null: " + GraphQLRequestSerializer.getEntry(cap_mediano___not___null));
        }
        if (cap_mediano___in != null) {
            joiner.add("cap_mediano___in: " + GraphQLRequestSerializer.getEntry(cap_mediano___in));
        }
        if (cap_mediano___not___in != null) {
            joiner.add("cap_mediano___not___in: " + GraphQLRequestSerializer.getEntry(cap_mediano___not___in));
        }
        if (cap_mediano___lt != null) {
            joiner.add("cap_mediano___lt: " + GraphQLRequestSerializer.getEntry(cap_mediano___lt));
        }
        if (cap_mediano___lte != null) {
            joiner.add("cap_mediano___lte: " + GraphQLRequestSerializer.getEntry(cap_mediano___lte));
        }
        if (cap_mediano___gt != null) {
            joiner.add("cap_mediano___gt: " + GraphQLRequestSerializer.getEntry(cap_mediano___gt));
        }
        if (cap_mediano___gte != null) {
            joiner.add("cap_mediano___gte: " + GraphQLRequestSerializer.getEntry(cap_mediano___gte));
        }
        if (classe_rischio_hpv___eq != null) {
            joiner.add("classe_rischio_hpv___eq: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___eq));
        }
        if (classe_rischio_hpv___ne != null) {
            joiner.add("classe_rischio_hpv___ne: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___ne));
        }
        if (classe_rischio_hpv___null != null) {
            joiner.add("classe_rischio_hpv___null: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___null));
        }
        if (classe_rischio_hpv___not___null != null) {
            joiner.add("classe_rischio_hpv___not___null: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___not___null));
        }
        if (classe_rischio_hpv___in != null) {
            joiner.add("classe_rischio_hpv___in: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___in));
        }
        if (classe_rischio_hpv___not___in != null) {
            joiner.add("classe_rischio_hpv___not___in: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___not___in));
        }
        if (classe_rischio_hpv___lt != null) {
            joiner.add("classe_rischio_hpv___lt: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___lt));
        }
        if (classe_rischio_hpv___lte != null) {
            joiner.add("classe_rischio_hpv___lte: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___lte));
        }
        if (classe_rischio_hpv___gt != null) {
            joiner.add("classe_rischio_hpv___gt: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___gt));
        }
        if (classe_rischio_hpv___gte != null) {
            joiner.add("classe_rischio_hpv___gte: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___gte));
        }
        if (classe_rischio_hpv___contains != null) {
            joiner.add("classe_rischio_hpv___contains: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___contains));
        }
        if (classe_rischio_hpv___not___contains != null) {
            joiner.add("classe_rischio_hpv___not___contains: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___not___contains));
        }
        if (classe_rischio_hpv___starts_with != null) {
            joiner.add("classe_rischio_hpv___starts_with: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___starts_with));
        }
        if (classe_rischio_hpv___not___starts_with != null) {
            joiner.add("classe_rischio_hpv___not___starts_with: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___not___starts_with));
        }
        if (classe_rischio_hpv___ends_with != null) {
            joiner.add("classe_rischio_hpv___ends_with: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___ends_with));
        }
        if (classe_rischio_hpv___not___ends_with != null) {
            joiner.add("classe_rischio_hpv___not___ends_with: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv___not___ends_with));
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
        if (esame___eq != null) {
            joiner.add("esame___eq: " + GraphQLRequestSerializer.getEntry(esame___eq));
        }
        if (esame___ne != null) {
            joiner.add("esame___ne: " + GraphQLRequestSerializer.getEntry(esame___ne));
        }
        if (esame___null != null) {
            joiner.add("esame___null: " + GraphQLRequestSerializer.getEntry(esame___null));
        }
        if (esame___not___null != null) {
            joiner.add("esame___not___null: " + GraphQLRequestSerializer.getEntry(esame___not___null));
        }
        if (esame___in != null) {
            joiner.add("esame___in: " + GraphQLRequestSerializer.getEntry(esame___in));
        }
        if (esame___not___in != null) {
            joiner.add("esame___not___in: " + GraphQLRequestSerializer.getEntry(esame___not___in));
        }
        if (esame___lt != null) {
            joiner.add("esame___lt: " + GraphQLRequestSerializer.getEntry(esame___lt));
        }
        if (esame___lte != null) {
            joiner.add("esame___lte: " + GraphQLRequestSerializer.getEntry(esame___lte));
        }
        if (esame___gt != null) {
            joiner.add("esame___gt: " + GraphQLRequestSerializer.getEntry(esame___gt));
        }
        if (esame___gte != null) {
            joiner.add("esame___gte: " + GraphQLRequestSerializer.getEntry(esame___gte));
        }
        if (esame___contains != null) {
            joiner.add("esame___contains: " + GraphQLRequestSerializer.getEntry(esame___contains));
        }
        if (esame___not___contains != null) {
            joiner.add("esame___not___contains: " + GraphQLRequestSerializer.getEntry(esame___not___contains));
        }
        if (esame___starts_with != null) {
            joiner.add("esame___starts_with: " + GraphQLRequestSerializer.getEntry(esame___starts_with));
        }
        if (esame___not___starts_with != null) {
            joiner.add("esame___not___starts_with: " + GraphQLRequestSerializer.getEntry(esame___not___starts_with));
        }
        if (esame___ends_with != null) {
            joiner.add("esame___ends_with: " + GraphQLRequestSerializer.getEntry(esame___ends_with));
        }
        if (esame___not___ends_with != null) {
            joiner.add("esame___not___ends_with: " + GraphQLRequestSerializer.getEntry(esame___not___ends_with));
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
        if (genotipi_hpv___eq != null) {
            joiner.add("genotipi_hpv___eq: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___eq));
        }
        if (genotipi_hpv___ne != null) {
            joiner.add("genotipi_hpv___ne: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___ne));
        }
        if (genotipi_hpv___null != null) {
            joiner.add("genotipi_hpv___null: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___null));
        }
        if (genotipi_hpv___not___null != null) {
            joiner.add("genotipi_hpv___not___null: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___not___null));
        }
        if (genotipi_hpv___in != null) {
            joiner.add("genotipi_hpv___in: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___in));
        }
        if (genotipi_hpv___not___in != null) {
            joiner.add("genotipi_hpv___not___in: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___not___in));
        }
        if (genotipi_hpv___lt != null) {
            joiner.add("genotipi_hpv___lt: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___lt));
        }
        if (genotipi_hpv___lte != null) {
            joiner.add("genotipi_hpv___lte: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___lte));
        }
        if (genotipi_hpv___gt != null) {
            joiner.add("genotipi_hpv___gt: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___gt));
        }
        if (genotipi_hpv___gte != null) {
            joiner.add("genotipi_hpv___gte: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___gte));
        }
        if (genotipi_hpv___contains != null) {
            joiner.add("genotipi_hpv___contains: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___contains));
        }
        if (genotipi_hpv___not___contains != null) {
            joiner.add("genotipi_hpv___not___contains: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___not___contains));
        }
        if (genotipi_hpv___starts_with != null) {
            joiner.add("genotipi_hpv___starts_with: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___starts_with));
        }
        if (genotipi_hpv___not___starts_with != null) {
            joiner.add("genotipi_hpv___not___starts_with: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___not___starts_with));
        }
        if (genotipi_hpv___ends_with != null) {
            joiner.add("genotipi_hpv___ends_with: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___ends_with));
        }
        if (genotipi_hpv___not___ends_with != null) {
            joiner.add("genotipi_hpv___not___ends_with: " + GraphQLRequestSerializer.getEntry(genotipi_hpv___not___ends_with));
        }
        if (i_paziente___eq != null) {
            joiner.add("i_paziente___eq: " + GraphQLRequestSerializer.getEntry(i_paziente___eq));
        }
        if (i_paziente___ne != null) {
            joiner.add("i_paziente___ne: " + GraphQLRequestSerializer.getEntry(i_paziente___ne));
        }
        if (i_paziente___null != null) {
            joiner.add("i_paziente___null: " + GraphQLRequestSerializer.getEntry(i_paziente___null));
        }
        if (i_paziente___not___null != null) {
            joiner.add("i_paziente___not___null: " + GraphQLRequestSerializer.getEntry(i_paziente___not___null));
        }
        if (i_paziente___in != null) {
            joiner.add("i_paziente___in: " + GraphQLRequestSerializer.getEntry(i_paziente___in));
        }
        if (i_paziente___not___in != null) {
            joiner.add("i_paziente___not___in: " + GraphQLRequestSerializer.getEntry(i_paziente___not___in));
        }
        if (i_paziente___lt != null) {
            joiner.add("i_paziente___lt: " + GraphQLRequestSerializer.getEntry(i_paziente___lt));
        }
        if (i_paziente___lte != null) {
            joiner.add("i_paziente___lte: " + GraphQLRequestSerializer.getEntry(i_paziente___lte));
        }
        if (i_paziente___gt != null) {
            joiner.add("i_paziente___gt: " + GraphQLRequestSerializer.getEntry(i_paziente___gt));
        }
        if (i_paziente___gte != null) {
            joiner.add("i_paziente___gte: " + GraphQLRequestSerializer.getEntry(i_paziente___gte));
        }
        if (metavir___eq != null) {
            joiner.add("metavir___eq: " + GraphQLRequestSerializer.getEntry(metavir___eq));
        }
        if (metavir___ne != null) {
            joiner.add("metavir___ne: " + GraphQLRequestSerializer.getEntry(metavir___ne));
        }
        if (metavir___null != null) {
            joiner.add("metavir___null: " + GraphQLRequestSerializer.getEntry(metavir___null));
        }
        if (metavir___not___null != null) {
            joiner.add("metavir___not___null: " + GraphQLRequestSerializer.getEntry(metavir___not___null));
        }
        if (metavir___in != null) {
            joiner.add("metavir___in: " + GraphQLRequestSerializer.getEntry(metavir___in));
        }
        if (metavir___not___in != null) {
            joiner.add("metavir___not___in: " + GraphQLRequestSerializer.getEntry(metavir___not___in));
        }
        if (metavir___lt != null) {
            joiner.add("metavir___lt: " + GraphQLRequestSerializer.getEntry(metavir___lt));
        }
        if (metavir___lte != null) {
            joiner.add("metavir___lte: " + GraphQLRequestSerializer.getEntry(metavir___lte));
        }
        if (metavir___gt != null) {
            joiner.add("metavir___gt: " + GraphQLRequestSerializer.getEntry(metavir___gt));
        }
        if (metavir___gte != null) {
            joiner.add("metavir___gte: " + GraphQLRequestSerializer.getEntry(metavir___gte));
        }
        if (metavir___contains != null) {
            joiner.add("metavir___contains: " + GraphQLRequestSerializer.getEntry(metavir___contains));
        }
        if (metavir___not___contains != null) {
            joiner.add("metavir___not___contains: " + GraphQLRequestSerializer.getEntry(metavir___not___contains));
        }
        if (metavir___starts_with != null) {
            joiner.add("metavir___starts_with: " + GraphQLRequestSerializer.getEntry(metavir___starts_with));
        }
        if (metavir___not___starts_with != null) {
            joiner.add("metavir___not___starts_with: " + GraphQLRequestSerializer.getEntry(metavir___not___starts_with));
        }
        if (metavir___ends_with != null) {
            joiner.add("metavir___ends_with: " + GraphQLRequestSerializer.getEntry(metavir___ends_with));
        }
        if (metavir___not___ends_with != null) {
            joiner.add("metavir___not___ends_with: " + GraphQLRequestSerializer.getEntry(metavir___not___ends_with));
        }
        if (patologico___eq != null) {
            joiner.add("patologico___eq: " + GraphQLRequestSerializer.getEntry(patologico___eq));
        }
        if (patologico___ne != null) {
            joiner.add("patologico___ne: " + GraphQLRequestSerializer.getEntry(patologico___ne));
        }
        if (patologico___null != null) {
            joiner.add("patologico___null: " + GraphQLRequestSerializer.getEntry(patologico___null));
        }
        if (patologico___not___null != null) {
            joiner.add("patologico___not___null: " + GraphQLRequestSerializer.getEntry(patologico___not___null));
        }
        if (paziente_ok___eq != null) {
            joiner.add("paziente_ok___eq: " + GraphQLRequestSerializer.getEntry(paziente_ok___eq));
        }
        if (paziente_ok___ne != null) {
            joiner.add("paziente_ok___ne: " + GraphQLRequestSerializer.getEntry(paziente_ok___ne));
        }
        if (paziente_ok___null != null) {
            joiner.add("paziente_ok___null: " + GraphQLRequestSerializer.getEntry(paziente_ok___null));
        }
        if (paziente_ok___not___null != null) {
            joiner.add("paziente_ok___not___null: " + GraphQLRequestSerializer.getEntry(paziente_ok___not___null));
        }
        if (paziente_ok___in != null) {
            joiner.add("paziente_ok___in: " + GraphQLRequestSerializer.getEntry(paziente_ok___in));
        }
        if (paziente_ok___not___in != null) {
            joiner.add("paziente_ok___not___in: " + GraphQLRequestSerializer.getEntry(paziente_ok___not___in));
        }
        if (paziente_ok___lt != null) {
            joiner.add("paziente_ok___lt: " + GraphQLRequestSerializer.getEntry(paziente_ok___lt));
        }
        if (paziente_ok___lte != null) {
            joiner.add("paziente_ok___lte: " + GraphQLRequestSerializer.getEntry(paziente_ok___lte));
        }
        if (paziente_ok___gt != null) {
            joiner.add("paziente_ok___gt: " + GraphQLRequestSerializer.getEntry(paziente_ok___gt));
        }
        if (paziente_ok___gte != null) {
            joiner.add("paziente_ok___gte: " + GraphQLRequestSerializer.getEntry(paziente_ok___gte));
        }
        if (stifness___eq != null) {
            joiner.add("stifness___eq: " + GraphQLRequestSerializer.getEntry(stifness___eq));
        }
        if (stifness___ne != null) {
            joiner.add("stifness___ne: " + GraphQLRequestSerializer.getEntry(stifness___ne));
        }
        if (stifness___null != null) {
            joiner.add("stifness___null: " + GraphQLRequestSerializer.getEntry(stifness___null));
        }
        if (stifness___not___null != null) {
            joiner.add("stifness___not___null: " + GraphQLRequestSerializer.getEntry(stifness___not___null));
        }
        if (stifness___in != null) {
            joiner.add("stifness___in: " + GraphQLRequestSerializer.getEntry(stifness___in));
        }
        if (stifness___not___in != null) {
            joiner.add("stifness___not___in: " + GraphQLRequestSerializer.getEntry(stifness___not___in));
        }
        if (stifness___lt != null) {
            joiner.add("stifness___lt: " + GraphQLRequestSerializer.getEntry(stifness___lt));
        }
        if (stifness___lte != null) {
            joiner.add("stifness___lte: " + GraphQLRequestSerializer.getEntry(stifness___lte));
        }
        if (stifness___gt != null) {
            joiner.add("stifness___gt: " + GraphQLRequestSerializer.getEntry(stifness___gt));
        }
        if (stifness___gte != null) {
            joiner.add("stifness___gte: " + GraphQLRequestSerializer.getEntry(stifness___gte));
        }
        if (success_rate___eq != null) {
            joiner.add("success_rate___eq: " + GraphQLRequestSerializer.getEntry(success_rate___eq));
        }
        if (success_rate___ne != null) {
            joiner.add("success_rate___ne: " + GraphQLRequestSerializer.getEntry(success_rate___ne));
        }
        if (success_rate___null != null) {
            joiner.add("success_rate___null: " + GraphQLRequestSerializer.getEntry(success_rate___null));
        }
        if (success_rate___not___null != null) {
            joiner.add("success_rate___not___null: " + GraphQLRequestSerializer.getEntry(success_rate___not___null));
        }
        if (success_rate___in != null) {
            joiner.add("success_rate___in: " + GraphQLRequestSerializer.getEntry(success_rate___in));
        }
        if (success_rate___not___in != null) {
            joiner.add("success_rate___not___in: " + GraphQLRequestSerializer.getEntry(success_rate___not___in));
        }
        if (success_rate___lt != null) {
            joiner.add("success_rate___lt: " + GraphQLRequestSerializer.getEntry(success_rate___lt));
        }
        if (success_rate___lte != null) {
            joiner.add("success_rate___lte: " + GraphQLRequestSerializer.getEntry(success_rate___lte));
        }
        if (success_rate___gt != null) {
            joiner.add("success_rate___gt: " + GraphQLRequestSerializer.getEntry(success_rate___gt));
        }
        if (success_rate___gte != null) {
            joiner.add("success_rate___gte: " + GraphQLRequestSerializer.getEntry(success_rate___gte));
        }
        if (t_score_colonna___eq != null) {
            joiner.add("t_score_colonna___eq: " + GraphQLRequestSerializer.getEntry(t_score_colonna___eq));
        }
        if (t_score_colonna___ne != null) {
            joiner.add("t_score_colonna___ne: " + GraphQLRequestSerializer.getEntry(t_score_colonna___ne));
        }
        if (t_score_colonna___null != null) {
            joiner.add("t_score_colonna___null: " + GraphQLRequestSerializer.getEntry(t_score_colonna___null));
        }
        if (t_score_colonna___not___null != null) {
            joiner.add("t_score_colonna___not___null: " + GraphQLRequestSerializer.getEntry(t_score_colonna___not___null));
        }
        if (t_score_colonna___in != null) {
            joiner.add("t_score_colonna___in: " + GraphQLRequestSerializer.getEntry(t_score_colonna___in));
        }
        if (t_score_colonna___not___in != null) {
            joiner.add("t_score_colonna___not___in: " + GraphQLRequestSerializer.getEntry(t_score_colonna___not___in));
        }
        if (t_score_colonna___lt != null) {
            joiner.add("t_score_colonna___lt: " + GraphQLRequestSerializer.getEntry(t_score_colonna___lt));
        }
        if (t_score_colonna___lte != null) {
            joiner.add("t_score_colonna___lte: " + GraphQLRequestSerializer.getEntry(t_score_colonna___lte));
        }
        if (t_score_colonna___gt != null) {
            joiner.add("t_score_colonna___gt: " + GraphQLRequestSerializer.getEntry(t_score_colonna___gt));
        }
        if (t_score_colonna___gte != null) {
            joiner.add("t_score_colonna___gte: " + GraphQLRequestSerializer.getEntry(t_score_colonna___gte));
        }
        if (t_score_femore___eq != null) {
            joiner.add("t_score_femore___eq: " + GraphQLRequestSerializer.getEntry(t_score_femore___eq));
        }
        if (t_score_femore___ne != null) {
            joiner.add("t_score_femore___ne: " + GraphQLRequestSerializer.getEntry(t_score_femore___ne));
        }
        if (t_score_femore___null != null) {
            joiner.add("t_score_femore___null: " + GraphQLRequestSerializer.getEntry(t_score_femore___null));
        }
        if (t_score_femore___not___null != null) {
            joiner.add("t_score_femore___not___null: " + GraphQLRequestSerializer.getEntry(t_score_femore___not___null));
        }
        if (t_score_femore___in != null) {
            joiner.add("t_score_femore___in: " + GraphQLRequestSerializer.getEntry(t_score_femore___in));
        }
        if (t_score_femore___not___in != null) {
            joiner.add("t_score_femore___not___in: " + GraphQLRequestSerializer.getEntry(t_score_femore___not___in));
        }
        if (t_score_femore___lt != null) {
            joiner.add("t_score_femore___lt: " + GraphQLRequestSerializer.getEntry(t_score_femore___lt));
        }
        if (t_score_femore___lte != null) {
            joiner.add("t_score_femore___lte: " + GraphQLRequestSerializer.getEntry(t_score_femore___lte));
        }
        if (t_score_femore___gt != null) {
            joiner.add("t_score_femore___gt: " + GraphQLRequestSerializer.getEntry(t_score_femore___gt));
        }
        if (t_score_femore___gte != null) {
            joiner.add("t_score_femore___gte: " + GraphQLRequestSerializer.getEntry(t_score_femore___gte));
        }
        if (z_score_colonna___eq != null) {
            joiner.add("z_score_colonna___eq: " + GraphQLRequestSerializer.getEntry(z_score_colonna___eq));
        }
        if (z_score_colonna___ne != null) {
            joiner.add("z_score_colonna___ne: " + GraphQLRequestSerializer.getEntry(z_score_colonna___ne));
        }
        if (z_score_colonna___null != null) {
            joiner.add("z_score_colonna___null: " + GraphQLRequestSerializer.getEntry(z_score_colonna___null));
        }
        if (z_score_colonna___not___null != null) {
            joiner.add("z_score_colonna___not___null: " + GraphQLRequestSerializer.getEntry(z_score_colonna___not___null));
        }
        if (z_score_colonna___in != null) {
            joiner.add("z_score_colonna___in: " + GraphQLRequestSerializer.getEntry(z_score_colonna___in));
        }
        if (z_score_colonna___not___in != null) {
            joiner.add("z_score_colonna___not___in: " + GraphQLRequestSerializer.getEntry(z_score_colonna___not___in));
        }
        if (z_score_colonna___lt != null) {
            joiner.add("z_score_colonna___lt: " + GraphQLRequestSerializer.getEntry(z_score_colonna___lt));
        }
        if (z_score_colonna___lte != null) {
            joiner.add("z_score_colonna___lte: " + GraphQLRequestSerializer.getEntry(z_score_colonna___lte));
        }
        if (z_score_colonna___gt != null) {
            joiner.add("z_score_colonna___gt: " + GraphQLRequestSerializer.getEntry(z_score_colonna___gt));
        }
        if (z_score_colonna___gte != null) {
            joiner.add("z_score_colonna___gte: " + GraphQLRequestSerializer.getEntry(z_score_colonna___gte));
        }
        if (z_score_femore___eq != null) {
            joiner.add("z_score_femore___eq: " + GraphQLRequestSerializer.getEntry(z_score_femore___eq));
        }
        if (z_score_femore___ne != null) {
            joiner.add("z_score_femore___ne: " + GraphQLRequestSerializer.getEntry(z_score_femore___ne));
        }
        if (z_score_femore___null != null) {
            joiner.add("z_score_femore___null: " + GraphQLRequestSerializer.getEntry(z_score_femore___null));
        }
        if (z_score_femore___not___null != null) {
            joiner.add("z_score_femore___not___null: " + GraphQLRequestSerializer.getEntry(z_score_femore___not___null));
        }
        if (z_score_femore___in != null) {
            joiner.add("z_score_femore___in: " + GraphQLRequestSerializer.getEntry(z_score_femore___in));
        }
        if (z_score_femore___not___in != null) {
            joiner.add("z_score_femore___not___in: " + GraphQLRequestSerializer.getEntry(z_score_femore___not___in));
        }
        if (z_score_femore___lt != null) {
            joiner.add("z_score_femore___lt: " + GraphQLRequestSerializer.getEntry(z_score_femore___lt));
        }
        if (z_score_femore___lte != null) {
            joiner.add("z_score_femore___lte: " + GraphQLRequestSerializer.getEntry(z_score_femore___lte));
        }
        if (z_score_femore___gt != null) {
            joiner.add("z_score_femore___gt: " + GraphQLRequestSerializer.getEntry(z_score_femore___gt));
        }
        if (z_score_femore___gte != null) {
            joiner.add("z_score_femore___gte: " + GraphQLRequestSerializer.getEntry(z_score_femore___gte));
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

    public static CliEsame_strumentaleFilterDTO.Builder builder() {
        return new CliEsame_strumentaleFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId___eq;
        private String IQR___eq;
        private String IQR___ne;
        private Boolean IQR___null;
        private Boolean IQR___not___null;
        private java.util.List<String> IQR___in;
        private java.util.List<String> IQR___not___in;
        private String IQR___lt;
        private String IQR___lte;
        private String IQR___gt;
        private String IQR___gte;
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
        private String altro_esame___eq;
        private String altro_esame___ne;
        private Boolean altro_esame___null;
        private Boolean altro_esame___not___null;
        private java.util.List<String> altro_esame___in;
        private java.util.List<String> altro_esame___not___in;
        private String altro_esame___lt;
        private String altro_esame___lte;
        private String altro_esame___gt;
        private String altro_esame___gte;
        private String altro_esame___contains;
        private String altro_esame___not___contains;
        private String altro_esame___starts_with;
        private String altro_esame___not___starts_with;
        private String altro_esame___ends_with;
        private String altro_esame___not___ends_with;
        private String bmd_colonna___eq;
        private String bmd_colonna___ne;
        private Boolean bmd_colonna___null;
        private Boolean bmd_colonna___not___null;
        private java.util.List<String> bmd_colonna___in;
        private java.util.List<String> bmd_colonna___not___in;
        private String bmd_colonna___lt;
        private String bmd_colonna___lte;
        private String bmd_colonna___gt;
        private String bmd_colonna___gte;
        private String bmd_femore___eq;
        private String bmd_femore___ne;
        private Boolean bmd_femore___null;
        private Boolean bmd_femore___not___null;
        private java.util.List<String> bmd_femore___in;
        private java.util.List<String> bmd_femore___not___in;
        private String bmd_femore___lt;
        private String bmd_femore___lte;
        private String bmd_femore___gt;
        private String bmd_femore___gte;
        private Integer cap_iqr___eq;
        private Integer cap_iqr___ne;
        private Boolean cap_iqr___null;
        private Boolean cap_iqr___not___null;
        private java.util.List<Integer> cap_iqr___in;
        private java.util.List<Integer> cap_iqr___not___in;
        private Integer cap_iqr___lt;
        private Integer cap_iqr___lte;
        private Integer cap_iqr___gt;
        private Integer cap_iqr___gte;
        private Integer cap_mediano___eq;
        private Integer cap_mediano___ne;
        private Boolean cap_mediano___null;
        private Boolean cap_mediano___not___null;
        private java.util.List<Integer> cap_mediano___in;
        private java.util.List<Integer> cap_mediano___not___in;
        private Integer cap_mediano___lt;
        private Integer cap_mediano___lte;
        private Integer cap_mediano___gt;
        private Integer cap_mediano___gte;
        private String classe_rischio_hpv___eq;
        private String classe_rischio_hpv___ne;
        private Boolean classe_rischio_hpv___null;
        private Boolean classe_rischio_hpv___not___null;
        private java.util.List<String> classe_rischio_hpv___in;
        private java.util.List<String> classe_rischio_hpv___not___in;
        private String classe_rischio_hpv___lt;
        private String classe_rischio_hpv___lte;
        private String classe_rischio_hpv___gt;
        private String classe_rischio_hpv___gte;
        private String classe_rischio_hpv___contains;
        private String classe_rischio_hpv___not___contains;
        private String classe_rischio_hpv___starts_with;
        private String classe_rischio_hpv___not___starts_with;
        private String classe_rischio_hpv___ends_with;
        private String classe_rischio_hpv___not___ends_with;
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
        private String esame___eq;
        private String esame___ne;
        private Boolean esame___null;
        private Boolean esame___not___null;
        private java.util.List<String> esame___in;
        private java.util.List<String> esame___not___in;
        private String esame___lt;
        private String esame___lte;
        private String esame___gt;
        private String esame___gte;
        private String esame___contains;
        private String esame___not___contains;
        private String esame___starts_with;
        private String esame___not___starts_with;
        private String esame___ends_with;
        private String esame___not___ends_with;
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
        private String genotipi_hpv___eq;
        private String genotipi_hpv___ne;
        private Boolean genotipi_hpv___null;
        private Boolean genotipi_hpv___not___null;
        private java.util.List<String> genotipi_hpv___in;
        private java.util.List<String> genotipi_hpv___not___in;
        private String genotipi_hpv___lt;
        private String genotipi_hpv___lte;
        private String genotipi_hpv___gt;
        private String genotipi_hpv___gte;
        private String genotipi_hpv___contains;
        private String genotipi_hpv___not___contains;
        private String genotipi_hpv___starts_with;
        private String genotipi_hpv___not___starts_with;
        private String genotipi_hpv___ends_with;
        private String genotipi_hpv___not___ends_with;
        private Integer i_paziente___eq;
        private Integer i_paziente___ne;
        private Boolean i_paziente___null;
        private Boolean i_paziente___not___null;
        private java.util.List<Integer> i_paziente___in;
        private java.util.List<Integer> i_paziente___not___in;
        private Integer i_paziente___lt;
        private Integer i_paziente___lte;
        private Integer i_paziente___gt;
        private Integer i_paziente___gte;
        private String metavir___eq;
        private String metavir___ne;
        private Boolean metavir___null;
        private Boolean metavir___not___null;
        private java.util.List<String> metavir___in;
        private java.util.List<String> metavir___not___in;
        private String metavir___lt;
        private String metavir___lte;
        private String metavir___gt;
        private String metavir___gte;
        private String metavir___contains;
        private String metavir___not___contains;
        private String metavir___starts_with;
        private String metavir___not___starts_with;
        private String metavir___ends_with;
        private String metavir___not___ends_with;
        private Boolean patologico___eq;
        private Boolean patologico___ne;
        private Boolean patologico___null;
        private Boolean patologico___not___null;
        private Integer paziente_ok___eq;
        private Integer paziente_ok___ne;
        private Boolean paziente_ok___null;
        private Boolean paziente_ok___not___null;
        private java.util.List<Integer> paziente_ok___in;
        private java.util.List<Integer> paziente_ok___not___in;
        private Integer paziente_ok___lt;
        private Integer paziente_ok___lte;
        private Integer paziente_ok___gt;
        private Integer paziente_ok___gte;
        private String stifness___eq;
        private String stifness___ne;
        private Boolean stifness___null;
        private Boolean stifness___not___null;
        private java.util.List<String> stifness___in;
        private java.util.List<String> stifness___not___in;
        private String stifness___lt;
        private String stifness___lte;
        private String stifness___gt;
        private String stifness___gte;
        private String success_rate___eq;
        private String success_rate___ne;
        private Boolean success_rate___null;
        private Boolean success_rate___not___null;
        private java.util.List<String> success_rate___in;
        private java.util.List<String> success_rate___not___in;
        private String success_rate___lt;
        private String success_rate___lte;
        private String success_rate___gt;
        private String success_rate___gte;
        private String t_score_colonna___eq;
        private String t_score_colonna___ne;
        private Boolean t_score_colonna___null;
        private Boolean t_score_colonna___not___null;
        private java.util.List<String> t_score_colonna___in;
        private java.util.List<String> t_score_colonna___not___in;
        private String t_score_colonna___lt;
        private String t_score_colonna___lte;
        private String t_score_colonna___gt;
        private String t_score_colonna___gte;
        private String t_score_femore___eq;
        private String t_score_femore___ne;
        private Boolean t_score_femore___null;
        private Boolean t_score_femore___not___null;
        private java.util.List<String> t_score_femore___in;
        private java.util.List<String> t_score_femore___not___in;
        private String t_score_femore___lt;
        private String t_score_femore___lte;
        private String t_score_femore___gt;
        private String t_score_femore___gte;
        private String z_score_colonna___eq;
        private String z_score_colonna___ne;
        private Boolean z_score_colonna___null;
        private Boolean z_score_colonna___not___null;
        private java.util.List<String> z_score_colonna___in;
        private java.util.List<String> z_score_colonna___not___in;
        private String z_score_colonna___lt;
        private String z_score_colonna___lte;
        private String z_score_colonna___gt;
        private String z_score_colonna___gte;
        private String z_score_femore___eq;
        private String z_score_femore___ne;
        private Boolean z_score_femore___null;
        private Boolean z_score_femore___not___null;
        private java.util.List<String> z_score_femore___in;
        private java.util.List<String> z_score_femore___not___in;
        private String z_score_femore___lt;
        private String z_score_femore___lte;
        private String z_score_femore___gt;
        private String z_score_femore___gte;
        private java.util.List<CliEsame_strumentaleFilterDTO> AND;
        private java.util.List<CliEsame_strumentaleFilterDTO> OR;
        private CliEsame_strumentaleFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
            return this;
        }

        public Builder setIQR___eq(String IQR___eq) {
            this.IQR___eq = IQR___eq;
            return this;
        }

        public Builder setIQR___ne(String IQR___ne) {
            this.IQR___ne = IQR___ne;
            return this;
        }

        public Builder setIQR___null(Boolean IQR___null) {
            this.IQR___null = IQR___null;
            return this;
        }

        public Builder setIQR___not___null(Boolean IQR___not___null) {
            this.IQR___not___null = IQR___not___null;
            return this;
        }

        public Builder setIQR___in(java.util.List<String> IQR___in) {
            this.IQR___in = IQR___in;
            return this;
        }

        public Builder setIQR___not___in(java.util.List<String> IQR___not___in) {
            this.IQR___not___in = IQR___not___in;
            return this;
        }

        public Builder setIQR___lt(String IQR___lt) {
            this.IQR___lt = IQR___lt;
            return this;
        }

        public Builder setIQR___lte(String IQR___lte) {
            this.IQR___lte = IQR___lte;
            return this;
        }

        public Builder setIQR___gt(String IQR___gt) {
            this.IQR___gt = IQR___gt;
            return this;
        }

        public Builder setIQR___gte(String IQR___gte) {
            this.IQR___gte = IQR___gte;
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

        public Builder setAltro_esame___eq(String altro_esame___eq) {
            this.altro_esame___eq = altro_esame___eq;
            return this;
        }

        public Builder setAltro_esame___ne(String altro_esame___ne) {
            this.altro_esame___ne = altro_esame___ne;
            return this;
        }

        public Builder setAltro_esame___null(Boolean altro_esame___null) {
            this.altro_esame___null = altro_esame___null;
            return this;
        }

        public Builder setAltro_esame___not___null(Boolean altro_esame___not___null) {
            this.altro_esame___not___null = altro_esame___not___null;
            return this;
        }

        public Builder setAltro_esame___in(java.util.List<String> altro_esame___in) {
            this.altro_esame___in = altro_esame___in;
            return this;
        }

        public Builder setAltro_esame___not___in(java.util.List<String> altro_esame___not___in) {
            this.altro_esame___not___in = altro_esame___not___in;
            return this;
        }

        public Builder setAltro_esame___lt(String altro_esame___lt) {
            this.altro_esame___lt = altro_esame___lt;
            return this;
        }

        public Builder setAltro_esame___lte(String altro_esame___lte) {
            this.altro_esame___lte = altro_esame___lte;
            return this;
        }

        public Builder setAltro_esame___gt(String altro_esame___gt) {
            this.altro_esame___gt = altro_esame___gt;
            return this;
        }

        public Builder setAltro_esame___gte(String altro_esame___gte) {
            this.altro_esame___gte = altro_esame___gte;
            return this;
        }

        public Builder setAltro_esame___contains(String altro_esame___contains) {
            this.altro_esame___contains = altro_esame___contains;
            return this;
        }

        public Builder setAltro_esame___not___contains(String altro_esame___not___contains) {
            this.altro_esame___not___contains = altro_esame___not___contains;
            return this;
        }

        public Builder setAltro_esame___starts_with(String altro_esame___starts_with) {
            this.altro_esame___starts_with = altro_esame___starts_with;
            return this;
        }

        public Builder setAltro_esame___not___starts_with(String altro_esame___not___starts_with) {
            this.altro_esame___not___starts_with = altro_esame___not___starts_with;
            return this;
        }

        public Builder setAltro_esame___ends_with(String altro_esame___ends_with) {
            this.altro_esame___ends_with = altro_esame___ends_with;
            return this;
        }

        public Builder setAltro_esame___not___ends_with(String altro_esame___not___ends_with) {
            this.altro_esame___not___ends_with = altro_esame___not___ends_with;
            return this;
        }

        public Builder setBmd_colonna___eq(String bmd_colonna___eq) {
            this.bmd_colonna___eq = bmd_colonna___eq;
            return this;
        }

        public Builder setBmd_colonna___ne(String bmd_colonna___ne) {
            this.bmd_colonna___ne = bmd_colonna___ne;
            return this;
        }

        public Builder setBmd_colonna___null(Boolean bmd_colonna___null) {
            this.bmd_colonna___null = bmd_colonna___null;
            return this;
        }

        public Builder setBmd_colonna___not___null(Boolean bmd_colonna___not___null) {
            this.bmd_colonna___not___null = bmd_colonna___not___null;
            return this;
        }

        public Builder setBmd_colonna___in(java.util.List<String> bmd_colonna___in) {
            this.bmd_colonna___in = bmd_colonna___in;
            return this;
        }

        public Builder setBmd_colonna___not___in(java.util.List<String> bmd_colonna___not___in) {
            this.bmd_colonna___not___in = bmd_colonna___not___in;
            return this;
        }

        public Builder setBmd_colonna___lt(String bmd_colonna___lt) {
            this.bmd_colonna___lt = bmd_colonna___lt;
            return this;
        }

        public Builder setBmd_colonna___lte(String bmd_colonna___lte) {
            this.bmd_colonna___lte = bmd_colonna___lte;
            return this;
        }

        public Builder setBmd_colonna___gt(String bmd_colonna___gt) {
            this.bmd_colonna___gt = bmd_colonna___gt;
            return this;
        }

        public Builder setBmd_colonna___gte(String bmd_colonna___gte) {
            this.bmd_colonna___gte = bmd_colonna___gte;
            return this;
        }

        public Builder setBmd_femore___eq(String bmd_femore___eq) {
            this.bmd_femore___eq = bmd_femore___eq;
            return this;
        }

        public Builder setBmd_femore___ne(String bmd_femore___ne) {
            this.bmd_femore___ne = bmd_femore___ne;
            return this;
        }

        public Builder setBmd_femore___null(Boolean bmd_femore___null) {
            this.bmd_femore___null = bmd_femore___null;
            return this;
        }

        public Builder setBmd_femore___not___null(Boolean bmd_femore___not___null) {
            this.bmd_femore___not___null = bmd_femore___not___null;
            return this;
        }

        public Builder setBmd_femore___in(java.util.List<String> bmd_femore___in) {
            this.bmd_femore___in = bmd_femore___in;
            return this;
        }

        public Builder setBmd_femore___not___in(java.util.List<String> bmd_femore___not___in) {
            this.bmd_femore___not___in = bmd_femore___not___in;
            return this;
        }

        public Builder setBmd_femore___lt(String bmd_femore___lt) {
            this.bmd_femore___lt = bmd_femore___lt;
            return this;
        }

        public Builder setBmd_femore___lte(String bmd_femore___lte) {
            this.bmd_femore___lte = bmd_femore___lte;
            return this;
        }

        public Builder setBmd_femore___gt(String bmd_femore___gt) {
            this.bmd_femore___gt = bmd_femore___gt;
            return this;
        }

        public Builder setBmd_femore___gte(String bmd_femore___gte) {
            this.bmd_femore___gte = bmd_femore___gte;
            return this;
        }

        public Builder setCap_iqr___eq(Integer cap_iqr___eq) {
            this.cap_iqr___eq = cap_iqr___eq;
            return this;
        }

        public Builder setCap_iqr___ne(Integer cap_iqr___ne) {
            this.cap_iqr___ne = cap_iqr___ne;
            return this;
        }

        public Builder setCap_iqr___null(Boolean cap_iqr___null) {
            this.cap_iqr___null = cap_iqr___null;
            return this;
        }

        public Builder setCap_iqr___not___null(Boolean cap_iqr___not___null) {
            this.cap_iqr___not___null = cap_iqr___not___null;
            return this;
        }

        public Builder setCap_iqr___in(java.util.List<Integer> cap_iqr___in) {
            this.cap_iqr___in = cap_iqr___in;
            return this;
        }

        public Builder setCap_iqr___not___in(java.util.List<Integer> cap_iqr___not___in) {
            this.cap_iqr___not___in = cap_iqr___not___in;
            return this;
        }

        public Builder setCap_iqr___lt(Integer cap_iqr___lt) {
            this.cap_iqr___lt = cap_iqr___lt;
            return this;
        }

        public Builder setCap_iqr___lte(Integer cap_iqr___lte) {
            this.cap_iqr___lte = cap_iqr___lte;
            return this;
        }

        public Builder setCap_iqr___gt(Integer cap_iqr___gt) {
            this.cap_iqr___gt = cap_iqr___gt;
            return this;
        }

        public Builder setCap_iqr___gte(Integer cap_iqr___gte) {
            this.cap_iqr___gte = cap_iqr___gte;
            return this;
        }

        public Builder setCap_mediano___eq(Integer cap_mediano___eq) {
            this.cap_mediano___eq = cap_mediano___eq;
            return this;
        }

        public Builder setCap_mediano___ne(Integer cap_mediano___ne) {
            this.cap_mediano___ne = cap_mediano___ne;
            return this;
        }

        public Builder setCap_mediano___null(Boolean cap_mediano___null) {
            this.cap_mediano___null = cap_mediano___null;
            return this;
        }

        public Builder setCap_mediano___not___null(Boolean cap_mediano___not___null) {
            this.cap_mediano___not___null = cap_mediano___not___null;
            return this;
        }

        public Builder setCap_mediano___in(java.util.List<Integer> cap_mediano___in) {
            this.cap_mediano___in = cap_mediano___in;
            return this;
        }

        public Builder setCap_mediano___not___in(java.util.List<Integer> cap_mediano___not___in) {
            this.cap_mediano___not___in = cap_mediano___not___in;
            return this;
        }

        public Builder setCap_mediano___lt(Integer cap_mediano___lt) {
            this.cap_mediano___lt = cap_mediano___lt;
            return this;
        }

        public Builder setCap_mediano___lte(Integer cap_mediano___lte) {
            this.cap_mediano___lte = cap_mediano___lte;
            return this;
        }

        public Builder setCap_mediano___gt(Integer cap_mediano___gt) {
            this.cap_mediano___gt = cap_mediano___gt;
            return this;
        }

        public Builder setCap_mediano___gte(Integer cap_mediano___gte) {
            this.cap_mediano___gte = cap_mediano___gte;
            return this;
        }

        public Builder setClasse_rischio_hpv___eq(String classe_rischio_hpv___eq) {
            this.classe_rischio_hpv___eq = classe_rischio_hpv___eq;
            return this;
        }

        public Builder setClasse_rischio_hpv___ne(String classe_rischio_hpv___ne) {
            this.classe_rischio_hpv___ne = classe_rischio_hpv___ne;
            return this;
        }

        public Builder setClasse_rischio_hpv___null(Boolean classe_rischio_hpv___null) {
            this.classe_rischio_hpv___null = classe_rischio_hpv___null;
            return this;
        }

        public Builder setClasse_rischio_hpv___not___null(Boolean classe_rischio_hpv___not___null) {
            this.classe_rischio_hpv___not___null = classe_rischio_hpv___not___null;
            return this;
        }

        public Builder setClasse_rischio_hpv___in(java.util.List<String> classe_rischio_hpv___in) {
            this.classe_rischio_hpv___in = classe_rischio_hpv___in;
            return this;
        }

        public Builder setClasse_rischio_hpv___not___in(java.util.List<String> classe_rischio_hpv___not___in) {
            this.classe_rischio_hpv___not___in = classe_rischio_hpv___not___in;
            return this;
        }

        public Builder setClasse_rischio_hpv___lt(String classe_rischio_hpv___lt) {
            this.classe_rischio_hpv___lt = classe_rischio_hpv___lt;
            return this;
        }

        public Builder setClasse_rischio_hpv___lte(String classe_rischio_hpv___lte) {
            this.classe_rischio_hpv___lte = classe_rischio_hpv___lte;
            return this;
        }

        public Builder setClasse_rischio_hpv___gt(String classe_rischio_hpv___gt) {
            this.classe_rischio_hpv___gt = classe_rischio_hpv___gt;
            return this;
        }

        public Builder setClasse_rischio_hpv___gte(String classe_rischio_hpv___gte) {
            this.classe_rischio_hpv___gte = classe_rischio_hpv___gte;
            return this;
        }

        public Builder setClasse_rischio_hpv___contains(String classe_rischio_hpv___contains) {
            this.classe_rischio_hpv___contains = classe_rischio_hpv___contains;
            return this;
        }

        public Builder setClasse_rischio_hpv___not___contains(String classe_rischio_hpv___not___contains) {
            this.classe_rischio_hpv___not___contains = classe_rischio_hpv___not___contains;
            return this;
        }

        public Builder setClasse_rischio_hpv___starts_with(String classe_rischio_hpv___starts_with) {
            this.classe_rischio_hpv___starts_with = classe_rischio_hpv___starts_with;
            return this;
        }

        public Builder setClasse_rischio_hpv___not___starts_with(String classe_rischio_hpv___not___starts_with) {
            this.classe_rischio_hpv___not___starts_with = classe_rischio_hpv___not___starts_with;
            return this;
        }

        public Builder setClasse_rischio_hpv___ends_with(String classe_rischio_hpv___ends_with) {
            this.classe_rischio_hpv___ends_with = classe_rischio_hpv___ends_with;
            return this;
        }

        public Builder setClasse_rischio_hpv___not___ends_with(String classe_rischio_hpv___not___ends_with) {
            this.classe_rischio_hpv___not___ends_with = classe_rischio_hpv___not___ends_with;
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

        public Builder setEsame___eq(String esame___eq) {
            this.esame___eq = esame___eq;
            return this;
        }

        public Builder setEsame___ne(String esame___ne) {
            this.esame___ne = esame___ne;
            return this;
        }

        public Builder setEsame___null(Boolean esame___null) {
            this.esame___null = esame___null;
            return this;
        }

        public Builder setEsame___not___null(Boolean esame___not___null) {
            this.esame___not___null = esame___not___null;
            return this;
        }

        public Builder setEsame___in(java.util.List<String> esame___in) {
            this.esame___in = esame___in;
            return this;
        }

        public Builder setEsame___not___in(java.util.List<String> esame___not___in) {
            this.esame___not___in = esame___not___in;
            return this;
        }

        public Builder setEsame___lt(String esame___lt) {
            this.esame___lt = esame___lt;
            return this;
        }

        public Builder setEsame___lte(String esame___lte) {
            this.esame___lte = esame___lte;
            return this;
        }

        public Builder setEsame___gt(String esame___gt) {
            this.esame___gt = esame___gt;
            return this;
        }

        public Builder setEsame___gte(String esame___gte) {
            this.esame___gte = esame___gte;
            return this;
        }

        public Builder setEsame___contains(String esame___contains) {
            this.esame___contains = esame___contains;
            return this;
        }

        public Builder setEsame___not___contains(String esame___not___contains) {
            this.esame___not___contains = esame___not___contains;
            return this;
        }

        public Builder setEsame___starts_with(String esame___starts_with) {
            this.esame___starts_with = esame___starts_with;
            return this;
        }

        public Builder setEsame___not___starts_with(String esame___not___starts_with) {
            this.esame___not___starts_with = esame___not___starts_with;
            return this;
        }

        public Builder setEsame___ends_with(String esame___ends_with) {
            this.esame___ends_with = esame___ends_with;
            return this;
        }

        public Builder setEsame___not___ends_with(String esame___not___ends_with) {
            this.esame___not___ends_with = esame___not___ends_with;
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

        public Builder setGenotipi_hpv___eq(String genotipi_hpv___eq) {
            this.genotipi_hpv___eq = genotipi_hpv___eq;
            return this;
        }

        public Builder setGenotipi_hpv___ne(String genotipi_hpv___ne) {
            this.genotipi_hpv___ne = genotipi_hpv___ne;
            return this;
        }

        public Builder setGenotipi_hpv___null(Boolean genotipi_hpv___null) {
            this.genotipi_hpv___null = genotipi_hpv___null;
            return this;
        }

        public Builder setGenotipi_hpv___not___null(Boolean genotipi_hpv___not___null) {
            this.genotipi_hpv___not___null = genotipi_hpv___not___null;
            return this;
        }

        public Builder setGenotipi_hpv___in(java.util.List<String> genotipi_hpv___in) {
            this.genotipi_hpv___in = genotipi_hpv___in;
            return this;
        }

        public Builder setGenotipi_hpv___not___in(java.util.List<String> genotipi_hpv___not___in) {
            this.genotipi_hpv___not___in = genotipi_hpv___not___in;
            return this;
        }

        public Builder setGenotipi_hpv___lt(String genotipi_hpv___lt) {
            this.genotipi_hpv___lt = genotipi_hpv___lt;
            return this;
        }

        public Builder setGenotipi_hpv___lte(String genotipi_hpv___lte) {
            this.genotipi_hpv___lte = genotipi_hpv___lte;
            return this;
        }

        public Builder setGenotipi_hpv___gt(String genotipi_hpv___gt) {
            this.genotipi_hpv___gt = genotipi_hpv___gt;
            return this;
        }

        public Builder setGenotipi_hpv___gte(String genotipi_hpv___gte) {
            this.genotipi_hpv___gte = genotipi_hpv___gte;
            return this;
        }

        public Builder setGenotipi_hpv___contains(String genotipi_hpv___contains) {
            this.genotipi_hpv___contains = genotipi_hpv___contains;
            return this;
        }

        public Builder setGenotipi_hpv___not___contains(String genotipi_hpv___not___contains) {
            this.genotipi_hpv___not___contains = genotipi_hpv___not___contains;
            return this;
        }

        public Builder setGenotipi_hpv___starts_with(String genotipi_hpv___starts_with) {
            this.genotipi_hpv___starts_with = genotipi_hpv___starts_with;
            return this;
        }

        public Builder setGenotipi_hpv___not___starts_with(String genotipi_hpv___not___starts_with) {
            this.genotipi_hpv___not___starts_with = genotipi_hpv___not___starts_with;
            return this;
        }

        public Builder setGenotipi_hpv___ends_with(String genotipi_hpv___ends_with) {
            this.genotipi_hpv___ends_with = genotipi_hpv___ends_with;
            return this;
        }

        public Builder setGenotipi_hpv___not___ends_with(String genotipi_hpv___not___ends_with) {
            this.genotipi_hpv___not___ends_with = genotipi_hpv___not___ends_with;
            return this;
        }

        public Builder setI_paziente___eq(Integer i_paziente___eq) {
            this.i_paziente___eq = i_paziente___eq;
            return this;
        }

        public Builder setI_paziente___ne(Integer i_paziente___ne) {
            this.i_paziente___ne = i_paziente___ne;
            return this;
        }

        public Builder setI_paziente___null(Boolean i_paziente___null) {
            this.i_paziente___null = i_paziente___null;
            return this;
        }

        public Builder setI_paziente___not___null(Boolean i_paziente___not___null) {
            this.i_paziente___not___null = i_paziente___not___null;
            return this;
        }

        public Builder setI_paziente___in(java.util.List<Integer> i_paziente___in) {
            this.i_paziente___in = i_paziente___in;
            return this;
        }

        public Builder setI_paziente___not___in(java.util.List<Integer> i_paziente___not___in) {
            this.i_paziente___not___in = i_paziente___not___in;
            return this;
        }

        public Builder setI_paziente___lt(Integer i_paziente___lt) {
            this.i_paziente___lt = i_paziente___lt;
            return this;
        }

        public Builder setI_paziente___lte(Integer i_paziente___lte) {
            this.i_paziente___lte = i_paziente___lte;
            return this;
        }

        public Builder setI_paziente___gt(Integer i_paziente___gt) {
            this.i_paziente___gt = i_paziente___gt;
            return this;
        }

        public Builder setI_paziente___gte(Integer i_paziente___gte) {
            this.i_paziente___gte = i_paziente___gte;
            return this;
        }

        public Builder setMetavir___eq(String metavir___eq) {
            this.metavir___eq = metavir___eq;
            return this;
        }

        public Builder setMetavir___ne(String metavir___ne) {
            this.metavir___ne = metavir___ne;
            return this;
        }

        public Builder setMetavir___null(Boolean metavir___null) {
            this.metavir___null = metavir___null;
            return this;
        }

        public Builder setMetavir___not___null(Boolean metavir___not___null) {
            this.metavir___not___null = metavir___not___null;
            return this;
        }

        public Builder setMetavir___in(java.util.List<String> metavir___in) {
            this.metavir___in = metavir___in;
            return this;
        }

        public Builder setMetavir___not___in(java.util.List<String> metavir___not___in) {
            this.metavir___not___in = metavir___not___in;
            return this;
        }

        public Builder setMetavir___lt(String metavir___lt) {
            this.metavir___lt = metavir___lt;
            return this;
        }

        public Builder setMetavir___lte(String metavir___lte) {
            this.metavir___lte = metavir___lte;
            return this;
        }

        public Builder setMetavir___gt(String metavir___gt) {
            this.metavir___gt = metavir___gt;
            return this;
        }

        public Builder setMetavir___gte(String metavir___gte) {
            this.metavir___gte = metavir___gte;
            return this;
        }

        public Builder setMetavir___contains(String metavir___contains) {
            this.metavir___contains = metavir___contains;
            return this;
        }

        public Builder setMetavir___not___contains(String metavir___not___contains) {
            this.metavir___not___contains = metavir___not___contains;
            return this;
        }

        public Builder setMetavir___starts_with(String metavir___starts_with) {
            this.metavir___starts_with = metavir___starts_with;
            return this;
        }

        public Builder setMetavir___not___starts_with(String metavir___not___starts_with) {
            this.metavir___not___starts_with = metavir___not___starts_with;
            return this;
        }

        public Builder setMetavir___ends_with(String metavir___ends_with) {
            this.metavir___ends_with = metavir___ends_with;
            return this;
        }

        public Builder setMetavir___not___ends_with(String metavir___not___ends_with) {
            this.metavir___not___ends_with = metavir___not___ends_with;
            return this;
        }

        public Builder setPatologico___eq(Boolean patologico___eq) {
            this.patologico___eq = patologico___eq;
            return this;
        }

        public Builder setPatologico___ne(Boolean patologico___ne) {
            this.patologico___ne = patologico___ne;
            return this;
        }

        public Builder setPatologico___null(Boolean patologico___null) {
            this.patologico___null = patologico___null;
            return this;
        }

        public Builder setPatologico___not___null(Boolean patologico___not___null) {
            this.patologico___not___null = patologico___not___null;
            return this;
        }

        public Builder setPaziente_ok___eq(Integer paziente_ok___eq) {
            this.paziente_ok___eq = paziente_ok___eq;
            return this;
        }

        public Builder setPaziente_ok___ne(Integer paziente_ok___ne) {
            this.paziente_ok___ne = paziente_ok___ne;
            return this;
        }

        public Builder setPaziente_ok___null(Boolean paziente_ok___null) {
            this.paziente_ok___null = paziente_ok___null;
            return this;
        }

        public Builder setPaziente_ok___not___null(Boolean paziente_ok___not___null) {
            this.paziente_ok___not___null = paziente_ok___not___null;
            return this;
        }

        public Builder setPaziente_ok___in(java.util.List<Integer> paziente_ok___in) {
            this.paziente_ok___in = paziente_ok___in;
            return this;
        }

        public Builder setPaziente_ok___not___in(java.util.List<Integer> paziente_ok___not___in) {
            this.paziente_ok___not___in = paziente_ok___not___in;
            return this;
        }

        public Builder setPaziente_ok___lt(Integer paziente_ok___lt) {
            this.paziente_ok___lt = paziente_ok___lt;
            return this;
        }

        public Builder setPaziente_ok___lte(Integer paziente_ok___lte) {
            this.paziente_ok___lte = paziente_ok___lte;
            return this;
        }

        public Builder setPaziente_ok___gt(Integer paziente_ok___gt) {
            this.paziente_ok___gt = paziente_ok___gt;
            return this;
        }

        public Builder setPaziente_ok___gte(Integer paziente_ok___gte) {
            this.paziente_ok___gte = paziente_ok___gte;
            return this;
        }

        public Builder setStifness___eq(String stifness___eq) {
            this.stifness___eq = stifness___eq;
            return this;
        }

        public Builder setStifness___ne(String stifness___ne) {
            this.stifness___ne = stifness___ne;
            return this;
        }

        public Builder setStifness___null(Boolean stifness___null) {
            this.stifness___null = stifness___null;
            return this;
        }

        public Builder setStifness___not___null(Boolean stifness___not___null) {
            this.stifness___not___null = stifness___not___null;
            return this;
        }

        public Builder setStifness___in(java.util.List<String> stifness___in) {
            this.stifness___in = stifness___in;
            return this;
        }

        public Builder setStifness___not___in(java.util.List<String> stifness___not___in) {
            this.stifness___not___in = stifness___not___in;
            return this;
        }

        public Builder setStifness___lt(String stifness___lt) {
            this.stifness___lt = stifness___lt;
            return this;
        }

        public Builder setStifness___lte(String stifness___lte) {
            this.stifness___lte = stifness___lte;
            return this;
        }

        public Builder setStifness___gt(String stifness___gt) {
            this.stifness___gt = stifness___gt;
            return this;
        }

        public Builder setStifness___gte(String stifness___gte) {
            this.stifness___gte = stifness___gte;
            return this;
        }

        public Builder setSuccess_rate___eq(String success_rate___eq) {
            this.success_rate___eq = success_rate___eq;
            return this;
        }

        public Builder setSuccess_rate___ne(String success_rate___ne) {
            this.success_rate___ne = success_rate___ne;
            return this;
        }

        public Builder setSuccess_rate___null(Boolean success_rate___null) {
            this.success_rate___null = success_rate___null;
            return this;
        }

        public Builder setSuccess_rate___not___null(Boolean success_rate___not___null) {
            this.success_rate___not___null = success_rate___not___null;
            return this;
        }

        public Builder setSuccess_rate___in(java.util.List<String> success_rate___in) {
            this.success_rate___in = success_rate___in;
            return this;
        }

        public Builder setSuccess_rate___not___in(java.util.List<String> success_rate___not___in) {
            this.success_rate___not___in = success_rate___not___in;
            return this;
        }

        public Builder setSuccess_rate___lt(String success_rate___lt) {
            this.success_rate___lt = success_rate___lt;
            return this;
        }

        public Builder setSuccess_rate___lte(String success_rate___lte) {
            this.success_rate___lte = success_rate___lte;
            return this;
        }

        public Builder setSuccess_rate___gt(String success_rate___gt) {
            this.success_rate___gt = success_rate___gt;
            return this;
        }

        public Builder setSuccess_rate___gte(String success_rate___gte) {
            this.success_rate___gte = success_rate___gte;
            return this;
        }

        public Builder setT_score_colonna___eq(String t_score_colonna___eq) {
            this.t_score_colonna___eq = t_score_colonna___eq;
            return this;
        }

        public Builder setT_score_colonna___ne(String t_score_colonna___ne) {
            this.t_score_colonna___ne = t_score_colonna___ne;
            return this;
        }

        public Builder setT_score_colonna___null(Boolean t_score_colonna___null) {
            this.t_score_colonna___null = t_score_colonna___null;
            return this;
        }

        public Builder setT_score_colonna___not___null(Boolean t_score_colonna___not___null) {
            this.t_score_colonna___not___null = t_score_colonna___not___null;
            return this;
        }

        public Builder setT_score_colonna___in(java.util.List<String> t_score_colonna___in) {
            this.t_score_colonna___in = t_score_colonna___in;
            return this;
        }

        public Builder setT_score_colonna___not___in(java.util.List<String> t_score_colonna___not___in) {
            this.t_score_colonna___not___in = t_score_colonna___not___in;
            return this;
        }

        public Builder setT_score_colonna___lt(String t_score_colonna___lt) {
            this.t_score_colonna___lt = t_score_colonna___lt;
            return this;
        }

        public Builder setT_score_colonna___lte(String t_score_colonna___lte) {
            this.t_score_colonna___lte = t_score_colonna___lte;
            return this;
        }

        public Builder setT_score_colonna___gt(String t_score_colonna___gt) {
            this.t_score_colonna___gt = t_score_colonna___gt;
            return this;
        }

        public Builder setT_score_colonna___gte(String t_score_colonna___gte) {
            this.t_score_colonna___gte = t_score_colonna___gte;
            return this;
        }

        public Builder setT_score_femore___eq(String t_score_femore___eq) {
            this.t_score_femore___eq = t_score_femore___eq;
            return this;
        }

        public Builder setT_score_femore___ne(String t_score_femore___ne) {
            this.t_score_femore___ne = t_score_femore___ne;
            return this;
        }

        public Builder setT_score_femore___null(Boolean t_score_femore___null) {
            this.t_score_femore___null = t_score_femore___null;
            return this;
        }

        public Builder setT_score_femore___not___null(Boolean t_score_femore___not___null) {
            this.t_score_femore___not___null = t_score_femore___not___null;
            return this;
        }

        public Builder setT_score_femore___in(java.util.List<String> t_score_femore___in) {
            this.t_score_femore___in = t_score_femore___in;
            return this;
        }

        public Builder setT_score_femore___not___in(java.util.List<String> t_score_femore___not___in) {
            this.t_score_femore___not___in = t_score_femore___not___in;
            return this;
        }

        public Builder setT_score_femore___lt(String t_score_femore___lt) {
            this.t_score_femore___lt = t_score_femore___lt;
            return this;
        }

        public Builder setT_score_femore___lte(String t_score_femore___lte) {
            this.t_score_femore___lte = t_score_femore___lte;
            return this;
        }

        public Builder setT_score_femore___gt(String t_score_femore___gt) {
            this.t_score_femore___gt = t_score_femore___gt;
            return this;
        }

        public Builder setT_score_femore___gte(String t_score_femore___gte) {
            this.t_score_femore___gte = t_score_femore___gte;
            return this;
        }

        public Builder setZ_score_colonna___eq(String z_score_colonna___eq) {
            this.z_score_colonna___eq = z_score_colonna___eq;
            return this;
        }

        public Builder setZ_score_colonna___ne(String z_score_colonna___ne) {
            this.z_score_colonna___ne = z_score_colonna___ne;
            return this;
        }

        public Builder setZ_score_colonna___null(Boolean z_score_colonna___null) {
            this.z_score_colonna___null = z_score_colonna___null;
            return this;
        }

        public Builder setZ_score_colonna___not___null(Boolean z_score_colonna___not___null) {
            this.z_score_colonna___not___null = z_score_colonna___not___null;
            return this;
        }

        public Builder setZ_score_colonna___in(java.util.List<String> z_score_colonna___in) {
            this.z_score_colonna___in = z_score_colonna___in;
            return this;
        }

        public Builder setZ_score_colonna___not___in(java.util.List<String> z_score_colonna___not___in) {
            this.z_score_colonna___not___in = z_score_colonna___not___in;
            return this;
        }

        public Builder setZ_score_colonna___lt(String z_score_colonna___lt) {
            this.z_score_colonna___lt = z_score_colonna___lt;
            return this;
        }

        public Builder setZ_score_colonna___lte(String z_score_colonna___lte) {
            this.z_score_colonna___lte = z_score_colonna___lte;
            return this;
        }

        public Builder setZ_score_colonna___gt(String z_score_colonna___gt) {
            this.z_score_colonna___gt = z_score_colonna___gt;
            return this;
        }

        public Builder setZ_score_colonna___gte(String z_score_colonna___gte) {
            this.z_score_colonna___gte = z_score_colonna___gte;
            return this;
        }

        public Builder setZ_score_femore___eq(String z_score_femore___eq) {
            this.z_score_femore___eq = z_score_femore___eq;
            return this;
        }

        public Builder setZ_score_femore___ne(String z_score_femore___ne) {
            this.z_score_femore___ne = z_score_femore___ne;
            return this;
        }

        public Builder setZ_score_femore___null(Boolean z_score_femore___null) {
            this.z_score_femore___null = z_score_femore___null;
            return this;
        }

        public Builder setZ_score_femore___not___null(Boolean z_score_femore___not___null) {
            this.z_score_femore___not___null = z_score_femore___not___null;
            return this;
        }

        public Builder setZ_score_femore___in(java.util.List<String> z_score_femore___in) {
            this.z_score_femore___in = z_score_femore___in;
            return this;
        }

        public Builder setZ_score_femore___not___in(java.util.List<String> z_score_femore___not___in) {
            this.z_score_femore___not___in = z_score_femore___not___in;
            return this;
        }

        public Builder setZ_score_femore___lt(String z_score_femore___lt) {
            this.z_score_femore___lt = z_score_femore___lt;
            return this;
        }

        public Builder setZ_score_femore___lte(String z_score_femore___lte) {
            this.z_score_femore___lte = z_score_femore___lte;
            return this;
        }

        public Builder setZ_score_femore___gt(String z_score_femore___gt) {
            this.z_score_femore___gt = z_score_femore___gt;
            return this;
        }

        public Builder setZ_score_femore___gte(String z_score_femore___gte) {
            this.z_score_femore___gte = z_score_femore___gte;
            return this;
        }

        public Builder setAND(java.util.List<CliEsame_strumentaleFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliEsame_strumentaleFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliEsame_strumentaleFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliEsame_strumentaleFilterDTO build() {
            CliEsame_strumentaleFilterDTO result = new CliEsame_strumentaleFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
            result.setIQR___eq(this.IQR___eq);
            result.setIQR___ne(this.IQR___ne);
            result.setIQR___null(this.IQR___null);
            result.setIQR___not___null(this.IQR___not___null);
            result.setIQR___in(this.IQR___in);
            result.setIQR___not___in(this.IQR___not___in);
            result.setIQR___lt(this.IQR___lt);
            result.setIQR___lte(this.IQR___lte);
            result.setIQR___gt(this.IQR___gt);
            result.setIQR___gte(this.IQR___gte);
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
            result.setAltro_esame___eq(this.altro_esame___eq);
            result.setAltro_esame___ne(this.altro_esame___ne);
            result.setAltro_esame___null(this.altro_esame___null);
            result.setAltro_esame___not___null(this.altro_esame___not___null);
            result.setAltro_esame___in(this.altro_esame___in);
            result.setAltro_esame___not___in(this.altro_esame___not___in);
            result.setAltro_esame___lt(this.altro_esame___lt);
            result.setAltro_esame___lte(this.altro_esame___lte);
            result.setAltro_esame___gt(this.altro_esame___gt);
            result.setAltro_esame___gte(this.altro_esame___gte);
            result.setAltro_esame___contains(this.altro_esame___contains);
            result.setAltro_esame___not___contains(this.altro_esame___not___contains);
            result.setAltro_esame___starts_with(this.altro_esame___starts_with);
            result.setAltro_esame___not___starts_with(this.altro_esame___not___starts_with);
            result.setAltro_esame___ends_with(this.altro_esame___ends_with);
            result.setAltro_esame___not___ends_with(this.altro_esame___not___ends_with);
            result.setBmd_colonna___eq(this.bmd_colonna___eq);
            result.setBmd_colonna___ne(this.bmd_colonna___ne);
            result.setBmd_colonna___null(this.bmd_colonna___null);
            result.setBmd_colonna___not___null(this.bmd_colonna___not___null);
            result.setBmd_colonna___in(this.bmd_colonna___in);
            result.setBmd_colonna___not___in(this.bmd_colonna___not___in);
            result.setBmd_colonna___lt(this.bmd_colonna___lt);
            result.setBmd_colonna___lte(this.bmd_colonna___lte);
            result.setBmd_colonna___gt(this.bmd_colonna___gt);
            result.setBmd_colonna___gte(this.bmd_colonna___gte);
            result.setBmd_femore___eq(this.bmd_femore___eq);
            result.setBmd_femore___ne(this.bmd_femore___ne);
            result.setBmd_femore___null(this.bmd_femore___null);
            result.setBmd_femore___not___null(this.bmd_femore___not___null);
            result.setBmd_femore___in(this.bmd_femore___in);
            result.setBmd_femore___not___in(this.bmd_femore___not___in);
            result.setBmd_femore___lt(this.bmd_femore___lt);
            result.setBmd_femore___lte(this.bmd_femore___lte);
            result.setBmd_femore___gt(this.bmd_femore___gt);
            result.setBmd_femore___gte(this.bmd_femore___gte);
            result.setCap_iqr___eq(this.cap_iqr___eq);
            result.setCap_iqr___ne(this.cap_iqr___ne);
            result.setCap_iqr___null(this.cap_iqr___null);
            result.setCap_iqr___not___null(this.cap_iqr___not___null);
            result.setCap_iqr___in(this.cap_iqr___in);
            result.setCap_iqr___not___in(this.cap_iqr___not___in);
            result.setCap_iqr___lt(this.cap_iqr___lt);
            result.setCap_iqr___lte(this.cap_iqr___lte);
            result.setCap_iqr___gt(this.cap_iqr___gt);
            result.setCap_iqr___gte(this.cap_iqr___gte);
            result.setCap_mediano___eq(this.cap_mediano___eq);
            result.setCap_mediano___ne(this.cap_mediano___ne);
            result.setCap_mediano___null(this.cap_mediano___null);
            result.setCap_mediano___not___null(this.cap_mediano___not___null);
            result.setCap_mediano___in(this.cap_mediano___in);
            result.setCap_mediano___not___in(this.cap_mediano___not___in);
            result.setCap_mediano___lt(this.cap_mediano___lt);
            result.setCap_mediano___lte(this.cap_mediano___lte);
            result.setCap_mediano___gt(this.cap_mediano___gt);
            result.setCap_mediano___gte(this.cap_mediano___gte);
            result.setClasse_rischio_hpv___eq(this.classe_rischio_hpv___eq);
            result.setClasse_rischio_hpv___ne(this.classe_rischio_hpv___ne);
            result.setClasse_rischio_hpv___null(this.classe_rischio_hpv___null);
            result.setClasse_rischio_hpv___not___null(this.classe_rischio_hpv___not___null);
            result.setClasse_rischio_hpv___in(this.classe_rischio_hpv___in);
            result.setClasse_rischio_hpv___not___in(this.classe_rischio_hpv___not___in);
            result.setClasse_rischio_hpv___lt(this.classe_rischio_hpv___lt);
            result.setClasse_rischio_hpv___lte(this.classe_rischio_hpv___lte);
            result.setClasse_rischio_hpv___gt(this.classe_rischio_hpv___gt);
            result.setClasse_rischio_hpv___gte(this.classe_rischio_hpv___gte);
            result.setClasse_rischio_hpv___contains(this.classe_rischio_hpv___contains);
            result.setClasse_rischio_hpv___not___contains(this.classe_rischio_hpv___not___contains);
            result.setClasse_rischio_hpv___starts_with(this.classe_rischio_hpv___starts_with);
            result.setClasse_rischio_hpv___not___starts_with(this.classe_rischio_hpv___not___starts_with);
            result.setClasse_rischio_hpv___ends_with(this.classe_rischio_hpv___ends_with);
            result.setClasse_rischio_hpv___not___ends_with(this.classe_rischio_hpv___not___ends_with);
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
            result.setEsame___eq(this.esame___eq);
            result.setEsame___ne(this.esame___ne);
            result.setEsame___null(this.esame___null);
            result.setEsame___not___null(this.esame___not___null);
            result.setEsame___in(this.esame___in);
            result.setEsame___not___in(this.esame___not___in);
            result.setEsame___lt(this.esame___lt);
            result.setEsame___lte(this.esame___lte);
            result.setEsame___gt(this.esame___gt);
            result.setEsame___gte(this.esame___gte);
            result.setEsame___contains(this.esame___contains);
            result.setEsame___not___contains(this.esame___not___contains);
            result.setEsame___starts_with(this.esame___starts_with);
            result.setEsame___not___starts_with(this.esame___not___starts_with);
            result.setEsame___ends_with(this.esame___ends_with);
            result.setEsame___not___ends_with(this.esame___not___ends_with);
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
            result.setGenotipi_hpv___eq(this.genotipi_hpv___eq);
            result.setGenotipi_hpv___ne(this.genotipi_hpv___ne);
            result.setGenotipi_hpv___null(this.genotipi_hpv___null);
            result.setGenotipi_hpv___not___null(this.genotipi_hpv___not___null);
            result.setGenotipi_hpv___in(this.genotipi_hpv___in);
            result.setGenotipi_hpv___not___in(this.genotipi_hpv___not___in);
            result.setGenotipi_hpv___lt(this.genotipi_hpv___lt);
            result.setGenotipi_hpv___lte(this.genotipi_hpv___lte);
            result.setGenotipi_hpv___gt(this.genotipi_hpv___gt);
            result.setGenotipi_hpv___gte(this.genotipi_hpv___gte);
            result.setGenotipi_hpv___contains(this.genotipi_hpv___contains);
            result.setGenotipi_hpv___not___contains(this.genotipi_hpv___not___contains);
            result.setGenotipi_hpv___starts_with(this.genotipi_hpv___starts_with);
            result.setGenotipi_hpv___not___starts_with(this.genotipi_hpv___not___starts_with);
            result.setGenotipi_hpv___ends_with(this.genotipi_hpv___ends_with);
            result.setGenotipi_hpv___not___ends_with(this.genotipi_hpv___not___ends_with);
            result.setI_paziente___eq(this.i_paziente___eq);
            result.setI_paziente___ne(this.i_paziente___ne);
            result.setI_paziente___null(this.i_paziente___null);
            result.setI_paziente___not___null(this.i_paziente___not___null);
            result.setI_paziente___in(this.i_paziente___in);
            result.setI_paziente___not___in(this.i_paziente___not___in);
            result.setI_paziente___lt(this.i_paziente___lt);
            result.setI_paziente___lte(this.i_paziente___lte);
            result.setI_paziente___gt(this.i_paziente___gt);
            result.setI_paziente___gte(this.i_paziente___gte);
            result.setMetavir___eq(this.metavir___eq);
            result.setMetavir___ne(this.metavir___ne);
            result.setMetavir___null(this.metavir___null);
            result.setMetavir___not___null(this.metavir___not___null);
            result.setMetavir___in(this.metavir___in);
            result.setMetavir___not___in(this.metavir___not___in);
            result.setMetavir___lt(this.metavir___lt);
            result.setMetavir___lte(this.metavir___lte);
            result.setMetavir___gt(this.metavir___gt);
            result.setMetavir___gte(this.metavir___gte);
            result.setMetavir___contains(this.metavir___contains);
            result.setMetavir___not___contains(this.metavir___not___contains);
            result.setMetavir___starts_with(this.metavir___starts_with);
            result.setMetavir___not___starts_with(this.metavir___not___starts_with);
            result.setMetavir___ends_with(this.metavir___ends_with);
            result.setMetavir___not___ends_with(this.metavir___not___ends_with);
            result.setPatologico___eq(this.patologico___eq);
            result.setPatologico___ne(this.patologico___ne);
            result.setPatologico___null(this.patologico___null);
            result.setPatologico___not___null(this.patologico___not___null);
            result.setPaziente_ok___eq(this.paziente_ok___eq);
            result.setPaziente_ok___ne(this.paziente_ok___ne);
            result.setPaziente_ok___null(this.paziente_ok___null);
            result.setPaziente_ok___not___null(this.paziente_ok___not___null);
            result.setPaziente_ok___in(this.paziente_ok___in);
            result.setPaziente_ok___not___in(this.paziente_ok___not___in);
            result.setPaziente_ok___lt(this.paziente_ok___lt);
            result.setPaziente_ok___lte(this.paziente_ok___lte);
            result.setPaziente_ok___gt(this.paziente_ok___gt);
            result.setPaziente_ok___gte(this.paziente_ok___gte);
            result.setStifness___eq(this.stifness___eq);
            result.setStifness___ne(this.stifness___ne);
            result.setStifness___null(this.stifness___null);
            result.setStifness___not___null(this.stifness___not___null);
            result.setStifness___in(this.stifness___in);
            result.setStifness___not___in(this.stifness___not___in);
            result.setStifness___lt(this.stifness___lt);
            result.setStifness___lte(this.stifness___lte);
            result.setStifness___gt(this.stifness___gt);
            result.setStifness___gte(this.stifness___gte);
            result.setSuccess_rate___eq(this.success_rate___eq);
            result.setSuccess_rate___ne(this.success_rate___ne);
            result.setSuccess_rate___null(this.success_rate___null);
            result.setSuccess_rate___not___null(this.success_rate___not___null);
            result.setSuccess_rate___in(this.success_rate___in);
            result.setSuccess_rate___not___in(this.success_rate___not___in);
            result.setSuccess_rate___lt(this.success_rate___lt);
            result.setSuccess_rate___lte(this.success_rate___lte);
            result.setSuccess_rate___gt(this.success_rate___gt);
            result.setSuccess_rate___gte(this.success_rate___gte);
            result.setT_score_colonna___eq(this.t_score_colonna___eq);
            result.setT_score_colonna___ne(this.t_score_colonna___ne);
            result.setT_score_colonna___null(this.t_score_colonna___null);
            result.setT_score_colonna___not___null(this.t_score_colonna___not___null);
            result.setT_score_colonna___in(this.t_score_colonna___in);
            result.setT_score_colonna___not___in(this.t_score_colonna___not___in);
            result.setT_score_colonna___lt(this.t_score_colonna___lt);
            result.setT_score_colonna___lte(this.t_score_colonna___lte);
            result.setT_score_colonna___gt(this.t_score_colonna___gt);
            result.setT_score_colonna___gte(this.t_score_colonna___gte);
            result.setT_score_femore___eq(this.t_score_femore___eq);
            result.setT_score_femore___ne(this.t_score_femore___ne);
            result.setT_score_femore___null(this.t_score_femore___null);
            result.setT_score_femore___not___null(this.t_score_femore___not___null);
            result.setT_score_femore___in(this.t_score_femore___in);
            result.setT_score_femore___not___in(this.t_score_femore___not___in);
            result.setT_score_femore___lt(this.t_score_femore___lt);
            result.setT_score_femore___lte(this.t_score_femore___lte);
            result.setT_score_femore___gt(this.t_score_femore___gt);
            result.setT_score_femore___gte(this.t_score_femore___gte);
            result.setZ_score_colonna___eq(this.z_score_colonna___eq);
            result.setZ_score_colonna___ne(this.z_score_colonna___ne);
            result.setZ_score_colonna___null(this.z_score_colonna___null);
            result.setZ_score_colonna___not___null(this.z_score_colonna___not___null);
            result.setZ_score_colonna___in(this.z_score_colonna___in);
            result.setZ_score_colonna___not___in(this.z_score_colonna___not___in);
            result.setZ_score_colonna___lt(this.z_score_colonna___lt);
            result.setZ_score_colonna___lte(this.z_score_colonna___lte);
            result.setZ_score_colonna___gt(this.z_score_colonna___gt);
            result.setZ_score_colonna___gte(this.z_score_colonna___gte);
            result.setZ_score_femore___eq(this.z_score_femore___eq);
            result.setZ_score_femore___ne(this.z_score_femore___ne);
            result.setZ_score_femore___null(this.z_score_femore___null);
            result.setZ_score_femore___not___null(this.z_score_femore___not___null);
            result.setZ_score_femore___in(this.z_score_femore___in);
            result.setZ_score_femore___not___in(this.z_score_femore___not___in);
            result.setZ_score_femore___lt(this.z_score_femore___lt);
            result.setZ_score_femore___lte(this.z_score_femore___lte);
            result.setZ_score_femore___gt(this.z_score_femore___gt);
            result.setZ_score_femore___gte(this.z_score_femore___gte);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
