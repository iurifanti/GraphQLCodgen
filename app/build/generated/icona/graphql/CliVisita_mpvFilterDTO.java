package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Visita_mpv.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliVisita_mpvFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
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
    private Boolean arruolamento___eq;
    private Boolean arruolamento___ne;
    private Boolean arruolamento___null;
    private Boolean arruolamento___not___null;
    private Boolean arruolamento_effettuato___eq;
    private Boolean arruolamento_effettuato___ne;
    private Boolean arruolamento_effettuato___null;
    private Boolean arruolamento_effettuato___not___null;
    private Integer cd4_vaccinazione___eq;
    private Integer cd4_vaccinazione___ne;
    private Boolean cd4_vaccinazione___null;
    private Boolean cd4_vaccinazione___not___null;
    private java.util.List<Integer> cd4_vaccinazione___in;
    private java.util.List<Integer> cd4_vaccinazione___not___in;
    private Integer cd4_vaccinazione___lt;
    private Integer cd4_vaccinazione___lte;
    private Integer cd4_vaccinazione___gt;
    private Integer cd4_vaccinazione___gte;
    private String centro_prov___eq;
    private String centro_prov___ne;
    private Boolean centro_prov___null;
    private Boolean centro_prov___not___null;
    private java.util.List<String> centro_prov___in;
    private java.util.List<String> centro_prov___not___in;
    private String centro_prov___lt;
    private String centro_prov___lte;
    private String centro_prov___gt;
    private String centro_prov___gte;
    private String centro_prov___contains;
    private String centro_prov___not___contains;
    private String centro_prov___starts_with;
    private String centro_prov___not___starts_with;
    private String centro_prov___ends_with;
    private String centro_prov___not___ends_with;
    private Boolean chemsex___eq;
    private Boolean chemsex___ne;
    private Boolean chemsex___null;
    private Boolean chemsex___not___null;
    private Boolean chlamydia___eq;
    private Boolean chlamydia___ne;
    private Boolean chlamydia___null;
    private Boolean chlamydia___not___null;
    private Boolean contatti_mpox___eq;
    private Boolean contatti_mpox___ne;
    private Boolean contatti_mpox___null;
    private Boolean contatti_mpox___not___null;
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
    private String data_chlamydia___eq;
    private String data_chlamydia___ne;
    private Boolean data_chlamydia___null;
    private Boolean data_chlamydia___not___null;
    private java.util.List<String> data_chlamydia___in;
    private java.util.List<String> data_chlamydia___not___in;
    private String data_chlamydia___lt;
    private String data_chlamydia___lte;
    private String data_chlamydia___gt;
    private String data_chlamydia___gte;
    private String data_contatto_mpox___eq;
    private String data_contatto_mpox___ne;
    private Boolean data_contatto_mpox___null;
    private Boolean data_contatto_mpox___not___null;
    private java.util.List<String> data_contatto_mpox___in;
    private java.util.List<String> data_contatto_mpox___not___in;
    private String data_contatto_mpox___lt;
    private String data_contatto_mpox___lte;
    private String data_contatto_mpox___gt;
    private String data_contatto_mpox___gte;
    private String data_gonorrea___eq;
    private String data_gonorrea___ne;
    private Boolean data_gonorrea___null;
    private Boolean data_gonorrea___not___null;
    private java.util.List<String> data_gonorrea___in;
    private java.util.List<String> data_gonorrea___not___in;
    private String data_gonorrea___lt;
    private String data_gonorrea___lte;
    private String data_gonorrea___gt;
    private String data_gonorrea___gte;
    private String data_hpv___eq;
    private String data_hpv___ne;
    private Boolean data_hpv___null;
    private Boolean data_hpv___not___null;
    private java.util.List<String> data_hpv___in;
    private java.util.List<String> data_hpv___not___in;
    private String data_hpv___lt;
    private String data_hpv___lte;
    private String data_hpv___gt;
    private String data_hpv___gte;
    private String data_mvabn_pre1___eq;
    private String data_mvabn_pre1___ne;
    private Boolean data_mvabn_pre1___null;
    private Boolean data_mvabn_pre1___not___null;
    private java.util.List<String> data_mvabn_pre1___in;
    private java.util.List<String> data_mvabn_pre1___not___in;
    private String data_mvabn_pre1___lt;
    private String data_mvabn_pre1___lte;
    private String data_mvabn_pre1___gt;
    private String data_mvabn_pre1___gte;
    private String data_mvabn_pre2___eq;
    private String data_mvabn_pre2___ne;
    private Boolean data_mvabn_pre2___null;
    private Boolean data_mvabn_pre2___not___null;
    private java.util.List<String> data_mvabn_pre2___in;
    private java.util.List<String> data_mvabn_pre2___not___in;
    private String data_mvabn_pre2___lt;
    private String data_mvabn_pre2___lte;
    private String data_mvabn_pre2___gt;
    private String data_mvabn_pre2___gte;
    private String data_sifilide___eq;
    private String data_sifilide___ne;
    private Boolean data_sifilide___null;
    private Boolean data_sifilide___not___null;
    private java.util.List<String> data_sifilide___in;
    private java.util.List<String> data_sifilide___not___in;
    private String data_sifilide___lt;
    private String data_sifilide___lte;
    private String data_sifilide___gt;
    private String data_sifilide___gte;
    private Boolean gonorrea___eq;
    private Boolean gonorrea___ne;
    private Boolean gonorrea___null;
    private Boolean gonorrea___not___null;
    private String gruppo_appartenenza___eq;
    private String gruppo_appartenenza___ne;
    private Boolean gruppo_appartenenza___null;
    private Boolean gruppo_appartenenza___not___null;
    private java.util.List<String> gruppo_appartenenza___in;
    private java.util.List<String> gruppo_appartenenza___not___in;
    private String gruppo_appartenenza___lt;
    private String gruppo_appartenenza___lte;
    private String gruppo_appartenenza___gt;
    private String gruppo_appartenenza___gte;
    private String gruppo_appartenenza___contains;
    private String gruppo_appartenenza___not___contains;
    private String gruppo_appartenenza___starts_with;
    private String gruppo_appartenenza___not___starts_with;
    private String gruppo_appartenenza___ends_with;
    private String gruppo_appartenenza___not___ends_with;
    private Boolean hiv___eq;
    private Boolean hiv___ne;
    private Boolean hiv___null;
    private Boolean hiv___not___null;
    private Integer hivrna_vaccinazione___eq;
    private Integer hivrna_vaccinazione___ne;
    private Boolean hivrna_vaccinazione___null;
    private Boolean hivrna_vaccinazione___not___null;
    private java.util.List<Integer> hivrna_vaccinazione___in;
    private java.util.List<Integer> hivrna_vaccinazione___not___in;
    private Integer hivrna_vaccinazione___lt;
    private Integer hivrna_vaccinazione___lte;
    private Integer hivrna_vaccinazione___gt;
    private Integer hivrna_vaccinazione___gte;
    private Boolean hpv___eq;
    private Boolean hpv___ne;
    private Boolean hpv___null;
    private Boolean hpv___not___null;
    private Boolean mst___eq;
    private Boolean mst___ne;
    private Boolean mst___null;
    private Boolean mst___not___null;
    private String note_ricovero___eq;
    private String note_ricovero___ne;
    private Boolean note_ricovero___null;
    private Boolean note_ricovero___not___null;
    private java.util.List<String> note_ricovero___in;
    private java.util.List<String> note_ricovero___not___in;
    private String note_ricovero___lt;
    private String note_ricovero___lte;
    private String note_ricovero___gt;
    private String note_ricovero___gte;
    private String note_ricovero___contains;
    private String note_ricovero___not___contains;
    private String note_ricovero___starts_with;
    private String note_ricovero___not___starts_with;
    private String note_ricovero___ends_with;
    private String note_ricovero___not___ends_with;
    private Integer num_dosi_mvabn___eq;
    private Integer num_dosi_mvabn___ne;
    private Boolean num_dosi_mvabn___null;
    private Boolean num_dosi_mvabn___not___null;
    private java.util.List<Integer> num_dosi_mvabn___in;
    private java.util.List<Integer> num_dosi_mvabn___not___in;
    private Integer num_dosi_mvabn___lt;
    private Integer num_dosi_mvabn___lte;
    private Integer num_dosi_mvabn___gt;
    private Integer num_dosi_mvabn___gte;
    private Integer num_visite___eq;
    private Integer num_visite___ne;
    private Boolean num_visite___null;
    private Boolean num_visite___not___null;
    private java.util.List<Integer> num_visite___in;
    private java.util.List<Integer> num_visite___not___in;
    private Integer num_visite___lt;
    private Integer num_visite___lte;
    private Integer num_visite___gt;
    private Integer num_visite___gte;
    private String paziente_ico___eq;
    private String paziente_ico___ne;
    private Boolean paziente_ico___null;
    private Boolean paziente_ico___not___null;
    private java.util.List<String> paziente_ico___in;
    private java.util.List<String> paziente_ico___not___in;
    private String paziente_ico___lt;
    private String paziente_ico___lte;
    private String paziente_ico___gt;
    private String paziente_ico___gte;
    private String paziente_ico___contains;
    private String paziente_ico___not___contains;
    private String paziente_ico___starts_with;
    private String paziente_ico___not___starts_with;
    private String paziente_ico___ends_with;
    private String paziente_ico___not___ends_with;
    private Boolean ricovero___eq;
    private Boolean ricovero___ne;
    private Boolean ricovero___null;
    private Boolean ricovero___not___null;
    private Boolean sifilide___eq;
    private Boolean sifilide___ne;
    private Boolean sifilide___null;
    private Boolean sifilide___not___null;
    private String tipo_visita___eq;
    private String tipo_visita___ne;
    private Boolean tipo_visita___null;
    private Boolean tipo_visita___not___null;
    private java.util.List<String> tipo_visita___in;
    private java.util.List<String> tipo_visita___not___in;
    private String tipo_visita___lt;
    private String tipo_visita___lte;
    private String tipo_visita___gt;
    private String tipo_visita___gte;
    private String tipo_visita___contains;
    private String tipo_visita___not___contains;
    private String tipo_visita___starts_with;
    private String tipo_visita___not___starts_with;
    private String tipo_visita___ends_with;
    private String tipo_visita___not___ends_with;
    private String tipo_visita_booster___eq;
    private String tipo_visita_booster___ne;
    private Boolean tipo_visita_booster___null;
    private Boolean tipo_visita_booster___not___null;
    private java.util.List<String> tipo_visita_booster___in;
    private java.util.List<String> tipo_visita_booster___not___in;
    private String tipo_visita_booster___lt;
    private String tipo_visita_booster___lte;
    private String tipo_visita_booster___gt;
    private String tipo_visita_booster___gte;
    private String tipo_visita_booster___contains;
    private String tipo_visita_booster___not___contains;
    private String tipo_visita_booster___starts_with;
    private String tipo_visita_booster___not___starts_with;
    private String tipo_visita_booster___ends_with;
    private String tipo_visita_booster___not___ends_with;
    private String vac_mvabn_22_23___eq;
    private String vac_mvabn_22_23___ne;
    private Boolean vac_mvabn_22_23___null;
    private Boolean vac_mvabn_22_23___not___null;
    private java.util.List<String> vac_mvabn_22_23___in;
    private java.util.List<String> vac_mvabn_22_23___not___in;
    private String vac_mvabn_22_23___lt;
    private String vac_mvabn_22_23___lte;
    private String vac_mvabn_22_23___gt;
    private String vac_mvabn_22_23___gte;
    private String vac_mvabn_22_23___contains;
    private String vac_mvabn_22_23___not___contains;
    private String vac_mvabn_22_23___starts_with;
    private String vac_mvabn_22_23___not___starts_with;
    private String vac_mvabn_22_23___ends_with;
    private String vac_mvabn_22_23___not___ends_with;
    private String vac_vaiolo_pre___eq;
    private String vac_vaiolo_pre___ne;
    private Boolean vac_vaiolo_pre___null;
    private Boolean vac_vaiolo_pre___not___null;
    private java.util.List<String> vac_vaiolo_pre___in;
    private java.util.List<String> vac_vaiolo_pre___not___in;
    private String vac_vaiolo_pre___lt;
    private String vac_vaiolo_pre___lte;
    private String vac_vaiolo_pre___gt;
    private String vac_vaiolo_pre___gte;
    private String vac_vaiolo_pre___contains;
    private String vac_vaiolo_pre___not___contains;
    private String vac_vaiolo_pre___starts_with;
    private String vac_vaiolo_pre___not___starts_with;
    private String vac_vaiolo_pre___ends_with;
    private String vac_vaiolo_pre___not___ends_with;
    private java.util.List<CliVisita_mpvFilterDTO> AND;
    private java.util.List<CliVisita_mpvFilterDTO> OR;
    private CliVisita_mpvFilterDTO NOT;

    public CliVisita_mpvFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
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

    public Boolean getArruolamento___eq() {
        return arruolamento___eq;
    }
    public void setArruolamento___eq(Boolean arruolamento___eq) {
        this.arruolamento___eq = arruolamento___eq;
    }

    public Boolean getArruolamento___ne() {
        return arruolamento___ne;
    }
    public void setArruolamento___ne(Boolean arruolamento___ne) {
        this.arruolamento___ne = arruolamento___ne;
    }

    public Boolean getArruolamento___null() {
        return arruolamento___null;
    }
    public void setArruolamento___null(Boolean arruolamento___null) {
        this.arruolamento___null = arruolamento___null;
    }

    public Boolean getArruolamento___not___null() {
        return arruolamento___not___null;
    }
    public void setArruolamento___not___null(Boolean arruolamento___not___null) {
        this.arruolamento___not___null = arruolamento___not___null;
    }

    public Boolean getArruolamento_effettuato___eq() {
        return arruolamento_effettuato___eq;
    }
    public void setArruolamento_effettuato___eq(Boolean arruolamento_effettuato___eq) {
        this.arruolamento_effettuato___eq = arruolamento_effettuato___eq;
    }

    public Boolean getArruolamento_effettuato___ne() {
        return arruolamento_effettuato___ne;
    }
    public void setArruolamento_effettuato___ne(Boolean arruolamento_effettuato___ne) {
        this.arruolamento_effettuato___ne = arruolamento_effettuato___ne;
    }

    public Boolean getArruolamento_effettuato___null() {
        return arruolamento_effettuato___null;
    }
    public void setArruolamento_effettuato___null(Boolean arruolamento_effettuato___null) {
        this.arruolamento_effettuato___null = arruolamento_effettuato___null;
    }

    public Boolean getArruolamento_effettuato___not___null() {
        return arruolamento_effettuato___not___null;
    }
    public void setArruolamento_effettuato___not___null(Boolean arruolamento_effettuato___not___null) {
        this.arruolamento_effettuato___not___null = arruolamento_effettuato___not___null;
    }

    public Integer getCd4_vaccinazione___eq() {
        return cd4_vaccinazione___eq;
    }
    public void setCd4_vaccinazione___eq(Integer cd4_vaccinazione___eq) {
        this.cd4_vaccinazione___eq = cd4_vaccinazione___eq;
    }

    public Integer getCd4_vaccinazione___ne() {
        return cd4_vaccinazione___ne;
    }
    public void setCd4_vaccinazione___ne(Integer cd4_vaccinazione___ne) {
        this.cd4_vaccinazione___ne = cd4_vaccinazione___ne;
    }

    public Boolean getCd4_vaccinazione___null() {
        return cd4_vaccinazione___null;
    }
    public void setCd4_vaccinazione___null(Boolean cd4_vaccinazione___null) {
        this.cd4_vaccinazione___null = cd4_vaccinazione___null;
    }

    public Boolean getCd4_vaccinazione___not___null() {
        return cd4_vaccinazione___not___null;
    }
    public void setCd4_vaccinazione___not___null(Boolean cd4_vaccinazione___not___null) {
        this.cd4_vaccinazione___not___null = cd4_vaccinazione___not___null;
    }

    public java.util.List<Integer> getCd4_vaccinazione___in() {
        return cd4_vaccinazione___in;
    }
    public void setCd4_vaccinazione___in(java.util.List<Integer> cd4_vaccinazione___in) {
        this.cd4_vaccinazione___in = cd4_vaccinazione___in;
    }

    public java.util.List<Integer> getCd4_vaccinazione___not___in() {
        return cd4_vaccinazione___not___in;
    }
    public void setCd4_vaccinazione___not___in(java.util.List<Integer> cd4_vaccinazione___not___in) {
        this.cd4_vaccinazione___not___in = cd4_vaccinazione___not___in;
    }

    public Integer getCd4_vaccinazione___lt() {
        return cd4_vaccinazione___lt;
    }
    public void setCd4_vaccinazione___lt(Integer cd4_vaccinazione___lt) {
        this.cd4_vaccinazione___lt = cd4_vaccinazione___lt;
    }

    public Integer getCd4_vaccinazione___lte() {
        return cd4_vaccinazione___lte;
    }
    public void setCd4_vaccinazione___lte(Integer cd4_vaccinazione___lte) {
        this.cd4_vaccinazione___lte = cd4_vaccinazione___lte;
    }

    public Integer getCd4_vaccinazione___gt() {
        return cd4_vaccinazione___gt;
    }
    public void setCd4_vaccinazione___gt(Integer cd4_vaccinazione___gt) {
        this.cd4_vaccinazione___gt = cd4_vaccinazione___gt;
    }

    public Integer getCd4_vaccinazione___gte() {
        return cd4_vaccinazione___gte;
    }
    public void setCd4_vaccinazione___gte(Integer cd4_vaccinazione___gte) {
        this.cd4_vaccinazione___gte = cd4_vaccinazione___gte;
    }

    public String getCentro_prov___eq() {
        return centro_prov___eq;
    }
    public void setCentro_prov___eq(String centro_prov___eq) {
        this.centro_prov___eq = centro_prov___eq;
    }

    public String getCentro_prov___ne() {
        return centro_prov___ne;
    }
    public void setCentro_prov___ne(String centro_prov___ne) {
        this.centro_prov___ne = centro_prov___ne;
    }

    public Boolean getCentro_prov___null() {
        return centro_prov___null;
    }
    public void setCentro_prov___null(Boolean centro_prov___null) {
        this.centro_prov___null = centro_prov___null;
    }

    public Boolean getCentro_prov___not___null() {
        return centro_prov___not___null;
    }
    public void setCentro_prov___not___null(Boolean centro_prov___not___null) {
        this.centro_prov___not___null = centro_prov___not___null;
    }

    public java.util.List<String> getCentro_prov___in() {
        return centro_prov___in;
    }
    public void setCentro_prov___in(java.util.List<String> centro_prov___in) {
        this.centro_prov___in = centro_prov___in;
    }

    public java.util.List<String> getCentro_prov___not___in() {
        return centro_prov___not___in;
    }
    public void setCentro_prov___not___in(java.util.List<String> centro_prov___not___in) {
        this.centro_prov___not___in = centro_prov___not___in;
    }

    public String getCentro_prov___lt() {
        return centro_prov___lt;
    }
    public void setCentro_prov___lt(String centro_prov___lt) {
        this.centro_prov___lt = centro_prov___lt;
    }

    public String getCentro_prov___lte() {
        return centro_prov___lte;
    }
    public void setCentro_prov___lte(String centro_prov___lte) {
        this.centro_prov___lte = centro_prov___lte;
    }

    public String getCentro_prov___gt() {
        return centro_prov___gt;
    }
    public void setCentro_prov___gt(String centro_prov___gt) {
        this.centro_prov___gt = centro_prov___gt;
    }

    public String getCentro_prov___gte() {
        return centro_prov___gte;
    }
    public void setCentro_prov___gte(String centro_prov___gte) {
        this.centro_prov___gte = centro_prov___gte;
    }

    public String getCentro_prov___contains() {
        return centro_prov___contains;
    }
    public void setCentro_prov___contains(String centro_prov___contains) {
        this.centro_prov___contains = centro_prov___contains;
    }

    public String getCentro_prov___not___contains() {
        return centro_prov___not___contains;
    }
    public void setCentro_prov___not___contains(String centro_prov___not___contains) {
        this.centro_prov___not___contains = centro_prov___not___contains;
    }

    public String getCentro_prov___starts_with() {
        return centro_prov___starts_with;
    }
    public void setCentro_prov___starts_with(String centro_prov___starts_with) {
        this.centro_prov___starts_with = centro_prov___starts_with;
    }

    public String getCentro_prov___not___starts_with() {
        return centro_prov___not___starts_with;
    }
    public void setCentro_prov___not___starts_with(String centro_prov___not___starts_with) {
        this.centro_prov___not___starts_with = centro_prov___not___starts_with;
    }

    public String getCentro_prov___ends_with() {
        return centro_prov___ends_with;
    }
    public void setCentro_prov___ends_with(String centro_prov___ends_with) {
        this.centro_prov___ends_with = centro_prov___ends_with;
    }

    public String getCentro_prov___not___ends_with() {
        return centro_prov___not___ends_with;
    }
    public void setCentro_prov___not___ends_with(String centro_prov___not___ends_with) {
        this.centro_prov___not___ends_with = centro_prov___not___ends_with;
    }

    public Boolean getChemsex___eq() {
        return chemsex___eq;
    }
    public void setChemsex___eq(Boolean chemsex___eq) {
        this.chemsex___eq = chemsex___eq;
    }

    public Boolean getChemsex___ne() {
        return chemsex___ne;
    }
    public void setChemsex___ne(Boolean chemsex___ne) {
        this.chemsex___ne = chemsex___ne;
    }

    public Boolean getChemsex___null() {
        return chemsex___null;
    }
    public void setChemsex___null(Boolean chemsex___null) {
        this.chemsex___null = chemsex___null;
    }

    public Boolean getChemsex___not___null() {
        return chemsex___not___null;
    }
    public void setChemsex___not___null(Boolean chemsex___not___null) {
        this.chemsex___not___null = chemsex___not___null;
    }

    public Boolean getChlamydia___eq() {
        return chlamydia___eq;
    }
    public void setChlamydia___eq(Boolean chlamydia___eq) {
        this.chlamydia___eq = chlamydia___eq;
    }

    public Boolean getChlamydia___ne() {
        return chlamydia___ne;
    }
    public void setChlamydia___ne(Boolean chlamydia___ne) {
        this.chlamydia___ne = chlamydia___ne;
    }

    public Boolean getChlamydia___null() {
        return chlamydia___null;
    }
    public void setChlamydia___null(Boolean chlamydia___null) {
        this.chlamydia___null = chlamydia___null;
    }

    public Boolean getChlamydia___not___null() {
        return chlamydia___not___null;
    }
    public void setChlamydia___not___null(Boolean chlamydia___not___null) {
        this.chlamydia___not___null = chlamydia___not___null;
    }

    public Boolean getContatti_mpox___eq() {
        return contatti_mpox___eq;
    }
    public void setContatti_mpox___eq(Boolean contatti_mpox___eq) {
        this.contatti_mpox___eq = contatti_mpox___eq;
    }

    public Boolean getContatti_mpox___ne() {
        return contatti_mpox___ne;
    }
    public void setContatti_mpox___ne(Boolean contatti_mpox___ne) {
        this.contatti_mpox___ne = contatti_mpox___ne;
    }

    public Boolean getContatti_mpox___null() {
        return contatti_mpox___null;
    }
    public void setContatti_mpox___null(Boolean contatti_mpox___null) {
        this.contatti_mpox___null = contatti_mpox___null;
    }

    public Boolean getContatti_mpox___not___null() {
        return contatti_mpox___not___null;
    }
    public void setContatti_mpox___not___null(Boolean contatti_mpox___not___null) {
        this.contatti_mpox___not___null = contatti_mpox___not___null;
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

    public String getData_chlamydia___eq() {
        return data_chlamydia___eq;
    }
    public void setData_chlamydia___eq(String data_chlamydia___eq) {
        this.data_chlamydia___eq = data_chlamydia___eq;
    }

    public String getData_chlamydia___ne() {
        return data_chlamydia___ne;
    }
    public void setData_chlamydia___ne(String data_chlamydia___ne) {
        this.data_chlamydia___ne = data_chlamydia___ne;
    }

    public Boolean getData_chlamydia___null() {
        return data_chlamydia___null;
    }
    public void setData_chlamydia___null(Boolean data_chlamydia___null) {
        this.data_chlamydia___null = data_chlamydia___null;
    }

    public Boolean getData_chlamydia___not___null() {
        return data_chlamydia___not___null;
    }
    public void setData_chlamydia___not___null(Boolean data_chlamydia___not___null) {
        this.data_chlamydia___not___null = data_chlamydia___not___null;
    }

    public java.util.List<String> getData_chlamydia___in() {
        return data_chlamydia___in;
    }
    public void setData_chlamydia___in(java.util.List<String> data_chlamydia___in) {
        this.data_chlamydia___in = data_chlamydia___in;
    }

    public java.util.List<String> getData_chlamydia___not___in() {
        return data_chlamydia___not___in;
    }
    public void setData_chlamydia___not___in(java.util.List<String> data_chlamydia___not___in) {
        this.data_chlamydia___not___in = data_chlamydia___not___in;
    }

    public String getData_chlamydia___lt() {
        return data_chlamydia___lt;
    }
    public void setData_chlamydia___lt(String data_chlamydia___lt) {
        this.data_chlamydia___lt = data_chlamydia___lt;
    }

    public String getData_chlamydia___lte() {
        return data_chlamydia___lte;
    }
    public void setData_chlamydia___lte(String data_chlamydia___lte) {
        this.data_chlamydia___lte = data_chlamydia___lte;
    }

    public String getData_chlamydia___gt() {
        return data_chlamydia___gt;
    }
    public void setData_chlamydia___gt(String data_chlamydia___gt) {
        this.data_chlamydia___gt = data_chlamydia___gt;
    }

    public String getData_chlamydia___gte() {
        return data_chlamydia___gte;
    }
    public void setData_chlamydia___gte(String data_chlamydia___gte) {
        this.data_chlamydia___gte = data_chlamydia___gte;
    }

    public String getData_contatto_mpox___eq() {
        return data_contatto_mpox___eq;
    }
    public void setData_contatto_mpox___eq(String data_contatto_mpox___eq) {
        this.data_contatto_mpox___eq = data_contatto_mpox___eq;
    }

    public String getData_contatto_mpox___ne() {
        return data_contatto_mpox___ne;
    }
    public void setData_contatto_mpox___ne(String data_contatto_mpox___ne) {
        this.data_contatto_mpox___ne = data_contatto_mpox___ne;
    }

    public Boolean getData_contatto_mpox___null() {
        return data_contatto_mpox___null;
    }
    public void setData_contatto_mpox___null(Boolean data_contatto_mpox___null) {
        this.data_contatto_mpox___null = data_contatto_mpox___null;
    }

    public Boolean getData_contatto_mpox___not___null() {
        return data_contatto_mpox___not___null;
    }
    public void setData_contatto_mpox___not___null(Boolean data_contatto_mpox___not___null) {
        this.data_contatto_mpox___not___null = data_contatto_mpox___not___null;
    }

    public java.util.List<String> getData_contatto_mpox___in() {
        return data_contatto_mpox___in;
    }
    public void setData_contatto_mpox___in(java.util.List<String> data_contatto_mpox___in) {
        this.data_contatto_mpox___in = data_contatto_mpox___in;
    }

    public java.util.List<String> getData_contatto_mpox___not___in() {
        return data_contatto_mpox___not___in;
    }
    public void setData_contatto_mpox___not___in(java.util.List<String> data_contatto_mpox___not___in) {
        this.data_contatto_mpox___not___in = data_contatto_mpox___not___in;
    }

    public String getData_contatto_mpox___lt() {
        return data_contatto_mpox___lt;
    }
    public void setData_contatto_mpox___lt(String data_contatto_mpox___lt) {
        this.data_contatto_mpox___lt = data_contatto_mpox___lt;
    }

    public String getData_contatto_mpox___lte() {
        return data_contatto_mpox___lte;
    }
    public void setData_contatto_mpox___lte(String data_contatto_mpox___lte) {
        this.data_contatto_mpox___lte = data_contatto_mpox___lte;
    }

    public String getData_contatto_mpox___gt() {
        return data_contatto_mpox___gt;
    }
    public void setData_contatto_mpox___gt(String data_contatto_mpox___gt) {
        this.data_contatto_mpox___gt = data_contatto_mpox___gt;
    }

    public String getData_contatto_mpox___gte() {
        return data_contatto_mpox___gte;
    }
    public void setData_contatto_mpox___gte(String data_contatto_mpox___gte) {
        this.data_contatto_mpox___gte = data_contatto_mpox___gte;
    }

    public String getData_gonorrea___eq() {
        return data_gonorrea___eq;
    }
    public void setData_gonorrea___eq(String data_gonorrea___eq) {
        this.data_gonorrea___eq = data_gonorrea___eq;
    }

    public String getData_gonorrea___ne() {
        return data_gonorrea___ne;
    }
    public void setData_gonorrea___ne(String data_gonorrea___ne) {
        this.data_gonorrea___ne = data_gonorrea___ne;
    }

    public Boolean getData_gonorrea___null() {
        return data_gonorrea___null;
    }
    public void setData_gonorrea___null(Boolean data_gonorrea___null) {
        this.data_gonorrea___null = data_gonorrea___null;
    }

    public Boolean getData_gonorrea___not___null() {
        return data_gonorrea___not___null;
    }
    public void setData_gonorrea___not___null(Boolean data_gonorrea___not___null) {
        this.data_gonorrea___not___null = data_gonorrea___not___null;
    }

    public java.util.List<String> getData_gonorrea___in() {
        return data_gonorrea___in;
    }
    public void setData_gonorrea___in(java.util.List<String> data_gonorrea___in) {
        this.data_gonorrea___in = data_gonorrea___in;
    }

    public java.util.List<String> getData_gonorrea___not___in() {
        return data_gonorrea___not___in;
    }
    public void setData_gonorrea___not___in(java.util.List<String> data_gonorrea___not___in) {
        this.data_gonorrea___not___in = data_gonorrea___not___in;
    }

    public String getData_gonorrea___lt() {
        return data_gonorrea___lt;
    }
    public void setData_gonorrea___lt(String data_gonorrea___lt) {
        this.data_gonorrea___lt = data_gonorrea___lt;
    }

    public String getData_gonorrea___lte() {
        return data_gonorrea___lte;
    }
    public void setData_gonorrea___lte(String data_gonorrea___lte) {
        this.data_gonorrea___lte = data_gonorrea___lte;
    }

    public String getData_gonorrea___gt() {
        return data_gonorrea___gt;
    }
    public void setData_gonorrea___gt(String data_gonorrea___gt) {
        this.data_gonorrea___gt = data_gonorrea___gt;
    }

    public String getData_gonorrea___gte() {
        return data_gonorrea___gte;
    }
    public void setData_gonorrea___gte(String data_gonorrea___gte) {
        this.data_gonorrea___gte = data_gonorrea___gte;
    }

    public String getData_hpv___eq() {
        return data_hpv___eq;
    }
    public void setData_hpv___eq(String data_hpv___eq) {
        this.data_hpv___eq = data_hpv___eq;
    }

    public String getData_hpv___ne() {
        return data_hpv___ne;
    }
    public void setData_hpv___ne(String data_hpv___ne) {
        this.data_hpv___ne = data_hpv___ne;
    }

    public Boolean getData_hpv___null() {
        return data_hpv___null;
    }
    public void setData_hpv___null(Boolean data_hpv___null) {
        this.data_hpv___null = data_hpv___null;
    }

    public Boolean getData_hpv___not___null() {
        return data_hpv___not___null;
    }
    public void setData_hpv___not___null(Boolean data_hpv___not___null) {
        this.data_hpv___not___null = data_hpv___not___null;
    }

    public java.util.List<String> getData_hpv___in() {
        return data_hpv___in;
    }
    public void setData_hpv___in(java.util.List<String> data_hpv___in) {
        this.data_hpv___in = data_hpv___in;
    }

    public java.util.List<String> getData_hpv___not___in() {
        return data_hpv___not___in;
    }
    public void setData_hpv___not___in(java.util.List<String> data_hpv___not___in) {
        this.data_hpv___not___in = data_hpv___not___in;
    }

    public String getData_hpv___lt() {
        return data_hpv___lt;
    }
    public void setData_hpv___lt(String data_hpv___lt) {
        this.data_hpv___lt = data_hpv___lt;
    }

    public String getData_hpv___lte() {
        return data_hpv___lte;
    }
    public void setData_hpv___lte(String data_hpv___lte) {
        this.data_hpv___lte = data_hpv___lte;
    }

    public String getData_hpv___gt() {
        return data_hpv___gt;
    }
    public void setData_hpv___gt(String data_hpv___gt) {
        this.data_hpv___gt = data_hpv___gt;
    }

    public String getData_hpv___gte() {
        return data_hpv___gte;
    }
    public void setData_hpv___gte(String data_hpv___gte) {
        this.data_hpv___gte = data_hpv___gte;
    }

    public String getData_mvabn_pre1___eq() {
        return data_mvabn_pre1___eq;
    }
    public void setData_mvabn_pre1___eq(String data_mvabn_pre1___eq) {
        this.data_mvabn_pre1___eq = data_mvabn_pre1___eq;
    }

    public String getData_mvabn_pre1___ne() {
        return data_mvabn_pre1___ne;
    }
    public void setData_mvabn_pre1___ne(String data_mvabn_pre1___ne) {
        this.data_mvabn_pre1___ne = data_mvabn_pre1___ne;
    }

    public Boolean getData_mvabn_pre1___null() {
        return data_mvabn_pre1___null;
    }
    public void setData_mvabn_pre1___null(Boolean data_mvabn_pre1___null) {
        this.data_mvabn_pre1___null = data_mvabn_pre1___null;
    }

    public Boolean getData_mvabn_pre1___not___null() {
        return data_mvabn_pre1___not___null;
    }
    public void setData_mvabn_pre1___not___null(Boolean data_mvabn_pre1___not___null) {
        this.data_mvabn_pre1___not___null = data_mvabn_pre1___not___null;
    }

    public java.util.List<String> getData_mvabn_pre1___in() {
        return data_mvabn_pre1___in;
    }
    public void setData_mvabn_pre1___in(java.util.List<String> data_mvabn_pre1___in) {
        this.data_mvabn_pre1___in = data_mvabn_pre1___in;
    }

    public java.util.List<String> getData_mvabn_pre1___not___in() {
        return data_mvabn_pre1___not___in;
    }
    public void setData_mvabn_pre1___not___in(java.util.List<String> data_mvabn_pre1___not___in) {
        this.data_mvabn_pre1___not___in = data_mvabn_pre1___not___in;
    }

    public String getData_mvabn_pre1___lt() {
        return data_mvabn_pre1___lt;
    }
    public void setData_mvabn_pre1___lt(String data_mvabn_pre1___lt) {
        this.data_mvabn_pre1___lt = data_mvabn_pre1___lt;
    }

    public String getData_mvabn_pre1___lte() {
        return data_mvabn_pre1___lte;
    }
    public void setData_mvabn_pre1___lte(String data_mvabn_pre1___lte) {
        this.data_mvabn_pre1___lte = data_mvabn_pre1___lte;
    }

    public String getData_mvabn_pre1___gt() {
        return data_mvabn_pre1___gt;
    }
    public void setData_mvabn_pre1___gt(String data_mvabn_pre1___gt) {
        this.data_mvabn_pre1___gt = data_mvabn_pre1___gt;
    }

    public String getData_mvabn_pre1___gte() {
        return data_mvabn_pre1___gte;
    }
    public void setData_mvabn_pre1___gte(String data_mvabn_pre1___gte) {
        this.data_mvabn_pre1___gte = data_mvabn_pre1___gte;
    }

    public String getData_mvabn_pre2___eq() {
        return data_mvabn_pre2___eq;
    }
    public void setData_mvabn_pre2___eq(String data_mvabn_pre2___eq) {
        this.data_mvabn_pre2___eq = data_mvabn_pre2___eq;
    }

    public String getData_mvabn_pre2___ne() {
        return data_mvabn_pre2___ne;
    }
    public void setData_mvabn_pre2___ne(String data_mvabn_pre2___ne) {
        this.data_mvabn_pre2___ne = data_mvabn_pre2___ne;
    }

    public Boolean getData_mvabn_pre2___null() {
        return data_mvabn_pre2___null;
    }
    public void setData_mvabn_pre2___null(Boolean data_mvabn_pre2___null) {
        this.data_mvabn_pre2___null = data_mvabn_pre2___null;
    }

    public Boolean getData_mvabn_pre2___not___null() {
        return data_mvabn_pre2___not___null;
    }
    public void setData_mvabn_pre2___not___null(Boolean data_mvabn_pre2___not___null) {
        this.data_mvabn_pre2___not___null = data_mvabn_pre2___not___null;
    }

    public java.util.List<String> getData_mvabn_pre2___in() {
        return data_mvabn_pre2___in;
    }
    public void setData_mvabn_pre2___in(java.util.List<String> data_mvabn_pre2___in) {
        this.data_mvabn_pre2___in = data_mvabn_pre2___in;
    }

    public java.util.List<String> getData_mvabn_pre2___not___in() {
        return data_mvabn_pre2___not___in;
    }
    public void setData_mvabn_pre2___not___in(java.util.List<String> data_mvabn_pre2___not___in) {
        this.data_mvabn_pre2___not___in = data_mvabn_pre2___not___in;
    }

    public String getData_mvabn_pre2___lt() {
        return data_mvabn_pre2___lt;
    }
    public void setData_mvabn_pre2___lt(String data_mvabn_pre2___lt) {
        this.data_mvabn_pre2___lt = data_mvabn_pre2___lt;
    }

    public String getData_mvabn_pre2___lte() {
        return data_mvabn_pre2___lte;
    }
    public void setData_mvabn_pre2___lte(String data_mvabn_pre2___lte) {
        this.data_mvabn_pre2___lte = data_mvabn_pre2___lte;
    }

    public String getData_mvabn_pre2___gt() {
        return data_mvabn_pre2___gt;
    }
    public void setData_mvabn_pre2___gt(String data_mvabn_pre2___gt) {
        this.data_mvabn_pre2___gt = data_mvabn_pre2___gt;
    }

    public String getData_mvabn_pre2___gte() {
        return data_mvabn_pre2___gte;
    }
    public void setData_mvabn_pre2___gte(String data_mvabn_pre2___gte) {
        this.data_mvabn_pre2___gte = data_mvabn_pre2___gte;
    }

    public String getData_sifilide___eq() {
        return data_sifilide___eq;
    }
    public void setData_sifilide___eq(String data_sifilide___eq) {
        this.data_sifilide___eq = data_sifilide___eq;
    }

    public String getData_sifilide___ne() {
        return data_sifilide___ne;
    }
    public void setData_sifilide___ne(String data_sifilide___ne) {
        this.data_sifilide___ne = data_sifilide___ne;
    }

    public Boolean getData_sifilide___null() {
        return data_sifilide___null;
    }
    public void setData_sifilide___null(Boolean data_sifilide___null) {
        this.data_sifilide___null = data_sifilide___null;
    }

    public Boolean getData_sifilide___not___null() {
        return data_sifilide___not___null;
    }
    public void setData_sifilide___not___null(Boolean data_sifilide___not___null) {
        this.data_sifilide___not___null = data_sifilide___not___null;
    }

    public java.util.List<String> getData_sifilide___in() {
        return data_sifilide___in;
    }
    public void setData_sifilide___in(java.util.List<String> data_sifilide___in) {
        this.data_sifilide___in = data_sifilide___in;
    }

    public java.util.List<String> getData_sifilide___not___in() {
        return data_sifilide___not___in;
    }
    public void setData_sifilide___not___in(java.util.List<String> data_sifilide___not___in) {
        this.data_sifilide___not___in = data_sifilide___not___in;
    }

    public String getData_sifilide___lt() {
        return data_sifilide___lt;
    }
    public void setData_sifilide___lt(String data_sifilide___lt) {
        this.data_sifilide___lt = data_sifilide___lt;
    }

    public String getData_sifilide___lte() {
        return data_sifilide___lte;
    }
    public void setData_sifilide___lte(String data_sifilide___lte) {
        this.data_sifilide___lte = data_sifilide___lte;
    }

    public String getData_sifilide___gt() {
        return data_sifilide___gt;
    }
    public void setData_sifilide___gt(String data_sifilide___gt) {
        this.data_sifilide___gt = data_sifilide___gt;
    }

    public String getData_sifilide___gte() {
        return data_sifilide___gte;
    }
    public void setData_sifilide___gte(String data_sifilide___gte) {
        this.data_sifilide___gte = data_sifilide___gte;
    }

    public Boolean getGonorrea___eq() {
        return gonorrea___eq;
    }
    public void setGonorrea___eq(Boolean gonorrea___eq) {
        this.gonorrea___eq = gonorrea___eq;
    }

    public Boolean getGonorrea___ne() {
        return gonorrea___ne;
    }
    public void setGonorrea___ne(Boolean gonorrea___ne) {
        this.gonorrea___ne = gonorrea___ne;
    }

    public Boolean getGonorrea___null() {
        return gonorrea___null;
    }
    public void setGonorrea___null(Boolean gonorrea___null) {
        this.gonorrea___null = gonorrea___null;
    }

    public Boolean getGonorrea___not___null() {
        return gonorrea___not___null;
    }
    public void setGonorrea___not___null(Boolean gonorrea___not___null) {
        this.gonorrea___not___null = gonorrea___not___null;
    }

    public String getGruppo_appartenenza___eq() {
        return gruppo_appartenenza___eq;
    }
    public void setGruppo_appartenenza___eq(String gruppo_appartenenza___eq) {
        this.gruppo_appartenenza___eq = gruppo_appartenenza___eq;
    }

    public String getGruppo_appartenenza___ne() {
        return gruppo_appartenenza___ne;
    }
    public void setGruppo_appartenenza___ne(String gruppo_appartenenza___ne) {
        this.gruppo_appartenenza___ne = gruppo_appartenenza___ne;
    }

    public Boolean getGruppo_appartenenza___null() {
        return gruppo_appartenenza___null;
    }
    public void setGruppo_appartenenza___null(Boolean gruppo_appartenenza___null) {
        this.gruppo_appartenenza___null = gruppo_appartenenza___null;
    }

    public Boolean getGruppo_appartenenza___not___null() {
        return gruppo_appartenenza___not___null;
    }
    public void setGruppo_appartenenza___not___null(Boolean gruppo_appartenenza___not___null) {
        this.gruppo_appartenenza___not___null = gruppo_appartenenza___not___null;
    }

    public java.util.List<String> getGruppo_appartenenza___in() {
        return gruppo_appartenenza___in;
    }
    public void setGruppo_appartenenza___in(java.util.List<String> gruppo_appartenenza___in) {
        this.gruppo_appartenenza___in = gruppo_appartenenza___in;
    }

    public java.util.List<String> getGruppo_appartenenza___not___in() {
        return gruppo_appartenenza___not___in;
    }
    public void setGruppo_appartenenza___not___in(java.util.List<String> gruppo_appartenenza___not___in) {
        this.gruppo_appartenenza___not___in = gruppo_appartenenza___not___in;
    }

    public String getGruppo_appartenenza___lt() {
        return gruppo_appartenenza___lt;
    }
    public void setGruppo_appartenenza___lt(String gruppo_appartenenza___lt) {
        this.gruppo_appartenenza___lt = gruppo_appartenenza___lt;
    }

    public String getGruppo_appartenenza___lte() {
        return gruppo_appartenenza___lte;
    }
    public void setGruppo_appartenenza___lte(String gruppo_appartenenza___lte) {
        this.gruppo_appartenenza___lte = gruppo_appartenenza___lte;
    }

    public String getGruppo_appartenenza___gt() {
        return gruppo_appartenenza___gt;
    }
    public void setGruppo_appartenenza___gt(String gruppo_appartenenza___gt) {
        this.gruppo_appartenenza___gt = gruppo_appartenenza___gt;
    }

    public String getGruppo_appartenenza___gte() {
        return gruppo_appartenenza___gte;
    }
    public void setGruppo_appartenenza___gte(String gruppo_appartenenza___gte) {
        this.gruppo_appartenenza___gte = gruppo_appartenenza___gte;
    }

    public String getGruppo_appartenenza___contains() {
        return gruppo_appartenenza___contains;
    }
    public void setGruppo_appartenenza___contains(String gruppo_appartenenza___contains) {
        this.gruppo_appartenenza___contains = gruppo_appartenenza___contains;
    }

    public String getGruppo_appartenenza___not___contains() {
        return gruppo_appartenenza___not___contains;
    }
    public void setGruppo_appartenenza___not___contains(String gruppo_appartenenza___not___contains) {
        this.gruppo_appartenenza___not___contains = gruppo_appartenenza___not___contains;
    }

    public String getGruppo_appartenenza___starts_with() {
        return gruppo_appartenenza___starts_with;
    }
    public void setGruppo_appartenenza___starts_with(String gruppo_appartenenza___starts_with) {
        this.gruppo_appartenenza___starts_with = gruppo_appartenenza___starts_with;
    }

    public String getGruppo_appartenenza___not___starts_with() {
        return gruppo_appartenenza___not___starts_with;
    }
    public void setGruppo_appartenenza___not___starts_with(String gruppo_appartenenza___not___starts_with) {
        this.gruppo_appartenenza___not___starts_with = gruppo_appartenenza___not___starts_with;
    }

    public String getGruppo_appartenenza___ends_with() {
        return gruppo_appartenenza___ends_with;
    }
    public void setGruppo_appartenenza___ends_with(String gruppo_appartenenza___ends_with) {
        this.gruppo_appartenenza___ends_with = gruppo_appartenenza___ends_with;
    }

    public String getGruppo_appartenenza___not___ends_with() {
        return gruppo_appartenenza___not___ends_with;
    }
    public void setGruppo_appartenenza___not___ends_with(String gruppo_appartenenza___not___ends_with) {
        this.gruppo_appartenenza___not___ends_with = gruppo_appartenenza___not___ends_with;
    }

    public Boolean getHiv___eq() {
        return hiv___eq;
    }
    public void setHiv___eq(Boolean hiv___eq) {
        this.hiv___eq = hiv___eq;
    }

    public Boolean getHiv___ne() {
        return hiv___ne;
    }
    public void setHiv___ne(Boolean hiv___ne) {
        this.hiv___ne = hiv___ne;
    }

    public Boolean getHiv___null() {
        return hiv___null;
    }
    public void setHiv___null(Boolean hiv___null) {
        this.hiv___null = hiv___null;
    }

    public Boolean getHiv___not___null() {
        return hiv___not___null;
    }
    public void setHiv___not___null(Boolean hiv___not___null) {
        this.hiv___not___null = hiv___not___null;
    }

    public Integer getHivrna_vaccinazione___eq() {
        return hivrna_vaccinazione___eq;
    }
    public void setHivrna_vaccinazione___eq(Integer hivrna_vaccinazione___eq) {
        this.hivrna_vaccinazione___eq = hivrna_vaccinazione___eq;
    }

    public Integer getHivrna_vaccinazione___ne() {
        return hivrna_vaccinazione___ne;
    }
    public void setHivrna_vaccinazione___ne(Integer hivrna_vaccinazione___ne) {
        this.hivrna_vaccinazione___ne = hivrna_vaccinazione___ne;
    }

    public Boolean getHivrna_vaccinazione___null() {
        return hivrna_vaccinazione___null;
    }
    public void setHivrna_vaccinazione___null(Boolean hivrna_vaccinazione___null) {
        this.hivrna_vaccinazione___null = hivrna_vaccinazione___null;
    }

    public Boolean getHivrna_vaccinazione___not___null() {
        return hivrna_vaccinazione___not___null;
    }
    public void setHivrna_vaccinazione___not___null(Boolean hivrna_vaccinazione___not___null) {
        this.hivrna_vaccinazione___not___null = hivrna_vaccinazione___not___null;
    }

    public java.util.List<Integer> getHivrna_vaccinazione___in() {
        return hivrna_vaccinazione___in;
    }
    public void setHivrna_vaccinazione___in(java.util.List<Integer> hivrna_vaccinazione___in) {
        this.hivrna_vaccinazione___in = hivrna_vaccinazione___in;
    }

    public java.util.List<Integer> getHivrna_vaccinazione___not___in() {
        return hivrna_vaccinazione___not___in;
    }
    public void setHivrna_vaccinazione___not___in(java.util.List<Integer> hivrna_vaccinazione___not___in) {
        this.hivrna_vaccinazione___not___in = hivrna_vaccinazione___not___in;
    }

    public Integer getHivrna_vaccinazione___lt() {
        return hivrna_vaccinazione___lt;
    }
    public void setHivrna_vaccinazione___lt(Integer hivrna_vaccinazione___lt) {
        this.hivrna_vaccinazione___lt = hivrna_vaccinazione___lt;
    }

    public Integer getHivrna_vaccinazione___lte() {
        return hivrna_vaccinazione___lte;
    }
    public void setHivrna_vaccinazione___lte(Integer hivrna_vaccinazione___lte) {
        this.hivrna_vaccinazione___lte = hivrna_vaccinazione___lte;
    }

    public Integer getHivrna_vaccinazione___gt() {
        return hivrna_vaccinazione___gt;
    }
    public void setHivrna_vaccinazione___gt(Integer hivrna_vaccinazione___gt) {
        this.hivrna_vaccinazione___gt = hivrna_vaccinazione___gt;
    }

    public Integer getHivrna_vaccinazione___gte() {
        return hivrna_vaccinazione___gte;
    }
    public void setHivrna_vaccinazione___gte(Integer hivrna_vaccinazione___gte) {
        this.hivrna_vaccinazione___gte = hivrna_vaccinazione___gte;
    }

    public Boolean getHpv___eq() {
        return hpv___eq;
    }
    public void setHpv___eq(Boolean hpv___eq) {
        this.hpv___eq = hpv___eq;
    }

    public Boolean getHpv___ne() {
        return hpv___ne;
    }
    public void setHpv___ne(Boolean hpv___ne) {
        this.hpv___ne = hpv___ne;
    }

    public Boolean getHpv___null() {
        return hpv___null;
    }
    public void setHpv___null(Boolean hpv___null) {
        this.hpv___null = hpv___null;
    }

    public Boolean getHpv___not___null() {
        return hpv___not___null;
    }
    public void setHpv___not___null(Boolean hpv___not___null) {
        this.hpv___not___null = hpv___not___null;
    }

    public Boolean getMst___eq() {
        return mst___eq;
    }
    public void setMst___eq(Boolean mst___eq) {
        this.mst___eq = mst___eq;
    }

    public Boolean getMst___ne() {
        return mst___ne;
    }
    public void setMst___ne(Boolean mst___ne) {
        this.mst___ne = mst___ne;
    }

    public Boolean getMst___null() {
        return mst___null;
    }
    public void setMst___null(Boolean mst___null) {
        this.mst___null = mst___null;
    }

    public Boolean getMst___not___null() {
        return mst___not___null;
    }
    public void setMst___not___null(Boolean mst___not___null) {
        this.mst___not___null = mst___not___null;
    }

    public String getNote_ricovero___eq() {
        return note_ricovero___eq;
    }
    public void setNote_ricovero___eq(String note_ricovero___eq) {
        this.note_ricovero___eq = note_ricovero___eq;
    }

    public String getNote_ricovero___ne() {
        return note_ricovero___ne;
    }
    public void setNote_ricovero___ne(String note_ricovero___ne) {
        this.note_ricovero___ne = note_ricovero___ne;
    }

    public Boolean getNote_ricovero___null() {
        return note_ricovero___null;
    }
    public void setNote_ricovero___null(Boolean note_ricovero___null) {
        this.note_ricovero___null = note_ricovero___null;
    }

    public Boolean getNote_ricovero___not___null() {
        return note_ricovero___not___null;
    }
    public void setNote_ricovero___not___null(Boolean note_ricovero___not___null) {
        this.note_ricovero___not___null = note_ricovero___not___null;
    }

    public java.util.List<String> getNote_ricovero___in() {
        return note_ricovero___in;
    }
    public void setNote_ricovero___in(java.util.List<String> note_ricovero___in) {
        this.note_ricovero___in = note_ricovero___in;
    }

    public java.util.List<String> getNote_ricovero___not___in() {
        return note_ricovero___not___in;
    }
    public void setNote_ricovero___not___in(java.util.List<String> note_ricovero___not___in) {
        this.note_ricovero___not___in = note_ricovero___not___in;
    }

    public String getNote_ricovero___lt() {
        return note_ricovero___lt;
    }
    public void setNote_ricovero___lt(String note_ricovero___lt) {
        this.note_ricovero___lt = note_ricovero___lt;
    }

    public String getNote_ricovero___lte() {
        return note_ricovero___lte;
    }
    public void setNote_ricovero___lte(String note_ricovero___lte) {
        this.note_ricovero___lte = note_ricovero___lte;
    }

    public String getNote_ricovero___gt() {
        return note_ricovero___gt;
    }
    public void setNote_ricovero___gt(String note_ricovero___gt) {
        this.note_ricovero___gt = note_ricovero___gt;
    }

    public String getNote_ricovero___gte() {
        return note_ricovero___gte;
    }
    public void setNote_ricovero___gte(String note_ricovero___gte) {
        this.note_ricovero___gte = note_ricovero___gte;
    }

    public String getNote_ricovero___contains() {
        return note_ricovero___contains;
    }
    public void setNote_ricovero___contains(String note_ricovero___contains) {
        this.note_ricovero___contains = note_ricovero___contains;
    }

    public String getNote_ricovero___not___contains() {
        return note_ricovero___not___contains;
    }
    public void setNote_ricovero___not___contains(String note_ricovero___not___contains) {
        this.note_ricovero___not___contains = note_ricovero___not___contains;
    }

    public String getNote_ricovero___starts_with() {
        return note_ricovero___starts_with;
    }
    public void setNote_ricovero___starts_with(String note_ricovero___starts_with) {
        this.note_ricovero___starts_with = note_ricovero___starts_with;
    }

    public String getNote_ricovero___not___starts_with() {
        return note_ricovero___not___starts_with;
    }
    public void setNote_ricovero___not___starts_with(String note_ricovero___not___starts_with) {
        this.note_ricovero___not___starts_with = note_ricovero___not___starts_with;
    }

    public String getNote_ricovero___ends_with() {
        return note_ricovero___ends_with;
    }
    public void setNote_ricovero___ends_with(String note_ricovero___ends_with) {
        this.note_ricovero___ends_with = note_ricovero___ends_with;
    }

    public String getNote_ricovero___not___ends_with() {
        return note_ricovero___not___ends_with;
    }
    public void setNote_ricovero___not___ends_with(String note_ricovero___not___ends_with) {
        this.note_ricovero___not___ends_with = note_ricovero___not___ends_with;
    }

    public Integer getNum_dosi_mvabn___eq() {
        return num_dosi_mvabn___eq;
    }
    public void setNum_dosi_mvabn___eq(Integer num_dosi_mvabn___eq) {
        this.num_dosi_mvabn___eq = num_dosi_mvabn___eq;
    }

    public Integer getNum_dosi_mvabn___ne() {
        return num_dosi_mvabn___ne;
    }
    public void setNum_dosi_mvabn___ne(Integer num_dosi_mvabn___ne) {
        this.num_dosi_mvabn___ne = num_dosi_mvabn___ne;
    }

    public Boolean getNum_dosi_mvabn___null() {
        return num_dosi_mvabn___null;
    }
    public void setNum_dosi_mvabn___null(Boolean num_dosi_mvabn___null) {
        this.num_dosi_mvabn___null = num_dosi_mvabn___null;
    }

    public Boolean getNum_dosi_mvabn___not___null() {
        return num_dosi_mvabn___not___null;
    }
    public void setNum_dosi_mvabn___not___null(Boolean num_dosi_mvabn___not___null) {
        this.num_dosi_mvabn___not___null = num_dosi_mvabn___not___null;
    }

    public java.util.List<Integer> getNum_dosi_mvabn___in() {
        return num_dosi_mvabn___in;
    }
    public void setNum_dosi_mvabn___in(java.util.List<Integer> num_dosi_mvabn___in) {
        this.num_dosi_mvabn___in = num_dosi_mvabn___in;
    }

    public java.util.List<Integer> getNum_dosi_mvabn___not___in() {
        return num_dosi_mvabn___not___in;
    }
    public void setNum_dosi_mvabn___not___in(java.util.List<Integer> num_dosi_mvabn___not___in) {
        this.num_dosi_mvabn___not___in = num_dosi_mvabn___not___in;
    }

    public Integer getNum_dosi_mvabn___lt() {
        return num_dosi_mvabn___lt;
    }
    public void setNum_dosi_mvabn___lt(Integer num_dosi_mvabn___lt) {
        this.num_dosi_mvabn___lt = num_dosi_mvabn___lt;
    }

    public Integer getNum_dosi_mvabn___lte() {
        return num_dosi_mvabn___lte;
    }
    public void setNum_dosi_mvabn___lte(Integer num_dosi_mvabn___lte) {
        this.num_dosi_mvabn___lte = num_dosi_mvabn___lte;
    }

    public Integer getNum_dosi_mvabn___gt() {
        return num_dosi_mvabn___gt;
    }
    public void setNum_dosi_mvabn___gt(Integer num_dosi_mvabn___gt) {
        this.num_dosi_mvabn___gt = num_dosi_mvabn___gt;
    }

    public Integer getNum_dosi_mvabn___gte() {
        return num_dosi_mvabn___gte;
    }
    public void setNum_dosi_mvabn___gte(Integer num_dosi_mvabn___gte) {
        this.num_dosi_mvabn___gte = num_dosi_mvabn___gte;
    }

    public Integer getNum_visite___eq() {
        return num_visite___eq;
    }
    public void setNum_visite___eq(Integer num_visite___eq) {
        this.num_visite___eq = num_visite___eq;
    }

    public Integer getNum_visite___ne() {
        return num_visite___ne;
    }
    public void setNum_visite___ne(Integer num_visite___ne) {
        this.num_visite___ne = num_visite___ne;
    }

    public Boolean getNum_visite___null() {
        return num_visite___null;
    }
    public void setNum_visite___null(Boolean num_visite___null) {
        this.num_visite___null = num_visite___null;
    }

    public Boolean getNum_visite___not___null() {
        return num_visite___not___null;
    }
    public void setNum_visite___not___null(Boolean num_visite___not___null) {
        this.num_visite___not___null = num_visite___not___null;
    }

    public java.util.List<Integer> getNum_visite___in() {
        return num_visite___in;
    }
    public void setNum_visite___in(java.util.List<Integer> num_visite___in) {
        this.num_visite___in = num_visite___in;
    }

    public java.util.List<Integer> getNum_visite___not___in() {
        return num_visite___not___in;
    }
    public void setNum_visite___not___in(java.util.List<Integer> num_visite___not___in) {
        this.num_visite___not___in = num_visite___not___in;
    }

    public Integer getNum_visite___lt() {
        return num_visite___lt;
    }
    public void setNum_visite___lt(Integer num_visite___lt) {
        this.num_visite___lt = num_visite___lt;
    }

    public Integer getNum_visite___lte() {
        return num_visite___lte;
    }
    public void setNum_visite___lte(Integer num_visite___lte) {
        this.num_visite___lte = num_visite___lte;
    }

    public Integer getNum_visite___gt() {
        return num_visite___gt;
    }
    public void setNum_visite___gt(Integer num_visite___gt) {
        this.num_visite___gt = num_visite___gt;
    }

    public Integer getNum_visite___gte() {
        return num_visite___gte;
    }
    public void setNum_visite___gte(Integer num_visite___gte) {
        this.num_visite___gte = num_visite___gte;
    }

    public String getPaziente_ico___eq() {
        return paziente_ico___eq;
    }
    public void setPaziente_ico___eq(String paziente_ico___eq) {
        this.paziente_ico___eq = paziente_ico___eq;
    }

    public String getPaziente_ico___ne() {
        return paziente_ico___ne;
    }
    public void setPaziente_ico___ne(String paziente_ico___ne) {
        this.paziente_ico___ne = paziente_ico___ne;
    }

    public Boolean getPaziente_ico___null() {
        return paziente_ico___null;
    }
    public void setPaziente_ico___null(Boolean paziente_ico___null) {
        this.paziente_ico___null = paziente_ico___null;
    }

    public Boolean getPaziente_ico___not___null() {
        return paziente_ico___not___null;
    }
    public void setPaziente_ico___not___null(Boolean paziente_ico___not___null) {
        this.paziente_ico___not___null = paziente_ico___not___null;
    }

    public java.util.List<String> getPaziente_ico___in() {
        return paziente_ico___in;
    }
    public void setPaziente_ico___in(java.util.List<String> paziente_ico___in) {
        this.paziente_ico___in = paziente_ico___in;
    }

    public java.util.List<String> getPaziente_ico___not___in() {
        return paziente_ico___not___in;
    }
    public void setPaziente_ico___not___in(java.util.List<String> paziente_ico___not___in) {
        this.paziente_ico___not___in = paziente_ico___not___in;
    }

    public String getPaziente_ico___lt() {
        return paziente_ico___lt;
    }
    public void setPaziente_ico___lt(String paziente_ico___lt) {
        this.paziente_ico___lt = paziente_ico___lt;
    }

    public String getPaziente_ico___lte() {
        return paziente_ico___lte;
    }
    public void setPaziente_ico___lte(String paziente_ico___lte) {
        this.paziente_ico___lte = paziente_ico___lte;
    }

    public String getPaziente_ico___gt() {
        return paziente_ico___gt;
    }
    public void setPaziente_ico___gt(String paziente_ico___gt) {
        this.paziente_ico___gt = paziente_ico___gt;
    }

    public String getPaziente_ico___gte() {
        return paziente_ico___gte;
    }
    public void setPaziente_ico___gte(String paziente_ico___gte) {
        this.paziente_ico___gte = paziente_ico___gte;
    }

    public String getPaziente_ico___contains() {
        return paziente_ico___contains;
    }
    public void setPaziente_ico___contains(String paziente_ico___contains) {
        this.paziente_ico___contains = paziente_ico___contains;
    }

    public String getPaziente_ico___not___contains() {
        return paziente_ico___not___contains;
    }
    public void setPaziente_ico___not___contains(String paziente_ico___not___contains) {
        this.paziente_ico___not___contains = paziente_ico___not___contains;
    }

    public String getPaziente_ico___starts_with() {
        return paziente_ico___starts_with;
    }
    public void setPaziente_ico___starts_with(String paziente_ico___starts_with) {
        this.paziente_ico___starts_with = paziente_ico___starts_with;
    }

    public String getPaziente_ico___not___starts_with() {
        return paziente_ico___not___starts_with;
    }
    public void setPaziente_ico___not___starts_with(String paziente_ico___not___starts_with) {
        this.paziente_ico___not___starts_with = paziente_ico___not___starts_with;
    }

    public String getPaziente_ico___ends_with() {
        return paziente_ico___ends_with;
    }
    public void setPaziente_ico___ends_with(String paziente_ico___ends_with) {
        this.paziente_ico___ends_with = paziente_ico___ends_with;
    }

    public String getPaziente_ico___not___ends_with() {
        return paziente_ico___not___ends_with;
    }
    public void setPaziente_ico___not___ends_with(String paziente_ico___not___ends_with) {
        this.paziente_ico___not___ends_with = paziente_ico___not___ends_with;
    }

    public Boolean getRicovero___eq() {
        return ricovero___eq;
    }
    public void setRicovero___eq(Boolean ricovero___eq) {
        this.ricovero___eq = ricovero___eq;
    }

    public Boolean getRicovero___ne() {
        return ricovero___ne;
    }
    public void setRicovero___ne(Boolean ricovero___ne) {
        this.ricovero___ne = ricovero___ne;
    }

    public Boolean getRicovero___null() {
        return ricovero___null;
    }
    public void setRicovero___null(Boolean ricovero___null) {
        this.ricovero___null = ricovero___null;
    }

    public Boolean getRicovero___not___null() {
        return ricovero___not___null;
    }
    public void setRicovero___not___null(Boolean ricovero___not___null) {
        this.ricovero___not___null = ricovero___not___null;
    }

    public Boolean getSifilide___eq() {
        return sifilide___eq;
    }
    public void setSifilide___eq(Boolean sifilide___eq) {
        this.sifilide___eq = sifilide___eq;
    }

    public Boolean getSifilide___ne() {
        return sifilide___ne;
    }
    public void setSifilide___ne(Boolean sifilide___ne) {
        this.sifilide___ne = sifilide___ne;
    }

    public Boolean getSifilide___null() {
        return sifilide___null;
    }
    public void setSifilide___null(Boolean sifilide___null) {
        this.sifilide___null = sifilide___null;
    }

    public Boolean getSifilide___not___null() {
        return sifilide___not___null;
    }
    public void setSifilide___not___null(Boolean sifilide___not___null) {
        this.sifilide___not___null = sifilide___not___null;
    }

    public String getTipo_visita___eq() {
        return tipo_visita___eq;
    }
    public void setTipo_visita___eq(String tipo_visita___eq) {
        this.tipo_visita___eq = tipo_visita___eq;
    }

    public String getTipo_visita___ne() {
        return tipo_visita___ne;
    }
    public void setTipo_visita___ne(String tipo_visita___ne) {
        this.tipo_visita___ne = tipo_visita___ne;
    }

    public Boolean getTipo_visita___null() {
        return tipo_visita___null;
    }
    public void setTipo_visita___null(Boolean tipo_visita___null) {
        this.tipo_visita___null = tipo_visita___null;
    }

    public Boolean getTipo_visita___not___null() {
        return tipo_visita___not___null;
    }
    public void setTipo_visita___not___null(Boolean tipo_visita___not___null) {
        this.tipo_visita___not___null = tipo_visita___not___null;
    }

    public java.util.List<String> getTipo_visita___in() {
        return tipo_visita___in;
    }
    public void setTipo_visita___in(java.util.List<String> tipo_visita___in) {
        this.tipo_visita___in = tipo_visita___in;
    }

    public java.util.List<String> getTipo_visita___not___in() {
        return tipo_visita___not___in;
    }
    public void setTipo_visita___not___in(java.util.List<String> tipo_visita___not___in) {
        this.tipo_visita___not___in = tipo_visita___not___in;
    }

    public String getTipo_visita___lt() {
        return tipo_visita___lt;
    }
    public void setTipo_visita___lt(String tipo_visita___lt) {
        this.tipo_visita___lt = tipo_visita___lt;
    }

    public String getTipo_visita___lte() {
        return tipo_visita___lte;
    }
    public void setTipo_visita___lte(String tipo_visita___lte) {
        this.tipo_visita___lte = tipo_visita___lte;
    }

    public String getTipo_visita___gt() {
        return tipo_visita___gt;
    }
    public void setTipo_visita___gt(String tipo_visita___gt) {
        this.tipo_visita___gt = tipo_visita___gt;
    }

    public String getTipo_visita___gte() {
        return tipo_visita___gte;
    }
    public void setTipo_visita___gte(String tipo_visita___gte) {
        this.tipo_visita___gte = tipo_visita___gte;
    }

    public String getTipo_visita___contains() {
        return tipo_visita___contains;
    }
    public void setTipo_visita___contains(String tipo_visita___contains) {
        this.tipo_visita___contains = tipo_visita___contains;
    }

    public String getTipo_visita___not___contains() {
        return tipo_visita___not___contains;
    }
    public void setTipo_visita___not___contains(String tipo_visita___not___contains) {
        this.tipo_visita___not___contains = tipo_visita___not___contains;
    }

    public String getTipo_visita___starts_with() {
        return tipo_visita___starts_with;
    }
    public void setTipo_visita___starts_with(String tipo_visita___starts_with) {
        this.tipo_visita___starts_with = tipo_visita___starts_with;
    }

    public String getTipo_visita___not___starts_with() {
        return tipo_visita___not___starts_with;
    }
    public void setTipo_visita___not___starts_with(String tipo_visita___not___starts_with) {
        this.tipo_visita___not___starts_with = tipo_visita___not___starts_with;
    }

    public String getTipo_visita___ends_with() {
        return tipo_visita___ends_with;
    }
    public void setTipo_visita___ends_with(String tipo_visita___ends_with) {
        this.tipo_visita___ends_with = tipo_visita___ends_with;
    }

    public String getTipo_visita___not___ends_with() {
        return tipo_visita___not___ends_with;
    }
    public void setTipo_visita___not___ends_with(String tipo_visita___not___ends_with) {
        this.tipo_visita___not___ends_with = tipo_visita___not___ends_with;
    }

    public String getTipo_visita_booster___eq() {
        return tipo_visita_booster___eq;
    }
    public void setTipo_visita_booster___eq(String tipo_visita_booster___eq) {
        this.tipo_visita_booster___eq = tipo_visita_booster___eq;
    }

    public String getTipo_visita_booster___ne() {
        return tipo_visita_booster___ne;
    }
    public void setTipo_visita_booster___ne(String tipo_visita_booster___ne) {
        this.tipo_visita_booster___ne = tipo_visita_booster___ne;
    }

    public Boolean getTipo_visita_booster___null() {
        return tipo_visita_booster___null;
    }
    public void setTipo_visita_booster___null(Boolean tipo_visita_booster___null) {
        this.tipo_visita_booster___null = tipo_visita_booster___null;
    }

    public Boolean getTipo_visita_booster___not___null() {
        return tipo_visita_booster___not___null;
    }
    public void setTipo_visita_booster___not___null(Boolean tipo_visita_booster___not___null) {
        this.tipo_visita_booster___not___null = tipo_visita_booster___not___null;
    }

    public java.util.List<String> getTipo_visita_booster___in() {
        return tipo_visita_booster___in;
    }
    public void setTipo_visita_booster___in(java.util.List<String> tipo_visita_booster___in) {
        this.tipo_visita_booster___in = tipo_visita_booster___in;
    }

    public java.util.List<String> getTipo_visita_booster___not___in() {
        return tipo_visita_booster___not___in;
    }
    public void setTipo_visita_booster___not___in(java.util.List<String> tipo_visita_booster___not___in) {
        this.tipo_visita_booster___not___in = tipo_visita_booster___not___in;
    }

    public String getTipo_visita_booster___lt() {
        return tipo_visita_booster___lt;
    }
    public void setTipo_visita_booster___lt(String tipo_visita_booster___lt) {
        this.tipo_visita_booster___lt = tipo_visita_booster___lt;
    }

    public String getTipo_visita_booster___lte() {
        return tipo_visita_booster___lte;
    }
    public void setTipo_visita_booster___lte(String tipo_visita_booster___lte) {
        this.tipo_visita_booster___lte = tipo_visita_booster___lte;
    }

    public String getTipo_visita_booster___gt() {
        return tipo_visita_booster___gt;
    }
    public void setTipo_visita_booster___gt(String tipo_visita_booster___gt) {
        this.tipo_visita_booster___gt = tipo_visita_booster___gt;
    }

    public String getTipo_visita_booster___gte() {
        return tipo_visita_booster___gte;
    }
    public void setTipo_visita_booster___gte(String tipo_visita_booster___gte) {
        this.tipo_visita_booster___gte = tipo_visita_booster___gte;
    }

    public String getTipo_visita_booster___contains() {
        return tipo_visita_booster___contains;
    }
    public void setTipo_visita_booster___contains(String tipo_visita_booster___contains) {
        this.tipo_visita_booster___contains = tipo_visita_booster___contains;
    }

    public String getTipo_visita_booster___not___contains() {
        return tipo_visita_booster___not___contains;
    }
    public void setTipo_visita_booster___not___contains(String tipo_visita_booster___not___contains) {
        this.tipo_visita_booster___not___contains = tipo_visita_booster___not___contains;
    }

    public String getTipo_visita_booster___starts_with() {
        return tipo_visita_booster___starts_with;
    }
    public void setTipo_visita_booster___starts_with(String tipo_visita_booster___starts_with) {
        this.tipo_visita_booster___starts_with = tipo_visita_booster___starts_with;
    }

    public String getTipo_visita_booster___not___starts_with() {
        return tipo_visita_booster___not___starts_with;
    }
    public void setTipo_visita_booster___not___starts_with(String tipo_visita_booster___not___starts_with) {
        this.tipo_visita_booster___not___starts_with = tipo_visita_booster___not___starts_with;
    }

    public String getTipo_visita_booster___ends_with() {
        return tipo_visita_booster___ends_with;
    }
    public void setTipo_visita_booster___ends_with(String tipo_visita_booster___ends_with) {
        this.tipo_visita_booster___ends_with = tipo_visita_booster___ends_with;
    }

    public String getTipo_visita_booster___not___ends_with() {
        return tipo_visita_booster___not___ends_with;
    }
    public void setTipo_visita_booster___not___ends_with(String tipo_visita_booster___not___ends_with) {
        this.tipo_visita_booster___not___ends_with = tipo_visita_booster___not___ends_with;
    }

    public String getVac_mvabn_22_23___eq() {
        return vac_mvabn_22_23___eq;
    }
    public void setVac_mvabn_22_23___eq(String vac_mvabn_22_23___eq) {
        this.vac_mvabn_22_23___eq = vac_mvabn_22_23___eq;
    }

    public String getVac_mvabn_22_23___ne() {
        return vac_mvabn_22_23___ne;
    }
    public void setVac_mvabn_22_23___ne(String vac_mvabn_22_23___ne) {
        this.vac_mvabn_22_23___ne = vac_mvabn_22_23___ne;
    }

    public Boolean getVac_mvabn_22_23___null() {
        return vac_mvabn_22_23___null;
    }
    public void setVac_mvabn_22_23___null(Boolean vac_mvabn_22_23___null) {
        this.vac_mvabn_22_23___null = vac_mvabn_22_23___null;
    }

    public Boolean getVac_mvabn_22_23___not___null() {
        return vac_mvabn_22_23___not___null;
    }
    public void setVac_mvabn_22_23___not___null(Boolean vac_mvabn_22_23___not___null) {
        this.vac_mvabn_22_23___not___null = vac_mvabn_22_23___not___null;
    }

    public java.util.List<String> getVac_mvabn_22_23___in() {
        return vac_mvabn_22_23___in;
    }
    public void setVac_mvabn_22_23___in(java.util.List<String> vac_mvabn_22_23___in) {
        this.vac_mvabn_22_23___in = vac_mvabn_22_23___in;
    }

    public java.util.List<String> getVac_mvabn_22_23___not___in() {
        return vac_mvabn_22_23___not___in;
    }
    public void setVac_mvabn_22_23___not___in(java.util.List<String> vac_mvabn_22_23___not___in) {
        this.vac_mvabn_22_23___not___in = vac_mvabn_22_23___not___in;
    }

    public String getVac_mvabn_22_23___lt() {
        return vac_mvabn_22_23___lt;
    }
    public void setVac_mvabn_22_23___lt(String vac_mvabn_22_23___lt) {
        this.vac_mvabn_22_23___lt = vac_mvabn_22_23___lt;
    }

    public String getVac_mvabn_22_23___lte() {
        return vac_mvabn_22_23___lte;
    }
    public void setVac_mvabn_22_23___lte(String vac_mvabn_22_23___lte) {
        this.vac_mvabn_22_23___lte = vac_mvabn_22_23___lte;
    }

    public String getVac_mvabn_22_23___gt() {
        return vac_mvabn_22_23___gt;
    }
    public void setVac_mvabn_22_23___gt(String vac_mvabn_22_23___gt) {
        this.vac_mvabn_22_23___gt = vac_mvabn_22_23___gt;
    }

    public String getVac_mvabn_22_23___gte() {
        return vac_mvabn_22_23___gte;
    }
    public void setVac_mvabn_22_23___gte(String vac_mvabn_22_23___gte) {
        this.vac_mvabn_22_23___gte = vac_mvabn_22_23___gte;
    }

    public String getVac_mvabn_22_23___contains() {
        return vac_mvabn_22_23___contains;
    }
    public void setVac_mvabn_22_23___contains(String vac_mvabn_22_23___contains) {
        this.vac_mvabn_22_23___contains = vac_mvabn_22_23___contains;
    }

    public String getVac_mvabn_22_23___not___contains() {
        return vac_mvabn_22_23___not___contains;
    }
    public void setVac_mvabn_22_23___not___contains(String vac_mvabn_22_23___not___contains) {
        this.vac_mvabn_22_23___not___contains = vac_mvabn_22_23___not___contains;
    }

    public String getVac_mvabn_22_23___starts_with() {
        return vac_mvabn_22_23___starts_with;
    }
    public void setVac_mvabn_22_23___starts_with(String vac_mvabn_22_23___starts_with) {
        this.vac_mvabn_22_23___starts_with = vac_mvabn_22_23___starts_with;
    }

    public String getVac_mvabn_22_23___not___starts_with() {
        return vac_mvabn_22_23___not___starts_with;
    }
    public void setVac_mvabn_22_23___not___starts_with(String vac_mvabn_22_23___not___starts_with) {
        this.vac_mvabn_22_23___not___starts_with = vac_mvabn_22_23___not___starts_with;
    }

    public String getVac_mvabn_22_23___ends_with() {
        return vac_mvabn_22_23___ends_with;
    }
    public void setVac_mvabn_22_23___ends_with(String vac_mvabn_22_23___ends_with) {
        this.vac_mvabn_22_23___ends_with = vac_mvabn_22_23___ends_with;
    }

    public String getVac_mvabn_22_23___not___ends_with() {
        return vac_mvabn_22_23___not___ends_with;
    }
    public void setVac_mvabn_22_23___not___ends_with(String vac_mvabn_22_23___not___ends_with) {
        this.vac_mvabn_22_23___not___ends_with = vac_mvabn_22_23___not___ends_with;
    }

    public String getVac_vaiolo_pre___eq() {
        return vac_vaiolo_pre___eq;
    }
    public void setVac_vaiolo_pre___eq(String vac_vaiolo_pre___eq) {
        this.vac_vaiolo_pre___eq = vac_vaiolo_pre___eq;
    }

    public String getVac_vaiolo_pre___ne() {
        return vac_vaiolo_pre___ne;
    }
    public void setVac_vaiolo_pre___ne(String vac_vaiolo_pre___ne) {
        this.vac_vaiolo_pre___ne = vac_vaiolo_pre___ne;
    }

    public Boolean getVac_vaiolo_pre___null() {
        return vac_vaiolo_pre___null;
    }
    public void setVac_vaiolo_pre___null(Boolean vac_vaiolo_pre___null) {
        this.vac_vaiolo_pre___null = vac_vaiolo_pre___null;
    }

    public Boolean getVac_vaiolo_pre___not___null() {
        return vac_vaiolo_pre___not___null;
    }
    public void setVac_vaiolo_pre___not___null(Boolean vac_vaiolo_pre___not___null) {
        this.vac_vaiolo_pre___not___null = vac_vaiolo_pre___not___null;
    }

    public java.util.List<String> getVac_vaiolo_pre___in() {
        return vac_vaiolo_pre___in;
    }
    public void setVac_vaiolo_pre___in(java.util.List<String> vac_vaiolo_pre___in) {
        this.vac_vaiolo_pre___in = vac_vaiolo_pre___in;
    }

    public java.util.List<String> getVac_vaiolo_pre___not___in() {
        return vac_vaiolo_pre___not___in;
    }
    public void setVac_vaiolo_pre___not___in(java.util.List<String> vac_vaiolo_pre___not___in) {
        this.vac_vaiolo_pre___not___in = vac_vaiolo_pre___not___in;
    }

    public String getVac_vaiolo_pre___lt() {
        return vac_vaiolo_pre___lt;
    }
    public void setVac_vaiolo_pre___lt(String vac_vaiolo_pre___lt) {
        this.vac_vaiolo_pre___lt = vac_vaiolo_pre___lt;
    }

    public String getVac_vaiolo_pre___lte() {
        return vac_vaiolo_pre___lte;
    }
    public void setVac_vaiolo_pre___lte(String vac_vaiolo_pre___lte) {
        this.vac_vaiolo_pre___lte = vac_vaiolo_pre___lte;
    }

    public String getVac_vaiolo_pre___gt() {
        return vac_vaiolo_pre___gt;
    }
    public void setVac_vaiolo_pre___gt(String vac_vaiolo_pre___gt) {
        this.vac_vaiolo_pre___gt = vac_vaiolo_pre___gt;
    }

    public String getVac_vaiolo_pre___gte() {
        return vac_vaiolo_pre___gte;
    }
    public void setVac_vaiolo_pre___gte(String vac_vaiolo_pre___gte) {
        this.vac_vaiolo_pre___gte = vac_vaiolo_pre___gte;
    }

    public String getVac_vaiolo_pre___contains() {
        return vac_vaiolo_pre___contains;
    }
    public void setVac_vaiolo_pre___contains(String vac_vaiolo_pre___contains) {
        this.vac_vaiolo_pre___contains = vac_vaiolo_pre___contains;
    }

    public String getVac_vaiolo_pre___not___contains() {
        return vac_vaiolo_pre___not___contains;
    }
    public void setVac_vaiolo_pre___not___contains(String vac_vaiolo_pre___not___contains) {
        this.vac_vaiolo_pre___not___contains = vac_vaiolo_pre___not___contains;
    }

    public String getVac_vaiolo_pre___starts_with() {
        return vac_vaiolo_pre___starts_with;
    }
    public void setVac_vaiolo_pre___starts_with(String vac_vaiolo_pre___starts_with) {
        this.vac_vaiolo_pre___starts_with = vac_vaiolo_pre___starts_with;
    }

    public String getVac_vaiolo_pre___not___starts_with() {
        return vac_vaiolo_pre___not___starts_with;
    }
    public void setVac_vaiolo_pre___not___starts_with(String vac_vaiolo_pre___not___starts_with) {
        this.vac_vaiolo_pre___not___starts_with = vac_vaiolo_pre___not___starts_with;
    }

    public String getVac_vaiolo_pre___ends_with() {
        return vac_vaiolo_pre___ends_with;
    }
    public void setVac_vaiolo_pre___ends_with(String vac_vaiolo_pre___ends_with) {
        this.vac_vaiolo_pre___ends_with = vac_vaiolo_pre___ends_with;
    }

    public String getVac_vaiolo_pre___not___ends_with() {
        return vac_vaiolo_pre___not___ends_with;
    }
    public void setVac_vaiolo_pre___not___ends_with(String vac_vaiolo_pre___not___ends_with) {
        this.vac_vaiolo_pre___not___ends_with = vac_vaiolo_pre___not___ends_with;
    }

    public java.util.List<CliVisita_mpvFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliVisita_mpvFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliVisita_mpvFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliVisita_mpvFilterDTO> OR) {
        this.OR = OR;
    }

    public CliVisita_mpvFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliVisita_mpvFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
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
        if (arruolamento___eq != null) {
            joiner.add("arruolamento___eq: " + GraphQLRequestSerializer.getEntry(arruolamento___eq));
        }
        if (arruolamento___ne != null) {
            joiner.add("arruolamento___ne: " + GraphQLRequestSerializer.getEntry(arruolamento___ne));
        }
        if (arruolamento___null != null) {
            joiner.add("arruolamento___null: " + GraphQLRequestSerializer.getEntry(arruolamento___null));
        }
        if (arruolamento___not___null != null) {
            joiner.add("arruolamento___not___null: " + GraphQLRequestSerializer.getEntry(arruolamento___not___null));
        }
        if (arruolamento_effettuato___eq != null) {
            joiner.add("arruolamento_effettuato___eq: " + GraphQLRequestSerializer.getEntry(arruolamento_effettuato___eq));
        }
        if (arruolamento_effettuato___ne != null) {
            joiner.add("arruolamento_effettuato___ne: " + GraphQLRequestSerializer.getEntry(arruolamento_effettuato___ne));
        }
        if (arruolamento_effettuato___null != null) {
            joiner.add("arruolamento_effettuato___null: " + GraphQLRequestSerializer.getEntry(arruolamento_effettuato___null));
        }
        if (arruolamento_effettuato___not___null != null) {
            joiner.add("arruolamento_effettuato___not___null: " + GraphQLRequestSerializer.getEntry(arruolamento_effettuato___not___null));
        }
        if (cd4_vaccinazione___eq != null) {
            joiner.add("cd4_vaccinazione___eq: " + GraphQLRequestSerializer.getEntry(cd4_vaccinazione___eq));
        }
        if (cd4_vaccinazione___ne != null) {
            joiner.add("cd4_vaccinazione___ne: " + GraphQLRequestSerializer.getEntry(cd4_vaccinazione___ne));
        }
        if (cd4_vaccinazione___null != null) {
            joiner.add("cd4_vaccinazione___null: " + GraphQLRequestSerializer.getEntry(cd4_vaccinazione___null));
        }
        if (cd4_vaccinazione___not___null != null) {
            joiner.add("cd4_vaccinazione___not___null: " + GraphQLRequestSerializer.getEntry(cd4_vaccinazione___not___null));
        }
        if (cd4_vaccinazione___in != null) {
            joiner.add("cd4_vaccinazione___in: " + GraphQLRequestSerializer.getEntry(cd4_vaccinazione___in));
        }
        if (cd4_vaccinazione___not___in != null) {
            joiner.add("cd4_vaccinazione___not___in: " + GraphQLRequestSerializer.getEntry(cd4_vaccinazione___not___in));
        }
        if (cd4_vaccinazione___lt != null) {
            joiner.add("cd4_vaccinazione___lt: " + GraphQLRequestSerializer.getEntry(cd4_vaccinazione___lt));
        }
        if (cd4_vaccinazione___lte != null) {
            joiner.add("cd4_vaccinazione___lte: " + GraphQLRequestSerializer.getEntry(cd4_vaccinazione___lte));
        }
        if (cd4_vaccinazione___gt != null) {
            joiner.add("cd4_vaccinazione___gt: " + GraphQLRequestSerializer.getEntry(cd4_vaccinazione___gt));
        }
        if (cd4_vaccinazione___gte != null) {
            joiner.add("cd4_vaccinazione___gte: " + GraphQLRequestSerializer.getEntry(cd4_vaccinazione___gte));
        }
        if (centro_prov___eq != null) {
            joiner.add("centro_prov___eq: " + GraphQLRequestSerializer.getEntry(centro_prov___eq));
        }
        if (centro_prov___ne != null) {
            joiner.add("centro_prov___ne: " + GraphQLRequestSerializer.getEntry(centro_prov___ne));
        }
        if (centro_prov___null != null) {
            joiner.add("centro_prov___null: " + GraphQLRequestSerializer.getEntry(centro_prov___null));
        }
        if (centro_prov___not___null != null) {
            joiner.add("centro_prov___not___null: " + GraphQLRequestSerializer.getEntry(centro_prov___not___null));
        }
        if (centro_prov___in != null) {
            joiner.add("centro_prov___in: " + GraphQLRequestSerializer.getEntry(centro_prov___in));
        }
        if (centro_prov___not___in != null) {
            joiner.add("centro_prov___not___in: " + GraphQLRequestSerializer.getEntry(centro_prov___not___in));
        }
        if (centro_prov___lt != null) {
            joiner.add("centro_prov___lt: " + GraphQLRequestSerializer.getEntry(centro_prov___lt));
        }
        if (centro_prov___lte != null) {
            joiner.add("centro_prov___lte: " + GraphQLRequestSerializer.getEntry(centro_prov___lte));
        }
        if (centro_prov___gt != null) {
            joiner.add("centro_prov___gt: " + GraphQLRequestSerializer.getEntry(centro_prov___gt));
        }
        if (centro_prov___gte != null) {
            joiner.add("centro_prov___gte: " + GraphQLRequestSerializer.getEntry(centro_prov___gte));
        }
        if (centro_prov___contains != null) {
            joiner.add("centro_prov___contains: " + GraphQLRequestSerializer.getEntry(centro_prov___contains));
        }
        if (centro_prov___not___contains != null) {
            joiner.add("centro_prov___not___contains: " + GraphQLRequestSerializer.getEntry(centro_prov___not___contains));
        }
        if (centro_prov___starts_with != null) {
            joiner.add("centro_prov___starts_with: " + GraphQLRequestSerializer.getEntry(centro_prov___starts_with));
        }
        if (centro_prov___not___starts_with != null) {
            joiner.add("centro_prov___not___starts_with: " + GraphQLRequestSerializer.getEntry(centro_prov___not___starts_with));
        }
        if (centro_prov___ends_with != null) {
            joiner.add("centro_prov___ends_with: " + GraphQLRequestSerializer.getEntry(centro_prov___ends_with));
        }
        if (centro_prov___not___ends_with != null) {
            joiner.add("centro_prov___not___ends_with: " + GraphQLRequestSerializer.getEntry(centro_prov___not___ends_with));
        }
        if (chemsex___eq != null) {
            joiner.add("chemsex___eq: " + GraphQLRequestSerializer.getEntry(chemsex___eq));
        }
        if (chemsex___ne != null) {
            joiner.add("chemsex___ne: " + GraphQLRequestSerializer.getEntry(chemsex___ne));
        }
        if (chemsex___null != null) {
            joiner.add("chemsex___null: " + GraphQLRequestSerializer.getEntry(chemsex___null));
        }
        if (chemsex___not___null != null) {
            joiner.add("chemsex___not___null: " + GraphQLRequestSerializer.getEntry(chemsex___not___null));
        }
        if (chlamydia___eq != null) {
            joiner.add("chlamydia___eq: " + GraphQLRequestSerializer.getEntry(chlamydia___eq));
        }
        if (chlamydia___ne != null) {
            joiner.add("chlamydia___ne: " + GraphQLRequestSerializer.getEntry(chlamydia___ne));
        }
        if (chlamydia___null != null) {
            joiner.add("chlamydia___null: " + GraphQLRequestSerializer.getEntry(chlamydia___null));
        }
        if (chlamydia___not___null != null) {
            joiner.add("chlamydia___not___null: " + GraphQLRequestSerializer.getEntry(chlamydia___not___null));
        }
        if (contatti_mpox___eq != null) {
            joiner.add("contatti_mpox___eq: " + GraphQLRequestSerializer.getEntry(contatti_mpox___eq));
        }
        if (contatti_mpox___ne != null) {
            joiner.add("contatti_mpox___ne: " + GraphQLRequestSerializer.getEntry(contatti_mpox___ne));
        }
        if (contatti_mpox___null != null) {
            joiner.add("contatti_mpox___null: " + GraphQLRequestSerializer.getEntry(contatti_mpox___null));
        }
        if (contatti_mpox___not___null != null) {
            joiner.add("contatti_mpox___not___null: " + GraphQLRequestSerializer.getEntry(contatti_mpox___not___null));
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
        if (data_chlamydia___eq != null) {
            joiner.add("data_chlamydia___eq: " + GraphQLRequestSerializer.getEntry(data_chlamydia___eq));
        }
        if (data_chlamydia___ne != null) {
            joiner.add("data_chlamydia___ne: " + GraphQLRequestSerializer.getEntry(data_chlamydia___ne));
        }
        if (data_chlamydia___null != null) {
            joiner.add("data_chlamydia___null: " + GraphQLRequestSerializer.getEntry(data_chlamydia___null));
        }
        if (data_chlamydia___not___null != null) {
            joiner.add("data_chlamydia___not___null: " + GraphQLRequestSerializer.getEntry(data_chlamydia___not___null));
        }
        if (data_chlamydia___in != null) {
            joiner.add("data_chlamydia___in: " + GraphQLRequestSerializer.getEntry(data_chlamydia___in));
        }
        if (data_chlamydia___not___in != null) {
            joiner.add("data_chlamydia___not___in: " + GraphQLRequestSerializer.getEntry(data_chlamydia___not___in));
        }
        if (data_chlamydia___lt != null) {
            joiner.add("data_chlamydia___lt: " + GraphQLRequestSerializer.getEntry(data_chlamydia___lt));
        }
        if (data_chlamydia___lte != null) {
            joiner.add("data_chlamydia___lte: " + GraphQLRequestSerializer.getEntry(data_chlamydia___lte));
        }
        if (data_chlamydia___gt != null) {
            joiner.add("data_chlamydia___gt: " + GraphQLRequestSerializer.getEntry(data_chlamydia___gt));
        }
        if (data_chlamydia___gte != null) {
            joiner.add("data_chlamydia___gte: " + GraphQLRequestSerializer.getEntry(data_chlamydia___gte));
        }
        if (data_contatto_mpox___eq != null) {
            joiner.add("data_contatto_mpox___eq: " + GraphQLRequestSerializer.getEntry(data_contatto_mpox___eq));
        }
        if (data_contatto_mpox___ne != null) {
            joiner.add("data_contatto_mpox___ne: " + GraphQLRequestSerializer.getEntry(data_contatto_mpox___ne));
        }
        if (data_contatto_mpox___null != null) {
            joiner.add("data_contatto_mpox___null: " + GraphQLRequestSerializer.getEntry(data_contatto_mpox___null));
        }
        if (data_contatto_mpox___not___null != null) {
            joiner.add("data_contatto_mpox___not___null: " + GraphQLRequestSerializer.getEntry(data_contatto_mpox___not___null));
        }
        if (data_contatto_mpox___in != null) {
            joiner.add("data_contatto_mpox___in: " + GraphQLRequestSerializer.getEntry(data_contatto_mpox___in));
        }
        if (data_contatto_mpox___not___in != null) {
            joiner.add("data_contatto_mpox___not___in: " + GraphQLRequestSerializer.getEntry(data_contatto_mpox___not___in));
        }
        if (data_contatto_mpox___lt != null) {
            joiner.add("data_contatto_mpox___lt: " + GraphQLRequestSerializer.getEntry(data_contatto_mpox___lt));
        }
        if (data_contatto_mpox___lte != null) {
            joiner.add("data_contatto_mpox___lte: " + GraphQLRequestSerializer.getEntry(data_contatto_mpox___lte));
        }
        if (data_contatto_mpox___gt != null) {
            joiner.add("data_contatto_mpox___gt: " + GraphQLRequestSerializer.getEntry(data_contatto_mpox___gt));
        }
        if (data_contatto_mpox___gte != null) {
            joiner.add("data_contatto_mpox___gte: " + GraphQLRequestSerializer.getEntry(data_contatto_mpox___gte));
        }
        if (data_gonorrea___eq != null) {
            joiner.add("data_gonorrea___eq: " + GraphQLRequestSerializer.getEntry(data_gonorrea___eq));
        }
        if (data_gonorrea___ne != null) {
            joiner.add("data_gonorrea___ne: " + GraphQLRequestSerializer.getEntry(data_gonorrea___ne));
        }
        if (data_gonorrea___null != null) {
            joiner.add("data_gonorrea___null: " + GraphQLRequestSerializer.getEntry(data_gonorrea___null));
        }
        if (data_gonorrea___not___null != null) {
            joiner.add("data_gonorrea___not___null: " + GraphQLRequestSerializer.getEntry(data_gonorrea___not___null));
        }
        if (data_gonorrea___in != null) {
            joiner.add("data_gonorrea___in: " + GraphQLRequestSerializer.getEntry(data_gonorrea___in));
        }
        if (data_gonorrea___not___in != null) {
            joiner.add("data_gonorrea___not___in: " + GraphQLRequestSerializer.getEntry(data_gonorrea___not___in));
        }
        if (data_gonorrea___lt != null) {
            joiner.add("data_gonorrea___lt: " + GraphQLRequestSerializer.getEntry(data_gonorrea___lt));
        }
        if (data_gonorrea___lte != null) {
            joiner.add("data_gonorrea___lte: " + GraphQLRequestSerializer.getEntry(data_gonorrea___lte));
        }
        if (data_gonorrea___gt != null) {
            joiner.add("data_gonorrea___gt: " + GraphQLRequestSerializer.getEntry(data_gonorrea___gt));
        }
        if (data_gonorrea___gte != null) {
            joiner.add("data_gonorrea___gte: " + GraphQLRequestSerializer.getEntry(data_gonorrea___gte));
        }
        if (data_hpv___eq != null) {
            joiner.add("data_hpv___eq: " + GraphQLRequestSerializer.getEntry(data_hpv___eq));
        }
        if (data_hpv___ne != null) {
            joiner.add("data_hpv___ne: " + GraphQLRequestSerializer.getEntry(data_hpv___ne));
        }
        if (data_hpv___null != null) {
            joiner.add("data_hpv___null: " + GraphQLRequestSerializer.getEntry(data_hpv___null));
        }
        if (data_hpv___not___null != null) {
            joiner.add("data_hpv___not___null: " + GraphQLRequestSerializer.getEntry(data_hpv___not___null));
        }
        if (data_hpv___in != null) {
            joiner.add("data_hpv___in: " + GraphQLRequestSerializer.getEntry(data_hpv___in));
        }
        if (data_hpv___not___in != null) {
            joiner.add("data_hpv___not___in: " + GraphQLRequestSerializer.getEntry(data_hpv___not___in));
        }
        if (data_hpv___lt != null) {
            joiner.add("data_hpv___lt: " + GraphQLRequestSerializer.getEntry(data_hpv___lt));
        }
        if (data_hpv___lte != null) {
            joiner.add("data_hpv___lte: " + GraphQLRequestSerializer.getEntry(data_hpv___lte));
        }
        if (data_hpv___gt != null) {
            joiner.add("data_hpv___gt: " + GraphQLRequestSerializer.getEntry(data_hpv___gt));
        }
        if (data_hpv___gte != null) {
            joiner.add("data_hpv___gte: " + GraphQLRequestSerializer.getEntry(data_hpv___gte));
        }
        if (data_mvabn_pre1___eq != null) {
            joiner.add("data_mvabn_pre1___eq: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre1___eq));
        }
        if (data_mvabn_pre1___ne != null) {
            joiner.add("data_mvabn_pre1___ne: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre1___ne));
        }
        if (data_mvabn_pre1___null != null) {
            joiner.add("data_mvabn_pre1___null: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre1___null));
        }
        if (data_mvabn_pre1___not___null != null) {
            joiner.add("data_mvabn_pre1___not___null: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre1___not___null));
        }
        if (data_mvabn_pre1___in != null) {
            joiner.add("data_mvabn_pre1___in: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre1___in));
        }
        if (data_mvabn_pre1___not___in != null) {
            joiner.add("data_mvabn_pre1___not___in: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre1___not___in));
        }
        if (data_mvabn_pre1___lt != null) {
            joiner.add("data_mvabn_pre1___lt: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre1___lt));
        }
        if (data_mvabn_pre1___lte != null) {
            joiner.add("data_mvabn_pre1___lte: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre1___lte));
        }
        if (data_mvabn_pre1___gt != null) {
            joiner.add("data_mvabn_pre1___gt: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre1___gt));
        }
        if (data_mvabn_pre1___gte != null) {
            joiner.add("data_mvabn_pre1___gte: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre1___gte));
        }
        if (data_mvabn_pre2___eq != null) {
            joiner.add("data_mvabn_pre2___eq: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre2___eq));
        }
        if (data_mvabn_pre2___ne != null) {
            joiner.add("data_mvabn_pre2___ne: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre2___ne));
        }
        if (data_mvabn_pre2___null != null) {
            joiner.add("data_mvabn_pre2___null: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre2___null));
        }
        if (data_mvabn_pre2___not___null != null) {
            joiner.add("data_mvabn_pre2___not___null: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre2___not___null));
        }
        if (data_mvabn_pre2___in != null) {
            joiner.add("data_mvabn_pre2___in: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre2___in));
        }
        if (data_mvabn_pre2___not___in != null) {
            joiner.add("data_mvabn_pre2___not___in: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre2___not___in));
        }
        if (data_mvabn_pre2___lt != null) {
            joiner.add("data_mvabn_pre2___lt: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre2___lt));
        }
        if (data_mvabn_pre2___lte != null) {
            joiner.add("data_mvabn_pre2___lte: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre2___lte));
        }
        if (data_mvabn_pre2___gt != null) {
            joiner.add("data_mvabn_pre2___gt: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre2___gt));
        }
        if (data_mvabn_pre2___gte != null) {
            joiner.add("data_mvabn_pre2___gte: " + GraphQLRequestSerializer.getEntry(data_mvabn_pre2___gte));
        }
        if (data_sifilide___eq != null) {
            joiner.add("data_sifilide___eq: " + GraphQLRequestSerializer.getEntry(data_sifilide___eq));
        }
        if (data_sifilide___ne != null) {
            joiner.add("data_sifilide___ne: " + GraphQLRequestSerializer.getEntry(data_sifilide___ne));
        }
        if (data_sifilide___null != null) {
            joiner.add("data_sifilide___null: " + GraphQLRequestSerializer.getEntry(data_sifilide___null));
        }
        if (data_sifilide___not___null != null) {
            joiner.add("data_sifilide___not___null: " + GraphQLRequestSerializer.getEntry(data_sifilide___not___null));
        }
        if (data_sifilide___in != null) {
            joiner.add("data_sifilide___in: " + GraphQLRequestSerializer.getEntry(data_sifilide___in));
        }
        if (data_sifilide___not___in != null) {
            joiner.add("data_sifilide___not___in: " + GraphQLRequestSerializer.getEntry(data_sifilide___not___in));
        }
        if (data_sifilide___lt != null) {
            joiner.add("data_sifilide___lt: " + GraphQLRequestSerializer.getEntry(data_sifilide___lt));
        }
        if (data_sifilide___lte != null) {
            joiner.add("data_sifilide___lte: " + GraphQLRequestSerializer.getEntry(data_sifilide___lte));
        }
        if (data_sifilide___gt != null) {
            joiner.add("data_sifilide___gt: " + GraphQLRequestSerializer.getEntry(data_sifilide___gt));
        }
        if (data_sifilide___gte != null) {
            joiner.add("data_sifilide___gte: " + GraphQLRequestSerializer.getEntry(data_sifilide___gte));
        }
        if (gonorrea___eq != null) {
            joiner.add("gonorrea___eq: " + GraphQLRequestSerializer.getEntry(gonorrea___eq));
        }
        if (gonorrea___ne != null) {
            joiner.add("gonorrea___ne: " + GraphQLRequestSerializer.getEntry(gonorrea___ne));
        }
        if (gonorrea___null != null) {
            joiner.add("gonorrea___null: " + GraphQLRequestSerializer.getEntry(gonorrea___null));
        }
        if (gonorrea___not___null != null) {
            joiner.add("gonorrea___not___null: " + GraphQLRequestSerializer.getEntry(gonorrea___not___null));
        }
        if (gruppo_appartenenza___eq != null) {
            joiner.add("gruppo_appartenenza___eq: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___eq));
        }
        if (gruppo_appartenenza___ne != null) {
            joiner.add("gruppo_appartenenza___ne: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___ne));
        }
        if (gruppo_appartenenza___null != null) {
            joiner.add("gruppo_appartenenza___null: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___null));
        }
        if (gruppo_appartenenza___not___null != null) {
            joiner.add("gruppo_appartenenza___not___null: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___not___null));
        }
        if (gruppo_appartenenza___in != null) {
            joiner.add("gruppo_appartenenza___in: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___in));
        }
        if (gruppo_appartenenza___not___in != null) {
            joiner.add("gruppo_appartenenza___not___in: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___not___in));
        }
        if (gruppo_appartenenza___lt != null) {
            joiner.add("gruppo_appartenenza___lt: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___lt));
        }
        if (gruppo_appartenenza___lte != null) {
            joiner.add("gruppo_appartenenza___lte: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___lte));
        }
        if (gruppo_appartenenza___gt != null) {
            joiner.add("gruppo_appartenenza___gt: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___gt));
        }
        if (gruppo_appartenenza___gte != null) {
            joiner.add("gruppo_appartenenza___gte: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___gte));
        }
        if (gruppo_appartenenza___contains != null) {
            joiner.add("gruppo_appartenenza___contains: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___contains));
        }
        if (gruppo_appartenenza___not___contains != null) {
            joiner.add("gruppo_appartenenza___not___contains: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___not___contains));
        }
        if (gruppo_appartenenza___starts_with != null) {
            joiner.add("gruppo_appartenenza___starts_with: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___starts_with));
        }
        if (gruppo_appartenenza___not___starts_with != null) {
            joiner.add("gruppo_appartenenza___not___starts_with: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___not___starts_with));
        }
        if (gruppo_appartenenza___ends_with != null) {
            joiner.add("gruppo_appartenenza___ends_with: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___ends_with));
        }
        if (gruppo_appartenenza___not___ends_with != null) {
            joiner.add("gruppo_appartenenza___not___ends_with: " + GraphQLRequestSerializer.getEntry(gruppo_appartenenza___not___ends_with));
        }
        if (hiv___eq != null) {
            joiner.add("hiv___eq: " + GraphQLRequestSerializer.getEntry(hiv___eq));
        }
        if (hiv___ne != null) {
            joiner.add("hiv___ne: " + GraphQLRequestSerializer.getEntry(hiv___ne));
        }
        if (hiv___null != null) {
            joiner.add("hiv___null: " + GraphQLRequestSerializer.getEntry(hiv___null));
        }
        if (hiv___not___null != null) {
            joiner.add("hiv___not___null: " + GraphQLRequestSerializer.getEntry(hiv___not___null));
        }
        if (hivrna_vaccinazione___eq != null) {
            joiner.add("hivrna_vaccinazione___eq: " + GraphQLRequestSerializer.getEntry(hivrna_vaccinazione___eq));
        }
        if (hivrna_vaccinazione___ne != null) {
            joiner.add("hivrna_vaccinazione___ne: " + GraphQLRequestSerializer.getEntry(hivrna_vaccinazione___ne));
        }
        if (hivrna_vaccinazione___null != null) {
            joiner.add("hivrna_vaccinazione___null: " + GraphQLRequestSerializer.getEntry(hivrna_vaccinazione___null));
        }
        if (hivrna_vaccinazione___not___null != null) {
            joiner.add("hivrna_vaccinazione___not___null: " + GraphQLRequestSerializer.getEntry(hivrna_vaccinazione___not___null));
        }
        if (hivrna_vaccinazione___in != null) {
            joiner.add("hivrna_vaccinazione___in: " + GraphQLRequestSerializer.getEntry(hivrna_vaccinazione___in));
        }
        if (hivrna_vaccinazione___not___in != null) {
            joiner.add("hivrna_vaccinazione___not___in: " + GraphQLRequestSerializer.getEntry(hivrna_vaccinazione___not___in));
        }
        if (hivrna_vaccinazione___lt != null) {
            joiner.add("hivrna_vaccinazione___lt: " + GraphQLRequestSerializer.getEntry(hivrna_vaccinazione___lt));
        }
        if (hivrna_vaccinazione___lte != null) {
            joiner.add("hivrna_vaccinazione___lte: " + GraphQLRequestSerializer.getEntry(hivrna_vaccinazione___lte));
        }
        if (hivrna_vaccinazione___gt != null) {
            joiner.add("hivrna_vaccinazione___gt: " + GraphQLRequestSerializer.getEntry(hivrna_vaccinazione___gt));
        }
        if (hivrna_vaccinazione___gte != null) {
            joiner.add("hivrna_vaccinazione___gte: " + GraphQLRequestSerializer.getEntry(hivrna_vaccinazione___gte));
        }
        if (hpv___eq != null) {
            joiner.add("hpv___eq: " + GraphQLRequestSerializer.getEntry(hpv___eq));
        }
        if (hpv___ne != null) {
            joiner.add("hpv___ne: " + GraphQLRequestSerializer.getEntry(hpv___ne));
        }
        if (hpv___null != null) {
            joiner.add("hpv___null: " + GraphQLRequestSerializer.getEntry(hpv___null));
        }
        if (hpv___not___null != null) {
            joiner.add("hpv___not___null: " + GraphQLRequestSerializer.getEntry(hpv___not___null));
        }
        if (mst___eq != null) {
            joiner.add("mst___eq: " + GraphQLRequestSerializer.getEntry(mst___eq));
        }
        if (mst___ne != null) {
            joiner.add("mst___ne: " + GraphQLRequestSerializer.getEntry(mst___ne));
        }
        if (mst___null != null) {
            joiner.add("mst___null: " + GraphQLRequestSerializer.getEntry(mst___null));
        }
        if (mst___not___null != null) {
            joiner.add("mst___not___null: " + GraphQLRequestSerializer.getEntry(mst___not___null));
        }
        if (note_ricovero___eq != null) {
            joiner.add("note_ricovero___eq: " + GraphQLRequestSerializer.getEntry(note_ricovero___eq));
        }
        if (note_ricovero___ne != null) {
            joiner.add("note_ricovero___ne: " + GraphQLRequestSerializer.getEntry(note_ricovero___ne));
        }
        if (note_ricovero___null != null) {
            joiner.add("note_ricovero___null: " + GraphQLRequestSerializer.getEntry(note_ricovero___null));
        }
        if (note_ricovero___not___null != null) {
            joiner.add("note_ricovero___not___null: " + GraphQLRequestSerializer.getEntry(note_ricovero___not___null));
        }
        if (note_ricovero___in != null) {
            joiner.add("note_ricovero___in: " + GraphQLRequestSerializer.getEntry(note_ricovero___in));
        }
        if (note_ricovero___not___in != null) {
            joiner.add("note_ricovero___not___in: " + GraphQLRequestSerializer.getEntry(note_ricovero___not___in));
        }
        if (note_ricovero___lt != null) {
            joiner.add("note_ricovero___lt: " + GraphQLRequestSerializer.getEntry(note_ricovero___lt));
        }
        if (note_ricovero___lte != null) {
            joiner.add("note_ricovero___lte: " + GraphQLRequestSerializer.getEntry(note_ricovero___lte));
        }
        if (note_ricovero___gt != null) {
            joiner.add("note_ricovero___gt: " + GraphQLRequestSerializer.getEntry(note_ricovero___gt));
        }
        if (note_ricovero___gte != null) {
            joiner.add("note_ricovero___gte: " + GraphQLRequestSerializer.getEntry(note_ricovero___gte));
        }
        if (note_ricovero___contains != null) {
            joiner.add("note_ricovero___contains: " + GraphQLRequestSerializer.getEntry(note_ricovero___contains));
        }
        if (note_ricovero___not___contains != null) {
            joiner.add("note_ricovero___not___contains: " + GraphQLRequestSerializer.getEntry(note_ricovero___not___contains));
        }
        if (note_ricovero___starts_with != null) {
            joiner.add("note_ricovero___starts_with: " + GraphQLRequestSerializer.getEntry(note_ricovero___starts_with));
        }
        if (note_ricovero___not___starts_with != null) {
            joiner.add("note_ricovero___not___starts_with: " + GraphQLRequestSerializer.getEntry(note_ricovero___not___starts_with));
        }
        if (note_ricovero___ends_with != null) {
            joiner.add("note_ricovero___ends_with: " + GraphQLRequestSerializer.getEntry(note_ricovero___ends_with));
        }
        if (note_ricovero___not___ends_with != null) {
            joiner.add("note_ricovero___not___ends_with: " + GraphQLRequestSerializer.getEntry(note_ricovero___not___ends_with));
        }
        if (num_dosi_mvabn___eq != null) {
            joiner.add("num_dosi_mvabn___eq: " + GraphQLRequestSerializer.getEntry(num_dosi_mvabn___eq));
        }
        if (num_dosi_mvabn___ne != null) {
            joiner.add("num_dosi_mvabn___ne: " + GraphQLRequestSerializer.getEntry(num_dosi_mvabn___ne));
        }
        if (num_dosi_mvabn___null != null) {
            joiner.add("num_dosi_mvabn___null: " + GraphQLRequestSerializer.getEntry(num_dosi_mvabn___null));
        }
        if (num_dosi_mvabn___not___null != null) {
            joiner.add("num_dosi_mvabn___not___null: " + GraphQLRequestSerializer.getEntry(num_dosi_mvabn___not___null));
        }
        if (num_dosi_mvabn___in != null) {
            joiner.add("num_dosi_mvabn___in: " + GraphQLRequestSerializer.getEntry(num_dosi_mvabn___in));
        }
        if (num_dosi_mvabn___not___in != null) {
            joiner.add("num_dosi_mvabn___not___in: " + GraphQLRequestSerializer.getEntry(num_dosi_mvabn___not___in));
        }
        if (num_dosi_mvabn___lt != null) {
            joiner.add("num_dosi_mvabn___lt: " + GraphQLRequestSerializer.getEntry(num_dosi_mvabn___lt));
        }
        if (num_dosi_mvabn___lte != null) {
            joiner.add("num_dosi_mvabn___lte: " + GraphQLRequestSerializer.getEntry(num_dosi_mvabn___lte));
        }
        if (num_dosi_mvabn___gt != null) {
            joiner.add("num_dosi_mvabn___gt: " + GraphQLRequestSerializer.getEntry(num_dosi_mvabn___gt));
        }
        if (num_dosi_mvabn___gte != null) {
            joiner.add("num_dosi_mvabn___gte: " + GraphQLRequestSerializer.getEntry(num_dosi_mvabn___gte));
        }
        if (num_visite___eq != null) {
            joiner.add("num_visite___eq: " + GraphQLRequestSerializer.getEntry(num_visite___eq));
        }
        if (num_visite___ne != null) {
            joiner.add("num_visite___ne: " + GraphQLRequestSerializer.getEntry(num_visite___ne));
        }
        if (num_visite___null != null) {
            joiner.add("num_visite___null: " + GraphQLRequestSerializer.getEntry(num_visite___null));
        }
        if (num_visite___not___null != null) {
            joiner.add("num_visite___not___null: " + GraphQLRequestSerializer.getEntry(num_visite___not___null));
        }
        if (num_visite___in != null) {
            joiner.add("num_visite___in: " + GraphQLRequestSerializer.getEntry(num_visite___in));
        }
        if (num_visite___not___in != null) {
            joiner.add("num_visite___not___in: " + GraphQLRequestSerializer.getEntry(num_visite___not___in));
        }
        if (num_visite___lt != null) {
            joiner.add("num_visite___lt: " + GraphQLRequestSerializer.getEntry(num_visite___lt));
        }
        if (num_visite___lte != null) {
            joiner.add("num_visite___lte: " + GraphQLRequestSerializer.getEntry(num_visite___lte));
        }
        if (num_visite___gt != null) {
            joiner.add("num_visite___gt: " + GraphQLRequestSerializer.getEntry(num_visite___gt));
        }
        if (num_visite___gte != null) {
            joiner.add("num_visite___gte: " + GraphQLRequestSerializer.getEntry(num_visite___gte));
        }
        if (paziente_ico___eq != null) {
            joiner.add("paziente_ico___eq: " + GraphQLRequestSerializer.getEntry(paziente_ico___eq));
        }
        if (paziente_ico___ne != null) {
            joiner.add("paziente_ico___ne: " + GraphQLRequestSerializer.getEntry(paziente_ico___ne));
        }
        if (paziente_ico___null != null) {
            joiner.add("paziente_ico___null: " + GraphQLRequestSerializer.getEntry(paziente_ico___null));
        }
        if (paziente_ico___not___null != null) {
            joiner.add("paziente_ico___not___null: " + GraphQLRequestSerializer.getEntry(paziente_ico___not___null));
        }
        if (paziente_ico___in != null) {
            joiner.add("paziente_ico___in: " + GraphQLRequestSerializer.getEntry(paziente_ico___in));
        }
        if (paziente_ico___not___in != null) {
            joiner.add("paziente_ico___not___in: " + GraphQLRequestSerializer.getEntry(paziente_ico___not___in));
        }
        if (paziente_ico___lt != null) {
            joiner.add("paziente_ico___lt: " + GraphQLRequestSerializer.getEntry(paziente_ico___lt));
        }
        if (paziente_ico___lte != null) {
            joiner.add("paziente_ico___lte: " + GraphQLRequestSerializer.getEntry(paziente_ico___lte));
        }
        if (paziente_ico___gt != null) {
            joiner.add("paziente_ico___gt: " + GraphQLRequestSerializer.getEntry(paziente_ico___gt));
        }
        if (paziente_ico___gte != null) {
            joiner.add("paziente_ico___gte: " + GraphQLRequestSerializer.getEntry(paziente_ico___gte));
        }
        if (paziente_ico___contains != null) {
            joiner.add("paziente_ico___contains: " + GraphQLRequestSerializer.getEntry(paziente_ico___contains));
        }
        if (paziente_ico___not___contains != null) {
            joiner.add("paziente_ico___not___contains: " + GraphQLRequestSerializer.getEntry(paziente_ico___not___contains));
        }
        if (paziente_ico___starts_with != null) {
            joiner.add("paziente_ico___starts_with: " + GraphQLRequestSerializer.getEntry(paziente_ico___starts_with));
        }
        if (paziente_ico___not___starts_with != null) {
            joiner.add("paziente_ico___not___starts_with: " + GraphQLRequestSerializer.getEntry(paziente_ico___not___starts_with));
        }
        if (paziente_ico___ends_with != null) {
            joiner.add("paziente_ico___ends_with: " + GraphQLRequestSerializer.getEntry(paziente_ico___ends_with));
        }
        if (paziente_ico___not___ends_with != null) {
            joiner.add("paziente_ico___not___ends_with: " + GraphQLRequestSerializer.getEntry(paziente_ico___not___ends_with));
        }
        if (ricovero___eq != null) {
            joiner.add("ricovero___eq: " + GraphQLRequestSerializer.getEntry(ricovero___eq));
        }
        if (ricovero___ne != null) {
            joiner.add("ricovero___ne: " + GraphQLRequestSerializer.getEntry(ricovero___ne));
        }
        if (ricovero___null != null) {
            joiner.add("ricovero___null: " + GraphQLRequestSerializer.getEntry(ricovero___null));
        }
        if (ricovero___not___null != null) {
            joiner.add("ricovero___not___null: " + GraphQLRequestSerializer.getEntry(ricovero___not___null));
        }
        if (sifilide___eq != null) {
            joiner.add("sifilide___eq: " + GraphQLRequestSerializer.getEntry(sifilide___eq));
        }
        if (sifilide___ne != null) {
            joiner.add("sifilide___ne: " + GraphQLRequestSerializer.getEntry(sifilide___ne));
        }
        if (sifilide___null != null) {
            joiner.add("sifilide___null: " + GraphQLRequestSerializer.getEntry(sifilide___null));
        }
        if (sifilide___not___null != null) {
            joiner.add("sifilide___not___null: " + GraphQLRequestSerializer.getEntry(sifilide___not___null));
        }
        if (tipo_visita___eq != null) {
            joiner.add("tipo_visita___eq: " + GraphQLRequestSerializer.getEntry(tipo_visita___eq));
        }
        if (tipo_visita___ne != null) {
            joiner.add("tipo_visita___ne: " + GraphQLRequestSerializer.getEntry(tipo_visita___ne));
        }
        if (tipo_visita___null != null) {
            joiner.add("tipo_visita___null: " + GraphQLRequestSerializer.getEntry(tipo_visita___null));
        }
        if (tipo_visita___not___null != null) {
            joiner.add("tipo_visita___not___null: " + GraphQLRequestSerializer.getEntry(tipo_visita___not___null));
        }
        if (tipo_visita___in != null) {
            joiner.add("tipo_visita___in: " + GraphQLRequestSerializer.getEntry(tipo_visita___in));
        }
        if (tipo_visita___not___in != null) {
            joiner.add("tipo_visita___not___in: " + GraphQLRequestSerializer.getEntry(tipo_visita___not___in));
        }
        if (tipo_visita___lt != null) {
            joiner.add("tipo_visita___lt: " + GraphQLRequestSerializer.getEntry(tipo_visita___lt));
        }
        if (tipo_visita___lte != null) {
            joiner.add("tipo_visita___lte: " + GraphQLRequestSerializer.getEntry(tipo_visita___lte));
        }
        if (tipo_visita___gt != null) {
            joiner.add("tipo_visita___gt: " + GraphQLRequestSerializer.getEntry(tipo_visita___gt));
        }
        if (tipo_visita___gte != null) {
            joiner.add("tipo_visita___gte: " + GraphQLRequestSerializer.getEntry(tipo_visita___gte));
        }
        if (tipo_visita___contains != null) {
            joiner.add("tipo_visita___contains: " + GraphQLRequestSerializer.getEntry(tipo_visita___contains));
        }
        if (tipo_visita___not___contains != null) {
            joiner.add("tipo_visita___not___contains: " + GraphQLRequestSerializer.getEntry(tipo_visita___not___contains));
        }
        if (tipo_visita___starts_with != null) {
            joiner.add("tipo_visita___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_visita___starts_with));
        }
        if (tipo_visita___not___starts_with != null) {
            joiner.add("tipo_visita___not___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_visita___not___starts_with));
        }
        if (tipo_visita___ends_with != null) {
            joiner.add("tipo_visita___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_visita___ends_with));
        }
        if (tipo_visita___not___ends_with != null) {
            joiner.add("tipo_visita___not___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_visita___not___ends_with));
        }
        if (tipo_visita_booster___eq != null) {
            joiner.add("tipo_visita_booster___eq: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___eq));
        }
        if (tipo_visita_booster___ne != null) {
            joiner.add("tipo_visita_booster___ne: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___ne));
        }
        if (tipo_visita_booster___null != null) {
            joiner.add("tipo_visita_booster___null: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___null));
        }
        if (tipo_visita_booster___not___null != null) {
            joiner.add("tipo_visita_booster___not___null: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___not___null));
        }
        if (tipo_visita_booster___in != null) {
            joiner.add("tipo_visita_booster___in: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___in));
        }
        if (tipo_visita_booster___not___in != null) {
            joiner.add("tipo_visita_booster___not___in: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___not___in));
        }
        if (tipo_visita_booster___lt != null) {
            joiner.add("tipo_visita_booster___lt: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___lt));
        }
        if (tipo_visita_booster___lte != null) {
            joiner.add("tipo_visita_booster___lte: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___lte));
        }
        if (tipo_visita_booster___gt != null) {
            joiner.add("tipo_visita_booster___gt: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___gt));
        }
        if (tipo_visita_booster___gte != null) {
            joiner.add("tipo_visita_booster___gte: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___gte));
        }
        if (tipo_visita_booster___contains != null) {
            joiner.add("tipo_visita_booster___contains: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___contains));
        }
        if (tipo_visita_booster___not___contains != null) {
            joiner.add("tipo_visita_booster___not___contains: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___not___contains));
        }
        if (tipo_visita_booster___starts_with != null) {
            joiner.add("tipo_visita_booster___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___starts_with));
        }
        if (tipo_visita_booster___not___starts_with != null) {
            joiner.add("tipo_visita_booster___not___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___not___starts_with));
        }
        if (tipo_visita_booster___ends_with != null) {
            joiner.add("tipo_visita_booster___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___ends_with));
        }
        if (tipo_visita_booster___not___ends_with != null) {
            joiner.add("tipo_visita_booster___not___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_visita_booster___not___ends_with));
        }
        if (vac_mvabn_22_23___eq != null) {
            joiner.add("vac_mvabn_22_23___eq: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___eq));
        }
        if (vac_mvabn_22_23___ne != null) {
            joiner.add("vac_mvabn_22_23___ne: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___ne));
        }
        if (vac_mvabn_22_23___null != null) {
            joiner.add("vac_mvabn_22_23___null: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___null));
        }
        if (vac_mvabn_22_23___not___null != null) {
            joiner.add("vac_mvabn_22_23___not___null: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___not___null));
        }
        if (vac_mvabn_22_23___in != null) {
            joiner.add("vac_mvabn_22_23___in: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___in));
        }
        if (vac_mvabn_22_23___not___in != null) {
            joiner.add("vac_mvabn_22_23___not___in: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___not___in));
        }
        if (vac_mvabn_22_23___lt != null) {
            joiner.add("vac_mvabn_22_23___lt: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___lt));
        }
        if (vac_mvabn_22_23___lte != null) {
            joiner.add("vac_mvabn_22_23___lte: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___lte));
        }
        if (vac_mvabn_22_23___gt != null) {
            joiner.add("vac_mvabn_22_23___gt: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___gt));
        }
        if (vac_mvabn_22_23___gte != null) {
            joiner.add("vac_mvabn_22_23___gte: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___gte));
        }
        if (vac_mvabn_22_23___contains != null) {
            joiner.add("vac_mvabn_22_23___contains: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___contains));
        }
        if (vac_mvabn_22_23___not___contains != null) {
            joiner.add("vac_mvabn_22_23___not___contains: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___not___contains));
        }
        if (vac_mvabn_22_23___starts_with != null) {
            joiner.add("vac_mvabn_22_23___starts_with: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___starts_with));
        }
        if (vac_mvabn_22_23___not___starts_with != null) {
            joiner.add("vac_mvabn_22_23___not___starts_with: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___not___starts_with));
        }
        if (vac_mvabn_22_23___ends_with != null) {
            joiner.add("vac_mvabn_22_23___ends_with: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___ends_with));
        }
        if (vac_mvabn_22_23___not___ends_with != null) {
            joiner.add("vac_mvabn_22_23___not___ends_with: " + GraphQLRequestSerializer.getEntry(vac_mvabn_22_23___not___ends_with));
        }
        if (vac_vaiolo_pre___eq != null) {
            joiner.add("vac_vaiolo_pre___eq: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___eq));
        }
        if (vac_vaiolo_pre___ne != null) {
            joiner.add("vac_vaiolo_pre___ne: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___ne));
        }
        if (vac_vaiolo_pre___null != null) {
            joiner.add("vac_vaiolo_pre___null: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___null));
        }
        if (vac_vaiolo_pre___not___null != null) {
            joiner.add("vac_vaiolo_pre___not___null: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___not___null));
        }
        if (vac_vaiolo_pre___in != null) {
            joiner.add("vac_vaiolo_pre___in: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___in));
        }
        if (vac_vaiolo_pre___not___in != null) {
            joiner.add("vac_vaiolo_pre___not___in: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___not___in));
        }
        if (vac_vaiolo_pre___lt != null) {
            joiner.add("vac_vaiolo_pre___lt: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___lt));
        }
        if (vac_vaiolo_pre___lte != null) {
            joiner.add("vac_vaiolo_pre___lte: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___lte));
        }
        if (vac_vaiolo_pre___gt != null) {
            joiner.add("vac_vaiolo_pre___gt: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___gt));
        }
        if (vac_vaiolo_pre___gte != null) {
            joiner.add("vac_vaiolo_pre___gte: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___gte));
        }
        if (vac_vaiolo_pre___contains != null) {
            joiner.add("vac_vaiolo_pre___contains: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___contains));
        }
        if (vac_vaiolo_pre___not___contains != null) {
            joiner.add("vac_vaiolo_pre___not___contains: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___not___contains));
        }
        if (vac_vaiolo_pre___starts_with != null) {
            joiner.add("vac_vaiolo_pre___starts_with: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___starts_with));
        }
        if (vac_vaiolo_pre___not___starts_with != null) {
            joiner.add("vac_vaiolo_pre___not___starts_with: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___not___starts_with));
        }
        if (vac_vaiolo_pre___ends_with != null) {
            joiner.add("vac_vaiolo_pre___ends_with: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___ends_with));
        }
        if (vac_vaiolo_pre___not___ends_with != null) {
            joiner.add("vac_vaiolo_pre___not___ends_with: " + GraphQLRequestSerializer.getEntry(vac_vaiolo_pre___not___ends_with));
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

    public static CliVisita_mpvFilterDTO.Builder builder() {
        return new CliVisita_mpvFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId___eq;
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
        private Boolean arruolamento___eq;
        private Boolean arruolamento___ne;
        private Boolean arruolamento___null;
        private Boolean arruolamento___not___null;
        private Boolean arruolamento_effettuato___eq;
        private Boolean arruolamento_effettuato___ne;
        private Boolean arruolamento_effettuato___null;
        private Boolean arruolamento_effettuato___not___null;
        private Integer cd4_vaccinazione___eq;
        private Integer cd4_vaccinazione___ne;
        private Boolean cd4_vaccinazione___null;
        private Boolean cd4_vaccinazione___not___null;
        private java.util.List<Integer> cd4_vaccinazione___in;
        private java.util.List<Integer> cd4_vaccinazione___not___in;
        private Integer cd4_vaccinazione___lt;
        private Integer cd4_vaccinazione___lte;
        private Integer cd4_vaccinazione___gt;
        private Integer cd4_vaccinazione___gte;
        private String centro_prov___eq;
        private String centro_prov___ne;
        private Boolean centro_prov___null;
        private Boolean centro_prov___not___null;
        private java.util.List<String> centro_prov___in;
        private java.util.List<String> centro_prov___not___in;
        private String centro_prov___lt;
        private String centro_prov___lte;
        private String centro_prov___gt;
        private String centro_prov___gte;
        private String centro_prov___contains;
        private String centro_prov___not___contains;
        private String centro_prov___starts_with;
        private String centro_prov___not___starts_with;
        private String centro_prov___ends_with;
        private String centro_prov___not___ends_with;
        private Boolean chemsex___eq;
        private Boolean chemsex___ne;
        private Boolean chemsex___null;
        private Boolean chemsex___not___null;
        private Boolean chlamydia___eq;
        private Boolean chlamydia___ne;
        private Boolean chlamydia___null;
        private Boolean chlamydia___not___null;
        private Boolean contatti_mpox___eq;
        private Boolean contatti_mpox___ne;
        private Boolean contatti_mpox___null;
        private Boolean contatti_mpox___not___null;
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
        private String data_chlamydia___eq;
        private String data_chlamydia___ne;
        private Boolean data_chlamydia___null;
        private Boolean data_chlamydia___not___null;
        private java.util.List<String> data_chlamydia___in;
        private java.util.List<String> data_chlamydia___not___in;
        private String data_chlamydia___lt;
        private String data_chlamydia___lte;
        private String data_chlamydia___gt;
        private String data_chlamydia___gte;
        private String data_contatto_mpox___eq;
        private String data_contatto_mpox___ne;
        private Boolean data_contatto_mpox___null;
        private Boolean data_contatto_mpox___not___null;
        private java.util.List<String> data_contatto_mpox___in;
        private java.util.List<String> data_contatto_mpox___not___in;
        private String data_contatto_mpox___lt;
        private String data_contatto_mpox___lte;
        private String data_contatto_mpox___gt;
        private String data_contatto_mpox___gte;
        private String data_gonorrea___eq;
        private String data_gonorrea___ne;
        private Boolean data_gonorrea___null;
        private Boolean data_gonorrea___not___null;
        private java.util.List<String> data_gonorrea___in;
        private java.util.List<String> data_gonorrea___not___in;
        private String data_gonorrea___lt;
        private String data_gonorrea___lte;
        private String data_gonorrea___gt;
        private String data_gonorrea___gte;
        private String data_hpv___eq;
        private String data_hpv___ne;
        private Boolean data_hpv___null;
        private Boolean data_hpv___not___null;
        private java.util.List<String> data_hpv___in;
        private java.util.List<String> data_hpv___not___in;
        private String data_hpv___lt;
        private String data_hpv___lte;
        private String data_hpv___gt;
        private String data_hpv___gte;
        private String data_mvabn_pre1___eq;
        private String data_mvabn_pre1___ne;
        private Boolean data_mvabn_pre1___null;
        private Boolean data_mvabn_pre1___not___null;
        private java.util.List<String> data_mvabn_pre1___in;
        private java.util.List<String> data_mvabn_pre1___not___in;
        private String data_mvabn_pre1___lt;
        private String data_mvabn_pre1___lte;
        private String data_mvabn_pre1___gt;
        private String data_mvabn_pre1___gte;
        private String data_mvabn_pre2___eq;
        private String data_mvabn_pre2___ne;
        private Boolean data_mvabn_pre2___null;
        private Boolean data_mvabn_pre2___not___null;
        private java.util.List<String> data_mvabn_pre2___in;
        private java.util.List<String> data_mvabn_pre2___not___in;
        private String data_mvabn_pre2___lt;
        private String data_mvabn_pre2___lte;
        private String data_mvabn_pre2___gt;
        private String data_mvabn_pre2___gte;
        private String data_sifilide___eq;
        private String data_sifilide___ne;
        private Boolean data_sifilide___null;
        private Boolean data_sifilide___not___null;
        private java.util.List<String> data_sifilide___in;
        private java.util.List<String> data_sifilide___not___in;
        private String data_sifilide___lt;
        private String data_sifilide___lte;
        private String data_sifilide___gt;
        private String data_sifilide___gte;
        private Boolean gonorrea___eq;
        private Boolean gonorrea___ne;
        private Boolean gonorrea___null;
        private Boolean gonorrea___not___null;
        private String gruppo_appartenenza___eq;
        private String gruppo_appartenenza___ne;
        private Boolean gruppo_appartenenza___null;
        private Boolean gruppo_appartenenza___not___null;
        private java.util.List<String> gruppo_appartenenza___in;
        private java.util.List<String> gruppo_appartenenza___not___in;
        private String gruppo_appartenenza___lt;
        private String gruppo_appartenenza___lte;
        private String gruppo_appartenenza___gt;
        private String gruppo_appartenenza___gte;
        private String gruppo_appartenenza___contains;
        private String gruppo_appartenenza___not___contains;
        private String gruppo_appartenenza___starts_with;
        private String gruppo_appartenenza___not___starts_with;
        private String gruppo_appartenenza___ends_with;
        private String gruppo_appartenenza___not___ends_with;
        private Boolean hiv___eq;
        private Boolean hiv___ne;
        private Boolean hiv___null;
        private Boolean hiv___not___null;
        private Integer hivrna_vaccinazione___eq;
        private Integer hivrna_vaccinazione___ne;
        private Boolean hivrna_vaccinazione___null;
        private Boolean hivrna_vaccinazione___not___null;
        private java.util.List<Integer> hivrna_vaccinazione___in;
        private java.util.List<Integer> hivrna_vaccinazione___not___in;
        private Integer hivrna_vaccinazione___lt;
        private Integer hivrna_vaccinazione___lte;
        private Integer hivrna_vaccinazione___gt;
        private Integer hivrna_vaccinazione___gte;
        private Boolean hpv___eq;
        private Boolean hpv___ne;
        private Boolean hpv___null;
        private Boolean hpv___not___null;
        private Boolean mst___eq;
        private Boolean mst___ne;
        private Boolean mst___null;
        private Boolean mst___not___null;
        private String note_ricovero___eq;
        private String note_ricovero___ne;
        private Boolean note_ricovero___null;
        private Boolean note_ricovero___not___null;
        private java.util.List<String> note_ricovero___in;
        private java.util.List<String> note_ricovero___not___in;
        private String note_ricovero___lt;
        private String note_ricovero___lte;
        private String note_ricovero___gt;
        private String note_ricovero___gte;
        private String note_ricovero___contains;
        private String note_ricovero___not___contains;
        private String note_ricovero___starts_with;
        private String note_ricovero___not___starts_with;
        private String note_ricovero___ends_with;
        private String note_ricovero___not___ends_with;
        private Integer num_dosi_mvabn___eq;
        private Integer num_dosi_mvabn___ne;
        private Boolean num_dosi_mvabn___null;
        private Boolean num_dosi_mvabn___not___null;
        private java.util.List<Integer> num_dosi_mvabn___in;
        private java.util.List<Integer> num_dosi_mvabn___not___in;
        private Integer num_dosi_mvabn___lt;
        private Integer num_dosi_mvabn___lte;
        private Integer num_dosi_mvabn___gt;
        private Integer num_dosi_mvabn___gte;
        private Integer num_visite___eq;
        private Integer num_visite___ne;
        private Boolean num_visite___null;
        private Boolean num_visite___not___null;
        private java.util.List<Integer> num_visite___in;
        private java.util.List<Integer> num_visite___not___in;
        private Integer num_visite___lt;
        private Integer num_visite___lte;
        private Integer num_visite___gt;
        private Integer num_visite___gte;
        private String paziente_ico___eq;
        private String paziente_ico___ne;
        private Boolean paziente_ico___null;
        private Boolean paziente_ico___not___null;
        private java.util.List<String> paziente_ico___in;
        private java.util.List<String> paziente_ico___not___in;
        private String paziente_ico___lt;
        private String paziente_ico___lte;
        private String paziente_ico___gt;
        private String paziente_ico___gte;
        private String paziente_ico___contains;
        private String paziente_ico___not___contains;
        private String paziente_ico___starts_with;
        private String paziente_ico___not___starts_with;
        private String paziente_ico___ends_with;
        private String paziente_ico___not___ends_with;
        private Boolean ricovero___eq;
        private Boolean ricovero___ne;
        private Boolean ricovero___null;
        private Boolean ricovero___not___null;
        private Boolean sifilide___eq;
        private Boolean sifilide___ne;
        private Boolean sifilide___null;
        private Boolean sifilide___not___null;
        private String tipo_visita___eq;
        private String tipo_visita___ne;
        private Boolean tipo_visita___null;
        private Boolean tipo_visita___not___null;
        private java.util.List<String> tipo_visita___in;
        private java.util.List<String> tipo_visita___not___in;
        private String tipo_visita___lt;
        private String tipo_visita___lte;
        private String tipo_visita___gt;
        private String tipo_visita___gte;
        private String tipo_visita___contains;
        private String tipo_visita___not___contains;
        private String tipo_visita___starts_with;
        private String tipo_visita___not___starts_with;
        private String tipo_visita___ends_with;
        private String tipo_visita___not___ends_with;
        private String tipo_visita_booster___eq;
        private String tipo_visita_booster___ne;
        private Boolean tipo_visita_booster___null;
        private Boolean tipo_visita_booster___not___null;
        private java.util.List<String> tipo_visita_booster___in;
        private java.util.List<String> tipo_visita_booster___not___in;
        private String tipo_visita_booster___lt;
        private String tipo_visita_booster___lte;
        private String tipo_visita_booster___gt;
        private String tipo_visita_booster___gte;
        private String tipo_visita_booster___contains;
        private String tipo_visita_booster___not___contains;
        private String tipo_visita_booster___starts_with;
        private String tipo_visita_booster___not___starts_with;
        private String tipo_visita_booster___ends_with;
        private String tipo_visita_booster___not___ends_with;
        private String vac_mvabn_22_23___eq;
        private String vac_mvabn_22_23___ne;
        private Boolean vac_mvabn_22_23___null;
        private Boolean vac_mvabn_22_23___not___null;
        private java.util.List<String> vac_mvabn_22_23___in;
        private java.util.List<String> vac_mvabn_22_23___not___in;
        private String vac_mvabn_22_23___lt;
        private String vac_mvabn_22_23___lte;
        private String vac_mvabn_22_23___gt;
        private String vac_mvabn_22_23___gte;
        private String vac_mvabn_22_23___contains;
        private String vac_mvabn_22_23___not___contains;
        private String vac_mvabn_22_23___starts_with;
        private String vac_mvabn_22_23___not___starts_with;
        private String vac_mvabn_22_23___ends_with;
        private String vac_mvabn_22_23___not___ends_with;
        private String vac_vaiolo_pre___eq;
        private String vac_vaiolo_pre___ne;
        private Boolean vac_vaiolo_pre___null;
        private Boolean vac_vaiolo_pre___not___null;
        private java.util.List<String> vac_vaiolo_pre___in;
        private java.util.List<String> vac_vaiolo_pre___not___in;
        private String vac_vaiolo_pre___lt;
        private String vac_vaiolo_pre___lte;
        private String vac_vaiolo_pre___gt;
        private String vac_vaiolo_pre___gte;
        private String vac_vaiolo_pre___contains;
        private String vac_vaiolo_pre___not___contains;
        private String vac_vaiolo_pre___starts_with;
        private String vac_vaiolo_pre___not___starts_with;
        private String vac_vaiolo_pre___ends_with;
        private String vac_vaiolo_pre___not___ends_with;
        private java.util.List<CliVisita_mpvFilterDTO> AND;
        private java.util.List<CliVisita_mpvFilterDTO> OR;
        private CliVisita_mpvFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
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

        public Builder setArruolamento___eq(Boolean arruolamento___eq) {
            this.arruolamento___eq = arruolamento___eq;
            return this;
        }

        public Builder setArruolamento___ne(Boolean arruolamento___ne) {
            this.arruolamento___ne = arruolamento___ne;
            return this;
        }

        public Builder setArruolamento___null(Boolean arruolamento___null) {
            this.arruolamento___null = arruolamento___null;
            return this;
        }

        public Builder setArruolamento___not___null(Boolean arruolamento___not___null) {
            this.arruolamento___not___null = arruolamento___not___null;
            return this;
        }

        public Builder setArruolamento_effettuato___eq(Boolean arruolamento_effettuato___eq) {
            this.arruolamento_effettuato___eq = arruolamento_effettuato___eq;
            return this;
        }

        public Builder setArruolamento_effettuato___ne(Boolean arruolamento_effettuato___ne) {
            this.arruolamento_effettuato___ne = arruolamento_effettuato___ne;
            return this;
        }

        public Builder setArruolamento_effettuato___null(Boolean arruolamento_effettuato___null) {
            this.arruolamento_effettuato___null = arruolamento_effettuato___null;
            return this;
        }

        public Builder setArruolamento_effettuato___not___null(Boolean arruolamento_effettuato___not___null) {
            this.arruolamento_effettuato___not___null = arruolamento_effettuato___not___null;
            return this;
        }

        public Builder setCd4_vaccinazione___eq(Integer cd4_vaccinazione___eq) {
            this.cd4_vaccinazione___eq = cd4_vaccinazione___eq;
            return this;
        }

        public Builder setCd4_vaccinazione___ne(Integer cd4_vaccinazione___ne) {
            this.cd4_vaccinazione___ne = cd4_vaccinazione___ne;
            return this;
        }

        public Builder setCd4_vaccinazione___null(Boolean cd4_vaccinazione___null) {
            this.cd4_vaccinazione___null = cd4_vaccinazione___null;
            return this;
        }

        public Builder setCd4_vaccinazione___not___null(Boolean cd4_vaccinazione___not___null) {
            this.cd4_vaccinazione___not___null = cd4_vaccinazione___not___null;
            return this;
        }

        public Builder setCd4_vaccinazione___in(java.util.List<Integer> cd4_vaccinazione___in) {
            this.cd4_vaccinazione___in = cd4_vaccinazione___in;
            return this;
        }

        public Builder setCd4_vaccinazione___not___in(java.util.List<Integer> cd4_vaccinazione___not___in) {
            this.cd4_vaccinazione___not___in = cd4_vaccinazione___not___in;
            return this;
        }

        public Builder setCd4_vaccinazione___lt(Integer cd4_vaccinazione___lt) {
            this.cd4_vaccinazione___lt = cd4_vaccinazione___lt;
            return this;
        }

        public Builder setCd4_vaccinazione___lte(Integer cd4_vaccinazione___lte) {
            this.cd4_vaccinazione___lte = cd4_vaccinazione___lte;
            return this;
        }

        public Builder setCd4_vaccinazione___gt(Integer cd4_vaccinazione___gt) {
            this.cd4_vaccinazione___gt = cd4_vaccinazione___gt;
            return this;
        }

        public Builder setCd4_vaccinazione___gte(Integer cd4_vaccinazione___gte) {
            this.cd4_vaccinazione___gte = cd4_vaccinazione___gte;
            return this;
        }

        public Builder setCentro_prov___eq(String centro_prov___eq) {
            this.centro_prov___eq = centro_prov___eq;
            return this;
        }

        public Builder setCentro_prov___ne(String centro_prov___ne) {
            this.centro_prov___ne = centro_prov___ne;
            return this;
        }

        public Builder setCentro_prov___null(Boolean centro_prov___null) {
            this.centro_prov___null = centro_prov___null;
            return this;
        }

        public Builder setCentro_prov___not___null(Boolean centro_prov___not___null) {
            this.centro_prov___not___null = centro_prov___not___null;
            return this;
        }

        public Builder setCentro_prov___in(java.util.List<String> centro_prov___in) {
            this.centro_prov___in = centro_prov___in;
            return this;
        }

        public Builder setCentro_prov___not___in(java.util.List<String> centro_prov___not___in) {
            this.centro_prov___not___in = centro_prov___not___in;
            return this;
        }

        public Builder setCentro_prov___lt(String centro_prov___lt) {
            this.centro_prov___lt = centro_prov___lt;
            return this;
        }

        public Builder setCentro_prov___lte(String centro_prov___lte) {
            this.centro_prov___lte = centro_prov___lte;
            return this;
        }

        public Builder setCentro_prov___gt(String centro_prov___gt) {
            this.centro_prov___gt = centro_prov___gt;
            return this;
        }

        public Builder setCentro_prov___gte(String centro_prov___gte) {
            this.centro_prov___gte = centro_prov___gte;
            return this;
        }

        public Builder setCentro_prov___contains(String centro_prov___contains) {
            this.centro_prov___contains = centro_prov___contains;
            return this;
        }

        public Builder setCentro_prov___not___contains(String centro_prov___not___contains) {
            this.centro_prov___not___contains = centro_prov___not___contains;
            return this;
        }

        public Builder setCentro_prov___starts_with(String centro_prov___starts_with) {
            this.centro_prov___starts_with = centro_prov___starts_with;
            return this;
        }

        public Builder setCentro_prov___not___starts_with(String centro_prov___not___starts_with) {
            this.centro_prov___not___starts_with = centro_prov___not___starts_with;
            return this;
        }

        public Builder setCentro_prov___ends_with(String centro_prov___ends_with) {
            this.centro_prov___ends_with = centro_prov___ends_with;
            return this;
        }

        public Builder setCentro_prov___not___ends_with(String centro_prov___not___ends_with) {
            this.centro_prov___not___ends_with = centro_prov___not___ends_with;
            return this;
        }

        public Builder setChemsex___eq(Boolean chemsex___eq) {
            this.chemsex___eq = chemsex___eq;
            return this;
        }

        public Builder setChemsex___ne(Boolean chemsex___ne) {
            this.chemsex___ne = chemsex___ne;
            return this;
        }

        public Builder setChemsex___null(Boolean chemsex___null) {
            this.chemsex___null = chemsex___null;
            return this;
        }

        public Builder setChemsex___not___null(Boolean chemsex___not___null) {
            this.chemsex___not___null = chemsex___not___null;
            return this;
        }

        public Builder setChlamydia___eq(Boolean chlamydia___eq) {
            this.chlamydia___eq = chlamydia___eq;
            return this;
        }

        public Builder setChlamydia___ne(Boolean chlamydia___ne) {
            this.chlamydia___ne = chlamydia___ne;
            return this;
        }

        public Builder setChlamydia___null(Boolean chlamydia___null) {
            this.chlamydia___null = chlamydia___null;
            return this;
        }

        public Builder setChlamydia___not___null(Boolean chlamydia___not___null) {
            this.chlamydia___not___null = chlamydia___not___null;
            return this;
        }

        public Builder setContatti_mpox___eq(Boolean contatti_mpox___eq) {
            this.contatti_mpox___eq = contatti_mpox___eq;
            return this;
        }

        public Builder setContatti_mpox___ne(Boolean contatti_mpox___ne) {
            this.contatti_mpox___ne = contatti_mpox___ne;
            return this;
        }

        public Builder setContatti_mpox___null(Boolean contatti_mpox___null) {
            this.contatti_mpox___null = contatti_mpox___null;
            return this;
        }

        public Builder setContatti_mpox___not___null(Boolean contatti_mpox___not___null) {
            this.contatti_mpox___not___null = contatti_mpox___not___null;
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

        public Builder setData_chlamydia___eq(String data_chlamydia___eq) {
            this.data_chlamydia___eq = data_chlamydia___eq;
            return this;
        }

        public Builder setData_chlamydia___ne(String data_chlamydia___ne) {
            this.data_chlamydia___ne = data_chlamydia___ne;
            return this;
        }

        public Builder setData_chlamydia___null(Boolean data_chlamydia___null) {
            this.data_chlamydia___null = data_chlamydia___null;
            return this;
        }

        public Builder setData_chlamydia___not___null(Boolean data_chlamydia___not___null) {
            this.data_chlamydia___not___null = data_chlamydia___not___null;
            return this;
        }

        public Builder setData_chlamydia___in(java.util.List<String> data_chlamydia___in) {
            this.data_chlamydia___in = data_chlamydia___in;
            return this;
        }

        public Builder setData_chlamydia___not___in(java.util.List<String> data_chlamydia___not___in) {
            this.data_chlamydia___not___in = data_chlamydia___not___in;
            return this;
        }

        public Builder setData_chlamydia___lt(String data_chlamydia___lt) {
            this.data_chlamydia___lt = data_chlamydia___lt;
            return this;
        }

        public Builder setData_chlamydia___lte(String data_chlamydia___lte) {
            this.data_chlamydia___lte = data_chlamydia___lte;
            return this;
        }

        public Builder setData_chlamydia___gt(String data_chlamydia___gt) {
            this.data_chlamydia___gt = data_chlamydia___gt;
            return this;
        }

        public Builder setData_chlamydia___gte(String data_chlamydia___gte) {
            this.data_chlamydia___gte = data_chlamydia___gte;
            return this;
        }

        public Builder setData_contatto_mpox___eq(String data_contatto_mpox___eq) {
            this.data_contatto_mpox___eq = data_contatto_mpox___eq;
            return this;
        }

        public Builder setData_contatto_mpox___ne(String data_contatto_mpox___ne) {
            this.data_contatto_mpox___ne = data_contatto_mpox___ne;
            return this;
        }

        public Builder setData_contatto_mpox___null(Boolean data_contatto_mpox___null) {
            this.data_contatto_mpox___null = data_contatto_mpox___null;
            return this;
        }

        public Builder setData_contatto_mpox___not___null(Boolean data_contatto_mpox___not___null) {
            this.data_contatto_mpox___not___null = data_contatto_mpox___not___null;
            return this;
        }

        public Builder setData_contatto_mpox___in(java.util.List<String> data_contatto_mpox___in) {
            this.data_contatto_mpox___in = data_contatto_mpox___in;
            return this;
        }

        public Builder setData_contatto_mpox___not___in(java.util.List<String> data_contatto_mpox___not___in) {
            this.data_contatto_mpox___not___in = data_contatto_mpox___not___in;
            return this;
        }

        public Builder setData_contatto_mpox___lt(String data_contatto_mpox___lt) {
            this.data_contatto_mpox___lt = data_contatto_mpox___lt;
            return this;
        }

        public Builder setData_contatto_mpox___lte(String data_contatto_mpox___lte) {
            this.data_contatto_mpox___lte = data_contatto_mpox___lte;
            return this;
        }

        public Builder setData_contatto_mpox___gt(String data_contatto_mpox___gt) {
            this.data_contatto_mpox___gt = data_contatto_mpox___gt;
            return this;
        }

        public Builder setData_contatto_mpox___gte(String data_contatto_mpox___gte) {
            this.data_contatto_mpox___gte = data_contatto_mpox___gte;
            return this;
        }

        public Builder setData_gonorrea___eq(String data_gonorrea___eq) {
            this.data_gonorrea___eq = data_gonorrea___eq;
            return this;
        }

        public Builder setData_gonorrea___ne(String data_gonorrea___ne) {
            this.data_gonorrea___ne = data_gonorrea___ne;
            return this;
        }

        public Builder setData_gonorrea___null(Boolean data_gonorrea___null) {
            this.data_gonorrea___null = data_gonorrea___null;
            return this;
        }

        public Builder setData_gonorrea___not___null(Boolean data_gonorrea___not___null) {
            this.data_gonorrea___not___null = data_gonorrea___not___null;
            return this;
        }

        public Builder setData_gonorrea___in(java.util.List<String> data_gonorrea___in) {
            this.data_gonorrea___in = data_gonorrea___in;
            return this;
        }

        public Builder setData_gonorrea___not___in(java.util.List<String> data_gonorrea___not___in) {
            this.data_gonorrea___not___in = data_gonorrea___not___in;
            return this;
        }

        public Builder setData_gonorrea___lt(String data_gonorrea___lt) {
            this.data_gonorrea___lt = data_gonorrea___lt;
            return this;
        }

        public Builder setData_gonorrea___lte(String data_gonorrea___lte) {
            this.data_gonorrea___lte = data_gonorrea___lte;
            return this;
        }

        public Builder setData_gonorrea___gt(String data_gonorrea___gt) {
            this.data_gonorrea___gt = data_gonorrea___gt;
            return this;
        }

        public Builder setData_gonorrea___gte(String data_gonorrea___gte) {
            this.data_gonorrea___gte = data_gonorrea___gte;
            return this;
        }

        public Builder setData_hpv___eq(String data_hpv___eq) {
            this.data_hpv___eq = data_hpv___eq;
            return this;
        }

        public Builder setData_hpv___ne(String data_hpv___ne) {
            this.data_hpv___ne = data_hpv___ne;
            return this;
        }

        public Builder setData_hpv___null(Boolean data_hpv___null) {
            this.data_hpv___null = data_hpv___null;
            return this;
        }

        public Builder setData_hpv___not___null(Boolean data_hpv___not___null) {
            this.data_hpv___not___null = data_hpv___not___null;
            return this;
        }

        public Builder setData_hpv___in(java.util.List<String> data_hpv___in) {
            this.data_hpv___in = data_hpv___in;
            return this;
        }

        public Builder setData_hpv___not___in(java.util.List<String> data_hpv___not___in) {
            this.data_hpv___not___in = data_hpv___not___in;
            return this;
        }

        public Builder setData_hpv___lt(String data_hpv___lt) {
            this.data_hpv___lt = data_hpv___lt;
            return this;
        }

        public Builder setData_hpv___lte(String data_hpv___lte) {
            this.data_hpv___lte = data_hpv___lte;
            return this;
        }

        public Builder setData_hpv___gt(String data_hpv___gt) {
            this.data_hpv___gt = data_hpv___gt;
            return this;
        }

        public Builder setData_hpv___gte(String data_hpv___gte) {
            this.data_hpv___gte = data_hpv___gte;
            return this;
        }

        public Builder setData_mvabn_pre1___eq(String data_mvabn_pre1___eq) {
            this.data_mvabn_pre1___eq = data_mvabn_pre1___eq;
            return this;
        }

        public Builder setData_mvabn_pre1___ne(String data_mvabn_pre1___ne) {
            this.data_mvabn_pre1___ne = data_mvabn_pre1___ne;
            return this;
        }

        public Builder setData_mvabn_pre1___null(Boolean data_mvabn_pre1___null) {
            this.data_mvabn_pre1___null = data_mvabn_pre1___null;
            return this;
        }

        public Builder setData_mvabn_pre1___not___null(Boolean data_mvabn_pre1___not___null) {
            this.data_mvabn_pre1___not___null = data_mvabn_pre1___not___null;
            return this;
        }

        public Builder setData_mvabn_pre1___in(java.util.List<String> data_mvabn_pre1___in) {
            this.data_mvabn_pre1___in = data_mvabn_pre1___in;
            return this;
        }

        public Builder setData_mvabn_pre1___not___in(java.util.List<String> data_mvabn_pre1___not___in) {
            this.data_mvabn_pre1___not___in = data_mvabn_pre1___not___in;
            return this;
        }

        public Builder setData_mvabn_pre1___lt(String data_mvabn_pre1___lt) {
            this.data_mvabn_pre1___lt = data_mvabn_pre1___lt;
            return this;
        }

        public Builder setData_mvabn_pre1___lte(String data_mvabn_pre1___lte) {
            this.data_mvabn_pre1___lte = data_mvabn_pre1___lte;
            return this;
        }

        public Builder setData_mvabn_pre1___gt(String data_mvabn_pre1___gt) {
            this.data_mvabn_pre1___gt = data_mvabn_pre1___gt;
            return this;
        }

        public Builder setData_mvabn_pre1___gte(String data_mvabn_pre1___gte) {
            this.data_mvabn_pre1___gte = data_mvabn_pre1___gte;
            return this;
        }

        public Builder setData_mvabn_pre2___eq(String data_mvabn_pre2___eq) {
            this.data_mvabn_pre2___eq = data_mvabn_pre2___eq;
            return this;
        }

        public Builder setData_mvabn_pre2___ne(String data_mvabn_pre2___ne) {
            this.data_mvabn_pre2___ne = data_mvabn_pre2___ne;
            return this;
        }

        public Builder setData_mvabn_pre2___null(Boolean data_mvabn_pre2___null) {
            this.data_mvabn_pre2___null = data_mvabn_pre2___null;
            return this;
        }

        public Builder setData_mvabn_pre2___not___null(Boolean data_mvabn_pre2___not___null) {
            this.data_mvabn_pre2___not___null = data_mvabn_pre2___not___null;
            return this;
        }

        public Builder setData_mvabn_pre2___in(java.util.List<String> data_mvabn_pre2___in) {
            this.data_mvabn_pre2___in = data_mvabn_pre2___in;
            return this;
        }

        public Builder setData_mvabn_pre2___not___in(java.util.List<String> data_mvabn_pre2___not___in) {
            this.data_mvabn_pre2___not___in = data_mvabn_pre2___not___in;
            return this;
        }

        public Builder setData_mvabn_pre2___lt(String data_mvabn_pre2___lt) {
            this.data_mvabn_pre2___lt = data_mvabn_pre2___lt;
            return this;
        }

        public Builder setData_mvabn_pre2___lte(String data_mvabn_pre2___lte) {
            this.data_mvabn_pre2___lte = data_mvabn_pre2___lte;
            return this;
        }

        public Builder setData_mvabn_pre2___gt(String data_mvabn_pre2___gt) {
            this.data_mvabn_pre2___gt = data_mvabn_pre2___gt;
            return this;
        }

        public Builder setData_mvabn_pre2___gte(String data_mvabn_pre2___gte) {
            this.data_mvabn_pre2___gte = data_mvabn_pre2___gte;
            return this;
        }

        public Builder setData_sifilide___eq(String data_sifilide___eq) {
            this.data_sifilide___eq = data_sifilide___eq;
            return this;
        }

        public Builder setData_sifilide___ne(String data_sifilide___ne) {
            this.data_sifilide___ne = data_sifilide___ne;
            return this;
        }

        public Builder setData_sifilide___null(Boolean data_sifilide___null) {
            this.data_sifilide___null = data_sifilide___null;
            return this;
        }

        public Builder setData_sifilide___not___null(Boolean data_sifilide___not___null) {
            this.data_sifilide___not___null = data_sifilide___not___null;
            return this;
        }

        public Builder setData_sifilide___in(java.util.List<String> data_sifilide___in) {
            this.data_sifilide___in = data_sifilide___in;
            return this;
        }

        public Builder setData_sifilide___not___in(java.util.List<String> data_sifilide___not___in) {
            this.data_sifilide___not___in = data_sifilide___not___in;
            return this;
        }

        public Builder setData_sifilide___lt(String data_sifilide___lt) {
            this.data_sifilide___lt = data_sifilide___lt;
            return this;
        }

        public Builder setData_sifilide___lte(String data_sifilide___lte) {
            this.data_sifilide___lte = data_sifilide___lte;
            return this;
        }

        public Builder setData_sifilide___gt(String data_sifilide___gt) {
            this.data_sifilide___gt = data_sifilide___gt;
            return this;
        }

        public Builder setData_sifilide___gte(String data_sifilide___gte) {
            this.data_sifilide___gte = data_sifilide___gte;
            return this;
        }

        public Builder setGonorrea___eq(Boolean gonorrea___eq) {
            this.gonorrea___eq = gonorrea___eq;
            return this;
        }

        public Builder setGonorrea___ne(Boolean gonorrea___ne) {
            this.gonorrea___ne = gonorrea___ne;
            return this;
        }

        public Builder setGonorrea___null(Boolean gonorrea___null) {
            this.gonorrea___null = gonorrea___null;
            return this;
        }

        public Builder setGonorrea___not___null(Boolean gonorrea___not___null) {
            this.gonorrea___not___null = gonorrea___not___null;
            return this;
        }

        public Builder setGruppo_appartenenza___eq(String gruppo_appartenenza___eq) {
            this.gruppo_appartenenza___eq = gruppo_appartenenza___eq;
            return this;
        }

        public Builder setGruppo_appartenenza___ne(String gruppo_appartenenza___ne) {
            this.gruppo_appartenenza___ne = gruppo_appartenenza___ne;
            return this;
        }

        public Builder setGruppo_appartenenza___null(Boolean gruppo_appartenenza___null) {
            this.gruppo_appartenenza___null = gruppo_appartenenza___null;
            return this;
        }

        public Builder setGruppo_appartenenza___not___null(Boolean gruppo_appartenenza___not___null) {
            this.gruppo_appartenenza___not___null = gruppo_appartenenza___not___null;
            return this;
        }

        public Builder setGruppo_appartenenza___in(java.util.List<String> gruppo_appartenenza___in) {
            this.gruppo_appartenenza___in = gruppo_appartenenza___in;
            return this;
        }

        public Builder setGruppo_appartenenza___not___in(java.util.List<String> gruppo_appartenenza___not___in) {
            this.gruppo_appartenenza___not___in = gruppo_appartenenza___not___in;
            return this;
        }

        public Builder setGruppo_appartenenza___lt(String gruppo_appartenenza___lt) {
            this.gruppo_appartenenza___lt = gruppo_appartenenza___lt;
            return this;
        }

        public Builder setGruppo_appartenenza___lte(String gruppo_appartenenza___lte) {
            this.gruppo_appartenenza___lte = gruppo_appartenenza___lte;
            return this;
        }

        public Builder setGruppo_appartenenza___gt(String gruppo_appartenenza___gt) {
            this.gruppo_appartenenza___gt = gruppo_appartenenza___gt;
            return this;
        }

        public Builder setGruppo_appartenenza___gte(String gruppo_appartenenza___gte) {
            this.gruppo_appartenenza___gte = gruppo_appartenenza___gte;
            return this;
        }

        public Builder setGruppo_appartenenza___contains(String gruppo_appartenenza___contains) {
            this.gruppo_appartenenza___contains = gruppo_appartenenza___contains;
            return this;
        }

        public Builder setGruppo_appartenenza___not___contains(String gruppo_appartenenza___not___contains) {
            this.gruppo_appartenenza___not___contains = gruppo_appartenenza___not___contains;
            return this;
        }

        public Builder setGruppo_appartenenza___starts_with(String gruppo_appartenenza___starts_with) {
            this.gruppo_appartenenza___starts_with = gruppo_appartenenza___starts_with;
            return this;
        }

        public Builder setGruppo_appartenenza___not___starts_with(String gruppo_appartenenza___not___starts_with) {
            this.gruppo_appartenenza___not___starts_with = gruppo_appartenenza___not___starts_with;
            return this;
        }

        public Builder setGruppo_appartenenza___ends_with(String gruppo_appartenenza___ends_with) {
            this.gruppo_appartenenza___ends_with = gruppo_appartenenza___ends_with;
            return this;
        }

        public Builder setGruppo_appartenenza___not___ends_with(String gruppo_appartenenza___not___ends_with) {
            this.gruppo_appartenenza___not___ends_with = gruppo_appartenenza___not___ends_with;
            return this;
        }

        public Builder setHiv___eq(Boolean hiv___eq) {
            this.hiv___eq = hiv___eq;
            return this;
        }

        public Builder setHiv___ne(Boolean hiv___ne) {
            this.hiv___ne = hiv___ne;
            return this;
        }

        public Builder setHiv___null(Boolean hiv___null) {
            this.hiv___null = hiv___null;
            return this;
        }

        public Builder setHiv___not___null(Boolean hiv___not___null) {
            this.hiv___not___null = hiv___not___null;
            return this;
        }

        public Builder setHivrna_vaccinazione___eq(Integer hivrna_vaccinazione___eq) {
            this.hivrna_vaccinazione___eq = hivrna_vaccinazione___eq;
            return this;
        }

        public Builder setHivrna_vaccinazione___ne(Integer hivrna_vaccinazione___ne) {
            this.hivrna_vaccinazione___ne = hivrna_vaccinazione___ne;
            return this;
        }

        public Builder setHivrna_vaccinazione___null(Boolean hivrna_vaccinazione___null) {
            this.hivrna_vaccinazione___null = hivrna_vaccinazione___null;
            return this;
        }

        public Builder setHivrna_vaccinazione___not___null(Boolean hivrna_vaccinazione___not___null) {
            this.hivrna_vaccinazione___not___null = hivrna_vaccinazione___not___null;
            return this;
        }

        public Builder setHivrna_vaccinazione___in(java.util.List<Integer> hivrna_vaccinazione___in) {
            this.hivrna_vaccinazione___in = hivrna_vaccinazione___in;
            return this;
        }

        public Builder setHivrna_vaccinazione___not___in(java.util.List<Integer> hivrna_vaccinazione___not___in) {
            this.hivrna_vaccinazione___not___in = hivrna_vaccinazione___not___in;
            return this;
        }

        public Builder setHivrna_vaccinazione___lt(Integer hivrna_vaccinazione___lt) {
            this.hivrna_vaccinazione___lt = hivrna_vaccinazione___lt;
            return this;
        }

        public Builder setHivrna_vaccinazione___lte(Integer hivrna_vaccinazione___lte) {
            this.hivrna_vaccinazione___lte = hivrna_vaccinazione___lte;
            return this;
        }

        public Builder setHivrna_vaccinazione___gt(Integer hivrna_vaccinazione___gt) {
            this.hivrna_vaccinazione___gt = hivrna_vaccinazione___gt;
            return this;
        }

        public Builder setHivrna_vaccinazione___gte(Integer hivrna_vaccinazione___gte) {
            this.hivrna_vaccinazione___gte = hivrna_vaccinazione___gte;
            return this;
        }

        public Builder setHpv___eq(Boolean hpv___eq) {
            this.hpv___eq = hpv___eq;
            return this;
        }

        public Builder setHpv___ne(Boolean hpv___ne) {
            this.hpv___ne = hpv___ne;
            return this;
        }

        public Builder setHpv___null(Boolean hpv___null) {
            this.hpv___null = hpv___null;
            return this;
        }

        public Builder setHpv___not___null(Boolean hpv___not___null) {
            this.hpv___not___null = hpv___not___null;
            return this;
        }

        public Builder setMst___eq(Boolean mst___eq) {
            this.mst___eq = mst___eq;
            return this;
        }

        public Builder setMst___ne(Boolean mst___ne) {
            this.mst___ne = mst___ne;
            return this;
        }

        public Builder setMst___null(Boolean mst___null) {
            this.mst___null = mst___null;
            return this;
        }

        public Builder setMst___not___null(Boolean mst___not___null) {
            this.mst___not___null = mst___not___null;
            return this;
        }

        public Builder setNote_ricovero___eq(String note_ricovero___eq) {
            this.note_ricovero___eq = note_ricovero___eq;
            return this;
        }

        public Builder setNote_ricovero___ne(String note_ricovero___ne) {
            this.note_ricovero___ne = note_ricovero___ne;
            return this;
        }

        public Builder setNote_ricovero___null(Boolean note_ricovero___null) {
            this.note_ricovero___null = note_ricovero___null;
            return this;
        }

        public Builder setNote_ricovero___not___null(Boolean note_ricovero___not___null) {
            this.note_ricovero___not___null = note_ricovero___not___null;
            return this;
        }

        public Builder setNote_ricovero___in(java.util.List<String> note_ricovero___in) {
            this.note_ricovero___in = note_ricovero___in;
            return this;
        }

        public Builder setNote_ricovero___not___in(java.util.List<String> note_ricovero___not___in) {
            this.note_ricovero___not___in = note_ricovero___not___in;
            return this;
        }

        public Builder setNote_ricovero___lt(String note_ricovero___lt) {
            this.note_ricovero___lt = note_ricovero___lt;
            return this;
        }

        public Builder setNote_ricovero___lte(String note_ricovero___lte) {
            this.note_ricovero___lte = note_ricovero___lte;
            return this;
        }

        public Builder setNote_ricovero___gt(String note_ricovero___gt) {
            this.note_ricovero___gt = note_ricovero___gt;
            return this;
        }

        public Builder setNote_ricovero___gte(String note_ricovero___gte) {
            this.note_ricovero___gte = note_ricovero___gte;
            return this;
        }

        public Builder setNote_ricovero___contains(String note_ricovero___contains) {
            this.note_ricovero___contains = note_ricovero___contains;
            return this;
        }

        public Builder setNote_ricovero___not___contains(String note_ricovero___not___contains) {
            this.note_ricovero___not___contains = note_ricovero___not___contains;
            return this;
        }

        public Builder setNote_ricovero___starts_with(String note_ricovero___starts_with) {
            this.note_ricovero___starts_with = note_ricovero___starts_with;
            return this;
        }

        public Builder setNote_ricovero___not___starts_with(String note_ricovero___not___starts_with) {
            this.note_ricovero___not___starts_with = note_ricovero___not___starts_with;
            return this;
        }

        public Builder setNote_ricovero___ends_with(String note_ricovero___ends_with) {
            this.note_ricovero___ends_with = note_ricovero___ends_with;
            return this;
        }

        public Builder setNote_ricovero___not___ends_with(String note_ricovero___not___ends_with) {
            this.note_ricovero___not___ends_with = note_ricovero___not___ends_with;
            return this;
        }

        public Builder setNum_dosi_mvabn___eq(Integer num_dosi_mvabn___eq) {
            this.num_dosi_mvabn___eq = num_dosi_mvabn___eq;
            return this;
        }

        public Builder setNum_dosi_mvabn___ne(Integer num_dosi_mvabn___ne) {
            this.num_dosi_mvabn___ne = num_dosi_mvabn___ne;
            return this;
        }

        public Builder setNum_dosi_mvabn___null(Boolean num_dosi_mvabn___null) {
            this.num_dosi_mvabn___null = num_dosi_mvabn___null;
            return this;
        }

        public Builder setNum_dosi_mvabn___not___null(Boolean num_dosi_mvabn___not___null) {
            this.num_dosi_mvabn___not___null = num_dosi_mvabn___not___null;
            return this;
        }

        public Builder setNum_dosi_mvabn___in(java.util.List<Integer> num_dosi_mvabn___in) {
            this.num_dosi_mvabn___in = num_dosi_mvabn___in;
            return this;
        }

        public Builder setNum_dosi_mvabn___not___in(java.util.List<Integer> num_dosi_mvabn___not___in) {
            this.num_dosi_mvabn___not___in = num_dosi_mvabn___not___in;
            return this;
        }

        public Builder setNum_dosi_mvabn___lt(Integer num_dosi_mvabn___lt) {
            this.num_dosi_mvabn___lt = num_dosi_mvabn___lt;
            return this;
        }

        public Builder setNum_dosi_mvabn___lte(Integer num_dosi_mvabn___lte) {
            this.num_dosi_mvabn___lte = num_dosi_mvabn___lte;
            return this;
        }

        public Builder setNum_dosi_mvabn___gt(Integer num_dosi_mvabn___gt) {
            this.num_dosi_mvabn___gt = num_dosi_mvabn___gt;
            return this;
        }

        public Builder setNum_dosi_mvabn___gte(Integer num_dosi_mvabn___gte) {
            this.num_dosi_mvabn___gte = num_dosi_mvabn___gte;
            return this;
        }

        public Builder setNum_visite___eq(Integer num_visite___eq) {
            this.num_visite___eq = num_visite___eq;
            return this;
        }

        public Builder setNum_visite___ne(Integer num_visite___ne) {
            this.num_visite___ne = num_visite___ne;
            return this;
        }

        public Builder setNum_visite___null(Boolean num_visite___null) {
            this.num_visite___null = num_visite___null;
            return this;
        }

        public Builder setNum_visite___not___null(Boolean num_visite___not___null) {
            this.num_visite___not___null = num_visite___not___null;
            return this;
        }

        public Builder setNum_visite___in(java.util.List<Integer> num_visite___in) {
            this.num_visite___in = num_visite___in;
            return this;
        }

        public Builder setNum_visite___not___in(java.util.List<Integer> num_visite___not___in) {
            this.num_visite___not___in = num_visite___not___in;
            return this;
        }

        public Builder setNum_visite___lt(Integer num_visite___lt) {
            this.num_visite___lt = num_visite___lt;
            return this;
        }

        public Builder setNum_visite___lte(Integer num_visite___lte) {
            this.num_visite___lte = num_visite___lte;
            return this;
        }

        public Builder setNum_visite___gt(Integer num_visite___gt) {
            this.num_visite___gt = num_visite___gt;
            return this;
        }

        public Builder setNum_visite___gte(Integer num_visite___gte) {
            this.num_visite___gte = num_visite___gte;
            return this;
        }

        public Builder setPaziente_ico___eq(String paziente_ico___eq) {
            this.paziente_ico___eq = paziente_ico___eq;
            return this;
        }

        public Builder setPaziente_ico___ne(String paziente_ico___ne) {
            this.paziente_ico___ne = paziente_ico___ne;
            return this;
        }

        public Builder setPaziente_ico___null(Boolean paziente_ico___null) {
            this.paziente_ico___null = paziente_ico___null;
            return this;
        }

        public Builder setPaziente_ico___not___null(Boolean paziente_ico___not___null) {
            this.paziente_ico___not___null = paziente_ico___not___null;
            return this;
        }

        public Builder setPaziente_ico___in(java.util.List<String> paziente_ico___in) {
            this.paziente_ico___in = paziente_ico___in;
            return this;
        }

        public Builder setPaziente_ico___not___in(java.util.List<String> paziente_ico___not___in) {
            this.paziente_ico___not___in = paziente_ico___not___in;
            return this;
        }

        public Builder setPaziente_ico___lt(String paziente_ico___lt) {
            this.paziente_ico___lt = paziente_ico___lt;
            return this;
        }

        public Builder setPaziente_ico___lte(String paziente_ico___lte) {
            this.paziente_ico___lte = paziente_ico___lte;
            return this;
        }

        public Builder setPaziente_ico___gt(String paziente_ico___gt) {
            this.paziente_ico___gt = paziente_ico___gt;
            return this;
        }

        public Builder setPaziente_ico___gte(String paziente_ico___gte) {
            this.paziente_ico___gte = paziente_ico___gte;
            return this;
        }

        public Builder setPaziente_ico___contains(String paziente_ico___contains) {
            this.paziente_ico___contains = paziente_ico___contains;
            return this;
        }

        public Builder setPaziente_ico___not___contains(String paziente_ico___not___contains) {
            this.paziente_ico___not___contains = paziente_ico___not___contains;
            return this;
        }

        public Builder setPaziente_ico___starts_with(String paziente_ico___starts_with) {
            this.paziente_ico___starts_with = paziente_ico___starts_with;
            return this;
        }

        public Builder setPaziente_ico___not___starts_with(String paziente_ico___not___starts_with) {
            this.paziente_ico___not___starts_with = paziente_ico___not___starts_with;
            return this;
        }

        public Builder setPaziente_ico___ends_with(String paziente_ico___ends_with) {
            this.paziente_ico___ends_with = paziente_ico___ends_with;
            return this;
        }

        public Builder setPaziente_ico___not___ends_with(String paziente_ico___not___ends_with) {
            this.paziente_ico___not___ends_with = paziente_ico___not___ends_with;
            return this;
        }

        public Builder setRicovero___eq(Boolean ricovero___eq) {
            this.ricovero___eq = ricovero___eq;
            return this;
        }

        public Builder setRicovero___ne(Boolean ricovero___ne) {
            this.ricovero___ne = ricovero___ne;
            return this;
        }

        public Builder setRicovero___null(Boolean ricovero___null) {
            this.ricovero___null = ricovero___null;
            return this;
        }

        public Builder setRicovero___not___null(Boolean ricovero___not___null) {
            this.ricovero___not___null = ricovero___not___null;
            return this;
        }

        public Builder setSifilide___eq(Boolean sifilide___eq) {
            this.sifilide___eq = sifilide___eq;
            return this;
        }

        public Builder setSifilide___ne(Boolean sifilide___ne) {
            this.sifilide___ne = sifilide___ne;
            return this;
        }

        public Builder setSifilide___null(Boolean sifilide___null) {
            this.sifilide___null = sifilide___null;
            return this;
        }

        public Builder setSifilide___not___null(Boolean sifilide___not___null) {
            this.sifilide___not___null = sifilide___not___null;
            return this;
        }

        public Builder setTipo_visita___eq(String tipo_visita___eq) {
            this.tipo_visita___eq = tipo_visita___eq;
            return this;
        }

        public Builder setTipo_visita___ne(String tipo_visita___ne) {
            this.tipo_visita___ne = tipo_visita___ne;
            return this;
        }

        public Builder setTipo_visita___null(Boolean tipo_visita___null) {
            this.tipo_visita___null = tipo_visita___null;
            return this;
        }

        public Builder setTipo_visita___not___null(Boolean tipo_visita___not___null) {
            this.tipo_visita___not___null = tipo_visita___not___null;
            return this;
        }

        public Builder setTipo_visita___in(java.util.List<String> tipo_visita___in) {
            this.tipo_visita___in = tipo_visita___in;
            return this;
        }

        public Builder setTipo_visita___not___in(java.util.List<String> tipo_visita___not___in) {
            this.tipo_visita___not___in = tipo_visita___not___in;
            return this;
        }

        public Builder setTipo_visita___lt(String tipo_visita___lt) {
            this.tipo_visita___lt = tipo_visita___lt;
            return this;
        }

        public Builder setTipo_visita___lte(String tipo_visita___lte) {
            this.tipo_visita___lte = tipo_visita___lte;
            return this;
        }

        public Builder setTipo_visita___gt(String tipo_visita___gt) {
            this.tipo_visita___gt = tipo_visita___gt;
            return this;
        }

        public Builder setTipo_visita___gte(String tipo_visita___gte) {
            this.tipo_visita___gte = tipo_visita___gte;
            return this;
        }

        public Builder setTipo_visita___contains(String tipo_visita___contains) {
            this.tipo_visita___contains = tipo_visita___contains;
            return this;
        }

        public Builder setTipo_visita___not___contains(String tipo_visita___not___contains) {
            this.tipo_visita___not___contains = tipo_visita___not___contains;
            return this;
        }

        public Builder setTipo_visita___starts_with(String tipo_visita___starts_with) {
            this.tipo_visita___starts_with = tipo_visita___starts_with;
            return this;
        }

        public Builder setTipo_visita___not___starts_with(String tipo_visita___not___starts_with) {
            this.tipo_visita___not___starts_with = tipo_visita___not___starts_with;
            return this;
        }

        public Builder setTipo_visita___ends_with(String tipo_visita___ends_with) {
            this.tipo_visita___ends_with = tipo_visita___ends_with;
            return this;
        }

        public Builder setTipo_visita___not___ends_with(String tipo_visita___not___ends_with) {
            this.tipo_visita___not___ends_with = tipo_visita___not___ends_with;
            return this;
        }

        public Builder setTipo_visita_booster___eq(String tipo_visita_booster___eq) {
            this.tipo_visita_booster___eq = tipo_visita_booster___eq;
            return this;
        }

        public Builder setTipo_visita_booster___ne(String tipo_visita_booster___ne) {
            this.tipo_visita_booster___ne = tipo_visita_booster___ne;
            return this;
        }

        public Builder setTipo_visita_booster___null(Boolean tipo_visita_booster___null) {
            this.tipo_visita_booster___null = tipo_visita_booster___null;
            return this;
        }

        public Builder setTipo_visita_booster___not___null(Boolean tipo_visita_booster___not___null) {
            this.tipo_visita_booster___not___null = tipo_visita_booster___not___null;
            return this;
        }

        public Builder setTipo_visita_booster___in(java.util.List<String> tipo_visita_booster___in) {
            this.tipo_visita_booster___in = tipo_visita_booster___in;
            return this;
        }

        public Builder setTipo_visita_booster___not___in(java.util.List<String> tipo_visita_booster___not___in) {
            this.tipo_visita_booster___not___in = tipo_visita_booster___not___in;
            return this;
        }

        public Builder setTipo_visita_booster___lt(String tipo_visita_booster___lt) {
            this.tipo_visita_booster___lt = tipo_visita_booster___lt;
            return this;
        }

        public Builder setTipo_visita_booster___lte(String tipo_visita_booster___lte) {
            this.tipo_visita_booster___lte = tipo_visita_booster___lte;
            return this;
        }

        public Builder setTipo_visita_booster___gt(String tipo_visita_booster___gt) {
            this.tipo_visita_booster___gt = tipo_visita_booster___gt;
            return this;
        }

        public Builder setTipo_visita_booster___gte(String tipo_visita_booster___gte) {
            this.tipo_visita_booster___gte = tipo_visita_booster___gte;
            return this;
        }

        public Builder setTipo_visita_booster___contains(String tipo_visita_booster___contains) {
            this.tipo_visita_booster___contains = tipo_visita_booster___contains;
            return this;
        }

        public Builder setTipo_visita_booster___not___contains(String tipo_visita_booster___not___contains) {
            this.tipo_visita_booster___not___contains = tipo_visita_booster___not___contains;
            return this;
        }

        public Builder setTipo_visita_booster___starts_with(String tipo_visita_booster___starts_with) {
            this.tipo_visita_booster___starts_with = tipo_visita_booster___starts_with;
            return this;
        }

        public Builder setTipo_visita_booster___not___starts_with(String tipo_visita_booster___not___starts_with) {
            this.tipo_visita_booster___not___starts_with = tipo_visita_booster___not___starts_with;
            return this;
        }

        public Builder setTipo_visita_booster___ends_with(String tipo_visita_booster___ends_with) {
            this.tipo_visita_booster___ends_with = tipo_visita_booster___ends_with;
            return this;
        }

        public Builder setTipo_visita_booster___not___ends_with(String tipo_visita_booster___not___ends_with) {
            this.tipo_visita_booster___not___ends_with = tipo_visita_booster___not___ends_with;
            return this;
        }

        public Builder setVac_mvabn_22_23___eq(String vac_mvabn_22_23___eq) {
            this.vac_mvabn_22_23___eq = vac_mvabn_22_23___eq;
            return this;
        }

        public Builder setVac_mvabn_22_23___ne(String vac_mvabn_22_23___ne) {
            this.vac_mvabn_22_23___ne = vac_mvabn_22_23___ne;
            return this;
        }

        public Builder setVac_mvabn_22_23___null(Boolean vac_mvabn_22_23___null) {
            this.vac_mvabn_22_23___null = vac_mvabn_22_23___null;
            return this;
        }

        public Builder setVac_mvabn_22_23___not___null(Boolean vac_mvabn_22_23___not___null) {
            this.vac_mvabn_22_23___not___null = vac_mvabn_22_23___not___null;
            return this;
        }

        public Builder setVac_mvabn_22_23___in(java.util.List<String> vac_mvabn_22_23___in) {
            this.vac_mvabn_22_23___in = vac_mvabn_22_23___in;
            return this;
        }

        public Builder setVac_mvabn_22_23___not___in(java.util.List<String> vac_mvabn_22_23___not___in) {
            this.vac_mvabn_22_23___not___in = vac_mvabn_22_23___not___in;
            return this;
        }

        public Builder setVac_mvabn_22_23___lt(String vac_mvabn_22_23___lt) {
            this.vac_mvabn_22_23___lt = vac_mvabn_22_23___lt;
            return this;
        }

        public Builder setVac_mvabn_22_23___lte(String vac_mvabn_22_23___lte) {
            this.vac_mvabn_22_23___lte = vac_mvabn_22_23___lte;
            return this;
        }

        public Builder setVac_mvabn_22_23___gt(String vac_mvabn_22_23___gt) {
            this.vac_mvabn_22_23___gt = vac_mvabn_22_23___gt;
            return this;
        }

        public Builder setVac_mvabn_22_23___gte(String vac_mvabn_22_23___gte) {
            this.vac_mvabn_22_23___gte = vac_mvabn_22_23___gte;
            return this;
        }

        public Builder setVac_mvabn_22_23___contains(String vac_mvabn_22_23___contains) {
            this.vac_mvabn_22_23___contains = vac_mvabn_22_23___contains;
            return this;
        }

        public Builder setVac_mvabn_22_23___not___contains(String vac_mvabn_22_23___not___contains) {
            this.vac_mvabn_22_23___not___contains = vac_mvabn_22_23___not___contains;
            return this;
        }

        public Builder setVac_mvabn_22_23___starts_with(String vac_mvabn_22_23___starts_with) {
            this.vac_mvabn_22_23___starts_with = vac_mvabn_22_23___starts_with;
            return this;
        }

        public Builder setVac_mvabn_22_23___not___starts_with(String vac_mvabn_22_23___not___starts_with) {
            this.vac_mvabn_22_23___not___starts_with = vac_mvabn_22_23___not___starts_with;
            return this;
        }

        public Builder setVac_mvabn_22_23___ends_with(String vac_mvabn_22_23___ends_with) {
            this.vac_mvabn_22_23___ends_with = vac_mvabn_22_23___ends_with;
            return this;
        }

        public Builder setVac_mvabn_22_23___not___ends_with(String vac_mvabn_22_23___not___ends_with) {
            this.vac_mvabn_22_23___not___ends_with = vac_mvabn_22_23___not___ends_with;
            return this;
        }

        public Builder setVac_vaiolo_pre___eq(String vac_vaiolo_pre___eq) {
            this.vac_vaiolo_pre___eq = vac_vaiolo_pre___eq;
            return this;
        }

        public Builder setVac_vaiolo_pre___ne(String vac_vaiolo_pre___ne) {
            this.vac_vaiolo_pre___ne = vac_vaiolo_pre___ne;
            return this;
        }

        public Builder setVac_vaiolo_pre___null(Boolean vac_vaiolo_pre___null) {
            this.vac_vaiolo_pre___null = vac_vaiolo_pre___null;
            return this;
        }

        public Builder setVac_vaiolo_pre___not___null(Boolean vac_vaiolo_pre___not___null) {
            this.vac_vaiolo_pre___not___null = vac_vaiolo_pre___not___null;
            return this;
        }

        public Builder setVac_vaiolo_pre___in(java.util.List<String> vac_vaiolo_pre___in) {
            this.vac_vaiolo_pre___in = vac_vaiolo_pre___in;
            return this;
        }

        public Builder setVac_vaiolo_pre___not___in(java.util.List<String> vac_vaiolo_pre___not___in) {
            this.vac_vaiolo_pre___not___in = vac_vaiolo_pre___not___in;
            return this;
        }

        public Builder setVac_vaiolo_pre___lt(String vac_vaiolo_pre___lt) {
            this.vac_vaiolo_pre___lt = vac_vaiolo_pre___lt;
            return this;
        }

        public Builder setVac_vaiolo_pre___lte(String vac_vaiolo_pre___lte) {
            this.vac_vaiolo_pre___lte = vac_vaiolo_pre___lte;
            return this;
        }

        public Builder setVac_vaiolo_pre___gt(String vac_vaiolo_pre___gt) {
            this.vac_vaiolo_pre___gt = vac_vaiolo_pre___gt;
            return this;
        }

        public Builder setVac_vaiolo_pre___gte(String vac_vaiolo_pre___gte) {
            this.vac_vaiolo_pre___gte = vac_vaiolo_pre___gte;
            return this;
        }

        public Builder setVac_vaiolo_pre___contains(String vac_vaiolo_pre___contains) {
            this.vac_vaiolo_pre___contains = vac_vaiolo_pre___contains;
            return this;
        }

        public Builder setVac_vaiolo_pre___not___contains(String vac_vaiolo_pre___not___contains) {
            this.vac_vaiolo_pre___not___contains = vac_vaiolo_pre___not___contains;
            return this;
        }

        public Builder setVac_vaiolo_pre___starts_with(String vac_vaiolo_pre___starts_with) {
            this.vac_vaiolo_pre___starts_with = vac_vaiolo_pre___starts_with;
            return this;
        }

        public Builder setVac_vaiolo_pre___not___starts_with(String vac_vaiolo_pre___not___starts_with) {
            this.vac_vaiolo_pre___not___starts_with = vac_vaiolo_pre___not___starts_with;
            return this;
        }

        public Builder setVac_vaiolo_pre___ends_with(String vac_vaiolo_pre___ends_with) {
            this.vac_vaiolo_pre___ends_with = vac_vaiolo_pre___ends_with;
            return this;
        }

        public Builder setVac_vaiolo_pre___not___ends_with(String vac_vaiolo_pre___not___ends_with) {
            this.vac_vaiolo_pre___not___ends_with = vac_vaiolo_pre___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliVisita_mpvFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliVisita_mpvFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliVisita_mpvFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliVisita_mpvFilterDTO build() {
            CliVisita_mpvFilterDTO result = new CliVisita_mpvFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
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
            result.setArruolamento___eq(this.arruolamento___eq);
            result.setArruolamento___ne(this.arruolamento___ne);
            result.setArruolamento___null(this.arruolamento___null);
            result.setArruolamento___not___null(this.arruolamento___not___null);
            result.setArruolamento_effettuato___eq(this.arruolamento_effettuato___eq);
            result.setArruolamento_effettuato___ne(this.arruolamento_effettuato___ne);
            result.setArruolamento_effettuato___null(this.arruolamento_effettuato___null);
            result.setArruolamento_effettuato___not___null(this.arruolamento_effettuato___not___null);
            result.setCd4_vaccinazione___eq(this.cd4_vaccinazione___eq);
            result.setCd4_vaccinazione___ne(this.cd4_vaccinazione___ne);
            result.setCd4_vaccinazione___null(this.cd4_vaccinazione___null);
            result.setCd4_vaccinazione___not___null(this.cd4_vaccinazione___not___null);
            result.setCd4_vaccinazione___in(this.cd4_vaccinazione___in);
            result.setCd4_vaccinazione___not___in(this.cd4_vaccinazione___not___in);
            result.setCd4_vaccinazione___lt(this.cd4_vaccinazione___lt);
            result.setCd4_vaccinazione___lte(this.cd4_vaccinazione___lte);
            result.setCd4_vaccinazione___gt(this.cd4_vaccinazione___gt);
            result.setCd4_vaccinazione___gte(this.cd4_vaccinazione___gte);
            result.setCentro_prov___eq(this.centro_prov___eq);
            result.setCentro_prov___ne(this.centro_prov___ne);
            result.setCentro_prov___null(this.centro_prov___null);
            result.setCentro_prov___not___null(this.centro_prov___not___null);
            result.setCentro_prov___in(this.centro_prov___in);
            result.setCentro_prov___not___in(this.centro_prov___not___in);
            result.setCentro_prov___lt(this.centro_prov___lt);
            result.setCentro_prov___lte(this.centro_prov___lte);
            result.setCentro_prov___gt(this.centro_prov___gt);
            result.setCentro_prov___gte(this.centro_prov___gte);
            result.setCentro_prov___contains(this.centro_prov___contains);
            result.setCentro_prov___not___contains(this.centro_prov___not___contains);
            result.setCentro_prov___starts_with(this.centro_prov___starts_with);
            result.setCentro_prov___not___starts_with(this.centro_prov___not___starts_with);
            result.setCentro_prov___ends_with(this.centro_prov___ends_with);
            result.setCentro_prov___not___ends_with(this.centro_prov___not___ends_with);
            result.setChemsex___eq(this.chemsex___eq);
            result.setChemsex___ne(this.chemsex___ne);
            result.setChemsex___null(this.chemsex___null);
            result.setChemsex___not___null(this.chemsex___not___null);
            result.setChlamydia___eq(this.chlamydia___eq);
            result.setChlamydia___ne(this.chlamydia___ne);
            result.setChlamydia___null(this.chlamydia___null);
            result.setChlamydia___not___null(this.chlamydia___not___null);
            result.setContatti_mpox___eq(this.contatti_mpox___eq);
            result.setContatti_mpox___ne(this.contatti_mpox___ne);
            result.setContatti_mpox___null(this.contatti_mpox___null);
            result.setContatti_mpox___not___null(this.contatti_mpox___not___null);
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
            result.setData_chlamydia___eq(this.data_chlamydia___eq);
            result.setData_chlamydia___ne(this.data_chlamydia___ne);
            result.setData_chlamydia___null(this.data_chlamydia___null);
            result.setData_chlamydia___not___null(this.data_chlamydia___not___null);
            result.setData_chlamydia___in(this.data_chlamydia___in);
            result.setData_chlamydia___not___in(this.data_chlamydia___not___in);
            result.setData_chlamydia___lt(this.data_chlamydia___lt);
            result.setData_chlamydia___lte(this.data_chlamydia___lte);
            result.setData_chlamydia___gt(this.data_chlamydia___gt);
            result.setData_chlamydia___gte(this.data_chlamydia___gte);
            result.setData_contatto_mpox___eq(this.data_contatto_mpox___eq);
            result.setData_contatto_mpox___ne(this.data_contatto_mpox___ne);
            result.setData_contatto_mpox___null(this.data_contatto_mpox___null);
            result.setData_contatto_mpox___not___null(this.data_contatto_mpox___not___null);
            result.setData_contatto_mpox___in(this.data_contatto_mpox___in);
            result.setData_contatto_mpox___not___in(this.data_contatto_mpox___not___in);
            result.setData_contatto_mpox___lt(this.data_contatto_mpox___lt);
            result.setData_contatto_mpox___lte(this.data_contatto_mpox___lte);
            result.setData_contatto_mpox___gt(this.data_contatto_mpox___gt);
            result.setData_contatto_mpox___gte(this.data_contatto_mpox___gte);
            result.setData_gonorrea___eq(this.data_gonorrea___eq);
            result.setData_gonorrea___ne(this.data_gonorrea___ne);
            result.setData_gonorrea___null(this.data_gonorrea___null);
            result.setData_gonorrea___not___null(this.data_gonorrea___not___null);
            result.setData_gonorrea___in(this.data_gonorrea___in);
            result.setData_gonorrea___not___in(this.data_gonorrea___not___in);
            result.setData_gonorrea___lt(this.data_gonorrea___lt);
            result.setData_gonorrea___lte(this.data_gonorrea___lte);
            result.setData_gonorrea___gt(this.data_gonorrea___gt);
            result.setData_gonorrea___gte(this.data_gonorrea___gte);
            result.setData_hpv___eq(this.data_hpv___eq);
            result.setData_hpv___ne(this.data_hpv___ne);
            result.setData_hpv___null(this.data_hpv___null);
            result.setData_hpv___not___null(this.data_hpv___not___null);
            result.setData_hpv___in(this.data_hpv___in);
            result.setData_hpv___not___in(this.data_hpv___not___in);
            result.setData_hpv___lt(this.data_hpv___lt);
            result.setData_hpv___lte(this.data_hpv___lte);
            result.setData_hpv___gt(this.data_hpv___gt);
            result.setData_hpv___gte(this.data_hpv___gte);
            result.setData_mvabn_pre1___eq(this.data_mvabn_pre1___eq);
            result.setData_mvabn_pre1___ne(this.data_mvabn_pre1___ne);
            result.setData_mvabn_pre1___null(this.data_mvabn_pre1___null);
            result.setData_mvabn_pre1___not___null(this.data_mvabn_pre1___not___null);
            result.setData_mvabn_pre1___in(this.data_mvabn_pre1___in);
            result.setData_mvabn_pre1___not___in(this.data_mvabn_pre1___not___in);
            result.setData_mvabn_pre1___lt(this.data_mvabn_pre1___lt);
            result.setData_mvabn_pre1___lte(this.data_mvabn_pre1___lte);
            result.setData_mvabn_pre1___gt(this.data_mvabn_pre1___gt);
            result.setData_mvabn_pre1___gte(this.data_mvabn_pre1___gte);
            result.setData_mvabn_pre2___eq(this.data_mvabn_pre2___eq);
            result.setData_mvabn_pre2___ne(this.data_mvabn_pre2___ne);
            result.setData_mvabn_pre2___null(this.data_mvabn_pre2___null);
            result.setData_mvabn_pre2___not___null(this.data_mvabn_pre2___not___null);
            result.setData_mvabn_pre2___in(this.data_mvabn_pre2___in);
            result.setData_mvabn_pre2___not___in(this.data_mvabn_pre2___not___in);
            result.setData_mvabn_pre2___lt(this.data_mvabn_pre2___lt);
            result.setData_mvabn_pre2___lte(this.data_mvabn_pre2___lte);
            result.setData_mvabn_pre2___gt(this.data_mvabn_pre2___gt);
            result.setData_mvabn_pre2___gte(this.data_mvabn_pre2___gte);
            result.setData_sifilide___eq(this.data_sifilide___eq);
            result.setData_sifilide___ne(this.data_sifilide___ne);
            result.setData_sifilide___null(this.data_sifilide___null);
            result.setData_sifilide___not___null(this.data_sifilide___not___null);
            result.setData_sifilide___in(this.data_sifilide___in);
            result.setData_sifilide___not___in(this.data_sifilide___not___in);
            result.setData_sifilide___lt(this.data_sifilide___lt);
            result.setData_sifilide___lte(this.data_sifilide___lte);
            result.setData_sifilide___gt(this.data_sifilide___gt);
            result.setData_sifilide___gte(this.data_sifilide___gte);
            result.setGonorrea___eq(this.gonorrea___eq);
            result.setGonorrea___ne(this.gonorrea___ne);
            result.setGonorrea___null(this.gonorrea___null);
            result.setGonorrea___not___null(this.gonorrea___not___null);
            result.setGruppo_appartenenza___eq(this.gruppo_appartenenza___eq);
            result.setGruppo_appartenenza___ne(this.gruppo_appartenenza___ne);
            result.setGruppo_appartenenza___null(this.gruppo_appartenenza___null);
            result.setGruppo_appartenenza___not___null(this.gruppo_appartenenza___not___null);
            result.setGruppo_appartenenza___in(this.gruppo_appartenenza___in);
            result.setGruppo_appartenenza___not___in(this.gruppo_appartenenza___not___in);
            result.setGruppo_appartenenza___lt(this.gruppo_appartenenza___lt);
            result.setGruppo_appartenenza___lte(this.gruppo_appartenenza___lte);
            result.setGruppo_appartenenza___gt(this.gruppo_appartenenza___gt);
            result.setGruppo_appartenenza___gte(this.gruppo_appartenenza___gte);
            result.setGruppo_appartenenza___contains(this.gruppo_appartenenza___contains);
            result.setGruppo_appartenenza___not___contains(this.gruppo_appartenenza___not___contains);
            result.setGruppo_appartenenza___starts_with(this.gruppo_appartenenza___starts_with);
            result.setGruppo_appartenenza___not___starts_with(this.gruppo_appartenenza___not___starts_with);
            result.setGruppo_appartenenza___ends_with(this.gruppo_appartenenza___ends_with);
            result.setGruppo_appartenenza___not___ends_with(this.gruppo_appartenenza___not___ends_with);
            result.setHiv___eq(this.hiv___eq);
            result.setHiv___ne(this.hiv___ne);
            result.setHiv___null(this.hiv___null);
            result.setHiv___not___null(this.hiv___not___null);
            result.setHivrna_vaccinazione___eq(this.hivrna_vaccinazione___eq);
            result.setHivrna_vaccinazione___ne(this.hivrna_vaccinazione___ne);
            result.setHivrna_vaccinazione___null(this.hivrna_vaccinazione___null);
            result.setHivrna_vaccinazione___not___null(this.hivrna_vaccinazione___not___null);
            result.setHivrna_vaccinazione___in(this.hivrna_vaccinazione___in);
            result.setHivrna_vaccinazione___not___in(this.hivrna_vaccinazione___not___in);
            result.setHivrna_vaccinazione___lt(this.hivrna_vaccinazione___lt);
            result.setHivrna_vaccinazione___lte(this.hivrna_vaccinazione___lte);
            result.setHivrna_vaccinazione___gt(this.hivrna_vaccinazione___gt);
            result.setHivrna_vaccinazione___gte(this.hivrna_vaccinazione___gte);
            result.setHpv___eq(this.hpv___eq);
            result.setHpv___ne(this.hpv___ne);
            result.setHpv___null(this.hpv___null);
            result.setHpv___not___null(this.hpv___not___null);
            result.setMst___eq(this.mst___eq);
            result.setMst___ne(this.mst___ne);
            result.setMst___null(this.mst___null);
            result.setMst___not___null(this.mst___not___null);
            result.setNote_ricovero___eq(this.note_ricovero___eq);
            result.setNote_ricovero___ne(this.note_ricovero___ne);
            result.setNote_ricovero___null(this.note_ricovero___null);
            result.setNote_ricovero___not___null(this.note_ricovero___not___null);
            result.setNote_ricovero___in(this.note_ricovero___in);
            result.setNote_ricovero___not___in(this.note_ricovero___not___in);
            result.setNote_ricovero___lt(this.note_ricovero___lt);
            result.setNote_ricovero___lte(this.note_ricovero___lte);
            result.setNote_ricovero___gt(this.note_ricovero___gt);
            result.setNote_ricovero___gte(this.note_ricovero___gte);
            result.setNote_ricovero___contains(this.note_ricovero___contains);
            result.setNote_ricovero___not___contains(this.note_ricovero___not___contains);
            result.setNote_ricovero___starts_with(this.note_ricovero___starts_with);
            result.setNote_ricovero___not___starts_with(this.note_ricovero___not___starts_with);
            result.setNote_ricovero___ends_with(this.note_ricovero___ends_with);
            result.setNote_ricovero___not___ends_with(this.note_ricovero___not___ends_with);
            result.setNum_dosi_mvabn___eq(this.num_dosi_mvabn___eq);
            result.setNum_dosi_mvabn___ne(this.num_dosi_mvabn___ne);
            result.setNum_dosi_mvabn___null(this.num_dosi_mvabn___null);
            result.setNum_dosi_mvabn___not___null(this.num_dosi_mvabn___not___null);
            result.setNum_dosi_mvabn___in(this.num_dosi_mvabn___in);
            result.setNum_dosi_mvabn___not___in(this.num_dosi_mvabn___not___in);
            result.setNum_dosi_mvabn___lt(this.num_dosi_mvabn___lt);
            result.setNum_dosi_mvabn___lte(this.num_dosi_mvabn___lte);
            result.setNum_dosi_mvabn___gt(this.num_dosi_mvabn___gt);
            result.setNum_dosi_mvabn___gte(this.num_dosi_mvabn___gte);
            result.setNum_visite___eq(this.num_visite___eq);
            result.setNum_visite___ne(this.num_visite___ne);
            result.setNum_visite___null(this.num_visite___null);
            result.setNum_visite___not___null(this.num_visite___not___null);
            result.setNum_visite___in(this.num_visite___in);
            result.setNum_visite___not___in(this.num_visite___not___in);
            result.setNum_visite___lt(this.num_visite___lt);
            result.setNum_visite___lte(this.num_visite___lte);
            result.setNum_visite___gt(this.num_visite___gt);
            result.setNum_visite___gte(this.num_visite___gte);
            result.setPaziente_ico___eq(this.paziente_ico___eq);
            result.setPaziente_ico___ne(this.paziente_ico___ne);
            result.setPaziente_ico___null(this.paziente_ico___null);
            result.setPaziente_ico___not___null(this.paziente_ico___not___null);
            result.setPaziente_ico___in(this.paziente_ico___in);
            result.setPaziente_ico___not___in(this.paziente_ico___not___in);
            result.setPaziente_ico___lt(this.paziente_ico___lt);
            result.setPaziente_ico___lte(this.paziente_ico___lte);
            result.setPaziente_ico___gt(this.paziente_ico___gt);
            result.setPaziente_ico___gte(this.paziente_ico___gte);
            result.setPaziente_ico___contains(this.paziente_ico___contains);
            result.setPaziente_ico___not___contains(this.paziente_ico___not___contains);
            result.setPaziente_ico___starts_with(this.paziente_ico___starts_with);
            result.setPaziente_ico___not___starts_with(this.paziente_ico___not___starts_with);
            result.setPaziente_ico___ends_with(this.paziente_ico___ends_with);
            result.setPaziente_ico___not___ends_with(this.paziente_ico___not___ends_with);
            result.setRicovero___eq(this.ricovero___eq);
            result.setRicovero___ne(this.ricovero___ne);
            result.setRicovero___null(this.ricovero___null);
            result.setRicovero___not___null(this.ricovero___not___null);
            result.setSifilide___eq(this.sifilide___eq);
            result.setSifilide___ne(this.sifilide___ne);
            result.setSifilide___null(this.sifilide___null);
            result.setSifilide___not___null(this.sifilide___not___null);
            result.setTipo_visita___eq(this.tipo_visita___eq);
            result.setTipo_visita___ne(this.tipo_visita___ne);
            result.setTipo_visita___null(this.tipo_visita___null);
            result.setTipo_visita___not___null(this.tipo_visita___not___null);
            result.setTipo_visita___in(this.tipo_visita___in);
            result.setTipo_visita___not___in(this.tipo_visita___not___in);
            result.setTipo_visita___lt(this.tipo_visita___lt);
            result.setTipo_visita___lte(this.tipo_visita___lte);
            result.setTipo_visita___gt(this.tipo_visita___gt);
            result.setTipo_visita___gte(this.tipo_visita___gte);
            result.setTipo_visita___contains(this.tipo_visita___contains);
            result.setTipo_visita___not___contains(this.tipo_visita___not___contains);
            result.setTipo_visita___starts_with(this.tipo_visita___starts_with);
            result.setTipo_visita___not___starts_with(this.tipo_visita___not___starts_with);
            result.setTipo_visita___ends_with(this.tipo_visita___ends_with);
            result.setTipo_visita___not___ends_with(this.tipo_visita___not___ends_with);
            result.setTipo_visita_booster___eq(this.tipo_visita_booster___eq);
            result.setTipo_visita_booster___ne(this.tipo_visita_booster___ne);
            result.setTipo_visita_booster___null(this.tipo_visita_booster___null);
            result.setTipo_visita_booster___not___null(this.tipo_visita_booster___not___null);
            result.setTipo_visita_booster___in(this.tipo_visita_booster___in);
            result.setTipo_visita_booster___not___in(this.tipo_visita_booster___not___in);
            result.setTipo_visita_booster___lt(this.tipo_visita_booster___lt);
            result.setTipo_visita_booster___lte(this.tipo_visita_booster___lte);
            result.setTipo_visita_booster___gt(this.tipo_visita_booster___gt);
            result.setTipo_visita_booster___gte(this.tipo_visita_booster___gte);
            result.setTipo_visita_booster___contains(this.tipo_visita_booster___contains);
            result.setTipo_visita_booster___not___contains(this.tipo_visita_booster___not___contains);
            result.setTipo_visita_booster___starts_with(this.tipo_visita_booster___starts_with);
            result.setTipo_visita_booster___not___starts_with(this.tipo_visita_booster___not___starts_with);
            result.setTipo_visita_booster___ends_with(this.tipo_visita_booster___ends_with);
            result.setTipo_visita_booster___not___ends_with(this.tipo_visita_booster___not___ends_with);
            result.setVac_mvabn_22_23___eq(this.vac_mvabn_22_23___eq);
            result.setVac_mvabn_22_23___ne(this.vac_mvabn_22_23___ne);
            result.setVac_mvabn_22_23___null(this.vac_mvabn_22_23___null);
            result.setVac_mvabn_22_23___not___null(this.vac_mvabn_22_23___not___null);
            result.setVac_mvabn_22_23___in(this.vac_mvabn_22_23___in);
            result.setVac_mvabn_22_23___not___in(this.vac_mvabn_22_23___not___in);
            result.setVac_mvabn_22_23___lt(this.vac_mvabn_22_23___lt);
            result.setVac_mvabn_22_23___lte(this.vac_mvabn_22_23___lte);
            result.setVac_mvabn_22_23___gt(this.vac_mvabn_22_23___gt);
            result.setVac_mvabn_22_23___gte(this.vac_mvabn_22_23___gte);
            result.setVac_mvabn_22_23___contains(this.vac_mvabn_22_23___contains);
            result.setVac_mvabn_22_23___not___contains(this.vac_mvabn_22_23___not___contains);
            result.setVac_mvabn_22_23___starts_with(this.vac_mvabn_22_23___starts_with);
            result.setVac_mvabn_22_23___not___starts_with(this.vac_mvabn_22_23___not___starts_with);
            result.setVac_mvabn_22_23___ends_with(this.vac_mvabn_22_23___ends_with);
            result.setVac_mvabn_22_23___not___ends_with(this.vac_mvabn_22_23___not___ends_with);
            result.setVac_vaiolo_pre___eq(this.vac_vaiolo_pre___eq);
            result.setVac_vaiolo_pre___ne(this.vac_vaiolo_pre___ne);
            result.setVac_vaiolo_pre___null(this.vac_vaiolo_pre___null);
            result.setVac_vaiolo_pre___not___null(this.vac_vaiolo_pre___not___null);
            result.setVac_vaiolo_pre___in(this.vac_vaiolo_pre___in);
            result.setVac_vaiolo_pre___not___in(this.vac_vaiolo_pre___not___in);
            result.setVac_vaiolo_pre___lt(this.vac_vaiolo_pre___lt);
            result.setVac_vaiolo_pre___lte(this.vac_vaiolo_pre___lte);
            result.setVac_vaiolo_pre___gt(this.vac_vaiolo_pre___gt);
            result.setVac_vaiolo_pre___gte(this.vac_vaiolo_pre___gte);
            result.setVac_vaiolo_pre___contains(this.vac_vaiolo_pre___contains);
            result.setVac_vaiolo_pre___not___contains(this.vac_vaiolo_pre___not___contains);
            result.setVac_vaiolo_pre___starts_with(this.vac_vaiolo_pre___starts_with);
            result.setVac_vaiolo_pre___not___starts_with(this.vac_vaiolo_pre___not___starts_with);
            result.setVac_vaiolo_pre___ends_with(this.vac_vaiolo_pre___ends_with);
            result.setVac_vaiolo_pre___not___ends_with(this.vac_vaiolo_pre___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
